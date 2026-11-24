package a;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class z1e implements s1e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gva0 f43613a;
    public final gva0 b;
    public final usd c = new usd();
    public final ThreadLocal d = new ThreadLocal();
    public volatile boolean e;
    public final long f;

    public z1e(xg0 xg0Var, int i) {
        uen uenVar = wen.b;
        this.f = ibc.v0(30, bfn.SECONDS);
        this.f43613a = new gva0(4, new hr(xg0Var, null, (byte) 9));
        this.b = new gva0(1, xg0Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f43613a.c();
        this.b.c();
    }

    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0159 A[Catch: all -> 0x01a7, TRY_LEAVE, TryCatch #2 {all -> 0x01a7, blocks: (B:64:0x0132, B:69:0x014e, B:71:0x0159, B:81:0x01ab, B:82:0x01b2), top: B:98:0x0132 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x018a  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ab A[Catch: all -> 0x01a7, TRY_ENTER, TryCatch #2 {all -> 0x01a7, blocks: (B:64:0x0132, B:69:0x014e, B:71:0x0159, B:81:0x01ab, B:82:0x01b2), top: B:98:0x0132 }] */
    @Override // a.s1e
    public final Object m(boolean z, Function2 function2, zje zjeVar) throws Throwable {
        w1e w1eVar;
        mie0 mie0Var;
        mie0 mie0Var2;
        gva0 gva0Var;
        mie0 mie0Var3;
        CoroutineContext context;
        Function2 function3;
        usd usdVar;
        gva0 gva0Var2;
        mie0 mie0Var4;
        mie0 mie0Var5;
        byte b;
        Object obj;
        mie0 mie0Var6;
        gva0 gva0Var3;
        mie0 mie0Var7;
        z560 z560Var;
        wn2 wn2Var;
        boolean z2 = z;
        if (zjeVar instanceof w1e) {
            w1eVar = (w1e) zjeVar;
            int i = w1eVar.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                w1eVar.s = i - Integer.MIN_VALUE;
            } else {
                w1eVar = new w1e(this, zjeVar);
            }
        } else {
            w1eVar = new w1e(this, zjeVar);
        }
        Object objD0 = w1eVar.q;
        wne wneVar = wne.f39444a;
        boolean z3 = true;
        yje yjeVar = null;
        switch (w1eVar.s) {
            case 0:
                z1x.P(objD0);
                if (this.e) {
                    m2x.J(21, "Connection pool is closed");
                    throw null;
                }
                xva0 xva0Var = (xva0) this.d.get();
                if (xva0Var == null) {
                    k1e k1eVar = (k1e) w1eVar.getContext().get(this.c);
                    xva0Var = k1eVar != null ? k1eVar.b : null;
                }
                byte b2 = 2;
                if (xva0Var == null) {
                    gva0 gva0Var4 = z2 ? this.f43613a : this.b;
                    mie0Var = new mie0();
                    mie0Var2 = new mie0();
                    try {
                        context = w1eVar.getContext();
                        usd usdVar2 = this.c;
                        long j = this.f;
                        lf2 lf2Var = new lf2(this, z2, context, b2);
                        w1eVar.j = function2;
                        w1eVar.k = gva0Var4;
                        w1eVar.l = mie0Var;
                        w1eVar.m = mie0Var2;
                        w1eVar.n = context;
                        w1eVar.o = mie0Var2;
                        w1eVar.p = usdVar2;
                        w1eVar.i = z2;
                        w1eVar.s = 3;
                        Object objB = gva0Var4.b(j, lf2Var, w1eVar);
                        if (objB != wneVar) {
                            function3 = function2;
                            usdVar = usdVar2;
                            gva0Var2 = gva0Var4;
                            objD0 = objB;
                            mie0Var4 = mie0Var2;
                            try {
                                f2e f2eVar = (f2e) objD0;
                                f2eVar.getClass();
                                context.getClass();
                                f2eVar.c = context;
                                f2eVar.d = new Throwable();
                                b = 0;
                                if (this.f43613a != this.b || !z2) {
                                    z3 = false;
                                }
                                mie0Var4.f21842a = new xva0(usdVar, f2eVar, z3);
                                obj = mie0Var2.f21842a;
                                if (obj != null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                xva0 xva0Var2 = (xva0) obj;
                                CoroutineContext coroutineContextC = kotlin.coroutines.e.c(new k1e(this.c, xva0Var2), new fcq0(xva0Var2, this.d));
                                y1e y1eVar = new y1e(function3, mie0Var2, yjeVar, b);
                                w1eVar.j = gva0Var2;
                                w1eVar.k = mie0Var;
                                w1eVar.l = mie0Var2;
                                w1eVar.m = null;
                                w1eVar.n = null;
                                w1eVar.o = null;
                                w1eVar.p = null;
                                w1eVar.s = 4;
                                objD0 = qjj.d0(coroutineContextC, y1eVar, w1eVar);
                                if (objD0 != wneVar) {
                                    mie0Var6 = mie0Var;
                                    gva0Var3 = gva0Var2;
                                    mie0Var7 = mie0Var2;
                                    z560Var = z560.b;
                                    wn2Var = new wn2((byte) 9, yjeVar, (Serializable) mie0Var6, (Object) mie0Var7, (Object) gva0Var3);
                                    w1eVar.j = objD0;
                                    w1eVar.k = null;
                                    w1eVar.l = null;
                                    w1eVar.s = 5;
                                    if (qjj.d0(z560Var, wn2Var, w1eVar) == wneVar) {
                                        return objD0;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                mie0Var3 = mie0Var;
                                gva0Var = gva0Var2;
                                mie0Var5 = mie0Var2;
                                try {
                                    mie0Var3.f21842a = th;
                                    throw th;
                                } catch (Throwable th2) {
                                    z560 z560Var2 = z560.b;
                                    wn2 wn2Var2 = new wn2((byte) 9, yjeVar, (Serializable) mie0Var3, (Object) mie0Var5, (Object) gva0Var);
                                    w1eVar.j = th2;
                                    w1eVar.k = null;
                                    w1eVar.l = null;
                                    w1eVar.m = null;
                                    w1eVar.n = null;
                                    w1eVar.o = null;
                                    w1eVar.p = null;
                                    w1eVar.s = 6;
                                    if (qjj.d0(z560Var2, wn2Var2, w1eVar) != wneVar) {
                                        throw th2;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        gva0Var = gva0Var4;
                        mie0Var3 = mie0Var;
                        mie0Var5 = mie0Var2;
                        mie0Var3.f21842a = th;
                        throw th;
                    }
                } else {
                    if (!z2 && xva0Var.c) {
                        m2x.J(1, "Cannot upgrade connection from reader to writer");
                        throw null;
                    }
                    if (w1eVar.getContext().get(this.c) == null) {
                        CoroutineContext coroutineContextC2 = kotlin.coroutines.e.c(new k1e(this.c, xva0Var), new fcq0(xva0Var, this.d));
                        jtb jtbVar = new jtb(function2, xva0Var, yjeVar, (byte) 16);
                        w1eVar.s = 1;
                        Object objD1 = qjj.d0(coroutineContextC2, jtbVar, w1eVar);
                        if (objD1 != wneVar) {
                            return objD1;
                        }
                    } else {
                        w1eVar.s = 2;
                        Object objInvoke = function2.invoke(xva0Var, w1eVar);
                        if (objInvoke != wneVar) {
                            return objInvoke;
                        }
                    }
                }
                return wneVar;
            case 1:
                z1x.P(objD0);
                return objD0;
            case 2:
                z1x.P(objD0);
                return objD0;
            case 3:
                z2 = w1eVar.i;
                usdVar = w1eVar.p;
                mie0Var4 = w1eVar.o;
                CoroutineContext coroutineContext = w1eVar.n;
                mie0Var2 = w1eVar.m;
                mie0Var3 = w1eVar.l;
                gva0Var2 = (gva0) w1eVar.k;
                function3 = (Function2) w1eVar.j;
                try {
                    z1x.P(objD0);
                    context = coroutineContext;
                    mie0Var = mie0Var3;
                    f2e f2eVar2 = (f2e) objD0;
                    f2eVar2.getClass();
                    context.getClass();
                    f2eVar2.c = context;
                    f2eVar2.d = new Throwable();
                    b = 0;
                    if (this.f43613a != this.b) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    mie0Var4.f21842a = new xva0(usdVar, f2eVar2, z3);
                    obj = mie0Var2.f21842a;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    xva0 xva0Var3 = (xva0) obj;
                    CoroutineContext coroutineContextC3 = kotlin.coroutines.e.c(new k1e(this.c, xva0Var3), new fcq0(xva0Var3, this.d));
                    y1e y1eVar2 = new y1e(function3, mie0Var2, yjeVar, b);
                    w1eVar.j = gva0Var2;
                    w1eVar.k = mie0Var;
                    w1eVar.l = mie0Var2;
                    w1eVar.m = null;
                    w1eVar.n = null;
                    w1eVar.o = null;
                    w1eVar.p = null;
                    w1eVar.s = 4;
                    objD0 = qjj.d0(coroutineContextC3, y1eVar2, w1eVar);
                    if (objD0 != wneVar) {
                        mie0Var6 = mie0Var;
                        gva0Var3 = gva0Var2;
                        mie0Var7 = mie0Var2;
                        z560Var = z560.b;
                        wn2Var = new wn2((byte) 9, yjeVar, (Serializable) mie0Var6, (Object) mie0Var7, (Object) gva0Var3);
                        w1eVar.j = objD0;
                        w1eVar.k = null;
                        w1eVar.l = null;
                        w1eVar.s = 5;
                        if (qjj.d0(z560Var, wn2Var, w1eVar) == wneVar) {
                            return objD0;
                        }
                    }
                    return wneVar;
                } catch (Throwable th4) {
                    th = th4;
                    gva0Var = gva0Var2;
                    mie0Var5 = mie0Var2;
                    mie0Var3.f21842a = th;
                    throw th;
                }
            case 4:
                mie0 mie0Var8 = w1eVar.l;
                mie0 mie0Var9 = (mie0) w1eVar.k;
                gva0 gva0Var5 = (gva0) w1eVar.j;
                try {
                    z1x.P(objD0);
                    mie0Var7 = mie0Var8;
                    mie0Var6 = mie0Var9;
                    gva0Var3 = gva0Var5;
                    z560Var = z560.b;
                    wn2Var = new wn2((byte) 9, yjeVar, (Serializable) mie0Var6, (Object) mie0Var7, (Object) gva0Var3);
                    w1eVar.j = objD0;
                    w1eVar.k = null;
                    w1eVar.l = null;
                    w1eVar.s = 5;
                    if (qjj.d0(z560Var, wn2Var, w1eVar) == wneVar) {
                        return wneVar;
                    }
                    return objD0;
                } catch (Throwable th5) {
                    th = th5;
                    mie0Var5 = mie0Var8;
                    mie0Var3 = mie0Var9;
                    gva0Var = gva0Var5;
                    mie0Var3.f21842a = th;
                    throw th;
                }
            case 5:
                Object obj2 = w1eVar.j;
                z1x.P(objD0);
                return obj2;
            case 6:
                Throwable th6 = (Throwable) w1eVar.j;
                z1x.P(objD0);
                throw th6;
            default:
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public z1e(xg0 xg0Var) {
        uen uenVar = wen.b;
        this.f = ibc.v0(30, bfn.SECONDS);
        gva0 gva0Var = new gva0(1, xg0Var);
        this.f43613a = gva0Var;
        this.b = gva0Var;
    }
}
