package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mme implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22033a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ mme(mm40 mm40Var, String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, String str5, String str6, boolean z, boolean z2, int i) {
        this.e = mm40Var;
        this.f = str;
        this.g = str2;
        this.h = a4xVar;
        this.i = a4xVar2;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = str6;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0104  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        byte b = this.f22033a;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        Object obj6 = this.j;
        Object obj7 = this.i;
        Object obj8 = this.h;
        Object obj9 = this.g;
        Object obj10 = this.f;
        Object obj11 = this.e;
        switch (b) {
            case 0:
                k7q0 k7q0Var = (k7q0) obj11;
                djz djzVar = (djz) obj10;
                rhv0 rhv0Var = (rhv0) obj9;
                vne vneVar = (vne) obj8;
                Function1 function1 = (Function1) obj7;
                a8q0 a8q0Var = (a8q0) obj6;
                qe60 qe60Var = (qe60) obj5;
                w6k w6kVar = (w6k) obj4;
                d39 d39Var = (d39) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tme tmeVar = new tme(djzVar, k7q0Var, rhv0Var, vneVar, function1, a8q0Var, qe60Var, w6kVar, d39Var, this.d);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tmeVar, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    fetVar.r(true);
                    dmv dmvVarA = djzVar.a();
                    dmv dmvVar = dmv.f6336a;
                    boolean z2 = this.b;
                    if (dmvVarA != dmvVar && djzVar.c() != null) {
                        j6z j6zVarC = djzVar.c();
                        j6zVarC.getClass();
                        z = j6zVarC.h() && z2;
                    }
                    dyb.G(k7q0Var, z, fetVar, 0);
                    if (djzVar.a() == dmv.c && !this.c && z2) {
                        fetVar.e0(-713510518);
                        dyb.J(k7q0Var, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-713433638);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                nkb.i((mm40) obj11, (String) obj10, (String) obj9, (a4x) obj8, (a4x) obj7, (String) obj6, (String) obj5, (String) obj4, (String) obj3, this.b, this.c, (fet) obj, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ mme(k7q0 k7q0Var, djz djzVar, boolean z, boolean z2, rhv0 rhv0Var, vne vneVar, Function1 function1, a8q0 a8q0Var, qe60 qe60Var, w6k w6kVar, d39 d39Var, int i) {
        this.e = k7q0Var;
        this.f = djzVar;
        this.b = z;
        this.c = z2;
        this.g = rhv0Var;
        this.h = vneVar;
        this.i = function1;
        this.j = a8q0Var;
        this.k = qe60Var;
        this.l = w6kVar;
        this.m = d39Var;
        this.d = i;
    }
}
