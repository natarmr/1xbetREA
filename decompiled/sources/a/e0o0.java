package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class e0o0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6998a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ xvs c;

    public /* synthetic */ e0o0(kmq kmqVar, xvs xvsVar, byte b) {
        this.f6998a = b;
        this.b = kmqVar;
        this.c = xvsVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0099  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        d0o0 d0o0Var;
        j0o0 j0o0Var;
        byte b = this.f6998a;
        xvs xvsVar = this.c;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                if (yjeVar instanceof d0o0) {
                    d0o0Var = (d0o0) yjeVar;
                    int i = d0o0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        d0o0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        d0o0Var = new d0o0(this, yjeVar);
                    }
                } else {
                    d0o0Var = new d0o0(this, yjeVar);
                }
                Object obj2 = d0o0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = d0o0Var.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (((k8p) obj3).g == xvsVar) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        axq.t(((k8p) it.next()).f17883a, arrayList2);
                    }
                    d0o0Var.j = 1;
                    if (kmqVar.a(arrayList2, d0o0Var) == wneVar) {
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
                if (yjeVar instanceof j0o0) {
                    j0o0Var = (j0o0) yjeVar;
                    int i3 = j0o0Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        j0o0Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        j0o0Var = new j0o0(this, yjeVar);
                    }
                } else {
                    j0o0Var = new j0o0(this, yjeVar);
                }
                Object obj4 = j0o0Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = j0o0Var.j;
                if (i4 == 0) {
                    z1x.P(obj4);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : (List) obj) {
                        if (((k8p) obj5).g == xvsVar) {
                            arrayList3.add(obj5);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        axq.t(((k8p) it2.next()).b, arrayList4);
                    }
                    j0o0Var.j = 1;
                    if (kmqVar.a(arrayList4, j0o0Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
        }
    }
}
