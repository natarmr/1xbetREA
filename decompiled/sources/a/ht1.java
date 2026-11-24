package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ht1 implements ot1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jjm f13609a;

    public ht1(jjm jjmVar) {
        this.f13609a = jjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ht1) && this.f13609a.equals(((ht1) obj).f13609a);
    }

    public final int hashCode() {
        return this.f13609a.hashCode();
    }

    public final String toString() {
        return "ProvidersHeaderUiModel(model=" + this.f13609a + Separators.RPAREN;
    }
}
