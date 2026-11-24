package org.xplatform.uikit.components.timer;

import a.bqd0;
import a.k7n;
import a.ktt0;
import a.l7n;
import a.ltn;
import a.m7n;
import a.mx2;
import a.n7n;
import a.ndm;
import a.o7n;
import a.p7n;
import a.r7x;
import a.rgg0;
import a.t9f;
import a.unq0;
import a.xdx;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public class DsTimer extends View {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p7n f47278a;
    public unq0 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final Handler g;
    public long h;
    public boolean i;
    public l7n j;
    public long k;
    public boolean l;
    public StaticLayout m;
    public final int n;
    public final int o;
    public final int p;
    public final float q;
    public final int r;
    public final TextPaint s;
    public final SpannableString t;
    public Integer u;
    public Integer v;
    public final mx2 w;
    public Function0 x;
    public boolean y;
    public boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsTimer(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.timerStyle);
        unq0 unq0Var = unq0.f35976a;
        this.b = unq0Var;
        this.g = new Handler(Looper.getMainLooper());
        this.h = 1000L;
        l7n l7nVar = l7n.f19567a;
        this.j = l7nVar;
        this.o = context.getResources().getDimensionPixelSize(R.dimen.space_2);
        this.p = context.getResources().getDimensionPixelSize(R.dimen.space_4);
        this.q = context.getResources().getDimensionPixelSize(R.dimen.radius_6);
        this.r = context.getResources().getDimensionPixelSize(R.dimen.size_18);
        TextPaint textPaint = new TextPaint(1);
        this.s = textPaint;
        this.t = getSpannedSeparator();
        this.w = new mx2(this, (byte) 9);
        this.x = new ndm((byte) 27);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.t0, R.attr.timerStyle, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(typedArrayObtainStyledAttributes.getResourceId(5, 0), bqd0.s0);
        ColorStateList colorStateListM = ktt0.m(2, context, typedArrayObtainStyledAttributes2);
        if (colorStateListM != null) {
            textPaint.setColor(colorStateListM.getDefaultColor());
        }
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        if (resourceId > 0) {
            r7x.q(textPaint, context, resourceId);
        }
        typedArrayObtainStyledAttributes2.recycle();
        this.n = typedArrayObtainStyledAttributes.getColor(0, 0);
        unq0 unq0Var2 = (unq0) CollectionsKt.W(typedArrayObtainStyledAttributes.getInt(8, 0), unq0.e);
        setTimerType(unq0Var2 != null ? unq0Var2 : unq0Var);
        l7n l7nVar2 = (l7n) CollectionsKt.W(typedArrayObtainStyledAttributes.getInt(6, 0), l7n.d);
        setTimeDirection(l7nVar2 != null ? l7nVar2 : l7nVar);
        this.c = typedArrayObtainStyledAttributes.getInt(2, this.c);
        this.d = typedArrayObtainStyledAttributes.getInt(1, this.d);
        this.e = typedArrayObtainStyledAttributes.getInt(3, this.e);
        this.f = typedArrayObtainStyledAttributes.getInt(4, this.f);
        typedArrayObtainStyledAttributes.recycle();
        this.f47278a = getCurrentTimerState();
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint) {
        return xdx.I(charSequence, textPaint, (int) (Layout.getDesiredWidth(charSequence, textPaint) + 1.0f), 1, null, 0, null, 3824);
    }

    private final p7n getCurrentTimerState() {
        int iOrdinal = ((this.b != unq0.b || this.k <= getStandardTimerLimitMs()) ? this.b : unq0.c).ordinal();
        if (iOrdinal == 0) {
            return m7n.f21328a;
        }
        if (iOrdinal == 1) {
            return n7n.f23050a;
        }
        if (iOrdinal == 2) {
            return o7n.f24793a;
        }
        t9f.b();
        return null;
    }

    private final SpannableString getSpannedSeparator() {
        SpannableString spannableString = new SpannableString(" : ");
        spannableString.setSpan(new ltn((byte) 1), 0, spannableString.length(), 33);
        return spannableString;
    }

    private final long getStandardTimerLimitMs() {
        return TimeUnit.SECONDS.toMillis(this.f) + TimeUnit.MINUTES.toMillis(this.c);
    }

    private final CharSequence getTimeForMeasure() {
        k7n k7nVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int iOrdinal = ((this.b != unq0.b || this.k <= getStandardTimerLimitMs()) ? this.b : unq0.c).ordinal();
        SpannableString spannableString = this.t;
        String str = "00";
        if (iOrdinal == 0) {
            k7n k7nVar2 = k7n.f17831a;
            spannableStringBuilder.append((CharSequence) b("00", k7nVar2));
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) b("00", k7nVar2));
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) b("00", k7nVar2));
            return spannableStringBuilder;
        }
        if (iOrdinal == 1) {
            k7n k7nVar3 = k7n.f17831a;
            spannableStringBuilder.append((CharSequence) b("00", k7nVar3));
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) b("00", k7nVar3));
            return spannableStringBuilder;
        }
        if (iOrdinal != 2) {
            t9f.b();
            return null;
        }
        if (this.k / 60000 > this.c) {
            k7nVar = k7n.b;
            str = "000";
        } else {
            k7nVar = k7n.f17831a;
        }
        spannableStringBuilder.append((CharSequence) b(str, k7nVar));
        spannableStringBuilder.append((CharSequence) spannableString);
        spannableStringBuilder.append((CharSequence) b(str, k7nVar));
        return spannableStringBuilder;
    }

    public final int a(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new rgg0(this.o, this.p, Float.valueOf(this.q)), 0, spannableString.length(), 33);
        return c(spannableString, this.s).getWidth();
    }

    public final SpannableString b(String str, k7n k7nVar) {
        int iA;
        SpannableString spannableString = new SpannableString(str);
        int iOrdinal = k7nVar.ordinal();
        if (iOrdinal == 0) {
            Integer num = this.u;
            if (num != null) {
                iA = num.intValue();
            } else {
                iA = a("00");
                this.u = Integer.valueOf(iA);
            }
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            Integer num2 = this.v;
            if (num2 != null) {
                iA = num2.intValue();
            } else {
                iA = a("000");
                this.v = Integer.valueOf(iA);
            }
        }
        spannableString.setSpan(new rgg0(this.n, Float.valueOf(this.q), iA, this.o), 0, spannableString.length(), 33);
        return spannableString;
    }

    public final void d() {
        this.l = true;
        e();
        Handler handler = this.g;
        mx2 mx2Var = this.w;
        handler.removeCallbacks(mx2Var);
        handler.postDelayed(mx2Var, this.h);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    public final boolean e() {
        long j;
        boolean z;
        int iOrdinal = this.j.ordinal();
        if (iOrdinal == 0) {
            j = this.k - this.h;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return false;
            }
            j = this.k + this.h;
        }
        if (this.b == unq0.c) {
            int iOrdinal2 = this.j.ordinal();
            int i = this.c;
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    t9f.b();
                    return false;
                }
                if (j / 60000 <= i || this.z) {
                    z = false;
                } else {
                    z = true;
                }
            } else if (j / 60000 > i || this.z) {
                z = false;
            } else {
                z = true;
            }
            this.y = z;
            if (z) {
                this.z = true;
            }
        }
        if (j < 0) {
            if (this.i) {
                setVisibility(8);
            }
            this.x.invoke();
            j = 0;
        }
        setTime(j);
        return j > 0;
    }

    public final boolean getHideAfterFinishedState() {
        return this.i;
    }

    public final Function0<Unit> getOnTimerFinished() {
        return this.x;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l) {
            d();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g.removeCallbacks(this.w);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        StaticLayout staticLayout = this.m;
        if (staticLayout != null) {
            float width = (getWidth() - staticLayout.getWidth()) / 2.0f;
            float height = (this.r - staticLayout.getHeight()) / 2.0f;
            int iSave = canvas.save();
            canvas.translate(width, height);
            try {
                staticLayout.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        StaticLayout staticLayoutC = c(getTimeForMeasure(), this.s);
        Integer numValueOf = Integer.valueOf(staticLayoutC.getWidth());
        staticLayoutC.getHeight();
        setMeasuredDimension(numValueOf.intValue(), this.r);
    }

    public final void setHideAfterFinished(boolean z) {
        this.i = z;
    }

    public final void setOnTimerFinished(Function0<Unit> function0) {
        function0.getClass();
        this.x = function0;
    }

    public final void setTime(long j) {
        SpannableStringBuilder spannableStringBuilder;
        unq0 unq0Var = this.b;
        unq0 unq0Var2 = unq0.b;
        if (unq0Var == unq0Var2 && j > getStandardTimerLimitMs()) {
            this.b = unq0.c;
        }
        this.k = j;
        int iOrdinal = ((this.b != unq0Var2 || j <= getStandardTimerLimitMs()) ? this.b : unq0.c).ordinal();
        int i = this.f;
        SpannableString spannableString = this.t;
        int i2 = this.c;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        if (iOrdinal == 0) {
            spannableStringBuilder = new SpannableStringBuilder();
            long j2 = j / 3600000;
            long j3 = this.d;
            boolean z = j2 > j3;
            if (z) {
                j2 = j3;
            }
            long millis = j - TimeUnit.HOURS.toMillis(j2);
            String strValueOf = String.valueOf(j2);
            if (strValueOf.length() == 1) {
                strValueOf = "0".concat(strValueOf);
            }
            k7n k7nVar = k7n.f17831a;
            spannableStringBuilder.append((CharSequence) b(strValueOf, k7nVar));
            spannableStringBuilder.append((CharSequence) spannableString);
            long j4 = z ? i2 : millis / 60000;
            long millis2 = millis - timeUnit.toMillis(j4);
            String strValueOf2 = String.valueOf(j4);
            if (strValueOf2.length() == 1) {
                strValueOf2 = "0".concat(strValueOf2);
            }
            spannableStringBuilder.append((CharSequence) b(strValueOf2, k7nVar));
            spannableStringBuilder.append((CharSequence) spannableString);
            String strValueOf3 = String.valueOf(z ? i : millis2 / 1000);
            if (strValueOf3.length() == 1) {
                strValueOf3 = "0".concat(strValueOf3);
            }
            spannableStringBuilder.append((CharSequence) b(strValueOf3, k7nVar));
        } else if (iOrdinal == 1) {
            spannableStringBuilder = new SpannableStringBuilder();
            long j5 = j / 60000;
            long j6 = i2;
            boolean z2 = j5 > j6;
            if (z2) {
                j5 = j6;
            }
            long millis3 = j - timeUnit.toMillis(j5);
            String strValueOf4 = String.valueOf(j5);
            if (strValueOf4.length() == 1) {
                strValueOf4 = "0".concat(strValueOf4);
            }
            k7n k7nVar2 = k7n.f17831a;
            spannableStringBuilder.append((CharSequence) b(strValueOf4, k7nVar2));
            spannableStringBuilder.append((CharSequence) spannableString);
            String strValueOf5 = String.valueOf(z2 ? i : millis3 / 1000);
            if (strValueOf5.length() == 1) {
                strValueOf5 = "0".concat(strValueOf5);
            }
            spannableStringBuilder.append((CharSequence) b(strValueOf5, k7nVar2));
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            spannableStringBuilder = new SpannableStringBuilder();
            long j7 = j / 60000;
            long j8 = this.e;
            boolean z3 = j7 > j8;
            if (z3) {
                j7 = j8;
            }
            long millis4 = j - timeUnit.toMillis(j7);
            String strValueOf6 = String.valueOf(j7);
            if (strValueOf6.length() == 1) {
                strValueOf6 = "0".concat(strValueOf6);
            }
            k7n k7nVar3 = j7 > ((long) i2) ? k7n.b : k7n.f17831a;
            spannableStringBuilder.append((CharSequence) b(strValueOf6, k7nVar3));
            spannableStringBuilder.append((CharSequence) spannableString);
            String strValueOf7 = String.valueOf(z3 ? i : millis4 / 1000);
            if (strValueOf7.length() == 1) {
                strValueOf7 = "0".concat(strValueOf7);
            }
            spannableStringBuilder.append((CharSequence) b(strValueOf7, k7nVar3));
        }
        this.m = c(spannableStringBuilder, this.s);
        p7n currentTimerState = getCurrentTimerState();
        if (Intrinsics.d(this.f47278a, currentTimerState) && !this.y) {
            invalidate();
            return;
        }
        this.y = false;
        this.f47278a = currentTimerState;
        requestLayout();
    }

    public final void setTimeDirection(l7n l7nVar) {
        l7nVar.getClass();
        this.j = l7nVar;
    }

    public final void setTimerType(unq0 unq0Var) {
        unq0Var.getClass();
        this.b = unq0Var;
        p7n currentTimerState = getCurrentTimerState();
        if (!Intrinsics.d(this.f47278a, currentTimerState) || this.y) {
            this.y = false;
            this.f47278a = currentTimerState;
            requestLayout();
        }
    }

    public final void setUpdateTimeIntervalMs(long j) {
        this.h = j;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            this.g.removeCallbacks(this.w);
        } else if (this.l) {
            d();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsTimer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsTimer(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
