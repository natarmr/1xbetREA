package a;

/* JADX INFO: loaded from: classes.dex */
public final class im80 extends km80 {
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public im80(Object obj, int i) {
        super(i);
        obj.getClass();
        this.b = obj;
    }

    @Override // a.km80
    public final Object a() {
        return this.b;
    }
}
