package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class nvk extends qvk implements xne, yje {
    public static final /* synthetic */ long h = defpackage.a.f0a.objectFieldOffset(nvk.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final lne d;
    public final zje e;
    public Object f;
    public final Object g;

    public nvk(lne lneVar, zje zjeVar) {
        super(-1);
        this.d = lneVar;
        this.e = zjeVar;
        this.f = ovk.f25929a;
        this.g = ecq0.b(zjeVar.getContext());
    }

    @Override // a.xne
    public final xne getCallerFrame() {
        return this.e;
    }

    @Override // a.yje
    public final CoroutineContext getContext() {
        return this.e.getContext();
    }

    @Override // a.qvk
    public final Object i() {
        Object obj = this.f;
        this.f = ovk.f25929a;
        return obj;
    }

    @Override // a.yje
    public final void resumeWith(Object obj) throws mvk {
        Throwable thA = j0g0.a(obj);
        Object uddVar = thA == null ? obj : new udd(thA, false);
        zje zjeVar = this.e;
        CoroutineContext context = zjeVar.getContext();
        lne lneVar = this.d;
        if (ovk.c(lneVar, context)) {
            this.f = uddVar;
            this.c = 0;
            ovk.b(lneVar, zjeVar.getContext(), this);
            return;
        }
        eeo eeoVarA = gcq0.a();
        if (eeoVarA.c >= 4294967296L) {
            this.f = uddVar;
            this.c = 0;
            eeoVarA.y(this);
            return;
        }
        eeoVarA.F(true);
        try {
            CoroutineContext context2 = zjeVar.getContext();
            Object objC = ecq0.c(context2, this.g);
            try {
                zjeVar.resumeWith(obj);
                ecq0.a(context2, objC);
                while (eeoVarA.I()) {
                }
            } catch (Throwable th) {
                ecq0.a(context2, objC);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                g(th2);
            } finally {
                eeoVarA.x(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + qjj.b0(this.e) + ']';
    }

    @Override // a.qvk
    public final yje d() {
        return this;
    }
}
