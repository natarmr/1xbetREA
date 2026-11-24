package org.xplatform.rules.impl.util;

import a.a8z;
import a.aqd0;
import a.ar20;
import a.b1j;
import a.bkb;
import a.bt40;
import a.byw;
import a.co80;
import a.cr20;
import a.cy2;
import a.dgu;
import a.dr20;
import a.dw9;
import a.e8r0;
import a.er20;
import a.gxu;
import a.h5;
import a.hr20;
import a.htw;
import a.idx;
import a.ir20;
import a.iun;
import a.j;
import a.j5d;
import a.jr20;
import a.k810;
import a.maz;
import a.mqd0;
import a.mr20;
import a.q14;
import a.qce;
import a.rce;
import a.s9d;
import a.sgi0;
import a.siq;
import a.tqt;
import a.tx3;
import a.v9d;
import a.vzd;
import a.w6x;
import a.wb;
import a.wez;
import a.y78;
import a.yk5;
import a.yld;
import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ContactsWebView extends FrameLayout {
    public static final /* synthetic */ int m = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f46909a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public String h;
    public String i;
    public String j;
    public Function1 k;
    public Function0 l;

    /* JADX WARN: Illegal instructions before constructor call */
    public ContactsWebView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        this.f46909a = maz.a(wez.b, new h5((Object) this, (Object) this, (byte) 22));
        TypedValue typedValue = j5d.f15927a;
        Context context2 = getRootView().getContext();
        context2.getClass();
        this.b = j5d.a(context2, R.attr.uikitBackground, false);
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = new vzd((byte) 2);
        this.l = new yld((byte) 17);
        siq fixedWebView = getBinding().b.getFixedWebView();
        if (fixedWebView != null) {
            fixedWebView.setVisibility(8);
            fixedWebView.getSettings().setJavaScriptEnabled(true);
            fixedWebView.getSettings().setLoadWithOverviewMode(true);
            fixedWebView.getSettings().setUseWideViewPort(true);
            fixedWebView.getSettings().setDomStorageEnabled(true);
            fixedWebView.setFixedWebViewClient(new qce(this));
        }
        setAttributes(attributeSet);
    }

    private final rce getBinding() {
        Object value = this.f46909a.getValue();
        value.getClass();
        return (rce) value;
    }

    private final void setAttributes(AttributeSet attributeSet) {
        if (attributeSet != null) {
            Context context = getContext();
            context.getClass();
            q14 q14Var = new q14(context, attributeSet, aqd0.n);
            TypedArray typedArray = q14Var.b;
            try {
                try {
                    this.c = typedArray.getResourceId(1, this.c);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    this.b = typedArray.getColor(0, this.b);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                q14Var.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    bkb.E(q14Var, th);
                    throw th2;
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(this.c, mqd0.x);
        String string = typedArrayObtainStyledAttributes.getString(10);
        if (string == null) {
            string = this.h;
        }
        this.h = string;
        this.e = typedArrayObtainStyledAttributes.getColor(3, this.e);
        this.d = typedArrayObtainStyledAttributes.getColor(5, this.d);
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, this.g);
        Context context2 = getContext();
        context2.getClass();
        this.g = (int) (dimension / context2.getResources().getDisplayMetrics().scaledDensity);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:128:0x035a  */
    /* JADX WARN: Code duplicated, block: B:129:0x035d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0368  */
    /* JADX WARN: Code duplicated, block: B:133:0x036d  */
    /* JADX WARN: Code duplicated, block: B:135:0x037d  */
    /* JADX WARN: Code duplicated, block: B:137:0x038a  */
    /* JADX WARN: Code duplicated, block: B:138:0x038c  */
    /* JADX WARN: Code duplicated, block: B:144:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:156:0x03db  */
    /* JADX WARN: Code duplicated, block: B:157:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:158:0x03de A[PHI: r5
  0x03de: PHI (r5v9 int) = (r5v8 int), (r5v16 int) binds: [B:132:0x036b, B:157:0x03dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:160:0x03e1 A[ADDED_TO_REGION] */
    public final void a(int i, String str) {
        int i2;
        yk5 yk5Var;
        er20 er20Var;
        boolean z;
        int i3;
        int iX;
        int i4;
        k810 k810VarE;
        v9d v9dVar;
        Character chQ;
        ar20 ar20Var;
        int iC;
        ir20 ir20Var;
        List<ir20> listC;
        hr20 hr20VarC;
        ContactsWebView contactsWebView = this;
        String str2 = str;
        contactsWebView.f = i;
        if (contactsWebView.i.length() == 0) {
            Context context = contactsWebView.getContext();
            context.getClass();
            String str3 = context.getResources().getConfiguration().getLayoutDirection() == 1 ? "rtl" : "ltr";
            String hexString = Integer.toHexString(contactsWebView.e);
            hexString.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            String upperCase = hexString.toUpperCase(locale);
            upperCase.getClass();
            String strConcat = Separators.POUND.concat(upperCase.substring(2));
            String hexString2 = Integer.toHexString(contactsWebView.d);
            hexString2.getClass();
            String upperCase2 = hexString2.toUpperCase(locale);
            upperCase2.getClass();
            String strConcat2 = Separators.POUND.concat(upperCase2.substring(2));
            String hexString3 = Integer.toHexString(contactsWebView.b);
            hexString3.getClass();
            String upperCase3 = hexString3.toUpperCase(locale);
            upperCase3.getClass();
            String strConcat3 = Separators.POUND.concat(upperCase3.substring(2));
            StringBuffer stringBuffer = new StringBuffer("<style>");
            stringBuffer.append("@font-face {font-family:WebViewFont;src:url('file:///android_" + contactsWebView.h + "');}");
            StringBuilder sbT = dw9.t("body {padding:0;padding-bottom:", contactsWebView.f, "px;margin:0;font-family:WebViewFont;font-size:", "px;direction:", contactsWebView.g);
            sbT.append(str3);
            sbT.append(Separators.SEMICOLON);
            stringBuffer.append(sbT.toString());
            stringBuffer.append("max-width:100%;overflow-x:hidden;word-wrap:break-word;");
            stringBuffer.append(b1j.k("color:", strConcat, ";background:", strConcat3, "}"));
            stringBuffer.append("img {max-width: 60%;height: auto;}img {display: block;margin: 0 auto;margin-bottom: 50px;}");
            stringBuffer.append("a {color: " + strConcat + ";}");
            stringBuffer.append("a:link {color: " + strConcat2 + ";}");
            stringBuffer.append("a:visited {color: " + strConcat2 + ";}");
            stringBuffer.append("a:link {text-decoration: none;}a:visited {text-decoration: none;}</style>");
            String string = stringBuffer.toString();
            string.getClass();
            contactsWebView.i = string;
        }
        if (Intrinsics.d(contactsWebView.j, str2)) {
            return;
        }
        contactsWebView.j = str2;
        yk5 yk5Var2 = new yk5();
        er20 er20Var2 = new er20();
        String str4 = contactsWebView.j;
        str4.getClass();
        ar20 ar20Var2 = wb.m;
        ar20Var2.getClass();
        y78 y78Var = new y78((byte) 14);
        ArrayList arrayList = (ArrayList) y78Var.c;
        str4.getClass();
        s9d s9dVar = new s9d(y78Var, v9d.e);
        int i5 = y78Var.b;
        str4.getClass();
        gxu gxuVar = new gxu();
        gxuVar.f12096a = str4;
        ArrayList arrayList2 = new ArrayList();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int iU = StringsKt.U('\n', i7, 4, str4);
            i2 = -1;
            if (iU == -1) {
                break;
            }
            arrayList2.add(str4.subSequence(i7, iU));
            i7 = iU + 1;
            contactsWebView = contactsWebView;
            yk5Var2 = yk5Var2;
            er20Var2 = er20Var2;
            str2 = str2;
            i6 = 0;
        }
        arrayList2.add(str4.subSequence(i7, str4.length()));
        gxuVar.b = arrayList2;
        gxuVar.c = ((CharSequence) gxuVar.f12096a).length() > 0 ? new k810(gxuVar, i6, -1, -1).e(1) : null;
        k810 k810Var = (k810) gxuVar.c;
        while (true) {
            ArrayList arrayList3 = s9dVar.d;
            if (k810Var == null) {
                List listL0 = CollectionsKt.L0(arrayList3);
                y78Var.b = str4.length();
                s9dVar.a(-1, 3);
                arrayList.add(new sgi0(new IntRange(i5, y78Var.b, 1), ar20Var2));
                dgu dguVar = new dgu(str, new cr20(new e8r0(new dr20(er20Var2, str4), (byte) 13).p0(arrayList), listL0).f4822a, yk5Var2);
                new htw(dguVar, new tqt()).e0((j) dguVar.b);
                String strK = b1j.k("<html><head><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\">", this.i, "</head><body>", ((StringBuilder) dguVar.d).toString(), "</body></html>");
                siq fixedWebView = getBinding().b.getFixedWebView();
                if (fixedWebView != null) {
                    fixedWebView.loadDataWithBaseURL("", strK, "text/html", "UTF-8", "");
                    return;
                }
                return;
            }
            int i8 = k810Var.c;
            y78Var.b = i8;
            CharSequence charSequence = k810Var.d;
            int i9 = k810Var.b;
            if (i9 == i2) {
                yk5Var = yk5Var2;
                s9dVar.h = new mr20(s9dVar.b, s9dVar.e.b(k810Var), arrayList3);
            } else {
                yk5Var = yk5Var2;
                v9d v9dVar2 = s9dVar.h.b;
                v9dVar2.getClass();
                if (i9 == idx.x(v9dVar2, charSequence)) {
                    v9d v9dVar3 = s9dVar.h.b;
                    v9d v9dVarA = v9dVar3.a(k810Var, CollectionsKt.f0(arrayList3) instanceof co80);
                    if (v9dVarA == null) {
                        v9dVarA = s9dVar.h.b;
                    }
                    s9dVar.h = new mr20(v9dVar3, v9dVarA, arrayList3);
                }
            }
            if (i8 >= s9dVar.f) {
                int size = arrayList3.size();
                while (true) {
                    if (size <= 0) {
                        er20Var = er20Var2;
                        break;
                    }
                    size--;
                    if (size >= arrayList3.size()) {
                        er20Var = er20Var2;
                    } else {
                        ir20 ir20Var2 = (ir20) arrayList3.get(size);
                        v9d v9dVar4 = s9dVar.h.f22248a;
                        ir20Var2.getClass();
                        v9dVar4.getClass();
                        int i10 = ir20Var2.c;
                        er20Var = er20Var2;
                        if (i10 != i8 && ir20Var2.d != null) {
                            hr20VarC = hr20.e;
                        } else if (i10 == -1 || i10 > i8) {
                            hr20VarC = hr20.d;
                        } else if (i10 >= i8 || ir20Var2.f(k810Var)) {
                            hr20VarC = ir20Var2.d;
                            if (hr20VarC == null) {
                                hr20VarC = ir20Var2.c(v9dVar4, k810Var);
                            }
                        } else {
                            hr20VarC = hr20.d;
                        }
                        if (!Intrinsics.d(hr20VarC, hr20.d)) {
                            s9dVar.a(size, hr20VarC.f13510a);
                            int i11 = hr20VarC.b;
                            if (i11 == 0) {
                                throw null;
                            }
                            if (i11 == 3) {
                                i11 = 1;
                            }
                            w6x.a(i11, ir20Var2.b, ir20Var2.d());
                            if (i11 != 4) {
                                arrayList3.remove(size);
                                s9dVar.b();
                            }
                            if (hr20VarC.c == 2) {
                                break;
                            }
                        }
                        er20Var2 = er20Var;
                    }
                    er20Var2 = er20Var;
                }
                z = true;
            } else {
                er20Var = er20Var2;
                z = false;
            }
            v9d v9dVar5 = s9dVar.h.f22248a;
            v9dVar5.getClass();
            int iX2 = idx.x(v9dVar5, charSequence);
            y78 y78Var2 = s9dVar.f31847a;
            if (i9 == iX2 && ((ir20Var = (ir20) CollectionsKt.f0(arrayList3)) == null || ir20Var.a())) {
                if (i9 != -1) {
                    v9d v9dVar6 = s9dVar.h.f22248a;
                    v9dVar6.getClass();
                    if (i9 != idx.x(v9dVar6, charSequence)) {
                        throw new byw("");
                    }
                    Iterator it = s9dVar.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            if (i9 < idx.x(s9dVar.h.b, charSequence) || k810Var.a() == null) {
                                listC = iun.f15405a;
                                break;
                            } else {
                                listC = a.c(new co80(s9dVar.h.f22248a, new y78(y78Var2), s9dVar.g));
                                break;
                            }
                        }
                        List listA = ((jr20) it.next()).a(k810Var, y78Var2, s9dVar.h);
                        if (!listA.isEmpty()) {
                            listC = listA;
                            break;
                        }
                    }
                } else {
                    listC = s9dVar.c;
                }
                for (ir20 ir20Var3 : listC) {
                    ir20Var3.getClass();
                    arrayList3.add(ir20Var3);
                    s9dVar.b();
                    z = true;
                }
            } else {
                z = z;
            }
            if (z) {
                ir20 ir20Var4 = (ir20) CollectionsKt.f0(arrayList3);
                if (ir20Var4 == null) {
                    i3 = -1;
                    iC = k810Var.c();
                } else if (ir20Var4.d != null) {
                    iC = i8 + 1;
                    i3 = -1;
                } else {
                    int iB = ir20Var4.c;
                    i3 = -1;
                    if (iB != -1 && iB <= i8) {
                        iB = ir20Var4.b(k810Var);
                        ir20Var4.c = iB;
                    }
                    iC = iB;
                }
                if (iC == i3) {
                    iC = Integer.MAX_VALUE;
                }
                s9dVar.f = iC;
            } else {
                i3 = -1;
            }
            if (i9 != i3) {
                v9d v9dVar7 = s9dVar.h.f22248a;
                v9dVar7.getClass();
                if (i9 == idx.x(v9dVar7, charSequence)) {
                    iX = idx.x(s9dVar.h.b, charSequence) - i9;
                    if (iX > 0) {
                        i4 = -1;
                        if (i9 == -1) {
                            if (i9 != i4 && iX > 1) {
                                v9d v9dVar8 = s9dVar.h.b;
                                v9dVar8.getClass();
                                if (!(CollectionsKt.f0(arrayList3) instanceof co80) && tx3.v(v9dVar8.b, '>')) {
                                    ArrayList arrayList4 = new ArrayList();
                                    v9dVar8.d(charSequence, new bt40(arrayList4, i8 + 1, (byte) 2));
                                    ((ArrayList) y78Var2.c).addAll(arrayList4);
                                }
                            }
                        } else if (s9dVar.h.b.e() <= s9dVar.e.e()) {
                            v9dVar = s9dVar.h.b;
                            v9dVar.getClass();
                            if (v9dVar.e() == 0) {
                                int iMin = Math.min(idx.x(v9dVar, charSequence) + (i8 - i9), k810Var.c());
                                chQ = tx3.Q(v9dVar.b);
                                if (chQ != null && chQ.charValue() == '>') {
                                    ar20Var = cy2.z;
                                } else {
                                    ar20Var = ((chQ == null && chQ.charValue() == '.') || (chQ != null && chQ.charValue() == ')')) ? cy2.Z : cy2.W;
                                }
                                y78Var2.b(a.c(new sgi0(new IntRange(i8, iMin, 1), ar20Var)));
                            }
                        } else {
                            i4 = -1;
                            if (i9 != i4) {
                            }
                        }
                        k810VarE = k810Var.e(iX);
                    } else {
                        k810VarE = k810Var.e(s9dVar.f - i8);
                    }
                } else {
                    k810VarE = k810Var.e(s9dVar.f - i8);
                }
            } else {
                iX = idx.x(s9dVar.h.b, charSequence) - i9;
                if (iX > 0) {
                    i4 = -1;
                    if (i9 == -1) {
                        if (i9 != i4) {
                        }
                    } else if (s9dVar.h.b.e() <= s9dVar.e.e()) {
                        v9dVar = s9dVar.h.b;
                        v9dVar.getClass();
                        if (v9dVar.e() == 0) {
                            int iMin2 = Math.min(idx.x(v9dVar, charSequence) + (i8 - i9), k810Var.c());
                            chQ = tx3.Q(v9dVar.b);
                            if (chQ != null) {
                                ar20Var = cy2.z;
                            } else if (chQ == null) {
                            }
                            y78Var2.b(a.c(new sgi0(new IntRange(i8, iMin2, 1), ar20Var)));
                        }
                    } else {
                        i4 = -1;
                        if (i9 != i4) {
                        }
                    }
                    k810VarE = k810Var.e(iX);
                } else {
                    k810VarE = k810Var.e(s9dVar.f - i8);
                }
            }
            k810Var = k810VarE;
            yk5Var2 = yk5Var;
            er20Var2 = er20Var;
            i2 = -1;
        }
    }

    public final Function1<Uri, Unit> getOnHyperlinkClick() {
        return this.k;
    }

    public final Function0<Unit> getOnHyperlinkOpenFailed() {
        return this.l;
    }

    public final void setOnHyperlinkClick(Function1<? super Uri, Unit> function1) {
        function1.getClass();
        this.k = function1;
    }

    public final void setOnHyperlinkOpenFailed(Function0<Unit> function0) {
        function0.getClass();
        this.l = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContactsWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContactsWebView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
