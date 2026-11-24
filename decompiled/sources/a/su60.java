package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class su60 implements vu60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ed50 f32808a;
    public final zva b;
    public final wwa c;
    public final rza d;
    public final l0b e;
    public final l0b f;

    public su60(ed50 ed50Var, zva zvaVar, wwa wwaVar, rza rzaVar, l0b l0bVar, l0b l0bVar2) {
        ed50Var.getClass();
        zvaVar.getClass();
        this.f32808a = ed50Var;
        this.b = zvaVar;
        this.c = wwaVar;
        this.d = rzaVar;
        this.e = l0bVar;
        this.f = l0bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su60)) {
            return false;
        }
        su60 su60Var = (su60) obj;
        return Intrinsics.d(this.f32808a, su60Var.f32808a) && Intrinsics.d(this.b, su60Var.b) && this.c.equals(su60Var.c) && this.d.equals(su60Var.d) && this.e.equals(su60Var.e) && this.f.equals(su60Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f32808a.f7602a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Content(navigationBarUiState=" + this.f32808a + ", accountUiState=" + this.b + ", card=" + this.c + ", progress=" + this.d + ", playerGames=" + this.e + ", companyGame=" + this.f + Separators.RPAREN;
    }
}
