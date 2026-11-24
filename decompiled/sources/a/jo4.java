package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.CitizenshipStateModel;
import org.xplatform.registration.visual.impl.presentation.state.models.fields.DocumentStateModel;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final class jo4 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16840a = 2;
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
    public final Object u;
    public final Object v;

    public jo4(tj4 tj4Var, ctf0 ctf0Var) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = ctf0Var;
        jj4 jj4Var = tj4Var.m;
        this.c = bkb.H(jj4Var);
        this.v = ctf0Var.b.a(R.string.auth_visual_socials_label, Arrays.copyOf(new Object[0], 0));
        this.d = maz.b(new a13(this, (byte) 28));
        n0o0 n0o0VarH = bkb.H(Boolean.valueOf(tj4Var.f34034a));
        this.e = n0o0VarH;
        this.f = bkb.H(Boolean.valueOf(tj4Var.o));
        n0o0 n0o0VarH2 = bkb.H(Boolean.valueOf(tj4Var.b));
        this.g = n0o0VarH2;
        this.h = bkb.H(Boolean.valueOf(tj4Var.d));
        this.i = bkb.H(Boolean.valueOf(tj4Var.i));
        this.j = bkb.H(tj4Var.j);
        n0o0 n0o0VarH3 = bkb.H(Boolean.valueOf(tj4Var.k));
        this.k = n0o0VarH3;
        n0o0 n0o0VarH4 = bkb.H(1357);
        final byte b2 = 3;
        this.l = bkb.G(((fee) n0o0VarH.getValue()).d, new ij4((byte) 3));
        final byte b3 = 2;
        this.m = bkb.G(((fee) n0o0VarH3.getValue()).d, new Function1(this) { // from class: a.io4
            public final /* synthetic */ jo4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:0x0399  */
            /* JADX WARN: Code duplicated, block: B:138:0x03c0  */
            /* JADX WARN: Code duplicated, block: B:139:0x03c2  */
            /* JADX WARN: Code duplicated, block: B:142:0x03cc  */
            /* JADX WARN: Code duplicated, block: B:155:0x0223 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:2: B:86:0x0213->B:156:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:161:0x03d6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:4: B:140:0x03c6->B:162:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x012d  */
            /* JADX WARN: Code duplicated, block: B:58:0x0188 A[PHI: r11
  0x0188: PHI (r11v11 int) = (r11v10 int), (r11v10 int), (r11v9 int), (r11v9 int) binds: [B:70:0x019f, B:66:0x0198, B:61:0x018e, B:57:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:81:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:84:0x020c  */
            /* JADX WARN: Code duplicated, block: B:85:0x020f  */
            /* JADX WARN: Code duplicated, block: B:88:0x0219  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Iterator it;
                boolean z;
                int i;
                Iterator it2;
                boolean z2;
                zmm ymmVar;
                Object next;
                lh4 lh4Var;
                byte b4 = b3;
                t7q0 s7q0Var = r7q0.f29989a;
                Object obj2 = null;
                Object obj3 = null;
                jo4 jo4Var = this.b;
                switch (b4) {
                    case 0:
                        hd4 hd4Var = (hd4) obj;
                        hd4Var.getClass();
                        List list = (List) ((fee) jo4Var.j.getValue()).c();
                        ctf0 ctf0Var2 = jo4Var.b;
                        boolean zBooleanValue = ((Boolean) ((fee) jo4Var.f.getValue()).c()).booleanValue();
                        list.getClass();
                        ctf0Var2.getClass();
                        String str = hd4Var.f12852a;
                        p6q0 p6q0Var = zBooleanValue ? o6q0.f24750a : l6q0.f19520a;
                        a6q0 a6q0Var = new a6q0(false, false);
                        for (Object obj4 : list) {
                            if (((lh4) obj4) instanceof hh4) {
                                obj2 = obj4;
                                if (((lh4) obj2) != null) {
                                    s7q0Var = new s7q0(ctf0Var2.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                }
                                t7q0 t7q0Var = s7q0Var;
                                String strA = ctf0Var2.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                                if (list.isEmpty()) {
                                    z = false;
                                } else {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((lh4) it.next()) instanceof hh4) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                }
                                return new s6q0(str, e6q0.f7299a, p6q0Var, t7q0Var, true, z, a6q0Var, strA, null, 32000);
                            }
                        }
                        if (((lh4) obj2) != null) {
                            s7q0Var = new s7q0(ctf0Var2.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        }
                        t7q0 t7q0Var2 = s7q0Var;
                        String strA2 = ctf0Var2.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                        if (list.isEmpty()) {
                            z = false;
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((lh4) it.next()) instanceof hh4) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        return new s6q0(str, e6q0.f7299a, p6q0Var, t7q0Var2, true, z, a6q0Var, strA2, null, 32000);
                    case 1:
                        String str2 = (String) obj;
                        str2.getClass();
                        fee feeVarB = jo4Var.b();
                        ctf0 ctf0Var3 = jo4Var.b;
                        llm llmVar = ((jj4) feeVarB.c()).p ? jlm.f16723a : klm.f18497a;
                        String strA3 = ctf0Var3.b.a(R.string.authorization, Arrays.copyOf(new Object[0], 0));
                        String strA4 = ctf0Var3.b.a(R.string.auth_visual_subtitle_v2, Arrays.copyOf(new Object[]{str2}, 1));
                        StaticColors staticColors = StaticColors.INSTANCE;
                        return new imm(llmVar, new rlm(strA3, strA4, staticColors.m123getWhite0d7_KjU(), staticColors.m123getWhite0d7_KjU(), fa50.f9191a), fmm.f9790a, staticColors.m121getTransparent0d7_KjU(), false, null);
                    case 2:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(nul.e, oe9.f25112a, new ue9(jo4Var.b.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(mul.e, oe9.b, new ue9(jo4Var.b.b.a(R.string.forgot_password, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        if (!((jj4) jo4Var.b().c()).b) {
                            return null;
                        }
                        if (((jj4) jo4Var.b().c()).c || ((jj4) jo4Var.b().c()).d) {
                            return new wul(lul.e, oe9.f25112a, new te9(zBooleanValue2 ? R.drawable.ic_glyph_message : R.drawable.ic_glyph_device), true, false, true);
                        }
                        return null;
                    case 5:
                        gd4 gd4Var = (gd4) obj;
                        gd4Var.getClass();
                        ctf0 ctf0Var4 = jo4Var.b;
                        boolean z3 = ((jj4) jo4Var.b().c()).c;
                        boolean z4 = ((jj4) jo4Var.b().c()).d;
                        boolean zBooleanValue3 = ((Boolean) ((fee) jo4Var.e.getValue()).c()).booleanValue();
                        if (z3 || z4 || zBooleanValue3) {
                            int i2 = R.string.login_title;
                            if ((z3 || !z4 || zBooleanValue3) && !(!z3 && z4 && zBooleanValue3)) {
                                i2 = R.string.email_or_id_new;
                                if ((!z3 || z4 || zBooleanValue3) && !(z3 && !z4 && zBooleanValue3)) {
                                    i = R.string.login_user;
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = R.string.id;
                        }
                        String strA5 = ctf0Var4.b.a(i, Arrays.copyOf(new Object[0], 0));
                        List list2 = (List) ((fee) jo4Var.j.getValue()).c();
                        list2.getClass();
                        ctf0Var4.getClass();
                        String str3 = gd4Var.f11089a;
                        oie.f25306a.getClass();
                        y5q0 y5q0Var = new y5q0(1, null, mie.b.a(mie.d), 2);
                        for (Object obj5 : list2) {
                            if (((lh4) obj5) instanceof gh4) {
                                obj3 = obj5;
                                if (((lh4) obj3) != null) {
                                    s7q0Var = new s7q0(ctf0Var4.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                }
                                t7q0 t7q0Var3 = s7q0Var;
                                if (list2.isEmpty()) {
                                    z2 = false;
                                } else {
                                    it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (((lh4) it2.next()) instanceof gh4) {
                                            z2 = true;
                                        }
                                    }
                                    z2 = false;
                                }
                                return new s6q0(str3, e6q0.f7299a, o6q0.f24750a, t7q0Var3, true, z2, y5q0Var, strA5, null, 32000);
                            }
                        }
                        if (((lh4) obj3) != null) {
                            s7q0Var = new s7q0(ctf0Var4.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        }
                        t7q0 t7q0Var4 = s7q0Var;
                        if (list2.isEmpty()) {
                            z2 = false;
                        } else {
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (((lh4) it2.next()) instanceof gh4) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        return new s6q0(str3, e6q0.f7299a, o6q0.f24750a, t7q0Var4, true, z2, y5q0Var, strA5, null, 32000);
                    default:
                        id4 id4Var = (id4) obj;
                        id4Var.getClass();
                        List list3 = (List) ((fee) jo4Var.j.getValue()).c();
                        ctf0 ctf0Var5 = jo4Var.b;
                        boolean zBooleanValue4 = ((Boolean) ((fee) jo4Var.i.getValue()).c()).booleanValue();
                        list3.getClass();
                        ctf0Var5.getClass();
                        String str4 = id4Var.b;
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str5 = id4Var.e;
                        String strConcat = id4Var.c;
                        str5.getClass();
                        if (str5.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str5, ujn.h, false) || kotlin.text.c.x(str5, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str5);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str5, '/'));
                        }
                        String string = sb.toString();
                        lsm0 lsm0Var = ctf0Var5.b;
                        String strA6 = lsm0Var.a(R.string.restore_password_by_phone_code_hint, Arrays.copyOf(new Object[0], 0));
                        if (strConcat.length() == 0) {
                            ymmVar = new xmm(strA6);
                        } else {
                            if (!kotlin.text.c.x(strConcat, "+", false) && strConcat.length() > 0) {
                                strConcat = "+".concat(strConcat);
                            }
                            ymmVar = new ymm(strConcat, (!zBooleanValue4 || string.length() <= 0) ? new m0x(R.drawable.ic_glyph_language, null, 6) : new n0x(string), strA6, (y3d) null, 48);
                        }
                        String str6 = id4Var.f14564a;
                        String strA7 = lsm0Var.a(R.string.phone, Arrays.copyOf(new Object[0], 0));
                        str4.getClass();
                        knm knmVar = new knm(str6, strA7, new bm90(str4), Integer.valueOf(id4Var.d), new yu90(str4));
                        Iterator it3 = list3.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = it3.next();
                                lh4Var = (lh4) next;
                                if (!(lh4Var instanceof kh4)) {
                                }
                            } else {
                                next = null;
                            }
                            return new inm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                        } while (!(lh4Var instanceof ih4));
                        return new inm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                }
            }
        });
        this.n = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.io4
            public final /* synthetic */ jo4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:0x0399  */
            /* JADX WARN: Code duplicated, block: B:138:0x03c0  */
            /* JADX WARN: Code duplicated, block: B:139:0x03c2  */
            /* JADX WARN: Code duplicated, block: B:142:0x03cc  */
            /* JADX WARN: Code duplicated, block: B:155:0x0223 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:2: B:86:0x0213->B:156:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:161:0x03d6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:4: B:140:0x03c6->B:162:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x012d  */
            /* JADX WARN: Code duplicated, block: B:58:0x0188 A[PHI: r11
  0x0188: PHI (r11v11 int) = (r11v10 int), (r11v10 int), (r11v9 int), (r11v9 int) binds: [B:70:0x019f, B:66:0x0198, B:61:0x018e, B:57:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:81:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:84:0x020c  */
            /* JADX WARN: Code duplicated, block: B:85:0x020f  */
            /* JADX WARN: Code duplicated, block: B:88:0x0219  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Iterator it;
                boolean z;
                int i;
                Iterator it2;
                boolean z2;
                zmm ymmVar;
                Object next;
                lh4 lh4Var;
                byte b4 = b2;
                t7q0 s7q0Var = r7q0.f29989a;
                Object obj2 = null;
                Object obj3 = null;
                jo4 jo4Var = this.b;
                switch (b4) {
                    case 0:
                        hd4 hd4Var = (hd4) obj;
                        hd4Var.getClass();
                        List list = (List) ((fee) jo4Var.j.getValue()).c();
                        ctf0 ctf0Var2 = jo4Var.b;
                        boolean zBooleanValue = ((Boolean) ((fee) jo4Var.f.getValue()).c()).booleanValue();
                        list.getClass();
                        ctf0Var2.getClass();
                        String str = hd4Var.f12852a;
                        p6q0 p6q0Var = zBooleanValue ? o6q0.f24750a : l6q0.f19520a;
                        a6q0 a6q0Var = new a6q0(false, false);
                        for (Object obj4 : list) {
                            if (((lh4) obj4) instanceof hh4) {
                                obj2 = obj4;
                                if (((lh4) obj2) != null) {
                                    s7q0Var = new s7q0(ctf0Var2.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                }
                                t7q0 t7q0Var2 = s7q0Var;
                                String strA2 = ctf0Var2.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                                if (list.isEmpty()) {
                                    z = false;
                                } else {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((lh4) it.next()) instanceof hh4) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                }
                                return new s6q0(str, e6q0.f7299a, p6q0Var, t7q0Var2, true, z, a6q0Var, strA2, null, 32000);
                            }
                        }
                        if (((lh4) obj2) != null) {
                            s7q0Var = new s7q0(ctf0Var2.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        }
                        t7q0 t7q0Var3 = s7q0Var;
                        String strA3 = ctf0Var2.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                        if (list.isEmpty()) {
                            z = false;
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((lh4) it.next()) instanceof hh4) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        return new s6q0(str, e6q0.f7299a, p6q0Var, t7q0Var3, true, z, a6q0Var, strA3, null, 32000);
                    case 1:
                        String str2 = (String) obj;
                        str2.getClass();
                        fee feeVarB = jo4Var.b();
                        ctf0 ctf0Var3 = jo4Var.b;
                        llm llmVar = ((jj4) feeVarB.c()).p ? jlm.f16723a : klm.f18497a;
                        String strA4 = ctf0Var3.b.a(R.string.authorization, Arrays.copyOf(new Object[0], 0));
                        String strA5 = ctf0Var3.b.a(R.string.auth_visual_subtitle_v2, Arrays.copyOf(new Object[]{str2}, 1));
                        StaticColors staticColors = StaticColors.INSTANCE;
                        return new imm(llmVar, new rlm(strA4, strA5, staticColors.m123getWhite0d7_KjU(), staticColors.m123getWhite0d7_KjU(), fa50.f9191a), fmm.f9790a, staticColors.m121getTransparent0d7_KjU(), false, null);
                    case 2:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(nul.e, oe9.f25112a, new ue9(jo4Var.b.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(mul.e, oe9.b, new ue9(jo4Var.b.b.a(R.string.forgot_password, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        if (!((jj4) jo4Var.b().c()).b) {
                            return null;
                        }
                        if (((jj4) jo4Var.b().c()).c || ((jj4) jo4Var.b().c()).d) {
                            return new wul(lul.e, oe9.f25112a, new te9(zBooleanValue2 ? R.drawable.ic_glyph_message : R.drawable.ic_glyph_device), true, false, true);
                        }
                        return null;
                    case 5:
                        gd4 gd4Var = (gd4) obj;
                        gd4Var.getClass();
                        ctf0 ctf0Var4 = jo4Var.b;
                        boolean z3 = ((jj4) jo4Var.b().c()).c;
                        boolean z4 = ((jj4) jo4Var.b().c()).d;
                        boolean zBooleanValue3 = ((Boolean) ((fee) jo4Var.e.getValue()).c()).booleanValue();
                        if (z3 || z4 || zBooleanValue3) {
                            int i2 = R.string.login_title;
                            if ((z3 || !z4 || zBooleanValue3) && !(!z3 && z4 && zBooleanValue3)) {
                                i2 = R.string.email_or_id_new;
                                if ((!z3 || z4 || zBooleanValue3) && !(z3 && !z4 && zBooleanValue3)) {
                                    i = R.string.login_user;
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = R.string.id;
                        }
                        String strA6 = ctf0Var4.b.a(i, Arrays.copyOf(new Object[0], 0));
                        List list2 = (List) ((fee) jo4Var.j.getValue()).c();
                        list2.getClass();
                        ctf0Var4.getClass();
                        String str3 = gd4Var.f11089a;
                        oie.f25306a.getClass();
                        y5q0 y5q0Var = new y5q0(1, null, mie.b.a(mie.d), 2);
                        for (Object obj5 : list2) {
                            if (((lh4) obj5) instanceof gh4) {
                                obj3 = obj5;
                                if (((lh4) obj3) != null) {
                                    s7q0Var = new s7q0(ctf0Var4.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                }
                                t7q0 t7q0Var4 = s7q0Var;
                                if (list2.isEmpty()) {
                                    z2 = false;
                                } else {
                                    it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (((lh4) it2.next()) instanceof gh4) {
                                            z2 = true;
                                        }
                                    }
                                    z2 = false;
                                }
                                return new s6q0(str3, e6q0.f7299a, o6q0.f24750a, t7q0Var4, true, z2, y5q0Var, strA6, null, 32000);
                            }
                        }
                        if (((lh4) obj3) != null) {
                            s7q0Var = new s7q0(ctf0Var4.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        }
                        t7q0 t7q0Var5 = s7q0Var;
                        if (list2.isEmpty()) {
                            z2 = false;
                        } else {
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (((lh4) it2.next()) instanceof gh4) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        return new s6q0(str3, e6q0.f7299a, o6q0.f24750a, t7q0Var5, true, z2, y5q0Var, strA6, null, 32000);
                    default:
                        id4 id4Var = (id4) obj;
                        id4Var.getClass();
                        List list3 = (List) ((fee) jo4Var.j.getValue()).c();
                        ctf0 ctf0Var5 = jo4Var.b;
                        boolean zBooleanValue4 = ((Boolean) ((fee) jo4Var.i.getValue()).c()).booleanValue();
                        list3.getClass();
                        ctf0Var5.getClass();
                        String str4 = id4Var.b;
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str5 = id4Var.e;
                        String strConcat = id4Var.c;
                        str5.getClass();
                        if (str5.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str5, ujn.h, false) || kotlin.text.c.x(str5, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str5);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str5, '/'));
                        }
                        String string = sb.toString();
                        lsm0 lsm0Var = ctf0Var5.b;
                        String strA7 = lsm0Var.a(R.string.restore_password_by_phone_code_hint, Arrays.copyOf(new Object[0], 0));
                        if (strConcat.length() == 0) {
                            ymmVar = new xmm(strA7);
                        } else {
                            if (!kotlin.text.c.x(strConcat, "+", false) && strConcat.length() > 0) {
                                strConcat = "+".concat(strConcat);
                            }
                            ymmVar = new ymm(strConcat, (!zBooleanValue4 || string.length() <= 0) ? new m0x(R.drawable.ic_glyph_language, null, 6) : new n0x(string), strA7, (y3d) null, 48);
                        }
                        String str6 = id4Var.f14564a;
                        String strA8 = lsm0Var.a(R.string.phone, Arrays.copyOf(new Object[0], 0));
                        str4.getClass();
                        knm knmVar = new knm(str6, strA8, new bm90(str4), Integer.valueOf(id4Var.d), new yu90(str4));
                        Iterator it3 = list3.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = it3.next();
                                lh4Var = (lh4) next;
                                if (!(lh4Var instanceof kh4)) {
                                }
                            } else {
                                next = null;
                            }
                            return new inm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                        } while (!(lh4Var instanceof ih4));
                        return new inm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                }
            }
        });
        final byte b4 = 4;
        this.o = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.io4
            public final /* synthetic */ jo4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:0x0399  */
            /* JADX WARN: Code duplicated, block: B:138:0x03c0  */
            /* JADX WARN: Code duplicated, block: B:139:0x03c2  */
            /* JADX WARN: Code duplicated, block: B:142:0x03cc  */
            /* JADX WARN: Code duplicated, block: B:155:0x0223 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:2: B:86:0x0213->B:156:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:161:0x03d6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:4: B:140:0x03c6->B:162:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x012d  */
            /* JADX WARN: Code duplicated, block: B:58:0x0188 A[PHI: r11
  0x0188: PHI (r11v11 int) = (r11v10 int), (r11v10 int), (r11v9 int), (r11v9 int) binds: [B:70:0x019f, B:66:0x0198, B:61:0x018e, B:57:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:81:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:84:0x020c  */
            /* JADX WARN: Code duplicated, block: B:85:0x020f  */
            /* JADX WARN: Code duplicated, block: B:88:0x0219  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Iterator it;
                boolean z;
                int i;
                Iterator it2;
                boolean z2;
                zmm ymmVar;
                Object next;
                lh4 lh4Var;
                byte b5 = b4;
                t7q0 s7q0Var = r7q0.f29989a;
                Object obj2 = null;
                Object obj3 = null;
                jo4 jo4Var = this.b;
                switch (b5) {
                    case 0:
                        hd4 hd4Var = (hd4) obj;
                        hd4Var.getClass();
                        List list = (List) ((fee) jo4Var.j.getValue()).c();
                        ctf0 ctf0Var2 = jo4Var.b;
                        boolean zBooleanValue = ((Boolean) ((fee) jo4Var.f.getValue()).c()).booleanValue();
                        list.getClass();
                        ctf0Var2.getClass();
                        String str = hd4Var.f12852a;
                        p6q0 p6q0Var = zBooleanValue ? o6q0.f24750a : l6q0.f19520a;
                        a6q0 a6q0Var = new a6q0(false, false);
                        for (Object obj4 : list) {
                            if (((lh4) obj4) instanceof hh4) {
                                obj2 = obj4;
                                if (((lh4) obj2) != null) {
                                    s7q0Var = new s7q0(ctf0Var2.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                }
                                t7q0 t7q0Var3 = s7q0Var;
                                String strA3 = ctf0Var2.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                                if (list.isEmpty()) {
                                    z = false;
                                } else {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((lh4) it.next()) instanceof hh4) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                }
                                return new s6q0(str, e6q0.f7299a, p6q0Var, t7q0Var3, true, z, a6q0Var, strA3, null, 32000);
                            }
                        }
                        if (((lh4) obj2) != null) {
                            s7q0Var = new s7q0(ctf0Var2.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        }
                        t7q0 t7q0Var4 = s7q0Var;
                        String strA4 = ctf0Var2.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                        if (list.isEmpty()) {
                            z = false;
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((lh4) it.next()) instanceof hh4) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        return new s6q0(str, e6q0.f7299a, p6q0Var, t7q0Var4, true, z, a6q0Var, strA4, null, 32000);
                    case 1:
                        String str2 = (String) obj;
                        str2.getClass();
                        fee feeVarB = jo4Var.b();
                        ctf0 ctf0Var3 = jo4Var.b;
                        llm llmVar = ((jj4) feeVarB.c()).p ? jlm.f16723a : klm.f18497a;
                        String strA5 = ctf0Var3.b.a(R.string.authorization, Arrays.copyOf(new Object[0], 0));
                        String strA6 = ctf0Var3.b.a(R.string.auth_visual_subtitle_v2, Arrays.copyOf(new Object[]{str2}, 1));
                        StaticColors staticColors = StaticColors.INSTANCE;
                        return new imm(llmVar, new rlm(strA5, strA6, staticColors.m123getWhite0d7_KjU(), staticColors.m123getWhite0d7_KjU(), fa50.f9191a), fmm.f9790a, staticColors.m121getTransparent0d7_KjU(), false, null);
                    case 2:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(nul.e, oe9.f25112a, new ue9(jo4Var.b.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(mul.e, oe9.b, new ue9(jo4Var.b.b.a(R.string.forgot_password, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        if (!((jj4) jo4Var.b().c()).b) {
                            return null;
                        }
                        if (((jj4) jo4Var.b().c()).c || ((jj4) jo4Var.b().c()).d) {
                            return new wul(lul.e, oe9.f25112a, new te9(zBooleanValue2 ? R.drawable.ic_glyph_message : R.drawable.ic_glyph_device), true, false, true);
                        }
                        return null;
                    case 5:
                        gd4 gd4Var = (gd4) obj;
                        gd4Var.getClass();
                        ctf0 ctf0Var4 = jo4Var.b;
                        boolean z3 = ((jj4) jo4Var.b().c()).c;
                        boolean z4 = ((jj4) jo4Var.b().c()).d;
                        boolean zBooleanValue3 = ((Boolean) ((fee) jo4Var.e.getValue()).c()).booleanValue();
                        if (z3 || z4 || zBooleanValue3) {
                            int i2 = R.string.login_title;
                            if ((z3 || !z4 || zBooleanValue3) && !(!z3 && z4 && zBooleanValue3)) {
                                i2 = R.string.email_or_id_new;
                                if ((!z3 || z4 || zBooleanValue3) && !(z3 && !z4 && zBooleanValue3)) {
                                    i = R.string.login_user;
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = R.string.id;
                        }
                        String strA7 = ctf0Var4.b.a(i, Arrays.copyOf(new Object[0], 0));
                        List list2 = (List) ((fee) jo4Var.j.getValue()).c();
                        list2.getClass();
                        ctf0Var4.getClass();
                        String str3 = gd4Var.f11089a;
                        oie.f25306a.getClass();
                        y5q0 y5q0Var = new y5q0(1, null, mie.b.a(mie.d), 2);
                        for (Object obj5 : list2) {
                            if (((lh4) obj5) instanceof gh4) {
                                obj3 = obj5;
                                if (((lh4) obj3) != null) {
                                    s7q0Var = new s7q0(ctf0Var4.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                }
                                t7q0 t7q0Var5 = s7q0Var;
                                if (list2.isEmpty()) {
                                    z2 = false;
                                } else {
                                    it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (((lh4) it2.next()) instanceof gh4) {
                                            z2 = true;
                                        }
                                    }
                                    z2 = false;
                                }
                                return new s6q0(str3, e6q0.f7299a, o6q0.f24750a, t7q0Var5, true, z2, y5q0Var, strA7, null, 32000);
                            }
                        }
                        if (((lh4) obj3) != null) {
                            s7q0Var = new s7q0(ctf0Var4.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        }
                        t7q0 t7q0Var6 = s7q0Var;
                        if (list2.isEmpty()) {
                            z2 = false;
                        } else {
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (((lh4) it2.next()) instanceof gh4) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        return new s6q0(str3, e6q0.f7299a, o6q0.f24750a, t7q0Var6, true, z2, y5q0Var, strA7, null, 32000);
                    default:
                        id4 id4Var = (id4) obj;
                        id4Var.getClass();
                        List list3 = (List) ((fee) jo4Var.j.getValue()).c();
                        ctf0 ctf0Var5 = jo4Var.b;
                        boolean zBooleanValue4 = ((Boolean) ((fee) jo4Var.i.getValue()).c()).booleanValue();
                        list3.getClass();
                        ctf0Var5.getClass();
                        String str4 = id4Var.b;
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str5 = id4Var.e;
                        String strConcat = id4Var.c;
                        str5.getClass();
                        if (str5.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str5, ujn.h, false) || kotlin.text.c.x(str5, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str5);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str5, '/'));
                        }
                        String string = sb.toString();
                        lsm0 lsm0Var = ctf0Var5.b;
                        String strA8 = lsm0Var.a(R.string.restore_password_by_phone_code_hint, Arrays.copyOf(new Object[0], 0));
                        if (strConcat.length() == 0) {
                            ymmVar = new xmm(strA8);
                        } else {
                            if (!kotlin.text.c.x(strConcat, "+", false) && strConcat.length() > 0) {
                                strConcat = "+".concat(strConcat);
                            }
                            ymmVar = new ymm(strConcat, (!zBooleanValue4 || string.length() <= 0) ? new m0x(R.drawable.ic_glyph_language, null, 6) : new n0x(string), strA8, (y3d) null, 48);
                        }
                        String str6 = id4Var.f14564a;
                        String strA9 = lsm0Var.a(R.string.phone, Arrays.copyOf(new Object[0], 0));
                        str4.getClass();
                        knm knmVar = new knm(str6, strA9, new bm90(str4), Integer.valueOf(id4Var.d), new yu90(str4));
                        Iterator it3 = list3.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = it3.next();
                                lh4Var = (lh4) next;
                                if (!(lh4Var instanceof kh4)) {
                                }
                            } else {
                                next = null;
                            }
                            return new inm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                        } while (!(lh4Var instanceof ih4));
                        return new inm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                }
            }
        });
        this.p = bkb.G(((fee) n0o0VarH4.getValue()).d, new ij4((byte) 4));
        this.q = maz.b(new yw9(tj4Var.c, new ij4(this), (byte) 20));
        final byte b5 = 5;
        this.r = maz.b(new yw9(tj4Var.e, new Function1(this) { // from class: a.io4
            public final /* synthetic */ jo4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:0x0399  */
            /* JADX WARN: Code duplicated, block: B:138:0x03c0  */
            /* JADX WARN: Code duplicated, block: B:139:0x03c2  */
            /* JADX WARN: Code duplicated, block: B:142:0x03cc  */
            /* JADX WARN: Code duplicated, block: B:155:0x0223 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:2: B:86:0x0213->B:156:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:161:0x03d6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:4: B:140:0x03c6->B:162:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x012d  */
            /* JADX WARN: Code duplicated, block: B:58:0x0188 A[PHI: r11
  0x0188: PHI (r11v11 int) = (r11v10 int), (r11v10 int), (r11v9 int), (r11v9 int) binds: [B:70:0x019f, B:66:0x0198, B:61:0x018e, B:57:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:81:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:84:0x020c  */
            /* JADX WARN: Code duplicated, block: B:85:0x020f  */
            /* JADX WARN: Code duplicated, block: B:88:0x0219  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Iterator it;
                boolean z;
                int i;
                Iterator it2;
                boolean z2;
                zmm ymmVar;
                Object next;
                lh4 lh4Var;
                byte b6 = b5;
                t7q0 s7q0Var = r7q0.f29989a;
                Object obj2 = null;
                Object obj3 = null;
                jo4 jo4Var = this.b;
                switch (b6) {
                    case 0:
                        hd4 hd4Var = (hd4) obj;
                        hd4Var.getClass();
                        List list = (List) ((fee) jo4Var.j.getValue()).c();
                        ctf0 ctf0Var2 = jo4Var.b;
                        boolean zBooleanValue = ((Boolean) ((fee) jo4Var.f.getValue()).c()).booleanValue();
                        list.getClass();
                        ctf0Var2.getClass();
                        String str = hd4Var.f12852a;
                        p6q0 p6q0Var = zBooleanValue ? o6q0.f24750a : l6q0.f19520a;
                        a6q0 a6q0Var = new a6q0(false, false);
                        for (Object obj4 : list) {
                            if (((lh4) obj4) instanceof hh4) {
                                obj2 = obj4;
                                if (((lh4) obj2) != null) {
                                    s7q0Var = new s7q0(ctf0Var2.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                }
                                t7q0 t7q0Var4 = s7q0Var;
                                String strA4 = ctf0Var2.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                                if (list.isEmpty()) {
                                    z = false;
                                } else {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((lh4) it.next()) instanceof hh4) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                }
                                return new s6q0(str, e6q0.f7299a, p6q0Var, t7q0Var4, true, z, a6q0Var, strA4, null, 32000);
                            }
                        }
                        if (((lh4) obj2) != null) {
                            s7q0Var = new s7q0(ctf0Var2.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        }
                        t7q0 t7q0Var5 = s7q0Var;
                        String strA5 = ctf0Var2.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                        if (list.isEmpty()) {
                            z = false;
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((lh4) it.next()) instanceof hh4) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        return new s6q0(str, e6q0.f7299a, p6q0Var, t7q0Var5, true, z, a6q0Var, strA5, null, 32000);
                    case 1:
                        String str2 = (String) obj;
                        str2.getClass();
                        fee feeVarB = jo4Var.b();
                        ctf0 ctf0Var3 = jo4Var.b;
                        llm llmVar = ((jj4) feeVarB.c()).p ? jlm.f16723a : klm.f18497a;
                        String strA6 = ctf0Var3.b.a(R.string.authorization, Arrays.copyOf(new Object[0], 0));
                        String strA7 = ctf0Var3.b.a(R.string.auth_visual_subtitle_v2, Arrays.copyOf(new Object[]{str2}, 1));
                        StaticColors staticColors = StaticColors.INSTANCE;
                        return new imm(llmVar, new rlm(strA6, strA7, staticColors.m123getWhite0d7_KjU(), staticColors.m123getWhite0d7_KjU(), fa50.f9191a), fmm.f9790a, staticColors.m121getTransparent0d7_KjU(), false, null);
                    case 2:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(nul.e, oe9.f25112a, new ue9(jo4Var.b.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(mul.e, oe9.b, new ue9(jo4Var.b.b.a(R.string.forgot_password, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        if (!((jj4) jo4Var.b().c()).b) {
                            return null;
                        }
                        if (((jj4) jo4Var.b().c()).c || ((jj4) jo4Var.b().c()).d) {
                            return new wul(lul.e, oe9.f25112a, new te9(zBooleanValue2 ? R.drawable.ic_glyph_message : R.drawable.ic_glyph_device), true, false, true);
                        }
                        return null;
                    case 5:
                        gd4 gd4Var = (gd4) obj;
                        gd4Var.getClass();
                        ctf0 ctf0Var4 = jo4Var.b;
                        boolean z3 = ((jj4) jo4Var.b().c()).c;
                        boolean z4 = ((jj4) jo4Var.b().c()).d;
                        boolean zBooleanValue3 = ((Boolean) ((fee) jo4Var.e.getValue()).c()).booleanValue();
                        if (z3 || z4 || zBooleanValue3) {
                            int i2 = R.string.login_title;
                            if ((z3 || !z4 || zBooleanValue3) && !(!z3 && z4 && zBooleanValue3)) {
                                i2 = R.string.email_or_id_new;
                                if ((!z3 || z4 || zBooleanValue3) && !(z3 && !z4 && zBooleanValue3)) {
                                    i = R.string.login_user;
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = R.string.id;
                        }
                        String strA8 = ctf0Var4.b.a(i, Arrays.copyOf(new Object[0], 0));
                        List list2 = (List) ((fee) jo4Var.j.getValue()).c();
                        list2.getClass();
                        ctf0Var4.getClass();
                        String str3 = gd4Var.f11089a;
                        oie.f25306a.getClass();
                        y5q0 y5q0Var = new y5q0(1, null, mie.b.a(mie.d), 2);
                        for (Object obj5 : list2) {
                            if (((lh4) obj5) instanceof gh4) {
                                obj3 = obj5;
                                if (((lh4) obj3) != null) {
                                    s7q0Var = new s7q0(ctf0Var4.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                }
                                t7q0 t7q0Var6 = s7q0Var;
                                if (list2.isEmpty()) {
                                    z2 = false;
                                } else {
                                    it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (((lh4) it2.next()) instanceof gh4) {
                                            z2 = true;
                                        }
                                    }
                                    z2 = false;
                                }
                                return new s6q0(str3, e6q0.f7299a, o6q0.f24750a, t7q0Var6, true, z2, y5q0Var, strA8, null, 32000);
                            }
                        }
                        if (((lh4) obj3) != null) {
                            s7q0Var = new s7q0(ctf0Var4.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        }
                        t7q0 t7q0Var7 = s7q0Var;
                        if (list2.isEmpty()) {
                            z2 = false;
                        } else {
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (((lh4) it2.next()) instanceof gh4) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        return new s6q0(str3, e6q0.f7299a, o6q0.f24750a, t7q0Var7, true, z2, y5q0Var, strA8, null, 32000);
                    default:
                        id4 id4Var = (id4) obj;
                        id4Var.getClass();
                        List list3 = (List) ((fee) jo4Var.j.getValue()).c();
                        ctf0 ctf0Var5 = jo4Var.b;
                        boolean zBooleanValue4 = ((Boolean) ((fee) jo4Var.i.getValue()).c()).booleanValue();
                        list3.getClass();
                        ctf0Var5.getClass();
                        String str4 = id4Var.b;
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str5 = id4Var.e;
                        String strConcat = id4Var.c;
                        str5.getClass();
                        if (str5.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str5, ujn.h, false) || kotlin.text.c.x(str5, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str5);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str5, '/'));
                        }
                        String string = sb.toString();
                        lsm0 lsm0Var = ctf0Var5.b;
                        String strA9 = lsm0Var.a(R.string.restore_password_by_phone_code_hint, Arrays.copyOf(new Object[0], 0));
                        if (strConcat.length() == 0) {
                            ymmVar = new xmm(strA9);
                        } else {
                            if (!kotlin.text.c.x(strConcat, "+", false) && strConcat.length() > 0) {
                                strConcat = "+".concat(strConcat);
                            }
                            ymmVar = new ymm(strConcat, (!zBooleanValue4 || string.length() <= 0) ? new m0x(R.drawable.ic_glyph_language, null, 6) : new n0x(string), strA9, (y3d) null, 48);
                        }
                        String str6 = id4Var.f14564a;
                        String strA10 = lsm0Var.a(R.string.phone, Arrays.copyOf(new Object[0], 0));
                        str4.getClass();
                        knm knmVar = new knm(str6, strA10, new bm90(str4), Integer.valueOf(id4Var.d), new yu90(str4));
                        Iterator it3 = list3.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = it3.next();
                                lh4Var = (lh4) next;
                                if (!(lh4Var instanceof kh4)) {
                                }
                            } else {
                                next = null;
                            }
                            return new inm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                        } while (!(lh4Var instanceof ih4));
                        return new inm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                }
            }
        }, (byte) 20));
        final byte b6 = 6;
        this.s = maz.b(new yw9(tj4Var.g, new Function1(this) { // from class: a.io4
            public final /* synthetic */ jo4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:0x0399  */
            /* JADX WARN: Code duplicated, block: B:138:0x03c0  */
            /* JADX WARN: Code duplicated, block: B:139:0x03c2  */
            /* JADX WARN: Code duplicated, block: B:142:0x03cc  */
            /* JADX WARN: Code duplicated, block: B:155:0x0223 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:2: B:86:0x0213->B:156:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:161:0x03d6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:4: B:140:0x03c6->B:162:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x012d  */
            /* JADX WARN: Code duplicated, block: B:58:0x0188 A[PHI: r11
  0x0188: PHI (r11v11 int) = (r11v10 int), (r11v10 int), (r11v9 int), (r11v9 int) binds: [B:70:0x019f, B:66:0x0198, B:61:0x018e, B:57:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:81:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:84:0x020c  */
            /* JADX WARN: Code duplicated, block: B:85:0x020f  */
            /* JADX WARN: Code duplicated, block: B:88:0x0219  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Iterator it;
                boolean z;
                int i;
                Iterator it2;
                boolean z2;
                zmm ymmVar;
                Object next;
                lh4 lh4Var;
                byte b7 = b6;
                t7q0 s7q0Var = r7q0.f29989a;
                Object obj2 = null;
                Object obj3 = null;
                jo4 jo4Var = this.b;
                switch (b7) {
                    case 0:
                        hd4 hd4Var = (hd4) obj;
                        hd4Var.getClass();
                        List list = (List) ((fee) jo4Var.j.getValue()).c();
                        ctf0 ctf0Var2 = jo4Var.b;
                        boolean zBooleanValue = ((Boolean) ((fee) jo4Var.f.getValue()).c()).booleanValue();
                        list.getClass();
                        ctf0Var2.getClass();
                        String str = hd4Var.f12852a;
                        p6q0 p6q0Var = zBooleanValue ? o6q0.f24750a : l6q0.f19520a;
                        a6q0 a6q0Var = new a6q0(false, false);
                        for (Object obj4 : list) {
                            if (((lh4) obj4) instanceof hh4) {
                                obj2 = obj4;
                                if (((lh4) obj2) != null) {
                                    s7q0Var = new s7q0(ctf0Var2.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                }
                                t7q0 t7q0Var5 = s7q0Var;
                                String strA5 = ctf0Var2.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                                if (list.isEmpty()) {
                                    z = false;
                                } else {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((lh4) it.next()) instanceof hh4) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                }
                                return new s6q0(str, e6q0.f7299a, p6q0Var, t7q0Var5, true, z, a6q0Var, strA5, null, 32000);
                            }
                        }
                        if (((lh4) obj2) != null) {
                            s7q0Var = new s7q0(ctf0Var2.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        }
                        t7q0 t7q0Var6 = s7q0Var;
                        String strA6 = ctf0Var2.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                        if (list.isEmpty()) {
                            z = false;
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((lh4) it.next()) instanceof hh4) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        return new s6q0(str, e6q0.f7299a, p6q0Var, t7q0Var6, true, z, a6q0Var, strA6, null, 32000);
                    case 1:
                        String str2 = (String) obj;
                        str2.getClass();
                        fee feeVarB = jo4Var.b();
                        ctf0 ctf0Var3 = jo4Var.b;
                        llm llmVar = ((jj4) feeVarB.c()).p ? jlm.f16723a : klm.f18497a;
                        String strA7 = ctf0Var3.b.a(R.string.authorization, Arrays.copyOf(new Object[0], 0));
                        String strA8 = ctf0Var3.b.a(R.string.auth_visual_subtitle_v2, Arrays.copyOf(new Object[]{str2}, 1));
                        StaticColors staticColors = StaticColors.INSTANCE;
                        return new imm(llmVar, new rlm(strA7, strA8, staticColors.m123getWhite0d7_KjU(), staticColors.m123getWhite0d7_KjU(), fa50.f9191a), fmm.f9790a, staticColors.m121getTransparent0d7_KjU(), false, null);
                    case 2:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(nul.e, oe9.f25112a, new ue9(jo4Var.b.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(mul.e, oe9.b, new ue9(jo4Var.b.b.a(R.string.forgot_password, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        if (!((jj4) jo4Var.b().c()).b) {
                            return null;
                        }
                        if (((jj4) jo4Var.b().c()).c || ((jj4) jo4Var.b().c()).d) {
                            return new wul(lul.e, oe9.f25112a, new te9(zBooleanValue2 ? R.drawable.ic_glyph_message : R.drawable.ic_glyph_device), true, false, true);
                        }
                        return null;
                    case 5:
                        gd4 gd4Var = (gd4) obj;
                        gd4Var.getClass();
                        ctf0 ctf0Var4 = jo4Var.b;
                        boolean z3 = ((jj4) jo4Var.b().c()).c;
                        boolean z4 = ((jj4) jo4Var.b().c()).d;
                        boolean zBooleanValue3 = ((Boolean) ((fee) jo4Var.e.getValue()).c()).booleanValue();
                        if (z3 || z4 || zBooleanValue3) {
                            int i2 = R.string.login_title;
                            if ((z3 || !z4 || zBooleanValue3) && !(!z3 && z4 && zBooleanValue3)) {
                                i2 = R.string.email_or_id_new;
                                if ((!z3 || z4 || zBooleanValue3) && !(z3 && !z4 && zBooleanValue3)) {
                                    i = R.string.login_user;
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = R.string.id;
                        }
                        String strA9 = ctf0Var4.b.a(i, Arrays.copyOf(new Object[0], 0));
                        List list2 = (List) ((fee) jo4Var.j.getValue()).c();
                        list2.getClass();
                        ctf0Var4.getClass();
                        String str3 = gd4Var.f11089a;
                        oie.f25306a.getClass();
                        y5q0 y5q0Var = new y5q0(1, null, mie.b.a(mie.d), 2);
                        for (Object obj5 : list2) {
                            if (((lh4) obj5) instanceof gh4) {
                                obj3 = obj5;
                                if (((lh4) obj3) != null) {
                                    s7q0Var = new s7q0(ctf0Var4.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                }
                                t7q0 t7q0Var7 = s7q0Var;
                                if (list2.isEmpty()) {
                                    z2 = false;
                                } else {
                                    it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (((lh4) it2.next()) instanceof gh4) {
                                            z2 = true;
                                        }
                                    }
                                    z2 = false;
                                }
                                return new s6q0(str3, e6q0.f7299a, o6q0.f24750a, t7q0Var7, true, z2, y5q0Var, strA9, null, 32000);
                            }
                        }
                        if (((lh4) obj3) != null) {
                            s7q0Var = new s7q0(ctf0Var4.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        }
                        t7q0 t7q0Var8 = s7q0Var;
                        if (list2.isEmpty()) {
                            z2 = false;
                        } else {
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (((lh4) it2.next()) instanceof gh4) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        return new s6q0(str3, e6q0.f7299a, o6q0.f24750a, t7q0Var8, true, z2, y5q0Var, strA9, null, 32000);
                    default:
                        id4 id4Var = (id4) obj;
                        id4Var.getClass();
                        List list3 = (List) ((fee) jo4Var.j.getValue()).c();
                        ctf0 ctf0Var5 = jo4Var.b;
                        boolean zBooleanValue4 = ((Boolean) ((fee) jo4Var.i.getValue()).c()).booleanValue();
                        list3.getClass();
                        ctf0Var5.getClass();
                        String str4 = id4Var.b;
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str5 = id4Var.e;
                        String strConcat = id4Var.c;
                        str5.getClass();
                        if (str5.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str5, ujn.h, false) || kotlin.text.c.x(str5, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str5);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str5, '/'));
                        }
                        String string = sb.toString();
                        lsm0 lsm0Var = ctf0Var5.b;
                        String strA10 = lsm0Var.a(R.string.restore_password_by_phone_code_hint, Arrays.copyOf(new Object[0], 0));
                        if (strConcat.length() == 0) {
                            ymmVar = new xmm(strA10);
                        } else {
                            if (!kotlin.text.c.x(strConcat, "+", false) && strConcat.length() > 0) {
                                strConcat = "+".concat(strConcat);
                            }
                            ymmVar = new ymm(strConcat, (!zBooleanValue4 || string.length() <= 0) ? new m0x(R.drawable.ic_glyph_language, null, 6) : new n0x(string), strA10, (y3d) null, 48);
                        }
                        String str6 = id4Var.f14564a;
                        String strA11 = lsm0Var.a(R.string.phone, Arrays.copyOf(new Object[0], 0));
                        str4.getClass();
                        knm knmVar = new knm(str6, strA11, new bm90(str4), Integer.valueOf(id4Var.d), new yu90(str4));
                        Iterator it3 = list3.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = it3.next();
                                lh4Var = (lh4) next;
                                if (!(lh4Var instanceof kh4)) {
                                }
                            } else {
                                next = null;
                            }
                            return new inm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                        } while (!(lh4Var instanceof ih4));
                        return new inm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                }
            }
        }, (byte) 20));
        this.t = maz.b(new yw9(tj4Var.f, new Function1(this) { // from class: a.io4
            public final /* synthetic */ jo4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:0x0399  */
            /* JADX WARN: Code duplicated, block: B:138:0x03c0  */
            /* JADX WARN: Code duplicated, block: B:139:0x03c2  */
            /* JADX WARN: Code duplicated, block: B:142:0x03cc  */
            /* JADX WARN: Code duplicated, block: B:155:0x0223 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:2: B:86:0x0213->B:156:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:161:0x03d6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:4: B:140:0x03c6->B:162:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x012d  */
            /* JADX WARN: Code duplicated, block: B:58:0x0188 A[PHI: r11
  0x0188: PHI (r11v11 int) = (r11v10 int), (r11v10 int), (r11v9 int), (r11v9 int) binds: [B:70:0x019f, B:66:0x0198, B:61:0x018e, B:57:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:81:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:84:0x020c  */
            /* JADX WARN: Code duplicated, block: B:85:0x020f  */
            /* JADX WARN: Code duplicated, block: B:88:0x0219  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Iterator it;
                boolean z;
                int i;
                Iterator it2;
                boolean z2;
                zmm ymmVar;
                Object next;
                lh4 lh4Var;
                byte b7 = b;
                t7q0 s7q0Var = r7q0.f29989a;
                Object obj2 = null;
                Object obj3 = null;
                jo4 jo4Var = this.b;
                switch (b7) {
                    case 0:
                        hd4 hd4Var = (hd4) obj;
                        hd4Var.getClass();
                        List list = (List) ((fee) jo4Var.j.getValue()).c();
                        ctf0 ctf0Var2 = jo4Var.b;
                        boolean zBooleanValue = ((Boolean) ((fee) jo4Var.f.getValue()).c()).booleanValue();
                        list.getClass();
                        ctf0Var2.getClass();
                        String str = hd4Var.f12852a;
                        p6q0 p6q0Var = zBooleanValue ? o6q0.f24750a : l6q0.f19520a;
                        a6q0 a6q0Var = new a6q0(false, false);
                        for (Object obj4 : list) {
                            if (((lh4) obj4) instanceof hh4) {
                                obj2 = obj4;
                                if (((lh4) obj2) != null) {
                                    s7q0Var = new s7q0(ctf0Var2.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                }
                                t7q0 t7q0Var6 = s7q0Var;
                                String strA6 = ctf0Var2.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                                if (list.isEmpty()) {
                                    z = false;
                                } else {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((lh4) it.next()) instanceof hh4) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                }
                                return new s6q0(str, e6q0.f7299a, p6q0Var, t7q0Var6, true, z, a6q0Var, strA6, null, 32000);
                            }
                        }
                        if (((lh4) obj2) != null) {
                            s7q0Var = new s7q0(ctf0Var2.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        }
                        t7q0 t7q0Var7 = s7q0Var;
                        String strA7 = ctf0Var2.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                        if (list.isEmpty()) {
                            z = false;
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((lh4) it.next()) instanceof hh4) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        return new s6q0(str, e6q0.f7299a, p6q0Var, t7q0Var7, true, z, a6q0Var, strA7, null, 32000);
                    case 1:
                        String str2 = (String) obj;
                        str2.getClass();
                        fee feeVarB = jo4Var.b();
                        ctf0 ctf0Var3 = jo4Var.b;
                        llm llmVar = ((jj4) feeVarB.c()).p ? jlm.f16723a : klm.f18497a;
                        String strA8 = ctf0Var3.b.a(R.string.authorization, Arrays.copyOf(new Object[0], 0));
                        String strA9 = ctf0Var3.b.a(R.string.auth_visual_subtitle_v2, Arrays.copyOf(new Object[]{str2}, 1));
                        StaticColors staticColors = StaticColors.INSTANCE;
                        return new imm(llmVar, new rlm(strA8, strA9, staticColors.m123getWhite0d7_KjU(), staticColors.m123getWhite0d7_KjU(), fa50.f9191a), fmm.f9790a, staticColors.m121getTransparent0d7_KjU(), false, null);
                    case 2:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(nul.e, oe9.f25112a, new ue9(jo4Var.b.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(mul.e, oe9.b, new ue9(jo4Var.b.b.a(R.string.forgot_password, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        if (!((jj4) jo4Var.b().c()).b) {
                            return null;
                        }
                        if (((jj4) jo4Var.b().c()).c || ((jj4) jo4Var.b().c()).d) {
                            return new wul(lul.e, oe9.f25112a, new te9(zBooleanValue2 ? R.drawable.ic_glyph_message : R.drawable.ic_glyph_device), true, false, true);
                        }
                        return null;
                    case 5:
                        gd4 gd4Var = (gd4) obj;
                        gd4Var.getClass();
                        ctf0 ctf0Var4 = jo4Var.b;
                        boolean z3 = ((jj4) jo4Var.b().c()).c;
                        boolean z4 = ((jj4) jo4Var.b().c()).d;
                        boolean zBooleanValue3 = ((Boolean) ((fee) jo4Var.e.getValue()).c()).booleanValue();
                        if (z3 || z4 || zBooleanValue3) {
                            int i2 = R.string.login_title;
                            if ((z3 || !z4 || zBooleanValue3) && !(!z3 && z4 && zBooleanValue3)) {
                                i2 = R.string.email_or_id_new;
                                if ((!z3 || z4 || zBooleanValue3) && !(z3 && !z4 && zBooleanValue3)) {
                                    i = R.string.login_user;
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = R.string.id;
                        }
                        String strA10 = ctf0Var4.b.a(i, Arrays.copyOf(new Object[0], 0));
                        List list2 = (List) ((fee) jo4Var.j.getValue()).c();
                        list2.getClass();
                        ctf0Var4.getClass();
                        String str3 = gd4Var.f11089a;
                        oie.f25306a.getClass();
                        y5q0 y5q0Var = new y5q0(1, null, mie.b.a(mie.d), 2);
                        for (Object obj5 : list2) {
                            if (((lh4) obj5) instanceof gh4) {
                                obj3 = obj5;
                                if (((lh4) obj3) != null) {
                                    s7q0Var = new s7q0(ctf0Var4.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                }
                                t7q0 t7q0Var8 = s7q0Var;
                                if (list2.isEmpty()) {
                                    z2 = false;
                                } else {
                                    it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (((lh4) it2.next()) instanceof gh4) {
                                            z2 = true;
                                        }
                                    }
                                    z2 = false;
                                }
                                return new s6q0(str3, e6q0.f7299a, o6q0.f24750a, t7q0Var8, true, z2, y5q0Var, strA10, null, 32000);
                            }
                        }
                        if (((lh4) obj3) != null) {
                            s7q0Var = new s7q0(ctf0Var4.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        }
                        t7q0 t7q0Var9 = s7q0Var;
                        if (list2.isEmpty()) {
                            z2 = false;
                        } else {
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (((lh4) it2.next()) instanceof gh4) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        return new s6q0(str3, e6q0.f7299a, o6q0.f24750a, t7q0Var9, true, z2, y5q0Var, strA10, null, 32000);
                    default:
                        id4 id4Var = (id4) obj;
                        id4Var.getClass();
                        List list3 = (List) ((fee) jo4Var.j.getValue()).c();
                        ctf0 ctf0Var5 = jo4Var.b;
                        boolean zBooleanValue4 = ((Boolean) ((fee) jo4Var.i.getValue()).c()).booleanValue();
                        list3.getClass();
                        ctf0Var5.getClass();
                        String str4 = id4Var.b;
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str5 = id4Var.e;
                        String strConcat = id4Var.c;
                        str5.getClass();
                        if (str5.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str5, ujn.h, false) || kotlin.text.c.x(str5, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str5);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str5, '/'));
                        }
                        String string = sb.toString();
                        lsm0 lsm0Var = ctf0Var5.b;
                        String strA11 = lsm0Var.a(R.string.restore_password_by_phone_code_hint, Arrays.copyOf(new Object[0], 0));
                        if (strConcat.length() == 0) {
                            ymmVar = new xmm(strA11);
                        } else {
                            if (!kotlin.text.c.x(strConcat, "+", false) && strConcat.length() > 0) {
                                strConcat = "+".concat(strConcat);
                            }
                            ymmVar = new ymm(strConcat, (!zBooleanValue4 || string.length() <= 0) ? new m0x(R.drawable.ic_glyph_language, null, 6) : new n0x(string), strA11, (y3d) null, 48);
                        }
                        String str6 = id4Var.f14564a;
                        String strA12 = lsm0Var.a(R.string.phone, Arrays.copyOf(new Object[0], 0));
                        str4.getClass();
                        knm knmVar = new knm(str6, strA12, new bm90(str4), Integer.valueOf(id4Var.d), new yu90(str4));
                        Iterator it3 = list3.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = it3.next();
                                lh4Var = (lh4) next;
                                if (!(lh4Var instanceof kh4)) {
                                }
                            } else {
                                next = null;
                            }
                            return new inm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                        } while (!(lh4Var instanceof ih4));
                        return new inm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                }
            }
        }, (byte) 20));
        final byte b7 = 1;
        this.u = maz.b(new yw9(jj4Var.o, new Function1(this) { // from class: a.io4
            public final /* synthetic */ jo4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:135:0x0399  */
            /* JADX WARN: Code duplicated, block: B:138:0x03c0  */
            /* JADX WARN: Code duplicated, block: B:139:0x03c2  */
            /* JADX WARN: Code duplicated, block: B:142:0x03cc  */
            /* JADX WARN: Code duplicated, block: B:155:0x0223 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:2: B:86:0x0213->B:156:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:161:0x03d6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:4: B:140:0x03c6->B:162:?, LOOP_END, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:46:0x012d  */
            /* JADX WARN: Code duplicated, block: B:58:0x0188 A[PHI: r11
  0x0188: PHI (r11v11 int) = (r11v10 int), (r11v10 int), (r11v9 int), (r11v9 int) binds: [B:70:0x019f, B:66:0x0198, B:61:0x018e, B:57:0x0186] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:81:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:84:0x020c  */
            /* JADX WARN: Code duplicated, block: B:85:0x020f  */
            /* JADX WARN: Code duplicated, block: B:88:0x0219  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Iterator it;
                boolean z;
                int i;
                Iterator it2;
                boolean z2;
                zmm ymmVar;
                Object next;
                lh4 lh4Var;
                byte b8 = b7;
                t7q0 s7q0Var = r7q0.f29989a;
                Object obj2 = null;
                Object obj3 = null;
                jo4 jo4Var = this.b;
                switch (b8) {
                    case 0:
                        hd4 hd4Var = (hd4) obj;
                        hd4Var.getClass();
                        List list = (List) ((fee) jo4Var.j.getValue()).c();
                        ctf0 ctf0Var2 = jo4Var.b;
                        boolean zBooleanValue = ((Boolean) ((fee) jo4Var.f.getValue()).c()).booleanValue();
                        list.getClass();
                        ctf0Var2.getClass();
                        String str = hd4Var.f12852a;
                        p6q0 p6q0Var = zBooleanValue ? o6q0.f24750a : l6q0.f19520a;
                        a6q0 a6q0Var = new a6q0(false, false);
                        for (Object obj4 : list) {
                            if (((lh4) obj4) instanceof hh4) {
                                obj2 = obj4;
                                if (((lh4) obj2) != null) {
                                    s7q0Var = new s7q0(ctf0Var2.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                }
                                t7q0 t7q0Var7 = s7q0Var;
                                String strA7 = ctf0Var2.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                                if (list.isEmpty()) {
                                    z = false;
                                } else {
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        if (((lh4) it.next()) instanceof hh4) {
                                            z = true;
                                        }
                                    }
                                    z = false;
                                }
                                return new s6q0(str, e6q0.f7299a, p6q0Var, t7q0Var7, true, z, a6q0Var, strA7, null, 32000);
                            }
                        }
                        if (((lh4) obj2) != null) {
                            s7q0Var = new s7q0(ctf0Var2.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        }
                        t7q0 t7q0Var8 = s7q0Var;
                        String strA8 = ctf0Var2.b.a(R.string.password_title, Arrays.copyOf(new Object[0], 0));
                        if (list.isEmpty()) {
                            z = false;
                        } else {
                            it = list.iterator();
                            while (it.hasNext()) {
                                if (((lh4) it.next()) instanceof hh4) {
                                    z = true;
                                }
                            }
                            z = false;
                        }
                        return new s6q0(str, e6q0.f7299a, p6q0Var, t7q0Var8, true, z, a6q0Var, strA8, null, 32000);
                    case 1:
                        String str2 = (String) obj;
                        str2.getClass();
                        fee feeVarB = jo4Var.b();
                        ctf0 ctf0Var3 = jo4Var.b;
                        llm llmVar = ((jj4) feeVarB.c()).p ? jlm.f16723a : klm.f18497a;
                        String strA9 = ctf0Var3.b.a(R.string.authorization, Arrays.copyOf(new Object[0], 0));
                        String strA10 = ctf0Var3.b.a(R.string.auth_visual_subtitle_v2, Arrays.copyOf(new Object[]{str2}, 1));
                        StaticColors staticColors = StaticColors.INSTANCE;
                        return new imm(llmVar, new rlm(strA9, strA10, staticColors.m123getWhite0d7_KjU(), staticColors.m123getWhite0d7_KjU(), fa50.f9191a), fmm.f9790a, staticColors.m121getTransparent0d7_KjU(), false, null);
                    case 2:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(nul.e, oe9.f25112a, new ue9(jo4Var.b.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 3:
                        if (((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        return new wul(mul.e, oe9.b, new ue9(jo4Var.b.b.a(R.string.forgot_password, Arrays.copyOf(new Object[0], 0))), true, false, false);
                    case 4:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        if (!((jj4) jo4Var.b().c()).b) {
                            return null;
                        }
                        if (((jj4) jo4Var.b().c()).c || ((jj4) jo4Var.b().c()).d) {
                            return new wul(lul.e, oe9.f25112a, new te9(zBooleanValue2 ? R.drawable.ic_glyph_message : R.drawable.ic_glyph_device), true, false, true);
                        }
                        return null;
                    case 5:
                        gd4 gd4Var = (gd4) obj;
                        gd4Var.getClass();
                        ctf0 ctf0Var4 = jo4Var.b;
                        boolean z3 = ((jj4) jo4Var.b().c()).c;
                        boolean z4 = ((jj4) jo4Var.b().c()).d;
                        boolean zBooleanValue3 = ((Boolean) ((fee) jo4Var.e.getValue()).c()).booleanValue();
                        if (z3 || z4 || zBooleanValue3) {
                            int i2 = R.string.login_title;
                            if ((z3 || !z4 || zBooleanValue3) && !(!z3 && z4 && zBooleanValue3)) {
                                i2 = R.string.email_or_id_new;
                                if ((!z3 || z4 || zBooleanValue3) && !(z3 && !z4 && zBooleanValue3)) {
                                    i = R.string.login_user;
                                } else {
                                    i = i2;
                                }
                            } else {
                                i = i2;
                            }
                        } else {
                            i = R.string.id;
                        }
                        String strA11 = ctf0Var4.b.a(i, Arrays.copyOf(new Object[0], 0));
                        List list2 = (List) ((fee) jo4Var.j.getValue()).c();
                        list2.getClass();
                        ctf0Var4.getClass();
                        String str3 = gd4Var.f11089a;
                        oie.f25306a.getClass();
                        y5q0 y5q0Var = new y5q0(1, null, mie.b.a(mie.d), 2);
                        for (Object obj5 : list2) {
                            if (((lh4) obj5) instanceof gh4) {
                                obj3 = obj5;
                                if (((lh4) obj3) != null) {
                                    s7q0Var = new s7q0(ctf0Var4.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                                }
                                t7q0 t7q0Var9 = s7q0Var;
                                if (list2.isEmpty()) {
                                    z2 = false;
                                } else {
                                    it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (((lh4) it2.next()) instanceof gh4) {
                                            z2 = true;
                                        }
                                    }
                                    z2 = false;
                                }
                                return new s6q0(str3, e6q0.f7299a, o6q0.f24750a, t7q0Var9, true, z2, y5q0Var, strA11, null, 32000);
                            }
                        }
                        if (((lh4) obj3) != null) {
                            s7q0Var = new s7q0(ctf0Var4.b.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0)));
                        }
                        t7q0 t7q0Var10 = s7q0Var;
                        if (list2.isEmpty()) {
                            z2 = false;
                        } else {
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (((lh4) it2.next()) instanceof gh4) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        return new s6q0(str3, e6q0.f7299a, o6q0.f24750a, t7q0Var10, true, z2, y5q0Var, strA11, null, 32000);
                    default:
                        id4 id4Var = (id4) obj;
                        id4Var.getClass();
                        List list3 = (List) ((fee) jo4Var.j.getValue()).c();
                        ctf0 ctf0Var5 = jo4Var.b;
                        boolean zBooleanValue4 = ((Boolean) ((fee) jo4Var.i.getValue()).c()).booleanValue();
                        list3.getClass();
                        ctf0Var5.getClass();
                        String str4 = id4Var.b;
                        StringBuilder sb = new StringBuilder(ujn.h);
                        String str5 = id4Var.e;
                        String strConcat = id4Var.c;
                        str5.getClass();
                        if (str5.length() == 0) {
                            sb.setLength(0);
                        } else if (StringsKt.O(str5, ujn.h, false) || kotlin.text.c.x(str5, "https://", false)) {
                            sb.setLength(0);
                            sb.append(str5);
                        } else {
                            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                                sb.append('/');
                            }
                            sb.append(StringsKt.y0(str5, '/'));
                        }
                        String string = sb.toString();
                        lsm0 lsm0Var = ctf0Var5.b;
                        String strA12 = lsm0Var.a(R.string.restore_password_by_phone_code_hint, Arrays.copyOf(new Object[0], 0));
                        if (strConcat.length() == 0) {
                            ymmVar = new xmm(strA12);
                        } else {
                            if (!kotlin.text.c.x(strConcat, "+", false) && strConcat.length() > 0) {
                                strConcat = "+".concat(strConcat);
                            }
                            ymmVar = new ymm(strConcat, (!zBooleanValue4 || string.length() <= 0) ? new m0x(R.drawable.ic_glyph_language, null, 6) : new n0x(string), strA12, (y3d) null, 48);
                        }
                        String str6 = id4Var.f14564a;
                        String strA13 = lsm0Var.a(R.string.phone, Arrays.copyOf(new Object[0], 0));
                        str4.getClass();
                        knm knmVar = new knm(str6, strA13, new bm90(str4), Integer.valueOf(id4Var.d), new yu90(str4));
                        Iterator it3 = list3.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = it3.next();
                                lh4Var = (lh4) next;
                                if (!(lh4Var instanceof kh4)) {
                                }
                            } else {
                                next = null;
                            }
                            return new inm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                        } while (!(lh4Var instanceof ih4));
                        return new inm(ymmVar, knmVar, ((lh4) next) != null ? new anm(lsm0Var.a(R.string.empty_field, Arrays.copyOf(new Object[0], 0))) : null);
                }
            }
        }, (byte) 20));
    }

    public fee a() {
        return (fee) this.c.getValue();
    }

    public fee b() {
        return (fee) this.c.getValue();
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        byte b = this.f16840a;
        n0o0 n0o0Var = this.s;
        n0o0 n0o0Var2 = this.o;
        Object obj2 = this.u;
        n0o0 n0o0Var3 = this.q;
        n0o0 n0o0Var4 = this.p;
        n0o0 n0o0Var5 = this.n;
        n0o0 n0o0Var6 = this.k;
        n0o0 n0o0Var7 = this.m;
        n0o0 n0o0Var8 = this.l;
        n0o0 n0o0Var9 = this.t;
        n0o0 n0o0Var10 = this.h;
        n0o0 n0o0Var11 = this.g;
        n0o0 n0o0Var12 = this.j;
        n0o0 n0o0Var13 = this.i;
        n0o0 n0o0Var14 = this.f;
        n0o0 n0o0Var15 = this.e;
        n0o0 n0o0Var16 = this.d;
        switch (b) {
            case 0:
                tj4 tj4Var = (tj4) obj;
                tj4Var.getClass();
                fee feeVarB = b();
                jj4 jj4Var = tj4Var.m;
                feeVarB.d(jj4Var);
                ((fee) n0o0Var15.getValue()).d(Boolean.valueOf(tj4Var.f34034a));
                ((fee) n0o0Var14.getValue()).d(Boolean.valueOf(tj4Var.o));
                ((fee) n0o0Var11.getValue()).d(Boolean.valueOf(tj4Var.b));
                ((fee) n0o0Var3.getValue()).d(tj4Var.c);
                ((fee) n0o0Var10.getValue()).d(Boolean.valueOf(tj4Var.d));
                ((fee) n0o0Var13.getValue()).d(Boolean.valueOf(tj4Var.i));
                ((fee) n0o0Var12.getValue()).d(tj4Var.j);
                ((fee) n0o0Var6.getValue()).d(Boolean.valueOf(tj4Var.k));
                n0o0 n0o0Var17 = (n0o0) obj2;
                ((fee) n0o0Var17.getValue()).d(jj4Var.o);
                n0o0 n0o0Var18 = this.r;
                ((fee) n0o0Var18.getValue()).d(tj4Var.e);
                ((fee) n0o0Var.getValue()).d(tj4Var.g);
                ((fee) n0o0Var9.getValue()).d(tj4Var.f);
                boolean zBooleanValue = ((Boolean) ((fee) n0o0Var15.getValue()).c()).booleanValue();
                boolean zBooleanValue2 = ((Boolean) ((fee) n0o0Var8.getValue()).b()).booleanValue();
                List list = (List) ((fee) n0o0Var3.getValue()).b();
                return new vj4(((Boolean) ((fee) n0o0Var10.getValue()).c()).booleanValue(), zBooleanValue, zBooleanValue2, list, (s6q0) ((fee) n0o0Var18.getValue()).b(), (s6q0) ((fee) n0o0Var9.getValue()).b(), (inm) ((fee) n0o0Var.getValue()).b(), (imm) ((fee) n0o0Var17.getValue()).b(), (String) ((fee) n0o0Var4.getValue()).b(), (String) this.v, (wul) ((fee) n0o0Var2.getValue()).b(), (wul) ((fee) n0o0Var5.getValue()).b(), (wul) n0o0Var16.getValue(), (wul) ((fee) n0o0Var7.getValue()).b());
            case 1:
                zob0 zob0Var = (zob0) obj;
                zob0Var.getClass();
                ((fee) n0o0Var16.getValue()).d(zob0Var.g);
                ((fee) n0o0Var15.getValue()).d(zob0Var.j);
                ((fee) this.c.getValue()).d(zob0Var.h);
                ((fee) n0o0Var14.getValue()).d(zob0Var.k);
                ((fee) n0o0Var11.getValue()).d(zob0Var.n);
                ((fee) n0o0Var13.getValue()).d(Boolean.valueOf(zob0Var.b));
                ((fee) n0o0Var10.getValue()).d(zob0Var.m);
                ((fee) n0o0Var12.getValue()).d(zob0Var.i);
                return new apb0(((fee) n0o0Var2.getValue()).e, ((fee) n0o0Var9.getValue()).e, ((fee) n0o0Var.getValue()).e);
            default:
                mbf0 mbf0Var = (mbf0) obj;
                mbf0Var.getClass();
                a().d(mbf0Var.j);
                ((fee) n0o0Var16.getValue()).d(mbf0Var.g);
                ((fee) n0o0Var15.getValue()).d(mbf0Var.d);
                ((fee) n0o0Var14.getValue()).d(mbf0Var.c);
                ((fee) n0o0Var13.getValue()).d(mbf0Var.e);
                ((fee) n0o0Var12.getValue()).d(mbf0Var.f);
                ((fee) n0o0Var8.getValue()).d(Boolean.valueOf(mbf0Var.f21505a));
                ((fee) n0o0Var7.getValue()).d(Boolean.valueOf(mbf0Var.b));
                ((fee) n0o0Var11.getValue()).d(mbf0Var.h);
                ((fee) n0o0Var10.getValue()).d(mbf0Var.i);
                ((fee) n0o0Var6.getValue()).d(mbf0Var.k);
                ((fee) n0o0Var5.getValue()).d(mbf0Var.n);
                ((fee) n0o0Var4.getValue()).d(mbf0Var.l);
                ((fee) n0o0Var3.getValue()).d(Boolean.FALSE);
                return new nbf0(((fee) n0o0Var9.getValue()).e, ((fee) ((n0o0) obj2).getValue()).e, ((fee) n0o0Var3.getValue()).e, ((Boolean) ((fee) n0o0Var8.getValue()).c()).booleanValue());
        }
    }

    public jo4(zob0 zob0Var, ctf0 ctf0Var, ocl oclVar) {
        final byte b = 1;
        ctf0Var.getClass();
        this.u = zob0Var;
        this.b = ctf0Var;
        this.v = oclVar;
        n0o0 n0o0VarH = bkb.H(zob0Var.h);
        this.c = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(zob0Var.g);
        this.d = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(zob0Var.j);
        this.e = n0o0VarH3;
        n0o0 n0o0VarH4 = bkb.H(zob0Var.k);
        this.f = n0o0VarH4;
        n0o0 n0o0VarH5 = bkb.H(zob0Var.n);
        this.g = n0o0VarH5;
        n0o0 n0o0VarH6 = bkb.H(zob0Var.m);
        this.h = n0o0VarH6;
        n0o0 n0o0VarH7 = bkb.H(Boolean.valueOf(zob0Var.b));
        this.i = n0o0VarH7;
        n0o0 n0o0VarH8 = bkb.H(zob0Var.i);
        this.j = n0o0VarH8;
        this.k = maz.b(new yw9((fee) n0o0VarH3.getValue(), new peb0((byte) 19), (byte) 20));
        this.l = maz.b(new yw9((fee) n0o0VarH4.getValue(), new peb0((byte) 20), (byte) 20));
        this.m = maz.b(new yw9((fee) n0o0VarH5.getValue(), new peb0((byte) 21), (byte) 20));
        this.n = maz.b(new yw9((fee) n0o0VarH6.getValue(), new peb0((byte) 22), (byte) 20));
        this.o = maz.b(new yw9((fee) n0o0VarH7.getValue(), new peb0((byte) 23), (byte) 20));
        this.p = maz.b(new yw9((fee) n0o0VarH.getValue(), new peb0((byte) 24), (byte) 20));
        this.q = maz.b(new yw9((fee) n0o0VarH2.getValue(), new peb0((byte) 25), (byte) 20));
        this.r = maz.b(new yw9((fee) n0o0VarH8.getValue(), new peb0((byte) 26), (byte) 20));
        fee feeVar = (fee) n0o0VarH2.getValue();
        final byte b2 = 0;
        this.s = maz.b(new yw9(feeVar, new Function1(this) { // from class: a.bpb0
            public final /* synthetic */ jo4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:143:0x04ca  */
            /* JADX WARN: Code duplicated, block: B:144:0x04ce  */
            /* JADX WARN: Code duplicated, block: B:147:0x04df  */
            /* JADX WARN: Code duplicated, block: B:150:0x04ec  */
            /* JADX WARN: Code duplicated, block: B:153:0x04f7  */
            /* JADX WARN: Code duplicated, block: B:155:0x04fc  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v17 java.lang.Object, still in use, count: 2, list:
                  (r4v17 java.lang.Object) from 0x0481: PHI (r4 I:??) = (r4v3 java.lang.Object), (r4v17 java.lang.Object) binds: [B:140:0x0480, B:174:0x0481] A[DONT_GENERATE, DONT_INLINE]
                  (r4v17 java.lang.Object) from 0x0472: CHECK_CAST (a.xco) (r4v17 java.lang.Object)
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
            public final java.lang.Object invoke(java.lang.Object r44) {
                /*
                    Method dump skipped, instruction units count: 1388
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.bpb0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        this.t = maz.b(new yw9((fee) n0o0VarH4.getValue(), new Function1(this) { // from class: a.bpb0
            public final /* synthetic */ jo4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:143:0x04ca  */
            /* JADX WARN: Code duplicated, block: B:144:0x04ce  */
            /* JADX WARN: Code duplicated, block: B:147:0x04df  */
            /* JADX WARN: Code duplicated, block: B:150:0x04ec  */
            /* JADX WARN: Code duplicated, block: B:153:0x04f7  */
            /* JADX WARN: Code duplicated, block: B:155:0x04fc  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v17 java.lang.Object, still in use, count: 2, list:
                  (r4v17 java.lang.Object) from 0x0481: PHI (r4 I:??) = (r4v3 java.lang.Object), (r4v17 java.lang.Object) binds: [B:140:0x0480, B:174:0x0481] A[DONT_GENERATE, DONT_INLINE]
                  (r4v17 java.lang.Object) from 0x0472: CHECK_CAST (a.xco) (r4v17 java.lang.Object)
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
            public final java.lang.Object invoke(java.lang.Object r44) {
                /*
                    Method dump skipped, instruction units count: 1388
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.bpb0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
    }

    public jo4(ctf0 ctf0Var, mbf0 mbf0Var) {
        final byte b = 2;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.v = mbf0Var;
        this.c = bkb.H(mbf0Var.j);
        this.d = bkb.H(mbf0Var.g);
        n0o0 n0o0VarH = bkb.H(mbf0Var.d);
        this.e = n0o0VarH;
        this.f = bkb.H(mbf0Var.c);
        this.g = bkb.H(mbf0Var.h);
        this.h = bkb.H(mbf0Var.i);
        this.i = bkb.H(mbf0Var.e);
        this.j = bkb.H(mbf0Var.f);
        this.k = bkb.H(mbf0Var.k);
        this.l = bkb.H(Boolean.valueOf(mbf0Var.f21505a));
        this.m = bkb.H(Boolean.valueOf(mbf0Var.b));
        this.n = bkb.H(mbf0Var.n);
        n0o0 n0o0VarH2 = bkb.H(1357);
        this.o = n0o0VarH2;
        final byte b2 = 0;
        this.p = maz.b(new yw9(mbf0Var.l, new Function1(this) { // from class: a.obf0
            public final /* synthetic */ jo4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x00a1  */
            /* JADX WARN: Code duplicated, block: B:60:0x01fb  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iK;
                Map map;
                int i;
                Object obj2;
                boolean z;
                int iIntValue;
                Map map2;
                boolean z2;
                Map map3;
                ArrayList arrayList;
                Integer numValueOf;
                ArrayList arrayList2;
                Integer numValueOf2;
                xgk0 xgk0Var;
                int i2;
                Iterator it;
                DocumentStateModel documentStateModel;
                String str;
                byte b3 = b2;
                jo4 jo4Var = this.b;
                switch (b3) {
                    case 0:
                        List<q7f0> list = (List) obj;
                        list.getClass();
                        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                        for (q7f0 q7f0Var : list) {
                            ctf0 ctf0Var2 = jo4Var.b;
                            q7f0 q7f0Var2 = (q7f0) jo4Var.a().c();
                            Integer num = (Integer) ((fee) jo4Var.k.getValue()).c();
                            boolean z3 = ((mbf0) jo4Var.v).r.C;
                            q7f0Var.getClass();
                            ctf0Var2.getClass();
                            long j = q7f0Var.f28247a;
                            String strQ = d5c.Q(q7f0Var, ctf0Var2, num);
                            int iOrdinal = q7f0Var.ordinal();
                            if (iOrdinal == 0) {
                                iK = R.drawable.ic_reg_email;
                            } else if (iOrdinal == 1) {
                                iK = R.drawable.ic_reg_phone_new;
                            } else if (iOrdinal == 2) {
                                iK = R.drawable.ic_reg_one_click_new;
                            } else if (iOrdinal == 3) {
                                iK = num != null ? xvw.K(num.intValue()) : R.drawable.ic_reg_social_network_new;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                iK = z3 ? R.drawable.ic_social_circle_itsme : R.drawable.ic_reg_import_personal_data_new;
                            }
                            arrayList3.add(new lxl(j, (dyl) new ayl(strQ, new m0x(iK, null, 6), Boolean.valueOf(!z3 && (num == null || q7f0Var != q7f0.SOCIAL)), 12), false, q7f0Var == q7f0Var2 ? uxl.b : uxl.f36445a, (cwl) null, 108));
                        }
                        return dyb.o0(arrayList3);
                    case 1:
                        ((Boolean) obj).getClass();
                        return new u9f0(jo4Var.b.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0)), !((Boolean) ((fee) jo4Var.m.getValue()).c()).booleanValue(), true);
                    case 2:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        List list2 = (List) feeVar.c();
                        ctf0 ctf0Var3 = jo4Var.b;
                        List list3 = (List) ((fee) jo4Var.f.getValue()).c();
                        q7f0 q7f0Var3 = (q7f0) jo4Var.a().c();
                        if (q7f0Var3 == null || (map = (Map) ((Map) ((fee) jo4Var.i.getValue()).c()).get(q7f0Var3)) == null) {
                            map = lun.f20680a;
                            map.getClass();
                        }
                        Map map4 = map;
                        p1f0 p1f0Var = (p1f0) ((fee) jo4Var.d.getValue()).c();
                        List list4 = (List) ((fee) jo4Var.j.getValue()).c();
                        mbf0 mbf0Var2 = (mbf0) jo4Var.v;
                        boolean z4 = mbf0Var2.q;
                        sff0 sff0Var = mbf0Var2.m;
                        boolean z5 = sff0Var.m.s;
                        v8d v8dVar = mbf0Var2.r;
                        boolean z6 = v8dVar.J;
                        boolean z7 = sff0Var.N.o;
                        List list5 = v8dVar.K;
                        Map map5 = (Map) ((fee) jo4Var.g.getValue()).c();
                        Map map6 = (Map) ((fee) jo4Var.h.getValue()).c();
                        boolean z8 = ((fee) jo4Var.k.getValue()).c() != null;
                        int iIntValue2 = ((Number) ((fee) jo4Var.o.getValue()).c()).intValue();
                        list2.getClass();
                        ctf0Var3.getClass();
                        list3.getClass();
                        map5.getClass();
                        map6.getClass();
                        p1f0Var.getClass();
                        CitizenshipStateModel citizenshipStateModel = p1f0Var.o;
                        list4.getClass();
                        list5.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                i = iIntValue2;
                                if (((q0f0) next) instanceof pze0) {
                                    obj2 = next;
                                } else {
                                    iIntValue2 = i;
                                }
                            } else {
                                i = iIntValue2;
                                obj2 = null;
                            }
                        }
                        pze0 pze0Var = obj2 instanceof pze0 ? (pze0) obj2 : null;
                        String strJ0 = sj3.j0(pze0Var != null ? pze0Var.e : null, "18");
                        if (list5.isEmpty()) {
                            z = false;
                        } else {
                            String str2 = citizenshipStateModel != null ? citizenshipStateModel.b : null;
                            if (str2 == null || str2.length() == 0 || list5.contains(Integer.valueOf(citizenshipStateModel.f46861a))) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            Object zze0Var = (q0f0) it3.next();
                            String str3 = strJ0;
                            if ((zze0Var instanceof qze0) && z) {
                                it = it3;
                                zze0Var = new qze0(true, false);
                            } else {
                                it = it3;
                                if ((zze0Var instanceof a0f0) && z) {
                                    zze0Var = new a0f0(true, false);
                                } else if ((zze0Var instanceof zze0) && z6 && (documentStateModel = p1f0Var.j) != null && documentStateModel.f46865a == 126) {
                                    zze0Var = new zze0(((zze0) zze0Var).c, false);
                                }
                            }
                            arrayList4.add(zze0Var);
                            strJ0 = str3;
                            it3 = it;
                        }
                        String str4 = strJ0;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj3 : arrayList4) {
                            if (!((q0f0) obj3).a()) {
                                arrayList5.add(obj3);
                            }
                        }
                        if (arrayList5.isEmpty()) {
                            arrayList = arrayList5;
                            z2 = z7;
                            map3 = map5;
                            map2 = map6;
                        } else {
                            Iterator it4 = arrayList5.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((q0f0) it4.next()) instanceof p0f0) {
                                        if (!z8) {
                                            boolean zD = Intrinsics.d(map4.get(u0f0.j), prp.f27476a);
                                            lc00 lc00VarB2 = kotlin.collections.a.b();
                                            Iterator it5 = list4.iterator();
                                            while (it5.hasNext()) {
                                                int iIntValue3 = ((Number) it5.next()).intValue();
                                                if (iIntValue3 == 1) {
                                                    numValueOf = Integer.valueOf(R.string.social_vk);
                                                } else if (iIntValue3 == 5) {
                                                    numValueOf = Integer.valueOf(R.string.social_ok);
                                                } else if (iIntValue3 == 7) {
                                                    numValueOf = Integer.valueOf(R.string.social_yandex);
                                                } else if (iIntValue3 == 9) {
                                                    numValueOf = Integer.valueOf(R.string.social_mailru_label_new);
                                                } else if (iIntValue3 == 11) {
                                                    numValueOf = Integer.valueOf(R.string.social_google);
                                                } else if (iIntValue3 == 13) {
                                                    numValueOf = Integer.valueOf(R.string.social_x_com);
                                                } else if (iIntValue3 == 17) {
                                                    numValueOf = Integer.valueOf(R.string.social_telegram);
                                                } else if (iIntValue3 == 19) {
                                                    numValueOf = Integer.valueOf(R.string.social_apple_id);
                                                } else if (iIntValue3 != 26) {
                                                    numValueOf = iIntValue3 != 31 ? null : Integer.valueOf(R.string.social_discord);
                                                } else {
                                                    numValueOf = Integer.valueOf(R.string.social_its_me);
                                                }
                                                if (numValueOf != null) {
                                                    int iIntValue4 = numValueOf.intValue();
                                                    arrayList2 = arrayList5;
                                                    if (iIntValue3 == 1) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_vk);
                                                    } else if (iIntValue3 == 5) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_ok);
                                                    } else if (iIntValue3 == 7) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_yandex);
                                                    } else if (iIntValue3 == 9) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_mail);
                                                    } else if (iIntValue3 == 11) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_google);
                                                    } else if (iIntValue3 == 13) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_x);
                                                    } else if (iIntValue3 == 17) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_telegram);
                                                    } else if (iIntValue3 == 19) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_apple);
                                                    } else if (iIntValue3 != 26) {
                                                        numValueOf2 = iIntValue3 != 31 ? null : Integer.valueOf(R.drawable.ic_social_circle_discord);
                                                    } else {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_itsme);
                                                    }
                                                    if (numValueOf2 != null) {
                                                        int iIntValue5 = numValueOf2.intValue();
                                                        if (zD) {
                                                            xgk0Var = xgk0.b;
                                                        } else {
                                                            Integer num2 = p1f0Var.D;
                                                            xgk0Var = (num2 != null && num2.intValue() == iIntValue3) ? xgk0.f40845a : xgk0.c;
                                                        }
                                                        lc00VarB2.add(new ahk0(iIntValue3, iIntValue5, xgk0Var, ctf0Var3.b.a(iIntValue4, Arrays.copyOf(new Object[0], 0))));
                                                    }
                                                    map6 = map6;
                                                    z7 = z7;
                                                    map5 = map5;
                                                    it5 = it5;
                                                    arrayList5 = arrayList2;
                                                } else {
                                                    arrayList2 = arrayList5;
                                                }
                                                map6 = map6;
                                                z7 = z7;
                                                map5 = map5;
                                                it5 = it5;
                                                arrayList5 = arrayList2;
                                            }
                                            ArrayList arrayList6 = arrayList5;
                                            Map map7 = map6;
                                            boolean z9 = z7;
                                            Map map8 = map5;
                                            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB2);
                                            int iC = ctf0Var3.c();
                                            int size = list4.size();
                                            Integer numValueOf3 = size <= 0 ? 1 : size <= 4 ? Integer.valueOf(size) : null;
                                            if (numValueOf3 != null) {
                                                iIntValue = numValueOf3.intValue();
                                            } else if (320 > iC || iC >= 411) {
                                                iIntValue = (411 > iC || iC >= 600) ? 8 : 6;
                                            } else {
                                                iIntValue = 5;
                                            }
                                            if (numValueOf3 == null) {
                                                while (iIntValue > 2 && size % iIntValue == 1) {
                                                    iIntValue--;
                                                }
                                            }
                                            int i3 = iIntValue * 3;
                                            boolean z10 = p1f0Var.K;
                                            lc00 lc00VarB3 = kotlin.collections.a.b();
                                            if (!z10 && lc00VarA.b() > i3) {
                                                lc00VarB3.addAll(CollectionsKt.D0(lc00VarA, i3 - 1));
                                                lc00VarB3.add(new sgk0(false));
                                            } else if (!z10 || lc00VarA.b() <= i3) {
                                                lc00VarB3.addAll(lc00VarA);
                                            } else {
                                                lc00VarB3.addAll(lc00VarA);
                                                lc00VarB3.add(new sgk0(true));
                                            }
                                            lc00 lc00VarA2 = kotlin.collections.a.a(lc00VarB3);
                                            u0f0 u0f0Var = u0f0.f34852a;
                                            lc00VarB.add(new fjk0(lc00VarA2, zD, iIntValue));
                                            map2 = map7;
                                            z2 = z9;
                                            map3 = map8;
                                            arrayList = arrayList6;
                                        }
                                    }
                                }
                                arrayList = arrayList5;
                                z2 = z7;
                                map3 = map5;
                                map2 = map6;
                            }
                        }
                        c3x.p(lc00VarB, ctf0Var3, arrayList, map4, map3, map2, p1f0Var, list3, z2, i);
                        ArrayList<q0f0> arrayList7 = arrayList;
                        if (z4) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                            lc00VarB.add(c3x.s(u0f0.i1, ctf0Var3.b.a(R.string.company_rules, Arrays.copyOf(new Object[0], 0)), ctf0Var3));
                        }
                        u0f0 u0f0Var2 = u0f0.j1;
                        lsm0 lsm0Var = ctf0Var3.b;
                        lc00VarB.add(c3x.s(u0f0Var2, lsm0Var.a(R.string.info_privacy_policy, Arrays.copyOf(new Object[i2], i2)), ctf0Var3));
                        if (z5) {
                            lc00VarB.add(c3x.s(u0f0.k1, lsm0Var.a(R.string.responsible_game, Arrays.copyOf(new Object[i2], i2)), ctf0Var3));
                        }
                        for (q0f0 q0f0Var : arrayList7) {
                            if (q0f0Var != null) {
                                if (q0f0Var instanceof hze0) {
                                    str4.getClass();
                                    u0f0 u0f0Var3 = u0f0.f1;
                                    lc00VarB.add(new rzb(u0f0Var3, lsm0Var.a(R.string.min_age_confirmation_checkbox_v2, Arrays.copyOf(new Object[]{str4}, 1)), new yvl(uzb.q0(p1f0Var.b), c3x.v((urp) map4.get(u0f0Var3)), 2)));
                                } else if (q0f0Var instanceof mze0) {
                                    u0f0 u0f0Var4 = u0f0.y;
                                    lc00VarB.add(new rzb(u0f0Var4, lsm0Var.a(R.string.registration_commercial_communication_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.e), c3x.v((urp) map4.get(u0f0Var4)), 2)));
                                } else if (q0f0Var instanceof xze0) {
                                    u0f0 u0f0Var5 = u0f0.n1;
                                    lc00VarB.add(new rzb(u0f0Var5, lsm0Var.a(R.string.registration_notify_news_call_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.f), c3x.v((urp) map4.get(u0f0Var5)), 2)));
                                } else if (q0f0Var instanceof l0f0) {
                                    u0f0 u0f0Var6 = u0f0.x;
                                    lc00VarB.add(new rzb(u0f0Var6, lsm0Var.a(R.string.get_results_of_my_bets_by_email_reg, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.A), c3x.v((urp) map4.get(u0f0Var6)), 2)));
                                } else if (q0f0Var instanceof m0f0) {
                                    u0f0 u0f0Var7 = u0f0.w;
                                    lc00VarB.add(new rzb(u0f0Var7, lsm0Var.a(R.string.get_news_about_events_by_email, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.B), c3x.v((urp) map4.get(u0f0Var7)), 2)));
                                } else if (q0f0Var instanceof o0f0) {
                                    u0f0 u0f0Var8 = u0f0.z;
                                    lc00VarB.add(new rzb(u0f0Var8, lsm0Var.a(R.string.share_personal_data_confirmation_checkbox_fixed_new, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.C), c3x.v((urp) map4.get(u0f0Var8)), 2)));
                                } else if (q0f0Var instanceof i0f0) {
                                    u0f0 u0f0Var9 = u0f0.A;
                                    lc00VarB.add(new rzb(u0f0Var9, lsm0Var.a(R.string.registration_rules_confirmation_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.x), c3x.v((urp) map4.get(u0f0Var9)), 2)));
                                } else if (q0f0Var instanceof j0f0) {
                                    str4.getClass();
                                    u0f0 u0f0Var10 = u0f0.B;
                                    lc00VarB.add(new rzb(u0f0Var10, lsm0Var.a(R.string.registration_rules_confirmation_all_v2, Arrays.copyOf(new Object[]{str4}, 1)), new yvl(uzb.q0(p1f0Var.y), c3x.v((urp) map4.get(u0f0Var10)), 2)));
                                } else if (q0f0Var instanceof n0f0) {
                                    u0f0 u0f0Var11 = u0f0.o1;
                                    lc00VarB.add(new rzb(u0f0Var11, lsm0Var.a(R.string.receive_news_about_events_via_SMS, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.L), c3x.v((urp) map4.get(u0f0Var11)), 2)));
                                }
                            }
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 3:
                        n0o0 n0o0Var = jo4Var.p;
                        fee feeVar2 = (fee) n0o0Var.getValue();
                        ctf0 ctf0Var4 = jo4Var.b;
                        boolean z11 = ((List) feeVar2.c()).size() > 1;
                        String strA = ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0));
                        if (z11) {
                            q7f0 q7f0Var4 = (q7f0) jo4Var.a().c();
                            String strQ2 = q7f0Var4 != null ? d5c.Q(q7f0Var4, ctf0Var4, (Integer) ((fee) jo4Var.k.getValue()).c()) : null;
                            if (strQ2 == null) {
                                str = "";
                            } else {
                                str = strQ2;
                            }
                        } else {
                            str = "";
                        }
                        return new t9f0(strA, str, (String) ((fee) jo4Var.r.getValue()).b(), z11, (a4x) ((fee) n0o0Var.getValue()).b());
                    default:
                        return new y9f0((q7f0) jo4Var.a().c(), (u0f0) ((fee) jo4Var.n.getValue()).c(), (a4x) ((fee) jo4Var.s.getValue()).b(), ((Boolean) ((fee) jo4Var.m.getValue()).c()).booleanValue());
                }
            }
        }, (byte) 20));
        final byte b3 = 1;
        this.q = maz.b(new yw9(Boolean.FALSE, new Function1(this) { // from class: a.obf0
            public final /* synthetic */ jo4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x00a1  */
            /* JADX WARN: Code duplicated, block: B:60:0x01fb  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iK;
                Map map;
                int i;
                Object obj2;
                boolean z;
                int iIntValue;
                Map map2;
                boolean z2;
                Map map3;
                ArrayList arrayList;
                Integer numValueOf;
                ArrayList arrayList2;
                Integer numValueOf2;
                xgk0 xgk0Var;
                int i2;
                Iterator it;
                DocumentStateModel documentStateModel;
                String str;
                byte b4 = b3;
                jo4 jo4Var = this.b;
                switch (b4) {
                    case 0:
                        List<q7f0> list = (List) obj;
                        list.getClass();
                        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                        for (q7f0 q7f0Var : list) {
                            ctf0 ctf0Var2 = jo4Var.b;
                            q7f0 q7f0Var2 = (q7f0) jo4Var.a().c();
                            Integer num = (Integer) ((fee) jo4Var.k.getValue()).c();
                            boolean z3 = ((mbf0) jo4Var.v).r.C;
                            q7f0Var.getClass();
                            ctf0Var2.getClass();
                            long j = q7f0Var.f28247a;
                            String strQ = d5c.Q(q7f0Var, ctf0Var2, num);
                            int iOrdinal = q7f0Var.ordinal();
                            if (iOrdinal == 0) {
                                iK = R.drawable.ic_reg_email;
                            } else if (iOrdinal == 1) {
                                iK = R.drawable.ic_reg_phone_new;
                            } else if (iOrdinal == 2) {
                                iK = R.drawable.ic_reg_one_click_new;
                            } else if (iOrdinal == 3) {
                                iK = num != null ? xvw.K(num.intValue()) : R.drawable.ic_reg_social_network_new;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                iK = z3 ? R.drawable.ic_social_circle_itsme : R.drawable.ic_reg_import_personal_data_new;
                            }
                            arrayList3.add(new lxl(j, (dyl) new ayl(strQ, new m0x(iK, null, 6), Boolean.valueOf(!z3 && (num == null || q7f0Var != q7f0.SOCIAL)), 12), false, q7f0Var == q7f0Var2 ? uxl.b : uxl.f36445a, (cwl) null, 108));
                        }
                        return dyb.o0(arrayList3);
                    case 1:
                        ((Boolean) obj).getClass();
                        return new u9f0(jo4Var.b.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0)), !((Boolean) ((fee) jo4Var.m.getValue()).c()).booleanValue(), true);
                    case 2:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        List list2 = (List) feeVar.c();
                        ctf0 ctf0Var3 = jo4Var.b;
                        List list3 = (List) ((fee) jo4Var.f.getValue()).c();
                        q7f0 q7f0Var3 = (q7f0) jo4Var.a().c();
                        if (q7f0Var3 == null || (map = (Map) ((Map) ((fee) jo4Var.i.getValue()).c()).get(q7f0Var3)) == null) {
                            map = lun.f20680a;
                            map.getClass();
                        }
                        Map map4 = map;
                        p1f0 p1f0Var = (p1f0) ((fee) jo4Var.d.getValue()).c();
                        List list4 = (List) ((fee) jo4Var.j.getValue()).c();
                        mbf0 mbf0Var2 = (mbf0) jo4Var.v;
                        boolean z4 = mbf0Var2.q;
                        sff0 sff0Var = mbf0Var2.m;
                        boolean z5 = sff0Var.m.s;
                        v8d v8dVar = mbf0Var2.r;
                        boolean z6 = v8dVar.J;
                        boolean z7 = sff0Var.N.o;
                        List list5 = v8dVar.K;
                        Map map5 = (Map) ((fee) jo4Var.g.getValue()).c();
                        Map map6 = (Map) ((fee) jo4Var.h.getValue()).c();
                        boolean z8 = ((fee) jo4Var.k.getValue()).c() != null;
                        int iIntValue2 = ((Number) ((fee) jo4Var.o.getValue()).c()).intValue();
                        list2.getClass();
                        ctf0Var3.getClass();
                        list3.getClass();
                        map5.getClass();
                        map6.getClass();
                        p1f0Var.getClass();
                        CitizenshipStateModel citizenshipStateModel = p1f0Var.o;
                        list4.getClass();
                        list5.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                i = iIntValue2;
                                if (((q0f0) next) instanceof pze0) {
                                    obj2 = next;
                                } else {
                                    iIntValue2 = i;
                                }
                            } else {
                                i = iIntValue2;
                                obj2 = null;
                            }
                        }
                        pze0 pze0Var = obj2 instanceof pze0 ? (pze0) obj2 : null;
                        String strJ0 = sj3.j0(pze0Var != null ? pze0Var.e : null, "18");
                        if (list5.isEmpty()) {
                            z = false;
                        } else {
                            String str2 = citizenshipStateModel != null ? citizenshipStateModel.b : null;
                            if (str2 == null || str2.length() == 0 || list5.contains(Integer.valueOf(citizenshipStateModel.f46861a))) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            Object zze0Var = (q0f0) it3.next();
                            String str3 = strJ0;
                            if ((zze0Var instanceof qze0) && z) {
                                it = it3;
                                zze0Var = new qze0(true, false);
                            } else {
                                it = it3;
                                if ((zze0Var instanceof a0f0) && z) {
                                    zze0Var = new a0f0(true, false);
                                } else if ((zze0Var instanceof zze0) && z6 && (documentStateModel = p1f0Var.j) != null && documentStateModel.f46865a == 126) {
                                    zze0Var = new zze0(((zze0) zze0Var).c, false);
                                }
                            }
                            arrayList4.add(zze0Var);
                            strJ0 = str3;
                            it3 = it;
                        }
                        String str4 = strJ0;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj3 : arrayList4) {
                            if (!((q0f0) obj3).a()) {
                                arrayList5.add(obj3);
                            }
                        }
                        if (arrayList5.isEmpty()) {
                            arrayList = arrayList5;
                            z2 = z7;
                            map3 = map5;
                            map2 = map6;
                        } else {
                            Iterator it4 = arrayList5.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((q0f0) it4.next()) instanceof p0f0) {
                                        if (!z8) {
                                            boolean zD = Intrinsics.d(map4.get(u0f0.j), prp.f27476a);
                                            lc00 lc00VarB2 = kotlin.collections.a.b();
                                            Iterator it5 = list4.iterator();
                                            while (it5.hasNext()) {
                                                int iIntValue3 = ((Number) it5.next()).intValue();
                                                if (iIntValue3 == 1) {
                                                    numValueOf = Integer.valueOf(R.string.social_vk);
                                                } else if (iIntValue3 == 5) {
                                                    numValueOf = Integer.valueOf(R.string.social_ok);
                                                } else if (iIntValue3 == 7) {
                                                    numValueOf = Integer.valueOf(R.string.social_yandex);
                                                } else if (iIntValue3 == 9) {
                                                    numValueOf = Integer.valueOf(R.string.social_mailru_label_new);
                                                } else if (iIntValue3 == 11) {
                                                    numValueOf = Integer.valueOf(R.string.social_google);
                                                } else if (iIntValue3 == 13) {
                                                    numValueOf = Integer.valueOf(R.string.social_x_com);
                                                } else if (iIntValue3 == 17) {
                                                    numValueOf = Integer.valueOf(R.string.social_telegram);
                                                } else if (iIntValue3 == 19) {
                                                    numValueOf = Integer.valueOf(R.string.social_apple_id);
                                                } else if (iIntValue3 != 26) {
                                                    numValueOf = iIntValue3 != 31 ? null : Integer.valueOf(R.string.social_discord);
                                                } else {
                                                    numValueOf = Integer.valueOf(R.string.social_its_me);
                                                }
                                                if (numValueOf != null) {
                                                    int iIntValue4 = numValueOf.intValue();
                                                    arrayList2 = arrayList5;
                                                    if (iIntValue3 == 1) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_vk);
                                                    } else if (iIntValue3 == 5) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_ok);
                                                    } else if (iIntValue3 == 7) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_yandex);
                                                    } else if (iIntValue3 == 9) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_mail);
                                                    } else if (iIntValue3 == 11) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_google);
                                                    } else if (iIntValue3 == 13) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_x);
                                                    } else if (iIntValue3 == 17) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_telegram);
                                                    } else if (iIntValue3 == 19) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_apple);
                                                    } else if (iIntValue3 != 26) {
                                                        numValueOf2 = iIntValue3 != 31 ? null : Integer.valueOf(R.drawable.ic_social_circle_discord);
                                                    } else {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_itsme);
                                                    }
                                                    if (numValueOf2 != null) {
                                                        int iIntValue5 = numValueOf2.intValue();
                                                        if (zD) {
                                                            xgk0Var = xgk0.b;
                                                        } else {
                                                            Integer num2 = p1f0Var.D;
                                                            xgk0Var = (num2 != null && num2.intValue() == iIntValue3) ? xgk0.f40845a : xgk0.c;
                                                        }
                                                        lc00VarB2.add(new ahk0(iIntValue3, iIntValue5, xgk0Var, ctf0Var3.b.a(iIntValue4, Arrays.copyOf(new Object[0], 0))));
                                                    }
                                                    map6 = map6;
                                                    z7 = z7;
                                                    map5 = map5;
                                                    it5 = it5;
                                                    arrayList5 = arrayList2;
                                                } else {
                                                    arrayList2 = arrayList5;
                                                }
                                                map6 = map6;
                                                z7 = z7;
                                                map5 = map5;
                                                it5 = it5;
                                                arrayList5 = arrayList2;
                                            }
                                            ArrayList arrayList6 = arrayList5;
                                            Map map7 = map6;
                                            boolean z9 = z7;
                                            Map map8 = map5;
                                            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB2);
                                            int iC = ctf0Var3.c();
                                            int size = list4.size();
                                            Integer numValueOf3 = size <= 0 ? 1 : size <= 4 ? Integer.valueOf(size) : null;
                                            if (numValueOf3 != null) {
                                                iIntValue = numValueOf3.intValue();
                                            } else if (320 > iC || iC >= 411) {
                                                iIntValue = (411 > iC || iC >= 600) ? 8 : 6;
                                            } else {
                                                iIntValue = 5;
                                            }
                                            if (numValueOf3 == null) {
                                                while (iIntValue > 2 && size % iIntValue == 1) {
                                                    iIntValue--;
                                                }
                                            }
                                            int i3 = iIntValue * 3;
                                            boolean z10 = p1f0Var.K;
                                            lc00 lc00VarB3 = kotlin.collections.a.b();
                                            if (!z10 && lc00VarA.b() > i3) {
                                                lc00VarB3.addAll(CollectionsKt.D0(lc00VarA, i3 - 1));
                                                lc00VarB3.add(new sgk0(false));
                                            } else if (!z10 || lc00VarA.b() <= i3) {
                                                lc00VarB3.addAll(lc00VarA);
                                            } else {
                                                lc00VarB3.addAll(lc00VarA);
                                                lc00VarB3.add(new sgk0(true));
                                            }
                                            lc00 lc00VarA2 = kotlin.collections.a.a(lc00VarB3);
                                            u0f0 u0f0Var = u0f0.f34852a;
                                            lc00VarB.add(new fjk0(lc00VarA2, zD, iIntValue));
                                            map2 = map7;
                                            z2 = z9;
                                            map3 = map8;
                                            arrayList = arrayList6;
                                        }
                                    }
                                }
                                arrayList = arrayList5;
                                z2 = z7;
                                map3 = map5;
                                map2 = map6;
                            }
                        }
                        c3x.p(lc00VarB, ctf0Var3, arrayList, map4, map3, map2, p1f0Var, list3, z2, i);
                        ArrayList<q0f0> arrayList7 = arrayList;
                        if (z4) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                            lc00VarB.add(c3x.s(u0f0.i1, ctf0Var3.b.a(R.string.company_rules, Arrays.copyOf(new Object[0], 0)), ctf0Var3));
                        }
                        u0f0 u0f0Var2 = u0f0.j1;
                        lsm0 lsm0Var = ctf0Var3.b;
                        lc00VarB.add(c3x.s(u0f0Var2, lsm0Var.a(R.string.info_privacy_policy, Arrays.copyOf(new Object[i2], i2)), ctf0Var3));
                        if (z5) {
                            lc00VarB.add(c3x.s(u0f0.k1, lsm0Var.a(R.string.responsible_game, Arrays.copyOf(new Object[i2], i2)), ctf0Var3));
                        }
                        for (q0f0 q0f0Var : arrayList7) {
                            if (q0f0Var != null) {
                                if (q0f0Var instanceof hze0) {
                                    str4.getClass();
                                    u0f0 u0f0Var3 = u0f0.f1;
                                    lc00VarB.add(new rzb(u0f0Var3, lsm0Var.a(R.string.min_age_confirmation_checkbox_v2, Arrays.copyOf(new Object[]{str4}, 1)), new yvl(uzb.q0(p1f0Var.b), c3x.v((urp) map4.get(u0f0Var3)), 2)));
                                } else if (q0f0Var instanceof mze0) {
                                    u0f0 u0f0Var4 = u0f0.y;
                                    lc00VarB.add(new rzb(u0f0Var4, lsm0Var.a(R.string.registration_commercial_communication_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.e), c3x.v((urp) map4.get(u0f0Var4)), 2)));
                                } else if (q0f0Var instanceof xze0) {
                                    u0f0 u0f0Var5 = u0f0.n1;
                                    lc00VarB.add(new rzb(u0f0Var5, lsm0Var.a(R.string.registration_notify_news_call_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.f), c3x.v((urp) map4.get(u0f0Var5)), 2)));
                                } else if (q0f0Var instanceof l0f0) {
                                    u0f0 u0f0Var6 = u0f0.x;
                                    lc00VarB.add(new rzb(u0f0Var6, lsm0Var.a(R.string.get_results_of_my_bets_by_email_reg, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.A), c3x.v((urp) map4.get(u0f0Var6)), 2)));
                                } else if (q0f0Var instanceof m0f0) {
                                    u0f0 u0f0Var7 = u0f0.w;
                                    lc00VarB.add(new rzb(u0f0Var7, lsm0Var.a(R.string.get_news_about_events_by_email, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.B), c3x.v((urp) map4.get(u0f0Var7)), 2)));
                                } else if (q0f0Var instanceof o0f0) {
                                    u0f0 u0f0Var8 = u0f0.z;
                                    lc00VarB.add(new rzb(u0f0Var8, lsm0Var.a(R.string.share_personal_data_confirmation_checkbox_fixed_new, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.C), c3x.v((urp) map4.get(u0f0Var8)), 2)));
                                } else if (q0f0Var instanceof i0f0) {
                                    u0f0 u0f0Var9 = u0f0.A;
                                    lc00VarB.add(new rzb(u0f0Var9, lsm0Var.a(R.string.registration_rules_confirmation_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.x), c3x.v((urp) map4.get(u0f0Var9)), 2)));
                                } else if (q0f0Var instanceof j0f0) {
                                    str4.getClass();
                                    u0f0 u0f0Var10 = u0f0.B;
                                    lc00VarB.add(new rzb(u0f0Var10, lsm0Var.a(R.string.registration_rules_confirmation_all_v2, Arrays.copyOf(new Object[]{str4}, 1)), new yvl(uzb.q0(p1f0Var.y), c3x.v((urp) map4.get(u0f0Var10)), 2)));
                                } else if (q0f0Var instanceof n0f0) {
                                    u0f0 u0f0Var11 = u0f0.o1;
                                    lc00VarB.add(new rzb(u0f0Var11, lsm0Var.a(R.string.receive_news_about_events_via_SMS, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.L), c3x.v((urp) map4.get(u0f0Var11)), 2)));
                                }
                            }
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 3:
                        n0o0 n0o0Var = jo4Var.p;
                        fee feeVar2 = (fee) n0o0Var.getValue();
                        ctf0 ctf0Var4 = jo4Var.b;
                        boolean z11 = ((List) feeVar2.c()).size() > 1;
                        String strA = ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0));
                        if (z11) {
                            q7f0 q7f0Var4 = (q7f0) jo4Var.a().c();
                            String strQ2 = q7f0Var4 != null ? d5c.Q(q7f0Var4, ctf0Var4, (Integer) ((fee) jo4Var.k.getValue()).c()) : null;
                            if (strQ2 == null) {
                                str = "";
                            } else {
                                str = strQ2;
                            }
                        } else {
                            str = "";
                        }
                        return new t9f0(strA, str, (String) ((fee) jo4Var.r.getValue()).b(), z11, (a4x) ((fee) n0o0Var.getValue()).b());
                    default:
                        return new y9f0((q7f0) jo4Var.a().c(), (u0f0) ((fee) jo4Var.n.getValue()).c(), (a4x) ((fee) jo4Var.s.getValue()).b(), ((Boolean) ((fee) jo4Var.m.getValue()).c()).booleanValue());
                }
            }
        }, (byte) 20));
        this.r = bkb.G(((fee) n0o0VarH2.getValue()).d, new bue0((byte) 13));
        this.s = maz.b(new yw9((fee) n0o0VarH.getValue(), new Function1(this) { // from class: a.obf0
            public final /* synthetic */ jo4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x00a1  */
            /* JADX WARN: Code duplicated, block: B:60:0x01fb  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iK;
                Map map;
                int i;
                Object obj2;
                boolean z;
                int iIntValue;
                Map map2;
                boolean z2;
                Map map3;
                ArrayList arrayList;
                Integer numValueOf;
                ArrayList arrayList2;
                Integer numValueOf2;
                xgk0 xgk0Var;
                int i2;
                Iterator it;
                DocumentStateModel documentStateModel;
                String str;
                byte b4 = b;
                jo4 jo4Var = this.b;
                switch (b4) {
                    case 0:
                        List<q7f0> list = (List) obj;
                        list.getClass();
                        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                        for (q7f0 q7f0Var : list) {
                            ctf0 ctf0Var2 = jo4Var.b;
                            q7f0 q7f0Var2 = (q7f0) jo4Var.a().c();
                            Integer num = (Integer) ((fee) jo4Var.k.getValue()).c();
                            boolean z3 = ((mbf0) jo4Var.v).r.C;
                            q7f0Var.getClass();
                            ctf0Var2.getClass();
                            long j = q7f0Var.f28247a;
                            String strQ = d5c.Q(q7f0Var, ctf0Var2, num);
                            int iOrdinal = q7f0Var.ordinal();
                            if (iOrdinal == 0) {
                                iK = R.drawable.ic_reg_email;
                            } else if (iOrdinal == 1) {
                                iK = R.drawable.ic_reg_phone_new;
                            } else if (iOrdinal == 2) {
                                iK = R.drawable.ic_reg_one_click_new;
                            } else if (iOrdinal == 3) {
                                iK = num != null ? xvw.K(num.intValue()) : R.drawable.ic_reg_social_network_new;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                iK = z3 ? R.drawable.ic_social_circle_itsme : R.drawable.ic_reg_import_personal_data_new;
                            }
                            arrayList3.add(new lxl(j, (dyl) new ayl(strQ, new m0x(iK, null, 6), Boolean.valueOf(!z3 && (num == null || q7f0Var != q7f0.SOCIAL)), 12), false, q7f0Var == q7f0Var2 ? uxl.b : uxl.f36445a, (cwl) null, 108));
                        }
                        return dyb.o0(arrayList3);
                    case 1:
                        ((Boolean) obj).getClass();
                        return new u9f0(jo4Var.b.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0)), !((Boolean) ((fee) jo4Var.m.getValue()).c()).booleanValue(), true);
                    case 2:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        List list2 = (List) feeVar.c();
                        ctf0 ctf0Var3 = jo4Var.b;
                        List list3 = (List) ((fee) jo4Var.f.getValue()).c();
                        q7f0 q7f0Var3 = (q7f0) jo4Var.a().c();
                        if (q7f0Var3 == null || (map = (Map) ((Map) ((fee) jo4Var.i.getValue()).c()).get(q7f0Var3)) == null) {
                            map = lun.f20680a;
                            map.getClass();
                        }
                        Map map4 = map;
                        p1f0 p1f0Var = (p1f0) ((fee) jo4Var.d.getValue()).c();
                        List list4 = (List) ((fee) jo4Var.j.getValue()).c();
                        mbf0 mbf0Var2 = (mbf0) jo4Var.v;
                        boolean z4 = mbf0Var2.q;
                        sff0 sff0Var = mbf0Var2.m;
                        boolean z5 = sff0Var.m.s;
                        v8d v8dVar = mbf0Var2.r;
                        boolean z6 = v8dVar.J;
                        boolean z7 = sff0Var.N.o;
                        List list5 = v8dVar.K;
                        Map map5 = (Map) ((fee) jo4Var.g.getValue()).c();
                        Map map6 = (Map) ((fee) jo4Var.h.getValue()).c();
                        boolean z8 = ((fee) jo4Var.k.getValue()).c() != null;
                        int iIntValue2 = ((Number) ((fee) jo4Var.o.getValue()).c()).intValue();
                        list2.getClass();
                        ctf0Var3.getClass();
                        list3.getClass();
                        map5.getClass();
                        map6.getClass();
                        p1f0Var.getClass();
                        CitizenshipStateModel citizenshipStateModel = p1f0Var.o;
                        list4.getClass();
                        list5.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                i = iIntValue2;
                                if (((q0f0) next) instanceof pze0) {
                                    obj2 = next;
                                } else {
                                    iIntValue2 = i;
                                }
                            } else {
                                i = iIntValue2;
                                obj2 = null;
                            }
                        }
                        pze0 pze0Var = obj2 instanceof pze0 ? (pze0) obj2 : null;
                        String strJ0 = sj3.j0(pze0Var != null ? pze0Var.e : null, "18");
                        if (list5.isEmpty()) {
                            z = false;
                        } else {
                            String str2 = citizenshipStateModel != null ? citizenshipStateModel.b : null;
                            if (str2 == null || str2.length() == 0 || list5.contains(Integer.valueOf(citizenshipStateModel.f46861a))) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            Object zze0Var = (q0f0) it3.next();
                            String str3 = strJ0;
                            if ((zze0Var instanceof qze0) && z) {
                                it = it3;
                                zze0Var = new qze0(true, false);
                            } else {
                                it = it3;
                                if ((zze0Var instanceof a0f0) && z) {
                                    zze0Var = new a0f0(true, false);
                                } else if ((zze0Var instanceof zze0) && z6 && (documentStateModel = p1f0Var.j) != null && documentStateModel.f46865a == 126) {
                                    zze0Var = new zze0(((zze0) zze0Var).c, false);
                                }
                            }
                            arrayList4.add(zze0Var);
                            strJ0 = str3;
                            it3 = it;
                        }
                        String str4 = strJ0;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj3 : arrayList4) {
                            if (!((q0f0) obj3).a()) {
                                arrayList5.add(obj3);
                            }
                        }
                        if (arrayList5.isEmpty()) {
                            arrayList = arrayList5;
                            z2 = z7;
                            map3 = map5;
                            map2 = map6;
                        } else {
                            Iterator it4 = arrayList5.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((q0f0) it4.next()) instanceof p0f0) {
                                        if (!z8) {
                                            boolean zD = Intrinsics.d(map4.get(u0f0.j), prp.f27476a);
                                            lc00 lc00VarB2 = kotlin.collections.a.b();
                                            Iterator it5 = list4.iterator();
                                            while (it5.hasNext()) {
                                                int iIntValue3 = ((Number) it5.next()).intValue();
                                                if (iIntValue3 == 1) {
                                                    numValueOf = Integer.valueOf(R.string.social_vk);
                                                } else if (iIntValue3 == 5) {
                                                    numValueOf = Integer.valueOf(R.string.social_ok);
                                                } else if (iIntValue3 == 7) {
                                                    numValueOf = Integer.valueOf(R.string.social_yandex);
                                                } else if (iIntValue3 == 9) {
                                                    numValueOf = Integer.valueOf(R.string.social_mailru_label_new);
                                                } else if (iIntValue3 == 11) {
                                                    numValueOf = Integer.valueOf(R.string.social_google);
                                                } else if (iIntValue3 == 13) {
                                                    numValueOf = Integer.valueOf(R.string.social_x_com);
                                                } else if (iIntValue3 == 17) {
                                                    numValueOf = Integer.valueOf(R.string.social_telegram);
                                                } else if (iIntValue3 == 19) {
                                                    numValueOf = Integer.valueOf(R.string.social_apple_id);
                                                } else if (iIntValue3 != 26) {
                                                    numValueOf = iIntValue3 != 31 ? null : Integer.valueOf(R.string.social_discord);
                                                } else {
                                                    numValueOf = Integer.valueOf(R.string.social_its_me);
                                                }
                                                if (numValueOf != null) {
                                                    int iIntValue4 = numValueOf.intValue();
                                                    arrayList2 = arrayList5;
                                                    if (iIntValue3 == 1) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_vk);
                                                    } else if (iIntValue3 == 5) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_ok);
                                                    } else if (iIntValue3 == 7) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_yandex);
                                                    } else if (iIntValue3 == 9) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_mail);
                                                    } else if (iIntValue3 == 11) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_google);
                                                    } else if (iIntValue3 == 13) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_x);
                                                    } else if (iIntValue3 == 17) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_telegram);
                                                    } else if (iIntValue3 == 19) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_apple);
                                                    } else if (iIntValue3 != 26) {
                                                        numValueOf2 = iIntValue3 != 31 ? null : Integer.valueOf(R.drawable.ic_social_circle_discord);
                                                    } else {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_itsme);
                                                    }
                                                    if (numValueOf2 != null) {
                                                        int iIntValue5 = numValueOf2.intValue();
                                                        if (zD) {
                                                            xgk0Var = xgk0.b;
                                                        } else {
                                                            Integer num2 = p1f0Var.D;
                                                            xgk0Var = (num2 != null && num2.intValue() == iIntValue3) ? xgk0.f40845a : xgk0.c;
                                                        }
                                                        lc00VarB2.add(new ahk0(iIntValue3, iIntValue5, xgk0Var, ctf0Var3.b.a(iIntValue4, Arrays.copyOf(new Object[0], 0))));
                                                    }
                                                    map6 = map6;
                                                    z7 = z7;
                                                    map5 = map5;
                                                    it5 = it5;
                                                    arrayList5 = arrayList2;
                                                } else {
                                                    arrayList2 = arrayList5;
                                                }
                                                map6 = map6;
                                                z7 = z7;
                                                map5 = map5;
                                                it5 = it5;
                                                arrayList5 = arrayList2;
                                            }
                                            ArrayList arrayList6 = arrayList5;
                                            Map map7 = map6;
                                            boolean z9 = z7;
                                            Map map8 = map5;
                                            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB2);
                                            int iC = ctf0Var3.c();
                                            int size = list4.size();
                                            Integer numValueOf3 = size <= 0 ? 1 : size <= 4 ? Integer.valueOf(size) : null;
                                            if (numValueOf3 != null) {
                                                iIntValue = numValueOf3.intValue();
                                            } else if (320 > iC || iC >= 411) {
                                                iIntValue = (411 > iC || iC >= 600) ? 8 : 6;
                                            } else {
                                                iIntValue = 5;
                                            }
                                            if (numValueOf3 == null) {
                                                while (iIntValue > 2 && size % iIntValue == 1) {
                                                    iIntValue--;
                                                }
                                            }
                                            int i3 = iIntValue * 3;
                                            boolean z10 = p1f0Var.K;
                                            lc00 lc00VarB3 = kotlin.collections.a.b();
                                            if (!z10 && lc00VarA.b() > i3) {
                                                lc00VarB3.addAll(CollectionsKt.D0(lc00VarA, i3 - 1));
                                                lc00VarB3.add(new sgk0(false));
                                            } else if (!z10 || lc00VarA.b() <= i3) {
                                                lc00VarB3.addAll(lc00VarA);
                                            } else {
                                                lc00VarB3.addAll(lc00VarA);
                                                lc00VarB3.add(new sgk0(true));
                                            }
                                            lc00 lc00VarA2 = kotlin.collections.a.a(lc00VarB3);
                                            u0f0 u0f0Var = u0f0.f34852a;
                                            lc00VarB.add(new fjk0(lc00VarA2, zD, iIntValue));
                                            map2 = map7;
                                            z2 = z9;
                                            map3 = map8;
                                            arrayList = arrayList6;
                                        }
                                    }
                                }
                                arrayList = arrayList5;
                                z2 = z7;
                                map3 = map5;
                                map2 = map6;
                            }
                        }
                        c3x.p(lc00VarB, ctf0Var3, arrayList, map4, map3, map2, p1f0Var, list3, z2, i);
                        ArrayList<q0f0> arrayList7 = arrayList;
                        if (z4) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                            lc00VarB.add(c3x.s(u0f0.i1, ctf0Var3.b.a(R.string.company_rules, Arrays.copyOf(new Object[0], 0)), ctf0Var3));
                        }
                        u0f0 u0f0Var2 = u0f0.j1;
                        lsm0 lsm0Var = ctf0Var3.b;
                        lc00VarB.add(c3x.s(u0f0Var2, lsm0Var.a(R.string.info_privacy_policy, Arrays.copyOf(new Object[i2], i2)), ctf0Var3));
                        if (z5) {
                            lc00VarB.add(c3x.s(u0f0.k1, lsm0Var.a(R.string.responsible_game, Arrays.copyOf(new Object[i2], i2)), ctf0Var3));
                        }
                        for (q0f0 q0f0Var : arrayList7) {
                            if (q0f0Var != null) {
                                if (q0f0Var instanceof hze0) {
                                    str4.getClass();
                                    u0f0 u0f0Var3 = u0f0.f1;
                                    lc00VarB.add(new rzb(u0f0Var3, lsm0Var.a(R.string.min_age_confirmation_checkbox_v2, Arrays.copyOf(new Object[]{str4}, 1)), new yvl(uzb.q0(p1f0Var.b), c3x.v((urp) map4.get(u0f0Var3)), 2)));
                                } else if (q0f0Var instanceof mze0) {
                                    u0f0 u0f0Var4 = u0f0.y;
                                    lc00VarB.add(new rzb(u0f0Var4, lsm0Var.a(R.string.registration_commercial_communication_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.e), c3x.v((urp) map4.get(u0f0Var4)), 2)));
                                } else if (q0f0Var instanceof xze0) {
                                    u0f0 u0f0Var5 = u0f0.n1;
                                    lc00VarB.add(new rzb(u0f0Var5, lsm0Var.a(R.string.registration_notify_news_call_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.f), c3x.v((urp) map4.get(u0f0Var5)), 2)));
                                } else if (q0f0Var instanceof l0f0) {
                                    u0f0 u0f0Var6 = u0f0.x;
                                    lc00VarB.add(new rzb(u0f0Var6, lsm0Var.a(R.string.get_results_of_my_bets_by_email_reg, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.A), c3x.v((urp) map4.get(u0f0Var6)), 2)));
                                } else if (q0f0Var instanceof m0f0) {
                                    u0f0 u0f0Var7 = u0f0.w;
                                    lc00VarB.add(new rzb(u0f0Var7, lsm0Var.a(R.string.get_news_about_events_by_email, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.B), c3x.v((urp) map4.get(u0f0Var7)), 2)));
                                } else if (q0f0Var instanceof o0f0) {
                                    u0f0 u0f0Var8 = u0f0.z;
                                    lc00VarB.add(new rzb(u0f0Var8, lsm0Var.a(R.string.share_personal_data_confirmation_checkbox_fixed_new, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.C), c3x.v((urp) map4.get(u0f0Var8)), 2)));
                                } else if (q0f0Var instanceof i0f0) {
                                    u0f0 u0f0Var9 = u0f0.A;
                                    lc00VarB.add(new rzb(u0f0Var9, lsm0Var.a(R.string.registration_rules_confirmation_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.x), c3x.v((urp) map4.get(u0f0Var9)), 2)));
                                } else if (q0f0Var instanceof j0f0) {
                                    str4.getClass();
                                    u0f0 u0f0Var10 = u0f0.B;
                                    lc00VarB.add(new rzb(u0f0Var10, lsm0Var.a(R.string.registration_rules_confirmation_all_v2, Arrays.copyOf(new Object[]{str4}, 1)), new yvl(uzb.q0(p1f0Var.y), c3x.v((urp) map4.get(u0f0Var10)), 2)));
                                } else if (q0f0Var instanceof n0f0) {
                                    u0f0 u0f0Var11 = u0f0.o1;
                                    lc00VarB.add(new rzb(u0f0Var11, lsm0Var.a(R.string.receive_news_about_events_via_SMS, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.L), c3x.v((urp) map4.get(u0f0Var11)), 2)));
                                }
                            }
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 3:
                        n0o0 n0o0Var = jo4Var.p;
                        fee feeVar2 = (fee) n0o0Var.getValue();
                        ctf0 ctf0Var4 = jo4Var.b;
                        boolean z11 = ((List) feeVar2.c()).size() > 1;
                        String strA = ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0));
                        if (z11) {
                            q7f0 q7f0Var4 = (q7f0) jo4Var.a().c();
                            String strQ2 = q7f0Var4 != null ? d5c.Q(q7f0Var4, ctf0Var4, (Integer) ((fee) jo4Var.k.getValue()).c()) : null;
                            if (strQ2 == null) {
                                str = "";
                            } else {
                                str = strQ2;
                            }
                        } else {
                            str = "";
                        }
                        return new t9f0(strA, str, (String) ((fee) jo4Var.r.getValue()).b(), z11, (a4x) ((fee) n0o0Var.getValue()).b());
                    default:
                        return new y9f0((q7f0) jo4Var.a().c(), (u0f0) ((fee) jo4Var.n.getValue()).c(), (a4x) ((fee) jo4Var.s.getValue()).b(), ((Boolean) ((fee) jo4Var.m.getValue()).c()).booleanValue());
                }
            }
        }, (byte) 20));
        final byte b4 = 3;
        this.t = bkb.G(a().d, new Function1(this) { // from class: a.obf0
            public final /* synthetic */ jo4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x00a1  */
            /* JADX WARN: Code duplicated, block: B:60:0x01fb  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iK;
                Map map;
                int i;
                Object obj2;
                boolean z;
                int iIntValue;
                Map map2;
                boolean z2;
                Map map3;
                ArrayList arrayList;
                Integer numValueOf;
                ArrayList arrayList2;
                Integer numValueOf2;
                xgk0 xgk0Var;
                int i2;
                Iterator it;
                DocumentStateModel documentStateModel;
                String str;
                byte b5 = b4;
                jo4 jo4Var = this.b;
                switch (b5) {
                    case 0:
                        List<q7f0> list = (List) obj;
                        list.getClass();
                        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                        for (q7f0 q7f0Var : list) {
                            ctf0 ctf0Var2 = jo4Var.b;
                            q7f0 q7f0Var2 = (q7f0) jo4Var.a().c();
                            Integer num = (Integer) ((fee) jo4Var.k.getValue()).c();
                            boolean z3 = ((mbf0) jo4Var.v).r.C;
                            q7f0Var.getClass();
                            ctf0Var2.getClass();
                            long j = q7f0Var.f28247a;
                            String strQ = d5c.Q(q7f0Var, ctf0Var2, num);
                            int iOrdinal = q7f0Var.ordinal();
                            if (iOrdinal == 0) {
                                iK = R.drawable.ic_reg_email;
                            } else if (iOrdinal == 1) {
                                iK = R.drawable.ic_reg_phone_new;
                            } else if (iOrdinal == 2) {
                                iK = R.drawable.ic_reg_one_click_new;
                            } else if (iOrdinal == 3) {
                                iK = num != null ? xvw.K(num.intValue()) : R.drawable.ic_reg_social_network_new;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                iK = z3 ? R.drawable.ic_social_circle_itsme : R.drawable.ic_reg_import_personal_data_new;
                            }
                            arrayList3.add(new lxl(j, (dyl) new ayl(strQ, new m0x(iK, null, 6), Boolean.valueOf(!z3 && (num == null || q7f0Var != q7f0.SOCIAL)), 12), false, q7f0Var == q7f0Var2 ? uxl.b : uxl.f36445a, (cwl) null, 108));
                        }
                        return dyb.o0(arrayList3);
                    case 1:
                        ((Boolean) obj).getClass();
                        return new u9f0(jo4Var.b.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0)), !((Boolean) ((fee) jo4Var.m.getValue()).c()).booleanValue(), true);
                    case 2:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        List list2 = (List) feeVar.c();
                        ctf0 ctf0Var3 = jo4Var.b;
                        List list3 = (List) ((fee) jo4Var.f.getValue()).c();
                        q7f0 q7f0Var3 = (q7f0) jo4Var.a().c();
                        if (q7f0Var3 == null || (map = (Map) ((Map) ((fee) jo4Var.i.getValue()).c()).get(q7f0Var3)) == null) {
                            map = lun.f20680a;
                            map.getClass();
                        }
                        Map map4 = map;
                        p1f0 p1f0Var = (p1f0) ((fee) jo4Var.d.getValue()).c();
                        List list4 = (List) ((fee) jo4Var.j.getValue()).c();
                        mbf0 mbf0Var2 = (mbf0) jo4Var.v;
                        boolean z4 = mbf0Var2.q;
                        sff0 sff0Var = mbf0Var2.m;
                        boolean z5 = sff0Var.m.s;
                        v8d v8dVar = mbf0Var2.r;
                        boolean z6 = v8dVar.J;
                        boolean z7 = sff0Var.N.o;
                        List list5 = v8dVar.K;
                        Map map5 = (Map) ((fee) jo4Var.g.getValue()).c();
                        Map map6 = (Map) ((fee) jo4Var.h.getValue()).c();
                        boolean z8 = ((fee) jo4Var.k.getValue()).c() != null;
                        int iIntValue2 = ((Number) ((fee) jo4Var.o.getValue()).c()).intValue();
                        list2.getClass();
                        ctf0Var3.getClass();
                        list3.getClass();
                        map5.getClass();
                        map6.getClass();
                        p1f0Var.getClass();
                        CitizenshipStateModel citizenshipStateModel = p1f0Var.o;
                        list4.getClass();
                        list5.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                i = iIntValue2;
                                if (((q0f0) next) instanceof pze0) {
                                    obj2 = next;
                                } else {
                                    iIntValue2 = i;
                                }
                            } else {
                                i = iIntValue2;
                                obj2 = null;
                            }
                        }
                        pze0 pze0Var = obj2 instanceof pze0 ? (pze0) obj2 : null;
                        String strJ0 = sj3.j0(pze0Var != null ? pze0Var.e : null, "18");
                        if (list5.isEmpty()) {
                            z = false;
                        } else {
                            String str2 = citizenshipStateModel != null ? citizenshipStateModel.b : null;
                            if (str2 == null || str2.length() == 0 || list5.contains(Integer.valueOf(citizenshipStateModel.f46861a))) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            Object zze0Var = (q0f0) it3.next();
                            String str3 = strJ0;
                            if ((zze0Var instanceof qze0) && z) {
                                it = it3;
                                zze0Var = new qze0(true, false);
                            } else {
                                it = it3;
                                if ((zze0Var instanceof a0f0) && z) {
                                    zze0Var = new a0f0(true, false);
                                } else if ((zze0Var instanceof zze0) && z6 && (documentStateModel = p1f0Var.j) != null && documentStateModel.f46865a == 126) {
                                    zze0Var = new zze0(((zze0) zze0Var).c, false);
                                }
                            }
                            arrayList4.add(zze0Var);
                            strJ0 = str3;
                            it3 = it;
                        }
                        String str4 = strJ0;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj3 : arrayList4) {
                            if (!((q0f0) obj3).a()) {
                                arrayList5.add(obj3);
                            }
                        }
                        if (arrayList5.isEmpty()) {
                            arrayList = arrayList5;
                            z2 = z7;
                            map3 = map5;
                            map2 = map6;
                        } else {
                            Iterator it4 = arrayList5.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((q0f0) it4.next()) instanceof p0f0) {
                                        if (!z8) {
                                            boolean zD = Intrinsics.d(map4.get(u0f0.j), prp.f27476a);
                                            lc00 lc00VarB2 = kotlin.collections.a.b();
                                            Iterator it5 = list4.iterator();
                                            while (it5.hasNext()) {
                                                int iIntValue3 = ((Number) it5.next()).intValue();
                                                if (iIntValue3 == 1) {
                                                    numValueOf = Integer.valueOf(R.string.social_vk);
                                                } else if (iIntValue3 == 5) {
                                                    numValueOf = Integer.valueOf(R.string.social_ok);
                                                } else if (iIntValue3 == 7) {
                                                    numValueOf = Integer.valueOf(R.string.social_yandex);
                                                } else if (iIntValue3 == 9) {
                                                    numValueOf = Integer.valueOf(R.string.social_mailru_label_new);
                                                } else if (iIntValue3 == 11) {
                                                    numValueOf = Integer.valueOf(R.string.social_google);
                                                } else if (iIntValue3 == 13) {
                                                    numValueOf = Integer.valueOf(R.string.social_x_com);
                                                } else if (iIntValue3 == 17) {
                                                    numValueOf = Integer.valueOf(R.string.social_telegram);
                                                } else if (iIntValue3 == 19) {
                                                    numValueOf = Integer.valueOf(R.string.social_apple_id);
                                                } else if (iIntValue3 != 26) {
                                                    numValueOf = iIntValue3 != 31 ? null : Integer.valueOf(R.string.social_discord);
                                                } else {
                                                    numValueOf = Integer.valueOf(R.string.social_its_me);
                                                }
                                                if (numValueOf != null) {
                                                    int iIntValue4 = numValueOf.intValue();
                                                    arrayList2 = arrayList5;
                                                    if (iIntValue3 == 1) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_vk);
                                                    } else if (iIntValue3 == 5) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_ok);
                                                    } else if (iIntValue3 == 7) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_yandex);
                                                    } else if (iIntValue3 == 9) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_mail);
                                                    } else if (iIntValue3 == 11) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_google);
                                                    } else if (iIntValue3 == 13) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_x);
                                                    } else if (iIntValue3 == 17) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_telegram);
                                                    } else if (iIntValue3 == 19) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_apple);
                                                    } else if (iIntValue3 != 26) {
                                                        numValueOf2 = iIntValue3 != 31 ? null : Integer.valueOf(R.drawable.ic_social_circle_discord);
                                                    } else {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_itsme);
                                                    }
                                                    if (numValueOf2 != null) {
                                                        int iIntValue5 = numValueOf2.intValue();
                                                        if (zD) {
                                                            xgk0Var = xgk0.b;
                                                        } else {
                                                            Integer num2 = p1f0Var.D;
                                                            xgk0Var = (num2 != null && num2.intValue() == iIntValue3) ? xgk0.f40845a : xgk0.c;
                                                        }
                                                        lc00VarB2.add(new ahk0(iIntValue3, iIntValue5, xgk0Var, ctf0Var3.b.a(iIntValue4, Arrays.copyOf(new Object[0], 0))));
                                                    }
                                                    map6 = map6;
                                                    z7 = z7;
                                                    map5 = map5;
                                                    it5 = it5;
                                                    arrayList5 = arrayList2;
                                                } else {
                                                    arrayList2 = arrayList5;
                                                }
                                                map6 = map6;
                                                z7 = z7;
                                                map5 = map5;
                                                it5 = it5;
                                                arrayList5 = arrayList2;
                                            }
                                            ArrayList arrayList6 = arrayList5;
                                            Map map7 = map6;
                                            boolean z9 = z7;
                                            Map map8 = map5;
                                            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB2);
                                            int iC = ctf0Var3.c();
                                            int size = list4.size();
                                            Integer numValueOf3 = size <= 0 ? 1 : size <= 4 ? Integer.valueOf(size) : null;
                                            if (numValueOf3 != null) {
                                                iIntValue = numValueOf3.intValue();
                                            } else if (320 > iC || iC >= 411) {
                                                iIntValue = (411 > iC || iC >= 600) ? 8 : 6;
                                            } else {
                                                iIntValue = 5;
                                            }
                                            if (numValueOf3 == null) {
                                                while (iIntValue > 2 && size % iIntValue == 1) {
                                                    iIntValue--;
                                                }
                                            }
                                            int i3 = iIntValue * 3;
                                            boolean z10 = p1f0Var.K;
                                            lc00 lc00VarB3 = kotlin.collections.a.b();
                                            if (!z10 && lc00VarA.b() > i3) {
                                                lc00VarB3.addAll(CollectionsKt.D0(lc00VarA, i3 - 1));
                                                lc00VarB3.add(new sgk0(false));
                                            } else if (!z10 || lc00VarA.b() <= i3) {
                                                lc00VarB3.addAll(lc00VarA);
                                            } else {
                                                lc00VarB3.addAll(lc00VarA);
                                                lc00VarB3.add(new sgk0(true));
                                            }
                                            lc00 lc00VarA2 = kotlin.collections.a.a(lc00VarB3);
                                            u0f0 u0f0Var = u0f0.f34852a;
                                            lc00VarB.add(new fjk0(lc00VarA2, zD, iIntValue));
                                            map2 = map7;
                                            z2 = z9;
                                            map3 = map8;
                                            arrayList = arrayList6;
                                        }
                                    }
                                }
                                arrayList = arrayList5;
                                z2 = z7;
                                map3 = map5;
                                map2 = map6;
                            }
                        }
                        c3x.p(lc00VarB, ctf0Var3, arrayList, map4, map3, map2, p1f0Var, list3, z2, i);
                        ArrayList<q0f0> arrayList7 = arrayList;
                        if (z4) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                            lc00VarB.add(c3x.s(u0f0.i1, ctf0Var3.b.a(R.string.company_rules, Arrays.copyOf(new Object[0], 0)), ctf0Var3));
                        }
                        u0f0 u0f0Var2 = u0f0.j1;
                        lsm0 lsm0Var = ctf0Var3.b;
                        lc00VarB.add(c3x.s(u0f0Var2, lsm0Var.a(R.string.info_privacy_policy, Arrays.copyOf(new Object[i2], i2)), ctf0Var3));
                        if (z5) {
                            lc00VarB.add(c3x.s(u0f0.k1, lsm0Var.a(R.string.responsible_game, Arrays.copyOf(new Object[i2], i2)), ctf0Var3));
                        }
                        for (q0f0 q0f0Var : arrayList7) {
                            if (q0f0Var != null) {
                                if (q0f0Var instanceof hze0) {
                                    str4.getClass();
                                    u0f0 u0f0Var3 = u0f0.f1;
                                    lc00VarB.add(new rzb(u0f0Var3, lsm0Var.a(R.string.min_age_confirmation_checkbox_v2, Arrays.copyOf(new Object[]{str4}, 1)), new yvl(uzb.q0(p1f0Var.b), c3x.v((urp) map4.get(u0f0Var3)), 2)));
                                } else if (q0f0Var instanceof mze0) {
                                    u0f0 u0f0Var4 = u0f0.y;
                                    lc00VarB.add(new rzb(u0f0Var4, lsm0Var.a(R.string.registration_commercial_communication_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.e), c3x.v((urp) map4.get(u0f0Var4)), 2)));
                                } else if (q0f0Var instanceof xze0) {
                                    u0f0 u0f0Var5 = u0f0.n1;
                                    lc00VarB.add(new rzb(u0f0Var5, lsm0Var.a(R.string.registration_notify_news_call_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.f), c3x.v((urp) map4.get(u0f0Var5)), 2)));
                                } else if (q0f0Var instanceof l0f0) {
                                    u0f0 u0f0Var6 = u0f0.x;
                                    lc00VarB.add(new rzb(u0f0Var6, lsm0Var.a(R.string.get_results_of_my_bets_by_email_reg, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.A), c3x.v((urp) map4.get(u0f0Var6)), 2)));
                                } else if (q0f0Var instanceof m0f0) {
                                    u0f0 u0f0Var7 = u0f0.w;
                                    lc00VarB.add(new rzb(u0f0Var7, lsm0Var.a(R.string.get_news_about_events_by_email, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.B), c3x.v((urp) map4.get(u0f0Var7)), 2)));
                                } else if (q0f0Var instanceof o0f0) {
                                    u0f0 u0f0Var8 = u0f0.z;
                                    lc00VarB.add(new rzb(u0f0Var8, lsm0Var.a(R.string.share_personal_data_confirmation_checkbox_fixed_new, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.C), c3x.v((urp) map4.get(u0f0Var8)), 2)));
                                } else if (q0f0Var instanceof i0f0) {
                                    u0f0 u0f0Var9 = u0f0.A;
                                    lc00VarB.add(new rzb(u0f0Var9, lsm0Var.a(R.string.registration_rules_confirmation_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.x), c3x.v((urp) map4.get(u0f0Var9)), 2)));
                                } else if (q0f0Var instanceof j0f0) {
                                    str4.getClass();
                                    u0f0 u0f0Var10 = u0f0.B;
                                    lc00VarB.add(new rzb(u0f0Var10, lsm0Var.a(R.string.registration_rules_confirmation_all_v2, Arrays.copyOf(new Object[]{str4}, 1)), new yvl(uzb.q0(p1f0Var.y), c3x.v((urp) map4.get(u0f0Var10)), 2)));
                                } else if (q0f0Var instanceof n0f0) {
                                    u0f0 u0f0Var11 = u0f0.o1;
                                    lc00VarB.add(new rzb(u0f0Var11, lsm0Var.a(R.string.receive_news_about_events_via_SMS, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.L), c3x.v((urp) map4.get(u0f0Var11)), 2)));
                                }
                            }
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 3:
                        n0o0 n0o0Var = jo4Var.p;
                        fee feeVar2 = (fee) n0o0Var.getValue();
                        ctf0 ctf0Var4 = jo4Var.b;
                        boolean z11 = ((List) feeVar2.c()).size() > 1;
                        String strA = ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0));
                        if (z11) {
                            q7f0 q7f0Var4 = (q7f0) jo4Var.a().c();
                            String strQ2 = q7f0Var4 != null ? d5c.Q(q7f0Var4, ctf0Var4, (Integer) ((fee) jo4Var.k.getValue()).c()) : null;
                            if (strQ2 == null) {
                                str = "";
                            } else {
                                str = strQ2;
                            }
                        } else {
                            str = "";
                        }
                        return new t9f0(strA, str, (String) ((fee) jo4Var.r.getValue()).b(), z11, (a4x) ((fee) n0o0Var.getValue()).b());
                    default:
                        return new y9f0((q7f0) jo4Var.a().c(), (u0f0) ((fee) jo4Var.n.getValue()).c(), (a4x) ((fee) jo4Var.s.getValue()).b(), ((Boolean) ((fee) jo4Var.m.getValue()).c()).booleanValue());
                }
            }
        });
        final byte b5 = 4;
        this.u = bkb.G(a().d, new Function1(this) { // from class: a.obf0
            public final /* synthetic */ jo4 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x00a1  */
            /* JADX WARN: Code duplicated, block: B:60:0x01fb  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iK;
                Map map;
                int i;
                Object obj2;
                boolean z;
                int iIntValue;
                Map map2;
                boolean z2;
                Map map3;
                ArrayList arrayList;
                Integer numValueOf;
                ArrayList arrayList2;
                Integer numValueOf2;
                xgk0 xgk0Var;
                int i2;
                Iterator it;
                DocumentStateModel documentStateModel;
                String str;
                byte b6 = b5;
                jo4 jo4Var = this.b;
                switch (b6) {
                    case 0:
                        List<q7f0> list = (List) obj;
                        list.getClass();
                        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                        for (q7f0 q7f0Var : list) {
                            ctf0 ctf0Var2 = jo4Var.b;
                            q7f0 q7f0Var2 = (q7f0) jo4Var.a().c();
                            Integer num = (Integer) ((fee) jo4Var.k.getValue()).c();
                            boolean z3 = ((mbf0) jo4Var.v).r.C;
                            q7f0Var.getClass();
                            ctf0Var2.getClass();
                            long j = q7f0Var.f28247a;
                            String strQ = d5c.Q(q7f0Var, ctf0Var2, num);
                            int iOrdinal = q7f0Var.ordinal();
                            if (iOrdinal == 0) {
                                iK = R.drawable.ic_reg_email;
                            } else if (iOrdinal == 1) {
                                iK = R.drawable.ic_reg_phone_new;
                            } else if (iOrdinal == 2) {
                                iK = R.drawable.ic_reg_one_click_new;
                            } else if (iOrdinal == 3) {
                                iK = num != null ? xvw.K(num.intValue()) : R.drawable.ic_reg_social_network_new;
                            } else {
                                if (iOrdinal != 4) {
                                    t9f.b();
                                    return null;
                                }
                                iK = z3 ? R.drawable.ic_social_circle_itsme : R.drawable.ic_reg_import_personal_data_new;
                            }
                            arrayList3.add(new lxl(j, (dyl) new ayl(strQ, new m0x(iK, null, 6), Boolean.valueOf(!z3 && (num == null || q7f0Var != q7f0.SOCIAL)), 12), false, q7f0Var == q7f0Var2 ? uxl.b : uxl.f36445a, (cwl) null, 108));
                        }
                        return dyb.o0(arrayList3);
                    case 1:
                        ((Boolean) obj).getClass();
                        return new u9f0(jo4Var.b.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0)), !((Boolean) ((fee) jo4Var.m.getValue()).c()).booleanValue(), true);
                    case 2:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        List list2 = (List) feeVar.c();
                        ctf0 ctf0Var3 = jo4Var.b;
                        List list3 = (List) ((fee) jo4Var.f.getValue()).c();
                        q7f0 q7f0Var3 = (q7f0) jo4Var.a().c();
                        if (q7f0Var3 == null || (map = (Map) ((Map) ((fee) jo4Var.i.getValue()).c()).get(q7f0Var3)) == null) {
                            map = lun.f20680a;
                            map.getClass();
                        }
                        Map map4 = map;
                        p1f0 p1f0Var = (p1f0) ((fee) jo4Var.d.getValue()).c();
                        List list4 = (List) ((fee) jo4Var.j.getValue()).c();
                        mbf0 mbf0Var2 = (mbf0) jo4Var.v;
                        boolean z4 = mbf0Var2.q;
                        sff0 sff0Var = mbf0Var2.m;
                        boolean z5 = sff0Var.m.s;
                        v8d v8dVar = mbf0Var2.r;
                        boolean z6 = v8dVar.J;
                        boolean z7 = sff0Var.N.o;
                        List list5 = v8dVar.K;
                        Map map5 = (Map) ((fee) jo4Var.g.getValue()).c();
                        Map map6 = (Map) ((fee) jo4Var.h.getValue()).c();
                        boolean z8 = ((fee) jo4Var.k.getValue()).c() != null;
                        int iIntValue2 = ((Number) ((fee) jo4Var.o.getValue()).c()).intValue();
                        list2.getClass();
                        ctf0Var3.getClass();
                        list3.getClass();
                        map5.getClass();
                        map6.getClass();
                        p1f0Var.getClass();
                        CitizenshipStateModel citizenshipStateModel = p1f0Var.o;
                        list4.getClass();
                        list5.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                i = iIntValue2;
                                if (((q0f0) next) instanceof pze0) {
                                    obj2 = next;
                                } else {
                                    iIntValue2 = i;
                                }
                            } else {
                                i = iIntValue2;
                                obj2 = null;
                            }
                        }
                        pze0 pze0Var = obj2 instanceof pze0 ? (pze0) obj2 : null;
                        String strJ0 = sj3.j0(pze0Var != null ? pze0Var.e : null, "18");
                        if (list5.isEmpty()) {
                            z = false;
                        } else {
                            String str2 = citizenshipStateModel != null ? citizenshipStateModel.b : null;
                            if (str2 == null || str2.length() == 0 || list5.contains(Integer.valueOf(citizenshipStateModel.f46861a))) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            Object zze0Var = (q0f0) it3.next();
                            String str3 = strJ0;
                            if ((zze0Var instanceof qze0) && z) {
                                it = it3;
                                zze0Var = new qze0(true, false);
                            } else {
                                it = it3;
                                if ((zze0Var instanceof a0f0) && z) {
                                    zze0Var = new a0f0(true, false);
                                } else if ((zze0Var instanceof zze0) && z6 && (documentStateModel = p1f0Var.j) != null && documentStateModel.f46865a == 126) {
                                    zze0Var = new zze0(((zze0) zze0Var).c, false);
                                }
                            }
                            arrayList4.add(zze0Var);
                            strJ0 = str3;
                            it3 = it;
                        }
                        String str4 = strJ0;
                        ArrayList arrayList5 = new ArrayList();
                        for (Object obj3 : arrayList4) {
                            if (!((q0f0) obj3).a()) {
                                arrayList5.add(obj3);
                            }
                        }
                        if (arrayList5.isEmpty()) {
                            arrayList = arrayList5;
                            z2 = z7;
                            map3 = map5;
                            map2 = map6;
                        } else {
                            Iterator it4 = arrayList5.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((q0f0) it4.next()) instanceof p0f0) {
                                        if (!z8) {
                                            boolean zD = Intrinsics.d(map4.get(u0f0.j), prp.f27476a);
                                            lc00 lc00VarB2 = kotlin.collections.a.b();
                                            Iterator it5 = list4.iterator();
                                            while (it5.hasNext()) {
                                                int iIntValue3 = ((Number) it5.next()).intValue();
                                                if (iIntValue3 == 1) {
                                                    numValueOf = Integer.valueOf(R.string.social_vk);
                                                } else if (iIntValue3 == 5) {
                                                    numValueOf = Integer.valueOf(R.string.social_ok);
                                                } else if (iIntValue3 == 7) {
                                                    numValueOf = Integer.valueOf(R.string.social_yandex);
                                                } else if (iIntValue3 == 9) {
                                                    numValueOf = Integer.valueOf(R.string.social_mailru_label_new);
                                                } else if (iIntValue3 == 11) {
                                                    numValueOf = Integer.valueOf(R.string.social_google);
                                                } else if (iIntValue3 == 13) {
                                                    numValueOf = Integer.valueOf(R.string.social_x_com);
                                                } else if (iIntValue3 == 17) {
                                                    numValueOf = Integer.valueOf(R.string.social_telegram);
                                                } else if (iIntValue3 == 19) {
                                                    numValueOf = Integer.valueOf(R.string.social_apple_id);
                                                } else if (iIntValue3 != 26) {
                                                    numValueOf = iIntValue3 != 31 ? null : Integer.valueOf(R.string.social_discord);
                                                } else {
                                                    numValueOf = Integer.valueOf(R.string.social_its_me);
                                                }
                                                if (numValueOf != null) {
                                                    int iIntValue4 = numValueOf.intValue();
                                                    arrayList2 = arrayList5;
                                                    if (iIntValue3 == 1) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_vk);
                                                    } else if (iIntValue3 == 5) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_ok);
                                                    } else if (iIntValue3 == 7) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_yandex);
                                                    } else if (iIntValue3 == 9) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_mail);
                                                    } else if (iIntValue3 == 11) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_google);
                                                    } else if (iIntValue3 == 13) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_x);
                                                    } else if (iIntValue3 == 17) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_telegram);
                                                    } else if (iIntValue3 == 19) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_apple);
                                                    } else if (iIntValue3 != 26) {
                                                        numValueOf2 = iIntValue3 != 31 ? null : Integer.valueOf(R.drawable.ic_social_circle_discord);
                                                    } else {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_itsme);
                                                    }
                                                    if (numValueOf2 != null) {
                                                        int iIntValue5 = numValueOf2.intValue();
                                                        if (zD) {
                                                            xgk0Var = xgk0.b;
                                                        } else {
                                                            Integer num2 = p1f0Var.D;
                                                            xgk0Var = (num2 != null && num2.intValue() == iIntValue3) ? xgk0.f40845a : xgk0.c;
                                                        }
                                                        lc00VarB2.add(new ahk0(iIntValue3, iIntValue5, xgk0Var, ctf0Var3.b.a(iIntValue4, Arrays.copyOf(new Object[0], 0))));
                                                    }
                                                    map6 = map6;
                                                    z7 = z7;
                                                    map5 = map5;
                                                    it5 = it5;
                                                    arrayList5 = arrayList2;
                                                } else {
                                                    arrayList2 = arrayList5;
                                                }
                                                map6 = map6;
                                                z7 = z7;
                                                map5 = map5;
                                                it5 = it5;
                                                arrayList5 = arrayList2;
                                            }
                                            ArrayList arrayList6 = arrayList5;
                                            Map map7 = map6;
                                            boolean z9 = z7;
                                            Map map8 = map5;
                                            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB2);
                                            int iC = ctf0Var3.c();
                                            int size = list4.size();
                                            Integer numValueOf3 = size <= 0 ? 1 : size <= 4 ? Integer.valueOf(size) : null;
                                            if (numValueOf3 != null) {
                                                iIntValue = numValueOf3.intValue();
                                            } else if (320 > iC || iC >= 411) {
                                                iIntValue = (411 > iC || iC >= 600) ? 8 : 6;
                                            } else {
                                                iIntValue = 5;
                                            }
                                            if (numValueOf3 == null) {
                                                while (iIntValue > 2 && size % iIntValue == 1) {
                                                    iIntValue--;
                                                }
                                            }
                                            int i3 = iIntValue * 3;
                                            boolean z10 = p1f0Var.K;
                                            lc00 lc00VarB3 = kotlin.collections.a.b();
                                            if (!z10 && lc00VarA.b() > i3) {
                                                lc00VarB3.addAll(CollectionsKt.D0(lc00VarA, i3 - 1));
                                                lc00VarB3.add(new sgk0(false));
                                            } else if (!z10 || lc00VarA.b() <= i3) {
                                                lc00VarB3.addAll(lc00VarA);
                                            } else {
                                                lc00VarB3.addAll(lc00VarA);
                                                lc00VarB3.add(new sgk0(true));
                                            }
                                            lc00 lc00VarA2 = kotlin.collections.a.a(lc00VarB3);
                                            u0f0 u0f0Var = u0f0.f34852a;
                                            lc00VarB.add(new fjk0(lc00VarA2, zD, iIntValue));
                                            map2 = map7;
                                            z2 = z9;
                                            map3 = map8;
                                            arrayList = arrayList6;
                                        }
                                    }
                                }
                                arrayList = arrayList5;
                                z2 = z7;
                                map3 = map5;
                                map2 = map6;
                            }
                        }
                        c3x.p(lc00VarB, ctf0Var3, arrayList, map4, map3, map2, p1f0Var, list3, z2, i);
                        ArrayList<q0f0> arrayList7 = arrayList;
                        if (z4) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                            lc00VarB.add(c3x.s(u0f0.i1, ctf0Var3.b.a(R.string.company_rules, Arrays.copyOf(new Object[0], 0)), ctf0Var3));
                        }
                        u0f0 u0f0Var2 = u0f0.j1;
                        lsm0 lsm0Var = ctf0Var3.b;
                        lc00VarB.add(c3x.s(u0f0Var2, lsm0Var.a(R.string.info_privacy_policy, Arrays.copyOf(new Object[i2], i2)), ctf0Var3));
                        if (z5) {
                            lc00VarB.add(c3x.s(u0f0.k1, lsm0Var.a(R.string.responsible_game, Arrays.copyOf(new Object[i2], i2)), ctf0Var3));
                        }
                        for (q0f0 q0f0Var : arrayList7) {
                            if (q0f0Var != null) {
                                if (q0f0Var instanceof hze0) {
                                    str4.getClass();
                                    u0f0 u0f0Var3 = u0f0.f1;
                                    lc00VarB.add(new rzb(u0f0Var3, lsm0Var.a(R.string.min_age_confirmation_checkbox_v2, Arrays.copyOf(new Object[]{str4}, 1)), new yvl(uzb.q0(p1f0Var.b), c3x.v((urp) map4.get(u0f0Var3)), 2)));
                                } else if (q0f0Var instanceof mze0) {
                                    u0f0 u0f0Var4 = u0f0.y;
                                    lc00VarB.add(new rzb(u0f0Var4, lsm0Var.a(R.string.registration_commercial_communication_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.e), c3x.v((urp) map4.get(u0f0Var4)), 2)));
                                } else if (q0f0Var instanceof xze0) {
                                    u0f0 u0f0Var5 = u0f0.n1;
                                    lc00VarB.add(new rzb(u0f0Var5, lsm0Var.a(R.string.registration_notify_news_call_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.f), c3x.v((urp) map4.get(u0f0Var5)), 2)));
                                } else if (q0f0Var instanceof l0f0) {
                                    u0f0 u0f0Var6 = u0f0.x;
                                    lc00VarB.add(new rzb(u0f0Var6, lsm0Var.a(R.string.get_results_of_my_bets_by_email_reg, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.A), c3x.v((urp) map4.get(u0f0Var6)), 2)));
                                } else if (q0f0Var instanceof m0f0) {
                                    u0f0 u0f0Var7 = u0f0.w;
                                    lc00VarB.add(new rzb(u0f0Var7, lsm0Var.a(R.string.get_news_about_events_by_email, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.B), c3x.v((urp) map4.get(u0f0Var7)), 2)));
                                } else if (q0f0Var instanceof o0f0) {
                                    u0f0 u0f0Var8 = u0f0.z;
                                    lc00VarB.add(new rzb(u0f0Var8, lsm0Var.a(R.string.share_personal_data_confirmation_checkbox_fixed_new, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.C), c3x.v((urp) map4.get(u0f0Var8)), 2)));
                                } else if (q0f0Var instanceof i0f0) {
                                    u0f0 u0f0Var9 = u0f0.A;
                                    lc00VarB.add(new rzb(u0f0Var9, lsm0Var.a(R.string.registration_rules_confirmation_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.x), c3x.v((urp) map4.get(u0f0Var9)), 2)));
                                } else if (q0f0Var instanceof j0f0) {
                                    str4.getClass();
                                    u0f0 u0f0Var10 = u0f0.B;
                                    lc00VarB.add(new rzb(u0f0Var10, lsm0Var.a(R.string.registration_rules_confirmation_all_v2, Arrays.copyOf(new Object[]{str4}, 1)), new yvl(uzb.q0(p1f0Var.y), c3x.v((urp) map4.get(u0f0Var10)), 2)));
                                } else if (q0f0Var instanceof n0f0) {
                                    u0f0 u0f0Var11 = u0f0.o1;
                                    lc00VarB.add(new rzb(u0f0Var11, lsm0Var.a(R.string.receive_news_about_events_via_SMS, Arrays.copyOf(new Object[0], 0)), new yvl(uzb.q0(p1f0Var.L), c3x.v((urp) map4.get(u0f0Var11)), 2)));
                                }
                            }
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 3:
                        n0o0 n0o0Var = jo4Var.p;
                        fee feeVar2 = (fee) n0o0Var.getValue();
                        ctf0 ctf0Var4 = jo4Var.b;
                        boolean z11 = ((List) feeVar2.c()).size() > 1;
                        String strA = ctf0Var4.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0));
                        if (z11) {
                            q7f0 q7f0Var4 = (q7f0) jo4Var.a().c();
                            String strQ2 = q7f0Var4 != null ? d5c.Q(q7f0Var4, ctf0Var4, (Integer) ((fee) jo4Var.k.getValue()).c()) : null;
                            if (strQ2 == null) {
                                str = "";
                            } else {
                                str = strQ2;
                            }
                        } else {
                            str = "";
                        }
                        return new t9f0(strA, str, (String) ((fee) jo4Var.r.getValue()).b(), z11, (a4x) ((fee) n0o0Var.getValue()).b());
                    default:
                        return new y9f0((q7f0) jo4Var.a().c(), (u0f0) ((fee) jo4Var.n.getValue()).c(), (a4x) ((fee) jo4Var.s.getValue()).b(), ((Boolean) ((fee) jo4Var.m.getValue()).c()).booleanValue());
                }
            }
        });
    }
}
