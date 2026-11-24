package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class i7r0 extends bnn0 implements Function1 {
    public boolean i;
    public final /* synthetic */ n660 j;
    public final /* synthetic */ sip k;
    public final /* synthetic */ CyberGamesPage l;
    public final /* synthetic */ jo20 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7r0(n660 n660Var, sip sipVar, CyberGamesPage cyberGamesPage, jo20 jo20Var, yje yjeVar) {
        super(1, yjeVar);
        this.j = n660Var;
        this.k = sipVar;
        this.l = cyberGamesPage;
        this.m = jo20Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new i7r0(this.j, this.k, this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((i7r0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064 A[PHI: r5
  0x0064: PHI (r5v6 java.lang.String) = (r5v4 java.lang.String), (r5v23 java.lang.String) binds: [B:27:0x006f, B:20:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objD;
        String str;
        String str2;
        List list;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        f5h f5hVar;
        e2g e2gVar;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        sip sipVar = this.k;
        CyberGamesPage cyberGamesPage = this.l;
        if (!z) {
            z1x.P(obj);
            pmi0 pmi0Var = (pmi0) this.j.d;
            this.i = true;
            objD = pmi0Var.d(sipVar, cyberGamesPage, this.m, this);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objD = obj;
        }
        Iterable<l7r0> iterable = (Iterable) objD;
        int i = 10;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (l7r0 l7r0Var : iterable) {
            if (cyberGamesPage.equals(CyberGamesPage.Real.INSTANCE)) {
                l26 l26Var = l7r0Var.b;
                str = l26Var != null ? l26Var.b : null;
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
            } else {
                l26 l26Var2 = l7r0Var.f19574a;
                str = l26Var2 != null ? l26Var2.b : null;
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
            }
            List list2 = l7r0Var.c;
            l26 l26Var3 = l7r0Var.b;
            l26 l26Var4 = l7r0Var.f19574a;
            String str3 = (list2 == null || (f5hVar = (f5h) CollectionsKt.firstOrNull(list2)) == null || (e2gVar = f5hVar.z) == null) ? null : e2gVar.c;
            String str4 = str3 == null ? "" : str3;
            List<f5h> list3 = l7r0Var.c;
            long jLongValue = -1;
            if (list3 != null) {
                ArrayList arrayList2 = new ArrayList(r3d.q(list3, i));
                for (f5h f5hVar2 : list3) {
                    long jLongValue2 = (l26Var4 == null || (l4 = l26Var4.f19293a) == null) ? -1L : l4.longValue();
                    long jLongValue3 = (l26Var3 == null || (l3 = l26Var3.f19293a) == null) ? -1L : l3.longValue();
                    f5hVar2.getClass();
                    ArrayList arrayList3 = arrayList2;
                    arrayList3.add(pzb.E(f5hVar2, sipVar, jLongValue2, jLongValue3));
                    arrayList2 = arrayList3;
                }
                list = arrayList2;
            } else {
                list = iun.f15405a;
            }
            long jLongValue4 = (l26Var4 == null || (l2 = l26Var4.f19293a) == null) ? -1L : l2.longValue();
            if (l26Var3 != null && (l = l26Var3.f19293a) != null) {
                jLongValue = l.longValue();
            }
            StringBuilder sb = new StringBuilder(ujn.h);
            if (str4.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(str4, ujn.h, false) || kotlin.text.c.x(str4, "https://", false)) {
                sb.setLength(0);
                sb.append(str4);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(str4, '/'));
            }
            arrayList.add(new b4r0(jLongValue4, jLongValue, str2, sb.toString(), list));
            i = 10;
        }
        return arrayList;
    }
}
