package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sev {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2a f32090a;
    public b0a b;

    public sev(r2a r2aVar) {
        r2aVar.getClass();
        this.f32090a = r2aVar;
    }

    public final b0a a() {
        b0a b0aVar = this.b;
        if (b0aVar != null) {
            return b0aVar;
        }
        Intrinsics.h("cameraGraph");
        throw null;
    }
}
