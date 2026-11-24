package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class o720 extends w46 {
    public final ctf0 b;
    public final p7m0 c;

    public o720(yfu yfuVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = q7m0.a(k720.f17798a);
        hie0 hie0Var = new hie0();
        hie0Var.f13108a = true;
        ewt ewtVar = new ewt(yfuVar.d(), hie0Var, (byte) 26);
        yje yjeVar = null;
        byte b = 5;
        sac.T(new fnq(ewtVar, new xr10(this, yjeVar, b), (byte) 4), jiu0.a(this), new z210(this, yjeVar, b));
    }

    public final l720 w(double d, String str, jg7 jg7Var) {
        if (jg7Var.d) {
            return new f720(jg7Var);
        }
        double d2 = jg7Var.f16467a;
        if (d < d2) {
            return new h720(str, jg7Var);
        }
        if (d > d2) {
            return new g720(str, jg7Var);
        }
        if (d == d2) {
            return new i720(jg7Var);
        }
        return new j720(this.b.f(R.string.error_something_went_wrong, new Object[0]));
    }
}
