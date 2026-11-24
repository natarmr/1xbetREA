package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class y2r0 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ acu f41920a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ lie0 d;
    public final /* synthetic */ hie0 e;
    public final /* synthetic */ z2r0 f;

    public y2r0(acu acuVar, List list, Object obj, lie0 lie0Var, hie0 hie0Var, z2r0 z2r0Var) {
        this.f41920a = acuVar;
        this.b = list;
        this.c = obj;
        this.d = lie0Var;
        this.e = hie0Var;
        this.f = z2r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        w2r0 w2r0Var;
        if (yjeVar instanceof w2r0) {
            w2r0Var = (w2r0) yjeVar;
            int i = w2r0Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                w2r0Var.j = i - Integer.MIN_VALUE;
            } else {
                w2r0Var = new w2r0(this, yjeVar);
            }
        } else {
            w2r0Var = new w2r0(this, yjeVar);
        }
        Object obj = w2r0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = w2r0Var.j;
        if (i2 == 0) {
            z1x.P(obj);
            r6d r6dVar = new r6d(kmqVar, this.b, this.c, this.d, this.e, this.f);
            w2r0Var.j = 1;
            if (this.f41920a.c(r6dVar, w2r0Var) == wneVar) {
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
