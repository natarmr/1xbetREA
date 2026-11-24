package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class igp implements jgp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14744a;
    public final giv b;

    public igp(String str, giv givVar) {
        givVar.getClass();
        this.f14744a = str;
        this.b = givVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igp)) {
            return false;
        }
        igp igpVar = (igp) obj;
        return this.f14744a.equals(igpVar.f14744a) && Intrinsics.d(this.b, igpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14744a.hashCode() * 31);
    }

    public final String toString() {
        return "UseCaseMissing(requiredUseCases=" + this.f14744a + ", featureRequiring=" + this.b + ')';
    }
}
