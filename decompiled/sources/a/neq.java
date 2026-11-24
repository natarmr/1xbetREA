package a;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.hardware.input.InputManager;
import android.media.MediaCodecList;
import android.media.RingtoneManager;
import android.os.StatFs;
import java.io.File;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class neq extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23399a;
    public final /* synthetic */ us00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ neq(us00 us00Var, byte b) {
        super(0);
        this.f23399a = b;
        this.b = us00Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23399a;
        StatFs statFs = null;
        us00 us00Var = this.b;
        switch (b) {
            case 0:
                ContentResolver contentResolver = us00Var.getContentResolver();
                contentResolver.getClass();
                return contentResolver;
            case 1:
                return new RingtoneManager(us00Var);
            case 2:
                AssetManager assets = us00Var.getAssets();
                assets.getClass();
                return assets;
            case 3:
                Resources resources = us00Var.getResources();
                resources.getClass();
                Configuration configuration = resources.getConfiguration();
                configuration.getClass();
                return configuration;
            case 4:
                Object systemService = us00Var.getSystemService("device_policy");
                systemService.getClass();
                return (DevicePolicyManager) systemService;
            case 5:
                Object systemService2 = us00Var.getSystemService("keyguard");
                systemService2.getClass();
                return (KeyguardManager) systemService2;
            case 6:
                int i = oeq.f25137a;
                kud kudVar = new kud();
                Object objE = c3x.E(1000L, new neq(us00Var, (byte) 10));
                e0g0 e0g0Var = j0g0.b;
                if (objE instanceof g0g0) {
                    objE = null;
                }
                ActivityManager activityManager = (ActivityManager) objE;
                Object objE2 = c3x.E(1000L, w7f.j);
                if (objE2 instanceof g0g0) {
                    objE2 = null;
                }
                StatFs statFs2 = (StatFs) objE2;
                Object objE3 = c3x.E(1000L, new neq(us00Var, (byte) 11));
                if (objE3 instanceof g0g0) {
                    objE3 = null;
                }
                zpu zpuVar = new zpu(activityManager, statFs2, (byte) 24);
                Object objE4 = c3x.E(1000L, new neq(us00Var, (byte) 13));
                if (objE4 instanceof g0g0) {
                    objE4 = null;
                }
                eyg0 eyg0Var = new eyg0(objE4, (byte) 6);
                Object objE5 = c3x.E(1000L, new neq(us00Var, (byte) 9));
                if (objE5 instanceof g0g0) {
                    objE5 = null;
                }
                svu svuVar = new svu((InputManager) objE5);
                bb6 bb6Var = new bb6(us00Var);
                bj5 bj5Var = new bj5();
                Object objE6 = c3x.E(1000L, new neq(us00Var, (byte) 7));
                if (objE6 instanceof g0g0) {
                    objE6 = null;
                }
                hnu hnuVar = new hnu((ActivityManager) objE6);
                rl70 rl70Var = new rl70();
                Object objE7 = c3x.E(1000L, w7f.i);
                if (objE7 instanceof g0g0) {
                    objE7 = null;
                }
                rrc rrcVar = new rrc((MediaCodecList) objE7, (byte) 3);
                Object objE8 = c3x.E(1000L, new neq(us00Var, (byte) 4));
                if (objE8 instanceof g0g0) {
                    objE8 = null;
                }
                DevicePolicyManager devicePolicyManager = (DevicePolicyManager) objE8;
                Object objE9 = c3x.E(1000L, new neq(us00Var, (byte) 5));
                if (objE9 instanceof g0g0) {
                    objE9 = null;
                }
                jtj jtjVar = new jtj((Object) devicePolicyManager, objE9, (byte) 3);
                Object objE10 = c3x.E(1000L, new neq(us00Var, (byte) 12));
                if (objE10 instanceof g0g0) {
                    objE10 = null;
                }
                iw20 iw20Var = new iw20((PackageManager) objE10);
                Object objE11 = c3x.E(1000L, new neq(us00Var, (byte) 14));
                if (objE11 instanceof g0g0) {
                    objE11 = null;
                }
                eyg0 eyg0Var2 = new eyg0(objE11, (byte) 20);
                Object objE12 = c3x.E(1000L, new neq(us00Var, (byte) 1));
                if (objE12 instanceof g0g0) {
                    objE12 = null;
                }
                RingtoneManager ringtoneManager = (RingtoneManager) objE12;
                Object objE13 = c3x.E(1000L, new neq(us00Var, (byte) 2));
                if (objE13 instanceof g0g0) {
                    objE13 = null;
                }
                AssetManager assetManager = (AssetManager) objE13;
                Object objE14 = c3x.E(1000L, new neq(us00Var, (byte) 3));
                if (objE14 instanceof g0g0) {
                    objE14 = null;
                }
                nr nrVar = new nr((Object) ringtoneManager, (Object) assetManager, objE14, (byte) 16);
                Object objE15 = c3x.E(1000L, new vut0((Object) us00Var, (byte) 11));
                if (objE15 instanceof g0g0) {
                    objE15 = null;
                }
                zeq zeqVar = new zeq(kudVar, zpuVar, eyg0Var, svuVar, bb6Var, bj5Var, hnuVar, rl70Var, rrcVar, jtjVar, iw20Var, eyg0Var2, nrVar, new a7q((heq) objE15));
                Object objE16 = c3x.E(1000L, new neq(us00Var, (byte) 8));
                if (objE16 instanceof g0g0) {
                    objE16 = null;
                }
                xsu xsuVar = new xsu((ContentResolver) objE16);
                Object objE17 = c3x.E(1000L, new neq(us00Var, (byte) 0));
                return new peq(zeqVar, new uii(xsuVar, new h03(objE17 instanceof g0g0 ? null : objE17, (byte) 10), new uuz()));
            case 7:
                Object systemService3 = us00Var.getSystemService("activity");
                systemService3.getClass();
                return (ActivityManager) systemService3;
            case 8:
                ContentResolver contentResolver2 = us00Var.getContentResolver();
                contentResolver2.getClass();
                return contentResolver2;
            case 9:
                Object systemService4 = us00Var.getSystemService("input");
                systemService4.getClass();
                return (InputManager) systemService4;
            case 10:
                Object systemService5 = us00Var.getSystemService("activity");
                systemService5.getClass();
                return (ActivityManager) systemService5;
            case 11:
                File externalFilesDir = us00Var.getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    if (!externalFilesDir.canRead()) {
                        externalFilesDir = null;
                    }
                    if (externalFilesDir != null) {
                        String absolutePath = externalFilesDir.getAbsolutePath();
                        absolutePath.getClass();
                        statFs = new StatFs(absolutePath);
                    }
                }
                statFs.getClass();
                return statFs;
            case 12:
                PackageManager packageManager = us00Var.getPackageManager();
                packageManager.getClass();
                return packageManager;
            case 13:
                Object systemService6 = us00Var.getSystemService("sensor");
                systemService6.getClass();
                return (SensorManager) systemService6;
            default:
                ContentResolver contentResolver3 = us00Var.getContentResolver();
                contentResolver3.getClass();
                return contentResolver3;
        }
    }
}
