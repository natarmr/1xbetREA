package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class vje extends xje {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jiy f37523a;

    public vje(jiy jiyVar) {
        this.f37523a = jiyVar;
    }

    @Override // a.xje
    public final jiy a(List list) {
        list.getClass();
        return this.f37523a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vje) && ((vje) obj).f37523a.equals(this.f37523a);
    }

    public final int hashCode() {
        return this.f37523a.hashCode();
    }
}
