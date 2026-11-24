package org.xplatform.sportgame.subgames.impl.presentation.models;

import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState;", "Landroid/os/Parcelable;", "NoPosition", "PositionHandled", "Position", "Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState$NoPosition;", "Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState$Position;", "Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState$PositionHandled;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface SelectedTabState extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState$NoPosition;", "Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class NoPosition implements SelectedTabState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoPosition f47015a = new NoPosition();
        public static final Parcelable.Creator<NoPosition> CREATOR = new a();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoPosition);
        }

        public final int hashCode() {
            return -442294565;
        }

        public final String toString() {
            return "NoPosition";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState$Position;", "Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Position implements SelectedTabState {
        public static final Parcelable.Creator<Position> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f47016a;

        public Position(int i) {
            this.f47016a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Position) && this.f47016a == ((Position) obj).f47016a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f47016a);
        }

        public final String toString() {
            return ua80.e(this.f47016a, "Position(value=", Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.f47016a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState$PositionHandled;", "Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class PositionHandled implements SelectedTabState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PositionHandled f47017a = new PositionHandled();
        public static final Parcelable.Creator<PositionHandled> CREATOR = new c();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PositionHandled);
        }

        public final int hashCode() {
            return -2000987230;
        }

        public final String toString() {
            return "PositionHandled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
