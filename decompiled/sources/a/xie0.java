package a;

import android.gov.nist.core.Separators;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xie0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40941a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ eje0 c;

    public /* synthetic */ xie0(mm40 mm40Var, eje0 eje0Var) {
        this.f40941a = (byte) 0;
        this.b = mm40Var;
        this.c = eje0Var;
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
        final byte b;
        boolean z;
        byte b2 = this.f40941a;
        final eje0 eje0Var = this.c;
        mm40 mm40Var = this.b;
        switch (b2) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                    pz40 pz40Var = s6t0.f31722a;
                    long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                    zcl zclVar = qmk.e;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    yx7 yx7Var = gqw0.k;
                    thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    dww.c(a8k0.F(R.drawable.ic_football, 0, fetVar), null, o7k0.n(jm40Var, 16.0f), s6t0.b().f33626a.getSecondary(), fetVar, 56, 0);
                    mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    zhg0 zhg0Var = zhg0.f44392a;
                    mm40 mm40VarA = zhg0Var.a(1.0f, mm40VarN, true);
                    v8q0.a(eje0Var.f7905a, mm40VarA, s6t0.b().f33626a.getTextPrimary(), null, g1t0.d().f42262a.b, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 109544);
                    fetVar.r(true);
                    mm40 mm40VarN2 = s5x0.N(o7k0.d(mm40Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    nw3 nw3Var = uc9.e;
                    thg0 thg0VarA2 = shg0.a(nw3Var, yx7Var, fetVar, 54);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN2);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA2, shdVar);
                    jpm0.o(fetVar, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar4);
                    v8q0.a(eje0Var.f, s5x0.N(zhg0Var.a(1.0f, jm40Var, true), 0.0f, 0.0f, 8.0f, 0.0f, 11), s6t0.b().f33626a.getTextPrimary(), null, g1t0.d().f42262a.b, null, null, g1t0.d().f42262a.f, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, null, fetVar, 0, 24960, 240488);
                    mm40 mm40VarN3 = o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 32.0f);
                    boolean zG = fetVar.g(eje0Var);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (zG || objP == cl5Var) {
                        b = 0;
                        objP = new Function0() { // from class: a.yie0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b3 = b;
                                eje0 eje0Var2 = eje0Var;
                                switch (b3) {
                                    case 0:
                                        return eje0Var2.d;
                                    default:
                                        return eje0Var2.e;
                                }
                            }
                        };
                        fetVar.o0(objP);
                    } else {
                        b = 0;
                    }
                    kkb.p(b, fetVar, mm40VarN3, (Function0) objP);
                    v8q0.a(eje0Var.b, jm40Var, s6t0.b().f33626a.getTextPrimary(), null, g1t0.q().f42262a.b, null, null, g1t0.q().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 48, 0, 260968);
                    v8q0.a(Separators.COLON, s5x0.L(jm40Var, 4.0f, 0.0f, 2), s6t0.b().f33626a.getTextPrimary(), null, g1t0.q().f42262a.b, null, null, g1t0.q().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 6, 0, 260968);
                    v8q0.a(eje0Var.c, jm40Var, s6t0.b().f33626a.getTextPrimary(), null, g1t0.q().f42262a.b, null, null, g1t0.q().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 48, 0, 260968);
                    mm40 mm40VarN4 = o7k0.n(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 32.0f);
                    boolean zG2 = fetVar.g(eje0Var);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        z = true;
                        final char c = 1 == true ? 1 : 0;
                        objP2 = new Function0() { // from class: a.yie0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b3 = c;
                                eje0 eje0Var2 = eje0Var;
                                switch (b3) {
                                    case 0:
                                        return eje0Var2.d;
                                    default:
                                        return eje0Var2.e;
                                }
                            }
                        };
                        fetVar.o0(objP2);
                    } else {
                        z = true;
                    }
                    kkb.p(0, fetVar, mm40VarN4, (Function0) objP2);
                    v8q0.a(eje0Var.g, s5x0.N(zhg0Var.a(1.0f, jm40Var, z), 8.0f, 0.0f, 0.0f, 0.0f, 14), s6t0.b().f33626a.getTextPrimary(), null, g1t0.d().f42262a.b, null, null, g1t0.d().f42262a.f, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, null, fetVar, 0, 24960, 240488);
                    fetVar.r(true);
                    mm40 mm40VarD3 = o7k0.d(s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, 8.0f, 5), 1.0f);
                    thg0 thg0VarA3 = shg0.a(nw3Var, gqw0.j, fetVar, 6);
                    int iHashCode4 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM4 = fetVar.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarD3);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA3, shdVar);
                    jpm0.o(fetVar, bh90VarM4, shdVar2);
                    vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC3, shdVar4);
                    ydx.h(zhg0Var.a(1.0f, jm40Var, true), eje0Var, fetVar, 0);
                    v8q0.a(eje0Var.h, s5x0.L(jm40Var, 8.0f, 0.0f, 2), s6t0.b().f33626a.getSecondary(), null, g1t0.n().f42262a.b, null, null, g1t0.n().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                    ydx.i(zhg0Var.a(1.0f, jm40Var, true), eje0Var, fetVar, 0);
                    fetVar.r(true);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ydx.i(mm40Var, eje0Var, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                ydx.h(mm40Var, eje0Var, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ xie0(mm40 mm40Var, eje0 eje0Var, int i, byte b) {
        this.f40941a = b;
        this.b = mm40Var;
        this.c = eje0Var;
    }
}
