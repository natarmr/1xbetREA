package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fwj implements lin0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10263a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fwj(Object obj, byte b) {
        this.f10263a = b;
        this.b = obj;
    }

    @Override // a.lin0
    public final Object get() {
        byte b = this.f10263a;
        Object obj = this.b;
        switch (b) {
            case 0:
                try {
                    return (un30) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    itt0.o(e);
                    return null;
                }
            default:
                return (gwj) obj;
        }
    }
}
