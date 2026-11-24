package a;

import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.aggregator.loyalty_program.api.navigation.models.LoyaltyProgramScreenParams;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentScreen$1;

/* JADX INFO: loaded from: classes3.dex */
public final class ph10 extends i3t0 {
    public static final /* synthetic */ int B = 0;
    public bby A;
    public final mne o;
    public final p4u p;
    public final xfu q;
    public final lrc r;
    public final x0u s;
    public final ctf0 t;
    public final gle0 u;
    public final zg v;
    public final au0 w;
    public final duj x;
    public final c4m0 y;
    public bby z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ph10(LoyaltyProgramScreenParams loyaltyProgramScreenParams, mne mneVar, p4u p4uVar, xfu xfuVar, lrc lrcVar, yfu yfuVar, bzt bztVar, wgu wguVar, x0u x0uVar, ctf0 ctf0Var, gle0 gle0Var, zg zgVar, au0 au0Var, m1e m1eVar, uf3 uf3Var, duj dujVar, z7z z7zVar, z7z z7zVar2) {
        wguVar.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        z7zVar.getClass();
        z7zVar2.getClass();
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(rwjVar, rwjVar);
        yje yjeVar = null;
        super(new nf10(ctf0Var, yfuVar, bztVar, wguVar, loyaltyProgramScreenParams, z7zVar, z7zVar2, (byte) 1), g090VarP, new v510(ctf0Var, (byte) 2), (yzn0) null);
        this.o = mneVar;
        this.p = p4uVar;
        this.q = xfuVar;
        this.r = lrcVar;
        this.s = x0uVar;
        this.t = ctf0Var;
        this.u = gle0Var;
        this.v = zgVar;
        this.w = au0Var;
        this.x = dujVar;
        M();
        c4m0 c4m0Var = this.y;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.y = sac.T(new fnq(dtb.z(m1eVar.b(), 1), new slx(this, yjeVar, (byte) 25), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), oh10.h);
        }
    }

    public final void M() {
        bby bbyVar = this.z;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.z = I(this.o.b, new pf10(1, this, ph10.class, "handleContentError", "handleContentError(Ljava/lang/Throwable;)V", 0, (byte) 3), new qf10(this, null, b));
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        eg10 eg10Var = (eg10) obj;
        eg10Var.getClass();
        super.x(eg10Var);
        boolean z = eg10Var instanceof yf10;
        final byte b = 0;
        au0 au0Var = this.w;
        zg zgVar = this.v;
        if (!z) {
            boolean z2 = eg10Var instanceof zf10;
            mne mneVar = this.o;
            final byte b2 = 1;
            yje yjeVar = null;
            if (z2) {
                bby bbyVar = this.A;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.A = I(mneVar.b, new pf10(1, this, ph10.class, "handleClaimCashbackError", "handleClaimCashbackError(Ljava/lang/Throwable;)V", 0, (byte) 2), new epp(this, yjeVar, (byte) 15));
                    return;
                }
                return;
            }
            if (eg10Var instanceof bg10) {
                i8i.D("screen", "cashback", zgVar.f44322a, "promo_VIP_cashback_rules");
                y1p y1pVar = y1p.MAIN;
                au0Var.getClass();
                au0Var.f1455a.a(cui0.b(new j1p("cashback", (byte) 0)), 3315L);
                ((gh10) D()).f.d(new Function1(this) { // from class: a.nh10
                    public final /* synthetic */ ph10 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Object value;
                        Object value2;
                        byte b3 = b2;
                        ph10 ph10Var = this.b;
                        switch (b3) {
                            case 0:
                                oyg0 oyg0Var = ph10Var.f;
                                Throwable th = (Throwable) obj2;
                                th.getClass();
                                ocj ocjVar = ph10Var.i;
                                p7m0 p7m0Var = ocjVar.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                    oyg0Var.getClass();
                                } while (!p7m0Var.m(value, gh10.a((gh10) value, null, false, 127)));
                                ph10Var.x.b(th, new kyz((byte) 27));
                                p7m0 p7m0Var2 = ocjVar.f25029a;
                                do {
                                    value2 = p7m0Var2.getValue();
                                    value2.getClass();
                                    oyg0Var.getClass();
                                } while (!p7m0Var2.m(value2, gh10.a((gh10) value2, gg10.f11231a, false, 239)));
                                break;
                            default:
                                k0w0 k0w0Var = (k0w0) obj2;
                                k0w0Var.getClass();
                                gle0 gle0Var = ph10Var.u;
                                RuleData ruleData = new RuleData("rule_vip_cash_back", 14, (Map) null, (String) null);
                                boolean z3 = ((gh10) ph10Var.D()).e;
                                gle0Var.getClass();
                                k0w0Var.h(new RulesScreenFactoryImpl$getRulesFragmentScreen$1(ruleData, R.string.rules, true, false, z3));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                return;
            }
            if (eg10Var instanceof ag10) {
                bby bbyVar2 = this.z;
                if (bbyVar2 == null || !bbyVar2.isActive()) {
                    this.z = I(mneVar.b, new Function1(this) { // from class: a.nh10
                        public final /* synthetic */ ph10 b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Object value;
                            Object value2;
                            byte b3 = b;
                            ph10 ph10Var = this.b;
                            switch (b3) {
                                case 0:
                                    oyg0 oyg0Var = ph10Var.f;
                                    Throwable th = (Throwable) obj2;
                                    th.getClass();
                                    ocj ocjVar = ph10Var.i;
                                    p7m0 p7m0Var = ocjVar.f25029a;
                                    do {
                                        value = p7m0Var.getValue();
                                        value.getClass();
                                        oyg0Var.getClass();
                                    } while (!p7m0Var.m(value, gh10.a((gh10) value, null, false, 127)));
                                    ph10Var.x.b(th, new kyz((byte) 27));
                                    p7m0 p7m0Var2 = ocjVar.f25029a;
                                    do {
                                        value2 = p7m0Var2.getValue();
                                        value2.getClass();
                                        oyg0Var.getClass();
                                    } while (!p7m0Var2.m(value2, gh10.a((gh10) value2, gg10.f11231a, false, 239)));
                                    break;
                                default:
                                    k0w0 k0w0Var = (k0w0) obj2;
                                    k0w0Var.getClass();
                                    gle0 gle0Var = ph10Var.u;
                                    RuleData ruleData = new RuleData("rule_vip_cash_back", 14, (Map) null, (String) null);
                                    boolean z3 = ((gh10) ph10Var.D()).e;
                                    gle0Var.getClass();
                                    k0w0Var.h(new RulesScreenFactoryImpl$getRulesFragmentScreen$1(ruleData, R.string.rules, true, false, z3));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, new ffd(this, yjeVar, (byte) 19));
                    return;
                }
                return;
            }
            if (eg10Var instanceof cg10) {
                throw null;
            }
            if (!(eg10Var instanceof dg10)) {
                if (eg10Var instanceof xf10) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            if (((gh10) D()).d instanceof gg10) {
                zgVar.l("try_again");
                au0Var.q(k51.b);
                M();
                return;
            }
            return;
        }
        if (((gh10) D()).d instanceof gg10) {
            zgVar.l("back");
            au0Var.q(k51.f17696a);
        }
        i1w0 i1w0Var = ((gh10) D()).f;
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
