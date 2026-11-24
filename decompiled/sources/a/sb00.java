package a;

/* JADX INFO: loaded from: classes2.dex */
public final class sb00 extends ir20 {
    public final int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb00(v9d v9dVar, y78 y78Var, int i) {
        super(y78Var, v9dVar);
        v9dVar.getClass();
        this.f = i;
    }

    @Override // a.ir20
    public final boolean a() {
        return false;
    }

    @Override // a.ir20
    public final int b(k810 k810Var) {
        return this.f;
    }

    @Override // a.ir20
    public final hr20 c(v9d v9dVar, k810 k810Var) {
        v9dVar.getClass();
        return k810Var.c < this.f ? hr20.e : hr20.f;
    }

    @Override // a.ir20
    public final ar20 d() {
        return wb.y;
    }

    @Override // a.ir20
    public final boolean f(k810 k810Var) {
        return true;
    }
}
