package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fgv extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fgv f9512a = new fgv(1, kgv.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/popular/impl/databinding/GreetingKzDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.greeting_kz_dialog, (ViewGroup) null, false);
        int i = R.id.card;
        if (((FrameLayout) yum0.f(viewInflate, R.id.card)) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            int i2 = R.id.greeting_kz_dialog_description;
            if (((TextView) yum0.f(viewInflate, R.id.greeting_kz_dialog_description)) != null) {
                i2 = R.id.greeting_kz_dialog_title;
                if (((TextView) yum0.f(viewInflate, R.id.greeting_kz_dialog_title)) != null) {
                    i2 = R.id.image;
                    ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewInflate, R.id.image);
                    if (shapeableImageView != null) {
                        i2 = R.id.later_button;
                        Button button = (Button) yum0.f(viewInflate, R.id.later_button);
                        if (button != null) {
                            i2 = R.id.left_guideline;
                            if (((Guideline) yum0.f(viewInflate, R.id.left_guideline)) != null) {
                                i2 = R.id.more_button;
                                Button button2 = (Button) yum0.f(viewInflate, R.id.more_button);
                                if (button2 != null) {
                                    i2 = R.id.right_guideline;
                                    if (((Guideline) yum0.f(viewInflate, R.id.right_guideline)) != null) {
                                        return new kgv(constraintLayout, shapeableImageView, button, button2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i = i2;
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
