package a;

/* JADX INFO: loaded from: classes.dex */
public final class r5v0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29907a;
    public final n5v0 b;

    public r5v0(int i, n5v0 n5v0Var) {
        this.f29907a = i;
        this.b = n5v0Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f29907a, ((r5v0) obj).f29907a);
    }
}
