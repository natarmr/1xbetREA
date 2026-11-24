package a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.badges.DsBadge;

/* JADX INFO: loaded from: classes6.dex */
public final class l2c0 extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19301a;
    public final if5 b;

    public l2c0(Context context) {
        super(context, null, 0);
        this.f19301a = getResources().getDimensionPixelSize(R.dimen.space_32);
        this.b = new if5(this, null);
        getResources().getDimensionPixelSize(R.dimen.space_6);
        getResources().getDimensionPixelSize(R.dimen.space_4);
        setId(R.id.profileIcon);
        setImageResource(R.drawable.ic_glyph_circle_profile);
        setColorFilter(m5d.b(R.attr.uikitSecondary60, context));
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f19301a;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public void setBadgeBackgroundTint(int i) {
        this.b.j(i);
    }

    public void setBadgeVisible(boolean z) {
        DsBadge dsBadge = this.b.c;
        if (dsBadge != null) {
            dsBadge.setVisibility(z ? 0 : 8);
        }
    }
}
