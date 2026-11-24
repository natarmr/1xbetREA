package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
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
public abstract class j0x {
    public static final String A(zuc0 zuc0Var) {
        zuc0Var.getClass();
        return tx3.u(zuc0Var, new zuc0[]{zuc0.CARDS_WITH_GAMES_AND_STORE, zuc0.CARDS_WITH_GAMES}) ? "_s" : "";
    }

    public static final String B(xrt0 xrt0Var, ctf0 ctf0Var) {
        xrt0Var.getClass();
        ctf0Var.getClass();
        if (xrt0Var instanceof srt0) {
            return ctf0Var.b.a(R.string.you, Arrays.copyOf(new Object[0], 0));
        }
        if (!(xrt0Var instanceof urt0)) {
            return xrt0Var instanceof vrt0 ? ctf0Var.b.a(R.string.consultant_bot_default_name, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.consultant_operator_default_name, Arrays.copyOf(new Object[0], 0));
        }
        String string = StringsKt.u0(((urt0) xrt0Var).c).toString();
        return string.length() == 0 ? ctf0Var.b.a(R.string.consultant_operator_default_name, Arrays.copyOf(new Object[0], 0)) : string;
    }

    public static final bwj C(int i, fet fetVar, Function0 function0) {
        function0.getClass();
        Object[] objArr = {Integer.valueOf(i)};
        v0h0 v0h0Var = bwj.I;
        boolean zE = fetVar.e(i) | fetVar.d(0.0f) | fetVar.g(function0);
        Object objP = fetVar.P();
        byte b = 0;
        if (zE || objP == ukd.f35823a) {
            objP = new he10(b, i, function0);
            fetVar.o0(objP);
        }
        bwj bwjVar = (bwj) e9x.R(objArr, v0h0Var, (Function0) objP, fetVar, 0);
        ((hgk0) bwjVar.H).setValue(function0);
        return bwjVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object D(int i, long j, zje zjeVar, String str, List list, Function2 function2) {
        p1g0 p1g0Var;
        if (zjeVar instanceof p1g0) {
            p1g0Var = (p1g0) zjeVar;
            int i2 = p1g0Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p1g0Var.j = i2 - Integer.MIN_VALUE;
            } else {
                p1g0Var = new p1g0(zjeVar);
            }
        } else {
            p1g0Var = new p1g0(zjeVar);
        }
        p1g0 p1g0Var2 = p1g0Var;
        Object obj = p1g0Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = p1g0Var2.j;
        if (i3 == 0) {
            z1x.P(obj);
            p1g0Var2.j = 1;
            Object objG = G(i - 1, j, p1g0Var2, str, list, function2);
            return objG == wneVar ? wneVar : objG;
        }
        if (i3 == 1) {
            z1x.P(obj);
            return ((j0g0) obj).f15681a;
        }
        jf4.n("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object E(int i, long j, zje zjeVar, String str, List list, Function2 function2) {
        r1g0 r1g0Var;
        if (zjeVar instanceof r1g0) {
            r1g0Var = (r1g0) zjeVar;
            int i2 = r1g0Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r1g0Var.j = i2 - Integer.MIN_VALUE;
            } else {
                r1g0Var = new r1g0(zjeVar);
            }
        } else {
            r1g0Var = new r1g0(zjeVar);
        }
        r1g0 r1g0Var2 = r1g0Var;
        Object obj = r1g0Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = r1g0Var2.j;
        if (i3 == 0) {
            z1x.P(obj);
            r1g0Var2.j = 1;
            Object objF = F(function2, new kie0(), list, i, str, j, i - 1, r1g0Var2);
            return objF == wneVar ? wneVar : objF;
        }
        if (i3 == 1) {
            z1x.P(obj);
            return ((j0g0) obj).f15681a;
        }
        jf4.n("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:63:0x0105 A[LOOP:0: B:58:0x00eb->B:63:0x0105, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x010b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4, types: [byte] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [byte] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r25v1 */
    public static final Object F(Function2 function2, kie0 kie0Var, List list, int i, String str, long j, int i2, zje zjeVar) {
        s1g0 s1g0Var;
        kie0 kie0Var2;
        List list2;
        ?? r13;
        String str2;
        long j2;
        Function2 function3;
        kie0 kie0Var3;
        int i3;
        long j3;
        Iterator it;
        g0g0 g0g0Var;
        Function2 function4;
        int i4;
        ?? r10;
        kie0 kie0Var4;
        int i5;
        int i6;
        long j4;
        List list3;
        String str3;
        Object objF;
        Function2 function5 = function2;
        int i7 = i2;
        if (zjeVar instanceof s1g0) {
            s1g0Var = (s1g0) zjeVar;
            int i8 = s1g0Var.s;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                s1g0Var.s = i8 - Integer.MIN_VALUE;
            } else {
                s1g0Var = new s1g0(zjeVar);
            }
        } else {
            s1g0Var = new s1g0(zjeVar);
        }
        Object objInvoke = s1g0Var.r;
        wne wneVar = wne.f39444a;
        int i9 = s1g0Var.s;
        int i10 = 0;
        if (i9 == 0) {
            z1x.P(objInvoke);
            try {
                Integer num = new Integer(i7);
                s1g0Var.i = function5;
                kie0Var2 = kie0Var;
                try {
                    s1g0Var.j = kie0Var2;
                    list2 = list;
                    try {
                        s1g0Var.k = list2;
                        str2 = str;
                        try {
                            s1g0Var.l = str2;
                            r13 = i;
                            try {
                                s1g0Var.m = r13 == true ? (byte) 1 : (byte) 0;
                                j2 = j;
                                try {
                                    s1g0Var.q = j2;
                                    s1g0Var.n = i7;
                                    s1g0Var.s = 1;
                                    objInvoke = function5.invoke(num, s1g0Var);
                                    if (objInvoke != wneVar) {
                                        function3 = function5;
                                        kie0Var3 = kie0Var2;
                                        i3 = i7;
                                        j3 = j2;
                                        r13 = r13;
                                        kie0Var3.f18333a = 0;
                                        e0g0 e0g0Var = j0g0.b;
                                        return objInvoke;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    if (list2 == null) {
                                        it = list2.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                i10 = 0;
                                                break;
                                            }
                                            if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                                i10 = 1;
                                                break;
                                            }
                                        }
                                    } else {
                                        it = list2.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                i10 = 0;
                                                break;
                                            }
                                            if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                                i10 = 1;
                                                break;
                                            }
                                        }
                                    }
                                    if (i10 == 0) {
                                        e0g0 e0g0Var2 = j0g0.b;
                                        g0g0Var = new g0g0(e);
                                    } else {
                                        e0g0 e0g0Var3 = j0g0.b;
                                        g0g0Var = new g0g0(e);
                                    }
                                    return g0g0Var;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                j2 = j;
                                if (list2 == null) {
                                    it = list2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i10 = 0;
                                            break;
                                        }
                                        if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                            i10 = 1;
                                            break;
                                        }
                                    }
                                } else {
                                    it = list2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i10 = 0;
                                            break;
                                        }
                                        if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                            i10 = 1;
                                            break;
                                        }
                                    }
                                }
                                if (i10 == 0) {
                                    e0g0 e0g0Var4 = j0g0.b;
                                    g0g0Var = new g0g0(e);
                                } else {
                                    e0g0 e0g0Var5 = j0g0.b;
                                    g0g0Var = new g0g0(e);
                                }
                                return g0g0Var;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            r13 = i;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        r13 = i;
                        str2 = str;
                        j2 = j;
                        if (list2 == null || !list2.isEmpty()) {
                            it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    i10 = 0;
                                    break;
                                }
                                if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                    i10 = 1;
                                    break;
                                }
                            }
                        }
                        if (i10 == 0 || i7 < 1) {
                            e0g0 e0g0Var6 = j0g0.b;
                            g0g0Var = new g0g0(e);
                        } else {
                            if (agc.M(e)) {
                                e0g0 e0g0Var7 = j0g0.b;
                                return new g0g0(new el50(e));
                            }
                            if (agc.N(e)) {
                                int i11 = kie0Var2.f18333a;
                                int i12 = i11 >= r13 ? 0 : 1;
                                kie0Var2.f18333a = i11 + 1;
                                if (i12 == 0) {
                                    e0g0 e0g0Var8 = j0g0.b;
                                    return new g0g0(new dag0(e));
                                }
                                System.out.println((Object) axq.n(kng0.p(i7, "ALARM1 from ", str2, " // ", " retry remaining // delay "), wen.m(j2), " sec"));
                                s1g0Var.i = function5;
                                s1g0Var.j = kie0Var2;
                                s1g0Var.k = list2;
                                s1g0Var.l = str2;
                                s1g0Var.m = r13;
                                s1g0Var.q = j2;
                                s1g0Var.n = i7;
                                s1g0Var.o = i10;
                                s1g0Var.p = i12;
                                s1g0Var.s = 2;
                                if (qcc.P(j2, s1g0Var) != wneVar) {
                                    long j5 = j2;
                                    function4 = function5;
                                    i4 = i12;
                                    r10 = r13;
                                    kie0Var4 = kie0Var2;
                                    i5 = i7;
                                    i6 = i10;
                                    j4 = j5;
                                    String str4 = str2;
                                    list3 = list2;
                                    str3 = str4;
                                    s1g0Var.i = null;
                                    s1g0Var.j = null;
                                    s1g0Var.k = null;
                                    s1g0Var.l = null;
                                    s1g0Var.m = r10;
                                    s1g0Var.q = j4;
                                    s1g0Var.n = i5;
                                    s1g0Var.o = i6;
                                    s1g0Var.p = i4;
                                    s1g0Var.s = 3;
                                    kie0 kie0Var5 = kie0Var4;
                                    Function2 function6 = function4;
                                    objF = F(function6, kie0Var5, list3, r10 == true ? 1 : 0, str3, j4, i5 - 1, s1g0Var);
                                    if (objF == wneVar) {
                                        return objF;
                                    }
                                }
                                return wneVar;
                            }
                            if (agc.L(e)) {
                                e0g0 e0g0Var9 = j0g0.b;
                                g0g0Var = new g0g0(e);
                            } else {
                                e0g0 e0g0Var10 = j0g0.b;
                                g0g0Var = new g0g0(e);
                            }
                        }
                        return g0g0Var;
                    }
                } catch (Exception e5) {
                    e = e5;
                    list2 = list;
                    r13 = i;
                    str2 = str;
                    j2 = j;
                    if (list2 == null) {
                        it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i10 = 0;
                                break;
                            }
                            if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                i10 = 1;
                                break;
                            }
                        }
                    } else {
                        it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i10 = 0;
                                break;
                            }
                            if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                i10 = 1;
                                break;
                            }
                        }
                    }
                    if (i10 == 0) {
                        e0g0 e0g0Var11 = j0g0.b;
                        g0g0Var = new g0g0(e);
                    } else {
                        e0g0 e0g0Var12 = j0g0.b;
                        g0g0Var = new g0g0(e);
                    }
                    return g0g0Var;
                }
            } catch (Exception e6) {
                e = e6;
                kie0Var2 = kie0Var;
            }
        } else {
            if (i9 == 1) {
                int i13 = s1g0Var.n;
                long j6 = s1g0Var.q;
                byte b = s1g0Var.m;
                String str5 = s1g0Var.l;
                List list4 = s1g0Var.k;
                kie0Var3 = s1g0Var.j;
                function3 = s1g0Var.i;
                try {
                    z1x.P(objInvoke);
                    i3 = i13;
                    r13 = b;
                    j3 = j6;
                    list2 = list4;
                    str2 = str5;
                    try {
                        kie0Var3.f18333a = 0;
                        e0g0 e0g0Var13 = j0g0.b;
                        return objInvoke;
                    } catch (Exception e7) {
                        e = e7;
                        long j7 = j3;
                        i7 = i3;
                        kie0Var2 = kie0Var3;
                        function5 = function3;
                        j2 = j7;
                        if (list2 == null) {
                            it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    i10 = 0;
                                    break;
                                }
                                if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                    i10 = 1;
                                    break;
                                }
                            }
                        } else {
                            it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    i10 = 0;
                                    break;
                                }
                                if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                    i10 = 1;
                                    break;
                                }
                            }
                        }
                        if (i10 == 0) {
                            e0g0 e0g0Var14 = j0g0.b;
                            g0g0Var = new g0g0(e);
                        } else {
                            e0g0 e0g0Var15 = j0g0.b;
                            g0g0Var = new g0g0(e);
                        }
                        return g0g0Var;
                    }
                } catch (Exception e8) {
                    e = e8;
                    i7 = i13;
                    function5 = function3;
                    r13 = b;
                    str2 = str5;
                    list2 = list4;
                    kie0Var2 = kie0Var3;
                    j2 = j6;
                    if (list2 == null) {
                        it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i10 = 0;
                                break;
                            }
                            if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                i10 = 1;
                                break;
                            }
                        }
                    } else {
                        it = list2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                i10 = 0;
                                break;
                            }
                            if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                i10 = 1;
                                break;
                            }
                        }
                    }
                    if (i10 == 0) {
                        e0g0 e0g0Var16 = j0g0.b;
                        g0g0Var = new g0g0(e);
                    } else {
                        e0g0 e0g0Var17 = j0g0.b;
                        g0g0Var = new g0g0(e);
                    }
                    return g0g0Var;
                }
            }
            if (i9 != 2) {
                if (i9 == 3) {
                    z1x.P(objInvoke);
                    return ((j0g0) objInvoke).f15681a;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = s1g0Var.p;
            i6 = s1g0Var.o;
            i5 = s1g0Var.n;
            j4 = s1g0Var.q;
            byte b2 = s1g0Var.m;
            str3 = s1g0Var.l;
            list3 = s1g0Var.k;
            kie0Var4 = s1g0Var.j;
            function4 = s1g0Var.i;
            z1x.P(objInvoke);
            r10 = b2;
            s1g0Var.i = null;
            s1g0Var.j = null;
            s1g0Var.k = null;
            s1g0Var.l = null;
            s1g0Var.m = r10;
            s1g0Var.q = j4;
            s1g0Var.n = i5;
            s1g0Var.o = i6;
            s1g0Var.p = i4;
            s1g0Var.s = 3;
            kie0 kie0Var6 = kie0Var4;
            Function2 function7 = function4;
            objF = F(function7, kie0Var6, list3, r10 == true ? 1 : 0, str3, j4, i5 - 1, s1g0Var);
            if (objF == wneVar) {
                return objF;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object G(int i, long j, zje zjeVar, String str, List list, Function2 function2) {
        q1g0 q1g0Var;
        if (zjeVar instanceof q1g0) {
            q1g0Var = (q1g0) zjeVar;
            int i2 = q1g0Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q1g0Var.o = i2 - Integer.MIN_VALUE;
            } else {
                q1g0Var = new q1g0(zjeVar);
            }
        } else {
            q1g0Var = new q1g0(zjeVar);
        }
        q1g0 q1g0Var2 = q1g0Var;
        Object objInvoke = q1g0Var2.n;
        wne wneVar = wne.f39444a;
        int i3 = q1g0Var2.o;
        try {
            if (i3 == 0) {
                z1x.P(objInvoke);
                e0g0 e0g0Var = j0g0.b;
                Integer num = new Integer(i);
                q1g0Var2.i = function2;
                q1g0Var2.j = list;
                q1g0Var2.k = str;
                q1g0Var2.l = j;
                q1g0Var2.m = i;
                q1g0Var2.o = 1;
                objInvoke = function2.invoke(num, q1g0Var2);
                if (objInvoke == wneVar) {
                }
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            z1x.P(objInvoke);
                            return ((j0g0) objInvoke).f15681a;
                        }
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = q1g0Var2.m;
                    j = q1g0Var2.l;
                    str = q1g0Var2.k;
                    list = q1g0Var2.j;
                    function2 = q1g0Var2.i;
                    z1x.P(objInvoke);
                    int i4 = i;
                    q1g0Var2.i = null;
                    q1g0Var2.j = null;
                    q1g0Var2.k = null;
                    q1g0Var2.l = j;
                    q1g0Var2.m = i4;
                    q1g0Var2.o = 3;
                    Object objG = G(i4 - 1, j, q1g0Var2, str, list, function2);
                    return objG == wneVar ? wneVar : objG;
                }
                int i5 = q1g0Var2.m;
                j = q1g0Var2.l;
                str = q1g0Var2.k;
                list = q1g0Var2.j;
                function2 = q1g0Var2.i;
                z1x.P(objInvoke);
            }
            e0g0 e0g0Var2 = j0g0.b;
            return objInvoke;
        } catch (Exception e) {
            if (list != null && list.isEmpty()) {
                if (i >= 1) {
                    System.out.println((Object) axq.n(kng0.p(i, "ALARM1 from ", str, " // ", " retry remaining // delay "), wen.m(j), " sec"));
                    q1g0Var2.i = function2;
                    q1g0Var2.j = list;
                    q1g0Var2.k = str;
                    q1g0Var2.l = j;
                    q1g0Var2.m = i;
                    q1g0Var2.o = 2;
                    if (qcc.P(j, q1g0Var2) != wneVar) {
                    }
                }
                e0g0 e0g0Var3 = j0g0.b;
                return new g0g0(e);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                    e0g0 e0g0Var4 = j0g0.b;
                    return new g0g0(e);
                }
            }
            if (i >= 1) {
                System.out.println((Object) axq.n(kng0.p(i, "ALARM1 from ", str, " // ", " retry remaining // delay "), wen.m(j), " sec"));
                q1g0Var2.i = function2;
                q1g0Var2.j = list;
                q1g0Var2.k = str;
                q1g0Var2.l = j;
                q1g0Var2.m = i;
                q1g0Var2.o = 2;
                if (qcc.P(j, q1g0Var2) != wneVar) {
                }
            }
            e0g0 e0g0Var5 = j0g0.b;
            return new g0g0(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x0111  */
    /* JADX WARN: Code duplicated, block: B:64:0x0115  */
    /* JADX WARN: Code duplicated, block: B:66:0x0118  */
    /* JADX WARN: Code duplicated, block: B:67:0x011c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[LOOP:0: B:52:0x00b0->B:86:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static final Object H(String str, long j, long j2, List list, Function1 function1, zje zjeVar) {
        t1g0 t1g0Var;
        String str2;
        long j3;
        long j4;
        List list2;
        Iterator it;
        long j5;
        long j6;
        String str3;
        Function1 function2;
        Exception exc;
        long j7;
        long j8;
        Object objI;
        Function1 function3 = function1;
        if (zjeVar instanceof t1g0) {
            t1g0Var = (t1g0) zjeVar;
            int i = t1g0Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                t1g0Var.p = i - Integer.MIN_VALUE;
            } else {
                t1g0Var = new t1g0(zjeVar);
            }
        } else {
            t1g0Var = new t1g0(zjeVar);
        }
        Object objInvoke = t1g0Var.o;
        wne wneVar = wne.f39444a;
        int i2 = t1g0Var.p;
        if (i2 == 0) {
            z1x.P(objInvoke);
            try {
                e0g0 e0g0Var = j0g0.b;
                str2 = str;
                try {
                    t1g0Var.i = str2;
                    list2 = list;
                    try {
                        t1g0Var.j = list2;
                        t1g0Var.k = function3;
                        j3 = j;
                        try {
                            t1g0Var.m = j3;
                            j4 = j2;
                            try {
                                t1g0Var.n = j4;
                                t1g0Var.p = 1;
                                objInvoke = function3.invoke(t1g0Var);
                                if (objInvoke == wneVar) {
                                }
                                e0g0 e0g0Var2 = j0g0.b;
                                return objInvoke;
                            } catch (Exception e) {
                                e = e;
                                if (list2 != null) {
                                    it = list2.iterator();
                                    while (it.hasNext()) {
                                        if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                            e0g0 e0g0Var3 = j0g0.b;
                                            return new g0g0(e);
                                        }
                                    }
                                } else {
                                    it = list2.iterator();
                                    while (it.hasNext()) {
                                        if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                            e0g0 e0g0Var4 = j0g0.b;
                                            return new g0g0(e);
                                        }
                                    }
                                }
                                t1g0Var.i = str2;
                                t1g0Var.j = null;
                                t1g0Var.k = function3;
                                t1g0Var.l = e;
                                t1g0Var.m = j3;
                                t1g0Var.n = j4;
                                t1g0Var.p = 2;
                                if (qcc.O(1000 * j4, t1g0Var) != wneVar) {
                                    j5 = j3;
                                    j6 = j4;
                                    str3 = str2;
                                    function2 = function3;
                                    exc = e;
                                    String localizedMessage = exc.getLocalizedMessage();
                                    StringBuilder sbO = f140.o(j5, "ALARM1 from ", str3, " // ");
                                    kng0.A(sbO, " retry remaining // delay ", j6, " sec // failure ");
                                    sbO.append(localizedMessage);
                                    System.out.println((Object) sbO.toString());
                                    if (j5 > 1) {
                                        j7 = 2 * j6;
                                    } else {
                                        j7 = j6;
                                    }
                                    if (j5 > 1) {
                                        j8 = (-1) + j5;
                                    } else {
                                        j8 = j5;
                                    }
                                    t1g0Var.i = null;
                                    t1g0Var.j = null;
                                    t1g0Var.k = null;
                                    t1g0Var.l = null;
                                    t1g0Var.m = j5;
                                    t1g0Var.n = j6;
                                    t1g0Var.p = 3;
                                    String str4 = str3;
                                    long j9 = j7;
                                    objI = I(str4, j8, j9, function2, t1g0Var, 8);
                                    if (objI != wneVar) {
                                        return objI;
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            j4 = j2;
                            if (list2 != null) {
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                        e0g0 e0g0Var5 = j0g0.b;
                                        return new g0g0(e);
                                    }
                                }
                            } else {
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                        e0g0 e0g0Var6 = j0g0.b;
                                        return new g0g0(e);
                                    }
                                }
                            }
                            t1g0Var.i = str2;
                            t1g0Var.j = null;
                            t1g0Var.k = function3;
                            t1g0Var.l = e;
                            t1g0Var.m = j3;
                            t1g0Var.n = j4;
                            t1g0Var.p = 2;
                            if (qcc.O(1000 * j4, t1g0Var) != wneVar) {
                                j5 = j3;
                                j6 = j4;
                                str3 = str2;
                                function2 = function3;
                                exc = e;
                                String localizedMessage2 = exc.getLocalizedMessage();
                                StringBuilder sbO2 = f140.o(j5, "ALARM1 from ", str3, " // ");
                                kng0.A(sbO2, " retry remaining // delay ", j6, " sec // failure ");
                                sbO2.append(localizedMessage2);
                                System.out.println((Object) sbO2.toString());
                                if (j5 > 1) {
                                    j7 = 2 * j6;
                                } else {
                                    j7 = j6;
                                }
                                if (j5 > 1) {
                                    j8 = (-1) + j5;
                                } else {
                                    j8 = j5;
                                }
                                t1g0Var.i = null;
                                t1g0Var.j = null;
                                t1g0Var.k = null;
                                t1g0Var.l = null;
                                t1g0Var.m = j5;
                                t1g0Var.n = j6;
                                t1g0Var.p = 3;
                                String str5 = str3;
                                long j10 = j7;
                                objI = I(str5, j8, j10, function2, t1g0Var, 8);
                                if (objI != wneVar) {
                                    return objI;
                                }
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        j3 = j;
                    }
                } catch (Exception e4) {
                    e = e4;
                    j3 = j;
                    j4 = j2;
                    list2 = list;
                    if (list2 != null) {
                        it = list2.iterator();
                        while (it.hasNext()) {
                            if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                e0g0 e0g0Var7 = j0g0.b;
                                return new g0g0(e);
                            }
                        }
                    } else {
                        it = list2.iterator();
                        while (it.hasNext()) {
                            if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                e0g0 e0g0Var8 = j0g0.b;
                                return new g0g0(e);
                            }
                        }
                    }
                    t1g0Var.i = str2;
                    t1g0Var.j = null;
                    t1g0Var.k = function3;
                    t1g0Var.l = e;
                    t1g0Var.m = j3;
                    t1g0Var.n = j4;
                    t1g0Var.p = 2;
                    if (qcc.O(1000 * j4, t1g0Var) != wneVar) {
                        j5 = j3;
                        j6 = j4;
                        str3 = str2;
                        function2 = function3;
                        exc = e;
                        String localizedMessage3 = exc.getLocalizedMessage();
                        StringBuilder sbO3 = f140.o(j5, "ALARM1 from ", str3, " // ");
                        kng0.A(sbO3, " retry remaining // delay ", j6, " sec // failure ");
                        sbO3.append(localizedMessage3);
                        System.out.println((Object) sbO3.toString());
                        if (j5 > 1) {
                            j7 = 2 * j6;
                        } else {
                            j7 = j6;
                        }
                        if (j5 > 1) {
                            j8 = (-1) + j5;
                        } else {
                            j8 = j5;
                        }
                        t1g0Var.i = null;
                        t1g0Var.j = null;
                        t1g0Var.k = null;
                        t1g0Var.l = null;
                        t1g0Var.m = j5;
                        t1g0Var.n = j6;
                        t1g0Var.p = 3;
                        String str6 = str3;
                        long j11 = j7;
                        objI = I(str6, j8, j11, function2, t1g0Var, 8);
                        if (objI != wneVar) {
                            return objI;
                        }
                    }
                    return wneVar;
                }
            } catch (Exception e5) {
                e = e5;
                str2 = str;
            }
        } else {
            if (i2 == 1) {
                long j12 = t1g0Var.n;
                long j13 = t1g0Var.m;
                function3 = t1g0Var.k;
                List list3 = t1g0Var.j;
                String str7 = t1g0Var.i;
                try {
                    z1x.P(objInvoke);
                    j4 = j12;
                    j3 = j13;
                    list2 = list3;
                    str2 = str7;
                    e0g0 e0g0Var9 = j0g0.b;
                    return objInvoke;
                } catch (Exception e6) {
                    e = e6;
                    j4 = j12;
                    j3 = j13;
                    list2 = list3;
                    str2 = str7;
                    if (list2 != null || !list2.isEmpty()) {
                        it = list2.iterator();
                        while (it.hasNext()) {
                            if (((Class) it.next()).isAssignableFrom(e.getClass())) {
                                e0g0 e0g0Var10 = j0g0.b;
                                return new g0g0(e);
                            }
                        }
                    }
                    t1g0Var.i = str2;
                    t1g0Var.j = null;
                    t1g0Var.k = function3;
                    t1g0Var.l = e;
                    t1g0Var.m = j3;
                    t1g0Var.n = j4;
                    t1g0Var.p = 2;
                    if (qcc.O(1000 * j4, t1g0Var) != wneVar) {
                        j5 = j3;
                        j6 = j4;
                        str3 = str2;
                        function2 = function3;
                        exc = e;
                        String localizedMessage4 = exc.getLocalizedMessage();
                        StringBuilder sbO4 = f140.o(j5, "ALARM1 from ", str3, " // ");
                        kng0.A(sbO4, " retry remaining // delay ", j6, " sec // failure ");
                        sbO4.append(localizedMessage4);
                        System.out.println((Object) sbO4.toString());
                        if (j5 > 1) {
                            j7 = 2 * j6;
                        } else {
                            j7 = j6;
                        }
                        if (j5 > 1) {
                            j8 = (-1) + j5;
                        } else {
                            j8 = j5;
                        }
                        t1g0Var.i = null;
                        t1g0Var.j = null;
                        t1g0Var.k = null;
                        t1g0Var.l = null;
                        t1g0Var.m = j5;
                        t1g0Var.n = j6;
                        t1g0Var.p = 3;
                        String str8 = str3;
                        long j14 = j7;
                        objI = I(str8, j8, j14, function2, t1g0Var, 8);
                        if (objI != wneVar) {
                            return objI;
                        }
                    }
                    return wneVar;
                }
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    z1x.P(objInvoke);
                    return ((j0g0) objInvoke).f15681a;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j6 = t1g0Var.n;
            j5 = t1g0Var.m;
            exc = t1g0Var.l;
            function2 = t1g0Var.k;
            str3 = t1g0Var.i;
            z1x.P(objInvoke);
            String localizedMessage5 = exc.getLocalizedMessage();
            StringBuilder sbO5 = f140.o(j5, "ALARM1 from ", str3, " // ");
            kng0.A(sbO5, " retry remaining // delay ", j6, " sec // failure ");
            sbO5.append(localizedMessage5);
            System.out.println((Object) sbO5.toString());
            if (j5 > 1) {
                j7 = 2 * j6;
            } else {
                j7 = j6;
            }
            if (j5 > 1) {
                j8 = (-1) + j5;
            } else {
                j8 = j5;
            }
            t1g0Var.i = null;
            t1g0Var.j = null;
            t1g0Var.k = null;
            t1g0Var.l = null;
            t1g0Var.m = j5;
            t1g0Var.n = j6;
            t1g0Var.p = 3;
            String str9 = str3;
            long j15 = j7;
            objI = I(str9, j8, j15, function2, t1g0Var, 8);
            if (objI != wneVar) {
                return objI;
            }
        }
        return wneVar;
    }

    public static Object I(String str, long j, long j2, Function1 function1, zje zjeVar, int i) {
        if ((i & 4) != 0) {
            j2 = 2;
        }
        return H(str, j, j2, iun.f15405a, function1, zjeVar);
    }

    public static final void J(SpannableStringBuilder spannableStringBuilder, Context context, int i, int i2) {
        context.getClass();
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(R.color.static_green)), i, i2, 17);
    }

    public static final int K(x640 x640Var) {
        x640Var.getClass();
        if (x640Var instanceof w640) {
            return R.drawable.ic_status_pending_message;
        }
        if (Intrinsics.d(x640Var, v640.f36855a)) {
            return R.drawable.ic_status_sent_message;
        }
        if (Intrinsics.d(x640Var, u640.f35121a)) {
            return R.drawable.ic_status_read_message;
        }
        t9f.b();
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public static final List L(wgs wgsVar, long j, String str, long j2) {
        List arrayList;
        Long l;
        List<List> list;
        wgsVar.getClass();
        str.getClass();
        List<tgx> list2 = wgsVar.c;
        if (list2 == null) {
            return iun.f15405a;
        }
        int i = 10;
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        for (tgx tgxVar : list2) {
            Long l2 = wgsVar.f39132a;
            long jLongValue = l2 != null ? l2.longValue() : j;
            String str2 = wgsVar.b;
            if (str2 == null) {
                str2 = "";
            }
            tgxVar.getClass();
            List list3 = tgxVar.b;
            dv20 dv20Var = list3 != null ? (dv20) CollectionsKt.firstOrNull(list3) : null;
            long jLongValue2 = 0;
            if (dv20Var == null || (list = dv20Var.b) == null) {
                arrayList = iun.f15405a;
            } else {
                arrayList = new ArrayList(r3d.q(list, i));
                for (List list4 : list) {
                    ArrayList arrayList3 = new ArrayList(r3d.q(list4, i));
                    int i2 = 0;
                    for (Object obj : list4) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            q3d.p();
                            throw null;
                        }
                        cv20 cv20Var = (cv20) obj;
                        Long l3 = dv20Var.f6724a;
                        long jLongValue3 = l3 != null ? l3.longValue() : 0L;
                        ArrayList arrayList4 = arrayList3;
                        arrayList4.add(tke.f0(cv20Var, i2, false, jLongValue, jLongValue3));
                        arrayList = arrayList;
                        arrayList3 = arrayList4;
                        i2 = i3;
                    }
                    arrayList.add(arrayList3);
                    i = 10;
                }
            }
            if (dv20Var != null && (l = dv20Var.f6724a) != null) {
                jLongValue2 = l.longValue();
            }
            String str3 = tgxVar.f33936a;
            long j3 = jLongValue;
            arrayList2.add(new fgx(arrayList, jLongValue2, j3, str2, str3 == null ? "" : str3, str, j3, j2));
            i = 10;
        }
        return arrayList2;
    }

    public static final tjz M(mjz mjzVar, ctf0 ctf0Var) {
        mjzVar.getClass();
        ctf0Var.getClass();
        if (mjzVar instanceof ljz) {
            boolean z = ((ljz) mjzVar).f20174a;
            return new sjz(z ? ctf0Var.f(R.string.verification_completed, new Object[0]) : ctf0Var.f(R.string.verification_not_completed, new Object[0]), z ? i8m0.CHECK : i8m0.WARNING_RED, !z);
        }
        if (mjzVar instanceof kjz) {
            return rjz.d;
        }
        if (mjzVar instanceof jjz) {
            return qjz.d;
        }
        if (mjzVar instanceof hjz) {
            return ojz.d;
        }
        if (mjzVar instanceof ijz) {
            return pjz.d;
        }
        if (mjzVar instanceof gjz) {
            return njz.d;
        }
        t9f.b();
        return null;
    }

    public static final aq40 N(gq40 gq40Var) {
        String str = gq40Var.f11713a;
        if (str == null) {
            str = "";
        }
        return new aq40(str);
    }

    public static final aj50 O(rh50 rh50Var) {
        rh50Var.getClass();
        return new aj50(rh50Var.f30474a, rh50Var.b, rh50Var.c, rh50Var.d, rh50Var.e, rh50Var.f, rh50Var.g, rh50Var.h, rh50Var.i);
    }

    public static final p070 P(a070 a070Var, String str) {
        a070Var.getClass();
        str.getClass();
        List list = a070Var.f13a;
        if (list != null) {
            return new p070(hkb.S(str, list, a070Var.b), hmw0.h0(a070Var.c));
        }
        throw new bun();
    }

    public static final i4 Q(Map map, LinkedHashMap linkedHashMap, ctf0 ctf0Var) {
        String str;
        Object next;
        Iterator it;
        Object next2;
        Object next3;
        int i;
        map.getClass();
        ctf0Var.getClass();
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            List list = (List) linkedHashMap.get(Long.valueOf(((Number) it2.next()).longValue()));
            if (list == null) {
                return lak0.c;
            }
            crr0 crr0Var = (crr0) CollectionsKt.firstOrNull(list);
            Locale locale = null;
            List listC = kotlin.collections.a.c(crr0Var != null ? new rd80(crr0Var.e, rcb.d0(new ocb(crr0Var.f), new ncb(crr0Var.g), crr0Var.h)) : null);
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                crr0 crr0Var2 = (crr0) it3.next();
                crr0Var2.getClass();
                String strValueOf = String.valueOf(crr0Var2.f4860a);
                rdj rdjVar = rdj.f30294a;
                lsm0 lsm0Var = ctf0Var.b;
                boolean zH = ctf0Var.h();
                Date date = crr0Var2.b;
                efj efjVar = efj.UNIVERSAL;
                Iterator it4 = it2;
                wd80 wd80Var = new wd80(strValueOf, rdj.d(rdjVar, date, Boolean.valueOf(zH), locale, 40), crr0Var2.o);
                String str2 = crr0Var2.l;
                String str3 = crr0Var2.m;
                List list2 = crr0Var2.p;
                Iterator it5 = list2.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        str = str2;
                        next = null;
                        break;
                    }
                    next = it5.next();
                    int i2 = ((drr0) next).f6578a;
                    iqr0 iqr0Var = iqr0.P1;
                    str = str2;
                    if (i2 == 1) {
                        break;
                    }
                    str2 = str;
                }
                drr0 drr0Var = (drr0) next;
                String strI = f140.i(drr0Var != null ? drr0Var.c : 0, Separators.PERCENT);
                Iterator it6 = list2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        it = it3;
                        next2 = null;
                        break;
                    }
                    next2 = it6.next();
                    int i3 = ((drr0) next2).f6578a;
                    iqr0 iqr0Var2 = iqr0.P1;
                    it = it3;
                    if (i3 == 2) {
                        break;
                    }
                    it3 = it;
                }
                drr0 drr0Var2 = (drr0) next2;
                String strI2 = f140.i(drr0Var2 != null ? drr0Var2.c : 0, Separators.PERCENT);
                Iterator it7 = list2.iterator();
                do {
                    if (!it7.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it7.next();
                    i = ((drr0) next3).f6578a;
                    iqr0 iqr0Var3 = iqr0.P1;
                } while (i != 3);
                drr0 drr0Var3 = (drr0) next3;
                yd80 yd80Var = new yd80(str, str3, strI, strI2, f140.i(drr0Var3 != null ? drr0Var3.c : 0, Separators.PERCENT));
                int i4 = crr0Var2.k;
                Set set = (Set) map.get(Integer.valueOf(i4));
                if (set == null) {
                    set = xun.f41520a;
                }
                String strA = lsm0Var.a(R.string.P1, Arrays.copyOf(new Object[0], 0));
                iqr0 iqr0Var4 = iqr0.P1;
                pd80 pd80Var = new pd80(i4, strA, iqr0Var4, set.contains(iqr0Var4));
                String strA2 = lsm0Var.a(R.string.X, Arrays.copyOf(new Object[0], 0));
                iqr0 iqr0Var5 = iqr0.X;
                pd80 pd80Var2 = new pd80(i4, strA2, iqr0Var5, set.contains(iqr0Var5));
                String strA3 = lsm0Var.a(R.string.P2, Arrays.copyOf(new Object[0], 0));
                iqr0 iqr0Var6 = iqr0.P2;
                arrayList2.add(new zd80(wd80Var, yd80Var, q3d.j(pd80Var, pd80Var2, new pd80(i4, strA3, iqr0Var6, set.contains(iqr0Var6)))));
                it2 = it4;
                it3 = it;
                locale = null;
            }
            w3d.u(arrayList, CollectionsKt.q0(listC, arrayList2));
            it2 = it2;
        }
        return dyb.r0(CollectionsKt.S(arrayList));
    }

    public static final hrb0 R(uob0 uob0Var, String str, ctf0 ctf0Var) {
        uob0Var.getClass();
        ctf0Var.getClass();
        long j = uob0Var.b;
        String str2 = uob0Var.d;
        String str3 = uob0Var.c;
        vf60 vf60Var = uob0Var.l;
        String str4 = vf60Var.c;
        double d = vf60Var.d;
        double d2 = vf60Var.e;
        qud qudVar = e4f.f7178a;
        int i = uob0Var.i;
        qudVar.getClass();
        e4f e4fVarE = qud.e(i);
        boolean z = uob0Var.g;
        frb0 frb0Var = new frb0(vf60Var.d, vf60Var.e, kotlin.text.c.r(vf60Var.f37317a, Separators.RETURN, "", false), vf60Var.c);
        frb0 frb0Var2 = new frb0(0.0d, 0.0d, str, "0.0");
        return new hrb0(new znq0(j), str2, str3, str4, d, d2, e4fVarE, z, uob0Var.j, frb0Var, frb0Var2, ctf0Var.h());
    }

    public static final zch0 S(cdh0 cdh0Var) {
        Integer num = cdh0Var.f4162a;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = cdh0Var.b;
        return new zch0(iIntValue, num2 != null ? num2.intValue() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v12, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v14, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    public static final gdh0 T(kdh0 kdh0Var) {
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        kdh0Var.getClass();
        List list = kdh0Var.f18108a;
        ?? arrayList4 = 0;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(U((odh0) it.next()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        ?? r5 = arrayList;
        List list2 = kdh0Var.b;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(U((odh0) it2.next()));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        ?? r6 = arrayList2;
        String str = kdh0Var.c;
        String str2 = str == null ? "" : str;
        String str3 = kdh0Var.d;
        String str4 = str3 == null ? "" : str3;
        String str5 = kdh0Var.g;
        String str6 = str5 == null ? "" : str5;
        List list3 = kdh0Var.e;
        if (list3 != null) {
            arrayList3 = new ArrayList(r3d.q(list3, 10));
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                arrayList3.add(S((cdh0) it3.next()));
            }
        } else {
            arrayList3 = 0;
        }
        if (arrayList3 == 0) {
            arrayList3 = iun.f15405a;
        }
        ?? r10 = arrayList3;
        List list4 = kdh0Var.f;
        if (list4 != null) {
            arrayList4 = new ArrayList(r3d.q(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList4.add(S((cdh0) it4.next()));
            }
        }
        if (arrayList4 == 0) {
            arrayList4 = iun.f15405a;
        }
        return new gdh0(r5, r6, str2, str4, str6, r10, arrayList4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    public static final ldh0 U(odh0 odh0Var) {
        ?? arrayList;
        Integer num = odh0Var.b;
        hdh0 hdh0Var = (num != null ? num.intValue() : 0) == 0 ? hdh0.f12871a : hdh0.b;
        Integer num2 = odh0Var.f25075a;
        int iIntValue = num2 != null ? num2.intValue() : 0;
        List list = odh0Var.c;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(S((cdh0) it.next()));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new ldh0(hdh0Var, iIntValue, arrayList);
    }

    public static final g6i0 V(i6i0 i6i0Var) {
        switch (i6i0Var) {
            case GROUP_SELECTOR:
                return g6i0.f10767a;
            case SEASON_SELECTOR:
                return g6i0.b;
            case DATE_SELECTOR:
                return g6i0.c;
            case DISCIPLINE_SELECTOR:
                return g6i0.d;
            case AGE_SELECTOR:
                return g6i0.e;
            case TOURNAMENT_TYPE_SELECTOR:
                return g6i0.f;
            case TOURNAMENT_SELECTOR:
                return g6i0.g;
            case COMPETITOR_TYPE_SELECTOR:
                return g6i0.h;
            case NOT_SET:
                return g6i0.i;
            default:
                t9f.b();
                return null;
        }
    }

    public static final void a(r2x r2xVar, mm40 mm40Var, float f, fet fetVar, int i) {
        if ((i & 4) != 0) {
            mm40Var = jm40.b;
        }
        mm40 mm40Var2 = mm40Var;
        zx7 zx7Var = gqw0.e;
        pge pgeVar = gqw0.B;
        if ((i & 32) != 0) {
            f = 1.0f;
        }
        b(iom0.r(r2xVar, fetVar), null, mm40Var2, zx7Var, pgeVar, f, null, fetVar, 56, 0);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0119  */
    /* JADX WARN: Code duplicated, block: B:102:0x011b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0124  */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:111:0x015b  */
    /* JADX WARN: Code duplicated, block: B:114:0x017c  */
    /* JADX WARN: Code duplicated, block: B:115:0x0182  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x0095  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00de  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:95:0x0100  */
    /* JADX WARN: Code duplicated, block: B:96:0x0107  */
    /* JADX WARN: Code duplicated, block: B:99:0x010d  */
    public static final void b(final pm80 pm80Var, final String str, mm40 mm40Var, u12 u12Var, qge qgeVar, float f, a4d a4dVar, fet fetVar, final int i, final int i2) {
        int i3;
        mm40 mm40Var2;
        int i4;
        int i5;
        int i6;
        qge qgeVar2;
        int i7;
        int i8;
        float f2;
        int i9;
        int i10;
        a4d a4dVar2;
        int i11;
        int i12;
        boolean z;
        final mm40 mm40Var3;
        final qge qgeVar3;
        final float f3;
        final a4d a4dVar3;
        final u12 u12Var2;
        yfe0 yfe0VarU;
        mm40 mm40VarA;
        mm40 mm40Var4;
        u12 u12Var3;
        qge qgeVar4;
        float f4;
        a4d a4dVar4;
        cl5 cl5Var;
        Object objP;
        boolean z2;
        Object objP2;
        fetVar.g0(1142754848);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? fetVar.g(pm80Var) : fetVar.i(pm80Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 == 0) {
            if ((i & 384) == 0) {
                mm40Var2 = mm40Var;
                i3 |= fetVar.g(mm40Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    if (fetVar.g(u12Var)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        qgeVar2 = qgeVar;
                        if (fetVar.g(qgeVar2)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            f2 = f;
                            if (fetVar.d(f2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        i10 = i2 & 64;
                        if (i10 != 0) {
                            if ((1572864 & i) == 0) {
                                a4dVar2 = a4dVar;
                                if (fetVar.g(a4dVar2)) {
                                    i11 = 1048576;
                                } else {
                                    i11 = 524288;
                                }
                                i3 |= i11;
                            }
                            i12 = i3;
                            if ((i3 & 599187) != 599186) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (fetVar.U(i12 & 1, z)) {
                                mm40VarA = jm40.b;
                                if (i13 != 0) {
                                    mm40Var4 = mm40VarA;
                                } else {
                                    mm40Var4 = mm40Var2;
                                }
                                if (i4 != 0) {
                                    u12Var3 = gqw0.e;
                                } else {
                                    u12Var3 = u12Var;
                                }
                                if (i6 != 0) {
                                    qgeVar4 = gqw0.B;
                                } else {
                                    qgeVar4 = qgeVar2;
                                }
                                if (i8 != 0) {
                                    f4 = 1.0f;
                                } else {
                                    f4 = f2;
                                }
                                if (i10 != 0) {
                                    a4dVar4 = null;
                                } else {
                                    a4dVar4 = a4dVar2;
                                }
                                cl5Var = ukd.f35823a;
                                if (str != null) {
                                    fetVar.e0(1899222916);
                                    if ((i12 & 112) == 32) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    objP2 = fetVar.P();
                                    if (z2 || objP2 == cl5Var) {
                                        objP2 = new ka6(str, (byte) 9);
                                        fetVar.o0(objP2);
                                    }
                                    mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                                    fetVar.r(false);
                                } else {
                                    fetVar.e0(1899381698);
                                    fetVar.r(false);
                                }
                                u12 u12Var4 = u12Var3;
                                mm40 mm40Var5 = mm40Var4;
                                mm40 mm40VarK = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var4, qgeVar4, f4, a4dVar4, 2);
                                objP = fetVar.P();
                                if (objP == cl5Var) {
                                    objP = r71.w;
                                    fetVar.o0(objP);
                                }
                                tj30 tj30Var = (tj30) objP;
                                int iHashCode = Long.hashCode(fetVar.T);
                                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
                                bh90 bh90VarM = fetVar.m();
                                mkd.c0.getClass();
                                fetVar.i0();
                                if (fetVar.S) {
                                    fetVar.l(e7z.u1);
                                } else {
                                    fetVar.r0();
                                }
                                jpm0.o(fetVar, tj30Var, gqw0.x);
                                jpm0.o(fetVar, bh90VarM, gqw0.w);
                                jpm0.n(fetVar);
                                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                                fetVar.r(true);
                                f3 = f4;
                                a4dVar3 = a4dVar4;
                                u12Var2 = u12Var4;
                                qgeVar3 = qgeVar4;
                                mm40Var3 = mm40Var5;
                            } else {
                                fetVar.X();
                                mm40Var3 = mm40Var2;
                                qgeVar3 = qgeVar2;
                                f3 = f2;
                                a4dVar3 = a4dVar2;
                                u12Var2 = u12Var;
                            }
                            yfe0VarU = fetVar.u();
                            if (yfe0VarU != null) {
                                yfe0VarU.d = new Function2() { // from class: a.i0x
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                                        return Unit.f46060a;
                                    }
                                };
                            }
                        }
                        i3 |= 1572864;
                        a4dVar2 = a4dVar;
                        i12 = i3;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fetVar.U(i12 & 1, z)) {
                            mm40VarA = jm40.b;
                            if (i13 != 0) {
                                mm40Var4 = mm40VarA;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i4 != 0) {
                                u12Var3 = gqw0.e;
                            } else {
                                u12Var3 = u12Var;
                            }
                            if (i6 != 0) {
                                qgeVar4 = gqw0.B;
                            } else {
                                qgeVar4 = qgeVar2;
                            }
                            if (i8 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i10 != 0) {
                                a4dVar4 = null;
                            } else {
                                a4dVar4 = a4dVar2;
                            }
                            cl5Var = ukd.f35823a;
                            if (str != null) {
                                fetVar.e0(1899222916);
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objP2 = fetVar.P();
                                if (z2) {
                                    objP2 = new ka6(str, (byte) 9);
                                    fetVar.o0(objP2);
                                } else {
                                    objP2 = new ka6(str, (byte) 9);
                                    fetVar.o0(objP2);
                                }
                                mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(1899381698);
                                fetVar.r(false);
                            }
                            u12 u12Var5 = u12Var3;
                            mm40 mm40Var6 = mm40Var4;
                            mm40 mm40VarK2 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var5, qgeVar4, f4, a4dVar4, 2);
                            objP = fetVar.P();
                            if (objP == cl5Var) {
                                objP = r71.w;
                                fetVar.o0(objP);
                            }
                            tj30 tj30Var2 = (tj30) objP;
                            int iHashCode2 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarK2);
                            bh90 bh90VarM2 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, tj30Var2, gqw0.x);
                            jpm0.o(fetVar, bh90VarM2, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC1, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
                            fetVar.r(true);
                            f3 = f4;
                            a4dVar3 = a4dVar4;
                            u12Var2 = u12Var5;
                            qgeVar3 = qgeVar4;
                            mm40Var3 = mm40Var6;
                        } else {
                            fetVar.X();
                            mm40Var3 = mm40Var2;
                            qgeVar3 = qgeVar2;
                            f3 = f2;
                            a4dVar3 = a4dVar2;
                            u12Var2 = u12Var;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.i0x
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    f2 = f;
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        if ((1572864 & i) == 0) {
                            a4dVar2 = a4dVar;
                            if (fetVar.g(a4dVar2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fetVar.U(i12 & 1, z)) {
                            mm40VarA = jm40.b;
                            if (i13 != 0) {
                                mm40Var4 = mm40VarA;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i4 != 0) {
                                u12Var3 = gqw0.e;
                            } else {
                                u12Var3 = u12Var;
                            }
                            if (i6 != 0) {
                                qgeVar4 = gqw0.B;
                            } else {
                                qgeVar4 = qgeVar2;
                            }
                            if (i8 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i10 != 0) {
                                a4dVar4 = null;
                            } else {
                                a4dVar4 = a4dVar2;
                            }
                            cl5Var = ukd.f35823a;
                            if (str != null) {
                                fetVar.e0(1899222916);
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objP2 = fetVar.P();
                                if (z2) {
                                    objP2 = new ka6(str, (byte) 9);
                                    fetVar.o0(objP2);
                                } else {
                                    objP2 = new ka6(str, (byte) 9);
                                    fetVar.o0(objP2);
                                }
                                mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(1899381698);
                                fetVar.r(false);
                            }
                            u12 u12Var6 = u12Var3;
                            mm40 mm40Var7 = mm40Var4;
                            mm40 mm40VarK3 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var6, qgeVar4, f4, a4dVar4, 2);
                            objP = fetVar.P();
                            if (objP == cl5Var) {
                                objP = r71.w;
                                fetVar.o0(objP);
                            }
                            tj30 tj30Var3 = (tj30) objP;
                            int iHashCode3 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarK3);
                            bh90 bh90VarM3 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, tj30Var3, gqw0.x);
                            jpm0.o(fetVar, bh90VarM3, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC2, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode3), gqw0.y);
                            fetVar.r(true);
                            f3 = f4;
                            a4dVar3 = a4dVar4;
                            u12Var2 = u12Var6;
                            qgeVar3 = qgeVar4;
                            mm40Var3 = mm40Var7;
                        } else {
                            fetVar.X();
                            mm40Var3 = mm40Var2;
                            qgeVar3 = qgeVar2;
                            f3 = f2;
                            a4dVar3 = a4dVar2;
                            u12Var2 = u12Var;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.i0x
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    a4dVar2 = a4dVar;
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i12 & 1, z)) {
                        mm40VarA = jm40.b;
                        if (i13 != 0) {
                            mm40Var4 = mm40VarA;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i4 != 0) {
                            u12Var3 = gqw0.e;
                        } else {
                            u12Var3 = u12Var;
                        }
                        if (i6 != 0) {
                            qgeVar4 = gqw0.B;
                        } else {
                            qgeVar4 = qgeVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            a4dVar4 = null;
                        } else {
                            a4dVar4 = a4dVar2;
                        }
                        cl5Var = ukd.f35823a;
                        if (str != null) {
                            fetVar.e0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP2 = fetVar.P();
                            if (z2) {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            }
                            mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1899381698);
                            fetVar.r(false);
                        }
                        u12 u12Var7 = u12Var3;
                        mm40 mm40Var8 = mm40Var4;
                        mm40 mm40VarK4 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var7, qgeVar4, f4, a4dVar4, 2);
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = r71.w;
                            fetVar.o0(objP);
                        }
                        tj30 tj30Var4 = (tj30) objP;
                        int iHashCode4 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarK4);
                        bh90 bh90VarM4 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30Var4, gqw0.x);
                        jpm0.o(fetVar, bh90VarM4, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC3, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode4), gqw0.y);
                        fetVar.r(true);
                        f3 = f4;
                        a4dVar3 = a4dVar4;
                        u12Var2 = u12Var7;
                        qgeVar3 = qgeVar4;
                        mm40Var3 = mm40Var8;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        qgeVar3 = qgeVar2;
                        f3 = f2;
                        a4dVar3 = a4dVar2;
                        u12Var2 = u12Var;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.i0x
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                qgeVar2 = qgeVar;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (fetVar.d(f2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        if ((1572864 & i) == 0) {
                            a4dVar2 = a4dVar;
                            if (fetVar.g(a4dVar2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fetVar.U(i12 & 1, z)) {
                            mm40VarA = jm40.b;
                            if (i13 != 0) {
                                mm40Var4 = mm40VarA;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i4 != 0) {
                                u12Var3 = gqw0.e;
                            } else {
                                u12Var3 = u12Var;
                            }
                            if (i6 != 0) {
                                qgeVar4 = gqw0.B;
                            } else {
                                qgeVar4 = qgeVar2;
                            }
                            if (i8 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i10 != 0) {
                                a4dVar4 = null;
                            } else {
                                a4dVar4 = a4dVar2;
                            }
                            cl5Var = ukd.f35823a;
                            if (str != null) {
                                fetVar.e0(1899222916);
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objP2 = fetVar.P();
                                if (z2) {
                                    objP2 = new ka6(str, (byte) 9);
                                    fetVar.o0(objP2);
                                } else {
                                    objP2 = new ka6(str, (byte) 9);
                                    fetVar.o0(objP2);
                                }
                                mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(1899381698);
                                fetVar.r(false);
                            }
                            u12 u12Var8 = u12Var3;
                            mm40 mm40Var9 = mm40Var4;
                            mm40 mm40VarK5 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var8, qgeVar4, f4, a4dVar4, 2);
                            objP = fetVar.P();
                            if (objP == cl5Var) {
                                objP = r71.w;
                                fetVar.o0(objP);
                            }
                            tj30 tj30Var5 = (tj30) objP;
                            int iHashCode5 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarK5);
                            bh90 bh90VarM5 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, tj30Var5, gqw0.x);
                            jpm0.o(fetVar, bh90VarM5, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC4, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode5), gqw0.y);
                            fetVar.r(true);
                            f3 = f4;
                            a4dVar3 = a4dVar4;
                            u12Var2 = u12Var8;
                            qgeVar3 = qgeVar4;
                            mm40Var3 = mm40Var9;
                        } else {
                            fetVar.X();
                            mm40Var3 = mm40Var2;
                            qgeVar3 = qgeVar2;
                            f3 = f2;
                            a4dVar3 = a4dVar2;
                            u12Var2 = u12Var;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.i0x
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    a4dVar2 = a4dVar;
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i12 & 1, z)) {
                        mm40VarA = jm40.b;
                        if (i13 != 0) {
                            mm40Var4 = mm40VarA;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i4 != 0) {
                            u12Var3 = gqw0.e;
                        } else {
                            u12Var3 = u12Var;
                        }
                        if (i6 != 0) {
                            qgeVar4 = gqw0.B;
                        } else {
                            qgeVar4 = qgeVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            a4dVar4 = null;
                        } else {
                            a4dVar4 = a4dVar2;
                        }
                        cl5Var = ukd.f35823a;
                        if (str != null) {
                            fetVar.e0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP2 = fetVar.P();
                            if (z2) {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            }
                            mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1899381698);
                            fetVar.r(false);
                        }
                        u12 u12Var9 = u12Var3;
                        mm40 mm40Var10 = mm40Var4;
                        mm40 mm40VarK6 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var9, qgeVar4, f4, a4dVar4, 2);
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = r71.w;
                            fetVar.o0(objP);
                        }
                        tj30 tj30Var6 = (tj30) objP;
                        int iHashCode6 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC5 = kbc.c0(fetVar, mm40VarK6);
                        bh90 bh90VarM6 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30Var6, gqw0.x);
                        jpm0.o(fetVar, bh90VarM6, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC5, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode6), gqw0.y);
                        fetVar.r(true);
                        f3 = f4;
                        a4dVar3 = a4dVar4;
                        u12Var2 = u12Var9;
                        qgeVar3 = qgeVar4;
                        mm40Var3 = mm40Var10;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        qgeVar3 = qgeVar2;
                        f3 = f2;
                        a4dVar3 = a4dVar2;
                        u12Var2 = u12Var;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.i0x
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        a4dVar2 = a4dVar;
                        if (fetVar.g(a4dVar2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i12 & 1, z)) {
                        mm40VarA = jm40.b;
                        if (i13 != 0) {
                            mm40Var4 = mm40VarA;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i4 != 0) {
                            u12Var3 = gqw0.e;
                        } else {
                            u12Var3 = u12Var;
                        }
                        if (i6 != 0) {
                            qgeVar4 = gqw0.B;
                        } else {
                            qgeVar4 = qgeVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            a4dVar4 = null;
                        } else {
                            a4dVar4 = a4dVar2;
                        }
                        cl5Var = ukd.f35823a;
                        if (str != null) {
                            fetVar.e0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP2 = fetVar.P();
                            if (z2) {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            }
                            mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1899381698);
                            fetVar.r(false);
                        }
                        u12 u12Var10 = u12Var3;
                        mm40 mm40Var11 = mm40Var4;
                        mm40 mm40VarK7 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var10, qgeVar4, f4, a4dVar4, 2);
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = r71.w;
                            fetVar.o0(objP);
                        }
                        tj30 tj30Var7 = (tj30) objP;
                        int iHashCode7 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC6 = kbc.c0(fetVar, mm40VarK7);
                        bh90 bh90VarM7 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30Var7, gqw0.x);
                        jpm0.o(fetVar, bh90VarM7, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC6, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode7), gqw0.y);
                        fetVar.r(true);
                        f3 = f4;
                        a4dVar3 = a4dVar4;
                        u12Var2 = u12Var10;
                        qgeVar3 = qgeVar4;
                        mm40Var3 = mm40Var11;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        qgeVar3 = qgeVar2;
                        f3 = f2;
                        a4dVar3 = a4dVar2;
                        u12Var2 = u12Var;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.i0x
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                a4dVar2 = a4dVar;
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i12 & 1, z)) {
                    mm40VarA = jm40.b;
                    if (i13 != 0) {
                        mm40Var4 = mm40VarA;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i4 != 0) {
                        u12Var3 = gqw0.e;
                    } else {
                        u12Var3 = u12Var;
                    }
                    if (i6 != 0) {
                        qgeVar4 = gqw0.B;
                    } else {
                        qgeVar4 = qgeVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        a4dVar4 = null;
                    } else {
                        a4dVar4 = a4dVar2;
                    }
                    cl5Var = ukd.f35823a;
                    if (str != null) {
                        fetVar.e0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP2 = fetVar.P();
                        if (z2) {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        }
                        mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1899381698);
                        fetVar.r(false);
                    }
                    u12 u12Var11 = u12Var3;
                    mm40 mm40Var12 = mm40Var4;
                    mm40 mm40VarK8 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var11, qgeVar4, f4, a4dVar4, 2);
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = r71.w;
                        fetVar.o0(objP);
                    }
                    tj30 tj30Var8 = (tj30) objP;
                    int iHashCode8 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC7 = kbc.c0(fetVar, mm40VarK8);
                    bh90 bh90VarM8 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30Var8, gqw0.x);
                    jpm0.o(fetVar, bh90VarM8, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC7, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode8), gqw0.y);
                    fetVar.r(true);
                    f3 = f4;
                    a4dVar3 = a4dVar4;
                    u12Var2 = u12Var11;
                    qgeVar3 = qgeVar4;
                    mm40Var3 = mm40Var12;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    qgeVar3 = qgeVar2;
                    f3 = f2;
                    a4dVar3 = a4dVar2;
                    u12Var2 = u12Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.i0x
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 3072;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    qgeVar2 = qgeVar;
                    if (fetVar.g(qgeVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (fetVar.d(f2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        if ((1572864 & i) == 0) {
                            a4dVar2 = a4dVar;
                            if (fetVar.g(a4dVar2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fetVar.U(i12 & 1, z)) {
                            mm40VarA = jm40.b;
                            if (i13 != 0) {
                                mm40Var4 = mm40VarA;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i4 != 0) {
                                u12Var3 = gqw0.e;
                            } else {
                                u12Var3 = u12Var;
                            }
                            if (i6 != 0) {
                                qgeVar4 = gqw0.B;
                            } else {
                                qgeVar4 = qgeVar2;
                            }
                            if (i8 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i10 != 0) {
                                a4dVar4 = null;
                            } else {
                                a4dVar4 = a4dVar2;
                            }
                            cl5Var = ukd.f35823a;
                            if (str != null) {
                                fetVar.e0(1899222916);
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objP2 = fetVar.P();
                                if (z2) {
                                    objP2 = new ka6(str, (byte) 9);
                                    fetVar.o0(objP2);
                                } else {
                                    objP2 = new ka6(str, (byte) 9);
                                    fetVar.o0(objP2);
                                }
                                mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(1899381698);
                                fetVar.r(false);
                            }
                            u12 u12Var12 = u12Var3;
                            mm40 mm40Var13 = mm40Var4;
                            mm40 mm40VarK9 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var12, qgeVar4, f4, a4dVar4, 2);
                            objP = fetVar.P();
                            if (objP == cl5Var) {
                                objP = r71.w;
                                fetVar.o0(objP);
                            }
                            tj30 tj30Var9 = (tj30) objP;
                            int iHashCode9 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC8 = kbc.c0(fetVar, mm40VarK9);
                            bh90 bh90VarM9 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, tj30Var9, gqw0.x);
                            jpm0.o(fetVar, bh90VarM9, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC8, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode9), gqw0.y);
                            fetVar.r(true);
                            f3 = f4;
                            a4dVar3 = a4dVar4;
                            u12Var2 = u12Var12;
                            qgeVar3 = qgeVar4;
                            mm40Var3 = mm40Var13;
                        } else {
                            fetVar.X();
                            mm40Var3 = mm40Var2;
                            qgeVar3 = qgeVar2;
                            f3 = f2;
                            a4dVar3 = a4dVar2;
                            u12Var2 = u12Var;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.i0x
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    a4dVar2 = a4dVar;
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i12 & 1, z)) {
                        mm40VarA = jm40.b;
                        if (i13 != 0) {
                            mm40Var4 = mm40VarA;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i4 != 0) {
                            u12Var3 = gqw0.e;
                        } else {
                            u12Var3 = u12Var;
                        }
                        if (i6 != 0) {
                            qgeVar4 = gqw0.B;
                        } else {
                            qgeVar4 = qgeVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            a4dVar4 = null;
                        } else {
                            a4dVar4 = a4dVar2;
                        }
                        cl5Var = ukd.f35823a;
                        if (str != null) {
                            fetVar.e0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP2 = fetVar.P();
                            if (z2) {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            }
                            mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1899381698);
                            fetVar.r(false);
                        }
                        u12 u12Var13 = u12Var3;
                        mm40 mm40Var14 = mm40Var4;
                        mm40 mm40VarK10 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var13, qgeVar4, f4, a4dVar4, 2);
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = r71.w;
                            fetVar.o0(objP);
                        }
                        tj30 tj30Var10 = (tj30) objP;
                        int iHashCode10 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC9 = kbc.c0(fetVar, mm40VarK10);
                        bh90 bh90VarM10 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30Var10, gqw0.x);
                        jpm0.o(fetVar, bh90VarM10, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC9, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode10), gqw0.y);
                        fetVar.r(true);
                        f3 = f4;
                        a4dVar3 = a4dVar4;
                        u12Var2 = u12Var13;
                        qgeVar3 = qgeVar4;
                        mm40Var3 = mm40Var14;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        qgeVar3 = qgeVar2;
                        f3 = f2;
                        a4dVar3 = a4dVar2;
                        u12Var2 = u12Var;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.i0x
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        a4dVar2 = a4dVar;
                        if (fetVar.g(a4dVar2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i12 & 1, z)) {
                        mm40VarA = jm40.b;
                        if (i13 != 0) {
                            mm40Var4 = mm40VarA;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i4 != 0) {
                            u12Var3 = gqw0.e;
                        } else {
                            u12Var3 = u12Var;
                        }
                        if (i6 != 0) {
                            qgeVar4 = gqw0.B;
                        } else {
                            qgeVar4 = qgeVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            a4dVar4 = null;
                        } else {
                            a4dVar4 = a4dVar2;
                        }
                        cl5Var = ukd.f35823a;
                        if (str != null) {
                            fetVar.e0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP2 = fetVar.P();
                            if (z2) {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            }
                            mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1899381698);
                            fetVar.r(false);
                        }
                        u12 u12Var14 = u12Var3;
                        mm40 mm40Var15 = mm40Var4;
                        mm40 mm40VarK11 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var14, qgeVar4, f4, a4dVar4, 2);
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = r71.w;
                            fetVar.o0(objP);
                        }
                        tj30 tj30Var11 = (tj30) objP;
                        int iHashCode11 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC10 = kbc.c0(fetVar, mm40VarK11);
                        bh90 bh90VarM11 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30Var11, gqw0.x);
                        jpm0.o(fetVar, bh90VarM11, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC10, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode11), gqw0.y);
                        fetVar.r(true);
                        f3 = f4;
                        a4dVar3 = a4dVar4;
                        u12Var2 = u12Var14;
                        qgeVar3 = qgeVar4;
                        mm40Var3 = mm40Var15;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        qgeVar3 = qgeVar2;
                        f3 = f2;
                        a4dVar3 = a4dVar2;
                        u12Var2 = u12Var;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.i0x
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                a4dVar2 = a4dVar;
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i12 & 1, z)) {
                    mm40VarA = jm40.b;
                    if (i13 != 0) {
                        mm40Var4 = mm40VarA;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i4 != 0) {
                        u12Var3 = gqw0.e;
                    } else {
                        u12Var3 = u12Var;
                    }
                    if (i6 != 0) {
                        qgeVar4 = gqw0.B;
                    } else {
                        qgeVar4 = qgeVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        a4dVar4 = null;
                    } else {
                        a4dVar4 = a4dVar2;
                    }
                    cl5Var = ukd.f35823a;
                    if (str != null) {
                        fetVar.e0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP2 = fetVar.P();
                        if (z2) {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        }
                        mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1899381698);
                        fetVar.r(false);
                    }
                    u12 u12Var15 = u12Var3;
                    mm40 mm40Var16 = mm40Var4;
                    mm40 mm40VarK12 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var15, qgeVar4, f4, a4dVar4, 2);
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = r71.w;
                        fetVar.o0(objP);
                    }
                    tj30 tj30Var12 = (tj30) objP;
                    int iHashCode12 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC11 = kbc.c0(fetVar, mm40VarK12);
                    bh90 bh90VarM12 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30Var12, gqw0.x);
                    jpm0.o(fetVar, bh90VarM12, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC11, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode12), gqw0.y);
                    fetVar.r(true);
                    f3 = f4;
                    a4dVar3 = a4dVar4;
                    u12Var2 = u12Var15;
                    qgeVar3 = qgeVar4;
                    mm40Var3 = mm40Var16;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    qgeVar3 = qgeVar2;
                    f3 = f2;
                    a4dVar3 = a4dVar2;
                    u12Var2 = u12Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.i0x
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 24576;
            qgeVar2 = qgeVar;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (fetVar.d(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        a4dVar2 = a4dVar;
                        if (fetVar.g(a4dVar2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i12 & 1, z)) {
                        mm40VarA = jm40.b;
                        if (i13 != 0) {
                            mm40Var4 = mm40VarA;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i4 != 0) {
                            u12Var3 = gqw0.e;
                        } else {
                            u12Var3 = u12Var;
                        }
                        if (i6 != 0) {
                            qgeVar4 = gqw0.B;
                        } else {
                            qgeVar4 = qgeVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            a4dVar4 = null;
                        } else {
                            a4dVar4 = a4dVar2;
                        }
                        cl5Var = ukd.f35823a;
                        if (str != null) {
                            fetVar.e0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP2 = fetVar.P();
                            if (z2) {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            }
                            mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1899381698);
                            fetVar.r(false);
                        }
                        u12 u12Var16 = u12Var3;
                        mm40 mm40Var17 = mm40Var4;
                        mm40 mm40VarK13 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var16, qgeVar4, f4, a4dVar4, 2);
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = r71.w;
                            fetVar.o0(objP);
                        }
                        tj30 tj30Var13 = (tj30) objP;
                        int iHashCode13 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC12 = kbc.c0(fetVar, mm40VarK13);
                        bh90 bh90VarM13 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30Var13, gqw0.x);
                        jpm0.o(fetVar, bh90VarM13, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC12, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode13), gqw0.y);
                        fetVar.r(true);
                        f3 = f4;
                        a4dVar3 = a4dVar4;
                        u12Var2 = u12Var16;
                        qgeVar3 = qgeVar4;
                        mm40Var3 = mm40Var17;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        qgeVar3 = qgeVar2;
                        f3 = f2;
                        a4dVar3 = a4dVar2;
                        u12Var2 = u12Var;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.i0x
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                a4dVar2 = a4dVar;
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i12 & 1, z)) {
                    mm40VarA = jm40.b;
                    if (i13 != 0) {
                        mm40Var4 = mm40VarA;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i4 != 0) {
                        u12Var3 = gqw0.e;
                    } else {
                        u12Var3 = u12Var;
                    }
                    if (i6 != 0) {
                        qgeVar4 = gqw0.B;
                    } else {
                        qgeVar4 = qgeVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        a4dVar4 = null;
                    } else {
                        a4dVar4 = a4dVar2;
                    }
                    cl5Var = ukd.f35823a;
                    if (str != null) {
                        fetVar.e0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP2 = fetVar.P();
                        if (z2) {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        }
                        mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1899381698);
                        fetVar.r(false);
                    }
                    u12 u12Var17 = u12Var3;
                    mm40 mm40Var18 = mm40Var4;
                    mm40 mm40VarK14 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var17, qgeVar4, f4, a4dVar4, 2);
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = r71.w;
                        fetVar.o0(objP);
                    }
                    tj30 tj30Var14 = (tj30) objP;
                    int iHashCode14 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC13 = kbc.c0(fetVar, mm40VarK14);
                    bh90 bh90VarM14 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30Var14, gqw0.x);
                    jpm0.o(fetVar, bh90VarM14, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC13, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode14), gqw0.y);
                    fetVar.r(true);
                    f3 = f4;
                    a4dVar3 = a4dVar4;
                    u12Var2 = u12Var17;
                    qgeVar3 = qgeVar4;
                    mm40Var3 = mm40Var18;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    qgeVar3 = qgeVar2;
                    f3 = f2;
                    a4dVar3 = a4dVar2;
                    u12Var2 = u12Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.i0x
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                if ((1572864 & i) == 0) {
                    a4dVar2 = a4dVar;
                    if (fetVar.g(a4dVar2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i12 & 1, z)) {
                    mm40VarA = jm40.b;
                    if (i13 != 0) {
                        mm40Var4 = mm40VarA;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i4 != 0) {
                        u12Var3 = gqw0.e;
                    } else {
                        u12Var3 = u12Var;
                    }
                    if (i6 != 0) {
                        qgeVar4 = gqw0.B;
                    } else {
                        qgeVar4 = qgeVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        a4dVar4 = null;
                    } else {
                        a4dVar4 = a4dVar2;
                    }
                    cl5Var = ukd.f35823a;
                    if (str != null) {
                        fetVar.e0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP2 = fetVar.P();
                        if (z2) {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        }
                        mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1899381698);
                        fetVar.r(false);
                    }
                    u12 u12Var18 = u12Var3;
                    mm40 mm40Var19 = mm40Var4;
                    mm40 mm40VarK15 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var18, qgeVar4, f4, a4dVar4, 2);
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = r71.w;
                        fetVar.o0(objP);
                    }
                    tj30 tj30Var15 = (tj30) objP;
                    int iHashCode15 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC14 = kbc.c0(fetVar, mm40VarK15);
                    bh90 bh90VarM15 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30Var15, gqw0.x);
                    jpm0.o(fetVar, bh90VarM15, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC14, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode15), gqw0.y);
                    fetVar.r(true);
                    f3 = f4;
                    a4dVar3 = a4dVar4;
                    u12Var2 = u12Var18;
                    qgeVar3 = qgeVar4;
                    mm40Var3 = mm40Var19;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    qgeVar3 = qgeVar2;
                    f3 = f2;
                    a4dVar3 = a4dVar2;
                    u12Var2 = u12Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.i0x
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            a4dVar2 = a4dVar;
            i12 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i12 & 1, z)) {
                mm40VarA = jm40.b;
                if (i13 != 0) {
                    mm40Var4 = mm40VarA;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i4 != 0) {
                    u12Var3 = gqw0.e;
                } else {
                    u12Var3 = u12Var;
                }
                if (i6 != 0) {
                    qgeVar4 = gqw0.B;
                } else {
                    qgeVar4 = qgeVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    a4dVar4 = null;
                } else {
                    a4dVar4 = a4dVar2;
                }
                cl5Var = ukd.f35823a;
                if (str != null) {
                    fetVar.e0(1899222916);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP2 = fetVar.P();
                    if (z2) {
                        objP2 = new ka6(str, (byte) 9);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new ka6(str, (byte) 9);
                        fetVar.o0(objP2);
                    }
                    mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1899381698);
                    fetVar.r(false);
                }
                u12 u12Var19 = u12Var3;
                mm40 mm40Var110 = mm40Var4;
                mm40 mm40VarK16 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var19, qgeVar4, f4, a4dVar4, 2);
                objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = r71.w;
                    fetVar.o0(objP);
                }
                tj30 tj30Var16 = (tj30) objP;
                int iHashCode16 = Long.hashCode(fetVar.T);
                mm40 mm40VarC15 = kbc.c0(fetVar, mm40VarK16);
                bh90 bh90VarM16 = fetVar.m();
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30Var16, gqw0.x);
                jpm0.o(fetVar, bh90VarM16, gqw0.w);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC15, gqw0.v);
                jpm0.o(fetVar, Integer.valueOf(iHashCode16), gqw0.y);
                fetVar.r(true);
                f3 = f4;
                a4dVar3 = a4dVar4;
                u12Var2 = u12Var19;
                qgeVar3 = qgeVar4;
                mm40Var3 = mm40Var110;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                qgeVar3 = qgeVar2;
                f3 = f2;
                a4dVar3 = a4dVar2;
                u12Var2 = u12Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.i0x
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 384;
        mm40Var2 = mm40Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                if (fetVar.g(u12Var)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    qgeVar2 = qgeVar;
                    if (fetVar.g(qgeVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        f2 = f;
                        if (fetVar.d(f2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        if ((1572864 & i) == 0) {
                            a4dVar2 = a4dVar;
                            if (fetVar.g(a4dVar2)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i12 = i3;
                        if ((i3 & 599187) != 599186) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fetVar.U(i12 & 1, z)) {
                            mm40VarA = jm40.b;
                            if (i13 != 0) {
                                mm40Var4 = mm40VarA;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if (i4 != 0) {
                                u12Var3 = gqw0.e;
                            } else {
                                u12Var3 = u12Var;
                            }
                            if (i6 != 0) {
                                qgeVar4 = gqw0.B;
                            } else {
                                qgeVar4 = qgeVar2;
                            }
                            if (i8 != 0) {
                                f4 = 1.0f;
                            } else {
                                f4 = f2;
                            }
                            if (i10 != 0) {
                                a4dVar4 = null;
                            } else {
                                a4dVar4 = a4dVar2;
                            }
                            cl5Var = ukd.f35823a;
                            if (str != null) {
                                fetVar.e0(1899222916);
                                if ((i12 & 112) == 32) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                objP2 = fetVar.P();
                                if (z2) {
                                    objP2 = new ka6(str, (byte) 9);
                                    fetVar.o0(objP2);
                                } else {
                                    objP2 = new ka6(str, (byte) 9);
                                    fetVar.o0(objP2);
                                }
                                mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(1899381698);
                                fetVar.r(false);
                            }
                            u12 u12Var110 = u12Var3;
                            mm40 mm40Var111 = mm40Var4;
                            mm40 mm40VarK17 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var110, qgeVar4, f4, a4dVar4, 2);
                            objP = fetVar.P();
                            if (objP == cl5Var) {
                                objP = r71.w;
                                fetVar.o0(objP);
                            }
                            tj30 tj30Var17 = (tj30) objP;
                            int iHashCode17 = Long.hashCode(fetVar.T);
                            mm40 mm40VarC16 = kbc.c0(fetVar, mm40VarK17);
                            bh90 bh90VarM17 = fetVar.m();
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(e7z.u1);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, tj30Var17, gqw0.x);
                            jpm0.o(fetVar, bh90VarM17, gqw0.w);
                            jpm0.n(fetVar);
                            jpm0.o(fetVar, mm40VarC16, gqw0.v);
                            jpm0.o(fetVar, Integer.valueOf(iHashCode17), gqw0.y);
                            fetVar.r(true);
                            f3 = f4;
                            a4dVar3 = a4dVar4;
                            u12Var2 = u12Var110;
                            qgeVar3 = qgeVar4;
                            mm40Var3 = mm40Var111;
                        } else {
                            fetVar.X();
                            mm40Var3 = mm40Var2;
                            qgeVar3 = qgeVar2;
                            f3 = f2;
                            a4dVar3 = a4dVar2;
                            u12Var2 = u12Var;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.i0x
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i3 |= 1572864;
                    a4dVar2 = a4dVar;
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i12 & 1, z)) {
                        mm40VarA = jm40.b;
                        if (i13 != 0) {
                            mm40Var4 = mm40VarA;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i4 != 0) {
                            u12Var3 = gqw0.e;
                        } else {
                            u12Var3 = u12Var;
                        }
                        if (i6 != 0) {
                            qgeVar4 = gqw0.B;
                        } else {
                            qgeVar4 = qgeVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            a4dVar4 = null;
                        } else {
                            a4dVar4 = a4dVar2;
                        }
                        cl5Var = ukd.f35823a;
                        if (str != null) {
                            fetVar.e0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP2 = fetVar.P();
                            if (z2) {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            }
                            mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1899381698);
                            fetVar.r(false);
                        }
                        u12 u12Var111 = u12Var3;
                        mm40 mm40Var112 = mm40Var4;
                        mm40 mm40VarK18 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var111, qgeVar4, f4, a4dVar4, 2);
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = r71.w;
                            fetVar.o0(objP);
                        }
                        tj30 tj30Var18 = (tj30) objP;
                        int iHashCode18 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC17 = kbc.c0(fetVar, mm40VarK18);
                        bh90 bh90VarM18 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30Var18, gqw0.x);
                        jpm0.o(fetVar, bh90VarM18, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC17, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode18), gqw0.y);
                        fetVar.r(true);
                        f3 = f4;
                        a4dVar3 = a4dVar4;
                        u12Var2 = u12Var111;
                        qgeVar3 = qgeVar4;
                        mm40Var3 = mm40Var112;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        qgeVar3 = qgeVar2;
                        f3 = f2;
                        a4dVar3 = a4dVar2;
                        u12Var2 = u12Var;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.i0x
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                f2 = f;
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        a4dVar2 = a4dVar;
                        if (fetVar.g(a4dVar2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i12 & 1, z)) {
                        mm40VarA = jm40.b;
                        if (i13 != 0) {
                            mm40Var4 = mm40VarA;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i4 != 0) {
                            u12Var3 = gqw0.e;
                        } else {
                            u12Var3 = u12Var;
                        }
                        if (i6 != 0) {
                            qgeVar4 = gqw0.B;
                        } else {
                            qgeVar4 = qgeVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            a4dVar4 = null;
                        } else {
                            a4dVar4 = a4dVar2;
                        }
                        cl5Var = ukd.f35823a;
                        if (str != null) {
                            fetVar.e0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP2 = fetVar.P();
                            if (z2) {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            }
                            mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1899381698);
                            fetVar.r(false);
                        }
                        u12 u12Var112 = u12Var3;
                        mm40 mm40Var113 = mm40Var4;
                        mm40 mm40VarK19 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var112, qgeVar4, f4, a4dVar4, 2);
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = r71.w;
                            fetVar.o0(objP);
                        }
                        tj30 tj30Var19 = (tj30) objP;
                        int iHashCode19 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC18 = kbc.c0(fetVar, mm40VarK19);
                        bh90 bh90VarM19 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30Var19, gqw0.x);
                        jpm0.o(fetVar, bh90VarM19, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC18, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode19), gqw0.y);
                        fetVar.r(true);
                        f3 = f4;
                        a4dVar3 = a4dVar4;
                        u12Var2 = u12Var112;
                        qgeVar3 = qgeVar4;
                        mm40Var3 = mm40Var113;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        qgeVar3 = qgeVar2;
                        f3 = f2;
                        a4dVar3 = a4dVar2;
                        u12Var2 = u12Var;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.i0x
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                a4dVar2 = a4dVar;
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i12 & 1, z)) {
                    mm40VarA = jm40.b;
                    if (i13 != 0) {
                        mm40Var4 = mm40VarA;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i4 != 0) {
                        u12Var3 = gqw0.e;
                    } else {
                        u12Var3 = u12Var;
                    }
                    if (i6 != 0) {
                        qgeVar4 = gqw0.B;
                    } else {
                        qgeVar4 = qgeVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        a4dVar4 = null;
                    } else {
                        a4dVar4 = a4dVar2;
                    }
                    cl5Var = ukd.f35823a;
                    if (str != null) {
                        fetVar.e0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP2 = fetVar.P();
                        if (z2) {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        }
                        mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1899381698);
                        fetVar.r(false);
                    }
                    u12 u12Var113 = u12Var3;
                    mm40 mm40Var114 = mm40Var4;
                    mm40 mm40VarK110 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var113, qgeVar4, f4, a4dVar4, 2);
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = r71.w;
                        fetVar.o0(objP);
                    }
                    tj30 tj30Var110 = (tj30) objP;
                    int iHashCode110 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC19 = kbc.c0(fetVar, mm40VarK110);
                    bh90 bh90VarM110 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30Var110, gqw0.x);
                    jpm0.o(fetVar, bh90VarM110, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC19, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode110), gqw0.y);
                    fetVar.r(true);
                    f3 = f4;
                    a4dVar3 = a4dVar4;
                    u12Var2 = u12Var113;
                    qgeVar3 = qgeVar4;
                    mm40Var3 = mm40Var114;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    qgeVar3 = qgeVar2;
                    f3 = f2;
                    a4dVar3 = a4dVar2;
                    u12Var2 = u12Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.i0x
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 24576;
            qgeVar2 = qgeVar;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (fetVar.d(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        a4dVar2 = a4dVar;
                        if (fetVar.g(a4dVar2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i12 & 1, z)) {
                        mm40VarA = jm40.b;
                        if (i13 != 0) {
                            mm40Var4 = mm40VarA;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i4 != 0) {
                            u12Var3 = gqw0.e;
                        } else {
                            u12Var3 = u12Var;
                        }
                        if (i6 != 0) {
                            qgeVar4 = gqw0.B;
                        } else {
                            qgeVar4 = qgeVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            a4dVar4 = null;
                        } else {
                            a4dVar4 = a4dVar2;
                        }
                        cl5Var = ukd.f35823a;
                        if (str != null) {
                            fetVar.e0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP2 = fetVar.P();
                            if (z2) {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            }
                            mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1899381698);
                            fetVar.r(false);
                        }
                        u12 u12Var114 = u12Var3;
                        mm40 mm40Var115 = mm40Var4;
                        mm40 mm40VarK111 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var114, qgeVar4, f4, a4dVar4, 2);
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = r71.w;
                            fetVar.o0(objP);
                        }
                        tj30 tj30Var111 = (tj30) objP;
                        int iHashCode111 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC110 = kbc.c0(fetVar, mm40VarK111);
                        bh90 bh90VarM111 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30Var111, gqw0.x);
                        jpm0.o(fetVar, bh90VarM111, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC110, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode111), gqw0.y);
                        fetVar.r(true);
                        f3 = f4;
                        a4dVar3 = a4dVar4;
                        u12Var2 = u12Var114;
                        qgeVar3 = qgeVar4;
                        mm40Var3 = mm40Var115;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        qgeVar3 = qgeVar2;
                        f3 = f2;
                        a4dVar3 = a4dVar2;
                        u12Var2 = u12Var;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.i0x
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                a4dVar2 = a4dVar;
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i12 & 1, z)) {
                    mm40VarA = jm40.b;
                    if (i13 != 0) {
                        mm40Var4 = mm40VarA;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i4 != 0) {
                        u12Var3 = gqw0.e;
                    } else {
                        u12Var3 = u12Var;
                    }
                    if (i6 != 0) {
                        qgeVar4 = gqw0.B;
                    } else {
                        qgeVar4 = qgeVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        a4dVar4 = null;
                    } else {
                        a4dVar4 = a4dVar2;
                    }
                    cl5Var = ukd.f35823a;
                    if (str != null) {
                        fetVar.e0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP2 = fetVar.P();
                        if (z2) {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        }
                        mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1899381698);
                        fetVar.r(false);
                    }
                    u12 u12Var115 = u12Var3;
                    mm40 mm40Var116 = mm40Var4;
                    mm40 mm40VarK112 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var115, qgeVar4, f4, a4dVar4, 2);
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = r71.w;
                        fetVar.o0(objP);
                    }
                    tj30 tj30Var112 = (tj30) objP;
                    int iHashCode112 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC111 = kbc.c0(fetVar, mm40VarK112);
                    bh90 bh90VarM112 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30Var112, gqw0.x);
                    jpm0.o(fetVar, bh90VarM112, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC111, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode112), gqw0.y);
                    fetVar.r(true);
                    f3 = f4;
                    a4dVar3 = a4dVar4;
                    u12Var2 = u12Var115;
                    qgeVar3 = qgeVar4;
                    mm40Var3 = mm40Var116;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    qgeVar3 = qgeVar2;
                    f3 = f2;
                    a4dVar3 = a4dVar2;
                    u12Var2 = u12Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.i0x
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                if ((1572864 & i) == 0) {
                    a4dVar2 = a4dVar;
                    if (fetVar.g(a4dVar2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i12 & 1, z)) {
                    mm40VarA = jm40.b;
                    if (i13 != 0) {
                        mm40Var4 = mm40VarA;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i4 != 0) {
                        u12Var3 = gqw0.e;
                    } else {
                        u12Var3 = u12Var;
                    }
                    if (i6 != 0) {
                        qgeVar4 = gqw0.B;
                    } else {
                        qgeVar4 = qgeVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        a4dVar4 = null;
                    } else {
                        a4dVar4 = a4dVar2;
                    }
                    cl5Var = ukd.f35823a;
                    if (str != null) {
                        fetVar.e0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP2 = fetVar.P();
                        if (z2) {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        }
                        mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1899381698);
                        fetVar.r(false);
                    }
                    u12 u12Var116 = u12Var3;
                    mm40 mm40Var117 = mm40Var4;
                    mm40 mm40VarK113 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var116, qgeVar4, f4, a4dVar4, 2);
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = r71.w;
                        fetVar.o0(objP);
                    }
                    tj30 tj30Var113 = (tj30) objP;
                    int iHashCode113 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC112 = kbc.c0(fetVar, mm40VarK113);
                    bh90 bh90VarM113 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30Var113, gqw0.x);
                    jpm0.o(fetVar, bh90VarM113, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC112, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode113), gqw0.y);
                    fetVar.r(true);
                    f3 = f4;
                    a4dVar3 = a4dVar4;
                    u12Var2 = u12Var116;
                    qgeVar3 = qgeVar4;
                    mm40Var3 = mm40Var117;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    qgeVar3 = qgeVar2;
                    f3 = f2;
                    a4dVar3 = a4dVar2;
                    u12Var2 = u12Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.i0x
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            a4dVar2 = a4dVar;
            i12 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i12 & 1, z)) {
                mm40VarA = jm40.b;
                if (i13 != 0) {
                    mm40Var4 = mm40VarA;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i4 != 0) {
                    u12Var3 = gqw0.e;
                } else {
                    u12Var3 = u12Var;
                }
                if (i6 != 0) {
                    qgeVar4 = gqw0.B;
                } else {
                    qgeVar4 = qgeVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    a4dVar4 = null;
                } else {
                    a4dVar4 = a4dVar2;
                }
                cl5Var = ukd.f35823a;
                if (str != null) {
                    fetVar.e0(1899222916);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP2 = fetVar.P();
                    if (z2) {
                        objP2 = new ka6(str, (byte) 9);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new ka6(str, (byte) 9);
                        fetVar.o0(objP2);
                    }
                    mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1899381698);
                    fetVar.r(false);
                }
                u12 u12Var117 = u12Var3;
                mm40 mm40Var118 = mm40Var4;
                mm40 mm40VarK114 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var117, qgeVar4, f4, a4dVar4, 2);
                objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = r71.w;
                    fetVar.o0(objP);
                }
                tj30 tj30Var114 = (tj30) objP;
                int iHashCode114 = Long.hashCode(fetVar.T);
                mm40 mm40VarC113 = kbc.c0(fetVar, mm40VarK114);
                bh90 bh90VarM114 = fetVar.m();
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30Var114, gqw0.x);
                jpm0.o(fetVar, bh90VarM114, gqw0.w);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC113, gqw0.v);
                jpm0.o(fetVar, Integer.valueOf(iHashCode114), gqw0.y);
                fetVar.r(true);
                f3 = f4;
                a4dVar3 = a4dVar4;
                u12Var2 = u12Var117;
                qgeVar3 = qgeVar4;
                mm40Var3 = mm40Var118;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                qgeVar3 = qgeVar2;
                f3 = f2;
                a4dVar3 = a4dVar2;
                u12Var2 = u12Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.i0x
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 3072;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                qgeVar2 = qgeVar;
                if (fetVar.g(qgeVar2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (fetVar.d(f2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    if ((1572864 & i) == 0) {
                        a4dVar2 = a4dVar;
                        if (fetVar.g(a4dVar2)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i12 = i3;
                    if ((i3 & 599187) != 599186) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i12 & 1, z)) {
                        mm40VarA = jm40.b;
                        if (i13 != 0) {
                            mm40Var4 = mm40VarA;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i4 != 0) {
                            u12Var3 = gqw0.e;
                        } else {
                            u12Var3 = u12Var;
                        }
                        if (i6 != 0) {
                            qgeVar4 = gqw0.B;
                        } else {
                            qgeVar4 = qgeVar2;
                        }
                        if (i8 != 0) {
                            f4 = 1.0f;
                        } else {
                            f4 = f2;
                        }
                        if (i10 != 0) {
                            a4dVar4 = null;
                        } else {
                            a4dVar4 = a4dVar2;
                        }
                        cl5Var = ukd.f35823a;
                        if (str != null) {
                            fetVar.e0(1899222916);
                            if ((i12 & 112) == 32) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            objP2 = fetVar.P();
                            if (z2) {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            } else {
                                objP2 = new ka6(str, (byte) 9);
                                fetVar.o0(objP2);
                            }
                            mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1899381698);
                            fetVar.r(false);
                        }
                        u12 u12Var118 = u12Var3;
                        mm40 mm40Var119 = mm40Var4;
                        mm40 mm40VarK115 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var118, qgeVar4, f4, a4dVar4, 2);
                        objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = r71.w;
                            fetVar.o0(objP);
                        }
                        tj30 tj30Var115 = (tj30) objP;
                        int iHashCode115 = Long.hashCode(fetVar.T);
                        mm40 mm40VarC114 = kbc.c0(fetVar, mm40VarK115);
                        bh90 bh90VarM115 = fetVar.m();
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(e7z.u1);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30Var115, gqw0.x);
                        jpm0.o(fetVar, bh90VarM115, gqw0.w);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC114, gqw0.v);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode115), gqw0.y);
                        fetVar.r(true);
                        f3 = f4;
                        a4dVar3 = a4dVar4;
                        u12Var2 = u12Var118;
                        qgeVar3 = qgeVar4;
                        mm40Var3 = mm40Var119;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        qgeVar3 = qgeVar2;
                        f3 = f2;
                        a4dVar3 = a4dVar2;
                        u12Var2 = u12Var;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.i0x
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 1572864;
                a4dVar2 = a4dVar;
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i12 & 1, z)) {
                    mm40VarA = jm40.b;
                    if (i13 != 0) {
                        mm40Var4 = mm40VarA;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i4 != 0) {
                        u12Var3 = gqw0.e;
                    } else {
                        u12Var3 = u12Var;
                    }
                    if (i6 != 0) {
                        qgeVar4 = gqw0.B;
                    } else {
                        qgeVar4 = qgeVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        a4dVar4 = null;
                    } else {
                        a4dVar4 = a4dVar2;
                    }
                    cl5Var = ukd.f35823a;
                    if (str != null) {
                        fetVar.e0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP2 = fetVar.P();
                        if (z2) {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        }
                        mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1899381698);
                        fetVar.r(false);
                    }
                    u12 u12Var119 = u12Var3;
                    mm40 mm40Var1110 = mm40Var4;
                    mm40 mm40VarK116 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var119, qgeVar4, f4, a4dVar4, 2);
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = r71.w;
                        fetVar.o0(objP);
                    }
                    tj30 tj30Var116 = (tj30) objP;
                    int iHashCode116 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC115 = kbc.c0(fetVar, mm40VarK116);
                    bh90 bh90VarM116 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30Var116, gqw0.x);
                    jpm0.o(fetVar, bh90VarM116, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC115, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode116), gqw0.y);
                    fetVar.r(true);
                    f3 = f4;
                    a4dVar3 = a4dVar4;
                    u12Var2 = u12Var119;
                    qgeVar3 = qgeVar4;
                    mm40Var3 = mm40Var1110;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    qgeVar3 = qgeVar2;
                    f3 = f2;
                    a4dVar3 = a4dVar2;
                    u12Var2 = u12Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.i0x
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 196608;
            f2 = f;
            i10 = i2 & 64;
            if (i10 != 0) {
                if ((1572864 & i) == 0) {
                    a4dVar2 = a4dVar;
                    if (fetVar.g(a4dVar2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i12 & 1, z)) {
                    mm40VarA = jm40.b;
                    if (i13 != 0) {
                        mm40Var4 = mm40VarA;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i4 != 0) {
                        u12Var3 = gqw0.e;
                    } else {
                        u12Var3 = u12Var;
                    }
                    if (i6 != 0) {
                        qgeVar4 = gqw0.B;
                    } else {
                        qgeVar4 = qgeVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        a4dVar4 = null;
                    } else {
                        a4dVar4 = a4dVar2;
                    }
                    cl5Var = ukd.f35823a;
                    if (str != null) {
                        fetVar.e0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP2 = fetVar.P();
                        if (z2) {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        }
                        mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1899381698);
                        fetVar.r(false);
                    }
                    u12 u12Var1110 = u12Var3;
                    mm40 mm40Var1111 = mm40Var4;
                    mm40 mm40VarK117 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var1110, qgeVar4, f4, a4dVar4, 2);
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = r71.w;
                        fetVar.o0(objP);
                    }
                    tj30 tj30Var117 = (tj30) objP;
                    int iHashCode117 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC116 = kbc.c0(fetVar, mm40VarK117);
                    bh90 bh90VarM117 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30Var117, gqw0.x);
                    jpm0.o(fetVar, bh90VarM117, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC116, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode117), gqw0.y);
                    fetVar.r(true);
                    f3 = f4;
                    a4dVar3 = a4dVar4;
                    u12Var2 = u12Var1110;
                    qgeVar3 = qgeVar4;
                    mm40Var3 = mm40Var1111;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    qgeVar3 = qgeVar2;
                    f3 = f2;
                    a4dVar3 = a4dVar2;
                    u12Var2 = u12Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.i0x
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            a4dVar2 = a4dVar;
            i12 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i12 & 1, z)) {
                mm40VarA = jm40.b;
                if (i13 != 0) {
                    mm40Var4 = mm40VarA;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i4 != 0) {
                    u12Var3 = gqw0.e;
                } else {
                    u12Var3 = u12Var;
                }
                if (i6 != 0) {
                    qgeVar4 = gqw0.B;
                } else {
                    qgeVar4 = qgeVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    a4dVar4 = null;
                } else {
                    a4dVar4 = a4dVar2;
                }
                cl5Var = ukd.f35823a;
                if (str != null) {
                    fetVar.e0(1899222916);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP2 = fetVar.P();
                    if (z2) {
                        objP2 = new ka6(str, (byte) 9);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new ka6(str, (byte) 9);
                        fetVar.o0(objP2);
                    }
                    mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1899381698);
                    fetVar.r(false);
                }
                u12 u12Var1111 = u12Var3;
                mm40 mm40Var1112 = mm40Var4;
                mm40 mm40VarK118 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var1111, qgeVar4, f4, a4dVar4, 2);
                objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = r71.w;
                    fetVar.o0(objP);
                }
                tj30 tj30Var118 = (tj30) objP;
                int iHashCode118 = Long.hashCode(fetVar.T);
                mm40 mm40VarC117 = kbc.c0(fetVar, mm40VarK118);
                bh90 bh90VarM118 = fetVar.m();
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30Var118, gqw0.x);
                jpm0.o(fetVar, bh90VarM118, gqw0.w);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC117, gqw0.v);
                jpm0.o(fetVar, Integer.valueOf(iHashCode118), gqw0.y);
                fetVar.r(true);
                f3 = f4;
                a4dVar3 = a4dVar4;
                u12Var2 = u12Var1111;
                qgeVar3 = qgeVar4;
                mm40Var3 = mm40Var1112;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                qgeVar3 = qgeVar2;
                f3 = f2;
                a4dVar3 = a4dVar2;
                u12Var2 = u12Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.i0x
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 24576;
        qgeVar2 = qgeVar;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                f2 = f;
                if (fetVar.d(f2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                if ((1572864 & i) == 0) {
                    a4dVar2 = a4dVar;
                    if (fetVar.g(a4dVar2)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i12 = i3;
                if ((i3 & 599187) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i12 & 1, z)) {
                    mm40VarA = jm40.b;
                    if (i13 != 0) {
                        mm40Var4 = mm40VarA;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i4 != 0) {
                        u12Var3 = gqw0.e;
                    } else {
                        u12Var3 = u12Var;
                    }
                    if (i6 != 0) {
                        qgeVar4 = gqw0.B;
                    } else {
                        qgeVar4 = qgeVar2;
                    }
                    if (i8 != 0) {
                        f4 = 1.0f;
                    } else {
                        f4 = f2;
                    }
                    if (i10 != 0) {
                        a4dVar4 = null;
                    } else {
                        a4dVar4 = a4dVar2;
                    }
                    cl5Var = ukd.f35823a;
                    if (str != null) {
                        fetVar.e0(1899222916);
                        if ((i12 & 112) == 32) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objP2 = fetVar.P();
                        if (z2) {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        } else {
                            objP2 = new ka6(str, (byte) 9);
                            fetVar.o0(objP2);
                        }
                        mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1899381698);
                        fetVar.r(false);
                    }
                    u12 u12Var1112 = u12Var3;
                    mm40 mm40Var1113 = mm40Var4;
                    mm40 mm40VarK119 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var1112, qgeVar4, f4, a4dVar4, 2);
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = r71.w;
                        fetVar.o0(objP);
                    }
                    tj30 tj30Var119 = (tj30) objP;
                    int iHashCode119 = Long.hashCode(fetVar.T);
                    mm40 mm40VarC118 = kbc.c0(fetVar, mm40VarK119);
                    bh90 bh90VarM119 = fetVar.m();
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30Var119, gqw0.x);
                    jpm0.o(fetVar, bh90VarM119, gqw0.w);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC118, gqw0.v);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode119), gqw0.y);
                    fetVar.r(true);
                    f3 = f4;
                    a4dVar3 = a4dVar4;
                    u12Var2 = u12Var1112;
                    qgeVar3 = qgeVar4;
                    mm40Var3 = mm40Var1113;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    qgeVar3 = qgeVar2;
                    f3 = f2;
                    a4dVar3 = a4dVar2;
                    u12Var2 = u12Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.i0x
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 1572864;
            a4dVar2 = a4dVar;
            i12 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i12 & 1, z)) {
                mm40VarA = jm40.b;
                if (i13 != 0) {
                    mm40Var4 = mm40VarA;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i4 != 0) {
                    u12Var3 = gqw0.e;
                } else {
                    u12Var3 = u12Var;
                }
                if (i6 != 0) {
                    qgeVar4 = gqw0.B;
                } else {
                    qgeVar4 = qgeVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    a4dVar4 = null;
                } else {
                    a4dVar4 = a4dVar2;
                }
                cl5Var = ukd.f35823a;
                if (str != null) {
                    fetVar.e0(1899222916);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP2 = fetVar.P();
                    if (z2) {
                        objP2 = new ka6(str, (byte) 9);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new ka6(str, (byte) 9);
                        fetVar.o0(objP2);
                    }
                    mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1899381698);
                    fetVar.r(false);
                }
                u12 u12Var1113 = u12Var3;
                mm40 mm40Var1114 = mm40Var4;
                mm40 mm40VarK1110 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var1113, qgeVar4, f4, a4dVar4, 2);
                objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = r71.w;
                    fetVar.o0(objP);
                }
                tj30 tj30Var1110 = (tj30) objP;
                int iHashCode1110 = Long.hashCode(fetVar.T);
                mm40 mm40VarC119 = kbc.c0(fetVar, mm40VarK1110);
                bh90 bh90VarM1110 = fetVar.m();
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30Var1110, gqw0.x);
                jpm0.o(fetVar, bh90VarM1110, gqw0.w);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC119, gqw0.v);
                jpm0.o(fetVar, Integer.valueOf(iHashCode1110), gqw0.y);
                fetVar.r(true);
                f3 = f4;
                a4dVar3 = a4dVar4;
                u12Var2 = u12Var1113;
                qgeVar3 = qgeVar4;
                mm40Var3 = mm40Var1114;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                qgeVar3 = qgeVar2;
                f3 = f2;
                a4dVar3 = a4dVar2;
                u12Var2 = u12Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.i0x
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 196608;
        f2 = f;
        i10 = i2 & 64;
        if (i10 != 0) {
            if ((1572864 & i) == 0) {
                a4dVar2 = a4dVar;
                if (fetVar.g(a4dVar2)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i12 = i3;
            if ((i3 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i12 & 1, z)) {
                mm40VarA = jm40.b;
                if (i13 != 0) {
                    mm40Var4 = mm40VarA;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i4 != 0) {
                    u12Var3 = gqw0.e;
                } else {
                    u12Var3 = u12Var;
                }
                if (i6 != 0) {
                    qgeVar4 = gqw0.B;
                } else {
                    qgeVar4 = qgeVar2;
                }
                if (i8 != 0) {
                    f4 = 1.0f;
                } else {
                    f4 = f2;
                }
                if (i10 != 0) {
                    a4dVar4 = null;
                } else {
                    a4dVar4 = a4dVar2;
                }
                cl5Var = ukd.f35823a;
                if (str != null) {
                    fetVar.e0(1899222916);
                    if ((i12 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP2 = fetVar.P();
                    if (z2) {
                        objP2 = new ka6(str, (byte) 9);
                        fetVar.o0(objP2);
                    } else {
                        objP2 = new ka6(str, (byte) 9);
                        fetVar.o0(objP2);
                    }
                    mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1899381698);
                    fetVar.r(false);
                }
                u12 u12Var1114 = u12Var3;
                mm40 mm40Var1115 = mm40Var4;
                mm40 mm40VarK1111 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var1114, qgeVar4, f4, a4dVar4, 2);
                objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = r71.w;
                    fetVar.o0(objP);
                }
                tj30 tj30Var1111 = (tj30) objP;
                int iHashCode1111 = Long.hashCode(fetVar.T);
                mm40 mm40VarC1110 = kbc.c0(fetVar, mm40VarK1111);
                bh90 bh90VarM1111 = fetVar.m();
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30Var1111, gqw0.x);
                jpm0.o(fetVar, bh90VarM1111, gqw0.w);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC1110, gqw0.v);
                jpm0.o(fetVar, Integer.valueOf(iHashCode1111), gqw0.y);
                fetVar.r(true);
                f3 = f4;
                a4dVar3 = a4dVar4;
                u12Var2 = u12Var1114;
                qgeVar3 = qgeVar4;
                mm40Var3 = mm40Var1115;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                qgeVar3 = qgeVar2;
                f3 = f2;
                a4dVar3 = a4dVar2;
                u12Var2 = u12Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.i0x
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 1572864;
        a4dVar2 = a4dVar;
        i12 = i3;
        if ((i3 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i12 & 1, z)) {
            mm40VarA = jm40.b;
            if (i13 != 0) {
                mm40Var4 = mm40VarA;
            } else {
                mm40Var4 = mm40Var2;
            }
            if (i4 != 0) {
                u12Var3 = gqw0.e;
            } else {
                u12Var3 = u12Var;
            }
            if (i6 != 0) {
                qgeVar4 = gqw0.B;
            } else {
                qgeVar4 = qgeVar2;
            }
            if (i8 != 0) {
                f4 = 1.0f;
            } else {
                f4 = f2;
            }
            if (i10 != 0) {
                a4dVar4 = null;
            } else {
                a4dVar4 = a4dVar2;
            }
            cl5Var = ukd.f35823a;
            if (str != null) {
                fetVar.e0(1899222916);
                if ((i12 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP2 = fetVar.P();
                if (z2) {
                    objP2 = new ka6(str, (byte) 9);
                    fetVar.o0(objP2);
                } else {
                    objP2 = new ka6(str, (byte) 9);
                    fetVar.o0(objP2);
                }
                mm40VarA = pai0.a(mm40VarA, false, (Function1) objP2);
                fetVar.r(false);
            } else {
                fetVar.e0(1899381698);
                fetVar.r(false);
            }
            u12 u12Var1115 = u12Var3;
            mm40 mm40Var1116 = mm40Var4;
            mm40 mm40VarK1112 = wb.K(lgb.K(mm40Var4.e(mm40VarA)), pm80Var, u12Var1115, qgeVar4, f4, a4dVar4, 2);
            objP = fetVar.P();
            if (objP == cl5Var) {
                objP = r71.w;
                fetVar.o0(objP);
            }
            tj30 tj30Var1112 = (tj30) objP;
            int iHashCode1112 = Long.hashCode(fetVar.T);
            mm40 mm40VarC1111 = kbc.c0(fetVar, mm40VarK1112);
            bh90 bh90VarM1112 = fetVar.m();
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var1112, gqw0.x);
            jpm0.o(fetVar, bh90VarM1112, gqw0.w);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1111, gqw0.v);
            jpm0.o(fetVar, Integer.valueOf(iHashCode1112), gqw0.y);
            fetVar.r(true);
            f3 = f4;
            a4dVar3 = a4dVar4;
            u12Var2 = u12Var1115;
            qgeVar3 = qgeVar4;
            mm40Var3 = mm40Var1116;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
            qgeVar3 = qgeVar2;
            f3 = f2;
            a4dVar3 = a4dVar2;
            u12Var2 = u12Var;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.i0x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j0x.b(pm80Var, str, mm40Var3, u12Var2, qgeVar3, f3, a4dVar3, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void c(vz2 vz2Var, mm40 mm40Var, fet fetVar, int i, int i2) {
        pge pgeVar = gqw0.B;
        zx7 zx7Var = gqw0.e;
        boolean zG = fetVar.g(vz2Var);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = s5x0.f(vz2Var, 1);
            fetVar.o0(objP);
        }
        b((c78) objP, null, mm40Var, zx7Var, pgeVar, 1.0f, null, fetVar, 56 | (57344 & i), 0);
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(684034654);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar.g(mm40Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            mm40 mm40VarL = s5x0.L(jm40.b, 0.0f, 4.0f, 1);
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarL, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, i2 & 14, 24960, 109560);
            fetVar2 = fetVar;
            jcb.v(null, 0.0f, staticColors.m126getWhite200d7_KjU(), fetVar2, 0, 3);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(str, mm40Var, i);
        }
    }

    public static final void e(mm40 mm40Var, r020 r020Var, boolean z, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(1491155040);
        int i2 = i | (fetVar.g(r020Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            nnw0.g(null, null, false, u1c.M(-2072850250, new gg00(r020Var, mm40Var, z, function1, (byte) 0), fetVar), fetVar, 3072, 7);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hg00(mm40Var, r020Var, z, function1, i, (byte) 0);
        }
    }

    public static final void f(mm40 mm40Var, uv20 uv20Var, xdr xdrVar, xdr xdrVar2, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        xdrVar.getClass();
        xdrVar2.getClass();
        function1.getClass();
        fetVar.g0(505661264);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(uv20Var) : fetVar.i(uv20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(xdrVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarI = s5x0.I(mm40VarQ, new lh80(8.0f, 8.0f, 8.0f, uv20Var.d ? 0.0f : 8.0f));
            int i3 = i2 & 112;
            boolean z = (i3 == 32 || ((i2 & 64) != 0 && fetVar.i(uv20Var))) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new eu20(b, xdrVar, uv20Var);
                fetVar.o0(objP);
            }
            x0x.i(mm40VarI, uv20Var, (Function0) objP, u1c.M(1553703910, new fu20(uv20Var, b), fetVar), u1c.M(995206406, new gu20(uv20Var, b), fetVar), u1c.M(-2039478181, new hu20(uv20Var, function1, b), fetVar), u1c.M(1543746628, new iu20(b, xdrVar2, uv20Var), fetVar), u1c.M(-329466909, new gu20(uv20Var, (byte) 1), fetVar), u1c.M(2092286850, new gu20(uv20Var, (byte) 2), fetVar), fetVar, 115043392 | i3);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ju20(mm40Var2, uv20Var, xdrVar, xdrVar2, function1, i, (byte) 0);
        }
    }

    public static final void g(mm40 mm40Var, sf30 sf30Var, Function1 function1, fet fetVar, int i) {
        int i2;
        a4x a4xVar = sf30Var.f32099a;
        fetVar.g0(1584019029);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(sf30Var) : fetVar.i(sf30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            xcz xczVarA = ddz.a(q3d.i(a4xVar), 0, fetVar, 0, 2);
            pz40 pz40VarD = vcc.D(xczVarA.g, fetVar);
            pz40 pz40VarA0 = v3c.a0(Integer.valueOf(a4xVar.size()), new Object[0], fetVar, 0);
            pz40 pz40VarA1 = v3c.a0(Boolean.FALSE, new Object[0], fetVar, 6);
            boolean zG = fetVar.g(xczVarA) | fetVar.g(pz40VarA1) | fetVar.g(pz40VarD);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            yje yjeVar = null;
            if (zG || objP == obj) {
                Object ruaVar = new rua(xczVarA, pz40VarA1, pz40VarD, yjeVar, (byte) 1);
                fetVar.o0(ruaVar);
                objP = ruaVar;
            }
            m0x0.t(fetVar, xczVarA, (Function2) objP);
            boolean zG2 = fetVar.g(xczVarA) | fetVar.g(pz40VarA0) | fetVar.g(pz40VarA1);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                Object rf30Var = new rf30(xczVarA, pz40VarA0, pz40VarA1, yjeVar, (byte) 0);
                fetVar.o0(rf30Var);
                objP2 = rf30Var;
            }
            m0x0.t(fetVar, xczVarA, (Function2) objP2);
            int i3 = i2;
            a4x a4xVar2 = sf30Var.f32099a;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            tdc.m(o7k0.w(s5x0.L(mm40VarD, 0.0f, 8.0f, 1), 0, false, 3), a4xVar2, q3n.f28061a, ((Boolean) fetVar.k(kr00.f18743a)).booleanValue(), xczVarA, function1, fetVar, ((i3 << 9) & 458752) | 384, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var, (Object) sf30Var, (Object) function1, i, (byte) 4);
        }
    }

    public static final void h(String str, fet fetVar, int i) {
        fetVar.g0(407291509);
        int i2 = (fetVar.g(str) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM126getWhite200d7_KjU = staticColors.m126getWhite200d7_KjU();
            pge pgeVar = gqw0.A;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 36.0f);
            long j = kkg.j;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarN, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f);
            zcl zclVar3 = qmk.c;
            lgb.v(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarJ), s5x0.J(i120.Q(s5x0.J(i120.Q(o7k0.n(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 36.0f), j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f), staticColors.m73getBlack400d7_KjU(), new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), 6.0f), str, R.drawable.ic_sport_color_dota_97, jM126getWhite200d7_KjU, pgeVar, fetVar, 196608 | ((i2 << 6) & 896), 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 11, i, str);
        }
    }

    public static final void i(final mm40 mm40Var, final a4x a4xVar, final ppj0 ppj0Var, final boolean z, float f, final Function1 function1, fet fetVar, final int i, final int i2) {
        int i3;
        float f2;
        final float f3;
        k6z k6zVar;
        a4xVar.getClass();
        ppj0Var.getClass();
        function1.getClass();
        fetVar.g0(-1166446481);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.g(ppj0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                f2 = f;
                int i4 = fetVar.d(f2) ? 16384 : 8192;
                i3 |= i4;
            } else {
                f2 = f;
            }
            i3 |= i4;
        } else {
            f2 = f;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
            } else if ((i2 & 16) != 0) {
                zcl zclVar = qmk.f28987a;
                i3 &= -57345;
                f2 = 0.0f;
            }
            final float f4 = f2;
            fetVar.s();
            zfn zfnVar = bmd.n;
            final k6z k6zVar2 = (k6z) fetVar.k(zfnVar);
            if (z) {
                fetVar.e0(31406998);
                k6zVar = (k6z) fetVar.k(zfnVar);
                fetVar.r(false);
            } else {
                fetVar.e0(31407922);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            byte b = 3;
            final xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new gg90(xczVarA, (byte) 10));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new wda0(l7m0Var, b);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            int i5 = ((i3 >> 6) & 14) | 48;
            boolean z2 = (((i5 & 14) ^ 6) > 4 && fetVar.g(ppj0Var)) || (i5 & 6) == 4;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new pga0(function0, ppj0Var);
                fetVar.o0(objP3);
            }
            final pga0 pga0Var = (pga0) objP3;
            obc.d(zfnVar.a(k6zVar), u1c.M(-2140257361, new Function2() { // from class: a.mga0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    fet fetVar2 = (fet) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                        mm40 mm40VarV = cjx.V(mm40Var, pga0Var, null);
                        zcl zclVar2 = qmk.f28987a;
                        lh80 lh80VarU = s5x0.u(0.0f, f4, 0.0f, 24.0f, 5);
                        a4x a4xVar2 = a4xVar;
                        boolean zG = fetVar2.g(a4xVar2);
                        k6z k6zVar3 = k6zVar2;
                        boolean zE = zG | fetVar2.e(k6zVar3.ordinal());
                        boolean z3 = z;
                        boolean zH = zE | fetVar2.h(z3);
                        Function1 function2 = function1;
                        boolean zG2 = zH | fetVar2.g(function2);
                        Object objP4 = fetVar2.P();
                        if (zG2 || objP4 == ukd.f35823a) {
                            t13 t13Var = new t13((Object) a4xVar2, (Object) k6zVar3, z3, (Object) function2, (byte) 17);
                            fetVar2.o0(t13Var);
                            objP4 = t13Var;
                        }
                        b8k0.e(mm40VarV, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP4, fetVar2, 100663296, 248);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 56);
            f3 = f4;
        } else {
            fetVar.X();
            f3 = f2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.nga0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j0x.i(mm40Var, a4xVar, ppj0Var, z, f3, function1, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void j(x0e0 x0e0Var, sek sekVar, bek bekVar, z5s z5sVar, qdz qdzVar, xex xexVar, CyberBottomSheetParams cyberBottomSheetParams, Function1 function1, fet fetVar, int i) {
        byte b;
        x0e0Var.getClass();
        sekVar.getClass();
        bekVar.getClass();
        qdzVar.getClass();
        xexVar.getClass();
        function1.getClass();
        fetVar.g0(-2099439008);
        int i2 = i | (fetVar.g(x0e0Var) ? 4 : 2) | (fetVar.g(sekVar) ? 32 : 16) | (fetVar.g(bekVar) ? 256 : 128) | (fetVar.g(z5sVar) ? 2048 : 1024) | (fetVar.g(qdzVar) ? 16384 : 8192) | (fetVar.g(xexVar) ? 131072 : 65536) | (fetVar.g(cyberBottomSheetParams) ? 1048576 : 524288) | (fetVar.i(function1) ? 8388608 : 4194304);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            int i3 = 29360128 & i2;
            boolean z = i3 == 8388608;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new bac0(function1, (byte) 29);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 8388608;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new evd0(function1, b2);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            l7m0 l7m0Var = x0e0Var.f40068a;
            l7m0 l7m0Var2 = x0e0Var.b;
            l7m0 l7m0Var3 = x0e0Var.c;
            l7m0 l7m0Var4 = x0e0Var.d;
            l7m0 l7m0Var5 = x0e0Var.e;
            l7m0 l7m0Var6 = x0e0Var.f;
            l7m0 l7m0Var7 = x0e0Var.g;
            boolean z3 = i3 == 8388608;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new evd0(function1, (byte) 2);
                fetVar.o0(objP3);
            }
            Function0 function2 = (Function0) objP3;
            boolean z4 = i3 == 8388608;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new evd0(function1, (byte) 3);
                fetVar.o0(objP4);
            }
            Function0 function3 = (Function0) objP4;
            boolean z5 = i3 == 8388608;
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var) {
                objP5 = new evd0(function1, (byte) 4);
                fetVar.o0(objP5);
            }
            Function0 function4 = (Function0) objP5;
            boolean z6 = i3 == 8388608;
            Object objP6 = fetVar.P();
            boolean z7 = z6;
            byte b3 = 5;
            if (z7 || objP6 == cl5Var) {
                objP6 = new evd0(function1, b3);
                fetVar.o0(objP6);
            }
            Function0 function5 = (Function0) objP6;
            boolean z8 = i3 == 8388608;
            Object objP7 = fetVar.P();
            if (z8 || objP7 == cl5Var) {
                objP7 = new dvd0(function1, (byte) 5);
                fetVar.o0(objP7);
            }
            Function1 function6 = (Function1) objP7;
            boolean z9 = i3 == 8388608;
            Object objP8 = fetVar.P();
            boolean z10 = z9;
            byte b4 = 6;
            if (z10 || objP8 == cl5Var) {
                objP8 = new dvd0(function1, b4);
                fetVar.o0(objP8);
            }
            Function1 function7 = (Function1) objP8;
            boolean z11 = i3 == 8388608;
            Object objP9 = fetVar.P();
            if (z11 || objP9 == cl5Var) {
                b = 0;
                objP9 = new dvd0(function1, b);
                fetVar.o0(objP9);
            } else {
                b = 0;
            }
            Function1 function8 = (Function1) objP9;
            if (i3 == 8388608) {
                b = 1;
            }
            Object objP10 = fetVar.P();
            if (b != 0 || objP10 == cl5Var) {
                objP10 = new dvd0(function1, (byte) 1);
                fetVar.o0(objP10);
            }
            mrv.x(l7m0Var, l7m0Var2, l7m0Var3, l7m0Var4, l7m0Var5, l7m0Var6, l7m0Var7, sekVar, bekVar, z5sVar, xexVar, cyberBottomSheetParams, null, false, function2, function3, function4, function5, function6, function7, function8, (Function1) objP10, u1c.M(-881830349, new rkb(function1, qdzVar, (byte) 6), fetVar), fetVar, (i2 << 18) & 2143289344, (i2 >> 15) & 126, 12288);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fw6((Object) x0e0Var, sekVar, bekVar, z5sVar, (Object) qdzVar, (Object) xexVar, (Object) cyberBottomSheetParams, function1, i, (byte) 8);
        }
    }

    public static final void k(mm40 mm40Var, og8 og8Var, fet fetVar, int i) {
        og8 og8Var2 = og8Var;
        fet fetVar2 = fetVar;
        og8Var2.getClass();
        fetVar2.g0(1026969393);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(og8Var2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD, background, vgg0.a(16.0f)), 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(og8Var2.f25204a, mm40VarD2, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 48, 0, 131064);
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            og8Var2 = og8Var;
            v8q0.a(og8Var2.b, mm40VarN, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(mm40Var, og8Var2, i, (byte) 12);
        }
    }

    public static final void l(int i, int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1111702072);
        int i3 = (fetVar.e(i) ? 4 : 2) | i2;
        byte b = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new uli0(i, b);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, null, null, null, null, null, false, null, (Function1) objP, fetVar, 12582918, 382);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(i, i2, mm40Var);
        }
    }

    public static final void m(mm40 mm40Var, r370 r370Var, Function2 function2, fet fetVar, int i) {
        int i2;
        function2.getClass();
        fetVar.g0(1605641);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(r370Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            rhv0 rhv0Var = (rhv0) fetVar.k(bmd.u);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                float fB = bdl.b(((yez) rhv0Var).a());
                zcl zclVar = qmk.f28987a;
                if (ycl.a(fB, 448.0f) > 0) {
                    fB /= 2.0f;
                }
                objP = twn.j(fB, fetVar);
            }
            float f = ((ycl) objP).f42389a;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarS = o7k0.s(jm40.b, f);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarS, qmk.a(fetVar).c, 0.0f, 2);
            boolean z = (i2 & 896) == 256;
            int i3 = i2 & 112;
            boolean z2 = z | (i3 == 32);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new huh0(function2, r370Var, (byte) 20);
                fetVar.o0(objP2);
            }
            epv0.d(mm40VarL, r370Var, (Function1) objP2, fetVar, i3, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) mm40Var, (Object) r370Var, (Object) function2, i, (byte) 18);
        }
    }

    public static final void n(mm40 mm40Var, j3n j3nVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1997834470);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j3nVar) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            kr00.a(u1c.M(-786235651, new p9l0(mm40Var, j3nVar, b), fetVar), fetVar, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) mm40Var, (Object) j3nVar, i, (byte) 9);
        }
    }

    public static final void o(mm40 mm40Var, fr5 fr5Var, int i, Integer num, Function2 function2, fet fetVar, int i2) {
        fr5 fr5Var2;
        mm40 mm40Var2;
        boolean z;
        fet fetVar2 = fetVar;
        fr5Var.getClass();
        function2.getClass();
        fetVar2.g0(1982911563);
        int i3 = i2 | 6 | (fetVar2.g(fr5Var) ? 32 : 16) | (fetVar2.e(i) ? 256 : 128) | (fetVar2.g(num) ? 2048 : 1024) | (fetVar2.i(function2) ? 16384 : 8192);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.b(0);
                fetVar2.o0(objP2);
            }
            cgk0 cgk0Var = (cgk0) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP3);
            }
            pz40 pz40Var2 = (pz40) objP3;
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP4);
            }
            vne vneVar = (vne) objP4;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 128.0f);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 57344) == 16384);
            Object objP5 = fetVar2.P();
            if (z2 || objP5 == cl5Var) {
                objP5 = new pia(function2, fr5Var, pz40Var, (byte) 5);
                fetVar2.o0(objP5);
            }
            mm40 mm40VarW = y860.W(mm40VarN, null, null, false, null, (Function0) objP5, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarE0 = o2e.e0(lgb.J(jr8Var.a(jm40Var), vgg0.a(16.0f)), "SQUARE_L_BANNER_IMAGE");
            o0x o0xVar = fr5Var.b;
            er5 er5Var = fr5Var.f;
            o0x o0xVar2 = fr5Var.g;
            o0x o0xVar3 = fr5Var.c;
            Object objP6 = fetVar2.P();
            if (objP6 == cl5Var) {
                objP6 = new ryc0(pz40Var, (byte) 18);
                fetVar2.o0(objP6);
            }
            int i4 = i3 << 3;
            etl.a(mm40VarE0, o0xVar, o0xVar3, i, num, null, 0.0f, (Function1) objP6, fetVar2, (i4 & 57344) | (i4 & 7168) | 12582912, 96);
            if (o0xVar2 != null) {
                fetVar2.e0(-2086292536);
                z = false;
                etl.d(lgb.J(jr8Var.b(jm40Var, gqw0.b), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), o0xVar2, fetVar2, 0);
                fetVar2.r(false);
            } else {
                z = false;
                fetVar2.e0(-2086026339);
                fetVar2.r(false);
            }
            etl.f(6, fetVar2, null);
            byte b = 2;
            mm40 mm40VarN2 = s5x0.N(s5x0.L(o7k0.u(jr8Var.b(jm40Var, gqw0.g), 0.0f, 128.0f, 1), 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            Object objP7 = fetVar2.P();
            if (objP7 == cl5Var) {
                objP7 = new jt0(pz40Var2, cgk0Var, b);
                fetVar2.o0(objP7);
            }
            mm40 mm40VarE1 = o2e.e0(pai0.a(mm40VarN2, z, (Function1) objP7), "SQUARE_L_BANNER_TEXT");
            fr5Var2 = fr5Var;
            String str = fr5Var2.d;
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            y9q0 y9q0VarA = g1t0.a();
            boolean zI = fetVar2.i(vneVar);
            Object objP8 = fetVar2.P();
            if (zI || objP8 == cl5Var) {
                objP8 = new kt0(vneVar, pz40Var2, cgk0Var, b);
                fetVar2.o0(objP8);
            }
            boolean z3 = z;
            v8q0.a(str, mm40VarE1, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, (Function1) objP8, y9q0VarA, fetVar, 0, 24960, 45048);
            fetVar2 = fetVar;
            if (er5Var != null) {
                fetVar2.e0(-2084905472);
                etl.c(o7k0.u(jm40Var, 0.0f, 130.0f, 1), er5Var, fetVar2, z3 ? 1 : 0, z3 ? 1 : 0);
                fetVar2.r(z3);
            } else {
                fetVar2.e0(-2084775427);
                fetVar2.r(z3);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fr5Var2 = fr5Var;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qia(mm40Var2, fr5Var2, i, num, function2, i2, (byte) 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    public static final void p(mm40 mm40Var, fr5 fr5Var, int i, Integer num, Function2 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        ?? r13;
        boolean z;
        fr5Var.getClass();
        function2.getClass();
        fetVar.g0(-53890858);
        int i3 = i2 | 6 | (fetVar.g(fr5Var) ? 32 : 16) | (fetVar.e(i) ? 256 : 128) | (fetVar.g(num) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 128.0f);
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 57344) == 16384);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = new pia(function2, fr5Var, pz40Var, (byte) 6);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarN, null, null, false, null, (Function0) objP2, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarE0 = o2e.e0(lgb.J(jr8Var.a(jm40Var), vgg0.a(16.0f)), "SQUARE_L_BANNER_IMAGE");
            o0x o0xVar = fr5Var.b;
            er5 er5Var = fr5Var.f;
            o0x o0xVar2 = fr5Var.g;
            o0x o0xVar3 = fr5Var.c;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new ryc0(pz40Var, (byte) 19);
                fetVar.o0(objP3);
            }
            int i4 = i3 << 3;
            etl.a(mm40VarE0, o0xVar, o0xVar3, i, num, null, 0.0f, (Function1) objP3, fetVar, (i4 & 57344) | (i4 & 7168) | 12582912, 96);
            if (o0xVar2 != null) {
                fetVar.e0(1991421841);
                r13 = 0;
                etl.d(lgb.J(jr8Var.b(jm40Var, gqw0.b), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), o0xVar2, fetVar, 0);
                fetVar.r(false);
            } else {
                r13 = 0;
                fetVar.e0(1991688038);
                fetVar.r(false);
            }
            if (er5Var != null) {
                fetVar.e0(1991737545);
                z = true;
                etl.c(o7k0.u(jm40Var, 0.0f, 130.0f, 1), er5Var, fetVar, r13, r13);
                fetVar.r(r13);
            } else {
                z = true;
                fetVar.e0(1991867590);
                fetVar.r(r13);
            }
            fetVar.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qia(mm40Var2, fr5Var, i, num, function2, i2, (byte) 6);
        }
    }

    public static final void q(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1821428673);
        int i2 = i | 6;
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            etl.b(0, fetVar, lgb.J(o7k0.n(jm40Var, 128.0f), vgg0.a(16.0f)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, b);
        }
    }

    public static final SpannableString r(String str, ctf0 ctf0Var, List list, ywu ywuVar) {
        SpannableStringBuilder vmk0Var;
        str.getClass();
        ctf0Var.getClass();
        ywuVar.getClass();
        if (list == null || list.isEmpty()) {
            List list2 = (List) ywuVar.d;
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                ((v3) it.next()).getClass();
            }
            n660 n660Var = (n660) ywuVar.b;
            yxk yxkVar = new yxk((ArrayList) n660Var.f22981a, (xi70) n660Var.c, (ArrayList) n660Var.b);
            int i = 0;
            while (true) {
                int length = str.length();
                int i2 = i;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    }
                    char cCharAt = str.charAt(i2);
                    if (cCharAt == '\n' || cCharAt == '\r') {
                        break;
                    }
                    i2++;
                }
                if (i2 == -1) {
                    break;
                }
                yxkVar.i(str.substring(i, i2));
                i = i2 + 1;
                if (i < str.length() && str.charAt(i2) == '\r' && str.charAt(i) == '\n') {
                    i = i2 + 2;
                }
            }
            if (str.length() > 0 && (i == 0 || i < str.length())) {
                yxkVar.i(str.substring(i));
            }
            yxkVar.f(yxkVar.n);
            lbu lbuVar = new lbu((Object) yxkVar.k, (Object) yxkVar.m, (byte) 22);
            yxkVar.j.getClass();
            kdx kdxVar = new kdx(lbuVar);
            Iterator it2 = yxkVar.o.iterator();
            while (it2.hasNext()) {
                ((a1) it2.next()).f(kdxVar);
            }
            dtw dtwVar = (dtw) yxkVar.l.b;
            Iterator it3 = ((ArrayList) n660Var.d).iterator();
            if (it3.hasNext()) {
                throw rw2.h(it3);
            }
            Iterator it4 = list2.iterator();
            while (it4.hasNext()) {
                ((v3) it4.next()).getClass();
            }
            zpu zpuVar = (zpu) ywuVar.c;
            dgu dguVar = new dgu((w5z) zpuVar.c, new ljf0(), new xmk0(), Collections.unmodifiableMap(((d930) zpuVar.b).f5681a), new bj5());
            dguVar.H(dtwVar);
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                ((v3) it5.next()).getClass();
            }
            xmk0 xmk0Var = (xmk0) dguVar.c;
            vmk0Var = new vmk0(xmk0Var.f41130a);
            for (umk0 umk0Var : xmk0Var.b) {
                vmk0Var.setSpan(umk0Var.f35922a, umk0Var.b, umk0Var.c, umk0Var.d);
            }
            if (TextUtils.isEmpty(vmk0Var) && !TextUtils.isEmpty(str)) {
                vmk0Var = new SpannableStringBuilder(str);
            }
        } else {
            vmk0Var = new SpannableStringBuilder();
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                p830 p830Var = (p830) obj;
                if (i3 != 0) {
                    vmk0Var.append((CharSequence) Separators.RETURN);
                }
                mym0.i(p830Var, str, vmk0Var);
                i3 = i4;
            }
        }
        SpannableString spannableString = new SpannableString(vmk0Var);
        String strR = w6x.r(new Object[0], 0, ctf0Var.b, R.string.deeplink_scheme, "://");
        Linkify.addLinks(spannableString, Pattern.compile(strR.concat("[a-zA-Z0-9?&=/]+")), strR);
        return spannableString;
    }

    public static final Unit s(qpg0 qpg0Var, String str) {
        xpg0 xpg0VarZ0 = qpg0Var.Z0(str);
        try {
            xpg0VarZ0.W0();
            ay3.L(xpg0VarZ0, null);
            return Unit.f46060a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(xpg0VarZ0, th);
                throw th2;
            }
        }
    }

    public static final qey t(qpy qpyVar) {
        qpyVar.getClass();
        zpy zpyVar = qey.c;
        zpyVar.getClass();
        return (qey) slb.V(qpyVar.s, zpyVar);
    }

    public static final wey u(bqy bqyVar) {
        bqyVar.getClass();
        zpy zpyVar = wey.b;
        zpyVar.getClass();
        return (wey) slb.V(bqyVar.l, zpyVar);
    }

    public static final nfy v(dqy dqyVar) {
        dqyVar.getClass();
        zpy zpyVar = nfy.g;
        zpyVar.getClass();
        return (nfy) slb.V(dqyVar.p, zpyVar);
    }

    public static final lgy w(fqy fqyVar) {
        fqyVar.getClass();
        zpy zpyVar = lgy.c;
        zpyVar.getClass();
        return (lgy) slb.V(fqyVar.g, zpyVar);
    }

    public static final String x(long j, ctf0 ctf0Var) {
        ctf0Var.getClass();
        if (j == 1) {
            return ctf0Var.b.a(R.string.penalty, Arrays.copyOf(new Object[0], 0));
        }
        return j == 2 ? ctf0Var.b.a(R.string.bullits, Arrays.copyOf(new Object[0], 0)) : "";
    }

    public static final m0x y(boolean z) {
        return new m0x(z ? R.drawable.ic_promo_settings_placeholder_s : R.drawable.ic_promo_settings_placeholder, null, 6);
    }

    public static final boolean z(x640 x640Var) {
        x640Var.getClass();
        if (x640Var instanceof w640) {
            return ((w640) x640Var).b;
        }
        return false;
    }
}
