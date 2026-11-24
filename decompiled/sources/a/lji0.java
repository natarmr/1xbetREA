package a;

/* JADX INFO: loaded from: classes2.dex */
public final class lji0 implements m5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20153a;
    public final Object b;

    public /* synthetic */ lji0(Object obj, byte b) {
        this.f20153a = b;
        this.b = obj;
    }

    public static lji0 a(Object obj) {
        if (obj != null) {
            return new lji0(obj, (byte) 2);
        }
        hny.u("instance cannot be null");
        return null;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f20153a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new kji0((vji0) ((m5d0) obj).get());
            case 1:
                return new vmi0((gpj0) ((m5d0) obj).get());
            default:
                return obj;
        }
    }
}
