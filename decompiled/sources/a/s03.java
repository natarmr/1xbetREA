package a;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v03 f31393a;
    public final int b;
    public final long c;
    public final y8q0 d;
    public final CharSequence e;
    public final float f;
    public final List g;

    /* JADX WARN: Code duplicated, block: B:104:0x0159  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:138:0x0218  */
    /* JADX WARN: Code duplicated, block: B:139:0x021b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0235  */
    /* JADX WARN: Code duplicated, block: B:143:0x024f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0253 A[LOOP:1: B:144:0x0251->B:145:0x0253, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x027e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0282  */
    /* JADX WARN: Code duplicated, block: B:151:0x029a  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:160:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:163:0x02db  */
    /* JADX WARN: Code duplicated, block: B:164:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:187:0x032f  */
    /* JADX WARN: Code duplicated, block: B:66:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ed  */
    /* JADX WARN: Instruction removed from duplicated block: B:143:0x024f, please report this as an issue */
    public s03(v03 v03Var, int i, int i2, long j) throws Throwable {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        TextUtils.TruncateAt truncateAt;
        char c;
        TextUtils.TruncateAt truncateAt2;
        y8q0 y8q0VarA;
        int i9;
        s03 s03Var;
        int i10;
        Layout layout;
        Spanned spanned;
        jjj0[] jjj0VarArr;
        CharSequence charSequence;
        Spanned spanned2;
        Object[] spans;
        ArrayList arrayList;
        int length;
        int i11;
        List list;
        int spanEnd;
        int iF;
        boolean z;
        boolean z2;
        boolean z3;
        int i12;
        int i13;
        CharSequence charSequence2 = v03Var.h;
        this.f31393a = v03Var;
        this.b = i;
        this.c = j;
        if (p4e.j(j) != 0 || p4e.k(j) != 0) {
            ycx.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        if (i < 1) {
            ycx.a("maxLines should be greater than 0");
        }
        y9q0 y9q0Var = v03Var.b;
        if (i2 == 2) {
            i3 = 0;
            if (!daq0.a(y9q0Var.f42262a.h, idm0.t(0)) && !daq0.a(y9q0Var.f42262a.h, daq0.c) && (i13 = y9q0Var.b.f8127a) != 0 && i13 != 5 && i13 != 4 && charSequence2.length() != 0) {
                Spannable spannableString = charSequence2 instanceof Spannable ? (Spannable) charSequence2 : null;
                spannableString = spannableString == null ? new SpannableString(charSequence2) : spannableString;
                if (!q0x.M(spannableString, z4x.class)) {
                    spannableString.setSpan(new z4x(), spannableString.length() - 1, spannableString.length() - 1, 33);
                }
                charSequence2 = spannableString;
            }
        } else {
            i3 = 0;
        }
        CharSequence charSequence3 = charSequence2;
        this.e = charSequence3;
        eo80 eo80Var = y9q0Var.b;
        smk0 smk0Var = y9q0Var.f42262a;
        int i14 = eo80Var.f8127a;
        int i15 = i14 == 1 ? 3 : i14 == 2 ? 4 : i14 == 3 ? 2 : (i14 != 5 && i14 == 6) ? 1 : i3;
        int i16 = i14 == 4 ? 1 : i3;
        Throwable th = null;
        int i17 = eo80Var.h == 2 ? Build.VERSION.SDK_INT <= 32 ? 2 : 4 : i3;
        int i18 = eo80Var.g;
        int i19 = i18 & 255;
        if (i19 == 1) {
            i4 = i3;
        } else if (i19 == 2) {
            i4 = 1;
        } else if (i19 == 3) {
            i4 = 2;
        } else {
            i4 = i3;
        }
        int i20 = (i18 >> 8) & 255;
        if (i20 == 1) {
            i5 = i3;
        } else if (i20 == 2) {
            i5 = 1;
        } else if (i20 == 3) {
            i5 = 2;
        } else if (i20 == 4) {
            i5 = 3;
        } else {
            i5 = i3;
        }
        int i21 = (i18 >> 16) & 255;
        if (i21 == 1) {
            i7 = i3;
            i6 = 2;
        } else {
            i6 = 2;
            i7 = i21 == 2 ? 1 : i3;
        }
        if (i2 != i6) {
            if (i2 == 5) {
                truncateAt2 = TextUtils.TruncateAt.MIDDLE;
            } else if (i2 == 4) {
                i8 = i17;
                truncateAt = TextUtils.TruncateAt.START;
                c = ' ';
            } else {
                i8 = i17;
                smk0Var = smk0Var;
                truncateAt = null;
                c = ' ';
            }
            y8q0VarA = a(i15, i16, truncateAt, i, i8, i4, i5, i7, charSequence3);
            Layout layout2 = y8q0VarA.f;
            if (Build.VERSION.SDK_INT < 35 || v03Var.g.getLetterSpacing() == 0.0f || (!(i2 == 4 || i2 == 5) || layout2.getEllipsisCount(0) <= 0)) {
                i9 = 2;
                s03Var = this;
                i10 = i;
            } else {
                int ellipsisStart = layout2.getEllipsisStart(0);
                int ellipsisCount = layout2.getEllipsisCount(0) + ellipsisStart;
                i9 = 2;
                CharSequence[] charSequenceArr = {charSequence3.subSequence(0, ellipsisStart), "…", charSequence3.subSequence(ellipsisCount, charSequence3.length())};
                s03Var = this;
                i10 = i;
                y8q0VarA = s03Var.a(i15, i16, truncateAt, i10, i8, i4, i5, i7, TextUtils.concat(charSequenceArr));
            }
            int i22 = y8q0VarA.g;
            if (i2 == i9 || y8q0VarA.a() <= p4e.h(j) || i10 <= 1) {
                s03Var.d = y8q0VarA;
            } else {
                int iH = p4e.h(j);
                for (int i23 = 0; i23 < i22; i23++) {
                    if (y8q0VarA.d(i23) > iH) {
                        i22 = i23;
                        break;
                    }
                }
                if (i22 >= 0 && i22 != s03Var.b) {
                    y8q0VarA = s03Var.a(i15, i16, truncateAt, i22 < 1 ? 1 : i22, i8, i4, i5, i7, s03Var.e);
                }
                s03Var.d = y8q0VarA;
            }
            s03Var.f = y8q0VarA.a();
            smk0 smk0Var2 = smk0Var;
            s03Var.f31393a.g.c(smk0Var2.f32451a.l(), (((long) Float.floatToRawIntBits(s03Var.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(s03Var.c())) << c), smk0Var2.f32451a.g());
            layout = y8q0VarA.f;
            if (layout.getText() instanceof Spanned) {
                CharSequence text = layout.getText();
                text.getClass();
                spanned = (Spanned) text;
                if (spanned.nextSpanTransition(-1, spanned.length(), jjj0.class) != spanned.length()) {
                    CharSequence text2 = layout.getText();
                    text2.getClass();
                    jjj0VarArr = (jjj0[]) ((Spanned) text2).getSpans(0, layout.getText().length(), jjj0.class);
                } else {
                    jjj0VarArr = null;
                }
            } else {
                jjj0VarArr = null;
            }
            if (jjj0VarArr != null) {
                for (jjj0 jjj0Var : jjj0VarArr) {
                    ((hgk0) jjj0Var.c).setValue(new h7k0((((long) Float.floatToRawIntBits(s03Var.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(s03Var.c())) << c)));
                }
            }
            charSequence = s03Var.e;
            if (charSequence instanceof Spanned) {
                spanned2 = (Spanned) charSequence;
                spans = spanned2.getSpans(0, charSequence.length(), vu90.class);
                arrayList = new ArrayList(spans.length);
                length = spans.length;
                i11 = 0;
                while (i11 < length) {
                    vu90 vu90Var = (vu90) spans[i11];
                    int spanStart = spanned2.getSpanStart(vu90Var);
                    spanEnd = spanned2.getSpanEnd(vu90Var);
                    iF = s03Var.d.f(spanStart);
                    if (iF >= s03Var.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (s03Var.d.f.getEllipsisCount(iF) > 0 || spanEnd <= s03Var.d.f.getEllipsisStart(iF) + s03Var.d.f.getLineStart(iF)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (spanEnd > s03Var.d.e(iF)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 && !z3) {
                        if (!z) {
                            boolean z4 = s03Var.d.f.getParagraphDirection(iF) == 1;
                            boolean zIsRtlCharAt = s03Var.d.f.isRtlCharAt(spanStart);
                            if (z4 && !zIsRtlCharAt) {
                                s03Var.d.i(spanStart, false);
                                vu90Var.b();
                                throw th;
                            }
                            if (z4 && zIsRtlCharAt) {
                                s03Var.d.j(spanStart, false);
                                vu90Var.b();
                                throw th;
                            }
                            y8q0 y8q0Var = s03Var.d;
                            if (zIsRtlCharAt) {
                                y8q0Var.i(spanStart, false);
                                vu90Var.b();
                                throw th;
                            }
                            y8q0Var.j(spanStart, false);
                            vu90Var.b();
                            throw th;
                        }
                    }
                    arrayList.add(th);
                    i11++;
                    th = th;
                }
                list = arrayList;
            } else {
                list = iun.f15405a;
            }
            s03Var.g = list;
        }
        truncateAt2 = TextUtils.TruncateAt.END;
        i8 = i17;
        truncateAt = truncateAt2;
        c = ' ';
        y8q0VarA = a(i15, i16, truncateAt, i, i8, i4, i5, i7, charSequence3);
        Layout layout3 = y8q0VarA.f;
        if (Build.VERSION.SDK_INT < 35) {
            i9 = 2;
            s03Var = this;
            i10 = i;
        } else {
            i9 = 2;
            s03Var = this;
            i10 = i;
        }
        int i24 = y8q0VarA.g;
        if (i2 == i9) {
            s03Var.d = y8q0VarA;
        } else {
            s03Var.d = y8q0VarA;
        }
        s03Var.f = y8q0VarA.a();
        smk0 smk0Var3 = smk0Var;
        s03Var.f31393a.g.c(smk0Var3.f32451a.l(), (((long) Float.floatToRawIntBits(s03Var.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(s03Var.c())) << c), smk0Var3.f32451a.g());
        layout = y8q0VarA.f;
        if (layout.getText() instanceof Spanned) {
            jjj0VarArr = null;
        } else {
            CharSequence text3 = layout.getText();
            text3.getClass();
            spanned = (Spanned) text3;
            if (spanned.nextSpanTransition(-1, spanned.length(), jjj0.class) != spanned.length()) {
                CharSequence text4 = layout.getText();
                text4.getClass();
                jjj0VarArr = (jjj0[]) ((Spanned) text4).getSpans(0, layout.getText().length(), jjj0.class);
            } else {
                jjj0VarArr = null;
            }
        }
        if (jjj0VarArr != null) {
            while (i12 < r2) {
                ((hgk0) jjj0Var.c).setValue(new h7k0((((long) Float.floatToRawIntBits(s03Var.f)) & 4294967295L) | (((long) Float.floatToRawIntBits(s03Var.c())) << c)));
            }
        }
        charSequence = s03Var.e;
        if (charSequence instanceof Spanned) {
            list = iun.f15405a;
        } else {
            spanned2 = (Spanned) charSequence;
            spans = spanned2.getSpans(0, charSequence.length(), vu90.class);
            arrayList = new ArrayList(spans.length);
            length = spans.length;
            i11 = 0;
            while (i11 < length) {
                vu90 vu90Var2 = (vu90) spans[i11];
                int spanStart2 = spanned2.getSpanStart(vu90Var2);
                spanEnd = spanned2.getSpanEnd(vu90Var2);
                iF = s03Var.d.f(spanStart2);
                if (iF >= s03Var.b) {
                    z = true;
                } else {
                    z = false;
                }
                if (s03Var.d.f.getEllipsisCount(iF) > 0) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (spanEnd > s03Var.d.e(iF)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                }
                arrayList.add(th);
                i11++;
                th = th;
            }
            list = arrayList;
        }
        s03Var.g = list;
    }

    public final y8q0 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        ew90 ew90Var;
        float fC = c();
        v03 v03Var = this.f31393a;
        j23 j23Var = v03Var.g;
        int i8 = v03Var.l;
        q6z q6zVar = v03Var.i;
        y9q0 y9q0Var = v03Var.b;
        t03 t03Var = u03.f34834a;
        rw90 rw90Var = y9q0Var.c;
        return new y8q0(charSequence, fC, j23Var, i, truncateAt, i8, (rw90Var == null || (ew90Var = rw90Var.f31208a) == null) ? false : ew90Var.f8511a, i3, i5, i6, i7, i4, i2, q6zVar);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    public final long b(jge0 jge0Var, int i, v4i0 v4i0Var) {
        awh0 yevVar;
        int i2;
        int[] iArrI;
        RectF rectFW = e9x.W(jge0Var);
        boolean z = false;
        int i3 = (i != 0 && i == 1) ? 1 : 0;
        fa2 fa2Var = new fa2((Object) v4i0Var, (byte) 7);
        y8q0 y8q0Var = this.d;
        Layout layout = y8q0Var.f;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            iArrI = r6.i(y8q0Var, rectFW, i3, fa2Var);
        } else {
            w5z w5zVarC = y8q0Var.c();
            if (i3 == 1) {
                yevVar = new fuj0(layout.getText(), y8q0Var.k(), z);
            } else {
                CharSequence text = layout.getText();
                yevVar = i4 >= 29 ? new yev(text, y8q0Var.f42207a) : new zev(text);
            }
            awh0 awh0Var = yevVar;
            int lineForVertical = layout.getLineForVertical((int) rectFW.top);
            if (rectFW.top <= y8q0Var.d(lineForVertical) || (lineForVertical = lineForVertical + 1) < y8q0Var.g) {
                int i5 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) rectFW.bottom);
                if (lineForVertical2 != 0 || rectFW.bottom >= y8q0Var.h(0)) {
                    int iS = iym0.s(y8q0Var, layout, w5zVarC, i5, rectFW, awh0Var, fa2Var, true);
                    while (true) {
                        i2 = i5;
                        if (iS != -1 || i2 >= lineForVertical2) {
                            break;
                        }
                        i5 = i2 + 1;
                        iS = iym0.s(y8q0Var, layout, w5zVarC, i5, rectFW, awh0Var, fa2Var, true);
                    }
                    if (iS == -1) {
                        iArrI = null;
                    } else {
                        int i6 = lineForVertical2;
                        int iS2 = iym0.s(y8q0Var, layout, w5zVarC, i6, rectFW, awh0Var, fa2Var, false);
                        while (iS2 == -1 && i2 < i6) {
                            i6--;
                            iS2 = iym0.s(y8q0Var, layout, w5zVarC, i6, rectFW, awh0Var, fa2Var, false);
                        }
                        if (iS2 == -1) {
                            iArrI = null;
                        } else {
                            iArrI = new int[]{awh0Var.b(iS + 1), awh0Var.c(iS2 - 1)};
                        }
                    }
                } else {
                    iArrI = null;
                }
            } else {
                iArrI = null;
            }
        }
        return iArrI == null ? o9q0.b : s7n0.e(iArrI[0], iArrI[1]);
    }

    public final float c() {
        return p4e.i(this.c);
    }

    public final void d(x5a x5aVar) {
        Canvas canvasB = vw2.b(x5aVar);
        y8q0 y8q0Var = this.d;
        if (y8q0Var.d) {
            canvasB.save();
            canvasB.clipRect(0.0f, 0.0f, c(), this.f);
        }
        int i = y8q0Var.h;
        if (canvasB.getClipBounds(y8q0Var.o)) {
            if (i != 0) {
                canvasB.translate(0.0f, i);
            }
            ThreadLocal threadLocal = c9q0.f3974a;
            Object h2q0Var = threadLocal.get();
            if (h2q0Var == null) {
                h2q0Var = new h2q0();
                threadLocal.set(h2q0Var);
            }
            h2q0 h2q0Var2 = (h2q0) h2q0Var;
            h2q0Var2.f12348a = canvasB;
            try {
                y8q0Var.f.draw(h2q0Var2);
                h2q0Var2.f12348a = null;
                if (i != 0) {
                    canvasB.translate(0.0f, (-1.0f) * i);
                }
            } catch (Throwable th) {
                h2q0Var2.f12348a = null;
                throw th;
            }
        }
        if (y8q0Var.d) {
            canvasB.restore();
        }
    }

    public final void e(x5a x5aVar, long j, ljj0 ljj0Var, k5q0 k5q0Var, agc agcVar) {
        j23 j23Var = this.f31393a.g;
        byte b = j23Var.c;
        j23Var.d(j);
        j23Var.f(ljj0Var);
        j23Var.g(k5q0Var);
        j23Var.e(agcVar);
        j23Var.b(3);
        new bk2(1, this, s03.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, (byte) 7).invoke(x5aVar);
        j23Var.b(b);
    }

    public final void f(x5a x5aVar, t89 t89Var, float f, ljj0 ljj0Var, k5q0 k5q0Var, agc agcVar) {
        j23 j23Var = this.f31393a.g;
        byte b = j23Var.c;
        j23Var.c(t89Var, (((long) Float.floatToRawIntBits(c())) << 32) | (((long) Float.floatToRawIntBits(this.f)) & 4294967295L), f);
        j23Var.f(ljj0Var);
        j23Var.g(k5q0Var);
        j23Var.e(agcVar);
        j23Var.b(3);
        new bk2(1, this, s03.class, "paint", "paint(Landroidx/compose/ui/graphics/Canvas;)V", 0, (byte) 8).invoke(x5aVar);
        j23Var.b(b);
    }
}
