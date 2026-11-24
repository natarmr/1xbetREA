package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class zq0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kmq f44785a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public zq0(kmq kmqVar, long j, boolean z) {
        this.f44785a = kmqVar;
        this.b = j;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        yq0 yq0Var;
        if (yjeVar instanceof yq0) {
            yq0Var = (yq0) yjeVar;
            int i = yq0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                yq0Var.j = i - Integer.MIN_VALUE;
            } else {
                yq0Var = new yq0(this, yjeVar);
            }
        } else {
            yq0Var = new yq0(this, yjeVar);
        }
        Object obj2 = yq0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = yq0Var.j;
        if (i2 == 0) {
            z1x.P(obj2);
            mi1 mi1VarY = oja0.Y(this.b, ((dp0) ((dx5) obj).a()).f6437a, this.c);
            yq0Var.j = 1;
            if (this.f44785a.a(mi1VarY, yq0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
        }
        return Unit.f46060a;
    }
}
