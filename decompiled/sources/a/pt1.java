package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pt1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27540a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ pt1(float f, ugd ugdVar, Function2 function2, cch0 cch0Var, int i, ugd ugdVar2) {
        this.f27540a = (byte) 10;
        this.c = f;
        this.b = ugdVar;
        this.d = function2;
        this.g = cch0Var;
        this.f = i;
        this.e = ugdVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27540a;
        int i = this.f;
        Object obj3 = this.e;
        Object obj4 = this.g;
        Object obj5 = this.d;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                gq80.f((mm40) obj6, (l7m0) obj5, this.c, (fu1) obj4, (Function0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                ntr.J((mm40) obj6, (String) obj4, this.c, (l7m0) obj5, (Function0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                ntb.d((mm40) obj6, (l7m0) obj5, this.c, (f3d) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                aac.l((mm40) obj6, (gql) obj5, this.c, (Function2) obj4, (Function0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                aac.g((mm40) obj6, (eql) obj5, this.c, (Function2) obj4, (Function0) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                ju70.l((mm40) obj6, (xcz) obj5, (zul) obj4, this.c, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                ebc.H((mm40) obj6, (xcz) obj5, this.c, (pz40) obj4, (ugd) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                qzb.x((mm40) obj6, (esv) obj5, this.c, (Function1) obj4, (Function1) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                ccq0.F((mm40) obj6, (ak60) obj5, this.c, (Function0) obj3, (Function0) obj4, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                ahy.L(jm40.b, this.c, (j8l0) obj6, (j700) obj5, (zcz) obj4, (List) obj3, (fet) obj, x8x.L(i | 1));
                return Unit.f46060a;
            default:
                Function2 function2 = (Function2) obj5;
                cch0 cch0Var = (cch0) obj4;
                ugd ugdVar = (ugd) obj3;
                c5n0 c5n0Var = (c5n0) obj;
                p4e p4eVar = (p4e) obj2;
                int iT = c5n0Var.T(90.0f);
                int iT2 = c5n0Var.T(this.c);
                List listK = c5n0Var.k(udo0.f35490a, (ugd) obj6);
                Integer numValueOf = 0;
                int size = listK.size();
                for (int i2 = 0; i2 < size; i2++) {
                    numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), ((pj30) listK.get(i2)).b(Integer.MAX_VALUE)));
                }
                int iIntValue = numValueOf.intValue();
                long jB = p4e.b(p4eVar.f26347a, iT, 0, iIntValue, iIntValue, 2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int size2 = listK.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    pj30 pj30Var = (pj30) listK.get(i3);
                    pu90 pu90VarS = pj30Var.S(jB);
                    float fR0 = c5n0Var.r0(Math.min(pj30Var.P(pu90VarS.b), pu90VarS.f27604a)) - (nbo0.f23252a * 2.0f);
                    arrayList.add(pu90VarS);
                    arrayList2.add(new ycl(fR0));
                }
                Integer numValueOf2 = Integer.valueOf(iT2 * 2);
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    numValueOf2 = Integer.valueOf(numValueOf2.intValue() + ((pu90) arrayList.get(i4)).f27604a);
                }
                int iIntValue2 = numValueOf2.intValue();
                return vj30.x(c5n0Var, iIntValue2, iIntValue, new m2i(iT2, arrayList, c5n0Var, function2, cch0Var, this.f, arrayList2, p4eVar, iIntValue2, iIntValue, ugdVar));
        }
    }

    public /* synthetic */ pt1(float f, j8l0 j8l0Var, j700 j700Var, zcz zczVar, List list, int i) {
        this.f27540a = (byte) 9;
        this.c = f;
        this.b = j8l0Var;
        this.d = j700Var;
        this.g = zczVar;
        this.e = list;
        this.f = i;
    }

    public /* synthetic */ pt1(mm40 mm40Var, xcz xczVar, zul zulVar, float f, Function1 function1, int i) {
        this.f27540a = (byte) 5;
        this.b = mm40Var;
        this.d = xczVar;
        this.g = zulVar;
        this.c = f;
        this.e = function1;
        this.f = i;
    }

    public /* synthetic */ pt1(mm40 mm40Var, ak60 ak60Var, float f, Function0 function0, Function0 function1, int i) {
        this.f27540a = (byte) 8;
        this.b = mm40Var;
        this.d = ak60Var;
        this.c = f;
        this.e = function0;
        this.g = function1;
        this.f = i;
    }

    public /* synthetic */ pt1(mm40 mm40Var, Object obj, float f, Object obj2, wdr wdrVar, int i, byte b) {
        this.f27540a = b;
        this.b = mm40Var;
        this.d = obj;
        this.c = f;
        this.g = obj2;
        this.e = wdrVar;
        this.f = i;
    }

    public /* synthetic */ pt1(mm40 mm40Var, String str, float f, l7m0 l7m0Var, Function0 function0, int i) {
        this.f27540a = (byte) 1;
        this.b = mm40Var;
        this.g = str;
        this.c = f;
        this.d = l7m0Var;
        this.e = function0;
        this.f = i;
    }
}
