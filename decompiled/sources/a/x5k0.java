package a;

import android.javax.sip.SipListener;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class x5k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r6k0 f40323a;
    public final String b;
    public final jt2 c;
    public final AtomicReference d;
    public final AtomicReference e;
    public final sje f;
    public c4m0 g;
    public final g090 h;
    public final pox i;

    public x5k0(r6k0 r6k0Var, String str, jt2 jt2Var) {
        r6k0Var.getClass();
        str.getClass();
        jt2Var.getClass();
        this.f40323a = r6k0Var;
        this.b = str;
        this.c = jt2Var;
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.d = new AtomicReference(new y5k0(null, null, null, false, false, false, 0, "", "", 0, lunVar, "", "", "", null, null, null, 0, -1, false, false));
        this.e = new AtomicReference(null);
        rwj rwjVar = tvk.f34603a;
        dvj dvjVar = dvj.c;
        kin0 kin0VarE = qem0.e();
        dvjVar.getClass();
        this.f = d5c.a(kotlin.coroutines.e.c(dvjVar, kin0VarE));
        r6k0Var.getClass();
        g090 g090Var = new g090();
        g090Var.f10448a = r6k0Var;
        g090Var.b = new AtomicLong(System.currentTimeMillis());
        this.h = g090Var;
        this.i = new pox(r6k0Var);
    }

    public final void a() {
        AtomicReference atomicReference = this.d;
        SipListener sipListener = ((y5k0) atomicReference.get()).c;
        if (sipListener != null) {
            try {
                this.f40323a.f().removeSipListener(sipListener);
            } catch (Exception unused) {
            }
        }
        atomicReference.getAndUpdate(new w5k0((byte) 1));
        this.e.set(null);
    }
}
