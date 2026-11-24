package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class uku implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kmq f35846a;
    public final /* synthetic */ dgu b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    public uku(kmq kmqVar, dgu dguVar, String str, List list, List list2, boolean z, boolean z2) {
        this.f35846a = kmqVar;
        this.b = dguVar;
        this.c = str;
        this.d = list;
        this.e = list2;
        this.f = z;
        this.g = z2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        tku tkuVar;
        p7m0 p7m0Var;
        p7m0 p7m0Var2;
        dgu dguVar = this.b;
        j1q0 j1q0Var = (j1q0) dguVar.d;
        uga0 uga0Var = (uga0) dguVar.f6058a;
        if (yjeVar instanceof tku) {
            tkuVar = (tku) yjeVar;
            int i = tkuVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                tkuVar.j = i - Integer.MIN_VALUE;
            } else {
                tkuVar = new tku(this, yjeVar);
            }
        } else {
            tkuVar = new tku(this, yjeVar);
        }
        Object obj2 = tkuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = tkuVar.j;
        if (i2 == 0) {
            z1x.P(obj2);
            List list = (List) obj;
            LinkedHashMap linkedHashMap = uga0Var.f35616a.b;
            String str = this.c;
            rga0 rga0Var = (rga0) linkedHashMap.get(str);
            if (rga0Var != null) {
                p7m0Var = rga0Var.f30423a;
            } else {
                rga0 rga0Var2 = new rga0();
                linkedHashMap.put(str, rga0Var2);
                p7m0Var = rga0Var2.f30423a;
            }
            List list2 = (List) p7m0Var.getValue();
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            List list3 = list2;
            boolean zJ = j1q0Var.f15748a.j();
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(vdx.c0((h07) it.next(), list3, this.d, this.e, zJ, this.f, j1q0Var.f15748a.f() || this.g));
            }
            LinkedHashMap linkedHashMap2 = uga0Var.f35616a.b;
            rga0 rga0Var3 = (rga0) linkedHashMap2.get(str);
            if (rga0Var3 != null) {
                p7m0Var2 = rga0Var3.f30423a;
            } else {
                rga0 rga0Var4 = new rga0();
                linkedHashMap2.put(str, rga0Var4);
                p7m0Var2 = rga0Var4.f30423a;
            }
            p7m0Var2.o(null, arrayList);
            tkuVar.j = 1;
            if (this.f35846a.a(arrayList, tkuVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
        }
        return Unit.f46060a;
    }
}
