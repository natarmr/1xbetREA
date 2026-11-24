package a;

import android.view.View;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes2.dex */
public final class sx00 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ tx00 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sx00(tx00 tx00Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = tx00Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        tx00 tx00Var = this.k;
        switch (b) {
            case 0:
                sx00 sx00Var = new sx00(tx00Var, yjeVar, (byte) 0);
                sx00Var.j = obj;
                return sx00Var;
            default:
                sx00 sx00Var2 = new sx00(tx00Var, yjeVar, (byte) 1);
                sx00Var2.j = obj;
                return sx00Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((sx00) create((ey00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((sx00) create((by00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        tx00 tx00Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                ey00 ey00Var = (ey00) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                String str = ey00Var.f8603a;
                boolean z = ey00Var.b;
                evz evzVar = tx00.l2;
                str.getClass();
                if (!Intrinsics.d(tx00Var.K0().b, str)) {
                    tx00Var.R0(DialogFields.a(tx00Var.K0(), str, null, 0, 2045));
                    l12 l12Var = tx00Var.a2;
                    if (l12Var != null) {
                        l12Var.setModel(tx00Var.K0());
                    }
                }
                l12 l12Var2 = tx00Var.a2;
                View positiveButton = l12Var2 != null ? l12Var2.getPositiveButton() : null;
                if (positiveButton != null) {
                    positiveButton.setClickable(z);
                }
                l12 l12Var3 = tx00Var.a2;
                View viewMo5getNegativeButton = l12Var3 != null ? l12Var3.mo5getNegativeButton() : null;
                if (viewMo5getNegativeButton != null) {
                    viewMo5getNegativeButton.setClickable(z);
                }
                return Unit.f46060a;
            default:
                by00 by00Var = (by00) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(by00Var, yx00.f43399a)) {
                    super/*a.u0i*/.O0();
                    tx00Var.z0(false, false, false);
                } else if (Intrinsics.d(by00Var, zx00.f45135a)) {
                    super/*a.u0i*/.O0();
                    j120.g0(tx00Var.o0(), i120.U());
                } else {
                    if (!Intrinsics.d(by00Var, ay00.f1648a)) {
                        t9f.b();
                        return null;
                    }
                    evz evzVar2 = tx00.l2;
                    vcc.f0(i120.V(new Pair("CONNECTION_LOST", Boolean.TRUE)), tx00Var, tx00Var.k2.n(tx00Var, tx00.m2[3]));
                    tx00Var.y0();
                }
                return Unit.f46060a;
        }
    }
}
