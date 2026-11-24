package org.xplatform.background_video.api.presentation;

import a.kng0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"org/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Video", "", "Small", "Medium", "Large", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Video$Large;", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Video$Medium;", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Video$Small;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface BackgroundVideoDownloadServiceParams$StartDestination$Video extends BackgroundVideoDownloadServiceParams {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Video$Large;", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Video;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Large implements BackgroundVideoDownloadServiceParams$StartDestination$Video {
        public static final Parcelable.Creator<Large> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46371a;

        public Large(String str) {
            str.getClass();
            this.f46371a = str;
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final String getF46373a() {
            return this.f46371a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Large) && Intrinsics.d(this.f46371a, ((Large) obj).f46371a);
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        public final String getPrefix() {
            return "large_";
        }

        public final int hashCode() {
            return this.f46371a.hashCode();
        }

        public final String toString() {
            return kng0.l("Large(urn=", this.f46371a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46371a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Video$Medium;", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Video;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Medium implements BackgroundVideoDownloadServiceParams$StartDestination$Video {
        public static final Parcelable.Creator<Medium> CREATOR = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46372a;

        public Medium(String str) {
            str.getClass();
            this.f46372a = str;
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final String getF46373a() {
            return this.f46372a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Medium) && Intrinsics.d(this.f46372a, ((Medium) obj).f46372a);
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        public final String getPrefix() {
            return "medium_";
        }

        public final int hashCode() {
            return this.f46372a.hashCode();
        }

        public final String toString() {
            return kng0.l("Medium(urn=", this.f46372a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46372a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Video$Small;", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Video;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Small implements BackgroundVideoDownloadServiceParams$StartDestination$Video {
        public static final Parcelable.Creator<Small> CREATOR = new f();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46373a;

        public Small(String str) {
            str.getClass();
            this.f46373a = str;
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final String getF46373a() {
            return this.f46373a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Small) && Intrinsics.d(this.f46373a, ((Small) obj).f46373a);
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        public final String getPrefix() {
            return "small_";
        }

        public final int hashCode() {
            return this.f46373a.hashCode();
        }

        public final String toString() {
            return kng0.l("Small(urn=", this.f46373a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46373a);
        }
    }
}
