package a;

import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class yva0 implements ghs0, w9e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2e f43310a;
    public final boolean b;
    public final xw3 c = new xw3();
    public final AtomicBoolean d = new AtomicBoolean(false);

    public yva0(e2e e2eVar, boolean z) {
        this.f43310a = e2eVar;
        this.b = z;
    }

    @Override // a.ghs0
    public final Object a(ehs0 ehs0Var, Function2 function2, bnn0 bnn0Var) {
        if (this.d.get()) {
            m2x.J(21, "Connection is recycled");
            throw null;
        }
        l1e l1eVar = (l1e) bnn0Var.getContext().get(l1e.b);
        if (l1eVar != null && l1eVar.f19248a == this) {
            return g(ehs0Var, function2, bnn0Var);
        }
        m2x.J(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.jva0
    public final Object b(String str, Function1 function1, zje zjeVar) {
        vva0 vva0Var;
        e2e e2eVar;
        if (zjeVar instanceof vva0) {
            vva0Var = (vva0) zjeVar;
            int i = vva0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                vva0Var.o = i - Integer.MIN_VALUE;
            } else {
                vva0Var = new vva0(this, zjeVar);
            }
        } else {
            vva0Var = new vva0(this, zjeVar);
        }
        Object obj = vva0Var.m;
        wne wneVar = wne.f39444a;
        int i2 = vva0Var.o;
        if (i2 == 0) {
            z1x.P(obj);
            if (this.d.get()) {
                m2x.J(21, "Connection is recycled");
                throw null;
            }
            l1e l1eVar = (l1e) vva0Var.getContext().get(l1e.b);
            if (l1eVar == null || l1eVar.f19248a != this) {
                m2x.J(21, "Attempted to use connection on a different coroutine");
                throw null;
            }
            vva0Var.i = this;
            vva0Var.j = str;
            vva0Var.k = function1;
            e2eVar = this.f43310a;
            vva0Var.l = e2eVar;
            vva0Var.o = 1;
            if (e2eVar.b.d(vva0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e2e e2eVar2 = vva0Var.l;
            function1 = vva0Var.k;
            str = vva0Var.j;
            yva0 yva0Var = vva0Var.i;
            z1x.P(obj);
            e2eVar = e2eVar2;
            this = yva0Var;
        }
        try {
            kva0 kva0Var = new kva0(this, this.f43310a.Z0(str));
            try {
                Object objInvoke = function1.invoke(kva0Var);
                ay3.L(kva0Var, null);
                e2eVar.c(null);
                return objInvoke;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ay3.L(kva0Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            e2eVar.c(null);
            throw th3;
        }
    }

    @Override // a.ghs0
    public final Object c(bnn0 bnn0Var) {
        if (this.d.get()) {
            m2x.J(21, "Connection is recycled");
            throw null;
        }
        l1e l1eVar = (l1e) bnn0Var.getContext().get(l1e.b);
        if (l1eVar != null && l1eVar.f19248a == this) {
            return Boolean.valueOf(!this.c.isEmpty());
        }
        m2x.J(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // a.w9e0
    public final qpg0 d() {
        return this.f43310a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object e(ehs0 ehs0Var, zje zjeVar) {
        pva0 pva0Var;
        e2e e2eVar;
        if (zjeVar instanceof pva0) {
            pva0Var = (pva0) zjeVar;
            int i = pva0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                pva0Var.n = i - Integer.MIN_VALUE;
            } else {
                pva0Var = new pva0(this, zjeVar);
            }
        } else {
            pva0Var = new pva0(this, zjeVar);
        }
        Object obj = pva0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = pva0Var.n;
        if (i2 == 0) {
            z1x.P(obj);
            pva0Var.i = this;
            pva0Var.j = ehs0Var;
            e2eVar = this.f43310a;
            pva0Var.k = e2eVar;
            pva0Var.n = 1;
            if (e2eVar.b.d(pva0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e2e e2eVar2 = pva0Var.k;
            ehs0Var = pva0Var.j;
            yva0 yva0Var = pva0Var.i;
            z1x.P(obj);
            e2eVar = e2eVar2;
            this = yva0Var;
        }
        try {
            xw3 xw3Var = this.c;
            e2e e2eVar3 = this.f43310a;
            int i3 = xw3Var.c;
            if (xw3Var.isEmpty()) {
                int iOrdinal = ehs0Var.ordinal();
                if (iOrdinal == 0) {
                    n2x.x(e2eVar3, "BEGIN DEFERRED TRANSACTION");
                } else if (iOrdinal == 1) {
                    n2x.x(e2eVar3, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (iOrdinal != 2) {
                        throw new m460();
                    }
                    n2x.x(e2eVar3, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                n2x.x(e2eVar3, "SAVEPOINT '" + i3 + '\'');
            }
            xw3Var.addLast(new nva0(i3));
            Unit unit = Unit.f46060a;
            e2eVar.c(null);
            return unit;
        } catch (Throwable th) {
            e2eVar.c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(boolean z, zje zjeVar) {
        rva0 rva0Var;
        e2e e2eVar;
        if (zjeVar instanceof rva0) {
            rva0Var = (rva0) zjeVar;
            int i = rva0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                rva0Var.n = i - Integer.MIN_VALUE;
            } else {
                rva0Var = new rva0(this, zjeVar);
            }
        } else {
            rva0Var = new rva0(this, zjeVar);
        }
        Object obj = rva0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = rva0Var.n;
        if (i2 == 0) {
            z1x.P(obj);
            rva0Var.i = this;
            e2eVar = this.f43310a;
            rva0Var.j = e2eVar;
            rva0Var.k = z;
            rva0Var.n = 1;
            if (e2eVar.b.d(rva0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = rva0Var.k;
            e2e e2eVar2 = rva0Var.j;
            yva0 yva0Var = rva0Var.i;
            z1x.P(obj);
            e2eVar = e2eVar2;
            this = yva0Var;
        }
        try {
            xw3 xw3Var = this.c;
            e2e e2eVar3 = this.f43310a;
            if (xw3Var.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            nva0 nva0Var = (nva0) w3d.z(xw3Var);
            if (z) {
                nva0Var.getClass();
                if (xw3Var.isEmpty()) {
                    n2x.x(e2eVar3, "END TRANSACTION");
                } else {
                    n2x.x(e2eVar3, "RELEASE SAVEPOINT '" + nva0Var.f24181a + '\'');
                }
            } else if (xw3Var.isEmpty()) {
                n2x.x(e2eVar3, "ROLLBACK TRANSACTION");
            } else {
                n2x.x(e2eVar3, "ROLLBACK TRANSACTION TO SAVEPOINT '" + nva0Var.f24181a + '\'');
            }
            Unit unit = Unit.f46060a;
            e2eVar.c(null);
            return unit;
        } catch (Throwable th) {
            e2eVar.c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object] */
    public final Object g(ehs0 ehs0Var, Function2 function2, zje zjeVar) throws Throwable {
        tva0 tva0Var;
        SQLException e;
        Throwable th;
        ?? r10;
        yva0 yva0Var;
        if (zjeVar instanceof tva0) {
            tva0Var = (tva0) zjeVar;
            int i = tva0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                tva0Var.n = i - Integer.MIN_VALUE;
            } else {
                tva0Var = new tva0(this, zjeVar);
            }
        } else {
            tva0Var = new tva0(this, zjeVar);
        }
        Object objInvoke = tva0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = tva0Var.n;
        boolean z = true;
        try {
            if (i2 == 0) {
                z1x.P(objInvoke);
                if (ehs0Var == null) {
                    ehs0Var = ehs0.f7823a;
                }
                tva0Var.i = this;
                tva0Var.j = (Serializable) function2;
                tva0Var.n = 1;
                Object objE = e(ehs0Var, tva0Var);
                this = this;
                if (objE != wneVar) {
                }
                return wneVar;
            }
            if (i2 == 1) {
                function2 = (Function2) tva0Var.j;
                yva0 yva0Var2 = (yva0) tva0Var.i;
                z1x.P(objInvoke);
                r10 = yva0Var2;
            } else {
                if (i2 != 2) {
                    if (i2 == 3 || i2 == 4) {
                        Object obj = tva0Var.i;
                        z1x.P(objInvoke);
                        return obj;
                    }
                    if (i2 != 5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = (Throwable) tva0Var.j;
                    th = (Throwable) tva0Var.i;
                    try {
                        z1x.P(objInvoke);
                        throw th;
                    } catch (SQLException e2) {
                        e = e2;
                        if (th != null) {
                            throw e;
                        }
                        tjo.a(th, e);
                        throw th;
                    }
                }
                z = tva0Var.k;
                yva0 yva0Var3 = (yva0) tva0Var.i;
                z1x.P(objInvoke);
                yva0Var = yva0Var3;
            }
            tva0Var.i = objInvoke;
            tva0Var.n = 3;
            this = yva0Var.f(z, tva0Var);
            if (this != wneVar) {
                return wneVar;
            }
            return objInvoke;
            lva0 lva0Var = new lva0(r10, (byte) 0);
            tva0Var.i = r10;
            tva0Var.j = null;
            tva0Var.k = true;
            tva0Var.n = 2;
            objInvoke = function2.invoke(lva0Var, tva0Var);
            yva0Var = r10;
            if (objInvoke != wneVar) {
                tva0Var.i = objInvoke;
                tva0Var.n = 3;
                this = yva0Var.f(z, tva0Var);
                if (this != wneVar) {
                    return objInvoke;
                }
            }
            return wneVar;
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    tva0Var.i = th;
                    tva0Var.j = th3;
                    tva0Var.n = 5;
                    if (this.f(false, tva0Var) != wneVar) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    tjo.a(th, e);
                    throw th;
                }
            }
        }
    }
}
