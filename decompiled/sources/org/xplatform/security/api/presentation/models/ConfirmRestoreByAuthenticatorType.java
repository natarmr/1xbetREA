package org.xplatform.security.api.presentation.models;

import a.b1j;
import a.cs0;
import a.dw9;
import a.obk0;
import a.swp0;
import a.ua80;
import a.we50;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType;", "Landroid/os/Parcelable;", "Migration", "ConfirmByAuthenticator", "Confirmation", "Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$ConfirmByAuthenticator;", "Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$Confirmation;", "Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$Migration;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ConfirmRestoreByAuthenticatorType extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$ConfirmByAuthenticator;", "Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ConfirmByAuthenticator implements ConfirmRestoreByAuthenticatorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ConfirmByAuthenticator f46929a = new ConfirmByAuthenticator();
        public static final Parcelable.Creator<ConfirmByAuthenticator> CREATOR = new a();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ConfirmByAuthenticator);
        }

        public final int hashCode() {
            return 1641041511;
        }

        public final String toString() {
            return "ConfirmByAuthenticator";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$Confirmation;", "Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Confirmation implements ConfirmRestoreByAuthenticatorType {
        public static final Parcelable.Creator<Confirmation> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f46930a;
        public final String b;
        public final String c;
        public final swp0 d;
        public final List e;
        public final List f;
        public final we50 g;

        public Confirmation(String str, String str2, String str3, swp0 swp0Var, List list, List list2, we50 we50Var) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            swp0Var.getClass();
            list.getClass();
            list2.getClass();
            we50Var.getClass();
            this.f46930a = str;
            this.b = str2;
            this.c = str3;
            this.d = swp0Var;
            this.e = list;
            this.f = list2;
            this.g = we50Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) obj;
            return Intrinsics.d(this.f46930a, confirmation.f46930a) && Intrinsics.d(this.b, confirmation.b) && Intrinsics.d(this.c, confirmation.c) && Intrinsics.d(this.d, confirmation.d) && Intrinsics.d(this.e, confirmation.e) && Intrinsics.d(this.f, confirmation.f) && this.g == confirmation.g;
        }

        public final int hashCode() {
            return this.g.hashCode() + dw9.a(dw9.a((this.d.hashCode() + ua80.b(ua80.b(this.f46930a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sbN = b1j.n("Confirmation(phoneNumber=", this.f46930a, ", countyCodeDigits=", this.b, ", phoneDigits=");
            sbN.append(this.c);
            sbN.append(", token=");
            sbN.append(this.d);
            sbN.append(", availableActivationTypeList=");
            b1j.y(", availableRepeatActivationTypeList=", ", navigation=", sbN, this.e, this.f);
            sbN.append(this.g);
            sbN.append(Separators.RPAREN);
            return sbN.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f46930a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeSerializable(this.d);
            Iterator itT = cs0.t(this.e, parcel);
            while (itT.hasNext()) {
                parcel.writeString(((obk0) itT.next()).name());
            }
            Iterator itT2 = cs0.t(this.f, parcel);
            while (itT2.hasNext()) {
                parcel.writeString(((obk0) itT2.next()).name());
            }
            parcel.writeString(this.g.name());
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType$Migration;", "Lorg/xplatform/security/api/presentation/models/ConfirmRestoreByAuthenticatorType;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Migration implements ConfirmRestoreByAuthenticatorType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Migration f46931a = new Migration();
        public static final Parcelable.Creator<Migration> CREATOR = new c();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Migration);
        }

        public final int hashCode() {
            return 562584323;
        }

        public final String toString() {
            return "Migration";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
