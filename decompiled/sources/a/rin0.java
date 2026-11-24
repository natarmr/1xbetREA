package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rin0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rin0 f30552a = new rin0(1, tin0.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/support/impl/databinding/SupportAppBottomSheetDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.support_app_bottom_sheet_dialog, (ViewGroup) null, false);
        int i = R.id.btnApply;
        Button button = (Button) yum0.f(viewInflate, R.id.btnApply);
        if (button != null) {
            i = R.id.btnCancel;
            Button button2 = (Button) yum0.f(viewInflate, R.id.btnCancel);
            if (button2 != null) {
                i = R.id.btnClose;
                ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.btnClose);
                if (imageView != null) {
                    i = R.id.card;
                    if (((FrameLayout) yum0.f(viewInflate, R.id.card)) != null) {
                        i = R.id.image;
                        if (((ShapeableImageView) yum0.f(viewInflate, R.id.image)) != null) {
                            i = R.id.left_guideline;
                            if (((Guideline) yum0.f(viewInflate, R.id.left_guideline)) != null) {
                                i = R.id.nsvAuthDialog;
                                if (((NestedScrollView) yum0.f(viewInflate, R.id.nsvAuthDialog)) != null) {
                                    i = R.id.right_guideline;
                                    if (((Guideline) yum0.f(viewInflate, R.id.right_guideline)) != null) {
                                        i = R.id.tvDescription;
                                        if (((TextView) yum0.f(viewInflate, R.id.tvDescription)) != null) {
                                            i = R.id.tvTitle;
                                            if (((TextView) yum0.f(viewInflate, R.id.tvTitle)) != null) {
                                                return new tin0((ConstraintLayout) viewInflate, button, button2, imageView);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
