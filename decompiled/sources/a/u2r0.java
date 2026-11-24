package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class u2r0 extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ z2r0 l;
    public final /* synthetic */ sip m;
    public final /* synthetic */ lie0 n;
    public final /* synthetic */ hie0 o;
    public final /* synthetic */ boolean p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2r0(yje yjeVar, z2r0 z2r0Var, sip sipVar, lie0 lie0Var, hie0 hie0Var, boolean z) {
        super(3, yjeVar);
        this.l = z2r0Var;
        this.m = sipVar;
        this.n = lie0Var;
        this.o = hie0Var;
        this.p = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        u2r0 u2r0Var = new u2r0((yje) obj3, this.l, this.m, this.n, this.o, this.p);
        u2r0Var.j = (kmq) obj;
        u2r0Var.k = obj2;
        return u2r0Var.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        List list;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = this.j;
            Object obj2 = ((j0g0) this.k).f15681a;
            boolean z2 = obj2 instanceof g0g0;
            hie0 hie0Var = this.o;
            lie0 lie0Var = this.n;
            z2r0 z2r0Var = this.l;
            if (z2) {
                uyn uynVar = z2r0Var.e;
                CyberGamesPage.Real real = CyberGamesPage.Real.INSTANCE;
                real.getClass();
                list = (List) ((sb6) uynVar.f36498a).b.h(real, this.m).b();
                if (list == null) {
                    list = iun.f15405a;
                }
            } else {
                lie0Var.f20100a = System.currentTimeMillis();
                hie0Var.f13108a = true;
                list = (List) (z2 ? null : obj2);
                if (list == null) {
                    list = iun.f15405a;
                }
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                w3d.u(arrayList, ((b4r0) it.next()).e);
            }
            y2r0 y2r0Var = new y2r0(z2r0Var.f43685a.k(arrayList, this.p, z2r0Var.c.a().O1), list2, obj2, lie0Var, hie0Var, z2r0Var);
            this.j = null;
            this.k = null;
            this.i = true;
            if (slb.Q(kmqVar, y2r0Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
