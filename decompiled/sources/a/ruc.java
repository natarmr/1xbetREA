package a;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes.dex */
public final class ruc extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31119a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        rhu0 rhu0Var;
        Outline outline2;
        switch (this.f31119a) {
            case 0:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 2:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 3:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 4:
                if (!(view instanceof rhu0) || (outline2 = (rhu0Var = (rhu0) view).e) == null) {
                    return;
                }
                outline.set(outline2);
                float f = rhu0Var.k;
                if (f == 0.0f && rhu0Var.l == 0.0f) {
                    return;
                }
                outline.offset((int) f, (int) rhu0Var.l);
                return;
            default:
                view.getClass();
                throw new ClassCastException();
        }
    }
}
