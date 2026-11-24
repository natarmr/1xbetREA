package a;

/* JADX INFO: loaded from: classes2.dex */
public final class s660 extends q3k {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s660(kzj0 kzj0Var, byte b) {
        super(kzj0Var);
        this.c = b;
    }

    @Override // a.p3k, a.wsy
    public final boolean U() {
        switch (this.c) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // a.p3k
    public final p3k r0(kzj0 kzj0Var) {
        switch (this.c) {
            case 0:
                return new s660(kzj0Var, (byte) 0);
            default:
                return new s660(kzj0Var, (byte) 1);
        }
    }
}
