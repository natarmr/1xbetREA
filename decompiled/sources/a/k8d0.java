package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k8d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17867a;
    public final rdt b;
    public final pt0 c;

    public k8d0(String str, rdt rdtVar, pt0 pt0Var) {
        str.getClass();
        pt0Var.getClass();
        this.f17867a = str;
        this.b = rdtVar;
        this.c = pt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8d0)) {
            return false;
        }
        k8d0 k8d0Var = (k8d0) obj;
        return Intrinsics.d(this.f17867a, k8d0Var.f17867a) && this.b.equals(k8d0Var.b) && this.c == k8d0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f17867a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PublisherGamesUIState(title=" + this.f17867a + ", gamesUiState=" + this.b + ", gameCardCollectionType=" + this.c + Separators.RPAREN;
    }
}
