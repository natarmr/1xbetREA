package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import org.xplatform.feed.topgamesbystat.presentation.params.TopGamesByStatBottomSheetScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class kco0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zco0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kco0(zco0 zco0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = zco0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zco0 zco0Var = this.k;
        switch (b) {
            case 0:
                kco0 kco0Var = new kco0(zco0Var, yjeVar, (byte) 0);
                kco0Var.j = obj;
                return kco0Var;
            case 1:
                kco0 kco0Var2 = new kco0(zco0Var, yjeVar, (byte) 1);
                kco0Var2.j = obj;
                return kco0Var2;
            case 2:
                kco0 kco0Var3 = new kco0(zco0Var, yjeVar, (byte) 2);
                kco0Var3.j = obj;
                return kco0Var3;
            case 3:
                kco0 kco0Var4 = new kco0(zco0Var, yjeVar, (byte) 3);
                kco0Var4.j = obj;
                return kco0Var4;
            case 4:
                kco0 kco0Var5 = new kco0(zco0Var, yjeVar, (byte) 4);
                kco0Var5.j = obj;
                return kco0Var5;
            case 5:
                kco0 kco0Var6 = new kco0(zco0Var, yjeVar, (byte) 5);
                kco0Var6.j = obj;
                return kco0Var6;
            case 6:
                kco0 kco0Var7 = new kco0(zco0Var, yjeVar, (byte) 6);
                kco0Var7.j = obj;
                return kco0Var7;
            default:
                kco0 kco0Var8 = new kco0(zco0Var, yjeVar, (byte) 7);
                kco0Var8.j = obj;
                return kco0Var8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((kco0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((kco0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((kco0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((kco0) create((skb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((kco0) create((x5r0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((kco0) create((IndexedValue) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((kco0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((kco0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        List list;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        qnf0 qnf0Var;
        Object value6;
        Object value7;
        Object value8;
        byte b = this.i;
        zco0 zco0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                List list2 = (List) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = zco0.r0;
                p7m0 p7m0Var = zco0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, glb0.a((glb0) value, false, false, null, null, null, null, null, null, null, null, null, null, null, null, new jn00(list2), null, null, null, false, 32505855)));
                rn00 rn00Var = ((glb0) zco0Var.D()).t;
                jn00 jn00Var = rn00Var instanceof jn00 ? (jn00) rn00Var : null;
                list = jn00Var != null ? (List) jn00Var.f16791a : null;
                if (list == null) {
                    list = iun.f15405a;
                }
                i3t0.B(zco0Var, zco0Var.L, new yfj[]{new rfj(CollectionsKt.q0(list, list2))});
                break;
            case 1:
                List list3 = (List) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = zco0.r0;
                p7m0 p7m0Var2 = zco0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, glb0.a((glb0) value2, false, false, null, null, null, null, null, null, null, null, null, null, null, new jn00(list3), null, null, null, null, false, 33030143)));
                rn00 rn00Var2 = ((glb0) zco0Var.D()).u;
                jn00 jn00Var2 = rn00Var2 instanceof jn00 ? (jn00) rn00Var2 : null;
                list = jn00Var2 != null ? (List) jn00Var2.f16791a : null;
                if (list == null) {
                    list = iun.f15405a;
                }
                i3t0.B(zco0Var, zco0Var.L, new yfj[]{new rfj(CollectionsKt.q0(list3, list))});
                break;
            case 2:
                List list4 = (List) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i3 = zco0.r0;
                p7m0 p7m0Var3 = zco0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, glb0.a((glb0) value3, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, new jn00(list4), null, null, false, 31457279)));
                break;
            case 3:
                skb0 skb0Var = (skb0) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i4 = zco0.r0;
                p7m0 p7m0Var4 = zco0Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, glb0.a((glb0) value4, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, skb0Var, false, 25165823)));
                break;
            case 4:
                x5r0 x5r0Var = (x5r0) obj2;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (x5r0Var.f40332a) {
                    nas nasVar = x5r0Var.b;
                    int i5 = zco0.r0;
                    if (nasVar != null) {
                        iun iunVar = iun.f15405a;
                        long j = nasVar.f23205a;
                        long j2 = nasVar.x;
                        Long l = nasVar.w;
                        long jLongValue = l != null ? l.longValue() : 0L;
                        s9m0 s9m0Var = v5r0.b;
                        zco0Var.G(new elb0(new TopGamesByStatBottomSheetScreenParams(j, j2, jLongValue, "popular_sport", iunVar, true)));
                    }
                }
                break;
            case 5:
                IndexedValue indexedValue = (IndexedValue) obj2;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                int i6 = indexedValue.f46061a;
                boolean zBooleanValue = ((Boolean) indexedValue.b).booleanValue();
                int i7 = zco0.r0;
                ocj ocjVar = zco0Var.i;
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                } while (!p7m0Var5.m(value5, glb0.a((glb0) value5, false, zBooleanValue, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554423)));
                if (((glb0) zco0Var.D()).f11483a) {
                    qnf0Var = qnf0.f29025a;
                } else if (i6 == 0) {
                    qnf0Var = qnf0.b;
                } else if (zBooleanValue) {
                    qnf0Var = qnf0.c;
                }
                p7m0 p7m0Var6 = ocjVar.f25029a;
                do {
                    value6 = p7m0Var6.getValue();
                    value6.getClass();
                } while (!p7m0Var6.m(value6, glb0.a((glb0) value6, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554430)));
                if (qnf0Var == qnf0.c) {
                    v3c.N(zco0Var.k0);
                }
                zco0Var.R(qnf0Var);
                break;
            case 6:
                List list5 = (List) obj2;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                int i8 = zco0.r0;
                p7m0 p7m0Var7 = zco0Var.i.f25029a;
                do {
                    value7 = p7m0Var7.getValue();
                    value7.getClass();
                } while (!p7m0Var7.m(value7, glb0.a((glb0) value7, false, false, null, null, null, null, null, new jn00(list5), null, null, null, null, null, null, null, null, null, null, false, 33546239)));
                break;
            default:
                Throwable th = (Throwable) obj2;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                th.printStackTrace();
                int i9 = zco0.r0;
                p7m0 p7m0Var8 = zco0Var.i.f25029a;
                do {
                    value8 = p7m0Var8.getValue();
                    value8.getClass();
                } while (!p7m0Var8.m(value8, glb0.a((glb0) value8, false, false, null, null, null, null, null, new gn00(th), null, null, null, null, null, null, null, null, null, null, false, 33546239)));
                break;
        }
        return Unit.f46060a;
    }
}
