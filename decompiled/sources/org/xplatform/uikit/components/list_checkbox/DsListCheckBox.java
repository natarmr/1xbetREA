package org.xplatform.uikit.components.list_checkbox;

import a.bqd0;
import a.jmu0;
import a.ktt0;
import a.mc00;
import a.oc00;
import a.q10;
import a.qc00;
import a.qg60;
import a.rc00;
import a.t9f;
import a.z9f;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.right.DsCellRightListCheckBox;

/* JADX INFO: loaded from: classes6.dex */
public class DsListCheckBox extends View implements Checkable {
    public static final /* synthetic */ int g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qg60 f47246a;
    public final q10 b;
    public boolean c;
    public AnimatorSet d;
    public final int e;
    public final mc00 f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/components/list_checkbox/DsListCheckBox$DsListCheckBoxSavedState;", "Landroid/os/Parcelable;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class DsListCheckBoxSavedState implements Parcelable {
        public static final Parcelable.Creator<DsListCheckBoxSavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable f47247a;
        public final boolean b;

        public DsListCheckBoxSavedState(Parcelable parcelable, boolean z) {
            this.f47247a = parcelable;
            this.b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f47247a, i);
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsListCheckBox(Context context, AttributeSet attributeSet, int i) {
        mc00 qc00Var;
        super(context, attributeSet, i);
        context.getClass();
        q10 q10Var = new q10(this, (byte) 17);
        this.b = q10Var;
        this.d = new AnimatorSet();
        this.e = context.getResources().getDimensionPixelSize(R.dimen.size_40);
        setTag("CheckBox");
        setLayerType(1, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.E, i, 0);
        this.c = typedArrayObtainStyledAttributes.getBoolean(0, false);
        rc00[] rc00VarArr = rc00.f30216a;
        int iOrdinal = ((rc00) rc00.b.get(typedArrayObtainStyledAttributes.getInt(4, 0))).ordinal();
        if (iOrdinal == 0) {
            qc00Var = new qc00(this, ktt0.l(typedArrayObtainStyledAttributes, 1), ktt0.l(typedArrayObtainStyledAttributes, 2), ktt0.l(typedArrayObtainStyledAttributes, 3));
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                throw null;
            }
            qc00Var = new oc00(this, ktt0.l(typedArrayObtainStyledAttributes, 1), ktt0.l(typedArrayObtainStyledAttributes, 2), ktt0.l(typedArrayObtainStyledAttributes, 3));
        }
        this.f = qc00Var;
        typedArrayObtainStyledAttributes.recycle();
        if (isClickable()) {
            setOnClickListener(q10Var);
        }
    }

    public boolean f() {
        return isSelected();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.d.cancel();
        mc00 mc00Var = this.f;
        if (mc00Var == null) {
            Intrinsics.h("listCheckBoxDrawable");
            throw null;
        }
        mc00Var.f(this.c);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        mc00 mc00Var = this.f;
        if (mc00Var != null) {
            mc00Var.b(canvas);
        } else {
            Intrinsics.h("listCheckBoxDrawable");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.e;
        setMeasuredDimension(i3, i3);
        mc00 mc00Var = this.f;
        if (mc00Var != null) {
            mc00Var.e(i3, i3, this.c);
        } else {
            Intrinsics.h("listCheckBoxDrawable");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof DsListCheckBoxSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DsListCheckBoxSavedState dsListCheckBoxSavedState = (DsListCheckBoxSavedState) parcelable;
        super.onRestoreInstanceState(dsListCheckBoxSavedState.f47247a);
        this.c = dsListCheckBoxSavedState.b;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new DsListCheckBoxSavedState(super.onSaveInstanceState(), this.c);
    }

    public final void setCheckBoxBackgroundColor(int i) {
        mc00 mc00Var = this.f;
        if (mc00Var != null) {
            mc00Var.c(i);
        } else {
            Intrinsics.h("listCheckBoxDrawable");
            throw null;
        }
    }

    public final void setCheckBoxIconColor(int i) {
        mc00 mc00Var = this.f;
        if (mc00Var != null) {
            mc00Var.d(i);
        } else {
            Intrinsics.h("listCheckBoxDrawable");
            throw null;
        }
    }

    public final void setCheckBoxStrokeColor(int i) {
        mc00 mc00Var = this.f;
        if (mc00Var != null) {
            mc00Var.a(i);
        } else {
            Intrinsics.h("listCheckBoxDrawable");
            throw null;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.c != z) {
            this.c = z;
            qg60 qg60Var = this.f47246a;
            if (qg60Var != null) {
                Object parent = ((DsCellRightListCheckBox) ((z9f) qg60Var).b).getParent();
                parent.getClass();
                ((View) parent).setSelected(z);
            }
            boolean zIsAttachedToWindow = isAttachedToWindow();
            mc00 mc00Var = this.f;
            if (!zIsAttachedToWindow) {
                if (mc00Var != null) {
                    mc00Var.f(z);
                    return;
                } else {
                    Intrinsics.h("listCheckBoxDrawable");
                    throw null;
                }
            }
            if (getMeasuredWidth() != 0) {
                this.d.cancel();
                if (mc00Var == null) {
                    Intrinsics.h("listCheckBoxDrawable");
                    throw null;
                }
                AnimatorSet animatorSetG = mc00Var.g(this.c);
                this.d = animatorSetG;
                animatorSetG.start();
            }
        }
    }

    public final void setCheckedChangeListener(qg60 qg60Var) {
        this.f47246a = qg60Var;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        if (z) {
            setOnClickListener(this.b);
        } else {
            setOnClickListener(null);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        jmu0.b(this, z);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsListCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    public /* synthetic */ DsListCheckBox(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R.attr.listCheckBoxStyle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsListCheckBox(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }
}
