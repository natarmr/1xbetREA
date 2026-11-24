package a;

/* JADX INFO: loaded from: classes.dex */
public final class el80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f7986a;
    public final byte b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public el80(int i, int i2, int i3) {
        this.f7986a = i;
        this.b = i2;
        this.c = i3;
        if (i2 != 0) {
            return;
        }
        jf4.o("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        throw null;
    }
}
