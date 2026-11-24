package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class z4f implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43768a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ r7f c;

    public /* synthetic */ z4f(kmq kmqVar, r7f r7fVar, byte b) {
        this.f43768a = b;
        this.b = kmqVar;
        this.c = r7fVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006b  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        y4f y4fVar;
        p5f p5fVar;
        c7f c7fVar;
        byte b = this.f43768a;
        r7f r7fVar = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof y4f) {
                    y4fVar = (y4f) yjeVar;
                    int i = y4fVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        y4fVar.j = i - Integer.MIN_VALUE;
                    } else {
                        y4fVar = new y4f(this, yjeVar);
                    }
                } else {
                    y4fVar = new y4f(this, yjeVar);
                }
                Object obj2 = y4fVar.i;
                wne wneVar = wne.f39444a;
                int i2 = y4fVar.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    ql5 ql5Var = (ql5) obj;
                    if (ql5Var.f28916a != r7fVar.l.b() && ql5Var.f28916a != 0) {
                        y4fVar.j = 1;
                        if (kmqVar.a(obj, y4fVar) == wneVar) {
                            return wneVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof p5f) {
                    p5fVar = (p5f) yjeVar;
                    int i3 = p5fVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        p5fVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        p5fVar = new p5f(this, yjeVar);
                    }
                } else {
                    p5fVar = new p5f(this, yjeVar);
                }
                Object obj3 = p5fVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = p5fVar.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    if (r7fVar.N().g) {
                        p5fVar.j = 1;
                        if (kmqVar.a(obj, p5fVar) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof c7f) {
                    c7fVar = (c7f) yjeVar;
                    int i5 = c7fVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c7fVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        c7fVar = new c7f(this, yjeVar);
                    }
                } else {
                    c7fVar = new c7f(this, yjeVar);
                }
                Object obj4 = c7fVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = c7fVar.j;
                if (i6 == 0) {
                    z1x.P(obj4);
                    sw00 sw00Var = (sw00) obj;
                    if (sw00Var.f32897a && !sw00Var.b) {
                        r7fVar.e2.f(Unit.f46060a);
                    }
                    Unit unit = Unit.f46060a;
                    c7fVar.j = 1;
                    if (kmqVar.a(unit, c7fVar) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
        }
    }
}
