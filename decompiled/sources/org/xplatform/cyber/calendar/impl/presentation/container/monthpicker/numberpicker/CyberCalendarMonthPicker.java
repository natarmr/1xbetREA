package org.xplatform.cyber.calendar.impl.presentation.container.monthpicker.numberpicker;

import a.a8g;
import a.b8g;
import a.dy3;
import a.jf4;
import a.r7x;
import a.rw2;
import a.sac;
import a.twn;
import a.tx3;
import a.v8g;
import a.vpd0;
import a.vqd;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.LinearLayout;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class CyberCalendarMonthPicker extends LinearLayout {
    public static final /* synthetic */ int G1 = 0;
    public final v8g A;
    public int A1;
    public final v8g B;
    public int B1;
    public int C1;
    public Rect D1;
    public Rect E1;
    public Rect F1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46483a;
    public final EditText b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int f1;
    public final boolean g;
    public int g1;
    public final float h;
    public dy3 h1;
    public final int i;
    public float i1;
    public int j;
    public float j1;
    public int k;
    public float k1;
    public String[] l;
    public float l1;
    public int m;
    public VelocityTracker m1;
    public int n;
    public final int n1;
    public Function2 o;
    public final int o1;
    public int p;
    public final int p1;
    public final short q;
    public boolean q1;
    public final SparseArray r;
    public ColorDrawable r1;
    public int s;
    public int s1;
    public int t;
    public final int t1;
    public int[] u;
    public final int u1;
    public final TextPaint v;
    public byte v1;
    public final TextPaint w;
    public int w1;
    public int x;
    public int x1;
    public int y;
    public int y1;
    public int z;
    public int z1;

    /* JADX WARN: Illegal instructions before constructor call */
    public CyberCalendarMonthPicker(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet);
        this.f46483a = context;
        this.h = 1.0f;
        this.m = 1;
        this.n = 100;
        this.q = (short) 300;
        this.r = new SparseArray();
        this.s = 3;
        this.t = 1;
        this.u = new int[3];
        this.y = Integer.MIN_VALUE;
        this.B1 = -1;
        this.D1 = new Rect();
        this.E1 = new Rect();
        this.F1 = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vpd0.b, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        this.s1 = typedArrayObtainStyledAttributes.getColor(0, this.s1);
        this.t1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, (int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics()));
        this.u1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics()));
        this.C1 = 1;
        q();
        this.g = true;
        int color = typedArrayObtainStyledAttributes.getColor(6, -16777216);
        int color2 = typedArrayObtainStyledAttributes.getColor(4, this.i);
        this.i = color2;
        this.s = typedArrayObtainStyledAttributes.getInt(7, this.s);
        setWillNotDraw(false);
        Object systemService = context.getSystemService("layout_inflater");
        LayoutInflater layoutInflater = systemService instanceof LayoutInflater ? (LayoutInflater) systemService : null;
        if (layoutInflater != null) {
            layoutInflater.inflate(R.layout.cyber_calendar_month_picker_layout, (ViewGroup) this, true);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        View viewFindViewById = findViewById(R.id.numberpicker);
        viewFindViewById.getClass();
        EditText editText = (EditText) viewFindViewById;
        this.b = editText;
        editText.setTextColor(color2);
        TextPaint paint = editText.getPaint();
        paint.getClass();
        r7x.r(paint, context, resourceId);
        editText.setEnabled(false);
        editText.setFocusable(false);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        Paint.Align align = Paint.Align.CENTER;
        textPaint.setTextAlign(align);
        r7x.r(textPaint, context, resourceId);
        textPaint.setColor(color);
        this.v = textPaint;
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setAntiAlias(true);
        textPaint2.setTextAlign(align);
        r7x.r(textPaint2, context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        textPaint2.setColor(color2);
        this.w = textPaint2;
        s();
        setMaxValue(this.n);
        setMinValue(this.m);
        setDividerColor(this.s1);
        setWheelItemCount(this.s);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.n1 = viewConfiguration.getScaledTouchSlop();
        this.o1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.p1 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        this.A = new v8g(context, null);
        this.B = new v8g(context, new DecelerateInterpolator(2.5f));
        setImportantForAccessibility(1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static String f(int i) {
        return String.format(Locale.getDefault(), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }

    private final b8g getSupportAccessibilityNodeProvider() {
        b8g b8gVar = new b8g();
        b8gVar.f2154a = new a8g(this);
        return b8gVar;
    }

    public static int k(int i, int i2) {
        if (i2 != -1) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i2), 1073741824);
            }
            if (mode == 0) {
                return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
            }
            if (mode != 1073741824) {
                jf4.o(twn.m(mode, "Unknown measure mode: "));
                return 0;
            }
        }
        return i;
    }

    public static int p(int i, int i2, int i3) {
        if (i == -1) {
            return i2;
        }
        int iMax = Math.max(i, i2);
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? iMax : size;
        }
        return size < iMax ? 16777216 | size : iMax;
    }

    private final void setMValue(int i) {
        Function2 function2 = this.o;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(this.p), Integer.valueOf(i));
        }
        this.p = i;
    }

    private final void setValueInternal(int i) {
        if (this.p == i) {
            return;
        }
        setMValue(this.q1 ? g(i) : Math.min(Math.max(i, this.m), this.n));
        s();
        i();
        invalidate();
    }

    public final void a(boolean z) {
        this.b.setVisibility(4);
        v8g v8gVar = this.A;
        if (!l(v8gVar)) {
            l(this.B);
        }
        if (j()) {
            this.f1 = 0;
            int i = this.x;
            if (z) {
                v8gVar.b(-i, 0, 300);
            } else {
                v8gVar.b(i, 0, 300);
            }
        } else {
            this.g1 = 0;
            int i2 = this.x;
            if (z) {
                v8gVar.b(0, -i2, 300);
            } else {
                v8gVar.b(0, i2, 300);
            }
        }
        invalidate();
    }

    public final void b(Canvas canvas) {
        if (this.r1 != null) {
            boolean zJ = j();
            int i = this.u1;
            if (zJ) {
                int i2 = this.y1;
                int i3 = i2 + i;
                ColorDrawable colorDrawable = this.r1;
                if (colorDrawable != null) {
                    colorDrawable.setBounds(i2, 0, i3, getBottom());
                }
                ColorDrawable colorDrawable2 = this.r1;
                if (colorDrawable2 != null) {
                    colorDrawable2.draw(canvas);
                }
                int i4 = this.z1;
                int i5 = i4 - i;
                ColorDrawable colorDrawable3 = this.r1;
                if (colorDrawable3 != null) {
                    colorDrawable3.setBounds(i5, 0, i4, getBottom());
                }
                ColorDrawable colorDrawable4 = this.r1;
                if (colorDrawable4 != null) {
                    colorDrawable4.draw(canvas);
                    return;
                }
                return;
            }
            int i6 = this.w1;
            int i7 = i6 + i;
            ColorDrawable colorDrawable5 = this.r1;
            if (colorDrawable5 != null) {
                colorDrawable5.setBounds(0, i6, getRight(), i7);
            }
            ColorDrawable colorDrawable6 = this.r1;
            if (colorDrawable6 != null) {
                colorDrawable6.draw(canvas);
            }
            int i8 = this.x1;
            int i9 = i8 - i;
            ColorDrawable colorDrawable7 = this.r1;
            if (colorDrawable7 != null) {
                colorDrawable7.setBounds(0, i9, getRight(), i8);
            }
            ColorDrawable colorDrawable8 = this.r1;
            if (colorDrawable8 != null) {
                colorDrawable8.draw(canvas);
            }
        }
    }

    public final void c(int i) {
        String strF;
        SparseArray sparseArray = this.r;
        if (((String) sparseArray.get(i)) != null) {
            return;
        }
        int i2 = this.m;
        if (i < i2 || i > this.n) {
            strF = "";
        } else {
            String[] strArr = this.l;
            strF = strArr != null ? (String) tx3.G(i - i2, strArr) : f(i);
        }
        sparseArray.put(i, strF);
    }

    @Override // android.view.View
    public final void computeScroll() {
        v8g v8gVar;
        float fU0;
        v8g v8gVar2 = this.A;
        if (v8gVar2.p) {
            v8gVar = this.B;
            if (v8gVar.p) {
                return;
            }
        } else {
            v8gVar = v8gVar2;
        }
        if (!v8gVar.p) {
            int iCurrentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - v8gVar.k);
            int i = v8gVar.l;
            if (iCurrentAnimationTimeMillis < i) {
                boolean z = v8gVar.b;
                if (!z) {
                    float f = iCurrentAnimationTimeMillis * v8gVar.m;
                    Interpolator interpolator = v8gVar.f36980a;
                    if (interpolator != null) {
                        fU0 = interpolator.getInterpolation(f);
                    } else {
                        float f2 = v8g.t;
                        fU0 = sac.u0(f);
                    }
                    v8gVar.i = v8gVar.c + ((int) Math.rint(v8gVar.n * fU0));
                    v8gVar.j = v8gVar.d + ((int) Math.rint(fU0 * v8gVar.o));
                } else if (z) {
                    float f3 = iCurrentAnimationTimeMillis / i;
                    int i2 = (int) (100.0f * f3);
                    float f4 = i2 / 100.0f;
                    int i3 = i2 + 1;
                    float[] fArr = v8g.u;
                    float f5 = fArr[i2];
                    float fA = rw2.a(fArr[i3], f5, (f3 - f4) / ((i3 / 100.0f) - f4), f5);
                    int i4 = v8gVar.c;
                    int iRint = i4 + ((int) Math.rint((v8gVar.e - i4) * fA));
                    v8gVar.i = iRint;
                    int iMin = Math.min(iRint, v8gVar.g);
                    v8gVar.i = iMin;
                    v8gVar.i = Math.max(iMin, 0);
                    int i5 = v8gVar.d;
                    int iRint2 = i5 + ((int) Math.rint(fA * (v8gVar.f - i5)));
                    v8gVar.j = iRint2;
                    int iMin2 = Math.min(iRint2, v8gVar.h);
                    v8gVar.j = iMin2;
                    int iMax = Math.max(iMin2, 0);
                    v8gVar.j = iMax;
                    if (v8gVar.i == v8gVar.e && iMax == v8gVar.f) {
                        v8gVar.p = true;
                    }
                }
            } else {
                v8gVar.i = v8gVar.e;
                v8gVar.j = v8gVar.f;
                v8gVar.p = true;
            }
        }
        if (j()) {
            int i6 = v8gVar.i;
            int i7 = this.f1;
            if (i7 == 0) {
                i7 = v8gVar.c;
                this.f1 = i7;
            }
            scrollBy(i6 - i7, 0);
            this.f1 = i6;
        } else {
            int i8 = v8gVar.j;
            int i9 = this.g1;
            if (i9 == 0) {
                i9 = v8gVar.d;
                this.g1 = i9;
            }
            scrollBy(0, i8 - i9);
            this.g1 = i8;
        }
        if (!v8gVar.p) {
            invalidate();
            return;
        }
        if (v8gVar == v8gVar2) {
            if (!d()) {
                s();
            }
            m(0);
        } else if (this.v1 != 1) {
            s();
        }
    }

    public final boolean d() {
        int i = this.y - this.z;
        if (i == 0) {
            return false;
        }
        int iAbs = Math.abs(i);
        int i2 = this.x;
        if (iAbs > i2 / 2) {
            if (i > 0) {
                i2 = -i2;
            }
            i += i2;
        }
        boolean zJ = j();
        v8g v8gVar = this.B;
        if (zJ) {
            this.f1 = 0;
            v8gVar.b(i, 0, 800);
        } else {
            this.g1 = 0;
            v8gVar.b(0, i, 800);
        }
        invalidate();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        Object systemService = this.f46483a.getSystemService("accessibility");
        systemService.getClass();
        if (!((AccessibilityManager) systemService).isEnabled()) {
            return false;
        }
        int i = 2;
        if (j()) {
            int x = (int) motionEvent.getX();
            if (x < this.y1) {
                i = 3;
            } else if (x > this.z1) {
                i = 1;
            }
        } else {
            int y = (int) motionEvent.getY();
            if (y < this.w1) {
                i = 3;
            } else if (y > this.x1) {
                i = 1;
            }
        }
        int action = motionEvent.getAction() & 255;
        b8g supportAccessibilityNodeProvider = getSupportAccessibilityNodeProvider();
        if (action != 7) {
            if (action == 9) {
                supportAccessibilityNodeProvider.f2154a.f(i, 128);
                this.A1 = i;
                supportAccessibilityNodeProvider.f2154a.performAction(i, 64, null);
                return false;
            }
            if (action != 10) {
                return false;
            }
            supportAccessibilityNodeProvider.f2154a.f(i, 256);
            this.A1 = -1;
            return false;
        }
        int i2 = this.A1;
        if (i2 == i || i2 == -1) {
            return false;
        }
        a8g a8gVar = supportAccessibilityNodeProvider.f2154a;
        a8g a8gVar2 = supportAccessibilityNodeProvider.f2154a;
        a8gVar.f(i2, 256);
        a8gVar2.f(i, 128);
        this.A1 = i;
        a8gVar2.performAction(i, 64, null);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        requestFocus();
        r5.B1 = r6.getKeyCode();
        o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        if (r5.A.p == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006b, code lost:
    
        if (r6.getKeyCode() != 20) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        a(r3);
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            r6.getClass()
            int r0 = r6.getKeyCode()
            r1 = 19
            r2 = 20
            if (r0 == r1) goto L1d
            if (r0 == r2) goto L1d
            r1 = 23
            if (r0 == r1) goto L19
            r1 = 66
            if (r0 == r1) goto L19
            goto L7d
        L19:
            r5.o()
            goto L7d
        L1d:
            int r0 = r6.getAction()
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L35
            if (r0 == r1) goto L28
            goto L72
        L28:
            int r0 = r5.B1
            int r2 = r6.getKeyCode()
            if (r0 != r2) goto L72
            r0 = -1
            r5.B1 = r0
        L33:
            r3 = r1
            goto L72
        L35:
            boolean r0 = r5.q1
            if (r0 != 0) goto L4b
            int r0 = r6.getKeyCode()
            if (r0 != r2) goto L40
            goto L4b
        L40:
            int r0 = r5.getValue()
            int r4 = r5.getMinValue()
            if (r0 <= r4) goto L72
            goto L55
        L4b:
            int r0 = r5.getValue()
            int r4 = r5.getMaxValue()
            if (r0 >= r4) goto L72
        L55:
            r5.requestFocus()
            int r0 = r6.getKeyCode()
            r5.B1 = r0
            r5.o()
            a.v8g r0 = r5.A
            boolean r0 = r0.p
            if (r0 == 0) goto L33
            int r0 = r6.getKeyCode()
            if (r0 != r2) goto L6e
            r3 = r1
        L6e:
            r5.a(r3)
            goto L33
        L72:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            if (r3 == 0) goto L79
            goto L7a
        L79:
            r0 = 0
        L7a:
            if (r0 == 0) goto L7d
            return r1
        L7d:
            boolean r5 = super.dispatchKeyEvent(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.xplatform.cyber.calendar.impl.presentation.container.monthpicker.numberpicker.CyberCalendarMonthPicker.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            o();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int action = motionEvent.getAction() & 255;
        if (action == 1 || action == 3) {
            o();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    public final void e(int i) {
        if (j()) {
            this.f1 = 0;
            v8g v8gVar = this.A;
            if (i > 0) {
                v8gVar.a(0, 0, i, 0, Integer.MAX_VALUE, 0);
            } else {
                v8gVar.a(Integer.MAX_VALUE, 0, i, 0, Integer.MAX_VALUE, 0);
            }
        } else {
            this.g1 = 0;
            v8g v8gVar2 = this.A;
            if (i > 0) {
                v8gVar2.a(0, 0, 0, i, 0, Integer.MAX_VALUE);
            } else {
                v8gVar2.a(0, Integer.MAX_VALUE, 0, i, 0, Integer.MAX_VALUE);
            }
        }
        invalidate();
    }

    public final int g(int i) {
        int i2 = this.n;
        int i3 = this.m;
        if (i > i2) {
            return (((i - i2) % (i2 - i3)) + i3) - 1;
        }
        return i < i3 ? (i2 - ((i3 - i) % (i2 - i3))) + 1 : i;
    }

    @Override // android.view.View
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        return new a8g(this);
    }

    public final String[] getDisplayedValues() {
        return this.l;
    }

    public final int getMaxValue() {
        return this.n;
    }

    public final int getMinValue() {
        return this.m;
    }

    public final int getValue() {
        return this.p;
    }

    public final boolean getWrapSelectorWheel() {
        return this.q1;
    }

    public final void h() {
        int baseline;
        float f;
        i();
        int[] iArr = this.u;
        int length = iArr.length;
        int i = (int) this.h;
        int i2 = length * i;
        float length2 = iArr.length;
        float f2 = 1.0f;
        float f3 = this.f46483a.getResources().getDisplayMetrics().densityDpi > 500 ? 1.2f : 1.0f;
        String[] strArr = this.l;
        if (strArr != null && strArr.length != 0) {
            if (strArr[strArr.length - 1].length() > 12) {
                f = 2.0f;
            } else if (strArr[strArr.length - 1].length() > 11) {
                f = 1.8f;
            } else if (strArr[strArr.length - 1].length() > 10) {
                f = 1.6f;
            } else if (strArr[strArr.length - 1].length() > 8) {
                f = 1.3f;
            }
            f2 = f3 * f;
        }
        boolean zJ = j();
        EditText editText = this.b;
        if (zJ) {
            int right = (int) (((((getRight() - getLeft()) - i2) * f2) / length2) + 0.5f);
            this.j = right;
            this.x = i + right;
            baseline = editText.getRight() / 2;
        } else {
            int bottom = (int) ((((getBottom() - getTop()) - i2) / length2) + 0.5f);
            this.k = bottom;
            this.x = i + bottom;
            baseline = editText.getBaseline() + editText.getTop();
        }
        int i3 = baseline - (this.x * this.t);
        this.y = i3;
        this.z = i3;
        s();
    }

    public final void i() {
        this.r.clear();
        int[] iArr = this.u;
        int value = getValue();
        int length = this.u.length;
        for (int i = 0; i < length; i++) {
            int iG = (i - this.t) + value;
            if (this.q1) {
                iG = g(iG);
            }
            iArr[i] = iG;
            c(iG);
        }
    }

    public final boolean j() {
        return this.C1 == 0;
    }

    public final boolean l(v8g v8gVar) {
        boolean z = true;
        v8gVar.p = true;
        Boolean bool = null;
        if (j()) {
            int i = v8gVar.e - v8gVar.i;
            int i2 = this.y - ((this.z + i) % this.x);
            if (i2 != 0) {
                int iAbs = Math.abs(i2);
                int i3 = this.x;
                if (iAbs > i3 / 2) {
                    i2 = i2 > 0 ? i2 - i3 : i2 + i3;
                }
                scrollBy(i + i2, 0);
            } else {
                z = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            if (!z) {
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                bool = Boolean.TRUE;
            }
        } else {
            int i4 = v8gVar.f - v8gVar.j;
            int i5 = this.y - ((this.z + i4) % this.x);
            if (i5 != 0) {
                int iAbs2 = Math.abs(i5);
                int i6 = this.x;
                if (iAbs2 > i6 / 2) {
                    i5 = i5 > 0 ? i5 - i6 : i5 + i6;
                }
                scrollBy(0, i4 + i5);
            } else {
                z = false;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z);
            if (!z) {
                boolValueOf2 = null;
            }
            if (boolValueOf2 != null) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(int i) {
        if (this.v1 == i) {
            return;
        }
        this.v1 = i;
    }

    public final void n(boolean z, long j) {
        Runnable runnable = this.h1;
        if (runnable == null) {
            this.h1 = new dy3((ViewGroup) this, (byte) 1);
        } else {
            removeCallbacks(runnable);
        }
        dy3 dy3Var = this.h1;
        if (dy3Var != null) {
            dy3Var.b = z;
        }
        postDelayed(dy3Var, j);
    }

    public final void o() {
        dy3 dy3Var = this.h1;
        if (dy3Var != null) {
            removeCallbacks(dy3Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        float right;
        int top;
        int iKeyAt;
        String str;
        int i;
        int i2;
        boolean zJ;
        int i3;
        String str2;
        canvas.getClass();
        SparseArray sparseArray = this.r;
        if (j()) {
            right = this.z;
            EditText editText = this.b;
            top = editText.getTop() + editText.getBaseline();
        } else {
            right = (getRight() - getLeft()) / 2;
            top = this.z;
        }
        float f = top;
        TextPaint textPaint = this.w;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int i4 = (int) ((fontMetrics.bottom - fontMetrics.top) / 2.0f);
        int iKeyAt2 = -1;
        int i5 = 0;
        try {
            iKeyAt = sparseArray.keyAt(0);
        } catch (Exception unused) {
            iKeyAt = -1;
        }
        try {
            iKeyAt2 = sparseArray.keyAt(4);
        } catch (Exception unused2) {
        }
        int[] iArr = this.u;
        String[] strArr = this.l;
        String str3 = "";
        if (strArr == null || (str = (String) tx3.G(iKeyAt - 1, strArr)) == null) {
            str = "";
        }
        String[] strArr2 = this.l;
        if (strArr2 != null && (str2 = (String) tx3.G(iKeyAt2 + 1, strArr2)) != null) {
            str3 = str2;
        }
        float f2 = f - this.x;
        TextPaint textPaint2 = this.v;
        canvas.drawText(str, right, f2, textPaint2);
        int length = iArr.length;
        while (i5 < length) {
            String str4 = (String) sparseArray.get(iArr[i5]);
            int i6 = (int) right;
            int i7 = (int) f;
            SparseArray sparseArray2 = sparseArray;
            int i8 = i7 + i4;
            if (this.D1.contains(i6, i8)) {
                i = i4;
            } else {
                i = i4;
                if (this.D1.contains(i6, i7 - i)) {
                }
                i2 = i7 - i;
                if (this.E1.contains(i6, i2) || this.E1.contains(i6, i8)) {
                    canvas.save();
                    canvas.clipRect(this.E1);
                    canvas.drawText(str4, right, f, textPaint2);
                    canvas.restore();
                }
                if (this.F1.contains(i6, i8) || this.F1.contains(i6, i2)) {
                    canvas.save();
                    canvas.clipRect(this.F1);
                    canvas.drawText(str4, right, f, textPaint);
                    canvas.restore();
                }
                zJ = j();
                i3 = this.x;
                if (zJ) {
                    right += i3;
                } else {
                    f += i3;
                }
                i5++;
                sparseArray = sparseArray2;
                i4 = i;
            }
            canvas.save();
            canvas.clipRect(this.D1);
            canvas.drawText(str4, right, f, textPaint2);
            canvas.restore();
            i2 = i7 - i;
            if (this.E1.contains(i6, i2)) {
                canvas.save();
                canvas.clipRect(this.E1);
                canvas.drawText(str4, right, f, textPaint2);
                canvas.restore();
            } else {
                canvas.save();
                canvas.clipRect(this.E1);
                canvas.drawText(str4, right, f, textPaint2);
                canvas.restore();
            }
            if (this.F1.contains(i6, i8)) {
                canvas.save();
                canvas.clipRect(this.F1);
                canvas.drawText(str4, right, f, textPaint);
                canvas.restore();
            } else {
                canvas.save();
                canvas.clipRect(this.F1);
                canvas.drawText(str4, right, f, textPaint);
                canvas.restore();
            }
            zJ = j();
            i3 = this.x;
            if (zJ) {
                right += i3;
            } else {
                f += i3;
            }
            i5++;
            sparseArray = sparseArray2;
            i4 = i;
        }
        canvas.drawText(str3, right, f, textPaint2);
        b(canvas);
        b(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.getClass();
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("org.xplatform.cyber.calendar.impl.presentation.container.monthpicker.numberpicker.CyberCalendarMonthPicker");
        accessibilityEvent.setScrollable(true);
        int i = this.m;
        int i2 = this.p + i;
        int i3 = this.x;
        int i4 = i2 * i3;
        int i5 = (this.n - i) * i3;
        if (j()) {
            accessibilityEvent.setScrollX(i4);
            accessibilityEvent.setMaxScrollX(i5);
        } else {
            accessibilityEvent.setScrollY(i4);
            accessibilityEvent.setMaxScrollY(i5);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (!isEnabled() || (motionEvent.getAction() & 255) != 0) {
            return false;
        }
        o();
        this.b.setVisibility(4);
        boolean zJ = j();
        v8g v8gVar = this.A;
        v8g v8gVar2 = this.B;
        if (zJ) {
            float x = motionEvent.getX();
            this.i1 = x;
            this.k1 = x;
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!v8gVar.p) {
                v8gVar.p = true;
                v8gVar2.p = true;
                m(0);
                return true;
            }
            if (!v8gVar2.p) {
                v8gVar.p = true;
                v8gVar2.p = true;
                return true;
            }
            float f = this.i1;
            if (f < this.y1) {
                n(false, ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (f > this.z1) {
                n(true, ViewConfiguration.getLongPressTimeout());
                return true;
            }
        } else {
            float y = motionEvent.getY();
            this.j1 = y;
            this.l1 = y;
            getParent().requestDisallowInterceptTouchEvent(true);
            if (!v8gVar.p) {
                v8gVar.p = true;
                v8gVar2.p = true;
                m(0);
                return true;
            }
            if (!v8gVar2.p) {
                v8gVar.p = true;
                v8gVar2.p = true;
                return true;
            }
            float f2 = this.j1;
            if (f2 < this.w1) {
                n(false, ViewConfiguration.getLongPressTimeout());
                return true;
            }
            if (f2 > this.x1) {
                n(true, ViewConfiguration.getLongPressTimeout());
            }
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EditText editText = this.b;
        int measuredWidth = editText.getMeasuredWidth();
        int measuredHeight = editText.getMeasuredHeight();
        int measuredWidth2 = (getMeasuredWidth() - measuredWidth) / 2;
        int measuredHeight2 = (getMeasuredHeight() - measuredHeight) / 2;
        editText.layout(measuredWidth2, measuredHeight2, measuredWidth + measuredWidth2, measuredHeight + measuredHeight2);
        if (z) {
            h();
            boolean zJ = j();
            int i5 = this.u1;
            int i6 = this.t1;
            if (zJ) {
                int width = ((getWidth() - i6) / 2) - i5;
                this.y1 = width;
                this.z1 = vqd.a(i5, 2, width, i6);
            } else {
                int height = ((getHeight() - i6) / 2) - i5;
                this.w1 = height;
                this.x1 = vqd.a(i5, 2, height, i6);
            }
        }
        this.D1 = new Rect(0, i2, i3, this.w1);
        this.E1 = new Rect(0, this.x1, i3, i4);
        this.F1 = new Rect(0, this.w1, i3, this.x1);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(k(i, this.f), k(i2, this.d));
        setMeasuredDimension(p(this.e, getMeasuredWidth(), i), p(this.c, getMeasuredHeight(), i2));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        if (!isEnabled()) {
            return false;
        }
        VelocityTracker velocityTrackerObtain = this.m1;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.m1 = velocityTrackerObtain;
        }
        if (velocityTrackerObtain != null) {
            velocityTrackerObtain.addMovement(motionEvent);
        }
        int action = motionEvent.getAction() & 255;
        int i = this.n1;
        if (action != 1) {
            if (action != 2) {
                return true;
            }
            if (j()) {
                float x = motionEvent.getX();
                if (this.v1 == 1) {
                    scrollBy((int) (x - this.k1), 0);
                    invalidate();
                } else if (((int) Math.abs(x - this.i1)) > i) {
                    o();
                    m(1);
                }
                this.k1 = x;
                return true;
            }
            float y = motionEvent.getY();
            if (this.v1 == 1) {
                scrollBy(0, (int) (y - this.l1));
                invalidate();
            } else if (((int) Math.abs(y - this.j1)) > i) {
                o();
                m(1);
            }
            this.l1 = y;
            return true;
        }
        dy3 dy3Var = this.h1;
        if (dy3Var != null) {
            removeCallbacks(dy3Var);
        }
        VelocityTracker velocityTracker = this.m1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.p1);
        }
        boolean zJ = j();
        int i2 = this.o1;
        if (zJ) {
            int xVelocity = velocityTracker != null ? (int) velocityTracker.getXVelocity() : 0;
            if (Math.abs(xVelocity) > i2) {
                e(xVelocity);
                m(2);
            } else {
                int x2 = (int) motionEvent.getX();
                if (((int) Math.abs(x2 - this.i1)) <= i) {
                    int i3 = (x2 / this.x) - this.t;
                    if (i3 > 0) {
                        a(true);
                    } else if (i3 < 0) {
                        a(false);
                    } else {
                        d();
                    }
                } else {
                    d();
                }
                m(0);
            }
        } else {
            int yVelocity = velocityTracker != null ? (int) velocityTracker.getYVelocity() : 0;
            if (Math.abs(yVelocity) > i2) {
                e(yVelocity);
                m(2);
            } else {
                int y2 = (int) motionEvent.getY();
                if (((int) Math.abs(y2 - this.j1)) <= i) {
                    int i4 = (y2 / this.x) - this.t;
                    if (i4 > 0) {
                        a(true);
                    } else if (i4 < 0) {
                        a(false);
                    } else {
                        d();
                    }
                } else {
                    d();
                }
                m(0);
            }
        }
        VelocityTracker velocityTracker2 = this.m1;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
        }
        this.m1 = null;
        return true;
    }

    public final void q() {
        if (j()) {
            this.c = -1;
            this.d = (int) (64.0f * getResources().getDisplayMetrics().density);
            this.e = (int) (180.0f * getResources().getDisplayMetrics().density);
            this.f = -1;
            return;
        }
        this.c = -1;
        this.d = (int) (180.0f * getResources().getDisplayMetrics().density);
        this.e = (int) (64.0f * getResources().getDisplayMetrics().density);
        this.f = -1;
    }

    public final void r() {
        int i;
        String str;
        if (this.g) {
            String[] strArr = this.l;
            TextPaint textPaint = this.v;
            int i2 = 0;
            if (strArr == null) {
                float f = 0.0f;
                for (int i3 = 0; i3 < 10; i3++) {
                    float fMeasureText = textPaint.measureText(f(i3));
                    if (fMeasureText > f) {
                        f = fMeasureText;
                    }
                }
                for (int i4 = this.n; i4 > 0; i4 /= 10) {
                    i2++;
                }
                i = (int) (i2 * f);
            } else {
                int length = strArr.length;
                int i5 = 0;
                while (i2 < length) {
                    String[] strArr2 = this.l;
                    if (strArr2 == null || (str = (String) tx3.G(i2, strArr2)) == null) {
                        str = "";
                    }
                    float fMeasureText2 = textPaint.measureText(str);
                    if (fMeasureText2 > i5) {
                        i5 = (int) fMeasureText2;
                    }
                    i2++;
                }
                i = i5;
            }
            EditText editText = this.b;
            int paddingRight = editText.getPaddingRight() + editText.getPaddingLeft() + i;
            if (this.f != paddingRight) {
                int i6 = this.e;
                if (paddingRight <= i6) {
                    paddingRight = i6;
                }
                this.f = paddingRight;
                invalidate();
            }
        }
    }

    public final void s() {
        String strF;
        String[] strArr = this.l;
        int i = this.p;
        if (strArr == null) {
            strF = f(i);
        } else {
            strF = (String) tx3.G(i - this.m, strArr);
            if (strF == null) {
                strF = "";
            }
        }
        if (strF.length() > 0) {
            EditText editText = this.b;
            if (strF.equals(editText.getText().toString())) {
                return;
            }
            editText.setText(strF);
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        int i3;
        int[] iArr = this.u;
        boolean zJ = j();
        boolean z = this.q1;
        if (zJ) {
            if (!z && i > 0 && iArr[this.t] <= this.m) {
                this.z = this.y;
                return;
            } else if (!z && i < 0 && iArr[this.t] >= this.n) {
                this.z = this.y;
                return;
            } else {
                this.z += i;
                i3 = this.j;
            }
        } else if (!z && i2 > 0 && iArr[this.t] <= this.m) {
            this.z = this.y;
            return;
        } else if (!z && i2 < 0 && iArr[this.t] >= this.n) {
            this.z = this.y;
            return;
        } else {
            this.z += i2;
            i3 = this.k;
        }
        while (true) {
            int i4 = this.z;
            if (i4 - this.y <= i3) {
                break;
            }
            this.z = i4 - this.x;
            for (int length = iArr.length - 1; length > 0; length--) {
                iArr[length] = iArr[length - 1];
            }
            int i5 = iArr[1] - 1;
            if (this.q1 && i5 < this.m) {
                i5 = this.n;
            }
            iArr[0] = i5;
            c(i5);
            setValueInternal(iArr[this.t]);
            if (!this.q1 && iArr[this.t] <= this.m) {
                this.z = this.y;
            }
        }
        while (true) {
            int i6 = this.z;
            if (i6 - this.y >= (-i3)) {
                return;
            }
            this.z = i6 + this.x;
            int length2 = iArr.length - 1;
            int i7 = 0;
            while (i7 < length2) {
                int i8 = i7 + 1;
                iArr[i7] = iArr[i8];
                i7 = i8;
            }
            int i9 = iArr[iArr.length - 2] + 1;
            if (this.q1 && i9 > this.n) {
                i9 = this.m;
            }
            iArr[iArr.length - 1] = i9;
            c(i9);
            setValueInternal(iArr[this.t]);
            if (!this.q1 && iArr[this.t] >= this.n) {
                this.z = this.y;
            }
        }
    }

    public final void setDisplayedValues(String[] strArr) {
        String[] strArr2 = this.l;
        if (strArr2 == null || !strArr2.equals(strArr)) {
            this.l = strArr;
            EditText editText = this.b;
            if (strArr != null) {
                editText.setRawInputType(524289);
            } else {
                editText.setRawInputType(2);
            }
            s();
            i();
            h();
            r();
        }
    }

    public final void setDividerColor(int i) {
        this.s1 = i;
        this.r1 = new ColorDrawable(i);
    }

    public final void setMaxValue(int i) {
        if (i < 0) {
            jf4.o("maxValue must be >= 0");
            return;
        }
        this.n = i;
        if (i < this.p) {
            setMValue(i);
        }
        setWrapSelectorWheel(this.n - this.m > this.u.length);
        i();
        s();
        r();
        invalidate();
    }

    public final void setMinValue(int i) {
        this.m = i;
        if (i > this.p) {
            setMValue(i);
        }
        setWrapSelectorWheel(this.n - this.m > this.u.length);
        i();
        s();
        r();
        invalidate();
    }

    public final void setOnValueChangedListener(Function2<? super Integer, ? super Integer, Unit> function2) {
        function2.getClass();
        this.o = function2;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        this.C1 = i;
        q();
    }

    public final void setValue(int i) {
        setValueInternal(i);
    }

    public final void setWheelItemCount(int i) {
        this.s = i;
        this.t = i / 2;
        this.u = new int[i];
    }

    public final void setWrapSelectorWheel(boolean z) {
        boolean z2 = this.n - this.m >= this.u.length;
        if ((!z || z2) && z != this.q1) {
            this.q1 = z;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarMonthPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CyberCalendarMonthPicker(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
