package org.xplatform.login.new_place.api.navigation;

import a.b1j;
import a.brm0;
import a.cs0;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType;", "Landroid/os/Parcelable;", "Authenticator", "SmsCode", "Simple", "Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Authenticator;", "Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Simple;", "Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$SmsCode;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ConfirmationNewPlaceScreenType extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Authenticator;", "Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Authenticator implements ConfirmationNewPlaceScreenType {
        public static final Parcelable.Creator<Authenticator> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46756a;
        public final String b;
        public final String c;
        public final String d;

        public Authenticator(String str, String str2, String str3, String str4) {
            cs0.x(str, str2, str3, str4);
            this.f46756a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType
        /* JADX INFO: renamed from: R, reason: from getter */
        public final String getF46758a() {
            return this.f46756a;
        }

        @Override // org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType
        /* JADX INFO: renamed from: T, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType
        /* JADX INFO: renamed from: X, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Authenticator)) {
                return false;
            }
            Authenticator authenticator = (Authenticator) obj;
            return Intrinsics.d(this.f46756a, authenticator.f46756a) && Intrinsics.d(this.b, authenticator.b) && Intrinsics.d(this.c, authenticator.c) && Intrinsics.d(this.d, authenticator.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ua80.b(ua80.b(this.f46756a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return ua80.m(b1j.n("Authenticator(actionText=", this.f46756a, ", requestKey=", this.b, ", verificationQuestionType="), this.c, ", userId=", this.d, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46756a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$Simple;", "Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Simple implements ConfirmationNewPlaceScreenType {
        public static final Parcelable.Creator<Simple> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46757a;
        public final String b;
        public final String c;
        public final boolean d;

        public Simple(String str, String str2, String str3, boolean z) {
            brm0.B(str, str2, str3);
            this.f46757a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
        }

        @Override // org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType
        /* JADX INFO: renamed from: R, reason: from getter */
        public final String getF46758a() {
            return this.f46757a;
        }

        @Override // org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType
        /* JADX INFO: renamed from: T, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType
        /* JADX INFO: renamed from: X, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Simple)) {
                return false;
            }
            Simple simple = (Simple) obj;
            return Intrinsics.d(this.f46757a, simple.f46757a) && Intrinsics.d(this.b, simple.b) && Intrinsics.d(this.c, simple.c) && this.d == simple.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ua80.b(ua80.b(this.f46757a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return defpackage.c.c(this.c, ", confirmationCodeNotRequired=", Separators.RPAREN, b1j.n("Simple(actionText=", this.f46757a, ", requestKey=", this.b, ", verificationQuestionType="), this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46757a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType$SmsCode;", "Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class SmsCode implements ConfirmationNewPlaceScreenType {
        public static final Parcelable.Creator<SmsCode> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46758a;
        public final String b;
        public final String c;
        public final SmsCodeExtras d;

        public SmsCode(String str, String str2, String str3, SmsCodeExtras smsCodeExtras) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            smsCodeExtras.getClass();
            this.f46758a = str;
            this.b = str2;
            this.c = str3;
            this.d = smsCodeExtras;
        }

        @Override // org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType
        /* JADX INFO: renamed from: R, reason: from getter */
        public final String getF46758a() {
            return this.f46758a;
        }

        @Override // org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType
        /* JADX INFO: renamed from: T, reason: from getter */
        public final String getC() {
            return this.c;
        }

        @Override // org.xplatform.login.new_place.api.navigation.ConfirmationNewPlaceScreenType
        /* JADX INFO: renamed from: X, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SmsCode)) {
                return false;
            }
            SmsCode smsCode = (SmsCode) obj;
            return Intrinsics.d(this.f46758a, smsCode.f46758a) && Intrinsics.d(this.b, smsCode.b) && Intrinsics.d(this.c, smsCode.c) && Intrinsics.d(this.d, smsCode.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ua80.b(ua80.b(this.f46758a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbN = b1j.n("SmsCode(actionText=", this.f46758a, ", requestKey=", this.b, ", verificationQuestionType=");
            sbN.append(this.c);
            sbN.append(", extras=");
            sbN.append(this.d);
            sbN.append(Separators.RPAREN);
            return sbN.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46758a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeParcelable(this.d, i);
        }
    }

    /* JADX INFO: renamed from: R */
    String getF46758a();

    /* JADX INFO: renamed from: T */
    String getC();

    /* JADX INFO: renamed from: X */
    String getB();
}
