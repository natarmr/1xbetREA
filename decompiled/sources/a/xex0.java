package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xex0 extends p4 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xex0(byte b) {
        super((byte) 16);
        this.c = b;
    }

    @Override // a.p4
    public final /* synthetic */ Object O0() {
        switch (this.c) {
            case 0:
                return new afx0();
            case 1:
                return new efx0();
            case 2:
                return new bhx0();
            default:
                return new ihx0();
        }
    }
}
