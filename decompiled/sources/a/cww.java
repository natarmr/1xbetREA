package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class cww implements eer {
    public static final void A(View view, FrameLayout frameLayout, int i, int i2) {
        view.getClass();
        if (view.getLayoutDirection() == 0) {
            view.layout(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
        } else {
            view.layout((frameLayout.getMeasuredWidth() - i) - view.getMeasuredWidth(), i2, frameLayout.getMeasuredWidth() - i, view.getMeasuredHeight() + i2);
        }
    }

    public static final void B(ViewGroup viewGroup, int i, int i2, int i3, int i4, ydr ydrVar) {
        viewGroup.getClass();
        if (viewGroup.getLayoutDirection() == 0) {
            ydrVar.j(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        } else {
            ydrVar.j(Integer.valueOf(viewGroup.getMeasuredWidth() - i3), Integer.valueOf(i2), Integer.valueOf(viewGroup.getMeasuredWidth() - i), Integer.valueOf(i4));
        }
    }

    public static final void C(FrameLayout frameLayout, int i, int i2, int i3, int i4, int i5, ydr ydrVar) {
        if (frameLayout.getLayoutDirection() == 0) {
            ydrVar.j(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        } else {
            ydrVar.j(Integer.valueOf(i - i4), Integer.valueOf(i3), Integer.valueOf(i - i2), Integer.valueOf(i5));
        }
    }

    public static String[] D(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            l8x.E0("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException e) {
            l8x.F0("QuirkSettingsLoader", "Quirk class names resource not found: " + i, e);
            return new String[0];
        }
    }

    public static final void E(bzu bzuVar, String str, Boolean bool) {
        str.getClass();
        bzuVar.h(ncy.a(bool), str);
    }

    public static final void F(bzu bzuVar, String str, Number number) {
        str.getClass();
        bzuVar.h(ncy.b(number), str);
    }

    public static final void G(bzu bzuVar, String str, String str2) {
        str.getClass();
        bzuVar.h(ncy.c(str2), str);
    }

    public static void H(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static HashSet I(String[] strArr) {
        Class<?> cls;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
                if (!gpd0.class.isAssignableFrom(cls)) {
                    l8x.E0("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
                    cls = null;
                }
            } catch (ClassNotFoundException e) {
                l8x.F0("QuirkSettingsLoader", "Class not found: " + str, e);
            }
            if (cls != null) {
                hashSet.add(cls);
            }
        }
        return hashSet;
    }

    public static void J(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        if (Build.VERSION.SDK_INT >= 26 || !z2 || z) {
            checkableImageButton.setLongClickable(z);
        }
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static final p9n K(hcs hcsVar) {
        hcsVar.getClass();
        int iOrdinal = hcsVar.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return p9n.NEW;
        }
        if (iOrdinal == 2) {
            return p9n.FREE;
        }
        if (iOrdinal == 3) {
            return p9n.BEST;
        }
        if (iOrdinal != 4) {
            if (iOrdinal == 5) {
                return p9n.SPECIAL;
            }
            t9f.b();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static final wlc L(zlc zlcVar) {
        ?? arrayList;
        zlcVar.getClass();
        e8v0 e8v0Var = zlcVar.f44573a;
        f7v0 f7v0VarY = e8v0Var != null ? xsm0.y(e8v0Var) : f7v0.f9077a;
        String str = zlcVar.b;
        if (str == null) {
            str = "";
        }
        mwp mwpVar = zlcVar.c;
        fwp fwpVarM = mwpVar != null ? M(mwpVar) : new fwp(-1, -1L, "", "", "", "", "", -1, new gwp(-1, -1, -1), 0);
        List list = zlcVar.d;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(M((mwp) it.next()));
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new wlc(f7v0VarY, str, fwpVarM, arrayList);
    }

    public static final fwp M(mwp mwpVar) {
        gwp gwpVar;
        int i;
        int iIntValue;
        mwpVar.getClass();
        Integer num = mwpVar.f22516a;
        int iIntValue2 = num != null ? num.intValue() : 0;
        Long l = mwpVar.b;
        long jLongValue = l != null ? l.longValue() : 0L;
        String str = mwpVar.c;
        if (str == null) {
            str = "";
        }
        String str2 = mwpVar.d;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = mwpVar.e;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = mwpVar.f;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = mwpVar.g;
        String str6 = str5 != null ? str5 : "";
        Integer num2 = mwpVar.h;
        int iIntValue3 = num2 != null ? num2.intValue() : -1;
        jwp jwpVar = mwpVar.i;
        if (jwpVar != null) {
            Integer num3 = jwpVar.f17263a;
            int iIntValue4 = num3 != null ? num3.intValue() : -1;
            Integer num4 = jwpVar.b;
            int iIntValue5 = num4 != null ? num4.intValue() : -1;
            Integer num5 = jwpVar.c;
            gwpVar = new gwp(iIntValue4, iIntValue5, num5 != null ? num5.intValue() : -1);
        } else {
            gwpVar = new gwp(-1, -1, -1);
        }
        Integer num6 = mwpVar.j;
        if (num6 != null) {
            int i2 = iIntValue3;
            iIntValue = num6.intValue();
            i = i2;
        } else {
            i = iIntValue3;
            iIntValue = 0;
        }
        new fwp(iIntValue2, jLongValue, str, str2, str3, str4, str6, i, gwpVar, iIntValue);
        return r1;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final a.wyy N(a.vyy r22) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cww.N(a.vyy):a.wyy");
    }

    public static final wv10 O(r040 r040Var) {
        r040Var.getClass();
        switch (r040Var) {
            case SPORTS:
            case SINGLE_SPORTS:
                return wv10.SPORT;
            case AGGREGATOR:
            case SINGLE_AGGREGATOR:
                return wv10.AGGREGATOR;
            case GAMES:
            case SINGLE_GAMES:
                return wv10.ONE_X_GAMES;
            case OTHER:
            case SINGLE_OTHER:
                return wv10.OTHER;
            case TOP:
            case SINGLE_TOP:
                return wv10.TOP;
            case VIRTUAL:
            case SINGLE_VIRTUAL:
                return wv10.VIRTUAL;
            default:
                t9f.b();
                return null;
        }
    }

    public static final kic0 P(ric0 ric0Var) {
        ric0Var.getClass();
        if (ric0Var.d != null) {
            return new kic0("", "", "", 0L, "", 0, 0L, false, false, false, false);
        }
        String str = ric0Var.f30536a;
        String str2 = str == null ? "" : str;
        String str3 = ric0Var.b;
        String str4 = str3 == null ? "" : str3;
        String str5 = ric0Var.c;
        String str6 = str5 == null ? "" : str5;
        Long l = ric0Var.e;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        String str7 = ric0Var.f;
        String str8 = str7 == null ? "" : str7;
        Integer num = ric0Var.g;
        int iIntValue = num != null ? num.intValue() : 0;
        Long l2 = ric0Var.h;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        Boolean bool = ric0Var.i;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = ric0Var.j;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = ric0Var.k;
        return new kic0(str2, str4, str6, jLongValue, str8, iIntValue, jLongValue2, zBooleanValue, zBooleanValue2, bool3 != null ? bool3.booleanValue() : false, true);
    }

    public static final owf0 Q(jd jdVar) throws Exception {
        vqp vqpVar;
        jdVar.getClass();
        yvq yvqVar = jdVar.j;
        List list = jdVar.k;
        ywp0 ywp0Var = jdVar.i;
        if (yvqVar == null && ((list == null || list.isEmpty()) && ywp0Var != null)) {
            String str = ywp0Var.f43382a;
            if (str == null) {
                jf4.k(null);
                return null;
            }
            String str2 = ywp0Var.b;
            if (str2 != null) {
                return new nwf0(new swp0(str, str2, false));
            }
            jf4.k(null);
            return null;
        }
        if (yvqVar == null || ywp0Var == null) {
            if (list == null || list.isEmpty() || ywp0Var == null) {
                throw new Exception();
            }
            String str3 = ywp0Var.f43382a;
            if (str3 == null) {
                jf4.k(null);
                return null;
            }
            String str4 = ywp0Var.b;
            if (str4 != null) {
                return new lwf0(new swp0(str3, str4, false), list);
            }
            jf4.k(null);
            return null;
        }
        List<crp> list2 = yvqVar.f43332a;
        if (list2 == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        for (crp crpVar : list2) {
            String str5 = crpVar.f4855a;
            if (str5 != null) {
                vqp.f37865a.getClass();
                switch (str5) {
                    case "UserId":
                        vqpVar = vqp.b;
                        break;
                    case "CountryId":
                        vqpVar = vqp.e;
                        break;
                    case "RegionId":
                        vqpVar = vqp.f;
                        break;
                    case "Surname":
                        vqpVar = vqp.c;
                        break;
                    case "Name":
                        vqpVar = vqp.d;
                        break;
                    case "Email":
                        vqpVar = vqp.i;
                        break;
                    case "Phone":
                        vqpVar = vqp.j;
                        break;
                    case "Birthday":
                        vqpVar = vqp.h;
                        break;
                    case "CityId":
                        vqpVar = vqp.g;
                        break;
                    default:
                        vqpVar = null;
                        break;
                }
                if (vqpVar != null) {
                    String str6 = crpVar.b;
                    if (str6 == null) {
                        jf4.k(null);
                        return null;
                    }
                    Boolean bool = crpVar.c;
                    if (bool == null) {
                        jf4.k(null);
                        return null;
                    }
                    arrayList.add(new gd(vqpVar, str6, bool.booleanValue()));
                }
            }
            jf4.k(null);
            return null;
        }
        String str7 = ywp0Var.f43382a;
        if (str7 == null) {
            jf4.k(null);
            return null;
        }
        String str8 = ywp0Var.b;
        if (str8 != null) {
            return new mwf0(arrayList, new swp0(str7, str8, false));
        }
        jf4.k(null);
        return null;
    }

    public static final zfa R(d0t d0tVar, v5l0 v5l0Var, m5l0 m5l0Var, ctf0 ctf0Var, boolean z, y78 y78Var, boolean z2, boolean z3) {
        v5l0Var.getClass();
        ctf0Var.getClass();
        int iOrdinal = v5l0Var.ordinal();
        g0n g0nVarN = f0n.f8723a;
        if (iOrdinal == 0) {
            long j = d0tVar.f5282a;
            String strA = ctf0Var.b.a(R.string.live_badge_label, Arrays.copyOf(new Object[0], 0));
            u3i u3iVarQ = zvw.Q(d0tVar, z);
            wga wgaVar = new wga(zvw.P(d0tVar, z, z2), zvw.T(d0tVar, z), u3iVarQ, strA);
            if (!kpb.e0(d0tVar)) {
                g0nVarN = bww.N(d0tVar, ctf0Var);
            }
            g0n g0nVar = g0nVarN;
            String strE = xvw.E(d0tVar);
            String string = y78.n(y78Var, d0tVar, false, z3, 4).toString();
            kpm kpmVarL = bww.L(d0tVar);
            String strC0 = qzb.c0(d0tVar);
            ows0 ows0VarM = bww.M(bww.I(d0tVar), kpb.D(d0tVar), strC0);
            String strR0 = qzb.r0(d0tVar);
            return new ufa(j, wgaVar, new rga(g0nVar, strE, string, kpmVarL, ows0VarM, bww.M(bww.J(d0tVar), kpb.U(d0tVar), strR0)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 1) {
            long j2 = d0tVar.f5282a;
            String strA2 = ctf0Var.b.a(R.string.live_badge_label, Arrays.copyOf(new Object[0], 0));
            aha ahaVar = new aha(zvw.T(d0tVar, z), zvw.Q(d0tVar, z), strA2);
            e0n e0nVarN = bww.N(d0tVar, ctf0Var);
            String strE2 = xvw.E(d0tVar);
            String string2 = y78.n(y78Var, d0tVar, false, z3, 4).toString();
            kpm kpmVarL2 = bww.L(d0tVar);
            String strC1 = qzb.c0(d0tVar);
            ows0 ows0VarM2 = bww.M(bww.I(d0tVar), kpb.D(d0tVar), strC1);
            String strR1 = qzb.r0(d0tVar);
            return new yfa(j2, ahaVar, new vga(e0nVarN, strE2, string2, kpmVarL2, ows0VarM2, bww.M(bww.J(d0tVar), kpb.U(d0tVar), strR1)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 2) {
            long j3 = d0tVar.f5282a;
            String strA3 = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
            String string3 = y78.n(y78Var, d0tVar, false, z3, 4).toString();
            u3i u3iVarQ2 = zvw.Q(d0tVar, z);
            zga zgaVar = new zga(strA3, string3, zvw.P(d0tVar, z, z2), zvw.T(d0tVar, z), u3iVarQ2);
            if (!kpb.e0(d0tVar)) {
                g0nVarN = bww.N(d0tVar, ctf0Var);
            }
            g0n g0nVar2 = g0nVarN;
            String strE3 = xvw.E(d0tVar);
            kpm kpmVarL3 = bww.L(d0tVar);
            String strC2 = qzb.c0(d0tVar);
            ows0 ows0VarM3 = bww.M(bww.I(d0tVar), kpb.D(d0tVar), strC2);
            String strR2 = qzb.r0(d0tVar);
            return new xfa(j3, zgaVar, new uga(g0nVar2, strE3, kpmVarL3, ows0VarM3, bww.M(bww.J(d0tVar), kpb.U(d0tVar), strR2)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 3) {
            long j4 = d0tVar.f5282a;
            String strA4 = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
            String string4 = y78.n(y78Var, d0tVar, false, z3, 4).toString();
            u3i u3iVarQ3 = zvw.Q(d0tVar, z);
            yga ygaVar = new yga(strA4, string4, zvw.P(d0tVar, z, z2), zvw.T(d0tVar, z), u3iVarQ3);
            if (!kpb.e0(d0tVar)) {
                g0nVarN = bww.N(d0tVar, ctf0Var);
            }
            g0n g0nVar3 = g0nVarN;
            String strE4 = xvw.E(d0tVar);
            y1m y1mVarG = bww.G(d0tVar);
            String strC3 = qzb.c0(d0tVar);
            ows0 ows0VarM4 = bww.M(bww.I(d0tVar), kpb.D(d0tVar), strC3);
            String strR3 = qzb.r0(d0tVar);
            return new wfa(j4, ygaVar, new tga(g0nVar3, strE4, y1mVarG, ows0VarM4, bww.M(bww.J(d0tVar), kpb.U(d0tVar), strR3)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal != 4) {
            t9f.b();
            return null;
        }
        long j5 = d0tVar.f5282a;
        String strA5 = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
        u3i u3iVarQ4 = zvw.Q(d0tVar, z);
        xga xgaVar = new xga(zvw.P(d0tVar, z, z2), zvw.T(d0tVar, z), u3iVarQ4, strA5);
        if (!kpb.e0(d0tVar)) {
            g0nVarN = bww.N(d0tVar, ctf0Var);
        }
        g0n g0nVar4 = g0nVarN;
        String strE5 = xvw.E(d0tVar);
        String string5 = y78.n(y78Var, d0tVar, false, z3, 4).toString();
        y1m y1mVarG2 = bww.G(d0tVar);
        String strC4 = qzb.c0(d0tVar);
        ows0 ows0VarM5 = bww.M(bww.I(d0tVar), kpb.D(d0tVar), strC4);
        String strR4 = qzb.r0(d0tVar);
        return new vfa(j5, xgaVar, new sga(g0nVar4, strE5, string5, y1mVarG2, ows0VarM5, bww.M(bww.J(d0tVar), kpb.U(d0tVar), strR4)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
    }

    public static void S(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            checkableImageButton.setTooltipText(charSequence);
        } else if (onLongClickListener == null) {
            a4n0.l(checkableImageButton, charSequence);
        }
    }

    public static final void a(mm40 mm40Var, pz40 pz40Var, xcz xczVar, hh80 hh80Var, Function1 function1, Function1 function2, final xdr xdrVar, fet fetVar, int i) {
        int i2;
        function1.getClass();
        function2.getClass();
        xdrVar.getClass();
        fetVar.g0(-301657910);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pz40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(hh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(xdrVar) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            final long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            bww.d(mm40Var, pz40Var, false, hh80Var, xczVar, u1c.M(322487387, new zdr() { // from class: a.mgx
                @Override // a.zdr
                public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i3;
                    ygx ygxVar = (ygx) obj;
                    ((Integer) obj2).getClass();
                    mm40 mm40Var2 = (mm40) obj3;
                    fet fetVar2 = (fet) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    ygxVar.getClass();
                    mm40Var2.getClass();
                    if ((iIntValue & 6) == 0) {
                        i3 = ((iIntValue & 8) == 0 ? fetVar2.g(ygxVar) : fetVar2.i(ygxVar) ? 4 : 2) | iIntValue;
                    } else {
                        i3 = iIntValue;
                    }
                    if ((iIntValue & 384) == 0) {
                        i3 |= fetVar2.g(mm40Var2) ? 256 : 128;
                    }
                    if (fetVar2.U(i3 & 1, (i3 & 1155) != 1154)) {
                        mm40 mm40VarQ = i120.Q(mm40Var2, backgroundContent, jd8.n);
                        zcl zclVar = qmk.f28987a;
                        azw.d(s5x0.L(mm40VarQ, 8.0f, 0.0f, 2), ygxVar, xdrVar, fetVar2, (i3 << 3) & 112);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-2085897746, new kgx(backgroundContent, function1, function2, (byte) 2), fetVar), ohq0.c, fetVar, (i2 & 14) | 14352768 | (i2 & 112) | (i2 & 7168) | ((i2 << 6) & 57344));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jgx(mm40Var, pz40Var, xczVar, hh80Var, function1, function2, xdrVar, i, (byte) 3);
        }
    }

    public static final void b(fe40 fe40Var, gna0 gna0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        gna0Var.getClass();
        fetVar.g0(-1852540767);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(fe40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(gna0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(jm40.b, 0.0f, 328.0f, 1);
            ngv ngvVar = new ngv(2);
            lh80 lh80VarU = s5x0.u(qmk.a(fetVar).c, 0.0f, qmk.a(fetVar).c, 0.0f, 10);
            byte b = 14;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b));
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4(b));
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new k9v((Object) fe40Var, (Object) function1, (Object) gna0Var, (byte) 19);
                fetVar.o0(objP);
            }
            g8x.i(ngvVar, mm40VarG, null, lh80VarU, qw3Var2, qw3Var, null, false, null, (Function1) objP, fetVar, 0, 916);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) fe40Var, (Object) gna0Var, (Object) function1, i, (byte) 0);
        }
    }

    public static final void c(ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(441837433);
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new j810();
                fetVar.o0(objP);
            }
            j810 j810Var = (j810) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new t010((byte) 21);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            p610 p610Var = new p610((byte) 5);
            if (fetVar.S) {
                fetVar.b(Unit.f46060a, new ru80(p610Var, (byte) 23));
            }
            jpm0.o(fetVar, j810Var, new kyz((byte) 22));
            ugdVar.F(j810Var, fetVar, 48);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w(ugdVar, i, (byte) 17);
        }
    }

    public static final void d(mm40 mm40Var, eao eaoVar, a4x a4xVar, xdr xdrVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        a4xVar.getClass();
        xdrVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(1834927825);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(eaoVar) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128) | (fetVar.i(xdrVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            zcl zclVar = qmk.f28987a;
            int i3 = (i2 & 112) | 12582912 | (i2 & 896);
            int i4 = i2 << 3;
            fww.e(s5x0.L(mm40Var, 8.0f, 0.0f, 2), eaoVar, a4xVar, new qw3(6.0f, true, new jf4((byte) 14)), xdrVar, function1, function2, wb.h, fetVar, i3 | (57344 & i4) | (458752 & i4) | (i4 & 3670016));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yt20(mm40Var, eaoVar, a4xVar, xdrVar, function1, function2, i, (byte) 1);
        }
    }

    public static final void e(gf50 gf50Var, boolean z, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1220469155);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(gf50Var) ? 4 : 2) | i;
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
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new ec40((byte) 26);
                fetVar.o0(objP);
            }
            Function0 function2 = (Function0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new ec40((byte) 28);
                fetVar.o0(objP2);
            }
            int i3 = (i2 & 14) | 3504;
            int i4 = i2 << 9;
            f(gf50Var, false, function2, (Function0) objP2, z, function0, function1, fetVar, (i4 & 3670016) | i3 | (57344 & i4) | (458752 & i4));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040((Object) gf50Var, z, (Object) function0, function1, i, (byte) 3);
        }
    }

    public static final void f(final gf50 gf50Var, final boolean z, Function0 function0, Function0 function1, boolean z2, Function0 function2, final Function0 function3, fet fetVar, int i) {
        int i2;
        Function0 function4;
        Function0 function5;
        boolean z3;
        Function0 function6;
        fetVar.g0(898330592);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(gf50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function4 = function0;
            i2 |= fetVar.i(function4) ? 256 : 128;
        } else {
            function4 = function0;
        }
        if ((i & 3072) == 0) {
            function5 = function1;
            i2 |= fetVar.i(function5) ? 2048 : 1024;
        } else {
            function5 = function1;
        }
        if ((i & 24576) == 0) {
            z3 = z2;
            i2 |= fetVar.h(z3) ? 16384 : 8192;
        } else {
            z3 = z2;
        }
        if ((196608 & i) == 0) {
            function6 = function2;
            i2 |= fetVar.i(function6) ? 131072 : 65536;
        } else {
            function6 = function2;
        }
        if ((i & 1572864) == 0) {
            i2 |= fetVar.i(function3) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (i2 & 599187) != 599186)) {
            ze50 ze50VarA = qr00.a(fetVar);
            if (ze50VarA == null) {
                jf4.n("No NavigationEventDispatcher was provided via LocalNavigationEventDispatcherOwner");
                return;
            }
            Object objB = ze50VarA.b();
            int i3 = i2 & 14;
            boolean z4 = i3 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new yjd((df50) ((hgk0) gf50Var.c).getValue(), new b530(gf50Var, b));
                fetVar.o0(objP);
            }
            final yjd yjdVar = (yjd) objP;
            boolean zI = ((i2 & 3670016) == 1048576) | fetVar.i(yjdVar) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | (i3 == 4);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                final boolean z5 = z3;
                final Function0 function7 = function4;
                final Function0 function8 = function5;
                final Function0 function9 = function6;
                Object obj = new Function0() { // from class: a.bf50
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ff50 ff50Var;
                        ff50 ff50Var2;
                        yjd yjdVar2 = yjdVar;
                        boolean z6 = yjdVar2.f;
                        boolean z7 = z;
                        if (z6 != z7) {
                            yjdVar2.f = z7;
                            ye50 ye50Var = yjdVar2.g;
                            if (ye50Var != null && (ff50Var2 = ye50Var.e) != null) {
                                ff50Var2.b();
                            }
                        }
                        yjdVar2.i = function7;
                        yjdVar2.j = function8;
                        yjdVar2.i(z5);
                        yjdVar2.k = function9;
                        yjdVar2.l = function3;
                        gf50 gf50Var2 = gf50Var;
                        df50 df50Var = (df50) ((hgk0) gf50Var2.c).getValue();
                        List list = (List) ((hgk0) gf50Var2.b).getValue();
                        List list2 = (List) ((hgk0) gf50Var2.d).getValue();
                        df50Var.getClass();
                        list.getClass();
                        list2.getClass();
                        yjdVar2.f762a = df50Var;
                        yjdVar2.b = list;
                        yjdVar2.c = list2;
                        ye50 ye50Var2 = yjdVar2.g;
                        if (ye50Var2 != null && (ff50Var = ye50Var2.e) != null) {
                            ff50Var.d(yjdVar2);
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(obj);
                objP2 = obj;
            }
            m0x0.D((Function0) objP2, fetVar);
            boolean zI2 = (i3 == 4) | fetVar.i(yjdVar) | fetVar.i(objB);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new jl40((Object) gf50Var, (Object) yjdVar, objB, (byte) 3);
                fetVar.o0(objP3);
            }
            m0x0.o(gf50Var, (Function1) objP3, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vwl(gf50Var, z, function0, function1, z2, function2, function3, i);
        }
    }

    public static final void g(mm40 mm40Var, nc90 nc90Var, fet fetVar, int i) {
        mm40 mm40Var2;
        nc90 nc90Var2;
        fet fetVar2;
        nc90Var.getClass();
        fetVar.g0(-878047844);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(nc90Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new ev80((byte) 20);
                fetVar.o0(objP);
            }
            mm40Var2 = mm40Var;
            nc90Var2 = nc90Var;
            fetVar2 = fetVar;
            ay3.f(nc90Var2, mm40Var2, (Function1) objP, null, null, null, i120.d, fetVar2, ((i2 >> 3) & 14) | 1573248 | ((i2 << 3) & 112), 56);
        } else {
            mm40Var2 = mm40Var;
            nc90Var2 = nc90Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(mm40Var2, nc90Var2, i, (byte) 12);
        }
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(-1384446651);
        byte b = 2;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.d(jm40Var, 1.0f).e(mm40Var);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = mu90.c;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(-787157490);
            int iB = 0;
            while (iB < 3) {
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE2 = o7k0.e(jm40Var, 56.0f);
                zcl zclVar2 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                iB = h97.b(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE2), vbc.d0(null, fetVar, 0, 1), fetVar, 0, iB, 1);
            }
            fetVar2 = fetVar;
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i, b);
        }
    }

    public static final void i(mm40 mm40Var, ifa0 ifa0Var, x0a0 x0a0Var, boolean z, fet fetVar, int i) {
        boolean z2;
        boolean zD;
        int i2;
        ifa0Var.getClass();
        x0a0Var.getClass();
        fetVar.g0(-2333096);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= fetVar.g(ifa0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? fetVar.g(x0a0Var) : fetVar.i(x0a0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                int i4 = i3 & (-7169);
                zD = pkd.d(fetVar);
                mm40Var = jm40.b;
                i2 = i4;
            } else {
                fetVar.X();
                i2 = i3 & (-7169);
                zD = z;
            }
            fetVar.s();
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.L(i120.Q(mm40VarD, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 0.0f, 8.0f, 1), "PLAYERS_COMPOSITION_TEAMS_TEST_TAG");
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
            vvw.g(ifa0Var.b, zD, fetVar, 6);
            int i5 = (i2 & 896) | 6;
            bww.k(ifa0Var.d, x0a0Var, fetVar, i5);
            gfx.k(null, ifa0Var.f, zD, fetVar, 0);
            vvw.g(ifa0Var.c, zD, fetVar, 6);
            bww.k(ifa0Var.e, x0a0Var, fetVar, i5);
            fetVar.r(true);
            z2 = zD;
        } else {
            fetVar.X();
            z2 = z;
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040(mm40Var2, ifa0Var, x0a0Var, z2, i);
        }
    }

    public static final void j(mm40 mm40Var, lob0 lob0Var, fet fetVar, int i) {
        fet fetVar2;
        lob0Var.getClass();
        fetVar.g0(995299620);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(lob0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int i3 = fetVar.k(bmd.n) == k6z.b ? 2 : 1;
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = mu90.d;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            v8q0.a(lob0Var.f20384a, o7k0.d(jm40Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(g1t0.n(), fetVar), fetVar, 48, 0, 131068);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            zcl zclVar = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            v8q0.a(lob0Var.b, s5x0.K(i120.Q(mm40VarD, background, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f, 12.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(ibm0.n(g1t0.g(), fetVar), 0L, 0L, null, null, null, 0L, null, null, i3, 1, 0L, null, null, 16678911), fetVar, 0, 0, 131068);
            v8q0.a(lob0Var.c, s5x0.K(i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zfnVar)).getBackground(), new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f, 12.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(ibm0.t(g1t0.d(), fetVar), 0L, 0L, null, null, null, 0L, null, null, i3, 1, 0L, null, null, 16678911), fetVar, 0, 0, 131068);
            j0x.b(a8k0.F(R.drawable.ic_powerbet_arrow_down_circle, 0, fetVar), null, s5x0.J(i120.Q(o7k0.n(jm40Var, 20.0f), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), vgg0.f37379a), 2.0f), null, null, 0.0f, null, fetVar, 56, 120);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(mm40Var, lob0Var, i, (byte) 13);
        }
    }

    public static final void k(mm40 mm40Var, xdr xdrVar, ugd ugdVar, xdr xdrVar2, fet fetVar, int i, int i2) {
        int i3;
        xdr xdrVar3;
        fetVar.g0(-1178167353);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= fetVar.i(xdrVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= fetVar.i(xdrVar2) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                xdrVar = null;
            }
            xdr xdrVar4 = i5 != 0 ? null : xdrVar2;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zhg0 zhg0Var = zhg0.f44392a;
            if (xdrVar == null) {
                fetVar.e0(-658212942);
            } else {
                fetVar.e0(-1545253329);
                xdrVar.F(zhg0Var, fetVar, Integer.valueOf((i3 & 112) | 6));
            }
            fetVar.r(false);
            ugdVar.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 3) & 112) | 6));
            if (xdrVar4 == null) {
                fetVar.e0(-658145486);
            } else {
                fetVar.e0(-1545251153);
                xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(((i3 >> 6) & 112) | 6));
            }
            fetVar.r(false);
            fetVar.r(true);
            xdrVar3 = xdrVar4;
        } else {
            fetVar.X();
            xdrVar3 = xdrVar2;
        }
        xdr xdrVar5 = xdrVar;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g13(mm40Var, xdrVar5, ugdVar, xdrVar3, i, i2);
        }
    }

    public static final void l(mm40 mm40Var, uzh0 uzh0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        uzh0Var.getClass();
        fetVar.g0(-88045756);
        int i2 = i | 6 | (fetVar.g(uzh0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            tlb.o(s5x0.N(mm40Var2, 8.0f, 0.0f, 8.0f, 4.0f, 2), new h5n(new i5n(), uzh0Var.f36535a, null, null, null, 252), null, fetVar, 0, 4);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) mm40Var2, (Object) uzh0Var, i, (byte) 3);
        }
    }

    public static final void m(mm40 mm40Var, faj fajVar, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(810613325);
        int i2 = i | (fetVar.g(fajVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            b34.h(fajVar != null, mm40Var, kzn.d(null, 0.0f, 3), kzn.e(null, 3), null, u1c.M(613420837, new in80(fajVar, function1, (byte) 25), fetVar), fetVar, 200112, 16);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(mm40Var, (Object) fajVar, function1, i, (byte) 19);
        }
    }

    public static final void n(mm40 mm40Var, ugd ugdVar, xdr xdrVar, xdr xdrVar2, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        int i2;
        xdr xdrVar3;
        ugd ugdVar4;
        float f;
        Integer num;
        boolean z;
        xdr xdrVar4 = xdrVar2;
        ugd ugdVar5 = ugdVar3;
        fetVar.g0(1768277829);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(xdrVar4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(ugdVar5) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                zcl zclVar = qmk.f28987a;
                objP = twn.j(2.0f, fetVar);
            }
            float f2 = ((ycl) objP).f42389a;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                zcl zclVar2 = qmk.f28987a;
                objP2 = twn.j(4.0f, fetVar);
            }
            float f3 = ((ycl) objP2).f42389a;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                zcl zclVar3 = qmk.f28987a;
                objP3 = twn.j(12.0f, fetVar);
            }
            float f4 = ((ycl) objP3).f42389a;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                zcl zclVar4 = qmk.f28987a;
                objP4 = twn.j(28.0f, fetVar);
            }
            float f5 = ((ycl) objP4).f42389a;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = gqw0.n;
                fetVar.o0(objP5);
            }
            xx7 xx7Var = (xx7) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == obj) {
                objP6 = new qw3(f3, true, new jf4((byte) 14));
                fetVar.o0(objP6);
            }
            pw3 pw3Var = (pw3) objP6;
            pz40 pz40VarZ = v3c.Z(null, new Object[0], fetVar);
            zcl zclVar5 = qmk.f28987a;
            pz40 pz40VarZ2 = v3c.Z(new ycl(96.0f), new Object[0], fetVar);
            Object[] objArr = new Object[0];
            Object objP7 = fetVar.P();
            if (objP7 == obj) {
                objP7 = new ttl0(f2, f5, (byte) 1);
                fetVar.o0(objP7);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP7, fetVar);
            boolean zG = fetVar.g(pz40VarZ) | fetVar.g(pz40VarZ2);
            Object objP8 = fetVar.P();
            if (zG || objP8 == obj) {
                objP8 = new wtl0(f4, pz40VarZ, pz40VarZ2, (byte) 0);
                fetVar.o0(objP8);
            }
            tj30 tj30Var = (tj30) objP8;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z2) {
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
            mm40 mm40VarS = o7k0.s(mrv.k0(jm40Var, "INNING_CONTENT_ID"), f4);
            x5d x5dVarA = w5d.a(pw3Var, xx7Var, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            y5d y5dVar = y5d.f42040a;
            vqd.t(6 | (i2 & 112), ugdVar, y5dVar, fetVar, true);
            if (xdrVar2 == null) {
                fetVar.e0(-1976415239);
                z = false;
                fetVar.r(false);
                xdrVar4 = xdrVar2;
                f = f2;
                num = 6;
            } else {
                fetVar.e0(-1976415238);
                f = f2;
                mm40 mm40VarS2 = o7k0.s(s5x0.L(mrv.k0(jm40Var, "POINTS_CONTENT_ID"), f, 0.0f, 2), f5);
                x5d x5dVarA2 = w5d.a(pw3Var, xx7Var, fetVar, 54);
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
                xdrVar4 = xdrVar2;
                num = 6;
                xdrVar4.F(y5dVar, fetVar, 6);
                fetVar.r(true);
                z = false;
                fetVar.r(false);
            }
            if (xdrVar == null) {
                fetVar.e0(-1975932197);
                fetVar.r(z);
                xdrVar3 = xdrVar;
            } else {
                fetVar.e0(-1975932196);
                mm40 mm40VarS3 = o7k0.s(s5x0.L(mrv.k0(jm40Var, "GAME_CONTENT_ID"), f, 0.0f, 2), f5);
                x5d x5dVarA3 = w5d.a(pw3Var, xx7Var, fetVar, 54);
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
                xdrVar3 = xdrVar;
                xdrVar3.F(y5dVar, fetVar, num);
                fetVar.r(true);
                fetVar.r(false);
            }
            ugdVar4 = ugdVar2;
            ugdVar4.F(mrv.k0(jm40Var, "PERIOD_CONTENT_ID"), fetVar, Integer.valueOf(((i2 >> 9) & 112) | 6));
            mm40 mm40Var2 = (mm40) l7m0VarY.getValue();
            x5d x5dVarA4 = w5d.a(pw3Var, xx7Var, fetVar, 54);
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
            ugdVar5 = ugdVar3;
            vqd.t(6 | ((i2 >> 12) & 112), ugdVar5, y5dVar, fetVar, true);
            fetVar.r(true);
        } else {
            xdrVar3 = xdrVar;
            ugdVar4 = ugdVar2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new utl0(mm40Var, ugdVar, xdrVar3, xdrVar4, ugdVar4, ugdVar5, i, (byte) 1);
        }
    }

    public static void o(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final mm40 p(fet fetVar, mm40 mm40Var) {
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
            objP3 = new nm40(vneVar, d39Var, (byte) 2);
            fetVar.o0(objP3);
        }
        return mm40Var.e(o050.T(mm40VarB, (Function1) objP3));
    }

    public static hpd0 q(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrD = D(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrD2 = D(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        l8x.U("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        l8x.U("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z);
        l8x.U("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrD));
        l8x.U("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrD2));
        return new hpd0(z, new HashSet(I(strArrD)), new HashSet(I(strArrD2)));
    }

    public static ImageView.ScaleType r(int i) {
        if (i == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i != 5) {
            return i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:80:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0145  */
    /* JADX WARN: Code duplicated, block: B:82:0x0149  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final y78 s(v2 v2Var, g5 g5Var, int i, hys0 hys0Var, boolean z) {
        sgy sgyVarA;
        Boolean bool;
        y78 y78Var;
        byte b;
        g5 g5Var2 = g5Var;
        hys0 hys0Var2 = hys0.c;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        Object obj = null;
        if (!(hys0Var != hys0Var2) && v2Var.M().isEmpty()) {
            return new y78(obj, (int) (z6 ? 1 : 0), (byte) (z5 ? 1 : 0));
        }
        fhy fhyVarJ = v2Var.j();
        if (fhyVarJ == null && (fhyVarJ = v2Var.o()) == null) {
            return new y78(obj, (int) (z4 ? 1 : 0), (byte) (z3 ? 1 : 0));
        }
        iay iayVar = (iay) g5Var2.invoke(Integer.valueOf(i));
        if (hys0Var == hys0Var2 || !(fhyVarJ instanceof sgy)) {
            sgyVarA = null;
        } else {
            wx40 wx40Var = iayVar.b;
            if (wx40Var == wx40.f39914a && hys0Var == hys0.f13875a && (fhyVarJ instanceof yx40)) {
                sgyVarA = ((yx40) fhyVarJ).w();
            } else if (wx40Var == wx40.b && hys0Var == hys0.b && !(fhyVarJ instanceof yx40)) {
                sgyVarA = md9.a((sgy) fhyVarJ);
            } else {
                sgyVarA = null;
            }
        }
        if (hys0Var == hys0Var2) {
            bool = null;
        } else {
            p860 p860Var = iayVar.f14460a;
            int i2 = p860Var == null ? -1 : ore0.f25732a[p860Var.ordinal()];
            if (i2 == 1) {
                bool = Boolean.TRUE;
            } else if (i2 != 2) {
                bool = null;
            } else {
                bool = Boolean.FALSE;
            }
        }
        fhy fhyVar = sgyVarA == null ? fhyVarJ : sgyVarA;
        int i3 = i + 1;
        List<KTypeProjection> listM = v2Var.M();
        ArrayList arrayList = new ArrayList(r3d.q(listM, 10));
        for (KTypeProjection kTypeProjection : listM) {
            piy piyVar = KTypeProjection.c;
            piyVar.getClass();
            KTypeProjection kTypeProjection2 = KTypeProjection.d;
            if (!Intrinsics.d(kTypeProjection, kTypeProjection2)) {
                kiy kiyVar = kTypeProjection.b;
                kiyVar.getClass();
                y78Var = t((v2) kiyVar, g5Var2, i3);
            } else if (((iay) g5Var2.invoke(Integer.valueOf(i3))).f14460a == p860.f26540a) {
                kiy kiyVar2 = kTypeProjection.b;
                kiyVar2.getClass();
                v2 v2Var2 = (v2) kiyVar2;
                v2 v2VarZ = v2Var2.z();
                v2 v2VarB = (v2VarZ == null ? v2Var : v2VarZ).B(false);
                v2 v2VarC = v2Var2.C();
                v2 v2Var3 = v2VarC;
                if (v2VarC == null) {
                    v2Var3 = v2Var;
                }
                v2 v2VarB2 = v2Var3.B(z2);
                v2VarB.getClass();
                v2VarB2.getClass();
                if (v2VarB.equals(v2VarB2)) {
                    b = z2;
                } else {
                    v2VarB = new jkq(v2VarB, v2VarB2, false, null);
                    b = 1;
                }
                y78Var = new y78(v2VarB, b, b);
            } else {
                y78Var = new y78(obj, z2 ? 1 : 0, z2 ? (byte) 1 : (byte) 0);
            }
            int i4 = y78Var.b;
            v2 v2Var4 = (v2) y78Var.c;
            i3 += i4;
            if (v2Var4 != null) {
                kTypeProjection2 = new KTypeProjection(v2Var4, kTypeProjection.f46069a);
            } else if (sgyVarA != null) {
                piyVar.getClass();
                if (!Intrinsics.d(kTypeProjection, kTypeProjection2)) {
                    kTypeProjection2 = new KTypeProjection(kTypeProjection.b, kTypeProjection.f46069a);
                } else if (sgyVarA != null) {
                    piyVar.getClass();
                } else {
                    kTypeProjection2 = null;
                }
            } else if (sgyVarA != null) {
                piyVar.getClass();
            } else {
                kTypeProjection2 = null;
            }
            arrayList.add(kTypeProjection2);
            g5Var2 = g5Var;
            z2 = true;
            obj = null;
        }
        int i5 = i3 - i;
        if (sgyVarA == null && bool == null) {
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (((KTypeProjection) it.next()) == null);
            }
            return new y78((Object) null, i5, (byte) 1);
        }
        List listM2 = v2Var.M();
        Iterator it2 = arrayList.iterator();
        Iterator it3 = listM2.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(r3d.q(arrayList, 10), r3d.q(listM2, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            Object next = it2.next();
            KTypeProjection kTypeProjection3 = (KTypeProjection) it3.next();
            KTypeProjection kTypeProjection4 = (KTypeProjection) next;
            if (kTypeProjection4 != null) {
                kTypeProjection3 = kTypeProjection4;
            }
            arrayList2.add(kTypeProjection3);
        }
        return new y78((Object) new iyj0(fhyVar, arrayList2, bool != null ? bool.booleanValue() : v2Var.h(), v2Var.f(), v2Var.c(), v2Var.n() || iayVar.c, v2Var.p(), v2Var.u(), sgyVarA instanceof yx40 ? (yx40) sgyVarA : null, null), i5, (byte) 1);
    }

    public static final y78 t(v2 v2Var, g5 g5Var, int i) {
        v2 v2VarZ = v2Var.z();
        v2 v2VarC = v2Var.C();
        if (v2VarZ == null || v2VarC == null) {
            return s(v2Var, g5Var, i, hys0.c, false);
        }
        y78 y78VarS = s(v2VarZ, g5Var, i, hys0.f13875a, v2Var.q());
        v2 v2Var2 = (v2) s(v2VarC, g5Var, i, hys0.b, v2Var.q()).c;
        v2 v2Var3 = (v2) y78VarS.c;
        v2 jkqVar = null;
        if (v2Var3 != null || v2Var2 != null) {
            if (v2Var3 != null) {
                v2VarZ = v2Var3;
            }
            if (v2Var2 != null) {
                v2VarC = v2Var2;
            }
            jkqVar = v2VarZ.equals(v2VarC) ? v2VarZ : new jkq(v2VarZ, v2VarC, v2Var.q(), null);
        }
        return new y78((Object) jkqVar, y78VarS.b, (byte) 1);
    }

    public static final String u(va80 va80Var) {
        switch (va80Var.ordinal()) {
            case 0:
            case 1:
                return "Unknown";
            case 2:
                return "Windows";
            case 3:
                return "OS X";
            case 4:
                return "Android";
            case 5:
                return "iOS";
            case 6:
                return "BlackBerryOS";
            case 7:
                return "SymbianOS";
            case 8:
                return "WindowsMobileOS";
            case 9:
                return "WindowsPhoneOS";
            case 10:
                return "MeeGoOS";
            case 11:
                return "MaemoOS";
            case 12:
                return "JavaOS";
            case 13:
                return "webOS";
            case 14:
                return "badaOS";
            case 15:
                return "BREWOS";
            case 16:
                return "Linux";
            case 17:
                return "ChromeOS";
            default:
                t9f.b();
                return null;
        }
    }

    public static final void v(Fragment fragment, xa30 xa30Var, wdk0 wdk0Var, Function1 function1) {
        fragment.getClass();
        if (xa30Var instanceof va30) {
            function1.invoke(((va30) xa30Var).f37066a ? cms.f4622a : fms.f9800a);
            return;
        }
        if (!(xa30Var instanceof wa30)) {
            t9f.b();
            return;
        }
        qek0 qek0Var = qek0.f28589a;
        String strH = fragment.H(((wa30) xa30Var).f38810a);
        strH.getClass();
        wdk0.k(wdk0Var, new xdk0(qek0Var, strH, null, null, null, null, 124), fragment, null, null, false, null, 1020);
    }

    public static boolean w(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = s950.b;
            }
        } else {
            if (!(collection instanceof j4x)) {
                return false;
            }
            objComparator = ((j4x) collection).d;
        }
        return comparator.equals(objComparator);
    }

    public static final boolean x(float f, float f2, w03 w03Var) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        w03 w03VarA = z03.a();
        x190 x190Var = x190.f40111a;
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            z03.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = w03VarA.b;
        if (rectF == null) {
            rectF = new RectF();
            w03VarA.b = rectF;
        }
        rectF.set(f3, f4, f5, f6);
        Path path = w03VarA.f38329a;
        RectF rectF2 = w03VarA.b;
        rectF2.getClass();
        path.addRect(rectF2, z03.c(x190Var));
        w03 w03VarA2 = z03.a();
        w03VarA2.g(w03Var, w03VarA, 1);
        boolean zIsEmpty = w03VarA2.f38329a.isEmpty();
        w03VarA2.h();
        w03VarA.h();
        return !zIsEmpty;
    }

    public static final boolean y(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final void z(int i, int i2, int i3, int i4, View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        if (view.getLayoutDirection() == 0) {
            view.layout(i, i2, i3, i4);
        } else {
            view.layout(viewGroup.getMeasuredWidth() - i3, i2, viewGroup.getMeasuredWidth() - i, i4);
        }
    }
}
