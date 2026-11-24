package a;

/* JADX INFO: loaded from: classes6.dex */
public final class ojm implements pjm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f25365a;
    public final d4d b;
    public final d4d c;
    public final sul d;
    public final oe9 e;

    public ojm(int i) {
        d4d d4dVar = d4d.SECONDARY;
        qul qulVar = qul.e;
        oe9 oe9Var = oe9.b;
        this.f25365a = d4dVar;
        this.b = d4dVar;
        this.c = d4dVar;
        this.d = qulVar;
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
        return this.f25365a;
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
        if (!(obj instanceof ojm)) {
            return false;
        }
        ojm ojmVar = (ojm) obj;
        return this.f25365a == ojmVar.f25365a && this.b == ojmVar.b && this.c == ojmVar.c && this.d.equals(ojmVar.d) && this.e == ojmVar.e;
    }

    @Override // a.pjm
    public final boolean g() {
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.e.hashCode() + ((this.d.hashCode() + dw9.b(this.c, dw9.b(this.b, this.f25365a.hashCode() * 31, 31), 31)) * 31)) * 961);
    }

    public final String toString() {
        return "Theme(labelTint=" + this.f25365a + ", iconTint=" + this.b + ", counterTint=" + this.c + ", buttonColorType=" + this.d + ", buttonSize=" + this.e + ", tagStyle=null, isStatic=false)";
    }
}
