package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class jk30 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16647a;
    public final LinearLayout b;
    public final ImageView c;
    public final TextView d;

    public /* synthetic */ jk30(LinearLayout linearLayout, ImageView imageView, TextView textView, byte b) {
        this.f16647a = b;
        this.b = linearLayout;
        this.c = imageView;
        this.d = textView;
    }

    public static jk30 a(View view) {
        int i = R.id.ivMedal;
        ImageView imageView = (ImageView) yum0.f(view, R.id.ivMedal);
        if (imageView != null) {
            i = R.id.tvMedalCount;
            TextView textView = (TextView) yum0.f(view, R.id.tvMedalCount);
            if (textView != null) {
                return new jk30((LinearLayout) view, imageView, textView, (byte) 0);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f16647a;
        return this.b;
    }
}
