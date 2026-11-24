package a;

/* JADX INFO: loaded from: classes5.dex */
public final class dds {
    public static hds a() {
        return new hds("", "", "", jz60.f17395a);
    }

    public static hds b(String str, wz60 wz60Var) {
        str.getClass();
        iz60 iz60Var = lz60.Companion;
        String str2 = wz60Var.g;
        iz60Var.getClass();
        lz60 lz60VarA = iz60.a(str2);
        String strI = ua80.i(str, "/GamesMedia/", String.valueOf(wz60Var.f40009a), "/app/");
        String strConcat = lz60VarA.a().concat(".webp");
        return new hds(kng0.l(strI, "920x610", strConcat), kng0.l(strI, "538x538", strConcat), kng0.l(strI, "538x538-circle", strConcat), lz60VarA);
    }

    public static hds c(String str, i070 i070Var) {
        str.getClass();
        iz60 iz60Var = lz60.Companion;
        String str2 = i070Var.d;
        iz60Var.getClass();
        lz60 lz60VarA = iz60.a(str2);
        String strI = ua80.i(str, "/GamesMedia/", String.valueOf(i070Var.f), "/app/");
        String strConcat = lz60VarA.a().concat(".webp");
        return new hds(kng0.l(strI, "920x610", strConcat), kng0.l(strI, "538x538", strConcat), kng0.l(strI, "538x538-circle", strConcat), lz60VarA);
    }

    public final jiy serializer() {
        return cds.f4176a;
    }
}
