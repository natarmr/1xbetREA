package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bww {
    public static final void A(int i, int i2) {
        if (i < 0 || i >= i2) {
            v4i0.m(f140.j(i, "index: ", i2, ", size: "));
        }
    }

    public static final void B(ResponseBody responseBody) throws zhi0 {
        Object g0g0Var;
        responseBody.getClass();
        if (responseBody.getC() == 0) {
            return;
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            String string = new JSONObject(responseBody.k()).getString("Error");
            string.getClass();
            if (string.length() > 0) {
                throw new zhi0(string);
            }
            g0g0Var = Unit.f46060a;
            Throwable thA = j0g0.a(g0g0Var);
            if (thA == null) {
                return;
            }
            zhi0 zhi0Var = thA instanceof zhi0 ? (zhi0) thA : null;
            if (zhi0Var != null) {
                throw zhi0Var;
            }
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
    }

    public static final void C(int i, int i2) {
        if (i < 0 || i > i2) {
            v4i0.m(f140.j(i, "index: ", i2, ", size: "));
        }
    }

    public static final void D(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            hny.k(i3, dw9.t("fromIndex: ", i, ", toIndex: ", ", size: ", i2));
        } else {
            if (i <= i2) {
                return;
            }
            jf4.o(f140.j(i, "fromIndex: ", i2, " > toIndex: "));
        }
    }

    public static long E(long j, s7z s7zVar) {
        s7z s7zVar2 = s7z.f31776a;
        return r4e.a(s7zVar == s7zVar2 ? p4e.k(j) : p4e.j(j), s7zVar == s7zVar2 ? p4e.i(j) : p4e.h(j), s7zVar == s7zVar2 ? p4e.j(j) : p4e.k(j), s7zVar == s7zVar2 ? p4e.h(j) : p4e.i(j));
    }

    public static long F(int i, long j) {
        return r4e.a(0, p4e.i(j), (i & 4) != 0 ? p4e.j(j) : 0, p4e.h(j));
    }

    public static final y1m G(d0t d0tVar) {
        Object next;
        Object next2;
        Pair pair;
        String str = kpb.R(d0tVar).f33307a;
        String str2 = kpb.R(d0tVar).b;
        rqs rqsVar = d0tVar.p;
        ArrayList arrayListQ0 = CollectionsKt.q0(rqsVar.n, d0tVar.w);
        Iterator it = arrayListQ0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmr.e);
        cmr cmrVar = (cmr) next;
        Iterator it2 = arrayListQ0.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((cmr) next2).f4620a != dmr.f);
        cmr cmrVar2 = (cmr) next2;
        if (d0tVar.v != 66 || (cmrVar == null && cmrVar2 == null)) {
            pair = new Pair(str, str2);
        } else {
            pair = new Pair(sj3.j0(cmrVar != null ? cmrVar.b : null, str), sj3.j0(cmrVar2 != null ? cmrVar2.b : null, str2));
        }
        return new y1m(b2m.f1858a, new x1m(), (String) pair.f46059a, (String) pair.b, rqsVar.t, rqsVar.u);
    }

    public static final int H(long j) {
        if (j == 1) {
            return R.drawable.ic_game_football_penalties_plus;
        }
        return j == 2 ? R.drawable.ic_game_hockey_bullits_plus : R.drawable.transparent;
    }

    public static final int I(d0t d0tVar) {
        z6m0 z6m0Var = z6m0.f43877a;
        Integer intOrNull = StringsKt.toIntOrNull(qzb.U(d0tVar).b);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    public static final int J(d0t d0tVar) {
        z6m0 z6m0Var = z6m0.f43877a;
        Integer intOrNull = StringsKt.toIntOrNull(qzb.U(d0tVar).c);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        return 0;
    }

    public static final e810 K(e810 e810Var) {
        e7z e7zVarV = e810Var.u.u;
        while (true) {
            e7z e7zVarV2 = e7zVarV.v();
            if ((e7zVarV2 != null ? e7zVarV2.i : null) == null) {
                e810 e810VarE1 = ((s460) e7zVarV.h1.e).e1();
                e810VarE1.getClass();
                return e810VarE1;
            }
            e7z e7zVarV3 = e7zVarV.v();
            e7z e7zVar = e7zVarV3 != null ? e7zVarV3.i : null;
            e7zVar.getClass();
            if (e7zVar.h) {
                e7zVarV = e7zVarV.v();
                e7zVarV.getClass();
            } else {
                e7z e7zVarV4 = e7zVarV.v();
                e7zVarV4.getClass();
                e7zVarV = e7zVarV4.i;
                e7zVarV.getClass();
            }
        }
    }

    public static final kpm L(d0t d0tVar) {
        Object next;
        Object next2;
        Pair pair;
        String str = kpb.R(d0tVar).f33307a;
        String str2 = kpb.R(d0tVar).b;
        rqs rqsVar = d0tVar.p;
        ArrayList arrayListQ0 = CollectionsKt.q0(rqsVar.n, d0tVar.w);
        Iterator it = arrayListQ0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmr.e);
        cmr cmrVar = (cmr) next;
        Iterator it2 = arrayListQ0.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((cmr) next2).f4620a != dmr.f);
        cmr cmrVar2 = (cmr) next2;
        if (d0tVar.v != 66 || (cmrVar == null && cmrVar2 == null)) {
            pair = new Pair(str, str2);
        } else {
            pair = new Pair(sj3.j0(cmrVar != null ? cmrVar.b : null, str), sj3.j0(cmrVar2 != null ? cmrVar2.b : null, str2));
        }
        return new kpm(npm.f23920a, new hpm(0L, 3), d5c.O((String) pair.f46059a, (String) pair.b, rqsVar.t, rqsVar.u, new hpm(0L, 3)));
    }

    public static final ows0 M(int i, d280 d280Var, String str) {
        return new ows0(str, i, new u6n(d4d.SECONDARY60, w6n.b, d280Var));
    }

    public static final e0n N(d0t d0tVar, ctf0 ctf0Var) {
        boolean zJ0 = kpb.j0(d0tVar);
        rqs rqsVar = d0tVar.p;
        long j = rqsVar.j;
        if (zJ0) {
            long millis = TimeUnit.SECONDS.toMillis(d0tVar.s) - System.currentTimeMillis();
            long j2 = millis >= 0 ? millis : 0L;
            r7n r7nVar = r7n.f29985a;
            return new e0n(j2);
        }
        if (j == 0) {
            return null;
        }
        long jR0 = kpb.r0(d0tVar);
        r7n r7nVar2 = j >= 5990 ? r7n.b : r7n.f29985a;
        boolean z = (rqsVar.p || rqsVar.l == -1) ? false : true;
        String strB0 = qzb.b0(d0tVar);
        if (strB0.length() > 0) {
            String lowerCase = ctf0Var.b.a(R.string.timer_mins, Arrays.copyOf(new Object[0], 0)).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            strB0 = strB0 + Separators.SP + lowerCase;
        }
        return new e0n(jR0, r7nVar2, strB0, z);
    }

    public static final boolean O(y930 y930Var) {
        y930Var.getClass();
        return y930Var == y930.f42225a;
    }

    public static final boolean P(n4t0 n4t0Var) {
        return n4t0Var.f.length() > 0 && n4t0Var.c.c.length() > 0 && n4t0Var.d.c.length() > 0;
    }

    public static final boolean Q(y930 y930Var) {
        y930Var.getClass();
        return y930Var == y930.c;
    }

    public static bby R(bvc bvcVar, bby bbyVar, List list, CoroutineContext coroutineContext, Function1 function1, Function0 function0, Function2 function2, int i) {
        if ((i & 2) != 0) {
            list = iun.f15405a;
        }
        if ((i & 4) != 0) {
            coroutineContext = tvk.f34603a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i & 16) != 0) {
            function1 = rby.f30212a;
        }
        Function1 function3 = function1;
        yje yjeVar = null;
        Function0 function4 = (i & 32) != 0 ? null : function0;
        list.getClass();
        coroutineContext2.getClass();
        function3.getClass();
        if (bbyVar == null || !bbyVar.isActive()) {
            if (!list.isEmpty()) {
                for (bby bbyVar2 : list) {
                    if (bbyVar2 == null || !bbyVar2.isActive()) {
                    }
                }
            }
            return sac.V(bvcVar, function3, function4, coroutineContext2, new jc1((Object) function2, yjeVar, (byte) 6), 8);
        }
        return bbyVar;
    }

    public static mre0 S(mp9 mp9Var, Function0 function0) {
        if (function0 != null) {
            return new mre0(mp9Var, function0);
        }
        jf4.o("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties.lazySoft must not be null");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object T(bch0 bch0Var, float f, zje zjeVar) {
        jah0 jah0Var;
        jie0 jie0Var;
        if (zjeVar instanceof jah0) {
            jah0Var = (jah0) zjeVar;
            int i = jah0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jah0Var.k = i - Integer.MIN_VALUE;
            } else {
                jah0Var = new jah0(zjeVar);
            }
        } else {
            jah0Var = new jah0(zjeVar);
        }
        Object obj = jah0Var.j;
        Object obj2 = wne.f39444a;
        int i2 = jah0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            jie0 jie0Var2 = new jie0();
            Function2 hxmVar = new hxm(jie0Var2, f, null);
            jah0Var.i = jie0Var2;
            jah0Var.k = 1;
            if (bch0Var.b(c050.f3507a, hxmVar, jah0Var) == obj2) {
                return obj2;
            }
            jie0Var = jie0Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jie0Var = jah0Var.i;
            z1x.P(obj);
        }
        return new Float(jie0Var.f16571a);
    }

    public static mm40 U(mm40 mm40Var, float f, ugg0 ugg0Var, long j, long j2, int i) {
        yjj0 yjj0Var = ugg0Var;
        if ((i & 2) != 0) {
            yjj0Var = jd8.n;
        }
        yjj0 yjj0Var2 = yjj0Var;
        boolean z = false;
        if ((i & 4) != 0 && ycl.a(f, 0.0f) > 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            j = hfv.f12988a;
        }
        long j3 = j;
        if ((i & 16) != 0) {
            j2 = hfv.f12988a;
        }
        return (ycl.a(f, 0.0f) > 0 || z2) ? mm40Var.e(new njj0(f, yjj0Var2, z2, j3, j2)) : mm40Var;
    }

    public static final String V(r040 r040Var) {
        r040Var.getClass();
        switch (r040Var) {
            case SPORTS:
            case SINGLE_SPORTS:
                return "sport";
            case AGGREGATOR:
            case SINGLE_AGGREGATOR:
                return "aggregator";
            case GAMES:
            case SINGLE_GAMES:
                return "games";
            case OTHER:
            case SINGLE_OTHER:
                return "other";
            case TOP:
            case SINGLE_TOP:
                return "top";
            case VIRTUAL:
            case SINGLE_VIRTUAL:
                return "virtual";
            default:
                t9f.b();
                return null;
        }
    }

    public static final long W(long j) {
        s7z s7zVar = s7z.f31776a;
        return r4e.a(p4e.k(j), p4e.i(j), p4e.j(j), p4e.h(j));
    }

    public static Icon X(IconCompat iconCompat, Context context) {
        Icon iconCreateWithBitmap;
        InputStream inputStreamOpenInputStream;
        int i = iconCompat.f45356a;
        String strS = null;
        switch (i) {
            case -1:
                return (Icon) iconCompat.b;
            case 0:
            default:
                jf4.o("Unknown type");
                return null;
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                break;
            case 2:
                if (i == -1) {
                    Object obj = iconCompat.b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        strS = ia3.s(obj);
                    } else {
                        try {
                            strS = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e) {
                            Log.e("IconCompat", "Unable to get icon package", e);
                        } catch (NoSuchMethodException e2) {
                            Log.e("IconCompat", "Unable to get icon package", e2);
                        } catch (InvocationTargetException e3) {
                            Log.e("IconCompat", "Unable to get icon package", e3);
                        }
                    }
                } else {
                    if (i != 2) {
                        e9d0.v(iconCompat, "called getResPackage() on ");
                        return null;
                    }
                    String str = iconCompat.j;
                    strS = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.b).split(Separators.COLON, -1)[0] : iconCompat.j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strS, iconCompat.e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                break;
            case 5:
                int i2 = Build.VERSION.SDK_INT;
                Object obj2 = iconCompat.b;
                iconCreateWithBitmap = i2 < 26 ? Icon.createWithBitmap(IconCompat.a((Bitmap) obj2, false)) : ga3.f((Bitmap) obj2);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = e7.c(iconCompat.e());
                } else {
                    if (context == null) {
                        ohq.k(iconCompat.e(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    Uri uriE = iconCompat.e();
                    String scheme = uriE.getScheme();
                    if (RemoteMessageConst.Notification.CONTENT.equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriE);
                        } catch (Exception e4) {
                            Log.w("IconCompat", "Unable to load image from URI: " + uriE, e4);
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.b));
                        } catch (FileNotFoundException e5) {
                            Log.w("IconCompat", "Unable to load image from path: " + uriE, e5);
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        hny.w(iconCompat.e(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                    } else {
                        iconCreateWithBitmap = ga3.f(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    }
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.h;
        if (mode != IconCompat.k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public static final xy40 Y(xy40 xy40Var) {
        int i = xy40Var.g;
        if (i == 0) {
            xy40 xy40Var2 = ha80.f12713a;
            xy40Var2.getClass();
            return xy40Var2;
        }
        xy40 xy40Var3 = new xy40(i);
        Object[] objArr = xy40Var.b;
        long[] jArr = xy40Var.c;
        int i2 = xy40Var.e;
        while (i2 != Integer.MAX_VALUE) {
            int i3 = (int) ((jArr[i2] >> 31) & 2147483647L);
            xy40Var3.g(objArr[i2]);
            i2 = i3;
        }
        return xy40Var3;
    }

    public static final jic0 Z(qic0 qic0Var) {
        if (qic0Var.d != null) {
            return new jic0("", "", "", 0L, "", 0, 0L, false, false, false, false);
        }
        String str = qic0Var.f28785a;
        String str2 = str == null ? "" : str;
        String str3 = qic0Var.b;
        String str4 = str3 == null ? "" : str3;
        String str5 = qic0Var.c;
        String str6 = str5 == null ? "" : str5;
        Long l = qic0Var.e;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        String str7 = qic0Var.f;
        String str8 = str7 == null ? "" : str7;
        Integer num = qic0Var.g;
        int iIntValue = num != null ? num.intValue() : 0;
        Long l2 = qic0Var.h;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        Boolean bool = qic0Var.j;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = qic0Var.i;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = qic0Var.k;
        return new jic0(str2, str4, str6, jLongValue, str8, iIntValue, jLongValue2, zBooleanValue2, zBooleanValue, bool3 != null ? bool3.booleanValue() : false, true);
    }

    public static final void a(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(1338761495);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            float fH0 = lgb.h0(fetVar);
            zcl zclVar = qmk.f28987a;
            float f = 168.0f + fH0;
            m0x0.d(null, f, ijg.j, ijg.l, false, 14.0f, null, 0L, 0.0f, null, null, u1c.M(913848900, new lkb(l7m0Var, f, 56.0f + fH0, function1, (byte) 3), fetVar), u1c.M(1290580042, new kzh0(l7m0Var, function1, b), fetVar), fetVar, 24576, 432, 1985);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function1, i, (byte) 25);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(250000564);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), vbc.d0(vqm.f37862a, fetVar, 6, 0)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 15);
        }
    }

    public static final void c(int i, int i2, xcz xczVar, fet fetVar, int i3) {
        fetVar.g0(-369188354);
        int i4 = (fetVar.e(i) ? 4 : 2) | i3 | (fetVar.e(i2) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128);
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            Integer numValueOf = Integer.valueOf(i);
            boolean z = ((i4 & 14) == 4) | ((i4 & 112) == 32) | ((i4 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new wfe(i, i2, xczVar, (yje) null);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, numValueOf, (Function2) objP);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new al1(i, i2, xczVar, i3);
        }
    }

    public static final void d(mm40 mm40Var, pz40 pz40Var, boolean z, hh80 hh80Var, xcz xczVar, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        int i2;
        pz40 pz40Var2;
        boolean z2;
        ugd ugdVar4;
        ugd ugdVar5;
        ugd ugdVar6;
        int i3;
        fetVar.g0(-346174829);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            pz40Var2 = pz40Var;
            i2 |= fetVar.g(pz40Var2) ? 32 : 16;
        } else {
            pz40Var2 = pz40Var;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(hh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(xczVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            ugdVar4 = ugdVar;
            i2 |= fetVar.i(ugdVar4) ? 131072 : 65536;
        } else {
            ugdVar4 = ugdVar;
        }
        if ((1572864 & i) == 0) {
            ugdVar5 = ugdVar2;
            i2 |= fetVar.i(ugdVar5) ? 1048576 : 524288;
        } else {
            ugdVar5 = ugdVar2;
        }
        if ((12582912 & i) == 0) {
            ugdVar6 = ugdVar3;
            i2 |= fetVar.i(ugdVar6) ? 8388608 : 4194304;
        } else {
            ugdVar6 = ugdVar3;
        }
        if (fetVar.U(i2 & 1, (i2 & 4793491) != 4793490)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            mm40 mm40VarV = cjx.V(qjj.Q(mm40Var), x0x.a0(fetVar), null);
            boolean z3 = ((i2 & 112) == 32) | ((((57344 & i2) ^ 24576) > 16384 && fetVar.g(xczVar)) || (i2 & 24576) == 16384) | ((29360128 & i2) == 8388608) | ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                i3 = i2;
                wp8 wp8Var = new wp8(pz40Var2, xczVar, ugdVar6, z2, ugdVar4, ugdVar5);
                fetVar.o0(wp8Var);
                objP = wp8Var;
            } else {
                i3 = i2;
            }
            b8k0.e(mm40VarV, xczVar, hh80Var, null, null, null, false, null, (Function1) objP, fetVar, ((i3 >> 9) & 112) | ((i3 >> 3) & 896), Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gw6(mm40Var, pz40Var, z, hh80Var, xczVar, ugdVar, ugdVar2, ugdVar3, i);
        }
    }

    public static final void e(mm40 mm40Var, jyy jyyVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(-1640303107);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(jyyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarI = s5x0.I(o7k0.d(jm40Var, 1.0f), s5x0.t(xfn.a(fetVar).c, 0.0f, 2));
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarI);
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
            fetVar.e0(1194762404);
            for (nla nlaVar : jyyVar.b) {
                boolean z = jyyVar.c;
                boolean zG = fetVar.g(nlaVar) | ((i2 & 896) == 256);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new fkb(nlaVar, function1, b);
                    fetVar.o0(objP);
                }
                rcb.C(null, nlaVar, z, (Function1) objP, fetVar, 1);
            }
            fetVar.r(false);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var2, (Object) jyyVar, (Object) function1, i, (byte) 22);
        }
    }

    public static final void f(mm40 mm40Var, eao eaoVar, a4x a4xVar, xdr xdrVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        a4xVar.getClass();
        xdrVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(643847125);
        int i2 = i | 6 | (fetVar.g(eaoVar) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128) | (fetVar.i(xdrVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            int i3 = (i2 & 112) | 12582912 | (i2 & 896);
            int i4 = i2 << 3;
            fww.e(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 8.0f, 5), eaoVar, a4xVar, new qw3(6.0f, true, new jf4((byte) 14)), xdrVar, function1, function2, cfx0.k, fetVar, (i4 & 3670016) | i3 | (57344 & i4) | (458752 & i4));
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yt20(mm40Var2, eaoVar, a4xVar, xdrVar, function1, function2, i, (byte) 0);
        }
    }

    public static final void g(mm40 mm40Var, clo cloVar, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        int i2;
        fetVar.g0(1856725399);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(cloVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 2048 : 1024;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ms60(ugdVar, ugdVar2, cloVar, b);
                fetVar.o0(objP);
            }
            x4n0.a(mm40Var, (Function2) objP, fetVar, i2 & 14, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 23, i, (Object) mm40Var, (Object) cloVar, (Object) ugdVar, (Object) ugdVar2);
        }
    }

    public static final void h(mm40 mm40Var, a4x a4xVar, int i, gna0 gna0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        Object fsVar;
        int i4;
        pz40 pz40Var;
        kwj kwjVar;
        Boolean bool;
        a4x a4xVar2 = a4xVar;
        a4xVar2.getClass();
        gna0Var.getClass();
        function1.getClass();
        fetVar.g0(-218076956);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(a4xVar2) : fetVar.i(a4xVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(gna0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        boolean z = false;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            int i5 = i3 & 112;
            boolean z2 = i5 == 32 || ((i3 & 64) != 0 && fetVar.i(a4xVar2));
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z2 || objP == obj) {
                objP = new ife(a4xVar2, (byte) 5);
                fetVar.o0(objP);
            }
            kwj kwjVarB = zk80.b(i, (Function0) objP, fetVar, (i3 >> 6) & 14, 2);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            Integer numValueOf = Integer.valueOf(i);
            boolean zG = (i5 == 32 || ((i3 & 64) != 0 && fetVar.i(a4xVar2))) | ((i3 & 896) == 256) | fetVar.g(kwjVarB);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                i4 = i3;
                pz40Var = pz40Var2;
                fsVar = new fs((Object) a4xVar2, i, (Object) kwjVarB, (Object) pz40Var, (yje) null, (byte) 9);
                a4xVar2 = a4xVar2;
                kwjVar = kwjVarB;
                fetVar.o0(fsVar);
            } else {
                kwjVar = kwjVarB;
                pz40Var = pz40Var2;
                i4 = i3;
                fsVar = objP3;
            }
            m0x0.v(numValueOf, a4xVar2, (Function2) fsVar, fetVar);
            int i6 = i4 & 7168;
            boolean zG2 = fetVar.g(kwjVar) | (i5 == 32 || ((i4 & 64) != 0 && fetVar.i(a4xVar2))) | (i6 == 2048);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == obj) {
                a4x a4xVar3 = a4xVar2;
                Object wmqVar = new wmq((Object) kwjVar, (Object) pz40Var, (Object) a4xVar3, (Object) gna0Var, (yje) null, (byte) 17);
                a4xVar2 = a4xVar3;
                fetVar.o0(wmqVar);
                objP4 = wmqVar;
            }
            m0x0.v(kwjVar, a4xVar2, (Function2) objP4, fetVar);
            Integer numValueOf2 = Integer.valueOf(kwjVar.k());
            Boolean boolValueOf = Boolean.valueOf(kwjVar.k.a());
            boolean zG3 = fetVar.g(kwjVar) | (i5 == 32 || ((i4 & 64) != 0 && fetVar.i(a4xVar2))) | (i6 == 2048) | ((57344 & i4) == 16384);
            Object objP5 = fetVar.P();
            if (zG3 || objP5 == obj) {
                bool = boolValueOf;
                Object ah0Var = new ah0((Object) kwjVar, (Object) a4xVar2, (Object) gna0Var, (Object) function1, (yje) null, (byte) 13);
                fetVar.o0(ah0Var);
                objP5 = ah0Var;
            } else {
                bool = boolValueOf;
            }
            m0x0.v(numValueOf2, bool, (Function2) objP5, fetVar);
            zcl zclVar = qmk.f28987a;
            int i7 = i4;
            boolean z3 = a4xVar2.size() > 1;
            lh80 lh80VarT = s5x0.t(8.0f, 0.0f, 2);
            gfk0 gfk0Var = gfk0.b;
            if (i5 == 32 || ((i7 & 64) != 0 && fetVar.i(a4xVar2))) {
                z = true;
            }
            Object objP6 = fetVar.P();
            if (z || objP6 == obj) {
                objP6 = new oea(a4xVar2, (byte) 21);
                fetVar.o0(objP6);
            }
            q5x.e(kwjVar, mm40Var, lh80VarT, al80.f1056a, 0, 8.0f, null, null, z3, (Function1) objP6, null, gfk0Var, null, u1c.M(539748419, new ftl(a4xVar2, (byte) 4), fetVar), fetVar, (i7 << 3) & 112, 24960, 10960);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k53(mm40Var, a4xVar, i, gna0Var, function1, i2);
        }
    }

    public static final void i(hfa0 hfa0Var, x0a0 x0a0Var, fet fetVar, int i) {
        int i2;
        y9q0 y9q0Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1892590968);
        int i3 = i & 6;
        zhg0 zhg0Var = zhg0.f44392a;
        if (i3 == 0) {
            i2 = (fetVar2.g(zhg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(hfa0Var) : fetVar2.i(hfa0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar2.g(x0a0Var) : fetVar2.i(x0a0Var) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = ((i2 & 896) == 256 || ((i2 & 512) != 0 && fetVar2.i(x0a0Var))) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar2.i(hfa0Var)));
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new qw80((Object) x0a0Var, (Object) hfa0Var, (byte) 18);
                fetVar2.o0(objP2);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(jm40Var, gy40Var, null, false, null, (Function0) objP2, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarA = zhg0Var.a(1.0f, o7k0.t(mm40VarW, 56.0f, 64.0f), true);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
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
            j(hfa0Var, fetVar2, (i2 >> 3) & 14);
            mm40 mm40VarE0 = o2e.e0(o7k0.d(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), 1.0f), "PlayerName");
            String str = hfa0Var.b;
            long jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            if (hfa0Var.e) {
                y9q0Var = new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109);
            } else {
                y9q0Var = new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109);
            }
            v8q0.a(str, mm40VarE0, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) hfa0Var, (Object) x0a0Var, i, (byte) 9);
        }
    }

    public static final void j(hfa0 hfa0Var, fet fetVar, int i) {
        int i2;
        String str = hfa0Var.c;
        fetVar.g0(1254065286);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? fetVar.g(hfa0Var) : fetVar.i(hfa0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarU = i4w0.U(jm40Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1, null, 983039);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarU);
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
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.J(jm40Var, 2.0f), 1.0f), 64.0f);
            long j = hfa0Var.f;
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, i120.S(i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 2.0f, hfa0Var.e ? y3d.c : y3d.f, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2))), "PlayerImage");
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar.i(hfa0Var));
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new yr80(hfa0Var, (byte) 11);
                fetVar.o0(objP);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP);
            k1x k1xVar = new k1x((Context) fetVar.k(dy2.b));
            k1xVar.c = hfa0Var.d;
            lls0[] lls0VarArr = {new mrs0()};
            kuo kuoVar = q1x.f27974a;
            q1x.b(k1xVar, tx3.g0(lls0VarArr));
            k7x.b(k1xVar.a(), null, mm40VarA, a8k0.F(R.drawable.cyber_composition_player_placeholder, 0, fetVar), a8k0.F(R.drawable.cyber_composition_player_placeholder, 0, fetVar), null, null, null, null, null, null, null, fetVar, 36912, 0, 32736);
            if (str.length() > 0) {
                fetVar.e0(1238069213);
                mm40 mm40VarB = jr8.f16991a.b(o7k0.n(jm40Var, 14.0f), gqw0.g);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new er90((byte) 20);
                    fetVar.o0(objP2);
                }
                k7x.a(str, null, o2e.e0(lgb.J(rq8.K(mm40VarB, (Function1) objP2), vgg0.f37379a), "ImageFlag"), null, null, fetVar, 48, 2040);
                fetVar.r(false);
            } else {
                fetVar.e0(1238698978);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(hfa0Var, i, (byte) 8);
        }
    }

    public static final void k(a4x a4xVar, x0a0 x0a0Var, fet fetVar, int i) {
        int i2;
        a4xVar.getClass();
        x0a0Var.getClass();
        fetVar.g0(-676380180);
        int i3 = i & 6;
        y5d y5dVar = y5d.f42040a;
        if (i3 == 0) {
            i2 = (fetVar.g(y5dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(x0a0Var) : fetVar.i(x0a0Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.u(s5x0.L(jm40.b, 6.0f, 0.0f, 2), 0.0f, 352.0f, 1), 0.0f, 2.0f, 0.0f, 0.0f, 13);
            xx7 xx7Var = gqw0.n;
            mm40 mm40VarE0 = o2e.e0(y5dVar.a(mm40VarN, xx7Var), "PlayersCompositionTeamPlayersTestTag");
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(xx7Var, (byte) 12)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 1912516631, a4xVar);
            while (itO.hasNext()) {
                hfa0 hfa0Var = (hfa0) itO.next();
                fetVar.b0(621374741, hfa0Var.f12964a);
                i(hfa0Var, x0a0Var, fetVar, (i2 & 896) | 6);
                fetVar.r(false);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) a4xVar, (Object) x0a0Var, i, (byte) 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void l(epd0 epd0Var, Function1 function1, fet fetVar, int i) {
        byte b;
        fet fetVar2;
        byte b2;
        Object obj;
        boolean z;
        Object obj2;
        boolean z2;
        fet fetVar3;
        fet fetVar4 = fetVar;
        fetVar4.g0(444087695);
        int i2 = i | (fetVar4.g(epd0Var) ? 32 : 16) | (fetVar4.i(function1) ? 256 : 128);
        if (fetVar4.U(i2 & 1, (i2 & 147) != 146)) {
            long background = ((ThemeColors) fetVar4.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(i120.Q(mm40Var, background, ljcVar), 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
            byte b3 = 14;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4(b3)), gqw0.m, fetVar4, 0);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarJ);
            mkd.c0.getClass();
            fetVar4.i0();
            boolean z3 = fetVar4.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar4, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar4, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar4, numValueOf, shdVar3);
            jpm0.n(fetVar4);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar4, mm40VarC0, shdVar4);
            qw3 qw3Var = new qw3(4.0f, true, new jf4(b3));
            yx7 yx7Var = gqw0.j;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar4, 0);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40Var);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, thg0VarA, shdVar);
            jpm0.o(fetVar4, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar4);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(0.5f, mm40Var, true);
            String str = epd0Var.b;
            String str2 = epd0Var.e;
            boolean z4 = epd0Var.f8182a;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z5 = (i3 == 256) | (i4 == 32);
            Object objP = fetVar4.P();
            cl5 cl5Var = ukd.f35823a;
            if (z5 || objP == cl5Var) {
                b2 = 1;
                wod0 wod0Var = new wod0(b2, epd0Var, function1);
                fetVar4.o0(wod0Var);
                obj = wod0Var;
            } else {
                b2 = 1;
                obj = objP;
            }
            q(mm40VarA, str, str2, z4, (Function0) obj, fetVar4, 0);
            mm40 mm40VarA2 = zhg0Var.a(0.5f, mm40Var, b2);
            String str3 = epd0Var.c;
            String str4 = epd0Var.e;
            boolean z6 = epd0Var.f8182a;
            boolean z7 = (i3 == 256) | (i4 == 32);
            Object objP2 = fetVar4.P();
            Object obj3 = objP2;
            if (z7 || objP2 == cl5Var) {
                wod0 wod0Var2 = new wod0((byte) 3, epd0Var, function1);
                fetVar4.o0(wod0Var2);
                obj3 = wod0Var2;
            }
            q(mm40VarA2, str3, str4, z6, (Function0) obj3, fetVar4, 0);
            fetVar4.r(true);
            thg0 thg0VarA2 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar4, 0);
            int iHashCode3 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM3 = fetVar4.m();
            mm40 mm40VarC2 = kbc.c0(fetVar4, mm40Var);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, thg0VarA2, shdVar);
            jpm0.o(fetVar4, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC2, shdVar4);
            mm40 mm40VarA3 = zhg0Var.a(0.5f, mm40Var, true);
            String str5 = epd0Var.d;
            String str6 = epd0Var.e;
            boolean z8 = epd0Var.f8182a;
            boolean z9 = (i3 == 256) | (i4 == 32);
            Object objP3 = fetVar4.P();
            Object obj4 = objP3;
            if (z9 || objP3 == cl5Var) {
                wod0 wod0Var3 = new wod0((byte) 5, epd0Var, function1);
                fetVar4.o0(wod0Var3);
                obj4 = wod0Var3;
            }
            q(mm40VarA3, str5, str6, z8, (Function0) obj4, fetVar4, 0);
            String str7 = epd0Var.f;
            if (str7 == null) {
                fetVar4.e0(539917211);
                fetVar4.r(false);
                z2 = true;
                fetVar3 = fetVar4;
            } else {
                fetVar4.e0(539917212);
                mm40 mm40VarA4 = zhg0Var.a(0.5f, mm40Var, true);
                String upperCase = rsm0.w(R.string.maximum, 0, fetVar4).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                boolean z10 = epd0Var.f8182a;
                boolean zG = (i3 == 256) | fetVar4.g(str7);
                Object objP4 = fetVar4.P();
                if (zG || objP4 == cl5Var) {
                    z = true;
                    cpw cpwVar = new cpw(true ? 1 : 0, str7, function1);
                    fetVar4.o0(cpwVar);
                    obj2 = cpwVar;
                } else {
                    z = true;
                    obj2 = objP4;
                }
                p(0, fetVar4, mm40VarA4, upperCase, (Function0) obj2, z10);
                fet fetVar5 = fetVar4;
                fetVar5.r(false);
                fetVar3 = fetVar5;
                z2 = z;
            }
            fetVar3.r(z2);
            fetVar3.r(z2);
            fetVar2 = fetVar3;
            b = z2;
        } else {
            b = 1;
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vod0(epd0Var, function1, i, b);
        }
    }

    public static final void m(String str, fet fetVar, int i) {
        fetVar.g0(-842326191);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1689351185, new yh20(str, (byte) 17), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 18, i, str);
        }
    }

    public static final void n(epd0 epd0Var, Function1 function1, xdr xdrVar, fet fetVar, int i) {
        xdr xdrVar2;
        fetVar.g0(1611767151);
        byte b = 16;
        int i2 = i | (fetVar.g(epd0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | 3072;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            ugd ugdVarM = u1c.M(-1268172480, new zod0(b2, epd0Var, function1), fetVar);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(i120.Q(jm40Var, background, ljcVar), 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(0.25f, jm40Var, true);
            String str = epd0Var.b;
            String str2 = epd0Var.e;
            boolean z = epd0Var.f8182a;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z2 = (i3 == 256) | (i4 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new wod0(b, epd0Var, function1);
                fetVar.o0(objP);
            }
            q(mm40VarA, str, str2, z, (Function0) objP, fetVar, 0);
            mm40 mm40VarA2 = zhg0Var.a(0.25f, jm40Var, true);
            String str3 = epd0Var.c;
            String str4 = epd0Var.e;
            boolean z3 = epd0Var.f8182a;
            boolean z4 = (i3 == 256) | (i4 == 32);
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new wod0((byte) 19, epd0Var, function1);
                fetVar.o0(objP2);
            }
            q(mm40VarA2, str3, str4, z3, (Function0) objP2, fetVar, 0);
            mm40 mm40VarA3 = zhg0Var.a(0.25f, jm40Var, true);
            String str5 = epd0Var.d;
            String str6 = epd0Var.e;
            boolean z5 = epd0Var.f8182a;
            boolean z6 = (i4 == 32) | (i3 == 256);
            Object objP3 = fetVar.P();
            if (z6 || objP3 == cl5Var) {
                objP3 = new wod0((byte) 21, epd0Var, function1);
                fetVar.o0(objP3);
            }
            q(mm40VarA3, str5, str6, z5, (Function0) objP3, fetVar, 0);
            fetVar.e0(1798880447);
            xdrVar2 = ugdVarM;
            xdrVar2.F(zhg0Var, fetVar, 54);
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
            xdrVar2 = xdrVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xod0(epd0Var, function1, xdrVar2, i, (byte) 0);
        }
    }

    public static final void o(mm40 mm40Var, boolean z, Function0 function0, xdr xdrVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-360957358);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(xdrVar) ? 2048 : 1024;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            vld0.a(((i3 >> 3) & 14) | 48, u1c.M(2059587824, new bpd0(mm40Var, z, function0, xdrVar, (byte) 0), fetVar), fetVar, z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpd0(mm40Var, z, function0, xdrVar, i, (byte) 0);
        }
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var, String str, Function0 function0, boolean z) {
        fet fetVar2;
        mm40 mm40Var2;
        Function0 function1;
        boolean z2;
        fetVar.g0(1283836128);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = (i2 & 14) | 3072;
            int i4 = i2 >> 3;
            fetVar2 = fetVar;
            o(mm40Var, z, function0, u1c.M(705373894, new h0(str, (byte) 6), fetVar), fetVar2, i3 | (i4 & 112) | (i4 & 896));
            mm40Var2 = mm40Var;
            z2 = z;
            function1 = function0;
        } else {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            function1 = function0;
            z2 = z;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b0y(mm40Var2, str, z2, function1, i, (byte) 4);
        }
    }

    public static final void q(mm40 mm40Var, String str, String str2, boolean z, Function0 function0, fet fetVar, int i) {
        fetVar.g0(1287165785);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.i(function0) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = (i2 & 14) | 3072;
            int i4 = i2 >> 6;
            o(mm40Var, z, function0, u1c.M(-1153765197, new ew6(str, str2, (byte) 6), fetVar), fetVar, (i4 & 112) | i3 | (i4 & 896));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j4q(mm40Var, str, str2, z, function0, i, (byte) 2);
        }
    }

    public static final void r(mm40 mm40Var, epd0 epd0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        epd0Var.getClass();
        function1.getClass();
        fetVar.g0(220991303);
        int i2 = i | 6 | (fetVar.g(epd0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            g9q0 g9q0VarN = pym0.n(fetVar);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            String str = epd0Var.f;
            if (str == null) {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            pz40 pz40VarF = androidx.compose.runtime.e.f(epd0Var.b, fetVar);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(epd0Var.c, fetVar);
            pz40 pz40VarF3 = androidx.compose.runtime.e.f(epd0Var.d, fetVar);
            pz40 pz40VarF4 = androidx.compose.runtime.e.f(str, fetVar);
            boolean zG = fetVar.g(g9q0VarN) | fetVar.g(w6kVar);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            Object obj2 = objP;
            if (zG || objP == obj) {
                ycl yclVar = (ycl) jgk0.b(new dpd0(g9q0VarN, pz40VarF, pz40VarF2, pz40VarF3, pz40VarF4, w6kVar, (byte) 0)).getValue();
                float f = yclVar.f42389a;
                fetVar.o0(yclVar);
                obj2 = yclVar;
            }
            float f2 = ((ycl) obj2).f42389a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            boolean zD = ((i2 & 896) == 256) | ((i2 & 112) == 32) | fetVar.d(f2);
            Object objP2 = fetVar.P();
            if (zD || objP2 == obj) {
                objP2 = new uod0(f2, epd0Var, function1, b);
                fetVar.o0(objP2);
            }
            x4n0.a(mm40VarD, (Function2) objP2, fetVar, 0, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yod0(mm40Var2, epd0Var, function1, i, (byte) 2);
        }
    }

    public static final void s(mm40 mm40Var, dkg0 dkg0Var, fet fetVar, int i) {
        a4x a4xVar = dkg0Var.c;
        fetVar.g0(473726827);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(dkg0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int i3 = q3d.i(a4xVar);
            if (i3 < 0) {
                i3 = 0;
            }
            xcz xczVarA = ddz.a(i3, 0, fetVar, 0, 2);
            int size = a4xVar.size();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(size);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            Integer numValueOf = Integer.valueOf(size);
            boolean zE = fetVar.e(size);
            Object objP2 = fetVar.P();
            if (zE || objP2 == cl5Var) {
                objP2 = new cna(cgk0Var, size, null);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, numValueOf, (Function2) objP2);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(lgb.J(mm40VarD, vgg0.a(16.0f)), StaticColors.INSTANCE.m75getBlack600d7_KjU(), jd8.n), 8.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            vvw.i(dkg0Var.f6228a, dkg0Var.b, fetVar, 0);
            j120.z(new x7z(1.0f, true), dkg0Var.c, xczVarA, cgk0Var.l() != size, fetVar, 0);
            fetVar.r(true);
            c(size, cgk0Var.l(), xczVarA, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(mm40Var, dkg0Var, i, (byte) 20);
        }
    }

    public static final void t(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(634768991);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            a(l7m0Var, function1, fetVar, i2 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function1, i, (byte) 24);
        }
    }

    public static final void u(mm40 mm40Var, d0k0 d0k0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        function1.getClass();
        fetVar.g0(180671311);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(d0k0Var) : fetVar.i(d0k0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            b34.h(d0k0Var != null, mm40Var, kzn.d(null, 0.0f, 3), kzn.e(null, 3), null, u1c.M(-789365209, new in80(d0k0Var, function1, (byte) 24), fetVar), fetVar, ((i2 << 3) & 112) | 200064, 16);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) mm40Var, (Object) d0k0Var, (Object) function1, i, (byte) 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Throwable] */
    public static final void v(mm40 mm40Var, List list, AggregatorSortingOptionModel aggregatorSortingOptionModel, final Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        final byte b;
        fet fetVar2 = fetVar;
        list.getClass();
        function1.getClass();
        fetVar2.g0(-1749846654);
        int i2 = i | 6 | (fetVar2.g(list) ? 32 : 16) | (fetVar2.i(aggregatorSortingOptionModel) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA0 = wha0.a0(cjx.V(s5x0.N(jm40Var, 0.0f, 24.0f, 0.0f, 0.0f, 13), x0x.a0(fetVar2), null), wha0.T(fetVar2), false, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA0);
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
            y3d y3dVar = null;
            mm40Var2 = jm40Var;
            wwb.i(null, rsm0.w(R.string.sort_by, 0, fetVar2), 0L, 0, 0L, fetVar, 0, 29);
            fetVar2 = fetVar;
            wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
            fetVar2.e0(233473745);
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    ?? r18 = y3dVar;
                    q3d.p();
                    throw r18;
                }
                final AggregatorSortingOptionModel aggregatorSortingOptionModel2 = (AggregatorSortingOptionModel) obj;
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(mm40Var2, 4.0f, 0.0f, 2);
                kvl kvlVar = new kvl(Long.valueOf(i3), new tui0(aggregatorSortingOptionModel2.f46274a, y3dVar), null, new nvi0(aggregatorSortingOptionModel2.equals(aggregatorSortingOptionModel)), null, 500);
                int i5 = i2 & 7168;
                boolean zI = (i5 == 2048) | fetVar2.i(aggregatorSortingOptionModel2);
                Object objP = fetVar2.P();
                cl5 cl5Var = ukd.f35823a;
                if (zI || objP == cl5Var) {
                    final byte b2 = 0;
                    objP = new Function1() { // from class: a.klk0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b3 = b2;
                            glk0 glk0Var = glk0.f11496a;
                            AggregatorSortingOptionModel aggregatorSortingOptionModel3 = aggregatorSortingOptionModel2;
                            Function1 function2 = function1;
                            ((mvl) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    function2.invoke(new hlk0(aggregatorSortingOptionModel3.f46274a));
                                    function2.invoke(glk0Var);
                                    break;
                                default:
                                    function2.invoke(new hlk0(aggregatorSortingOptionModel3.f46274a));
                                    function2.invoke(glk0Var);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP);
                }
                Function1 function2 = (Function1) objP;
                boolean zI2 = (i5 == 2048) | fetVar2.i(aggregatorSortingOptionModel2);
                Object objP2 = fetVar2.P();
                if (zI2 || objP2 == cl5Var) {
                    b = 1;
                    objP2 = new Function1() { // from class: a.klk0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b3 = b;
                            glk0 glk0Var = glk0.f11496a;
                            AggregatorSortingOptionModel aggregatorSortingOptionModel3 = aggregatorSortingOptionModel2;
                            Function1 function3 = function1;
                            ((mvl) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    function3.invoke(new hlk0(aggregatorSortingOptionModel3.f46274a));
                                    function3.invoke(glk0Var);
                                    break;
                                default:
                                    function3.invoke(new hlk0(aggregatorSortingOptionModel3.f46274a));
                                    function3.invoke(glk0Var);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP2);
                } else {
                    b = 1;
                }
                y3d y3dVar2 = y3dVar;
                dub.x(mm40VarL, kvlVar, function2, (Function1) objP2, fetVar2, 0, 4);
                if (i3 != list.size() - b) {
                    fetVar2.e0(180415178);
                    vtb.t(null, qqm.f29173a, zfi0.f44303a, 0L, fetVar, 432, 9);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(180601612);
                    fetVar2.r(false);
                }
                i3 = i4;
                y3dVar = y3dVar2;
            }
            fetVar2.r(false);
            zcl zclVar3 = qmk.f28987a;
            wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0(mm40Var2, (Object) list, (Object) aggregatorSortingOptionModel, function1, i, (byte) 24);
        }
    }

    public static final void w(y5d y5dVar, mm40 mm40Var, j83 j83Var, j83 j83Var2, y9q0 y9q0Var, ugd ugdVar, fet fetVar, int i) {
        j83Var.getClass();
        j83Var2.getClass();
        if (ugdVar == null) {
            fetVar.e0(-374769309);
        } else {
            fetVar.e0(-1536109986);
            ugdVar.F(y5dVar, fetVar, Integer.valueOf((i & 14) | ((i >> 12) & 112)));
        }
        fetVar.r(false);
        int i2 = i >> 3;
        int i3 = i >> 6;
        int i4 = i3 & 896;
        ucx.E(mm40Var, j83Var, y9q0Var, fetVar, (i2 & 126) | i4);
        ucx.E(mm40Var, j83Var2, y9q0Var, fetVar, (i3 & 112) | (i2 & 14) | i4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object x(bch0 bch0Var, float f, j73 j73Var, yje yjeVar) {
        iah0 iah0Var;
        jie0 jie0Var;
        if (yjeVar instanceof iah0) {
            iah0Var = (iah0) yjeVar;
            int i = iah0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                iah0Var.k = i - Integer.MIN_VALUE;
            } else {
                iah0Var = new iah0(yjeVar);
            }
        } else {
            iah0Var = new iah0(yjeVar);
        }
        Object obj = iah0Var.j;
        Object obj2 = wne.f39444a;
        int i2 = iah0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            jie0 jie0Var2 = new jie0();
            Function2 dzlVar = new dzl(f, j73Var, jie0Var2, null);
            iah0Var.i = jie0Var2;
            iah0Var.k = 1;
            if (bch0Var.b(c050.f3507a, dzlVar, iah0Var) == obj2) {
                return obj2;
            }
            jie0Var = jie0Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jie0Var = iah0Var.i;
            z1x.P(obj);
        }
        return new Float(jie0Var.f16571a);
    }

    public static final mm40 z(fet fetVar, mm40 mm40Var) {
        mm40Var.getClass();
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            objP = new d39();
            fetVar.o0(objP);
        }
        d39 d39Var = (d39) objP;
        Object objP2 = fetVar.P();
        if (objP2 == obj) {
            objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
            fetVar.o0(objP2);
        }
        vne vneVar = (vne) objP2;
        mm40 mm40VarB = cfx0.B(jm40.b, d39Var);
        boolean zI = fetVar.i(vneVar) | fetVar.i(d39Var);
        Object objP3 = fetVar.P();
        if (zI || objP3 == obj) {
            objP3 = new nm40(vneVar, d39Var, (byte) 1);
            fetVar.o0(objP3);
        }
        return mm40Var.e(o050.T(mm40VarB, (Function1) objP3));
    }
}
