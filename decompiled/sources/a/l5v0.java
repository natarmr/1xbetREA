package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class l5v0 extends FrameLayout implements nfn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c6a f19478a;
    public final j5v0 b;
    public List c;
    public n7a d;
    public float e;
    public float f;

    public l5v0(Context context) {
        super(context, null);
        this.c = Collections.EMPTY_LIST;
        this.d = n7a.g;
        this.e = 0.0533f;
        this.f = 0.08f;
        c6a c6aVar = new c6a(context, 0);
        this.f19478a = c6aVar;
        j5v0 j5v0Var = new j5v0(context, null);
        this.b = j5v0Var;
        j5v0Var.setBackgroundColor(0);
        j5v0Var.getSettings().setAllowContentAccess(false);
        addView(c6aVar);
        addView(j5v0Var);
    }

    @Override // a.nfn0
    public final void a(List list, n7a n7aVar, float f, float f2) {
        this.d = n7aVar;
        this.e = f;
        this.f = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            ctf ctfVar = (ctf) list.get(i);
            if (ctfVar.d != null) {
                arrayList.add(ctfVar);
            } else {
                arrayList2.add(ctfVar);
            }
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            c();
        }
        this.f19478a.a(arrayList, n7aVar, f, f2);
        invalidate();
    }

    public final String b(float f, int i) {
        float fW = bcm0.w(f, i, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fW == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fW / getContext().getResources().getDisplayMetrics().density)};
        String str = vtt0.f38024a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0236  */
    /* JADX WARN: Code duplicated, block: B:104:0x0249  */
    /* JADX WARN: Code duplicated, block: B:106:0x024f  */
    /* JADX WARN: Code duplicated, block: B:107:0x025c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0278 A[LOOP:2: B:108:0x0276->B:109:0x0278, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x029b A[LOOP:3: B:111:0x0295->B:113:0x029b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:118:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:121:0x030c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0312  */
    /* JADX WARN: Code duplicated, block: B:124:0x032a  */
    /* JADX WARN: Code duplicated, block: B:126:0x0330  */
    /* JADX WARN: Code duplicated, block: B:127:0x0346  */
    /* JADX WARN: Code duplicated, block: B:129:0x034c  */
    /* JADX WARN: Code duplicated, block: B:130:0x034f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0353  */
    /* JADX WARN: Code duplicated, block: B:134:0x035c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0362  */
    /* JADX WARN: Code duplicated, block: B:137:0x037c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0380  */
    /* JADX WARN: Code duplicated, block: B:140:0x039d  */
    /* JADX WARN: Code duplicated, block: B:142:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:144:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:146:0x03be  */
    /* JADX WARN: Code duplicated, block: B:148:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:150:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:152:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:155:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:157:0x03db  */
    /* JADX WARN: Code duplicated, block: B:158:0x03df  */
    /* JADX WARN: Code duplicated, block: B:160:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:162:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:167:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:169:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:170:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:172:0x0402  */
    /* JADX WARN: Code duplicated, block: B:173:0x0406  */
    /* JADX WARN: Code duplicated, block: B:175:0x040a  */
    /* JADX WARN: Code duplicated, block: B:177:0x041b  */
    /* JADX WARN: Code duplicated, block: B:180:0x041f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0425  */
    /* JADX WARN: Code duplicated, block: B:183:0x042d  */
    /* JADX WARN: Code duplicated, block: B:185:0x0430 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x0432  */
    /* JADX WARN: Code duplicated, block: B:188:0x0435  */
    /* JADX WARN: Code duplicated, block: B:189:0x0439  */
    /* JADX WARN: Code duplicated, block: B:190:0x043f  */
    /* JADX WARN: Code duplicated, block: B:191:0x0445  */
    /* JADX WARN: Code duplicated, block: B:192:0x044b  */
    /* JADX WARN: Code duplicated, block: B:195:0x0459  */
    /* JADX WARN: Code duplicated, block: B:196:0x045c  */
    /* JADX WARN: Code duplicated, block: B:199:0x046f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0487  */
    /* JADX WARN: Code duplicated, block: B:241:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:243:0x0502  */
    /* JADX WARN: Code duplicated, block: B:246:0x0517  */
    /* JADX WARN: Code duplicated, block: B:252:0x0548  */
    /* JADX WARN: Code duplicated, block: B:255:0x0574 A[LOOP:6: B:253:0x056e->B:255:0x0574, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:259:0x058f A[LOOP:7: B:257:0x0589->B:259:0x058f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:265:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:267:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:271:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:275:0x0608  */
    /* JADX WARN: Code duplicated, block: B:277:0x060b  */
    /* JADX WARN: Code duplicated, block: B:281:0x0612  */
    /* JADX WARN: Code duplicated, block: B:284:0x062b  */
    /* JADX WARN: Code duplicated, block: B:287:0x0646  */
    /* JADX WARN: Code duplicated, block: B:289:0x0651  */
    /* JADX WARN: Code duplicated, block: B:291:0x0654  */
    /* JADX WARN: Code duplicated, block: B:292:0x0657  */
    /* JADX WARN: Code duplicated, block: B:293:0x065a  */
    /* JADX WARN: Code duplicated, block: B:295:0x0678  */
    /* JADX WARN: Code duplicated, block: B:313:0x0524 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0173  */
    /* JADX WARN: Code duplicated, block: B:57:0x0184  */
    /* JADX WARN: Code duplicated, block: B:60:0x0191  */
    /* JADX WARN: Code duplicated, block: B:62:0x0198  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x01be  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x020b  */
    /* JADX WARN: Instruction removed from duplicated block: B:113:0x029b, please report this as an issue */
    public final void c() {
        String strConcat;
        String str;
        String str2;
        boolean z;
        float f;
        String str3;
        Layout.Alignment alignment;
        int i;
        Locale locale;
        int i2;
        Object obj;
        String str4;
        int i3;
        String str5;
        String str6;
        Object obj2;
        String str7;
        int i4;
        CharSequence charSequence;
        float f2;
        wcf0 wcf0Var;
        String str8;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i5;
        HashMap map;
        Iterator it;
        float f3;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i6;
        String str9;
        StringBuilder sb;
        int i7;
        int i8;
        g090 g090Var;
        Iterator it2;
        Iterator it3;
        Object obj3;
        boolean z2;
        boolean z3;
        int i9;
        t5q0 t5q0Var;
        int i10;
        int i11;
        StringBuilder sb2;
        int i12;
        String str10;
        String strL;
        int i13;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size;
        String str11;
        int spanStart;
        int spanEnd;
        dnk0 dnk0Var;
        dnk0 dnk0Var2;
        String str12;
        float f4;
        String str13;
        Layout.Alignment alignment2;
        int i14;
        int i15;
        String str14;
        String str15;
        String str16;
        boolean z4;
        l5v0 l5v0Var = this;
        Locale locale2 = Locale.US;
        StringBuilder sb3 = new StringBuilder();
        String strG = vic.G(l5v0Var.d.f23032a);
        int i16 = 0;
        String strB = l5v0Var.b(l5v0Var.e, 0);
        float f5 = 1.2f;
        Float fValueOf = Float.valueOf(1.2f);
        n7a n7aVar = l5v0Var.d;
        int i17 = n7aVar.d;
        int i18 = n7aVar.e;
        int i19 = 2;
        int i20 = 1;
        if (i17 == 1) {
            Object[] objArr = {vic.G(i18)};
            String str17 = vtt0.f38024a;
            strConcat = String.format(locale2, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr);
        } else if (i17 == 2) {
            String strG2 = vic.G(i18);
            String str18 = vtt0.f38024a;
            strConcat = "0.1em 0.12em 0.15em ".concat(strG2);
        } else if (i17 == 3) {
            String strG3 = vic.G(i18);
            String str19 = vtt0.f38024a;
            strConcat = "0.06em 0.08em 0.15em ".concat(strG3);
        } else if (i17 != 4) {
            strConcat = "unset";
        } else {
            String strG4 = vic.G(i18);
            String str20 = vtt0.f38024a;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strG4);
        }
        Object[] objArr2 = {strG, strB, fValueOf, strConcat};
        String str21 = vtt0.f38024a;
        sb3.append(String.format(locale2, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr2));
        HashMap map2 = new HashMap();
        String strG5 = vic.G(l5v0Var.d.b);
        String str22 = "background-color:";
        StringBuilder sb4 = new StringBuilder("background-color:");
        sb4.append(strG5);
        String str23 = Separators.SEMICOLON;
        sb4.append(Separators.SEMICOLON);
        map2.put(".default_bg,.default_bg *", sb4.toString());
        int i21 = 0;
        while (i21 < l5v0Var.c.size()) {
            ctf ctfVar = (ctf) l5v0Var.c.get(i21);
            float f6 = ctfVar.h;
            int i22 = ctfVar.p;
            float f7 = f6 != -3.4028235E38f ? f6 * 100.0f : 50.0f;
            float f8 = f5;
            int i23 = ctfVar.i;
            int i24 = -100;
            int i25 = i23 != i20 ? i23 != i19 ? i16 : -100 : -50;
            float f9 = ctfVar.e;
            if (f9 != -3.4028235E38f) {
                if (ctfVar.f != i20) {
                    str = String.format(Locale.US, "%.2f%%", Float.valueOf(f9 * 100.0f));
                    int i26 = ctfVar.g;
                    if (i22 == i20) {
                        i24 = -(i26 != i20 ? i26 != 2 ? 0 : -100 : -50);
                    } else {
                        i24 = i26 != i20 ? i26 != 2 ? 0 : -100 : -50;
                    }
                } else {
                    i25 = i25;
                    if (f9 >= 0.0f) {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(f9 * f8));
                        z = false;
                    } else {
                        str2 = String.format(Locale.US, "%.2fem", Float.valueOf(((-f9) - 1.0f) * f8));
                        z = true;
                    }
                    i24 = 0;
                }
                f = ctfVar.j;
                if (f != -3.4028235E38f) {
                    str3 = String.format(locale2, "%.2f%%", Float.valueOf(f * 100.0f));
                } else {
                    str3 = "fit-content";
                }
                String str24 = str3;
                alignment = ctfVar.b;
                if (alignment == null) {
                    locale = locale2;
                    obj = "center";
                    i2 = 2;
                } else {
                    i = k5v0.f17738a[alignment.ordinal()];
                    locale = locale2;
                    if (i != 1) {
                        i2 = 2;
                        if (i != 2) {
                            obj = "center";
                        } else {
                            obj = "end";
                        }
                    } else {
                        i2 = 2;
                        obj = "start";
                    }
                }
                if (i22 != 1) {
                    str4 = "vertical-rl";
                } else if (i22 != i2) {
                    str4 = "horizontal-tb";
                } else {
                    str4 = "vertical-lr";
                }
                String str25 = str4;
                String strB2 = l5v0Var.b(ctfVar.o, ctfVar.n);
                if (ctfVar.l) {
                    i3 = ctfVar.m;
                } else {
                    i3 = l5v0Var.d.c;
                }
                String strG6 = vic.G(i3);
                if (i22 != 1) {
                    if (z) {
                        str5 = "left";
                    } else {
                        str5 = "right";
                    }
                    str6 = str5;
                    obj2 = "top";
                } else if (i22 != 2) {
                    obj2 = "left";
                    str6 = z ? "bottom" : "top";
                } else {
                    if (z) {
                        str5 = "right";
                    } else {
                        str5 = "left";
                    }
                    str6 = str5;
                    obj2 = "top";
                }
                if (i22 != 2 || i22 == 1) {
                    str7 = "height";
                    i4 = i24;
                    i24 = i25;
                } else {
                    str7 = "width";
                    i4 = i25;
                }
                String str26 = str7;
                charSequence = ctfVar.f4933a;
                f2 = l5v0Var.getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = enk0.f8098a;
                int i27 = i4;
                int i28 = i21;
                wcf0Var = wcf0.g;
                if (charSequence == null) {
                    g090Var = new g090("", wcf0Var);
                    str8 = "";
                } else {
                    str8 = "";
                    if (charSequence instanceof Spanned) {
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        length = backgroundColorSpanArr.length;
                        i5 = 0;
                        while (i5 < length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i5].getBackgroundColor()));
                            i5++;
                            backgroundColorSpanArr = backgroundColorSpanArr;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strM = twn.m(iIntValue, "bg_");
                            Iterator it4 = it;
                            String strK = b1j.k(Separators.DOT, strM, ",.", strM, " *");
                            String strG7 = vic.G(iIntValue);
                            String str27 = vtt0.f38024a;
                            Locale locale3 = Locale.US;
                            map.put(strK, str22 + strG7 + str23);
                            it = it4;
                            f7 = f7;
                        }
                        f3 = f7;
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        i6 = 0;
                        for (length2 = spans.length; i6 < length2; length2 = i9) {
                            String str28 = str23;
                            obj3 = spans[i6];
                            String str29 = str22;
                            z2 = obj3 instanceof StrikethroughSpan;
                            String str30 = null;
                            if (z2) {
                                z3 = z2;
                                strL = "<span style='text-decoration:line-through;'>";
                            } else {
                                z3 = z2;
                                if (obj3 instanceof ForegroundColorSpan) {
                                    String strG8 = vic.G(((ForegroundColorSpan) obj3).getForegroundColor());
                                    String str31 = vtt0.f38024a;
                                    Locale locale4 = Locale.US;
                                    strL = kng0.l("<span style='color:", strG8, ";'>");
                                } else {
                                    spans = spans;
                                    if (obj3 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                        String str32 = vtt0.f38024a;
                                        Locale locale5 = Locale.US;
                                        i9 = length2;
                                        strL = ua80.e(backgroundColor, "<span class='bg_", "'>");
                                    } else {
                                        i9 = length2;
                                        if (obj3 instanceof bmw) {
                                            strL = "<span style='text-combine-upright:all;'>";
                                        } else if (obj3 instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                            if (absoluteSizeSpan.getDip()) {
                                                size = absoluteSizeSpan.getSize();
                                            } else {
                                                size = absoluteSizeSpan.getSize() / f2;
                                            }
                                            Object[] objArr3 = {Float.valueOf(size)};
                                            String str33 = vtt0.f38024a;
                                            strL = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr3);
                                        } else if (obj3 instanceof RelativeSizeSpan) {
                                            Object[] objArr4 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                            String str34 = vtt0.f38024a;
                                            strL = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr4);
                                        } else if (obj3 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj3).getFamily();
                                            if (family != null) {
                                                String str35 = vtt0.f38024a;
                                                Locale locale6 = Locale.US;
                                                strL = kng0.l("<span style='font-family:\"", family, "\";'>");
                                            } else {
                                                strL = null;
                                            }
                                        } else if (obj3 instanceof StyleSpan) {
                                            style = ((StyleSpan) obj3).getStyle();
                                            if (style != 1) {
                                                strL = "<b>";
                                            } else if (style != 2) {
                                                strL = "<i>";
                                            } else if (style != 3) {
                                                strL = null;
                                            } else {
                                                strL = "<b><i>";
                                            }
                                        } else if (obj3 instanceof wkg0) {
                                            i13 = ((wkg0) obj3).b;
                                            if (i13 != -1) {
                                                strL = "<ruby style='ruby-position:unset;'>";
                                            } else if (i13 != 1) {
                                                strL = "<ruby style='ruby-position:over;'>";
                                            } else if (i13 != 2) {
                                                strL = null;
                                            } else {
                                                strL = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            strL = "<u>";
                                        } else if (obj3 instanceof t5q0) {
                                            t5q0Var = (t5q0) obj3;
                                            i10 = t5q0Var.f33381a;
                                            i11 = t5q0Var.b;
                                            sb2 = new StringBuilder();
                                            if (i11 != 1) {
                                                i12 = 2;
                                                if (i11 == 2) {
                                                    sb2.append("open ");
                                                }
                                            } else {
                                                i12 = 2;
                                                sb2.append("filled ");
                                            }
                                            if (i10 != 0) {
                                                sb2.append("none");
                                            } else if (i10 != 1) {
                                                sb2.append("circle");
                                            } else if (i10 != i12) {
                                                sb2.append("dot");
                                            } else if (i10 != 3) {
                                                sb2.append("unset");
                                            } else {
                                                sb2.append("sesame");
                                            }
                                            String string = sb2.toString();
                                            if (t5q0Var.c != 2) {
                                                str10 = "over right";
                                            } else {
                                                str10 = "under left";
                                            }
                                            Object[] objArr5 = {string, str10};
                                            String str36 = vtt0.f38024a;
                                            strL = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr5);
                                        } else {
                                            strL = null;
                                        }
                                    }
                                }
                                if (z3 && !(obj3 instanceof ForegroundColorSpan) && !(obj3 instanceof BackgroundColorSpan) && !(obj3 instanceof bmw) && !(obj3 instanceof AbsoluteSizeSpan) && !(obj3 instanceof RelativeSizeSpan) && !(obj3 instanceof t5q0)) {
                                    if (obj3 instanceof TypefaceSpan) {
                                        str11 = ((TypefaceSpan) obj3).getFamily() != null ? "</span>" : null;
                                    } else {
                                        if (obj3 instanceof StyleSpan) {
                                            int style2 = ((StyleSpan) obj3).getStyle();
                                            if (style2 == 1) {
                                                str30 = "</b>";
                                            } else if (style2 == 2) {
                                                str30 = "</i>";
                                            } else if (style2 == 3) {
                                                str30 = "</i></b>";
                                            }
                                        } else if (obj3 instanceof wkg0) {
                                            str30 = "<rt>" + enk0.a(((wkg0) obj3).f39307a) + "</rt></ruby>";
                                        } else if (obj3 instanceof UnderlineSpan) {
                                            str30 = "</u>";
                                        }
                                        str11 = str30;
                                    }
                                }
                                spanStart = spanned.getSpanStart(obj3);
                                spanEnd = spanned.getSpanEnd(obj3);
                                if (strL != null) {
                                    str11.getClass();
                                    cnk0 cnk0Var = new cnk0(spanStart, strL, spanEnd, str11);
                                    dnk0Var = (dnk0) sparseArray.get(spanStart);
                                    if (dnk0Var == null) {
                                        dnk0Var = new dnk0();
                                        sparseArray.put(spanStart, dnk0Var);
                                    }
                                    dnk0Var.f6374a.add(cnk0Var);
                                    dnk0Var2 = (dnk0) sparseArray.get(spanEnd);
                                    if (dnk0Var2 == null) {
                                        dnk0Var2 = new dnk0();
                                        sparseArray.put(spanEnd, dnk0Var2);
                                    }
                                    dnk0Var2.b.add(cnk0Var);
                                }
                                i6++;
                                spans = spans;
                                str23 = str28;
                                str22 = str29;
                            }
                            i9 = length2;
                            str11 = z3 ? "</span>" : "</span>";
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strL != null) {
                                str11.getClass();
                                cnk0 cnk0Var2 = new cnk0(spanStart, strL, spanEnd, str11);
                                dnk0Var = (dnk0) sparseArray.get(spanStart);
                                if (dnk0Var == null) {
                                    dnk0Var = new dnk0();
                                    sparseArray.put(spanStart, dnk0Var);
                                }
                                dnk0Var.f6374a.add(cnk0Var2);
                                dnk0Var2 = (dnk0) sparseArray.get(spanEnd);
                                if (dnk0Var2 == null) {
                                    dnk0Var2 = new dnk0();
                                    sparseArray.put(spanEnd, dnk0Var2);
                                }
                                dnk0Var2.b.add(cnk0Var2);
                            }
                            i6++;
                            spans = spans;
                            str23 = str28;
                            str22 = str29;
                        }
                        str23 = str23;
                        str9 = str22;
                        sb = new StringBuilder(spanned.length());
                        i7 = 0;
                        i8 = 0;
                        while (i8 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i8);
                            sb.append(enk0.a(spanned.subSequence(i7, iKeyAt)));
                            dnk0 dnk0Var3 = (dnk0) sparseArray.get(iKeyAt);
                            ArrayList arrayList = dnk0Var3.b;
                            ArrayList arrayList2 = dnk0Var3.f6374a;
                            SparseArray sparseArray2 = sparseArray;
                            Collections.sort(arrayList, cnk0.f);
                            it2 = dnk0Var3.b.iterator();
                            while (it2.hasNext()) {
                                sb.append(((cnk0) it2.next()).d);
                            }
                            Collections.sort(arrayList2, cnk0.e);
                            it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                sb.append(((cnk0) it3.next()).c);
                            }
                            i8++;
                            i7 = iKeyAt;
                            sparseArray = sparseArray2;
                        }
                        sb.append(enk0.a(spanned.subSequence(i7, spanned.length())));
                        g090Var = new g090(sb.toString(), map);
                    } else {
                        g090Var = new g090(enk0.a(charSequence), wcf0Var);
                    }
                    str12 = (String) g090Var.f10448a;
                    for (String str37 : map2.keySet()) {
                        str16 = (String) map2.put(str37, (String) map2.get(str37));
                        if (str16 != null || str16.equals(map2.get(str37))) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        x0x.K(z4);
                    }
                    Integer numValueOf = Integer.valueOf(i28);
                    Float fValueOf2 = Float.valueOf(f3);
                    Integer numValueOf2 = Integer.valueOf(i27);
                    Integer numValueOf3 = Integer.valueOf(i24);
                    f4 = ctfVar.q;
                    if (f4 != 0.0f) {
                        if (i22 != 2 || i22 == 1) {
                            str15 = "skewY";
                        } else {
                            str15 = "skewX";
                        }
                        Object[] objArr6 = {str15, Float.valueOf(f4)};
                        String str38 = vtt0.f38024a;
                        str13 = String.format(Locale.US, "%s(%.2fdeg)", objArr6);
                    } else {
                        str13 = str8;
                    }
                    sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, obj2, fValueOf2, str6, str2, str26, str24, obj, str25, strB2, strG6, numValueOf2, numValueOf3, str13));
                    sb3.append("<span class='default_bg'>");
                    alignment2 = ctfVar.c;
                    if (alignment2 != null) {
                        i15 = k5v0.f17738a[alignment2.ordinal()];
                        if (i15 != 1) {
                            i14 = 2;
                            if (i15 != 2) {
                                str14 = "center";
                            } else {
                                str14 = "end";
                            }
                        } else {
                            i14 = 2;
                            str14 = "start";
                        }
                        sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                        sb3.append(str12);
                        sb3.append("</span>");
                    } else {
                        i14 = 2;
                        sb3.append(str12);
                    }
                    sb3.append("</span></div>");
                    i21 = i28 + 1;
                    i19 = i14;
                    locale2 = locale;
                    f5 = f8;
                    str23 = str23;
                    str22 = str9;
                    i16 = 0;
                    i20 = 1;
                    l5v0Var = this;
                }
                str9 = str22;
                f3 = f7;
                str12 = (String) g090Var.f10448a;
                while (r1.hasNext()) {
                    str16 = (String) map2.put(str37, (String) map2.get(str37));
                    if (str16 != null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    x0x.K(z4);
                }
                Integer numValueOf4 = Integer.valueOf(i28);
                Float fValueOf3 = Float.valueOf(f3);
                Integer numValueOf5 = Integer.valueOf(i27);
                Integer numValueOf6 = Integer.valueOf(i24);
                f4 = ctfVar.q;
                if (f4 != 0.0f) {
                    if (i22 != 2) {
                        str15 = "skewY";
                    } else {
                        str15 = "skewY";
                    }
                    Object[] objArr7 = {str15, Float.valueOf(f4)};
                    String str39 = vtt0.f38024a;
                    str13 = String.format(Locale.US, "%s(%.2fdeg)", objArr7);
                } else {
                    str13 = str8;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, obj2, fValueOf3, str6, str2, str26, str24, obj, str25, strB2, strG6, numValueOf5, numValueOf6, str13));
                sb3.append("<span class='default_bg'>");
                alignment2 = ctfVar.c;
                if (alignment2 != null) {
                    i15 = k5v0.f17738a[alignment2.ordinal()];
                    if (i15 != 1) {
                        i14 = 2;
                        if (i15 != 2) {
                            str14 = "center";
                        } else {
                            str14 = "end";
                        }
                    } else {
                        i14 = 2;
                        str14 = "start";
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                    sb3.append(str12);
                    sb3.append("</span>");
                } else {
                    i14 = 2;
                    sb3.append(str12);
                }
                sb3.append("</span></div>");
                i21 = i28 + 1;
                i19 = i14;
                locale2 = locale;
                f5 = f8;
                str23 = str23;
                str22 = str9;
                i16 = 0;
                i20 = 1;
                l5v0Var = this;
            } else {
                str = String.format(Locale.US, "%.2f%%", Float.valueOf((1.0f - l5v0Var.f) * 100.0f));
            }
            str2 = str;
            z = false;
            f = ctfVar.j;
            if (f != -3.4028235E38f) {
                str3 = String.format(locale2, "%.2f%%", Float.valueOf(f * 100.0f));
            } else {
                str3 = "fit-content";
            }
            String str210 = str3;
            alignment = ctfVar.b;
            if (alignment == null) {
                locale = locale2;
                obj = "center";
                i2 = 2;
            } else {
                i = k5v0.f17738a[alignment.ordinal()];
                locale = locale2;
                if (i != 1) {
                    i2 = 2;
                    if (i != 2) {
                        obj = "center";
                    } else {
                        obj = "end";
                    }
                } else {
                    i2 = 2;
                    obj = "start";
                }
            }
            if (i22 != 1) {
                str4 = "vertical-rl";
            } else if (i22 != i2) {
                str4 = "horizontal-tb";
            } else {
                str4 = "vertical-lr";
            }
            String str211 = str4;
            String strB3 = l5v0Var.b(ctfVar.o, ctfVar.n);
            if (ctfVar.l) {
                i3 = ctfVar.m;
            } else {
                i3 = l5v0Var.d.c;
            }
            String strG9 = vic.G(i3);
            if (i22 != 1) {
                if (z) {
                    str5 = "left";
                } else {
                    str5 = "right";
                }
                str6 = str5;
                obj2 = "top";
            } else if (i22 != 2) {
                obj2 = "left";
                str6 = z ? "bottom" : "top";
            } else {
                if (z) {
                    str5 = "right";
                } else {
                    str5 = "left";
                }
                str6 = str5;
                obj2 = "top";
            }
            if (i22 != 2) {
                str7 = "height";
                i4 = i24;
                i24 = i25;
            } else {
                str7 = "height";
                i4 = i24;
                i24 = i25;
            }
            String str212 = str7;
            charSequence = ctfVar.f4933a;
            f2 = l5v0Var.getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = enk0.f8098a;
            int i29 = i4;
            int i210 = i21;
            wcf0Var = wcf0.g;
            if (charSequence == null) {
                g090Var = new g090("", wcf0Var);
                str8 = "";
            } else {
                str8 = "";
                if (charSequence instanceof Spanned) {
                    g090Var = new g090(enk0.a(charSequence), wcf0Var);
                } else {
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    length = backgroundColorSpanArr.length;
                    i5 = 0;
                    while (i5 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i5].getBackgroundColor()));
                        i5++;
                        backgroundColorSpanArr = backgroundColorSpanArr;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strM2 = twn.m(iIntValue2, "bg_");
                        Iterator it5 = it;
                        String strK2 = b1j.k(Separators.DOT, strM2, ",.", strM2, " *");
                        String strG10 = vic.G(iIntValue2);
                        String str213 = vtt0.f38024a;
                        Locale locale7 = Locale.US;
                        map.put(strK2, str22 + strG10 + str23);
                        it = it5;
                        f7 = f7;
                    }
                    f3 = f7;
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    i6 = 0;
                    while (i6 < length2) {
                        String str214 = str23;
                        obj3 = spans[i6];
                        String str215 = str22;
                        z2 = obj3 instanceof StrikethroughSpan;
                        String str310 = null;
                        if (z2) {
                            z3 = z2;
                            strL = "<span style='text-decoration:line-through;'>";
                        } else {
                            z3 = z2;
                            if (obj3 instanceof ForegroundColorSpan) {
                                String strG11 = vic.G(((ForegroundColorSpan) obj3).getForegroundColor());
                                String str311 = vtt0.f38024a;
                                Locale locale8 = Locale.US;
                                strL = kng0.l("<span style='color:", strG11, ";'>");
                            } else {
                                spans = spans;
                                if (obj3 instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj3).getBackgroundColor();
                                    String str312 = vtt0.f38024a;
                                    Locale locale9 = Locale.US;
                                    i9 = length2;
                                    strL = ua80.e(backgroundColor2, "<span class='bg_", "'>");
                                } else {
                                    i9 = length2;
                                    if (obj3 instanceof bmw) {
                                        strL = "<span style='text-combine-upright:all;'>";
                                    } else if (obj3 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj3;
                                        if (absoluteSizeSpan.getDip()) {
                                            size = absoluteSizeSpan.getSize();
                                        } else {
                                            size = absoluteSizeSpan.getSize() / f2;
                                        }
                                        Object[] objArr8 = {Float.valueOf(size)};
                                        String str313 = vtt0.f38024a;
                                        strL = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr8);
                                    } else if (obj3 instanceof RelativeSizeSpan) {
                                        Object[] objArr9 = {Float.valueOf(((RelativeSizeSpan) obj3).getSizeChange() * 100.0f)};
                                        String str314 = vtt0.f38024a;
                                        strL = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr9);
                                    } else if (obj3 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj3).getFamily();
                                        if (family != null) {
                                            String str315 = vtt0.f38024a;
                                            Locale locale10 = Locale.US;
                                            strL = kng0.l("<span style='font-family:\"", family, "\";'>");
                                        } else {
                                            strL = null;
                                        }
                                    } else if (obj3 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj3).getStyle();
                                        if (style != 1) {
                                            strL = "<b>";
                                        } else if (style != 2) {
                                            strL = "<i>";
                                        } else if (style != 3) {
                                            strL = null;
                                        } else {
                                            strL = "<b><i>";
                                        }
                                    } else if (obj3 instanceof wkg0) {
                                        i13 = ((wkg0) obj3).b;
                                        if (i13 != -1) {
                                            strL = "<ruby style='ruby-position:unset;'>";
                                        } else if (i13 != 1) {
                                            strL = "<ruby style='ruby-position:over;'>";
                                        } else if (i13 != 2) {
                                            strL = null;
                                        } else {
                                            strL = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj3 instanceof UnderlineSpan) {
                                        strL = "<u>";
                                    } else if (obj3 instanceof t5q0) {
                                        t5q0Var = (t5q0) obj3;
                                        i10 = t5q0Var.f33381a;
                                        i11 = t5q0Var.b;
                                        sb2 = new StringBuilder();
                                        if (i11 != 1) {
                                            i12 = 2;
                                            if (i11 == 2) {
                                                sb2.append("open ");
                                            }
                                        } else {
                                            i12 = 2;
                                            sb2.append("filled ");
                                        }
                                        if (i10 != 0) {
                                            sb2.append("none");
                                        } else if (i10 != 1) {
                                            sb2.append("circle");
                                        } else if (i10 != i12) {
                                            sb2.append("dot");
                                        } else if (i10 != 3) {
                                            sb2.append("unset");
                                        } else {
                                            sb2.append("sesame");
                                        }
                                        String string2 = sb2.toString();
                                        if (t5q0Var.c != 2) {
                                            str10 = "over right";
                                        } else {
                                            str10 = "under left";
                                        }
                                        Object[] objArr10 = {string2, str10};
                                        String str316 = vtt0.f38024a;
                                        strL = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr10);
                                    } else {
                                        strL = null;
                                    }
                                }
                            }
                            if (z3) {
                            }
                            spanStart = spanned.getSpanStart(obj3);
                            spanEnd = spanned.getSpanEnd(obj3);
                            if (strL != null) {
                                str11.getClass();
                                cnk0 cnk0Var3 = new cnk0(spanStart, strL, spanEnd, str11);
                                dnk0Var = (dnk0) sparseArray.get(spanStart);
                                if (dnk0Var == null) {
                                    dnk0Var = new dnk0();
                                    sparseArray.put(spanStart, dnk0Var);
                                }
                                dnk0Var.f6374a.add(cnk0Var3);
                                dnk0Var2 = (dnk0) sparseArray.get(spanEnd);
                                if (dnk0Var2 == null) {
                                    dnk0Var2 = new dnk0();
                                    sparseArray.put(spanEnd, dnk0Var2);
                                }
                                dnk0Var2.b.add(cnk0Var3);
                            }
                            i6++;
                            spans = spans;
                            str23 = str214;
                            str22 = str215;
                        }
                        i9 = length2;
                        if (z3) {
                        }
                        spanStart = spanned.getSpanStart(obj3);
                        spanEnd = spanned.getSpanEnd(obj3);
                        if (strL != null) {
                            str11.getClass();
                            cnk0 cnk0Var4 = new cnk0(spanStart, strL, spanEnd, str11);
                            dnk0Var = (dnk0) sparseArray.get(spanStart);
                            if (dnk0Var == null) {
                                dnk0Var = new dnk0();
                                sparseArray.put(spanStart, dnk0Var);
                            }
                            dnk0Var.f6374a.add(cnk0Var4);
                            dnk0Var2 = (dnk0) sparseArray.get(spanEnd);
                            if (dnk0Var2 == null) {
                                dnk0Var2 = new dnk0();
                                sparseArray.put(spanEnd, dnk0Var2);
                            }
                            dnk0Var2.b.add(cnk0Var4);
                        }
                        i6++;
                        spans = spans;
                        str23 = str214;
                        str22 = str215;
                    }
                    str23 = str23;
                    str9 = str22;
                    sb = new StringBuilder(spanned.length());
                    i7 = 0;
                    i8 = 0;
                    while (i8 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i8);
                        sb.append(enk0.a(spanned.subSequence(i7, iKeyAt2)));
                        dnk0 dnk0Var4 = (dnk0) sparseArray.get(iKeyAt2);
                        ArrayList arrayList3 = dnk0Var4.b;
                        ArrayList arrayList4 = dnk0Var4.f6374a;
                        SparseArray sparseArray3 = sparseArray;
                        Collections.sort(arrayList3, cnk0.f);
                        it2 = dnk0Var4.b.iterator();
                        while (it2.hasNext()) {
                            sb.append(((cnk0) it2.next()).d);
                        }
                        Collections.sort(arrayList4, cnk0.e);
                        it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            sb.append(((cnk0) it3.next()).c);
                        }
                        i8++;
                        i7 = iKeyAt2;
                        sparseArray = sparseArray3;
                    }
                    sb.append(enk0.a(spanned.subSequence(i7, spanned.length())));
                    g090Var = new g090(sb.toString(), map);
                }
                str12 = (String) g090Var.f10448a;
                while (r1.hasNext()) {
                    str16 = (String) map2.put(str37, (String) map2.get(str37));
                    if (str16 != null) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    x0x.K(z4);
                }
                Integer numValueOf7 = Integer.valueOf(i210);
                Float fValueOf4 = Float.valueOf(f3);
                Integer numValueOf8 = Integer.valueOf(i29);
                Integer numValueOf9 = Integer.valueOf(i24);
                f4 = ctfVar.q;
                if (f4 != 0.0f) {
                    if (i22 != 2) {
                        str15 = "skewY";
                    } else {
                        str15 = "skewY";
                    }
                    Object[] objArr11 = {str15, Float.valueOf(f4)};
                    String str317 = vtt0.f38024a;
                    str13 = String.format(Locale.US, "%s(%.2fdeg)", objArr11);
                } else {
                    str13 = str8;
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf7, obj2, fValueOf4, str6, str2, str212, str210, obj, str211, strB3, strG9, numValueOf8, numValueOf9, str13));
                sb3.append("<span class='default_bg'>");
                alignment2 = ctfVar.c;
                if (alignment2 != null) {
                    i15 = k5v0.f17738a[alignment2.ordinal()];
                    if (i15 != 1) {
                        i14 = 2;
                        if (i15 != 2) {
                            str14 = "center";
                        } else {
                            str14 = "end";
                        }
                    } else {
                        i14 = 2;
                        str14 = "start";
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                    sb3.append(str12);
                    sb3.append("</span>");
                } else {
                    i14 = 2;
                    sb3.append(str12);
                }
                sb3.append("</span></div>");
                i21 = i210 + 1;
                i19 = i14;
                locale2 = locale;
                f5 = f8;
                str23 = str23;
                str22 = str9;
                i16 = 0;
                i20 = 1;
                l5v0Var = this;
            }
            str9 = str22;
            f3 = f7;
            str12 = (String) g090Var.f10448a;
            while (r1.hasNext()) {
                str16 = (String) map2.put(str37, (String) map2.get(str37));
                if (str16 != null) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                x0x.K(z4);
            }
            Integer numValueOf10 = Integer.valueOf(i210);
            Float fValueOf5 = Float.valueOf(f3);
            Integer numValueOf11 = Integer.valueOf(i29);
            Integer numValueOf12 = Integer.valueOf(i24);
            f4 = ctfVar.q;
            if (f4 != 0.0f) {
                if (i22 != 2) {
                    str15 = "skewY";
                } else {
                    str15 = "skewY";
                }
                Object[] objArr12 = {str15, Float.valueOf(f4)};
                String str318 = vtt0.f38024a;
                str13 = String.format(Locale.US, "%s(%.2fdeg)", objArr12);
            } else {
                str13 = str8;
            }
            sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf10, obj2, fValueOf5, str6, str2, str212, str210, obj, str211, strB3, strG9, numValueOf11, numValueOf12, str13));
            sb3.append("<span class='default_bg'>");
            alignment2 = ctfVar.c;
            if (alignment2 != null) {
                i15 = k5v0.f17738a[alignment2.ordinal()];
                if (i15 != 1) {
                    i14 = 2;
                    if (i15 != 2) {
                        str14 = "center";
                    } else {
                        str14 = "end";
                    }
                } else {
                    i14 = 2;
                    str14 = "start";
                }
                sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                sb3.append(str12);
                sb3.append("</span>");
            } else {
                i14 = 2;
                sb3.append(str12);
            }
            sb3.append("</span></div>");
            i21 = i210 + 1;
            i19 = i14;
            locale2 = locale;
            f5 = f8;
            str23 = str23;
            str22 = str9;
            i16 = 0;
            i20 = 1;
            l5v0Var = this;
        }
        sb3.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("<html><head><style>");
        for (String str40 : map2.keySet()) {
            sb5.append(str40);
            sb5.append("{");
            sb5.append((String) map2.get(str40));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb3.insert(0, (CharSequence) sb5);
        this.b.loadData(Base64.encodeToString(sb3.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", SDPKeywords.BASE64);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.c.isEmpty()) {
            return;
        }
        c();
    }
}
