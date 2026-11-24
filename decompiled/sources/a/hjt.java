package a;

/* JADX INFO: loaded from: classes2.dex */
public final class hjt implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f13177a;
    public final eov0 b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public hjt(int i, eov0 eov0Var, boolean z) {
        this.f13177a = i;
        this.b = eov0Var;
        this.c = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f13177a - ((hjt) obj).f13177a;
    }
}
