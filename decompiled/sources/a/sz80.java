package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.security.impl.presentation.password.change.input_password.PasswordChangeViewModel$ScreenUiState;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sz80 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33059a;
    public final /* synthetic */ xz80 b;

    public /* synthetic */ sz80(xz80 xz80Var, byte b) {
        this.f33059a = b;
        this.b = xz80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f33059a;
        yje yjeVar = null;
        xz80 xz80Var = this.b;
        switch (b) {
            case 0:
                ini iniVar = xz80Var.M1;
                if (iniVar != null) {
                    return new t0h0(iniVar, a4n0.f(xz80Var));
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                xi70 xi70Var = xz80.U1;
                xz80 xz80Var2 = this.b;
                wdk0 wdk0Var = xz80Var2.P1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = xz80Var2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), xz80Var2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 2:
                xi70 xi70Var2 = xz80.U1;
                org.xplatform.security.impl.presentation.password.change.input_password.f fVarH0 = xz80Var.H0();
                if (fVarH0.s) {
                    fVarH0.q = sac.T(new dnq(new fnq(new fnq(new vsg0(new nv(new fnq(aoq.c(new vsg0(new wk70(fVarH0, yjeVar, (byte) 29)), new za60((yje) null, fVarH0, (byte) 6)), new s980(fVarH0, yjeVar, (byte) 4), (byte) 4), yjeVar, (byte) 3)), new z210(fVarH0, yjeVar, (byte) 23)), new zm70((Object) fVarH0, (Object) ((PasswordChangeViewModel$ScreenUiState) fVarH0.n.f40549a.getValue()).getF46956a(), yjeVar, (byte) 25), (byte) 4), new gbv(fVarH0, yjeVar, (byte) 17), (byte) 0), d5c.S(jiu0.a(fVarH0), fVarH0.k.f22085a), new org.xplatform.security.impl.presentation.password.change.input_password.e(fVarH0, null));
                } else {
                    fVarH0.p.f(a090.f16a);
                }
                return Unit.f46060a;
            case 3:
                xi70 xi70Var3 = xz80.U1;
                i1w0 i1w0Var = xz80Var.H0().c;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            default:
                xi70 xi70Var4 = xz80.U1;
                org.xplatform.security.impl.presentation.password.change.input_password.f fVarH1 = xz80Var.H0();
                v3c.N(fVarH1.q);
                p7m0 p7m0Var = fVarH1.m;
                Boolean bool = Boolean.FALSE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                return Unit.f46060a;
        }
    }
}
