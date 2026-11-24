package a;

import android.content.Context;
import android.javax.sip.message.Response;
import android.widget.FrameLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dj1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6162a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        byte b = 19;
        switch (this.f6162a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                xuz xuzVar = pb10.c;
                pb10 pb10Var = pb10.g;
                xuzVar.getClass();
                return new mdm(xuz.a(pb10Var, iIntValue), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case 1:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case 2:
                dl1 dl1Var = (dl1) obj;
                dl1Var.getClass();
                return new el1(dl1Var.f6257a, dl1Var.b, dl1Var.c);
            case 3:
                ob0 ob0Var = (ob0) obj;
                ob0Var.getClass();
                return new un1(ob0Var);
            case 4:
                String str = (String) obj;
                str.getClass();
                return Long.valueOf(str.length() == 0 ? 0L : 500L);
            case 5:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                pz40 pz40Var = s6t0.f31722a;
                long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar.w0(16.0f);
                fhl.o0(fhlVar, backgroundContent, 0L, 0L, (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), null, 246);
                return Unit.f46060a;
            case 6:
                qu1 qu1Var = (qu1) obj;
                qu1Var.getClass();
                zu1 zu1Var = av1.f1505a;
                int iOrdinal = qu1Var.ordinal();
                if (iOrdinal == 0) {
                    return av1.f1505a;
                }
                if (iOrdinal == 1) {
                    return av1.b;
                }
                if (iOrdinal == 2) {
                    return av1.c;
                }
                if (iOrdinal == 3) {
                    return av1.d;
                }
                t9f.b();
                return null;
            case 7:
                int iIntValue2 = ((Integer) obj).intValue();
                xuz xuzVar2 = pb10.c;
                pb10 pb10Var2 = pb10.g;
                xuzVar2.getClass();
                return new mdm(xuz.a(pb10Var2, iIntValue2), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case 8:
                ob0 ob0Var2 = (ob0) obj;
                ob0Var2.getClass();
                return new su1(ob0Var2);
            case 9:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 10:
                ((c53) obj).getClass();
                zsf zsfVar = ix1.f15518a;
                return ay3.e0(kzn.j(ro4.m0(300, 0, zsfVar, 2), new or3(b)), kzn.l(ro4.m0(300, 0, zsfVar, 2), new dj1((byte) 11)));
            case 11:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 12:
                ((c53) obj).getClass();
                zsf zsfVar2 = kx1.f19029a;
                return ay3.e0(kzn.j(ro4.m0(300, 0, zsfVar2, 2), new or3(b)), kzn.l(ro4.m0(300, 0, zsfVar2, 2), new dj1((byte) 13)));
            case 13:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 14:
                ry1 ry1Var = (ry1) obj;
                ry1Var.getClass();
                return Long.valueOf(((py1) ry1Var).b);
            case 15:
                kg kgVar = (kg) obj;
                kgVar.getClass();
                int iOrdinal2 = kgVar.ordinal();
                if (iOrdinal2 == 0) {
                    return ijl.f14880a;
                }
                if (iOrdinal2 == 1) {
                    return ijl.b;
                }
                if (iOrdinal2 == 2) {
                    return ijl.c;
                }
                if (iOrdinal2 == 3) {
                    return ijl.d;
                }
                if (iOrdinal2 == 4) {
                    return ijl.e;
                }
                t9f.b();
                return null;
            case 16:
                ob0 ob0Var3 = (ob0) obj;
                ob0Var3.getClass();
                return new yy1(ob0Var3);
            case 17:
                Context context = (Context) obj;
                context.getClass();
                return new FrameLayout(context);
            case 18:
                FrameLayout frameLayout = (FrameLayout) obj;
                frameLayout.getClass();
                frameLayout.removeAllViews();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.c(abi0Var, R.drawable.ic_glyph_document);
                return Unit.f46060a;
            case 20:
                ((fhl) obj).getClass();
                return Unit.f46060a;
            case 21:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 22:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 23:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 24:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                inh0 inh0Var = (inh0) obj;
                jdk0 jdk0Var = t42.p2;
                inh0Var.getClass();
                return inh0Var.f15074a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                b92 b92Var = (b92) obj;
                b92Var.getClass();
                if (b92Var.c) {
                    i = R.drawable.bg_special_event_tablet;
                } else {
                    i = b92Var.e ? R.drawable.bg_special_event_small : R.drawable.bg_special_event_default;
                }
                return new z82(i, q5x.B(b92Var.d.u, b92Var.f2186a, b92Var.f));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                p6t0 p6t0Var2 = (p6t0) obj;
                p6t0Var2.getClass();
                return p6t0Var2.getKey();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                p6t0 p6t0Var3 = (p6t0) obj;
                p6t0Var3.getClass();
                return sre0.f32672a.b(p6t0Var3.getClass());
            default:
                j2g0 j2g0Var = (j2g0) obj;
                j2g0Var.getClass();
                return new ta2(j2g0Var);
        }
    }

    public /* synthetic */ dj1(byte b) {
        this.f6162a = b;
    }
}
