package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hmu extends zje {
    public jmu i;
    public /* synthetic */ Object j;
    public final /* synthetic */ imu k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmu(imu imuVar, zje zjeVar) {
        super(zjeVar);
        this.k = imuVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
