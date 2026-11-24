package a;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class cxn extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f5129a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public View.OnLongClickListener f;
    public final CheckableImageButton g;
    public final tyc h;
    public int i;
    public final LinkedHashSet j;
    public ColorStateList k;
    public PorterDuff.Mode l;
    public int m;
    public ImageView.ScaleType n;
    public View.OnLongClickListener o;
    public CharSequence p;
    public final AppCompatTextView q;
    public boolean r;
    public EditText s;
    public final AccessibilityManager t;
    public AccessibilityManager.TouchExplorationStateChangeListener u;
    public final rbc v;

    public cxn(TextInputLayout textInputLayout, ywu ywuVar) {
        super(textInputLayout.getContext());
        final byte b = 0;
        this.i = 0;
        this.j = new LinkedHashSet();
        final byte b2 = 1;
        this.v = new rbc(this, b2);
        bxn bxnVar = new bxn(this);
        this.t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f5129a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(R.layout.design_text_input_end_icon, (ViewGroup) this, false);
        checkableImageButton.setId(R.id.text_input_error_icon);
        if (g7x.S(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        this.c = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) layoutInflaterFrom.inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout, false);
        checkableImageButton2.setId(R.id.text_input_end_icon);
        if (g7x.S(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginStart(0);
        }
        this.g = checkableImageButton2;
        this.h = new tyc(this, ywuVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.q = appCompatTextView;
        TypedArray typedArray = (TypedArray) ywuVar.c;
        if (typedArray.hasValue(38)) {
            this.d = g7x.B(getContext(), ywuVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.e = afn0.y(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(ywuVar.n(37));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setCheckable(false);
        checkableImageButton.setFocusable(false);
        if (!typedArray.hasValue(55)) {
            if (typedArray.hasValue(32)) {
                this.k = g7x.B(getContext(), ywuVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.l = afn0.y(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                f(typedArray.getText(27));
            }
            checkableImageButton2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(55)) {
            if (typedArray.hasValue(56)) {
                this.k = g7x.B(getContext(), ywuVar, 56);
            }
            if (typedArray.hasValue(57)) {
                this.l = afn0.y(typedArray.getInt(57, -1), null);
            }
            g(typedArray.getBoolean(55, false) ? 1 : 0);
            f(typedArray.getText(53));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            jf4.o("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.m) {
            this.m = dimensionPixelSize;
            checkableImageButton2.setMinimumWidth(dimensionPixelSize);
            checkableImageButton2.setMinimumHeight(dimensionPixelSize);
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeR = cww.r(typedArray.getInt(31, -1));
            this.n = scaleTypeR;
            checkableImageButton2.setScaleType(scaleTypeR);
            checkableImageButton.setScaleType(scaleTypeR);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(74, 0));
        if (typedArray.hasValue(75)) {
            appCompatTextView.setTextColor(ywuVar.m(75));
        }
        CharSequence text = typedArray.getText(73);
        this.p = TextUtils.isEmpty(text) ? null : text;
        appCompatTextView.setText(text);
        n();
        frameLayout.addView(checkableImageButton2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButton);
        checkableImageButton.setOnFocusableChangedListener(new n9c(this) { // from class: a.axn
            public final /* synthetic */ cxn b;

            {
                this.b = this;
            }

            @Override // a.n9c
            public final void a() {
                byte b3 = b;
                cxn cxnVar = this.b;
                switch (b3) {
                    case 0:
                        CheckableImageButton checkableImageButton3 = cxnVar.c;
                        cww.S(checkableImageButton3, cxnVar.f, checkableImageButton3.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton4 = cxnVar.g;
                        cww.S(checkableImageButton4, cxnVar.o, checkableImageButton4.getContentDescription());
                        break;
                }
            }
        });
        checkableImageButton2.setOnFocusableChangedListener(new n9c(this) { // from class: a.axn
            public final /* synthetic */ cxn b;

            {
                this.b = this;
            }

            @Override // a.n9c
            public final void a() {
                byte b3 = b2;
                cxn cxnVar = this.b;
                switch (b3) {
                    case 0:
                        CheckableImageButton checkableImageButton3 = cxnVar.c;
                        cww.S(checkableImageButton3, cxnVar.f, checkableImageButton3.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton4 = cxnVar.g;
                        cww.S(checkableImageButton4, cxnVar.o, checkableImageButton4.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.F1.add(bxnVar);
        if (textInputLayout.e != null) {
            bxnVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new bc0(this, (byte) 4));
    }

    public final dxn a() {
        dxn jxfVar;
        int i = this.i;
        tyc tycVar = this.h;
        SparseArray sparseArray = (SparseArray) tycVar.d;
        dxn dxnVar = (dxn) sparseArray.get(i);
        if (dxnVar != null) {
            return dxnVar;
        }
        cxn cxnVar = (cxn) tycVar.e;
        if (i != -1) {
            byte b = 1;
            if (i == 0) {
                jxfVar = new jxf(cxnVar, b);
            } else if (i == 1) {
                jxfVar = new u190(cxnVar, tycVar.c);
            } else if (i == 2) {
                jxfVar = new ssc(cxnVar);
            } else {
                if (i != 3) {
                    jf4.o(twn.m(i, "Invalid end icon mode: "));
                    return null;
                }
                jxfVar = new til(cxnVar);
            }
        } else {
            jxfVar = new jxf(cxnVar, (byte) 0);
        }
        sparseArray.append(i, jxfVar);
        return jxfVar;
    }

    public final int b() {
        int marginStart;
        if (c() || d()) {
            CheckableImageButton checkableImageButton = this.g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean c() {
        return this.b.getVisibility() == 0 && this.g.getVisibility() == 0;
    }

    public final boolean d() {
        return this.c.getVisibility() == 0;
    }

    public final void e(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        dxn dxnVarA = a();
        boolean zJ = dxnVarA.j();
        CheckableImageButton checkableImageButton = this.g;
        boolean z4 = true;
        if (!zJ || (z3 = checkableImageButton.d) == dxnVarA.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(dxnVarA instanceof til) || (zIsActivated = checkableImageButton.isActivated()) == ((til) dxnVarA).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            cww.H(this.f5129a, checkableImageButton, this.k);
        }
    }

    public final void f(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            cww.S(checkableImageButton, this.o, charSequence);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        dxn dxnVarA = a();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.u;
        AccessibilityManager accessibilityManager = this.t;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.u = null;
        dxnVarA.r();
        this.i = i;
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            throw rw2.h(it);
        }
        h(i != 0);
        dxn dxnVarA2 = a();
        int iD = this.h.b;
        if (iD == 0) {
            iD = dxnVarA2.d();
        }
        Drawable drawableU = iD != 0 ? epv0.U(iD, getContext()) : null;
        CheckableImageButton checkableImageButton = this.g;
        checkableImageButton.setImageDrawable(drawableU);
        TextInputLayout textInputLayout = this.f5129a;
        if (drawableU != null) {
            cww.o(textInputLayout, checkableImageButton, this.k, this.l);
            cww.H(textInputLayout, checkableImageButton, this.k);
        }
        checkableImageButton.setCheckable(dxnVarA2.j());
        if (!dxnVarA2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        dxnVarA2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = dxnVarA2.h();
        this.u = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.u);
        }
        View.OnClickListener onClickListenerF = dxnVarA2.f();
        View.OnLongClickListener onLongClickListener = this.o;
        checkableImageButton.setOnClickListener(onClickListenerF);
        cww.J(checkableImageButton, onLongClickListener);
        int iC = dxnVarA2.c();
        f(iC != 0 ? getResources().getText(iC) : null);
        EditText editText = this.s;
        if (editText != null) {
            dxnVarA2.l(editText);
            j(dxnVarA2);
        }
        cww.o(textInputLayout, checkableImageButton, this.k, this.l);
        e(true);
    }

    public final void h(boolean z) {
        EditText editText;
        if (c() != z) {
            CheckableImageButton checkableImageButton = this.g;
            if (!z && checkableImageButton.hasFocus() && (editText = this.s) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            k();
            m();
            this.f5129a.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        cww.o(this.f5129a, checkableImageButton, this.d, this.e);
    }

    public final void j(dxn dxnVar) {
        if (this.s == null) {
            return;
        }
        if (dxnVar.e() != null) {
            this.s.setOnFocusChangeListener(dxnVar.e());
        }
        if (dxnVar.g() != null) {
            this.g.setOnFocusChangeListener(dxnVar.g());
        }
    }

    public final void k() {
        this.b.setVisibility((this.g.getVisibility() != 0 || d()) ? 8 : 0);
        setVisibility((c() || d() || ((this.p == null || this.r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f5129a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.k.q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.f5129a;
        if (textInputLayout.e == null) {
            return;
        }
        this.q.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.e.getPaddingTop(), (c() || d()) ? 0 : textInputLayout.e.getPaddingEnd(), textInputLayout.e.getPaddingBottom());
    }

    public final void n() {
        AppCompatTextView appCompatTextView = this.q;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.p == null || this.r) ? 8 : 0;
        if (visibility != i) {
            a().o(i == 0);
        }
        k();
        appCompatTextView.setVisibility(i);
        this.f5129a.s();
    }
}
