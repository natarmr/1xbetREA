package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class doq implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6425a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ mie0 c;

    public /* synthetic */ doq(Function2 function2, mie0 mie0Var, byte b) {
        this.f6425a = b;
        this.b = function2;
        this.c = mie0Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        coq coqVar;
        goq goqVar;
        byte b = this.f6425a;
        mie0 mie0Var = this.c;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof coq) {
                    coqVar = (coq) yjeVar;
                    int i = coqVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        coqVar.j = i - Integer.MIN_VALUE;
                    } else {
                        coqVar = new coq(this, yjeVar);
                    }
                } else {
                    coqVar = new coq(this, yjeVar);
                }
                Object objInvoke = coqVar.i;
                wne wneVar = wne.f39444a;
                int i2 = coqVar.j;
                if (i2 == 0) {
                    z1x.P(objInvoke);
                    coqVar.l = obj;
                    coqVar.j = 1;
                    objInvoke = function2.invoke(obj, coqVar);
                    if (objInvoke == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = coqVar.l;
                    z1x.P(objInvoke);
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    return Unit.f46060a;
                }
                mie0Var.f21842a = obj;
                throw new t(this);
            default:
                if (yjeVar instanceof goq) {
                    goqVar = (goq) yjeVar;
                    int i3 = goqVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        goqVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        goqVar = new goq(this, yjeVar);
                    }
                } else {
                    goqVar = new goq(this, yjeVar);
                }
                Object objInvoke2 = goqVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = goqVar.j;
                if (i4 == 0) {
                    z1x.P(objInvoke2);
                    goqVar.l = obj;
                    goqVar.j = 1;
                    objInvoke2 = function2.invoke(obj, goqVar);
                    if (objInvoke2 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = goqVar.l;
                    z1x.P(objInvoke2);
                }
                if (!((Boolean) objInvoke2).booleanValue()) {
                    return Unit.f46060a;
                }
                mie0Var.f21842a = obj;
                throw new t(this);
        }
    }
}
