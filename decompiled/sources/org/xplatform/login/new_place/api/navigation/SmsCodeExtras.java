package org.xplatform.login.new_place.api.navigation;

import a.kng0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005Ê\u0001\u0002\b\u0007¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lorg/xplatform/login/new_place/api/navigation/SmsCodeExtras;", "Landroid/os/Parcelable;", "None", "FromAuthenticatorExtras", "Lorg/xplatform/login/new_place/api/navigation/SmsCodeExtras$FromAuthenticatorExtras;", "Lorg/xplatform/login/new_place/api/navigation/SmsCodeExtras$None;", "api", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface SmsCodeExtras extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/login/new_place/api/navigation/SmsCodeExtras$FromAuthenticatorExtras;", "Lorg/xplatform/login/new_place/api/navigation/SmsCodeExtras;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class FromAuthenticatorExtras implements SmsCodeExtras {
        public static final Parcelable.Creator<FromAuthenticatorExtras> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46759a;

        public FromAuthenticatorExtras(String str) {
            str.getClass();
            this.f46759a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FromAuthenticatorExtras) && Intrinsics.d(this.f46759a, ((FromAuthenticatorExtras) obj).f46759a);
        }

        public final int hashCode() {
            return this.f46759a.hashCode();
        }

        public final String toString() {
            return kng0.l("FromAuthenticatorExtras(userId=", this.f46759a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46759a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/login/new_place/api/navigation/SmsCodeExtras$None;", "Lorg/xplatform/login/new_place/api/navigation/SmsCodeExtras;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class None implements SmsCodeExtras {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f46760a = new None();
        public static final Parcelable.Creator<None> CREATOR = new e();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return -1051379061;
        }

        public final String toString() {
            return "None";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
