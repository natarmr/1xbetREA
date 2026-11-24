package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class cku implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4526a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ long c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ cku(kmq kmqVar, Object obj, long j, List list, List list2, boolean z, boolean z2, byte b) {
        this.f4526a = b;
        this.b = kmqVar;
        this.h = obj;
        this.c = j;
        this.d = list;
        this.e = list2;
        this.f = z;
        this.g = z2;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x014f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0208  */
    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        bku bkuVar;
        Object value;
        gku gkuVar;
        Object value2;
        jku jkuVar;
        Object value3;
        long j;
        Object next;
        byte b = this.f4526a;
        boolean z = this.g;
        kmq kmqVar = this.b;
        Object obj2 = this.h;
        long j2 = this.c;
        switch (b) {
            case 0:
                f7u f7uVar = (f7u) obj2;
                j1q0 j1q0Var = (j1q0) f7uVar.c;
                p530 p530Var = (p530) f7uVar.b;
                if (yjeVar instanceof bku) {
                    bkuVar = (bku) yjeVar;
                    int i = bkuVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        bkuVar.j = i - Integer.MIN_VALUE;
                    } else {
                        bkuVar = new bku(this, yjeVar);
                    }
                } else {
                    bkuVar = new bku(this, yjeVar);
                }
                Object obj3 = bkuVar.i;
                wne wneVar = wne.f39444a;
                int i2 = bkuVar.j;
                if (i2 == 0) {
                    z1x.P(obj3);
                    List list = (List) obj;
                    List list2 = (List) p530Var.f26386a.b(j2).getValue();
                    if (list2 == null) {
                        list2 = iun.f15405a;
                    }
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(vdx.c0((h07) it.next(), list3, this.d, this.e, j1q0Var.f15748a.j(), this.f, j1q0Var.f15748a.f() || z));
                    }
                    m530 m530Var = p530Var.f26386a;
                    m530Var.getClass();
                    p7m0 p7m0VarB = m530Var.b(j2);
                    do {
                        value = p7m0VarB.getValue();
                    } while (!p7m0VarB.m(value, arrayList));
                    bkuVar.j = 1;
                    if (kmqVar.a(arrayList, bkuVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            case 1:
                dgu dguVar = (dgu) obj2;
                j1q0 j1q0Var2 = (j1q0) dguVar.d;
                p530 p530Var2 = (p530) dguVar.f6058a;
                if (yjeVar instanceof gku) {
                    gkuVar = (gku) yjeVar;
                    int i3 = gkuVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        gkuVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        gkuVar = new gku(this, yjeVar);
                    }
                } else {
                    gkuVar = new gku(this, yjeVar);
                }
                Object obj4 = gkuVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = gkuVar.j;
                if (i4 == 0) {
                    z1x.P(obj4);
                    List list4 = (List) obj;
                    List list5 = (List) p530Var2.f26386a.b(j2).getValue();
                    if (list5 == null) {
                        list5 = iun.f15405a;
                    }
                    List list6 = list5;
                    ArrayList arrayList2 = new ArrayList(r3d.q(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(vdx.c0((h07) it2.next(), list6, this.d, this.e, j1q0Var2.f15748a.j(), this.f, j1q0Var2.f15748a.f() || z));
                    }
                    m530 m530Var2 = p530Var2.f26386a;
                    m530Var2.getClass();
                    p7m0 p7m0VarB2 = m530Var2.b(j2);
                    do {
                        value2 = p7m0VarB2.getValue();
                    } while (!p7m0VarB2.m(value2, arrayList2));
                    gkuVar.j = 1;
                    if (kmqVar.a(arrayList2, gkuVar) == wneVar2) {
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
            default:
                f7u f7uVar2 = (f7u) obj2;
                j1q0 j1q0Var3 = (j1q0) f7uVar2.c;
                rr20 rr20Var = (rr20) f7uVar2.b;
                if (yjeVar instanceof jku) {
                    jkuVar = (jku) yjeVar;
                    int i5 = jkuVar.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        jkuVar.j = i5 - Integer.MIN_VALUE;
                    } else {
                        jkuVar = new jku(this, yjeVar);
                    }
                } else {
                    jkuVar = new jku(this, yjeVar);
                }
                Object obj5 = jkuVar.i;
                wne wneVar3 = wne.f39444a;
                int i6 = jkuVar.j;
                if (i6 == 0) {
                    z1x.P(obj5);
                    List<xm7> list7 = (List) obj;
                    ArrayList arrayList3 = new ArrayList(r3d.q(list7, 10));
                    for (xm7 xm7Var : list7) {
                        Iterable iterable = (List) rr20Var.f30960a.c(j2).getValue();
                        if (iterable == null) {
                            iterable = iun.f15405a;
                        }
                        Iterator it3 = iterable.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                j = j2;
                                if (((wr20) next).b != xm7Var.b) {
                                    j2 = j;
                                }
                            } else {
                                j = j2;
                                next = null;
                            }
                        }
                        wr20 wr20Var = (wr20) next;
                        List list8 = wr20Var != null ? wr20Var.f39619a : iun.f15405a;
                        ArrayList arrayList4 = xm7Var.f41109a;
                        ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(vdx.c0((h07) it4.next(), list8, this.d, this.e, j1q0Var3.f15748a.j(), this.f, j1q0Var3.f15748a.f() || z));
                        }
                        arrayList3.add(new wr20(xm7Var.b, xm7Var.c, arrayList5));
                        j2 = j;
                    }
                    x2b x2bVar = rr20Var.f30960a;
                    x2bVar.getClass();
                    p7m0 p7m0VarC = x2bVar.c(j2);
                    do {
                        value3 = p7m0VarC.getValue();
                    } while (!p7m0VarC.m(value3, arrayList3));
                    jkuVar.j = 1;
                    if (kmqVar.a(arrayList3, jkuVar) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
        }
    }
}
