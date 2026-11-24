package org.xplatform.wallet.impl.presentation.dialogs.bonusaccountaction.models;

import a.kng0;
import a.p6t0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel;", "Landroid/os/Parcelable;", "La/p6t0;", "Slots", "Games", "Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel$Games;", "Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel$Slots;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface BonusAccountUiModel extends Parcelable, p6t0 {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel$Games;", "Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Games implements BonusAccountUiModel {
        public static final Parcelable.Creator<Games> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f47315a;

        public Games(String str) {
            str.getClass();
            this.f47315a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Games) && Intrinsics.d(this.f47315a, ((Games) obj).f47315a);
        }

        public final int hashCode() {
            return this.f47315a.hashCode();
        }

        public final String toString() {
            return kng0.l("Games(xGamesName=", this.f47315a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f47315a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel$Slots;", "Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Slots implements BonusAccountUiModel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Slots f47316a = new Slots();
        public static final Parcelable.Creator<Slots> CREATOR = new b();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Slots);
        }

        public final int hashCode() {
            return -109269053;
        }

        public final String toString() {
            return "Slots";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
