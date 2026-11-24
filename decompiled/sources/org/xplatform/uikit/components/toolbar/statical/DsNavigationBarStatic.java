package org.xplatform.uikit.components.toolbar.statical;

import a.bqd0;
import a.gc50;
import a.jiq0;
import a.k1i;
import a.ktt0;
import a.m5d;
import a.qrq0;
import a.r4n0;
import a.s96;
import a.t9f;
import a.unl;
import a.zrb0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class DsNavigationBarStatic extends FrameLayout {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k1i f47281a;
    public s96 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsNavigationBarStatic(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        k1i k1iVar = k1i.b;
        this.f47281a = k1iVar;
        setTag("DsNavigationBarStatic");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.p0, 0, 0);
        int i = typedArrayObtainStyledAttributes.getInt(6, 0);
        if (i != 0) {
            if (i == 1) {
                k1iVar = k1i.f17524a;
            } else if (i == 2) {
                k1iVar = k1i.c;
            }
        }
        this.f47281a = k1iVar;
        setNavigationBarButtonsColorStateList(ktt0.m(3, context, typedArrayObtainStyledAttributes));
        a();
        Integer numL = ktt0.l(typedArrayObtainStyledAttributes, 11);
        if (numL != null) {
            setTitleColor(numL.intValue());
        }
        Integer numL2 = ktt0.l(typedArrayObtainStyledAttributes, 8);
        if (numL2 != null) {
            setSubTitleColor(numL2.intValue());
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        if (colorStateList != null) {
            setBackIconColor(colorStateList);
        }
        String strP = ktt0.p(typedArrayObtainStyledAttributes, context, 9);
        setTitle(strP == null ? "" : strP);
        String strP2 = ktt0.p(typedArrayObtainStyledAttributes, context, 7);
        setSubTitle(strP2 != null ? strP2 : "");
        setTitleIconVisible(typedArrayObtainStyledAttributes.getBoolean(5, false));
        Integer numL3 = ktt0.l(typedArrayObtainStyledAttributes, 10);
        if (numL3 != null) {
            setTitleChevronColor(numL3.intValue());
        }
        s96 s96Var = this.b;
        if (s96Var != null) {
            Context context2 = getContext();
            context2.getClass();
            s96Var.setNavigationBarBackground(m5d.b(R.attr.uikitStaticTransparent, context2));
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(4, false);
        s96 s96Var2 = this.b;
        if (s96Var2 != null) {
            s96Var2.a(z);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.s96, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, android.view.ViewGroup, org.xplatform.uikit.components.toolbar.statical.DsNavigationBarStatic] */
    public final void a() {
        ?? zrb0Var;
        int iOrdinal = this.f47281a.ordinal();
        if (iOrdinal == 0) {
            Context context = getContext();
            context.getClass();
            zrb0Var = new zrb0(context);
        } else if (iOrdinal == 1) {
            Context context2 = getContext();
            context2.getClass();
            zrb0Var = new qrq0(context2);
        } else if (iOrdinal != 2) {
            t9f.b();
            return;
        } else {
            Context context3 = getContext();
            context3.getClass();
            zrb0Var = new r4n0(context3);
        }
        removeAllViews();
        addView(zrb0Var);
        this.b = zrb0Var;
    }

    public final CharSequence getSubTitle() {
        s96 s96Var = this.b;
        if (s96Var != null) {
            return s96Var.getSubTitle();
        }
        return null;
    }

    public final CharSequence getTitle() {
        s96 s96Var = this.b;
        if (s96Var != null) {
            return s96Var.getTitle();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.a(false);
        }
        super.onDetachedFromWindow();
    }

    public final void setBackIconColor(ColorStateList colorStateList) {
        colorStateList.getClass();
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setBackIconColor(colorStateList);
        }
    }

    public final void setBasicNavigationBarStyle(k1i k1iVar) {
        k1iVar.getClass();
        if (this.f47281a == k1iVar) {
            return;
        }
        this.f47281a = k1iVar;
        a();
    }

    public final void setCursorOnSearchFiledVisible(boolean z) {
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setCursorOnSearchFiledVisible(z);
        }
    }

    public final void setNavigationBarBackground(int i) {
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setNavigationBarBackground(i);
        }
    }

    public final void setNavigationBarButtons(ArrayList<gc50> arrayList) {
        arrayList.getClass();
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setNavigationBarButtons(arrayList);
        }
    }

    public final void setNavigationBarButtonsColorStateList(int i) {
        setNavigationBarButtonsColorStateList(jiq0.n0(i, getContext()));
    }

    public final void setNavigationBarDrawableBackground(Drawable drawable) {
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setNavigationBarDrawableBackground(drawable);
        }
    }

    public void setOnHideSearchBarClickListener(Function0<Unit> function0) {
        function0.getClass();
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setOnHideSearchBarClickListener(function0);
        }
    }

    public final void setOnTitlesClickListener(Function0<Unit> function0) {
        function0.getClass();
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setOnTitlesClickListener(new unl(function0, (byte) 22));
        }
    }

    public final void setSearchFieldText(CharSequence charSequence) {
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setSearchFieldText(charSequence);
        }
    }

    public final void setSearchHint(CharSequence charSequence) {
        charSequence.getClass();
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setSearchFieldHint(charSequence);
        }
    }

    public final void setSubTitle(CharSequence charSequence) {
        charSequence.getClass();
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setSubTitle(charSequence);
        }
    }

    public final void setSubTitleColor(int i) {
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setSubTitleColor(i);
        }
    }

    public final void setSubtitleVisible(boolean z) {
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setSubtitleVisible(z);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        charSequence.getClass();
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setTitle(charSequence);
        }
    }

    public final void setTitleChevronColor(int i) {
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setTitleChevronColor(i);
        }
    }

    public final void setTitleColor(int i) {
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setTitleColor(i);
        }
    }

    public final void setTitleIconVisible(boolean z) {
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setTitleIconVisible(z);
        }
    }

    public final void setTitleVisible(boolean z) {
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setTitleVisible(z);
        }
    }

    public final void setNavigationBarButtonsColorStateList(ColorStateList colorStateList) {
        s96 s96Var = this.b;
        if (s96Var != null) {
            s96Var.setNavigationBarButtonsColorStateList(colorStateList);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsNavigationBarStatic(Context context) {
        this(context, null);
        context.getClass();
    }
}
