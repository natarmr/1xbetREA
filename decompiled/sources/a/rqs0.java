package a;

/* JADX INFO: loaded from: classes2.dex */
public final class rqs0 extends pqs0 {
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rqs0(byte b) {
        super((byte) 1);
        this.e = b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                int i = this.d;
                this.d = i + 2;
                Object[] objArr = this.b;
                return new oo20(objArr[i], objArr[i + 1], (byte) 0);
            case 1:
                int i2 = this.d;
                this.d = i2 + 2;
                return this.b[i2];
            default:
                int i3 = this.d;
                this.d = i3 + 2;
                return this.b[i3 + 1];
        }
    }
}
