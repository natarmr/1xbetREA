package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class osj0 {
    public static final nsj0 Companion = new nsj0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25785a;
    public final int b;
    public final int c;

    public /* synthetic */ osj0(int i, int i2, int i3, long j) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, msj0.f22323a.getDescriptor());
            throw null;
        }
        this.f25785a = j;
        this.b = i2;
        this.c = i3;
    }

    public osj0(int i, int i2, long j) {
        this.f25785a = j;
        this.b = i;
        this.c = i2;
    }
}
