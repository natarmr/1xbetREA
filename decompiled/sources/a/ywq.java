package a;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ywq extends bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f43383a;

    public ywq(AtomicReference atomicReference) {
        this.f43383a = atomicReference;
    }

    @Override // a.bo
    public final void a(Object obj) {
        bo boVar = (bo) this.f43383a.get();
        if (boVar != null) {
            boVar.a(obj);
        } else {
            jf4.n("Operation cannot be started before fragment is in created state");
        }
    }

    @Override // a.bo
    public final void b() {
        bo boVar = (bo) this.f43383a.getAndSet(null);
        if (boVar != null) {
            boVar.b();
        }
    }
}
