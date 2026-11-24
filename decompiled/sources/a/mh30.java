package a;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class mh30 extends ArrayAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ColorStateList f21772a;
    public ColorStateList b;
    public final /* synthetic */ nh30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh30(nh30 nh30Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.c = nh30Var;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        nh30 nh30Var = this.c;
        ColorStateList colorStateList2 = nh30Var.m;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.b = colorStateList;
        if (nh30Var.l != 0 && nh30Var.m != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{k5d.c(nh30Var.m.getColorForState(iArr3, 0), nh30Var.l), k5d.c(nh30Var.m.getColorForState(iArr2, 0), nh30Var.l), nh30Var.l});
        }
        this.f21772a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            nh30 nh30Var = this.c;
            Drawable drawable = null;
            if (nh30Var.getText().toString().contentEquals(textView.getText()) && nh30Var.l != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(nh30Var.l);
                if (this.b != null) {
                    colorDrawable.setTintList(this.f21772a);
                    RippleDrawable rippleDrawable = new RippleDrawable(this.b, colorDrawable, null);
                    FocusRingDrawable focusRingDrawableF = FocusRingDrawable.f(getContext(), rippleDrawable, null);
                    if (focusRingDrawableF != null) {
                        focusRingDrawableF.o.x = nh30Var.g;
                    }
                    drawable = rippleDrawable;
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}
