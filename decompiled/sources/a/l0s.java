package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes3.dex */
public final class l0s extends eiu0 implements f0s {
    public final ol60 A;
    public final qoj0 B;
    public final e1u c;
    public final npx d;
    public final pq e;
    public final jtj f;
    public final ywq0 g;
    public final zyt h;
    public final oeg0 i;
    public final mii0 j;
    public final x20 k;
    public final lbu l;
    public final njt0 m;
    public final ivn n;
    public final cad o;
    public final pmi p;
    public final ctf0 q;
    public final iqt r;
    public final pru s;
    public final vqc t;
    public final h3c u;
    public final bn6 v;
    public final je w;
    public final mne x;
    public List y;
    public ms2 z;

    public l0s(uf3 uf3Var, e1u e1uVar, npx npxVar, pq pqVar, jtj jtjVar, ywq0 ywq0Var, zyt zytVar, oeg0 oeg0Var, mii0 mii0Var, x20 x20Var, lbu lbuVar, ddk ddkVar, njt0 njt0Var, ivn ivnVar, cad cadVar, pmi pmiVar, ctf0 ctf0Var, iqt iqtVar, pru pruVar, vqc vqcVar, h3c h3cVar, bn6 bn6Var, je jeVar, mne mneVar) {
        oeg0Var.getClass();
        ctf0Var.getClass();
        this.c = e1uVar;
        this.d = npxVar;
        this.e = pqVar;
        this.f = jtjVar;
        this.g = ywq0Var;
        this.h = zytVar;
        this.i = oeg0Var;
        this.j = mii0Var;
        this.k = x20Var;
        this.l = lbuVar;
        this.m = njt0Var;
        this.n = ivnVar;
        this.o = cadVar;
        this.p = pmiVar;
        this.q = ctf0Var;
        this.r = iqtVar;
        this.s = pruVar;
        this.t = vqcVar;
        this.u = h3cVar;
        this.v = bn6Var;
        this.w = jeVar;
        this.x = mneVar;
        this.y = iun.f15405a;
        this.z = new ls2();
        this.A = new ol60(3);
        this.B = ckb.F();
    }

    public static d0t w(long j, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (qzb.i0((d0t) next) != j);
        if (next != null) {
            return (d0t) next;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            for (d0t d0tVar : ((d0t) it2.next()).k) {
                if (d0tVar.f5282a == j) {
                    next = d0tVar;
                }
            }
        }
        return (d0t) next;
    }

    public static boolean x(sjt0 sjt0Var) {
        if (sjt0Var != null) {
            if (sjt0Var instanceof ojt0) {
                return true;
            }
            if ((sjt0Var instanceof rjt0) || (sjt0Var instanceof qjt0) || (sjt0Var instanceof pjt0)) {
                return false;
            }
        }
        t9f.b();
        return false;
    }

    @Override // a.etr
    public final void b(kia kiaVar) {
        z(kiaVar.f18327a, kiaVar.c, kiaVar.d, kiaVar.e, GameBroadcastType.c, grs.b, kiaVar.f, kiaVar.g);
    }

    @Override // a.etr
    public final void c(mia miaVar) {
        z(miaVar.f21834a, miaVar.c, miaVar.d, miaVar.b, GameBroadcastType.c, grs.f11797a, miaVar.e, miaVar.f);
    }

    @Override // a.etr
    public final void d(oia oiaVar) {
        this.v.j(oiaVar.c, oiaVar.d, null);
        this.w.l(oiaVar.c, oiaVar.d, null);
        z(oiaVar.f25300a, oiaVar.c, oiaVar.d, oiaVar.e, GameBroadcastType.f47186a, grs.b, oiaVar.f, oiaVar.g);
    }

    @Override // a.f0s
    public final void e(zxj0 zxj0Var, m0k0 m0k0Var) {
        if (this.l.j()) {
            return;
        }
        sac.V(jiu0.a(s()), new dcr((byte) 11), null, null, new g6q((Object) this, (Object) m0k0Var, (Object) zxj0Var, (yje) null, (byte) 23), 14);
    }

    @Override // a.f0s
    public final gmq h() {
        return this.B;
    }

    @Override // a.etr
    public final void i(iia iiaVar) {
        sac.V(jiu0.a(s()), new dcr((byte) 8), null, null, new j0s(iiaVar, this, null, (byte) 0), 14);
    }

    @Override // a.f0s
    public final void j() {
        sac.V(jiu0.a(s()), new dcr((byte) 12), null, null, new gkr(this, null, (byte) 1), 14);
    }

    @Override // a.etr
    public final void k(nia niaVar) {
        ms2 ms2Var = this.z;
        String strV0 = ms2Var instanceof ks2 ? kpb.v0(ms2Var) : null;
        this.v.k(niaVar.d, niaVar.e, strV0);
        this.w.n(niaVar.d, niaVar.e, strV0);
        this.i.c().d(new g7p(this, niaVar));
    }

