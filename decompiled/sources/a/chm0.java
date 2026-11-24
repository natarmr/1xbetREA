package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class chm0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ dhm0 k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ chm0(dhm0 dhm0Var, int i, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dhm0Var;
        this.l = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        int i = this.l;
        dhm0 dhm0Var = this.k;
        switch (b) {
            case 0:
                return new chm0(dhm0Var, i, yjeVar, (byte) 0);
            default:
                return new chm0(dhm0Var, i, yjeVar, (byte) 1);
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
        return ((chm0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v11, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.List] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objB;
        byte b = this.i;
        dhm0 dhm0Var = this.k;
        ?? arrayList = 0;
        ?? arrayList2 = 0;
        switch (b) {
            case 0:
                knf0 knf0Var = dhm0Var.c;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    afm0 afm0Var = dhm0Var.b;
                    String strC = knf0Var.c();
                    knf0Var.getClass();
                    int iB = knf0Var.b();
                    knf0Var.getClass();
                    this.j = true;
                    objA = ((bhm0) ((jfm0) afm0Var.c).invoke()).a(this.l, strC, 1, iB, 1357, "application/vnd.xenvelop+json", this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                fxq0 fxq0Var = (fxq0) ((dx5) objA).a();
                List list = fxq0Var.f10322a;
                if (list != null) {
                    arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(s0x.d0((eaa0) it.next()));
                    }
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                return new cxq0(arrayList, zcm0.o(fxq0Var.b));
            default:
                knf0 knf0Var2 = dhm0Var.c;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    afm0 afm0Var2 = dhm0Var.b;
                    String strC2 = knf0Var2.c();
                    knf0Var2.getClass();
                    int iB2 = knf0Var2.b();
                    knf0Var2.getClass();
                    this.j = true;
                    objB = ((bhm0) ((jfm0) afm0Var2.c).invoke()).b(this.l, strC2, 1, iB2, 1357, "application/vnd.xenvelop+json", this);
                    if (objB == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                o3r0 o3r0Var = (o3r0) ((dx5) objB).a();
                List list2 = o3r0Var.f24601a;
                if (list2 != null) {
                    arrayList2 = new ArrayList(r3d.q(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(s0x.d0((eaa0) it2.next()));
                    }
                }
                if (arrayList2 == 0) {
                    arrayList2 = iun.f15405a;
                }
                return new l3r0(arrayList2, zcm0.o(o3r0Var.b));
        }
    }
}
