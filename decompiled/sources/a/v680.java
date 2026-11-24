package a;

/* JADX INFO: loaded from: classes2.dex */
public final class v680 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f36863a;

    public v680(Object obj) {
        if (obj != null) {
            this.f36863a = obj;
        } else {
            hny.u("value for optional is empty.");
            throw null;
        }
    }

    public final Object a() {
        Object obj = this.f36863a;
        if (obj != null) {
            return obj;
        }
        v4i0.o("No value present");
        return null;
    }

    public final boolean b() {
        return this.f36863a != null;
    }

    public v680() {
        this.f36863a = null;
    }
}
