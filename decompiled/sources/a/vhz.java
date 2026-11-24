package a;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.impl.leaderboard.presentation.dialogs.type.model.LeaderboardTypeModelParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/vhz;", "La/iw5;", "<init>", "()V", "a/rqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vhz extends iw5 {
    public final khf0 k2 = new khf0("params_key");
    public static final /* synthetic */ iiy[] m2 = {new ez40(vhz.class, "params", "getParams()Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/type/model/LeaderboardTypeModelParams;", 0)};
    public static final rqt l2 = new rqt();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(301755147);
        iiy[] iiyVarArr = m2;
        iiy iiyVar = iiyVarArr[0];
        khf0 khf0Var = this.k2;
        xhz xhzVar = ((LeaderboardTypeModelParams) khf0Var.n(this, iiyVar)).b;
        a4x a4xVarO0 = dyb.o0(((LeaderboardTypeModelParams) khf0Var.n(this, iiyVarArr[0])).f46583a);
        xhzVar.getClass();
        a4xVarO0.getClass();
        boolean zE = fetVar.e(xhzVar.ordinal());
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (zE || objP == cl5Var) {
            objP = androidx.compose.runtime.e.e(new thz(lak0.c));
            fetVar.o0(objP);
        }
        pz40 pz40Var = (pz40) objP;
        fetVar.e0(-1280022021);
        ArrayList arrayList = new ArrayList(r3d.q(a4xVarO0, 10));
        int i = 0;
        for (Object obj : a4xVarO0) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            xhz xhzVar2 = (xhz) obj;
            a4x a4xVar = a4xVarO0;
            arrayList.add(new whz(xhzVar2, new rqm((vui0) new tui0(rsm0.w(xhzVar2.f40918a, 0, fetVar), null), (pui0) null, (pvi0) new nvi0(xhzVar2 == xhzVar), (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 506), i == a4xVar.size() + (-1)));
            i = i2;
            a4xVarO0 = a4xVar;
        }
        fetVar.r(false);
        pz40Var.setValue(new thz(dyb.o0(arrayList)));
        thz thzVar = (thz) pz40Var.getValue();
        Object objP2 = fetVar.P();
        if (objP2 == cl5Var) {
            objP2 = new ebz(this, (byte) 14);
            fetVar.o0(objP2);
        }
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), hew0.c, (ugd) null, u1c.M(1184486460, new ngz(thzVar, (Function1) objP2, (byte) 2), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }
}
