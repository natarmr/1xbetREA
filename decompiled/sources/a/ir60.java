package a;

import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ir60 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15242a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ bs60 c;

    public /* synthetic */ ir60(kmq kmqVar, bs60 bs60Var, byte b) {
        this.f15242a = b;
        this.b = kmqVar;
        this.c = bs60Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        hr60 hr60Var;
        nr60 nr60Var;
        byte b = this.f15242a;
        bs60 bs60Var = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof hr60) {
                    hr60Var = (hr60) yjeVar;
                    int i = hr60Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        hr60Var.j = i - Integer.MIN_VALUE;
                    } else {
                        hr60Var = new hr60(this, yjeVar);
                    }
                } else {
                    hr60Var = new hr60(this, yjeVar);
                }
                Object obj2 = hr60Var.i;
                wne wneVar = wne.f39444a;
                int i2 = hr60Var.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    Pair pair = (Pair) obj;
                    pat patVar = (pat) pair.f46059a;
                    pat patVar2 = (pat) pair.b;
                    patVar.getClass();
                    if (!(patVar instanceof kat)) {
                        patVar2.getClass();
                        if (!(patVar2 instanceof kat) && !((w370) bs60Var.D()).b) {
                            hr60Var.j = 1;
                            if (kmqVar.a(obj, hr60Var) == wneVar) {
                                return wneVar;
                            }
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
            default:
                if (yjeVar instanceof nr60) {
                    nr60Var = (nr60) yjeVar;
                    int i3 = nr60Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        nr60Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        nr60Var = new nr60(this, yjeVar);
                    }
                } else {
                    nr60Var = new nr60(this, yjeVar);
                }
                Object obj3 = nr60Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = nr60Var.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    Pair pair2 = (Pair) obj;
                    pat patVar3 = (pat) pair2.f46059a;
                    pat patVar4 = (pat) pair2.b;
                    patVar3.getClass();
                    if (!(patVar3 instanceof kat)) {
                        patVar4.getClass();
                        if (!(patVar4 instanceof kat) && !((w370) bs60Var.D()).b) {
                            nr60Var.j = 1;
                            if (kmqVar.a(obj, nr60Var) == wneVar2) {
                                return wneVar2;
                            }
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
        }
    }
}
