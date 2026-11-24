package a;

/* JADX INFO: loaded from: classes2.dex */
public final class vit implements x440 {
    public static final vit b = new vit(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37497a;

    public /* synthetic */ vit(byte b2) {
        this.f37497a = b2;
    }

    @Override // a.x440
    public final x9e0 a(Class cls) {
        switch (this.f37497a) {
            case 0:
                if (!jjt.class.isAssignableFrom(cls)) {
                    jf4.o("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (x9e0) jjt.k(cls.asSubclass(jjt.class)).j(3);
                } catch (Exception e) {
                    e9d0.m("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // a.x440
    public final boolean b(Class cls) {
        switch (this.f37497a) {
            case 0:
                return jjt.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
