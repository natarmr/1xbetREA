package a;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class dw9 {
    public static void A(String str, String str2, String str3) {
        f1t0.g0(str3, str + str2);
    }

    public static void B(HashMap map, String str, Integer num, int i, String str2) {
        map.put(str, num);
        map.put(str2, Integer.valueOf(i));
    }

    public static /* synthetic */ String C(int i) {
        if (i == 1) {
            return "PENDING_OPEN";
        }
        if (i == 2) {
            return "OPENING";
        }
        if (i == 3) {
            return "OPEN";
        }
        if (i != 4) {
            return i != 5 ? "null" : "CLOSED";
        }
        return "CLOSING";
    }

    public static int a(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static int b(d4d d4dVar, int i, int i2) {
        return (d4dVar.hashCode() + i) * i2;
    }

    public static int c(kpm kpmVar, int i, int i2) {
        return (kpmVar.hashCode() + i) * i2;
    }

    public static int d(Integer num, y5d y5dVar, mm40 mm40Var) {
        int iIntValue = num.intValue();
        y5dVar.getClass();
        mm40Var.getClass();
        return iIntValue;
    }

    public static y3d e(long j, fet fetVar) {
        y3d y3dVar = new y3d(j);
        fetVar.o0(y3dVar);
        return y3dVar;
    }

    public static y3d f(fet fetVar, boolean z, long j) {
        fetVar.r(z);
        return new y3d(j);
    }

    public static ycl g(fet fetVar, boolean z, float f) {
        fetVar.r(z);
        return new ycl(f);
    }

    public static mm40 h(float f, mm40 mm40Var, boolean z) {
        return mm40Var.e(new x7z(f, z));
    }

    public static mm40 i(zcl zclVar, zcl zclVar2, zcl zclVar3, zcl zclVar4, jm40 jm40Var) {
        return lgb.J(jm40Var, new ugg0(zclVar, zclVar2, zclVar3, zclVar4));
    }

    public static gy40 j(fet fetVar) {
        gy40 gy40Var = new gy40();
        fetVar.o0(gy40Var);
        return gy40Var;
    }

    public static l5d0 k(int i, zfn zfnVar) {
        return zfnVar.a(new f2q0(i));
    }

    public static Object l(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String m(int i, String str, String str2) {
        return i + str + str2;
    }

    public static String n(int i, String str, String str2, String str3, String str4) {
        return str + str2 + str3 + i + str4;
    }

    public static String o(long j, String str) {
        return j + str;
    }

    public static String p(String str, zmk0 zmk0Var, String str2) {
        return str + zmk0Var + str2;
    }

    public static String q(StringBuilder sb, Integer num, String str) {
        sb.append(num);
        sb.append(str);
        return sb.toString();
    }

    public static String r(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder s(float f, float f2, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder t(String str, int i, String str2, String str3, int i2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder u(String str, jys0 jys0Var, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(jys0Var);
        sb.append(str2);
        return sb;
    }

    public static void v(int i, String str, String str2, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(z);
    }

    public static void w(long j, String str, StringBuilder sb) {
        sb.append((Object) y3d.i(j));
        sb.append(str);
    }

    public static void x(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i, boolean z) {
        zq8.a(i, fetVar, xbc.c0(mm40Var, fqj0Var));
        fetVar.r(z);
    }

    public static /* synthetic */ void y(Object obj) throws Exception {
        boolean zIsTerminated;
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (!(obj instanceof ExecutorService)) {
            if (obj instanceof TypedArray) {
                ((TypedArray) obj).recycle();
                return;
            }
            if (obj instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) obj).release();
                return;
            } else if (obj instanceof MediaDrm) {
                ((MediaDrm) obj).release();
                return;
            } else {
                e9d0.o();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) obj;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void z(String str, odd oddVar) {
        oddVar.b0(new c44(str, (byte) 1));
    }
}
