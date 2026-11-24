package a;

/* JADX INFO: loaded from: classes2.dex */
public final class zix implements n5d0, z7z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44459a;

    public zix(Object obj) {
        this.f44459a = obj;
    }

    public static zix a(Object obj) {
        if (obj != null) {
            return new zix(obj);
        }
        hny.u("instance cannot be null");
        return null;
    }

    @Override // a.o5d0
    public final Object get() {
        return this.f44459a;
    }
}
