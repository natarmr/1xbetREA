package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class fjw0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Iterator f9665a;

    public fjw0(Iterator it) {
        this.f9665a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9665a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new slw0((String) this.f9665a.next());
    }
}
