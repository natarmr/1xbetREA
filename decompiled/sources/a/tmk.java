package a;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes.dex */
public final class tmk implements lfn0 {
    public static final String h = new String("FIXED_DIMENSION");
    public static final String i = new String("WRAP_DIMENSION");
    public static final String j = new String("SPREAD_DIMENSION");
    public static final String k = new String("PARENT_DIMENSION");
    public static final String l = new String("PERCENT_DIMENSION");
    public static final String m = new String("RATIO_DIMENSION");
    public Object g;
    public int b = 0;
    public int c = Integer.MAX_VALUE;
    public float e = 1.0f;
    public int f = 0;
    public String d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f34197a = false;

    public tmk(String str) {
        this.g = str;
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i2 >>> 8) | ((i2 & 255) << 24)), i4, i5, i6 | 33);
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            int i7 = i6 | 33;
            boolean z = (i2 & 1) != 0;
            boolean z2 = (i2 & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i4, i5, i7);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i4, i5, i7);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, i5, i7);
            }
            boolean z3 = (i2 & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i5, i7);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i4, i5, i7);
        }
    }

    public static tmk e(int i2) {
        tmk tmkVar = new tmk(h);
        tmkVar.g = null;
        tmkVar.f = i2;
        return tmkVar;
    }

    public static tmk g(String str) {
        tmk tmkVar = new tmk();
        tmkVar.b = 0;
        tmkVar.c = Integer.MAX_VALUE;
        tmkVar.e = 1.0f;
        tmkVar.f = 0;
        tmkVar.d = null;
        tmkVar.g = str;
        tmkVar.f34197a = true;
        return tmkVar;
    }

    public static tmk h() {
        return new tmk(i);
    }

    public void a(k4e k4eVar, int i2) {
        String str = this.d;
        if (str != null) {
            k4eVar.L(str);
        }
        boolean z = this.f34197a;
        j4e j4eVar = j4e.f15879a;
        j4e j4eVar2 = j4e.d;
        String str2 = k;
        j4e j4eVar3 = j4e.b;
        int i3 = 2;
        String str3 = l;
        j4e j4eVar4 = j4e.c;
        String str4 = i;
        if (i2 == 0) {
            if (z) {
                k4eVar.P(j4eVar4);
                String str5 = (String) this.g;
                if (str5 == str4) {
                    i3 = 1;
                } else if (str5 != str3) {
                    i3 = 0;
                }
                k4eVar.Q(this.e, i3, this.b, this.c);
                return;
            }
            int i4 = this.b;
            if (i4 > 0) {
                if (i4 < 0) {
                    k4eVar.d0 = 0;
                } else {
                    k4eVar.d0 = i4;
                }
            }
            int i5 = this.c;
            if (i5 < Integer.MAX_VALUE) {
                k4eVar.D[0] = i5;
            }
            String str6 = (String) this.g;
            if (str6 == str4) {
                k4eVar.P(j4eVar3);
                return;
            }
            if (str6 == str2) {
                k4eVar.P(j4eVar2);
                return;
            } else {
                if (str6 == null) {
                    k4eVar.P(j4eVar);
                    k4eVar.T(this.f);
                    return;
                }
                return;
            }
        }
        if (z) {
            k4eVar.R(j4eVar4);
            String str7 = (String) this.g;
            if (str7 == str4) {
                i3 = 1;
            } else if (str7 != str3) {
                i3 = 0;
            }
            k4eVar.S(this.e, i3, this.b, this.c);
            return;
        }
        int i6 = this.b;
        if (i6 > 0) {
            if (i6 < 0) {
                k4eVar.e0 = 0;
            } else {
                k4eVar.e0 = i6;
            }
        }
        int i7 = this.c;
        if (i7 < Integer.MAX_VALUE) {
            k4eVar.D[1] = i7;
        }
        String str8 = (String) this.g;
        if (str8 == str4) {
            k4eVar.R(j4eVar3);
            return;
        }
        if (str8 == str2) {
            k4eVar.R(j4eVar2);
        } else if (str8 == null) {
            k4eVar.R(j4eVar);
            k4eVar.O(this.f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.lfn0
    public void d(byte[] bArr, int i2, int i3, kfn0 kfn0Var, rbe rbeVar) {
        String strX;
        int i4;
        fq80 fq80Var = (fq80) this.g;
        fq80Var.K(bArr, i2 + i3);
        fq80Var.M(i2);
        int i5 = 1;
        int i6 = 0;
        int i7 = 2;
        x0x.A(fq80Var.a() >= 2);
        int iG = fq80Var.G();
        if (iG == 0) {
            strX = "";
        } else {
            int i8 = fq80Var.b;
            Charset charsetI = fq80Var.I();
            int i9 = iG - (fq80Var.b - i8);
            if (charsetI == null) {
                charsetI = StandardCharsets.UTF_8;
            }
            strX = fq80Var.x(i9, charsetI);
        }
        if (strX.isEmpty()) {
            v3x v3xVar = b4x.b;
            rbeVar.accept(new ftf(-9223372036854775807L, -9223372036854775807L, rcf0.e));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strX);
        c(spannableStringBuilder, this.b, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder, this.c, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.d;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fH = this.e;
        while (fq80Var.a() >= 8) {
            int i10 = fq80Var.b;
            int iM = fq80Var.m();
            int iM2 = fq80Var.m();
            if (iM2 == 1937013100) {
                x0x.A(fq80Var.a() >= i7 ? i5 : i6);
                int iG2 = fq80Var.G();
                int i11 = i6;
                while (i11 < iG2) {
                    x0x.A(fq80Var.a() >= 12 ? i5 : i6);
                    int iG3 = fq80Var.G();
                    int iG4 = fq80Var.G();
                    fq80Var.N(i7);
                    int i12 = i11;
                    int iZ = fq80Var.z();
                    fq80Var.N(i5);
                    int iM3 = fq80Var.m();
                    if (iG4 > spannableStringBuilder.length()) {
                        StringBuilder sbM = b1j.m(iG4, "Truncating styl end (", ") to cueText.length() (");
                        sbM.append(spannableStringBuilder.length());
                        sbM.append(").");
                        f1t0.g0("Tx3gParser", sbM.toString());
                        iG4 = spannableStringBuilder.length();
                    }
                    if (iG3 >= iG4) {
                        f1t0.g0("Tx3gParser", ohs0.m("Ignoring styl with start (", iG3, ") >= end (", ").", iG4));
                    } else {
                        int i13 = iG4;
                        c(spannableStringBuilder, iZ, this.b, iG3, i13, 0);
                        b(spannableStringBuilder, iM3, this.c, iG3, i13, 0);
                    }
                    i11 = i12 + 1;
                    i5 = 1;
                    i6 = 0;
                    i7 = 2;
                }
                i4 = i7;
            } else if (iM2 == 1952608120 && this.f34197a) {
                i4 = 2;
                x0x.A(fq80Var.a() >= 2);
                fH = vtt0.h(fq80Var.G() / this.f, 0.0f, 0.95f);
            } else {
                i4 = 2;
            }
            fq80Var.M(i10 + iM);
            i7 = i4;
            i5 = 1;
            i6 = 0;
        }
        rbeVar.accept(new ftf(-9223372036854775807L, -9223372036854775807L, b4x.t(new ctf(spannableStringBuilder, null, null, null, fH, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0))));
    }
}
