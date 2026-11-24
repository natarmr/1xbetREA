package a;

import android.gov.nist.core.Separators;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final class y11 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41833a = 1;
    public final ctf0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;
    public final n0o0 l;
    public final n0o0 m;
    public final n0o0 n;
    public final n0o0 o;
    public final n0o0 p;
    public final n0o0 q;
    public final n0o0 r;
    public final n0o0 s;
    public final n0o0 t;
    public final n0o0 u;
    public final n0o0 v;
    public final n0o0 w;
    public final n0o0 x;
    public final n0o0 y;
    public final Object z;

    public y11(final cp00 cp00Var, ctf0 ctf0Var, bb6 bb6Var) {
        final byte b = 1;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.z = bb6Var;
        final byte b2 = 0;
        this.c = maz.b(new Function0() { // from class: a.np00
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                cp00 cp00Var2 = cp00Var;
                switch (b3) {
                    case 0:
                        int iOrdinal = cp00Var2.c.f13042a.ordinal();
                        if (iOrdinal == 0) {
                            return eub0.b;
                        }
                        if (iOrdinal == 1) {
                            return eub0.f8412a;
                        }
                        if (iOrdinal == 2) {
                            return eub0.c;
                        }
                        if (iOrdinal == 3) {
                            return eub0.d;
                        }
                        if (iOrdinal == 4) {
                            return eub0.e;
                        }
                        t9f.b();
                        return null;
                    default:
                        if (cp00Var2.m) {
                            return phk.c;
                        }
                        return cp00Var2.n ? phk.f27001a : phk.b;
                }
            }
        });
        this.d = maz.b(new Function0() { // from class: a.np00
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b;
                cp00 cp00Var2 = cp00Var;
                switch (b3) {
                    case 0:
                        int iOrdinal = cp00Var2.c.f13042a.ordinal();
                        if (iOrdinal == 0) {
                            return eub0.b;
                        }
                        if (iOrdinal == 1) {
                            return eub0.f8412a;
                        }
                        if (iOrdinal == 2) {
                            return eub0.c;
                        }
                        if (iOrdinal == 3) {
                            return eub0.d;
                        }
                        if (iOrdinal == 4) {
                            return eub0.e;
                        }
                        t9f.b();
                        return null;
                    default:
                        if (cp00Var2.m) {
                            return phk.c;
                        }
                        return cp00Var2.n ? phk.f27001a : phk.b;
                }
            }
        });
        this.e = maz.b(new x800(cp00Var));
        this.f = bkb.H(cp00Var.b);
        this.g = maz.b(new yw9(cp00Var.e, new Function1(this) { // from class: a.op00
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Pair pair;
                int i;
                String[] strArrG;
                int i2;
                String strA;
                int i3;
                byte b3 = b2;
                y11 y11Var = this.b;
                switch (b3) {
                    case 0:
                        ne5 ne5Var = (ne5) obj;
                        if (ne5Var == null) {
                            return null;
                        }
                        iy3 iy3Var = (iy3) y11Var.a().c();
                        if (iy3Var != null) {
                            if (iy3Var instanceof ey3) {
                                pair = new Pair(ne5Var.c, ne5Var.d);
                            } else if (iy3Var instanceof gy3) {
                                pair = new Pair(ne5Var.f23367a, ne5Var.b);
                            } else if ((iy3Var instanceof hy3) || (iy3Var instanceof fy3)) {
                                pair = new Pair(ne5Var.e, ne5Var.f);
                            }
                            String str = (String) pair.f46059a;
                            String str2 = (String) pair.b;
                            if (str == null || str2 == null) {
                                return null;
                            }
                            return new Pair(str, str2);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        oc5 oc5Var = (oc5) obj;
                        if (oc5Var == null) {
                            return iun.f15405a;
                        }
                        List listJ = q3d.j(o050.b0(oc5Var, (iy3) y11Var.a().c()), oc5Var.d, oc5Var.e);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listJ) {
                            if (((String) obj2).length() > 0) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 2:
                        iy3 iy3Var2 = (iy3) obj;
                        iy3Var2.getClass();
                        if (iy3Var2 instanceof ey3) {
                            i = R.string.background_1_17_smart_image_background;
                        } else if (iy3Var2 instanceof gy3) {
                            i = R.string.background_1_2_smart_image_background;
                        } else {
                            if (!(iy3Var2 instanceof hy3) && !(iy3Var2 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i = R.string.background_1_12_smart_image_background;
                        }
                        return yyw.H((bb6) y11Var.z, y11Var.b, i);
                    case 3:
                        iy3 iy3Var3 = (iy3) obj;
                        iy3Var3.getClass();
                        bb6 bb6Var2 = (bb6) y11Var.z;
                        ctf0 ctf0Var2 = y11Var.b;
                        if (iy3Var3 instanceof ey3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_17);
                        } else if (iy3Var3 instanceof gy3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_2);
                        } else {
                            if (!(iy3Var3 instanceof hy3) && !(iy3Var3 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strArrG = ctf0Var2.g(R.array.smart_images_1_12);
                        }
                        String[] strArr = (String[]) Arrays.copyOf(strArrG, strArrG.length);
                        dkq dkqVar = dkq.DRAWABLE;
                        return bb6Var2.b(strArr);
                    case 4:
                        iy3 iy3Var4 = (iy3) obj;
                        iy3Var4.getClass();
                        bb6 bb6Var3 = (bb6) y11Var.z;
                        ctf0 ctf0Var3 = y11Var.b;
                        ctf0Var3.getClass();
                        if (iy3Var4 instanceof ey3) {
                            i2 = R.string.background_image_1_17;
                        } else if (iy3Var4 instanceof gy3) {
                            i2 = R.string.background_image_1_2;
                        } else {
                            if (!(iy3Var4 instanceof hy3) && !(iy3Var4 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i2 = R.string.background_image_1_12;
                        }
                        return new pd5(yyw.H(bb6Var3, ctf0Var3, i2));
                    case 5:
                        iy3 iy3Var5 = (iy3) obj;
                        iy3Var5.getClass();
                        bb6 bb6Var4 = (bb6) y11Var.z;
                        ctf0 ctf0Var4 = y11Var.b;
                        ctf0Var4.getClass();
                        boolean z = iy3Var5 instanceof ey3;
                        if (z) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_17, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof gy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_2, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof hy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (!(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        }
                        int iA = bb6Var4.a(strA, dkq.RAW);
                        if (z) {
                            i3 = R.string.background_lottie_image_1_17;
                        } else if (iy3Var5 instanceof gy3) {
                            i3 = R.string.background_lottie_image_1_2;
                        } else {
                            if (!(iy3Var5 instanceof hy3) && !(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i3 = R.string.background_lottie_image_1_12;
                        }
                        return new qd5(iA != 0 ? Integer.valueOf(iA) : null, yyw.H(bb6Var4, ctf0Var4, i3));
                    case 6:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        Pair pair2 = (Pair) ((fee) y11Var.g.getValue()).b();
                        if (pair2 != null) {
                            return new sd5(ctf0.b(R.attr.uikitSplashBackground, y11Var.b), (String) pair2.f46059a, (String) pair2.b, zBooleanValue);
                        }
                        return null;
                    case 7:
                        iy3 iy3Var6 = (iy3) obj;
                        iy3Var6.getClass();
                        oc5 oc5Var2 = (oc5) ((fee) y11Var.i.getValue()).c();
                        if (oc5Var2 != null) {
                            return new rd5(o050.b0(oc5Var2, iy3Var6), ctf0.b(R.attr.uikitSplashBackground, y11Var.b));
                        }
                        return null;
                    default:
                        n0o0 n0o0Var = y11Var.t;
                        eh3 eh3Var = (eh3) obj;
                        eh3Var.getClass();
                        int iOrdinal = eh3Var.ordinal();
                        if (iOrdinal == 0) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 1) {
                            rd5 rd5Var = (rd5) ((fee) y11Var.w.getValue()).b();
                            return rd5Var != null ? rd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 2) {
                            return (ud5) ((fee) y11Var.u.getValue()).b();
                        }
                        if (iOrdinal != 3) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        sd5 sd5Var = (sd5) ((fee) y11Var.v.getValue()).b();
                        return sd5Var != null ? sd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                }
            }
        }, (byte) 20));
        this.h = bkb.H(Boolean.valueOf(cp00Var.f));
        n0o0 n0o0VarH = bkb.H(cp00Var.g);
        this.i = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(Boolean.valueOf(cp00Var.k));
        this.j = n0o0VarH2;
        this.k = bkb.H(cp00Var.i);
        n0o0 n0o0VarB = maz.b(new yw9(cp00Var.d, new w800((byte) 12), (byte) 20));
        this.l = n0o0VarB;
        this.m = bkb.G(((fee) n0o0VarB.getValue()).d, new pp00(cp00Var, this, (byte) 0));
        this.n = maz.b(new yw9(cp00Var.h, new Function1(this) { // from class: a.op00
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Pair pair;
                int i;
                String[] strArrG;
                int i2;
                String strA;
                int i3;
                byte b3 = b;
                y11 y11Var = this.b;
                switch (b3) {
                    case 0:
                        ne5 ne5Var = (ne5) obj;
                        if (ne5Var == null) {
                            return null;
                        }
                        iy3 iy3Var = (iy3) y11Var.a().c();
                        if (iy3Var != null) {
                            if (iy3Var instanceof ey3) {
                                pair = new Pair(ne5Var.c, ne5Var.d);
                            } else if (iy3Var instanceof gy3) {
                                pair = new Pair(ne5Var.f23367a, ne5Var.b);
                            } else if ((iy3Var instanceof hy3) || (iy3Var instanceof fy3)) {
                                pair = new Pair(ne5Var.e, ne5Var.f);
                            }
                            String str = (String) pair.f46059a;
                            String str2 = (String) pair.b;
                            if (str == null || str2 == null) {
                                return null;
                            }
                            return new Pair(str, str2);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        oc5 oc5Var = (oc5) obj;
                        if (oc5Var == null) {
                            return iun.f15405a;
                        }
                        List listJ = q3d.j(o050.b0(oc5Var, (iy3) y11Var.a().c()), oc5Var.d, oc5Var.e);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listJ) {
                            if (((String) obj2).length() > 0) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 2:
                        iy3 iy3Var2 = (iy3) obj;
                        iy3Var2.getClass();
                        if (iy3Var2 instanceof ey3) {
                            i = R.string.background_1_17_smart_image_background;
                        } else if (iy3Var2 instanceof gy3) {
                            i = R.string.background_1_2_smart_image_background;
                        } else {
                            if (!(iy3Var2 instanceof hy3) && !(iy3Var2 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i = R.string.background_1_12_smart_image_background;
                        }
                        return yyw.H((bb6) y11Var.z, y11Var.b, i);
                    case 3:
                        iy3 iy3Var3 = (iy3) obj;
                        iy3Var3.getClass();
                        bb6 bb6Var2 = (bb6) y11Var.z;
                        ctf0 ctf0Var2 = y11Var.b;
                        if (iy3Var3 instanceof ey3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_17);
                        } else if (iy3Var3 instanceof gy3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_2);
                        } else {
                            if (!(iy3Var3 instanceof hy3) && !(iy3Var3 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strArrG = ctf0Var2.g(R.array.smart_images_1_12);
                        }
                        String[] strArr = (String[]) Arrays.copyOf(strArrG, strArrG.length);
                        dkq dkqVar = dkq.DRAWABLE;
                        return bb6Var2.b(strArr);
                    case 4:
                        iy3 iy3Var4 = (iy3) obj;
                        iy3Var4.getClass();
                        bb6 bb6Var3 = (bb6) y11Var.z;
                        ctf0 ctf0Var3 = y11Var.b;
                        ctf0Var3.getClass();
                        if (iy3Var4 instanceof ey3) {
                            i2 = R.string.background_image_1_17;
                        } else if (iy3Var4 instanceof gy3) {
                            i2 = R.string.background_image_1_2;
                        } else {
                            if (!(iy3Var4 instanceof hy3) && !(iy3Var4 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i2 = R.string.background_image_1_12;
                        }
                        return new pd5(yyw.H(bb6Var3, ctf0Var3, i2));
                    case 5:
                        iy3 iy3Var5 = (iy3) obj;
                        iy3Var5.getClass();
                        bb6 bb6Var4 = (bb6) y11Var.z;
                        ctf0 ctf0Var4 = y11Var.b;
                        ctf0Var4.getClass();
                        boolean z = iy3Var5 instanceof ey3;
                        if (z) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_17, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof gy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_2, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof hy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (!(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        }
                        int iA = bb6Var4.a(strA, dkq.RAW);
                        if (z) {
                            i3 = R.string.background_lottie_image_1_17;
                        } else if (iy3Var5 instanceof gy3) {
                            i3 = R.string.background_lottie_image_1_2;
                        } else {
                            if (!(iy3Var5 instanceof hy3) && !(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i3 = R.string.background_lottie_image_1_12;
                        }
                        return new qd5(iA != 0 ? Integer.valueOf(iA) : null, yyw.H(bb6Var4, ctf0Var4, i3));
                    case 6:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        Pair pair2 = (Pair) ((fee) y11Var.g.getValue()).b();
                        if (pair2 != null) {
                            return new sd5(ctf0.b(R.attr.uikitSplashBackground, y11Var.b), (String) pair2.f46059a, (String) pair2.b, zBooleanValue);
                        }
                        return null;
                    case 7:
                        iy3 iy3Var6 = (iy3) obj;
                        iy3Var6.getClass();
                        oc5 oc5Var2 = (oc5) ((fee) y11Var.i.getValue()).c();
                        if (oc5Var2 != null) {
                            return new rd5(o050.b0(oc5Var2, iy3Var6), ctf0.b(R.attr.uikitSplashBackground, y11Var.b));
                        }
                        return null;
                    default:
                        n0o0 n0o0Var = y11Var.t;
                        eh3 eh3Var = (eh3) obj;
                        eh3Var.getClass();
                        int iOrdinal = eh3Var.ordinal();
                        if (iOrdinal == 0) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 1) {
                            rd5 rd5Var = (rd5) ((fee) y11Var.w.getValue()).b();
                            return rd5Var != null ? rd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 2) {
                            return (ud5) ((fee) y11Var.u.getValue()).b();
                        }
                        if (iOrdinal != 3) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        sd5 sd5Var = (sd5) ((fee) y11Var.v.getValue()).b();
                        return sd5Var != null ? sd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                }
            }
        }, (byte) 20));
        this.o = bkb.G(((fee) n0o0VarH.getValue()).d, new pp00(cp00Var, this, (byte) 1));
        final byte b3 = 2;
        this.p = bkb.G(((fee) n0o0VarH.getValue()).d, new pp00(cp00Var, this, (byte) 2));
        this.q = bkb.G(a().d, new Function1(this) { // from class: a.op00
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Pair pair;
                int i;
                String[] strArrG;
                int i2;
                String strA;
                int i3;
                byte b4 = b3;
                y11 y11Var = this.b;
                switch (b4) {
                    case 0:
                        ne5 ne5Var = (ne5) obj;
                        if (ne5Var == null) {
                            return null;
                        }
                        iy3 iy3Var = (iy3) y11Var.a().c();
                        if (iy3Var != null) {
                            if (iy3Var instanceof ey3) {
                                pair = new Pair(ne5Var.c, ne5Var.d);
                            } else if (iy3Var instanceof gy3) {
                                pair = new Pair(ne5Var.f23367a, ne5Var.b);
                            } else if ((iy3Var instanceof hy3) || (iy3Var instanceof fy3)) {
                                pair = new Pair(ne5Var.e, ne5Var.f);
                            }
                            String str = (String) pair.f46059a;
                            String str2 = (String) pair.b;
                            if (str == null || str2 == null) {
                                return null;
                            }
                            return new Pair(str, str2);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        oc5 oc5Var = (oc5) obj;
                        if (oc5Var == null) {
                            return iun.f15405a;
                        }
                        List listJ = q3d.j(o050.b0(oc5Var, (iy3) y11Var.a().c()), oc5Var.d, oc5Var.e);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listJ) {
                            if (((String) obj2).length() > 0) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 2:
                        iy3 iy3Var2 = (iy3) obj;
                        iy3Var2.getClass();
                        if (iy3Var2 instanceof ey3) {
                            i = R.string.background_1_17_smart_image_background;
                        } else if (iy3Var2 instanceof gy3) {
                            i = R.string.background_1_2_smart_image_background;
                        } else {
                            if (!(iy3Var2 instanceof hy3) && !(iy3Var2 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i = R.string.background_1_12_smart_image_background;
                        }
                        return yyw.H((bb6) y11Var.z, y11Var.b, i);
                    case 3:
                        iy3 iy3Var3 = (iy3) obj;
                        iy3Var3.getClass();
                        bb6 bb6Var2 = (bb6) y11Var.z;
                        ctf0 ctf0Var2 = y11Var.b;
                        if (iy3Var3 instanceof ey3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_17);
                        } else if (iy3Var3 instanceof gy3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_2);
                        } else {
                            if (!(iy3Var3 instanceof hy3) && !(iy3Var3 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strArrG = ctf0Var2.g(R.array.smart_images_1_12);
                        }
                        String[] strArr = (String[]) Arrays.copyOf(strArrG, strArrG.length);
                        dkq dkqVar = dkq.DRAWABLE;
                        return bb6Var2.b(strArr);
                    case 4:
                        iy3 iy3Var4 = (iy3) obj;
                        iy3Var4.getClass();
                        bb6 bb6Var3 = (bb6) y11Var.z;
                        ctf0 ctf0Var3 = y11Var.b;
                        ctf0Var3.getClass();
                        if (iy3Var4 instanceof ey3) {
                            i2 = R.string.background_image_1_17;
                        } else if (iy3Var4 instanceof gy3) {
                            i2 = R.string.background_image_1_2;
                        } else {
                            if (!(iy3Var4 instanceof hy3) && !(iy3Var4 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i2 = R.string.background_image_1_12;
                        }
                        return new pd5(yyw.H(bb6Var3, ctf0Var3, i2));
                    case 5:
                        iy3 iy3Var5 = (iy3) obj;
                        iy3Var5.getClass();
                        bb6 bb6Var4 = (bb6) y11Var.z;
                        ctf0 ctf0Var4 = y11Var.b;
                        ctf0Var4.getClass();
                        boolean z = iy3Var5 instanceof ey3;
                        if (z) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_17, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof gy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_2, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof hy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (!(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        }
                        int iA = bb6Var4.a(strA, dkq.RAW);
                        if (z) {
                            i3 = R.string.background_lottie_image_1_17;
                        } else if (iy3Var5 instanceof gy3) {
                            i3 = R.string.background_lottie_image_1_2;
                        } else {
                            if (!(iy3Var5 instanceof hy3) && !(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i3 = R.string.background_lottie_image_1_12;
                        }
                        return new qd5(iA != 0 ? Integer.valueOf(iA) : null, yyw.H(bb6Var4, ctf0Var4, i3));
                    case 6:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        Pair pair2 = (Pair) ((fee) y11Var.g.getValue()).b();
                        if (pair2 != null) {
                            return new sd5(ctf0.b(R.attr.uikitSplashBackground, y11Var.b), (String) pair2.f46059a, (String) pair2.b, zBooleanValue);
                        }
                        return null;
                    case 7:
                        iy3 iy3Var6 = (iy3) obj;
                        iy3Var6.getClass();
                        oc5 oc5Var2 = (oc5) ((fee) y11Var.i.getValue()).c();
                        if (oc5Var2 != null) {
                            return new rd5(o050.b0(oc5Var2, iy3Var6), ctf0.b(R.attr.uikitSplashBackground, y11Var.b));
                        }
                        return null;
                    default:
                        n0o0 n0o0Var = y11Var.t;
                        eh3 eh3Var = (eh3) obj;
                        eh3Var.getClass();
                        int iOrdinal = eh3Var.ordinal();
                        if (iOrdinal == 0) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 1) {
                            rd5 rd5Var = (rd5) ((fee) y11Var.w.getValue()).b();
                            return rd5Var != null ? rd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 2) {
                            return (ud5) ((fee) y11Var.u.getValue()).b();
                        }
                        if (iOrdinal != 3) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        sd5 sd5Var = (sd5) ((fee) y11Var.v.getValue()).b();
                        return sd5Var != null ? sd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                }
            }
        });
        final byte b4 = 3;
        this.r = bkb.G(a().d, new Function1(this) { // from class: a.op00
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Pair pair;
                int i;
                String[] strArrG;
                int i2;
                String strA;
                int i3;
                byte b5 = b4;
                y11 y11Var = this.b;
                switch (b5) {
                    case 0:
                        ne5 ne5Var = (ne5) obj;
                        if (ne5Var == null) {
                            return null;
                        }
                        iy3 iy3Var = (iy3) y11Var.a().c();
                        if (iy3Var != null) {
                            if (iy3Var instanceof ey3) {
                                pair = new Pair(ne5Var.c, ne5Var.d);
                            } else if (iy3Var instanceof gy3) {
                                pair = new Pair(ne5Var.f23367a, ne5Var.b);
                            } else if ((iy3Var instanceof hy3) || (iy3Var instanceof fy3)) {
                                pair = new Pair(ne5Var.e, ne5Var.f);
                            }
                            String str = (String) pair.f46059a;
                            String str2 = (String) pair.b;
                            if (str == null || str2 == null) {
                                return null;
                            }
                            return new Pair(str, str2);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        oc5 oc5Var = (oc5) obj;
                        if (oc5Var == null) {
                            return iun.f15405a;
                        }
                        List listJ = q3d.j(o050.b0(oc5Var, (iy3) y11Var.a().c()), oc5Var.d, oc5Var.e);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listJ) {
                            if (((String) obj2).length() > 0) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 2:
                        iy3 iy3Var2 = (iy3) obj;
                        iy3Var2.getClass();
                        if (iy3Var2 instanceof ey3) {
                            i = R.string.background_1_17_smart_image_background;
                        } else if (iy3Var2 instanceof gy3) {
                            i = R.string.background_1_2_smart_image_background;
                        } else {
                            if (!(iy3Var2 instanceof hy3) && !(iy3Var2 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i = R.string.background_1_12_smart_image_background;
                        }
                        return yyw.H((bb6) y11Var.z, y11Var.b, i);
                    case 3:
                        iy3 iy3Var3 = (iy3) obj;
                        iy3Var3.getClass();
                        bb6 bb6Var2 = (bb6) y11Var.z;
                        ctf0 ctf0Var2 = y11Var.b;
                        if (iy3Var3 instanceof ey3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_17);
                        } else if (iy3Var3 instanceof gy3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_2);
                        } else {
                            if (!(iy3Var3 instanceof hy3) && !(iy3Var3 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strArrG = ctf0Var2.g(R.array.smart_images_1_12);
                        }
                        String[] strArr = (String[]) Arrays.copyOf(strArrG, strArrG.length);
                        dkq dkqVar = dkq.DRAWABLE;
                        return bb6Var2.b(strArr);
                    case 4:
                        iy3 iy3Var4 = (iy3) obj;
                        iy3Var4.getClass();
                        bb6 bb6Var3 = (bb6) y11Var.z;
                        ctf0 ctf0Var3 = y11Var.b;
                        ctf0Var3.getClass();
                        if (iy3Var4 instanceof ey3) {
                            i2 = R.string.background_image_1_17;
                        } else if (iy3Var4 instanceof gy3) {
                            i2 = R.string.background_image_1_2;
                        } else {
                            if (!(iy3Var4 instanceof hy3) && !(iy3Var4 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i2 = R.string.background_image_1_12;
                        }
                        return new pd5(yyw.H(bb6Var3, ctf0Var3, i2));
                    case 5:
                        iy3 iy3Var5 = (iy3) obj;
                        iy3Var5.getClass();
                        bb6 bb6Var4 = (bb6) y11Var.z;
                        ctf0 ctf0Var4 = y11Var.b;
                        ctf0Var4.getClass();
                        boolean z = iy3Var5 instanceof ey3;
                        if (z) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_17, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof gy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_2, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof hy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (!(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        }
                        int iA = bb6Var4.a(strA, dkq.RAW);
                        if (z) {
                            i3 = R.string.background_lottie_image_1_17;
                        } else if (iy3Var5 instanceof gy3) {
                            i3 = R.string.background_lottie_image_1_2;
                        } else {
                            if (!(iy3Var5 instanceof hy3) && !(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i3 = R.string.background_lottie_image_1_12;
                        }
                        return new qd5(iA != 0 ? Integer.valueOf(iA) : null, yyw.H(bb6Var4, ctf0Var4, i3));
                    case 6:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        Pair pair2 = (Pair) ((fee) y11Var.g.getValue()).b();
                        if (pair2 != null) {
                            return new sd5(ctf0.b(R.attr.uikitSplashBackground, y11Var.b), (String) pair2.f46059a, (String) pair2.b, zBooleanValue);
                        }
                        return null;
                    case 7:
                        iy3 iy3Var6 = (iy3) obj;
                        iy3Var6.getClass();
                        oc5 oc5Var2 = (oc5) ((fee) y11Var.i.getValue()).c();
                        if (oc5Var2 != null) {
                            return new rd5(o050.b0(oc5Var2, iy3Var6), ctf0.b(R.attr.uikitSplashBackground, y11Var.b));
                        }
                        return null;
                    default:
                        n0o0 n0o0Var = y11Var.t;
                        eh3 eh3Var = (eh3) obj;
                        eh3Var.getClass();
                        int iOrdinal = eh3Var.ordinal();
                        if (iOrdinal == 0) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 1) {
                            rd5 rd5Var = (rd5) ((fee) y11Var.w.getValue()).b();
                            return rd5Var != null ? rd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 2) {
                            return (ud5) ((fee) y11Var.u.getValue()).b();
                        }
                        if (iOrdinal != 3) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        sd5 sd5Var = (sd5) ((fee) y11Var.v.getValue()).b();
                        return sd5Var != null ? sd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                }
            }
        });
        this.s = bkb.G(((fee) n0o0VarB.getValue()).e, new pp00(this, cp00Var, (byte) 3));
        final byte b5 = 4;
        this.t = bkb.G(a().d, new Function1(this) { // from class: a.op00
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Pair pair;
                int i;
                String[] strArrG;
                int i2;
                String strA;
                int i3;
                byte b6 = b5;
                y11 y11Var = this.b;
                switch (b6) {
                    case 0:
                        ne5 ne5Var = (ne5) obj;
                        if (ne5Var == null) {
                            return null;
                        }
                        iy3 iy3Var = (iy3) y11Var.a().c();
                        if (iy3Var != null) {
                            if (iy3Var instanceof ey3) {
                                pair = new Pair(ne5Var.c, ne5Var.d);
                            } else if (iy3Var instanceof gy3) {
                                pair = new Pair(ne5Var.f23367a, ne5Var.b);
                            } else if ((iy3Var instanceof hy3) || (iy3Var instanceof fy3)) {
                                pair = new Pair(ne5Var.e, ne5Var.f);
                            }
                            String str = (String) pair.f46059a;
                            String str2 = (String) pair.b;
                            if (str == null || str2 == null) {
                                return null;
                            }
                            return new Pair(str, str2);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        oc5 oc5Var = (oc5) obj;
                        if (oc5Var == null) {
                            return iun.f15405a;
                        }
                        List listJ = q3d.j(o050.b0(oc5Var, (iy3) y11Var.a().c()), oc5Var.d, oc5Var.e);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listJ) {
                            if (((String) obj2).length() > 0) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 2:
                        iy3 iy3Var2 = (iy3) obj;
                        iy3Var2.getClass();
                        if (iy3Var2 instanceof ey3) {
                            i = R.string.background_1_17_smart_image_background;
                        } else if (iy3Var2 instanceof gy3) {
                            i = R.string.background_1_2_smart_image_background;
                        } else {
                            if (!(iy3Var2 instanceof hy3) && !(iy3Var2 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i = R.string.background_1_12_smart_image_background;
                        }
                        return yyw.H((bb6) y11Var.z, y11Var.b, i);
                    case 3:
                        iy3 iy3Var3 = (iy3) obj;
                        iy3Var3.getClass();
                        bb6 bb6Var2 = (bb6) y11Var.z;
                        ctf0 ctf0Var2 = y11Var.b;
                        if (iy3Var3 instanceof ey3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_17);
                        } else if (iy3Var3 instanceof gy3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_2);
                        } else {
                            if (!(iy3Var3 instanceof hy3) && !(iy3Var3 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strArrG = ctf0Var2.g(R.array.smart_images_1_12);
                        }
                        String[] strArr = (String[]) Arrays.copyOf(strArrG, strArrG.length);
                        dkq dkqVar = dkq.DRAWABLE;
                        return bb6Var2.b(strArr);
                    case 4:
                        iy3 iy3Var4 = (iy3) obj;
                        iy3Var4.getClass();
                        bb6 bb6Var3 = (bb6) y11Var.z;
                        ctf0 ctf0Var3 = y11Var.b;
                        ctf0Var3.getClass();
                        if (iy3Var4 instanceof ey3) {
                            i2 = R.string.background_image_1_17;
                        } else if (iy3Var4 instanceof gy3) {
                            i2 = R.string.background_image_1_2;
                        } else {
                            if (!(iy3Var4 instanceof hy3) && !(iy3Var4 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i2 = R.string.background_image_1_12;
                        }
                        return new pd5(yyw.H(bb6Var3, ctf0Var3, i2));
                    case 5:
                        iy3 iy3Var5 = (iy3) obj;
                        iy3Var5.getClass();
                        bb6 bb6Var4 = (bb6) y11Var.z;
                        ctf0 ctf0Var4 = y11Var.b;
                        ctf0Var4.getClass();
                        boolean z = iy3Var5 instanceof ey3;
                        if (z) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_17, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof gy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_2, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof hy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (!(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        }
                        int iA = bb6Var4.a(strA, dkq.RAW);
                        if (z) {
                            i3 = R.string.background_lottie_image_1_17;
                        } else if (iy3Var5 instanceof gy3) {
                            i3 = R.string.background_lottie_image_1_2;
                        } else {
                            if (!(iy3Var5 instanceof hy3) && !(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i3 = R.string.background_lottie_image_1_12;
                        }
                        return new qd5(iA != 0 ? Integer.valueOf(iA) : null, yyw.H(bb6Var4, ctf0Var4, i3));
                    case 6:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        Pair pair2 = (Pair) ((fee) y11Var.g.getValue()).b();
                        if (pair2 != null) {
                            return new sd5(ctf0.b(R.attr.uikitSplashBackground, y11Var.b), (String) pair2.f46059a, (String) pair2.b, zBooleanValue);
                        }
                        return null;
                    case 7:
                        iy3 iy3Var6 = (iy3) obj;
                        iy3Var6.getClass();
                        oc5 oc5Var2 = (oc5) ((fee) y11Var.i.getValue()).c();
                        if (oc5Var2 != null) {
                            return new rd5(o050.b0(oc5Var2, iy3Var6), ctf0.b(R.attr.uikitSplashBackground, y11Var.b));
                        }
                        return null;
                    default:
                        n0o0 n0o0Var = y11Var.t;
                        eh3 eh3Var = (eh3) obj;
                        eh3Var.getClass();
                        int iOrdinal = eh3Var.ordinal();
                        if (iOrdinal == 0) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 1) {
                            rd5 rd5Var = (rd5) ((fee) y11Var.w.getValue()).b();
                            return rd5Var != null ? rd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 2) {
                            return (ud5) ((fee) y11Var.u.getValue()).b();
                        }
                        if (iOrdinal != 3) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        sd5 sd5Var = (sd5) ((fee) y11Var.v.getValue()).b();
                        return sd5Var != null ? sd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                }
            }
        });
        final byte b6 = 5;
        this.u = bkb.G(a().d, new Function1(this) { // from class: a.op00
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Pair pair;
                int i;
                String[] strArrG;
                int i2;
                String strA;
                int i3;
                byte b7 = b6;
                y11 y11Var = this.b;
                switch (b7) {
                    case 0:
                        ne5 ne5Var = (ne5) obj;
                        if (ne5Var == null) {
                            return null;
                        }
                        iy3 iy3Var = (iy3) y11Var.a().c();
                        if (iy3Var != null) {
                            if (iy3Var instanceof ey3) {
                                pair = new Pair(ne5Var.c, ne5Var.d);
                            } else if (iy3Var instanceof gy3) {
                                pair = new Pair(ne5Var.f23367a, ne5Var.b);
                            } else if ((iy3Var instanceof hy3) || (iy3Var instanceof fy3)) {
                                pair = new Pair(ne5Var.e, ne5Var.f);
                            }
                            String str = (String) pair.f46059a;
                            String str2 = (String) pair.b;
                            if (str == null || str2 == null) {
                                return null;
                            }
                            return new Pair(str, str2);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        oc5 oc5Var = (oc5) obj;
                        if (oc5Var == null) {
                            return iun.f15405a;
                        }
                        List listJ = q3d.j(o050.b0(oc5Var, (iy3) y11Var.a().c()), oc5Var.d, oc5Var.e);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listJ) {
                            if (((String) obj2).length() > 0) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 2:
                        iy3 iy3Var2 = (iy3) obj;
                        iy3Var2.getClass();
                        if (iy3Var2 instanceof ey3) {
                            i = R.string.background_1_17_smart_image_background;
                        } else if (iy3Var2 instanceof gy3) {
                            i = R.string.background_1_2_smart_image_background;
                        } else {
                            if (!(iy3Var2 instanceof hy3) && !(iy3Var2 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i = R.string.background_1_12_smart_image_background;
                        }
                        return yyw.H((bb6) y11Var.z, y11Var.b, i);
                    case 3:
                        iy3 iy3Var3 = (iy3) obj;
                        iy3Var3.getClass();
                        bb6 bb6Var2 = (bb6) y11Var.z;
                        ctf0 ctf0Var2 = y11Var.b;
                        if (iy3Var3 instanceof ey3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_17);
                        } else if (iy3Var3 instanceof gy3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_2);
                        } else {
                            if (!(iy3Var3 instanceof hy3) && !(iy3Var3 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strArrG = ctf0Var2.g(R.array.smart_images_1_12);
                        }
                        String[] strArr = (String[]) Arrays.copyOf(strArrG, strArrG.length);
                        dkq dkqVar = dkq.DRAWABLE;
                        return bb6Var2.b(strArr);
                    case 4:
                        iy3 iy3Var4 = (iy3) obj;
                        iy3Var4.getClass();
                        bb6 bb6Var3 = (bb6) y11Var.z;
                        ctf0 ctf0Var3 = y11Var.b;
                        ctf0Var3.getClass();
                        if (iy3Var4 instanceof ey3) {
                            i2 = R.string.background_image_1_17;
                        } else if (iy3Var4 instanceof gy3) {
                            i2 = R.string.background_image_1_2;
                        } else {
                            if (!(iy3Var4 instanceof hy3) && !(iy3Var4 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i2 = R.string.background_image_1_12;
                        }
                        return new pd5(yyw.H(bb6Var3, ctf0Var3, i2));
                    case 5:
                        iy3 iy3Var5 = (iy3) obj;
                        iy3Var5.getClass();
                        bb6 bb6Var4 = (bb6) y11Var.z;
                        ctf0 ctf0Var4 = y11Var.b;
                        ctf0Var4.getClass();
                        boolean z = iy3Var5 instanceof ey3;
                        if (z) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_17, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof gy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_2, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof hy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (!(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        }
                        int iA = bb6Var4.a(strA, dkq.RAW);
                        if (z) {
                            i3 = R.string.background_lottie_image_1_17;
                        } else if (iy3Var5 instanceof gy3) {
                            i3 = R.string.background_lottie_image_1_2;
                        } else {
                            if (!(iy3Var5 instanceof hy3) && !(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i3 = R.string.background_lottie_image_1_12;
                        }
                        return new qd5(iA != 0 ? Integer.valueOf(iA) : null, yyw.H(bb6Var4, ctf0Var4, i3));
                    case 6:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        Pair pair2 = (Pair) ((fee) y11Var.g.getValue()).b();
                        if (pair2 != null) {
                            return new sd5(ctf0.b(R.attr.uikitSplashBackground, y11Var.b), (String) pair2.f46059a, (String) pair2.b, zBooleanValue);
                        }
                        return null;
                    case 7:
                        iy3 iy3Var6 = (iy3) obj;
                        iy3Var6.getClass();
                        oc5 oc5Var2 = (oc5) ((fee) y11Var.i.getValue()).c();
                        if (oc5Var2 != null) {
                            return new rd5(o050.b0(oc5Var2, iy3Var6), ctf0.b(R.attr.uikitSplashBackground, y11Var.b));
                        }
                        return null;
                    default:
                        n0o0 n0o0Var = y11Var.t;
                        eh3 eh3Var = (eh3) obj;
                        eh3Var.getClass();
                        int iOrdinal = eh3Var.ordinal();
                        if (iOrdinal == 0) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 1) {
                            rd5 rd5Var = (rd5) ((fee) y11Var.w.getValue()).b();
                            return rd5Var != null ? rd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 2) {
                            return (ud5) ((fee) y11Var.u.getValue()).b();
                        }
                        if (iOrdinal != 3) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        sd5 sd5Var = (sd5) ((fee) y11Var.v.getValue()).b();
                        return sd5Var != null ? sd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                }
            }
        });
        pz40 pz40Var = ((fee) n0o0VarH2.getValue()).d;
        final byte b7 = 6;
        this.v = bkb.G(pz40Var, new Function1(this) { // from class: a.op00
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Pair pair;
                int i;
                String[] strArrG;
                int i2;
                String strA;
                int i3;
                byte b8 = b7;
                y11 y11Var = this.b;
                switch (b8) {
                    case 0:
                        ne5 ne5Var = (ne5) obj;
                        if (ne5Var == null) {
                            return null;
                        }
                        iy3 iy3Var = (iy3) y11Var.a().c();
                        if (iy3Var != null) {
                            if (iy3Var instanceof ey3) {
                                pair = new Pair(ne5Var.c, ne5Var.d);
                            } else if (iy3Var instanceof gy3) {
                                pair = new Pair(ne5Var.f23367a, ne5Var.b);
                            } else if ((iy3Var instanceof hy3) || (iy3Var instanceof fy3)) {
                                pair = new Pair(ne5Var.e, ne5Var.f);
                            }
                            String str = (String) pair.f46059a;
                            String str2 = (String) pair.b;
                            if (str == null || str2 == null) {
                                return null;
                            }
                            return new Pair(str, str2);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        oc5 oc5Var = (oc5) obj;
                        if (oc5Var == null) {
                            return iun.f15405a;
                        }
                        List listJ = q3d.j(o050.b0(oc5Var, (iy3) y11Var.a().c()), oc5Var.d, oc5Var.e);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listJ) {
                            if (((String) obj2).length() > 0) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 2:
                        iy3 iy3Var2 = (iy3) obj;
                        iy3Var2.getClass();
                        if (iy3Var2 instanceof ey3) {
                            i = R.string.background_1_17_smart_image_background;
                        } else if (iy3Var2 instanceof gy3) {
                            i = R.string.background_1_2_smart_image_background;
                        } else {
                            if (!(iy3Var2 instanceof hy3) && !(iy3Var2 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i = R.string.background_1_12_smart_image_background;
                        }
                        return yyw.H((bb6) y11Var.z, y11Var.b, i);
                    case 3:
                        iy3 iy3Var3 = (iy3) obj;
                        iy3Var3.getClass();
                        bb6 bb6Var2 = (bb6) y11Var.z;
                        ctf0 ctf0Var2 = y11Var.b;
                        if (iy3Var3 instanceof ey3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_17);
                        } else if (iy3Var3 instanceof gy3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_2);
                        } else {
                            if (!(iy3Var3 instanceof hy3) && !(iy3Var3 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strArrG = ctf0Var2.g(R.array.smart_images_1_12);
                        }
                        String[] strArr = (String[]) Arrays.copyOf(strArrG, strArrG.length);
                        dkq dkqVar = dkq.DRAWABLE;
                        return bb6Var2.b(strArr);
                    case 4:
                        iy3 iy3Var4 = (iy3) obj;
                        iy3Var4.getClass();
                        bb6 bb6Var3 = (bb6) y11Var.z;
                        ctf0 ctf0Var3 = y11Var.b;
                        ctf0Var3.getClass();
                        if (iy3Var4 instanceof ey3) {
                            i2 = R.string.background_image_1_17;
                        } else if (iy3Var4 instanceof gy3) {
                            i2 = R.string.background_image_1_2;
                        } else {
                            if (!(iy3Var4 instanceof hy3) && !(iy3Var4 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i2 = R.string.background_image_1_12;
                        }
                        return new pd5(yyw.H(bb6Var3, ctf0Var3, i2));
                    case 5:
                        iy3 iy3Var5 = (iy3) obj;
                        iy3Var5.getClass();
                        bb6 bb6Var4 = (bb6) y11Var.z;
                        ctf0 ctf0Var4 = y11Var.b;
                        ctf0Var4.getClass();
                        boolean z = iy3Var5 instanceof ey3;
                        if (z) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_17, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof gy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_2, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof hy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (!(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        }
                        int iA = bb6Var4.a(strA, dkq.RAW);
                        if (z) {
                            i3 = R.string.background_lottie_image_1_17;
                        } else if (iy3Var5 instanceof gy3) {
                            i3 = R.string.background_lottie_image_1_2;
                        } else {
                            if (!(iy3Var5 instanceof hy3) && !(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i3 = R.string.background_lottie_image_1_12;
                        }
                        return new qd5(iA != 0 ? Integer.valueOf(iA) : null, yyw.H(bb6Var4, ctf0Var4, i3));
                    case 6:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        Pair pair2 = (Pair) ((fee) y11Var.g.getValue()).b();
                        if (pair2 != null) {
                            return new sd5(ctf0.b(R.attr.uikitSplashBackground, y11Var.b), (String) pair2.f46059a, (String) pair2.b, zBooleanValue);
                        }
                        return null;
                    case 7:
                        iy3 iy3Var6 = (iy3) obj;
                        iy3Var6.getClass();
                        oc5 oc5Var2 = (oc5) ((fee) y11Var.i.getValue()).c();
                        if (oc5Var2 != null) {
                            return new rd5(o050.b0(oc5Var2, iy3Var6), ctf0.b(R.attr.uikitSplashBackground, y11Var.b));
                        }
                        return null;
                    default:
                        n0o0 n0o0Var = y11Var.t;
                        eh3 eh3Var = (eh3) obj;
                        eh3Var.getClass();
                        int iOrdinal = eh3Var.ordinal();
                        if (iOrdinal == 0) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 1) {
                            rd5 rd5Var = (rd5) ((fee) y11Var.w.getValue()).b();
                            return rd5Var != null ? rd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 2) {
                            return (ud5) ((fee) y11Var.u.getValue()).b();
                        }
                        if (iOrdinal != 3) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        sd5 sd5Var = (sd5) ((fee) y11Var.v.getValue()).b();
                        return sd5Var != null ? sd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                }
            }
        });
        final byte b8 = 7;
        this.w = bkb.G(a().d, new Function1(this) { // from class: a.op00
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Pair pair;
                int i;
                String[] strArrG;
                int i2;
                String strA;
                int i3;
                byte b9 = b8;
                y11 y11Var = this.b;
                switch (b9) {
                    case 0:
                        ne5 ne5Var = (ne5) obj;
                        if (ne5Var == null) {
                            return null;
                        }
                        iy3 iy3Var = (iy3) y11Var.a().c();
                        if (iy3Var != null) {
                            if (iy3Var instanceof ey3) {
                                pair = new Pair(ne5Var.c, ne5Var.d);
                            } else if (iy3Var instanceof gy3) {
                                pair = new Pair(ne5Var.f23367a, ne5Var.b);
                            } else if ((iy3Var instanceof hy3) || (iy3Var instanceof fy3)) {
                                pair = new Pair(ne5Var.e, ne5Var.f);
                            }
                            String str = (String) pair.f46059a;
                            String str2 = (String) pair.b;
                            if (str == null || str2 == null) {
                                return null;
                            }
                            return new Pair(str, str2);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        oc5 oc5Var = (oc5) obj;
                        if (oc5Var == null) {
                            return iun.f15405a;
                        }
                        List listJ = q3d.j(o050.b0(oc5Var, (iy3) y11Var.a().c()), oc5Var.d, oc5Var.e);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listJ) {
                            if (((String) obj2).length() > 0) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 2:
                        iy3 iy3Var2 = (iy3) obj;
                        iy3Var2.getClass();
                        if (iy3Var2 instanceof ey3) {
                            i = R.string.background_1_17_smart_image_background;
                        } else if (iy3Var2 instanceof gy3) {
                            i = R.string.background_1_2_smart_image_background;
                        } else {
                            if (!(iy3Var2 instanceof hy3) && !(iy3Var2 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i = R.string.background_1_12_smart_image_background;
                        }
                        return yyw.H((bb6) y11Var.z, y11Var.b, i);
                    case 3:
                        iy3 iy3Var3 = (iy3) obj;
                        iy3Var3.getClass();
                        bb6 bb6Var2 = (bb6) y11Var.z;
                        ctf0 ctf0Var2 = y11Var.b;
                        if (iy3Var3 instanceof ey3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_17);
                        } else if (iy3Var3 instanceof gy3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_2);
                        } else {
                            if (!(iy3Var3 instanceof hy3) && !(iy3Var3 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strArrG = ctf0Var2.g(R.array.smart_images_1_12);
                        }
                        String[] strArr = (String[]) Arrays.copyOf(strArrG, strArrG.length);
                        dkq dkqVar = dkq.DRAWABLE;
                        return bb6Var2.b(strArr);
                    case 4:
                        iy3 iy3Var4 = (iy3) obj;
                        iy3Var4.getClass();
                        bb6 bb6Var3 = (bb6) y11Var.z;
                        ctf0 ctf0Var3 = y11Var.b;
                        ctf0Var3.getClass();
                        if (iy3Var4 instanceof ey3) {
                            i2 = R.string.background_image_1_17;
                        } else if (iy3Var4 instanceof gy3) {
                            i2 = R.string.background_image_1_2;
                        } else {
                            if (!(iy3Var4 instanceof hy3) && !(iy3Var4 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i2 = R.string.background_image_1_12;
                        }
                        return new pd5(yyw.H(bb6Var3, ctf0Var3, i2));
                    case 5:
                        iy3 iy3Var5 = (iy3) obj;
                        iy3Var5.getClass();
                        bb6 bb6Var4 = (bb6) y11Var.z;
                        ctf0 ctf0Var4 = y11Var.b;
                        ctf0Var4.getClass();
                        boolean z = iy3Var5 instanceof ey3;
                        if (z) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_17, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof gy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_2, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof hy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (!(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        }
                        int iA = bb6Var4.a(strA, dkq.RAW);
                        if (z) {
                            i3 = R.string.background_lottie_image_1_17;
                        } else if (iy3Var5 instanceof gy3) {
                            i3 = R.string.background_lottie_image_1_2;
                        } else {
                            if (!(iy3Var5 instanceof hy3) && !(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i3 = R.string.background_lottie_image_1_12;
                        }
                        return new qd5(iA != 0 ? Integer.valueOf(iA) : null, yyw.H(bb6Var4, ctf0Var4, i3));
                    case 6:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        Pair pair2 = (Pair) ((fee) y11Var.g.getValue()).b();
                        if (pair2 != null) {
                            return new sd5(ctf0.b(R.attr.uikitSplashBackground, y11Var.b), (String) pair2.f46059a, (String) pair2.b, zBooleanValue);
                        }
                        return null;
                    case 7:
                        iy3 iy3Var6 = (iy3) obj;
                        iy3Var6.getClass();
                        oc5 oc5Var2 = (oc5) ((fee) y11Var.i.getValue()).c();
                        if (oc5Var2 != null) {
                            return new rd5(o050.b0(oc5Var2, iy3Var6), ctf0.b(R.attr.uikitSplashBackground, y11Var.b));
                        }
                        return null;
                    default:
                        n0o0 n0o0Var = y11Var.t;
                        eh3 eh3Var = (eh3) obj;
                        eh3Var.getClass();
                        int iOrdinal = eh3Var.ordinal();
                        if (iOrdinal == 0) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 1) {
                            rd5 rd5Var = (rd5) ((fee) y11Var.w.getValue()).b();
                            return rd5Var != null ? rd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 2) {
                            return (ud5) ((fee) y11Var.u.getValue()).b();
                        }
                        if (iOrdinal != 3) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        sd5 sd5Var = (sd5) ((fee) y11Var.v.getValue()).b();
                        return sd5Var != null ? sd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                }
            }
        });
        final byte b9 = 8;
        this.x = maz.b(new yw9(cp00Var.c.b, new Function1(this) { // from class: a.op00
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Pair pair;
                int i;
                String[] strArrG;
                int i2;
                String strA;
                int i3;
                byte b10 = b9;
                y11 y11Var = this.b;
                switch (b10) {
                    case 0:
                        ne5 ne5Var = (ne5) obj;
                        if (ne5Var == null) {
                            return null;
                        }
                        iy3 iy3Var = (iy3) y11Var.a().c();
                        if (iy3Var != null) {
                            if (iy3Var instanceof ey3) {
                                pair = new Pair(ne5Var.c, ne5Var.d);
                            } else if (iy3Var instanceof gy3) {
                                pair = new Pair(ne5Var.f23367a, ne5Var.b);
                            } else if ((iy3Var instanceof hy3) || (iy3Var instanceof fy3)) {
                                pair = new Pair(ne5Var.e, ne5Var.f);
                            }
                            String str = (String) pair.f46059a;
                            String str2 = (String) pair.b;
                            if (str == null || str2 == null) {
                                return null;
                            }
                            return new Pair(str, str2);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        oc5 oc5Var = (oc5) obj;
                        if (oc5Var == null) {
                            return iun.f15405a;
                        }
                        List listJ = q3d.j(o050.b0(oc5Var, (iy3) y11Var.a().c()), oc5Var.d, oc5Var.e);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : listJ) {
                            if (((String) obj2).length() > 0) {
                                arrayList.add(obj2);
                            }
                        }
                        return arrayList;
                    case 2:
                        iy3 iy3Var2 = (iy3) obj;
                        iy3Var2.getClass();
                        if (iy3Var2 instanceof ey3) {
                            i = R.string.background_1_17_smart_image_background;
                        } else if (iy3Var2 instanceof gy3) {
                            i = R.string.background_1_2_smart_image_background;
                        } else {
                            if (!(iy3Var2 instanceof hy3) && !(iy3Var2 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i = R.string.background_1_12_smart_image_background;
                        }
                        return yyw.H((bb6) y11Var.z, y11Var.b, i);
                    case 3:
                        iy3 iy3Var3 = (iy3) obj;
                        iy3Var3.getClass();
                        bb6 bb6Var2 = (bb6) y11Var.z;
                        ctf0 ctf0Var2 = y11Var.b;
                        if (iy3Var3 instanceof ey3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_17);
                        } else if (iy3Var3 instanceof gy3) {
                            strArrG = ctf0Var2.g(R.array.smart_images_1_2);
                        } else {
                            if (!(iy3Var3 instanceof hy3) && !(iy3Var3 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strArrG = ctf0Var2.g(R.array.smart_images_1_12);
                        }
                        String[] strArr = (String[]) Arrays.copyOf(strArrG, strArrG.length);
                        dkq dkqVar = dkq.DRAWABLE;
                        return bb6Var2.b(strArr);
                    case 4:
                        iy3 iy3Var4 = (iy3) obj;
                        iy3Var4.getClass();
                        bb6 bb6Var3 = (bb6) y11Var.z;
                        ctf0 ctf0Var3 = y11Var.b;
                        ctf0Var3.getClass();
                        if (iy3Var4 instanceof ey3) {
                            i2 = R.string.background_image_1_17;
                        } else if (iy3Var4 instanceof gy3) {
                            i2 = R.string.background_image_1_2;
                        } else {
                            if (!(iy3Var4 instanceof hy3) && !(iy3Var4 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i2 = R.string.background_image_1_12;
                        }
                        return new pd5(yyw.H(bb6Var3, ctf0Var3, i2));
                    case 5:
                        iy3 iy3Var5 = (iy3) obj;
                        iy3Var5.getClass();
                        bb6 bb6Var4 = (bb6) y11Var.z;
                        ctf0 ctf0Var4 = y11Var.b;
                        ctf0Var4.getClass();
                        boolean z = iy3Var5 instanceof ey3;
                        if (z) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_17, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof gy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_2, Arrays.copyOf(new Object[0], 0));
                        } else if (iy3Var5 instanceof hy3) {
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (!(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            strA = ctf0Var4.b.a(R.string.background_lottie_1_12, Arrays.copyOf(new Object[0], 0));
                        }
                        int iA = bb6Var4.a(strA, dkq.RAW);
                        if (z) {
                            i3 = R.string.background_lottie_image_1_17;
                        } else if (iy3Var5 instanceof gy3) {
                            i3 = R.string.background_lottie_image_1_2;
                        } else {
                            if (!(iy3Var5 instanceof hy3) && !(iy3Var5 instanceof fy3)) {
                                t9f.b();
                                return null;
                            }
                            i3 = R.string.background_lottie_image_1_12;
                        }
                        return new qd5(iA != 0 ? Integer.valueOf(iA) : null, yyw.H(bb6Var4, ctf0Var4, i3));
                    case 6:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        Pair pair2 = (Pair) ((fee) y11Var.g.getValue()).b();
                        if (pair2 != null) {
                            return new sd5(ctf0.b(R.attr.uikitSplashBackground, y11Var.b), (String) pair2.f46059a, (String) pair2.b, zBooleanValue);
                        }
                        return null;
                    case 7:
                        iy3 iy3Var6 = (iy3) obj;
                        iy3Var6.getClass();
                        oc5 oc5Var2 = (oc5) ((fee) y11Var.i.getValue()).c();
                        if (oc5Var2 != null) {
                            return new rd5(o050.b0(oc5Var2, iy3Var6), ctf0.b(R.attr.uikitSplashBackground, y11Var.b));
                        }
                        return null;
                    default:
                        n0o0 n0o0Var = y11Var.t;
                        eh3 eh3Var = (eh3) obj;
                        eh3Var.getClass();
                        int iOrdinal = eh3Var.ordinal();
                        if (iOrdinal == 0) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 1) {
                            rd5 rd5Var = (rd5) ((fee) y11Var.w.getValue()).b();
                            return rd5Var != null ? rd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal == 2) {
                            return (ud5) ((fee) y11Var.u.getValue()).b();
                        }
                        if (iOrdinal != 3) {
                            return (ud5) ((fee) n0o0Var.getValue()).b();
                        }
                        sd5 sd5Var = (sd5) ((fee) y11Var.v.getValue()).b();
                        return sd5Var != null ? sd5Var : (ud5) ((fee) n0o0Var.getValue()).b();
                }
            }
        }, (byte) 20));
        this.y = maz.b(new yw9(Boolean.valueOf(cp00Var.l), new pp00(this, cp00Var, (byte) 4), (byte) 20));
    }

    public fee a() {
        return (fee) this.f.getValue();
    }

    public Map b() {
        Map map;
        q7f0 q7f0Var = (q7f0) c().c();
        if (q7f0Var != null && (map = (Map) ((Map) ((fee) this.i.getValue()).c()).get(q7f0Var)) != null) {
            return map;
        }
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        return lunVar;
    }

    public fee c() {
        return (fee) this.c.getValue();
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        byte b = this.f41833a;
        n0o0 n0o0Var = this.w;
        n0o0 n0o0Var2 = this.v;
        n0o0 n0o0Var3 = this.s;
        n0o0 n0o0Var4 = this.m;
        n0o0 n0o0Var5 = this.o;
        n0o0 n0o0Var6 = this.f;
        n0o0 n0o0Var7 = this.e;
        n0o0 n0o0Var8 = this.d;
        n0o0 n0o0Var9 = this.q;
        n0o0 n0o0Var10 = this.r;
        n0o0 n0o0Var11 = this.p;
        n0o0 n0o0Var12 = this.x;
        n0o0 n0o0Var13 = this.y;
        n0o0 n0o0Var14 = this.k;
        n0o0 n0o0Var15 = this.h;
        n0o0 n0o0Var16 = this.g;
        n0o0 n0o0Var17 = this.n;
        n0o0 n0o0Var18 = this.j;
        n0o0 n0o0Var19 = this.i;
        n0o0 n0o0Var20 = this.l;
        switch (b) {
            case 0:
                q11 q11Var = (q11) obj;
                q11Var.getClass();
                ((fee) this.c.getValue()).d(Boolean.valueOf(q11Var.m));
                ((fee) n0o0Var8.getValue()).d(q11Var.s);
                ((fee) n0o0Var15.getValue()).d(q11Var.h);
                ((fee) n0o0Var7.getValue()).d(q11Var.j);
                ((fee) n0o0Var19.getValue()).d(q11Var.i);
                ((fee) n0o0Var14.getValue()).d(q11Var.b);
                ((fee) n0o0Var20.getValue()).d(Boolean.valueOf(q11Var.n));
                ((fee) n0o0Var17.getValue()).d(q11Var.o);
                ((fee) n0o0Var16.getValue()).d(q11Var.f);
                ((fee) n0o0Var18.getValue()).d(q11Var.g);
                ((fee) n0o0Var4.getValue()).d(Boolean.valueOf(q11Var.q));
                ((fee) n0o0Var6.getValue()).d(q11Var.y);
                int size = ((a4x) ((fee) n0o0Var12.getValue()).b()).size() + ((a4x) ((fee) n0o0Var.getValue()).b()).size();
                boolean zBooleanValue = ((Boolean) ((fee) n0o0Var4.getValue()).c()).booleanValue();
                n0o0 n0o0Var21 = this.u;
                if (zBooleanValue) {
                    return new v11((imm) ((fee) n0o0Var21.getValue()).b(), (bd) ((fee) n0o0Var10.getValue()).b(), (mdm) ((fee) n0o0Var9.getValue()).b());
                }
                if (size == 0 && ((i4) ((fee) n0o0Var2.getValue()).b()).isEmpty()) {
                    return new t11((imm) ((fee) n0o0Var21.getValue()).b(), (bd) ((fee) n0o0Var10.getValue()).b(), (mdm) ((fee) n0o0Var5.getValue()).b());
                }
                if (!((List) ((fee) n0o0Var3.getValue()).b()).isEmpty()) {
                    return new s11((imm) ((fee) n0o0Var21.getValue()).b(), (bd) ((fee) n0o0Var10.getValue()).b(), ((Boolean) ((fee) n0o0Var20.getValue()).c()).booleanValue(), (j7v) ((fee) n0o0Var13.getValue()).b(), dyb.r0((Iterable) ((fee) n0o0Var3.getValue()).b()));
                }
                imm immVar = (imm) ((fee) n0o0Var21.getValue()).b();
                bd bdVar = (bd) ((fee) n0o0Var10.getValue()).b();
                mdm mdmVar = (mdm) ((fee) n0o0Var11.getValue()).b();
                return new u11(immVar, bdVar, (j7v) ((fee) n0o0Var13.getValue()).b(), (i4) ((fee) n0o0Var2.getValue()).b(), mdmVar);
            case 1:
                cp00 cp00Var = (cp00) obj;
                cp00Var.getClass();
                ((fee) n0o0Var20.getValue()).d(cp00Var.d);
                ((fee) n0o0Var16.getValue()).d(cp00Var.e);
                ((fee) n0o0Var15.getValue()).d(Boolean.valueOf(cp00Var.f));
                a().d(cp00Var.b);
                ((fee) n0o0Var19.getValue()).d(cp00Var.g);
                ((fee) n0o0Var17.getValue()).d(cp00Var.h);
                ((fee) n0o0Var14.getValue()).d(cp00Var.i);
                ((fee) n0o0Var18.getValue()).d(Boolean.valueOf(cp00Var.k));
                ((fee) n0o0Var13.getValue()).d(Boolean.valueOf(cp00Var.l));
                ((fee) n0o0Var12.getValue()).d(cp00Var.c.b);
                return (mp00) ((fee) n0o0Var13.getValue()).b();
            default:
                u4f0 u4f0Var = (u4f0) obj;
                u4f0Var.getClass();
                fee feeVar = (fee) n0o0Var11.getValue();
                sff0 sff0Var = u4f0Var.m;
                feeVar.d(Boolean.valueOf(sff0Var.l.l));
                fee feeVar2 = (fee) n0o0Var10.getValue();
                s9m0 s9m0Var = aoo0.f1212a;
                String str = sff0Var.g.n.f739a;
                s9m0Var.getClass();
                feeVar2.d(s9m0.g(str));
                ((fee) n0o0Var20.getValue()).d(Boolean.valueOf(u4f0Var.f35045a));
                ((fee) n0o0Var9.getValue()).d(Boolean.valueOf(u4f0Var.b));
                c().d(u4f0Var.j);
                ((fee) n0o0Var8.getValue()).d(u4f0Var.g);
                ((fee) n0o0Var7.getValue()).d(u4f0Var.d);
                ((fee) n0o0Var6.getValue()).d(u4f0Var.c);
                ((fee) n0o0Var19.getValue()).d(u4f0Var.e);
                ((fee) n0o0Var18.getValue()).d(u4f0Var.f);
                ((fee) n0o0Var17.getValue()).d(u4f0Var.o);
                ((fee) n0o0Var5.getValue()).d(1357);
                ((fee) n0o0Var16.getValue()).d(u4f0Var.h);
                ((fee) n0o0Var15.getValue()).d(u4f0Var.i);
                ((fee) n0o0Var14.getValue()).d(u4f0Var.k);
                ((fee) n0o0Var4.getValue()).d(Boolean.valueOf(u4f0Var.n));
                ((fee) n0o0Var3.getValue()).d(u4f0Var.l);
                boolean zBooleanValue2 = ((Boolean) ((fee) n0o0Var20.getValue()).c()).booleanValue();
                boolean zBooleanValue3 = ((Boolean) ((fee) n0o0Var9.getValue()).c()).booleanValue();
                imm immVar2 = (imm) ((fee) n0o0Var13.getValue()).b();
                a4x a4xVar = (a4x) ((fee) n0o0Var3.getValue()).b();
                a4x a4xVar2 = (a4x) ((fee) n0o0Var2.getValue()).b();
                q7f0 q7f0Var = (q7f0) c().c();
                mtl mtlVar = (mtl) ((fee) this.t.getValue()).b();
                return new v4f0(immVar2, a4xVar, (aoo0) ((fee) n0o0Var10.getValue()).c(), ((Number) ((fee) n0o0Var12.getValue()).b()).intValue(), a4xVar2, q7f0Var, mtlVar, zBooleanValue3, ((Number) ((fee) n0o0Var.getValue()).b()).intValue(), zBooleanValue2);
        }
    }

    public y11(ctf0 ctf0Var, u4f0 u4f0Var) {
        final byte b = 2;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.z = u4f0Var;
        this.c = bkb.H(u4f0Var.j);
        this.d = bkb.H(u4f0Var.g);
        n0o0 n0o0VarH = bkb.H(u4f0Var.d);
        this.e = n0o0VarH;
        this.f = bkb.H(u4f0Var.c);
        this.g = bkb.H(u4f0Var.h);
        this.h = bkb.H(u4f0Var.i);
        n0o0 n0o0VarH2 = bkb.H(u4f0Var.e);
        this.i = n0o0VarH2;
        this.j = bkb.H(u4f0Var.f);
        this.k = bkb.H(u4f0Var.k);
        this.l = bkb.H(Boolean.valueOf(u4f0Var.f35045a));
        n0o0 n0o0VarH3 = bkb.H(Boolean.valueOf(u4f0Var.n));
        this.m = n0o0VarH3;
        this.n = bkb.H(u4f0Var.o);
        this.o = bkb.H(1357);
        sff0 sff0Var = u4f0Var.m;
        this.p = bkb.H(Boolean.valueOf(sff0Var.l.l));
        n0o0 n0o0VarH4 = bkb.H(Boolean.valueOf(u4f0Var.b));
        this.q = n0o0VarH4;
        s9m0 s9m0Var = aoo0.f1212a;
        String str = sff0Var.g.n.f739a;
        s9m0Var.getClass();
        this.r = bkb.H(s9m0.g(str));
        final byte b2 = 0;
        this.s = maz.b(new yw9(u4f0Var.l, new Function1(this) { // from class: a.w4f0
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:114:0x0334  */
            /* JADX WARN: Code duplicated, block: B:339:0x0160 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:34:0x0130  */
            /* JADX WARN: Code duplicated, block: B:35:0x0138  */
            /* JADX WARN: Code duplicated, block: B:38:0x013c  */
            /* JADX WARN: Code duplicated, block: B:41:0x0154  */
            /* JADX WARN: Code duplicated, block: B:44:0x0162 A[LOOP:1: B:39:0x014e->B:44:0x0162, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:85:0x02ad  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v66 java.lang.Object, still in use, count: 2, list:
                  (r2v66 java.lang.Object) from 0x012c: PHI (r2 I:??) = (r2v59 java.lang.Object), (r2v66 java.lang.Object) binds: [B:31:0x012b, B:336:0x012c] A[DONT_GENERATE, DONT_INLINE]
                  (r2v66 java.lang.Object) from 0x011c: CHECK_CAST (java.util.Map$Entry) (r2v66 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r31) {
                /*
                    Method dump skipped, instruction units count: 2352
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.w4f0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        pz40 pz40Var = ((fee) n0o0VarH4.getValue()).d;
        final byte b3 = 1;
        this.t = bkb.G(pz40Var, new Function1(this) { // from class: a.w4f0
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:114:0x0334  */
            /* JADX WARN: Code duplicated, block: B:339:0x0160 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:34:0x0130  */
            /* JADX WARN: Code duplicated, block: B:35:0x0138  */
            /* JADX WARN: Code duplicated, block: B:38:0x013c  */
            /* JADX WARN: Code duplicated, block: B:41:0x0154  */
            /* JADX WARN: Code duplicated, block: B:44:0x0162 A[LOOP:1: B:39:0x014e->B:44:0x0162, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:85:0x02ad  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v66 java.lang.Object, still in use, count: 2, list:
                  (r2v66 java.lang.Object) from 0x012c: PHI (r2 I:??) = (r2v59 java.lang.Object), (r2v66 java.lang.Object) binds: [B:31:0x012b, B:336:0x012c] A[DONT_GENERATE, DONT_INLINE]
                  (r2v66 java.lang.Object) from 0x011c: CHECK_CAST (java.util.Map$Entry) (r2v66 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r31) {
                /*
                    Method dump skipped, instruction units count: 2352
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.w4f0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        this.u = bkb.G(((fee) n0o0VarH3.getValue()).d, new Function1(this) { // from class: a.w4f0
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:114:0x0334  */
            /* JADX WARN: Code duplicated, block: B:339:0x0160 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:34:0x0130  */
            /* JADX WARN: Code duplicated, block: B:35:0x0138  */
            /* JADX WARN: Code duplicated, block: B:38:0x013c  */
            /* JADX WARN: Code duplicated, block: B:41:0x0154  */
            /* JADX WARN: Code duplicated, block: B:44:0x0162 A[LOOP:1: B:39:0x014e->B:44:0x0162, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:85:0x02ad  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v66 java.lang.Object, still in use, count: 2, list:
                  (r2v66 java.lang.Object) from 0x012c: PHI (r2 I:??) = (r2v59 java.lang.Object), (r2v66 java.lang.Object) binds: [B:31:0x012b, B:336:0x012c] A[DONT_GENERATE, DONT_INLINE]
                  (r2v66 java.lang.Object) from 0x011c: CHECK_CAST (java.util.Map$Entry) (r2v66 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r31) {
                /*
                    Method dump skipped, instruction units count: 2352
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.w4f0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final byte b4 = 3;
        this.v = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.w4f0
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:114:0x0334  */
            /* JADX WARN: Code duplicated, block: B:339:0x0160 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:34:0x0130  */
            /* JADX WARN: Code duplicated, block: B:35:0x0138  */
            /* JADX WARN: Code duplicated, block: B:38:0x013c  */
            /* JADX WARN: Code duplicated, block: B:41:0x0154  */
            /* JADX WARN: Code duplicated, block: B:44:0x0162 A[LOOP:1: B:39:0x014e->B:44:0x0162, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:85:0x02ad  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v66 java.lang.Object, still in use, count: 2, list:
                  (r2v66 java.lang.Object) from 0x012c: PHI (r2 I:??) = (r2v59 java.lang.Object), (r2v66 java.lang.Object) binds: [B:31:0x012b, B:336:0x012c] A[DONT_GENERATE, DONT_INLINE]
                  (r2v66 java.lang.Object) from 0x011c: CHECK_CAST (java.util.Map$Entry) (r2v66 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r31) {
                /*
                    Method dump skipped, instruction units count: 2352
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.w4f0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final byte b5 = 4;
        this.w = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.w4f0
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:114:0x0334  */
            /* JADX WARN: Code duplicated, block: B:339:0x0160 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:34:0x0130  */
            /* JADX WARN: Code duplicated, block: B:35:0x0138  */
            /* JADX WARN: Code duplicated, block: B:38:0x013c  */
            /* JADX WARN: Code duplicated, block: B:41:0x0154  */
            /* JADX WARN: Code duplicated, block: B:44:0x0162 A[LOOP:1: B:39:0x014e->B:44:0x0162, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:85:0x02ad  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v66 java.lang.Object, still in use, count: 2, list:
                  (r2v66 java.lang.Object) from 0x012c: PHI (r2 I:??) = (r2v59 java.lang.Object), (r2v66 java.lang.Object) binds: [B:31:0x012b, B:336:0x012c] A[DONT_GENERATE, DONT_INLINE]
                  (r2v66 java.lang.Object) from 0x011c: CHECK_CAST (java.util.Map$Entry) (r2v66 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r31) {
                /*
                    Method dump skipped, instruction units count: 2352
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.w4f0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final byte b6 = 5;
        this.x = bkb.G(c().d, new Function1(this) { // from class: a.w4f0
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:114:0x0334  */
            /* JADX WARN: Code duplicated, block: B:339:0x0160 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:34:0x0130  */
            /* JADX WARN: Code duplicated, block: B:35:0x0138  */
            /* JADX WARN: Code duplicated, block: B:38:0x013c  */
            /* JADX WARN: Code duplicated, block: B:41:0x0154  */
            /* JADX WARN: Code duplicated, block: B:44:0x0162 A[LOOP:1: B:39:0x014e->B:44:0x0162, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:85:0x02ad  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v66 java.lang.Object, still in use, count: 2, list:
                  (r2v66 java.lang.Object) from 0x012c: PHI (r2 I:??) = (r2v59 java.lang.Object), (r2v66 java.lang.Object) binds: [B:31:0x012b, B:336:0x012c] A[DONT_GENERATE, DONT_INLINE]
                  (r2v66 java.lang.Object) from 0x011c: CHECK_CAST (java.util.Map$Entry) (r2v66 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r31) {
                /*
                    Method dump skipped, instruction units count: 2352
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.w4f0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final byte b7 = 6;
        this.y = bkb.G(c().d, new Function1(this) { // from class: a.w4f0
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:114:0x0334  */
            /* JADX WARN: Code duplicated, block: B:339:0x0160 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:34:0x0130  */
            /* JADX WARN: Code duplicated, block: B:35:0x0138  */
            /* JADX WARN: Code duplicated, block: B:38:0x013c  */
            /* JADX WARN: Code duplicated, block: B:41:0x0154  */
            /* JADX WARN: Code duplicated, block: B:44:0x0162 A[LOOP:1: B:39:0x014e->B:44:0x0162, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:85:0x02ad  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v66 java.lang.Object, still in use, count: 2, list:
                  (r2v66 java.lang.Object) from 0x012c: PHI (r2 I:??) = (r2v59 java.lang.Object), (r2v66 java.lang.Object) binds: [B:31:0x012b, B:336:0x012c] A[DONT_GENERATE, DONT_INLINE]
                  (r2v66 java.lang.Object) from 0x011c: CHECK_CAST (java.util.Map$Entry) (r2v66 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r31) {
                /*
                    Method dump skipped, instruction units count: 2352
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.w4f0.invoke(java.lang.Object):java.lang.Object");
            }
        });
    }

    public y11(q11 q11Var, ctf0 ctf0Var) {
        final byte b = 0;
        ctf0Var.getClass();
        this.z = q11Var;
        this.b = ctf0Var;
        n0o0 n0o0VarH = bkb.H(Integer.valueOf(q11Var.p));
        n0o0 n0o0VarH2 = bkb.H(Boolean.valueOf(q11Var.m));
        this.c = n0o0VarH2;
        this.d = bkb.H(q11Var.s);
        n0o0 n0o0VarH3 = bkb.H(q11Var.j);
        this.e = n0o0VarH3;
        this.f = bkb.H(q11Var.y);
        n0o0 n0o0VarH4 = bkb.H(q11Var.f);
        this.g = n0o0VarH4;
        this.h = bkb.H(q11Var.h);
        this.i = bkb.H(q11Var.i);
        n0o0 n0o0VarH5 = bkb.H(q11Var.g);
        this.j = n0o0VarH5;
        n0o0 n0o0VarH6 = bkb.H(q11Var.b);
        this.k = n0o0VarH6;
        this.l = bkb.H(Boolean.valueOf(q11Var.n));
        bkb.H(Boolean.valueOf(q11Var.l));
        this.m = bkb.H(Boolean.valueOf(q11Var.q));
        n0o0 n0o0VarH7 = bkb.H(q11Var.o);
        this.n = n0o0VarH7;
        this.o = bkb.G(((fee) n0o0VarH.getValue()).d, new eo0((byte) 11));
        final byte b2 = 2;
        this.p = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.x11
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
            /* JADX WARN: Code duplicated, block: B:103:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:106:0x02c9  */
            /* JADX WARN: Code duplicated, block: B:107:0x02db A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:108:0x02dd  */
            /* JADX WARN: Code duplicated, block: B:110:0x02e3  */
            /* JADX WARN: Code duplicated, block: B:112:0x02f3  */
            /* JADX WARN: Code duplicated, block: B:117:0x0306 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:118:0x0308  */
            /* JADX WARN: Code duplicated, block: B:121:0x031a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:122:0x031c  */
            /* JADX WARN: Code duplicated, block: B:123:0x0327  */
            /* JADX WARN: Code duplicated, block: B:135:0x035a  */
            /* JADX WARN: Code duplicated, block: B:147:0x038e  */
            /* JADX WARN: Code duplicated, block: B:153:0x03bb  */
            /* JADX WARN: Code duplicated, block: B:158:0x03c3  */
            /* JADX WARN: Code duplicated, block: B:161:0x03e7  */
            /* JADX WARN: Code duplicated, block: B:163:0x03ea  */
            /* JADX WARN: Code duplicated, block: B:165:0x03ed  */
            /* JADX WARN: Code duplicated, block: B:167:0x03f2  */
            /* JADX WARN: Code duplicated, block: B:168:0x03f5  */
            /* JADX WARN: Code duplicated, block: B:169:0x03f8  */
            /* JADX WARN: Code duplicated, block: B:172:0x0419  */
            /* JADX WARN: Code duplicated, block: B:174:0x041c  */
            /* JADX WARN: Code duplicated, block: B:176:0x041f  */
            /* JADX WARN: Code duplicated, block: B:178:0x0434  */
            /* JADX WARN: Code duplicated, block: B:180:0x043a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:181:0x043c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:182:0x043e  */
            /* JADX WARN: Code duplicated, block: B:184:0x0443  */
            /* JADX WARN: Code duplicated, block: B:185:0x0446  */
            /* JADX WARN: Code duplicated, block: B:186:0x0449  */
            /* JADX WARN: Code duplicated, block: B:189:0x0459  */
            /* JADX WARN: Code duplicated, block: B:191:0x045f  */
            /* JADX WARN: Code duplicated, block: B:193:0x0462  */
            /* JADX WARN: Code duplicated, block: B:195:0x0465  */
            /* JADX WARN: Code duplicated, block: B:197:0x046a  */
            /* JADX WARN: Code duplicated, block: B:198:0x046d  */
            /* JADX WARN: Code duplicated, block: B:199:0x0470  */
            /* JADX WARN: Code duplicated, block: B:201:0x047b  */
            /* JADX WARN: Code duplicated, block: B:203:0x0487  */
            /* JADX WARN: Code duplicated, block: B:205:0x048f  */
            /* JADX WARN: Code duplicated, block: B:207:0x049f  */
            /* JADX WARN: Code duplicated, block: B:209:0x04c6  */
            /* JADX WARN: Code duplicated, block: B:211:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:213:0x04d7  */
            /* JADX WARN: Code duplicated, block: B:215:0x04da  */
            /* JADX WARN: Code duplicated, block: B:217:0x04df  */
            /* JADX WARN: Code duplicated, block: B:218:0x04e2  */
            /* JADX WARN: Code duplicated, block: B:219:0x04e5  */
            /* JADX WARN: Code duplicated, block: B:223:0x04fd  */
            /* JADX WARN: Code duplicated, block: B:225:0x0500  */
            /* JADX WARN: Code duplicated, block: B:227:0x0503  */
            /* JADX WARN: Code duplicated, block: B:229:0x0506  */
            /* JADX WARN: Code duplicated, block: B:231:0x0509  */
            /* JADX WARN: Code duplicated, block: B:234:0x0513  */
            /* JADX WARN: Code duplicated, block: B:235:0x0516  */
            /* JADX WARN: Code duplicated, block: B:236:0x0519  */
            /* JADX WARN: Code duplicated, block: B:237:0x051c  */
            /* JADX WARN: Code duplicated, block: B:240:0x0527  */
            /* JADX WARN: Code duplicated, block: B:245:0x0530  */
            /* JADX WARN: Code duplicated, block: B:246:0x0533  */
            /* JADX WARN: Code duplicated, block: B:248:0x053d  */
            /* JADX WARN: Code duplicated, block: B:250:0x0542  */
            /* JADX WARN: Code duplicated, block: B:253:0x054b  */
            /* JADX WARN: Code duplicated, block: B:265:0x0570  */
            /* JADX WARN: Code duplicated, block: B:266:0x057f  */
            /* JADX WARN: Code duplicated, block: B:468:0x0b96  */
            /* JADX WARN: Code duplicated, block: B:469:0x0bb1  */
            /* JADX WARN: Code duplicated, block: B:471:0x0bbf  */
            /* JADX WARN: Code duplicated, block: B:472:0x0bd0  */
            /* JADX WARN: Code duplicated, block: B:484:0x0be9  */
            /* JADX WARN: Code duplicated, block: B:485:0x0bfb  */
            /* JADX WARN: Code duplicated, block: B:487:0x0bff  */
            /* JADX WARN: Code duplicated, block: B:488:0x0c11  */
            /* JADX WARN: Code duplicated, block: B:491:0x0c46  */
            /* JADX WARN: Code duplicated, block: B:493:0x0c4b  */
            /* JADX WARN: Code duplicated, block: B:495:0x0c4e  */
            /* JADX WARN: Code duplicated, block: B:497:0x0c51  */
            /* JADX WARN: Code duplicated, block: B:499:0x0c54  */
            /* JADX WARN: Code duplicated, block: B:502:0x0c5d  */
            /* JADX WARN: Code duplicated, block: B:503:0x0c61  */
            /* JADX WARN: Code duplicated, block: B:504:0x0c64  */
            /* JADX WARN: Code duplicated, block: B:505:0x0c67  */
            /* JADX WARN: Code duplicated, block: B:508:0x0c7b  */
            /* JADX WARN: Code duplicated, block: B:509:0x0c84  */
            /* JADX WARN: Code duplicated, block: B:511:0x0c8f  */
            /* JADX WARN: Code duplicated, block: B:513:0x0c95  */
            /* JADX WARN: Code duplicated, block: B:514:0x0c96 A[PHI: r15
  0x0c96: PHI (r15v12 int) = (r15v11 int), (r15v17 int) binds: [B:510:0x0c8d, B:513:0x0c95] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:515:0x0c99  */
            /* JADX WARN: Code duplicated, block: B:520:0x0cae  */
            /* JADX WARN: Code duplicated, block: B:525:0x0ce6  */
            /* JADX WARN: Code duplicated, block: B:527:0x0cf9  */
            /* JADX WARN: Code duplicated, block: B:530:0x0d0b  */
            /* JADX WARN: Code duplicated, block: B:531:0x0d0e  */
            /* JADX WARN: Code duplicated, block: B:534:0x0d1c  */
            /* JADX WARN: Code duplicated, block: B:535:0x0d1f  */
            /* JADX WARN: Code duplicated, block: B:537:0x0d2f  */
            /* JADX WARN: Code duplicated, block: B:538:0x0d31  */
            /* JADX WARN: Code duplicated, block: B:540:0x0d37  */
            /* JADX WARN: Code duplicated, block: B:541:0x0d39  */
            /* JADX WARN: Code duplicated, block: B:544:0x0d4e  */
            /* JADX WARN: Code duplicated, block: B:545:0x0d50  */
            /* JADX WARN: Code duplicated, block: B:547:0x0d53  */
            /* JADX WARN: Code duplicated, block: B:549:0x0d57  */
            /* JADX WARN: Code duplicated, block: B:552:0x0d79  */
            /* JADX WARN: Code duplicated, block: B:554:0x0d7e  */
            /* JADX WARN: Code duplicated, block: B:564:0x050e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:579:0x0c57 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y11 y11Var;
                boolean z;
                int i;
                boolean z2;
                String strL;
                String strL2;
                String strA;
                String strA2;
                lsm0 lsm0Var;
                boolean z3;
                int i2;
                StringBuilder sb;
                int iOrdinal;
                int i3;
                String str;
                String str2;
                String strL3;
                int i4;
                int i5;
                char c;
                String strA3;
                lak0 lak0Var;
                i4 i4VarG0;
                String strA4;
                String strValueOf;
                String strM;
                boolean z4;
                boolean z5;
                m7m0 m7m0Var;
                int i6;
                int iA;
                ijl ijlVar;
                String str3;
                String strC;
                boolean z6;
                ot0 ot0Var;
                boolean z7;
                Iterator it;
                String str4;
                boolean z8;
                String strA5;
                pt0 pt0Var;
                n0x n0xVar;
                pt0 pt0Var2;
                sso0 uqo0Var;
                nur murVar;
                ww90 ww90Var;
                int i7;
                String str5;
                String str6;
                int i8;
                char c2;
                int i9;
                String strA6;
                String str7;
                int i10;
                ww90 ww90Var2;
                String strA7;
                String strA8;
                a4x a4xVarO0;
                a4x a4xVarO1;
                boolean z9;
                boolean z10;
                int iOrdinal2;
                m7m0 m7m0Var2;
                nw80 nw80Var;
                long j;
                List listJ;
                int iOrdinal3;
                pf8 pf8Var;
                int iOrdinal4;
                m7m0 m7m0Var3;
                pf8 pf8Var2;
                int iOrdinal5;
                m7m0 m7m0Var4;
                int iOrdinal6;
                qp9 qp9Var;
                az5 az5Var;
                int i11;
                int i12;
                int iOrdinal7;
                String strA9;
                String str8;
                vf8 vf8Var;
                pf8 pf8Var3;
                qp9 qp9Var2;
                vf8 vf8Var2;
                int iOrdinal8;
                m7m0 m7m0Var5;
                vf8 vf8Var3;
                int iOrdinal9;
                m7m0 m7m0Var6;
                List list;
                List list2;
                byte b3 = b2;
                String str9 = Separators.SP;
                String str10 = "static/img/android/casino/alt_design/aggregator_gift_card/";
                String str11 = "Background_Picture";
                String str12 = "Background_Illustration";
                String str13 = "Ticket_Secondary";
                String str14 = "";
                y11 y11Var2 = this.b;
                switch (b3) {
                    case 0:
                        y11 y11Var3 = y11Var2;
                        String str15 = "static/img/android/casino/alt_design/aggregator_gift_card/";
                        q11 q11Var2 = (q11) y11Var3.z;
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        m7v m7vVar = (m7v) feeVar.c();
                        if (m7vVar instanceof k7v) {
                            ArrayList arrayList = ((k7v) m7vVar).f17842a;
                            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                n65 n65Var = (n65) it2.next();
                                c01 c01Var = q11Var2.t;
                                ctf0 ctf0Var2 = y11Var3.b;
                                n65Var.getClass();
                                int i13 = n65Var.c;
                                ctf0Var2.getClass();
                                dqs dqsVar = n65Var.e;
                                String str16 = dqsVar.d;
                                long j2 = n65Var.d.f44639a;
                                int i14 = n65Var.b;
                                Iterator it3 = it2;
                                if (i13 == i14) {
                                    y11Var = y11Var3;
                                    z = n65Var.l == na90.PAYMENT_AFTER_DEPOSIT;
                                    Date date = new Date(j2);
                                    if (z) {
                                        String str17 = n65Var.k;
                                        pn40 pn40Var = pn40.f27267a;
                                        i = 2;
                                        z2 = true;
                                        strL = kng0.l(str17, Separators.SP, pn40.j(n65Var.j, 2, true));
                                    } else {
                                        i = 2;
                                        z2 = true;
                                        strL = null;
                                    }
                                    if (z != 0) {
                                        String str18 = n65Var.i;
                                        pn40 pn40Var2 = pn40.f27267a;
                                        strL2 = kng0.l(str18, Separators.SP, pn40.j(n65Var.h, i, z2));
                                    } else {
                                        strL2 = null;
                                    }
                                    boolean z11 = (strL != null || strL.length() == 0) && (strL2 == null || strL2.length() == 0);
                                    if (z != 0) {
                                        strA = ctf0Var2.b.a(R.string.win_sum_title, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        strA = null;
                                    }
                                    if (z != 0) {
                                        strA2 = ctf0Var2.b.a(R.string.deposit_sum_title, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        strA2 = null;
                                    }
                                    lsm0Var = ctf0Var2.b;
                                    String strA10 = lsm0Var.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
                                    q11 q11Var3 = q11Var2;
                                    z3 = z11;
                                    i2 = (int) n65Var.f22979a;
                                    hnl hnlVarN = nkb.N(c01Var);
                                    String strA11 = lsm0Var.a(R.string.free_spins_title, Arrays.copyOf(new Object[0], 0));
                                    sb = new StringBuilder(ujn.h);
                                    iOrdinal = c01Var.ordinal();
                                    if (iOrdinal != 0) {
                                        i3 = i2;
                                        if (iOrdinal != 1) {
                                            str = "Background_Illustration";
                                        } else if (iOrdinal != 2) {
                                            str = "";
                                        } else if (iOrdinal != 3) {
                                            str = "Ticket_Primary";
                                        } else if (iOrdinal == 4) {
                                            str = "Ticket_Secondary";
                                        } else {
                                            t9f.b();
                                        }
                                    } else {
                                        i3 = i2;
                                        str = "Background_Picture";
                                    }
                                    str2 = str15;
                                    strL3 = kng0.l(str2, str, "_Spin.webp");
                                    if (strL3.length() == 0) {
                                        i4 = 0;
                                        sb.setLength(0);
                                        str15 = str2;
                                    } else {
                                        str15 = str2;
                                        i4 = 0;
                                        if (StringsKt.O(strL3, ujn.h, false)) {
                                            sb.setLength(i4);
                                            sb.append(strL3);
                                        } else if (kotlin.text.c.x(strL3, "https://", false)) {
                                            i4 = 0;
                                            sb.setLength(i4);
                                            sb.append(strL3);
                                        } else {
                                            if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                i5 = 1;
                                                c = '/';
                                            } else {
                                                sb.append('/');
                                                c = '/';
                                                i5 = 1;
                                            }
                                            char[] cArr = new char[i5];
                                            i4 = 0;
                                            cArr[0] = c;
                                            sb.append(StringsKt.y0(strL3, cArr));
                                        }
                                    }
                                    String string = sb.toString();
                                    String str19 = strA10 + Separators.SP + i14;
                                    String strA12 = lsm0Var.a(R.string.for_games_title, Arrays.copyOf(new Object[i4], i4));
                                    if (z != 0) {
                                        strA3 = lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[i4], i4));
                                    } else {
                                        strA3 = lsm0Var.a(R.string.play_button, Arrays.copyOf(new Object[i4], i4));
                                    }
                                    String str20 = strA3;
                                    lak0Var = lak0.c;
                                    if (z != 0) {
                                        i4VarG0 = lak0Var;
                                    } else {
                                        i4VarG0 = dyb.g0(str16);
                                    }
                                    if (z != 0) {
                                        strA4 = "";
                                    } else {
                                        strA4 = lsm0Var.a(R.string.spins_title, Arrays.copyOf(new Object[0], 0));
                                    }
                                    if (z != 0) {
                                        strValueOf = null;
                                    } else {
                                        strValueOf = String.valueOf(i13);
                                    }
                                    if (z) {
                                        strM = null;
                                    } else {
                                        strM = twn.m(i14, " / ");
                                    }
                                    ovl ovlVar = new ovl(strA4, strValueOf, strM);
                                    q7n q7nVarR = vbw0.R(ctf0Var2, date, Long.valueOf(j2));
                                    if (strA != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (strA2 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    uzh uzhVar = new uzh(hnlVarN, strA11, "", string, str19, "", strA12, strA, strA2, lak0Var, i4VarG0, false, strL, strL2, "", str20, 12, ovlVar, q7nVarR, new tzh(true, false, z4, z5));
                                    hnl hnlVarN2 = nkb.N(c01Var);
                                    nw80 nw80Var2 = nw80.b;
                                    if (z3) {
                                        m7m0Var = m7m0.g;
                                    } else {
                                        m7m0Var = m7m0.h;
                                    }
                                    arrayList2.add(new r11(uzhVar, hnlVarN2, null, null, null, new vf8(dqsVar.c, n65Var.f22979a, nw80Var2, m7m0Var, str16), i3));
                                    it2 = it3;
                                    q11Var2 = q11Var3;
                                    y11Var3 = y11Var;
                                } else {
                                    y11Var = y11Var3;
                                }
                                Date date2 = new Date(j2);
                                if (z) {
                                    String str110 = n65Var.k;
                                    pn40 pn40Var3 = pn40.f27267a;
                                    i = 2;
                                    z2 = true;
                                    strL = kng0.l(str110, Separators.SP, pn40.j(n65Var.j, 2, true));
                                } else {
                                    i = 2;
                                    z2 = true;
                                    strL = null;
                                }
                                if (z != 0) {
                                    String str111 = n65Var.i;
                                    pn40 pn40Var4 = pn40.f27267a;
                                    strL2 = kng0.l(str111, Separators.SP, pn40.j(n65Var.h, i, z2));
                                } else {
                                    strL2 = null;
                                }
                                if (strL != null) {
                                }
                                if (z != 0) {
                                    strA = ctf0Var2.b.a(R.string.win_sum_title, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA = null;
                                }
                                if (z != 0) {
                                    strA2 = ctf0Var2.b.a(R.string.deposit_sum_title, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA2 = null;
                                }
                                lsm0Var = ctf0Var2.b;
                                String strA13 = lsm0Var.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
                                q11 q11Var4 = q11Var2;
                                z3 = z11;
                                i2 = (int) n65Var.f22979a;
                                hnl hnlVarN3 = nkb.N(c01Var);
                                String strA14 = lsm0Var.a(R.string.free_spins_title, Arrays.copyOf(new Object[0], 0));
                                sb = new StringBuilder(ujn.h);
                                iOrdinal = c01Var.ordinal();
                                if (iOrdinal != 0) {
                                    i3 = i2;
                                    if (iOrdinal != 1) {
                                        str = "Background_Illustration";
                                    } else if (iOrdinal != 2) {
                                        str = "";
                                    } else if (iOrdinal != 3) {
                                        str = "Ticket_Primary";
                                    } else if (iOrdinal == 4) {
                                        str = "Ticket_Secondary";
                                    } else {
                                        t9f.b();
                                    }
                                } else {
                                    i3 = i2;
                                    str = "Background_Picture";
                                }
                                str2 = str15;
                                strL3 = kng0.l(str2, str, "_Spin.webp");
                                if (strL3.length() == 0) {
                                    i4 = 0;
                                    sb.setLength(0);
                                    str15 = str2;
                                } else {
                                    str15 = str2;
                                    i4 = 0;
                                    if (StringsKt.O(strL3, ujn.h, false)) {
                                        sb.setLength(i4);
                                        sb.append(strL3);
                                    } else if (kotlin.text.c.x(strL3, "https://", false)) {
                                        i4 = 0;
                                        sb.setLength(i4);
                                        sb.append(strL3);
                                    } else {
                                        if (sb.length() > 0) {
                                            i5 = 1;
                                            c = '/';
                                        } else {
                                            i5 = 1;
                                            c = '/';
                                        }
                                        char[] cArr2 = new char[i5];
                                        i4 = 0;
                                        cArr2[0] = c;
                                        sb.append(StringsKt.y0(strL3, cArr2));
                                    }
                                }
                                String string2 = sb.toString();
                                String str112 = strA13 + Separators.SP + i14;
                                String strA15 = lsm0Var.a(R.string.for_games_title, Arrays.copyOf(new Object[i4], i4));
                                if (z != 0) {
                                    strA3 = lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[i4], i4));
                                } else {
                                    strA3 = lsm0Var.a(R.string.play_button, Arrays.copyOf(new Object[i4], i4));
                                }
                                String str21 = strA3;
                                lak0Var = lak0.c;
                                if (z != 0) {
                                    i4VarG0 = lak0Var;
                                } else {
                                    i4VarG0 = dyb.g0(str16);
                                }
                                if (z != 0) {
                                    strA4 = "";
                                } else {
                                    strA4 = lsm0Var.a(R.string.spins_title, Arrays.copyOf(new Object[0], 0));
                                }
                                if (z != 0) {
                                    strValueOf = null;
                                } else {
                                    strValueOf = String.valueOf(i13);
                                }
                                if (z) {
                                    strM = null;
                                } else {
                                    strM = twn.m(i14, " / ");
                                }
                                ovl ovlVar2 = new ovl(strA4, strValueOf, strM);
                                q7n q7nVarR2 = vbw0.R(ctf0Var2, date2, Long.valueOf(j2));
                                if (strA != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (strA2 != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                uzh uzhVar2 = new uzh(hnlVarN3, strA14, "", string2, str112, "", strA15, strA, strA2, lak0Var, i4VarG0, false, strL, strL2, "", str21, 12, ovlVar2, q7nVarR2, new tzh(true, false, z4, z5));
                                hnl hnlVarN4 = nkb.N(c01Var);
                                nw80 nw80Var3 = nw80.b;
                                if (z3) {
                                    m7m0Var = m7m0.g;
                                } else {
                                    m7m0Var = m7m0.h;
                                }
                                arrayList2.add(new r11(uzhVar2, hnlVarN4, null, null, null, new vf8(dqsVar.c, n65Var.f22979a, nw80Var3, m7m0Var, str16), i3));
                                it2 = it3;
                                q11Var2 = q11Var4;
                                y11Var3 = y11Var;
                            }
                            return dyb.r0(arrayList2);
                        }
                        if (Intrinsics.d(m7vVar, l7v.f19578a)) {
                            return i4w0.N(q11Var2.t);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        g7v g7vVar = (g7v) feeVar2.c();
                        if (!(g7vVar instanceof e7v)) {
                            if (Intrinsics.d(g7vVar, f7v.f9076a)) {
                                zcl zclVar = qmk.f28987a;
                                return new h7v(new gyl(null, s5x0.t(0.0f, 8.0f, 1), 1));
                            }
                            t9f.b();
                            return null;
                        }
                        if (((a4x) ((fee) y11Var2.x.getValue()).b()).size() + ((a4x) ((fee) y11Var2.w.getValue()).b()).size() <= 0) {
                            return i7v.f14312a;
                        }
                        a4x<y6v> a4xVar = ((e7v) g7vVar).f7345a;
                        ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar, 10));
                        for (y6v y6vVar : a4xVar) {
                            ctf0 ctf0Var3 = y11Var2.b;
                            d7v d7vVar = (d7v) ((fee) y11Var2.k.getValue()).c();
                            y6vVar.getClass();
                            d7v d7vVar2 = y6vVar.f42119a;
                            ctf0Var3.getClass();
                            d7vVar.getClass();
                            long jOrdinal = d7vVar2.ordinal();
                            int iOrdinal10 = d7vVar2.ordinal();
                            if (iOrdinal10 == 0) {
                                i6 = R.string.all;
                            } else if (iOrdinal10 == 1) {
                                i6 = R.string.bonuses_title;
                            } else {
                                if (iOrdinal10 != 2) {
                                    t9f.b();
                                    return null;
                                }
                                i6 = R.string.free_spins_title;
                            }
                            xxl xxlVar = new xxl(ctf0Var3.b.a(i6, Arrays.copyOf(new Object[0], 0)));
                            uxl uxlVar = d7vVar2 == d7vVar ? uxl.b : uxl.f36445a;
                            int i15 = y6vVar.b;
                            arrayList3.add(new lxl(jOrdinal, (dyl) xxlVar, false, uxlVar, i15 != 0 ? new cwl(new rpe(i15)) : null, 76));
                        }
                        return new h7v(new fyl(dyb.r0(arrayList3), null, null, s5x0.t(0.0f, 0.0f, 3), null, 22));
                    case 2:
                        int iIntValue = ((Integer) obj).intValue();
                        boolean z12 = ((q11) y11Var2.z).v;
                        int iIntValue2 = ((Number) ((fee) y11Var2.t.getValue()).b()).intValue();
                        if (z12) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.j;
                            xuzVar.getClass();
                            iA = xuz.a(pb10Var, iIntValue);
                        } else {
                            xuz xuzVar2 = pb10.c;
                            pb10 pb10Var2 = pb10.i;
                            xuzVar2.getClass();
                            iA = xuz.a(pb10Var2, iIntValue);
                        }
                        return new mdm(iA, null, null, 0, 0, iIntValue2, 0, 0, 0L, 0L, 990);
                    case 3:
                        ((fee) obj).getClass();
                        fee feeVar3 = (fee) y11Var2.c.getValue();
                        ctf0 ctf0Var4 = y11Var2.b;
                        if (!((Boolean) feeVar3.c()).booleanValue()) {
                            return new zc(ctf0Var4.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) y11Var2.d.getValue()).c();
                        kg kgVar = ((q11) y11Var2.z).u;
                        kgVar.getClass();
                        int iOrdinal11 = kgVar.ordinal();
                        if (iOrdinal11 == 0) {
                            ijlVar = ijl.f14880a;
                        } else if (iOrdinal11 == 1) {
                            ijlVar = ijl.b;
                        } else if (iOrdinal11 == 2) {
                            ijlVar = ijl.c;
                        } else if (iOrdinal11 == 3) {
                            ijlVar = ijl.d;
                        } else {
                            if (iOrdinal11 != 4) {
                                t9f.b();
                                return null;
                            }
                            ijlVar = ijl.e;
                        }
                        if (ql5Var != null) {
                            String strA16 = ql5Var.j;
                            if (ijlVar == ijl.b) {
                                strA16 = ctf0Var4.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA16.length() <= 0) {
                                strA16 = ql5Var.k;
                            }
                            str3 = strA16;
                        } else {
                            str3 = null;
                        }
                        String str22 = str3 == null ? "" : str3;
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var5 = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str23 = strC == null ? "" : strC;
                        String str24 = ql5Var != null ? ql5Var.f : null;
                        String str25 = str24 == null ? "" : str24;
                        String strA17 = ctf0Var4.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        return new xc(ijlVar, new jjl(str23, str25, strA17, str22, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())));
                    case 4:
                        n0o0 n0o0Var = y11Var2.w;
                        n0o0 n0o0Var2 = y11Var2.x;
                        d7v d7vVar3 = (d7v) obj;
                        d7vVar3.getClass();
                        int iOrdinal12 = d7vVar3.ordinal();
                        if (iOrdinal12 == 0) {
                            return CollectionsKt.q0((Collection) ((fee) n0o0Var.getValue()).b(), (Iterable) ((fee) n0o0Var2.getValue()).b());
                        }
                        if (iOrdinal12 == 1) {
                            return (List) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal12 == 2) {
                            return (List) ((fee) n0o0Var2.getValue()).b();
                        }
                        t9f.b();
                        return null;
                    case 5:
                        ((Unit) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(((q11) y11Var2.z).r, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    case 6:
                        y11 y11Var4 = y11Var2;
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        Iterable iterable = (Iterable) feeVar4.c();
                        ArrayList arrayList4 = new ArrayList(r3d.q(iterable, 10));
                        Iterator it4 = iterable.iterator();
                        while (it4.hasNext()) {
                            j8b j8bVar = (j8b) it4.next();
                            y11 y11Var5 = y11Var4;
                            ctf0 ctf0Var5 = y11Var5.b;
                            boolean zBooleanValue = ((Boolean) ((fee) y11Var5.c.getValue()).c()).booleanValue();
                            q11 q11Var5 = (q11) y11Var5.z;
                            boolean z13 = q11Var5.v;
                            ot0 ot0Var2 = q11Var5.x;
                            Set set = (Set) ((fee) y11Var5.f.getValue()).c();
                            j8bVar.getClass();
                            ctf0Var5.getClass();
                            set.getClass();
                            List<mlr> list3 = j8bVar.c;
                            ArrayList arrayList5 = new ArrayList(r3d.q(list3, 10));
                            for (mlr mlrVar : list3) {
                                Set set2 = set;
                                if ((set2 instanceof Collection) && set2.isEmpty()) {
                                    z6 = zBooleanValue;
                                    ot0Var = ot0Var2;
                                    z7 = false;
                                } else {
                                    Iterator it5 = set2.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            z6 = zBooleanValue;
                                            ot0Var = ot0Var2;
                                            if (((Number) it5.next()).longValue() == mlrVar.f22006a) {
                                                z7 = true;
                                            } else {
                                                zBooleanValue = z6;
                                                ot0Var2 = ot0Var;
                                            }
                                        } else {
                                            z6 = zBooleanValue;
                                            ot0Var = ot0Var2;
                                            z7 = false;
                                        }
                                    }
                                }
                                pt0 pt0VarG0 = x4d0.g0(ot0Var);
                                Integer numValueOf = Integer.valueOf((int) j8bVar.f16074a);
                                mlrVar.getClass();
                                boolean z14 = mlrVar.k;
                                int i16 = z13 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                boolean z15 = mlrVar.j;
                                if (z14) {
                                    it = it4;
                                    str4 = str14;
                                    z8 = z13;
                                    strA5 = ctf0Var5.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    it = it4;
                                    str4 = str14;
                                    z8 = z13;
                                    strA5 = z15 ? ctf0Var5.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : str4;
                                }
                                Set set3 = set;
                                long j3 = mlrVar.f22006a;
                                String str26 = mlrVar.f;
                                String str27 = mlrVar.e;
                                mtr mtrVar = new mtr(z6 ? z7 ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, z7);
                                n0x n0xVar2 = new n0x(mlrVar.g);
                                m0x m0xVar = new m0x(i16, null, 6);
                                if (strA5.length() == 0) {
                                    murVar = lur.f20686a;
                                    n0xVar = n0xVar2;
                                } else {
                                    pt0 pt0Var3 = pt0.f27539a;
                                    if ((pt0VarG0 == pt0Var3 && z14) || (pt0VarG0 == (pt0Var = pt0.c) && z14)) {
                                        n0xVar = n0xVar2;
                                    } else {
                                        n0xVar = n0xVar2;
                                        pt0 pt0Var4 = pt0.d;
                                        if (pt0VarG0 != pt0Var4 || !z14) {
                                            if ((pt0VarG0 == pt0Var3 && z15) || ((pt0VarG0 == pt0Var && z15) || (pt0VarG0 == pt0Var4 && z15))) {
                                                d4d d4dVar = d4d.PRIMARY;
                                                uqo0Var = new eqo0();
                                            } else {
                                                pt0 pt0Var5 = pt0.b;
                                                uqo0Var = ((pt0VarG0 == pt0Var5 && z14) || (pt0VarG0 == (pt0Var2 = pt0.e) && z14)) ? kro0.f18776a : ((pt0VarG0 == pt0Var5 && z15) || (pt0VarG0 == pt0Var2 && z15)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                            }
                                        }
                                        murVar = new mur(strA5, uqo0Var);
                                    }
                                    d4d d4dVar2 = d4d.PRIMARY;
                                    uqo0Var = new lro0();
                                    murVar = new mur(strA5, uqo0Var);
                                }
                                arrayList5.add(new st0(j3, str26, str27, mtrVar, n0xVar, m0xVar, numValueOf, murVar));
                                zBooleanValue = z6;
                                ot0Var2 = ot0Var;
                                it4 = it;
                                z13 = z8;
                                set = set3;
                                str14 = str4;
                            }
                            arrayList4.add(new h4r0(j8bVar.f16074a, j8bVar.d, j8bVar.b, new hjm(j8bVar.b, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var5.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166), new zll(x4d0.g0(ot0Var2), new wll(o0s.f24443a), arrayList5)));
                            y11Var4 = y11Var5;
                            it4 = it4;
                            str14 = str14;
                        }
                        return dyb.r0(arrayList4);
                    default:
                        q11 q11Var6 = (q11) y11Var2.z;
                        fee feeVar5 = (fee) obj;
                        feeVar5.getClass();
                        b7v b7vVar = (b7v) feeVar5.c();
                        if (b7vVar instanceof z6v) {
                            ArrayList arrayList6 = ((z6v) b7vVar).f43888a;
                            ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                            Iterator it6 = arrayList6.iterator();
                            while (it6.hasNext()) {
                                e65 e65Var = (e65) it6.next();
                                c01 c01Var2 = q11Var6.t;
                                ctf0 ctf0Var6 = y11Var2.b;
                                e65Var.getClass();
                                ArrayList arrayList8 = arrayList7;
                                double d2 = e65Var.b;
                                ctf0Var6.getClass();
                                List list4 = e65Var.k;
                                String str28 = str11;
                                String str29 = str12;
                                long j4 = e65Var.g.f44639a;
                                List list5 = e65Var.o;
                                List list6 = e65Var.n;
                                int i17 = e65Var.f7264a;
                                Iterator it7 = it6;
                                gom0 gom0Var = e65Var.i;
                                String str30 = str13;
                                List list7 = e65Var.l;
                                y11 y11Var6 = y11Var2;
                                if (list4.size() == 1) {
                                    ww90Var = ww90.f39878a;
                                } else if (list4.size() > 1) {
                                    ww90Var = ww90.b;
                                } else if (list6.isEmpty() || !list7.isEmpty()) {
                                    ww90Var = (list7.isEmpty() && list5.isEmpty()) ? ww90.c : ww90.d;
                                } else {
                                    ww90Var = ww90.b;
                                }
                                ArrayList arrayList9 = new ArrayList();
                                q11 q11Var7 = q11Var6;
                                ww90 ww90Var3 = ww90Var;
                                String str31 = str9;
                                lsm0 lsm0Var2 = ctf0Var6.b;
                                String strA18 = lsm0Var2.a(R.string.for_games_title, Arrays.copyOf(new Object[0], 0));
                                m7m0 m7m0Var7 = m7m0.f21327a;
                                if (!list4.isEmpty()) {
                                    arrayList9.add(new pf8(strA18, list4, nw80.t, m7m0Var7, new qp9(str14, i17, i17)));
                                }
                                String strA19 = lsm0Var2.a(R.string.for_unavailable_games_title, Arrays.copyOf(new Object[0], 0));
                                if (!list6.isEmpty()) {
                                    arrayList9.add(new pf8(strA19, list6, nw80.t, m7m0Var7, new qp9(str14, i17, i17)));
                                }
                                pf8 pf8Var4 = (pf8) CollectionsKt.firstOrNull(arrayList9);
                                ArrayList arrayList10 = new ArrayList();
                                String strA20 = lsm0Var2.a(R.string.for_providers_title, Arrays.copyOf(new Object[0], 0));
                                m7m0 m7m0Var8 = m7m0.b;
                                if (!list7.isEmpty()) {
                                    arrayList10.add(new pf8(strA20, list7, nw80.t, m7m0Var8, new qp9(str14, i17, i17)));
                                }
                                String strA21 = lsm0Var2.a(R.string.for_unavailable_providers_title, Arrays.copyOf(new Object[0], 0));
                                if (!list5.isEmpty()) {
                                    arrayList10.add(new pf8(strA21, list5, nw80.t, m7m0Var8, new qp9(str14, i17, i17)));
                                }
                                pf8 pf8Var5 = (pf8) CollectionsKt.firstOrNull(arrayList10);
                                double d3 = ((double) e65Var.e) * d2;
                                String str32 = str14;
                                DecimalFormat decimalFormat = new DecimalFormat("0.##", DecimalFormatSymbols.getInstance(Locale.US));
                                String str33 = decimalFormat.format(d3);
                                String str34 = decimalFormat.format(e65Var.d);
                                Date date3 = new Date(j4);
                                int i18 = e65Var.f7264a;
                                hnl hnlVarN5 = nkb.N(c01Var2);
                                String strA22 = lsm0Var2.a(R.string.bonus_amount_title, Arrays.copyOf(new Object[0], 0));
                                nnm0 nnm0Var = gom0Var.f11638a;
                                String strA23 = lsm0Var2.a(R.string.bonus_active, Arrays.copyOf(new Object[0], 0));
                                nnm0 nnm0Var2 = nnm0.ACTIVE;
                                if (nnm0Var != nnm0Var2) {
                                    strA23 = null;
                                }
                                String str35 = strA23 == null ? str32 : strA23;
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                int iOrdinal13 = c01Var2.ordinal();
                                if (iOrdinal13 != 0) {
                                    i7 = i18;
                                    if (iOrdinal13 == 1) {
                                        str5 = str29;
                                    } else if (iOrdinal13 == 2) {
                                        str5 = str32;
                                    } else if (iOrdinal13 == 3) {
                                        str5 = "Ticket_Primery";
                                    } else if (iOrdinal13 == 4) {
                                        str5 = str30;
                                    } else {
                                        t9f.b();
                                    }
                                } else {
                                    i7 = i18;
                                    str5 = str28;
                                }
                                String strL4 = kng0.l(str10, str5, "_Bonus.webp");
                                if (strL4.length() == 0) {
                                    sb2.setLength(0);
                                    str6 = str10;
                                } else {
                                    str6 = str10;
                                    int i19 = 0;
                                    if (StringsKt.O(strL4, ujn.h, false)) {
                                        sb2.setLength(i19);
                                        sb2.append(strL4);
                                    } else if (kotlin.text.c.x(strL4, "https://", false)) {
                                        i19 = 0;
                                        sb2.setLength(i19);
                                        sb2.append(strL4);
                                    } else {
                                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                            i8 = 1;
                                            c2 = '/';
                                        } else {
                                            sb2.append('/');
                                            c2 = '/';
                                            i8 = 1;
                                        }
                                        char[] cArr3 = new char[i8];
                                        cArr3[0] = c2;
                                        sb2.append(StringsKt.y0(strL4, cArr3));
                                    }
                                }
                                String string3 = sb2.toString();
                                String str36 = e65Var.c;
                                pn40 pn40Var6 = pn40.f27267a;
                                String strL5 = kng0.l(str36, str31, pn40.c(d2, p3u0.c));
                                String str37 = pf8Var5 != null ? pf8Var5.f26889a : null;
                                String str38 = str37 == null ? str32 : str37;
                                String str39 = pf8Var4 != null ? pf8Var4.f26889a : null;
                                String str40 = str39 == null ? str32 : str39;
                                int iOrdinal14 = nnm0Var.ordinal();
                                if (iOrdinal14 != 0) {
                                    if (iOrdinal14 != 5) {
                                        str7 = str32;
                                        i9 = 0;
                                    } else {
                                        i9 = 0;
                                        strA6 = lsm0Var2.a(R.string.resume, Arrays.copyOf(new Object[0], 0));
                                    }
                                    if (nnm0Var == nnm0Var2) {
                                        i10 = 1;
                                    } else {
                                        i10 = i9;
                                    }
                                    if (nnm0Var == nnm0.READY) {
                                        strA7 = lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[i9], i9));
                                        ww90Var2 = ww90Var3;
                                    } else {
                                        if (i10 != 0) {
                                            ww90Var2 = ww90Var3;
                                            if (ww90Var2 == ww90.f39878a) {
                                                strA8 = lsm0Var2.a(R.string.play_button, Arrays.copyOf(new Object[i9], i9));
                                            }
                                            strA7 = strA8;
                                        } else {
                                            ww90Var2 = ww90Var3;
                                        }
                                        if (i10 == 0 && ww90Var2 == ww90.b) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        } else if (i10 == 0 && ww90Var2 == ww90.d) {
                                            strA8 = lsm0Var2.a(R.string.all_providers, Arrays.copyOf(new Object[i9], i9));
                                        } else if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        } else {
                                            strA7 = str32;
                                        }
                                        strA7 = strA8;
                                    }
                                    if (pf8Var5 != null || (list2 = pf8Var5.b) == null) {
                                        a4xVarO0 = lak0.c;
                                    } else {
                                        ArrayList arrayList11 = new ArrayList(r3d.q(list2, 10));
                                        Iterator it8 = list2.iterator();
                                        while (it8.hasNext()) {
                                            arrayList11.add(((az5) it8.next()).b);
                                        }
                                        a4xVarO0 = dyb.o0(arrayList11);
                                        if (a4xVarO0 == null) {
                                            a4xVarO0 = lak0.c;
                                        }
                                    }
                                    a4x a4xVar2 = a4xVarO0;
                                    if (pf8Var4 != null || (list = pf8Var4.b) == null) {
                                        a4xVarO1 = lak0.c;
                                    } else {
                                        ArrayList arrayList12 = new ArrayList(r3d.q(list, 10));
                                        Iterator it9 = list.iterator();
                                        while (it9.hasNext()) {
                                            arrayList12.add(((az5) it9.next()).b);
                                        }
                                        a4xVarO1 = dyb.o0(arrayList12);
                                        if (a4xVarO1 == null) {
                                            a4xVarO1 = lak0.c;
                                        }
                                    }
                                    a4x a4xVar3 = a4xVarO1;
                                    ovl ovlVar3 = new ovl(lsm0Var2.a(R.string.roleplaying_title, Arrays.copyOf(new Object[0], 0)), str34, kng0.k("/ ", str33));
                                    q7n q7nVarR3 = vbw0.R(ctf0Var6, date3, Long.valueOf(j4));
                                    if (pf8Var5 == null || pf8Var4 != null) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (pf8Var5 != null || pf8Var4 == null) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    uzh uzhVar3 = new uzh(hnlVarN5, strA22, str35, string3, strL5, str38, str40, null, null, a4xVar2, a4xVar3, true, null, null, str7, strA7, 0, ovlVar3, q7nVarR3, new tzh(z9, z10, false, false));
                                    hnl hnlVarN6 = nkb.N(c01Var2);
                                    iOrdinal2 = nnm0Var.ordinal();
                                    if (iOrdinal2 != 0) {
                                        m7m0Var2 = m7m0.f;
                                    } else if (iOrdinal2 != 1) {
                                        m7m0Var2 = m7m0.c;
                                    } else if (iOrdinal2 != 5) {
                                        m7m0Var2 = m7m0.i;
                                    } else {
                                        m7m0Var2 = m7m0.e;
                                    }
                                    m7m0 m7m0Var9 = m7m0Var2;
                                    nw80Var = nw80.b;
                                    j = i17;
                                    vf8 vf8Var4 = new vf8(i17, j, nw80Var, m7m0Var9, "");
                                    listJ = q3d.j(pf8Var4, pf8Var5);
                                    iOrdinal3 = nnm0Var.ordinal();
                                    if (iOrdinal3 != 0) {
                                        if (iOrdinal3 != 1) {
                                            iOrdinal8 = nnm0Var.ordinal();
                                            if (iOrdinal8 != 0) {
                                                m7m0Var5 = m7m0.f;
                                            } else if (iOrdinal8 != 1) {
                                                m7m0Var5 = m7m0.c;
                                            } else if (iOrdinal8 != 5) {
                                                m7m0Var5 = m7m0.i;
                                            } else {
                                                m7m0Var5 = m7m0.e;
                                            }
                                            vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var5, "");
                                        } else if (iOrdinal3 != 5) {
                                            vf8Var = new vf8(0, j, nw80Var, m7m0.i, "");
                                            str14 = str32;
                                        } else {
                                            iOrdinal9 = nnm0Var.ordinal();
                                            if (iOrdinal9 != 0) {
                                                m7m0Var6 = m7m0.f;
                                            } else if (iOrdinal9 != 1) {
                                                m7m0Var6 = m7m0.c;
                                            } else if (iOrdinal9 != 5) {
                                                m7m0Var6 = m7m0.i;
                                            } else {
                                                m7m0Var6 = m7m0.e;
                                            }
                                            vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var6, "");
                                        }
                                        str14 = str32;
                                        vf8Var2 = vf8Var3;
                                        arrayList8.add(new r11(uzhVar3, hnlVarN6, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var4, vf8Var2, i7));
                                        arrayList7 = arrayList8;
                                        str9 = str31;
                                        str10 = str6;
                                        str11 = str28;
                                        str12 = str29;
                                        it6 = it7;
                                        str13 = str30;
                                        y11Var2 = y11Var6;
                                        q11Var6 = q11Var7;
                                    } else {
                                        pf8Var = (pf8) CollectionsKt.firstOrNull(listJ);
                                        if (pf8Var != null) {
                                            pf8Var3 = (pf8) CollectionsKt.firstOrNull(listJ);
                                            if (pf8Var3 != null) {
                                                qp9 qp9Var3 = pf8Var3.e;
                                                qp9Var2 = new qp9(qp9Var3.b, qp9Var3.f29104a, j);
                                                str14 = str32;
                                            } else {
                                                str14 = str32;
                                                qp9Var2 = new qp9(str14, 0, 0L);
                                            }
                                            qp9 qp9Var4 = qp9Var2;
                                            String str41 = pf8Var.f26889a;
                                            List list8 = pf8Var.b;
                                            nw80 nw80Var4 = pf8Var.c;
                                            m7m0 m7m0Var10 = pf8Var.d;
                                            str41.getClass();
                                            list8.getClass();
                                            pf8Var2 = new pf8(str41, list8, nw80Var4, m7m0Var10, qp9Var4);
                                        } else {
                                            str14 = str32;
                                            iun iunVar = iun.f15405a;
                                            nw80 nw80Var5 = nw80.t;
                                            iOrdinal4 = nnm0Var.ordinal();
                                            if (iOrdinal4 != 0) {
                                                m7m0Var3 = m7m0.f;
                                            } else if (iOrdinal4 != 1) {
                                                m7m0Var3 = m7m0.c;
                                            } else if (iOrdinal4 != 5) {
                                                m7m0Var3 = m7m0.i;
                                            } else {
                                                m7m0Var3 = m7m0.e;
                                            }
                                            pf8Var2 = new pf8("", iunVar, nw80Var5, m7m0Var3, new qp9(str14, 0, 0L));
                                        }
                                        iOrdinal5 = ww90Var2.ordinal();
                                        if (iOrdinal5 != 0) {
                                            m7m0Var4 = m7m0.g;
                                        } else if (iOrdinal5 != 1) {
                                            m7m0Var4 = m7m0.f21327a;
                                        } else if (iOrdinal5 != 2) {
                                            m7m0Var4 = m7m0.d;
                                        } else if (iOrdinal5 != 3) {
                                            m7m0Var4 = m7m0.b;
                                        } else if (iOrdinal5 == 4) {
                                            m7m0Var4 = m7m0.i;
                                        } else {
                                            t9f.b();
                                        }
                                        m7m0 m7m0Var11 = m7m0Var4;
                                        iOrdinal6 = ww90Var2.ordinal();
                                        qp9Var = pf8Var2.e;
                                        if (iOrdinal6 != 0) {
                                            az5Var = (az5) CollectionsKt.firstOrNull(pf8Var2.b);
                                            if (az5Var != null) {
                                                i11 = az5Var.f1701a;
                                            } else {
                                                i11 = qp9Var.f29104a;
                                            }
                                            i12 = i11;
                                        } else if (iOrdinal6 != 1 || iOrdinal6 == 3) {
                                            i12 = i17;
                                        } else {
                                            i12 = 0;
                                        }
                                        iOrdinal7 = ww90Var2.ordinal();
                                        if (iOrdinal7 == 0) {
                                            strA9 = qp9Var.b;
                                        } else if (iOrdinal7 != 1 || iOrdinal7 == 2) {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            if (iOrdinal7 == 3) {
                                                strA9 = lsm0Var2.a(R.string.all_providers, Arrays.copyOf(new Object[0], 0));
                                            } else if (iOrdinal7 == 4) {
                                                str8 = str14;
                                            } else {
                                                t9f.b();
                                            }
                                            vf8Var = new vf8(i12, j, nw80Var, m7m0Var11, str8);
                                        }
                                        str8 = strA9;
                                        vf8Var = new vf8(i12, j, nw80Var, m7m0Var11, str8);
                                    }
                                    vf8Var2 = vf8Var;
                                    arrayList8.add(new r11(uzhVar3, hnlVarN6, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var4, vf8Var2, i7));
                                    arrayList7 = arrayList8;
                                    str9 = str31;
                                    str10 = str6;
                                    str11 = str28;
                                    str12 = str29;
                                    it6 = it7;
                                    str13 = str30;
                                    y11Var2 = y11Var6;
                                    q11Var6 = q11Var7;
                                } else {
                                    i9 = 0;
                                    strA6 = lsm0Var2.a(R.string.suspend, Arrays.copyOf(new Object[0], 0));
                                }
                                str7 = strA6;
                                if (nnm0Var == nnm0Var2) {
                                    i10 = 1;
                                } else {
                                    i10 = i9;
                                }
                                if (nnm0Var == nnm0.READY) {
                                    strA7 = lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[i9], i9));
                                    ww90Var2 = ww90Var3;
                                } else {
                                    if (i10 != 0) {
                                        ww90Var2 = ww90Var3;
                                        if (ww90Var2 == ww90.f39878a) {
                                            strA8 = lsm0Var2.a(R.string.play_button, Arrays.copyOf(new Object[i9], i9));
                                        }
                                        strA7 = strA8;
                                    } else {
                                        ww90Var2 = ww90Var3;
                                    }
                                    if (i10 == 0) {
                                        if (i10 == 0) {
                                            if (i10 != 0) {
                                                strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                                strA7 = strA8;
                                            } else {
                                                strA7 = str32;
                                            }
                                        } else if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                            strA7 = strA8;
                                        } else {
                                            strA7 = str32;
                                        }
                                    } else if (i10 == 0) {
                                        if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                            strA7 = strA8;
                                        } else {
                                            strA7 = str32;
                                        }
                                    } else if (i10 != 0) {
                                        strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        strA7 = strA8;
                                    } else {
                                        strA7 = str32;
                                    }
                                }
                                if (pf8Var5 != null) {
                                    a4xVarO0 = lak0.c;
                                } else {
                                    a4xVarO0 = lak0.c;
                                }
                                a4x a4xVar4 = a4xVarO0;
                                if (pf8Var4 != null) {
                                    a4xVarO1 = lak0.c;
                                } else {
                                    a4xVarO1 = lak0.c;
                                }
                                a4x a4xVar5 = a4xVarO1;
                                ovl ovlVar4 = new ovl(lsm0Var2.a(R.string.roleplaying_title, Arrays.copyOf(new Object[0], 0)), str34, kng0.k("/ ", str33));
                                q7n q7nVarR4 = vbw0.R(ctf0Var6, date3, Long.valueOf(j4));
                                if (pf8Var5 == null) {
                                    z9 = true;
                                } else {
                                    z9 = true;
                                }
                                if (pf8Var5 != null) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                uzh uzhVar4 = new uzh(hnlVarN5, strA22, str35, string3, strL5, str38, str40, null, null, a4xVar4, a4xVar5, true, null, null, str7, strA7, 0, ovlVar4, q7nVarR4, new tzh(z9, z10, false, false));
                                hnl hnlVarN7 = nkb.N(c01Var2);
                                iOrdinal2 = nnm0Var.ordinal();
                                if (iOrdinal2 != 0) {
                                    m7m0Var2 = m7m0.f;
                                } else if (iOrdinal2 != 1) {
                                    m7m0Var2 = m7m0.c;
                                } else if (iOrdinal2 != 5) {
                                    m7m0Var2 = m7m0.i;
                                } else {
                                    m7m0Var2 = m7m0.e;
                                }
                                m7m0 m7m0Var12 = m7m0Var2;
                                nw80Var = nw80.b;
                                j = i17;
                                vf8 vf8Var5 = new vf8(i17, j, nw80Var, m7m0Var12, "");
                                listJ = q3d.j(pf8Var4, pf8Var5);
                                iOrdinal3 = nnm0Var.ordinal();
                                if (iOrdinal3 != 0) {
                                    if (iOrdinal3 != 1) {
                                        iOrdinal8 = nnm0Var.ordinal();
                                        if (iOrdinal8 != 0) {
                                            m7m0Var5 = m7m0.f;
                                        } else if (iOrdinal8 != 1) {
                                            m7m0Var5 = m7m0.c;
                                        } else if (iOrdinal8 != 5) {
                                            m7m0Var5 = m7m0.i;
                                        } else {
                                            m7m0Var5 = m7m0.e;
                                        }
                                        vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var5, "");
                                    } else if (iOrdinal3 != 5) {
                                        vf8Var = new vf8(0, j, nw80Var, m7m0.i, "");
                                        str14 = str32;
                                    } else {
                                        iOrdinal9 = nnm0Var.ordinal();
                                        if (iOrdinal9 != 0) {
                                            m7m0Var6 = m7m0.f;
                                        } else if (iOrdinal9 != 1) {
                                            m7m0Var6 = m7m0.c;
                                        } else if (iOrdinal9 != 5) {
                                            m7m0Var6 = m7m0.i;
                                        } else {
                                            m7m0Var6 = m7m0.e;
                                        }
                                        vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var6, "");
                                    }
                                    str14 = str32;
                                    vf8Var2 = vf8Var3;
                                    arrayList8.add(new r11(uzhVar4, hnlVarN7, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var5, vf8Var2, i7));
                                    arrayList7 = arrayList8;
                                    str9 = str31;
                                    str10 = str6;
                                    str11 = str28;
                                    str12 = str29;
                                    it6 = it7;
                                    str13 = str30;
                                    y11Var2 = y11Var6;
                                    q11Var6 = q11Var7;
                                } else {
                                    pf8Var = (pf8) CollectionsKt.firstOrNull(listJ);
                                    if (pf8Var != null) {
                                        pf8Var3 = (pf8) CollectionsKt.firstOrNull(listJ);
                                        if (pf8Var3 != null) {
                                            qp9 qp9Var5 = pf8Var3.e;
                                            qp9Var2 = new qp9(qp9Var5.b, qp9Var5.f29104a, j);
                                            str14 = str32;
                                        } else {
                                            str14 = str32;
                                            qp9Var2 = new qp9(str14, 0, 0L);
                                        }
                                        qp9 qp9Var6 = qp9Var2;
                                        String str42 = pf8Var.f26889a;
                                        List list9 = pf8Var.b;
                                        nw80 nw80Var6 = pf8Var.c;
                                        m7m0 m7m0Var13 = pf8Var.d;
                                        str42.getClass();
                                        list9.getClass();
                                        pf8Var2 = new pf8(str42, list9, nw80Var6, m7m0Var13, qp9Var6);
                                    } else {
                                        str14 = str32;
                                        iun iunVar2 = iun.f15405a;
                                        nw80 nw80Var7 = nw80.t;
                                        iOrdinal4 = nnm0Var.ordinal();
                                        if (iOrdinal4 != 0) {
                                            m7m0Var3 = m7m0.f;
                                        } else if (iOrdinal4 != 1) {
                                            m7m0Var3 = m7m0.c;
                                        } else if (iOrdinal4 != 5) {
                                            m7m0Var3 = m7m0.i;
                                        } else {
                                            m7m0Var3 = m7m0.e;
                                        }
                                        pf8Var2 = new pf8("", iunVar2, nw80Var7, m7m0Var3, new qp9(str14, 0, 0L));
                                    }
                                    iOrdinal5 = ww90Var2.ordinal();
                                    if (iOrdinal5 != 0) {
                                        m7m0Var4 = m7m0.g;
                                    } else if (iOrdinal5 != 1) {
                                        m7m0Var4 = m7m0.f21327a;
                                    } else if (iOrdinal5 != 2) {
                                        m7m0Var4 = m7m0.d;
                                    } else if (iOrdinal5 != 3) {
                                        m7m0Var4 = m7m0.b;
                                    } else if (iOrdinal5 == 4) {
                                        m7m0Var4 = m7m0.i;
                                    } else {
                                        t9f.b();
                                    }
                                    m7m0 m7m0Var14 = m7m0Var4;
                                    iOrdinal6 = ww90Var2.ordinal();
                                    qp9Var = pf8Var2.e;
                                    if (iOrdinal6 != 0) {
                                        az5Var = (az5) CollectionsKt.firstOrNull(pf8Var2.b);
                                        if (az5Var != null) {
                                            i11 = az5Var.f1701a;
                                        } else {
                                            i11 = qp9Var.f29104a;
                                        }
                                        i12 = i11;
                                    } else if (iOrdinal6 != 1) {
                                        i12 = i17;
                                    } else {
                                        i12 = i17;
                                    }
                                    iOrdinal7 = ww90Var2.ordinal();
                                    if (iOrdinal7 == 0) {
                                        if (iOrdinal7 != 1) {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        }
                                        vf8Var = new vf8(i12, j, nw80Var, m7m0Var14, str8);
                                    } else {
                                        strA9 = qp9Var.b;
                                    }
                                    str8 = strA9;
                                    vf8Var = new vf8(i12, j, nw80Var, m7m0Var14, str8);
                                }
                                vf8Var2 = vf8Var;
                                arrayList8.add(new r11(uzhVar4, hnlVarN7, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var5, vf8Var2, i7));
                                arrayList7 = arrayList8;
                                str9 = str31;
                                str10 = str6;
                                str11 = str28;
                                str12 = str29;
                                it6 = it7;
                                str13 = str30;
                                y11Var2 = y11Var6;
                                q11Var6 = q11Var7;
                            }
                            return dyb.r0(arrayList7);
                        }
                        if (Intrinsics.d(b7vVar, a7v.f393a)) {
                            return i4w0.N(q11Var6.t);
                        }
                        t9f.b();
                        return null;
                }
            }
        });
        this.q = bkb.G(((fee) n0o0VarH.getValue()).d, new eo0((byte) 12));
        final byte b3 = 3;
        this.r = maz.b(new yw9((fee) n0o0VarH2.getValue(), new Function1(this) { // from class: a.x11
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
            /* JADX WARN: Code duplicated, block: B:103:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:106:0x02c9  */
            /* JADX WARN: Code duplicated, block: B:107:0x02db A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:108:0x02dd  */
            /* JADX WARN: Code duplicated, block: B:110:0x02e3  */
            /* JADX WARN: Code duplicated, block: B:112:0x02f3  */
            /* JADX WARN: Code duplicated, block: B:117:0x0306 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:118:0x0308  */
            /* JADX WARN: Code duplicated, block: B:121:0x031a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:122:0x031c  */
            /* JADX WARN: Code duplicated, block: B:123:0x0327  */
            /* JADX WARN: Code duplicated, block: B:135:0x035a  */
            /* JADX WARN: Code duplicated, block: B:147:0x038e  */
            /* JADX WARN: Code duplicated, block: B:153:0x03bb  */
            /* JADX WARN: Code duplicated, block: B:158:0x03c3  */
            /* JADX WARN: Code duplicated, block: B:161:0x03e7  */
            /* JADX WARN: Code duplicated, block: B:163:0x03ea  */
            /* JADX WARN: Code duplicated, block: B:165:0x03ed  */
            /* JADX WARN: Code duplicated, block: B:167:0x03f2  */
            /* JADX WARN: Code duplicated, block: B:168:0x03f5  */
            /* JADX WARN: Code duplicated, block: B:169:0x03f8  */
            /* JADX WARN: Code duplicated, block: B:172:0x0419  */
            /* JADX WARN: Code duplicated, block: B:174:0x041c  */
            /* JADX WARN: Code duplicated, block: B:176:0x041f  */
            /* JADX WARN: Code duplicated, block: B:178:0x0434  */
            /* JADX WARN: Code duplicated, block: B:180:0x043a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:181:0x043c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:182:0x043e  */
            /* JADX WARN: Code duplicated, block: B:184:0x0443  */
            /* JADX WARN: Code duplicated, block: B:185:0x0446  */
            /* JADX WARN: Code duplicated, block: B:186:0x0449  */
            /* JADX WARN: Code duplicated, block: B:189:0x0459  */
            /* JADX WARN: Code duplicated, block: B:191:0x045f  */
            /* JADX WARN: Code duplicated, block: B:193:0x0462  */
            /* JADX WARN: Code duplicated, block: B:195:0x0465  */
            /* JADX WARN: Code duplicated, block: B:197:0x046a  */
            /* JADX WARN: Code duplicated, block: B:198:0x046d  */
            /* JADX WARN: Code duplicated, block: B:199:0x0470  */
            /* JADX WARN: Code duplicated, block: B:201:0x047b  */
            /* JADX WARN: Code duplicated, block: B:203:0x0487  */
            /* JADX WARN: Code duplicated, block: B:205:0x048f  */
            /* JADX WARN: Code duplicated, block: B:207:0x049f  */
            /* JADX WARN: Code duplicated, block: B:209:0x04c6  */
            /* JADX WARN: Code duplicated, block: B:211:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:213:0x04d7  */
            /* JADX WARN: Code duplicated, block: B:215:0x04da  */
            /* JADX WARN: Code duplicated, block: B:217:0x04df  */
            /* JADX WARN: Code duplicated, block: B:218:0x04e2  */
            /* JADX WARN: Code duplicated, block: B:219:0x04e5  */
            /* JADX WARN: Code duplicated, block: B:223:0x04fd  */
            /* JADX WARN: Code duplicated, block: B:225:0x0500  */
            /* JADX WARN: Code duplicated, block: B:227:0x0503  */
            /* JADX WARN: Code duplicated, block: B:229:0x0506  */
            /* JADX WARN: Code duplicated, block: B:231:0x0509  */
            /* JADX WARN: Code duplicated, block: B:234:0x0513  */
            /* JADX WARN: Code duplicated, block: B:235:0x0516  */
            /* JADX WARN: Code duplicated, block: B:236:0x0519  */
            /* JADX WARN: Code duplicated, block: B:237:0x051c  */
            /* JADX WARN: Code duplicated, block: B:240:0x0527  */
            /* JADX WARN: Code duplicated, block: B:245:0x0530  */
            /* JADX WARN: Code duplicated, block: B:246:0x0533  */
            /* JADX WARN: Code duplicated, block: B:248:0x053d  */
            /* JADX WARN: Code duplicated, block: B:250:0x0542  */
            /* JADX WARN: Code duplicated, block: B:253:0x054b  */
            /* JADX WARN: Code duplicated, block: B:265:0x0570  */
            /* JADX WARN: Code duplicated, block: B:266:0x057f  */
            /* JADX WARN: Code duplicated, block: B:468:0x0b96  */
            /* JADX WARN: Code duplicated, block: B:469:0x0bb1  */
            /* JADX WARN: Code duplicated, block: B:471:0x0bbf  */
            /* JADX WARN: Code duplicated, block: B:472:0x0bd0  */
            /* JADX WARN: Code duplicated, block: B:484:0x0be9  */
            /* JADX WARN: Code duplicated, block: B:485:0x0bfb  */
            /* JADX WARN: Code duplicated, block: B:487:0x0bff  */
            /* JADX WARN: Code duplicated, block: B:488:0x0c11  */
            /* JADX WARN: Code duplicated, block: B:491:0x0c46  */
            /* JADX WARN: Code duplicated, block: B:493:0x0c4b  */
            /* JADX WARN: Code duplicated, block: B:495:0x0c4e  */
            /* JADX WARN: Code duplicated, block: B:497:0x0c51  */
            /* JADX WARN: Code duplicated, block: B:499:0x0c54  */
            /* JADX WARN: Code duplicated, block: B:502:0x0c5d  */
            /* JADX WARN: Code duplicated, block: B:503:0x0c61  */
            /* JADX WARN: Code duplicated, block: B:504:0x0c64  */
            /* JADX WARN: Code duplicated, block: B:505:0x0c67  */
            /* JADX WARN: Code duplicated, block: B:508:0x0c7b  */
            /* JADX WARN: Code duplicated, block: B:509:0x0c84  */
            /* JADX WARN: Code duplicated, block: B:511:0x0c8f  */
            /* JADX WARN: Code duplicated, block: B:513:0x0c95  */
            /* JADX WARN: Code duplicated, block: B:514:0x0c96 A[PHI: r15
  0x0c96: PHI (r15v12 int) = (r15v11 int), (r15v17 int) binds: [B:510:0x0c8d, B:513:0x0c95] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:515:0x0c99  */
            /* JADX WARN: Code duplicated, block: B:520:0x0cae  */
            /* JADX WARN: Code duplicated, block: B:525:0x0ce6  */
            /* JADX WARN: Code duplicated, block: B:527:0x0cf9  */
            /* JADX WARN: Code duplicated, block: B:530:0x0d0b  */
            /* JADX WARN: Code duplicated, block: B:531:0x0d0e  */
            /* JADX WARN: Code duplicated, block: B:534:0x0d1c  */
            /* JADX WARN: Code duplicated, block: B:535:0x0d1f  */
            /* JADX WARN: Code duplicated, block: B:537:0x0d2f  */
            /* JADX WARN: Code duplicated, block: B:538:0x0d31  */
            /* JADX WARN: Code duplicated, block: B:540:0x0d37  */
            /* JADX WARN: Code duplicated, block: B:541:0x0d39  */
            /* JADX WARN: Code duplicated, block: B:544:0x0d4e  */
            /* JADX WARN: Code duplicated, block: B:545:0x0d50  */
            /* JADX WARN: Code duplicated, block: B:547:0x0d53  */
            /* JADX WARN: Code duplicated, block: B:549:0x0d57  */
            /* JADX WARN: Code duplicated, block: B:552:0x0d79  */
            /* JADX WARN: Code duplicated, block: B:554:0x0d7e  */
            /* JADX WARN: Code duplicated, block: B:564:0x050e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:579:0x0c57 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y11 y11Var;
                boolean z;
                int i;
                boolean z2;
                String strL;
                String strL2;
                String strA;
                String strA2;
                lsm0 lsm0Var;
                boolean z3;
                int i2;
                StringBuilder sb;
                int iOrdinal;
                int i3;
                String str;
                String str2;
                String strL3;
                int i4;
                int i5;
                char c;
                String strA3;
                lak0 lak0Var;
                i4 i4VarG0;
                String strA4;
                String strValueOf;
                String strM;
                boolean z4;
                boolean z5;
                m7m0 m7m0Var;
                int i6;
                int iA;
                ijl ijlVar;
                String str3;
                String strC;
                boolean z6;
                ot0 ot0Var;
                boolean z7;
                Iterator it;
                String str4;
                boolean z8;
                String strA5;
                pt0 pt0Var;
                n0x n0xVar;
                pt0 pt0Var2;
                sso0 uqo0Var;
                nur murVar;
                ww90 ww90Var;
                int i7;
                String str5;
                String str6;
                int i8;
                char c2;
                int i9;
                String strA6;
                String str7;
                int i10;
                ww90 ww90Var2;
                String strA7;
                String strA8;
                a4x a4xVarO0;
                a4x a4xVarO1;
                boolean z9;
                boolean z10;
                int iOrdinal2;
                m7m0 m7m0Var2;
                nw80 nw80Var;
                long j;
                List listJ;
                int iOrdinal3;
                pf8 pf8Var;
                int iOrdinal4;
                m7m0 m7m0Var3;
                pf8 pf8Var2;
                int iOrdinal5;
                m7m0 m7m0Var4;
                int iOrdinal6;
                qp9 qp9Var;
                az5 az5Var;
                int i11;
                int i12;
                int iOrdinal7;
                String strA9;
                String str8;
                vf8 vf8Var;
                pf8 pf8Var3;
                qp9 qp9Var2;
                vf8 vf8Var2;
                int iOrdinal8;
                m7m0 m7m0Var5;
                vf8 vf8Var3;
                int iOrdinal9;
                m7m0 m7m0Var6;
                List list;
                List list2;
                byte b4 = b3;
                String str9 = Separators.SP;
                String str10 = "static/img/android/casino/alt_design/aggregator_gift_card/";
                String str11 = "Background_Picture";
                String str12 = "Background_Illustration";
                String str13 = "Ticket_Secondary";
                String str14 = "";
                y11 y11Var2 = this.b;
                switch (b4) {
                    case 0:
                        y11 y11Var3 = y11Var2;
                        String str15 = "static/img/android/casino/alt_design/aggregator_gift_card/";
                        q11 q11Var2 = (q11) y11Var3.z;
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        m7v m7vVar = (m7v) feeVar.c();
                        if (m7vVar instanceof k7v) {
                            ArrayList arrayList = ((k7v) m7vVar).f17842a;
                            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                n65 n65Var = (n65) it2.next();
                                c01 c01Var = q11Var2.t;
                                ctf0 ctf0Var2 = y11Var3.b;
                                n65Var.getClass();
                                int i13 = n65Var.c;
                                ctf0Var2.getClass();
                                dqs dqsVar = n65Var.e;
                                String str16 = dqsVar.d;
                                long j2 = n65Var.d.f44639a;
                                int i14 = n65Var.b;
                                Iterator it3 = it2;
                                if (i13 == i14) {
                                    y11Var = y11Var3;
                                    z = n65Var.l == na90.PAYMENT_AFTER_DEPOSIT;
                                    Date date2 = new Date(j2);
                                    if (z) {
                                        String str110 = n65Var.k;
                                        pn40 pn40Var3 = pn40.f27267a;
                                        i = 2;
                                        z2 = true;
                                        strL = kng0.l(str110, Separators.SP, pn40.j(n65Var.j, 2, true));
                                    } else {
                                        i = 2;
                                        z2 = true;
                                        strL = null;
                                    }
                                    if (z != 0) {
                                        String str111 = n65Var.i;
                                        pn40 pn40Var4 = pn40.f27267a;
                                        strL2 = kng0.l(str111, Separators.SP, pn40.j(n65Var.h, i, z2));
                                    } else {
                                        strL2 = null;
                                    }
                                    boolean z11 = (strL != null || strL.length() == 0) && (strL2 == null || strL2.length() == 0);
                                    if (z != 0) {
                                        strA = ctf0Var2.b.a(R.string.win_sum_title, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        strA = null;
                                    }
                                    if (z != 0) {
                                        strA2 = ctf0Var2.b.a(R.string.deposit_sum_title, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        strA2 = null;
                                    }
                                    lsm0Var = ctf0Var2.b;
                                    String strA13 = lsm0Var.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
                                    q11 q11Var4 = q11Var2;
                                    z3 = z11;
                                    i2 = (int) n65Var.f22979a;
                                    hnl hnlVarN3 = nkb.N(c01Var);
                                    String strA14 = lsm0Var.a(R.string.free_spins_title, Arrays.copyOf(new Object[0], 0));
                                    sb = new StringBuilder(ujn.h);
                                    iOrdinal = c01Var.ordinal();
                                    if (iOrdinal != 0) {
                                        i3 = i2;
                                        if (iOrdinal != 1) {
                                            str = "Background_Illustration";
                                        } else if (iOrdinal != 2) {
                                            str = "";
                                        } else if (iOrdinal != 3) {
                                            str = "Ticket_Primary";
                                        } else if (iOrdinal == 4) {
                                            str = "Ticket_Secondary";
                                        } else {
                                            t9f.b();
                                        }
                                    } else {
                                        i3 = i2;
                                        str = "Background_Picture";
                                    }
                                    str2 = str15;
                                    strL3 = kng0.l(str2, str, "_Spin.webp");
                                    if (strL3.length() == 0) {
                                        i4 = 0;
                                        sb.setLength(0);
                                        str15 = str2;
                                    } else {
                                        str15 = str2;
                                        i4 = 0;
                                        if (StringsKt.O(strL3, ujn.h, false)) {
                                            sb.setLength(i4);
                                            sb.append(strL3);
                                        } else if (kotlin.text.c.x(strL3, "https://", false)) {
                                            i4 = 0;
                                            sb.setLength(i4);
                                            sb.append(strL3);
                                        } else {
                                            if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                i5 = 1;
                                                c = '/';
                                            } else {
                                                sb.append('/');
                                                c = '/';
                                                i5 = 1;
                                            }
                                            char[] cArr2 = new char[i5];
                                            i4 = 0;
                                            cArr2[0] = c;
                                            sb.append(StringsKt.y0(strL3, cArr2));
                                        }
                                    }
                                    String string2 = sb.toString();
                                    String str112 = strA13 + Separators.SP + i14;
                                    String strA15 = lsm0Var.a(R.string.for_games_title, Arrays.copyOf(new Object[i4], i4));
                                    if (z != 0) {
                                        strA3 = lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[i4], i4));
                                    } else {
                                        strA3 = lsm0Var.a(R.string.play_button, Arrays.copyOf(new Object[i4], i4));
                                    }
                                    String str21 = strA3;
                                    lak0Var = lak0.c;
                                    if (z != 0) {
                                        i4VarG0 = lak0Var;
                                    } else {
                                        i4VarG0 = dyb.g0(str16);
                                    }
                                    if (z != 0) {
                                        strA4 = "";
                                    } else {
                                        strA4 = lsm0Var.a(R.string.spins_title, Arrays.copyOf(new Object[0], 0));
                                    }
                                    if (z != 0) {
                                        strValueOf = null;
                                    } else {
                                        strValueOf = String.valueOf(i13);
                                    }
                                    if (z) {
                                        strM = null;
                                    } else {
                                        strM = twn.m(i14, " / ");
                                    }
                                    ovl ovlVar2 = new ovl(strA4, strValueOf, strM);
                                    q7n q7nVarR2 = vbw0.R(ctf0Var2, date2, Long.valueOf(j2));
                                    if (strA != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (strA2 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    uzh uzhVar2 = new uzh(hnlVarN3, strA14, "", string2, str112, "", strA15, strA, strA2, lak0Var, i4VarG0, false, strL, strL2, "", str21, 12, ovlVar2, q7nVarR2, new tzh(true, false, z4, z5));
                                    hnl hnlVarN4 = nkb.N(c01Var);
                                    nw80 nw80Var3 = nw80.b;
                                    if (z3) {
                                        m7m0Var = m7m0.g;
                                    } else {
                                        m7m0Var = m7m0.h;
                                    }
                                    arrayList2.add(new r11(uzhVar2, hnlVarN4, null, null, null, new vf8(dqsVar.c, n65Var.f22979a, nw80Var3, m7m0Var, str16), i3));
                                    it2 = it3;
                                    q11Var2 = q11Var4;
                                    y11Var3 = y11Var;
                                } else {
                                    y11Var = y11Var3;
                                }
                                Date date3 = new Date(j2);
                                if (z) {
                                    String str113 = n65Var.k;
                                    pn40 pn40Var5 = pn40.f27267a;
                                    i = 2;
                                    z2 = true;
                                    strL = kng0.l(str113, Separators.SP, pn40.j(n65Var.j, 2, true));
                                } else {
                                    i = 2;
                                    z2 = true;
                                    strL = null;
                                }
                                if (z != 0) {
                                    String str114 = n65Var.i;
                                    pn40 pn40Var6 = pn40.f27267a;
                                    strL2 = kng0.l(str114, Separators.SP, pn40.j(n65Var.h, i, z2));
                                } else {
                                    strL2 = null;
                                }
                                if (strL != null) {
                                }
                                if (z != 0) {
                                    strA = ctf0Var2.b.a(R.string.win_sum_title, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA = null;
                                }
                                if (z != 0) {
                                    strA2 = ctf0Var2.b.a(R.string.deposit_sum_title, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA2 = null;
                                }
                                lsm0Var = ctf0Var2.b;
                                String strA16 = lsm0Var.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
                                q11 q11Var5 = q11Var2;
                                z3 = z11;
                                i2 = (int) n65Var.f22979a;
                                hnl hnlVarN5 = nkb.N(c01Var);
                                String strA17 = lsm0Var.a(R.string.free_spins_title, Arrays.copyOf(new Object[0], 0));
                                sb = new StringBuilder(ujn.h);
                                iOrdinal = c01Var.ordinal();
                                if (iOrdinal != 0) {
                                    i3 = i2;
                                    if (iOrdinal != 1) {
                                        str = "Background_Illustration";
                                    } else if (iOrdinal != 2) {
                                        str = "";
                                    } else if (iOrdinal != 3) {
                                        str = "Ticket_Primary";
                                    } else if (iOrdinal == 4) {
                                        str = "Ticket_Secondary";
                                    } else {
                                        t9f.b();
                                    }
                                } else {
                                    i3 = i2;
                                    str = "Background_Picture";
                                }
                                str2 = str15;
                                strL3 = kng0.l(str2, str, "_Spin.webp");
                                if (strL3.length() == 0) {
                                    i4 = 0;
                                    sb.setLength(0);
                                    str15 = str2;
                                } else {
                                    str15 = str2;
                                    i4 = 0;
                                    if (StringsKt.O(strL3, ujn.h, false)) {
                                        sb.setLength(i4);
                                        sb.append(strL3);
                                    } else if (kotlin.text.c.x(strL3, "https://", false)) {
                                        i4 = 0;
                                        sb.setLength(i4);
                                        sb.append(strL3);
                                    } else {
                                        if (sb.length() > 0) {
                                            i5 = 1;
                                            c = '/';
                                        } else {
                                            i5 = 1;
                                            c = '/';
                                        }
                                        char[] cArr3 = new char[i5];
                                        i4 = 0;
                                        cArr3[0] = c;
                                        sb.append(StringsKt.y0(strL3, cArr3));
                                    }
                                }
                                String string3 = sb.toString();
                                String str115 = strA16 + Separators.SP + i14;
                                String strA18 = lsm0Var.a(R.string.for_games_title, Arrays.copyOf(new Object[i4], i4));
                                if (z != 0) {
                                    strA3 = lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[i4], i4));
                                } else {
                                    strA3 = lsm0Var.a(R.string.play_button, Arrays.copyOf(new Object[i4], i4));
                                }
                                String str22 = strA3;
                                lak0Var = lak0.c;
                                if (z != 0) {
                                    i4VarG0 = lak0Var;
                                } else {
                                    i4VarG0 = dyb.g0(str16);
                                }
                                if (z != 0) {
                                    strA4 = "";
                                } else {
                                    strA4 = lsm0Var.a(R.string.spins_title, Arrays.copyOf(new Object[0], 0));
                                }
                                if (z != 0) {
                                    strValueOf = null;
                                } else {
                                    strValueOf = String.valueOf(i13);
                                }
                                if (z) {
                                    strM = null;
                                } else {
                                    strM = twn.m(i14, " / ");
                                }
                                ovl ovlVar3 = new ovl(strA4, strValueOf, strM);
                                q7n q7nVarR3 = vbw0.R(ctf0Var2, date3, Long.valueOf(j2));
                                if (strA != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (strA2 != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                uzh uzhVar3 = new uzh(hnlVarN5, strA17, "", string3, str115, "", strA18, strA, strA2, lak0Var, i4VarG0, false, strL, strL2, "", str22, 12, ovlVar3, q7nVarR3, new tzh(true, false, z4, z5));
                                hnl hnlVarN6 = nkb.N(c01Var);
                                nw80 nw80Var4 = nw80.b;
                                if (z3) {
                                    m7m0Var = m7m0.g;
                                } else {
                                    m7m0Var = m7m0.h;
                                }
                                arrayList2.add(new r11(uzhVar3, hnlVarN6, null, null, null, new vf8(dqsVar.c, n65Var.f22979a, nw80Var4, m7m0Var, str16), i3));
                                it2 = it3;
                                q11Var2 = q11Var5;
                                y11Var3 = y11Var;
                            }
                            return dyb.r0(arrayList2);
                        }
                        if (Intrinsics.d(m7vVar, l7v.f19578a)) {
                            return i4w0.N(q11Var2.t);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        g7v g7vVar = (g7v) feeVar2.c();
                        if (!(g7vVar instanceof e7v)) {
                            if (Intrinsics.d(g7vVar, f7v.f9076a)) {
                                zcl zclVar = qmk.f28987a;
                                return new h7v(new gyl(null, s5x0.t(0.0f, 8.0f, 1), 1));
                            }
                            t9f.b();
                            return null;
                        }
                        if (((a4x) ((fee) y11Var2.x.getValue()).b()).size() + ((a4x) ((fee) y11Var2.w.getValue()).b()).size() <= 0) {
                            return i7v.f14312a;
                        }
                        a4x<y6v> a4xVar = ((e7v) g7vVar).f7345a;
                        ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar, 10));
                        for (y6v y6vVar : a4xVar) {
                            ctf0 ctf0Var3 = y11Var2.b;
                            d7v d7vVar = (d7v) ((fee) y11Var2.k.getValue()).c();
                            y6vVar.getClass();
                            d7v d7vVar2 = y6vVar.f42119a;
                            ctf0Var3.getClass();
                            d7vVar.getClass();
                            long jOrdinal = d7vVar2.ordinal();
                            int iOrdinal10 = d7vVar2.ordinal();
                            if (iOrdinal10 == 0) {
                                i6 = R.string.all;
                            } else if (iOrdinal10 == 1) {
                                i6 = R.string.bonuses_title;
                            } else {
                                if (iOrdinal10 != 2) {
                                    t9f.b();
                                    return null;
                                }
                                i6 = R.string.free_spins_title;
                            }
                            xxl xxlVar = new xxl(ctf0Var3.b.a(i6, Arrays.copyOf(new Object[0], 0)));
                            uxl uxlVar = d7vVar2 == d7vVar ? uxl.b : uxl.f36445a;
                            int i15 = y6vVar.b;
                            arrayList3.add(new lxl(jOrdinal, (dyl) xxlVar, false, uxlVar, i15 != 0 ? new cwl(new rpe(i15)) : null, 76));
                        }
                        return new h7v(new fyl(dyb.r0(arrayList3), null, null, s5x0.t(0.0f, 0.0f, 3), null, 22));
                    case 2:
                        int iIntValue = ((Integer) obj).intValue();
                        boolean z12 = ((q11) y11Var2.z).v;
                        int iIntValue2 = ((Number) ((fee) y11Var2.t.getValue()).b()).intValue();
                        if (z12) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.j;
                            xuzVar.getClass();
                            iA = xuz.a(pb10Var, iIntValue);
                        } else {
                            xuz xuzVar2 = pb10.c;
                            pb10 pb10Var2 = pb10.i;
                            xuzVar2.getClass();
                            iA = xuz.a(pb10Var2, iIntValue);
                        }
                        return new mdm(iA, null, null, 0, 0, iIntValue2, 0, 0, 0L, 0L, 990);
                    case 3:
                        ((fee) obj).getClass();
                        fee feeVar3 = (fee) y11Var2.c.getValue();
                        ctf0 ctf0Var4 = y11Var2.b;
                        if (!((Boolean) feeVar3.c()).booleanValue()) {
                            return new zc(ctf0Var4.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) y11Var2.d.getValue()).c();
                        kg kgVar = ((q11) y11Var2.z).u;
                        kgVar.getClass();
                        int iOrdinal11 = kgVar.ordinal();
                        if (iOrdinal11 == 0) {
                            ijlVar = ijl.f14880a;
                        } else if (iOrdinal11 == 1) {
                            ijlVar = ijl.b;
                        } else if (iOrdinal11 == 2) {
                            ijlVar = ijl.c;
                        } else if (iOrdinal11 == 3) {
                            ijlVar = ijl.d;
                        } else {
                            if (iOrdinal11 != 4) {
                                t9f.b();
                                return null;
                            }
                            ijlVar = ijl.e;
                        }
                        if (ql5Var != null) {
                            String strA19 = ql5Var.j;
                            if (ijlVar == ijl.b) {
                                strA19 = ctf0Var4.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA19.length() <= 0) {
                                strA19 = ql5Var.k;
                            }
                            str3 = strA19;
                        } else {
                            str3 = null;
                        }
                        String str23 = str3 == null ? "" : str3;
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var7 = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str24 = strC == null ? "" : strC;
                        String str25 = ql5Var != null ? ql5Var.f : null;
                        String str26 = str25 == null ? "" : str25;
                        String strA110 = ctf0Var4.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        return new xc(ijlVar, new jjl(str24, str26, strA110, str23, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())));
                    case 4:
                        n0o0 n0o0Var = y11Var2.w;
                        n0o0 n0o0Var2 = y11Var2.x;
                        d7v d7vVar3 = (d7v) obj;
                        d7vVar3.getClass();
                        int iOrdinal12 = d7vVar3.ordinal();
                        if (iOrdinal12 == 0) {
                            return CollectionsKt.q0((Collection) ((fee) n0o0Var.getValue()).b(), (Iterable) ((fee) n0o0Var2.getValue()).b());
                        }
                        if (iOrdinal12 == 1) {
                            return (List) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal12 == 2) {
                            return (List) ((fee) n0o0Var2.getValue()).b();
                        }
                        t9f.b();
                        return null;
                    case 5:
                        ((Unit) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(((q11) y11Var2.z).r, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    case 6:
                        y11 y11Var4 = y11Var2;
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        Iterable iterable = (Iterable) feeVar4.c();
                        ArrayList arrayList4 = new ArrayList(r3d.q(iterable, 10));
                        Iterator it4 = iterable.iterator();
                        while (it4.hasNext()) {
                            j8b j8bVar = (j8b) it4.next();
                            y11 y11Var5 = y11Var4;
                            ctf0 ctf0Var5 = y11Var5.b;
                            boolean zBooleanValue = ((Boolean) ((fee) y11Var5.c.getValue()).c()).booleanValue();
                            q11 q11Var6 = (q11) y11Var5.z;
                            boolean z13 = q11Var6.v;
                            ot0 ot0Var2 = q11Var6.x;
                            Set set = (Set) ((fee) y11Var5.f.getValue()).c();
                            j8bVar.getClass();
                            ctf0Var5.getClass();
                            set.getClass();
                            List<mlr> list3 = j8bVar.c;
                            ArrayList arrayList5 = new ArrayList(r3d.q(list3, 10));
                            for (mlr mlrVar : list3) {
                                Set set2 = set;
                                if ((set2 instanceof Collection) && set2.isEmpty()) {
                                    z6 = zBooleanValue;
                                    ot0Var = ot0Var2;
                                    z7 = false;
                                } else {
                                    Iterator it5 = set2.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            z6 = zBooleanValue;
                                            ot0Var = ot0Var2;
                                            if (((Number) it5.next()).longValue() == mlrVar.f22006a) {
                                                z7 = true;
                                            } else {
                                                zBooleanValue = z6;
                                                ot0Var2 = ot0Var;
                                            }
                                        } else {
                                            z6 = zBooleanValue;
                                            ot0Var = ot0Var2;
                                            z7 = false;
                                        }
                                    }
                                }
                                pt0 pt0VarG0 = x4d0.g0(ot0Var);
                                Integer numValueOf = Integer.valueOf((int) j8bVar.f16074a);
                                mlrVar.getClass();
                                boolean z14 = mlrVar.k;
                                int i16 = z13 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                boolean z15 = mlrVar.j;
                                if (z14) {
                                    it = it4;
                                    str4 = str14;
                                    z8 = z13;
                                    strA5 = ctf0Var5.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    it = it4;
                                    str4 = str14;
                                    z8 = z13;
                                    strA5 = z15 ? ctf0Var5.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : str4;
                                }
                                Set set3 = set;
                                long j3 = mlrVar.f22006a;
                                String str27 = mlrVar.f;
                                String str28 = mlrVar.e;
                                mtr mtrVar = new mtr(z6 ? z7 ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, z7);
                                n0x n0xVar2 = new n0x(mlrVar.g);
                                m0x m0xVar = new m0x(i16, null, 6);
                                if (strA5.length() == 0) {
                                    murVar = lur.f20686a;
                                    n0xVar = n0xVar2;
                                } else {
                                    pt0 pt0Var3 = pt0.f27539a;
                                    if ((pt0VarG0 == pt0Var3 && z14) || (pt0VarG0 == (pt0Var = pt0.c) && z14)) {
                                        n0xVar = n0xVar2;
                                    } else {
                                        n0xVar = n0xVar2;
                                        pt0 pt0Var4 = pt0.d;
                                        if (pt0VarG0 != pt0Var4 || !z14) {
                                            if ((pt0VarG0 == pt0Var3 && z15) || ((pt0VarG0 == pt0Var && z15) || (pt0VarG0 == pt0Var4 && z15))) {
                                                d4d d4dVar = d4d.PRIMARY;
                                                uqo0Var = new eqo0();
                                            } else {
                                                pt0 pt0Var5 = pt0.b;
                                                uqo0Var = ((pt0VarG0 == pt0Var5 && z14) || (pt0VarG0 == (pt0Var2 = pt0.e) && z14)) ? kro0.f18776a : ((pt0VarG0 == pt0Var5 && z15) || (pt0VarG0 == pt0Var2 && z15)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                            }
                                        }
                                        murVar = new mur(strA5, uqo0Var);
                                    }
                                    d4d d4dVar2 = d4d.PRIMARY;
                                    uqo0Var = new lro0();
                                    murVar = new mur(strA5, uqo0Var);
                                }
                                arrayList5.add(new st0(j3, str27, str28, mtrVar, n0xVar, m0xVar, numValueOf, murVar));
                                zBooleanValue = z6;
                                ot0Var2 = ot0Var;
                                it4 = it;
                                z13 = z8;
                                set = set3;
                                str14 = str4;
                            }
                            arrayList4.add(new h4r0(j8bVar.f16074a, j8bVar.d, j8bVar.b, new hjm(j8bVar.b, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var5.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166), new zll(x4d0.g0(ot0Var2), new wll(o0s.f24443a), arrayList5)));
                            y11Var4 = y11Var5;
                            it4 = it4;
                            str14 = str14;
                        }
                        return dyb.r0(arrayList4);
                    default:
                        q11 q11Var7 = (q11) y11Var2.z;
                        fee feeVar5 = (fee) obj;
                        feeVar5.getClass();
                        b7v b7vVar = (b7v) feeVar5.c();
                        if (b7vVar instanceof z6v) {
                            ArrayList arrayList6 = ((z6v) b7vVar).f43888a;
                            ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                            Iterator it6 = arrayList6.iterator();
                            while (it6.hasNext()) {
                                e65 e65Var = (e65) it6.next();
                                c01 c01Var2 = q11Var7.t;
                                ctf0 ctf0Var6 = y11Var2.b;
                                e65Var.getClass();
                                ArrayList arrayList8 = arrayList7;
                                double d2 = e65Var.b;
                                ctf0Var6.getClass();
                                List list4 = e65Var.k;
                                String str29 = str11;
                                String str210 = str12;
                                long j4 = e65Var.g.f44639a;
                                List list5 = e65Var.o;
                                List list6 = e65Var.n;
                                int i17 = e65Var.f7264a;
                                Iterator it7 = it6;
                                gom0 gom0Var = e65Var.i;
                                String str30 = str13;
                                List list7 = e65Var.l;
                                y11 y11Var6 = y11Var2;
                                if (list4.size() == 1) {
                                    ww90Var = ww90.f39878a;
                                } else if (list4.size() > 1) {
                                    ww90Var = ww90.b;
                                } else if (list6.isEmpty() || !list7.isEmpty()) {
                                    ww90Var = (list7.isEmpty() && list5.isEmpty()) ? ww90.c : ww90.d;
                                } else {
                                    ww90Var = ww90.b;
                                }
                                ArrayList arrayList9 = new ArrayList();
                                q11 q11Var8 = q11Var7;
                                ww90 ww90Var3 = ww90Var;
                                String str31 = str9;
                                lsm0 lsm0Var2 = ctf0Var6.b;
                                String strA111 = lsm0Var2.a(R.string.for_games_title, Arrays.copyOf(new Object[0], 0));
                                m7m0 m7m0Var7 = m7m0.f21327a;
                                if (!list4.isEmpty()) {
                                    arrayList9.add(new pf8(strA111, list4, nw80.t, m7m0Var7, new qp9(str14, i17, i17)));
                                }
                                String strA112 = lsm0Var2.a(R.string.for_unavailable_games_title, Arrays.copyOf(new Object[0], 0));
                                if (!list6.isEmpty()) {
                                    arrayList9.add(new pf8(strA112, list6, nw80.t, m7m0Var7, new qp9(str14, i17, i17)));
                                }
                                pf8 pf8Var4 = (pf8) CollectionsKt.firstOrNull(arrayList9);
                                ArrayList arrayList10 = new ArrayList();
                                String strA20 = lsm0Var2.a(R.string.for_providers_title, Arrays.copyOf(new Object[0], 0));
                                m7m0 m7m0Var8 = m7m0.b;
                                if (!list7.isEmpty()) {
                                    arrayList10.add(new pf8(strA20, list7, nw80.t, m7m0Var8, new qp9(str14, i17, i17)));
                                }
                                String strA21 = lsm0Var2.a(R.string.for_unavailable_providers_title, Arrays.copyOf(new Object[0], 0));
                                if (!list5.isEmpty()) {
                                    arrayList10.add(new pf8(strA21, list5, nw80.t, m7m0Var8, new qp9(str14, i17, i17)));
                                }
                                pf8 pf8Var5 = (pf8) CollectionsKt.firstOrNull(arrayList10);
                                double d3 = ((double) e65Var.e) * d2;
                                String str32 = str14;
                                DecimalFormat decimalFormat = new DecimalFormat("0.##", DecimalFormatSymbols.getInstance(Locale.US));
                                String str33 = decimalFormat.format(d3);
                                String str34 = decimalFormat.format(e65Var.d);
                                Date date4 = new Date(j4);
                                int i18 = e65Var.f7264a;
                                hnl hnlVarN7 = nkb.N(c01Var2);
                                String strA22 = lsm0Var2.a(R.string.bonus_amount_title, Arrays.copyOf(new Object[0], 0));
                                nnm0 nnm0Var = gom0Var.f11638a;
                                String strA23 = lsm0Var2.a(R.string.bonus_active, Arrays.copyOf(new Object[0], 0));
                                nnm0 nnm0Var2 = nnm0.ACTIVE;
                                if (nnm0Var != nnm0Var2) {
                                    strA23 = null;
                                }
                                String str35 = strA23 == null ? str32 : strA23;
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                int iOrdinal13 = c01Var2.ordinal();
                                if (iOrdinal13 != 0) {
                                    i7 = i18;
                                    if (iOrdinal13 == 1) {
                                        str5 = str210;
                                    } else if (iOrdinal13 == 2) {
                                        str5 = str32;
                                    } else if (iOrdinal13 == 3) {
                                        str5 = "Ticket_Primery";
                                    } else if (iOrdinal13 == 4) {
                                        str5 = str30;
                                    } else {
                                        t9f.b();
                                    }
                                } else {
                                    i7 = i18;
                                    str5 = str29;
                                }
                                String strL4 = kng0.l(str10, str5, "_Bonus.webp");
                                if (strL4.length() == 0) {
                                    sb2.setLength(0);
                                    str6 = str10;
                                } else {
                                    str6 = str10;
                                    int i19 = 0;
                                    if (StringsKt.O(strL4, ujn.h, false)) {
                                        sb2.setLength(i19);
                                        sb2.append(strL4);
                                    } else if (kotlin.text.c.x(strL4, "https://", false)) {
                                        i19 = 0;
                                        sb2.setLength(i19);
                                        sb2.append(strL4);
                                    } else {
                                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                            i8 = 1;
                                            c2 = '/';
                                        } else {
                                            sb2.append('/');
                                            c2 = '/';
                                            i8 = 1;
                                        }
                                        char[] cArr4 = new char[i8];
                                        cArr4[0] = c2;
                                        sb2.append(StringsKt.y0(strL4, cArr4));
                                    }
                                }
                                String string4 = sb2.toString();
                                String str36 = e65Var.c;
                                pn40 pn40Var8 = pn40.f27267a;
                                String strL5 = kng0.l(str36, str31, pn40.c(d2, p3u0.c));
                                String str37 = pf8Var5 != null ? pf8Var5.f26889a : null;
                                String str38 = str37 == null ? str32 : str37;
                                String str39 = pf8Var4 != null ? pf8Var4.f26889a : null;
                                String str40 = str39 == null ? str32 : str39;
                                int iOrdinal14 = nnm0Var.ordinal();
                                if (iOrdinal14 != 0) {
                                    if (iOrdinal14 != 5) {
                                        str7 = str32;
                                        i9 = 0;
                                    } else {
                                        i9 = 0;
                                        strA6 = lsm0Var2.a(R.string.resume, Arrays.copyOf(new Object[0], 0));
                                    }
                                    if (nnm0Var == nnm0Var2) {
                                        i10 = 1;
                                    } else {
                                        i10 = i9;
                                    }
                                    if (nnm0Var == nnm0.READY) {
                                        strA7 = lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[i9], i9));
                                        ww90Var2 = ww90Var3;
                                    } else {
                                        if (i10 != 0) {
                                            ww90Var2 = ww90Var3;
                                            if (ww90Var2 == ww90.f39878a) {
                                                strA8 = lsm0Var2.a(R.string.play_button, Arrays.copyOf(new Object[i9], i9));
                                            }
                                            strA7 = strA8;
                                        } else {
                                            ww90Var2 = ww90Var3;
                                        }
                                        if (i10 == 0 && ww90Var2 == ww90.b) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        } else if (i10 == 0 && ww90Var2 == ww90.d) {
                                            strA8 = lsm0Var2.a(R.string.all_providers, Arrays.copyOf(new Object[i9], i9));
                                        } else if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        } else {
                                            strA7 = str32;
                                        }
                                        strA7 = strA8;
                                    }
                                    if (pf8Var5 != null || (list2 = pf8Var5.b) == null) {
                                        a4xVarO0 = lak0.c;
                                    } else {
                                        ArrayList arrayList11 = new ArrayList(r3d.q(list2, 10));
                                        Iterator it8 = list2.iterator();
                                        while (it8.hasNext()) {
                                            arrayList11.add(((az5) it8.next()).b);
                                        }
                                        a4xVarO0 = dyb.o0(arrayList11);
                                        if (a4xVarO0 == null) {
                                            a4xVarO0 = lak0.c;
                                        }
                                    }
                                    a4x a4xVar4 = a4xVarO0;
                                    if (pf8Var4 != null || (list = pf8Var4.b) == null) {
                                        a4xVarO1 = lak0.c;
                                    } else {
                                        ArrayList arrayList12 = new ArrayList(r3d.q(list, 10));
                                        Iterator it9 = list.iterator();
                                        while (it9.hasNext()) {
                                            arrayList12.add(((az5) it9.next()).b);
                                        }
                                        a4xVarO1 = dyb.o0(arrayList12);
                                        if (a4xVarO1 == null) {
                                            a4xVarO1 = lak0.c;
                                        }
                                    }
                                    a4x a4xVar5 = a4xVarO1;
                                    ovl ovlVar4 = new ovl(lsm0Var2.a(R.string.roleplaying_title, Arrays.copyOf(new Object[0], 0)), str34, kng0.k("/ ", str33));
                                    q7n q7nVarR4 = vbw0.R(ctf0Var6, date4, Long.valueOf(j4));
                                    if (pf8Var5 == null || pf8Var4 != null) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (pf8Var5 != null || pf8Var4 == null) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    uzh uzhVar4 = new uzh(hnlVarN7, strA22, str35, string4, strL5, str38, str40, null, null, a4xVar4, a4xVar5, true, null, null, str7, strA7, 0, ovlVar4, q7nVarR4, new tzh(z9, z10, false, false));
                                    hnl hnlVarN8 = nkb.N(c01Var2);
                                    iOrdinal2 = nnm0Var.ordinal();
                                    if (iOrdinal2 != 0) {
                                        m7m0Var2 = m7m0.f;
                                    } else if (iOrdinal2 != 1) {
                                        m7m0Var2 = m7m0.c;
                                    } else if (iOrdinal2 != 5) {
                                        m7m0Var2 = m7m0.i;
                                    } else {
                                        m7m0Var2 = m7m0.e;
                                    }
                                    m7m0 m7m0Var12 = m7m0Var2;
                                    nw80Var = nw80.b;
                                    j = i17;
                                    vf8 vf8Var5 = new vf8(i17, j, nw80Var, m7m0Var12, "");
                                    listJ = q3d.j(pf8Var4, pf8Var5);
                                    iOrdinal3 = nnm0Var.ordinal();
                                    if (iOrdinal3 != 0) {
                                        if (iOrdinal3 != 1) {
                                            iOrdinal8 = nnm0Var.ordinal();
                                            if (iOrdinal8 != 0) {
                                                m7m0Var5 = m7m0.f;
                                            } else if (iOrdinal8 != 1) {
                                                m7m0Var5 = m7m0.c;
                                            } else if (iOrdinal8 != 5) {
                                                m7m0Var5 = m7m0.i;
                                            } else {
                                                m7m0Var5 = m7m0.e;
                                            }
                                            vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var5, "");
                                        } else if (iOrdinal3 != 5) {
                                            vf8Var = new vf8(0, j, nw80Var, m7m0.i, "");
                                            str14 = str32;
                                        } else {
                                            iOrdinal9 = nnm0Var.ordinal();
                                            if (iOrdinal9 != 0) {
                                                m7m0Var6 = m7m0.f;
                                            } else if (iOrdinal9 != 1) {
                                                m7m0Var6 = m7m0.c;
                                            } else if (iOrdinal9 != 5) {
                                                m7m0Var6 = m7m0.i;
                                            } else {
                                                m7m0Var6 = m7m0.e;
                                            }
                                            vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var6, "");
                                        }
                                        str14 = str32;
                                        vf8Var2 = vf8Var3;
                                        arrayList8.add(new r11(uzhVar4, hnlVarN8, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var5, vf8Var2, i7));
                                        arrayList7 = arrayList8;
                                        str9 = str31;
                                        str10 = str6;
                                        str11 = str29;
                                        str12 = str210;
                                        it6 = it7;
                                        str13 = str30;
                                        y11Var2 = y11Var6;
                                        q11Var7 = q11Var8;
                                    } else {
                                        pf8Var = (pf8) CollectionsKt.firstOrNull(listJ);
                                        if (pf8Var != null) {
                                            pf8Var3 = (pf8) CollectionsKt.firstOrNull(listJ);
                                            if (pf8Var3 != null) {
                                                qp9 qp9Var5 = pf8Var3.e;
                                                qp9Var2 = new qp9(qp9Var5.b, qp9Var5.f29104a, j);
                                                str14 = str32;
                                            } else {
                                                str14 = str32;
                                                qp9Var2 = new qp9(str14, 0, 0L);
                                            }
                                            qp9 qp9Var6 = qp9Var2;
                                            String str42 = pf8Var.f26889a;
                                            List list9 = pf8Var.b;
                                            nw80 nw80Var6 = pf8Var.c;
                                            m7m0 m7m0Var13 = pf8Var.d;
                                            str42.getClass();
                                            list9.getClass();
                                            pf8Var2 = new pf8(str42, list9, nw80Var6, m7m0Var13, qp9Var6);
                                        } else {
                                            str14 = str32;
                                            iun iunVar2 = iun.f15405a;
                                            nw80 nw80Var7 = nw80.t;
                                            iOrdinal4 = nnm0Var.ordinal();
                                            if (iOrdinal4 != 0) {
                                                m7m0Var3 = m7m0.f;
                                            } else if (iOrdinal4 != 1) {
                                                m7m0Var3 = m7m0.c;
                                            } else if (iOrdinal4 != 5) {
                                                m7m0Var3 = m7m0.i;
                                            } else {
                                                m7m0Var3 = m7m0.e;
                                            }
                                            pf8Var2 = new pf8("", iunVar2, nw80Var7, m7m0Var3, new qp9(str14, 0, 0L));
                                        }
                                        iOrdinal5 = ww90Var2.ordinal();
                                        if (iOrdinal5 != 0) {
                                            m7m0Var4 = m7m0.g;
                                        } else if (iOrdinal5 != 1) {
                                            m7m0Var4 = m7m0.f21327a;
                                        } else if (iOrdinal5 != 2) {
                                            m7m0Var4 = m7m0.d;
                                        } else if (iOrdinal5 != 3) {
                                            m7m0Var4 = m7m0.b;
                                        } else if (iOrdinal5 == 4) {
                                            m7m0Var4 = m7m0.i;
                                        } else {
                                            t9f.b();
                                        }
                                        m7m0 m7m0Var14 = m7m0Var4;
                                        iOrdinal6 = ww90Var2.ordinal();
                                        qp9Var = pf8Var2.e;
                                        if (iOrdinal6 != 0) {
                                            az5Var = (az5) CollectionsKt.firstOrNull(pf8Var2.b);
                                            if (az5Var != null) {
                                                i11 = az5Var.f1701a;
                                            } else {
                                                i11 = qp9Var.f29104a;
                                            }
                                            i12 = i11;
                                        } else if (iOrdinal6 != 1 || iOrdinal6 == 3) {
                                            i12 = i17;
                                        } else {
                                            i12 = 0;
                                        }
                                        iOrdinal7 = ww90Var2.ordinal();
                                        if (iOrdinal7 == 0) {
                                            strA9 = qp9Var.b;
                                        } else if (iOrdinal7 != 1 || iOrdinal7 == 2) {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            if (iOrdinal7 == 3) {
                                                strA9 = lsm0Var2.a(R.string.all_providers, Arrays.copyOf(new Object[0], 0));
                                            } else if (iOrdinal7 == 4) {
                                                str8 = str14;
                                            } else {
                                                t9f.b();
                                            }
                                            vf8Var = new vf8(i12, j, nw80Var, m7m0Var14, str8);
                                        }
                                        str8 = strA9;
                                        vf8Var = new vf8(i12, j, nw80Var, m7m0Var14, str8);
                                    }
                                    vf8Var2 = vf8Var;
                                    arrayList8.add(new r11(uzhVar4, hnlVarN8, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var5, vf8Var2, i7));
                                    arrayList7 = arrayList8;
                                    str9 = str31;
                                    str10 = str6;
                                    str11 = str29;
                                    str12 = str210;
                                    it6 = it7;
                                    str13 = str30;
                                    y11Var2 = y11Var6;
                                    q11Var7 = q11Var8;
                                } else {
                                    i9 = 0;
                                    strA6 = lsm0Var2.a(R.string.suspend, Arrays.copyOf(new Object[0], 0));
                                }
                                str7 = strA6;
                                if (nnm0Var == nnm0Var2) {
                                    i10 = 1;
                                } else {
                                    i10 = i9;
                                }
                                if (nnm0Var == nnm0.READY) {
                                    strA7 = lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[i9], i9));
                                    ww90Var2 = ww90Var3;
                                } else {
                                    if (i10 != 0) {
                                        ww90Var2 = ww90Var3;
                                        if (ww90Var2 == ww90.f39878a) {
                                            strA8 = lsm0Var2.a(R.string.play_button, Arrays.copyOf(new Object[i9], i9));
                                        }
                                        strA7 = strA8;
                                    } else {
                                        ww90Var2 = ww90Var3;
                                    }
                                    if (i10 == 0) {
                                        if (i10 == 0) {
                                            if (i10 != 0) {
                                                strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                                strA7 = strA8;
                                            } else {
                                                strA7 = str32;
                                            }
                                        } else if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                            strA7 = strA8;
                                        } else {
                                            strA7 = str32;
                                        }
                                    } else if (i10 == 0) {
                                        if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                            strA7 = strA8;
                                        } else {
                                            strA7 = str32;
                                        }
                                    } else if (i10 != 0) {
                                        strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        strA7 = strA8;
                                    } else {
                                        strA7 = str32;
                                    }
                                }
                                if (pf8Var5 != null) {
                                    a4xVarO0 = lak0.c;
                                } else {
                                    a4xVarO0 = lak0.c;
                                }
                                a4x a4xVar6 = a4xVarO0;
                                if (pf8Var4 != null) {
                                    a4xVarO1 = lak0.c;
                                } else {
                                    a4xVarO1 = lak0.c;
                                }
                                a4x a4xVar7 = a4xVarO1;
                                ovl ovlVar5 = new ovl(lsm0Var2.a(R.string.roleplaying_title, Arrays.copyOf(new Object[0], 0)), str34, kng0.k("/ ", str33));
                                q7n q7nVarR5 = vbw0.R(ctf0Var6, date4, Long.valueOf(j4));
                                if (pf8Var5 == null) {
                                    z9 = true;
                                } else {
                                    z9 = true;
                                }
                                if (pf8Var5 != null) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                uzh uzhVar5 = new uzh(hnlVarN7, strA22, str35, string4, strL5, str38, str40, null, null, a4xVar6, a4xVar7, true, null, null, str7, strA7, 0, ovlVar5, q7nVarR5, new tzh(z9, z10, false, false));
                                hnl hnlVarN9 = nkb.N(c01Var2);
                                iOrdinal2 = nnm0Var.ordinal();
                                if (iOrdinal2 != 0) {
                                    m7m0Var2 = m7m0.f;
                                } else if (iOrdinal2 != 1) {
                                    m7m0Var2 = m7m0.c;
                                } else if (iOrdinal2 != 5) {
                                    m7m0Var2 = m7m0.i;
                                } else {
                                    m7m0Var2 = m7m0.e;
                                }
                                m7m0 m7m0Var15 = m7m0Var2;
                                nw80Var = nw80.b;
                                j = i17;
                                vf8 vf8Var6 = new vf8(i17, j, nw80Var, m7m0Var15, "");
                                listJ = q3d.j(pf8Var4, pf8Var5);
                                iOrdinal3 = nnm0Var.ordinal();
                                if (iOrdinal3 != 0) {
                                    if (iOrdinal3 != 1) {
                                        iOrdinal8 = nnm0Var.ordinal();
                                        if (iOrdinal8 != 0) {
                                            m7m0Var5 = m7m0.f;
                                        } else if (iOrdinal8 != 1) {
                                            m7m0Var5 = m7m0.c;
                                        } else if (iOrdinal8 != 5) {
                                            m7m0Var5 = m7m0.i;
                                        } else {
                                            m7m0Var5 = m7m0.e;
                                        }
                                        vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var5, "");
                                    } else if (iOrdinal3 != 5) {
                                        vf8Var = new vf8(0, j, nw80Var, m7m0.i, "");
                                        str14 = str32;
                                    } else {
                                        iOrdinal9 = nnm0Var.ordinal();
                                        if (iOrdinal9 != 0) {
                                            m7m0Var6 = m7m0.f;
                                        } else if (iOrdinal9 != 1) {
                                            m7m0Var6 = m7m0.c;
                                        } else if (iOrdinal9 != 5) {
                                            m7m0Var6 = m7m0.i;
                                        } else {
                                            m7m0Var6 = m7m0.e;
                                        }
                                        vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var6, "");
                                    }
                                    str14 = str32;
                                    vf8Var2 = vf8Var3;
                                    arrayList8.add(new r11(uzhVar5, hnlVarN9, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var6, vf8Var2, i7));
                                    arrayList7 = arrayList8;
                                    str9 = str31;
                                    str10 = str6;
                                    str11 = str29;
                                    str12 = str210;
                                    it6 = it7;
                                    str13 = str30;
                                    y11Var2 = y11Var6;
                                    q11Var7 = q11Var8;
                                } else {
                                    pf8Var = (pf8) CollectionsKt.firstOrNull(listJ);
                                    if (pf8Var != null) {
                                        pf8Var3 = (pf8) CollectionsKt.firstOrNull(listJ);
                                        if (pf8Var3 != null) {
                                            qp9 qp9Var7 = pf8Var3.e;
                                            qp9Var2 = new qp9(qp9Var7.b, qp9Var7.f29104a, j);
                                            str14 = str32;
                                        } else {
                                            str14 = str32;
                                            qp9Var2 = new qp9(str14, 0, 0L);
                                        }
                                        qp9 qp9Var8 = qp9Var2;
                                        String str43 = pf8Var.f26889a;
                                        List list10 = pf8Var.b;
                                        nw80 nw80Var8 = pf8Var.c;
                                        m7m0 m7m0Var16 = pf8Var.d;
                                        str43.getClass();
                                        list10.getClass();
                                        pf8Var2 = new pf8(str43, list10, nw80Var8, m7m0Var16, qp9Var8);
                                    } else {
                                        str14 = str32;
                                        iun iunVar3 = iun.f15405a;
                                        nw80 nw80Var9 = nw80.t;
                                        iOrdinal4 = nnm0Var.ordinal();
                                        if (iOrdinal4 != 0) {
                                            m7m0Var3 = m7m0.f;
                                        } else if (iOrdinal4 != 1) {
                                            m7m0Var3 = m7m0.c;
                                        } else if (iOrdinal4 != 5) {
                                            m7m0Var3 = m7m0.i;
                                        } else {
                                            m7m0Var3 = m7m0.e;
                                        }
                                        pf8Var2 = new pf8("", iunVar3, nw80Var9, m7m0Var3, new qp9(str14, 0, 0L));
                                    }
                                    iOrdinal5 = ww90Var2.ordinal();
                                    if (iOrdinal5 != 0) {
                                        m7m0Var4 = m7m0.g;
                                    } else if (iOrdinal5 != 1) {
                                        m7m0Var4 = m7m0.f21327a;
                                    } else if (iOrdinal5 != 2) {
                                        m7m0Var4 = m7m0.d;
                                    } else if (iOrdinal5 != 3) {
                                        m7m0Var4 = m7m0.b;
                                    } else if (iOrdinal5 == 4) {
                                        m7m0Var4 = m7m0.i;
                                    } else {
                                        t9f.b();
                                    }
                                    m7m0 m7m0Var17 = m7m0Var4;
                                    iOrdinal6 = ww90Var2.ordinal();
                                    qp9Var = pf8Var2.e;
                                    if (iOrdinal6 != 0) {
                                        az5Var = (az5) CollectionsKt.firstOrNull(pf8Var2.b);
                                        if (az5Var != null) {
                                            i11 = az5Var.f1701a;
                                        } else {
                                            i11 = qp9Var.f29104a;
                                        }
                                        i12 = i11;
                                    } else if (iOrdinal6 != 1) {
                                        i12 = i17;
                                    } else {
                                        i12 = i17;
                                    }
                                    iOrdinal7 = ww90Var2.ordinal();
                                    if (iOrdinal7 == 0) {
                                        if (iOrdinal7 != 1) {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        }
                                        vf8Var = new vf8(i12, j, nw80Var, m7m0Var17, str8);
                                    } else {
                                        strA9 = qp9Var.b;
                                    }
                                    str8 = strA9;
                                    vf8Var = new vf8(i12, j, nw80Var, m7m0Var17, str8);
                                }
                                vf8Var2 = vf8Var;
                                arrayList8.add(new r11(uzhVar5, hnlVarN9, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var6, vf8Var2, i7));
                                arrayList7 = arrayList8;
                                str9 = str31;
                                str10 = str6;
                                str11 = str29;
                                str12 = str210;
                                it6 = it7;
                                str13 = str30;
                                y11Var2 = y11Var6;
                                q11Var7 = q11Var8;
                            }
                            return dyb.r0(arrayList7);
                        }
                        if (Intrinsics.d(b7vVar, a7v.f393a)) {
                            return i4w0.N(q11Var7.t);
                        }
                        t9f.b();
                        return null;
                }
            }
        }, (byte) 20));
        final byte b4 = 4;
        this.s = bkb.G(((fee) n0o0VarH6.getValue()).d, new Function1(this) { // from class: a.x11
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
            /* JADX WARN: Code duplicated, block: B:103:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:106:0x02c9  */
            /* JADX WARN: Code duplicated, block: B:107:0x02db A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:108:0x02dd  */
            /* JADX WARN: Code duplicated, block: B:110:0x02e3  */
            /* JADX WARN: Code duplicated, block: B:112:0x02f3  */
            /* JADX WARN: Code duplicated, block: B:117:0x0306 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:118:0x0308  */
            /* JADX WARN: Code duplicated, block: B:121:0x031a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:122:0x031c  */
            /* JADX WARN: Code duplicated, block: B:123:0x0327  */
            /* JADX WARN: Code duplicated, block: B:135:0x035a  */
            /* JADX WARN: Code duplicated, block: B:147:0x038e  */
            /* JADX WARN: Code duplicated, block: B:153:0x03bb  */
            /* JADX WARN: Code duplicated, block: B:158:0x03c3  */
            /* JADX WARN: Code duplicated, block: B:161:0x03e7  */
            /* JADX WARN: Code duplicated, block: B:163:0x03ea  */
            /* JADX WARN: Code duplicated, block: B:165:0x03ed  */
            /* JADX WARN: Code duplicated, block: B:167:0x03f2  */
            /* JADX WARN: Code duplicated, block: B:168:0x03f5  */
            /* JADX WARN: Code duplicated, block: B:169:0x03f8  */
            /* JADX WARN: Code duplicated, block: B:172:0x0419  */
            /* JADX WARN: Code duplicated, block: B:174:0x041c  */
            /* JADX WARN: Code duplicated, block: B:176:0x041f  */
            /* JADX WARN: Code duplicated, block: B:178:0x0434  */
            /* JADX WARN: Code duplicated, block: B:180:0x043a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:181:0x043c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:182:0x043e  */
            /* JADX WARN: Code duplicated, block: B:184:0x0443  */
            /* JADX WARN: Code duplicated, block: B:185:0x0446  */
            /* JADX WARN: Code duplicated, block: B:186:0x0449  */
            /* JADX WARN: Code duplicated, block: B:189:0x0459  */
            /* JADX WARN: Code duplicated, block: B:191:0x045f  */
            /* JADX WARN: Code duplicated, block: B:193:0x0462  */
            /* JADX WARN: Code duplicated, block: B:195:0x0465  */
            /* JADX WARN: Code duplicated, block: B:197:0x046a  */
            /* JADX WARN: Code duplicated, block: B:198:0x046d  */
            /* JADX WARN: Code duplicated, block: B:199:0x0470  */
            /* JADX WARN: Code duplicated, block: B:201:0x047b  */
            /* JADX WARN: Code duplicated, block: B:203:0x0487  */
            /* JADX WARN: Code duplicated, block: B:205:0x048f  */
            /* JADX WARN: Code duplicated, block: B:207:0x049f  */
            /* JADX WARN: Code duplicated, block: B:209:0x04c6  */
            /* JADX WARN: Code duplicated, block: B:211:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:213:0x04d7  */
            /* JADX WARN: Code duplicated, block: B:215:0x04da  */
            /* JADX WARN: Code duplicated, block: B:217:0x04df  */
            /* JADX WARN: Code duplicated, block: B:218:0x04e2  */
            /* JADX WARN: Code duplicated, block: B:219:0x04e5  */
            /* JADX WARN: Code duplicated, block: B:223:0x04fd  */
            /* JADX WARN: Code duplicated, block: B:225:0x0500  */
            /* JADX WARN: Code duplicated, block: B:227:0x0503  */
            /* JADX WARN: Code duplicated, block: B:229:0x0506  */
            /* JADX WARN: Code duplicated, block: B:231:0x0509  */
            /* JADX WARN: Code duplicated, block: B:234:0x0513  */
            /* JADX WARN: Code duplicated, block: B:235:0x0516  */
            /* JADX WARN: Code duplicated, block: B:236:0x0519  */
            /* JADX WARN: Code duplicated, block: B:237:0x051c  */
            /* JADX WARN: Code duplicated, block: B:240:0x0527  */
            /* JADX WARN: Code duplicated, block: B:245:0x0530  */
            /* JADX WARN: Code duplicated, block: B:246:0x0533  */
            /* JADX WARN: Code duplicated, block: B:248:0x053d  */
            /* JADX WARN: Code duplicated, block: B:250:0x0542  */
            /* JADX WARN: Code duplicated, block: B:253:0x054b  */
            /* JADX WARN: Code duplicated, block: B:265:0x0570  */
            /* JADX WARN: Code duplicated, block: B:266:0x057f  */
            /* JADX WARN: Code duplicated, block: B:468:0x0b96  */
            /* JADX WARN: Code duplicated, block: B:469:0x0bb1  */
            /* JADX WARN: Code duplicated, block: B:471:0x0bbf  */
            /* JADX WARN: Code duplicated, block: B:472:0x0bd0  */
            /* JADX WARN: Code duplicated, block: B:484:0x0be9  */
            /* JADX WARN: Code duplicated, block: B:485:0x0bfb  */
            /* JADX WARN: Code duplicated, block: B:487:0x0bff  */
            /* JADX WARN: Code duplicated, block: B:488:0x0c11  */
            /* JADX WARN: Code duplicated, block: B:491:0x0c46  */
            /* JADX WARN: Code duplicated, block: B:493:0x0c4b  */
            /* JADX WARN: Code duplicated, block: B:495:0x0c4e  */
            /* JADX WARN: Code duplicated, block: B:497:0x0c51  */
            /* JADX WARN: Code duplicated, block: B:499:0x0c54  */
            /* JADX WARN: Code duplicated, block: B:502:0x0c5d  */
            /* JADX WARN: Code duplicated, block: B:503:0x0c61  */
            /* JADX WARN: Code duplicated, block: B:504:0x0c64  */
            /* JADX WARN: Code duplicated, block: B:505:0x0c67  */
            /* JADX WARN: Code duplicated, block: B:508:0x0c7b  */
            /* JADX WARN: Code duplicated, block: B:509:0x0c84  */
            /* JADX WARN: Code duplicated, block: B:511:0x0c8f  */
            /* JADX WARN: Code duplicated, block: B:513:0x0c95  */
            /* JADX WARN: Code duplicated, block: B:514:0x0c96 A[PHI: r15
  0x0c96: PHI (r15v12 int) = (r15v11 int), (r15v17 int) binds: [B:510:0x0c8d, B:513:0x0c95] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:515:0x0c99  */
            /* JADX WARN: Code duplicated, block: B:520:0x0cae  */
            /* JADX WARN: Code duplicated, block: B:525:0x0ce6  */
            /* JADX WARN: Code duplicated, block: B:527:0x0cf9  */
            /* JADX WARN: Code duplicated, block: B:530:0x0d0b  */
            /* JADX WARN: Code duplicated, block: B:531:0x0d0e  */
            /* JADX WARN: Code duplicated, block: B:534:0x0d1c  */
            /* JADX WARN: Code duplicated, block: B:535:0x0d1f  */
            /* JADX WARN: Code duplicated, block: B:537:0x0d2f  */
            /* JADX WARN: Code duplicated, block: B:538:0x0d31  */
            /* JADX WARN: Code duplicated, block: B:540:0x0d37  */
            /* JADX WARN: Code duplicated, block: B:541:0x0d39  */
            /* JADX WARN: Code duplicated, block: B:544:0x0d4e  */
            /* JADX WARN: Code duplicated, block: B:545:0x0d50  */
            /* JADX WARN: Code duplicated, block: B:547:0x0d53  */
            /* JADX WARN: Code duplicated, block: B:549:0x0d57  */
            /* JADX WARN: Code duplicated, block: B:552:0x0d79  */
            /* JADX WARN: Code duplicated, block: B:554:0x0d7e  */
            /* JADX WARN: Code duplicated, block: B:564:0x050e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:579:0x0c57 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y11 y11Var;
                boolean z;
                int i;
                boolean z2;
                String strL;
                String strL2;
                String strA;
                String strA2;
                lsm0 lsm0Var;
                boolean z3;
                int i2;
                StringBuilder sb;
                int iOrdinal;
                int i3;
                String str;
                String str2;
                String strL3;
                int i4;
                int i5;
                char c;
                String strA3;
                lak0 lak0Var;
                i4 i4VarG0;
                String strA4;
                String strValueOf;
                String strM;
                boolean z4;
                boolean z5;
                m7m0 m7m0Var;
                int i6;
                int iA;
                ijl ijlVar;
                String str3;
                String strC;
                boolean z6;
                ot0 ot0Var;
                boolean z7;
                Iterator it;
                String str4;
                boolean z8;
                String strA5;
                pt0 pt0Var;
                n0x n0xVar;
                pt0 pt0Var2;
                sso0 uqo0Var;
                nur murVar;
                ww90 ww90Var;
                int i7;
                String str5;
                String str6;
                int i8;
                char c2;
                int i9;
                String strA6;
                String str7;
                int i10;
                ww90 ww90Var2;
                String strA7;
                String strA8;
                a4x a4xVarO0;
                a4x a4xVarO1;
                boolean z9;
                boolean z10;
                int iOrdinal2;
                m7m0 m7m0Var2;
                nw80 nw80Var;
                long j;
                List listJ;
                int iOrdinal3;
                pf8 pf8Var;
                int iOrdinal4;
                m7m0 m7m0Var3;
                pf8 pf8Var2;
                int iOrdinal5;
                m7m0 m7m0Var4;
                int iOrdinal6;
                qp9 qp9Var;
                az5 az5Var;
                int i11;
                int i12;
                int iOrdinal7;
                String strA9;
                String str8;
                vf8 vf8Var;
                pf8 pf8Var3;
                qp9 qp9Var2;
                vf8 vf8Var2;
                int iOrdinal8;
                m7m0 m7m0Var5;
                vf8 vf8Var3;
                int iOrdinal9;
                m7m0 m7m0Var6;
                List list;
                List list2;
                byte b5 = b4;
                String str9 = Separators.SP;
                String str10 = "static/img/android/casino/alt_design/aggregator_gift_card/";
                String str11 = "Background_Picture";
                String str12 = "Background_Illustration";
                String str13 = "Ticket_Secondary";
                String str14 = "";
                y11 y11Var2 = this.b;
                switch (b5) {
                    case 0:
                        y11 y11Var3 = y11Var2;
                        String str15 = "static/img/android/casino/alt_design/aggregator_gift_card/";
                        q11 q11Var2 = (q11) y11Var3.z;
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        m7v m7vVar = (m7v) feeVar.c();
                        if (m7vVar instanceof k7v) {
                            ArrayList arrayList = ((k7v) m7vVar).f17842a;
                            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                n65 n65Var = (n65) it2.next();
                                c01 c01Var = q11Var2.t;
                                ctf0 ctf0Var2 = y11Var3.b;
                                n65Var.getClass();
                                int i13 = n65Var.c;
                                ctf0Var2.getClass();
                                dqs dqsVar = n65Var.e;
                                String str16 = dqsVar.d;
                                long j2 = n65Var.d.f44639a;
                                int i14 = n65Var.b;
                                Iterator it3 = it2;
                                if (i13 == i14) {
                                    y11Var = y11Var3;
                                    z = n65Var.l == na90.PAYMENT_AFTER_DEPOSIT;
                                    Date date3 = new Date(j2);
                                    if (z) {
                                        String str113 = n65Var.k;
                                        pn40 pn40Var5 = pn40.f27267a;
                                        i = 2;
                                        z2 = true;
                                        strL = kng0.l(str113, Separators.SP, pn40.j(n65Var.j, 2, true));
                                    } else {
                                        i = 2;
                                        z2 = true;
                                        strL = null;
                                    }
                                    if (z != 0) {
                                        String str114 = n65Var.i;
                                        pn40 pn40Var6 = pn40.f27267a;
                                        strL2 = kng0.l(str114, Separators.SP, pn40.j(n65Var.h, i, z2));
                                    } else {
                                        strL2 = null;
                                    }
                                    boolean z11 = (strL != null || strL.length() == 0) && (strL2 == null || strL2.length() == 0);
                                    if (z != 0) {
                                        strA = ctf0Var2.b.a(R.string.win_sum_title, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        strA = null;
                                    }
                                    if (z != 0) {
                                        strA2 = ctf0Var2.b.a(R.string.deposit_sum_title, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        strA2 = null;
                                    }
                                    lsm0Var = ctf0Var2.b;
                                    String strA16 = lsm0Var.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
                                    q11 q11Var5 = q11Var2;
                                    z3 = z11;
                                    i2 = (int) n65Var.f22979a;
                                    hnl hnlVarN5 = nkb.N(c01Var);
                                    String strA17 = lsm0Var.a(R.string.free_spins_title, Arrays.copyOf(new Object[0], 0));
                                    sb = new StringBuilder(ujn.h);
                                    iOrdinal = c01Var.ordinal();
                                    if (iOrdinal != 0) {
                                        i3 = i2;
                                        if (iOrdinal != 1) {
                                            str = "Background_Illustration";
                                        } else if (iOrdinal != 2) {
                                            str = "";
                                        } else if (iOrdinal != 3) {
                                            str = "Ticket_Primary";
                                        } else if (iOrdinal == 4) {
                                            str = "Ticket_Secondary";
                                        } else {
                                            t9f.b();
                                        }
                                    } else {
                                        i3 = i2;
                                        str = "Background_Picture";
                                    }
                                    str2 = str15;
                                    strL3 = kng0.l(str2, str, "_Spin.webp");
                                    if (strL3.length() == 0) {
                                        i4 = 0;
                                        sb.setLength(0);
                                        str15 = str2;
                                    } else {
                                        str15 = str2;
                                        i4 = 0;
                                        if (StringsKt.O(strL3, ujn.h, false)) {
                                            sb.setLength(i4);
                                            sb.append(strL3);
                                        } else if (kotlin.text.c.x(strL3, "https://", false)) {
                                            i4 = 0;
                                            sb.setLength(i4);
                                            sb.append(strL3);
                                        } else {
                                            if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                i5 = 1;
                                                c = '/';
                                            } else {
                                                sb.append('/');
                                                c = '/';
                                                i5 = 1;
                                            }
                                            char[] cArr3 = new char[i5];
                                            i4 = 0;
                                            cArr3[0] = c;
                                            sb.append(StringsKt.y0(strL3, cArr3));
                                        }
                                    }
                                    String string3 = sb.toString();
                                    String str115 = strA16 + Separators.SP + i14;
                                    String strA18 = lsm0Var.a(R.string.for_games_title, Arrays.copyOf(new Object[i4], i4));
                                    if (z != 0) {
                                        strA3 = lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[i4], i4));
                                    } else {
                                        strA3 = lsm0Var.a(R.string.play_button, Arrays.copyOf(new Object[i4], i4));
                                    }
                                    String str22 = strA3;
                                    lak0Var = lak0.c;
                                    if (z != 0) {
                                        i4VarG0 = lak0Var;
                                    } else {
                                        i4VarG0 = dyb.g0(str16);
                                    }
                                    if (z != 0) {
                                        strA4 = "";
                                    } else {
                                        strA4 = lsm0Var.a(R.string.spins_title, Arrays.copyOf(new Object[0], 0));
                                    }
                                    if (z != 0) {
                                        strValueOf = null;
                                    } else {
                                        strValueOf = String.valueOf(i13);
                                    }
                                    if (z) {
                                        strM = null;
                                    } else {
                                        strM = twn.m(i14, " / ");
                                    }
                                    ovl ovlVar3 = new ovl(strA4, strValueOf, strM);
                                    q7n q7nVarR3 = vbw0.R(ctf0Var2, date3, Long.valueOf(j2));
                                    if (strA != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (strA2 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    uzh uzhVar3 = new uzh(hnlVarN5, strA17, "", string3, str115, "", strA18, strA, strA2, lak0Var, i4VarG0, false, strL, strL2, "", str22, 12, ovlVar3, q7nVarR3, new tzh(true, false, z4, z5));
                                    hnl hnlVarN6 = nkb.N(c01Var);
                                    nw80 nw80Var4 = nw80.b;
                                    if (z3) {
                                        m7m0Var = m7m0.g;
                                    } else {
                                        m7m0Var = m7m0.h;
                                    }
                                    arrayList2.add(new r11(uzhVar3, hnlVarN6, null, null, null, new vf8(dqsVar.c, n65Var.f22979a, nw80Var4, m7m0Var, str16), i3));
                                    it2 = it3;
                                    q11Var2 = q11Var5;
                                    y11Var3 = y11Var;
                                } else {
                                    y11Var = y11Var3;
                                }
                                Date date4 = new Date(j2);
                                if (z) {
                                    String str116 = n65Var.k;
                                    pn40 pn40Var7 = pn40.f27267a;
                                    i = 2;
                                    z2 = true;
                                    strL = kng0.l(str116, Separators.SP, pn40.j(n65Var.j, 2, true));
                                } else {
                                    i = 2;
                                    z2 = true;
                                    strL = null;
                                }
                                if (z != 0) {
                                    String str117 = n65Var.i;
                                    pn40 pn40Var8 = pn40.f27267a;
                                    strL2 = kng0.l(str117, Separators.SP, pn40.j(n65Var.h, i, z2));
                                } else {
                                    strL2 = null;
                                }
                                if (strL != null) {
                                }
                                if (z != 0) {
                                    strA = ctf0Var2.b.a(R.string.win_sum_title, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA = null;
                                }
                                if (z != 0) {
                                    strA2 = ctf0Var2.b.a(R.string.deposit_sum_title, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA2 = null;
                                }
                                lsm0Var = ctf0Var2.b;
                                String strA19 = lsm0Var.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
                                q11 q11Var6 = q11Var2;
                                z3 = z11;
                                i2 = (int) n65Var.f22979a;
                                hnl hnlVarN7 = nkb.N(c01Var);
                                String strA110 = lsm0Var.a(R.string.free_spins_title, Arrays.copyOf(new Object[0], 0));
                                sb = new StringBuilder(ujn.h);
                                iOrdinal = c01Var.ordinal();
                                if (iOrdinal != 0) {
                                    i3 = i2;
                                    if (iOrdinal != 1) {
                                        str = "Background_Illustration";
                                    } else if (iOrdinal != 2) {
                                        str = "";
                                    } else if (iOrdinal != 3) {
                                        str = "Ticket_Primary";
                                    } else if (iOrdinal == 4) {
                                        str = "Ticket_Secondary";
                                    } else {
                                        t9f.b();
                                    }
                                } else {
                                    i3 = i2;
                                    str = "Background_Picture";
                                }
                                str2 = str15;
                                strL3 = kng0.l(str2, str, "_Spin.webp");
                                if (strL3.length() == 0) {
                                    i4 = 0;
                                    sb.setLength(0);
                                    str15 = str2;
                                } else {
                                    str15 = str2;
                                    i4 = 0;
                                    if (StringsKt.O(strL3, ujn.h, false)) {
                                        sb.setLength(i4);
                                        sb.append(strL3);
                                    } else if (kotlin.text.c.x(strL3, "https://", false)) {
                                        i4 = 0;
                                        sb.setLength(i4);
                                        sb.append(strL3);
                                    } else {
                                        if (sb.length() > 0) {
                                            i5 = 1;
                                            c = '/';
                                        } else {
                                            i5 = 1;
                                            c = '/';
                                        }
                                        char[] cArr4 = new char[i5];
                                        i4 = 0;
                                        cArr4[0] = c;
                                        sb.append(StringsKt.y0(strL3, cArr4));
                                    }
                                }
                                String string4 = sb.toString();
                                String str118 = strA19 + Separators.SP + i14;
                                String strA111 = lsm0Var.a(R.string.for_games_title, Arrays.copyOf(new Object[i4], i4));
                                if (z != 0) {
                                    strA3 = lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[i4], i4));
                                } else {
                                    strA3 = lsm0Var.a(R.string.play_button, Arrays.copyOf(new Object[i4], i4));
                                }
                                String str23 = strA3;
                                lak0Var = lak0.c;
                                if (z != 0) {
                                    i4VarG0 = lak0Var;
                                } else {
                                    i4VarG0 = dyb.g0(str16);
                                }
                                if (z != 0) {
                                    strA4 = "";
                                } else {
                                    strA4 = lsm0Var.a(R.string.spins_title, Arrays.copyOf(new Object[0], 0));
                                }
                                if (z != 0) {
                                    strValueOf = null;
                                } else {
                                    strValueOf = String.valueOf(i13);
                                }
                                if (z) {
                                    strM = null;
                                } else {
                                    strM = twn.m(i14, " / ");
                                }
                                ovl ovlVar4 = new ovl(strA4, strValueOf, strM);
                                q7n q7nVarR4 = vbw0.R(ctf0Var2, date4, Long.valueOf(j2));
                                if (strA != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (strA2 != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                uzh uzhVar4 = new uzh(hnlVarN7, strA110, "", string4, str118, "", strA111, strA, strA2, lak0Var, i4VarG0, false, strL, strL2, "", str23, 12, ovlVar4, q7nVarR4, new tzh(true, false, z4, z5));
                                hnl hnlVarN8 = nkb.N(c01Var);
                                nw80 nw80Var5 = nw80.b;
                                if (z3) {
                                    m7m0Var = m7m0.g;
                                } else {
                                    m7m0Var = m7m0.h;
                                }
                                arrayList2.add(new r11(uzhVar4, hnlVarN8, null, null, null, new vf8(dqsVar.c, n65Var.f22979a, nw80Var5, m7m0Var, str16), i3));
                                it2 = it3;
                                q11Var2 = q11Var6;
                                y11Var3 = y11Var;
                            }
                            return dyb.r0(arrayList2);
                        }
                        if (Intrinsics.d(m7vVar, l7v.f19578a)) {
                            return i4w0.N(q11Var2.t);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        g7v g7vVar = (g7v) feeVar2.c();
                        if (!(g7vVar instanceof e7v)) {
                            if (Intrinsics.d(g7vVar, f7v.f9076a)) {
                                zcl zclVar = qmk.f28987a;
                                return new h7v(new gyl(null, s5x0.t(0.0f, 8.0f, 1), 1));
                            }
                            t9f.b();
                            return null;
                        }
                        if (((a4x) ((fee) y11Var2.x.getValue()).b()).size() + ((a4x) ((fee) y11Var2.w.getValue()).b()).size() <= 0) {
                            return i7v.f14312a;
                        }
                        a4x<y6v> a4xVar = ((e7v) g7vVar).f7345a;
                        ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar, 10));
                        for (y6v y6vVar : a4xVar) {
                            ctf0 ctf0Var3 = y11Var2.b;
                            d7v d7vVar = (d7v) ((fee) y11Var2.k.getValue()).c();
                            y6vVar.getClass();
                            d7v d7vVar2 = y6vVar.f42119a;
                            ctf0Var3.getClass();
                            d7vVar.getClass();
                            long jOrdinal = d7vVar2.ordinal();
                            int iOrdinal10 = d7vVar2.ordinal();
                            if (iOrdinal10 == 0) {
                                i6 = R.string.all;
                            } else if (iOrdinal10 == 1) {
                                i6 = R.string.bonuses_title;
                            } else {
                                if (iOrdinal10 != 2) {
                                    t9f.b();
                                    return null;
                                }
                                i6 = R.string.free_spins_title;
                            }
                            xxl xxlVar = new xxl(ctf0Var3.b.a(i6, Arrays.copyOf(new Object[0], 0)));
                            uxl uxlVar = d7vVar2 == d7vVar ? uxl.b : uxl.f36445a;
                            int i15 = y6vVar.b;
                            arrayList3.add(new lxl(jOrdinal, (dyl) xxlVar, false, uxlVar, i15 != 0 ? new cwl(new rpe(i15)) : null, 76));
                        }
                        return new h7v(new fyl(dyb.r0(arrayList3), null, null, s5x0.t(0.0f, 0.0f, 3), null, 22));
                    case 2:
                        int iIntValue = ((Integer) obj).intValue();
                        boolean z12 = ((q11) y11Var2.z).v;
                        int iIntValue2 = ((Number) ((fee) y11Var2.t.getValue()).b()).intValue();
                        if (z12) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.j;
                            xuzVar.getClass();
                            iA = xuz.a(pb10Var, iIntValue);
                        } else {
                            xuz xuzVar2 = pb10.c;
                            pb10 pb10Var2 = pb10.i;
                            xuzVar2.getClass();
                            iA = xuz.a(pb10Var2, iIntValue);
                        }
                        return new mdm(iA, null, null, 0, 0, iIntValue2, 0, 0, 0L, 0L, 990);
                    case 3:
                        ((fee) obj).getClass();
                        fee feeVar3 = (fee) y11Var2.c.getValue();
                        ctf0 ctf0Var4 = y11Var2.b;
                        if (!((Boolean) feeVar3.c()).booleanValue()) {
                            return new zc(ctf0Var4.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) y11Var2.d.getValue()).c();
                        kg kgVar = ((q11) y11Var2.z).u;
                        kgVar.getClass();
                        int iOrdinal11 = kgVar.ordinal();
                        if (iOrdinal11 == 0) {
                            ijlVar = ijl.f14880a;
                        } else if (iOrdinal11 == 1) {
                            ijlVar = ijl.b;
                        } else if (iOrdinal11 == 2) {
                            ijlVar = ijl.c;
                        } else if (iOrdinal11 == 3) {
                            ijlVar = ijl.d;
                        } else {
                            if (iOrdinal11 != 4) {
                                t9f.b();
                                return null;
                            }
                            ijlVar = ijl.e;
                        }
                        if (ql5Var != null) {
                            String strA112 = ql5Var.j;
                            if (ijlVar == ijl.b) {
                                strA112 = ctf0Var4.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA112.length() <= 0) {
                                strA112 = ql5Var.k;
                            }
                            str3 = strA112;
                        } else {
                            str3 = null;
                        }
                        String str24 = str3 == null ? "" : str3;
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var9 = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str25 = strC == null ? "" : strC;
                        String str26 = ql5Var != null ? ql5Var.f : null;
                        String str27 = str26 == null ? "" : str26;
                        String strA113 = ctf0Var4.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        return new xc(ijlVar, new jjl(str25, str27, strA113, str24, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())));
                    case 4:
                        n0o0 n0o0Var = y11Var2.w;
                        n0o0 n0o0Var2 = y11Var2.x;
                        d7v d7vVar3 = (d7v) obj;
                        d7vVar3.getClass();
                        int iOrdinal12 = d7vVar3.ordinal();
                        if (iOrdinal12 == 0) {
                            return CollectionsKt.q0((Collection) ((fee) n0o0Var.getValue()).b(), (Iterable) ((fee) n0o0Var2.getValue()).b());
                        }
                        if (iOrdinal12 == 1) {
                            return (List) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal12 == 2) {
                            return (List) ((fee) n0o0Var2.getValue()).b();
                        }
                        t9f.b();
                        return null;
                    case 5:
                        ((Unit) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(((q11) y11Var2.z).r, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    case 6:
                        y11 y11Var4 = y11Var2;
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        Iterable iterable = (Iterable) feeVar4.c();
                        ArrayList arrayList4 = new ArrayList(r3d.q(iterable, 10));
                        Iterator it4 = iterable.iterator();
                        while (it4.hasNext()) {
                            j8b j8bVar = (j8b) it4.next();
                            y11 y11Var5 = y11Var4;
                            ctf0 ctf0Var5 = y11Var5.b;
                            boolean zBooleanValue = ((Boolean) ((fee) y11Var5.c.getValue()).c()).booleanValue();
                            q11 q11Var7 = (q11) y11Var5.z;
                            boolean z13 = q11Var7.v;
                            ot0 ot0Var2 = q11Var7.x;
                            Set set = (Set) ((fee) y11Var5.f.getValue()).c();
                            j8bVar.getClass();
                            ctf0Var5.getClass();
                            set.getClass();
                            List<mlr> list3 = j8bVar.c;
                            ArrayList arrayList5 = new ArrayList(r3d.q(list3, 10));
                            for (mlr mlrVar : list3) {
                                Set set2 = set;
                                if ((set2 instanceof Collection) && set2.isEmpty()) {
                                    z6 = zBooleanValue;
                                    ot0Var = ot0Var2;
                                    z7 = false;
                                } else {
                                    Iterator it5 = set2.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            z6 = zBooleanValue;
                                            ot0Var = ot0Var2;
                                            if (((Number) it5.next()).longValue() == mlrVar.f22006a) {
                                                z7 = true;
                                            } else {
                                                zBooleanValue = z6;
                                                ot0Var2 = ot0Var;
                                            }
                                        } else {
                                            z6 = zBooleanValue;
                                            ot0Var = ot0Var2;
                                            z7 = false;
                                        }
                                    }
                                }
                                pt0 pt0VarG0 = x4d0.g0(ot0Var);
                                Integer numValueOf = Integer.valueOf((int) j8bVar.f16074a);
                                mlrVar.getClass();
                                boolean z14 = mlrVar.k;
                                int i16 = z13 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                boolean z15 = mlrVar.j;
                                if (z14) {
                                    it = it4;
                                    str4 = str14;
                                    z8 = z13;
                                    strA5 = ctf0Var5.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    it = it4;
                                    str4 = str14;
                                    z8 = z13;
                                    strA5 = z15 ? ctf0Var5.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : str4;
                                }
                                Set set3 = set;
                                long j3 = mlrVar.f22006a;
                                String str28 = mlrVar.f;
                                String str29 = mlrVar.e;
                                mtr mtrVar = new mtr(z6 ? z7 ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, z7);
                                n0x n0xVar2 = new n0x(mlrVar.g);
                                m0x m0xVar = new m0x(i16, null, 6);
                                if (strA5.length() == 0) {
                                    murVar = lur.f20686a;
                                    n0xVar = n0xVar2;
                                } else {
                                    pt0 pt0Var3 = pt0.f27539a;
                                    if ((pt0VarG0 == pt0Var3 && z14) || (pt0VarG0 == (pt0Var = pt0.c) && z14)) {
                                        n0xVar = n0xVar2;
                                    } else {
                                        n0xVar = n0xVar2;
                                        pt0 pt0Var4 = pt0.d;
                                        if (pt0VarG0 != pt0Var4 || !z14) {
                                            if ((pt0VarG0 == pt0Var3 && z15) || ((pt0VarG0 == pt0Var && z15) || (pt0VarG0 == pt0Var4 && z15))) {
                                                d4d d4dVar = d4d.PRIMARY;
                                                uqo0Var = new eqo0();
                                            } else {
                                                pt0 pt0Var5 = pt0.b;
                                                uqo0Var = ((pt0VarG0 == pt0Var5 && z14) || (pt0VarG0 == (pt0Var2 = pt0.e) && z14)) ? kro0.f18776a : ((pt0VarG0 == pt0Var5 && z15) || (pt0VarG0 == pt0Var2 && z15)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                            }
                                        }
                                        murVar = new mur(strA5, uqo0Var);
                                    }
                                    d4d d4dVar2 = d4d.PRIMARY;
                                    uqo0Var = new lro0();
                                    murVar = new mur(strA5, uqo0Var);
                                }
                                arrayList5.add(new st0(j3, str28, str29, mtrVar, n0xVar, m0xVar, numValueOf, murVar));
                                zBooleanValue = z6;
                                ot0Var2 = ot0Var;
                                it4 = it;
                                z13 = z8;
                                set = set3;
                                str14 = str4;
                            }
                            arrayList4.add(new h4r0(j8bVar.f16074a, j8bVar.d, j8bVar.b, new hjm(j8bVar.b, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var5.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166), new zll(x4d0.g0(ot0Var2), new wll(o0s.f24443a), arrayList5)));
                            y11Var4 = y11Var5;
                            it4 = it4;
                            str14 = str14;
                        }
                        return dyb.r0(arrayList4);
                    default:
                        q11 q11Var8 = (q11) y11Var2.z;
                        fee feeVar5 = (fee) obj;
                        feeVar5.getClass();
                        b7v b7vVar = (b7v) feeVar5.c();
                        if (b7vVar instanceof z6v) {
                            ArrayList arrayList6 = ((z6v) b7vVar).f43888a;
                            ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                            Iterator it6 = arrayList6.iterator();
                            while (it6.hasNext()) {
                                e65 e65Var = (e65) it6.next();
                                c01 c01Var2 = q11Var8.t;
                                ctf0 ctf0Var6 = y11Var2.b;
                                e65Var.getClass();
                                ArrayList arrayList8 = arrayList7;
                                double d2 = e65Var.b;
                                ctf0Var6.getClass();
                                List list4 = e65Var.k;
                                String str210 = str11;
                                String str211 = str12;
                                long j4 = e65Var.g.f44639a;
                                List list5 = e65Var.o;
                                List list6 = e65Var.n;
                                int i17 = e65Var.f7264a;
                                Iterator it7 = it6;
                                gom0 gom0Var = e65Var.i;
                                String str30 = str13;
                                List list7 = e65Var.l;
                                y11 y11Var6 = y11Var2;
                                if (list4.size() == 1) {
                                    ww90Var = ww90.f39878a;
                                } else if (list4.size() > 1) {
                                    ww90Var = ww90.b;
                                } else if (list6.isEmpty() || !list7.isEmpty()) {
                                    ww90Var = (list7.isEmpty() && list5.isEmpty()) ? ww90.c : ww90.d;
                                } else {
                                    ww90Var = ww90.b;
                                }
                                ArrayList arrayList9 = new ArrayList();
                                q11 q11Var9 = q11Var8;
                                ww90 ww90Var3 = ww90Var;
                                String str31 = str9;
                                lsm0 lsm0Var2 = ctf0Var6.b;
                                String strA114 = lsm0Var2.a(R.string.for_games_title, Arrays.copyOf(new Object[0], 0));
                                m7m0 m7m0Var7 = m7m0.f21327a;
                                if (!list4.isEmpty()) {
                                    arrayList9.add(new pf8(strA114, list4, nw80.t, m7m0Var7, new qp9(str14, i17, i17)));
                                }
                                String strA115 = lsm0Var2.a(R.string.for_unavailable_games_title, Arrays.copyOf(new Object[0], 0));
                                if (!list6.isEmpty()) {
                                    arrayList9.add(new pf8(strA115, list6, nw80.t, m7m0Var7, new qp9(str14, i17, i17)));
                                }
                                pf8 pf8Var4 = (pf8) CollectionsKt.firstOrNull(arrayList9);
                                ArrayList arrayList10 = new ArrayList();
                                String strA20 = lsm0Var2.a(R.string.for_providers_title, Arrays.copyOf(new Object[0], 0));
                                m7m0 m7m0Var8 = m7m0.b;
                                if (!list7.isEmpty()) {
                                    arrayList10.add(new pf8(strA20, list7, nw80.t, m7m0Var8, new qp9(str14, i17, i17)));
                                }
                                String strA21 = lsm0Var2.a(R.string.for_unavailable_providers_title, Arrays.copyOf(new Object[0], 0));
                                if (!list5.isEmpty()) {
                                    arrayList10.add(new pf8(strA21, list5, nw80.t, m7m0Var8, new qp9(str14, i17, i17)));
                                }
                                pf8 pf8Var5 = (pf8) CollectionsKt.firstOrNull(arrayList10);
                                double d3 = ((double) e65Var.e) * d2;
                                String str32 = str14;
                                DecimalFormat decimalFormat = new DecimalFormat("0.##", DecimalFormatSymbols.getInstance(Locale.US));
                                String str33 = decimalFormat.format(d3);
                                String str34 = decimalFormat.format(e65Var.d);
                                Date date5 = new Date(j4);
                                int i18 = e65Var.f7264a;
                                hnl hnlVarN9 = nkb.N(c01Var2);
                                String strA22 = lsm0Var2.a(R.string.bonus_amount_title, Arrays.copyOf(new Object[0], 0));
                                nnm0 nnm0Var = gom0Var.f11638a;
                                String strA23 = lsm0Var2.a(R.string.bonus_active, Arrays.copyOf(new Object[0], 0));
                                nnm0 nnm0Var2 = nnm0.ACTIVE;
                                if (nnm0Var != nnm0Var2) {
                                    strA23 = null;
                                }
                                String str35 = strA23 == null ? str32 : strA23;
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                int iOrdinal13 = c01Var2.ordinal();
                                if (iOrdinal13 != 0) {
                                    i7 = i18;
                                    if (iOrdinal13 == 1) {
                                        str5 = str211;
                                    } else if (iOrdinal13 == 2) {
                                        str5 = str32;
                                    } else if (iOrdinal13 == 3) {
                                        str5 = "Ticket_Primery";
                                    } else if (iOrdinal13 == 4) {
                                        str5 = str30;
                                    } else {
                                        t9f.b();
                                    }
                                } else {
                                    i7 = i18;
                                    str5 = str210;
                                }
                                String strL4 = kng0.l(str10, str5, "_Bonus.webp");
                                if (strL4.length() == 0) {
                                    sb2.setLength(0);
                                    str6 = str10;
                                } else {
                                    str6 = str10;
                                    int i19 = 0;
                                    if (StringsKt.O(strL4, ujn.h, false)) {
                                        sb2.setLength(i19);
                                        sb2.append(strL4);
                                    } else if (kotlin.text.c.x(strL4, "https://", false)) {
                                        i19 = 0;
                                        sb2.setLength(i19);
                                        sb2.append(strL4);
                                    } else {
                                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                            i8 = 1;
                                            c2 = '/';
                                        } else {
                                            sb2.append('/');
                                            c2 = '/';
                                            i8 = 1;
                                        }
                                        char[] cArr5 = new char[i8];
                                        cArr5[0] = c2;
                                        sb2.append(StringsKt.y0(strL4, cArr5));
                                    }
                                }
                                String string5 = sb2.toString();
                                String str36 = e65Var.c;
                                pn40 pn40Var10 = pn40.f27267a;
                                String strL5 = kng0.l(str36, str31, pn40.c(d2, p3u0.c));
                                String str37 = pf8Var5 != null ? pf8Var5.f26889a : null;
                                String str38 = str37 == null ? str32 : str37;
                                String str39 = pf8Var4 != null ? pf8Var4.f26889a : null;
                                String str40 = str39 == null ? str32 : str39;
                                int iOrdinal14 = nnm0Var.ordinal();
                                if (iOrdinal14 != 0) {
                                    if (iOrdinal14 != 5) {
                                        str7 = str32;
                                        i9 = 0;
                                    } else {
                                        i9 = 0;
                                        strA6 = lsm0Var2.a(R.string.resume, Arrays.copyOf(new Object[0], 0));
                                    }
                                    if (nnm0Var == nnm0Var2) {
                                        i10 = 1;
                                    } else {
                                        i10 = i9;
                                    }
                                    if (nnm0Var == nnm0.READY) {
                                        strA7 = lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[i9], i9));
                                        ww90Var2 = ww90Var3;
                                    } else {
                                        if (i10 != 0) {
                                            ww90Var2 = ww90Var3;
                                            if (ww90Var2 == ww90.f39878a) {
                                                strA8 = lsm0Var2.a(R.string.play_button, Arrays.copyOf(new Object[i9], i9));
                                            }
                                            strA7 = strA8;
                                        } else {
                                            ww90Var2 = ww90Var3;
                                        }
                                        if (i10 == 0 && ww90Var2 == ww90.b) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        } else if (i10 == 0 && ww90Var2 == ww90.d) {
                                            strA8 = lsm0Var2.a(R.string.all_providers, Arrays.copyOf(new Object[i9], i9));
                                        } else if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        } else {
                                            strA7 = str32;
                                        }
                                        strA7 = strA8;
                                    }
                                    if (pf8Var5 != null || (list2 = pf8Var5.b) == null) {
                                        a4xVarO0 = lak0.c;
                                    } else {
                                        ArrayList arrayList11 = new ArrayList(r3d.q(list2, 10));
                                        Iterator it8 = list2.iterator();
                                        while (it8.hasNext()) {
                                            arrayList11.add(((az5) it8.next()).b);
                                        }
                                        a4xVarO0 = dyb.o0(arrayList11);
                                        if (a4xVarO0 == null) {
                                            a4xVarO0 = lak0.c;
                                        }
                                    }
                                    a4x a4xVar6 = a4xVarO0;
                                    if (pf8Var4 != null || (list = pf8Var4.b) == null) {
                                        a4xVarO1 = lak0.c;
                                    } else {
                                        ArrayList arrayList12 = new ArrayList(r3d.q(list, 10));
                                        Iterator it9 = list.iterator();
                                        while (it9.hasNext()) {
                                            arrayList12.add(((az5) it9.next()).b);
                                        }
                                        a4xVarO1 = dyb.o0(arrayList12);
                                        if (a4xVarO1 == null) {
                                            a4xVarO1 = lak0.c;
                                        }
                                    }
                                    a4x a4xVar7 = a4xVarO1;
                                    ovl ovlVar5 = new ovl(lsm0Var2.a(R.string.roleplaying_title, Arrays.copyOf(new Object[0], 0)), str34, kng0.k("/ ", str33));
                                    q7n q7nVarR5 = vbw0.R(ctf0Var6, date5, Long.valueOf(j4));
                                    if (pf8Var5 == null || pf8Var4 != null) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (pf8Var5 != null || pf8Var4 == null) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    uzh uzhVar5 = new uzh(hnlVarN9, strA22, str35, string5, strL5, str38, str40, null, null, a4xVar6, a4xVar7, true, null, null, str7, strA7, 0, ovlVar5, q7nVarR5, new tzh(z9, z10, false, false));
                                    hnl hnlVarN10 = nkb.N(c01Var2);
                                    iOrdinal2 = nnm0Var.ordinal();
                                    if (iOrdinal2 != 0) {
                                        m7m0Var2 = m7m0.f;
                                    } else if (iOrdinal2 != 1) {
                                        m7m0Var2 = m7m0.c;
                                    } else if (iOrdinal2 != 5) {
                                        m7m0Var2 = m7m0.i;
                                    } else {
                                        m7m0Var2 = m7m0.e;
                                    }
                                    m7m0 m7m0Var15 = m7m0Var2;
                                    nw80Var = nw80.b;
                                    j = i17;
                                    vf8 vf8Var6 = new vf8(i17, j, nw80Var, m7m0Var15, "");
                                    listJ = q3d.j(pf8Var4, pf8Var5);
                                    iOrdinal3 = nnm0Var.ordinal();
                                    if (iOrdinal3 != 0) {
                                        if (iOrdinal3 != 1) {
                                            iOrdinal8 = nnm0Var.ordinal();
                                            if (iOrdinal8 != 0) {
                                                m7m0Var5 = m7m0.f;
                                            } else if (iOrdinal8 != 1) {
                                                m7m0Var5 = m7m0.c;
                                            } else if (iOrdinal8 != 5) {
                                                m7m0Var5 = m7m0.i;
                                            } else {
                                                m7m0Var5 = m7m0.e;
                                            }
                                            vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var5, "");
                                        } else if (iOrdinal3 != 5) {
                                            vf8Var = new vf8(0, j, nw80Var, m7m0.i, "");
                                            str14 = str32;
                                        } else {
                                            iOrdinal9 = nnm0Var.ordinal();
                                            if (iOrdinal9 != 0) {
                                                m7m0Var6 = m7m0.f;
                                            } else if (iOrdinal9 != 1) {
                                                m7m0Var6 = m7m0.c;
                                            } else if (iOrdinal9 != 5) {
                                                m7m0Var6 = m7m0.i;
                                            } else {
                                                m7m0Var6 = m7m0.e;
                                            }
                                            vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var6, "");
                                        }
                                        str14 = str32;
                                        vf8Var2 = vf8Var3;
                                        arrayList8.add(new r11(uzhVar5, hnlVarN10, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var6, vf8Var2, i7));
                                        arrayList7 = arrayList8;
                                        str9 = str31;
                                        str10 = str6;
                                        str11 = str210;
                                        str12 = str211;
                                        it6 = it7;
                                        str13 = str30;
                                        y11Var2 = y11Var6;
                                        q11Var8 = q11Var9;
                                    } else {
                                        pf8Var = (pf8) CollectionsKt.firstOrNull(listJ);
                                        if (pf8Var != null) {
                                            pf8Var3 = (pf8) CollectionsKt.firstOrNull(listJ);
                                            if (pf8Var3 != null) {
                                                qp9 qp9Var7 = pf8Var3.e;
                                                qp9Var2 = new qp9(qp9Var7.b, qp9Var7.f29104a, j);
                                                str14 = str32;
                                            } else {
                                                str14 = str32;
                                                qp9Var2 = new qp9(str14, 0, 0L);
                                            }
                                            qp9 qp9Var8 = qp9Var2;
                                            String str43 = pf8Var.f26889a;
                                            List list10 = pf8Var.b;
                                            nw80 nw80Var8 = pf8Var.c;
                                            m7m0 m7m0Var16 = pf8Var.d;
                                            str43.getClass();
                                            list10.getClass();
                                            pf8Var2 = new pf8(str43, list10, nw80Var8, m7m0Var16, qp9Var8);
                                        } else {
                                            str14 = str32;
                                            iun iunVar3 = iun.f15405a;
                                            nw80 nw80Var9 = nw80.t;
                                            iOrdinal4 = nnm0Var.ordinal();
                                            if (iOrdinal4 != 0) {
                                                m7m0Var3 = m7m0.f;
                                            } else if (iOrdinal4 != 1) {
                                                m7m0Var3 = m7m0.c;
                                            } else if (iOrdinal4 != 5) {
                                                m7m0Var3 = m7m0.i;
                                            } else {
                                                m7m0Var3 = m7m0.e;
                                            }
                                            pf8Var2 = new pf8("", iunVar3, nw80Var9, m7m0Var3, new qp9(str14, 0, 0L));
                                        }
                                        iOrdinal5 = ww90Var2.ordinal();
                                        if (iOrdinal5 != 0) {
                                            m7m0Var4 = m7m0.g;
                                        } else if (iOrdinal5 != 1) {
                                            m7m0Var4 = m7m0.f21327a;
                                        } else if (iOrdinal5 != 2) {
                                            m7m0Var4 = m7m0.d;
                                        } else if (iOrdinal5 != 3) {
                                            m7m0Var4 = m7m0.b;
                                        } else if (iOrdinal5 == 4) {
                                            m7m0Var4 = m7m0.i;
                                        } else {
                                            t9f.b();
                                        }
                                        m7m0 m7m0Var17 = m7m0Var4;
                                        iOrdinal6 = ww90Var2.ordinal();
                                        qp9Var = pf8Var2.e;
                                        if (iOrdinal6 != 0) {
                                            az5Var = (az5) CollectionsKt.firstOrNull(pf8Var2.b);
                                            if (az5Var != null) {
                                                i11 = az5Var.f1701a;
                                            } else {
                                                i11 = qp9Var.f29104a;
                                            }
                                            i12 = i11;
                                        } else if (iOrdinal6 != 1 || iOrdinal6 == 3) {
                                            i12 = i17;
                                        } else {
                                            i12 = 0;
                                        }
                                        iOrdinal7 = ww90Var2.ordinal();
                                        if (iOrdinal7 == 0) {
                                            strA9 = qp9Var.b;
                                        } else if (iOrdinal7 != 1 || iOrdinal7 == 2) {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            if (iOrdinal7 == 3) {
                                                strA9 = lsm0Var2.a(R.string.all_providers, Arrays.copyOf(new Object[0], 0));
                                            } else if (iOrdinal7 == 4) {
                                                str8 = str14;
                                            } else {
                                                t9f.b();
                                            }
                                            vf8Var = new vf8(i12, j, nw80Var, m7m0Var17, str8);
                                        }
                                        str8 = strA9;
                                        vf8Var = new vf8(i12, j, nw80Var, m7m0Var17, str8);
                                    }
                                    vf8Var2 = vf8Var;
                                    arrayList8.add(new r11(uzhVar5, hnlVarN10, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var6, vf8Var2, i7));
                                    arrayList7 = arrayList8;
                                    str9 = str31;
                                    str10 = str6;
                                    str11 = str210;
                                    str12 = str211;
                                    it6 = it7;
                                    str13 = str30;
                                    y11Var2 = y11Var6;
                                    q11Var8 = q11Var9;
                                } else {
                                    i9 = 0;
                                    strA6 = lsm0Var2.a(R.string.suspend, Arrays.copyOf(new Object[0], 0));
                                }
                                str7 = strA6;
                                if (nnm0Var == nnm0Var2) {
                                    i10 = 1;
                                } else {
                                    i10 = i9;
                                }
                                if (nnm0Var == nnm0.READY) {
                                    strA7 = lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[i9], i9));
                                    ww90Var2 = ww90Var3;
                                } else {
                                    if (i10 != 0) {
                                        ww90Var2 = ww90Var3;
                                        if (ww90Var2 == ww90.f39878a) {
                                            strA8 = lsm0Var2.a(R.string.play_button, Arrays.copyOf(new Object[i9], i9));
                                        }
                                        strA7 = strA8;
                                    } else {
                                        ww90Var2 = ww90Var3;
                                    }
                                    if (i10 == 0) {
                                        if (i10 == 0) {
                                            if (i10 != 0) {
                                                strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                                strA7 = strA8;
                                            } else {
                                                strA7 = str32;
                                            }
                                        } else if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                            strA7 = strA8;
                                        } else {
                                            strA7 = str32;
                                        }
                                    } else if (i10 == 0) {
                                        if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                            strA7 = strA8;
                                        } else {
                                            strA7 = str32;
                                        }
                                    } else if (i10 != 0) {
                                        strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        strA7 = strA8;
                                    } else {
                                        strA7 = str32;
                                    }
                                }
                                if (pf8Var5 != null) {
                                    a4xVarO0 = lak0.c;
                                } else {
                                    a4xVarO0 = lak0.c;
                                }
                                a4x a4xVar8 = a4xVarO0;
                                if (pf8Var4 != null) {
                                    a4xVarO1 = lak0.c;
                                } else {
                                    a4xVarO1 = lak0.c;
                                }
                                a4x a4xVar9 = a4xVarO1;
                                ovl ovlVar6 = new ovl(lsm0Var2.a(R.string.roleplaying_title, Arrays.copyOf(new Object[0], 0)), str34, kng0.k("/ ", str33));
                                q7n q7nVarR6 = vbw0.R(ctf0Var6, date5, Long.valueOf(j4));
                                if (pf8Var5 == null) {
                                    z9 = true;
                                } else {
                                    z9 = true;
                                }
                                if (pf8Var5 != null) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                uzh uzhVar6 = new uzh(hnlVarN9, strA22, str35, string5, strL5, str38, str40, null, null, a4xVar8, a4xVar9, true, null, null, str7, strA7, 0, ovlVar6, q7nVarR6, new tzh(z9, z10, false, false));
                                hnl hnlVarN11 = nkb.N(c01Var2);
                                iOrdinal2 = nnm0Var.ordinal();
                                if (iOrdinal2 != 0) {
                                    m7m0Var2 = m7m0.f;
                                } else if (iOrdinal2 != 1) {
                                    m7m0Var2 = m7m0.c;
                                } else if (iOrdinal2 != 5) {
                                    m7m0Var2 = m7m0.i;
                                } else {
                                    m7m0Var2 = m7m0.e;
                                }
                                m7m0 m7m0Var18 = m7m0Var2;
                                nw80Var = nw80.b;
                                j = i17;
                                vf8 vf8Var7 = new vf8(i17, j, nw80Var, m7m0Var18, "");
                                listJ = q3d.j(pf8Var4, pf8Var5);
                                iOrdinal3 = nnm0Var.ordinal();
                                if (iOrdinal3 != 0) {
                                    if (iOrdinal3 != 1) {
                                        iOrdinal8 = nnm0Var.ordinal();
                                        if (iOrdinal8 != 0) {
                                            m7m0Var5 = m7m0.f;
                                        } else if (iOrdinal8 != 1) {
                                            m7m0Var5 = m7m0.c;
                                        } else if (iOrdinal8 != 5) {
                                            m7m0Var5 = m7m0.i;
                                        } else {
                                            m7m0Var5 = m7m0.e;
                                        }
                                        vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var5, "");
                                    } else if (iOrdinal3 != 5) {
                                        vf8Var = new vf8(0, j, nw80Var, m7m0.i, "");
                                        str14 = str32;
                                    } else {
                                        iOrdinal9 = nnm0Var.ordinal();
                                        if (iOrdinal9 != 0) {
                                            m7m0Var6 = m7m0.f;
                                        } else if (iOrdinal9 != 1) {
                                            m7m0Var6 = m7m0.c;
                                        } else if (iOrdinal9 != 5) {
                                            m7m0Var6 = m7m0.i;
                                        } else {
                                            m7m0Var6 = m7m0.e;
                                        }
                                        vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var6, "");
                                    }
                                    str14 = str32;
                                    vf8Var2 = vf8Var3;
                                    arrayList8.add(new r11(uzhVar6, hnlVarN11, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var7, vf8Var2, i7));
                                    arrayList7 = arrayList8;
                                    str9 = str31;
                                    str10 = str6;
                                    str11 = str210;
                                    str12 = str211;
                                    it6 = it7;
                                    str13 = str30;
                                    y11Var2 = y11Var6;
                                    q11Var8 = q11Var9;
                                } else {
                                    pf8Var = (pf8) CollectionsKt.firstOrNull(listJ);
                                    if (pf8Var != null) {
                                        pf8Var3 = (pf8) CollectionsKt.firstOrNull(listJ);
                                        if (pf8Var3 != null) {
                                            qp9 qp9Var9 = pf8Var3.e;
                                            qp9Var2 = new qp9(qp9Var9.b, qp9Var9.f29104a, j);
                                            str14 = str32;
                                        } else {
                                            str14 = str32;
                                            qp9Var2 = new qp9(str14, 0, 0L);
                                        }
                                        qp9 qp9Var10 = qp9Var2;
                                        String str44 = pf8Var.f26889a;
                                        List list11 = pf8Var.b;
                                        nw80 nw80Var10 = pf8Var.c;
                                        m7m0 m7m0Var19 = pf8Var.d;
                                        str44.getClass();
                                        list11.getClass();
                                        pf8Var2 = new pf8(str44, list11, nw80Var10, m7m0Var19, qp9Var10);
                                    } else {
                                        str14 = str32;
                                        iun iunVar4 = iun.f15405a;
                                        nw80 nw80Var11 = nw80.t;
                                        iOrdinal4 = nnm0Var.ordinal();
                                        if (iOrdinal4 != 0) {
                                            m7m0Var3 = m7m0.f;
                                        } else if (iOrdinal4 != 1) {
                                            m7m0Var3 = m7m0.c;
                                        } else if (iOrdinal4 != 5) {
                                            m7m0Var3 = m7m0.i;
                                        } else {
                                            m7m0Var3 = m7m0.e;
                                        }
                                        pf8Var2 = new pf8("", iunVar4, nw80Var11, m7m0Var3, new qp9(str14, 0, 0L));
                                    }
                                    iOrdinal5 = ww90Var2.ordinal();
                                    if (iOrdinal5 != 0) {
                                        m7m0Var4 = m7m0.g;
                                    } else if (iOrdinal5 != 1) {
                                        m7m0Var4 = m7m0.f21327a;
                                    } else if (iOrdinal5 != 2) {
                                        m7m0Var4 = m7m0.d;
                                    } else if (iOrdinal5 != 3) {
                                        m7m0Var4 = m7m0.b;
                                    } else if (iOrdinal5 == 4) {
                                        m7m0Var4 = m7m0.i;
                                    } else {
                                        t9f.b();
                                    }
                                    m7m0 m7m0Var110 = m7m0Var4;
                                    iOrdinal6 = ww90Var2.ordinal();
                                    qp9Var = pf8Var2.e;
                                    if (iOrdinal6 != 0) {
                                        az5Var = (az5) CollectionsKt.firstOrNull(pf8Var2.b);
                                        if (az5Var != null) {
                                            i11 = az5Var.f1701a;
                                        } else {
                                            i11 = qp9Var.f29104a;
                                        }
                                        i12 = i11;
                                    } else if (iOrdinal6 != 1) {
                                        i12 = i17;
                                    } else {
                                        i12 = i17;
                                    }
                                    iOrdinal7 = ww90Var2.ordinal();
                                    if (iOrdinal7 == 0) {
                                        if (iOrdinal7 != 1) {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        }
                                        vf8Var = new vf8(i12, j, nw80Var, m7m0Var110, str8);
                                    } else {
                                        strA9 = qp9Var.b;
                                    }
                                    str8 = strA9;
                                    vf8Var = new vf8(i12, j, nw80Var, m7m0Var110, str8);
                                }
                                vf8Var2 = vf8Var;
                                arrayList8.add(new r11(uzhVar6, hnlVarN11, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var7, vf8Var2, i7));
                                arrayList7 = arrayList8;
                                str9 = str31;
                                str10 = str6;
                                str11 = str210;
                                str12 = str211;
                                it6 = it7;
                                str13 = str30;
                                y11Var2 = y11Var6;
                                q11Var8 = q11Var9;
                            }
                            return dyb.r0(arrayList7);
                        }
                        if (Intrinsics.d(b7vVar, a7v.f393a)) {
                            return i4w0.N(q11Var8.t);
                        }
                        t9f.b();
                        return null;
                }
            }
        });
        this.t = bkb.G(((fee) n0o0VarH6.getValue()).d, new eo0((byte) 13));
        final byte b5 = 5;
        this.u = maz.b(new yw9(Unit.f46060a, new Function1(this) { // from class: a.x11
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
            /* JADX WARN: Code duplicated, block: B:103:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:106:0x02c9  */
            /* JADX WARN: Code duplicated, block: B:107:0x02db A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:108:0x02dd  */
            /* JADX WARN: Code duplicated, block: B:110:0x02e3  */
            /* JADX WARN: Code duplicated, block: B:112:0x02f3  */
            /* JADX WARN: Code duplicated, block: B:117:0x0306 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:118:0x0308  */
            /* JADX WARN: Code duplicated, block: B:121:0x031a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:122:0x031c  */
            /* JADX WARN: Code duplicated, block: B:123:0x0327  */
            /* JADX WARN: Code duplicated, block: B:135:0x035a  */
            /* JADX WARN: Code duplicated, block: B:147:0x038e  */
            /* JADX WARN: Code duplicated, block: B:153:0x03bb  */
            /* JADX WARN: Code duplicated, block: B:158:0x03c3  */
            /* JADX WARN: Code duplicated, block: B:161:0x03e7  */
            /* JADX WARN: Code duplicated, block: B:163:0x03ea  */
            /* JADX WARN: Code duplicated, block: B:165:0x03ed  */
            /* JADX WARN: Code duplicated, block: B:167:0x03f2  */
            /* JADX WARN: Code duplicated, block: B:168:0x03f5  */
            /* JADX WARN: Code duplicated, block: B:169:0x03f8  */
            /* JADX WARN: Code duplicated, block: B:172:0x0419  */
            /* JADX WARN: Code duplicated, block: B:174:0x041c  */
            /* JADX WARN: Code duplicated, block: B:176:0x041f  */
            /* JADX WARN: Code duplicated, block: B:178:0x0434  */
            /* JADX WARN: Code duplicated, block: B:180:0x043a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:181:0x043c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:182:0x043e  */
            /* JADX WARN: Code duplicated, block: B:184:0x0443  */
            /* JADX WARN: Code duplicated, block: B:185:0x0446  */
            /* JADX WARN: Code duplicated, block: B:186:0x0449  */
            /* JADX WARN: Code duplicated, block: B:189:0x0459  */
            /* JADX WARN: Code duplicated, block: B:191:0x045f  */
            /* JADX WARN: Code duplicated, block: B:193:0x0462  */
            /* JADX WARN: Code duplicated, block: B:195:0x0465  */
            /* JADX WARN: Code duplicated, block: B:197:0x046a  */
            /* JADX WARN: Code duplicated, block: B:198:0x046d  */
            /* JADX WARN: Code duplicated, block: B:199:0x0470  */
            /* JADX WARN: Code duplicated, block: B:201:0x047b  */
            /* JADX WARN: Code duplicated, block: B:203:0x0487  */
            /* JADX WARN: Code duplicated, block: B:205:0x048f  */
            /* JADX WARN: Code duplicated, block: B:207:0x049f  */
            /* JADX WARN: Code duplicated, block: B:209:0x04c6  */
            /* JADX WARN: Code duplicated, block: B:211:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:213:0x04d7  */
            /* JADX WARN: Code duplicated, block: B:215:0x04da  */
            /* JADX WARN: Code duplicated, block: B:217:0x04df  */
            /* JADX WARN: Code duplicated, block: B:218:0x04e2  */
            /* JADX WARN: Code duplicated, block: B:219:0x04e5  */
            /* JADX WARN: Code duplicated, block: B:223:0x04fd  */
            /* JADX WARN: Code duplicated, block: B:225:0x0500  */
            /* JADX WARN: Code duplicated, block: B:227:0x0503  */
            /* JADX WARN: Code duplicated, block: B:229:0x0506  */
            /* JADX WARN: Code duplicated, block: B:231:0x0509  */
            /* JADX WARN: Code duplicated, block: B:234:0x0513  */
            /* JADX WARN: Code duplicated, block: B:235:0x0516  */
            /* JADX WARN: Code duplicated, block: B:236:0x0519  */
            /* JADX WARN: Code duplicated, block: B:237:0x051c  */
            /* JADX WARN: Code duplicated, block: B:240:0x0527  */
            /* JADX WARN: Code duplicated, block: B:245:0x0530  */
            /* JADX WARN: Code duplicated, block: B:246:0x0533  */
            /* JADX WARN: Code duplicated, block: B:248:0x053d  */
            /* JADX WARN: Code duplicated, block: B:250:0x0542  */
            /* JADX WARN: Code duplicated, block: B:253:0x054b  */
            /* JADX WARN: Code duplicated, block: B:265:0x0570  */
            /* JADX WARN: Code duplicated, block: B:266:0x057f  */
            /* JADX WARN: Code duplicated, block: B:468:0x0b96  */
            /* JADX WARN: Code duplicated, block: B:469:0x0bb1  */
            /* JADX WARN: Code duplicated, block: B:471:0x0bbf  */
            /* JADX WARN: Code duplicated, block: B:472:0x0bd0  */
            /* JADX WARN: Code duplicated, block: B:484:0x0be9  */
            /* JADX WARN: Code duplicated, block: B:485:0x0bfb  */
            /* JADX WARN: Code duplicated, block: B:487:0x0bff  */
            /* JADX WARN: Code duplicated, block: B:488:0x0c11  */
            /* JADX WARN: Code duplicated, block: B:491:0x0c46  */
            /* JADX WARN: Code duplicated, block: B:493:0x0c4b  */
            /* JADX WARN: Code duplicated, block: B:495:0x0c4e  */
            /* JADX WARN: Code duplicated, block: B:497:0x0c51  */
            /* JADX WARN: Code duplicated, block: B:499:0x0c54  */
            /* JADX WARN: Code duplicated, block: B:502:0x0c5d  */
            /* JADX WARN: Code duplicated, block: B:503:0x0c61  */
            /* JADX WARN: Code duplicated, block: B:504:0x0c64  */
            /* JADX WARN: Code duplicated, block: B:505:0x0c67  */
            /* JADX WARN: Code duplicated, block: B:508:0x0c7b  */
            /* JADX WARN: Code duplicated, block: B:509:0x0c84  */
            /* JADX WARN: Code duplicated, block: B:511:0x0c8f  */
            /* JADX WARN: Code duplicated, block: B:513:0x0c95  */
            /* JADX WARN: Code duplicated, block: B:514:0x0c96 A[PHI: r15
  0x0c96: PHI (r15v12 int) = (r15v11 int), (r15v17 int) binds: [B:510:0x0c8d, B:513:0x0c95] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:515:0x0c99  */
            /* JADX WARN: Code duplicated, block: B:520:0x0cae  */
            /* JADX WARN: Code duplicated, block: B:525:0x0ce6  */
            /* JADX WARN: Code duplicated, block: B:527:0x0cf9  */
            /* JADX WARN: Code duplicated, block: B:530:0x0d0b  */
            /* JADX WARN: Code duplicated, block: B:531:0x0d0e  */
            /* JADX WARN: Code duplicated, block: B:534:0x0d1c  */
            /* JADX WARN: Code duplicated, block: B:535:0x0d1f  */
            /* JADX WARN: Code duplicated, block: B:537:0x0d2f  */
            /* JADX WARN: Code duplicated, block: B:538:0x0d31  */
            /* JADX WARN: Code duplicated, block: B:540:0x0d37  */
            /* JADX WARN: Code duplicated, block: B:541:0x0d39  */
            /* JADX WARN: Code duplicated, block: B:544:0x0d4e  */
            /* JADX WARN: Code duplicated, block: B:545:0x0d50  */
            /* JADX WARN: Code duplicated, block: B:547:0x0d53  */
            /* JADX WARN: Code duplicated, block: B:549:0x0d57  */
            /* JADX WARN: Code duplicated, block: B:552:0x0d79  */
            /* JADX WARN: Code duplicated, block: B:554:0x0d7e  */
            /* JADX WARN: Code duplicated, block: B:564:0x050e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:579:0x0c57 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y11 y11Var;
                boolean z;
                int i;
                boolean z2;
                String strL;
                String strL2;
                String strA;
                String strA2;
                lsm0 lsm0Var;
                boolean z3;
                int i2;
                StringBuilder sb;
                int iOrdinal;
                int i3;
                String str;
                String str2;
                String strL3;
                int i4;
                int i5;
                char c;
                String strA3;
                lak0 lak0Var;
                i4 i4VarG0;
                String strA4;
                String strValueOf;
                String strM;
                boolean z4;
                boolean z5;
                m7m0 m7m0Var;
                int i6;
                int iA;
                ijl ijlVar;
                String str3;
                String strC;
                boolean z6;
                ot0 ot0Var;
                boolean z7;
                Iterator it;
                String str4;
                boolean z8;
                String strA5;
                pt0 pt0Var;
                n0x n0xVar;
                pt0 pt0Var2;
                sso0 uqo0Var;
                nur murVar;
                ww90 ww90Var;
                int i7;
                String str5;
                String str6;
                int i8;
                char c2;
                int i9;
                String strA6;
                String str7;
                int i10;
                ww90 ww90Var2;
                String strA7;
                String strA8;
                a4x a4xVarO0;
                a4x a4xVarO1;
                boolean z9;
                boolean z10;
                int iOrdinal2;
                m7m0 m7m0Var2;
                nw80 nw80Var;
                long j;
                List listJ;
                int iOrdinal3;
                pf8 pf8Var;
                int iOrdinal4;
                m7m0 m7m0Var3;
                pf8 pf8Var2;
                int iOrdinal5;
                m7m0 m7m0Var4;
                int iOrdinal6;
                qp9 qp9Var;
                az5 az5Var;
                int i11;
                int i12;
                int iOrdinal7;
                String strA9;
                String str8;
                vf8 vf8Var;
                pf8 pf8Var3;
                qp9 qp9Var2;
                vf8 vf8Var2;
                int iOrdinal8;
                m7m0 m7m0Var5;
                vf8 vf8Var3;
                int iOrdinal9;
                m7m0 m7m0Var6;
                List list;
                List list2;
                byte b6 = b5;
                String str9 = Separators.SP;
                String str10 = "static/img/android/casino/alt_design/aggregator_gift_card/";
                String str11 = "Background_Picture";
                String str12 = "Background_Illustration";
                String str13 = "Ticket_Secondary";
                String str14 = "";
                y11 y11Var2 = this.b;
                switch (b6) {
                    case 0:
                        y11 y11Var3 = y11Var2;
                        String str15 = "static/img/android/casino/alt_design/aggregator_gift_card/";
                        q11 q11Var2 = (q11) y11Var3.z;
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        m7v m7vVar = (m7v) feeVar.c();
                        if (m7vVar instanceof k7v) {
                            ArrayList arrayList = ((k7v) m7vVar).f17842a;
                            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                n65 n65Var = (n65) it2.next();
                                c01 c01Var = q11Var2.t;
                                ctf0 ctf0Var2 = y11Var3.b;
                                n65Var.getClass();
                                int i13 = n65Var.c;
                                ctf0Var2.getClass();
                                dqs dqsVar = n65Var.e;
                                String str16 = dqsVar.d;
                                long j2 = n65Var.d.f44639a;
                                int i14 = n65Var.b;
                                Iterator it3 = it2;
                                if (i13 == i14) {
                                    y11Var = y11Var3;
                                    z = n65Var.l == na90.PAYMENT_AFTER_DEPOSIT;
                                    Date date4 = new Date(j2);
                                    if (z) {
                                        String str116 = n65Var.k;
                                        pn40 pn40Var7 = pn40.f27267a;
                                        i = 2;
                                        z2 = true;
                                        strL = kng0.l(str116, Separators.SP, pn40.j(n65Var.j, 2, true));
                                    } else {
                                        i = 2;
                                        z2 = true;
                                        strL = null;
                                    }
                                    if (z != 0) {
                                        String str117 = n65Var.i;
                                        pn40 pn40Var8 = pn40.f27267a;
                                        strL2 = kng0.l(str117, Separators.SP, pn40.j(n65Var.h, i, z2));
                                    } else {
                                        strL2 = null;
                                    }
                                    boolean z11 = (strL != null || strL.length() == 0) && (strL2 == null || strL2.length() == 0);
                                    if (z != 0) {
                                        strA = ctf0Var2.b.a(R.string.win_sum_title, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        strA = null;
                                    }
                                    if (z != 0) {
                                        strA2 = ctf0Var2.b.a(R.string.deposit_sum_title, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        strA2 = null;
                                    }
                                    lsm0Var = ctf0Var2.b;
                                    String strA19 = lsm0Var.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
                                    q11 q11Var6 = q11Var2;
                                    z3 = z11;
                                    i2 = (int) n65Var.f22979a;
                                    hnl hnlVarN7 = nkb.N(c01Var);
                                    String strA110 = lsm0Var.a(R.string.free_spins_title, Arrays.copyOf(new Object[0], 0));
                                    sb = new StringBuilder(ujn.h);
                                    iOrdinal = c01Var.ordinal();
                                    if (iOrdinal != 0) {
                                        i3 = i2;
                                        if (iOrdinal != 1) {
                                            str = "Background_Illustration";
                                        } else if (iOrdinal != 2) {
                                            str = "";
                                        } else if (iOrdinal != 3) {
                                            str = "Ticket_Primary";
                                        } else if (iOrdinal == 4) {
                                            str = "Ticket_Secondary";
                                        } else {
                                            t9f.b();
                                        }
                                    } else {
                                        i3 = i2;
                                        str = "Background_Picture";
                                    }
                                    str2 = str15;
                                    strL3 = kng0.l(str2, str, "_Spin.webp");
                                    if (strL3.length() == 0) {
                                        i4 = 0;
                                        sb.setLength(0);
                                        str15 = str2;
                                    } else {
                                        str15 = str2;
                                        i4 = 0;
                                        if (StringsKt.O(strL3, ujn.h, false)) {
                                            sb.setLength(i4);
                                            sb.append(strL3);
                                        } else if (kotlin.text.c.x(strL3, "https://", false)) {
                                            i4 = 0;
                                            sb.setLength(i4);
                                            sb.append(strL3);
                                        } else {
                                            if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                i5 = 1;
                                                c = '/';
                                            } else {
                                                sb.append('/');
                                                c = '/';
                                                i5 = 1;
                                            }
                                            char[] cArr4 = new char[i5];
                                            i4 = 0;
                                            cArr4[0] = c;
                                            sb.append(StringsKt.y0(strL3, cArr4));
                                        }
                                    }
                                    String string4 = sb.toString();
                                    String str118 = strA19 + Separators.SP + i14;
                                    String strA111 = lsm0Var.a(R.string.for_games_title, Arrays.copyOf(new Object[i4], i4));
                                    if (z != 0) {
                                        strA3 = lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[i4], i4));
                                    } else {
                                        strA3 = lsm0Var.a(R.string.play_button, Arrays.copyOf(new Object[i4], i4));
                                    }
                                    String str23 = strA3;
                                    lak0Var = lak0.c;
                                    if (z != 0) {
                                        i4VarG0 = lak0Var;
                                    } else {
                                        i4VarG0 = dyb.g0(str16);
                                    }
                                    if (z != 0) {
                                        strA4 = "";
                                    } else {
                                        strA4 = lsm0Var.a(R.string.spins_title, Arrays.copyOf(new Object[0], 0));
                                    }
                                    if (z != 0) {
                                        strValueOf = null;
                                    } else {
                                        strValueOf = String.valueOf(i13);
                                    }
                                    if (z) {
                                        strM = null;
                                    } else {
                                        strM = twn.m(i14, " / ");
                                    }
                                    ovl ovlVar4 = new ovl(strA4, strValueOf, strM);
                                    q7n q7nVarR4 = vbw0.R(ctf0Var2, date4, Long.valueOf(j2));
                                    if (strA != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (strA2 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    uzh uzhVar4 = new uzh(hnlVarN7, strA110, "", string4, str118, "", strA111, strA, strA2, lak0Var, i4VarG0, false, strL, strL2, "", str23, 12, ovlVar4, q7nVarR4, new tzh(true, false, z4, z5));
                                    hnl hnlVarN8 = nkb.N(c01Var);
                                    nw80 nw80Var5 = nw80.b;
                                    if (z3) {
                                        m7m0Var = m7m0.g;
                                    } else {
                                        m7m0Var = m7m0.h;
                                    }
                                    arrayList2.add(new r11(uzhVar4, hnlVarN8, null, null, null, new vf8(dqsVar.c, n65Var.f22979a, nw80Var5, m7m0Var, str16), i3));
                                    it2 = it3;
                                    q11Var2 = q11Var6;
                                    y11Var3 = y11Var;
                                } else {
                                    y11Var = y11Var3;
                                }
                                Date date5 = new Date(j2);
                                if (z) {
                                    String str119 = n65Var.k;
                                    pn40 pn40Var9 = pn40.f27267a;
                                    i = 2;
                                    z2 = true;
                                    strL = kng0.l(str119, Separators.SP, pn40.j(n65Var.j, 2, true));
                                } else {
                                    i = 2;
                                    z2 = true;
                                    strL = null;
                                }
                                if (z != 0) {
                                    String str1110 = n65Var.i;
                                    pn40 pn40Var10 = pn40.f27267a;
                                    strL2 = kng0.l(str1110, Separators.SP, pn40.j(n65Var.h, i, z2));
                                } else {
                                    strL2 = null;
                                }
                                if (strL != null) {
                                }
                                if (z != 0) {
                                    strA = ctf0Var2.b.a(R.string.win_sum_title, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA = null;
                                }
                                if (z != 0) {
                                    strA2 = ctf0Var2.b.a(R.string.deposit_sum_title, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA2 = null;
                                }
                                lsm0Var = ctf0Var2.b;
                                String strA112 = lsm0Var.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
                                q11 q11Var7 = q11Var2;
                                z3 = z11;
                                i2 = (int) n65Var.f22979a;
                                hnl hnlVarN9 = nkb.N(c01Var);
                                String strA113 = lsm0Var.a(R.string.free_spins_title, Arrays.copyOf(new Object[0], 0));
                                sb = new StringBuilder(ujn.h);
                                iOrdinal = c01Var.ordinal();
                                if (iOrdinal != 0) {
                                    i3 = i2;
                                    if (iOrdinal != 1) {
                                        str = "Background_Illustration";
                                    } else if (iOrdinal != 2) {
                                        str = "";
                                    } else if (iOrdinal != 3) {
                                        str = "Ticket_Primary";
                                    } else if (iOrdinal == 4) {
                                        str = "Ticket_Secondary";
                                    } else {
                                        t9f.b();
                                    }
                                } else {
                                    i3 = i2;
                                    str = "Background_Picture";
                                }
                                str2 = str15;
                                strL3 = kng0.l(str2, str, "_Spin.webp");
                                if (strL3.length() == 0) {
                                    i4 = 0;
                                    sb.setLength(0);
                                    str15 = str2;
                                } else {
                                    str15 = str2;
                                    i4 = 0;
                                    if (StringsKt.O(strL3, ujn.h, false)) {
                                        sb.setLength(i4);
                                        sb.append(strL3);
                                    } else if (kotlin.text.c.x(strL3, "https://", false)) {
                                        i4 = 0;
                                        sb.setLength(i4);
                                        sb.append(strL3);
                                    } else {
                                        if (sb.length() > 0) {
                                            i5 = 1;
                                            c = '/';
                                        } else {
                                            i5 = 1;
                                            c = '/';
                                        }
                                        char[] cArr5 = new char[i5];
                                        i4 = 0;
                                        cArr5[0] = c;
                                        sb.append(StringsKt.y0(strL3, cArr5));
                                    }
                                }
                                String string5 = sb.toString();
                                String str1111 = strA112 + Separators.SP + i14;
                                String strA114 = lsm0Var.a(R.string.for_games_title, Arrays.copyOf(new Object[i4], i4));
                                if (z != 0) {
                                    strA3 = lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[i4], i4));
                                } else {
                                    strA3 = lsm0Var.a(R.string.play_button, Arrays.copyOf(new Object[i4], i4));
                                }
                                String str24 = strA3;
                                lak0Var = lak0.c;
                                if (z != 0) {
                                    i4VarG0 = lak0Var;
                                } else {
                                    i4VarG0 = dyb.g0(str16);
                                }
                                if (z != 0) {
                                    strA4 = "";
                                } else {
                                    strA4 = lsm0Var.a(R.string.spins_title, Arrays.copyOf(new Object[0], 0));
                                }
                                if (z != 0) {
                                    strValueOf = null;
                                } else {
                                    strValueOf = String.valueOf(i13);
                                }
                                if (z) {
                                    strM = null;
                                } else {
                                    strM = twn.m(i14, " / ");
                                }
                                ovl ovlVar5 = new ovl(strA4, strValueOf, strM);
                                q7n q7nVarR5 = vbw0.R(ctf0Var2, date5, Long.valueOf(j2));
                                if (strA != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (strA2 != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                uzh uzhVar5 = new uzh(hnlVarN9, strA113, "", string5, str1111, "", strA114, strA, strA2, lak0Var, i4VarG0, false, strL, strL2, "", str24, 12, ovlVar5, q7nVarR5, new tzh(true, false, z4, z5));
                                hnl hnlVarN10 = nkb.N(c01Var);
                                nw80 nw80Var6 = nw80.b;
                                if (z3) {
                                    m7m0Var = m7m0.g;
                                } else {
                                    m7m0Var = m7m0.h;
                                }
                                arrayList2.add(new r11(uzhVar5, hnlVarN10, null, null, null, new vf8(dqsVar.c, n65Var.f22979a, nw80Var6, m7m0Var, str16), i3));
                                it2 = it3;
                                q11Var2 = q11Var7;
                                y11Var3 = y11Var;
                            }
                            return dyb.r0(arrayList2);
                        }
                        if (Intrinsics.d(m7vVar, l7v.f19578a)) {
                            return i4w0.N(q11Var2.t);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        g7v g7vVar = (g7v) feeVar2.c();
                        if (!(g7vVar instanceof e7v)) {
                            if (Intrinsics.d(g7vVar, f7v.f9076a)) {
                                zcl zclVar = qmk.f28987a;
                                return new h7v(new gyl(null, s5x0.t(0.0f, 8.0f, 1), 1));
                            }
                            t9f.b();
                            return null;
                        }
                        if (((a4x) ((fee) y11Var2.x.getValue()).b()).size() + ((a4x) ((fee) y11Var2.w.getValue()).b()).size() <= 0) {
                            return i7v.f14312a;
                        }
                        a4x<y6v> a4xVar = ((e7v) g7vVar).f7345a;
                        ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar, 10));
                        for (y6v y6vVar : a4xVar) {
                            ctf0 ctf0Var3 = y11Var2.b;
                            d7v d7vVar = (d7v) ((fee) y11Var2.k.getValue()).c();
                            y6vVar.getClass();
                            d7v d7vVar2 = y6vVar.f42119a;
                            ctf0Var3.getClass();
                            d7vVar.getClass();
                            long jOrdinal = d7vVar2.ordinal();
                            int iOrdinal10 = d7vVar2.ordinal();
                            if (iOrdinal10 == 0) {
                                i6 = R.string.all;
                            } else if (iOrdinal10 == 1) {
                                i6 = R.string.bonuses_title;
                            } else {
                                if (iOrdinal10 != 2) {
                                    t9f.b();
                                    return null;
                                }
                                i6 = R.string.free_spins_title;
                            }
                            xxl xxlVar = new xxl(ctf0Var3.b.a(i6, Arrays.copyOf(new Object[0], 0)));
                            uxl uxlVar = d7vVar2 == d7vVar ? uxl.b : uxl.f36445a;
                            int i15 = y6vVar.b;
                            arrayList3.add(new lxl(jOrdinal, (dyl) xxlVar, false, uxlVar, i15 != 0 ? new cwl(new rpe(i15)) : null, 76));
                        }
                        return new h7v(new fyl(dyb.r0(arrayList3), null, null, s5x0.t(0.0f, 0.0f, 3), null, 22));
                    case 2:
                        int iIntValue = ((Integer) obj).intValue();
                        boolean z12 = ((q11) y11Var2.z).v;
                        int iIntValue2 = ((Number) ((fee) y11Var2.t.getValue()).b()).intValue();
                        if (z12) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.j;
                            xuzVar.getClass();
                            iA = xuz.a(pb10Var, iIntValue);
                        } else {
                            xuz xuzVar2 = pb10.c;
                            pb10 pb10Var2 = pb10.i;
                            xuzVar2.getClass();
                            iA = xuz.a(pb10Var2, iIntValue);
                        }
                        return new mdm(iA, null, null, 0, 0, iIntValue2, 0, 0, 0L, 0L, 990);
                    case 3:
                        ((fee) obj).getClass();
                        fee feeVar3 = (fee) y11Var2.c.getValue();
                        ctf0 ctf0Var4 = y11Var2.b;
                        if (!((Boolean) feeVar3.c()).booleanValue()) {
                            return new zc(ctf0Var4.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) y11Var2.d.getValue()).c();
                        kg kgVar = ((q11) y11Var2.z).u;
                        kgVar.getClass();
                        int iOrdinal11 = kgVar.ordinal();
                        if (iOrdinal11 == 0) {
                            ijlVar = ijl.f14880a;
                        } else if (iOrdinal11 == 1) {
                            ijlVar = ijl.b;
                        } else if (iOrdinal11 == 2) {
                            ijlVar = ijl.c;
                        } else if (iOrdinal11 == 3) {
                            ijlVar = ijl.d;
                        } else {
                            if (iOrdinal11 != 4) {
                                t9f.b();
                                return null;
                            }
                            ijlVar = ijl.e;
                        }
                        if (ql5Var != null) {
                            String strA115 = ql5Var.j;
                            if (ijlVar == ijl.b) {
                                strA115 = ctf0Var4.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA115.length() <= 0) {
                                strA115 = ql5Var.k;
                            }
                            str3 = strA115;
                        } else {
                            str3 = null;
                        }
                        String str25 = str3 == null ? "" : str3;
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var11 = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str26 = strC == null ? "" : strC;
                        String str27 = ql5Var != null ? ql5Var.f : null;
                        String str28 = str27 == null ? "" : str27;
                        String strA116 = ctf0Var4.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        return new xc(ijlVar, new jjl(str26, str28, strA116, str25, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())));
                    case 4:
                        n0o0 n0o0Var = y11Var2.w;
                        n0o0 n0o0Var2 = y11Var2.x;
                        d7v d7vVar3 = (d7v) obj;
                        d7vVar3.getClass();
                        int iOrdinal12 = d7vVar3.ordinal();
                        if (iOrdinal12 == 0) {
                            return CollectionsKt.q0((Collection) ((fee) n0o0Var.getValue()).b(), (Iterable) ((fee) n0o0Var2.getValue()).b());
                        }
                        if (iOrdinal12 == 1) {
                            return (List) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal12 == 2) {
                            return (List) ((fee) n0o0Var2.getValue()).b();
                        }
                        t9f.b();
                        return null;
                    case 5:
                        ((Unit) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(((q11) y11Var2.z).r, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    case 6:
                        y11 y11Var4 = y11Var2;
                        fee feeVar4 = (fee) obj;
                        feeVar4.getClass();
                        Iterable iterable = (Iterable) feeVar4.c();
                        ArrayList arrayList4 = new ArrayList(r3d.q(iterable, 10));
                        Iterator it4 = iterable.iterator();
                        while (it4.hasNext()) {
                            j8b j8bVar = (j8b) it4.next();
                            y11 y11Var5 = y11Var4;
                            ctf0 ctf0Var5 = y11Var5.b;
                            boolean zBooleanValue = ((Boolean) ((fee) y11Var5.c.getValue()).c()).booleanValue();
                            q11 q11Var8 = (q11) y11Var5.z;
                            boolean z13 = q11Var8.v;
                            ot0 ot0Var2 = q11Var8.x;
                            Set set = (Set) ((fee) y11Var5.f.getValue()).c();
                            j8bVar.getClass();
                            ctf0Var5.getClass();
                            set.getClass();
                            List<mlr> list3 = j8bVar.c;
                            ArrayList arrayList5 = new ArrayList(r3d.q(list3, 10));
                            for (mlr mlrVar : list3) {
                                Set set2 = set;
                                if ((set2 instanceof Collection) && set2.isEmpty()) {
                                    z6 = zBooleanValue;
                                    ot0Var = ot0Var2;
                                    z7 = false;
                                } else {
                                    Iterator it5 = set2.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            z6 = zBooleanValue;
                                            ot0Var = ot0Var2;
                                            if (((Number) it5.next()).longValue() == mlrVar.f22006a) {
                                                z7 = true;
                                            } else {
                                                zBooleanValue = z6;
                                                ot0Var2 = ot0Var;
                                            }
                                        } else {
                                            z6 = zBooleanValue;
                                            ot0Var = ot0Var2;
                                            z7 = false;
                                        }
                                    }
                                }
                                pt0 pt0VarG0 = x4d0.g0(ot0Var);
                                Integer numValueOf = Integer.valueOf((int) j8bVar.f16074a);
                                mlrVar.getClass();
                                boolean z14 = mlrVar.k;
                                int i16 = z13 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                boolean z15 = mlrVar.j;
                                if (z14) {
                                    it = it4;
                                    str4 = str14;
                                    z8 = z13;
                                    strA5 = ctf0Var5.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    it = it4;
                                    str4 = str14;
                                    z8 = z13;
                                    strA5 = z15 ? ctf0Var5.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : str4;
                                }
                                Set set3 = set;
                                long j3 = mlrVar.f22006a;
                                String str29 = mlrVar.f;
                                String str210 = mlrVar.e;
                                mtr mtrVar = new mtr(z6 ? z7 ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, z7);
                                n0x n0xVar2 = new n0x(mlrVar.g);
                                m0x m0xVar = new m0x(i16, null, 6);
                                if (strA5.length() == 0) {
                                    murVar = lur.f20686a;
                                    n0xVar = n0xVar2;
                                } else {
                                    pt0 pt0Var3 = pt0.f27539a;
                                    if ((pt0VarG0 == pt0Var3 && z14) || (pt0VarG0 == (pt0Var = pt0.c) && z14)) {
                                        n0xVar = n0xVar2;
                                    } else {
                                        n0xVar = n0xVar2;
                                        pt0 pt0Var4 = pt0.d;
                                        if (pt0VarG0 != pt0Var4 || !z14) {
                                            if ((pt0VarG0 == pt0Var3 && z15) || ((pt0VarG0 == pt0Var && z15) || (pt0VarG0 == pt0Var4 && z15))) {
                                                d4d d4dVar = d4d.PRIMARY;
                                                uqo0Var = new eqo0();
                                            } else {
                                                pt0 pt0Var5 = pt0.b;
                                                uqo0Var = ((pt0VarG0 == pt0Var5 && z14) || (pt0VarG0 == (pt0Var2 = pt0.e) && z14)) ? kro0.f18776a : ((pt0VarG0 == pt0Var5 && z15) || (pt0VarG0 == pt0Var2 && z15)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                            }
                                        }
                                        murVar = new mur(strA5, uqo0Var);
                                    }
                                    d4d d4dVar2 = d4d.PRIMARY;
                                    uqo0Var = new lro0();
                                    murVar = new mur(strA5, uqo0Var);
                                }
                                arrayList5.add(new st0(j3, str29, str210, mtrVar, n0xVar, m0xVar, numValueOf, murVar));
                                zBooleanValue = z6;
                                ot0Var2 = ot0Var;
                                it4 = it;
                                z13 = z8;
                                set = set3;
                                str14 = str4;
                            }
                            arrayList4.add(new h4r0(j8bVar.f16074a, j8bVar.d, j8bVar.b, new hjm(j8bVar.b, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var5.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166), new zll(x4d0.g0(ot0Var2), new wll(o0s.f24443a), arrayList5)));
                            y11Var4 = y11Var5;
                            it4 = it4;
                            str14 = str14;
                        }
                        return dyb.r0(arrayList4);
                    default:
                        q11 q11Var9 = (q11) y11Var2.z;
                        fee feeVar5 = (fee) obj;
                        feeVar5.getClass();
                        b7v b7vVar = (b7v) feeVar5.c();
                        if (b7vVar instanceof z6v) {
                            ArrayList arrayList6 = ((z6v) b7vVar).f43888a;
                            ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                            Iterator it6 = arrayList6.iterator();
                            while (it6.hasNext()) {
                                e65 e65Var = (e65) it6.next();
                                c01 c01Var2 = q11Var9.t;
                                ctf0 ctf0Var6 = y11Var2.b;
                                e65Var.getClass();
                                ArrayList arrayList8 = arrayList7;
                                double d2 = e65Var.b;
                                ctf0Var6.getClass();
                                List list4 = e65Var.k;
                                String str211 = str11;
                                String str212 = str12;
                                long j4 = e65Var.g.f44639a;
                                List list5 = e65Var.o;
                                List list6 = e65Var.n;
                                int i17 = e65Var.f7264a;
                                Iterator it7 = it6;
                                gom0 gom0Var = e65Var.i;
                                String str30 = str13;
                                List list7 = e65Var.l;
                                y11 y11Var6 = y11Var2;
                                if (list4.size() == 1) {
                                    ww90Var = ww90.f39878a;
                                } else if (list4.size() > 1) {
                                    ww90Var = ww90.b;
                                } else if (list6.isEmpty() || !list7.isEmpty()) {
                                    ww90Var = (list7.isEmpty() && list5.isEmpty()) ? ww90.c : ww90.d;
                                } else {
                                    ww90Var = ww90.b;
                                }
                                ArrayList arrayList9 = new ArrayList();
                                q11 q11Var10 = q11Var9;
                                ww90 ww90Var3 = ww90Var;
                                String str31 = str9;
                                lsm0 lsm0Var2 = ctf0Var6.b;
                                String strA117 = lsm0Var2.a(R.string.for_games_title, Arrays.copyOf(new Object[0], 0));
                                m7m0 m7m0Var7 = m7m0.f21327a;
                                if (!list4.isEmpty()) {
                                    arrayList9.add(new pf8(strA117, list4, nw80.t, m7m0Var7, new qp9(str14, i17, i17)));
                                }
                                String strA118 = lsm0Var2.a(R.string.for_unavailable_games_title, Arrays.copyOf(new Object[0], 0));
                                if (!list6.isEmpty()) {
                                    arrayList9.add(new pf8(strA118, list6, nw80.t, m7m0Var7, new qp9(str14, i17, i17)));
                                }
                                pf8 pf8Var4 = (pf8) CollectionsKt.firstOrNull(arrayList9);
                                ArrayList arrayList10 = new ArrayList();
                                String strA20 = lsm0Var2.a(R.string.for_providers_title, Arrays.copyOf(new Object[0], 0));
                                m7m0 m7m0Var8 = m7m0.b;
                                if (!list7.isEmpty()) {
                                    arrayList10.add(new pf8(strA20, list7, nw80.t, m7m0Var8, new qp9(str14, i17, i17)));
                                }
                                String strA21 = lsm0Var2.a(R.string.for_unavailable_providers_title, Arrays.copyOf(new Object[0], 0));
                                if (!list5.isEmpty()) {
                                    arrayList10.add(new pf8(strA21, list5, nw80.t, m7m0Var8, new qp9(str14, i17, i17)));
                                }
                                pf8 pf8Var5 = (pf8) CollectionsKt.firstOrNull(arrayList10);
                                double d3 = ((double) e65Var.e) * d2;
                                String str32 = str14;
                                DecimalFormat decimalFormat = new DecimalFormat("0.##", DecimalFormatSymbols.getInstance(Locale.US));
                                String str33 = decimalFormat.format(d3);
                                String str34 = decimalFormat.format(e65Var.d);
                                Date date6 = new Date(j4);
                                int i18 = e65Var.f7264a;
                                hnl hnlVarN11 = nkb.N(c01Var2);
                                String strA22 = lsm0Var2.a(R.string.bonus_amount_title, Arrays.copyOf(new Object[0], 0));
                                nnm0 nnm0Var = gom0Var.f11638a;
                                String strA23 = lsm0Var2.a(R.string.bonus_active, Arrays.copyOf(new Object[0], 0));
                                nnm0 nnm0Var2 = nnm0.ACTIVE;
                                if (nnm0Var != nnm0Var2) {
                                    strA23 = null;
                                }
                                String str35 = strA23 == null ? str32 : strA23;
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                int iOrdinal13 = c01Var2.ordinal();
                                if (iOrdinal13 != 0) {
                                    i7 = i18;
                                    if (iOrdinal13 == 1) {
                                        str5 = str212;
                                    } else if (iOrdinal13 == 2) {
                                        str5 = str32;
                                    } else if (iOrdinal13 == 3) {
                                        str5 = "Ticket_Primery";
                                    } else if (iOrdinal13 == 4) {
                                        str5 = str30;
                                    } else {
                                        t9f.b();
                                    }
                                } else {
                                    i7 = i18;
                                    str5 = str211;
                                }
                                String strL4 = kng0.l(str10, str5, "_Bonus.webp");
                                if (strL4.length() == 0) {
                                    sb2.setLength(0);
                                    str6 = str10;
                                } else {
                                    str6 = str10;
                                    int i19 = 0;
                                    if (StringsKt.O(strL4, ujn.h, false)) {
                                        sb2.setLength(i19);
                                        sb2.append(strL4);
                                    } else if (kotlin.text.c.x(strL4, "https://", false)) {
                                        i19 = 0;
                                        sb2.setLength(i19);
                                        sb2.append(strL4);
                                    } else {
                                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                            i8 = 1;
                                            c2 = '/';
                                        } else {
                                            sb2.append('/');
                                            c2 = '/';
                                            i8 = 1;
                                        }
                                        char[] cArr6 = new char[i8];
                                        cArr6[0] = c2;
                                        sb2.append(StringsKt.y0(strL4, cArr6));
                                    }
                                }
                                String string6 = sb2.toString();
                                String str36 = e65Var.c;
                                pn40 pn40Var12 = pn40.f27267a;
                                String strL5 = kng0.l(str36, str31, pn40.c(d2, p3u0.c));
                                String str37 = pf8Var5 != null ? pf8Var5.f26889a : null;
                                String str38 = str37 == null ? str32 : str37;
                                String str39 = pf8Var4 != null ? pf8Var4.f26889a : null;
                                String str40 = str39 == null ? str32 : str39;
                                int iOrdinal14 = nnm0Var.ordinal();
                                if (iOrdinal14 != 0) {
                                    if (iOrdinal14 != 5) {
                                        str7 = str32;
                                        i9 = 0;
                                    } else {
                                        i9 = 0;
                                        strA6 = lsm0Var2.a(R.string.resume, Arrays.copyOf(new Object[0], 0));
                                    }
                                    if (nnm0Var == nnm0Var2) {
                                        i10 = 1;
                                    } else {
                                        i10 = i9;
                                    }
                                    if (nnm0Var == nnm0.READY) {
                                        strA7 = lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[i9], i9));
                                        ww90Var2 = ww90Var3;
                                    } else {
                                        if (i10 != 0) {
                                            ww90Var2 = ww90Var3;
                                            if (ww90Var2 == ww90.f39878a) {
                                                strA8 = lsm0Var2.a(R.string.play_button, Arrays.copyOf(new Object[i9], i9));
                                            }
                                            strA7 = strA8;
                                        } else {
                                            ww90Var2 = ww90Var3;
                                        }
                                        if (i10 == 0 && ww90Var2 == ww90.b) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        } else if (i10 == 0 && ww90Var2 == ww90.d) {
                                            strA8 = lsm0Var2.a(R.string.all_providers, Arrays.copyOf(new Object[i9], i9));
                                        } else if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        } else {
                                            strA7 = str32;
                                        }
                                        strA7 = strA8;
                                    }
                                    if (pf8Var5 != null || (list2 = pf8Var5.b) == null) {
                                        a4xVarO0 = lak0.c;
                                    } else {
                                        ArrayList arrayList11 = new ArrayList(r3d.q(list2, 10));
                                        Iterator it8 = list2.iterator();
                                        while (it8.hasNext()) {
                                            arrayList11.add(((az5) it8.next()).b);
                                        }
                                        a4xVarO0 = dyb.o0(arrayList11);
                                        if (a4xVarO0 == null) {
                                            a4xVarO0 = lak0.c;
                                        }
                                    }
                                    a4x a4xVar8 = a4xVarO0;
                                    if (pf8Var4 != null || (list = pf8Var4.b) == null) {
                                        a4xVarO1 = lak0.c;
                                    } else {
                                        ArrayList arrayList12 = new ArrayList(r3d.q(list, 10));
                                        Iterator it9 = list.iterator();
                                        while (it9.hasNext()) {
                                            arrayList12.add(((az5) it9.next()).b);
                                        }
                                        a4xVarO1 = dyb.o0(arrayList12);
                                        if (a4xVarO1 == null) {
                                            a4xVarO1 = lak0.c;
                                        }
                                    }
                                    a4x a4xVar9 = a4xVarO1;
                                    ovl ovlVar6 = new ovl(lsm0Var2.a(R.string.roleplaying_title, Arrays.copyOf(new Object[0], 0)), str34, kng0.k("/ ", str33));
                                    q7n q7nVarR6 = vbw0.R(ctf0Var6, date6, Long.valueOf(j4));
                                    if (pf8Var5 == null || pf8Var4 != null) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (pf8Var5 != null || pf8Var4 == null) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    uzh uzhVar6 = new uzh(hnlVarN11, strA22, str35, string6, strL5, str38, str40, null, null, a4xVar8, a4xVar9, true, null, null, str7, strA7, 0, ovlVar6, q7nVarR6, new tzh(z9, z10, false, false));
                                    hnl hnlVarN12 = nkb.N(c01Var2);
                                    iOrdinal2 = nnm0Var.ordinal();
                                    if (iOrdinal2 != 0) {
                                        m7m0Var2 = m7m0.f;
                                    } else if (iOrdinal2 != 1) {
                                        m7m0Var2 = m7m0.c;
                                    } else if (iOrdinal2 != 5) {
                                        m7m0Var2 = m7m0.i;
                                    } else {
                                        m7m0Var2 = m7m0.e;
                                    }
                                    m7m0 m7m0Var18 = m7m0Var2;
                                    nw80Var = nw80.b;
                                    j = i17;
                                    vf8 vf8Var7 = new vf8(i17, j, nw80Var, m7m0Var18, "");
                                    listJ = q3d.j(pf8Var4, pf8Var5);
                                    iOrdinal3 = nnm0Var.ordinal();
                                    if (iOrdinal3 != 0) {
                                        if (iOrdinal3 != 1) {
                                            iOrdinal8 = nnm0Var.ordinal();
                                            if (iOrdinal8 != 0) {
                                                m7m0Var5 = m7m0.f;
                                            } else if (iOrdinal8 != 1) {
                                                m7m0Var5 = m7m0.c;
                                            } else if (iOrdinal8 != 5) {
                                                m7m0Var5 = m7m0.i;
                                            } else {
                                                m7m0Var5 = m7m0.e;
                                            }
                                            vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var5, "");
                                        } else if (iOrdinal3 != 5) {
                                            vf8Var = new vf8(0, j, nw80Var, m7m0.i, "");
                                            str14 = str32;
                                        } else {
                                            iOrdinal9 = nnm0Var.ordinal();
                                            if (iOrdinal9 != 0) {
                                                m7m0Var6 = m7m0.f;
                                            } else if (iOrdinal9 != 1) {
                                                m7m0Var6 = m7m0.c;
                                            } else if (iOrdinal9 != 5) {
                                                m7m0Var6 = m7m0.i;
                                            } else {
                                                m7m0Var6 = m7m0.e;
                                            }
                                            vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var6, "");
                                        }
                                        str14 = str32;
                                        vf8Var2 = vf8Var3;
                                        arrayList8.add(new r11(uzhVar6, hnlVarN12, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var7, vf8Var2, i7));
                                        arrayList7 = arrayList8;
                                        str9 = str31;
                                        str10 = str6;
                                        str11 = str211;
                                        str12 = str212;
                                        it6 = it7;
                                        str13 = str30;
                                        y11Var2 = y11Var6;
                                        q11Var9 = q11Var10;
                                    } else {
                                        pf8Var = (pf8) CollectionsKt.firstOrNull(listJ);
                                        if (pf8Var != null) {
                                            pf8Var3 = (pf8) CollectionsKt.firstOrNull(listJ);
                                            if (pf8Var3 != null) {
                                                qp9 qp9Var9 = pf8Var3.e;
                                                qp9Var2 = new qp9(qp9Var9.b, qp9Var9.f29104a, j);
                                                str14 = str32;
                                            } else {
                                                str14 = str32;
                                                qp9Var2 = new qp9(str14, 0, 0L);
                                            }
                                            qp9 qp9Var10 = qp9Var2;
                                            String str44 = pf8Var.f26889a;
                                            List list11 = pf8Var.b;
                                            nw80 nw80Var10 = pf8Var.c;
                                            m7m0 m7m0Var19 = pf8Var.d;
                                            str44.getClass();
                                            list11.getClass();
                                            pf8Var2 = new pf8(str44, list11, nw80Var10, m7m0Var19, qp9Var10);
                                        } else {
                                            str14 = str32;
                                            iun iunVar4 = iun.f15405a;
                                            nw80 nw80Var11 = nw80.t;
                                            iOrdinal4 = nnm0Var.ordinal();
                                            if (iOrdinal4 != 0) {
                                                m7m0Var3 = m7m0.f;
                                            } else if (iOrdinal4 != 1) {
                                                m7m0Var3 = m7m0.c;
                                            } else if (iOrdinal4 != 5) {
                                                m7m0Var3 = m7m0.i;
                                            } else {
                                                m7m0Var3 = m7m0.e;
                                            }
                                            pf8Var2 = new pf8("", iunVar4, nw80Var11, m7m0Var3, new qp9(str14, 0, 0L));
                                        }
                                        iOrdinal5 = ww90Var2.ordinal();
                                        if (iOrdinal5 != 0) {
                                            m7m0Var4 = m7m0.g;
                                        } else if (iOrdinal5 != 1) {
                                            m7m0Var4 = m7m0.f21327a;
                                        } else if (iOrdinal5 != 2) {
                                            m7m0Var4 = m7m0.d;
                                        } else if (iOrdinal5 != 3) {
                                            m7m0Var4 = m7m0.b;
                                        } else if (iOrdinal5 == 4) {
                                            m7m0Var4 = m7m0.i;
                                        } else {
                                            t9f.b();
                                        }
                                        m7m0 m7m0Var110 = m7m0Var4;
                                        iOrdinal6 = ww90Var2.ordinal();
                                        qp9Var = pf8Var2.e;
                                        if (iOrdinal6 != 0) {
                                            az5Var = (az5) CollectionsKt.firstOrNull(pf8Var2.b);
                                            if (az5Var != null) {
                                                i11 = az5Var.f1701a;
                                            } else {
                                                i11 = qp9Var.f29104a;
                                            }
                                            i12 = i11;
                                        } else if (iOrdinal6 != 1 || iOrdinal6 == 3) {
                                            i12 = i17;
                                        } else {
                                            i12 = 0;
                                        }
                                        iOrdinal7 = ww90Var2.ordinal();
                                        if (iOrdinal7 == 0) {
                                            strA9 = qp9Var.b;
                                        } else if (iOrdinal7 != 1 || iOrdinal7 == 2) {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            if (iOrdinal7 == 3) {
                                                strA9 = lsm0Var2.a(R.string.all_providers, Arrays.copyOf(new Object[0], 0));
                                            } else if (iOrdinal7 == 4) {
                                                str8 = str14;
                                            } else {
                                                t9f.b();
                                            }
                                            vf8Var = new vf8(i12, j, nw80Var, m7m0Var110, str8);
                                        }
                                        str8 = strA9;
                                        vf8Var = new vf8(i12, j, nw80Var, m7m0Var110, str8);
                                    }
                                    vf8Var2 = vf8Var;
                                    arrayList8.add(new r11(uzhVar6, hnlVarN12, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var7, vf8Var2, i7));
                                    arrayList7 = arrayList8;
                                    str9 = str31;
                                    str10 = str6;
                                    str11 = str211;
                                    str12 = str212;
                                    it6 = it7;
                                    str13 = str30;
                                    y11Var2 = y11Var6;
                                    q11Var9 = q11Var10;
                                } else {
                                    i9 = 0;
                                    strA6 = lsm0Var2.a(R.string.suspend, Arrays.copyOf(new Object[0], 0));
                                }
                                str7 = strA6;
                                if (nnm0Var == nnm0Var2) {
                                    i10 = 1;
                                } else {
                                    i10 = i9;
                                }
                                if (nnm0Var == nnm0.READY) {
                                    strA7 = lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[i9], i9));
                                    ww90Var2 = ww90Var3;
                                } else {
                                    if (i10 != 0) {
                                        ww90Var2 = ww90Var3;
                                        if (ww90Var2 == ww90.f39878a) {
                                            strA8 = lsm0Var2.a(R.string.play_button, Arrays.copyOf(new Object[i9], i9));
                                        }
                                        strA7 = strA8;
                                    } else {
                                        ww90Var2 = ww90Var3;
                                    }
                                    if (i10 == 0) {
                                        if (i10 == 0) {
                                            if (i10 != 0) {
                                                strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                                strA7 = strA8;
                                            } else {
                                                strA7 = str32;
                                            }
                                        } else if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                            strA7 = strA8;
                                        } else {
                                            strA7 = str32;
                                        }
                                    } else if (i10 == 0) {
                                        if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                            strA7 = strA8;
                                        } else {
                                            strA7 = str32;
                                        }
                                    } else if (i10 != 0) {
                                        strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        strA7 = strA8;
                                    } else {
                                        strA7 = str32;
                                    }
                                }
                                if (pf8Var5 != null) {
                                    a4xVarO0 = lak0.c;
                                } else {
                                    a4xVarO0 = lak0.c;
                                }
                                a4x a4xVar10 = a4xVarO0;
                                if (pf8Var4 != null) {
                                    a4xVarO1 = lak0.c;
                                } else {
                                    a4xVarO1 = lak0.c;
                                }
                                a4x a4xVar11 = a4xVarO1;
                                ovl ovlVar7 = new ovl(lsm0Var2.a(R.string.roleplaying_title, Arrays.copyOf(new Object[0], 0)), str34, kng0.k("/ ", str33));
                                q7n q7nVarR7 = vbw0.R(ctf0Var6, date6, Long.valueOf(j4));
                                if (pf8Var5 == null) {
                                    z9 = true;
                                } else {
                                    z9 = true;
                                }
                                if (pf8Var5 != null) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                uzh uzhVar7 = new uzh(hnlVarN11, strA22, str35, string6, strL5, str38, str40, null, null, a4xVar10, a4xVar11, true, null, null, str7, strA7, 0, ovlVar7, q7nVarR7, new tzh(z9, z10, false, false));
                                hnl hnlVarN13 = nkb.N(c01Var2);
                                iOrdinal2 = nnm0Var.ordinal();
                                if (iOrdinal2 != 0) {
                                    m7m0Var2 = m7m0.f;
                                } else if (iOrdinal2 != 1) {
                                    m7m0Var2 = m7m0.c;
                                } else if (iOrdinal2 != 5) {
                                    m7m0Var2 = m7m0.i;
                                } else {
                                    m7m0Var2 = m7m0.e;
                                }
                                m7m0 m7m0Var111 = m7m0Var2;
                                nw80Var = nw80.b;
                                j = i17;
                                vf8 vf8Var8 = new vf8(i17, j, nw80Var, m7m0Var111, "");
                                listJ = q3d.j(pf8Var4, pf8Var5);
                                iOrdinal3 = nnm0Var.ordinal();
                                if (iOrdinal3 != 0) {
                                    if (iOrdinal3 != 1) {
                                        iOrdinal8 = nnm0Var.ordinal();
                                        if (iOrdinal8 != 0) {
                                            m7m0Var5 = m7m0.f;
                                        } else if (iOrdinal8 != 1) {
                                            m7m0Var5 = m7m0.c;
                                        } else if (iOrdinal8 != 5) {
                                            m7m0Var5 = m7m0.i;
                                        } else {
                                            m7m0Var5 = m7m0.e;
                                        }
                                        vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var5, "");
                                    } else if (iOrdinal3 != 5) {
                                        vf8Var = new vf8(0, j, nw80Var, m7m0.i, "");
                                        str14 = str32;
                                    } else {
                                        iOrdinal9 = nnm0Var.ordinal();
                                        if (iOrdinal9 != 0) {
                                            m7m0Var6 = m7m0.f;
                                        } else if (iOrdinal9 != 1) {
                                            m7m0Var6 = m7m0.c;
                                        } else if (iOrdinal9 != 5) {
                                            m7m0Var6 = m7m0.i;
                                        } else {
                                            m7m0Var6 = m7m0.e;
                                        }
                                        vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var6, "");
                                    }
                                    str14 = str32;
                                    vf8Var2 = vf8Var3;
                                    arrayList8.add(new r11(uzhVar7, hnlVarN13, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var8, vf8Var2, i7));
                                    arrayList7 = arrayList8;
                                    str9 = str31;
                                    str10 = str6;
                                    str11 = str211;
                                    str12 = str212;
                                    it6 = it7;
                                    str13 = str30;
                                    y11Var2 = y11Var6;
                                    q11Var9 = q11Var10;
                                } else {
                                    pf8Var = (pf8) CollectionsKt.firstOrNull(listJ);
                                    if (pf8Var != null) {
                                        pf8Var3 = (pf8) CollectionsKt.firstOrNull(listJ);
                                        if (pf8Var3 != null) {
                                            qp9 qp9Var11 = pf8Var3.e;
                                            qp9Var2 = new qp9(qp9Var11.b, qp9Var11.f29104a, j);
                                            str14 = str32;
                                        } else {
                                            str14 = str32;
                                            qp9Var2 = new qp9(str14, 0, 0L);
                                        }
                                        qp9 qp9Var12 = qp9Var2;
                                        String str45 = pf8Var.f26889a;
                                        List list12 = pf8Var.b;
                                        nw80 nw80Var12 = pf8Var.c;
                                        m7m0 m7m0Var112 = pf8Var.d;
                                        str45.getClass();
                                        list12.getClass();
                                        pf8Var2 = new pf8(str45, list12, nw80Var12, m7m0Var112, qp9Var12);
                                    } else {
                                        str14 = str32;
                                        iun iunVar5 = iun.f15405a;
                                        nw80 nw80Var13 = nw80.t;
                                        iOrdinal4 = nnm0Var.ordinal();
                                        if (iOrdinal4 != 0) {
                                            m7m0Var3 = m7m0.f;
                                        } else if (iOrdinal4 != 1) {
                                            m7m0Var3 = m7m0.c;
                                        } else if (iOrdinal4 != 5) {
                                            m7m0Var3 = m7m0.i;
                                        } else {
                                            m7m0Var3 = m7m0.e;
                                        }
                                        pf8Var2 = new pf8("", iunVar5, nw80Var13, m7m0Var3, new qp9(str14, 0, 0L));
                                    }
                                    iOrdinal5 = ww90Var2.ordinal();
                                    if (iOrdinal5 != 0) {
                                        m7m0Var4 = m7m0.g;
                                    } else if (iOrdinal5 != 1) {
                                        m7m0Var4 = m7m0.f21327a;
                                    } else if (iOrdinal5 != 2) {
                                        m7m0Var4 = m7m0.d;
                                    } else if (iOrdinal5 != 3) {
                                        m7m0Var4 = m7m0.b;
                                    } else if (iOrdinal5 == 4) {
                                        m7m0Var4 = m7m0.i;
                                    } else {
                                        t9f.b();
                                    }
                                    m7m0 m7m0Var113 = m7m0Var4;
                                    iOrdinal6 = ww90Var2.ordinal();
                                    qp9Var = pf8Var2.e;
                                    if (iOrdinal6 != 0) {
                                        az5Var = (az5) CollectionsKt.firstOrNull(pf8Var2.b);
                                        if (az5Var != null) {
                                            i11 = az5Var.f1701a;
                                        } else {
                                            i11 = qp9Var.f29104a;
                                        }
                                        i12 = i11;
                                    } else if (iOrdinal6 != 1) {
                                        i12 = i17;
                                    } else {
                                        i12 = i17;
                                    }
                                    iOrdinal7 = ww90Var2.ordinal();
                                    if (iOrdinal7 == 0) {
                                        if (iOrdinal7 != 1) {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        }
                                        vf8Var = new vf8(i12, j, nw80Var, m7m0Var113, str8);
                                    } else {
                                        strA9 = qp9Var.b;
                                    }
                                    str8 = strA9;
                                    vf8Var = new vf8(i12, j, nw80Var, m7m0Var113, str8);
                                }
                                vf8Var2 = vf8Var;
                                arrayList8.add(new r11(uzhVar7, hnlVarN13, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var8, vf8Var2, i7));
                                arrayList7 = arrayList8;
                                str9 = str31;
                                str10 = str6;
                                str11 = str211;
                                str12 = str212;
                                it6 = it7;
                                str13 = str30;
                                y11Var2 = y11Var6;
                                q11Var9 = q11Var10;
                            }
                            return dyb.r0(arrayList7);
                        }
                        if (Intrinsics.d(b7vVar, a7v.f393a)) {
                            return i4w0.N(q11Var9.t);
                        }
                        t9f.b();
                        return null;
                }
            }
        }, (byte) 20));
        fee feeVar = (fee) n0o0VarH3.getValue();
        final byte b6 = 6;
        this.v = maz.b(new yw9(feeVar, new Function1(this) { // from class: a.x11
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
            /* JADX WARN: Code duplicated, block: B:103:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:106:0x02c9  */
            /* JADX WARN: Code duplicated, block: B:107:0x02db A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:108:0x02dd  */
            /* JADX WARN: Code duplicated, block: B:110:0x02e3  */
            /* JADX WARN: Code duplicated, block: B:112:0x02f3  */
            /* JADX WARN: Code duplicated, block: B:117:0x0306 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:118:0x0308  */
            /* JADX WARN: Code duplicated, block: B:121:0x031a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:122:0x031c  */
            /* JADX WARN: Code duplicated, block: B:123:0x0327  */
            /* JADX WARN: Code duplicated, block: B:135:0x035a  */
            /* JADX WARN: Code duplicated, block: B:147:0x038e  */
            /* JADX WARN: Code duplicated, block: B:153:0x03bb  */
            /* JADX WARN: Code duplicated, block: B:158:0x03c3  */
            /* JADX WARN: Code duplicated, block: B:161:0x03e7  */
            /* JADX WARN: Code duplicated, block: B:163:0x03ea  */
            /* JADX WARN: Code duplicated, block: B:165:0x03ed  */
            /* JADX WARN: Code duplicated, block: B:167:0x03f2  */
            /* JADX WARN: Code duplicated, block: B:168:0x03f5  */
            /* JADX WARN: Code duplicated, block: B:169:0x03f8  */
            /* JADX WARN: Code duplicated, block: B:172:0x0419  */
            /* JADX WARN: Code duplicated, block: B:174:0x041c  */
            /* JADX WARN: Code duplicated, block: B:176:0x041f  */
            /* JADX WARN: Code duplicated, block: B:178:0x0434  */
            /* JADX WARN: Code duplicated, block: B:180:0x043a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:181:0x043c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:182:0x043e  */
            /* JADX WARN: Code duplicated, block: B:184:0x0443  */
            /* JADX WARN: Code duplicated, block: B:185:0x0446  */
            /* JADX WARN: Code duplicated, block: B:186:0x0449  */
            /* JADX WARN: Code duplicated, block: B:189:0x0459  */
            /* JADX WARN: Code duplicated, block: B:191:0x045f  */
            /* JADX WARN: Code duplicated, block: B:193:0x0462  */
            /* JADX WARN: Code duplicated, block: B:195:0x0465  */
            /* JADX WARN: Code duplicated, block: B:197:0x046a  */
            /* JADX WARN: Code duplicated, block: B:198:0x046d  */
            /* JADX WARN: Code duplicated, block: B:199:0x0470  */
            /* JADX WARN: Code duplicated, block: B:201:0x047b  */
            /* JADX WARN: Code duplicated, block: B:203:0x0487  */
            /* JADX WARN: Code duplicated, block: B:205:0x048f  */
            /* JADX WARN: Code duplicated, block: B:207:0x049f  */
            /* JADX WARN: Code duplicated, block: B:209:0x04c6  */
            /* JADX WARN: Code duplicated, block: B:211:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:213:0x04d7  */
            /* JADX WARN: Code duplicated, block: B:215:0x04da  */
            /* JADX WARN: Code duplicated, block: B:217:0x04df  */
            /* JADX WARN: Code duplicated, block: B:218:0x04e2  */
            /* JADX WARN: Code duplicated, block: B:219:0x04e5  */
            /* JADX WARN: Code duplicated, block: B:223:0x04fd  */
            /* JADX WARN: Code duplicated, block: B:225:0x0500  */
            /* JADX WARN: Code duplicated, block: B:227:0x0503  */
            /* JADX WARN: Code duplicated, block: B:229:0x0506  */
            /* JADX WARN: Code duplicated, block: B:231:0x0509  */
            /* JADX WARN: Code duplicated, block: B:234:0x0513  */
            /* JADX WARN: Code duplicated, block: B:235:0x0516  */
            /* JADX WARN: Code duplicated, block: B:236:0x0519  */
            /* JADX WARN: Code duplicated, block: B:237:0x051c  */
            /* JADX WARN: Code duplicated, block: B:240:0x0527  */
            /* JADX WARN: Code duplicated, block: B:245:0x0530  */
            /* JADX WARN: Code duplicated, block: B:246:0x0533  */
            /* JADX WARN: Code duplicated, block: B:248:0x053d  */
            /* JADX WARN: Code duplicated, block: B:250:0x0542  */
            /* JADX WARN: Code duplicated, block: B:253:0x054b  */
            /* JADX WARN: Code duplicated, block: B:265:0x0570  */
            /* JADX WARN: Code duplicated, block: B:266:0x057f  */
            /* JADX WARN: Code duplicated, block: B:468:0x0b96  */
            /* JADX WARN: Code duplicated, block: B:469:0x0bb1  */
            /* JADX WARN: Code duplicated, block: B:471:0x0bbf  */
            /* JADX WARN: Code duplicated, block: B:472:0x0bd0  */
            /* JADX WARN: Code duplicated, block: B:484:0x0be9  */
            /* JADX WARN: Code duplicated, block: B:485:0x0bfb  */
            /* JADX WARN: Code duplicated, block: B:487:0x0bff  */
            /* JADX WARN: Code duplicated, block: B:488:0x0c11  */
            /* JADX WARN: Code duplicated, block: B:491:0x0c46  */
            /* JADX WARN: Code duplicated, block: B:493:0x0c4b  */
            /* JADX WARN: Code duplicated, block: B:495:0x0c4e  */
            /* JADX WARN: Code duplicated, block: B:497:0x0c51  */
            /* JADX WARN: Code duplicated, block: B:499:0x0c54  */
            /* JADX WARN: Code duplicated, block: B:502:0x0c5d  */
            /* JADX WARN: Code duplicated, block: B:503:0x0c61  */
            /* JADX WARN: Code duplicated, block: B:504:0x0c64  */
            /* JADX WARN: Code duplicated, block: B:505:0x0c67  */
            /* JADX WARN: Code duplicated, block: B:508:0x0c7b  */
            /* JADX WARN: Code duplicated, block: B:509:0x0c84  */
            /* JADX WARN: Code duplicated, block: B:511:0x0c8f  */
            /* JADX WARN: Code duplicated, block: B:513:0x0c95  */
            /* JADX WARN: Code duplicated, block: B:514:0x0c96 A[PHI: r15
  0x0c96: PHI (r15v12 int) = (r15v11 int), (r15v17 int) binds: [B:510:0x0c8d, B:513:0x0c95] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:515:0x0c99  */
            /* JADX WARN: Code duplicated, block: B:520:0x0cae  */
            /* JADX WARN: Code duplicated, block: B:525:0x0ce6  */
            /* JADX WARN: Code duplicated, block: B:527:0x0cf9  */
            /* JADX WARN: Code duplicated, block: B:530:0x0d0b  */
            /* JADX WARN: Code duplicated, block: B:531:0x0d0e  */
            /* JADX WARN: Code duplicated, block: B:534:0x0d1c  */
            /* JADX WARN: Code duplicated, block: B:535:0x0d1f  */
            /* JADX WARN: Code duplicated, block: B:537:0x0d2f  */
            /* JADX WARN: Code duplicated, block: B:538:0x0d31  */
            /* JADX WARN: Code duplicated, block: B:540:0x0d37  */
            /* JADX WARN: Code duplicated, block: B:541:0x0d39  */
            /* JADX WARN: Code duplicated, block: B:544:0x0d4e  */
            /* JADX WARN: Code duplicated, block: B:545:0x0d50  */
            /* JADX WARN: Code duplicated, block: B:547:0x0d53  */
            /* JADX WARN: Code duplicated, block: B:549:0x0d57  */
            /* JADX WARN: Code duplicated, block: B:552:0x0d79  */
            /* JADX WARN: Code duplicated, block: B:554:0x0d7e  */
            /* JADX WARN: Code duplicated, block: B:564:0x050e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:579:0x0c57 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y11 y11Var;
                boolean z;
                int i;
                boolean z2;
                String strL;
                String strL2;
                String strA;
                String strA2;
                lsm0 lsm0Var;
                boolean z3;
                int i2;
                StringBuilder sb;
                int iOrdinal;
                int i3;
                String str;
                String str2;
                String strL3;
                int i4;
                int i5;
                char c;
                String strA3;
                lak0 lak0Var;
                i4 i4VarG0;
                String strA4;
                String strValueOf;
                String strM;
                boolean z4;
                boolean z5;
                m7m0 m7m0Var;
                int i6;
                int iA;
                ijl ijlVar;
                String str3;
                String strC;
                boolean z6;
                ot0 ot0Var;
                boolean z7;
                Iterator it;
                String str4;
                boolean z8;
                String strA5;
                pt0 pt0Var;
                n0x n0xVar;
                pt0 pt0Var2;
                sso0 uqo0Var;
                nur murVar;
                ww90 ww90Var;
                int i7;
                String str5;
                String str6;
                int i8;
                char c2;
                int i9;
                String strA6;
                String str7;
                int i10;
                ww90 ww90Var2;
                String strA7;
                String strA8;
                a4x a4xVarO0;
                a4x a4xVarO1;
                boolean z9;
                boolean z10;
                int iOrdinal2;
                m7m0 m7m0Var2;
                nw80 nw80Var;
                long j;
                List listJ;
                int iOrdinal3;
                pf8 pf8Var;
                int iOrdinal4;
                m7m0 m7m0Var3;
                pf8 pf8Var2;
                int iOrdinal5;
                m7m0 m7m0Var4;
                int iOrdinal6;
                qp9 qp9Var;
                az5 az5Var;
                int i11;
                int i12;
                int iOrdinal7;
                String strA9;
                String str8;
                vf8 vf8Var;
                pf8 pf8Var3;
                qp9 qp9Var2;
                vf8 vf8Var2;
                int iOrdinal8;
                m7m0 m7m0Var5;
                vf8 vf8Var3;
                int iOrdinal9;
                m7m0 m7m0Var6;
                List list;
                List list2;
                byte b7 = b6;
                String str9 = Separators.SP;
                String str10 = "static/img/android/casino/alt_design/aggregator_gift_card/";
                String str11 = "Background_Picture";
                String str12 = "Background_Illustration";
                String str13 = "Ticket_Secondary";
                String str14 = "";
                y11 y11Var2 = this.b;
                switch (b7) {
                    case 0:
                        y11 y11Var3 = y11Var2;
                        String str15 = "static/img/android/casino/alt_design/aggregator_gift_card/";
                        q11 q11Var2 = (q11) y11Var3.z;
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        m7v m7vVar = (m7v) feeVar2.c();
                        if (m7vVar instanceof k7v) {
                            ArrayList arrayList = ((k7v) m7vVar).f17842a;
                            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                n65 n65Var = (n65) it2.next();
                                c01 c01Var = q11Var2.t;
                                ctf0 ctf0Var2 = y11Var3.b;
                                n65Var.getClass();
                                int i13 = n65Var.c;
                                ctf0Var2.getClass();
                                dqs dqsVar = n65Var.e;
                                String str16 = dqsVar.d;
                                long j2 = n65Var.d.f44639a;
                                int i14 = n65Var.b;
                                Iterator it3 = it2;
                                if (i13 == i14) {
                                    y11Var = y11Var3;
                                    z = n65Var.l == na90.PAYMENT_AFTER_DEPOSIT;
                                    Date date5 = new Date(j2);
                                    if (z) {
                                        String str119 = n65Var.k;
                                        pn40 pn40Var9 = pn40.f27267a;
                                        i = 2;
                                        z2 = true;
                                        strL = kng0.l(str119, Separators.SP, pn40.j(n65Var.j, 2, true));
                                    } else {
                                        i = 2;
                                        z2 = true;
                                        strL = null;
                                    }
                                    if (z != 0) {
                                        String str1110 = n65Var.i;
                                        pn40 pn40Var10 = pn40.f27267a;
                                        strL2 = kng0.l(str1110, Separators.SP, pn40.j(n65Var.h, i, z2));
                                    } else {
                                        strL2 = null;
                                    }
                                    boolean z11 = (strL != null || strL.length() == 0) && (strL2 == null || strL2.length() == 0);
                                    if (z != 0) {
                                        strA = ctf0Var2.b.a(R.string.win_sum_title, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        strA = null;
                                    }
                                    if (z != 0) {
                                        strA2 = ctf0Var2.b.a(R.string.deposit_sum_title, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        strA2 = null;
                                    }
                                    lsm0Var = ctf0Var2.b;
                                    String strA112 = lsm0Var.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
                                    q11 q11Var7 = q11Var2;
                                    z3 = z11;
                                    i2 = (int) n65Var.f22979a;
                                    hnl hnlVarN9 = nkb.N(c01Var);
                                    String strA113 = lsm0Var.a(R.string.free_spins_title, Arrays.copyOf(new Object[0], 0));
                                    sb = new StringBuilder(ujn.h);
                                    iOrdinal = c01Var.ordinal();
                                    if (iOrdinal != 0) {
                                        i3 = i2;
                                        if (iOrdinal != 1) {
                                            str = "Background_Illustration";
                                        } else if (iOrdinal != 2) {
                                            str = "";
                                        } else if (iOrdinal != 3) {
                                            str = "Ticket_Primary";
                                        } else if (iOrdinal == 4) {
                                            str = "Ticket_Secondary";
                                        } else {
                                            t9f.b();
                                        }
                                    } else {
                                        i3 = i2;
                                        str = "Background_Picture";
                                    }
                                    str2 = str15;
                                    strL3 = kng0.l(str2, str, "_Spin.webp");
                                    if (strL3.length() == 0) {
                                        i4 = 0;
                                        sb.setLength(0);
                                        str15 = str2;
                                    } else {
                                        str15 = str2;
                                        i4 = 0;
                                        if (StringsKt.O(strL3, ujn.h, false)) {
                                            sb.setLength(i4);
                                            sb.append(strL3);
                                        } else if (kotlin.text.c.x(strL3, "https://", false)) {
                                            i4 = 0;
                                            sb.setLength(i4);
                                            sb.append(strL3);
                                        } else {
                                            if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                i5 = 1;
                                                c = '/';
                                            } else {
                                                sb.append('/');
                                                c = '/';
                                                i5 = 1;
                                            }
                                            char[] cArr5 = new char[i5];
                                            i4 = 0;
                                            cArr5[0] = c;
                                            sb.append(StringsKt.y0(strL3, cArr5));
                                        }
                                    }
                                    String string5 = sb.toString();
                                    String str1111 = strA112 + Separators.SP + i14;
                                    String strA114 = lsm0Var.a(R.string.for_games_title, Arrays.copyOf(new Object[i4], i4));
                                    if (z != 0) {
                                        strA3 = lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[i4], i4));
                                    } else {
                                        strA3 = lsm0Var.a(R.string.play_button, Arrays.copyOf(new Object[i4], i4));
                                    }
                                    String str24 = strA3;
                                    lak0Var = lak0.c;
                                    if (z != 0) {
                                        i4VarG0 = lak0Var;
                                    } else {
                                        i4VarG0 = dyb.g0(str16);
                                    }
                                    if (z != 0) {
                                        strA4 = "";
                                    } else {
                                        strA4 = lsm0Var.a(R.string.spins_title, Arrays.copyOf(new Object[0], 0));
                                    }
                                    if (z != 0) {
                                        strValueOf = null;
                                    } else {
                                        strValueOf = String.valueOf(i13);
                                    }
                                    if (z) {
                                        strM = null;
                                    } else {
                                        strM = twn.m(i14, " / ");
                                    }
                                    ovl ovlVar5 = new ovl(strA4, strValueOf, strM);
                                    q7n q7nVarR5 = vbw0.R(ctf0Var2, date5, Long.valueOf(j2));
                                    if (strA != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (strA2 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    uzh uzhVar5 = new uzh(hnlVarN9, strA113, "", string5, str1111, "", strA114, strA, strA2, lak0Var, i4VarG0, false, strL, strL2, "", str24, 12, ovlVar5, q7nVarR5, new tzh(true, false, z4, z5));
                                    hnl hnlVarN10 = nkb.N(c01Var);
                                    nw80 nw80Var6 = nw80.b;
                                    if (z3) {
                                        m7m0Var = m7m0.g;
                                    } else {
                                        m7m0Var = m7m0.h;
                                    }
                                    arrayList2.add(new r11(uzhVar5, hnlVarN10, null, null, null, new vf8(dqsVar.c, n65Var.f22979a, nw80Var6, m7m0Var, str16), i3));
                                    it2 = it3;
                                    q11Var2 = q11Var7;
                                    y11Var3 = y11Var;
                                } else {
                                    y11Var = y11Var3;
                                }
                                Date date6 = new Date(j2);
                                if (z) {
                                    String str1112 = n65Var.k;
                                    pn40 pn40Var11 = pn40.f27267a;
                                    i = 2;
                                    z2 = true;
                                    strL = kng0.l(str1112, Separators.SP, pn40.j(n65Var.j, 2, true));
                                } else {
                                    i = 2;
                                    z2 = true;
                                    strL = null;
                                }
                                if (z != 0) {
                                    String str1113 = n65Var.i;
                                    pn40 pn40Var12 = pn40.f27267a;
                                    strL2 = kng0.l(str1113, Separators.SP, pn40.j(n65Var.h, i, z2));
                                } else {
                                    strL2 = null;
                                }
                                if (strL != null) {
                                }
                                if (z != 0) {
                                    strA = ctf0Var2.b.a(R.string.win_sum_title, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA = null;
                                }
                                if (z != 0) {
                                    strA2 = ctf0Var2.b.a(R.string.deposit_sum_title, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA2 = null;
                                }
                                lsm0Var = ctf0Var2.b;
                                String strA115 = lsm0Var.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
                                q11 q11Var8 = q11Var2;
                                z3 = z11;
                                i2 = (int) n65Var.f22979a;
                                hnl hnlVarN11 = nkb.N(c01Var);
                                String strA116 = lsm0Var.a(R.string.free_spins_title, Arrays.copyOf(new Object[0], 0));
                                sb = new StringBuilder(ujn.h);
                                iOrdinal = c01Var.ordinal();
                                if (iOrdinal != 0) {
                                    i3 = i2;
                                    if (iOrdinal != 1) {
                                        str = "Background_Illustration";
                                    } else if (iOrdinal != 2) {
                                        str = "";
                                    } else if (iOrdinal != 3) {
                                        str = "Ticket_Primary";
                                    } else if (iOrdinal == 4) {
                                        str = "Ticket_Secondary";
                                    } else {
                                        t9f.b();
                                    }
                                } else {
                                    i3 = i2;
                                    str = "Background_Picture";
                                }
                                str2 = str15;
                                strL3 = kng0.l(str2, str, "_Spin.webp");
                                if (strL3.length() == 0) {
                                    i4 = 0;
                                    sb.setLength(0);
                                    str15 = str2;
                                } else {
                                    str15 = str2;
                                    i4 = 0;
                                    if (StringsKt.O(strL3, ujn.h, false)) {
                                        sb.setLength(i4);
                                        sb.append(strL3);
                                    } else if (kotlin.text.c.x(strL3, "https://", false)) {
                                        i4 = 0;
                                        sb.setLength(i4);
                                        sb.append(strL3);
                                    } else {
                                        if (sb.length() > 0) {
                                            i5 = 1;
                                            c = '/';
                                        } else {
                                            i5 = 1;
                                            c = '/';
                                        }
                                        char[] cArr6 = new char[i5];
                                        i4 = 0;
                                        cArr6[0] = c;
                                        sb.append(StringsKt.y0(strL3, cArr6));
                                    }
                                }
                                String string6 = sb.toString();
                                String str1114 = strA115 + Separators.SP + i14;
                                String strA117 = lsm0Var.a(R.string.for_games_title, Arrays.copyOf(new Object[i4], i4));
                                if (z != 0) {
                                    strA3 = lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[i4], i4));
                                } else {
                                    strA3 = lsm0Var.a(R.string.play_button, Arrays.copyOf(new Object[i4], i4));
                                }
                                String str25 = strA3;
                                lak0Var = lak0.c;
                                if (z != 0) {
                                    i4VarG0 = lak0Var;
                                } else {
                                    i4VarG0 = dyb.g0(str16);
                                }
                                if (z != 0) {
                                    strA4 = "";
                                } else {
                                    strA4 = lsm0Var.a(R.string.spins_title, Arrays.copyOf(new Object[0], 0));
                                }
                                if (z != 0) {
                                    strValueOf = null;
                                } else {
                                    strValueOf = String.valueOf(i13);
                                }
                                if (z) {
                                    strM = null;
                                } else {
                                    strM = twn.m(i14, " / ");
                                }
                                ovl ovlVar6 = new ovl(strA4, strValueOf, strM);
                                q7n q7nVarR6 = vbw0.R(ctf0Var2, date6, Long.valueOf(j2));
                                if (strA != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (strA2 != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                uzh uzhVar6 = new uzh(hnlVarN11, strA116, "", string6, str1114, "", strA117, strA, strA2, lak0Var, i4VarG0, false, strL, strL2, "", str25, 12, ovlVar6, q7nVarR6, new tzh(true, false, z4, z5));
                                hnl hnlVarN12 = nkb.N(c01Var);
                                nw80 nw80Var7 = nw80.b;
                                if (z3) {
                                    m7m0Var = m7m0.g;
                                } else {
                                    m7m0Var = m7m0.h;
                                }
                                arrayList2.add(new r11(uzhVar6, hnlVarN12, null, null, null, new vf8(dqsVar.c, n65Var.f22979a, nw80Var7, m7m0Var, str16), i3));
                                it2 = it3;
                                q11Var2 = q11Var8;
                                y11Var3 = y11Var;
                            }
                            return dyb.r0(arrayList2);
                        }
                        if (Intrinsics.d(m7vVar, l7v.f19578a)) {
                            return i4w0.N(q11Var2.t);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        g7v g7vVar = (g7v) feeVar3.c();
                        if (!(g7vVar instanceof e7v)) {
                            if (Intrinsics.d(g7vVar, f7v.f9076a)) {
                                zcl zclVar = qmk.f28987a;
                                return new h7v(new gyl(null, s5x0.t(0.0f, 8.0f, 1), 1));
                            }
                            t9f.b();
                            return null;
                        }
                        if (((a4x) ((fee) y11Var2.x.getValue()).b()).size() + ((a4x) ((fee) y11Var2.w.getValue()).b()).size() <= 0) {
                            return i7v.f14312a;
                        }
                        a4x<y6v> a4xVar = ((e7v) g7vVar).f7345a;
                        ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar, 10));
                        for (y6v y6vVar : a4xVar) {
                            ctf0 ctf0Var3 = y11Var2.b;
                            d7v d7vVar = (d7v) ((fee) y11Var2.k.getValue()).c();
                            y6vVar.getClass();
                            d7v d7vVar2 = y6vVar.f42119a;
                            ctf0Var3.getClass();
                            d7vVar.getClass();
                            long jOrdinal = d7vVar2.ordinal();
                            int iOrdinal10 = d7vVar2.ordinal();
                            if (iOrdinal10 == 0) {
                                i6 = R.string.all;
                            } else if (iOrdinal10 == 1) {
                                i6 = R.string.bonuses_title;
                            } else {
                                if (iOrdinal10 != 2) {
                                    t9f.b();
                                    return null;
                                }
                                i6 = R.string.free_spins_title;
                            }
                            xxl xxlVar = new xxl(ctf0Var3.b.a(i6, Arrays.copyOf(new Object[0], 0)));
                            uxl uxlVar = d7vVar2 == d7vVar ? uxl.b : uxl.f36445a;
                            int i15 = y6vVar.b;
                            arrayList3.add(new lxl(jOrdinal, (dyl) xxlVar, false, uxlVar, i15 != 0 ? new cwl(new rpe(i15)) : null, 76));
                        }
                        return new h7v(new fyl(dyb.r0(arrayList3), null, null, s5x0.t(0.0f, 0.0f, 3), null, 22));
                    case 2:
                        int iIntValue = ((Integer) obj).intValue();
                        boolean z12 = ((q11) y11Var2.z).v;
                        int iIntValue2 = ((Number) ((fee) y11Var2.t.getValue()).b()).intValue();
                        if (z12) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.j;
                            xuzVar.getClass();
                            iA = xuz.a(pb10Var, iIntValue);
                        } else {
                            xuz xuzVar2 = pb10.c;
                            pb10 pb10Var2 = pb10.i;
                            xuzVar2.getClass();
                            iA = xuz.a(pb10Var2, iIntValue);
                        }
                        return new mdm(iA, null, null, 0, 0, iIntValue2, 0, 0, 0L, 0L, 990);
                    case 3:
                        ((fee) obj).getClass();
                        fee feeVar4 = (fee) y11Var2.c.getValue();
                        ctf0 ctf0Var4 = y11Var2.b;
                        if (!((Boolean) feeVar4.c()).booleanValue()) {
                            return new zc(ctf0Var4.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) y11Var2.d.getValue()).c();
                        kg kgVar = ((q11) y11Var2.z).u;
                        kgVar.getClass();
                        int iOrdinal11 = kgVar.ordinal();
                        if (iOrdinal11 == 0) {
                            ijlVar = ijl.f14880a;
                        } else if (iOrdinal11 == 1) {
                            ijlVar = ijl.b;
                        } else if (iOrdinal11 == 2) {
                            ijlVar = ijl.c;
                        } else if (iOrdinal11 == 3) {
                            ijlVar = ijl.d;
                        } else {
                            if (iOrdinal11 != 4) {
                                t9f.b();
                                return null;
                            }
                            ijlVar = ijl.e;
                        }
                        if (ql5Var != null) {
                            String strA118 = ql5Var.j;
                            if (ijlVar == ijl.b) {
                                strA118 = ctf0Var4.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA118.length() <= 0) {
                                strA118 = ql5Var.k;
                            }
                            str3 = strA118;
                        } else {
                            str3 = null;
                        }
                        String str26 = str3 == null ? "" : str3;
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var13 = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str27 = strC == null ? "" : strC;
                        String str28 = ql5Var != null ? ql5Var.f : null;
                        String str29 = str28 == null ? "" : str28;
                        String strA119 = ctf0Var4.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        return new xc(ijlVar, new jjl(str27, str29, strA119, str26, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())));
                    case 4:
                        n0o0 n0o0Var = y11Var2.w;
                        n0o0 n0o0Var2 = y11Var2.x;
                        d7v d7vVar3 = (d7v) obj;
                        d7vVar3.getClass();
                        int iOrdinal12 = d7vVar3.ordinal();
                        if (iOrdinal12 == 0) {
                            return CollectionsKt.q0((Collection) ((fee) n0o0Var.getValue()).b(), (Iterable) ((fee) n0o0Var2.getValue()).b());
                        }
                        if (iOrdinal12 == 1) {
                            return (List) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal12 == 2) {
                            return (List) ((fee) n0o0Var2.getValue()).b();
                        }
                        t9f.b();
                        return null;
                    case 5:
                        ((Unit) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(((q11) y11Var2.z).r, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    case 6:
                        y11 y11Var4 = y11Var2;
                        fee feeVar5 = (fee) obj;
                        feeVar5.getClass();
                        Iterable iterable = (Iterable) feeVar5.c();
                        ArrayList arrayList4 = new ArrayList(r3d.q(iterable, 10));
                        Iterator it4 = iterable.iterator();
                        while (it4.hasNext()) {
                            j8b j8bVar = (j8b) it4.next();
                            y11 y11Var5 = y11Var4;
                            ctf0 ctf0Var5 = y11Var5.b;
                            boolean zBooleanValue = ((Boolean) ((fee) y11Var5.c.getValue()).c()).booleanValue();
                            q11 q11Var9 = (q11) y11Var5.z;
                            boolean z13 = q11Var9.v;
                            ot0 ot0Var2 = q11Var9.x;
                            Set set = (Set) ((fee) y11Var5.f.getValue()).c();
                            j8bVar.getClass();
                            ctf0Var5.getClass();
                            set.getClass();
                            List<mlr> list3 = j8bVar.c;
                            ArrayList arrayList5 = new ArrayList(r3d.q(list3, 10));
                            for (mlr mlrVar : list3) {
                                Set set2 = set;
                                if ((set2 instanceof Collection) && set2.isEmpty()) {
                                    z6 = zBooleanValue;
                                    ot0Var = ot0Var2;
                                    z7 = false;
                                } else {
                                    Iterator it5 = set2.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            z6 = zBooleanValue;
                                            ot0Var = ot0Var2;
                                            if (((Number) it5.next()).longValue() == mlrVar.f22006a) {
                                                z7 = true;
                                            } else {
                                                zBooleanValue = z6;
                                                ot0Var2 = ot0Var;
                                            }
                                        } else {
                                            z6 = zBooleanValue;
                                            ot0Var = ot0Var2;
                                            z7 = false;
                                        }
                                    }
                                }
                                pt0 pt0VarG0 = x4d0.g0(ot0Var);
                                Integer numValueOf = Integer.valueOf((int) j8bVar.f16074a);
                                mlrVar.getClass();
                                boolean z14 = mlrVar.k;
                                int i16 = z13 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                boolean z15 = mlrVar.j;
                                if (z14) {
                                    it = it4;
                                    str4 = str14;
                                    z8 = z13;
                                    strA5 = ctf0Var5.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    it = it4;
                                    str4 = str14;
                                    z8 = z13;
                                    strA5 = z15 ? ctf0Var5.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : str4;
                                }
                                Set set3 = set;
                                long j3 = mlrVar.f22006a;
                                String str210 = mlrVar.f;
                                String str211 = mlrVar.e;
                                mtr mtrVar = new mtr(z6 ? z7 ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, z7);
                                n0x n0xVar2 = new n0x(mlrVar.g);
                                m0x m0xVar = new m0x(i16, null, 6);
                                if (strA5.length() == 0) {
                                    murVar = lur.f20686a;
                                    n0xVar = n0xVar2;
                                } else {
                                    pt0 pt0Var3 = pt0.f27539a;
                                    if ((pt0VarG0 == pt0Var3 && z14) || (pt0VarG0 == (pt0Var = pt0.c) && z14)) {
                                        n0xVar = n0xVar2;
                                    } else {
                                        n0xVar = n0xVar2;
                                        pt0 pt0Var4 = pt0.d;
                                        if (pt0VarG0 != pt0Var4 || !z14) {
                                            if ((pt0VarG0 == pt0Var3 && z15) || ((pt0VarG0 == pt0Var && z15) || (pt0VarG0 == pt0Var4 && z15))) {
                                                d4d d4dVar = d4d.PRIMARY;
                                                uqo0Var = new eqo0();
                                            } else {
                                                pt0 pt0Var5 = pt0.b;
                                                uqo0Var = ((pt0VarG0 == pt0Var5 && z14) || (pt0VarG0 == (pt0Var2 = pt0.e) && z14)) ? kro0.f18776a : ((pt0VarG0 == pt0Var5 && z15) || (pt0VarG0 == pt0Var2 && z15)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                            }
                                        }
                                        murVar = new mur(strA5, uqo0Var);
                                    }
                                    d4d d4dVar2 = d4d.PRIMARY;
                                    uqo0Var = new lro0();
                                    murVar = new mur(strA5, uqo0Var);
                                }
                                arrayList5.add(new st0(j3, str210, str211, mtrVar, n0xVar, m0xVar, numValueOf, murVar));
                                zBooleanValue = z6;
                                ot0Var2 = ot0Var;
                                it4 = it;
                                z13 = z8;
                                set = set3;
                                str14 = str4;
                            }
                            arrayList4.add(new h4r0(j8bVar.f16074a, j8bVar.d, j8bVar.b, new hjm(j8bVar.b, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var5.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166), new zll(x4d0.g0(ot0Var2), new wll(o0s.f24443a), arrayList5)));
                            y11Var4 = y11Var5;
                            it4 = it4;
                            str14 = str14;
                        }
                        return dyb.r0(arrayList4);
                    default:
                        q11 q11Var10 = (q11) y11Var2.z;
                        fee feeVar6 = (fee) obj;
                        feeVar6.getClass();
                        b7v b7vVar = (b7v) feeVar6.c();
                        if (b7vVar instanceof z6v) {
                            ArrayList arrayList6 = ((z6v) b7vVar).f43888a;
                            ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                            Iterator it6 = arrayList6.iterator();
                            while (it6.hasNext()) {
                                e65 e65Var = (e65) it6.next();
                                c01 c01Var2 = q11Var10.t;
                                ctf0 ctf0Var6 = y11Var2.b;
                                e65Var.getClass();
                                ArrayList arrayList8 = arrayList7;
                                double d2 = e65Var.b;
                                ctf0Var6.getClass();
                                List list4 = e65Var.k;
                                String str212 = str11;
                                String str213 = str12;
                                long j4 = e65Var.g.f44639a;
                                List list5 = e65Var.o;
                                List list6 = e65Var.n;
                                int i17 = e65Var.f7264a;
                                Iterator it7 = it6;
                                gom0 gom0Var = e65Var.i;
                                String str30 = str13;
                                List list7 = e65Var.l;
                                y11 y11Var6 = y11Var2;
                                if (list4.size() == 1) {
                                    ww90Var = ww90.f39878a;
                                } else if (list4.size() > 1) {
                                    ww90Var = ww90.b;
                                } else if (list6.isEmpty() || !list7.isEmpty()) {
                                    ww90Var = (list7.isEmpty() && list5.isEmpty()) ? ww90.c : ww90.d;
                                } else {
                                    ww90Var = ww90.b;
                                }
                                ArrayList arrayList9 = new ArrayList();
                                q11 q11Var11 = q11Var10;
                                ww90 ww90Var3 = ww90Var;
                                String str31 = str9;
                                lsm0 lsm0Var2 = ctf0Var6.b;
                                String strA1110 = lsm0Var2.a(R.string.for_games_title, Arrays.copyOf(new Object[0], 0));
                                m7m0 m7m0Var7 = m7m0.f21327a;
                                if (!list4.isEmpty()) {
                                    arrayList9.add(new pf8(strA1110, list4, nw80.t, m7m0Var7, new qp9(str14, i17, i17)));
                                }
                                String strA1111 = lsm0Var2.a(R.string.for_unavailable_games_title, Arrays.copyOf(new Object[0], 0));
                                if (!list6.isEmpty()) {
                                    arrayList9.add(new pf8(strA1111, list6, nw80.t, m7m0Var7, new qp9(str14, i17, i17)));
                                }
                                pf8 pf8Var4 = (pf8) CollectionsKt.firstOrNull(arrayList9);
                                ArrayList arrayList10 = new ArrayList();
                                String strA20 = lsm0Var2.a(R.string.for_providers_title, Arrays.copyOf(new Object[0], 0));
                                m7m0 m7m0Var8 = m7m0.b;
                                if (!list7.isEmpty()) {
                                    arrayList10.add(new pf8(strA20, list7, nw80.t, m7m0Var8, new qp9(str14, i17, i17)));
                                }
                                String strA21 = lsm0Var2.a(R.string.for_unavailable_providers_title, Arrays.copyOf(new Object[0], 0));
                                if (!list5.isEmpty()) {
                                    arrayList10.add(new pf8(strA21, list5, nw80.t, m7m0Var8, new qp9(str14, i17, i17)));
                                }
                                pf8 pf8Var5 = (pf8) CollectionsKt.firstOrNull(arrayList10);
                                double d3 = ((double) e65Var.e) * d2;
                                String str32 = str14;
                                DecimalFormat decimalFormat = new DecimalFormat("0.##", DecimalFormatSymbols.getInstance(Locale.US));
                                String str33 = decimalFormat.format(d3);
                                String str34 = decimalFormat.format(e65Var.d);
                                Date date7 = new Date(j4);
                                int i18 = e65Var.f7264a;
                                hnl hnlVarN13 = nkb.N(c01Var2);
                                String strA22 = lsm0Var2.a(R.string.bonus_amount_title, Arrays.copyOf(new Object[0], 0));
                                nnm0 nnm0Var = gom0Var.f11638a;
                                String strA23 = lsm0Var2.a(R.string.bonus_active, Arrays.copyOf(new Object[0], 0));
                                nnm0 nnm0Var2 = nnm0.ACTIVE;
                                if (nnm0Var != nnm0Var2) {
                                    strA23 = null;
                                }
                                String str35 = strA23 == null ? str32 : strA23;
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                int iOrdinal13 = c01Var2.ordinal();
                                if (iOrdinal13 != 0) {
                                    i7 = i18;
                                    if (iOrdinal13 == 1) {
                                        str5 = str213;
                                    } else if (iOrdinal13 == 2) {
                                        str5 = str32;
                                    } else if (iOrdinal13 == 3) {
                                        str5 = "Ticket_Primery";
                                    } else if (iOrdinal13 == 4) {
                                        str5 = str30;
                                    } else {
                                        t9f.b();
                                    }
                                } else {
                                    i7 = i18;
                                    str5 = str212;
                                }
                                String strL4 = kng0.l(str10, str5, "_Bonus.webp");
                                if (strL4.length() == 0) {
                                    sb2.setLength(0);
                                    str6 = str10;
                                } else {
                                    str6 = str10;
                                    int i19 = 0;
                                    if (StringsKt.O(strL4, ujn.h, false)) {
                                        sb2.setLength(i19);
                                        sb2.append(strL4);
                                    } else if (kotlin.text.c.x(strL4, "https://", false)) {
                                        i19 = 0;
                                        sb2.setLength(i19);
                                        sb2.append(strL4);
                                    } else {
                                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                            i8 = 1;
                                            c2 = '/';
                                        } else {
                                            sb2.append('/');
                                            c2 = '/';
                                            i8 = 1;
                                        }
                                        char[] cArr7 = new char[i8];
                                        cArr7[0] = c2;
                                        sb2.append(StringsKt.y0(strL4, cArr7));
                                    }
                                }
                                String string7 = sb2.toString();
                                String str36 = e65Var.c;
                                pn40 pn40Var14 = pn40.f27267a;
                                String strL5 = kng0.l(str36, str31, pn40.c(d2, p3u0.c));
                                String str37 = pf8Var5 != null ? pf8Var5.f26889a : null;
                                String str38 = str37 == null ? str32 : str37;
                                String str39 = pf8Var4 != null ? pf8Var4.f26889a : null;
                                String str40 = str39 == null ? str32 : str39;
                                int iOrdinal14 = nnm0Var.ordinal();
                                if (iOrdinal14 != 0) {
                                    if (iOrdinal14 != 5) {
                                        str7 = str32;
                                        i9 = 0;
                                    } else {
                                        i9 = 0;
                                        strA6 = lsm0Var2.a(R.string.resume, Arrays.copyOf(new Object[0], 0));
                                    }
                                    if (nnm0Var == nnm0Var2) {
                                        i10 = 1;
                                    } else {
                                        i10 = i9;
                                    }
                                    if (nnm0Var == nnm0.READY) {
                                        strA7 = lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[i9], i9));
                                        ww90Var2 = ww90Var3;
                                    } else {
                                        if (i10 != 0) {
                                            ww90Var2 = ww90Var3;
                                            if (ww90Var2 == ww90.f39878a) {
                                                strA8 = lsm0Var2.a(R.string.play_button, Arrays.copyOf(new Object[i9], i9));
                                            }
                                            strA7 = strA8;
                                        } else {
                                            ww90Var2 = ww90Var3;
                                        }
                                        if (i10 == 0 && ww90Var2 == ww90.b) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        } else if (i10 == 0 && ww90Var2 == ww90.d) {
                                            strA8 = lsm0Var2.a(R.string.all_providers, Arrays.copyOf(new Object[i9], i9));
                                        } else if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        } else {
                                            strA7 = str32;
                                        }
                                        strA7 = strA8;
                                    }
                                    if (pf8Var5 != null || (list2 = pf8Var5.b) == null) {
                                        a4xVarO0 = lak0.c;
                                    } else {
                                        ArrayList arrayList11 = new ArrayList(r3d.q(list2, 10));
                                        Iterator it8 = list2.iterator();
                                        while (it8.hasNext()) {
                                            arrayList11.add(((az5) it8.next()).b);
                                        }
                                        a4xVarO0 = dyb.o0(arrayList11);
                                        if (a4xVarO0 == null) {
                                            a4xVarO0 = lak0.c;
                                        }
                                    }
                                    a4x a4xVar10 = a4xVarO0;
                                    if (pf8Var4 != null || (list = pf8Var4.b) == null) {
                                        a4xVarO1 = lak0.c;
                                    } else {
                                        ArrayList arrayList12 = new ArrayList(r3d.q(list, 10));
                                        Iterator it9 = list.iterator();
                                        while (it9.hasNext()) {
                                            arrayList12.add(((az5) it9.next()).b);
                                        }
                                        a4xVarO1 = dyb.o0(arrayList12);
                                        if (a4xVarO1 == null) {
                                            a4xVarO1 = lak0.c;
                                        }
                                    }
                                    a4x a4xVar11 = a4xVarO1;
                                    ovl ovlVar7 = new ovl(lsm0Var2.a(R.string.roleplaying_title, Arrays.copyOf(new Object[0], 0)), str34, kng0.k("/ ", str33));
                                    q7n q7nVarR7 = vbw0.R(ctf0Var6, date7, Long.valueOf(j4));
                                    if (pf8Var5 == null || pf8Var4 != null) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (pf8Var5 != null || pf8Var4 == null) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    uzh uzhVar7 = new uzh(hnlVarN13, strA22, str35, string7, strL5, str38, str40, null, null, a4xVar10, a4xVar11, true, null, null, str7, strA7, 0, ovlVar7, q7nVarR7, new tzh(z9, z10, false, false));
                                    hnl hnlVarN14 = nkb.N(c01Var2);
                                    iOrdinal2 = nnm0Var.ordinal();
                                    if (iOrdinal2 != 0) {
                                        m7m0Var2 = m7m0.f;
                                    } else if (iOrdinal2 != 1) {
                                        m7m0Var2 = m7m0.c;
                                    } else if (iOrdinal2 != 5) {
                                        m7m0Var2 = m7m0.i;
                                    } else {
                                        m7m0Var2 = m7m0.e;
                                    }
                                    m7m0 m7m0Var111 = m7m0Var2;
                                    nw80Var = nw80.b;
                                    j = i17;
                                    vf8 vf8Var8 = new vf8(i17, j, nw80Var, m7m0Var111, "");
                                    listJ = q3d.j(pf8Var4, pf8Var5);
                                    iOrdinal3 = nnm0Var.ordinal();
                                    if (iOrdinal3 != 0) {
                                        if (iOrdinal3 != 1) {
                                            iOrdinal8 = nnm0Var.ordinal();
                                            if (iOrdinal8 != 0) {
                                                m7m0Var5 = m7m0.f;
                                            } else if (iOrdinal8 != 1) {
                                                m7m0Var5 = m7m0.c;
                                            } else if (iOrdinal8 != 5) {
                                                m7m0Var5 = m7m0.i;
                                            } else {
                                                m7m0Var5 = m7m0.e;
                                            }
                                            vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var5, "");
                                        } else if (iOrdinal3 != 5) {
                                            vf8Var = new vf8(0, j, nw80Var, m7m0.i, "");
                                            str14 = str32;
                                        } else {
                                            iOrdinal9 = nnm0Var.ordinal();
                                            if (iOrdinal9 != 0) {
                                                m7m0Var6 = m7m0.f;
                                            } else if (iOrdinal9 != 1) {
                                                m7m0Var6 = m7m0.c;
                                            } else if (iOrdinal9 != 5) {
                                                m7m0Var6 = m7m0.i;
                                            } else {
                                                m7m0Var6 = m7m0.e;
                                            }
                                            vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var6, "");
                                        }
                                        str14 = str32;
                                        vf8Var2 = vf8Var3;
                                        arrayList8.add(new r11(uzhVar7, hnlVarN14, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var8, vf8Var2, i7));
                                        arrayList7 = arrayList8;
                                        str9 = str31;
                                        str10 = str6;
                                        str11 = str212;
                                        str12 = str213;
                                        it6 = it7;
                                        str13 = str30;
                                        y11Var2 = y11Var6;
                                        q11Var10 = q11Var11;
                                    } else {
                                        pf8Var = (pf8) CollectionsKt.firstOrNull(listJ);
                                        if (pf8Var != null) {
                                            pf8Var3 = (pf8) CollectionsKt.firstOrNull(listJ);
                                            if (pf8Var3 != null) {
                                                qp9 qp9Var11 = pf8Var3.e;
                                                qp9Var2 = new qp9(qp9Var11.b, qp9Var11.f29104a, j);
                                                str14 = str32;
                                            } else {
                                                str14 = str32;
                                                qp9Var2 = new qp9(str14, 0, 0L);
                                            }
                                            qp9 qp9Var12 = qp9Var2;
                                            String str45 = pf8Var.f26889a;
                                            List list12 = pf8Var.b;
                                            nw80 nw80Var12 = pf8Var.c;
                                            m7m0 m7m0Var112 = pf8Var.d;
                                            str45.getClass();
                                            list12.getClass();
                                            pf8Var2 = new pf8(str45, list12, nw80Var12, m7m0Var112, qp9Var12);
                                        } else {
                                            str14 = str32;
                                            iun iunVar5 = iun.f15405a;
                                            nw80 nw80Var13 = nw80.t;
                                            iOrdinal4 = nnm0Var.ordinal();
                                            if (iOrdinal4 != 0) {
                                                m7m0Var3 = m7m0.f;
                                            } else if (iOrdinal4 != 1) {
                                                m7m0Var3 = m7m0.c;
                                            } else if (iOrdinal4 != 5) {
                                                m7m0Var3 = m7m0.i;
                                            } else {
                                                m7m0Var3 = m7m0.e;
                                            }
                                            pf8Var2 = new pf8("", iunVar5, nw80Var13, m7m0Var3, new qp9(str14, 0, 0L));
                                        }
                                        iOrdinal5 = ww90Var2.ordinal();
                                        if (iOrdinal5 != 0) {
                                            m7m0Var4 = m7m0.g;
                                        } else if (iOrdinal5 != 1) {
                                            m7m0Var4 = m7m0.f21327a;
                                        } else if (iOrdinal5 != 2) {
                                            m7m0Var4 = m7m0.d;
                                        } else if (iOrdinal5 != 3) {
                                            m7m0Var4 = m7m0.b;
                                        } else if (iOrdinal5 == 4) {
                                            m7m0Var4 = m7m0.i;
                                        } else {
                                            t9f.b();
                                        }
                                        m7m0 m7m0Var113 = m7m0Var4;
                                        iOrdinal6 = ww90Var2.ordinal();
                                        qp9Var = pf8Var2.e;
                                        if (iOrdinal6 != 0) {
                                            az5Var = (az5) CollectionsKt.firstOrNull(pf8Var2.b);
                                            if (az5Var != null) {
                                                i11 = az5Var.f1701a;
                                            } else {
                                                i11 = qp9Var.f29104a;
                                            }
                                            i12 = i11;
                                        } else if (iOrdinal6 != 1 || iOrdinal6 == 3) {
                                            i12 = i17;
                                        } else {
                                            i12 = 0;
                                        }
                                        iOrdinal7 = ww90Var2.ordinal();
                                        if (iOrdinal7 == 0) {
                                            strA9 = qp9Var.b;
                                        } else if (iOrdinal7 != 1 || iOrdinal7 == 2) {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            if (iOrdinal7 == 3) {
                                                strA9 = lsm0Var2.a(R.string.all_providers, Arrays.copyOf(new Object[0], 0));
                                            } else if (iOrdinal7 == 4) {
                                                str8 = str14;
                                            } else {
                                                t9f.b();
                                            }
                                            vf8Var = new vf8(i12, j, nw80Var, m7m0Var113, str8);
                                        }
                                        str8 = strA9;
                                        vf8Var = new vf8(i12, j, nw80Var, m7m0Var113, str8);
                                    }
                                    vf8Var2 = vf8Var;
                                    arrayList8.add(new r11(uzhVar7, hnlVarN14, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var8, vf8Var2, i7));
                                    arrayList7 = arrayList8;
                                    str9 = str31;
                                    str10 = str6;
                                    str11 = str212;
                                    str12 = str213;
                                    it6 = it7;
                                    str13 = str30;
                                    y11Var2 = y11Var6;
                                    q11Var10 = q11Var11;
                                } else {
                                    i9 = 0;
                                    strA6 = lsm0Var2.a(R.string.suspend, Arrays.copyOf(new Object[0], 0));
                                }
                                str7 = strA6;
                                if (nnm0Var == nnm0Var2) {
                                    i10 = 1;
                                } else {
                                    i10 = i9;
                                }
                                if (nnm0Var == nnm0.READY) {
                                    strA7 = lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[i9], i9));
                                    ww90Var2 = ww90Var3;
                                } else {
                                    if (i10 != 0) {
                                        ww90Var2 = ww90Var3;
                                        if (ww90Var2 == ww90.f39878a) {
                                            strA8 = lsm0Var2.a(R.string.play_button, Arrays.copyOf(new Object[i9], i9));
                                        }
                                        strA7 = strA8;
                                    } else {
                                        ww90Var2 = ww90Var3;
                                    }
                                    if (i10 == 0) {
                                        if (i10 == 0) {
                                            if (i10 != 0) {
                                                strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                                strA7 = strA8;
                                            } else {
                                                strA7 = str32;
                                            }
                                        } else if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                            strA7 = strA8;
                                        } else {
                                            strA7 = str32;
                                        }
                                    } else if (i10 == 0) {
                                        if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                            strA7 = strA8;
                                        } else {
                                            strA7 = str32;
                                        }
                                    } else if (i10 != 0) {
                                        strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        strA7 = strA8;
                                    } else {
                                        strA7 = str32;
                                    }
                                }
                                if (pf8Var5 != null) {
                                    a4xVarO0 = lak0.c;
                                } else {
                                    a4xVarO0 = lak0.c;
                                }
                                a4x a4xVar12 = a4xVarO0;
                                if (pf8Var4 != null) {
                                    a4xVarO1 = lak0.c;
                                } else {
                                    a4xVarO1 = lak0.c;
                                }
                                a4x a4xVar13 = a4xVarO1;
                                ovl ovlVar8 = new ovl(lsm0Var2.a(R.string.roleplaying_title, Arrays.copyOf(new Object[0], 0)), str34, kng0.k("/ ", str33));
                                q7n q7nVarR8 = vbw0.R(ctf0Var6, date7, Long.valueOf(j4));
                                if (pf8Var5 == null) {
                                    z9 = true;
                                } else {
                                    z9 = true;
                                }
                                if (pf8Var5 != null) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                uzh uzhVar8 = new uzh(hnlVarN13, strA22, str35, string7, strL5, str38, str40, null, null, a4xVar12, a4xVar13, true, null, null, str7, strA7, 0, ovlVar8, q7nVarR8, new tzh(z9, z10, false, false));
                                hnl hnlVarN15 = nkb.N(c01Var2);
                                iOrdinal2 = nnm0Var.ordinal();
                                if (iOrdinal2 != 0) {
                                    m7m0Var2 = m7m0.f;
                                } else if (iOrdinal2 != 1) {
                                    m7m0Var2 = m7m0.c;
                                } else if (iOrdinal2 != 5) {
                                    m7m0Var2 = m7m0.i;
                                } else {
                                    m7m0Var2 = m7m0.e;
                                }
                                m7m0 m7m0Var114 = m7m0Var2;
                                nw80Var = nw80.b;
                                j = i17;
                                vf8 vf8Var9 = new vf8(i17, j, nw80Var, m7m0Var114, "");
                                listJ = q3d.j(pf8Var4, pf8Var5);
                                iOrdinal3 = nnm0Var.ordinal();
                                if (iOrdinal3 != 0) {
                                    if (iOrdinal3 != 1) {
                                        iOrdinal8 = nnm0Var.ordinal();
                                        if (iOrdinal8 != 0) {
                                            m7m0Var5 = m7m0.f;
                                        } else if (iOrdinal8 != 1) {
                                            m7m0Var5 = m7m0.c;
                                        } else if (iOrdinal8 != 5) {
                                            m7m0Var5 = m7m0.i;
                                        } else {
                                            m7m0Var5 = m7m0.e;
                                        }
                                        vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var5, "");
                                    } else if (iOrdinal3 != 5) {
                                        vf8Var = new vf8(0, j, nw80Var, m7m0.i, "");
                                        str14 = str32;
                                    } else {
                                        iOrdinal9 = nnm0Var.ordinal();
                                        if (iOrdinal9 != 0) {
                                            m7m0Var6 = m7m0.f;
                                        } else if (iOrdinal9 != 1) {
                                            m7m0Var6 = m7m0.c;
                                        } else if (iOrdinal9 != 5) {
                                            m7m0Var6 = m7m0.i;
                                        } else {
                                            m7m0Var6 = m7m0.e;
                                        }
                                        vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var6, "");
                                    }
                                    str14 = str32;
                                    vf8Var2 = vf8Var3;
                                    arrayList8.add(new r11(uzhVar8, hnlVarN15, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var9, vf8Var2, i7));
                                    arrayList7 = arrayList8;
                                    str9 = str31;
                                    str10 = str6;
                                    str11 = str212;
                                    str12 = str213;
                                    it6 = it7;
                                    str13 = str30;
                                    y11Var2 = y11Var6;
                                    q11Var10 = q11Var11;
                                } else {
                                    pf8Var = (pf8) CollectionsKt.firstOrNull(listJ);
                                    if (pf8Var != null) {
                                        pf8Var3 = (pf8) CollectionsKt.firstOrNull(listJ);
                                        if (pf8Var3 != null) {
                                            qp9 qp9Var13 = pf8Var3.e;
                                            qp9Var2 = new qp9(qp9Var13.b, qp9Var13.f29104a, j);
                                            str14 = str32;
                                        } else {
                                            str14 = str32;
                                            qp9Var2 = new qp9(str14, 0, 0L);
                                        }
                                        qp9 qp9Var14 = qp9Var2;
                                        String str46 = pf8Var.f26889a;
                                        List list13 = pf8Var.b;
                                        nw80 nw80Var14 = pf8Var.c;
                                        m7m0 m7m0Var115 = pf8Var.d;
                                        str46.getClass();
                                        list13.getClass();
                                        pf8Var2 = new pf8(str46, list13, nw80Var14, m7m0Var115, qp9Var14);
                                    } else {
                                        str14 = str32;
                                        iun iunVar6 = iun.f15405a;
                                        nw80 nw80Var15 = nw80.t;
                                        iOrdinal4 = nnm0Var.ordinal();
                                        if (iOrdinal4 != 0) {
                                            m7m0Var3 = m7m0.f;
                                        } else if (iOrdinal4 != 1) {
                                            m7m0Var3 = m7m0.c;
                                        } else if (iOrdinal4 != 5) {
                                            m7m0Var3 = m7m0.i;
                                        } else {
                                            m7m0Var3 = m7m0.e;
                                        }
                                        pf8Var2 = new pf8("", iunVar6, nw80Var15, m7m0Var3, new qp9(str14, 0, 0L));
                                    }
                                    iOrdinal5 = ww90Var2.ordinal();
                                    if (iOrdinal5 != 0) {
                                        m7m0Var4 = m7m0.g;
                                    } else if (iOrdinal5 != 1) {
                                        m7m0Var4 = m7m0.f21327a;
                                    } else if (iOrdinal5 != 2) {
                                        m7m0Var4 = m7m0.d;
                                    } else if (iOrdinal5 != 3) {
                                        m7m0Var4 = m7m0.b;
                                    } else if (iOrdinal5 == 4) {
                                        m7m0Var4 = m7m0.i;
                                    } else {
                                        t9f.b();
                                    }
                                    m7m0 m7m0Var116 = m7m0Var4;
                                    iOrdinal6 = ww90Var2.ordinal();
                                    qp9Var = pf8Var2.e;
                                    if (iOrdinal6 != 0) {
                                        az5Var = (az5) CollectionsKt.firstOrNull(pf8Var2.b);
                                        if (az5Var != null) {
                                            i11 = az5Var.f1701a;
                                        } else {
                                            i11 = qp9Var.f29104a;
                                        }
                                        i12 = i11;
                                    } else if (iOrdinal6 != 1) {
                                        i12 = i17;
                                    } else {
                                        i12 = i17;
                                    }
                                    iOrdinal7 = ww90Var2.ordinal();
                                    if (iOrdinal7 == 0) {
                                        if (iOrdinal7 != 1) {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        }
                                        vf8Var = new vf8(i12, j, nw80Var, m7m0Var116, str8);
                                    } else {
                                        strA9 = qp9Var.b;
                                    }
                                    str8 = strA9;
                                    vf8Var = new vf8(i12, j, nw80Var, m7m0Var116, str8);
                                }
                                vf8Var2 = vf8Var;
                                arrayList8.add(new r11(uzhVar8, hnlVarN15, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var9, vf8Var2, i7));
                                arrayList7 = arrayList8;
                                str9 = str31;
                                str10 = str6;
                                str11 = str212;
                                str12 = str213;
                                it6 = it7;
                                str13 = str30;
                                y11Var2 = y11Var6;
                                q11Var10 = q11Var11;
                            }
                            return dyb.r0(arrayList7);
                        }
                        if (Intrinsics.d(b7vVar, a7v.f393a)) {
                            return i4w0.N(q11Var10.t);
                        }
                        t9f.b();
                        return null;
                }
            }
        }, (byte) 20));
        final byte b7 = 7;
        this.w = maz.b(new yw9((fee) n0o0VarH4.getValue(), new Function1(this) { // from class: a.x11
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
            /* JADX WARN: Code duplicated, block: B:103:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:106:0x02c9  */
            /* JADX WARN: Code duplicated, block: B:107:0x02db A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:108:0x02dd  */
            /* JADX WARN: Code duplicated, block: B:110:0x02e3  */
            /* JADX WARN: Code duplicated, block: B:112:0x02f3  */
            /* JADX WARN: Code duplicated, block: B:117:0x0306 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:118:0x0308  */
            /* JADX WARN: Code duplicated, block: B:121:0x031a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:122:0x031c  */
            /* JADX WARN: Code duplicated, block: B:123:0x0327  */
            /* JADX WARN: Code duplicated, block: B:135:0x035a  */
            /* JADX WARN: Code duplicated, block: B:147:0x038e  */
            /* JADX WARN: Code duplicated, block: B:153:0x03bb  */
            /* JADX WARN: Code duplicated, block: B:158:0x03c3  */
            /* JADX WARN: Code duplicated, block: B:161:0x03e7  */
            /* JADX WARN: Code duplicated, block: B:163:0x03ea  */
            /* JADX WARN: Code duplicated, block: B:165:0x03ed  */
            /* JADX WARN: Code duplicated, block: B:167:0x03f2  */
            /* JADX WARN: Code duplicated, block: B:168:0x03f5  */
            /* JADX WARN: Code duplicated, block: B:169:0x03f8  */
            /* JADX WARN: Code duplicated, block: B:172:0x0419  */
            /* JADX WARN: Code duplicated, block: B:174:0x041c  */
            /* JADX WARN: Code duplicated, block: B:176:0x041f  */
            /* JADX WARN: Code duplicated, block: B:178:0x0434  */
            /* JADX WARN: Code duplicated, block: B:180:0x043a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:181:0x043c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:182:0x043e  */
            /* JADX WARN: Code duplicated, block: B:184:0x0443  */
            /* JADX WARN: Code duplicated, block: B:185:0x0446  */
            /* JADX WARN: Code duplicated, block: B:186:0x0449  */
            /* JADX WARN: Code duplicated, block: B:189:0x0459  */
            /* JADX WARN: Code duplicated, block: B:191:0x045f  */
            /* JADX WARN: Code duplicated, block: B:193:0x0462  */
            /* JADX WARN: Code duplicated, block: B:195:0x0465  */
            /* JADX WARN: Code duplicated, block: B:197:0x046a  */
            /* JADX WARN: Code duplicated, block: B:198:0x046d  */
            /* JADX WARN: Code duplicated, block: B:199:0x0470  */
            /* JADX WARN: Code duplicated, block: B:201:0x047b  */
            /* JADX WARN: Code duplicated, block: B:203:0x0487  */
            /* JADX WARN: Code duplicated, block: B:205:0x048f  */
            /* JADX WARN: Code duplicated, block: B:207:0x049f  */
            /* JADX WARN: Code duplicated, block: B:209:0x04c6  */
            /* JADX WARN: Code duplicated, block: B:211:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:213:0x04d7  */
            /* JADX WARN: Code duplicated, block: B:215:0x04da  */
            /* JADX WARN: Code duplicated, block: B:217:0x04df  */
            /* JADX WARN: Code duplicated, block: B:218:0x04e2  */
            /* JADX WARN: Code duplicated, block: B:219:0x04e5  */
            /* JADX WARN: Code duplicated, block: B:223:0x04fd  */
            /* JADX WARN: Code duplicated, block: B:225:0x0500  */
            /* JADX WARN: Code duplicated, block: B:227:0x0503  */
            /* JADX WARN: Code duplicated, block: B:229:0x0506  */
            /* JADX WARN: Code duplicated, block: B:231:0x0509  */
            /* JADX WARN: Code duplicated, block: B:234:0x0513  */
            /* JADX WARN: Code duplicated, block: B:235:0x0516  */
            /* JADX WARN: Code duplicated, block: B:236:0x0519  */
            /* JADX WARN: Code duplicated, block: B:237:0x051c  */
            /* JADX WARN: Code duplicated, block: B:240:0x0527  */
            /* JADX WARN: Code duplicated, block: B:245:0x0530  */
            /* JADX WARN: Code duplicated, block: B:246:0x0533  */
            /* JADX WARN: Code duplicated, block: B:248:0x053d  */
            /* JADX WARN: Code duplicated, block: B:250:0x0542  */
            /* JADX WARN: Code duplicated, block: B:253:0x054b  */
            /* JADX WARN: Code duplicated, block: B:265:0x0570  */
            /* JADX WARN: Code duplicated, block: B:266:0x057f  */
            /* JADX WARN: Code duplicated, block: B:468:0x0b96  */
            /* JADX WARN: Code duplicated, block: B:469:0x0bb1  */
            /* JADX WARN: Code duplicated, block: B:471:0x0bbf  */
            /* JADX WARN: Code duplicated, block: B:472:0x0bd0  */
            /* JADX WARN: Code duplicated, block: B:484:0x0be9  */
            /* JADX WARN: Code duplicated, block: B:485:0x0bfb  */
            /* JADX WARN: Code duplicated, block: B:487:0x0bff  */
            /* JADX WARN: Code duplicated, block: B:488:0x0c11  */
            /* JADX WARN: Code duplicated, block: B:491:0x0c46  */
            /* JADX WARN: Code duplicated, block: B:493:0x0c4b  */
            /* JADX WARN: Code duplicated, block: B:495:0x0c4e  */
            /* JADX WARN: Code duplicated, block: B:497:0x0c51  */
            /* JADX WARN: Code duplicated, block: B:499:0x0c54  */
            /* JADX WARN: Code duplicated, block: B:502:0x0c5d  */
            /* JADX WARN: Code duplicated, block: B:503:0x0c61  */
            /* JADX WARN: Code duplicated, block: B:504:0x0c64  */
            /* JADX WARN: Code duplicated, block: B:505:0x0c67  */
            /* JADX WARN: Code duplicated, block: B:508:0x0c7b  */
            /* JADX WARN: Code duplicated, block: B:509:0x0c84  */
            /* JADX WARN: Code duplicated, block: B:511:0x0c8f  */
            /* JADX WARN: Code duplicated, block: B:513:0x0c95  */
            /* JADX WARN: Code duplicated, block: B:514:0x0c96 A[PHI: r15
  0x0c96: PHI (r15v12 int) = (r15v11 int), (r15v17 int) binds: [B:510:0x0c8d, B:513:0x0c95] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:515:0x0c99  */
            /* JADX WARN: Code duplicated, block: B:520:0x0cae  */
            /* JADX WARN: Code duplicated, block: B:525:0x0ce6  */
            /* JADX WARN: Code duplicated, block: B:527:0x0cf9  */
            /* JADX WARN: Code duplicated, block: B:530:0x0d0b  */
            /* JADX WARN: Code duplicated, block: B:531:0x0d0e  */
            /* JADX WARN: Code duplicated, block: B:534:0x0d1c  */
            /* JADX WARN: Code duplicated, block: B:535:0x0d1f  */
            /* JADX WARN: Code duplicated, block: B:537:0x0d2f  */
            /* JADX WARN: Code duplicated, block: B:538:0x0d31  */
            /* JADX WARN: Code duplicated, block: B:540:0x0d37  */
            /* JADX WARN: Code duplicated, block: B:541:0x0d39  */
            /* JADX WARN: Code duplicated, block: B:544:0x0d4e  */
            /* JADX WARN: Code duplicated, block: B:545:0x0d50  */
            /* JADX WARN: Code duplicated, block: B:547:0x0d53  */
            /* JADX WARN: Code duplicated, block: B:549:0x0d57  */
            /* JADX WARN: Code duplicated, block: B:552:0x0d79  */
            /* JADX WARN: Code duplicated, block: B:554:0x0d7e  */
            /* JADX WARN: Code duplicated, block: B:564:0x050e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:579:0x0c57 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y11 y11Var;
                boolean z;
                int i;
                boolean z2;
                String strL;
                String strL2;
                String strA;
                String strA2;
                lsm0 lsm0Var;
                boolean z3;
                int i2;
                StringBuilder sb;
                int iOrdinal;
                int i3;
                String str;
                String str2;
                String strL3;
                int i4;
                int i5;
                char c;
                String strA3;
                lak0 lak0Var;
                i4 i4VarG0;
                String strA4;
                String strValueOf;
                String strM;
                boolean z4;
                boolean z5;
                m7m0 m7m0Var;
                int i6;
                int iA;
                ijl ijlVar;
                String str3;
                String strC;
                boolean z6;
                ot0 ot0Var;
                boolean z7;
                Iterator it;
                String str4;
                boolean z8;
                String strA5;
                pt0 pt0Var;
                n0x n0xVar;
                pt0 pt0Var2;
                sso0 uqo0Var;
                nur murVar;
                ww90 ww90Var;
                int i7;
                String str5;
                String str6;
                int i8;
                char c2;
                int i9;
                String strA6;
                String str7;
                int i10;
                ww90 ww90Var2;
                String strA7;
                String strA8;
                a4x a4xVarO0;
                a4x a4xVarO1;
                boolean z9;
                boolean z10;
                int iOrdinal2;
                m7m0 m7m0Var2;
                nw80 nw80Var;
                long j;
                List listJ;
                int iOrdinal3;
                pf8 pf8Var;
                int iOrdinal4;
                m7m0 m7m0Var3;
                pf8 pf8Var2;
                int iOrdinal5;
                m7m0 m7m0Var4;
                int iOrdinal6;
                qp9 qp9Var;
                az5 az5Var;
                int i11;
                int i12;
                int iOrdinal7;
                String strA9;
                String str8;
                vf8 vf8Var;
                pf8 pf8Var3;
                qp9 qp9Var2;
                vf8 vf8Var2;
                int iOrdinal8;
                m7m0 m7m0Var5;
                vf8 vf8Var3;
                int iOrdinal9;
                m7m0 m7m0Var6;
                List list;
                List list2;
                byte b8 = b7;
                String str9 = Separators.SP;
                String str10 = "static/img/android/casino/alt_design/aggregator_gift_card/";
                String str11 = "Background_Picture";
                String str12 = "Background_Illustration";
                String str13 = "Ticket_Secondary";
                String str14 = "";
                y11 y11Var2 = this.b;
                switch (b8) {
                    case 0:
                        y11 y11Var3 = y11Var2;
                        String str15 = "static/img/android/casino/alt_design/aggregator_gift_card/";
                        q11 q11Var2 = (q11) y11Var3.z;
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        m7v m7vVar = (m7v) feeVar2.c();
                        if (m7vVar instanceof k7v) {
                            ArrayList arrayList = ((k7v) m7vVar).f17842a;
                            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                n65 n65Var = (n65) it2.next();
                                c01 c01Var = q11Var2.t;
                                ctf0 ctf0Var2 = y11Var3.b;
                                n65Var.getClass();
                                int i13 = n65Var.c;
                                ctf0Var2.getClass();
                                dqs dqsVar = n65Var.e;
                                String str16 = dqsVar.d;
                                long j2 = n65Var.d.f44639a;
                                int i14 = n65Var.b;
                                Iterator it3 = it2;
                                if (i13 == i14) {
                                    y11Var = y11Var3;
                                    z = n65Var.l == na90.PAYMENT_AFTER_DEPOSIT;
                                    Date date6 = new Date(j2);
                                    if (z) {
                                        String str1112 = n65Var.k;
                                        pn40 pn40Var11 = pn40.f27267a;
                                        i = 2;
                                        z2 = true;
                                        strL = kng0.l(str1112, Separators.SP, pn40.j(n65Var.j, 2, true));
                                    } else {
                                        i = 2;
                                        z2 = true;
                                        strL = null;
                                    }
                                    if (z != 0) {
                                        String str1113 = n65Var.i;
                                        pn40 pn40Var12 = pn40.f27267a;
                                        strL2 = kng0.l(str1113, Separators.SP, pn40.j(n65Var.h, i, z2));
                                    } else {
                                        strL2 = null;
                                    }
                                    boolean z11 = (strL != null || strL.length() == 0) && (strL2 == null || strL2.length() == 0);
                                    if (z != 0) {
                                        strA = ctf0Var2.b.a(R.string.win_sum_title, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        strA = null;
                                    }
                                    if (z != 0) {
                                        strA2 = ctf0Var2.b.a(R.string.deposit_sum_title, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        strA2 = null;
                                    }
                                    lsm0Var = ctf0Var2.b;
                                    String strA115 = lsm0Var.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
                                    q11 q11Var8 = q11Var2;
                                    z3 = z11;
                                    i2 = (int) n65Var.f22979a;
                                    hnl hnlVarN11 = nkb.N(c01Var);
                                    String strA116 = lsm0Var.a(R.string.free_spins_title, Arrays.copyOf(new Object[0], 0));
                                    sb = new StringBuilder(ujn.h);
                                    iOrdinal = c01Var.ordinal();
                                    if (iOrdinal != 0) {
                                        i3 = i2;
                                        if (iOrdinal != 1) {
                                            str = "Background_Illustration";
                                        } else if (iOrdinal != 2) {
                                            str = "";
                                        } else if (iOrdinal != 3) {
                                            str = "Ticket_Primary";
                                        } else if (iOrdinal == 4) {
                                            str = "Ticket_Secondary";
                                        } else {
                                            t9f.b();
                                        }
                                    } else {
                                        i3 = i2;
                                        str = "Background_Picture";
                                    }
                                    str2 = str15;
                                    strL3 = kng0.l(str2, str, "_Spin.webp");
                                    if (strL3.length() == 0) {
                                        i4 = 0;
                                        sb.setLength(0);
                                        str15 = str2;
                                    } else {
                                        str15 = str2;
                                        i4 = 0;
                                        if (StringsKt.O(strL3, ujn.h, false)) {
                                            sb.setLength(i4);
                                            sb.append(strL3);
                                        } else if (kotlin.text.c.x(strL3, "https://", false)) {
                                            i4 = 0;
                                            sb.setLength(i4);
                                            sb.append(strL3);
                                        } else {
                                            if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                i5 = 1;
                                                c = '/';
                                            } else {
                                                sb.append('/');
                                                c = '/';
                                                i5 = 1;
                                            }
                                            char[] cArr6 = new char[i5];
                                            i4 = 0;
                                            cArr6[0] = c;
                                            sb.append(StringsKt.y0(strL3, cArr6));
                                        }
                                    }
                                    String string6 = sb.toString();
                                    String str1114 = strA115 + Separators.SP + i14;
                                    String strA117 = lsm0Var.a(R.string.for_games_title, Arrays.copyOf(new Object[i4], i4));
                                    if (z != 0) {
                                        strA3 = lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[i4], i4));
                                    } else {
                                        strA3 = lsm0Var.a(R.string.play_button, Arrays.copyOf(new Object[i4], i4));
                                    }
                                    String str25 = strA3;
                                    lak0Var = lak0.c;
                                    if (z != 0) {
                                        i4VarG0 = lak0Var;
                                    } else {
                                        i4VarG0 = dyb.g0(str16);
                                    }
                                    if (z != 0) {
                                        strA4 = "";
                                    } else {
                                        strA4 = lsm0Var.a(R.string.spins_title, Arrays.copyOf(new Object[0], 0));
                                    }
                                    if (z != 0) {
                                        strValueOf = null;
                                    } else {
                                        strValueOf = String.valueOf(i13);
                                    }
                                    if (z) {
                                        strM = null;
                                    } else {
                                        strM = twn.m(i14, " / ");
                                    }
                                    ovl ovlVar6 = new ovl(strA4, strValueOf, strM);
                                    q7n q7nVarR6 = vbw0.R(ctf0Var2, date6, Long.valueOf(j2));
                                    if (strA != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (strA2 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    uzh uzhVar6 = new uzh(hnlVarN11, strA116, "", string6, str1114, "", strA117, strA, strA2, lak0Var, i4VarG0, false, strL, strL2, "", str25, 12, ovlVar6, q7nVarR6, new tzh(true, false, z4, z5));
                                    hnl hnlVarN12 = nkb.N(c01Var);
                                    nw80 nw80Var7 = nw80.b;
                                    if (z3) {
                                        m7m0Var = m7m0.g;
                                    } else {
                                        m7m0Var = m7m0.h;
                                    }
                                    arrayList2.add(new r11(uzhVar6, hnlVarN12, null, null, null, new vf8(dqsVar.c, n65Var.f22979a, nw80Var7, m7m0Var, str16), i3));
                                    it2 = it3;
                                    q11Var2 = q11Var8;
                                    y11Var3 = y11Var;
                                } else {
                                    y11Var = y11Var3;
                                }
                                Date date7 = new Date(j2);
                                if (z) {
                                    String str1115 = n65Var.k;
                                    pn40 pn40Var13 = pn40.f27267a;
                                    i = 2;
                                    z2 = true;
                                    strL = kng0.l(str1115, Separators.SP, pn40.j(n65Var.j, 2, true));
                                } else {
                                    i = 2;
                                    z2 = true;
                                    strL = null;
                                }
                                if (z != 0) {
                                    String str1116 = n65Var.i;
                                    pn40 pn40Var14 = pn40.f27267a;
                                    strL2 = kng0.l(str1116, Separators.SP, pn40.j(n65Var.h, i, z2));
                                } else {
                                    strL2 = null;
                                }
                                if (strL != null) {
                                }
                                if (z != 0) {
                                    strA = ctf0Var2.b.a(R.string.win_sum_title, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA = null;
                                }
                                if (z != 0) {
                                    strA2 = ctf0Var2.b.a(R.string.deposit_sum_title, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA2 = null;
                                }
                                lsm0Var = ctf0Var2.b;
                                String strA118 = lsm0Var.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
                                q11 q11Var9 = q11Var2;
                                z3 = z11;
                                i2 = (int) n65Var.f22979a;
                                hnl hnlVarN13 = nkb.N(c01Var);
                                String strA119 = lsm0Var.a(R.string.free_spins_title, Arrays.copyOf(new Object[0], 0));
                                sb = new StringBuilder(ujn.h);
                                iOrdinal = c01Var.ordinal();
                                if (iOrdinal != 0) {
                                    i3 = i2;
                                    if (iOrdinal != 1) {
                                        str = "Background_Illustration";
                                    } else if (iOrdinal != 2) {
                                        str = "";
                                    } else if (iOrdinal != 3) {
                                        str = "Ticket_Primary";
                                    } else if (iOrdinal == 4) {
                                        str = "Ticket_Secondary";
                                    } else {
                                        t9f.b();
                                    }
                                } else {
                                    i3 = i2;
                                    str = "Background_Picture";
                                }
                                str2 = str15;
                                strL3 = kng0.l(str2, str, "_Spin.webp");
                                if (strL3.length() == 0) {
                                    i4 = 0;
                                    sb.setLength(0);
                                    str15 = str2;
                                } else {
                                    str15 = str2;
                                    i4 = 0;
                                    if (StringsKt.O(strL3, ujn.h, false)) {
                                        sb.setLength(i4);
                                        sb.append(strL3);
                                    } else if (kotlin.text.c.x(strL3, "https://", false)) {
                                        i4 = 0;
                                        sb.setLength(i4);
                                        sb.append(strL3);
                                    } else {
                                        if (sb.length() > 0) {
                                            i5 = 1;
                                            c = '/';
                                        } else {
                                            i5 = 1;
                                            c = '/';
                                        }
                                        char[] cArr7 = new char[i5];
                                        i4 = 0;
                                        cArr7[0] = c;
                                        sb.append(StringsKt.y0(strL3, cArr7));
                                    }
                                }
                                String string7 = sb.toString();
                                String str1117 = strA118 + Separators.SP + i14;
                                String strA1110 = lsm0Var.a(R.string.for_games_title, Arrays.copyOf(new Object[i4], i4));
                                if (z != 0) {
                                    strA3 = lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[i4], i4));
                                } else {
                                    strA3 = lsm0Var.a(R.string.play_button, Arrays.copyOf(new Object[i4], i4));
                                }
                                String str26 = strA3;
                                lak0Var = lak0.c;
                                if (z != 0) {
                                    i4VarG0 = lak0Var;
                                } else {
                                    i4VarG0 = dyb.g0(str16);
                                }
                                if (z != 0) {
                                    strA4 = "";
                                } else {
                                    strA4 = lsm0Var.a(R.string.spins_title, Arrays.copyOf(new Object[0], 0));
                                }
                                if (z != 0) {
                                    strValueOf = null;
                                } else {
                                    strValueOf = String.valueOf(i13);
                                }
                                if (z) {
                                    strM = null;
                                } else {
                                    strM = twn.m(i14, " / ");
                                }
                                ovl ovlVar7 = new ovl(strA4, strValueOf, strM);
                                q7n q7nVarR7 = vbw0.R(ctf0Var2, date7, Long.valueOf(j2));
                                if (strA != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (strA2 != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                uzh uzhVar7 = new uzh(hnlVarN13, strA119, "", string7, str1117, "", strA1110, strA, strA2, lak0Var, i4VarG0, false, strL, strL2, "", str26, 12, ovlVar7, q7nVarR7, new tzh(true, false, z4, z5));
                                hnl hnlVarN14 = nkb.N(c01Var);
                                nw80 nw80Var8 = nw80.b;
                                if (z3) {
                                    m7m0Var = m7m0.g;
                                } else {
                                    m7m0Var = m7m0.h;
                                }
                                arrayList2.add(new r11(uzhVar7, hnlVarN14, null, null, null, new vf8(dqsVar.c, n65Var.f22979a, nw80Var8, m7m0Var, str16), i3));
                                it2 = it3;
                                q11Var2 = q11Var9;
                                y11Var3 = y11Var;
                            }
                            return dyb.r0(arrayList2);
                        }
                        if (Intrinsics.d(m7vVar, l7v.f19578a)) {
                            return i4w0.N(q11Var2.t);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        g7v g7vVar = (g7v) feeVar3.c();
                        if (!(g7vVar instanceof e7v)) {
                            if (Intrinsics.d(g7vVar, f7v.f9076a)) {
                                zcl zclVar = qmk.f28987a;
                                return new h7v(new gyl(null, s5x0.t(0.0f, 8.0f, 1), 1));
                            }
                            t9f.b();
                            return null;
                        }
                        if (((a4x) ((fee) y11Var2.x.getValue()).b()).size() + ((a4x) ((fee) y11Var2.w.getValue()).b()).size() <= 0) {
                            return i7v.f14312a;
                        }
                        a4x<y6v> a4xVar = ((e7v) g7vVar).f7345a;
                        ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar, 10));
                        for (y6v y6vVar : a4xVar) {
                            ctf0 ctf0Var3 = y11Var2.b;
                            d7v d7vVar = (d7v) ((fee) y11Var2.k.getValue()).c();
                            y6vVar.getClass();
                            d7v d7vVar2 = y6vVar.f42119a;
                            ctf0Var3.getClass();
                            d7vVar.getClass();
                            long jOrdinal = d7vVar2.ordinal();
                            int iOrdinal10 = d7vVar2.ordinal();
                            if (iOrdinal10 == 0) {
                                i6 = R.string.all;
                            } else if (iOrdinal10 == 1) {
                                i6 = R.string.bonuses_title;
                            } else {
                                if (iOrdinal10 != 2) {
                                    t9f.b();
                                    return null;
                                }
                                i6 = R.string.free_spins_title;
                            }
                            xxl xxlVar = new xxl(ctf0Var3.b.a(i6, Arrays.copyOf(new Object[0], 0)));
                            uxl uxlVar = d7vVar2 == d7vVar ? uxl.b : uxl.f36445a;
                            int i15 = y6vVar.b;
                            arrayList3.add(new lxl(jOrdinal, (dyl) xxlVar, false, uxlVar, i15 != 0 ? new cwl(new rpe(i15)) : null, 76));
                        }
                        return new h7v(new fyl(dyb.r0(arrayList3), null, null, s5x0.t(0.0f, 0.0f, 3), null, 22));
                    case 2:
                        int iIntValue = ((Integer) obj).intValue();
                        boolean z12 = ((q11) y11Var2.z).v;
                        int iIntValue2 = ((Number) ((fee) y11Var2.t.getValue()).b()).intValue();
                        if (z12) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.j;
                            xuzVar.getClass();
                            iA = xuz.a(pb10Var, iIntValue);
                        } else {
                            xuz xuzVar2 = pb10.c;
                            pb10 pb10Var2 = pb10.i;
                            xuzVar2.getClass();
                            iA = xuz.a(pb10Var2, iIntValue);
                        }
                        return new mdm(iA, null, null, 0, 0, iIntValue2, 0, 0, 0L, 0L, 990);
                    case 3:
                        ((fee) obj).getClass();
                        fee feeVar4 = (fee) y11Var2.c.getValue();
                        ctf0 ctf0Var4 = y11Var2.b;
                        if (!((Boolean) feeVar4.c()).booleanValue()) {
                            return new zc(ctf0Var4.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) y11Var2.d.getValue()).c();
                        kg kgVar = ((q11) y11Var2.z).u;
                        kgVar.getClass();
                        int iOrdinal11 = kgVar.ordinal();
                        if (iOrdinal11 == 0) {
                            ijlVar = ijl.f14880a;
                        } else if (iOrdinal11 == 1) {
                            ijlVar = ijl.b;
                        } else if (iOrdinal11 == 2) {
                            ijlVar = ijl.c;
                        } else if (iOrdinal11 == 3) {
                            ijlVar = ijl.d;
                        } else {
                            if (iOrdinal11 != 4) {
                                t9f.b();
                                return null;
                            }
                            ijlVar = ijl.e;
                        }
                        if (ql5Var != null) {
                            String strA1111 = ql5Var.j;
                            if (ijlVar == ijl.b) {
                                strA1111 = ctf0Var4.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA1111.length() <= 0) {
                                strA1111 = ql5Var.k;
                            }
                            str3 = strA1111;
                        } else {
                            str3 = null;
                        }
                        String str27 = str3 == null ? "" : str3;
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var15 = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str28 = strC == null ? "" : strC;
                        String str29 = ql5Var != null ? ql5Var.f : null;
                        String str210 = str29 == null ? "" : str29;
                        String strA1112 = ctf0Var4.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        return new xc(ijlVar, new jjl(str28, str210, strA1112, str27, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())));
                    case 4:
                        n0o0 n0o0Var = y11Var2.w;
                        n0o0 n0o0Var2 = y11Var2.x;
                        d7v d7vVar3 = (d7v) obj;
                        d7vVar3.getClass();
                        int iOrdinal12 = d7vVar3.ordinal();
                        if (iOrdinal12 == 0) {
                            return CollectionsKt.q0((Collection) ((fee) n0o0Var.getValue()).b(), (Iterable) ((fee) n0o0Var2.getValue()).b());
                        }
                        if (iOrdinal12 == 1) {
                            return (List) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal12 == 2) {
                            return (List) ((fee) n0o0Var2.getValue()).b();
                        }
                        t9f.b();
                        return null;
                    case 5:
                        ((Unit) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(((q11) y11Var2.z).r, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    case 6:
                        y11 y11Var4 = y11Var2;
                        fee feeVar5 = (fee) obj;
                        feeVar5.getClass();
                        Iterable iterable = (Iterable) feeVar5.c();
                        ArrayList arrayList4 = new ArrayList(r3d.q(iterable, 10));
                        Iterator it4 = iterable.iterator();
                        while (it4.hasNext()) {
                            j8b j8bVar = (j8b) it4.next();
                            y11 y11Var5 = y11Var4;
                            ctf0 ctf0Var5 = y11Var5.b;
                            boolean zBooleanValue = ((Boolean) ((fee) y11Var5.c.getValue()).c()).booleanValue();
                            q11 q11Var10 = (q11) y11Var5.z;
                            boolean z13 = q11Var10.v;
                            ot0 ot0Var2 = q11Var10.x;
                            Set set = (Set) ((fee) y11Var5.f.getValue()).c();
                            j8bVar.getClass();
                            ctf0Var5.getClass();
                            set.getClass();
                            List<mlr> list3 = j8bVar.c;
                            ArrayList arrayList5 = new ArrayList(r3d.q(list3, 10));
                            for (mlr mlrVar : list3) {
                                Set set2 = set;
                                if ((set2 instanceof Collection) && set2.isEmpty()) {
                                    z6 = zBooleanValue;
                                    ot0Var = ot0Var2;
                                    z7 = false;
                                } else {
                                    Iterator it5 = set2.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            z6 = zBooleanValue;
                                            ot0Var = ot0Var2;
                                            if (((Number) it5.next()).longValue() == mlrVar.f22006a) {
                                                z7 = true;
                                            } else {
                                                zBooleanValue = z6;
                                                ot0Var2 = ot0Var;
                                            }
                                        } else {
                                            z6 = zBooleanValue;
                                            ot0Var = ot0Var2;
                                            z7 = false;
                                        }
                                    }
                                }
                                pt0 pt0VarG0 = x4d0.g0(ot0Var);
                                Integer numValueOf = Integer.valueOf((int) j8bVar.f16074a);
                                mlrVar.getClass();
                                boolean z14 = mlrVar.k;
                                int i16 = z13 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                boolean z15 = mlrVar.j;
                                if (z14) {
                                    it = it4;
                                    str4 = str14;
                                    z8 = z13;
                                    strA5 = ctf0Var5.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    it = it4;
                                    str4 = str14;
                                    z8 = z13;
                                    strA5 = z15 ? ctf0Var5.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : str4;
                                }
                                Set set3 = set;
                                long j3 = mlrVar.f22006a;
                                String str211 = mlrVar.f;
                                String str212 = mlrVar.e;
                                mtr mtrVar = new mtr(z6 ? z7 ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, z7);
                                n0x n0xVar2 = new n0x(mlrVar.g);
                                m0x m0xVar = new m0x(i16, null, 6);
                                if (strA5.length() == 0) {
                                    murVar = lur.f20686a;
                                    n0xVar = n0xVar2;
                                } else {
                                    pt0 pt0Var3 = pt0.f27539a;
                                    if ((pt0VarG0 == pt0Var3 && z14) || (pt0VarG0 == (pt0Var = pt0.c) && z14)) {
                                        n0xVar = n0xVar2;
                                    } else {
                                        n0xVar = n0xVar2;
                                        pt0 pt0Var4 = pt0.d;
                                        if (pt0VarG0 != pt0Var4 || !z14) {
                                            if ((pt0VarG0 == pt0Var3 && z15) || ((pt0VarG0 == pt0Var && z15) || (pt0VarG0 == pt0Var4 && z15))) {
                                                d4d d4dVar = d4d.PRIMARY;
                                                uqo0Var = new eqo0();
                                            } else {
                                                pt0 pt0Var5 = pt0.b;
                                                uqo0Var = ((pt0VarG0 == pt0Var5 && z14) || (pt0VarG0 == (pt0Var2 = pt0.e) && z14)) ? kro0.f18776a : ((pt0VarG0 == pt0Var5 && z15) || (pt0VarG0 == pt0Var2 && z15)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                            }
                                        }
                                        murVar = new mur(strA5, uqo0Var);
                                    }
                                    d4d d4dVar2 = d4d.PRIMARY;
                                    uqo0Var = new lro0();
                                    murVar = new mur(strA5, uqo0Var);
                                }
                                arrayList5.add(new st0(j3, str211, str212, mtrVar, n0xVar, m0xVar, numValueOf, murVar));
                                zBooleanValue = z6;
                                ot0Var2 = ot0Var;
                                it4 = it;
                                z13 = z8;
                                set = set3;
                                str14 = str4;
                            }
                            arrayList4.add(new h4r0(j8bVar.f16074a, j8bVar.d, j8bVar.b, new hjm(j8bVar.b, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var5.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166), new zll(x4d0.g0(ot0Var2), new wll(o0s.f24443a), arrayList5)));
                            y11Var4 = y11Var5;
                            it4 = it4;
                            str14 = str14;
                        }
                        return dyb.r0(arrayList4);
                    default:
                        q11 q11Var11 = (q11) y11Var2.z;
                        fee feeVar6 = (fee) obj;
                        feeVar6.getClass();
                        b7v b7vVar = (b7v) feeVar6.c();
                        if (b7vVar instanceof z6v) {
                            ArrayList arrayList6 = ((z6v) b7vVar).f43888a;
                            ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                            Iterator it6 = arrayList6.iterator();
                            while (it6.hasNext()) {
                                e65 e65Var = (e65) it6.next();
                                c01 c01Var2 = q11Var11.t;
                                ctf0 ctf0Var6 = y11Var2.b;
                                e65Var.getClass();
                                ArrayList arrayList8 = arrayList7;
                                double d2 = e65Var.b;
                                ctf0Var6.getClass();
                                List list4 = e65Var.k;
                                String str213 = str11;
                                String str214 = str12;
                                long j4 = e65Var.g.f44639a;
                                List list5 = e65Var.o;
                                List list6 = e65Var.n;
                                int i17 = e65Var.f7264a;
                                Iterator it7 = it6;
                                gom0 gom0Var = e65Var.i;
                                String str30 = str13;
                                List list7 = e65Var.l;
                                y11 y11Var6 = y11Var2;
                                if (list4.size() == 1) {
                                    ww90Var = ww90.f39878a;
                                } else if (list4.size() > 1) {
                                    ww90Var = ww90.b;
                                } else if (list6.isEmpty() || !list7.isEmpty()) {
                                    ww90Var = (list7.isEmpty() && list5.isEmpty()) ? ww90.c : ww90.d;
                                } else {
                                    ww90Var = ww90.b;
                                }
                                ArrayList arrayList9 = new ArrayList();
                                q11 q11Var12 = q11Var11;
                                ww90 ww90Var3 = ww90Var;
                                String str31 = str9;
                                lsm0 lsm0Var2 = ctf0Var6.b;
                                String strA1113 = lsm0Var2.a(R.string.for_games_title, Arrays.copyOf(new Object[0], 0));
                                m7m0 m7m0Var7 = m7m0.f21327a;
                                if (!list4.isEmpty()) {
                                    arrayList9.add(new pf8(strA1113, list4, nw80.t, m7m0Var7, new qp9(str14, i17, i17)));
                                }
                                String strA1114 = lsm0Var2.a(R.string.for_unavailable_games_title, Arrays.copyOf(new Object[0], 0));
                                if (!list6.isEmpty()) {
                                    arrayList9.add(new pf8(strA1114, list6, nw80.t, m7m0Var7, new qp9(str14, i17, i17)));
                                }
                                pf8 pf8Var4 = (pf8) CollectionsKt.firstOrNull(arrayList9);
                                ArrayList arrayList10 = new ArrayList();
                                String strA20 = lsm0Var2.a(R.string.for_providers_title, Arrays.copyOf(new Object[0], 0));
                                m7m0 m7m0Var8 = m7m0.b;
                                if (!list7.isEmpty()) {
                                    arrayList10.add(new pf8(strA20, list7, nw80.t, m7m0Var8, new qp9(str14, i17, i17)));
                                }
                                String strA21 = lsm0Var2.a(R.string.for_unavailable_providers_title, Arrays.copyOf(new Object[0], 0));
                                if (!list5.isEmpty()) {
                                    arrayList10.add(new pf8(strA21, list5, nw80.t, m7m0Var8, new qp9(str14, i17, i17)));
                                }
                                pf8 pf8Var5 = (pf8) CollectionsKt.firstOrNull(arrayList10);
                                double d3 = ((double) e65Var.e) * d2;
                                String str32 = str14;
                                DecimalFormat decimalFormat = new DecimalFormat("0.##", DecimalFormatSymbols.getInstance(Locale.US));
                                String str33 = decimalFormat.format(d3);
                                String str34 = decimalFormat.format(e65Var.d);
                                Date date8 = new Date(j4);
                                int i18 = e65Var.f7264a;
                                hnl hnlVarN15 = nkb.N(c01Var2);
                                String strA22 = lsm0Var2.a(R.string.bonus_amount_title, Arrays.copyOf(new Object[0], 0));
                                nnm0 nnm0Var = gom0Var.f11638a;
                                String strA23 = lsm0Var2.a(R.string.bonus_active, Arrays.copyOf(new Object[0], 0));
                                nnm0 nnm0Var2 = nnm0.ACTIVE;
                                if (nnm0Var != nnm0Var2) {
                                    strA23 = null;
                                }
                                String str35 = strA23 == null ? str32 : strA23;
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                int iOrdinal13 = c01Var2.ordinal();
                                if (iOrdinal13 != 0) {
                                    i7 = i18;
                                    if (iOrdinal13 == 1) {
                                        str5 = str214;
                                    } else if (iOrdinal13 == 2) {
                                        str5 = str32;
                                    } else if (iOrdinal13 == 3) {
                                        str5 = "Ticket_Primery";
                                    } else if (iOrdinal13 == 4) {
                                        str5 = str30;
                                    } else {
                                        t9f.b();
                                    }
                                } else {
                                    i7 = i18;
                                    str5 = str213;
                                }
                                String strL4 = kng0.l(str10, str5, "_Bonus.webp");
                                if (strL4.length() == 0) {
                                    sb2.setLength(0);
                                    str6 = str10;
                                } else {
                                    str6 = str10;
                                    int i19 = 0;
                                    if (StringsKt.O(strL4, ujn.h, false)) {
                                        sb2.setLength(i19);
                                        sb2.append(strL4);
                                    } else if (kotlin.text.c.x(strL4, "https://", false)) {
                                        i19 = 0;
                                        sb2.setLength(i19);
                                        sb2.append(strL4);
                                    } else {
                                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                            i8 = 1;
                                            c2 = '/';
                                        } else {
                                            sb2.append('/');
                                            c2 = '/';
                                            i8 = 1;
                                        }
                                        char[] cArr8 = new char[i8];
                                        cArr8[0] = c2;
                                        sb2.append(StringsKt.y0(strL4, cArr8));
                                    }
                                }
                                String string8 = sb2.toString();
                                String str36 = e65Var.c;
                                pn40 pn40Var16 = pn40.f27267a;
                                String strL5 = kng0.l(str36, str31, pn40.c(d2, p3u0.c));
                                String str37 = pf8Var5 != null ? pf8Var5.f26889a : null;
                                String str38 = str37 == null ? str32 : str37;
                                String str39 = pf8Var4 != null ? pf8Var4.f26889a : null;
                                String str40 = str39 == null ? str32 : str39;
                                int iOrdinal14 = nnm0Var.ordinal();
                                if (iOrdinal14 != 0) {
                                    if (iOrdinal14 != 5) {
                                        str7 = str32;
                                        i9 = 0;
                                    } else {
                                        i9 = 0;
                                        strA6 = lsm0Var2.a(R.string.resume, Arrays.copyOf(new Object[0], 0));
                                    }
                                    if (nnm0Var == nnm0Var2) {
                                        i10 = 1;
                                    } else {
                                        i10 = i9;
                                    }
                                    if (nnm0Var == nnm0.READY) {
                                        strA7 = lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[i9], i9));
                                        ww90Var2 = ww90Var3;
                                    } else {
                                        if (i10 != 0) {
                                            ww90Var2 = ww90Var3;
                                            if (ww90Var2 == ww90.f39878a) {
                                                strA8 = lsm0Var2.a(R.string.play_button, Arrays.copyOf(new Object[i9], i9));
                                            }
                                            strA7 = strA8;
                                        } else {
                                            ww90Var2 = ww90Var3;
                                        }
                                        if (i10 == 0 && ww90Var2 == ww90.b) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        } else if (i10 == 0 && ww90Var2 == ww90.d) {
                                            strA8 = lsm0Var2.a(R.string.all_providers, Arrays.copyOf(new Object[i9], i9));
                                        } else if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        } else {
                                            strA7 = str32;
                                        }
                                        strA7 = strA8;
                                    }
                                    if (pf8Var5 != null || (list2 = pf8Var5.b) == null) {
                                        a4xVarO0 = lak0.c;
                                    } else {
                                        ArrayList arrayList11 = new ArrayList(r3d.q(list2, 10));
                                        Iterator it8 = list2.iterator();
                                        while (it8.hasNext()) {
                                            arrayList11.add(((az5) it8.next()).b);
                                        }
                                        a4xVarO0 = dyb.o0(arrayList11);
                                        if (a4xVarO0 == null) {
                                            a4xVarO0 = lak0.c;
                                        }
                                    }
                                    a4x a4xVar12 = a4xVarO0;
                                    if (pf8Var4 != null || (list = pf8Var4.b) == null) {
                                        a4xVarO1 = lak0.c;
                                    } else {
                                        ArrayList arrayList12 = new ArrayList(r3d.q(list, 10));
                                        Iterator it9 = list.iterator();
                                        while (it9.hasNext()) {
                                            arrayList12.add(((az5) it9.next()).b);
                                        }
                                        a4xVarO1 = dyb.o0(arrayList12);
                                        if (a4xVarO1 == null) {
                                            a4xVarO1 = lak0.c;
                                        }
                                    }
                                    a4x a4xVar13 = a4xVarO1;
                                    ovl ovlVar8 = new ovl(lsm0Var2.a(R.string.roleplaying_title, Arrays.copyOf(new Object[0], 0)), str34, kng0.k("/ ", str33));
                                    q7n q7nVarR8 = vbw0.R(ctf0Var6, date8, Long.valueOf(j4));
                                    if (pf8Var5 == null || pf8Var4 != null) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (pf8Var5 != null || pf8Var4 == null) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    uzh uzhVar8 = new uzh(hnlVarN15, strA22, str35, string8, strL5, str38, str40, null, null, a4xVar12, a4xVar13, true, null, null, str7, strA7, 0, ovlVar8, q7nVarR8, new tzh(z9, z10, false, false));
                                    hnl hnlVarN16 = nkb.N(c01Var2);
                                    iOrdinal2 = nnm0Var.ordinal();
                                    if (iOrdinal2 != 0) {
                                        m7m0Var2 = m7m0.f;
                                    } else if (iOrdinal2 != 1) {
                                        m7m0Var2 = m7m0.c;
                                    } else if (iOrdinal2 != 5) {
                                        m7m0Var2 = m7m0.i;
                                    } else {
                                        m7m0Var2 = m7m0.e;
                                    }
                                    m7m0 m7m0Var114 = m7m0Var2;
                                    nw80Var = nw80.b;
                                    j = i17;
                                    vf8 vf8Var9 = new vf8(i17, j, nw80Var, m7m0Var114, "");
                                    listJ = q3d.j(pf8Var4, pf8Var5);
                                    iOrdinal3 = nnm0Var.ordinal();
                                    if (iOrdinal3 != 0) {
                                        if (iOrdinal3 != 1) {
                                            iOrdinal8 = nnm0Var.ordinal();
                                            if (iOrdinal8 != 0) {
                                                m7m0Var5 = m7m0.f;
                                            } else if (iOrdinal8 != 1) {
                                                m7m0Var5 = m7m0.c;
                                            } else if (iOrdinal8 != 5) {
                                                m7m0Var5 = m7m0.i;
                                            } else {
                                                m7m0Var5 = m7m0.e;
                                            }
                                            vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var5, "");
                                        } else if (iOrdinal3 != 5) {
                                            vf8Var = new vf8(0, j, nw80Var, m7m0.i, "");
                                            str14 = str32;
                                        } else {
                                            iOrdinal9 = nnm0Var.ordinal();
                                            if (iOrdinal9 != 0) {
                                                m7m0Var6 = m7m0.f;
                                            } else if (iOrdinal9 != 1) {
                                                m7m0Var6 = m7m0.c;
                                            } else if (iOrdinal9 != 5) {
                                                m7m0Var6 = m7m0.i;
                                            } else {
                                                m7m0Var6 = m7m0.e;
                                            }
                                            vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var6, "");
                                        }
                                        str14 = str32;
                                        vf8Var2 = vf8Var3;
                                        arrayList8.add(new r11(uzhVar8, hnlVarN16, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var9, vf8Var2, i7));
                                        arrayList7 = arrayList8;
                                        str9 = str31;
                                        str10 = str6;
                                        str11 = str213;
                                        str12 = str214;
                                        it6 = it7;
                                        str13 = str30;
                                        y11Var2 = y11Var6;
                                        q11Var11 = q11Var12;
                                    } else {
                                        pf8Var = (pf8) CollectionsKt.firstOrNull(listJ);
                                        if (pf8Var != null) {
                                            pf8Var3 = (pf8) CollectionsKt.firstOrNull(listJ);
                                            if (pf8Var3 != null) {
                                                qp9 qp9Var13 = pf8Var3.e;
                                                qp9Var2 = new qp9(qp9Var13.b, qp9Var13.f29104a, j);
                                                str14 = str32;
                                            } else {
                                                str14 = str32;
                                                qp9Var2 = new qp9(str14, 0, 0L);
                                            }
                                            qp9 qp9Var14 = qp9Var2;
                                            String str46 = pf8Var.f26889a;
                                            List list13 = pf8Var.b;
                                            nw80 nw80Var14 = pf8Var.c;
                                            m7m0 m7m0Var115 = pf8Var.d;
                                            str46.getClass();
                                            list13.getClass();
                                            pf8Var2 = new pf8(str46, list13, nw80Var14, m7m0Var115, qp9Var14);
                                        } else {
                                            str14 = str32;
                                            iun iunVar6 = iun.f15405a;
                                            nw80 nw80Var15 = nw80.t;
                                            iOrdinal4 = nnm0Var.ordinal();
                                            if (iOrdinal4 != 0) {
                                                m7m0Var3 = m7m0.f;
                                            } else if (iOrdinal4 != 1) {
                                                m7m0Var3 = m7m0.c;
                                            } else if (iOrdinal4 != 5) {
                                                m7m0Var3 = m7m0.i;
                                            } else {
                                                m7m0Var3 = m7m0.e;
                                            }
                                            pf8Var2 = new pf8("", iunVar6, nw80Var15, m7m0Var3, new qp9(str14, 0, 0L));
                                        }
                                        iOrdinal5 = ww90Var2.ordinal();
                                        if (iOrdinal5 != 0) {
                                            m7m0Var4 = m7m0.g;
                                        } else if (iOrdinal5 != 1) {
                                            m7m0Var4 = m7m0.f21327a;
                                        } else if (iOrdinal5 != 2) {
                                            m7m0Var4 = m7m0.d;
                                        } else if (iOrdinal5 != 3) {
                                            m7m0Var4 = m7m0.b;
                                        } else if (iOrdinal5 == 4) {
                                            m7m0Var4 = m7m0.i;
                                        } else {
                                            t9f.b();
                                        }
                                        m7m0 m7m0Var116 = m7m0Var4;
                                        iOrdinal6 = ww90Var2.ordinal();
                                        qp9Var = pf8Var2.e;
                                        if (iOrdinal6 != 0) {
                                            az5Var = (az5) CollectionsKt.firstOrNull(pf8Var2.b);
                                            if (az5Var != null) {
                                                i11 = az5Var.f1701a;
                                            } else {
                                                i11 = qp9Var.f29104a;
                                            }
                                            i12 = i11;
                                        } else if (iOrdinal6 != 1 || iOrdinal6 == 3) {
                                            i12 = i17;
                                        } else {
                                            i12 = 0;
                                        }
                                        iOrdinal7 = ww90Var2.ordinal();
                                        if (iOrdinal7 == 0) {
                                            strA9 = qp9Var.b;
                                        } else if (iOrdinal7 != 1 || iOrdinal7 == 2) {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            if (iOrdinal7 == 3) {
                                                strA9 = lsm0Var2.a(R.string.all_providers, Arrays.copyOf(new Object[0], 0));
                                            } else if (iOrdinal7 == 4) {
                                                str8 = str14;
                                            } else {
                                                t9f.b();
                                            }
                                            vf8Var = new vf8(i12, j, nw80Var, m7m0Var116, str8);
                                        }
                                        str8 = strA9;
                                        vf8Var = new vf8(i12, j, nw80Var, m7m0Var116, str8);
                                    }
                                    vf8Var2 = vf8Var;
                                    arrayList8.add(new r11(uzhVar8, hnlVarN16, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var9, vf8Var2, i7));
                                    arrayList7 = arrayList8;
                                    str9 = str31;
                                    str10 = str6;
                                    str11 = str213;
                                    str12 = str214;
                                    it6 = it7;
                                    str13 = str30;
                                    y11Var2 = y11Var6;
                                    q11Var11 = q11Var12;
                                } else {
                                    i9 = 0;
                                    strA6 = lsm0Var2.a(R.string.suspend, Arrays.copyOf(new Object[0], 0));
                                }
                                str7 = strA6;
                                if (nnm0Var == nnm0Var2) {
                                    i10 = 1;
                                } else {
                                    i10 = i9;
                                }
                                if (nnm0Var == nnm0.READY) {
                                    strA7 = lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[i9], i9));
                                    ww90Var2 = ww90Var3;
                                } else {
                                    if (i10 != 0) {
                                        ww90Var2 = ww90Var3;
                                        if (ww90Var2 == ww90.f39878a) {
                                            strA8 = lsm0Var2.a(R.string.play_button, Arrays.copyOf(new Object[i9], i9));
                                        }
                                        strA7 = strA8;
                                    } else {
                                        ww90Var2 = ww90Var3;
                                    }
                                    if (i10 == 0) {
                                        if (i10 == 0) {
                                            if (i10 != 0) {
                                                strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                                strA7 = strA8;
                                            } else {
                                                strA7 = str32;
                                            }
                                        } else if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                            strA7 = strA8;
                                        } else {
                                            strA7 = str32;
                                        }
                                    } else if (i10 == 0) {
                                        if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                            strA7 = strA8;
                                        } else {
                                            strA7 = str32;
                                        }
                                    } else if (i10 != 0) {
                                        strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        strA7 = strA8;
                                    } else {
                                        strA7 = str32;
                                    }
                                }
                                if (pf8Var5 != null) {
                                    a4xVarO0 = lak0.c;
                                } else {
                                    a4xVarO0 = lak0.c;
                                }
                                a4x a4xVar14 = a4xVarO0;
                                if (pf8Var4 != null) {
                                    a4xVarO1 = lak0.c;
                                } else {
                                    a4xVarO1 = lak0.c;
                                }
                                a4x a4xVar15 = a4xVarO1;
                                ovl ovlVar9 = new ovl(lsm0Var2.a(R.string.roleplaying_title, Arrays.copyOf(new Object[0], 0)), str34, kng0.k("/ ", str33));
                                q7n q7nVarR9 = vbw0.R(ctf0Var6, date8, Long.valueOf(j4));
                                if (pf8Var5 == null) {
                                    z9 = true;
                                } else {
                                    z9 = true;
                                }
                                if (pf8Var5 != null) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                uzh uzhVar9 = new uzh(hnlVarN15, strA22, str35, string8, strL5, str38, str40, null, null, a4xVar14, a4xVar15, true, null, null, str7, strA7, 0, ovlVar9, q7nVarR9, new tzh(z9, z10, false, false));
                                hnl hnlVarN17 = nkb.N(c01Var2);
                                iOrdinal2 = nnm0Var.ordinal();
                                if (iOrdinal2 != 0) {
                                    m7m0Var2 = m7m0.f;
                                } else if (iOrdinal2 != 1) {
                                    m7m0Var2 = m7m0.c;
                                } else if (iOrdinal2 != 5) {
                                    m7m0Var2 = m7m0.i;
                                } else {
                                    m7m0Var2 = m7m0.e;
                                }
                                m7m0 m7m0Var117 = m7m0Var2;
                                nw80Var = nw80.b;
                                j = i17;
                                vf8 vf8Var10 = new vf8(i17, j, nw80Var, m7m0Var117, "");
                                listJ = q3d.j(pf8Var4, pf8Var5);
                                iOrdinal3 = nnm0Var.ordinal();
                                if (iOrdinal3 != 0) {
                                    if (iOrdinal3 != 1) {
                                        iOrdinal8 = nnm0Var.ordinal();
                                        if (iOrdinal8 != 0) {
                                            m7m0Var5 = m7m0.f;
                                        } else if (iOrdinal8 != 1) {
                                            m7m0Var5 = m7m0.c;
                                        } else if (iOrdinal8 != 5) {
                                            m7m0Var5 = m7m0.i;
                                        } else {
                                            m7m0Var5 = m7m0.e;
                                        }
                                        vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var5, "");
                                    } else if (iOrdinal3 != 5) {
                                        vf8Var = new vf8(0, j, nw80Var, m7m0.i, "");
                                        str14 = str32;
                                    } else {
                                        iOrdinal9 = nnm0Var.ordinal();
                                        if (iOrdinal9 != 0) {
                                            m7m0Var6 = m7m0.f;
                                        } else if (iOrdinal9 != 1) {
                                            m7m0Var6 = m7m0.c;
                                        } else if (iOrdinal9 != 5) {
                                            m7m0Var6 = m7m0.i;
                                        } else {
                                            m7m0Var6 = m7m0.e;
                                        }
                                        vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var6, "");
                                    }
                                    str14 = str32;
                                    vf8Var2 = vf8Var3;
                                    arrayList8.add(new r11(uzhVar9, hnlVarN17, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var10, vf8Var2, i7));
                                    arrayList7 = arrayList8;
                                    str9 = str31;
                                    str10 = str6;
                                    str11 = str213;
                                    str12 = str214;
                                    it6 = it7;
                                    str13 = str30;
                                    y11Var2 = y11Var6;
                                    q11Var11 = q11Var12;
                                } else {
                                    pf8Var = (pf8) CollectionsKt.firstOrNull(listJ);
                                    if (pf8Var != null) {
                                        pf8Var3 = (pf8) CollectionsKt.firstOrNull(listJ);
                                        if (pf8Var3 != null) {
                                            qp9 qp9Var15 = pf8Var3.e;
                                            qp9Var2 = new qp9(qp9Var15.b, qp9Var15.f29104a, j);
                                            str14 = str32;
                                        } else {
                                            str14 = str32;
                                            qp9Var2 = new qp9(str14, 0, 0L);
                                        }
                                        qp9 qp9Var16 = qp9Var2;
                                        String str47 = pf8Var.f26889a;
                                        List list14 = pf8Var.b;
                                        nw80 nw80Var16 = pf8Var.c;
                                        m7m0 m7m0Var118 = pf8Var.d;
                                        str47.getClass();
                                        list14.getClass();
                                        pf8Var2 = new pf8(str47, list14, nw80Var16, m7m0Var118, qp9Var16);
                                    } else {
                                        str14 = str32;
                                        iun iunVar7 = iun.f15405a;
                                        nw80 nw80Var17 = nw80.t;
                                        iOrdinal4 = nnm0Var.ordinal();
                                        if (iOrdinal4 != 0) {
                                            m7m0Var3 = m7m0.f;
                                        } else if (iOrdinal4 != 1) {
                                            m7m0Var3 = m7m0.c;
                                        } else if (iOrdinal4 != 5) {
                                            m7m0Var3 = m7m0.i;
                                        } else {
                                            m7m0Var3 = m7m0.e;
                                        }
                                        pf8Var2 = new pf8("", iunVar7, nw80Var17, m7m0Var3, new qp9(str14, 0, 0L));
                                    }
                                    iOrdinal5 = ww90Var2.ordinal();
                                    if (iOrdinal5 != 0) {
                                        m7m0Var4 = m7m0.g;
                                    } else if (iOrdinal5 != 1) {
                                        m7m0Var4 = m7m0.f21327a;
                                    } else if (iOrdinal5 != 2) {
                                        m7m0Var4 = m7m0.d;
                                    } else if (iOrdinal5 != 3) {
                                        m7m0Var4 = m7m0.b;
                                    } else if (iOrdinal5 == 4) {
                                        m7m0Var4 = m7m0.i;
                                    } else {
                                        t9f.b();
                                    }
                                    m7m0 m7m0Var119 = m7m0Var4;
                                    iOrdinal6 = ww90Var2.ordinal();
                                    qp9Var = pf8Var2.e;
                                    if (iOrdinal6 != 0) {
                                        az5Var = (az5) CollectionsKt.firstOrNull(pf8Var2.b);
                                        if (az5Var != null) {
                                            i11 = az5Var.f1701a;
                                        } else {
                                            i11 = qp9Var.f29104a;
                                        }
                                        i12 = i11;
                                    } else if (iOrdinal6 != 1) {
                                        i12 = i17;
                                    } else {
                                        i12 = i17;
                                    }
                                    iOrdinal7 = ww90Var2.ordinal();
                                    if (iOrdinal7 == 0) {
                                        if (iOrdinal7 != 1) {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        }
                                        vf8Var = new vf8(i12, j, nw80Var, m7m0Var119, str8);
                                    } else {
                                        strA9 = qp9Var.b;
                                    }
                                    str8 = strA9;
                                    vf8Var = new vf8(i12, j, nw80Var, m7m0Var119, str8);
                                }
                                vf8Var2 = vf8Var;
                                arrayList8.add(new r11(uzhVar9, hnlVarN17, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var10, vf8Var2, i7));
                                arrayList7 = arrayList8;
                                str9 = str31;
                                str10 = str6;
                                str11 = str213;
                                str12 = str214;
                                it6 = it7;
                                str13 = str30;
                                y11Var2 = y11Var6;
                                q11Var11 = q11Var12;
                            }
                            return dyb.r0(arrayList7);
                        }
                        if (Intrinsics.d(b7vVar, a7v.f393a)) {
                            return i4w0.N(q11Var11.t);
                        }
                        t9f.b();
                        return null;
                }
            }
        }, (byte) 20));
        this.x = maz.b(new yw9((fee) n0o0VarH5.getValue(), new Function1(this) { // from class: a.x11
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
            /* JADX WARN: Code duplicated, block: B:103:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:106:0x02c9  */
            /* JADX WARN: Code duplicated, block: B:107:0x02db A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:108:0x02dd  */
            /* JADX WARN: Code duplicated, block: B:110:0x02e3  */
            /* JADX WARN: Code duplicated, block: B:112:0x02f3  */
            /* JADX WARN: Code duplicated, block: B:117:0x0306 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:118:0x0308  */
            /* JADX WARN: Code duplicated, block: B:121:0x031a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:122:0x031c  */
            /* JADX WARN: Code duplicated, block: B:123:0x0327  */
            /* JADX WARN: Code duplicated, block: B:135:0x035a  */
            /* JADX WARN: Code duplicated, block: B:147:0x038e  */
            /* JADX WARN: Code duplicated, block: B:153:0x03bb  */
            /* JADX WARN: Code duplicated, block: B:158:0x03c3  */
            /* JADX WARN: Code duplicated, block: B:161:0x03e7  */
            /* JADX WARN: Code duplicated, block: B:163:0x03ea  */
            /* JADX WARN: Code duplicated, block: B:165:0x03ed  */
            /* JADX WARN: Code duplicated, block: B:167:0x03f2  */
            /* JADX WARN: Code duplicated, block: B:168:0x03f5  */
            /* JADX WARN: Code duplicated, block: B:169:0x03f8  */
            /* JADX WARN: Code duplicated, block: B:172:0x0419  */
            /* JADX WARN: Code duplicated, block: B:174:0x041c  */
            /* JADX WARN: Code duplicated, block: B:176:0x041f  */
            /* JADX WARN: Code duplicated, block: B:178:0x0434  */
            /* JADX WARN: Code duplicated, block: B:180:0x043a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:181:0x043c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:182:0x043e  */
            /* JADX WARN: Code duplicated, block: B:184:0x0443  */
            /* JADX WARN: Code duplicated, block: B:185:0x0446  */
            /* JADX WARN: Code duplicated, block: B:186:0x0449  */
            /* JADX WARN: Code duplicated, block: B:189:0x0459  */
            /* JADX WARN: Code duplicated, block: B:191:0x045f  */
            /* JADX WARN: Code duplicated, block: B:193:0x0462  */
            /* JADX WARN: Code duplicated, block: B:195:0x0465  */
            /* JADX WARN: Code duplicated, block: B:197:0x046a  */
            /* JADX WARN: Code duplicated, block: B:198:0x046d  */
            /* JADX WARN: Code duplicated, block: B:199:0x0470  */
            /* JADX WARN: Code duplicated, block: B:201:0x047b  */
            /* JADX WARN: Code duplicated, block: B:203:0x0487  */
            /* JADX WARN: Code duplicated, block: B:205:0x048f  */
            /* JADX WARN: Code duplicated, block: B:207:0x049f  */
            /* JADX WARN: Code duplicated, block: B:209:0x04c6  */
            /* JADX WARN: Code duplicated, block: B:211:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:213:0x04d7  */
            /* JADX WARN: Code duplicated, block: B:215:0x04da  */
            /* JADX WARN: Code duplicated, block: B:217:0x04df  */
            /* JADX WARN: Code duplicated, block: B:218:0x04e2  */
            /* JADX WARN: Code duplicated, block: B:219:0x04e5  */
            /* JADX WARN: Code duplicated, block: B:223:0x04fd  */
            /* JADX WARN: Code duplicated, block: B:225:0x0500  */
            /* JADX WARN: Code duplicated, block: B:227:0x0503  */
            /* JADX WARN: Code duplicated, block: B:229:0x0506  */
            /* JADX WARN: Code duplicated, block: B:231:0x0509  */
            /* JADX WARN: Code duplicated, block: B:234:0x0513  */
            /* JADX WARN: Code duplicated, block: B:235:0x0516  */
            /* JADX WARN: Code duplicated, block: B:236:0x0519  */
            /* JADX WARN: Code duplicated, block: B:237:0x051c  */
            /* JADX WARN: Code duplicated, block: B:240:0x0527  */
            /* JADX WARN: Code duplicated, block: B:245:0x0530  */
            /* JADX WARN: Code duplicated, block: B:246:0x0533  */
            /* JADX WARN: Code duplicated, block: B:248:0x053d  */
            /* JADX WARN: Code duplicated, block: B:250:0x0542  */
            /* JADX WARN: Code duplicated, block: B:253:0x054b  */
            /* JADX WARN: Code duplicated, block: B:265:0x0570  */
            /* JADX WARN: Code duplicated, block: B:266:0x057f  */
            /* JADX WARN: Code duplicated, block: B:468:0x0b96  */
            /* JADX WARN: Code duplicated, block: B:469:0x0bb1  */
            /* JADX WARN: Code duplicated, block: B:471:0x0bbf  */
            /* JADX WARN: Code duplicated, block: B:472:0x0bd0  */
            /* JADX WARN: Code duplicated, block: B:484:0x0be9  */
            /* JADX WARN: Code duplicated, block: B:485:0x0bfb  */
            /* JADX WARN: Code duplicated, block: B:487:0x0bff  */
            /* JADX WARN: Code duplicated, block: B:488:0x0c11  */
            /* JADX WARN: Code duplicated, block: B:491:0x0c46  */
            /* JADX WARN: Code duplicated, block: B:493:0x0c4b  */
            /* JADX WARN: Code duplicated, block: B:495:0x0c4e  */
            /* JADX WARN: Code duplicated, block: B:497:0x0c51  */
            /* JADX WARN: Code duplicated, block: B:499:0x0c54  */
            /* JADX WARN: Code duplicated, block: B:502:0x0c5d  */
            /* JADX WARN: Code duplicated, block: B:503:0x0c61  */
            /* JADX WARN: Code duplicated, block: B:504:0x0c64  */
            /* JADX WARN: Code duplicated, block: B:505:0x0c67  */
            /* JADX WARN: Code duplicated, block: B:508:0x0c7b  */
            /* JADX WARN: Code duplicated, block: B:509:0x0c84  */
            /* JADX WARN: Code duplicated, block: B:511:0x0c8f  */
            /* JADX WARN: Code duplicated, block: B:513:0x0c95  */
            /* JADX WARN: Code duplicated, block: B:514:0x0c96 A[PHI: r15
  0x0c96: PHI (r15v12 int) = (r15v11 int), (r15v17 int) binds: [B:510:0x0c8d, B:513:0x0c95] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:515:0x0c99  */
            /* JADX WARN: Code duplicated, block: B:520:0x0cae  */
            /* JADX WARN: Code duplicated, block: B:525:0x0ce6  */
            /* JADX WARN: Code duplicated, block: B:527:0x0cf9  */
            /* JADX WARN: Code duplicated, block: B:530:0x0d0b  */
            /* JADX WARN: Code duplicated, block: B:531:0x0d0e  */
            /* JADX WARN: Code duplicated, block: B:534:0x0d1c  */
            /* JADX WARN: Code duplicated, block: B:535:0x0d1f  */
            /* JADX WARN: Code duplicated, block: B:537:0x0d2f  */
            /* JADX WARN: Code duplicated, block: B:538:0x0d31  */
            /* JADX WARN: Code duplicated, block: B:540:0x0d37  */
            /* JADX WARN: Code duplicated, block: B:541:0x0d39  */
            /* JADX WARN: Code duplicated, block: B:544:0x0d4e  */
            /* JADX WARN: Code duplicated, block: B:545:0x0d50  */
            /* JADX WARN: Code duplicated, block: B:547:0x0d53  */
            /* JADX WARN: Code duplicated, block: B:549:0x0d57  */
            /* JADX WARN: Code duplicated, block: B:552:0x0d79  */
            /* JADX WARN: Code duplicated, block: B:554:0x0d7e  */
            /* JADX WARN: Code duplicated, block: B:564:0x050e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:579:0x0c57 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y11 y11Var;
                boolean z;
                int i;
                boolean z2;
                String strL;
                String strL2;
                String strA;
                String strA2;
                lsm0 lsm0Var;
                boolean z3;
                int i2;
                StringBuilder sb;
                int iOrdinal;
                int i3;
                String str;
                String str2;
                String strL3;
                int i4;
                int i5;
                char c;
                String strA3;
                lak0 lak0Var;
                i4 i4VarG0;
                String strA4;
                String strValueOf;
                String strM;
                boolean z4;
                boolean z5;
                m7m0 m7m0Var;
                int i6;
                int iA;
                ijl ijlVar;
                String str3;
                String strC;
                boolean z6;
                ot0 ot0Var;
                boolean z7;
                Iterator it;
                String str4;
                boolean z8;
                String strA5;
                pt0 pt0Var;
                n0x n0xVar;
                pt0 pt0Var2;
                sso0 uqo0Var;
                nur murVar;
                ww90 ww90Var;
                int i7;
                String str5;
                String str6;
                int i8;
                char c2;
                int i9;
                String strA6;
                String str7;
                int i10;
                ww90 ww90Var2;
                String strA7;
                String strA8;
                a4x a4xVarO0;
                a4x a4xVarO1;
                boolean z9;
                boolean z10;
                int iOrdinal2;
                m7m0 m7m0Var2;
                nw80 nw80Var;
                long j;
                List listJ;
                int iOrdinal3;
                pf8 pf8Var;
                int iOrdinal4;
                m7m0 m7m0Var3;
                pf8 pf8Var2;
                int iOrdinal5;
                m7m0 m7m0Var4;
                int iOrdinal6;
                qp9 qp9Var;
                az5 az5Var;
                int i11;
                int i12;
                int iOrdinal7;
                String strA9;
                String str8;
                vf8 vf8Var;
                pf8 pf8Var3;
                qp9 qp9Var2;
                vf8 vf8Var2;
                int iOrdinal8;
                m7m0 m7m0Var5;
                vf8 vf8Var3;
                int iOrdinal9;
                m7m0 m7m0Var6;
                List list;
                List list2;
                byte b8 = b;
                String str9 = Separators.SP;
                String str10 = "static/img/android/casino/alt_design/aggregator_gift_card/";
                String str11 = "Background_Picture";
                String str12 = "Background_Illustration";
                String str13 = "Ticket_Secondary";
                String str14 = "";
                y11 y11Var2 = this.b;
                switch (b8) {
                    case 0:
                        y11 y11Var3 = y11Var2;
                        String str15 = "static/img/android/casino/alt_design/aggregator_gift_card/";
                        q11 q11Var2 = (q11) y11Var3.z;
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        m7v m7vVar = (m7v) feeVar2.c();
                        if (m7vVar instanceof k7v) {
                            ArrayList arrayList = ((k7v) m7vVar).f17842a;
                            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                n65 n65Var = (n65) it2.next();
                                c01 c01Var = q11Var2.t;
                                ctf0 ctf0Var2 = y11Var3.b;
                                n65Var.getClass();
                                int i13 = n65Var.c;
                                ctf0Var2.getClass();
                                dqs dqsVar = n65Var.e;
                                String str16 = dqsVar.d;
                                long j2 = n65Var.d.f44639a;
                                int i14 = n65Var.b;
                                Iterator it3 = it2;
                                if (i13 == i14) {
                                    y11Var = y11Var3;
                                    z = n65Var.l == na90.PAYMENT_AFTER_DEPOSIT;
                                    Date date7 = new Date(j2);
                                    if (z) {
                                        String str1115 = n65Var.k;
                                        pn40 pn40Var13 = pn40.f27267a;
                                        i = 2;
                                        z2 = true;
                                        strL = kng0.l(str1115, Separators.SP, pn40.j(n65Var.j, 2, true));
                                    } else {
                                        i = 2;
                                        z2 = true;
                                        strL = null;
                                    }
                                    if (z != 0) {
                                        String str1116 = n65Var.i;
                                        pn40 pn40Var14 = pn40.f27267a;
                                        strL2 = kng0.l(str1116, Separators.SP, pn40.j(n65Var.h, i, z2));
                                    } else {
                                        strL2 = null;
                                    }
                                    boolean z11 = (strL != null || strL.length() == 0) && (strL2 == null || strL2.length() == 0);
                                    if (z != 0) {
                                        strA = ctf0Var2.b.a(R.string.win_sum_title, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        strA = null;
                                    }
                                    if (z != 0) {
                                        strA2 = ctf0Var2.b.a(R.string.deposit_sum_title, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        strA2 = null;
                                    }
                                    lsm0Var = ctf0Var2.b;
                                    String strA118 = lsm0Var.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
                                    q11 q11Var9 = q11Var2;
                                    z3 = z11;
                                    i2 = (int) n65Var.f22979a;
                                    hnl hnlVarN13 = nkb.N(c01Var);
                                    String strA119 = lsm0Var.a(R.string.free_spins_title, Arrays.copyOf(new Object[0], 0));
                                    sb = new StringBuilder(ujn.h);
                                    iOrdinal = c01Var.ordinal();
                                    if (iOrdinal != 0) {
                                        i3 = i2;
                                        if (iOrdinal != 1) {
                                            str = "Background_Illustration";
                                        } else if (iOrdinal != 2) {
                                            str = "";
                                        } else if (iOrdinal != 3) {
                                            str = "Ticket_Primary";
                                        } else if (iOrdinal == 4) {
                                            str = "Ticket_Secondary";
                                        } else {
                                            t9f.b();
                                        }
                                    } else {
                                        i3 = i2;
                                        str = "Background_Picture";
                                    }
                                    str2 = str15;
                                    strL3 = kng0.l(str2, str, "_Spin.webp");
                                    if (strL3.length() == 0) {
                                        i4 = 0;
                                        sb.setLength(0);
                                        str15 = str2;
                                    } else {
                                        str15 = str2;
                                        i4 = 0;
                                        if (StringsKt.O(strL3, ujn.h, false)) {
                                            sb.setLength(i4);
                                            sb.append(strL3);
                                        } else if (kotlin.text.c.x(strL3, "https://", false)) {
                                            i4 = 0;
                                            sb.setLength(i4);
                                            sb.append(strL3);
                                        } else {
                                            if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                i5 = 1;
                                                c = '/';
                                            } else {
                                                sb.append('/');
                                                c = '/';
                                                i5 = 1;
                                            }
                                            char[] cArr7 = new char[i5];
                                            i4 = 0;
                                            cArr7[0] = c;
                                            sb.append(StringsKt.y0(strL3, cArr7));
                                        }
                                    }
                                    String string7 = sb.toString();
                                    String str1117 = strA118 + Separators.SP + i14;
                                    String strA1110 = lsm0Var.a(R.string.for_games_title, Arrays.copyOf(new Object[i4], i4));
                                    if (z != 0) {
                                        strA3 = lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[i4], i4));
                                    } else {
                                        strA3 = lsm0Var.a(R.string.play_button, Arrays.copyOf(new Object[i4], i4));
                                    }
                                    String str26 = strA3;
                                    lak0Var = lak0.c;
                                    if (z != 0) {
                                        i4VarG0 = lak0Var;
                                    } else {
                                        i4VarG0 = dyb.g0(str16);
                                    }
                                    if (z != 0) {
                                        strA4 = "";
                                    } else {
                                        strA4 = lsm0Var.a(R.string.spins_title, Arrays.copyOf(new Object[0], 0));
                                    }
                                    if (z != 0) {
                                        strValueOf = null;
                                    } else {
                                        strValueOf = String.valueOf(i13);
                                    }
                                    if (z) {
                                        strM = null;
                                    } else {
                                        strM = twn.m(i14, " / ");
                                    }
                                    ovl ovlVar7 = new ovl(strA4, strValueOf, strM);
                                    q7n q7nVarR7 = vbw0.R(ctf0Var2, date7, Long.valueOf(j2));
                                    if (strA != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (strA2 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    uzh uzhVar7 = new uzh(hnlVarN13, strA119, "", string7, str1117, "", strA1110, strA, strA2, lak0Var, i4VarG0, false, strL, strL2, "", str26, 12, ovlVar7, q7nVarR7, new tzh(true, false, z4, z5));
                                    hnl hnlVarN14 = nkb.N(c01Var);
                                    nw80 nw80Var8 = nw80.b;
                                    if (z3) {
                                        m7m0Var = m7m0.g;
                                    } else {
                                        m7m0Var = m7m0.h;
                                    }
                                    arrayList2.add(new r11(uzhVar7, hnlVarN14, null, null, null, new vf8(dqsVar.c, n65Var.f22979a, nw80Var8, m7m0Var, str16), i3));
                                    it2 = it3;
                                    q11Var2 = q11Var9;
                                    y11Var3 = y11Var;
                                } else {
                                    y11Var = y11Var3;
                                }
                                Date date8 = new Date(j2);
                                if (z) {
                                    String str1118 = n65Var.k;
                                    pn40 pn40Var15 = pn40.f27267a;
                                    i = 2;
                                    z2 = true;
                                    strL = kng0.l(str1118, Separators.SP, pn40.j(n65Var.j, 2, true));
                                } else {
                                    i = 2;
                                    z2 = true;
                                    strL = null;
                                }
                                if (z != 0) {
                                    String str1119 = n65Var.i;
                                    pn40 pn40Var16 = pn40.f27267a;
                                    strL2 = kng0.l(str1119, Separators.SP, pn40.j(n65Var.h, i, z2));
                                } else {
                                    strL2 = null;
                                }
                                if (strL != null) {
                                }
                                if (z != 0) {
                                    strA = ctf0Var2.b.a(R.string.win_sum_title, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA = null;
                                }
                                if (z != 0) {
                                    strA2 = ctf0Var2.b.a(R.string.deposit_sum_title, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA2 = null;
                                }
                                lsm0Var = ctf0Var2.b;
                                String strA1111 = lsm0Var.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
                                q11 q11Var10 = q11Var2;
                                z3 = z11;
                                i2 = (int) n65Var.f22979a;
                                hnl hnlVarN15 = nkb.N(c01Var);
                                String strA1112 = lsm0Var.a(R.string.free_spins_title, Arrays.copyOf(new Object[0], 0));
                                sb = new StringBuilder(ujn.h);
                                iOrdinal = c01Var.ordinal();
                                if (iOrdinal != 0) {
                                    i3 = i2;
                                    if (iOrdinal != 1) {
                                        str = "Background_Illustration";
                                    } else if (iOrdinal != 2) {
                                        str = "";
                                    } else if (iOrdinal != 3) {
                                        str = "Ticket_Primary";
                                    } else if (iOrdinal == 4) {
                                        str = "Ticket_Secondary";
                                    } else {
                                        t9f.b();
                                    }
                                } else {
                                    i3 = i2;
                                    str = "Background_Picture";
                                }
                                str2 = str15;
                                strL3 = kng0.l(str2, str, "_Spin.webp");
                                if (strL3.length() == 0) {
                                    i4 = 0;
                                    sb.setLength(0);
                                    str15 = str2;
                                } else {
                                    str15 = str2;
                                    i4 = 0;
                                    if (StringsKt.O(strL3, ujn.h, false)) {
                                        sb.setLength(i4);
                                        sb.append(strL3);
                                    } else if (kotlin.text.c.x(strL3, "https://", false)) {
                                        i4 = 0;
                                        sb.setLength(i4);
                                        sb.append(strL3);
                                    } else {
                                        if (sb.length() > 0) {
                                            i5 = 1;
                                            c = '/';
                                        } else {
                                            i5 = 1;
                                            c = '/';
                                        }
                                        char[] cArr8 = new char[i5];
                                        i4 = 0;
                                        cArr8[0] = c;
                                        sb.append(StringsKt.y0(strL3, cArr8));
                                    }
                                }
                                String string8 = sb.toString();
                                String str11110 = strA1111 + Separators.SP + i14;
                                String strA1113 = lsm0Var.a(R.string.for_games_title, Arrays.copyOf(new Object[i4], i4));
                                if (z != 0) {
                                    strA3 = lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[i4], i4));
                                } else {
                                    strA3 = lsm0Var.a(R.string.play_button, Arrays.copyOf(new Object[i4], i4));
                                }
                                String str27 = strA3;
                                lak0Var = lak0.c;
                                if (z != 0) {
                                    i4VarG0 = lak0Var;
                                } else {
                                    i4VarG0 = dyb.g0(str16);
                                }
                                if (z != 0) {
                                    strA4 = "";
                                } else {
                                    strA4 = lsm0Var.a(R.string.spins_title, Arrays.copyOf(new Object[0], 0));
                                }
                                if (z != 0) {
                                    strValueOf = null;
                                } else {
                                    strValueOf = String.valueOf(i13);
                                }
                                if (z) {
                                    strM = null;
                                } else {
                                    strM = twn.m(i14, " / ");
                                }
                                ovl ovlVar8 = new ovl(strA4, strValueOf, strM);
                                q7n q7nVarR8 = vbw0.R(ctf0Var2, date8, Long.valueOf(j2));
                                if (strA != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (strA2 != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                uzh uzhVar8 = new uzh(hnlVarN15, strA1112, "", string8, str11110, "", strA1113, strA, strA2, lak0Var, i4VarG0, false, strL, strL2, "", str27, 12, ovlVar8, q7nVarR8, new tzh(true, false, z4, z5));
                                hnl hnlVarN16 = nkb.N(c01Var);
                                nw80 nw80Var9 = nw80.b;
                                if (z3) {
                                    m7m0Var = m7m0.g;
                                } else {
                                    m7m0Var = m7m0.h;
                                }
                                arrayList2.add(new r11(uzhVar8, hnlVarN16, null, null, null, new vf8(dqsVar.c, n65Var.f22979a, nw80Var9, m7m0Var, str16), i3));
                                it2 = it3;
                                q11Var2 = q11Var10;
                                y11Var3 = y11Var;
                            }
                            return dyb.r0(arrayList2);
                        }
                        if (Intrinsics.d(m7vVar, l7v.f19578a)) {
                            return i4w0.N(q11Var2.t);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        g7v g7vVar = (g7v) feeVar3.c();
                        if (!(g7vVar instanceof e7v)) {
                            if (Intrinsics.d(g7vVar, f7v.f9076a)) {
                                zcl zclVar = qmk.f28987a;
                                return new h7v(new gyl(null, s5x0.t(0.0f, 8.0f, 1), 1));
                            }
                            t9f.b();
                            return null;
                        }
                        if (((a4x) ((fee) y11Var2.x.getValue()).b()).size() + ((a4x) ((fee) y11Var2.w.getValue()).b()).size() <= 0) {
                            return i7v.f14312a;
                        }
                        a4x<y6v> a4xVar = ((e7v) g7vVar).f7345a;
                        ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar, 10));
                        for (y6v y6vVar : a4xVar) {
                            ctf0 ctf0Var3 = y11Var2.b;
                            d7v d7vVar = (d7v) ((fee) y11Var2.k.getValue()).c();
                            y6vVar.getClass();
                            d7v d7vVar2 = y6vVar.f42119a;
                            ctf0Var3.getClass();
                            d7vVar.getClass();
                            long jOrdinal = d7vVar2.ordinal();
                            int iOrdinal10 = d7vVar2.ordinal();
                            if (iOrdinal10 == 0) {
                                i6 = R.string.all;
                            } else if (iOrdinal10 == 1) {
                                i6 = R.string.bonuses_title;
                            } else {
                                if (iOrdinal10 != 2) {
                                    t9f.b();
                                    return null;
                                }
                                i6 = R.string.free_spins_title;
                            }
                            xxl xxlVar = new xxl(ctf0Var3.b.a(i6, Arrays.copyOf(new Object[0], 0)));
                            uxl uxlVar = d7vVar2 == d7vVar ? uxl.b : uxl.f36445a;
                            int i15 = y6vVar.b;
                            arrayList3.add(new lxl(jOrdinal, (dyl) xxlVar, false, uxlVar, i15 != 0 ? new cwl(new rpe(i15)) : null, 76));
                        }
                        return new h7v(new fyl(dyb.r0(arrayList3), null, null, s5x0.t(0.0f, 0.0f, 3), null, 22));
                    case 2:
                        int iIntValue = ((Integer) obj).intValue();
                        boolean z12 = ((q11) y11Var2.z).v;
                        int iIntValue2 = ((Number) ((fee) y11Var2.t.getValue()).b()).intValue();
                        if (z12) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.j;
                            xuzVar.getClass();
                            iA = xuz.a(pb10Var, iIntValue);
                        } else {
                            xuz xuzVar2 = pb10.c;
                            pb10 pb10Var2 = pb10.i;
                            xuzVar2.getClass();
                            iA = xuz.a(pb10Var2, iIntValue);
                        }
                        return new mdm(iA, null, null, 0, 0, iIntValue2, 0, 0, 0L, 0L, 990);
                    case 3:
                        ((fee) obj).getClass();
                        fee feeVar4 = (fee) y11Var2.c.getValue();
                        ctf0 ctf0Var4 = y11Var2.b;
                        if (!((Boolean) feeVar4.c()).booleanValue()) {
                            return new zc(ctf0Var4.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) y11Var2.d.getValue()).c();
                        kg kgVar = ((q11) y11Var2.z).u;
                        kgVar.getClass();
                        int iOrdinal11 = kgVar.ordinal();
                        if (iOrdinal11 == 0) {
                            ijlVar = ijl.f14880a;
                        } else if (iOrdinal11 == 1) {
                            ijlVar = ijl.b;
                        } else if (iOrdinal11 == 2) {
                            ijlVar = ijl.c;
                        } else if (iOrdinal11 == 3) {
                            ijlVar = ijl.d;
                        } else {
                            if (iOrdinal11 != 4) {
                                t9f.b();
                                return null;
                            }
                            ijlVar = ijl.e;
                        }
                        if (ql5Var != null) {
                            String strA1114 = ql5Var.j;
                            if (ijlVar == ijl.b) {
                                strA1114 = ctf0Var4.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA1114.length() <= 0) {
                                strA1114 = ql5Var.k;
                            }
                            str3 = strA1114;
                        } else {
                            str3 = null;
                        }
                        String str28 = str3 == null ? "" : str3;
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var17 = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str29 = strC == null ? "" : strC;
                        String str210 = ql5Var != null ? ql5Var.f : null;
                        String str211 = str210 == null ? "" : str210;
                        String strA1115 = ctf0Var4.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        return new xc(ijlVar, new jjl(str29, str211, strA1115, str28, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())));
                    case 4:
                        n0o0 n0o0Var = y11Var2.w;
                        n0o0 n0o0Var2 = y11Var2.x;
                        d7v d7vVar3 = (d7v) obj;
                        d7vVar3.getClass();
                        int iOrdinal12 = d7vVar3.ordinal();
                        if (iOrdinal12 == 0) {
                            return CollectionsKt.q0((Collection) ((fee) n0o0Var.getValue()).b(), (Iterable) ((fee) n0o0Var2.getValue()).b());
                        }
                        if (iOrdinal12 == 1) {
                            return (List) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal12 == 2) {
                            return (List) ((fee) n0o0Var2.getValue()).b();
                        }
                        t9f.b();
                        return null;
                    case 5:
                        ((Unit) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(((q11) y11Var2.z).r, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    case 6:
                        y11 y11Var4 = y11Var2;
                        fee feeVar5 = (fee) obj;
                        feeVar5.getClass();
                        Iterable iterable = (Iterable) feeVar5.c();
                        ArrayList arrayList4 = new ArrayList(r3d.q(iterable, 10));
                        Iterator it4 = iterable.iterator();
                        while (it4.hasNext()) {
                            j8b j8bVar = (j8b) it4.next();
                            y11 y11Var5 = y11Var4;
                            ctf0 ctf0Var5 = y11Var5.b;
                            boolean zBooleanValue = ((Boolean) ((fee) y11Var5.c.getValue()).c()).booleanValue();
                            q11 q11Var11 = (q11) y11Var5.z;
                            boolean z13 = q11Var11.v;
                            ot0 ot0Var2 = q11Var11.x;
                            Set set = (Set) ((fee) y11Var5.f.getValue()).c();
                            j8bVar.getClass();
                            ctf0Var5.getClass();
                            set.getClass();
                            List<mlr> list3 = j8bVar.c;
                            ArrayList arrayList5 = new ArrayList(r3d.q(list3, 10));
                            for (mlr mlrVar : list3) {
                                Set set2 = set;
                                if ((set2 instanceof Collection) && set2.isEmpty()) {
                                    z6 = zBooleanValue;
                                    ot0Var = ot0Var2;
                                    z7 = false;
                                } else {
                                    Iterator it5 = set2.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            z6 = zBooleanValue;
                                            ot0Var = ot0Var2;
                                            if (((Number) it5.next()).longValue() == mlrVar.f22006a) {
                                                z7 = true;
                                            } else {
                                                zBooleanValue = z6;
                                                ot0Var2 = ot0Var;
                                            }
                                        } else {
                                            z6 = zBooleanValue;
                                            ot0Var = ot0Var2;
                                            z7 = false;
                                        }
                                    }
                                }
                                pt0 pt0VarG0 = x4d0.g0(ot0Var);
                                Integer numValueOf = Integer.valueOf((int) j8bVar.f16074a);
                                mlrVar.getClass();
                                boolean z14 = mlrVar.k;
                                int i16 = z13 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                boolean z15 = mlrVar.j;
                                if (z14) {
                                    it = it4;
                                    str4 = str14;
                                    z8 = z13;
                                    strA5 = ctf0Var5.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    it = it4;
                                    str4 = str14;
                                    z8 = z13;
                                    strA5 = z15 ? ctf0Var5.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : str4;
                                }
                                Set set3 = set;
                                long j3 = mlrVar.f22006a;
                                String str212 = mlrVar.f;
                                String str213 = mlrVar.e;
                                mtr mtrVar = new mtr(z6 ? z7 ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, z7);
                                n0x n0xVar2 = new n0x(mlrVar.g);
                                m0x m0xVar = new m0x(i16, null, 6);
                                if (strA5.length() == 0) {
                                    murVar = lur.f20686a;
                                    n0xVar = n0xVar2;
                                } else {
                                    pt0 pt0Var3 = pt0.f27539a;
                                    if ((pt0VarG0 == pt0Var3 && z14) || (pt0VarG0 == (pt0Var = pt0.c) && z14)) {
                                        n0xVar = n0xVar2;
                                    } else {
                                        n0xVar = n0xVar2;
                                        pt0 pt0Var4 = pt0.d;
                                        if (pt0VarG0 != pt0Var4 || !z14) {
                                            if ((pt0VarG0 == pt0Var3 && z15) || ((pt0VarG0 == pt0Var && z15) || (pt0VarG0 == pt0Var4 && z15))) {
                                                d4d d4dVar = d4d.PRIMARY;
                                                uqo0Var = new eqo0();
                                            } else {
                                                pt0 pt0Var5 = pt0.b;
                                                uqo0Var = ((pt0VarG0 == pt0Var5 && z14) || (pt0VarG0 == (pt0Var2 = pt0.e) && z14)) ? kro0.f18776a : ((pt0VarG0 == pt0Var5 && z15) || (pt0VarG0 == pt0Var2 && z15)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                            }
                                        }
                                        murVar = new mur(strA5, uqo0Var);
                                    }
                                    d4d d4dVar2 = d4d.PRIMARY;
                                    uqo0Var = new lro0();
                                    murVar = new mur(strA5, uqo0Var);
                                }
                                arrayList5.add(new st0(j3, str212, str213, mtrVar, n0xVar, m0xVar, numValueOf, murVar));
                                zBooleanValue = z6;
                                ot0Var2 = ot0Var;
                                it4 = it;
                                z13 = z8;
                                set = set3;
                                str14 = str4;
                            }
                            arrayList4.add(new h4r0(j8bVar.f16074a, j8bVar.d, j8bVar.b, new hjm(j8bVar.b, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var5.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166), new zll(x4d0.g0(ot0Var2), new wll(o0s.f24443a), arrayList5)));
                            y11Var4 = y11Var5;
                            it4 = it4;
                            str14 = str14;
                        }
                        return dyb.r0(arrayList4);
                    default:
                        q11 q11Var12 = (q11) y11Var2.z;
                        fee feeVar6 = (fee) obj;
                        feeVar6.getClass();
                        b7v b7vVar = (b7v) feeVar6.c();
                        if (b7vVar instanceof z6v) {
                            ArrayList arrayList6 = ((z6v) b7vVar).f43888a;
                            ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                            Iterator it6 = arrayList6.iterator();
                            while (it6.hasNext()) {
                                e65 e65Var = (e65) it6.next();
                                c01 c01Var2 = q11Var12.t;
                                ctf0 ctf0Var6 = y11Var2.b;
                                e65Var.getClass();
                                ArrayList arrayList8 = arrayList7;
                                double d2 = e65Var.b;
                                ctf0Var6.getClass();
                                List list4 = e65Var.k;
                                String str214 = str11;
                                String str215 = str12;
                                long j4 = e65Var.g.f44639a;
                                List list5 = e65Var.o;
                                List list6 = e65Var.n;
                                int i17 = e65Var.f7264a;
                                Iterator it7 = it6;
                                gom0 gom0Var = e65Var.i;
                                String str30 = str13;
                                List list7 = e65Var.l;
                                y11 y11Var6 = y11Var2;
                                if (list4.size() == 1) {
                                    ww90Var = ww90.f39878a;
                                } else if (list4.size() > 1) {
                                    ww90Var = ww90.b;
                                } else if (list6.isEmpty() || !list7.isEmpty()) {
                                    ww90Var = (list7.isEmpty() && list5.isEmpty()) ? ww90.c : ww90.d;
                                } else {
                                    ww90Var = ww90.b;
                                }
                                ArrayList arrayList9 = new ArrayList();
                                q11 q11Var13 = q11Var12;
                                ww90 ww90Var3 = ww90Var;
                                String str31 = str9;
                                lsm0 lsm0Var2 = ctf0Var6.b;
                                String strA1116 = lsm0Var2.a(R.string.for_games_title, Arrays.copyOf(new Object[0], 0));
                                m7m0 m7m0Var7 = m7m0.f21327a;
                                if (!list4.isEmpty()) {
                                    arrayList9.add(new pf8(strA1116, list4, nw80.t, m7m0Var7, new qp9(str14, i17, i17)));
                                }
                                String strA1117 = lsm0Var2.a(R.string.for_unavailable_games_title, Arrays.copyOf(new Object[0], 0));
                                if (!list6.isEmpty()) {
                                    arrayList9.add(new pf8(strA1117, list6, nw80.t, m7m0Var7, new qp9(str14, i17, i17)));
                                }
                                pf8 pf8Var4 = (pf8) CollectionsKt.firstOrNull(arrayList9);
                                ArrayList arrayList10 = new ArrayList();
                                String strA20 = lsm0Var2.a(R.string.for_providers_title, Arrays.copyOf(new Object[0], 0));
                                m7m0 m7m0Var8 = m7m0.b;
                                if (!list7.isEmpty()) {
                                    arrayList10.add(new pf8(strA20, list7, nw80.t, m7m0Var8, new qp9(str14, i17, i17)));
                                }
                                String strA21 = lsm0Var2.a(R.string.for_unavailable_providers_title, Arrays.copyOf(new Object[0], 0));
                                if (!list5.isEmpty()) {
                                    arrayList10.add(new pf8(strA21, list5, nw80.t, m7m0Var8, new qp9(str14, i17, i17)));
                                }
                                pf8 pf8Var5 = (pf8) CollectionsKt.firstOrNull(arrayList10);
                                double d3 = ((double) e65Var.e) * d2;
                                String str32 = str14;
                                DecimalFormat decimalFormat = new DecimalFormat("0.##", DecimalFormatSymbols.getInstance(Locale.US));
                                String str33 = decimalFormat.format(d3);
                                String str34 = decimalFormat.format(e65Var.d);
                                Date date9 = new Date(j4);
                                int i18 = e65Var.f7264a;
                                hnl hnlVarN17 = nkb.N(c01Var2);
                                String strA22 = lsm0Var2.a(R.string.bonus_amount_title, Arrays.copyOf(new Object[0], 0));
                                nnm0 nnm0Var = gom0Var.f11638a;
                                String strA23 = lsm0Var2.a(R.string.bonus_active, Arrays.copyOf(new Object[0], 0));
                                nnm0 nnm0Var2 = nnm0.ACTIVE;
                                if (nnm0Var != nnm0Var2) {
                                    strA23 = null;
                                }
                                String str35 = strA23 == null ? str32 : strA23;
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                int iOrdinal13 = c01Var2.ordinal();
                                if (iOrdinal13 != 0) {
                                    i7 = i18;
                                    if (iOrdinal13 == 1) {
                                        str5 = str215;
                                    } else if (iOrdinal13 == 2) {
                                        str5 = str32;
                                    } else if (iOrdinal13 == 3) {
                                        str5 = "Ticket_Primery";
                                    } else if (iOrdinal13 == 4) {
                                        str5 = str30;
                                    } else {
                                        t9f.b();
                                    }
                                } else {
                                    i7 = i18;
                                    str5 = str214;
                                }
                                String strL4 = kng0.l(str10, str5, "_Bonus.webp");
                                if (strL4.length() == 0) {
                                    sb2.setLength(0);
                                    str6 = str10;
                                } else {
                                    str6 = str10;
                                    int i19 = 0;
                                    if (StringsKt.O(strL4, ujn.h, false)) {
                                        sb2.setLength(i19);
                                        sb2.append(strL4);
                                    } else if (kotlin.text.c.x(strL4, "https://", false)) {
                                        i19 = 0;
                                        sb2.setLength(i19);
                                        sb2.append(strL4);
                                    } else {
                                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                            i8 = 1;
                                            c2 = '/';
                                        } else {
                                            sb2.append('/');
                                            c2 = '/';
                                            i8 = 1;
                                        }
                                        char[] cArr9 = new char[i8];
                                        cArr9[0] = c2;
                                        sb2.append(StringsKt.y0(strL4, cArr9));
                                    }
                                }
                                String string9 = sb2.toString();
                                String str36 = e65Var.c;
                                pn40 pn40Var18 = pn40.f27267a;
                                String strL5 = kng0.l(str36, str31, pn40.c(d2, p3u0.c));
                                String str37 = pf8Var5 != null ? pf8Var5.f26889a : null;
                                String str38 = str37 == null ? str32 : str37;
                                String str39 = pf8Var4 != null ? pf8Var4.f26889a : null;
                                String str40 = str39 == null ? str32 : str39;
                                int iOrdinal14 = nnm0Var.ordinal();
                                if (iOrdinal14 != 0) {
                                    if (iOrdinal14 != 5) {
                                        str7 = str32;
                                        i9 = 0;
                                    } else {
                                        i9 = 0;
                                        strA6 = lsm0Var2.a(R.string.resume, Arrays.copyOf(new Object[0], 0));
                                    }
                                    if (nnm0Var == nnm0Var2) {
                                        i10 = 1;
                                    } else {
                                        i10 = i9;
                                    }
                                    if (nnm0Var == nnm0.READY) {
                                        strA7 = lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[i9], i9));
                                        ww90Var2 = ww90Var3;
                                    } else {
                                        if (i10 != 0) {
                                            ww90Var2 = ww90Var3;
                                            if (ww90Var2 == ww90.f39878a) {
                                                strA8 = lsm0Var2.a(R.string.play_button, Arrays.copyOf(new Object[i9], i9));
                                            }
                                            strA7 = strA8;
                                        } else {
                                            ww90Var2 = ww90Var3;
                                        }
                                        if (i10 == 0 && ww90Var2 == ww90.b) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        } else if (i10 == 0 && ww90Var2 == ww90.d) {
                                            strA8 = lsm0Var2.a(R.string.all_providers, Arrays.copyOf(new Object[i9], i9));
                                        } else if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        } else {
                                            strA7 = str32;
                                        }
                                        strA7 = strA8;
                                    }
                                    if (pf8Var5 != null || (list2 = pf8Var5.b) == null) {
                                        a4xVarO0 = lak0.c;
                                    } else {
                                        ArrayList arrayList11 = new ArrayList(r3d.q(list2, 10));
                                        Iterator it8 = list2.iterator();
                                        while (it8.hasNext()) {
                                            arrayList11.add(((az5) it8.next()).b);
                                        }
                                        a4xVarO0 = dyb.o0(arrayList11);
                                        if (a4xVarO0 == null) {
                                            a4xVarO0 = lak0.c;
                                        }
                                    }
                                    a4x a4xVar14 = a4xVarO0;
                                    if (pf8Var4 != null || (list = pf8Var4.b) == null) {
                                        a4xVarO1 = lak0.c;
                                    } else {
                                        ArrayList arrayList12 = new ArrayList(r3d.q(list, 10));
                                        Iterator it9 = list.iterator();
                                        while (it9.hasNext()) {
                                            arrayList12.add(((az5) it9.next()).b);
                                        }
                                        a4xVarO1 = dyb.o0(arrayList12);
                                        if (a4xVarO1 == null) {
                                            a4xVarO1 = lak0.c;
                                        }
                                    }
                                    a4x a4xVar15 = a4xVarO1;
                                    ovl ovlVar9 = new ovl(lsm0Var2.a(R.string.roleplaying_title, Arrays.copyOf(new Object[0], 0)), str34, kng0.k("/ ", str33));
                                    q7n q7nVarR9 = vbw0.R(ctf0Var6, date9, Long.valueOf(j4));
                                    if (pf8Var5 == null || pf8Var4 != null) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (pf8Var5 != null || pf8Var4 == null) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    uzh uzhVar9 = new uzh(hnlVarN17, strA22, str35, string9, strL5, str38, str40, null, null, a4xVar14, a4xVar15, true, null, null, str7, strA7, 0, ovlVar9, q7nVarR9, new tzh(z9, z10, false, false));
                                    hnl hnlVarN18 = nkb.N(c01Var2);
                                    iOrdinal2 = nnm0Var.ordinal();
                                    if (iOrdinal2 != 0) {
                                        m7m0Var2 = m7m0.f;
                                    } else if (iOrdinal2 != 1) {
                                        m7m0Var2 = m7m0.c;
                                    } else if (iOrdinal2 != 5) {
                                        m7m0Var2 = m7m0.i;
                                    } else {
                                        m7m0Var2 = m7m0.e;
                                    }
                                    m7m0 m7m0Var117 = m7m0Var2;
                                    nw80Var = nw80.b;
                                    j = i17;
                                    vf8 vf8Var10 = new vf8(i17, j, nw80Var, m7m0Var117, "");
                                    listJ = q3d.j(pf8Var4, pf8Var5);
                                    iOrdinal3 = nnm0Var.ordinal();
                                    if (iOrdinal3 != 0) {
                                        if (iOrdinal3 != 1) {
                                            iOrdinal8 = nnm0Var.ordinal();
                                            if (iOrdinal8 != 0) {
                                                m7m0Var5 = m7m0.f;
                                            } else if (iOrdinal8 != 1) {
                                                m7m0Var5 = m7m0.c;
                                            } else if (iOrdinal8 != 5) {
                                                m7m0Var5 = m7m0.i;
                                            } else {
                                                m7m0Var5 = m7m0.e;
                                            }
                                            vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var5, "");
                                        } else if (iOrdinal3 != 5) {
                                            vf8Var = new vf8(0, j, nw80Var, m7m0.i, "");
                                            str14 = str32;
                                        } else {
                                            iOrdinal9 = nnm0Var.ordinal();
                                            if (iOrdinal9 != 0) {
                                                m7m0Var6 = m7m0.f;
                                            } else if (iOrdinal9 != 1) {
                                                m7m0Var6 = m7m0.c;
                                            } else if (iOrdinal9 != 5) {
                                                m7m0Var6 = m7m0.i;
                                            } else {
                                                m7m0Var6 = m7m0.e;
                                            }
                                            vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var6, "");
                                        }
                                        str14 = str32;
                                        vf8Var2 = vf8Var3;
                                        arrayList8.add(new r11(uzhVar9, hnlVarN18, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var10, vf8Var2, i7));
                                        arrayList7 = arrayList8;
                                        str9 = str31;
                                        str10 = str6;
                                        str11 = str214;
                                        str12 = str215;
                                        it6 = it7;
                                        str13 = str30;
                                        y11Var2 = y11Var6;
                                        q11Var12 = q11Var13;
                                    } else {
                                        pf8Var = (pf8) CollectionsKt.firstOrNull(listJ);
                                        if (pf8Var != null) {
                                            pf8Var3 = (pf8) CollectionsKt.firstOrNull(listJ);
                                            if (pf8Var3 != null) {
                                                qp9 qp9Var15 = pf8Var3.e;
                                                qp9Var2 = new qp9(qp9Var15.b, qp9Var15.f29104a, j);
                                                str14 = str32;
                                            } else {
                                                str14 = str32;
                                                qp9Var2 = new qp9(str14, 0, 0L);
                                            }
                                            qp9 qp9Var16 = qp9Var2;
                                            String str47 = pf8Var.f26889a;
                                            List list14 = pf8Var.b;
                                            nw80 nw80Var16 = pf8Var.c;
                                            m7m0 m7m0Var118 = pf8Var.d;
                                            str47.getClass();
                                            list14.getClass();
                                            pf8Var2 = new pf8(str47, list14, nw80Var16, m7m0Var118, qp9Var16);
                                        } else {
                                            str14 = str32;
                                            iun iunVar7 = iun.f15405a;
                                            nw80 nw80Var17 = nw80.t;
                                            iOrdinal4 = nnm0Var.ordinal();
                                            if (iOrdinal4 != 0) {
                                                m7m0Var3 = m7m0.f;
                                            } else if (iOrdinal4 != 1) {
                                                m7m0Var3 = m7m0.c;
                                            } else if (iOrdinal4 != 5) {
                                                m7m0Var3 = m7m0.i;
                                            } else {
                                                m7m0Var3 = m7m0.e;
                                            }
                                            pf8Var2 = new pf8("", iunVar7, nw80Var17, m7m0Var3, new qp9(str14, 0, 0L));
                                        }
                                        iOrdinal5 = ww90Var2.ordinal();
                                        if (iOrdinal5 != 0) {
                                            m7m0Var4 = m7m0.g;
                                        } else if (iOrdinal5 != 1) {
                                            m7m0Var4 = m7m0.f21327a;
                                        } else if (iOrdinal5 != 2) {
                                            m7m0Var4 = m7m0.d;
                                        } else if (iOrdinal5 != 3) {
                                            m7m0Var4 = m7m0.b;
                                        } else if (iOrdinal5 == 4) {
                                            m7m0Var4 = m7m0.i;
                                        } else {
                                            t9f.b();
                                        }
                                        m7m0 m7m0Var119 = m7m0Var4;
                                        iOrdinal6 = ww90Var2.ordinal();
                                        qp9Var = pf8Var2.e;
                                        if (iOrdinal6 != 0) {
                                            az5Var = (az5) CollectionsKt.firstOrNull(pf8Var2.b);
                                            if (az5Var != null) {
                                                i11 = az5Var.f1701a;
                                            } else {
                                                i11 = qp9Var.f29104a;
                                            }
                                            i12 = i11;
                                        } else if (iOrdinal6 != 1 || iOrdinal6 == 3) {
                                            i12 = i17;
                                        } else {
                                            i12 = 0;
                                        }
                                        iOrdinal7 = ww90Var2.ordinal();
                                        if (iOrdinal7 == 0) {
                                            strA9 = qp9Var.b;
                                        } else if (iOrdinal7 != 1 || iOrdinal7 == 2) {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            if (iOrdinal7 == 3) {
                                                strA9 = lsm0Var2.a(R.string.all_providers, Arrays.copyOf(new Object[0], 0));
                                            } else if (iOrdinal7 == 4) {
                                                str8 = str14;
                                            } else {
                                                t9f.b();
                                            }
                                            vf8Var = new vf8(i12, j, nw80Var, m7m0Var119, str8);
                                        }
                                        str8 = strA9;
                                        vf8Var = new vf8(i12, j, nw80Var, m7m0Var119, str8);
                                    }
                                    vf8Var2 = vf8Var;
                                    arrayList8.add(new r11(uzhVar9, hnlVarN18, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var10, vf8Var2, i7));
                                    arrayList7 = arrayList8;
                                    str9 = str31;
                                    str10 = str6;
                                    str11 = str214;
                                    str12 = str215;
                                    it6 = it7;
                                    str13 = str30;
                                    y11Var2 = y11Var6;
                                    q11Var12 = q11Var13;
                                } else {
                                    i9 = 0;
                                    strA6 = lsm0Var2.a(R.string.suspend, Arrays.copyOf(new Object[0], 0));
                                }
                                str7 = strA6;
                                if (nnm0Var == nnm0Var2) {
                                    i10 = 1;
                                } else {
                                    i10 = i9;
                                }
                                if (nnm0Var == nnm0.READY) {
                                    strA7 = lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[i9], i9));
                                    ww90Var2 = ww90Var3;
                                } else {
                                    if (i10 != 0) {
                                        ww90Var2 = ww90Var3;
                                        if (ww90Var2 == ww90.f39878a) {
                                            strA8 = lsm0Var2.a(R.string.play_button, Arrays.copyOf(new Object[i9], i9));
                                        }
                                        strA7 = strA8;
                                    } else {
                                        ww90Var2 = ww90Var3;
                                    }
                                    if (i10 == 0) {
                                        if (i10 == 0) {
                                            if (i10 != 0) {
                                                strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                                strA7 = strA8;
                                            } else {
                                                strA7 = str32;
                                            }
                                        } else if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                            strA7 = strA8;
                                        } else {
                                            strA7 = str32;
                                        }
                                    } else if (i10 == 0) {
                                        if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                            strA7 = strA8;
                                        } else {
                                            strA7 = str32;
                                        }
                                    } else if (i10 != 0) {
                                        strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        strA7 = strA8;
                                    } else {
                                        strA7 = str32;
                                    }
                                }
                                if (pf8Var5 != null) {
                                    a4xVarO0 = lak0.c;
                                } else {
                                    a4xVarO0 = lak0.c;
                                }
                                a4x a4xVar16 = a4xVarO0;
                                if (pf8Var4 != null) {
                                    a4xVarO1 = lak0.c;
                                } else {
                                    a4xVarO1 = lak0.c;
                                }
                                a4x a4xVar17 = a4xVarO1;
                                ovl ovlVar10 = new ovl(lsm0Var2.a(R.string.roleplaying_title, Arrays.copyOf(new Object[0], 0)), str34, kng0.k("/ ", str33));
                                q7n q7nVarR10 = vbw0.R(ctf0Var6, date9, Long.valueOf(j4));
                                if (pf8Var5 == null) {
                                    z9 = true;
                                } else {
                                    z9 = true;
                                }
                                if (pf8Var5 != null) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                uzh uzhVar10 = new uzh(hnlVarN17, strA22, str35, string9, strL5, str38, str40, null, null, a4xVar16, a4xVar17, true, null, null, str7, strA7, 0, ovlVar10, q7nVarR10, new tzh(z9, z10, false, false));
                                hnl hnlVarN19 = nkb.N(c01Var2);
                                iOrdinal2 = nnm0Var.ordinal();
                                if (iOrdinal2 != 0) {
                                    m7m0Var2 = m7m0.f;
                                } else if (iOrdinal2 != 1) {
                                    m7m0Var2 = m7m0.c;
                                } else if (iOrdinal2 != 5) {
                                    m7m0Var2 = m7m0.i;
                                } else {
                                    m7m0Var2 = m7m0.e;
                                }
                                m7m0 m7m0Var1110 = m7m0Var2;
                                nw80Var = nw80.b;
                                j = i17;
                                vf8 vf8Var11 = new vf8(i17, j, nw80Var, m7m0Var1110, "");
                                listJ = q3d.j(pf8Var4, pf8Var5);
                                iOrdinal3 = nnm0Var.ordinal();
                                if (iOrdinal3 != 0) {
                                    if (iOrdinal3 != 1) {
                                        iOrdinal8 = nnm0Var.ordinal();
                                        if (iOrdinal8 != 0) {
                                            m7m0Var5 = m7m0.f;
                                        } else if (iOrdinal8 != 1) {
                                            m7m0Var5 = m7m0.c;
                                        } else if (iOrdinal8 != 5) {
                                            m7m0Var5 = m7m0.i;
                                        } else {
                                            m7m0Var5 = m7m0.e;
                                        }
                                        vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var5, "");
                                    } else if (iOrdinal3 != 5) {
                                        vf8Var = new vf8(0, j, nw80Var, m7m0.i, "");
                                        str14 = str32;
                                    } else {
                                        iOrdinal9 = nnm0Var.ordinal();
                                        if (iOrdinal9 != 0) {
                                            m7m0Var6 = m7m0.f;
                                        } else if (iOrdinal9 != 1) {
                                            m7m0Var6 = m7m0.c;
                                        } else if (iOrdinal9 != 5) {
                                            m7m0Var6 = m7m0.i;
                                        } else {
                                            m7m0Var6 = m7m0.e;
                                        }
                                        vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var6, "");
                                    }
                                    str14 = str32;
                                    vf8Var2 = vf8Var3;
                                    arrayList8.add(new r11(uzhVar10, hnlVarN19, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var11, vf8Var2, i7));
                                    arrayList7 = arrayList8;
                                    str9 = str31;
                                    str10 = str6;
                                    str11 = str214;
                                    str12 = str215;
                                    it6 = it7;
                                    str13 = str30;
                                    y11Var2 = y11Var6;
                                    q11Var12 = q11Var13;
                                } else {
                                    pf8Var = (pf8) CollectionsKt.firstOrNull(listJ);
                                    if (pf8Var != null) {
                                        pf8Var3 = (pf8) CollectionsKt.firstOrNull(listJ);
                                        if (pf8Var3 != null) {
                                            qp9 qp9Var17 = pf8Var3.e;
                                            qp9Var2 = new qp9(qp9Var17.b, qp9Var17.f29104a, j);
                                            str14 = str32;
                                        } else {
                                            str14 = str32;
                                            qp9Var2 = new qp9(str14, 0, 0L);
                                        }
                                        qp9 qp9Var18 = qp9Var2;
                                        String str48 = pf8Var.f26889a;
                                        List list15 = pf8Var.b;
                                        nw80 nw80Var18 = pf8Var.c;
                                        m7m0 m7m0Var1111 = pf8Var.d;
                                        str48.getClass();
                                        list15.getClass();
                                        pf8Var2 = new pf8(str48, list15, nw80Var18, m7m0Var1111, qp9Var18);
                                    } else {
                                        str14 = str32;
                                        iun iunVar8 = iun.f15405a;
                                        nw80 nw80Var19 = nw80.t;
                                        iOrdinal4 = nnm0Var.ordinal();
                                        if (iOrdinal4 != 0) {
                                            m7m0Var3 = m7m0.f;
                                        } else if (iOrdinal4 != 1) {
                                            m7m0Var3 = m7m0.c;
                                        } else if (iOrdinal4 != 5) {
                                            m7m0Var3 = m7m0.i;
                                        } else {
                                            m7m0Var3 = m7m0.e;
                                        }
                                        pf8Var2 = new pf8("", iunVar8, nw80Var19, m7m0Var3, new qp9(str14, 0, 0L));
                                    }
                                    iOrdinal5 = ww90Var2.ordinal();
                                    if (iOrdinal5 != 0) {
                                        m7m0Var4 = m7m0.g;
                                    } else if (iOrdinal5 != 1) {
                                        m7m0Var4 = m7m0.f21327a;
                                    } else if (iOrdinal5 != 2) {
                                        m7m0Var4 = m7m0.d;
                                    } else if (iOrdinal5 != 3) {
                                        m7m0Var4 = m7m0.b;
                                    } else if (iOrdinal5 == 4) {
                                        m7m0Var4 = m7m0.i;
                                    } else {
                                        t9f.b();
                                    }
                                    m7m0 m7m0Var1112 = m7m0Var4;
                                    iOrdinal6 = ww90Var2.ordinal();
                                    qp9Var = pf8Var2.e;
                                    if (iOrdinal6 != 0) {
                                        az5Var = (az5) CollectionsKt.firstOrNull(pf8Var2.b);
                                        if (az5Var != null) {
                                            i11 = az5Var.f1701a;
                                        } else {
                                            i11 = qp9Var.f29104a;
                                        }
                                        i12 = i11;
                                    } else if (iOrdinal6 != 1) {
                                        i12 = i17;
                                    } else {
                                        i12 = i17;
                                    }
                                    iOrdinal7 = ww90Var2.ordinal();
                                    if (iOrdinal7 == 0) {
                                        if (iOrdinal7 != 1) {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        }
                                        vf8Var = new vf8(i12, j, nw80Var, m7m0Var1112, str8);
                                    } else {
                                        strA9 = qp9Var.b;
                                    }
                                    str8 = strA9;
                                    vf8Var = new vf8(i12, j, nw80Var, m7m0Var1112, str8);
                                }
                                vf8Var2 = vf8Var;
                                arrayList8.add(new r11(uzhVar10, hnlVarN19, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var11, vf8Var2, i7));
                                arrayList7 = arrayList8;
                                str9 = str31;
                                str10 = str6;
                                str11 = str214;
                                str12 = str215;
                                it6 = it7;
                                str13 = str30;
                                y11Var2 = y11Var6;
                                q11Var12 = q11Var13;
                            }
                            return dyb.r0(arrayList7);
                        }
                        if (Intrinsics.d(b7vVar, a7v.f393a)) {
                            return i4w0.N(q11Var12.t);
                        }
                        t9f.b();
                        return null;
                }
            }
        }, (byte) 20));
        final byte b8 = 1;
        this.y = maz.b(new yw9((fee) n0o0VarH7.getValue(), new Function1(this) { // from class: a.x11
            public final /* synthetic */ y11 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
            /* JADX WARN: Code duplicated, block: B:103:0x02c0  */
            /* JADX WARN: Code duplicated, block: B:106:0x02c9  */
            /* JADX WARN: Code duplicated, block: B:107:0x02db A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:108:0x02dd  */
            /* JADX WARN: Code duplicated, block: B:110:0x02e3  */
            /* JADX WARN: Code duplicated, block: B:112:0x02f3  */
            /* JADX WARN: Code duplicated, block: B:117:0x0306 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:118:0x0308  */
            /* JADX WARN: Code duplicated, block: B:121:0x031a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:122:0x031c  */
            /* JADX WARN: Code duplicated, block: B:123:0x0327  */
            /* JADX WARN: Code duplicated, block: B:135:0x035a  */
            /* JADX WARN: Code duplicated, block: B:147:0x038e  */
            /* JADX WARN: Code duplicated, block: B:153:0x03bb  */
            /* JADX WARN: Code duplicated, block: B:158:0x03c3  */
            /* JADX WARN: Code duplicated, block: B:161:0x03e7  */
            /* JADX WARN: Code duplicated, block: B:163:0x03ea  */
            /* JADX WARN: Code duplicated, block: B:165:0x03ed  */
            /* JADX WARN: Code duplicated, block: B:167:0x03f2  */
            /* JADX WARN: Code duplicated, block: B:168:0x03f5  */
            /* JADX WARN: Code duplicated, block: B:169:0x03f8  */
            /* JADX WARN: Code duplicated, block: B:172:0x0419  */
            /* JADX WARN: Code duplicated, block: B:174:0x041c  */
            /* JADX WARN: Code duplicated, block: B:176:0x041f  */
            /* JADX WARN: Code duplicated, block: B:178:0x0434  */
            /* JADX WARN: Code duplicated, block: B:180:0x043a A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:181:0x043c A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:182:0x043e  */
            /* JADX WARN: Code duplicated, block: B:184:0x0443  */
            /* JADX WARN: Code duplicated, block: B:185:0x0446  */
            /* JADX WARN: Code duplicated, block: B:186:0x0449  */
            /* JADX WARN: Code duplicated, block: B:189:0x0459  */
            /* JADX WARN: Code duplicated, block: B:191:0x045f  */
            /* JADX WARN: Code duplicated, block: B:193:0x0462  */
            /* JADX WARN: Code duplicated, block: B:195:0x0465  */
            /* JADX WARN: Code duplicated, block: B:197:0x046a  */
            /* JADX WARN: Code duplicated, block: B:198:0x046d  */
            /* JADX WARN: Code duplicated, block: B:199:0x0470  */
            /* JADX WARN: Code duplicated, block: B:201:0x047b  */
            /* JADX WARN: Code duplicated, block: B:203:0x0487  */
            /* JADX WARN: Code duplicated, block: B:205:0x048f  */
            /* JADX WARN: Code duplicated, block: B:207:0x049f  */
            /* JADX WARN: Code duplicated, block: B:209:0x04c6  */
            /* JADX WARN: Code duplicated, block: B:211:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:213:0x04d7  */
            /* JADX WARN: Code duplicated, block: B:215:0x04da  */
            /* JADX WARN: Code duplicated, block: B:217:0x04df  */
            /* JADX WARN: Code duplicated, block: B:218:0x04e2  */
            /* JADX WARN: Code duplicated, block: B:219:0x04e5  */
            /* JADX WARN: Code duplicated, block: B:223:0x04fd  */
            /* JADX WARN: Code duplicated, block: B:225:0x0500  */
            /* JADX WARN: Code duplicated, block: B:227:0x0503  */
            /* JADX WARN: Code duplicated, block: B:229:0x0506  */
            /* JADX WARN: Code duplicated, block: B:231:0x0509  */
            /* JADX WARN: Code duplicated, block: B:234:0x0513  */
            /* JADX WARN: Code duplicated, block: B:235:0x0516  */
            /* JADX WARN: Code duplicated, block: B:236:0x0519  */
            /* JADX WARN: Code duplicated, block: B:237:0x051c  */
            /* JADX WARN: Code duplicated, block: B:240:0x0527  */
            /* JADX WARN: Code duplicated, block: B:245:0x0530  */
            /* JADX WARN: Code duplicated, block: B:246:0x0533  */
            /* JADX WARN: Code duplicated, block: B:248:0x053d  */
            /* JADX WARN: Code duplicated, block: B:250:0x0542  */
            /* JADX WARN: Code duplicated, block: B:253:0x054b  */
            /* JADX WARN: Code duplicated, block: B:265:0x0570  */
            /* JADX WARN: Code duplicated, block: B:266:0x057f  */
            /* JADX WARN: Code duplicated, block: B:468:0x0b96  */
            /* JADX WARN: Code duplicated, block: B:469:0x0bb1  */
            /* JADX WARN: Code duplicated, block: B:471:0x0bbf  */
            /* JADX WARN: Code duplicated, block: B:472:0x0bd0  */
            /* JADX WARN: Code duplicated, block: B:484:0x0be9  */
            /* JADX WARN: Code duplicated, block: B:485:0x0bfb  */
            /* JADX WARN: Code duplicated, block: B:487:0x0bff  */
            /* JADX WARN: Code duplicated, block: B:488:0x0c11  */
            /* JADX WARN: Code duplicated, block: B:491:0x0c46  */
            /* JADX WARN: Code duplicated, block: B:493:0x0c4b  */
            /* JADX WARN: Code duplicated, block: B:495:0x0c4e  */
            /* JADX WARN: Code duplicated, block: B:497:0x0c51  */
            /* JADX WARN: Code duplicated, block: B:499:0x0c54  */
            /* JADX WARN: Code duplicated, block: B:502:0x0c5d  */
            /* JADX WARN: Code duplicated, block: B:503:0x0c61  */
            /* JADX WARN: Code duplicated, block: B:504:0x0c64  */
            /* JADX WARN: Code duplicated, block: B:505:0x0c67  */
            /* JADX WARN: Code duplicated, block: B:508:0x0c7b  */
            /* JADX WARN: Code duplicated, block: B:509:0x0c84  */
            /* JADX WARN: Code duplicated, block: B:511:0x0c8f  */
            /* JADX WARN: Code duplicated, block: B:513:0x0c95  */
            /* JADX WARN: Code duplicated, block: B:514:0x0c96 A[PHI: r15
  0x0c96: PHI (r15v12 int) = (r15v11 int), (r15v17 int) binds: [B:510:0x0c8d, B:513:0x0c95] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:515:0x0c99  */
            /* JADX WARN: Code duplicated, block: B:520:0x0cae  */
            /* JADX WARN: Code duplicated, block: B:525:0x0ce6  */
            /* JADX WARN: Code duplicated, block: B:527:0x0cf9  */
            /* JADX WARN: Code duplicated, block: B:530:0x0d0b  */
            /* JADX WARN: Code duplicated, block: B:531:0x0d0e  */
            /* JADX WARN: Code duplicated, block: B:534:0x0d1c  */
            /* JADX WARN: Code duplicated, block: B:535:0x0d1f  */
            /* JADX WARN: Code duplicated, block: B:537:0x0d2f  */
            /* JADX WARN: Code duplicated, block: B:538:0x0d31  */
            /* JADX WARN: Code duplicated, block: B:540:0x0d37  */
            /* JADX WARN: Code duplicated, block: B:541:0x0d39  */
            /* JADX WARN: Code duplicated, block: B:544:0x0d4e  */
            /* JADX WARN: Code duplicated, block: B:545:0x0d50  */
            /* JADX WARN: Code duplicated, block: B:547:0x0d53  */
            /* JADX WARN: Code duplicated, block: B:549:0x0d57  */
            /* JADX WARN: Code duplicated, block: B:552:0x0d79  */
            /* JADX WARN: Code duplicated, block: B:554:0x0d7e  */
            /* JADX WARN: Code duplicated, block: B:564:0x050e A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:579:0x0c57 A[SYNTHETIC] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y11 y11Var;
                boolean z;
                int i;
                boolean z2;
                String strL;
                String strL2;
                String strA;
                String strA2;
                lsm0 lsm0Var;
                boolean z3;
                int i2;
                StringBuilder sb;
                int iOrdinal;
                int i3;
                String str;
                String str2;
                String strL3;
                int i4;
                int i5;
                char c;
                String strA3;
                lak0 lak0Var;
                i4 i4VarG0;
                String strA4;
                String strValueOf;
                String strM;
                boolean z4;
                boolean z5;
                m7m0 m7m0Var;
                int i6;
                int iA;
                ijl ijlVar;
                String str3;
                String strC;
                boolean z6;
                ot0 ot0Var;
                boolean z7;
                Iterator it;
                String str4;
                boolean z8;
                String strA5;
                pt0 pt0Var;
                n0x n0xVar;
                pt0 pt0Var2;
                sso0 uqo0Var;
                nur murVar;
                ww90 ww90Var;
                int i7;
                String str5;
                String str6;
                int i8;
                char c2;
                int i9;
                String strA6;
                String str7;
                int i10;
                ww90 ww90Var2;
                String strA7;
                String strA8;
                a4x a4xVarO0;
                a4x a4xVarO1;
                boolean z9;
                boolean z10;
                int iOrdinal2;
                m7m0 m7m0Var2;
                nw80 nw80Var;
                long j;
                List listJ;
                int iOrdinal3;
                pf8 pf8Var;
                int iOrdinal4;
                m7m0 m7m0Var3;
                pf8 pf8Var2;
                int iOrdinal5;
                m7m0 m7m0Var4;
                int iOrdinal6;
                qp9 qp9Var;
                az5 az5Var;
                int i11;
                int i12;
                int iOrdinal7;
                String strA9;
                String str8;
                vf8 vf8Var;
                pf8 pf8Var3;
                qp9 qp9Var2;
                vf8 vf8Var2;
                int iOrdinal8;
                m7m0 m7m0Var5;
                vf8 vf8Var3;
                int iOrdinal9;
                m7m0 m7m0Var6;
                List list;
                List list2;
                byte b9 = b8;
                String str9 = Separators.SP;
                String str10 = "static/img/android/casino/alt_design/aggregator_gift_card/";
                String str11 = "Background_Picture";
                String str12 = "Background_Illustration";
                String str13 = "Ticket_Secondary";
                String str14 = "";
                y11 y11Var2 = this.b;
                switch (b9) {
                    case 0:
                        y11 y11Var3 = y11Var2;
                        String str15 = "static/img/android/casino/alt_design/aggregator_gift_card/";
                        q11 q11Var2 = (q11) y11Var3.z;
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        m7v m7vVar = (m7v) feeVar2.c();
                        if (m7vVar instanceof k7v) {
                            ArrayList arrayList = ((k7v) m7vVar).f17842a;
                            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                n65 n65Var = (n65) it2.next();
                                c01 c01Var = q11Var2.t;
                                ctf0 ctf0Var2 = y11Var3.b;
                                n65Var.getClass();
                                int i13 = n65Var.c;
                                ctf0Var2.getClass();
                                dqs dqsVar = n65Var.e;
                                String str16 = dqsVar.d;
                                long j2 = n65Var.d.f44639a;
                                int i14 = n65Var.b;
                                Iterator it3 = it2;
                                if (i13 == i14) {
                                    y11Var = y11Var3;
                                    z = n65Var.l == na90.PAYMENT_AFTER_DEPOSIT;
                                    Date date8 = new Date(j2);
                                    if (z) {
                                        String str1118 = n65Var.k;
                                        pn40 pn40Var15 = pn40.f27267a;
                                        i = 2;
                                        z2 = true;
                                        strL = kng0.l(str1118, Separators.SP, pn40.j(n65Var.j, 2, true));
                                    } else {
                                        i = 2;
                                        z2 = true;
                                        strL = null;
                                    }
                                    if (z != 0) {
                                        String str1119 = n65Var.i;
                                        pn40 pn40Var16 = pn40.f27267a;
                                        strL2 = kng0.l(str1119, Separators.SP, pn40.j(n65Var.h, i, z2));
                                    } else {
                                        strL2 = null;
                                    }
                                    boolean z11 = (strL != null || strL.length() == 0) && (strL2 == null || strL2.length() == 0);
                                    if (z != 0) {
                                        strA = ctf0Var2.b.a(R.string.win_sum_title, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        strA = null;
                                    }
                                    if (z != 0) {
                                        strA2 = ctf0Var2.b.a(R.string.deposit_sum_title, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        strA2 = null;
                                    }
                                    lsm0Var = ctf0Var2.b;
                                    String strA1111 = lsm0Var.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
                                    q11 q11Var10 = q11Var2;
                                    z3 = z11;
                                    i2 = (int) n65Var.f22979a;
                                    hnl hnlVarN15 = nkb.N(c01Var);
                                    String strA1112 = lsm0Var.a(R.string.free_spins_title, Arrays.copyOf(new Object[0], 0));
                                    sb = new StringBuilder(ujn.h);
                                    iOrdinal = c01Var.ordinal();
                                    if (iOrdinal != 0) {
                                        i3 = i2;
                                        if (iOrdinal != 1) {
                                            str = "Background_Illustration";
                                        } else if (iOrdinal != 2) {
                                            str = "";
                                        } else if (iOrdinal != 3) {
                                            str = "Ticket_Primary";
                                        } else if (iOrdinal == 4) {
                                            str = "Ticket_Secondary";
                                        } else {
                                            t9f.b();
                                        }
                                    } else {
                                        i3 = i2;
                                        str = "Background_Picture";
                                    }
                                    str2 = str15;
                                    strL3 = kng0.l(str2, str, "_Spin.webp");
                                    if (strL3.length() == 0) {
                                        i4 = 0;
                                        sb.setLength(0);
                                        str15 = str2;
                                    } else {
                                        str15 = str2;
                                        i4 = 0;
                                        if (StringsKt.O(strL3, ujn.h, false)) {
                                            sb.setLength(i4);
                                            sb.append(strL3);
                                        } else if (kotlin.text.c.x(strL3, "https://", false)) {
                                            i4 = 0;
                                            sb.setLength(i4);
                                            sb.append(strL3);
                                        } else {
                                            if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                                                i5 = 1;
                                                c = '/';
                                            } else {
                                                sb.append('/');
                                                c = '/';
                                                i5 = 1;
                                            }
                                            char[] cArr8 = new char[i5];
                                            i4 = 0;
                                            cArr8[0] = c;
                                            sb.append(StringsKt.y0(strL3, cArr8));
                                        }
                                    }
                                    String string8 = sb.toString();
                                    String str11110 = strA1111 + Separators.SP + i14;
                                    String strA1113 = lsm0Var.a(R.string.for_games_title, Arrays.copyOf(new Object[i4], i4));
                                    if (z != 0) {
                                        strA3 = lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[i4], i4));
                                    } else {
                                        strA3 = lsm0Var.a(R.string.play_button, Arrays.copyOf(new Object[i4], i4));
                                    }
                                    String str27 = strA3;
                                    lak0Var = lak0.c;
                                    if (z != 0) {
                                        i4VarG0 = lak0Var;
                                    } else {
                                        i4VarG0 = dyb.g0(str16);
                                    }
                                    if (z != 0) {
                                        strA4 = "";
                                    } else {
                                        strA4 = lsm0Var.a(R.string.spins_title, Arrays.copyOf(new Object[0], 0));
                                    }
                                    if (z != 0) {
                                        strValueOf = null;
                                    } else {
                                        strValueOf = String.valueOf(i13);
                                    }
                                    if (z) {
                                        strM = null;
                                    } else {
                                        strM = twn.m(i14, " / ");
                                    }
                                    ovl ovlVar8 = new ovl(strA4, strValueOf, strM);
                                    q7n q7nVarR8 = vbw0.R(ctf0Var2, date8, Long.valueOf(j2));
                                    if (strA != null) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (strA2 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    uzh uzhVar8 = new uzh(hnlVarN15, strA1112, "", string8, str11110, "", strA1113, strA, strA2, lak0Var, i4VarG0, false, strL, strL2, "", str27, 12, ovlVar8, q7nVarR8, new tzh(true, false, z4, z5));
                                    hnl hnlVarN16 = nkb.N(c01Var);
                                    nw80 nw80Var9 = nw80.b;
                                    if (z3) {
                                        m7m0Var = m7m0.g;
                                    } else {
                                        m7m0Var = m7m0.h;
                                    }
                                    arrayList2.add(new r11(uzhVar8, hnlVarN16, null, null, null, new vf8(dqsVar.c, n65Var.f22979a, nw80Var9, m7m0Var, str16), i3));
                                    it2 = it3;
                                    q11Var2 = q11Var10;
                                    y11Var3 = y11Var;
                                } else {
                                    y11Var = y11Var3;
                                }
                                Date date9 = new Date(j2);
                                if (z) {
                                    String str11111 = n65Var.k;
                                    pn40 pn40Var17 = pn40.f27267a;
                                    i = 2;
                                    z2 = true;
                                    strL = kng0.l(str11111, Separators.SP, pn40.j(n65Var.j, 2, true));
                                } else {
                                    i = 2;
                                    z2 = true;
                                    strL = null;
                                }
                                if (z != 0) {
                                    String str11112 = n65Var.i;
                                    pn40 pn40Var18 = pn40.f27267a;
                                    strL2 = kng0.l(str11112, Separators.SP, pn40.j(n65Var.h, i, z2));
                                } else {
                                    strL2 = null;
                                }
                                if (strL != null) {
                                }
                                if (z != 0) {
                                    strA = ctf0Var2.b.a(R.string.win_sum_title, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA = null;
                                }
                                if (z != 0) {
                                    strA2 = ctf0Var2.b.a(R.string.deposit_sum_title, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    strA2 = null;
                                }
                                lsm0Var = ctf0Var2.b;
                                String strA1114 = lsm0Var.a(R.string.fs, Arrays.copyOf(new Object[0], 0));
                                q11 q11Var11 = q11Var2;
                                z3 = z11;
                                i2 = (int) n65Var.f22979a;
                                hnl hnlVarN17 = nkb.N(c01Var);
                                String strA1115 = lsm0Var.a(R.string.free_spins_title, Arrays.copyOf(new Object[0], 0));
                                sb = new StringBuilder(ujn.h);
                                iOrdinal = c01Var.ordinal();
                                if (iOrdinal != 0) {
                                    i3 = i2;
                                    if (iOrdinal != 1) {
                                        str = "Background_Illustration";
                                    } else if (iOrdinal != 2) {
                                        str = "";
                                    } else if (iOrdinal != 3) {
                                        str = "Ticket_Primary";
                                    } else if (iOrdinal == 4) {
                                        str = "Ticket_Secondary";
                                    } else {
                                        t9f.b();
                                    }
                                } else {
                                    i3 = i2;
                                    str = "Background_Picture";
                                }
                                str2 = str15;
                                strL3 = kng0.l(str2, str, "_Spin.webp");
                                if (strL3.length() == 0) {
                                    i4 = 0;
                                    sb.setLength(0);
                                    str15 = str2;
                                } else {
                                    str15 = str2;
                                    i4 = 0;
                                    if (StringsKt.O(strL3, ujn.h, false)) {
                                        sb.setLength(i4);
                                        sb.append(strL3);
                                    } else if (kotlin.text.c.x(strL3, "https://", false)) {
                                        i4 = 0;
                                        sb.setLength(i4);
                                        sb.append(strL3);
                                    } else {
                                        if (sb.length() > 0) {
                                            i5 = 1;
                                            c = '/';
                                        } else {
                                            i5 = 1;
                                            c = '/';
                                        }
                                        char[] cArr9 = new char[i5];
                                        i4 = 0;
                                        cArr9[0] = c;
                                        sb.append(StringsKt.y0(strL3, cArr9));
                                    }
                                }
                                String string9 = sb.toString();
                                String str11113 = strA1114 + Separators.SP + i14;
                                String strA1116 = lsm0Var.a(R.string.for_games_title, Arrays.copyOf(new Object[i4], i4));
                                if (z != 0) {
                                    strA3 = lsm0Var.a(R.string.refill_account, Arrays.copyOf(new Object[i4], i4));
                                } else {
                                    strA3 = lsm0Var.a(R.string.play_button, Arrays.copyOf(new Object[i4], i4));
                                }
                                String str28 = strA3;
                                lak0Var = lak0.c;
                                if (z != 0) {
                                    i4VarG0 = lak0Var;
                                } else {
                                    i4VarG0 = dyb.g0(str16);
                                }
                                if (z != 0) {
                                    strA4 = "";
                                } else {
                                    strA4 = lsm0Var.a(R.string.spins_title, Arrays.copyOf(new Object[0], 0));
                                }
                                if (z != 0) {
                                    strValueOf = null;
                                } else {
                                    strValueOf = String.valueOf(i13);
                                }
                                if (z) {
                                    strM = null;
                                } else {
                                    strM = twn.m(i14, " / ");
                                }
                                ovl ovlVar9 = new ovl(strA4, strValueOf, strM);
                                q7n q7nVarR9 = vbw0.R(ctf0Var2, date9, Long.valueOf(j2));
                                if (strA != null) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (strA2 != null) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                uzh uzhVar9 = new uzh(hnlVarN17, strA1115, "", string9, str11113, "", strA1116, strA, strA2, lak0Var, i4VarG0, false, strL, strL2, "", str28, 12, ovlVar9, q7nVarR9, new tzh(true, false, z4, z5));
                                hnl hnlVarN18 = nkb.N(c01Var);
                                nw80 nw80Var10 = nw80.b;
                                if (z3) {
                                    m7m0Var = m7m0.g;
                                } else {
                                    m7m0Var = m7m0.h;
                                }
                                arrayList2.add(new r11(uzhVar9, hnlVarN18, null, null, null, new vf8(dqsVar.c, n65Var.f22979a, nw80Var10, m7m0Var, str16), i3));
                                it2 = it3;
                                q11Var2 = q11Var11;
                                y11Var3 = y11Var;
                            }
                            return dyb.r0(arrayList2);
                        }
                        if (Intrinsics.d(m7vVar, l7v.f19578a)) {
                            return i4w0.N(q11Var2.t);
                        }
                        t9f.b();
                        return null;
                    case 1:
                        fee feeVar3 = (fee) obj;
                        feeVar3.getClass();
                        g7v g7vVar = (g7v) feeVar3.c();
                        if (!(g7vVar instanceof e7v)) {
                            if (Intrinsics.d(g7vVar, f7v.f9076a)) {
                                zcl zclVar = qmk.f28987a;
                                return new h7v(new gyl(null, s5x0.t(0.0f, 8.0f, 1), 1));
                            }
                            t9f.b();
                            return null;
                        }
                        if (((a4x) ((fee) y11Var2.x.getValue()).b()).size() + ((a4x) ((fee) y11Var2.w.getValue()).b()).size() <= 0) {
                            return i7v.f14312a;
                        }
                        a4x<y6v> a4xVar = ((e7v) g7vVar).f7345a;
                        ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar, 10));
                        for (y6v y6vVar : a4xVar) {
                            ctf0 ctf0Var3 = y11Var2.b;
                            d7v d7vVar = (d7v) ((fee) y11Var2.k.getValue()).c();
                            y6vVar.getClass();
                            d7v d7vVar2 = y6vVar.f42119a;
                            ctf0Var3.getClass();
                            d7vVar.getClass();
                            long jOrdinal = d7vVar2.ordinal();
                            int iOrdinal10 = d7vVar2.ordinal();
                            if (iOrdinal10 == 0) {
                                i6 = R.string.all;
                            } else if (iOrdinal10 == 1) {
                                i6 = R.string.bonuses_title;
                            } else {
                                if (iOrdinal10 != 2) {
                                    t9f.b();
                                    return null;
                                }
                                i6 = R.string.free_spins_title;
                            }
                            xxl xxlVar = new xxl(ctf0Var3.b.a(i6, Arrays.copyOf(new Object[0], 0)));
                            uxl uxlVar = d7vVar2 == d7vVar ? uxl.b : uxl.f36445a;
                            int i15 = y6vVar.b;
                            arrayList3.add(new lxl(jOrdinal, (dyl) xxlVar, false, uxlVar, i15 != 0 ? new cwl(new rpe(i15)) : null, 76));
                        }
                        return new h7v(new fyl(dyb.r0(arrayList3), null, null, s5x0.t(0.0f, 0.0f, 3), null, 22));
                    case 2:
                        int iIntValue = ((Integer) obj).intValue();
                        boolean z12 = ((q11) y11Var2.z).v;
                        int iIntValue2 = ((Number) ((fee) y11Var2.t.getValue()).b()).intValue();
                        if (z12) {
                            xuz xuzVar = pb10.c;
                            pb10 pb10Var = pb10.j;
                            xuzVar.getClass();
                            iA = xuz.a(pb10Var, iIntValue);
                        } else {
                            xuz xuzVar2 = pb10.c;
                            pb10 pb10Var2 = pb10.i;
                            xuzVar2.getClass();
                            iA = xuz.a(pb10Var2, iIntValue);
                        }
                        return new mdm(iA, null, null, 0, 0, iIntValue2, 0, 0, 0L, 0L, 990);
                    case 3:
                        ((fee) obj).getClass();
                        fee feeVar4 = (fee) y11Var2.c.getValue();
                        ctf0 ctf0Var4 = y11Var2.b;
                        if (!((Boolean) feeVar4.c()).booleanValue()) {
                            return new zc(ctf0Var4.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) y11Var2.d.getValue()).c();
                        kg kgVar = ((q11) y11Var2.z).u;
                        kgVar.getClass();
                        int iOrdinal11 = kgVar.ordinal();
                        if (iOrdinal11 == 0) {
                            ijlVar = ijl.f14880a;
                        } else if (iOrdinal11 == 1) {
                            ijlVar = ijl.b;
                        } else if (iOrdinal11 == 2) {
                            ijlVar = ijl.c;
                        } else if (iOrdinal11 == 3) {
                            ijlVar = ijl.d;
                        } else {
                            if (iOrdinal11 != 4) {
                                t9f.b();
                                return null;
                            }
                            ijlVar = ijl.e;
                        }
                        if (ql5Var != null) {
                            String strA1117 = ql5Var.j;
                            if (ijlVar == ijl.b) {
                                strA1117 = ctf0Var4.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA1117.length() <= 0) {
                                strA1117 = ql5Var.k;
                            }
                            str3 = strA1117;
                        } else {
                            str3 = null;
                        }
                        String str29 = str3 == null ? "" : str3;
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var19 = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str210 = strC == null ? "" : strC;
                        String str211 = ql5Var != null ? ql5Var.f : null;
                        String str212 = str211 == null ? "" : str211;
                        String strA1118 = ctf0Var4.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        return new xc(ijlVar, new jjl(str210, str212, strA1118, str29, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())));
                    case 4:
                        n0o0 n0o0Var = y11Var2.w;
                        n0o0 n0o0Var2 = y11Var2.x;
                        d7v d7vVar3 = (d7v) obj;
                        d7vVar3.getClass();
                        int iOrdinal12 = d7vVar3.ordinal();
                        if (iOrdinal12 == 0) {
                            return CollectionsKt.q0((Collection) ((fee) n0o0Var.getValue()).b(), (Iterable) ((fee) n0o0Var2.getValue()).b());
                        }
                        if (iOrdinal12 == 1) {
                            return (List) ((fee) n0o0Var.getValue()).b();
                        }
                        if (iOrdinal12 == 2) {
                            return (List) ((fee) n0o0Var2.getValue()).b();
                        }
                        t9f.b();
                        return null;
                    case 5:
                        ((Unit) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(((q11) y11Var2.z).r, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    case 6:
                        y11 y11Var4 = y11Var2;
                        fee feeVar5 = (fee) obj;
                        feeVar5.getClass();
                        Iterable iterable = (Iterable) feeVar5.c();
                        ArrayList arrayList4 = new ArrayList(r3d.q(iterable, 10));
                        Iterator it4 = iterable.iterator();
                        while (it4.hasNext()) {
                            j8b j8bVar = (j8b) it4.next();
                            y11 y11Var5 = y11Var4;
                            ctf0 ctf0Var5 = y11Var5.b;
                            boolean zBooleanValue = ((Boolean) ((fee) y11Var5.c.getValue()).c()).booleanValue();
                            q11 q11Var12 = (q11) y11Var5.z;
                            boolean z13 = q11Var12.v;
                            ot0 ot0Var2 = q11Var12.x;
                            Set set = (Set) ((fee) y11Var5.f.getValue()).c();
                            j8bVar.getClass();
                            ctf0Var5.getClass();
                            set.getClass();
                            List<mlr> list3 = j8bVar.c;
                            ArrayList arrayList5 = new ArrayList(r3d.q(list3, 10));
                            for (mlr mlrVar : list3) {
                                Set set2 = set;
                                if ((set2 instanceof Collection) && set2.isEmpty()) {
                                    z6 = zBooleanValue;
                                    ot0Var = ot0Var2;
                                    z7 = false;
                                } else {
                                    Iterator it5 = set2.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            z6 = zBooleanValue;
                                            ot0Var = ot0Var2;
                                            if (((Number) it5.next()).longValue() == mlrVar.f22006a) {
                                                z7 = true;
                                            } else {
                                                zBooleanValue = z6;
                                                ot0Var2 = ot0Var;
                                            }
                                        } else {
                                            z6 = zBooleanValue;
                                            ot0Var = ot0Var2;
                                            z7 = false;
                                        }
                                    }
                                }
                                pt0 pt0VarG0 = x4d0.g0(ot0Var);
                                Integer numValueOf = Integer.valueOf((int) j8bVar.f16074a);
                                mlrVar.getClass();
                                boolean z14 = mlrVar.k;
                                int i16 = z13 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                                boolean z15 = mlrVar.j;
                                if (z14) {
                                    it = it4;
                                    str4 = str14;
                                    z8 = z13;
                                    strA5 = ctf0Var5.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    it = it4;
                                    str4 = str14;
                                    z8 = z13;
                                    strA5 = z15 ? ctf0Var5.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : str4;
                                }
                                Set set3 = set;
                                long j3 = mlrVar.f22006a;
                                String str213 = mlrVar.f;
                                String str214 = mlrVar.e;
                                mtr mtrVar = new mtr(z6 ? z7 ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, z7);
                                n0x n0xVar2 = new n0x(mlrVar.g);
                                m0x m0xVar = new m0x(i16, null, 6);
                                if (strA5.length() == 0) {
                                    murVar = lur.f20686a;
                                    n0xVar = n0xVar2;
                                } else {
                                    pt0 pt0Var3 = pt0.f27539a;
                                    if ((pt0VarG0 == pt0Var3 && z14) || (pt0VarG0 == (pt0Var = pt0.c) && z14)) {
                                        n0xVar = n0xVar2;
                                    } else {
                                        n0xVar = n0xVar2;
                                        pt0 pt0Var4 = pt0.d;
                                        if (pt0VarG0 != pt0Var4 || !z14) {
                                            if ((pt0VarG0 == pt0Var3 && z15) || ((pt0VarG0 == pt0Var && z15) || (pt0VarG0 == pt0Var4 && z15))) {
                                                d4d d4dVar = d4d.PRIMARY;
                                                uqo0Var = new eqo0();
                                            } else {
                                                pt0 pt0Var5 = pt0.b;
                                                uqo0Var = ((pt0VarG0 == pt0Var5 && z14) || (pt0VarG0 == (pt0Var2 = pt0.e) && z14)) ? kro0.f18776a : ((pt0VarG0 == pt0Var5 && z15) || (pt0VarG0 == pt0Var2 && z15)) ? dqo0.f6527a : new uqo0(d4d.PRIMARY);
                                            }
                                        }
                                        murVar = new mur(strA5, uqo0Var);
                                    }
                                    d4d d4dVar2 = d4d.PRIMARY;
                                    uqo0Var = new lro0();
                                    murVar = new mur(strA5, uqo0Var);
                                }
                                arrayList5.add(new st0(j3, str213, str214, mtrVar, n0xVar, m0xVar, numValueOf, murVar));
                                zBooleanValue = z6;
                                ot0Var2 = ot0Var;
                                it4 = it;
                                z13 = z8;
                                set = set3;
                                str14 = str4;
                            }
                            arrayList4.add(new h4r0(j8bVar.f16074a, j8bVar.d, j8bVar.b, new hjm(j8bVar.b, null, null, null, null, null, false, null, null, false, new ue9(ctf0Var5.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7166), new zll(x4d0.g0(ot0Var2), new wll(o0s.f24443a), arrayList5)));
                            y11Var4 = y11Var5;
                            it4 = it4;
                            str14 = str14;
                        }
                        return dyb.r0(arrayList4);
                    default:
                        q11 q11Var13 = (q11) y11Var2.z;
                        fee feeVar6 = (fee) obj;
                        feeVar6.getClass();
                        b7v b7vVar = (b7v) feeVar6.c();
                        if (b7vVar instanceof z6v) {
                            ArrayList arrayList6 = ((z6v) b7vVar).f43888a;
                            ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                            Iterator it6 = arrayList6.iterator();
                            while (it6.hasNext()) {
                                e65 e65Var = (e65) it6.next();
                                c01 c01Var2 = q11Var13.t;
                                ctf0 ctf0Var6 = y11Var2.b;
                                e65Var.getClass();
                                ArrayList arrayList8 = arrayList7;
                                double d2 = e65Var.b;
                                ctf0Var6.getClass();
                                List list4 = e65Var.k;
                                String str215 = str11;
                                String str216 = str12;
                                long j4 = e65Var.g.f44639a;
                                List list5 = e65Var.o;
                                List list6 = e65Var.n;
                                int i17 = e65Var.f7264a;
                                Iterator it7 = it6;
                                gom0 gom0Var = e65Var.i;
                                String str30 = str13;
                                List list7 = e65Var.l;
                                y11 y11Var6 = y11Var2;
                                if (list4.size() == 1) {
                                    ww90Var = ww90.f39878a;
                                } else if (list4.size() > 1) {
                                    ww90Var = ww90.b;
                                } else if (list6.isEmpty() || !list7.isEmpty()) {
                                    ww90Var = (list7.isEmpty() && list5.isEmpty()) ? ww90.c : ww90.d;
                                } else {
                                    ww90Var = ww90.b;
                                }
                                ArrayList arrayList9 = new ArrayList();
                                q11 q11Var14 = q11Var13;
                                ww90 ww90Var3 = ww90Var;
                                String str31 = str9;
                                lsm0 lsm0Var2 = ctf0Var6.b;
                                String strA1119 = lsm0Var2.a(R.string.for_games_title, Arrays.copyOf(new Object[0], 0));
                                m7m0 m7m0Var7 = m7m0.f21327a;
                                if (!list4.isEmpty()) {
                                    arrayList9.add(new pf8(strA1119, list4, nw80.t, m7m0Var7, new qp9(str14, i17, i17)));
                                }
                                String strA11110 = lsm0Var2.a(R.string.for_unavailable_games_title, Arrays.copyOf(new Object[0], 0));
                                if (!list6.isEmpty()) {
                                    arrayList9.add(new pf8(strA11110, list6, nw80.t, m7m0Var7, new qp9(str14, i17, i17)));
                                }
                                pf8 pf8Var4 = (pf8) CollectionsKt.firstOrNull(arrayList9);
                                ArrayList arrayList10 = new ArrayList();
                                String strA20 = lsm0Var2.a(R.string.for_providers_title, Arrays.copyOf(new Object[0], 0));
                                m7m0 m7m0Var8 = m7m0.b;
                                if (!list7.isEmpty()) {
                                    arrayList10.add(new pf8(strA20, list7, nw80.t, m7m0Var8, new qp9(str14, i17, i17)));
                                }
                                String strA21 = lsm0Var2.a(R.string.for_unavailable_providers_title, Arrays.copyOf(new Object[0], 0));
                                if (!list5.isEmpty()) {
                                    arrayList10.add(new pf8(strA21, list5, nw80.t, m7m0Var8, new qp9(str14, i17, i17)));
                                }
                                pf8 pf8Var5 = (pf8) CollectionsKt.firstOrNull(arrayList10);
                                double d3 = ((double) e65Var.e) * d2;
                                String str32 = str14;
                                DecimalFormat decimalFormat = new DecimalFormat("0.##", DecimalFormatSymbols.getInstance(Locale.US));
                                String str33 = decimalFormat.format(d3);
                                String str34 = decimalFormat.format(e65Var.d);
                                Date date10 = new Date(j4);
                                int i18 = e65Var.f7264a;
                                hnl hnlVarN19 = nkb.N(c01Var2);
                                String strA22 = lsm0Var2.a(R.string.bonus_amount_title, Arrays.copyOf(new Object[0], 0));
                                nnm0 nnm0Var = gom0Var.f11638a;
                                String strA23 = lsm0Var2.a(R.string.bonus_active, Arrays.copyOf(new Object[0], 0));
                                nnm0 nnm0Var2 = nnm0.ACTIVE;
                                if (nnm0Var != nnm0Var2) {
                                    strA23 = null;
                                }
                                String str35 = strA23 == null ? str32 : strA23;
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                int iOrdinal13 = c01Var2.ordinal();
                                if (iOrdinal13 != 0) {
                                    i7 = i18;
                                    if (iOrdinal13 == 1) {
                                        str5 = str216;
                                    } else if (iOrdinal13 == 2) {
                                        str5 = str32;
                                    } else if (iOrdinal13 == 3) {
                                        str5 = "Ticket_Primery";
                                    } else if (iOrdinal13 == 4) {
                                        str5 = str30;
                                    } else {
                                        t9f.b();
                                    }
                                } else {
                                    i7 = i18;
                                    str5 = str215;
                                }
                                String strL4 = kng0.l(str10, str5, "_Bonus.webp");
                                if (strL4.length() == 0) {
                                    sb2.setLength(0);
                                    str6 = str10;
                                } else {
                                    str6 = str10;
                                    int i19 = 0;
                                    if (StringsKt.O(strL4, ujn.h, false)) {
                                        sb2.setLength(i19);
                                        sb2.append(strL4);
                                    } else if (kotlin.text.c.x(strL4, "https://", false)) {
                                        i19 = 0;
                                        sb2.setLength(i19);
                                        sb2.append(strL4);
                                    } else {
                                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                            i8 = 1;
                                            c2 = '/';
                                        } else {
                                            sb2.append('/');
                                            c2 = '/';
                                            i8 = 1;
                                        }
                                        char[] cArr10 = new char[i8];
                                        cArr10[0] = c2;
                                        sb2.append(StringsKt.y0(strL4, cArr10));
                                    }
                                }
                                String string10 = sb2.toString();
                                String str36 = e65Var.c;
                                pn40 pn40Var110 = pn40.f27267a;
                                String strL5 = kng0.l(str36, str31, pn40.c(d2, p3u0.c));
                                String str37 = pf8Var5 != null ? pf8Var5.f26889a : null;
                                String str38 = str37 == null ? str32 : str37;
                                String str39 = pf8Var4 != null ? pf8Var4.f26889a : null;
                                String str40 = str39 == null ? str32 : str39;
                                int iOrdinal14 = nnm0Var.ordinal();
                                if (iOrdinal14 != 0) {
                                    if (iOrdinal14 != 5) {
                                        str7 = str32;
                                        i9 = 0;
                                    } else {
                                        i9 = 0;
                                        strA6 = lsm0Var2.a(R.string.resume, Arrays.copyOf(new Object[0], 0));
                                    }
                                    if (nnm0Var == nnm0Var2) {
                                        i10 = 1;
                                    } else {
                                        i10 = i9;
                                    }
                                    if (nnm0Var == nnm0.READY) {
                                        strA7 = lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[i9], i9));
                                        ww90Var2 = ww90Var3;
                                    } else {
                                        if (i10 != 0) {
                                            ww90Var2 = ww90Var3;
                                            if (ww90Var2 == ww90.f39878a) {
                                                strA8 = lsm0Var2.a(R.string.play_button, Arrays.copyOf(new Object[i9], i9));
                                            }
                                            strA7 = strA8;
                                        } else {
                                            ww90Var2 = ww90Var3;
                                        }
                                        if (i10 == 0 && ww90Var2 == ww90.b) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        } else if (i10 == 0 && ww90Var2 == ww90.d) {
                                            strA8 = lsm0Var2.a(R.string.all_providers, Arrays.copyOf(new Object[i9], i9));
                                        } else if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        } else {
                                            strA7 = str32;
                                        }
                                        strA7 = strA8;
                                    }
                                    if (pf8Var5 != null || (list2 = pf8Var5.b) == null) {
                                        a4xVarO0 = lak0.c;
                                    } else {
                                        ArrayList arrayList11 = new ArrayList(r3d.q(list2, 10));
                                        Iterator it8 = list2.iterator();
                                        while (it8.hasNext()) {
                                            arrayList11.add(((az5) it8.next()).b);
                                        }
                                        a4xVarO0 = dyb.o0(arrayList11);
                                        if (a4xVarO0 == null) {
                                            a4xVarO0 = lak0.c;
                                        }
                                    }
                                    a4x a4xVar16 = a4xVarO0;
                                    if (pf8Var4 != null || (list = pf8Var4.b) == null) {
                                        a4xVarO1 = lak0.c;
                                    } else {
                                        ArrayList arrayList12 = new ArrayList(r3d.q(list, 10));
                                        Iterator it9 = list.iterator();
                                        while (it9.hasNext()) {
                                            arrayList12.add(((az5) it9.next()).b);
                                        }
                                        a4xVarO1 = dyb.o0(arrayList12);
                                        if (a4xVarO1 == null) {
                                            a4xVarO1 = lak0.c;
                                        }
                                    }
                                    a4x a4xVar17 = a4xVarO1;
                                    ovl ovlVar10 = new ovl(lsm0Var2.a(R.string.roleplaying_title, Arrays.copyOf(new Object[0], 0)), str34, kng0.k("/ ", str33));
                                    q7n q7nVarR10 = vbw0.R(ctf0Var6, date10, Long.valueOf(j4));
                                    if (pf8Var5 == null || pf8Var4 != null) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    if (pf8Var5 != null || pf8Var4 == null) {
                                        z10 = false;
                                    } else {
                                        z10 = true;
                                    }
                                    uzh uzhVar10 = new uzh(hnlVarN19, strA22, str35, string10, strL5, str38, str40, null, null, a4xVar16, a4xVar17, true, null, null, str7, strA7, 0, ovlVar10, q7nVarR10, new tzh(z9, z10, false, false));
                                    hnl hnlVarN110 = nkb.N(c01Var2);
                                    iOrdinal2 = nnm0Var.ordinal();
                                    if (iOrdinal2 != 0) {
                                        m7m0Var2 = m7m0.f;
                                    } else if (iOrdinal2 != 1) {
                                        m7m0Var2 = m7m0.c;
                                    } else if (iOrdinal2 != 5) {
                                        m7m0Var2 = m7m0.i;
                                    } else {
                                        m7m0Var2 = m7m0.e;
                                    }
                                    m7m0 m7m0Var1110 = m7m0Var2;
                                    nw80Var = nw80.b;
                                    j = i17;
                                    vf8 vf8Var11 = new vf8(i17, j, nw80Var, m7m0Var1110, "");
                                    listJ = q3d.j(pf8Var4, pf8Var5);
                                    iOrdinal3 = nnm0Var.ordinal();
                                    if (iOrdinal3 != 0) {
                                        if (iOrdinal3 != 1) {
                                            iOrdinal8 = nnm0Var.ordinal();
                                            if (iOrdinal8 != 0) {
                                                m7m0Var5 = m7m0.f;
                                            } else if (iOrdinal8 != 1) {
                                                m7m0Var5 = m7m0.c;
                                            } else if (iOrdinal8 != 5) {
                                                m7m0Var5 = m7m0.i;
                                            } else {
                                                m7m0Var5 = m7m0.e;
                                            }
                                            vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var5, "");
                                        } else if (iOrdinal3 != 5) {
                                            vf8Var = new vf8(0, j, nw80Var, m7m0.i, "");
                                            str14 = str32;
                                        } else {
                                            iOrdinal9 = nnm0Var.ordinal();
                                            if (iOrdinal9 != 0) {
                                                m7m0Var6 = m7m0.f;
                                            } else if (iOrdinal9 != 1) {
                                                m7m0Var6 = m7m0.c;
                                            } else if (iOrdinal9 != 5) {
                                                m7m0Var6 = m7m0.i;
                                            } else {
                                                m7m0Var6 = m7m0.e;
                                            }
                                            vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var6, "");
                                        }
                                        str14 = str32;
                                        vf8Var2 = vf8Var3;
                                        arrayList8.add(new r11(uzhVar10, hnlVarN110, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var11, vf8Var2, i7));
                                        arrayList7 = arrayList8;
                                        str9 = str31;
                                        str10 = str6;
                                        str11 = str215;
                                        str12 = str216;
                                        it6 = it7;
                                        str13 = str30;
                                        y11Var2 = y11Var6;
                                        q11Var13 = q11Var14;
                                    } else {
                                        pf8Var = (pf8) CollectionsKt.firstOrNull(listJ);
                                        if (pf8Var != null) {
                                            pf8Var3 = (pf8) CollectionsKt.firstOrNull(listJ);
                                            if (pf8Var3 != null) {
                                                qp9 qp9Var17 = pf8Var3.e;
                                                qp9Var2 = new qp9(qp9Var17.b, qp9Var17.f29104a, j);
                                                str14 = str32;
                                            } else {
                                                str14 = str32;
                                                qp9Var2 = new qp9(str14, 0, 0L);
                                            }
                                            qp9 qp9Var18 = qp9Var2;
                                            String str48 = pf8Var.f26889a;
                                            List list15 = pf8Var.b;
                                            nw80 nw80Var18 = pf8Var.c;
                                            m7m0 m7m0Var1111 = pf8Var.d;
                                            str48.getClass();
                                            list15.getClass();
                                            pf8Var2 = new pf8(str48, list15, nw80Var18, m7m0Var1111, qp9Var18);
                                        } else {
                                            str14 = str32;
                                            iun iunVar8 = iun.f15405a;
                                            nw80 nw80Var19 = nw80.t;
                                            iOrdinal4 = nnm0Var.ordinal();
                                            if (iOrdinal4 != 0) {
                                                m7m0Var3 = m7m0.f;
                                            } else if (iOrdinal4 != 1) {
                                                m7m0Var3 = m7m0.c;
                                            } else if (iOrdinal4 != 5) {
                                                m7m0Var3 = m7m0.i;
                                            } else {
                                                m7m0Var3 = m7m0.e;
                                            }
                                            pf8Var2 = new pf8("", iunVar8, nw80Var19, m7m0Var3, new qp9(str14, 0, 0L));
                                        }
                                        iOrdinal5 = ww90Var2.ordinal();
                                        if (iOrdinal5 != 0) {
                                            m7m0Var4 = m7m0.g;
                                        } else if (iOrdinal5 != 1) {
                                            m7m0Var4 = m7m0.f21327a;
                                        } else if (iOrdinal5 != 2) {
                                            m7m0Var4 = m7m0.d;
                                        } else if (iOrdinal5 != 3) {
                                            m7m0Var4 = m7m0.b;
                                        } else if (iOrdinal5 == 4) {
                                            m7m0Var4 = m7m0.i;
                                        } else {
                                            t9f.b();
                                        }
                                        m7m0 m7m0Var1112 = m7m0Var4;
                                        iOrdinal6 = ww90Var2.ordinal();
                                        qp9Var = pf8Var2.e;
                                        if (iOrdinal6 != 0) {
                                            az5Var = (az5) CollectionsKt.firstOrNull(pf8Var2.b);
                                            if (az5Var != null) {
                                                i11 = az5Var.f1701a;
                                            } else {
                                                i11 = qp9Var.f29104a;
                                            }
                                            i12 = i11;
                                        } else if (iOrdinal6 != 1 || iOrdinal6 == 3) {
                                            i12 = i17;
                                        } else {
                                            i12 = 0;
                                        }
                                        iOrdinal7 = ww90Var2.ordinal();
                                        if (iOrdinal7 == 0) {
                                            strA9 = qp9Var.b;
                                        } else if (iOrdinal7 != 1 || iOrdinal7 == 2) {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            if (iOrdinal7 == 3) {
                                                strA9 = lsm0Var2.a(R.string.all_providers, Arrays.copyOf(new Object[0], 0));
                                            } else if (iOrdinal7 == 4) {
                                                str8 = str14;
                                            } else {
                                                t9f.b();
                                            }
                                            vf8Var = new vf8(i12, j, nw80Var, m7m0Var1112, str8);
                                        }
                                        str8 = strA9;
                                        vf8Var = new vf8(i12, j, nw80Var, m7m0Var1112, str8);
                                    }
                                    vf8Var2 = vf8Var;
                                    arrayList8.add(new r11(uzhVar10, hnlVarN110, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var11, vf8Var2, i7));
                                    arrayList7 = arrayList8;
                                    str9 = str31;
                                    str10 = str6;
                                    str11 = str215;
                                    str12 = str216;
                                    it6 = it7;
                                    str13 = str30;
                                    y11Var2 = y11Var6;
                                    q11Var13 = q11Var14;
                                } else {
                                    i9 = 0;
                                    strA6 = lsm0Var2.a(R.string.suspend, Arrays.copyOf(new Object[0], 0));
                                }
                                str7 = strA6;
                                if (nnm0Var == nnm0Var2) {
                                    i10 = 1;
                                } else {
                                    i10 = i9;
                                }
                                if (nnm0Var == nnm0.READY) {
                                    strA7 = lsm0Var2.a(R.string.activate, Arrays.copyOf(new Object[i9], i9));
                                    ww90Var2 = ww90Var3;
                                } else {
                                    if (i10 != 0) {
                                        ww90Var2 = ww90Var3;
                                        if (ww90Var2 == ww90.f39878a) {
                                            strA8 = lsm0Var2.a(R.string.play_button, Arrays.copyOf(new Object[i9], i9));
                                        }
                                        strA7 = strA8;
                                    } else {
                                        ww90Var2 = ww90Var3;
                                    }
                                    if (i10 == 0) {
                                        if (i10 == 0) {
                                            if (i10 != 0) {
                                                strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                                strA7 = strA8;
                                            } else {
                                                strA7 = str32;
                                            }
                                        } else if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                            strA7 = strA8;
                                        } else {
                                            strA7 = str32;
                                        }
                                    } else if (i10 == 0) {
                                        if (i10 != 0) {
                                            strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                            strA7 = strA8;
                                        } else {
                                            strA7 = str32;
                                        }
                                    } else if (i10 != 0) {
                                        strA8 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[i9], i9));
                                        strA7 = strA8;
                                    } else {
                                        strA7 = str32;
                                    }
                                }
                                if (pf8Var5 != null) {
                                    a4xVarO0 = lak0.c;
                                } else {
                                    a4xVarO0 = lak0.c;
                                }
                                a4x a4xVar18 = a4xVarO0;
                                if (pf8Var4 != null) {
                                    a4xVarO1 = lak0.c;
                                } else {
                                    a4xVarO1 = lak0.c;
                                }
                                a4x a4xVar19 = a4xVarO1;
                                ovl ovlVar11 = new ovl(lsm0Var2.a(R.string.roleplaying_title, Arrays.copyOf(new Object[0], 0)), str34, kng0.k("/ ", str33));
                                q7n q7nVarR11 = vbw0.R(ctf0Var6, date10, Long.valueOf(j4));
                                if (pf8Var5 == null) {
                                    z9 = true;
                                } else {
                                    z9 = true;
                                }
                                if (pf8Var5 != null) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                uzh uzhVar11 = new uzh(hnlVarN19, strA22, str35, string10, strL5, str38, str40, null, null, a4xVar18, a4xVar19, true, null, null, str7, strA7, 0, ovlVar11, q7nVarR11, new tzh(z9, z10, false, false));
                                hnl hnlVarN111 = nkb.N(c01Var2);
                                iOrdinal2 = nnm0Var.ordinal();
                                if (iOrdinal2 != 0) {
                                    m7m0Var2 = m7m0.f;
                                } else if (iOrdinal2 != 1) {
                                    m7m0Var2 = m7m0.c;
                                } else if (iOrdinal2 != 5) {
                                    m7m0Var2 = m7m0.i;
                                } else {
                                    m7m0Var2 = m7m0.e;
                                }
                                m7m0 m7m0Var1113 = m7m0Var2;
                                nw80Var = nw80.b;
                                j = i17;
                                vf8 vf8Var12 = new vf8(i17, j, nw80Var, m7m0Var1113, "");
                                listJ = q3d.j(pf8Var4, pf8Var5);
                                iOrdinal3 = nnm0Var.ordinal();
                                if (iOrdinal3 != 0) {
                                    if (iOrdinal3 != 1) {
                                        iOrdinal8 = nnm0Var.ordinal();
                                        if (iOrdinal8 != 0) {
                                            m7m0Var5 = m7m0.f;
                                        } else if (iOrdinal8 != 1) {
                                            m7m0Var5 = m7m0.c;
                                        } else if (iOrdinal8 != 5) {
                                            m7m0Var5 = m7m0.i;
                                        } else {
                                            m7m0Var5 = m7m0.e;
                                        }
                                        vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var5, "");
                                    } else if (iOrdinal3 != 5) {
                                        vf8Var = new vf8(0, j, nw80Var, m7m0.i, "");
                                        str14 = str32;
                                    } else {
                                        iOrdinal9 = nnm0Var.ordinal();
                                        if (iOrdinal9 != 0) {
                                            m7m0Var6 = m7m0.f;
                                        } else if (iOrdinal9 != 1) {
                                            m7m0Var6 = m7m0.c;
                                        } else if (iOrdinal9 != 5) {
                                            m7m0Var6 = m7m0.i;
                                        } else {
                                            m7m0Var6 = m7m0.e;
                                        }
                                        vf8Var3 = new vf8(i17, j, nw80Var, m7m0Var6, "");
                                    }
                                    str14 = str32;
                                    vf8Var2 = vf8Var3;
                                    arrayList8.add(new r11(uzhVar11, hnlVarN111, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var12, vf8Var2, i7));
                                    arrayList7 = arrayList8;
                                    str9 = str31;
                                    str10 = str6;
                                    str11 = str215;
                                    str12 = str216;
                                    it6 = it7;
                                    str13 = str30;
                                    y11Var2 = y11Var6;
                                    q11Var13 = q11Var14;
                                } else {
                                    pf8Var = (pf8) CollectionsKt.firstOrNull(listJ);
                                    if (pf8Var != null) {
                                        pf8Var3 = (pf8) CollectionsKt.firstOrNull(listJ);
                                        if (pf8Var3 != null) {
                                            qp9 qp9Var19 = pf8Var3.e;
                                            qp9Var2 = new qp9(qp9Var19.b, qp9Var19.f29104a, j);
                                            str14 = str32;
                                        } else {
                                            str14 = str32;
                                            qp9Var2 = new qp9(str14, 0, 0L);
                                        }
                                        qp9 qp9Var110 = qp9Var2;
                                        String str49 = pf8Var.f26889a;
                                        List list16 = pf8Var.b;
                                        nw80 nw80Var110 = pf8Var.c;
                                        m7m0 m7m0Var1114 = pf8Var.d;
                                        str49.getClass();
                                        list16.getClass();
                                        pf8Var2 = new pf8(str49, list16, nw80Var110, m7m0Var1114, qp9Var110);
                                    } else {
                                        str14 = str32;
                                        iun iunVar9 = iun.f15405a;
                                        nw80 nw80Var111 = nw80.t;
                                        iOrdinal4 = nnm0Var.ordinal();
                                        if (iOrdinal4 != 0) {
                                            m7m0Var3 = m7m0.f;
                                        } else if (iOrdinal4 != 1) {
                                            m7m0Var3 = m7m0.c;
                                        } else if (iOrdinal4 != 5) {
                                            m7m0Var3 = m7m0.i;
                                        } else {
                                            m7m0Var3 = m7m0.e;
                                        }
                                        pf8Var2 = new pf8("", iunVar9, nw80Var111, m7m0Var3, new qp9(str14, 0, 0L));
                                    }
                                    iOrdinal5 = ww90Var2.ordinal();
                                    if (iOrdinal5 != 0) {
                                        m7m0Var4 = m7m0.g;
                                    } else if (iOrdinal5 != 1) {
                                        m7m0Var4 = m7m0.f21327a;
                                    } else if (iOrdinal5 != 2) {
                                        m7m0Var4 = m7m0.d;
                                    } else if (iOrdinal5 != 3) {
                                        m7m0Var4 = m7m0.b;
                                    } else if (iOrdinal5 == 4) {
                                        m7m0Var4 = m7m0.i;
                                    } else {
                                        t9f.b();
                                    }
                                    m7m0 m7m0Var1115 = m7m0Var4;
                                    iOrdinal6 = ww90Var2.ordinal();
                                    qp9Var = pf8Var2.e;
                                    if (iOrdinal6 != 0) {
                                        az5Var = (az5) CollectionsKt.firstOrNull(pf8Var2.b);
                                        if (az5Var != null) {
                                            i11 = az5Var.f1701a;
                                        } else {
                                            i11 = qp9Var.f29104a;
                                        }
                                        i12 = i11;
                                    } else if (iOrdinal6 != 1) {
                                        i12 = i17;
                                    } else {
                                        i12 = i17;
                                    }
                                    iOrdinal7 = ww90Var2.ordinal();
                                    if (iOrdinal7 == 0) {
                                        if (iOrdinal7 != 1) {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        } else {
                                            strA9 = lsm0Var2.a(R.string.all_games, Arrays.copyOf(new Object[0], 0));
                                        }
                                        vf8Var = new vf8(i12, j, nw80Var, m7m0Var1115, str8);
                                    } else {
                                        strA9 = qp9Var.b;
                                    }
                                    str8 = strA9;
                                    vf8Var = new vf8(i12, j, nw80Var, m7m0Var1115, str8);
                                }
                                vf8Var2 = vf8Var;
                                arrayList8.add(new r11(uzhVar11, hnlVarN111, vbw0.Q(pf8Var5), vbw0.Q(pf8Var4), vf8Var12, vf8Var2, i7));
                                arrayList7 = arrayList8;
                                str9 = str31;
                                str10 = str6;
                                str11 = str215;
                                str12 = str216;
                                it6 = it7;
                                str13 = str30;
                                y11Var2 = y11Var6;
                                q11Var13 = q11Var14;
                            }
                            return dyb.r0(arrayList7);
                        }
                        if (Intrinsics.d(b7vVar, a7v.f393a)) {
                            return i4w0.N(q11Var13.t);
                        }
                        t9f.b();
                        return null;
                }
            }
        }, (byte) 20));
    }
}
