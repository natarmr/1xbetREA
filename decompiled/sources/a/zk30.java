package a;

import android.javax.sip.message.Response;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class zk30 extends w46 {
    public final vzg0 b;
    public final int c;
    public final reu d;
    public final fxt e;
    public final do20 f;
    public final h03 g;
    public final mne h;
    public final g2v i;
    public final i1w0 j;
    public final dq00 k;
    public final c4m0 l;
    public bby m;
    public final p7m0 n;
    public final p7m0 o;
    public final n0o0 p;
    public final n0o0 q;
    public bby r;

    public zk30(vzg0 vzg0Var, int i, reu reuVar, fxt fxtVar, do20 do20Var, h03 h03Var, m1e m1eVar, mne mneVar, g2v g2vVar, i1w0 i1w0Var, dq00 dq00Var) {
        m1eVar.getClass();
        this.b = vzg0Var;
        this.c = i;
        this.d = reuVar;
        this.e = fxtVar;
        this.f = do20Var;
        this.g = h03Var;
        this.h = mneVar;
        this.i = g2vVar;
        this.j = i1w0Var;
        this.k = dq00Var;
        String str = (String) vzg0Var.a("KEY_SELECTED_DISCIPLINE");
        String str2 = str == null ? "" : str;
        String str3 = (String) vzg0Var.a("KEY_SEARCH_QUERY");
        String str4 = str3 == null ? "" : str3;
        String str5 = (String) vzg0Var.a("KEY_DEFAULT_DISCIPLINE");
        String str6 = str2;
        this.n = q7m0.a(new nk30(str6, str5 == null ? "" : str5, str4, iun.f15405a, g2v.d(g2vVar, pb10.e, null, null, R.string.nothing_found, 0, null, 478), false, false, true));
        this.o = q7m0.a(s0k0.f31413a);
        this.p = maz.b(new tk30(this, (byte) 0));
        this.q = maz.b(new tk30(this, (byte) 1));
        c4m0 c4m0Var = this.l;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.l = sac.T(new fnq(m1eVar.b(), new w620((Object) this, (yje) null, (byte) 10), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), xk30.h);
        }
    }

    public final void w(boolean z) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.n;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, nk30.a((nk30) value, null, null, null, null, null, false, false, true, 127)));
        v3c.N(this.m);
        this.m = sac.i0(jiu0.a(this), zk30.class.getSimpleName().concat(".loadMedalStatistic"), 3, 3L, null, null, new xj1((diu0) this, z, (yje) null, (byte) 14), null, this.h.f22085a, new b530((Object) this, (byte) 4), null, Response.BUSY_EVERYWHERE);
    }

    public final void x() {
        ((ygm0) ((z220) this.g.b).d).b = "";
        ((ygm0) ((z220) this.f.f6397a).d).f42593a = null;
        i1w0 i1w0Var = this.j;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void y() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.n;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, nk30.a((nk30) value, null, null, null, iun.f15405a, (jkm) this.p.getValue(), true, false, false, 71)));
    }
}
