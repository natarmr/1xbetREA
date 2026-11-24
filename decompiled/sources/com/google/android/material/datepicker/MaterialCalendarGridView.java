package com.google.android.material.datepicker;

import a.akj0;
import a.bi30;
import a.cu;
import a.ett0;
import a.jf4;
import a.jw20;
import a.n6x;
import a.rgu0;
import a.wsf0;
import a.wss;
import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.focus.FocusRingDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f45566a;
    public jw20 b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ett0.c(null);
        if (f.K0(R.attr.windowFullscreen, getContext())) {
            setNextFocusLeftId(org.xbet.client1.R.id.cancel_button);
            setNextFocusRightId(org.xbet.client1.R.id.confirm_button);
        }
        this.f45566a = f.K0(org.xbet.client1.R.attr.nestedScrollable, getContext());
        rgu0.o(this, new bi30((byte) 2));
    }

    public final h a() {
        return (h) super.getAdapter();
    }

    public final boolean b(int i, boolean z) {
        jw20 jw20Var;
        jw20 jw20Var2;
        int iA = z ? ((h) super.getAdapter()).a(i) : ((h) super.getAdapter()).b(i);
        if (iA != -1) {
            setSelection(iA);
            return true;
        }
        if (!z && (jw20Var2 = this.b) != null) {
            return ((e) jw20Var2.b).y0(false);
        }
        if (!z || (jw20Var = this.b) == null) {
            return true;
        }
        return ((e) jw20Var.b).y0(true);
    }

    public final void c() {
        h hVar = (h) super.getAdapter();
        Drawable selector = getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.p;
        if (n6x.S(context.getTheme(), org.xbet.client1.R.attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            cu cuVar = hVar.b;
            if (cuVar != null) {
                focusRingDrawable.o.t = (akj0) ((wsf0) cuVar.b).b;
            }
            setDrawSelectorOnTop(true);
            setSelector(focusRingDrawable);
        }
    }

    public final boolean d(int i) {
        h hVar = (h) super.getAdapter();
        if (!hVar.e(i)) {
            long itemId = hVar.getItemId(i);
            int i2 = 1;
            while (true) {
                if (i2 >= hVar.f45571a.d) {
                    i = -1;
                    break;
                }
                int i3 = i + i2;
                if ((i3 < h.e && hVar.getItemId(i3) == itemId && hVar.e(i3)) || ((i3 = i - i2) >= 0 && hVar.getItemId(i3) == itemId && hVar.e(i3))) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        if (i == -1) {
            return false;
        }
        setSelection(i);
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (h) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((h) super.getAdapter()).notifyDataSetChanged();
        post(new wss(this, (byte) 11));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        h hVar = (h) super.getAdapter();
        hVar.getClass();
        int iMax = Math.max(hVar.c(), getFirstVisiblePosition());
        int iMin = Math.min(hVar.f(), getLastVisiblePosition());
        hVar.getItem(iMax);
        hVar.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int iB;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33 || i == 1) {
            h hVar = (h) super.getAdapter();
            iB = hVar.b(hVar.f() + 1);
        } else if (i == 130 || i == 2) {
            h hVar2 = (h) super.getAdapter();
            iB = hVar2.a(hVar2.c() - 1);
        } else {
            iB = -1;
        }
        if (iB != -1) {
            setSelection(iB);
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = getLayoutDirection() == 1;
        if (i == 21) {
            return b(selectedItemPosition, z);
        }
        if (i == 22) {
            return b(selectedItemPosition, !z);
        }
        if (i == 61) {
            int iB = keyEvent.isShiftPressed() ? ((h) super.getAdapter()).b(selectedItemPosition) : ((h) super.getAdapter()).a(selectedItemPosition);
            if (iB == -1) {
                return false;
            }
            setSelection(iB);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        h hVar = (h) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || hVar.e(selectedItemPosition2)) {
            return true;
        }
        h hVar2 = (h) super.getAdapter();
        if (!d(selectedItemPosition2)) {
            if (19 != i) {
                if (i == 20) {
                    int numColumns = getNumColumns();
                    while (true) {
                        numColumns += selectedItemPosition2;
                        if (numColumns > hVar2.f()) {
                            break;
                        }
                        if (!d(numColumns)) {
                            selectedItemPosition2 = getNumColumns();
                        }
                    }
                }
                return false;
            }
            int numColumns2 = getNumColumns();
            while (true) {
                selectedItemPosition2 -= numColumns2;
                if (selectedItemPosition2 < hVar2.c()) {
                    return false;
                }
                if (d(selectedItemPosition2)) {
                    break;
                }
                numColumns2 = getNumColumns();
            }
        }
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f45566a) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof h) {
            super.setAdapter(listAdapter);
        } else {
            jf4.l("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), h.class.getCanonicalName()});
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        h hVar = (h) super.getAdapter();
        super.setSelection(Math.max(i, hVar.a(hVar.c() - 1)));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (h) super.getAdapter();
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }
}
