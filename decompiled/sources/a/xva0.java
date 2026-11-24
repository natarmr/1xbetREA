package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class xva0 implements fhs0, v9e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usd f41550a;
    public final f2e b;
    public final boolean c;
    public final xw3 d;
    public volatile boolean e;

    public xva0(usd usdVar, f2e f2eVar, boolean z) {
        usdVar.getClass();
        this.f41550a = usdVar;
        this.b = f2eVar;
        this.c = z;
        this.d = new xw3();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // a.iva0
    public final Object a(String str, Function2 function2, zje zjeVar) throws Throwable {
        uva0 uva0Var;
        i050 i050Var;
        String str2;
        Function2 function3;
        AutoCloseable l8m0Var;
        i050 i050Var2;
        Throwable th;
        if (zjeVar instanceof uva0) {
            uva0Var = (uva0) zjeVar;
            int i = uva0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                uva0Var.n = i - Integer.MIN_VALUE;
            } else {
                uva0Var = new uva0(this, zjeVar);
            }
        } else {
            uva0Var = new uva0(this, zjeVar);
        }
        uva0 uva0Var2 = uva0Var;
        Object objInvoke = uva0Var2.l;
        wne wneVar = wne.f39444a;
        int i2 = uva0Var2.n;
        try {
            try {
                if (i2 == 0) {
                    z1x.P(objInvoke);
                    if (this.e) {
                        m2x.J(21, "Connection is recycled");
                        throw null;
                    }
                    k1e k1eVar = (k1e) uva0Var2.getContext().get(this.f41550a);
                    if (k1eVar == null || k1eVar.b != this) {
                        m2x.J(21, "Attempted to use connection on a different coroutine");
                        throw null;
                    }
                    f2e f2eVar = this.b;
                    uva0Var2.i = str;
                    uva0Var2.j = function2;
                    uva0Var2.k = f2eVar;
                    uva0Var2.n = 1;
                    if (f2eVar.b.d(uva0Var2) != wneVar) {
                        str2 = str;
                        i050Var = f2eVar;
                        function3 = function2;
                    }
                    return wneVar;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l8m0Var = (AutoCloseable) uva0Var2.j;
                    i050Var2 = (i050) uva0Var2.i;
                    try {
                        z1x.P(objInvoke);
                        try {
                            ay3.L(l8m0Var, null);
                            i050Var2.c(null);
                            return objInvoke;
                        } catch (Throwable th2) {
                            th = th2;
                            i050Var = i050Var2;
                            i050Var.c(null);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i050Var = i050Var2;
                        AutoCloseable autoCloseable = l8m0Var;
                        th = th;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            ay3.L(autoCloseable, th);
                            throw th4;
                        }
                    }
                }
                f2e f2eVar2 = uva0Var2.k;
                Function2 function4 = (Function2) uva0Var2.j;
                String str3 = (String) uva0Var2.i;
                z1x.P(objInvoke);
                i050Var = f2eVar2;
                function3 = function4;
                str2 = str3;
                uva0Var2.i = i050Var;
                uva0Var2.j = l8m0Var;
                uva0Var2.k = null;
                uva0Var2.n = 2;
                objInvoke = function3.invoke(l8m0Var, uva0Var2);
                if (objInvoke != wneVar) {
                    i050Var2 = i050Var;
                    ay3.L(l8m0Var, null);
                    i050Var2.c(null);
                    return objInvoke;
                }
                return wneVar;
            } catch (Throwable th5) {
                th = th5;
                AutoCloseable autoCloseable2 = l8m0Var;
                th = th;
                throw th;
            }
            xpg0 xpg0VarZ0 = this.b.Z0(str2);
            zi90 zi90Var = new zi90(this, xva0.class, "isRecycled", "isRecycled()Z", 0, (byte) 1);
            xpg0VarZ0.getClass();
            l8m0Var = new l8m0(xpg0VarZ0, zi90Var);
        } catch (Throwable th6) {
            th = th6;
            i050Var.c(null);
            throw th;
        }
    }

    @Override // a.fhs0
    public final Boolean b(yje yjeVar) {
        if (this.e) {
            m2x.J(21, "Connection is recycled");
            throw null;
        }
        k1e k1eVar = (k1e) yjeVar.getContext().get(this.f41550a);
        if (k1eVar != null && k1eVar.b == this) {
            return Boolean.valueOf(!this.d.isEmpty() || this.b.f8807a.P0());
        }
        m2x.J(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.v9e0
    public final Object c(kyh kyhVar, yje yjeVar) throws Throwable {
        wva0 wva0Var;
        Function2 function2;
        f2e f2eVar;
        Throwable th;
        i050 i050Var;
        if (yjeVar instanceof wva0) {
            wva0Var = (wva0) yjeVar;
            int i = wva0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                wva0Var.m = i - Integer.MIN_VALUE;
            } else {
                wva0Var = new wva0(this, (zje) yjeVar);
            }
        } else {
            wva0Var = new wva0(this, (zje) yjeVar);
        }
        Object objInvoke = wva0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = wva0Var.m;
        f2e f2eVar2 = this.b;
        try {
            if (i2 == 0) {
                z1x.P(objInvoke);
                wva0Var.i = kyhVar;
                wva0Var.j = f2eVar2;
                wva0Var.m = 1;
                if (f2eVar2.b.d(wva0Var) != wneVar) {
                    function2 = kyhVar;
                    f2eVar = f2eVar2;
                }
                return wneVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i050Var = (i050) wva0Var.i;
                try {
                    z1x.P(objInvoke);
                    i050Var.c(null);
                    return objInvoke;
                } catch (Throwable th2) {
                    th = th2;
                    i050Var.c(null);
                    throw th;
                }
            }
            f2eVar = wva0Var.j;
            function2 = (Function2) wva0Var.i;
            z1x.P(objInvoke);
            wva0Var.i = f2eVar;
            wva0Var.j = null;
            wva0Var.m = 2;
            objInvoke = function2.invoke(f2eVar2, wva0Var);
            if (objInvoke != wneVar) {
                i050Var = f2eVar;
                i050Var.c(null);
                return objInvoke;
            }
            return wneVar;
        } catch (Throwable th3) {
            f2e f2eVar3 = f2eVar;
            th = th3;
            i050Var = f2eVar3;
            i050Var.c(null);
            throw th;
        }
    }

    @Override // a.fhs0
    public final Object d(dhs0 dhs0Var, Function2 function2, bnn0 bnn0Var) {
        if (this.e) {
            m2x.J(21, "Connection is recycled");
            throw null;
        }
        k1e k1eVar = (k1e) bnn0Var.getContext().get(this.f41550a);
        if (k1eVar != null && k1eVar.b == this) {
            return g(dhs0Var, function2, bnn0Var);
        }
        m2x.J(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
    
        if (a.j0x.s(r12, r13) == r2) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(a.dhs0 r13, a.zje r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xva0.e(a.dhs0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d7, code lost:
    
        if (a.j0x.s(r12, r13) == r4) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r13, a.zje r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xva0.f(boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object g(dhs0 dhs0Var, Function2 function2, zje zjeVar) throws Throwable {
        sva0 sva0Var;
        Function2 function3;
        hie0 hie0Var;
        mie0 mie0Var;
        hie0 hie0Var2;
        mie0 mie0Var2;
        hie0 hie0Var3;
        mie0 mie0Var3;
        Object obj;
        z560 z560Var;
        fra0 fra0Var;
        if (zjeVar instanceof sva0) {
            sva0Var = (sva0) zjeVar;
            int i = sva0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                sva0Var.m = i - Integer.MIN_VALUE;
            } else {
                sva0Var = new sva0(this, zjeVar);
            }
        } else {
            sva0Var = new sva0(this, zjeVar);
        }
        sva0 sva0Var2 = sva0Var;
        Object objInvoke = sva0Var2.k;
        wne wneVar = wne.f39444a;
        int i2 = sva0Var2.m;
        yje yjeVar = null;
        try {
            if (i2 == 0) {
                z1x.P(objInvoke);
                z560 z560Var2 = z560.b;
                o690 o690Var = new o690((Object) this, (Object) dhs0Var, yjeVar, (byte) 10);
                sva0Var2.i = function2;
                sva0Var2.m = 1;
                if (qjj.d0(z560Var2, o690Var, sva0Var2) != wneVar) {
                    function3 = function2;
                }
                return wneVar;
            }
            if (i2 == 1) {
                function3 = (Function2) sva0Var2.i;
                z1x.P(objInvoke);
            } else {
                if (i2 != 2) {
                    if (i2 == 3 || i2 == 4) {
                        Object obj2 = sva0Var2.i;
                        z1x.P(objInvoke);
                        return obj2;
                    }
                    if (i2 != 5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th = (Throwable) sva0Var2.i;
                    z1x.P(objInvoke);
                    throw th;
                }
                mie0 mie0Var4 = sva0Var2.j;
                hie0 hie0Var4 = (hie0) sva0Var2.i;
                try {
                    z1x.P(objInvoke);
                    mie0Var3 = mie0Var4;
                    hie0Var3 = hie0Var4;
                    obj = objInvoke;
                    z560Var = z560.b;
                    fra0Var = new fra0((Object) this, (Object) hie0Var3, (Object) mie0Var3, yjeVar, (byte) 4);
                    sva0Var2.i = obj;
                    sva0Var2.j = null;
                    sva0Var2.m = 3;
                    if (qjj.d0(z560Var, fra0Var, sva0Var2) != wneVar) {
                        return wneVar;
                    }
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    mie0Var2 = mie0Var4;
                    hie0Var2 = hie0Var4;
                    try {
                        hie0Var2.f13108a = false;
                        mie0Var2.f21842a = th;
                        throw th;
                    } catch (Throwable th3) {
                        z560 z560Var3 = z560.b;
                        fra0 fra0Var2 = new fra0((Object) this, (Object) hie0Var2, (Object) mie0Var2, yjeVar, (byte) 4);
                        sva0Var2.i = th3;
                        sva0Var2.j = yjeVar;
                        sva0Var2.m = 5;
                        if (qjj.d0(z560Var3, fra0Var2, sva0Var2) != wneVar) {
                            throw th3;
                        }
                    }
                }
            }
            jz80 jz80Var = new jz80(this, (byte) 1);
            sva0Var2.i = hie0Var;
            sva0Var2.j = mie0Var;
            sva0Var2.m = 2;
            objInvoke = function3.invoke(jz80Var, sva0Var2);
            if (objInvoke != wneVar) {
                hie0Var3 = hie0Var;
                mie0Var3 = mie0Var;
                obj = objInvoke;
                z560Var = z560.b;
                fra0Var = new fra0((Object) this, (Object) hie0Var3, (Object) mie0Var3, yjeVar, (byte) 4);
                sva0Var2.i = obj;
                sva0Var2.j = null;
                sva0Var2.m = 3;
                if (qjj.d0(z560Var, fra0Var, sva0Var2) != wneVar) {
                    return obj;
                }
            }
            return wneVar;
        } catch (Throwable th4) {
            th = th4;
            hie0Var2 = hie0Var;
            mie0Var2 = mie0Var;
            hie0Var2.f13108a = false;
            mie0Var2.f21842a = th;
            throw th;
        }
        hie0Var = new hie0();
        hie0Var.f13108a = true;
        mie0Var = new mie0();
    }
}
