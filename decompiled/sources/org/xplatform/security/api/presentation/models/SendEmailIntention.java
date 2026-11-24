package org.xplatform.security.api.presentation.models;

import a.b1j;
import a.f140;
import a.kng0;
import a.ohs0;
import a.rw2;
import a.rz4;
import a.twn;
import a.ua80;
import a.we50;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.security.api.navigation.EndFlowNavigation;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/security/api/presentation/models/SendEmailIntention;", "Landroid/os/Parcelable;", "Bind", "Registration", "RestorePassword", "Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Bind;", "Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Registration;", "Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface SendEmailIntention extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Bind;", "Lorg/xplatform/security/api/presentation/models/SendEmailIntention;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Bind implements SendEmailIntention {
        public static final Parcelable.Creator<Bind> CREATOR = new j();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46938a;
        public final EndFlowNavigation b;
        public final int c;

        public Bind(String str, EndFlowNavigation endFlowNavigation, int i) {
            str.getClass();
            endFlowNavigation.getClass();
            this.f46938a = str;
            this.b = endFlowNavigation;
            this.c = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Bind)) {
                return false;
            }
            Bind bind = (Bind) obj;
            return Intrinsics.d(this.f46938a, bind.f46938a) && Intrinsics.d(this.b, bind.b) && this.c == bind.c;
        }

        @Override // org.xplatform.security.api.presentation.models.SendEmailIntention
        /* JADX INFO: renamed from: getEmail, reason: from getter */
        public final String getF46940a() {
            return this.f46938a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.f46938a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Bind(email=");
            sb.append(this.f46938a);
            sb.append(", onSuccessFlowNavigation=");
            sb.append(this.b);
            sb.append(", confirmTypeAlias=");
            return rz4.j(this.c, Separators.RPAREN, sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46938a);
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.c);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/presentation/models/SendEmailIntention$Registration;", "Lorg/xplatform/security/api/presentation/models/SendEmailIntention;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Registration implements SendEmailIntention {
        public static final Parcelable.Creator<Registration> CREATOR = new k();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46939a;
        public final String b;
        public final int c;
        public final String d;
        public final String e;
        public final String f;
        public final long g;
        public final String h;
        public final String i;
        public final Integer j;

        public Registration(String str, String str2, int i, String str3, String str4, String str5, long j, String str6, String str7, Integer num) {
            ohs0.z(str, str2, str3, str4, str5);
            str6.getClass();
            str7.getClass();
            this.f46939a = str;
            this.b = str2;
            this.c = i;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = j;
            this.h = str6;
            this.i = str7;
            this.j = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Registration)) {
                return false;
            }
            Registration registration = (Registration) obj;
            return Intrinsics.d(this.f46939a, registration.f46939a) && Intrinsics.d(this.b, registration.b) && this.c == registration.c && Intrinsics.d(this.d, registration.d) && Intrinsics.d(this.e, registration.e) && Intrinsics.d(this.f, registration.f) && this.g == registration.g && Intrinsics.d(this.h, registration.h) && Intrinsics.d(this.i, registration.i) && Intrinsics.d(this.j, registration.j);
        }

        @Override // org.xplatform.security.api.presentation.models.SendEmailIntention
        /* JADX INFO: renamed from: getEmail, reason: from getter */
        public final String getF46940a() {
            return this.f46939a;
        }

        public final int hashCode() {
            int iB = ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(ua80.b(twn.a(this.c, ua80.b(this.f46939a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
            Integer num = this.j;
            return iB + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sbN = b1j.n("Registration(email=", this.f46939a, ", promoCode=", this.b, ", registrationTypeId=");
            kng0.w(this.c, ", countryName=", this.d, ", currencyName=", sbN);
            f140.v(sbN, this.e, ", bonusName=", this.f, ", countryId=");
            kng0.z(sbN, this.g, ", countryCode=", this.h);
            sbN.append(", referralLink=");
            sbN.append(this.i);
            sbN.append(", socialTypeId=");
            sbN.append(this.j);
            sbN.append(Separators.RPAREN);
            return sbN.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46939a);
            parcel.writeString(this.b);
            parcel.writeInt(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeLong(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            Integer num = this.j;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                kng0.y(parcel, 1, num);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/presentation/models/SendEmailIntention$RestorePassword;", "Lorg/xplatform/security/api/presentation/models/SendEmailIntention;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class RestorePassword implements SendEmailIntention {
        public static final Parcelable.Creator<RestorePassword> CREATOR = new l();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46940a;
        public final we50 b;

        public RestorePassword(String str, we50 we50Var) {
            str.getClass();
            we50Var.getClass();
            this.f46940a = str;
            this.b = we50Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RestorePassword)) {
                return false;
            }
            RestorePassword restorePassword = (RestorePassword) obj;
            return Intrinsics.d(this.f46940a, restorePassword.f46940a) && this.b == restorePassword.b;
        }

        @Override // org.xplatform.security.api.presentation.models.SendEmailIntention
        /* JADX INFO: renamed from: getEmail, reason: from getter */
        public final String getF46940a() {
            return this.f46940a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f46940a.hashCode() * 31);
        }

        public final String toString() {
            return "RestorePassword(email=" + this.f46940a + ", navigation=" + this.b + Separators.RPAREN;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46940a);
            parcel.writeString(this.b.name());
        }
    }

    /* JADX INFO: renamed from: getEmail */
    String getF46940a();
}
