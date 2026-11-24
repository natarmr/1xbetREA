package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class zaq extends bnn0 implements Function1 {
    public final /* synthetic */ byte i = 0;
    public byte j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaq(zpu zpuVar, int i, yje yjeVar) {
        super(1, yjeVar);
        this.m = zpuVar;
        this.k = i;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.m;
        switch (b) {
            case 0:
                return new zaq((ebq) obj, yjeVar);
            default:
                return new zaq((zpu) obj, this.k, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((zaq) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objD0;
        List list;
        Object value;
        Object next;
        int i;
        int i2;
        List list2;
        int i3;
        Object objD1;
        Object value2;
        sar0 sar0Var;
        byte b = this.i;
        Object obj2 = this.m;
        byte b2 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                ebq ebqVar = (ebq) obj2;
                wne wneVar = wne.f39444a;
                byte b3 = this.j;
                if (b3 == 0) {
                    z1x.P(obj);
                    i1u i1uVar = ebqVar.p;
                    this.j = (byte) 1;
                    h7q h7qVar = i1uVar.f14018a;
                    objD0 = qjj.d0(h7qVar.f.b, new f7q(h7qVar, null), this);
                    if (objD0 != wneVar) {
                    }
                    return wneVar;
                }
                if (b3 == 1) {
                    z1x.P(obj);
                    objD0 = obj;
                } else {
                    if (b3 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = this.k;
                    list2 = (List) this.l;
                    z1x.P(obj);
                }
                list = list2;
                i2 = i3;
                abu abuVar = ebqVar.y;
                ocq ocqVar = ocq.f25039a;
                abuVar.getClass();
                h7q h7qVar2 = (h7q) abuVar.b;
                int id = ((uzc) abuVar.c).b().getId();
                h7qVar2.getClass();
                ebqVar.c0 = ebqVar.J(new fnq(bkb.h0(1L, TimeUnit.SECONDS, new d7q(h7qVar2, i2, 10, id, null)), new l21(ebqVar, i2, list, (yje) null), (byte) 4), ebqVar.x.b, new pop(1, ebqVar, ebq.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 17));
                return Unit.f46060a;
                list = (List) objD0;
                if (list.isEmpty()) {
                    int i4 = ebq.f0;
                    ebqVar.G(caq.f4024a);
                    p7m0 p7m0Var = ebqVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        ebqVar.f.getClass();
                    } while (!p7m0Var.m(value, oaq.a((oaq) value, null, false, null, null, null, null, null, false, true, 0, null, false, 3711)));
                } else {
                    if (((oaq) ebqVar.D()).c == null) {
                        i = ((gcq) CollectionsKt.U(list)).f11074a;
                    } else {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                int i5 = ((gcq) next).f11074a;
                                Integer num = ((oaq) ebqVar.D()).c;
                                if (num != null && i5 == num.intValue()) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        gcq gcqVar = (gcq) next;
                        i = gcqVar != null ? gcqVar.f11074a : ((gcq) CollectionsKt.U(list)).f11074a;
                    }
                    ebqVar.b0.b(i);
                    c4m0 c4m0Var = ebqVar.c0;
                    if (c4m0Var != null) {
                        this.l = list;
                        this.k = i;
                        this.j = (byte) 2;
                        if (zvw.H(c4m0Var, this) != wneVar) {
                            list2 = list;
                            i3 = i;
                            list = list2;
                            i2 = i3;
                        }
                        return wneVar;
                    }
                    i2 = i;
                    abu abuVar2 = ebqVar.y;
                    ocq ocqVar2 = ocq.f25039a;
                    abuVar2.getClass();
                    h7q h7qVar3 = (h7q) abuVar2.b;
                    int id2 = ((uzc) abuVar2.c).b().getId();
                    h7qVar3.getClass();
                    ebqVar.c0 = ebqVar.J(new fnq(bkb.h0(1L, TimeUnit.SECONDS, new d7q(h7qVar3, i2, 10, id2, null)), new l21(ebqVar, i2, list, (yje) null), (byte) 4), ebqVar.x.b, new pop(1, ebqVar, ebq.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 17));
                }
                return Unit.f46060a;
            default:
                zpu zpuVar = (zpu) obj2;
                wne wneVar2 = wne.f39444a;
                byte b4 = this.j;
                if (b4 == 0) {
                    z1x.P(obj);
                    dhm0 dhm0Var = (dhm0) zpuVar.b;
                    int i6 = this.k;
                    this.j = (byte) 1;
                    objD1 = qjj.d0(dhm0Var.f6098a.b, new chm0(dhm0Var, i6, yjeVar, b2), this);
                    if (objD1 != wneVar2) {
                    }
                    return wneVar2;
                }
                if (b4 != 1) {
                    if (b4 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l3r0 l3r0Var = (l3r0) this.l;
                    z1x.P(obj);
                    return l3r0Var;
                }
                z1x.P(obj);
                objD1 = obj;
                l3r0 l3r0Var2 = (l3r0) objD1;
                l3r0Var2.getClass();
                h3r0 h3r0Var = l3r0Var2.b;
                List list3 = h3r0Var.b;
                List list4 = h3r0Var.f12400a;
                int i7 = 10;
                ArrayList arrayList = new ArrayList(r3d.q(list4, 10));
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    u3r0 u3r0Var = (u3r0) it2.next();
                    List list5 = u3r0Var.c;
                    list5.getClass();
                    list3.getClass();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it3 = list5.iterator();
                    while (it3.hasNext()) {
                        Iterator it4 = ((qaa0) it3.next()).b.iterator();
                        while (it4.hasNext()) {
                            Integer intOrNull = StringsKt.toIntOrNull(((efm0) it4.next()).f7726a);
                            if (intOrNull != null) {
                                linkedHashSet.add(intOrNull);
                            }
                        }
                    }
                    int iA = wp20.a(r3d.q(list3, i7));
                    if (iA < 16) {
                        iA = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                    for (Object obj3 : list3) {
                        linkedHashMap.put(Integer.valueOf(((c3r0) obj3).f3693a), obj3);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it5 = linkedHashSet.iterator();
                    while (it5.hasNext()) {
                        int iIntValue = ((Number) it5.next()).intValue();
                        c3r0 c3r0Var = (c3r0) linkedHashMap.get(Integer.valueOf(iIntValue));
                        w8r0 w8r0Var = c3r0Var != null ? new w8r0(iIntValue, c3r0Var.b) : null;
                        if (w8r0Var != null) {
                            arrayList2.add(w8r0Var);
                        }
                    }
                    String str = u3r0Var.f35013a;
                    int i8 = u3r0Var.b;
                    List list6 = u3r0Var.c;
                    List list7 = l3r0Var2.f19373a;
                    list6.getClass();
                    list7.getClass();
                    int iA2 = wp20.a(r3d.q(list7, i7));
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
                    for (Object obj4 : list7) {
                        linkedHashMap2.put(((z8a0) obj4).f43958a, obj4);
                    }
                    ArrayList arrayList3 = new ArrayList(r3d.q(list6, 10));
                    Iterator it6 = list6.iterator();
                    while (it6.hasNext()) {
                        qaa0 qaa0Var = (qaa0) it6.next();
                        String str2 = qaa0Var.f28386a;
                        List list8 = qaa0Var.b;
                        z8a0 z8a0Var = (z8a0) linkedHashMap2.get(str2);
                        if (z8a0Var == null) {
                            z8a0Var = z8a0.g;
                        }
                        Iterator it7 = it2;
                        String str3 = z8a0Var.f43958a;
                        String str4 = z8a0Var.b;
                        int i9 = z8a0Var.c;
                        String str5 = z8a0Var.d;
                        zqe zqeVar = z8a0Var.e;
                        String str6 = z8a0Var.f;
                        Iterator it8 = it6;
                        jo20 jo20Var = new jo20(list8.size());
                        Iterator it9 = list8.iterator();
                        while (it9.hasNext()) {
                            efm0 efm0Var = (efm0) it9.next();
                            Iterator it10 = it9;
                            Integer intOrNull2 = StringsKt.toIntOrNull(efm0Var.f7726a);
                            if (intOrNull2 != null) {
                                jo20Var.put(new kcm0(intOrNull2.intValue()), efm0Var.b);
                            }
                            it9 = it10;
                            str6 = str6;
                        }
                        arrayList3.add(new x8r0(str3, false, str4, i9, str5, zqeVar, str6, jo20Var.b()));
                        it2 = it7;
                        it6 = it8;
                    }
                    arrayList.add(new tcr0(str, i8, arrayList2, arrayList3));
                    i7 = 10;
                }
                oar0 oar0Var = ((dhm0) zpuVar.b).d;
                oar0Var.getClass();
                p7m0 p7m0Var2 = oar0Var.f24943a;
                do {
                    value2 = p7m0Var2.getValue();
                    sar0Var = (sar0) value2;
                } while (!p7m0Var2.m(value2, sar0Var != null ? sar0.a(sar0Var, arrayList, null, 2) : new sar0(arrayList, "")));
                ani0 ani0Var = (ani0) zpuVar.c;
                this.l = l3r0Var2;
                this.j = (byte) 2;
                Object objB = ((k3r0) ani0Var.f1155a).b(list3, this);
                if (objB != wne.f39444a) {
                    objB = Unit.f46060a;
                }
                if (objB != wneVar2) {
                    return l3r0Var2;
                }
                return wneVar2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaq(ebq ebqVar, yje yjeVar) {
        super(1, yjeVar);
        this.m = ebqVar;
    }
}
