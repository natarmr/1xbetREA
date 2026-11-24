package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ob00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f24953a;
    public final String b;
    public final CharSequence c;

    public ob00(j jVar, String str, String str2) {
        this.f24953a = jVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob00)) {
            return false;
        }
        ob00 ob00Var = (ob00) obj;
        return this.f24953a.equals(ob00Var.f24953a) && this.b.equals(ob00Var.b) && Intrinsics.d(this.c, ob00Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f24953a.hashCode() * 31)) * 31;
        CharSequence charSequence = this.c;
        return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return "LinkInfo(node=" + this.f24953a + ", destination=" + ((Object) this.b) + ", title=" + ((Object) this.c) + ')';
    }
}
