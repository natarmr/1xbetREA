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
public final class ip50 extends i3t0 {
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

    public ip50(int i, boolean z, yo4 yo4Var, x20 x20Var, qu quVar, mne mneVar, zr1 zr1Var, uzc0 uzc0Var, dst dstVar, pru pruVar, i1w0 i1w0Var, duj dujVar, nyt nytVar, m1e m1eVar, bzt bztVar, ctf0 ctf0Var, wv70 wv70Var, asi0 asi0Var, coi0 coi0Var) {
        i1w0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        sk1 sk1Var = new sk1(bztVar, (byte) 3);
        v510 v510Var = new v510(ctf0Var, (byte) 12);
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
        this.E = maz.b(new np30(this, (byte) 23));
        yje yjeVar = null;
        sac.T(new dnq(new fnq(m1eVar.b(), new w620((Object) this, yjeVar, (byte) 16), (byte) 4), new qos((Object) this, yjeVar, (byte) 15), (byte) 1), d5c.S(jiu0.a(this), rwjVar), hp50.h);
    }

    public final mdm M(int i, int i2, long j) {
        xuz xuzVar = pb10.c;
        pb10 pb10Var = pb10.g;
        int i3 = ((yo50) D()).f;
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
            } while (!p7m0Var.m(value, yo50.a((yo50) value, true, 0, false, null, null, null, 126)));
            this.F = sac.g0(jiu0.a(this), ip50.class.getName().concat(".loadBanners"), this.t.b, new r750(1, this, ip50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 6), new ep50(this, null, (byte) 0), 80);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P(zje zjeVar) {
        fp50 fp50Var;
        Object value;
        yo50 yo50Var;
        if (zjeVar instanceof fp50) {
            fp50Var = (fp50) zjeVar;
            int i = fp50Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fp50Var.k = i - Integer.MIN_VALUE;
            } else {
                fp50Var = new fp50(this, zjeVar);
            }
        } else {
            fp50Var = new fp50(this, zjeVar);
        }
        Object objA = fp50Var.i;
        Object obj = wne.f39444a;
        int i2 = fp50Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            mvc mvcVar = mvc.CMS_CODE_NEWS;
            fp50Var.k = 1;
            objA = this.A.a(mvcVar, fp50Var);
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
            yo50Var = (yo50) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, yo50.a(yo50Var, false, 0, false, list, iun.f15405a, list.isEmpty() ? M(R.string.promotions_empty, R.string.empty_str, 0L) : null, 38)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object Q(boolean z, zje zjeVar) {
        gp50 gp50Var;
        boolean z2;
        Object objA;
        Object value;
        yo50 yo50Var;
        if (zjeVar instanceof gp50) {
            gp50Var = (gp50) zjeVar;
            int i = gp50Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                gp50Var.l = i - Integer.MIN_VALUE;
            } else {
                gp50Var = new gp50(this, zjeVar);
            }
        } else {
            gp50Var = new gp50(this, zjeVar);
        }
        Object obj = gp50Var.j;
        wne wneVar = wne.f39444a;
        int i2 = gp50Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            z2 = z;
            gp50Var.i = z2;
            gp50Var.l = 1;
            objA = this.w.a(-1, gp50Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = gp50Var.i;
            z1x.P(obj);
            objA = obj;
            z2 = z3;
        }
        List list = (List) objA;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            yo50Var = (yo50) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, yo50.a(yo50Var, false, 0, false, iun.f15405a, list, list.isEmpty() ? M(R.string.promotions_empty, R.string.empty_str, 0L) : null, 38)));
        if (z2) {
            i3t0.A(this, this.B, new ov70(this.o), null, null, 6);
        }
        return Unit.f46060a;
    }

    public final void R(int i, String str, int i2, String str2) {
        kr5 kr5Var;
        Object g0g0Var;
        Object next;
        Object obj = null;
        if (!N()) {
            uo5.b.getClass();
            uo5 uo5VarF = kj5.f(i);
            Iterator it = ((yo50) D()).e.iterator();
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
                } while (((q2b) next).f27993a.b != i2);
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
            int i3 = kr5Var.b;
            Integer numA = ks60.a(oo5Var, str2);
            uo5 uo5Var = uo5.NEWS;
            x20 x20Var = this.r;
            yo4 yo4Var = this.q;
            if (uo5VarF != uo5Var) {
                yo4Var.a("actions", i3, str3, numA != null ? String.valueOf(numA.intValue()) : null);
                x20Var.d(i3, "actions", str3, numA != null ? Float.valueOf(numA.intValue()) : null);
            }
            int iOrdinal = uo5VarF.ordinal();
            if (iOrdinal == 3) {
                yo4Var.b(i3, str3, str);
                x20Var.e(i3, str3, str);
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
                if (j0g0.a(g0g0Var) != null) {
                    g0g0Var = 0L;
                }
                long jLongValue = ((Number) g0g0Var).longValue();
                if (jLongValue > 0) {
                    this.s.f(jLongValue);
                    this.u.k(jLongValue);
                }
            }
        }
        for (Object obj2 : ((yo50) D()).e) {
            if (((ft5) obj2).f10094a.f41399a == i) {
                obj = obj2;
                break;
            }
        }
        ft5 ft5Var = (ft5) obj;
        int i4 = -1000;
        if (ft5Var != null) {
            Iterator it3 = ft5Var.b.iterator();
            int i5 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i5 = -1;
                    break;
                } else if (((q2b) it3.next()).f27993a.b == i2) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 >= 0) {
                i4 = i5;
            }
        }
        i3t0.A(this, this.B, new nv70(i2, i4, i), null, null, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        xs5 xs5Var;
        String str;
        mvc mvcVar;
        Object value3;
        Object value4;
        mo50 mo50Var = (mo50) obj;
        mo50Var.getClass();
        boolean z = mo50Var instanceof do50;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z || (mo50Var instanceof co50) || (mo50Var instanceof io50)) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, yo50.a((yo50) value, false, 0, true, null, null, null, 123)));
            return;
        }
        if ((mo50Var instanceof eo50) || (mo50Var instanceof jo50)) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, yo50.a((yo50) value2, false, 0, false, null, null, null, 123)));
            return;
        }
        byte b = 1;
        ?? r9 = 0;
        Object obj2 = null;
        if (mo50Var instanceof go50) {
            go50 go50Var = (go50) mo50Var;
            Integer numValueOf = go50Var.b ? null : Integer.valueOf(go50Var.f11614a + 1);
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            p7m0 p7m0Var3 = ocjVar.f25029a;
            while (true) {
                Object value5 = p7m0Var3.getValue();
                value5.getClass();
                oyg0Var.getClass();
                int i = iIntValue;
                if (p7m0Var3.m(value5, yo50.a((yo50) value5, false, iIntValue, false, null, null, null, 121))) {
                    return;
                } else {
                    iIntValue = i;
                }
            }
        } else {
            if (mo50Var instanceof ao50) {
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value4, yo50.a((yo50) value4, false, ((ao50) mo50Var).f1185a, false, null, null, null, 125)));
                return;
            }
            if (mo50Var instanceof bo50) {
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var5.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var5.m(value3, yo50.a((yo50) value3, false, ((bo50) mo50Var).f2915a, false, null, null, null, 121)));
                return;
            }
            boolean z2 = mo50Var instanceof xn50;
            i1w0 i1w0Var = this.y;
            if (!z2) {
                if (mo50Var instanceof yn50) {
                    yn50 yn50Var = (yn50) mo50Var;
                    R(yn50Var.b, "", yn50Var.f42922a, yn50Var.c);
                    return;
                }
                if (mo50Var instanceof lo50) {
                    lo50 lo50Var = (lo50) mo50Var;
                    R(lo50Var.b, "banner", lo50Var.f20376a, lo50Var.c);
                    return;
                }
                if (mo50Var instanceof ko50) {
                    ko50 ko50Var = (ko50) mo50Var;
                    R(ko50Var.b, "button", ko50Var.f18615a, ko50Var.c);
                    return;
                }
                if (!(mo50Var instanceof zn50)) {
                    if (mo50Var instanceof fo50) {
                        O();
                        return;
                    }
                    if (!mo50Var.equals(wn50.f39433a)) {
                        if (mo50Var instanceof ho50) {
                            E();
                            return;
                        } else {
                            t9f.b();
                            return;
                        }
                    }
                    bby bbyVar = this.F;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        this.F = sac.V(jiu0.a(this), new r750(1, this, ip50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, this.t.b, new ep50(this, r9, b), 10);
                        return;
                    }
                    return;
                }
                int i2 = ((zn50) mo50Var).f44658a;
                if (N()) {
                    for (Object obj3 : ((yo50) D()).d) {
                        kj5 kj5Var = uo5.b;
                        mvc mvcVar2 = ((zvc) obj3).f45047a;
                        kj5Var.getClass();
                        if (kj5.e(mvcVar2).f35994a == i2) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    zvc zvcVar = (zvc) obj2;
                    if (zvcVar == null) {
                        return;
                    }
                    str = zvcVar.b;
                    mvcVar = zvcVar.f45047a;
                } else {
                    for (Object obj4 : ((yo50) D()).e) {
                        if (((ft5) obj4).f10094a.f41399a == i2) {
                            r9 = obj4;
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
                mvc mvcVar3 = mvcVar;
                String str2 = str;
                kj5 kj5Var2 = uo5.b;
                yo4 yo4Var = this.q;
                if (i2 == 76) {
                    yo4Var.k();
                }
                yo4Var.c(String.valueOf(i2), "actions");
                this.r.k(Integer.valueOf(i2), y1p.ACTIONS);
                i1w0Var.d(new ec3((Object) this, i2, (Object) str2, (Object) mvcVar3, (byte) 10));
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
}
