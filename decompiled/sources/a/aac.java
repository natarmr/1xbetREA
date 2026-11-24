package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class aac {
    public static final void A(mm40 mm40Var, j1n j1nVar, boolean z, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        fetVar.g0(-1012428399);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j1nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarE = o7k0.e(mm40Var2, 24.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            d280 d280Var = j1nVar.b;
            if (d280Var != null) {
                fetVar.e0(1953580699);
                boolean zG = fetVar.g(d280Var);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (zG || objP == cl5Var) {
                    objP = new u6n(d4d.SECONDARY60, w6n.j, d280Var);
                    fetVar.o0(objP);
                }
                u6n u6nVar = (u6n) objP;
                boolean zG2 = fetVar.g(u6nVar);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == cl5Var) {
                    objP2 = new d1n(u6nVar, (byte) 1);
                    fetVar.o0(objP2);
                }
                kkb.p(1, fetVar, null, (Function0) objP2);
                fetVar.r(false);
            } else {
                fetVar.e0(1953974709);
                fetVar.r(false);
            }
            String str = j1nVar.f15744a;
            y9q0 y9q0VarM = g1t0.m();
            v8q0.a(str, new x7z(1.0f, false), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), new n05(qmk.p, g1t0.m().f42262a.b, qmk.n), 0L, null, null, g1t0.m().f42262a.f, 0L, null, qmk.C, 2, false, 2, 0, null, y9q0VarM, fetVar, 0, 24960, 108400);
            fetVar2 = fetVar;
            if (z) {
                fetVar2.e0(1954611542);
                vic.e(null, y0m.b, fetVar2, 48, 1);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1954702837);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((byte) 24, i, mm40Var2, (Object) j1nVar, z);
        }
    }

    public static final void B(int i, j1n j1nVar, j1n j1nVar2, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        x0m x0mVar = x0m.f40076a;
        fetVar.g0(229120408);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j1nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(j1nVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g("") ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g("") ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(uem.f35536a) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.e(0) ? 8388608 : 4194304;
        }
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            yx7 yx7Var = gqw0.l;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            x7z x7zVarI = ohs0.i(fetVar, mm40VarC0, shdVar4, 1.0f, true);
            int i3 = i2;
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(yx7Var, (byte) 11)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, x7zVarI);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            x0m x0mVar2 = x0m.f40076a;
            A(null, j1nVar, false, fetVar, i3 & 112);
            x0m x0mVar3 = x0m.f40076a;
            A(null, j1nVar2, false, fetVar, (i3 >> 3) & 112);
            fetVar.r(true);
            fetVar.e0(-132642522);
            fetVar.r(false);
            int i4 = i3 << 9;
            H(((i3 >> 6) & 8176) | (57344 & i4) | (i4 & 458752), j1nVar, j1nVar2, fetVar, null, str);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n1n(mm40Var2, j1nVar, j1nVar2, str, i);
        }
    }

    public static final void C(int i, String str, t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, fav favVar, fet fetVar, int i2) {
        int i3;
        fav favVar2;
        cl5 cl5Var;
        w6k w6kVar;
        int i4 = i;
        fetVar.g0(-1304319579);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.e(i4) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar.g(t33Var) : fetVar.i(t33Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? fetVar.g(t33Var2) : fetVar.i(t33Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (i2 & 32768) == 0 ? fetVar.g(t33Var3) : fetVar.i(t33Var3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= (262144 & i2) == 0 ? fetVar.g(t33Var4) : fetVar.i(t33Var4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.e(favVar.ordinal()) ? 1048576 : 524288;
        }
        int i5 = i3;
        byte b = 0;
        if (fetVar.U(i5 & 1, (599187 & i5) != 599186)) {
            w6k w6kVar2 = (w6k) fetVar.k(bmd.h);
            Object objP = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP == cl5Var2) {
                cl5Var = cl5Var2;
                w6kVar = w6kVar2;
                objP = jgk0.b(new vk8(t33Var, i4, t33Var4, favVar, (byte) 3));
                fetVar.o0(objP);
            } else {
                cl5Var = cl5Var2;
                w6kVar = w6kVar2;
            }
            l7m0 l7m0Var = (l7m0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                i4 = i;
                objP2 = jgk0.b(new vk8(t33Var, i4, t33Var4, t33Var2, (byte) 4));
                fetVar.o0(objP2);
            } else {
                i4 = i;
            }
            l7m0 l7m0Var2 = (l7m0) objP2;
            favVar2 = favVar;
            mm40 mm40VarN = o7k0.n(o2e.e0(jm40.b, favVar2 == fav.f9228a ? "GOLD_RUSH_FIRST_PLAYER_ICON" : "GOLD_RUSH_SECOND_PLAYER_ICON"), w6kVar.r0(i4));
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarN, 2.0f);
            boolean z = (57344 & i5) == 16384 || ((i5 & 32768) != 0 && fetVar.i(t33Var3));
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new k9v(t33Var3, l7m0Var, l7m0Var2, b);
                fetVar.o0(objP3);
            }
            k7x.a(str, null, i4w0.T(mm40VarJ, (Function1) objP3), gqw0.A, null, fetVar, ((i5 >> 3) & 14) | 1572912, 1976);
        } else {
            favVar2 = favVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l9v(i4, str, t33Var, t33Var2, t33Var3, t33Var4, favVar2, i2);
        }
    }

    public static final void D(mm40 mm40Var, String str, dkk dkkVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(172433623);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(dkkVar) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.o, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109);
            jm40 jm40Var = jm40.b;
            v8q0.a(str, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), textPrimary, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i2 >> 3) & 14, 24960, 109560);
            fetVar2 = fetVar;
            E(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), R.drawable.ic_glyph_cyber_kosti_one, dkkVar.f6234a, dkkVar.b, dkkVar.c, fetVar2, 0, 0);
            E(null, R.drawable.ic_glyph_cyber_kosti_two, dkkVar.d, dkkVar.e, dkkVar.f, fetVar2, 0, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kwm(mm40Var, str, dkkVar, i, (byte) 2);
        }
    }

    public static final void E(mm40 mm40Var, int i, String str, String str2, String str3, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        fet fetVar2 = fetVar;
        fetVar2.g0(191049966);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2 | (fetVar2.g(mm40Var2) ? 4 : 2);
        }
        int i6 = i4 | (fetVar2.e(i) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.g(str3) ? 16384 : 8192);
        if (fetVar2.U(i6 & 1, (i6 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            if (i5 != 0) {
                mm40Var2 = jm40Var;
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var2, 20.0f);
            thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 6.0f, 0.0f, 11);
            zfn zfnVar = zaq0.b;
            F(mm40VarN, str3, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), true, fetVar2, ((i6 >> 9) & 112) | 3072, 0);
            F(s5x0.N(jm40Var, 0.0f, 0.0f, 6.0f, 0.0f, 11), str2, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), false, fetVar, (i6 >> 6) & 112, 8);
            int i7 = i6 >> 3;
            fetVar2 = fetVar;
            F(s5x0.N(jm40Var, 0.0f, 0.0f, 6.0f, 0.0f, 11), str, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), false, fetVar2, i7 & 112, 8);
            dww.c(a8k0.F(i, i7 & 14, fetVar2), "", o7k0.n(jm40Var, 16.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lwm(mm40Var2, i, str, str2, str3, i2, i3, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0112  */
    /* JADX WARN: Code duplicated, block: B:61:0x012f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0156  */
    /* JADX WARN: Code duplicated, block: B:66:0x0158  */
    /* JADX WARN: Code duplicated, block: B:68:0x015b  */
    /* JADX WARN: Code duplicated, block: B:69:0x015d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0168  */
    /* JADX WARN: Code duplicated, block: B:75:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x016d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0174  */
    /* JADX WARN: Code duplicated, block: B:80:0x017a  */
    /* JADX WARN: Code duplicated, block: B:81:0x017e  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void F(mm40 mm40Var, String str, long j, boolean z, fet fetVar, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        fet fetVar2;
        boolean z4;
        yfe0 yfe0VarU;
        boolean z5;
        mm40 mm40VarN;
        int i4;
        boolean z6;
        Object objP;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objP2;
        String strL;
        fetVar.g0(-1487895432);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.f(j) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                i3 |= fetVar.h(z2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i3 & 1, z3)) {
                if (i5 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (z5) {
                    fetVar.e0(-1830145181);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN2 = o7k0.n(mm40Var, 20.0f);
                    dn8 dn8VarH = j120.h(1.0f, ((ThemeColors) fetVar.k(zaq0.b)).getSeparator());
                    mm40VarN = i120.T(mm40VarN2, dn8VarH.f6356a, dn8VarH.b, vgg0.a(6.0f));
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1829915471);
                    fetVar.r(false);
                    zcl zclVar2 = qmk.f28987a;
                    mm40VarN = o7k0.n(mm40Var, 20.0f);
                }
                tj30 tj30VarC = zq8.c(gqw0.e, false);
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
                i4 = i3 & 7168;
                if (i4 == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (z6 || objP == cl5Var) {
                    if (z5) {
                        objP = new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                    } else {
                        objP = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
                    }
                    fetVar.o0(objP);
                }
                y9q0 y9q0Var = (y9q0) objP;
                if ((i3 & 112) == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (i4 == 2048) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z7 | z8;
                objP2 = fetVar.P();
                if (z9 || objP2 == cl5Var) {
                    strL = null;
                    if (z5) {
                        if (str != null) {
                            strL = ttm0.L(2, str);
                        }
                    } else if (str != null) {
                        strL = ttm0.L(1, str);
                    }
                    if (strL == null) {
                        objP2 = "-";
                    } else {
                        objP2 = strL;
                    }
                    fetVar.o0(objP2);
                }
                v8q0.a((String) objP2, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, i3 & 896, 24960, 110586);
                fetVar2 = fetVar;
                fetVar2.r(true);
                z4 = z5;
            } else {
                fetVar2 = fetVar;
                fetVar2.X();
                z4 = z2;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new vwm(mm40Var, str, j, z4, i, i2, (byte) 0);
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i3 & 1, z3)) {
            if (i5 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if (z5) {
                fetVar.e0(-1830145181);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarN3 = o7k0.n(mm40Var, 20.0f);
                dn8 dn8VarH2 = j120.h(1.0f, ((ThemeColors) fetVar.k(zaq0.b)).getSeparator());
                mm40VarN = i120.T(mm40VarN3, dn8VarH2.f6356a, dn8VarH2.b, vgg0.a(6.0f));
                fetVar.r(false);
            } else {
                fetVar.e0(-1829915471);
                fetVar.r(false);
                zcl zclVar4 = qmk.f28987a;
                mm40VarN = o7k0.n(mm40Var, 20.0f);
            }
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            i4 = i3 & 7168;
            if (i4 == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            objP = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z6) {
                if (z5) {
                    objP = new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                } else {
                    objP = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
                }
                fetVar.o0(objP);
            } else {
                if (z5) {
                    objP = new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
                } else {
                    objP = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
                }
                fetVar.o0(objP);
            }
            y9q0 y9q0Var2 = (y9q0) objP;
            if ((i3 & 112) == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i4 == 2048) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = z7 | z8;
            objP2 = fetVar.P();
            if (z9) {
                strL = null;
                if (z5) {
                    if (str != null) {
                        strL = ttm0.L(2, str);
                    }
                } else if (str != null) {
                    strL = ttm0.L(1, str);
                }
                if (strL == null) {
                    objP2 = "-";
                } else {
                    objP2 = strL;
                }
                fetVar.o0(objP2);
            } else {
                strL = null;
                if (z5) {
                    if (str != null) {
                        strL = ttm0.L(2, str);
                    }
                } else if (str != null) {
                    strL = ttm0.L(1, str);
                }
                if (strL == null) {
                    objP2 = "-";
                } else {
                    objP2 = strL;
                }
                fetVar.o0(objP2);
            }
            v8q0.a((String) objP2, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var2, fetVar, i3 & 896, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            z4 = z5;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            z4 = z2;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vwm(mm40Var, str, j, z4, i, i2, (byte) 0);
        }
    }

    public static final void G(int i, fet fetVar, mm40 mm40Var, String str, String str2, String str3) {
        mm40 mm40Var2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1218315966);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.h(false) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.h(false) ? 131072 : 65536;
        }
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar2.e0(1724439469);
            long textPrimary = afn0.m(fetVar2).getTextPrimary();
            fetVar2.r(false);
            fetVar2.e0(1724443693);
            long textPrimary2 = afn0.m(fetVar2).getTextPrimary();
            fetVar2.r(false);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(jm40Var, 32.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (str.length() > 0) {
                fetVar2.e0(-276752217);
                z = true;
                v8q0.a(str, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), afn0.m(fetVar2).getSecondary80(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, (i2 >> 3) & 14, 24960, 110584);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2.e0(-276451114);
                fetVar2.r(false);
            }
            dyb.r((i2 >> 3) & 112, 1, textPrimary, fetVar2, null, str2);
            fetVar2 = fetVar;
            dyb.r((i2 >> 6) & 112, 1, textPrimary2, fetVar2, null, str3);
            fetVar2.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a0n(mm40Var2, str, str2, str3, i, (byte) 2);
        }
    }

    public static final void H(int i, j1n j1nVar, j1n j1nVar2, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fetVar.g0(-1963335204);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g("") ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g("") ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(j1nVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(j1nVar2) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            brm0.x(fetVar, mm40VarC0, gqw0.v, -1329227222, false);
            fetVar.e0(-1328923670);
            fetVar.r(false);
            if (j1nVar.c.length() <= 0 || j1nVar2.c.length() <= 0) {
                fetVar.e0(-1328417750);
                fetVar.r(false);
            } else {
                fetVar.e0(-1328805994);
                G((i2 >> 6) & 112, fetVar, null, str, j1nVar.c, j1nVar2.c);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n1n(mm40Var2, str, j1nVar, j1nVar2, i);
        }
    }

    public static final void I(mm40 mm40Var, k6z k6zVar, sfh0 sfh0Var, boolean z, String str, Function0 function0, Function2 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        k6zVar.getClass();
        function0.getClass();
        fetVar.g0(20244235);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.e(k6zVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(sfh0Var) : fetVar.i(sfh0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function2) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_cancel, 0, fetVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 40.0f);
            int i3 = i2 >> 6;
            long jA = sfh0Var.a(fetVar);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, jA, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            dww.c(a8k0.F(R.drawable.ic_glyph_search_view, 0, fetVar), null, o2e.e0(s5x0.N(jm40Var, 12.0f, 0.0f, 8.0f, 0.0f, 10), "SEARCH_VIEW"), sfh0Var.d(fetVar), fetVar, 56, 0);
            String str2 = str == null ? "" : str;
            zfn zfnVar = bmd.n;
            obc.d(zfnVar.a(pkd.g(str2, fetVar)), u1c.M(-296399313, new zw8(z, (k6z) fetVar.k(zfnVar), sfh0Var, str2, k6zVar, function2), fetVar), fetVar, 56);
            j(pm80VarF, !z, sfh0Var, function0, fetVar, (i2 & 896) | 8 | (i3 & 7168));
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o84(mm40Var2, (Object) k6zVar, (Object) sfh0Var, z, str, function0, (wdr) function2, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:30:0x0154  */
    /* JADX WARN: Code duplicated, block: B:50:0x0215  */
    /* JADX WARN: Code duplicated, block: B:53:0x0267  */
    /* JADX WARN: Code duplicated, block: B:56:0x0281  */
    /* JADX WARN: Code duplicated, block: B:59:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x02d5 -> B:60:0x02d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x02e0 -> B:62:0x02ed). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object J(a.t33 r26, a.t33 r27, a.t33 r28, a.t33 r29, java.util.List r30, a.pz40 r31, a.pz40 r32, a.t3t r33, a.zje r34) {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.aac.J(a.t33, a.t33, a.t33, a.t33, java.util.List, a.pz40, a.pz40, a.t3t, a.zje):java.lang.Object");
    }

    public static final void K(cp cpVar) {
        List list = u0d.f34849a;
        yfu0 yfu0Var = cpVar.u;
        u0d.j(((p5g) yfu0Var).c, ((w5g) cpVar.u()).d.f29883a, ((w5g) cpVar.u()).d.c, 0, null, null, null, 508);
        ((p5g) yfu0Var).c.setVisibility(!((w5g) cpVar.u()).d.b ? 4 : 0);
    }

    public static final void L(cp cpVar) {
        boolean zC = cy7.c();
        yfu0 yfu0Var = cpVar.u;
        if (zC) {
            ((p5g) yfu0Var).e.setGravity(5);
        } else {
            ((p5g) yfu0Var).e.setGravity(3);
        }
        ((p5g) yfu0Var).e.setText(((w5g) cpVar.u()).g);
    }

    public static final void M(FrameLayout frameLayout, ArrayList arrayList, ArrayList arrayList2) {
        int iApplyDimension = (int) TypedValue.applyDimension(1, 26.0f, frameLayout.getContext().getResources().getDisplayMetrics());
        Iterator it = new ihu0(frameLayout).iterator();
        int i = 0;
        while (true) {
            jhu0 jhu0Var = (jhu0) it;
            if (!jhu0Var.hasNext()) {
                int i2 = 0;
                for (Object obj : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    String str = (String) obj;
                    c6g c6gVar = (c6g) CollectionsKt.W(i2, arrayList2);
                    if (c6gVar == null) {
                        View viewInflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.cyber_calendar_day_team_item, (ViewGroup) frameLayout, false);
                        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivTeam);
                        if (imageView == null) {
                            hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.ivTeam)));
                            return;
                        }
                        FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                        c6g c6gVar2 = new c6g(frameLayout2, imageView);
                        frameLayout.addView(frameLayout2);
                        arrayList2.add(c6gVar2);
                        if (cy7.c()) {
                            frameLayout2.getClass();
                            sj3.L0(frameLayout2, 0, 0, iApplyDimension * i2, 0, 11);
                        } else {
                            frameLayout2.getClass();
                            sj3.L0(frameLayout2, iApplyDimension * i2, 0, 0, 0, 14);
                        }
                        c6gVar = c6gVar2;
                    }
                    List list = u0d.f34849a;
                    u0d.j(c6gVar.b, str, R.drawable.icon_globe_attr_new, 0, kotlin.collections.a.c(h2x.f12357a), null, null, 492);
                    i2 = i3;
                }
                return;
            }
            Object next = jhu0Var.next();
            int i4 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ((View) next).setVisibility(i < arrayList.size() ? 0 : 8);
            i = i4;
        }
    }

    public static final void N(cp cpVar) {
        boolean zC = cy7.c();
        yfu0 yfu0Var = cpVar.u;
        if (zC) {
            ((p5g) yfu0Var).g.setGravity(5);
        } else {
            ((p5g) yfu0Var).g.setGravity(3);
        }
        ((p5g) yfu0Var).g.setText(((w5g) cpVar.u()).c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.jkd, a.tae0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [a.bet] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List O(t9k0 t9k0Var, Integer num, int i, Integer num2) {
        int iF;
        int iR;
        vy40 vy40Var;
        if (t9k0Var.w || t9k0Var.o() == 0) {
            return iun.f15405a;
        }
        ?? tae0Var = new tae0(t9k0Var);
        if (num2 != null) {
            iF = num2.intValue();
        } else {
            iF = t9k0Var.v;
            if (iF < 0) {
                iF = t9k0Var.F(t9k0Var.b, i);
            }
        }
        if (num == 0) {
            int iO = t9k0Var.i - t9k0Var.O(t9k0Var.b, t9k0Var.q(i));
            ey40 ey40Var = t9k0Var.s;
            num = Integer.valueOf(iO + ((ey40Var == null || (vy40Var = (vy40) ey40Var.b(i)) == null) ? 0 : vy40Var.b));
        }
        int iQ = t9k0Var.q(i) * 5;
        int[] iArr = t9k0Var.b;
        if (iQ < iArr.length) {
            iR = t9k0Var.r(i);
        } else {
            int iF2 = iF >= 0 ? t9k0Var.F(iArr, iF) : iF;
            iR = t9k0Var.r(iF);
            int i2 = iF;
            iF = iF2;
            i = i2;
        }
        while (i >= 0) {
            tae0Var.h(iR, (t9k0Var.b[(t9k0Var.q(i) * 5) + 1] & 536870912) != 0 ? t9k0Var.s(i) : ukd.f35823a, t9k0Var.P(i), num);
            num = t9k0Var.b(i);
            if (iF >= 0) {
                int iF3 = t9k0Var.F(t9k0Var.b, iF);
                iR = t9k0Var.r(iF);
                int i3 = iF;
                iF = iF3;
                i = i3;
            } else {
                i = iF;
            }
        }
        return tae0Var.f16663a;
    }

    public static final int P(float f, float f2, float f3, int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = i - 2;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = i - 1;
        return si30.b((f3 * (i4 <= 1 ? i4 : 1)) + (f2 * i3) + f);
    }

    public static zrq Q(Context context) {
        ProviderInfo providerInfo;
        xrq xrqVar;
        ApplicationInfo applicationInfo;
        nwd cujVar = Build.VERSION.SDK_INT >= 28 ? new cuj() : new nwd();
        PackageManager packageManager = context.getPackageManager();
        z1x.x(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            xrqVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrE = cujVar.e(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrE) {
                    arrayList.add(signature.toByteArray());
                }
                xrqVar = new xrq(str, str2, "emojicompat-emoji-font", null, null, Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                xrqVar = null;
            }
        }
        if (xrqVar == null) {
            return null;
        }
        return new zrq(new yrq(context, xrqVar));
    }

    public static final mm40 R(mm40 mm40Var, long j, float f) {
        mm40Var.getClass();
        return rq8.K(mm40Var, new dx2(fbc.U(y3d.c(y3d.d(j) * f, j)), (byte) 17));
    }

    public static final String S(String str) {
        return str.length() > 13 ? ttm0.L(13, str).concat("...") : str;
    }

    public static final Integer T(p9k0 p9k0Var, nld nldVar, int i, int i2) {
        Integer numT;
        int[] iArr = p9k0Var.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (p9k0Var.j(i) && p9k0Var.i(i) == 206 && Intrinsics.d(p9k0Var.p(iArr, i), ykd.e)) {
                Object objH = p9k0Var.h(i, 0);
                jet jetVar = objH instanceof jet ? (jet) objH : null;
                jff0 jff0Var = jetVar != null ? jetVar.f16392a : null;
                det detVar = jff0Var instanceof det ? (det) jff0Var : null;
                if (detVar != null && detVar.f5966a == nldVar) {
                    return Integer.valueOf(i);
                }
            }
            if (p9k0Var.d(i) && (numT = T(p9k0Var, nldVar, i + 1, i3)) != null) {
                return Integer.valueOf(numT.intValue());
            }
            i = i3;
        }
    }

    public static final a4x U(List list) {
        List arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(jwb.P((vua) it.next()).f19696a));
        }
        if (arrayList.isEmpty()) {
            arrayList = kotlin.collections.a.c(Integer.valueOf(R.drawable.ic_card_shirt));
        }
        return dyb.o0(arrayList);
    }

    public static final long V(File file) {
        file.getClass();
        long length = file.length() - 8192;
        if (length > 0) {
            return length;
        }
        return 0L;
    }

    public static final clz W(Fragment fragment) throws Exception {
        fragment.getClass();
        try {
            return fragment.K();
        } catch (Exception e) {
            if (e instanceof IllegalStateException) {
                return fragment;
            }
            throw e;
        }
    }

    public static final String X(d0t d0tVar, dmr dmrVar) {
        Object next;
        Iterator it = d0tVar.p.n.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmrVar);
        cmr cmrVar = (cmr) next;
        String str = cmrVar != null ? cmrVar.b : null;
        if (str == null) {
            str = "";
        }
        return StringsKt.f0(str);
    }

    public static final long Y(i0w i0wVar) {
        switch (i0wVar.ordinal()) {
            case 0:
            case 2:
            case 5:
            case 6:
                pz40 pz40Var = s6t0.f31722a;
                return StaticColors.INSTANCE.m113getRed0d7_KjU();
            case 1:
                pz40 pz40Var2 = s6t0.f31722a;
                return s6t0.b().f33626a.getPrimary();
            case 3:
            case 4:
            case 8:
                pz40 pz40Var3 = s6t0.f31722a;
                return StaticColors.INSTANCE.m98getGreen0d7_KjU();
            case 7:
                pz40 pz40Var4 = s6t0.f31722a;
                return s6t0.b().f33626a.getSecondary();
            default:
                t9f.b();
                return 0L;
        }
    }

    public static final String Z(i0w i0wVar, ctf0 ctf0Var) {
        int i;
        i0wVar.getClass();
        ctf0Var.getClass();
        switch (i0wVar.ordinal()) {
            case 0:
                i = R.string.error;
                break;
            case 1:
                i = R.string.accepted;
                break;
            case 2:
                i = R.string.loosed;
                break;
            case 3:
                i = R.string.won;
                break;
            case 4:
                i = R.string.paid;
                break;
            case 5:
                i = R.string.removed;
                break;
            case 6:
                i = R.string.expired;
                break;
            case 7:
                i = R.string.blocked;
                break;
            case 8:
                i = R.string.bought;
                break;
            default:
                t9f.b();
                return null;
        }
        return ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0));
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0326  */
    /* JADX WARN: Code duplicated, block: B:181:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:186:0x03e2  */
    public static final void a(final Pair pair, final eav eavVar, final int i, final a4x a4xVar, final int i2, final int i3, final Function1 function1, final Function1 function2, final l7m0 l7m0Var, final fav favVar, fet fetVar, final int i4) {
        int i5;
        int i6;
        Pair pair2;
        eav eavVar2;
        boolean z;
        boolean zG;
        Object objP;
        pz40 pz40Var;
        fet fetVar2;
        t33 t33Var;
        t33 t33Var2;
        t33 t33Var3;
        boolean z2;
        Object objP2;
        fet fetVar3 = fetVar;
        Object obj = pair.b;
        Object obj2 = pair.f46059a;
        a4xVar.getClass();
        function1.getClass();
        function2.getClass();
        l7m0Var.getClass();
        fetVar3.g0(1848023464);
        if ((i4 & 6) == 0) {
            i5 = (fetVar3.g(pair) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= (i4 & 64) == 0 ? fetVar3.g(eavVar) : fetVar3.i(eavVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= fetVar3.e(i) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= (i4 & 4096) == 0 ? fetVar3.g(a4xVar) : fetVar3.i(a4xVar) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= fetVar3.e(i2) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i5 |= fetVar3.e(i3) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i5 |= fetVar3.i(function1) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i5 |= fetVar3.i(function2) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i5 |= fetVar3.g(l7m0Var) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i5 |= fetVar3.e(favVar.ordinal()) ? 536870912 : 268435456;
        }
        int i7 = i5;
        boolean z3 = false;
        if (!fetVar3.U(i7 & 1, (306783379 & i7) != 306783378)) {
            fetVar3.X();
        } else {
            if (i == 0) {
                yfe0 yfe0VarU = fetVar3.u();
                if (yfe0VarU != null) {
                    final byte b = 0;
                    yfe0VarU.d = new Function2() { // from class: a.j9v
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            byte b2 = b;
                            int i8 = i4;
                            switch (b2) {
                                case 0:
                                    ((Integer) obj4).getClass();
                                    int iL = x8x.L(i8 | 1);
                                    aac.a(pair, eavVar, i, a4xVar, i2, i3, function1, function2, l7m0Var, favVar, (fet) obj3, iL);
                                    break;
                                default:
                                    ((Integer) obj4).getClass();
                                    int iL2 = x8x.L(i8 | 1);
                                    aac.a(pair, eavVar, i, a4xVar, i2, i3, function1, function2, l7m0Var, favVar, (fet) obj3, iL2);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    return;
                }
                return;
            }
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar3);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(function2, fetVar3);
            Object objP3 = fetVar3.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.a(((Number) obj2).floatValue());
                fetVar3.o0(objP3);
            }
            agk0 agk0Var = (agk0) objP3;
            Object objP4 = fetVar3.P();
            if (objP4 == cl5Var) {
                objP4 = androidx.compose.runtime.e.a(((Number) obj).floatValue());
                fetVar3.o0(objP4);
            }
            agk0 agk0Var2 = (agk0) objP4;
            Object objP5 = fetVar3.P();
            if (objP5 == cl5Var) {
                objP5 = xf0.c(((Number) obj2).floatValue());
                fetVar3.o0(objP5);
            }
            t33 t33Var4 = (t33) objP5;
            Object objP6 = fetVar3.P();
            if (objP6 == cl5Var) {
                objP6 = xf0.c(((Number) obj).floatValue());
                fetVar3.o0(objP6);
            }
            t33 t33Var5 = (t33) objP6;
            Object objP7 = fetVar3.P();
            if (objP7 == cl5Var) {
                objP7 = xf0.c(1.0f);
                fetVar3.o0(objP7);
            }
            t33 t33Var6 = (t33) objP7;
            Object objP8 = fetVar3.P();
            if (objP8 == cl5Var) {
                objP8 = xf0.c(0.0f);
                fetVar3.o0(objP8);
            }
            t33 t33Var7 = (t33) objP8;
            Object objP9 = fetVar3.P();
            if (objP9 == cl5Var) {
                objP9 = androidx.compose.runtime.e.e(eavVar.f7488a);
                fetVar3.o0(objP9);
            }
            pz40 pz40Var2 = (pz40) objP9;
            Object objP10 = fetVar3.P();
            if (objP10 == cl5Var) {
                objP10 = androidx.compose.runtime.e.e(null);
                fetVar3.o0(objP10);
            }
            pz40 pz40Var3 = (pz40) objP10;
            Object objP11 = fetVar3.P();
            if (objP11 == cl5Var) {
                objP11 = new SnapshotStateList();
                fetVar3.o0(objP11);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objP11;
            Object objP12 = fetVar3.P();
            if (objP12 == cl5Var) {
                objP12 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar3.o0(objP12);
            }
            pz40 pz40Var4 = (pz40) objP12;
            Object objP13 = fetVar3.P();
            if (objP13 == cl5Var) {
                objP13 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar3);
                fetVar3.o0(objP13);
            }
            vne vneVar = (vne) objP13;
            int i8 = 57344 & i7;
            boolean zI = ((i7 & 14) == 4) | (i8 == 16384) | fetVar3.i(t33Var4) | fetVar3.i(t33Var5) | fetVar3.g(pz40VarF2);
            Object objP14 = fetVar3.P();
            if (zI || objP14 == cl5Var) {
                i6 = i8;
                objP14 = new r4j(agk0Var, pair, agk0Var2, i2, pz40Var3, t33Var4, t33Var5, pz40VarF2, null);
                t33Var4 = t33Var4;
                agk0Var = agk0Var;
                pair2 = pair;
                t33Var5 = t33Var5;
                agk0Var2 = agk0Var2;
                fetVar3.o0(objP14);
            } else {
                i6 = i8;
                pair2 = pair;
            }
            m0x0.t(fetVar3, pair2, (Function2) objP14);
            Integer numValueOf = Integer.valueOf(i2);
            Integer numValueOf2 = Integer.valueOf(i3);
            Object value = l7m0Var.getValue();
            boolean zI2 = ((234881024 & i7) == 67108864) | (i6 == 16384) | ((458752 & i7) == 131072) | ((i7 & 7168) == 2048 || ((i7 & 4096) != 0 && fetVar3.i(a4xVar))) | fetVar3.i(t33Var4) | fetVar3.i(t33Var5) | fetVar3.i(t33Var6) | fetVar3.i(t33Var7);
            int i9 = i7 & 112;
            if (i9 != 32) {
                eavVar2 = eavVar;
                if ((i7 & 64) == 0 || !fetVar3.i(eavVar2)) {
                    z = false;
                }
                zG = zI2 | z | fetVar3.g(pz40VarF) | fetVar3.i(vneVar);
                objP = fetVar3.P();
                if (!zG || objP == cl5Var) {
                    t33 t33Var8 = t33Var5;
                    pz40Var = pz40Var2;
                    objP = new m9v(l7m0Var, snapshotStateList, i2, i3, pz40Var4, agk0Var, agk0Var2, a4xVar, t33Var4, t33Var8, t33Var6, t33Var7, eavVar2, vneVar, pz40VarF, pz40Var3, pz40Var, null);
                    fetVar2 = fetVar;
                    t33Var5 = t33Var8;
                    t33Var = t33Var6;
                    fetVar2.o0(objP);
                } else {
                    fetVar2 = fetVar3;
                    t33Var = t33Var6;
                    pz40Var = pz40Var2;
                }
                m0x0.u(numValueOf, numValueOf2, value, (Function2) objP, fetVar2);
                t33Var2 = t33Var5;
                t33Var3 = t33Var4;
                C(i, (String) pz40Var.getValue(), t33Var3, t33Var2, t33Var, t33Var7, favVar, fetVar2, ((i7 >> 6) & 14) | 299520 | ((i7 >> 9) & 3670016));
                fetVar3 = fetVar2;
                Object[] objArr = {Boolean.valueOf(t33Var3.e()), Boolean.valueOf(t33Var2.e()), Boolean.valueOf(t33Var.e()), Boolean.valueOf(t33Var7.e())};
                boolean zI3 = fetVar3.i(t33Var3) | fetVar3.i(t33Var2) | fetVar3.i(t33Var) | fetVar3.i(t33Var7) | fetVar3.g(pz40VarF2);
                if (i9 != 32 || ((i7 & 64) != 0 && fetVar3.i(eavVar2))) {
                    z3 = true;
                }
                z2 = zI3 | z3;
                objP2 = fetVar3.P();
                if (z2 || objP2 == cl5Var) {
                    n9v n9vVar = new n9v(t33Var3, t33Var2, t33Var, t33Var7, pz40VarF2, pz40Var3, pz40Var, eavVar2, null);
                    fetVar3.o0(n9vVar);
                    objP2 = n9vVar;
                }
                m0x0.w(objArr, (Function2) objP2, fetVar3);
            } else {
                eavVar2 = eavVar;
            }
            z = true;
            zG = zI2 | z | fetVar3.g(pz40VarF) | fetVar3.i(vneVar);
            objP = fetVar3.P();
            if (zG) {
                t33 t33Var9 = t33Var5;
                pz40Var = pz40Var2;
                objP = new m9v(l7m0Var, snapshotStateList, i2, i3, pz40Var4, agk0Var, agk0Var2, a4xVar, t33Var4, t33Var9, t33Var6, t33Var7, eavVar2, vneVar, pz40VarF, pz40Var3, pz40Var, null);
                fetVar2 = fetVar;
                t33Var5 = t33Var9;
                t33Var = t33Var6;
                fetVar2.o0(objP);
            } else {
                t33 t33Var10 = t33Var5;
                pz40Var = pz40Var2;
                objP = new m9v(l7m0Var, snapshotStateList, i2, i3, pz40Var4, agk0Var, agk0Var2, a4xVar, t33Var4, t33Var10, t33Var6, t33Var7, eavVar2, vneVar, pz40VarF, pz40Var3, pz40Var, null);
                fetVar2 = fetVar;
                t33Var5 = t33Var10;
                t33Var = t33Var6;
                fetVar2.o0(objP);
            }
            m0x0.u(numValueOf, numValueOf2, value, (Function2) objP, fetVar2);
            t33Var2 = t33Var5;
            t33Var3 = t33Var4;
            C(i, (String) pz40Var.getValue(), t33Var3, t33Var2, t33Var, t33Var7, favVar, fetVar2, ((i7 >> 6) & 14) | 299520 | ((i7 >> 9) & 3670016));
            fetVar3 = fetVar2;
            Object[] objArr2 = {Boolean.valueOf(t33Var3.e()), Boolean.valueOf(t33Var2.e()), Boolean.valueOf(t33Var.e()), Boolean.valueOf(t33Var7.e())};
            boolean zI4 = fetVar3.i(t33Var3) | fetVar3.i(t33Var2) | fetVar3.i(t33Var) | fetVar3.i(t33Var7) | fetVar3.g(pz40VarF2);
            if (i9 != 32) {
                z3 = true;
            } else {
                z3 = true;
            }
            z2 = zI4 | z3;
            objP2 = fetVar3.P();
            if (z2) {
                n9v n9vVar2 = new n9v(t33Var3, t33Var2, t33Var, t33Var7, pz40VarF2, pz40Var3, pz40Var, eavVar2, null);
                fetVar3.o0(n9vVar2);
                objP2 = n9vVar2;
            } else {
                n9v n9vVar3 = new n9v(t33Var3, t33Var2, t33Var, t33Var7, pz40VarF2, pz40Var3, pz40Var, eavVar2, null);
                fetVar3.o0(n9vVar3);
                objP2 = n9vVar3;
            }
            m0x0.w(objArr2, (Function2) objP2, fetVar3);
        }
        yfe0 yfe0VarU2 = fetVar3.u();
        if (yfe0VarU2 != null) {
            final byte b2 = 1;
            yfe0VarU2.d = new Function2() { // from class: a.j9v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    byte b3 = b2;
                    int i10 = i4;
                    switch (b3) {
                        case 0:
                            ((Integer) obj4).getClass();
                            int iL = x8x.L(i10 | 1);
                            aac.a(pair, eavVar, i, a4xVar, i2, i3, function1, function2, l7m0Var, favVar, (fet) obj3, iL);
                            break;
                        default:
                            ((Integer) obj4).getClass();
                            int iL2 = x8x.L(i10 | 1);
                            aac.a(pair, eavVar, i, a4xVar, i2, i3, function1, function2, l7m0Var, favVar, (fet) obj3, iL2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void a0(List list, pz40 pz40Var, pz40 pz40Var2, pz40 pz40Var3, a4x a4xVar, t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, eav eavVar, enm enmVar, vne vneVar) {
        i4 i4VarE;
        Object next;
        Object next2;
        s9v s9vVar;
        lak0 lak0Var;
        if (((Boolean) pz40Var.getValue()).booleanValue() || list.isEmpty()) {
            return;
        }
        pz40Var.setValue(Boolean.TRUE);
        Pair pair = (Pair) list.remove(0);
        int iIntValue = ((Number) pair.f46059a).intValue();
        boolean zBooleanValue = ((Boolean) pair.b).booleanValue();
        float fFloatValue = ((Number) pz40Var2.getValue()).floatValue();
        float fFloatValue2 = ((Number) pz40Var3.getValue()).floatValue();
        if (iIntValue == 0) {
            lak0Var = lak0.c;
        } else {
            i4VarE = lak0.c;
            Iterator<E> it = a4xVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                s9v s9vVar2 = (s9v) next;
                if (s9vVar2.b == fFloatValue && s9vVar2.c == fFloatValue2) {
                    break;
                }
            }
            s9v s9vVar3 = (s9v) next;
            if (s9vVar3 != null) {
                int i = s9vVar3.f31866a;
                int i2 = iIntValue + i;
                if (i2 < 21) {
                    Iterator<E> it2 = a4xVar.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (((s9v) next2).f31866a != i2);
                    s9vVar = (s9v) next2;
                    if (s9vVar == null) {
                        lak0Var = lak0.c;
                    }
                    qjj.W(vneVar, null, null, new p9v(t33Var, t33Var2, t33Var3, t33Var4, i4VarE, pz40Var2, pz40Var3, pz40Var, list, a4xVar, eavVar, enmVar, vneVar, null), 3);
                }
                s9vVar = (s9v) CollectionsKt.d0(a4xVar);
                int i3 = s9vVar.f31866a;
                if (i <= i3) {
                    HashSet hashSet = new HashSet();
                    ArrayList<s9v> arrayList = new ArrayList();
                    for (Object obj : a4xVar) {
                        if (hashSet.add(Integer.valueOf(((s9v) obj).f31866a))) {
                            arrayList.add(obj);
                        }
                    }
                    for (s9v s9vVar4 : arrayList) {
                        int i4 = s9vVar4.f31866a;
                        if (i <= i4 && i3 >= i4) {
                            i4VarE = i4VarE.e(new q9v(s9vVar4, true, zBooleanValue, false));
                        }
                    }
                } else {
                    List listT0 = CollectionsKt.t0(a4xVar);
                    HashSet hashSet2 = new HashSet();
                    ArrayList<s9v> arrayList2 = new ArrayList();
                    for (Object obj2 : listT0) {
                        if (hashSet2.add(Integer.valueOf(((s9v) obj2).f31866a))) {
                            arrayList2.add(obj2);
                        }
                    }
                    for (s9v s9vVar5 : arrayList2) {
                        int i5 = s9vVar5.f31866a;
                        if (i3 <= i5 && i >= i5) {
                            i4VarE = i4VarE.e(new q9v(s9vVar5, false, zBooleanValue, true));
                        }
                    }
                }
                qjj.W(vneVar, null, null, new p9v(t33Var, t33Var2, t33Var3, t33Var4, i4VarE, pz40Var2, pz40Var3, pz40Var, list, a4xVar, eavVar, enmVar, vneVar, null), 3);
            }
            lak0Var = lak0.c;
        }
        i4VarE = lak0Var;
        qjj.W(vneVar, null, null, new p9v(t33Var, t33Var2, t33Var3, t33Var4, i4VarE, pz40Var2, pz40Var3, pz40Var, list, a4xVar, eavVar, enmVar, vneVar, null), 3);
    }

    public static final void b(String str, fet fetVar, int i) {
        String str2;
        fet fetVar2;
        fetVar.g0(380846438);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarE0 = o2e.e0(jm40.b, "CARD_BASKETBALL_CARD_DECK");
            zcl zclVar = qmk.f28987a;
            str2 = str;
            fetVar2 = fetVar;
            k7x.a(str2, null, R(o7k0.e(o7k0.s(mm40VarE0, 38.0f), 32.0f), StaticColors.INSTANCE.m75getBlack600d7_KjU(), 1.0f), null, null, fetVar2, (i2 & 14) | 48, 2040);
        } else {
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 16, i, str2);
        }
    }

    public static final lxl b0(cdq cdqVar, opn opnVar) {
        dyl aylVar;
        xxl xxlVar;
        cdqVar.getClass();
        String str = cdqVar.b;
        int i = cdqVar.f4173a;
        long j = i;
        int iOrdinal = opnVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                xxlVar = new xxl(str);
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                xxlVar = new xxl("");
            }
            aylVar = xxlVar;
        } else {
            StringBuilder sb = new StringBuilder(ujn.h);
            String strB = n2x.B(i);
            if (strB.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(strB, ujn.h, false) || kotlin.text.c.x(strB, "https://", false)) {
                sb.setLength(0);
                sb.append(strB);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(strB, '/'));
            }
            aylVar = new ayl(str, new n0x(sb.toString()), null, 28);
        }
        return new lxl(j, aylVar, false, uxl.f36445a, (cwl) null, 104);
    }

    public static final void c(final String str, final float f, final eba ebaVar, final eba ebaVar2, final float f2, final float f3, final boolean z, final boolean z2, fet fetVar, final int i) {
        fetVar.g0(824164711);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.d(f) ? 32 : 16) | (fetVar.i(ebaVar) ? 256 : 128) | (fetVar.i(ebaVar2) ? 2048 : 1024) | (fetVar.d(f2) ? 16384 : 8192) | (fetVar.d(f3) ? 131072 : 65536) | (fetVar.h(z) ? 1048576 : 524288) | (fetVar.h(z2) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 50.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
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
            Pair pair = z ? new Pair(Float.valueOf(90.0f), Float.valueOf(f2)) : new Pair(Float.valueOf(-90.0f), Float.valueOf(-f2));
            float fFloatValue = ((Number) pair.f46059a).floatValue();
            float fFloatValue2 = ((Number) pair.b).floatValue();
            int i3 = i2 >> 9;
            int i4 = 196616 | (i3 & 14);
            int i5 = i3 & 896;
            int i6 = (i2 << 9) & 7168;
            int i7 = (i2 >> 3) & 3670016;
            qna0.a(ebaVar2, fFloatValue2, f3, str, fFloatValue, false, z2, fetVar, i4 | i5 | i6 | i7);
            qxw.o(fetVar, o7k0.s(jm40Var, f));
            qna0.a(ebaVar, -fFloatValue2, f3, str, -fFloatValue, true, z2, fetVar, 196616 | ((i2 >> 6) & 14) | i5 | i6 | i7);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(str, f, ebaVar, ebaVar2, f2, f3, z, z2, i) { // from class: a.ybs

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f42353a;
                public final /* synthetic */ float b;
                public final /* synthetic */ eba c;
                public final /* synthetic */ eba d;
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ boolean h;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(4609);
                    aac.c(this.f42353a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final kbn c0(qkt qktVar, boolean z, String str) {
        qktVar.getClass();
        str.getClass();
        int i = qktVar.f28902a;
        String str2 = qktVar.b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        String str4 = qktVar.c;
        cm90 cm90Var = qktVar.h;
        String strConcat = qktVar.f;
        if (!kotlin.text.c.x(strConcat, "http://", false) && !kotlin.text.c.x(strConcat, "https://", false)) {
            if (!kotlin.text.c.x(strConcat, Separators.SLASH, false)) {
                strConcat = Separators.SLASH.concat(strConcat);
            }
            strConcat = str.concat(strConcat);
        }
        return new kbn(i, str3, strConcat, str4, cm90Var, z);
    }

    public static final void d(mm40 mm40Var, bac bacVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2;
        bacVar.getClass();
        fetVar.g0(-907087295);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(bacVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_arrow, 0, fetVar), null, mm40Var2, bacVar.f2250a, fetVar2, 56 | ((i2 << 6) & 896), 0);
        } else {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(mm40Var2, bacVar, i, (byte) 19);
        }
    }

    public static final fsr d0(l9s l9sVar, o3w0 o3w0Var, boolean z, List list) {
        boolean z2;
        l9sVar.getClass();
        o3w0Var.getClass();
        list.getClass();
        bfu0 bfu0Var = new bfu0(l9sVar.a(), l9sVar.c(), l9sVar.e(), l9sVar.Q(), l9sVar.n(), l9sVar.E(), l9sVar.d());
        boolean z3 = true;
        boolean z4 = !StringsKt.W(l9sVar.Q()) && z;
        List list2 = o3w0Var.f24606a;
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((n3w0) it.next()).f22869a));
        }
        if (l9sVar.n() > 0 && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
                if (((Number) it2.next()).longValue() == l9sVar.c()) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (list.isEmpty()) {
            z3 = false;
        } else {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                if (((Number) it3.next()).longValue() == l9sVar.c()) {
                }
            }
            z3 = false;
        }
        return new fsr(bfu0Var, z4, z2, z3);
    }

    public static final void e(amf amfVar, fet fetVar, int i) {
        int i2;
        boolean z;
        Object obj = amfVar;
        fetVar.g0(-402626516);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            byte b3 = 5;
            Object obj2 = ukd.f35823a;
            Object obj3 = objP;
            if (objP == obj2) {
                elf elfVar = new elf();
                int i3 = 3;
                gbn gbnVar = new gbn(new bqd((byte) 26), new pue(i3, (byte) 7), new vlf(b2), fpd.t);
                dp dpVar = elfVar.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new bqd((byte) 23), new pue(i3, b), new vzd((byte) 27), fpd.q));
                dpVar.b(new gbn(new bqd((byte) 24), new pue(i3, b3), new vzd((byte) 28), fpd.r));
                dpVar.b(new gbn(new bqd((byte) 25), new pue(i3, (byte) 6), new vzd((byte) 29), fpd.s));
                fetVar.o0(elfVar);
                obj3 = elfVar;
            }
            Object obj4 = (elf) obj3;
            boolean zG = fetVar.g(context);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj2) {
                z = false;
                objP2 = new LinearLayoutManager(context, 1, false);
                fetVar.o0(objP2);
            } else {
                z = false;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) objP2;
            boolean zG2 = fetVar.g(linearLayoutManager);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == obj2) {
                objP3 = new ilf(linearLayoutManager);
                fetVar.o0(objP3);
            }
            Object obj5 = (ilf) objP3;
            boolean zI = fetVar.i(obj4) | fetVar.i(obj5);
            Object objP4 = fetVar.P();
            if (zI || objP4 == obj2) {
                objP4 = new v4f(obj4, obj5, b3);
                fetVar.o0(objP4);
            }
            m0x0.n(obj4, obj5, (Function1) objP4, fetVar);
            Object objP5 = fetVar.P();
            if (objP5 == obj2) {
                objP5 = hlf.f13257a;
                fetVar.o0(objP5);
            }
            xdr xdrVar = (xdr) ((jhy) objP5);
            mm40 mm40VarE0 = o2e.e0(jm40.b, "CS2_GAME_PROGRESS");
            boolean zI2 = fetVar.i(obj4) | fetVar.i(linearLayoutManager);
            if ((i2 & 14) == 4) {
                z = true;
            }
            boolean zI3 = zI2 | z | fetVar.i(context);
            Object objP6 = fetVar.P();
            if (zI3 || objP6 == obj2) {
                Object dc0Var = new dc0(obj4, (Object) linearLayoutManager, obj, (Object) context, (byte) 21);
                fetVar.o0(dc0Var);
                objP6 = dc0Var;
            }
            y860.f(xdrVar, mm40VarE0, (Function1) objP6, fetVar, 54, 0);
        } else {
            obj = obj;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(obj, i, (byte) 20);
        }
    }

    public static final List e0(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.U(list));
        }
        return iun.f15405a;
    }

    public static final void f(mm40 mm40Var, dph dphVar, fet fetVar, int i) {
        int i2;
        dph dphVar2;
        fet fetVar2 = fetVar;
        dphVar.getClass();
        fetVar2.g0(134785129);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(dphVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarV = vic.v(mm40Var);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(o7k0.e(mm40VarV, 74.0f), 8.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            String str = dphVar.f6466a;
            long j = iph.f;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, x7zVar, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, 0, 24960, 110584);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            dphVar2 = dphVar;
            String str2 = dphVar2.b;
            long j2 = iph.g;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, x7zVar2, j2, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            vfc.i(dphVar2.c, 0, iph.k, fetVar2, o7k0.n(jm40.b, 32.0f));
            fetVar2.r(true);
        } else {
            dphVar2 = dphVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(mm40Var, dphVar2, i, (byte) 20);
        }
    }

    public static final Map f0(Map map) {
        int size = map.size();
        if (size == 0) {
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            return lunVar;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.T(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final void g(mm40 mm40Var, eql eqlVar, float f, Function2 function2, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        fetVar.g0(-1396475204);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(eqlVar) : fetVar.i(eqlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            lh80 lh80VarT = s5x0.t(f, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(eqlVar))) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new sw8((Object) eqlVar, (Object) function2, (Object) function0, (byte) 28);
                fetVar.o0(objP);
            }
            b8k0.f(mm40Var2, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, i2 & 14, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pt1(mm40Var, eqlVar, f, function2, function0, i, (byte) 4);
        }
    }

    public static final long g0(w4t w4tVar) {
        if (w4tVar instanceof j4t) {
            return nw80.f24223a.getId();
        }
        if (w4tVar instanceof k4t) {
            return nw80.f24223a.getId();
        }
        if (w4tVar instanceof m4t) {
            return nw80.b.getId();
        }
        if (w4tVar instanceof n4t) {
            return nw80.b.getId();
        }
        if (w4tVar instanceof q4t) {
            return ((q4t) w4tVar).f28117a;
        }
        return 0L;
    }

    public static final void h(mm40 mm40Var, float f, fet fetVar, int i) {
        float f2;
        fetVar.g0(-300850463);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            f2 = f;
            mm40 mm40VarN = s5x0.N(o7k0.z(mm40Var, gqw0.m, true), f2, 0.0f, 0.0f, 0.0f, 14);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            fetVar.e0(447866222);
            for (int i3 = 0; i3 < 3; i3++) {
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(o7k0.s(jm40.b, 256.0f), 186.0f);
                zcl zclVar3 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                qxw.o(fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE), fqj0VarD0));
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            f2 = f;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dql(mm40Var, f2, i, b);
        }
    }

    public static final fza0 h0(w4t w4tVar) {
        if (w4tVar instanceof j4t) {
            return fza0.b;
        }
        if (w4tVar instanceof k4t) {
            return fza0.e;
        }
        if (w4tVar instanceof m4t) {
            return fza0.f;
        }
        return w4tVar instanceof n4t ? fza0.d : fza0.c;
    }

    public static final void i(mm40 mm40Var, m4i m4iVar, Function1 function1, fet fetVar, int i, int i2) {
        m4iVar.getClass();
        function1.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        mm40 mm40Var2 = mm40Var;
        if (m4iVar instanceof i4i) {
            fetVar.e0(59483150);
            i4i i4iVar = (i4i) m4iVar;
            d5c.c(mm40Var2, i4iVar.b, i4iVar.d, i4iVar.e, i4iVar.f, function1, fetVar, (i << 9) & 458752);
            fetVar.r(false);
            return;
        }
        if (m4iVar instanceof j4i) {
            fetVar.e0(59494921);
            j4i j4iVar = (j4i) m4iVar;
            sac.c(mm40Var2, j4iVar.f15885a, j4iVar.d, j4iVar.e, j4iVar.f, function1, fetVar, (i << 9) & 458752);
            fetVar.r(false);
            return;
        }
        if (m4iVar instanceof k4i) {
            fetVar.e0(59506590);
            k4i k4iVar = (k4i) m4iVar;
            ebc.m(mm40Var2, k4iVar.f17670a, k4iVar.c, k4iVar.d, k4iVar.e, k4iVar.f, function1, fetVar, (i << 12) & 3670016);
            fetVar.r(false);
            return;
        }
        if (!(m4iVar instanceof l4i)) {
            throw b1j.f(59482460, fetVar, false);
        }
        fetVar.e0(59519995);
        l4i l4iVar = (l4i) m4iVar;
        fbc.l(mm40Var2, l4iVar.f19406a, l4iVar.b, l4iVar.c, l4iVar.d, l4iVar.e, l4iVar.f, l4iVar.g, function1, fetVar, (i << 18) & 234881024);
        fetVar.r(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a.jkd, a.tae0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList i0(p9k0 p9k0Var, int i, Integer num) {
        ?? tae0Var = new tae0(p9k0Var);
        i = p9k0Var.q(i);
        bet betVarA = p9k0Var.a(i);
        while (i >= 0) {
            tae0Var.h(p9k0Var.i(i), p9k0Var.k(i) ? p9k0Var.p(p9k0Var.b, i) : ukd.f35823a, p9k0Var.f26610a.k(i), num);
            if (i >= 0) {
                bet betVar = betVarA;
                betVarA = p9k0Var.a(i);
                i = p9k0Var.q(i);
                num = betVar;
            } else {
                num = betVarA;
            }
        }
        return tae0Var.f16663a;
    }

    public static final void j(pm80 pm80Var, boolean z, sfh0 sfh0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        Function0 function1;
        fetVar.g0(-1892293586);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(pm80Var) : fetVar.i(pm80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(sfh0Var) : fetVar.i(sfh0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function1 = function0;
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        } else {
            function1 = function0;
        }
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (z) {
            fetVar.e0(-1872290892);
            zcl zclVar = qmk.f28987a;
            dww.c(pm80Var, null, o2e.e0(y860.W(s5x0.L(jm40.b, 8.0f, 0.0f, 2), null, null, false, null, function1, 28), "DELETE_ICON"), sfh0Var.e(fetVar), fetVar, 56 | (i2 & 14), 0);
            fetVar.r(false);
        } else {
            fetVar.e0(-1871885164);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1((byte) 17, i, (Object) pm80Var, (Object) sfh0Var, (Object) function0, z);
        }
    }

    public static final void j0(int i, int i2) {
        if (!(i > 0 && i2 > 0)) {
            adx.a("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        adx.a("minLines " + i + " must be less than or equal to maxLines " + i2);
    }

    public static final void k(mm40 mm40Var, ork orkVar, qdz qdzVar, Function0 function0, Function2 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        orkVar.getClass();
        String str = orkVar.f25737a;
        qdzVar.getClass();
        function0.getClass();
        function2.getClass();
        fetVar2.g0(1166464621);
        int i2 = i | 6 | (fetVar2.g(orkVar) ? 32 : 16) | (fetVar2.g(qdzVar) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024) | (fetVar2.i(function2) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar2.b0(-13953595, str);
            xcz xczVarB = qdzVar.b(str, new svj((byte) 18), fetVar2, i2 & 896);
            fetVar2.r(false);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.l;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(h97.e(zclVar, zclVar, zclVar, zclVar, i120.Q(jm40Var, backgroundContent, ugg0Var2)), 0.0f, 8.0f, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarE = o7k0.e(jm40Var, 40.0f);
            b8m b8mVar = orkVar.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            r7m r7mVar = new r7m(textPrimary, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary());
            boolean z = (i2 & 7168) == 2048;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new b1i(function0, (byte) 14);
                fetVar2.o0(objP);
            }
            wwb.j(mm40VarE, b8mVar, 16.0f, r7mVar, (Function0) objP, fetVar2, 0, 16);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            long secondary10 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary10();
            j9m j9mVar = orkVar.c;
            boolean z2 = (i2 & 57344) == 16384;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new nrk(function2, (byte) 0);
                fetVar2.o0(objP2);
            }
            d5c.k(mm40VarN, j9mVar, xczVarB, secondary10, (Function1) objP2, fetVar2, 0, 0);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var2, (p6t0) orkVar, qdzVar, function0, (wdr) function2, i, (byte) 2);
        }
    }

    public static final void l(mm40 mm40Var, gql gqlVar, float f, Function2 function2, Function0 function0, fet fetVar, int i) {
        int i2;
        float f2;
        fetVar.g0(2018061137);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(gqlVar) : fetVar.i(gqlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                f = xfn.a(fetVar).c;
            } else {
                fetVar.X();
            }
            int i3 = i2 & (-897);
            float f3 = f;
            fetVar.s();
            if (gqlVar instanceof eql) {
                fetVar.e0(-1968451799);
                g(mm40Var, (eql) gqlVar, f3, function2, function0, fetVar, i3 & 65534);
                fetVar.r(false);
            } else {
                if (!gqlVar.equals(fql.f9980a)) {
                    throw b1j.f(-1968454252, fetVar, false);
                }
                fetVar.e0(-1968441827);
                h(mm40Var, f3, fetVar, i3 & 14);
                fetVar.r(false);
            }
            f2 = f3;
        } else {
            fetVar.X();
            f2 = f;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pt1(mm40Var, gqlVar, f2, function2, function0, i, (byte) 3);
        }
    }

    public static final void m(int i, fet fetVar) {
        fetVar.g0(-1374611232);
        if (fetVar.U(i & 1, i != 0)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 64.0f), 80.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, 0.0f, 13), 48.0f), 12.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f4m(i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0123  */
    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:104:0x012e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0137  */
    /* JADX WARN: Code duplicated, block: B:108:0x0139  */
    /* JADX WARN: Code duplicated, block: B:110:0x013d  */
    /* JADX WARN: Code duplicated, block: B:111:0x013f  */
    /* JADX WARN: Code duplicated, block: B:114:0x014f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0169  */
    /* JADX WARN: Code duplicated, block: B:120:0x017e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0181  */
    /* JADX WARN: Code duplicated, block: B:124:0x0191 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x0197  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:133:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:137:0x0200  */
    /* JADX WARN: Code duplicated, block: B:140:0x023e  */
    /* JADX WARN: Code duplicated, block: B:143:0x0248  */
    /* JADX WARN: Code duplicated, block: B:144:0x024b  */
    /* JADX WARN: Code duplicated, block: B:147:0x0255  */
    /* JADX WARN: Code duplicated, block: B:148:0x0258  */
    /* JADX WARN: Code duplicated, block: B:151:0x0261  */
    /* JADX WARN: Code duplicated, block: B:154:0x0266  */
    /* JADX WARN: Code duplicated, block: B:155:0x0269  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:163:0x02b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:166:0x02be  */
    /* JADX WARN: Code duplicated, block: B:169:0x02de  */
    /* JADX WARN: Code duplicated, block: B:172:0x02e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:177:0x0347  */
    /* JADX WARN: Code duplicated, block: B:180:0x035b  */
    /* JADX WARN: Code duplicated, block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:87:0x0100  */
    /* JADX WARN: Code duplicated, block: B:90:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x0117  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    /* JADX WARN: Code duplicated, block: B:98:0x011f  */
    public static final void n(mm40 mm40Var, boolean z, String str, sfh0 sfh0Var, String str2, gy40 gy40Var, Function1 function1, Function1 function2, Function0 function0, fet fetVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        String str3;
        int i5;
        int i6;
        boolean zI;
        int i7;
        int i8;
        String str4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        sfh0 sfh0Var2;
        gy40 gy40Var2;
        Function1 function3;
        Function0 function4;
        boolean z4;
        String str5;
        String str6;
        yfe0 yfe0VarU;
        boolean z5;
        String str7;
        sfh0 sfh0Var3;
        String str8;
        Object objP;
        cl5 cl5Var;
        Function1 function5;
        Function0 function6;
        String string;
        Object objP2;
        cqq cqqVar;
        wpq wpqVar;
        Object objP3;
        int i16;
        boolean z6;
        boolean zI2;
        Object objP4;
        Object objP5;
        Object obj;
        boolean zEquals;
        Object objP6;
        pz40 pz40Var;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objP7;
        Object obj2;
        Function1 function7;
        boolean z10;
        Object objP8;
        Function0 function8;
        boolean z11;
        Object objP9;
        Function1 function9;
        int i17;
        function1.getClass();
        fetVar.g0(-170846344);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i18 = i2 & 2;
        if (i18 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= fetVar.h(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    str3 = str;
                    if (fetVar.g(str3)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    if ((i & 4096) == 0) {
                        zI = fetVar.g(sfh0Var);
                    } else {
                        zI = fetVar.i(sfh0Var);
                    }
                    if (zI) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        str4 = str2;
                        if (fetVar.g(str4)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    i10 = i3 | 196608;
                    if ((i & 1572864) == 0) {
                        if (fetVar.i(function1)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i10 |= i17;
                    }
                    i11 = i2 & 128;
                    if (i11 != 0) {
                        i10 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (fetVar.i(function2)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i10 |= i12;
                    }
                    i13 = i2 & 256;
                    if (i13 != 0) {
                        i10 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (fetVar.i(function0)) {
                            i14 = 67108864;
                        } else {
                            i14 = 33554432;
                        }
                        i10 |= i14;
                    }
                    i15 = i10;
                    if ((i15 & 38347923) != 38347922) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (fetVar.U(i15 & 1, z3)) {
                        if (i18 != 0) {
                            z5 = false;
                        } else {
                            z5 = z2;
                        }
                        if (i4 != 0) {
                            str7 = "";
                        } else {
                            str7 = str3;
                        }
                        if (i6 != 0) {
                            sfh0Var3 = qfh0.f28634a;
                        } else {
                            sfh0Var3 = sfh0Var;
                        }
                        if (i8 != 0) {
                            str8 = null;
                        } else {
                            str8 = str4;
                        }
                        objP = fetVar.P();
                        cl5Var = ukd.f35823a;
                        if (objP == cl5Var) {
                            objP = dw9.j(fetVar);
                        }
                        gy40 gy40Var3 = (gy40) objP;
                        if (i11 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function0;
                        }
                        string = StringsKt.x0(str7).toString();
                        objP2 = fetVar.P();
                        if (objP2 == cl5Var) {
                            objP2 = new cqq();
                            fetVar.o0(objP2);
                        }
                        cqqVar = (cqq) objP2;
                        wpqVar = (wpq) fetVar.k(bmd.i);
                        objP3 = fetVar.P();
                        if (objP3 == cl5Var) {
                            objP3 = androidx.compose.runtime.e.e(null);
                            fetVar.o0(objP3);
                        }
                        pz40 pz40Var2 = (pz40) objP3;
                        String str9 = str8;
                        Boolean boolValueOf = Boolean.valueOf(z5);
                        i16 = i15 & 112;
                        if (i16 == 32) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        zI2 = z6 | fetVar.i(wpqVar);
                        objP4 = fetVar.P();
                        if (zI2 || objP4 == cl5Var) {
                            objP4 = new j0l(z5, cqqVar, wpqVar, (yje) null);
                            fetVar.o0(objP4);
                        }
                        m0x0.t(fetVar, boolValueOf, (Function2) objP4);
                        objP5 = fetVar.P();
                        obj = objP5;
                        if (objP5 == cl5Var) {
                            string.getClass();
                            ba3 ba3Var = new ba3();
                            ba3Var.f2238a = string;
                            fetVar.o0(ba3Var);
                            obj = ba3Var;
                        }
                        ba3 ba3Var2 = (ba3) obj;
                        zEquals = ba3Var2.f2238a.equals(string);
                        string.getClass();
                        ba3Var2.f2238a = string;
                        objP6 = fetVar.P();
                        if (objP6 == cl5Var) {
                            int length = string.length();
                            long jE = s7n0.e(length, length);
                            int length2 = string.length();
                            objP6 = androidx.compose.runtime.e.e(new a8q0(string, jE, new o9q0(s7n0.e(length2, length2))));
                            fetVar.o0(objP6);
                        }
                        pz40Var = (pz40) objP6;
                        if (zEquals && !string.equals(((a8q0) pz40Var.getValue()).f440a.b)) {
                            a8q0 a8q0Var = (a8q0) pz40Var.getValue();
                            int length3 = string.length();
                            long jE2 = s7n0.e(length3, length3);
                            int length4 = string.length();
                            o9q0 o9q0Var = new o9q0(s7n0.e(length4, length4));
                            a8q0Var.getClass();
                            pz40Var.setValue(new a8q0(new j83(string), jE2, o9q0Var));
                        }
                        mm40 mm40VarB0 = y860.b0(mm40Var, cqqVar);
                        if (i16 == 32) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if ((i15 & 29360128) == 8388608) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = z7 | z8;
                        objP7 = fetVar.P();
                        if (z9) {
                            obj2 = cl5Var;
                        } else {
                            obj2 = cl5Var;
                            if (objP7 == obj2) {
                                function7 = function5;
                            }
                            mm40 mm40VarE0 = o2e.e0(j120.b0(mm40VarB0, (Function1) objP7), "BASIC_TEXT_FIELD");
                            a8q0 a8q0Var2 = (a8q0) pz40Var.getValue();
                            y9q0 y9q0VarF = sfh0Var3.f(fetVar);
                            skk0 skk0Var = new skk0(sfh0Var3.b(fetVar));
                            uly ulyVar = new uly(0, null, 0, 3, 119);
                            if ((i15 & 234881024) == 67108864) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            objP8 = fetVar.P();
                            if (!z10 || objP8 == obj2) {
                                function8 = function6;
                                objP8 = new cjl(function8, (byte) 17);
                                fetVar.o0(objP8);
                            } else {
                                function8 = function6;
                            }
                            kly klyVar = new kly(null, null, (Function1) objP8, 47);
                            z11 = (i15 & 3670016) == 1048576;
                            objP9 = fetVar.P();
                            if (!z11 || objP9 == obj2) {
                                function9 = function1;
                                objP9 = new xpm(pz40Var, function9);
                                fetVar.o0(objP9);
                            } else {
                                function9 = function1;
                            }
                            z96.a(a8q0Var2, (Function1) ((jhy) objP9), mm40VarE0, false, false, y9q0VarF, ulyVar, klyVar, true, 0, 0, null, null, gy40Var3, skk0Var, u1c.M(-18527333, new hgs0(pz40Var, sfh0Var3, str9, function9, cqqVar), fetVar), fetVar, 102236160, ((i15 >> 6) & 7168) | 196608, 7704);
                            z4 = z5;
                            gy40Var2 = gy40Var3;
                            function3 = function7;
                            sfh0Var2 = sfh0Var3;
                            str6 = str9;
                            str5 = str7;
                            function4 = function8;
                        }
                        function7 = function5;
                        objP7 = new ka2(pz40Var2, z5, function7, (byte) 3);
                        fetVar.o0(objP7);
                        mm40 mm40VarE1 = o2e.e0(j120.b0(mm40VarB0, (Function1) objP7), "BASIC_TEXT_FIELD");
                        a8q0 a8q0Var3 = (a8q0) pz40Var.getValue();
                        y9q0 y9q0VarF2 = sfh0Var3.f(fetVar);
                        skk0 skk0Var2 = new skk0(sfh0Var3.b(fetVar));
                        uly ulyVar2 = new uly(0, null, 0, 3, 119);
                        if ((i15 & 234881024) == 67108864) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objP8 = fetVar.P();
                        if (z10) {
                            function8 = function6;
                            objP8 = new cjl(function8, (byte) 17);
                            fetVar.o0(objP8);
                        } else {
                            function8 = function6;
                            objP8 = new cjl(function8, (byte) 17);
                            fetVar.o0(objP8);
                        }
                        kly klyVar2 = new kly(null, null, (Function1) objP8, 47);
                        if ((i15 & 3670016) == 1048576) {
                        }
                        objP9 = fetVar.P();
                        if (z11) {
                            function9 = function1;
                            objP9 = new xpm(pz40Var, function9);
                            fetVar.o0(objP9);
                        } else {
                            function9 = function1;
                            objP9 = new xpm(pz40Var, function9);
                            fetVar.o0(objP9);
                        }
                        z96.a(a8q0Var3, (Function1) ((jhy) objP9), mm40VarE1, false, false, y9q0VarF2, ulyVar2, klyVar2, true, 0, 0, null, null, gy40Var3, skk0Var2, u1c.M(-18527333, new hgs0(pz40Var, sfh0Var3, str9, function9, cqqVar), fetVar), fetVar, 102236160, ((i15 >> 6) & 7168) | 196608, 7704);
                        z4 = z5;
                        gy40Var2 = gy40Var3;
                        function3 = function7;
                        sfh0Var2 = sfh0Var3;
                        str6 = str9;
                        str5 = str7;
                        function4 = function8;
                    } else {
                        fetVar.X();
                        sfh0Var2 = sfh0Var;
                        gy40Var2 = gy40Var;
                        function3 = function2;
                        function4 = function0;
                        z4 = z2;
                        str5 = str3;
                        str6 = str4;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new wpm(mm40Var, z4, str5, sfh0Var2, str6, gy40Var2, function1, function3, function4, i, i2);
                    }
                }
                i3 |= 24576;
                str4 = str2;
                i10 = i3 | 196608;
                if ((i & 1572864) == 0) {
                    if (fetVar.i(function1)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i10 |= i17;
                }
                i11 = i2 & 128;
                if (i11 != 0) {
                    i10 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (fetVar.i(function2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i10 |= i12;
                }
                i13 = i2 & 256;
                if (i13 != 0) {
                    i10 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (fetVar.i(function0)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i10 |= i14;
                }
                i15 = i10;
                if ((i15 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i15 & 1, z3)) {
                    if (i18 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i4 != 0) {
                        str7 = "";
                    } else {
                        str7 = str3;
                    }
                    if (i6 != 0) {
                        sfh0Var3 = qfh0.f28634a;
                    } else {
                        sfh0Var3 = sfh0Var;
                    }
                    if (i8 != 0) {
                        str8 = null;
                    } else {
                        str8 = str4;
                    }
                    objP = fetVar.P();
                    cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = dw9.j(fetVar);
                    }
                    gy40 gy40Var4 = (gy40) objP;
                    if (i11 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function0;
                    }
                    string = StringsKt.x0(str7).toString();
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = new cqq();
                        fetVar.o0(objP2);
                    }
                    cqqVar = (cqq) objP2;
                    wpqVar = (wpq) fetVar.k(bmd.i);
                    objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = androidx.compose.runtime.e.e(null);
                        fetVar.o0(objP3);
                    }
                    pz40 pz40Var3 = (pz40) objP3;
                    String str10 = str8;
                    Boolean boolValueOf2 = Boolean.valueOf(z5);
                    i16 = i15 & 112;
                    if (i16 == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zI2 = z6 | fetVar.i(wpqVar);
                    objP4 = fetVar.P();
                    if (zI2) {
                        objP4 = new j0l(z5, cqqVar, wpqVar, (yje) null);
                        fetVar.o0(objP4);
                    } else {
                        objP4 = new j0l(z5, cqqVar, wpqVar, (yje) null);
                        fetVar.o0(objP4);
                    }
                    m0x0.t(fetVar, boolValueOf2, (Function2) objP4);
                    objP5 = fetVar.P();
                    obj = objP5;
                    if (objP5 == cl5Var) {
                        string.getClass();
                        ba3 ba3Var3 = new ba3();
                        ba3Var3.f2238a = string;
                        fetVar.o0(ba3Var3);
                        obj = ba3Var3;
                    }
                    ba3 ba3Var4 = (ba3) obj;
                    zEquals = ba3Var4.f2238a.equals(string);
                    string.getClass();
                    ba3Var4.f2238a = string;
                    objP6 = fetVar.P();
                    if (objP6 == cl5Var) {
                        int length5 = string.length();
                        long jE3 = s7n0.e(length5, length5);
                        int length6 = string.length();
                        objP6 = androidx.compose.runtime.e.e(new a8q0(string, jE3, new o9q0(s7n0.e(length6, length6))));
                        fetVar.o0(objP6);
                    }
                    pz40Var = (pz40) objP6;
                    if (zEquals) {
                    }
                    mm40 mm40VarB1 = y860.b0(mm40Var, cqqVar);
                    if (i16 == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if ((i15 & 29360128) == 8388608) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z7 | z8;
                    objP7 = fetVar.P();
                    if (z9) {
                        obj2 = cl5Var;
                        if (objP7 == obj2) {
                            function7 = function5;
                        }
                        mm40 mm40VarE2 = o2e.e0(j120.b0(mm40VarB1, (Function1) objP7), "BASIC_TEXT_FIELD");
                        a8q0 a8q0Var4 = (a8q0) pz40Var.getValue();
                        y9q0 y9q0VarF3 = sfh0Var3.f(fetVar);
                        skk0 skk0Var3 = new skk0(sfh0Var3.b(fetVar));
                        uly ulyVar3 = new uly(0, null, 0, 3, 119);
                        if ((i15 & 234881024) == 67108864) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objP8 = fetVar.P();
                        if (z10) {
                            function8 = function6;
                            objP8 = new cjl(function8, (byte) 17);
                            fetVar.o0(objP8);
                        } else {
                            function8 = function6;
                            objP8 = new cjl(function8, (byte) 17);
                            fetVar.o0(objP8);
                        }
                        kly klyVar3 = new kly(null, null, (Function1) objP8, 47);
                        if ((i15 & 3670016) == 1048576) {
                        }
                        objP9 = fetVar.P();
                        if (z11) {
                            function9 = function1;
                            objP9 = new xpm(pz40Var, function9);
                            fetVar.o0(objP9);
                        } else {
                            function9 = function1;
                            objP9 = new xpm(pz40Var, function9);
                            fetVar.o0(objP9);
                        }
                        z96.a(a8q0Var4, (Function1) ((jhy) objP9), mm40VarE2, false, false, y9q0VarF3, ulyVar3, klyVar3, true, 0, 0, null, null, gy40Var4, skk0Var3, u1c.M(-18527333, new hgs0(pz40Var, sfh0Var3, str10, function9, cqqVar), fetVar), fetVar, 102236160, ((i15 >> 6) & 7168) | 196608, 7704);
                        z4 = z5;
                        gy40Var2 = gy40Var4;
                        function3 = function7;
                        sfh0Var2 = sfh0Var3;
                        str6 = str10;
                        str5 = str7;
                        function4 = function8;
                    } else {
                        obj2 = cl5Var;
                    }
                    function7 = function5;
                    objP7 = new ka2(pz40Var3, z5, function7, (byte) 3);
                    fetVar.o0(objP7);
                    mm40 mm40VarE3 = o2e.e0(j120.b0(mm40VarB1, (Function1) objP7), "BASIC_TEXT_FIELD");
                    a8q0 a8q0Var5 = (a8q0) pz40Var.getValue();
                    y9q0 y9q0VarF4 = sfh0Var3.f(fetVar);
                    skk0 skk0Var4 = new skk0(sfh0Var3.b(fetVar));
                    uly ulyVar4 = new uly(0, null, 0, 3, 119);
                    if ((i15 & 234881024) == 67108864) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objP8 = fetVar.P();
                    if (z10) {
                        function8 = function6;
                        objP8 = new cjl(function8, (byte) 17);
                        fetVar.o0(objP8);
                    } else {
                        function8 = function6;
                        objP8 = new cjl(function8, (byte) 17);
                        fetVar.o0(objP8);
                    }
                    kly klyVar4 = new kly(null, null, (Function1) objP8, 47);
                    if ((i15 & 3670016) == 1048576) {
                    }
                    objP9 = fetVar.P();
                    if (z11) {
                        function9 = function1;
                        objP9 = new xpm(pz40Var, function9);
                        fetVar.o0(objP9);
                    } else {
                        function9 = function1;
                        objP9 = new xpm(pz40Var, function9);
                        fetVar.o0(objP9);
                    }
                    z96.a(a8q0Var5, (Function1) ((jhy) objP9), mm40VarE3, false, false, y9q0VarF4, ulyVar4, klyVar4, true, 0, 0, null, null, gy40Var4, skk0Var4, u1c.M(-18527333, new hgs0(pz40Var, sfh0Var3, str10, function9, cqqVar), fetVar), fetVar, 102236160, ((i15 >> 6) & 7168) | 196608, 7704);
                    z4 = z5;
                    gy40Var2 = gy40Var4;
                    function3 = function7;
                    sfh0Var2 = sfh0Var3;
                    str6 = str10;
                    str5 = str7;
                    function4 = function8;
                } else {
                    fetVar.X();
                    sfh0Var2 = sfh0Var;
                    gy40Var2 = gy40Var;
                    function3 = function2;
                    function4 = function0;
                    z4 = z2;
                    str5 = str3;
                    str6 = str4;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new wpm(mm40Var, z4, str5, sfh0Var2, str6, gy40Var2, function1, function3, function4, i, i2);
                }
            }
            i3 |= 384;
            str3 = str;
            i6 = i2 & 8;
            if (i6 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if ((i & 4096) == 0) {
                    zI = fetVar.g(sfh0Var);
                } else {
                    zI = fetVar.i(sfh0Var);
                }
                if (zI) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    str4 = str2;
                    if (fetVar.g(str4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i3 | 196608;
                if ((i & 1572864) == 0) {
                    if (fetVar.i(function1)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i10 |= i17;
                }
                i11 = i2 & 128;
                if (i11 != 0) {
                    i10 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (fetVar.i(function2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i10 |= i12;
                }
                i13 = i2 & 256;
                if (i13 != 0) {
                    i10 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (fetVar.i(function0)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i10 |= i14;
                }
                i15 = i10;
                if ((i15 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i15 & 1, z3)) {
                    if (i18 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i4 != 0) {
                        str7 = "";
                    } else {
                        str7 = str3;
                    }
                    if (i6 != 0) {
                        sfh0Var3 = qfh0.f28634a;
                    } else {
                        sfh0Var3 = sfh0Var;
                    }
                    if (i8 != 0) {
                        str8 = null;
                    } else {
                        str8 = str4;
                    }
                    objP = fetVar.P();
                    cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = dw9.j(fetVar);
                    }
                    gy40 gy40Var5 = (gy40) objP;
                    if (i11 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function0;
                    }
                    string = StringsKt.x0(str7).toString();
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = new cqq();
                        fetVar.o0(objP2);
                    }
                    cqqVar = (cqq) objP2;
                    wpqVar = (wpq) fetVar.k(bmd.i);
                    objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = androidx.compose.runtime.e.e(null);
                        fetVar.o0(objP3);
                    }
                    pz40 pz40Var4 = (pz40) objP3;
                    String str11 = str8;
                    Boolean boolValueOf3 = Boolean.valueOf(z5);
                    i16 = i15 & 112;
                    if (i16 == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zI2 = z6 | fetVar.i(wpqVar);
                    objP4 = fetVar.P();
                    if (zI2) {
                        objP4 = new j0l(z5, cqqVar, wpqVar, (yje) null);
                        fetVar.o0(objP4);
                    } else {
                        objP4 = new j0l(z5, cqqVar, wpqVar, (yje) null);
                        fetVar.o0(objP4);
                    }
                    m0x0.t(fetVar, boolValueOf3, (Function2) objP4);
                    objP5 = fetVar.P();
                    obj = objP5;
                    if (objP5 == cl5Var) {
                        string.getClass();
                        ba3 ba3Var5 = new ba3();
                        ba3Var5.f2238a = string;
                        fetVar.o0(ba3Var5);
                        obj = ba3Var5;
                    }
                    ba3 ba3Var6 = (ba3) obj;
                    zEquals = ba3Var6.f2238a.equals(string);
                    string.getClass();
                    ba3Var6.f2238a = string;
                    objP6 = fetVar.P();
                    if (objP6 == cl5Var) {
                        int length7 = string.length();
                        long jE4 = s7n0.e(length7, length7);
                        int length8 = string.length();
                        objP6 = androidx.compose.runtime.e.e(new a8q0(string, jE4, new o9q0(s7n0.e(length8, length8))));
                        fetVar.o0(objP6);
                    }
                    pz40Var = (pz40) objP6;
                    if (zEquals) {
                    }
                    mm40 mm40VarB2 = y860.b0(mm40Var, cqqVar);
                    if (i16 == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if ((i15 & 29360128) == 8388608) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z7 | z8;
                    objP7 = fetVar.P();
                    if (z9) {
                        obj2 = cl5Var;
                        if (objP7 == obj2) {
                            function7 = function5;
                        }
                        mm40 mm40VarE4 = o2e.e0(j120.b0(mm40VarB2, (Function1) objP7), "BASIC_TEXT_FIELD");
                        a8q0 a8q0Var6 = (a8q0) pz40Var.getValue();
                        y9q0 y9q0VarF5 = sfh0Var3.f(fetVar);
                        skk0 skk0Var5 = new skk0(sfh0Var3.b(fetVar));
                        uly ulyVar5 = new uly(0, null, 0, 3, 119);
                        if ((i15 & 234881024) == 67108864) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objP8 = fetVar.P();
                        if (z10) {
                            function8 = function6;
                            objP8 = new cjl(function8, (byte) 17);
                            fetVar.o0(objP8);
                        } else {
                            function8 = function6;
                            objP8 = new cjl(function8, (byte) 17);
                            fetVar.o0(objP8);
                        }
                        kly klyVar5 = new kly(null, null, (Function1) objP8, 47);
                        if ((i15 & 3670016) == 1048576) {
                        }
                        objP9 = fetVar.P();
                        if (z11) {
                            function9 = function1;
                            objP9 = new xpm(pz40Var, function9);
                            fetVar.o0(objP9);
                        } else {
                            function9 = function1;
                            objP9 = new xpm(pz40Var, function9);
                            fetVar.o0(objP9);
                        }
                        z96.a(a8q0Var6, (Function1) ((jhy) objP9), mm40VarE4, false, false, y9q0VarF5, ulyVar5, klyVar5, true, 0, 0, null, null, gy40Var5, skk0Var5, u1c.M(-18527333, new hgs0(pz40Var, sfh0Var3, str11, function9, cqqVar), fetVar), fetVar, 102236160, ((i15 >> 6) & 7168) | 196608, 7704);
                        z4 = z5;
                        gy40Var2 = gy40Var5;
                        function3 = function7;
                        sfh0Var2 = sfh0Var3;
                        str6 = str11;
                        str5 = str7;
                        function4 = function8;
                    } else {
                        obj2 = cl5Var;
                    }
                    function7 = function5;
                    objP7 = new ka2(pz40Var4, z5, function7, (byte) 3);
                    fetVar.o0(objP7);
                    mm40 mm40VarE5 = o2e.e0(j120.b0(mm40VarB2, (Function1) objP7), "BASIC_TEXT_FIELD");
                    a8q0 a8q0Var7 = (a8q0) pz40Var.getValue();
                    y9q0 y9q0VarF6 = sfh0Var3.f(fetVar);
                    skk0 skk0Var6 = new skk0(sfh0Var3.b(fetVar));
                    uly ulyVar6 = new uly(0, null, 0, 3, 119);
                    if ((i15 & 234881024) == 67108864) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objP8 = fetVar.P();
                    if (z10) {
                        function8 = function6;
                        objP8 = new cjl(function8, (byte) 17);
                        fetVar.o0(objP8);
                    } else {
                        function8 = function6;
                        objP8 = new cjl(function8, (byte) 17);
                        fetVar.o0(objP8);
                    }
                    kly klyVar6 = new kly(null, null, (Function1) objP8, 47);
                    if ((i15 & 3670016) == 1048576) {
                    }
                    objP9 = fetVar.P();
                    if (z11) {
                        function9 = function1;
                        objP9 = new xpm(pz40Var, function9);
                        fetVar.o0(objP9);
                    } else {
                        function9 = function1;
                        objP9 = new xpm(pz40Var, function9);
                        fetVar.o0(objP9);
                    }
                    z96.a(a8q0Var7, (Function1) ((jhy) objP9), mm40VarE5, false, false, y9q0VarF6, ulyVar6, klyVar6, true, 0, 0, null, null, gy40Var5, skk0Var6, u1c.M(-18527333, new hgs0(pz40Var, sfh0Var3, str11, function9, cqqVar), fetVar), fetVar, 102236160, ((i15 >> 6) & 7168) | 196608, 7704);
                    z4 = z5;
                    gy40Var2 = gy40Var5;
                    function3 = function7;
                    sfh0Var2 = sfh0Var3;
                    str6 = str11;
                    str5 = str7;
                    function4 = function8;
                } else {
                    fetVar.X();
                    sfh0Var2 = sfh0Var;
                    gy40Var2 = gy40Var;
                    function3 = function2;
                    function4 = function0;
                    z4 = z2;
                    str5 = str3;
                    str6 = str4;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new wpm(mm40Var, z4, str5, sfh0Var2, str6, gy40Var2, function1, function3, function4, i, i2);
                }
            }
            i3 |= 24576;
            str4 = str2;
            i10 = i3 | 196608;
            if ((i & 1572864) == 0) {
                if (fetVar.i(function1)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i10 |= i17;
            }
            i11 = i2 & 128;
            if (i11 != 0) {
                i10 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (fetVar.i(function2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i10 |= i12;
            }
            i13 = i2 & 256;
            if (i13 != 0) {
                i10 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (fetVar.i(function0)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i10 |= i14;
            }
            i15 = i10;
            if ((i15 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i15 & 1, z3)) {
                if (i18 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i4 != 0) {
                    str7 = "";
                } else {
                    str7 = str3;
                }
                if (i6 != 0) {
                    sfh0Var3 = qfh0.f28634a;
                } else {
                    sfh0Var3 = sfh0Var;
                }
                if (i8 != 0) {
                    str8 = null;
                } else {
                    str8 = str4;
                }
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = dw9.j(fetVar);
                }
                gy40 gy40Var6 = (gy40) objP;
                if (i11 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function0;
                }
                string = StringsKt.x0(str7).toString();
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new cqq();
                    fetVar.o0(objP2);
                }
                cqqVar = (cqq) objP2;
                wpqVar = (wpq) fetVar.k(bmd.i);
                objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = androidx.compose.runtime.e.e(null);
                    fetVar.o0(objP3);
                }
                pz40 pz40Var5 = (pz40) objP3;
                String str12 = str8;
                Boolean boolValueOf4 = Boolean.valueOf(z5);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zI2 = z6 | fetVar.i(wpqVar);
                objP4 = fetVar.P();
                if (zI2) {
                    objP4 = new j0l(z5, cqqVar, wpqVar, (yje) null);
                    fetVar.o0(objP4);
                } else {
                    objP4 = new j0l(z5, cqqVar, wpqVar, (yje) null);
                    fetVar.o0(objP4);
                }
                m0x0.t(fetVar, boolValueOf4, (Function2) objP4);
                objP5 = fetVar.P();
                obj = objP5;
                if (objP5 == cl5Var) {
                    string.getClass();
                    ba3 ba3Var7 = new ba3();
                    ba3Var7.f2238a = string;
                    fetVar.o0(ba3Var7);
                    obj = ba3Var7;
                }
                ba3 ba3Var8 = (ba3) obj;
                zEquals = ba3Var8.f2238a.equals(string);
                string.getClass();
                ba3Var8.f2238a = string;
                objP6 = fetVar.P();
                if (objP6 == cl5Var) {
                    int length9 = string.length();
                    long jE5 = s7n0.e(length9, length9);
                    int length10 = string.length();
                    objP6 = androidx.compose.runtime.e.e(new a8q0(string, jE5, new o9q0(s7n0.e(length10, length10))));
                    fetVar.o0(objP6);
                }
                pz40Var = (pz40) objP6;
                if (zEquals) {
                }
                mm40 mm40VarB3 = y860.b0(mm40Var, cqqVar);
                if (i16 == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((i15 & 29360128) == 8388608) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z7 | z8;
                objP7 = fetVar.P();
                if (z9) {
                    obj2 = cl5Var;
                    if (objP7 == obj2) {
                        function7 = function5;
                    }
                    mm40 mm40VarE6 = o2e.e0(j120.b0(mm40VarB3, (Function1) objP7), "BASIC_TEXT_FIELD");
                    a8q0 a8q0Var8 = (a8q0) pz40Var.getValue();
                    y9q0 y9q0VarF7 = sfh0Var3.f(fetVar);
                    skk0 skk0Var7 = new skk0(sfh0Var3.b(fetVar));
                    uly ulyVar7 = new uly(0, null, 0, 3, 119);
                    if ((i15 & 234881024) == 67108864) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objP8 = fetVar.P();
                    if (z10) {
                        function8 = function6;
                        objP8 = new cjl(function8, (byte) 17);
                        fetVar.o0(objP8);
                    } else {
                        function8 = function6;
                        objP8 = new cjl(function8, (byte) 17);
                        fetVar.o0(objP8);
                    }
                    kly klyVar7 = new kly(null, null, (Function1) objP8, 47);
                    if ((i15 & 3670016) == 1048576) {
                    }
                    objP9 = fetVar.P();
                    if (z11) {
                        function9 = function1;
                        objP9 = new xpm(pz40Var, function9);
                        fetVar.o0(objP9);
                    } else {
                        function9 = function1;
                        objP9 = new xpm(pz40Var, function9);
                        fetVar.o0(objP9);
                    }
                    z96.a(a8q0Var8, (Function1) ((jhy) objP9), mm40VarE6, false, false, y9q0VarF7, ulyVar7, klyVar7, true, 0, 0, null, null, gy40Var6, skk0Var7, u1c.M(-18527333, new hgs0(pz40Var, sfh0Var3, str12, function9, cqqVar), fetVar), fetVar, 102236160, ((i15 >> 6) & 7168) | 196608, 7704);
                    z4 = z5;
                    gy40Var2 = gy40Var6;
                    function3 = function7;
                    sfh0Var2 = sfh0Var3;
                    str6 = str12;
                    str5 = str7;
                    function4 = function8;
                } else {
                    obj2 = cl5Var;
                }
                function7 = function5;
                objP7 = new ka2(pz40Var5, z5, function7, (byte) 3);
                fetVar.o0(objP7);
                mm40 mm40VarE7 = o2e.e0(j120.b0(mm40VarB3, (Function1) objP7), "BASIC_TEXT_FIELD");
                a8q0 a8q0Var9 = (a8q0) pz40Var.getValue();
                y9q0 y9q0VarF8 = sfh0Var3.f(fetVar);
                skk0 skk0Var8 = new skk0(sfh0Var3.b(fetVar));
                uly ulyVar8 = new uly(0, null, 0, 3, 119);
                if ((i15 & 234881024) == 67108864) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objP8 = fetVar.P();
                if (z10) {
                    function8 = function6;
                    objP8 = new cjl(function8, (byte) 17);
                    fetVar.o0(objP8);
                } else {
                    function8 = function6;
                    objP8 = new cjl(function8, (byte) 17);
                    fetVar.o0(objP8);
                }
                kly klyVar8 = new kly(null, null, (Function1) objP8, 47);
                if ((i15 & 3670016) == 1048576) {
                }
                objP9 = fetVar.P();
                if (z11) {
                    function9 = function1;
                    objP9 = new xpm(pz40Var, function9);
                    fetVar.o0(objP9);
                } else {
                    function9 = function1;
                    objP9 = new xpm(pz40Var, function9);
                    fetVar.o0(objP9);
                }
                z96.a(a8q0Var9, (Function1) ((jhy) objP9), mm40VarE7, false, false, y9q0VarF8, ulyVar8, klyVar8, true, 0, 0, null, null, gy40Var6, skk0Var8, u1c.M(-18527333, new hgs0(pz40Var, sfh0Var3, str12, function9, cqqVar), fetVar), fetVar, 102236160, ((i15 >> 6) & 7168) | 196608, 7704);
                z4 = z5;
                gy40Var2 = gy40Var6;
                function3 = function7;
                sfh0Var2 = sfh0Var3;
                str6 = str12;
                str5 = str7;
                function4 = function8;
            } else {
                fetVar.X();
                sfh0Var2 = sfh0Var;
                gy40Var2 = gy40Var;
                function3 = function2;
                function4 = function0;
                z4 = z2;
                str5 = str3;
                str6 = str4;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new wpm(mm40Var, z4, str5, sfh0Var2, str6, gy40Var2, function1, function3, function4, i, i2);
            }
        }
        i3 |= 48;
        z2 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                str3 = str;
                if (fetVar.g(str3)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if ((i & 4096) == 0) {
                    zI = fetVar.g(sfh0Var);
                } else {
                    zI = fetVar.i(sfh0Var);
                }
                if (zI) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    str4 = str2;
                    if (fetVar.g(str4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                i10 = i3 | 196608;
                if ((i & 1572864) == 0) {
                    if (fetVar.i(function1)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i10 |= i17;
                }
                i11 = i2 & 128;
                if (i11 != 0) {
                    i10 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (fetVar.i(function2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i10 |= i12;
                }
                i13 = i2 & 256;
                if (i13 != 0) {
                    i10 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (fetVar.i(function0)) {
                        i14 = 67108864;
                    } else {
                        i14 = 33554432;
                    }
                    i10 |= i14;
                }
                i15 = i10;
                if ((i15 & 38347923) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i15 & 1, z3)) {
                    if (i18 != 0) {
                        z5 = false;
                    } else {
                        z5 = z2;
                    }
                    if (i4 != 0) {
                        str7 = "";
                    } else {
                        str7 = str3;
                    }
                    if (i6 != 0) {
                        sfh0Var3 = qfh0.f28634a;
                    } else {
                        sfh0Var3 = sfh0Var;
                    }
                    if (i8 != 0) {
                        str8 = null;
                    } else {
                        str8 = str4;
                    }
                    objP = fetVar.P();
                    cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = dw9.j(fetVar);
                    }
                    gy40 gy40Var7 = (gy40) objP;
                    if (i11 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function0;
                    }
                    string = StringsKt.x0(str7).toString();
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = new cqq();
                        fetVar.o0(objP2);
                    }
                    cqqVar = (cqq) objP2;
                    wpqVar = (wpq) fetVar.k(bmd.i);
                    objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = androidx.compose.runtime.e.e(null);
                        fetVar.o0(objP3);
                    }
                    pz40 pz40Var6 = (pz40) objP3;
                    String str13 = str8;
                    Boolean boolValueOf5 = Boolean.valueOf(z5);
                    i16 = i15 & 112;
                    if (i16 == 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zI2 = z6 | fetVar.i(wpqVar);
                    objP4 = fetVar.P();
                    if (zI2) {
                        objP4 = new j0l(z5, cqqVar, wpqVar, (yje) null);
                        fetVar.o0(objP4);
                    } else {
                        objP4 = new j0l(z5, cqqVar, wpqVar, (yje) null);
                        fetVar.o0(objP4);
                    }
                    m0x0.t(fetVar, boolValueOf5, (Function2) objP4);
                    objP5 = fetVar.P();
                    obj = objP5;
                    if (objP5 == cl5Var) {
                        string.getClass();
                        ba3 ba3Var9 = new ba3();
                        ba3Var9.f2238a = string;
                        fetVar.o0(ba3Var9);
                        obj = ba3Var9;
                    }
                    ba3 ba3Var10 = (ba3) obj;
                    zEquals = ba3Var10.f2238a.equals(string);
                    string.getClass();
                    ba3Var10.f2238a = string;
                    objP6 = fetVar.P();
                    if (objP6 == cl5Var) {
                        int length11 = string.length();
                        long jE6 = s7n0.e(length11, length11);
                        int length12 = string.length();
                        objP6 = androidx.compose.runtime.e.e(new a8q0(string, jE6, new o9q0(s7n0.e(length12, length12))));
                        fetVar.o0(objP6);
                    }
                    pz40Var = (pz40) objP6;
                    if (zEquals) {
                    }
                    mm40 mm40VarB4 = y860.b0(mm40Var, cqqVar);
                    if (i16 == 32) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if ((i15 & 29360128) == 8388608) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z7 | z8;
                    objP7 = fetVar.P();
                    if (z9) {
                        obj2 = cl5Var;
                        if (objP7 == obj2) {
                            function7 = function5;
                        }
                        mm40 mm40VarE8 = o2e.e0(j120.b0(mm40VarB4, (Function1) objP7), "BASIC_TEXT_FIELD");
                        a8q0 a8q0Var10 = (a8q0) pz40Var.getValue();
                        y9q0 y9q0VarF9 = sfh0Var3.f(fetVar);
                        skk0 skk0Var9 = new skk0(sfh0Var3.b(fetVar));
                        uly ulyVar9 = new uly(0, null, 0, 3, 119);
                        if ((i15 & 234881024) == 67108864) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        objP8 = fetVar.P();
                        if (z10) {
                            function8 = function6;
                            objP8 = new cjl(function8, (byte) 17);
                            fetVar.o0(objP8);
                        } else {
                            function8 = function6;
                            objP8 = new cjl(function8, (byte) 17);
                            fetVar.o0(objP8);
                        }
                        kly klyVar9 = new kly(null, null, (Function1) objP8, 47);
                        if ((i15 & 3670016) == 1048576) {
                        }
                        objP9 = fetVar.P();
                        if (z11) {
                            function9 = function1;
                            objP9 = new xpm(pz40Var, function9);
                            fetVar.o0(objP9);
                        } else {
                            function9 = function1;
                            objP9 = new xpm(pz40Var, function9);
                            fetVar.o0(objP9);
                        }
                        z96.a(a8q0Var10, (Function1) ((jhy) objP9), mm40VarE8, false, false, y9q0VarF9, ulyVar9, klyVar9, true, 0, 0, null, null, gy40Var7, skk0Var9, u1c.M(-18527333, new hgs0(pz40Var, sfh0Var3, str13, function9, cqqVar), fetVar), fetVar, 102236160, ((i15 >> 6) & 7168) | 196608, 7704);
                        z4 = z5;
                        gy40Var2 = gy40Var7;
                        function3 = function7;
                        sfh0Var2 = sfh0Var3;
                        str6 = str13;
                        str5 = str7;
                        function4 = function8;
                    } else {
                        obj2 = cl5Var;
                    }
                    function7 = function5;
                    objP7 = new ka2(pz40Var6, z5, function7, (byte) 3);
                    fetVar.o0(objP7);
                    mm40 mm40VarE9 = o2e.e0(j120.b0(mm40VarB4, (Function1) objP7), "BASIC_TEXT_FIELD");
                    a8q0 a8q0Var11 = (a8q0) pz40Var.getValue();
                    y9q0 y9q0VarF10 = sfh0Var3.f(fetVar);
                    skk0 skk0Var10 = new skk0(sfh0Var3.b(fetVar));
                    uly ulyVar10 = new uly(0, null, 0, 3, 119);
                    if ((i15 & 234881024) == 67108864) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objP8 = fetVar.P();
                    if (z10) {
                        function8 = function6;
                        objP8 = new cjl(function8, (byte) 17);
                        fetVar.o0(objP8);
                    } else {
                        function8 = function6;
                        objP8 = new cjl(function8, (byte) 17);
                        fetVar.o0(objP8);
                    }
                    kly klyVar10 = new kly(null, null, (Function1) objP8, 47);
                    if ((i15 & 3670016) == 1048576) {
                    }
                    objP9 = fetVar.P();
                    if (z11) {
                        function9 = function1;
                        objP9 = new xpm(pz40Var, function9);
                        fetVar.o0(objP9);
                    } else {
                        function9 = function1;
                        objP9 = new xpm(pz40Var, function9);
                        fetVar.o0(objP9);
                    }
                    z96.a(a8q0Var11, (Function1) ((jhy) objP9), mm40VarE9, false, false, y9q0VarF10, ulyVar10, klyVar10, true, 0, 0, null, null, gy40Var7, skk0Var10, u1c.M(-18527333, new hgs0(pz40Var, sfh0Var3, str13, function9, cqqVar), fetVar), fetVar, 102236160, ((i15 >> 6) & 7168) | 196608, 7704);
                    z4 = z5;
                    gy40Var2 = gy40Var7;
                    function3 = function7;
                    sfh0Var2 = sfh0Var3;
                    str6 = str13;
                    str5 = str7;
                    function4 = function8;
                } else {
                    fetVar.X();
                    sfh0Var2 = sfh0Var;
                    gy40Var2 = gy40Var;
                    function3 = function2;
                    function4 = function0;
                    z4 = z2;
                    str5 = str3;
                    str6 = str4;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new wpm(mm40Var, z4, str5, sfh0Var2, str6, gy40Var2, function1, function3, function4, i, i2);
                }
            }
            i3 |= 24576;
            str4 = str2;
            i10 = i3 | 196608;
            if ((i & 1572864) == 0) {
                if (fetVar.i(function1)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i10 |= i17;
            }
            i11 = i2 & 128;
            if (i11 != 0) {
                i10 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (fetVar.i(function2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i10 |= i12;
            }
            i13 = i2 & 256;
            if (i13 != 0) {
                i10 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (fetVar.i(function0)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i10 |= i14;
            }
            i15 = i10;
            if ((i15 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i15 & 1, z3)) {
                if (i18 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i4 != 0) {
                    str7 = "";
                } else {
                    str7 = str3;
                }
                if (i6 != 0) {
                    sfh0Var3 = qfh0.f28634a;
                } else {
                    sfh0Var3 = sfh0Var;
                }
                if (i8 != 0) {
                    str8 = null;
                } else {
                    str8 = str4;
                }
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = dw9.j(fetVar);
                }
                gy40 gy40Var8 = (gy40) objP;
                if (i11 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function0;
                }
                string = StringsKt.x0(str7).toString();
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new cqq();
                    fetVar.o0(objP2);
                }
                cqqVar = (cqq) objP2;
                wpqVar = (wpq) fetVar.k(bmd.i);
                objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = androidx.compose.runtime.e.e(null);
                    fetVar.o0(objP3);
                }
                pz40 pz40Var7 = (pz40) objP3;
                String str14 = str8;
                Boolean boolValueOf6 = Boolean.valueOf(z5);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zI2 = z6 | fetVar.i(wpqVar);
                objP4 = fetVar.P();
                if (zI2) {
                    objP4 = new j0l(z5, cqqVar, wpqVar, (yje) null);
                    fetVar.o0(objP4);
                } else {
                    objP4 = new j0l(z5, cqqVar, wpqVar, (yje) null);
                    fetVar.o0(objP4);
                }
                m0x0.t(fetVar, boolValueOf6, (Function2) objP4);
                objP5 = fetVar.P();
                obj = objP5;
                if (objP5 == cl5Var) {
                    string.getClass();
                    ba3 ba3Var11 = new ba3();
                    ba3Var11.f2238a = string;
                    fetVar.o0(ba3Var11);
                    obj = ba3Var11;
                }
                ba3 ba3Var12 = (ba3) obj;
                zEquals = ba3Var12.f2238a.equals(string);
                string.getClass();
                ba3Var12.f2238a = string;
                objP6 = fetVar.P();
                if (objP6 == cl5Var) {
                    int length13 = string.length();
                    long jE7 = s7n0.e(length13, length13);
                    int length14 = string.length();
                    objP6 = androidx.compose.runtime.e.e(new a8q0(string, jE7, new o9q0(s7n0.e(length14, length14))));
                    fetVar.o0(objP6);
                }
                pz40Var = (pz40) objP6;
                if (zEquals) {
                }
                mm40 mm40VarB5 = y860.b0(mm40Var, cqqVar);
                if (i16 == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((i15 & 29360128) == 8388608) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z7 | z8;
                objP7 = fetVar.P();
                if (z9) {
                    obj2 = cl5Var;
                    if (objP7 == obj2) {
                        function7 = function5;
                    }
                    mm40 mm40VarE10 = o2e.e0(j120.b0(mm40VarB5, (Function1) objP7), "BASIC_TEXT_FIELD");
                    a8q0 a8q0Var12 = (a8q0) pz40Var.getValue();
                    y9q0 y9q0VarF11 = sfh0Var3.f(fetVar);
                    skk0 skk0Var11 = new skk0(sfh0Var3.b(fetVar));
                    uly ulyVar11 = new uly(0, null, 0, 3, 119);
                    if ((i15 & 234881024) == 67108864) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objP8 = fetVar.P();
                    if (z10) {
                        function8 = function6;
                        objP8 = new cjl(function8, (byte) 17);
                        fetVar.o0(objP8);
                    } else {
                        function8 = function6;
                        objP8 = new cjl(function8, (byte) 17);
                        fetVar.o0(objP8);
                    }
                    kly klyVar11 = new kly(null, null, (Function1) objP8, 47);
                    if ((i15 & 3670016) == 1048576) {
                    }
                    objP9 = fetVar.P();
                    if (z11) {
                        function9 = function1;
                        objP9 = new xpm(pz40Var, function9);
                        fetVar.o0(objP9);
                    } else {
                        function9 = function1;
                        objP9 = new xpm(pz40Var, function9);
                        fetVar.o0(objP9);
                    }
                    z96.a(a8q0Var12, (Function1) ((jhy) objP9), mm40VarE10, false, false, y9q0VarF11, ulyVar11, klyVar11, true, 0, 0, null, null, gy40Var8, skk0Var11, u1c.M(-18527333, new hgs0(pz40Var, sfh0Var3, str14, function9, cqqVar), fetVar), fetVar, 102236160, ((i15 >> 6) & 7168) | 196608, 7704);
                    z4 = z5;
                    gy40Var2 = gy40Var8;
                    function3 = function7;
                    sfh0Var2 = sfh0Var3;
                    str6 = str14;
                    str5 = str7;
                    function4 = function8;
                } else {
                    obj2 = cl5Var;
                }
                function7 = function5;
                objP7 = new ka2(pz40Var7, z5, function7, (byte) 3);
                fetVar.o0(objP7);
                mm40 mm40VarE11 = o2e.e0(j120.b0(mm40VarB5, (Function1) objP7), "BASIC_TEXT_FIELD");
                a8q0 a8q0Var13 = (a8q0) pz40Var.getValue();
                y9q0 y9q0VarF12 = sfh0Var3.f(fetVar);
                skk0 skk0Var12 = new skk0(sfh0Var3.b(fetVar));
                uly ulyVar12 = new uly(0, null, 0, 3, 119);
                if ((i15 & 234881024) == 67108864) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objP8 = fetVar.P();
                if (z10) {
                    function8 = function6;
                    objP8 = new cjl(function8, (byte) 17);
                    fetVar.o0(objP8);
                } else {
                    function8 = function6;
                    objP8 = new cjl(function8, (byte) 17);
                    fetVar.o0(objP8);
                }
                kly klyVar12 = new kly(null, null, (Function1) objP8, 47);
                if ((i15 & 3670016) == 1048576) {
                }
                objP9 = fetVar.P();
                if (z11) {
                    function9 = function1;
                    objP9 = new xpm(pz40Var, function9);
                    fetVar.o0(objP9);
                } else {
                    function9 = function1;
                    objP9 = new xpm(pz40Var, function9);
                    fetVar.o0(objP9);
                }
                z96.a(a8q0Var13, (Function1) ((jhy) objP9), mm40VarE11, false, false, y9q0VarF12, ulyVar12, klyVar12, true, 0, 0, null, null, gy40Var8, skk0Var12, u1c.M(-18527333, new hgs0(pz40Var, sfh0Var3, str14, function9, cqqVar), fetVar), fetVar, 102236160, ((i15 >> 6) & 7168) | 196608, 7704);
                z4 = z5;
                gy40Var2 = gy40Var8;
                function3 = function7;
                sfh0Var2 = sfh0Var3;
                str6 = str14;
                str5 = str7;
                function4 = function8;
            } else {
                fetVar.X();
                sfh0Var2 = sfh0Var;
                gy40Var2 = gy40Var;
                function3 = function2;
                function4 = function0;
                z4 = z2;
                str5 = str3;
                str6 = str4;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new wpm(mm40Var, z4, str5, sfh0Var2, str6, gy40Var2, function1, function3, function4, i, i2);
            }
        }
        i3 |= 384;
        str3 = str;
        i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if ((i & 4096) == 0) {
                zI = fetVar.g(sfh0Var);
            } else {
                zI = fetVar.i(sfh0Var);
            }
            if (zI) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                str4 = str2;
                if (fetVar.g(str4)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            i10 = i3 | 196608;
            if ((i & 1572864) == 0) {
                if (fetVar.i(function1)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i10 |= i17;
            }
            i11 = i2 & 128;
            if (i11 != 0) {
                i10 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (fetVar.i(function2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i10 |= i12;
            }
            i13 = i2 & 256;
            if (i13 != 0) {
                i10 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (fetVar.i(function0)) {
                    i14 = 67108864;
                } else {
                    i14 = 33554432;
                }
                i10 |= i14;
            }
            i15 = i10;
            if ((i15 & 38347923) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i15 & 1, z3)) {
                if (i18 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i4 != 0) {
                    str7 = "";
                } else {
                    str7 = str3;
                }
                if (i6 != 0) {
                    sfh0Var3 = qfh0.f28634a;
                } else {
                    sfh0Var3 = sfh0Var;
                }
                if (i8 != 0) {
                    str8 = null;
                } else {
                    str8 = str4;
                }
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = dw9.j(fetVar);
                }
                gy40 gy40Var9 = (gy40) objP;
                if (i11 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function0;
                }
                string = StringsKt.x0(str7).toString();
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new cqq();
                    fetVar.o0(objP2);
                }
                cqqVar = (cqq) objP2;
                wpqVar = (wpq) fetVar.k(bmd.i);
                objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = androidx.compose.runtime.e.e(null);
                    fetVar.o0(objP3);
                }
                pz40 pz40Var8 = (pz40) objP3;
                String str15 = str8;
                Boolean boolValueOf7 = Boolean.valueOf(z5);
                i16 = i15 & 112;
                if (i16 == 32) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zI2 = z6 | fetVar.i(wpqVar);
                objP4 = fetVar.P();
                if (zI2) {
                    objP4 = new j0l(z5, cqqVar, wpqVar, (yje) null);
                    fetVar.o0(objP4);
                } else {
                    objP4 = new j0l(z5, cqqVar, wpqVar, (yje) null);
                    fetVar.o0(objP4);
                }
                m0x0.t(fetVar, boolValueOf7, (Function2) objP4);
                objP5 = fetVar.P();
                obj = objP5;
                if (objP5 == cl5Var) {
                    string.getClass();
                    ba3 ba3Var13 = new ba3();
                    ba3Var13.f2238a = string;
                    fetVar.o0(ba3Var13);
                    obj = ba3Var13;
                }
                ba3 ba3Var14 = (ba3) obj;
                zEquals = ba3Var14.f2238a.equals(string);
                string.getClass();
                ba3Var14.f2238a = string;
                objP6 = fetVar.P();
                if (objP6 == cl5Var) {
                    int length15 = string.length();
                    long jE8 = s7n0.e(length15, length15);
                    int length16 = string.length();
                    objP6 = androidx.compose.runtime.e.e(new a8q0(string, jE8, new o9q0(s7n0.e(length16, length16))));
                    fetVar.o0(objP6);
                }
                pz40Var = (pz40) objP6;
                if (zEquals) {
                }
                mm40 mm40VarB6 = y860.b0(mm40Var, cqqVar);
                if (i16 == 32) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if ((i15 & 29360128) == 8388608) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z7 | z8;
                objP7 = fetVar.P();
                if (z9) {
                    obj2 = cl5Var;
                    if (objP7 == obj2) {
                        function7 = function5;
                    }
                    mm40 mm40VarE12 = o2e.e0(j120.b0(mm40VarB6, (Function1) objP7), "BASIC_TEXT_FIELD");
                    a8q0 a8q0Var14 = (a8q0) pz40Var.getValue();
                    y9q0 y9q0VarF13 = sfh0Var3.f(fetVar);
                    skk0 skk0Var13 = new skk0(sfh0Var3.b(fetVar));
                    uly ulyVar13 = new uly(0, null, 0, 3, 119);
                    if ((i15 & 234881024) == 67108864) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    objP8 = fetVar.P();
                    if (z10) {
                        function8 = function6;
                        objP8 = new cjl(function8, (byte) 17);
                        fetVar.o0(objP8);
                    } else {
                        function8 = function6;
                        objP8 = new cjl(function8, (byte) 17);
                        fetVar.o0(objP8);
                    }
                    kly klyVar13 = new kly(null, null, (Function1) objP8, 47);
                    if ((i15 & 3670016) == 1048576) {
                    }
                    objP9 = fetVar.P();
                    if (z11) {
                        function9 = function1;
                        objP9 = new xpm(pz40Var, function9);
                        fetVar.o0(objP9);
                    } else {
                        function9 = function1;
                        objP9 = new xpm(pz40Var, function9);
                        fetVar.o0(objP9);
                    }
                    z96.a(a8q0Var14, (Function1) ((jhy) objP9), mm40VarE12, false, false, y9q0VarF13, ulyVar13, klyVar13, true, 0, 0, null, null, gy40Var9, skk0Var13, u1c.M(-18527333, new hgs0(pz40Var, sfh0Var3, str15, function9, cqqVar), fetVar), fetVar, 102236160, ((i15 >> 6) & 7168) | 196608, 7704);
                    z4 = z5;
                    gy40Var2 = gy40Var9;
                    function3 = function7;
                    sfh0Var2 = sfh0Var3;
                    str6 = str15;
                    str5 = str7;
                    function4 = function8;
                } else {
                    obj2 = cl5Var;
                }
                function7 = function5;
                objP7 = new ka2(pz40Var8, z5, function7, (byte) 3);
                fetVar.o0(objP7);
                mm40 mm40VarE13 = o2e.e0(j120.b0(mm40VarB6, (Function1) objP7), "BASIC_TEXT_FIELD");
                a8q0 a8q0Var15 = (a8q0) pz40Var.getValue();
                y9q0 y9q0VarF14 = sfh0Var3.f(fetVar);
                skk0 skk0Var14 = new skk0(sfh0Var3.b(fetVar));
                uly ulyVar14 = new uly(0, null, 0, 3, 119);
                if ((i15 & 234881024) == 67108864) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objP8 = fetVar.P();
                if (z10) {
                    function8 = function6;
                    objP8 = new cjl(function8, (byte) 17);
                    fetVar.o0(objP8);
                } else {
                    function8 = function6;
                    objP8 = new cjl(function8, (byte) 17);
                    fetVar.o0(objP8);
                }
                kly klyVar14 = new kly(null, null, (Function1) objP8, 47);
                if ((i15 & 3670016) == 1048576) {
                }
                objP9 = fetVar.P();
                if (z11) {
                    function9 = function1;
                    objP9 = new xpm(pz40Var, function9);
                    fetVar.o0(objP9);
                } else {
                    function9 = function1;
                    objP9 = new xpm(pz40Var, function9);
                    fetVar.o0(objP9);
                }
                z96.a(a8q0Var15, (Function1) ((jhy) objP9), mm40VarE13, false, false, y9q0VarF14, ulyVar14, klyVar14, true, 0, 0, null, null, gy40Var9, skk0Var14, u1c.M(-18527333, new hgs0(pz40Var, sfh0Var3, str15, function9, cqqVar), fetVar), fetVar, 102236160, ((i15 >> 6) & 7168) | 196608, 7704);
                z4 = z5;
                gy40Var2 = gy40Var9;
                function3 = function7;
                sfh0Var2 = sfh0Var3;
                str6 = str15;
                str5 = str7;
                function4 = function8;
            } else {
                fetVar.X();
                sfh0Var2 = sfh0Var;
                gy40Var2 = gy40Var;
                function3 = function2;
                function4 = function0;
                z4 = z2;
                str5 = str3;
                str6 = str4;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new wpm(mm40Var, z4, str5, sfh0Var2, str6, gy40Var2, function1, function3, function4, i, i2);
            }
        }
        i3 |= 24576;
        str4 = str2;
        i10 = i3 | 196608;
        if ((i & 1572864) == 0) {
            if (fetVar.i(function1)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i10 |= i17;
        }
        i11 = i2 & 128;
        if (i11 != 0) {
            i10 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (fetVar.i(function2)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i10 |= i12;
        }
        i13 = i2 & 256;
        if (i13 != 0) {
            i10 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (fetVar.i(function0)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i10 |= i14;
        }
        i15 = i10;
        if ((i15 & 38347923) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i15 & 1, z3)) {
            if (i18 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if (i4 != 0) {
                str7 = "";
            } else {
                str7 = str3;
            }
            if (i6 != 0) {
                sfh0Var3 = qfh0.f28634a;
            } else {
                sfh0Var3 = sfh0Var;
            }
            if (i8 != 0) {
                str8 = null;
            } else {
                str8 = str4;
            }
            objP = fetVar.P();
            cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var10 = (gy40) objP;
            if (i11 != 0) {
                function5 = null;
            } else {
                function5 = function2;
            }
            if (i13 != 0) {
                function6 = null;
            } else {
                function6 = function0;
            }
            string = StringsKt.x0(str7).toString();
            objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new cqq();
                fetVar.o0(objP2);
            }
            cqqVar = (cqq) objP2;
            wpqVar = (wpq) fetVar.k(bmd.i);
            objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP3);
            }
            pz40 pz40Var9 = (pz40) objP3;
            String str16 = str8;
            Boolean boolValueOf8 = Boolean.valueOf(z5);
            i16 = i15 & 112;
            if (i16 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            zI2 = z6 | fetVar.i(wpqVar);
            objP4 = fetVar.P();
            if (zI2) {
                objP4 = new j0l(z5, cqqVar, wpqVar, (yje) null);
                fetVar.o0(objP4);
            } else {
                objP4 = new j0l(z5, cqqVar, wpqVar, (yje) null);
                fetVar.o0(objP4);
            }
            m0x0.t(fetVar, boolValueOf8, (Function2) objP4);
            objP5 = fetVar.P();
            obj = objP5;
            if (objP5 == cl5Var) {
                string.getClass();
                ba3 ba3Var15 = new ba3();
                ba3Var15.f2238a = string;
                fetVar.o0(ba3Var15);
                obj = ba3Var15;
            }
            ba3 ba3Var16 = (ba3) obj;
            zEquals = ba3Var16.f2238a.equals(string);
            string.getClass();
            ba3Var16.f2238a = string;
            objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                int length17 = string.length();
                long jE9 = s7n0.e(length17, length17);
                int length18 = string.length();
                objP6 = androidx.compose.runtime.e.e(new a8q0(string, jE9, new o9q0(s7n0.e(length18, length18))));
                fetVar.o0(objP6);
            }
            pz40Var = (pz40) objP6;
            if (zEquals) {
            }
            mm40 mm40VarB7 = y860.b0(mm40Var, cqqVar);
            if (i16 == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((i15 & 29360128) == 8388608) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = z7 | z8;
            objP7 = fetVar.P();
            if (z9) {
                obj2 = cl5Var;
                if (objP7 == obj2) {
                    function7 = function5;
                }
                mm40 mm40VarE14 = o2e.e0(j120.b0(mm40VarB7, (Function1) objP7), "BASIC_TEXT_FIELD");
                a8q0 a8q0Var16 = (a8q0) pz40Var.getValue();
                y9q0 y9q0VarF15 = sfh0Var3.f(fetVar);
                skk0 skk0Var15 = new skk0(sfh0Var3.b(fetVar));
                uly ulyVar15 = new uly(0, null, 0, 3, 119);
                if ((i15 & 234881024) == 67108864) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                objP8 = fetVar.P();
                if (z10) {
                    function8 = function6;
                    objP8 = new cjl(function8, (byte) 17);
                    fetVar.o0(objP8);
                } else {
                    function8 = function6;
                    objP8 = new cjl(function8, (byte) 17);
                    fetVar.o0(objP8);
                }
                kly klyVar15 = new kly(null, null, (Function1) objP8, 47);
                if ((i15 & 3670016) == 1048576) {
                }
                objP9 = fetVar.P();
                if (z11) {
                    function9 = function1;
                    objP9 = new xpm(pz40Var, function9);
                    fetVar.o0(objP9);
                } else {
                    function9 = function1;
                    objP9 = new xpm(pz40Var, function9);
                    fetVar.o0(objP9);
                }
                z96.a(a8q0Var16, (Function1) ((jhy) objP9), mm40VarE14, false, false, y9q0VarF15, ulyVar15, klyVar15, true, 0, 0, null, null, gy40Var10, skk0Var15, u1c.M(-18527333, new hgs0(pz40Var, sfh0Var3, str16, function9, cqqVar), fetVar), fetVar, 102236160, ((i15 >> 6) & 7168) | 196608, 7704);
                z4 = z5;
                gy40Var2 = gy40Var10;
                function3 = function7;
                sfh0Var2 = sfh0Var3;
                str6 = str16;
                str5 = str7;
                function4 = function8;
            } else {
                obj2 = cl5Var;
            }
            function7 = function5;
            objP7 = new ka2(pz40Var9, z5, function7, (byte) 3);
            fetVar.o0(objP7);
            mm40 mm40VarE15 = o2e.e0(j120.b0(mm40VarB7, (Function1) objP7), "BASIC_TEXT_FIELD");
            a8q0 a8q0Var17 = (a8q0) pz40Var.getValue();
            y9q0 y9q0VarF16 = sfh0Var3.f(fetVar);
            skk0 skk0Var16 = new skk0(sfh0Var3.b(fetVar));
            uly ulyVar16 = new uly(0, null, 0, 3, 119);
            if ((i15 & 234881024) == 67108864) {
                z10 = true;
            } else {
                z10 = false;
            }
            objP8 = fetVar.P();
            if (z10) {
                function8 = function6;
                objP8 = new cjl(function8, (byte) 17);
                fetVar.o0(objP8);
            } else {
                function8 = function6;
                objP8 = new cjl(function8, (byte) 17);
                fetVar.o0(objP8);
            }
            kly klyVar16 = new kly(null, null, (Function1) objP8, 47);
            if ((i15 & 3670016) == 1048576) {
            }
            objP9 = fetVar.P();
            if (z11) {
                function9 = function1;
                objP9 = new xpm(pz40Var, function9);
                fetVar.o0(objP9);
            } else {
                function9 = function1;
                objP9 = new xpm(pz40Var, function9);
                fetVar.o0(objP9);
            }
            z96.a(a8q0Var17, (Function1) ((jhy) objP9), mm40VarE15, false, false, y9q0VarF16, ulyVar16, klyVar16, true, 0, 0, null, null, gy40Var10, skk0Var16, u1c.M(-18527333, new hgs0(pz40Var, sfh0Var3, str16, function9, cqqVar), fetVar), fetVar, 102236160, ((i15 >> 6) & 7168) | 196608, 7704);
            z4 = z5;
            gy40Var2 = gy40Var10;
            function3 = function7;
            sfh0Var2 = sfh0Var3;
            str6 = str16;
            str5 = str7;
            function4 = function8;
        } else {
            fetVar.X();
            sfh0Var2 = sfh0Var;
            gy40Var2 = gy40Var;
            function3 = function2;
            function4 = function0;
            z4 = z2;
            str5 = str3;
            str6 = str4;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wpm(mm40Var, z4, str5, sfh0Var2, str6, gy40Var2, function1, function3, function4, i, i2);
        }
    }

    public static final void o(pz40 pz40Var, Function1 function1, a8q0 a8q0Var) {
        a8q0 a8q0VarB = a8q0.b(a8q0Var, StringsKt.x0(a8q0Var.f440a.b).toString(), 0L, 6);
        a8q0 a8q0Var2 = (a8q0) pz40Var.getValue();
        String str = a8q0Var2.f440a.b;
        j83 j83Var = a8q0VarB.f440a;
        boolean zD = Intrinsics.d(str, j83Var.b);
        o9q0 o9q0Var = a8q0VarB.c;
        boolean z = o9q0Var == null;
        boolean zD2 = Intrinsics.d(a8q0Var2.c, o9q0Var);
        pz40Var.setValue(a8q0VarB);
        if (zD && z && !zD2) {
            return;
        }
        function1.invoke(j83Var.b);
    }

    public static final void p(mm40 mm40Var, owm owmVar, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        String str = owmVar.c;
        String str2 = owmVar.g;
        fetVar.g0(1720496885);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(owmVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (owmVar.h) {
                fetVar.e0(-164896388);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-164895464);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40Var, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            if (str2.length() <= 0 && str.length() <= 0) {
                fetVar.e0(1245468259);
                fetVar.r(false);
            } else {
                fetVar.e0(1245274137);
                w(0, fetVar, s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 4.0f, 7), str2, str);
                fetVar.r(false);
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(675548543, new i3l(owmVar, (byte) 28), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 7, i, mm40Var, owmVar);
        }
    }

    public static final void q(mm40 mm40Var, j1n j1nVar, j1n j1nVar2, String str, String str2, String str3, String str4, fet fetVar, int i) {
        int i2;
        j1n j1nVar3;
        String str5;
        String str6;
        String str7;
        String str8;
        fet fetVar2 = fetVar;
        x0m x0mVar = x0m.f40076a;
        cs0.x(str, str2, str3, str4);
        fetVar2.g0(-1592899892);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(j1nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j1nVar3 = j1nVar2;
            i2 |= fetVar2.g(j1nVar3) ? 256 : 128;
        } else {
            j1nVar3 = j1nVar2;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g("") ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g("") ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            str5 = str;
            i2 |= fetVar2.g(str5) ? 131072 : 65536;
        } else {
            str5 = str;
        }
        if ((1572864 & i) == 0) {
            str6 = str2;
            i2 |= fetVar2.g(str6) ? 1048576 : 524288;
        } else {
            str6 = str2;
        }
        if ((12582912 & i) == 0) {
            str7 = str3;
            i2 |= fetVar2.g(str7) ? 8388608 : 4194304;
        } else {
            str7 = str3;
        }
        if ((100663296 & i) == 0) {
            str8 = str4;
            i2 |= fetVar2.g(str8) ? 67108864 : 33554432;
        } else {
            str8 = str4;
        }
        if ((805306368 & i) == 0) {
            i2 |= fetVar2.g(uem.f35536a) ? 536870912 : 268435456;
        }
        int i3 = i2;
        int i4 = fetVar2.e(0) ? 4 : 2;
        if (fetVar2.U(i3 & 1, ((306783379 & i3) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            B((524272 & i3) | ((i3 >> 9) & 3670016) | ((i4 << 21) & 29360128), j1nVar, j1nVar3, fetVar2, null, str5);
            fetVar2 = fetVar2;
            if (str6.length() <= 0 && str7.length() <= 0 && str8.length() <= 0) {
                fetVar2.e0(-1183146708);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1183321610);
                sj3.p((i3 >> 15) & 8176, 1, fetVar2, null, str6, str7, str8);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49(mm40Var, j1nVar, j1nVar2, str, str2, str3, str4, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01de  */
    /* JADX WARN: Code duplicated, block: B:65:0x011a  */
    /* JADX WARN: Code duplicated, block: B:66:0x011d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0127  */
    /* JADX WARN: Code duplicated, block: B:73:0x0139  */
    /* JADX WARN: Code duplicated, block: B:74:0x013c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0146  */
    /* JADX WARN: Code duplicated, block: B:81:0x0158  */
    /* JADX WARN: Code duplicated, block: B:82:0x015b  */
    /* JADX WARN: Code duplicated, block: B:86:0x0165  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177  */
    /* JADX WARN: Code duplicated, block: B:90:0x017a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0184  */
    /* JADX WARN: Code duplicated, block: B:97:0x0196  */
    /* JADX WARN: Code duplicated, block: B:98:0x0199  */
    public static final void r(t6o t6oVar, sek sekVar, z5s z5sVar, bek bekVar, xex xexVar, CyberBottomSheetParams cyberBottomSheetParams, Function1 function1, fet fetVar, int i) {
        l7m0 l7m0Var;
        cl5 cl5Var;
        boolean z;
        Object objP;
        boolean z2;
        Object objP2;
        boolean z3;
        Object objP3;
        boolean z4;
        Object objP4;
        boolean z5;
        Object objP5;
        boolean z6;
        Object objP6;
        boolean z7;
        Object objP7;
        t6oVar.getClass();
        sekVar.getClass();
        bekVar.getClass();
        xexVar.getClass();
        function1.getClass();
        fetVar.g0(1822699384);
        int i2 = i | (fetVar.g(t6oVar) ? 4 : 2) | (fetVar.g(sekVar) ? 32 : 16) | (fetVar.g(z5sVar) ? 256 : 128) | (fetVar.g(bekVar) ? 2048 : 1024) | (fetVar.g(xexVar) ? 16384 : 8192) | (fetVar.g(cyberBottomSheetParams) ? 131072 : 65536) | (fetVar.i(function1) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            int i3 = 3670016 & i2;
            boolean z8 = i3 == 1048576;
            Object objP8 = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z8 || objP8 == cl5Var2) {
                objP8 = new ylm(function1, (byte) 24);
                fetVar.o0(objP8);
            }
            Function0 function0 = (Function0) objP8;
            boolean z9 = i3 == 1048576;
            Object objP9 = fetVar.P();
            if (z9 || objP9 == cl5Var2) {
                objP9 = new ylm(function1, (byte) 25);
                fetVar.o0(objP9);
            }
            v3c.z(function0, (Function0) objP9, null, fetVar, 0, 4);
            l7m0 l7m0Var2 = t6oVar.f33427a;
            l7m0 l7m0Var3 = t6oVar.b;
            l7m0 l7m0Var4 = t6oVar.c;
            l7m0 l7m0Var5 = t6oVar.d;
            l7m0 l7m0Var6 = t6oVar.g;
            l7m0 l7m0Var7 = t6oVar.f;
            l7m0 l7m0Var8 = t6oVar.e;
            boolean z10 = i3 == 1048576;
            Object objP10 = fetVar.P();
            if (z10) {
                l7m0Var = l7m0Var8;
                cl5Var = cl5Var2;
            } else {
                l7m0Var = l7m0Var8;
                cl5Var = cl5Var2;
                if (objP10 == cl5Var) {
                }
                Function0 function2 = (Function0) objP10;
                if (i3 == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar.P();
                if (z || objP == cl5Var) {
                    objP = new ylm(function1, (byte) 27);
                    fetVar.o0(objP);
                }
                Function0 function3 = (Function0) objP;
                if (i3 == 1048576) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new ylm(function1, (byte) 28);
                    fetVar.o0(objP2);
                }
                Function0 function4 = (Function0) objP2;
                if (i3 == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP3 = fetVar.P();
                if (z3 || objP3 == cl5Var) {
                    objP3 = new ylm(function1, (byte) 29);
                    fetVar.o0(objP3);
                }
                Function0 function5 = (Function0) objP3;
                if (i3 == 1048576) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP4 = fetVar.P();
                if (z4 || objP4 == cl5Var) {
                    objP4 = new btm(function1, (byte) 21);
                    fetVar.o0(objP4);
                }
                Function1 function6 = (Function1) objP4;
                if (i3 == 1048576) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objP5 = fetVar.P();
                if (z5 || objP5 == cl5Var) {
                    objP5 = new btm(function1, (byte) 22);
                    fetVar.o0(objP5);
                }
                Function1 function7 = (Function1) objP5;
                if (i3 == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objP6 = fetVar.P();
                if (z6 || objP6 == cl5Var) {
                    objP6 = new btm(function1, (byte) 15);
                    fetVar.o0(objP6);
                }
                Function1 function8 = (Function1) objP6;
                z7 = i3 == 1048576;
                objP7 = fetVar.P();
                if (z7 || objP7 == cl5Var) {
                    objP7 = new btm(function1, (byte) 16);
                    fetVar.o0(objP7);
                }
                int i4 = ((i2 << 18) & 29360128) | ((i2 << 15) & 234881024) | ((i2 << 21) & 1879048192);
                int i5 = i2 >> 12;
                mrv.x(l7m0Var2, l7m0Var3, l7m0Var4, l7m0Var5, l7m0Var6, l7m0Var7, l7m0Var, sekVar, bekVar, z5sVar, xexVar, cyberBottomSheetParams, null, true, function2, function3, function4, function5, function6, function7, function8, (Function1) objP7, u1c.M(-1074160699, new gn(function1, (byte) 18), fetVar), fetVar, i4, (i5 & 14) | 3072 | (i5 & 112), 4096);
            }
            objP10 = new ylm(function1, (byte) 26);
            fetVar.o0(objP10);
            Function0 function9 = (Function0) objP10;
            if (i3 == 1048576) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar.P();
            if (z) {
                objP = new ylm(function1, (byte) 27);
                fetVar.o0(objP);
            } else {
                objP = new ylm(function1, (byte) 27);
                fetVar.o0(objP);
            }
            Function0 function10 = (Function0) objP;
            if (i3 == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP2 = fetVar.P();
            if (z2) {
                objP2 = new ylm(function1, (byte) 28);
                fetVar.o0(objP2);
            } else {
                objP2 = new ylm(function1, (byte) 28);
                fetVar.o0(objP2);
            }
            Function0 function11 = (Function0) objP2;
            if (i3 == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            objP3 = fetVar.P();
            if (z3) {
                objP3 = new ylm(function1, (byte) 29);
                fetVar.o0(objP3);
            } else {
                objP3 = new ylm(function1, (byte) 29);
                fetVar.o0(objP3);
            }
            Function0 function12 = (Function0) objP3;
            if (i3 == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            objP4 = fetVar.P();
            if (z4) {
                objP4 = new btm(function1, (byte) 21);
                fetVar.o0(objP4);
            } else {
                objP4 = new btm(function1, (byte) 21);
                fetVar.o0(objP4);
            }
            Function1 function13 = (Function1) objP4;
            if (i3 == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            objP5 = fetVar.P();
            if (z5) {
                objP5 = new btm(function1, (byte) 22);
                fetVar.o0(objP5);
            } else {
                objP5 = new btm(function1, (byte) 22);
                fetVar.o0(objP5);
            }
            Function1 function14 = (Function1) objP5;
            if (i3 == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            objP6 = fetVar.P();
            if (z6) {
                objP6 = new btm(function1, (byte) 15);
                fetVar.o0(objP6);
            } else {
                objP6 = new btm(function1, (byte) 15);
                fetVar.o0(objP6);
            }
            Function1 function15 = (Function1) objP6;
            if (i3 == 1048576) {
            }
            objP7 = fetVar.P();
            if (z7) {
                objP7 = new btm(function1, (byte) 16);
                fetVar.o0(objP7);
            } else {
                objP7 = new btm(function1, (byte) 16);
                fetVar.o0(objP7);
            }
            int i6 = ((i2 << 18) & 29360128) | ((i2 << 15) & 234881024) | ((i2 << 21) & 1879048192);
            int i7 = i2 >> 12;
            mrv.x(l7m0Var2, l7m0Var3, l7m0Var4, l7m0Var5, l7m0Var6, l7m0Var7, l7m0Var, sekVar, bekVar, z5sVar, xexVar, cyberBottomSheetParams, null, true, function9, function10, function11, function12, function13, function14, function15, (Function1) objP7, u1c.M(-1074160699, new gn(function1, (byte) 18), fetVar), fetVar, i6, (i7 & 14) | 3072 | (i7 & 112), 4096);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn0((Object) t6oVar, (Object) sekVar, (Object) z5sVar, (Object) bekVar, (Object) xexVar, (Object) cyberBottomSheetParams, (wdr) function1, i, (byte) 6);
        }
    }

    public static final void s(mm40 mm40Var, ydo ydoVar, fet fetVar, int i) {
        fetVar.g0(-1213105264);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(ydoVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-106561456, new xdo(ydoVar, mm40Var), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xdo(mm40Var, ydoVar, i);
        }
    }

    public static final void t(mm40 mm40Var, boolean z, final xdr xdrVar, final xdr xdrVar2, final xdr xdrVar3, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        ugd ugdVar3;
        boolean z2;
        boolean z3;
        int i2;
        final boolean z4;
        final pz40 pz40Var;
        mw3 mw3Var;
        Object obj;
        boolean z5;
        xdr xdrVar4 = xdrVar3;
        mw3 mw3Var2 = uc9.c;
        fetVar.g0(985215009);
        int i3 = i | (fetVar.g(mm40Var) ? 4 : 2) | 16 | (fetVar.i(xdrVar) ? 256 : 128) | (fetVar.i(xdrVar2) ? 2048 : 1024) | (fetVar.i(xdrVar4) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                z3 = fetVar.k(bmd.n) == k6z.b;
                i2 = i3 & (-113);
            } else {
                fetVar.X();
                i2 = i3 & (-113);
                z3 = z;
            }
            fetVar.s();
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                zcl zclVar = qmk.f28987a;
                objP = twn.j(2.0f, fetVar);
            }
            float f = ((ycl) objP).f42389a;
            Object objP2 = fetVar.P();
            if (objP2 == obj2) {
                zcl zclVar2 = qmk.f28987a;
                objP2 = twn.j(32.0f, fetVar);
            }
            final float f2 = ((ycl) objP2).f42389a;
            Object objP3 = fetVar.P();
            if (objP3 == obj2) {
                zcl zclVar3 = qmk.f28987a;
                objP3 = twn.j(24.0f, fetVar);
            }
            float f3 = ((ycl) objP3).f42389a;
            Object objP4 = fetVar.P();
            if (objP4 == obj2) {
                objP4 = gqw0.n;
                fetVar.o0(objP4);
            }
            xx7 xx7Var = (xx7) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj2) {
                fetVar.o0(mw3Var2);
                objP5 = mw3Var2;
            }
            sw3 sw3Var = (sw3) objP5;
            final long separator60 = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60();
            pz40 pz40VarZ = v3c.Z(null, new Object[0], fetVar);
            zcl zclVar4 = qmk.f28987a;
            pz40 pz40VarZ2 = v3c.Z(new ycl(96.0f), new Object[0], fetVar);
            Object[] objArr = new Object[0];
            boolean zG = ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | ((i2 & 57344) == 16384) | fetVar.g(pz40VarZ) | fetVar.h(z3) | fetVar.f(separator60);
            Object objP6 = fetVar.P();
            if (zG || objP6 == obj2) {
                z4 = z3;
                pz40Var = pz40VarZ;
                Object obj3 = new Function0() { // from class: a.ctq
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        mm40 mm40VarL = jm40.b;
                        if (xdrVar != null || xdrVar2 != null || xdrVar3 != null || pz40Var.getValue() != null) {
                            mm40 mm40VarL2 = rq8.L(mm40VarL, new gbc(z4, separator60, (byte) 2));
                            zcl zclVar5 = qmk.f28987a;
                            mm40VarL = s5x0.L(mm40VarL2, 4.0f, 0.0f, 2);
                        }
                        return mrv.k0(o7k0.s(mm40VarL, f2), "TOTAL_CONTENT_ID");
                    }
                };
                fetVar.o0(obj3);
                objP6 = obj3;
            } else {
                z4 = z3;
                pz40Var = pz40VarZ;
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP6, fetVar);
            boolean zG2 = fetVar.g(pz40Var) | fetVar.g(pz40VarZ2);
            Object objP7 = fetVar.P();
            if (zG2 || objP7 == obj2) {
                objP7 = new gtq(pz40Var, pz40VarZ2, (byte) 0);
                fetVar.o0(objP7);
            }
            tj30 tj30Var = (tj30) objP7;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z6 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z6) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30Var, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            y5d y5dVar = y5d.f42040a;
            if (xdrVar == null) {
                fetVar.e0(-883359275);
                fetVar.r(false);
                mw3Var = mw3Var2;
                z5 = false;
                obj = 6;
            } else {
                fetVar.e0(-883359274);
                mm40 mm40VarS = o7k0.s(s5x0.N(mrv.k0(jm40Var, "RED_CARDS_CONTENT_ID"), 0.0f, 0.0f, f, 0.0f, 11), f3);
                x5d x5dVarA = w5d.a(mw3Var2, r19, fetVar, 48);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
                fetVar.i0();
                mw3Var = mw3Var2;
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                obj = r12;
                xdrVar.F(y5dVar, fetVar, obj);
                fetVar.r(true);
                z5 = false;
                fetVar.r(false);
            }
            if (xdrVar2 == null) {
                fetVar.e0(-882942542);
                fetVar.r(z5);
            } else {
                fetVar.e0(-882942541);
                mm40 mm40VarS2 = o7k0.s(s5x0.N(mrv.k0(jm40Var, "YELLOW_CARDS_CONTENT_ID"), 0.0f, 0.0f, f, 0.0f, 11), f3);
                x5d x5dVarA2 = w5d.a(mw3Var, r19, fetVar, 48);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarS2);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar);
                jpm0.o(fetVar, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar4);
                xdrVar2.F(y5dVar, fetVar, obj);
                fetVar.r(true);
                z5 = false;
                fetVar.r(false);
            }
            if (xdrVar3 == null) {
                fetVar.e0(-882527049);
                fetVar.r(z5);
                xdrVar4 = xdrVar3;
            } else {
                fetVar.e0(-882527048);
                mm40 mm40VarS3 = o7k0.s(s5x0.N(mrv.k0(jm40Var, "CORNERS_CONTENT_ID"), 0.0f, 0.0f, f, 0.0f, 11), f3);
                x5d x5dVarA3 = w5d.a(mw3Var, r19, fetVar, 48);
                int iHashCode4 = Long.hashCode(fetVar.T);
                bh90 bh90VarM4 = fetVar.m();
                mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarS3);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA3, shdVar);
                jpm0.o(fetVar, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC3, shdVar4);
                xdrVar4 = xdrVar3;
                xdrVar4.F(y5dVar, fetVar, obj);
                fetVar.r(true);
                fetVar.r(false);
            }
            ugdVar.F(s5x0.N(mrv.k0(jm40Var, "PERIOD_CONTENT_ID"), 0.0f, 0.0f, 4.0f, 0.0f, 11), fetVar, 48);
            mm40 mm40Var2 = (mm40) l7m0VarY.getValue();
            x5d x5dVarA4 = w5d.a(sw3Var, xx7Var, fetVar, 54);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40Var2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA4, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            ugdVar3 = ugdVar2;
            vqd.t(54, ugdVar3, y5dVar, fetVar, true);
            fetVar.r(true);
            z2 = z4;
        } else {
            ugdVar3 = ugdVar2;
            fetVar.X();
            z2 = z;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ecc(mm40Var, z2, xdrVar, xdrVar2, xdrVar4, ugdVar, ugdVar3, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void u(xaa xaaVar, fet fetVar, int i) {
        xbs xbsVar;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        int i2 = xaaVar.f;
        fetVar2.g0(1355302788);
        int i3 = i | (fetVar2.i(xaaVar) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            if ((((int) (((yez) ((rhv0) fetVar2.k(bmd.u))).b() >> 32)) < 411) == true) {
                fetVar2.e0(1322252479);
                zcl zclVar = qmk.f28987a;
                xbsVar = new xbs(328.0f, 162.0f, 128.0f, pkd.b(36.0f, fetVar2), pkd.b(46.0f, fetVar2), 170.0f, pkd.b(58.0f, fetVar2), -pkd.b(4.0f, fetVar2), pkd.b(12.0f, fetVar2), pkd.b(96.0f, fetVar2));
                fetVar2.r(false);
            } else {
                fetVar2.e0(1322836767);
                zcl zclVar2 = qmk.f28987a;
                xbsVar = new xbs(380.0f, 178.0f, 144.0f, pkd.b(44.0f, fetVar2), pkd.b(54.0f, fetVar2), 192.0f, pkd.b(68.0f, fetVar2), pkd.b(4.0f, fetVar2), pkd.b(12.0f, fetVar2), pkd.b(104.0f, fetVar2));
                fetVar2.r(false);
            }
            xbs xbsVar2 = xbsVar;
            List<dna> listJ = q3d.j(new dna(80.0f, xbsVar2.i, xbsVar2.j, 2), new dna(xbsVar2.c, xbsVar2.d, xbsVar2.e, 0), new dna(xbsVar2.f, xbsVar2.g, xbsVar2.h, 1));
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar2.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            String str = xaaVar.c;
            boolean z = i2 - cgk0Var.l() > 1;
            cgk0Var.m(i2);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 8.0f, 0.0f, 8.0f, 8.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC0, shdVar);
            mm40 mm40VarG = o7k0.g(o7k0.s(o2e.e0(jm40Var, "CARD_BASKETBALL_GAME_FIELD"), xbsVar2.f40614a), 0.0f, xbsVar2.b, 1);
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarG, zx7Var);
            zcl zclVar3 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            jm40 jm40Var2 = jm40Var;
            k7x.a(xaaVar.f40544a, null, h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarB), null, null, fetVar2, 48, 2040);
            mm40 mm40VarB2 = jr8Var.b(jm40Var2, zx7Var);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar);
            boolean z3 = false;
            boolean z4 = fetVar2.k(bmd.n) == k6z.f17794a;
            fetVar2.e0(73502279);
            for (dna dnaVar : listJ) {
                String str2 = xaaVar.b;
                float f = dnaVar.f6358a;
                byte b = dnaVar.b;
                eba ebaVar = (eba) CollectionsKt.W(b, xaaVar.d);
                eba ebaVar2 = dba.f5793a;
                if (ebaVar == null) {
                    ebaVar = ebaVar2;
                }
                eba ebaVar3 = (eba) CollectionsKt.W(b, xaaVar.e);
                if (ebaVar3 != null) {
                    ebaVar2 = ebaVar3;
                }
                eba ebaVar4 = ebaVar2;
                fet fetVar3 = fetVar2;
                c(str2, f, ebaVar, ebaVar4, dnaVar.c, dnaVar.d, z4, z, fetVar3, 4608);
                z3 = z3;
                shdVar = shdVar;
                fetVar2 = fetVar3;
                pcyVar = pcyVar;
                jm40Var2 = jm40Var2;
            }
            boolean z5 = z3;
            shd shdVar5 = shdVar;
            jm40 jm40Var3 = jm40Var2;
            pcy pcyVar2 = pcyVar;
            fetVar2.r(z5);
            fetVar2.r(true);
            zcl zclVar4 = qmk.f28987a;
            mm40 mm40VarB3 = jr8Var.b(s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 16.0f, 7), gqw0.h);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, z5 ? 1 : 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarB3);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM3, shdVar3);
            vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar5);
            b(str, fetVar2, z5 ? 1 : 0);
            qxw.o(fetVar2, o7k0.s(jm40Var3, 36.0f));
            b(str, fetVar2, z5 ? 1 : 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jar(xaaVar, i, (byte) 13);
        }
    }

    public static final void v(akw akwVar, Function0 function0, fet fetVar, int i) {
        int i2;
        function0.getClass();
        fetVar.g0(1269202466);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(akwVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            tlb.o(s5x0.L(jm40.b, xfn.a(fetVar).e, 0.0f, 2), new h5n(null, akwVar.d, akwVar.f, akwVar.g, new ue9(akwVar.e), 5), function0, fetVar, (i2 << 3) & 896, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n((Object) akwVar, (Object) function0, i, (byte) 29);
        }
    }

    public static final void w(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-776342790);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 16.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            if (str.length() > 0) {
                fetVar2.e0(1267384499);
                j6n.h(str, oro0.f25744a, null, 0, 0, fetVar2, ((i2 >> 3) & 14) | 48, 28);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1267531532);
                fetVar2.r(false);
            }
            v8q0.a(str2, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, (i2 >> 6) & 14, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var, str, str2, i, (byte) 26);
        }
    }

    public static final void x(mm40 mm40Var, String str, dkk dkkVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(245403568);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(dkkVar) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109);
            jm40 jm40Var = jm40.b;
            v8q0.a(str, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i2 >> 3) & 14, 24960, 110584);
            fetVar2 = fetVar;
            y(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), R.drawable.ic_glyph_cyber_kosti_one, dkkVar.f6234a, dkkVar.b, dkkVar.c, fetVar2, 0, 0);
            y(null, R.drawable.ic_glyph_cyber_kosti_two, dkkVar.d, dkkVar.e, dkkVar.f, fetVar2, 0, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kwm(mm40Var, str, dkkVar, i, (byte) 3);
        }
    }

    public static final void y(mm40 mm40Var, int i, String str, String str2, String str3, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        fet fetVar2 = fetVar;
        fetVar2.g0(1399773365);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2 | (fetVar2.g(mm40Var2) ? 4 : 2);
        }
        int i6 = i4 | (fetVar2.e(i) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.g(str3) ? 16384 : 8192);
        if (fetVar2.U(i6 & 1, (i6 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            if (i5 != 0) {
                mm40Var2 = jm40Var;
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var2, 20.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            mm40 mm40VarN = o7k0.n(jm40Var, 16.0f);
            int i7 = i6 >> 3;
            pm80 pm80VarF = a8k0.F(i, i7 & 14, fetVar2);
            zfn zfnVar = zaq0.b;
            dww.c(pm80VarF, "", mm40VarN, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            F(s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), str, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), false, fetVar, i7 & 112, 8);
            F(s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), str2, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), false, fetVar, (i6 >> 6) & 112, 8);
            fetVar2 = fetVar;
            F(s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), str3, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), true, fetVar2, ((i6 >> 9) & 112) | 3072, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lwm(mm40Var2, i, str, str2, str3, i2, i3, (byte) 2);
        }
    }

    public static final void z(mm40 mm40Var, mpm mpmVar, boolean z, fet fetVar, int i) {
        fetVar.g0(-1307991553);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(mpmVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 56.0f);
            tj30 tj30VarC = zq8.c(gqw0.h, false);
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
            n4c.l(null, mpmVar, z, fetVar, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uwm(mm40Var, mpmVar, z, i, (byte) 0);
        }
    }
}
