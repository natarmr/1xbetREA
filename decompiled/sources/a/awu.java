package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class awu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uvu f1592a;
    public final bzu b;
    public final h9c c;

    public awu(uvu uvuVar, bzu bzuVar, h9c h9cVar) {
        uvuVar.getClass();
        this.f1592a = uvuVar;
        this.b = bzuVar;
        this.c = h9cVar;
    }

    public static ArrayList b(List list, List list2, List list3) {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f280 f280Var = (f280) it.next();
            seo seoVar = f280Var.d;
            reo reoVar = seoVar.d;
            if (list2 != null && list2.isEmpty()) {
                z = false;
                break;
            }
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                ru6 ru6Var = (ru6) it2.next();
                if (ru6Var.d == seoVar.i && ru6Var.h == seoVar.b && ru6Var.g == reoVar.f30345a && ru6Var.f == seoVar.c) {
                    z = true;
                    break;
                }
            }
            seo seoVar2 = f280Var.d;
            if (list3 != null && list3.isEmpty()) {
                z2 = false;
                break;
                break;
            }
            Iterator it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z2 = false;
                    break;
                }
                m97 m97Var = ((pbs0) it3.next()).b;
                if (m97Var.f21398a == seoVar2.i && m97Var.h == seoVar2.b && m97Var.f == seoVar2.d.f30345a && m97Var.k == seoVar2.c) {
                    z2 = true;
                    break;
                }
            }
            seo seoVar3 = new seo(seoVar.f32082a, seoVar.b, seoVar.c, reoVar, seoVar.e, seoVar.f, seoVar.g, seoVar.h, seoVar.i, z, z2, seoVar.l, seoVar.m);
            int i = f280Var.f8801a;
            String str = f280Var.b;
            String str2 = f280Var.c;
            str.getClass();
            arrayList.add(new f280(i, str, str2, seoVar3));
        }
        return arrayList;
    }

    public final a1g a() {
        return dub.f0(this.f1592a.f36366a.c.f21068a.z(), this.b.b(false), this.c.a(), new fl9(this, null, (byte) 6));
    }
}
