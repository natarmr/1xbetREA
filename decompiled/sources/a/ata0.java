package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class ata0 extends i3t0 {
    public static final /* synthetic */ int S = 0;
    public final oeg0 A;
    public final j3c B;
    public final lbu C;
    public final ctf0 D;
    public final y78 E;
    public final gud F;
    public final z7z G;
    public final n4u H;
    public final njt0 I;
    public final z8u J;
    public final ivn K;
    public bby L;
    public bby M;
    public bby N;
    public c4m0 O;
    public bby P;
    public bby Q;
    public final ls2 R;
    public final long o;
    public final m1e p;
    public final mne q;
    public final tzi r;
    public final daf s;
    public final x4u t;
    public final owp0 u;
    public final pru v;
    public final w5z w;
    public final yk50 x;
    public final vpu y;
    public final vpu z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ata0(vzg0 vzg0Var, long j, m1e m1eVar, mne mneVar, tzi tziVar, daf dafVar, x4u x4uVar, owp0 owp0Var, pru pruVar, w5z w5zVar, yk50 yk50Var, vpu vpuVar, vpu vpuVar2, oeg0 oeg0Var, wdu wduVar, j3c j3cVar, lbu lbuVar, ctf0 ctf0Var, y78 y78Var, gud gudVar, z7z z7zVar, n4u n4uVar, duj dujVar, njt0 njt0Var, z8u z8uVar, ivn ivnVar, ocl oclVar) {
        m1eVar.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        z7zVar.getClass();
        byte b = 1;
        super(null, new l3a0(oclVar, (byte) 29), new iv80(ctf0Var, b), cvm0.p(mneVar.c, mneVar.f22085a), null);
        this.o = j;
        this.p = m1eVar;
        this.q = mneVar;
        this.r = tziVar;
        this.s = dafVar;
        this.t = x4uVar;
        this.u = owp0Var;
        this.v = pruVar;
        this.w = w5zVar;
        this.x = yk50Var;
        this.y = vpuVar;
        this.z = vpuVar2;
        this.A = oeg0Var;
        this.B = j3cVar;
        this.C = lbuVar;
        this.D = ctf0Var;
        this.E = y78Var;
        this.F = gudVar;
        this.G = z7zVar;
        this.H = n4uVar;
        this.I = njt0Var;
        this.J = z8uVar;
        this.K = ivnVar;
        this.R = new ls2();
        dvj dvjVar = mneVar.b;
        yje yjeVar = null;
        i3t0.K(this, dvjVar, null, new wsa0(this, yjeVar, (byte) 3), 2);
        i3t0.K(this, dvjVar, null, new ni2(this, null), 2);
        i3t0.K(this, dvjVar, null, new wsa0(this, yjeVar, b), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object M(m0k0 m0k0Var, hao haoVar, ctc ctcVar, zje zjeVar) {
        usa0 usa0Var;
        ctc ctcVar2;
        if (zjeVar instanceof usa0) {
            usa0Var = (usa0) zjeVar;
            int i = usa0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                usa0Var.l = i - Integer.MIN_VALUE;
            } else {
                usa0Var = new usa0(this, zjeVar);
            }
        } else {
            usa0Var = new usa0(this, zjeVar);
        }
        Object obj = usa0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = usa0Var.l;
        ls2 ls2Var = this.R;
        if (i2 == 0) {
            z1x.P(obj);
            if (this.C.j()) {
                return Unit.f46060a;
            }
            haoVar.getClass();
            long j = haoVar.c;
            rh7 rh7Var = haoVar.m;
            zxj0 zxj0Var = new zxj0(j, rh7Var.f30476a, haoVar.l, rh7Var.b, haoVar.k, haoVar.d, haoVar.f, haoVar.i, haoVar.q, haoVar.b, haoVar.e, haoVar.r, haoVar.t);
            gwe gweVarY = phu0.Y(ls2Var);
            usa0Var.i = ctcVar;
            usa0Var.l = 1;
            Object objF = gud.f(this.F, m0k0Var, zxj0Var, gweVarY, usa0Var);
            if (objF == wneVar) {
                return wneVar;
            }
            obj = objF;
            ctcVar2 = ctcVar;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ctcVar2 = usa0Var.i;
            z1x.P(obj);
        }
        G(new isa0(new njd((aud) obj, ctcVar2, ls2Var)));
        return Unit.f46060a;
    }

    public final void N() {
        Object value;
        if (!(((nsa0) D()).c instanceof in00)) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, nsa0.a((nsa0) value, null, new mn00(), null, false, null, false, null, 1019)));
        }
        bby bbyVar = this.N;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.N = I(this.q.b, new tsa0(this, (byte) 2), new zsa0(this, yjeVar, (byte) 1));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        asa0 asa0Var = (asa0) obj;
        asa0Var.getClass();
        super.x(asa0Var);
        boolean z = asa0Var instanceof zra0;
        byte b = 1;
        mne mneVar = this.q;
        yje yjeVar = null;
        z7z z7zVar = this.G;
        if (!z) {
            if (!(asa0Var instanceof pra0)) {
                t9f.b();
                return;
            }
            pra0 pra0Var = (pra0) asa0Var;
            if (pra0Var.equals(mra0.f22260a)) {
                E();
                return;
            }
            if (!pra0Var.equals(nra0.f23992a)) {
                if (!pra0Var.equals(ora0.f25727a)) {
                    t9f.b();
                    return;
                }
                v3c.N(this.O);
                v3c.N(this.L);
                v3c.N(this.M);
                v3c.N(this.N);
                v3c.N(this.Q);
                v3c.N(this.P);
                return;
            }
            bby bbyVar = this.P;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            Object obj2 = z7zVar.get();
            obj2.getClass();
            this.P = i3t0.F(this, (j3t0) obj2, null, null, new jfa0((byte) 9), 119);
            c4m0 c4m0Var = this.O;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.O = sac.T(new fnq(this.p.b(), new c670(this, yjeVar, (byte) 16), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), foe.h);
                return;
            }
            return;
        }
        zra0 zra0Var = (zra0) asa0Var;
        if (zra0Var instanceof yra0) {
            N();
            return;
        }
        byte b2 = 0;
        if (zra0Var instanceof tra0) {
            i3t0.K(this, mneVar.b, null, new vsa0(this, ((tra0) zra0Var).f34415a, yjeVar, b2), 2);
            return;
        }
        if (zra0Var instanceof vra0) {
            i3t0.K(this, mneVar.b, null, new vsa0(this, ((vra0) zra0Var).f37891a, yjeVar, b), 2);
            return;
        }
        boolean zEquals = zra0Var.equals(xra0.f41360a);
        byte b3 = 3;
        oeg0 oeg0Var = this.A;
        if (zEquals) {
            if (this.x.g()) {
                i3t0.K(this, mneVar.b, null, new wsa0(this, yjeVar, b2), 2);
                return;
            } else {
                oeg0Var.c().d(new tsa0(this, b3));
                return;
            }
        }
        if (zra0Var.equals(wra0.f39631a)) {
            l9s l9sVarB = rsa0.b((nsa0) D());
            if (l9sVarB == null) {
                return;
            }
            oeg0Var.c().d(new zga0(this, l9sVarB, b3));
            return;
        }
        if (!zra0Var.equals(rra0.f30973a)) {
            if (zra0Var instanceof sra0) {
                Object obj3 = z7zVar.get();
                obj3.getClass();
                i3t0.A(this, (j3t0) obj3, ebc.n0(((sra0) zra0Var).f32667a), null, null, 6);
                return;
            } else if (zra0Var instanceof qra0) {
                Object obj4 = z7zVar.get();
                obj4.getClass();
                i3t0.A(this, (j3t0) obj4, ((qra0) zra0Var).f29200a, null, null, 6);
                return;
            } else {
                if (!(zra0Var instanceof ura0)) {
                    t9f.b();
                    return;
                }
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, nsa0.a((nsa0) value, null, null, null, ((ura0) zra0Var).f36155a, null, false, null, 991)));
                return;
            }
        }
        i1w0 i1w0VarC = oeg0Var.c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarC.a((oe50) pawVar.next());
            }
        }
    }
}
