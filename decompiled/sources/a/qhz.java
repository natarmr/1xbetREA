package a;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.time_filter.LeaderboardTimeFilterModelParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/qhz;", "La/iw5;", "<init>", "()V", "a/gst", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qhz extends iw5 {
    public final khf0 k2 = new khf0("params_key");
    public static final /* synthetic */ iiy[] m2 = {new ez40(qhz.class, "params", "getParams()Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterModelParams;", 0)};
    public static final gst l2 = new gst();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-698334617);
        iiy[] iiyVarArr = m2;
        iiy iiyVar = iiyVarArr[0];
        khf0 khf0Var = this.k2;
        Object objO0 = dyb.o0(((LeaderboardTimeFilterModelParams) khf0Var.n(this, iiyVar)).f46581a);
        int i = ((LeaderboardTimeFilterModelParams) khf0Var.n(this, iiyVarArr[0])).b;
        objO0.getClass();
        boolean zE = fetVar.e(i);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zE || objP == obj) {
            objP = androidx.compose.runtime.e.e(new ohz(lak0.c));
            fetVar.o0(objP);
        }
        pz40 pz40Var = (pz40) objP;
        Unit unit = Unit.f46060a;
        boolean zI = fetVar.i(objO0) | fetVar.e(i) | fetVar.g(pz40Var);
        Object objP2 = fetVar.P();
        if (zI || objP2 == obj) {
            objP2 = new mc0(objO0, (Object) pz40Var, i, (yje) null, (byte) 6);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, unit, (Function2) objP2);
        ohz ohzVar = (ohz) pz40Var.getValue();
        Object objP3 = fetVar.P();
        if (objP3 == obj) {
            objP3 = new ebz(this, (byte) 13);
            fetVar.o0(objP3);
        }
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), vbw0.c, (ugd) null, u1c.M(1368015254, new eyn(ddz.a(0, 0, fetVar, 0, 3), ohzVar, (Function1) objP3, (byte) 15), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }
}
