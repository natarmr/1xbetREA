package kotlin.coroutines;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f46063a;
    public final f b;

    public b(f fVar, Function1 function1) {
        fVar.getClass();
        this.f46063a = function1;
        this.b = fVar instanceof b ? ((b) fVar).b : fVar;
    }
}
