package a;

import android.os.Handler;
import android.util.Log;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qcq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vne f28496a;
    public final vne b;
    public final Executor c;
    public final lne d;
    public final Executor e;
    public final lne f;
    public final Executor g;
    public final lne h;
    public final n0o0 i;
    public final n0o0 j;

    public qcq0(vne vneVar, vne vneVar2, Executor executor, lne lneVar, Executor executor2, lne lneVar2, Executor executor3, lne lneVar3, Function0 function0, yip0 yip0Var) {
        vneVar.getClass();
        vneVar2.getClass();
        executor.getClass();
        executor2.getClass();
        executor3.getClass();
        this.f28496a = vneVar;
        this.b = vneVar2;
        this.c = executor;
        this.d = lneVar;
        this.e = executor2;
        this.f = lneVar2;
        this.g = executor3;
        this.h = lneVar3;
        this.i = maz.b(new xhl0(function0, (byte) 12));
        this.j = maz.b(new h3q0((Object) yip0Var, (byte) 10));
    }

    public final Handler a() {
        return (Handler) this.i.getValue();
    }

    public final Object b(long j, Function1 function1) {
        try {
            return eeq.U(this.d, new pcq0(this, function1, j, null));
        } catch (InterruptedException e) {
            Log.i("CXCP", "runBlockingCheckedOrNull cancelled by thread interruption", e);
            return null;
        }
    }
}
