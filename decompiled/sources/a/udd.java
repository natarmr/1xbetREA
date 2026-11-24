package a;

/* JADX INFO: loaded from: classes2.dex */
public class udd {
    public static final /* synthetic */ long b = defpackage.a.f0a.objectFieldOffset(udd.class.getDeclaredField("_handled$volatile"));
    private volatile /* synthetic */ int _handled$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f35472a;

    public udd(Throwable th, boolean z) {
        this.f35472a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f35472a + ']';
    }
}
