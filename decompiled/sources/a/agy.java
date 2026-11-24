package a;

/* JADX INFO: loaded from: classes2.dex */
public enum agy implements vlx {
    NONE(0),
    INTERNAL_TO_CLASS_ID(1),
    DESC_TO_CLASS_ID(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f848a;

    /* JADX WARN: Multi-variable type inference failed */
    agy(int i) {
        this.f848a = i;
    }

    @Override // a.vlx
    public final int a() {
        return this.f848a;
    }
}
