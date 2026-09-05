fun remesa (CantEnv:Double)
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
        ITF = (5 * (CantEnv / 1000.0).toInt()).toDouble()
        CantRec = CantEnv - Comision - ITF
    }

    if(CantEnv > 10001.0)
    {
        Comision = CantEnv * 0.015
        ITF = (5 * (CantEnv / 1000.0).toInt()).toDouble()
        CantRec = CantEnv - Comision - ITF
    }

    println ("La comision es de: S/ " + Comision)
    println ("El ITF es de: S/ " + ITF)
    println ("La cantidad recibida es de: S/ " + CantRec)
}

fun main()
{
    val cantidad = 1500.0
    remesa(cantidad)
}