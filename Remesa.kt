fun remesaTipo1 (CantEnv:Double)
{
    var CantRec = 0.0
    var Comision = 0.0
    var ITF = 0.0

    if(CantEnv <= 1000.00)
    {
        Comision = 5.00
        //Ya que se descuenta de cada 1000 en este caso solo se descontara si es exactamente 1000
        if(CantEnv == 1000.00) ITF = CantEnv * 0.00005
        CantRec = CantEnv - Comision - ITF
    }

    if(CantEnv > 1000.00 && CantEnv <= 10001.0)
    {
        Comision = CantEnv * 0.005
        //El ITF se descuenta por cada 1000 por lo tanto la cantidad inicial siempre es la misma
        //la diferencia seria en contar cuantos 1000 hay en los datos ingresados
        ITF = (0.05 * (CantEnv / 1000.0).toInt()).toDouble()
        CantRec = CantEnv - Comision - ITF
    }

    if(CantEnv > 10001.0)
    {
        Comision = CantEnv * 0.015
        ITF = (0.05 * (CantEnv / 1000.0).toInt()).toDouble()
        CantRec = CantEnv - Comision - ITF
    }
    println ("ASUMIENDO QUE EL ITF SE DESCUENTA POR CADA S/ 1000")
    println ("La comision es de: S/ " + Comision)
    println ("El ITF es de: S/ " + ITF)
    println ("La cantidad recibida es de: S/ " + CantRec)
}



fun remesaTipo2 (CantEnv:Double)
{
    var CantRec = 0.0
    var Comision = 0.0
    var ITF = 0.0

    if(CantEnv <= 1000.00)
    {
        Comision = 5.00
        ITF = CantEnv * 0.00005
        CantRec = CantEnv - Comision - ITF
    }

    if(CantEnv > 1000.00 && CantEnv <= 10001.0)
    {
        Comision = CantEnv * 0.005
        ITF = CantEnv * 0.00005
        CantRec = CantEnv - Comision - ITF
    }

    if(CantEnv > 10001.0)
    {
        Comision = CantEnv * 0.015
        ITF = CantEnv * 0.00005
        CantRec = CantEnv - Comision - ITF
    }

    println ("ASUMIENDO QUE EL ITF SE DESCUENTA INDEPENDIENTEMENTE DE LA CANTIDAD")
    println ("La comision es de: S/ " + Comision)
    println ("El ITF es de: S/ " + ITF)
    println ("La cantidad recibida es de: S/ " + CantRec)
}


fun main()
{
    val cantidad = 8600.0
    remesaTipo1(cantidad)
    println()
    remesaTipo2(cantidad)
}