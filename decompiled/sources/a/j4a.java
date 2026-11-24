package a;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class j4a {
    public static final Object s = new Object();
    public static final SparseArray t = new SparseArray();
    public final l4a c;
    public final Executor d;
    public final Handler e;
    public final HandlerThread f;
    public ru g;
    public h3a h;
    public u3a i;
    public trm0 j;
    public nhf0 k;
    public final fag0 l;
    public final wu9 m;
    public final z1a n;
    public final n0o0 o;
    public int p;
    public final Integer r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2a f15874a = new j2a();
    public final Object b = new Object();
    public ig00 q = m3x.c;

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0288, code lost:
    
        r5 = r11;
        r11 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j4a(android.content.Context r11, a.pkz r12) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j4a.<init>(android.content.Context, a.pkz):void");
    }

    public static void a(Integer num) {
        synchronized (s) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = t;
                int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (iIntValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                }
                c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(f2a f2aVar) throws Throwable {
        if (afn0.w()) {
            byte b = f2aVar != null ? f2aVar.f8802a : (byte) -1;
            if (Build.VERSION.SDK_INT >= 29) {
                sf3.A(b, "CX:CameraProvider-RetryStatus");
                return;
            }
            try {
                Method method = afn0.e;
                if (method == null) {
                    method = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
                    afn0.e = method;
                }
                if (method == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                method.invoke(null, Long.valueOf(afn0.f787a), "CX:CameraProvider-RetryStatus", Integer.valueOf(b));
            } catch (Exception e) {
                if (!(e instanceof InvocationTargetException)) {
                    Log.v("Trace", "Unable to call traceCounter via reflection", e);
                    return;
                }
                Throwable cause = ((InvocationTargetException) e).getCause();
                if (cause instanceof RuntimeException) {
                    throw cause;
                }
                ohq.p(cause);
            }
        }
    }

    public static void c() {
        SparseArray sparseArray = t;
        if (sparseArray.size() == 0) {
            l8x.f19625a = (byte) 3;
            return;
        }
        if (sparseArray.get(3) != null) {
            l8x.f19625a = (byte) 3;
            return;
        }
        if (sparseArray.get(4) != null) {
            l8x.f19625a = (byte) 4;
        } else if (sparseArray.get(5) != null) {
            l8x.f19625a = (byte) 5;
        } else if (sparseArray.get(6) != null) {
            l8x.f19625a = (byte) 6;
        }
    }
}
