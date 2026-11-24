package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class rb6 extends bnn0 implements Function1 {
    public boolean i;
    public final /* synthetic */ sb6 j;
    public final /* synthetic */ sip k;
    public final /* synthetic */ jo20 l;
    public final /* synthetic */ CyberGamesPage m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb6(sb6 sb6Var, sip sipVar, jo20 jo20Var, CyberGamesPage cyberGamesPage, yje yjeVar) {
        super(1, yjeVar);
        this.j = sb6Var;
        this.k = sipVar;
        this.l = jo20Var;
        this.m = cyberGamesPage;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new rb6(this.j, this.k, this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((rb6) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062 A[PHI: r5
  0x0062: PHI (r5v6 java.lang.String) = (r5v4 java.lang.String), (r5v21 java.lang.String) binds: [B:27:0x006d, B:20:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objH;
        String str;
        String str2;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        sip sipVar = this.k;
        if (!z) {
            z1x.P(obj);
            wsf0 wsf0Var = this.j.c;
            this.i = true;
            objH = wsf0Var.h(sipVar, this.l, this);
            if (objH == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objH = obj;
        }
        Iterable<f5h> iterable = (Iterable) objH;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (f5h f5hVar : iterable) {
            if (this.m.equals(CyberGamesPage.Real.INSTANCE)) {
                k2g k2gVar = f5hVar.y;
                str = k2gVar != null ? k2gVar.b : null;
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
            } else {
                gdh gdhVar = f5hVar.x;
                str = gdhVar != null ? gdhVar.b : null;
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
            }
            e2g e2gVar = f5hVar.z;
            k2g k2gVar2 = f5hVar.y;
            gdh gdhVar2 = f5hVar.x;
            String str3 = e2gVar != null ? e2gVar.c : null;
            String str4 = str3 == null ? "" : str3;
            long jLongValue = -1;
            nas nasVarE = pzb.E(f5hVar, sipVar, (gdhVar2 == null || (l4 = gdhVar2.f11103a) == null) ? -1L : l4.longValue(), (k2gVar2 == null || (l3 = k2gVar2.f17569a) == null) ? -1L : l3.longValue());
            long jLongValue2 = (gdhVar2 == null || (l2 = gdhVar2.f11103a) == null) ? -1L : l2.longValue();
            if (k2gVar2 != null && (l = k2gVar2.f17569a) != null) {
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
            arrayList.add(new b4r0(jLongValue2, jLongValue, str2, sb.toString(), kotlin.collections.a.c(nasVarE)));
        }
        return arrayList;
    }
}
