package a;

/* JADX INFO: loaded from: classes2.dex */
public final class sqs0 extends pqs0 {
    public final s3d e;

    public sqs0(s3d s3dVar) {
        super((byte) 0);
        this.e = s3dVar;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        this.d = i + 2;
        Object[] objArr = this.b;
        return new ly40(this.e, objArr[i], objArr[i + 1]);
    }
}
