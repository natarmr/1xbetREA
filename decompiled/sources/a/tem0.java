package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tem0 implements wem0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33828a;

    public tem0(String str) {
        this.f33828a = str;
    }

    @Override // a.wem0
    public final fko0 a() {
        return qek0.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tem0) && this.f33828a.equals(((tem0) obj).f33828a);
    }

    public final int hashCode() {
        return qek0.c.hashCode() + (this.f33828a.hashCode() * 31);
    }

    public final String toString() {
        return "Image(image=" + this.f33828a + ", tableItemTypeColored=" + qek0.c + Separators.RPAREN;
    }
}
