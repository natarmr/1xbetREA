package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rbh0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30187a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ugd e;
    public final /* synthetic */ int f;
    public final /* synthetic */ wdr g;
    public final /* synthetic */ Object h;

    public /* synthetic */ rbh0(int i, int i2, boolean z, Function0 function0, mm40 mm40Var, ugd ugdVar, int i3) {
        this.b = i;
        this.c = i2;
        this.d = z;
        this.g = function0;
        this.h = mm40Var;
        this.e = ugdVar;
        this.f = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f30187a;
        Object obj3 = this.h;
        wdr wdrVar = this.g;
        switch (b) {
            case 0:
                final pz40 pz40Var = (pz40) obj3;
                final ugd ugdVar = (ugd) wdrVar;
                final c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                c5n0Var.getClass();
                List listK = c5n0Var.k(wbh0.f38879a, this.e);
                Iterator it = listK.iterator();
                if (!it.hasNext()) {
                    itt0.a();
                    return null;
                }
                int iB = ((pj30) it.next()).b(Integer.MAX_VALUE);
                while (true) {
                    final int i = iB;
                    do {
                        if (!it.hasNext()) {
                            long jB = p4e.b(p4eVar.f26347a, 0, 0, i, i, 2);
                            final ArrayList arrayList = new ArrayList(listK.size());
                            int size = listK.size();
                            int i2 = 0;
                            for (int iE = 0; iE < size; iE = w6x.e((pj30) listK.get(iE), jB, arrayList, iE, 1)) {
                            }
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                i2 += ((pu90) it2.next()).f27604a;
                            }
                            int size2 = arrayList.size() - 1;
                            final int i3 = this.b;
                            final int i4 = (size2 * i3) + i2 + this.c;
                            final boolean z = this.d;
                            final int i5 = this.f;
                            return vj30.x(c5n0Var, i4, i, new Function1() { // from class: a.tbh0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    ou90 ou90Var = (ou90) obj4;
                                    ou90Var.getClass();
                                    ArrayList arrayList2 = new ArrayList();
                                    boolean z2 = z;
                                    int i6 = i4;
                                    ArrayList arrayList3 = arrayList;
                                    c5n0 c5n0Var2 = c5n0Var;
                                    pz40 pz40Var2 = pz40Var;
                                    int i7 = i3;
                                    ugd ugdVar2 = ugdVar;
                                    int i8 = i5;
                                    int i9 = i;
                                    float f = 1.0f;
                                    int i10 = 0;
                                    if (z2) {
                                        int size3 = arrayList3.size();
                                        int i11 = i6;
                                        int i12 = 0;
                                        while (i12 < size3) {
                                            pu90 pu90Var = (pu90) arrayList3.get(i12);
                                            int i13 = i12;
                                            int i14 = i11 - pu90Var.f27604a;
                                            ou90Var.g(pu90Var, i14, i10, f);
                                            arrayList2.add(new qvx(ou90Var.r0(i14), ou90Var.r0(pu90Var.f27604a)));
                                            i11 = i14 - i7;
                                            i12 = i13 + 1;
                                            f = 1.0f;
                                            i10 = 0;
                                        }
                                        List listK2 = c5n0Var2.k(wbh0.b, new ugd(-1786803170, true, new sbh0(ugdVar2, i8, pz40Var2, (byte) 1)));
                                        int size4 = listK2.size();
                                        for (int i15 = 0; i15 < size4; i15++) {
                                            pj30 pj30Var = (pj30) listK2.get(i15);
                                            if (!((i6 >= 0) & (i9 >= 0))) {
                                                zcx.a("width and height must be >= 0");
                                            }
                                            ou90Var.g(pj30Var.S(r4e.h(i6, i6, i9, i9)), 0, 0, 0.0f);
                                        }
                                    } else {
                                        int i16 = 0;
                                        int size5 = arrayList3.size();
                                        int i17 = 0;
                                        int i18 = 0;
                                        while (i17 < size5) {
                                            pu90 pu90Var2 = (pu90) arrayList3.get(i17);
                                            ou90Var.m(pu90Var2, i18, i16, 1.0f);
                                            arrayList2.add(new qvx(ou90Var.r0(i18), ou90Var.r0(pu90Var2.f27604a)));
                                            i18 += pu90Var2.f27604a + i7;
                                            i17++;
                                            size5 = size5;
                                            i16 = 0;
                                        }
                                        List listK3 = c5n0Var2.k(wbh0.b, new ugd(-170957154, true, new sbh0(ugdVar2, i8, pz40Var2, (byte) 2)));
                                        int size6 = listK3.size();
                                        for (int i19 = 0; i19 < size6; i19++) {
                                            pj30 pj30Var2 = (pj30) listK3.get(i19);
                                            if (!((i6 >= 0) & (i9 >= 0))) {
                                                zcx.a("width and height must be >= 0");
                                            }
                                            ou90Var.m(pj30Var2.S(r4e.h(i6, i6, i9, i9)), 0, 0, 0.0f);
                                        }
                                    }
                                    if (!Intrinsics.d(pz40Var2.getValue(), arrayList2)) {
                                        pz40Var2.setValue(arrayList2);
                                    }
                                    return Unit.f46060a;
                                }
                            });
                        }
                        iB = ((pj30) it.next()).b(Integer.MAX_VALUE);
                    } while (i >= iB);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                tfx.p(this.b, this.c, this.d, (Function0) wdrVar, (mm40) obj3, this.e, (fet) obj, x8x.L(this.f | 1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ rbh0(ugd ugdVar, int i, int i2, boolean z, pz40 pz40Var, ugd ugdVar2, int i3) {
        this.e = ugdVar;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.h = pz40Var;
        this.g = ugdVar2;
        this.f = i3;
    }
}
