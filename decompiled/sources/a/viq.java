package a;

import android.content.ClipData;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.sms.common.ReadSmsConstant;
import java.io.Serializable;
import kotlin.Unit;
import org.xplatform.statistic.grand_prix.presentation.model.SeasonItemUIModel;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class viq implements b28, lzw, ikf0, OnSuccessListener, k4r, Continuation, zon0, hbj, nh60, zy3, eer, diq, d1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37492a;
    public final /* synthetic */ Object b;

    public /* synthetic */ viq(Object obj, byte b) {
        this.f37492a = b;
        this.b = obj;
    }

    @Override // a.b28
    public long a(long j) {
        ajq ajqVar = (ajq) this.b;
        return vtt0.j((j * ((long) ajqVar.e)) / 1000000, 0L, ajqVar.j - 1);
    }

    @Override // a.zy3
    public ig00 apply(Object obj) {
        return (ig00) ((ebz) this.b).invoke(obj);
    }

    @Override // a.zon0
    public void b() {
        byte b = this.f37492a;
        Object obj = this.b;
        switch (b) {
            case 8:
                rqt rqtVar = izv.d2;
                ((izv) obj).M0().c.C(false);
                break;
            default:
                atz atzVar = ik30.W1;
                ((ik30) obj).H0().w(true);
                break;
        }
    }

    @Override // a.diq
    public void c(float f) {
        xm30 xm30Var = (xm30) this.b;
        zeu0 zeu0Var = xm30Var.p2.b;
        if (zeu0Var.f != f) {
            zeu0Var.f = f;
            zeu0Var.c(false);
        }
        xm30Var.D0(xm30Var.n1);
    }

    @Override // a.hbj
    public jbj d() {
        return ((hbj) ((psc) this.b).b).d();
    }

    @Override // a.d1x
    public void e(e1x e1xVar) {
        ld40 ld40Var = (ld40) this.b;
        synchronized (ld40Var.f19832a) {
            ld40Var.c++;
        }
        ld40Var.e(e1xVar);
    }

    @Override // a.ikf0
    public void f(long j, fq80 fq80Var) {
        nnw0.D(j, fq80Var, ((x6r) this.b).J);
    }

    @Override // a.lzw
    public void g() {
        ((odd) this.b).N(Unit.f46060a);
    }

    public boolean h(hnu hnuVar, int i, Bundle bundle) {
        oee prcVar;
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.b;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((oex) hnuVar.f13365a).m();
                Parcelable parcelable = (Parcelable) ((oex) hnuVar.f13365a).h();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        oex oexVar = (oex) hnuVar.f13365a;
        ClipData clipData = new ClipData(oexVar.getDescription(), new ClipData.Item(oexVar.l()));
        if (i2 >= 31) {
            prcVar = new prc(clipData, 2);
        } else {
            pee peeVar = new pee();
            peeVar.b = clipData;
            peeVar.c = (byte) 2;
            prcVar = peeVar;
        }
        prcVar.d(oexVar.o());
        prcVar.setExtras(bundle);
        return rgu0.k(appCompatEditText, prcVar.build()) == null;
    }

    @Override // a.k4r
    public void i(Bundle bundle, String str) {
        Serializable serializable;
        String string;
        byte b = this.f37492a;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 4:
                g8v g8vVar = (g8v) obj;
                rqt rqtVar = g8v.P1;
                str.getClass();
                if (str.equals("X_GAMES_UM_BUTTON_CLICK_RESULT_KEY")) {
                    g8vVar.I0().x(d8v.f5670a);
                    break;
                }
                break;
            case 7:
                ddv ddvVar = (ddv) obj;
                art artVar = ddv.Q1;
                str.getClass();
                if (str.equals("REQUEST_SELECT_SEASON_FILTER_DIALOG_KEY") && bundle.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                    SeasonItemUIModel seasonItemUIModel = (SeasonItemUIModel) (Build.VERSION.SDK_INT <= 33 ? bundle.getParcelable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY") : (Parcelable) bundle.getParcelable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY", SeasonItemUIModel.class));
                    if (seasonItemUIModel != null) {
                        ((k3t0) ddvVar.O1.getValue()).x(new xcv(seasonItemUIModel.f47031a));
                    }
                }
                break;
            case 12:
                s0z s0zVar = (s0z) obj;
                bst bstVar = s0z.U1;
                str.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = bundle.getSerializable("REQUEST_SELECT_FILTER_MODEL", n3q.class);
                } else {
                    Serializable serializable2 = bundle.getSerializable("REQUEST_SELECT_FILTER_MODEL");
                    serializable = (n3q) (serializable2 instanceof n3q ? serializable2 : null);
                }
                n3q n3qVar = (n3q) serializable;
                if (n3qVar != null) {
                    ((k3t0) s0zVar.S1.getValue()).x(new f0z(n3qVar));
                }
                break;
            case 15:
                eyz eyzVar = (eyz) obj;
                evz evzVar = eyz.O1;
                str.getClass();
                if (str.equals("REQUEST_SET_LIMIT_KEY") && bundle.containsKey("NEW_LIMIT_RESULT") && (string = bundle.getString("NEW_LIMIT_RESULT")) != null) {
                    eyzVar.G0().x(new kxz(string));
                }
                break;
            case 16:
                wsz wszVar = ce00.P1;
                str.getClass();
                ((ce00) obj).H0().y();
                break;
            case 17:
                atz atzVar = i820.U1;
                str.getClass();
                int i = bundle.getInt("RESULT_POSITION");
                wze wzeVarH0 = ((i820) obj).H0();
                sac.V(jiu0.a(wzeVarH0), new z6e(1, wzeVarH0, wze.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, wzeVarH0.o.b, new bh0(wzeVarH0, i, z ? 1 : 0, (byte) 8), 10);
                break;
            case 18:
                htz htzVar = b920.U1;
                str.getClass();
                ((b920) obj).J0().x(new a520(bundle.getInt("RESULT_POSITION")));
                break;
            case 22:
                atz atzVar2 = f840.O1;
                str.getClass();
                ((f840) obj).H0().x(s740.f31732a);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                evz evzVar2 = b160.O1;
                str.getClass();
                ((b160) obj).H0().x(iy50.f15574a);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lo60 lo60Var = (lo60) obj;
                htz htzVar2 = lo60.U1;
                str.getClass();
                if (str.equals("GameIsNotFinishedDialog.REQUEST_KEY")) {
                    if (bundle.containsKey("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE")) {
                        ((SharedPreferences) lo60Var.H0().t.f41419a.b.f20589a).edit().putBoolean("SHOW_GAME_IS_NOT_FINISHED_DIALOG", !bundle.getBoolean("GameIsNotFinishedDialog.RESULT_KEY_CONTINUE")).apply();
                    } else if (bundle.containsKey("GameIsNotFinishedDialog.RESULT_KEY_EXIT")) {
                        boolean z2 = bundle.getBoolean("GameIsNotFinishedDialog.RESULT_KEY_EXIT");
                        sp70 sp70VarH0 = lo60Var.H0();
                        ((SharedPreferences) sp70VarH0.t.f41419a.b.f20589a).edit().putBoolean("SHOW_GAME_IS_NOT_FINISHED_DIALOG", !z2).apply();
                        sp70VarH0.w(new iy5(csr.e));
                        sp70VarH0.B();
                    }
                    break;
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                gs60 gs60Var = (gs60) obj;
                uuz uuzVar = gs60.R1;
                str.getClass();
                if (str.equals("SELECT_BALANCE_REQUEST_KEY") && bundle.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                    Serializable serializable3 = bundle.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                    serializable3.getClass();
                    gs60Var.G0().x(new sp60((ql5) serializable3));
                }
                break;
            default:
                xt60 xt60Var = (xt60) obj;
                xuz xuzVar = xt60.V1;
                str.getClass();
                if (str.equals("SELECT_BALANCE_REQUEST_KEY") && bundle.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                    Serializable serializable4 = bundle.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                    serializable4.getClass();
                    xt60Var.G0().x(new gt60((ql5) serializable4));
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        byte b = this.f37492a;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                ((enm) obj2).invoke(obj);
                break;
            case 6:
                ((t3t) obj2).invoke(obj);
                break;
            default:
                nvu nvuVar = (nvu) obj2;
                nvuVar.d = new md3(nvuVar, (byte) 5);
                jiq0.t0((us00) nvuVar.b, (md3) nvuVar.d, new IntentFilter(ReadSmsConstant.READ_SMS_BROADCAST_ACTION));
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Exception exception;
        a6u a6uVar = (a6u) this.b;
        a6uVar.getClass();
        if (task.isSuccessful() || (exception = task.getException()) == null || TextUtils.isEmpty(exception.getMessage()) || !exception.getMessage().contains("FID_ALREADY_USED:")) {
            return task;
        }
        Log.w("FirebaseMessaging", "FID_ALREADY_USED Detected. Retrying with FID cache clearing!");
        ((cgq) ((dgq) a6uVar.d)).c.g().delete();
        return a6uVar.L();
    }

    @Override // a.eer
    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public Object mo11apply(Object obj) {
        return (Void) ((k9v) this.b).invoke(obj);
    }
}
