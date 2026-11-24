package a;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class km0 extends bnn0 implements Function1 {
    public boolean i;
    public final /* synthetic */ dn0 j;
    public final /* synthetic */ String k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public km0(dn0 dn0Var, String str, boolean z, boolean z2, yje yjeVar) {
        super(1, yjeVar);
        this.j = dn0Var;
        this.k = str;
        this.l = z;
        this.m = z2;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new km0(this.j, this.k, this.l, this.m, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((km0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        dn0 dn0Var = this.j;
        if (!z) {
            z1x.P(obj);
            this.i = true;
            obj = dn0Var.m(this, this.k, this.l, this.m);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        List list = (List) obj;
        xk0 xk0Var = dn0Var.c;
        xk0Var.c = false;
        list.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = xk0Var.d;
        copyOnWriteArrayList.clear();
        copyOnWriteArrayList.addAll(list);
        xk0Var.c();
        xk0Var.f41010a = true;
        return Unit.f46060a;
    }
}
