package a;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class h6g extends w46 {
    public final vzg0 b;
    public final CyberCalendarParams c;
    public final fhj d;
    public final b3u e;
    public final j3c f;
    public final y1u g;
    public final z1u h;
    public final g2v i;
    public final mne j;
    public final duj k;
    public final ctf0 l;
    public final p7m0 m;
    public final p7m0 n;
    public final p7m0 o;
    public c5g p;
    public da10 q;
    public bby r;
    public bby s;

    public h6g(vzg0 vzg0Var, CyberCalendarParams cyberCalendarParams, fhj fhjVar, b3u b3uVar, j3c j3cVar, y1u y1uVar, z1u z1uVar, g2v g2vVar, mne mneVar, duj dujVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.b = vzg0Var;
        this.c = cyberCalendarParams;
        this.d = fhjVar;
        this.e = b3uVar;
        this.f = j3cVar;
        this.g = y1uVar;
        this.h = z1uVar;
        this.i = g2vVar;
        this.j = mneVar;
        this.k = dujVar;
        this.l = ctf0Var;
        this.m = q7m0.a(Unit.f46060a);
        Long l = (Long) vzg0Var.a("selected_time_key");
        this.n = q7m0.a(new CyberCalendarPeriodUiModel(l != null ? l.longValue() : new Date().getTime(), 0L));
        this.o = q7m0.a(nch.f23293a);
        this.q = da10.TIMER_ERROR;
    }

    public final void A(da10 da10Var) {
        Object value;
        this.q = da10Var;
        p7m0 p7m0Var = this.o;
        Object value2 = p7m0Var.getValue();
        mch mchVar = value2 instanceof mch ? (mch) value2 : null;
        if (mchVar != null) {
            mch mchVar2 = new mch(mchVar.f21551a, this.q.f5727a);
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, mchVar2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r10 == r0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(a.zje r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof a.f6g
            if (r0 == 0) goto L14
            r0 = r10
            a.f6g r0 = (a.f6g) r0
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
            a.f6g r0 = new a.f6g
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
            goto L4f
        L37:
            a.z1x.P(r10)
            org.xplatform.cyber.calendar.api.CyberCalendarParams r10 = r9.c
            boolean r10 = r10.d
            if (r10 == 0) goto L6c
            r6.k = r3
            a.j3c r1 = r9.f
            r2 = 189(0xbd, double:9.34E-322)
            r4 = -1
            java.lang.Object r10 = r1.a(r2, r4, r6)
            if (r10 != r0) goto L4f
            goto L7a
        L4f:
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
        L6c:
            r6.k = r2
            a.b3u r9 = r9.e
            a.sjl0 r9 = r9.f1927a
            r1 = 40
            java.lang.Object r9 = r9.c(r1, r6)
            if (r9 != r0) goto L7b
        L7a:
            return r0
        L7b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h6g.w(a.zje):java.lang.Object");
    }

    public final void x() {
        mch mchVar = new mch(g2v.d(this.i, this.c.d ? pb10.r : ozb.J(-1L, pb10.v), null, null, R.string.data_retrieval_error, R.string.try_again_text, null, 350), this.q.f5727a);
        p7m0 p7m0Var = this.o;
        p7m0Var.getClass();
        p7m0Var.o(null, mchVar);
        this.q = da10.DEFAULT_ERROR;
    }

    public final void y() {
        bby bbyVar = this.s;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.s = sac.V(jiu0.a(this), new d6g(this, (byte) 1), null, this.j.f22085a, new igb((Object) this, yjeVar, (byte) 17), 10);
    }

    public final void z(int i) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTimeInMillis(((CyberCalendarPeriodUiModel) this.n.getValue()).f46479a);
        calendar.add(6, i);
        sac.V(jiu0.a(this), new d6g(this, (byte) 0), null, this.j.f22085a, new b1f((Object) this, (Object) calendar, (yje) null, (byte) 7), 10);
    }
}
