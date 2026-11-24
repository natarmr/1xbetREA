package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class fr0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10000a = 0;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public fr0(kmq kmqVar, long j, jr0 jr0Var) {
        this.b = kmqVar;
        this.c = j;
        this.d = jr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        er0 er0Var;
        kos kosVar;
        byte b = this.f10000a;
        long j = this.c;
        boolean z = false;
        Object obj2 = this.d;
        kmq kmqVar = this.b;
        switch (b) {
            case 0:
                ap0 ap0Var = ((jr0) obj2).b;
                if (yjeVar instanceof er0) {
                    er0Var = (er0) yjeVar;
                    int i = er0Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        er0Var.j = i - Integer.MIN_VALUE;
                    } else {
                        er0Var = new er0(this, yjeVar);
                    }
                } else {
                    er0Var = new er0(this, yjeVar);
                }
                Object obj3 = er0Var.i;
                wne wneVar = wne.f39444a;
                int i2 = er0Var.j;
                if (i2 == 0) {
                    z1x.P(obj3);
                    List list = ((qh1) ((dx5) obj).a()).f28714a;
                    if (list == null) {
                        jf4.k(null);
                        return null;
                    }
                    kf0 kf0Var = (kf0) CollectionsKt.firstOrNull(list);
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (true) {
                        String str = "";
                        if (it.hasNext()) {
                            kf0 kf0Var2 = (kf0) it.next();
                            String strValueOf = String.valueOf(kf0Var2.f18175a);
                            String str2 = kf0Var2.b;
                            if (str2 != null) {
                                str = str2;
                            }
                            arrayList.add(new ezc0(strValueOf, str, kf0Var2.equals(kf0Var)));
                        } else {
                            if (arrayList.isEmpty()) {
                                z = true;
                            } else {
                                Iterator it2 = arrayList.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        z = true;
                                    }
                                } while (!((ezc0) it2.next()).c);
                            }
                            ArrayList arrayListR0 = CollectionsKt.r0(arrayList, new ezc0("0", "", z));
                            nh1 nh1Var = new nh1(j, arrayListR0);
                            Object obj4 = ap0Var.b.get(Long.valueOf(j));
                            if (obj4 == null) {
                                obj4 = iun.f15405a;
                            }
                            if (((List) obj4).isEmpty()) {
                                ap0Var.a(j, arrayListR0);
                            }
                            er0Var.j = 1;
                            if (kmqVar.a(nh1Var, er0Var) == wneVar) {
                                return wneVar;
                            }
                        }
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj3);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof kos) {
                    kosVar = (kos) yjeVar;
                    int i3 = kosVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        kosVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        kosVar = new kos(this, yjeVar);
                    }
                } else {
                    kosVar = new kos(this, yjeVar);
                }
                Object obj5 = kosVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = kosVar.j;
                if (i4 == 0) {
                    z1x.P(obj5);
                    hie0 hie0Var = (hie0) obj2;
                    boolean z2 = hie0Var.f13108a;
                    hie0Var.f13108a = false;
                    t9s t9sVar = new t9s(j, (m9s) obj, z2);
                    kosVar.j = 1;
                    if (kmqVar.a(t9sVar, kosVar) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
        }
    }

    public fr0(kmq kmqVar, hie0 hie0Var, long j) {
        this.b = kmqVar;
        this.d = hie0Var;
        this.c = j;
    }
}
