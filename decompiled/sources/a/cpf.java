package a;

import android.widget.ImageView;
import org.xplatform.cyber.game.counterstrike.impl.presentation.map_movement.Cs2MapMovementView;

/* JADX INFO: loaded from: classes4.dex */
public final class cpf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f4742a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Cs2MapMovementView d;
    public final /* synthetic */ ImageView e;

    public cpf(ImageView imageView, ImageView imageView2, int i, int i2, Cs2MapMovementView cs2MapMovementView, ImageView imageView3) {
        this.f4742a = imageView2;
        this.b = i;
        this.c = i2;
        this.d = cs2MapMovementView;
        this.e = imageView3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView = this.f4742a;
        float measuredWidth = (imageView.getMeasuredWidth() / 2.0f) + imageView.getX();
        float measuredHeight = (imageView.getMeasuredHeight() / 2.0f) + imageView.getY();
        int measuredWidth2 = (imageView.getMeasuredWidth() * this.b) / 224;
        int measuredHeight2 = (imageView.getMeasuredHeight() * this.c) / 224;
        float f = measuredWidth + measuredWidth2;
        float f2 = this.d.v / 2;
        ImageView imageView2 = this.e;
        imageView2.setTranslationX(f - f2);
        imageView2.setTranslationY((measuredHeight - measuredHeight2) - f2);
    }
}
