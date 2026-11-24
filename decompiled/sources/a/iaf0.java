package a;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/iaf0;", "La/yx5;", "<init>", "()V", "a/zie0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class iaf0 extends yx5 {
    public final e9o0 K1;
    public ori L1;
    public final s0r M1;
    public final a8z N1;
    public final a8z O1;
    public final s0r P1;
    public gl5 Q1;
    public rl70 R1;
    public eke0 S1;
    public pek0 U1;
    public ii V1;
    public wdk0 W1;
    public kd30 X1;
    public ndk0 Y1;
    public static final /* synthetic */ iiy[] a2 = {new j0d0(iaf0.class, "viewBinding", "getViewBinding()Lorg/xplatform/registration/visual/impl/databinding/FragmentRegistrationVisualBinding;", 0), new j0d0(iaf0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final zie0 Z1 = new zie0();
    public static final String b2 = iaf0.class.getName();

    public iaf0() {
        super(R.layout.fragment_registration_visual);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackgroundContent, 8);
        this.M1 = ltt0.o(this, haf0.f12722a);
        this.N1 = maz.a(wez.b, new eaf0(this, (byte) 1));
        this.O1 = xbc.a0(this, sre0.f32672a.b(ocf0.class), null, new eaf0(this, (byte) 2), 14);
        this.P1 = ltt0.o(this, gaf0.f10962a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        if (this.Q1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        gl5.k(this, "UNIVERSAL_REQUEST_CAPTCHA_CODE_DIALOG_KEY", new eaf0(this, (byte) 3), new faf0(this, (byte) 1));
        final byte b = 0;
        sj3.A0(this, "KEY_PICKER_MODEL_REQUEST", new Function2(this) { // from class: a.daf0
            public final /* synthetic */ iaf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b;
                iaf0 iaf0Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b3) {
                    case 0:
                        zie0 zie0Var = iaf0.Z1;
                        iaf0Var.H0().x(new o8f0(f140.h(bundle2, str, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                    case 1:
                        zie0 zie0Var2 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        if (iaf0Var.S1 != null) {
                            iaf0Var.H0().x(new y8f0(bundle2.getInt("KEY_SELECTED_BONUS_ID")));
                            return Unit.f46060a;
                        }
                        Intrinsics.h("registrationBonusDialogFactory");
                        throw null;
                    case 2:
                        zie0 zie0Var3 = iaf0.Z1;
                        iaf0Var.H0().x(new q8f0(f140.h(bundle2, str, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    case 3:
                        zie0 zie0Var4 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        if (iaf0Var.R1 == null) {
                            Intrinsics.h("pickerDialogFactory");
                            throw null;
                        }
                        bundle2.getBoolean("PICKER_DIALOG_TAG");
                        iaf0Var.H0().x(r8f0.f30022a);
                        return Unit.f46060a;
                    case 4:
                        zie0 zie0Var5 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        iaf0Var.H0().x(p8f0.f26551a);
                        return Unit.f46060a;
                    case 5:
                        zie0 zie0Var6 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            iaf0Var.H0().x(new t8f0(simpleDate));
                        }
                        return Unit.f46060a;
                    case 6:
                        zie0 zie0Var7 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate2 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate2 != null) {
                            iaf0Var.H0().x(new t8f0(simpleDate2));
                        }
                        return Unit.f46060a;
                    default:
                        zie0 zie0Var8 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate3 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate3 != null) {
                            iaf0Var.H0().x(new g9f0(simpleDate3));
                        }
                        return Unit.f46060a;
                }
            }
        });
        final byte b3 = 2;
        sj3.A0(this, "KEY_PICKER_COUNTRY_ID_REQUEST", new Function2(this) { // from class: a.daf0
            public final /* synthetic */ iaf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b4 = b3;
                iaf0 iaf0Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b4) {
                    case 0:
                        zie0 zie0Var = iaf0.Z1;
                        iaf0Var.H0().x(new o8f0(f140.h(bundle2, str, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                    case 1:
                        zie0 zie0Var2 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        if (iaf0Var.S1 != null) {
                            iaf0Var.H0().x(new y8f0(bundle2.getInt("KEY_SELECTED_BONUS_ID")));
                            return Unit.f46060a;
                        }
                        Intrinsics.h("registrationBonusDialogFactory");
                        throw null;
                    case 2:
                        zie0 zie0Var3 = iaf0.Z1;
                        iaf0Var.H0().x(new q8f0(f140.h(bundle2, str, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    case 3:
                        zie0 zie0Var4 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        if (iaf0Var.R1 == null) {
                            Intrinsics.h("pickerDialogFactory");
                            throw null;
                        }
                        bundle2.getBoolean("PICKER_DIALOG_TAG");
                        iaf0Var.H0().x(r8f0.f30022a);
                        return Unit.f46060a;
                    case 4:
                        zie0 zie0Var5 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        iaf0Var.H0().x(p8f0.f26551a);
                        return Unit.f46060a;
                    case 5:
                        zie0 zie0Var6 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            iaf0Var.H0().x(new t8f0(simpleDate));
                        }
                        return Unit.f46060a;
                    case 6:
                        zie0 zie0Var7 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate2 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate2 != null) {
                            iaf0Var.H0().x(new t8f0(simpleDate2));
                        }
                        return Unit.f46060a;
                    default:
                        zie0 zie0Var8 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate3 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate3 != null) {
                            iaf0Var.H0().x(new g9f0(simpleDate3));
                        }
                        return Unit.f46060a;
                }
            }
        });
        if (this.R1 == null) {
            Intrinsics.h("pickerDialogFactory");
            throw null;
        }
        final byte b4 = 3;
        sj3.A0(this, "PICKER_DIALOG_TAG", new Function2(this) { // from class: a.daf0
            public final /* synthetic */ iaf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b5 = b4;
                iaf0 iaf0Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b5) {
                    case 0:
                        zie0 zie0Var = iaf0.Z1;
                        iaf0Var.H0().x(new o8f0(f140.h(bundle2, str, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                    case 1:
                        zie0 zie0Var2 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        if (iaf0Var.S1 != null) {
                            iaf0Var.H0().x(new y8f0(bundle2.getInt("KEY_SELECTED_BONUS_ID")));
                            return Unit.f46060a;
                        }
                        Intrinsics.h("registrationBonusDialogFactory");
                        throw null;
                    case 2:
                        zie0 zie0Var3 = iaf0.Z1;
                        iaf0Var.H0().x(new q8f0(f140.h(bundle2, str, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    case 3:
                        zie0 zie0Var4 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        if (iaf0Var.R1 == null) {
                            Intrinsics.h("pickerDialogFactory");
                            throw null;
                        }
                        bundle2.getBoolean("PICKER_DIALOG_TAG");
                        iaf0Var.H0().x(r8f0.f30022a);
                        return Unit.f46060a;
                    case 4:
                        zie0 zie0Var5 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        iaf0Var.H0().x(p8f0.f26551a);
                        return Unit.f46060a;
                    case 5:
                        zie0 zie0Var6 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            iaf0Var.H0().x(new t8f0(simpleDate));
                        }
                        return Unit.f46060a;
                    case 6:
                        zie0 zie0Var7 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate2 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate2 != null) {
                            iaf0Var.H0().x(new t8f0(simpleDate2));
                        }
                        return Unit.f46060a;
                    default:
                        zie0 zie0Var8 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate3 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate3 != null) {
                            iaf0Var.H0().x(new g9f0(simpleDate3));
                        }
                        return Unit.f46060a;
                }
            }
        });
        ccq0.V(this, "REQUEST_USER_EXIST_DIALOG_KEY", new eaf0(this, (byte) 6));
        if (this.R1 == null) {
            Intrinsics.h("pickerDialogFactory");
            throw null;
        }
        final byte b5 = 4;
        sj3.A0(this, "PICKER_DIALOG_TAG", new Function2(this) { // from class: a.daf0
            public final /* synthetic */ iaf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b6 = b5;
                iaf0 iaf0Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b6) {
                    case 0:
                        zie0 zie0Var = iaf0.Z1;
                        iaf0Var.H0().x(new o8f0(f140.h(bundle2, str, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                    case 1:
                        zie0 zie0Var2 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        if (iaf0Var.S1 != null) {
                            iaf0Var.H0().x(new y8f0(bundle2.getInt("KEY_SELECTED_BONUS_ID")));
                            return Unit.f46060a;
                        }
                        Intrinsics.h("registrationBonusDialogFactory");
                        throw null;
                    case 2:
                        zie0 zie0Var3 = iaf0.Z1;
                        iaf0Var.H0().x(new q8f0(f140.h(bundle2, str, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    case 3:
                        zie0 zie0Var4 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        if (iaf0Var.R1 == null) {
                            Intrinsics.h("pickerDialogFactory");
                            throw null;
                        }
                        bundle2.getBoolean("PICKER_DIALOG_TAG");
                        iaf0Var.H0().x(r8f0.f30022a);
                        return Unit.f46060a;
                    case 4:
                        zie0 zie0Var5 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        iaf0Var.H0().x(p8f0.f26551a);
                        return Unit.f46060a;
                    case 5:
                        zie0 zie0Var6 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            iaf0Var.H0().x(new t8f0(simpleDate));
                        }
                        return Unit.f46060a;
                    case 6:
                        zie0 zie0Var7 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate2 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate2 != null) {
                            iaf0Var.H0().x(new t8f0(simpleDate2));
                        }
                        return Unit.f46060a;
                    default:
                        zie0 zie0Var8 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate3 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate3 != null) {
                            iaf0Var.H0().x(new g9f0(simpleDate3));
                        }
                        return Unit.f46060a;
                }
            }
        });
        final byte b6 = 5;
        sj3.A0(this, "REQUEST_BIRTHDAY_CALENDAR_KEY", new Function2(this) { // from class: a.daf0
            public final /* synthetic */ iaf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b7 = b6;
                iaf0 iaf0Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b7) {
                    case 0:
                        zie0 zie0Var = iaf0.Z1;
                        iaf0Var.H0().x(new o8f0(f140.h(bundle2, str, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                    case 1:
                        zie0 zie0Var2 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        if (iaf0Var.S1 != null) {
                            iaf0Var.H0().x(new y8f0(bundle2.getInt("KEY_SELECTED_BONUS_ID")));
                            return Unit.f46060a;
                        }
                        Intrinsics.h("registrationBonusDialogFactory");
                        throw null;
                    case 2:
                        zie0 zie0Var3 = iaf0.Z1;
                        iaf0Var.H0().x(new q8f0(f140.h(bundle2, str, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    case 3:
                        zie0 zie0Var4 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        if (iaf0Var.R1 == null) {
                            Intrinsics.h("pickerDialogFactory");
                            throw null;
                        }
                        bundle2.getBoolean("PICKER_DIALOG_TAG");
                        iaf0Var.H0().x(r8f0.f30022a);
                        return Unit.f46060a;
                    case 4:
                        zie0 zie0Var5 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        iaf0Var.H0().x(p8f0.f26551a);
                        return Unit.f46060a;
                    case 5:
                        zie0 zie0Var6 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            iaf0Var.H0().x(new t8f0(simpleDate));
                        }
                        return Unit.f46060a;
                    case 6:
                        zie0 zie0Var7 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate2 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate2 != null) {
                            iaf0Var.H0().x(new t8f0(simpleDate2));
                        }
                        return Unit.f46060a;
                    default:
                        zie0 zie0Var8 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate3 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate3 != null) {
                            iaf0Var.H0().x(new g9f0(simpleDate3));
                        }
                        return Unit.f46060a;
                }
            }
        });
        final byte b7 = 6;
        sj3.A0(this, "REQUEST_PASSPORT_DATE_ISSUE_CALENDAR_KEY", new Function2(this) { // from class: a.daf0
            public final /* synthetic */ iaf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b8 = b7;
                iaf0 iaf0Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b8) {
                    case 0:
                        zie0 zie0Var = iaf0.Z1;
                        iaf0Var.H0().x(new o8f0(f140.h(bundle2, str, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                    case 1:
                        zie0 zie0Var2 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        if (iaf0Var.S1 != null) {
                            iaf0Var.H0().x(new y8f0(bundle2.getInt("KEY_SELECTED_BONUS_ID")));
                            return Unit.f46060a;
                        }
                        Intrinsics.h("registrationBonusDialogFactory");
                        throw null;
                    case 2:
                        zie0 zie0Var3 = iaf0.Z1;
                        iaf0Var.H0().x(new q8f0(f140.h(bundle2, str, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    case 3:
                        zie0 zie0Var4 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        if (iaf0Var.R1 == null) {
                            Intrinsics.h("pickerDialogFactory");
                            throw null;
                        }
                        bundle2.getBoolean("PICKER_DIALOG_TAG");
                        iaf0Var.H0().x(r8f0.f30022a);
                        return Unit.f46060a;
                    case 4:
                        zie0 zie0Var5 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        iaf0Var.H0().x(p8f0.f26551a);
                        return Unit.f46060a;
                    case 5:
                        zie0 zie0Var6 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            iaf0Var.H0().x(new t8f0(simpleDate));
                        }
                        return Unit.f46060a;
                    case 6:
                        zie0 zie0Var7 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate2 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate2 != null) {
                            iaf0Var.H0().x(new t8f0(simpleDate2));
                        }
                        return Unit.f46060a;
                    default:
                        zie0 zie0Var8 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate3 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate3 != null) {
                            iaf0Var.H0().x(new g9f0(simpleDate3));
                        }
                        return Unit.f46060a;
                }
            }
        });
        final byte b8 = 7;
        sj3.A0(this, "REQUEST_PASSPORT_DATE_EXPIRE_CALENDAR_KEY", new Function2(this) { // from class: a.daf0
            public final /* synthetic */ iaf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b9 = b8;
                iaf0 iaf0Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b9) {
                    case 0:
                        zie0 zie0Var = iaf0.Z1;
                        iaf0Var.H0().x(new o8f0(f140.h(bundle2, str, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                    case 1:
                        zie0 zie0Var2 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        if (iaf0Var.S1 != null) {
                            iaf0Var.H0().x(new y8f0(bundle2.getInt("KEY_SELECTED_BONUS_ID")));
                            return Unit.f46060a;
                        }
                        Intrinsics.h("registrationBonusDialogFactory");
                        throw null;
                    case 2:
                        zie0 zie0Var3 = iaf0.Z1;
                        iaf0Var.H0().x(new q8f0(f140.h(bundle2, str, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    case 3:
                        zie0 zie0Var4 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        if (iaf0Var.R1 == null) {
                            Intrinsics.h("pickerDialogFactory");
                            throw null;
                        }
                        bundle2.getBoolean("PICKER_DIALOG_TAG");
                        iaf0Var.H0().x(r8f0.f30022a);
                        return Unit.f46060a;
                    case 4:
                        zie0 zie0Var5 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        iaf0Var.H0().x(p8f0.f26551a);
                        return Unit.f46060a;
                    case 5:
                        zie0 zie0Var6 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            iaf0Var.H0().x(new t8f0(simpleDate));
                        }
                        return Unit.f46060a;
                    case 6:
                        zie0 zie0Var7 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate2 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate2 != null) {
                            iaf0Var.H0().x(new t8f0(simpleDate2));
                        }
                        return Unit.f46060a;
                    default:
                        zie0 zie0Var8 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate3 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate3 != null) {
                            iaf0Var.H0().x(new g9f0(simpleDate3));
                        }
                        return Unit.f46060a;
                }
            }
        });
        if (this.S1 == null) {
            Intrinsics.h("registrationBonusDialogFactory");
            throw null;
        }
        final byte b9 = 1;
        sj3.A0(this, "KEY_SELECT_BONUS", new Function2(this) { // from class: a.daf0
            public final /* synthetic */ iaf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b10 = b9;
                iaf0 iaf0Var = this.b;
                String str = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                switch (b10) {
                    case 0:
                        zie0 zie0Var = iaf0.Z1;
                        iaf0Var.H0().x(new o8f0(f140.h(bundle2, str, "KEY_PICKER_MODEL_REQUEST")));
                        return Unit.f46060a;
                    case 1:
                        zie0 zie0Var2 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        if (iaf0Var.S1 != null) {
                            iaf0Var.H0().x(new y8f0(bundle2.getInt("KEY_SELECTED_BONUS_ID")));
                            return Unit.f46060a;
                        }
                        Intrinsics.h("registrationBonusDialogFactory");
                        throw null;
                    case 2:
                        zie0 zie0Var3 = iaf0.Z1;
                        iaf0Var.H0().x(new q8f0(f140.h(bundle2, str, "KEY_PICKER_COUNTRY_ID_REQUEST"), bundle2.getBoolean("KEY_PICKER_COUNTRY_ALLOWED_REQUEST")));
                        return Unit.f46060a;
                    case 3:
                        zie0 zie0Var4 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        if (iaf0Var.R1 == null) {
                            Intrinsics.h("pickerDialogFactory");
                            throw null;
                        }
                        bundle2.getBoolean("PICKER_DIALOG_TAG");
                        iaf0Var.H0().x(r8f0.f30022a);
                        return Unit.f46060a;
                    case 4:
                        zie0 zie0Var5 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        iaf0Var.H0().x(p8f0.f26551a);
                        return Unit.f46060a;
                    case 5:
                        zie0 zie0Var6 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate != null) {
                            iaf0Var.H0().x(new t8f0(simpleDate));
                        }
                        return Unit.f46060a;
                    case 6:
                        zie0 zie0Var7 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate2 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate2 != null) {
                            iaf0Var.H0().x(new t8f0(simpleDate2));
                        }
                        return Unit.f46060a;
                    default:
                        zie0 zie0Var8 = iaf0.Z1;
                        str.getClass();
                        bundle2.getClass();
                        SimpleDate simpleDate3 = (SimpleDate) (Build.VERSION.SDK_INT <= 33 ? bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE") : (Parcelable) bundle2.getParcelable("RESULT_KEY_CALENDAR_SIMPLE_DATE", SimpleDate.class));
                        if (simpleDate3 != null) {
                            iaf0Var.H0().x(new g9f0(simpleDate3));
                        }
                        return Unit.f46060a;
                }
            }
        });
        ccq0.V(this, "REQUEST_EXIT_FROM_REGISTRATION_DIALOG_KEY", new eaf0(this, (byte) 0));
        ccq0.T(this, "REQUEST_EXIT_FROM_REGISTRATION_DIALOG_KEY", new eaf0(this, (byte) 4));
        qcc.X(this, new eaf0(this, (byte) 5));
    }

    @Override // a.yx5
    public final void C0() {
        pri priVar = (pri) this.N1.getValue();
        this.L1 = (ori) priVar.M.get();
        this.Q1 = new gl5((byte) 17);
        this.R1 = priVar.G;
        this.S1 = priVar.H;
        this.U1 = priVar.I;
        this.V1 = priVar.J;
        this.W1 = priVar.K;
        this.X1 = priVar.L;
    }

    @Override // a.yx5
    public final void D0() {
        Object objS = !zdx.B(this) ? o050.S(o7k0.c) : o7k0.c;
        Object objN = this.P1.n(a2[1], this);
        objN.getClass();
        pkd.i(((aid) objN).b, null, new ugd(-1699750840, true, new j5d0(objS, this, (byte) 14)));
    }

    public final wdk0 G0() {
        wdk0 wdk0Var = this.W1;
        if (wdk0Var != null) {
            return wdk0Var;
        }
        Intrinsics.h("snackbarManager");
        throw null;
    }

    public final k3t0 H0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        ndk0 ndk0Var = this.Y1;
        if (ndk0Var != null) {
            ndk0Var.dismiss();
        }
        this.Y1 = null;
        this.j1 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        n0().getWindow().setSoftInputMode(32);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        n0().getWindow().setSoftInputMode(16);
        super.e0();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
