package a;

import android.util.Log;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class uot0 extends bnn0 implements Function1 {
    public Object i;
    public List j;
    public List k;
    public vt00 l;
    public z40 m;
    public long n;
    public byte o;
    public final /* synthetic */ xot0 p;
    public final /* synthetic */ List q;
    public final /* synthetic */ List r;
    public final /* synthetic */ List s;
    public final /* synthetic */ vt00 t;
    public final /* synthetic */ z40 u;
    public final /* synthetic */ long v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uot0(xot0 xot0Var, List list, List list2, List list3, vt00 vt00Var, z40 z40Var, long j, yje yjeVar) {
        super(1, yjeVar);
        this.p = xot0Var;
        this.q = list;
        this.r = list2;
        this.s = list3;
        this.t = vt00Var;
        this.u = z40Var;
        this.v = j;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new uot0(this.p, this.q, this.r, this.s, this.t, this.u, this.v, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((uot0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v14 */
    /* JADX WARN: Type inference failed for: r16v15 */
    /* JADX WARN: Type inference failed for: r16v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ?? r16;
        vt00 vt00Var;
        Object objC;
        List list;
        z40 z40Var;
        List list2;
        long j;
        AutoCloseable autoCloseable;
        ?? r17;
        AutoCloseable autoCloseable2;
        Throwable th;
        AutoCloseable autoCloseable3;
        e0a e0aVar;
        Object objC2;
        AutoCloseable autoCloseable4;
        ?? r18;
        Throwable th2;
        ?? r19;
        wne wneVar = wne.f39444a;
        byte b = this.o;
        ?? r3 = "CXCP";
        try {
            try {
                try {
                    try {
                        try {
                            if (b == 0) {
                                z1x.P(obj);
                                if (l8x.f0("CXCP")) {
                                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#startFocusAndMeteringAsync");
                                }
                                xot0 xot0Var = this.p;
                                List list3 = this.q;
                                List list4 = this.r;
                                List list5 = this.s;
                                vt00Var = this.t;
                                z40 z40Var2 = this.u;
                                long j2 = this.v;
                                b0a b0aVarA = xot0Var.c.a();
                                this.i = list3;
                                this.j = list4;
                                this.k = list5;
                                this.l = vt00Var;
                                this.m = z40Var2;
                                this.n = j2;
                                this.o = (byte) 1;
                                objC = b0aVarA.c(this);
                                if (objC != wneVar) {
                                    list = list4;
                                    r3 = list5;
                                    z40Var = z40Var2;
                                    list2 = list3;
                                    j = j2;
                                }
                                return wneVar;
                            }
                            if (b != 1) {
                                if (b != 2) {
                                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                autoCloseable4 = (AutoCloseable) this.i;
                                try {
                                    z1x.P(obj);
                                    objC2 = obj;
                                    r19 = "CXCP";
                                    try {
                                        jzj jzjVar = (jzj) objC2;
                                        ay3.L(autoCloseable4, null);
                                        return jzjVar;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        autoCloseable3 = autoCloseable4;
                                        r18 = r19;
                                        th = th2;
                                        r16 = r18;
                                        try {
                                            throw th;
                                        } catch (Throwable th4) {
                                            ay3.L(autoCloseable3, th);
                                            throw th4;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th2 = th5;
                                    autoCloseable3 = autoCloseable4;
                                    r18 = "CXCP";
                                    th = th2;
                                    r16 = r18;
                                    throw th;
                                }
                            }
                            long j3 = this.n;
                            z40 z40Var3 = this.m;
                            vt00 vt00Var2 = this.l;
                            List list6 = this.k;
                            List list7 = this.j;
                            List list8 = (List) this.i;
                            z1x.P(obj);
                            list2 = list8;
                            j = j3;
                            vt00Var = vt00Var2;
                            list = list7;
                            r3 = list6;
                            z40Var = z40Var3;
                            objC = obj;
                            objC2 = e0a.c(e0aVar, list2, list, r3, null, vt00Var, null, z40Var, null, j, j, this, 7175);
                            if (objC2 != wneVar) {
                                autoCloseable4 = autoCloseable2;
                                r19 = r17;
                                jzj jzjVar2 = (jzj) objC2;
                                ay3.L(autoCloseable4, null);
                                return jzjVar2;
                            }
                            return wneVar;
                        } catch (Throwable th6) {
                            th = th6;
                            th = th;
                            autoCloseable3 = autoCloseable2;
                            r16 = r17;
                            throw th;
                        }
                        e0aVar = (e0a) autoCloseable;
                        this.i = autoCloseable;
                        this.j = null;
                        this.k = null;
                        this.l = null;
                        this.m = null;
                        this.o = (byte) 2;
                        r17 = "CXCP";
                        autoCloseable2 = autoCloseable;
                    } catch (Throwable th7) {
                        th = th7;
                        r17 = r3;
                        autoCloseable2 = autoCloseable;
                    }
                    autoCloseable = (AutoCloseable) objC;
                } catch (CancellationException e) {
                    e = e;
                    r16 = r3;
                    if (l8x.f0(r16)) {
                        Log.d(r16, "Cannot acquire the CameraGraph.Session", e);
                    }
                    return xot0.l;
                }
            } catch (CancellationException e2) {
                e = e2;
            }
        } catch (CancellationException e3) {
            e = e3;
            r16 = r3;
        }
    }
}
