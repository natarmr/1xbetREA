package a;

import android.gov.nist.core.Separators;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class gcw0 extends dwb {
    public static final Set f;
    public static final cmt0 g;
    public static final dcw0 h;
    public final String b;
    public final Level c;
    public final Set d;
    public final cmt0 e;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(xfx0.f40814a, nhx0.f23558a, phx0.f27020a)));
        f = setUnmodifiableSet;
        oif0 oif0VarP = y0x0.P(setUnmodifiableSet);
        cmt0 cmt0Var = new cmt0();
        HashMap map = new HashMap();
        cmt0Var.f4625a = map;
        HashMap map2 = new HashMap();
        cmt0Var.b = map2;
        map.putAll((HashMap) oif0VarP.b);
        map2.putAll((HashMap) oif0VarP.c);
        cmt0Var.c = (dix0) oif0VarP.d;
        g = cmt0Var;
        h = new dcw0(Level.ALL, setUnmodifiableSet, cmt0Var);
    }

    public /* synthetic */ gcw0(String str, Level level, Set set, cmt0 cmt0Var) {
        super(str);
        this.b = aem0.B(str);
        this.c = level;
        this.d = set;
        this.e = cmt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019a  */
    /* JADX WARN: Code duplicated, block: B:104:0x01af  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:137:0x0235  */
    /* JADX WARN: Code duplicated, block: B:140:0x0240  */
    /* JADX WARN: Code duplicated, block: B:145:0x025f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x026e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0278  */
    /* JADX WARN: Code duplicated, block: B:156:0x027b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0284  */
    /* JADX WARN: Code duplicated, block: B:167:0x028e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0292  */
    /* JADX WARN: Code duplicated, block: B:171:0x029a  */
    /* JADX WARN: Code duplicated, block: B:175:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:177:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:195:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:197:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:199:0x0306  */
    /* JADX WARN: Code duplicated, block: B:202:0x0313  */
    /* JADX WARN: Code duplicated, block: B:205:0x0332  */
    /* JADX WARN: Code duplicated, block: B:207:0x0336  */
    /* JADX WARN: Code duplicated, block: B:208:0x033a  */
    /* JADX WARN: Code duplicated, block: B:209:0x0340  */
    /* JADX WARN: Code duplicated, block: B:217:0x0369  */
    /* JADX WARN: Code duplicated, block: B:219:0x0374  */
    /* JADX WARN: Code duplicated, block: B:221:0x037c A[LOOP:4: B:138:0x0237->B:221:0x037c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:228:0x0392 A[LOOP:2: B:98:0x0194->B:228:0x0392, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:254:0x0415  */
    /* JADX WARN: Code duplicated, block: B:256:0x041b  */
    /* JADX WARN: Code duplicated, block: B:258:0x0421  */
    /* JADX WARN: Code duplicated, block: B:260:0x0429  */
    /* JADX WARN: Code duplicated, block: B:261:0x042c  */
    /* JADX WARN: Code duplicated, block: B:263:0x042f  */
    /* JADX WARN: Code duplicated, block: B:265:0x0433  */
    /* JADX WARN: Code duplicated, block: B:268:0x044f  */
    /* JADX WARN: Code duplicated, block: B:288:0x0492  */
    /* JADX WARN: Code duplicated, block: B:290:0x0496  */
    /* JADX WARN: Code duplicated, block: B:292:0x049a  */
    /* JADX WARN: Code duplicated, block: B:295:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x015f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:298:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x0186 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x017b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x039e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x038d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x0364 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x035d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:312:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:0x037f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:320:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x01ec A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0239 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x024a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:66:0x0111  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a A[LOOP:1: B:62:0x00f6->B:68:0x011a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x012f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0133  */
    /* JADX WARN: Code duplicated, block: B:77:0x0139  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141  */
    /* JADX WARN: Code duplicated, block: B:86:0x0166  */
    /* JADX WARN: Code duplicated, block: B:88:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x016d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0173  */
    /* JADX WARN: Code duplicated, block: B:96:0x018d  */
    public static void d(lfx0 lfx0Var, String str, Level level, Set set, cmt0 cmt0Var) {
        qbw0 mix0Var;
        StringBuilder sb;
        jgx0 jgx0Var;
        ubw0 ubw0Var;
        qbw0 qbw0Var;
        Level level2;
        boolean z;
        Object[] objArr;
        whx0 whx0Var;
        zdx0 zdx0Var;
        boolean z2;
        String str2;
        Object[] objArr2;
        String str3;
        StringBuilder sb2;
        String str4;
        int iB;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Level level3;
        char cCharAt;
        int i8;
        char c;
        String str5;
        int i9;
        int i10;
        char cCharAt2;
        int i11;
        boolean z3;
        int i12;
        qbw0 qbw0Var2;
        int i13;
        uhx0 uhx0Var;
        int i14;
        char cCharAt3;
        String str6;
        int i15;
        uhx0 uhx0Var2;
        int i16;
        char cCharAt4;
        char c2;
        int i17;
        rhx0 rhx0Var;
        int i18;
        int i19;
        scw0 scw0Var;
        oyc tcw0Var;
        oyc vcw0Var;
        int i20;
        Object[] objArr3;
        int i21;
        Object obj;
        int i22;
        int i23;
        boolean z4;
        int i24;
        int i25;
        String string;
        wgm0 wgm0VarC = lfx0Var.c();
        Level level4 = lfx0Var.f19980a;
        Boolean bool = (Boolean) wgm0VarC.C(phx0.f27020a);
        if (bool == null || !bool.booleanValue()) {
            ((wbw0) rbw0.f30210a).getClass();
            wgm0 wgm0VarC2 = ccw0.b.c();
            wgm0 wgm0VarC3 = lfx0Var.c();
            int iY = wgm0VarC3.y();
            if (iY == 0) {
                mix0Var = qbw0.f28459a;
            } else {
                mix0Var = iY <= 28 ? new mix0(wgm0VarC2, wgm0VarC3) : new nix0(wgm0VarC2, wgm0VarC3);
            }
            boolean z5 = level4.intValue() < level.intValue();
            if (z5) {
                sb = new StringBuilder();
                jgx0Var = lfx0Var.d;
                if (jgx0Var != null) {
                    jf4.n("cannot request log site information prior to postProcess()");
                    return;
                }
                if (ofm0.D(2, jgx0Var, sb)) {
                    sb.append(Separators.SP);
                }
                if (z5) {
                    ubw0Var = lfx0Var.f;
                    if (ubw0Var != null) {
                        if (ubw0Var != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        str2 = "cannot get arguments unless a template context exists";
                        if (!z2) {
                            jf4.n("cannot get arguments unless a template context exists");
                            return;
                        }
                        objArr2 = lfx0Var.g;
                        str3 = "cannot get arguments before calling log()";
                        if (objArr2 == null) {
                            jf4.n("cannot get arguments before calling log()");
                            return;
                        }
                        zdx0Var = new zdx0(ubw0Var, objArr2, sb);
                        sb2 = (StringBuilder) zdx0Var.g;
                        ubw0 ubw0Var2 = (ubw0) zdx0Var.e;
                        ubw0Var2.getClass();
                        wcw0 wcw0Var = wcw0.b;
                        str4 = ubw0Var2.f35403a;
                        iB = xcw0.b(0, str4);
                        i = -1;
                        i2 = 0;
                        while (iB >= 0) {
                            i4 = iB + 1;
                            i5 = i4;
                            i6 = 0;
                            while (true) {
                                if (i5 >= str4.length()) {
                                    throw new tiu0(tiu0.d(iB, "unterminated parameter", -1, str4), (byte) 3);
                                }
                                i7 = i5 + 1;
                                level3 = level4;
                                cCharAt = str4.charAt(i5);
                                i8 = i5;
                                c = (char) (cCharAt - '0');
                                str5 = str2;
                                if (c < '\n') {
                                    i25 = (i6 * 10) + c;
                                    if (i25 >= 1000000) {
                                        throw tiu0.a(iB, "index too large", i7, str4);
                                    }
                                    i6 = i25;
                                    i5 = i7;
                                    level4 = level3;
                                    str2 = str5;
                                }
                            }
                            if (cCharAt != '$') {
                                i9 = -1;
                                if (cCharAt != '<') {
                                    i = i2;
                                    i2++;
                                } else {
                                    if (i == -1) {
                                        throw tiu0.a(iB, "invalid relative parameter", i7, str4);
                                    }
                                    if (i7 == str4.length()) {
                                        throw new tiu0(tiu0.d(iB, "unterminated parameter", -1, str4), (byte) 3);
                                    }
                                    str4.charAt(i7);
                                    i4 = i7;
                                    i7 = i8 + 2;
                                }
                            } else {
                                if (i8 - i4 == 0) {
                                    throw tiu0.a(iB, "missing index", i7, str4);
                                }
                                if (str4.charAt(i4) == '0') {
                                    throw tiu0.a(iB, "index has leading zero", i7, str4);
                                }
                                i24 = i6 - 1;
                                if (i7 == str4.length()) {
                                    throw new tiu0(tiu0.d(iB, "unterminated parameter", -1, str4), (byte) 3);
                                }
                                str4.charAt(i7);
                                i4 = i7;
                                i = i24;
                                i7 = i8 + 2;
                                i9 = -1;
                            }
                            i10 = i7 + i9;
                            while (true) {
                                if (i10 >= str4.length()) {
                                    throw new tiu0(tiu0.d(iB, "unterminated parameter", -1, str4), (byte) 3);
                                }
                                if (((char) ((str4.charAt(i10) & (-33)) - 65)) < 26) {
                                    break;
                                }
                                i10++;
                                str3 = str3;
                            }
                            cCharAt2 = str4.charAt(i10);
                            i11 = cCharAt2 & ' ';
                            if (i11 == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            uhx0 uhx0Var3 = uhx0.e;
                            if (i4 == i10) {
                                if (true != z3) {
                                    i12 = 0;
                                } else {
                                    i12 = 128;
                                }
                                while (true) {
                                    if (i4 != i10) {
                                        qbw0Var2 = mix0Var;
                                        i13 = i11;
                                        uhx0Var = new uhx0(i12, -1, -1);
                                        str6 = str3;
                                    } else {
                                        i14 = i4 + 1;
                                        i13 = i11;
                                        cCharAt3 = str4.charAt(i4);
                                        str6 = str3;
                                        if (cCharAt3 >= ' ') {
                                        }
                                        qbw0Var2 = mix0Var;
                                        if (cCharAt3 > '9') {
                                            throw tiu0.b(i4, "invalid flag", str4);
                                        }
                                        i15 = cCharAt3 - '0';
                                        while (true) {
                                            if (i14 == i10) {
                                                uhx0Var2 = new uhx0(i12, i15, -1);
                                                uhx0Var = uhx0Var2;
                                                break;
                                            }
                                            i16 = i14 + 1;
                                            cCharAt4 = str4.charAt(i14);
                                            if (cCharAt4 == '.') {
                                                uhx0Var = new uhx0(i12, i15, uhx0.e(i16, i10, str4));
                                                break;
                                            }
                                            c2 = (char) (cCharAt4 - '0');
                                            if (c2 >= '\n') {
                                                throw tiu0.b(i14, "invalid width character", str4);
                                            }
                                            i15 = (i15 * 10) + c2;
                                            if (i15 > 999999) {
                                                throw tiu0.a(i4, "width too large", i10, str4);
                                            }
                                            i14 = i16;
                                        }
                                    }
                                    i12 |= i17;
                                    i4 = i14;
                                    mix0Var = qbw0Var2;
                                    i11 = i13;
                                    str3 = str6;
                                }
                            } else {
                                if (true != z3) {
                                    i12 = 0;
                                } else {
                                    i12 = 128;
                                }
                                while (true) {
                                    if (i4 != i10) {
                                        qbw0Var2 = mix0Var;
                                        i13 = i11;
                                        uhx0Var = new uhx0(i12, -1, -1);
                                        str6 = str3;
                                    } else {
                                        i14 = i4 + 1;
                                        i13 = i11;
                                        cCharAt3 = str4.charAt(i4);
                                        str6 = str3;
                                        if (cCharAt3 >= ' ') {
                                        }
                                        qbw0Var2 = mix0Var;
                                        if (cCharAt3 > '9') {
                                            throw tiu0.b(i4, "invalid flag", str4);
                                        }
                                        i15 = cCharAt3 - '0';
                                        while (true) {
                                            if (i14 == i10) {
                                                uhx0Var2 = new uhx0(i12, i15, -1);
                                                uhx0Var = uhx0Var2;
                                                break;
                                            }
                                            i16 = i14 + 1;
                                            cCharAt4 = str4.charAt(i14);
                                            if (cCharAt4 == '.') {
                                                uhx0Var = new uhx0(i12, i15, uhx0.e(i16, i10, str4));
                                                break;
                                            }
                                            c2 = (char) (cCharAt4 - '0');
                                            if (c2 >= '\n') {
                                                throw tiu0.b(i14, "invalid width character", str4);
                                            }
                                            i15 = (i15 * 10) + c2;
                                            if (i15 > 999999) {
                                                throw tiu0.a(i4, "width too large", i10, str4);
                                            }
                                            i14 = i16;
                                        }
                                    }
                                    i12 |= i17;
                                    i4 = i14;
                                    mix0Var = qbw0Var2;
                                    i11 = i13;
                                    str3 = str6;
                                }
                            }
                            rhx0Var = rhx0.f[(cCharAt2 | ' ') - 97];
                            if (i13 == 0) {
                                rhx0Var = null;
                            }
                            i18 = i10 + 1;
                            if (rhx0Var != null) {
                                uhx0Var.getClass();
                                i22 = rhx0Var.c;
                                i23 = rhx0Var.b;
                                if (i23 == 1) {
                                    z4 = true;
                                } else {
                                    if (i23 != 2) {
                                    }
                                    z4 = false;
                                }
                                if (uhx0Var.b(i22, z4)) {
                                    throw tiu0.a(iB, "invalid format specifier", i18, str4);
                                }
                                if (i < 10) {
                                    Map map = ucw0.d;
                                    if (uhx0Var.a()) {
                                        oyc[] oycVarArr = (ucw0[]) ucw0.d.get(rhx0Var);
                                        fem0.p(oycVarArr, "default parameter");
                                        tcw0Var = oycVarArr[i];
                                    }
                                }
                                vcw0Var = new ucw0(i, rhx0Var, uhx0Var);
                                tcw0Var = vcw0Var;
                            } else {
                                if (cCharAt2 != 't') {
                                }
                                if (uhx0Var.b(160, false)) {
                                    throw tiu0.a(iB, "invalid format specification", i18, str4);
                                }
                                i19 = i10 + 2;
                                if (i19 <= str4.length()) {
                                    throw tiu0.b(iB, "truncated format specifier", str4);
                                }
                                scw0Var = (scw0) scw0.b.get(Character.valueOf(str4.charAt(i18)));
                                if (scw0Var != null) {
                                    throw tiu0.b(i18, "illegal date/time conversion", str4);
                                }
                                tcw0Var = new tcw0(uhx0Var, i, scw0Var);
                                i18 = i19;
                            }
                            i20 = tcw0Var.f26055a;
                            if (i20 < 32) {
                                zdx0Var.b |= 1 << i20;
                            }
                            zdx0Var.c = Math.max(zdx0Var.c, i20);
                            xcw0.a(zdx0Var.d, iB, str4, sb2);
                            objArr3 = (Object[]) zdx0Var.f;
                            i21 = tcw0Var.f26055a;
                            if (i21 < objArr3.length) {
                                obj = objArr3[i21];
                                if (obj != null) {
                                    tcw0Var.H(zdx0Var, obj);
                                } else {
                                    sb2.append("null");
                                }
                            } else {
                                sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                            }
                            zdx0Var.d = i18;
                            iB = xcw0.b(i18, str4);
                            mix0Var = qbw0Var2;
                            level4 = level3;
                            str2 = str5;
                            str3 = str6;
                        }
                        qbw0Var = mix0Var;
                        level2 = level4;
                        String str7 = str2;
                        String str8 = str3;
                        i3 = zdx0Var.b;
                        if (((i3 + 1) & i3) == 0) {
                        }
                        throw new tiu0(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i3))), (byte) 3);
                    }
                    qbw0Var = mix0Var;
                    level2 = level4;
                    if (ubw0Var == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        jf4.n("cannot get literal argument if a template context exists");
                        return;
                    }
                    objArr = lfx0Var.g;
                    if (objArr == null) {
                        jf4.n("cannot get literal argument before calling log()");
                        return;
                    }
                    sb.append(yhx0.a(objArr[0]));
                    int i26 = tbw0.f33690a;
                    whx0Var = new whx0(sb);
                    qbw0Var.a(cmt0Var, whx0Var);
                    if (whx0Var.b) {
                        sb.append(" ]");
                    }
                } else {
                    ubw0Var = lfx0Var.f;
                    if (ubw0Var != null) {
                        if (ubw0Var != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        str2 = "cannot get arguments unless a template context exists";
                        if (!z2) {
                            jf4.n("cannot get arguments unless a template context exists");
                            return;
                        }
                        objArr2 = lfx0Var.g;
                        str3 = "cannot get arguments before calling log()";
                        if (objArr2 == null) {
                            jf4.n("cannot get arguments before calling log()");
                            return;
                        }
                        zdx0Var = new zdx0(ubw0Var, objArr2, sb);
                        sb2 = (StringBuilder) zdx0Var.g;
                        ubw0 ubw0Var3 = (ubw0) zdx0Var.e;
                        ubw0Var3.getClass();
                        wcw0 wcw0Var2 = wcw0.b;
                        str4 = ubw0Var3.f35403a;
                        iB = xcw0.b(0, str4);
                        i = -1;
                        i2 = 0;
                        while (iB >= 0) {
                            i4 = iB + 1;
                            i5 = i4;
                            i6 = 0;
                            while (true) {
                                if (i5 >= str4.length()) {
                                    throw new tiu0(tiu0.d(iB, "unterminated parameter", -1, str4), (byte) 3);
                                }
                                i7 = i5 + 1;
                                level3 = level4;
                                cCharAt = str4.charAt(i5);
                                i8 = i5;
                                c = (char) (cCharAt - '0');
                                str5 = str2;
                                if (c < '\n') {
                                    i25 = (i6 * 10) + c;
                                    if (i25 >= 1000000) {
                                        throw tiu0.a(iB, "index too large", i7, str4);
                                    }
                                    i6 = i25;
                                    i5 = i7;
                                    level4 = level3;
                                    str2 = str5;
                                }
                            }
                            if (cCharAt != '$') {
                                i9 = -1;
                                if (cCharAt != '<') {
                                    i = i2;
                                    i2++;
                                } else {
                                    if (i == -1) {
                                        throw tiu0.a(iB, "invalid relative parameter", i7, str4);
                                    }
                                    if (i7 == str4.length()) {
                                        throw new tiu0(tiu0.d(iB, "unterminated parameter", -1, str4), (byte) 3);
                                    }
                                    str4.charAt(i7);
                                    i4 = i7;
                                    i7 = i8 + 2;
                                }
                            } else {
                                if (i8 - i4 == 0) {
                                    throw tiu0.a(iB, "missing index", i7, str4);
                                }
                                if (str4.charAt(i4) == '0') {
                                    throw tiu0.a(iB, "index has leading zero", i7, str4);
                                }
                                i24 = i6 - 1;
                                if (i7 == str4.length()) {
                                    throw new tiu0(tiu0.d(iB, "unterminated parameter", -1, str4), (byte) 3);
                                }
                                str4.charAt(i7);
                                i4 = i7;
                                i = i24;
                                i7 = i8 + 2;
                                i9 = -1;
                            }
                            i10 = i7 + i9;
                            while (true) {
                                if (i10 >= str4.length()) {
                                    throw new tiu0(tiu0.d(iB, "unterminated parameter", -1, str4), (byte) 3);
                                }
                                if (((char) ((str4.charAt(i10) & (-33)) - 65)) < 26) {
                                    break;
                                }
                                i10++;
                                str3 = str3;
                            }
                            cCharAt2 = str4.charAt(i10);
                            i11 = cCharAt2 & ' ';
                            if (i11 == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            uhx0 uhx0Var4 = uhx0.e;
                            if (i4 == i10) {
                                if (true != z3) {
                                    i12 = 0;
                                } else {
                                    i12 = 128;
                                }
                                while (true) {
                                    if (i4 != i10) {
                                        qbw0Var2 = mix0Var;
                                        i13 = i11;
                                        uhx0Var = new uhx0(i12, -1, -1);
                                        str6 = str3;
                                    } else {
                                        i14 = i4 + 1;
                                        i13 = i11;
                                        cCharAt3 = str4.charAt(i4);
                                        str6 = str3;
                                        if (cCharAt3 >= ' ') {
                                        }
                                        qbw0Var2 = mix0Var;
                                        if (cCharAt3 > '9') {
                                            throw tiu0.b(i4, "invalid flag", str4);
                                        }
                                        i15 = cCharAt3 - '0';
                                        while (true) {
                                            if (i14 == i10) {
                                                uhx0Var2 = new uhx0(i12, i15, -1);
                                                uhx0Var = uhx0Var2;
                                                break;
                                            }
                                            i16 = i14 + 1;
                                            cCharAt4 = str4.charAt(i14);
                                            if (cCharAt4 == '.') {
                                                uhx0Var = new uhx0(i12, i15, uhx0.e(i16, i10, str4));
                                                break;
                                            }
                                            c2 = (char) (cCharAt4 - '0');
                                            if (c2 >= '\n') {
                                                throw tiu0.b(i14, "invalid width character", str4);
                                            }
                                            i15 = (i15 * 10) + c2;
                                            if (i15 > 999999) {
                                                throw tiu0.a(i4, "width too large", i10, str4);
                                            }
                                            i14 = i16;
                                        }
                                    }
                                    i12 |= i17;
                                    i4 = i14;
                                    mix0Var = qbw0Var2;
                                    i11 = i13;
                                    str3 = str6;
                                }
                            } else {
                                if (true != z3) {
                                    i12 = 0;
                                } else {
                                    i12 = 128;
                                }
                                while (true) {
                                    if (i4 != i10) {
                                        qbw0Var2 = mix0Var;
                                        i13 = i11;
                                        uhx0Var = new uhx0(i12, -1, -1);
                                        str6 = str3;
                                    } else {
                                        i14 = i4 + 1;
                                        i13 = i11;
                                        cCharAt3 = str4.charAt(i4);
                                        str6 = str3;
                                        if (cCharAt3 >= ' ') {
                                        }
                                        qbw0Var2 = mix0Var;
                                        if (cCharAt3 > '9') {
                                            throw tiu0.b(i4, "invalid flag", str4);
                                        }
                                        i15 = cCharAt3 - '0';
                                        while (true) {
                                            if (i14 == i10) {
                                                uhx0Var2 = new uhx0(i12, i15, -1);
                                                uhx0Var = uhx0Var2;
                                                break;
                                            }
                                            i16 = i14 + 1;
                                            cCharAt4 = str4.charAt(i14);
                                            if (cCharAt4 == '.') {
                                                uhx0Var = new uhx0(i12, i15, uhx0.e(i16, i10, str4));
                                                break;
                                            }
                                            c2 = (char) (cCharAt4 - '0');
                                            if (c2 >= '\n') {
                                                throw tiu0.b(i14, "invalid width character", str4);
                                            }
                                            i15 = (i15 * 10) + c2;
                                            if (i15 > 999999) {
                                                throw tiu0.a(i4, "width too large", i10, str4);
                                            }
                                            i14 = i16;
                                        }
                                    }
                                    i12 |= i17;
                                    i4 = i14;
                                    mix0Var = qbw0Var2;
                                    i11 = i13;
                                    str3 = str6;
                                }
                            }
                            rhx0Var = rhx0.f[(cCharAt2 | ' ') - 97];
                            if (i13 == 0) {
                                rhx0Var = null;
                            }
                            i18 = i10 + 1;
                            if (rhx0Var != null) {
                                uhx0Var.getClass();
                                i22 = rhx0Var.c;
                                i23 = rhx0Var.b;
                                if (i23 == 1) {
                                    z4 = true;
                                } else {
                                    if (i23 != 2) {
                                    }
                                    z4 = false;
                                }
                                if (uhx0Var.b(i22, z4)) {
                                    throw tiu0.a(iB, "invalid format specifier", i18, str4);
                                }
                                if (i < 10) {
                                    Map map2 = ucw0.d;
                                    if (uhx0Var.a()) {
                                        oyc[] oycVarArr2 = (ucw0[]) ucw0.d.get(rhx0Var);
                                        fem0.p(oycVarArr2, "default parameter");
                                        tcw0Var = oycVarArr2[i];
                                    }
                                }
                                vcw0Var = new ucw0(i, rhx0Var, uhx0Var);
                                tcw0Var = vcw0Var;
                            } else {
                                if (cCharAt2 != 't') {
                                }
                                if (uhx0Var.b(160, false)) {
                                    throw tiu0.a(iB, "invalid format specification", i18, str4);
                                }
                                i19 = i10 + 2;
                                if (i19 <= str4.length()) {
                                    throw tiu0.b(iB, "truncated format specifier", str4);
                                }
                                scw0Var = (scw0) scw0.b.get(Character.valueOf(str4.charAt(i18)));
                                if (scw0Var != null) {
                                    throw tiu0.b(i18, "illegal date/time conversion", str4);
                                }
                                tcw0Var = new tcw0(uhx0Var, i, scw0Var);
                                i18 = i19;
                            }
                            i20 = tcw0Var.f26055a;
                            if (i20 < 32) {
                                zdx0Var.b |= 1 << i20;
                            }
                            zdx0Var.c = Math.max(zdx0Var.c, i20);
                            xcw0.a(zdx0Var.d, iB, str4, sb2);
                            objArr3 = (Object[]) zdx0Var.f;
                            i21 = tcw0Var.f26055a;
                            if (i21 < objArr3.length) {
                                obj = objArr3[i21];
                                if (obj != null) {
                                    tcw0Var.H(zdx0Var, obj);
                                } else {
                                    sb2.append("null");
                                }
                            } else {
                                sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                            }
                            zdx0Var.d = i18;
                            iB = xcw0.b(i18, str4);
                            mix0Var = qbw0Var2;
                            level4 = level3;
                            str2 = str5;
                            str3 = str6;
                        }
                        qbw0Var = mix0Var;
                        level2 = level4;
                        String str9 = str2;
                        String str10 = str3;
                        i3 = zdx0Var.b;
                        if (((i3 + 1) & i3) == 0) {
                        }
                        throw new tiu0(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i3))), (byte) 3);
                    }
                    qbw0Var = mix0Var;
                    level2 = level4;
                    if (ubw0Var == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        jf4.n("cannot get literal argument if a template context exists");
                        return;
                    }
                    objArr = lfx0Var.g;
                    if (objArr == null) {
                        jf4.n("cannot get literal argument before calling log()");
                        return;
                    }
                    sb.append(yhx0.a(objArr[0]));
                    int i27 = tbw0.f33690a;
                    whx0Var = new whx0(sb);
                    qbw0Var.a(cmt0Var, whx0Var);
                    if (whx0Var.b) {
                        sb.append(" ]");
                    }
                }
                string = sb.toString();
            } else {
                int i28 = tbw0.f33690a;
                if (lfx0Var.f == null && mix0Var.b() <= set.size() && set.containsAll(mix0Var.c())) {
                    if (!(lfx0Var.f == null)) {
                        jf4.n("cannot get literal argument if a template context exists");
                        return;
                    }
                    Object[] objArr4 = lfx0Var.g;
                    if (objArr4 == null) {
                        jf4.n("cannot get literal argument before calling log()");
                        return;
                    } else {
                        string = yhx0.a(objArr4[0]);
                        level2 = level4;
                    }
                } else {
                    sb = new StringBuilder();
                    jgx0Var = lfx0Var.d;
                    if (jgx0Var != null) {
                        jf4.n("cannot request log site information prior to postProcess()");
                        return;
                    }
                    if (ofm0.D(2, jgx0Var, sb)) {
                        sb.append(Separators.SP);
                    }
                    if (z5 || lfx0Var.f == null) {
                        ubw0Var = lfx0Var.f;
                        if (ubw0Var != null) {
                            if (ubw0Var != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            str2 = "cannot get arguments unless a template context exists";
                            if (!z2) {
                                jf4.n("cannot get arguments unless a template context exists");
                                return;
                            }
                            objArr2 = lfx0Var.g;
                            str3 = "cannot get arguments before calling log()";
                            if (objArr2 == null) {
                                jf4.n("cannot get arguments before calling log()");
                                return;
                            }
                            zdx0Var = new zdx0(ubw0Var, objArr2, sb);
                            sb2 = (StringBuilder) zdx0Var.g;
                            ubw0 ubw0Var4 = (ubw0) zdx0Var.e;
                            ubw0Var4.getClass();
                            wcw0 wcw0Var3 = wcw0.b;
                            str4 = ubw0Var4.f35403a;
                            iB = xcw0.b(0, str4);
                            i = -1;
                            i2 = 0;
                            while (iB >= 0) {
                                i4 = iB + 1;
                                i5 = i4;
                                i6 = 0;
                                while (true) {
                                    if (i5 >= str4.length()) {
                                        throw new tiu0(tiu0.d(iB, "unterminated parameter", -1, str4), (byte) 3);
                                    }
                                    i7 = i5 + 1;
                                    level3 = level4;
                                    cCharAt = str4.charAt(i5);
                                    i8 = i5;
                                    c = (char) (cCharAt - '0');
                                    str5 = str2;
                                    if (c < '\n') {
                                        i25 = (i6 * 10) + c;
                                        if (i25 >= 1000000) {
                                            throw tiu0.a(iB, "index too large", i7, str4);
                                        }
                                        i6 = i25;
                                        i5 = i7;
                                        level4 = level3;
                                        str2 = str5;
                                    }
                                }
                                if (cCharAt != '$') {
                                    i9 = -1;
                                    if (cCharAt != '<') {
                                        i = i2;
                                        i2++;
                                    } else {
                                        if (i == -1) {
                                            throw tiu0.a(iB, "invalid relative parameter", i7, str4);
                                        }
                                        if (i7 == str4.length()) {
                                            throw new tiu0(tiu0.d(iB, "unterminated parameter", -1, str4), (byte) 3);
                                        }
                                        str4.charAt(i7);
                                        i4 = i7;
                                        i7 = i8 + 2;
                                    }
                                } else {
                                    if (i8 - i4 == 0) {
                                        throw tiu0.a(iB, "missing index", i7, str4);
                                    }
                                    if (str4.charAt(i4) == '0') {
                                        throw tiu0.a(iB, "index has leading zero", i7, str4);
                                    }
                                    i24 = i6 - 1;
                                    if (i7 == str4.length()) {
                                        throw new tiu0(tiu0.d(iB, "unterminated parameter", -1, str4), (byte) 3);
                                    }
                                    str4.charAt(i7);
                                    i4 = i7;
                                    i = i24;
                                    i7 = i8 + 2;
                                    i9 = -1;
                                }
                                i10 = i7 + i9;
                                while (true) {
                                    if (i10 >= str4.length()) {
                                        throw new tiu0(tiu0.d(iB, "unterminated parameter", -1, str4), (byte) 3);
                                    }
                                    if (((char) ((str4.charAt(i10) & (-33)) - 65)) < 26) {
                                        break;
                                    }
                                    i10++;
                                    str3 = str3;
                                }
                                cCharAt2 = str4.charAt(i10);
                                i11 = cCharAt2 & ' ';
                                if (i11 == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                uhx0 uhx0Var5 = uhx0.e;
                                if (i4 == i10 || z3) {
                                    if (true != z3) {
                                        i12 = 0;
                                    } else {
                                        i12 = 128;
                                    }
                                    while (true) {
                                        if (i4 != i10) {
                                            i14 = i4 + 1;
                                            i13 = i11;
                                            cCharAt3 = str4.charAt(i4);
                                            str6 = str3;
                                            if (cCharAt3 >= ' ' || cCharAt3 > '0') {
                                                qbw0Var2 = mix0Var;
                                                if (cCharAt3 > '9') {
                                                    throw tiu0.b(i4, "invalid flag", str4);
                                                }
                                                i15 = cCharAt3 - '0';
                                                while (true) {
                                                    if (i14 == i10) {
                                                        uhx0Var2 = new uhx0(i12, i15, -1);
                                                    } else {
                                                        i16 = i14 + 1;
                                                        cCharAt4 = str4.charAt(i14);
                                                        if (cCharAt4 == '.') {
                                                            uhx0Var = new uhx0(i12, i15, uhx0.e(i16, i10, str4));
                                                            break;
                                                        }
                                                        c2 = (char) (cCharAt4 - '0');
                                                        if (c2 >= '\n') {
                                                            throw tiu0.b(i14, "invalid width character", str4);
                                                        }
                                                        i15 = (i15 * 10) + c2;
                                                        if (i15 > 999999) {
                                                            throw tiu0.a(i4, "width too large", i10, str4);
                                                        }
                                                        i14 = i16;
                                                    }
                                                }
                                            } else {
                                                qbw0Var2 = mix0Var;
                                                int i29 = ((int) ((uhx0.d >>> ((cCharAt3 - ' ') * 3)) & 7)) - 1;
                                                if (i29 >= 0) {
                                                    i17 = 1 << i29;
                                                    if ((i12 & i17) != 0) {
                                                        throw tiu0.b(i4, "repeated flag", str4);
                                                    }
                                                    i12 |= i17;
                                                    i4 = i14;
                                                    mix0Var = qbw0Var2;
                                                    i11 = i13;
                                                    str3 = str6;
                                                } else {
                                                    if (cCharAt3 != '.') {
                                                        throw tiu0.b(i4, "invalid flag", str4);
                                                    }
                                                    uhx0Var2 = new uhx0(i12, -1, uhx0.e(i14, i10, str4));
                                                }
                                            }
                                            uhx0Var = uhx0Var2;
                                            break;
                                        } else {
                                            qbw0Var2 = mix0Var;
                                            i13 = i11;
                                            uhx0Var = new uhx0(i12, -1, -1);
                                        }
                                        rhx0Var = rhx0.f[(cCharAt2 | ' ') - 97];
                                        if (i13 == 0 && (rhx0Var == null || (rhx0Var.c & 128) == 0)) {
                                            rhx0Var = null;
                                        }
                                        i18 = i10 + 1;
                                        if (rhx0Var != null) {
                                            uhx0Var.getClass();
                                            i22 = rhx0Var.c;
                                            i23 = rhx0Var.b;
                                            if (i23 == 1) {
                                                z4 = true;
                                            } else if (i23 != 2 || i23 == 3 || i23 == 4) {
                                                z4 = false;
                                            } else {
                                                if (i23 != 5) {
                                                    throw null;
                                                }
                                                z4 = true;
                                            }
                                            if (uhx0Var.b(i22, z4)) {
                                                throw tiu0.a(iB, "invalid format specifier", i18, str4);
                                            }
                                            if (i < 10) {
                                                Map map3 = ucw0.d;
                                                if (uhx0Var.a()) {
                                                    oyc[] oycVarArr3 = (ucw0[]) ucw0.d.get(rhx0Var);
                                                    fem0.p(oycVarArr3, "default parameter");
                                                    tcw0Var = oycVarArr3[i];
                                                }
                                            }
                                            vcw0Var = new ucw0(i, rhx0Var, uhx0Var);
                                            tcw0Var = vcw0Var;
                                        } else if (cCharAt2 != 't' || cCharAt2 == 'T') {
                                            if (uhx0Var.b(160, false)) {
                                                throw tiu0.a(iB, "invalid format specification", i18, str4);
                                            }
                                            i19 = i10 + 2;
                                            if (i19 <= str4.length()) {
                                                throw tiu0.b(iB, "truncated format specifier", str4);
                                            }
                                            scw0Var = (scw0) scw0.b.get(Character.valueOf(str4.charAt(i18)));
                                            if (scw0Var != null) {
                                                throw tiu0.b(i18, "illegal date/time conversion", str4);
                                            }
                                            tcw0Var = new tcw0(uhx0Var, i, scw0Var);
                                            i18 = i19;
                                        } else {
                                            if (cCharAt2 != 'h' && cCharAt2 != 'H') {
                                                throw tiu0.a(iB, "invalid format specification", i18, str4);
                                            }
                                            if (!uhx0Var.b(160, false)) {
                                                throw tiu0.a(iB, "invalid format specification", i18, str4);
                                            }
                                            vcw0Var = new vcw0(uhx0Var, i);
                                            tcw0Var = vcw0Var;
                                        }
                                        i20 = tcw0Var.f26055a;
                                        if (i20 < 32) {
                                            zdx0Var.b |= 1 << i20;
                                        }
                                        zdx0Var.c = Math.max(zdx0Var.c, i20);
                                        xcw0.a(zdx0Var.d, iB, str4, sb2);
                                        objArr3 = (Object[]) zdx0Var.f;
                                        i21 = tcw0Var.f26055a;
                                        if (i21 < objArr3.length) {
                                            obj = objArr3[i21];
                                            if (obj != null) {
                                                tcw0Var.H(zdx0Var, obj);
                                            } else {
                                                sb2.append("null");
                                            }
                                        } else {
                                            sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                                        }
                                        zdx0Var.d = i18;
                                        iB = xcw0.b(i18, str4);
                                        mix0Var = qbw0Var2;
                                        level4 = level3;
                                        str2 = str5;
                                        str3 = str6;
                                    }
                                } else {
                                    uhx0Var = uhx0.e;
                                    qbw0Var2 = mix0Var;
                                    i13 = i11;
                                }
                                str6 = str3;
                                rhx0Var = rhx0.f[(cCharAt2 | ' ') - 97];
                                if (i13 == 0) {
                                    rhx0Var = null;
                                }
                                i18 = i10 + 1;
                                if (rhx0Var != null) {
                                    uhx0Var.getClass();
                                    i22 = rhx0Var.c;
                                    i23 = rhx0Var.b;
                                    if (i23 == 1) {
                                        z4 = true;
                                    } else {
                                        if (i23 != 2) {
                                        }
                                        z4 = false;
                                    }
                                    if (uhx0Var.b(i22, z4)) {
                                        throw tiu0.a(iB, "invalid format specifier", i18, str4);
                                    }
                                    if (i < 10) {
                                        Map map4 = ucw0.d;
                                        if (uhx0Var.a()) {
                                            oyc[] oycVarArr4 = (ucw0[]) ucw0.d.get(rhx0Var);
                                            fem0.p(oycVarArr4, "default parameter");
                                            tcw0Var = oycVarArr4[i];
                                        }
                                    }
                                    vcw0Var = new ucw0(i, rhx0Var, uhx0Var);
                                    tcw0Var = vcw0Var;
                                } else {
                                    if (cCharAt2 != 't') {
                                    }
                                    if (uhx0Var.b(160, false)) {
                                        throw tiu0.a(iB, "invalid format specification", i18, str4);
                                    }
                                    i19 = i10 + 2;
                                    if (i19 <= str4.length()) {
                                        throw tiu0.b(iB, "truncated format specifier", str4);
                                    }
                                    scw0Var = (scw0) scw0.b.get(Character.valueOf(str4.charAt(i18)));
                                    if (scw0Var != null) {
                                        throw tiu0.b(i18, "illegal date/time conversion", str4);
                                    }
                                    tcw0Var = new tcw0(uhx0Var, i, scw0Var);
                                    i18 = i19;
                                }
                                i20 = tcw0Var.f26055a;
                                if (i20 < 32) {
                                    zdx0Var.b |= 1 << i20;
                                }
                                zdx0Var.c = Math.max(zdx0Var.c, i20);
                                xcw0.a(zdx0Var.d, iB, str4, sb2);
                                objArr3 = (Object[]) zdx0Var.f;
                                i21 = tcw0Var.f26055a;
                                if (i21 < objArr3.length) {
                                    obj = objArr3[i21];
                                    if (obj != null) {
                                        tcw0Var.H(zdx0Var, obj);
                                    } else {
                                        sb2.append("null");
                                    }
                                } else {
                                    sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                                }
                                zdx0Var.d = i18;
                                iB = xcw0.b(i18, str4);
                                mix0Var = qbw0Var2;
                                level4 = level3;
                                str2 = str5;
                                str3 = str6;
                            }
                            qbw0Var = mix0Var;
                            level2 = level4;
                            String str11 = str2;
                            String str12 = str3;
                            i3 = zdx0Var.b;
                            if (((i3 + 1) & i3) == 0 || (zdx0Var.c > 31 && i3 != -1)) {
                                throw new tiu0(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i3))), (byte) 3);
                            }
                            xcw0.a(zdx0Var.d, str4.length(), str4, sb2);
                            if (!(lfx0Var.f != null)) {
                                jf4.n(str11);
                                return;
                            }
                            Object[] objArr5 = lfx0Var.g;
                            if (objArr5 == null) {
                                jf4.n(str12);
                                return;
                            } else if (objArr5.length > zdx0Var.c + 1) {
                                sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                            }
                        } else {
                            qbw0Var = mix0Var;
                            level2 = level4;
                            if (ubw0Var == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                jf4.n("cannot get literal argument if a template context exists");
                                return;
                            }
                            objArr = lfx0Var.g;
                            if (objArr == null) {
                                jf4.n("cannot get literal argument before calling log()");
                                return;
                            }
                            sb.append(yhx0.a(objArr[0]));
                        }
                        int i210 = tbw0.f33690a;
                        whx0Var = new whx0(sb);
                        qbw0Var.a(cmt0Var, whx0Var);
                        if (whx0Var.b) {
                            sb.append(" ]");
                        }
                    } else {
                        sb.append("(REDACTED) ");
                        sb.append(lfx0Var.f.f35403a);
                        level2 = level4;
                    }
                    string = sb.toString();
                }
            }
            Throwable th = (Throwable) lfx0Var.c().C(xfx0.f40814a);
            int iD = aem0.D(level2);
            if (iD == 2) {
                Log.v(str, string, th);
                return;
            }
            if (iD == 3) {
                Log.d(str, string, th);
                return;
            }
            if (iD == 4) {
                Log.i(str, string, th);
            } else if (iD != 5) {
                Log.e(str, string, th);
            } else {
                Log.w(str, string, th);
            }
        }
    }

    @Override // a.dwb
    public final boolean a(Level level) {
        int iD = aem0.D(level);
        return Log.isLoggable(this.b, iD) || Log.isLoggable("all", iD);
    }

    @Override // a.dwb
    public final void b(lfx0 lfx0Var) {
        d(lfx0Var, this.b, this.c, this.d, this.e);
    }
}
