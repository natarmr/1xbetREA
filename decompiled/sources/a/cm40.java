package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class cm40 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4588a = 0;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ xpj0 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ vne e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public cm40(xpj0 xpj0Var, Function0 function0, vne vneVar, boolean z, String str, String str2, String str3, Function2 function2) {
        this.c = xpj0Var;
        this.d = function0;
        this.e = vneVar;
        this.f = z;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.b = function2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4588a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        Function2 function2 = this.b;
        Object obj3 = this.i;
        Object obj4 = this.h;
        byte b2 = 0;
        Object obj5 = this.g;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xpj0 xpj0Var = this.c;
                    boolean zG = fetVar.g(xpj0Var);
                    Function0 function0 = this.d;
                    boolean zG2 = zG | fetVar.g(function0);
                    vne vneVar = this.e;
                    boolean zI = zG2 | fetVar.i(vneVar);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new yl40(xpj0Var, function0, vneVar);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarX = y860.X((Function0) objP);
                    boolean zG3 = fetVar.g(function0) | fetVar.h(this.f) | fetVar.g(xpj0Var) | fetVar.g((String) obj5) | fetVar.g((String) obj4) | fetVar.i(vneVar) | fetVar.g((String) obj3);
                    String str = (String) obj5;
                    String str2 = (String) obj4;
                    String str3 = (String) obj3;
                    Object objP2 = fetVar.P();
                    if (zG3 || objP2 == cl5Var) {
                        acc accVar = new acc(this.f, xpj0Var, str, str2, str3, this.d, this.e);
                        fetVar.o0(accVar);
                        objP2 = accVar;
                    }
                    mm40 mm40VarA = pai0.a(mm40VarX, true, (Function1) objP2);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iX = e3c.x(fetVar);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    shd shdVar = gqw0.y;
                    if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                        rw2.t(iX, fetVar, iX, shdVar);
                    }
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    h97.q(0, fetVar, function2, true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                t33 t33Var = (t33) obj5;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarK0 = j120.k0(o7k0.d(jm40.b, 1.0f), (vhv0) function2.invoke(fetVar2, 0));
                    boolean zI2 = fetVar2.i(t33Var);
                    Object objP3 = fetVar2.P();
                    if (zI2 || objP3 == cl5Var) {
                        objP3 = new m53(t33Var, (byte) 21);
                        fetVar2.o0(objP3);
                    }
                    mm40 mm40VarT = i4w0.T(mm40VarK0, (Function1) objP3);
                    xpj0 xpj0Var2 = this.c;
                    mm40 mm40VarT2 = i4w0.T(mm40VarT, new pp8(xpj0Var2, b2));
                    Function2 function3 = (Function2) obj4;
                    ugd ugdVar = (ugd) obj3;
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iX2 = e3c.x(fetVar2);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarT2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    shd shdVar2 = gqw0.y;
                    if (fetVar2.S || !Intrinsics.d(fetVar2.P(), Integer.valueOf(iX2))) {
                        rw2.t(iX2, fetVar2, iX2, shdVar2);
                    }
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    if (function3 != null) {
                        fetVar2.e0(1352934765);
                        tpj0.a(u1c.M(2000500644, new cm40(xpj0Var2, this.d, this.e, this.f, jtt0.j(R.string.m3c_bottom_sheet_dismiss_description, fetVar2), jtt0.j(R.string.m3c_bottom_sheet_expand_description, fetVar2), jtt0.j(R.string.m3c_bottom_sheet_collapse_description, fetVar2), function3), fetVar2), fetVar2, 54);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(1356009965);
                        fetVar2.r(false);
                    }
                    vqd.t(6, ugdVar, y5d.f42040a, fetVar2, true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public cm40(Function2 function2, t33 t33Var, xpj0 xpj0Var, Function2 function3, ugd ugdVar, Function0 function0, vne vneVar, boolean z) {
        this.b = function2;
        this.g = t33Var;
        this.c = xpj0Var;
        this.h = function3;
        this.i = ugdVar;
        this.d = function0;
        this.e = vneVar;
        this.f = z;
    }
}
