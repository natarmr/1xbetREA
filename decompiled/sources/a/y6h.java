package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.personal.impl.presentation.documentchoice.models.PersonalDocumentRedesignUiModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y6h extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42096a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6h(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f42096a = b;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:92:0x0292  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        p7m0 p7m0Var;
        Object value;
        List listL0;
        boolean z;
        p7m0 p7m0Var2;
        Object value2;
        List listL1;
        boolean z2;
        int i = -1;
        byte b = 2;
        byte b2 = 0;
        byte b3 = 1;
        yje yjeVar = null;
        switch (this.f42096a) {
            case 0:
                n6h n6hVar = (n6h) obj;
                n6hVar.getClass();
                ((k3t0) this.receiver).x(n6hVar);
                return Unit.f46060a;
            case 1:
                n6h n6hVar2 = (n6h) obj;
                n6hVar2.getClass();
                ((k3t0) this.receiver).x(n6hVar2);
                return Unit.f46060a;
            case 2:
                juh juhVar = (juh) obj;
                juhVar.getClass();
                ((k3t0) this.receiver).x(juhVar);
                return Unit.f46060a;
            case 3:
                uvh uvhVar = (uvh) obj;
                uvhVar.getClass();
                ((k3t0) this.receiver).x(uvhVar);
                return Unit.f46060a;
            case 4:
                ixh ixhVar = (ixh) obj;
                ixhVar.getClass();
                ((k3t0) this.receiver).x(ixhVar);
                return Unit.f46060a;
            case 5:
                y0j y0jVar = (y0j) obj;
                y0jVar.getClass();
                v0j v0jVar = (v0j) this.receiver;
                nwd nwdVar = v0j.p2;
                v0jVar.getClass();
                if (y0jVar instanceof x0j) {
                    r34 r34Var = v0jVar.m2;
                    iiy[] iiyVarArr = v0j.q2;
                    vcc.f0(i120.V(new Pair("BUNDLE_PRODUCT_ID_KEY", r34Var.n(v0jVar, iiyVarArr[2])), new Pair("BUNDLE_TASK_KIND_ID_KEY", v0jVar.k2.n(v0jVar, iiyVarArr[0])), new Pair("BUNDLE_PROGRESS_KEY", v0jVar.l2.n(v0jVar, iiyVarArr[1]))), v0jVar, "REQUEST_CLOSE_MORE_INFO_DIALOG_KEY");
                    v0jVar.y0();
                } else {
                    if (!(y0jVar instanceof w0j)) {
                        t9f.b();
                        return null;
                    }
                    v0jVar.y0();
                }
                v0jVar.P0().x(p0j.f26153a);
                return Unit.f46060a;
            case 6:
                a2j a2jVar = (a2j) obj;
                a2jVar.getClass();
                q1j q1jVar = (q1j) this.receiver;
                int i2 = q1j.n2;
                q1jVar.getClass();
                if (a2jVar instanceof y1j) {
                    q1jVar.y0();
                } else {
                    if (!(a2jVar instanceof z1j)) {
                        t9f.b();
                        return null;
                    }
                    String str = ((z1j) a2jVar).f43623a;
                    wdk0 wdk0Var = q1jVar.k2;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, str, null, null, null, null, 124), q1jVar, null, null, false, null, 1020);
                    q1jVar.y0();
                }
                q1jVar.P0().x(h1j.f12285a);
                return Unit.f46060a;
            case 7:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((j2j) this.receiver).A(th);
                return Unit.f46060a;
            case 8:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((j2j) this.receiver).A(th2);
                return Unit.f46060a;
            case 9:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((j2j) this.receiver).A(th3);
                return Unit.f46060a;
            case 10:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((j2j) this.receiver).A(th4);
                return Unit.f46060a;
            case 11:
                v5j v5jVar = (v5j) obj;
                v5jVar.getClass();
                j4j j4jVar = (j4j) this.receiver;
                kud kudVar = j4j.R1;
                j4jVar.getClass();
                if (v5jVar instanceof s5j) {
                    kxq kxqVarB = j4jVar.B();
                    if (kxqVarB != null) {
                        ii iiVar = j4jVar.O1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String string = kxqVarB.getString(R.string.attention);
                        String string2 = kxqVarB.getString(R.string.casino_guard_notify_description);
                        String string3 = kxqVarB.getString(R.string.ok);
                        string3.getClass();
                        iiVar.d(new DialogFields((CharSequence) string, (CharSequence) string2, (CharSequence) string3, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB.r());
                    }
                } else if (v5jVar instanceof t5j) {
                    t5j t5jVar = (t5j) v5jVar;
                    nwd nwdVar2 = v0j.p2;
                    androidx.fragment.app.e eVarC = j4jVar.C();
                    eVarC.getClass();
                    byte b4 = t5jVar.f33371a.f31923a;
                    long j = t5jVar.b;
                    int i3 = t5jVar.c;
                    nwdVar2.getClass();
                    if (eVarC.J("DailyTaskMoreInfoBottomSheetDialog") == null) {
                        v0j v0jVar2 = new v0j();
                        iiy[] iiyVarArr2 = v0j.q2;
                        v0jVar2.k2.I(v0jVar2, iiyVarArr2[0], b4);
                        v0jVar2.m2.j(v0jVar2, iiyVarArr2[2], j);
                        v0jVar2.l2.I(v0jVar2, iiyVarArr2[1], i3);
                        v0jVar2.H0(eVarC, "DailyTaskMoreInfoBottomSheetDialog");
                    }
                } else if (v5jVar instanceof u5j) {
                    u5j u5jVar = (u5j) v5jVar;
                    wdk0 wdk0Var2 = j4jVar.N1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, new xdk0(rek0.b, u5jVar.f35097a, null, null, null, null, 124), j4jVar, null, null, false, null, 1020);
                } else {
                    if (!(v5jVar instanceof r5j)) {
                        t9f.b();
                        return null;
                    }
                    j4jVar.F().t0(i120.V(new Pair("DAILY_TASKS_SWITCH_TAB", ((r5j) v5jVar).f29888a)), "DAILY_TASKS_SWITCH_TAB_REQUEST");
                }
                j4jVar.G0().x(m3j.f21117a);
                return Unit.f46060a;
            case 12:
                z3j z3jVar = (z3j) obj;
                z3jVar.getClass();
                ((k3t0) this.receiver).x(z3jVar);
                return Unit.f46060a;
            case 13:
                f5j f5jVar = (f5j) obj;
                f5jVar.getClass();
                ((k3t0) this.receiver).x(f5jVar);
                return Unit.f46060a;
            case 14:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((duj) this.receiver).a(th5);
                return Unit.f46060a;
            case 15:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                f7j f7jVar = (f7j) this.receiver;
                f7jVar.x(new b7j(g2v.d(f7jVar.f, pb10.g, null, null, R.string.data_retrieval_error, R.string.try_again_text, new e8g(f7jVar, (byte) 28), 94)));
                f7jVar.g.a(th6);
                return Unit.f46060a;
            case 16:
                Object objF = ((m0o0) this.receiver).f((yje) obj);
                return objF == wne.f39444a ? objF : Unit.f46060a;
            case 17:
                z7k z7kVar = (z7k) obj;
                z7kVar.getClass();
                ((k3t0) this.receiver).x(z7kVar);
                return Unit.f46060a;
            case 18:
                n8k n8kVar = (n8k) obj;
                n8kVar.getClass();
                p9k p9kVar = (p9k) this.receiver;
                p9kVar.getClass();
                ArrayList arrayList = p9kVar.l;
                Iterator it = arrayList.iterator();
                int i4 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i4 = -1;
                    } else if (!((o8k) it.next()).c) {
                        i4++;
                    }
                }
                Iterator it2 = arrayList.iterator();
                int i5 = 0;
                while (it2.hasNext()) {
                    if (((o8k) it2.next()).f24833a == n8kVar) {
                        i = i5;
                        if (i4 >= 0) {
                            arrayList.set(i4, o8k.c((o8k) arrayList.get(i4), false));
                        }
                        arrayList.set(i, o8k.c((o8k) arrayList.get(i), true));
                        p9kVar.k = ((o8k) arrayList.get(i)).f24833a;
                        p7m0Var = p9kVar.p;
                        do {
                            value = p7m0Var.getValue();
                            g9k g9kVar = (g9k) value;
                            listL0 = CollectionsKt.L0(arrayList);
                            int iOrdinal = n8kVar.ordinal();
                            z = iOrdinal != 8 || iOrdinal == 9 ? !q3d.j(n8k.UNKNOWN, n8k.UNLIMITED).contains(p9kVar.j) : p9kVar.j != p9kVar.k;
                            g9kVar.getClass();
                            listL0.getClass();
                        } while (!p7m0Var.m(value, new g9k(listL0, z)));
                        return Unit.f46060a;
                    }
                    i5++;
                }
                if (i4 >= 0) {
                    arrayList.set(i4, o8k.c((o8k) arrayList.get(i4), false));
                }
                arrayList.set(i, o8k.c((o8k) arrayList.get(i), true));
                p9kVar.k = ((o8k) arrayList.get(i)).f24833a;
                p7m0Var = p9kVar.p;
                do {
                    value = p7m0Var.getValue();
                    g9k g9kVar2 = (g9k) value;
                    listL0 = CollectionsKt.L0(arrayList);
                    int iOrdinal2 = n8kVar.ordinal();
                    if (iOrdinal2 != 8) {
                    }
                    g9kVar2.getClass();
                    listL0.getClass();
                } while (!p7m0Var.m(value, new g9k(listL0, z)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                p7k p7kVar = (p7k) obj;
                p7kVar.getClass();
                iak iakVar = (iak) this.receiver;
                iakVar.getClass();
                ArrayList arrayList2 = iakVar.k;
                Iterator it3 = arrayList2.iterator();
                int i6 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i6 = -1;
                    } else if (!((p8k) it3.next()).c) {
                        i6++;
                    }
                }
                Iterator it4 = arrayList2.iterator();
                int i7 = 0;
                while (it4.hasNext()) {
                    if (((p8k) it4.next()).f26558a == p7kVar) {
                        i = i7;
                        if (i6 >= 0) {
                            arrayList2.set(i6, p8k.c((p8k) arrayList2.get(i6), false));
                        }
                        arrayList2.set(i, p8k.c((p8k) arrayList2.get(i), true));
                        iakVar.j = ((p8k) arrayList2.get(i)).f26558a;
                        p7m0Var2 = iakVar.o;
                        do {
                            value2 = p7m0Var2.getValue();
                            z9k z9kVar = (z9k) value2;
                            listL1 = CollectionsKt.L0(arrayList2);
                            int iOrdinal3 = p7kVar.ordinal();
                            z2 = iOrdinal3 != 4 || iOrdinal3 == 5 ? !q3d.j(p7k.UNKNOWN, p7k.UNLIMITED).contains(iakVar.i) : iakVar.i != iakVar.j;
                            z9kVar.getClass();
                            listL1.getClass();
                        } while (!p7m0Var2.m(value2, new z9k(listL1, z2)));
                        return Unit.f46060a;
                    }
                    i7++;
                }
                if (i6 >= 0) {
                    arrayList2.set(i6, p8k.c((p8k) arrayList2.get(i6), false));
                }
                arrayList2.set(i, p8k.c((p8k) arrayList2.get(i), true));
                iakVar.j = ((p8k) arrayList2.get(i)).f26558a;
                p7m0Var2 = iakVar.o;
                do {
                    value2 = p7m0Var2.getValue();
                    z9k z9kVar2 = (z9k) value2;
                    listL1 = CollectionsKt.L0(arrayList2);
                    int iOrdinal4 = p7kVar.ordinal();
                    if (iOrdinal4 != 4) {
                    }
                    z9kVar2.getClass();
                    listL1.getClass();
                } while (!p7m0Var2.m(value2, new z9k(listL1, z2)));
                return Unit.f46060a;
            case 20:
                ((gbk) obj).getClass();
                cbk cbkVar = (cbk) this.receiver;
                xak xakVar = cbk.O1;
                ii iiVar2 = cbkVar.M1;
                if (iiVar2 == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH = cbkVar.H(R.string.attention);
                String strH2 = cbkVar.H(R.string.something_went_wrong);
                String strH3 = cbkVar.H(R.string.ok_new);
                strH3.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                androidx.fragment.app.e eVarC2 = cbkVar.C();
                eVarC2.getClass();
                iiVar2.d(dialogFields, eVarC2);
                ((k3t0) cbkVar.N1.getValue()).x(tak.f33615a);
                return Unit.f46060a;
            case 21:
                uak uakVar = (uak) obj;
                uakVar.getClass();
                ((k3t0) this.receiver).x(uakVar);
                return Unit.f46060a;
            case 22:
                String str2 = (String) obj;
                str2.getClass();
                return ((iek) this.receiver).l(str2);
            case 23:
                g950 g950Var = (g950) obj;
                g950Var.getClass();
                return ((ffk) this.receiver).v0(g950Var);
            case 24:
                cty ctyVar = (cty) obj;
                ctyVar.getClass();
                return new cfk((ffk) this.receiver, ctyVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                jsk jskVar = (jsk) obj;
                jskVar.getClass();
                crk crkVar = (crk) this.receiver;
                xak xakVar2 = crk.W1;
                crkVar.getClass();
                if (jskVar instanceof hsk) {
                    ujd ujdVar = crkVar.L1;
                    if (ujdVar == null) {
                        Intrinsics.h("composeGameCardFragmentDelegate");
                        throw null;
                    }
                    ujdVar.b(crkVar, ((hsk) jskVar).f13588a);
                } else {
                    if (!(jskVar instanceof isk)) {
                        t9f.b();
                        return null;
                    }
                    wdk0 wdk0Var3 = crkVar.N1;
                    if (wdk0Var3 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var3, ((isk) jskVar).f15307a, crkVar, null, null, false, null, 1020);
                }
                crkVar.G0().x(lok.f20395a);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                PersonalDocumentRedesignUiModel personalDocumentRedesignUiModel = (PersonalDocumentRedesignUiModel) obj;
                personalDocumentRedesignUiModel.getClass();
                txk txkVar = (txk) this.receiver;
                txkVar.getClass();
                sac.V(jiu0.a(txkVar), new y6h(1, txkVar, txk.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, txkVar.d.f22085a, new sxk(txkVar, personalDocumentRedesignUiModel, yjeVar, b2), 10);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Throwable) obj).getClass();
                txk txkVar2 = (txk) this.receiver;
                txkVar2.getClass();
                sac.V(jiu0.a(txkVar2), rxk.f31268a, null, txkVar2.d.b, new pxk(txkVar2, yjeVar, b), 10);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Throwable) obj).getClass();
                txk txkVar3 = (txk) this.receiver;
                txkVar3.getClass();
                sac.V(jiu0.a(txkVar3), qxk.f29487a, null, txkVar3.d.f22085a, new pxk(txkVar3, yjeVar, b3), 10);
                return Unit.f46060a;
            default:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((l0l) this.receiver).x(th7);
                return Unit.f46060a;
        }
    }
}
