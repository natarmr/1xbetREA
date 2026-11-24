package a;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class gto0 {
    public static final int[] c = CollectionsKt.K0(CollectionsKt.L0(new IntRange(0, 18, 1)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cad f11890a;
    public final iqt b;

    public gto0(cad cadVar, iqt iqtVar) {
        this.f11890a = cadVar;
        this.b = iqtVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x009b  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:62:0x00db  */
    /* JADX WARN: Code duplicated, block: B:63:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, z1s0 z1s0Var, zje zjeVar) throws Exception {
        fto0 fto0Var;
        fww f0g0Var;
        Exception exc;
        zhi0 zhi0Var;
        String message;
        y0s0 y0s0Var;
        if (zjeVar instanceof fto0) {
            fto0Var = (fto0) zjeVar;
            int i = fto0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fto0Var.k = i - Integer.MIN_VALUE;
            } else {
                fto0Var = new fto0(this, zjeVar);
            }
        } else {
            fto0Var = new fto0(this, zjeVar);
        }
        Object obj = fto0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = fto0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                if (!this.b.f15225a.a()) {
                    y0s0Var = x0s0.f40086a;
                } else if (z1s0Var != z1s0.f43637a) {
                    y0s0Var = t0s0.f33136a;
                } else {
                    cad cadVar = this.f11890a;
                    fto0Var.k = 1;
                    trm0 trm0Var = (trm0) cadVar.b;
                    Object objA = ((a9s0) ((lkr0) ((dpi0) trm0Var.b).f6468a).invoke()).a(((btt0) trm0Var.c).a(), new cw80(j), fto0Var);
                    if (objA != wneVar) {
                        objA = Unit.f46060a;
                    }
                    if (objA != wneVar) {
                        objA = Unit.f46060a;
                    }
                    if (objA != wneVar) {
                        objA = Unit.f46060a;
                    }
                    if (objA == wneVar) {
                        return wneVar;
                    }
                }
                f0g0Var = new h0g0(y0s0Var);
                if (f0g0Var instanceof f0g0) {
                    exc = ((f0g0) f0g0Var).f8716a;
                } else {
                    exc = null;
                }
                if (exc == null) {
                    if (f0g0Var instanceof h0g0) {
                        return ((h0g0) f0g0Var).f12234a;
                    }
                    jf4.n("Result is not success");
                    return null;
                }
                if (exc instanceof zhi0) {
                    zhi0Var = (zhi0) exc;
                    if (tx3.w(c, zhi0Var.c.getErrorCode())) {
                        int errorCode = zhi0Var.c.getErrorCode();
                        message = exc.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        return new s0s0(message, errorCode);
                    }
                }
                return exc instanceof u660 ? v0s0.f36597a : w0s0.f38367a;
            }
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            y0s0Var = r0s0.f29647a;
            f0g0Var = new h0g0(y0s0Var);
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
            f0g0Var = new f0g0(e);
        }
        if (f0g0Var instanceof f0g0) {
            exc = ((f0g0) f0g0Var).f8716a;
        } else {
            exc = null;
        }
        if (exc == null) {
            if (f0g0Var instanceof h0g0) {
                return ((h0g0) f0g0Var).f12234a;
            }
            jf4.n("Result is not success");
            return null;
        }
        if (exc instanceof zhi0) {
            zhi0Var = (zhi0) exc;
            if (tx3.w(c, zhi0Var.c.getErrorCode())) {
                int errorCode2 = zhi0Var.c.getErrorCode();
                message = exc.getMessage();
                if (message == null) {
                    message = "";
                }
                return new s0s0(message, errorCode2);
            }
        }
        if (exc instanceof u660) {
        }
    }
}
