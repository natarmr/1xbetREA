package a;

/* JADX INFO: loaded from: classes5.dex */
public final class cpu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pru f4766a;
    public final lbu b;

    public cpu(pru pruVar, lbu lbuVar) {
        this.f4766a = pruVar;
        this.b = lbuVar;
    }

    public final boolean a() {
        return this.f4766a.a().l.q && !this.b.j();
    }
}
