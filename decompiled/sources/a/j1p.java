package a;

/* JADX INFO: loaded from: classes4.dex */
public final class j1p extends k1p {
    public final /* synthetic */ byte b;
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1p(String str, byte b) {
        super(m1p.f21019a);
        this.b = b;
        str.getClass();
        switch (b) {
            case 1:
                super(m1p.b);
                this.c = str;
                break;
            case 2:
                super(m1p.c);
                this.c = str;
                break;
            default:
                this.c = str;
                break;
        }
    }

    @Override // a.k1p
    public final Object a() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.c;
    }
}
