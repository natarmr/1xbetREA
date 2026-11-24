package a;

import android.content.ComponentCallbacks2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tsq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34473a;
    public final /* synthetic */ xsq0 b;

    public /* synthetic */ tsq0(xsq0 xsq0Var, byte b) {
        this.f34473a = b;
        this.b = xsq0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34473a;
        xsq0 xsq0Var = this.b;
        switch (b) {
            case 0:
                y2m0 y2m0Var = xsq0.P1;
                usq0 usq0Var = new usq0(xsq0Var, (byte) 1);
                l7p0 l7p0Var = new l7p0(xsq0Var, (byte) 29);
                byte b2 = 2;
                usq0 usq0Var2 = new usq0(xsq0Var, b2);
                byte b3 = 3;
                usq0 usq0Var3 = new usq0(xsq0Var, b3);
                byte b4 = 4;
                usq0 usq0Var4 = new usq0(xsq0Var, b4);
                cym0 cym0Var = new cym0(0, xsq0Var.H0(), xtq0.class, "onEndCallClicked", "onEndCallClicked()V", 0, (byte) 16);
                orq0 orq0Var = new orq0();
                gbn gbnVarS = ccq0.S(usq0Var);
                dp dpVar = orq0Var.d;
                dpVar.b(gbnVarS);
                dpVar.b(cwr0.O(usq0Var));
                dpVar.b(zjb.B(usq0Var));
                dpVar.b(ofm0.p(usq0Var));
                dpVar.b(bfb.P(usq0Var));
                byte b5 = 19;
                dpVar.b(new gbn(new sfc((byte) 19), new tad(b3, b4), new trb(usq0Var, (byte) 20), qja.o));
                dpVar.b(new gbn(new sfc((byte) 17), new tad(b3, b2), new trb(usq0Var, (byte) 18), qja.m));
                dpVar.b(new gbn(new sfc((byte) 18), new tad(b3, b3), new trb(usq0Var, b5), qja.n));
                dpVar.b(m7x.G(usq0Var));
                dpVar.b(pym0.h(usq0Var));
                dpVar.b(new gbn(new shq0((byte) 10), new d8q0(b3, (byte) 7), new b8q0((Object) usq0Var, (Object) cym0Var, (byte) 11), pfo0.p));
                dpVar.b(ro4.X(usq0Var));
                dpVar.b(pym0.k(usq0Var, l7p0Var));
                dpVar.b(m7x.L(usq0Var2));
                dpVar.b(ihm0.m(usq0Var3));
                dpVar.b(zcm0.l(usq0Var));
                byte b6 = 8;
                dpVar.b(new gbn(new shq0(b6), new d8q0(b3, (byte) 5), new t6q0(b5), pfo0.n));
                dpVar.b(ny9.R(usq0Var4));
                dpVar.b(new gbn(new sfc((byte) 16), new tad(b3, (byte) 1), new trb(usq0Var, (byte) 17), qja.l));
                dpVar.b(new gbn(new sfc((byte) 23), new tad(b3, b6), new trb(usq0Var, (byte) 22), qja.s));
                dpVar.b(new gbn(new sfc((byte) 21), new tad(b3, (byte) 6), new trb(usq0Var, (byte) 21), qja.q));
                return orq0Var;
            case 1:
                y2m0 y2m0Var2 = xsq0.P1;
                ComponentCallbacks2 application = xsq0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(o9.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof o9)) {
                        ze3Var = null;
                    }
                    o9 o9Var = (o9) ze3Var;
                    if (o9Var != null) {
                        return o9Var.a(a4n0.f(xsq0Var), false);
                    }
                }
                jf4.n(b1j.i(o9.class, "Cannot create dependency "));
                return null;
            default:
                y2m0 y2m0Var3 = xsq0.P1;
                return (q5i) ((s5i) xsq0Var.N1.getValue()).z.get();
        }
    }
}
