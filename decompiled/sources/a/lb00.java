package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class lb00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f19733a;
    public final CharSequence b;
    public final CharSequence c;

    public lb00(j jVar, CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        this.f19733a = jVar;
        this.b = charSequence;
        this.c = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb00)) {
            return false;
        }
        lb00 lb00Var = (lb00) obj;
        return this.f19733a.equals(lb00Var.f19733a) && Intrinsics.d(this.b, lb00Var.b) && Intrinsics.d(this.c, lb00Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f19733a.hashCode() * 31)) * 31;
        CharSequence charSequence = this.c;
        return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "RenderInfo(label=" + this.f19733a + ", destination=" + ((Object) this.b) + ", title=" + ((Object) this.c) + ')';
    }
}
