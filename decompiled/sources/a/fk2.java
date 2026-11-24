package a;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.favorites.impl.FavoritesInternalNavigation$favoriteCategory$1;
import org.xplatform.favorites.impl.presentation.category.FavoriteCategoryUiState;

/* JADX INFO: loaded from: classes4.dex */
public final class fk2 extends i3t0 {
    public static final /* synthetic */ int K = 0;
    public final yzn0 A;
    public final z8u B;
    public final msu C;
    public final m1e D;
    public final svu E;
    public final mne F;
    public final duj G;
    public final kys0 H;
    public c4m0 I;
    public bby J;
    public final j3c o;
    public final luu p;
    public final i1w0 q;
    public final vjp r;
    public final chf0 s;
    public final y3v t;
    public final hzg u;
    public final nvu v;
    public final fvt0 w;
    public final nv20 x;
    public final ifp y;
    public final g2v z;

    /* JADX WARN: Illegal instructions before constructor call */
    public fk2(vzg0 vzg0Var, j3c j3cVar, luu luuVar, i1w0 i1w0Var, vjp vjpVar, chf0 chf0Var, y3v y3vVar, hzg hzgVar, nvu nvuVar, fvt0 fvt0Var, nv20 nv20Var, ifp ifpVar, g2v g2vVar, yzn0 yzn0Var, z8u z8uVar, msu msuVar, m1e m1eVar, svu svuVar, mne mneVar, ctf0 ctf0Var, duj dujVar, pru pruVar, kys0 kys0Var) {
        i1w0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        super(new hc0(pruVar, (byte) 3), g090VarP, new uc(ctf0Var, (byte) 24), (yzn0) null);
        this.o = j3cVar;
        this.p = luuVar;
        this.q = i1w0Var;
        this.r = vjpVar;
        this.s = chf0Var;
        this.t = y3vVar;
        this.u = hzgVar;
        this.v = nvuVar;
        this.w = fvt0Var;
        this.x = nv20Var;
        this.y = ifpVar;
        this.z = g2vVar;
        this.A = yzn0Var;
        this.B = z8uVar;
        this.C = msuVar;
        this.D = m1eVar;
        this.E = svuVar;
        this.F = mneVar;
        this.G = dujVar;
        this.H = kys0Var;
        i3t0.K(this, null, null, new ak2(this, null, (byte) 0), 3);
    }

