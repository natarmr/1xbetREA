package a;

import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class u8g extends w46 {
    public final m1e b;
    public final CyberCalendarPeriodUiModel c;
    public final boolean d;
    public final fhj e;
    public final b3u f;
    public final j3c g;
    public final y1u h;
    public final g2v i;
    public final mne j;
    public final duj k;
    public final p7m0 l;
    public final p7m0 m;
    public final p7m0 n;
    public da10 o;
    public c4m0 p;
    public bby q;
    public bby r;

    public u8g(vzg0 vzg0Var, m1e m1eVar, CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel, boolean z, fhj fhjVar, b3u b3uVar, j3c j3cVar, y1u y1uVar, g2v g2vVar, mne mneVar, duj dujVar) {
        m1eVar.getClass();
        this.b = m1eVar;
        this.c = cyberCalendarPeriodUiModel;
        this.d = z;
        this.e = fhjVar;
        this.f = b3uVar;
        this.g = j3cVar;
        this.h = y1uVar;
        this.i = g2vVar;
        this.j = mneVar;
        this.k = dujVar;
        this.l = q7m0.a(Unit.f46060a);
        this.m = q7m0.a(null);
        this.n = q7m0.a(m8g.f21368a);
        this.o = da10.TIMER_ERROR;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r10 == r0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(a.zje r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof a.t8g
            if (r0 == 0) goto L14
            r0 = r10
            a.t8g r0 = (a.t8g) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.k = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a.t8g r0 = new a.t8g
            r0.<init>(r9, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.i
            a.wne r0 = a.wne.f39444a
            int r1 = r6.k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            a.z1x.P(r10)
            return r10
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            r9 = 0
            return r9
        L33:
            a.z1x.P(r10)
            goto L4d
        L37:
            a.z1x.P(r10)
            boolean r10 = r9.d
            if (r10 == 0) goto L6a
            r6.k = r3
            a.j3c r1 = r9.g
            r2 = 189(0xbd, double:9.34E-322)
            r4 = -1
            java.lang.Object r10 = r1.a(r2, r4, r6)
            if (r10 != r0) goto L4d
            goto L78
        L4d:
            a.ypl0 r10 = (a.ypl0) r10
            a.ril0 r0 = new a.ril0
            java.lang.String r3 = r10.b
            a.f3n0 r9 = new a.f3n0
            r1 = 189(0xbd, double:9.34E-322)
            a.lel0 r4 = r10.c
            r9.<init>(r1, r3, r4)
            java.util.List r7 = kotlin.collections.a.c(r9)
            a.lel0 r8 = r10.c
            java.lang.String r4 = ""
            r6 = 0
            r5 = r3
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            return r0
        L6a:
            r6.k = r2
            a.b3u r9 = r9.f
            a.sjl0 r9 = r9.f1927a
            r1 = 40
            java.lang.Object r9 = r9.c(r1, r6)
            if (r9 != r0) goto L79
        L78:
            return r0
        L79:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.u8g.w(a.zje):java.lang.Object");
    }

    public final void x() {
        l8g l8gVar = new l8g(g2v.d(this.i, this.d ? pb10.r : ozb.J(-1L, pb10.v), null, null, R.string.data_retrieval_error, R.string.try_again_text, null, 350), this.o.f5727a);
        p7m0 p7m0Var = this.n;
        p7m0Var.getClass();
        p7m0Var.o(null, l8gVar);
        this.o = da10.DEFAULT_ERROR;
    }

    public final void y() {
        c4m0 c4m0Var = this.p;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            byte b = 2;
            this.p = sac.T(new fnq(this.b.b(), new s8g(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), this.j.f22085a), new f1e(b, yjeVar, (byte) 11));
        }
    }

    public final void z(da10 da10Var) {
        Object value;
        this.o = da10Var;
        p7m0 p7m0Var = this.n;
        Object value2 = p7m0Var.getValue();
        l8g l8gVar = value2 instanceof l8g ? (l8g) value2 : null;
        if (l8gVar != null) {
            l8g l8gVar2 = new l8g(l8gVar.f19602a, this.o.f5727a);
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, l8gVar2));
        }
    }
}
