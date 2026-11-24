package a;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class krj extends jrj implements yje {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sdy f18767a;
    public Unit b;
    public yje c;
    public Object d;

    @Override // a.yje
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f46065a;
    }

    @Override // a.yje
    public final void resumeWith(Object obj) {
        this.c = null;
        this.d = obj;
    }
}
