package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xplatform.picker.api.presentation.PickerDialogParams;

/* JADX INFO: loaded from: classes5.dex */
public final class jp90 extends bnn0 implements Function1 {
    public boolean i;
    public final /* synthetic */ kp90 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp90(kp90 kp90Var, yje yjeVar) {
        super(1, yjeVar);
        this.j = kp90Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new jp90(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((jp90) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws sp90, c44 {
        kp90 kp90Var = this.j;
        i1w0 i1w0Var = kp90Var.v;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        boolean z2 = false;
        if (!z) {
            z1x.P(obj);
            String str = ((br90) kp90Var.D()).b.f44816a;
            kp90Var.x.x(StringsKt.toIntOrNull(str));
            if (str.length() == 0) {
                throw sp90.f32581a;
            }
            PickerDialogParams.PickerType pickerType = kp90Var.r.f46801a;
            PickerDialogParams.PickerType.Phone phone = pickerType instanceof PickerDialogParams.PickerType.Phone ? (PickerDialogParams.PickerType.Phone) pickerType : null;
            Boolean boolValueOf = phone != null ? Boolean.valueOf(phone.b) : null;
            wti wtiVar = kp90Var.t;
            boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : false;
            this.i = true;
            obj = wtiVar.k(this, str, zBooleanValue);
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
        int i = ((qkt) obj).f28902a;
        try {
            kp90Var.u.a(i);
            z2 = true;
        } catch (Exception unused) {
        }
        i1w0Var.e(new kl90(i, z2), "PICKER_DIALOG_PHONE_CODE_BY_MANUALLY_KEY");
        i1w0Var.d(new gp90(kp90Var, (byte) 3));
        return Unit.f46060a;
    }
}
