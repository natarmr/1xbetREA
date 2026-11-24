package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function2;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.security.impl.presentation.secret_question.screens.SecretQuestionScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class zuh0 extends w46 {
    public final sek A;
    public final ik4 B;
    public final au0 C;
    public final ik4 D;
    public final ol60 E;
    public final p7m0 F;
    public final List G;
    public final p7m0 H;
    public final a8z I;
    public bby J;
    public bby K;
    public bby L;
    public boolean M;
    public final qu b;
    public final phf0 c;
    public final cyh d;
    public final zlt0 e;
    public final jof0 f;
    public final bzt g;
    public final pru h;
    public final rou i;
    public final z4w0 j;
    public final vd1 k;
    public final zg l;
    public final vd1 m;
    public final zn00 n;
    public final jh70 o;
    public final mi70 p;
    public final mne q;
    public final g2v r;
    public final duj s;
    public final ctf0 t;
    public final m1e u;
    public final jh70 v;
    public final abu w;
    public final svs0 x;
    public final qgd y;
    public final i1w0 z;

    public zuh0(vzg0 vzg0Var, qu quVar, phf0 phf0Var, cyh cyhVar, zlt0 zlt0Var, jof0 jof0Var, bzt bztVar, pru pruVar, rou rouVar, z4w0 z4w0Var, vd1 vd1Var, zg zgVar, vd1 vd1Var2, zn00 zn00Var, jh70 jh70Var, mi70 mi70Var, mne mneVar, g2v g2vVar, duj dujVar, ctf0 ctf0Var, m1e m1eVar, jh70 jh70Var2, abu abuVar, svs0 svs0Var, qgd qgdVar, i1w0 i1w0Var, sek sekVar, ik4 ik4Var, au0 au0Var, ik4 ik4Var2) {
        i1w0Var.getClass();
        this.b = quVar;
        this.c = phf0Var;
        this.d = cyhVar;
        this.e = zlt0Var;
        this.f = jof0Var;
        this.g = bztVar;
        this.h = pruVar;
        this.i = rouVar;
        this.j = z4w0Var;
        this.k = vd1Var;
        this.l = zgVar;
        this.m = vd1Var2;
        this.n = zn00Var;
        this.o = jh70Var;
        this.p = mi70Var;
        this.q = mneVar;
        this.r = g2vVar;
        this.s = dujVar;
        this.t = ctf0Var;
        this.u = m1eVar;
        this.v = jh70Var2;
        this.w = abuVar;
        this.x = svs0Var;
        this.y = qgdVar;
        this.z = i1w0Var;
        this.A = sekVar;
        this.B = ik4Var;
        this.C = au0Var;
        this.D = ik4Var2;
        this.E = new ol60(3);
        this.F = q7m0.a(Boolean.FALSE);
        List listJ = q3d.j(new jth0(), new hth0(), new ith0(), new gth0(false), new gth0(false), new gth0(false), new gth0(false), new gth0(false), new gth0(true));
        this.G = listJ;
        this.H = q7m0.a(new suh0(listJ));
        this.I = maz.a(wez.b, new guh0(this, (byte) 0));
        fsh0 fsh0Var = fsh0.f10063a;
    }

    public final void A() {
        sac.V(jiu0.a(this), new jjh0(1, this, zuh0.class, "onLoadingError", "onLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 29), null, this.q.f22085a, new xuh0(this, null, (byte) 5), 10);
    }

    public final void B(dth0 dth0Var, boolean z) {
        List list;
        int iIndexOf;
        Object value;
        if (dth0Var instanceof cth0) {
            p7m0 p7m0Var = this.H;
            Object value2 = p7m0Var.getValue();
            quh0 quh0Var = value2 instanceof quh0 ? (quh0) value2 : null;
            if (quh0Var != null && (iIndexOf = (list = quh0Var.b).indexOf(dth0Var)) >= 0) {
                ArrayList arrayList = new ArrayList(list);
                cth0 cth0Var = (cth0) dth0Var;
                boolean z2 = !cth0Var.g;
                ssh0 ssh0Var = cth0Var.f4936a;
                boolean z3 = cth0Var.b;
                int i = cth0Var.c;
                String str = cth0Var.d;
                String str2 = cth0Var.e;
                int i2 = cth0Var.f;
                i8m0 i8m0Var = cth0Var.i;
                boolean z4 = cth0Var.j;
                boolean z5 = cth0Var.k;
                str.getClass();
                arrayList.set(iIndexOf, new cth0(ssh0Var, z3, i, str, str2, i2, z2, z, i8m0Var, z4, z5));
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new quh0(quh0Var.f29345a, arrayList, quh0Var.c)));
            }
        }
    }

    public final void w(bvc bvcVar, Function2 function2) {
        sac.V(bvcVar, vuh0.f38048a, null, this.q.f22085a, new due0(2, function2, Function2.class, "invoke", "invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0, (byte) 21), 10);
    }

    public final void x() {
        v3c.N(this.J);
        this.J = sac.V(jiu0.a(this), new jjh0(1, this, zuh0.class, "onLoadingError", "onLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, this.q.f22085a, new xuh0(this, null, (byte) 0), 10);
    }

    public final void y() {
        Boolean bool = Boolean.TRUE;
        p7m0 p7m0Var = this.F;
        p7m0Var.getClass();
        p7m0Var.o(null, bool);
        x();
    }

    public final void z(boolean z) {
        if (z) {
            w(jiu0.a(this), new uuh0(this, null, (byte) 3));
            return;
        }
        i1w0 i1w0Var = this.z;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        this.y.getClass();
        FragmentScreen secretQuestionScreen = new SecretQuestionScreen();
        if (secretQuestionScreen instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) secretQuestionScreen)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(secretQuestionScreen)));
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
