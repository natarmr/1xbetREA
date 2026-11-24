package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class kdx {
    public static final Pattern i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern m = Pattern.compile("`+");
    public static final Pattern n = Pattern.compile("^`+");
    public static final Pattern o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern q = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern s = Pattern.compile("\\s+");
    public static final Pattern t = Pattern.compile(" *$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitSet f18127a;
    public final BitSet b;
    public final HashMap c;
    public final lbu d;
    public String e;
    public int f;
    public o6k g;
    public mr8 h;

    public kdx(lbu lbuVar) {
        List list = (List) lbuVar.b;
        HashMap map = new HashMap();
        b(Arrays.asList(new vy3('*'), new vy3('_')), map);
        b(list, map);
        this.c = map;
        Set setKeySet = map.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.b = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.f18127a = bitSet2;
        this.d = lbuVar;
    }

    public static void a(char c, q6k q6kVar, HashMap map) {
        if (((q6k) map.put(Character.valueOf(c), q6kVar)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + Separators.QUOTE);
    }

    public static void b(Iterable iterable, HashMap map) {
        x3m0 x3m0Var;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            q6k q6kVar = (q6k) it.next();
            char cE = q6kVar.e();
            char cA = q6kVar.a();
            if (cE == cA) {
                q6k q6kVar2 = (q6k) map.get(Character.valueOf(cE));
                if (q6kVar2 == null || q6kVar2.e() != q6kVar2.a()) {
                    a(cE, q6kVar, map);
                } else {
                    if (q6kVar2 instanceof x3m0) {
                        x3m0Var = (x3m0) q6kVar2;
                    } else {
                        x3m0 x3m0Var2 = new x3m0(cE);
                        x3m0Var2.f(q6kVar2);
                        x3m0Var = x3m0Var2;
                    }
                    x3m0Var.f(q6kVar);
                    map.put(Character.valueOf(cE), x3m0Var);
                }
            } else {
                a(cE, q6kVar, map);
                a(cA, q6kVar, map);
            }
        }
    }

    public static void d(e2q0 e2q0Var, e2q0 e2q0Var2, int i2) {
        if (e2q0Var == null || e2q0Var2 == null || e2q0Var == e2q0Var2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i2);
        sb.append(e2q0Var.g);
        b4e b4eVar = (b4e) e2q0Var.f;
        b4e b4eVar2 = (b4e) e2q0Var2.f;
        while (b4eVar != b4eVar2) {
            sb.append(((e2q0) b4eVar).g);
            b4e b4eVar3 = (b4e) b4eVar.f;
            b4eVar.j();
            b4eVar = b4eVar3;
        }
        e2q0Var.g = sb.toString();
    }

    public static void e(b4e b4eVar, b4e b4eVar2) {
        e2q0 e2q0Var = null;
        e2q0 e2q0Var2 = null;
        int length = 0;
        while (b4eVar != null) {
            if (b4eVar instanceof e2q0) {
                e2q0Var2 = (e2q0) b4eVar;
                if (e2q0Var == null) {
                    e2q0Var = e2q0Var2;
                }
                length = e2q0Var2.g.length() + length;
            } else {
                d(e2q0Var, e2q0Var2, length);
                e2q0Var = null;
                e2q0Var2 = null;
                length = 0;
            }
            if (b4eVar == b4eVar2) {
                break;
            } else {
                b4eVar = (b4e) b4eVar.f;
            }
        }
        d(e2q0Var, e2q0Var2, length);
    }

    public final String c(Pattern pattern) {
        if (this.f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f = matcher.end();
        return matcher.group();
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ec A[PHI: r6
  0x01ec: PHI (r6v28 char) = (r6v27 char), (r6v29 char), (r6v30 char) binds: [B:113:0x01e1, B:115:0x01e5, B:118:0x01ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:122:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:141:0x023f  */
    /* JADX WARN: Code duplicated, block: B:143:0x0249  */
    /* JADX WARN: Code duplicated, block: B:148:0x0265  */
    /* JADX WARN: Code duplicated, block: B:159:0x0287  */
    /* JADX WARN: Code duplicated, block: B:160:0x028f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0293  */
    /* JADX WARN: Code duplicated, block: B:163:0x029c  */
    /* JADX WARN: Code duplicated, block: B:165:0x029f  */
    /* JADX WARN: Code duplicated, block: B:167:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:169:0x02d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:171:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:174:0x02ed A[LOOP:3: B:173:0x02eb->B:174:0x02ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:178:0x0306  */
    /* JADX WARN: Code duplicated, block: B:181:0x0314 A[ADDED_TO_REGION, LOOP:4: B:181:0x0314->B:185:0x031d, LOOP_START, PHI: r2
  0x0314: PHI (r2v74 a.mr8) = (r2v73 a.mr8), (r2v75 a.mr8) binds: [B:180:0x0312, B:185:0x031d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x0316  */
    /* JADX WARN: Code duplicated, block: B:184:0x031a  */
    /* JADX WARN: Code duplicated, block: B:186:0x0320  */
    /* JADX WARN: Code duplicated, block: B:204:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:231:0x0466  */
    /* JADX WARN: Code duplicated, block: B:233:0x046e  */
    /* JADX WARN: Code duplicated, block: B:260:0x0511  */
    /* JADX WARN: Code duplicated, block: B:265:0x0531 A[LOOP:0: B:3:0x0013->B:265:0x0531, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:268:0x0546 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:269:0x0547  */
    /* JADX WARN: Code duplicated, block: B:271:0x0538 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x031d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r27v0, types: [a.b4e] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v17, types: [a.b4e, a.vxc] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v27, types: [a.b4e] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v44, types: [a.e2q0] */
    /* JADX WARN: Type inference failed for: r4v45, types: [a.e2q0] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v60, types: [a.b4e] */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r9v41, types: [a.jdx] */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    public final void f(String str, b4e b4eVar) {
        int i2;
        Object okk0Var;
        ?? r10;
        ?? r4;
        Object e2q0Var;
        ?? r11;
        e2q0 e2q0Var2;
        hb00 hb00Var;
        ?? vxcVar;
        int i3;
        String strA;
        String strA2;
        boolean z;
        b4e b4eVar2;
        b4e b4eVar3;
        b4e b4eVar4;
        mr8 mr8Var;
        int i4;
        int i5;
        String strSubstring;
        rb00 rb00Var;
        int iH;
        int I;
        int i6;
        int i7;
        e2q0 e2q0Var3;
        ?? r5;
        ?? r8;
        ?? jdxVar;
        b4e b4eVar5;
        b4e b4eVar6;
        this.e = str.trim();
        int i8 = 0;
        this.f = 0;
        e2q0 e2q0Var4 = null;
        this.g = null;
        this.h = null;
        ?? r6 = 0;
        while (true) {
            char cG = g();
            if (cG == 0) {
                i2 = i8;
            } else {
                if (cG == '\n') {
                    this.f++;
                    if (r6 instanceof e2q0) {
                        e2q0 e2q0Var5 = (e2q0) r6;
                        if (e2q0Var5.g.endsWith(Separators.SP)) {
                            String str2 = e2q0Var5.g;
                            Matcher matcher = t.matcher(str2);
                            int iEnd = matcher.find() ? matcher.end() - matcher.start() : 0;
                            i2 = 0;
                            if (iEnd > 0) {
                                e2q0Var5.g = vqd.k(iEnd, 0, str2);
                            }
                            okk0Var = iEnd >= 2 ? new qmv() : new okk0();
                        } else {
                            i2 = 0;
                            okk0Var = new okk0();
                        }
                    } else {
                        i2 = 0;
                        okk0Var = new okk0();
                    }
                    r10 = okk0Var;
                } else if (cG == '!') {
                    int i9 = this.f + 1;
                    this.f = i9;
                    if (g() == '[') {
                        this.f++;
                        e2q0 e2q0Var6 = new e2q0("![");
                        mr8 mr8Var2 = this.h;
                        mr8 mr8Var3 = new mr8(e2q0Var6, i9, mr8Var2, this.g, true);
                        if (mr8Var2 != null) {
                            mr8Var2.g = true;
                        }
                        this.h = mr8Var3;
                        r11 = e2q0Var6;
                    } else {
                        e2q0Var = new e2q0("!");
                        r11 = e2q0Var;
                    }
                    i2 = 0;
                    r10 = r11;
                } else if (cG == '&') {
                    String strC = c(l);
                    if (strC != null) {
                        e2q0Var2 = new e2q0(ctw.a(strC));
                        r11 = e2q0Var2;
                    } else {
                        r11 = 0;
                    }
                    i2 = 0;
                    r10 = r11;
                } else if (cG != '<') {
                    if (cG != '`') {
                        switch (cG) {
                            case '[':
                                int i10 = this.f;
                                this.f = i10 + 1;
                                e2q0 e2q0Var7 = new e2q0("[");
                                mr8 mr8Var4 = this.h;
                                mr8 mr8Var5 = new mr8(e2q0Var7, i10, mr8Var4, this.g, false);
                                if (mr8Var4 != null) {
                                    mr8Var4.g = true;
                                }
                                this.h = mr8Var5;
                                r11 = e2q0Var7;
                                i2 = 0;
                                r10 = r11;
                                break;
                            case '\\':
                                this.f++;
                                if (g() == '\n') {
                                    e2q0Var = new qmv();
                                    this.f++;
                                } else {
                                    if (this.f < this.e.length()) {
                                        String str3 = this.e;
                                        int i11 = this.f;
                                        if (k.matcher(str3.substring(i11, i11 + 1)).matches()) {
                                            String str4 = this.e;
                                            int i12 = this.f;
                                            e2q0 e2q0Var8 = new e2q0(str4.substring(i12, i12 + 1));
                                            this.f++;
                                            r11 = e2q0Var8;
                                        }
                                        i2 = 0;
                                        r10 = r11;
                                    }
                                    e2q0Var = new e2q0("\\");
                                }
                                r11 = e2q0Var;
                                i2 = 0;
                                r10 = r11;
                                break;
                            case ']':
                                int i13 = this.f + 1;
                                this.f = i13;
                                mr8 mr8Var6 = this.h;
                                if (mr8Var6 != null) {
                                    e2q0 e2q0Var9 = mr8Var6.f22256a;
                                    boolean z2 = mr8Var6.c;
                                    if (!mr8Var6.f) {
                                        this.h = mr8Var6.d;
                                        vxcVar = new e2q0("]");
                                    } else {
                                        if (g() == '(') {
                                            this.f++;
                                            Pattern pattern = q;
                                            c(pattern);
                                            i3 = 1;
                                            int iG = ufx.G(this.f, this.e);
                                            if (iG == -1) {
                                                strA = null;
                                            } else {
                                                char cG2 = g();
                                                String str5 = this.e;
                                                int i14 = this.f;
                                                String strSubstring2 = cG2 == '<' ? str5.substring(i14 + 1, iG - 1) : str5.substring(i14, iG);
                                                this.f = iG;
                                                strA = k2o.a(strSubstring2);
                                            }
                                            if (strA != null) {
                                                c(pattern);
                                                String str6 = this.e;
                                                int i15 = this.f;
                                                if (s.matcher(str6.substring(i15 - 1, i15)).matches()) {
                                                    String str7 = this.e;
                                                    int i16 = this.f;
                                                    if (i16 >= str7.length()) {
                                                        i7 = -1;
                                                        i6 = -1;
                                                    } else {
                                                        char cCharAt = str7.charAt(i16);
                                                        char c = '\"';
                                                        if (cCharAt != '\"') {
                                                            c = '\'';
                                                            if (cCharAt == '\'') {
                                                                I = ufx.I(str7, i16 + 1, c);
                                                                if (I == -1 && I < str7.length() && str7.charAt(I) == c) {
                                                                    i6 = I + 1;
                                                                    i7 = -1;
                                                                } else {
                                                                    i7 = -1;
                                                                    i6 = -1;
                                                                }
                                                            } else if (cCharAt != '(') {
                                                                i7 = -1;
                                                                i6 = -1;
                                                            } else {
                                                                c = ')';
                                                                I = ufx.I(str7, i16 + 1, c);
                                                                if (I == -1) {
                                                                    i7 = -1;
                                                                    i6 = -1;
                                                                } else {
                                                                    i6 = I + 1;
                                                                    i7 = -1;
                                                                }
                                                            }
                                                        } else {
                                                            I = ufx.I(str7, i16 + 1, c);
                                                            if (I == -1) {
                                                                i7 = -1;
                                                                i6 = -1;
                                                            } else {
                                                                i6 = I + 1;
                                                                i7 = -1;
                                                            }
                                                        }
                                                    }
                                                    if (i6 == i7) {
                                                        strA2 = null;
                                                    } else {
                                                        String strSubstring3 = this.e.substring(this.f + 1, i6 - 1);
                                                        this.f = i6;
                                                        strA2 = k2o.a(strSubstring3);
                                                    }
                                                    c(pattern);
                                                } else {
                                                    strA2 = null;
                                                }
                                                if (g() == ')') {
                                                    this.f++;
                                                    z = true;
                                                } else {
                                                    this.f = i13;
                                                }
                                                if (!z) {
                                                    i4 = this.f;
                                                    if (i4 < this.e.length() && this.e.charAt(this.f) == '[') {
                                                        int i17 = this.f + 1;
                                                        iH = ufx.H(i17, this.e);
                                                        int i18 = iH - i17;
                                                        if (iH != -1 && i18 <= 999 && iH < this.e.length() && this.e.charAt(iH) == ']') {
                                                            this.f = iH + 1;
                                                        }
                                                    }
                                                    i5 = this.f - i4;
                                                    if (i5 > 2) {
                                                        strSubstring = this.e.substring(i4, i5 + i4);
                                                    } else if (mr8Var6.g) {
                                                        strSubstring = null;
                                                    } else {
                                                        strSubstring = this.e.substring(mr8Var6.b, i13);
                                                    }
                                                    if (strSubstring != null) {
                                                        Pattern pattern2 = k2o.f17584a;
                                                        rb00Var = (rb00) ((Map) this.d.c).get(k2o.c.matcher(strSubstring.substring(i3, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(Separators.SP));
                                                        if (rb00Var != null) {
                                                            strA = rb00Var.h;
                                                            strA2 = rb00Var.i;
                                                            z = true;
                                                        }
                                                    }
                                                }
                                                if (!z) {
                                                    this.f = i13;
                                                    this.h = this.h.d;
                                                    e2q0Var = new e2q0("]");
                                                    r11 = e2q0Var;
                                                    i2 = 0;
                                                    r10 = r11;
                                                } else {
                                                    if (z2) {
                                                        cyw cywVar = new cyw();
                                                        cywVar.g = strA;
                                                        cywVar.h = strA2;
                                                        vxcVar = cywVar;
                                                    } else {
                                                        vxcVar = new hb00(strA, strA2);
                                                    }
                                                    b4eVar2 = (b4e) e2q0Var9.f;
                                                    while (b4eVar2 != null) {
                                                        b4e b4eVar7 = (b4e) b4eVar2.f;
                                                        vxcVar.b(b4eVar2);
                                                        b4eVar2 = b4eVar7;
                                                    }
                                                    h(mr8Var6.e);
                                                    b4eVar3 = (b4e) vxcVar.c;
                                                    b4eVar4 = (b4e) vxcVar.d;
                                                    if (b4eVar3 != b4eVar4) {
                                                        e(b4eVar3, b4eVar4);
                                                    }
                                                    e2q0Var9.j();
                                                    mr8Var = this.h.d;
                                                    this.h = mr8Var;
                                                    if (!z2) {
                                                        while (mr8Var != null) {
                                                            if (!mr8Var.c) {
                                                                mr8Var.f = false;
                                                            }
                                                            mr8Var = mr8Var.d;
                                                        }
                                                    }
                                                }
                                            }
                                            z = false;
                                            if (!z) {
                                                i4 = this.f;
                                                if (i4 < this.e.length()) {
                                                    int i19 = this.f + 1;
                                                    iH = ufx.H(i19, this.e);
                                                    int i110 = iH - i19;
                                                    if (iH != -1) {
                                                        this.f = iH + 1;
                                                    }
                                                }
                                                i5 = this.f - i4;
                                                if (i5 > 2) {
                                                    strSubstring = this.e.substring(i4, i5 + i4);
                                                } else if (mr8Var6.g) {
                                                    strSubstring = this.e.substring(mr8Var6.b, i13);
                                                } else {
                                                    strSubstring = null;
                                                }
                                                if (strSubstring != null) {
                                                    Pattern pattern3 = k2o.f17584a;
                                                    rb00Var = (rb00) ((Map) this.d.c).get(k2o.c.matcher(strSubstring.substring(i3, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(Separators.SP));
                                                    if (rb00Var != null) {
                                                        strA = rb00Var.h;
                                                        strA2 = rb00Var.i;
                                                        z = true;
                                                    }
                                                }
                                            }
                                            if (!z) {
                                                this.f = i13;
                                                this.h = this.h.d;
                                                e2q0Var = new e2q0("]");
                                                r11 = e2q0Var;
                                                i2 = 0;
                                                r10 = r11;
                                            } else {
                                                if (z2) {
                                                    cyw cywVar2 = new cyw();
                                                    cywVar2.g = strA;
                                                    cywVar2.h = strA2;
                                                    vxcVar = cywVar2;
                                                } else {
                                                    vxcVar = new hb00(strA, strA2);
                                                }
                                                b4eVar2 = (b4e) e2q0Var9.f;
                                                while (b4eVar2 != null) {
                                                    b4e b4eVar8 = (b4e) b4eVar2.f;
                                                    vxcVar.b(b4eVar2);
                                                    b4eVar2 = b4eVar8;
                                                }
                                                h(mr8Var6.e);
                                                b4eVar3 = (b4e) vxcVar.c;
                                                b4eVar4 = (b4e) vxcVar.d;
                                                if (b4eVar3 != b4eVar4) {
                                                    e(b4eVar3, b4eVar4);
                                                }
                                                e2q0Var9.j();
                                                mr8Var = this.h.d;
                                                this.h = mr8Var;
                                                if (!z2) {
                                                    while (mr8Var != null) {
                                                        if (!mr8Var.c) {
                                                            mr8Var.f = false;
                                                        }
                                                        mr8Var = mr8Var.d;
                                                    }
                                                }
                                            }
                                        } else {
                                            i3 = 1;
                                            strA = null;
                                        }
                                        strA2 = null;
                                        z = false;
                                        if (!z) {
                                            i4 = this.f;
                                            if (i4 < this.e.length()) {
                                                int i111 = this.f + 1;
                                                iH = ufx.H(i111, this.e);
                                                int i112 = iH - i111;
                                                if (iH != -1) {
                                                    this.f = iH + 1;
                                                }
                                            }
                                            i5 = this.f - i4;
                                            if (i5 > 2) {
                                                strSubstring = this.e.substring(i4, i5 + i4);
                                            } else if (mr8Var6.g) {
                                                strSubstring = this.e.substring(mr8Var6.b, i13);
                                            } else {
                                                strSubstring = null;
                                            }
                                            if (strSubstring != null) {
                                                Pattern pattern4 = k2o.f17584a;
                                                rb00Var = (rb00) ((Map) this.d.c).get(k2o.c.matcher(strSubstring.substring(i3, strSubstring.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(Separators.SP));
                                                if (rb00Var != null) {
                                                    strA = rb00Var.h;
                                                    strA2 = rb00Var.i;
                                                    z = true;
                                                }
                                            }
                                        }
                                        if (!z) {
                                            this.f = i13;
                                            this.h = this.h.d;
                                            e2q0Var = new e2q0("]");
                                            r11 = e2q0Var;
                                            i2 = 0;
                                            r10 = r11;
                                        } else {
                                            if (z2) {
                                                cyw cywVar3 = new cyw();
                                                cywVar3.g = strA;
                                                cywVar3.h = strA2;
                                                vxcVar = cywVar3;
                                            } else {
                                                vxcVar = new hb00(strA, strA2);
                                            }
                                            b4eVar2 = (b4e) e2q0Var9.f;
                                            while (b4eVar2 != null) {
                                                b4e b4eVar9 = (b4e) b4eVar2.f;
                                                vxcVar.b(b4eVar2);
                                                b4eVar2 = b4eVar9;
                                            }
                                            h(mr8Var6.e);
                                            b4eVar3 = (b4e) vxcVar.c;
                                            b4eVar4 = (b4e) vxcVar.d;
                                            if (b4eVar3 != b4eVar4) {
                                                e(b4eVar3, b4eVar4);
                                            }
                                            e2q0Var9.j();
                                            mr8Var = this.h.d;
                                            this.h = mr8Var;
                                            if (!z2) {
                                                while (mr8Var != null) {
                                                    if (!mr8Var.c) {
                                                        mr8Var.f = false;
                                                    }
                                                    mr8Var = mr8Var.d;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    vxcVar = new e2q0("]");
                                }
                                break;
                            default:
                                if (this.b.get(cG)) {
                                    q6k q6kVar = (q6k) this.c.get(Character.valueOf(cG));
                                    int i20 = this.f;
                                    int i21 = i8;
                                    while (g() == cG) {
                                        i21++;
                                        this.f++;
                                    }
                                    if (i21 < q6kVar.d()) {
                                        this.f = i20;
                                        jdxVar = e2q0Var4;
                                    } else {
                                        String strValueOf = Separators.RETURN;
                                        String strSubstring4 = i20 == 0 ? Separators.RETURN : this.e.substring(i20 - 1, i20);
                                        char cG3 = g();
                                        if (cG3 != 0) {
                                            strValueOf = String.valueOf(cG3);
                                        }
                                        Pattern pattern5 = i;
                                        boolean zMatches = pattern5.matcher(strSubstring4).matches();
                                        Pattern pattern6 = r;
                                        boolean zMatches2 = pattern6.matcher(strSubstring4).matches();
                                        boolean zMatches3 = pattern5.matcher(strValueOf).matches();
                                        boolean zMatches4 = pattern6.matcher(strValueOf).matches();
                                        int i22 = (zMatches4 || !(!zMatches3 || zMatches2 || zMatches)) ? i8 : 1;
                                        int i23 = (zMatches2 || !(!zMatches || zMatches4 || zMatches3)) ? i8 : 1;
                                        if (cG == '_') {
                                            int i24 = (i22 == 0 || !(i23 == 0 || zMatches)) ? i8 : 1;
                                            if (i23 == 0 || !(i22 == 0 || zMatches3)) {
                                                r8 = i8;
                                                r5 = i24;
                                            } else {
                                                r8 = 1;
                                                r5 = i24;
                                            }
                                        } else {
                                            int i25 = (i22 == 0 || cG != q6kVar.e()) ? i8 : 1;
                                            int i26 = (i23 == 0 || cG != q6kVar.a()) ? i8 : 1;
                                            r5 = i25;
                                            r8 = i26;
                                        }
                                        this.f = i20;
                                        jdxVar = new jdx(i21, r5, r8);
                                    }
                                    if (jdxVar == 0) {
                                        e2q0Var3 = e2q0Var4;
                                    } else {
                                        int i27 = jdxVar.f16350a;
                                        int i28 = i20 + i27;
                                        this.f = i28;
                                        e2q0 e2q0Var10 = new e2q0(this.e.substring(i20, i28));
                                        boolean z3 = jdxVar.c;
                                        boolean z4 = jdxVar.b;
                                        o6k o6kVar = this.g;
                                        o6k o6kVar2 = new o6k(e2q0Var10, cG, z3, z4, o6kVar);
                                        this.g = o6kVar2;
                                        o6kVar2.g = i27;
                                        o6kVar2.h = i27;
                                        if (o6kVar != null) {
                                            o6kVar.f = o6kVar2;
                                        }
                                        e2q0Var3 = e2q0Var10;
                                    }
                                } else {
                                    int i29 = this.f;
                                    int length = this.e.length();
                                    while (true) {
                                        int i30 = this.f;
                                        if (i30 != length) {
                                            if (!this.f18127a.get(this.e.charAt(i30))) {
                                                this.f++;
                                            }
                                        }
                                    }
                                    int i31 = this.f;
                                    if (i29 != i31) {
                                        e2q0Var3 = new e2q0(this.e.substring(i29, i31));
                                    } else {
                                        e2q0Var3 = e2q0Var4;
                                    }
                                }
                                i2 = i8;
                                r10 = e2q0Var3;
                                break;
                        }
                    } else {
                        String strC2 = c(n);
                        if (strC2 == null) {
                            r11 = 0;
                        } else {
                            int i32 = this.f;
                            while (true) {
                                String strC3 = c(m);
                                if (strC3 == null) {
                                    this.f = i32;
                                    e2q0Var2 = new e2q0(strC2);
                                    r11 = e2q0Var2;
                                } else if (strC3.equals(strC2)) {
                                    vxcVar = new vxc();
                                    String strReplace = this.e.substring(i32, this.f - strC2.length()).replace('\n', ' ');
                                    if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ') {
                                        int length2 = strReplace.length();
                                        if (x8x.z(' ', 0, length2, strReplace) != length2) {
                                            strReplace = vqd.k(1, 1, strReplace);
                                        }
                                    }
                                    vxcVar.g = strReplace;
                                }
                            }
                        }
                        i2 = 0;
                        r10 = r11;
                    }
                    r11 = vxcVar;
                    i2 = 0;
                    r10 = r11;
                } else {
                    String strC4 = c(o);
                    if (strC4 != null) {
                        String strK = vqd.k(1, 1, strC4);
                        hb00Var = new hb00("mailto:".concat(strK), null);
                        hb00Var.b(new e2q0(strK));
                    } else {
                        String strC5 = c(p);
                        if (strC5 != null) {
                            String strK2 = vqd.k(1, 1, strC5);
                            hb00Var = new hb00(strK2, null);
                            hb00Var.b(new e2q0(strK2));
                        } else {
                            r11 = 0;
                        }
                        if (r11 == 0) {
                            if (c(j) != null) {
                                e2q0Var = new itw();
                                r11 = e2q0Var;
                            } else {
                                r11 = 0;
                            }
                        }
                        i2 = 0;
                        r10 = r11;
                    }
                    r11 = hb00Var;
                    if (r11 == 0) {
                        if (c(j) != null) {
                            e2q0Var = new itw();
                            r11 = e2q0Var;
                        } else {
                            r11 = 0;
                        }
                    }
                    i2 = 0;
                    r10 = r11;
                }
                if (r10 != 0) {
                    r4 = r10;
                } else {
                    this.f++;
                    e2q0Var4 = new e2q0(String.valueOf(cG));
                }
                if (r4 != 0) {
                    h(null);
                    b4eVar5 = (b4e) b4eVar.c;
                    b4eVar6 = (b4e) b4eVar.d;
                    if (b4eVar5 == b4eVar6) {
                        return;
                    }
                    e(b4eVar5, b4eVar6);
                    return;
                }
                b4eVar.b(r4);
                i8 = i2;
                e2q0Var4 = null;
                r6 = r4;
            }
            r4 = e2q0Var4;
            if (r4 != 0) {
                h(null);
                b4eVar5 = (b4e) b4eVar.c;
                b4eVar6 = (b4e) b4eVar.d;
                if (b4eVar5 == b4eVar6) {
                    return;
                }
                e(b4eVar5, b4eVar6);
                return;
            }
            b4eVar.b(r4);
            i8 = i2;
            e2q0Var4 = null;
            r6 = r4;
        }
    }

    public final char g() {
        if (this.f < this.e.length()) {
            return this.e.charAt(this.f);
        }
        return (char) 0;
    }

    public final void h(o6k o6kVar) {
        boolean z;
        b4e b4eVar;
        HashMap map = new HashMap();
        o6k o6kVar2 = this.g;
        while (o6kVar2 != null) {
            o6k o6kVar3 = o6kVar2.e;
            if (o6kVar3 == o6kVar) {
                break;
            } else {
                o6kVar2 = o6kVar3;
            }
        }
        while (o6kVar2 != null) {
            e2q0 e2q0Var = o6kVar2.f24739a;
            char c = o6kVar2.b;
            q6k q6kVar = (q6k) this.c.get(Character.valueOf(c));
            if (!o6kVar2.d || q6kVar == null) {
                o6kVar2 = o6kVar2.f;
            } else {
                char cE = q6kVar.e();
                o6k o6kVar4 = o6kVar2.e;
                int iC = 0;
                boolean z2 = false;
                while (true) {
                    if (o6kVar4 == null || o6kVar4 == o6kVar || o6kVar4 == map.get(Character.valueOf(c))) {
                        z = z2;
                        z2 = false;
                        break;
                    }
                    if (o6kVar4.c && o6kVar4.b == cE) {
                        iC = q6kVar.c(o6kVar4, o6kVar2);
                        z2 = true;
                        if (iC > 0) {
                            z = true;
                            break;
                        }
                    }
                    o6kVar4 = o6kVar4.e;
                }
                if (z2) {
                    e2q0 e2q0Var2 = o6kVar4.f24739a;
                    o6kVar4.g -= iC;
                    o6kVar2.g -= iC;
                    e2q0Var2.g = vqd.k(iC, 0, e2q0Var2.g);
                    e2q0Var.g = vqd.k(iC, 0, e2q0Var.g);
                    o6k o6kVar5 = o6kVar2.e;
                    while (o6kVar5 != null && o6kVar5 != o6kVar4) {
                        o6k o6kVar6 = o6kVar5.e;
                        i(o6kVar5);
                        o6kVar5 = o6kVar6;
                    }
                    if (e2q0Var2 != e2q0Var && (b4eVar = (b4e) e2q0Var2.f) != e2q0Var) {
                        e(b4eVar, (b4e) e2q0Var.e);
                    }
                    q6kVar.b(e2q0Var2, e2q0Var, iC);
                    if (o6kVar4.g == 0) {
                        o6kVar4.f24739a.j();
                        i(o6kVar4);
                    }
                    if (o6kVar2.g == 0) {
                        o6k o6kVar7 = o6kVar2.f;
                        e2q0Var.j();
                        i(o6kVar2);
                        o6kVar2 = o6kVar7;
                    }
                } else {
                    if (!z) {
                        map.put(Character.valueOf(c), o6kVar2.e);
                        if (!o6kVar2.c) {
                            i(o6kVar2);
                        }
                    }
                    o6kVar2 = o6kVar2.f;
                }
            }
        }
        while (true) {
            o6k o6kVar8 = this.g;
            if (o6kVar8 == null || o6kVar8 == o6kVar) {
                return;
            } else {
                i(o6kVar8);
            }
        }
    }

    public final void i(o6k o6kVar) {
        o6k o6kVar2 = o6kVar.e;
        if (o6kVar2 != null) {
            o6kVar2.f = o6kVar.f;
        }
        o6k o6kVar3 = o6kVar.f;
        if (o6kVar3 == null) {
            this.g = o6kVar2;
        } else {
            o6kVar3.e = o6kVar2;
        }
    }
}
