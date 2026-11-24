package a;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.aggregator.loyalty_program.api.navigation.models.LoyaltyProgramScreenParams;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentScreen$1;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class sf10 extends i3t0 {
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
    public sf10(LoyaltyProgramScreenParams loyaltyProgramScreenParams, mne mneVar, p4u p4uVar, xfu xfuVar, lrc lrcVar, yfu yfuVar, bzt bztVar, wgu wguVar, x0u x0uVar, ctf0 ctf0Var, gle0 gle0Var, zg zgVar, au0 au0Var, m1e m1eVar, duj dujVar, z7z z7zVar, z7z z7zVar2) {
        wguVar.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        z7zVar.getClass();
        z7zVar2.getClass();
        rwj rwjVar = mneVar.f22085a;
        yje yjeVar = null;
        super(new nf10(ctf0Var, yfuVar, bztVar, wguVar, loyaltyProgramScreenParams, z7zVar, z7zVar2, (byte) 0), cvm0.p(rwjVar, rwjVar), new v510(ctf0Var, (byte) 1), (yzn0) null);
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
            this.y = sac.T(new fnq(dtb.z(m1eVar.b(), 1), new slx(this, yjeVar, (byte) 24), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), rf10.h);
        }
    }

    public final void M() {
        bby bbyVar = this.z;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.z = I(this.o.b, new pf10(1, this, sf10.class, "handleContentError", "handleContentError(Ljava/lang/Throwable;)V", 0, (byte) 0), new qf10(this, null, (byte) 0));
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        pe10 pe10Var = (pe10) obj;
        pe10Var.getClass();
        super.x(pe10Var);
        boolean z = pe10Var instanceof je10;
        final byte b = 0;
        au0 au0Var = this.w;
        zg zgVar = this.v;
        if (!z) {
            if (pe10Var instanceof ke10) {
                ctf0 ctf0Var = this.t;
                lsm0 lsm0Var = ctf0Var.b;
                lsm0 lsm0Var2 = ctf0Var.b;
                G(new hf10(new DialogFields((CharSequence) lsm0Var.a(R.string.confirmation, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var2.a(R.string.cashback_approve_question, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var2.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)), (String) null, "REQUEST_GET_CASHBACK_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488)));
                return;
            }
            boolean z2 = pe10Var instanceof le10;
            yje yjeVar = null;
            mne mneVar = this.o;
            final byte b2 = 1;
            if (z2) {
                bby bbyVar = this.A;
                if (bbyVar == null || !bbyVar.isActive()) {
                    this.A = I(mneVar.b, new svz(1, this, sf10.class, "handleClaimCashbackError", "handleClaimCashbackError(Ljava/lang/Throwable;)V", 0, (byte) 29), new epp(this, yjeVar, (byte) 14));
                    return;
                }
                return;
            }
            if (pe10Var instanceof ne10) {
                i8i.D("screen", "cashback", zgVar.f44322a, "promo_VIP_cashback_rules");
                y1p y1pVar = y1p.MAIN;
                au0Var.getClass();
                au0Var.f1455a.a(cui0.b(new j1p("cashback", (byte) 0)), 3315L);
                ((lf10) D()).f.d(new Function1(this) { // from class: a.of10
                    public final /* synthetic */ sf10 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Object value;
                        Object value2;
                        byte b3 = b2;
                        sf10 sf10Var = this.b;
                        switch (b3) {
                            case 0:
                                oyg0 oyg0Var = sf10Var.f;
                                Throwable th = (Throwable) obj2;
                                th.getClass();
                                ocj ocjVar = sf10Var.i;
                                p7m0 p7m0Var = ocjVar.f25029a;
                                do {
                                    value = p7m0Var.getValue();
                                    value.getClass();
                                    oyg0Var.getClass();
                                } while (!p7m0Var.m(value, lf10.a((lf10) value, null, false, 127)));
                                sf10Var.x.b(th, new kyz((byte) 24));
                                p7m0 p7m0Var2 = ocjVar.f25029a;
                                do {
                                    value2 = p7m0Var2.getValue();
                                    value2.getClass();
                                    oyg0Var.getClass();
                                } while (!p7m0Var2.m(value2, lf10.a((lf10) value2, te10.f33797a, false, 239)));
                                break;
                            default:
                                k0w0 k0w0Var = (k0w0) obj2;
                                k0w0Var.getClass();
                                gle0 gle0Var = sf10Var.u;
                                RuleData ruleData = new RuleData("rule_vip_cash_back", 14, (Map) null, (String) null);
                                boolean z3 = ((lf10) sf10Var.D()).e;
                                gle0Var.getClass();
                                k0w0Var.h(new RulesScreenFactoryImpl$getRulesFragmentScreen$1(ruleData, R.string.rules, true, false, z3));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                return;
            }
            if (pe10Var instanceof me10) {
                bby bbyVar2 = this.z;
                if (bbyVar2 == null || !bbyVar2.isActive()) {
                    this.z = I(mneVar.b, new Function1(this) { // from class: a.of10
                        public final /* synthetic */ sf10 b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            Object value;
                            Object value2;
                            byte b3 = b;
                            sf10 sf10Var = this.b;
                            switch (b3) {
                                case 0:
                                    oyg0 oyg0Var = sf10Var.f;
                                    Throwable th = (Throwable) obj2;
                                    th.getClass();
                                    ocj ocjVar = sf10Var.i;
                                    p7m0 p7m0Var = ocjVar.f25029a;
                                    do {
                                        value = p7m0Var.getValue();
                                        value.getClass();
                                        oyg0Var.getClass();
                                    } while (!p7m0Var.m(value, lf10.a((lf10) value, null, false, 127)));
                                    sf10Var.x.b(th, new kyz((byte) 24));
                                    p7m0 p7m0Var2 = ocjVar.f25029a;
                                    do {
                                        value2 = p7m0Var2.getValue();
                                        value2.getClass();
                                        oyg0Var.getClass();
                                    } while (!p7m0Var2.m(value2, lf10.a((lf10) value2, te10.f33797a, false, 239)));
                                    break;
                                default:
                                    k0w0 k0w0Var = (k0w0) obj2;
                                    k0w0Var.getClass();
                                    gle0 gle0Var = sf10Var.u;
                                    RuleData ruleData = new RuleData("rule_vip_cash_back", 14, (Map) null, (String) null);
                                    boolean z3 = ((lf10) sf10Var.D()).e;
                                    gle0Var.getClass();
                                    k0w0Var.h(new RulesScreenFactoryImpl$getRulesFragmentScreen$1(ruleData, R.string.rules, true, false, z3));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, new ffd(this, yjeVar, (byte) 18));
                    return;
                }
                return;
            }
            if (!(pe10Var instanceof oe10)) {
                if (pe10Var instanceof ie10) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            if (((lf10) D()).d instanceof te10) {
                zgVar.l("try_again");
                au0Var.q(k51.b);
                M();
                return;
            }
            return;
        }
        if (((lf10) D()).d instanceof te10) {
            zgVar.l("back");
            au0Var.q(k51.f17696a);
        }
        i1w0 i1w0Var = ((lf10) D()).f;
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
