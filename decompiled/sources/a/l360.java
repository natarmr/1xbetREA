package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class l360 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19344a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ rz50 c;

    public /* synthetic */ l360(kmq kmqVar, rz50 rz50Var, byte b) {
        this.f19344a = b;
        this.b = kmqVar;
        this.c = rz50Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        k360 k360Var;
        p360 p360Var;
        byte b = this.f19344a;
        rz50 rz50Var = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof k360) {
                    k360Var = (k360) yjeVar;
                    int i = k360Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        k360Var.j = i - Integer.MIN_VALUE;
                    } else {
                        k360Var = new k360(this, yjeVar);
                    }
                } else {
                    k360Var = new k360(this, yjeVar);
                }
                Object obj2 = k360Var.i;
                wne wneVar = wne.f39444a;
                int i2 = k360Var.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    rz50 rz50VarA = rz50.a(rz50Var, null, new kz50((List) obj), 127);
                    k360Var.j = 1;
                    if (kmqVar.a(rz50VarA, k360Var) == wneVar) {
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
            default:
                if (yjeVar instanceof p360) {
                    p360Var = (p360) yjeVar;
                    int i3 = p360Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        p360Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        p360Var = new p360(this, yjeVar);
                    }
                } else {
                    p360Var = new p360(this, yjeVar);
                }
                Object obj3 = p360Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = p360Var.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    rz50 rz50VarA2 = rz50.a(rz50Var, null, new kz50((List) obj), 127);
                    p360Var.j = 1;
                    if (kmqVar.a(rz50VarA2, p360Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
        }
    }
}
