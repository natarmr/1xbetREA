package org.xplatform.favorites.impl.presentation.category;

import a.a5p;
import a.a6u;
import a.b1j;
import a.bby;
import a.c4m0;
import a.c8d;
import a.ctf0;
import a.cvm0;
import a.cyu;
import a.d5c;
import a.did;
import a.duj;
import a.e3c;
import a.ebc;
import a.fnq;
import a.foe;
import a.g090;
import a.g2v;
import a.gmo;
import a.hij;
import a.hjd;
import a.i1w0;
import a.i3t0;
import a.j3c;
import a.jiu0;
import a.l3p;
import a.lbu;
import a.luu;
import a.m1e;
import a.m3p;
import a.maz;
import a.mlb;
import a.mne;
import a.n0o0;
import a.n3p;
import a.ntl;
import a.o3p;
import a.ocj;
import a.oe50;
import a.oyg0;
import a.p0w0;
import a.p3p;
import a.p7m0;
import a.paw;
import a.pru;
import a.q3p;
import a.qz40;
import a.r3p;
import a.r9u;
import a.s31;
import a.s3p;
import a.sac;
import a.svu;
import a.t3p;
import a.t9f;
import a.u3p;
import a.uid;
import a.v3p;
import a.v4p;
import a.vid;
import a.vzg0;
import a.w3p;
import a.wgh0;
import a.x3p;
import a.x4p;
import a.y78;
import a.y7d;
import a.yhn;
import a.yzn0;
import a.zn00;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i3t0 {
    public static final /* synthetic */ int L = 0;
    public final mne A;
    public final duj B;
    public final svu C;
    public final r9u D;
    public final n0o0 E;
    public final qz40 F;
    public bby G;
    public c4m0 H;
    public c4m0 I;
    public bby J;
    public final boolean K;
    public final i1w0 o;
    public final a6u p;
    public final hjd q;
    public final zn00 r;
    public final luu s;
    public final mne t;
    public final j3c u;
    public final FavoriteCategoryUiState v;
    public final s31 w;
    public final cyu x;
    public final pru y;
    public final m1e z;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(vzg0 vzg0Var, g2v g2vVar, i1w0 i1w0Var, a6u a6uVar, y78 y78Var, ctf0 ctf0Var, hjd hjdVar, zn00 zn00Var, luu luuVar, mne mneVar, j3c j3cVar, FavoriteCategoryUiState favoriteCategoryUiState, s31 s31Var, cyu cyuVar, pru pruVar, m1e m1eVar, mne mneVar2, duj dujVar, svu svuVar, lbu lbuVar, r9u r9uVar) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        g090 g090VarP = cvm0.p(mneVar2.c, mneVar2.f22085a);
        super(new gmo(favoriteCategoryUiState, g2vVar, (byte) 2), g090VarP, new mlb(ctf0Var, y78Var, g2vVar, (byte) 5), (yzn0) null);
        this.o = i1w0Var;
        this.p = a6uVar;
        this.q = hjdVar;
        this.r = zn00Var;
        this.s = luuVar;
        this.t = mneVar;
        this.u = j3cVar;
        this.v = favoriteCategoryUiState;
        this.w = s31Var;
        this.x = cyuVar;
        this.y = pruVar;
        this.z = m1eVar;
        this.A = mneVar2;
        this.B = dujVar;
        this.C = svuVar;
        this.D = r9uVar;
        this.E = maz.b(new ntl(this, (byte) 25));
        this.F = vzg0Var.b();
        this.K = lbuVar.j();
        i3t0.K(this, null, null, new v4p(this, null, (byte) 1), 3);
    }

    public final void M(boolean z) {
        Object value;
        e3c.n(this.G);
        if (z) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, x4p.a((x4p) value, null, null, null, null, null, null, false, true, false, false, null, false, false, 16127)));
        }
        this.G = i3t0.K(this, null, new yhn((Object) this, (byte) 28), new v4p(this, null, (byte) 0), 1);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        p7m0 p7m0Var;
        Object value;
        Object value2;
        wgh0 wgh0Var;
        Object value3;
        p7m0 p7m0Var2;
        Object value4;
        uid uidVarN0;
        x3p x3pVar = (x3p) obj;
        x3pVar.getClass();
        super.x(x3pVar);
        if (x3pVar instanceof n3p) {
            c4m0 c4m0Var = this.I;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.I = sac.T(new fnq(this.z.b(), new hij(this, null, (byte) 19), (byte) 4), d5c.S(jiu0.a(this), this.A.f22085a), foe.h);
                return;
            }
            return;
        }
        if (x3pVar instanceof l3p) {
            e3c.n(this.G);
            e3c.n(this.I);
            e3c.n(this.J);
            return;
        }
        if (x3pVar instanceof m3p) {
            E();
            return;
        }
        if (x3pVar instanceof s3p) {
            M(false);
            return;
        }
        if (x3pVar instanceof v3p) {
            M(true);
            return;
        }
        if (x3pVar instanceof q3p) {
            q3p q3pVar = (q3p) x3pVar;
            if (q3pVar instanceof p3p) {
                uidVarN0 = ebc.n0(((p3p) x3pVar).f26309a);
            } else {
                if (!(q3pVar instanceof o3p)) {
                    t9f.b();
                    return;
                }
                uidVarN0 = ((o3p) x3pVar).f24596a;
            }
            i3t0.B(this, this.q, new vid[]{new did(CollectionsKt.q0(((x4p) D()).b, ((x4p) D()).c)), uidVarN0});
            return;
        }
        boolean zEquals = x3pVar.equals(r3p.f29799a);
        qz40 qz40Var = this.F;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (!zEquals) {
            if (!x3pVar.equals(w3p.f38512a)) {
                if (x3pVar.equals(t3p.f33279a)) {
                    G(a5p.f282a);
                    return;
                }
                if (!(x3pVar instanceof u3p)) {
                    t9f.b();
                    return;
                }
                String str = ((u3p) x3pVar).f35008a;
                do {
                    p7m0Var = (p7m0) qz40Var;
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, str));
                return;
            }
            boolean z = ((x4p) D()).k;
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, x4p.a((x4p) value2, null, null, null, null, null, null, false, false, false, !z, null, false, false, 15359)));
            int iOrdinal = b.a(this.v).ordinal();
            if (iOrdinal == 0) {
                wgh0Var = wgh0.FAVORITES_TEAM;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                wgh0Var = wgh0.FAVORITES_CHAMP;
            }
            this.w.g(wgh0Var);
            this.x.C(wgh0Var.f39117a);
            return;
        }
        if (((x4p) D()).k) {
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value3 = p7m0Var4.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value3, x4p.a((x4p) value3, null, null, null, null, null, null, false, false, false, false, null, false, false, 15359)));
            do {
                p7m0Var2 = (p7m0) qz40Var;
                value4 = p7m0Var2.getValue();
            } while (!p7m0Var2.m(value4, ""));
            return;
        }
        i1w0 i1w0Var = this.o;
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
}
