package a;

import android.graphics.Typeface;
import android.os.LocaleList;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.ScaleXSpan;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class v03 implements ao80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36564a;
    public final y9q0 b;
    public final List c;
    public final List d;
    public final mrq e;
    public final w6k f;
    public final j23 g;
    public final CharSequence h;
    public final q6z i;
    public y3v j;
    public final boolean k;
    public final int l;
    public final int m;

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    /* JADX WARN: Code duplicated, block: B:18:0x0076  */
    /* JADX WARN: Code duplicated, block: B:197:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:199:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:200:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:203:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:209:0x040b  */
    /* JADX WARN: Code duplicated, block: B:216:0x042b  */
    /* JADX WARN: Code duplicated, block: B:217:0x042d  */
    /* JADX WARN: Code duplicated, block: B:219:0x0431  */
    /* JADX WARN: Code duplicated, block: B:222:0x043f  */
    /* JADX WARN: Code duplicated, block: B:225:0x0446  */
    /* JADX WARN: Code duplicated, block: B:227:0x044c  */
    /* JADX WARN: Code duplicated, block: B:232:0x0462  */
    /* JADX WARN: Code duplicated, block: B:233:0x0465  */
    /* JADX WARN: Code duplicated, block: B:236:0x046b  */
    /* JADX WARN: Code duplicated, block: B:237:0x046e  */
    /* JADX WARN: Code duplicated, block: B:241:0x0489  */
    /* JADX WARN: Code duplicated, block: B:243:0x049b  */
    /* JADX WARN: Code duplicated, block: B:245:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:247:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:253:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:254:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:256:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:257:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:260:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:261:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:263:0x0503  */
    /* JADX WARN: Code duplicated, block: B:264:0x0509  */
    /* JADX WARN: Code duplicated, block: B:268:0x0536  */
    /* JADX WARN: Code duplicated, block: B:270:0x0542  */
    /* JADX WARN: Code duplicated, block: B:272:0x0549  */
    /* JADX WARN: Code duplicated, block: B:279:0x0558  */
    /* JADX WARN: Code duplicated, block: B:283:0x0562  */
    /* JADX WARN: Code duplicated, block: B:292:0x0573  */
    /* JADX WARN: Code duplicated, block: B:295:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:297:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:300:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:302:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:304:0x05f6 A[LOOP:8: B:303:0x05f4->B:304:0x05f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:307:0x060e  */
    /* JADX WARN: Code duplicated, block: B:309:0x0613  */
    /* JADX WARN: Code duplicated, block: B:311:0x061a  */
    /* JADX WARN: Code duplicated, block: B:313:0x061e  */
    /* JADX WARN: Code duplicated, block: B:314:0x0627  */
    /* JADX WARN: Code duplicated, block: B:316:0x0630  */
    /* JADX WARN: Code duplicated, block: B:318:0x0644  */
    /* JADX WARN: Code duplicated, block: B:327:0x0668  */
    /* JADX WARN: Code duplicated, block: B:332:0x0685  */
    /* JADX WARN: Code duplicated, block: B:334:0x0691  */
    /* JADX WARN: Code duplicated, block: B:336:0x0697  */
    /* JADX WARN: Code duplicated, block: B:341:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:394:0x07df  */
    /* JADX WARN: Code duplicated, block: B:396:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:398:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:400:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:405:0x0808  */
    /* JADX WARN: Code duplicated, block: B:418:0x0855  */
    /* JADX WARN: Code duplicated, block: B:420:0x0866  */
    /* JADX WARN: Code duplicated, block: B:421:0x086b  */
    /* JADX WARN: Code duplicated, block: B:423:0x0876  */
    /* JADX WARN: Code duplicated, block: B:424:0x087d  */
    /* JADX WARN: Code duplicated, block: B:426:0x0881  */
    /* JADX WARN: Code duplicated, block: B:429:0x088a  */
    /* JADX WARN: Code duplicated, block: B:431:0x0896  */
    /* JADX WARN: Code duplicated, block: B:432:0x0899  */
    /* JADX WARN: Code duplicated, block: B:434:0x089d  */
    /* JADX WARN: Code duplicated, block: B:436:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:441:0x08d3  */
    /* JADX WARN: Code duplicated, block: B:445:0x08de  */
    /* JADX WARN: Code duplicated, block: B:447:0x08e9  */
    /* JADX WARN: Code duplicated, block: B:449:0x08f7 A[LOOP:7: B:448:0x08f5->B:449:0x08f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:452:0x0904  */
    /* JADX WARN: Code duplicated, block: B:454:0x0908  */
    /* JADX WARN: Code duplicated, block: B:457:0x0919  */
    /* JADX WARN: Code duplicated, block: B:469:0x055b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x0657 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:447:0x08e9, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a.v03, java.lang.Object] */
    public v03(String str, y9q0 y9q0Var, List list, List list2, mrq mrqVar, w6k w6kVar, boolean z) throws Throwable {
        boolean zBooleanValue;
        Locale locale;
        int i;
        Object obj;
        awh awhVar;
        Typeface typeface;
        CharSequence charSequenceG;
        Spannable spannableString;
        smk0 smk0Var;
        eo80 eo80Var;
        rw90 rw90Var;
        boolean z2;
        m600 m600Var;
        float fT;
        int length;
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        g8q0 g8q0Var;
        ArrayList arrayList;
        int size;
        int i4;
        nrq nrqVar;
        smk0 smk0Var2;
        in80 in80Var;
        int size2;
        int i5;
        int[] iArr;
        int size3;
        int i6;
        int i7;
        int i8;
        int i9;
        int size4;
        int i10;
        ArrayList arrayList2;
        int i11;
        int i12;
        int i13;
        int i14;
        int size5;
        int i15;
        boolean z5;
        Spannable spannable;
        w6k w6kVar2;
        g8q0 g8q0Var2;
        float f;
        int size6;
        int i16;
        v03 v03Var;
        i83 i83Var;
        int i17;
        Object obj2;
        nd9 nd9Var;
        float fS;
        long j;
        long jB;
        float fC;
        int size7;
        int i18;
        i83 i83Var2;
        f83 f83Var;
        int i19;
        int i20;
        int i21;
        i83 i83Var3;
        Object obj3;
        int i22;
        int i23;
        Spannable spannable2;
        int i24;
        int i25;
        i83 i83Var4;
        Object obj4;
        smk0 smk0Var3;
        long j2;
        long j3;
        int i26;
        long jB2;
        float fC2;
        long jB3;
        float fC3;
        ew90 ew90Var;
        ew90 ew90Var2;
        ?? obj5 = new Object();
        obj5.f36564a = str;
        obj5.b = y9q0Var;
        obj5.c = list;
        obj5.d = list2;
        obj5.e = mrqVar;
        obj5.f = w6kVar;
        float density = w6kVar.getDensity();
        j23 j23Var = new j23(1);
        ((TextPaint) j23Var).density = density;
        j23Var.b = k5q0.b;
        j23Var.c = (byte) 3;
        j23Var.d = ljj0.d;
        obj5.g = j23Var;
        boolean zV = m8x.V(y9q0Var);
        smk0 smk0Var4 = y9q0Var.f42262a;
        eo80 eo80Var2 = y9q0Var.b;
        if (zV) {
            clc clcVar = usn.f36220a;
            clc clcVar2 = usn.f36220a;
            l7m0 l7m0VarE = (l7m0) clcVar2.b;
            if (l7m0VarE == null) {
                if (qsn.d()) {
                    l7m0VarE = clcVar2.e();
                    clcVar2.b = l7m0VarE;
                } else {
                    l7m0VarE = y0x0.i;
                }
            }
            zBooleanValue = ((Boolean) l7m0VarE.getValue()).booleanValue();
        } else {
            zBooleanValue = false;
        }
        obj5.k = zBooleanValue;
        int i27 = eo80Var2.b;
        rs00 rs00Var = smk0Var4.k;
        byte b = 2;
        if (i27 == 4) {
            i = 2;
        } else if (i27 == 5) {
            i = 3;
        } else if (i27 == 1) {
            i = 0;
        } else if (i27 == 2) {
            i = 1;
        } else {
            if (i27 != 3 && i27 != 0) {
                jf4.n("Invalid TextDirection.");
                throw null;
            }
            int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale((rs00Var == null || (locale = ((qs00) rs00Var.f31011a.get(0)).f29235a) == null) ? Locale.getDefault() : locale);
            if (layoutDirectionFromLocale == 0 || layoutDirectionFromLocale != 1) {
                i = 2;
            } else {
                i = 3;
            }
        }
        obj5.l = i;
        obj5.m = -1;
        awh awhVar2 = new awh(obj5, b);
        i9q0 i9q0Var = eo80Var2.i;
        i9q0Var = i9q0Var == null ? i9q0.c : i9q0Var;
        j23Var.setFlags(i9q0Var.b ? j23Var.getFlags() | 128 : j23Var.getFlags() & (-129));
        int i28 = i9q0Var.f14400a;
        if (i28 == 1) {
            j23Var.setFlags(j23Var.getFlags() | 64);
            j23Var.setHinting(0);
        } else if (i28 == 2) {
            j23Var.getFlags();
            j23Var.setHinting(1);
        } else if (i28 == 3) {
            j23Var.getFlags();
            j23Var.setHinting(0);
        } else {
            j23Var.getFlags();
        }
        int size8 = list.size();
        int i29 = 0;
        while (true) {
            if (i29 >= size8) {
                obj = null;
                break;
            }
            obj = list.get(i29);
            if (((i83) obj).f14321a instanceof smk0) {
                break;
            } else {
                i29++;
            }
        }
        boolean z6 = obj != null;
        long j4 = smk0Var4.b;
        psq psqVar = smk0Var4.c;
        lsq lsqVar = smk0Var4.d;
        String str2 = smk0Var4.g;
        rs00 rs00Var2 = smk0Var4.k;
        e8q0 e8q0Var = smk0Var4.f32451a;
        f8q0 f8q0Var = smk0Var4.j;
        long j5 = smk0Var4.h;
        long jB4 = daq0.b(j4);
        boolean z7 = z6;
        if (eaq0.a(jB4, 4294967296L)) {
            j23Var.setTextSize(w6kVar.X(j4));
        } else if (eaq0.a(jB4, 8589934592L)) {
            j23Var.setTextSize(daq0.c(j4) * j23Var.getTextSize());
        }
        nrq nrqVar2 = smk0Var4.f;
        if (nrqVar2 == null && lsqVar == null && psqVar == null) {
            awhVar = awhVar2;
        } else {
            psq psqVar2 = psqVar == null ? psq.e : psqVar;
            int i30 = lsqVar != null ? lsqVar.f20592a : 0;
            msq msqVar = smk0Var4.e;
            int i31 = msqVar != null ? msqVar.f22332a : 65535;
            awhVar = awhVar2;
            v03 v03Var2 = (v03) awhVar.b;
            b1t0 b1t0VarB = ((orq) v03Var2.e).b(nrqVar2, psqVar2, i30, i31);
            if (b1t0VarB instanceof a1t0) {
                Object obj6 = ((a1t0) b1t0VarB).f90a;
                obj6.getClass();
                typeface = (Typeface) obj6;
            } else {
                y3v y3vVar = new y3v(b1t0VarB, v03Var2.j);
                v03Var2.j = y3vVar;
                Object obj7 = y3vVar.d;
                obj7.getClass();
                typeface = (Typeface) obj7;
            }
            j23Var.setTypeface(typeface);
        }
        if (rs00Var2 != null) {
            rs00 rs00Var3 = rs00.c;
            if (!rs00Var2.equals(wv90.f39830a.u())) {
                ArrayList arrayList3 = new ArrayList(r3d.q(rs00Var2, 10));
                Iterator it = rs00Var2.f31011a.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((qs00) it.next()).f29235a);
                }
                Locale[] localeArr = (Locale[]) arrayList3.toArray(new Locale[0]);
                j23Var.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            }
        }
        if (str2 != null && !str2.equals("")) {
            j23Var.setFontFeatureSettings(str2);
        }
        if (f8q0Var != null && !f8q0Var.equals(f8q0.c)) {
            j23Var.setTextScaleX(j23Var.getTextScaleX() * f8q0Var.f9121a);
            j23Var.setTextSkewX(j23Var.getTextSkewX() + f8q0Var.b);
        }
        j23Var.d(e8q0Var.h());
        j23Var.c(e8q0Var.l(), 9205357640488583168L, e8q0Var.g());
        j23Var.f(smk0Var4.n);
        j23Var.g(smk0Var4.m);
        j23Var.e(smk0Var4.o);
        if (eaq0.a(daq0.b(j5), 4294967296L) && daq0.c(j5) != 0.0f) {
            float textScaleX = j23Var.getTextScaleX() * j23Var.getTextSize();
            float fX = w6kVar.X(j5);
            if (textScaleX != 0.0f) {
                j23Var.setLetterSpacing(fX / textScaleX);
            }
        } else if (eaq0.a(daq0.b(j5), 8589934592L)) {
            j23Var.setLetterSpacing(daq0.c(j5));
        }
        long j6 = smk0Var4.l;
        j56 j56Var = smk0Var4.i;
        boolean z8 = z7 && eaq0.a(daq0.b(j5), 4294967296L) && daq0.c(j5) != 0.0f;
        long j7 = y3d.g;
        boolean z9 = (h2t0.a(j6, j7) || h2t0.a(j6, y3d.f)) ? false : true;
        boolean z10 = (j56Var == null || Float.compare(j56Var.f15918a, 0.0f) == 0) ? false : true;
        smk0 smk0Var5 = (z8 || z9 || z10) ? new smk0(0L, 0L, null, null, null, null, null, z8 ? j5 : daq0.c, z10 ? j56Var : null, null, null, z9 ? j6 : j7, null, null, null, 63103) : null;
        List list3 = obj5.c;
        if (smk0Var5 != null) {
            int size9 = list3.size() + 1;
            ArrayList arrayList4 = new ArrayList(size9);
            int i32 = 0;
            while (i32 < size9) {
                arrayList4.add(i32 == 0 ? new i83(0, obj5.f36564a.length(), smk0Var5) : (i83) obj5.c.get(i32 - 1));
                i32++;
            }
            list3 = arrayList4;
        }
        String str3 = obj5.f36564a;
        float textSize = obj5.g.getTextSize();
        y9q0 y9q0Var2 = obj5.b;
        List list4 = obj5.d;
        w6k w6kVar3 = obj5.f;
        boolean z11 = obj5.k;
        String str4 = obj5.f36564a;
        if (obj5.m == -1) {
            obj5.m = (str4.length() > 512 || StringsKt.P(str4, '\n')) ? 1 : 0;
        }
        t03 t03Var = u03.f34834a;
        if (z11 && qsn.d()) {
            rw90 rw90Var2 = y9q0Var2.c;
            etn etnVar = (rw90Var2 == null || (ew90Var2 = rw90Var2.f31208a) == null) ? null : new etn(ew90Var2.b);
            charSequenceG = qsn.a().g(0, str3.length(), (etnVar != null && etnVar.f8383a == 2) ? 1 : 0, str3);
            charSequenceG.getClass();
        } else {
            charSequenceG = str3;
        }
        if (list3.isEmpty() && list4.isEmpty() && Intrinsics.d(y9q0Var2.b.d, g8q0.c)) {
            v03Var = obj5;
            if ((y9q0Var2.b.c & 1095216660480L) != 0) {
                if (charSequenceG instanceof Spannable) {
                    spannableString = (Spannable) charSequenceG;
                } else {
                    spannableString = new SpannableString(charSequenceG);
                }
                smk0Var = y9q0Var2.f42262a;
                eo80Var = y9q0Var2.b;
                if (Intrinsics.d(smk0Var.m, k5q0.c)) {
                    spannableString.setSpan(u03.f34834a, 0, str3.length(), 33);
                }
                rw90Var = y9q0Var2.c;
                if (rw90Var != null) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (z2) {
                    m600Var = eo80Var.f;
                    if (m600Var == null) {
                    }
                    fT = azw.T(eo80Var.c, textSize, w6kVar3);
                    if (Float.isNaN(fT)) {
                        i3 = 0;
                    } else {
                        if (spannableString.length() == 0) {
                            length = spannableString.length() + 1;
                        } else {
                            length = spannableString.length();
                        }
                        int i33 = length;
                        i2 = m600Var.b;
                        if ((i2 & 1) > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i2 & 16) > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        i3 = 0;
                        spannableString.setSpan(new n600(fT, i33, z3, z4, m600Var.f21243a, m600Var.c), 0, spannableString.length(), 33);
                    }
                } else {
                    m600Var = eo80Var.f;
                    if (m600Var == null) {
                    }
                    fT = azw.T(eo80Var.c, textSize, w6kVar3);
                    if (Float.isNaN(fT)) {
                        if (spannableString.length() == 0) {
                            length = spannableString.length() + 1;
                        } else {
                            length = spannableString.length();
                        }
                        int i34 = length;
                        i2 = m600Var.b;
                        if ((i2 & 1) > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if ((i2 & 16) > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        i3 = 0;
                        spannableString.setSpan(new n600(fT, i34, z3, z4, m600Var.f21243a, m600Var.c), 0, spannableString.length(), 33);
                    } else {
                        i3 = 0;
                    }
                }
                g8q0Var = eo80Var.d;
                if (g8q0Var != null) {
                    j2 = g8q0Var.f10879a;
                    j3 = g8q0Var.b;
                    i26 = i3;
                    if (daq0.a(j2, idm0.t(i26))) {
                        jB2 = daq0.b(j2);
                        if (eaq0.a(jB2, 4294967296L)) {
                            fC2 = w6kVar3.X(j2);
                        } else if (eaq0.a(jB2, 8589934592L)) {
                            fC2 = daq0.c(j2) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        jB3 = daq0.b(j3);
                        if (eaq0.a(jB3, 4294967296L)) {
                            fC3 = w6kVar3.X(j3);
                        } else if (eaq0.a(jB3, 8589934592L)) {
                            fC3 = daq0.c(j3) * textSize;
                        } else {
                            fC3 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC2), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                    } else {
                        jB2 = daq0.b(j2);
                        if (eaq0.a(jB2, 4294967296L)) {
                            fC2 = w6kVar3.X(j2);
                        } else if (eaq0.a(jB2, 8589934592L)) {
                            fC2 = daq0.c(j2) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        jB3 = daq0.b(j3);
                        if (eaq0.a(jB3, 4294967296L)) {
                            fC3 = w6kVar3.X(j3);
                        } else if (eaq0.a(jB3, 8589934592L)) {
                            fC3 = daq0.c(j3) * textSize;
                        } else {
                            fC3 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC2), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                    }
                }
                arrayList = new ArrayList(list3.size());
                size = list3.size();
                for (i4 = 0; i4 < size; i4++) {
                    i83Var4 = (i83) list3.get(i4);
                    obj4 = i83Var4.f14321a;
                    if (obj4 instanceof smk0) {
                        smk0Var3 = (smk0) obj4;
                        if (smk0Var3.f == null) {
                            arrayList.add(i83Var4);
                        } else {
                            arrayList.add(i83Var4);
                        }
                    }
                }
                nrqVar = smk0Var.f;
                if (nrqVar != null) {
                    smk0Var2 = new smk0(0L, 0L, smk0Var.c, smk0Var.d, smk0Var.e, nrqVar, null, 0L, null, null, null, 0L, null, null, null, 65475);
                } else {
                    smk0Var2 = new smk0(0L, 0L, smk0Var.c, smk0Var.d, smk0Var.e, nrqVar, null, 0L, null, null, null, 0L, null, null, null, 65475);
                }
                in80Var = new in80(spannableString, awhVar, (byte) 29);
                if (arrayList.size() > 1) {
                    size2 = arrayList.size();
                    i5 = size2 * 2;
                    iArr = new int[i5];
                    size3 = arrayList.size();
                    for (i6 = 0; i6 < size3; i6++) {
                        i83 i83Var5 = (i83) arrayList.get(i6);
                        iArr[i6] = i83Var5.b;
                        iArr[i6 + size2] = i83Var5.c;
                    }
                    if (i5 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i5 == 0) {
                        v4i0.o("Array is empty.");
                        throw null;
                    }
                    i7 = iArr[0];
                    i8 = 0;
                    while (i8 < i5) {
                        i9 = iArr[i8];
                        if (i9 == i7) {
                            arrayList2 = arrayList;
                            i11 = i8;
                            i12 = i5;
                        } else {
                            size4 = arrayList.size();
                            i10 = 0;
                            while (i10 < size4) {
                                ArrayList arrayList5 = arrayList;
                                i83 i83Var6 = (i83) arrayList.get(i10);
                                int i35 = i8;
                                i13 = i83Var6.b;
                                int i36 = i5;
                                i14 = i83Var6.c;
                                if (i13 == i14) {
                                }
                                i10++;
                                arrayList = arrayList5;
                                i8 = i35;
                                i5 = i36;
                            }
                            arrayList2 = arrayList;
                            i11 = i8;
                            i12 = i5;
                            if (smk0Var2 != null) {
                                in80Var.F(smk0Var2, Integer.valueOf(i7), Integer.valueOf(i9));
                            }
                            i7 = i9;
                        }
                        i8 = i11 + 1;
                        smk0Var2 = smk0Var2;
                        arrayList = arrayList2;
                        i5 = i12;
                    }
                } else if (!arrayList.isEmpty()) {
                    smk0 smk0Var6 = (smk0) ((i83) arrayList.get(0)).f14321a;
                    in80Var.F(smk0Var2 != null ? smk0Var2.d(smk0Var6) : smk0Var6, Integer.valueOf(((i83) arrayList.get(0)).b), Integer.valueOf(((i83) arrayList.get(0)).c));
                }
                size5 = list3.size();
                i15 = 0;
                z5 = false;
                while (i15 < size5) {
                    i83Var3 = (i83) list3.get(i15);
                    obj3 = i83Var3.f14321a;
                    if (obj3 instanceof smk0) {
                        i24 = i83Var3.b;
                        int i37 = i83Var3.c;
                        if (i24 >= 0) {
                            i22 = size5;
                            i23 = i15;
                            z5 = z5;
                            spannable2 = spannableString;
                            w6kVar3 = w6kVar3;
                            z5 = z5;
                        } else {
                            i22 = size5;
                            i23 = i15;
                            z5 = z5;
                            spannable2 = spannableString;
                            w6kVar3 = w6kVar3;
                            z5 = z5;
                        }
                    } else {
                        i22 = size5;
                        i23 = i15;
                        z5 = z5;
                        spannable2 = spannableString;
                        w6kVar3 = w6kVar3;
                        z5 = z5;
                    }
                    i15 = i23 + 1;
                    size5 = i22;
                    spannableString = spannable2;
                    w6kVar3 = w6kVar3;
                    eo80Var = eo80Var;
                }
                spannable = spannableString;
                eo80 eo80Var3 = eo80Var;
                w6kVar2 = w6kVar3;
                if (z5) {
                    size7 = list3.size();
                    i18 = 0;
                    while (i18 < size7) {
                        i83Var2 = (i83) list3.get(i18);
                        f83Var = (f83) i83Var2.f14321a;
                        if (f83Var instanceof smk0) {
                            i21 = i83Var2.b;
                            int i38 = i83Var2.c;
                            if (i21 >= 0) {
                                i19 = size7;
                                i20 = i18;
                            } else {
                                i19 = size7;
                                i20 = i18;
                            }
                        } else {
                            i19 = size7;
                            i20 = i18;
                        }
                        i18 = i20 + 1;
                        size7 = i19;
                    }
                }
                g8q0Var2 = eo80Var3.d;
                if (g8q0Var2 != null) {
                    j = g8q0Var2.f10879a;
                    jB = daq0.b(j);
                    if (eaq0.a(jB, 4294967296L)) {
                        fC = w6kVar2.X(j);
                    } else if (eaq0.a(jB, 8589934592L)) {
                        fC = daq0.c(j) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    f = fC;
                } else {
                    f = 0.0f;
                }
                size6 = list3.size();
                for (i16 = 0; i16 < size6; i16++) {
                    i83 i83Var7 = (i83) list3.get(i16);
                    obj2 = i83Var7.f14321a;
                    if (obj2 instanceof nd9) {
                        nd9Var = (nd9) obj2;
                    } else {
                        nd9Var = null;
                    }
                    if (nd9Var != null) {
                        fS = azw.S(nd9Var.f23328a, textSize, w6kVar2);
                        float fS2 = azw.S(nd9Var.b, textSize, w6kVar2);
                        float fS3 = azw.S(nd9Var.c, textSize, w6kVar2);
                        if (Float.isNaN(fS)) {
                        }
                    }
                }
                if (list4.size() > 0) {
                    i83Var = (i83) list4.get(0);
                    if (i83Var.f14321a != null) {
                        hny.b();
                        throw null;
                    }
                    for (Object obj8 : spannable.getSpans(i83Var.b, i83Var.c, v0t0.class)) {
                        spannable.removeSpan((v0t0) obj8);
                    }
                    throw null;
                }
                v03Var = this;
                charSequenceG = spannable;
            }
        } else {
            if (charSequenceG instanceof Spannable) {
                spannableString = (Spannable) charSequenceG;
            } else {
                spannableString = new SpannableString(charSequenceG);
            }
            smk0Var = y9q0Var2.f42262a;
            eo80Var = y9q0Var2.b;
            if (Intrinsics.d(smk0Var.m, k5q0.c)) {
                spannableString.setSpan(u03.f34834a, 0, str3.length(), 33);
            }
            rw90Var = y9q0Var2.c;
            if (rw90Var != null || (ew90Var = rw90Var.f31208a) == null) {
                z2 = false;
            } else {
                z2 = ew90Var.f8511a;
            }
            if (z2 || eo80Var.f != null) {
                m600Var = eo80Var.f;
                m600Var = m600Var == null ? m600.d : m600Var;
                fT = azw.T(eo80Var.c, textSize, w6kVar3);
                if (Float.isNaN(fT)) {
                    if (spannableString.length() == 0 && ttm0.J(spannableString) != '\n') {
                        length = spannableString.length();
                    } else {
                        length = spannableString.length() + 1;
                    }
                    int i39 = length;
                    i2 = m600Var.b;
                    if ((i2 & 1) > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if ((i2 & 16) > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    i3 = 0;
                    spannableString.setSpan(new n600(fT, i39, z3, z4, m600Var.f21243a, m600Var.c), 0, spannableString.length(), 33);
                }
                g8q0Var = eo80Var.d;
                if (g8q0Var != null) {
                    j2 = g8q0Var.f10879a;
                    j3 = g8q0Var.b;
                    i26 = i3;
                    if ((daq0.a(j2, idm0.t(i26)) || !daq0.a(j3, idm0.t(i26))) && (j2 & 1095216660480L) != 0 && (j3 & 1095216660480L) != 0) {
                        jB2 = daq0.b(j2);
                        if (eaq0.a(jB2, 4294967296L)) {
                            fC2 = w6kVar3.X(j2);
                        } else if (eaq0.a(jB2, 8589934592L)) {
                            fC2 = daq0.c(j2) * textSize;
                        } else {
                            fC2 = 0.0f;
                        }
                        jB3 = daq0.b(j3);
                        if (eaq0.a(jB3, 4294967296L)) {
                            fC3 = w6kVar3.X(j3);
                        } else if (eaq0.a(jB3, 8589934592L)) {
                            fC3 = daq0.c(j3) * textSize;
                        } else {
                            fC3 = 0.0f;
                        }
                        spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC2), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                    }
                }
                arrayList = new ArrayList(list3.size());
                size = list3.size();
                while (i4 < size) {
                    i83Var4 = (i83) list3.get(i4);
                    obj4 = i83Var4.f14321a;
                    if (obj4 instanceof smk0) {
                        smk0Var3 = (smk0) obj4;
                        if (smk0Var3.f == null || smk0Var3.d != null || smk0Var3.c != null || ((smk0) obj4).e != null) {
                            arrayList.add(i83Var4);
                        }
                    }
                }
                nrqVar = smk0Var.f;
                if (nrqVar != null && smk0Var.d == null && smk0Var.c == null && smk0Var.e == null) {
                    smk0Var2 = null;
                } else {
                    smk0Var2 = new smk0(0L, 0L, smk0Var.c, smk0Var.d, smk0Var.e, nrqVar, null, 0L, null, null, null, 0L, null, null, null, 65475);
                }
                in80Var = new in80(spannableString, awhVar, (byte) 29);
                if (arrayList.size() > 1) {
                    size2 = arrayList.size();
                    i5 = size2 * 2;
                    iArr = new int[i5];
                    size3 = arrayList.size();
                    while (i6 < size3) {
                        i83 i83Var8 = (i83) arrayList.get(i6);
                        iArr[i6] = i83Var8.b;
                        iArr[i6 + size2] = i83Var8.c;
                    }
                    if (i5 > 1) {
                        Arrays.sort(iArr);
                    }
                    if (i5 == 0) {
                        v4i0.o("Array is empty.");
                        throw null;
                    }
                    i7 = iArr[0];
                    i8 = 0;
                    while (i8 < i5) {
                        i9 = iArr[i8];
                        if (i9 == i7) {
                            arrayList2 = arrayList;
                            i11 = i8;
                            i12 = i5;
                        } else {
                            size4 = arrayList.size();
                            i10 = 0;
                            while (i10 < size4) {
                                ArrayList arrayList6 = arrayList;
                                i83 i83Var9 = (i83) arrayList.get(i10);
                                int i310 = i8;
                                i13 = i83Var9.b;
                                int i311 = i5;
                                i14 = i83Var9.c;
                                if (i13 == i14 && k83.b(i7, i9, i13, i14)) {
                                    smk0 smk0Var7 = (smk0) i83Var9.f14321a;
                                    smk0Var2 = smk0Var2 != null ? smk0Var2.d(smk0Var7) : smk0Var7;
                                }
                                i10++;
                                arrayList = arrayList6;
                                i8 = i310;
                                i5 = i311;
                            }
                            arrayList2 = arrayList;
                            i11 = i8;
                            i12 = i5;
                            if (smk0Var2 != null) {
                                in80Var.F(smk0Var2, Integer.valueOf(i7), Integer.valueOf(i9));
                            }
                            i7 = i9;
                        }
                        i8 = i11 + 1;
                        smk0Var2 = smk0Var2;
                        arrayList = arrayList2;
                        i5 = i12;
                    }
                } else if (!arrayList.isEmpty()) {
                    smk0 smk0Var8 = (smk0) ((i83) arrayList.get(0)).f14321a;
                    in80Var.F(smk0Var2 != null ? smk0Var2.d(smk0Var8) : smk0Var8, Integer.valueOf(((i83) arrayList.get(0)).b), Integer.valueOf(((i83) arrayList.get(0)).c));
                }
                size5 = list3.size();
                i15 = 0;
                z5 = false;
                while (i15 < size5) {
                    i83Var3 = (i83) list3.get(i15);
                    obj3 = i83Var3.f14321a;
                    if (obj3 instanceof smk0) {
                        i24 = i83Var3.b;
                        int i312 = i83Var3.c;
                        if (i24 >= 0 || i24 >= spannableString.length() || i312 <= i24 || i312 > spannableString.length()) {
                            i22 = size5;
                            i23 = i15;
                            z5 = z5;
                            spannable2 = spannableString;
                            w6kVar3 = w6kVar3;
                        } else {
                            smk0 smk0Var9 = (smk0) obj3;
                            i22 = size5;
                            i23 = i15;
                            long j8 = smk0Var9.h;
                            j56 j56Var2 = smk0Var9.i;
                            e8q0 e8q0Var2 = smk0Var9.f32451a;
                            if (j56Var2 != null) {
                                spannableString.setSpan(new k56(j56Var2.f15918a, (byte) 0), i24, i312, 33);
                            }
                            azw.U(spannableString, e8q0Var2.h(), i24, i312);
                            t89 t89VarL = e8q0Var2.l();
                            float fG = e8q0Var2.g();
                            if (t89VarL != null) {
                                if (t89VarL instanceof skk0) {
                                    azw.U(spannableString, ((skk0) t89VarL).f32354a, i24, i312);
                                } else {
                                    spannableString.setSpan(new jjj0((ijj0) t89VarL, fG), i24, i312, 33);
                                }
                            }
                            k5q0 k5q0Var = smk0Var9.m;
                            if (k5q0Var != null) {
                                int i40 = k5q0Var.f17733a;
                                l5q0 l5q0Var = new l5q0((i40 | 1) == i40, (i40 | 2) == i40);
                                i25 = 33;
                                spannableString.setSpan(l5q0Var, i24, i312, 33);
                            } else {
                                i25 = 33;
                            }
                            azw.V(spannableString, smk0Var9.b, w6kVar3, i24, i312);
                            spannable2 = spannableString;
                            String str5 = smk0Var9.g;
                            if (str5 != null) {
                                spannable2.setSpan(new fyc(str5, (byte) 1), i24, i312, i25);
                            }
                            f8q0 f8q0Var2 = smk0Var9.j;
                            if (f8q0Var2 != null) {
                                spannable2.setSpan(new ScaleXSpan(f8q0Var2.f9121a), i24, i312, i25);
                                spannable2.setSpan(new k56(f8q0Var2.b, (byte) 1), i24, i312, i25);
                            }
                            azw.W(spannable2, smk0Var9.k, i24, i312);
                            long j9 = smk0Var9.l;
                            if (j9 != 16) {
                                spannable2.setSpan(new BackgroundColorSpan(fbc.U(j9)), i24, i312, i25);
                            }
                            ljj0 ljj0Var = smk0Var9.n;
                            if (ljj0Var != null) {
                                long j10 = ljj0Var.b;
                                int iU = fbc.U(ljj0Var.f20155a);
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
                                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
                                float f2 = ljj0Var.c;
                                vjj0 vjj0Var = new vjj0(fIntBitsToFloat, fIntBitsToFloat2, f2 == 0.0f ? Float.MIN_VALUE : f2, iU);
                                i25 = 33;
                                spannable2.setSpan(vjj0Var, i24, i312, 33);
                            }
                            agc agcVar = smk0Var9.o;
                            if (agcVar != null) {
                                spannable2.setSpan(new ghl(agcVar), i24, i312, i25);
                            }
                            z5 = (eaq0.a(daq0.b(j8), 4294967296L) || eaq0.a(daq0.b(j8), 8589934592L)) ? true : z5;
                        }
                        z5 = z5;
                    } else {
                        i22 = size5;
                        i23 = i15;
                        z5 = z5;
                        spannable2 = spannableString;
                        w6kVar3 = w6kVar3;
                        z5 = z5;
                    }
                    i15 = i23 + 1;
                    size5 = i22;
                    spannableString = spannable2;
                    w6kVar3 = w6kVar3;
                    eo80Var = eo80Var;
                }
                spannable = spannableString;
                eo80 eo80Var4 = eo80Var;
                w6kVar2 = w6kVar3;
                if (z5) {
                    size7 = list3.size();
                    i18 = 0;
                    while (i18 < size7) {
                        i83Var2 = (i83) list3.get(i18);
                        f83Var = (f83) i83Var2.f14321a;
                        if (f83Var instanceof smk0) {
                            i21 = i83Var2.b;
                            int i313 = i83Var2.c;
                            if (i21 >= 0 || i21 >= spannable.length() || i313 <= i21 || i313 > spannable.length()) {
                                i19 = size7;
                                i20 = i18;
                            } else {
                                long j11 = ((smk0) f83Var).h;
                                long jB5 = daq0.b(j11);
                                i19 = size7;
                                i20 = i18;
                                Object ckzVar = eaq0.a(jB5, 4294967296L) ? new ckz(w6kVar2.X(j11)) : eaq0.a(jB5, 8589934592L) ? new bkz(daq0.c(j11)) : null;
                                if (ckzVar != null) {
                                    spannable.setSpan(ckzVar, i21, i313, 33);
                                }
                            }
                        } else {
                            i19 = size7;
                            i20 = i18;
                        }
                        i18 = i20 + 1;
                        size7 = i19;
                    }
                }
                g8q0Var2 = eo80Var4.d;
                if (g8q0Var2 != null) {
                    j = g8q0Var2.f10879a;
                    jB = daq0.b(j);
                    if (eaq0.a(jB, 4294967296L)) {
                        fC = w6kVar2.X(j);
                    } else if (eaq0.a(jB, 8589934592L)) {
                        fC = daq0.c(j) * textSize;
                    } else {
                        fC = 0.0f;
                    }
                    f = fC;
                } else {
                    f = 0.0f;
                }
                size6 = list3.size();
                while (i16 < size6) {
                    i83 i83Var10 = (i83) list3.get(i16);
                    obj2 = i83Var10.f14321a;
                    if (obj2 instanceof nd9) {
                        nd9Var = (nd9) obj2;
                    } else {
                        nd9Var = null;
                    }
                    if (nd9Var != null) {
                        fS = azw.S(nd9Var.f23328a, textSize, w6kVar2);
                        float fS4 = azw.S(nd9Var.b, textSize, w6kVar2);
                        float fS5 = azw.S(nd9Var.c, textSize, w6kVar2);
                        if (Float.isNaN(fS) && !Float.isNaN(fS4) && !Float.isNaN(fS5)) {
                            w6k w6kVar4 = w6kVar2;
                            w6kVar2 = w6kVar4;
                            spannable.setSpan(new bxf(fS, fS4, fS5, w6kVar4, f), i83Var10.b, i83Var10.c, 33);
                        }
                    }
                }
                if (list4.size() > 0) {
                    i83Var = (i83) list4.get(0);
                    if (i83Var.f14321a != null) {
                        hny.b();
                        throw null;
                    }
                    while (i17 < r1) {
                        spannable.removeSpan((v0t0) obj8);
                    }
                    throw null;
                }
                v03Var = this;
                charSequenceG = spannable;
            } else {
                float fT2 = azw.T(eo80Var.c, textSize, w6kVar3);
                if (!Float.isNaN(fT2)) {
                    spannableString.setSpan(new i600(fT2), 0, spannableString.length(), 33);
                }
            }
            i3 = 0;
            g8q0Var = eo80Var.d;
            if (g8q0Var != null) {
                j2 = g8q0Var.f10879a;
                j3 = g8q0Var.b;
                i26 = i3;
                if (daq0.a(j2, idm0.t(i26))) {
                    jB2 = daq0.b(j2);
                    if (eaq0.a(jB2, 4294967296L)) {
                        fC2 = w6kVar3.X(j2);
                    } else if (eaq0.a(jB2, 8589934592L)) {
                        fC2 = daq0.c(j2) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    jB3 = daq0.b(j3);
                    if (eaq0.a(jB3, 4294967296L)) {
                        fC3 = w6kVar3.X(j3);
                    } else if (eaq0.a(jB3, 8589934592L)) {
                        fC3 = daq0.c(j3) * textSize;
                    } else {
                        fC3 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC2), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                } else {
                    jB2 = daq0.b(j2);
                    if (eaq0.a(jB2, 4294967296L)) {
                        fC2 = w6kVar3.X(j2);
                    } else if (eaq0.a(jB2, 8589934592L)) {
                        fC2 = daq0.c(j2) * textSize;
                    } else {
                        fC2 = 0.0f;
                    }
                    jB3 = daq0.b(j3);
                    if (eaq0.a(jB3, 4294967296L)) {
                        fC3 = w6kVar3.X(j3);
                    } else if (eaq0.a(jB3, 8589934592L)) {
                        fC3 = daq0.c(j3) * textSize;
                    } else {
                        fC3 = 0.0f;
                    }
                    spannableString.setSpan(new LeadingMarginSpan.Standard((int) Math.ceil(fC2), (int) Math.ceil(fC3)), 0, spannableString.length(), 33);
                }
            }
            arrayList = new ArrayList(list3.size());
            size = list3.size();
            while (i4 < size) {
                i83Var4 = (i83) list3.get(i4);
                obj4 = i83Var4.f14321a;
                if (obj4 instanceof smk0) {
                    smk0Var3 = (smk0) obj4;
                    if (smk0Var3.f == null) {
                        arrayList.add(i83Var4);
                    } else {
                        arrayList.add(i83Var4);
                    }
                }
            }
            nrqVar = smk0Var.f;
            if (nrqVar != null) {
                smk0Var2 = new smk0(0L, 0L, smk0Var.c, smk0Var.d, smk0Var.e, nrqVar, null, 0L, null, null, null, 0L, null, null, null, 65475);
            } else {
                smk0Var2 = new smk0(0L, 0L, smk0Var.c, smk0Var.d, smk0Var.e, nrqVar, null, 0L, null, null, null, 0L, null, null, null, 65475);
            }
            in80Var = new in80(spannableString, awhVar, (byte) 29);
            if (arrayList.size() > 1) {
                size2 = arrayList.size();
                i5 = size2 * 2;
                iArr = new int[i5];
                size3 = arrayList.size();
                while (i6 < size3) {
                    i83 i83Var11 = (i83) arrayList.get(i6);
                    iArr[i6] = i83Var11.b;
                    iArr[i6 + size2] = i83Var11.c;
                }
                if (i5 > 1) {
                    Arrays.sort(iArr);
                }
                if (i5 == 0) {
                    v4i0.o("Array is empty.");
                    throw null;
                }
                i7 = iArr[0];
                i8 = 0;
                while (i8 < i5) {
                    i9 = iArr[i8];
                    if (i9 == i7) {
                        arrayList2 = arrayList;
                        i11 = i8;
                        i12 = i5;
                    } else {
                        size4 = arrayList.size();
                        i10 = 0;
                        while (i10 < size4) {
                            ArrayList arrayList7 = arrayList;
                            i83 i83Var12 = (i83) arrayList.get(i10);
                            int i314 = i8;
                            i13 = i83Var12.b;
                            int i315 = i5;
                            i14 = i83Var12.c;
                            if (i13 == i14) {
                            }
                            i10++;
                            arrayList = arrayList7;
                            i8 = i314;
                            i5 = i315;
                        }
                        arrayList2 = arrayList;
                        i11 = i8;
                        i12 = i5;
                        if (smk0Var2 != null) {
                            in80Var.F(smk0Var2, Integer.valueOf(i7), Integer.valueOf(i9));
                        }
                        i7 = i9;
                    }
                    i8 = i11 + 1;
                    smk0Var2 = smk0Var2;
                    arrayList = arrayList2;
                    i5 = i12;
                }
            } else if (!arrayList.isEmpty()) {
                smk0 smk0Var10 = (smk0) ((i83) arrayList.get(0)).f14321a;
                in80Var.F(smk0Var2 != null ? smk0Var2.d(smk0Var10) : smk0Var10, Integer.valueOf(((i83) arrayList.get(0)).b), Integer.valueOf(((i83) arrayList.get(0)).c));
            }
            size5 = list3.size();
            i15 = 0;
            z5 = false;
            while (i15 < size5) {
                i83Var3 = (i83) list3.get(i15);
                obj3 = i83Var3.f14321a;
                if (obj3 instanceof smk0) {
                    i24 = i83Var3.b;
                    int i316 = i83Var3.c;
                    if (i24 >= 0) {
                        i22 = size5;
                        i23 = i15;
                        z5 = z5;
                        spannable2 = spannableString;
                        w6kVar3 = w6kVar3;
                        z5 = z5;
                    } else {
                        i22 = size5;
                        i23 = i15;
                        z5 = z5;
                        spannable2 = spannableString;
                        w6kVar3 = w6kVar3;
                        z5 = z5;
                    }
                } else {
                    i22 = size5;
                    i23 = i15;
                    z5 = z5;
                    spannable2 = spannableString;
                    w6kVar3 = w6kVar3;
                    z5 = z5;
                }
                i15 = i23 + 1;
                size5 = i22;
                spannableString = spannable2;
                w6kVar3 = w6kVar3;
                eo80Var = eo80Var;
            }
            spannable = spannableString;
            eo80 eo80Var5 = eo80Var;
            w6kVar2 = w6kVar3;
            if (z5) {
                size7 = list3.size();
                i18 = 0;
                while (i18 < size7) {
                    i83Var2 = (i83) list3.get(i18);
                    f83Var = (f83) i83Var2.f14321a;
                    if (f83Var instanceof smk0) {
                        i21 = i83Var2.b;
                        int i317 = i83Var2.c;
                        if (i21 >= 0) {
                            i19 = size7;
                            i20 = i18;
                        } else {
                            i19 = size7;
                            i20 = i18;
                        }
                    } else {
                        i19 = size7;
                        i20 = i18;
                    }
                    i18 = i20 + 1;
                    size7 = i19;
                }
            }
            g8q0Var2 = eo80Var5.d;
            if (g8q0Var2 != null) {
                j = g8q0Var2.f10879a;
                jB = daq0.b(j);
                if (eaq0.a(jB, 4294967296L)) {
                    fC = w6kVar2.X(j);
                } else if (eaq0.a(jB, 8589934592L)) {
                    fC = daq0.c(j) * textSize;
                } else {
                    fC = 0.0f;
                }
                f = fC;
            } else {
                f = 0.0f;
            }
            size6 = list3.size();
            while (i16 < size6) {
                i83 i83Var13 = (i83) list3.get(i16);
                obj2 = i83Var13.f14321a;
                if (obj2 instanceof nd9) {
                    nd9Var = (nd9) obj2;
                } else {
                    nd9Var = null;
                }
                if (nd9Var != null) {
                    fS = azw.S(nd9Var.f23328a, textSize, w6kVar2);
                    float fS6 = azw.S(nd9Var.b, textSize, w6kVar2);
                    float fS7 = azw.S(nd9Var.c, textSize, w6kVar2);
                    if (Float.isNaN(fS)) {
                    }
                }
            }
            if (list4.size() > 0) {
                i83Var = (i83) list4.get(0);
                if (i83Var.f14321a != null) {
                    hny.b();
                    throw null;
                }
                while (i17 < r1) {
                    spannable.removeSpan((v0t0) obj8);
                }
                throw null;
            }
            v03Var = this;
            charSequenceG = spannable;
        }
        v03Var.h = charSequenceG;
        v03Var.i = new q6z(charSequenceG, v03Var.g, v03Var.l);
    }

    @Override // a.ao80
    public final boolean b() {
        y3v y3vVar = this.j;
        if (y3vVar != null ? y3vVar.r() : false) {
            return true;
        }
        if (!this.k && m8x.V(this.b)) {
            clc clcVar = usn.f36220a;
            clc clcVar2 = usn.f36220a;
            l7m0 l7m0VarE = (l7m0) clcVar2.b;
            if (l7m0VarE == null) {
                if (qsn.d()) {
                    l7m0VarE = clcVar2.e();
                    clcVar2.b = l7m0VarE;
                } else {
                    l7m0VarE = y0x0.i;
                }
            }
            if (((Boolean) l7m0VarE.getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // a.ao80
    public final float e() {
        return this.i.c();
    }

    @Override // a.ao80
    public final float f() {
        q6z q6zVar = this.i;
        float f = q6zVar.e;
        TextPaint textPaint = q6zVar.b;
        if (!Float.isNaN(f)) {
            return q6zVar.e;
        }
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        CharSequence charSequence = q6zVar.f28224a;
        lineInstance.setText(new gvb(charSequence.length(), charSequence));
        PriorityQueue priorityQueue = new PriorityQueue(10, cjx.q);
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new IntRange(i, next, 1));
            } else {
                IntRange intRange = (IntRange) priorityQueue.peek();
                if (intRange != null && intRange.b - intRange.f46068a < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new IntRange(i, next, 1));
                }
            }
            i = next;
        }
        float desiredWidth = 0.0f;
        if (!priorityQueue.isEmpty()) {
            Iterator it = priorityQueue.iterator();
            if (!it.hasNext()) {
                itt0.a();
                return 0.0f;
            }
            IntRange intRange2 = (IntRange) it.next();
            desiredWidth = Layout.getDesiredWidth(q6zVar.b(), intRange2.f46068a, intRange2.b, textPaint);
            while (it.hasNext()) {
                IntRange intRange3 = (IntRange) it.next();
                desiredWidth = Math.max(desiredWidth, Layout.getDesiredWidth(q6zVar.b(), intRange3.f46068a, intRange3.b, textPaint));
            }
        }
        q6zVar.e = desiredWidth;
        return desiredWidth;
    }
}
