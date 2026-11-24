package a;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.text.DecimalFormat;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class w6l extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f38628a;
    public final int b;
    public c4m0 c;
    public final String d;
    public final DecimalFormat e;
    public final int f;
    public final Drawable g;
    public final Drawable h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6l(Context context) {
        super(context, null);
        context.getClass();
        this.f38628a = maz.a(wez.b, new lhf(this, this, (byte) 18));
        this.b = context.getResources().getDimensionPixelSize(R.dimen.corner_radius_6);
        String string = getResources().getString(R.string.moba_hero_respawn_timer);
        string.getClass();
        this.d = string;
        this.e = new DecimalFormat("#00");
        this.f = R.drawable.ic_hero_indicator_placeholder;
        this.g = context.getDrawable(R.drawable.dota_selected_heroes_dead_bg);
        this.h = context.getDrawable(R.drawable.dota_selected_heroes_aegis_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x6l getBinding() {
        return (x6l) this.f38628a.getValue();
    }

    public final void b(boolean z, long j) {
        if (z) {
            getBinding().c.setVisibility(8);
            getBinding().e.setVisibility(8);
            getBinding().b.setVisibility(8);
            getBinding().d.setColorFilter((ColorFilter) null);
            return;
        }
        hxm0.B(getBinding().d);
        getBinding().c.setBackground(this.g);
        getBinding().c.setVisibility(0);
        getBinding().b.setVisibility(8);
        getBinding().e.setVisibility(0);
        c(true, j);
    }

    public final void c(boolean z, long j) {
        WeakHashMap weakHashMap = rgu0.f30456a;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new v6l(this, j, z));
            return;
        }
        clz clzVarL = s7n0.l(this);
        if (clzVarL != null) {
            tkz tkzVarQ = x0x.Q(clzVarL.x());
            c4m0 c4m0Var = this.c;
            yje yjeVar = null;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            this.c = sac.T(new dnq(new fnq(sac.L(4, TimeUnit.SECONDS.toMillis(j), 0L), new bk5(this, z, null), (byte) 4), new ko0((Object) this, yjeVar, (byte) 13), (byte) 0), d5c.S(tkzVarQ, tvk.f34603a), new f1e(2, yjeVar, (byte) 17));
        }
    }

    public final void d(float f, int i) {
        ImageView imageView = getBinding().b;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        getBinding().e.setTextSize(0, f);
    }

    public final void setHeroAegisState(long j) {
        getBinding().c.setBackground(this.h);
        getBinding().c.setVisibility(0);
        getBinding().b.setVisibility(0);
        getBinding().e.setVisibility(0);
        getBinding().d.clearColorFilter();
        c(false, j);
    }

    public final void setHeroImage(String str) {
        str.getClass();
        List list = u0d.f34849a;
        u0d.j(getBinding().d, str, this.f, 0, kotlin.collections.a.c(new j2x(this.b)), null, null, 492);
    }
}
