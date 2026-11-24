package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class lk20 extends bnn0 implements Function1 {
    public double i;
    public byte j;
    public final /* synthetic */ on20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk20(on20 on20Var, yje yjeVar) {
        super(1, yjeVar);
        this.k = on20Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new lk20(this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((lk20) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        double d;
        double d2;
        double dDoubleValue;
        azc azcVar;
        ctf0 ctf0Var;
        int iOrdinal;
        String strA;
        int iOrdinal2;
        int i;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        on20 on20Var = this.k;
        if (b == 0) {
            z1x.P(obj);
            d = ((a820) on20Var.D()).b.d.f20948a;
            tqc tqcVar = on20Var.G0;
            this.i = d;
            this.j = (byte) 1;
            if (tqcVar.b(true, this) != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            d = this.i;
            z1x.P(obj);
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d2 = this.i;
            z1x.P(obj);
        }
        dDoubleValue = ((Number) obj).doubleValue();
        int i2 = on20.m1;
        if (d2 != 0.0d || dDoubleValue == 0.0d) {
            azcVar = azc.f1709a;
        } else if (d2 > dDoubleValue) {
            azcVar = azc.c;
        } else if (d2 < dDoubleValue) {
            azcVar = azc.b;
        } else {
            azcVar = azc.f1709a;
        }
        ctf0Var = on20Var.D;
        iOrdinal = azcVar.ordinal();
        if (iOrdinal != 0) {
            strA = ctf0Var.b.a(R.string.bet_error_coef_change, Arrays.copyOf(new Object[0], 0));
        } else if (iOrdinal != 1) {
            strA = ctf0Var.b.a(R.string.bet_error_coef_up, Arrays.copyOf(new Object[0], 0));
        } else if (iOrdinal != 2) {
            strA = ctf0Var.b.a(R.string.bet_error_coef_down, Arrays.copyOf(new Object[0], 0));
        } else {
            if (iOrdinal == 3) {
                t9f.b();
                return null;
            }
            strA = ctf0Var.b.a(R.string.bet_error_coef_block, Arrays.copyOf(new Object[0], 0));
        }
        String str = strA;
        iOrdinal2 = azcVar.ordinal();
        if (iOrdinal2 != 0) {
            i = R.drawable.ic_snack_info;
        } else if (iOrdinal2 != 1) {
            i = R.drawable.ic_snack_up;
        } else if (iOrdinal2 != 2) {
            i = R.drawable.ic_snack_down;
        } else {
            if (iOrdinal2 == 3) {
                t9f.b();
                return null;
            }
            i = R.drawable.ic_snack_lock;
        }
        on20Var.G(new pc20(new xdk0(pek0.f26859a, str, null, null, jdk0.f16332a, new Integer(i), 76)));
        return Unit.f46060a;
        qoj0 qoj0Var = ((lye) on20Var.H0.f34873a.b).p;
        kk20 kk20Var = new kk20(d, null);
        this.i = d;
        this.j = (byte) 2;
        obj = ntb.L(qoj0Var, kk20Var, this);
        if (obj != wneVar) {
            d2 = d;
            dDoubleValue = ((Number) obj).doubleValue();
            int i3 = on20.m1;
            if (d2 != 0.0d) {
                azcVar = azc.f1709a;
            } else if (d2 > dDoubleValue) {
                azcVar = azc.c;
            } else if (d2 < dDoubleValue) {
                azcVar = azc.b;
            } else {
                azcVar = azc.f1709a;
            }
            ctf0Var = on20Var.D;
            iOrdinal = azcVar.ordinal();
            if (iOrdinal != 0) {
                strA = ctf0Var.b.a(R.string.bet_error_coef_change, Arrays.copyOf(new Object[0], 0));
            } else if (iOrdinal != 1) {
                strA = ctf0Var.b.a(R.string.bet_error_coef_up, Arrays.copyOf(new Object[0], 0));
            } else if (iOrdinal != 2) {
                strA = ctf0Var.b.a(R.string.bet_error_coef_down, Arrays.copyOf(new Object[0], 0));
            } else {
                if (iOrdinal == 3) {
                    t9f.b();
                    return null;
                }
                strA = ctf0Var.b.a(R.string.bet_error_coef_block, Arrays.copyOf(new Object[0], 0));
            }
            String str2 = strA;
            iOrdinal2 = azcVar.ordinal();
            if (iOrdinal2 != 0) {
                i = R.drawable.ic_snack_info;
            } else if (iOrdinal2 != 1) {
                i = R.drawable.ic_snack_up;
            } else if (iOrdinal2 != 2) {
                i = R.drawable.ic_snack_down;
            } else {
                if (iOrdinal2 == 3) {
                    t9f.b();
                    return null;
                }
                i = R.drawable.ic_snack_lock;
            }
            on20Var.G(new pc20(new xdk0(pek0.f26859a, str2, null, null, jdk0.f16332a, new Integer(i), 76)));
            return Unit.f46060a;
        }
        return wneVar;
    }
}
