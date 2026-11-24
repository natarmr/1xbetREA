package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class m8j implements iqg {
    public static final l8j Companion = new l8j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8j f21373a;

    public /* synthetic */ m8j(int i, r8j r8jVar) {
        if ((i & 1) == 0) {
            this.f21373a = null;
        } else {
            this.f21373a = r8jVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8j) && Intrinsics.d(this.f21373a, ((m8j) obj).f21373a);
    }

    public final int hashCode() {
        r8j r8jVar = this.f21373a;
        if (r8jVar == null) {
            return 0;
        }
        return r8jVar.hashCode();
    }

    public final String toString() {
        return "DartsLiveGameInfoResponse(gameInfo=" + this.f21373a + Separators.RPAREN;
    }

    public m8j() {
        this.f21373a = null;
    }
}
