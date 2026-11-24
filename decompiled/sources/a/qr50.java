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
public final class qr50 extends i3t0 {
    public static final /* synthetic */ int F = 0;
    public final wv70 A;
    public final asi0 B;
    public final coi0 C;
    public final n0o0 D;
    public bby E;
    public final int o;
    public final boolean p;
    public final yo4 q;
    public final x20 r;
    public final qu s;
    public final mne t;
    public final zr1 u;
    public final dst v;
    public final pru w;
    public final i1w0 x;
    public final duj y;
    public final nyt z;

    public qr50(int i, boolean z, yo4 yo4Var, x20 x20Var, qu quVar, mne mneVar, zr1 zr1Var, dst dstVar, pru pruVar, i1w0 i1w0Var, duj dujVar, nyt nytVar, m1e m1eVar, bzt bztVar, ctf0 ctf0Var, wv70 wv70Var, asi0 asi0Var, coi0 coi0Var) {
        i1w0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        sk1 sk1Var = new sk1(bztVar, (byte) 6);
        v510 v510Var = new v510(ctf0Var, (byte) 15);
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
        this.v = dstVar;
        this.w = pruVar;
        this.x = i1w0Var;
        this.y = dujVar;
        this.z = nytVar;
        this.A = wv70Var;
        this.B = asi0Var;
        this.C = coi0Var;
        this.D = maz.b(new np30(this, (byte) 26));
        yje yjeVar = null;
        sac.T(new dnq(new fnq(m1eVar.b(), new w620((Object) this, yjeVar, (byte) 19), (byte) 4), new qos((Object) this, yjeVar, (byte) 18), (byte) 1), d5c.S(jiu0.a(this), rwjVar), pr50.h);
    }

    public final mdm M(int i, int i2, long j) {
        xuz xuzVar = pb10.c;
        pb10 pb10Var = pb10.g;
        int i3 = ((gr50) D()).e;
        xuzVar.getClass();
        return new mdm(xuz.a(pb10Var, i3), null, null, 0, 0, i, 0, i2, j, 0L, Response.SESSION_NOT_ACCEPTABLE);
    }

