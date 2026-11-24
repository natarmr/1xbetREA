package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class b3g implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1902a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public b3g(hie0 hie0Var, boolean z, x3m x3mVar, pz40 pz40Var, boolean z2, pz40 pz40Var2) {
        this.f1902a = (byte) 0;
        this.d = hie0Var;
        this.b = z;
        this.e = x3mVar;
        this.f = pz40Var;
        this.c = z2;
        this.g = pz40Var2;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x020e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0035  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        c7u c7uVar;
        Object value;
        bgu bguVar;
        Object value2;
        fgx fgxVar;
        Object next;
        j1q0 j1q0Var;
        boolean z;
        Object next2;
        byte b = this.f1902a;
        boolean z2 = this.c;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.d;
        boolean z3 = true;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                return b((prs0) obj, yjeVar);
            case 1:
                f7u f7uVar = (f7u) obj5;
                j1q0 j1q0Var2 = (j1q0) f7uVar.c;
                adn adnVar = (adn) f7uVar.b;
                if (yjeVar instanceof c7u) {
                    c7uVar = (c7u) yjeVar;
                    int i = c7uVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c7uVar.j = i - Integer.MIN_VALUE;
                    } else {
                        c7uVar = new c7u(this, yjeVar);
                    }
                } else {
                    c7uVar = new c7u(this, yjeVar);
                }
                Object obj6 = c7uVar.i;
                wne wneVar = wne.f39444a;
                int i2 = c7uVar.j;
                if (i2 == 0) {
                    z1x.P(obj6);
                    kmq kmqVar = (kmq) obj4;
                    List list = (List) obj;
                    List list2 = (List) adnVar.f687a.b.getValue();
                    if (list2 == null) {
                        list2 = iun.f15405a;
                    }
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(vdx.c0((h07) it.next(), list3, (List) obj3, (List) obj2, j1q0Var2.f15748a.j(), this.b, j1q0Var2.f15748a.f() || z2));
                    }
                    f430 f430Var = adnVar.f687a;
                    f430Var.getClass();
                    p7m0 p7m0Var = f430Var.b;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, arrayList));
                    c7uVar.j = 1;
                    if (kmqVar.a(arrayList, c7uVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj6);
                }
                return Unit.f46060a;
            default:
                dgu dguVar = (dgu) obj5;
                j1q0 j1q0Var3 = (j1q0) dguVar.d;
                fix fixVar = (fix) dguVar.f6058a;
                if (yjeVar instanceof bgu) {
                    bguVar = (bgu) yjeVar;
                    int i3 = bguVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        bguVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        bguVar = new bgu(this, yjeVar);
                    }
                } else {
                    bguVar = new bgu(this, yjeVar);
                }
                Object obj7 = bguVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = bguVar.j;
                if (i4 == 0) {
                    z1x.P(obj7);
                    kmq kmqVar2 = (kmq) obj4;
                    List<fgx> list4 = (List) obj;
                    Iterable iterable = (List) fixVar.b.f35648a.getValue();
                    if (iterable == null) {
                        iterable = iun.f15405a;
                    }
                    ArrayList arrayList2 = new ArrayList(r3d.q(list4, 10));
                    for (fgx fgxVar2 : list4) {
                        List list5 = (List) obj3;
                        List list6 = (List) obj2;
                        boolean zJ = j1q0Var3.f15748a.j();
                        boolean z4 = (j1q0Var3.f15748a.f() || z2) ? z3 : false;
                        fgxVar2.getClass();
                        fix fixVar2 = fixVar;
                        long j = fgxVar2.b;
                        iterable.getClass();
                        list5.getClass();
                        list6.getClass();
                        Iterator it2 = list6.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                fgxVar = fgxVar2;
                                if (((xco) next).f40655a != j) {
                                    fgxVar2 = fgxVar;
                                }
                            } else {
                                fgxVar = fgxVar2;
                                next = null;
                            }
                        }
                        xco xcoVar = (xco) next;
                        String str = xcoVar != null ? xcoVar.b : null;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = str;
                        Iterator it3 = iterable.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                                j1q0Var = j1q0Var3;
                                z = z2;
                                if (((ggx) next2).b != j) {
                                    z2 = z;
                                    j1q0Var3 = j1q0Var;
                                }
                            } else {
                                j1q0Var = j1q0Var3;
                                z = z2;
                                next2 = null;
                            }
                        }
                        ggx ggxVar = (ggx) next2;
                        List listR = ggxVar != null ? r3d.r(ggxVar.f11272a) : iun.f15405a;
                        fgx fgxVar3 = fgxVar;
                        List list7 = listR;
                        List list8 = fgxVar3.f9516a;
                        int i5 = 10;
                        ArrayList arrayList3 = new ArrayList(r3d.q(list8, 10));
                        Iterator it4 = list8.iterator();
                        while (it4.hasNext()) {
                            List list9 = (List) it4.next();
                            ArrayList arrayList4 = new ArrayList(r3d.q(list9, i5));
                            int i6 = 0;
                            for (Object obj8 : list9) {
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    q3d.p();
                                    throw null;
                                }
                                arrayList4.add(xdx.M((ig7) obj8, i6, false, fgxVar3.g, str2, fgxVar3.h, list5, list7, zJ, fgxVar3.f, fgxVar3.b, this.b, z4));
                                it4 = it4;
                                i6 = i7;
                                obj2 = obj2;
                                obj3 = obj3;
                            }
                            arrayList3.add(arrayList4);
                            i5 = 10;
                        }
                        arrayList2.add(new ggx(fgxVar3.b, fgxVar3.c, str2, fgxVar3.d, fgxVar3.e, arrayList3));
                        fixVar = fixVar2;
                        z2 = z;
                        j1q0Var3 = j1q0Var;
                        obj2 = obj2;
                        obj3 = obj3;
                        z3 = true;
                    }
                    ugx ugxVar = fixVar.b;
                    ugxVar.getClass();
                    p7m0 p7m0Var2 = ugxVar.f35648a;
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, arrayList2));
                    bguVar.j = 1;
                    if (kmqVar2.a(arrayList2, bguVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj7);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (r2.b(true, r3) == r4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
    
        if (r2.b(true, r3) == r4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
    
        if (r2.e(r3) == r4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b9, code lost:
    
        if (r2.a(r3) == r4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d1, code lost:
    
        if (r2.e(r3) == r4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00eb, code lost:
    
        if (r2.e(r3) == r4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f5, code lost:
    
        if (r2.a(r3) == r4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0110, code lost:
    
        if (r2.b(true, r3) == r4) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0112, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(a.prs0 r12, a.yje r13) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b3g.b(a.prs0, a.yje):java.lang.Object");
    }

    public /* synthetic */ b3g(kmq kmqVar, Object obj, List list, List list2, boolean z, boolean z2, byte b) {
        this.f1902a = b;
        this.d = kmqVar;
        this.e = obj;
        this.f = list;
        this.g = list2;
        this.b = z;
        this.c = z2;
    }
}
