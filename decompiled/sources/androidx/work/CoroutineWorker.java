package androidx.work;

import a.aoe;
import a.dby;
import a.og00;
import a.q0x;
import a.wu9;
import a.yje;
import a.zne;
import a.zvw;
import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "La/og00;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a/zne", "work-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class CoroutineWorker extends og00 {
    public final WorkerParameters e;
    public final zne f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = zne.c;
    }

    @Override // a.og00
    public final wu9 a() {
        dby dbyVarG = zvw.g();
        zne zneVar = this.f;
        zneVar.getClass();
        return q0x.N(e.c(zneVar, dbyVarG), new aoe(this, null, (byte) 0));
    }

    @Override // a.og00
    public final wu9 b() {
        zne zneVar = zne.c;
        CoroutineContext coroutineContext = this.f;
        if (Intrinsics.d(coroutineContext, zneVar)) {
            coroutineContext = this.e.d;
        }
        coroutineContext.getClass();
        return q0x.N(coroutineContext.plus(zvw.g()), new aoe(this, null, (byte) 1));
    }

    public abstract Object c(yje yjeVar);

    public Object d() {
        throw new IllegalStateException("Not implemented");
    }
}
