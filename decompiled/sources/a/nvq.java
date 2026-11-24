package a;

/* JADX INFO: loaded from: classes3.dex */
public final class nvq implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24199a;
    public final int b;
    public final String c;
    public final String d;

    public nvq(int i, String str, int i2, String str2) {
        str.getClass();
        str2.getClass();
        this.f24199a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        nvq nvqVar = (nvq) obj;
        nvqVar.getClass();
        int i = this.f24199a - nvqVar.f24199a;
        return i == 0 ? this.b - nvqVar.b : i;
    }
}
