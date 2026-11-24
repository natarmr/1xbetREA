package a;

/* JADX INFO: loaded from: classes.dex */
public final class hjv0 implements gjv0 {
    public final String b;
    public final tdx c;
    public final tdx d;

    public hjv0(String str) {
        this.b = str;
        this.c = new tdx(str);
        this.d = new tdx(str.concat(" maximum"));
    }

    public final String toString() {
        return this.b;
    }
}
