package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class as6 extends w46 {
    public int A;
    public boolean B;
    public bby C;
    public final p7m0 D;
    public final p7m0 E;
    public final ol60 F;
    public final f7u b;
    public final gdu c;
    public final b8u d;
    public final edu e;
    public final f8u f;
    public final nt g;
    public final yk50 h;
    public final r4v i;
    public final lbu j;
    public final wsf0 k;
    public final lhf0 l;
    public final drt m;
    public final poq0 n;
    public final bn6 o;
    public final au0 p;
    public final mne q;
    public final i1w0 r;
    public final duj s;
    public final sa10 t;
    public final ctf0 u;
    public final xex v;
    public final f6k w;
    public final r9u x;
    public final n0o0 y;
    public final n0o0 z;

    public as6(f7u f7uVar, gdu gduVar, b8u b8uVar, edu eduVar, f8u f8uVar, nt ntVar, yk50 yk50Var, r4v r4vVar, lbu lbuVar, wsf0 wsf0Var, lhf0 lhf0Var, drt drtVar, pru pruVar, poq0 poq0Var, bn6 bn6Var, au0 au0Var, mne mneVar, i1w0 i1w0Var, duj dujVar, sa10 sa10Var, ctf0 ctf0Var, m1e m1eVar, xex xexVar, f6k f6kVar, r9u r9uVar) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        this.b = f7uVar;
        this.c = gduVar;
        this.d = b8uVar;
        this.e = eduVar;
        this.f = f8uVar;
        this.g = ntVar;
        this.h = yk50Var;
        this.i = r4vVar;
        this.j = lbuVar;
        this.k = wsf0Var;
        this.l = lhf0Var;
        this.m = drtVar;
        this.n = poq0Var;
        this.o = bn6Var;
        this.p = au0Var;
        this.q = mneVar;
        this.r = i1w0Var;
        this.s = dujVar;
        this.t = sa10Var;
        this.u = ctf0Var;
        this.v = xexVar;
        this.w = f6kVar;
        this.x = r9uVar;
        this.y = maz.b(new hc0(pruVar, (byte) 12));
        this.z = maz.b(new zo4(this, (byte) 22));
        byte b = 1;
        this.B = true;
        this.D = q7m0.a(deu.f5968a);
        this.E = q7m0.a(qsj0.f29262a);
        this.F = new ol60(3);
        yje yjeVar = null;
        sac.T(new fnq(m1eVar.b(), new zr6(this, yjeVar, b), (byte) 4), jiu0.a(this), new yp6(this, yjeVar, (byte) 3));
        sac.V(jiu0.a(this), new yr6(this, b), null, mneVar.b, new zr6(this, yjeVar, (byte) 0), 10);
    }

    public final void A() {
        ArrayList arrayListY = y(this.A);
        boolean zIsEmpty = arrayListY.isEmpty();
        p7m0 p7m0Var = this.D;
        if (zIsEmpty) {
            beu beuVar = new beu(z());
            p7m0Var.getClass();
            p7m0Var.o(null, beuVar);
        } else {
            aeu aeuVar = new aeu(x(), arrayListY, ((Boolean) this.z.getValue()).booleanValue());
            p7m0Var.getClass();
            p7m0Var.o(null, aeuVar);
        }
    }

    public final void B() {
        if (this.g.a()) {
            C();
            return;
        }
        sac.V(jiu0.a(this), new ur6(1, this, as6.class, "emitShowSnackBarWithDefaultErrorMessage", "emitShowSnackBarWithDefaultErrorMessage(Ljava/lang/Throwable;)V", 0, (byte) 2), null, null, new wa(this, null, (byte) 23), 14);
    }

    public final void C() {
        v3c.N(this.C);
        this.k.p();
        i1w0 i1w0Var = this.r;
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

    public final void D() {
        ceu ceuVar = new ceu(sa10.b(this.t, pb10.g, R.string.data_retrieval_error, 0, null, 28));
        p7m0 p7m0Var = this.D;
        p7m0Var.getClass();
        p7m0Var.o(null, ceuVar);
    }

    @Override // a.diu0
    public final void v() {
        this.w.a(bm5.k);
    }

    public final void w() {
        rsj0 rsj0Var = new rsj0(this.h.g() && !this.j.j());
        p7m0 p7m0Var = this.E;
        p7m0Var.getClass();
        p7m0Var.o(null, rsj0Var);
    }

    public final ArrayList x() {
        ArrayList<vil0> arrayList = ((gs6) ((mii0) this.d.f2175a).c).b;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (vil0 vil0Var : arrayList) {
            int i = this.A;
            vil0Var.getClass();
            int i2 = vil0Var.f37485a;
            arrayList2.add(new p3l0(vil0Var.c, i2, i2 == i));
        }
        return arrayList2;
    }

    public final ArrayList y(int i) {
        String string;
        v5l0 v5l0Var;
        as6 as6Var = this;
        gio gioVar = ((gs6) as6Var.f.f9125a.c).g;
        List listA = as6Var.c.a(i);
        ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            mms mmsVar = (mms) it.next();
            bq6 bq6Var = ((sff0) as6Var.y.getValue()).g.C;
            boolean zH = as6Var.u.h();
            mmsVar.getClass();
            d9a0 d9a0Var = mmsVar.j;
            gioVar.getClass();
            int i2 = mmsVar.f22057a;
            String str = mmsVar.d;
            int i3 = mmsVar.e;
            String str2 = mmsVar.f;
            String str3 = mmsVar.g;
            String str4 = mmsVar.h;
            d9a0 d9a0Var2 = mmsVar.i;
            lc00 lc00VarW = xsm0.w(d9a0Var2.b, mmsVar.l);
            lc00 lc00VarW2 = xsm0.w(d9a0Var.b, mmsVar.m);
            String str5 = gioVar.f11358a;
            String str6 = gioVar.b;
            String str7 = gioVar.c;
            gio gioVar2 = gioVar;
            long j = mmsVar.b;
            if (j != 0) {
                bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                rz4.s(j, ".svg", bzuVarD);
                string = ((StringBuilder) bzuVarD.b).toString();
            } else {
                string = "";
            }
            String str8 = string;
            int iOrdinal = bq6Var.ordinal();
            if (iOrdinal == 0) {
                v5l0Var = v5l0.LARGE_CARD_LARGE_SPORT_ICON;
            } else if (iOrdinal == 1) {
                v5l0Var = v5l0.SMALL_CARD_NO_TEAM_LOGO;
            } else if (iOrdinal == 2) {
                v5l0Var = v5l0.MEDIUM_CARD_SMALL_TEAM_LOGO;
            } else if (iOrdinal == 3) {
                v5l0Var = v5l0.LARGE_CARD_WATERMARK;
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                v5l0Var = v5l0.LARGE_CARD_LARGE_TEAM_LOGO;
            }
            arrayList.add(new cws(i2, v5l0Var, str8, str, i3, str2, str3, str4, d9a0Var2, d9a0Var, lc00VarW, lc00VarW2, str5, str6, str7, zH));
            as6Var = this;
            it = it;
            gioVar = gioVar2;
        }
        return arrayList;
    }

    public final ra10 z() {
        return sa10.b(this.t, pb10.g, R.string.empty_event, 0, null, 28);
    }
}