    public final boolean N() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(zje zjeVar) {
        nr50 nr50Var;
        Object value;
        gr50 gr50Var;
        if (zjeVar instanceof nr50) {
            nr50Var = (nr50) zjeVar;
            int i = nr50Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nr50Var.k = i - Integer.MIN_VALUE;
            } else {
                nr50Var = new nr50(this, zjeVar);
            }
        } else {
            nr50Var = new nr50(this, zjeVar);
        }
        Object objA = nr50Var.i;
        Object obj = wne.f39444a;
        int i2 = nr50Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            mvc mvcVar = mvc.CMS_CODE_NEWS;
            nr50Var.k = 1;
            objA = this.z.a(mvcVar, nr50Var);
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
            gr50Var = (gr50) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, gr50.a(gr50Var, false, 0, list, iun.f15405a, list.isEmpty() ? M(R.string.promotions_empty, R.string.empty_str, 0L) : null, 18)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object P(boolean z, zje zjeVar) {
        or50 or50Var;
        Object objA;
        boolean z2;
        Object value;
        gr50 gr50Var;
        if (zjeVar instanceof or50) {
            or50Var = (or50) zjeVar;
            int i = or50Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                or50Var.l = i - Integer.MIN_VALUE;
            } else {
                or50Var = new or50(this, zjeVar);
            }
        } else {
            or50Var = new or50(this, zjeVar);
        }
        Object obj = or50Var.j;
        wne wneVar = wne.f39444a;
        int i2 = or50Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            or50Var.i = z;
            or50Var.l = 1;
            objA = this.v.a(-1, or50Var);
            if (objA == wneVar) {
                return wneVar;
            }
            z2 = z;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = or50Var.i;
            z1x.P(obj);
            objA = obj;
            z2 = z3;
        }
        List list = (List) objA;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            gr50Var = (gr50) value;
            this.f.getClass();
        } while (!p7m0Var.m(value, gr50.a(gr50Var, false, 0, iun.f15405a, list, list.isEmpty() ? M(R.string.promotions_empty, R.string.empty_str, 0L) : null, 18)));
        if (z2) {
            i3t0.A(this, this.A, new ov70(this.o), null, null, 6);
        }
        return Unit.f46060a;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        kr5 kr5Var;
        Object g0g0Var;
        Object next;
        zq50 zq50Var = (zq50) obj;
        zq50Var.getClass();
        Object obj2 = null;
        if ((zq50Var instanceof xq50) || (zq50Var instanceof wq50)) {
            bby bbyVar = this.E;
            byte b = 1;
            if (bbyVar == null || !bbyVar.isActive()) {
                this.E = sac.V(jiu0.a(this), new r750(1, this, qr50.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, this.t.b, new mr50(this, false ? 1 : 0, b), 10);
                return;
            }
            return;
        }
        int i = 0;
        if (!(zq50Var instanceof tq50)) {
            if (!(zq50Var instanceof uq50)) {
                if (!(zq50Var instanceof vq50)) {
                    if (zq50Var instanceof yq50) {
                        E();
                        return;
                    }
                    return;
                } else {
                    int i2 = ((vq50) zq50Var).f37840a;
                    p7m0 p7m0Var = this.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        this.f.getClass();
                    } while (!p7m0Var.m(value, gr50.a((gr50) value, false, i2, null, null, null, 61)));
                    return;
                }
            }
            uq50 uq50Var = (uq50) zq50Var;
            int i3 = uq50Var.b;
            int i4 = uq50Var.f36103a;
            String str = uq50Var.d;
            if (!N()) {
                uo5.b.getClass();
                uo5 uo5VarF = kj5.f(i3);
                Iterator it = ((gr50) D()).d.iterator();
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
                String str2 = kr5Var.d;
                int i5 = kr5Var.b;
                Integer numA = ks60.a(oo5Var, str);
                uo5 uo5Var = uo5.NEWS;
                x20 x20Var = this.r;
                yo4 yo4Var = this.q;
                if (uo5VarF != uo5Var) {
                    yo4Var.a("actions", i5, str2, numA != null ? String.valueOf(numA.intValue()) : null);
                    x20Var.d(i5, "actions", str2, numA != null ? Float.valueOf(numA.intValue()) : null);
                }
                int iOrdinal = uo5VarF.ordinal();
                if (iOrdinal == 3) {
                    yo4Var.b(i5, str2, "banner");
                    x20Var.e(i5, str2, "banner");
                } else if (iOrdinal == 8) {
                    String str3 = kr5Var.v;
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        String queryParameter = Uri.parse(str3).getQueryParameter(ParameterNames.ID);
                        g0g0Var = Long.valueOf(queryParameter != null ? Long.parseLong(queryParameter) : 0L);
                    } catch (Throwable th) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                    Throwable thA = j0g0.a(g0g0Var);
                    Object obj3 = g0g0Var;
                    if (thA != null) {
                        obj3 = 0L;
                    }
                    long jLongValue = ((Number) obj3).longValue();
                    if (jLongValue > 0) {
                        this.s.f(jLongValue);
                        this.u.k(jLongValue);
                    }
                }
            }
            for (Object obj4 : ((gr50) D()).d) {
                if (((ft5) obj4).f10094a.f41399a == i3) {
                    obj2 = obj4;
                    break;
                }
            }
            ft5 ft5Var = (ft5) obj2;
            int i6 = -1000;
            if (ft5Var != null) {
                Iterator it3 = ft5Var.b.iterator();
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
            i3t0.A(this, this.A, new nv70(i4, i6, i3), null, null, 6);
            return;
        }
        i1w0 i1w0Var = this.x;
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
