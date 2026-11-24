package a;

import android.gov.nist.core.Separators;
import android.javax.sip.SipException;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.datatransport.TransportRegistrar;
import java.io.File;
import java.net.ConnectException;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v4i0 implements w4i0, Continuation, ybo0, xbf, n8q0, fps0, jgd, iuo {
    public static final v4i0 b = new v4i0(16);
    public static final v4i0 c = new v4i0(17);
    public static final v4i0 d = new v4i0(18);
    public static final v4i0 e = new v4i0(19);
    public static final v4i0 f = new v4i0(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36781a;

    public /* synthetic */ v4i0(byte b2) {
        this.f36781a = b2;
    }

    public static /* synthetic */ void e() {
        throw new IllegalStateException();
    }

    public static /* synthetic */ void h(float f2, String str) {
        throw new IllegalArgumentException(str + f2);
    }

    public static /* synthetic */ void i(int i, Object obj) throws ConnectException {
        throw new ConnectException("Socket timeout error (8sec)" + obj + ((Object) Separators.COLON) + i);
    }

    public static /* synthetic */ void j(Object obj, String str) {
        throw new UnsupportedOperationException(str + obj);
    }

    public static /* synthetic */ void k(String str) throws SipException {
        throw new SipException(str);
    }

    public static /* synthetic */ void l(String str) {
        throw new s89(str);
    }

    public static /* synthetic */ void m(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void n(String str) {
        throw new fhi0(str);
    }

    public static /* synthetic */ void o(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void p(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:63:0x0102  */
    /* JADX WARN: Code duplicated, block: B:65:0x0108  */
    /* JADX WARN: Code duplicated, block: B:66:0x0111  */
    @Override // a.w4i0
    public u4i0 a(cgx0 cgx0Var) {
        t4i0 t4i0VarZ;
        t4i0 t4i0Var;
        t4i0 t4i0Var2;
        u4i0 u4i0Var;
        boolean z;
        String str;
        int i;
        int length;
        boolean z2;
        int i2;
        switch (this.f36781a) {
            case 0:
                return qxw.r(cgx0Var, rv00.A);
            default:
                u4i0 u4i0Var2 = (u4i0) cgx0Var.c;
                hu5 hu5Var = (hu5) cgx0Var.d;
                if (u4i0Var2 == null) {
                    return qxw.r(cgx0Var, gqw0.B1);
                }
                t4i0 t4i0Var3 = u4i0Var2.b;
                t4i0 t4i0Var4 = u4i0Var2.f35050a;
                if (cgx0Var.b) {
                    t4i0VarZ = qxw.Z(cgx0Var, hu5Var, t4i0Var4);
                    t4i0Var2 = t4i0Var3;
                    t4i0Var3 = t4i0Var4;
                    t4i0Var = t4i0VarZ;
                } else {
                    t4i0VarZ = qxw.Z(cgx0Var, hu5Var, t4i0Var3);
                    t4i0Var = t4i0Var4;
                    t4i0Var2 = t4i0VarZ;
                }
                if (Intrinsics.d(t4i0VarZ, t4i0Var3)) {
                    return u4i0Var2;
                }
                u4i0 u4i0Var3 = new u4i0(t4i0Var, t4i0Var2, cgx0Var.q() == fef.f9404a || (cgx0Var.q() == fef.c && t4i0Var.b > t4i0Var2.b));
                hu5 hu5Var2 = (hu5) cgx0Var.d;
                t4i0 t4i0Var5 = u4i0Var3.f35050a;
                long j = t4i0Var5.c;
                t4i0 t4i0Var6 = u4i0Var3.b;
                if (j != t4i0Var6.c) {
                    boolean z3 = u4i0Var3.c;
                    if ((z3 ? t4i0Var5 : t4i0Var6).b == 0) {
                        if (((a9q0) hu5Var2.e).f491a.f43981a.b.length() == (z3 ? t4i0Var6 : t4i0Var5).b) {
                            u4i0Var = (u4i0) cgx0Var.c;
                            String str2 = ((a9q0) hu5Var2.e).f491a.f43981a.b;
                            if (u4i0Var != null) {
                                z = cgx0Var.b;
                                str = ((a9q0) hu5Var2.e).f491a.f43981a.b;
                                i = hu5Var2.b;
                                length = str.length();
                                if (i == 0) {
                                    int i3 = osm0.i(0, str);
                                    if (z) {
                                    }
                                }
                                if (i == length) {
                                    int iJ = osm0.j(length, str);
                                    if (z) {
                                    }
                                }
                                if (u4i0Var.c) {
                                }
                                if (z ^ z2) {
                                    i2 = osm0.j(i, str);
                                } else {
                                    i2 = osm0.i(i, str);
                                }
                                if (z) {
                                }
                            }
                        }
                    }
                } else if (t4i0Var5.b == t4i0Var6.b) {
                    u4i0Var = (u4i0) cgx0Var.c;
                    String str3 = ((a9q0) hu5Var2.e).f491a.f43981a.b;
                    if (u4i0Var != null && str3.length() != 0) {
                        z = cgx0Var.b;
                        str = ((a9q0) hu5Var2.e).f491a.f43981a.b;
                        i = hu5Var2.b;
                        length = str.length();
                        if (i == 0) {
                            int i4 = osm0.i(0, str);
                            return z ? u4i0.a(u4i0Var3, qxw.v(t4i0Var5, hu5Var2, i4), null, true, 2) : u4i0.a(u4i0Var3, null, qxw.v(t4i0Var6, hu5Var2, i4), false, 1);
                        }
                        if (i == length) {
                            int iJ2 = osm0.j(length, str);
                            return z ? u4i0.a(u4i0Var3, qxw.v(t4i0Var5, hu5Var2, iJ2), null, false, 2) : u4i0.a(u4i0Var3, null, qxw.v(t4i0Var6, hu5Var2, iJ2), true, 1);
                        }
                        z2 = u4i0Var.c;
                        if (z ^ z2) {
                            i2 = osm0.j(i, str);
                        } else {
                            i2 = osm0.i(i, str);
                        }
                        return z ? u4i0.a(u4i0Var3, qxw.v(t4i0Var5, hu5Var2, i2), null, z2, 2) : u4i0.a(u4i0Var3, null, qxw.v(t4i0Var6, hu5Var2, i2), z2, 1);
                    }
                }
                return u4i0Var3;
        }
    }

    @Override // a.fps0
    public void b(Exception exc) {
    }

    @Override // a.xbf
    public Object c(Object obj) {
        ((m1r) obj).getClass();
        ypn0.h2.getClass();
        return new ypn0();
    }

    @Override // a.iuo
    public fuo[] f() {
        coq0 coq0Var = new coq0(0L);
        v3x v3xVar = b4x.b;
        return new fuo[]{new xrs0(1, 1, jfn0.f16437a, coq0Var, new tyj(0, rcf0.e))};
    }

    @Override // a.ybo0
    public void g(tbo0 tbo0Var, int i) {
        switch (this.f36781a) {
            case 8:
                g9m0 g9m0Var = npn0.j2;
                tbo0Var.e.setClickable(false);
                break;
            default:
                y2m0 y2m0Var = noq0.m2;
                tbo0Var.e.setClickable(false);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z;
        if (task.isSuccessful()) {
            x15 x15Var = (x15) task.getResult();
            rv00 rv00Var = rv00.s;
            rv00Var.t("Crashlytics report successfully enqueued to DataTransport: " + x15Var.b);
            File file = x15Var.c;
            if (file.delete()) {
                rv00Var.t("Deleted report file: " + file.getPath());
            } else {
                rv00Var.E("Crashlytics could not delete report file: " + file.getPath(), null);
            }
            z = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // a.jgd
    public Object x0(pzu pzuVar) {
        switch (this.f36781a) {
            case 22:
                return TransportRegistrar.lambda$getComponents$0(pzuVar);
            case 23:
                return TransportRegistrar.lambda$getComponents$1(pzuVar);
            default:
                return TransportRegistrar.lambda$getComponents$2(pzuVar);
        }
    }

    public /* synthetic */ v4i0(Object obj, byte b2) {
        this.f36781a = b2;
    }
}
