package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class f2u implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gmq f8831a;
    public final /* synthetic */ fhj b;
    public final /* synthetic */ c5g c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public f2u(gmq gmqVar, fhj fhjVar, c5g c5gVar, long j, long j2) {
        this.f8831a = gmqVar;
        this.b = fhjVar;
        this.c = c5gVar;
        this.d = j;
        this.e = j2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        c2u c2uVar;
        if (yjeVar instanceof c2u) {
            c2uVar = (c2u) yjeVar;
            int i = c2uVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2uVar.j = i - Integer.MIN_VALUE;
            } else {
                c2uVar = new c2u(this, yjeVar);
            }
        } else {
            c2uVar = new c2u(this, yjeVar);
        }
        Object obj = c2uVar.i;
        wne wneVar = wne.f39444a;
        int i2 = c2uVar.j;
        if (i2 == 0) {
            z1x.P(obj);
            e2u e2uVar = new e2u(kmqVar, this.b, this.c, this.d, this.e, (byte) 0);
            c2uVar.j = 1;
            if (this.f8831a.c(e2uVar, c2uVar) == wneVar) {
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
