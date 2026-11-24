package a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: loaded from: classes.dex */
public final class vh extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37407a;
    public final Object b;

    public /* synthetic */ vh(Object obj, byte b) {
        this.f37407a = b;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.f37407a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) obj;
                if (actionBarContainer.g) {
                    Drawable drawable = actionBarContainer.f;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    break;
                } else {
                    Drawable drawable2 = actionBarContainer.d;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = actionBarContainer.e;
                    if (drawable3 != null && actionBarContainer.h) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
            default:
                ((dyw) obj).k(canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.f37407a) {
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.f37407a) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.b;
                if (!actionBarContainer.g) {
                    Drawable drawable = actionBarContainer.d;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                    }
                } else if (actionBarContainer.f != null) {
                    actionBarContainer.d.getOutline(outline);
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        byte b = this.f37407a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.f37407a;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(ColorFilter colorFilter) {
    }

    private final void d(ColorFilter colorFilter) {
    }
}
