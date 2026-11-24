package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.BidiFormatter;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c6a extends View implements nfn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3809a;
    public List b;
    public float c;
    public n7a d;
    public float e;

    public c6a(Context context, int i) {
        super(context, null);
        this.f3809a = new ArrayList();
        this.b = Collections.EMPTY_LIST;
        this.c = 0.0533f;
        this.d = n7a.g;
        this.e = 0.08f;
    }

    @Override // a.nfn0
    public final void a(List list, n7a n7aVar, float f, float f2) {
        this.b = list;
        this.d = n7aVar;
        this.c = f;
        this.e = f2;
        while (true) {
            ArrayList arrayList = this.f3809a;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new ifn0(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:258:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:260:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:262:0x05fe  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [a.qo8] */
    /* JADX WARN: Type inference failed for: r7v6, types: [a.qo8] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i;
        int i2;
        Object[] objArr;
        int[] iArr;
        Spanned spanned;
        int[] iArr2;
        List listH;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        float f2;
        int i7;
        float f3;
        int i8;
        int iMax;
        int iMin;
        int iRound;
        int i9;
        c6a c6aVar = this;
        Canvas canvas2 = canvas;
        List list = c6aVar.b;
        if (list.isEmpty()) {
            return;
        }
        int height = c6aVar.getHeight();
        int paddingLeft = c6aVar.getPaddingLeft();
        int paddingTop = c6aVar.getPaddingTop();
        int width = c6aVar.getWidth() - c6aVar.getPaddingRight();
        int paddingBottom = height - c6aVar.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float fW = bcm0.w(c6aVar.c, 0, height, i10);
        float f4 = 0.0f;
        if (fW <= 0.0f) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            ctf ctfVarA = (ctf) list.get(i11);
            float f5 = f4;
            if (ctfVarA.p != Integer.MIN_VALUE) {
                btf btfVarA = ctfVarA.a();
                btfVarA.h = -3.4028235E38f;
                btfVarA.i = Integer.MIN_VALUE;
                btfVarA.c = null;
                int i12 = ctfVarA.f;
                float f6 = ctfVarA.e;
                if (i12 == 0) {
                    btfVarA.e = 1.0f - f6;
                    i9 = 0;
                    btfVarA.f = 0;
                } else {
                    i9 = 0;
                    btfVarA.e = (-f6) - 1.0f;
                    btfVarA.f = 1;
                }
                int i13 = ctfVarA.g;
                if (i13 == 0) {
                    btfVarA.g = 2;
                } else if (i13 == 2) {
                    btfVarA.g = i9;
                }
                ctfVarA = btfVarA.a();
            }
            float fW2 = bcm0.w(ctfVarA.o, ctfVarA.n, height, i10);
            ifn0 ifn0Var = (ifn0) c6aVar.f3809a.get(i11);
            n7a n7aVar = c6aVar.d;
            List list2 = list;
            float f7 = c6aVar.e;
            TextPaint textPaint = ifn0Var.f;
            int i14 = height;
            Bitmap bitmap = ctfVarA.d;
            int i15 = i10;
            float f8 = ctfVarA.k;
            int i16 = size;
            float f9 = ctfVarA.j;
            int i17 = i11;
            int i18 = ctfVarA.i;
            float f10 = ctfVarA.h;
            int i19 = ctfVarA.g;
            float f11 = fW;
            int i20 = ctfVarA.f;
            float f12 = ctfVarA.e;
            Layout.Alignment alignment = ctfVarA.b;
            ?? spannableStringBuilder = ctfVarA.f4933a;
            boolean z2 = bitmap == null;
            if (z2) {
                if (TextUtils.isEmpty(spannableStringBuilder)) {
                    i6 = paddingBottom;
                    z = false;
                } else {
                    f = f10;
                    i = ctfVarA.l ? ctfVarA.m : n7aVar.c;
                }
                i11 = i17 + 1;
                c6aVar = this;
                paddingBottom = i6;
                f4 = f5;
                list = list2;
                height = i14;
                i10 = i15;
                size = i16;
                fW = f11;
            } else {
                f = f10;
                i = -16777216;
            }
            ?? r14 = ifn0Var.i;
            if ((r14 == spannableStringBuilder || (r14 != 0 && r14.equals(spannableStringBuilder))) && Objects.equals(ifn0Var.j, alignment) && ifn0Var.k == bitmap && ifn0Var.l == f12 && ifn0Var.m == i20) {
                i2 = i19;
                if (Integer.valueOf(ifn0Var.n).equals(Integer.valueOf(i2)) && ifn0Var.o == f && Integer.valueOf(ifn0Var.p).equals(Integer.valueOf(i18)) && ifn0Var.q == f9 && ifn0Var.r == f8 && ifn0Var.s == n7aVar.f23032a && ifn0Var.t == n7aVar.b && ifn0Var.u == i && ifn0Var.w == n7aVar.d && ifn0Var.v == n7aVar.e && Objects.equals(textPaint.getTypeface(), n7aVar.f) && ifn0Var.x == f11 && ifn0Var.y == fW2 && ifn0Var.z == f7 && ifn0Var.A == paddingLeft && ifn0Var.B == paddingTop && ifn0Var.C == width && ifn0Var.D == paddingBottom) {
                    ifn0Var.a(canvas2, z2);
                    i6 = paddingBottom;
                    z = false;
                }
                i11 = i17 + 1;
                c6aVar = this;
                paddingBottom = i6;
                f4 = f5;
                list = list2;
                height = i14;
                i10 = i15;
                size = i16;
                fW = f11;
            } else {
                i2 = i19;
            }
            qo8 qo8Var = dy7.f6879a;
            if (spannableStringBuilder == 0) {
                i4 = width;
                paddingBottom = paddingBottom;
                z2 = z2;
            } else {
                int length = spannableStringBuilder.length();
                int iCharCount = 0;
                while (true) {
                    if (iCharCount < length) {
                        int iCodePointAt = Character.codePointAt((CharSequence) spannableStringBuilder, iCharCount);
                        int i21 = length;
                        byte directionality = Character.getDirectionality(iCodePointAt);
                        int i22 = iCharCount;
                        if (directionality == 1 || directionality == 2 || directionality == 16 || directionality == 17) {
                            BidiFormatter bidiFormatter = BidiFormatter.getInstance();
                            if (spannableStringBuilder instanceof Spanned) {
                                spanned = (Spanned) spannableStringBuilder;
                                Object[] spans = spanned.getSpans(0, spannableStringBuilder.length(), Object.class);
                                int[] iArr3 = new int[spans.length];
                                iArr = new int[spans.length];
                                Arrays.fill(iArr3, -1);
                                Arrays.fill(iArr, -1);
                                objArr = spans;
                                iArr2 = iArr3;
                            } else {
                                objArr = null;
                                iArr = null;
                                spanned = null;
                                iArr2 = null;
                            }
                            int[] iArr4 = iArr;
                            if (spannableStringBuilder.toString().contains(Separators.NEWLINE)) {
                                listH = dy7.b.h(spannableStringBuilder);
                                i3 = 2;
                            } else {
                                listH = dy7.f6879a.h(spannableStringBuilder);
                                i3 = 1;
                            }
                            List<String> list3 = listH;
                            ArrayList arrayList = new ArrayList(list3.size());
                            int i23 = 0;
                            int i24 = 0;
                            for (String str : list3) {
                                int i25 = i3;
                                int i26 = width;
                                String strUnicodeWrap = bidiFormatter.unicodeWrap(str, TextDirectionHeuristics.LTR);
                                if (objArr != null) {
                                    spanned.getClass();
                                    iArr2.getClass();
                                    iArr4.getClass();
                                    int length2 = strUnicodeWrap.length() - str.length();
                                    if (length2 > 0) {
                                        i24++;
                                    }
                                    for (int i27 = 0; i27 < objArr.length; i27 = i5 + 1) {
                                        if (iArr2[i27] >= 0 || spanned.getSpanStart(objArr[i27]) < i23) {
                                            i5 = i27;
                                        } else {
                                            i5 = i27;
                                            if (spanned.getSpanStart(objArr[i27]) < str.length() + i23) {
                                                iArr2[i5] = i24;
                                            }
                                        }
                                        if (iArr4[i5] < 0 && spanned.getSpanEnd(objArr[i5]) - 1 >= i23 && spanned.getSpanEnd(objArr[i5]) - 1 < str.length() + i23) {
                                            iArr4[i5] = i24;
                                        }
                                    }
                                    int length3 = str.length() + i25 + i23;
                                    if (length2 > 0) {
                                        i24++;
                                    }
                                    i23 = length3;
                                }
                                arrayList.add(strUnicodeWrap);
                                width = i26;
                                i3 = i25;
                                bidiFormatter = bidiFormatter;
                            }
                            i4 = width;
                            spannableStringBuilder = new SpannableStringBuilder(dy7.c.b(arrayList));
                            if (objArr != null) {
                                spanned.getClass();
                                iArr2.getClass();
                                iArr4.getClass();
                                int i28 = 0;
                                while (i28 < objArr.length) {
                                    int spanStart = spanned.getSpanStart(objArr[i28]) + iArr2[i28];
                                    int spanEnd = spanned.getSpanEnd(objArr[i28]) + iArr4[i28];
                                    int spanFlags = spanned.getSpanFlags(objArr[i28]);
                                    Object[] objArr2 = objArr;
                                    if (spanStart < 0 || spanStart >= spannableStringBuilder.length() || spanEnd < 0 || spanEnd > spannableStringBuilder.length()) {
                                        StringBuilder sbT = dw9.t("Span out of bounds: start=", spanStart, ",end=", ",len=", spanEnd);
                                        sbT.append(spannableStringBuilder.length());
                                        f1t0.g0("BidiUtils", sbT.toString());
                                    } else {
                                        spannableStringBuilder.setSpan(objArr2[i28], spanStart, spanEnd, spanFlags);
                                    }
                                    i28++;
                                    objArr = objArr2;
                                }
                            }
                        } else {
                            iCharCount = Character.charCount(iCodePointAt) + i22;
                            length = i21;
                        }
                    } else {
                        i4 = width;
                        paddingBottom = paddingBottom;
                        z2 = z2;
                    }
                }
            }
            ifn0Var.i = spannableStringBuilder;
            ifn0Var.j = alignment;
            ifn0Var.k = bitmap;
            ifn0Var.l = f12;
            ifn0Var.m = i20;
            ifn0Var.n = i2;
            ifn0Var.o = f;
            ifn0Var.p = i18;
            ifn0Var.q = f9;
            ifn0Var.r = f8;
            ifn0Var.s = n7aVar.f23032a;
            ifn0Var.t = n7aVar.b;
            ifn0Var.u = i;
            ifn0Var.w = n7aVar.d;
            ifn0Var.v = n7aVar.e;
            textPaint.setTypeface(n7aVar.f);
            f11 = f11;
            ifn0Var.x = f11;
            ifn0Var.y = fW2;
            ifn0Var.z = f7;
            ifn0Var.A = paddingLeft;
            ifn0Var.B = paddingTop;
            width = i4;
            ifn0Var.C = width;
            i6 = paddingBottom;
            ifn0Var.D = i6;
            if (z2) {
                ifn0Var.i.getClass();
                CharSequence charSequence = ifn0Var.i;
                SpannableStringBuilder spannableStringBuilder2 = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(ifn0Var.i);
                int i29 = ifn0Var.C - ifn0Var.A;
                int i30 = ifn0Var.D - ifn0Var.B;
                textPaint.setTextSize(ifn0Var.x);
                int i31 = (int) ((ifn0Var.x * 0.125f) + 0.5f);
                int i32 = i31 * 2;
                int i33 = i29 - i32;
                float f13 = ifn0Var.q;
                if (f13 != -3.4028235E38f) {
                    i33 = (int) (i33 * f13);
                }
                int i34 = i33;
                if (i34 <= 0) {
                    f1t0.g0("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    f11 = f11;
                } else {
                    if (ifn0Var.y > f5) {
                        i8 = 0;
                        spannableStringBuilder2.setSpan(new AbsoluteSizeSpan((int) ifn0Var.y), 0, spannableStringBuilder2.length(), 16711680);
                    } else {
                        i8 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder2);
                    if (ifn0Var.w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder3.getSpans(i8, spannableStringBuilder3.length(), ForegroundColorSpan.class);
                        int i35 = 0;
                        for (int length4 = foregroundColorSpanArr.length; i35 < length4; length4 = length4) {
                            spannableStringBuilder3.removeSpan(foregroundColorSpanArr[i35]);
                            i35++;
                        }
                    }
                    if (Color.alpha(ifn0Var.t) > 0) {
                        int i36 = ifn0Var.w;
                        if (i36 == 0 || i36 == 2) {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(ifn0Var.t), 0, spannableStringBuilder2.length(), 16711680);
                        } else {
                            spannableStringBuilder3.setSpan(new BackgroundColorSpan(ifn0Var.t), 0, spannableStringBuilder3.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment2 = ifn0Var.j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment3 = alignment2;
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, r1, i34, alignment3, ifn0Var.d, ifn0Var.e, true);
                    ifn0Var.E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int i37 = 0;
                    int iMax2 = 0;
                    for (int lineCount = ifn0Var.E.getLineCount(); i37 < lineCount; lineCount = lineCount) {
                        iMax2 = Math.max((int) Math.ceil(ifn0Var.E.getLineWidth(i37)), iMax2);
                        i37++;
                        height2 = height2;
                    }
                    int i38 = height2;
                    int i39 = ((ifn0Var.q == -3.4028235E38f || iMax2 >= i34) ? iMax2 : i34) + i32;
                    float f14 = ifn0Var.o;
                    if (f14 != -3.4028235E38f) {
                        int iRound2 = Math.round(i29 * f14);
                        int i40 = ifn0Var.A;
                        int i41 = iRound2 + i40;
                        int i42 = ifn0Var.p;
                        if (i42 == 1) {
                            i41 = ((i41 * 2) - i39) / 2;
                        } else if (i42 == 2) {
                            i41 -= i39;
                        }
                        iMax = Math.max(i41, i40);
                        iMin = Math.min(iMax + i39, ifn0Var.C);
                    } else {
                        iMax = ifn0Var.A + ((i29 - i39) / 2);
                        iMin = iMax + i39;
                    }
                    int i43 = iMin - iMax;
                    if (i43 <= 0) {
                        f1t0.g0("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                    } else {
                        float f15 = ifn0Var.l;
                        if (f15 != -3.4028235E38f) {
                            if (ifn0Var.m == 0) {
                                iRound = Math.round(i30 * f15) + ifn0Var.B;
                                int i44 = ifn0Var.n;
                                if (i44 == 2) {
                                    iRound -= i38;
                                } else if (i44 == 1) {
                                    iRound = ((iRound * 2) - i38) / 2;
                                }
                                z = false;
                            } else {
                                z = false;
                                int lineBottom = ifn0Var.E.getLineBottom(0) - ifn0Var.E.getLineTop(0);
                                float f16 = ifn0Var.l;
                                iRound = f16 >= f5 ? Math.round(f16 * lineBottom) + ifn0Var.B : (Math.round((f16 + 1.0f) * lineBottom) + ifn0Var.D) - i38;
                            }
                            int i45 = iRound + i38;
                            int i46 = ifn0Var.D;
                            if (i45 > i46) {
                                iRound = i46 - i38;
                            } else {
                                int i47 = ifn0Var.B;
                                if (iRound < i47) {
                                    iRound = i47;
                                }
                            }
                        } else {
                            z = false;
                            iRound = (ifn0Var.D - i38) - ((int) (i30 * ifn0Var.z));
                        }
                        ifn0Var.E = new StaticLayout(spannableStringBuilder4, r1, i43, alignment3, ifn0Var.d, ifn0Var.e, true);
                        ifn0Var.F = new StaticLayout(spannableStringBuilder3, textPaint, i43, alignment3, ifn0Var.d, ifn0Var.e, true);
                        ifn0Var.G = iMax;
                        ifn0Var.H = iRound;
                        ifn0Var.I = i31;
                    }
                }
                z = false;
            } else {
                f11 = f11;
                z = false;
                ifn0Var.k.getClass();
                Bitmap bitmap2 = ifn0Var.k;
                int i48 = ifn0Var.C;
                int i49 = ifn0Var.A;
                int i50 = ifn0Var.D;
                int i51 = ifn0Var.B;
                float f17 = i48 - i49;
                float f18 = (ifn0Var.o * f17) + i49;
                float f19 = i50 - i51;
                float f20 = (ifn0Var.l * f19) + i51;
                int iRound3 = Math.round(f17 * ifn0Var.q);
                float f21 = ifn0Var.r;
                int iRound4 = f21 != -3.4028235E38f ? Math.round(f19 * f21) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound3);
                int i52 = ifn0Var.p;
                if (i52 == 2) {
                    f2 = iRound3;
                } else {
                    if (i52 == 1) {
                        f2 = iRound3 / 2;
                    }
                    int iRound5 = Math.round(f18);
                    i7 = ifn0Var.n;
                    if (i7 == 2) {
                        f3 = iRound4;
                    } else {
                        if (i7 == 1) {
                            f3 = iRound4 / 2;
                        }
                        int iRound6 = Math.round(f20);
                        ifn0Var.J = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                    }
                    f20 -= f3;
                    int iRound7 = Math.round(f20);
                    ifn0Var.J = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
                }
                f18 -= f2;
                int iRound8 = Math.round(f18);
                i7 = ifn0Var.n;
                if (i7 == 2) {
                    f3 = iRound4;
                } else {
                    if (i7 == 1) {
                        f3 = iRound4 / 2;
                    }
                    int iRound9 = Math.round(f20);
                    ifn0Var.J = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
                }
                f20 -= f3;
                int iRound10 = Math.round(f20);
                ifn0Var.J = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
            }
            canvas2 = canvas;
            ifn0Var.a(canvas2, z2);
            i11 = i17 + 1;
            c6aVar = this;
            paddingBottom = i6;
            f4 = f5;
            list = list2;
            height = i14;
            i10 = i15;
            size = i16;
            fW = f11;
        }
    }
}
