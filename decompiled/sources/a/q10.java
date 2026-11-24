package a;

import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bethistory.history.domain.model.BetHistoryFilterItemModel;
import org.xplatform.game_broadcasting.impl.presentation.video.window_screen.GameVideoWindowService;
import org.xplatform.uikit.components.check_box.old.DsCheckBoxOld;
import org.xplatform.uikit.components.chips.Chip;
import org.xplatform.uikit.components.chips.DsChip;
import org.xplatform.uikit.components.list_checkbox.DsListCheckBox;
import org.xplatform.uikit.components.search_field.DsSearchField;
import org.xplatform.uikit.components.snackbar.DsSnackBarView;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q10 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27926a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q10(Object obj, byte b) {
        this.f27926a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f27926a;
        p0w0 p0w0Var = p0w0.f26173a;
        yje yjeVar = null;
        int i = 0;
        i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                qek0 qek0Var = s10.Q1;
                ((s10) obj).H0().z();
                return;
            case 1:
                bj5 bj5Var = ej5.V1;
                ((ej5) obj).H0().B();
                return;
            case 2:
                yk5 yk5Var = tu5.V1;
                ((tu5) obj).H0().w();
                return;
            case 3:
                ((by5) obj).z0(false, false, false);
                return;
            case 4:
                i1w0 i1w0Var = ((t46) ((q46) obj).N1.getValue()).b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                }
                break;
            case 5:
                yk5 yk5Var2 = ke7.R1;
                i1w0 i1w0Var2 = ((ke7) obj).H0().h;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var2.a((oe50) pawVar2.next());
                    }
                }
                break;
            case 6:
                yk5 yk5Var3 = h38.V1;
                d48 d48VarH0 = ((h38) obj).H0();
                sac.V(jiu0.a(d48VarH0), new ye7(1, d48VarH0, d48.class, "localHandleError", "localHandleError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, d48VarH0.d.b, new u47(d48VarH0, null), 10);
                return;
            case 7:
                bj5 bj5Var2 = aya.S1;
                ((aya) obj).I0().x();
                return;
            case 8:
                int i2 = Chip.j;
                ((Chip) obj).callOnClick();
                return;
            case 9:
                ((pw4) obj).invoke();
                return;
            case 10:
                ssc sscVar = (ssc) obj;
                EditText editText = sscVar.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (view.hasFocus()) {
                    sscVar.i.requestFocus();
                }
                if (text != null) {
                    text.clear();
                }
                sscVar.p();
                return;
            case 11:
                std stdVar = oyd.k2;
                syd sydVar = (syd) ((oyd) obj).i2.getValue();
                sydVar.d.g(new qyd(sydVar.b));
                return;
            case 12:
                nwd nwdVar = f7g.o2;
                j7g j7gVarW0 = ((f7g) obj).W0();
                sac.V(jiu0.a(j7gVarW0), new g7g(j7gVarW0, (byte) 2), null, j7gVarW0.g.f22085a, new igb((Object) j7gVarW0, yjeVar, (byte) 19), 10);
                return;
            case 13:
                org.xplatform.uikit.components.text_field.end.c cVar = (org.xplatform.uikit.components.text_field.end.c) obj;
                cVar.toggle();
                cVar.e.invoke(Boolean.valueOf(cVar.f47276a));
                return;
            case 14:
                qud qudVar = ysj.m2;
                btj btjVar = (btj) ((ysj) obj).l2.getValue();
                sac.V(jiu0.a(btjVar), new zsj(btjVar, i == true ? (byte) 1 : (byte) 0), null, btjVar.i.f22085a, new vdc(btjVar, null), 10);
                return;
            case 15:
                ((til) obj).t();
                return;
            case 16:
                int i3 = DsChip.p;
                ((DsChip) obj).callOnClick();
                return;
            case 17:
                DsListCheckBox dsListCheckBox = (DsListCheckBox) obj;
                int i4 = DsListCheckBox.g;
                dsListCheckBox.toggle();
                ckb.Z(dsListCheckBox, dsListCheckBox.c ? 21 : 22);
                return;
            case 18:
                DsSearchField dsSearchField = (DsSearchField) obj;
                int i5 = DsSearchField.d;
                dsSearchField.setText(null);
                dsSearchField.f();
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int i6 = DsSnackBarView.s;
                ((gnm) obj).invoke();
                return;
            case 20:
                int i7 = DsTextField.m1;
                ((DsTextField) obj).b();
                return;
            case 21:
                pek pekVar = nzo.P1;
                i1w0 i1w0Var3 = ((e0p) ((nzo) obj).M1.getValue()).h;
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var3);
                ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, p0w0Var), i1w0Var3, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorP3;
                    if (!pawVar3.hasNext()) {
                        return;
                    } else {
                        i1w0Var3.a((oe50) pawVar3.next());
                    }
                }
                break;
            case 22:
                iiy[] iiyVarArr = ljr.Q1;
                vkr vkrVarH0 = ((ljr) obj).H0();
                lef0 lef0Var = vkrVarH0.d;
                iun iunVar = iun.f15405a;
                lef0Var.getClass();
                iunVar.getClass();
                xio xioVar = (xio) ((pmi) lef0Var.f19899a).c;
                xioVar.getClass();
                xioVar.b = iunVar;
                ani0 ani0Var = vkrVarH0.c;
                ani0Var.getClass();
                xio xioVar2 = (xio) ((pmi) ani0Var.f1155a).c;
                xioVar2.getClass();
                xioVar2.b = iunVar;
                xioVar2.c = iunVar;
                i1w0 i1w0Var4 = vkrVarH0.b;
                CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var4);
                ListIterator listIteratorP4 = b1j.p(copyOnWriteArrayListQ4, new c8d(y7d.f42146a, p0w0Var), i1w0Var4, copyOnWriteArrayListQ4, 0);
                while (true) {
                    paw pawVar4 = (paw) listIteratorP4;
                    if (!pawVar4.hasNext()) {
                        return;
                    } else {
                        i1w0Var4.a((oe50) pawVar4.next());
                    }
                }
                break;
            case 23:
                wzs wzsVar = ((GameVideoWindowService) obj).c;
                if (wzsVar != null) {
                    wzsVar.x();
                    return;
                } else {
                    Intrinsics.h("viewModel");
                    throw null;
                }
            case 24:
                art artVar = x6w.k2;
                wnm0 wnm0VarU0 = ((x6w) obj).U0();
                ArrayList arrayList = wnm0VarU0.h;
                s77 s77Var = wnm0VarU0.b;
                if (s77Var != s77.AGGREGATOR) {
                    wnm0VarU0.e.b(b34.w0(s77Var), j47.G0(arrayList));
                    au0 au0Var = wnm0VarU0.g;
                    String strA = b34.w0(s77Var).a();
                    List listG0 = j47.G0(arrayList);
                    ArrayList arrayList2 = new ArrayList(r3d.q(listG0, 10));
                    Iterator it = listG0.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((z5w) it.next()).a());
                    }
                    au0Var.c(strA, arrayList2);
                }
                if (arrayList == null || !arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (((BetHistoryFilterItemModel) it2.next()).b && (i = i + 1) < 0) {
                            q3d.o();
                            throw null;
                        }
                    }
                }
                if (i > 0) {
                    qjj.W(jiu0.a(wnm0VarU0), null, null, new yng0(wnm0VarU0, yjeVar, (byte) 27), 3);
                }
                wnm0VarU0.l.g(vnm0.f37726a);
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                art artVar2 = x6w.k2;
                ((DsCheckBoxOld) ((jk3) obj).c).performClick();
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((c0x) obj).dismiss();
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((a1x) obj).dismiss();
                return;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                bst bstVar = a3x.a2;
                ((a3x) obj).z0(false, false, false);
                return;
            default:
                iiy[] iiyVarArr2 = uvz.P1;
                i1w0 i1w0Var5 = ((uvz) obj).H0().b;
                CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var5);
                ListIterator listIteratorP5 = b1j.p(copyOnWriteArrayListQ5, new c8d(y7d.f42146a, p0w0Var), i1w0Var5, copyOnWriteArrayListQ5, 0);
                while (true) {
                    paw pawVar5 = (paw) listIteratorP5;
                    if (!pawVar5.hasNext()) {
                        return;
                    } else {
                        i1w0Var5.a((oe50) pawVar5.next());
                    }
                }
                break;
        }
    }
}
