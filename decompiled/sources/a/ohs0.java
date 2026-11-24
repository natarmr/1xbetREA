package a;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import okhttp3.Response;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ohs0 {
    public static void A(StringBuilder sb, double d, String str, String str2) {
        sb.append(str);
        sb.append(d);
        sb.append(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void B(Response response) throws Exception {
        boolean zIsTerminated;
        if (response instanceof AutoCloseable) {
            response.close();
            return;
        }
        if (!(response instanceof ExecutorService)) {
            e9d0.o();
            return;
        }
        ExecutorService executorService = (ExecutorService) response;
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

    public static int C(int i, int i2, int i3) {
        return p4.i1(i) + i2 + i3;
    }

    public static /* synthetic */ void D(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                e9d0.o();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
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

    public static /* synthetic */ int a(Object obj) {
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (obj instanceof Double) {
            return 4;
        }
        c99.l("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return 0;
    }

    public static int b(int i, int i2, int i3) {
        return aew0.a(i) + i2 + i3;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return aew0.a(i) + i2 + i3 + i4;
    }

    public static int d(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    public static int e(mpm mpmVar, int i, int i2) {
        return (mpmVar.hashCode() + i) * i2;
    }

    public static int f(Map map, int i, int i2) {
        return (map.hashCode() + i) * i2;
    }

    public static int g(Set set, int i, int i2) {
        return (set.hashCode() + i) * i2;
    }

    public static y2 h(c0o c0oVar, c0o c0oVar2) {
        c0oVar.getClass();
        return new y2(c0oVar2, (byte) 0);
    }

    public static x7z i(fet fetVar, mm40 mm40Var, shd shdVar, float f, boolean z) {
        jpm0.o(fetVar, mm40Var, shdVar);
        return new x7z(f, z);
    }

    public static mie0 j(Object obj) {
        z1x.P(obj);
        return new mie0();
    }

    public static String k(int i, String str, String str2, StringBuilder sb, boolean z) {
        sb.append(i);
        sb.append(str);
        sb.append(z);
        sb.append(str2);
        return sb.toString();
    }

    public static String l(Class cls, StringBuilder sb) {
        sb.append(cls.getCanonicalName());
        return sb.toString();
    }

    public static String m(String str, int i, String str2, String str3, int i2) {
        return str + i + str2 + i2 + str3;
    }

    public static String n(String str, String str2) {
        return str + str2;
    }

    public static String o(String str, String str2, String str3, List list, String str4) {
        return str + str2 + str3 + list + str4;
    }

    public static String p(String str, String str2, StringBuilder sb, boolean z, boolean z2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
        return sb.toString();
    }

    public static String q(String str, String str2, Throwable th) {
        return str + th + str2;
    }

    public static String r(StringBuilder sb, Long l, String str) {
        sb.append(l);
        sb.append(str);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, List list, String str2) {
        sb.append(str);
        sb.append(list);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder t(int i, String str, String str2, String str3, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
        return sb;
    }

    public static ArrayList u(String str) {
        str.getClass();
        return new ArrayList();
    }

    public static void v(int i, String str, String str2, StringBuilder sb, List list) {
        sb.append(i);
        sb.append(str);
        sb.append(list);
        sb.append(str2);
    }

    public static void w(awq awqVar, ncs0 ncs0Var) {
        ncs0Var.c(new androidx.media3.common.b(awqVar));
    }

    public static void x(fet fetVar, boolean z, boolean z2, boolean z3) {
        fetVar.r(z);
        fetVar.r(z2);
        fetVar.r(z3);
    }

    public static /* synthetic */ void y(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                e9d0.o();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
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

    public static void z(String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }
}
