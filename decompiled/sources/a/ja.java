package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ja extends bnn0 implements zdr {
    public /* synthetic */ Map i;
    public /* synthetic */ String j;
    public /* synthetic */ List k;
    public /* synthetic */ boolean l;
    public final /* synthetic */ ab m;
    public final /* synthetic */ List n;
    public final /* synthetic */ String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(ab abVar, List list, String str, yje yjeVar) {
        super(5, yjeVar);
        this.m = abVar;
        this.n = list;
        this.o = str;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        List list = this.n;
        String str = this.o;
        ja jaVar = new ja(this.m, list, str, (yje) obj5);
        jaVar.i = (Map) obj;
        jaVar.j = (String) obj2;
        jaVar.k = (List) obj3;
        jaVar.l = zBooleanValue;
        return jaVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        List listL0;
        Object obj2;
        Map map = this.i;
        String str = this.j;
        List list = this.k;
        boolean z = this.l;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        ab abVar = this.m;
        ctf0 ctf0Var = abVar.w;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Iterator it = this.n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                Object next = it.next();
                if (((r040) next) == entry.getKey()) {
                    obj2 = next;
                    break;
                }
            }
            if (obj2 != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        qho qhoVar = abVar.h0;
        ctf0Var.getClass();
        list.getClass();
        qhoVar.getClass();
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = setKeySet.iterator();
        while (true) {
            boolean z2 = false;
            if (!it2.hasNext()) {
                break;
            }
            r040 r040Var = (r040) it2.next();
            List<f240> list2 = (List) linkedHashMap.get(r040Var);
            if (list2 != null) {
                r040Var.getClass();
                ArrayList arrayList2 = new ArrayList();
                if (!list.isEmpty()) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (r040Var == ((r040) it3.next())) {
                            z2 = true;
                            break;
                        }
                    }
                }
                for (f240 f240Var : list2) {
                    int iOrdinal = r040Var.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 2 || iOrdinal == 4 || iOrdinal == 6 || iOrdinal == 8 || iOrdinal == 10) {
                        arrayList2.add(piz.V(r040Var, ctf0Var, this.o, z2, qhoVar));
                    }
                    if (z2 || (f240Var instanceof z140) || (f240Var instanceof s140) || (f240Var instanceof u140) || (f240Var instanceof p140) || (f240Var instanceof r140) || (f240Var instanceof y140)) {
                        arrayList2.add(f240Var);
                    }
                }
                listL0 = CollectionsKt.L0(CollectionsKt.O0(arrayList2));
            } else {
                listL0 = null;
            }
            if (listL0 == null) {
                listL0 = iun.f15405a;
            }
            w3d.u(arrayList, CollectionsKt.N(listL0));
        }
        if (!z) {
            return CollectionsKt.A0(arrayList, new s7f((byte) 9));
        }
        iz30 iz30Var = iz30.y;
        ux30 ux30Var = new ux30(10, 0L, ctf0Var.b.a(R.string.online_call, Arrays.copyOf(new Object[0], 0)), str);
        zcl zclVar = qmk.f28987a;
        return CollectionsKt.A0(CollectionsKt.A0(CollectionsKt.q0(kotlin.collections.a.c(new i140(false, iz30Var, r040.OTHER, new gy30(ux30Var, new qx30(new m0x(R.drawable.ic_glyph_call_circle, null, 6), 0L, liz.f20129a, R.drawable.ic_glyph_call_circle, 48.0f, 18), new ay30(new m0x(R.drawable.ic_glyph_call_end, null, 6)), 0L, null, null, 248))), arrayList), new s7f((byte) 7)), new s7f((byte) 8));
    }
}
