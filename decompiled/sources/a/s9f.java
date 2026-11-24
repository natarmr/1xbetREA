package a;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.gov.nist.core.Separators;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class s9f {
    public static final HashMap f;
    public static final String g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f31849a;
    public final hxw b;
    public final rrd c;
    public final dq00 d;
    public final sd60 e;

    static {
        HashMap map = new HashMap();
        f = map;
        kng0.x(5, map, "armeabi", 6, "armeabi-v7a");
        kng0.x(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.1.1";
    }

    public s9f(Context context, hxw hxwVar, rrd rrdVar, dq00 dq00Var, sd60 sd60Var) {
        this.f31849a = context;
        this.b = hxwVar;
        this.c = rrdVar;
        this.d = dq00Var;
        this.e = sd60Var;
    }

    public static s25 c(n660 n660Var, int i) {
        String str = (String) n660Var.b;
        String str2 = (String) n660Var.f22981a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) n660Var.c;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        n660 n660Var2 = (n660) n660Var.d;
        if (i >= 8) {
            n660 n660Var3 = n660Var2;
            while (n660Var3 != null) {
                n660Var3 = (n660) n660Var3.d;
                i2++;
            }
        }
        int i3 = i2;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            hny.u("Null frames");
            return null;
        }
        byte b = (byte) (0 | 1);
        s25 s25VarC = (n660Var2 == null || i3 != 0) ? null : c(n660Var2, i + 1);
        if (b == 1) {
            return new s25(str, str2, listD, s25VarC, i3);
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" overflowCount");
        }
        jf4.n(vqd.o("Missing required properties:", sb));
        return null;
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            v25 v25Var = new v25();
            v25Var.e = i;
            v25Var.f = (byte) (v25Var.f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + Separators.DOT + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            v25Var.f36667a = jMax;
            byte b = (byte) (v25Var.f | 1);
            v25Var.b = str;
            v25Var.c = fileName;
            v25Var.d = lineNumber;
            v25Var.f = (byte) (b | 2);
            arrayList.add(v25Var.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static t25 e() {
        return new t25("0", "0", 0L);
    }

    public final List a() {
        byte b = (byte) (((byte) (0 | 1)) | 2);
        rrd rrdVar = this.c;
        String str = (String) rrdVar.f;
        if (str == null) {
            hny.u("Null name");
            return null;
        }
        String str2 = (String) rrdVar.c;
        if (b == 3) {
            return Collections.singletonList(new r25(0L, 0L, str, str2));
        }
        StringBuilder sb = new StringBuilder();
        if ((b & 1) == 0) {
            sb.append(" baseAddress");
        }
        if ((b & 2) == 0) {
            sb.append(" size");
        }
        jf4.n(vqd.o("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a7  */
    public final z25 b(int i) {
        boolean z;
        Float fValueOf;
        int i2;
        long j;
        Context context = this.f31849a;
        boolean z2 = false;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra(CommonConstant.KEY_STATUS, -1);
                z = intExtra != -1 && (intExtra == 2 || intExtra == 5);
                try {
                    int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                    if (intExtra2 != -1 && intExtra3 != -1) {
                        fValueOf = Float.valueOf(intExtra2 / intExtra3);
                    }
                } catch (IllegalStateException e) {
                    e = e;
                    Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", e);
                }
                Double dValueOf = fValueOf != null ? Double.valueOf(fValueOf.doubleValue()) : null;
                if (z || fValueOf == null) {
                    i2 = 1;
                } else {
                    i2 = ((double) fValueOf.floatValue()) < 0.99d ? 2 : 3;
                }
                if (!aad.R() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
                    z2 = true;
                }
                long jH = aad.H(context);
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                j = jH - memoryInfo.availMem;
                if (j <= 0) {
                    j = 0;
                }
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                long blockSize = statFs.getBlockSize();
                long blockCount = (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
                y25 y25Var = new y25();
                y25Var.f41889a = dValueOf;
                y25Var.b = i2;
                byte b = (byte) (y25Var.g | 1);
                y25Var.c = z2;
                y25Var.d = i;
                y25Var.e = j;
                y25Var.f = blockCount;
                y25Var.g = (byte) (((byte) (((byte) (((byte) (b | 2)) | 4)) | 8)) | 16);
                return y25Var.a();
            }
            z = false;
        } catch (IllegalStateException e2) {
            e = e2;
            z = false;
        }
        fValueOf = null;
        if (fValueOf != null) {
        }
        if (z) {
            i2 = 1;
        } else {
            i2 = 1;
        }
        if (!aad.R()) {
            z2 = true;
        }
        long jH2 = aad.H(context);
        ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo2);
        j = jH2 - memoryInfo2.availMem;
        if (j <= 0) {
            j = 0;
        }
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        long blockSize2 = statFs2.getBlockSize();
        long blockCount2 = (((long) statFs2.getBlockCount()) * blockSize2) - (blockSize2 * ((long) statFs2.getAvailableBlocks()));
        y25 y25Var2 = new y25();
        y25Var2.f41889a = dValueOf;
        y25Var2.b = i2;
        byte b2 = (byte) (y25Var2.g | 1);
        y25Var2.c = z2;
        y25Var2.d = i;
        y25Var2.e = j;
        y25Var2.f = blockCount2;
        y25Var2.g = (byte) (((byte) (((byte) (((byte) (b2 | 2)) | 4)) | 8)) | 16);
        return y25Var2.a();
    }
}
