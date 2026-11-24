package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class t7h implements gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33466a;
    public final /* synthetic */ long b;
    public final /* synthetic */ gmq c;

    public /* synthetic */ t7h(gmq gmqVar, long j, byte b) {
        this.f33466a = b;
        this.c = gmqVar;
        this.b = j;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x011b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.gmq
    public final Object c(kmq kmqVar, yje yjeVar) throws Throwable {
        q7h q7hVar;
        u7h u7hVar;
        w7h w7hVar;
        krt krtVar;
        x2z x2zVar;
        byte b = this.f33466a;
        long j = this.b;
        gmq gmqVar = this.c;
        byte b2 = 1;
        switch (b) {
            case 0:
                if (yjeVar instanceof q7h) {
                    q7hVar = (q7h) yjeVar;
                    int i = q7hVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        q7hVar.j = i - Integer.MIN_VALUE;
                    } else {
                        q7hVar = new q7h(this, yjeVar);
                    }
                } else {
                    q7hVar = new q7h(this, yjeVar);
                }
                Object obj = q7hVar.i;
                wne wneVar = wne.f39444a;
                int i2 = q7hVar.j;
                if (i2 == 0) {
                    z1x.P(obj);
                    s7h s7hVar = new s7h(kmqVar, j, (byte) 0);
                    q7hVar.j = 1;
                    if (gmqVar.c(s7hVar, q7hVar) == wneVar) {
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
                if (yjeVar instanceof u7h) {
                    u7hVar = (u7h) yjeVar;
                    int i3 = u7hVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        u7hVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        u7hVar = new u7h(this, yjeVar);
                    }
                } else {
                    u7hVar = new u7h(this, yjeVar);
                }
                Object obj2 = u7hVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = u7hVar.j;
                if (i4 == 0) {
                    z1x.P(obj2);
                    s7h s7hVar2 = new s7h(kmqVar, j, b2);
                    u7hVar.j = 1;
                    if (((rno) gmqVar).c(s7hVar2, u7hVar) == wneVar2) {
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
                if (yjeVar instanceof w7h) {
                    w7hVar = (w7h) yjeVar;
                    int i5 = w7hVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        w7hVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        w7hVar = new w7h(this, yjeVar);
                    }
                } else {
                    w7hVar = new w7h(this, yjeVar);
                }
                Object obj3 = w7hVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = w7hVar.j;
                if (i6 == 0) {
                    z1x.P(obj3);
                    s7h s7hVar3 = new s7h(kmqVar, j, (byte) 2);
                    w7hVar.j = 1;
                    if (((a1g) gmqVar).c(s7hVar3, w7hVar) == wneVar3) {
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
            case 3:
                if (yjeVar instanceof krt) {
                    krtVar = (krt) yjeVar;
                    int i7 = krtVar.j;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        krtVar.j = i7 - Integer.MIN_VALUE;
                    } else {
                        krtVar = new krt(this, yjeVar);
                    }
                } else {
                    krtVar = new krt(this, yjeVar);
                }
                Object obj4 = krtVar.i;
                wne wneVar4 = wne.f39444a;
                int i8 = krtVar.j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        z1x.P(obj4);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj4);
                s7h s7hVar4 = new s7h(kmqVar, j, (byte) 5);
                krtVar.j = 1;
                ((qoj0) gmqVar).c(s7hVar4, krtVar);
                return wneVar4;
            default:
                if (yjeVar instanceof x2z) {
                    x2zVar = (x2z) yjeVar;
                    int i9 = x2zVar.j;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        x2zVar.j = i9 - Integer.MIN_VALUE;
                    } else {
                        x2zVar = new x2z(this, yjeVar);
                    }
                } else {
                    x2zVar = new x2z(this, yjeVar);
                }
                Object obj5 = x2zVar.i;
                wne wneVar5 = wne.f39444a;
                int i10 = x2zVar.j;
                if (i10 == 0) {
                    z1x.P(obj5);
                    s7h s7hVar5 = new s7h(kmqVar, j, (byte) 6);
                    x2zVar.j = 1;
                    if (((c00) gmqVar).c(s7hVar5, x2zVar) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (i10 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
        }
    }
}
