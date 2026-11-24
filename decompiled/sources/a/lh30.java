package a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class lh30 extends j12 {
    public final ki30 c;
    public final Rect d;

    /* JADX WARN: Illegal instructions before constructor call */
    public lh30(Context context, int i) {
        TypedValue typedValueQ = n6x.Q(context.getTheme(), R.attr.materialAlertDialogTheme);
        int i2 = typedValueQ == null ? 0 : typedValueQ.data;
        Context contextV = dwi0.V(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        contextV = i2 != 0 ? new tje(contextV, i2) : contextV;
        if (i == 0) {
            TypedValue typedValueQ2 = n6x.Q(context.getTheme(), R.attr.materialAlertDialogTheme);
            i = typedValueQ2 == null ? 0 : typedValueQ2.data;
        }
        super(contextV, i);
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        mrv.c0(context2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int[] iArr = rpd0.u;
        mrv.d0(context2, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        int layoutDirection = context2.getResources().getConfiguration().getLayoutDirection();
        this.d = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        int iH = d7x.H(context2, n6x.U(context2, R.attr.colorSurface, lh30.class.getCanonicalName()));
        TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = typedArrayObtainStyledAttributes2.getColor(4, iH);
        typedArrayObtainStyledAttributes2.recycle();
        ki30 ki30Var = new ki30(context2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        ki30Var.o(context2);
        ki30Var.s(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                ki30Var.setShapeAppearanceModel(ki30Var.b.f14810a.a(dimension));
            }
        }
        this.c = ki30Var;
    }

    public final void a(int i) {
    }

    public final void b(int i) {
    }

    public final void c() {
    }

    @Override // a.j12
    public final k12 create() {
        k12 k12VarCreate = super.create();
        Window window = k12VarCreate.getWindow();
        View decorView = window.getDecorView();
        ki30 ki30Var = this.c;
        if (ki30Var != null) {
            ki30Var.r(decorView.getElevation());
        }
        Rect rect = this.d;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) ki30Var, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ofx(k12VarCreate, rect));
        return k12VarCreate;
    }

    public final void d(View view) {
    }

    @Override // a.j12
    public final j12 setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (lh30) super.setNegativeButton(i, onClickListener);
    }

    @Override // a.j12
    public final j12 setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        return (lh30) super.setPositiveButton(i, onClickListener);
    }

    @Override // a.j12
    public final j12 setTitle(CharSequence charSequence) {
        return (lh30) super.setTitle(charSequence);
    }

    @Override // a.j12
    public final j12 setView(View view) {
        return (lh30) super.setView(view);
    }
}
