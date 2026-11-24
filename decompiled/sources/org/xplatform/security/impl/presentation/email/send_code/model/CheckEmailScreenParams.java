package org.xplatform.security.impl.presentation.email.send_code.model;

import a.swp0;
import a.twn;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.security.api.navigation.SecurityNavigationScreen;
import org.xplatform.security.api.presentation.models.SendEmailIntention;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/security/impl/presentation/email/send_code/model/CheckEmailScreenParams;", "Landroid/os/Parcelable;", "BindEmail", "Registration", "RestorePassword", "Lorg/xplatform/security/impl/presentation/email/send_code/model/CheckEmailScreenParams$BindEmail;", "Lorg/xplatform/security/impl/presentation/email/send_code/model/CheckEmailScreenParams$Registration;", "Lorg/xplatform/security/impl/presentation/email/send_code/model/CheckEmailScreenParams$RestorePassword;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface CheckEmailScreenParams extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/impl/presentation/email/send_code/model/CheckEmailScreenParams$BindEmail;", "Lorg/xplatform/security/impl/presentation/email/send_code/model/CheckEmailScreenParams;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class BindEmail implements CheckEmailScreenParams {
        public static final Parcelable.Creator<BindEmail> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final swp0 f46952a;
        public final int b;
        public final SendEmailIntention c;
        public final SecurityNavigationScreen d;

        public BindEmail(swp0 swp0Var, int i, SendEmailIntention sendEmailIntention, SecurityNavigationScreen securityNavigationScreen) {
            swp0Var.getClass();
            sendEmailIntention.getClass();
            securityNavigationScreen.getClass();
            this.f46952a = swp0Var;
            this.b = i;
            this.c = sendEmailIntention;
            this.d = securityNavigationScreen;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BindEmail)) {
                return false;
            }
            BindEmail bindEmail = (BindEmail) obj;
            return Intrinsics.d(this.f46952a, bindEmail.f46952a) && this.b == bindEmail.b && Intrinsics.d(this.c, bindEmail.c) && Intrinsics.d(this.d, bindEmail.d);
        }

        @Override // org.xplatform.security.impl.presentation.email.send_code.model.CheckEmailScreenParams
        /* JADX INFO: renamed from: getToken, reason: from getter */
        public final swp0 getF46954a() {
            return this.f46952a;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, this.f46952a.hashCode() * 31, 31)) * 31);
        }

        @Override // org.xplatform.security.impl.presentation.email.send_code.model.CheckEmailScreenParams
        /* JADX INFO: renamed from: n0, reason: from getter */
        public final int getB() {
            return this.b;
        }

        public final String toString() {
            return "BindEmail(token=" + this.f46952a + ", timeInSeconds=" + this.b + ", sendEmailIntention=" + this.c + ", onTokenExpiredNavigationScreen=" + this.d + Separators.RPAREN;
        }

        @Override // org.xplatform.security.impl.presentation.email.send_code.model.CheckEmailScreenParams
        /* JADX INFO: renamed from: w, reason: from getter */
        public final SendEmailIntention getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.f46952a);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/impl/presentation/email/send_code/model/CheckEmailScreenParams$Registration;", "Lorg/xplatform/security/impl/presentation/email/send_code/model/CheckEmailScreenParams;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Registration implements CheckEmailScreenParams {
        public static final Parcelable.Creator<Registration> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final swp0 f46953a;
        public final int b;
        public final SendEmailIntention c;

        public Registration(swp0 swp0Var, int i, SendEmailIntention sendEmailIntention) {
            swp0Var.getClass();
            sendEmailIntention.getClass();
            this.f46953a = swp0Var;
            this.b = i;
            this.c = sendEmailIntention;
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
            return Intrinsics.d(this.f46953a, registration.f46953a) && this.b == registration.b && Intrinsics.d(this.c, registration.c);
        }

        @Override // org.xplatform.security.impl.presentation.email.send_code.model.CheckEmailScreenParams
        /* JADX INFO: renamed from: getToken, reason: from getter */
        public final swp0 getF46954a() {
            return this.f46953a;
        }

        public final int hashCode() {
            return this.c.hashCode() + twn.a(this.b, this.f46953a.hashCode() * 31, 31);
        }

        @Override // org.xplatform.security.impl.presentation.email.send_code.model.CheckEmailScreenParams
        /* JADX INFO: renamed from: n0, reason: from getter */
        public final int getB() {
            return this.b;
        }

        public final String toString() {
            return "Registration(token=" + this.f46953a + ", timeInSeconds=" + this.b + ", sendEmailIntention=" + this.c + Separators.RPAREN;
        }

        @Override // org.xplatform.security.impl.presentation.email.send_code.model.CheckEmailScreenParams
        /* JADX INFO: renamed from: w, reason: from getter */
        public final SendEmailIntention getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.f46953a);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/impl/presentation/email/send_code/model/CheckEmailScreenParams$RestorePassword;", "Lorg/xplatform/security/impl/presentation/email/send_code/model/CheckEmailScreenParams;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class RestorePassword implements CheckEmailScreenParams {
        public static final Parcelable.Creator<RestorePassword> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final swp0 f46954a;
        public final int b;
        public final SendEmailIntention c;

        public RestorePassword(swp0 swp0Var, int i, SendEmailIntention sendEmailIntention) {
            swp0Var.getClass();
            sendEmailIntention.getClass();
            this.f46954a = swp0Var;
            this.b = i;
            this.c = sendEmailIntention;
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
            return Intrinsics.d(this.f46954a, restorePassword.f46954a) && this.b == restorePassword.b && Intrinsics.d(this.c, restorePassword.c);
        }

        @Override // org.xplatform.security.impl.presentation.email.send_code.model.CheckEmailScreenParams
        /* JADX INFO: renamed from: getToken, reason: from getter */
        public final swp0 getF46954a() {
            return this.f46954a;
        }

        public final int hashCode() {
            return this.c.hashCode() + twn.a(this.b, this.f46954a.hashCode() * 31, 31);
        }

        @Override // org.xplatform.security.impl.presentation.email.send_code.model.CheckEmailScreenParams
        /* JADX INFO: renamed from: n0, reason: from getter */
        public final int getB() {
            return this.b;
        }

        public final String toString() {
            return "RestorePassword(token=" + this.f46954a + ", timeInSeconds=" + this.b + ", sendEmailIntention=" + this.c + Separators.RPAREN;
        }

        @Override // org.xplatform.security.impl.presentation.email.send_code.model.CheckEmailScreenParams
        /* JADX INFO: renamed from: w, reason: from getter */
        public final SendEmailIntention getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeSerializable(this.f46954a);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, i);
        }
    }

    /* JADX INFO: renamed from: getToken */
    swp0 getF46954a();

    /* JADX INFO: renamed from: n0 */
    int getB();

    /* JADX INFO: renamed from: w */
    SendEmailIntention getC();
}
