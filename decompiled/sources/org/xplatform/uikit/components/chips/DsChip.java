package org.xplatform.uikit.components.chips;

import a.asb0;
import a.bqd0;
import a.bwl;
import a.gbe0;
import a.gq80;
import a.hny;
import a.if5;
import a.ivb0;
import a.j1h0;
import a.jmu0;
import a.k14;
import a.k1x;
import a.ktt0;
import a.m5d;
import a.o5k0;
import a.q10;
import a.q3d;
import a.sac;
import a.t1x;
import a.vf5;
import a.wxl;
import a.xoe;
import a.ymx;
import a.yoe;
import a.yqc;
import a.yum0;
import a.zkk;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.BidiFormatter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.components.badges.DsBadge;

/* JADX INFO: loaded from: classes6.dex */
public final class DsChip extends FrameLayout implements xoe {
    public static final /* synthetic */ int p = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zkk f47239a;
    public final yoe b;
    public final if5 c;
    public Function2 d;
    public Function2 e;
    public wxl f;
    public ColorStateList g;
    public ColorStateList h;
    public boolean i;
    public boolean j;
    public int k;
    public final ymx l;
    public final int m;
    public final int n;
    public final int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.ds_chip_view, this);
        int i = R.id.chipsContainer;
        LinearLayout linearLayout = (LinearLayout) yum0.f(this, R.id.chipsContainer);
        if (linearLayout != null) {
            i = R.id.leftIcon;
            ImageView imageView = (ImageView) yum0.f(this, R.id.leftIcon);
            if (imageView != null) {
                i = R.id.leftIconCard;
                CardView cardView = (CardView) yum0.f(this, R.id.leftIconCard);
                if (cardView != null) {
                    i = R.id.rightIcon;
                    ImageView imageView2 = (ImageView) yum0.f(this, R.id.rightIcon);
                    if (imageView2 != null) {
                        i = R.id.rightIconCard;
                        CardView cardView2 = (CardView) yum0.f(this, R.id.rightIconCard);
                        if (cardView2 != null) {
                            i = R.id.text;
                            TextView textView = (TextView) yum0.f(this, R.id.text);
                            if (textView != null) {
                                i = R.id.value;
                                TextView textView2 = (TextView) yum0.f(this, R.id.value);
                                if (textView2 != null) {
                                    this.f47239a = new zkk(this, linearLayout, imageView, cardView, imageView2, cardView2, textView, textView2);
                                    yoe yoeVar = new yoe(linearLayout, null);
                                    this.b = yoeVar;
                                    if5 if5Var = new if5(linearLayout, null);
                                    this.c = if5Var;
                                    this.f = wxl.PRIMARY;
                                    this.k = 1;
                                    this.l = ivb0.b;
                                    this.m = getResources().getDimensionPixelSize(R.dimen.space_6);
                                    this.n = getResources().getDimensionPixelSize(R.dimen.space_1);
                                    this.o = getResources().getDimensionPixelSize(R.dimen.space_2);
                                    yoeVar.b(attributeSet, 0);
                                    yoeVar.f(m5d.b(R.attr.uikitBackground, context));
                                    if5Var.f(attributeSet, 0);
                                    Context context2 = getContext();
                                    context2.getClass();
                                    TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, bqd0.C, 0, 0);
                                    b(typedArrayObtainStyledAttributes);
                                    typedArrayObtainStyledAttributes.recycle();
                                    h();
                                    c();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void a(wxl wxlVar) {
        Context context = getContext();
        context.getClass();
        Integer numValueOf = Integer.valueOf(m5d.b(wxlVar.e, context));
        Context context2 = getContext();
        context2.getClass();
        setIconTint(m5d.d(numValueOf, Integer.valueOf(m5d.b(wxlVar.f, context2))));
        Context context3 = getContext();
        context3.getClass();
        int i = wxlVar.g;
        Integer numValueOf2 = Integer.valueOf(m5d.b(i, context3));
        Context context4 = getContext();
        context4.getClass();
        setActionIconTint(m5d.d(numValueOf2, Integer.valueOf(m5d.b(i, context4))));
        Context context5 = getContext();
        context5.getClass();
        Integer numValueOf3 = Integer.valueOf(m5d.b(wxlVar.c, context5));
        Context context6 = getContext();
        context6.getClass();
        setTextColor(m5d.d(numValueOf3, Integer.valueOf(m5d.b(wxlVar.d, context6))));
        Context context7 = getContext();
        context7.getClass();
        Integer numValueOf4 = Integer.valueOf(m5d.b(wxlVar.h, context7));
        Context context8 = getContext();
        context8.getClass();
        setValueTextColor(m5d.d(numValueOf4, Integer.valueOf(m5d.b(wxlVar.i, context8))));
        zkk zkkVar = this.f47239a;
        LinearLayout linearLayout = (LinearLayout) zkkVar.g;
        Context context9 = getContext();
        context9.getClass();
        Integer numValueOf5 = Integer.valueOf(m5d.b(wxlVar.f39937a, context9));
        Context context10 = getContext();
        context10.getClass();
        linearLayout.setBackgroundTintList(m5d.d(numValueOf5, Integer.valueOf(m5d.b(wxlVar.b, context10))));
        LinearLayout linearLayout2 = (LinearLayout) zkkVar.g;
        Drawable background = linearLayout2.getBackground();
        if (background != null) {
            background.setTintList(linearLayout2.getBackgroundTintList());
        }
    }

    public final void b(TypedArray typedArray) {
        wxl wxlVar;
        Context context = getContext();
        context.getClass();
        String strP = ktt0.p(typedArray, context, 7);
        if (strP == null) {
            strP = "";
        }
        Context context2 = getContext();
        context2.getClass();
        String strP2 = ktt0.p(typedArray, context2, 21);
        String str = strP2 != null ? strP2 : "";
        int i = typedArray.getInt(16, 0);
        if (i == 0) {
            wxlVar = wxl.PRIMARY;
        } else if (i == 1) {
            wxlVar = wxl.SECONDARY;
        } else if (i != 2) {
            wxlVar = i != 3 ? wxl.PRIMARY : wxl.OVERLAY;
        } else {
            wxlVar = wxl.TERTIARY;
        }
        this.f = wxlVar;
        Drawable drawable = typedArray.getDrawable(10);
        Drawable drawable2 = typedArray.getDrawable(14);
        Drawable drawable3 = typedArray.getDrawable(3);
        Integer numL = ktt0.l(typedArray, 4);
        Integer numL2 = ktt0.l(typedArray, 17);
        Integer numL3 = ktt0.l(typedArray, 20);
        Integer numL4 = ktt0.l(typedArray, 8);
        Integer numL5 = ktt0.l(typedArray, 12);
        setLeftIconRadius(typedArray.getDimension(9, 0.0f));
        setRightIconRadius(typedArray.getDimension(13, 0.0f));
        setText(strP);
        setValueText(str);
        a(this.f);
        setLeftIcon(drawable);
        setRightIcon(drawable2);
        setActionIcon(drawable3);
        setSelectedInternal(isSelected());
        if (isSelected() && isEnabled()) {
            setBackgroundDisabledColor(numL);
            setLabelDisabledColor(numL2);
            setValueDisabledColor(numL3);
            setLeftIconDisabledTint(numL4);
            setRightIconDisabledTint(numL5);
        }
    }

    public final void c() {
        int i;
        DsBadge dsBadge;
        List listJ = q3d.j(vf5.f37315a, vf5.b);
        List listJ2 = q3d.j(vf5.d, vf5.c);
        if5 if5Var = this.c;
        vf5 vf5Var = if5Var.j;
        if (CollectionsKt.L(listJ2, vf5Var)) {
            i = this.n;
        } else {
            i = !CollectionsKt.L(listJ, vf5Var) ? this.o : 0;
        }
        if (i <= 0 || (dsBadge = if5Var.c) == null) {
            return;
        }
        k14 k14Var = dsBadge.d;
        k14Var.c = k14Var.c;
        k14Var.d += i;
        View view = (View) k14Var.i.get();
        if (view != null) {
            gq80.l0(k14Var.f17500a, view, (View) k14Var.h.get(), k14Var.b, k14Var.c, k14Var.d);
        }
    }

    public final void d() {
        boolean zIsRtlContext = BidiFormatter.getInstance().isRtlContext();
        int i = this.m;
        zkk zkkVar = this.f47239a;
        if (zIsRtlContext) {
            LinearLayout linearLayout = (LinearLayout) zkkVar.g;
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), i, linearLayout.getPaddingBottom());
        } else {
            LinearLayout linearLayout2 = (LinearLayout) zkkVar.g;
            linearLayout2.setPadding(i, linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        }
    }

    public final void e(String str, Drawable drawable) {
        zkk zkkVar = this.f47239a;
        ((ImageView) zkkVar.b).setVisibility(0);
        CardView cardView = (CardView) zkkVar.h;
        cardView.setVisibility(0);
        if (drawable != null) {
            drawable.setTintList(this.g);
        }
        ImageView imageView = (ImageView) zkkVar.b;
        gbe0 gbe0VarA = o5k0.a(imageView.getContext());
        k1x k1xVar = new k1x(imageView.getContext());
        k1xVar.c = str;
        t1x.h(k1xVar, imageView);
        k1xVar.d(cardView.getLayoutParams().width, cardView.getLayoutParams().height);
        k1xVar.s = j1h0.b;
        k1xVar.t = asb0.f1383a;
        t1x.d(k1xVar, drawable);
        k1xVar.e = new bwl(this);
        gbe0VarA.a(k1xVar.a());
        d();
    }

    public final void f(String str, Drawable drawable, ColorStateList colorStateList) {
        zkk zkkVar = this.f47239a;
        ((ImageView) zkkVar.b).setVisibility(0);
        CardView cardView = (CardView) zkkVar.h;
        cardView.setVisibility(0);
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        setIconTint(colorStateList);
        ImageView imageView = (ImageView) zkkVar.b;
        gbe0 gbe0VarA = o5k0.a(imageView.getContext());
        k1x k1xVar = new k1x(imageView.getContext());
        k1xVar.c = str;
        t1x.h(k1xVar, imageView);
        k1xVar.d(cardView.getLayoutParams().width, cardView.getLayoutParams().height);
        k1xVar.s = j1h0.b;
        k1xVar.t = asb0.f1383a;
        t1x.g(k1xVar, drawable);
        t1x.d(k1xVar, drawable);
        k1xVar.e = new yqc(this, (byte) 29);
        gbe0VarA.a(k1xVar.a());
        d();
    }

    public final void g(Drawable drawable, ColorStateList colorStateList) {
        zkk zkkVar = this.f47239a;
        ImageView imageView = (ImageView) zkkVar.c;
        imageView.setImageDrawable(drawable);
        drawable.setTintList(colorStateList);
        imageView.setVisibility(0);
        imageView.setOnClickListener(new q10(this, (byte) 16));
        ((CardView) zkkVar.i).setVisibility(0);
        boolean zIsRtlContext = BidiFormatter.getInstance().isRtlContext();
        LinearLayout linearLayout = (LinearLayout) zkkVar.g;
        int i = this.m;
        if (zIsRtlContext) {
            linearLayout.setPadding(i, linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        } else {
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), i, linearLayout.getPaddingBottom());
        }
    }

    public final CharSequence getText() {
        return this.f47239a.d.getText();
    }

    public final void h() {
        LinearLayout linearLayout = (LinearLayout) this.f47239a.g;
        jmu0.j(linearLayout, linearLayout.getBackgroundTintList());
    }

    @Override // android.view.View
    public final boolean isSelected() {
        return this.i ? ((ImageView) this.f47239a.c).isSelected() : super.isSelected();
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.i) {
            return false;
        }
        ymx ymxVar = this.l;
        ymxVar.getClass();
        if (SystemClock.uptimeMillis() - ivb0.c > ymxVar.f42912a) {
            return super.performClick();
        }
        return false;
    }

    public final void setActionIcon(Drawable drawable) {
        this.i = drawable != null;
        if (drawable == null) {
            return;
        }
        g(drawable, this.h);
    }

    public final void setActionIconTint(ColorStateList colorStateList) {
        this.h = colorStateList;
        if (this.i) {
            ((ImageView) this.f47239a.c).setImageTintList(colorStateList);
        }
    }

    public final void setBackgroundActiveColor(Integer num) {
        if (num == null) {
            return;
        }
        zkk zkkVar = this.f47239a;
        LinearLayout linearLayout = (LinearLayout) zkkVar.g;
        LinearLayout linearLayout2 = (LinearLayout) zkkVar.g;
        Context context = getContext();
        context.getClass();
        linearLayout.setBackgroundTintList(m5d.d(Integer.valueOf(m5d.b(this.f.f39937a, context)), num));
        h();
        Drawable background = linearLayout2.getBackground();
        if (background != null) {
            background.setTintList(linearLayout2.getBackgroundTintList());
        }
    }

    public final void setBackgroundDisabledColor(Integer num) {
        if (num == null) {
            return;
        }
        zkk zkkVar = this.f47239a;
        LinearLayout linearLayout = (LinearLayout) zkkVar.g;
        LinearLayout linearLayout2 = (LinearLayout) zkkVar.g;
        Context context = getContext();
        context.getClass();
        this.f.getClass();
        linearLayout.setBackgroundTintList(m5d.d(Integer.valueOf(m5d.b(R.attr.dsChipBackgroundDisabledColor, context)), num));
        Drawable background = linearLayout2.getBackground();
        if (background != null) {
            background.setTintList(linearLayout2.getBackgroundTintList());
        }
    }

    public final void setBadge(vf5 vf5Var) {
        if (vf5Var == null) {
            return;
        }
        this.b.c(null);
        this.c.a(vf5Var);
    }

    @Override // a.xoe
    public void setCount(Integer num) {
        this.c.a(null);
        this.b.c(num);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setClickable(z);
        ((ImageView) this.f47239a.c).setEnabled(z);
        jmu0.b(this, z);
    }

    public final void setIconActiveTint(int i) {
        Context context = getContext();
        context.getClass();
        setIconTint(m5d.d(Integer.valueOf(m5d.b(this.f.e, context)), Integer.valueOf(i)));
    }

    public final void setIconTint(ColorStateList colorStateList) {
        this.g = colorStateList;
        zkk zkkVar = this.f47239a;
        ((ImageView) zkkVar.b).setImageTintList(colorStateList);
        if (this.i) {
            return;
        }
        ((ImageView) zkkVar.c).setImageTintList(colorStateList);
    }

    public final void setLabelDisabledColor(Integer num) {
        if (num == null) {
            return;
        }
        Context context = getContext();
        context.getClass();
        this.f.getClass();
        setTextColor(m5d.d(Integer.valueOf(m5d.b(R.attr.dsChipTextDisabledColor, context)), num));
    }

    public final void setLeftIcon(Drawable drawable) {
        zkk zkkVar = this.f47239a;
        ((ImageView) zkkVar.b).setVisibility(drawable != null ? 0 : 8);
        ((CardView) zkkVar.h).setVisibility(drawable != null ? 0 : 8);
        if (drawable == null) {
            return;
        }
        ((ImageView) zkkVar.b).setImageDrawable(drawable);
        drawable.setTintList(this.g);
        d();
    }

    public final void setLeftIconDisabledTint(Integer num) {
        if (num == null) {
            return;
        }
        Context context = getContext();
        context.getClass();
        this.f.getClass();
        setIconTint(m5d.d(Integer.valueOf(m5d.b(R.attr.dsChipLeftIconDisabledTint, context)), num));
    }

    public final void setLeftIconRadius(float f) {
        ((CardView) this.f47239a.h).setRadius(f);
    }

    public final void setOnSelectInternalListener(Function2<? super DsChip, ? super Boolean, Unit> function2) {
        this.e = function2;
    }

    public final void setOnSelectListener(Function2<? super DsChip, ? super Boolean, Unit> function2) {
        this.d = function2;
    }

    public final void setRightIcon(Drawable drawable) {
        if (drawable != null) {
            this.i = false;
        }
        if (drawable == null) {
            return;
        }
        g(drawable, this.g);
    }

    public final void setRightIconDisabledTint(Integer num) {
        if (num == null) {
            return;
        }
        Context context = getContext();
        context.getClass();
        this.f.getClass();
        setIconTint(m5d.d(Integer.valueOf(m5d.b(R.attr.dsChipRightIconDisabledTint, context)), num));
    }

    public final void setRightIconRadius(float f) {
        ((CardView) this.f47239a.i).setRadius(f);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        setSelectedInternal(z);
        Function2 function2 = this.d;
        if (function2 != null) {
            function2.invoke(this, Boolean.valueOf(z));
        }
        Function2 function3 = this.e;
        if (function3 != null) {
            function3.invoke(this, Boolean.valueOf(z));
        }
    }

    public final void setSelectedForced(boolean z) {
        super.setSelected(z);
        h();
    }

    public final void setSelectedInternal(boolean z) {
        if (this.i) {
            return;
        }
        super.setSelected(z);
        h();
    }

    public final void setStyle(int i) {
        Context context = getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, bqd0.C);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        this.b.a(i);
        this.c.e(i);
        c();
    }

    public final void setText(CharSequence charSequence) {
        zkk zkkVar = this.f47239a;
        zkkVar.d.setText(charSequence);
        zkkVar.d.setVisibility((charSequence == null || charSequence.length() == 0) ? 8 : 0);
    }

    public final void setTextActiveColor(Integer num) {
        if (num == null) {
            return;
        }
        Context context = getContext();
        context.getClass();
        setTextColor(m5d.d(Integer.valueOf(m5d.b(this.f.c, context)), num));
    }

    public final void setTextColor(ColorStateList colorStateList) {
        TextView textView = this.f47239a.d;
        if (colorStateList == null) {
            Context context = getContext();
            context.getClass();
            colorStateList = ColorStateList.valueOf(m5d.b(android.R.attr.textColor, context));
            colorStateList.getClass();
        }
        textView.setTextColor(colorStateList);
    }

    public final void setTextMaxLines(Integer num) {
        if (this.j) {
            return;
        }
        if (num != null) {
            this.k = num.intValue();
        }
        this.f47239a.d.setMaxLines(this.k);
    }

    public final void setUnlimitedLines(boolean z) {
        this.j = z;
    }

    public final void setValueDisabledColor(Integer num) {
        if (num == null) {
            return;
        }
        Context context = getContext();
        context.getClass();
        this.f.getClass();
        setValueTextColor(m5d.d(Integer.valueOf(m5d.b(R.attr.dsChipValueDisabledColor, context)), num));
    }

    public final void setValueText(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        zkk zkkVar = this.f47239a;
        ((TextView) zkkVar.e).setText(charSequence);
        ((TextView) zkkVar.e).setVisibility(0);
        wxl wxlVar = this.f;
        if (wxlVar != sac.s0(wxlVar)) {
            wxl wxlVarS0 = sac.s0(this.f);
            this.f = wxlVarS0;
            a(wxlVarS0);
        }
    }

    public final void setValueTextColor(ColorStateList colorStateList) {
        TextView textView = (TextView) this.f47239a.e;
        if (colorStateList == null) {
            Context context = getContext();
            context.getClass();
            colorStateList = ColorStateList.valueOf(m5d.b(android.R.attr.textColor, context));
            colorStateList.getClass();
        }
        textView.setTextColor(colorStateList);
    }

    public final void setStyle(wxl wxlVar) {
        wxlVar.getClass();
        setStyle(sac.r0(wxlVar));
    }

    public final void setLeftIcon(int i) {
        Drawable drawable = getContext().getDrawable(i);
        if (drawable == null) {
            return;
        }
        zkk zkkVar = this.f47239a;
        ((ImageView) zkkVar.b).setVisibility(0);
        ((ImageView) zkkVar.b).setImageDrawable(drawable);
        drawable.setTintList(this.g);
        d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsChip(Context context) {
        this(context, null);
        context.getClass();
    }
}
