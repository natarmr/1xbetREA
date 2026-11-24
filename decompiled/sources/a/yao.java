package a;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class yao extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42309a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ yao(View view, boolean z, byte b) {
        this.f42309a = b;
        this.b = view;
        this.c = z;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        byte b = this.f42309a;
        boolean z = this.c;
        View view2 = this.b;
        view.getClass();
        outline.getClass();
        switch (b) {
            case 0:
                int dimensionPixelSize = view2.getResources().getDimensionPixelSize(R.dimen.radius_4);
                int i = -dimensionPixelSize;
                outline.setRoundRect(i, z ? 0 : i, view.getWidth(), (z ? dimensionPixelSize : 0) + view.getHeight(), Math.abs(dimensionPixelSize));
                break;
            default:
                int dimensionPixelSize2 = view2.getResources().getDimensionPixelSize(R.dimen.radius_4);
                outline.setRoundRect(0, z ? 0 : -dimensionPixelSize2, view.getWidth() + (z ? 0 : dimensionPixelSize2), view.getHeight() + (z ? dimensionPixelSize2 : 0), Math.abs(dimensionPixelSize2));
                break;
        }
    }
}
