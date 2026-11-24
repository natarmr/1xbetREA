package a;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.core.presentation.bonuses.views.GamesBonusButtonViewNew;

/* JADX INFO: loaded from: classes3.dex */
public final class sm70 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialToolbar f32431a;
    public final GamesBonusButtonViewNew b;
    public final ShimmerFrameLayout c;
    public final MaterialToolbar d;
    public final AppCompatImageView e;
    public final ShimmerFrameLayout f;

    public sm70(MaterialToolbar materialToolbar, GamesBonusButtonViewNew gamesBonusButtonViewNew, ShimmerFrameLayout shimmerFrameLayout, MaterialToolbar materialToolbar2, AppCompatImageView appCompatImageView, ShimmerFrameLayout shimmerFrameLayout2) {
        this.f32431a = materialToolbar;
        this.b = gamesBonusButtonViewNew;
        this.c = shimmerFrameLayout;
        this.d = materialToolbar2;
        this.e = appCompatImageView;
        this.f = shimmerFrameLayout2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f32431a;
    }
}
