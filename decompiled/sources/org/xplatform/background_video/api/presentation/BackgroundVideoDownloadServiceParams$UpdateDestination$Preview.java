package org.xplatform.background_video.api.presentation;

import a.kng0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"org/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$UpdateDestination$Preview", "", "Small", "Medium", "Large", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$UpdateDestination$Preview$Large;", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$UpdateDestination$Preview$Medium;", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$UpdateDestination$Preview$Small;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface BackgroundVideoDownloadServiceParams$UpdateDestination$Preview extends BackgroundVideoDownloadServiceParams {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$UpdateDestination$Preview$Large;", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$UpdateDestination$Preview;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Large implements BackgroundVideoDownloadServiceParams$UpdateDestination$Preview {
        public static final Parcelable.Creator<Large> CREATOR = new g();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46374a;

        public Large(String str) {
            str.getClass();
            this.f46374a = str;
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final String getF46376a() {
            return this.f46374a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Large) && Intrinsics.d(this.f46374a, ((Large) obj).f46374a);
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        public final String getPrefix() {
            return "large_";
        }

        public final int hashCode() {
            return this.f46374a.hashCode();
        }

        public final String toString() {
            return kng0.l("Large(urn=", this.f46374a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46374a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$UpdateDestination$Preview$Medium;", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$UpdateDestination$Preview;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Medium implements BackgroundVideoDownloadServiceParams$UpdateDestination$Preview {
        public static final Parcelable.Creator<Medium> CREATOR = new h();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46375a;

        public Medium(String str) {
            str.getClass();
            this.f46375a = str;
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final String getF46376a() {
            return this.f46375a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Medium) && Intrinsics.d(this.f46375a, ((Medium) obj).f46375a);
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        public final String getPrefix() {
            return "medium_";
        }

        public final int hashCode() {
            return this.f46375a.hashCode();
        }

        public final String toString() {
            return kng0.l("Medium(urn=", this.f46375a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46375a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$UpdateDestination$Preview$Small;", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$UpdateDestination$Preview;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Small implements BackgroundVideoDownloadServiceParams$UpdateDestination$Preview {
        public static final Parcelable.Creator<Small> CREATOR = new i();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46376a;

        public Small(String str) {
            str.getClass();
            this.f46376a = str;
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final String getF46376a() {
            return this.f46376a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Small) && Intrinsics.d(this.f46376a, ((Small) obj).f46376a);
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        public final String getPrefix() {
            return "small_";
        }

        public final int hashCode() {
            return this.f46376a.hashCode();
        }

        public final String toString() {
            return kng0.l("Small(urn=", this.f46376a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46376a);
        }
    }
}
