package a;

/* JADX INFO: loaded from: classes3.dex */
public final class m8f extends zje {
    public String i;
    public k050 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ o8f l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8f(o8f o8fVar, zje zjeVar) {
        super(zjeVar);
        this.l = o8fVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(this, null, false);
    }
}
