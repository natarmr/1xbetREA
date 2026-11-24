package org.xplatform.ui_core.viewcomponents.tabs;

import a.cle;
import a.rgu0;
import a.tbo0;
import a.vbo0;
import a.xbo0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class TabLayoutChips extends TabLayout {
    public static final /* synthetic */ int B1 = 0;
    public final boolean A1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabLayoutChips(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.A1 = context.getResources().getConfiguration().getLayoutDirection() == 1;
        setTabMode(0);
        setOverScrollMode(2);
        setTabRippleColor(null);
        setSelectedTabIndicator((Drawable) null);
        xbo0 xbo0Var = new xbo0();
        ArrayList arrayList = this.o1;
        if (arrayList.contains(xbo0Var)) {
            return;
        }
        arrayList.add(xbo0Var);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public final void a(tbo0 tbo0Var, int i, boolean z) {
        super.a(tbo0Var, i, z);
        if (tbo0Var.c == null) {
            Context context = getContext();
            Object systemService = context != null ? context.getSystemService("layout_inflater") : null;
            LayoutInflater layoutInflater = systemService instanceof LayoutInflater ? (LayoutInflater) systemService : null;
            if (layoutInflater != null) {
                View viewInflate = layoutInflater.inflate(R.layout.chip_tab, (ViewGroup) this, false);
                if (viewInflate != null) {
                    TextView textView = (TextView) viewInflate.findViewById(R.id.text1);
                    ImageView imageView = (ImageView) viewInflate.findViewById(R.id.badge);
                    textView.setText(tbo0Var.f33675a);
                    imageView.getClass();
                    imageView.setVisibility(tbo0Var.e.getBadge() == null ? 8 : 0);
                    textView.setTextSize(14.0f);
                    textView.getViewTreeObserver().addOnPreDrawListener(new cle(textView, (byte) 2));
                    tbo0Var.c = viewInflate;
                    vbo0 vbo0Var = tbo0Var.e;
                    if (vbo0Var != null) {
                        vbo0Var.f();
                    }
                }
            }
        }
    }

    @Override // com.google.android.material.tabs.TabLayout
    public int getSelectedTabPosition() {
        return super.getSelectedTabPosition();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        tbo0 tbo0VarF;
        super.onLayout(z, i, i2, i3, i4);
        if (!z || (tbo0VarF = f(getSelectedTabPosition())) == null) {
            return;
        }
        j(tbo0VarF, true);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final void scrollTo(int i, int i2) {
        View childAt;
        ViewGroup viewGroup;
        View childAt2;
        if (getSelectedTabPosition() == -1) {
            return;
        }
        if (this.A1 && getSelectedTabPosition() == 0 && i <= 0) {
            return;
        }
        int selectedTabPosition = getSelectedTabPosition();
        int width = 0;
        if ((getTabMode() == 0 || getTabMode() == 2) && (childAt = getChildAt(0)) != null && (childAt2 = (viewGroup = (ViewGroup) childAt).getChildAt(selectedTabPosition)) != null) {
            int i3 = selectedTabPosition + 1;
            View childAt3 = i3 < getChildCount() ? viewGroup.getChildAt(i3) : null;
            int width2 = childAt2.getWidth();
            width = childAt3 != null ? childAt3.getWidth() : 0;
            int left = ((width2 / 2) + childAt2.getLeft()) - (getWidth() / 2);
            int i4 = (int) ((width2 + width) * 0.5f * 0.0f);
            WeakHashMap weakHashMap = rgu0.f30456a;
            width = getLayoutDirection() == 0 ? left + i4 : left - i4;
        }
        if (getScrollX() > width && width <= i && i <= getScrollX()) {
            super.scrollTo(i, i2);
        } else {
            if (getScrollX() > i || i > width) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabLayoutChips(Context context) {
        this(context, null);
        context.getClass();
    }
}