    @Override // a.f0s
    public final ol60 l() {
        return this.A;
    }

    @Override // a.etr
    public final void m(oia oiaVar) {
        z(oiaVar.f25300a, oiaVar.c, oiaVar.d, oiaVar.e, GameBroadcastType.b, grs.b, oiaVar.f, oiaVar.g);
    }

    @Override // a.f0s
    public final void n(m0k0 m0k0Var, m97 m97Var, boolean z) {
        sac.V(jiu0.a(s()), new dcr((byte) 10), null, null, new g6q(this, m0k0Var, m97Var, z, (yje) null), 14);
    }

    @Override // a.etr
    public final void o(lia liaVar) {
        mie0 mie0Var = new mie0();
        mie0Var.f21842a = liaVar;
        if (!this.r.f15225a.a()) {
            lia liaVar2 = (lia) mie0Var.f21842a;
            mie0Var.f21842a = new lia(liaVar2.f20093a, liaVar2.b, liaVar2.c, liaVar2.d, liaVar2.e, liaVar2.f, liaVar2.g, true);
        }
        this.i.c().d(new f5p(this, mie0Var, (byte) 27));
    }

    @Override // a.f0s
    public final void q(zxj0 zxj0Var, m0k0 m0k0Var) {
        sac.V(jiu0.a(s()), new dcr((byte) 13), null, null, new atj(this, m0k0Var, zxj0Var, null, (byte) 7), 14);
    }

    @Override // a.etr
    public final void r(iia iiaVar) {
        v(iiaVar, ctc.b);
    }

    public final void v(iia iiaVar, ctc ctcVar) {
        if (this.l.j()) {
            return;
        }
        sac.V(jiu0.a(s()), new dcr((byte) 9), null, null, new xb2((Object) iiaVar, (Object) this, (Object) ctcVar, (yje) null, (byte) 28), 14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object y(long j, long j2, long j3, long j4, zje zjeVar) {
        i0s i0sVar;
        long j5;
        Object obj;
        long j6;
        long j7;
        long j8;
        j1g j1gVar;
        if (zjeVar instanceof i0s) {
            i0sVar = (i0s) zjeVar;
            int i = i0sVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0sVar.o = i - Integer.MIN_VALUE;
            } else {
                i0sVar = new i0s(this, zjeVar);
            }
        } else {
            i0sVar = new i0s(this, zjeVar);
        }
        Object obj2 = i0sVar.m;
        wne wneVar = wne.f39444a;
        int i2 = i0sVar.o;
        if (i2 == 0) {
            z1x.P(obj2);
            i0sVar.i = j;
            i0sVar.j = j2;
            i0sVar.k = j3;
            j5 = j4;
            i0sVar.l = j5;
            i0sVar.o = 1;
            Object objB = this.u.b(j2, i0sVar);
            if (objB == wneVar) {
                return wneVar;
            }
            obj = objB;
            j6 = j;
            j7 = j2;
            j8 = j3;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j9 = i0sVar.l;
            j8 = i0sVar.k;
            j7 = i0sVar.j;
            long j10 = i0sVar.i;
            z1x.P(obj2);
            j5 = j9;
            obj = obj2;
            j6 = j10;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (j7 == 40) {
            j7 = j8;
        }
        l1g l1gVar = l1g.OPEN_SCREEN;
        if (j7 == 40) {
            j1gVar = j1g.REAL;
        } else {
            j1gVar = zBooleanValue ? j1g.SYNTHETIC : j1g.CYBER;
        }
        j1g j1gVar2 = j1gVar;
        ms2 ms2Var = this.z;
        boolean z = ms2Var instanceof tq2;
        vqc vqcVar = this.t;
        if (z || (ms2Var instanceof sq2) || (ms2Var instanceof uq2) || (ms2Var instanceof jq2) || (ms2Var instanceof kq2) || (ms2Var instanceof rq2)) {
            vqcVar.k(pzb.C(new h0s(j6, j7, this, j1gVar2, j5, (byte) 0)));
        } else {
            long j11 = j7;
            long j12 = j5;
            if (((ms2Var instanceof kr2) || (ms2Var instanceof jr2) || (ms2Var instanceof lr2)) && zBooleanValue) {
                vqcVar.k(pzb.C(new h0s(j6, j11, this, j1gVar2, j12, (byte) 1)));
            }
        }
        return Unit.f46060a;
    }

    public final void z(long j, long j2, long j3, boolean z, GameBroadcastType gameBroadcastType, grs grsVar, String str, long j4) {
        sac.V(jiu0.a(s()), null, null, this.x.f22085a, new k0s(this, j2, j, j3, j4, z, gameBroadcastType, grsVar, str, null), 11);
    }
}
