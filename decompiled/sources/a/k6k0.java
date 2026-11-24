package a;

import android.javax.sip.ClientTransaction;
import android.javax.sip.Dialog;
import android.javax.sip.SipProvider;
import android.javax.sip.message.Request;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class k6k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r6k0 f17776a;
    public final t6k0 b;
    public final x5k0 c;
    public final ukg0 d;
    public final v34 e;
    public final u24 f;
    public final tn30 g;
    public final r1e h;
    public final jt2 i;
    public final qoj0 j;
    public final qoj0 k;
    public final sje l;
    public c4m0 m;
    public c4m0 n;
    public c4m0 o;
    public c4m0 p;
    public c4m0 q;
    public c4m0 r;
    public t5k0 s;
    public final AtomicBoolean t;
    public final AtomicInteger u;

    public k6k0(r6k0 r6k0Var, t6k0 t6k0Var, x5k0 x5k0Var, ukg0 ukg0Var, v34 v34Var, u24 u24Var, tn30 tn30Var, r1e r1eVar, jt2 jt2Var) {
        r6k0Var.getClass();
        t6k0Var.getClass();
        x5k0Var.getClass();
        ukg0Var.getClass();
        v34Var.getClass();
        u24Var.getClass();
        tn30Var.getClass();
        r1eVar.getClass();
        jt2Var.getClass();
        this.f17776a = r6k0Var;
        this.b = t6k0Var;
        this.c = x5k0Var;
        this.d = ukg0Var;
        this.e = v34Var;
        this.f = u24Var;
        this.g = tn30Var;
        this.h = r1eVar;
        this.i = jt2Var;
        qoj0 qoj0VarB = roj0.b(0, 16, null, 5);
        this.j = qoj0VarB;
        this.k = qoj0VarB;
        rwj rwjVar = tvk.f34603a;
        dvj dvjVar = dvj.c;
        kin0 kin0VarE = qem0.e();
        dvjVar.getClass();
        this.l = d5c.a(kotlin.coroutines.e.c(dvjVar, kin0VarE));
        this.t = new AtomicBoolean(false);
        this.u = new AtomicInteger(0);
    }

    public final void a() {
        t5k0 t5k0Var = this.s;
        yje yjeVar = null;
        this.s = null;
        this.u.incrementAndGet();
        c();
        c4m0 c4m0Var = this.m;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.o;
        boolean z = c4m0Var2 != null;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        this.o = null;
        if (z) {
            this.t.set(false);
        }
        c4m0 c4m0Var3 = this.p;
        if (c4m0Var3 != null) {
            c4m0Var3.cancel(null);
        }
        this.p = null;
        c4m0 c4m0Var4 = this.q;
        if (c4m0Var4 != null) {
            c4m0Var4.cancel(null);
        }
        this.q = null;
        x5k0 x5k0Var = this.c;
        c4m0 c4m0Var5 = x5k0Var.g;
        if (c4m0Var5 != null) {
            c4m0Var5.cancel(null);
        }
        x5k0Var.g = null;
        AtomicReference atomicReference = x5k0Var.d;
        r6k0 r6k0Var = x5k0Var.f40323a;
        if (r6k0Var.d != null) {
            try {
                ClientTransaction clientTransaction = ((y5k0) atomicReference.get()).b;
                if (clientTransaction != null && !((y5k0) atomicReference.get()).f) {
                    Request requestCreateCancel = clientTransaction.createCancel();
                    requestCreateCancel.getClass();
                    ClientTransaction newClientTransaction = r6k0Var.f().getNewClientTransaction(requestCreateCancel);
                    newClientTransaction.getClass();
                    newClientTransaction.sendRequest();
                    x5k0Var.c.f17078a.a("cancelSent", "CANCEL sent");
                }
            } catch (Exception unused) {
            }
        }
        x5k0Var.a();
        t6k0 t6k0Var = this.b;
        AtomicReference atomicReference2 = t6k0Var.f;
        r6k0 r6k0Var2 = t6k0Var.f33421a;
        if (r6k0Var2.d != null) {
            try {
                t6k0Var.g.set(false);
                SipProvider sipProviderF = r6k0Var2.f();
                s6k0 s6k0Var = t6k0Var.h;
                if (s6k0Var != null) {
                    sipProviderF.removeSipListener(s6k0Var);
                }
                t6k0Var.h = null;
                String strB = r6k0.b();
                long j = t6k0Var.i + 1;
                t6k0Var.i = j;
                ClientTransaction newClientTransaction2 = sipProviderF.getNewClientTransaction(t6k0Var.e.i(t6k0Var.j, t6k0Var.k, strB, t6k0Var.l, j, t6k0Var.m, t6k0Var.n, 0));
                newClientTransaction2.getClass();
                newClientTransaction2.sendRequest();
                t6k0Var.c.f17078a.a("unregisterSent", "UNREGISTER sent");
            } catch (Exception unused2) {
            }
            atomicReference2.set(null);
        } else {
            atomicReference2.set(null);
        }
        c4m0 c4m0Var6 = this.r;
        if (c4m0Var6 != null) {
            c4m0Var6.cancel(null);
        }
        this.r = qjj.W(this.l, dvj.c, null, new z8b0(this, yjeVar, (byte) 21), 2);
        if (t5k0Var != null) {
            b(b6k0.f2059a);
        }
    }

    public final void b(g6k0 g6k0Var) {
        if (this.t.get()) {
            return;
        }
        this.j.g(g6k0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        this.n = qjj.W(this.l, null, null, new h6k0(this, 0 == true ? 1 : 0, (byte) 0), 3);
        x5k0 x5k0Var = this.c;
        AtomicReference atomicReference = x5k0Var.d;
        r6k0 r6k0Var = x5k0Var.f40323a;
        if (r6k0Var.d != null) {
            try {
                Dialog dialog = ((y5k0) atomicReference.get()).f42052a;
                if (dialog != null) {
                    Dialog dialog2 = ((y5k0) atomicReference.get()).d ? dialog : null;
                    if (dialog2 != null) {
                        Request requestCreateRequest = dialog2.createRequest("BYE");
                        requestCreateRequest.getClass();
                        ClientTransaction newClientTransaction = r6k0Var.f().getNewClientTransaction(requestCreateRequest);
                        newClientTransaction.getClass();
                        atomicReference.getAndUpdate(new w5k0((byte) 0));
                        dialog2.sendRequest(newClientTransaction);
                        x5k0Var.c.f17078a.a("byeSent", "BYE sent");
                    }
                }
            } catch (Exception unused) {
            }
        }
        x5k0Var.a();
    }

    public final void d(Exception exc) {
        this.t.set(false);
        String simpleName = exc.getClass().getSimpleName();
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        this.i.f17078a.a("callFailed", kng0.l(simpleName, ": ", message));
        b(d6k0.f5553a);
    }

    public final void e(t5k0 t5k0Var) {
        t5k0Var.getClass();
        a();
        this.s = t5k0Var;
        int iIncrementAndGet = this.u.incrementAndGet();
        yje yjeVar = null;
        h6k0 h6k0Var = new h6k0(this, yjeVar, (byte) 1);
        sje sjeVar = this.l;
        this.p = qjj.W(sjeVar, null, null, h6k0Var, 3);
        this.m = qjj.W(sjeVar, null, null, new gc1((Object) this, (Object) t5k0Var, iIncrementAndGet, yjeVar, (byte) 20), 3);
    }
}
