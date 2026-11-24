package a;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class ld3 extends c2 {
    public final /* synthetic */ byte c = 1;
    public final /* synthetic */ pd3 d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld3(pd3 pd3Var, Context context) {
        super(pd3Var);
        this.d = pd3Var;
        this.e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // a.c2
    public final void B() {
        byte b = this.c;
        pd3 pd3Var = this.d;
        switch (b) {
            case 0:
                pd3Var.E(true, true);
                break;
            default:
                pd3Var.E(true, true);
                break;
        }
    }

    @Override // a.c2
    public final IntentFilter f() {
        switch (this.c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // a.c2
    public final int k() {
        Location location;
        boolean z;
        long j;
        Location lastKnownLocation;
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                return ((PowerManager) obj).isPowerSaveMode() ? 2 : 1;
            default:
                yuu yuuVar = (yuu) obj;
                LocationManager locationManager = (LocationManager) yuuVar.c;
                kfn0 kfn0Var = (kfn0) yuuVar.d;
                if (kfn0Var.b <= System.currentTimeMillis()) {
                    Context context = (Context) yuuVar.b;
                    Location lastKnownLocation2 = null;
                    if (l7x.D(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (l7x.D(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        xrs xrsVar = xrs.d;
                        if (xrsVar == null) {
                            xrsVar = new xrs();
                            xrs.d = xrsVar;
                        }
                        xrs xrsVar2 = xrsVar;
                        xrsVar2.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        xrsVar2.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = xrsVar2.c;
                        long j2 = xrsVar2.b;
                        long j3 = xrsVar2.f41384a;
                        xrsVar2.a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = xrsVar2.b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        kfn0Var.f18204a = z;
                        kfn0Var.b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = kfn0Var.f18204a;
                }
                return z ? 2 : 1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld3(pd3 pd3Var, yuu yuuVar) {
        super(pd3Var);
        this.d = pd3Var;
        this.e = yuuVar;
    }
}
