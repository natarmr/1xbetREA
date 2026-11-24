package a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.javax.sip.message.Response;
import android.util.Base64;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xplatform.betting.core.zip.model.zip.BetPlayerZip;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.EventParams;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.game_broadcasting.impl.presentation.zone.window_screen.GameZoneWindowService;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class u1c {
    public static final double A(int i, int i2, int i3, int i4, j1h0 j1h0Var, f7k0 f7k0Var) {
        double dMax;
        double d = i;
        double d2 = ((double) i3) / d;
        double d3 = i2;
        double d4 = ((double) i4) / d3;
        int iOrdinal = j1h0Var.ordinal();
        if (iOrdinal == 0) {
            dMax = Math.max(d2, d4);
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return 0.0d;
            }
            dMax = Math.min(d2, d4);
        }
        umk umkVar = f7k0Var.f9062a;
        if (umkVar instanceof rmk) {
            double d5 = ((double) ((rmk) umkVar).f30747a) / d;
            if (dMax > d5) {
                dMax = d5;
            }
        }
        umk umkVar2 = f7k0Var.b;
        if (umkVar2 instanceof rmk) {
            double d6 = ((double) ((rmk) umkVar2).f30747a) / d3;
            if (dMax > d6) {
                return d6;
            }
        }
        return dMax;
    }

    public static wmh0 B(long j, int i, ctf0 ctf0Var) {
        ctf0Var.getClass();
        return new wmh0(j, ctf0Var.b.a(i, Arrays.copyOf(new Object[0], 0)));
    }

    public static final d280 C(tca tcaVar, boolean z) {
        String str;
        if (tcaVar.i) {
            return new b280(z ? R.drawable.ic_glyph_color_logo_home : R.drawable.ic_glyph_color_logo_away);
        }
        String str2 = "";
        if (!z ? (str = (String) CollectionsKt.firstOrNull(tcaVar.c)) != null : (str = (String) CollectionsKt.firstOrNull(tcaVar.b)) != null) {
            str2 = str;
        }
        rpp0 rpp0Var = tcaVar.f33711a;
        return new c280(vsm0.s(z ? rpp0Var.a() : rpp0Var.c(), str2), R.drawable.ic_glyph_placeholder_player);
    }

    public static final d280 D(xca xcaVar, boolean z) {
        String str;
        if (xcaVar.q) {
            return new b280(z ? R.drawable.ic_glyph_color_logo_home : R.drawable.ic_glyph_color_logo_away);
        }
        String str2 = "";
        if (!z ? (str = (String) CollectionsKt.firstOrNull(xcaVar.i)) != null : (str = (String) CollectionsKt.firstOrNull(xcaVar.h)) != null) {
            str2 = str;
        }
        rpp0 rpp0Var = xcaVar.f40636a;
        return new c280(vsm0.s(z ? rpp0Var.a() : rpp0Var.c(), str2), R.drawable.ic_glyph_placeholder_player);
    }

    public static final long E(y9l y9lVar) {
        Object next;
        Iterator it = y9lVar.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((z4l) next).l);
        z4l z4lVar = (z4l) next;
        if (z4lVar != null) {
            return z4lVar.o;
        }
        return 0L;
    }

    public static final String F(c5l c5lVar, m9s m9sVar, i6l i6lVar) {
        String str = c5lVar.b.f42253a == i6lVar ? (String) CollectionsKt.firstOrNull(m9sVar.m) : (String) CollectionsKt.firstOrNull(m9sVar.n);
        if (str == null) {
            str = "";
        }
        if (kotlin.text.c.x(str, ujn.h, false)) {
            return str;
        }
        if (str.length() != 0) {
            List list = u0d.f34849a;
            if (!u0d.c(str)) {
                return String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
            }
        }
        return "";
    }

    public static final dho G(wmr0 wmr0Var, ctf0 ctf0Var) {
        int i;
        long primary;
        ctf0Var.getClass();
        w0w w0wVar = wmr0Var.f;
        int iOrdinal = w0wVar.ordinal();
        if (iOrdinal == 0) {
            i = R.string.accepted;
        } else if (iOrdinal == 1) {
            i = R.string.loosed;
        } else if (iOrdinal == 2) {
            i = R.string.won;
        } else {
            if (iOrdinal != 3) {
                return null;
            }
            i = R.string.return1;
        }
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(i, Arrays.copyOf(new Object[0], 0));
        int iOrdinal2 = w0wVar.ordinal();
        if (iOrdinal2 == 0) {
            pz40 pz40Var = s6t0.f31722a;
            primary = s6t0.b().f33626a.getPrimary();
        } else if (iOrdinal2 == 1) {
            pz40 pz40Var2 = s6t0.f31722a;
            primary = StaticColors.INSTANCE.m113getRed0d7_KjU();
        } else {
            if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                t9f.b();
                return null;
            }
            pz40 pz40Var3 = s6t0.f31722a;
            primary = StaticColors.INSTANCE.m98getGreen0d7_KjU();
        }
        return new dho(primary, h97.h(wmr0Var.e, "getTotoStatusDescription"), lsm0Var.a(R.string.promo_code_status_text, Arrays.copyOf(new Object[0], 0)), strA);
    }

    public static final void H(Throwable th, CoroutineContext coroutineContext) {
        if (th instanceof mvk) {
            th = ((mvk) th).f22460a;
        }
        try {
            nne nneVar = (nne) coroutineContext.get(lwf.h);
            if (nneVar != null) {
                nneVar.l(th, coroutineContext);
            } else {
                wzb.q0(th, coroutineContext);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                tjo.a(runtimeException, th);
                th = runtimeException;
            }
            wzb.q0(th, coroutineContext);
        }
    }

    public static final dnq I(gmq gmqVar, Function2 function2) {
        gmqVar.getClass();
        lie0 lie0Var = new lie0();
        lie0Var.f20100a = System.currentTimeMillis();
        yje yjeVar = null;
        return new dnq(new fnq(new fnq(gmqVar, new ofl((Object) lie0Var, (Object) function2, yjeVar, (byte) 16)), new hij(lie0Var, yjeVar, (byte) 15), (byte) 4), new ko0((Object) lie0Var, yjeVar, (byte) 14), (byte) 1);
    }

    public static dnq J(gmq gmqVar) {
        return I(gmqVar, new p23(2, null, (byte) 4));
    }

    public static dsq K(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        List list;
        int i2;
        ArrayList arrayList;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            N(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), hqd0.b);
        int i3 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i4 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList2 = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), hqd0.c);
                        int i5 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, Response.BAD_REQUEST);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i6 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i7 = typedArrayObtainAttributes2.getInt(i6, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i8, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i8);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            N(xmlResourceParser);
                        }
                        arrayList2.add(new fsq(i5, i7, resourceId2, string7, string6, z));
                    } else {
                        N(xmlResourceParser);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return null;
            }
            return new esq((fsq[]) arrayList2.toArray(new fsq[0]));
        }
        List listL = L(resources, resourceId);
        ArrayList arrayList3 = new ArrayList();
        while (xmlResourceParser.next() != i4) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), hqd0.d);
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i3);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i);
                        if (string8 == null) {
                            typedArray = typedArrayObtainAttributes3;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != i4) {
                            N(xmlResourceParser);
                        }
                        arrayList = arrayList3;
                        int i9 = integer;
                        list = listL;
                        i2 = i9;
                        typedArray = typedArrayObtainAttributes3;
                        try {
                            xrq xrqVar = new xrq(string, string2, string8, string9, string10, list);
                            typedArray.recycle();
                            arrayList.add(xrqVar);
                        } catch (Throwable th) {
                            th = th;
                        }
                        th = th;
                    } catch (Throwable th2) {
                        th = th2;
                        typedArray = typedArrayObtainAttributes3;
                    }
                    typedArray.recycle();
                    throw th;
                }
                int i10 = integer;
                list = listL;
                i2 = i10;
                arrayList = arrayList3;
                N(xmlResourceParser);
                List list2 = list;
                integer = i2;
                listL = list2;
                i4 = i4;
                arrayList3 = arrayList;
                i = 2;
                i3 = 0;
            }
        }
        int i11 = integer;
        List list3 = listL;
        ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            return new gsq(arrayList4, i11, integer2, string5);
        }
        if (string3 == null) {
            jf4.o("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList4.add(new xrq(string, string2, string3, null, null, list3));
        if (string4 != null) {
            arrayList4.add(new xrq(string, string2, string4, null, null, list3));
        }
        return new gsq(arrayList4, i11, integer2, string5);
    }

    public static List L(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final ugd M(int i, wdr wdrVar, fet fetVar) {
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            objP = new ugd(i, true, wdrVar);
            fetVar.o0(objP);
        }
        ugd ugdVar = (ugd) objP;
        if (!Intrinsics.d(ugdVar.c, wdrVar)) {
            boolean z = ugdVar.c == null;
            ugdVar.c = wdrVar;
            if (!z && ugdVar.b) {
                yfe0 yfe0Var = ugdVar.d;
                if (yfe0Var != null) {
                    zfe0 zfe0Var = yfe0Var.f42538a;
                    if (zfe0Var != null) {
                        zfe0Var.e(yfe0Var, null);
                    }
                    ugdVar.d = null;
                }
                ArrayList arrayList = ugdVar.e;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        yfe0 yfe0Var2 = (yfe0) arrayList.get(i2);
                        zfe0 zfe0Var2 = yfe0Var2.f42538a;
                        if (zfe0Var2 != null) {
                            zfe0Var2.e(yfe0Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return ugdVar;
    }

    public static void N(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static final long O(p0n p0nVar) {
        p0nVar.getClass();
        fgm fgmVar = p0nVar.b;
        long j = p0nVar.f26160a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (p0nVar.d) {
            int iOrdinal = fgmVar.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                long j2 = jCurrentTimeMillis - j;
                if (j2 >= 0) {
                    return j2;
                }
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return 0L;
                }
                long j3 = j - jCurrentTimeMillis;
                if (j3 >= 0) {
                    return j3;
                }
            }
        } else {
            long j4 = jCurrentTimeMillis - p0nVar.c;
            int iOrdinal2 = fgmVar.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                return j + j4;
            }
            if (iOrdinal2 != 2) {
                t9f.b();
                return 0L;
            }
            long j5 = j - j4;
            if (j5 >= 0) {
                return j5;
            }
        }
        return 0L;
    }

    public static void P(Context context) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) GameZoneWindowService.class);
        intent.setAction("ACTION_STOP");
        j47.B0(context, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r35v1, types: [a.f2i] */
    /* JADX WARN: Type inference failed for: r49v10, types: [a.kum] */
    public static final w56 Q(y78 y78Var, d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        mpm lpmVar;
        mum kumVar;
        w56 r56Var;
        String strG;
        d0tVar.getClass();
        boolean z6 = d0tVar.z;
        Date date = d0tVar.P;
        rqs rqsVar = d0tVar.p;
        ctf0Var.getClass();
        y78Var.getClass();
        str.getClass();
        list.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        mum kumVar2 = jum.f17161a;
        lum lumVar = lum.f20678a;
        Object kumVar3 = null;
        if (iOrdinal == 0) {
            long j = d0tVar.f5282a;
            i4i i4iVarQ = w7n0.q(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
            String strC0 = qzb.c0(d0tVar);
            d280 d280VarD = kpb.D(d0tVar);
            int iO0 = wzb.o0(d0tVar);
            ubr ubrVar = rqsVar.B;
            List list2 = rqsVar.d;
            l2g l2gVar = new l2g(strC0, d280VarD, iO0, ubrVar.f35394a);
            l2g l2gVar2 = new l2g(qzb.r0(d0tVar), kpb.U(d0tVar), wzb.o0(d0tVar), ubrVar.b);
            for (Object obj : list2) {
                if (((df90) obj).f5989a == rqsVar.b) {
                    kumVar3 = obj;
                    break;
                }
            }
            boolean z7 = kumVar3 == null;
            boolean zIsEmpty = list2.isEmpty();
            opm opmVar = opm.f25648a;
            if (zIsEmpty || z6 || z7) {
                lpmVar = new lpm(opmVar, new hpm(0L, 3));
            } else {
                t480 t480VarL = kpb.L(d0tVar);
                lpmVar = new kpm(opmVar, new hpm(0L, 3), d5c.O(t480VarL.f33307a, t480VarL.b, rqsVar.r, rqsVar.s, new hpm(0L, 3)));
            }
            String strV = wzb.V(y78Var, d0tVar, ctf0Var, z5);
            if (kpb.e0(d0tVar)) {
                kumVar = lumVar;
            } else if (qzb.H0(d0tVar)) {
                long jR0 = kpb.r0(d0tVar);
                fgm fgmVar = fgm.f9498a;
                kumVar = new kum(jR0, date.getTime());
            } else {
                kumVar = kumVar2;
            }
            r56Var = new r56(j, i4iVarQ, new v76(l2gVar, l2gVar2, lpmVar, strV, kumVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal == 1) {
            long j2 = d0tVar.f5282a;
            j4i j4iVarU = w7n0.u(new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), d0tVar, str, str2, list, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            String strC1 = qzb.c0(d0tVar);
            int iO1 = wzb.o0(d0tVar);
            ubr ubrVar2 = rqsVar.B;
            m2g m2gVar = new m2g(iO1, ubrVar2.f35394a, strC1, kpb.K(d0tVar).f33307a, rqsVar.r);
            m2g m2gVar2 = new m2g(wzb.o0(d0tVar), ubrVar2.b, qzb.r0(d0tVar), kpb.K(d0tVar).b, rqsVar.s);
            String strV2 = wzb.V(y78Var, d0tVar, ctf0Var, z5);
            if (qzb.H0(d0tVar)) {
                long jR1 = kpb.r0(d0tVar);
                fgm fgmVar2 = fgm.f9498a;
                kumVar3 = new kum(jR1, date.getTime());
            }
            r56Var = new v56(j2, j4iVarU, new b96(m2gVar, m2gVar2, kumVar3, strV2, qem.f28591a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal == 2) {
            long j3 = d0tVar.f5282a;
            k4i k4iVarT = w7n0.t(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            boolean zA0 = kpb.a0(d0tVar, z, z2);
            boolean zF0 = kpb.f0(d0tVar, z);
            String strC2 = qzb.c0(d0tVar);
            d280 d280VarD2 = kpb.D(d0tVar);
            String str3 = kpb.B(d0tVar).f33307a;
            ubr ubrVar3 = rqsVar.B;
            String strValueOf = String.valueOf(ubrVar3.f35394a);
            if (z6) {
                strValueOf = null;
            }
            wws0 wws0Var = new wws0(strC2, d280VarD2, 0, "", str3, strValueOf == null ? "" : strValueOf, rqsVar.t, false, rqsVar.r);
            String strR0 = qzb.r0(d0tVar);
            d280 d280VarU = kpb.U(d0tVar);
            String str4 = kpb.B(d0tVar).b;
            String strValueOf2 = String.valueOf(ubrVar3.b);
            if (z6) {
                strValueOf2 = null;
            }
            wws0 wws0Var2 = new wws0(strR0, d280VarU, 0, "", str4, strValueOf2 == null ? "" : strValueOf2, rqsVar.u, false, rqsVar.s);
            String strV3 = wzb.V(y78Var, d0tVar, ctf0Var, z5);
            r0n p0nVar = kpb.e0(d0tVar) ? q0n.f27908a : qzb.H0(d0tVar) ? new p0n(kpb.r0(d0tVar), fgm.b, date.getTime(), false, 24) : o0n.f24435a;
            lsm0 lsm0Var = ctf0Var.b;
            String strA = lsm0Var.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
            if (zA0) {
                kumVar3 = c2i.f3624a;
            } else if (zF0) {
                kumVar3 = e2i.f7087a;
            }
            r56Var = new u56(j3, k4iVarT, new t86(wws0Var, wws0Var2, kumVar3, strA, strV3, String.valueOf(rqsVar.b), lsm0Var.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), p0nVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                long j4 = d0tVar.f5282a;
                k4i k4iVarR = w7n0.r(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
                String strC3 = qzb.c0(d0tVar);
                d280 d280VarD3 = kpb.D(d0tVar);
                int iO2 = wzb.o0(d0tVar);
                ubr ubrVar4 = rqsVar.B;
                o2g o2gVar = new o2g(strC3, d280VarD3, iO2, ubrVar4.f35394a);
                o2g o2gVar2 = new o2g(qzb.r0(d0tVar), kpb.U(d0tVar), wzb.o0(d0tVar), ubrVar4.b);
                a2m a2mVarD0 = wzb.D0(d0tVar);
                String strV4 = wzb.V(y78Var, d0tVar, ctf0Var, z5);
                if (kpb.e0(d0tVar)) {
                    kumVar2 = lumVar;
                } else if (qzb.H0(d0tVar)) {
                    long jR2 = kpb.r0(d0tVar);
                    fgm fgmVar3 = fgm.f9498a;
                    kumVar2 = new kum(jR2, date.getTime());
                }
                return new s56(j4, k4iVarR, new d86(o2gVar, o2gVar2, a2mVarD0, strV4, ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), kumVar2), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            }
            long j5 = d0tVar.f5282a;
            ubr ubrVar5 = rqsVar.B;
            n0x n0xVar = new n0x(dtb.F(str));
            if (z6) {
                strG = rqsVar.m;
                if (strG.length() == 0) {
                    rdj rdjVar = rdj.f30294a;
                    strG = rdj.g(new znq0(d0tVar.s), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56);
                }
            } else {
                strG = y78.n(y78Var, d0tVar, !qzb.H0(d0tVar), z5, 4).toString();
            }
            r56Var = new t56(j5, w7n0.s(null, d0tVar, str, strG, ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), str2, list, z3, z4, kpb.e0(d0tVar), kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z)), new l86(new n2g(qzb.c0(d0tVar), kpb.D(d0tVar), wzb.o0(d0tVar), ubrVar5.f35394a), new n2g(qzb.r0(d0tVar), kpb.U(d0tVar), wzb.o0(d0tVar), ubrVar5.b), wzb.D0(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
        }
        return r56Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v26, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v28, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v30, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v32, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v33, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.util.List] */
    public static final e8h R(l8h l8hVar) {
        List list;
        List<i8h> list2;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        ?? arrayList5;
        djn0 djn0Var;
        n9d n9dVar;
        n9d n9dVar2;
        Boolean bool;
        Integer num;
        int iIntValue = (l8hVar == null || (num = l8hVar.f19603a) == null) ? 0 : num.intValue();
        String str = l8hVar != null ? l8hVar.b : null;
        if (str == null) {
            str = "";
        }
        String strE = lmc.E(l8hVar != null ? l8hVar.c : null);
        boolean zBooleanValue = (l8hVar == null || (bool = l8hVar.d) == null) ? false : bool.booleanValue();
        if (l8hVar == null || (list2 = l8hVar.e) == null) {
            list = null;
        } else {
            ArrayList arrayList6 = new ArrayList(r3d.q(list2, 10));
            for (i8h i8hVar : list2) {
                i8hVar.getClass();
                Long l = i8hVar.f14337a;
                long jLongValue = l != null ? l.longValue() : 0L;
                String str2 = i8hVar.b;
                String str3 = str2 == null ? "" : str2;
                String str4 = i8hVar.c;
                String str5 = str4 == null ? "" : str4;
                Long l2 = i8hVar.d;
                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                String str6 = i8hVar.e;
                if (str6 == null) {
                    str6 = "";
                }
                vvv vvvVar = new vvv(jLongValue2, lmc.E(i8hVar.f), str6);
                Integer num2 = i8hVar.g;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                Integer num3 = i8hVar.h;
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                Integer num4 = i8hVar.i;
                int iIntValue4 = num4 != null ? num4.intValue() : 0;
                Integer num5 = i8hVar.j;
                int iIntValue5 = num5 != null ? num5.intValue() : 0;
                Integer num6 = i8hVar.k;
                int iIntValue6 = num6 != null ? num6.intValue() : 0;
                List<xny> list3 = i8hVar.p;
                if (list3 != null) {
                    arrayList = new ArrayList(r3d.q(list3, 10));
                    for (xny xnyVar : list3) {
                        xnyVar.getClass();
                        Long l3 = xnyVar.f41190a;
                        long jLongValue3 = l3 != null ? l3.longValue() : 0L;
                        String str7 = xnyVar.b;
                        String str8 = str7 == null ? "" : str7;
                        String strE2 = lmc.E(xnyVar.c);
                        Integer num7 = xnyVar.d;
                        arrayList.add(new uny(num7 != null ? num7.intValue() : -1, jLongValue3, str8, strE2));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                ?? r27 = arrayList;
                List<w0a0> list4 = i8hVar.l;
                if (list4 != null) {
                    arrayList2 = new ArrayList();
                    for (w0a0 w0a0Var : list4) {
                        if (w0a0Var.c != null) {
                            String str9 = w0a0Var.f38341a;
                            if (str9 == null) {
                                str9 = "";
                            }
                            n9dVar2 = new n9d(w0a0Var.c.intValue(), str9, lmc.E(w0a0Var.b));
                        } else {
                            n9dVar2 = null;
                        }
                        if (n9dVar2 != null) {
                            arrayList2.add(n9dVar2);
                        }
                    }
                } else {
                    arrayList2 = 0;
                }
                if (arrayList2 == 0) {
                    arrayList2 = iun.f15405a;
                }
                ?? r28 = arrayList2;
                List<w0a0> list5 = i8hVar.n;
                if (list5 != null) {
                    arrayList3 = new ArrayList();
                    for (w0a0 w0a0Var2 : list5) {
                        if (w0a0Var2.c != null) {
                            String str10 = w0a0Var2.f38341a;
                            if (str10 == null) {
                                str10 = "";
                            }
                            n9dVar = new n9d(w0a0Var2.c.intValue(), str10, lmc.E(w0a0Var2.b));
                        } else {
                            n9dVar = null;
                        }
                        if (n9dVar != null) {
                            arrayList3.add(n9dVar);
                        }
                    }
                } else {
                    arrayList3 = 0;
                }
                if (arrayList3 == 0) {
                    arrayList3 = iun.f15405a;
                }
                ?? r29 = arrayList3;
                List<iba0> list6 = i8hVar.o;
                if (list6 != null) {
                    arrayList4 = new ArrayList();
                    for (iba0 iba0Var : list6) {
                        Integer num8 = iba0Var.c;
                        if (num8 == null || num8.intValue() <= 0) {
                            djn0Var = null;
                        } else {
                            String str11 = iba0Var.f14478a;
                            if (str11 == null) {
                                str11 = "";
                            }
                            djn0Var = new djn0(iba0Var.c.intValue(), str11, lmc.E(iba0Var.b));
                        }
                        if (djn0Var != null) {
                            arrayList4.add(djn0Var);
                        }
                    }
                } else {
                    arrayList4 = 0;
                }
                if (arrayList4 == 0) {
                    arrayList4 = iun.f15405a;
                }
                ?? r30 = arrayList4;
                List<qy90> list7 = i8hVar.m;
                if (list7 != null) {
                    arrayList5 = new ArrayList(r3d.q(list7, 10));
                    for (qy90 qy90Var : list7) {
                        String str12 = qy90Var.f29522a;
                        if (str12 == null) {
                            str12 = "";
                        }
                        String strE3 = lmc.E(qy90Var.b);
                        Boolean bool2 = qy90Var.c;
                        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                        Integer num9 = qy90Var.d;
                        arrayList5.add(new ny90(num9 != null ? num9.intValue() : 0, str12, strE3, zBooleanValue2));
                    }
                } else {
                    arrayList5 = 0;
                }
                if (arrayList5 == 0) {
                    arrayList5 = iun.f15405a;
                }
                arrayList6.add(new f8h(jLongValue, str3, str5, vvvVar, iIntValue2, iIntValue3, iIntValue4, iIntValue5, iIntValue6, r27, r28, r29, r30, arrayList5));
            }
            list = arrayList6;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        return new e8h(iIntValue, str, strE, list, zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0024  */
    /* JADX WARN: Code duplicated, block: B:9:0x0012  */
    public static final tqk S(kuk kukVar) {
        List list;
        List list2;
        j0g0 j0g0Var = kukVar.f18914a;
        if (j0g0Var != null) {
            Object obj = j0g0Var.f15681a;
            if (obj instanceof g0g0) {
                obj = null;
            }
            list = (List) obj;
            if (list == null) {
                list = iun.f15405a;
            }
        } else {
            list = iun.f15405a;
        }
        j0g0 j0g0Var2 = kukVar.b;
        if (j0g0Var2 != null) {
            Object obj2 = j0g0Var2.f15681a;
            list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
            if (list2 == null) {
                list2 = iun.f15405a;
            }
        } else {
            list2 = iun.f15405a;
        }
        return new tqk(list, list2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0053 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static final oeo T(BetGroupZip betGroupZip, boolean z, Map map, Map map2, List list, List list2) {
        gho ghoVar;
        boolean z2;
        boolean z3;
        Iterator it;
        boolean z4;
        Iterator it2;
        ueo ueoVar;
        xco xcoVar;
        boolean z5;
        BetGroupZip betGroupZip2 = betGroupZip;
        betGroupZip2.getClass();
        list.getClass();
        long j = betGroupZip2.f46429a;
        long j2 = betGroupZip2.b;
        String str = betGroupZip2.c;
        long j3 = j;
        int i = betGroupZip2.e;
        List list3 = betGroupZip2.f;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (true) {
                if (it3.hasNext()) {
                    ueo ueoVar2 = (ueo) map2.get(Long.valueOf(((BetZip) it3.next()).f46426a));
                    if (ueoVar2 != null && ueoVar2.d == 2) {
                        ghoVar = gho.c;
                    }
                } else if (list3 == null && list3.isEmpty()) {
                    xcoVar = (xco) map.get(Long.valueOf(j2));
                    if (xcoVar != null) {
                        z5 = xcoVar.e;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        ghoVar = gho.b;
                    } else {
                        ghoVar = gho.f11309a;
                    }
                } else {
                    it2 = list3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ueoVar = (ueo) map2.get(Long.valueOf(((BetZip) it2.next()).f46426a));
                            if (ueoVar == null && ueoVar.d == 3) {
                                ghoVar = gho.d;
                            }
                        } else {
                            xcoVar = (xco) map.get(Long.valueOf(j2));
                            if (xcoVar != null) {
                                z5 = xcoVar.e;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                ghoVar = gho.b;
                            } else {
                                ghoVar = gho.f11309a;
                            }
                        }
                    }
                }
            }
        } else if (list3 == null) {
            it2 = list3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    ueoVar = (ueo) map2.get(Long.valueOf(((BetZip) it2.next()).f46426a));
                    if (ueoVar == null) {
                    }
                } else {
                    xcoVar = (xco) map.get(Long.valueOf(j2));
                    if (xcoVar != null) {
                        z5 = xcoVar.e;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        ghoVar = gho.b;
                    } else {
                        ghoVar = gho.f11309a;
                    }
                }
            }
        } else {
            it2 = list3.iterator();
            while (true) {
                if (it2.hasNext()) {
                    ueoVar = (ueo) map2.get(Long.valueOf(((BetZip) it2.next()).f46426a));
                    if (ueoVar == null) {
                    }
                } else {
                    xcoVar = (xco) map.get(Long.valueOf(j2));
                    if (xcoVar != null) {
                        z5 = xcoVar.e;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        ghoVar = gho.b;
                    } else {
                        ghoVar = gho.f11309a;
                    }
                }
            }
        }
        if (!list.isEmpty()) {
            Iterator it4 = list.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z2 = false;
                    break;
                }
                vt20 vt20Var = (vt20) it4.next();
                if (vt20Var.f37982a == j2 && vt20Var.c != 0) {
                    z2 = true;
                    break;
                }
            }
        } else {
            z2 = false;
            break;
        }
        int i2 = betGroupZip2.e;
        ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
        Iterator it5 = list3.iterator();
        while (it5.hasNext()) {
            BetZip betZip = (BetZip) it5.next();
            long j4 = j3;
            long j5 = betGroupZip2.f46429a;
            betZip.getClass();
            ArrayList arrayList2 = arrayList;
            long j6 = betZip.f46426a;
            gho ghoVar2 = ghoVar;
            long j7 = betZip.c;
            long j8 = betZip.m;
            uoy uoyVar = betZip.l;
            izc izcVar = betZip.v;
            boolean z6 = betZip.f;
            boolean z7 = betZip.B;
            long j9 = betZip.o;
            String str2 = betZip.A;
            String str3 = betZip.Z;
            double d = betZip.d;
            String str4 = betZip.e;
            double d2 = betZip.b;
            String str5 = betZip.g;
            String strM = ju70.M(betZip, z);
            String str6 = betZip.h;
            if (StringsKt.W(str6)) {
                str6 = betZip.t;
            }
            String str7 = str6;
            String str8 = betZip.u;
            boolean z8 = betZip.x;
            boolean z9 = betZip.w;
            boolean z10 = betZip.p;
            boolean z11 = betZip.r;
            boolean z12 = betZip.f1;
            if (!list2.isEmpty()) {
                Iterator it6 = list2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        z3 = z12;
                        it = it5;
                        z4 = false;
                        break;
                        break;
                    }
                    z3 = z12;
                    pln plnVar = (pln) it6.next();
                    it = it5;
                    if (betZip.m == plnVar.c && betZip.f46426a == plnVar.b && betZip.d == plnVar.e && betZip.o == plnVar.f) {
                        z4 = true;
                        break;
                    }
                    z12 = z3;
                    it5 = it;
                }
            } else {
                z3 = z12;
                it = it5;
                z4 = false;
                break;
            }
            arrayList = arrayList2;
            arrayList.add(new neo(j6, j7, j8, uoyVar, izcVar, z6, z7, j9, str2, str3, d, str4, d2, str5, strM, str7, str8, z8, z9, z10, j5, z11, z3, z4));
            betGroupZip2 = betGroupZip;
            j3 = j4;
            ghoVar = ghoVar2;
            it5 = it;
        }
        return new oeo(j3, j2, str, i, z2, i2, ghoVar, arrayList);
    }

    public static final v9s U(gas gasVar, long j, Integer num, Long l, Boolean bool, Long l2) {
        Long l3;
        gasVar.getClass();
        Double d = gasVar.d;
        qfo qfoVar = gasVar.c;
        long jLongValue = (qfoVar == null || (l3 = qfoVar.f28645a) == null) ? 0L : l3.longValue();
        String str = qfoVar != null ? qfoVar.b : null;
        if (str == null) {
            str = "";
        }
        BetPlayerZip betPlayerZip = new BetPlayerZip(jLongValue, str);
        Long l4 = gasVar.f10984a;
        long jLongValue2 = l4 != null ? l4.longValue() : 0L;
        Double d2 = gasVar.e;
        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        double dDoubleValue2 = d != null ? d.doubleValue() : 0.0d;
        BigDecimal bigDecimalH = kotlin.text.b.h("");
        if (bigDecimalH == null) {
            bigDecimalH = kotlin.text.b.h(String.valueOf(d));
        }
        if (bigDecimalH == null) {
            bigDecimalH = new BigDecimal(0);
        }
        boolean zD = Intrinsics.d(gasVar.b, Boolean.TRUE);
        String str2 = gasVar.f;
        tqt tqtVar = uoy.b;
        int iIntValue = num != null ? num.intValue() : 0;
        tqtVar.getClass();
        uoy uoyVarJ = tqt.j(iIntValue);
        Long lValueOf = Long.valueOf(jLongValue);
        Boolean bool2 = Boolean.FALSE;
        Boolean bool3 = gasVar.g;
        Integer numValueOf = bool3 != null ? Integer.valueOf(bool3.booleanValue() ? 1 : 0) : null;
        lfo lfoVar = gasVar.i;
        List list = lfoVar != null ? lfoVar.f19966a : null;
        if (list == null) {
            list = iun.f15405a;
        }
        List list2 = lfoVar != null ? lfoVar.b : null;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return new v9s(jLongValue2, dDoubleValue, j, dDoubleValue2, "", bigDecimalH, zD, str2, "", betPlayerZip, null, null, null, uoyVarJ, l, null, lValueOf, bool, l2, bool2, null, numValueOf, new EventParams(list, list2));
    }

    public static int V(umk umkVar, j1h0 j1h0Var) {
        if (umkVar instanceof rmk) {
            return ((rmk) umkVar).f30747a;
        }
        int iOrdinal = j1h0Var.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        t9f.b();
        return 0;
    }

    public static final void a(mm40 mm40Var, nyq0 nyq0Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1788641501);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(nyq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.a(0.0f);
                fetVar.o0(objP);
            }
            agk0 agk0Var = (agk0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.a(0.0f);
                fetVar.o0(objP2);
            }
            agk0 agk0Var2 = (agk0) objP2;
            Float fValueOf = Float.valueOf(agk0Var.l());
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new i3d(nyq0Var, agk0Var, null, b);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, fValueOf, (Function2) objP3);
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new fc3(agk0Var2, (byte) 3);
                fetVar.o0(objP4);
            }
            mm40 mm40VarT = i4w0.T(mm40Var, (Function1) objP4);
            b = i3 == 32 ? (byte) 1 : (byte) 0;
            Object objP5 = fetVar.P();
            if (b != 0 || objP5 == cl5Var) {
                objP5 = new k3d(nyq0Var, agk0Var, agk0Var2);
                fetVar.o0(objP5);
            }
            tj30 tj30Var = (tj30) objP5;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarT);
            mkd.c0.getClass();
            int i4 = ((((i2 >> 6) & 14) << 6) & 896) | 6;
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
            twn.v((i4 >> 6) & 14, ugdVar, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var, nyq0Var, ugdVar, i, (byte) 7);
        }
    }

    public static final void b(mm40 mm40Var, roh rohVar, roh rohVar2, toh tohVar, boolean z, fet fetVar, int i) {
        k6z k6zVar;
        fetVar.g0(613119775);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(rohVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(rohVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(soh.f32541a) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.e(tohVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            if (z) {
                fetVar.e0(797595718);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(797596642);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), M(1874869215, new i4a0(rohVar, tohVar, z, rohVar2), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((byte) 5, i, mm40Var2, (Object) rohVar, (Object) rohVar2, (Object) tohVar, z);
        }
    }

    public static final void c(mm40 mm40Var, b2i b2iVar, boolean z, Function0 function0, Function0 function1, fet fetVar) {
        function0.getClass();
        function1.getClass();
        if (b2iVar instanceof y1i) {
            fetVar.e0(588363721);
            y1i y1iVar = (y1i) b2iVar;
            wzb.l(mm40Var, y1iVar.f41855a, y1iVar.b, z, function0, function1, fetVar, 0);
            fetVar.r(false);
            return;
        }
        if (b2iVar instanceof z1i) {
            fetVar.e0(588376356);
            z1i z1iVar = (z1i) b2iVar;
            e3c.d(mm40Var, z1iVar.f43621a, z1iVar.b, z, function0, function1, fetVar, 0);
            fetVar.r(false);
            return;
        }
        if (!(b2iVar instanceof a2i)) {
            throw b1j.f(588362125, fetVar, false);
        }
        fetVar.e0(588388934);
        a2i a2iVar = (a2i) b2iVar;
        v3c.f(mm40Var, a2iVar.f125a, a2iVar.b, z, a2iVar.c, a2iVar.d, function0, function1, fetVar, 0);
        fetVar.r(false);
    }

    public static final void d(mm40 mm40Var, mpl mplVar, float f, float f2, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1446660869);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mplVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (!fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.X();
        } else if (mplVar instanceof kpl) {
            fetVar.e0(1772520150);
            kpl kplVar = (kpl) mplVar;
            String str = kplVar.c;
            int i3 = i2 & 126;
            int i4 = i2 << 3;
            e(mm40Var, kplVar, !(str == null || str.length() == 0), f, f2, function1, fetVar, i3 | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            fetVar.r(false);
        } else {
            if (!(mplVar instanceof lpl)) {
                throw b1j.f(-1328298167, fetVar, false);
            }
            fetVar.e0(-1328279976);
            int i5 = i2 & 14;
            int i6 = i2 >> 3;
            f(mm40Var, f, f2, fetVar, (i6 & 896) | i5 | (i6 & 112));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n04(mm40Var, (tpl) mplVar, f, f2, function1, i, (byte) 4);
        }
    }

    public static final void e(mm40 mm40Var, kpl kplVar, boolean z, float f, float f2, Function1 function1, fet fetVar, int i) {
        Function1 function2;
        float f3;
        cl5 cl5Var;
        int i2;
        jm40 jm40Var;
        int i3;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        String str = kplVar.c;
        mw3 mw3Var = uc9.c;
        xx7 xx7Var = gqw0.m;
        fetVar2.g0(-1195357820);
        int i4 = (i & 6) == 0 ? (fetVar2.g(mm40Var) ? 4 : 2) | i : i;
        int i5 = (i & 48) == 0 ? i4 | (fetVar2.g(kplVar) ? 32 : 16) : i4;
        if ((i & 384) == 0) {
            i5 |= fetVar2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i5 |= fetVar2.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= fetVar2.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        int i6 = i5;
        if (fetVar2.U(i6 & 1, (i6 & 74899) != 74898)) {
            float fE = pkd.e((int) (((yez) ((rhv0) fetVar2.k(bmd.u))).b() >> 32), fetVar2);
            jm40 jm40Var2 = jm40.b;
            pcy pcyVar = e7z.u1;
            cl5 cl5Var2 = ukd.f35823a;
            if (fE < 560.0f) {
                fetVar2.e0(-1330432026);
                mm40 mm40VarK = s5x0.K(jm40Var2, f, f2);
                zcl zclVar = qmk.f28987a;
                x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 0);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA, shdVar4);
                jpm0.o(fetVar2, bh90VarM, shdVar3);
                vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC0, shdVar);
                mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var2, 1.0f), 8.0f, 0.0f, 2);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA2, shdVar4);
                jpm0.o(fetVar2, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar);
                byte b = 2;
                mm40 mm40VarG = o7k0.g(o7k0.d(jm40Var2, 1.0f), 40.0f, 0.0f, 2);
                hjm hjmVar = new hjm(kplVar.b, null, null, null, null, null, false, null, null, false, null, null, 8190);
                kjm kjmVar = kjm.f18392a;
                Object objP = fetVar2.P();
                if (objP == cl5Var2) {
                    objP = new knl((byte) 3);
                    fetVar2.o0(objP);
                }
                nkb.h(mm40VarG, hjmVar, kjmVar, (Function0) objP, null, null, fetVar, 3456, 48);
                fetVar2 = fetVar;
                if (z) {
                    fetVar2.e0(-418473188);
                    mm40 mm40VarG2 = o7k0.g(o7k0.d(jm40Var2, 1.0f), 14.0f, 0.0f, 2);
                    String str2 = str == null ? "" : str;
                    long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    jm40Var = jm40Var2;
                    i3 = 131072;
                    v8q0.a(str2, mm40VarG2, textPrimary, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 0, 0, null, g1t0.g(), fetVar, 0, 384, 125944);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    jm40Var = jm40Var2;
                    i3 = 131072;
                    fetVar2.e0(-417998857);
                    fetVar2.r(false);
                }
                fetVar2.r(true);
                fetVar2.e0(-62199898);
                for (bpl bplVar : kplVar.f18682a) {
                    boolean zG = fetVar2.g(bplVar) | ((i6 & 458752) == i3);
                    Object objP2 = fetVar2.P();
                    if (zG || objP2 == cl5Var2) {
                        objP2 = new qe1(function1, bplVar, b);
                        fetVar2.o0(objP2);
                    }
                    wzb.o(jm40Var, bplVar, (Function0) objP2, fetVar2, 6);
                }
                ohs0.x(fetVar2, false, true, false);
                function2 = function1;
            } else {
                fetVar2.e0(-1328737504);
                mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                x5d x5dVarA3 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA3, shdVar4);
                jpm0.o(fetVar2, bh90VarM3, shdVar3);
                vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar);
                mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var2, 1.0f), f, f2, f, 0.0f, 8);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL2 = s5x0.L(o7k0.g(mm40VarN, 40.0f, 0.0f, 2), 8.0f, 0.0f, 2);
                hjm hjmVar2 = new hjm(kplVar.b, null, null, null, null, null, false, null, null, false, null, null, 8190);
                kjm kjmVar2 = kjm.f18392a;
                Object objP3 = fetVar2.P();
                if (objP3 == cl5Var2) {
                    objP3 = new knl((byte) 4);
                    fetVar2.o0(objP3);
                }
                nkb.h(mm40VarL2, hjmVar2, kjmVar2, (Function0) objP3, null, null, fetVar2, 3456, 48);
                if (z) {
                    fetVar2.e0(465874983);
                    mm40 mm40VarL3 = s5x0.L(o7k0.g(s5x0.L(o7k0.d(jm40Var2, 1.0f), f, 0.0f, 2), 14.0f, 0.0f, 2), 8.0f, 0.0f, 2);
                    String str3 = str == null ? "" : str;
                    long textPrimary2 = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    cl5Var = cl5Var2;
                    i2 = 3;
                    f3 = f;
                    function2 = function1;
                    v8q0.a(str3, mm40VarL3, textPrimary2, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 0, 0, null, g1t0.g(), fetVar, 0, 384, 125944);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    f3 = f;
                    cl5Var = cl5Var2;
                    function2 = function1;
                    i2 = 3;
                    fetVar2.e0(466439524);
                    fetVar2.r(false);
                }
                mm40 mm40VarN2 = s5x0.N(jm40Var2, 0.0f, 10.0f, 0.0f, 0.0f, 13);
                ngv ngvVar = new ngv(i2);
                byte b2 = 14;
                qw3 qw3Var = new qw3(8.0f, true, new jf4(b2));
                qw3 qw3Var2 = new qw3(8.0f, true, new jf4(b2));
                lh80 lh80VarT = s5x0.t(f3, 0.0f, 2);
                boolean z2 = ((i6 & 458752) == 131072) | ((i6 & 112) == 32);
                Object objP4 = fetVar2.P();
                if (z2 || objP4 == cl5Var) {
                    objP4 = new ngh(kplVar, function2, (byte) 28);
                    fetVar2.o0(objP4);
                }
                g8x.i(ngvVar, mm40VarN2, null, lh80VarT, qw3Var2, qw3Var, null, false, null, (Function1) objP4, fetVar, 0, 916);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
            }
        } else {
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zol(mm40Var, kplVar, z, f, f2, function2, i, (byte) 1);
        }
    }

    public static final void f(mm40 mm40Var, float f, float f2, fet fetVar, int i) {
        int i2;
        float f3;
        boolean z;
        fetVar.g0(-915650593);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f3 = f2;
            i2 |= fetVar.d(f3) ? 256 : 128;
        } else {
            f3 = f2;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float fE = pkd.e((int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32), fetVar);
            mm40 mm40VarK = s5x0.K(mm40Var, f, f2);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            qxw.o(fetVar, o7k0.e(jm40Var, 10.0f));
            mm40 mm40VarE = o7k0.e(s5x0.L(o7k0.s(jm40Var, 128.0f), 8.0f, 0.0f, 2), 20.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, rw2.d(lgb.J(mm40VarE, ugg0Var), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 10.0f));
            qxw.o(fetVar, rw2.d(lgb.J(o7k0.e(s5x0.L(o7k0.s(jm40Var, 160.0f), 8.0f, 0.0f, 2), 14.0f), ugg0Var), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 10.0f));
            if (fE < 560.0f) {
                fetVar.e0(1160405197);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                mm40 mm40VarE2 = o7k0.e(o7k0.d(jm40Var, 1.0f), 52.0f);
                zcl zclVar2 = qmk.m;
                qxw.o(fetVar, rw2.d(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE2), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 8.0f));
                qxw.o(fetVar, rw2.d(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(jm40Var, 1.0f), 52.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 8.0f));
                qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(jm40Var, 1.0f), 52.0f)), vbc.d0(null, fetVar, 0, 1)));
                fetVar.r(true);
                fetVar.r(false);
                z = true;
            } else {
                fetVar.e0(1161502876);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarD);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar);
                jpm0.o(fetVar, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar4);
                zhg0 zhg0Var = zhg0.f44392a;
                z = true;
                mm40 mm40VarE3 = o7k0.e(zhg0Var.a(1.0f, jm40Var, true), 52.0f);
                zcl zclVar3 = qmk.m;
                qxw.o(fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE3), vbc.d0(null, fetVar, 0, 1)));
                qxw.o(fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.e(zhg0Var.a(1.0f, jm40Var, true), 52.0f)), vbc.d0(null, fetVar, 0, 1)));
                qxw.o(fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.e(zhg0Var.a(1.0f, jm40Var, true), 52.0f)), vbc.d0(null, fetVar, 0, 1)));
                fetVar.r(true);
                fetVar.r(false);
            }
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wol(mm40Var, f, f3, i, (byte) 2);
        }
    }

    public static final void g(mm40 mm40Var, String str, y9q0 y9q0Var, a4x a4xVar, sso0 sso0Var, boolean z, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        str.getClass();
        a4xVar.getClass();
        fetVar2.g0(480428033);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(y9q0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(a4xVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(sso0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar2.i(function0) ? 1048576 : 524288;
        }
        if (fetVar2.U(i2 & 1, (599187 & i2) != 599186)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 8.0f, 0.0f, 8.0f, 0.0f, 10);
            int i3 = i2;
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar2, 54);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
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
            v8q0.a(str, o7k0.u(s5x0.N(jm40Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), 0.0f, 136.0f, 1), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0Var, fetVar, (i3 >> 3) & 14, ((i3 << 15) & 29360128) | 24960, 110584);
            f7k.m(new x7z(1.0f, false), a4xVar, sso0Var, function0, fetVar, ((i3 >> 6) & 1008) | ((i3 >> 9) & 7168));
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (z) {
                fetVar2.e0(949796459);
                mbc.o(zfi0.f44303a, s5x0.L(jm40Var, 8.0f, 0.0f, 2), false, fetVar2, 6, 4);
                fetVar2.r(false);
            } else {
                fetVar2.e0(949960139);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o84(mm40Var, str, y9q0Var, a4xVar, sso0Var, z, function0, i);
        }
    }

    public static final void h(mm40 mm40Var, q8m q8mVar, n8m n8mVar, Function1 function1, fet fetVar, int i, int i2) {
        q8mVar.getClass();
        function1.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        if ((i2 & 4) != 0) {
            n8mVar = e3c.v(fetVar);
        }
        if (q8mVar instanceof p8m) {
            fetVar.e0(694602290);
            v3c.o(0, fetVar, mm40Var);
            fetVar.r(false);
        } else {
            if (!(q8mVar instanceof o8m)) {
                throw b1j.f(-1501615980, fetVar, false);
            }
            fetVar.e0(694723438);
            mm40 mm40Var2 = mm40Var;
            wzb.q(mm40Var2, ((o8m) q8mVar).f24837a, n8mVar, function1, fetVar, i & 8078);
            fetVar.r(false);
        }
    }

    public static final void i(mm40 mm40Var, cpm cpmVar, Function1 function1, fet fetVar, int i, int i2) {
        cpmVar.getClass();
        function1.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        mm40 mm40Var2 = mm40Var;
        zcl zclVar = qmk.f28987a;
        lh80 lh80VarT = s5x0.t(qmk.a(fetVar).c, 0.0f, 2);
        if (cpmVar instanceof apm) {
            fetVar.e0(1675315890);
            l7x.x(mm40Var2, androidx.compose.runtime.e.f(cpmVar, fetVar), lh80VarT, function1, fetVar, i & 8078);
            fetVar.r(false);
        } else {
            if (!(cpmVar instanceof bpm)) {
                throw b1j.f(54040216, fetVar, false);
            }
            fetVar.e0(54053354);
            vcg0 vcg0Var = vcg0.f37186a;
            p7x.i(mm40Var2, lh80VarT, fetVar, (i & 14) | ((i >> 3) & 112));
            fetVar.r(false);
        }
    }

    public static final void j(mm40 mm40Var, gga ggaVar, boolean z, Function1 function1, fet fetVar) {
        if (ggaVar instanceof tfa) {
            fetVar.e0(-1385996685);
            e3c.h(mm40Var, (tfa) ggaVar, z, function1, fetVar, 0);
            fetVar.r(false);
        } else if (ggaVar instanceof zfa) {
            fetVar.e0(-1385990221);
            v3c.p(mm40Var, (zfa) ggaVar, z, function1, fetVar, 0);
            fetVar.r(false);
        } else {
            if (!(ggaVar instanceof fga)) {
                throw b1j.f(-1385997821, fetVar, false);
            }
            fetVar.e0(-1385983722);
            vcc.k(mm40Var, ((fga) ggaVar).f(), fetVar, 0);
            fetVar.r(false);
        }
    }

    public static final void k(int i, fet fetVar) {
        fetVar.g0(530930471);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            long jI = qbc.i(96.0f, 128.0f);
            ugg0 ugg0VarA = vgg0.a(24.0f);
            lh80 lh80Var = new lh80(12.0f, 8.0f, 12.0f, 8.0f);
            long jI2 = qbc.i(72.0f, 12.0f);
            ugg0 ugg0VarA2 = vgg0.a(360.0f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarO = o7k0.o(jI, jm40Var);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarO);
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
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.n(jm40Var, 96.0f), ugg0VarA), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(lgb.J(o7k0.o(jI2, s5x0.I(o7k0.d(jm40Var, 1.0f), lh80Var)), ugg0VarA2), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f4m(i, (byte) 18);
        }
    }

    public static final void l(amg amgVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(802530145);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(amgVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = twn.s(fetVar);
            }
            List list = (List) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = twn.s(fetVar);
            }
            List list2 = (List) objP2;
            Context context = (Context) fetVar.k(dy2.b);
            mm40 mm40VarE0 = o2e.e0((mm40) fetVar.k(t0h.f33118a), "DICE_ANDROID_VIEW_BINDING");
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = a5o.f280a;
                fetVar.o0(objP3);
            }
            xdr xdrVar = (xdr) ((jhy) objP3);
            boolean zI = fetVar.i(list) | ((i2 & 14) == 4) | fetVar.i(list2) | fetVar.i(context);
            Object objP4 = fetVar.P();
            if (zI || objP4 == cl5Var) {
                enm enmVar = new enm((Object) amgVar, (Object) list, (Object) list2, (Object) context, (byte) 3);
                fetVar.o0(enmVar);
                objP4 = enmVar;
            }
            y860.f(xdrVar, mm40VarE0, (Function1) objP4, fetVar, 6, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(amgVar, i, b);
        }
    }

    public static final void m(int i, fet fetVar, boolean z) {
        fetVar.g0(998464397);
        byte b = 2;
        int i2 = (fetVar.g(soh.f32541a) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n4c.l(null, new lpm(opm.f25648a, new gpm()), z, fetVar, 1);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new obg(b, i, z);
        }
    }

    public static final void n(mm40 mm40Var, pyp pypVar, l7m0 l7m0Var, float f, float f2, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        boolean z;
        Object objJ;
        jm40 jm40Var;
        boolean z2;
        boolean z3;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        zx7 zx7Var = gqw0.f11754a;
        pypVar.getClass();
        function0.getClass();
        fetVar2.g0(-2054289530);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(pypVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(l7m0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(function0) ? 131072 : 65536;
        }
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            float fFloatValue = ((Number) l7m0Var.getValue()).floatValue();
            oms0 oms0VarZ = phu0.Z(l7m0Var.getValue(), null, fetVar2, 0, 2);
            p4 p4Var = oms0VarZ.f25519a;
            Object[] objArr = new Object[0];
            boolean z4 = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            boolean z5 = z4;
            cl5 cl5Var = ukd.f35823a;
            if (z5 || objP == cl5Var) {
                objP = new zwp(l7m0Var, (byte) 2);
                fetVar2.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar2);
            lxs0 lxs0Var = hp4.l;
            if (oms0VarZ.h()) {
                z = false;
                objJ = vqd.j(fetVar2, 1666827533, false, p4Var);
            } else {
                fetVar2.e0(1666573488);
                boolean zG = fetVar2.g(oms0VarZ);
                objJ = fetVar2.P();
                if (zG || objJ == cl5Var) {
                    rfk0 rfk0VarJ = vdx.J();
                    Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                    rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                    try {
                        Object objY0 = p4Var.y0();
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        fetVar2.o0(objY0);
                        objJ = objY0;
                    } catch (Throwable th) {
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        throw th;
                    }
                }
                fetVar2.r(false);
                z = false;
            }
            float fFloatValue2 = ((Number) objJ).floatValue();
            fetVar2.e0(1171317545);
            ycl yclVarG = dw9.g(fetVar2, z, l7x.O(f, f2, fFloatValue2));
            boolean zG2 = fetVar2.g(oms0VarZ);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = jgk0.b(new elb(oms0VarZ, (byte) 24));
                fetVar2.o0(objP2);
            }
            float fFloatValue3 = ((Number) ((l7m0) objP2).getValue()).floatValue();
            fetVar2.e0(1171317545);
            ycl yclVarG2 = dw9.g(fetVar2, false, l7x.O(f, f2, fFloatValue3));
            boolean zG3 = fetVar2.g(oms0VarZ);
            Object objP3 = fetVar2.P();
            if (zG3 || objP3 == cl5Var) {
                objP3 = jgk0.b(new elb(oms0VarZ, (byte) 25));
                fetVar2.o0(objP3);
            }
            cms0 cms0VarE = phu0.E(oms0VarZ, yclVarG, yclVarG2, w6x.k((ams0) ((l7m0) objP3).getValue(), fetVar2, -82863326, false), lxs0Var, fetVar2, 0);
            fetVar2 = fetVar2;
            boolean z6 = pypVar instanceof nyp;
            pcy pcyVar = e7z.u1;
            jm40 jm40Var2 = jm40.b;
            if (z6) {
                fetVar2.e0(-349756240);
                mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var2, 1.0f), ((ycl) ((hgk0) cms0VarE.j).getValue()).f42389a);
                tj30 tj30VarC = zq8.c(zx7Var, false);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar4);
                jpm0.o(fetVar2, bh90VarM, shdVar3);
                vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC0, shdVar);
                n9m n9mVar = ((nyp) pypVar).f24339a;
                jm40Var = jm40Var2;
                p(n9mVar.f23148a, fFloatValue, l7m0VarY, function0, fetVar2, (i2 >> 6) & 7168);
                if (fFloatValue < 1.0f) {
                    fetVar2.e0(-800370135);
                    boolean zD = fetVar2.d(fFloatValue);
                    Object objP4 = fetVar2.P();
                    if (zD || objP4 == cl5Var) {
                        objP4 = new f54(fFloatValue, (byte) 20);
                        fetVar2.o0(objP4);
                    }
                    mm40 mm40VarC = o7k0.c(i4w0.T(jm40Var, (Function1) objP4), 1.0f);
                    tj30 tj30VarC2 = zq8.c(gqw0.h, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarC);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, shdVar4);
                    jpm0.o(fetVar2, bh90VarM2, shdVar3);
                    vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, shdVar);
                    fetVar2.e0(-1813621762);
                    z2 = false;
                    o9m.c(jm40Var, n9mVar, fetVar2, 0);
                    z3 = true;
                    ohs0.x(fetVar2, false, true, false);
                } else {
                    z2 = false;
                    z3 = true;
                    fetVar2.e0(-799919426);
                    fetVar2.r(false);
                }
                fetVar2.r(z3);
                fetVar2.r(z2);
            } else {
                jm40Var = jm40Var2;
                if (!(pypVar instanceof oyp)) {
                    throw b1j.f(1512736638, fetVar2, false);
                }
                fetVar2.e0(-348800417);
                mm40 mm40VarE2 = o7k0.e(o7k0.d(jm40Var, 1.0f), f);
                tj30 tj30VarC3 = zq8.c(zx7Var, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE2);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC3, shdVar4);
                jpm0.o(fetVar2, bh90VarM3, shdVar3);
                vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar);
                p("", fFloatValue, l7m0VarY, function0, fetVar2, ((i2 >> 6) & 7168) | 6);
                fetVar2.r(true);
                fetVar2.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hbd(mm40Var2, pypVar, l7m0Var, f, f2, function0, i);
        }
    }

    public static final void o(c280 c280Var, boolean z, fet fetVar, int i) {
        int i2;
        fetVar.g0(-491930988);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(c280Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        byte b = 1;
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean z2 = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new ddf(c280Var, b);
                fetVar.o0(objP);
            }
            kkb.p(1, fetVar, null, (Function0) objP);
            if (z) {
                fetVar.e0(159238081);
                mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.h);
                zcl zclVar = qmk.f28987a;
                s(0, fetVar, ffb0.R(mm40VarB, 0.0f, 8.0f, 1));
                fetVar.r(false);
            } else {
                fetVar.e0(159410100);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ooh(c280Var, z, i, b2);
        }
    }

    public static final void p(String str, float f, l7m0 l7m0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        l7m0 l7m0Var2;
        fetVar.g0(1273254980);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            l7m0Var2 = l7m0Var;
            i2 |= fetVar.g(l7m0Var2) ? 256 : 128;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarX = yyw.X(o7k0.d(jm40.b, 1.0f), null, fetVar, 1);
            boolean zH = fetVar.h(((Boolean) l7m0Var2.getValue()).booleanValue());
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                StaticColors staticColors = StaticColors.INSTANCE;
                imm immVar = new imm(klm.f18497a, mlm.f21997a, fmm.f9790a, staticColors.m121getTransparent0d7_KjU(), !((Boolean) l7m0Var2.getValue()).booleanValue(), new y3d(staticColors.m128getWhite40d7_KjU()));
                fetVar.o0(immVar);
                objP = immVar;
            }
            imm immVar2 = (imm) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new vkm(1);
                fetVar.o0(objP2);
            }
            hlm.c(mm40VarX, immVar2, (vkm) objP2, null, null, null, null, null, null, M(470500424, new wr4(function0, (byte) 3), fetVar), M(598507286, new blb(f, str), fetVar), null, fetVar, 805306752, 6, 2552);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zm2((Object) str, f, (Object) l7m0Var, (wdr) function0, i, (byte) 1);
        }
    }

    public static final void q(mm40 mm40Var, roh rohVar, boolean z, boolean z2, fet fetVar, int i) {
        c280 c280Var = rohVar.b;
        String str = rohVar.f30836a;
        fetVar.g0(588937606);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(rohVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
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
            if (z2) {
                fetVar.e0(-372982590);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                r(6, 0, fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), str);
                o(c280Var, z, fetVar, (i2 >> 3) & 112);
                fetVar.r(false);
            } else {
                fetVar.e0(-372724608);
                o(c280Var, z, fetVar, (i2 >> 3) & 112);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                r(5, 0, fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), str);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yw(mm40Var, (Object) rohVar, z, z2, i, (byte) 1);
        }
    }

    public static final void r(int i, int i2, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(-656865483);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.e(i) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40Var, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(i), 0L, 2, false, 3, 0, null, g1t0.n(), fetVar, ((i3 >> 3) & 14) | ((i3 << 3) & 112), ((i3 >> 6) & 14) | 24960, 109560);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new poh(mm40Var, str, i, i2, (byte) 0);
        }
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1664601615);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 16.0f);
            zfn zfnVar = m8m0.f21378a;
            long jM98getGreen0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m98getGreen0d7_KjU();
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, jM98getGreen0d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            ((ijg) fetVar2.k(jjg.f16616a)).getClass();
            mm40 mm40VarL = s5x0.L(i120.S(mm40VarQ, 2.0f, ijg.m, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a("WIN", null, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.c(), fetVar, 6, 24576, 114682);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 15);
        }
    }

    public static final void t(LinearLayout linearLayout, ArrayList arrayList, List list, boolean z) {
        Iterator it = new ihu0(linearLayout).iterator();
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
                    zlg zlgVar = (zlg) obj;
                    e1o0 e1o0Var = (e1o0) CollectionsKt.W(i2, list);
                    if (e1o0Var == null) {
                        View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.synthetic_cyber_dice_player_round_item, (ViewGroup) linearLayout, false);
                        int i4 = R.id.tvDiceOneScore;
                        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvDiceOneScore);
                        if (textView != null) {
                            i4 = R.id.tvDiceTwoScore;
                            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvDiceTwoScore);
                            if (textView2 != null) {
                                i4 = R.id.tvTotalRoundScore;
                                TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvTotalRoundScore);
                                if (textView3 != null) {
                                    LinearLayout linearLayout2 = (LinearLayout) viewInflate;
                                    e1o0 e1o0Var2 = new e1o0(linearLayout2, textView, textView2, textView3);
                                    if (z) {
                                        linearLayout2.setLayoutDirection(1);
                                    }
                                    linearLayout.addView(linearLayout2);
                                    list.add(e1o0Var2);
                                    e1o0Var = e1o0Var2;
                                }
                            }
                        }
                        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
                        return;
                    }
                    e1o0Var.b.setText(zlgVar.f44580a);
                    e1o0Var.c.setText(zlgVar.b);
                    e1o0Var.d.setText(zlgVar.c);
                    i2 = i3;
                }
                return;
            }
            Object next = jhu0Var.next();
            int i5 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ((View) next).setVisibility(i < arrayList.size() ? 0 : 8);
            i = i5;
        }
    }

    public static final int u(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static final lc00 v(mrf mrfVar, m9s m9sVar) {
        mrfVar.getClass();
        List list = mrfVar.c;
        fof fofVar = mrfVar.f22269a;
        lc00 lc00VarB = kotlin.collections.a.b();
        c0o c0oVar = xmf.c;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (y2VarH.hasNext()) {
            xmf xmfVar = (xmf) y2VarH.next();
            int iOrdinal = xmfVar.ordinal();
            short s = xmfVar.f41120a.f33572a;
            switch (iOrdinal) {
                case 0:
                    if (mbc.V(fofVar)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 1:
                    if (ibc.p0(fofVar)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 2:
                    fofVar.getClass();
                    if (fofVar.f9878a.i.isEmpty()) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 3:
                    if (vcc.T(fofVar, list)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 4:
                    list.getClass();
                    if (list.isEmpty()) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 5:
                    if (xbc.V(mrfVar.b)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                case 6:
                    if (x2x.b0(mrfVar.d, m9sVar)) {
                        lc00VarB.add(Integer.valueOf(s));
                    }
                    break;
                default:
                    t9f.b();
                    return null;
            }
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final hjw w(g2v g2vVar, CyberGamesPage cyberGamesPage, jih jihVar, boolean z, boolean z2, Function0 function0) {
        cyberGamesPage.getClass();
        if ((kih.b(jihVar, cyberGamesPage, z2) && !z) || kih.b(jihVar, cyberGamesPage, z2)) {
            return x(g2vVar);
        }
        if (kih.a(jihVar, cyberGamesPage, z2)) {
            return z ? new hjw(new xiw(g2v.b(g2vVar, ozb.J(-1L, pb10.v), null, null, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE))) : x(g2vVar);
        }
        return new hjw(wiw.f39237a, (a4x) function0.invoke(), false);
    }

    public static final hjw x(g2v g2vVar) {
        return new hjw(new xiw(g2v.b(g2vVar, ozb.J(-1L, pb10.v), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE)));
    }

    public static final boolean y(a5w a5wVar) {
        a5wVar.getClass();
        return tx3.l0(new q4f[]{q4f.d, q4f.i, q4f.f, q4f.j, q4f.h, q4f.e, q4f.g, q4f.k, q4f.x, q4f.l}).contains(a5wVar.c());
    }

    public static final long z(int i, int i2, f7k0 f7k0Var, j1h0 j1h0Var, f7k0 f7k0Var2) {
        int i3;
        int i4;
        if (!Intrinsics.d(f7k0Var, f7k0.c)) {
            i = V(f7k0Var.f9062a, j1h0Var);
            i2 = V(f7k0Var.b, j1h0Var);
        }
        umk umkVar = f7k0Var2.f9062a;
        umk umkVar2 = f7k0Var2.b;
        if ((umkVar instanceof rmk) && i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && i > (i4 = ((rmk) umkVar).f30747a)) {
            i = i4;
        }
        if ((umkVar2 instanceof rmk) && i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && i2 > (i3 = ((rmk) umkVar2).f30747a)) {
            i2 = i3;
        }
        return z1x.B(i, i2);
    }
}
