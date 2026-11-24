package org.xplatform.uikit.components.check_box;

import a.awl;
import a.bqd0;
import a.ckb;
import a.eh60;
import a.gi;
import a.i120;
import a.jmu0;
import a.nek;
import a.pg60;
import a.r9g;
import a.sg60;
import a.u0i;
import a.usd;
import a.vcc;
import a.wej;
import a.xvl;
import a.z9f;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import kotlin.Metadata;
import kotlin.Pair;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public class DsCheckbox extends View implements Checkable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pg60 f47234a;
    public awl b;
    public boolean c;
    public AnimatorSet d;
    public final xvl e;
    public final int f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/components/check_box/DsCheckbox$DsCheckBoxSavedState;", "Landroid/os/Parcelable;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class DsCheckBoxSavedState implements Parcelable {
        public static final Parcelable.Creator<DsCheckBoxSavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable f47235a;
        public final awl b;
        public final boolean c;

        public DsCheckBoxSavedState(Parcelable parcelable, awl awlVar, boolean z) {
            awlVar.getClass();
            this.f47235a = parcelable;
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
            parcel.writeParcelable(this.f47235a, i);
            parcel.writeString(this.b.name());
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0052 A[PHI: r12
  0x0052: PHI (r12v4 a.awl) = (r12v2 a.awl), (r12v3 a.awl) binds: [B:6:0x0050, B:9:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Illegal instructions before constructor call */
    public DsCheckbox(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.dsCheckBoxStyle);
        awl awlVar = awl.STATE_UNCHECKED;
        this.b = awlVar;
        this.d = new AnimatorSet();
        this.e = new xvl(context, new wej(0, this, DsCheckbox.class, "invalidate", "invalidate()V", 0, (byte) 9));
        this.f = context.getResources().getDimensionPixelSize(R.dimen.size_40);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.B, R.attr.dsCheckBoxStyle, 0);
        nek nekVar = awl.f1580a;
        int i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
        nekVar.getClass();
        awl awlVar2 = awl.STATE_CHECKED;
        if (i2 != 1) {
            awlVar2 = awl.STATE_INDETERMINATE;
            awlVar = i2 == 2 ? awlVar2 : awlVar;
        }
        setCheckedStateInternal(awlVar);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void setCheckedStateInternal(awl awlVar) {
        AnimatorSet animatorSetB;
        pg60 pg60Var;
        awl awlVar2 = this.b;
        this.b = awlVar;
        awl awlVar3 = awl.STATE_INDETERMINATE;
        if (awlVar != awlVar3 && (pg60Var = this.f47234a) != null) {
            boolean zIsChecked = isChecked();
            u0i u0iVar = (u0i) ((z9f) pg60Var).b;
            usd usdVar = u0i.c2;
            String str = u0iVar.K0().f;
            if (str != null && str.length() != 0) {
                vcc.f0(i120.V(new Pair("CHECK_BOX", Boolean.valueOf(zIsChecked))), u0iVar, u0iVar.K0().f + gi.e);
            }
        }
        boolean zIsAttachedToWindow = isAttachedToWindow();
        xvl xvlVar = this.e;
        if (!zIsAttachedToWindow) {
            xvlVar.g(this.b, this.c, isEnabled());
            return;
        }
        if (getMeasuredWidth() != 0) {
            this.d.cancel();
            awl awlVar4 = this.b;
            xvlVar.getClass();
            awlVar4.getClass();
            awlVar2.getClass();
            awl awlVar5 = awl.STATE_CHECKED;
            if (awlVar2 == awlVar5 && awlVar4 == awlVar3) {
                animatorSetB = xvlVar.a(true);
            } else if (awlVar2 == awlVar5 && awlVar4 == awl.STATE_UNCHECKED) {
                animatorSetB = xvlVar.b(true);
            } else if (awlVar2 == awlVar3 && awlVar4 == awlVar5) {
                animatorSetB = xvlVar.a(false);
            } else if (awlVar2 == awlVar3 && awlVar4 == awl.STATE_UNCHECKED) {
                animatorSetB = xvlVar.c(true);
            } else {
                animatorSetB = (awlVar2 == awl.STATE_UNCHECKED && awlVar4 == awlVar5) ? xvlVar.b(false) : xvlVar.c(false);
            }
            this.d = animatorSetB;
            animatorSetB.addListener(new r9g((Object) this, (byte) 3));
            this.d.start();
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.b == awl.STATE_CHECKED;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.d.cancel();
        this.e.g(this.b, this.c, isEnabled());
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        xvl xvlVar = this.e;
        xvlVar.getClass();
        canvas.getClass();
        RectF rectF = xvlVar.h;
        float f = xvlVar.i;
        canvas.drawRoundRect(rectF, f, f, xvlVar.j);
        canvas.drawRoundRect(xvlVar.g, f, f, xvlVar.k);
        Drawable drawable = xvlVar.o;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = xvlVar.p;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.f;
        setMeasuredDimension(i3, i3);
        this.e.g(this.b, this.c, isEnabled());
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof DsCheckBoxSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DsCheckBoxSavedState dsCheckBoxSavedState = (DsCheckBoxSavedState) parcelable;
        super.onRestoreInstanceState(dsCheckBoxSavedState.f47235a);
        this.b = dsCheckBoxSavedState.b;
        this.c = dsCheckBoxSavedState.c;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new DsCheckBoxSavedState(super.onSaveInstanceState(), this.b, this.c);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isClickable()) {
            toggle();
            ckb.Z(this, isChecked() ? 21 : 22);
        }
        return super.performClick();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? awl.STATE_CHECKED : awl.STATE_UNCHECKED);
    }

    public final void setCheckedChangeListener(pg60 pg60Var) {
        this.f47234a = pg60Var;
    }

    public final void setCheckedState(awl awlVar) {
        awlVar.getClass();
        if (this.b != awlVar) {
            setCheckedStateInternal(awlVar);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        jmu0.b(this, z);
        this.d.cancel();
        this.e.g(this.b, this.c, z);
    }

    public final void setErrorShown(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        this.e.g(this.b, z, isEnabled());
        this.d.cancel();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    public final void setCheckedStateChangedListener(sg60 sg60Var) {
    }

    public final void setErrorChangedDsCheckboxListener(eh60 eh60Var) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCheckbox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsCheckbox(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
