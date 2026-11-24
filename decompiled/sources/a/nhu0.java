package a;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nhu0 extends zzf0 implements Function2 {
    public byte j;
    public /* synthetic */ Object k;
    final /* synthetic */ View l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhu0(View view, yje yjeVar) {
        super(2, yjeVar);
        this.l = view;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        nhu0 nhu0Var = new nhu0(this.l, yjeVar);
        nhu0Var.k = obj;
        return nhu0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((nhu0) create((fgi0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            fgi0 fgi0Var = (fgi0) this.k;
            View view = this.l;
            this.k = fgi0Var;
            this.j = (byte) 1;
            fgi0Var.a(this, view);
            return wneVar;
        }
        if (b == 1) {
            fgi0 fgi0Var2 = (fgi0) this.k;
            z1x.P(obj);
            View view2 = this.l;
            if (view2 instanceof ViewGroup) {
                this.k = null;
                this.j = (byte) 2;
                fgi0Var2.getClass();
                if (fgi0Var2.c(new pls0(pym0.i((ViewGroup) view2).iterator()), this) == wneVar) {
                    return wneVar;
                }
            }
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
