package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pxq0 implements wxq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final plg f27765a;

    public pxq0(plg plgVar) {
        this.f27765a = plgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pxq0) && this.f27765a.equals(((pxq0) obj).f27765a);
    }

    public final int hashCode() {
        return this.f27765a.hashCode();
    }

    public final String toString() {
        return "Cyber(delegateAction=" + this.f27765a + Separators.RPAREN;
    }
}
