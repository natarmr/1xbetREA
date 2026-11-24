package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r2l0 implements g3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29741a;

    public r2l0(int i) {
        this.f29741a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2l0) && this.f29741a == ((r2l0) obj).f29741a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f29741a);
    }

    public final String toString() {
        return ua80.e(this.f29741a, "ActionIcon(actionIconResId=", Separators.RPAREN);
    }
}
