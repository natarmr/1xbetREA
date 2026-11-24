package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class r260 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29716a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ v360 c;

    public /* synthetic */ r260(kmq kmqVar, v360 v360Var, byte b) {
        this.f29716a = b;
        this.b = kmqVar;
        this.c = v360Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        q260 q260Var;
        b360 b360Var;
        byte b = this.f29716a;
        v360 v360Var = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof q260) {
                    q260Var = (q260) yjeVar;
                    int i = q260Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        q260Var.j = i - Integer.MIN_VALUE;
                    } else {
                        q260Var = new q260(this, yjeVar);
                    }
                } else {
                    q260Var = new q260(this, yjeVar);
                }
                Object obj2 = q260Var.i;
                wne wneVar = wne.f39444a;
                int i2 = q260Var.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    Pair pair = (Pair) obj;
                    List list = (List) pair.f46059a;
                    List list2 = (List) pair.b;
                    nn60 nn60Var = v360Var.p0;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        axq.t(((i8p) it.next()).f14350a, arrayList);
                    }
                    i3t0.B(v360Var, nn60Var, new en60[]{new xm60(arrayList)});
                    q260Var.j = 1;
                    if (kmqVar.a(list2, q260Var) == wneVar) {
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
            default:
                if (yjeVar instanceof b360) {
                    b360Var = (b360) yjeVar;
                    int i3 = b360Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        b360Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        b360Var = new b360(this, yjeVar);
                    }
                } else {
                    b360Var = new b360(this, yjeVar);
                }
                Object obj3 = b360Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = b360Var.j;
                if (i4 == 0) {
                    z1x.P(obj3);
                    ArrayList<Object> arrayList2 = new ArrayList();
                    for (Object obj4 : (List) obj) {
                        oxy oxyVar = (oxy) obj4;
                        if (!(oxyVar instanceof lxy) || ((lxy) oxyVar).b.f) {
                            arrayList2.add(obj4);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                    for (Object objB : arrayList2) {
                        if (v360Var.J.f() && (objB instanceof lxy)) {
                            lxy lxyVar = (lxy) objB;
                            objB = lxy.b(lxyVar, nxy.a(lxyVar.b));
                        }
                        arrayList3.add(objB);
                    }
                    b360Var.j = 1;
                    if (kmqVar.a(arrayList3, b360Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
        }
    }
}
