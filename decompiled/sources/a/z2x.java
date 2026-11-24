package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.SwipeBackLayout;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z2x extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z2x f43692a = new z2x(1, wik.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/consultantchat/impl/databinding/DialogImageViewerBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.dialog_image_viewer, (ViewGroup) null, false);
        int i = R.id.imgClose;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.imgClose);
        if (imageView != null) {
            i = R.id.imgImage;
            AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(viewInflate, R.id.imgImage);
            if (appCompatImageView != null) {
                i = R.id.swipeBack;
                SwipeBackLayout swipeBackLayout = (SwipeBackLayout) yum0.f(viewInflate, R.id.swipeBack);
                if (swipeBackLayout != null) {
                    return new wik((ConstraintLayout) viewInflate, imageView, appCompatImageView, swipeBackLayout);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
