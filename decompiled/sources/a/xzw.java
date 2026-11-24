package a;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.utils.widget.ImageFilterButton;

/* JADX INFO: loaded from: classes.dex */
public final class xzw extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41774a;
    public final /* synthetic */ ImageFilterButton b;

    public /* synthetic */ xzw(ImageFilterButton imageFilterButton, byte b) {
        this.f41774a = b;
        this.b = imageFilterButton;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        byte b = this.f41774a;
        ImageFilterButton imageFilterButton = this.b;
        switch (b) {
            case 0:
                int width = imageFilterButton.getWidth();
                int height = imageFilterButton.getHeight();
                outline.setRoundRect(0, 0, width, height, (Math.min(width, height) * imageFilterButton.f) / 2.0f);
                break;
            default:
                outline.setRoundRect(0, 0, imageFilterButton.getWidth(), imageFilterButton.getHeight(), imageFilterButton.g);
                break;
        }
    }
}
