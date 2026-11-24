package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.xplatform.cyber.game.universal.impl.presentation.crystal.view.CrystalGlowView;

/* JADX INFO: loaded from: classes4.dex */
public final class c1o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f3583a;
    public final ImageView b;
    public final ImageView c;
    public final CrystalGlowView d;

    public c1o0(FrameLayout frameLayout, ImageView imageView, ImageView imageView2, CrystalGlowView crystalGlowView) {
        this.f3583a = frameLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = crystalGlowView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3583a;
    }
}
