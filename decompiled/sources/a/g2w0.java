package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class g2w0 implements i2w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2w0 f10582a;

    public g2w0(d2w0 d2w0Var) {
        this.f10582a = d2w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2w0) && this.f10582a.equals(((g2w0) obj).f10582a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10582a.f5377a);
    }

    public final String toString() {
        return "Failure(exception=" + this.f10582a + ')';
    }
}
