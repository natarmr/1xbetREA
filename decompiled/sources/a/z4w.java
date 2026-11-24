package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;
import org.xplatform.bet_history.edit_coupon.presentation.EditCouponFragmentScreen;
import org.xplatform.bethistory.sale.presentation.SaleScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class z4w extends eiu0 {
    public final a0c c;
    public final oif0 d;
    public final fhj e;
    public final o470 f;
    public final wwv g;
    public final o470 h;
    public final phf0 i;
    public final znt j;
    public final ctf0 k;
    public final ouu l;
    public final i1w0 m;
    public final duj n;
    public final mne o;
    public final gbi p;
    public final nrt q;
    public final q37 r;
    public final r9u s;
    public final p7m0 t;
    public final ol60 u;
    public n3w v;
    public sys0 w;
    public long x;

    public z4w(a0c a0cVar, oif0 oif0Var, fhj fhjVar, o470 o470Var, wwv wwvVar, o470 o470Var2, phf0 phf0Var, znt zntVar, ctf0 ctf0Var, ouu ouuVar, i1w0 i1w0Var, duj dujVar, mne mneVar, gbi gbiVar, s5w s5wVar, nrt nrtVar, q37 q37Var, r9u r9uVar, long j) {
        ctf0Var.getClass();
        s5wVar.getClass();
        r9uVar.getClass();
        this.c = a0cVar;
        this.d = oif0Var;
        this.e = fhjVar;
        this.f = o470Var;
        this.g = wwvVar;
        this.h = o470Var2;
        this.i = phf0Var;
        this.j = zntVar;
        this.k = ctf0Var;
        this.l = ouuVar;
        this.m = i1w0Var;
        this.n = dujVar;
        this.o = mneVar;
        this.p = gbiVar;
        this.q = nrtVar;
        this.r = q37Var;
        this.s = r9uVar;
        this.t = q7m0.a(new t4w(false));
        this.u = new ol60(3);
        this.x = j;
    }

    public final void A(n3w n3wVar, long j, sys0 sys0Var) {
        sys0Var.getClass();
        this.v = n3wVar;
        this.w = sys0Var;
        sac.V(jiu0.a(s()), new u4w(this, (byte) 2), null, this.o.b, new ir((Object) this, j, (Object) n3wVar, (yje) null, (byte) 17), 10);
    }

    public final void B() {
        n3w n3wVar = this.v;
        if (n3wVar == null) {
            return;
        }
        sac.V(jiu0.a(s()), new u4w(this, (byte) 4), null, null, new x4w(n3wVar, this, null), 14);
    }

    public final void C(boolean z) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.t;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, new t4w(z)));
    }

    public final void v(n3w n3wVar, boolean z) {
        if (z) {
            this.r.a(byv.m, bfb.n0(n3wVar.l), w(n3wVar));
        }
        sac.V(jiu0.a(s()), new u4w(this, (byte) 1), null, this.o.b, new e3p(this, null, (byte) 7), 10);
    }

    public final r6w w(n3w n3wVar) {
        return this.w == sys0.f33037a ? b34.w0(n3wVar.c) : r6w.i;
    }

    public final void x(long j) {
        n3w n3wVar = this.v;
        if (n3wVar == null) {
            return;
        }
        C(true);
        sac.V(jiu0.a(s()), new u4w(this, (byte) 3), null, this.o.b, new qe5((Object) this, (Object) n3wVar, j, (yje) null, (byte) 6), 10);
    }

    public final void y() {
        n3w n3wVar = this.v;
        if (n3wVar != null) {
            this.r.a(byv.j, bfb.n0(n3wVar.l), w(n3wVar));
            C(true);
            sac.V(jiu0.a(s()), new u4w(this, (byte) 0), null, this.o.b, new x4w(this, n3wVar, null, (byte) 1), 10);
        }
    }

    public final void z(d4w d4wVar, long j) {
        n3w n3wVar = this.v;
        if (n3wVar != null) {
            String str = n3wVar.f22868a;
            e4f e4fVar = n3wVar.l;
            this.x = j;
            int iOrdinal = d4wVar.ordinal();
            byte b = 2;
            byte b2 = 7;
            byte b3 = 0;
            ol60 ol60Var = this.u;
            yje yjeVar = null;
            mne mneVar = this.o;
            byte b4 = 1;
            i1w0 i1w0Var = this.m;
            q37 q37Var = this.r;
            switch (iOrdinal) {
                case 0:
                    q37Var.a(byv.c, bfb.n0(e4fVar), w(n3wVar));
                    ol60Var.f(new h4w(this.k.b.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str}, 1)), str));
                    break;
                case 1:
                    q37Var.a(byv.i, bfb.n0(e4fVar), w(n3wVar));
                    i1w0Var.d(new f3s(this, n3wVar, (byte) 26));
                    break;
                case 2:
                    q37Var.a(byv.d, bfb.n0(e4fVar), w(n3wVar));
                    C(true);
                    sac.V(jiu0.a(s()), new u4w(this, (byte) 6), null, mneVar.b, new x4w(this, n3wVar, yjeVar, b), 10);
                    break;
                case 3:
                    if (this.w == sys0.c) {
                        udk.e(d4wVar, "Unsupported item ");
                    } else {
                        q37Var.a(byv.f, bfb.n0(e4fVar), w(n3wVar));
                        this.f.f(n3wVar);
                        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                        FragmentScreen editCouponFragmentScreen = new EditCouponFragmentScreen(j);
                        if (editCouponFragmentScreen instanceof DialogScreen) {
                            copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) editCouponFragmentScreen)));
                        } else {
                            copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(editCouponFragmentScreen)));
                        }
                        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                        }
                    }
                    break;
                case 4:
                    q37Var.a(byv.g, bfb.n0(e4fVar), w(n3wVar));
                    if (!n3wVar.Y) {
                        k0w0 k0w0Var = new k0w0(i1w0Var);
                        k0w0Var.h(new SaleScreen(n3wVar, true, j, false));
                        ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorO2;
                            if (pawVar2.hasNext()) {
                                i1w0Var.a((oe50) pawVar2.next());
                            }
                        }
                    } else {
                        ol60Var.f(m4w.f21194a);
                    }
                    break;
                case 5:
                    q37Var.a(byv.h, bfb.n0(e4fVar), w(n3wVar));
                    k0w0 k0w0Var2 = new k0w0(i1w0Var);
                    k0w0Var2.h(new SaleScreen(n3wVar, false, j, false));
                    ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0Var2.f17489a, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorO3;
                        if (pawVar3.hasNext()) {
                            i1w0Var.a((oe50) pawVar3.next());
                        }
                        break;
                    }
                    break;
                case 6:
                    q37Var.a(byv.e, bfb.n0(e4fVar), w(n3wVar));
                    sac.V(jiu0.a(s()), new u4w(this, (byte) 7), null, mneVar.b, new y4w(this, n3wVar, yjeVar, b4), 10);
                    break;
                case 7:
                    int iOrdinal2 = n3wVar.c.ordinal();
                    if (iOrdinal2 != 1) {
                        if (iOrdinal2 == 2) {
                            if (str.length() == 0) {
                                str = n3wVar.b;
                            }
                            ol60Var.f(new n4w(str));
                        } else if (iOrdinal2 != 6) {
                            ol60Var.f(new n4w(str));
                        }
                    }
                    ol60Var.f(new n4w(""));
                    break;
                case 8:
                    q37Var.a(byv.l, bfb.n0(e4fVar), w(n3wVar));
                    C(true);
                    sac.V(jiu0.a(s()), new u4w(this, (byte) 5), null, mneVar.f22085a, new x4w(this, n3wVar, yjeVar, b3), 10);
                    break;
                case 9:
                    q37Var.a(byv.k, bfb.n0(e4fVar), w(n3wVar));
                    i1w0Var.d(new qi4(j, n3wVar, b2));
                    break;
                case 10:
                    v(n3wVar, true);
                    break;
                default:
                    t9f.b();
                    break;
            }
        }
    }
}
