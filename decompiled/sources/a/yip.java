package a;

import android.content.Context;
import androidx.biometric.internal.ui.FingerprintDialogActivity;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.util.Arrays;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yip implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42704a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yip(Object obj, byte b) {
        this.f42704a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws InterruptedException {
        Object value;
        Object value2;
        byte b = this.f42704a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (thp) ((gii0) ((iqi) obj).c).b(sre0.f32672a.b(thp.class));
            case 1:
                return (csp) ((gii0) ((jtj) obj).b).b(sre0.f32672a.b(csp.class));
            case 2:
                sek sekVar = wtp.R1;
                fiu0 fiu0Var = ((wtp) obj).M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 3:
                return (ntp) ((gii0) ((zri) obj).b).b(sre0.f32672a.b(ntp.class));
            case 4:
                return (ovp) ((gii0) ((iqi) obj).c).b(sre0.f32672a.b(ovp.class));
            case 5:
                return (awp) ((gii0) ((fhj) obj).f9543a).b(sre0.f32672a.b(awp.class));
            case 6:
                return (owp) ((gii0) ((zri) obj).b).b(sre0.f32672a.b(owp.class));
            case 7:
                return (lxp) ((gii0) ((hsj) obj).f13586a).b(sre0.f32672a.b(lxp.class));
            case 8:
                return (jyp) ((gii0) ((iqi) obj).c).b(sre0.f32672a.b(jyp.class));
            case 9:
                int i = q9q.m2;
                fiu0 fiu0Var2 = ((q9q) obj).k2;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 10:
                int i2 = FingerprintDialogActivity.Z;
                return ((FingerprintDialogActivity) obj).n();
            case 11:
                ((lhq) obj).f20069a.await();
                return Unit.f46060a;
            case 12:
                ((nqq) obj).b1();
                return Unit.f46060a;
            case 13:
                return (tuq) ((gii0) ((zri) obj).b).b(sre0.f32672a.b(tuq.class));
            case 14:
                b8r b8rVar = (b8r) obj;
                Context context = b8rVar.f2170a;
                String str = b8rVar.b;
                a8r a8rVar = (str == null || !b8rVar.d) ? new a8r(context, b8rVar.b, new bwl((byte) 10), b8rVar.c, b8rVar.e) : new a8r(context, new File(context.getNoBackupFilesDir(), str).getAbsolutePath(), new bwl((byte) 10), b8rVar.c, b8rVar.e);
                a8rVar.setWriteAheadLoggingEnabled(b8rVar.g);
                return a8rVar;
            case 15:
                xak xakVar = lar.Q1;
                fiu0 fiu0Var3 = ((lar) obj).N1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 16:
                ctf0 ctf0Var = ((ecr) obj).b;
                Set set = fcr.f9324a;
                return new wul(iul.e, oe9.f25112a, new ue9(ctf0Var.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), true, false, true);
            case 17:
                return Integer.valueOf(((zbr) obj).c.f39885a.size());
            case 18:
                bek bekVar = qcr.Q1;
                fiu0 fiu0Var4 = ((qcr) obj).O1;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                boolean zB = ((yiu) obj).f42713a.f15748a.b();
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return new scr("", lunVar, true, false, zB);
            case 20:
                hkr hkrVar = (hkr) obj;
                p7m0 p7m0Var = hkrVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    hkrVar.f.getClass();
                } while (!p7m0Var.m(value, ekr.a((ekr) value, null, false, 1)));
                return Unit.f46060a;
            case 21:
                return (fjr) ((gii0) ((wti) obj).b).b(sre0.f32672a.b(fjr.class));
            case 22:
                p7m0 p7m0Var2 = ((vkr) obj).g;
                do {
                    value2 = p7m0Var2.getValue();
                    ((Boolean) value2).getClass();
                } while (!p7m0Var2.m(value2, Boolean.FALSE));
                return Unit.f46060a;
            case 23:
                ((spr) obj).G(nnr.b);
                return Unit.f46060a;
            case 24:
                return new zpr((ypr) obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((f0s) obj).j();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((k4s) obj).G(v2s.f36701a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((g9s) obj).G(o7s.f24801a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (ebs) ((gii0) ((iqi) obj).c).b(sre0.f32672a.b(ebs.class));
            default:
                xak xakVar2 = jbs.R1;
                fiu0 fiu0Var5 = ((jbs) obj).O1;
                if (fiu0Var5 != null) {
                    return fiu0Var5;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
