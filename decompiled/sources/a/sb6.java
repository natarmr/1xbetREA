package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class sb6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final knf0 f31917a;
    public final yzn0 b;
    public final wsf0 c;
    public final rrt0 d;

    public sb6(knf0 knf0Var, yzn0 yzn0Var, wsf0 wsf0Var, rrt0 rrt0Var) {
        knf0Var.getClass();
        rrt0Var.getClass();
        this.f31917a = knf0Var;
        this.b = yzn0Var;
        this.c = wsf0Var;
        this.d = rrt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ee A[PHI: r9
  0x00ee: PHI (r9v10 java.lang.String) = (r9v8 java.lang.String), (r9v23 java.lang.String) binds: [B:55:0x00f9, B:48:0x00e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Serializable a(sip sipVar, CyberGamesPage.Real real, int i, jvn jvnVar, boolean z, zje zjeVar) {
        qb6 qb6Var;
        Object g0g0Var;
        CyberGamesPage.Real real2;
        String str;
        String str2;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        sip sipVar2 = sipVar;
        if (zjeVar instanceof qb6) {
            qb6Var = (qb6) zjeVar;
            int i2 = qb6Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qb6Var.m = i2 - Integer.MIN_VALUE;
            } else {
                qb6Var = new qb6(this, zjeVar);
            }
        } else {
            qb6Var = new qb6(this, zjeVar);
        }
        Object objH = qb6Var.k;
        wne wneVar = wne.f39444a;
        int i3 = qb6Var.m;
        if (i3 == 0) {
            z1x.P(objH);
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = this.d.a();
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            if (g0g0Var instanceof g0g0) {
                g0g0Var = null;
            }
            krt0 krt0Var = (krt0) g0g0Var;
            boolean z2 = sipVar2 != sip.c ? !(krt0Var == null || !krt0Var.b) : !(krt0Var == null || !krt0Var.c);
            long j = krt0Var != null ? krt0Var.f18785a : 0L;
            lnf0 lnf0VarD = this.f31917a.d();
            jvnVar.getClass();
            jo20 jo20Var = new jo20();
            qbt.a(jo20Var, jvnVar);
            qbt.d(jo20Var, i, z);
            qbt.g(lnf0VarD.b, jo20Var);
            qbt.h(jo20Var);
            qbt.j(lnf0VarD.f20342a, jo20Var);
            qbt.l(jo20Var);
            qbt.o(jo20Var, z2, j);
            qbt.p(jo20Var);
            jo20 jo20VarB = jo20Var.b();
            qb6Var.i = sipVar2;
            real2 = real;
            qb6Var.j = real2;
            qb6Var.m = 1;
            objH = this.c.h(sipVar2, jo20VarB, qb6Var);
            if (objH == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CyberGamesPage.Real real3 = qb6Var.j;
            sip sipVar3 = qb6Var.i;
            z1x.P(objH);
            real2 = real3;
            sipVar2 = sipVar3;
        }
        Iterable<f5h> iterable = (Iterable) objH;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (f5h f5hVar : iterable) {
            if (Intrinsics.d(real2, CyberGamesPage.Real.INSTANCE)) {
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
            String str4 = str3 != null ? str3 : "";
            long jLongValue = -1;
            long jLongValue2 = (gdhVar2 == null || (l4 = gdhVar2.f11103a) == null) ? -1L : l4.longValue();
            long jLongValue3 = (k2gVar2 == null || (l3 = k2gVar2.f17569a) == null) ? -1L : l3.longValue();
            sipVar2.getClass();
            sip sipVar4 = sipVar2;
            nas nasVarE = pzb.E(f5hVar, sipVar4, jLongValue2, jLongValue3);
            long jLongValue4 = (gdhVar2 == null || (l2 = gdhVar2.f11103a) == null) ? -1L : l2.longValue();
            if (k2gVar2 != null && (l = k2gVar2.f17569a) != null) {
                jLongValue = l.longValue();
            }
            long j2 = jLongValue;
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
            arrayList.add(new b4r0(jLongValue4, j2, str2, sb.toString(), kotlin.collections.a.c(nasVarE)));
            sipVar2 = sipVar4;
        }
        this.b.h(real2, sipVar2).d(arrayList);
        return arrayList;
    }
}
