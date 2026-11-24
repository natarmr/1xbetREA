package a;

/* JADX INFO: loaded from: classes2.dex */
public final class mfx extends c2 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mfx(byte[] bArr, byte b) {
        super(bArr, (byte) 10);
        this.c = b;
    }

    @Override // a.c2
    public final lfx w(byte[] bArr, int i) {
        switch (this.c) {
            case 0:
                return new kfx(bArr, i, (byte) 0);
            default:
                return new kfx(bArr, i, (byte) 1);
        }
    }
}
