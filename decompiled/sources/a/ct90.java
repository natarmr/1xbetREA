package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ct90 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ct90 f4925a = new ct90(1, ft90.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/captcha/databinding/PictureCaptchaDialogFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.picture_captcha_dialog_fragment, (ViewGroup) null, false);
        int i = R.id.buttonCancel;
        MaterialButton materialButton = (MaterialButton) yum0.f(viewInflate, R.id.buttonCancel);
        if (materialButton != null) {
            i = R.id.buttonNext;
            MaterialButton materialButton2 = (MaterialButton) yum0.f(viewInflate, R.id.buttonNext);
            if (materialButton2 != null) {
                i = R.id.captchaCode;
                DsPresetTextFieldBasic dsPresetTextFieldBasic = (DsPresetTextFieldBasic) yum0.f(viewInflate, R.id.captchaCode);
                if (dsPresetTextFieldBasic != null) {
                    i = R.id.captchaImage;
                    ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.captchaImage);
                    if (imageView != null) {
                        return new ft90((ConstraintLayout) viewInflate, materialButton, materialButton2, dsPresetTextFieldBasic, imageView);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
