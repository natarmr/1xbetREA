package a;

import java.util.Arrays;
import java.util.Iterator;
import org.xbet.client1.R;
import org.xplatform.sportgame.markets.betbuilder.api.navigation.BetBuilderMarketsParams;

/* JADX INFO: loaded from: classes6.dex */
public final class dk6 extends i3t0 {
    public static final /* synthetic */ int K = 0;
    public final clc A;
    public final f2v B;
    public final hmt0 C;
    public final drc D;
    public final vkr0 E;
    public final bwl F;
    public bby G;
    public c4m0 H;
    public bby I;
    public bby J;
    public final BetBuilderMarketsParams o;
    public final mne p;
    public final ctf0 q;
    public final x4u r;
    public final pzu s;
    public final gud t;
    public final esg0 u;
    public final xpr v;
    public final owp0 w;
    public final ikt0 x;
    public final bn6 y;
    public final je z;

    /* JADX WARN: Illegal instructions before constructor call */
    public dk6(vzg0 vzg0Var, BetBuilderMarketsParams betBuilderMarketsParams, mne mneVar, ctf0 ctf0Var, g2v g2vVar, r9u r9uVar, edu eduVar, x4u x4uVar, r1u r1uVar, pzu pzuVar, gud gudVar, esg0 esg0Var, ocl oclVar, r1u r1uVar2, s1u s1uVar, xpr xprVar, owp0 owp0Var, ikt0 ikt0Var, bn6 bn6Var, je jeVar, jqt jqtVar, clc clcVar, f2v f2vVar, hmt0 hmt0Var, drc drcVar, vkr0 vkr0Var, bwl bwlVar, pru pruVar) {
        ctf0Var.getClass();
        r9uVar.getClass();
        rwj rwjVar = mneVar.f22085a;
        vs10 vs10Var = mneVar.c;
        yje yjeVar = null;
        super(new oj6(pruVar, r9uVar), cvm0.p(rwjVar, vs10Var), new dc0((Object) r9uVar, (Object) ctf0Var, (Object) g2vVar, (Object) eduVar, (byte) 13), (yzn0) null);
        this.o = betBuilderMarketsParams;
        this.p = mneVar;
        this.q = ctf0Var;
        this.r = x4uVar;
        this.s = pzuVar;
        this.t = gudVar;
        this.u = esg0Var;
        this.v = xprVar;
        this.w = owp0Var;
        this.x = ikt0Var;
        this.y = bn6Var;
        this.z = jeVar;
        this.A = clcVar;
        this.B = f2vVar;
        this.C = hmt0Var;
        this.D = drcVar;
        this.E = vkr0Var;
        this.F = bwlVar;
        i3t0.L(this, new fnq(dtb.z(jqtVar.a(), 1), new pj6(this, yjeVar, (byte) 0), (byte) 4), null, null, 3);
        sac.V(jiu0.a(this), tj6.f34035a, null, vs10Var, new wa(this, yjeVar, (byte) 21), 10);
        byte b = 2;
        sac.T(new fnq(dtb.z(new fnq(i120.W(((ik6) oclVar.f25032a).f14910a.f13193a), new pj6(this, yjeVar, (byte) 1), (byte) 4), 1), new pj6(this, yjeVar, b), (byte) 4), jiu0.a(this), rj6.h);
        sac.T(new fnq(r1uVar.a(), new xw5(this, yjeVar, (byte) 10), (byte) 4), jiu0.a(this), sj6.h);
        sac.T(new fnq(s1uVar.a(), new qj6(this, yjeVar, b), (byte) 4), jiu0.a(this), xj6.h);
        sac.T(new fnq(vtb.N(r1uVar2.f29700a.c.f20869a), new qj6(this, yjeVar, (byte) 3), (byte) 4), jiu0.a(this), yj6.h);
    }

