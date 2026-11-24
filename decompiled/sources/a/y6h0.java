package a;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class y6h0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f42097a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6h0(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f42097a = maz.b(new x6h0(context, this, (byte) 0));
    }

    private final oku0 getBinding() {
        Object value = this.f42097a.getValue();
        value.getClass();
        return (oku0) value;
    }

    public final void a(boolean z) {
        getBinding().b.setAlpha(z ? 1.0f : 0.5f);
    }

    public final void b(z6h0 z6h0Var) {
        int i;
        z6h0Var.getClass();
        ImageView imageView = getBinding().b;
        switch (z6h0Var.ordinal()) {
            case 0:
                i = R.drawable.sc_anchor;
                break;
            case 1:
                i = R.drawable.sc_bottle;
                break;
            case 2:
                i = R.drawable.sc_chest;
                break;
            case 3:
                i = R.drawable.sc_coin;
                break;
            case 4:
                i = R.drawable.sc_cannon;
                break;
            case 5:
                i = R.drawable.sc_pirate_tray;
                break;
            case 6:
                i = R.drawable.sc_gun_knife;
                break;
            case 7:
                i = R.drawable.sc_pirate_ship;
                break;
            case 8:
                i = R.drawable.sc_spy_glass;
                break;
            default:
                t9f.b();
                return;
        }
        imageView.setImageResource(i);
    }
}
