package a;

/* JADX INFO: loaded from: classes2.dex */
public enum a3d0 implements vlx {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f166a;

    /* JADX WARN: Multi-variable type inference failed */
    a3d0(int i) {
        this.f166a = i;
    }

    @Override // a.vlx
    public final int a() {
        return this.f166a;
    }
}
