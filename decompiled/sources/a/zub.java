package a;

/* JADX INFO: loaded from: classes2.dex */
public final class zub extends sub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45001a;
    public boolean b;
    public int c;

    public zub(char c, char c2) {
        this.f45001a = c2;
        boolean z = c <= c2;
        this.b = z;
        this.c = z ? c : c2;
    }

    @Override // a.sub
    public final char a() {
        int i = this.c;
        if (i != this.f45001a) {
            this.c = i + 1;
        } else {
            if (!this.b) {
                itt0.a();
                return (char) 0;
            }
            this.b = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b;
    }
}
