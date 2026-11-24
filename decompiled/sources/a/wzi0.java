package a;

import android.util.Log;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class wzi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f40022a;
    public final olq0 b;
    public final wbj c;
    public final AtomicReference d;

    public wzi0(CoroutineContext coroutineContext, olq0 olq0Var, wbj wbjVar) {
        coroutineContext.getClass();
        olq0Var.getClass();
        wbjVar.getClass();
        this.f40022a = coroutineContext;
        this.b = olq0Var;
        this.c = wbjVar;
        this.d = new AtomicReference();
        qjj.W(d5c.a(coroutineContext), null, null, new uzi0(this, null, (byte) 0), 3);
    }

    public final dji0 a() throws Throwable {
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            Object objU = eeq.U(kotlin.coroutines.g.f46065a, new uzi0(this, null, (byte) 1));
            while (!atomicReference.compareAndSet(null, objU) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (dji0) obj;
    }

    public final boolean b() {
        Long l = a().e;
        Integer num = a().d;
        if (l == null || num == null) {
            return true;
        }
        this.b.getClass();
        return olq0.a().c - l.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(dji0 dji0Var, zje zjeVar) {
        vzi0 vzi0Var;
        if (zjeVar instanceof vzi0) {
            vzi0Var = (vzi0) zjeVar;
            int i = vzi0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vzi0Var.k = i - Integer.MIN_VALUE;
            } else {
                vzi0Var = new vzi0(this, zjeVar);
            }
        } else {
            vzi0Var = new vzi0(this, zjeVar);
        }
        Object obj = vzi0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = vzi0Var.k;
        yje yjeVar = null;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                wbj wbjVar = this.c;
                tmg0 tmg0Var = new tmg0(dji0Var, yjeVar, (byte) 10);
                vzi0Var.k = 1;
                if (wbjVar.a(tmg0Var, vzi0Var) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
        } catch (IOException e) {
            Log.w("FirebaseSessions", "Failed to update config values: " + e);
        }
        return Unit.f46060a;
    }
}
