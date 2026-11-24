package a;

/* JADX INFO: loaded from: classes4.dex */
public final class h1p extends k1p {
    public final /* synthetic */ byte b;
    public final Float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1p(float f, byte b) {
        super(m1p.g);
        this.b = b;
        switch (b) {
            case 1:
                Float fValueOf = Float.valueOf(f);
                super(m1p.h);
                this.c = fValueOf;
                break;
            case 2:
                Float fValueOf2 = Float.valueOf(f);
                super(m1p.i);
                this.c = fValueOf2;
                break;
            default:
                Float fValueOf3 = Float.valueOf(f);
                this.c = fValueOf3;
                break;
        }
    }

    @Override // a.k1p
    public final Object a() {
        byte b = this.b;
        return this.c;
    }
}
