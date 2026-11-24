package androidx.appcompat.widget;

import a.aem0;
import a.cmu0;
import a.e22;
import a.egu0;
import a.epv0;
import a.ezn0;
import a.feb;
import a.jiq0;
import a.mqd0;
import a.pe3;
import a.qhl;
import a.qsn;
import a.rgu0;
import a.uob;
import a.vd3;
import a.ybq0;
import a.ywu;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final uob u1 = new uob(Float.class, "thumbPos", 15);
    public static final int[] v1 = {R.attr.state_checked};
    public int A;
    public int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f45298a;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public boolean d;
    public boolean e;
    public Drawable f;
    public int f1;
    public ColorStateList g;
    public int g1;
    public PorterDuff.Mode h;
    public int h1;
    public boolean i;
    public int i1;
    public boolean j;
    public int j1;
    public int k;
    public boolean k1;
    public int l;
    public final TextPaint l1;
    public int m;
    public final ColorStateList m1;
    public boolean n;
    public StaticLayout n1;
    public CharSequence o;
    public StaticLayout o1;
    public CharSequence p;
    public final e22 p1;
    public CharSequence q;
    public ObjectAnimator q1;
    public CharSequence r;
    public vd3 r1;
    public boolean s;
    public ezn0 s1;
    public byte t;
    public final Rect t1;
    public final int u;
    public float v;
    public float w;
    public final VelocityTracker x;
    public final int y;
    public float z;

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, i);
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.x = VelocityTracker.obtain();
        this.k1 = true;
        this.t1 = new Rect();
        ybq0.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.l1 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = mqd0.w;
        ywu ywuVarY = ywu.y(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) ywuVarY.c;
        rgu0.n(this, context, iArr, attributeSet, typedArray, i, 0);
        Drawable drawableN = ywuVarY.n(2);
        this.f45298a = drawableN;
        if (drawableN != null) {
            drawableN.setCallback(this);
        }
        Drawable drawableN2 = ywuVarY.n(11);
        this.f = drawableN2;
        if (drawableN2 != null) {
            drawableN2.setCallback(this);
        }
        setTextOnInternal(typedArray.getText(0));
        setTextOffInternal(typedArray.getText(1));
        this.s = typedArray.getBoolean(3, true);
        this.k = typedArray.getDimensionPixelSize(8, 0);
        this.l = typedArray.getDimensionPixelSize(5, 0);
        this.m = typedArray.getDimensionPixelSize(6, 0);
        this.n = typedArray.getBoolean(4, false);
        ColorStateList colorStateListM = ywuVarY.m(9);
        if (colorStateListM != null) {
            this.b = colorStateListM;
            this.d = true;
        }
        PorterDuff.Mode modeC = qhl.c(typedArray.getInt(10, -1), null);
        if (this.c != modeC) {
            this.c = modeC;
            this.e = true;
        }
        if (this.d || this.e) {
            a();
        }
        ColorStateList colorStateListM2 = ywuVarY.m(12);
        if (colorStateListM2 != null) {
            this.g = colorStateListM2;
            this.i = true;
        }
        PorterDuff.Mode modeC2 = qhl.c(typedArray.getInt(13, -1), null);
        if (this.h != modeC2) {
            this.h = modeC2;
            this.j = true;
        }
        if (this.i || this.j) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId2, mqd0.x);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = jiq0.n0(resourceId, context)) == null) ? typedArrayObtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.m1 = colorStateList;
            } else {
                this.m1 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
            int i3 = typedArrayObtainStyledAttributes.getInt(2, -1);
            if (i2 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i2 != 2) {
                typeface = i2 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i3 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i4 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i3;
                textPaint.setFakeBoldText((i4 & 1) != 0);
                textPaint.setTextSkewX((2 & i4) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                e22 e22Var = new e22();
                e22Var.f7064a = context2.getResources().getConfiguration().locale;
                this.p1 = e22Var;
            } else {
                this.p1 = null;
            }
            setTextOnInternal(this.o);
            setTextOffInternal(this.q);
            typedArrayObtainStyledAttributes.recycle();
        }
        new pe3(this).h(attributeSet, i);
        ywuVarY.A();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.u = viewConfiguration.getScaledTouchSlop();
        this.y = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, i);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private vd3 getEmojiTextViewHelper() {
        vd3 vd3Var = this.r1;
        if (vd3Var != null) {
            return vd3Var;
        }
        vd3 vd3Var2 = new vd3(this);
        this.r1 = vd3Var2;
        return vd3Var2;
    }

    private boolean getTargetCheckedState() {
        return this.z > 0.5f;
    }

    private int getThumbOffset() {
        boolean z = cmu0.f4626a;
        int layoutDirection = getLayoutDirection();
        float f = this.z;
        if (layoutDirection == 1) {
            f = 1.0f - f;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.t1;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f45298a;
        Rect rectB = drawable2 != null ? qhl.b(drawable2) : qhl.c;
        return ((((this.A - this.f1) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.q = charSequence;
        TransformationMethod transformationMethodK0 = ((feb) getEmojiTextViewHelper().b.b).k0(this.p1);
        if (transformationMethodK0 != null) {
            charSequence = transformationMethodK0.getTransformation(charSequence, this);
        }
        this.r = charSequence;
        this.o1 = null;
        if (this.s) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.o = charSequence;
        TransformationMethod transformationMethodK0 = ((feb) getEmojiTextViewHelper().b.b).k0(this.p1);
        if (transformationMethodK0 != null) {
            charSequence = transformationMethodK0.getTransformation(charSequence, this);
        }
        this.p = charSequence;
        this.n1 = null;
        if (this.s) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f45298a;
        if (drawable != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = drawable.mutate();
                this.f45298a = drawableMutate;
                if (this.d) {
                    drawableMutate.setTintList(this.b);
                }
                if (this.e) {
                    this.f45298a.setTintMode(this.c);
                }
                if (this.f45298a.isStateful()) {
                    this.f45298a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable drawableMutate = drawable.mutate();
                this.f = drawableMutate;
                if (this.i) {
                    drawableMutate.setTintList(this.g);
                }
                if (this.j) {
                    this.f.setTintMode(this.h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.o);
        setTextOffInternal(this.q);
        requestLayout();
    }

    public final void d() {
        if (this.s1 == null && ((feb) this.r1.b.b).d0() && qsn.d()) {
            qsn qsnVarA = qsn.a();
            int iC = qsnVarA.c();
            if (iC == 3 || iC == 0) {
                ezn0 ezn0Var = new ezn0(this);
                this.s1 = ezn0Var;
                qsnVarA.h(ezn0Var);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3 = this.g1;
        int i4 = this.h1;
        int i5 = this.i1;
        int i6 = this.j1;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f45298a;
        Rect rectB = drawable != null ? qhl.b(drawable) : qhl.c;
        Drawable drawable2 = this.f;
        Rect rect = this.t1;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (rectB != null) {
                int i8 = rectB.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rectB.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rectB.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rectB.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                }
                this.f.setBounds(i3, i, i5, i2);
            } else {
                i = i4;
            }
            i2 = i6;
            this.f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f45298a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f1 + rect.right;
            this.f45298a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f45298a;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f45298a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        boolean z = cmu0.f4626a;
        if (getLayoutDirection() != 1) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.m : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        boolean z = cmu0.f4626a;
        if (getLayoutDirection() == 1) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.m : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return aem0.z(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.s;
    }

    public boolean getSplitTrack() {
        return this.n;
    }

    public int getSwitchMinWidth() {
        return this.l;
    }

    public int getSwitchPadding() {
        return this.m;
    }

    public CharSequence getTextOff() {
        return this.q;
    }

    public CharSequence getTextOn() {
        return this.o;
    }

    public Drawable getThumbDrawable() {
        return this.f45298a;
    }

    public final float getThumbPosition() {
        return this.z;
    }

    public int getThumbTextPadding() {
        return this.k;
    }

    public ColorStateList getThumbTintList() {
        return this.b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    public ColorStateList getTrackTintList() {
        return this.g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f45298a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.q1;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.q1.end();
        this.q1 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, v1);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f;
        Rect rect = this.t1;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.h1;
        int i2 = this.j1;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f45298a;
        if (drawable != null) {
            if (!this.n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = qhl.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.n1 : this.o1;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            TextPaint textPaint = this.l1;
            ColorStateList colorStateList = this.m1;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.o : this.q;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z, i, i2, i3, i4);
        int iMax2 = 0;
        if (this.f45298a != null) {
            Drawable drawable = this.f;
            Rect rect = this.t1;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = qhl.b(this.f45298a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        boolean z2 = cmu0.f4626a;
        if (getLayoutDirection() == 1) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.A + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.A) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i5 = this.B;
            int i6 = height2 - (i5 / 2);
            height = i5 + i6;
            paddingTop = i6;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.B + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.B;
        }
        this.g1 = paddingLeft;
        this.h1 = paddingTop;
        this.j1 = height;
        this.i1 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        int intrinsicHeight2 = 0;
        if (this.s) {
            StaticLayout staticLayout = this.n1;
            TextPaint textPaint = this.l1;
            if (staticLayout == null) {
                CharSequence charSequence = this.p;
                this.n1 = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.o1 == null) {
                CharSequence charSequence2 = this.r;
                this.o1 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f45298a;
        Rect rect = this.t1;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f45298a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f45298a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.s) {
            iMax = (this.k * 2) + Math.max(this.n1.getWidth(), this.o1.getWidth());
        } else {
            iMax = 0;
        }
        this.f1 = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f45298a;
        if (drawable3 != null) {
            Rect rectB = qhl.b(drawable3);
            iMax2 = Math.max(iMax2, rectB.left);
            iMax3 = Math.max(iMax3, rectB.right);
        }
        boolean z = this.k1;
        int iMax4 = this.l;
        if (z) {
            iMax4 = Math.max(iMax4, (this.f1 * 2) + iMax2 + iMax3);
        }
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.A = iMax4;
        this.B = iMax5;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.o : this.q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:52:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f;
        VelocityTracker velocityTracker = this.x;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.u;
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked == 1) {
                if (this.t == 2) {
                    this.t = (byte) 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.y) {
                            boolean z2 = cmu0.f4626a;
                            targetCheckedState = getLayoutDirection() == 1 ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.t = (byte) 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                byte b = this.t;
                if (b == 1) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float f3 = i;
                    if (Math.abs(x - this.v) > f3 || Math.abs(y - this.w) > f3) {
                        this.t = (byte) 2;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.v = x;
                        this.w = y;
                        return true;
                    }
                } else if (b == 2) {
                    float x2 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f4 = x2 - this.v;
                    if (thumbScrollRange != 0) {
                        f = f4 / thumbScrollRange;
                    } else {
                        f = f4 > 0.0f ? 1.0f : -1.0f;
                    }
                    boolean z3 = cmu0.f4626a;
                    if (getLayoutDirection() == 1) {
                        f = -f;
                    }
                    float f5 = this.z;
                    float f6 = f + f5;
                    if (f6 >= 0.0f) {
                        f2 = f6 > 1.0f ? 1.0f : f6;
                    }
                    if (f2 != f5) {
                        this.v = x2;
                        setThumbPosition(f2);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.t == 2) {
                    this.t = (byte) 0;
                    if (motionEvent.getAction() == 1) {
                        z = false;
                    } else {
                        z = false;
                    }
                    zIsChecked = isChecked();
                    if (z) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) > this.y) {
                            boolean z4 = cmu0.f4626a;
                            if (getLayoutDirection() == 1) {
                            }
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.t = (byte) 0;
                velocityTracker.clear();
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.f45298a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f45298a;
                Rect rect = this.t1;
                drawable.getPadding(rect);
                int i2 = this.h1 - i;
                int i3 = (this.g1 + thumbOffset) - i;
                int i4 = this.f1 + i3 + rect.left + rect.right + i;
                int i5 = this.j1 + i;
                if (x3 > i3 && x3 < i4 && y2 > i2 && y2 < i5) {
                    this.t = (byte) 1;
                    this.v = x3;
                    this.w = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.o;
                if (string == null) {
                    string = getResources().getString(org.xbet.client1.R.string.abc_capital_on);
                }
                Object obj = string;
                WeakHashMap weakHashMap = rgu0.f30456a;
                new egu0(org.xbet.client1.R.id.tag_state_description, CharSequence.class, 64, 30, (byte) 2).a(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.q;
            if (string2 == null) {
                string2 = getResources().getString(org.xbet.client1.R.string.abc_capital_off);
            }
            Object obj2 = string2;
            WeakHashMap weakHashMap2 = rgu0.f30456a;
            new egu0(org.xbet.client1.R.id.tag_state_description, CharSequence.class, 64, 30, (byte) 2).a(this, obj2);
        }
        if (getWindowToken() == null || !isLaidOut()) {
            ObjectAnimator objectAnimator = this.q1;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, u1, zIsChecked ? 1.0f : 0.0f);
        this.q1 = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.q1.setAutoCancel(true);
        this.q1.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(aem0.A(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.o);
        setTextOffInternal(this.q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.k1 = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.s != z) {
            this.s = z;
            requestLayout();
            if (z) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.n = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.m = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.l1;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.q;
        if (string == null) {
            string = getResources().getString(org.xbet.client1.R.string.abc_capital_off);
        }
        WeakHashMap weakHashMap = rgu0.f30456a;
        new egu0(org.xbet.client1.R.id.tag_state_description, CharSequence.class, 64, 30, (byte) 2).a(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.o;
        if (string == null) {
            string = getResources().getString(org.xbet.client1.R.string.abc_capital_on);
        }
        WeakHashMap weakHashMap = rgu0.f30456a;
        new egu0(org.xbet.client1.R.id.tag_state_description, CharSequence.class, 64, 30, (byte) 2).a(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f45298a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f45298a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.z = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(epv0.U(i, getContext()));
    }

    public void setThumbTextPadding(int i) {
        this.k = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(epv0.U(i, getContext()));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        this.i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        this.j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f45298a || drawable == this.f;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, org.xbet.client1.R.attr.switchStyle);
    }

    public SwitchCompat(Context context) {
        this(context, null);
    }
}
