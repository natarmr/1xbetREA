package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.personal.impl.presentation.edit_tj.models.ProfileEditTjUiModel;

/* JADX INFO: loaded from: classes5.dex */
public final class a9m implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f485a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ List d;

    public /* synthetic */ a9m(List list, long j, Function1 function1, byte b) {
        this.f485a = b;
        this.d = list;
        this.b = j;
        this.c = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        fet fetVar;
        boolean z;
        boolean z2;
        String str;
        t7q0 s7q0Var;
        boolean z3;
        String str2;
        t7q0 s7q0Var2;
        byte b = this.f485a;
        List list = this.d;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar2.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar2.e(iIntValue) ? 32 : 16;
                }
                if (fetVar2.U(i & 1, (i & 147) != 146)) {
                    y8m y8mVar = (y8m) ((a4x) list).get(iIntValue);
                    fetVar2.e0(-1635738450);
                    ffb0.p(this.b, y8mVar, this.c, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            default:
                shd shdVar = gqw0.v;
                shd shdVar2 = gqw0.y;
                shd shdVar3 = gqw0.w;
                shd shdVar4 = gqw0.x;
                ljc ljcVar = jd8.n;
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                zx7 zx7Var = gqw0.f11754a;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar3.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar3.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
                    ProfileEditTjUiModel profileEditTjUiModel = (ProfileEditTjUiModel) list.get(iIntValue3);
                    fetVar3.e0(450174157);
                    if (profileEditTjUiModel != null) {
                        boolean z4 = profileEditTjUiModel instanceof ProfileEditTjUiModel.ProfileEditTitleTjUiModel;
                        jm40 jm40Var = jm40.b;
                        if (z4) {
                            fetVar3.e0(450067206);
                            zcl zclVar = qmk.f28987a;
                            nkb.h(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), new hjm(xsm0.s(((ProfileEditTjUiModel.ProfileEditTitleTjUiModel) profileEditTjUiModel).f46797a, fetVar3), new ojm(127), null, null, null, null, false, null, null, false, null, null, 8188), kjm.b, null, null, null, fetVar3, 384, 56);
                            fetVar = fetVar3;
                            fetVar.r(false);
                            z2 = false;
                        } else {
                            fetVar = fetVar3;
                            boolean z5 = profileEditTjUiModel instanceof ProfileEditTjUiModel.ProfileEditItemTjUiModel;
                            long j = this.b;
                            cl5 cl5Var = ukd.f35823a;
                            r7q0 r7q0Var = r7q0.f29989a;
                            e6q0 e6q0Var = e6q0.f7299a;
                            pcy pcyVar = e7z.u1;
                            Function1 function1 = this.c;
                            if (z5) {
                                fetVar.e0(450605273);
                                ProfileEditTjUiModel.ProfileEditItemTjUiModel profileEditItemTjUiModel = (ProfileEditTjUiModel.ProfileEditItemTjUiModel) profileEditTjUiModel;
                                String str3 = profileEditItemTjUiModel.i;
                                boolean z6 = profileEditItemTjUiModel.g;
                                boolean z7 = profileEditItemTjUiModel.f;
                                if (profileEditItemTjUiModel.h) {
                                    fetVar.e0(450646038);
                                    mm40 mm40VarQ = i120.Q(lgb.J(o7k0.d(jm40Var, 1.0f), vgg0.b(e1c0.f(z7), e1c0.f(z7), e1c0.f(z6), e1c0.f(z6))), j, ljcVar);
                                    zcl zclVar2 = qmk.f28987a;
                                    mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarQ, 16.0f, 0.0f, 2), 0.0f, z7 ? 16.0f : 12.0f, 0.0f, z6 ? 16.0f : 12.0f, 5);
                                    tj30 tj30VarC = zq8.c(zx7Var, false);
                                    int iHashCode = Long.hashCode(fetVar.T);
                                    bh90 bh90VarM = fetVar.m();
                                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
                                    mkd.c0.getClass();
                                    fetVar.i0();
                                    if (fetVar.S) {
                                        fetVar.l(pcyVar);
                                    } else {
                                        fetVar.r0();
                                    }
                                    jpm0.o(fetVar, tj30VarC, shdVar4);
                                    jpm0.o(fetVar, bh90VarM, shdVar3);
                                    vqd.u(iHashCode, fetVar, shdVar2, fetVar);
                                    jpm0.o(fetVar, mm40VarC0, shdVar);
                                    String str4 = profileEditItemTjUiModel.b;
                                    if (str3.length() == 0) {
                                        s7q0Var2 = r7q0Var;
                                        str2 = str3;
                                    } else {
                                        str2 = str3;
                                        s7q0Var2 = new s7q0(str2);
                                    }
                                    c6q0 c6q0Var = new c6q0(str4, e6q0Var, o6q0.f24750a, s7q0Var2, profileEditItemTjUiModel.e, str2.length() > 0, null, xsm0.s(profileEditItemTjUiModel.d, fetVar), "", false, 0, null, 260224);
                                    boolean zG = fetVar.g(function1) | fetVar.g(profileEditTjUiModel);
                                    Object objP = fetVar.P();
                                    if (zG || objP == cl5Var) {
                                        objP = new b1c0(function1, profileEditTjUiModel);
                                        fetVar.o0(objP);
                                    }
                                    wvb.t(jm40Var, c6q0Var, 0, null, (Function1) objP, fetVar, 6, 12);
                                    fetVar.r(true);
                                    z3 = false;
                                    fetVar.r(false);
                                } else {
                                    z3 = false;
                                    fetVar.e0(453189805);
                                    fetVar.r(false);
                                }
                                fetVar.r(z3);
                                z2 = false;
                            } else if (profileEditTjUiModel instanceof ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) {
                                fetVar.e0(453343100);
                                ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel profileEditItemClickableTjUiModel = (ProfileEditTjUiModel.ProfileEditItemClickableTjUiModel) profileEditTjUiModel;
                                String str5 = profileEditItemClickableTjUiModel.i;
                                boolean z8 = profileEditItemClickableTjUiModel.g;
                                boolean z9 = profileEditItemClickableTjUiModel.f;
                                if (profileEditItemClickableTjUiModel.h) {
                                    fetVar.e0(453383865);
                                    mm40 mm40VarQ2 = i120.Q(lgb.J(o7k0.d(jm40Var, 1.0f), vgg0.b(e1c0.f(z9), e1c0.f(z9), e1c0.f(z8), e1c0.f(z8))), j, ljcVar);
                                    zcl zclVar3 = qmk.f28987a;
                                    mm40 mm40VarN2 = s5x0.N(s5x0.L(mm40VarQ2, 16.0f, 0.0f, 2), 0.0f, z9 ? 16.0f : 12.0f, 0.0f, z8 ? 16.0f : 12.0f, 5);
                                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                    int iHashCode2 = Long.hashCode(fetVar.T);
                                    bh90 bh90VarM2 = fetVar.m();
                                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
                                    mkd.c0.getClass();
                                    fetVar.i0();
                                    if (fetVar.S) {
                                        fetVar.l(pcyVar);
                                    } else {
                                        fetVar.r0();
                                    }
                                    jpm0.o(fetVar, tj30VarC2, shdVar4);
                                    jpm0.o(fetVar, bh90VarM2, shdVar3);
                                    vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                                    jpm0.o(fetVar, mm40VarC1, shdVar);
                                    String str6 = profileEditItemClickableTjUiModel.b;
                                    if (str5.length() == 0) {
                                        s7q0Var = r7q0Var;
                                        str = str5;
                                    } else {
                                        str = str5;
                                        s7q0Var = new s7q0(str);
                                    }
                                    c6q0 c6q0Var2 = new c6q0(str6, e6q0Var, g6q0.f10780a, s7q0Var, profileEditItemClickableTjUiModel.e, str.length() > 0, null, xsm0.s(profileEditItemClickableTjUiModel.d, fetVar), "", false, 0, null, 260224);
                                    boolean zG2 = fetVar.g(function1) | fetVar.g(profileEditTjUiModel);
                                    Object objP2 = fetVar.P();
                                    if (zG2 || objP2 == cl5Var) {
                                        objP2 = new c1c0(function1, profileEditTjUiModel);
                                        fetVar.o0(objP2);
                                    }
                                    wvb.t(jm40Var, c6q0Var2, 0, null, (Function1) objP2, fetVar, 6, 12);
                                    fetVar.r(true);
                                    z2 = false;
                                    fetVar.r(false);
                                } else {
                                    z2 = false;
                                    fetVar.e0(455770989);
                                    fetVar.r(false);
                                }
                                fetVar.r(z2);
                            } else {
                                z = false;
                            }
                        }
                        fetVar.r(z2);
                    } else {
                        fetVar = fetVar3;
                        z = false;
                    }
                    throw b1j.f(-955309578, fetVar, z);
                }
                fetVar3.X();
                return Unit.f46060a;
        }
    }
}
