package org.xplatform.uikit.components.check_box.old;

import a.awl;
import a.bqd0;
import a.dh60;
import a.jmu0;
import a.nek;
import a.og60;
import a.rg60;
import a.rvl;
import a.si30;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public class DsCheckBoxOld extends View implements Checkable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public awl f47236a;
    public boolean b;
    public AnimatorSet c;
    public final int d;
    public final rvl e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/components/check_box/old/DsCheckBoxOld$DsCheckBoxSavedState;", "Landroid/os/Parcelable;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class DsCheckBoxSavedState implements Parcelable {
        public static final Parcelable.Creator<DsCheckBoxSavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable f47237a;
        public final awl b;
        public final boolean c;

        public DsCheckBoxSavedState(Parcelable parcelable, awl awlVar, boolean z) {
            awlVar.getClass();
            this.f47237a = parcelable;
            this.b = awlVar;
            this.c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f47237a, i);
            parcel.writeString(this.b.name());
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003b A[PHI: r6
  0x003b: PHI (r6v6 a.awl) = (r6v3 a.awl), (r6v4 a.awl) binds: [B:6:0x0039, B:9:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Illegal instructions before constructor call */
    public DsCheckBoxOld(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.dsCheckBoxStyle);
        awl awlVar = awl.STATE_UNCHECKED;
        this.f47236a = awlVar;
        this.c = new AnimatorSet();
        this.d = context.getResources().getDimensionPixelSize(R.dimen.size_48);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.B, R.attr.dsCheckBoxStyle, 0);
        nek nekVar = awl.f1580a;
        int i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
        nekVar.getClass();
        awl awlVar2 = awl.STATE_CHECKED;
        if (i2 != 1) {
            awlVar2 = awl.STATE_INDETERMINATE;
            awlVar = i2 == 2 ? awlVar2 : awlVar;
        }
        this.f47236a = awlVar;
        this.e = new rvl(this);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f47236a == awl.STATE_CHECKED;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.c.cancel();
        rvl rvlVar = this.e;
        if (rvlVar == null) {
            Intrinsics.h("dsCheckBoxDrawable");
            throw null;
        }
        rvlVar.g(this.f47236a, this.b);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        rvl rvlVar = this.e;
        if (rvlVar == null) {
            Intrinsics.h("dsCheckBoxDrawable");
            throw null;
        }
        canvas.getClass();
        Path path = rvlVar.k;
        float f = rvlVar.n;
        float f2 = rvlVar.o;
        float f3 = rvlVar.i;
        path.addRoundRect(f, f, f2, f2, f3, f3, Path.Direction.CW);
        Path path2 = rvlVar.l;
        Path.Op op = Path.Op.DIFFERENCE;
        path.op(path2, op);
        Path path3 = rvlVar.j;
        path.op(path3, op);
        canvas.drawPath(path, rvlVar.r);
        canvas.drawPath(path3, rvlVar.q);
        path.reset();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.d;
        setMeasuredDimension(i3, i3);
        rvl rvlVar = this.e;
        if (rvlVar == null) {
            Intrinsics.h("dsCheckBoxDrawable");
            throw null;
        }
        awl awlVar = this.f47236a;
        boolean z = this.b;
        awlVar.getClass();
        float f = i3;
        float f2 = f / 2.0f;
        float f3 = i3 / 2.0f;
        PointF pointF = rvlVar.f;
        pointF.set(f2, f3);
        PointF pointF2 = rvlVar.g;
        pointF2.set(f2 / 2.0f, f3 / 2.0f);
        rvlVar.m = (f / 4.0f) / 120.0f;
        float f4 = pointF2.x;
        float f5 = 1.25f * f4;
        float f6 = (f4 * 0.75f) + pointF.x;
        RectF rectF = rvlVar.h;
        rectF.set(f5, f5, f6, f6);
        rvlVar.i = (f6 - f5) * 0.1111f;
        float f7 = rectF.right;
        float f8 = rectF.left;
        float f9 = (f7 - f8) * 0.1111f;
        float f10 = f8 + f9;
        float f11 = f7 - f9;
        Path path = rvlVar.k;
        path.reset();
        Path path2 = rvlVar.j;
        path2.reset();
        rvlVar.p = rectF.right - rectF.left;
        float fB = si30.b(f5);
        float fB2 = si30.b(f5);
        float fB3 = si30.b(f6);
        float fB4 = si30.b(f6);
        float f12 = rvlVar.i;
        Path.Direction direction = Path.Direction.CW;
        path2.addRoundRect(fB, fB2, fB3, fB4, f12, f12, direction);
        path.addRect(si30.b(f10), si30.b(f10), si30.b(f11), si30.b(f11), direction);
        path2.op(path, Path.Op.DIFFERENCE);
        path.reset();
        rvlVar.g(awlVar, z);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof DsCheckBoxSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DsCheckBoxSavedState dsCheckBoxSavedState = (DsCheckBoxSavedState) parcelable;
        super.onRestoreInstanceState(dsCheckBoxSavedState.f47237a);
        this.f47236a = dsCheckBoxSavedState.b;
        this.b = dsCheckBoxSavedState.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new DsCheckBoxSavedState(super.onSaveInstanceState(), this.f47236a, this.b);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isClickable()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? awl.STATE_CHECKED : awl.STATE_UNCHECKED);
    }

    public final void setCheckedState(awl awlVar) {
        AnimatorSet animatorSetE;
        awlVar.getClass();
        awl awlVar2 = this.f47236a;
        if (awlVar2 != awlVar) {
            this.f47236a = awlVar;
            nek nekVar = awl.f1580a;
            boolean zIsAttachedToWindow = isAttachedToWindow();
            rvl rvlVar = this.e;
            if (!zIsAttachedToWindow) {
                if (rvlVar != null) {
                    rvlVar.g(this.f47236a, this.b);
                    return;
                } else {
                    Intrinsics.h("dsCheckBoxDrawable");
                    throw null;
                }
            }
            if (getMeasuredWidth() != 0) {
                this.c.cancel();
                if (rvlVar == null) {
                    Intrinsics.h("dsCheckBoxDrawable");
                    throw null;
                }
                awl awlVar3 = this.f47236a;
                boolean z = this.b;
                awlVar3.getClass();
                awlVar2.getClass();
                int iOrdinal = awlVar3.ordinal();
                if (iOrdinal == 1) {
                    awl awlVar4 = awl.STATE_INDETERMINATE;
                    if (awlVar2 == awlVar4) {
                        rvlVar.g(awlVar4, z);
                        animatorSetE = rvlVar.a(1.0f, 0.0f);
                    } else {
                        rvlVar.g(awl.STATE_UNCHECKED, z);
                        animatorSetE = rvlVar.e(awl.STATE_CHECKED, z);
                    }
                } else if (iOrdinal != 2) {
                    awl awlVar5 = awl.STATE_INDETERMINATE;
                    if (awlVar2 == awlVar5) {
                        rvlVar.g(awlVar5, z);
                        animatorSetE = rvlVar.c(awlVar5, z);
                    } else {
                        awl awlVar6 = awl.STATE_CHECKED;
                        rvlVar.g(awlVar6, z);
                        animatorSetE = rvlVar.c(awlVar6, z);
                    }
                } else {
                    awl awlVar7 = awl.STATE_CHECKED;
                    if (awlVar2 == awlVar7) {
                        rvlVar.g(awlVar7, z);
                        animatorSetE = rvlVar.a(0.0f, 1.0f);
                    } else {
                        rvlVar.g(awl.STATE_UNCHECKED, z);
                        animatorSetE = rvlVar.e(awl.STATE_INDETERMINATE, z);
                    }
                }
                this.c = animatorSetE;
                animatorSetE.start();
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c.cancel();
        jmu0.b(this, z);
        rvl rvlVar = this.e;
        if (rvlVar != null) {
            rvlVar.g(this.f47236a, this.b);
        } else {
            Intrinsics.h("dsCheckBoxDrawable");
            throw null;
        }
    }

    public final void setErrorShown(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        rvl rvlVar = this.e;
        if (rvlVar == null) {
            Intrinsics.h("dsCheckBoxDrawable");
            throw null;
        }
        awl awlVar = this.f47236a;
        awlVar.getClass();
        rvlVar.g(awlVar, z);
        rvlVar.f31174a.invalidate();
        this.c.cancel();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    public final void setCheckedChangeListener(og60 og60Var) {
    }

    public final void setCheckedStateChangedListener(rg60 rg60Var) {
    }

    public final void setErrorChangedDsCheckboxListener(dh60 dh60Var) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCheckBoxOld(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCheckBoxOld(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
