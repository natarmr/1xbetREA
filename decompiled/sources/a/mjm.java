package a;

/* JADX INFO: loaded from: classes6.dex */
public final class mjm implements pjm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f21901a;
    public final d4d b;
    public final d4d c;
    public final sul d;
    public final oe9 e;
    public final sso0 f;

    public mjm(int i) {
        d4d d4dVar = d4d.SECONDARY;
        d4d d4dVar2 = (i & 1) != 0 ? d4d.TEXT_PRIMARY : d4dVar;
        mul mulVar = mul.e;
        oe9 oe9Var = oe9.d;
        this.f21901a = d4dVar2;
        this.b = d4dVar;
        this.c = d4dVar;
        this.d = mulVar;
        this.e = oe9Var;
        this.f = sqo0.f32639a;
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
        return this.f21901a;
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
        if (!(obj instanceof mjm)) {
            return false;
        }
        mjm mjmVar = (mjm) obj;
        return this.f21901a == mjmVar.f21901a && this.b == mjmVar.b && this.c == mjmVar.c && this.d.equals(mjmVar.d) && this.e == mjmVar.e && this.f.equals(mjmVar.f);
    }

    @Override // a.pjm
    public final boolean g() {
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + dw9.b(this.c, dw9.b(this.b, this.f21901a.hashCode() * 31, 31), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Theme(labelTint=" + this.f21901a + ", iconTint=" + this.b + ", counterTint=" + this.c + ", buttonColorType=" + this.d + ", buttonSize=" + this.e + ", tagStyle=" + this.f + ", isStatic=false)";
    }
}
