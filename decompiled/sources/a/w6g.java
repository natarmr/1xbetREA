package a;

import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.content.daysofweek.CyberCalendarDaysOfWeekParams;

/* JADX INFO: loaded from: classes3.dex */
public final class w6g extends w46 {
    public final m1e b;
    public final CyberCalendarDaysOfWeekParams c;
    public final boolean d;
    public final fhj e;
    public final b3u f;
    public final y1u g;
    public final y1u h;
    public final g2v i;
    public final mne j;
    public final duj k;
    public final j3c l;
    public final p7m0 m;
    public final p7m0 n;
    public final p7m0 o;
    public da10 p;
    public c5g q;
    public c4m0 r;
    public bby s;
    public bby t;

    public w6g(vzg0 vzg0Var, m1e m1eVar, CyberCalendarDaysOfWeekParams cyberCalendarDaysOfWeekParams, boolean z, fhj fhjVar, b3u b3uVar, y1u y1uVar, y1u y1uVar2, g2v g2vVar, mne mneVar, duj dujVar, j3c j3cVar) {
        m1eVar.getClass();
        this.b = m1eVar;
        this.c = cyberCalendarDaysOfWeekParams;
        this.d = z;
        this.e = fhjVar;
        this.f = b3uVar;
        this.g = y1uVar;
        this.h = y1uVar2;
        this.i = g2vVar;
        this.j = mneVar;
        this.k = dujVar;
        this.l = j3cVar;
        this.m = q7m0.a(Unit.f46060a);
        this.n = q7m0.a(o6g.f24734a);
        this.o = q7m0.a(null);
        this.p = da10.TIMER_ERROR;
    }

    public final void w() {
        n6g n6gVar = new n6g(g2v.d(this.i, this.d ? pb10.r : ozb.J(-1L, pb10.v), null, null, R.string.data_retrieval_error, R.string.try_again_text, null, 350), this.p.f5727a);
        p7m0 p7m0Var = this.n;
        p7m0Var.getClass();
        p7m0Var.o(null, n6gVar);
        this.p = da10.DEFAULT_ERROR;
    }

    public final void x() {
        c4m0 c4m0Var = this.r;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.r = sac.T(new fnq(this.b.b(), new u6g(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), this.j.f22085a), new f1e(2, yjeVar, (byte) 10));
        }
    }

    public final void y(da10 da10Var) {
        Object value;
        this.p = da10Var;
        p7m0 p7m0Var = this.n;
        Object value2 = p7m0Var.getValue();
        n6g n6gVar = value2 instanceof n6g ? (n6g) value2 : null;
        if (n6gVar != null) {
            n6g n6gVar2 = new n6g(n6gVar.f22996a, this.p.f5727a);
            do {
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, n6gVar2));
        }
    }
}
