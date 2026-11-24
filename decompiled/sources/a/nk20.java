package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class nk20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ nn20 k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk20(nn20 nn20Var, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nn20Var;
        this.l = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.l;
        nn20 nn20Var = this.k;
        switch (b) {
            case 0:
                return new nk20(nn20Var, str, yjeVar, (byte) 0);
            default:
                return new nk20(nn20Var, str, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((nk20) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        final String str = this.l;
        final nn20 nn20Var = this.k;
        final byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    f3c f3cVar = nn20Var.v;
                    this.j = true;
                    obj = f3cVar.a(this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                final m97 m97Var = (m97) obj;
                final byte b3 = 0;
                Function1 function1 = new Function1() { // from class: a.mk20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        String strA;
                        Integer numValueOf;
                        Integer num;
                        m97 m97Var2 = (m97) obj2;
                        switch (b3) {
                            case 0:
                                m97 m97Var3 = m97Var;
                                double d = m97Var3.l;
                                double d2 = m97Var2.l;
                                int i = nn20.c1;
                                nn20 nn20Var2 = nn20Var;
                                czc czcVarA0 = nn20Var2.a0(d, d2, false);
                                ctf0 ctf0Var = nn20Var2.S;
                                pek0 pek0Var = pek0.f26859a;
                                int iOrdinal = czcVarA0.ordinal();
                                if (iOrdinal == 1) {
                                    strA = ctf0Var.b.a(R.string.bet_error_coef_up, Arrays.copyOf(new Object[0], 0));
                                } else if (iOrdinal != 2) {
                                    strA = iOrdinal != 3 ? str : ctf0Var.b.a(R.string.bet_error_coef_block, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA = ctf0Var.b.a(R.string.bet_error_coef_down, Arrays.copyOf(new Object[0], 0));
                                }
                                int iOrdinal2 = czcVarA0.ordinal();
                                if (iOrdinal2 == 1) {
                                    numValueOf = Integer.valueOf(R.drawable.ic_snack_up);
                                } else if (iOrdinal2 != 2) {
                                    if (iOrdinal2 != 3) {
                                        num = null;
                                    } else {
                                        numValueOf = Integer.valueOf(R.drawable.ic_snack_lock);
                                    }
                                    nn20Var2.G(new qc20(new xdk0(pek0Var, strA, null, null, jdk0.f16332a, num, 76)));
                                    i3t0.K(nn20Var2, null, null, new hnp(nn20Var2, m97Var2, m97Var3, false, (yje) null), 3);
                                    nn20Var2.M0();
                                } else {
                                    numValueOf = Integer.valueOf(R.drawable.ic_snack_down);
                                }
                                num = numValueOf;
                                nn20Var2.G(new qc20(new xdk0(pek0Var, strA, null, null, jdk0.f16332a, num, 76)));
                                i3t0.K(nn20Var2, null, null, new hnp(nn20Var2, m97Var2, m97Var3, false, (yje) null), 3);
                                nn20Var2.M0();
                                break;
                            default:
                                boolean z2 = m97Var2.d;
                                nn20 nn20Var3 = nn20Var;
                                if (z2) {
                                    int i2 = nn20.c1;
                                    nn20Var3.getClass();
                                    i3t0.K(nn20Var3, null, null, new xg0(nn20Var3, m97Var2, m97Var, null, (byte) 17), 3);
                                }
                                qc20 qc20Var = new qc20(new xdk0(rek0.b, str, null, null, jdk0.f16332a, null, 108));
                                int i3 = nn20.c1;
                                nn20Var3.G(qc20Var);
                                nn20Var3.M0();
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                int i = nn20.c1;
                nn20Var.I0(function1);
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    f3c f3cVar2 = nn20Var.v;
                    this.j = true;
                    obj = f3cVar2.a(this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                final m97 m97Var2 = (m97) obj;
                Function1 function2 = new Function1() { // from class: a.mk20
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        String strA;
                        Integer numValueOf;
                        Integer num;
                        m97 m97Var3 = (m97) obj2;
                        switch (b2) {
                            case 0:
                                m97 m97Var4 = m97Var2;
                                double d = m97Var4.l;
                                double d2 = m97Var3.l;
                                int i2 = nn20.c1;
                                nn20 nn20Var2 = nn20Var;
                                czc czcVarA0 = nn20Var2.a0(d, d2, false);
                                ctf0 ctf0Var = nn20Var2.S;
                                pek0 pek0Var = pek0.f26859a;
                                int iOrdinal = czcVarA0.ordinal();
                                if (iOrdinal == 1) {
                                    strA = ctf0Var.b.a(R.string.bet_error_coef_up, Arrays.copyOf(new Object[0], 0));
                                } else if (iOrdinal != 2) {
                                    strA = iOrdinal != 3 ? str : ctf0Var.b.a(R.string.bet_error_coef_block, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA = ctf0Var.b.a(R.string.bet_error_coef_down, Arrays.copyOf(new Object[0], 0));
                                }
                                int iOrdinal2 = czcVarA0.ordinal();
                                if (iOrdinal2 == 1) {
                                    numValueOf = Integer.valueOf(R.drawable.ic_snack_up);
                                } else if (iOrdinal2 != 2) {
                                    if (iOrdinal2 != 3) {
                                        num = null;
                                    } else {
                                        numValueOf = Integer.valueOf(R.drawable.ic_snack_lock);
                                    }
                                    nn20Var2.G(new qc20(new xdk0(pek0Var, strA, null, null, jdk0.f16332a, num, 76)));
                                    i3t0.K(nn20Var2, null, null, new hnp(nn20Var2, m97Var3, m97Var4, false, (yje) null), 3);
                                    nn20Var2.M0();
                                } else {
                                    numValueOf = Integer.valueOf(R.drawable.ic_snack_down);
                                }
                                num = numValueOf;
                                nn20Var2.G(new qc20(new xdk0(pek0Var, strA, null, null, jdk0.f16332a, num, 76)));
                                i3t0.K(nn20Var2, null, null, new hnp(nn20Var2, m97Var3, m97Var4, false, (yje) null), 3);
                                nn20Var2.M0();
                                break;
                            default:
                                boolean z3 = m97Var3.d;
                                nn20 nn20Var3 = nn20Var;
                                if (z3) {
                                    int i3 = nn20.c1;
                                    nn20Var3.getClass();
                                    i3t0.K(nn20Var3, null, null, new xg0(nn20Var3, m97Var3, m97Var2, null, (byte) 17), 3);
                                }
                                qc20 qc20Var = new qc20(new xdk0(rek0.b, str, null, null, jdk0.f16332a, null, 108));
                                int i4 = nn20.c1;
                                nn20Var3.G(qc20Var);
                                nn20Var3.M0();
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                int i2 = nn20.c1;
                nn20Var.I0(function2);
                return Unit.f46060a;
        }
    }
}
