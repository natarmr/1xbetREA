package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class n1o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f22761a;
    public final ImageView b;
    public final ImageView c;

    public n1o0(FrameLayout frameLayout, ImageView imageView, ImageView imageView2) {
        this.f22761a = frameLayout;
        this.b = imageView;
        this.c = imageView2;
    }

    public static n1o0 a(View view) {
        int i = R.id.attackedCard;
        ImageView imageView = (ImageView) yum0.f(view, R.id.attackedCard);
        if (imageView != null) {
            i = R.id.defenderCard;
            ImageView imageView2 = (ImageView) yum0.f(view, R.id.defenderCard);
            if (imageView2 != null) {
                return new n1o0((FrameLayout) view, imageView, imageView2);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f22761a;
    }
}
