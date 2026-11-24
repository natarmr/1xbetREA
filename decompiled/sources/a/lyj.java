package a;

/* JADX INFO: loaded from: classes.dex */
public final class lyj implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20864a;
    public final boolean b;

    public lyj(androidx.media3.common.b bVar, int i) {
        this.f20864a = (bVar.e & 1) != 0;
        this.b = j16.n(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        lyj lyjVar = (lyj) obj;
        return gdd.f11100a.c(this.b, lyjVar.b).c(this.f20864a, lyjVar.f20864a).e();
    }
}
