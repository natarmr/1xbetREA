package a;

/* JADX INFO: loaded from: classes2.dex */
public final class gxw0 extends c2 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gxw0(byte[] bArr, byte b) {
        super(bArr, (byte) 12);
        this.c = b;
    }

    @Override // a.c2
    public final lfx L(byte[] bArr, int i) {
        switch (this.c) {
            case 0:
                return new bxw0(bArr, i, (byte) 0);
            default:
                return new bxw0(bArr, i, (byte) 1);
        }
    }
}
