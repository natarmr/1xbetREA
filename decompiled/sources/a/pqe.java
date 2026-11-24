package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class pqe extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ uqe k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pqe(uqe uqeVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = uqeVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        uqe uqeVar = this.k;
        switch (b) {
            case 0:
                return new pqe(uqeVar, yjeVar, (byte) 0);
            case 1:
                return new pqe(uqeVar, yjeVar, (byte) 1);
            case 2:
                return new pqe(uqeVar, yjeVar, (byte) 2);
            default:
                return new pqe(uqeVar, yjeVar, (byte) 3);
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
        }
        return ((pqe) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objC;
        int i;
        boolean zBooleanValue;
        Object objB;
        Object objW0;
        byte b = this.i;
        uqe uqeVar = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                xqe xqeVar = uqeVar.f36115a;
                this.j = true;
                Serializable serializableA = xqeVar.a(this);
                return serializableA == wneVar ? wneVar : serializableA;
            case 1:
                knf0 knf0Var = uqeVar.d;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    lsn lsnVar = uqeVar.c;
                    knf0Var.getClass();
                    knf0Var.getClass();
                    knf0Var.getClass();
                    int iB = knf0Var.b();
                    String strC = knf0Var.c();
                    this.j = true;
                    objC = ((qlt) ((wgn) lsnVar.f20589a).invoke()).c("application/vnd.xenvelop+json", 1, 1357, 22, iB, strC, this);
                    if (objC == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objC = obj;
                }
                Collection collection = (Collection) ((dx5) objC).a();
                if (collection.isEmpty()) {
                    jf4.k(null);
                    return null;
                }
                Collection<s52> collection2 = collection;
                ArrayList arrayList = new ArrayList(r3d.q(collection2, 10));
                for (s52 s52Var : collection2) {
                    s52Var.getClass();
                    Integer num = s52Var.f31634a;
                    int iIntValue = num != null ? num.intValue() : -1;
                    String str = s52Var.b;
                    if (str == null) {
                        str = "";
                    }
                    Integer num2 = s52Var.c;
                    int iIntValue2 = num2 != null ? num2.intValue() : -1;
                    Integer num3 = s52Var.d;
                    int iIntValue3 = num3 != null ? num3.intValue() : -1;
                    Boolean bool = s52Var.e;
                    if (bool != null) {
                        i = iIntValue2;
                        zBooleanValue = bool.booleanValue();
                    } else {
                        i = iIntValue2;
                        zBooleanValue = false;
                    }
                    arrayList.add(new p52(iIntValue, str, i, iIntValue3, zBooleanValue));
                }
                ukt uktVar = uqeVar.b;
                uktVar.getClass();
                uktVar.c.addAll(arrayList);
                return arrayList;
            case 2:
                knf0 knf0Var2 = uqeVar.d;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    lsn lsnVar2 = uqeVar.c;
                    String strC2 = knf0Var2.c();
                    knf0Var2.getClass();
                    knf0Var2.getClass();
                    knf0Var2.getClass();
                    this.j = true;
                    objB = ((qlt) ((wgn) lsnVar2.f20589a).invoke()).b(strC2, 1, 1357, 22, this);
                    if (objB == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                Iterable<gm90> iterable = (Iterable) ((q16) objB).a();
                ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                for (gm90 gm90Var : iterable) {
                    gm90Var.getClass();
                    Integer num4 = gm90Var.f11532a;
                    if (num4 == null) {
                        jf4.k(null);
                        return null;
                    }
                    int iIntValue4 = num4.intValue();
                    Integer num5 = gm90Var.b;
                    int iIntValue5 = num5 != null ? num5.intValue() : 0;
                    Integer num6 = gm90Var.c;
                    int iIntValue6 = num6 != null ? num6.intValue() : 0;
                    String str2 = gm90Var.d;
                    if (str2 == null) {
                        jf4.k(null);
                        return null;
                    }
                    arrayList2.add(new cm90(iIntValue4, iIntValue5, iIntValue6, str2));
                }
                return arrayList2;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    xqe xqeVar2 = uqeVar.f36115a;
                    this.j = true;
                    objW0 = sj3.w0(this, xqeVar2.c().f23955a, new f1e(2, yjeVar, (byte) 5), true, false);
                    if (objW0 == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objW0 = obj;
                }
                return Boolean.valueOf(((Number) objW0).longValue() != 0);
        }
    }
}
