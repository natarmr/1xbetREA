package a;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class met0 extends RippleDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21664a;
    public y3d b;
    public boolean c;

    public met0(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.f21664a = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f21664a) {
            this.c = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.c = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.c;
    }
}
