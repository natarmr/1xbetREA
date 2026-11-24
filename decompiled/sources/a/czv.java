package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class czv implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5242a;
    public final /* synthetic */ izv b;

    public /* synthetic */ czv(izv izvVar, byte b) {
        this.f5242a = b;
        this.b = izvVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f5242a;
        izv izvVar = this.b;
        switch (b) {
            case 0:
                rqt rqtVar = izv.d2;
                jzv jzvVarM0 = izvVar.M0();
                jzvVarM0.d.x(izvVar.H0());
                return Unit.f46060a;
            case 1:
                rqt rqtVar2 = izv.d2;
                izvVar.M0().w();
                return Unit.f46060a;
            case 2:
                rqt rqtVar3 = izv.d2;
                p7m0 p7m0Var = izvVar.M0().c.y;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, d3w.a((d3w) value, null, null, false, false, 0L, false, 239)));
                izvVar.M0().e.x();
                return Unit.f46060a;
            case 3:
                rqt rqtVar4 = izv.d2;
                izvVar.M0().d.y();
                return Unit.f46060a;
            case 4:
                rqt rqtVar5 = izv.d2;
                izvVar.M0().d.B();
                return Unit.f46060a;
            case 5:
                nii niiVar = izvVar.U1;
                if (niiVar != null) {
                    return new q0h0(niiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 6:
                rqt rqtVar6 = izv.d2;
                ezv ezvVar = new ezv(izvVar, (byte) 0);
                vft vftVar = new vft(1, izvVar.M0(), jzv.class, "onAlternativeInfoClick", "onAlternativeInfoClick(J)V", 0, (byte) 18);
                ma7 ma7Var = new ma7();
                dp dpVar = (dp) ma7Var.e;
                List list = oa7.f24915a;
                dpVar.b(new gbn(new i87((byte) 3), new lq4(3, (byte) 10), new qo5(ezvVar, vftVar, (byte) 25), zx3.t));
                return ma7Var;
            case 7:
                rqt rqtVar7 = izv.d2;
                nhf0 nhf0Var = izvVar.M0().e.A;
                ((b4j) nhf0Var.c).p("bet_history_details");
                ((au0) nhf0Var.f23530a).n("bet_history_details");
                ywq ywqVar = izvVar.a2;
                Unit unit = Unit.f46060a;
                ywqVar.a(unit);
                return unit;
            case 8:
                rqt rqtVar8 = izv.d2;
                nhf0 nhf0Var2 = izvVar.M0().e.A;
                ((b4j) nhf0Var2.c).o("bet_history_details");
                ((au0) nhf0Var2.f23530a).m("bet_history_details");
                return Unit.f46060a;
            default:
                rqt rqtVar9 = izv.d2;
                q5w q5wVar = izvVar.M0().e;
                q5wVar.q.a(true);
                q5wVar.r.a(true);
                q5wVar.x();
                return Unit.f46060a;
        }
    }
}
