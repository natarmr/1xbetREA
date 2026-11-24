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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class mk4 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mk4 f21925a = new mk4(1, rk4.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/popular/impl/databinding/AuthOfferDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.auth_offer_dialog, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = R.id.card;
        if (((FrameLayout) yum0.f(viewInflate, R.id.card)) != null) {
            i = R.id.close_button;
            ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.close_button);
            if (imageView != null) {
                i = R.id.image;
                ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewInflate, R.id.image);
                if (shapeableImageView != null) {
                    i = R.id.left_guideline;
                    if (((Guideline) yum0.f(viewInflate, R.id.left_guideline)) != null) {
                        i = R.id.login_button;
                        Button button = (Button) yum0.f(viewInflate, R.id.login_button);
                        if (button != null) {
                            i = R.id.not_auth_dialog_description;
                            if (((TextView) yum0.f(viewInflate, R.id.not_auth_dialog_description)) != null) {
                                i = R.id.not_auth_dialog_title;
                                if (((TextView) yum0.f(viewInflate, R.id.not_auth_dialog_title)) != null) {
                                    i = R.id.nsvAuthDialog;
                                    if (((NestedScrollView) yum0.f(viewInflate, R.id.nsvAuthDialog)) != null) {
                                        i = R.id.registration_button;
                                        Button button2 = (Button) yum0.f(viewInflate, R.id.registration_button);
                                        if (button2 != null) {
                                            i = R.id.right_guideline;
                                            if (((Guideline) yum0.f(viewInflate, R.id.right_guideline)) != null) {
                                                return new rk4(constraintLayout, imageView, shapeableImageView, button, button2);
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
