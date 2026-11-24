package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class iku0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14946a;
    public final ConstraintLayout b;
    public final ShapeableImageView c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;

    public /* synthetic */ iku0(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, ImageView imageView, TextView textView, TextView textView2, byte b) {
        this.f14946a = b;
        this.b = constraintLayout;
        this.c = shapeableImageView;
        this.d = imageView;
        this.e = textView;
        this.f = textView2;
    }

    public static iku0 a(View view) {
        int i = R.id.imgDocument;
        ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(view, R.id.imgDocument);
        if (shapeableImageView != null) {
            i = R.id.imgQuouta;
            ImageView imageView = (ImageView) yum0.f(view, R.id.imgQuouta);
            if (imageView != null) {
                i = R.id.txtAuthorName;
                TextView textView = (TextView) yum0.f(view, R.id.txtAuthorName);
                if (textView != null) {
                    i = R.id.txtMessage;
                    TextView textView2 = (TextView) yum0.f(view, R.id.txtMessage);
                    if (textView2 != null) {
                        return new iku0((ConstraintLayout) view, shapeableImageView, imageView, textView, textView2, (byte) 0);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static iku0 b(View view) {
        int i = R.id.imgImage;
        ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(view, R.id.imgImage);
        if (shapeableImageView != null) {
            i = R.id.imgQuouta;
            ImageView imageView = (ImageView) yum0.f(view, R.id.imgQuouta);
            if (imageView != null) {
                i = R.id.txtAuthorName;
                TextView textView = (TextView) yum0.f(view, R.id.txtAuthorName);
                if (textView != null) {
                    i = R.id.txtMessage;
                    TextView textView2 = (TextView) yum0.f(view, R.id.txtMessage);
                    if (textView2 != null) {
                        return new iku0((ConstraintLayout) view, shapeableImageView, imageView, textView, textView2, (byte) 1);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        switch (this.f14946a) {
            case 0:
                break;
        }
        return this.b;
    }
}
