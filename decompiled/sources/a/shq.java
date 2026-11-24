package a;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class shq extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f32226a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shq(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f32226a = maz.a(wez.b, new lhf(this, this, (byte) 27));
    }

    private final zcu0 getBinding() {
        return (zcu0) this.f32226a.getValue();
    }

    public final void setNumberVisibility(boolean z) {
        getBinding().b.setVisibility(z ? 0 : 8);
        if (z) {
            return;
        }
        getBinding().c.setGravity(17);
    }

    public final void setTitle(String str) {
        str.getClass();
        getBinding().c.setText(str);
    }
}
