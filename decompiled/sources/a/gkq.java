package a;

/* JADX INFO: loaded from: classes.dex */
public final class gkq implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11456a;
    public int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        gkq gkqVar = (gkq) obj;
        int i = this.b;
        int i2 = gkqVar.b;
        return i != i2 ? i - i2 : this.f11456a - gkqVar.f11456a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Order{order=");
        sb.append(this.b);
        sb.append(", index=");
        return brm0.n(sb, this.f11456a, '}');
    }
}
