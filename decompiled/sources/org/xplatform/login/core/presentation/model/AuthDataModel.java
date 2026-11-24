package org.xplatform.login.core.presentation.model;

import a.axq;
import a.b1j;
import a.cs0;
import a.f140;
import a.kng0;
import a.twn;
import a.ua80;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007Ê\u0001\u0002\b\t¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/login/core/presentation/model/AuthDataModel;", "Landroid/os/Parcelable;", "Social", "User", "Qr", "Lorg/xplatform/login/core/presentation/model/AuthDataModel$Qr;", "Lorg/xplatform/login/core/presentation/model/AuthDataModel$Social;", "Lorg/xplatform/login/core/presentation/model/AuthDataModel$User;", "core", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface AuthDataModel extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lorg/xplatform/login/core/presentation/model/AuthDataModel$Qr;", "Lorg/xplatform/login/core/presentation/model/AuthDataModel;", "value", "", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Qr implements AuthDataModel {
        public static final Parcelable.Creator<Qr> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46753a;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Qr) {
                return Intrinsics.d(this.f46753a, ((Qr) obj).f46753a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f46753a.hashCode();
        }

        public final String toString() {
            return kng0.l("Qr(value=", this.f46753a, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.getClass();
            parcel.writeString(this.f46753a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/login/core/presentation/model/AuthDataModel$Social;", "Lorg/xplatform/login/core/presentation/model/AuthDataModel;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Social implements AuthDataModel {
        public static final Parcelable.Creator<Social> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46754a;
        public final int b;
        public final String c;
        public final String d;
        public final String e;

        public Social(int i, String str, String str2, String str3, String str4) {
            cs0.x(str, str2, str3, str4);
            this.f46754a = str;
            this.b = i;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Social)) {
                return false;
            }
            Social social = (Social) obj;
            return Intrinsics.d(this.f46754a, social.f46754a) && this.b == social.b && Intrinsics.d(this.c, social.c) && Intrinsics.d(this.d, social.d) && Intrinsics.d(this.e, social.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ua80.b(ua80.b(twn.a(this.b, this.f46754a.hashCode() * 31, 31), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sbP = kng0.p(this.b, "Social(userSocialId=", this.f46754a, ", social=", ", socialToken=");
            f140.v(sbP, this.c, ", socialTokenSecret=", this.d, ", socialAppKey=");
            return axq.n(sbP, this.e, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46754a);
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/login/core/presentation/model/AuthDataModel$User;", "Lorg/xplatform/login/core/presentation/model/AuthDataModel;", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class User implements AuthDataModel {
        public static final Parcelable.Creator<User> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46755a;
        public final String b;
        public final String c;
        public final String d;

        public User(String str, String str2, String str3, String str4) {
            cs0.x(str, str2, str3, str4);
            this.f46755a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            return Intrinsics.d(this.f46755a, user.f46755a) && Intrinsics.d(this.b, user.b) && Intrinsics.d(this.c, user.c) && Intrinsics.d(this.d, user.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ua80.b(ua80.b(this.f46755a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return ua80.m(b1j.n("User(login=", this.f46755a, ", password=", this.b, ", phoneCode="), this.c, ", phoneBody=", this.d, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46755a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
        }
    }
}
