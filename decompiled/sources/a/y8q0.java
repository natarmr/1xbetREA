package a;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class y8q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f42207a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public tyc e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final Paint.FontMetricsInt l;
    public final int m;
    public final n600[] n;
    public final Rect o = new Rect();
    public w5z p;

    /* JADX WARN: Code duplicated, block: B:116:0x0216  */
    /* JADX WARN: Code duplicated, block: B:117:0x0218  */
    /* JADX WARN: Code duplicated, block: B:119:0x021d  */
    /* JADX WARN: Code duplicated, block: B:120:0x021f  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:89:0x019d A[PHI: r14
  0x019d: PHI (r14v7 int) = (r14v6 int), (r14v9 int) binds: [B:94:0x01af, B:87:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r26v1, types: [boolean] */
    public y8q0(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, q6z q6zVar) {
        int i9;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutM;
        boolean z2;
        int i10;
        n600[] n600VarArr;
        int i11;
        int i12;
        long jA;
        int i13;
        long j;
        char c;
        int i14;
        long jA2;
        int i15;
        int i16;
        long jA3;
        ?? IsFallbackLineSpacingEnabled;
        int i17;
        Paint.FontMetricsInt fontMetricsInt;
        boolean z3;
        ?? r15;
        n600 n600Var;
        n600 n600Var2;
        int i18;
        this.f42207a = textPaint;
        this.b = truncateAt;
        this.c = z;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicB = c9q0.b(i2);
        Layout.Alignment alignment = g2q0.f10573a;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : g2q0.b : g2q0.f10573a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z4 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, k56.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = q6zVar.a();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            if (metricsA == null || q6zVar.c() > f || z4) {
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                layoutM = wdx.M(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, i4, i5, i6, i7);
                z2 = false;
            } else {
                if (iCeil < 0) {
                    ycx.a("negative width");
                }
                if (iCeil < 0) {
                    ycx.a("negative ellipsized width");
                }
                layoutM = Build.VERSION.SDK_INT >= 33 ? uq6.g(charSequence, textPaint, iCeil, alignment2, metricsA, z, truncateAt, iCeil) : new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsA, z, truncateAt, iCeil);
                i9 = i3;
                textDirectionHeuristic = textDirectionHeuristicB;
                z2 = true;
            }
            this.f = layoutM;
            Trace.endSection();
            int iMin = Math.min(layoutM.getLineCount(), i9);
            this.g = iMin;
            int i19 = iMin - 1;
            this.d = iMin >= i9 && (layoutM.getEllipsisCount(i19) > 0 || layoutM.getLineEnd(i19) != charSequence.length());
            if (layoutM.getText() instanceof Spanned) {
                CharSequence text = layoutM.getText();
                text.getClass();
                if (q0x.M((Spanned) text, n600.class) || layoutM.getText().length() <= 0) {
                    CharSequence text2 = layoutM.getText();
                    text2.getClass();
                    i10 = 0;
                    n600VarArr = (n600[]) ((Spanned) text2).getSpans(0, layoutM.getText().length(), n600.class);
                } else {
                    n600VarArr = null;
                    i10 = 0;
                }
            } else {
                n600VarArr = null;
                i10 = 0;
            }
            this.n = n600VarArr;
            if (n600VarArr == null || (n600Var2 = (n600) tx3.B(n600VarArr)) == null) {
                i11 = 2;
                i12 = i10;
            } else {
                if (n600Var2.c) {
                    i11 = 2;
                    i18 = n600Var2.f == 2 ? 1 : i18;
                    i12 = i18;
                } else {
                    i11 = 2;
                }
                i18 = i10;
                i12 = i18;
            }
            int i20 = (n600VarArr == null || (n600Var = (n600) tx3.B(n600VarArr)) == null || !n600Var.d || n600Var.f != i11) ? i10 : 1;
            if (i12 == 0 || i20 == 0) {
                jA = c9q0.b;
                if (z) {
                    i13 = 33;
                } else {
                    if (z2) {
                        BoringLayout boringLayout = (BoringLayout) layoutM;
                        i13 = 33;
                        if (Build.VERSION.SDK_INT >= 33) {
                            IsFallbackLineSpacingEnabled = boringLayout.isFallbackLineSpacingEnabled();
                        } else {
                            IsFallbackLineSpacingEnabled = i10;
                        }
                    } else {
                        i13 = 33;
                        StaticLayout staticLayout = (StaticLayout) layoutM;
                        int i21 = Build.VERSION.SDK_INT;
                        if (i21 >= 33) {
                            IsFallbackLineSpacingEnabled = staticLayout.isFallbackLineSpacingEnabled();
                        } else if (i21 >= 28) {
                            IsFallbackLineSpacingEnabled = 1;
                        } else {
                            IsFallbackLineSpacingEnabled = i10;
                        }
                    }
                    if (IsFallbackLineSpacingEnabled == 0) {
                        TextPaint paint = layoutM.getPaint();
                        CharSequence text3 = layoutM.getText();
                        c = ' ';
                        Rect rectX = q7x.x(paint, text3, layoutM.getLineStart(i10), layoutM.getLineEnd(i10));
                        int lineAscent = layoutM.getLineAscent(i10);
                        j = 4294967295L;
                        int i22 = rectX.top;
                        int topPadding = i22 < lineAscent ? lineAscent - i22 : layoutM.getTopPadding();
                        i14 = 1;
                        rectX = iMin != 1 ? q7x.x(paint, text3, layoutM.getLineStart(i19), layoutM.getLineEnd(i19)) : rectX;
                        int lineDescent = layoutM.getLineDescent(i19);
                        int i23 = rectX.bottom;
                        int bottomPadding = i23 > lineDescent ? i23 - lineDescent : layoutM.getBottomPadding();
                        jA2 = (topPadding == 0 && bottomPadding == 0) ? jA2 : c9q0.a(topPadding, bottomPadding);
                        if (i12 != 0) {
                            i15 = i10;
                        } else {
                            i15 = (int) (jA2 >> c);
                        }
                        if (i20 != 0) {
                            i16 = i10;
                        } else {
                            i16 = (int) (jA2 & j);
                        }
                        jA3 = c9q0.a(i15, i16);
                    }
                    jA2 = jA;
                    if (i12 != 0) {
                        i15 = i10;
                    } else {
                        i15 = (int) (jA2 >> c);
                    }
                    if (i20 != 0) {
                        i16 = i10;
                    } else {
                        i16 = (int) (jA2 & j);
                    }
                    jA3 = c9q0.a(i15, i16);
                }
                c = ' ';
                j = 4294967295L;
                i14 = 1;
                jA2 = jA;
                if (i12 != 0) {
                    i15 = i10;
                } else {
                    i15 = (int) (jA2 >> c);
                }
                if (i20 != 0) {
                    i16 = i10;
                } else {
                    i16 = (int) (jA2 & j);
                }
                jA3 = c9q0.a(i15, i16);
            } else {
                jA3 = c9q0.b;
                jA = jA3;
                c = ' ';
                j = 4294967295L;
                i14 = 1;
                i13 = 33;
            }
            if (n600VarArr != null) {
                int length2 = n600VarArr.length;
                int iMax = i10;
                int iMax2 = iMax;
                for (int i24 = iMax2; i24 < length2; i24++) {
                    n600 n600Var3 = n600VarArr[i24];
                    int i25 = n600Var3.k;
                    iMax = i25 < 0 ? Math.max(iMax, Math.abs(i25)) : iMax;
                    int i26 = n600Var3.l;
                    if (i26 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i26));
                    }
                }
                jA = (iMax == 0 && iMax2 == 0) ? c9q0.b : c9q0.a(iMax, iMax2);
            }
            this.h = Math.max((int) (jA3 >> c), (int) (jA >> c));
            this.i = Math.max((int) (jA3 & j), (int) (jA & j));
            TextPaint textPaint2 = this.f42207a;
            n600[] n600VarArr2 = this.n;
            int i27 = this.g - i14;
            Layout layout = this.f;
            if (layout.getLineStart(i27) != layout.getLineEnd(i27) || n600VarArr2 == null || n600VarArr2.length == 0) {
                i17 = i10;
                fontMetricsInt = null;
            } else {
                SpannableString spannableString = new SpannableString("\u200b");
                n600 n600Var4 = (n600) tx3.A(n600VarArr2);
                int length3 = spannableString.length();
                if (i27 == 0 || !(z3 = n600Var4.d)) {
                    boolean z5 = n600Var4.d;
                    z3 = z5 ? 1 : 0;
                    r15 = z5;
                } else {
                    r15 = i10;
                }
                spannableString.setSpan(new n600(n600Var4.f22971a, length3, r15, z3, n600Var4.e, n600Var4.f), i10, spannableString.length(), i13);
                i17 = i10;
                StaticLayout staticLayoutM = wdx.M(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic, i6z.f14265a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.c, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutM.getLineAscent(i17);
                fontMetricsInt.descent = staticLayoutM.getLineDescent(i17);
                fontMetricsInt.top = staticLayoutM.getLineTop(i17);
                fontMetricsInt.bottom = staticLayoutM.getLineBottom(i17);
            }
            this.m = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) g(i19)) : i17;
            this.l = fontMetricsInt;
            Layout layout2 = this.f;
            this.j = b5x.L(layout2, i19, layout2.getPaint());
            Layout layout3 = this.f;
            this.k = b5x.M(layout3, i19, layout3.getPaint());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int a() {
        boolean z = this.d;
        Layout layout = this.f;
        return (z ? layout.getLineBottom(this.g - 1) : layout.getHeight()) + this.h + this.i + this.m;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final w5z c() {
        w5z w5zVar = this.p;
        if (w5zVar != null) {
            return w5zVar;
        }
        w5z w5zVar2 = new w5z(this.f);
        this.p = w5zVar2;
        return w5zVar2;
    }

    public final float d(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.g;
        int i3 = i2 - 1;
        Layout layout = this.f;
        if (i != i3 || (fontMetricsInt = this.l) == null) {
            return this.h + layout.getLineBottom(i) + (i == i2 + (-1) ? this.i : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    public final int e(int i) {
        ThreadLocal threadLocal = c9q0.f3974a;
        Layout layout = this.f;
        return (layout.getEllipsisCount(i) <= 0 || this.b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i) : layout.getText().length();
    }

    public final int f(int i) {
        int i2 = this.g;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f.getLineForOffset(i);
        int i3 = i2 - 1;
        return lineForOffset > i3 ? i3 : lineForOffset;
    }

    public final float g(int i) {
        return d(i) - h(i);
    }

    public final float h(int i) {
        return this.f.getLineTop(i) + (i == 0 ? 0 : this.h);
    }

    public final float i(int i, boolean z) {
        return b(f(i)) + c().z(i, true, z);
    }

    public final float j(int i, boolean z) {
        return b(f(i)) + c().z(i, false, z);
    }

    public final tyc k() {
        tyc tycVar = this.e;
        if (tycVar != null) {
            return tycVar;
        }
        Layout layout = this.f;
        tyc tycVar2 = new tyc(layout.getText(), layout.getText().length(), this.f42207a.getTextLocale());
        this.e = tycVar2;
        return tycVar2;
    }
}
