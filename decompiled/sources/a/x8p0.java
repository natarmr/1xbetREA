package a;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.impl.team_details.presentation.main.dialog.model.TeamDetailsDisciplineDialogParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/x8p0;", "La/iw5;", "<init>", "()V", "a/s2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class x8p0 extends iw5 {
    public final khf0 k2 = new khf0("TEAM_DETAILS_DISCIPLINE_DIALOG_PARAMS");
    public static final /* synthetic */ iiy[] m2 = {new ez40(x8p0.class, "params", "getParams()Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineDialogParams;", 0)};
    public static final s2m0 l2 = new s2m0();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1585337452);
        iiy[] iiyVarArr = m2;
        iiy iiyVar = iiyVarArr[0];
        khf0 khf0Var = this.k2;
        long j = ((TeamDetailsDisciplineDialogParams) khf0Var.n(this, iiyVar)).f46612a;
        Object objO0 = dyb.o0(((TeamDetailsDisciplineDialogParams) khf0Var.n(this, iiyVarArr[0])).b);
        objO0.getClass();
        boolean zF = fetVar.f(j);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zF || objP == obj) {
            objP = androidx.compose.runtime.e.e(new v8p0(lak0.c));
            fetVar.o0(objP);
        }
        pz40 pz40Var = (pz40) objP;
        Unit unit = Unit.f46060a;
        boolean zI = fetVar.i(objO0) | fetVar.f(j) | fetVar.g(pz40Var);
        Object objP2 = fetVar.P();
        if (zI || objP2 == obj) {
            objP2 = new zg0(objO0, (Object) pz40Var, j, (yje) null, (byte) 12);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, unit, (Function2) objP2);
        v8p0 v8p0Var = (v8p0) pz40Var.getValue();
        Object objP3 = fetVar.P();
        if (objP3 == obj) {
            objP3 = new ttn0(this, (byte) 22);
            fetVar.o0(objP3);
        }
        byte b = 16;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), ro4.g, (ugd) null, u1c.M(928895813, new sqc0(b, ddz.a(0, 0, fetVar, 0, 3), v8p0Var, (Function1) objP3), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }
}
