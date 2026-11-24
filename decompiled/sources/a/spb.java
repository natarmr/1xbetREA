package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class spb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32583a;
    public final /* synthetic */ xpb b;

    public /* synthetic */ spb(xpb xpbVar, byte b) {
        this.f32583a = b;
        this.b = xpbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32583a;
        yje yjeVar = null;
        xpb xpbVar = this.b;
        switch (b) {
            case 0:
                fci fciVar = xpbVar.M1;
                if (fciVar != null) {
                    return new q0h0(fciVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                gl5 gl5Var = xpb.S1;
                return new vpb(xpbVar);
            case 2:
                gl5 gl5Var2 = xpb.S1;
                eqb eqbVarH0 = xpbVar.H0();
                String strValueOf = String.valueOf(xpbVar.G0().e.getText());
                if (eqbVarH0.z) {
                    eqbVarH0.o.f1455a.a(xun.f41520a, 11360L);
                    eqbVarH0.n.f44322a.c("acc_change_log_input");
                }
                if (eqbVarH0.A(strValueOf)) {
                    byte b2 = 8;
                    byte b3 = 1;
                    eqbVarH0.y = slb.U(new dnq(new dnq(new fnq(new fnq(aoq.c(new vsg0(new nv(new fnq(aoq.c(new vsg0(new bqb(eqbVarH0, yjeVar, (byte) 0)), new zo1(yjeVar, eqbVarH0, b2)), new bqb(eqbVarH0, yjeVar, b3), (byte) 4), yjeVar, b3)), new fe0((yje) null, eqbVarH0, strValueOf)), new aqb(eqbVarH0, yjeVar, b3)), new fob(eqbVarH0, yjeVar, (byte) 3), (byte) 4), new rj((Object) eqbVarH0, yjeVar, (byte) 10), (byte) 1), new e00(eqbVarH0, yjeVar, b2), (byte) 0), d5c.S(jiu0.a(eqbVarH0), eqbVarH0.g.f22085a));
                }
                return Unit.f46060a;
            case 3:
                gl5 gl5Var3 = xpb.S1;
                xpbVar.H0().y();
                return Unit.f46060a;
            case 4:
                gl5 gl5Var4 = xpb.S1;
                eqb eqbVarH1 = xpbVar.H0();
                if (eqbVarH1.z) {
                    eqbVarH1.o.f1455a.a(xun.f41520a, 11361L);
                    eqbVarH1.n.f44322a.c("acc_change_log_done");
                }
                eqbVarH1.y();
                return Unit.f46060a;
            default:
                gl5 gl5Var5 = xpb.S1;
                eqb eqbVarH2 = xpbVar.H0();
                v3c.N(eqbVarH2.y);
                p7m0 p7m0Var = eqbVarH2.u;
                Boolean bool = Boolean.FALSE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                return Unit.f46060a;
        }
    }
}
