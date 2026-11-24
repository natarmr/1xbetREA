package a;

/* JADX INFO: loaded from: classes.dex */
public final class mil extends zn00 {
    public final /* synthetic */ zn00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mil(zn00 zn00Var) {
        super((byte) 2);
        this.c = zn00Var;
    }

    @Override // a.zn00
    public final Object K0(gb10 gb10Var) {
        Float f = (Float) ((ayj0) this.c.b);
        if (f == null) {
            return null;
        }
        return Float.valueOf(f.floatValue() * 2.55f);
    }
}
