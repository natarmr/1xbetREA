package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class d850 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5628a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    public /* synthetic */ d850(byte b, String str, List list) {
        this.f5628a = b;
        this.b = str;
        this.c = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5628a;
        String str = this.b;
        boolean z = false;
        List list = this.c;
        switch (b) {
            case 0:
                p650 p650Var = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var.getClass();
                List<jge> list2 = p650Var.h;
                ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                for (jge ageVar : list2) {
                    if (f140.w(ageVar, str) && (ageVar instanceof age)) {
                        ageVar = new age(new da8(((age) ageVar).f819a.a(), list, true));
                        z = true;
                    }
                    arrayList.add(ageVar);
                }
                return z ? p650.a(p650Var, null, arrayList, null, false, 262015) : p650Var;
            case 1:
                p650 p650Var2 = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var2.getClass();
                List<jge> list3 = p650Var2.h;
                ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
                boolean z2 = false;
                for (jge dgeVar : list3) {
                    if (f140.w(dgeVar, str) && (dgeVar instanceof dge)) {
                        boolean zIsEmpty = list.isEmpty();
                        ha8 ha8Var = ((dge) dgeVar).f6037a;
                        dgeVar = new dge(!zIsEmpty ? new da8(ha8Var.a(), list, false) : new y98(ha8Var.a()));
                        z2 = true;
                    }
                    arrayList2.add(dgeVar);
                }
                return z2 ? p650.a(p650Var2, null, arrayList2, null, false, 262015) : p650Var2;
            case 2:
                p650 p650Var3 = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var3.getClass();
                List<jge> list4 = p650Var3.h;
                ArrayList arrayList3 = new ArrayList(r3d.q(list4, 10));
                boolean z3 = false;
                for (jge ggeVar : list4) {
                    if (f140.w(ggeVar, str) && (ggeVar instanceof gge)) {
                        boolean zIsEmpty2 = list.isEmpty();
                        ha8 ha8Var2 = ((gge) ggeVar).f11249a;
                        ggeVar = new gge(!zIsEmpty2 ? new da8(ha8Var2.a(), list, false) : new y98(ha8Var2.a()));
                        z3 = true;
                    }
                    arrayList3.add(ggeVar);
                }
                return z3 ? p650.a(p650Var3, null, arrayList3, null, false, 262015) : p650Var3;
            default:
                p650 p650Var4 = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var4.getClass();
                List<jge> list5 = p650Var4.h;
                ArrayList arrayList4 = new ArrayList(r3d.q(list5, 10));
                boolean z4 = false;
                for (jge hgeVar : list5) {
                    if (f140.w(hgeVar, str) && (hgeVar instanceof hge)) {
                        boolean zIsEmpty3 = list.isEmpty();
                        ha8 ha8Var3 = ((hge) hgeVar).f13014a;
                        hgeVar = new hge(!zIsEmpty3 ? new da8(ha8Var3.a(), list, false) : new y98(ha8Var3.a()));
                        z4 = true;
                    }
                    arrayList4.add(hgeVar);
                }
                return z4 ? p650.a(p650Var4, null, arrayList4, null, false, 262015) : p650Var4;
        }
    }
}
