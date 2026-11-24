package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class tst implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34477a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ gmq c;

    public /* synthetic */ tst(gmq gmqVar, boolean z, byte b) {
        this.f34477a = b;
        this.c = gmqVar;
        this.b = z;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        qst qstVar;
        py70 py70Var;
        byte b = this.f34477a;
        boolean z = this.b;
        gmq gmqVar = this.c;
        switch (b) {
            case 0:
                if (yjeVar instanceof qst) {
                    qstVar = (qst) yjeVar;
                    int i = qstVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        qstVar.j = i - Integer.MIN_VALUE;
                    } else {
                        qstVar = new qst(this, yjeVar);
                    }
                } else {
                    qstVar = new qst(this, yjeVar);
                }
                Object obj = qstVar.i;
                wne wneVar = wne.f39444a;
                int i2 = qstVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    sst sstVar = new sst(kmqVar, z, (byte) 0);
                    qstVar.j = 1;
                    if (((i89) gmqVar).c(sstVar, qstVar) == wneVar) {
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
            default:
                if (yjeVar instanceof py70) {
                    py70Var = (py70) yjeVar;
                    int i3 = py70Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        py70Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        py70Var = new py70(this, yjeVar);
                    }
                } else {
                    py70Var = new py70(this, yjeVar);
                }
                Object obj2 = py70Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = py70Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    sst sstVar2 = new sst(kmqVar, z, (byte) 1);
                    py70Var.j = 1;
                    if (((ltb) gmqVar).c(sstVar2, py70Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
        }
    }
}
