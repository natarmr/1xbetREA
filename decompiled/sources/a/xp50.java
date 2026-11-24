package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.javax.sip.message.Response;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class xp50 extends i3t0 {
    public static final /* synthetic */ int G = 0;
    public final nyt A;
    public final wv70 B;
    public final asi0 C;
    public final coi0 D;
    public final n0o0 E;
    public bby F;
    public final int o;
    public final boolean p;
    public final yo4 q;
    public final x20 r;
    public final qu s;
    public final mne t;
    public final zr1 u;
    public final uzc0 v;
    public final dst w;
    public final pru x;
    public final i1w0 y;
    public final duj z;

    public xp50(int i, boolean z, yo4 yo4Var, x20 x20Var, qu quVar, mne mneVar, zr1 zr1Var, uzc0 uzc0Var, dst dstVar, pru pruVar, i1w0 i1w0Var, duj dujVar, nyt nytVar, m1e m1eVar, bzt bztVar, ctf0 ctf0Var, wv70 wv70Var, asi0 asi0Var, coi0 coi0Var) {
        i1w0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        sk1 sk1Var = new sk1(bztVar, (byte) 4);
        v510 v510Var = new v510(ctf0Var, (byte) 13);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, sk1Var, v510Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = i;
        this.p = z;
        this.q = yo4Var;
        this.r = x20Var;
        this.s = quVar;
        this.t = mneVar;
        this.u = zr1Var;
        this.v = uzc0Var;
        this.w = dstVar;
        this.x = pruVar;
        this.y = i1w0Var;
        this.z = dujVar;
        this.A = nytVar;
        this.B = wv70Var;
        this.C = asi0Var;
        this.D = coi0Var;
        this.E = maz.b(new np30(this, (byte) 24));
        yje yjeVar = null;
        sac.T(new dnq(new fnq(m1eVar.b(), new w620((Object) this, yjeVar, (byte) 17), (byte) 4), new qos((Object) this, yjeVar, (byte) 16), (byte) 1), d5c.S(jiu0.a(this), rwjVar), wp50.h);
    }

    public final mdm M(int i, int i2, long j) {
        xuz xuzVar = pb10.c;
        pb10 pb10Var = pb10.g;
        int i3 = ((np50) D()).d;
        xuzVar.getClass();
        return new mdm(xuz.a(pb10Var, i3), null, null, 0, 0, i, 0, i2, j, 0L, Response.SESSION_NOT_ACCEPTABLE);
    }

    public final boolean N() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    public final void O() {
        Object value;
        bby bbyVar = this.F;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, np50.a((np50) value, true, null, null, null, 30)));
            this.F = sac.g0(jiu0.a(this), xp50.class.getName().concat(".loadBanners"), this.t.b, new r750(1, this, xp50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 9), new tp50(this, null, (byte) 0), 80);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P(zje zjeVar) {
        up50 up50Var;
        Object value;
        np50 np50Var;
        if (zjeVar instanceof up50) {
            up50Var = (up50) zjeVar;
            int i = up50Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                up50Var.k = i - Integer.MIN_VALUE;
            } else {
                up50Var = new up50(this, zjeVar);
            }
        } else {
            up50Var = new up50(this, zjeVar);
        }
        Object objA = up50Var.i;
        Object obj = wne.f39444a;
        int i2 = up50Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            mvc mvcVar = mvc.CMS_CODE_NEWS;
            up50Var.k = 1;
            objA = this.A.a(mvcVar, up50Var);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        List list = (List) objA;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            np50Var = (np50) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, np50.a(np50Var, false, list, iun.f15405a, list.isEmpty() ? M(R.string.promotions_empty, R.string.empty_str, 0L) : null, 8)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(boolean z, zje zjeVar) {
        vp50 vp50Var;
        Object objA;
        boolean z2;
        Object value;
        np50 np50Var;
        if (zjeVar instanceof vp50) {
            vp50Var = (vp50) zjeVar;
            int i = vp50Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                vp50Var.l = i - Integer.MIN_VALUE;
            } else {
                vp50Var = new vp50(this, zjeVar);
            }
        } else {
            vp50Var = new vp50(this, zjeVar);
        }
        Object obj = vp50Var.j;
        wne wneVar = wne.f39444a;
        int i2 = vp50Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            vp50Var.i = z;
            vp50Var.l = 1;
            objA = this.w.a(-1, vp50Var);
            if (objA == wneVar) {
                return wneVar;
            }
            z2 = z;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = vp50Var.i;
            z1x.P(obj);
            objA = obj;
            z2 = z3;
        }
        List list = (List) objA;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            np50Var = (np50) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, np50.a(np50Var, false, iun.f15405a, list, list.isEmpty() ? M(R.string.promotions_empty, R.string.empty_str, 0L) : null, 8)));
        if (z2) {
            i3t0.A(this, this.B, new ov70(this.o), null, null, 6);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        xs5 xs5Var;
        String str;
        mvc mvcVar;
        kr5 kr5Var;
        Object g0g0Var;
        Object next;
        bu50 bu50Var = (bu50) obj;
        bu50Var.getClass();
        boolean z = bu50Var instanceof wt50;
        i1w0 i1w0Var = this.y;
        if (!z) {
            boolean z2 = bu50Var instanceof xt50;
            x20 x20Var = this.r;
            yo4 yo4Var = this.q;
            ?? r8 = 0;
            Object obj2 = null;
            Object obj3 = null;
            if (!z2) {
                if (!(bu50Var instanceof yt50)) {
                    if (bu50Var instanceof zt50) {
                        O();
                        return;
                    }
                    if (bu50Var instanceof au50) {
                        E();
                        return;
                    }
                    if (!(bu50Var instanceof vt50)) {
                        t9f.b();
                        return;
                    }
                    bby bbyVar = this.F;
                    byte b = 1;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        this.F = sac.V(jiu0.a(this), new r750(1, this, xp50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 10), null, this.t.b, new tp50(this, r8, b), 10);
                        return;
                    }
                    return;
                }
                int i = ((yt50) bu50Var).f43201a;
                if (N()) {
                    for (Object obj4 : ((np50) D()).b) {
                        kj5 kj5Var = uo5.b;
                        mvc mvcVar2 = ((zvc) obj4).f45047a;
                        kj5Var.getClass();
                        if (kj5.e(mvcVar2).f35994a == i) {
                            obj3 = obj4;
                            break;
                        }
                    }
                    zvc zvcVar = (zvc) obj3;
                    if (zvcVar == null) {
                        return;
                    }
                    str = zvcVar.b;
                    mvcVar = zvcVar.f45047a;
                } else {
                    for (Object obj5 : ((np50) D()).c) {
                        if (((ft5) obj5).f10094a.f41399a == i) {
                            r8 = obj5;
                            break;
                        }
                    }
                    ft5 ft5Var = (ft5) r8;
                    if (ft5Var == null || (xs5Var = ft5Var.f10094a) == null) {
                        return;
                    }
                    str = xs5Var.b;
                    mvcVar = mvc.CMS_CODE_POPULAR;
                }
                String str2 = str;
                kj5 kj5Var2 = uo5.b;
                if (i == 76) {
                    yo4Var.k();
                }
                yo4Var.c(String.valueOf(i), "actions");
                x20Var.k(Integer.valueOf(i), y1p.ACTIONS);
                i1w0Var.d(new ec3((Object) this, i, (Object) str2, (Object) mvcVar, (byte) 11));
                return;
            }
            xt50 xt50Var = (xt50) bu50Var;
            int i2 = xt50Var.b;
            int i3 = xt50Var.f41448a;
            String str3 = xt50Var.c;
            if (!N()) {
                uo5.b.getClass();
                uo5 uo5VarF = kj5.f(i2);
                Iterator it = ((np50) D()).c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        kr5Var = null;
                        break;
                    }
                    Iterator it2 = ((ft5) it.next()).b.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (((q2b) next).f27993a.b != i3);
                    q2b q2bVar = (q2b) next;
                    if (q2bVar != null) {
                        kr5Var = q2bVar.f27993a;
                        break;
                    }
                }
                if (kr5Var == null) {
                    return;
                }
                rn50[] rn50VarArr = rn50.f30772a;
                oo5 oo5Var = kr5Var.n;
                String str4 = kr5Var.d;
                int i4 = kr5Var.b;
                Integer numA = ks60.a(oo5Var, str3);
                if (uo5VarF != uo5.NEWS) {
                    yo4Var.a("actions", i4, str4, numA != null ? String.valueOf(numA.intValue()) : null);
                    x20Var.d(i4, "actions", str4, numA != null ? Float.valueOf(numA.intValue()) : null);
                }
                int iOrdinal = uo5VarF.ordinal();
                if (iOrdinal == 3) {
                    yo4Var.b(i4, str4, "banner");
                    x20Var.e(i4, str4, "banner");
                } else if (iOrdinal == 8) {
                    String str5 = kr5Var.v;
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        String queryParameter = Uri.parse(str5).getQueryParameter(ParameterNames.ID);
                        g0g0Var = Long.valueOf(queryParameter != null ? Long.parseLong(queryParameter) : 0L);
                    } catch (Throwable th) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                    Throwable thA = j0g0.a(g0g0Var);
                    Object obj6 = g0g0Var;
                    if (thA != null) {
                        obj6 = 0L;
                    }
                    long jLongValue = ((Number) obj6).longValue();
                    if (jLongValue > 0) {
                        this.s.f(jLongValue);
                        this.u.k(jLongValue);
                    }
                }
            }
            int i5 = 0;
            for (Object obj7 : ((np50) D()).c) {
                if (((ft5) obj7).f10094a.f41399a == i2) {
                    obj2 = obj7;
                    break;
                }
            }
            ft5 ft5Var2 = (ft5) obj2;
            int i6 = -1000;
            if (ft5Var2 != null) {
                Iterator it3 = ft5Var2.b.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        i5 = -1;
                        break;
                    } else if (((q2b) it3.next()).f27993a.b == i3) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 >= 0) {
                    i6 = i5;
                }
            }
            i3t0.A(this, this.B, new nv70(i3, i6, i2), null, null, 6);
            return;
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
