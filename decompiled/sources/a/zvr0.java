package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.toto_bet.tirage_parameters.presentation.TirageParametersTableScreen;
import org.xplatform.toto_bet.tiragecategoryresult.presentation.TirageCategoryDstScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class zvr0 extends i3t0 {
    public static final /* synthetic */ int E = 0;
    public final wyu A;
    public final c4m0 B;
    public bby C;
    public bby D;
    public final sa10 o;
    public final mne p;
    public final pyu q;
    public final khf0 r;
    public final ctu s;
    public final nv20 t;
    public final ctu u;
    public final usc v;
    public final zqc w;
    public final ctf0 x;
    public final i1w0 y;
    public final duj z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvr0(sa10 sa10Var, m1e m1eVar, mne mneVar, pyu pyuVar, khf0 khf0Var, ctu ctuVar, nv20 nv20Var, ctu ctuVar2, usc uscVar, zqc zqcVar, ctf0 ctf0Var, i1w0 i1w0Var, duj dujVar, wyu wyuVar) {
        super(null, new ck60(ctf0Var, ctuVar, wyuVar, (byte) 25), xvr0.f41575a, cvm0.p(mneVar.c, mneVar.f22085a), null);
        m1eVar.getClass();
        ctf0Var.getClass();
        wyuVar.getClass();
        this.o = sa10Var;
        this.p = mneVar;
        this.q = pyuVar;
        this.r = khf0Var;
        this.s = ctuVar;
        this.t = nv20Var;
        this.u = ctuVar2;
        this.v = uscVar;
        this.w = zqcVar;
        this.x = ctf0Var;
        this.y = i1w0Var;
        this.z = dujVar;
        this.A = wyuVar;
        c4m0 c4m0Var = this.B;
        if (c4m0Var != null) {
            v3c.N(c4m0Var);
        }
        this.B = sac.T(new fnq(m1eVar.b(), new z2n0(this, null, (byte) 28), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), new k5r0(2, this, zvr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 4, (byte) 10));
        P(true);
    }

    public final void M(boolean z) {
        sac.V(jiu0.a(this), new mjr0(1, this, zvr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, this.p.b, new fj3(z, (Object) this, (yje) null, (byte) 23), 10);
    }

    public final String N() {
        long jF = hfm0.F(this.s.f4960a.r().c);
        s9m0 s9m0Var = uaq0.f35345a;
        uaq0 uaq0VarA = this.A.a();
        s9m0Var.getClass();
        return p7x.z(s9m0.k(uaq0VarA), jF);
    }

    public final void O(Throwable th) {
        this.z.b(th, new htr0(th, this, (byte) 3));
    }

    public final void P(boolean z) {
        bby bbyVar = this.D;
        if (bbyVar != null) {
            v3c.N(bbyVar);
        }
        yje yjeVar = null;
        mne mneVar = this.p;
        if (z) {
            v3c.N(this.D);
            byte b = 1;
            this.D = sac.f0(jiu0.a(this), 400L, TimeUnit.MILLISECONDS, mneVar.f22085a, new mjr0(b, this, zvr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 22), new yvr0(this, yjeVar, b), 32);
        }
        bby bbyVar2 = this.C;
        if (bbyVar2 != null) {
            v3c.N(bbyVar2);
        }
        this.C = sac.g0(jiu0.a(this), "TotoTirageUdfViewModel_loadTirageData()", mneVar.b, new mjr0(1, this, zvr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 19), new gc1((Object) this, yjeVar, (byte) 27), 86);
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final void x(ivr0 ivr0Var) {
        Object value;
        Object value2;
        uvr0 uvr0Var;
        Object value3;
        uvr0 uvr0Var2;
        Object value4;
        ivr0Var.getClass();
        super.x(ivr0Var);
        if (ivr0Var.equals(xur0.f41525a)) {
            M(false);
            return;
        }
        boolean z = ivr0Var instanceof zur0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            zur0 zur0Var = (zur0) ivr0Var;
            String str = zur0Var.f45022a;
            String str2 = zur0Var.b;
            String str3 = zur0Var.c;
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value4 = p7m0Var.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value4, uvr0.a((uvr0) value4, null, null, false, 0, 0L, str, str2, str3, 63)));
            G(pvr0.f27676a);
            return;
        }
        if (ivr0Var instanceof avr0) {
            R();
            return;
        }
        if (ivr0Var.equals(cvr0.f5044a)) {
            G(svr0.f32883a);
            return;
        }
        boolean z2 = ivr0Var instanceof evr0;
        i1w0 i1w0Var = this.y;
        ctu ctuVar = this.s;
        if (z2) {
            int i = ((evr0) ivr0Var).f8486a;
            int i2 = ctuVar.f4960a.r().f20312a;
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            k0w0VarI.h(new TirageCategoryDstScreen(String.valueOf(i2), String.valueOf(i)));
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (!(ivr0Var instanceof fvr0)) {
                yje yjeVar = null;
                if (ivr0Var instanceof hvr0) {
                    int i3 = ((hvr0) ivr0Var).f13739a;
                    if (ctuVar.f4960a.r().f20312a == i3) {
                        return;
                    }
                    sac.V(jiu0.a(this), new mjr0(1, this, zvr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 21), null, this.p.b, new u52((Object) this, i3, yjeVar, (byte) 29), 10);
                    return;
                }
                if (ivr0Var.equals(wur0.f39804a)) {
                    E();
                    return;
                }
                if (ivr0Var.equals(dvr0.f6759a)) {
                    M(true);
                    return;
                }
                if (ivr0Var.equals(vur0.f38064a)) {
                    G(new qvr0(((uvr0) D()).h));
                    return;
                }
                if (ivr0Var.equals(bvr0.f3292a)) {
                    String strN = N();
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var2.getValue();
                        value3.getClass();
                        uvr0Var2 = (uvr0) value3;
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value3, uvr0.a(uvr0Var2, vvr0.a(uvr0Var2.f36362a, strN, null, null, 6), null, false, 0, 10000L, null, null, null, 478)));
                    P(true);
                    return;
                }
                if (ivr0Var.equals(yur0.f43283a)) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                        uvr0Var = (uvr0) value2;
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value2, uvr0.a(uvr0Var, vvr0.a(uvr0Var.f36362a, "", null, null, 6), null, false, 0, 0L, null, null, null, 510)));
                    return;
                }
                if (!ivr0Var.equals(gvr0.f11989a)) {
                    t9f.b();
                    return;
                }
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value = p7m0Var4.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value, uvr0.a((uvr0) value, null, null, false, 0, 0L, null, null, null, 507)));
                return;
            }
            int i4 = ((fvr0) ivr0Var).f10228a;
            int i5 = ctuVar.f4960a.r().f20312a;
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            FragmentScreen tirageParametersTableScreen = new TirageParametersTableScreen(i5, i4);
            if (tirageParametersTableScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) tirageParametersTableScreen)));
            } else {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(tirageParametersTableScreen)));
            }
            ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }

    public final void R() {
        sac.V(jiu0.a(this), new mjr0(1, this, zvr0.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 20), null, this.p.b, new yvr0(this, null, (byte) 0), 10);
    }
}
