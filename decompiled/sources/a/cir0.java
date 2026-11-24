package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
public final class cir0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ fir0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cir0(fir0 fir0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = fir0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        fir0 fir0Var = this.k;
        switch (b) {
            case 0:
                return new cir0(fir0Var, yjeVar, (byte) 0);
            case 1:
                return new cir0(fir0Var, yjeVar, (byte) 1);
            case 2:
                return new cir0(fir0Var, yjeVar, (byte) 2);
            case 3:
                return new cir0(fir0Var, yjeVar, (byte) 3);
            case 4:
                return new cir0(fir0Var, yjeVar, (byte) 4);
            case 5:
                return new cir0(fir0Var, yjeVar, (byte) 5);
            default:
                return new cir0(fir0Var, yjeVar, (byte) 6);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((cir0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objH;
        Object objF;
        Object value;
        byte b = this.i;
        Object[] objArr = 0;
        fir0 fir0Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    xex xexVar = fir0Var.L;
                    this.j = true;
                    objH = xexVar.H(this);
                    if (objH == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objH = obj;
                }
                if (((Boolean) objH).booleanValue()) {
                    ctf0 ctf0Var = fir0Var.I;
                    ctf0Var.getClass();
                    lsm0 lsm0Var = ctf0Var.b;
                    fir0Var.G(new rhr0(new DialogFields((CharSequence) lsm0Var.a(R.string.attention, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var.a(R.string.unacceptable_account_for_section, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var.a(R.string.ok, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528)));
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    usc uscVar = fir0Var.A;
                    this.j = true;
                    if (uscVar.a(this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                fir0 fir0Var2 = this.k;
                ctf0 ctf0Var2 = fir0Var2.I;
                ctu ctuVar = fir0Var2.t;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    if (ctuVar.f4960a.r().c != ulr0.TOTO_1XTOTO) {
                        boolean zV = fir0Var2.F.v();
                        String str = ctuVar.f4960a.r().b;
                        String strValueOf = String.valueOf(fir0Var2.D.a());
                        boolean z4 = fir0Var2.w.a().l.g;
                        if (zV) {
                            fir0Var2.G(new shr0(str, strValueOf, z4, fir0Var2.P.c(j820.c) != ua20.MEDIUM_NO_GAME_INFO));
                        } else {
                            ctf0Var2.getClass();
                            lsm0 lsm0Var2 = ctf0Var2.b;
                            fir0Var2.G(new rhr0(new DialogFields((CharSequence) lsm0Var2.a(R.string.toto_card_filling_error, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var2.a(R.string.toto_warning_too_many_outcomes, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var2.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528)));
                        }
                        return Unit.f46060a;
                    }
                    g2v g2vVar = fir0Var2.G;
                    this.j = true;
                    objF = g2vVar.f(this);
                    if (objF == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objF = obj;
                }
                if (((Boolean) objF).booleanValue()) {
                    int i = fir0.X;
                    i3t0.K(fir0Var2, null, new ddr0(1, fir0Var2, fir0.class, "handleMakeBetError", "handleMakeBetError(Ljava/lang/Throwable;)V", 0, (byte) 10), new dir0(fir0Var2, yjeVar, objArr == true ? 1 : 0), 1);
                } else {
                    ctf0Var2.getClass();
                    lsm0 lsm0Var3 = ctf0Var2.b;
                    fir0Var2.G(new rhr0(new DialogFields((CharSequence) lsm0Var3.a(R.string.attention, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var3.a(R.string.make_bet_from_primary_balance, Arrays.copyOf(new Object[0], 0)), (CharSequence) lsm0Var3.a(R.string.ok, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.cancel, Arrays.copyOf(new Object[0], 0)), (String) null, "SHOW_CHANGE_BALANCE_ACTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488)));
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    nhf0 nhf0Var = fir0Var.C;
                    this.j = true;
                    if (nhf0Var.w(this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    zpu zpuVar = fir0Var.M;
                    this.j = true;
                    if (zpuVar.j(this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    yk00 yk00Var = fir0Var.s;
                    this.j = true;
                    Object objD = yk00Var.f42764a.d(this);
                    if (objD != wneVar6) {
                        objD = Unit.f46060a;
                    }
                    if (objD == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    uen uenVar = wen.b;
                    long jW0 = ibc.w0(400L, bfn.MILLISECONDS);
                    this.j = true;
                    if (qcc.P(jW0, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = fir0.X;
                p7m0 p7m0Var = fir0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, yhr0.a((yhr0) value, khr0.f18306a, null, null, false, false, 0L, 0L, null, 510)));
                fir0Var.N.a();
                return Unit.f46060a;
        }
    }
}
