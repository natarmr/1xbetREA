package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes4.dex */
public final class inp extends bnn0 implements Function1 {
    public ygs i;
    public boolean j;
    public final /* synthetic */ nnp k;
    public final /* synthetic */ long l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ List n;
    public final /* synthetic */ long o;
    public final /* synthetic */ long p;
    public final /* synthetic */ String q;
    public final /* synthetic */ long r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inp(nnp nnpVar, long j, boolean z, List list, long j2, long j3, String str, long j4, yje yjeVar) {
        super(1, yjeVar);
        this.k = nnpVar;
        this.l = j;
        this.m = z;
        this.n = list;
        this.o = j2;
        this.p = j3;
        this.q = str;
        this.r = j4;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new inp(this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((inp) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ygs ygsVar;
        nnp nnpVar = this.k;
        i1w0 i1w0Var = nnpVar.C;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        Object obj2 = null;
        if (!z) {
            z1x.P(obj);
            List listA = nnpVar.M.f20692a.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : listA) {
                List list = ((lok0) obj3).t;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((Number) it.next()).intValue() == 1) {
                            arrayList.add(obj3);
                            break;
                        }
                    }
                }
            }
            for (Object obj4 : arrayList) {
                if (((lok0) obj4).f20396a == ((int) this.r)) {
                    obj2 = obj4;
                    break;
                }
            }
            lok0 lok0Var = (lok0) obj2;
            if (lok0Var == null) {
                List list2 = this.n;
                if (list2.size() == 1) {
                    ygs ygsVar2 = (ygs) CollectionsKt.U(list2);
                    nnpVar.R(this.l, ygsVar2.d, ygsVar2.B, ygsVar2.c);
                    h3c h3cVar = nnpVar.R;
                    long j = ygsVar2.d;
                    this.i = ygsVar2;
                    this.j = true;
                    Object objB = h3cVar.b(j, this);
                    if (objB == wneVar) {
                        return wneVar;
                    }
                    ygsVar = ygsVar2;
                    obj = objB;
                } else {
                    nnpVar.R(this.l, this.o, this.p, this.m);
                    i1w0Var.d(new as0((Object) nnpVar, (Object) this.q, (Object) cui0.b(new Long(this.l)), this.o, (byte) 5));
                }
                return Unit.f46060a;
            }
            FragmentScreen fragmentScreenH = nnpVar.N.h(lok0Var.f20396a, lok0Var.b);
            nnpVar.R(this.l, lok0Var.f, lok0Var.g, this.m);
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            if (fragmentScreenH instanceof DialogScreen) {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenH)));
            } else {
                copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenH)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return Unit.f46060a;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ygs ygsVar3 = this.i;
            z1x.P(obj);
            ygsVar = ygsVar3;
        }
        nnpVar.C.d(new q71(nnpVar, ygsVar, this.r, ((Boolean) obj).booleanValue()));
        return Unit.f46060a;
    }
}
