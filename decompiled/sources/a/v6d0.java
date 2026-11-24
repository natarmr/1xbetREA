package a;

import android.gov.nist.core.Separators;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.scrollable_table.table_view.TableViewImpl;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class v6d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36872a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v6d0(Object obj, byte b) {
        this.f36872a = b;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v15 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        List list;
        boolean z;
        Object value;
        Object value2;
        char c;
        String str3;
        String str4;
        String strC;
        byte b = 26;
        byte b2 = 24;
        byte b3 = 11;
        Throwable th = null;
        int i = 0;
        byte b4 = 1;
        switch (this.f36872a) {
            case 0:
                k7d0 k7d0Var = (k7d0) this.b;
                rl rlVar = (rl) obj;
                rlVar.getClass();
                ((q99) k7d0Var.e.e).f(new fmf0(rlVar));
                return Unit.f46060a;
            case 1:
                ((xw3) ((pzu) this.b).f).addLast(obj);
                return Unit.f46060a;
            case 2:
                ilq ilqVar = (ilq) this.b;
                abi0 abi0Var = (abi0) obj;
                if (ilqVar.invoke() > 0.0f) {
                    yai0.d(abi0Var, new g3c0(ilqVar.invoke(), new cvc(0.0f, 1.0f)));
                }
                return Unit.f46060a;
            case 3:
                bed0 bed0Var = (bed0) this.b;
                fl70 fl70Var = bed0.U1;
                ((View) obj).getClass();
                ned0 ned0VarH0 = bed0Var.H0();
                i1w0 i1w0Var = ned0VarH0.x;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new a1w0(new p7d0(ned0VarH0, (byte) 3))), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 4:
                gfd0 gfd0Var = (gfd0) this.b;
                mi70 mi70Var = gfd0.S1;
                ((View) obj).getClass();
                ii iiVarG0 = gfd0Var.G0();
                String strH = gfd0Var.H(R.string.consultant);
                String strH2 = gfd0Var.H(R.string.consultant_chat_with_operator_dialog_message);
                String strH3 = gfd0Var.H(R.string.consultant_chat_with_operator_dialog_positive_text);
                strH3.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, gfd0Var.H(R.string.cancel), (String) null, "REQUEST_CONSULTANT_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC = gfd0Var.C();
                eVarC.getClass();
                iiVarG0.d(dialogFields, eVarC);
                return Unit.f46060a;
            case 5:
                jgd0 jgd0Var = (jgd0) this.b;
                xi70 xi70Var = jgd0.V1;
                ((View) obj).getClass();
                ii iiVarG1 = jgd0Var.G0();
                String strH4 = jgd0Var.H(R.string.consultant);
                String strH5 = jgd0Var.H(R.string.consultant_chat_with_operator_dialog_message);
                String strH6 = jgd0Var.H(R.string.consultant_chat_with_operator_dialog_positive_text);
                strH6.getClass();
                DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, jgd0Var.H(R.string.cancel), (String) null, "REQUEST_CONSULTANT_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC2 = jgd0Var.C();
                eVarC2.getClass();
                iiVarG1.d(dialogFields2, eVarC2);
                return Unit.f46060a;
            case 6:
                jid0 jid0Var = (jid0) this.b;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ctf0 ctf0Var = jid0Var.b;
                jid0Var.y(new bid0(false));
                if (th2 instanceof bfd0) {
                    String str5 = ((bfd0) th2).g;
                    String strA = str5.length() > 0 ? str5 : null;
                    if (strA == null) {
                        strA = ctf0Var.b.a(R.string.transfer_friend_wrong_code, Arrays.copyOf(new Object[0], 0));
                    }
                    jid0Var.y(new gid0(strA));
                } else if (th2 instanceof afd0) {
                    String str6 = ((afd0) th2).g;
                    String strA2 = str6.length() > 0 ? str6 : null;
                    if (strA2 == null) {
                        strA2 = ctf0Var.b.a(R.string.expired_time_connection, Arrays.copyOf(new Object[0], 0));
                    }
                    jid0Var.y(new eid0(strA2));
                } else {
                    jid0Var.y(cid0.f4408a);
                }
                return Unit.f46060a;
            case 7:
                jba jbaVar = (jba) this.b;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = jbaVar.f16229a;
                hczVar.f(a4xVar.size(), null, new zu90(b2, new ljc0(b), a4xVar), new ugd(802480018, true, new xe4(a4xVar, jbaVar, (byte) 13)));
                return Unit.f46060a;
            case 8:
                sld0 sld0Var = (sld0) this.b;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                ol60 ol60Var = sld0Var.k;
                Unit unit = Unit.f46060a;
                ol60Var.f(unit);
                return unit;
            case 9:
                snd0 snd0Var = (snd0) this.b;
                Editable editable = (Editable) obj;
                rl70 rl70Var = snd0.n2;
                editable.getClass();
                DsPresetTextFieldBasic dsPresetTextFieldBasic = snd0Var.Q0().c;
                String string = editable.toString();
                if (wvb.O(string) == 0.0d) {
                    dsPresetTextFieldBasic.setSelection(dsPresetTextFieldBasic.getText().length());
                }
                qnd0 qnd0Var = (qnd0) snd0Var.m2.getValue();
                ctf0 ctf0Var2 = qnd0Var.j;
                String strC2 = "";
                p7m0 p7m0Var = qnd0Var.m;
                double dO = wvb.O(string);
                double d = qnd0Var.o;
                ol60 ol60Var2 = qnd0Var.n;
                if (dO < d) {
                    Object value3 = p7m0Var.getValue();
                    nrn nrnVar = value3 instanceof nrn ? (nrn) value3 : null;
                    if (nrnVar == null || (str2 = nrnVar.g) == null) {
                        str2 = "";
                    }
                    ol60Var2.f(new jrn(k9x.E(ctf0Var2, d, str2)));
                } else {
                    Object value4 = p7m0Var.getValue();
                    nrn nrnVar2 = value4 instanceof nrn ? (nrn) value4 : null;
                    if (nrnVar2 == null || (str = nrnVar2.g) == null) {
                        str = "";
                    }
                    ol60Var2.f(new krn(k9x.E(ctf0Var2, d, str)));
                }
                Object value5 = p7m0Var.getValue();
                nrn nrnVar3 = value5 instanceof nrn ? (nrn) value5 : null;
                if (nrnVar3 != null) {
                    Double dI = kotlin.text.b.i(string);
                    double dDoubleValue = dI != null ? dI.doubleValue() : 0.0d;
                    boolean z2 = dDoubleValue >= qnd0Var.o && dDoubleValue != nrnVar3.f24010a;
                    if (string.length() != 0) {
                        pn40 pn40Var = pn40.f27267a;
                        strC2 = pn40.c(dDoubleValue, p3u0.c);
                    }
                    p7m0Var.o(null, nrn.a(nrnVar3, dDoubleValue, strC2, z2));
                }
                return Unit.f46060a;
            case 10:
                qrd0 qrd0Var = (qrd0) this.b;
                TableViewImpl tableViewImpl = (TableViewImpl) obj;
                tableViewImpl.getClass();
                k5 adapter = tableViewImpl.getAdapter();
                jsd0 jsd0Var = adapter instanceof jsd0 ? (jsd0) adapter : null;
                if (jsd0Var != null) {
                    jsd0Var.q(qrd0Var.b, qrd0Var.c, qrd0Var.f29205a, qrd0Var.d);
                }
                tableViewImpl.b(false, true);
                tableViewImpl.getColumnHeaderRecyclerView().y0(0);
                tableViewImpl.getRowHeaderRecyclerView().y0(0);
                tableViewImpl.getCellRecyclerView().y0(0);
                return Unit.f46060a;
            case 11:
                esd0 esd0Var = (esd0) this.b;
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                esd0Var.p.b(th4, new nrc0(esd0Var, b3));
                return Unit.f46060a;
            case 12:
                qud0 qud0Var = (qud0) this.b;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar2 = qud0Var.b;
                byte b5 = 25;
                hczVar2.f(a4xVar2.size(), new zu90(b5, new bod0((byte) 5), a4xVar2), new zu90(b, new bod0((byte) 6), a4xVar2), new ugd(802480018, true, new xy1(a4xVar2, b5)));
                return Unit.f46060a;
            case 13:
                g0e0 g0e0Var = (g0e0) this.b;
                long jLongValue = ((Long) obj).longValue();
                u0e0[] u0e0VarArr = u0e0.f34850a;
                return Boolean.valueOf(jLongValue != 2 ? !(jLongValue != 1 || (g0e0Var.g.f33020a.e.isEmpty() && g0e0Var.g.b.e.isEmpty())) : !(g0e0Var.g.f33020a.f.isEmpty() && g0e0Var.g.b.f.isEmpty()));
            case 14:
                bvd0 bvd0Var = (bvd0) this.b;
                long jLongValue2 = ((Long) obj).longValue();
                u0e0[] u0e0VarArr2 = u0e0.f34850a;
                if (jLongValue2 == 6) {
                    z = !bvd0Var.c.c.isEmpty();
                } else if (jLongValue2 == 5 && ((list = bvd0Var.f3275a.i) == null || !list.isEmpty())) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            wud0 wud0Var = (wud0) it.next();
                            if (wud0Var.f39788a != -1 && wud0Var.b.length() > 0) {
                                List list2 = bvd0Var.b.i;
                                if (list2 == null || !list2.isEmpty()) {
                                    Iterator it2 = list2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            wud0 wud0Var2 = (wud0) it2.next();
                                            if (wud0Var2.f39788a == -1 || wud0Var2.b.length() <= 0) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 15:
                d1e0 d1e0Var = (d1e0) this.b;
                xus xusVar = (xus) obj;
                xusVar.getClass();
                p7m0 p7m0Var2 = d1e0Var.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    d1e0Var.f.getClass();
                } while (!p7m0Var2.m(value, qyd0.a((qyd0) value, null, null, null, null, null, xusVar, false, null, null, null, false, null, false, false, null, null, 134217663)));
                return Unit.f46060a;
            case 16:
                l4e0 l4e0Var = (l4e0) this.b;
                hcz hczVar3 = (hcz) obj;
                fl70 fl70Var2 = l4e0.n2;
                hczVar3.getClass();
                List listN = l4e0Var.l2.n(l4e0Var, l4e0.o2[1]);
                hczVar3.f(listN.size(), new zu90((byte) 27, new ksc0((byte) 23), listN), new d1c0(listN, (byte) 10), new ugd(2039820996, true, new xe4(listN, l4e0Var, (byte) 14)));
                return Unit.f46060a;
            case 17:
                w4e0 w4e0Var = (w4e0) this.b;
                i3e0 i3e0Var = (i3e0) obj;
                rl70 rl70Var2 = w4e0.O1;
                i3e0Var.getClass();
                ((k3t0) w4e0Var.M1.getValue()).x(i3e0Var);
                return Unit.f46060a;
            case 18:
                x8e0 x8e0Var = (x8e0) this.b;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var3 = x8e0Var.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                    x8e0Var.f.getClass();
                } while (!p7m0Var3.m(value2, l8e0.a((l8e0) value2, false, false, null, null, null, null, 0, false, false, 1023)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String str7 = "ufcStatistic/v1/image/";
                lea0 lea0Var = (lea0) this.b;
                List list3 = (List) obj;
                list3.getClass();
                ctf0 ctf0Var3 = lea0Var.c;
                ctf0Var3.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    wlc wlcVar = (wlc) obj2;
                    if (wlcVar.f39347a != f7v0.f9077a && wlcVar.c.c.length() > 0) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                int i2 = 0;
                for (Object obj3 : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        Throwable th5 = th;
                        q3d.p();
                        throw th5;
                    }
                    wlc wlcVar2 = (wlc) obj3;
                    String strValueOf = String.valueOf(i2);
                    StringBuilder sb = new StringBuilder(ujn.h);
                    fwp fwpVar = wlcVar2.c;
                    Throwable th6 = th;
                    f7v0 f7v0Var = wlcVar2.f39347a;
                    String strConcat = str7.concat(fwpVar.g);
                    if (strConcat.length() == 0) {
                        sb.setLength(i);
                        c = '/';
                    } else if (StringsKt.O(strConcat, ujn.h, i) || kotlin.text.c.x(strConcat, "https://", i)) {
                        c = '/';
                        sb.setLength(i);
                        sb.append(strConcat);
                    } else {
                        if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                            sb.append('/');
                        }
                        c = '/';
                        char[] cArr = new char[1];
                        cArr[i] = '/';
                        sb.append(StringsKt.y0(strConcat, cArr));
                    }
                    n0x n0xVar = new n0x(sb.toString());
                    String strR = tnq0.r(f7v0Var, ctf0Var3);
                    String str8 = wlcVar2.c.c;
                    String strA3 = ctf0Var3.b.a(R.string.champion, Arrays.copyOf(new Object[i], i));
                    List<fwp> list4 = wlcVar2.d;
                    ArrayList arrayList3 = new ArrayList(r3d.q(list4, 10));
                    for (fwp fwpVar2 : list4) {
                        ctf0 ctf0Var4 = ctf0Var3;
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        String strConcat2 = str7.concat(fwpVar2.g);
                        if (strConcat2.length() == 0) {
                            sb2.setLength(0);
                            str3 = str7;
                        } else {
                            str3 = str7;
                            int i4 = 0;
                            if (StringsKt.O(strConcat2, ujn.h, false)) {
                                sb2.setLength(i4);
                                sb2.append(strConcat2);
                            } else if (kotlin.text.c.x(strConcat2, "https://", false)) {
                                i4 = 0;
                                sb2.setLength(i4);
                                sb2.append(strConcat2);
                            } else {
                                if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                                    sb2.append(c);
                                }
                                sb2.append(StringsKt.y0(strConcat2, c));
                            }
                        }
                        arrayList3.add(new n0x(sb2.toString()));
                        ctf0Var3 = ctf0Var4;
                        str7 = str3;
                    }
                    arrayList2.add(new c6e0(strValueOf, new goh(new eoh(0L, n0xVar, strR, str8, strA3, dyb.o0(arrayList3), f7v0Var))));
                    ctf0Var3 = ctf0Var3;
                    i2 = i3;
                    th = th6;
                    str7 = str7;
                    i = 0;
                }
                return dyb.o0(arrayList2);
            case 20:
                xbe0 xbe0Var = (xbe0) this.b;
                iiy[] iiyVarArr = xbe0.Q1;
                ((View) obj).getClass();
                ii iiVar = xbe0Var.L1;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH7 = xbe0Var.H(R.string.caution);
                String strH8 = xbe0Var.H(R.string.timeout_dialog_message);
                strH8.getClass();
                Spanned spannedFromHtml = Html.fromHtml(strH8, 0);
                spannedFromHtml.getClass();
                SpannableString spannableString = new SpannableString(spannedFromHtml);
                String strH9 = xbe0Var.H(R.string.yes);
                strH9.getClass();
                DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) spannableString, (CharSequence) strH9, xbe0Var.H(R.string.no), (String) null, "SET_LIMIT_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC3 = xbe0Var.C();
                eVarC3.getClass();
                iiVar.d(dialogFields3, eVarC3);
                return Unit.f46060a;
            case 21:
                c69 c69Var = (c69) this.b;
                n0o0 n0o0Var = c69Var.i;
                if (!((Boolean) obj).booleanValue()) {
                    return ree0.f30331a;
                }
                fee feeVar = (fee) c69Var.g.getValue();
                ctf0 ctf0Var5 = (ctf0) c69Var.n;
                ql5 ql5Var = (ql5) feeVar.c();
                if (ql5Var != null) {
                    String strA4 = ql5Var.j;
                    if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                        strA4 = ctf0Var5.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                    } else if (strA4.length() <= 0) {
                        strA4 = ql5Var.k;
                    }
                    str4 = strA4;
                } else {
                    str4 = "";
                }
                if (ql5Var != null) {
                    double d2 = ql5Var.b;
                    pn40 pn40Var2 = pn40.f27267a;
                    strC = pn40.c(d2, p3u0.c);
                } else {
                    strC = null;
                }
                String str9 = strC == null ? "" : strC;
                String str10 = ql5Var != null ? ql5Var.f : null;
                String str11 = str10 == null ? "" : str10;
                String strA5 = ctf0Var5.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                pz40 pz40Var = s6t0.f31722a;
                return new qee0((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(str9, str11, strA5, str4, new y3d(s6t0.b().f33626a.getBackgroundContent())));
            case 22:
                ((tld) this.b).f(obj);
                return Unit.f46060a;
            case 23:
                fge0 fge0Var = (fge0) this.b;
                Throwable th7 = (Throwable) obj;
                CancellationException cancellationExceptionB = plc.b("Recomposer effect job completed", th7);
                synchronized (fge0Var.c) {
                    try {
                        bby bbyVar = fge0Var.d;
                        if (bbyVar != null) {
                            p7m0 p7m0Var4 = fge0Var.u;
                            dge0 dge0Var = dge0.b;
                            p7m0Var4.getClass();
                            p7m0Var4.o(null, dge0Var);
                            bbyVar.cancel(cancellationExceptionB);
                            fge0Var.r = null;
                            bbyVar.invokeOnCompletion(new oac0(fge0Var, th7, b2));
                        } else {
                            fge0Var.e = cancellationExceptionB;
                            p7m0 p7m0Var5 = fge0Var.u;
                            dge0 dge0Var2 = dge0.f6038a;
                            p7m0Var5.getClass();
                            p7m0Var5.o(null, dge0Var2);
                        }
                    } catch (Throwable th8) {
                        throw th8;
                    }
                }
                return Unit.f46060a;
            case 24:
                ((hge0) this.b).a((vjn) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fje0 fje0Var = (fje0) this.b;
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                a4x a4xVar3 = fje0Var.f9637a;
                hczVar4.f(a4xVar3.size(), null, new d1c0(a4xVar3, b3), new ugd(802480018, true, new xe4(a4xVar3, fje0Var, (byte) 15)));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                kje0 kje0Var = (kje0) this.b;
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                kje0Var.o.b(th9, new nrc0(kje0Var, (byte) 29));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                kke0 kke0Var = (kke0) this.b;
                TableViewImpl tableViewImpl2 = (TableViewImpl) obj;
                tableViewImpl2.getClass();
                k5 adapter2 = tableViewImpl2.getAdapter();
                jke0 jke0Var = adapter2 instanceof jke0 ? (jke0) adapter2 : null;
                if (jke0Var != null) {
                    jke0Var.q(kke0Var.b, kke0Var.c, kke0Var.f18434a, kke0Var.d);
                }
                tableViewImpl2.b(false, true);
                tableViewImpl2.getColumnHeaderRecyclerView().y0(0);
                tableViewImpl2.getRowHeaderRecyclerView().y0(0);
                tableViewImpl2.getCellRecyclerView().y0(0);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                qke0 qke0Var = (qke0) this.b;
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                qke0Var.r.b(th10, new dke0(qke0Var, b4));
                return Unit.f46060a;
            default:
                ame0 ame0Var = (ame0) this.b;
                TableViewImpl tableViewImpl3 = (TableViewImpl) obj;
                tableViewImpl3.getClass();
                k5 adapter3 = tableViewImpl3.getAdapter();
                zle0 zle0Var = adapter3 instanceof zle0 ? (zle0) adapter3 : null;
                if (zle0Var != null) {
                    zle0Var.q(ame0Var.c, ame0Var.b, ame0Var.f1103a, ame0Var.d);
                }
                tableViewImpl3.b(false, true);
                tableViewImpl3.getColumnHeaderRecyclerView().y0(0);
                tableViewImpl3.getRowHeaderRecyclerView().y0(0);
                tableViewImpl3.getCellRecyclerView().y0(0);
                return Unit.f46060a;
        }
    }
}
