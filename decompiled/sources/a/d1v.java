package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class d1v implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5329a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ lie0 d;
    public final /* synthetic */ hie0 e;

    public /* synthetic */ d1v(byte b, kmq kmqVar, hie0 hie0Var, lie0 lie0Var, Object obj) {
        this.f5329a = b;
        this.b = kmqVar;
        this.c = obj;
        this.d = lie0Var;
        this.e = hie0Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        c1v c1vVar;
        Object g0g0Var;
        u1v u1vVar;
        Object g0g0Var2;
        byte b = this.f5329a;
        hie0 hie0Var = this.e;
        lie0 lie0Var = this.d;
        kmq kmqVar = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                if (yjeVar instanceof c1v) {
                    c1vVar = (c1v) yjeVar;
                    int i = c1vVar.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1vVar.j = i - Integer.MIN_VALUE;
                    } else {
                        c1vVar = new c1v(this, yjeVar);
                    }
                } else {
                    c1vVar = new c1v(this, yjeVar);
                }
                Object obj3 = c1vVar.i;
                wne wneVar = wne.f39444a;
                int i2 = c1vVar.j;
                if (i2 == 0) {
                    z1x.P(obj3);
                    List list = (List) obj;
                    e0g0 e0g0Var = j0g0.b;
                    boolean z = obj2 instanceof g0g0;
                    if (z) {
                        Throwable thA = j0g0.a(obj2);
                        if (thA == null) {
                            thA = new Throwable();
                        }
                        g0g0Var = new g0g0(thA);
                    } else {
                        g0g0Var = list;
                    }
                    if (!z) {
                        list = iun.f15405a;
                    }
                    b3g0 b3g0Var = new b3g0(g0g0Var, lie0Var.f20100a, hie0Var.f13108a, list);
                    c1vVar.j = 1;
                    if (kmqVar.a(b3g0Var, c1vVar) == wneVar) {
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
            default:
                if (yjeVar instanceof u1v) {
                    u1vVar = (u1v) yjeVar;
                    int i3 = u1vVar.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        u1vVar.j = i3 - Integer.MIN_VALUE;
                    } else {
                        u1vVar = new u1v(this, yjeVar);
                    }
                } else {
                    u1vVar = new u1v(this, yjeVar);
                }
                Object obj4 = u1vVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = u1vVar.j;
                if (i4 == 0) {
                    z1x.P(obj4);
                    List list2 = (List) obj;
                    e0g0 e0g0Var2 = j0g0.b;
                    boolean z2 = obj2 instanceof g0g0;
                    if (z2) {
                        Throwable thA2 = j0g0.a(obj2);
                        if (thA2 == null) {
                            thA2 = new Throwable();
                        }
                        g0g0Var2 = new g0g0(thA2);
                    } else {
                        g0g0Var2 = list2;
                    }
                    if (!z2) {
                        list2 = iun.f15405a;
                    }
                    b3g0 b3g0Var2 = new b3g0(g0g0Var2, lie0Var.f20100a, hie0Var.f13108a, list2);
                    u1vVar.j = 1;
                    if (kmqVar.a(b3g0Var2, u1vVar) == wneVar2) {
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
