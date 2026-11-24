package a;

import android.content.res.Configuration;
import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sqc0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32623a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sqc0(pz40 pz40Var, pz40 pz40Var2, Function1 function1) {
        this.f32623a = (byte) 4;
        this.c = function1;
        this.b = pz40Var;
        this.d = pz40Var2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        e2d e2dVar = (e2d) this.d;
        Function1 function1 = (Function1) this.c;
        hh80 hh80Var = (hh80) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        hh80Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(hh80Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, hh80Var.d(), 0.0f, 0.0f, 13);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            epv0.I(null, ((x6r0) l7m0Var.getValue()).g, ((x6r0) l7m0Var.getValue()).c, ((x6r0) l7m0Var.getValue()).d, ((x6r0) l7m0Var.getValue()).e, ((x6r0) l7m0Var.getValue()).f, e2dVar, function1, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        shd shdVar;
        shd shdVar2;
        pcy pcyVar;
        mm40 mm40VarN;
        boolean z;
        l7m0 l7m0Var = (l7m0) this.b;
        l7m0 l7m0Var2 = (l7m0) this.c;
        l7m0 l7m0Var3 = (l7m0) this.d;
        yhg0 yhg0Var = (yhg0) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        yhg0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(yhg0Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(l7m0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new g7o0(l7m0Var, (byte) 25);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA = yhg0Var.a(1.0f, jm40Var, true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN2 = s5x0.N(mm40VarA, 12.0f, 0.0f, 4.0f, 0.0f, 10);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN2);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            shd shdVar3 = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar3);
            shd shdVar4 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar5 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar5);
            jpm0.n(fetVar);
            shd shdVar6 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar6);
            if (((CharSequence) l7m0Var.getValue()).length() > 0) {
                shdVar = shdVar5;
                shdVar2 = shdVar3;
                pcyVar = pcyVar2;
                mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 2.0f, 7);
            } else {
                shdVar = shdVar5;
                shdVar2 = shdVar3;
                pcyVar = pcyVar2;
                mm40VarN = jm40Var;
            }
            String str = (String) l7m0Var2.getValue();
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarN, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, ((Number) l7m0VarY.getValue()).intValue(), 0, null, g1t0.n(), fetVar, 0, 384, 110584);
            fet fetVar2 = fetVar;
            if (((CharSequence) l7m0Var.getValue()).length() > 0) {
                fetVar2.e0(241455462);
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA, shdVar2);
                jpm0.o(fetVar2, bh90VarM2, shdVar4);
                vqd.u(iHashCode2, fetVar2, shdVar, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar6);
                mm40 mm40VarN3 = o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 16.0f);
                boolean zG2 = fetVar2.g(l7m0Var3);
                Object objP2 = fetVar2.P();
                if (zG2 || objP2 == cl5Var) {
                    objP2 = new g7o0(l7m0Var3, (byte) 26);
                    fetVar2.o0(objP2);
                }
                kkb.p(0, fetVar2, mm40VarN3, (Function0) objP2);
                v8q0.a((String) l7m0Var.getValue(), null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.n(), fetVar2, 0, 24960, 110586);
                fetVar2 = fetVar2;
                z = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2.e0(242129123);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        l7m0 l7m0Var2 = (l7m0) this.c;
        k3t0 k3t0Var = (k3t0) this.d;
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        mm40Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean zI = fetVar.i(k3t0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new s9r0(k3t0Var, (byte) 5);
                fetVar.o0(objP);
            }
            x4d0.Y(mm40Var, l7m0Var, l7m0Var2, (Function0) objP, fetVar, (iIntValue & 14) | 432);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar;
        byte b = this.f32623a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 2;
        Object obj4 = this.c;
        Object obj5 = this.d;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                frc0 frc0Var = (frc0) obj6;
                Function1 function1 = (Function1) obj4;
                Function1 function2 = (Function1) obj5;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    gfx.l(null, frc0Var, function1, function2, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 1:
                xcz xczVar = (xcz) obj6;
                qkq qkqVar = (qkq) obj4;
                fqj0 fqj0Var = (fqj0) obj5;
                lr8 lr8Var = (lr8) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                lr8Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar3.g(lr8Var) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    Object objP = fetVar3.P();
                    if (objP == cl5Var) {
                        objP = twn.j((float) (((double) lr8Var.d()) * 0.05d), fetVar3);
                    }
                    float f = ((ycl) objP).f42389a;
                    Object objP2 = fetVar3.P();
                    if (objP2 == cl5Var) {
                        objP2 = twn.j(lr8Var.d() * 0.9f, fetVar3);
                    }
                    float f2 = ((ycl) objP2).f42389a;
                    zcl zclVar = qmk.f28987a;
                    qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                    lh80 lh80VarT = s5x0.t(f, 0.0f, 2);
                    boolean zG = fetVar3.g(fqj0Var);
                    Object objP3 = fetVar3.P();
                    if (zG || objP3 == cl5Var) {
                        objP3 = new cel(f2, (Object) fqj0Var, (byte) 7);
                        fetVar3.o0(objP3);
                    }
                    b8k0.f(null, xczVar, lh80VarT, false, qw3Var, null, qkqVar, false, null, (Function1) objP3, fetVar3, 384, 425);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                String str = (String) obj6;
                String str2 = (String) obj4;
                tnd0 tnd0Var = (tnd0) obj5;
                fet fetVar4 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zvw.n(null, str, str2, tnd0Var.b, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 3:
                epd0 epd0Var = (epd0) obj6;
                tnd0 tnd0Var2 = (tnd0) obj5;
                Function1 function3 = (Function1) obj4;
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar5.g(yhg0Var) ? (byte) 4 : (byte) 2;
                }
                if (!fetVar5.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    fetVar5.X();
                } else if (epd0Var.f == null) {
                    fetVar5.e0(386571727);
                    fetVar5.r(false);
                } else {
                    fetVar5.e0(386571728);
                    mm40 mm40VarA = yhg0Var.a(0.25f, jm40Var, true);
                    String str3 = epd0Var.f;
                    boolean z = epd0Var.f8182a;
                    boolean zG2 = fetVar5.g(function3) | fetVar5.i(epd0Var);
                    Object objP4 = fetVar5.P();
                    if (zG2 || objP4 == cl5Var) {
                        objP4 = new wod0((byte) 7, epd0Var, function3);
                        fetVar5.o0(objP4);
                    }
                    zvw.q(mm40VarA, str3, tnd0Var2, z, (Function0) objP4, fetVar5, 0);
                    fetVar5.r(false);
                }
                return Unit.f46060a;
            case 4:
                Function1 function4 = (Function1) obj4;
                pz40 pz40Var = (pz40) obj6;
                pz40 pz40Var2 = (pz40) obj5;
                fet fetVar6 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    zfn zfnVar = jgn.f16489a;
                    float f3 = (((Configuration) fetVar6.k(dy2.f6873a)).smallestScreenWidthDp < 600 ? ign.b : ign.c).f13023a;
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarS = o7k0.s(jm40Var2, f3);
                    zfn zfnVar2 = zaq0.b;
                    long backgroundContent = ((ThemeColors) fetVar6.k(zfnVar2)).getBackgroundContent();
                    zcl zclVar2 = qmk.k;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarS, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 16.0f);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar6, 0);
                    int iHashCode = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM = fetVar6.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar6, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(e7z.u1);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, x5dVarA, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC0, gqw0.v);
                    v8q0.a(((u2e0) pz40Var2.getValue()).b, o7k0.d(jm40Var2, 1.0f), 0L, null, qmk.y, null, psq.f, null, 0L, new f2q0(3), qmk.A, 0, false, 0, 0, null, null, fetVar6, 1572912, 0, 258988);
                    mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var2, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
                    String str4 = ((u2e0) pz40Var2.getValue()).c;
                    long textPrimary = ((ThemeColors) fetVar6.k(zfnVar2)).getTextPrimary();
                    ((g1t0) fetVar6.k(j1t0.e)).getClass();
                    v8q0.a(str4, mm40VarN, textPrimary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, g1t0.v(), fetVar6, 0, 24960, 109560);
                    mm40 mm40VarN2 = s5x0.N(jm40Var2, 0.0f, 6.0f, 0.0f, 0.0f, 13);
                    int i = ((u2e0) pz40Var2.getValue()).f34941a;
                    boolean zG3 = fetVar6.g(function4);
                    Object objP5 = fetVar6.P();
                    if (zG3 || objP5 == cl5Var) {
                        objP5 = new dvd0(function4, (byte) 8);
                        fetVar6.o0(objP5);
                    }
                    aad.C(i, 0, fetVar6, mm40VarN2, (Function1) objP5);
                    boolean z2 = ((u2e0) pz40Var2.getValue()).e;
                    pzn pznVarD = kzn.d(null, 0.0f, 3);
                    yx7 yx7Var = gqw0.j;
                    b34.e(y5d.f42040a, z2, null, pznVarD.a(kzn.c(null, yx7Var, 13)), kzn.e(null, 3).a(kzn.i(null, yx7Var, 13)), null, u1c.M(1441390553, new q42(pz40Var2, b2), fetVar6), fetVar6, 1600518, 18);
                    mm40 mm40VarN3 = s5x0.N(jm40Var2, 0.0f, 28.0f, 0.0f, 0.0f, 13);
                    boolean z3 = ((u2e0) pz40Var2.getValue()).f;
                    String str5 = ((u2e0) pz40Var2.getValue()).h;
                    String str6 = ((u2e0) pz40Var2.getValue()).i;
                    boolean zG4 = fetVar6.g(pz40Var);
                    Object objP6 = fetVar6.P();
                    if (zG4 || objP6 == cl5Var) {
                        objP6 = new rip(pz40Var, (byte) 20);
                        fetVar6.o0(objP6);
                    }
                    Function0 function0 = (Function0) objP6;
                    boolean zG5 = fetVar6.g(pz40Var);
                    Object objP7 = fetVar6.P();
                    if (zG5 || objP7 == cl5Var) {
                        objP7 = new rip(pz40Var, (byte) 21);
                        fetVar6.o0(objP7);
                    }
                    aad.i(mm40VarN3, z3, str5, str6, function0, (Function0) objP7, fetVar6, 0);
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 5:
                cgk0 cgk0Var = (cgk0) obj4;
                cgk0 cgk0Var2 = (cgk0) obj5;
                int iIntValue6 = ((Integer) obj).intValue();
                int iIntValue7 = ((Integer) obj2).intValue();
                ((Integer) obj3).getClass();
                int iOrdinal = ((t9v0) ((List) obj6).get(iIntValue6)).f33588a.ordinal();
                if (iOrdinal == 0) {
                    cgk0Var.m(iIntValue7);
                } else if (iOrdinal == 1) {
                    cgk0Var2.m(iIntValue7);
                }
                return Unit.f46060a;
            case 6:
                String str7 = (String) obj6;
                edg0 edg0Var = (edg0) obj4;
                cdg0 cdg0Var = (cdg0) obj5;
                fet fetVar7 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (!fetVar7.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    fetVar7.X();
                } else if (StringsKt.W(str7)) {
                    fetVar7.e0(1103533441);
                    fetVar7.r(false);
                } else {
                    fetVar7.e0(1102853456);
                    zx7 zx7Var = gqw0.e;
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(jm40Var, 18.0f);
                    tj30 tj30VarC = zq8.c(zx7Var, false);
                    int iHashCode2 = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM2 = fetVar7.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar7, mm40VarE);
                    mkd.c0.getClass();
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(e7z.u1);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, tj30VarC, gqw0.x);
                    jpm0.o(fetVar7, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar7, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar7);
                    jpm0.o(fetVar7, mm40VarC1, gqw0.v);
                    v8q0.a(str7, o2e.e0(jm40Var, "YEAR_CONTENT"), cdg0Var.e ? edg0Var.c : edg0Var.d, null, 0L, null, new psq(500), null, 0L, new f2q0(3), qmk.q, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar7, 1572912, 24960, 107448);
                    fetVar7.r(true);
                    fetVar7.r(false);
                }
                return Unit.f46060a;
            case 7:
                Function2 function5 = (Function2) obj6;
                dlg0 dlg0Var = (dlg0) obj4;
                qge qgeVar = (qge) obj5;
                mz3 mz3Var = (mz3) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                mz3Var.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar8.g(mz3Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar8.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    zcl zclVar4 = qmk.i;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    mm40 mm40VarD = o7k0.d(dw9.i(zclVar4, zclVar4, zclVar4, zclVar4, jm40Var), 1.0f);
                    boolean zG6 = fetVar8.g(function5) | fetVar8.i(dlg0Var);
                    Object objP8 = fetVar8.P();
                    if (zG6 || objP8 == cl5Var) {
                        objP8 = new gvb0(function5, dlg0Var, (byte) 28);
                        fetVar8.o0(objP8);
                    }
                    j0x.b(mz3Var, null, y860.W(mm40VarD, null, null, false, null, (Function0) objP8, 28), null, qgeVar, 0.0f, null, fetVar8, (iIntValue9 & 14) | 48, 104);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                yhh0 yhh0Var = (yhh0) obj6;
                xfh0 xfh0Var = (xfh0) obj4;
                pkk0 pkk0Var = (pkk0) obj5;
                mm40 mm40Var = (mm40) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                cge0 cge0Var = xfh0.V1;
                mm40Var.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar9.g(mm40Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar9.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    imm immVar = yhh0Var.f42637a;
                    boolean zI = fetVar9.i(xfh0Var);
                    Object objP9 = fetVar9.P();
                    if (zI || objP9 == cl5Var) {
                        objP9 = new ufh0(xfh0Var, (byte) 4);
                        fetVar9.o0(objP9);
                    }
                    Function0 function6 = (Function0) objP9;
                    boolean zI2 = fetVar9.i(xfh0Var);
                    Object objP10 = fetVar9.P();
                    if (zI2 || objP10 == cl5Var) {
                        objP10 = new vfh0(xfh0Var, (byte) 1);
                        fetVar9.o0(objP10);
                    }
                    Function1 function7 = (Function1) objP10;
                    boolean zG7 = fetVar9.g(pkk0Var);
                    Object objP11 = fetVar9.P();
                    if (zG7 || objP11 == cl5Var) {
                        objP11 = new ifc(pkk0Var, (byte) 1);
                        fetVar9.o0(objP11);
                    }
                    hlm.c(mm40Var, immVar, null, function6, null, null, function7, null, (Function0) objP11, null, null, null, fetVar9, iIntValue10 & 14, 0, 3764);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                yhh0 yhh0Var2 = (yhh0) obj6;
                xcz xczVar2 = (xcz) obj4;
                xfh0 xfh0Var2 = (xfh0) obj5;
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                cge0 cge0Var2 = xfh0.V1;
                mm40Var2.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= fetVar10.g(mm40Var2) ? 4 : 2;
                }
                if (fetVar10.U(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    hfh0 hfh0Var = yhh0Var2.d;
                    l7m0 l7m0Var = yhh0Var2.b;
                    boolean z4 = yhh0Var2.c;
                    k3t0 k3t0VarG0 = xfh0Var2.G0();
                    boolean zI3 = fetVar10.i(k3t0VarG0);
                    Object objP12 = fetVar10.P();
                    if (zI3 || objP12 == cl5Var) {
                        objP12 = new aif0(1, k3t0VarG0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29);
                        fetVar10.o0(objP12);
                    }
                    c3x.l(mm40Var2, hfh0Var, l7m0Var, z4, xczVar2, (Function1) ((jhy) objP12), fetVar10, iIntValue11 & 14);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                crh0 crh0Var = (crh0) obj6;
                Function0 function8 = (Function0) obj5;
                Function1 function9 = (Function1) obj4;
                fet fetVar11 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar11.U(1 & iIntValue12, (iIntValue12 & 17) != 16)) {
                    if (crh0Var == null) {
                        fetVar = fetVar11;
                    } else if (crh0Var instanceof zqh0) {
                        fetVar11.e0(485159741);
                        ccq0.x(function8, ddz.a(0, 0, fetVar11, 0, 3), function9, ((zqh0) crh0Var).f44807a, fetVar11, 0);
                        fetVar11.r(false);
                    } else {
                        fetVar = fetVar11;
                        if (crh0Var instanceof arh0) {
                            fetVar.e0(485532919);
                            wb.l(((arh0) crh0Var).f1347a, fetVar, 0);
                            fetVar.r(false);
                        } else if (crh0Var instanceof brh0) {
                            fetVar.e0(485727165);
                            cfx0.w(0, fetVar);
                            fetVar.r(false);
                        }
                    }
                    throw b1j.f(-1231278162, fetVar, false);
                }
                fetVar11.X();
                return Unit.f46060a;
            case 11:
                l7m0 l7m0Var2 = (l7m0) obj6;
                x7a x7aVar = (x7a) obj4;
                k3t0 k3t0Var = (k3t0) obj5;
                hh80 hh80Var = (hh80) obj;
                fet fetVar12 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= fetVar12.g(hh80Var) ? 4 : 2;
                }
                if (!fetVar12.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    fetVar12.X();
                } else if (((wlj0) l7m0Var2.getValue()).g) {
                    fetVar12.e0(-862063508);
                    mm40 mm40VarI = s5x0.I(jm40Var, hh80Var);
                    mdm mdmVar = ((wlj0) l7m0Var2.getValue()).h;
                    boolean zI4 = fetVar12.i(k3t0Var);
                    Object objP13 = fetVar12.P();
                    if (zI4 || objP13 == cl5Var) {
                        objP13 = new uki0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 21);
                        fetVar12.o0(objP13);
                    }
                    m0x0.q(mm40VarI, mdmVar, (Function1) ((jhy) objP13), fetVar12, 0);
                    fetVar12.r(false);
                } else {
                    fetVar12.e0(-862307881);
                    mm40 mm40VarI2 = s5x0.I(jm40Var, hh80Var);
                    boolean zI5 = fetVar12.i(k3t0Var);
                    Object objP14 = fetVar12.P();
                    if (zI5 || objP14 == cl5Var) {
                        objP14 = new uki0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 20);
                        fetVar12.o0(objP14);
                    }
                    m0x0.k(mm40VarI2, l7m0Var2, x7aVar, (Function1) ((jhy) objP14), fetVar12, x7a.d << 6);
                    fetVar12.r(false);
                }
                return Unit.f46060a;
            case 12:
                x480 x480Var = (x480) obj6;
                Fragment fragment = (Fragment) obj4;
                v480 v480Var = (v480) obj5;
                fet fetVar13 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((mm40) obj).getClass();
                if (fetVar13.U(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    x480Var.getClass();
                    x480.a(jm40Var, fragment, v480Var, fetVar13);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 13:
                f3d f3dVar = (f3d) obj6;
                fpk0 fpk0Var = (fpk0) obj4;
                l7m0 l7m0Var3 = (l7m0) obj5;
                mm40 mm40Var3 = (mm40) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                zie0 zie0Var = fpk0.V1;
                mm40Var3.getClass();
                if ((iIntValue15 & 6) == 0) {
                    iIntValue15 |= fetVar14.g(mm40Var3) ? (byte) 4 : (byte) 2;
                }
                if (fetVar14.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                    owk0 owk0Var = (owk0) l7m0Var3.getValue();
                    boolean zI6 = fetVar14.i(fpk0Var);
                    Object objP15 = fetVar14.P();
                    if (zI6 || objP15 == cl5Var) {
                        objP15 = new cpk0(fpk0Var, (byte) 4);
                        fetVar14.o0(objP15);
                    }
                    Function0 function10 = (Function0) objP15;
                    boolean zI7 = fetVar14.i(fpk0Var);
                    Object objP16 = fetVar14.P();
                    if (zI7 || objP16 == cl5Var) {
                        objP16 = new cpk0(fpk0Var, (byte) 5);
                        fetVar14.o0(objP16);
                    }
                    l7x.B(mm40Var3, owk0Var, f3dVar, function10, (Function0) objP16, fetVar14, iIntValue15 & 14);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 14:
                l7m0 l7m0Var4 = (l7m0) obj6;
                eil0 eil0Var = (eil0) obj4;
                w0q w0qVar = (w0q) obj5;
                yhg0 yhg0Var2 = (yhg0) obj;
                fet fetVar15 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                yhg0Var2.getClass();
                if ((iIntValue16 & 6) == 0) {
                    iIntValue16 |= fetVar15.g(yhg0Var2) ? (byte) 4 : (byte) 2;
                }
                if (fetVar15.U(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                    String str8 = (String) l7m0Var4.getValue();
                    cil0 cil0Var = (cil0) eil0Var;
                    y9q0 y9q0Var = cil0Var.b;
                    long j = w0qVar.d;
                    zcl zclVar5 = qmk.f28987a;
                    v8q0.a(str8, yhg0Var2.a(1.0f, s5x0.N(jm40.b, 0.0f, 0.0f, 2.0f, 0.0f, 11), true), j, null, 0L, null, null, null, 0L, null, 0L, 2, false, cil0Var.f4422a, 0, null, y9q0Var, fetVar15, 0, 384, 110584);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 15:
                ugd ugdVar = (ugd) obj6;
                ugd ugdVar2 = (ugd) obj4;
                ugd ugdVar3 = (ugd) obj5;
                pbe0 pbe0Var = (pbe0) obj;
                fet fetVar16 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                if ((iIntValue17 & 6) == 0) {
                    iIntValue17 |= fetVar16.g(pbe0Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar16.U(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                    lz3 lz3Var = (lz3) ydx.F(pbe0Var.b.u, fetVar16).getValue();
                    if (lz3Var instanceof jz3) {
                        fetVar16.e0(1576397282);
                        ugdVar.j(pbe0Var, lz3Var, fetVar16, Integer.valueOf((iIntValue17 & 14) | 64));
                        fetVar16.r(false);
                    } else if (lz3Var instanceof kz3) {
                        fetVar16.e0(1576400290);
                        ugdVar2.j(pbe0Var, lz3Var, fetVar16, Integer.valueOf((iIntValue17 & 14) | 64));
                        fetVar16.r(false);
                    } else if (lz3Var instanceof iz3) {
                        fetVar16.e0(1576403106);
                        ugdVar3.j(pbe0Var, lz3Var, fetVar16, Integer.valueOf((iIntValue17 & 14) | 64));
                        fetVar16.r(false);
                    } else {
                        if (!(lz3Var instanceof hz3)) {
                            t9f.b();
                            return null;
                        }
                        fetVar16.e0(1576407562);
                        u4n0.e(pbe0Var, null, null, null, null, 0.0f, null, false, fetVar16, iIntValue17 & 14, 255);
                        fetVar16.r(false);
                    }
                    fetVar16.e0(1624022037);
                    fetVar16.r(false);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 16:
                xcz xczVar3 = (xcz) obj6;
                v8p0 v8p0Var = (v8p0) obj5;
                Function1 function11 = (Function1) obj4;
                fet fetVar17 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                s2m0 s2m0Var = x8p0.l2;
                ((y5d) obj).getClass();
                if (fetVar17.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    mm40 mm40VarV = cjx.V(jm40Var, a8k0.G(xczVar3, fetVar17), null);
                    zcl zclVar6 = qmk.f28987a;
                    lh80 lh80VarU = s5x0.u(4.0f, 0.0f, 4.0f, 16.0f, 2);
                    boolean zG8 = fetVar17.g(v8p0Var);
                    Object objP17 = fetVar17.P();
                    if (zG8 || objP17 == cl5Var) {
                        objP17 = new itn0(v8p0Var, function11, (byte) 20);
                        fetVar17.o0(objP17);
                    }
                    b8k0.e(mm40VarV, xczVar3, lh80VarU, null, null, null, false, null, (Function1) objP17, fetVar17, 0, Response.SERVER_TIMEOUT);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 17:
                return a(obj, obj2, obj3);
            case 18:
                return b(obj, obj2, obj3);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                l7m0 l7m0Var5 = (l7m0) obj6;
                l7m0 l7m0Var6 = (l7m0) obj4;
                gpe gpeVar = (gpe) obj5;
                fet fetVar18 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (fetVar18.U(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    zcl zclVar7 = qmk.f28987a;
                    mm40 mm40VarN4 = o7k0.n(jm40Var, 40.0f);
                    pz40 pz40Var3 = s6t0.f31722a;
                    long background = s6t0.b().f33626a.getBackground();
                    zcl zclVar8 = qmk.g;
                    ugg0 ugg0Var3 = vgg0.f37379a;
                    x1x.s(s5x0.J(i120.Q(mm40VarN4, background, new ugg0(zclVar8, zclVar8, zclVar8, zclVar8)), 2.0f), l7m0Var5, u1c.M(-1281434802, new nhl0(l7m0Var6, gpeVar, (byte) 24), fetVar18), fetVar18, 384, 0);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 20:
                return c(obj, obj2, obj3);
            default:
                yhs0 yhs0Var = (yhs0) obj6;
                Function0 function12 = (Function0) obj5;
                Function1 function13 = (Function1) obj4;
                fet fetVar19 = (fet) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                s9m0 s9m0Var = uks0.l2;
                ((y5d) obj).getClass();
                if (fetVar19.U(1 & iIntValue20, (iIntValue20 & 17) != 16)) {
                    xcz xczVarA = ddz.a(0, 0, fetVar19, 0, 3);
                    zcl zclVar9 = qmk.f28987a;
                    lh80 lh80VarU2 = s5x0.u(4.0f, 0.0f, 4.0f, 16.0f, 2);
                    boolean zG9 = fetVar19.g(yhs0Var);
                    Object objP18 = fetVar19.P();
                    if (zG9 || objP18 == cl5Var) {
                        objP18 = new m8s0(yhs0Var, function12, function13, (byte) 2);
                        fetVar19.o0(objP18);
                    }
                    b8k0.e(jm40.b, xczVarA, lh80VarU2, null, null, null, false, null, (Function1) objP18, fetVar19, 6, Response.SERVER_TIMEOUT);
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ sqc0(byte b, Object obj, Object obj2, Function1 function1) {
        this.f32623a = b;
        this.b = obj;
        this.d = obj2;
        this.c = function1;
    }

    public /* synthetic */ sqc0(Object obj, Object obj2, Object obj3, byte b) {
        this.f32623a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
