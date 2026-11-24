package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class hwt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function1 f13782a;

    public abstract void a(fhl fhlVar);

    public Function1 b() {
        return this.f13782a;
    }

    public final void c() {
        Function1 function1B = b();
        if (function1B != null) {
            function1B.invoke(this);
        }
    }

    public void d(t3t t3tVar) {
        this.f13782a = t3tVar;
    }
}
