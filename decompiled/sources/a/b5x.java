package a;

import android.gov.nist.core.Separators;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.limits_kenya.api.domain.LimitKenyaGroupEnum;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.BonusStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CitizenshipStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CityStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CountryStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CurrencyStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.DocumentStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.PhoneStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.RegionStateModel;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class b5x {
    public static byte[][] A(Parcel parcel, int i) {
        int iZ = Z(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        int i2 = parcel.readInt();
        byte[][] bArr = new byte[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iZ);
        return bArr;
    }

    public static int[] B(Parcel parcel, int i) {
        int iZ = Z(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iZ);
        return iArrCreateIntArray;
    }

    public static Parcelable C(Parcel parcel, int i, Parcelable.Creator creator) {
        int iZ = Z(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iZ);
        return parcelable;
    }

    public static String D(Parcel parcel, int i) {
        int iZ = Z(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iZ);
        return string;
    }

    public static ArrayList E(Parcel parcel, int i) {
        int iZ = Z(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iZ);
        return arrayListCreateStringArrayList;
    }

    public static Object[] F(Parcel parcel, int i, Parcelable.Creator creator) {
        int iZ = Z(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iZ);
        return objArrCreateTypedArray;
    }

    public static ArrayList G(Parcel parcel, int i, Parcelable.Creator creator) {
        int iZ = Z(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iZ);
        return arrayListCreateTypedArrayList;
    }

    public static void H(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new ctg0(b1j.h(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }

    public static final boolean I(long j, long j2) {
        return j == j2;
    }

    public static final List J(Map map) {
        return CollectionsKt.A0(r3d.r(map.values()), new mjf0((byte) 7));
    }

    public static final boolean K(urp urpVar) {
        return !Intrinsics.d(urpVar, jrp.f17014a) && Intrinsics.d(urpVar, lrp.f20544a);
    }

    public static final float L(Layout layout, int i, Paint paint) {
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = c9q0.f3974a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : a5x.f293a[paragraphAlignment.ordinal()]) == 1) {
            return rw2.z(layout.getWidth(), fMeasureText, 2.0f, Math.abs(lineLeft));
        }
        return (layout.getWidth() - fMeasureText) + Math.abs(lineLeft);
    }

    public static final float M(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = c9q0.f3974a;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? a5x.f293a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final String N(urp urpVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        if (Intrinsics.d(urpVar, krp.f18777a)) {
            return ctf0Var.b.a(R.string.required_field_error, Arrays.copyOf(new Object[0], 0));
        }
        if (Intrinsics.d(urpVar, orp.f25745a)) {
            return ctf0Var.b.a(R.string.passwords_is_incorrect, Arrays.copyOf(new Object[0], 0));
        }
        if (urpVar instanceof mrp) {
            return ctf0Var.b.a(R.string.password_requirements_not_satisfied, Arrays.copyOf(new Object[0], 0));
        }
        if (Intrinsics.d(urpVar, nrp.f24014a)) {
            return ctf0Var.b.a(R.string.does_not_meet_the_requirements_error, Arrays.copyOf(new Object[0], 0));
        }
        if (urpVar instanceof qrp) {
            String str = ((qrp) urpVar).f29221a;
            return str.length() == 0 ? ctf0Var.b.a(R.string.error_range, Arrays.copyOf(new Object[0], 0)) : str;
        }
        if (urpVar instanceof rrp) {
            return ctf0Var.b.a(R.string.enter_corr_email, Arrays.copyOf(new Object[0], 0));
        }
        if (Intrinsics.d(urpVar, trp.f34429a)) {
            return ctf0Var.b.a(R.string.registration_promocode_validation_error, Arrays.copyOf(new Object[0], 0));
        }
        if (Intrinsics.d(urpVar, srp.f32690a)) {
            return ctf0Var.b.a(R.string.incorrect_number, Arrays.copyOf(new Object[0], 0));
        }
        return Intrinsics.d(urpVar, prp.f27476a) ? ctf0Var.b.a(R.string.choose_social_network, Arrays.copyOf(new Object[0], 0)) : "";
    }

    public static final LimitKenyaGroupEnum O(vrz vrzVar) {
        if (vrzVar instanceof fe7) {
            return LimitKenyaGroupEnum.f46749a;
        }
        if (vrzVar instanceof n7k) {
            return LimitKenyaGroupEnum.b;
        }
        return vrzVar instanceof liq0 ? LimitKenyaGroupEnum.c : LimitKenyaGroupEnum.d;
    }

    public static final String P(long j) {
        return String.format(Locale.ENGLISH, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }

    public static final yjj0 Q(boolean z) {
        if (!z) {
            return jd8.n;
        }
        zcl zclVar = qmk.f28987a;
        return vgg0.c(0.0f, 0.0f, 12.0f, 12.0f, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    public static final ufp0 R(y6p0 y6p0Var) {
        ?? arrayList;
        y6p0Var.getClass();
        String str = y6p0Var.f42110a;
        String str2 = y6p0Var.b;
        String str3 = y6p0Var.c;
        List<y6p0> list = y6p0Var.d;
        if (list.isEmpty()) {
            arrayList = kotlin.collections.a.c(new y3n0(y6p0Var.b, y6p0Var.c));
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (y6p0 y6p0Var2 : list) {
                y6p0Var2.getClass();
                arrayList.add(new y3n0(y6p0Var2.b, y6p0Var2.c));
            }
        }
        return new ufp0(0, str, str2, str3, arrayList);
    }

    public static final itl S(String str, sul sulVar, jtl jtlVar) {
        return new itl(new wul(sulVar, oe9.f25112a, new ue9(str), true, false, false), jtlVar);
    }

    public static boolean T(Parcel parcel, int i) {
        j0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean U(Parcel parcel, int i) {
        int iZ = Z(parcel, i);
        if (iZ == 0) {
            return null;
        }
        k0(parcel, iZ, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static IBinder V(Parcel parcel, int i) {
        int iZ = Z(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iZ);
        return strongBinder;
    }

    public static int W(Parcel parcel, int i) {
        j0(parcel, i, 4);
        return parcel.readInt();
    }

    public static long X(Parcel parcel, int i) {
        j0(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long Y(Parcel parcel, int i) {
        int iZ = Z(parcel, i);
        if (iZ == 0) {
            return null;
        }
        k0(parcel, iZ, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int Z(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1317841309);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            ibc.A(mm40Var, 8.0f, hew0.d, fetVar, (i2 & 14) | 384);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i, (byte) 19);
        }
    }

    public static final boolean a0(String str, String str2) {
        str2.getClass();
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{Separators.SLASH, Separators.SP}, false, 0, 6, null);
        if (listSplit$default == null || !listSplit$default.isEmpty()) {
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                if (kotlin.text.c.x((String) it.next(), str2, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(177587636);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 5;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 18.0f);
            pz40 pz40Var = s6t0.f31722a;
            j0x.b(iom0.r(jpm0.t(R.drawable.ic_glyph_eachway, 6, fetVar), fetVar), null, i120.Q(mm40VarN, s6t0.b().f33626a.getCommerce(), vgg0.f37379a), null, null, 0.0f, new m78(s6t0.b().f33626a.getCommerceForeground(), 5), fetVar, 56, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, b);
        }
    }

    public static void b0(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + Z(parcel, i));
    }

    public static final void c(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(236958632);
        if (fetVar.U(i & 1, i != 0)) {
            int iB = 0;
            while (iB < 3) {
                mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(s5x0.L(mm40VarD, qmk.a(fetVar).c, 0.0f, 2), 200.0f);
                zcl zclVar2 = qmk.f;
                ugg0 ugg0Var = vgg0.f37379a;
                iB = h97.b(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, 0, iB, 1);
            }
            fetVar2 = fetVar;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vtf0(i, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    public static final nas c0(ck00 ck00Var, sip sipVar, String str, Long l, Integer num) {
        ArrayList arrayList;
        long jLongValue;
        String str2;
        Long l2;
        Long l3;
        ck00Var.getClass();
        sipVar.getClass();
        Long l4 = ck00Var.f4484a;
        ua30 ua30Var = ck00Var.H;
        lfu0 lfu0Var = ck00Var.G;
        long jLongValue2 = l4 != null ? l4.longValue() : 0L;
        Long l5 = ck00Var.c;
        long jLongValue3 = l5 != null ? l5.longValue() : 0L;
        Long l6 = ck00Var.s;
        String str3 = ck00Var.j;
        String str4 = ck00Var.m;
        String str5 = ck00Var.h;
        String str6 = lfu0Var != null ? lfu0Var.b : null;
        Integer num2 = ck00Var.y;
        String str7 = ck00Var.l;
        long jLongValue4 = 0;
        Integer num3 = ck00Var.b;
        Boolean bool = ck00Var.w;
        String str8 = ck00Var.e;
        iun iunVar = iun.f15405a;
        List list = ck00Var.F;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                arrayList2.add(e3c.K((tdo) it.next(), sipVar));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        h6h0 h6h0Var = ck00Var.J;
        tas tasVarK = h6h0Var != null ? tfx.K(h6h0Var) : null;
        oas oasVarL0 = ucx.l0(ck00Var.C);
        oas oasVarL1 = ucx.l0(ck00Var.D);
        Long l7 = ck00Var.f;
        if (l7 != null) {
            jLongValue = l7.longValue() - (System.currentTimeMillis() / 1000);
            if (jLongValue <= 0) {
                jLongValue = 0;
            }
        } else {
            jLongValue = 0;
        }
        okl0 okl0Var = ck00Var.B;
        long jLongValue5 = (okl0Var == null || (l3 = okl0Var.f25410a) == null) ? 0L : l3.longValue();
        okl0 okl0Var2 = ck00Var.z;
        if (okl0Var2 != null && (l2 = okl0Var2.f25410a) != null) {
            jLongValue4 = l2.longValue();
        }
        long j = jLongValue4;
        ufs ufsVarR = ua30Var != null ? qxw.R(ua30Var) : null;
        Boolean bool2 = ck00Var.x;
        Boolean bool3 = ck00Var.I;
        Long lValueOf = (ua30Var == null || (str2 = ua30Var.m) == null) ? null : Long.valueOf(Long.parseLong(str2));
        Boolean bool4 = ck00Var.p;
        Integer num4 = ck00Var.q;
        boolean zD = Intrinsics.d(ck00Var.v, Boolean.TRUE);
        nem0 nem0Var = ck00Var.L;
        String str9 = nem0Var != null ? nem0Var.f23392a : null;
        q480 q480Var = ck00Var.E;
        String str10 = q480Var != null ? q480Var.f28085a : null;
        Boolean bool5 = lfu0Var != null ? lfu0Var.f19976a : null;
        boh.b.getClass();
        boh bohVarC = qud.c(num);
        Long l8 = ck00Var.g;
        return new nas(jLongValue2, jLongValue3, l6, str3, str4, str5, str6, bool5, num2, str7, num3, bool, str8, null, iunVar, arrayList, l, sipVar, str, tasVarK, l7, Long.valueOf(jLongValue), Long.valueOf(jLongValue5), j, oasVarL0, oasVarL1, zD, null, ufsVarR, bool2, bool3, lValueOf, bool4, num4, str9, str10, bohVarC, l8 != null ? Integer.valueOf((int) l8.longValue()) : null);
    }

    public static final void d(eoh eohVar, Function1 function1, fet fetVar, int i) {
        int i2;
        function1.getClass();
        fetVar.g0(1648829385);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(eohVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar));
            boolean z = (i2 & 896) == 256;
            int i4 = i2 & 112;
            boolean z2 = (i4 == 32) | z;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new wqv(function1, eohVar, (byte) 17);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            c3x.b(dw9.h(1.0f, s5x0.N(s5x0.L(o7k0.e(jm40Var, 138.0f), 0.0f, 12.0f, 1), 12.0f, 0.0f, 0.0f, 0.0f, 14), true), eohVar, fetVar, i4);
            tke.B(s5x0.N(o7k0.p(jm40Var, 138.0f, 138.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13), eohVar.b, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(eohVar, function1, i);
        }
    }

    public static final j5a0 d0(d280 d280Var, long j, List list, boolean z, cap capVar) {
        return z ? new e5a0(d280Var) : new a5a0(d280Var, j, dub.g0(j, list), capVar);
    }

    public static final void e(mm40 mm40Var, gho ghoVar, fet fetVar, int i) {
        fetVar.g0(772408667);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.e(ghoVar.ordinal()) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = ghoVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                fetVar.e0(-744601121);
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(-744606979);
                l(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw b1j.f(-744609020, fetVar, false);
                }
                fetVar.e0(-744604581);
                b(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k110((byte) 24, i, mm40Var, (Object) ghoVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX WARN: Code duplicated, block: B:12:0x001c A[RETURN] */
    public static final zuc0 e0(String str) {
        for (zuc0 zuc0Var : zuc0.values()) {
            if (zuc0Var.f45004a.equals(str)) {
                if (zuc0Var == null) {
                    return zuc0.PLAIN_LIST;
                }
                return zuc0Var;
            }
        }
        zuc0Var = null;
        if (zuc0Var == null) {
            return zuc0.PLAIN_LIST;
        }
        return zuc0Var;
    }

    public static final void f(mm40 mm40Var, mg30 mg30Var, fet fetVar, int i) {
        byte b;
        fet fetVar2 = fetVar;
        mm40Var.getClass();
        mg30Var.getClass();
        fetVar2.g0(-751324767);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(mg30Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 16.0f, 16.0f, 16.0f, 0.0f, 8);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            jm40 jm40Var = jm40.b;
            v8q0.a(rsm0.w(mg30Var.b, 0, fetVar2), s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), mg30Var.c, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 0, 130040);
            fetVar2 = fetVar;
            if (mg30Var.d) {
                fetVar2.e0(-368156369);
                mbc.o(agi0.f827a, o7k0.d(jm40Var, 1.0f), false, fetVar2, 54, 4);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-368015753);
                fetVar2.r(false);
            }
            b = 1;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba30(mm40Var, mg30Var, i, b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0222  */
    /* JADX WARN: Code duplicated, block: B:133:0x0225  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v13, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r15v11, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.List] */
    public static final g0e0 f0(j0e0 j0e0Var) {
        ?? arrayList;
        syd0 syd0Var;
        ArrayList arrayList2;
        syd0 syd0Var2;
        yvd0 yvd0Var;
        String str;
        String str2;
        ezd0 ezd0Var;
        ezd0 ezd0Var2;
        ?? arrayList3;
        Iterator it;
        List list;
        Integer num = j0e0Var.f15680a;
        int i = -1;
        int iIntValue = num != null ? num.intValue() : -1;
        Long l = j0e0Var.b;
        long jLongValue = l != null ? l.longValue() : -1L;
        Boolean bool = j0e0Var.c;
        boolean z = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        t0e0 t0e0Var = j0e0Var.d;
        k0e0 k0e0VarQ0 = t0e0Var != null ? n6x.q0(t0e0Var) : new k0e0(-1, -1L, "", "");
        t0e0 t0e0Var2 = j0e0Var.e;
        k0e0 k0e0VarQ1 = t0e0Var2 != null ? n6x.q0(t0e0Var2) : new k0e0(-1, -1L, "", "");
        List list2 = j0e0Var.j;
        int i2 = 10;
        if (list2 != null) {
            arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                tzd0 tzd0Var = (tzd0) it2.next();
                tzd0Var.getClass();
                String str3 = tzd0Var.f34799a;
                String str4 = str3 == null ? "" : str3;
                f0e0 f0e0Var = tzd0Var.b;
                yzd0 yzd0VarY = f0e0Var != null ? q5x.Y(f0e0Var) : new yzd0(i, iun.f15405a, z);
                f0e0 f0e0Var2 = tzd0Var.c;
                yzd0 yzd0VarY2 = f0e0Var2 != null ? q5x.Y(f0e0Var2) : new yzd0(i, iun.f15405a, z);
                List<xzd0> list3 = tzd0Var.d;
                if (list3 != null) {
                    arrayList3 = new ArrayList(r3d.q(list3, i2));
                    for (xzd0 xzd0Var : list3) {
                        xzd0Var.getClass();
                        Integer num2 = xzd0Var.f41750a;
                        int iIntValue2 = num2 != null ? num2.intValue() : -1;
                        Integer num3 = xzd0Var.b;
                        arrayList3.add(new uzd0(iIntValue2, num3 != null ? num3.intValue() : -1));
                    }
                } else {
                    arrayList3 = iun.f15405a;
                }
                ?? r20 = arrayList3;
                List<pzd0> list4 = tzd0Var.e;
                if (list4 != null) {
                    ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
                    for (pzd0 pzd0Var : list4) {
                        pzd0Var.getClass();
                        Integer num4 = pzd0Var.f27840a;
                        int iIntValue3 = num4 != null ? num4.intValue() : -1;
                        Integer num5 = pzd0Var.b;
                        int iIntValue4 = num5 != null ? num5.intValue() : -1;
                        Iterator it3 = it2;
                        String str5 = pzd0Var.c;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str6 = pzd0Var.d;
                        if (str6 == null) {
                            str6 = "";
                        }
                        arrayList4.add(new mzd0(iIntValue3, str5, iIntValue4, str6));
                        it2 = it3;
                    }
                    it = it2;
                    list = arrayList4;
                } else {
                    it = it2;
                    list = iun.f15405a;
                }
                arrayList.add(new qzd0(str4, yzd0VarY, yzd0VarY2, r20, list));
                it2 = it;
                i = -1;
                z = false;
                i2 = 10;
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        ?? r10 = arrayList;
        vyd0 vyd0Var = j0e0Var.k;
        if (vyd0Var != null) {
            hzd0 hzd0Var = vyd0Var.f38243a;
            if (hzd0Var != null) {
                ezd0Var = c3x.K(hzd0Var);
            } else {
                iun iunVar = iun.f15405a;
                ezd0Var = new ezd0(-1, -1, -1, -1, iunVar, iunVar);
            }
            hzd0 hzd0Var2 = vyd0Var.b;
            if (hzd0Var2 != null) {
                ezd0Var2 = c3x.K(hzd0Var2);
            } else {
                iun iunVar2 = iun.f15405a;
                ezd0Var2 = new ezd0(-1, -1, -1, -1, iunVar2, iunVar2);
            }
            syd0Var = new syd0(ezd0Var, ezd0Var2);
        } else {
            iun iunVar3 = iun.f15405a;
            syd0Var = new syd0(new ezd0(-1, -1, -1, -1, iunVar3, iunVar3), new ezd0(-1, -1, -1, -1, iunVar3, iunVar3));
        }
        List list5 = j0e0Var.l;
        if (list5 != null) {
            arrayList2 = new ArrayList(r3d.q(list5, 10));
            Iterator it4 = list5.iterator();
            while (it4.hasNext()) {
                lzd0 lzd0Var = (lzd0) it4.next();
                lzd0Var.getClass();
                Integer num6 = lzd0Var.f20900a;
                int iIntValue5 = num6 != null ? num6.intValue() : -1;
                String str7 = lzd0Var.b;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = lzd0Var.c;
                if (str8 == null) {
                    str8 = "";
                }
                Iterator it5 = it4;
                Integer num7 = lzd0Var.d;
                if (num7 == null) {
                    syd0Var2 = syd0Var;
                } else {
                    syd0Var2 = syd0Var;
                    if (num7.intValue() == 1) {
                        yvd0Var = yvd0.b;
                    }
                    yvd0 yvd0Var2 = yvd0Var;
                    str = lzd0Var.e;
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    arrayList2.add(new izd0(iIntValue5, str7, str8, yvd0Var2, str2));
                    it4 = it5;
                    syd0Var = syd0Var2;
                }
                yvd0Var = (num7 != null && num7.intValue() == 2) ? yvd0.c : (num7 != null && num7.intValue() == 3) ? yvd0.d : yvd0.f43313a;
                yvd0 yvd0Var3 = yvd0Var;
                str = lzd0Var.e;
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                arrayList2.add(new izd0(iIntValue5, str7, str8, yvd0Var3, str2));
                it4 = it5;
                syd0Var = syd0Var2;
            }
        } else {
            arrayList2 = null;
        }
        syd0 syd0Var3 = syd0Var;
        List list6 = arrayList2;
        if (arrayList2 == null) {
            list6 = iun.f15405a;
        }
        return new g0e0(iIntValue, jLongValue, zBooleanValue, k0e0VarQ0, k0e0VarQ1, r10, syd0Var3, list6);
    }

    public static final void g(mm40 mm40Var, qa40 qa40Var, Function0 function0, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        k6z k6zVar;
        fet fetVar2 = fetVar;
        qa40Var.getClass();
        function0.getClass();
        fetVar2.g0(-768192705);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar2.g(mm40Var2) ? 4 : 2);
        }
        int i5 = i3 | (fetVar2.g(qa40Var) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i5 & 1, (i5 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i4 != 0 ? jm40Var : mm40Var2;
            zcl zclVar = qmk.f28987a;
            mm40 mm40Var5 = mm40Var4;
            mm40 mm40VarS = o7k0.s(s5x0.N(mm40Var4, 0.0f, 16.0f, 0.0f, 0.0f, 13), 296.0f);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarO = feb.O(i120.Q(mm40VarS, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), function0);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarO);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarL = s5x0.L(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), 12.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            dww.c(a8k0.F(R.drawable.ic_sport_color_dota_97, 0, fetVar2), null, o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 16.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            x7z x7zVar = new x7z(1.0f, true);
            String str = qa40Var.b;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, x7zVar, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            wul wulVar = new wul(mul.e, oe9.d, new se9(R.drawable.ic_glyph_chevron_right_small), true, false, true);
            boolean z2 = (i5 & 896) == 256;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new a2z(function0, (byte) 8);
                fetVar2.o0(objP);
            }
            qzb.n(null, wulVar, (Function0) objP, fetVar2, 0, 1);
            fetVar2.r(true);
            if (qa40Var.f) {
                fetVar2.e0(-1298901424);
                k6zVar = (k6z) fetVar2.k(bmd.n);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1298900500);
                fetVar2.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(535570377, new b120(qa40Var, (byte) 27), fetVar2), fetVar2, 56);
            fetVar2.r(true);
            mm40Var3 = mm40Var5;
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n(mm40Var3, (Object) qa40Var, (Object) function0, i, i2, (byte) 21);
        }
    }

    public static final yvl0 g0(kxl0 kxl0Var) {
        mwl0 mwl0Var = kxl0Var.f19061a;
        if (mwl0Var == null) {
            return new yvl0(-1, "", "", "", "", "", "", "", "", "", "", "", "", "", iun.f15405a);
        }
        String str = mwl0Var.f22510a;
        if (str == null) {
            str = "";
        }
        String str2 = mwl0Var.b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = mwl0Var.c;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = mwl0Var.d;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = mwl0Var.e;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = mwl0Var.f;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = mwl0Var.g;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = mwl0Var.h;
        if (str8 == null) {
            str8 = "";
        }
        String str9 = mwl0Var.i;
        if (str9 == null) {
            str9 = "";
        }
        String str10 = mwl0Var.j;
        if (str10 == null) {
            str10 = "";
        }
        String str11 = mwl0Var.k;
        if (str11 == null) {
            str11 = "";
        }
        String str12 = mwl0Var.l;
        if (str12 == null) {
            str12 = "";
        }
        String str13 = mwl0Var.m;
        if (str13 == null) {
            str13 = "";
        }
        List list = mwl0Var.n;
        if (list == null) {
            list = iun.f15405a;
        }
        List list2 = list;
        Integer num = mwl0Var.o;
        return new yvl0(num != null ? num.intValue() : -1, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, list2);
    }

    public static final void h(rc70 rc70Var, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(-520069853);
        byte b = 2;
        byte b2 = 4;
        int i2 = (fetVar.g(rc70Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            vul vulVar = vul.f38053a;
            wul wulVar = rc70Var.f30224a;
            wul wulVar2 = rc70Var.b;
            wul wulVar3 = rc70Var.c;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ma70(function1, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ma70(function1, (byte) 3);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z3 = i3 == 32;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new ma70(function1, b2);
                fetVar.o0(objP3);
            }
            hkb.j(mm40VarD, wulVar, wulVar2, wulVar3, 0L, function0, function2, (Function0) objP3, fetVar, 6);
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar, o7k0.e(jm40Var, 8.0f));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(rc70Var, function1, i, (byte) 20);
        }
    }

    public static String h0(long j) {
        return axq.h(j, "PointerId(value=", Separators.RPAREN);
    }

    public static final void i(sc70 sc70Var, fet fetVar, int i) {
        fetVar.g0(138918581);
        int i2 = (fetVar.g(sc70Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            kkb.m(s5x0.L(ua80.d(jm40Var, 16.0f, fetVar, jm40Var, 1.0f), 16.0f, 0.0f, 2), sc70Var.f31973a, ro8.c, 0, sc70Var.b, 0L, fetVar, 0, 40);
            qxw.o(fetVar, o7k0.e(jm40Var, 12.0f));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ds60(sc70Var, i, (byte) 9);
        }
    }

    public static int i0(Parcel parcel) {
        int i = parcel.readInt();
        int iZ = Z(parcel, i);
        char c = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new ctg0("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i2 = iZ + iDataPosition;
        if (i2 >= iDataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new ctg0(sb.toString(), parcel);
    }

    public static final void j(tc70 tc70Var, fet fetVar, int i) {
        fetVar.g0(-605388382);
        int i2 = (fetVar.g(tc70Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            wwb.i(s5x0.L(ua80.d(jm40Var, 28.0f, fetVar, jm40Var, 1.0f), 16.0f, 0.0f, 2), tc70Var.f33706a, tc70Var.b, 0, 0L, fetVar, 0, 24);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ds60(tc70Var, i, (byte) 8);
        }
    }

    public static void j0(Parcel parcel, int i, int i2) {
        int iZ = Z(parcel, i);
        if (iZ == i2) {
            return;
        }
        String hexString = Integer.toHexString(iZ);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iZ).length() + 4 + 1);
        rw2.s(i2, iZ, "Expected size ", " got ", sb);
        throw new ctg0(rw2.o(sb, " (0x", hexString, Separators.RPAREN), parcel);
    }

    public static final void k(mm40 mm40Var, pa40 pa40Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1095271572);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(pa40Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            r(pa40Var.f26637a, fetVar2, 0);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarN, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 4.0f);
            String str = pa40Var.b;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarK, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.l(), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba30(mm40Var, pa40Var, i, (byte) 8);
        }
    }

    public static void k0(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        rw2.s(i2, i, "Expected size ", " got ", sb);
        throw new ctg0(rw2.o(sb, " (0x", hexString, Separators.RPAREN), parcel);
    }

    public static final void l(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fet fetVar2;
        fetVar.g0(-709586590);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            j0x.b(iom0.r(jpm0.t(R.drawable.ic_optionbet_glyph, 6, fetVar), fetVar), null, o7k0.n(mm40Var, 18.0f), null, null, 0.0f, null, fetVar2, 56, 120);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, b);
        }
    }

    public static final void m(mm40 mm40Var, pz40 pz40Var, xdr xdrVar, ugd ugdVar, fet fetVar, int i) {
        int i2;
        pz40 pz40Var2;
        yfe0 yfe0VarU;
        dg90 dg90Var;
        fetVar.g0(31021306);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pz40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (((List) pz40Var.getValue()).isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    dg90Var = new dg90(mm40Var, pz40Var, xdrVar, ugdVar, i, (byte) 0);
                }
            } else {
                pz40Var2 = pz40Var;
                xcz xczVarA = ddz.a(q3d.i((List) pz40Var2.getValue()), 0, fetVar, 0, 2);
                Boolean bool = Boolean.TRUE;
                pz40 pz40VarZ = v3c.Z(bool, new Object[0], fetVar);
                pz40 pz40VarZ2 = v3c.Z(bool, new Object[0], fetVar);
                pz40 pz40VarA0 = v3c.a0(0, new Object[0], fetVar, 6);
                boolean zG = fetVar.g(xczVarA) | fetVar.g(pz40VarA0);
                Object objP = fetVar.P();
                Object obj = ukd.f35823a;
                yje yjeVar = null;
                if (zG || objP == obj) {
                    objP = new bz0(xczVarA, pz40VarA0, yjeVar, (byte) 7);
                    fetVar.o0(objP);
                }
                m0x0.t(fetVar, xczVarA, (Function2) objP);
                boolean zG2 = fetVar.g(xczVarA) | fetVar.g(pz40VarZ) | fetVar.g(pz40VarZ2);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj) {
                    objP2 = new rf30(xczVarA, pz40VarZ, pz40VarZ2, yjeVar, (byte) 8);
                    fetVar.o0(objP2);
                }
                m0x0.t(fetVar, xczVarA, (Function2) objP2);
                boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
                Object objP3 = fetVar.P();
                if (z || objP3 == obj) {
                    objP3 = new eg90(pz40Var2, xdrVar, ugdVar, (byte) 0);
                    fetVar.o0(objP3);
                }
                b8k0.f(mm40Var, xczVarA, null, false, null, null, null, false, null, (Function1) objP3, fetVar, (i2 & 14) | 100663296, 252);
            }
            yfe0VarU.d = dg90Var;
        }
        pz40Var2 = pz40Var;
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            dg90Var = new dg90(mm40Var, pz40Var2, xdrVar, ugdVar, i, (byte) 4);
            yfe0VarU.d = dg90Var;
        }
    }

    public static final void n(mm40 mm40Var, hvb0 hvb0Var, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        function1.getClass();
        fetVar.g0(1311136228);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(hvb0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var2 = jm40Var;
            }
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(i120.Q(mm40VarD, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 0.0f, 4.0f, 0.0f, 0.0f, 13), "PREVIOUS_MAPS");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(422876882);
            for (xls xlsVar : hvb0Var.f13720a) {
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 0.0f, 4.0f, 4.0f, 2);
                Object objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (objP == obj) {
                    objP = dw9.j(fetVar);
                }
                gy40 gy40Var = (gy40) objP;
                boolean zG = ((i3 & 896) == 256) | fetVar.g(xlsVar);
                Object objP2 = fetVar.P();
                if (zG || objP2 == obj) {
                    objP2 = new gvb0(function1, xlsVar, b);
                    fetVar.o0(objP2);
                }
                unh0.Y(0, xlsVar, fetVar, y860.W(mm40VarN, gy40Var, null, false, null, (Function0) objP2, 28));
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        mm40 mm40Var3 = mm40Var2;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040(mm40Var3, (Object) hvb0Var, (Object) function1, i, i2, (byte) 8);
        }
    }

    public static final void o(int i, fet fetVar) {
        fetVar.g0(-2046215792);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).c;
            jm40 jm40Var = jm40.b;
            btm0.k(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), u1c.M(-982131700, new ev90(s5x0.N(jm40Var, f, 0.0f, 0.0f, 0.0f, 14)), fetVar), fetVar, 384, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vtf0(i, (byte) 9);
        }
    }

    public static final void p(mm40 mm40Var, k5a0 k5a0Var, w6n w6nVar, Function2 function2, fet fetVar, int i, int i2) {
        ugd ugdVarM;
        w6nVar.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        if ((i2 & 8) != 0) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new ogj0((byte) 25);
                fetVar.o0(objP);
            }
            function2 = (Function2) objP;
        }
        byte b = 2;
        ugd ugdVarM2 = u1c.M(-1623492714, new xm80(k5a0Var, w6nVar, b), fetVar);
        if (k5a0Var instanceof b5a0) {
            fetVar.e0(295281894);
            ugdVarM = u1c.M(1009255549, new zm80(w6nVar, k5a0Var, function2, b), fetVar);
            fetVar.r(false);
        } else {
            if (!(k5a0Var instanceof f5a0)) {
                throw b1j.f(1810638317, fetVar, false);
            }
            fetVar.e0(295906512);
            fetVar.r(false);
            ugdVarM = null;
        }
        c3x.i(mm40Var, ugdVarM2, ugdVarM, fetVar, (i & 14) | 48, 0);
    }

    public static final void q(mm40 mm40Var, eok0 eok0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        float f;
        eok0Var.getClass();
        function1.getClass();
        fetVar.g0(1017564755);
        int i2 = i | 6 | (fetVar.g(eok0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            float f2 = qmk.a(fetVar).e;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, f2, 0.0f, 2), 1.0f);
            int iOrdinal = eok0Var.c.ordinal();
            if (iOrdinal == 0) {
                f = 8.0f;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                f = 4.0f;
            }
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, f, 0.0f, 0.0f, 13);
            hjm hjmVar = eok0Var.f8143a;
            kjm kjmVar = kjm.f18392a;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new o0k0((Object) eok0Var, (Object) function1, (byte) 7);
                fetVar.o0(objP);
            }
            nkb.h(mm40VarN, hjmVar, kjmVar, null, (Function0) objP, null, fetVar, 384, 40);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var2, eok0Var, function1, i, (byte) 8);
        }
    }

    public static final void r(o0x o0xVar, fet fetVar, int i) {
        fetVar.g0(-2027599044);
        byte b = 2;
        int i2 = (fetVar.g(o0xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 32.0f);
            zfn zfnVar = zaq0.b;
            long secondary10 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary10();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN, secondary10, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            uc9.c(lgb.J(s5x0.J(i120.Q(o7k0.p(jm40Var, 32.0f, 32.0f), ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n), 4.0f), vgg0.a(12.0f)), o7k0.n(jm40Var, 24.0f), o0xVar, Integer.valueOf(R.drawable.ic_glyph_circle_globe), new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary60()), null, null, gqw0.B, null, fetVar, ((i2 << 6) & 896) | 12582912, 352);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o9b(o0xVar, i, b);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static final void s(a.ena r52, a.ctf0 r53, java.util.ArrayList r54, a.ymq0 r55, a.bg30 r56, boolean r57, boolean r58, a.dja r59, boolean r60, java.util.List r61, long r62, a.ui9 r64, a.anq0 r65, boolean r66, java.util.List r67) {
        /*
            Method dump skipped, instruction units count: 4290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b5x.s(a.ena, a.ctf0, java.util.ArrayList, a.ymq0, a.bg30, boolean, boolean, a.dja, boolean, java.util.List, long, a.ui9, a.anq0, boolean, java.util.List):void");
    }

    public static final void t(lc00 lc00Var, List list, m9s m9sVar, ctf0 ctf0Var) {
        String strH;
        list.getClass();
        m9sVar.getClass();
        ctf0Var.getClass();
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        lsm0 lsm0Var = ctf0Var.b;
        qr40 qr40Var = new qr40(lsm0Var.a(R.string.round, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.time, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.mortal_kombat_finishing_off, Arrays.copyOf(new Object[0], 0)), new sr40(lsm0Var.a(R.string.win, Arrays.copyOf(new Object[0], 0))));
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            mr40 mr40Var = (mr40) obj;
            String strE = ua80.e(i2, "\u2066№", "\u2069");
            long j = mr40Var.d;
            vr40 vr40Var = mr40Var.f;
            if (znq0.g(j) >= 3600) {
                strH = "-";
            } else {
                rdj rdjVar = rdj.f30294a;
                strH = rdj.h(new znq0(mr40Var.d), ykq0.UNIQUE_2, Boolean.TRUE, null, 248);
            }
            String str = mr40Var.e;
            String str2 = (String) CollectionsKt.firstOrNull(m9sVar.m);
            if (str2 == null) {
                str2 = "";
            }
            String strT = vsm0.t(str2);
            String str3 = (String) CollectionsKt.firstOrNull(m9sVar.n);
            arrayList.add(new qr40(strE, strH, str, new tr40(vr40Var == vr40.f37881a ? kkg.H : StaticColors.INSTANCE.m126getWhite200d7_KjU(), vr40Var == vr40.b ? kkg.H : StaticColors.INSTANCE.m126getWhite200d7_KjU(), strT, vsm0.t(str3 != null ? str3 : ""))));
            i = i2;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(qr40Var);
        lc00VarB.addAll(arrayList);
        lc00Var.add(new rr40(dyb.o0(kotlin.collections.a.a(lc00VarB))));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:339:0x098b  */
    /* JADX WARN: Code duplicated, block: B:340:0x098d  */
    public static final void u(lc00 lc00Var, ctf0 ctf0Var, ArrayList arrayList, Map map, Map map2, Map map3, q1f0 q1f0Var, List list, boolean z) {
        Object obj;
        Object objPrevious;
        Object objPrevious2;
        Iterator it;
        CitizenshipStateModel citizenshipStateModel;
        DocumentStateModel documentStateModel;
        CountryStateModel countryStateModel;
        Map map4;
        boolean z2;
        zmm ymmVar;
        String str;
        Map map5 = map3;
        RegionStateModel regionStateModel = q1f0Var.v;
        DocumentStateModel documentStateModel2 = q1f0Var.j;
        CitizenshipStateModel citizenshipStateModel2 = q1f0Var.o;
        CountryStateModel countryStateModel2 = q1f0Var.g;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            q0f0 q0f0Var = (q0f0) it2.next();
            if (q0f0Var == null) {
                regionStateModel = regionStateModel;
                citizenshipStateModel = citizenshipStateModel2;
                countryStateModel2 = countryStateModel2;
                it = it2;
                map4 = map5;
                documentStateModel2 = documentStateModel2;
            } else {
                String strN = "";
                if (q0f0Var instanceof gze0) {
                    gze0 gze0Var = (gze0) q0f0Var;
                    ctf0Var.getClass();
                    u0f0 u0f0Var = u0f0.s;
                    String strN2 = N((urp) map.get(u0f0Var), ctf0Var);
                    String str2 = q1f0Var.f27950a;
                    String str3 = str2 == null ? "" : str2;
                    it = it2;
                    String strN3 = ua80.n(new Object[0], 0, ctf0Var.b, R.string.address, gze0Var.c);
                    oie.f25306a.getClass();
                    c6q0 c6q0VarY = xvw.y(str3, strN3, true, strN2, mie.f, 3);
                    j3x j3xVar = (j3x) map2.get(u0f0Var);
                    Boolean bool = (Boolean) map5.get(u0f0Var);
                    lc00Var.add(new izj0(u0f0Var, c6q0VarY, j3xVar, bool != null ? bool.booleanValue() : false));
                } else {
                    it = it2;
                    boolean z3 = q0f0Var instanceof jze0;
                    e6q0 e6q0Var = e6q0.f7299a;
                    if (z3) {
                        jze0 jze0Var = (jze0) q0f0Var;
                        ctf0Var.getClass();
                        boolean z4 = q1f0Var.H;
                        if (z4) {
                            BonusStateModel bonusStateModel = q1f0Var.c;
                            String str4 = bonusStateModel != null ? bonusStateModel.b : null;
                            if (str4 == null) {
                                str = "";
                            } else {
                                str = str4;
                            }
                        } else {
                            str = "";
                        }
                        u0f0 u0f0Var2 = u0f0.f34852a;
                        lc00Var.add(new he8(new c6q0(str, e6q0Var, g6q0.f10780a, new s7q0(""), z4, false, null, ua80.n(new Object[0], 0, ctf0Var.b, R.string.bonus, jze0Var.c), null, false, 0, null, 261504)));
                    } else {
                        regionStateModel = regionStateModel;
                        if (q0f0Var instanceof kze0) {
                            kze0 kze0Var = (kze0) q0f0Var;
                            ctf0Var.getClass();
                            u0f0 u0f0Var3 = u0f0.o;
                            String strN4 = N((urp) map.get(u0f0Var3), ctf0Var);
                            String str5 = citizenshipStateModel2 != null ? citizenshipStateModel2.b : null;
                            citizenshipStateModel = citizenshipStateModel2;
                            lc00Var.add(new l9q0(u0f0Var3, o5n0.m(str5 != null ? str5 : "", ua80.n(new Object[0], 0, ctf0Var.b, R.string.reg_nationality_x, kze0Var.c), strN4, true)));
                        } else {
                            citizenshipStateModel = citizenshipStateModel2;
                            if (q0f0Var instanceof lze0) {
                                lze0 lze0Var = (lze0) q0f0Var;
                                ctf0Var.getClass();
                                u0f0 u0f0Var4 = u0f0.f;
                                String strN5 = N((urp) map.get(u0f0Var4), ctf0Var);
                                CityStateModel cityStateModel = q1f0Var.d;
                                String str6 = cityStateModel != null ? cityStateModel.b : null;
                                lc00Var.add(new l9q0(u0f0Var4, o5n0.m(str6 != null ? str6 : "", ua80.n(new Object[0], 0, ctf0Var.b, R.string.reg_city, lze0Var.c), strN5, regionStateModel != null)));
                            } else if (q0f0Var instanceof nze0) {
                                nze0 nze0Var = (nze0) q0f0Var;
                                ctf0Var.getClass();
                                u0f0 u0f0Var5 = u0f0.d;
                                String strN6 = N((urp) map.get(u0f0Var5), ctf0Var);
                                String str7 = countryStateModel2 != null ? countryStateModel2.b : null;
                                lc00Var.add(new l9q0(u0f0Var5, o5n0.m(str7 != null ? str7 : "", ua80.n(new Object[0], 0, ctf0Var.b, R.string.reg_country_x, nze0Var.c), strN6, true)));
                            } else if (q0f0Var instanceof oze0) {
                                oze0 oze0Var = (oze0) q0f0Var;
                                ctf0Var.getClass();
                                u0f0 u0f0Var6 = u0f0.i;
                                String strN7 = N((urp) map.get(u0f0Var6), ctf0Var);
                                CurrencyStateModel currencyStateModel = q1f0Var.h;
                                if (currencyStateModel != null) {
                                    String str8 = currencyStateModel.c;
                                    strN = ohs0.n(currencyStateModel.b, str8.length() > 0 ? kng0.l(" (", str8, Separators.RPAREN) : "");
                                }
                                lc00Var.add(new l9q0(u0f0Var6, o5n0.m(strN, ua80.n(new Object[0], 0, ctf0Var.b, R.string.currency, oze0Var.c), strN7, countryStateModel2 != null)));
                            } else if (q0f0Var instanceof pze0) {
                                ctf0Var.getClass();
                                u0f0 u0f0Var7 = u0f0.g;
                                lc00Var.add(new l9q0(u0f0Var7, o5n0.m(o5n0.o(q1f0Var.i), ua80.n(new Object[0], 0, ctf0Var.b, R.string.reg_date, ((pze0) q0f0Var).c), N((urp) map.get(u0f0Var7), ctf0Var), true)));
                            } else if (q0f0Var instanceof qze0) {
                                qze0 qze0Var = (qze0) q0f0Var;
                                ctf0Var.getClass();
                                u0f0 u0f0Var8 = u0f0.p;
                                String strN8 = N((urp) map.get(u0f0Var8), ctf0Var);
                                String str9 = documentStateModel2 != null ? documentStateModel2.b : null;
                                lc00Var.add(new l9q0(u0f0Var8, o5n0.m(str9 != null ? str9 : "", ua80.n(new Object[0], 0, ctf0Var.b, R.string.document_type, qze0Var.c), strN8, citizenshipStateModel != null)));
                            } else if (q0f0Var instanceof rze0) {
                                rze0 rze0Var = (rze0) q0f0Var;
                                ctf0Var.getClass();
                                u0f0 u0f0Var9 = u0f0.k;
                                String strN9 = N((urp) map.get(u0f0Var9), ctf0Var);
                                String str10 = q1f0Var.k;
                                String str11 = str10 == null ? "" : str10;
                                String strN10 = ua80.n(new Object[0], 0, ctf0Var.b, R.string.email_title_new, rze0Var.c);
                                oie.f25306a.getClass();
                                c6q0 c6q0VarY2 = xvw.y(str11, strN10, true, strN9, mie.d, 0);
                                j3x j3xVar2 = (j3x) map2.get(u0f0Var9);
                                Boolean bool2 = (Boolean) map5.get(u0f0Var9);
                                lc00Var.add(new izj0(u0f0Var9, c6q0VarY2, j3xVar2, bool2 != null ? bool2.booleanValue() : false));
                            } else if (q0f0Var instanceof sze0) {
                                sze0 sze0Var = (sze0) q0f0Var;
                                ctf0Var.getClass();
                                u0f0 u0f0Var10 = u0f0.c;
                                String strN11 = N((urp) map.get(u0f0Var10), ctf0Var);
                                String str12 = q1f0Var.l;
                                String str13 = str12 == null ? "" : str12;
                                String strN12 = ua80.n(new Object[0], 0, ctf0Var.b, R.string.reg_user_name_x, sze0Var.c);
                                oie.f25306a.getClass();
                                c6q0 c6q0VarY3 = xvw.y(str13, strN12, true, strN11, mie.h, 2);
                                j3x j3xVar3 = (j3x) map2.get(u0f0Var10);
                                Boolean bool3 = (Boolean) map5.get(u0f0Var10);
                                lc00Var.add(new izj0(u0f0Var10, c6q0VarY3, j3xVar3, bool3 != null ? bool3.booleanValue() : false));
                            } else {
                                if (q0f0Var instanceof tze0) {
                                    tze0 tze0Var = (tze0) q0f0Var;
                                    ctf0Var.getClass();
                                    Integer num = q1f0Var.F;
                                    Object obj2 = u0f0.r;
                                    pek pekVar = hgt.b;
                                    lsm0 lsm0Var = ctf0Var.b;
                                    documentStateModel = documentStateModel2;
                                    countryStateModel = countryStateModel2;
                                    a4x a4xVarO0 = dyb.o0(q3d.j(new lxl(1L, (dyl) new ayl(lsm0Var.a(R.string.male, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_male, null, 6), null, 28), false, (num != null && num.intValue() == 1) ? uxl.b : uxl.f36445a, (cwl) null, 108), new lxl(2L, (dyl) new ayl(lsm0Var.a(R.string.female, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_female, null, 6), null, 28), false, (num != null && num.intValue() == 2) ? uxl.b : uxl.f36445a, (cwl) null, 108)));
                                    zcl zclVar = qmk.f28987a;
                                    lh80 lh80VarT = s5x0.t(0.0f, 0.0f, 2);
                                    pz40 pz40Var = s6t0.f31722a;
                                    lc00Var.add(new egt(ua80.n(new Object[0], 0, lsm0Var, R.string.sex_title, tze0Var.c), new fyl(a4xVarO0, null, null, lh80VarT, new jyl(null, new y3d(s6t0.b().f33626a.getPrimaryForeground()), new y3d(s6t0.b().f33626a.getSecondary()), 87), 6), Intrinsics.d((urp) map.get(obj2), krp.f18777a)));
                                    map4 = map3;
                                } else {
                                    documentStateModel = documentStateModel2;
                                    countryStateModel = countryStateModel2;
                                    if (q0f0Var instanceof uze0) {
                                        uze0 uze0Var = (uze0) q0f0Var;
                                        ctf0Var.getClass();
                                        u0f0 u0f0Var11 = u0f0.f34852a;
                                        String strN13 = N((urp) map.get(u0f0Var11), ctf0Var);
                                        String str14 = q1f0Var.m;
                                        String str15 = str14 == null ? "" : str14;
                                        String strN14 = ua80.n(new Object[0], 0, ctf0Var.b, R.string.reg_user_second_name_x, uze0Var.c);
                                        oie.f25306a.getClass();
                                        c6q0 c6q0VarY4 = xvw.y(str15, strN14, true, strN13, mie.i, 2);
                                        j3x j3xVar4 = (j3x) map2.get(u0f0Var11);
                                        map4 = map3;
                                        Boolean bool4 = (Boolean) map4.get(u0f0Var11);
                                        lc00Var.add(new izj0(u0f0Var11, c6q0VarY4, j3xVar4, bool4 != null ? bool4.booleanValue() : false));
                                    } else {
                                        map4 = map3;
                                        if (q0f0Var instanceof wze0) {
                                            wze0 wze0Var = (wze0) q0f0Var;
                                            ctf0Var.getClass();
                                            u0f0 u0f0Var12 = u0f0.Y;
                                            String strN15 = N((urp) map.get(u0f0Var12), ctf0Var);
                                            String str16 = q1f0Var.n;
                                            String str17 = str16 == null ? "" : str16;
                                            String strN16 = ua80.n(new Object[0], 0, ctf0Var.b, R.string.reg_user_middle_name_x, wze0Var.c);
                                            oie.f25306a.getClass();
                                            c6q0 c6q0VarY5 = xvw.y(str17, strN16, true, strN15, mie.j, 2);
                                            j3x j3xVar5 = (j3x) map2.get(u0f0Var12);
                                            Boolean bool5 = (Boolean) map4.get(u0f0Var12);
                                            lc00Var.add(new izj0(u0f0Var12, c6q0VarY5, j3xVar5, bool5 != null ? bool5.booleanValue() : false));
                                        } else if (q0f0Var instanceof a0f0) {
                                            a0f0 a0f0Var = (a0f0) q0f0Var;
                                            ctf0Var.getClass();
                                            u0f0 u0f0Var13 = u0f0.q;
                                            String strN17 = N((urp) map.get(u0f0Var13), ctf0Var);
                                            String str18 = q1f0Var.p;
                                            c6q0 c6q0VarY6 = xvw.y(str18 == null ? "" : str18, ua80.n(new Object[0], 0, ctf0Var.b, R.string.document_number_new, a0f0Var.c), citizenshipStateModel != null, strN17, null, 3);
                                            j3x j3xVar6 = (j3x) map2.get(u0f0Var13);
                                            Boolean bool6 = (Boolean) map4.get(u0f0Var13);
                                            lc00Var.add(new izj0(u0f0Var13, c6q0VarY6, j3xVar6, bool6 != null ? bool6.booleanValue() : false));
                                        } else {
                                            boolean z5 = q0f0Var instanceof b0f0;
                                            i6q0 i6q0Var = i6q0.f14254a;
                                            if (z5) {
                                                b0f0 b0f0Var = (b0f0) q0f0Var;
                                                ctf0Var.getClass();
                                                u0f0 u0f0Var14 = u0f0.l;
                                                String strN18 = N((urp) map.get(u0f0Var14), ctf0Var);
                                                s7q0 s7q0Var = strN18.length() > 0 ? new s7q0(strN18) : new s7q0("");
                                                String str19 = q1f0Var.q;
                                                c6q0 c6q0Var = new c6q0(str19 == null ? "" : str19, e6q0Var, i6q0Var, s7q0Var, true, strN18.length() > 0, new a6q0(false, true), ua80.n(new Object[0], 0, ctf0Var.b, R.string.reg_password, b0f0Var.c), null, false, 0, null, 253184);
                                                j3x j3xVar7 = (j3x) map2.get(u0f0Var14);
                                                Boolean bool7 = (Boolean) map4.get(u0f0Var14);
                                                lc00Var.add(new l090(u0f0Var14, c6q0Var, j3xVar7, bool7 != null ? bool7.booleanValue() : false));
                                            } else if (q0f0Var instanceof h0f0) {
                                                h0f0 h0f0Var = (h0f0) q0f0Var;
                                                ctf0Var.getClass();
                                                u0f0 u0f0Var15 = u0f0.n;
                                                String strN19 = N((urp) map.get(u0f0Var15), ctf0Var);
                                                s7q0 s7q0Var2 = strN19.length() > 0 ? new s7q0(strN19) : new s7q0("");
                                                String str20 = q1f0Var.w;
                                                c6q0 c6q0Var2 = new c6q0(str20 == null ? "" : str20, e6q0Var, i6q0Var, s7q0Var2, true, strN19.length() > 0, new a6q0(false, true), ua80.n(new Object[0], 0, ctf0Var.b, R.string.enter_pass_again, h0f0Var.c), null, false, 0, null, 253184);
                                                j3x j3xVar8 = (j3x) map2.get(u0f0Var15);
                                                Boolean bool8 = (Boolean) map4.get(u0f0Var15);
                                                lc00Var.add(new l090(u0f0Var15, c6q0Var2, j3xVar8, bool8 != null ? bool8.booleanValue() : false));
                                            } else {
                                                if (q0f0Var instanceof c0f0) {
                                                    boolean z6 = ((c0f0) q0f0Var).c;
                                                    ctf0Var.getClass();
                                                    lsm0 lsm0Var2 = ctf0Var.b;
                                                    String strN20 = ua80.n(new Object[0], 0, lsm0Var2, R.string.reg_telephone, z6);
                                                    String strN21 = ua80.n(new Object[0], 0, lsm0Var2, R.string.code, z6);
                                                    PhoneStateModel phoneStateModel = q1f0Var.r;
                                                    String str21 = phoneStateModel != null ? phoneStateModel.c : null;
                                                    if (str21 == null) {
                                                        str21 = "";
                                                    }
                                                    String str22 = phoneStateModel != null ? phoneStateModel.b : null;
                                                    String str23 = str22 == null ? "" : str22;
                                                    Object obj3 = u0f0.h;
                                                    String strN22 = N((urp) map.get(obj3), ctf0Var);
                                                    if (str23.length() == 0) {
                                                        ymmVar = new xmm(strN21);
                                                        countryStateModel2 = countryStateModel;
                                                    } else {
                                                        countryStateModel2 = countryStateModel;
                                                        String str24 = countryStateModel != null ? countryStateModel2.c : null;
                                                        if (str24 == null) {
                                                            str24 = "";
                                                        }
                                                        n0x n0xVar = new n0x(str24);
                                                        Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_language);
                                                        pz40 pz40Var2 = s6t0.f31722a;
                                                        ymmVar = new ymm(str23, n0xVar, strN21, numValueOf, new y3d(s6t0.b().f33626a.getSecondary60()));
                                                    }
                                                    j3x j3xVar9 = (j3x) map2.get(obj3);
                                                    Boolean bool9 = (Boolean) map4.get(obj3);
                                                    boolean zBooleanValue = bool9 != null ? bool9.booleanValue() : false;
                                                    String str25 = phoneStateModel != null ? phoneStateModel.f46877a : null;
                                                    knm knmVar = new knm(str25 == null ? "" : str25, strN20, new bm90(str21), phoneStateModel != null ? phoneStateModel.d : null, new yu90(str21));
                                                    if (strN22.length() <= 0) {
                                                        strN22 = null;
                                                    }
                                                    lc00Var.add(new wl90(new hnm(ymmVar, knmVar, strN22 != null ? new anm(strN22) : null), j3xVar9, zBooleanValue));
                                                } else {
                                                    countryStateModel2 = countryStateModel;
                                                    if (q0f0Var instanceof e0f0) {
                                                        e0f0 e0f0Var = (e0f0) q0f0Var;
                                                        ctf0Var.getClass();
                                                        u0f0 u0f0Var16 = u0f0.t;
                                                        String strN23 = N((urp) map.get(u0f0Var16), ctf0Var);
                                                        String str26 = q1f0Var.t;
                                                        String str27 = str26 == null ? "" : str26;
                                                        String strN24 = ua80.n(new Object[0], 0, ctf0Var.b, R.string.post_code, e0f0Var.c);
                                                        oie.f25306a.getClass();
                                                        c6q0 c6q0VarY7 = xvw.y(str27, strN24, true, strN23, mie.g, 3);
                                                        j3x j3xVar10 = (j3x) map2.get(u0f0Var16);
                                                        Boolean bool10 = (Boolean) map4.get(u0f0Var16);
                                                        lc00Var.add(new izj0(u0f0Var16, c6q0VarY7, j3xVar10, bool10 != null ? bool10.booleanValue() : false));
                                                    } else {
                                                        if (q0f0Var instanceof f0f0) {
                                                            f0f0 f0f0Var = (f0f0) q0f0Var;
                                                            ctf0Var.getClass();
                                                            Object obj4 = u0f0.u;
                                                            String strN25 = N((urp) map.get(obj4), ctf0Var);
                                                            s7q0 s7q0Var3 = strN25.length() > 0 ? new s7q0(strN25) : new s7q0("");
                                                            String str28 = q1f0Var.u;
                                                            c6q0 c6q0Var3 = new c6q0(str28 == null ? "" : str28, e6q0Var, o6q0.f24750a, s7q0Var3, true, strN25.length() > 0, null, ua80.n(new Object[0], 0, ctf0Var.b, R.string.promocode_if_available, f0f0Var.c), null, false, 3, null, 253312);
                                                            j3x j3xVar11 = (j3x) map2.get(obj4);
                                                            Boolean bool11 = (Boolean) map4.get(obj4);
                                                            lc00Var.add(new qfc0(c6q0Var3, z, j3xVar11, bool11 != null ? bool11.booleanValue() : false));
                                                        } else if (q0f0Var instanceof g0f0) {
                                                            g0f0 g0f0Var = (g0f0) q0f0Var;
                                                            ctf0Var.getClass();
                                                            u0f0 u0f0Var17 = u0f0.e;
                                                            String strN26 = N((urp) map.get(u0f0Var17), ctf0Var);
                                                            String str29 = regionStateModel != null ? regionStateModel.b : null;
                                                            regionStateModel = regionStateModel;
                                                            lc00Var.add(new l9q0(u0f0Var17, o5n0.m(str29 != null ? str29 : "", ua80.n(new Object[0], 0, ctf0Var.b, R.string.reg_region, g0f0Var.c), strN26, countryStateModel2 != null)));
                                                        } else if (q0f0Var instanceof k0f0) {
                                                            k0f0 k0f0Var = (k0f0) q0f0Var;
                                                            ctf0Var.getClass();
                                                            u0f0 u0f0Var18 = u0f0.b;
                                                            String strN27 = N((urp) map.get(u0f0Var18), ctf0Var);
                                                            String str30 = q1f0Var.z;
                                                            c6q0 c6q0VarY8 = xvw.y(str30 == null ? "" : str30, ua80.n(new Object[0], 0, ctf0Var.b, R.string.second_last_name, k0f0Var.c), true, strN27, null, 2);
                                                            j3x j3xVar12 = (j3x) map2.get(u0f0Var18);
                                                            Boolean bool12 = (Boolean) map4.get(u0f0Var18);
                                                            lc00Var.add(new izj0(u0f0Var18, c6q0VarY8, j3xVar12, bool12 != null ? bool12.booleanValue() : false));
                                                        } else if (q0f0Var instanceof d0f0) {
                                                            ctf0Var.getClass();
                                                            Boolean bool13 = q1f0Var.s;
                                                            Object obj5 = u0f0.Z;
                                                            lsm0 lsm0Var3 = ctf0Var.b;
                                                            lc00Var.add(new tpa0(lsm0Var3.a(R.string.registration_politically_exposed_person_question, Arrays.copyOf(new Object[0], 0)).concat(((d0f0) q0f0Var).c ? " *" : ""), new rqm((vui0) new tui0(lsm0Var3.a(R.string.yes, Arrays.copyOf(new Object[0], 0)), null), (pui0) null, (pvi0) new nvi0(Intrinsics.d(bool13, Boolean.TRUE)), (d4d) null, (tvi0) null, wui0.b, false, (e900) null, 442), new rqm((vui0) new tui0(lsm0Var3.a(R.string.no, Arrays.copyOf(new Object[0], 0)), null), (pui0) null, (pvi0) new nvi0(Intrinsics.d(bool13, Boolean.FALSE)), (d4d) null, (tvi0) null, wui0.d, false, (e900) null, 442), K((urp) map.get(obj5))));
                                                        } else if (q0f0Var instanceof zze0) {
                                                            ctf0Var.getClass();
                                                            u0f0 u0f0Var19 = u0f0.l1;
                                                            String strN28 = N((urp) map.get(u0f0Var19), ctf0Var);
                                                            String strO = o5n0.o(q1f0Var.J);
                                                            if (((zze0) q0f0Var).c) {
                                                                documentStateModel2 = documentStateModel;
                                                            } else {
                                                                documentStateModel2 = documentStateModel;
                                                                boolean z7 = documentStateModel != null && documentStateModel2.f46876a == 126;
                                                                String strN29 = ua80.n(new Object[0], 0, ctf0Var.b, R.string.document_date_of_issue, z7);
                                                                if (documentStateModel2 != null) {
                                                                    z2 = true;
                                                                } else {
                                                                    z2 = false;
                                                                }
                                                                lc00Var.add(new l9q0(u0f0Var19, o5n0.m(strO, strN29, strN28, z2)));
                                                            }
                                                            String strN210 = ua80.n(new Object[0], 0, ctf0Var.b, R.string.document_date_of_issue, z7);
                                                            if (documentStateModel2 != null) {
                                                                z2 = true;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            lc00Var.add(new l9q0(u0f0Var19, o5n0.m(strO, strN210, strN28, z2)));
                                                        } else {
                                                            documentStateModel2 = documentStateModel;
                                                            if (q0f0Var instanceof yze0) {
                                                                ctf0Var.getClass();
                                                                u0f0 u0f0Var20 = u0f0.m1;
                                                                lc00Var.add(new l9q0(u0f0Var20, o5n0.m(o5n0.o(q1f0Var.I), ua80.n(new Object[0], 0, ctf0Var.b, R.string.document_date_of_expire, ((yze0) q0f0Var).c || (documentStateModel2 != null && documentStateModel2.f46876a == 126)), N((urp) map.get(u0f0Var20), ctf0Var), documentStateModel2 != null)));
                                                            }
                                                        }
                                                        documentStateModel2 = documentStateModel;
                                                    }
                                                }
                                                documentStateModel2 = documentStateModel;
                                            }
                                        }
                                    }
                                }
                                documentStateModel2 = documentStateModel;
                                countryStateModel2 = countryStateModel;
                            }
                        }
                        map4 = map5;
                    }
                }
                citizenshipStateModel = citizenshipStateModel2;
                map4 = map5;
            }
            map5 = map4;
            documentStateModel2 = documentStateModel2;
            countryStateModel2 = countryStateModel2;
            regionStateModel = regionStateModel;
            citizenshipStateModel2 = citizenshipStateModel;
            it2 = it;
        }
        ctf0Var.getClass();
        if (!list.isEmpty()) {
            ListIterator listIterator = lc00Var.listIterator(lc00Var.b());
            do {
                paw pawVar = (paw) listIterator;
                if (!pawVar.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = pawVar.previous();
            } while (((y0f0) objPrevious).q() != u0f0.n);
            y0f0 y0f0Var = (y0f0) objPrevious;
            if (y0f0Var == null) {
                ListIterator listIterator2 = lc00Var.listIterator(lc00Var.b());
                do {
                    paw pawVar2 = (paw) listIterator2;
                    if (!pawVar2.hasPrevious()) {
                        objPrevious2 = null;
                        break;
                    }
                    objPrevious2 = pawVar2.previous();
                } while (((y0f0) objPrevious2).q() != u0f0.l);
                y0f0Var = (y0f0) objPrevious2;
            }
            if (y0f0Var != null) {
                int iIndexOf = lc00Var.indexOf(y0f0Var) + 1;
                u0f0 u0f0Var21 = u0f0.f34852a;
                lc00Var.add(iIndexOf, new q090(ctf0Var.b.a(R.string.password_requirements, Arrays.copyOf(new Object[0], 0)), dyb.r0(list), q1f0Var.G));
            }
        }
        ListIterator listIterator3 = lc00Var.listIterator(lc00Var.b());
        while (true) {
            paw pawVar3 = (paw) listIterator3;
            if (!pawVar3.hasPrevious()) {
                obj = null;
                break;
            }
            Object objPrevious3 = pawVar3.previous();
            if (((y0f0) objPrevious3).q() == u0f0.k) {
                obj = objPrevious3;
                break;
            }
        }
        y0f0 y0f0Var2 = (y0f0) obj;
        if (y0f0Var2 == null) {
            return;
        }
        int iIndexOf2 = lc00Var.indexOf(y0f0Var2) + 1;
        u0f0 u0f0Var22 = u0f0.f34852a;
        lc00Var.add(iIndexOf2, new jsn(ctf0Var.b.a(R.string.registration_gmail_recommendations, Arrays.copyOf(new Object[0], 0))));
    }

    public static final wqa v(ena enaVar, ymq0 ymq0Var, boolean z, ctf0 ctf0Var, long j, boolean z2) {
        Iterator it;
        int i;
        ggm ggmVar;
        yja yjaVar = enaVar.i;
        if (yjaVar == null) {
            return null;
        }
        List list = yjaVar.f42730a;
        if (list.isEmpty()) {
            return null;
        }
        ctf0Var.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        Iterator it2 = list.iterator();
        while (true) {
            int i2 = 0;
            if (!it2.hasNext()) {
                return new wqa(new yf30(dyb.r0(kotlin.collections.a.a(lc00VarB)), z, ieb.b0(ctf0Var, z), z2), ymq0Var, new CardIdentity(dja.LIVE_EVENTS, 0));
            }
            he30 he30Var = (he30) it2.next();
            List list2 = he30Var.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (((ge30) obj).e.length() > 0) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                lc00VarB.add(new uim(he30Var.f12902a));
                Iterator it3 = arrayList.iterator();
                int i3 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        q3d.p();
                        throw null;
                    }
                    ge30 ge30Var = (ge30) next;
                    int i5 = q3d.i(he30Var.b);
                    ge30Var.getClass();
                    String str = ge30Var.e;
                    String str2 = ge30Var.c;
                    String str3 = ge30Var.d;
                    String str4 = ge30Var.f11132a;
                    tho thoVar = ge30Var.b;
                    Iterator it4 = it2;
                    List listSplit$default = StringsKt__StringsKt.split$default(str4, new String[]{"+"}, false, i2, 6, null);
                    he30 he30Var2 = he30Var;
                    List listSplit$default2 = StringsKt__StringsKt.split$default(str4, new String[]{Separators.COLON}, false, i2, 6, null);
                    if (j != 1) {
                        it = it3;
                        i = i4;
                    } else {
                        it = it3;
                        i = i4;
                        if (listSplit$default.size() == 2 && listSplit$default2.size() == 1) {
                            str4 = listSplit$default.get(0) + "'+" + kotlin.text.c.r((String) listSplit$default.get(1), Separators.QUOTE, "", false);
                        } else if (listSplit$default2.size() == 2) {
                            str4 = listSplit$default2.get(0) + Separators.QUOTE;
                        }
                    }
                    y6n y6nVar = ge30Var.j == 0 ? y6n.f42107a : y6n.b;
                    if (i3 == 0 && i5 == 0) {
                        ggmVar = ggm.c;
                    } else if (i3 == 0) {
                        ggmVar = ggm.f11256a;
                    } else {
                        ggmVar = i3 == i5 ? ggm.b : ggm.d;
                    }
                    ggm ggmVar2 = ggmVar;
                    lc00VarB.add((str3.length() == 0 && str2.length() == 0) ? new sim(str4, str, thoVar.name(), y6nVar, ggmVar2, ge30Var.b()) : new rim(str4, str, new lnm(str3, str2, 0, "", new s0m("", ""), ge30Var.k), ge30Var.a() ? new lnm(ge30Var.h, ge30Var.g, 0, "", new s0m("", ""), ge30Var.l) : null, thoVar.name(), null, y6nVar, ggmVar2, ge30Var.b()));
                    it2 = it4;
                    he30Var = he30Var2;
                    it3 = it;
                    i3 = i;
                    i2 = 0;
                }
            }
            it2 = it2;
        }
    }

    public static final wqa w(ena enaVar, ymq0 ymq0Var) {
        int i;
        woa woaVar = enaVar.n;
        if (woaVar == null) {
            return null;
        }
        String str = woaVar.f39484a;
        String str2 = woaVar.c;
        if (str.length() == 0) {
            str = woaVar.b;
        }
        String strI = ua80.i(str, (str.length() <= 0 || str2.length() <= 0) ? "" : Separators.COMMA, Separators.SP, str2);
        switch (woaVar.h.ordinal()) {
            case 0:
                i = R.drawable.ic_weather_fog;
                break;
            case 1:
                i = R.drawable.ic_weather_haze;
                break;
            case 2:
                i = R.drawable.ic_weather_partly_cloudy;
                break;
            case 3:
                i = R.drawable.ic_weather_partly_cloud_rain;
                break;
            case 4:
                i = R.drawable.ic_weather_partly_cloud_rain_storm;
                break;
            case 5:
                i = R.drawable.ic_weather_partly_cloud_snow;
                break;
            case 6:
                i = R.drawable.ic_weather_cloud;
                break;
            case 7:
                i = R.drawable.ic_weather_rain;
                break;
            case 8:
                i = R.drawable.ic_weather_rain_storm;
                break;
            case 9:
                i = R.drawable.ic_weather_snow;
                break;
            case 10:
                i = R.drawable.ic_weather_maily_cloudy;
                break;
            case 11:
                i = R.drawable.ic_weather_maily_cloudy_rain;
                break;
            case 12:
                i = R.drawable.ic_weather_maily_cloudy_rain_storm;
                break;
            case 13:
                i = R.drawable.ic_weather_snowing;
                break;
            case 14:
                i = R.drawable.ic_weather_sun;
                break;
            case 15:
                i = R.drawable.transparent;
                break;
            default:
                t9f.b();
                return null;
        }
        int i2 = i;
        String str3 = woaVar.d;
        boolean z = true;
        if (str3.length() <= 0) {
            z = false;
        }
        String str4 = woaVar.e;
        boolean z2 = str4.length() > 0;
        String str5 = woaVar.f;
        boolean z3 = str5.length() > 0 ? z : false;
        String str6 = woaVar.g;
        return new wqa(new k1v0(strI, i2, str3, z, str4, z2, str5, z3, str6, str6.length() > 0 ? z : false), ymq0Var, new CardIdentity(dja.WEATHER, 0));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0014  */
    public static siy x(kiy kiyVar) {
        boolean z;
        v2 v2Var = kiyVar instanceof v2 ? (v2) kiyVar : null;
        if (v2Var != null) {
            z = v2Var.q();
        }
        if (z) {
            kiyVar = q5x.J(kiyVar, kiyVar, false);
        }
        jtv jtvVar = jtv.u;
        jys0 jys0VarN = jtvVar.N((v2) kiyVar);
        int iX = jtvVar.x(jys0VarN);
        ArrayList arrayList = new ArrayList(iX);
        for (int i = 0; i < iX; i++) {
            arrayList.add((miy) jtvVar.r0(jys0VarN, i));
        }
        if (arrayList.size() == kiyVar.M().size()) {
            return arrayList.isEmpty() ? siy.c.a(z) : new siy(xp20.m(CollectionsKt.T0(arrayList, kiyVar.M())), z);
        }
        throw new IllegalStateException(("Params vs args count mismatch (" + arrayList.size() + " != " + kiyVar.M().size() + ") for type '" + kiyVar + '\'').toString());
    }

    public static Bundle y(Parcel parcel, int i) {
        int iZ = Z(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iZ);
        return bundle;
    }

    public static byte[] z(Parcel parcel, int i) {
        int iZ = Z(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if (iZ == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iZ);
        return bArrCreateByteArray;
    }
}
