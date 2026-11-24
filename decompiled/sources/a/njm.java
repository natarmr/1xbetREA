package a;

/* JADX INFO: loaded from: classes6.dex */
public final class njm implements pjm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f23643a;
    public final d4d b;
    public final d4d c;
    public final sul d;
    public final oe9 e;

    public njm(int i) {
        oe9 oe9Var = oe9.d;
        d4d d4dVar = d4d.STATIC_WHITE60;
        oul oulVar = oul.e;
        oe9Var = (i & 16) != 0 ? oe9.b : oe9Var;
        this.f23643a = d4dVar;
        this.b = d4dVar;
        this.c = d4dVar;
        this.d = oulVar;
        this.e = oe9Var;
    }

    @Override // a.pjm
    public final d4d a() {
        return this.b;
    }

    @Override // a.pjm
    public final sul b() {
        return this.d;
    }

    @Override // a.pjm
    public final d4d c() {
        return this.f23643a;
    }

    @Override // a.pjm
    public final oe9 d() {
        return this.e;
    }

    @Override // a.pjm
    public final sso0 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njm)) {
            return false;
        }
        njm njmVar = (njm) obj;
        return this.f23643a == njmVar.f23643a && this.b == njmVar.b && this.c == njmVar.c && this.d.equals(njmVar.d) && this.e == njmVar.e;
    }

    @Override // a.pjm
    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.e.hashCode() + ((this.d.hashCode() + dw9.b(this.c, dw9.b(this.b, this.f23643a.hashCode() * 31, 31), 31)) * 31)) * 961);
    }

    public final String toString() {
        return "Static(labelTint=" + this.f23643a + ", iconTint=" + this.b + ", counterTint=" + this.c + ", buttonColorType=" + this.d + ", buttonSize=" + this.e + ", tagStyle=null, isStatic=true)";
    }
}
