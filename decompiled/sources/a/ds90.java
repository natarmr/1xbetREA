package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes5.dex */
public final class ds90 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ es90 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds90(es90 es90Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = es90Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new ds90(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ds90) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws sp90, c44 {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        boolean z2 = false;
        es90 es90Var = this.j;
        if (!z) {
            z1x.P(obj);
            String strR = kotlin.text.c.r(((cr90) ((p7m0) es90Var.i.b).getValue()).c, "+", "", false);
            es90Var.j.x(StringsKt.toIntOrNull(strR));
            if (strR.length() == 0) {
                throw sp90.f32581a;
            }
            wti wtiVar = es90Var.g;
            PickerParams pickerParams = es90Var.e;
            PickerParams.Phone phone = pickerParams instanceof PickerParams.Phone ? (PickerParams.Phone) pickerParams : null;
            boolean z3 = phone != null ? phone.b : false;
            this.i = true;
            obj = wtiVar.k(this, strR, z3);
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
        p7m0 p7m0Var = es90Var.k;
        int i = ((qkt) obj).f28902a;
        try {
            es90Var.h.a(i);
            z2 = true;
        } catch (Exception unused) {
        }
        lp90 lp90Var = new lp90(i, z2);
        p7m0Var.getClass();
        p7m0Var.o(null, lp90Var);
        return Unit.f46060a;
    }
}
