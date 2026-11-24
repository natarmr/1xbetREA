package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yk40 implements bl40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa30 f42771a;

    public final boolean equals(Object obj) {
        if (obj instanceof yk40) {
            return this.f42771a.equals(((yk40) obj).f42771a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42771a.hashCode();
    }

    public final String toString() {
        return "SendGameMatchInfoSideEffect(value=" + this.f42771a + Separators.RPAREN;
    }
}
