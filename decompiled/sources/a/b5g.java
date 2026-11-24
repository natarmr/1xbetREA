package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class b5g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ p5a k;
    public final /* synthetic */ clz l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5g(p5a p5aVar, clz clzVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        switch (b) {
            case 1:
                lkz lkzVar = lkz.f20223a;
                this.k = p5aVar;
                this.l = clzVar;
                super(2, yjeVar);
                break;
            case 2:
                lkz lkzVar2 = lkz.f20223a;
                this.k = p5aVar;
                this.l = clzVar;
                super(2, yjeVar);
                break;
            case 3:
                lkz lkzVar3 = lkz.f20223a;
                this.k = p5aVar;
                this.l = clzVar;
                super(2, yjeVar);
                break;
            case 4:
                lkz lkzVar4 = lkz.f20223a;
                this.k = p5aVar;
                this.l = clzVar;
                super(2, yjeVar);
                break;
            case 5:
                lkz lkzVar5 = lkz.f20223a;
                this.k = p5aVar;
                this.l = clzVar;
                super(2, yjeVar);
                break;
            case 6:
                lkz lkzVar6 = lkz.f20223a;
                this.k = p5aVar;
                this.l = clzVar;
                super(2, yjeVar);
                break;
            default:
                lkz lkzVar7 = lkz.f20223a;
                this.k = p5aVar;
                this.l = clzVar;
                break;
        }
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        clz clzVar = this.l;
        p5a p5aVar = this.k;
        switch (b) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new b5g(p5aVar, clzVar, yjeVar, (byte) 0);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new b5g(p5aVar, clzVar, yjeVar, (byte) 1);
            case 2:
                lkz lkzVar3 = lkz.f20223a;
                return new b5g(p5aVar, clzVar, yjeVar, (byte) 2);
            case 3:
                lkz lkzVar4 = lkz.f20223a;
                return new b5g(p5aVar, clzVar, yjeVar, (byte) 3);
            case 4:
                lkz lkzVar5 = lkz.f20223a;
                return new b5g(p5aVar, clzVar, yjeVar, (byte) 4);
            case 5:
                lkz lkzVar6 = lkz.f20223a;
                return new b5g(p5aVar, clzVar, yjeVar, (byte) 5);
            default:
                lkz lkzVar7 = lkz.f20223a;
                return new b5g(p5aVar, clzVar, yjeVar, (byte) 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((b5g) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        clz clzVar = this.l;
        p5a p5aVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B(p5aVar, clzVar.x(), lkz.e);
                    this.j = true;
                    if (slb.N(bq9VarB, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    bq9 bq9VarB2 = hkb.B(p5aVar, clzVar.x(), lkz.e);
                    this.j = true;
                    if (slb.N(bq9VarB2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    bq9 bq9VarB3 = hkb.B(p5aVar, clzVar.x(), lkz.d);
                    this.j = true;
                    if (slb.N(bq9VarB3, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    bq9 bq9VarB4 = hkb.B(p5aVar, clzVar.x(), lkz.e);
                    this.j = true;
                    if (slb.N(bq9VarB4, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    bq9 bq9VarB5 = hkb.B(p5aVar, clzVar.x(), lkz.e);
                    this.j = true;
                    if (slb.N(bq9VarB5, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    bq9 bq9VarB6 = hkb.B(p5aVar, clzVar.x(), lkz.d);
                    this.j = true;
                    if (slb.N(bq9VarB6, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    bq9 bq9VarB7 = hkb.B(p5aVar, clzVar.x(), lkz.e);
                    this.j = true;
                    if (slb.N(bq9VarB7, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
