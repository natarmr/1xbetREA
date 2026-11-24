package a;

import android.os.Looper;
import android.view.Choreographer;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t32 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33244a;

    public /* synthetic */ t32(byte b) {
        this.f33244a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Choreographer choreographer;
        byte b = this.f33244a;
        u1g0 u1g0Var = u1g0.f34901a;
        bid bidVar = bid.f2654a;
        byte b2 = 0;
        yje yjeVar = null;
        switch (b) {
            case 0:
                int i = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                return bidVar;
            case 1:
                pek0 pek0Var = w62.Q1;
                return new qdz();
            case 2:
                rek0 rek0Var = ia2.Q1;
                return new qdz();
            case 3:
                int i2 = hb2.E;
                return u1g0Var;
            case 4:
                gfk0 gfk0Var = vd2.R1;
                return new qdz();
            case 5:
                int i3 = le2.F;
                return bidVar;
            case 6:
                hfk0 hfk0Var = ef2.V1;
                return new qdz();
            case 7:
                int i4 = hh2.O;
                return bidVar;
            case 8:
                int i5 = hh2.O;
                return u1g0Var;
            case 9:
                return new ei2(null, true, dqp0.f6528a, false, false, true, null);
            case 10:
                int i6 = ul2.S;
                return bidVar;
            case 11:
                return new zl2(iun.f15405a, ih2.Events);
            case 12:
                int i7 = yn2.g0;
                return bidVar;
            case 13:
                return new zw3(okx.f25427a, (byte) 0);
            case 14:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 15:
                jdk0 jdk0Var = qo2.R1;
                mo2 mo2Var = new mo2();
                ((dp) mo2Var.e).b(new gbn(new ma2((byte) 20), new l9(3, (byte) 19), new m51(mo2Var, (byte) 24), m9.u));
                return mo2Var;
            case 16:
                return new zw3(nd6.f23325a, (byte) 0);
            case 17:
                return new uua0(sre0.f32672a.b(kuw.class), new Annotation[0]);
            case 18:
                return new SimpleDateFormat("HH:mm:ss dd.MM.yyyy", Locale.getDefault());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                dy2.a("LocalConfiguration");
                throw null;
            case 20:
                dy2.a("LocalContext");
                throw null;
            case 21:
                dy2.a("LocalImageVectorCache");
                throw null;
            case 22:
                dy2.a("LocalResourceIdCache");
                throw null;
            case 23:
                dy2.a("LocalView");
                throw null;
            case 24:
                return UUID.randomUUID();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return UUID.randomUUID();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return "DEFAULT_TEST_TAG";
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    rwj rwjVar = tvk.f34603a;
                    choreographer = (Choreographer) eeq.U(ys10.f43147a, new p23(2, yjeVar, b2));
                }
                r23 r23Var = new r23(choreographer, thb.y(Looper.getMainLooper()));
                return kotlin.coroutines.e.c(r23Var, r23Var.l);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                return Unit.f46060a;
        }
    }
}
