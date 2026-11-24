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
public final class gt50 extends i3t0 {
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

    public gt50(int i, boolean z, yo4 yo4Var, x20 x20Var, qu quVar, mne mneVar, zr1 zr1Var, uzc0 uzc0Var, dst dstVar, pru pruVar, i1w0 i1w0Var, duj dujVar, nyt nytVar, m1e m1eVar, bzt bztVar, ctf0 ctf0Var, wv70 wv70Var, asi0 asi0Var, coi0 coi0Var) {
        i1w0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        sk1 sk1Var = new sk1(bztVar, (byte) 7);
        v510 v510Var = new v510(ctf0Var, (byte) 16);
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
        this.E = maz.b(new np30(this, (byte) 27));
        yje yjeVar = null;
        sac.T(new dnq(new fnq(m1eVar.b(), new w620((Object) this, yjeVar, (byte) 20), (byte) 4), new qos((Object) this, yjeVar, (byte) 19), (byte) 1), d5c.S(jiu0.a(this), rwjVar), ft50.h);
    }

    public final mdm M(int i, int i2, long j) {
        xuz xuzVar = pb10.c;
        pb10 pb10Var = pb10.g;
        int i3 = ((ws50) D()).f;
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
            } while (!p7m0Var.m(value, ws50.a((ws50) value, true, 0, null, null, null, null, 126)));
            this.F = sac.g0(jiu0.a(this), gt50.class.getName().concat(".loadBanners"), this.t.b, new r750(1, this, gt50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 17), new ct50(this, null, (byte) 0), 80);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P(zje zjeVar) {
        dt50 dt50Var;
        Object value;
        ws50 ws50Var;
        if (zjeVar instanceof dt50) {
            dt50Var = (dt50) zjeVar;
            int i = dt50Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dt50Var.k = i - Integer.MIN_VALUE;
            } else {
                dt50Var = new dt50(this, zjeVar);
            }
        } else {
            dt50Var = new dt50(this, zjeVar);
        }
        Object objA = dt50Var.i;
        Object obj = wne.f39444a;
        int i2 = dt50Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            mvc mvcVar = mvc.CMS_CODE_NEWS;
            dt50Var.k = 1;
            objA = this.A.a(mvcVar, dt50Var);
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
            ws50Var = (ws50) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, ws50.a(ws50Var, false, 0, null, list, iun.f15405a, list.isEmpty() ? M(R.string.promotions_empty, R.string.empty_str, 0L) : null, 38)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object Q(boolean z, zje zjeVar) {
        et50 et50Var;
        boolean z2;
        Object objA;
        Object value;
        ws50 ws50Var;
        if (zjeVar instanceof et50) {
            et50Var = (et50) zjeVar;
            int i = et50Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                et50Var.l = i - Integer.MIN_VALUE;
            } else {
                et50Var = new et50(this, zjeVar);
            }
        } else {
            et50Var = new et50(this, zjeVar);
        }
        Object obj = et50Var.j;
        wne wneVar = wne.f39444a;
        int i2 = et50Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            z2 = z;
            et50Var.i = z2;
            et50Var.l = 1;
            objA = this.w.a(-1, et50Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = et50Var.i;
            z1x.P(obj);
            objA = obj;
            z2 = z3;
        }
        List list = (List) objA;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            ws50Var = (ws50) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, ws50.a(ws50Var, false, 0, null, iun.f15405a, list, list.isEmpty() ? M(R.string.promotions_empty, R.string.empty_str, 0L) : null, 38)));
        if (z2) {
            i3t0.A(this, this.B, new ov70(this.o), null, null, 6);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        xs5 xs5Var;
        String str;
        mvc mvcVar;
        kr5 kr5Var;
        Object g0g0Var;
        Object next;
        Object value;
        ws50 ws50Var;
        Object value2;
        ws50 ws50Var2;
        Object value3;
        ws50 ws50Var3;
        Object value4;
        ws50 ws50Var4;
        Object value5;
        ws50 ws50Var5;
        os50 os50Var = (os50) obj;
        os50Var.getClass();
        boolean z = os50Var instanceof ns50;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        int i = 0;
        byte b = 1;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value5 = p7m0Var.getValue();
                value5.getClass();
                ws50Var5 = (ws50) value5;
                oyg0Var.getClass();
            } while (!p7m0Var.m(value5, ws50.a(ws50Var5, false, 0, xyq0.a(ws50Var5.c, false, !((ns50) os50Var).f24037a, false, 5), null, null, null, 123)));
            return;
        }
        if (os50Var instanceof ms50) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value4 = p7m0Var2.getValue();
                value4.getClass();
                ws50Var4 = (ws50) value4;
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value4, ws50.a(ws50Var4, false, 0, xyq0.a(ws50Var4.c, false, false, true, 3), null, null, null, 123)));
            return;
        }
        if (os50Var instanceof ls50) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value3 = p7m0Var3.getValue();
                value3.getClass();
                ws50Var3 = (ws50) value3;
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value3, ws50.a(ws50Var3, false, ((ls50) os50Var).f20562a, xyq0.a(ws50Var3.c, false, false, false, 3), null, null, null, 121)));
            return;
        }
        if (os50Var instanceof gs50) {
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value2 = p7m0Var4.getValue();
                value2.getClass();
                ws50Var2 = (ws50) value2;
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value2, ws50.a(ws50Var2, false, 0, xyq0.a(ws50Var2.c, true, false, false, 6), null, null, null, 123)));
            return;
        }
        ?? r9 = 0;
        Object obj2 = null;
        Object obj3 = null;
        if (os50Var instanceof hs50) {
            p7m0 p7m0Var5 = ocjVar.f25029a;
            do {
                value = p7m0Var5.getValue();
                value.getClass();
                ws50Var = (ws50) value;
                oyg0Var.getClass();
            } while (!p7m0Var5.m(value, ws50.a(ws50Var, false, 0, xyq0.a(ws50Var.c, false, false, false, 6), null, null, null, 123)));
            bby bbyVar = this.F;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.F = sac.V(jiu0.a(this), new r750(1, this, gt50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, this.t.b, new ct50(this, r9, b), 10);
                return;
            }
            return;
        }
        if (os50Var instanceof js50) {
            H(new pi40(os50Var, (byte) 16));
            return;
        }
        boolean z2 = os50Var instanceof ds50;
        i1w0 i1w0Var = this.y;
        if (!z2) {
            if (os50Var instanceof is50) {
                O();
                return;
            }
            boolean z3 = os50Var instanceof es50;
            x20 x20Var = this.r;
            yo4 yo4Var = this.q;
            if (!z3) {
                if (!(os50Var instanceof fs50)) {
                    if (os50Var instanceof ks50) {
                        E();
                        return;
                    }
                    return;
                }
                int i2 = ((fs50) os50Var).f10048a;
                if (N()) {
                    for (Object obj4 : ((ws50) D()).d) {
                        kj5 kj5Var = uo5.b;
                        mvc mvcVar2 = ((zvc) obj4).f45047a;
                        kj5Var.getClass();
                        if (kj5.e(mvcVar2).f35994a == i2) {
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
                    for (Object obj5 : ((ws50) D()).e) {
                        if (((ft5) obj5).f10094a.f41399a == i2) {
                            r9 = obj5;
                            break;
                        }
                    }
                    ft5 ft5Var = (ft5) r9;
                    if (ft5Var == null || (xs5Var = ft5Var.f10094a) == null) {
                        return;
                    }
                    str = xs5Var.b;
                    mvcVar = mvc.CMS_CODE_POPULAR;
                }
                kj5 kj5Var2 = uo5.b;
                if (i2 == 76) {
                    yo4Var.k();
                }
                yo4Var.c(String.valueOf(i2), "actions");
                x20Var.k(Integer.valueOf(i2), y1p.ACTIONS);
                i1w0Var.d(new ec3((Object) this, i2, (Object) str, (Object) mvcVar, (byte) 12));
                return;
            }
            es50 es50Var = (es50) os50Var;
            int i3 = es50Var.b;
            int i4 = es50Var.f8313a;
            String str2 = es50Var.c;
            if (!N()) {
                uo5.b.getClass();
                uo5 uo5VarF = kj5.f(i3);
                Iterator it = ((ws50) D()).e.iterator();
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
                    } while (((q2b) next).f27993a.b != i4);
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
                String str3 = kr5Var.d;
                int i5 = kr5Var.b;
                Integer numA = ks60.a(oo5Var, str2);
                if (uo5VarF != uo5.NEWS) {
                    yo4Var.a("actions", i5, str3, numA != null ? String.valueOf(numA.intValue()) : null);
                    x20Var.d(i5, "actions", str3, numA != null ? Float.valueOf(numA.intValue()) : null);
                }
                int iOrdinal = uo5VarF.ordinal();
                if (iOrdinal == 3) {
                    yo4Var.b(i5, str3, "banner");
                    x20Var.e(i5, str3, "banner");
                } else if (iOrdinal == 8) {
                    String str4 = kr5Var.v;
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        String queryParameter = Uri.parse(str4).getQueryParameter(ParameterNames.ID);
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
            for (Object obj7 : ((ws50) D()).e) {
                if (((ft5) obj7).f10094a.f41399a == i3) {
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
                        i = -1;
                        break;
                    } else if (((q2b) it3.next()).f27993a.b == i4) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i >= 0) {
                    i6 = i;
                }
            }
            i3t0.A(this, this.B, new nv70(i4, i6, i3), null, null, 6);
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
