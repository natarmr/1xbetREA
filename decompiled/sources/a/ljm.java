package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ljm implements pjm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f20158a;
    public final d4d b;
    public final d4d c;
    public final sul d;
    public final oe9 e;
    public final sso0 f;

    public ljm() {
        d4d d4dVar = d4d.STATIC_WHITE;
        d4d d4dVar2 = d4d.STATIC_WHITE60;
        oul oulVar = oul.e;
        oe9 oe9Var = oe9.d;
        this.f20158a = d4dVar;
        this.b = d4dVar2;
        this.c = d4dVar2;
        this.d = oulVar;
        this.e = oe9Var;
        this.f = hso0.f13595a;
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
        return this.f20158a;
    }

    @Override // a.pjm
    public final oe9 d() {
        return this.e;
    }

    @Override // a.pjm
    public final sso0 e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljm)) {
            return false;
        }
        ljm ljmVar = (ljm) obj;
        return this.f20158a == ljmVar.f20158a && this.b == ljmVar.b && this.c == ljmVar.c && this.d.equals(ljmVar.d) && this.e == ljmVar.e && this.f.equals(ljmVar.f);
    }

    @Override // a.pjm
    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + dw9.b(this.c, dw9.b(this.b, this.f20158a.hashCode() * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Static(labelTint=" + this.f20158a + ", iconTint=" + this.b + ", counterTint=" + this.c + ", buttonColorType=" + this.d + ", buttonSize=" + this.e + ", tagStyle=" + this.f + ", isStatic=true)";
    }
}
