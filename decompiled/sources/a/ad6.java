package a;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ad6 extends LinearLayout {
    public static final int[] c = {R.attr.state_selected};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f663a;
    public final a8z b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad6(Context context) {
        super(context, null, 0);
        context.getClass();
        this.b = maz.a(wez.b, new h5((Object) this, (Object) this, (byte) 9));
    }

    private final bd6 getBinding() {
        return (bd6) this.b.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setGravity(17);
        setOrientation(1);
        getBinding().c.setTextAlignment(4);
        TextView textView = getBinding().c;
        TypedValue typedValue = j5d.f15927a;
        Context context = getContext();
        context.getClass();
        textView.setTextColor(j5d.a(context, R.attr.uikitTextPrimary, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f663a) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, c);
        }
        iArrOnCreateDrawableState.getClass();
        return iArrOnCreateDrawableState;
    }

    public final void setExtra(String str) {
        str.getClass();
        getBinding().b.setText(str);
        getBinding().b.setVisibility(str.length() > 0 ? 0 : 8);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.f663a = z;
        refreshDrawableState();
    }

    public final void setTitle(String str) {
        str.getClass();
        getBinding().c.setText(str);
    }
}
