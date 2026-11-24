package a;

import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Arrays;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/et90;", "La/nw5;", "La/ft90;", "<init>", "()V", "a/mi70", "captcha"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class et90 extends nw5<ft90> {
    public final n0o0 e2 = maz.b(new bt90(this, 0));
    public final kiu0 f2;
    public final yzn0 g2;
    public final phf0 h2;
    public final nae0 i2;
    public static final /* synthetic */ iiy[] k2 = {new ez40(et90.class, "captureTask", "getCaptureTask()Lorg/xplatform/captcha/api/domain/model/CaptchaTask;", 0), new ez40(et90.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new j0d0(et90.class, "binding", "getBinding()Lorg/xplatform/captcha/databinding/PictureCaptchaDialogFragmentBinding;", 0)};
    public static final mi70 j2 = new mi70();

    public et90() {
        bt90 bt90Var = new bt90(this, (byte) 1);
        byte b = 12;
        byte b2 = 13;
        a8z a8zVarA = maz.a(wez.b, new wz80(new wz80(this, b), b2));
        this.f2 = agc.G(this, sre0.f32672a.b(kt90.class), new a190(a8zVarA, b), new a190(a8zVarA, b2), bt90Var);
        this.g2 = new yzn0("KEY_BUNDLE_CAPTCHA_TASK");
        this.h2 = new phf0("KEY_BUNDLE_REQUEST");
        this.i2 = ltt0.p(this, ct90.f4925a);
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final void O0() {
        DsPresetTextFieldBasic dsPresetTextFieldBasic = L0().d;
        dsPresetTextFieldBasic.b.a(new da0(new yr80(this, (byte) 5)));
        final byte b = 0;
        L0().c.setOnClickListener(new View.OnClickListener(this) { // from class: a.at90
            public final /* synthetic */ et90 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                String strA;
                String str;
                byte b2 = b;
                et90 et90Var = this.b;
                switch (b2) {
                    case 0:
                        mi70 mi70Var = et90.j2;
                        kt90 kt90VarU0 = et90Var.U0();
                        p7m0 p7m0Var = kt90VarU0.e;
                        if (((lt90) p7m0Var.getValue()).b.length() != 0) {
                            qjj.W(jiu0.a(kt90VarU0), null, null, new c670(kt90VarU0, null, (byte) 12), 3);
                        } else {
                            do {
                                value = p7m0Var.getValue();
                                strA = kt90VarU0.c.b.a(R.string.required_field_error, Arrays.copyOf(new Object[0], 0));
                                str = ((lt90) value).b;
                                str.getClass();
                            } while (!p7m0Var.m(value, new lt90(strA, str)));
                        }
                        break;
                    default:
                        mi70 mi70Var2 = et90.j2;
                        ccq0.V(et90Var, "REQUEST_EXIT_WARNING_DIALOG_KEY", new bt90(et90Var, (byte) 2));
                        ii iiVar = ((vni) et90Var.e2.getValue()).c;
                        String strH = et90Var.H(R.string.caution);
                        String strH2 = et90Var.H(R.string.close_the_activation_process_new);
                        String strH3 = et90Var.H(R.string.interrupt);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, et90Var.H(R.string.cancel), (String) null, "REQUEST_EXIT_WARNING_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC = et90Var.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                        break;
                }
            }
        });
        final byte b2 = 1;
        L0().b.setOnClickListener(new View.OnClickListener(this) { // from class: a.at90
            public final /* synthetic */ et90 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object value;
                String strA;
                String str;
                byte b3 = b2;
                et90 et90Var = this.b;
                switch (b3) {
                    case 0:
                        mi70 mi70Var = et90.j2;
                        kt90 kt90VarU0 = et90Var.U0();
                        p7m0 p7m0Var = kt90VarU0.e;
                        if (((lt90) p7m0Var.getValue()).b.length() != 0) {
                            qjj.W(jiu0.a(kt90VarU0), null, null, new c670(kt90VarU0, null, (byte) 12), 3);
                        } else {
                            do {
                                value = p7m0Var.getValue();
                                strA = kt90VarU0.c.b.a(R.string.required_field_error, Arrays.copyOf(new Object[0], 0));
                                str = ((lt90) value).b;
                                str.getClass();
                            } while (!p7m0Var.m(value, new lt90(strA, str)));
                        }
                        break;
                    default:
                        mi70 mi70Var2 = et90.j2;
                        ccq0.V(et90Var, "REQUEST_EXIT_WARNING_DIALOG_KEY", new bt90(et90Var, (byte) 2));
                        ii iiVar = ((vni) et90Var.e2.getValue()).c;
                        String strH = et90Var.H(R.string.caution);
                        String strH2 = et90Var.H(R.string.close_the_activation_process_new);
                        String strH3 = et90Var.H(R.string.interrupt);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, et90Var.H(R.string.cancel), (String) null, "REQUEST_EXIT_WARNING_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC = et90Var.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                        break;
                }
            }
        });
        BottomSheetBehavior bottomSheetBehaviorM0 = M0();
        if (bottomSheetBehaviorM0 != null) {
            bottomSheetBehaviorM0.y(new gw5(this, (byte) 4));
        }
        J0();
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.parent;
    }

    @Override // a.nw5
    public final String S0() {
        String string = G().getString(R.string.picture_captcha_title);
        string.getClass();
        return string;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final ft90 L0() {
        Object objN = this.i2.n(k2[2], this);
        objN.getClass();
        return (ft90) objN;
    }

    public final kt90 U0() {
        return (kt90) this.f2.getValue();
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        N0().c.setVisibility(4);
        kt90 kt90VarU0 = U0();
        yje yjeVar = null;
        sac.V(jiu0.a(kt90VarU0), new yi90(1, kt90VarU0, kt90.class, "onCaptchaDecodeError", "onCaptchaDecodeError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, null, new o690(this.g2.n(this, k2[0]), (Object) kt90VarU0, yjeVar, (byte) 5), 14);
        qoj0 qoj0Var = U0().f;
        lkz lkzVar = lkz.f20223a;
        dt90 dt90Var = new dt90(this, yjeVar, (byte) 0);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new w090(qoj0Var, clzVarW, dt90Var, (yje) null), 3);
        qoj0 qoj0Var2 = U0().d;
        dt90 dt90Var2 = new dt90(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new w090(qoj0Var2, clzVarW2, dt90Var2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var = U0().e;
        dt90 dt90Var3 = new dt90(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new w090(p7m0Var, clzVarW3, dt90Var3, (yje) null), 3);
    }
}
