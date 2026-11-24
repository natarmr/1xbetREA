package a;

import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class aw5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1557a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ aw5(sff0 sff0Var, int i, boolean z, wcb wcbVar, boolean z2) {
        this.f1557a = (byte) 10;
        this.e = sff0Var;
        this.d = i;
        this.b = z;
        this.f = wcbVar;
        this.c = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v9 */
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
        ?? r0;
        byte b = this.f1557a;
        boolean z = this.b;
        Object obj3 = this.f;
        int i = this.d;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                qz40 qz40Var = (qz40) obj4;
                bw5 bw5Var = (bw5) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                iiy[] iiyVarArr = iw5.j2;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ydx.F(qz40Var, fetVar).getValue();
                    zfn zfnVar = zaq0.b;
                    long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
                    ljc ljcVar = jd8.n;
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ljcVar);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    boolean z2 = fetVar.S;
                    pcy pcyVar = e7z.u1;
                    if (z2) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar, x5dVarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar, numValueOf, shdVar3);
                    jpm0.n(fetVar);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC0, shdVar4);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    bw5Var.d.F(jr8.f16991a, fetVar, 6);
                    fetVar.r(true);
                    fetVar.e0(428208694);
                    mm40 mm40VarQ2 = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar);
                    if (z) {
                        mm40VarQ2 = o050.P(mm40VarQ2);
                    }
                    if (!this.c || i == 0) {
                        r0 = 0;
                        fetVar.e0(-824543314);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-824697570);
                        WeakHashMap weakHashMap = djv0.w;
                        mm40VarQ2 = j120.k0(mm40VarQ2, new dnz(zcm0.i(fetVar).e, 32));
                        r0 = 0;
                        fetVar.r(false);
                    }
                    fetVar.r(r0);
                    zq8.a(r0, fetVar, mm40VarQ2);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                jeb.f((mm40) obj4, (wqh) obj3, this.b, this.c, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                obb.q((mm40) obj4, (a2m) obj3, this.b, (fet) obj, x8x.L(1 | i), this.c ? 1 : 0);
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                jwb.v((mm40) obj4, (vzm) obj3, this.b, (fet) obj, x8x.L(1 | i), this.c ? 1 : 0);
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                fxb.w((mm40) obj4, (xzm) obj3, this.b, this.c, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                dyb.D((mm40) obj4, (yzm) obj3, this.b, this.c, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                sac.C((mm40) obj4, (k1n) obj3, this.b, this.c, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                z1x.d((mm40) obj4, this.b, (ugd) obj3, (fet) obj, x8x.L(i | 1), this.c ? 1 : 0);
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                g7x.c((String) obj4, (y3d) obj3, this.b, this.c, (fet) obj, x8x.L(1 | i));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                k7x.w((mm40) obj4, (vui0) obj3, this.b, (fet) obj, x8x.L(1 | i), this.c ? 1 : 0);
                return Unit.f46060a;
            default:
                sff0 sff0Var = (sff0) obj4;
                hpl0 hpl0Var = (hpl0) obj2;
                boolean z3 = sff0Var.J;
                return hpl0.a(hpl0Var, false, false, null, null, false, null, null, null, null, Integer.valueOf(i), null, Boolean.valueOf(z), Boolean.valueOf(z3), (wcb) obj3, sff0Var.g.y, this.c, 6143);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ aw5(mm40 mm40Var, boolean z, ugd ugdVar, int i, int i2) {
        this.f1557a = (byte) 7;
        this.e = mm40Var;
        this.b = z;
        this.f = ugdVar;
        this.d = i;
        this.c = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ aw5(mm40 mm40Var, Object obj, boolean z, int i, int i2, byte b) {
        this.f1557a = b;
        this.e = mm40Var;
        this.f = obj;
        this.b = z;
        this.d = i;
        this.c = i2;
    }

    public /* synthetic */ aw5(Object obj, Object obj2, boolean z, boolean z2, int i, byte b) {
        this.f1557a = b;
        this.e = obj;
        this.f = obj2;
        this.b = z;
        this.c = z2;
        this.d = i;
    }

    public /* synthetic */ aw5(String str, y3d y3dVar, boolean z, boolean z2, int i) {
        this.f1557a = (byte) 8;
        this.e = str;
        this.f = y3dVar;
        this.b = z;
        this.c = z2;
        this.d = i;
    }
}
