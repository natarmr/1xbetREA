package org.xplatform.background_video.api.presentation;

import a.kng0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"org/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Preview", "", "Small", "Medium", "Large", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Preview$Large;", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Preview$Medium;", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Preview$Small;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface BackgroundVideoDownloadServiceParams$StartDestination$Preview extends BackgroundVideoDownloadServiceParams {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Preview$Large;", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Preview;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Large implements BackgroundVideoDownloadServiceParams$StartDestination$Preview {
        public static final Parcelable.Creator<Large> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46368a;

        public Large(String str) {
            str.getClass();
            this.f46368a = str;
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final String getF46370a() {
            return this.f46368a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Large) && Intrinsics.d(this.f46368a, ((Large) obj).f46368a);
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        public final String getPrefix() {
            return "large_";
        }

        public final int hashCode() {
            return this.f46368a.hashCode();
        }

        public final String toString() {
            return kng0.l("Large(urn=", this.f46368a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46368a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Preview$Medium;", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Preview;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Medium implements BackgroundVideoDownloadServiceParams$StartDestination$Preview {
        public static final Parcelable.Creator<Medium> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46369a;

        public Medium(String str) {
            str.getClass();
            this.f46369a = str;
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final String getF46370a() {
            return this.f46369a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Medium) && Intrinsics.d(this.f46369a, ((Medium) obj).f46369a);
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        public final String getPrefix() {
            return "medium_";
        }

        public final int hashCode() {
            return this.f46369a.hashCode();
        }

        public final String toString() {
            return kng0.l("Medium(urn=", this.f46369a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46369a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Preview$Small;", "Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Preview;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Small implements BackgroundVideoDownloadServiceParams$StartDestination$Preview {
        public static final Parcelable.Creator<Small> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46370a;

        public Small(String str) {
            str.getClass();
            this.f46370a = str;
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        /* JADX INFO: renamed from: Q, reason: from getter */
        public final String getF46370a() {
            return this.f46370a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Small) && Intrinsics.d(this.f46370a, ((Small) obj).f46370a);
        }

        @Override // org.xplatform.background_video.api.presentation.BackgroundVideoDownloadServiceParams
        public final String getPrefix() {
            return "small_";
        }

        public final int hashCode() {
            return this.f46370a.hashCode();
        }

        public final String toString() {
            return kng0.l("Small(urn=", this.f46370a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46370a);
        }
    }
}
