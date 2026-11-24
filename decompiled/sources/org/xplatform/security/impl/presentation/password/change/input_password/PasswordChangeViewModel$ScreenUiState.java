package org.xplatform.security.impl.presentation.password.change.input_password;

import a.b1j;
import a.kng0;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"org/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState", "Landroid/os/Parcelable;", "Default", "PasswordInputted", "IncorrectPassword", "Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$Default;", "Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$IncorrectPassword;", "Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$PasswordInputted;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class PasswordChangeViewModel$ScreenUiState implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46956a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$Default;", "Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Default extends PasswordChangeViewModel$ScreenUiState {
        public static final Default b = new Default("");
        public static final Parcelable.Creator<Default> CREATOR = new b();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Default);
        }

        public final int hashCode() {
            return 1129383491;
        }

        public final String toString() {
            return "Default";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$IncorrectPassword;", "Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class IncorrectPassword extends PasswordChangeViewModel$ScreenUiState {
        public static final Parcelable.Creator<IncorrectPassword> CREATOR = new c();
        public final String b;
        public final String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IncorrectPassword(String str, String str2) {
            super(str);
            str.getClass();
            str2.getClass();
            this.b = str;
            this.c = str2;
        }

        @Override // org.xplatform.security.impl.presentation.password.change.input_password.PasswordChangeViewModel$ScreenUiState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF46956a() {
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
            if (!(obj instanceof IncorrectPassword)) {
                return false;
            }
            IncorrectPassword incorrectPassword = (IncorrectPassword) obj;
            return Intrinsics.d(this.b, incorrectPassword.b) && Intrinsics.d(this.c, incorrectPassword.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return b1j.k("IncorrectPassword(password=", this.b, ", errorMessage=", this.c, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.b);
            parcel.writeString(this.c);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState$PasswordInputted;", "Lorg/xplatform/security/impl/presentation/password/change/input_password/PasswordChangeViewModel$ScreenUiState;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class PasswordInputted extends PasswordChangeViewModel$ScreenUiState {
        public static final Parcelable.Creator<PasswordInputted> CREATOR = new d();
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PasswordInputted(String str) {
            super(str);
            str.getClass();
            this.b = str;
        }

        @Override // org.xplatform.security.impl.presentation.password.change.input_password.PasswordChangeViewModel$ScreenUiState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF46956a() {
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
            return (obj instanceof PasswordInputted) && Intrinsics.d(this.b, ((PasswordInputted) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return kng0.l("PasswordInputted(password=", this.b, Separators.RPAREN);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.b);
        }
    }

    public PasswordChangeViewModel$ScreenUiState(String str) {
        this.f46956a = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getF46956a() {
        return this.f46956a;
    }
}
