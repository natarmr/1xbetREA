package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class mgo0 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21752a;
    public final /* synthetic */ gmq b;

    public /* synthetic */ mgo0(gmq gmqVar, byte b) {
        this.f21752a = b;
        this.b = gmqVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        kgo0 kgo0Var;
        dio0 dio0Var;
        p6w0 p6w0Var;
        byte b = this.f21752a;
        gmq gmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof kgo0) {
                    kgo0Var = (kgo0) yjeVar;
                    int i = kgo0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        kgo0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        kgo0Var = new kgo0(this, yjeVar);
                    }
                } else {
                    kgo0Var = new kgo0(this, yjeVar);
                }
                Object obj = kgo0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = kgo0Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    d8n0 d8n0Var = new d8n0(kmqVar, (byte) 14);
                    kgo0Var.j = 1;
                    if (((qgo0) gmqVar).c(d8n0Var, kgo0Var) == wneVar) {
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
            case 1:
                if (yjeVar instanceof dio0) {
                    dio0Var = (dio0) yjeVar;
                    int i3 = dio0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        dio0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        dio0Var = new dio0(this, yjeVar);
                    }
                } else {
                    dio0Var = new dio0(this, yjeVar);
                }
                Object obj2 = dio0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = dio0Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    d8n0 d8n0Var2 = new d8n0(kmqVar, (byte) 16);
                    dio0Var.j = 1;
                    if (((qgo0) gmqVar).c(d8n0Var2, dio0Var) == wneVar2) {
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
            case 2:
                Object objC = ((zj2) gmqVar).c(new ofv0(kmqVar, (byte) 2), yjeVar);
                return objC == wne.f39444a ? objC : Unit.f46060a;
            default:
                if (yjeVar instanceof p6w0) {
                    p6w0Var = (p6w0) yjeVar;
                    int i5 = p6w0Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        p6w0Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        p6w0Var = new p6w0(this, yjeVar);
                    }
                } else {
                    p6w0Var = new p6w0(this, yjeVar);
                }
                Object obj3 = p6w0Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = p6w0Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    ofv0 ofv0Var = new ofv0(kmqVar, (byte) 7);
                    p6w0Var.j = 1;
                    if (((mz40) gmqVar).c(ofv0Var, p6w0Var) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
        }
    }
}
