package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o3m implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24592a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o3m(Object obj, boolean z, byte b) {
        this.f24592a = b;
        this.c = obj;
        this.b = z;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        byte b = this.f24592a;
        mm40 mm40VarD0 = jm40.b;
        boolean z = this.b;
        final byte b2 = 1;
        Object obj4 = this.c;
        boolean z2 = false;
        switch (b) {
            case 0:
                final i3m i3mVar = (i3m) obj4;
                fet fetVar = (fet) obj2;
                ((Integer) obj3).getClass();
                ((mm40) obj).getClass();
                fetVar.e0(55262361);
                if (z) {
                    final Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = new Object();
                        fetVar.o0(objP);
                    }
                    boolean zG = fetVar.g(i3mVar) | fetVar.i(objP);
                    Object objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        final byte b3 = z2 ? (byte) 1 : (byte) 0;
                        objP2 = new Function1() { // from class: a.p3m
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                byte b4 = b3;
                                Object obj6 = objP;
                                i3m i3mVar2 = i3mVar;
                                switch (b4) {
                                    case 0:
                                        ((lwk) obj5).getClass();
                                        return new pr0(i3mVar2, obj6, (byte) 10);
                                    default:
                                        j6z j6zVar = (j6z) obj5;
                                        j6zVar.getClass();
                                        float f = k7x.C(j6zVar).w(j6zVar, true).d;
                                        obj6.getClass();
                                        i3mVar2.f14104a.put(obj6, Float.valueOf(f));
                                        return Unit.f46060a;
                                }
                            }
                        };
                        fetVar.o0(objP2);
                    }
                    m0x0.n(i3mVar, objP, (Function1) objP2, fetVar);
                    boolean zG2 = fetVar.g(i3mVar) | fetVar.i(objP);
                    Object objP3 = fetVar.P();
                    if (zG2 || objP3 == cl5Var) {
                        objP3 = new Function1() { // from class: a.p3m
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                byte b4 = b2;
                                Object obj6 = objP;
                                i3m i3mVar2 = i3mVar;
                                switch (b4) {
                                    case 0:
                                        ((lwk) obj5).getClass();
                                        return new pr0(i3mVar2, obj6, (byte) 10);
                                    default:
                                        j6z j6zVar = (j6z) obj5;
                                        j6zVar.getClass();
                                        float f = k7x.C(j6zVar).w(j6zVar, true).d;
                                        obj6.getClass();
                                        i3mVar2.f14104a.put(obj6, Float.valueOf(f));
                                        return Unit.f46060a;
                                }
                            }
                        };
                        fetVar.o0(objP3);
                    }
                    mm40VarD0 = ro4.d0(mm40VarD0, (Function1) objP3);
                }
                fetVar.r(false);
                return mm40VarD0;
            case 1:
                pz40 pz40Var = (pz40) obj4;
                lrm lrmVar = (lrm) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                lrmVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar2.g(lrmVar) ? 4 : 2;
                }
                if (!fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    fetVar2.X();
                } else if (lrmVar instanceof krm) {
                    fetVar2.e0(-700197930);
                    qcc.E(0, fetVar2);
                    fetVar2.r(false);
                } else if (lrmVar instanceof jrm) {
                    fetVar2.e0(-700195530);
                    jrm jrmVar = (jrm) lrmVar;
                    qcc.D(this.b, jrmVar.f17009a, jrmVar.b, ((drm) pz40Var.getValue()).d, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    if (!(lrmVar instanceof irm)) {
                        throw b1j.f(-700199528, fetVar2, false);
                    }
                    fetVar2.e0(-700187359);
                    fetVar2.r(false);
                }
                return Unit.f46060a;
            case 2:
                kpm kpmVar = (kpm) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    mm40 mm40VarW = o7k0.w(o7k0.d(mm40VarD0, 1.0f), null, false, 3);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40VarW, 0.0f, 12.0f, 1);
                    zfn zfnVar = zaq0.b;
                    long backgroundContent = ((ThemeColors) fetVar3.k(zfnVar)).getBackgroundContent();
                    zcl zclVar2 = qmk.g;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarQ = i120.Q(mm40VarL, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                    int iHashCode = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM = fetVar3.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarQ);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(e7z.u1);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                    String strW = rsm0.w(R.string.statistic_forecast_score_title, 0, fetVar3);
                    ((g1t0) fetVar3.k(j1t0.e)).getClass();
                    y9q0 y9q0VarN = g1t0.n();
                    long secondary = ((ThemeColors) fetVar3.k(zfnVar)).getSecondary();
                    xx7 xx7Var = gqw0.n;
                    v8q0.a(strW, s5x0.N(s5x0.L(new wkw(xx7Var), 16.0f, 0.0f, 2), 0.0f, 8.0f, 0.0f, 0.0f, 13), secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarN, fetVar3, 0, 0, 131064);
                    n4c.l(s5x0.N(s5x0.L(new wkw(xx7Var), 16.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 8.0f, 5), kpmVar, z, fetVar3, 0);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                uvv uvvVar = (uvv) obj4;
                lr8 lr8Var = (lr8) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                lr8Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar4.g(lr8Var) ? 4 : 2;
                }
                if (!fetVar4.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    fetVar4.X();
                } else if (z) {
                    fetVar4.e0(-698020248);
                    hmw0.E(null, uvvVar, lr8Var.d(), fetVar4, 0);
                    fetVar4.r(false);
                } else {
                    fetVar4.e0(-697883352);
                    hmw0.D(null, uvvVar, lr8Var.d(), fetVar4, 0);
                    fetVar4.r(false);
                }
                return Unit.f46060a;
            case 4:
                zdm0 zdm0Var = (zdm0) obj4;
                fet fetVar5 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    if (zdm0Var != null) {
                        if (zdm0Var instanceof ydm0) {
                            fetVar5.e0(-585603302);
                            ucx.A(((ydm0) zdm0Var).b, z, fetVar5, 0);
                            fetVar5.r(false);
                        } else if (zdm0Var instanceof xdm0) {
                            fetVar5.e0(-585597369);
                            ucx.T(0, fetVar5, null);
                            fetVar5.r(false);
                        } else if (zdm0Var instanceof wdm0) {
                            fetVar5.e0(-585595003);
                            zq8.a(6, fetVar5, mm40VarD0);
                            fetVar5.r(false);
                        }
                    }
                    throw b1j.f(-585605657, fetVar5, false);
                }
                fetVar5.X();
                return Unit.f46060a;
            case 5:
                d9d0 d9d0Var = (d9d0) obj4;
                ir8 ir8Var = (ir8) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ir8Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar6.g(ir8Var) ? 4 : 2;
                }
                if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    v8d0 v8d0Var = v8d0.f36977a;
                    zfn zfnVar2 = zaq0.b;
                    long backgroundContent2 = ((ThemeColors) fetVar6.k(zfnVar2)).getBackgroundContent();
                    long secondary2 = ((ThemeColors) fetVar6.k(zfnVar2)).getSecondary();
                    mm40 mm40VarB = ir8Var.b(mm40VarD0, gqw0.b);
                    zcl zclVar3 = qmk.f28987a;
                    v8d0Var.a(d9d0Var, this.b, s5x0.N(mm40VarB, 0.0f, 168.0f, 0.0f, 0.0f, 13), backgroundContent2, secondary2, 0.0f, fetVar6, 1572864, 32);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            default:
                n1e0 n1e0Var = (n1e0) obj4;
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar7.g(yhg0Var) ? 4 : 2;
                }
                if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    mm40 mm40VarA = yhg0Var.a(1.0f, mm40VarD0, true);
                    String str = n1e0Var.b;
                    pz40 pz40Var2 = s6t0.f31722a;
                    v8q0.a(str, mm40VarA, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(z ? 6 : 5), 0L, 2, false, 2, 0, null, y9q0.a(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), 0L, 0L, null, null, null, 0L, null, null, 0, 3, 0L, null, null, 16711679), fetVar7, 0, 24960, 109560);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ o3m(boolean z, Object obj, byte b) {
        this.f24592a = b;
        this.b = z;
        this.c = obj;
    }
}
