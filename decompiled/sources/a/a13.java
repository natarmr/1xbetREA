package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.provider.Settings;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.app_update.impl.presentation.update_screen.views.AppUpdateScreenLayout;
import org.xplatform.ui_core.viewcomponents.views.AnimatingPasswordTextView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a13 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f50a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a13(Object obj, byte b) {
        this.f50a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f50a;
        Object obj = this.b;
        switch (b) {
            case 0:
                d5c.G(((c13) obj).c, null);
                return Unit.f46060a;
            case 1:
                vfc.J((p13) obj);
                return Unit.f46060a;
            case 2:
                r13 r13Var = (r13) obj;
                r13Var.f29657a.a(r13Var.b).getClass();
                throw new ClassCastException();
            case 3:
                return ((v4q0) obj).G();
            case 4:
                return Unit.f46060a;
            case 5:
                return new StringBuilder(((AnimatingPasswordTextView) obj).f47206a);
            case 6:
                int i = AnimatingPasswordTextView.i;
                ((y63) obj).run();
                return Unit.f46060a;
            case 7:
                pek0 pek0Var = q93.Q1;
                fiu0 fiu0Var = ((q93) obj).L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 8:
                Context applicationContext = ((ya3) obj).f254a.getApplicationContext();
                applicationContext.getClass();
                ComponentCallbacks2 componentCallbacks2 = (Application) applicationContext;
                af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(ldv0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof ldv0)) {
                        ze3Var = null;
                    }
                    ldv0 ldv0Var = (ldv0) ze3Var;
                    if (ldv0Var != null) {
                        return ldv0Var.a();
                    }
                }
                jf4.n(b1j.i(ldv0.class, "Cannot create dependency "));
                return null;
            case 9:
                return ohs0.n(Settings.Secure.getString(((zf3) obj).f44283a.getContentResolver(), "android_id"), "_2");
            case 10:
                ConstraintLayout constraintLayout = ((dg3) obj).f6029a;
                ImageView imageView = new ImageView(constraintLayout.getContext());
                imageView.setId(View.generateViewId());
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setVisibility(8);
                a3e a3eVar = new a3e(0, 0);
                a3eVar.i = 0;
                a3eVar.l = 0;
                a3eVar.t = 0;
                a3eVar.v = 0;
                constraintLayout.addView(imageView, a3eVar);
                return imageView;
            case 11:
                int i2 = AppUpdateScreenLayout.A;
                return new abk0((AppUpdateScreenLayout) obj);
            case 12:
                hfk0 hfk0Var = tn3.c2;
                fiu0 fiu0Var2 = ((tn3) obj).Y1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 13:
                Context applicationContext2 = ((xo3) obj).f254a.getApplicationContext();
                applicationContext2.getClass();
                ComponentCallbacks2 componentCallbacks3 = (Application) applicationContext2;
                af3 af3Var2 = componentCallbacks3 instanceof af3 ? (af3) componentCallbacks3 : null;
                if (af3Var2 != null) {
                    o5d0 o5d0Var2 = (o5d0) af3Var2.d().get(ldv0.class);
                    ze3 ze3Var2 = o5d0Var2 != null ? (ze3) o5d0Var2.get() : null;
                    if (!(ze3Var2 instanceof ldv0)) {
                        ze3Var2 = null;
                    }
                    ldv0 ldv0Var2 = (ldv0) ze3Var2;
                    if (ldv0Var2 != null) {
                        return ldv0Var2.a();
                    }
                }
                jf4.n(b1j.i(ldv0.class, "Cannot create dependency "));
                return null;
            case 14:
                Context applicationContext3 = ((zo3) obj).f254a.getApplicationContext();
                applicationContext3.getClass();
                ComponentCallbacks2 componentCallbacks4 = (Application) applicationContext3;
                af3 af3Var3 = componentCallbacks4 instanceof af3 ? (af3) componentCallbacks4 : null;
                if (af3Var3 != null) {
                    o5d0 o5d0Var3 = (o5d0) af3Var3.d().get(ldv0.class);
                    ze3 ze3Var3 = o5d0Var3 != null ? (ze3) o5d0Var3.get() : null;
                    if (!(ze3Var3 instanceof ldv0)) {
                        ze3Var3 = null;
                    }
                    ldv0 ldv0Var3 = (ldv0) ze3Var3;
                    if (ldv0Var3 != null) {
                        return ldv0Var3.a();
                    }
                }
                jf4.n(b1j.i(ldv0.class, "Cannot create dependency "));
                return null;
            case 15:
                Context applicationContext4 = ((ap3) obj).f254a.getApplicationContext();
                applicationContext4.getClass();
                ComponentCallbacks2 componentCallbacks5 = (Application) applicationContext4;
                af3 af3Var4 = componentCallbacks5 instanceof af3 ? (af3) componentCallbacks5 : null;
                if (af3Var4 != null) {
                    o5d0 o5d0Var4 = (o5d0) af3Var4.d().get(ldv0.class);
                    ze3 ze3Var4 = o5d0Var4 != null ? (ze3) o5d0Var4.get() : null;
                    if (!(ze3Var4 instanceof ldv0)) {
                        ze3Var4 = null;
                    }
                    ldv0 ldv0Var4 = (ldv0) ze3Var4;
                    if (ldv0Var4 != null) {
                        return ldv0Var4.a();
                    }
                }
                jf4.n(b1j.i(ldv0.class, "Cannot create dependency "));
                return null;
            case 16:
                Context applicationContext5 = ((zo3) obj).f254a.getApplicationContext();
                applicationContext5.getClass();
                ComponentCallbacks2 componentCallbacks6 = (Application) applicationContext5;
                af3 af3Var5 = componentCallbacks6 instanceof af3 ? (af3) componentCallbacks6 : null;
                if (af3Var5 != null) {
                    o5d0 o5d0Var5 = (o5d0) af3Var5.d().get(ldv0.class);
                    ze3 ze3Var5 = o5d0Var5 != null ? (ze3) o5d0Var5.get() : null;
                    if (!(ze3Var5 instanceof ldv0)) {
                        ze3Var5 = null;
                    }
                    ldv0 ldv0Var5 = (ldv0) ze3Var5;
                    if (ldv0Var5 != null) {
                        return ldv0Var5.a();
                    }
                }
                jf4.n(b1j.i(ldv0.class, "Cannot create dependency "));
                return null;
            case 17:
                iiy[] iiyVarArr = wp3.O1;
                fiu0 fiu0Var3 = ((wp3) obj).L1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("appleFortuneViewModelFactory");
                throw null;
            case 18:
                return (kp3) ((gii0) ((chf0) obj).b).b(sre0.f32672a.b(kp3.class));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ohs0.n(((us3) obj).f36191a.getPackageName(), "-user-agent/1xbet-prod-v260.1.0");
            case 20:
                return hp4.J((Object[]) obj);
            case 21:
                return Float.valueOf(((u910) obj).f());
            case 22:
                gfk0 gfk0Var = b84.P1;
                fiu0 fiu0Var4 = ((b84) obj).L1;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 23:
                return Boolean.valueOf(((ob4) obj).c);
            case 24:
                return new wul(lul.e, oe9.f25112a, new ue9(((qb4) obj).b.b.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, false);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ctf0 ctf0Var = ((pg4) obj).b;
                return new df4(ctf0Var.b.a(R.string.authorization, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.auth_login_simple_subtitle, Arrays.copyOf(new Object[0], 0)));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                hfk0 hfk0Var2 = pk4.f2;
                fiu0 fiu0Var5 = ((pk4) obj).c2;
                if (fiu0Var5 != null) {
                    return fiu0Var5;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                jdk0 jdk0Var = qk4.i2;
                fiu0 fiu0Var6 = ((qk4) obj).e2;
                if (fiu0Var6 != null) {
                    return fiu0Var6;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new wul(lul.e, oe9.f25112a, new ue9(((jo4) obj).b.b.a(R.string.offer_to_auth_login_button, Arrays.copyOf(new Object[0], 0))), true, false, false);
            default:
                return Float.valueOf((float) ((xo4) obj).e);
        }
    }
}
