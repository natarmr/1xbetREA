package a;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzjj;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzjo;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.internal.measurement.zzjs;
import com.google.android.gms.internal.measurement.zzju;
import com.google.android.gms.internal.p000firebaseauthapi.zzajg;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class erw0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8302a;

    public /* synthetic */ erw0(byte b) {
        this.f8302a = b;
    }

    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        int i2 = getServiceRequest.f45489a;
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = getServiceRequest.b;
        q5x.o0(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = getServiceRequest.c;
        q5x.o0(parcel, 3, 4);
        parcel.writeInt(i4);
        q5x.k0(parcel, 4, getServiceRequest.d);
        q5x.g0(parcel, 5, getServiceRequest.e);
        q5x.m0(parcel, 6, getServiceRequest.f, i);
        q5x.d0(parcel, 7, getServiceRequest.g);
        q5x.j0(parcel, 8, getServiceRequest.h, i);
        q5x.m0(parcel, 10, getServiceRequest.i, i);
        q5x.m0(parcel, 11, getServiceRequest.j, i);
        boolean z = getServiceRequest.k;
        q5x.o0(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = getServiceRequest.l;
        q5x.o0(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = getServiceRequest.m;
        q5x.o0(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        q5x.k0(parcel, 15, getServiceRequest.n);
        q5x.q0(parcel, iP0);
    }

    public static void b(zzpl zzplVar, Parcel parcel) {
        int i = zzplVar.f45549a;
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(i);
        q5x.k0(parcel, 2, zzplVar.b);
        long j = zzplVar.c;
        q5x.o0(parcel, 3, 8);
        parcel.writeLong(j);
        q5x.i0(parcel, 4, zzplVar.d);
        q5x.k0(parcel, 6, zzplVar.e);
        q5x.k0(parcel, 7, zzplVar.f);
        Double d = zzplVar.g;
        if (d != null) {
            q5x.o0(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        q5x.q0(parcel, iP0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        long jX = 0;
        int iW = 0;
        boolean zT = false;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        int iW5 = 0;
        boolean zT2 = false;
        int iW6 = 0;
        boolean zT3 = false;
        boolean zT4 = false;
        String strD = null;
        String strD2 = null;
        ArrayList arrayListG = null;
        String strD3 = null;
        String strD4 = null;
        Bundle bundleY = null;
        ArrayList arrayListG2 = null;
        String strD5 = null;
        byte[] bArrZ = null;
        String strD6 = null;
        switch (this.f8302a) {
            case 0:
                int iI0 = b5x.i0(parcel);
                String strD7 = null;
                String strD8 = null;
                String strD9 = null;
                zzajg zzajgVar = null;
                String strD10 = null;
                String strD11 = null;
                String strD12 = null;
                while (parcel.dataPosition() < iI0) {
                    int i = parcel.readInt();
                    switch ((char) i) {
                        case 1:
                            strD7 = b5x.D(parcel, i);
                            break;
                        case 2:
                            strD8 = b5x.D(parcel, i);
                            break;
                        case 3:
                            strD9 = b5x.D(parcel, i);
                            break;
                        case 4:
                            zzajgVar = (zzajg) b5x.C(parcel, i, zzajg.CREATOR);
                            break;
                        case 5:
                            strD10 = b5x.D(parcel, i);
                            break;
                        case 6:
                            strD11 = b5x.D(parcel, i);
                            break;
                        case 7:
                            strD12 = b5x.D(parcel, i);
                            break;
                        default:
                            b5x.b0(parcel, i);
                            break;
                    }
                }
                b5x.H(parcel, iI0);
                return new com.google.firebase.auth.zzc(strD7, strD8, strD9, zzajgVar, strD10, strD11, strD12);
            case 1:
                int iI1 = b5x.i0(parcel);
                PendingIntent pendingIntent = null;
                ConnectionResult connectionResult = null;
                while (parcel.dataPosition() < iI1) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        iW = b5x.W(parcel, i2);
                    } else if (c == 2) {
                        strD = b5x.D(parcel, i2);
                    } else if (c == 3) {
                        pendingIntent = (PendingIntent) b5x.C(parcel, i2, PendingIntent.CREATOR);
                    } else if (c != 4) {
                        b5x.b0(parcel, i2);
                    } else {
                        connectionResult = (ConnectionResult) b5x.C(parcel, i2, ConnectionResult.CREATOR);
                    }
                }
                b5x.H(parcel, iI1);
                return new Status(iW, strD, pendingIntent, connectionResult);
            case 2:
                int iI2 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI2) {
                    int i3 = parcel.readInt();
                    if (((char) i3) != 1) {
                        b5x.b0(parcel, i3);
                    } else {
                        zT4 = b5x.T(parcel, i3);
                    }
                }
                b5x.H(parcel, iI2);
                return new AuthenticationExtensionsCredPropsOutputs(zT4);
            case 3:
                int iI3 = b5x.i0(parcel);
                boolean zT5 = false;
                String strD13 = null;
                String strD14 = null;
                String strD15 = null;
                String strD16 = null;
                while (parcel.dataPosition() < iI3) {
                    int i4 = parcel.readInt();
                    char c2 = (char) i4;
                    if (c2 == 1) {
                        strD13 = b5x.D(parcel, i4);
                    } else if (c2 == 2) {
                        strD14 = b5x.D(parcel, i4);
                    } else if (c2 == 3) {
                        strD15 = b5x.D(parcel, i4);
                    } else if (c2 == 4) {
                        strD16 = b5x.D(parcel, i4);
                    } else if (c2 != 5) {
                        b5x.b0(parcel, i4);
                    } else {
                        zT5 = b5x.T(parcel, i4);
                    }
                }
                b5x.H(parcel, iI3);
                return new EmailAuthCredential(strD13, strD14, strD15, zT5, strD16);
            case 4:
                int iI4 = b5x.i0(parcel);
                byte[] bArrZ2 = null;
                byte[] bArrZ3 = null;
                while (parcel.dataPosition() < iI4) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        bArrZ2 = b5x.z(parcel, i5);
                    } else if (c3 != 2) {
                        b5x.b0(parcel, i5);
                    } else {
                        bArrZ3 = b5x.z(parcel, i5);
                    }
                }
                b5x.H(parcel, iI4);
                return new com.google.android.gms.fido.fido2.api.common.zzf(bArrZ2 == null ? null : vuw0.k(bArrZ2, bArrZ2.length), bArrZ3 != null ? vuw0.k(bArrZ3, bArrZ3.length) : null);
            case 5:
                int iI5 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI5) {
                    int i6 = parcel.readInt();
                    if (((char) i6) != 1) {
                        b5x.b0(parcel, i6);
                    } else {
                        strD6 = b5x.D(parcel, i6);
                    }
                }
                b5x.H(parcel, iI5);
                return new FacebookAuthCredential(strD6);
            case 6:
                int iI6 = b5x.i0(parcel);
                byte[] bArrZ4 = null;
                while (parcel.dataPosition() < iI6) {
                    int i7 = parcel.readInt();
                    char c4 = (char) i7;
                    if (c4 == 1) {
                        zT3 = b5x.T(parcel, i7);
                    } else if (c4 != 2) {
                        b5x.b0(parcel, i7);
                    } else {
                        bArrZ4 = b5x.z(parcel, i7);
                    }
                }
                b5x.H(parcel, iI6);
                return new com.google.android.gms.fido.fido2.api.common.zzh(zT3, bArrZ4 != null ? vuw0.k(bArrZ4, bArrZ4.length) : null);
            case 7:
                int iI7 = b5x.i0(parcel);
                byte[] bArrZ5 = null;
                byte[] bArrZ6 = null;
                byte[] bArrZ7 = null;
                byte[] bArrZ8 = null;
                byte[] bArrZ9 = null;
                while (parcel.dataPosition() < iI7) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 2) {
                        bArrZ5 = b5x.z(parcel, i8);
                    } else if (c5 == 3) {
                        bArrZ6 = b5x.z(parcel, i8);
                    } else if (c5 == 4) {
                        bArrZ7 = b5x.z(parcel, i8);
                    } else if (c5 == 5) {
                        bArrZ8 = b5x.z(parcel, i8);
                    } else if (c5 != 6) {
                        b5x.b0(parcel, i8);
                    } else {
                        bArrZ9 = b5x.z(parcel, i8);
                    }
                }
                b5x.H(parcel, iI7);
                return new AuthenticatorAssertionResponse(bArrZ5, bArrZ6, bArrZ7, bArrZ8, bArrZ9);
            case 8:
                int iI8 = b5x.i0(parcel);
                zzjo[] zzjoVarArr = null;
                String[] strArr = null;
                while (parcel.dataPosition() < iI8) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 2) {
                        iW6 = b5x.W(parcel, i9);
                    } else if (c6 == 3) {
                        zzjoVarArr = (zzjo[]) b5x.F(parcel, i9, zzjo.CREATOR);
                    } else if (c6 != 4) {
                        b5x.b0(parcel, i9);
                    } else {
                        int iZ = b5x.Z(parcel, i9);
                        int iDataPosition = parcel.dataPosition();
                        if (iZ == 0) {
                            strArr = null;
                        } else {
                            String[] strArrCreateStringArray = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition + iZ);
                            strArr = strArrCreateStringArray;
                        }
                    }
                }
                b5x.H(parcel, iI8);
                return new zzjf(iW6, zzjoVarArr, strArr);
            case 9:
                int iI9 = b5x.i0(parcel);
                long jX2 = 0;
                boolean zT6 = false;
                String strD17 = null;
                String strD18 = null;
                zzjf[] zzjfVarArr = null;
                byte[] bArrZ10 = null;
                while (parcel.dataPosition() < iI9) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            strD17 = b5x.D(parcel, i10);
                            break;
                        case 3:
                            strD18 = b5x.D(parcel, i10);
                            break;
                        case 4:
                            zzjfVarArr = (zzjf[]) b5x.F(parcel, i10, zzjf.CREATOR);
                            break;
                        case 5:
                            zT6 = b5x.T(parcel, i10);
                            break;
                        case 6:
                            bArrZ10 = b5x.z(parcel, i10);
                            break;
                        case 7:
                            jX2 = b5x.X(parcel, i10);
                            break;
                        default:
                            b5x.b0(parcel, i10);
                            break;
                    }
                }
                b5x.H(parcel, iI9);
                return new zzjh(strD17, strD18, zzjfVarArr, zT6, bArrZ10, jX2);
            case 10:
                int iI10 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI10) {
                    int i11 = parcel.readInt();
                    if (((char) i11) != 2) {
                        b5x.b0(parcel, i11);
                    } else {
                        bArrZ = b5x.z(parcel, i11);
                    }
                }
                b5x.H(parcel, iI10);
                return new zzjj(bArrZ);
            case 11:
                int iI11 = b5x.i0(parcel);
                String strD19 = null;
                byte[] bArrZ11 = null;
                byte[][] bArrA = null;
                byte[][] bArrA2 = null;
                byte[][] bArrA3 = null;
                byte[][] bArrA4 = null;
                int[] iArrB = null;
                byte[][] bArrA5 = null;
                int[] iArrB2 = null;
                byte[][] bArrA6 = null;
                while (parcel.dataPosition() < iI11) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 2:
                            strD19 = b5x.D(parcel, i12);
                            break;
                        case 3:
                            bArrZ11 = b5x.z(parcel, i12);
                            break;
                        case 4:
                            bArrA = b5x.A(parcel, i12);
                            break;
                        case 5:
                            bArrA2 = b5x.A(parcel, i12);
                            break;
                        case 6:
                            bArrA3 = b5x.A(parcel, i12);
                            break;
                        case 7:
                            bArrA4 = b5x.A(parcel, i12);
                            break;
                        case '\b':
                            iArrB = b5x.B(parcel, i12);
                            break;
                        case '\t':
                            bArrA5 = b5x.A(parcel, i12);
                            break;
                        case '\n':
                            iArrB2 = b5x.B(parcel, i12);
                            break;
                        case 11:
                            bArrA6 = b5x.A(parcel, i12);
                            break;
                        default:
                            b5x.b0(parcel, i12);
                            break;
                    }
                }
                b5x.H(parcel, iI11);
                return new zzjl(strD19, bArrZ11, bArrA, bArrA2, bArrA3, bArrA4, iArrB, bArrA5, iArrB2, bArrA6);
            case 12:
                int iI12 = b5x.i0(parcel);
                long jX3 = 0;
                double d = 0.0d;
                boolean zT7 = false;
                int iW7 = 0;
                int iW8 = 0;
                int iW9 = 0;
                String strD20 = null;
                String strD21 = null;
                byte[] bArrZ12 = null;
                while (parcel.dataPosition() < iI12) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            strD20 = b5x.D(parcel, i13);
                            break;
                        case 3:
                            jX3 = b5x.X(parcel, i13);
                            break;
                        case 4:
                            zT7 = b5x.T(parcel, i13);
                            break;
                        case 5:
                            b5x.j0(parcel, i13, 8);
                            d = parcel.readDouble();
                            break;
                        case 6:
                            strD21 = b5x.D(parcel, i13);
                            break;
                        case 7:
                            bArrZ12 = b5x.z(parcel, i13);
                            break;
                        case '\b':
                            iW7 = b5x.W(parcel, i13);
                            break;
                        case '\t':
                            iW8 = b5x.W(parcel, i13);
                            break;
                        case '\n':
                            iW9 = b5x.W(parcel, i13);
                            break;
                        default:
                            b5x.b0(parcel, i13);
                            break;
                    }
                }
                b5x.H(parcel, iI12);
                return new zzjo(strD20, jX3, zT7, d, strD21, bArrZ12, iW7, iW8, iW9);
            case 13:
                int iI13 = b5x.i0(parcel);
                String strD22 = null;
                zzjo zzjoVar = null;
                while (parcel.dataPosition() < iI13) {
                    int i14 = parcel.readInt();
                    char c7 = (char) i14;
                    if (c7 == 2) {
                        strD5 = b5x.D(parcel, i14);
                    } else if (c7 == 3) {
                        strD22 = b5x.D(parcel, i14);
                    } else if (c7 == 4) {
                        zzjoVar = (zzjo) b5x.C(parcel, i14, zzjo.CREATOR);
                    } else if (c7 != 5) {
                        b5x.b0(parcel, i14);
                    } else {
                        zT2 = b5x.T(parcel, i14);
                    }
                }
                b5x.H(parcel, iI13);
                return new zzjq(strD5, strD22, zzjoVar, zT2);
            case 14:
                int iI14 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI14) {
                    int i15 = parcel.readInt();
                    if (((char) i15) != 2) {
                        b5x.b0(parcel, i15);
                    } else {
                        arrayListG2 = b5x.G(parcel, i15, zzjq.CREATOR);
                    }
                }
                b5x.H(parcel, iI14);
                return new zzjs(arrayListG2);
            case 15:
                int iI15 = b5x.i0(parcel);
                int iW10 = 0;
                while (parcel.dataPosition() < iI15) {
                    int i16 = parcel.readInt();
                    char c8 = (char) i16;
                    if (c8 == 1) {
                        iW5 = b5x.W(parcel, i16);
                    } else if (c8 != 2) {
                        b5x.b0(parcel, i16);
                    } else {
                        iW10 = b5x.W(parcel, i16);
                    }
                }
                b5x.H(parcel, iI15);
                return new zzju(iW5, iW10);
            case 16:
                int iI16 = b5x.i0(parcel);
                Feature[] featureArr = null;
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                while (parcel.dataPosition() < iI16) {
                    int i17 = parcel.readInt();
                    char c9 = (char) i17;
                    if (c9 == 1) {
                        bundleY = b5x.y(parcel, i17);
                    } else if (c9 == 2) {
                        featureArr = (Feature[]) b5x.F(parcel, i17, Feature.CREATOR);
                    } else if (c9 == 3) {
                        iW4 = b5x.W(parcel, i17);
                    } else if (c9 != 4) {
                        b5x.b0(parcel, i17);
                    } else {
                        connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) b5x.C(parcel, i17, ConnectionTelemetryConfiguration.CREATOR);
                    }
                }
                b5x.H(parcel, iI16);
                com.google.android.gms.common.internal.zzj zzjVar = new com.google.android.gms.common.internal.zzj();
                zzjVar.f45496a = bundleY;
                zzjVar.b = featureArr;
                zzjVar.c = iW4;
                zzjVar.d = connectionTelemetryConfiguration;
                return zzjVar;
            case 17:
                int iI17 = b5x.i0(parcel);
                byte[] bArrZ13 = null;
                byte[] bArrZ14 = null;
                byte[] bArrZ15 = null;
                String[] strArr2 = null;
                while (parcel.dataPosition() < iI17) {
                    int i18 = parcel.readInt();
                    char c10 = (char) i18;
                    if (c10 == 2) {
                        bArrZ13 = b5x.z(parcel, i18);
                    } else if (c10 == 3) {
                        bArrZ14 = b5x.z(parcel, i18);
                    } else if (c10 == 4) {
                        bArrZ15 = b5x.z(parcel, i18);
                    } else if (c10 != 5) {
                        b5x.b0(parcel, i18);
                    } else {
                        int iZ2 = b5x.Z(parcel, i18);
                        int iDataPosition2 = parcel.dataPosition();
                        if (iZ2 == 0) {
                            strArr2 = null;
                        } else {
                            String[] strArrCreateStringArray2 = parcel.createStringArray();
                            parcel.setDataPosition(iDataPosition2 + iZ2);
                            strArr2 = strArrCreateStringArray2;
                        }
                    }
                }
                b5x.H(parcel, iI17);
                return new AuthenticatorAttestationResponse(bArrZ13, bArrZ14, bArrZ15, strArr2);
            case 18:
                int iI18 = b5x.i0(parcel);
                boolean zT8 = false;
                boolean zT9 = false;
                int iW11 = 0;
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArrB3 = null;
                int[] iArrB4 = null;
                while (parcel.dataPosition() < iI18) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) b5x.C(parcel, i19, RootTelemetryConfiguration.CREATOR);
                            break;
                        case 2:
                            zT8 = b5x.T(parcel, i19);
                            break;
                        case 3:
                            zT9 = b5x.T(parcel, i19);
                            break;
                        case 4:
                            iArrB3 = b5x.B(parcel, i19);
                            break;
                        case 5:
                            iW11 = b5x.W(parcel, i19);
                            break;
                        case 6:
                            iArrB4 = b5x.B(parcel, i19);
                            break;
                        default:
                            b5x.b0(parcel, i19);
                            break;
                    }
                }
                b5x.H(parcel, iI18);
                return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, zT8, zT9, iArrB3, iW11, iArrB4);
            case com.huawei.hms.api.ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int iI19 = b5x.i0(parcel);
                int iW12 = 0;
                while (parcel.dataPosition() < iI19) {
                    int i20 = parcel.readInt();
                    char c11 = (char) i20;
                    if (c11 == 2) {
                        iW3 = b5x.W(parcel, i20);
                    } else if (c11 == 3) {
                        strD4 = b5x.D(parcel, i20);
                    } else if (c11 != 4) {
                        b5x.b0(parcel, i20);
                    } else {
                        iW12 = b5x.W(parcel, i20);
                    }
                }
                b5x.H(parcel, iI19);
                return new AuthenticatorErrorResponse(iW3, iW12, strD4);
            case 20:
                int iI20 = b5x.i0(parcel);
                Bundle bundle = new Bundle();
                Scope[] scopeArr = GetServiceRequest.o;
                Feature[] featureArr2 = GetServiceRequest.p;
                Feature[] featureArr3 = featureArr2;
                int iW13 = 0;
                int iW14 = 0;
                int iW15 = 0;
                boolean zT10 = false;
                int iW16 = 0;
                boolean zT11 = false;
                String strD23 = null;
                IBinder iBinderV = null;
                Account account = null;
                String strD24 = null;
                while (parcel.dataPosition() < iI20) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            iW13 = b5x.W(parcel, i21);
                            break;
                        case 2:
                            iW14 = b5x.W(parcel, i21);
                            break;
                        case 3:
                            iW15 = b5x.W(parcel, i21);
                            break;
                        case 4:
                            strD23 = b5x.D(parcel, i21);
                            break;
                        case 5:
                            iBinderV = b5x.V(parcel, i21);
                            break;
                        case 6:
                            scopeArr = (Scope[]) b5x.F(parcel, i21, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = b5x.y(parcel, i21);
                            break;
                        case '\b':
                            account = (Account) b5x.C(parcel, i21, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            b5x.b0(parcel, i21);
                            break;
                        case '\n':
                            featureArr2 = (Feature[]) b5x.F(parcel, i21, Feature.CREATOR);
                            break;
                        case 11:
                            featureArr3 = (Feature[]) b5x.F(parcel, i21, Feature.CREATOR);
                            break;
                        case '\f':
                            zT10 = b5x.T(parcel, i21);
                            break;
                        case '\r':
                            iW16 = b5x.W(parcel, i21);
                            break;
                        case 14:
                            zT11 = b5x.T(parcel, i21);
                            break;
                        case 15:
                            strD24 = b5x.D(parcel, i21);
                            break;
                    }
                }
                b5x.H(parcel, iI20);
                return new GetServiceRequest(iW13, iW14, iW15, strD23, iBinderV, scopeArr, bundle, account, featureArr2, featureArr3, zT10, iW16, zT11, strD24);
            case 21:
                int iI21 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI21) {
                    int i22 = parcel.readInt();
                    char c12 = (char) i22;
                    if (c12 == 1) {
                        strD3 = b5x.D(parcel, i22);
                    } else if (c12 == 2) {
                        jX = b5x.X(parcel, i22);
                    } else if (c12 != 3) {
                        b5x.b0(parcel, i22);
                    } else {
                        iW2 = b5x.W(parcel, i22);
                    }
                }
                b5x.H(parcel, iI21);
                return new zzoh(strD3, jX, iW2);
            case 22:
                int iI22 = b5x.i0(parcel);
                long jX4 = 0;
                long jX5 = 0;
                int iW17 = 0;
                byte[] bArrZ16 = null;
                String strD25 = null;
                Bundle bundleY2 = null;
                String strD26 = null;
                while (parcel.dataPosition() < iI22) {
                    int i23 = parcel.readInt();
                    switch ((char) i23) {
                        case 1:
                            jX4 = b5x.X(parcel, i23);
                            break;
                        case 2:
                            bArrZ16 = b5x.z(parcel, i23);
                            break;
                        case 3:
                            strD25 = b5x.D(parcel, i23);
                            break;
                        case 4:
                            bundleY2 = b5x.y(parcel, i23);
                            break;
                        case 5:
                            iW17 = b5x.W(parcel, i23);
                            break;
                        case 6:
                            jX5 = b5x.X(parcel, i23);
                            break;
                        case 7:
                            strD26 = b5x.D(parcel, i23);
                            break;
                        default:
                            b5x.b0(parcel, i23);
                            break;
                    }
                }
                b5x.H(parcel, iI22);
                return new zzom(jX4, bArrZ16, strD25, bundleY2, iW17, jX5, strD26);
            case 23:
                int iI23 = b5x.i0(parcel);
                while (true) {
                    ArrayList arrayList = null;
                    while (true) {
                        if (parcel.dataPosition() >= iI23) {
                            b5x.H(parcel, iI23);
                            return new zzoo(arrayList);
                        }
                        int i24 = parcel.readInt();
                        if (((char) i24) != 1) {
                            b5x.b0(parcel, i24);
                        } else {
                            int iZ3 = b5x.Z(parcel, i24);
                            int iDataPosition3 = parcel.dataPosition();
                            if (iZ3 == 0) {
                            }
                            ArrayList arrayList2 = new ArrayList();
                            int i25 = parcel.readInt();
                            for (int i26 = 0; i26 < i25; i26++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition3 + iZ3);
                            arrayList = arrayList2;
                        }
                        break;
                    }
                }
                break;
            case 24:
                int iI24 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI24) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 1) {
                        b5x.b0(parcel, i27);
                    } else {
                        arrayListG = b5x.G(parcel, i27, zzom.CREATOR);
                    }
                }
                b5x.H(parcel, iI24);
                return new zzoq(arrayListG);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iI25 = b5x.i0(parcel);
                long jX6 = 0;
                int iW18 = 0;
                String strD27 = null;
                Long lY = null;
                Float fValueOf = null;
                String strD28 = null;
                String strD29 = null;
                Double dValueOf = null;
                while (parcel.dataPosition() < iI25) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 1:
                            iW18 = b5x.W(parcel, i28);
                            break;
                        case 2:
                            strD27 = b5x.D(parcel, i28);
                            break;
                        case 3:
                            jX6 = b5x.X(parcel, i28);
                            break;
                        case 4:
                            lY = b5x.Y(parcel, i28);
                            break;
                        case 5:
                            int iZ4 = b5x.Z(parcel, i28);
                            if (iZ4 == 0) {
                                fValueOf = null;
                            } else {
                                b5x.k0(parcel, iZ4, 4);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            }
                            break;
                        case 6:
                            strD28 = b5x.D(parcel, i28);
                            break;
                        case 7:
                            strD29 = b5x.D(parcel, i28);
                            break;
                        case '\b':
                            int iZ5 = b5x.Z(parcel, i28);
                            if (iZ5 == 0) {
                                dValueOf = null;
                            } else {
                                b5x.k0(parcel, iZ5, 8);
                                dValueOf = Double.valueOf(parcel.readDouble());
                            }
                            break;
                        default:
                            b5x.b0(parcel, i28);
                            break;
                    }
                }
                b5x.H(parcel, iI25);
                return new zzpl(iW18, strD27, jX6, lY, fValueOf, strD28, strD29, dValueOf);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int iI26 = b5x.i0(parcel);
                boolean zT12 = false;
                boolean zT13 = false;
                boolean zT14 = false;
                boolean zT15 = false;
                boolean zT16 = false;
                String strD30 = null;
                IBinder iBinderV2 = null;
                while (parcel.dataPosition() < iI26) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 1:
                            strD30 = b5x.D(parcel, i29);
                            break;
                        case 2:
                            zT12 = b5x.T(parcel, i29);
                            break;
                        case 3:
                            zT13 = b5x.T(parcel, i29);
                            break;
                        case 4:
                            iBinderV2 = b5x.V(parcel, i29);
                            break;
                        case 5:
                            zT14 = b5x.T(parcel, i29);
                            break;
                        case 6:
                            zT15 = b5x.T(parcel, i29);
                            break;
                        case 7:
                        default:
                            b5x.b0(parcel, i29);
                            break;
                        case '\b':
                            zT16 = b5x.T(parcel, i29);
                            break;
                    }
                }
                b5x.H(parcel, iI26);
                return new com.google.android.gms.common.zzp(strD30, zT12, zT13, iBinderV2, zT14, zT15, zT16);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int iI27 = b5x.i0(parcel);
                long jX7 = -1;
                int iW19 = 0;
                int iW20 = 0;
                boolean zT17 = false;
                String strD31 = null;
                while (parcel.dataPosition() < iI27) {
                    int i30 = parcel.readInt();
                    char c13 = (char) i30;
                    if (c13 == 1) {
                        zT17 = b5x.T(parcel, i30);
                    } else if (c13 == 2) {
                        strD31 = b5x.D(parcel, i30);
                    } else if (c13 == 3) {
                        iW19 = b5x.W(parcel, i30);
                    } else if (c13 == 4) {
                        iW20 = b5x.W(parcel, i30);
                    } else if (c13 != 5) {
                        b5x.b0(parcel, i30);
                    } else {
                        jX7 = b5x.X(parcel, i30);
                    }
                }
                b5x.H(parcel, iI27);
                return new com.google.android.gms.common.zzr(iW19, iW20, jX7, strD31, zT17);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int iI28 = b5x.i0(parcel);
                String strD32 = "";
                String strD33 = strD32;
                String strD34 = strD33;
                String strD35 = strD34;
                int iW21 = 100;
                long jX8 = 0;
                long jX9 = 0;
                long jX10 = 0;
                long jX11 = 0;
                long jX12 = 0;
                long jX13 = 0;
                long jX14 = 0;
                long jX15 = 0;
                long jX16 = -2147483648L;
                boolean zT18 = true;
                boolean zT19 = true;
                boolean zT20 = false;
                int iW22 = 0;
                boolean zT21 = false;
                boolean zT22 = false;
                int iW23 = 0;
                int iW24 = 0;
                String strD36 = null;
                String strD37 = null;
                String strD38 = null;
                String strD39 = null;
                String strD40 = null;
                String strD41 = null;
                Boolean boolU = null;
                ArrayList arrayListE = null;
                String strD42 = null;
                String strD43 = null;
                while (parcel.dataPosition() < iI28) {
                    int i31 = parcel.readInt();
                    switch ((char) i31) {
                        case 2:
                            strD36 = b5x.D(parcel, i31);
                            break;
                        case 3:
                            strD37 = b5x.D(parcel, i31);
                            break;
                        case 4:
                            strD38 = b5x.D(parcel, i31);
                            break;
                        case 5:
                            strD39 = b5x.D(parcel, i31);
                            break;
                        case 6:
                            jX8 = b5x.X(parcel, i31);
                            break;
                        case 7:
                            jX9 = b5x.X(parcel, i31);
                            break;
                        case '\b':
                            strD40 = b5x.D(parcel, i31);
                            break;
                        case '\t':
                            zT18 = b5x.T(parcel, i31);
                            break;
                        case '\n':
                            zT20 = b5x.T(parcel, i31);
                            break;
                        case 11:
                            jX16 = b5x.X(parcel, i31);
                            break;
                        case '\f':
                            strD41 = b5x.D(parcel, i31);
                            break;
                        case '\r':
                        case 17:
                        case com.huawei.hms.api.ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        case 20:
                        case 24:
                        case '!':
                        default:
                            b5x.b0(parcel, i31);
                            break;
                        case 14:
                            jX10 = b5x.X(parcel, i31);
                            break;
                        case 15:
                            iW22 = b5x.W(parcel, i31);
                            break;
                        case 16:
                            zT19 = b5x.T(parcel, i31);
                            break;
                        case 18:
                            zT21 = b5x.T(parcel, i31);
                            break;
                        case 21:
                            boolU = b5x.U(parcel, i31);
                            break;
                        case 22:
                            jX11 = b5x.X(parcel, i31);
                            break;
                        case 23:
                            arrayListE = b5x.E(parcel, i31);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            strD32 = b5x.D(parcel, i31);
                            break;
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                            strD33 = b5x.D(parcel, i31);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                            strD42 = b5x.D(parcel, i31);
                            break;
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            zT22 = b5x.T(parcel, i31);
                            break;
                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                            jX12 = b5x.X(parcel, i31);
                            break;
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                            iW21 = b5x.W(parcel, i31);
                            break;
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                            strD34 = b5x.D(parcel, i31);
                            break;
                        case ' ':
                            iW23 = b5x.W(parcel, i31);
                            break;
                        case '\"':
                            jX13 = b5x.X(parcel, i31);
                            break;
                        case '#':
                            strD43 = b5x.D(parcel, i31);
                            break;
                        case '$':
                            strD35 = b5x.D(parcel, i31);
                            break;
                        case '%':
                            jX14 = b5x.X(parcel, i31);
                            break;
                        case '&':
                            iW24 = b5x.W(parcel, i31);
                            break;
                        case '\'':
                            jX15 = b5x.X(parcel, i31);
                            break;
                    }
                }
                b5x.H(parcel, iI28);
                return new com.google.android.gms.measurement.internal.zzr(strD36, strD37, strD38, strD39, jX8, jX9, strD40, zT18, zT20, jX16, strD41, jX10, iW22, zT19, zT21, boolU, jX11, arrayListE, strD32, strD33, strD42, zT22, jX12, iW21, strD34, iW23, jX13, strD43, strD35, jX14, iW24, jX15);
            default:
                int iI29 = b5x.i0(parcel);
                boolean zT23 = false;
                IBinder iBinderV3 = null;
                while (parcel.dataPosition() < iI29) {
                    int i32 = parcel.readInt();
                    char c14 = (char) i32;
                    if (c14 == 1) {
                        strD2 = b5x.D(parcel, i32);
                    } else if (c14 == 2) {
                        iBinderV3 = b5x.V(parcel, i32);
                    } else if (c14 == 3) {
                        zT = b5x.T(parcel, i32);
                    } else if (c14 != 4) {
                        b5x.b0(parcel, i32);
                    } else {
                        zT23 = b5x.T(parcel, i32);
                    }
                }
                b5x.H(parcel, iI29);
                return new com.google.android.gms.common.zzt(strD2, iBinderV3, zT, zT23);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f8302a) {
            case 0:
                return new com.google.firebase.auth.zzc[i];
            case 1:
                return new Status[i];
            case 2:
                return new AuthenticationExtensionsCredPropsOutputs[i];
            case 3:
                return new EmailAuthCredential[i];
            case 4:
                return new com.google.android.gms.fido.fido2.api.common.zzf[i];
            case 5:
                return new FacebookAuthCredential[i];
            case 6:
                return new com.google.android.gms.fido.fido2.api.common.zzh[i];
            case 7:
                return new AuthenticatorAssertionResponse[i];
            case 8:
                return new zzjf[i];
            case 9:
                return new zzjh[i];
            case 10:
                return new zzjj[i];
            case 11:
                return new zzjl[i];
            case 12:
                return new zzjo[i];
            case 13:
                return new zzjq[i];
            case 14:
                return new zzjs[i];
            case 15:
                return new zzju[i];
            case 16:
                return new com.google.android.gms.common.internal.zzj[i];
            case 17:
                return new AuthenticatorAttestationResponse[i];
            case 18:
                return new ConnectionTelemetryConfiguration[i];
            case com.huawei.hms.api.ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new AuthenticatorErrorResponse[i];
            case 20:
                return new GetServiceRequest[i];
            case 21:
                return new zzoh[i];
            case 22:
                return new zzom[i];
            case 23:
                return new zzoo[i];
            case 24:
                return new zzoq[i];
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zzpl[i];
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new com.google.android.gms.common.zzp[i];
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new com.google.android.gms.common.zzr[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new com.google.android.gms.measurement.internal.zzr[i];
            default:
                return new com.google.android.gms.common.zzt[i];
        }
    }
}
