package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xml0 implements zml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41132a;
    public final c1n b;
    public final c1n c;
    public final y1m d;
    public final String e;
    public final r0n f;

    public xml0(String str, c1n c1nVar, c1n c1nVar2, y1m y1mVar, String str2, r0n r0nVar) {
        str.getClass();
        this.f41132a = str;
        this.b = c1nVar;
        this.c = c1nVar2;
        this.d = y1mVar;
        this.e = str2;
        this.f = r0nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xml0)) {
            return false;
        }
        xml0 xml0Var = (xml0) obj;
        return Intrinsics.d(this.f41132a, xml0Var.f41132a) && this.b.equals(xml0Var.b) && this.c.equals(xml0Var.c) && this.d.equals(xml0Var.d) && this.e.equals(xml0Var.e) && this.f.equals(xml0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f41132a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        return "TwoOpponents(tagLive=" + this.f41132a + ", teamOneModel=" + this.b + ", teamTwoModel=" + this.c + ", scoreModel=" + this.d + ", infoLabel=" + this.e + ", options=" + this.f + Separators.RPAREN;
    }
}
