package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class hu9 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ju9 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hu9(ju9 ju9Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ju9Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new hu9(this.k, yjeVar, (byte) 0);
            default:
                return new hu9(this.k, yjeVar, (byte) 1);
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
        return ((hu9) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ju9 ju9Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    String strC = ju9Var.b.c();
                    ok50 ok50Var = ju9Var.f17142a;
                    this.j = true;
                    obj = ((qu9) ((zm) ok50Var.f25390a).invoke()).c(strC, this);
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
                Iterable<ip9> iterable = (Iterable) ((dx5) obj).a();
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                for (ip9 ip9Var : iterable) {
                    ip9Var.getClass();
                    Integer num = ip9Var.f15151a;
                    if (num == null) {
                        jf4.k(null);
                        return null;
                    }
                    int iIntValue = num.intValue();
                    String str = ip9Var.b;
                    if (str == null) {
                        jf4.k(null);
                        return null;
                    }
                    arrayList.add(new fp9(iIntValue, str));
                }
                return arrayList;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ok50 ok50Var2 = ju9Var.f17142a;
                    knf0 knf0Var = ju9Var.b;
                    knf0Var.getClass();
                    String strA = knf0Var.a();
                    this.j = true;
                    obj = ((qu9) ((zm) ok50Var2.f25390a).invoke()).f(strA, 1, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                Iterable<et9> iterable2 = (Iterable) ((q16) obj).a();
                ArrayList arrayList2 = new ArrayList(r3d.q(iterable2, 10));
                for (et9 et9Var : iterable2) {
                    et9Var.getClass();
                    Integer num2 = et9Var.f8366a;
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    String str2 = et9Var.b;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str4 = et9Var.c;
                    if (str4 != null) {
                        str3 = str4;
                    }
                    arrayList2.add(new bt9(iIntValue2, str2, str3));
                }
                return arrayList2;
        }
    }
}
