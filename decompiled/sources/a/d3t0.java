package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class d3t0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5422a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ d3t0(kmq kmqVar, Function1 function1, byte b) {
        this.f5422a = b;
        this.b = kmqVar;
        this.c = function1;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        c3t0 c3t0Var;
        f3t0 f3t0Var;
        byte b = this.f5422a;
        Function1 function1 = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof c3t0) {
                    c3t0Var = (c3t0) yjeVar;
                    int i = c3t0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c3t0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        c3t0Var = new c3t0(this, yjeVar);
                    }
                } else {
                    c3t0Var = new c3t0(this, yjeVar);
                }
                Object obj2 = c3t0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = c3t0Var.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    Object objInvoke = function1.invoke(obj);
                    c3t0Var.j = 1;
                    if (kmqVar.a(objInvoke, c3t0Var) == wneVar) {
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
                if (yjeVar instanceof f3t0) {
                    f3t0Var = (f3t0) yjeVar;
                    int i3 = f3t0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        f3t0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        f3t0Var = new f3t0(this, yjeVar);
                    }
                } else {
                    f3t0Var = new f3t0(this, yjeVar);
                }
                Object obj3 = f3t0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = f3t0Var.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    Object objInvoke2 = function1.invoke(obj);
                    f3t0Var.j = 1;
                    if (kmqVar.a(objInvoke2, f3t0Var) == wneVar2) {
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
