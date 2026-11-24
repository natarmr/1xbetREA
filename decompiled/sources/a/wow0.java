package a;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.appsflyer.share.attribution.RequestError;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.internal.measurement.zzdd;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wow0 extends umw0 implements yow0 {
    public static yow0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof yow0 ? (yow0) iInterfaceQueryLocalInterface : new sow0(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", (byte) 4);
    }

    @Override // a.umw0
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        gpw0 bpw0Var = null;
        mpw0 ipw0Var = null;
        gpw0 bpw0Var2 = null;
        gpw0 bpw0Var3 = null;
        gpw0 bpw0Var4 = null;
        gpw0 bpw0Var5 = null;
        rpw0 opw0Var = null;
        rpw0 opw0Var2 = null;
        rpw0 opw0Var3 = null;
        gpw0 bpw0Var6 = null;
        gpw0 bpw0Var7 = null;
        gpw0 bpw0Var8 = null;
        gpw0 bpw0Var9 = null;
        gpw0 bpw0Var10 = null;
        gpw0 bpw0Var11 = null;
        eqw0 spw0Var = null;
        gpw0 bpw0Var12 = null;
        gpw0 bpw0Var13 = null;
        gpw0 bpw0Var14 = null;
        gpw0 bpw0Var15 = null;
        gpw0 bpw0Var16 = null;
        switch (i) {
            case 1:
                gvw gvwVarG = aa60.G(parcel.readStrongBinder());
                zzdb zzdbVar = (zzdb) wmw0.a(parcel, zzdb.CREATOR);
                long j = parcel.readLong();
                wmw0.d(parcel);
                initialize(gvwVarG, zzdbVar, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) wmw0.a(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long j2 = parcel.readLong();
                wmw0.d(parcel);
                logEvent(string, string2, bundle, z2, z3, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) wmw0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    bpw0Var = iInterfaceQueryLocalInterface instanceof gpw0 ? (gpw0) iInterfaceQueryLocalInterface : new bpw0(strongBinder);
                }
                gpw0 gpw0Var = bpw0Var;
                long j3 = parcel.readLong();
                wmw0.d(parcel);
                logEventAndBundle(string3, string4, bundle2, gpw0Var, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                gvw gvwVarG2 = aa60.G(parcel.readStrongBinder());
                ClassLoader classLoader = wmw0.f39422a;
                boolean z4 = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                wmw0.d(parcel);
                setUserProperty(string5, string6, gvwVarG2, z4, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = wmw0.f39422a;
                boolean z5 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    bpw0Var16 = iInterfaceQueryLocalInterface2 instanceof gpw0 ? (gpw0) iInterfaceQueryLocalInterface2 : new bpw0(strongBinder2);
                }
                wmw0.d(parcel);
                getUserProperties(string7, string8, z5, bpw0Var16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    bpw0Var15 = iInterfaceQueryLocalInterface3 instanceof gpw0 ? (gpw0) iInterfaceQueryLocalInterface3 : new bpw0(strongBinder3);
                }
                wmw0.d(parcel);
                getMaxUserProperties(string9, bpw0Var15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                wmw0.d(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) wmw0.a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                wmw0.d(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) wmw0.a(parcel, Bundle.CREATOR);
                wmw0.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    bpw0Var14 = iInterfaceQueryLocalInterface4 instanceof gpw0 ? (gpw0) iInterfaceQueryLocalInterface4 : new bpw0(strongBinder4);
                }
                wmw0.d(parcel);
                getConditionalUserProperties(string13, string14, bpw0Var14);
                break;
            case 11:
                ClassLoader classLoader3 = wmw0.f39422a;
                boolean z6 = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                wmw0.d(parcel);
                setMeasurementEnabled(z6, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                wmw0.d(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                wmw0.d(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                wmw0.d(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                gvw gvwVarG3 = aa60.G(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                wmw0.d(parcel);
                setCurrentScreen(gvwVarG3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    bpw0Var13 = iInterfaceQueryLocalInterface5 instanceof gpw0 ? (gpw0) iInterfaceQueryLocalInterface5 : new bpw0(strongBinder5);
                }
                wmw0.d(parcel);
                getCurrentScreenName(bpw0Var13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    bpw0Var12 = iInterfaceQueryLocalInterface6 instanceof gpw0 ? (gpw0) iInterfaceQueryLocalInterface6 : new bpw0(strongBinder6);
                }
                wmw0.d(parcel);
                getCurrentScreenClass(bpw0Var12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    spw0Var = iInterfaceQueryLocalInterface7 instanceof eqw0 ? (eqw0) iInterfaceQueryLocalInterface7 : new spw0(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", (byte) 4);
                }
                wmw0.d(parcel);
                setInstanceIdProvider(spw0Var);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    bpw0Var11 = iInterfaceQueryLocalInterface8 instanceof gpw0 ? (gpw0) iInterfaceQueryLocalInterface8 : new bpw0(strongBinder8);
                }
                wmw0.d(parcel);
                getCachedAppInstanceId(bpw0Var11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    bpw0Var10 = iInterfaceQueryLocalInterface9 instanceof gpw0 ? (gpw0) iInterfaceQueryLocalInterface9 : new bpw0(strongBinder9);
                }
                wmw0.d(parcel);
                getAppInstanceId(bpw0Var10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    bpw0Var9 = iInterfaceQueryLocalInterface10 instanceof gpw0 ? (gpw0) iInterfaceQueryLocalInterface10 : new bpw0(strongBinder10);
                }
                wmw0.d(parcel);
                getGmpAppId(bpw0Var9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    bpw0Var8 = iInterfaceQueryLocalInterface11 instanceof gpw0 ? (gpw0) iInterfaceQueryLocalInterface11 : new bpw0(strongBinder11);
                }
                wmw0.d(parcel);
                generateEventId(bpw0Var8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                wmw0.d(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                wmw0.d(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gvw gvwVarG4 = aa60.G(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                wmw0.d(parcel);
                onActivityStarted(gvwVarG4, j14);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                gvw gvwVarG5 = aa60.G(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                wmw0.d(parcel);
                onActivityStopped(gvwVarG5, j15);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gvw gvwVarG6 = aa60.G(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) wmw0.a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                wmw0.d(parcel);
                onActivityCreated(gvwVarG6, bundle5, j16);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                gvw gvwVarG7 = aa60.G(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                wmw0.d(parcel);
                onActivityDestroyed(gvwVarG7, j17);
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                gvw gvwVarG8 = aa60.G(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                wmw0.d(parcel);
                onActivityPaused(gvwVarG8, j18);
                break;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                gvw gvwVarG9 = aa60.G(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                wmw0.d(parcel);
                onActivityResumed(gvwVarG9, j19);
                break;
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                gvw gvwVarG10 = aa60.G(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    bpw0Var7 = iInterfaceQueryLocalInterface12 instanceof gpw0 ? (gpw0) iInterfaceQueryLocalInterface12 : new bpw0(strongBinder12);
                }
                long j20 = parcel.readLong();
                wmw0.d(parcel);
                onActivitySaveInstanceState(gvwVarG10, bpw0Var7, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) wmw0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    bpw0Var6 = iInterfaceQueryLocalInterface13 instanceof gpw0 ? (gpw0) iInterfaceQueryLocalInterface13 : new bpw0(strongBinder13);
                }
                long j21 = parcel.readLong();
                wmw0.d(parcel);
                performAction(bundle6, bpw0Var6, j21);
                break;
            case 33:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                gvw gvwVarG11 = aa60.G(parcel.readStrongBinder());
                gvw gvwVarG12 = aa60.G(parcel.readStrongBinder());
                gvw gvwVarG13 = aa60.G(parcel.readStrongBinder());
                wmw0.d(parcel);
                logHealthData(i2, string19, gvwVarG11, gvwVarG12, gvwVarG13);
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    opw0Var3 = iInterfaceQueryLocalInterface14 instanceof rpw0 ? (rpw0) iInterfaceQueryLocalInterface14 : new opw0(strongBinder14);
                }
                wmw0.d(parcel);
                setEventInterceptor(opw0Var3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    opw0Var2 = iInterfaceQueryLocalInterface15 instanceof rpw0 ? (rpw0) iInterfaceQueryLocalInterface15 : new opw0(strongBinder15);
                }
                wmw0.d(parcel);
                registerOnMeasurementEventListener(opw0Var2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    opw0Var = iInterfaceQueryLocalInterface16 instanceof rpw0 ? (rpw0) iInterfaceQueryLocalInterface16 : new opw0(strongBinder16);
                }
                wmw0.d(parcel);
                unregisterOnMeasurementEventListener(opw0Var);
                break;
            case 37:
                HashMap hashMap = parcel.readHashMap(wmw0.f39422a);
                wmw0.d(parcel);
                initForTests(hashMap);
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    bpw0Var5 = iInterfaceQueryLocalInterface17 instanceof gpw0 ? (gpw0) iInterfaceQueryLocalInterface17 : new bpw0(strongBinder17);
                }
                int i3 = parcel.readInt();
                wmw0.d(parcel);
                getTestFlag(bpw0Var5, i3);
                break;
            case 39:
                ClassLoader classLoader4 = wmw0.f39422a;
                boolean z7 = parcel.readInt() != 0;
                wmw0.d(parcel);
                setDataCollectionEnabled(z7);
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    bpw0Var4 = iInterfaceQueryLocalInterface18 instanceof gpw0 ? (gpw0) iInterfaceQueryLocalInterface18 : new bpw0(strongBinder18);
                }
                wmw0.d(parcel);
                isDataCollectionEnabled(bpw0Var4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) wmw0.a(parcel, Bundle.CREATOR);
                wmw0.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long j22 = parcel.readLong();
                wmw0.d(parcel);
                clearMeasurementEnabled(j22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) wmw0.a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                wmw0.d(parcel);
                setConsent(bundle8, j23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) wmw0.a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                wmw0.d(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case 46:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    bpw0Var3 = iInterfaceQueryLocalInterface19 instanceof gpw0 ? (gpw0) iInterfaceQueryLocalInterface19 : new bpw0(strongBinder19);
                }
                wmw0.d(parcel);
                getSessionId(bpw0Var3);
                break;
            case 48:
                Intent intent = (Intent) wmw0.a(parcel, Intent.CREATOR);
                wmw0.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                zzdd zzddVar = (zzdd) wmw0.a(parcel, zzdd.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                wmw0.d(parcel);
                setCurrentScreenByScionActivityInfo(zzddVar, string20, string21, j25);
                break;
            case 51:
                zzdd zzddVar2 = (zzdd) wmw0.a(parcel, zzdd.CREATOR);
                long j26 = parcel.readLong();
                wmw0.d(parcel);
                onActivityStartedByScionActivityInfo(zzddVar2, j26);
                break;
            case 52:
                zzdd zzddVar3 = (zzdd) wmw0.a(parcel, zzdd.CREATOR);
                long j27 = parcel.readLong();
                wmw0.d(parcel);
                onActivityStoppedByScionActivityInfo(zzddVar3, j27);
                break;
            case 53:
                zzdd zzddVar4 = (zzdd) wmw0.a(parcel, zzdd.CREATOR);
                Bundle bundle10 = (Bundle) wmw0.a(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                wmw0.d(parcel);
                onActivityCreatedByScionActivityInfo(zzddVar4, bundle10, j28);
                break;
            case 54:
                zzdd zzddVar5 = (zzdd) wmw0.a(parcel, zzdd.CREATOR);
                long j29 = parcel.readLong();
                wmw0.d(parcel);
                onActivityDestroyedByScionActivityInfo(zzddVar5, j29);
                break;
            case 55:
                zzdd zzddVar6 = (zzdd) wmw0.a(parcel, zzdd.CREATOR);
                long j30 = parcel.readLong();
                wmw0.d(parcel);
                onActivityPausedByScionActivityInfo(zzddVar6, j30);
                break;
            case 56:
                zzdd zzddVar7 = (zzdd) wmw0.a(parcel, zzdd.CREATOR);
                long j31 = parcel.readLong();
                wmw0.d(parcel);
                onActivityResumedByScionActivityInfo(zzddVar7, j31);
                break;
            case 57:
                zzdd zzddVar8 = (zzdd) wmw0.a(parcel, zzdd.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    bpw0Var2 = iInterfaceQueryLocalInterface20 instanceof gpw0 ? (gpw0) iInterfaceQueryLocalInterface20 : new bpw0(strongBinder20);
                }
                long j32 = parcel.readLong();
                wmw0.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(zzddVar8, bpw0Var2, j32);
                break;
            case 58:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    ipw0Var = iInterfaceQueryLocalInterface21 instanceof mpw0 ? (mpw0) iInterfaceQueryLocalInterface21 : new ipw0(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", (byte) 4);
                }
                wmw0.d(parcel);
                retrieveAndUploadBatches(ipw0Var);
                break;
            case 59:
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                Bundle bundle11 = (Bundle) wmw0.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolean z8 = parcel.readInt() != 0;
                long j33 = parcel.readLong();
                long j34 = parcel.readLong();
                wmw0.d(parcel);
                logEventWithElapsedTime(string22, string23, bundle11, z, z8, j33, j34);
                break;
            case 60:
                gvw gvwVarG14 = aa60.G(parcel.readStrongBinder());
                zzdb zzdbVar2 = (zzdb) wmw0.a(parcel, zzdb.CREATOR);
                long j35 = parcel.readLong();
                long j36 = parcel.readLong();
                wmw0.d(parcel);
                initializeWithElapsedTime(gvwVarG14, zzdbVar2, j35, j36);
                break;
            case 61:
                long j37 = parcel.readLong();
                long j38 = parcel.readLong();
                wmw0.d(parcel);
                resetAnalyticsDataWithElapsedTime(j37, j38);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
