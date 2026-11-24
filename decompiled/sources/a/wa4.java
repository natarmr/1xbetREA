package a;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class wa4 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ u8i j;
    public final /* synthetic */ Fragment k;
    public final /* synthetic */ int l;
    public final /* synthetic */ ViewGroup m;
    public final /* synthetic */ Function1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa4(u8i u8iVar, Fragment fragment, int i, ViewGroup viewGroup, Function1 function1, yje yjeVar) {
        super(2, yjeVar);
        this.j = u8iVar;
        this.k = fragment;
        this.l = i;
        this.m = viewGroup;
        this.n = function1;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new wa4(this.j, this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((wa4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            kd30 kd30Var = this.j.J;
            Function1 function1 = this.n;
            wc2 wc2Var = new wc2(function1, (byte) 9);
            zk2 zk2Var = new zk2(function1, (byte) 25);
            zk2 zk2Var2 = new zk2(function1, (byte) 26);
            this.i = true;
            if (kd30Var.O(this.k, this.l, this.m, wc2Var, zk2Var, zk2Var2, this) == wneVar) {
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
    }
}
