package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xm70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41110a;
    public final /* synthetic */ bn70 b;

    public /* synthetic */ xm70(bn70 bn70Var, byte b) {
        this.f41110a = b;
        this.b = bn70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        String str;
        byte b = this.f41110a;
        yje yjeVar = null;
        bn70 bn70Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = bn70.S1;
                to70 to70VarQ0 = bn70Var.Q0();
                to70VarQ0.w(kle.f18481a);
                to70VarQ0.w(new iy5(to70VarQ0.Q));
                break;
            case 1:
                iiy[] iiyVarArr2 = bn70.S1;
                bn70Var.Q0().F(wn70.f39434a);
                break;
            case 2:
                iiy[] iiyVarArr3 = bn70.S1;
                bn70Var.Q0().A();
                break;
            case 3:
                iiy[] iiyVarArr4 = bn70.S1;
                bn70Var.Q0().z(false);
                break;
            case 4:
                iiy[] iiyVarArr5 = bn70.S1;
                to70 to70VarQ1 = bn70Var.Q0();
                if (!to70VarQ1.I.f15748a.f21021a.a().getBoolean("WEBVIEW_ANIMATION_ENABLE", false)) {
                    in70 in70Var = in70.f15059a;
                    sac.V(jiu0.a(to70VarQ1), new wk60((byte) 23), null, to70VarQ1.g.c, new nf60(to70VarQ1, in70Var, yjeVar, (byte) 26), 10);
                }
                break;
            case 5:
                iiy[] iiyVarArr6 = bn70.S1;
                to70 to70VarQ2 = bn70Var.Q0();
                vcu vcuVar = to70VarQ2.l;
                if ((!to70VarQ2.E.f13587a.f26724a.A || !vcuVar.a().a()) && (to70VarQ2.u.a() || !vcuVar.a().a())) {
                    if (to70VarQ2.x()) {
                        to70VarQ2.F(new co70());
                    } else {
                        if (!to70VarQ2.P.F()) {
                            to70VarQ2.w(new sle(to70VarQ2.n.a()));
                        }
                        to70VarQ2.w(new iy5(csr.e));
                        to70VarQ2.A();
                    }
                }
                break;
            case 6:
                iiy[] iiyVarArr7 = bn70.S1;
                to70 to70VarQ3 = bn70Var.Q0();
                to70VarQ3.getClass();
                sac.h0(jiu0.a(to70VarQ3), "OnexGamesHolderViewModel.onTechnicalDialogGameClick", 1, new lo70(to70VarQ3, yjeVar, (byte) 2), to70VarQ3.g.b, new cd60((Object) to70VarQ3, (byte) 19), new cn70(to70VarQ3, (byte) 0), 20);
                break;
            case 7:
                iiy[] iiyVarArr8 = bn70.S1;
                bn70Var.Q0().z(true);
                break;
            case 8:
                iiy[] iiyVarArr9 = bn70.S1;
                bn70Var.Q0().z(false);
                break;
            case 9:
                iiy[] iiyVarArr10 = bn70.S1;
                bn70Var.Q0().w(uy5.f36473a);
                break;
            default:
                iiy[] iiyVarArr11 = bn70.S1;
                p7m0 p7m0Var = bn70Var.Q0().b0;
                do {
                    value = p7m0Var.getValue();
                    str = ((jn70) value).b;
                    str.getClass();
                } while (!p7m0Var.m(value, new jn70(str, false)));
                break;
        }
        return Unit.f46060a;
    }
}
