package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.tabs.TabLayout;
import com.huawei.hms.adapter.internal.CommonCode;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class vbo0 extends LinearLayout {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tbo0 f37150a;
    public TextView b;
    public ImageView c;
    public View d;
    public gf5 e;
    public View f;
    public TextView g;
    public ImageView h;
    public Drawable i;
    public int j;
    public final /* synthetic */ TabLayout k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vbo0(TabLayout tabLayout, Context context) {
        super(context);
        this.k = tabLayout;
        this.j = 2;
        g(context);
        setPaddingRelative(tabLayout.e, tabLayout.f, tabLayout.g, tabLayout.h);
        setGravity(17);
        setOrientation(!tabLayout.g1 ? 1 : 0);
        setClickable(true);
        PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), CommonCode.BusInterceptor.PRIVACY_CANCEL);
        WeakHashMap weakHashMap = rgu0.f30456a;
        kgu0.a(this, systemIcon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public gf5 getBadge() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public gf5 getOrCreateBadge() {
        if (this.e == null) {
            this.e = new gf5(getContext());
        }
        d();
        gf5 gf5Var = this.e;
        if (gf5Var != null) {
            return gf5Var;
        }
        jf4.n("Unable to create badge");
        return null;
    }

    public final void c() {
        if (this.e != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.d;
            if (view != null) {
                gf5 gf5Var = this.e;
                if (gf5Var != null) {
                    if (gf5Var.d() != null) {
                        gf5Var.d().setForeground(null);
                    } else {
                        view.getOverlay().remove(gf5Var);
                    }
                }
                this.d = null;
            }
        }
    }

    public final void d() {
        if (this.e != null) {
            if (this.f != null) {
                c();
                return;
            }
            TextView textView = this.b;
            if (textView == null || this.f37150a == null) {
                c();
                return;
            }
            if (this.d == textView) {
                e(textView);
                return;
            }
            c();
            TextView textView2 = this.b;
            if (this.e == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            gf5 gf5Var = this.e;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            gf5Var.setBounds(rect);
            gf5Var.i(textView2, null);
            if (gf5Var.d() != null) {
                gf5Var.d().setForeground(gf5Var);
            } else {
                textView2.getOverlay().add(gf5Var);
            }
            this.d = textView2;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.i;
        if ((drawable == null || !drawable.isStateful()) ? false : this.i.setState(drawableState)) {
            invalidate();
            this.k.invalidate();
        }
    }

    public final void e(View view) {
        gf5 gf5Var = this.e;
        if (gf5Var == null || view != this.d) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        gf5Var.setBounds(rect);
        gf5Var.i(view, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    public final void f() {
        boolean z;
        h();
        tbo0 tbo0Var = this.f37150a;
        if (tbo0Var == null) {
            z = false;
        } else {
            TabLayout tabLayout = tbo0Var.d;
            if (tabLayout == null) {
                jf4.o("Tab not attached to a TabLayout");
                return;
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition == -1 || selectedTabPosition != tbo0Var.b) {
                z = false;
            } else {
                z = true;
            }
        }
        setSelected(z);
    }

    public final void g(Context context) {
        TabLayout tabLayout = this.k;
        int i = tabLayout.t;
        if (i != 0) {
            Drawable drawableU = epv0.U(i, context);
            this.i = drawableU;
            if (drawableU != null && drawableU.isStateful()) {
                this.i.setState(getDrawableState());
            }
        } else {
            this.i = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        Drawable focusRingDrawable = gradientDrawable;
        if (tabLayout.n != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = tabLayout.n;
            int[] iArr = ocg0.d;
            int iA = ocg0.a(colorStateList, ocg0.c);
            int[] iArr2 = ocg0.b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{iA, ocg0.a(colorStateList, iArr2), ocg0.a(colorStateList, ocg0.f25026a)});
            if (tabLayout.k1) {
                Drawable rippleDrawable = new RippleDrawable(colorStateList2, null, null);
                ColorDrawable colorDrawable = FocusRingDrawable.p;
                focusRingDrawable = rippleDrawable;
                if (n6x.S(context.getTheme(), R.attr.focusRingsEnabled, false)) {
                    focusRingDrawable = new FocusRingDrawable(context, rippleDrawable);
                }
            } else {
                RippleDrawable rippleDrawable2 = new RippleDrawable(colorStateList2, gradientDrawable, gradientDrawable2);
                FocusRingDrawable.f(context, rippleDrawable2, null);
                focusRingDrawable = rippleDrawable2;
            }
        }
        setBackground(focusRingDrawable);
        tabLayout.invalidate();
    }

    public int getContentHeight() {
        View[] viewArr = {this.b, this.c, this.f};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public int getContentWidth() {
        View[] viewArr = {this.b, this.c, this.f};
        int iMax = 0;
        int iMin = 0;
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null && view.getVisibility() == 0) {
                iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                z = true;
            }
        }
        return iMax - iMin;
    }

    public tbo0 getTab() {
        return this.f37150a;
    }

    public final void h() {
        int i;
        ViewParent parent;
        tbo0 tbo0Var = this.f37150a;
        View view = tbo0Var != null ? tbo0Var.c : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f);
                }
                addView(view);
            }
            this.f = view;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.c.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
            this.g = textView2;
            if (textView2 != null) {
                this.j = textView2.getMaxLines();
            }
            this.h = (ImageView) view.findViewById(android.R.id.icon);
        } else {
            View view3 = this.f;
            if (view3 != null) {
                removeView(view3);
                this.f = null;
            }
            this.g = null;
            this.h = null;
        }
        if (this.f == null) {
            if (this.c == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.c = imageView2;
                addView(imageView2, 0);
            }
            if (this.b == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.b = textView3;
                addView(textView3);
                this.j = this.b.getMaxLines();
            }
            TextView textView4 = this.b;
            TabLayout tabLayout = this.k;
            textView4.setTextAppearance(tabLayout.i);
            if (!isSelected() || (i = tabLayout.k) == -1) {
                this.b.setTextAppearance(tabLayout.j);
            } else {
                this.b.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.l;
            if (colorStateList != null) {
                this.b.setTextColor(colorStateList);
            }
            i(this.b, this.c, true);
            d();
            ImageView imageView3 = this.c;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new djl(this, imageView3));
            }
            TextView textView5 = this.b;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new djl(this, textView5));
            }
        } else {
            TextView textView6 = this.g;
            if (textView6 != null || this.h != null) {
                i(textView6, this.h, false);
            }
        }
        if (tbo0Var == null || TextUtils.isEmpty(null)) {
            return;
        }
        setContentDescription(null);
    }

    public final void i(TextView textView, ImageView imageView, boolean z) {
        boolean z2;
        tbo0 tbo0Var = this.f37150a;
        CharSequence charSequence = tbo0Var != null ? tbo0Var.f33675a : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        if (textView != null) {
            if (zIsEmpty) {
                z2 = false;
            } else {
                this.f37150a.getClass();
                z2 = true;
            }
            textView.setText(!zIsEmpty ? charSequence : null);
            textView.setVisibility(z2 ? 0 : 8);
            if (!zIsEmpty) {
                setVisibility(0);
            }
        } else {
            z2 = false;
        }
        if (z && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int iL = (z2 && imageView.getVisibility() == 0) ? (int) afn0.l(8, getContext()) : 0;
            if (this.k.g1) {
                if (iL != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(iL);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (iL != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = iL;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        a4n0.l(this, zIsEmpty ? null : charSequence);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        gf5 gf5Var = this.e;
        if (gf5Var != null && gf5Var.isVisible()) {
            gf5 gf5Var2 = this.e;
            jf5 jf5Var = gf5Var2.e;
            CharSequence quantityString = null;
            if (gf5Var2.isVisible()) {
                BadgeState$State badgeState$State = jf5Var.b;
                if (badgeState$State.j != null) {
                    quantityString = badgeState$State.o;
                    if (quantityString == null) {
                        quantityString = gf5Var2.e.b.j;
                    }
                } else if (!gf5Var2.g()) {
                    quantityString = badgeState$State.p;
                } else if (badgeState$State.q != 0 && (context = (Context) gf5Var2.f11191a.get()) != null) {
                    if (gf5Var2.h != -2) {
                        int iE = gf5Var2.e();
                        int i = gf5Var2.h;
                        if (iE <= i) {
                            quantityString = context.getResources().getQuantityString(badgeState$State.q, gf5Var2.e(), Integer.valueOf(gf5Var2.e()));
                        } else {
                            quantityString = context.getString(badgeState$State.r, Integer.valueOf(i));
                        }
                    } else {
                        quantityString = context.getResources().getQuantityString(badgeState$State.q, gf5Var2.e(), Integer.valueOf(gf5Var2.e()));
                    }
                }
            }
            accessibilityNodeInfo.setContentDescription(quantityString);
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) j7.a(isSelected(), 0, 1, this.f37150a.b, 1).f16014a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) d7.e.f5572a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.k;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.u, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.b != null) {
            float f = tabLayout.q;
            if (isSelected() && tabLayout.k != -1) {
                f = tabLayout.r;
            }
            int i3 = this.j;
            ImageView imageView = this.c;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.b;
                if (textView != null && textView.getLineCount() > 1) {
                    f = tabLayout.s;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.b.getTextSize();
            int lineCount = this.b.getLineCount();
            int maxLines = this.b.getMaxLines();
            if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.f1 == 1 && f > textSize && lineCount == 1) {
                    Layout layout = this.b.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.b.setTextSize(0, f);
                this.b.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean zPerformClick = super.performClick();
        if (this.f37150a == null) {
            return zPerformClick;
        }
        if (!zPerformClick) {
            playSoundEffect(0);
        }
        tbo0 tbo0Var = this.f37150a;
        TabLayout tabLayout = tbo0Var.d;
        if (tabLayout != null) {
            tabLayout.j(tbo0Var, true);
            return true;
        }
        jf4.o("Tab not attached to a TabLayout");
        return false;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        isSelected();
        super.setSelected(z);
        TextView textView = this.b;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.c;
        if (imageView != null) {
            imageView.setSelected(z);
        }
        View view = this.f;
        if (view != null) {
            view.setSelected(z);
        }
    }

    public void setTab(tbo0 tbo0Var) {
        if (tbo0Var != this.f37150a) {
            this.f37150a = tbo0Var;
            f();
        }
    }
}
