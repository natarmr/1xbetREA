package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class rm70 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f30732a;
    public final TextView b;
    public final ShimmerFrameLayout c;

    public rm70(FrameLayout frameLayout, TextView textView, ShimmerFrameLayout shimmerFrameLayout) {
        this.f30732a = frameLayout;
        this.b = textView;
        this.c = shimmerFrameLayout;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f30732a;
    }
}
