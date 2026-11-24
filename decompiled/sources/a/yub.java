package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yub implements Iterable, khy {
    public static final xub c = new xub(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f43260a;
    public final char b;

    public yub(char c2, char c3) {
        this.f43260a = c2;
        this.b = (char) g8x.J(c2, c3, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zub(this.f43260a, this.b);
    }
}
