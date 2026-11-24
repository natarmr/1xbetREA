package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class bo2 {
    public static final ao2 Companion = new ao2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f2911a;
    public final p380 b;
    public final p380 c;

    public /* synthetic */ bo2(int i, Long l, p380 p380Var, p380 p380Var2) {
        if ((i & 1) == 0) {
            this.f2911a = null;
        } else {
            this.f2911a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = p380Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = p380Var2;
        }
    }
}
