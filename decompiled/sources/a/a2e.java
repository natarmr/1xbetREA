package a;

import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a2e implements t1e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hva0 f119a;
    public final hva0 b;
    public final ThreadLocal c;
    public final AtomicBoolean d;
    public final long e;

    public a2e(final ehf0 ehf0Var, final String str, int i) {
        str.getClass();
        this.c = new ThreadLocal();
        final byte b = 0;
        this.d = new AtomicBoolean(false);
        uen uenVar = wen.b;
        this.e = ibc.v0(30, bfn.SECONDS);
        if (i <= 0) {
            jf4.o("Maximum number of readers must be greater than 0");
            throw null;
        }
        this.f119a = new hva0(i, new Function0() { // from class: a.v1e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                String str2 = str;
                ehf0 ehf0Var2 = ehf0Var;
                switch (b2) {
                    case 0:
                        qpg0 qpg0VarA = ehf0Var2.a(str2);
                        n2x.x(qpg0VarA, "PRAGMA query_only = 1");
                        return qpg0VarA;
                    default:
                        return ehf0Var2.a(str2);
                }
            }
        });
        final byte b2 = 1;
        this.b = new hva0(1, new Function0() { // from class: a.v1e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                String str2 = str;
                ehf0 ehf0Var2 = ehf0Var;
                switch (b3) {
                    case 0:
                        qpg0 qpg0VarA = ehf0Var2.a(str2);
                        n2x.x(qpg0VarA, "PRAGMA query_only = 1");
                        return qpg0VarA;
                    default:
                        return ehf0Var2.a(str2);
                }
            }
        });
    }

    public final void a(boolean z) {
        String str = z ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.b.c(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.f119a.c(sb);
        m2x.J(5, sb.toString());
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.d.compareAndSet(false, true)) {
            this.f119a.b();
            this.b.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:139:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a2 A[Catch: all -> 0x01ba, TRY_LEAVE, TryCatch #5 {all -> 0x01ba, blocks: (B:90:0x019c, B:92:0x01a2, B:94:0x01ac, B:95:0x01b1), top: B:132:0x019c }] */
    @Override // a.t1e
    public final Object m(boolean z, Function2 function2, zje zjeVar) {
        x1e x1eVar;
        mie0 mie0Var;
        Throwable th;
        hva0 hva0Var;
        CoroutineContext context;
        mie0 mie0Var2;
        hva0 hva0Var2;
        mie0 mie0Var3;
        CoroutineContext coroutineContext;
        a2e a2eVar;
        boolean z2;
        mie0 mie0Var4;
        a2e a2eVar2;
        mie0 mie0Var5;
        yva0 yva0Var;
        yva0 yva0Var2;
        a2e a2eVar3 = this;
        boolean z3 = z;
        Function2 function3 = function2;
        if (zjeVar instanceof x1e) {
            x1eVar = (x1e) zjeVar;
            int i = x1eVar.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                x1eVar.r = i - Integer.MIN_VALUE;
            } else {
                x1eVar = new x1e(a2eVar3, zjeVar);
            }
        } else {
            x1eVar = new x1e(a2eVar3, zjeVar);
        }
        Object objD0 = x1eVar.p;
        wne wneVar = wne.f39444a;
        int i2 = x1eVar.r;
        yje yjeVar = null;
        try {
            if (i2 == 0) {
                z1x.P(objD0);
                if (a2eVar3.d.get()) {
                    m2x.J(21, "Connection pool is closed");
                    throw null;
                }
                ThreadLocal threadLocal = a2eVar3.c;
                yva0 yva0Var3 = (yva0) threadLocal.get();
                nwd nwdVar = l1e.b;
                if (yva0Var3 == null) {
                    l1e l1eVar = (l1e) x1eVar.getContext().get(nwdVar);
                    yva0Var3 = l1eVar != null ? l1eVar.f19248a : null;
                }
                if (yva0Var3 == null) {
                    hva0 hva0Var3 = z3 ? a2eVar3.f119a : a2eVar3.b;
                    mie0Var = new mie0();
                    try {
                        context = x1eVar.getContext();
                        mie0Var2 = new mie0();
                        try {
                            long j = a2eVar3.e;
                            cxd cxdVar = new cxd((Object) mie0Var2, (Object) hva0Var3, yjeVar, (byte) 10);
                            x1eVar.i = a2eVar3;
                            x1eVar.j = (Serializable) function3;
                            x1eVar.k = hva0Var3;
                            x1eVar.l = mie0Var;
                            x1eVar.m = context;
                            x1eVar.n = mie0Var2;
                            x1eVar.o = z3;
                            x1eVar.r = 3;
                            if (msm0.t(qcc.g0(j), cxdVar, x1eVar) != wneVar) {
                                hva0Var2 = hva0Var3;
                                mie0Var3 = mie0Var;
                                coroutineContext = context;
                                a2eVar = a2eVar3;
                                z2 = z3;
                                mie0Var4 = mie0Var2;
                                mie0Var2 = mie0Var4;
                                z3 = z2;
                                mie0Var5 = mie0Var3;
                                a2eVar2 = a2eVar;
                                context = coroutineContext;
                                th = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            hva0Var2 = hva0Var3;
                            mie0Var3 = mie0Var;
                            mie0 mie0Var6 = mie0Var3;
                            a2eVar2 = a2eVar3;
                            mie0Var5 = mie0Var6;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        hva0Var = hva0Var3;
                        throw th;
                    }
                } else {
                    if (!z3 && yva0Var3.b) {
                        m2x.J(1, "Cannot upgrade connection from reader to writer");
                        throw null;
                    }
                    if (x1eVar.getContext().get(nwdVar) == null) {
                        CoroutineContext coroutineContextC = kotlin.coroutines.e.c(new l1e(yva0Var3), new fcq0(yva0Var3, threadLocal));
                        jtb jtbVar = new jtb(function3, yva0Var3, yjeVar, (byte) 17);
                        x1eVar.r = 1;
                        Object objD1 = qjj.d0(coroutineContextC, jtbVar, x1eVar);
                        if (objD1 != wneVar) {
                            return objD1;
                        }
                    } else {
                        x1eVar.r = 2;
                        Object objInvoke = function3.invoke(yva0Var3, x1eVar);
                        if (objInvoke != wneVar) {
                            return objInvoke;
                        }
                    }
                }
                return wneVar;
            }
            if (i2 == 1) {
                z1x.P(objD0);
                return objD0;
            }
            if (i2 == 2) {
                z1x.P(objD0);
                return objD0;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mie0Var5 = (mie0) x1eVar.j;
                hva0Var = (hva0) x1eVar.i;
                try {
                    z1x.P(objD0);
                    try {
                        yva0Var2 = (yva0) mie0Var5.f21842a;
                        if (yva0Var2 != null) {
                            if (yva0Var2.d.compareAndSet(false, true)) {
                                try {
                                    n2x.x(yva0Var2.f43310a, "ROLLBACK TRANSACTION");
                                } catch (SQLException unused) {
                                }
                            }
                            e2e e2eVar = yva0Var2.f43310a;
                            e2eVar.c = null;
                            e2eVar.d = null;
                            hva0Var.d(e2eVar);
                        }
                    } catch (Throwable unused2) {
                    }
                    return objD0;
                } catch (Throwable th4) {
                    th = th4;
                    mie0Var = mie0Var5;
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th5) {
                        try {
                            yva0 yva0Var4 = (yva0) mie0Var.f21842a;
                            if (yva0Var4 == null) {
                                throw th5;
                            }
                            if (yva0Var4.d.compareAndSet(false, true)) {
                                try {
                                    n2x.x(yva0Var4.f43310a, "ROLLBACK TRANSACTION");
                                } catch (SQLException unused3) {
                                }
                            }
                            e2e e2eVar2 = yva0Var4.f43310a;
                            e2eVar2.c = null;
                            e2eVar2.d = null;
                            hva0Var.d(e2eVar2);
                            throw th5;
                        } catch (Throwable th6) {
                            tjo.a(th, th6);
                            throw th5;
                        }
                    }
                }
            }
            z2 = x1eVar.o;
            mie0Var4 = x1eVar.n;
            CoroutineContext coroutineContext2 = x1eVar.m;
            mie0Var3 = x1eVar.l;
            hva0Var2 = x1eVar.k;
            Function2 function4 = (Function2) x1eVar.j;
            a2eVar = (a2e) x1eVar.i;
            try {
                z1x.P(objD0);
                coroutineContext = coroutineContext2;
                function3 = function4;
                mie0Var2 = mie0Var4;
                z3 = z2;
                mie0Var5 = mie0Var3;
                a2eVar2 = a2eVar;
                context = coroutineContext;
                th = null;
            } catch (Throwable th7) {
                th = th7;
                mie0Var2 = mie0Var4;
                z3 = z2;
                a2eVar3 = a2eVar;
                context = coroutineContext2;
                function3 = function4;
                mie0 mie0Var7 = mie0Var3;
                a2eVar2 = a2eVar3;
                mie0Var5 = mie0Var7;
            }
            e2e e2eVar3 = (e2e) mie0Var2.f21842a;
            if (e2eVar3 != null) {
                context.getClass();
                e2eVar3.c = context;
                e2eVar3.d = new Throwable();
                yva0Var = new yva0(e2eVar3, a2eVar2.f119a != a2eVar2.b && z3);
            } else {
                yva0Var = null;
            }
            mie0Var5.f21842a = yva0Var;
            if (th instanceof gmq0) {
                a2eVar2.a(z3);
                throw null;
            }
            if (th != null) {
                throw th;
            }
            if (yva0Var == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            a2eVar2.getClass();
            CoroutineContext coroutineContextC2 = kotlin.coroutines.e.c(new l1e(yva0Var), new fcq0(yva0Var, a2eVar2.c));
            y1e y1eVar = new y1e(function3, mie0Var5, yjeVar, (byte) 1);
            x1eVar.i = hva0Var2;
            x1eVar.j = mie0Var5;
            x1eVar.k = null;
            x1eVar.l = null;
            x1eVar.m = null;
            x1eVar.n = null;
            x1eVar.r = 4;
            objD0 = qjj.d0(coroutineContextC2, y1eVar, x1eVar);
            if (objD0 != wneVar) {
                hva0Var = hva0Var2;
                yva0Var2 = (yva0) mie0Var5.f21842a;
                if (yva0Var2 != null) {
                    if (yva0Var2.d.compareAndSet(false, true)) {
                        n2x.x(yva0Var2.f43310a, "ROLLBACK TRANSACTION");
                    }
                    e2e e2eVar4 = yva0Var2.f43310a;
                    e2eVar4.c = null;
                    e2eVar4.d = null;
                    hva0Var.d(e2eVar4);
                }
                return objD0;
            }
            return wneVar;
        } catch (Throwable th8) {
            th = th8;
            mie0Var = mie0Var5;
            hva0Var = hva0Var2;
            th = th;
            throw th;
        }
    }

    public a2e(ehf0 ehf0Var) {
        this.c = new ThreadLocal();
        this.d = new AtomicBoolean(false);
        uen uenVar = wen.b;
        this.e = ibc.v0(30, bfn.SECONDS);
        hva0 hva0Var = new hva0(1, new jwd(ehf0Var, (byte) 3));
        this.f119a = hva0Var;
        this.b = hva0Var;
    }
}
