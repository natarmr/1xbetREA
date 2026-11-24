package a;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class k12 extends rd3 implements DialogInterface {
    public final i12 g;

    public k12(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, g(i, contextThemeWrapper));
        this.g = new i12(getContext(), this, getWindow());
    }

    public static int g(int i, Context context) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // a.rd3, a.hgd, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        i12 i12Var = this.g;
        i12Var.b.setContentView(i12Var.y);
        Context context = i12Var.f13974a;
        Window window = i12Var.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = i12Var.f;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !i12.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (i12Var.g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (i12Var.e != null) {
                ((LinearLayout.LayoutParams) ((i900) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = i12.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = i12.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = i12.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        i12Var.q = nestedScrollView;
        nestedScrollView.setFocusable(false);
        i12Var.q.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        i12Var.u = textView;
        if (textView != null) {
            textView.setVisibility(8);
            i12Var.q.removeView(i12Var.u);
            if (i12Var.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) i12Var.q.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(i12Var.q);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(i12Var.e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupB2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        i12Var.h = button;
        wh whVar = i12Var.E;
        button.setOnClickListener(whVar);
        boolean zIsEmpty = TextUtils.isEmpty(i12Var.i);
        Button button2 = i12Var.h;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(i12Var.i);
            i12Var.h.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        i12Var.k = button3;
        button3.setOnClickListener(whVar);
        boolean zIsEmpty2 = TextUtils.isEmpty(i12Var.l);
        Button button4 = i12Var.k;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(i12Var.l);
            i12Var.k.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        i12Var.n = button5;
        button5.setOnClickListener(whVar);
        boolean zIsEmpty3 = TextUtils.isEmpty(i12Var.o);
        Button button6 = i12Var.n;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(i12Var.o);
            i12Var.n.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = i12Var.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = i12Var.k;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = i12Var.n;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (i12Var.v != null) {
            viewGroupB.addView(i12Var.v, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            i12Var.s = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(i12Var.d) || !i12Var.C) {
                window.findViewById(R.id.title_template).setVisibility(8);
                i12Var.s.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                i12Var.t = textView2;
                textView2.setText(i12Var.d);
                Drawable drawable = i12Var.r;
                if (drawable != null) {
                    i12Var.s.setImageDrawable(drawable);
                } else {
                    i12Var.t.setPadding(i12Var.s.getPaddingLeft(), i12Var.s.getPaddingTop(), i12Var.s.getPaddingRight(), i12Var.s.getPaddingBottom());
                    i12Var.s.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = i12Var.q;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = i12Var.e != null ? viewGroupB.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = i12Var.e;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f45282a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
        }
        if (!z2) {
            View view2 = i12Var.e;
            if (view2 == null) {
                view2 = i12Var.q;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = rgu0.f30456a;
                view2.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = i12Var.e;
        if (alertController$RecycleListView2 == null || (listAdapter = i12Var.w) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = i12Var.x;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.q;
        if (nestedScrollView == null || !nestedScrollView.f(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.q;
        if (nestedScrollView == null || !nestedScrollView.f(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // a.rd3, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        i12 i12Var = this.g;
        i12Var.d = charSequence;
        TextView textView = i12Var.t;
        if (textView != null) {
            textView.setText(charSequence);
        }
        i12Var.c.setTitle(charSequence);
    }
}
