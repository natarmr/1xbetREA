package a;

import android.app.AppOpsManager;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.presentation.models.PromotedCategoryUiModel;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class l7x {
    public static final void A(mm40 mm40Var, pz40 pz40Var, fet fetVar, int i) {
        fetVar.g0(-5239536);
        byte b = 2;
        byte b2 = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(pz40Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            kr00.a(u1c.M(2143846963, new esw(b, mm40Var, pz40Var), fetVar), fetVar, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new esw(mm40Var, pz40Var, i, b2);
        }
    }

    public static final void B(mm40 mm40Var, owk0 owk0Var, f3d f3dVar, final Function0 function0, final Function0 function1, fet fetVar, int i) {
        int i2;
        f3d f3dVar2;
        owk0Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(-1662667193);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(owk0Var) : fetVar.i(owk0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f3dVar2 = f3dVar;
            i2 |= fetVar.g(f3dVar2) ? 256 : 128;
        } else {
            f3dVar2 = f3dVar;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            final float fD = f3dVar2.d();
            float f = fD >= 0.0f ? fD : 0.0f;
            mm40 mm40VarW = o050.W(o7k0.d(mm40Var, 1.0f));
            zcl zclVar = qmk.f28987a;
            ozb.g(o7k0.e(mm40VarW, 56.0f), null, null, u1c.M(-1419796180, new xdr() { // from class: a.nwk0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b;
                    cl5 cl5Var = ukd.f35823a;
                    float f2 = fD;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                boolean zD = fetVar2.d(f2);
                                Object objP = fetVar2.P();
                                if (zD || objP == cl5Var) {
                                    objP = new rt2(f2, (byte) 10);
                                    fetVar2.o0(objP);
                                }
                                ozb.h(jm40.b, 0L, 0L, 0L, (Function0) objP, function0, o2e.d, fetVar2, 1572870);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                boolean zD2 = fetVar3.d(f2);
                                Object objP2 = fetVar3.P();
                                if (zD2 || objP2 == cl5Var) {
                                    objP2 = new rt2(f2, (byte) 10);
                                    fetVar3.o0(objP2);
                                }
                                ozb.h(jm40.b, 0L, 0L, 0L, (Function0) objP2, function0, o2e.e, fetVar3, 1572870);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-1243467923, new dec0(f, fD, owk0Var, b2), fetVar), u1c.M(-1067139666, new xdr() { // from class: a.nwk0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b2;
                    cl5 cl5Var = ukd.f35823a;
                    float f2 = fD;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                boolean zD = fetVar2.d(f2);
                                Object objP = fetVar2.P();
                                if (zD || objP == cl5Var) {
                                    objP = new rt2(f2, (byte) 10);
                                    fetVar2.o0(objP);
                                }
                                ozb.h(jm40.b, 0L, 0L, 0L, (Function0) objP, function1, o2e.d, fetVar2, 1572870);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                boolean zD2 = fetVar3.d(f2);
                                Object objP2 = fetVar3.P();
                                if (zD2 || objP2 == cl5Var) {
                                    objP2 = new rt2(f2, (byte) 10);
                                    fetVar3.o0(objP2);
                                }
                                ozb.h(jm40.b, 0L, 0L, 0L, (Function0) objP2, function1, o2e.e, fetVar3, 1572870);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 224256);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var, (Object) owk0Var, (Object) f3dVar2, (Object) function0, (Object) function1, i, (byte) 23);
        }
    }

    public static final void C(mm40 mm40Var, ovi0 ovi0Var, boolean z, gy40 gy40Var, Function0 function0, fet fetVar, int i) {
        int i2;
        boolean z2;
        fetVar.g0(-1958879508);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ovi0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(gy40Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            boolean z3 = ovi0Var.f25927a;
            boolean z4 = (57344 & i2) == 16384;
            Object objP = fetVar.P();
            if (z4 || objP == ukd.f35823a) {
                objP = new r3w(function0, (byte) 27);
                fetVar.o0(objP);
            }
            n5n.b(mm40VarN, z3, z2, gy40Var, (Function1) objP, fetVar, i2 & 8064, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ztc0(mm40Var, (Object) ovi0Var, z, (Object) gy40Var, (wdr) function0, i, (byte) 6);
        }
    }

    public static int D(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, sf3.h(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static final ugd E(List list) {
        return new ugd(1271844412, true, new bo0(list, (byte) 27));
    }

    public static byte[] F(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            jf4.o("The key length in bytes must be 32.");
            return null;
        }
        long jP = P(bArr, 0) & 67108863;
        int i = 3;
        long jP2 = (P(bArr, 3) >> 2) & 67108611;
        long jP3 = (P(bArr, 6) >> 4) & 67092735;
        long jP4 = (P(bArr, 9) >> 6) & 66076671;
        long jP5 = (P(bArr, 12) >> 8) & 1048575;
        long j = jP2 * 5;
        long j2 = jP3 * 5;
        long j3 = jP4 * 5;
        long j4 = jP5 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jP6 = j9 + (P(bArr3, 0) & 67108863);
            long jP7 = j5 + ((P(bArr3, i) >> 2) & 67108863);
            long jP8 = j6 + ((P(bArr3, 6) >> 4) & 67108863);
            long jP9 = j7 + ((P(bArr3, 9) >> 6) & 67108863);
            long j10 = jP2;
            long jP10 = j8 + (((P(bArr3, 12) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j11 = (jP10 * j) + (jP9 * j2) + (jP8 * j3) + (jP7 * j4) + (jP6 * jP);
            long j12 = (jP10 * j2) + (jP9 * j3) + (jP8 * j4) + (jP7 * jP) + (jP6 * j10);
            long j13 = (jP10 * j3) + (jP9 * j4) + (jP8 * jP) + (jP7 * j10) + (jP6 * jP3);
            long j14 = (jP10 * j4) + (jP9 * jP) + (jP8 * j10) + (jP7 * jP3) + (jP6 * jP4);
            long j15 = jP9 * j10;
            long j16 = jP10 * jP;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (jP8 * jP3) + (jP7 * jP4) + (jP6 * jP5) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i2 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            jP2 = j10;
            i = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & 4294967295L;
        long j51 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
        long j52 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L;
        long jP11 = P(bArr, 16) + j50;
        long j54 = jP11 & 4294967295L;
        long jP12 = P(bArr, 20) + j51 + (jP11 >> 32);
        long jP13 = P(bArr, 24) + j52 + (jP12 >> 32);
        long jP14 = (P(bArr, 28) + j53 + (jP13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        a0(bArr4, j54, 0);
        a0(bArr4, jP12 & 4294967295L, 4);
        a0(bArr4, jP13 & 4294967295L, 8);
        a0(bArr4, jP14, 12);
        return bArr4;
    }

    public static final float G(xk80 xk80Var) {
        return xk80Var.m().e == ma80.b ? Float.intBitsToFloat((int) (xk80Var.s() >> 32)) : Float.intBitsToFloat((int) (xk80Var.s() & 4294967295L));
    }

    public static iv10 H() {
        return new iv10("", iun.f15405a, new cso(new ldx(0.0d, 0, 0, ""), new ndf(new wcv0("", ""))), 0, "", 0, 0, new jzm0("", ""), 0, "", new cnq0(0, 0, false), "", false, false, new nbr(0, 0), 0, "", 0, 0, new ffm0(new fz10("")));
    }

    public static final float I(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f)) & 8589934591L) / 3)) + 709952852);
        float f2 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final j83 J(ctf0 ctf0Var, String str, int i) {
        dpi0 dpi0Var = new dpi0((byte) 15);
        String strA = ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        vzb.D(dpi0Var, strA, s6t0.b().f33626a.getTextPrimary());
        vzb.D(dpi0Var, ": ", s6t0.b().f33626a.getTextPrimary());
        vzb.D(dpi0Var, str, s6t0.b().f33626a.getSecondary());
        return ((h83) dpi0Var.f6468a).h();
    }

    public static final gbn K(Function1 function1) {
        byte b = 25;
        return new gbn(new v1x((byte) 4), new pkv(3, b), new dht(function1, b), btv.v);
    }

    public static final wui0 L(int i, int i2, boolean z) {
        if (i2 == 0 && z) {
            return wui0.b;
        }
        if (i2 == 0) {
            return wui0.f39793a;
        }
        if (i == 0) {
            return wui0.b;
        }
        if (i == i2 && z) {
            return wui0.c;
        }
        return i == i2 ? wui0.d : wui0.c;
    }

    public static final int M(urz urzVar) {
        if (urzVar == l810.LOSE_LIMIT_7_DAY) {
            return R.string.limits_weekly_limit_title;
        }
        if (urzVar == l810.LOSE_LIMIT_30_DAY) {
            return R.string.limits_monthly_limit_title;
        }
        if (urzVar == kiq0.f18349a) {
            return R.string.limits_self_exclusion_desc;
        }
        if (urzVar == yrz.b) {
            return R.string.empty_str;
        }
        t9f.b();
        return 0;
    }

    public static final boolean N(xk80 xk80Var, float f) {
        xk80Var.m().getClass();
        return !(((xk80Var.t() ? -f : G(xk80Var)) > 0.0f ? 1 : ((xk80Var.t() ? -f : G(xk80Var)) == 0.0f ? 0 : -1)) > 0);
    }

    public static final float O(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static long P(byte[] bArr, int i) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    public static final ugd Q(ugd ugdVar) {
        return new ugd(-328108779, true, new pi40(new ju40(new ugd(-703201834, true, new bkh(ugdVar, (byte) 3))), (byte) 7));
    }

    public static final ugd R(ugd ugdVar) {
        return new ugd(-1655274392, true, new ku40(new ju40(new ugd(668517896, true, new uis(ugdVar, (byte) 5))), (byte) 1));
    }

    public static xa3 S(fq80 fq80Var) {
        String str;
        int iM = fq80Var.m();
        if (fq80Var.m() != 1684108385) {
            f1t0.g0("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM2 = fq80Var.m();
        byte[] bArr = hr8.f13518a;
        int i = iM2 & 16777215;
        if (i == 13) {
            str = "image/jpeg";
        } else {
            str = i == 14 ? "image/png" : null;
        }
        if (str == null) {
            rw2.u(i, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        fq80Var.N(4);
        int i2 = iM - 16;
        byte[] bArr2 = new byte[i2];
        fq80Var.k(bArr2, 0, i2);
        return new xa3(str, null, 3, bArr2);
    }

    public static h8q0 T(int i, fq80 fq80Var, String str) {
        int iM = fq80Var.m();
        if (fq80Var.m() == 1684108385 && iM >= 22) {
            fq80Var.N(10);
            int iG = fq80Var.G();
            if (iG > 0) {
                String strM = twn.m(iG, "");
                int iG2 = fq80Var.G();
                if (iG2 > 0) {
                    strM = strM + Separators.SLASH + iG2;
                }
                return new h8q0(str, null, b4x.t(strM));
            }
        }
        f1t0.g0("MetadataUtil", "Failed to parse index/count attribute: ".concat(syx.k(i)));
        return null;
    }

    public static int U(fq80 fq80Var) {
        int iM = fq80Var.m();
        if (fq80Var.m() == 1684108385) {
            fq80Var.N(8);
            int i = iM - 16;
            if (i == 1) {
                return fq80Var.z();
            }
            if (i == 2) {
                return fq80Var.G();
            }
            if (i == 3) {
                return fq80Var.C();
            }
            if (i == 4 && (fq80Var.j() & 128) == 0) {
                return fq80Var.D();
            }
        }
        f1t0.g0("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static fxw V(int i, String str, fq80 fq80Var, boolean z, boolean z2) {
        int iU = U(fq80Var);
        if (z2) {
            iU = Math.min(1, iU);
        }
        if (iU >= 0) {
            return z ? new h8q0(str, null, b4x.t(Integer.toString(iU))) : new k8d("und", str, Integer.toString(iU));
        }
        f1t0.g0("MetadataUtil", "Failed to parse uint8 attribute: ".concat(syx.k(i)));
        return null;
    }

    public static h8q0 W(int i, fq80 fq80Var, String str) {
        int iM = fq80Var.m();
        if (fq80Var.m() == 1684108385) {
            fq80Var.N(8);
            return new h8q0(str, null, b4x.t(fq80Var.v(iM - 16)));
        }
        f1t0.g0("MetadataUtil", "Failed to parse text attribute: ".concat(syx.k(i)));
        return null;
    }

    public static final mz3 X(Object obj, Function1 function1, qge qgeVar, fet fetVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if ((i2 & 8) != 0) {
            qgeVar = gqw0.B;
        }
        qge qgeVar2 = qgeVar;
        int i3 = i << 3;
        return ny9.Y(obj, o5k0.a((Context) fetVar.k(dy2.b)), mz3.v, function2, qgeVar2, fetVar, (i & 14) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (i3 & 458752));
    }

    public static final mz3 Y(Object obj, pm80 pm80Var, pm80 pm80Var2, oil oilVar, Function1 function1, Function1 function2, fet fetVar, int i, int i2) {
        pge pgeVar = gqw0.A;
        m8s0 m8s0Var = null;
        if ((i2 & 2) != 0) {
            pm80Var = null;
        }
        Object obj2 = oilVar;
        if ((i2 & 8) != 0) {
            obj2 = pm80Var2;
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        if ((i2 & 64) != 0) {
            function2 = null;
        }
        if ((i2 & 128) != 0) {
            pgeVar = gqw0.B;
        }
        qz3 qz3Var = new qz3(obj, (fz3) fetVar.k(dr00.f6538a), o5k0.a((Context) fetVar.k(dy2.b)));
        int i3 = iut0.b;
        return ny9.Z(qz3Var, (pm80Var == null && pm80Var2 == null && obj2 == null) ? mz3.v : new m8s0(pm80Var, obj2, pm80Var2, (byte) 4), (function1 == null && function2 == null) ? null : new m8s0(m8s0Var, function1, function2, (byte) 5), pgeVar, fetVar);
    }

    public static void Z(int i, ed40 ed40Var, awq awqVar, ed40 ed40Var2, ed40... ed40VarArr) {
        if (ed40Var2 == null) {
            ed40Var2 = new ed40(new cd40[0]);
        }
        if (ed40Var != null) {
            u3x u3xVarL = b4x.l();
            for (cd40 cd40Var : ed40Var.f7600a) {
                if (nj30.class.isAssignableFrom(cd40Var.getClass())) {
                    u3xVarL.b((cd40) nj30.class.cast(cd40Var));
                }
            }
            v3x v3xVarR = u3xVarL.g().listIterator(0);
            while (v3xVarR.hasNext()) {
                nj30 nj30Var = (nj30) v3xVarR.next();
                if (!nj30Var.f23615a.equals("com.android.capture.fps") || i == 2) {
                    ed40Var2 = ed40Var2.a(nj30Var);
                }
            }
        }
        for (ed40 ed40Var3 : ed40VarArr) {
            ed40Var2 = ed40Var2.b(ed40Var3);
        }
        if (ed40Var2.f7600a.length > 0) {
            awqVar.l = ed40Var2;
        }
    }

    public static final void a(mm40 mm40Var, qdm qdmVar, boolean z, Function0 function0, fet fetVar, int i) {
        fetVar.g0(735110575);
        byte b = 2;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.e(R.drawable.ic_glyph_chevron_down_small) ? 32 : 16) | (fetVar.g(qdmVar) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.i(function0) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = xf0.c(z ? 180.0f : 0.0f);
                fetVar.o0(objP);
            }
            t33 t33Var = (t33) objP;
            Object[] objArr = new Object[0];
            boolean z2 = (i2 & 7168) == 2048;
            Object objP2 = fetVar.P();
            byte b2 = 6;
            if (z2 || objP2 == obj) {
                objP2 = new kg2(b2, z);
                fetVar.o0(objP2);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP2, fetVar, 0);
            Boolean bool = (Boolean) pz40Var.getValue();
            bool.getClass();
            boolean zI = fetVar.i(t33Var) | fetVar.g(pz40Var);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new lcd(t33Var, pz40Var, null, b);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, bool, (Function2) objP3);
            mm40 mm40VarQ = i120.Q(mm40Var, ibc.Y(qdmVar.d, fetVar), vgg0.f37379a);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            s4u0 s4u0VarR = iom0.r(jpm0.t(R.drawable.ic_glyph_chevron_down_small, (i2 & 112) | 6, fetVar), fetVar);
            long jY = ibc.Y(qdmVar.f28541a, fetVar);
            mm40 mm40VarP = o7k0.p(jm40.b, qdmVar.b, qdmVar.c);
            boolean zI2 = fetVar.i(t33Var);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new m53(t33Var, (byte) 19);
                fetVar.o0(objP4);
            }
            mm40 mm40VarT = i4w0.T(mm40VarP, (Function1) objP4);
            boolean zG = fetVar.g(pz40Var) | ((i2 & 57344) == 16384);
            Object objP5 = fetVar.P();
            if (zG || objP5 == obj) {
                objP5 = new tmm(function0, pz40Var);
                fetVar.o0(objP5);
            }
            dww.c(s4u0VarR, null, y860.W(mm40VarT, null, null, false, null, (Function0) objP5, 28), jY, fetVar, 56, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n((byte) 20, i, (Object) mm40Var, (Object) qdmVar, (Object) function0, z);
        }
    }

    public static void a0(byte[] bArr, long j, int i) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static final void b(mm40 mm40Var, cvi0 cvi0Var, boolean z, Function0 function0, fet fetVar, int i) {
        fetVar.g0(1523872773);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(cvi0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zb zbVar = cvi0Var.f5030a;
            boolean z2 = false;
            boolean z3 = cvi0Var.b;
            boolean z4 = (i2 & 896) == 256;
            if ((i2 & 7168) == 2048) {
                z2 = true;
            }
            boolean z5 = z2 | z4;
            Object objP = fetVar.P();
            if (z5 || objP == ukd.f35823a) {
                objP = new jw7(z, function0, (byte) 15);
                fetVar.o0(objP);
            }
            acb.n(zbVar, z3, (Function0) objP, mm40Var, fetVar, (i2 << 9) & 7168, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lfc0(mm40Var, (Object) cvi0Var, z, (wdr) function0, i, (byte) 8);
        }
    }

    public static final w2w b0(i77 i77Var, ctf0 ctf0Var, f8w f8wVar, boolean z) {
        boolean z2;
        long jM165getSecondary0d7_KjU;
        gmm dmmVar;
        int iOrdinal;
        ctf0Var.getClass();
        HistoryTypeModel historyTypeModel = i77Var.i;
        wdj wdjVar = i77Var.l;
        boolean z3 = i77Var.q;
        List list = i77Var.t;
        boolean z4 = i77Var.k;
        String strP0 = uzb.p0(historyTypeModel, ctf0Var, f8wVar, i77Var.j);
        boolean z5 = f8wVar != f8w.b && z4;
        boolean z6 = k7x.R(historyTypeModel) && z4;
        boolean z7 = (i77Var.f14279a || i77Var.c) ? false : true;
        List list2 = i77Var.m;
        if (list2 != null && list2.isEmpty()) {
            z2 = false;
            break;
        }
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            if (!((h0w) it.next()).b) {
                z2 = true;
                break;
            }
        }
        boolean z8 = (z7 && !list.isEmpty()) || z2;
        boolean z9 = z4 && ((iOrdinal = historyTypeModel.ordinal()) == 0 || iOrdinal == 2 || iOrdinal == 3);
        int i = z2 ? R.drawable.ic_glyph_filter_active : R.drawable.ic_glyph_filter_inactive;
        int i2 = z3 ? R.drawable.ic_glyph_compressed_inactive : R.drawable.ic_glyph_extended;
        boolean z10 = (historyTypeModel == HistoryTypeModel.UNSETTLED || f8wVar == f8w.b || !i77Var.B) ? false : true;
        if (z2) {
            pz40 pz40Var = s6t0.f31722a;
            jM165getSecondary0d7_KjU = s6t0.b().f33626a.getPrimary();
        } else {
            pz40 pz40Var2 = s6t0.f31722a;
            jM165getSecondary0d7_KjU = s6t0.b().f33626a.getSecondary();
        }
        long j = jM165getSecondary0d7_KjU;
        int iOrdinal2 = historyTypeModel.ordinal();
        boolean z11 = (iOrdinal2 == 1 || iOrdinal2 == 5 || iOrdinal2 == 7) ? true : z3;
        HistoryTypeModel historyTypeModel2 = HistoryTypeModel.EVENTS;
        boolean z12 = z10;
        boolean z13 = historyTypeModel == historyTypeModel2;
        ga50 ea50Var = z5 ? new ea50(s6t0.b().f33626a.getSecondary()) : fa50.f9191a;
        llm ilmVar = f8wVar == f8w.b ? new ilm(s6t0.b().f33626a.getSecondary()) : klm.f18497a;
        ra50 ra50Var = ra50.f30118a;
        if (z6 && z9) {
            dmmVar = new dmm(new va50(new wkm(0, i, z8, ra50Var, j), new wkm(1, i2, z7 && !list.isEmpty(), ra50Var, s6t0.b().f33626a.getSecondary())));
        } else {
            int i3 = i2;
            if (z6) {
                dmmVar = new dmm(new ta50(new wkm(0, i, z8, ra50Var, j)));
            } else if (z9) {
                dmmVar = new dmm(new ta50(new wkm(1, i3, z7 && !list.isEmpty(), ra50Var, s6t0.b().f33626a.getSecondary())));
            } else {
                dmmVar = fmm.f9790a;
            }
        }
        gmm gmmVar = dmmVar;
        String strH = ibm0.h(i77Var.e);
        String strT = lgb.T(wdjVar, ctf0Var);
        String str = null;
        if (!z12) {
            strT = null;
        }
        if (strT == null) {
            strT = "";
        }
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.history_sale, Arrays.copyOf(new Object[0], 0));
        if (historyTypeModel == historyTypeModel2 && z) {
            str = strA;
        }
        if (str == null) {
            str = "";
        }
        return new w2w(strP0, z13, z11, strH, new dx(strT, str, ""), new w2q(lsm0Var.a(R.string.filters, Arrays.copyOf(new Object[0], 0)), z6, z2 || (wdjVar instanceof vdj), false), ea50Var, ilmVar, gmmVar, mlm.f21997a, "", false, 0, lak0.c);
    }

    public static final void c(mm40 mm40Var, kfm kfmVar, cem cemVar, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(-635390585);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(kfmVar) ? 32 : 16) | (fetVar.g(cemVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "ADDITIONAL_LABEL_TEST_TAG");
            tj30 tj30VarC = zq8.c(gqw0.f, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            v8q0.a(kfmVar.c, null, ibc.Y(cemVar.b, fetVar), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, cemVar.f4220a, fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var, kfmVar, cemVar, i, (byte) 14);
        }
    }

    public static final PromotedCategoryUiModel c0(ezc0 ezc0Var, mp0 mp0Var) {
        String strQ;
        ezc0Var.getClass();
        String str = ezc0Var.f8666a;
        String str2 = ezc0Var.b;
        boolean z = ezc0Var.c;
        int i = fzc0.f10402a[mp0Var.ordinal()];
        if (i == 1 || i == 2) {
            List list = u0d.f34849a;
            strQ = u0d.q(String.format(Locale.ENGLISH, "/static/img/android/casino/alt_design/aggregator_filter/chips_l&_tabs_filled/%s.svg", Arrays.copyOf(new Object[]{Intrinsics.d(str, "0") ? "0" : str}, 1)));
        } else if (i != 3) {
            strQ = null;
        } else {
            List list2 = u0d.f34849a;
            strQ = u0d.q(String.format(Locale.ENGLISH, "/static/img/android/casino/alt_design/aggregator_filter/tabs_line/%s.webp", Arrays.copyOf(new Object[]{Intrinsics.d(str, "0") ? "0" : str}, 1)));
        }
        return new PromotedCategoryUiModel(str, str2, strQ, z);
    }

    public static final void d(mm40 mm40Var, dvi0 dvi0Var, boolean z, Function0 function0, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(982351815);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(dvi0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 40.0f);
            boolean z2 = function0 != null;
            boolean z3 = ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new jw7(z, function0, (byte) 17);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarN, null, null, z2, null, (Function0) objP, 24);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            mm40 mm40VarE0 = o2e.e0(o7k0.n(jm40.b, 24.0f), "SETTING_CELL_RIGHT_IMAGE");
            Object objA = dvi0Var.f6745a.a();
            fetVar.e0(1291903665);
            fetVar.r(false);
            y3d y3dVar = dvi0Var.b;
            k7x.b(objA, null, mm40VarE0, null, null, null, null, null, null, null, null, y3dVar != null ? new m78(y3dVar.f41946a, 5) : null, fetVar, 4144, 0, 28656);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lfc0(mm40Var, (Object) dvi0Var, z, (wdr) function0, i, (byte) 10);
        }
    }

    public static final m1e0 d0(r1e0 r1e0Var) {
        return new m1e0(r1e0Var.d, r1e0Var.b, r1e0Var.f, r1e0Var.e, r1e0Var.c);
    }

    public static final void e(mm40 mm40Var, evi0 evi0Var, boolean z, Function0 function0, fet fetVar, int i) {
        fetVar.g0(1190138937);
        byte b = 16;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(evi0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = function0 != null;
            boolean z3 = ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new jw7(z, function0, b);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40Var, null, null, z2, null, (Function0) objP, 24);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(jm40.b, 12.0f, 8.0f);
            String str = evi0Var.f8469a;
            y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109);
            y3d y3dVar = evi0Var.b;
            fetVar.e0(-1861270997);
            fetVar.r(false);
            v8q0.a(str, mm40VarK, y3dVar.f41946a, null, 0L, null, null, null, 0L, null, 0L, 2, false, 0, 0, null, y9q0Var, fetVar, 0, 384, 126968);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lfc0(mm40Var, (Object) evi0Var, z, (wdr) function0, i, (byte) 7);
        }
    }

    public static final String e0(ctf0 ctf0Var, String str) {
        str.getClass();
        ctf0Var.getClass();
        return str.equals("0") ? ctf0Var.b.a(R.string.tennis_summary_for_career, Arrays.copyOf(new Object[0], 0)) : str;
    }

    public static final void f(mm40 mm40Var, fvi0 fvi0Var, fet fetVar, int i) {
        long jM165getSecondary0d7_KjU;
        fetVar.g0(111847747);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(fvi0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.N(mm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 48.0f);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar);
            y3d y3dVar = fvi0Var.f10216a;
            if (y3dVar == null) {
                fetVar.e0(-1838180622);
                jM165getSecondary0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            } else {
                fetVar.e0(-1838181862);
                fetVar.r(false);
                jM165getSecondary0d7_KjU = y3dVar.f41946a;
            }
            long j = jM165getSecondary0d7_KjU;
            mm40 mm40VarN = o7k0.n(jm40.b, 20.0f);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new eoh0((byte) 29);
                fetVar.o0(objP);
            }
            dww.c(pm80VarF, null, o2e.e0(pai0.a(mm40VarN, false, (Function1) objP), "CHEVRON_ICON"), j, fetVar, 56, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) mm40Var, (Object) fvi0Var, i, (byte) 12);
        }
    }

    public static final nal0 f0(rpp0 rpp0Var, boolean z, List list, b280 b280Var, boolean z2, List list2, cap capVar, kal0 kal0Var) {
        d280 c280Var;
        list.getClass();
        boolean z3 = true;
        if (rpp0Var instanceof qpp0) {
            qpp0 qpp0Var = (qpp0) rpp0Var;
            long j = z ? qpp0Var.e : qpp0Var.f;
            qpp0 qpp0Var2 = (qpp0) rpp0Var;
            String str = z ? qpp0Var2.g : qpp0Var2.h;
            if (b280Var != null) {
                c280Var = b280Var;
            } else {
                String str2 = (String) CollectionsKt.firstOrNull(list);
                c280Var = new c280(vsm0.s(j, str2 != null ? str2 : ""), R.drawable.ic_glyph_placeholder_player);
            }
            if (!z2 && b280Var == null) {
                z3 = false;
            }
            return new mal0(str, b5x.d0(c280Var, j, list2, z3, capVar), kal0Var);
        }
        if (!(rpp0Var instanceof ppp0)) {
            t9f.b();
            return null;
        }
        ppp0 ppp0Var = (ppp0) rpp0Var;
        String str3 = z ? ppp0Var.g : ppp0Var.h;
        ppp0 ppp0Var2 = (ppp0) rpp0Var;
        Pair pair = z ? ppp0Var2.e : ppp0Var2.f;
        Object obj = pair.f46059a;
        String str4 = (String) CollectionsKt.firstOrNull(list);
        if (str4 == null) {
            str4 = "";
        }
        Object obj2 = pair.b;
        j5a0 j5a0VarD0 = b5x.d0(new c280(vsm0.s(((Number) obj).longValue(), str4), R.drawable.ic_glyph_placeholder_player), ((Number) obj).longValue(), list2, z2, cap.b);
        String str5 = (String) CollectionsKt.W(1, list);
        Number number = (Number) obj2;
        return new lal0(str3, j5a0VarD0, b5x.d0(new c280(vsm0.s(number.longValue(), str5 != null ? str5 : ""), R.drawable.ic_glyph_placeholder_player), number.longValue(), list2, z2, cap.f4022a), kal0Var);
    }

    public static final void g(mm40 mm40Var, gvi0 gvi0Var, fet fetVar, int i) {
        mm40 mm40Var2 = mm40Var;
        fetVar.g0(891412233);
        int i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i | (fetVar.g(gvi0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40Var2, 0.0f, 0.0f, 4.0f, 0.0f, 11);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            tdc.e(new rpe(gvi0Var.b), gvi0Var.f11976a, null, fetVar, 0, 4);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar);
            y3d y3dVar = gvi0Var.c;
            fetVar.e0(-768469090);
            fetVar.r(false);
            mm40Var2 = mm40Var;
            dww.c(pm80VarF, null, o7k0.n(jm40.b, 20.0f), y3dVar.f41946a, fetVar, 56, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) mm40Var2, (Object) gvi0Var, i, (byte) 11);
        }
    }

    public static final suo0 g0(vuo0 vuo0Var) {
        Long l;
        Integer num;
        double dDoubleValue;
        vuo0Var.getClass();
        Integer num2 = vuo0Var.f38058a;
        yf8 yf8Var = vuo0Var.b;
        mbe0 mbe0Var = vuo0Var.c;
        g8r g8rVar = vuo0Var.d;
        if (num2 == null || num2.intValue() != 1) {
            int iIntValue = 0;
            if (num2 != null && num2.intValue() == 2) {
                if (yf8Var != null) {
                    Double d = yf8Var.f42528a;
                    dDoubleValue = d != null ? d.doubleValue() : 0.0d;
                    String str = yf8Var.b;
                    String str2 = str != null ? str : "";
                    Integer num3 = yf8Var.c;
                    return new ouo0(dDoubleValue, num3 != null ? num3.intValue() : 0, str2);
                }
            } else if (num2 != null && num2.intValue() == 3 && g8rVar != null) {
                szb0 szb0Var = g8rVar.b;
                oxb0 oxb0Var = g8rVar.f10880a;
                Integer num4 = g8rVar.c;
                int iIntValue2 = num4 != null ? num4.intValue() : 0;
                if (oxb0Var != null && (num = oxb0Var.f26004a) != null) {
                    iIntValue = num.intValue();
                }
                String str3 = oxb0Var != null ? oxb0Var.b : null;
                if (str3 == null) {
                    str3 = "";
                }
                pms pmsVar = new pms(iIntValue, str3);
                long jLongValue = (szb0Var == null || (l = szb0Var.f33065a) == null) ? 0L : l.longValue();
                String str4 = szb0Var != null ? szb0Var.b : null;
                return new puo0(iIntValue2, pmsVar, new mzb0(jLongValue, str4 != null ? str4 : ""));
            }
        } else if (mbe0Var != null) {
            Double d2 = mbe0Var.f21503a;
            dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
            String str5 = mbe0Var.b;
            return new ruo0(str5 != null ? str5 : "", dDoubleValue);
        }
        return quo0.f29355a;
    }

    public static final void h(mm40 mm40Var, hvi0 hvi0Var, boolean z, Function0 function0, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1177530569);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(hvi0Var) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            tdc.e(new rpe(hvi0Var.b), hvi0Var.f13728a, null, fetVar, 0, 4);
            fetVar2 = fetVar;
            boolean z2 = hvi0Var.c;
            boolean z3 = (i2 & 7168) == 2048;
            Object objP = fetVar2.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new r3w(function0, (byte) 26);
                fetVar2.o0(objP);
            }
            f7k.k(null, tc00.f33696a, z2, z, (Function1) objP, fetVar2, (i2 << 3) & 7168, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lfc0(mm40Var, (Object) hvi0Var, z, (wdr) function0, i, (byte) 6);
        }
    }

    public static final void i(mm40 mm40Var, ivi0 ivi0Var, boolean z, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1063771482);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ivi0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 40.0f);
            Unit unit = Unit.f46060a;
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new u3m(z, function1, b);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = fnn0.a(mm40VarN, unit, (PointerInputEventHandler) objP);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
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
            mm40 mm40VarN2 = o7k0.n(jm40.b, 24.0f);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_reorder, 0, fetVar);
            ivi0Var.getClass();
            fetVar.e0(1253657225);
            long jM165getSecondary0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
            fetVar.r(false);
            dww.c(pm80VarF, null, mm40VarN2, jM165getSecondary0d7_KjU, fetVar, 56, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040((byte) 11, i, (Object) mm40Var, (Object) ivi0Var, (Object) function1, z);
        }
    }

    public static final void j(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i, int i2) {
        ow3 ow3Var = uc9.g;
        if ((i2 & 2) != 0) {
            ow3Var = uc9.f35418a;
        }
        if ((i2 & 8) != 0) {
            ugdVar2 = null;
        }
        if ((i2 & 16) != 0) {
            ugdVar3 = null;
        }
        mm40 mm40VarE = o7k0.d(jm40.b, 1.0f).e(mm40Var);
        thg0 thg0VarA = shg0.a(ow3Var, gqw0.k, fetVar, ((((i & 112) | 384) >> 3) & 14) | 48);
        int iHashCode = Long.hashCode(fetVar.T);
        bh90 bh90VarM = fetVar.m();
        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
        mkd.c0.getClass();
        fetVar.i0();
        if (fetVar.S) {
            fetVar.l(e7z.u1);
        } else {
            fetVar.r0();
        }
        jpm0.o(fetVar, thg0VarA, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        zhg0 zhg0Var = zhg0.f44392a;
        ugdVar.F(zhg0Var, fetVar, 54);
        if (ugdVar2 == null) {
            fetVar.e0(1530853311);
        } else {
            fetVar.e0(1296308354);
            ugdVar2.F(zhg0Var, fetVar, Integer.valueOf(((i >> 6) & 112) | 6));
        }
        fetVar.r(false);
        if (ugdVar3 == null) {
            fetVar.e0(1530888031);
        } else {
            fetVar.e0(1296309474);
            ugdVar3.F(zhg0Var, fetVar, Integer.valueOf(6 | ((i >> 9) & 112)));
        }
        fetVar.r(false);
        fetVar.r(true);
    }

    public static final void k(eoa0 eoa0Var, boolean z, fet fetVar, int i) {
        boolean z2;
        fetVar.g0(2135923393);
        int i2 = i | (fetVar.g(eoa0Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 24.0f, 0.0f, 24.0f, z ? 36.0f : 22.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            fetVar.e0(-1003410150);
            fetVar.e0(212064437);
            fetVar.r(false);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new bk30(w6kVar);
                fetVar.o0(objP);
            }
            bk30 bk30Var = (bk30) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new g3e();
                fetVar.o0(objP2);
            }
            g3e g3eVar = (g3e) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP3);
            }
            pz40 pz40Var = (pz40) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = new v3e(g3eVar);
                fetVar.o0(objP4);
            }
            v3e v3eVar = (v3e) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
                fetVar.o0(objP5);
            }
            pz40 pz40Var2 = (pz40) objP5;
            boolean zI = fetVar.i(bk30Var) | fetVar.e(257);
            Object objP6 = fetVar.P();
            if (zI || objP6 == obj) {
                objP6 = new a5n(pz40Var2, bk30Var, v3eVar, pz40Var, (byte) 1);
                fetVar.o0(objP6);
            }
            tj30 tj30Var = (tj30) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == obj) {
                objP7 = new b5n(pz40Var, v3eVar, b);
                fetVar.o0(objP7);
            }
            Function0 function0 = (Function0) objP7;
            boolean zI2 = fetVar.i(bk30Var);
            Object objP8 = fetVar.P();
            if (zI2 || objP8 == obj) {
                objP8 = new c5n(bk30Var, b);
                fetVar.o0(objP8);
            }
            s(pai0.a(mm40VarD2, false, (Function1) objP8), u1c.M(1200550679, new jef(pz40Var2, g3eVar, function0, eoa0Var, (byte) 1), fetVar), tj30Var, fetVar, 48);
            fetVar.r(false);
            if (eoa0Var.l.isEmpty()) {
                z2 = true;
                fetVar.e0(-1965475689);
                fetVar.r(false);
            } else {
                fetVar.e0(-1965738042);
                z2 = true;
                jwb.p(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), null, null, null, 0, 0, u1c.M(1357359243, new elm(eoa0Var, (byte) 24), fetVar), fetVar, 1572864, 62);
                fetVar.r(false);
            }
            fetVar.r(z2);
        } else {
            i = i;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jv1(eoa0Var, z, i, (byte) 28);
        }
    }

    public static final void l(mm40 mm40Var, kvi0 kvi0Var, fet fetVar, int i) {
        long jM165getSecondary0d7_KjU;
        long jM165getSecondary0d7_KjU2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1731954999);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(kvi0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 0.0f, 6.0f, 1);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            x7z x7zVar = new x7z(1.0f, false);
            String str = kvi0Var.f18957a;
            y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109);
            y3d y3dVar = kvi0Var.b;
            if (y3dVar == null) {
                fetVar2.e0(1774588502);
                jM165getSecondary0d7_KjU = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                fetVar2.r(false);
            } else {
                fetVar2.e0(1774587324);
                fetVar2.r(false);
                jM165getSecondary0d7_KjU = y3dVar.f41946a;
            }
            v8q0.a(str, x7zVar, jM165getSecondary0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 3, 0, null, y9q0Var, fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar2);
            y3d y3dVar2 = kvi0Var.c;
            if (y3dVar2 == null) {
                fetVar2.e0(1774598358);
                jM165getSecondary0d7_KjU2 = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                fetVar2.r(false);
            } else {
                fetVar2.e0(1774597118);
                fetVar2.r(false);
                jM165getSecondary0d7_KjU2 = y3dVar2.f41946a;
            }
            dww.c(pm80VarF, null, o7k0.n(jm40.b, 20.0f), jM165getSecondary0d7_KjU2, fetVar2, 56, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) mm40Var, (Object) kvi0Var, i, (byte) 10);
        }
    }

    public static final void m(mm40 mm40Var, jvi0 jvi0Var, fet fetVar, int i) {
        long jM165getSecondary0d7_KjU;
        fetVar.g0(1531644789);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(jvi0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            String str = jvi0Var.f17205a;
            y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109);
            y3d y3dVar = jvi0Var.b;
            if (y3dVar == null) {
                fetVar.e0(-1263131650);
                jM165getSecondary0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            } else {
                fetVar.e0(-1263132828);
                fetVar.r(false);
                jM165getSecondary0d7_KjU = y3dVar.f41946a;
            }
            v8q0.a(str, o2e.e0(s5x0.N(mm40Var, 0.0f, 6.0f, 8.0f, 6.0f, 1), "LABEL_CONTAINER"), jM165getSecondary0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 3, 0, null, y9q0Var, fetVar, 0, 24960, 109560);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) mm40Var, (Object) jvi0Var, i, (byte) 9);
        }
    }

    public static final void n(mm40 mm40Var, lvi0 lvi0Var, boolean z, Function0 function0, fet fetVar, int i) {
        fetVar.g0(1835415921);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(lvi0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            uc00 uc00Var = lvi0Var.f20716a;
            boolean z2 = lvi0Var.b;
            boolean z3 = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new r3w(function0, (byte) 28);
                fetVar.o0(objP);
            }
            f7k.k(mm40Var, uc00Var, z2, z, (Function1) objP, fetVar, (i2 & 14) | ((i2 << 3) & 7168), 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lfc0(mm40Var, (Object) lvi0Var, z, (wdr) function0, i, (byte) 9);
        }
    }

    public static final void o(mm40 mm40Var, ugd ugdVar, xdr xdrVar, xdr xdrVar2, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        ugd ugdVar4;
        ugd ugdVar5;
        pfx pfxVarI;
        fetVar.g0(1629936608);
        int i2 = i | (fetVar.i(xdrVar) ? 256 : 128) | (fetVar.i(xdrVar2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            WeakHashMap weakHashMap = djv0.w;
            q33 q33Var = zcm0.i(fetVar).e;
            int i3 = q33Var.e().d;
            Integer numValueOf = Integer.valueOf(i3);
            Integer numValueOf2 = null;
            if (i3 == 0) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                fetVar.e0(-1458143428);
                View view = (View) fetVar.k(dy2.f);
                WeakHashMap weakHashMap2 = rgu0.f30456a;
                xiv0 xiv0VarA = jgu0.a(view);
                if (xiv0VarA != null && (pfxVarI = xiv0VarA.f40966a.i(2)) != null) {
                    numValueOf2 = Integer.valueOf(pfxVarI.d);
                }
                fetVar.r(false);
                numValueOf = numValueOf2;
            } else {
                fetVar.e0(-1293968423);
                fetVar.r(false);
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            boolean zE = fetVar.e(iIntValue);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = new mq8(iIntValue, (byte) 5);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            ugdVar.F(mrv.k0(jm40Var, "MEDIA_ID"), fetVar, 54);
            if (xdrVar == null) {
                fetVar.e0(-1981449899);
                fetVar.r(false);
            } else {
                fetVar.e0(-1449391060);
                w6x.v(((i2 >> 3) & 112) | 6, xdrVar, mrv.k0(jm40Var, "COMPANY_LOGO_ID"), fetVar, false);
            }
            if (xdrVar2 == null) {
                fetVar.e0(-1981371531);
                fetVar.r(false);
            } else {
                fetVar.e0(-1449388532);
                w6x.v(((i2 >> 6) & 112) | 6, xdrVar2, mrv.k0(jm40Var, "PARTNER_LOGO_ID"), fetVar, false);
            }
            ugdVar4 = ugdVar2;
            ugdVar4.F(mrv.k0(jm40Var, "STEP_PROGRESS_BAR_ID"), fetVar, 54);
            mm40 mm40VarK0 = mrv.k0(jm40Var, "APP_VERSION_ID");
            ugdVar5 = ugdVar3;
            ugdVar5.F(mm40VarK0, fetVar, 54);
            fetVar.r(true);
        } else {
            ugdVar4 = ugdVar2;
            ugdVar5 = ugdVar3;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nq00(mm40Var, ugdVar, xdrVar, xdrVar2, ugdVar4, ugdVar5, i, (byte) 2);
        }
    }

    public static final void p(mm40 mm40Var, mfm mfmVar, nfm nfmVar, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(301128668);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar2.g(mfmVar) ? 32 : 16) | (fetVar2.g(nfmVar) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = o7k0.e(mm40Var, nfmVar.e);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            if (mfmVar.b()) {
                fetVar2.e0(1012411672);
                mm40 mm40VarN = o7k0.n(jm40.b, nfmVar.c);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN2 = s5x0.N(mm40VarN, 0.0f, 0.0f, 2.0f, 0.0f, 11);
                tj30 tj30VarC = zq8.c(gqw0.b, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar);
                jpm0.o(fetVar2, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar4);
                dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_popular_red, 6, fetVar2), fetVar2), null, null, ((StaticColors) fetVar2.k(m8m0.f21378a)).m113getRed0d7_KjU(), fetVar2, 56, 4);
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1012913314);
                fetVar2.r(false);
            }
            f1t0.a(null, mfmVar.getHeader(), ibc.Y(nfmVar.b, fetVar2), null, 0L, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, nfmVar.f23444a, 0L, fetVar, 0, 437241);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51((Object) mm40Var, (Object) mfmVar, (Object) nfmVar, i, (byte) 11);
        }
    }

    public static final void q(mm40 mm40Var, pz40 pz40Var, Function0 function0, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        Object obj;
        int i4;
        mm40 mm40Var3;
        fetVar.g0(-1400828709);
        int i5 = i2 & 1;
        final byte b = 2;
        if (i5 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        byte b2 = 16;
        int i6 = i3 | (fetVar.g(pz40Var) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
            obj = function0;
        } else {
            obj = function0;
            i4 = i6 | (fetVar.i(obj) ? 256 : 128);
        }
        final byte b3 = 0;
        final byte b4 = 1;
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            mm40 mm40Var4 = i5 != 0 ? jm40.b : mm40Var2;
            if (i7 != 0) {
                obj = null;
            }
            dgm dgmVarA = ((mfm) pz40Var.getValue()).a();
            dgmVarA.getClass();
            boolean zG = fetVar.g(dgmVarA);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                Object nfmVar = new nfm(dgmVarA.a(), dgmVarA.f(), dgmVarA.i(), dgmVarA.b(), dgmVarA.g());
                fetVar.o0(nfmVar);
                objP = nfmVar;
            }
            final nfm nfmVar2 = (nfm) objP;
            final mfm mfmVar = (mfm) pz40Var.getValue();
            if (mfmVar != null) {
                if (mfmVar instanceof lfm) {
                    fetVar.e0(-1871615506);
                    j(s5x0.N(mm40Var4, 0.0f, 0.0f, 0.0f, ((lfm) mfmVar).b.b(), 7), u1c.M(1234169995, new xdr() { // from class: a.ov20
                        @Override // a.xdr
                        public final Object F(Object obj2, Object obj3, Object obj4) {
                            byte b5 = b3;
                            jm40 jm40Var = jm40.b;
                            nfm nfmVar3 = nfmVar2;
                            mfm mfmVar2 = mfmVar;
                            yhg0 yhg0Var = (yhg0) obj2;
                            fet fetVar2 = (fet) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            switch (b5) {
                                case 0:
                                    yhg0Var.getClass();
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        l7x.p(o7k0.d(jm40Var, 1.0f), mfmVar2, nfmVar3, fetVar2, 6);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                case 1:
                                    yhg0Var.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= fetVar2.g(yhg0Var) ? 4 : 2;
                                    }
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        l7x.p(yhg0Var.a(1.0f, jm40Var, true), mfmVar2, nfmVar3, fetVar2, 0);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                default:
                                    yhg0Var.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= fetVar2.g(yhg0Var) ? 4 : 2;
                                    }
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        l7x.p(yhg0Var.a(0.65f, jm40Var, true), mfmVar2, nfmVar3, fetVar2, 0);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), null, null, fetVar, 384, 26);
                    fetVar.r(false);
                } else if (mfmVar instanceof jfm) {
                    fetVar.e0(2109791982);
                    j(s5x0.N(mm40Var4, 0.0f, 0.0f, 0.0f, ((jfm) mfmVar).b.b(), 7), u1c.M(130022196, new xdr() { // from class: a.ov20
                        @Override // a.xdr
                        public final Object F(Object obj2, Object obj3, Object obj4) {
                            byte b5 = b4;
                            jm40 jm40Var = jm40.b;
                            nfm nfmVar3 = nfmVar2;
                            mfm mfmVar2 = mfmVar;
                            yhg0 yhg0Var = (yhg0) obj2;
                            fet fetVar2 = (fet) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            switch (b5) {
                                case 0:
                                    yhg0Var.getClass();
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        l7x.p(o7k0.d(jm40Var, 1.0f), mfmVar2, nfmVar3, fetVar2, 6);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                case 1:
                                    yhg0Var.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= fetVar2.g(yhg0Var) ? 4 : 2;
                                    }
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        l7x.p(yhg0Var.a(1.0f, jm40Var, true), mfmVar2, nfmVar3, fetVar2, 0);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                default:
                                    yhg0Var.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= fetVar2.g(yhg0Var) ? 4 : 2;
                                    }
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        l7x.p(yhg0Var.a(0.65f, jm40Var, true), mfmVar2, nfmVar3, fetVar2, 0);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), null, u1c.M(-737905166, new ngz(mfmVar, obj, b2), fetVar), fetVar, 25008, 8);
                    fetVar.r(false);
                } else if (mfmVar instanceof kfm) {
                    fetVar.e0(-1871565597);
                    j(s5x0.N(mm40Var4, 0.0f, 0.0f, 0.0f, ((kfm) mfmVar).b.b(), 7), u1c.M(1179891411, new xdr() { // from class: a.ov20
                        @Override // a.xdr
                        public final Object F(Object obj2, Object obj3, Object obj4) {
                            byte b5 = b;
                            jm40 jm40Var = jm40.b;
                            nfm nfmVar3 = nfmVar2;
                            mfm mfmVar2 = mfmVar;
                            yhg0 yhg0Var = (yhg0) obj2;
                            fet fetVar2 = (fet) obj3;
                            int iIntValue = ((Integer) obj4).intValue();
                            switch (b5) {
                                case 0:
                                    yhg0Var.getClass();
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        l7x.p(o7k0.d(jm40Var, 1.0f), mfmVar2, nfmVar3, fetVar2, 6);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                case 1:
                                    yhg0Var.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= fetVar2.g(yhg0Var) ? 4 : 2;
                                    }
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        l7x.p(yhg0Var.a(1.0f, jm40Var, true), mfmVar2, nfmVar3, fetVar2, 0);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                default:
                                    yhg0Var.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= fetVar2.g(yhg0Var) ? 4 : 2;
                                    }
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        l7x.p(yhg0Var.a(0.65f, jm40Var, true), mfmVar2, nfmVar3, fetVar2, 0);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), u1c.M(745927730, new p0z((Object) mfmVar, (byte) 10), fetVar), null, fetVar, 3456, 18);
                    fetVar.r(false);
                }
                mm40Var3 = mm40Var4;
            }
            throw b1j.f(-1871614713, fetVar, false);
        }
        fetVar.X();
        mm40Var3 = mm40Var2;
        Object obj2 = obj;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51(mm40Var3, (Object) pz40Var, obj2, i, i2, (byte) 10);
        }
    }

    public static final void r(mm40 mm40Var, mvi0 mvi0Var, fet fetVar, int i) {
        long jM183getTextPrimary0d7_KjU;
        fetVar.g0(2092776523);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(mvi0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            String str = mvi0Var.f22458a;
            y9q0 y9q0Var = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109);
            y3d y3dVar = mvi0Var.b;
            if (y3dVar == null) {
                fetVar.e0(1113553206);
                jM183getTextPrimary0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                fetVar.r(false);
            } else {
                fetVar.e0(1113552028);
                fetVar.r(false);
                jM183getTextPrimary0d7_KjU = y3dVar.f41946a;
            }
            v8q0.a(str, s5x0.N(mm40Var, 0.0f, 6.0f, 8.0f, 6.0f, 1), jM183getTextPrimary0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 3, 0, null, y9q0Var, fetVar, 0, 24960, 109560);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) mm40Var, (Object) mvi0Var, i, (byte) 13);
        }
    }

    public static final void s(mm40 mm40Var, ugd ugdVar, tj30 tj30Var, fet fetVar, int i) {
        fetVar.g0(-1663319424);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(tj30Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int iHashCode = Integer.hashCode(e3c.x(fetVar));
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            bh90 bh90VarM = fetVar.m();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            mkd.c0.getClass();
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            djx djxVar = new djx((byte) 27);
            if (fetVar.S) {
                fetVar.b(Unit.f46060a, new ru80(djxVar, (byte) 23));
            }
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            twn.v(6, ugdVar, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(mm40Var, ugdVar, tj30Var, i, (byte) 24);
        }
    }

    public static final void t(a4x a4xVar, Function1 function1, fet fetVar, int i) {
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(1488899606);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 718184648, a4xVar);
            while (itO.hasNext()) {
                e180 e180Var = (e180) itO.next();
                Object objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (objP == obj) {
                    objP = dw9.j(fetVar);
                }
                gy40 gy40Var = (gy40) objP;
                boolean zI = ((i2 & 112) == 32) | fetVar.i(e180Var);
                Object objP2 = fetVar.P();
                if (zI || objP2 == obj) {
                    objP2 = new a540((byte) 26, (Object) e180Var, function1);
                    fetVar.o0(objP2);
                }
                dww.c(a8k0.F(e180Var.b, 0, fetVar), null, y860.W(jm40Var, gy40Var, null, false, null, (Function0) objP2, 28), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), fetVar, 56, 0);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q0h((byte) 5, i, a4xVar, function1);
        }
    }

    public static final void u(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fetVar.g0(1222905388);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            str2 = str;
            v8q0.a(str2, s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, (i2 >> 3) & 14, 0, 131064);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var2, str2, i, (byte) 14);
        }
    }

    public static final void v(mm40 mm40Var, nvi0 nvi0Var, boolean z, Function0 function0, fet fetVar, int i) {
        fetVar.g0(-855664561);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(nvi0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "BalanceItemComponentRadioButtonTagNew");
            boolean z2 = nvi0Var.f24188a;
            boolean z3 = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new l3c0(function0, (byte) 13);
                fetVar.o0(objP);
            }
            yom.b(mm40VarE0, z2, z, (Function0) objP, fetVar, i2 & 896, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lfc0(mm40Var, (Object) nvi0Var, z, (wdr) function0, i, (byte) 5);
        }
    }

    public static final void w(final int i, final int i2, long j, fet fetVar, final mm40 mm40Var) {
        int i3;
        long jM170getSecondary600d7_KjU;
        fetVar.g0(-1761480945);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                jM170getSecondary600d7_KjU = j;
                int i4 = fetVar.f(jM170getSecondary600d7_KjU) ? 32 : 16;
                i3 |= i4;
            } else {
                jM170getSecondary600d7_KjU = j;
            }
            i3 |= i4;
        } else {
            jM170getSecondary600d7_KjU = j;
        }
        byte b = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            } else if ((i2 & 2) != 0) {
                pz40 pz40Var = s6t0.f31722a;
                jM170getSecondary600d7_KjU = s6t0.b().f33626a.getSecondary60();
            }
            fetVar.s();
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new b4f0(b);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40Var, null, null, false, null, (Function0) objP, 28);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            kpb.j(null, new dkm((ycl) null, new y3d(jM170getSecondary600d7_KjU), 3), fetVar, 0, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        final long j2 = jM170getSecondary600d7_KjU;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.c4f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    l7x.w(x8x.L(i | 1), i2, j2, (fet) obj, mm40Var);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void x(final mm40 mm40Var, final pz40 pz40Var, final lh80 lh80Var, final Function1 function1, fet fetVar, int i) {
        int i2;
        function1.getClass();
        fetVar.g0(-1823193151);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pz40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(lh80Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            final k6z k6zVar = (k6z) fetVar.k(bmd.n);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = Integer.valueOf(((apm) pz40Var.getValue()).c);
                fetVar.o0(objP);
            }
            final int iIntValue = ((Number) objP).intValue();
            vcg0 vcg0Var = ((apm) pz40Var.getValue()).b;
            ((apm) pz40Var.getValue()).getClass();
            final edg0 edg0VarK = n7x.K(vcg0Var);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = jgk0.b(new rip(pz40Var, (byte) 22));
                fetVar.o0(objP2);
            }
            final l7m0 l7m0Var = (l7m0) objP2;
            nnw0.g(null, null, false, u1c.M(1417926315, new xdr() { // from class: a.wcg0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    lr8 lr8Var = (lr8) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    lr8Var.getClass();
                    if ((iIntValue2 & 6) == 0) {
                        iIntValue2 |= fetVar2.g(lr8Var) ? 4 : 2;
                    }
                    if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                        float fB = pkd.b(lr8Var.d(), fetVar2);
                        zcl zclVar = qmk.f28987a;
                        float fB2 = pkd.b(56.0f, fetVar2);
                        float fB3 = pkd.b(8.0f, fetVar2);
                        lh80 lh80Var2 = lh80Var;
                        k6z k6zVar2 = k6zVar;
                        float fB4 = pkd.b(s5x0.B(lh80Var2, k6zVar2), fetVar2);
                        xcz xczVarA = ddz.a(iIntValue, -((int) (((fB / 2.0f) - (fB2 / 2.0f)) - fB4)), fetVar2, 6, 0);
                        Unit unit = Unit.f46060a;
                        pz40 pz40Var2 = pz40Var;
                        boolean zG = fetVar2.g(pz40Var2) | fetVar2.g(xczVarA) | fetVar2.d(fB2) | fetVar2.d(fB3) | fetVar2.d(fB4);
                        Object objP3 = fetVar2.P();
                        cl5 cl5Var2 = ukd.f35823a;
                        if (zG || objP3 == cl5Var2) {
                            ycg0 ycg0Var = new ycg0(pz40Var2, xczVarA, fB2, fB3, fB4, null, (byte) 0);
                            fetVar2.o0(ycg0Var);
                            objP3 = ycg0Var;
                        }
                        m0x0.t(fetVar2, unit, (Function2) objP3);
                        mm40 mm40VarE0 = o2e.e0(mm40Var, "ROLLING_CALENDAR_LAZY_ROW");
                        qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                        boolean zBooleanValue = ((Boolean) l7m0Var.getValue()).booleanValue();
                        boolean zG2 = fetVar2.g(pz40Var2);
                        edg0 edg0Var = edg0VarK;
                        boolean zG3 = zG2 | fetVar2.g(edg0Var);
                        Function1 function2 = function1;
                        boolean zG4 = zG3 | fetVar2.g(function2) | fetVar2.e(k6zVar2.ordinal());
                        Object objP4 = fetVar2.P();
                        if (zG4 || objP4 == cl5Var2) {
                            objP4 = new enm(pz40Var2, edg0Var, function2, k6zVar2);
                            fetVar2.o0(objP4);
                        }
                        b8k0.f(mm40VarE0, xczVarA, lh80Var2, zBooleanValue, qw3Var, null, null, false, null, (Function1) objP4, fetVar2, 0, Response.TEMPORARILY_UNAVAILABLE);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 3072, 7);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ku90((byte) 6, i, (Object) mm40Var, (Object) pz40Var, (Object) lh80Var, (Object) function1);
        }
    }

    public static final void y(mm40 mm40Var, pl7 pl7Var, Function1 function1, fet fetVar, int i) {
        Object acdVar;
        w2d w2dVar;
        xcz xczVar;
        pl7Var.getClass();
        function1.getClass();
        fetVar.g0(-1541164158);
        int i2 = i | (fetVar.g(pl7Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            w2d w2dVarW0 = uzb.w0(0, fetVar);
            wom womVarF = mom.f(fetVar);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            androidx.compose.runtime.d dVar = zaq0.b;
            long jM165getSecondary0d7_KjU = ((ThemeColors) fetVar.k(dVar)).getSecondary();
            Boolean boolValueOf = Boolean.valueOf(pl7Var.e());
            boolean zI = ((i2 & 112) == 32) | fetVar.i(w2dVarW0) | fetVar.g(xczVarA) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                w2dVar = w2dVarW0;
                acdVar = new acd(pl7Var, w2dVar, xczVarA, function1, null, (byte) 2);
                xczVar = xczVarA;
                fetVar.o0(acdVar);
            } else {
                xczVar = xczVarA;
                acdVar = objP;
                w2dVar = w2dVarW0;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) acdVar);
            v2n0.b(knm0.r(mm40Var), w2dVar, ((ThemeColors) fetVar.k(dVar)).getBackground(), 0.0f, u1c.M(11458669, new mvg0(w2dVar, pl7Var, function1, jM165getSecondary0d7_KjU, (byte) 0), fetVar), u1c.M(1110115113, new vbd(pl7Var, womVarF, w2dVar, function1, xczVar, (byte) 1), fetVar), fetVar, 224320, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbd(mm40Var, pl7Var, function1, i, (byte) 2);
        }
    }

    public static final void z(mm40 mm40Var, eoa0 eoa0Var, fet fetVar, int i) {
        boolean z;
        fet fetVar2 = fetVar;
        String str = eoa0Var.f;
        String str2 = eoa0Var.e;
        fetVar2.g0(1789499378);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(eoa0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            boolean zG = fetVar2.g(str2) | fetVar2.g(str);
            Object objP = fetVar2.P();
            if (zG || objP == ukd.f35823a) {
                objP = Boolean.valueOf(str2.length() > 0 || str.length() > 0);
                fetVar2.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            zcl zclVar = qmk.f28987a;
            pz40 pz40Var = s6t0.f31722a;
            dn8 dn8VarH = j120.h(2.0f, s6t0.b().f33626a.getSeparator());
            mm40 mm40VarK = s5x0.K(i120.T(mm40Var, dn8VarH.f6356a, dn8VarH.b, vgg0.a(16.0f)), 16.0f, zBooleanValue ? 8.0f : 10.0f);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            yx7 yx7Var2 = gqw0.l;
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var2, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            v8q0.a(eoa0Var.f8130a, jm40Var, eoa0Var.c, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 48, 0, 260968);
            fet fetVar3 = fetVar;
            if (zBooleanValue) {
                fetVar3.e0(2035772932);
                v8q0.a(str2, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), eoa0Var.c, null, qmk.o, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar3, 0, 0, 260968);
                fetVar3 = fetVar3;
                z = false;
                fetVar3.r(false);
            } else {
                z = false;
                fetVar3.e0(2036159688);
                fetVar3.r(false);
            }
            fetVar3.r(true);
            v8q0.a(Separators.COLON, s5x0.N(r19, 2.0f, zBooleanValue ? 2.0f : 0.0f, 2.0f, 0.0f, 8), s6t0.b().f33626a.getSecondary(), null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 6, 0, 260968);
            thg0 thg0VarA3 = shg0.a(lw3Var, yx7Var2, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA3, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            v8q0.a(eoa0Var.b, null, eoa0Var.d, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260970);
            fetVar2 = fetVar;
            if (zBooleanValue) {
                fetVar2.e0(-2050494419);
                v8q0.a(str, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), eoa0Var.d, null, qmk.o, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar2, 0, 0, 260968);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-2050107663);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(mm40Var, eoa0Var, i, (byte) 23);
        }
    }
}
