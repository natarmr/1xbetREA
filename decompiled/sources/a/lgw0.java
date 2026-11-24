package a;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.internal.p000firebaseauthapi.zzaje;
import com.google.android.gms.internal.p000firebaseauthapi.zzajg;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.TwitterAuthCredential;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaf;
import com.google.firebase.auth.internal.zzaj;
import com.google.firebase.auth.internal.zzao;
import com.google.firebase.auth.internal.zzbl;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lgw0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20026a;

    public /* synthetic */ lgw0(byte b) {
        this.f20026a = b;
    }

    public static void a(zzbh zzbhVar, Parcel parcel, int i) {
        String str = zzbhVar.f45544a;
        int iP0 = q5x.p0(parcel, 20293);
        q5x.k0(parcel, 2, str);
        q5x.j0(parcel, 3, zzbhVar.b, i);
        q5x.k0(parcel, 4, zzbhVar.c);
        long j = zzbhVar.d;
        q5x.o0(parcel, 5, 8);
        parcel.writeLong(j);
        long j2 = zzbhVar.e;
        q5x.o0(parcel, 6, 8);
        parcel.writeLong(j2);
        q5x.q0(parcel, iP0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jX = 0;
        boolean zT = false;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        String strD = null;
        String strD2 = null;
        String strD3 = null;
        ArrayList arrayListG = null;
        Bundle bundleY = null;
        ArrayList arrayListG2 = null;
        String strD4 = null;
        String strD5 = null;
        Bundle bundleY2 = null;
        String strD6 = null;
        String strD7 = null;
        String strD8 = null;
        String strD9 = null;
        switch (this.f20026a) {
            case 0:
                int iI0 = b5x.i0(parcel);
                int iW5 = 0;
                int iW6 = 0;
                int iW7 = 0;
                boolean zT2 = false;
                boolean zT3 = false;
                while (parcel.dataPosition() < iI0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iW5 = b5x.W(parcel, i);
                    } else if (c == 2) {
                        zT2 = b5x.T(parcel, i);
                    } else if (c == 3) {
                        zT3 = b5x.T(parcel, i);
                    } else if (c == 4) {
                        iW6 = b5x.W(parcel, i);
                    } else if (c != 5) {
                        b5x.b0(parcel, i);
                    } else {
                        iW7 = b5x.W(parcel, i);
                    }
                }
                b5x.H(parcel, iI0);
                return new RootTelemetryConfiguration(iW5, iW6, iW7, zT2, zT3);
            case 1:
                int iI1 = b5x.i0(parcel);
                long jX2 = 0;
                long jX3 = 0;
                long jX4 = 0;
                boolean zT4 = false;
                String strD10 = null;
                String strD11 = null;
                zzpl zzplVar = null;
                String strD12 = null;
                zzbh zzbhVar = null;
                zzbh zzbhVar2 = null;
                zzbh zzbhVar3 = null;
                while (parcel.dataPosition() < iI1) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 2:
                            strD10 = b5x.D(parcel, i2);
                            break;
                        case 3:
                            strD11 = b5x.D(parcel, i2);
                            break;
                        case 4:
                            zzplVar = (zzpl) b5x.C(parcel, i2, zzpl.CREATOR);
                            break;
                        case 5:
                            jX2 = b5x.X(parcel, i2);
                            break;
                        case 6:
                            zT4 = b5x.T(parcel, i2);
                            break;
                        case 7:
                            strD12 = b5x.D(parcel, i2);
                            break;
                        case '\b':
                            zzbhVar = (zzbh) b5x.C(parcel, i2, zzbh.CREATOR);
                            break;
                        case '\t':
                            jX3 = b5x.X(parcel, i2);
                            break;
                        case '\n':
                            zzbhVar2 = (zzbh) b5x.C(parcel, i2, zzbh.CREATOR);
                            break;
                        case 11:
                            jX4 = b5x.X(parcel, i2);
                            break;
                        case '\f':
                            zzbhVar3 = (zzbh) b5x.C(parcel, i2, zzbh.CREATOR);
                            break;
                        default:
                            b5x.b0(parcel, i2);
                            break;
                    }
                }
                b5x.H(parcel, iI1);
                return new zzah(strD10, strD11, zzplVar, jX2, zT4, strD12, zzbhVar, jX3, zzbhVar2, jX4, zzbhVar3);
            case 2:
                int iI2 = b5x.i0(parcel);
                long jX5 = 0;
                while (parcel.dataPosition() < iI2) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        jX = b5x.X(parcel, i3);
                    } else if (c2 != 2) {
                        b5x.b0(parcel, i3);
                    } else {
                        jX5 = b5x.X(parcel, i3);
                    }
                }
                b5x.H(parcel, iI2);
                return new zzaf(jX, jX5);
            case 3:
                int iI3 = b5x.i0(parcel);
                Long lY = null;
                Long lY2 = null;
                String strD13 = null;
                String strD14 = null;
                String strD15 = null;
                while (parcel.dataPosition() < iI3) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 2) {
                        strD13 = b5x.D(parcel, i4);
                    } else if (c3 == 3) {
                        strD14 = b5x.D(parcel, i4);
                    } else if (c3 == 4) {
                        lY = b5x.Y(parcel, i4);
                    } else if (c3 == 5) {
                        strD15 = b5x.D(parcel, i4);
                    } else if (c3 != 6) {
                        b5x.b0(parcel, i4);
                    } else {
                        lY2 = b5x.Y(parcel, i4);
                    }
                }
                b5x.H(parcel, iI3);
                return new zzaia(lY, lY2, strD13, strD14, strD15);
            case 4:
                int iI4 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI4) {
                    b5x.b0(parcel, parcel.readInt());
                }
                b5x.H(parcel, iI4);
                return new zzaje();
            case 5:
                int iI5 = b5x.i0(parcel);
                boolean zT5 = false;
                boolean zT6 = false;
                String strD16 = null;
                String strD17 = null;
                String strD18 = null;
                String strD19 = null;
                String strD20 = null;
                String strD21 = null;
                String strD22 = null;
                String strD23 = null;
                String strD24 = null;
                String strD25 = null;
                String strD26 = null;
                String strD27 = null;
                while (parcel.dataPosition() < iI5) {
                    int i5 = parcel.readInt();
                    String str = strD25;
                    switch ((char) i5) {
                        case 2:
                            strD = b5x.D(parcel, i5);
                            break;
                        case 3:
                            strD16 = b5x.D(parcel, i5);
                            break;
                        case 4:
                            strD17 = b5x.D(parcel, i5);
                            break;
                        case 5:
                            strD18 = b5x.D(parcel, i5);
                            break;
                        case 6:
                            strD19 = b5x.D(parcel, i5);
                            break;
                        case 7:
                            strD20 = b5x.D(parcel, i5);
                            break;
                        case '\b':
                            strD21 = b5x.D(parcel, i5);
                            break;
                        case '\t':
                            strD22 = b5x.D(parcel, i5);
                            break;
                        case '\n':
                            zT = b5x.T(parcel, i5);
                            break;
                        case 11:
                            zT5 = b5x.T(parcel, i5);
                            break;
                        case '\f':
                            strD23 = b5x.D(parcel, i5);
                            break;
                        case '\r':
                            strD24 = b5x.D(parcel, i5);
                            break;
                        case 14:
                            strD25 = b5x.D(parcel, i5);
                            continue;
                        case 15:
                            strD26 = b5x.D(parcel, i5);
                            break;
                        case 16:
                            zT6 = b5x.T(parcel, i5);
                            break;
                        case 17:
                            strD27 = b5x.D(parcel, i5);
                            break;
                        default:
                            b5x.b0(parcel, i5);
                            break;
                    }
                    strD25 = str;
                }
                b5x.H(parcel, iI5);
                zzajg zzajgVar = new zzajg();
                zzajgVar.f45524a = strD;
                zzajgVar.b = strD16;
                zzajgVar.c = strD17;
                zzajgVar.d = strD18;
                zzajgVar.e = strD19;
                zzajgVar.f = strD20;
                zzajgVar.g = strD21;
                zzajgVar.h = strD22;
                zzajgVar.i = zT;
                zzajgVar.j = zT5;
                zzajgVar.k = strD23;
                zzajgVar.l = strD24;
                zzajgVar.m = strD25;
                zzajgVar.n = strD26;
                zzajgVar.o = zT6;
                zzajgVar.p = strD27;
                return zzajgVar;
            case 6:
                int iI6 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI6) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        b5x.b0(parcel, i6);
                    } else {
                        strD9 = b5x.D(parcel, i6);
                    }
                }
                b5x.H(parcel, iI6);
                return new GithubAuthCredential(strD9);
            case 7:
                int iI7 = b5x.i0(parcel);
                String strD28 = null;
                while (parcel.dataPosition() < iI7) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 1) {
                        strD8 = b5x.D(parcel, i7);
                    } else if (c4 != 2) {
                        b5x.b0(parcel, i7);
                    } else {
                        strD28 = b5x.D(parcel, i7);
                    }
                }
                b5x.H(parcel, iI7);
                return new GoogleAuthCredential(strD8, strD28);
            case 8:
                int iI8 = b5x.i0(parcel);
                ArrayList arrayListG3 = null;
                zzao zzaoVar = null;
                String strD29 = null;
                com.google.firebase.auth.zzc zzcVar = null;
                zzad zzadVar = null;
                ArrayList arrayListG4 = null;
                while (parcel.dataPosition() < iI8) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 1:
                            arrayListG3 = b5x.G(parcel, i8, PhoneMultiFactorInfo.CREATOR);
                            break;
                        case 2:
                            zzaoVar = (zzao) b5x.C(parcel, i8, zzao.CREATOR);
                            break;
                        case 3:
                            strD29 = b5x.D(parcel, i8);
                            break;
                        case 4:
                            zzcVar = (com.google.firebase.auth.zzc) b5x.C(parcel, i8, com.google.firebase.auth.zzc.CREATOR);
                            break;
                        case 5:
                            zzadVar = (zzad) b5x.C(parcel, i8, zzad.CREATOR);
                            break;
                        case 6:
                            arrayListG4 = b5x.G(parcel, i8, TotpMultiFactorInfo.CREATOR);
                            break;
                        default:
                            b5x.b0(parcel, i8);
                            break;
                    }
                }
                b5x.H(parcel, iI8);
                return new zzaj(arrayListG3, zzaoVar, strD29, zzcVar, zzadVar, arrayListG4);
            case 9:
                int iI9 = b5x.i0(parcel);
                String strD30 = null;
                String strD31 = null;
                while (parcel.dataPosition() < iI9) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 1) {
                        strD7 = b5x.D(parcel, i9);
                    } else if (c5 == 2) {
                        strD30 = b5x.D(parcel, i9);
                    } else if (c5 != 3) {
                        b5x.b0(parcel, i9);
                    } else {
                        strD31 = b5x.D(parcel, i9);
                    }
                }
                b5x.H(parcel, iI9);
                return new com.google.firebase.auth.zzao(strD7, strD30, strD31);
            case 10:
                int iI10 = b5x.i0(parcel);
                String strD32 = null;
                ArrayList arrayListG5 = null;
                ArrayList arrayListG6 = null;
                zzad zzadVar2 = null;
                while (parcel.dataPosition() < iI10) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 1) {
                        strD6 = b5x.D(parcel, i10);
                    } else if (c6 == 2) {
                        strD32 = b5x.D(parcel, i10);
                    } else if (c6 == 3) {
                        arrayListG5 = b5x.G(parcel, i10, PhoneMultiFactorInfo.CREATOR);
                    } else if (c6 == 4) {
                        arrayListG6 = b5x.G(parcel, i10, TotpMultiFactorInfo.CREATOR);
                    } else if (c6 != 5) {
                        b5x.b0(parcel, i10);
                    } else {
                        zzadVar2 = (zzad) b5x.C(parcel, i10, zzad.CREATOR);
                    }
                }
                b5x.H(parcel, iI10);
                zzao zzaoVar2 = new zzao();
                zzaoVar2.f45655a = strD6;
                zzaoVar2.b = strD32;
                zzaoVar2.c = arrayListG5;
                zzaoVar2.d = arrayListG6;
                zzaoVar2.e = zzadVar2;
                return zzaoVar2;
            case 11:
                int iI11 = b5x.i0(parcel);
                String strD33 = null;
                String strD34 = null;
                byte[] bArrZ = null;
                AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
                AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
                AuthenticatorErrorResponse authenticatorErrorResponse = null;
                AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
                String strD35 = null;
                while (parcel.dataPosition() < iI11) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            strD33 = b5x.D(parcel, i11);
                            break;
                        case 2:
                            strD34 = b5x.D(parcel, i11);
                            break;
                        case 3:
                            bArrZ = b5x.z(parcel, i11);
                            break;
                        case 4:
                            authenticatorAttestationResponse = (AuthenticatorAttestationResponse) b5x.C(parcel, i11, AuthenticatorAttestationResponse.CREATOR);
                            break;
                        case 5:
                            authenticatorAssertionResponse = (AuthenticatorAssertionResponse) b5x.C(parcel, i11, AuthenticatorAssertionResponse.CREATOR);
                            break;
                        case 6:
                            authenticatorErrorResponse = (AuthenticatorErrorResponse) b5x.C(parcel, i11, AuthenticatorErrorResponse.CREATOR);
                            break;
                        case 7:
                            authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) b5x.C(parcel, i11, AuthenticationExtensionsClientOutputs.CREATOR);
                            break;
                        case '\b':
                            strD35 = b5x.D(parcel, i11);
                            break;
                        case '\t':
                            b5x.D(parcel, i11);
                            break;
                        default:
                            b5x.b0(parcel, i11);
                            break;
                    }
                }
                b5x.H(parcel, iI11);
                return new PublicKeyCredential(strD33, strD34, bArrZ, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, strD35);
            case 12:
                int iI12 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI12) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        b5x.b0(parcel, i12);
                    } else {
                        bundleY2 = b5x.y(parcel, i12);
                    }
                }
                b5x.H(parcel, iI12);
                return new com.google.android.gms.measurement.internal.zzao(bundleY2);
            case 13:
                int iI13 = b5x.i0(parcel);
                boolean zT7 = false;
                String strD36 = null;
                String strD37 = null;
                String strD38 = null;
                String strD39 = null;
                while (parcel.dataPosition() < iI13) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 1) {
                        strD36 = b5x.D(parcel, i13);
                    } else if (c7 == 2) {
                        strD37 = b5x.D(parcel, i13);
                    } else if (c7 == 4) {
                        strD38 = b5x.D(parcel, i13);
                    } else if (c7 == 5) {
                        zT7 = b5x.T(parcel, i13);
                    } else if (c7 != 6) {
                        b5x.b0(parcel, i13);
                    } else {
                        strD39 = b5x.D(parcel, i13);
                    }
                }
                b5x.H(parcel, iI13);
                return new PhoneAuthCredential(strD36, strD37, strD38, zT7, strD39);
            case 14:
                int iI14 = b5x.i0(parcel);
                long jX6 = 0;
                String strD40 = null;
                String strD41 = null;
                String strD42 = null;
                while (parcel.dataPosition() < iI14) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 1) {
                        strD40 = b5x.D(parcel, i14);
                    } else if (c8 == 2) {
                        strD41 = b5x.D(parcel, i14);
                    } else if (c8 == 3) {
                        jX6 = b5x.X(parcel, i14);
                    } else if (c8 != 4) {
                        b5x.b0(parcel, i14);
                    } else {
                        strD42 = b5x.D(parcel, i14);
                    }
                }
                b5x.H(parcel, iI14);
                return new PhoneMultiFactorInfo(jX6, strD40, strD41, strD42);
            case 15:
                int iI15 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI15) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 1) {
                        b5x.b0(parcel, i15);
                    } else {
                        strD5 = b5x.D(parcel, i15);
                    }
                }
                b5x.H(parcel, iI15);
                return new PlayGamesAuthCredential(strD5);
            case 16:
                int iI16 = b5x.i0(parcel);
                long jX7 = 0;
                String strD43 = null;
                String strD44 = null;
                zzaje zzajeVar = null;
                while (parcel.dataPosition() < iI16) {
                    int i16 = parcel.readInt();
                    char c9 = (char) i16;
                    if (c9 == 1) {
                        strD43 = b5x.D(parcel, i16);
                    } else if (c9 == 2) {
                        strD44 = b5x.D(parcel, i16);
                    } else if (c9 == 3) {
                        jX7 = b5x.X(parcel, i16);
                    } else if (c9 != 4) {
                        b5x.b0(parcel, i16);
                    } else {
                        zzajeVar = (zzaje) b5x.C(parcel, i16, zzaje.CREATOR);
                    }
                }
                b5x.H(parcel, iI16);
                return new TotpMultiFactorInfo(strD43, strD44, jX7, zzajeVar);
            case 17:
                int iI17 = b5x.i0(parcel);
                String strD45 = null;
                while (parcel.dataPosition() < iI17) {
                    int i17 = parcel.readInt();
                    char c10 = (char) i17;
                    if (c10 == 1) {
                        strD4 = b5x.D(parcel, i17);
                    } else if (c10 != 2) {
                        b5x.b0(parcel, i17);
                    } else {
                        strD45 = b5x.D(parcel, i17);
                    }
                }
                b5x.H(parcel, iI17);
                return new TwitterAuthCredential(strD4, strD45);
            case 18:
                return new com.google.android.gms.cloudmessaging.zzd(parcel.readStrongBinder());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int iI18 = b5x.i0(parcel);
                long jX8 = -1;
                int iW8 = 0;
                boolean zT8 = false;
                String strD46 = null;
                while (parcel.dataPosition() < iI18) {
                    int i18 = parcel.readInt();
                    char c11 = (char) i18;
                    if (c11 == 1) {
                        strD46 = b5x.D(parcel, i18);
                    } else if (c11 == 2) {
                        iW8 = b5x.W(parcel, i18);
                    } else if (c11 == 3) {
                        jX8 = b5x.X(parcel, i18);
                    } else if (c11 != 4) {
                        b5x.b0(parcel, i18);
                    } else {
                        zT8 = b5x.T(parcel, i18);
                    }
                }
                b5x.H(parcel, iI18);
                return new Feature(iW8, jX8, strD46, zT8);
            case 20:
                int iI19 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI19) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 1) {
                        b5x.b0(parcel, i19);
                    } else {
                        arrayListG2 = b5x.G(parcel, i19, UvmEntry.CREATOR);
                    }
                }
                b5x.H(parcel, iI19);
                return new UvmEntries(arrayListG2);
            case 21:
                int iI20 = b5x.i0(parcel);
                short s = 0;
                short s2 = 0;
                while (parcel.dataPosition() < iI20) {
                    int i20 = parcel.readInt();
                    char c12 = (char) i20;
                    if (c12 == 1) {
                        iW4 = b5x.W(parcel, i20);
                    } else if (c12 == 2) {
                        b5x.j0(parcel, i20, 4);
                        s = (short) parcel.readInt();
                    } else if (c12 != 3) {
                        b5x.b0(parcel, i20);
                    } else {
                        b5x.j0(parcel, i20, 4);
                        s2 = (short) parcel.readInt();
                    }
                }
                b5x.H(parcel, iI20);
                return new UvmEntry(iW4, s, s2);
            case 22:
                int iI21 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI21) {
                    int i21 = parcel.readInt();
                    if (((char) i21) != 2) {
                        b5x.b0(parcel, i21);
                    } else {
                        bundleY = b5x.y(parcel, i21);
                    }
                }
                b5x.H(parcel, iI21);
                return new zzbf(bundleY);
            case 23:
                int iI22 = b5x.i0(parcel);
                long jX9 = 0;
                long jX10 = 0;
                String strD47 = null;
                zzbf zzbfVar = null;
                String strD48 = null;
                while (parcel.dataPosition() < iI22) {
                    int i22 = parcel.readInt();
                    char c13 = (char) i22;
                    if (c13 == 2) {
                        strD47 = b5x.D(parcel, i22);
                    } else if (c13 == 3) {
                        zzbfVar = (zzbf) b5x.C(parcel, i22, zzbf.CREATOR);
                    } else if (c13 == 4) {
                        strD48 = b5x.D(parcel, i22);
                    } else if (c13 == 5) {
                        jX9 = b5x.X(parcel, i22);
                    } else if (c13 != 6) {
                        b5x.b0(parcel, i22);
                    } else {
                        jX10 = b5x.X(parcel, i22);
                    }
                }
                b5x.H(parcel, iI22);
                return new zzbh(strD47, zzbfVar, strD48, jX9, jX10);
            case 24:
                int iI23 = b5x.i0(parcel);
                ArrayList arrayListG7 = null;
                while (parcel.dataPosition() < iI23) {
                    int i23 = parcel.readInt();
                    char c14 = (char) i23;
                    if (c14 == 1) {
                        arrayListG = b5x.G(parcel, i23, PhoneMultiFactorInfo.CREATOR);
                    } else if (c14 != 2) {
                        b5x.b0(parcel, i23);
                    } else {
                        arrayListG7 = b5x.G(parcel, i23, TotpMultiFactorInfo.CREATOR);
                    }
                }
                b5x.H(parcel, iI23);
                return new zzbl(arrayListG, arrayListG7);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iI24 = b5x.i0(parcel);
                int iW9 = 0;
                int iW10 = 0;
                boolean zT9 = true;
                while (parcel.dataPosition() < iI24) {
                    int i24 = parcel.readInt();
                    char c15 = (char) i24;
                    if (c15 == 1) {
                        iW3 = b5x.W(parcel, i24);
                    } else if (c15 == 2) {
                        iW9 = b5x.W(parcel, i24);
                    } else if (c15 == 3) {
                        iW10 = b5x.W(parcel, i24);
                    } else if (c15 != 4) {
                        b5x.b0(parcel, i24);
                    } else {
                        zT9 = b5x.T(parcel, i24);
                    }
                }
                b5x.H(parcel, iI24);
                return new ComplianceOptions(iW3, iW9, iW10, zT9);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int iI25 = b5x.i0(parcel);
                UvmEntries uvmEntries = null;
                com.google.android.gms.fido.fido2.api.common.zzf zzfVar = null;
                AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
                com.google.android.gms.fido.fido2.api.common.zzh zzhVar = null;
                String strD49 = null;
                while (parcel.dataPosition() < iI25) {
                    int i25 = parcel.readInt();
                    char c16 = (char) i25;
                    if (c16 == 1) {
                        uvmEntries = (UvmEntries) b5x.C(parcel, i25, UvmEntries.CREATOR);
                    } else if (c16 == 2) {
                        zzfVar = (com.google.android.gms.fido.fido2.api.common.zzf) b5x.C(parcel, i25, com.google.android.gms.fido.fido2.api.common.zzf.CREATOR);
                    } else if (c16 == 3) {
                        authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) b5x.C(parcel, i25, AuthenticationExtensionsCredPropsOutputs.CREATOR);
                    } else if (c16 == 4) {
                        zzhVar = (com.google.android.gms.fido.fido2.api.common.zzh) b5x.C(parcel, i25, com.google.android.gms.fido.fido2.api.common.zzh.CREATOR);
                    } else if (c16 != 5) {
                        b5x.b0(parcel, i25);
                    } else {
                        strD49 = b5x.D(parcel, i25);
                    }
                }
                b5x.H(parcel, iI25);
                return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar, strD49);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int iI26 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI26) {
                    int i26 = parcel.readInt();
                    char c17 = (char) i26;
                    if (c17 == 1) {
                        iW2 = b5x.W(parcel, i26);
                    } else if (c17 != 2) {
                        b5x.b0(parcel, i26);
                    } else {
                        strD3 = b5x.D(parcel, i26);
                    }
                }
                b5x.H(parcel, iI26);
                return new Scope(iW2, strD3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int iI27 = b5x.i0(parcel);
                long jX11 = 0;
                long jX12 = 0;
                boolean zT10 = false;
                Bundle bundleY3 = null;
                String strD50 = null;
                while (parcel.dataPosition() < iI27) {
                    int i27 = parcel.readInt();
                    char c18 = (char) i27;
                    if (c18 == 1) {
                        jX11 = b5x.X(parcel, i27);
                    } else if (c18 == 2) {
                        jX12 = b5x.X(parcel, i27);
                    } else if (c18 == 3) {
                        zT10 = b5x.T(parcel, i27);
                    } else if (c18 == 7) {
                        bundleY3 = b5x.y(parcel, i27);
                    } else if (c18 != '\b') {
                        b5x.b0(parcel, i27);
                    } else {
                        strD50 = b5x.D(parcel, i27);
                    }
                }
                b5x.H(parcel, iI27);
                return new zzdb(jX11, jX12, zT10, bundleY3, strD50);
            default:
                int iI28 = b5x.i0(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iI28) {
                    int i28 = parcel.readInt();
                    char c19 = (char) i28;
                    if (c19 == 1) {
                        iW = b5x.W(parcel, i28);
                    } else if (c19 == 2) {
                        strD2 = b5x.D(parcel, i28);
                    } else if (c19 != 3) {
                        b5x.b0(parcel, i28);
                    } else {
                        intent = (Intent) b5x.C(parcel, i28, Intent.CREATOR);
                    }
                }
                b5x.H(parcel, iI28);
                return new zzdd(iW, strD2, intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f20026a) {
            case 0:
                return new RootTelemetryConfiguration[i];
            case 1:
                return new zzah[i];
            case 2:
                return new zzaf[i];
            case 3:
                return new zzaia[i];
            case 4:
                return new zzaje[i];
            case 5:
                return new zzajg[i];
            case 6:
                return new GithubAuthCredential[i];
            case 7:
                return new GoogleAuthCredential[i];
            case 8:
                return new zzaj[i];
            case 9:
                return new com.google.firebase.auth.zzao[i];
            case 10:
                return new zzao[i];
            case 11:
                return new PublicKeyCredential[i];
            case 12:
                return new com.google.android.gms.measurement.internal.zzao[i];
            case 13:
                return new PhoneAuthCredential[i];
            case 14:
                return new PhoneMultiFactorInfo[i];
            case 15:
                return new PlayGamesAuthCredential[i];
            case 16:
                return new TotpMultiFactorInfo[i];
            case 17:
                return new TwitterAuthCredential[i];
            case 18:
                return new com.google.android.gms.cloudmessaging.zzd[i];
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new Feature[i];
            case 20:
                return new UvmEntries[i];
            case 21:
                return new UvmEntry[i];
            case 22:
                return new zzbf[i];
            case 23:
                return new zzbh[i];
            case 24:
                return new zzbl[i];
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new ComplianceOptions[i];
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new AuthenticationExtensionsClientOutputs[i];
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new Scope[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zzdb[i];
            default:
                return new zzdd[i];
        }
    }
}
