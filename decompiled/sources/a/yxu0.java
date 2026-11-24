package a;

import android.javax.sip.header.WarningHeader;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes2.dex */
public final class yxu0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ dyu0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yxu0(dyu0 dyu0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = dyu0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        dyu0 dyu0Var = this.k;
        switch (b) {
            case 0:
                return new yxu0(dyu0Var, yjeVar, (byte) 0);
            case 1:
                return new yxu0(dyu0Var, yjeVar, (byte) 1);
            default:
                return new yxu0(dyu0Var, yjeVar, (byte) 2);
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
        }
        return ((yxu0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        txu0 txu0Var;
        fwu0 fwu0Var;
        Object objD0;
        Object value2;
        txu0 txu0Var2;
        fwu0 fwu0Var2;
        Object value3;
        Object objN;
        byte b = this.i;
        dyu0 dyu0Var = this.k;
        yje yjeVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                ocj ocjVar = dyu0Var.i;
                ctf0 ctf0Var = dyu0Var.G;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = dyu0.O;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        txu0Var = (txu0) value;
                        fwu0Var = txu0Var.e;
                    } while (!p7m0Var.m(value, txu0.a(txu0Var, null, false, null, new fwu0(fwu0Var.f10278a, fwu0Var.b, false), null, true, false, 0.0d, WarningHeader.MISCELLANEOUS_WARNING)));
                    c5k c5kVar = dyu0Var.F;
                    this.j = true;
                    objD0 = qjj.d0(((mne) c5kVar.f3775a).b, new igb((Object) c5kVar, yjeVar, (byte) 3), this);
                    if (objD0 == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD0 = obj;
                }
                if (((Boolean) objD0).booleanValue()) {
                    dyu0Var.G(new jxu0(new DialogFields((CharSequence) ctf0Var.b.a(R.string.caution, Arrays.copyOf(new Object[0], 0)), (CharSequence) ctf0Var.b.a(R.string.activate_number_alert_title, Arrays.copyOf(new Object[0], 0)), (CharSequence) ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528)));
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        txu0Var2 = (txu0) value2;
                        fwu0Var2 = txu0Var2.e;
                    } while (!p7m0Var2.m(value2, txu0.a(txu0Var2, null, false, null, new fwu0(fwu0Var2.f10278a, fwu0Var2.b, true), null, false, false, 0.0d, 431)));
                } else {
                    int i2 = dyu0.O;
                    bby bbyVar = dyu0Var.M;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    dyu0Var.M = dyu0Var.I(dyu0Var.w.f22085a, new las0(1, dyu0Var.y, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 28), new yxu0(dyu0Var, yjeVar, b2));
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    byte b3 = 19;
                    dnq dnqVar = new dnq(new dnq(new fnq(new fnq(aoq.c(new vsg0(new nv(new fnq(dyu0Var.u.a(new zl60(String.valueOf(dyu0Var.x.b()), (byte) 0)), new n7t0(dyu0Var, yjeVar, (byte) 9), (byte) 4), yjeVar, b3)), new za60(yjeVar, dyu0Var, b3)), new wup0(dyu0Var, yjeVar, (byte) 15)), new rtq0(dyu0Var, yjeVar, (byte) 23), (byte) 4), new jgb0((Object) dyu0Var, yjeVar, (byte) 28), (byte) 1), new sye0(dyu0Var, yjeVar, (byte) 16), (byte) 0);
                    this.j = true;
                    if (slb.N(dnqVar, this) == wneVar2) {
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
            default:
                xrs xrsVar = dyu0Var.q;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    long jA = dyu0Var.z.a();
                    p7m0 p7m0Var3 = dyu0Var.i.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                    } while (!p7m0Var3.m(value3, txu0.a((txu0) value3, null, false, null, null, null, false, jA == xrsVar.f41384a, 0.0d, 383)));
                    if (!((txu0) dyu0Var.D()).d.f1639a) {
                        this.j = true;
                        if (xrsVar.c) {
                            objN = dyu0Var.O(xrsVar.f41384a, this);
                            if (objN != wneVar3) {
                                objN = Unit.f46060a;
                            }
                        } else {
                            objN = dyu0Var.N(xrsVar.b, this);
                            if (objN != wneVar3) {
                                objN = Unit.f46060a;
                            }
                        }
                        if (objN == wneVar3) {
                            return wneVar3;
                        }
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
