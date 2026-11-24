package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.statistic.tennis.impl.wins_and_losses.presentation.actual.filter.FilterWinLossScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class x0q0 extends i3t0 {
    public static final /* synthetic */ int B = 0;
    public c4m0 A;
    public final String o;
    public final String p;
    public final pyu q;
    public final n4u r;
    public final w1u s;
    public final fck0 t;
    public final w4u u;
    public final zqt v;
    public final mne w;
    public final i1w0 x;
    public final duj y;
    public final m1e z;

    public x0q0(String str, String str2, pyu pyuVar, n4u n4uVar, w1u w1uVar, fck0 fck0Var, w4u w4uVar, zqt zqtVar, ctf0 ctf0Var, ocl oclVar, mne mneVar, i1w0 i1w0Var, duj dujVar, m1e m1eVar) {
        str.getClass();
        ctf0Var.getClass();
        i1w0Var.getClass();
        m1eVar.getClass();
        ozp0 ozp0Var = new ozp0((byte) 4);
        gpb0 gpb0Var = new gpb0(ctf0Var, oclVar, (byte) 16);
        rwj rwjVar = mneVar.f22085a;
        super(null, ozp0Var, gpb0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = str;
        this.p = str2;
        this.q = pyuVar;
        this.r = n4uVar;
        this.s = w1uVar;
        this.t = fck0Var;
        this.u = w4uVar;
        this.v = zqtVar;
        this.w = mneVar;
        this.x = i1w0Var;
        this.y = dujVar;
        this.z = m1eVar;
    }

    public final void M(boolean z) {
        mie0 mie0Var = new mie0();
        sac.V(jiu0.a(this), new itn0(mie0Var, this, (byte) 28), null, this.w.b, new eyc0(mie0Var, this, z, (yje) null), 10);
    }

    public final void N() {
        Object value;
        Object value2;
        rgv0 rgv0Var = (rgv0) this.s.f38418a.f17481a.f12247a;
        boolean zD = Intrinsics.d(rgv0Var, rgv0.g);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zD) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, p0q0.a((p0q0) value2, false, false, 26)));
            return;
        }
        k0q0 k0q0Var = this.v.f44822a;
        rgv0 rgv0Var2 = (rgv0) k0q0Var.f17481a.f12247a;
        boolean z = !new zzp0(rgv0Var2.b, rgv0Var2.f30457a).equals((zzp0) k0q0Var.f17481a.d);
        fck0 fck0Var = this.t;
        fck0Var.getClass();
        rgv0Var.getClass();
        k0q0 k0q0Var2 = ((zqt) fck0Var.b).f44822a;
        k0q0Var2.getClass();
        k0q0Var2.f17481a.f12247a = rgv0Var;
        ((rdq) fck0Var.c).a(new zzp0(rgv0Var.b, rgv0Var.f30457a));
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value = p7m0Var2.getValue();
            value.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var2.m(value, new p0q0(false, false, rgv0Var.equals(rgv0.g), z, rgv0Var)));
    }

    @Override // a.diu0
    public final void v() {
        LinkedHashMap linkedHashMap = d0q0.f5279a;
        String str = this.p;
        str.getClass();
        d0q0.f5279a.remove(str);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        wzp0 wzp0Var = (wzp0) obj;
        wzp0Var.getClass();
        if (wzp0Var.equals(qzp0.f29590a)) {
            if (((p0q0) D()).f26166a || ((p0q0) D()).b) {
                return;
            }
            N();
            return;
        }
        boolean zEquals = wzp0Var.equals(szp0.f33082a);
        byte b = 0;
        i1w0 i1w0Var = this.x;
        if (zEquals) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            FragmentScreen filterWinLossScreen = new FilterWinLossScreen(this.o);
            if (filterWinLossScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) filterWinLossScreen)));
            } else {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(filterWinLossScreen)));
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
        } else {
            if (!wzp0Var.equals(rzp0.f31374a)) {
                if (wzp0Var.equals(tzp0.f34816a)) {
                    M(true);
                    return;
                }
                yje yjeVar = null;
                if (!wzp0Var.equals(uzp0.f36547a)) {
                    if (!wzp0Var.equals(vzp0.f38309a)) {
                        t9f.b();
                        return;
                    }
                    c4m0 c4m0Var = this.A;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                        return;
                    }
                    return;
                }
                c4m0 c4m0Var2 = this.A;
                if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                    this.A = sac.T(new fnq(this.z.b(), new w0q0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), this.w.b), new bdl0(2, this, x0q0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 9));
                    return;
                }
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
