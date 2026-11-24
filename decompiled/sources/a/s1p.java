package a;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class s1p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmo f31468a;
    public final ort b;
    public final iqt c;
    public final cmt d;
    public final reu e;
    public final ctf0 f;
    public final viu g;
    public final sje h;
    public final qoj0 i;
    public final ArrayList j;
    public final p7m0 k;
    public bby l;

    public s1p(nmo nmoVar, ort ortVar, iqt iqtVar, cmt cmtVar, reu reuVar, ctf0 ctf0Var, viu viuVar, tqt tqtVar, mne mneVar) {
        ctf0Var.getClass();
        this.f31468a = nmoVar;
        this.b = ortVar;
        this.c = iqtVar;
        this.d = cmtVar;
        this.e = reuVar;
        this.f = ctf0Var;
        this.g = viuVar;
        sje sjeVarA = d5c.a(kotlin.coroutines.e.c(qem0.e(), mneVar.b).plus(new rne("FATMAN_LOGGER_SCOPE")));
        this.h = sjeVarA;
        qoj0 qoj0VarB = roj0.b(0, 0, null, 7);
        this.i = qoj0VarB;
        this.j = new ArrayList();
        this.k = q7m0.a(0L);
        slb.U(new fnq(qoj0VarB, new sxk(this, null, (byte) 11), (byte) 4), sjeVarA);
    }

    public final void a(Set set, long j) {
        set.getClass();
        qjj.W(this.h, null, null, new ir((Object) this, j, (Object) set, (yje) null, (byte) 9), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(long j, zje zjeVar, Set set) {
        n1p n1pVar;
        long jLongValue;
        if (zjeVar instanceof n1p) {
            n1pVar = (n1p) zjeVar;
            int i = n1pVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                n1pVar.k = i - Integer.MIN_VALUE;
            } else {
                n1pVar = new n1p(this, zjeVar);
            }
        } else {
            n1pVar = new n1p(this, zjeVar);
        }
        Object obj = n1pVar.i;
        wne wneVar = wne.f39444a;
        int i2 = n1pVar.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                long micros = TimeUnit.MILLISECONDS.toMicros(this.g.a());
                synchronized (this.j) {
                    ArrayList arrayList = this.j;
                    set.getClass();
                    arrayList.add(new l1p(set, j, micros));
                    jLongValue = ((Number) this.k.getValue()).longValue();
                }
                bby bbyVar = this.l;
                if (bbyVar == null || !bbyVar.isActive()) {
                    d();
                }
                uen uenVar = wen.b;
                long jW0 = ibc.w0(5000L, bfn.MILLISECONDS);
                ey eyVar = new ey((Object) this, jLongValue, (yje) null, (byte) 16);
                n1pVar.k = 1;
                if (msm0.t(qcc.g0(jW0), eyVar, n1pVar) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
        } catch (gmq0 unused) {
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f2, code lost:
    
        if (r13 == r0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r14, a.zje r15) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.s1p.c(java.util.List, a.zje):java.lang.Object");
    }

    public final void d() {
        this.l = sac.d0(this.h, s1p.class.getSimpleName(), 3L, 3L, null, 0L, null, q1p.f27965a, new hij(this, null, (byte) 18), 120);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(zje zjeVar) {
        r1p r1pVar;
        boolean z;
        if (zjeVar instanceof r1p) {
            r1pVar = (r1p) zjeVar;
            int i = r1pVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                r1pVar.k = i - Integer.MIN_VALUE;
            } else {
                r1pVar = new r1p(this, zjeVar);
            }
        } else {
            r1pVar = new r1p(this, zjeVar);
        }
        Object objA = r1pVar.i;
        wne wneVar = wne.f39444a;
        int i2 = r1pVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            z = false;
            if (this.c.f15225a.a()) {
                r1pVar.k = 1;
                objA = ((b3c0) this.e.b).a(false, r1pVar);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        z = ((m2c0) objA).m0;
        return Boolean.valueOf(z);
    }
}
