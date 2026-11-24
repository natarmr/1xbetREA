package a;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ufk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dw5 f35582a = new c4k0();

    /* JADX WARN: Code duplicated, block: B:33:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092 A[LOOP:0: B:22:0x004d->B:34:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0095 A[EDGE_INSN: B:53:0x0095->B:35:0x0095 BREAK  A[LOOP:0: B:22:0x004d->B:34:0x0092], SYNTHETIC] */
    public final Object a(htb htbVar, Function0 function0) {
        c4k0 c4k0Var;
        jbi0 jbi0Var;
        if (this.f35582a == null) {
            dsb0.b("Called runAndWatch on a manager that has been disposed of");
        }
        dw5 dw5Var = this.f35582a;
        if ((dw5Var instanceof c4k0) && (jbi0Var = (c4k0Var = (c4k0) dw5Var).g) != null && !jbi0Var.equals(htbVar)) {
            vw40 vw40Var = new vw40();
            jbi0 jbi0Var2 = c4k0Var.g;
            if (jbi0Var2 == null) {
                dsb0.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            iz40 iz40Var = c4k0Var.e;
            ArrayList arrayList = vw40Var.d;
            if (iz40Var != null) {
                Object[] objArr = iz40Var.b;
                long[] jArr = iz40Var.f15620a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8;
                            int i3 = 8 - ((~(i - length)) >>> 31);
                            int i4 = 0;
                            while (i4 < i3) {
                                if ((j & 255) < 128) {
                                    arrayList.add(new sw40(jbi0Var2, objArr[(i << 3) + i4]));
                                }
                                j >>= i2;
                                i4++;
                                i2 = i2;
                            }
                            if (i3 != i2) {
                                break;
                            }
                            if (i != length) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            } else {
                Object obj = c4k0Var.c;
                obj.getClass();
                arrayList.add(new sw40(jbi0Var2, obj));
            }
            vw40Var.d();
            c4k0Var.e();
            this.f35582a = vw40Var;
        }
        dw5 dw5Var2 = this.f35582a;
        dw5Var2.getClass();
        rfk0 rfk0VarU = xfk0.h().u(dw5Var2.f(htbVar));
        dw5Var2.c(htbVar);
        try {
            rfk0 rfk0VarJ = rfk0VarU.j();
            try {
                Object objInvoke = function0.invoke();
                rfk0.q(rfk0VarJ);
                rfk0VarU.c();
                dw5Var2.d();
                return objInvoke;
            } catch (Throwable th) {
                rfk0.q(rfk0VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            rfk0VarU.c();
            throw th2;
        }
    }
}
