package a;

/* JADX INFO: loaded from: classes2.dex */
public final class hh40 extends qkj {
    public boolean c;

    @Override // a.qkj
    public final chf0 b(gv90 gv90Var) {
        byte b = 12;
        if (this.c) {
            this.c = false;
            return new chf0(new nhf0(new oox(gv90Var)), b);
        }
        this.c = true;
        return new chf0(new nhf0(gv90Var), b);
    }
}
