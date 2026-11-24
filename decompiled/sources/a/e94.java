package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class e94 implements f94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f7402a;

    public e94(hjm hjmVar) {
        this.f7402a = hjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e94) && this.f7402a.equals(((e94) obj).f7402a);
    }

    public final int hashCode() {
        return this.f7402a.hashCode();
    }

    public final String toString() {
        return "AuthHistoryTitleUiModel(headerModel=" + this.f7402a + Separators.RPAREN;
    }
}
