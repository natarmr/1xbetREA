package a;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzbl;
import com.google.firebase.auth.zzao;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.yandex.authsdk.YandexAuthLoginOptions;
import com.yandex.authsdk.YandexAuthToken;
import java.util.ArrayList;
import org.xplatform.cyber.section.api.presentation.rules.VirtualSportRulesParams;
import org.xplatform.cyber.section.api.virtualgamescategories.VirtualGameCategoryParams;
import org.xplatform.cyber.section.api.virtualrecommended.VirtualRecommendedEventsParams;
import org.xplatform.search.impl.presentation.xgames.models.XGamesSearchFragmentSettings;
import org.xplatform.special_event.impl.who_win.presentation.model.WhoWinScreenParams;

/* JADX INFO: loaded from: classes2.dex */
public final class equ0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8253a;

    public /* synthetic */ equ0(byte b) {
        this.f8253a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean zT = false;
        int iW = 0;
        int iW2 = 0;
        int iW3 = 0;
        int iW4 = 0;
        int iW5 = 0;
        int iW6 = 0;
        Bundle bundleY = null;
        zzaia zzaiaVar = null;
        zzad zzadVar = null;
        Intent intent = null;
        String strD = null;
        PendingIntent pendingIntent = null;
        GoogleSignInAccount googleSignInAccount = null;
        Account account = null;
        ConnectionResult connectionResult = null;
        com.google.android.gms.common.internal.zay zayVar = null;
        ArrayList arrayListE = null;
        ArrayList arrayListG = null;
        Intent intent2 = null;
        ArrayList arrayListG2 = null;
        switch (this.f8253a) {
            case 0:
                parcel.getClass();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(Long.valueOf(parcel.readLong()));
                }
                return new VirtualGameCategoryParams(parcel.readInt(), parcel.readString(), parcel.readString(), arrayList);
            case 1:
                parcel.getClass();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
                return new VirtualRecommendedEventsParams(arrayList2);
            case 2:
                parcel.getClass();
                return new VirtualSportRulesParams(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                parcel.getClass();
                return new WhoWinScreenParams(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong());
            case 4:
                parcel.getClass();
                return new XGamesSearchFragmentSettings(parcel.readString(), parcel.readString());
            case 5:
                parcel.getClass();
                return new YandexAuthLoginOptions(vw00.valueOf(parcel.readString()), parcel.readString());
            case 6:
                parcel.getClass();
                return new YandexAuthToken(parcel.readLong(), parcel.readString(), parcel.readString());
            case 7:
                int iI0 = b5x.i0(parcel);
                int iW7 = 0;
                while (parcel.dataPosition() < iI0) {
                    int i5 = parcel.readInt();
                    char c = (char) i5;
                    if (c == 1) {
                        iW6 = b5x.W(parcel, i5);
                    } else if (c == 2) {
                        iW7 = b5x.W(parcel, i5);
                    } else if (c != 3) {
                        b5x.b0(parcel, i5);
                    } else {
                        bundleY = b5x.y(parcel, i5);
                    }
                }
                b5x.H(parcel, iI0);
                return new GoogleSignInOptionsExtensionParcelable(iW6, iW7, bundleY);
            case 8:
                int iI1 = b5x.i0(parcel);
                int iW8 = 0;
                boolean zT2 = false;
                boolean zT3 = false;
                IBinder iBinderV = null;
                ConnectionResult connectionResult2 = null;
                while (parcel.dataPosition() < iI1) {
                    int i6 = parcel.readInt();
                    char c2 = (char) i6;
                    if (c2 == 1) {
                        iW8 = b5x.W(parcel, i6);
                    } else if (c2 == 2) {
                        iBinderV = b5x.V(parcel, i6);
                    } else if (c2 == 3) {
                        connectionResult2 = (ConnectionResult) b5x.C(parcel, i6, ConnectionResult.CREATOR);
                    } else if (c2 == 4) {
                        zT2 = b5x.T(parcel, i6);
                    } else if (c2 != 5) {
                        b5x.b0(parcel, i6);
                    } else {
                        zT3 = b5x.T(parcel, i6);
                    }
                }
                b5x.H(parcel, iI1);
                return new zaaa(iW8, iBinderV, connectionResult2, zT2, zT3);
            case 9:
                int iI2 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI2) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 1) {
                        iW5 = b5x.W(parcel, i7);
                    } else if (c3 != 2) {
                        b5x.b0(parcel, i7);
                    } else {
                        arrayListG2 = b5x.G(parcel, i7, MethodInvocation.CREATOR);
                    }
                }
                b5x.H(parcel, iI2);
                return new TelemetryData(iW5, arrayListG2);
            case 10:
                int iI3 = b5x.i0(parcel);
                int iW9 = 0;
                while (parcel.dataPosition() < iI3) {
                    int i8 = parcel.readInt();
                    char c4 = (char) i8;
                    if (c4 == 1) {
                        iW4 = b5x.W(parcel, i8);
                    } else if (c4 == 2) {
                        iW9 = b5x.W(parcel, i8);
                    } else if (c4 != 3) {
                        b5x.b0(parcel, i8);
                    } else {
                        intent2 = (Intent) b5x.C(parcel, i8, Intent.CREATOR);
                    }
                }
                b5x.H(parcel, iI3);
                return new com.google.android.gms.signin.internal.zaa(iW4, iW9, intent2);
            case 11:
                int iI4 = b5x.i0(parcel);
                long jX = 0;
                String strD2 = null;
                String strD3 = null;
                String strD4 = null;
                String strD5 = null;
                Uri uri = null;
                String strD6 = null;
                String strD7 = null;
                ArrayList arrayListG3 = null;
                String strD8 = null;
                String strD9 = null;
                while (parcel.dataPosition() < iI4) {
                    int i9 = parcel.readInt();
                    switch ((char) i9) {
                        case 2:
                            strD2 = b5x.D(parcel, i9);
                            break;
                        case 3:
                            strD3 = b5x.D(parcel, i9);
                            break;
                        case 4:
                            strD4 = b5x.D(parcel, i9);
                            break;
                        case 5:
                            strD5 = b5x.D(parcel, i9);
                            break;
                        case 6:
                            uri = (Uri) b5x.C(parcel, i9, Uri.CREATOR);
                            break;
                        case 7:
                            strD6 = b5x.D(parcel, i9);
                            break;
                        case '\b':
                            jX = b5x.X(parcel, i9);
                            break;
                        case '\t':
                            strD7 = b5x.D(parcel, i9);
                            break;
                        case '\n':
                            arrayListG3 = b5x.G(parcel, i9, Scope.CREATOR);
                            break;
                        case 11:
                            strD8 = b5x.D(parcel, i9);
                            break;
                        case '\f':
                            strD9 = b5x.D(parcel, i9);
                            break;
                        default:
                            b5x.b0(parcel, i9);
                            break;
                    }
                }
                b5x.H(parcel, iI4);
                return new GoogleSignInAccount(strD2, strD3, strD4, strD5, uri, strD6, jX, strD7, arrayListG3, strD8, strD9);
            case 12:
                int iI5 = b5x.i0(parcel);
                long jX2 = 0;
                int iW10 = 0;
                int iW11 = 0;
                boolean zT4 = false;
                String strD10 = null;
                while (parcel.dataPosition() < iI5) {
                    int i10 = parcel.readInt();
                    char c5 = (char) i10;
                    if (c5 == 1) {
                        iW10 = b5x.W(parcel, i10);
                    } else if (c5 == 2) {
                        strD10 = b5x.D(parcel, i10);
                    } else if (c5 == 3) {
                        jX2 = b5x.X(parcel, i10);
                    } else if (c5 == 4) {
                        iW11 = b5x.W(parcel, i10);
                    } else if (c5 != 5) {
                        b5x.b0(parcel, i10);
                    } else {
                        zT4 = b5x.T(parcel, i10);
                    }
                }
                b5x.H(parcel, iI5);
                return new com.google.android.gms.common.internal.zab(iW10, iW11, jX2, strD10, zT4);
            case 13:
                int iI6 = b5x.i0(parcel);
                int iW12 = 0;
                boolean zT5 = false;
                boolean zT6 = false;
                boolean zT7 = false;
                ArrayList arrayListG4 = null;
                Account account2 = null;
                String strD11 = null;
                String strD12 = null;
                String strD13 = null;
                while (parcel.dataPosition() < iI6) {
                    int i11 = parcel.readInt();
                    switch ((char) i11) {
                        case 1:
                            iW12 = b5x.W(parcel, i11);
                            break;
                        case 2:
                            arrayListG4 = b5x.G(parcel, i11, Scope.CREATOR);
                            break;
                        case 3:
                            account2 = (Account) b5x.C(parcel, i11, Account.CREATOR);
                            break;
                        case 4:
                            zT5 = b5x.T(parcel, i11);
                            break;
                        case 5:
                            zT6 = b5x.T(parcel, i11);
                            break;
                        case 6:
                            zT7 = b5x.T(parcel, i11);
                            break;
                        case 7:
                            strD11 = b5x.D(parcel, i11);
                            break;
                        case '\b':
                            strD12 = b5x.D(parcel, i11);
                            break;
                        case '\t':
                            arrayListG = b5x.G(parcel, i11, GoogleSignInOptionsExtensionParcelable.CREATOR);
                            break;
                        case '\n':
                            strD13 = b5x.D(parcel, i11);
                            break;
                        default:
                            b5x.b0(parcel, i11);
                            break;
                    }
                }
                b5x.H(parcel, iI6);
                return new GoogleSignInOptions(iW12, arrayListG4, account2, zT5, zT6, zT7, strD11, strD12, GoogleSignInOptions.o(arrayListG), strD13);
            case 14:
                int iI7 = b5x.i0(parcel);
                String strD14 = null;
                while (parcel.dataPosition() < iI7) {
                    int i12 = parcel.readInt();
                    char c6 = (char) i12;
                    if (c6 == 1) {
                        arrayListE = b5x.E(parcel, i12);
                    } else if (c6 != 2) {
                        b5x.b0(parcel, i12);
                    } else {
                        strD14 = b5x.D(parcel, i12);
                    }
                }
                b5x.H(parcel, iI7);
                return new com.google.android.gms.signin.internal.zag(strD14, arrayListE);
            case 15:
                int iI8 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI8) {
                    int i13 = parcel.readInt();
                    char c7 = (char) i13;
                    if (c7 == 1) {
                        iW3 = b5x.W(parcel, i13);
                    } else if (c7 != 2) {
                        b5x.b0(parcel, i13);
                    } else {
                        zayVar = (com.google.android.gms.common.internal.zay) b5x.C(parcel, i13, com.google.android.gms.common.internal.zay.CREATOR);
                    }
                }
                b5x.H(parcel, iI8);
                return new com.google.android.gms.signin.internal.zai(iW3, zayVar);
            case 16:
                int iI9 = b5x.i0(parcel);
                zaaa zaaaVar = null;
                while (parcel.dataPosition() < iI9) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 1) {
                        iW2 = b5x.W(parcel, i14);
                    } else if (c8 == 2) {
                        connectionResult = (ConnectionResult) b5x.C(parcel, i14, ConnectionResult.CREATOR);
                    } else if (c8 != 3) {
                        b5x.b0(parcel, i14);
                    } else {
                        zaaaVar = (zaaa) b5x.C(parcel, i14, zaaa.CREATOR);
                    }
                }
                b5x.H(parcel, iI9);
                return new com.google.android.gms.signin.internal.zak(iW2, connectionResult, zaaaVar);
            case 17:
                int iI10 = b5x.i0(parcel);
                int iW13 = -1;
                long jX3 = 0;
                long jX4 = 0;
                int iW14 = 0;
                int iW15 = 0;
                int iW16 = 0;
                int iW17 = 0;
                String strD15 = null;
                String strD16 = null;
                while (parcel.dataPosition() < iI10) {
                    int i15 = parcel.readInt();
                    switch ((char) i15) {
                        case 1:
                            iW14 = b5x.W(parcel, i15);
                            break;
                        case 2:
                            iW15 = b5x.W(parcel, i15);
                            break;
                        case 3:
                            iW16 = b5x.W(parcel, i15);
                            break;
                        case 4:
                            jX3 = b5x.X(parcel, i15);
                            break;
                        case 5:
                            jX4 = b5x.X(parcel, i15);
                            break;
                        case 6:
                            strD15 = b5x.D(parcel, i15);
                            break;
                        case 7:
                            strD16 = b5x.D(parcel, i15);
                            break;
                        case '\b':
                            iW17 = b5x.W(parcel, i15);
                            break;
                        case '\t':
                            iW13 = b5x.W(parcel, i15);
                            break;
                        default:
                            b5x.b0(parcel, i15);
                            break;
                    }
                }
                b5x.H(parcel, iI10);
                return new MethodInvocation(iW14, iW15, iW16, iW17, iW13, jX3, jX4, strD15, strD16);
            case 18:
                int iI11 = b5x.i0(parcel);
                int iW18 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel.dataPosition() < iI11) {
                    int i16 = parcel.readInt();
                    char c9 = (char) i16;
                    if (c9 == 1) {
                        iW = b5x.W(parcel, i16);
                    } else if (c9 == 2) {
                        account = (Account) b5x.C(parcel, i16, Account.CREATOR);
                    } else if (c9 == 3) {
                        iW18 = b5x.W(parcel, i16);
                    } else if (c9 != 4) {
                        b5x.b0(parcel, i16);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) b5x.C(parcel, i16, GoogleSignInAccount.CREATOR);
                    }
                }
                b5x.H(parcel, iI11);
                return new com.google.android.gms.common.internal.zay(iW, account, iW18, googleSignInAccount2);
            case com.huawei.hms.api.ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int iI12 = b5x.i0(parcel);
                String strD17 = "";
                String strD18 = "";
                while (parcel.dataPosition() < iI12) {
                    int i17 = parcel.readInt();
                    char c10 = (char) i17;
                    if (c10 == 4) {
                        strD17 = b5x.D(parcel, i17);
                    } else if (c10 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) b5x.C(parcel, i17, GoogleSignInAccount.CREATOR);
                    } else if (c10 != '\b') {
                        b5x.b0(parcel, i17);
                    } else {
                        strD18 = b5x.D(parcel, i17);
                    }
                }
                b5x.H(parcel, iI12);
                return new SignInAccount(strD17, googleSignInAccount, strD18);
            case 20:
                int iI13 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI13) {
                    int i18 = parcel.readInt();
                    if (((char) i18) != 1) {
                        b5x.b0(parcel, i18);
                    } else {
                        pendingIntent = (PendingIntent) b5x.C(parcel, i18, PendingIntent.CREATOR);
                    }
                }
                b5x.H(parcel, iI13);
                return new BeginSignInResult(pendingIntent);
            case 21:
                int iI14 = b5x.i0(parcel);
                int iW19 = 0;
                boolean zT8 = false;
                String strD19 = null;
                String strD20 = null;
                String strD21 = null;
                String strD22 = null;
                while (parcel.dataPosition() < iI14) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 1:
                            strD19 = b5x.D(parcel, i19);
                            break;
                        case 2:
                            strD20 = b5x.D(parcel, i19);
                            break;
                        case 3:
                            strD21 = b5x.D(parcel, i19);
                            break;
                        case 4:
                            strD22 = b5x.D(parcel, i19);
                            break;
                        case 5:
                            zT8 = b5x.T(parcel, i19);
                            break;
                        case 6:
                            iW19 = b5x.W(parcel, i19);
                            break;
                        default:
                            b5x.b0(parcel, i19);
                            break;
                    }
                }
                b5x.H(parcel, iI14);
                return new GetSignInIntentRequest(iW19, strD19, strD20, strD21, strD22, zT8);
            case 22:
                int iI15 = b5x.i0(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iI15) {
                    int i20 = parcel.readInt();
                    char c11 = (char) i20;
                    if (c11 == 2) {
                        strD = b5x.D(parcel, i20);
                    } else if (c11 != 5) {
                        b5x.b0(parcel, i20);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) b5x.C(parcel, i20, GoogleSignInOptions.CREATOR);
                    }
                }
                b5x.H(parcel, iI15);
                return new SignInConfiguration(strD, googleSignInOptions);
            case 23:
                int iI16 = b5x.i0(parcel);
                String strD23 = null;
                String strD24 = null;
                String strD25 = null;
                String strD26 = null;
                Uri uri2 = null;
                String strD27 = null;
                String strD28 = null;
                String strD29 = null;
                PublicKeyCredential publicKeyCredential = null;
                while (parcel.dataPosition() < iI16) {
                    int i21 = parcel.readInt();
                    switch ((char) i21) {
                        case 1:
                            strD23 = b5x.D(parcel, i21);
                            break;
                        case 2:
                            strD24 = b5x.D(parcel, i21);
                            break;
                        case 3:
                            strD25 = b5x.D(parcel, i21);
                            break;
                        case 4:
                            strD26 = b5x.D(parcel, i21);
                            break;
                        case 5:
                            uri2 = (Uri) b5x.C(parcel, i21, Uri.CREATOR);
                            break;
                        case 6:
                            strD27 = b5x.D(parcel, i21);
                            break;
                        case 7:
                            strD28 = b5x.D(parcel, i21);
                            break;
                        case '\b':
                            strD29 = b5x.D(parcel, i21);
                            break;
                        case '\t':
                            publicKeyCredential = (PublicKeyCredential) b5x.C(parcel, i21, PublicKeyCredential.CREATOR);
                            break;
                        default:
                            b5x.b0(parcel, i21);
                            break;
                    }
                }
                b5x.H(parcel, iI16);
                return new SignInCredential(strD23, strD24, strD25, strD26, uri2, strD27, strD28, strD29, publicKeyCredential);
            case 24:
                int iI17 = b5x.i0(parcel);
                while (parcel.dataPosition() < iI17) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 1) {
                        b5x.b0(parcel, i22);
                    } else {
                        intent = (Intent) b5x.C(parcel, i22, Intent.CREATOR);
                    }
                }
                b5x.H(parcel, iI17);
                return new CloudMessage(intent);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iI18 = b5x.i0(parcel);
                int iW20 = 0;
                int iW21 = 0;
                PendingIntent pendingIntent2 = null;
                String strD30 = null;
                Integer numValueOf = null;
                while (parcel.dataPosition() < iI18) {
                    int i23 = parcel.readInt();
                    char c12 = (char) i23;
                    if (c12 == 1) {
                        iW20 = b5x.W(parcel, i23);
                    } else if (c12 == 2) {
                        iW21 = b5x.W(parcel, i23);
                    } else if (c12 == 3) {
                        pendingIntent2 = (PendingIntent) b5x.C(parcel, i23, PendingIntent.CREATOR);
                    } else if (c12 == 4) {
                        strD30 = b5x.D(parcel, i23);
                    } else if (c12 != 5) {
                        b5x.b0(parcel, i23);
                    } else {
                        int iZ = b5x.Z(parcel, i23);
                        if (iZ == 0) {
                            numValueOf = null;
                        } else {
                            b5x.k0(parcel, iZ, 4);
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                b5x.H(parcel, iI18);
                return new ConnectionResult(iW20, iW21, pendingIntent2, strD30, numValueOf);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int iI19 = b5x.i0(parcel);
                com.google.firebase.auth.internal.zzv zzvVar = null;
                com.google.firebase.auth.zzc zzcVar = null;
                while (parcel.dataPosition() < iI19) {
                    int i24 = parcel.readInt();
                    char c13 = (char) i24;
                    if (c13 == 1) {
                        zzadVar = (zzad) b5x.C(parcel, i24, zzad.CREATOR);
                    } else if (c13 == 2) {
                        zzvVar = (com.google.firebase.auth.internal.zzv) b5x.C(parcel, i24, com.google.firebase.auth.internal.zzv.CREATOR);
                    } else if (c13 != 3) {
                        b5x.b0(parcel, i24);
                    } else {
                        zzcVar = (com.google.firebase.auth.zzc) b5x.C(parcel, i24, com.google.firebase.auth.zzc.CREATOR);
                    }
                }
                b5x.H(parcel, iI19);
                com.google.firebase.auth.internal.zzx zzxVar = new com.google.firebase.auth.internal.zzx();
                zzxVar.f45658a = zzadVar;
                zzxVar.b = zzvVar;
                zzxVar.c = zzcVar;
                return zzxVar;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int iI20 = b5x.i0(parcel);
                boolean zT9 = false;
                String strD31 = null;
                String strD32 = null;
                String strD33 = null;
                String strD34 = null;
                String strD35 = null;
                String strD36 = null;
                String strD37 = null;
                while (parcel.dataPosition() < iI20) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 1:
                            strD31 = b5x.D(parcel, i25);
                            break;
                        case 2:
                            strD32 = b5x.D(parcel, i25);
                            break;
                        case 3:
                            strD35 = b5x.D(parcel, i25);
                            break;
                        case 4:
                            strD34 = b5x.D(parcel, i25);
                            break;
                        case 5:
                            strD33 = b5x.D(parcel, i25);
                            break;
                        case 6:
                            strD36 = b5x.D(parcel, i25);
                            break;
                        case 7:
                            zT9 = b5x.T(parcel, i25);
                            break;
                        case '\b':
                            strD37 = b5x.D(parcel, i25);
                            break;
                        default:
                            b5x.b0(parcel, i25);
                            break;
                    }
                }
                b5x.H(parcel, iI20);
                return new com.google.firebase.auth.internal.zzz(strD31, strD32, strD33, strD34, strD35, strD36, zT9, strD37);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int iI21 = b5x.i0(parcel);
                long jX5 = 0;
                long jX6 = 0;
                int iW22 = 0;
                while (parcel.dataPosition() < iI21) {
                    int i26 = parcel.readInt();
                    char c14 = (char) i26;
                    if (c14 == 1) {
                        jX5 = b5x.X(parcel, i26);
                    } else if (c14 == 2) {
                        iW22 = b5x.W(parcel, i26);
                    } else if (c14 != 3) {
                        b5x.b0(parcel, i26);
                    } else {
                        jX6 = b5x.X(parcel, i26);
                    }
                }
                b5x.H(parcel, iI21);
                return new zzaf(iW22, jX5, jX6);
            default:
                int iI22 = b5x.i0(parcel);
                com.google.firebase.auth.internal.zzz zzzVar = null;
                String strD38 = null;
                String strD39 = null;
                ArrayList arrayListG5 = null;
                ArrayList arrayListE2 = null;
                String strD40 = null;
                Boolean boolU = null;
                com.google.firebase.auth.internal.zzaf zzafVar = null;
                com.google.firebase.auth.zzc zzcVar2 = null;
                zzbl zzblVar = null;
                ArrayList arrayListG6 = null;
                while (parcel.dataPosition() < iI22) {
                    int i27 = parcel.readInt();
                    ArrayList arrayList3 = arrayListG6;
                    switch ((char) i27) {
                        case 1:
                            zzaiaVar = (zzaia) b5x.C(parcel, i27, zzaia.CREATOR);
                            break;
                        case 2:
                            zzzVar = (com.google.firebase.auth.internal.zzz) b5x.C(parcel, i27, com.google.firebase.auth.internal.zzz.CREATOR);
                            break;
                        case 3:
                            strD38 = b5x.D(parcel, i27);
                            break;
                        case 4:
                            strD39 = b5x.D(parcel, i27);
                            break;
                        case 5:
                            arrayListG5 = b5x.G(parcel, i27, com.google.firebase.auth.internal.zzz.CREATOR);
                            break;
                        case 6:
                            arrayListE2 = b5x.E(parcel, i27);
                            break;
                        case 7:
                            strD40 = b5x.D(parcel, i27);
                            break;
                        case '\b':
                            boolU = b5x.U(parcel, i27);
                            break;
                        case '\t':
                            zzafVar = (com.google.firebase.auth.internal.zzaf) b5x.C(parcel, i27, com.google.firebase.auth.internal.zzaf.CREATOR);
                            break;
                        case '\n':
                            zT = b5x.T(parcel, i27);
                            break;
                        case 11:
                            zzcVar2 = (com.google.firebase.auth.zzc) b5x.C(parcel, i27, com.google.firebase.auth.zzc.CREATOR);
                            break;
                        case '\f':
                            zzblVar = (zzbl) b5x.C(parcel, i27, zzbl.CREATOR);
                            break;
                        case '\r':
                            arrayListG6 = b5x.G(parcel, i27, zzao.CREATOR);
                            continue;
                        default:
                            b5x.b0(parcel, i27);
                            break;
                    }
                    arrayListG6 = arrayList3;
                }
                b5x.H(parcel, iI22);
                zzad zzadVar2 = new zzad();
                zzadVar2.f45652a = zzaiaVar;
                zzadVar2.b = zzzVar;
                zzadVar2.c = strD38;
                zzadVar2.d = strD39;
                zzadVar2.e = arrayListG5;
                zzadVar2.f = arrayListE2;
                zzadVar2.g = strD40;
                zzadVar2.h = boolU;
                zzadVar2.i = zzafVar;
                zzadVar2.j = zT;
                zzadVar2.k = zzcVar2;
                zzadVar2.l = zzblVar;
                zzadVar2.m = arrayListG6;
                return zzadVar2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f8253a) {
            case 0:
                return new VirtualGameCategoryParams[i];
            case 1:
                return new VirtualRecommendedEventsParams[i];
            case 2:
                return new VirtualSportRulesParams[i];
            case 3:
                return new WhoWinScreenParams[i];
            case 4:
                return new XGamesSearchFragmentSettings[i];
            case 5:
                return new YandexAuthLoginOptions[i];
            case 6:
                return new YandexAuthToken[i];
            case 7:
                return new GoogleSignInOptionsExtensionParcelable[i];
            case 8:
                return new zaaa[i];
            case 9:
                return new TelemetryData[i];
            case 10:
                return new com.google.android.gms.signin.internal.zaa[i];
            case 11:
                return new GoogleSignInAccount[i];
            case 12:
                return new com.google.android.gms.common.internal.zab[i];
            case 13:
                return new GoogleSignInOptions[i];
            case 14:
                return new com.google.android.gms.signin.internal.zag[i];
            case 15:
                return new com.google.android.gms.signin.internal.zai[i];
            case 16:
                return new com.google.android.gms.signin.internal.zak[i];
            case 17:
                return new MethodInvocation[i];
            case 18:
                return new com.google.android.gms.common.internal.zay[i];
            case com.huawei.hms.api.ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new SignInAccount[i];
            case 20:
                return new BeginSignInResult[i];
            case 21:
                return new GetSignInIntentRequest[i];
            case 22:
                return new SignInConfiguration[i];
            case 23:
                return new SignInCredential[i];
            case 24:
                return new CloudMessage[i];
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new ConnectionResult[i];
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new com.google.firebase.auth.internal.zzx[i];
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new com.google.firebase.auth.internal.zzz[i];
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zzaf[i];
            default:
                return new zzad[i];
        }
    }
}
