package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class l0c {
    public static final k0c Companion = new k0c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0c f19193a;
    public final String b;
    public final String c;

    public /* synthetic */ l0c(int i, j0c j0cVar, String str, String str2) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, g0c.f10452a.getDescriptor());
            throw null;
        }
        this.f19193a = j0cVar;
        this.b = str;
        this.c = str2;
    }

    public l0c(long j, String str, String str2, String str3) {
        this.f19193a = new j0c(j, str);
        this.b = str2;
        this.c = str3;
    }
}
