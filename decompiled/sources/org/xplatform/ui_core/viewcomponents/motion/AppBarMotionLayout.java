package org.xplatform.ui_core.viewcomponents.motion;

import a.pv5;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewParent;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class AppBarMotionLayout extends pv5 {
    public Function1 d2;

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ui_core/viewcomponents/motion/AppBarMotionLayout$SavedState;", "Landroid/os/Parcelable;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable f47197a;
        public final int b;
        public final int c;
        public final float d;
        public final int e;

        public SavedState(Parcelable parcelable, int i, int i2, float f, int i3) {
            this.f47197a = parcelable;
            this.b = i;
            this.c = i2;
            this.d = f;
            this.e = i3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f47197a, i);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeFloat(this.d);
            parcel.writeInt(this.e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarMotionLayout(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = parcelable instanceof SavedState ? (SavedState) parcelable : null;
        if (savedState != null) {
            float f = savedState.d;
            super.onRestoreInstanceState(savedState.f47197a);
            D(savedState.b, savedState.c);
            setProgress(f);
            Function1 function1 = this.d2;
            if (function1 != null) {
                function1.invoke(Integer.valueOf(savedState.e));
            }
            ViewParent parent = getParent();
            AppBarLayout appBarLayout = parent instanceof AppBarLayout ? (AppBarLayout) parent : null;
            if (appBarLayout != null) {
                appBarLayout.setExpanded(f < 0.5f);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle transitionState = getTransitionState();
        return new SavedState(super.onSaveInstanceState(), transitionState.getInt("motion.StartState"), transitionState.getInt("motion.EndState"), getProgress(), getCurrentState());
    }

    public final void setCurrentStateChangeListener(Function1<? super Integer, Unit> function1) {
        function1.getClass();
        this.d2 = function1;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(getCurrentState()));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppBarMotionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppBarMotionLayout(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
