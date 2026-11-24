package a;

import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.text.Charsets;
import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import org.xbet.client1.R;
import org.xplatform.picker.api.presentation.PickerDialogParams;
import org.xplatform.registration.success.api.RegistrationSuccessParams;
import org.xplatform.registration_default.api.presentation.model.RegistrationDefaultScreenParams;
import org.xplatform.security.api.presentation.models.ConfirmRestoreByAuthenticatorType;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ex60 implements k4r, xbf, izj, lzw, zon0, ikf0, Authenticator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8563a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ex60(Object obj, byte b) {
        this.f8563a = b;
        this.b = obj;
    }

    @Override // a.izj
    public void a(p5d0 p5d0Var) {
        p8f p8fVar = (p8f) this.b;
        n660 n660Var = ((qff0) ((bhq) p5d0Var.get())).b("firebase").i;
        ((Set) n660Var.d).add(p8fVar);
        Task taskB = ((krd) n660Var.f22981a).b();
        taskB.addOnSuccessListener((Executor) n660Var.c, new hi(n660Var, taskB, p8fVar, (byte) 13));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
        }
    }

    @Override // a.zon0
    public void b() {
        zuh0 zuh0Var = (zuh0) this.b;
        gle0 gle0Var = oph0.Q1;
        zuh0Var.getClass();
        zuh0Var.y();
    }

    @Override // a.xbf
    public Object c(Object obj) {
        byte b = this.f8563a;
        Object obj2 = this.b;
        switch (b) {
            case 8:
                we50 we50Var = (we50) obj2;
                ((m1r) obj).getClass();
                b190.V1.getClass();
                we50Var.getClass();
                b190 b190Var = new b190();
                b190Var.S1.u(b190Var, b190.W1[1], we50Var);
                return b190Var;
            case 9:
                ((m1r) obj).getClass();
                exd.U1.getClass();
                exd exdVar = new exd();
                iiy iiyVar = exd.V1[1];
                exdVar.S1.J(exdVar, iiyVar, (ConfirmRestoreByAuthenticatorType) obj2);
                return exdVar;
            case 10:
                ((m1r) obj).getClass();
                ep90.c2.getClass();
                ep90 ep90Var = new ep90();
                iiy iiyVar2 = ep90.d2[1];
                ep90Var.b2.J(ep90Var, iiyVar2, (PickerDialogParams) obj2);
                return ep90Var;
            case 18:
                ((m1r) obj).getClass();
                dxe0.Y1.getClass();
                dxe0 dxe0Var = new dxe0();
                iiy iiyVar3 = dxe0.Z1[1];
                dxe0Var.V1.J(dxe0Var, iiyVar3, (RegistrationDefaultScreenParams) obj2);
                return dxe0Var;
            default:
                ((m1r) obj).getClass();
                m6f0.f2.getClass();
                m6f0 m6f0Var = new m6f0();
                iiy iiyVar4 = m6f0.g2[1];
                m6f0Var.d2.J(m6f0Var, iiyVar4, (RegistrationSuccessParams) obj2);
                return m6f0Var;
        }
    }

    @Override // okhttp3.Authenticator
    public Request d(Route route, Response response) {
        e6d0 e6d0Var = (e6d0) this.b;
        String strA = Credentials.a(e6d0Var.e, e6d0Var.f, Charsets.d);
        Request.Builder builderA = response.f46111a.a();
        builderA.a("Proxy-Authorization", strA);
        return new Request(builderA);
    }

    @Override // a.ikf0
    public void f(long j, fq80 fq80Var) {
        nnw0.D(j, fq80Var, (ncs0[]) ((y3v) this.b).c);
    }

    @Override // a.lzw
    public void g() {
        r7h0 r7h0Var = (r7h0) this.b;
        synchronized (r7h0Var.b) {
            try {
                if (r7h0Var.d == null) {
                    l8x.E0("ScreenFlashWrapper", "apply: pendingListener is null!");
                }
                r7h0Var.c();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.k4r
    public void i(Bundle bundle, String str) {
        Object serializable;
        ql5 ql5Var;
        Object value;
        Object serializable2;
        byte b = this.f8563a;
        byte b2 = 2;
        Object obj = this.b;
        switch (b) {
            case 0:
                gx60 gx60Var = (gx60) obj;
                atz atzVar = gx60.R1;
                str.getClass();
                if (str.equals("SELECT_BALANCE_REQUEST_KEY") && bundle.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                    Serializable serializable3 = bundle.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                    serializable3.getClass();
                    gx60Var.G0().x(new xw60((ql5) serializable3));
                }
                break;
            case 1:
                ez60 ez60Var = (ez60) obj;
                iiy[] iiyVarArr = ez60.S1;
                str.getClass();
                if (str.equals("CHANGE_TAB_REQUEST_KEY")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        serializable = bundle.getSerializable("CHANGE_TAB_ARG", t270.class);
                    } else {
                        Object serializable4 = bundle.getSerializable("CHANGE_TAB_ARG");
                        serializable = (t270) (serializable4 instanceof t270 ? serializable4 : null);
                    }
                    t270 t270Var = (t270) serializable;
                    if (t270Var != null) {
                        ez60Var.H0().w(x0x.V(t270Var), true, false);
                    }
                    break;
                }
                break;
            case 2:
                p170 p170Var = (p170) obj;
                xuz xuzVar = p170.Q1;
                str.getClass();
                if (str.equals("SELECT_BALANCE_REQUEST_KEY") && bundle.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        ql5Var = (ql5) bundle.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", ql5.class);
                    } else {
                        Serializable serializable5 = bundle.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                        serializable5.getClass();
                        ql5Var = (ql5) serializable5;
                    }
                    if (ql5Var != null) {
                        p170Var.G0().x(new e170(ql5Var));
                    }
                }
                break;
            case 3:
                wsz wszVar = y370.Y1;
                str.getClass();
                vcc.f0(bundle, (y370) obj, str);
                break;
            case 4:
                bn70 bn70Var = (bn70) obj;
                iiy[] iiyVarArr2 = bn70.S1;
                str.getClass();
                if (str.equals("GameIsNotFinishedDialog.REQUEST_KEY")) {
                    if (bundle.containsKey("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE")) {
                        ((SharedPreferences) bn70Var.Q0().p.f41419a.b.f20589a).edit().putBoolean("SHOW_GAME_IS_NOT_FINISHED_DIALOG", !bundle.getBoolean("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE")).apply();
                    } else if (bundle.containsKey("GameIsNotFinishedDialog.RESULT_KEY_EXIT")) {
                        boolean z = bundle.getBoolean("GameIsNotFinishedDialog.RESULT_KEY_EXIT");
                        to70 to70VarQ0 = bn70Var.Q0();
                        ((SharedPreferences) to70VarQ0.p.f41419a.b.f20589a).edit().putBoolean("SHOW_GAME_IS_NOT_FINISHED_DIALOG", !z).apply();
                        to70VarQ0.w(new iy5(csr.e));
                        to70VarQ0.A();
                    }
                    break;
                }
                break;
            case 5:
                nh70 nh70Var = kc80.O1;
                str.getClass();
                ((fho0) ((kc80) obj).M1.getValue()).B();
                break;
            case 6:
                fl70 fl70Var = as80.Y1;
                str.getClass();
                ((as80) obj).H0().x(fr80.f10007a);
                break;
            case 7:
                rl70 rl70Var = ou80.V1;
                str.getClass();
                ((ou80) obj).G0().x(wt80.f39729a);
                break;
            case 8:
            case 9:
            case 10:
            case 13:
            case 18:
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 20:
            case 22:
            case 24:
            default:
                rbi0 rbi0Var = (rbi0) obj;
                gle0 gle0Var = rbi0.U1;
                str.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable2 = bundle.getSerializable("MULTI_CHOICE_CALLBACK_KEY", obk0.class);
                } else {
                    Object serializable6 = bundle.getSerializable("MULTI_CHOICE_CALLBACK_KEY");
                    serializable2 = (obk0) (serializable6 instanceof obk0 ? serializable6 : null);
                }
                obk0 obk0Var = (obk0) serializable2;
                if (obk0Var != null) {
                    ldi0 ldi0VarI0 = rbi0Var.I0();
                    ol60 ol60Var = ldi0VarI0.I;
                    int iOrdinal = obk0Var.ordinal();
                    if (iOrdinal == 0) {
                        ldi0VarI0.E();
                        ldi0VarI0.H(hfi0.SMS);
                    } else if (iOrdinal == 1) {
                        ol60Var.f(sci0.f31988a);
                        ldi0VarI0.H(hfi0.VOICE_SMS);
                    } else if (iOrdinal == 2) {
                        ol60Var.f(rci0.f30241a);
                        ldi0VarI0.H(hfi0.TELEGRAM);
                    } else if (iOrdinal != 3) {
                        t9f.b();
                    } else {
                        ol60Var.f(lci0.f19802a);
                    }
                }
                break;
            case 11:
                rl70 rl70Var2 = d2b0.S1;
                str.getClass();
                ((k3t0) ((d2b0) obj).L1.getValue()).x(a2b0.f117a);
                break;
            case 12:
                u6b0 u6b0Var = (u6b0) obj;
                xi70 xi70Var = u6b0.e2;
                str.getClass();
                String strH = u6b0Var.H(R.string.tfa_enabled_with_secret_code_v2);
                strH.getClass();
                sbb0 sbb0VarJ0 = u6b0Var.J0();
                sac.V(jiu0.a(sbb0VarJ0), new gab0(sbb0VarJ0, b2), null, sbb0VarJ0.q.f22085a, new ah0((Object) bundle, (Object) str, (Object) strH, (Object) sbb0VarJ0, (yje) null, (byte) 14), 10);
                break;
            case 14:
                vic0 vic0Var = (vic0) obj;
                iiy[] iiyVarArr3 = vic0.S1;
                str.getClass();
                if (str.equals("BONUS_BOUGHT_REQUEST_KEY") && bundle.containsKey("BONUS_BOUGHT_RESULT_KEY_USER_ID")) {
                    k390 k390Var = new k390(bundle.getLong("BONUS_BOUGHT_RESULT_KEY_USER_ID"), bundle.getLong("BONUS_BOUGHT_RESULT_KEY_ACCOUNT_ID"), bundle.getDouble("BONUS_BOUGHT_RESULT_KEY_ACCOUNT_BALANCE"), bundle.getInt("BONUS_BOUGHT_RESULT_KEY_BONUS_BALANCE"), bundle.getInt("BONUS_BOUGHT_RESULT_KEY_ROTATION_COUNT"));
                    int i = bundle.getInt("BONUS_BOUGHT_RESULT_KEY_BOUGHT_COUNT");
                    TextView textView = vic0Var.G0().e;
                    textView.setText(String.valueOf(i));
                    textView.setVisibility(0);
                    Rect rect = new Rect();
                    Rect rect2 = new Rect();
                    Rect rect3 = new Rect();
                    vic0Var.G0().c.getGlobalVisibleRect(rect);
                    vic0Var.G0().f39208a.getGlobalVisibleRect(rect2);
                    rect.offset(-rect2.left, -rect2.top);
                    rect3.set(vic0Var.N1);
                    rect3.offset(-rect2.left, -rect2.top);
                    TextView textView2 = vic0Var.G0().e;
                    TextView textView3 = vic0Var.G0().h;
                    ViewPropertyAnimator viewPropertyAnimatorAlpha = textView2.animate().x(rect.left).y(rect.top).alpha(0.0f);
                    viewPropertyAnimatorAlpha.setStartDelay(100L);
                    viewPropertyAnimatorAlpha.setListener(new x73(null, new lc0((byte) 3, i, textView2, vic0Var, textView3, rect3), 11));
                    vic0Var.P1 = viewPropertyAnimatorAlpha;
                    viewPropertyAnimatorAlpha.start();
                    hjc0 hjc0VarH0 = vic0Var.H0();
                    hjc0VarH0.x();
                    hjc0VarH0.w(new e16(k390Var));
                }
                break;
            case 15:
                ukc0 ukc0Var = (ukc0) obj;
                iiy[] iiyVarArr4 = ukc0.Q1;
                str.getClass();
                if (str.equals("GameIsNotFinishedDialog.REQUEST_KEY")) {
                    if (bundle.containsKey("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE")) {
                        ((tnc0) ukc0Var.G0().h.f19899a).b.f6362a.d("NEED_SHOW_GAME_NOT_FINISHED_DIALOG", !bundle.getBoolean("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE"));
                    } else if (bundle.containsKey("GameIsNotFinishedDialog.RESULT_KEY_EXIT")) {
                        boolean z2 = bundle.getBoolean("GameIsNotFinishedDialog.RESULT_KEY_EXIT");
                        clc0 clc0VarG0 = ukc0Var.G0();
                        ((tnc0) clc0VarG0.h.f19899a).b.f6362a.d("NEED_SHOW_GAME_NOT_FINISHED_DIALOG", !z2);
                        i1w0 i1w0Var = clc0VarG0.b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                        }
                    }
                    break;
                }
                break;
            case 16:
                nh70 nh70Var2 = h6d0.Q1;
                str.getClass();
                r6d0 r6d0VarJ0 = ((h6d0) obj).J0();
                bby bbyVar = r6d0VarJ0.j;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                p7m0 p7m0Var = r6d0VarJ0.k;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, o6d0.a((o6d0) value, null, false, false, 9)));
                break;
            case 17:
                rl70 rl70Var3 = bfe0.R1;
                str.getClass();
                ((bfe0) obj).G0().x(jee0.f16370a);
                break;
            case 21:
                avg0 avg0Var = (avg0) obj;
                cge0 cge0Var = avg0.P1;
                str.getClass();
                if (str.equals("REQUEST_CONFIRM_SALE_DIALOG_KEY") && bundle.containsKey("BET_SALE_CONFIRM_REQUEST")) {
                    avg0Var.H0().x(qtg0.f29298a);
                }
                break;
            case 23:
                joh0 joh0Var = (joh0) obj;
                eke0 eke0Var = joh0.N1;
                str.getClass();
                String strH2 = joh0Var.H(R.string.tfa_enabled_with_secret_code_v2);
                strH2.getClass();
                iph0 iph0VarH0 = joh0Var.H0();
                sac.V(jiu0.a(iph0VarH0), new jjh0(1, iph0VarH0, iph0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 11), null, iph0VarH0.s.f22085a, new ah0((Object) bundle, (Object) str, (Object) strH2, (Object) iph0VarH0, (yje) null, (byte) 17), 10);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                oph0 oph0Var = (oph0) obj;
                gle0 gle0Var2 = oph0.Q1;
                str.getClass();
                String strH3 = oph0Var.H(R.string.tfa_enabled_with_secret_code_v2);
                strH3.getClass();
                zuh0 zuh0VarI0 = oph0Var.I0();
                sac.V(jiu0.a(zuh0VarI0), new jjh0(1, zuh0VarI0, zuh0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 28), null, zuh0VarI0.q.f22085a, new ah0((Object) bundle, (Object) str, (Object) strH3, (Object) zuh0VarI0, (yje) null, (byte) 19), 10);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                cqh0 cqh0Var = (cqh0) obj;
                gne0 gne0Var = cqh0.N1;
                str.getClass();
                String strH4 = cqh0Var.H(R.string.tfa_enabled_with_secret_code_v2);
                strH4.getClass();
                irh0 irh0VarH0 = cqh0Var.H0();
                sac.V(jiu0.a(irh0VarH0), new jjh0(1, irh0VarH0, irh0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 21), null, irh0VarH0.r.f22085a, new ah0((Object) bundle, (Object) str, (Object) strH4, (Object) irh0VarH0, (yje) null, (byte) 18), 10);
                break;
        }
    }
}
