package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class j6j implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15990a;
    public final ConstraintLayout b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;

    public /* synthetic */ j6j(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, byte b) {
        this.f15990a = b;
        this.b = constraintLayout;
        this.e = imageView;
        this.c = textView;
        this.d = textView2;
    }

    public static j6j a(View view) {
        int i = R.id.imgQuouta;
        ImageView imageView = (ImageView) yum0.f(view, R.id.imgQuouta);
        if (imageView != null) {
            i = R.id.txtAuthorName;
            TextView textView = (TextView) yum0.f(view, R.id.txtAuthorName);
            if (textView != null) {
                i = R.id.txtMessage;
                TextView textView2 = (TextView) yum0.f(view, R.id.txtMessage);
                if (textView2 != null) {
                    return new j6j((ConstraintLayout) view, imageView, textView, textView2, (byte) 6);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f15990a;
        return this.b;
    }

    public /* synthetic */ j6j(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2, byte b) {
        this.f15990a = b;
        this.b = constraintLayout;
        this.c = textView;
        this.e = imageView;
        this.d = textView2;
    }

    public /* synthetic */ j6j(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView, byte b) {
        this.f15990a = b;
        this.b = constraintLayout;
        this.c = textView;
        this.d = textView2;
        this.e = imageView;
    }
}
