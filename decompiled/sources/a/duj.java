package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class duj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eyg0 f6698a;
    public final ctf0 b;

    public duj(eyg0 eyg0Var, ctf0 ctf0Var) {
        this.f6698a = eyg0Var;
        this.b = ctf0Var;
    }

    public final void a(Throwable th) {
        th.getClass();
        b(th, new zuh((byte) 21));
    }

    public final void b(Throwable th, Function2 function2) {
        th.getClass();
        th.printStackTrace();
        if (th instanceof yxw) {
            String message = th.getMessage();
            if (message != null) {
                System.out.println((Object) message);
                return;
            }
            return;
        }
        boolean z = th instanceof u660;
        eyg0 eyg0Var = this.f6698a;
        if (z) {
            eyg0Var.m(new mu00(true, true));
            return;
        }
        if ((th instanceof j7t0) || (th instanceof i660)) {
            eyg0Var.m(new mu00(false, true));
            return;
        }
        if (th instanceof o14) {
            eyg0Var.m(new mu00(true, false));
            return;
        }
        if (th instanceof fpd0) {
            eyg0Var.m(ou00.f25854a);
            return;
        }
        if (th instanceof mki0) {
            eyg0Var.m(new tu00(((mki0) th).f21946a));
            return;
        }
        if (th instanceof qtj) {
            eyg0Var.m(pu00.f27589a);
            return;
        }
        if (th instanceof kcy) {
            function2.invoke(new ss3(), ((kcy) th).f35453a);
            return;
        }
        boolean z2 = th instanceof zhi0;
        ctf0 ctf0Var = this.b;
        if (!z2) {
            function2.invoke(th, jwb.G(th, ctf0Var));
            return;
        }
        zhi0 zhi0Var = (zhi0) th;
        kuw kuwVar = zhi0Var.c;
        if (kuwVar == i2o.NeedToConfirmEula) {
            d();
        } else if (kuwVar == i2o.IdentificationNotPassed2) {
            eyg0Var.m(new nu00(jwb.G(zhi0Var, ctf0Var)));
        } else {
            function2.invoke(th, jwb.G(th, ctf0Var));
        }
    }

    public final void c(String str) {
        str.getClass();
        this.f6698a.m(new nu00(str));
    }

    public final void d() {
        this.f6698a.m(su00.f32798a);
    }
}
