package com.google.android.gms.common;

import a.dq00;
import a.equ0;
import a.l8x;
import a.q5x;
import a.vqd;
import android.app.PendingIntent;
import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45480a;
    public final int b;
    public final PendingIntent c;
    public final String d;
    public final Integer e;
    public static final ConnectionResult f = new ConnectionResult(0, null, null);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new equ0(25);

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.f45480a = i;
        this.b = i2;
        this.c = pendingIntent;
        this.d = str;
        this.e = num;
    }

    public static String m(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return Payload.RESPONSE_DEVELOPER_ERROR;
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return Payload.RESPONSE_TIMEOUT;
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case com.huawei.hms.api.ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return vqd.p(new StringBuilder(String.valueOf(i).length() + 20), "UNKNOWN_ERROR_CODE(", i, Separators.RPAREN);
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.b == connectionResult.b && l8x.Z(this.c, connectionResult.c) && l8x.Z(this.d, connectionResult.d) && l8x.Z(this.e, connectionResult.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d, this.e});
    }

    public final String toString() {
        dq00 dq00Var = new dq00(this);
        dq00Var.a(m(this.b), HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        dq00Var.a(this.c, CommonCode.MapKey.HAS_RESOLUTION);
        dq00Var.a(this.d, CrashHianalyticsData.MESSAGE);
        dq00Var.a(this.e, "clientMethodKey");
        return dq00Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iP0 = q5x.p0(parcel, 20293);
        q5x.o0(parcel, 1, 4);
        parcel.writeInt(this.f45480a);
        q5x.o0(parcel, 2, 4);
        parcel.writeInt(this.b);
        q5x.j0(parcel, 3, this.c, i);
        q5x.k0(parcel, 4, this.d);
        Integer num = this.e;
        if (num != null) {
            q5x.o0(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        q5x.q0(parcel, iP0);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
