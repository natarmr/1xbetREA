package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ttx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34525a;
    public final ConstraintLayout b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;

    public /* synthetic */ ttx(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, byte b) {
        this.f34525a = b;
        this.b = constraintLayout;
        this.c = imageView;
        this.d = imageView2;
        this.e = textView;
        this.f = textView2;
    }

    public static ttx a(View view) {
        int i = R.id.imgFileImage;
        ImageView imageView = (ImageView) yum0.f(view, R.id.imgFileImage);
        if (imageView != null) {
            i = R.id.llFileReceive;
            if (((LinearLayout) yum0.f(view, R.id.llFileReceive)) != null) {
                i = R.id.pbFileLoader;
                ImageView imageView2 = (ImageView) yum0.f(view, R.id.pbFileLoader);
                if (imageView2 != null) {
                    i = R.id.txtFileDescription;
                    TextView textView = (TextView) yum0.f(view, R.id.txtFileDescription);
                    if (textView != null) {
                        i = R.id.txtFileName;
                        TextView textView2 = (TextView) yum0.f(view, R.id.txtFileName);
                        if (textView2 != null) {
                            return new ttx((ConstraintLayout) view, imageView, imageView2, textView, textView2, (byte) 0);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ttx b(View view) {
        int i = R.id.imgFileImage;
        ImageView imageView = (ImageView) yum0.f(view, R.id.imgFileImage);
        if (imageView != null) {
            i = R.id.llFileSend;
            if (((LinearLayout) yum0.f(view, R.id.llFileSend)) != null) {
                i = R.id.pbFileLoader;
                ImageView imageView2 = (ImageView) yum0.f(view, R.id.pbFileLoader);
                if (imageView2 != null) {
                    i = R.id.txtFileDescription;
                    TextView textView = (TextView) yum0.f(view, R.id.txtFileDescription);
                    if (textView != null) {
                        i = R.id.txtFileName;
                        TextView textView2 = (TextView) yum0.f(view, R.id.txtFileName);
                        if (textView2 != null) {
                            return new ttx((ConstraintLayout) view, imageView, imageView2, textView, textView2, (byte) 1);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        switch (this.f34525a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b;
    }
}
