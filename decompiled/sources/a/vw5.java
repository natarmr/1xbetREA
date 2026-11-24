package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vw5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o8f f38131a;
    public final mne b;
    public final duj c;

    public vw5(o8f o8fVar, mne mneVar, duj dujVar) {
        o8fVar.getClass();
        mneVar.getClass();
        dujVar.getClass();
        this.f38131a = o8fVar;
        this.b = mneVar;
        this.c = dujVar;
    }

    public abstract void a(sje sjeVar);

    public abstract kh3 b();

    public abstract p7m0 c();

    public List d() {
        return null;
    }

    public abstract fnf0 e();

    public final void f(Throwable th, vne vneVar) {
        th.getClass();
        vneVar.getClass();
        th.printStackTrace();
        sac.V(vneVar, uw5.f36377a, null, this.b.b, new y32((Object) this, (Object) th, (yje) null, (byte) 29), 10);
        this.c.b(th, new gh5((byte) 6));
    }

    public final void g() {
        p7m0 p7m0VarC = c();
        i8d i8dVar = i8d.c;
        p7m0VarC.getClass();
        p7m0VarC.o(null, i8dVar);
    }
}
