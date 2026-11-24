package a;

import android.gov.nist.core.LexerCore;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class k3b0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ v3b0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3b0(v3b0 v3b0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = v3b0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        v3b0 v3b0Var = this.k;
        switch (b) {
            case 0:
                return new k3b0(v3b0Var, yjeVar, (byte) 0);
            case 1:
                k3b0 k3b0Var = new k3b0(v3b0Var, yjeVar, (byte) 1);
                k3b0Var.j = ((Boolean) obj).booleanValue();
                return k3b0Var;
            default:
                return new k3b0(v3b0Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((k3b0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((k3b0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((k3b0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        v3b0 v3b0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    obj = v3b0Var.G.r(new z7b[0], this);
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
                ArrayList arrayList = ((a3b) obj).f163a;
                ArrayList<vh0> arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((vh0) obj2).f != 3) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                for (vh0 vh0Var : arrayList2) {
                    arrayList3.add(new pe40(new q4t(vh0Var.f37408a, vh0Var.b), byx.f3439a));
                }
                mo1 mo1Var = new mo1(arrayList3, (byte) 4);
                int i = v3b0.W;
                v3b0Var.H(mo1Var);
                v3b0Var.Q();
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!((u2b0) v3b0Var.D()).b && z2) {
                    v3b0Var.W();
                }
                p7m0 p7m0Var = v3b0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, u2b0.a((u2b0) value, false, z2, false, false, null, null, null, LexerCore.ID_NO_WHITESPACE)));
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    urt urtVar = v3b0Var.r;
                    tl5 tl5Var = tl5.f34128a;
                    this.j = true;
                    if (urtVar.f36180a.i(tl5Var, this) == wneVar3) {
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
        }
    }
}
