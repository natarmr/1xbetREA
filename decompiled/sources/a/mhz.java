package a;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.teams_type.model.LeaderboardTeamsTypeModelParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/mhz;", "La/iw5;", "<init>", "()V", "a/bst", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mhz extends iw5 {
    public final khf0 k2 = new khf0("params_key");
    public static final /* synthetic */ iiy[] m2 = {new ez40(mhz.class, "params", "getParams()Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/teams_type/model/LeaderboardTeamsTypeModelParams;", 0)};
    public static final bst l2 = new bst();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        String strW;
        fetVar.e0(1356682816);
        boolean z = false;
        epe epeVar = ((LeaderboardTeamsTypeModelParams) this.k2.n(this, m2[0])).f46580a;
        a4x a4xVarO0 = dyb.o0(epe.d);
        epeVar.getClass();
        a4xVarO0.getClass();
        boolean zE = fetVar.e(epeVar.ordinal());
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (zE || objP == cl5Var) {
            objP = androidx.compose.runtime.e.e(new khz(lak0.c));
            fetVar.o0(objP);
        }
        pz40 pz40Var = (pz40) objP;
        fetVar.e0(-395129274);
        ArrayList arrayList = new ArrayList(r3d.q(a4xVarO0, 10));
        Iterator<E> it = a4xVarO0.iterator();
        int i = 0;
        while (true) {
            byte b = 1;
            if (!it.hasNext()) {
                fetVar.r(z);
                pz40Var.setValue(new khz(dyb.o0(arrayList)));
                khz khzVar = (khz) pz40Var.getValue();
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new ebz(this, (byte) 12);
                    fetVar.o0(objP2);
                }
                bw5 bw5Var = new bw5(iw5.O0(1, fetVar), i4w0.c, (ugd) null, u1c.M(-938721935, new ngz(khzVar, (Function1) objP2, b), fetVar), 10);
                fetVar.r(false);
                return bw5Var;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            epe epeVar2 = (epe) next;
            int iOrdinal = epeVar2.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-250897040);
                strW = rsm0.w(R.string.hltv_adwards, 0, fetVar);
                fetVar.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(-250899181, fetVar, false);
                }
                fetVar.e0(-250893995);
                strW = rsm0.w(R.string.cs2_ranking_valve, 0, fetVar);
                fetVar.r(false);
            }
            arrayList.add(new nhz(epeVar2, new rqm((vui0) new tui0(strW, null), (pui0) null, (pvi0) new nvi0(epeVar2 == epeVar), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506), i == a4xVarO0.size() + (-1) ? b : 0));
            i = i2;
            z = false;
        }
    }
}
