package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.StringsKt;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class zeo0 extends i3t0 {
    public static final /* synthetic */ int u = 0;
    public final i1w0 o;
    public final yfm0 p;
    public final yo4 q;
    public final zr1 r;
    public final tsc s;
    public c4m0 t;

    /* JADX WARN: Illegal instructions before constructor call */
    public zeo0(vzg0 vzg0Var, int i, mne mneVar, r9u r9uVar, i1w0 i1w0Var, yfm0 yfm0Var, yo4 yo4Var, zr1 zr1Var, luu luuVar, tsc tscVar, bzt bztVar, ctf0 ctf0Var) {
        r9uVar.getClass();
        ctf0Var.getClass();
        vs10 vs10Var = mneVar.c;
        super(vzg0Var, new yeo0(luuVar, bztVar, i, r9uVar), cvm0.p(vs10Var, vs10Var), new h0j0(ctf0Var, (byte) 12));
        this.o = i1w0Var;
        this.p = yfm0Var;
        this.q = yo4Var;
        this.r = zr1Var;
        this.s = tscVar;
    }

    public final void M(int i) {
        int i2;
        Object value;
        keo0 keo0Var;
        List list;
        if (((keo0) D()).d.length() < 3 || ((list = ((keo0) D()).c) != null && list.isEmpty())) {
            i2 = 0;
        } else {
            Iterator it = list.iterator();
            i2 = 0;
            while (it.hasNext()) {
                if (StringsKt.O(((x8r0) it.next()).c, ((keo0) D()).d, true) && (i2 = i2 + 1) < 0) {
                    q3d.o();
                    throw null;
                }
            }
        }
        if (i2 == 0) {
            return;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            keo0Var = (keo0) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, keo0.a(keo0Var, 0, null, null, null, l1e0.d(keo0Var.f + i, 0, i2 - 1), 991)));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        jeo0 jeo0Var = (jeo0) obj;
        jeo0Var.getClass();
        super.x(jeo0Var);
        if (jeo0Var instanceof feo0) {
            int i = ((feo0) jeo0Var).f9416a;
            c4m0 c4m0Var = this.t;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.t = i3t0.L(this, new fnq(new i89(this.s.f34454a.d.f24943a, (byte) 22), new mc0(i, this, (yje) null), (byte) 4), null, null, 3);
                return;
            }
            return;
        }
        if (jeo0Var.equals(eeo0.f7682a)) {
            e3c.n(this.t);
            return;
        }
        if (!(jeo0Var instanceof heo0)) {
            if (jeo0Var.equals(geo0.f11166a)) {
                M(1);
                return;
            } else if (jeo0Var.equals(ieo0.f14643a)) {
                M(-1);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        String str = ((heo0) jeo0Var).f12933a;
        this.q.t(((keo0) D()).g, "extended_rating");
        this.r.f44833a.a(tx3.l0(new k1p[]{new i1p(((keo0) D()).g, (byte) 2), new j1p("extended_rating", (byte) 0)}), 3110L);
        long j = ((keo0) D()).h;
        ((zfm0) this.p).getClass();
        FragmentScreen fragmentScreenD = rl70.d(j, str, "");
        i1w0 i1w0Var = this.o;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        if (fragmentScreenD instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenD)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenD)));
        }
        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
