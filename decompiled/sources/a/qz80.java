package a;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qz80 implements s1e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xg0 f29569a;
    public final due0 b;
    public final ReentrantLock c = new ReentrantLock();
    public final k050 d = new k050();
    public final mi70 e = new mi70();
    public qpg0 f;
    public volatile boolean g;

    public qz80(xg0 xg0Var, due0 due0Var) {
        this.f29569a = xg0Var;
        this.b = due0Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        if (a.vdx.h0(r10.d, r12, r0) == r1) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.gv60 r11, a.zje r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof a.pz80
            if (r0 == 0) goto L13
            r0 = r12
            a.pz80 r0 = (a.pz80) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.pz80 r0 = new a.pz80
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            java.lang.String r3 = "Resumed on a different thread during connection pool initialization. This can occur when Room's SupportSQLite wrapper is used with a suspending driver. Please report this issue at https://issuetracker.google.com/issues/new?component=413107&template=1096568."
            r4 = 0
            r5 = 2
            r6 = 1
            java.util.concurrent.locks.ReentrantLock r7 = r10.c
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L36
            if (r2 != r5) goto L30
            a.z1x.P(r12)
            goto Lc4
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            return r4
        L36:
            long r10 = r0.i
            a.z1x.P(r12)     // Catch: java.lang.Throwable -> L3c
            goto L86
        L3c:
            r12 = move-exception
            goto L9e
        L3e:
            a.z1x.P(r12)
            a.tw90 r12 = a.vw90.f38139a
            a.tw90 r2 = a.tw90.f34640a
            if (r12 != r2) goto Lb2
            kotlin.coroutines.CoroutineContext r12 = r0.getContext()
            a.ake r2 = kotlin.coroutines.d.d1
            kotlin.coroutines.CoroutineContext$Element r12 = r12.get(r2)
            a.l7t0 r2 = a.tvk.b
            if (r12 != r2) goto Lb2
            kotlin.coroutines.CoroutineContext r12 = r0.getContext()
            a.kud r2 = a.rne.c
            kotlin.coroutines.CoroutineContext$Element r12 = r12.get(r2)
            a.rne r12 = (a.rne) r12
            if (r12 == 0) goto L66
            java.lang.String r12 = r12.b
            goto L67
        L66:
            r12 = r4
        L67:
            java.lang.String r2 = "RoomSupportSQLiteTransaction"
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r2)
            if (r12 == 0) goto Lb2
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            long r8 = r10.getId()
            r7.lock()
            r0.i = r8     // Catch: java.lang.Throwable -> L9c
            r0.l = r6     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r10 = r11.invoke(r0)     // Catch: java.lang.Throwable -> L9c
            if (r10 != r1) goto L85
            goto Lc3
        L85:
            r10 = r8
        L86:
            kotlin.Unit r12 = kotlin.Unit.f46060a     // Catch: java.lang.Throwable -> L3c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 != 0) goto L98
            r7.unlock()
            return r12
        L98:
            a.jf4.n(r3)
            return r4
        L9c:
            r12 = move-exception
            r10 = r8
        L9e:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 == 0) goto Lae
            a.jf4.n(r3)
            return r4
        Lae:
            r7.unlock()
            throw r12
        Lb2:
            a.epp r12 = new a.epp
            r2 = 20
            r12.<init>(r11, r4, r2)
            r0.l = r5
            a.k050 r10 = r10.d
            java.lang.Object r10 = a.vdx.h0(r10, r12, r0)
            if (r10 != r1) goto Lc4
        Lc3:
            return r1
        Lc4:
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qz80.a(a.gv60, a.zje):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        this.g = true;
        qpg0 qpg0Var = this.f;
        if (qpg0Var != null) {
            if (qpg0Var != null) {
                qpg0Var.close();
            } else {
                Intrinsics.h("connection");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.s1e
    public final Object m(boolean z, Function2 function2, zje zjeVar) {
        oz80 oz80Var;
        if (zjeVar instanceof oz80) {
            oz80Var = (oz80) zjeVar;
            int i = oz80Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                oz80Var.l = i - Integer.MIN_VALUE;
            } else {
                oz80Var = new oz80(this, zjeVar);
            }
        } else {
            oz80Var = new oz80(this, zjeVar);
        }
        Object obj = oz80Var.j;
        Object obj2 = wne.f39444a;
        int i2 = oz80Var.l;
        byte b = 2;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            if (this.g) {
                m2x.J(21, "Connection pool is closed");
                throw null;
            }
            nz80 nz80Var = (nz80) oz80Var.getContext().get(this.e);
            mz80 mz80Var = nz80Var != null ? nz80Var.b : null;
            if (mz80Var != null) {
                oz80Var.l = 1;
                Object objInvoke = function2.invoke(mz80Var, oz80Var);
                if (objInvoke != obj2) {
                    return objInvoke;
                }
            } else if (this.f == null) {
                gv60 gv60Var = new gv60(this, yjeVar, b);
                oz80Var.i = function2;
                oz80Var.l = 2;
                if (a(gv60Var, oz80Var) != obj2) {
                }
            }
        }
        if (i2 == 1) {
            z1x.P(obj);
            return obj;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        function2 = oz80Var.i;
        z1x.P(obj);
        due0 due0Var = this.b;
        qpg0 qpg0Var = this.f;
        if (qpg0Var == null) {
            Intrinsics.h("connection");
            throw null;
        }
        mz80 mz80Var2 = new mz80(due0Var, qpg0Var);
        nz80 nz80Var2 = new nz80(this.e, mz80Var2);
        wk70 wk70Var = new wk70(function2, mz80Var2, yjeVar, (byte) 28);
        oz80Var.i = null;
        oz80Var.l = 3;
        Object objD0 = qjj.d0(nz80Var2, wk70Var, oz80Var);
        return objD0 == obj2 ? obj2 : objD0;
    }
}
