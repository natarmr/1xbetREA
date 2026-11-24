package a;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wqy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39614a;
    public final Integer b;
    public final Set c;
    public final pcy d;

    public wqy(Set set, pcy pcyVar) {
        set.getClass();
        this.f39614a = 398591036;
        this.b = 5;
        this.c = set;
        this.d = pcyVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wqy) && ((long) this.f39614a) == ((long) ((wqy) obj).f39614a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f39614a);
    }

    public final String toString() {
        long j = this.f39614a;
        Integer num = this.b;
        if (num == null) {
            return dw9.o(j, " without alias");
        }
        return j + " with alias " + num.intValue();
    }
}
