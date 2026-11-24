package a;

import android.javax.sip.message.Response;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class sq50 extends i3t0 {
    public static final /* synthetic */ int B = 0;
    public bby A;
    public final ws5 o;
    public final nyt p;
    public final dst q;
    public final pru r;
    public final qu s;
    public final yo4 t;
    public final x20 u;
    public final duj v;
    public final mne w;
    public final i1w0 x;
    public final wv70 y;
    public final n0o0 z;

    public sq50(ws5 ws5Var, nyt nytVar, dst dstVar, pru pruVar, bzt bztVar, qu quVar, yo4 yo4Var, x20 x20Var, m1e m1eVar, duj dujVar, mne mneVar, ctf0 ctf0Var, i1w0 i1w0Var, wv70 wv70Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        sk1 sk1Var = new sk1(bztVar, (byte) 5);
        v510 v510Var = new v510(ctf0Var, (byte) 14);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, sk1Var, v510Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = ws5Var;
        this.p = nytVar;
        this.q = dstVar;
        this.r = pruVar;
        this.s = quVar;
        this.t = yo4Var;
        this.u = x20Var;
        this.v = dujVar;
        this.w = mneVar;
        this.x = i1w0Var;
        this.y = wv70Var;
        this.z = maz.b(new np30(this, (byte) 25));
        yje yjeVar = null;
        sac.T(new dnq(new fnq(m1eVar.b(), new w620((Object) this, yjeVar, (byte) 18), (byte) 4), new qos((Object) this, yjeVar, (byte) 17), (byte) 1), d5c.S(jiu0.a(this), rwjVar), rq50.h);
    }

    public final kr5 M(int i) {
        q2b q2bVar;
        Iterator it = ((iq50) D()).c.iterator();
        do {
            Object obj = null;
            if (!it.hasNext()) {
                return null;
            }
            for (Object obj2 : ((ft5) it.next()).b) {
                if (((q2b) obj2).f27993a.b == i) {
                    obj = obj2;
                    break;
                }
            }
            q2bVar = (q2b) obj;
        } while (q2bVar == null);
        return q2bVar.f27993a;
    }

    public final mdm N() {
        xuz xuzVar = pb10.c;
        pb10 pb10Var = pb10.g;
        int i = ((iq50) D()).d;
        xuzVar.getClass();
        return new mdm(xuz.a(pb10Var, i), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(zje zjeVar) {
        pq50 pq50Var;
        Object value;
        if (zjeVar instanceof pq50) {
            pq50Var = (pq50) zjeVar;
            int i = pq50Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                pq50Var.k = i - Integer.MIN_VALUE;
            } else {
                pq50Var = new pq50(this, zjeVar);
            }
        } else {
            pq50Var = new pq50(this, zjeVar);
        }
        Object objA = pq50Var.i;
        Object obj = wne.f39444a;
        int i2 = pq50Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            mvc mvcVar = this.o.b;
            pq50Var.k = 1;
            objA = this.p.a(mvcVar, pq50Var);
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
            this.f.getClass();
        } while (!p7m0Var.m(value, iq50.a((iq50) value, false, list, iun.f15405a, null, 8)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P(zje zjeVar) {
        qq50 qq50Var;
        Object value;
        if (zjeVar instanceof qq50) {
            qq50Var = (qq50) zjeVar;
            int i = qq50Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qq50Var.k = i - Integer.MIN_VALUE;
            } else {
                qq50Var = new qq50(this, zjeVar);
            }
        } else {
            qq50Var = new qq50(this, zjeVar);
        }
        Object objA = qq50Var.i;
        Object obj = wne.f39444a;
        int i2 = qq50Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            int i3 = this.o.f39675a;
            qq50Var.k = 1;
            objA = this.q.a(i3, qq50Var);
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
            this.f.getClass();
        } while (!p7m0Var.m(value, iq50.a((iq50) value, false, iun.f15405a, list, null, 8)));
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        int i;
        dq50 dq50Var = (dq50) obj;
        dq50Var.getClass();
        if (!(dq50Var instanceof yp50)) {
            Object[] objArr = 0;
            if ((dq50Var instanceof bq50) || (dq50Var instanceof aq50)) {
                bby bbyVar = this.A;
                byte b = 1;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.A = sac.V(jiu0.a(this), new b530((Object) this, (byte) 20), null, this.w.b, new oq50(this, objArr == true ? 1 : 0, b), 10);
                    return;
                }
                return;
            }
            if (dq50Var instanceof cq50) {
                E();
                return;
            }
            if (!(dq50Var instanceof zp50)) {
                t9f.b();
                return;
            }
            zp50 zp50Var = (zp50) dq50Var;
            int i2 = zp50Var.f44744a;
            String str = zp50Var.b;
            kj5 kj5Var = uo5.b;
            int i3 = this.o.f39675a;
            kj5Var.getClass();
            uo5 uo5VarF = kj5.f(i3);
            String str2 = "";
            if (!((Boolean) this.z.getValue()).booleanValue()) {
                kr5 kr5VarM = M(i2);
                String str3 = kr5VarM != null ? kr5VarM.d : null;
                if (str3 != null) {
                    str2 = str3;
                }
            }
            String str4 = "other";
            switch (uo5VarF) {
                case UNKNOWN:
                    us5[] us5VarArr = us5.f36194a;
                    if (i3 == 24) {
                        str4 = "xgames";
                    } else if (i3 != 105) {
                        rek0 rek0Var = ec0.b;
                        if (i3 == 111) {
                            str4 = "my_aggregator";
                        } else if (i3 != 112) {
                            rn50[] rn50VarArr = rn50.f30772a;
                        } else {
                            str4 = "1xchampions";
                        }
                    } else {
                        str4 = "cyber_champ_result";
                    }
                    break;
                case POPULAR:
                    rn50[] rn50VarArr2 = rn50.f30772a;
                    str4 = "actions_popular";
                    break;
                case DEPOSIT:
                    rn50[] rn50VarArr3 = rn50.f30772a;
                    str4 = "actions_deposit";
                    break;
                case NEWS:
                    rn50[] rn50VarArr4 = rn50.f30772a;
                    break;
                case ACTIONS:
                    rn50[] rn50VarArr5 = rn50.f30772a;
                    str4 = "actions_actions";
                    break;
                case ONE_X_BET:
                    rn50[] rn50VarArr6 = rn50.f30772a;
                    str4 = "actions_1xbet";
                    break;
                case AGGREGATOR:
                    rn50[] rn50VarArr7 = rn50.f30772a;
                    str4 = "actions_aggregator";
                    break;
                case SUGGESTIONS:
                    rn50[] rn50VarArr8 = rn50.f30772a;
                    str4 = "actions_aggregator_suggest";
                    break;
                case TOURNAMENTS:
                    this.s.f29324a.a("tournament_call", xp20.f(new Pair("promo_id", Integer.valueOf(i2)), new Pair("screen", "tournaments_all")));
                    rn50[] rn50VarArr9 = rn50.f30772a;
                    str4 = "tournaments_all";
                    break;
                case CYBER:
                    rn50[] rn50VarArr10 = rn50.f30772a;
                    str4 = "cyber";
                    break;
                default:
                    t9f.b();
                    return;
            }
            kr5 kr5VarM2 = M(i2);
            Integer numA = kr5VarM2 != null ? ks60.a(kr5VarM2.n, str) : null;
            this.t.a(str4, i2, str2, numA != null ? String.valueOf(numA.intValue()) : null);
            this.u.d(i2, str4, str2, numA != null ? Float.valueOf(numA.intValue()) : null);
            Iterator it = ((iq50) D()).c.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ft5) it.next()).b.iterator();
                i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                    } else if (((q2b) it2.next()).f27993a.b != i2) {
                        i++;
                    }
                }
                if (i >= 0) {
                    i3t0.A(this, this.y, new nv70(i2, i, i3), null, null, 6);
                    return;
                }
            }
            i = -1000;
            i3t0.A(this, this.y, new nv70(i2, i, i3), null, null, 6);
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
