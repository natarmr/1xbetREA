package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wl80 implements cm80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f39341a;
    public final boolean b;

    public wl80(List list, boolean z) {
        list.getClass();
        this.f39341a = list;
        this.b = z;
    }

    @Override // a.cm80
    public final List a() {
        return this.f39341a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl80)) {
            return false;
        }
        wl80 wl80Var = (wl80) obj;
        return Intrinsics.d(this.f39341a, wl80Var.f39341a) && this.b == wl80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f39341a.hashCode() * 31);
    }

    public final String toString() {
        return "Idle(pagingItems=" + this.f39341a + ", endOfPaginationReached=" + this.b + Separators.RPAREN;
    }
}
