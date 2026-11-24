package a;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class axe0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1621a;
    public final /* synthetic */ dxe0 b;

    public /* synthetic */ axe0(dxe0 dxe0Var, byte b) {
        this.f1621a = b;
        this.b = dxe0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1621a;
        dxe0 dxe0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                lme0 lme0Var = dxe0.Y1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    n0q n0qVar = o7k0.c;
                    dxe0 dxe0Var2 = this.b;
                    pz40 pz40VarY = ((i3t0) dxe0Var2.G0()).y(fetVar);
                    boolean z = !zdx.B(dxe0Var2);
                    k3t0 k3t0VarG0 = dxe0Var2.G0();
                    boolean zI = fetVar.i(k3t0VarG0);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zI || objP == cl5Var) {
                        d8e0 d8e0Var = new d8e0(1, k3t0VarG0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                        fetVar.o0(d8e0Var);
                        objP = d8e0Var;
                    }
                    q8a.A(n0qVar, pz40VarY, z, (Function1) ((jhy) objP), fetVar, 6);
                    k3t0 k3t0VarG1 = dxe0Var2.G0();
                    boolean zI2 = fetVar.i(dxe0Var2);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        d8e0 d8e0Var2 = new d8e0(1, dxe0Var2, dxe0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/registration_default/impl/presentation/udf/models/RegistrationDefaultSideEffect;)V", 0, (byte) 23);
                        fetVar.o0(d8e0Var2);
                        objP2 = d8e0Var2;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP2), fetVar);
                    boolean zI3 = fetVar.i(k3t0VarG1) | fetVar.i(dxe0Var2) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        nu80 nu80Var = new nu80(k3t0VarG1, dxe0Var2, pz40VarF, null, (byte) 15);
                        fetVar.o0(nu80Var);
                        objP3 = nu80Var;
                    }
                    m0x0.t(fetVar, dxe0Var2, (Function2) objP3);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                Bundle bundle = (Bundle) obj2;
                lme0 lme0Var2 = dxe0.Y1;
                ((String) obj).getClass();
                bundle.getClass();
                SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                if (simpleDate != null) {
                    dxe0Var.G0().x(new gve0(simpleDate));
                }
                return Unit.f46060a;
            case 2:
                Bundle bundle2 = (Bundle) obj2;
                lme0 lme0Var3 = dxe0.Y1;
                ((String) obj).getClass();
                bundle2.getClass();
                SimpleDate simpleDate2 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                if (simpleDate2 != null) {
                    dxe0Var.G0().x(new uve0(simpleDate2));
                }
                return Unit.f46060a;
            case 3:
                Bundle bundle3 = (Bundle) obj2;
                lme0 lme0Var4 = dxe0.Y1;
                ((String) obj).getClass();
                bundle3.getClass();
                SimpleDate simpleDate3 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle3.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle3.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                if (simpleDate3 != null) {
                    dxe0Var.G0().x(new tve0(simpleDate3));
                }
                return Unit.f46060a;
            case 4:
                lme0 lme0Var5 = dxe0.Y1;
                dxe0Var.G0().x(new bve0(f140.h((Bundle) obj2, (String) obj, "KEY_PICKER_MODEL_REQUEST")));
                return Unit.f46060a;
            case 5:
                Bundle bundle4 = (Bundle) obj2;
                lme0 lme0Var6 = dxe0.Y1;
                dxe0Var.G0().x(new dve0(f140.h(bundle4, (String) obj, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle4.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                return Unit.f46060a;
            case 6:
                Bundle bundle5 = (Bundle) obj2;
                lme0 lme0Var7 = dxe0.Y1;
                ((String) obj).getClass();
                bundle5.getClass();
                if (dxe0Var.N1 == null) {
                    Intrinsics.h("pickerDialogFactory");
                    throw null;
                }
                bundle5.getBoolean("PICKER_DIALOG_TAG");
                dxe0Var.G0().x(eve0.f8464a);
                return Unit.f46060a;
            case 7:
                lme0 lme0Var8 = dxe0.Y1;
                ((String) obj).getClass();
                ((Bundle) obj2).getClass();
                dxe0Var.G0().x(cve0.f5027a);
                return Unit.f46060a;
            default:
                Bundle bundle6 = (Bundle) obj2;
                lme0 lme0Var9 = dxe0.Y1;
                int iH = f140.h(bundle6, (String) obj, "KEY_ID_BONUS");
                String string = bundle6.getString("KEY_NAME_BONUS");
                if (string == null) {
                    string = "";
                }
                dxe0Var.G0().x(new lve0(iH, string));
                return Unit.f46060a;
        }
    }
}
