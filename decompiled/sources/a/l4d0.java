package a;

/* JADX INFO: loaded from: classes2.dex */
public enum l4d0 implements vlx {
    LANGUAGE_VERSION(0),
    COMPILER_VERSION(1),
    API_VERSION(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f19400a;

    /* JADX WARN: Multi-variable type inference failed */
    l4d0(int i) {
        this.f19400a = i;
    }

    @Override // a.vlx
    public final int a() {
        return this.f19400a;
    }
}
