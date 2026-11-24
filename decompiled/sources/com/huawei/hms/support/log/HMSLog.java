package com.huawei.hms.support.log;

import a.jf4;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.util.AndroidException;
import com.huawei.hms.base.log.a;
import com.huawei.hms.base.log.b;

/* JADX INFO: loaded from: classes2.dex */
public class HMSLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f46010a = new b();

    private static String a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 16384);
                return "HMS-" + packageInfo.versionName + Separators.LPAREN + packageInfo.versionCode + Separators.RPAREN;
            } catch (AndroidException | RuntimeException unused) {
            }
        }
        return "HMS-[unknown-version]";
    }

    public static void d(String str, String str2) {
        f46010a.a(3, str, str2);
    }

    public static void e(String str, long j, String str2) {
        f46010a.a(6, str, "[" + j + "] " + str2);
    }

    public static void i(String str, String str2) {
        f46010a.a(4, str, str2);
    }

    public static void init(Context context, int i, String str) {
        b bVar = f46010a;
        bVar.a(context, i, str);
        bVar.a(str, "============================================================================\n====== " + a(context) + "\n============================================================================");
    }

    public static boolean isErrorEnable() {
        return f46010a.a(6);
    }

    public static boolean isInfoEnable() {
        return f46010a.a(4);
    }

    public static boolean isWarnEnable() {
        return f46010a.a(5);
    }

    public static void setExtLogger(HMSExtLogger hMSExtLogger, boolean z) {
        if (hMSExtLogger == null) {
            jf4.o("extLogger is not able to be null");
            return;
        }
        a aVar = new a(hMSExtLogger);
        if (z) {
            f46010a.a(aVar);
        } else {
            f46010a.a().a(aVar);
        }
    }

    public static void w(String str, String str2) {
        f46010a.a(5, str, str2);
    }

    public static void e(String str, String str2, Throwable th) {
        f46010a.b(6, str, str2, th);
    }

    public static void e(String str, String str2) {
        f46010a.a(6, str, str2);
    }

    public static void e(String str, long j, String str2, Throwable th) {
        f46010a.b(6, str, "[" + j + "] " + str2, th);
    }
}
