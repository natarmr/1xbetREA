package a;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class lfx0 implements gfx0, rgx0 {
    public static final String i = new String();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Level f19980a;
    public final long b;
    public yfx0 c;
    public jgx0 d;
    public ehx0 e;
    public ubw0 f;
    public Object[] g;
    public final /* synthetic */ do20 h;

    public lfx0(do20 do20Var, Level level) {
        this.h = do20Var;
        rbw0.f30210a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        fem0.p(level, "level");
        this.f19980a = level;
        this.b = nanos;
    }

    @Override // a.rgx0
    public final rgx0 a(Throwable th) {
        vgx0 vgx0Var = xfx0.f40814a;
        fem0.p(vgx0Var, "metadata key");
        if (th != null) {
            d(vgx0Var, th);
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [a.ehx0] */
    /* JADX WARN: Type inference failed for: r10v22, types: [a.ihx0] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r18v0, types: [a.lfx0] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [a.ehx0] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [a.ehx0] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // a.rgx0
    public final void b(String str, Object[] objArr) {
        boolean z;
        yfx0 yfx0Var;
        StackTraceElement[] stackTraceElementArr;
        int iE;
        int i2;
        ?? zgx0Var;
        ?? r10;
        wgx0 wgx0Var;
        int i3;
        lgx0 khx0Var = this.d;
        fgx0 fgx0Var = jgx0.f16501a;
        if (khx0Var == null) {
            ((wbw0) rbw0.f30210a).getClass();
            wbw0.b.getClass();
            this.d = fgx0Var;
            khx0Var = fgx0Var;
        }
        if (khx0Var != fgx0Var) {
            yfx0 yfx0Var2 = this.c;
            if (yfx0Var2 != null && (i3 = yfx0Var2.b) > 0) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (xfx0.f.equals(yfx0Var2.A(i4))) {
                        khx0Var = new khx0(khx0Var, yfx0Var2.B(i4));
                    }
                }
            }
        } else {
            khx0Var = null;
        }
        wgm0 wgm0VarC = c();
        int iY = wgm0VarC.y();
        for (int i5 = 0; i5 < iY; i5++) {
            if (wgm0VarC.A(i5).f37405a == "eye3tag") {
                if (wgm0VarC.C(xfx0.f40814a) != null) {
                    break;
                }
                vgx0 vgx0Var = xfx0.i;
                if (wgm0VarC.C(vgx0Var) != null) {
                    break;
                }
                d(vgx0Var, lhx0.SMALL);
                break;
            }
        }
        yfx0 yfx0Var3 = this.c;
        int i6 = -1;
        wgx0 wgx0Var2 = ehx0.f7830a;
        if (yfx0Var3 != null) {
            if (khx0Var != null) {
                int i7 = efx0.d;
                if (yfx0Var3.C(xfx0.d) != null) {
                    hny.b();
                    return;
                }
                yfx0 yfx0Var4 = this.c;
                xex0 xex0Var = afx0.d;
                Integer num = (Integer) yfx0Var4.C(xfx0.b);
                if (num == null) {
                    zgx0Var = 0;
                } else {
                    afx0 afx0Var = (afx0) afx0.d.Y0(khx0Var, yfx0Var4);
                    AtomicLong atomicLong = afx0Var.c;
                    zgx0Var = afx0Var;
                    if (atomicLong.incrementAndGet() < num.intValue()) {
                        zgx0Var = wgx0Var2;
                    }
                }
                yfx0 yfx0Var5 = this.c;
                xex0 xex0Var2 = ihx0.d;
                Integer num2 = (Integer) yfx0Var5.C(xfx0.c);
                if (num2 == null || num2.intValue() <= 0) {
                    r10 = 0;
                } else {
                    r10 = (ihx0) ihx0.d.Y0(khx0Var, yfx0Var5);
                    int iNextInt = ((Random) ihx0.e.get()).nextInt(num2.intValue());
                    AtomicInteger atomicInteger = r10.c;
                    if ((iNextInt == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) <= 0) {
                        r10 = wgx0Var2;
                    }
                }
                if (zgx0Var == 0) {
                    zgx0Var = r10;
                } else if (r10 != 0 && zgx0Var != wgx0Var2 && r10 != (wgx0Var = ehx0.b)) {
                    if (r10 == wgx0Var2 || zgx0Var == wgx0Var) {
                        zgx0Var = r10;
                    } else {
                        zgx0Var = new zgx0(zgx0Var, r10);
                    }
                }
                this.e = zgx0Var;
                z = zgx0Var != wgx0Var2;
            }
            yfx0 yfx0Var6 = this.c;
            vgx0 vgx0Var2 = xfx0.i;
            lhx0 lhx0Var = (lhx0) yfx0Var6.C(vgx0Var2);
            if (lhx0Var != null) {
                yfx0 yfx0Var7 = this.c;
                if (yfx0Var7 != null && (iE = yfx0Var7.E(vgx0Var2)) >= 0) {
                    int i8 = iE + iE;
                    int i9 = i8 + 2;
                    while (true) {
                        i2 = yfx0Var7.b;
                        if (i9 >= i2 + i2) {
                            break;
                        }
                        Object obj = yfx0Var7.f42561a[i9];
                        if (!obj.equals(vgx0Var2)) {
                            Object[] objArr2 = yfx0Var7.f42561a;
                            objArr2[i8] = obj;
                            objArr2[i8 + 1] = objArr2[i9 + 1];
                            i8 += 2;
                        }
                        i9 += 2;
                    }
                    yfx0Var7.b = i2 - ((i9 - i8) >> 1);
                    while (i8 < i9) {
                        yfx0Var7.f42561a[i8] = null;
                        i8++;
                    }
                }
                wgm0 wgm0VarC2 = c();
                vgx0 vgx0Var3 = xfx0.f40814a;
                Throwable th = (Throwable) wgm0VarC2.C(vgx0Var3);
                int i10 = lhx0Var.f20079a;
                String[] strArr = ycw0.f42404a;
                if (i10 <= 0 && i10 != -1) {
                    jf4.o("invalid maximum depth: 0");
                    return;
                }
                ycw0.b.getClass();
                if (!(i10 == -1 || i10 > 0)) {
                    jf4.o("maxDepth must be > 0 or -1");
                    return;
                }
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                String name = lfx0.class.getName();
                int i11 = 3;
                boolean z2 = false;
                while (true) {
                    if (i11 >= stackTrace.length) {
                        i11 = -1;
                        break;
                    }
                    if (!stackTrace[i11].getClassName().equals(name)) {
                        if (z2) {
                            break;
                        }
                    } else {
                        z2 = true;
                    }
                    i11++;
                }
                if (i11 == -1) {
                    stackTraceElementArr = new StackTraceElement[0];
                } else {
                    int length = stackTrace.length - i11;
                    if (i10 <= 0 || i10 >= length) {
                        i10 = length;
                    }
                    stackTraceElementArr = new StackTraceElement[i10];
                    System.arraycopy(stackTrace, i11, stackTraceElementArr, 0, i10);
                }
                pgx0 pgx0Var = new pgx0(lhx0Var.toString(), th);
                pgx0Var.setStackTrace(stackTraceElementArr);
                d(vgx0Var3, pgx0Var);
            }
        }
        ehx0 ehx0Var = this.e;
        if (ehx0Var != null) {
            bhx0 bhx0Var = (bhx0) bhx0.c.Y0(khx0Var, this.c);
            AtomicInteger atomicInteger2 = bhx0Var.b;
            AtomicBoolean atomicBoolean = bhx0Var.f2631a;
            int iIncrementAndGet = atomicInteger2.incrementAndGet();
            if (ehx0Var != wgx0Var2 && atomicBoolean.compareAndSet(false, true)) {
                try {
                    ehx0Var.a();
                    atomicBoolean.set(false);
                    atomicInteger2.addAndGet(-iIncrementAndGet);
                    i6 = (-1) + iIncrementAndGet;
                } catch (Throwable th2) {
                    atomicBoolean.set(false);
                    throw th2;
                }
            }
            if (z && i6 > 0 && (yfx0Var = this.c) != null) {
                yfx0Var.D(xfx0.e, Integer.valueOf(i6));
            }
            z &= i6 >= 0;
        }
        if (z) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            this.g = objArrCopyOf;
            for (Object obj2 : objArrCopyOf) {
            }
            if (str != i) {
                wcw0 wcw0Var = wcw0.b;
                this.f = new ubw0(str);
            }
            ((wbw0) rbw0.f30210a).getClass();
            rcw0 rcw0VarB = ccw0.b.b();
            if (!rcw0VarB.f30261a.isEmpty()) {
                wgm0 wgm0VarC3 = c();
                tfx0 tfx0Var = xfx0.h;
                rcw0 rcw0Var = (rcw0) wgm0VarC3.C(tfx0Var);
                if (rcw0Var != null) {
                    qcw0 qcw0Var = rcw0Var.f30261a;
                    if (!qcw0Var.isEmpty()) {
                        qcw0 qcw0Var2 = rcw0VarB.f30261a;
                        if (!qcw0Var2.isEmpty()) {
                            rcw0Var = new rcw0(new qcw0(qcw0Var2, qcw0Var));
                        }
                        rcw0VarB = rcw0Var;
                    }
                }
                d(tfx0Var, rcw0VarB);
            }
            dwb dwbVar = (dwb) this.h.f6397a;
            try {
                adw0 adw0Var = (adw0) adw0.b.get();
                int i12 = adw0Var.f701a + 1;
                adw0Var.f701a = i12;
                if (i12 == 0) {
                    throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                }
                try {
                    if (i12 <= 100) {
                        dwbVar.b(this);
                    } else {
                        do20.r("unbounded recursion in log statement", this);
                    }
                    adw0Var.close();
                } catch (Throwable th3) {
                    try {
                        adw0Var.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (RuntimeException e) {
                try {
                    dwbVar.c(e, this);
                } catch (RuntimeException e2) {
                    String name2 = e2.getClass().getName();
                    String message = e2.getMessage();
                    StringBuilder sb = new StringBuilder(name2.length() + 2 + String.valueOf(message).length());
                    sb.append(name2);
                    sb.append(": ");
                    sb.append(message);
                    do20.r(sb.toString(), this);
                    try {
                        e2.printStackTrace(System.err);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    public final wgm0 c() {
        yfx0 yfx0Var = this.c;
        return yfx0Var != null ? yfx0Var : zhx0.f44415a;
    }

    public final void d(vgx0 vgx0Var, Object obj) {
        yfx0 yfx0Var = this.c;
        if (yfx0Var == null) {
            yfx0Var = new yfx0();
            yfx0Var.f42561a = new Object[8];
            yfx0Var.b = 0;
            this.c = yfx0Var;
        }
        yfx0Var.D(vgx0Var, obj);
    }

    @Override // a.rgx0
    public final rgx0 zzn() {
        ggx0 ggx0Var = new ggx0();
        ggx0Var.b = 0;
        if (this.d == null) {
            this.d = ggx0Var;
        }
        return this;
    }
}
