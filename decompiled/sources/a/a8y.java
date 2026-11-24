package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a8y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f451a = q3d.j(i0w.b, i0w.d, i0w.e);

    public static final qp30 a(z7y z7yVar, ctf0 ctf0Var, String str, List list, HistoryTypeModel historyTypeModel) {
        x680 x680Var;
        qp30 qp30Var;
        String str2;
        buy wtyVar;
        ctf0Var.getClass();
        list.getClass();
        Object[] objArr = {z7yVar.f43943a};
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.history_coupon_number, Arrays.copyOf(objArr, 1));
        i0w i0wVar = z7yVar.e;
        ArrayList arrayListG = hew0.G(historyTypeModel, i0wVar, list);
        ArrayList arrayList = new ArrayList(r3d.q(arrayListG, 10));
        Iterator it = arrayListG.iterator();
        while (it.hasNext()) {
            arrayList.add(eeq.X((HistoryMenuItem) it.next(), false));
        }
        String str3 = z7yVar.f43943a;
        String strQ = w6x.q(bfb.R(z7yVar.d, ctf0Var), " · \u200e", strA);
        nom0 nom0Var = new nom0(aac.Z(i0wVar, ctf0Var), iom0.n(i0wVar));
        so30 so30Var = (so30) CollectionsKt.W(0, arrayList);
        so30 so30Var2 = (so30) CollectionsKt.W(1, arrayList);
        String strA2 = lsm0Var.a(R.string.jackpot_word, Arrays.copyOf(new Object[0], 0));
        lc00 lc00VarB = kotlin.collections.a.b();
        hxu hxuVar = z7yVar.k;
        int iOrdinal = i0wVar.ordinal();
        if (iOrdinal == 3 || iOrdinal == 4) {
            String strA3 = lsm0Var.a(R.string.coefficient, Arrays.copyOf(new Object[0], 0));
            pn40 pn40Var = pn40.f27267a;
            qp30Var = null;
            x680Var = new x680("COEF_ID", strA3, new auy(pn40.c(z7yVar.f, p3u0.c)));
        } else {
            qp30Var = null;
            x680Var = null;
        }
        lc00VarB.add(x680Var);
        String strA4 = lsm0Var.a(i0wVar == i0w.i ? R.string.credited_to_account_no_colon : R.string.pf_bet, Arrays.copyOf(new Object[0], 0));
        pn40 pn40Var2 = pn40.f27267a;
        double d = hxuVar.f.b;
        if (d == 0.0d) {
            d = z7yVar.c;
        }
        p3u0 p3u0Var = p3u0.c;
        String strC = pn40.c(d, p3u0Var);
        String strC2 = pn40.c(z7yVar.g, p3u0Var);
        switch (i0wVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
                str2 = str;
                pz40 pz40Var = s6t0.f31722a;
                wtyVar = new wty(strC2, str2, s6t0.b().f33626a.getTextPrimary());
                break;
            case 3:
            case 4:
                pz40 pz40Var2 = s6t0.f31722a;
                str2 = str;
                wtyVar = new xty(StaticColors.INSTANCE.m98getGreen0d7_KjU(), strC, strC2, str2);
                break;
            default:
                t9f.b();
                return qp30Var;
        }
        lc00VarB.add(new x680("POSSIBLE_PAYOUT", strA4, wtyVar));
        lc00VarB.addAll(f451a.contains(i0wVar) ? bdx.i0(hxuVar, i0wVar, str2) : iun.f15405a);
        return new qp30(str3, str3, strQ, new svw(R.drawable.ic_football), strA2, false, lak0.c, new ec(false, false), hb30.f12752a, "", "", "", dyb.r0(CollectionsKt.S(kotlin.collections.a.a(lc00VarB))), null, nom0Var, "", so30Var, so30Var2);
    }
}
