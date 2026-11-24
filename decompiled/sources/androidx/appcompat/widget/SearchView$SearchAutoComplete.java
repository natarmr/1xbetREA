package androidx.appcompat.widget;

import a.ln40;
import a.mx2;
import a.sf3;
import a.zc3;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends zc3 {
    public int e;
    public d f;
    public boolean g;
    public final mx2 h;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new mx2(this, (byte) 24);
        this.e = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i < 600) {
            return (i < 640 || i2 < 480) ? 160 : 192;
        }
        return 192;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            sf3.C(this);
            if (enoughToFilter()) {
                showDropDown();
                return;
            }
            return;
        }
        ln40 ln40Var = d.I1;
        ln40Var.getClass();
        ln40.a();
        Method method = ln40Var.c;
        if (method != null) {
            try {
                method.invoke(this, Boolean.TRUE);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.e <= 0 || super.enoughToFilter();
    }

    @Override // a.zc3, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.g) {
            mx2 mx2Var = this.h;
            removeCallbacks(mx2Var);
            post(mx2Var);
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        d dVar = this.f;
        dVar.w(dVar.r1);
        dVar.post(dVar.F1);
        if (dVar.p.hasFocus()) {
            dVar.l();
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.f.clearFocus();
                    setImeVisibility(false);
                    return true;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f.hasFocus() && getVisibility() == 0) {
            this.g = true;
            Context context = getContext();
            ln40 ln40Var = d.I1;
            if (context.getResources().getConfiguration().orientation == 2) {
                a();
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        mx2 mx2Var = this.h;
        if (!z) {
            this.g = false;
            removeCallbacks(mx2Var);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (!inputMethodManager.isActive(this)) {
                this.g = true;
                return;
            }
            this.g = false;
            removeCallbacks(mx2Var);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    public void setSearchView(d dVar) {
        this.f = dVar;
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i) {
        super.setThreshold(i);
        this.e = i;
    }

    public SearchView$SearchAutoComplete(Context context) {
        this(context, null);
    }
}
