package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xit implements z440 {
    public static final xit b = new xit(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40962a;

    public /* synthetic */ xit(byte b2) {
        this.f40962a = b2;
    }

    @Override // a.z440
    public final z9e0 a(Class cls) {
        switch (this.f40962a) {
            case 0:
                if (!mjt.class.isAssignableFrom(cls)) {
                    jf4.o("Unsupported message type: ".concat(cls.getName()));
                    return null;
                }
                try {
                    return (z9e0) mjt.d(cls.asSubclass(mjt.class)).c(3);
                } catch (Exception e) {
                    e9d0.m("Unable to get message info for ".concat(cls.getName()), e);
                    return null;
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // a.z440
    public final boolean b(Class cls) {
        switch (this.f40962a) {
            case 0:
                return mjt.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
