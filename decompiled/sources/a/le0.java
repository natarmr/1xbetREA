package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class le0 implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19879a;
    public final /* synthetic */ eu4 b;

    public /* synthetic */ le0(eu4 eu4Var, byte b) {
        this.f19879a = b;
        this.b = eu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) {
        je0 je0Var;
        rz0 rz0Var;
        qo1 qo1Var;
        nos nosVar;
        byte b = this.f19879a;
        eu4 eu4Var = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof je0) {
                    je0Var = (je0) yjeVar;
                    int i = je0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        je0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        je0Var = new je0(this, yjeVar);
                    }
                } else {
                    je0Var = new je0(this, yjeVar);
                }
                Object obj = je0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = je0Var.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    ua uaVar = new ua(kmqVar, (byte) 8);
                    je0Var.j = 1;
                    if (eu4Var.c(uaVar, je0Var) == wneVar) {
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
                if (yjeVar instanceof rz0) {
                    rz0Var = (rz0) yjeVar;
                    int i3 = rz0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        rz0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        rz0Var = new rz0(this, yjeVar);
                    }
                } else {
                    rz0Var = new rz0(this, yjeVar);
                }
                Object obj2 = rz0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = rz0Var.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    ua uaVar2 = new ua(kmqVar, (byte) 13);
                    rz0Var.j = 1;
                    if (eu4Var.c(uaVar2, rz0Var) == wneVar2) {
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
                if (yjeVar instanceof qo1) {
                    qo1Var = (qo1) yjeVar;
                    int i5 = qo1Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        qo1Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        qo1Var = new qo1(this, yjeVar);
                    }
                } else {
                    qo1Var = new qo1(this, yjeVar);
                }
                Object obj3 = qo1Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = qo1Var.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    ua uaVar3 = new ua(kmqVar, (byte) 17);
                    qo1Var.j = 1;
                    if (eu4Var.c(uaVar3, qo1Var) == wneVar3) {
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
            default:
                if (yjeVar instanceof nos) {
                    nosVar = (nos) yjeVar;
                    int i7 = nosVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        nosVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        nosVar = new nos(this, yjeVar);
                    }
                } else {
                    nosVar = new nos(this, yjeVar);
                }
                Object obj4 = nosVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = nosVar.j;
                if (i8 == 0) {
                    z1x.P(obj4);
                    uap uapVar = new uap(kmqVar, (byte) 18);
                    nosVar.j = 1;
                    if (eu4Var.c(uapVar, nosVar) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (i8 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
        }
    }
}
