package a;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class or10 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25716a;
    public final /* synthetic */ qr10 b;

    public /* synthetic */ or10(qr10 qr10Var, byte b) {
        this.f25716a = b;
        this.b = qr10Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25716a;
        qr10 qr10Var = this.b;
        switch (b) {
            case 0:
                evz evzVar = qr10.V1;
                qr10Var.I0().x(new o780(f140.h((Bundle) obj2, (String) obj, "REQUEST_SELECT_THEME_DIALOG_KEY")));
                break;
            case 1:
                qr10 qr10Var2 = this.b;
                a8z a8zVar = qr10Var2.N1;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                evz evzVar2 = qr10.V1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k3t0 k3t0VarG0 = qr10Var2.G0();
                    boolean zI = fetVar.i(qr10Var2);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        pf10 pf10Var = new pf10(1, qr10Var2, qr10.class, "handleHistorySideEffect", "handleHistorySideEffect(Lorg/xplatform/callback/impl/presentation/history_compose/actions/CallbackHistorySideEffect;)V", 0, (byte) 18);
                        fetVar.o0(pf10Var);
                        objP = pf10Var;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                    boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(qr10Var2) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        p000 p000Var = new p000(k3t0VarG0, qr10Var2, pz40VarF, null, (byte) 5);
                        fetVar.o0(p000Var);
                        objP2 = p000Var;
                    }
                    m0x0.t(fetVar, qr10Var2, (Function2) objP2);
                    k3t0 k3t0VarI0 = qr10Var2.I0();
                    boolean zI3 = fetVar.i(qr10Var2);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        pf10 pf10Var2 = new pf10(1, qr10Var2, qr10.class, "handleCallbackSideEffect", "handleCallbackSideEffect(Lorg/xplatform/callback/impl/presentation/call/compose/models/OrderCallBackSideEffect;)V", 0, (byte) 19);
                        fetVar.o0(pf10Var2);
                        objP3 = pf10Var2;
                    }
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP3), fetVar);
                    boolean zI4 = fetVar.i(k3t0VarI0) | fetVar.i(qr10Var2) | fetVar.e(3) | fetVar.g(pz40VarF2);
                    Object objP4 = fetVar.P();
                    if (zI4 || objP4 == cl5Var) {
                        p000 p000Var2 = new p000(k3t0VarI0, qr10Var2, pz40VarF2, null, (byte) 6);
                        fetVar.o0(p000Var2);
                        objP4 = p000Var2;
                    }
                    m0x0.t(fetVar, qr10Var2, (Function2) objP4);
                    boolean zBooleanValue = qr10Var2.R1.n(qr10Var2, qr10.W1[1]).booleanValue();
                    mm40 mm40VarR = jm40.b;
                    if (zBooleanValue) {
                        mm40VarR = knm0.r(mm40VarR);
                    }
                    mm40 mm40Var = mm40VarR;
                    tr10 tr10Var = (tr10) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue();
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI5 = fetVar.i(k3t0Var);
                    Object objP5 = fetVar.P();
                    if (zI5 || objP5 == cl5Var) {
                        pf10 pf10Var3 = new pf10(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                        fetVar.o0(pf10Var3);
                        objP5 = pf10Var3;
                    }
                    c3x.d(mm40Var, tr10Var, (Function1) ((jhy) objP5), u1c.M(409002461, new csw(qr10Var2, (byte) 3), fetVar), fetVar, 3072);
                } else {
                    fetVar.X();
                }
                break;
            case 2:
                evz evzVar3 = qr10.V1;
                ((String) obj).getClass();
                ((Bundle) obj2).getClass();
                qr10Var.G0().x(lq9.f20475a);
                break;
            case 3:
                Bundle bundle = (Bundle) obj2;
                evz evzVar4 = qr10.V1;
                int iH = f140.h(bundle, (String) obj, "KEY_PICKER_MODEL_REQUEST");
                PickerParams pickerParams = (PickerParams) bundle.getParcelable("PICKER_PARAMS_KEY");
                if (pickerParams != null) {
                    qr10Var.I0().x(new k780(iH, pickerParams));
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj2;
                evz evzVar5 = qr10.V1;
                qr10Var.I0().x(new l780(f140.h(bundle2, (String) obj, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                break;
        }
        return Unit.f46060a;
    }
}
