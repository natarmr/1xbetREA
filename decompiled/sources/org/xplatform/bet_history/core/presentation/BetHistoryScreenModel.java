package org.xplatform.bet_history.core.presentation;

import a.brm0;
import a.k77;
import a.kng0;
import a.rw2;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;", "Landroid/os/Parcelable;", "BetHistory", "BetChampHistory", "Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;", "Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetHistory;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface BetHistoryScreenModel extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetChampHistory;", "Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class BetChampHistory implements BetHistoryScreenModel {
        public static final Parcelable.Creator<BetChampHistory> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f46387a;
        public final HistoryTypeModel b;
        public final k77 c;
        public final long d;
        public final String e;
        public final String f;

        public BetChampHistory(long j, HistoryTypeModel historyTypeModel, k77 k77Var, long j2, String str, String str2) {
            historyTypeModel.getClass();
            k77Var.getClass();
            str.getClass();
            str2.getClass();
            this.f46387a = j;
            this.b = historyTypeModel;
            this.c = k77Var;
            this.d = j2;
            this.e = str;
            this.f = str2;
        }

        public static BetChampHistory a(BetChampHistory betChampHistory, long j, HistoryTypeModel historyTypeModel, int i) {
            if ((i & 2) != 0) {
                historyTypeModel = betChampHistory.b;
            }
            HistoryTypeModel historyTypeModel2 = historyTypeModel;
            k77 k77Var = betChampHistory.c;
            long j2 = betChampHistory.d;
            String str = betChampHistory.e;
            String str2 = betChampHistory.f;
            betChampHistory.getClass();
            historyTypeModel2.getClass();
            k77Var.getClass();
            str.getClass();
            str2.getClass();
            return new BetChampHistory(j, historyTypeModel2, k77Var, j2, str, str2);
        }

        @Override // org.xplatform.bet_history.core.presentation.BetHistoryScreenModel
        /* JADX INFO: renamed from: F, reason: from getter */
        public final HistoryTypeModel getB() {
            return this.b;
        }

        @Override // org.xplatform.bet_history.core.presentation.BetHistoryScreenModel
        /* JADX INFO: renamed from: W, reason: from getter */
        public final long getD() {
            return this.d;
        }

        @Override // org.xplatform.bet_history.core.presentation.BetHistoryScreenModel
        /* JADX INFO: renamed from: c0, reason: from getter */
        public final long getF46388a() {
            return this.f46387a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BetChampHistory)) {
                return false;
            }
            BetChampHistory betChampHistory = (BetChampHistory) obj;
            return this.f46387a == betChampHistory.f46387a && this.b == betChampHistory.b && this.c == betChampHistory.c && this.d == betChampHistory.d && Intrinsics.d(this.e, betChampHistory.e) && Intrinsics.d(this.f, betChampHistory.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ua80.b(rw2.b((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f46387a) * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        }

        @Override // org.xplatform.bet_history.core.presentation.BetHistoryScreenModel
        /* JADX INFO: renamed from: p0, reason: from getter */
        public final k77 getC() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BetChampHistory(balanceId=");
            sb.append(this.f46387a);
            sb.append(", historyTypeModel=");
            sb.append(this.b);
            sb.append(", betHistoryStyle=");
            sb.append(this.c);
            sb.append(", betIdToOpen=");
            kng0.z(sb, this.d, ", champTitle=", this.e);
            return rw2.o(sb, ", champId=", this.f, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeLong(this.f46387a);
            this.b.writeToParcel(parcel, i);
            parcel.writeString(this.c.name());
            parcel.writeLong(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel$BetHistory;", "Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class BetHistory implements BetHistoryScreenModel {
        public static final Parcelable.Creator<BetHistory> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f46388a;
        public final HistoryTypeModel b;
        public final k77 c;
        public final long d;

        public BetHistory(long j, HistoryTypeModel historyTypeModel, k77 k77Var, long j2) {
            historyTypeModel.getClass();
            k77Var.getClass();
            this.f46388a = j;
            this.b = historyTypeModel;
            this.c = k77Var;
            this.d = j2;
        }

        public static BetHistory a(BetHistory betHistory, long j, HistoryTypeModel historyTypeModel, int i) {
            if ((i & 2) != 0) {
                historyTypeModel = betHistory.b;
            }
            HistoryTypeModel historyTypeModel2 = historyTypeModel;
            k77 k77Var = betHistory.c;
            long j2 = betHistory.d;
            betHistory.getClass();
            historyTypeModel2.getClass();
            k77Var.getClass();
            return new BetHistory(j, historyTypeModel2, k77Var, j2);
        }

        @Override // org.xplatform.bet_history.core.presentation.BetHistoryScreenModel
        /* JADX INFO: renamed from: F, reason: from getter */
        public final HistoryTypeModel getB() {
            return this.b;
        }

        @Override // org.xplatform.bet_history.core.presentation.BetHistoryScreenModel
        /* JADX INFO: renamed from: W, reason: from getter */
        public final long getD() {
            return this.d;
        }

        @Override // org.xplatform.bet_history.core.presentation.BetHistoryScreenModel
        /* JADX INFO: renamed from: c0, reason: from getter */
        public final long getF46388a() {
            return this.f46388a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BetHistory)) {
                return false;
            }
            BetHistory betHistory = (BetHistory) obj;
            return this.f46388a == betHistory.f46388a && this.b == betHistory.b && this.c == betHistory.c && this.d == betHistory.d;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f46388a) * 31)) * 31)) * 31);
        }

        @Override // org.xplatform.bet_history.core.presentation.BetHistoryScreenModel
        /* JADX INFO: renamed from: p0, reason: from getter */
        public final k77 getC() {
            return this.c;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BetHistory(balanceId=");
            sb.append(this.f46388a);
            sb.append(", historyTypeModel=");
            sb.append(this.b);
            sb.append(", betHistoryStyle=");
            sb.append(this.c);
            sb.append(", betIdToOpen=");
            return brm0.k(this.d, Separators.RPAREN, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeLong(this.f46388a);
            this.b.writeToParcel(parcel, i);
            parcel.writeString(this.c.name());
            parcel.writeLong(this.d);
        }
    }

    /* JADX INFO: renamed from: F */
    HistoryTypeModel getB();

    /* JADX INFO: renamed from: W */
    long getD();

    /* JADX INFO: renamed from: c0 */
    long getF46388a();

    /* JADX INFO: renamed from: p0 */
    k77 getC();
}