    public final void M() {
        Object value;
        bby bbyVar = this.J;
        if (bbyVar == null || !bbyVar.isActive()) {
            if ((((pj2) D()).c instanceof jj2) && ((pj2) D()).g) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, pj2.a((pj2) value, null, false, lj2.f20133a, false, false, false, false, 251)));
            }
            this.J = sac.V(jiu0.a(this), new bk2(1, this, fk2.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, this.F.b, new oa((Object) this, (yje) null, (byte) 13), 10);
        }
    }

    public final Object N(final tj2 tj2Var, dk2 dk2Var) {
        Object next;
        boolean z = tj2Var.f instanceof qgb;
        final byte b = 0;
        final byte b2 = 1;
        i1w0 i1w0Var = this.q;
        if (z) {
            Iterator it = this.p.f20692a.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                lok0 lok0Var = (lok0) next;
                if (lok0Var.f20396a == tj2Var.b && rz4.C(1, lok0Var.t)) {
                    break;
                }
            }
            lok0 lok0Var2 = (lok0) next;
            if (lok0Var2 == null) {
                Object objP = P(tj2Var, dk2Var);
                return objP == wne.f39444a ? objP : Unit.f46060a;
            }
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            k0w0VarI.h(this.t.h(lok0Var2.f20396a, lok0Var2.b));
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        } else if (tj2Var.d == 189 && ((pj2) D()).h.c.d) {
            i1w0Var.d(new Function1(this) { // from class: a.sj2
                public final /* synthetic */ fk2 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b3 = b;
                    tj2 tj2Var2 = tj2Var;
                    fk2 fk2Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj;
                    switch (b3) {
                        case 0:
                            k0w0Var.getClass();
                            k0w0Var.h(fk2Var.H.d(tj2Var2.f.b(), tj2Var2.c));
                            break;
                        default:
                            k0w0Var.getClass();
                            ifp ifpVar = fk2Var.y;
                            FavoriteCategoryUiState.Championship championship = new FavoriteCategoryUiState.Championship(tj2Var2.f34033a, tj2Var2.c);
                            ifpVar.getClass();
                            k0w0Var.h(new FavoritesInternalNavigation$favoriteCategory$1(ifpVar, championship));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        } else {
            i1w0Var.d(new Function1(this) { // from class: a.sj2
                public final /* synthetic */ fk2 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b3 = b2;
                    tj2 tj2Var2 = tj2Var;
                    fk2 fk2Var = this.b;
                    k0w0 k0w0Var = (k0w0) obj;
                    switch (b3) {
                        case 0:
                            k0w0Var.getClass();
                            k0w0Var.h(fk2Var.H.d(tj2Var2.f.b(), tj2Var2.c));
                            break;
                        default:
                            k0w0Var.getClass();
                            ifp ifpVar = fk2Var.y;
                            FavoriteCategoryUiState.Championship championship = new FavoriteCategoryUiState.Championship(tj2Var2.f34033a, tj2Var2.c);
                            ifpVar.getClass();
                            k0w0Var.h(new FavoritesInternalNavigation$favoriteCategory$1(ifpVar, championship));
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        }
        return Unit.f46060a;
    }

    public final void O(Throwable th) {
        Object value;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            th.getClass();
        } while (!p7m0Var.m(value, pj2.a((pj2) value, null, false, new jj2(th), false, false, false, false, 235)));
        this.G.b(th, new ma2((byte) 12));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P(tj2 tj2Var, zje zjeVar) {
        ek2 ek2Var;
        int i;
        long j;
        if (zjeVar instanceof ek2) {
            ek2Var = (ek2) zjeVar;
            int i2 = ek2Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ek2Var.l = i2 - Integer.MIN_VALUE;
            } else {
                ek2Var = new ek2(this, zjeVar);
            }
        } else {
            ek2Var = new ek2(this, zjeVar);
        }
        Object objB = ek2Var.j;
        wne wneVar = wne.f39444a;
        int i3 = ek2Var.l;
        if (i3 == 0) {
            z1x.P(objB);
            i = tj2Var.g;
            if (i == -1) {
                long j2 = tj2Var.d;
                if (j2 == 40) {
                    i = CyberGamesPage.Real.INSTANCE.f46556a;
                } else {
                    ek2Var.i = tj2Var;
                    ek2Var.l = 1;
                    objB = this.C.b(j2, ek2Var);
                    if (objB == wneVar) {
                        return wneVar;
                    }
                }
            }
            int i4 = i;
            j = tj2Var.e;
            if (j == 0) {
                j = tj2Var.d;
            }
            long j3 = j;
            long jB = tj2Var.f.b();
            String str = tj2Var.c;
            k1g k1gVar = k1g.OPEN_REGULAR;
            ((uzg) this.u).f(str, j3, jB, i4);
            return Unit.f46060a;
        }
        if (i3 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tj2Var = ek2Var.i;
        z1x.P(objB);
        i = ((ril0) objB).e ? CyberGamesPage.Virtual.INSTANCE.f46556a : CyberGamesPage.OneXCyber.INSTANCE.f46556a;
        int i5 = i;
        j = tj2Var.e;
        if (j == 0) {
            j = tj2Var.d;
        }
        long j4 = j;
        long jB2 = tj2Var.f.b();
        String str2 = tj2Var.c;
        k1g k1gVar2 = k1g.OPEN_REGULAR;
        ((uzg) this.u).f(str2, j4, jB2, i5);
        return Unit.f46060a;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        dj2 dj2Var = (dj2) obj;
        dj2Var.getClass();
        super.x(dj2Var);
        if (dj2Var.equals(si2.f32243a)) {
            E();
            return;
        }
        yje yjeVar = null;
        if (dj2Var.equals(ri2.f30518a)) {
            c4m0 c4m0Var = this.I;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            bby bbyVar = this.J;
            if (bbyVar != null) {
                bbyVar.cancel(null);
                return;
            }
            return;
        }
        final byte b = 1;
        if (dj2Var.equals(ti2.f33986a)) {
            c4m0 c4m0Var2 = this.I;
            if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                this.I = slb.U(new dnq(new fnq(this.D.b(), new pa((Object) this, yjeVar, (byte) 25), (byte) 4), new ck2(this, yjeVar, b), (byte) 1), d5c.S(jiu0.a(this), this.F.f22085a));
                return;
            }
            return;
        }
        boolean zEquals = dj2Var.equals(yi2.f42665a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zEquals) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value3, pj2.a((pj2) value3, null, false, null, false, false, true, true, 159)));
            M();
            return;
        }
        if (dj2Var.equals(aj2.f953a)) {
            v3c.N(this.J);
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, pj2.a((pj2) value2, null, false, null, false, true, true, true, 143)));
            M();
            return;
        }
        if (dj2Var.equals(bj2.f2684a)) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, pj2.a((pj2) value, null, false, null, false, false, false, false, 247)));
            return;
        }
        boolean z = dj2Var instanceof zi2;
        i1w0 i1w0Var = this.q;
        if (z) {
            zi2 zi2Var = (zi2) dj2Var;
            i1w0Var.d(new sl1(zi2Var.b, (i3t0) this, zi2Var.f44420a, (byte) 3));
            return;
        }
        if (dj2Var instanceof cj2) {
            cj2 cj2Var = (cj2) dj2Var;
            byte b2 = 1;
            i3t0.K(this, null, null, new dk2(b2, cj2Var.f4440a, null, this, cj2Var.b), 3);
            return;
        }
        final byte b3 = 0;
        if (!dj2Var.equals(vi2.f37456a)) {
            if (dj2Var.equals(ui2.f35709a)) {
                i1w0Var.d(new Function1(this) { // from class: a.rj2
                    public final /* synthetic */ fk2 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b4 = b3;
                        yje yjeVar2 = null;
                        fk2 fk2Var = this.b;
                        byte b5 = 1;
                        k0w0 k0w0Var = (k0w0) obj2;
                        switch (b4) {
                            case 0:
                                k0w0Var.getClass();
                                k0w0Var.h(fk2Var.r.b(j700.b, new d8h0(1, null), xun.f41520a, -1L, ""));
                                break;
                            default:
                                k0w0Var.getClass();
                                c8d c8dVar = (c8d) k0w0Var.b(new b1w0(new ak2(fk2Var, yjeVar2, b5))).f14945a;
                                bjk bjkVar = cfx0.o;
                                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                return;
            }
            if (dj2Var.equals(xi2.f40922a)) {
                G(oj2.f25340a);
                return;
            } else if (dj2Var.equals(wi2.f39193a)) {
                i1w0Var.d(new Function1(this) { // from class: a.rj2
                    public final /* synthetic */ fk2 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b4 = b;
                        yje yjeVar2 = null;
                        fk2 fk2Var = this.b;
                        byte b5 = 1;
                        k0w0 k0w0Var = (k0w0) obj2;
                        switch (b4) {
                            case 0:
                                k0w0Var.getClass();
                                k0w0Var.h(fk2Var.r.b(j700.b, new d8h0(1, null), xun.f41520a, -1L, ""));
                                break;
                            default:
                                k0w0Var.getClass();
                                c8d c8dVar = (c8d) k0w0Var.b(new b1w0(new ak2(fk2Var, yjeVar2, b5))).f14945a;
                                bjk bjkVar = cfx0.o;
                                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                return;
            } else {
                t9f.b();
                return;
            }
        }
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
