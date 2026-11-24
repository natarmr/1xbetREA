package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class snq implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kie0 f32506a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ kmq c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public snq(kie0 kie0Var, int i, kmq kmqVar, Object obj) {
        this.f32506a = kie0Var;
        this.b = i;
        this.c = kmqVar;
        this.d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        rnq rnqVar;
        if (yjeVar instanceof rnq) {
            rnqVar = (rnq) yjeVar;
            int i = rnqVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                rnqVar.k = i - Integer.MIN_VALUE;
            } else {
                rnqVar = new rnq(this, yjeVar);
            }
        } else {
            rnqVar = new rnq(this, yjeVar);
        }
        Object obj2 = rnqVar.i;
        wne wneVar = wne.f39444a;
        int i2 = rnqVar.k;
        if (i2 == 0) {
            z1x.P(obj2);
            kie0 kie0Var = this.f32506a;
            int i3 = kie0Var.f18333a + 1;
            kie0Var.f18333a = i3;
            byte b = this.b;
            kmq kmqVar = this.c;
            if (i3 >= b) {
                rnqVar.k = 2;
                dtb.A(kmqVar, obj, this.d, rnqVar);
                return wneVar;
            }
            rnqVar.k = 1;
            if (kmqVar.a(obj, rnqVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    z1x.P(obj2);
                    return Unit.f46060a;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
        }
        return Unit.f46060a;
    }
}
