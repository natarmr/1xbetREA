package a;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.regions.LeaderboardRegionModelParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/pgz;", "La/iw5;", "<init>", "()V", "a/art", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pgz extends iw5 {
    public final khf0 k2 = new khf0("params_key");
    public static final /* synthetic */ iiy[] m2 = {new ez40(pgz.class, "params", "getParams()Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/regions/LeaderboardRegionModelParams;", 0)};
    public static final art l2 = new art();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(1959047248);
        byte b = 0;
        qgz qgzVar = ((LeaderboardRegionModelParams) this.k2.n(this, m2[0])).f46579a;
        a4x a4xVarO0 = dyb.o0(qgz.e);
        qgzVar.getClass();
        a4xVarO0.getClass();
        boolean zE = fetVar.e(qgzVar.ordinal());
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (zE || objP == cl5Var) {
            objP = androidx.compose.runtime.e.e(new rgz(lak0.c));
            fetVar.o0(objP);
        }
        pz40 pz40Var = (pz40) objP;
        fetVar.e0(644900471);
        ArrayList arrayList = new ArrayList(r3d.q(a4xVarO0, 10));
        int i = 0;
        for (Object obj : a4xVarO0) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            qgz qgzVar2 = (qgz) obj;
            a4x a4xVar = a4xVarO0;
            arrayList.add(new sgz(qgzVar2, new rqm((vui0) new tui0(rsm0.w(qgzVar2.f28710a, 0, fetVar), null), (pui0) null, (pvi0) new nvi0(qgzVar2 == qgzVar), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506), i == a4xVar.size() + (-1)));
            i = i2;
            a4xVarO0 = a4xVar;
        }
        fetVar.r(false);
        pz40Var.setValue(new rgz(dyb.o0(arrayList)));
        rgz rgzVar = (rgz) pz40Var.getValue();
        Object objP2 = fetVar.P();
        if (objP2 == cl5Var) {
            objP2 = new ebz(this, (byte) 11);
            fetVar.o0(objP2);
        }
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), epv0.d, (ugd) null, u1c.M(-2096579073, new ngz(rgzVar, (Function1) objP2, b), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }
}
