package a;

import com.appsflyer.share.attribution.RequestError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class yxk {
    public static final LinkedHashSet p = new LinkedHashSet(Arrays.asList(d98.class, etv.class, hpp.class, dtw.class, saq0.class, gc00.class, c5x.class));
    public static final Map q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f43426a;
    public boolean d;
    public boolean h;
    public final ArrayList i;
    public final xi70 j;
    public final ArrayList k;
    public final exk l;
    public final ArrayList n;
    public final LinkedHashSet o;
    public int b = 0;
    public int c = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public final LinkedHashMap m = new LinkedHashMap();

    static {
        HashMap map = new HashMap();
        map.put(d98.class, new f98((byte) 0));
        map.put(etv.class, new f98((byte) 2));
        map.put(hpp.class, new f98((byte) 1));
        map.put(dtw.class, new f98((byte) 3));
        map.put(saq0.class, new f98((byte) 6));
        map.put(gc00.class, new f98((byte) 5));
        map.put(c5x.class, new f98((byte) 4));
        q = Collections.unmodifiableMap(map);
    }

    public yxk(ArrayList arrayList, xi70 xi70Var, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.o = linkedHashSet;
        this.i = arrayList;
        this.j = xi70Var;
        this.k = arrayList2;
        exk exkVar = new exk((byte) 0);
        this.l = exkVar;
        arrayList3.add(exkVar);
        linkedHashSet.add(exkVar);
    }

    public final void a(a1 a1Var) {
        while (!h().b(a1Var.d())) {
            e(h());
        }
        h().d().b(a1Var.d());
        this.n.add(a1Var);
        this.o.add(a1Var);
    }

    public final void b(do80 do80Var) {
        tb00 tb00Var = do80Var.b;
        tb00Var.a();
        for (rb00 rb00Var : tb00Var.c) {
            un80 un80Var = do80Var.f6405a;
            rb00Var.j();
            b4e b4eVar = (b4e) un80Var.e;
            rb00Var.e = b4eVar;
            if (b4eVar != null) {
                b4eVar.f = rb00Var;
            }
            rb00Var.f = un80Var;
            un80Var.e = rb00Var;
            b4e b4eVar2 = (b4e) un80Var.b;
            rb00Var.b = b4eVar2;
            if (((b4e) rb00Var.e) == null) {
                b4eVar2.c = rb00Var;
            }
            String str = rb00Var.g;
            LinkedHashMap linkedHashMap = this.m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, rb00Var);
            }
        }
    }

    public final void c() {
        CharSequence charSequenceSubSequence;
        if (this.d) {
            int i = this.b + 1;
            CharSequence charSequence = this.f43426a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, charSequence.length());
            int i2 = 4 - (this.c % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.f43426a;
            charSequenceSubSequence = charSequence2.subSequence(this.b, charSequence2.length());
        }
        h().a(charSequenceSubSequence);
    }

    public final void d() {
        char cCharAt = this.f43426a.charAt(this.b);
        int i = this.b;
        if (cCharAt != '\t') {
            this.b = i + 1;
            this.c++;
        } else {
            this.b = i + 1;
            int i2 = this.c;
            this.c = (4 - (i2 % 4)) + i2;
        }
    }

    public final void e(a1 a1Var) {
        if (h() == a1Var) {
            ArrayList arrayList = this.n;
            arrayList.remove(arrayList.size() - 1);
        }
        if (a1Var instanceof do80) {
            b((do80) a1Var);
        }
        a1Var.c();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((a1) list.get(size));
        }
    }

    public final void g() {
        int i = this.b;
        int i2 = this.c;
        this.h = true;
        int length = this.f43426a.length();
        while (i < length) {
            char cCharAt = this.f43426a.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.h = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.e = i;
        this.f = i2;
        this.g = i2 - this.c;
    }

    public final a1 h() {
        return (a1) dw9.l(1, this.n);
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0228  */
    /* JADX WARN: Code duplicated, block: B:175:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:186:0x0328 A[PHI: r8 r21
  0x0328: PHI (r8v32 int) = (r8v6 int), (r8v6 int), (r8v6 int), (r8v33 int), (r8v34 int) binds: [B:299:0x0531, B:301:0x0537, B:303:0x053f, B:179:0x02fe, B:185:0x0327] A[DONT_GENERATE, DONT_INLINE]
  0x0328: PHI (r21v10 a.a1) = (r21v5 a.a1), (r21v5 a.a1), (r21v5 a.a1), (r21v11 a.a1), (r21v11 a.a1) binds: [B:299:0x0531, B:301:0x0537, B:303:0x053f, B:179:0x02fe, B:185:0x0327] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:216:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:255:0x0461  */
    /* JADX WARN: Code duplicated, block: B:257:0x047b  */
    /* JADX WARN: Code duplicated, block: B:258:0x047d  */
    /* JADX WARN: Code duplicated, block: B:264:0x0495  */
    /* JADX WARN: Code duplicated, block: B:290:0x0500  */
    /* JADX WARN: Code duplicated, block: B:90:0x0187  */
    /* JADX WARN: Failed to find 'out' block for switch in B:107:0x01b7. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [a.yxk] */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    public final void i(String str) {
        a1 a1Var;
        int i;
        ijv ijvVar;
        boolean z;
        int i2;
        char cCharAt;
        int i3;
        ipp ippVar;
        ijv ijvVar2;
        ftv ftvVar;
        int i4;
        StringBuilder sb;
        StringBuilder sb2;
        int i5;
        hc00 hc00Var;
        char cCharAt2;
        int i6;
        hc00 hc00Var2;
        int i7;
        char cCharAt3;
        String string = str;
        int length = string.length();
        int i8 = 0;
        StringBuilder sb3 = null;
        for (int i9 = 0; i9 < length; i9++) {
            char cCharAt4 = string.charAt(i9);
            if (cCharAt4 == 0) {
                if (sb3 == null) {
                    sb3 = new StringBuilder(length);
                    sb3.append((CharSequence) string, 0, i9);
                }
                sb3.append((char) 65533);
            } else if (sb3 != null) {
                sb3.append(cCharAt4);
            }
        }
        if (sb3 != null) {
            string = sb3.toString();
        }
        this.f43426a = string;
        this.b = 0;
        this.c = 0;
        this.d = false;
        ArrayList arrayList = this.n;
        int i10 = 1;
        for (a1 a1Var2 : arrayList.subList(1, arrayList.size())) {
            g();
            iyc iycVarG = a1Var2.g(this);
            if (iycVarG == null) {
                break;
            }
            if (iycVarG.c) {
                e(a1Var2);
                return;
            }
            int i11 = iycVarG.f15582a;
            if (i11 != -1) {
                k(i11);
            } else {
                int i12 = iycVarG.b;
                if (i12 != -1) {
                    j(i12);
                }
            }
            i10++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i10, arrayList.size()));
        a1 a1Var3 = (a1) arrayList.get(i10 - 1);
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean zE = (a1Var3.d() instanceof un80) || a1Var3.e();
        while (true) {
            if (zE) {
                g();
                if (!this.h) {
                    int i13 = 4;
                    if (this.g >= 4 || !Character.isLetter(Character.codePointAt(this.f43426a, this.e))) {
                        prc prcVar = new prc((Object) a1Var3, (byte) 28);
                        Iterator it = this.i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                i = i8;
                                char c = ' ';
                                switch (((f98) it.next()).f9143a) {
                                    case 0:
                                        a1Var = a1Var3;
                                        int i14 = this.e;
                                        CharSequence charSequence = this.f43426a;
                                        i2 = 4;
                                        if (this.g >= 4 || i14 >= charSequence.length() || charSequence.charAt(i14) != '>') {
                                            ijvVar = null;
                                        } else {
                                            int i15 = this.c + this.g;
                                            int i16 = i15 + 1;
                                            CharSequence charSequence2 = this.f43426a;
                                            int i17 = i14 + 1;
                                            if (i17 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i17)) == '\t' || cCharAt == ' ')) {
                                                i16 = i15 + 2;
                                            }
                                            a1[] a1VarArr = new a1[1];
                                            a1VarArr[i] = new g98();
                                            ijvVar = new ijv(a1VarArr);
                                            ijvVar.b = i16;
                                        }
                                        break;
                                    case 1:
                                        a1Var = a1Var3;
                                        int i18 = this.g;
                                        if (i18 < 4) {
                                            int i19 = this.e;
                                            CharSequence charSequence3 = this.f43426a;
                                            int length2 = charSequence3.length();
                                            int i20 = i19;
                                            int i21 = i;
                                            int i22 = i21;
                                            while (true) {
                                                i3 = i19;
                                                if (i20 < length2) {
                                                    char cCharAt5 = charSequence3.charAt(i20);
                                                    if (cCharAt5 == '`') {
                                                        i21++;
                                                    } else if (cCharAt5 == '~') {
                                                        i22++;
                                                    }
                                                    i20++;
                                                    i19 = i3;
                                                }
                                            }
                                            int i23 = 3;
                                            if (i21 < 3) {
                                                if (i22 >= i23 || i21 != 0) {
                                                    ippVar = null;
                                                } else {
                                                    ippVar = new ipp('~', i22, i18);
                                                }
                                            } else if (i22 == 0) {
                                                int i24 = i3 + i21;
                                                int length3 = charSequence3.length();
                                                while (true) {
                                                    if (i24 >= length3) {
                                                        i24 = -1;
                                                    } else if (charSequence3.charAt(i24) != '`') {
                                                        i24++;
                                                    }
                                                }
                                                if (i24 != -1) {
                                                    ippVar = null;
                                                } else {
                                                    ippVar = new ipp('`', i21, i18);
                                                }
                                            } else {
                                                i23 = 3;
                                                if (i22 >= i23) {
                                                    ippVar = null;
                                                } else {
                                                    ippVar = null;
                                                }
                                            }
                                            if (ippVar != null) {
                                                a1[] a1VarArr2 = new a1[1];
                                                a1VarArr2[i] = ippVar;
                                                ijvVar2 = new ijv(a1VarArr2);
                                                ijvVar2.f14896a = i3 + ippVar.f15175a.h;
                                                ijvVar = ijvVar2;
                                            }
                                            i2 = 4;
                                        }
                                        ijvVar = null;
                                        i2 = 4;
                                        break;
                                    case 2:
                                        a1Var = a1Var3;
                                        if (this.g < 4) {
                                            CharSequence charSequence4 = this.f43426a;
                                            int i25 = this.e;
                                            int iZ = x8x.z('#', i25, charSequence4.length(), charSequence4) - i25;
                                            if (iZ == 0 || iZ > 6) {
                                                ftvVar = null;
                                            } else {
                                                int i26 = i25 + iZ;
                                                if (i26 >= charSequence4.length()) {
                                                    ftvVar = new ftv(iZ, "");
                                                } else {
                                                    char cCharAt6 = charSequence4.charAt(i26);
                                                    char c2 = ' ';
                                                    char c3 = '\t';
                                                    if (cCharAt6 == ' ' || cCharAt6 == '\t') {
                                                        int length4 = charSequence4.length() - 1;
                                                        while (true) {
                                                            if (length4 < i26) {
                                                                length4 = i26 - 1;
                                                            } else {
                                                                char cCharAt7 = charSequence4.charAt(length4);
                                                                if (cCharAt7 == c3 || cCharAt7 == c2) {
                                                                    length4--;
                                                                    c2 = ' ';
                                                                    c3 = '\t';
                                                                }
                                                            }
                                                        }
                                                        int i27 = length4;
                                                        while (true) {
                                                            if (i27 < i26) {
                                                                i27 = i26 - 1;
                                                            } else if (charSequence4.charAt(i27) == '#') {
                                                                i27--;
                                                            }
                                                        }
                                                        int i28 = i27;
                                                        while (true) {
                                                            if (i28 < i26) {
                                                                i28 = i26 - 1;
                                                            } else {
                                                                char cCharAt8 = charSequence4.charAt(i28);
                                                                if (cCharAt8 == '\t' || cCharAt8 == ' ') {
                                                                    i28--;
                                                                }
                                                            }
                                                        }
                                                        ftvVar = i28 != i27 ? new ftv(iZ, charSequence4.subSequence(i26, i28 + 1).toString()) : new ftv(iZ, charSequence4.subSequence(i26, length4 + 1).toString());
                                                    } else {
                                                        ftvVar = null;
                                                    }
                                                }
                                            }
                                            if (ftvVar == null) {
                                                char cCharAt9 = charSequence4.charAt(i25);
                                                if (cCharAt9 == '-') {
                                                    if (x8x.A(charSequence4, x8x.z('-', i25 + 1, charSequence4.length(), charSequence4), charSequence4.length()) >= charSequence4.length()) {
                                                        i4 = 2;
                                                    } else {
                                                        i4 = i;
                                                    }
                                                } else if (cCharAt9 != '=') {
                                                    i4 = i;
                                                } else if (x8x.A(charSequence4, x8x.z('=', i25 + 1, charSequence4.length(), charSequence4), charSequence4.length()) >= charSequence4.length()) {
                                                    i4 = 1;
                                                } else if (x8x.A(charSequence4, x8x.z('-', i25 + 1, charSequence4.length(), charSequence4), charSequence4.length()) >= charSequence4.length()) {
                                                    i4 = 2;
                                                } else {
                                                    i4 = i;
                                                }
                                                if (i4 > 0) {
                                                    a1 a1Var4 = (a1) prcVar.b;
                                                    if (a1Var4 instanceof do80) {
                                                        sb = ((do80) a1Var4).b.b;
                                                        if (sb.length() == 0) {
                                                            sb = null;
                                                        }
                                                    } else {
                                                        sb = null;
                                                    }
                                                    if (sb != null) {
                                                        ftv ftvVar2 = new ftv(i4, sb.toString());
                                                        a1[] a1VarArr3 = new a1[1];
                                                        a1VarArr3[i] = ftvVar2;
                                                        ijvVar2 = new ijv(a1VarArr3);
                                                        ijvVar2.f14896a = charSequence4.length();
                                                        ijvVar2.c = true;
                                                    }
                                                    i2 = 4;
                                                }
                                            } else {
                                                a1[] a1VarArr4 = new a1[1];
                                                a1VarArr4[i] = ftvVar;
                                                ijvVar2 = new ijv(a1VarArr4);
                                                ijvVar2.f14896a = charSequence4.length();
                                            }
                                            ijvVar = ijvVar2;
                                            i2 = 4;
                                        }
                                        ijvVar = null;
                                        i2 = 4;
                                        break;
                                    case 3:
                                        a1Var = a1Var3;
                                        int i29 = i13;
                                        int i30 = this.e;
                                        CharSequence charSequence5 = this.f43426a;
                                        if (this.g >= i29 || charSequence5.charAt(i30) != '<') {
                                            ijvVar = null;
                                        } else {
                                            int i31 = 1;
                                            while (true) {
                                                if (i31 <= 7) {
                                                    if (i31 != 7 || !(((a1) prcVar.b).d() instanceof un80)) {
                                                        Pattern[] patternArr = ftw.e[i31];
                                                        Pattern pattern = patternArr[i];
                                                        Pattern pattern2 = patternArr[1];
                                                        if (pattern.matcher(charSequence5.subSequence(i30, charSequence5.length())).find()) {
                                                            a1[] a1VarArr5 = new a1[1];
                                                            a1VarArr5[i] = new ftw(pattern2);
                                                            ijvVar = new ijv(a1VarArr5);
                                                            ijvVar.f14896a = this.b;
                                                        }
                                                    }
                                                    i31++;
                                                } else {
                                                    ijvVar = null;
                                                }
                                            }
                                        }
                                        i2 = 4;
                                        break;
                                    case 4:
                                        a1Var = a1Var3;
                                        i2 = 4;
                                        if (this.g < 4) {
                                            ijvVar = null;
                                        } else if (this.h || (h().d() instanceof un80)) {
                                            i2 = 4;
                                            ijvVar = null;
                                        } else {
                                            a1[] a1VarArr6 = new a1[1];
                                            a1VarArr6[i] = new ftv();
                                            ijvVar = new ijv(a1VarArr6);
                                            i2 = 4;
                                            ijvVar.b = this.c + 4;
                                        }
                                        break;
                                    case 5:
                                        a1 a1Var5 = (a1) prcVar.b;
                                        int i32 = this.g;
                                        if (i32 < 4) {
                                            int i33 = this.e;
                                            int i34 = this.c + i32;
                                            if (a1Var5 instanceof do80) {
                                                sb2 = ((do80) a1Var5).b.b;
                                                if (sb2.length() == 0) {
                                                    sb2 = null;
                                                }
                                            } else {
                                                sb2 = null;
                                            }
                                            int i35 = sb2 != null ? 1 : i;
                                            CharSequence charSequence6 = this.f43426a;
                                            char cCharAt10 = charSequence6.charAt(i33);
                                            if (cCharAt10 == '*' || cCharAt10 == '+' || cCharAt10 == '-') {
                                                i5 = i35;
                                                a1Var = a1Var3;
                                                int i36 = i33 + 1;
                                                if (i36 >= charSequence6.length() || (cCharAt2 = charSequence6.charAt(i36)) == '\t' || cCharAt2 == ' ') {
                                                    od9 od9Var = new od9();
                                                    od9Var.h = cCharAt10;
                                                    hc00Var = new hc00(od9Var, i36);
                                                } else {
                                                    hc00Var = null;
                                                }
                                            } else {
                                                int length5 = charSequence6.length();
                                                int i37 = i33;
                                                int i38 = i;
                                                while (true) {
                                                    i5 = i35;
                                                    if (i37 < length5) {
                                                        char cCharAt11 = charSequence6.charAt(i37);
                                                        a1Var = a1Var3;
                                                        if (cCharAt11 != ')' && cCharAt11 != '.') {
                                                            switch (cCharAt11) {
                                                                case '0':
                                                                case '1':
                                                                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    i38++;
                                                                    if (i38 <= 9) {
                                                                        i37++;
                                                                        i35 = i5;
                                                                        a1Var3 = a1Var;
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        } else if (i38 >= 1 && ((i7 = i37 + 1) >= charSequence6.length() || (cCharAt3 = charSequence6.charAt(i7)) == '\t' || cCharAt3 == ' ')) {
                                                            String string2 = charSequence6.subSequence(i33, i37).toString();
                                                            ba80 ba80Var = new ba80();
                                                            ba80Var.h = Integer.parseInt(string2);
                                                            ba80Var.i = cCharAt11;
                                                            hc00Var = new hc00(ba80Var, i7);
                                                        }
                                                    } else {
                                                        a1Var = a1Var3;
                                                    }
                                                    hc00Var = null;
                                                }
                                            }
                                            if (hc00Var == null) {
                                                hc00Var2 = null;
                                            } else {
                                                gc00 gc00Var = hc00Var.f12796a;
                                                int i39 = hc00Var.b;
                                                int i40 = (i39 - i33) + i34;
                                                int length6 = charSequence6.length();
                                                int i41 = i40;
                                                while (true) {
                                                    if (i39 >= length6) {
                                                        i6 = i;
                                                    } else {
                                                        char cCharAt12 = charSequence6.charAt(i39);
                                                        if (cCharAt12 == '\t') {
                                                            i41 = (4 - (i41 % 4)) + i41;
                                                        } else if (cCharAt12 == ' ') {
                                                            i41++;
                                                        } else {
                                                            i6 = 1;
                                                        }
                                                        i39++;
                                                    }
                                                }
                                                if (i5 == 0 || ((!(gc00Var instanceof ba80) || ((ba80) gc00Var).h == 1) && i6 != 0)) {
                                                    if (i6 == 0 || i41 - i40 > 4) {
                                                        i41 = i40 + 1;
                                                    }
                                                    hc00Var2 = new hc00(gc00Var, i41);
                                                } else {
                                                    hc00Var2 = null;
                                                }
                                            }
                                            if (hc00Var2 != null) {
                                                gc00 gc00Var2 = hc00Var2.f12796a;
                                                int i42 = hc00Var2.b;
                                                od00 od00Var = new od00(i42 - this.c);
                                                if (a1Var5 instanceof ic00) {
                                                    gc00 gc00Var3 = ((ic00) a1Var5).f14514a;
                                                    if ((((gc00Var3 instanceof od9) && (gc00Var2 instanceof od9)) ? Character.valueOf(((od9) gc00Var3).h).equals(Character.valueOf(((od9) gc00Var2).h)) : ((gc00Var3 instanceof ba80) && (gc00Var2 instanceof ba80)) ? Character.valueOf(((ba80) gc00Var3).i).equals(Character.valueOf(((ba80) gc00Var2).i)) : i) == 0) {
                                                        ic00 ic00Var = new ic00(gc00Var2);
                                                        gc00Var2.g = true;
                                                        a1[] a1VarArr7 = new a1[2];
                                                        a1VarArr7[i] = ic00Var;
                                                        a1VarArr7[1] = od00Var;
                                                        ijv ijvVar3 = new ijv(a1VarArr7);
                                                        ijvVar3.b = i42;
                                                        ijvVar = ijvVar3;
                                                    } else {
                                                        a1[] a1VarArr8 = new a1[1];
                                                        a1VarArr8[i] = od00Var;
                                                        ijv ijvVar4 = new ijv(a1VarArr8);
                                                        ijvVar4.b = i42;
                                                        ijvVar = ijvVar4;
                                                    }
                                                } else {
                                                    ic00 ic00Var2 = new ic00(gc00Var2);
                                                    gc00Var2.g = true;
                                                    a1[] a1VarArr9 = new a1[2];
                                                    a1VarArr9[i] = ic00Var2;
                                                    a1VarArr9[1] = od00Var;
                                                    ijv ijvVar5 = new ijv(a1VarArr9);
                                                    ijvVar5.b = i42;
                                                    ijvVar = ijvVar5;
                                                }
                                            }
                                            i2 = 4;
                                        } else {
                                            a1Var = a1Var3;
                                        }
                                        ijvVar = null;
                                        i2 = 4;
                                        break;
                                    default:
                                        if (this.g >= i13) {
                                            ijvVar = null;
                                        } else {
                                            int i43 = this.e;
                                            CharSequence charSequence7 = this.f43426a;
                                            int length7 = charSequence7.length();
                                            int i44 = i;
                                            int i45 = i44;
                                            int i46 = i45;
                                            while (true) {
                                                if (i43 >= length7) {
                                                    int i47 = i45;
                                                    int i48 = i46;
                                                    if ((i44 >= 3 && i47 == 0 && i48 == 0) || ((i47 >= 3 && i44 == 0 && i48 == 0) || (i48 >= 3 && i44 == 0 && i47 == 0))) {
                                                        a1[] a1VarArr10 = new a1[1];
                                                        a1VarArr10[i] = new exk((byte) 1);
                                                        ijvVar = new ijv(a1VarArr10);
                                                        ijvVar.f14896a = charSequence7.length();
                                                    }
                                                } else {
                                                    char cCharAt13 = charSequence7.charAt(i43);
                                                    if (cCharAt13 == '\t' || cCharAt13 == c) {
                                                        i45 = i45;
                                                        i46 = i46;
                                                    } else if (cCharAt13 == '*') {
                                                        i46++;
                                                    } else if (cCharAt13 == '-') {
                                                        i44++;
                                                    } else if (cCharAt13 == '_') {
                                                        i45++;
                                                    }
                                                    i43++;
                                                    c = ' ';
                                                }
                                                ijvVar = null;
                                            }
                                        }
                                        a1Var = a1Var3;
                                        i2 = 4;
                                        break;
                                }
                                if (ijvVar == null) {
                                    i13 = i2;
                                    i8 = i;
                                    a1Var3 = a1Var;
                                }
                            } else {
                                i = i8;
                                a1Var = a1Var3;
                                ijvVar = null;
                            }
                        }
                        if (ijvVar == null) {
                            k(this.e);
                        } else {
                            if (!zIsEmpty) {
                                f(arrayList2);
                                zIsEmpty = true;
                            }
                            int i49 = ijvVar.f14896a;
                            if (i49 != -1) {
                                k(i49);
                            } else {
                                int i50 = ijvVar.b;
                                if (i50 != -1) {
                                    j(i50);
                                }
                            }
                            if (ijvVar.c) {
                                a1 a1VarH = h();
                                z = true;
                                arrayList.remove(arrayList.size() - 1);
                                this.o.remove(a1VarH);
                                if (a1VarH instanceof do80) {
                                    b((do80) a1VarH);
                                }
                                a1VarH.d().j();
                            } else {
                                z = true;
                            }
                            a1[] a1VarArr11 = (a1[]) ijvVar.d;
                            int length8 = a1VarArr11.length;
                            a1Var3 = a1Var;
                            for (int i51 = i; i51 < length8; i51++) {
                                a1Var3 = a1VarArr11[i51];
                                a(a1Var3);
                                zE = a1Var3.e();
                            }
                            i8 = i;
                        }
                    }
                }
                a1Var = a1Var3;
                k(this.e);
            } else {
                a1Var = a1Var3;
            }
            if (!zIsEmpty && !this.h) {
                a1 a1VarH2 = h();
                a1VarH2.getClass();
                if (a1VarH2 instanceof do80) {
                    c();
                    return;
                }
            }
            if (!zIsEmpty) {
                f(arrayList2);
            }
            if (!a1Var.e()) {
                c();
                return;
            } else {
                if (this.h) {
                    return;
                }
                a(new do80());
                c();
                return;
            }
        }
    }

    public final void j(int i) {
        int i2;
        int i3 = this.f;
        if (i >= i3) {
            this.b = this.e;
            this.c = i3;
        }
        int length = this.f43426a.length();
        while (true) {
            i2 = this.c;
            if (i2 >= i || this.b == length) {
                break;
            } else {
                d();
            }
        }
        if (i2 <= i) {
            this.d = false;
            return;
        }
        this.b--;
        this.c = i;
        this.d = true;
    }

    public final void k(int i) {
        int i2 = this.e;
        if (i >= i2) {
            this.b = i2;
            this.c = this.f;
        }
        int length = this.f43426a.length();
        while (true) {
            int i3 = this.b;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                d();
            }
        }
        this.d = false;
    }
}
