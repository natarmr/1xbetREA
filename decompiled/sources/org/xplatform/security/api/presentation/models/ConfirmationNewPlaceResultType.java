package org.xplatform.security.api.presentation.models;

import a.kng0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType;", "Landroid/os/Parcelable;", "Success", "Canceled", "Error", "Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType$Canceled;", "Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType$Error;", "Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType$Success;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ConfirmationNewPlaceResultType extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType$Canceled;", "Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Canceled implements ConfirmationNewPlaceResultType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Canceled f46935a = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new g();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Canceled);
        }

        public final int hashCode() {
            return 313101743;
        }

        public final String toString() {
            return "Canceled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType$Error;", "Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Error implements ConfirmationNewPlaceResultType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Error f46936a = new Error();
        public static final Parcelable.Creator<Error> CREATOR = new h();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -998747982;
        }

        public final String toString() {
            return "Error";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType$Success;", "Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Success implements ConfirmationNewPlaceResultType {
        public static final Parcelable.Creator<Success> CREATOR = new i();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46937a;

        public Success(String str) {
            str.getClass();
            this.f46937a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.d(this.f46937a, ((Success) obj).f46937a);
        }

        public final int hashCode() {
            return this.f46937a.hashCode();
        }

        public final String toString() {
            return kng0.l("Success(verificationQuestionType=", this.f46937a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46937a);
        }
    }
}
