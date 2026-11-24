package a;

/* JADX INFO: loaded from: classes.dex */
public final class s8b extends hfn0 implements Comparable {
    public long m;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s8b s8bVar = (s8b) obj;
        if (m(4) != s8bVar.m(4)) {
            return m(4) ? 1 : -1;
        }
        long j = this.i - s8bVar.i;
        if (j == 0) {
            j = this.m - s8bVar.m;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
