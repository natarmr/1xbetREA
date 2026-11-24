package a;

import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jcj extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public /* synthetic */ boolean k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ int m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcj(int i, yje yjeVar, pzu pzuVar, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.l = pzuVar;
        this.k = z;
        this.m = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        int i = this.m;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                jcj jcjVar = new jcj((ncj) obj2, i, yjeVar, (byte) 0);
                jcjVar.k = ((Boolean) obj).booleanValue();
                return jcjVar;
            case 1:
                jcj jcjVar2 = new jcj((ncj) obj2, i, yjeVar, (byte) 1);
                jcjVar2.k = ((Boolean) obj).booleanValue();
                return jcjVar2;
            default:
                return new jcj(i, yjeVar, (pzu) obj2, this.k);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((jcj) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((jcj) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((jcj) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ef  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        boolean z;
        g7m0 jae0Var;
        boolean z2;
        boolean z3;
        Object obj2;
        int iHashCode;
        pzu pzuVar;
        List list;
        byte b = this.i;
        Object obj3 = this.l;
        boolean z4 = "call to 'resume' before 'invoke' with coroutine";
        int iIntValue = this.m;
        switch (b) {
            case 0:
                ncj ncjVar = (ncj) obj3;
                wne wneVar = wne.f39444a;
                byte b2 = this.j;
                try {
                    if (b2 == 0) {
                        z1x.P(obj);
                        boolean z5 = this.k;
                        this.k = z5;
                        this.j = (byte) 1;
                        obj = ncjVar.h(z5, this);
                        z4 = z5;
                        if (obj == wneVar) {
                            return wneVar;
                        }
                    } else {
                        if (b2 != 1) {
                            if (b2 != 2) {
                                jf4.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z = this.k;
                            th = (Throwable) this.n;
                            z1x.P(obj);
                            iIntValue = ((Number) obj).intValue();
                            th = th;
                            z4 = z;
                            jae0Var = new jae0(iIntValue, th);
                            z2 = z4;
                            return new Pair(jae0Var, Boolean.valueOf(z2));
                        }
                        boolean z6 = this.k;
                        z1x.P(obj);
                        z4 = z6;
                    }
                    jae0Var = (g7m0) obj;
                    z2 = z4;
                    break;
                } catch (Throwable th2) {
                    th = th2;
                    if (z4 != 0) {
                        mlx mlxVarC = ncjVar.c();
                        this.n = th;
                        this.k = z4;
                        this.j = (byte) 2;
                        Object objA = mlxVarC.a(this);
                        if (objA != wneVar) {
                            obj = objA;
                            th = th;
                            z = z4 ? 1 : 0;
                        }
                        return wneVar;
                    }
                }
                return new Pair(jae0Var, Boolean.valueOf(z2));
            case 1:
                ncj ncjVar2 = (ncj) obj3;
                wne wneVar2 = wne.f39444a;
                byte b3 = this.j;
                if (b3 == 0) {
                    z1x.P(obj);
                    z3 = this.k;
                    this.k = z3;
                    this.j = (byte) 1;
                    obj = ((vzp) ncjVar2.j.getValue()).a(new y0g(3, (yje) null, (byte) 11), this);
                    if (obj != wneVar2) {
                    }
                    return wneVar2;
                }
                if (b3 == 1) {
                    z3 = this.k;
                    z1x.P(obj);
                } else {
                    if (b3 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.n;
                    z1x.P(obj);
                }
                iIntValue = ((Number) obj).intValue();
                obj = obj2;
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new naj(iHashCode, iIntValue, obj);
                if (z3) {
                    mlx mlxVarC2 = ncjVar2.c();
                    this.n = obj;
                    this.j = (byte) 2;
                    Object objA2 = mlxVarC2.a(this);
                    if (objA2 != wneVar2) {
                        Object obj4 = obj;
                        obj = objA2;
                        obj2 = obj4;
                        iIntValue = ((Number) obj).intValue();
                        obj = obj2;
                    }
                    return wneVar2;
                }
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new naj(iHashCode, iIntValue, obj);
            default:
                wne wneVar3 = wne.f39444a;
                byte b4 = this.j;
                if (b4 == 0) {
                    z1x.P(obj);
                    pzu pzuVar2 = (pzu) obj3;
                    if (this.k) {
                        abu abuVar = (abu) pzuVar2.b;
                        this.n = pzuVar2;
                        this.j = (byte) 1;
                        pyu pyuVar = (pyu) abuVar.b;
                        Serializable serializableC = ((w5z) pyuVar.f27815a).C(((k7u) abuVar.c).f17841a.b(), iIntValue, this);
                        if (serializableC != wneVar3) {
                            obj = serializableC;
                            pzuVar = pzuVar2;
                            list = (List) obj;
                        }
                    } else {
                        ieu ieuVar = (ieu) pzuVar2.f27863a;
                        this.n = pzuVar2;
                        this.j = (byte) 2;
                        bzu bzuVar = (bzu) ieuVar.b;
                        Serializable serializableB = ((w5z) bzuVar.b).B(((k7u) ieuVar.c).f17841a.b(), iIntValue, this);
                        if (serializableB != wneVar3) {
                            obj = serializableB;
                            pzuVar = pzuVar2;
                            list = (List) obj;
                        }
                    }
                    return wneVar3;
                }
                if (b4 == 1) {
                    pzuVar = (pzu) this.n;
                    z1x.P(obj);
                    list = (List) obj;
                } else {
                    if (b4 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pzuVar = (pzu) this.n;
                    z1x.P(obj);
                    list = (List) obj;
                }
                pzuVar.getClass();
                return pzu.C(list);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jcj(ncj ncjVar, int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = ncjVar;
        this.m = i;
    }
}
