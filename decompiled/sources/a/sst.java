package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class sst implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32743a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ sst(kmq kmqVar, boolean z, byte b) {
        this.f32743a = b;
        this.b = kmqVar;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        rst rstVar;
        qy70 qy70Var;
        byte b = this.f32743a;
        boolean z = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof rst) {
                    rstVar = (rst) yjeVar;
                    int i = rstVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        rstVar.j = i - Integer.MIN_VALUE;
                    } else {
                        rstVar = new rst(this, yjeVar);
                    }
                } else {
                    rstVar = new rst(this, yjeVar);
                }
                Object obj2 = rstVar.i;
                wne wneVar = wne.f39444a;
                int i2 = rstVar.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    Boolean boolValueOf = Boolean.valueOf(z && ((Boolean) obj).booleanValue());
                    rstVar.j = 1;
                    if (kmqVar.a(boolValueOf, rstVar) == wneVar) {
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
                if (yjeVar instanceof qy70) {
                    qy70Var = (qy70) yjeVar;
                    int i3 = qy70Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        qy70Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        qy70Var = new qy70(this, yjeVar);
                    }
                } else {
                    qy70Var = new qy70(this, yjeVar);
                }
                Object obj3 = qy70Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = qy70Var.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    Boolean boolValueOf2 = Boolean.valueOf(z);
                    qy70Var.j = 1;
                    if (kmqVar.a(boolValueOf2, qy70Var) == wneVar2) {
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
