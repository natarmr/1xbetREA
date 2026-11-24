package a;

/* JADX INFO: loaded from: classes2.dex */
public final class wit implements y440 {
    public static final wit b = new wit(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39235a;

    public /* synthetic */ wit(byte b2) {
        this.f39235a = b2;
    }

    @Override // a.y440
    public final y9e0 a(Class cls) {
        switch (this.f39235a) {
            case 0:
                if (!kjt.class.isAssignableFrom(cls)) {
                    jf4.o("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (y9e0) kjt.k(cls.asSubclass(kjt.class)).j(3);
                } catch (Exception e) {
                    e9d0.m("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // a.y440
    public final boolean b(Class cls) {
        switch (this.f39235a) {
            case 0:
                return kjt.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