    public final void M(boolean z, long j) {
        if (((hj6) D()).g) {
            bby bbyVar = this.G;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            this.G = null;
            this.G = sac.V(jiu0.a(this), new qi4((Object) this, j, (byte) 1), null, this.p.f22085a, new lv1(this, j, z, null), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r4v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.bn6] */
    /* JADX WARN: Type inference failed for: r8v1, types: [a.je] */
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
        l9s l9sVar;
        Object next;
        Object next2;
        hao haoVar;
        Object next3;
        qi6 qi6Var = (qi6) obj;
        qi6Var.getClass();
        ?? ValueOf = 0;
        ic9Var = null;
        ic9 ic9Var = null;
        ValueOf = 0;
        ValueOf = 0;
        if (qi6Var instanceof mi6) {
            xgl0 xgl0Var = ((mi6) qi6Var).f21828a;
            l9s l9sVar2 = ((hj6) D()).c;
            ji6 ji6Var = ((hj6) D()).b;
            hi6 hi6Var = ji6Var instanceof hi6 ? (hi6) ji6Var : null;
            if (hi6Var == null) {
                haoVar = null;
            } else {
                Iterator it = hi6Var.f13098a.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((ou20) next).b != xgl0Var.f);
                ou20 ou20Var = (ou20) next;
                if (ou20Var != null) {
                    Iterator it2 = r3d.r(ou20Var.f25856a).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        hao haoVar2 = (hao) next2;
                        if (haoVar2.b == xgl0Var.f40846a && haoVar2.f12733a == xgl0Var.e) {
                            break;
                        }
                    }
                    haoVar = (hao) next2;
                } else {
                    haoVar = null;
                }
            }
            bby bbyVar = this.I;
            if ((bbyVar != null && bbyVar.isActive()) || l9sVar2 == null || haoVar == null) {
                return;
            }
            long j = haoVar.c;
            eh6 eh6Var = (eh6) ((yi6) this.F.f3330a).f42671a.f40929a.getValue();
            if (eh6Var instanceof dh6) {
                Iterator it3 = ((dh6) eh6Var).f6078a.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (((xf6) next3).f40777a.f21776a != j);
                xf6 xf6Var = (xf6) next3;
                if (xf6Var != null) {
                    mh6 mh6Var = xf6Var.f40777a;
                    ic9Var = new ic9(mh6Var.c, mh6Var.b, mh6Var.d, uyc.IDLE);
                }
            }
            ic9 ic9Var2 = ic9Var;
            if (ic9Var2 == null) {
                return;
            }
            this.I = sac.V(jiu0.a(this), ak6.f1006a, null, null, new c43((diu0) this, (Object) l9sVar2, (Object) haoVar, (Object) xgl0Var, (Object) ic9Var2, (yje) null, (byte) 2), 14);
            return;
        }
        if (qi6Var instanceof ki6) {
            ki6 ki6Var = (ki6) qi6Var;
            Long l = ((hj6) D()).e;
            if (l != null) {
                this.C.a(l.longValue(), ki6Var.b, ki6Var.f18322a, ki6Var.c);
                return;
            }
            return;
        }
        if (qi6Var instanceof oi6) {
            c130 c130Var = ((oi6) qi6Var).f25297a;
            long j2 = c130Var.b;
            l9s l9sVar3 = ((hj6) D()).c;
            long jA = l9sVar3 != null ? l9sVar3.a() : 0L;
            this.y.f(jA, j2);
            this.z.i(jA, j2);
            int iOrdinal = c130Var.f3555a.ordinal();
            ctf0 ctf0Var = this.q;
            if (iOrdinal == 0) {
                G(new ej6(ctf0Var.b.a(R.string.auto_sub_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.auto_sub_description, Arrays.copyOf(new Object[0], 0))));
                return;
            }
            if (iOrdinal == 1) {
                G(new ej6(ctf0Var.b.a(R.string.optibet_market_info_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.optibet_market_desc, Arrays.copyOf(new Object[0], 0))));
                return;
            }
            if (iOrdinal == 2) {
                G(new ej6(ctf0Var.b.a(R.string.each_way_dialog_title, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.each_way_description, Arrays.copyOf(new Object[0], 0))));
                return;
            } else if (iOrdinal == 3) {
                sac.V(jiu0.a(this), bk6.f2734a, null, null, new ey((Object) this, j2, (yje) ValueOf, (byte) 8), 14);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        if (!(qi6Var instanceof pi6)) {
            if (qi6Var.equals(li6.f20088a)) {
                i3t0.K(this, null, null, new pn(this, ValueOf, (byte) 10), 3);
                return;
            } else if (qi6Var.equals(ni6.f23567a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        kv20 kv20Var = ((pi6) qi6Var).f27028a;
        if (kv20Var instanceof jv20) {
            jv20 jv20Var = (jv20) kv20Var;
            boolean z = jv20Var.c;
            long j3 = jv20Var.f17186a;
            l9s l9sVar4 = ((hj6) D()).c;
            if (l9sVar4 != null && l9sVar4.c() == 40 && (l9sVar = ((hj6) D()).c) != null) {
                ValueOf = Long.valueOf(l9sVar.d());
            }
            ?? r11 = ValueOf;
            l9s l9sVar5 = ((hj6) D()).c;
            this.y.h(l9sVar5 != null ? l9sVar5.c() : 0L, r11, String.valueOf(j3), z);
            l9s l9sVar6 = ((hj6) D()).c;
            this.z.j(l9sVar6 != null ? l9sVar6.c() : 0L, r11, String.valueOf(j3), z);
        }
        i3t0.A(this, this.v, kv20Var, null, null, 6);
    }
}
