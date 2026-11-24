package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m2i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21061a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ m2i(int i, pu90 pu90Var, pu90 pu90Var2, c4i c4iVar, int i2, pu90 pu90Var3, int i3, pu90 pu90Var4, pu90 pu90Var5, pu90 pu90Var6, int i4) {
        this.b = i;
        this.f = pu90Var;
        this.g = pu90Var2;
        this.l = c4iVar;
        this.c = i2;
        this.h = pu90Var3;
        this.d = i3;
        this.i = pu90Var4;
        this.j = pu90Var5;
        this.k = pu90Var6;
        this.e = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f21061a;
        Object obj2 = this.l;
        int i = this.e;
        Object obj3 = this.k;
        Object obj4 = this.j;
        int i2 = this.c;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        int i3 = this.b;
        switch (b) {
            case 0:
                pu90 pu90Var = (pu90) obj8;
                pu90 pu90Var2 = (pu90) obj7;
                c4i c4iVar = (c4i) obj2;
                pu90 pu90Var3 = (pu90) obj6;
                pu90 pu90Var4 = (pu90) obj5;
                pu90 pu90Var5 = (pu90) obj4;
                pu90 pu90Var6 = (pu90) obj3;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                int i4 = this.d;
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, i3, i4 - (pu90Var.b / 2), 0.0f);
                    i3 += pu90Var.f27604a;
                }
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, i3, i4 - (pu90Var2.b / 2), 0.0f);
                    i3 += pu90Var2.f27604a;
                }
                if (c4iVar.c != null) {
                    i3 += i2;
                }
                ou90Var.m(pu90Var3, i3, i4 - (pu90Var3.b / 2), 0.0f);
                Iterator it = new ah30(tx3.z(new pu90[]{pu90Var4, pu90Var5, pu90Var6})).iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) ((xag0) it).b;
                    if (listIterator.hasPrevious()) {
                        pu90 pu90Var7 = (pu90) listIterator.previous();
                        i -= pu90Var7.f27604a;
                        ou90Var.m(pu90Var7, i, i4 - (pu90Var7.b / 2), 0.0f);
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList = (ArrayList) obj8;
                c5n0 c5n0Var = (c5n0) obj7;
                Function2 function2 = (Function2) obj6;
                cch0 cch0Var = (cch0) obj5;
                ArrayList arrayList2 = (ArrayList) obj4;
                p4e p4eVar = (p4e) obj3;
                ugd ugdVar = (ugd) obj2;
                ou90 ou90Var2 = (ou90) obj;
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                int i5 = 0;
                int i6 = i3;
                int i7 = 0;
                while (i7 < size) {
                    ArrayList arrayList4 = arrayList;
                    pu90 pu90Var8 = (pu90) arrayList.get(i7);
                    ou90Var2.m(pu90Var8, i6, i5, 0.0f);
                    arrayList3.add(new ado0(c5n0Var.r0(i6), c5n0Var.r0(pu90Var8.f27604a), ((ycl) arrayList2.get(i7)).f42389a));
                    i6 += pu90Var8.f27604a;
                    i7++;
                    size = size;
                    arrayList = arrayList4;
                    arrayList2 = arrayList2;
                    i5 = 0;
                }
                List listK = c5n0Var.k(udo0.b, function2);
                int size2 = listK.size();
                int i8 = 0;
                while (true) {
                    int i9 = this.d;
                    if (i8 >= size2) {
                        boolean z = true;
                        List listK2 = c5n0Var.k(udo0.c, new ugd(2125766411, true, new a8(ugdVar, arrayList3, (byte) 24)));
                        int size3 = listK2.size();
                        int i10 = 0;
                        while (i10 < size3) {
                            pj30 pj30Var = (pj30) listK2.get(i10);
                            if (!((i9 >= 0 ? z : false) & (i >= 0 ? z : false))) {
                                zcx.a("width and height must be >= 0");
                            }
                            ou90Var2.m(pj30Var.S(r4e.h(i9, i9, i, i)), 0, 0, 0.0f);
                            i10++;
                            z = true;
                        }
                        cch0Var.a(c5n0Var, i3, arrayList3, i2);
                    } else {
                        pu90 pu90VarS = ((pj30) listK.get(i8)).S(p4e.b(p4eVar.f26347a, i9, i9, 0, 0, 8));
                        ou90Var2.m(pu90VarS, 0, i - pu90VarS.b, 0.0f);
                        i8++;
                    }
                    break;
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ m2i(int i, ArrayList arrayList, c5n0 c5n0Var, Function2 function2, cch0 cch0Var, int i2, ArrayList arrayList2, p4e p4eVar, int i3, int i4, ugd ugdVar) {
        this.b = i;
        this.f = arrayList;
        this.g = c5n0Var;
        this.h = function2;
        this.i = cch0Var;
        this.c = i2;
        this.j = arrayList2;
        this.k = p4eVar;
        this.d = i3;
        this.e = i4;
        this.l = ugdVar;
    }
}
