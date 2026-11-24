package a;

import android.os.Parcelable;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerParams;
import org.xplatform.security.api.navigation.EndFlowNavigation;
import org.xplatform.security.api.presentation.models.BindEmailScreenParams;
import org.xplatform.security.impl.navigation.EmailScreenFactoryImpl$getBindEmailScreen$1;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pf10 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26878a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf10(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f26878a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        String strA;
        Object value2;
        Object value3;
        esr esrVar;
        byte b = 21;
        byte b2 = 29;
        byte b3 = 2;
        byte b4 = 0;
        yje yjeVar = null;
        switch (this.f26878a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                sf10 sf10Var = (sf10) this.receiver;
                sf10Var.x.b(th, new kyz((byte) 24));
                p7m0 p7m0Var = sf10Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    sf10Var.f.getClass();
                } while (!p7m0Var.m(value, lf10.a((lf10) value, te10.f33797a, false, 239)));
                return Unit.f46060a;
            case 1:
                eg10 eg10Var = (eg10) obj;
                eg10Var.getClass();
                ((k3t0) this.receiver).x(eg10Var);
                return Unit.f46060a;
            case 2:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ph10 ph10Var = (ph10) this.receiver;
                duj dujVar = ph10Var.x;
                ctf0 ctf0Var = ph10Var.t;
                if (th2 instanceof zhi0) {
                    zg zgVar = ph10Var.v;
                    int i = ((zhi0) th2).b;
                    b1j.w("error_code", Integer.valueOf(i), zgVar.f44322a, "promo_VIP_cashback_reject");
                    ph10Var.w.f1455a.a(cui0.b(new i1p(i, (byte) 2)), 11315L);
                    strA = th2.getMessage();
                    if (strA == null) {
                        strA = "";
                    }
                    if (strA.length() == 0) {
                        strA = ctf0Var.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                    }
                } else if (th2 instanceof UnknownHostException) {
                    dujVar.b(th2, new kyz((byte) 28));
                    strA = ctf0Var.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                } else {
                    dujVar.b(th2, new kyz(b2));
                    strA = ctf0Var.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0));
                }
                ph10Var.G(new dh10(new DialogFields((CharSequence) ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), (CharSequence) strA, (CharSequence) ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0)), (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528)));
                p7m0 p7m0Var2 = ph10Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    ph10Var.f.getClass();
                } while (!p7m0Var2.m(value2, gh10.a((gh10) value2, null, false, 127)));
                return Unit.f46060a;
            case 3:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ph10 ph10Var2 = (ph10) this.receiver;
                ph10Var2.x.b(th3, new kyz((byte) 27));
                p7m0 p7m0Var3 = ph10Var2.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    ph10Var2.f.getClass();
                } while (!p7m0Var3.m(value3, gh10.a((gh10) value3, gg10.f11231a, false, 239)));
                return Unit.f46060a;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                uj10 uj10Var = (uj10) this.receiver;
                uj10Var.getClass();
                sac.V(jiu0.a(uj10Var), tj10.f34032a, null, uj10Var.c.f22085a, new juy(uj10Var, th4, yjeVar, b), 10);
                return Unit.f46060a;
            case 5:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                uj10 uj10Var2 = (uj10) this.receiver;
                uj10Var2.getClass();
                sac.V(jiu0.a(uj10Var2), tj10.f34032a, null, uj10Var2.c.f22085a, new juy(uj10Var2, th5, yjeVar, b), 10);
                return Unit.f46060a;
            case 6:
                vl10 vl10Var = (vl10) obj;
                vl10Var.getClass();
                ((k3t0) this.receiver).x(vl10Var);
                return Unit.f46060a;
            case 7:
                long jLongValue = ((Number) obj).longValue();
                bo10 bo10Var = (bo10) this.receiver;
                int iOrdinal = bo10Var.M.ordinal();
                if (iOrdinal == 0) {
                    bo10Var.z();
                } else if (iOrdinal == 1) {
                    bo10Var.y();
                } else if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                bo10Var.A(c8h0.f3914a, true);
                sac.V(jiu0.a(bo10Var), new qn10(bo10Var, (byte) 0), null, bo10Var.d.b, new wn10(bo10Var, jLongValue, null, (byte) 0), 10);
                return Unit.f46060a;
            case 8:
                txb0 txb0Var = (txb0) obj;
                txb0Var.getClass();
                bo10 bo10Var2 = (bo10) this.receiver;
                bo10Var2.getClass();
                csr csrVar = txb0Var.e;
                bsr bsrVar = csrVar.f4905a;
                if (bsrVar.f3145a.b()) {
                    bo10Var2.F.f(rn10.f30766a);
                } else if (bo10Var2.N && bo10Var2.P == null && (esrVar = bsrVar.f3145a) != esr.FREE_SPIN && esrVar != esr.SPECIAL_BONUS) {
                    bo10Var2.M = ko10.c;
                    bo10Var2.L = csr.e;
                    bo10Var2.y();
                    bo10Var2.A(c8h0.f3914a, true);
                    bo10Var2.P = sac.V(jiu0.a(bo10Var2), new pf10(1, bo10Var2, bo10.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 12), new rx00(bo10Var2, (byte) 11), bo10Var2.d.b, new juy(bo10Var2, csrVar, yjeVar, b2), 8);
                }
                return Unit.f46060a;
            case 9:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((bo10) this.receiver).w(th6);
                return Unit.f46060a;
            case 10:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((bo10) this.receiver).w(th7);
                return Unit.f46060a;
            case 11:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((bo10) this.receiver).w(th8);
                return Unit.f46060a;
            case 12:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((bo10) this.receiver).w(th9);
                return Unit.f46060a;
            case 13:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((bo10) this.receiver).w(th10);
                return Unit.f46060a;
            case 14:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((bo10) this.receiver).w(th11);
                return Unit.f46060a;
            case 15:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((bo10) this.receiver).w(th12);
                return Unit.f46060a;
            case 16:
                fl flVar = (fl) obj;
                flVar.getClass();
                vq10 vq10Var = (vq10) this.receiver;
                mne mneVar = vq10Var.m;
                i1w0 i1w0Var = vq10Var.q;
                bl blVar = flVar.f9717a;
                al alVar = flVar.b;
                if (blVar == bl.c) {
                    i1w0Var.d(new aq10(vq10Var, b4));
                } else {
                    bl blVar2 = bl.b;
                    if (blVar == blVar2 && alVar == al.f1045a) {
                        BindEmailScreenParams bindEmailScreenParams = new BindEmailScreenParams(EndFlowNavigation.ToMailingManagementScreen.f46925a, true, 23);
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        vq10Var.r.getClass();
                        FragmentScreen emailScreenFactoryImpl$getBindEmailScreen$1 = new EmailScreenFactoryImpl$getBindEmailScreen$1(bindEmailScreenParams);
                        if (emailScreenFactoryImpl$getBindEmailScreen$1 instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) emailScreenFactoryImpl$getBindEmailScreen$1)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(emailScreenFactoryImpl$getBindEmailScreen$1)));
                        }
                        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                        }
                    } else if (blVar == blVar2 && alVar == al.b) {
                        sac.V(jiu0.a(vq10Var), nq10.f23937a, null, mneVar.f22085a, new oq10(vq10Var, null), 10);
                    } else {
                        bl blVar3 = bl.f2772a;
                        if (blVar == blVar3 && alVar == al.f1045a) {
                            i8i.D("screen", "acc_mailing", vq10Var.f.f37210a, "acc_add_phone_call");
                            vq10Var.t.f14907a.a(cui0.b(new j1p("acc_mailing", (byte) 0)), 3231L);
                            i1w0Var.d(new aq10(vq10Var, b3));
                        } else {
                            if (blVar != blVar3 || alVar != al.b) {
                                e9d0.o();
                                return null;
                            }
                            sac.V(jiu0.a(vq10Var), pq10.f27396a, null, mneVar.f22085a, new qq10(vq10Var, yjeVar, b4), 10);
                        }
                    }
                }
                return Unit.f46060a;
            case 17:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                vq10 vq10Var2 = (vq10) this.receiver;
                vq10Var2.n.b(th13, new g2z((Object) vq10Var2, (byte) 26));
                return Unit.f46060a;
            case 18:
                as9 as9Var = (as9) obj;
                as9Var.getClass();
                qr10 qr10Var = (qr10) this.receiver;
                evz evzVar = qr10.V1;
                qr10Var.getClass();
                Integer numValueOf = Integer.valueOf(R.dimen.space_76);
                if (as9Var instanceof xr9) {
                    ii iiVar = qr10Var.H0().j;
                    String strH = qr10Var.H(R.string.support_cancel_request);
                    String strH2 = qr10Var.H(R.string.support_dialog_delete);
                    String strH3 = qr10Var.H(R.string.yes);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, qr10Var.H(R.string.no), (String) null, "CANCEL_REQUEST_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC = qr10Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (as9Var instanceof yr9) {
                    wdk0 wdk0Var = qr10Var.H0().k;
                    rek0 rek0Var = rek0.b;
                    String strH4 = qr10Var.H(R.string.error_something_went_wrong);
                    strH4.getClass();
                    wdk0.k(wdk0Var, new xdk0(rek0Var, strH4, null, null, null, null, 124), qr10Var, null, null, false, numValueOf, 476);
                } else if (as9Var instanceof zr9) {
                    wdk0.k(qr10Var.H0().k, new xdk0(pek0.f26859a, ((zr9) as9Var).f44842a, null, null, null, null, 124), qr10Var, null, null, false, numValueOf, 476);
                } else {
                    if (!(as9Var instanceof wr9)) {
                        t9f.b();
                        return null;
                    }
                    bj5 bj5Var = ut9.s2;
                    androidx.fragment.app.e eVarC2 = qr10Var.C();
                    eVarC2.getClass();
                    long j = ((wr9) as9Var).f39628a;
                    bj5Var.getClass();
                    bj5.d(eVarC2, j);
                }
                qr10Var.G0().x(cq9.f4782a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                x780 x780Var = (x780) obj;
                x780Var.getClass();
                qr10 qr10Var2 = (qr10) this.receiver;
                evz evzVar2 = qr10.V1;
                qr10Var2.getClass();
                a8z a8zVar = qr10Var2.M1;
                Integer numValueOf2 = Integer.valueOf(R.dimen.space_76);
                if (x780Var instanceof r780) {
                    String str = ((r780) x780Var).f29967a;
                    wdk0 wdk0Var2 = qr10Var2.H0().k;
                    qek0 qek0Var = qek0.f28589a;
                    String strH5 = qr10Var2.H(R.string.callback_ordered_snackbar_title);
                    strH5.getClass();
                    wdk0.k(wdk0Var2, new xdk0(qek0Var, strH5, str, null, null, null, 120), qr10Var2, null, null, false, numValueOf2, 476);
                    qr10Var2.G0().x(mq9.f22212a);
                } else if (x780Var instanceof s780) {
                    List list = ((s780) x780Var).f31738a;
                    s2m0 s2m0Var = gbq0.m2;
                    androidx.fragment.app.e eVarC3 = qr10Var2.C();
                    eVarC3.getClass();
                    s2m0Var.getClass();
                    s2m0.e(eVarC3, list);
                } else if (x780Var instanceof t780) {
                    d7a d7aVar = ((t780) x780Var).f33454a;
                    ((cni) a8zVar.getValue()).getClass();
                    String strH6 = qr10Var2.H(R.string.call_back);
                    strH6.getClass();
                    gl5.q(qr10Var2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH6);
                } else if (x780Var instanceof u780) {
                    u780 u780Var = (u780) x780Var;
                    wdk0.k(qr10Var2.H0().k, new xdk0(rek0.b, u780Var.f35172a, u780Var.b, null, null, null, 120), qr10Var2, null, null, false, numValueOf2, 476);
                } else if (x780Var instanceof v780) {
                    PickerParams.Phone phone = ((v780) x780Var).f36912a;
                    rl70 rl70Var = ((cni) a8zVar.getValue()).t;
                    androidx.fragment.app.e eVarC4 = qr10Var2.C();
                    eVarC4.getClass();
                    rl70Var.e(eVarC4, phone, AnalyticsEntryPoint.f46800a);
                } else {
                    if (!(x780Var instanceof w780)) {
                        t9f.b();
                        return null;
                    }
                    PickerParams.Language language = ((w780) x780Var).f38660a;
                    rl70 rl70Var2 = ((cni) a8zVar.getValue()).t;
                    androidx.fragment.app.e eVarC5 = qr10Var2.C();
                    eVarC5.getClass();
                    Parcelable.Creator<AnalyticsEntryPoint> creator = AnalyticsEntryPoint.CREATOR;
                    rl70Var2.g(eVarC5, language);
                }
                qr10Var2.I0().x(d780.f5584a);
                return Unit.f46060a;
            case 20:
                mr10 mr10Var = (mr10) obj;
                mr10Var.getClass();
                ((k3t0) this.receiver).x(mr10Var);
                return Unit.f46060a;
            case 21:
                q780 q780Var = (q780) obj;
                q780Var.getClass();
                ((k3t0) this.receiver).x(q780Var);
                return Unit.f46060a;
            case 22:
                nq9 nq9Var = (nq9) obj;
                nq9Var.getClass();
                ((k3t0) this.receiver).x(nq9Var);
                return Unit.f46060a;
            case 23:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((cx10) this.receiver).y(th14);
                return Unit.f46060a;
            case 24:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((cx10) this.receiver).y(th15);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                ((cx10) this.receiver).y(th16);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                ((cx10) this.receiver).y(th17);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th18 = (Throwable) obj;
                th18.getClass();
                ((cx10) this.receiver).y(th18);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th19 = (Throwable) obj;
                th19.getClass();
                ((cx10) this.receiver).y(th19);
                return Unit.f46060a;
            default:
                Throwable th20 = (Throwable) obj;
                th20.getClass();
                ((cx10) this.receiver).y(th20);
                return Unit.f46060a;
        }
    }
}
