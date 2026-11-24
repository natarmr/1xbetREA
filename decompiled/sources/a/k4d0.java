package a;

/* JADX INFO: loaded from: classes2.dex */
public enum k4d0 implements vlx {
    WARNING(0),
    ERROR(1),
    HIDDEN(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f17664a;

    /* JADX WARN: Multi-variable type inference failed */
    k4d0(int i) {
        this.f17664a = i;
    }

    @Override // a.vlx
    public final int a() {
        return this.f17664a;
    }
}
