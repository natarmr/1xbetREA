package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sf2 implements gg2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f32098a;

    public final boolean equals(Object obj) {
        if (obj instanceof sf2) {
            return this.f32098a.equals(((sf2) obj).f32098a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32098a.hashCode();
    }

    public final String toString() {
        return vqd.m("DelegateAction(delegateAction=", this.f32098a, Separators.RPAREN);
    }
}
