package org.xplatform.security.api.presentation.models;

import a.swp0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;", "Landroid/os/Parcelable;", "BindEmail", "Registration", "RestorePassword", "Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$BindEmail;", "Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$Registration;", "Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$RestorePassword;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ConfirmSendEmailScreenParams extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$BindEmail;", "Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class BindEmail implements ConfirmSendEmailScreenParams {
        public static final Parcelable.Creator<BindEmail> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SendEmailIntention.Bind f46932a;

        public BindEmail(SendEmailIntention.Bind bind) {
            bind.getClass();
            this.f46932a = bind;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BindEmail) && Intrinsics.d(this.f46932a, ((BindEmail) obj).f46932a);
        }

        public final int hashCode() {
            return this.f46932a.hashCode();
        }

        public final String toString() {
            return "BindEmail(sendEmailIntention=" + this.f46932a + Separators.RPAREN;
        }

        @Override // org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams
        public final SendEmailIntention w() {
            return this.f46932a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.f46932a.writeToParcel(parcel, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$Registration;", "Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Registration implements ConfirmSendEmailScreenParams {
        public static final Parcelable.Creator<Registration> CREATOR = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SendEmailIntention.Registration f46933a;
        public final swp0 b;

        public Registration(SendEmailIntention.Registration registration, swp0 swp0Var) {
            registration.getClass();
            swp0Var.getClass();
            this.f46933a = registration;
            this.b = swp0Var;
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
            return Intrinsics.d(this.f46933a, registration.f46933a) && Intrinsics.d(this.b, registration.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f46933a.hashCode() * 31);
        }

        public final String toString() {
            return "Registration(sendEmailIntention=" + this.f46933a + ", token=" + this.b + Separators.RPAREN;
        }

        @Override // org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams
        public final SendEmailIntention w() {
            return this.f46933a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.f46933a.writeToParcel(parcel, i);
            parcel.writeSerializable(this.b);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams$RestorePassword;", "Lorg/xplatform/security/api/presentation/models/ConfirmSendEmailScreenParams;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class RestorePassword implements ConfirmSendEmailScreenParams {
        public static final Parcelable.Creator<RestorePassword> CREATOR = new f();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SendEmailIntention.RestorePassword f46934a;
        public final swp0 b;

        public RestorePassword(SendEmailIntention.RestorePassword restorePassword, swp0 swp0Var) {
            restorePassword.getClass();
            swp0Var.getClass();
            this.f46934a = restorePassword;
            this.b = swp0Var;
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
            return Intrinsics.d(this.f46934a, restorePassword.f46934a) && Intrinsics.d(this.b, restorePassword.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f46934a.hashCode() * 31);
        }

        public final String toString() {
            return "RestorePassword(sendEmailIntention=" + this.f46934a + ", token=" + this.b + Separators.RPAREN;
        }

        @Override // org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams
        public final SendEmailIntention w() {
            return this.f46934a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.f46934a.writeToParcel(parcel, i);
            parcel.writeSerializable(this.b);
        }
    }

    SendEmailIntention w();
}
