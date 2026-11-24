package a;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Display;
import android.view.RoundedCorner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleFighting;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lmc {
    public static final void A(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(103330328);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 8);
        }
    }

    public static final void B(EventCardMiddleFighting eventCardMiddleFighting, gvr gvrVar) {
        String strS = vsm0.s(gvrVar.f11988a, gvrVar.c);
        Context context = eventCardMiddleFighting.getContext();
        context.getClass();
        LoadableShapeableImageView.i(eventCardMiddleFighting.q.t, strS, context.getDrawable(R.drawable.no_photo_new), 12);
        eventCardMiddleFighting.setTopTeamName(gvrVar.b);
    }

    public static final void C(EventCardMiddleFighting eventCardMiddleFighting, hvr hvrVar) {
        eventCardMiddleFighting.setResultGameTitle(hvrVar.f13738a);
        String str = hvrVar.b;
        f5h0 f5h0Var = hvrVar.c;
        int i = EventCardMiddleFighting.w;
        hbo hboVar = eventCardMiddleFighting.q;
        wvb.c0(hboVar.u, str, f5h0Var);
        wvb.c0(hboVar.f, hvrVar.d, hvrVar.e);
    }

    public static final void D(EventCardMiddleFighting eventCardMiddleFighting, kvr kvrVar) {
        String strS = vsm0.s(kvrVar.f18968a, kvrVar.c);
        Context context = eventCardMiddleFighting.getContext();
        context.getClass();
        LoadableShapeableImageView.i(eventCardMiddleFighting.q.e, strS, context.getDrawable(R.drawable.no_photo_new), 12);
        eventCardMiddleFighting.setBotTeamName(kvrVar.b);
    }

    public static final String E(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(ujn.h);
        String strConcat = "cyberstatistic/v1/image/".concat(str);
        if (strConcat.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(strConcat, ujn.h, false) || kotlin.text.c.x(strConcat, "https://", false)) {
            sb.setLength(0);
            sb.append(strConcat);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(strConcat, '/'));
        }
        return sb.toString();
    }

    public static final String F(wm40 wm40Var, hfk0 hfk0Var) {
        wm40Var.getClass();
        hfk0Var.getClass();
        vjj vjjVarJ = wm40Var.j();
        vjjVarJ.getClass();
        g950 name = wm40Var.getName();
        g950 g950Var = lxk0.f20818a;
        if (name == null || name.b) {
            name = lxk0.c;
        }
        String strC = name.c();
        if (vjjVarJ instanceof mg80) {
            swq swqVar = ((ng80) ((mg80) vjjVarJ)).f;
            if (swqVar.f32934a.c()) {
                return strC;
            }
            return kotlin.text.c.s(swqVar.f32934a.f34663a, '.', '/') + '/' + strC;
        }
        wm40 wm40Var2 = vjjVarJ instanceof wm40 ? (wm40) vjjVarJ : null;
        if (wm40Var2 == null) {
            itt0.l("Unexpected container: ", vjjVarJ, " for ", wm40Var);
            return null;
        }
        return F(wm40Var2, hfk0Var) + '$' + strC;
    }

    public static final o0x G(Context context, g5s g5sVar, int i, int i2) {
        context.getClass();
        g5sVar.getClass();
        int i3 = g5sVar.d;
        int i4 = g5sVar.c;
        int i5 = g5sVar.e;
        if (i == 0) {
            return new m0x(i2, null, 6);
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(i3);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i4);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(i5);
        Drawable drawableU = epv0.U(i2, context);
        Drawable drawableU2 = epv0.U(i, context);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (drawableU != null) {
            drawableU.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize2);
        }
        if (drawableU != null) {
            drawableU.draw(canvas);
        }
        int i6 = (dimensionPixelSize - dimensionPixelSize3) / 2;
        int i7 = (dimensionPixelSize2 - dimensionPixelSize3) / 2;
        if (drawableU2 != null) {
            drawableU2.setBounds(i6, i7, i6 + dimensionPixelSize3, dimensionPixelSize3 + i7);
        }
        if (drawableU2 != null) {
            drawableU2.draw(canvas);
        }
        return new l0x(new BitmapDrawable(resources, bitmapCreateBitmap));
    }

    public static ydv0 H(k4e k4eVar, int i, ArrayList arrayList, ydv0 ydv0Var) {
        int i2;
        int i3 = i == 0 ? k4eVar.s0 : k4eVar.t0;
        if (i3 != -1 && (ydv0Var == null || i3 != ydv0Var.b)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                ydv0 ydv0Var2 = (ydv0) arrayList.get(i4);
                if (ydv0Var2.b == i3) {
                    if (ydv0Var != null) {
                        ydv0Var.c(i, ydv0Var2);
                        arrayList.remove(ydv0Var);
                    }
                    ydv0Var = ydv0Var2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return ydv0Var;
        }
        if (ydv0Var == null) {
            if (k4eVar instanceof jvv) {
                jvv jvvVar = (jvv) k4eVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= jvvVar.v0) {
                        i2 = -1;
                        break;
                    }
                    k4e k4eVar2 = jvvVar.u0[i5];
                    if ((i == 0 && (i2 = k4eVar2.s0) != -1) || (i == 1 && (i2 = k4eVar2.t0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        ydv0 ydv0Var3 = (ydv0) arrayList.get(i6);
                        if (ydv0Var3.b == i2) {
                            ydv0Var = ydv0Var3;
                            break;
                        }
                    }
                }
            }
            if (ydv0Var == null) {
                ydv0Var = new ydv0();
                ydv0Var.f42459a = new ArrayList();
                ydv0Var.d = null;
                ydv0Var.e = -1;
                int i7 = ydv0.f;
                ydv0.f = i7 + 1;
                ydv0Var.b = i7;
                ydv0Var.c = i;
            }
            arrayList.add(ydv0Var);
        }
        ArrayList arrayList2 = ydv0Var.f42459a;
        if (arrayList2.contains(k4eVar)) {
            return ydv0Var;
        }
        arrayList2.add(k4eVar);
        if (k4eVar instanceof qiv) {
            qiv qivVar = (qiv) k4eVar;
            qivVar.x0.c(qivVar.y0 == 0 ? 1 : 0, ydv0Var, arrayList);
        }
        int i8 = ydv0Var.b;
        if (i == 0) {
            k4eVar.s0 = i8;
            k4eVar.J.c(i, ydv0Var, arrayList);
            k4eVar.L.c(i, ydv0Var, arrayList);
        } else {
            k4eVar.t0 = i8;
            k4eVar.K.c(i, ydv0Var, arrayList);
            k4eVar.N.c(i, ydv0Var, arrayList);
            k4eVar.M.c(i, ydv0Var, arrayList);
        }
        k4eVar.Q.c(i, ydv0Var, arrayList);
        return ydv0Var;
    }

    public static final dfa0 I(q8h q8hVar, q8h q8hVar2) {
        String str = q8hVar.f;
        r8h r8hVar = q8hVar.g;
        Float f = r8hVar.f30025a;
        r8h r8hVar2 = q8hVar2.g;
        return new dfa0(dyb.g0(uvw.E(f, r8hVar2.f30025a, ""), uvw.E(r8hVar.c, r8hVar2.c, ""), uvw.G(r8hVar.d, r8hVar2.d), uvw.E(r8hVar.e, r8hVar2.e, Separators.PERCENT), uvw.E(r8hVar.f, r8hVar2.f, ""), uvw.E(r8hVar.b, r8hVar2.b, "")), str);
    }

    public static tgg0 J(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        jf4.o(twn.m(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new tgg0(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static final boolean K(ArrayList arrayList, List list) {
        list.getClass();
        int iA = wp20.a(r3d.q(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : list) {
            linkedHashMap.put(Long.valueOf(((z0w) obj).F), obj);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (linkedHashMap.containsKey(Long.valueOf(((xco) it.next()).f40655a))) {
                return true;
            }
        }
        return false;
    }

    public static boolean L(mp9 mp9Var) {
        mp9Var.getClass();
        if (!ld9.d.contains(mp9Var.getName())) {
            return false;
        }
        if (CollectionsKt.L(ld9.c, rek.c(mp9Var)) && mp9Var.z().isEmpty()) {
            return true;
        }
        if (!ary.A(mp9Var)) {
            return false;
        }
        Collection collectionK = mp9Var.k();
        collectionK.getClass();
        Collection<mp9> collection = collectionK;
        if (collection.isEmpty()) {
            return false;
        }
        for (mp9 mp9Var2 : collection) {
            mp9Var2.getClass();
            if (L(mp9Var2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean M() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Huawei")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Huawei")) {
                return false;
            }
        }
        return "HWANE".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean N() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Nokia")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Nokia")) {
                return false;
            }
        }
        String str3 = Build.DEVICE;
        return "B2N".equalsIgnoreCase(str3) || "B2N_sprout".equalsIgnoreCase(str3);
    }

    public static boolean O() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("OnePlus")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("OnePlus")) {
                return false;
            }
        }
        return "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean P() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("OnePlus")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("OnePlus")) {
                return false;
            }
        }
        return "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    public static boolean Q() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Redmi")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Redmi")) {
                return false;
            }
        }
        return "joyeuse".equalsIgnoreCase(Build.DEVICE);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0039 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public static boolean R() {
        String upperCase;
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (str2.equalsIgnoreCase("Samsung")) {
                if ("a05s".equalsIgnoreCase(Build.DEVICE)) {
                    String str3 = Build.MODEL;
                    str3.getClass();
                    upperCase = str3.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    if (StringsKt.O(upperCase, "SM-A057", false)) {
                        return true;
                    }
                }
            }
        } else if ("a05s".equalsIgnoreCase(Build.DEVICE)) {
            String str4 = Build.MODEL;
            str4.getClass();
            upperCase = str4.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            if (StringsKt.O(upperCase, "SM-A057", false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean S() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        return "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean T() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        return "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27;
    }

    public static boolean U() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        String str3 = Build.DEVICE;
        return "q4q".equalsIgnoreCase(str3) || "SCG16".equalsIgnoreCase(str3) || "SC-55C".equalsIgnoreCase(str3);
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:1: B:79:0x01ef->B:162:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x012a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f5  */
    public static final Object V(wsy wsyVar, azs0 azs0Var, xdr xdrVar) {
        iwb0 iwb0VarU;
        iwb0 iwb0VarS;
        boolean z;
        twq twqVarF;
        qlc qlcVarH;
        Object igyVar;
        List list;
        Iterator it;
        jgy jgyVar;
        boolean z2;
        wsy wsyVar2;
        azs0 azs0Var2;
        Object objV;
        kkq kkqVarY;
        hfk0 hfk0Var = hfk0.f;
        wsyVar.getClass();
        xdrVar.getClass();
        if (bfb.Y(wsyVar)) {
            xx40 xx40Var = ann0.f1165a;
            bfb.Y(wsyVar);
            ary aryVarQ = vsm0.q(wsyVar);
            g93 annotations = wsyVar.getAnnotations();
            wsy wsyVarV = bfb.V(wsyVar);
            List listQ = bfb.Q(wsyVar);
            List listW = bfb.W(wsyVar);
            ArrayList arrayList = new ArrayList(r3d.q(listW, 10));
            Iterator it2 = listW.iterator();
            while (it2.hasNext()) {
                arrayList.add(((pzs0) it2.next()).b());
            }
            ays0.b.getClass();
            ays0 ays0Var = ays0.c;
            iys0 iys0VarH = ann0.f1165a.h();
            bfb.X(wsyVar);
            wsy wsyVarB = ((pzs0) CollectionsKt.d0(wsyVar.J())).b();
            wsyVarB.getClass();
            ArrayList arrayListR0 = CollectionsKt.r0(arrayList, ucx.g0(ays0Var, iys0VarH, kotlin.collections.a.c(new q4m0(wsyVarB)), false));
            kzj0 kzj0VarP = vsm0.q(wsyVar).p();
            kzj0VarP.getClass();
            return V(bfb.N(aryVarQ, annotations, wsyVarV, listQ, arrayListR0, kzj0VarP, false).k0(wsyVar.U()), azs0Var, xdrVar);
        }
        kzj0 kzj0VarZ = rcb.Z(wsyVar);
        if (kzj0VarZ == null && ((kkqVarY = rcb.Y(wsyVar)) == null || (kzj0VarZ = rcb.W0(kkqVarY)) == null)) {
            kzj0VarZ = rcb.Z(wsyVar);
            kzj0VarZ.getClass();
        }
        iys0 iys0VarO1 = rcb.o1(kzj0VarZ);
        if (rcb.G0(iys0VarO1)) {
            iys0VarO1.getClass();
            if (iys0VarO1 instanceof iys0) {
                foc focVarN = iys0VarO1.n();
                focVarN.getClass();
                iwb0VarU = ary.u((wm40) focVarN);
            } else {
                c99.s(kng0.g(sre0.f32672a, iys0VarO1.getClass(), dw9.u("ClassicTypeSystemContext couldn't handle: ", iys0VarO1, ", ")));
                iwb0VarU = null;
            }
            if (iwb0VarU != null) {
                switch (iwb0VarU) {
                    case BOOLEAN:
                        jgyVar = kgy.f18262a;
                        break;
                    case CHAR:
                        jgyVar = kgy.b;
                        break;
                    case BYTE:
                        jgyVar = kgy.c;
                        break;
                    case SHORT:
                        jgyVar = kgy.d;
                        break;
                    case INT:
                        jgyVar = kgy.e;
                        break;
                    case FLOAT:
                        jgyVar = kgy.f;
                        break;
                    case LONG:
                        jgyVar = kgy.g;
                        break;
                    case DOUBLE:
                        jgyVar = kgy.h;
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                if (rcb.P0(wsyVar)) {
                    z2 = true;
                } else {
                    swq swqVar = bey.q;
                    swqVar.getClass();
                    if (rcb.C0(wsyVar, swqVar)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                igyVar = osm0.g(jgyVar, z2);
            } else {
                iys0VarO1.getClass();
                if (iys0VarO1 instanceof iys0) {
                    foc focVarN2 = iys0VarO1.n();
                    focVarN2.getClass();
                    iwb0VarS = ary.s((wm40) focVarN2);
                } else {
                    c99.s(kng0.g(sre0.f32672a, iys0VarO1.getClass(), dw9.u("ClassicTypeSystemContext couldn't handle: ", iys0VarO1, ", ")));
                    iwb0VarS = null;
                }
                if (iwb0VarS != null) {
                    mfy mfyVar = (mfy) mfy.n.get(iwb0VarS);
                    if (mfyVar == null) {
                        mfy.a(6);
                        throw null;
                    }
                    igyVar = rv00.s("[".concat(mfyVar.c));
                } else {
                    iys0VarO1.getClass();
                    if (iys0VarO1 instanceof iys0) {
                        foc focVarN3 = iys0VarO1.n();
                        if (focVarN3 != null && ary.K(focVarN3)) {
                            z = true;
                        }
                        if (z) {
                            iys0VarO1.getClass();
                            if (iys0VarO1 instanceof iys0) {
                                foc focVarN4 = iys0VarO1.n();
                                focVarN4.getClass();
                                int i = rek.f30339a;
                                twqVarF = oek.f((wm40) focVarN4);
                                twqVarF.getClass();
                            } else {
                                c99.s(kng0.g(sre0.f32672a, iys0VarO1.getClass(), dw9.u("ClassicTypeSystemContext couldn't handle: ", iys0VarO1, ", ")));
                                twqVarF = null;
                            }
                            String str = bay.f2281a;
                            qlcVarH = bay.h(twqVarF);
                            if (qlcVarH == null) {
                                igyVar = null;
                            } else {
                                if (!azs0Var.d && ((list = bay.o) == null || !list.isEmpty())) {
                                    it = list.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            if (((aay) it.next()).f553a.equals(qlcVarH)) {
                                                igyVar = null;
                                            }
                                        }
                                    }
                                }
                                igyVar = new igy(rey.b(qlcVarH));
                            }
                        } else {
                            igyVar = null;
                        }
                    } else {
                        c99.s(kng0.g(sre0.f32672a, iys0VarO1.getClass(), dw9.u("ClassicTypeSystemContext couldn't handle: ", iys0VarO1, ", ")));
                    }
                    z = false;
                    if (z) {
                        iys0VarO1.getClass();
                        if (iys0VarO1 instanceof iys0) {
                            foc focVarN5 = iys0VarO1.n();
                            focVarN5.getClass();
                            int i2 = rek.f30339a;
                            twqVarF = oek.f((wm40) focVarN5);
                            twqVarF.getClass();
                        } else {
                            c99.s(kng0.g(sre0.f32672a, iys0VarO1.getClass(), dw9.u("ClassicTypeSystemContext couldn't handle: ", iys0VarO1, ", ")));
                            twqVarF = null;
                        }
                        String str2 = bay.f2281a;
                        qlcVarH = bay.h(twqVarF);
                        if (qlcVarH == null) {
                            igyVar = null;
                        } else {
                            if (!azs0Var.d) {
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (((aay) it.next()).f553a.equals(qlcVarH)) {
                                            igyVar = null;
                                        }
                                    }
                                }
                            }
                            igyVar = new igy(rey.b(qlcVarH));
                        }
                    } else {
                        igyVar = null;
                    }
                }
            }
        } else {
            igyVar = null;
        }
        if (igyVar != null) {
            Object objG = osm0.g(igyVar, azs0Var.f1736a);
            xdrVar.F(wsyVar, objG, azs0Var);
            return objG;
        }
        iys0 iys0VarS = wsyVar.S();
        if (iys0VarS instanceof xmx) {
            xmx xmxVar = (xmx) iys0VarS;
            wsy wsyVar3 = xmxVar.f41149a;
            if (wsyVar3 != null) {
                return V(vsm0.z(wsyVar3), azs0Var, xdrVar);
            }
            c99.l("There should be no intersection type in existing descriptors, but found: ".concat(CollectionsKt.b0(xmxVar.b, null, null, null, null, 63)));
            return null;
        }
        foc focVarN6 = iys0VarS.n();
        if (focVarN6 == null) {
            v4i0.j(wsyVar, "no descriptor for type constructor of ");
            return null;
        }
        if (f2o.f(focVarN6)) {
            return new igy("error/NonExistentClass");
        }
        boolean z3 = focVarN6 instanceof wm40;
        if (z3 && ary.z(wsyVar)) {
            if (wsyVar.J().size() != 1) {
                v4i0.p("arrays must have one type argument");
                return null;
            }
            pzs0 pzs0Var = (pzs0) wsyVar.J().get(0);
            wsy wsyVarB2 = pzs0Var.b();
            wsyVarB2.getClass();
            if (pzs0Var.a() == t3u0.d) {
                objV = new igy("java/lang/Object");
            } else {
                t3u0 t3u0VarA = pzs0Var.a();
                t3u0VarA.getClass();
                int iOrdinal = t3u0VarA.ordinal();
                if (iOrdinal == 0 ? (azs0Var2 = azs0Var.f) != null : iOrdinal == 1 ? (azs0Var2 = azs0Var.e) != null : (azs0Var2 = azs0Var.c) != null) {
                    azs0Var = azs0Var2;
                }
                objV = V(wsyVarB2, azs0Var, xdrVar);
            }
            return rv00.s("[".concat(rv00.C((kgy) objV)));
        }
        if (!z3) {
            if (focVarN6 instanceof hzs0) {
                wsy wsyVarR = vsm0.r((hzs0) focVarN6);
                if (wsyVar.U()) {
                    wsyVarR = e0t0.g(wsyVarR);
                }
                return V(wsyVarR, azs0Var, tv9.e);
            }
            if ((focVarN6 instanceof tfk) && azs0Var.g) {
                return V(((tfk) focVarN6).q1(), azs0Var, xdrVar);
            }
            v4i0.j(wsyVar, "Unknown type ");
            return null;
        }
        if (ddx.a(focVarN6) && !azs0Var.b && (wsyVar2 = (wsy) lgb.L(wsyVar, new HashSet())) != null) {
            return V(wsyVar2, new azs0(azs0Var.f1736a, true, azs0Var.c, azs0Var.d, azs0Var.e, azs0Var.f, azs0Var.g, azs0Var.h), xdrVar);
        }
        wm40 wm40Var = (wm40) focVarN6;
        wm40Var.o1().getClass();
        if (wm40Var.r() == slc.d) {
            vjj vjjVarJ = wm40Var.j();
            vjjVarJ.getClass();
            wm40Var = (wm40) vjjVarJ;
        }
        wm40 wm40VarS = wm40Var.o1();
        wm40VarS.getClass();
        igy igyVar2 = new igy(F(wm40VarS, hfk0Var));
        xdrVar.F(wsyVar, igyVar2, azs0Var);
        return igyVar2;
    }

    public static final void W(cp cpVar, boolean z) {
        y0w y0wVar = (y0w) cpVar.u;
        y0wVar.h.setVisibility(z ? 0 : 8);
        y0wVar.N.setVisibility(z ? 0 : 8);
        y0wVar.T.setVisibility((((fbr) cpVar.u()).A && z) ? 0 : 8);
        y0wVar.K.setVisibility(z ? 0 : 8);
    }

    public static final wrd X(HashMap map, vby vbyVar) throws roe {
        try {
            return (wrd) vbyVar.a(xrd.f41364a, vbyVar.c(new inv(ysm0.f43175a, mrv.j0(mcy.Companion.serializer()), (byte) 1), map));
        } catch (Exception e) {
            throw new roe(e.getMessage());
        }
    }

    public static final edy Y(wrd wrdVar, vby vbyVar) throws roe {
        if (wrdVar != null) {
            return ncy.i(vbyVar.c(xrd.f41364a, wrdVar));
        }
        throw new roe(null);
    }

    public static final tvw Z(vw4 vw4Var) {
        String string;
        int i = vw4Var.r;
        if (i > 1) {
            return new svw(lgb.S(vw4Var.b));
        }
        long j = vw4Var.h;
        if (j == 95) {
            return new svw(R.drawable.ic_nav_bet_constructor);
        }
        if (i != 1) {
            return qvw.f29409a;
        }
        if (j != 0) {
            bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
            rz4.s(j, ".svg", bzuVarD);
            string = ((StringBuilder) bzuVarD.b).toString();
        } else {
            string = "";
        }
        return new rvw(string);
    }

    public static final void a(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        mm40 mm40Var2;
        y3d y3dVar;
        int i2;
        fetVar.g0(668871137);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            float f = 1.0f;
            mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarC, 0.0f, 8.0f, 8.0f, 8.0f, 1);
            x5d x5dVarA = w5d.a(new qw3(8.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar, 0);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 320163141, a4xVar);
            int i4 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                hph hphVar = (hph) next;
                mm40 mm40VarD = o7k0.d(jm40.b, f);
                String title = hphVar.getTitle();
                String value = hphVar.getValue();
                if (hphVar instanceof fph) {
                    i4 i4Var = iph.f15163a;
                    List listD0 = CollectionsKt.D0(a4xVar, i4);
                    if (listD0 == null || !listD0.isEmpty()) {
                        Iterator it = listD0.iterator();
                        i2 = 0;
                        while (it.hasNext()) {
                            if ((((hph) it.next()) instanceof fph) && (i2 = i2 + 1) < 0) {
                                q3d.o();
                                throw null;
                            }
                        }
                    } else {
                        i2 = 0;
                    }
                    i4 i4Var2 = iph.f15163a;
                    y3d y3dVar2 = (y3d) i4Var2.get(i2 % i4Var2.size());
                    long j = y3dVar2.f41946a;
                    y3dVar = y3dVar2;
                    mm40Var2 = mm40VarD;
                } else if (!(hphVar instanceof gph)) {
                    t9f.b();
                    return;
                } else {
                    mm40Var2 = mm40VarD;
                    y3dVar = null;
                }
                mbc.h(mm40Var2, title, value, y3dVar, fetVar, 6, 0);
                i4 = i5;
                itO = itO;
                f = 1.0f;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i, (byte) 5);
        }
    }

    public static final tvw a0(kzv kzvVar) {
        String string;
        kzvVar.getClass();
        int i = kzvVar.t;
        if (i > 1) {
            return new svw(lgb.S(kzvVar.b));
        }
        long j = kzvVar.h;
        if (j == 95) {
            return new svw(R.drawable.ic_nav_bet_constructor);
        }
        if (i != 1) {
            return qvw.f29409a;
        }
        if (j != 0) {
            bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
            rz4.s(j, ".svg", bzuVarD);
            string = ((StringBuilder) bzuVarD.b).toString();
        } else {
            string = "";
        }
        return new rvw(string);
    }

    public static final void b(mm40 mm40Var, a4x a4xVar, cqh cqhVar, fet fetVar, int i) {
        fetVar.g0(274558699);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.g(cqhVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarC, 12.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            jm40 jm40Var = jm40.b;
            tdc.c(i2 & 112, fetVar, a4xVar, o7k0.n(jm40Var, 110.0f));
            if (cqhVar == null) {
                fetVar.e0(-930948527);
                fetVar.r(false);
            } else {
                fetVar.e0(-930948526);
                agc.j(o7k0.n(jm40Var, 110.0f), cqhVar, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var, a4xVar, cqhVar, i, (byte) 3);
        }
    }

    public static final int b0(jvw jvwVar) {
        jvwVar.getClass();
        if (jvwVar == i0w.f13966a) {
            return R.string.error;
        }
        if (jvwVar == i0w.b) {
            return R.string.accepted;
        }
        if (jvwVar == i0w.c) {
            return R.string.loosed;
        }
        if (jvwVar == i0w.d) {
            return R.string.won;
        }
        if (jvwVar == i0w.e) {
            return R.string.paid;
        }
        if (jvwVar == i0w.f) {
            return R.string.removed;
        }
        if (jvwVar == i0w.g) {
            return R.string.expired;
        }
        if (jvwVar == i0w.h) {
            return R.string.blocked;
        }
        if (jvwVar == i0w.i) {
            return R.string.bought;
        }
        if (jvwVar == zw4.f45089a) {
            return R.string.autobet_waiting;
        }
        if (jvwVar == zw4.b) {
            return R.string.autobet_applied;
        }
        if (jvwVar == zw4.c) {
            return R.string.autobet_dropped;
        }
        if (jvwVar == rc10.f30217a) {
            return R.string.accepted;
        }
        if (jvwVar == rc10.c) {
            return R.string.return1;
        }
        if (jvwVar == rc10.b) {
            return R.string.paid;
        }
        if (jvwVar == w21.f38428a) {
            return R.string.cases_slots;
        }
        if (jvwVar == w21.b) {
            return R.string.live_casino_title;
        }
        if (jvwVar == j31.f15808a) {
            return R.string.by_real_money;
        }
        return jvwVar == j31.b ? R.string.free_spins : R.string.error;
    }

    public static final void c(mm40 mm40Var, oxe oxeVar, String str, fet fetVar, int i) {
        mm40 mm40Var2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(1115364156);
        int i2 = i | 6 | (fetVar2.g(oxeVar) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 24.0f);
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
            mm40Var2 = jm40Var;
            v8q0.a(str, s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar, (i2 >> 6) & 14, 0, 130044);
            fetVar2 = fetVar;
            if (oxeVar instanceof mxe) {
                fetVar2.e0(-299556755);
                j43 j43Var = ((mxe) oxeVar).f22550a;
                if (j43Var.d) {
                    fetVar2.e0(-299490322);
                    mm40 mm40VarP = o7k0.p(mm40Var2, 72.0f, 18.0f);
                    zcl zclVar2 = qmk.m;
                    ugg0 ugg0Var = vgg0.f37379a;
                    z = true;
                    h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), vbc.d0(null, fetVar2, 0, 1), fetVar2, false);
                } else {
                    z = true;
                    plc.d(rz4.f(fetVar2, -299143959, 1.0f, true), j43Var, new fxe(), fetVar2, 0, 0);
                    fetVar2.r(false);
                }
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2.e0(-298685376);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var2, oxeVar, str, i, (byte) 20);
        }
    }

    public static boolean c0(j4e j4eVar, j4e j4eVar2, j4e j4eVar3, j4e j4eVar4) {
        j4e j4eVar5 = j4e.d;
        j4e j4eVar6 = j4e.b;
        j4e j4eVar7 = j4e.f15879a;
        return (j4eVar3 == j4eVar7 || j4eVar3 == j4eVar6 || (j4eVar3 == j4eVar5 && j4eVar != j4eVar6)) || (j4eVar4 == j4eVar7 || j4eVar4 == j4eVar6 || (j4eVar4 == j4eVar5 && j4eVar2 != j4eVar6));
    }

    public static final void d(int i, int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fet fetVar2;
        fetVar.g0(1284045230);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        byte b = 0;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var = jm40Var;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 180.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new y2d((byte) 5);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            dwi0.b((Function1) objP, mm40VarN, null, fetVar2, 6, 4);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p9d(mm40Var, i, i2, b);
        }
    }

    public static final void e(mm40 mm40Var, dye dyeVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        float f;
        int i2;
        boolean z;
        fet fetVar2 = fetVar;
        oxe oxeVar = dyeVar.c;
        function0.getClass();
        function1.getClass();
        fetVar2.g0(-711250137);
        int i3 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(dyeVar) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z2 = dyeVar.e;
            j680 j680Var = dyeVar.j;
            if (oxeVar instanceof ixe) {
                zcl zclVar = qmk.f28987a;
                f = 4.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 0.0f;
            }
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
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
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, x7zVarI);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            wvb.o(null, 16.0f, 0L, fetVar2, 0, 5);
            fetVar2 = fetVar;
            f(null, dyeVar.f6887a, dyeVar.b, function0, fetVar2, (i3 << 3) & 7168);
            if (oxeVar instanceof ixe) {
                fetVar2.e0(934837131);
                fetVar2.r(false);
            } else {
                fetVar2.e0(934256687);
                if (j680Var != null) {
                    fetVar2.e0(934313293);
                    z = false;
                    gfx.j(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), j680Var, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    z = false;
                    fetVar2.e0(934571337);
                    c(null, oxeVar, dyeVar.f, fetVar2, 0);
                    fetVar2.r(false);
                }
                fetVar2.r(z);
            }
            if (z2) {
                fetVar2.e0(934902355);
                w(0, fetVar2, o2e.e0(s5x0.N(jm40Var, 0.0f, f, 0.0f, 0.0f, 13), "HELP_CONTAINER"), dyeVar.d, dyeVar.g);
                fetVar2.r(false);
            } else {
                fetVar2.e0(935294443);
                fetVar2.r(false);
            }
            if (dyeVar.h) {
                fetVar2.e0(935354087);
                jd8.g(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), dyeVar.i, b15.b, fetVar2, 384);
                fetVar2.r(false);
            } else {
                fetVar2.e0(935665451);
                fetVar2.r(false);
            }
            wvb.o(null, 12.0f, 0L, fetVar2, 0, 5);
            fetVar2.r(true);
            if (z2) {
                fetVar2.e0(967249964);
                qzb.n(o2e.e0(s5x0.N(o7k0.A(jm40Var, null, 3), 6.0f, 6.0f, 0.0f, 0.0f, 12), "BET_SETTINGS_BUTTON"), new wul(mul.e, oe9.c, new te9(R.drawable.ic_glyph_settings_inactive), true, false, false), function1, fetVar2, (i3 >> 3) & 896, 0);
                fetVar2 = fetVar2;
                i2 = 0;
                fetVar2.r(false);
            } else {
                i2 = 0;
                fetVar2.e0(967977441);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            efx.h(i2, 1, fetVar2, null);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((byte) 14, i, (Object) mm40Var, (Object) dyeVar, (Object) function0, (Object) function1);
        }
    }

    public static final void f(mm40 mm40Var, String str, aye ayeVar, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(445741506);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar2.g(ayeVar) : fetVar2.i(ayeVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function0) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 18.0f);
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
            mm40 mm40VarN = o7k0.n(jm40Var, 14.0f);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_coupon, 0, fetVar2);
            zfn zfnVar = zaq0.b;
            dww.c(pm80VarF, null, mm40VarN, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar, 56, 0);
            int i3 = i2;
            v8q0.a(ttm0.L(2, str), o2e.e0(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), "COUPON_EVENTS_COUNTER"), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar), fetVar, 0, 0, 130044);
            fetVar2 = fetVar;
            if (ayeVar instanceof wxe) {
                fetVar2.e0(144461532);
                fetVar2.r(false);
            } else {
                fetVar2.e0(144141519);
                jcb.H(o7k0.e(o7k0.s(s5x0.L(jm40Var, 6.0f, 0.0f, 2), 1.0f), 12.0f), 1.0f, ((ThemeColors) fetVar2.k(zfnVar)).getSeparator(), fetVar2, 0, 0);
                fetVar2.r(false);
            }
            y(null, ayeVar, function0, fetVar2, (i3 >> 3) & 1008);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 17, i, (Object) mm40Var2, (Object) str, (Object) ayeVar, (Object) function0);
        }
    }

    public static final void g(mm40 mm40Var, i2r0 i2r0Var, xcz xczVar, Function1 function1, fet fetVar, int i) {
        i2r0Var.getClass();
        xczVar.getClass();
        function1.getClass();
        fetVar.g0(-599633735);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(i2r0Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            a4x a4xVar = i2r0Var.f14065a;
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new omf(function1, (byte) 7);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean z2 = i3 == 2048;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new omf(function1, (byte) 8);
                fetVar.o0(objP2);
            }
            Function1 function3 = (Function1) objP2;
            boolean z3 = i3 == 2048;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new omf(function1, (byte) 9);
                fetVar.o0(objP3);
            }
            Function1 function4 = (Function1) objP3;
            boolean z4 = i3 == 2048;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new omf(function1, (byte) 10);
                fetVar.o0(objP4);
            }
            Function1 function5 = (Function1) objP4;
            boolean z5 = i3 == 2048;
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var) {
                objP5 = new omf(function1, (byte) 11);
                fetVar.o0(objP5);
            }
            feb.m(mm40Var, a4xVar, xczVar, function2, function3, function4, function5, (Function1) objP5, fetVar, i2 & 910, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((byte) 18, i, (Object) mm40Var, (Object) i2r0Var, (Object) xczVar, (Object) function1);
        }
    }

    public static final void h(final mm40 mm40Var, final lqh lqhVar, fet fetVar, final int i) {
        yfe0 yfe0VarU;
        Function2 function2;
        lqhVar.getClass();
        fetVar.g0(1258011364);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(lqhVar) ? 32 : 16;
        }
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            a4x a4xVarO0 = dyb.o0(CollectionsKt.D0(lqhVar.f20487a, 3));
            if (a4xVarO0.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: a.gqh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = b;
                            int i3 = i;
                            lqh lqhVar2 = lqhVar;
                            mm40 mm40Var2 = mm40Var;
                            fet fetVar2 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    lmc.h(mm40Var2, lqhVar2, fetVar2, x8x.L(i3 | 1));
                                    break;
                                default:
                                    lmc.h(mm40Var2, lqhVar2, fetVar2, x8x.L(i3 | 1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                }
            } else {
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarV = vic.v(o7k0.e(mm40Var, 152.0f));
                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarV);
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
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                float f = Float.MAX_VALUE;
                x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                ArrayList arrayList = new ArrayList();
                for (Object obj : a4xVarO0) {
                    float f2 = f;
                    if (obj instanceof fph) {
                        arrayList.add(obj);
                    }
                    f = f2;
                }
                float f3 = f;
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((fph) it.next()).c));
                }
                b(x7zVar, dyb.o0(arrayList2), lqhVar.b, fetVar, 0);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                a(0, fetVar, a4xVarO0, new x7z(1.0f > f3 ? f3 : 1.0f, true));
                fetVar.r(true);
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            function2 = new Function2() { // from class: a.gqh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    byte b3 = b2;
                    int i3 = i;
                    lqh lqhVar2 = lqhVar;
                    mm40 mm40Var2 = mm40Var;
                    fet fetVar2 = (fet) obj2;
                    ((Integer) obj3).getClass();
                    switch (b3) {
                        case 0:
                            lmc.h(mm40Var2, lqhVar2, fetVar2, x8x.L(i3 | 1));
                            break;
                        default:
                            lmc.h(mm40Var2, lqhVar2, fetVar2, x8x.L(i3 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void i(mm40 mm40Var, k9n k9nVar, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(412864800);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(k9nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40VarD, backgroundContent, vgg0.a(16.0f));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            zq8.a(0, fetVar, ny9.O(1.5f, o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 52.0f, 7), 1.0f), false));
            mm40 mm40VarD2 = o7k0.d(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
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
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-846538788, new chh(function1, k9nVar, (byte) 24), fetVar), fetVar, 56);
            v8q0.a(k9nVar.f17922a, null, ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r93(mm40Var, k9nVar, function1, i, (byte) 5);
        }
    }

    public static final void j(mm40 mm40Var, l5i l5iVar, nrl nrlVar, Function0 function0, fet fetVar, int i) {
        fetVar.g0(-801046817);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.e(l5iVar.ordinal()) ? 32 : 16) | (fetVar.g(nrlVar) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = nrlVar instanceof lrl;
            Object obj = ukd.f35823a;
            if (z) {
                fetVar.e0(-1147103634);
                lrl lrlVar = (lrl) nrlVar;
                String str = lrlVar.b;
                a4x a4xVar = lrlVar.c;
                boolean zG = fetVar.g(lrlVar.f20538a) | fetVar.g(str);
                Object objP = fetVar.P();
                if (zG || objP == obj) {
                    Object hjmVar = new hjm(lrlVar.f20538a, null, null, null, null, null, false, null, null, false, new ue9(str), null, 7166);
                    fetVar.o0(hjmVar);
                    objP = hjmVar;
                }
                k(mm40Var, l5iVar, a4xVar, (hjm) objP, function0, fetVar, (i2 & 126) | ((i2 << 3) & 57344), 0);
                fetVar.r(false);
            } else {
                if (!nrlVar.equals(mrl.f22278a)) {
                    throw b1j.f(-1006836725, fetVar, false);
                }
                fetVar.e0(-1146480472);
                Object objP2 = fetVar.P();
                if (objP2 == obj) {
                    ArrayList arrayList = new ArrayList(3);
                    for (int i3 = 0; i3 < 3; i3++) {
                        arrayList.add(srl.f32682a);
                    }
                    objP2 = dyb.r0(arrayList);
                    fetVar.o0(objP2);
                }
                i4 i4Var = (i4) objP2;
                Object objP3 = fetVar.P();
                if (objP3 == obj) {
                    objP3 = new ijm();
                    fetVar.o0(objP3);
                }
                k(mm40Var, l5iVar, i4Var, (ijm) objP3, null, fetVar, (i2 & 14) | 3456 | (i2 & 112), 16);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 7, i, (Object) mm40Var, (Object) l5iVar, (Object) nrlVar, (Object) function0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:63:0x0100  */
    /* JADX WARN: Code duplicated, block: B:67:0x0109  */
    /* JADX WARN: Code duplicated, block: B:71:0x013d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0145  */
    /* JADX WARN: Code duplicated, block: B:75:0x014a  */
    /* JADX WARN: Code duplicated, block: B:76:0x014f  */
    /* JADX WARN: Code duplicated, block: B:81:0x017c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0186  */
    /* JADX WARN: Code duplicated, block: B:87:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public static final void k(mm40 mm40Var, l5i l5iVar, a4x a4xVar, jjm jjmVar, Function0 function0, fet fetVar, int i, int i2) {
        jjm jjmVar2;
        Function0 function1;
        boolean z;
        Function0 function2;
        yfe0 yfe0VarU;
        cl5 cl5Var;
        Function0 function3;
        jm40 jm40Var;
        boolean z2;
        Object objP;
        int i3;
        int i4;
        float f;
        Object objP2;
        fetVar.g0(-1445381037);
        int i5 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= fetVar.e(l5iVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= fetVar.g(a4xVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            jjmVar2 = jjmVar;
            i5 |= fetVar.g(jjmVar2) ? 2048 : 1024;
        } else {
            jjmVar2 = jjmVar;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                function1 = function0;
                i5 |= fetVar.i(function1) ? 16384 : 8192;
            }
            if ((i5 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i5 & 1, z)) {
                cl5Var = ukd.f35823a;
                if (i6 != 0) {
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = new knl((byte) 10);
                        fetVar.o0(objP2);
                    }
                    function3 = (Function0) objP2;
                } else {
                    function3 = function1;
                }
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
                jpm0.o(fetVar, x5dVarA, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                jm40Var = jm40.b;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
                kjm kjmVar = kjm.f18392a;
                if ((57344 & i5) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = fetVar.P();
                if (z2 || objP == cl5Var) {
                    objP = new unl(function3, (byte) 7);
                    fetVar.o0(objP);
                }
                nkb.h(mm40VarL, jjmVar2, kjmVar, null, (Function0) objP, null, fetVar, ((i5 >> 6) & 112) | 384, 40);
                fetVar.e0(-1406191953);
                i3 = 0;
                for (Object obj : CollectionsKt.D0(a4xVar, 3)) {
                    i4 = i3 + 1;
                    if (i3 >= 0) {
                        q3d.p();
                        throw null;
                    }
                    trl trlVar = (trl) obj;
                    if (i3 == 0) {
                        zcl zclVar2 = qmk.f28987a;
                        f = 0.0f;
                    } else {
                        zcl zclVar3 = qmk.f28987a;
                        f = 6.0f;
                    }
                    acb.o(s5x0.N(jm40Var, 0.0f, f, 0.0f, 0.0f, 13), l5iVar, trlVar, fetVar, i5 & 112, 0);
                    i3 = i4;
                }
                fetVar.r(false);
                fetVar.r(true);
                function2 = function3;
            } else {
                fetVar.X();
                function2 = function1;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new a33(mm40Var, (Object) l5iVar, (Object) a4xVar, (Object) jjmVar, (Object) function2, i, i2, (byte) 6);
            }
        }
        i5 |= 24576;
        function1 = function0;
        if ((i5 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i5 & 1, z)) {
            cl5Var = ukd.f35823a;
            if (i6 != 0) {
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new knl((byte) 10);
                    fetVar.o0(objP2);
                }
                function3 = (Function0) objP2;
            } else {
                function3 = function1;
            }
            x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            jm40Var = jm40.b;
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar4 = qmk.f28987a;
            mm40 mm40VarL2 = s5x0.L(mm40VarD2, 8.0f, 0.0f, 2);
            kjm kjmVar2 = kjm.f18392a;
            if ((57344 & i5) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP = fetVar.P();
            if (z2) {
                objP = new unl(function3, (byte) 7);
                fetVar.o0(objP);
            } else {
                objP = new unl(function3, (byte) 7);
                fetVar.o0(objP);
            }
            nkb.h(mm40VarL2, jjmVar2, kjmVar2, null, (Function0) objP, null, fetVar, ((i5 >> 6) & 112) | 384, 40);
            fetVar.e0(-1406191953);
            i3 = 0;
            while (r11.hasNext()) {
                i4 = i3 + 1;
                if (i3 >= 0) {
                    q3d.p();
                    throw null;
                }
                trl trlVar2 = (trl) obj;
                if (i3 == 0) {
                    zcl zclVar5 = qmk.f28987a;
                    f = 0.0f;
                } else {
                    zcl zclVar6 = qmk.f28987a;
                    f = 6.0f;
                }
                acb.o(s5x0.N(jm40Var, 0.0f, f, 0.0f, 0.0f, 13), l5iVar, trlVar2, fetVar, i5 & 112, 0);
                i3 = i4;
            }
            fetVar.r(false);
            fetVar.r(true);
            function2 = function3;
        } else {
            fetVar.X();
            function2 = function1;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a33(mm40Var, (Object) l5iVar, (Object) a4xVar, (Object) jjmVar, (Object) function2, i, i2, (byte) 6);
        }
    }

    public static final void l(int i, long j, fet fetVar, mm40 mm40Var) {
        int i2;
        mm40 mm40Var2;
        fetVar.g0(1189674069);
        if ((i & 48) == 0) {
            i2 = i | (fetVar.f(j) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 17) != 16)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(Separators.COLON, null, j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.b(), fetVar, ((i2 << 3) & 896) | 6, 0, 131066);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w1m(mm40Var2, j, i, (byte) 0);
        }
    }

    public static final void m(int i, String str, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        ugd ugdVar2;
        String str2 = str;
        fet fetVar2 = fetVar;
        fetVar2.g0(-987163085);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(ugdVar) ? 256 : 128;
        }
        int i4 = i3;
        if (fetVar2.U(i4 & 1, (i4 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var, 1.0f), "DATE_TIMER_ROW");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40Var, 32.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            mm40 mm40VarE1 = o2e.e0(o7k0.n(jm40Var, 16.0f), "DATE_TIMER_ICON");
            pm80 pm80VarF = a8k0.F(i, i4 & 14, fetVar2);
            zfn zfnVar = zaq0.b;
            dww.c(pm80VarF, null, mm40VarE1, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
            qxw.o(fetVar2, o7k0.s(jm40Var, 12.0f));
            x7z x7zVar = new x7z(1.0f, true);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, x7zVar);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            fetVar2 = fetVar;
            str2 = str;
            aad.e(str2, o2e.e0(jm40Var, "DATE_TIME_TITLE"), y9q0.a(g1t0.h(), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711678), null, 2, false, 1, 0, null, null, fetVar2, ((i4 >> 3) & 14) | 1794096, 904);
            ugdVar2 = ugdVar;
            ugdVar2.invoke(fetVar2, Integer.valueOf(14 & (i4 >> 6)));
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            ugdVar2 = ugdVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a18(i, str2, ugdVar2, i2);
        }
    }

    public static final void n(mm40 mm40Var, String str, String str2, String str3, String str4, long j, Date date, qol qolVar, iol iolVar, Function0 function0, fet fetVar, int i, int i2) {
        int i3;
        iol iolVar2;
        iol iolVar3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        tol tolVar = tol.f34290a;
        str.getClass();
        fetVar.g0(1249521673);
        int i5 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.g(str3) ? 2048 : 1024) | (fetVar.g(str4) ? 16384 : 8192) | (fetVar.f(j) ? 131072 : 65536) | (fetVar.i(date) ? 1048576 : 524288) | (fetVar.g(qolVar) ? 8388608 : 4194304) | (fetVar.e(R.drawable.ic_glyph_line) ? 67108864 : 33554432) | (fetVar.e(R.drawable.ic_glyph_history) ? 536870912 : 268435456);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar.e(1) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i5 & 1, ((i5 & 306783379) == 306783378 && (i3 & 147) == 146) ? false : true)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                pz40 pz40Var = s6t0.f31722a;
                iolVar3 = new iol(s6t0.b().f33626a.getTextPrimary(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getTextPrimary(), dyb.h0(rol.f30844a, rol.b, rol.c, rol.d), jol.f16863a);
                i4 = i3 & (-113);
            } else {
                fetVar.X();
                i4 = i3 & (-113);
                iolVar3 = iolVar;
            }
            fetVar.s();
            boolean z4 = fetVar.k(bmd.n) == k6z.b;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 320.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarM = s5x0.M(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), 12.0f, 8.0f, 12.0f, 8.0f);
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
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
            m(R.drawable.ic_glyph_line, str, u1c.M(-1922538303, new sw(z4, str3, str2), fetVar), fetVar, ((i5 >> 24) & 14) | 384 | (i5 & 112));
            boolean zG = fetVar.g(date);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                if (date == null || date.getTime() != 0) {
                    z = false;
                    z2 = true;
                } else {
                    z2 = true;
                    z = true;
                }
                objP = Boolean.valueOf(!z);
                fetVar.o0(objP);
            } else {
                z2 = true;
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            boolean z5 = j - System.currentTimeMillis() <= 0 ? z2 : false;
            Boolean boolValueOf = Boolean.valueOf(z5);
            boolean zH = ((i4 & 896) == 256) | fetVar.h(z5) | fetVar.h(zBooleanValue);
            Object objP2 = fetVar.P();
            if (zH || objP2 == cl5Var) {
                z3 = zBooleanValue;
                objP2 = new fsl(z5, z3, function0, null, (byte) 3);
                fetVar.o0(objP2);
            } else {
                z3 = zBooleanValue;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP2);
            if (z3) {
                fetVar.e0(-227337094);
                iolVar2 = iolVar3;
                m(R.drawable.ic_glyph_history, str4, u1c.M(-991841828, new idm(j, qolVar, iolVar2, function0, (byte) 0), fetVar), fetVar, ((i5 >> 27) & 14) | 384 | ((i5 >> 9) & 112));
                fetVar.r(false);
            } else {
                iolVar2 = iolVar3;
                fetVar.e0(-226774909);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
            iolVar2 = iolVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jdm(mm40Var, str, str2, str3, str4, j, date, qolVar, iolVar2, function0, i, i2);
        }
    }

    public static final void o(mm40 mm40Var, k6l0 k6l0Var, boolean z, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(112377067);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(k6l0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gnm(function1, k6l0Var, (byte) 6);
                fetVar.o0(objP);
            }
            a8k0.n(y860.W(mm40Var, null, null, false, null, (Function0) objP, 28), 16.0f, background, null, xf0.k, u1c.M(208945195, new i3l(k6l0Var, (byte) 18), fetVar), u1c.M(-828065206, new igm((Object) k6l0Var, z, (Object) function1, (byte) 21), fetVar), fetVar, 1797120, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0(mm40Var, (Object) k6l0Var, z, function1, i, (byte) 18);
        }
    }

    public static final void p(mm40 mm40Var, rxm rxmVar, boolean z, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        k6z k6zVar;
        int i3;
        boolean z2;
        fetVar.g0(1505225668);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(rxmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = bmd.n;
            k6z k6zVar2 = (k6z) fetVar.k(zfnVar);
            if (!z) {
                k6zVar2 = k6z.f17794a;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 12.0f, 0.0f, 12.0f, 12.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            if (rxmVar.b.length() > 0) {
                fetVar.e0(-642202851);
                mm40 mm40VarE = o7k0.e(jm40.b, 16.0f);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
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
                k6z k6zVar3 = k6zVar2;
                String str = rxmVar.b;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                z2 = true;
                k6zVar = k6zVar3;
                v8q0.a(str, null, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109562);
                fetVar2 = fetVar;
                fetVar2.r(true);
                i3 = 0;
                fetVar2.r(false);
            } else {
                k6z k6zVar4 = k6zVar2;
                fetVar2 = fetVar;
                k6zVar = k6zVar4;
                i3 = 0;
                z2 = true;
                fetVar2.e0(-641688716);
                fetVar2.r(false);
            }
            x(i3, fetVar2, null, rxmVar.f31271a);
            obc.d(zfnVar.a(k6zVar), u1c.M(-169577394, new mxm(rxmVar, (byte) 3), fetVar2), fetVar2, 56);
            fetVar2.r(z2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((byte) 22, i, mm40Var, (Object) rxmVar, z);
        }
    }

    public static final void q(mm40 mm40Var, cll0 cll0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-943491043);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(cll0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(o7k0.d(mm40Var, 1.0f), cll0Var.a()), vgg0.a(cll0Var.b())), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n(mm40Var, cll0Var, i, b);
        }
    }

    public static final void r(int i, final long j, fet fetVar, mm40 mm40Var, final y9q0 y9q0Var, final y9q0 y9q0Var2, final String str, final String str2) {
        int i2;
        str.getClass();
        str2.getClass();
        fetVar.g0(-842266836);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(y9q0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(y9q0Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.f(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.h(true) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            final g9q0 g9q0VarN = pym0.n(fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP);
            }
            final cgk0 cgk0Var = (cgk0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(new daq0(y9q0Var.f42262a.b));
                fetVar.o0(objP2);
            }
            final pz40 pz40Var = (pz40) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(new j9q0(1));
                fetVar.o0(objP3);
            }
            final pz40 pz40Var2 = (pz40) objP3;
            nnw0.g(mm40Var, gqw0.e, false, u1c.M(-1811670910, new xdr() { // from class: a.esn
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    cgk0 cgk0Var2;
                    pz40 pz40Var3;
                    lr8 lr8Var = (lr8) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    lr8Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= fetVar2.g(lr8Var) ? 4 : 2;
                    }
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                        Object objP4 = fetVar2.P();
                        cl5 cl5Var2 = ukd.f35823a;
                        if (objP4 == cl5Var2) {
                            objP4 = androidx.compose.runtime.e.a(lr8Var.d());
                            fetVar2.o0(objP4);
                        }
                        agk0 agk0Var = (agk0) objP4;
                        Float fValueOf = Float.valueOf(agk0Var.l());
                        y9q0 y9q0Var3 = y9q0Var;
                        boolean zG = fetVar2.g(y9q0Var3);
                        g9q0 g9q0Var = g9q0VarN;
                        boolean zG2 = zG | fetVar2.g(g9q0Var);
                        String str3 = str2;
                        boolean zG3 = zG2 | fetVar2.g(str3);
                        String str4 = str;
                        boolean zG4 = zG3 | fetVar2.g(str4) | fetVar2.h(true);
                        long j2 = j;
                        boolean zF = zG4 | fetVar2.f(j2);
                        Object objP5 = fetVar2.P();
                        pz40 pz40Var4 = pz40Var2;
                        cgk0 cgk0Var3 = cgk0Var;
                        pz40 pz40Var5 = pz40Var;
                        if (zF || objP5 == cl5Var2) {
                            cgk0Var2 = cgk0Var3;
                            gsn gsnVar = new gsn(y9q0Var3, g9q0Var, str3, str4, j2, agk0Var, pz40Var4, cgk0Var2, pz40Var5, (yje) null);
                            pz40Var3 = pz40Var5;
                            fetVar2.o0(gsnVar);
                            objP5 = gsnVar;
                        } else {
                            pz40Var3 = pz40Var5;
                            cgk0Var2 = cgk0Var3;
                        }
                        m0x0.v(fValueOf, str3, (Function2) objP5, fetVar2);
                        thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar2, 54);
                        int iHashCode = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM = fetVar2.m();
                        jm40 jm40Var = jm40.b;
                        mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
                        v8q0.a(str4, o7k0.s(jm40Var, cgk0Var2.l()), 0L, null, ((daq0) pz40Var3.getValue()).f5764a, null, null, null, 0L, null, 0L, ((j9q0) pz40Var4.getValue()).f16151a, false, 1, 0, null, y9q0Var3, fetVar2, 0, 27648, 102380);
                        zcl zclVar = qmk.f28987a;
                        qxw.o(fetVar2, o7k0.s(jm40Var, 4.0f));
                        v8q0.a(str3, o7k0.A(jm40Var, null, 3), 0L, null, ((daq0) pz40Var3.getValue()).f5764a, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, y9q0Var2, fetVar2, 48, 24576, 114668);
                        fetVar2.r(true);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, (i2 & 14) | 3120, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fsn(mm40Var, str, str2, y9q0Var, y9q0Var2, j, i);
        }
    }

    public static final void s(kij0 kij0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(1445625743);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(kij0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = f6o.f9022a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean z = (i2 & 14) == 4;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new yhn((Object) kij0Var, (byte) 18);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, mm40Var, (Function1) objP2, fetVar2, 6, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(kij0Var, i, (byte) 24);
        }
    }

    public static final void t(boolean z, Function0 function0, xdr xdrVar, ugd ugdVar, fet fetVar, int i) {
        function0.getClass();
        fetVar.g0(155949823);
        int i2 = i | (fetVar.h(z) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            l7m0 l7m0VarB = d43.b(z ? 180.0f : 0.0f, null, "Rotate animation", null, fetVar, 3072, 22);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            lca lcaVarO = jar0.O(fetVar);
            lca lcaVarA = lcaVarO.a(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), lcaVarO.b, lcaVarO.c, lcaVarO.d);
            zcl zclVar = qmk.f28987a;
            hew0.e(mm40VarD, vgg0.a(16.0f), lcaVarA, null, u1c.M(1053955917, new wv50(function0, z, xdrVar, l7m0VarB, ugdVar), fetVar), fetVar, 196608, 24);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n(z, function0, xdrVar, ugdVar, i);
        }
    }

    public static final void u(py6 py6Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        py6Var.getClass();
        fetVar.g0(1128018671);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(py6Var) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2 = fetVar;
            vbw0.h(null, u1c.M(1904629790, new vcq(py6Var, b), fetVar), null, fetVar2, (i2 & 14) | 384, 10);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(py6Var, i);
        }
    }

    public static final void v(l7m0 l7m0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1394077672);
        int i2 = i | (fetVar2.g(l7m0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(jm40Var, 8.0f);
            qrq qrqVar = j1t0.b;
            long j = qmk.r;
            v8q0.a(rsm0.w(R.string.game_progress, 0, fetVar2), mm40VarJ, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, j, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 0, 131048);
            fetVar2 = fetVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(927356494, new cw0(l7m0Var, (byte) 8), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cw0(l7m0Var, i, (byte) 9);
        }
    }

    public static final void w(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fetVar.g0(1857064983);
        byte b = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jwb.p(mm40Var, null, null, gqw0.k, 0, 0, u1c.M(-1144806254, new ew6(str2, str, b), fetVar), fetVar, (i2 & 14) | 1575936, 54);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var, str, str2, i, (byte) 13);
        }
    }

    public static final void x(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-1495699106);
        int i2 = i | 6 | (fetVar2.g(str2) ? 32 : 16) | (fetVar2.g(null) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            brm0.x(fetVar2, mm40VarC0, gqw0.v, -544794611, false);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, g1t0.d(), fetVar2, (i2 >> 3) & 14, 24960, 109562);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var2, str2, i, (byte) 25);
        }
    }

    public static final void y(mm40 mm40Var, aye ayeVar, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1945761862);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(ayeVar) : fetVar.i(ayeVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ayeVar instanceof uxe;
            mm40Var2 = jm40.b;
            if (z) {
                fetVar.e0(1566383324);
                z(((uxe) ayeVar).f36437a, function0, fetVar, i2 & 910);
                fetVar.r(false);
            } else if (ayeVar.equals(yxe.f43415a)) {
                fetVar.e0(1566390555);
                zcl zclVar = qmk.f28987a;
                A(0, fetVar, o7k0.p(mm40Var2, 72.0f, 18.0f));
                fetVar.r(false);
            } else {
                if (!ayeVar.equals(wxe.f39928a)) {
                    throw b1j.f(1566380909, fetVar, false);
                }
                fetVar.e0(1313627066);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var2, ayeVar, function0, i, (byte) 11);
        }
    }

    public static final void z(String str, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        byte b;
        fetVar.g0(-564086812);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        int i4 = i2;
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = dw9.j(fetVar);
            }
            mm40 mm40VarW = y860.W(jm40Var, (gy40) objP, null, false, null, function0, 28);
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
            v8q0.a(str, ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, false), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar), fetVar, (i4 >> 3) & 14, 24960, 109564);
            fetVar2 = fetVar;
            b = 0;
            dww.c(a8k0.F(R.drawable.ic_glyph_chevron_down_small, 0, fetVar2), null, s5x0.N(o7k0.n(jm40Var, 14.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            b = 0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sxe(str, function0, i, b);
        }
    }
}
