package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class lm50 implements km50 {
    public final bty c = bty.g;
    public final sf80 d = new sf80(sf80.d);

    public final boolean a(wsy wsyVar, wsy wsyVar2) {
        wsyVar.getClass();
        wsyVar2.getClass();
        return m2a.l(jcb.Y(false, null, this.c, 6), wsyVar.j0(), wsyVar2.j0());
    }

    public final boolean b(wsy wsyVar, wsy wsyVar2) {
        wsyVar.getClass();
        wsyVar2.getClass();
        gys0 gys0VarY = jcb.Y(true, null, this.c, 6);
        yzs0 yzs0Var = gys0VarY.c;
        tft0 tft0VarJ0 = wsyVar.j0();
        tft0 tft0VarJ1 = wsyVar2.j0();
        if (tft0VarJ0 == tft0VarJ1) {
            return true;
        }
        Function2 function2I0 = yzs0Var.i0();
        Boolean bool = function2I0 != null ? (Boolean) function2I0.invoke(tft0VarJ0, tft0VarJ1) : null;
        return bool != null ? bool.booleanValue() : m2a.b.j(gys0VarY, yzs0Var, tft0VarJ0, tft0VarJ1);
    }
}
