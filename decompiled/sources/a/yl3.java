package a;

import androidx.fragment.app.Fragment;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yl3 implements wn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42820a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ yl3(Fragment fragment, byte b) {
        this.f42820a = b;
        this.b = fragment;
    }

    @Override // a.wn
    public final void a(Object obj) {
        byte b = this.f42820a;
        yje yjeVar = null;
        Fragment fragment = this.b;
        switch (b) {
            case 0:
                qek0 qek0Var = dm3.U1;
                ((dm3) fragment).G0();
                return;
            case 1:
                tu5 tu5Var = (tu5) fragment;
                yk5 yk5Var = tu5.V1;
                tu5Var.H0().c.e("KEY_CAMERA_PERMISSION_REQUESTED", Boolean.TRUE);
                if (((Boolean) obj).booleanValue()) {
                    tu5Var.G0().b.e();
                    return;
                } else {
                    tu5Var.H0().x();
                    return;
                }
            case 2:
                q47 q47Var = (q47) fragment;
                gl5 gl5Var = q47.U1;
                if (sj3.L(q47Var.o0())) {
                    q47Var.I0().x(new d37(q47.class.getSimpleName()));
                    return;
                }
                return;
            case 3:
                wa7 wa7Var = (wa7) fragment;
                kj5 kj5Var = wa7.U1;
                if (sj3.L(wa7Var.o0())) {
                    wa7Var.I0().x(ka7.f17950a);
                    return;
                }
                return;
            case 4:
                gk7 gk7Var = (gk7) fragment;
                kl5 kl5Var = gk7.U1;
                if (sj3.L(gk7Var.o0())) {
                    gk7Var.I0().x(new kj7(gk7.class.getSimpleName()));
                    return;
                }
                return;
            case 5:
                l5c l5cVar = (l5c) fragment;
                kl5 kl5Var2 = l5c.W1;
                if (sj3.L(l5cVar.o0())) {
                    l5cVar.I0().x();
                    return;
                }
                ii iiVarG0 = l5cVar.G0();
                String strH = l5cVar.H(R.string.caution);
                String strH2 = l5cVar.H(R.string.authenticator_enable_push_dialog_title);
                String strH3 = l5cVar.H(R.string.open_settings);
                strH3.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, l5cVar.H(R.string.cancel), (String) null, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                androidx.fragment.app.e eVarC = l5cVar.C();
                eVarC.getClass();
                iiVarG0.d(dialogFields, eVarC);
                return;
            case 6:
                kud kudVar = nud.b2;
                ((nud) fragment).I0().D();
                return;
            case 7:
                usd usdVar = exd.U1;
                ((exd) fragment).I0().H();
                return;
            case 8:
                pek pekVar = gns.R1;
                ((Unit) obj).getClass();
                ((gns) fragment).G0().x(rms.f30757a);
                return;
            case 9:
                izv izvVar = (izv) fragment;
                rqt rqtVar = izv.d2;
                if (sj3.L(izvVar.o0())) {
                    izvVar.M0().e.x();
                    return;
                }
                return;
            case 10:
                s1w s1wVar = (s1w) fragment;
                bst bstVar = s1w.d2;
                if (sj3.L(s1wVar.o0())) {
                    s1wVar.M0().B(s1w.class.getSimpleName());
                    return;
                }
                return;
            case 11:
                qid0 qid0Var = (qid0) fragment;
                rl70 rl70Var = qid0.V1;
                if (((Boolean) obj).booleanValue()) {
                    qid0Var.G0().c.e();
                    return;
                }
                if (qid0Var.m) {
                    return;
                }
                ii iiVar = qid0Var.M1;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH4 = qid0Var.H(R.string.qr_scanner);
                String strH5 = qid0Var.H(R.string.permission_camera_data);
                String strH6 = qid0Var.H(R.string.ok);
                strH6.getClass();
                DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, (String) null, (String) null, "REQUEST_CAMERA_PERMISSION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                androidx.fragment.app.e eVarC2 = qid0Var.C();
                eVarC2.getClass();
                iiVar.d(dialogFields2, eVarC2);
                return;
            case 12:
                d4j0 d4j0Var = (d4j0) fragment;
                eke0 eke0Var = d4j0.S1;
                ((Unit) obj).getClass();
                if (sj3.L(d4j0Var.o0())) {
                    d4j0Var.I0().z(r4j0.f29838a);
                    return;
                } else {
                    d4j0Var.I0().D(false);
                    return;
                }
            case 13:
                rvt0 rvt0Var = (rvt0) fragment;
                jvt0 jvt0Var = (jvt0) obj;
                sxs0 sxs0Var = rvt0.f2;
                jvt0Var.getClass();
                if (jvt0Var instanceof ivt0) {
                    uut0 uut0Var = ((ivt0) jvt0Var).f15461a;
                    String str = uut0Var.b;
                    String str2 = uut0Var.c;
                    String str3 = str2 != null ? str2 : "";
                    pvt0 pvt0Var = new pvt0(rvt0Var);
                    mkt0 mkt0Var = new mkt0(rvt0Var, str, str3);
                    wut0 wut0Var = tut0.f34568a;
                    Object value = wvt0.c.getValue();
                    value.getClass();
                    ((ExecutorService) value).submit(new qaq0(pvt0Var, mkt0Var, (byte) 9));
                    return;
                }
                if (!(jvt0Var instanceof hvt0)) {
                    t9f.b();
                    return;
                }
                evt0 evt0Var = ((hvt0) jvt0Var).f13741a;
                String str4 = evt0Var.b;
                int i = evt0Var.f8490a;
                if (!(i == 0 && (str4 == null || str4.length() == 0)) && ((str4 == null || StringsKt.W(str4)) && i == 0)) {
                    rvt0Var.d2.a(q3d.e(xvt0.b, xvt0.f41578a));
                    rvt0Var.c2 = true;
                    return;
                } else if (i == 0 && (str4 == null || str4.length() == 0)) {
                    rvt0Var.F().t0(i120.V(new Pair("CLOSE_SOCIAL", "")), "CLOSE_SOCIAL");
                    rvt0Var.y0();
                    return;
                } else {
                    String strH7 = rvt0Var.H(R.string.exit_from_social);
                    strH7.getClass();
                    rvt0Var.F().t0(i120.V(new Pair("ERROR_SOCIAL", strH7)), "ERROR_SOCIAL");
                    rvt0Var.y0();
                    return;
                }
            default:
                n2w0 n2w0Var = (n2w0) fragment;
                u2w0 u2w0Var = (u2w0) obj;
                bzs0 bzs0Var = n2w0.h2;
                if (u2w0Var != null) {
                    if (u2w0Var instanceof t2w0) {
                        String str5 = ((t2w0) u2w0Var).f33236a;
                        sje sjeVar = n2w0Var.c2;
                        if (sjeVar == null || !d5c.R(sjeVar)) {
                            kin0 kin0VarE = qem0.e();
                            mne mneVar = n2w0Var.g2;
                            if (mneVar == null) {
                                Intrinsics.h("coroutineDispatchers");
                                throw null;
                            }
                            sje sjeVarA = d5c.a(kotlin.coroutines.e.c(kin0VarE, mneVar.b));
                            n2w0Var.c2 = sjeVarA;
                            sac.V(sjeVarA, new gdv0((Object) n2w0Var, (byte) 10), null, null, new wbl0(n2w0Var, str5, yjeVar, (byte) 20), 14);
                            return;
                        }
                        return;
                    }
                    if (u2w0Var instanceof r2w0) {
                        n2w0Var.F().t0(i120.V(new Pair("CLOSE_SOCIAL", "")), "CLOSE_SOCIAL");
                        n2w0Var.y0();
                        return;
                    } else if (u2w0Var instanceof s2w0) {
                        String strH8 = n2w0Var.H(R.string.something_went_wrong);
                        strH8.getClass();
                        n2w0Var.F().t0(i120.V(new Pair("ERROR_SOCIAL", strH8)), "ERROR_SOCIAL");
                        n2w0Var.y0();
                        return;
                    }
                }
                t9f.b();
                return;
        }
    }
}
