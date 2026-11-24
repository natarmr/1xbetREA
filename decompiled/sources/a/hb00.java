package a;

/* JADX INFO: loaded from: classes2.dex */
public final class hb00 extends b4e {
    public final String g;
    public final String h;

    public hb00(String str, String str2) {
        this.g = str;
        this.h = str2;
    }

    @Override // a.b4e
    public final void a(dgu dguVar) {
        dguVar.H(this);
    }

    @Override // a.b4e
    public final String i() {
        return "destination=" + this.g + ", title=" + this.h;
    }
}
