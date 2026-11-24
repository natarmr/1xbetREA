package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.gov.nist.core.Separators;
import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fd40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9341a;
    public String b;
    public String c;
    public byte d;
    public Object e;

    public static String b(nfq nfqVar) {
        nfqVar.a();
        mgq mgqVar = nfqVar.c;
        String str = mgqVar.e;
        if (str != null) {
            return str;
        }
        nfqVar.a();
        String str2 = mgqVar.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(Separators.COLON);
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized String a() {
        try {
            if (this.b == null) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    public synchronized int c() {
        PackageInfo packageInfoD;
        try {
            if (this.f9341a == 0 && (packageInfoD = d("com.google.android.gms")) != null) {
                this.f9341a = packageInfoD.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9341a;
    }

    public PackageInfo d(String str) {
        try {
            return ((Context) this.e).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:34:0x007b), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006a A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:34:0x007b), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:34:0x007b), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:34:0x007b), top: B:42:0x0001 }] */
    public boolean e() {
        byte b;
        List<ResolveInfo> listQueryBroadcastReceivers;
        synchronized (this) {
            b = this.d;
            if (b == 0) {
                PackageManager packageManager = ((Context) this.e).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    b = 0;
                } else if (ufx.F()) {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers != null) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (ufx.F()) {
                            this.d = (byte) 2;
                            b = 2;
                        } else {
                            this.d = (byte) 1;
                            b = 1;
                        }
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (ufx.F()) {
                            this.d = (byte) 2;
                            b = 2;
                        } else {
                            this.d = (byte) 1;
                            b = 1;
                        }
                    }
                } else {
                    Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                        Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
                        intent3.setPackage("com.google.android.gms");
                        listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
                        if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.size() <= 0) {
                            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                            if (ufx.F()) {
                                this.d = (byte) 2;
                                b = 2;
                            } else {
                                this.d = (byte) 1;
                                b = 1;
                            }
                        } else {
                            this.d = (byte) 2;
                            b = 2;
                        }
                    } else {
                        this.d = (byte) 1;
                        b = 1;
                    }
                }
            }
        }
        return b != 0;
    }

    public synchronized void f() {
        PackageInfo packageInfoD = d(((Context) this.e).getPackageName());
        if (packageInfoD != null) {
            this.b = Integer.toString(packageInfoD.versionCode);
            this.c = packageInfoD.versionName;
        }
    }
}
