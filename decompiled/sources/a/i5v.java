package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class i5v implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nnt f14212a;
    public final /* synthetic */ j5v b;
    public final /* synthetic */ qmu0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    public i5v(nnt nntVar, j5v j5vVar, qmu0 qmu0Var, String str, boolean z) {
        this.f14212a = nntVar;
        this.b = j5vVar;
        this.c = qmu0Var;
        this.d = str;
        this.e = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        f5v f5vVar;
        if (yjeVar instanceof f5v) {
            f5vVar = (f5v) yjeVar;
            int i = f5vVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                f5vVar.j = i - Integer.MIN_VALUE;
            } else {
                f5vVar = new f5v(this, yjeVar);
            }
        } else {
            f5vVar = new f5v(this, yjeVar);
        }
        Object obj = f5vVar.i;
        wne wneVar = wne.f39444a;
        int i2 = f5vVar.j;
        if (i2 == 0) {
            z1x.P(obj);
            h5v h5vVar = new h5v(kmqVar, this.b, this.c, this.d, this.e);
            f5vVar.j = 1;
            if (this.f14212a.c(h5vVar, f5vVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
