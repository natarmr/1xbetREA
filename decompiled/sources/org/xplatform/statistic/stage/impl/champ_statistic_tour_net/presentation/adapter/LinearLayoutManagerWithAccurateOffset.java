package org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.adapter;

import a.the0;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/adapter/LinearLayoutManagerWithAccurateOffset;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "InternalState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LinearLayoutManagerWithAccurateOffset extends LinearLayoutManager {
    public final LinkedHashMap g1;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lorg/xplatform/statistic/stage/impl/champ_statistic_tour_net/presentation/adapter/LinearLayoutManagerWithAccurateOffset$InternalState;", "Landroid/view/View$BaseSavedState;", "Landroid/os/Parcelable;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class InternalState extends View.BaseSavedState implements Parcelable {
        public static final Parcelable.Creator<InternalState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Parcelable f47069a;
        public final Map b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InternalState(Parcelable parcelable, LinkedHashMap linkedHashMap) {
            super(parcelable);
            linkedHashMap.getClass();
            this.f47069a = parcelable;
            this.b = linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InternalState)) {
                return false;
            }
            InternalState internalState = (InternalState) obj;
            return Intrinsics.d(this.f47069a, internalState.f47069a) && Intrinsics.d(this.b, internalState.b);
        }

        public final int hashCode() {
            Parcelable parcelable = this.f47069a;
            return this.b.hashCode() + ((parcelable == null ? 0 : parcelable.hashCode()) * 31);
        }

        public final String toString() {
            return "InternalState(superSavedState=" + this.f47069a + ", sizeMap=" + this.b + Separators.RPAREN;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.f47069a, i);
            Map map = this.b;
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeInt(((Number) entry.getKey()).intValue());
                parcel.writeInt(((Number) entry.getValue()).intValue());
            }
        }
    }

    public LinearLayoutManagerWithAccurateOffset(Context context) {
        super(context);
        this.g1 = new LinkedHashMap();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final int A(the0 the0Var) {
        the0Var.getClass();
        if (I() == 0) {
            return 0;
        }
        int iF1 = f1();
        View viewD = D(iF1);
        int y = (viewD != null ? (int) viewD.getY() : 0) * (-1);
        for (int i = 0; i < iF1; i++) {
            Integer num = (Integer) this.g1.get(Integer.valueOf(i));
            y += num != null ? num.intValue() : 0;
        }
        return y;
    }

    public final int C1(int i) {
        int i2 = 0;
        for (Map.Entry entry : this.g1.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            int iIntValue2 = ((Number) entry.getValue()).intValue();
            if (1 <= iIntValue && iIntValue < i) {
                i2 += iIntValue2;
            }
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final void t0(the0 the0Var) {
        the0Var.getClass();
        super.t0(the0Var);
        int I = I();
        for (int i = 0; i < I; i++) {
            View viewH = H(i);
            if (viewH != null) {
                this.g1.put(Integer.valueOf(b.T(viewH)), Integer.valueOf(viewH.getHeight()));
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final void u0(Parcelable parcelable) {
        Parcelable parcelable2;
        InternalState internalState = parcelable instanceof InternalState ? (InternalState) parcelable : null;
        if (internalState != null && (parcelable2 = internalState.f47069a) != null) {
            parcelable = parcelable2;
        }
        super.u0(parcelable);
        Map map = internalState != null ? internalState.b : null;
        if (map != null) {
            LinkedHashMap linkedHashMap = this.g1;
            linkedHashMap.clear();
            linkedHashMap.putAll(map);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final Parcelable v0() {
        return new InternalState(super.v0(), this.g1);
    }
}
