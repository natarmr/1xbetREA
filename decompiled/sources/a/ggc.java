package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ggc implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11245a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ggc(Object obj, Object obj2, byte b) {
        this.f11245a = b;
        this.c = obj;
        this.b = obj2;
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
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f11245a;
        cl5 cl5Var = ukd.f35823a;
        boolean z = true;
        Object obj4 = this.c;
        Object obj5 = this.b;
        byte b2 = 18;
        byte b3 = 0;
        switch (b) {
            case 0:
                pwv0 pwv0Var = (pwv0) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Number) obj3).intValue();
                jgc jgcVar = (jgc) obj4;
                pwv0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(pwv0Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    fwv0 fwv0Var = (fwv0) obj5;
                    if ((((iIntValue & 14) ^ 6) <= 4 || !fetVar.g(pwv0Var)) && (iIntValue & 6) != 4) {
                        z = false;
                    }
                    boolean zG = fetVar.g(jgcVar) | z | fetVar.g(fwv0Var);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new hwv0(pwv0Var, jgcVar, fwv0Var);
                        fetVar.o0(objP);
                    }
                    ahy.f898a.j((hwv0) objP, jgcVar, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                jgc jgcVar2 = (jgc) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                sfc sfcVar = (sfc) obj4;
                jgcVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? fetVar2.g(jgcVar2) : fetVar2.i(jgcVar2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean zG2 = fetVar2.g(sfcVar);
                    if ((iIntValue2 & 14) != 4 && ((iIntValue2 & 8) == 0 || !fetVar2.i(jgcVar2))) {
                        z = false;
                    }
                    boolean z2 = zG2 | z;
                    Object objP2 = fetVar2.P();
                    if (z2 || objP2 == cl5Var) {
                        objP2 = new at7(sfcVar, jgcVar2, b2);
                        fetVar2.o0(objP2);
                    }
                    yum0.b(null, (Function1) objP2, u1c.M(-524070679, new ggc(jgcVar2, (fwv0) obj5, b3), fetVar2), fetVar2, 3072);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zgx zgxVar = (zgx) obj4;
                    ugd ugdVar = (ugd) obj5;
                    int i = 0;
                    for (Object obj6 : zgxVar.b) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        ugdVar.O(zgxVar, (d4n) obj6, Integer.valueOf(i), fetVar3, 0);
                        i = i2;
                    }
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            default:
                Function2 function2 = (Function2) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                String str = (String) obj5;
                hwo hwoVar = (hwo) obj4;
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.i(function2) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    nul0 nul0VarP = d7x.P(yt40.d, fetVar4);
                    yje yjeVar = null;
                    boolean zG3 = fetVar4.g(null) | fetVar4.i(hwoVar);
                    Object objP3 = fetVar4.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new goi0(hwoVar, (byte) 9);
                        fetVar4.o0(objP3);
                    }
                    Function0 function0 = (Function0) objP3;
                    Object objP4 = fetVar4.P();
                    if (objP4 == cl5Var) {
                        objP4 = xf0.c(0.0f);
                        fetVar4.o0(objP4);
                    }
                    t33 t33Var = (t33) objP4;
                    Boolean bool = Boolean.TRUE;
                    boolean zI = fetVar4.i(t33Var) | fetVar4.h(true) | fetVar4.i(nul0VarP) | fetVar4.g(function0);
                    Object objP5 = fetVar4.P();
                    if (zI || objP5 == cl5Var) {
                        myj0 myj0Var = new myj0((Object) t33Var, (Object) nul0VarP, (Object) function0, yjeVar, (byte) 7);
                        fetVar4.o0(myj0Var);
                        objP5 = myj0Var;
                    }
                    m0x0.t(fetVar4, bool, (Function2) objP5);
                    l73 l73Var = t33Var.c;
                    nul0 nul0VarP2 = d7x.P(yt40.b, fetVar4);
                    Object objP6 = fetVar4.P();
                    if (objP6 == cl5Var) {
                        objP6 = xf0.c(0.8f);
                        fetVar4.o0(objP6);
                    }
                    t33 t33Var2 = (t33) objP6;
                    boolean zI2 = fetVar4.i(t33Var2) | fetVar4.h(true) | fetVar4.i(nul0VarP2);
                    Object objP7 = fetVar4.P();
                    if (zI2 || objP7 == cl5Var) {
                        objP7 = new kbh0(t33Var2, nul0VarP2, yjeVar, b2);
                        fetVar4.o0(objP7);
                    }
                    m0x0.t(fetVar4, bool, (Function2) objP7);
                    l73 l73Var2 = t33Var2.c;
                    mm40 mm40VarV = i4w0.V(jm40.b, ((Number) ((hgk0) l73Var2.b).getValue()).floatValue(), ((Number) ((hgk0) l73Var2.b).getValue()).floatValue(), ((Number) ((hgk0) l73Var.b).getValue()).floatValue(), 0.0f, null, 131064);
                    boolean zH = fetVar4.h(true) | fetVar4.g(null) | fetVar4.g(str);
                    Object objP8 = fetVar4.P();
                    byte b4 = 14;
                    if (zH || objP8 == cl5Var) {
                        objP8 = new ka6(str, b4);
                        fetVar4.o0(objP8);
                    }
                    mm40 mm40VarA = pai0.a(mm40VarV, false, (Function1) objP8);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iX = e3c.x(fetVar4);
                    bh90 bh90VarM = fetVar4.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarA);
                    mkd.c0.getClass();
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(e7z.u1);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC, gqw0.x);
                    jpm0.o(fetVar4, bh90VarM, gqw0.w);
                    shd shdVar = gqw0.y;
                    if (fetVar4.S || !Intrinsics.d(fetVar4.P(), Integer.valueOf(iX))) {
                        rw2.t(iX, fetVar4, iX, shdVar);
                    }
                    jpm0.o(fetVar4, mm40VarC0, gqw0.v);
                    h97.q(iIntValue4 & 14, fetVar4, function2, true);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
        }
    }
}
