package a;

/* JADX INFO: loaded from: classes2.dex */
public final class kdy extends t2 {
    public final mcy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdy(vby vbyVar, mcy mcyVar, String str) {
        super(vbyVar, str);
        vbyVar.getClass();
        mcyVar.getClass();
        this.f = mcyVar;
        this.f33193a.add("primitive");
    }

    @Override // a.t2
    public final mcy F(String str) {
        str.getClass();
        if (str == "primitive") {
            return this.f;
        }
        jf4.o("This input can only handle primitives with 'primitive' tag");
        return null;
    }

    @Override // a.t2
    public final mcy T() {
        return this.f;
    }

    @Override // a.bld
    public final int f(ugi0 ugi0Var) {
        ugi0Var.getClass();
        return 0;
    }
}
