package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.responsible_game.impl.presentation.limits.deposit_limit.gambling_exam.models.DepositLimitScreenParams;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.search_field.DsSearchField;

/* JADX INFO: loaded from: classes5.dex */
public final class jt6 implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17084a;
    public final Object b;

    public /* synthetic */ jt6(Object obj, byte b) {
        this.f17084a = b;
        this.b = obj;
    }

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
    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string;
        String string2;
        String string3;
        byte b = this.f17084a;
        String string4 = "";
        boolean z = false;
        z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                bj5 bj5Var = kt6.Q1;
                DsButton dsButton = ((kt6) obj).G0().b;
                if (editable != null && (string = editable.toString()) != null) {
                    z = !StringsKt.W(string);
                }
                dsButton.setEnabled(z);
                break;
            case 2:
                nwd nwdVar = xye.U1;
                x920 x920VarH0 = ((xye) obj).H0();
                String strValueOf = String.valueOf(editable);
                p7m0 p7m0Var = x920VarH0.C;
                p7m0Var.getClass();
                p7m0Var.o(null, strValueOf);
                break;
            case 4:
                org.xplatform.uikit.components.text_field.middle.b bVar = (org.xplatform.uikit.components.text_field.middle.b) obj;
                if (bVar.n) {
                    String string5 = bVar.getEditableText().toString();
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < string5.length(); i++) {
                        char cCharAt = string5.charAt(i);
                        if (!CharsKt.d(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    String string6 = sb.toString();
                    if (!Intrinsics.d(bVar.getEditableText().toString(), string6)) {
                        bVar.setText(string6);
                        bVar.setSelection(string6.length());
                    }
                }
                break;
            case 5:
                u8k u8kVar = (u8k) obj;
                String strValueOf2 = String.valueOf(editable);
                for (int i2 = 0; i2 < strValueOf2.length(); i2++) {
                    char cCharAt2 = strValueOf2.charAt(i2);
                    if (Character.isDigit(cCharAt2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((Object) string4);
                        sb2.append(cCharAt2);
                        string4 = sb2.toString();
                    }
                }
                if (!string4.equals(String.valueOf(editable))) {
                    kwd kwdVar = u8k.Q1;
                    u8kVar.G0().c.setText(string4);
                }
                Integer intOrNull = StringsKt.toIntOrNull(string4);
                int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
                kwd kwdVar2 = u8k.Q1;
                u8kVar.G0().b.setEnabled((string4.length() <= 0 || iIntValue == 0 || iIntValue == ((DepositLimitScreenParams) u8kVar.P1.n(u8kVar, u8k.R1[1])).b) ? false : true);
                break;
            case 7:
                Function1 function1 = (Function1) obj;
                if (editable != null && (string2 = editable.toString()) != null) {
                    string4 = string2;
                }
                function1.invoke(new ld50(string4));
                break;
            case 8:
                ((DsSearchField) obj).getTextInputLayout().setEndIconVisible(!(editable == null || editable.length() == 0));
                break;
            case 9:
                editable.getClass();
                vex vexVar = (vex) obj;
                if (!vexVar.e && !vex.b(editable) && !vexVar.h.a(editable)) {
                    vexVar.e = true;
                    if (editable.length() == 0) {
                        vexVar.d = "";
                        Function1 function2 = vexVar.i;
                        if (function2 != null) {
                            function2.invoke("");
                        }
                        vexVar.e = false;
                    } else {
                        if (vexVar.c()) {
                            Editable editableReplace = editable.replace(0, editable.length(), vexVar.d);
                            Selection.setSelection(editableReplace, vexVar.c);
                            Function1 function3 = vexVar.i;
                            if (function3 != null) {
                                function3.invoke(editableReplace.toString());
                            }
                        } else {
                            Function1 function4 = vexVar.i;
                            if (function4 != null) {
                                function4.invoke(editable.toString());
                            }
                        }
                        vexVar.e = false;
                    }
                    break;
                }
                break;
            case 11:
                editable.getClass();
                break;
            case 13:
                String strValueOf3 = String.valueOf(editable);
                nh70 nh70Var = h6c0.W1;
                p7m0 p7m0Var2 = ((h6c0) obj).I0().D;
                p7m0Var2.getClass();
                p7m0Var2.o(null, strValueOf3);
                break;
            case 14:
                jh70 jh70Var = idc0.S1;
                ((idc0) obj).M0().D(String.valueOf(editable));
                break;
            case 15:
                xi70 xi70Var = hnc0.R1;
                qnc0 qnc0Var = (qnc0) ((hnc0) obj).Q1.getValue();
                if (editable != null && (string3 = editable.toString()) != null) {
                    string4 = string3;
                }
                p7m0 p7m0Var3 = qnc0Var.j;
                p7m0Var3.getClass();
                p7m0Var3.o(null, string4);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.f17084a) {
            case 11:
                charSequence.getClass();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:191:0x03cd  */
    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CharSequence charSequenceSubSequence;
        Character chValueOf;
        String string;
        Object value;
        Object value2;
        odl0 odl0Var;
        boolean z;
        boolean z2;
        byte b = this.f17084a;
        int i4 = 0;
        boolean z3 = true;
        yje yjeVar = null;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                String strValueOf = String.valueOf(charSequence);
                e7e e7eVar = (e7e) obj;
                kwd kwdVar = e7e.d2;
                p7m0 p7m0Var = e7eVar.J0().C;
                p7m0Var.getClass();
                p7m0Var.o(null, strValueOf);
                fae faeVarJ0 = e7eVar.J0();
                if (StringsKt.u0(strValueOf).toString().length() != 0) {
                    bby bbyVar = faeVarJ0.R;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        faeVarJ0.R = sac.V(jiu0.a(faeVarJ0), new z6e(1, faeVarJ0, fae.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 11), null, null, new gc1(strValueOf, faeVarJ0, (yje) null), 14);
                    }
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                if (i != 0 || i2 != 0 || i3 != 0) {
                    nwd nwdVar = f7g.o2;
                    j7g j7gVarW0 = ((f7g) obj).W0();
                    String strValueOf2 = String.valueOf(charSequence);
                    p7m0 p7m0Var2 = j7gVarW0.m;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, strValueOf2);
                }
                break;
            case 4:
            case 5:
                break;
            case 6:
                if (i != 0 || i2 != 0 || i3 != 0) {
                    bek bekVar = cuk.l2;
                    guk gukVar = (guk) ((cuk) obj).g2.getValue();
                    String strValueOf3 = String.valueOf(charSequence);
                    e3c.n(gukVar.g);
                    gukVar.g = sac.V(jiu0.a(gukVar), fuk.f10167a, null, gukVar.d.f22085a, new b1f((Object) gukVar, (Object) strValueOf3, yjeVar, (byte) 28), 10);
                }
                break;
            case 7:
            case 8:
                break;
            case 9:
                vex vexVar = (vex) obj;
                tex texVar = (i2 <= 0 || i3 != 0) ? tex.f33843a : tex.b;
                if (!vexVar.e && vexVar.c() && charSequence != null && charSequence.length() != 0) {
                    if (texVar == tex.f33843a && (vex.b(charSequence) || vexVar.a(charSequence) || vexVar.h.a(charSequence))) {
                        if (vexVar.b.length() == 0) {
                            string = charSequence.toString();
                        } else {
                            String strR = kotlin.text.c.r(vexVar.b, Separators.POUND, "", false);
                            StringBuilder sb = new StringBuilder();
                            int length = charSequence.length();
                            for (int i5 = 0; i5 < length; i5++) {
                                char cCharAt = charSequence.charAt(i5);
                                if (Character.isDigit(cCharAt)) {
                                    sb.append(cCharAt);
                                }
                                for (int i6 = 0; i6 < strR.length(); i6++) {
                                    if (cCharAt == strR.charAt(i6)) {
                                        sb.append(cCharAt);
                                    }
                                    break;
                                }
                                break;
                            }
                            string = sb.toString();
                        }
                        if (Intrinsics.d(string, vexVar.d)) {
                        }
                    }
                    tex texVar2 = tex.f33843a;
                    if (texVar != texVar2 || vexVar.b.length() <= 0 || vexVar.d.length() != vexVar.b.length()) {
                        if (texVar == texVar2) {
                            StringBuilder sb2 = new StringBuilder();
                            int length2 = charSequence.length();
                            for (int i7 = 0; i7 < length2; i7++) {
                                char cCharAt2 = charSequence.charAt(i7);
                                if (Character.isDigit(cCharAt2)) {
                                    sb2.append(cCharAt2);
                                }
                            }
                            charSequenceSubSequence = sb2;
                            if (vexVar.f != 255) {
                                int length3 = sb2.length();
                                int i8 = vexVar.f;
                                charSequenceSubSequence = sb2;
                                if (length3 > i8) {
                                    if (i8 < 0) {
                                        c99.s(ua80.e(i8, "Requested character count ", " is less than zero."));
                                    } else {
                                        int length4 = sb2.length();
                                        if (i8 > length4) {
                                            i8 = length4;
                                        }
                                        charSequenceSubSequence = sb2.subSequence(length4 - i8, length4);
                                    }
                                }
                            }
                        } else {
                            charSequenceSubSequence = charSequence;
                        }
                        charSequenceSubSequence.getClass();
                        stm0 stm0Var = new stm0(charSequenceSubSequence);
                        StringBuilder sb3 = new StringBuilder();
                        if (vexVar.b.length() > 0) {
                            Character chD = vex.d(stm0Var);
                            String str = vexVar.b;
                            int length5 = str.length();
                            for (int i9 = 0; i9 < length5; i9++) {
                                char cCharAt3 = str.charAt(i9);
                                if (chD != null && cCharAt3 == chD.charValue() && cCharAt3 != '#') {
                                    sb3.append(cCharAt3);
                                    chD = vex.d(stm0Var);
                                } else if (cCharAt3 == '#') {
                                    if (chD != null) {
                                        char cCharValue = chD.charValue();
                                        while (stm0Var.hasNext() && !Character.isDigit(cCharValue)) {
                                            cCharValue = stm0Var.a();
                                        }
                                        if (Character.isDigit(cCharValue)) {
                                            chValueOf = Character.valueOf(cCharValue);
                                        } else {
                                            chValueOf = null;
                                        }
                                    } else {
                                        chValueOf = null;
                                    }
                                    if (chValueOf != null) {
                                        sb3.append(chValueOf.charValue());
                                        chD = vex.d(stm0Var);
                                    }
                                } else if (chD != null || texVar != tex.b) {
                                    sb3.append(cCharAt3);
                                }
                            }
                        } else {
                            sb3.append(vex.d(stm0Var));
                            while (stm0Var.hasNext()) {
                                sb3.append(stm0Var.a());
                            }
                        }
                        String string2 = sb3.toString();
                        if (vexVar.b.length() > 0 && kotlin.text.c.x(vexVar.b, string2, false)) {
                            sb3.setLength(0);
                            string2 = sb3.toString();
                        }
                        vexVar.d = string2;
                        if (string2.length() == 0) {
                            vexVar.c = 0;
                        } else if (texVar == tex.f33843a && Math.abs(vexVar.d.length() - charSequence.length()) > 1) {
                            vexVar.c = vexVar.d.length();
                        } else if (texVar == tex.b) {
                            vexVar.c = Selection.getSelectionStart(charSequence);
                        } else {
                            int selectionStart = Selection.getSelectionStart(charSequence);
                            int length6 = vexVar.d.length();
                            int iU = StringsKt.U('#', selectionStart, 4, vexVar.b);
                            Character chI = ttm0.I(selectionStart, charSequence);
                            Character chI2 = ttm0.I(iU, vexVar.d);
                            if (!Intrinsics.d(chI, chI2) && (chI2 == null || chI2.charValue() != '#')) {
                                iU++;
                            }
                            vexVar.c = l1e0.d(iU, Math.min(selectionStart, length6), Math.max(selectionStart, length6));
                        }
                    }
                    break;
                }
                break;
            case 10:
                if (i != 0 || i2 != 0 || i3 != 0) {
                    ((ynk) obj).invoke(String.valueOf(charSequence));
                }
                break;
            case 11:
                try {
                    ((ydr) obj).j(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
                } catch (Exception e) {
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        cause.printStackTrace();
                        return;
                    }
                    return;
                }
                break;
            case 12:
                if (i != 0 || i2 != 0 || i3 != 0) {
                    fl70 fl70Var = zo90.p2;
                    es90 es90VarW0 = ((zo90) obj).W0();
                    String strValueOf4 = String.valueOf(charSequence);
                    g090 g090Var = es90VarW0.i;
                    g090Var.getClass();
                    p7m0 p7m0Var3 = (p7m0) g090Var.b;
                    do {
                        value = p7m0Var3.getValue();
                    } while (!p7m0Var3.m(value, cr90.a((cr90) value, null, strValueOf4, null, false, null, null, Response.SERVICE_UNAVAILABLE)));
                    ((vzg0) g090Var.f10448a).e("KEY_SEARCH_VALUE", strValueOf4);
                }
                break;
            case 13:
            case 14:
            case 15:
                break;
            case 16:
                androidx.appcompat.widget.d dVar = (androidx.appcompat.widget.d) obj;
                Editable text = dVar.p.getText();
                dVar.A1 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                dVar.v(!zIsEmpty);
                if (dVar.y1 && !dVar.r1 && zIsEmpty) {
                    dVar.u.setVisibility(8);
                } else {
                    i4 = 8;
                }
                dVar.w.setVisibility(i4);
                dVar.r();
                dVar.u();
                if (dVar.n1 != null && !TextUtils.equals(charSequence, dVar.z1)) {
                    dVar.n1.onQueryTextChange(charSequence.toString());
                }
                dVar.z1 = charSequence.toString();
                break;
            case 17:
                if (charSequence != null) {
                    cge0 cge0Var = ddl0.V1;
                    ndl0 ndl0VarJ0 = ((ddl0) obj).J0();
                    String string3 = charSequence.toString();
                    boolean z4 = charSequence.length() >= 3;
                    string3.getClass();
                    p7m0 p7m0Var4 = ndl0VarJ0.n;
                    if (((odl0) p7m0Var4.getValue()).f && !((odl0) p7m0Var4.getValue()).h.equals(string3)) {
                        int i10 = 10;
                        if (z4) {
                            while (true) {
                                Object value3 = p7m0Var4.getValue();
                                odl0 odl0Var2 = (odl0) value3;
                                List list = odl0Var2.i;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj2 : list) {
                                    if (StringsKt.O(((cok0) obj2).b, string3, z3)) {
                                        arrayList.add(obj2);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, i10));
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(Long.valueOf(((cok0) it.next()).f4705a));
                                }
                                if (arrayList2.isEmpty()) {
                                    z2 = false;
                                } else {
                                    Iterator it2 = arrayList2.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            z2 = false;
                                        } else if (odl0Var2.k.contains(Long.valueOf(((Number) it2.next()).longValue()))) {
                                            z2 = z3;
                                        }
                                    }
                                }
                                boolean z5 = (!arrayList.isEmpty() || z2) ? z3 : false;
                                int i11 = i10;
                                if (!p7m0Var4.m(value3, odl0.a(odl0Var2, false, false, false, z5, true, arrayList.isEmpty(), string3, null, arrayList, null, null, g2v.d(ndl0VarJ0.e, pb10.e, null, null, R.string.nothing_found, 0, null, 478), 11535))) {
                                    i10 = i11;
                                    z3 = true;
                                } else if (((odl0) p7m0Var4.getValue()).h.length() > 0) {
                                    z220 z220Var = ndl0VarJ0.j;
                                    String str2 = ((odl0) p7m0Var4.getValue()).h;
                                    z220Var.getClass();
                                    yo4 yo4Var = (yo4) z220Var.b;
                                    wgh0 wgh0Var = wgh0.MY_AGGREGATOR;
                                    yo4Var.n("sports", str2);
                                    ((zr1) z220Var.c).r("sports", str2);
                                }
                                break;
                            }
                        } else {
                            do {
                                value2 = p7m0Var4.getValue();
                                odl0Var = (odl0) value2;
                                List list2 = odl0Var.i;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(Long.valueOf(((cok0) it3.next()).f4705a));
                                }
                                if (arrayList3.isEmpty()) {
                                    z = false;
                                } else {
                                    Iterator it4 = arrayList3.iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            z = false;
                                        } else if (odl0Var.k.contains(Long.valueOf(((Number) it4.next()).longValue()))) {
                                            z = true;
                                        }
                                    }
                                }
                            } while (!p7m0Var4.m(value2, odl0.a(odl0Var, false, false, false, z, true, false, "", null, odl0Var.i, null, null, null, 15631)));
                        }
                    }
                }
                break;
            default:
                if (i != 0 || i2 != 0 || i3 != 0) {
                    y2m0 y2m0Var = hvm0.j2;
                    jvm0 jvm0Var = (jvm0) ((hvm0) obj).g2.getValue();
                    String strValueOf5 = String.valueOf(charSequence);
                    p7m0 p7m0Var5 = jvm0Var.c;
                    p7m0Var5.getClass();
                    p7m0Var5.o(null, strValueOf5);
                }
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(Editable editable) {
    }

    private final void e(Editable editable) {
    }

    private final void f(Editable editable) {
    }

    private final void g(Editable editable) {
    }

    private final void h(Editable editable) {
    }

    private final void A(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void B(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void C(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void D(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void E(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void F(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void G(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void H(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void I(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void n(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void o(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void p(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void q(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void r(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void s(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void t(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void u(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void v(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void w(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void x(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void y(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void z(int i, int i2, int i3, CharSequence charSequence) {
    }
}
