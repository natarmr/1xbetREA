package a;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h8f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j8f f12622a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ h8f(j8f j8fVar, long j, String str) {
        this.f12622a = j8fVar;
        this.b = j;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        j8f j8fVar = this.f12622a;
        return ((aaf) j8fVar.o.c).a(new tx9(j8fVar, this.b, this.c));
    }
}
