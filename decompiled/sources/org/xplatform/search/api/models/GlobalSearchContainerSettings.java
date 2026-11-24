package org.xplatform.search.api.models;

import a.bfo0;
import a.bhh0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;", "Landroid/os/Parcelable;", "Default", "FromBetSlip", "FavoriteTeam", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface GlobalSearchContainerSettings extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$Default;", "Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Default implements GlobalSearchContainerSettings {
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final bfo0 f46913a;
        public final bhh0 b;

        public Default(bfo0 bfo0Var, bhh0 bhh0Var) {
            bfo0Var.getClass();
            bhh0Var.getClass();
            this.f46913a = bfo0Var;
            this.b = bhh0Var;
        }

        @Override // org.xplatform.search.api.models.GlobalSearchContainerSettings
        /* JADX INFO: renamed from: X0, reason: from getter */
        public final bfo0 getF46913a() {
            return this.f46913a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Default)) {
                return false;
            }
            Default r5 = (Default) obj;
            return this.f46913a == r5.f46913a && this.b == r5.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f46913a.hashCode() * 31);
        }

        public final String toString() {
            return "Default(selectedTab=" + this.f46913a + ", selectionType=" + this.b + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46913a.name());
            parcel.writeString(this.b.name());
        }

        @Override // org.xplatform.search.api.models.GlobalSearchContainerSettings
        /* JADX INFO: renamed from: x0, reason: from getter */
        public final bhh0 getB() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$FavoriteTeam;", "Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class FavoriteTeam implements GlobalSearchContainerSettings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FavoriteTeam f46914a = new FavoriteTeam();
        public static final Parcelable.Creator<FavoriteTeam> CREATOR = new b();

        @Override // org.xplatform.search.api.models.GlobalSearchContainerSettings
        /* JADX INFO: renamed from: X0 */
        public final bfo0 getF46913a() {
            return bfo0.f2512a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FavoriteTeam);
        }

        public final int hashCode() {
            return -37250523;
        }

        public final String toString() {
            return "FavoriteTeam";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }

        @Override // org.xplatform.search.api.models.GlobalSearchContainerSettings
        /* JADX INFO: renamed from: x0 */
        public final bhh0 getB() {
            return bhh0.c;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/search/api/models/GlobalSearchContainerSettings$FromBetSlip;", "Lorg/xplatform/search/api/models/GlobalSearchContainerSettings;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class FromBetSlip implements GlobalSearchContainerSettings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FromBetSlip f46915a = new FromBetSlip();
        public static final Parcelable.Creator<FromBetSlip> CREATOR = new c();

        @Override // org.xplatform.search.api.models.GlobalSearchContainerSettings
        /* JADX INFO: renamed from: X0 */
        public final bfo0 getF46913a() {
            return bfo0.f2512a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FromBetSlip);
        }

        public final int hashCode() {
            return -1145365285;
        }

        public final String toString() {
            return "FromBetSlip";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }

        @Override // org.xplatform.search.api.models.GlobalSearchContainerSettings
        /* JADX INFO: renamed from: x0 */
        public final bhh0 getB() {
            return bhh0.b;
        }
    }

    /* JADX INFO: renamed from: X0 */
    bfo0 getF46913a();

    /* JADX INFO: renamed from: x0 */
    bhh0 getB();
}
