package com.google.android.gms.auth.api.identity;

import a.l8x;
import a.q5x;
import a.s0x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class BeginSignInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PasswordRequestOptions f45464a;
    public final GoogleIdTokenRequestOptions b;
    public final String c;
    public final boolean d;
    public final int e;
    public final PasskeysRequestOptions f;
    public final PasskeyJsonRequestOptions g;
    public final boolean h;

    /* JADX INFO: loaded from: classes2.dex */
    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f45465a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final ArrayList f;
        public final boolean g;

        public GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, ArrayList arrayList, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            s0x.B("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
            this.f45465a = z;
            if (z) {
                s0x.I(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.b = str;
            this.c = str2;
            this.d = z2;
            ArrayList arrayList2 = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList2 = new ArrayList(arrayList);
                Collections.sort(arrayList2);
            }
            this.f = arrayList2;
            this.e = str3;
            this.g = z3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.f45465a == googleIdTokenRequestOptions.f45465a && l8x.Z(this.b, googleIdTokenRequestOptions.b) && l8x.Z(this.c, googleIdTokenRequestOptions.c) && this.d == googleIdTokenRequestOptions.d && l8x.Z(this.e, googleIdTokenRequestOptions.e) && l8x.Z(this.f, googleIdTokenRequestOptions.f) && this.g == googleIdTokenRequestOptions.g;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f45465a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.g)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iP0 = q5x.p0(parcel, 20293);
            q5x.o0(parcel, 1, 4);
            parcel.writeInt(this.f45465a ? 1 : 0);
            q5x.k0(parcel, 2, this.b);
            q5x.k0(parcel, 3, this.c);
            q5x.o0(parcel, 4, 4);
            parcel.writeInt(this.d ? 1 : 0);
            q5x.k0(parcel, 5, this.e);
            q5x.l0(parcel, 6, this.f);
            q5x.o0(parcel, 7, 4);
            parcel.writeInt(this.g ? 1 : 0);
            q5x.q0(parcel, iP0);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f45466a;
        public final String b;

        public PasskeyJsonRequestOptions(String str, boolean z) {
            if (z) {
                s0x.H(str);
            }
            this.f45466a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.f45466a == passkeyJsonRequestOptions.f45466a && l8x.Z(this.b, passkeyJsonRequestOptions.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f45466a), this.b});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iP0 = q5x.p0(parcel, 20293);
            q5x.o0(parcel, 1, 4);
            parcel.writeInt(this.f45466a ? 1 : 0);
            q5x.k0(parcel, 2, this.b);
            q5x.q0(parcel, iP0);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f45467a;
        public final byte[] b;
        public final String c;

        public PasskeysRequestOptions(boolean z, byte[] bArr, String str) {
            if (z) {
                s0x.H(bArr);
                s0x.H(str);
            }
            this.f45467a = z;
            this.b = bArr;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.f45467a == passkeysRequestOptions.f45467a && Arrays.equals(this.b, passkeysRequestOptions.b) && Objects.equals(this.c, passkeysRequestOptions.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.b) + (Objects.hash(Boolean.valueOf(this.f45467a), this.c) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iP0 = q5x.p0(parcel, 20293);
            q5x.o0(parcel, 1, 4);
            parcel.writeInt(this.f45467a ? 1 : 0);
            q5x.e0(parcel, 2, this.b);
            q5x.k0(parcel, 3, this.c);
            q5x.q0(parcel, iP0);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f45468a;

        public PasswordRequestOptions(boolean z) {
            this.f45468a = z;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.f45468a == ((PasswordRequestOptions) obj).f45468a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f45468a)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int iP0 = q5x.p0(parcel, 20293);
            q5x.o0(parcel, 1, 4);
            parcel.writeInt(this.f45468a ? 1 : 0);
            q5x.q0(parcel, iP0);
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z, int i, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z2) {
        s0x.H(passwordRequestOptions);
        this.f45464a = passwordRequestOptions;
        s0x.H(googleIdTokenRequestOptions);
        this.b = googleIdTokenRequestOptions;
        this.c = str;
        this.d = z;
        this.e = i;
        this.f = passkeysRequestOptions == null ? new PasskeysRequestOptions(false, null, null) : passkeysRequestOptions;
        this.g = passkeyJsonRequestOptions == null ? new PasskeyJsonRequestOptions(null, false) : passkeyJsonRequestOptions;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return l8x.Z(this.f45464a, beginSignInRequest.f45464a) && l8x.Z(this.b, beginSignInRequest.b) && l8x.Z(this.f, beginSignInRequest.f) && l8x.Z(this.g, beginSignInRequest.g) && l8x.Z(this.c, beginSignInRequest.c) && this.d == beginSignInRequest.d && this.e == beginSignInRequest.e && this.h == beginSignInRequest.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f45464a, this.b, this.f, this.g, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.j0(parcel, 1, this.f45464a, i);
        q5x.j0(parcel, 2, this.b, i);
        q5x.k0(parcel, 3, this.c);
        q5x.o0(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        q5x.o0(parcel, 5, 4);
        parcel.writeInt(this.e);
        q5x.j0(parcel, 6, this.f, i);
        q5x.j0(parcel, 7, this.g, i);
        q5x.o0(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        q5x.q0(parcel, iP0);
    }
}
