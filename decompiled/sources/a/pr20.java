package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class pr20 implements lt20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nr20 f27444a;
    public boolean b;

    public pr20(nr20 nr20Var, AttributeSet attributeSet, int i) {
        Object g0g0Var;
        this.f27444a = nr20Var;
        Context context = nr20Var.getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.R, i, 0);
        typedArrayObtainStyledAttributes.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            tnq0.i(typedArrayObtainStyledAttributes, 1);
            g0g0Var = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Integer num = (Integer) (g0g0Var instanceof g0g0 ? null : g0g0Var);
        if (num != null) {
            nr20Var.setMinimumWidth(num.intValue());
        }
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(4);
        if (drawable instanceof LayerDrawable) {
            Drawable drawableFindDrawableByLayerId = ((LayerDrawable) drawable).findDrawableByLayerId(R.id.tintItem);
            if (drawableFindDrawableByLayerId != null) {
                Context context2 = nr20Var.getContext();
                context2.getClass();
                drawableFindDrawableByLayerId.setTintList(ktt0.m(5, context2, typedArrayObtainStyledAttributes));
                nr20Var.setBackground(drawable);
            }
        } else {
            nr20Var.setBackground(drawable);
            Context context3 = nr20Var.getContext();
            context3.getClass();
            jmu0.j(nr20Var, ktt0.m(5, context3, typedArrayObtainStyledAttributes));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, this.b);
        this.b = z;
        this.f27444a.setEnabled(!z);
        typedArrayObtainStyledAttributes.recycle();
        nr20 nr20Var2 = this.f27444a;
        nr20Var2.setMinimumHeight(nr20Var2.getContext().getResources().getDimensionPixelSize(R.dimen.size_48));
    }

    @Override // a.lt20
    public final int[] b() {
        boolean z = this.b;
        int i = R.attr.state_blocked;
        if (!z) {
            i = -R.attr.state_blocked;
        }
        return new int[]{i};
    }
}
