package org.xplatform.cyber.section.api.presentation;

import a.brm0;
import a.cs0;
import a.dw9;
import a.h97;
import a.hne;
import a.kng0;
import a.rw2;
import a.rz4;
import a.vqd;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;", "Landroid/os/Parcelable;", "SportGames", "ChampsGames", "BestGames", "Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$BestGames;", "Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$ChampsGames;", "Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$SportGames;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface EsportsGamesScreenParams extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$BestGames;", "Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class BestGames implements EsportsGamesScreenParams {
        public static final Parcelable.Creator<BestGames> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46561a;
        public final boolean b;

        public BestGames(int i, boolean z) {
            this.f46561a = i;
            this.b = z;
        }

        @Override // org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams
        /* JADX INFO: renamed from: I, reason: from getter */
        public final int getD() {
            return this.f46561a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams
        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getC() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BestGames)) {
                return false;
            }
            BestGames bestGames = (BestGames) obj;
            return this.f46561a == bestGames.f46561a && this.b == bestGames.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.f46561a) * 31);
        }

        public final String toString() {
            return rz4.i(this.f46561a, "BestGames(pageType=", ", live=", Separators.RPAREN, this.b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.f46561a);
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$ChampsGames;", "Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ChampsGames implements EsportsGamesScreenParams {
        public static final Parcelable.Creator<ChampsGames> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f46562a;
        public final boolean b;
        public final List c;

        public ChampsGames(int i, List list, boolean z) {
            list.getClass();
            this.f46562a = i;
            this.b = z;
            this.c = list;
        }

        @Override // org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams
        /* JADX INFO: renamed from: I, reason: from getter */
        public final int getD() {
            return this.f46562a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams
        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getC() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChampsGames)) {
                return false;
            }
            ChampsGames champsGames = (ChampsGames) obj;
            return this.f46562a == champsGames.f46562a && this.b == champsGames.b && Intrinsics.d(this.c, champsGames.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + brm0.e(Integer.hashCode(this.f46562a) * 31, 31, this.b);
        }

        public final String toString() {
            return dw9.r(h97.l(this.f46562a, "ChampsGames(pageType=", ", live=", ", champIds=", this.b), this.c, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.f46562a);
            parcel.writeInt(this.b ? 1 : 0);
            Iterator itT = cs0.t(this.c, parcel);
            while (itT.hasNext()) {
                parcel.writeLong(((Number) itT.next()).longValue());
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$SportGames;", "Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class SportGames implements EsportsGamesScreenParams {
        public static final Parcelable.Creator<SportGames> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f46563a;
        public final long b;
        public final boolean c;
        public final int d;

        public SportGames(int i, long j, long j2, boolean z) {
            this.f46563a = j;
            this.b = j2;
            this.c = z;
            this.d = i;
        }

        @Override // org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams
        /* JADX INFO: renamed from: I, reason: from getter */
        public final int getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams
        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getC() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SportGames)) {
                return false;
            }
            SportGames sportGames = (SportGames) obj;
            return this.f46563a == sportGames.f46563a && this.b == sportGames.b && this.c == sportGames.c && this.d == sportGames.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + brm0.e(rw2.b(Long.hashCode(this.f46563a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbQ = kng0.q(this.f46563a, "SportGames(sportId=", ", subSportId=");
            hne.t(this.b, ", live=", sbQ, this.c);
            return vqd.p(sbQ, ", pageType=", this.d, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeLong(this.f46563a);
            parcel.writeLong(this.b);
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeInt(this.d);
        }
    }

    /* JADX INFO: renamed from: I */
    int getD();

    /* JADX INFO: renamed from: e */
    boolean getC();
}
