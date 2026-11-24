package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e38 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7121a;
    public final /* synthetic */ h38 b;

    public /* synthetic */ e38(h38 h38Var, byte b) {
        this.f7121a = b;
        this.b = h38Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f7121a;
        h38 h38Var = this.b;
        switch (b) {
            case 0:
                yk5 yk5Var = h38.V1;
                h38 h38Var2 = this.b;
                wdk0 wdk0Var = h38Var2.P1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = h38Var2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), h38Var2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 1:
                yk5 yk5Var2 = h38.V1;
                ComponentCallbacks2 application = h38Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(b38.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof b38)) {
                        ze3Var = null;
                    }
                    b38 b38Var = (b38) ze3Var;
                    if (b38Var != null) {
                        i1w0 i1w0VarF = a4n0.f(h38Var);
                        l38 l38Var = (l38) h38Var.U1.n(h38Var, h38.W1[1]);
                        i1w0VarF.getClass();
                        lef0 lef0Var = b38Var.b;
                        ii iiVar = b38Var.c;
                        nc0 nc0Var = b38Var.d;
                        wdk0 wdk0Var2 = b38Var.e;
                        pp90 pp90Var = b38Var.f1890a;
                        rl70 rl70Var = b38Var.f;
                        pv00 pv00Var = b38Var.g;
                        mi70 mi70Var = b38Var.h;
                        d1p d1pVar = b38Var.i;
                        pp90Var.getClass();
                        d1pVar.getClass();
                        iiVar.getClass();
                        wdk0Var2.getClass();
                        return new iai(nc0Var, lef0Var, pp90Var, pv00Var, d1pVar, i1w0VarF, iiVar, l38Var, wdk0Var2, rl70Var, mi70Var);
                    }
                }
                jf4.n(b1j.i(b38.class, "Cannot create dependency "));
                return null;
            case 2:
                yk5 yk5Var3 = h38.V1;
                return (hai) ((iai) h38Var.Q1.getValue()).l.get();
            case 3:
                yk5 yk5Var4 = h38.V1;
                h38Var.H0().A(jl90.SYSTEM_BACK);
                return Unit.f46060a;
            case 4:
                yk5 yk5Var5 = h38.V1;
                h38Var.H0().A(jl90.BACK);
                return Unit.f46060a;
            default:
                yk5 yk5Var6 = h38.V1;
                p7m0 p7m0Var = h38Var.H0().B;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, v38.a((v38) value, null, null, false, false, null, 251)));
                return Unit.f46060a;
        }
    }
}
