package a;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class til extends dxn {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final q10 i;
    public final qd7 j;
    public final sil k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v2, types: [a.sil] */
    public til(cxn cxnVar) {
        super(cxnVar);
        this.i = new q10(this, (byte) 15);
        this.j = new qd7(this, (byte) 3);
        this.k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: a.sil
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                til tilVar = this.f32268a;
                AutoCompleteTextView autoCompleteTextView = tilVar.h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                tilVar.d.setImportantForAccessibility(z ? 2 : 1);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = n6x.T(cxnVar.getContext(), R.attr.motionDurationShort3, 67);
        this.e = n6x.T(cxnVar.getContext(), R.attr.motionDurationShort3, 50);
        this.g = g7x.W(cxnVar.getContext(), R.attr.motionEasingLinearInterpolator, n73.f23021a);
    }

    @Override // a.dxn
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && hic.A(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new ccf((Object) this, (byte) 14));
    }

    @Override // a.dxn
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // a.dxn
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // a.dxn
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // a.dxn
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // a.dxn
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // a.dxn
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // a.dxn
    public final boolean k() {
        return this.n;
    }

    @Override // a.dxn
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            itt0.k("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
            return;
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new jw5(this, (byte) 3));
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: a.ril
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                til tilVar = this.f30548a;
                tilVar.m = true;
                tilVar.o = SystemClock.uptimeMillis();
                tilVar.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f6855a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // a.dxn
    public final void m(k7 k7Var) {
        if (!hic.A(this.h)) {
            k7Var.j(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26 ? k7Var.f17795a.isShowingHintText() : k7Var.e(4)) {
            k7Var.m(null);
        }
    }

    @Override // a.dxn
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || hic.A(this.h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            t();
            this.m = true;
            this.o = SystemClock.uptimeMillis();
        }
    }

    @Override // a.dxn
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        byte b = 11;
        valueAnimatorOfFloat.addUpdateListener(new fd5(this, b));
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new fd5(this, b));
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new xh(this, (byte) 5));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // a.dxn
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        s(!this.n);
        boolean z = this.n;
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (!z) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            this.h.showDropDown();
        }
    }
}
