package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class mco0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ zco0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mco0(zco0 zco0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = zco0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zco0 zco0Var = this.l;
        switch (b) {
            case 0:
                mco0 mco0Var = new mco0(zco0Var, yjeVar, (byte) 0);
                mco0Var.k = obj;
                return mco0Var;
            case 1:
                mco0 mco0Var2 = new mco0(zco0Var, yjeVar, (byte) 1);
                mco0Var2.k = obj;
                return mco0Var2;
            case 2:
                mco0 mco0Var3 = new mco0(zco0Var, yjeVar, (byte) 2);
                mco0Var3.k = obj;
                return mco0Var3;
            case 3:
                mco0 mco0Var4 = new mco0(zco0Var, yjeVar, (byte) 3);
                mco0Var4.k = obj;
                return mco0Var4;
            default:
                mco0 mco0Var5 = new mco0(zco0Var, yjeVar, (byte) 4);
                mco0Var5.k = obj;
                return mco0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mco0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((mco0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((mco0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((mco0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mco0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Collection collection;
        Object value;
        Iterable iterable;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.i;
        zco0 zco0Var = this.l;
        switch (b) {
            case 0:
                List list = (List) this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    rn00 rn00Var = ((glb0) zco0Var.D()).p;
                    jn00 jn00Var = rn00Var instanceof jn00 ? (jn00) rn00Var : null;
                    if (jn00Var == null || (collection = (List) jn00Var.f16791a) == null) {
                        collection = iun.f15405a;
                    }
                    hjd hjdVar = (hjd) zco0Var.I.get();
                    did didVar = new did(CollectionsKt.q0(collection, list));
                    this.k = list;
                    this.j = true;
                    hjdVar.getClass();
                    if (hjdVar.a(didVar, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = zco0.r0;
                p7m0 p7m0Var = zco0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, glb0.a((glb0) value, false, false, null, null, null, null, null, null, null, null, new jn00(list), null, null, null, null, null, null, null, false, 33488895)));
                return Unit.f46060a;
            case 1:
                List list2 = (List) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    rn00 rn00Var2 = ((glb0) zco0Var.D()).q;
                    jn00 jn00Var2 = rn00Var2 instanceof jn00 ? (jn00) rn00Var2 : null;
                    if (jn00Var2 == null || (iterable = (List) jn00Var2.f16791a) == null) {
                        iterable = iun.f15405a;
                    }
                    hjd hjdVar2 = (hjd) zco0Var.I.get();
                    did didVar2 = new did(CollectionsKt.q0(list2, iterable));
                    this.k = list2;
                    this.j = true;
                    hjdVar2.getClass();
                    if (hjdVar2.a(didVar2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = zco0.r0;
                p7m0 p7m0Var2 = zco0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, glb0.a((glb0) value2, false, false, null, null, null, null, null, null, null, new jn00(list2), null, null, null, null, null, null, null, null, false, 33521663)));
                return Unit.f46060a;
            case 2:
                List list3 = (List) this.k;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    rn00 rn00Var3 = ((glb0) zco0Var.D()).r;
                    jn00 jn00Var3 = rn00Var3 instanceof jn00 ? (jn00) rn00Var3 : null;
                    Collection collection2 = jn00Var3 != null ? (List) jn00Var3.f16791a : null;
                    if (collection2 == null) {
                        collection2 = iun.f15405a;
                    }
                    ArrayList arrayListQ0 = CollectionsKt.q0(collection2, list3);
                    tjb0 tjb0Var = zco0Var.F;
                    p4l0 p4l0Var = new p4l0(arrayListQ0);
                    this.k = list3;
                    this.j = true;
                    tjb0Var.getClass();
                    if (tjb0Var.a(p4l0Var, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i3 = zco0.r0;
                p7m0 p7m0Var3 = zco0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, glb0.a((glb0) value3, false, false, null, null, null, null, null, null, null, null, null, null, new jn00(list3), null, null, null, null, null, false, 33292287)));
                return Unit.f46060a;
            case 3:
                List list4 = (List) this.k;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    rn00 rn00Var4 = ((glb0) zco0Var.D()).s;
                    jn00 jn00Var4 = rn00Var4 instanceof jn00 ? (jn00) rn00Var4 : null;
                    Iterable iterable2 = jn00Var4 != null ? (List) jn00Var4.f16791a : null;
                    if (iterable2 == null) {
                        iterable2 = iun.f15405a;
                    }
                    ArrayList arrayListQ1 = CollectionsKt.q0(list4, iterable2);
                    tjb0 tjb0Var2 = zco0Var.F;
                    p4l0 p4l0Var2 = new p4l0(arrayListQ1);
                    this.k = list4;
                    this.j = true;
                    tjb0Var2.getClass();
                    if (tjb0Var2.a(p4l0Var2, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i4 = zco0.r0;
                p7m0 p7m0Var4 = zco0Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, glb0.a((glb0) value4, false, false, null, null, null, null, null, null, null, null, null, new jn00(list4), null, null, null, null, null, null, false, 33423359)));
                return Unit.f46060a;
            default:
                kmq kmqVar = (kmq) this.k;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    ewt ewtVarM = zco0Var.q.m(zco0Var.r.a().L.c);
                    this.k = null;
                    this.j = true;
                    if (slb.Q(kmqVar, ewtVarM, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
