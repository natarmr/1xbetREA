package a;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class o6m0 implements lpj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24744a;

    public o6m0(long j) {
        this.f24744a = j;
        if (j >= 0) {
            return;
        }
        c99.s(axq.h(j, "replayExpiration(", " ms) cannot be negative"));
        throw null;
    }

    @Override // a.lpj0
    public final gmq b(w6n0 w6n0Var) {
        return i120.W(new fnq(aoq.c(w6n0Var, new n6m0(this, null)), new tri0(2, null, (byte) 12), (byte) 1));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o6m0) && this.f24744a == ((o6m0) obj).f24744a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24744a) + (Long.hashCode(0L) * 31);
    }

    public final String toString() {
        lc00 lc00Var = new lc00(2);
        long j = this.f24744a;
        if (j < Long.MAX_VALUE) {
            lc00Var.add("replayExpiration=" + j + "ms");
        }
        return axq.m(new StringBuilder("SharingStarted.WhileSubscribed("), CollectionsKt.b0(kotlin.collections.a.a(lc00Var), null, null, null, null, 63), ')');
    }
}
