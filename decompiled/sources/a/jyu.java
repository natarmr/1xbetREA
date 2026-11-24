package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class jyu extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ long l;
    public final /* synthetic */ ieu m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyu(long j, ieu ieuVar, String str, yje yjeVar) {
        super(2, yjeVar);
        this.l = j;
        this.m = ieuVar;
        this.n = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                jyu jyuVar = new jyu(this.m, this.l, this.n, yjeVar);
                jyuVar.k = obj;
                return jyuVar;
            default:
                jyu jyuVar2 = new jyu(this.l, this.m, this.n, yjeVar);
                jyuVar2.k = obj;
                return jyuVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((jyu) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object g0g0Var;
        Object g0g0Var2;
        byte b = this.i;
        String str = this.n;
        ieu ieuVar = this.m;
        long j = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                try {
                    if (!z) {
                        z1x.P(obj);
                        e0g0 e0g0Var = j0g0.b;
                        fzt fztVar = (fzt) ieuVar.b;
                        this.k = null;
                        this.j = true;
                        obj = fztVar.f10426a.d(j, this, str);
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
                    g0g0Var = (List) obj;
                    e0g0 e0g0Var2 = j0g0.b;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                return new j0g0(g0g0Var);
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                try {
                    if (!z2) {
                        z1x.P(obj);
                        if (j == 1) {
                            e0g0 e0g0Var4 = j0g0.b;
                            reu reuVar = (reu) ieuVar.c;
                            this.k = null;
                            this.j = true;
                            obj = ((ucb0) reuVar.b).a(str, this);
                            if (obj == wneVar2) {
                                return wneVar2;
                            }
                        } else {
                            e0g0 e0g0Var5 = j0g0.b;
                            g0g0Var2 = iun.f15405a;
                        }
                        return new j0g0(g0g0Var2);
                    }
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    g0g0Var2 = (List) obj;
                    e0g0 e0g0Var6 = j0g0.b;
                    break;
                } catch (Throwable th2) {
                    e0g0 e0g0Var7 = j0g0.b;
                    g0g0Var2 = new g0g0(th2);
                }
                return new j0g0(g0g0Var2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyu(ieu ieuVar, long j, String str, yje yjeVar) {
        super(2, yjeVar);
        this.m = ieuVar;
        this.l = j;
        this.n = str;
    }
}
