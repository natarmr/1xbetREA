package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z2w implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43691a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z2w(dk5 dk5Var, boolean z, pz40 pz40Var, pz40 pz40Var2, l7m0 l7m0Var) {
        this.d = dk5Var;
        this.b = z;
        this.e = pz40Var;
        this.f = pz40Var2;
        this.c = l7m0Var;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        fet fetVar;
        fet fetVar2;
        byte b = this.f43691a;
        cl5 cl5Var = ukd.f35823a;
        Object obj5 = this.c;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (b) {
            case 0:
                hdz hdzVar = (hdz) obj8;
                kie0 kie0Var = (kie0) obj7;
                pk5 pk5Var = (pk5) obj6;
                Function1 function1 = (Function1) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((g9z) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= fetVar3.e(iIntValue) ? 32 : 16;
                }
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    vk5 vk5Var = (vk5) hdzVar.b(iIntValue);
                    boolean z = vk5Var instanceof ogs0;
                    jm40 jm40Var = jm40.b;
                    if (z) {
                        fetVar3.e0(658770465);
                        if (kie0Var.f18333a < 3) {
                            fetVar3.e0(658843532);
                            int i = kie0Var.f18333a + 1;
                            kie0Var.f18333a = i;
                            if (i > 1) {
                                fetVar3.e0(658940376);
                                mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar3.k(zaq0.b)).getBackgroundContent(), jd8.n);
                                zcl zclVar = qmk.f28987a;
                                rcb.p(0, fetVar3, s5x0.N(mm40VarQ, 64.0f, 0.0f, 0.0f, 0.0f, 14));
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(659301712);
                                fetVar3.r(false);
                            }
                            ogs0 ogs0Var = (ogs0) vk5Var;
                            String str = ogs0Var.f;
                            String str2 = ogs0Var.e;
                            int i2 = ogs0Var.i;
                            rdj rdjVar = rdj.f30294a;
                            thb.n(i2, 0, fetVar3, null, str, str2, rdj.g(new znq0(ogs0Var.b), efj.UNIVERSAL, Boolean.valueOf(((mk5) pk5Var).f21927a), false, 56));
                            fetVar = fetVar3;
                            fetVar.r(false);
                        } else {
                            fetVar = fetVar3;
                            fetVar.e0(659985200);
                            fetVar.r(false);
                        }
                        fetVar.r(false);
                    } else if (Intrinsics.d(vk5Var, ues0.f35545a)) {
                        fetVar3.e0(991124193);
                        zcl zclVar2 = qmk.f28987a;
                        egm0.c(16.0f, fetVar3, 0, 0);
                        fetVar3.r(false);
                    } else if (Intrinsics.d(vk5Var, gxn.f12084a)) {
                        fetVar3.e0(660238346);
                        if (this.b) {
                            fetVar3.e0(660335345);
                            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar3 = qmk.f28987a;
                            mm40 mm40VarN = s5x0.N(mm40VarD, xfn.a(fetVar3).d, 0.0f, xfn.a(fetVar3).d, 12.0f, 2);
                            Object objP = fetVar3.P();
                            if (objP == cl5Var) {
                                objP = new umu((byte) 25);
                                fetVar3.o0(objP);
                            }
                            Function1 function2 = (Function1) objP;
                            boolean zG = fetVar3.g(function1);
                            Object objP2 = fetVar3.P();
                            if (zG || objP2 == cl5Var) {
                                objP2 = new dht(function1, (byte) 11);
                                fetVar3.o0(objP2);
                            }
                            dwi0.b(function2, mm40VarN, (Function1) objP2, fetVar3, 6, 0);
                            fetVar3.r(false);
                        } else {
                            fetVar3.e0(661844208);
                            fetVar3.r(false);
                        }
                        fetVar3.r(false);
                    } else if (vk5Var == null) {
                        fetVar3.e0(991183286);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(991184598);
                        fetVar3.r(false);
                    }
                } else {
                    fetVar3.X();
                }
                break;
            case 1:
                h1z h1zVar = (h1z) obj8;
                mdm mdmVar = (mdm) obj7;
                Function1 function3 = (Function1) obj5;
                Function0 function0 = (Function0) obj6;
                int iIntValue3 = ((Integer) obj2).intValue();
                fet fetVar4 = (fet) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= fetVar4.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    boolean z2 = this.b;
                    if (iIntValue3 == 0) {
                        fetVar4.e0(1110653668);
                        x0x.f(mdmVar, h1zVar.c, z2, function3, function0, fetVar4, 0);
                        fetVar4.r(false);
                    } else if (iIntValue3 != 1) {
                        fetVar4.e0(1111635841);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(1111168516);
                        x0x.f(mdmVar, h1zVar.e, z2, function3, function0, fetVar4, 0);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                break;
            default:
                dk5 dk5Var = (dk5) obj8;
                pz40 pz40Var = (pz40) obj7;
                pz40 pz40Var2 = (pz40) obj6;
                l7m0 l7m0Var = (l7m0) obj5;
                int iIntValue5 = ((Integer) obj2).intValue();
                fet fetVar5 = (fet) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                ((rk80) obj).getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= fetVar5.e(iIntValue5) ? 32 : 16;
                }
                if (!fetVar5.U(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    fetVar5.X();
                } else if (iIntValue5 == 0) {
                    fetVar5.e0(-1199330542);
                    List list = (List) pz40Var.getValue();
                    boolean zI = fetVar5.i(dk5Var);
                    Object objP3 = fetVar5.P();
                    if (zI || objP3 == cl5Var) {
                        fetVar2 = fetVar5;
                        tfo0 tfo0Var = new tfo0(1, dk5Var, dk5.class, "onLegalItemClick", "onLegalItemClick(Lorg/xplatform/feature/balance_management_old/impl/presentation/adapter/models/LegalUiModel;)V", 0, (byte) 14);
                        fetVar2.o0(tfo0Var);
                        objP3 = tfo0Var;
                    } else {
                        fetVar2 = fetVar5;
                    }
                    fet fetVar6 = fetVar2;
                    hmw0.Q(list, (Function1) ((jhy) objP3), this.b, ddz.a(0, 0, fetVar2, 0, 3), fetVar6, 0);
                    fetVar6.r(false);
                } else {
                    fetVar5.e0(-1198853576);
                    pk5 pk5Var2 = (pk5) pz40Var2.getValue();
                    boolean zI2 = fetVar5.i(dk5Var);
                    Object objP4 = fetVar5.P();
                    if (zI2 || objP4 == cl5Var) {
                        tfo0 tfo0Var2 = new tfo0(1, dk5Var, dk5.class, "onEndOfPaginationReached", "onEndOfPaginationReached(Ljava/util/List;)V", 0, (byte) 15);
                        fetVar5.o0(tfo0Var2);
                        objP4 = tfo0Var2;
                    }
                    jhy jhyVar = (jhy) objP4;
                    boolean zI3 = fetVar5.i(dk5Var);
                    Object objP5 = fetVar5.P();
                    if (zI3 || objP5 == cl5Var) {
                        cym0 cym0Var = new cym0(0, dk5Var, dk5.class, "onRefreshAfterError", "onRefreshAfterError()V", 0, (byte) 5);
                        fetVar5.o0(cym0Var);
                        objP5 = cym0Var;
                    }
                    jhy jhyVar2 = (jhy) objP5;
                    boolean zI4 = fetVar5.i(dk5Var);
                    Object objP6 = fetVar5.P();
                    if (zI4 || objP6 == cl5Var) {
                        tfo0 tfo0Var3 = new tfo0(1, dk5Var, dk5.class, "onErrorWhenRequestNextPage", "onErrorWhenRequestNextPage(Ljava/lang/Throwable;)V", 0, (byte) 16);
                        fetVar5.o0(tfo0Var3);
                        objP6 = tfo0Var3;
                    }
                    jhy jhyVar3 = (jhy) objP6;
                    boolean zI5 = fetVar5.i(dk5Var);
                    Object objP7 = fetVar5.P();
                    if (zI5 || objP7 == cl5Var) {
                        tfo0 tfo0Var4 = new tfo0(1, dk5Var, dk5.class, "onErrorWhenRequest", "onErrorWhenRequest(Ljava/lang/Throwable;)V", 0, (byte) 17);
                        fetVar5.o0(tfo0Var4);
                        objP7 = tfo0Var4;
                    }
                    jhy jhyVar4 = (jhy) objP7;
                    xcz xczVarA = ddz.a(0, 0, fetVar5, 0, 3);
                    boolean zI6 = fetVar5.i(dk5Var);
                    Object objP8 = fetVar5.P();
                    if (zI6 || objP8 == cl5Var) {
                        cym0 cym0Var2 = new cym0(0, dk5Var, dk5.class, "onRefresh", "onRefresh()V", 0, (byte) 6);
                        fetVar5.o0(cym0Var2);
                        objP8 = cym0Var2;
                    }
                    y0x0.n(pk5Var2, (Function1) jhyVar, (jk5) l7m0Var.getValue(), (Function1) jhyVar3, (Function1) jhyVar4, (Function0) jhyVar2, (Function0) ((jhy) objP8), xczVarA, fetVar5, 0);
                    fetVar5.r(false);
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ z2w(h1z h1zVar, mdm mdmVar, boolean z, Function1 function1, Function0 function0) {
        this.d = h1zVar;
        this.e = mdmVar;
        this.b = z;
        this.c = function1;
        this.f = function0;
    }

    public /* synthetic */ z2w(hdz hdzVar, kie0 kie0Var, pk5 pk5Var, boolean z, Function1 function1) {
        this.d = hdzVar;
        this.e = kie0Var;
        this.f = pk5Var;
        this.b = z;
        this.c = function1;
    }
}
