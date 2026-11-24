package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class pdo0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rah0 f26816a;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ ugd c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ugd g;

    public pdo0(rah0 rah0Var, ugd ugdVar, ugd ugdVar2, float f, float f2, int i, ugd ugdVar3) {
        this.f26816a = rah0Var;
        this.b = ugdVar;
        this.c = ugdVar2;
        this.d = f;
        this.e = f2;
        this.f = i;
        this.g = ugdVar3;
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
        shd shdVar;
        Object ndo0Var;
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            yt40 yt40Var = yt40.f43200a;
            nul0 nul0VarP = d7x.P(yt40Var, fetVar);
            nul0 nul0VarP2 = d7x.P(yt40Var, fetVar);
            rah0 rah0Var = this.f26816a;
            boolean zG = fetVar.g(rah0Var) | fetVar.g(vneVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new cch0(rah0Var, vneVar, nul0VarP);
                fetVar.o0(objP2);
            }
            cch0 cch0Var = (cch0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new odo0(nul0VarP2);
                fetVar.o0(objP3);
            }
            odo0 odo0Var = (odo0) objP3;
            tj30 tj30VarC = zq8.c(gqw0.g, false);
            int iX = e3c.x(fetVar);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar2 = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar2);
            shd shdVar3 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar3);
            shd shdVar4 = gqw0.y;
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                rw2.t(iX, fetVar, iX, shdVar4);
            }
            shd shdVar5 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar5);
            this.b.invoke(fetVar, 0);
            List listJ = q3d.j(this.c, u1c.M(509386037, new a8(this.g, odo0Var, (byte) 23), fetVar));
            mm40 mm40VarK = lgb.K(pai0.a(wha0.P(o7k0.y(o7k0.d(jm40Var, 1.0f), gqw0.d, 2), rah0Var, false, 14), false, new eoh0((byte) 15)));
            float f = this.d;
            boolean zD = fetVar.d(f);
            float f2 = this.e;
            boolean zD2 = zD | fetVar.d(f2);
            int i = this.f;
            boolean zE = zD2 | fetVar.e(i) | fetVar.i(cch0Var);
            Object objP4 = fetVar.P();
            if (zE || objP4 == cl5Var) {
                shdVar = shdVar2;
                ndo0Var = new ndo0(f, f2, odo0Var, i, cch0Var);
                fetVar.o0(ndo0Var);
            } else {
                ndo0Var = objP4;
                shdVar = shdVar2;
            }
            sv40 sv40Var = (sv40) ndo0Var;
            ugd ugdVarE = l7x.E(listJ);
            boolean zG2 = fetVar.g(sv40Var);
            Object objP5 = fetVar.P();
            if (zG2 || objP5 == cl5Var) {
                objP5 = new tv40(sv40Var);
                fetVar.o0(objP5);
            }
            tj30 tj30Var = (tj30) objP5;
            int iX2 = e3c.x(fetVar);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarK);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar3);
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX2))) {
                rw2.t(iX2, fetVar, iX2, shdVar4);
            }
            jpm0.o(fetVar, mm40VarC1, shdVar5);
            ugdVarE.invoke(fetVar, 0);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
