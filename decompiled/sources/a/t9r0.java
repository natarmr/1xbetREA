package a;

import android.javax.sip.message.Response;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t9r0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33582a;

    public /* synthetic */ t9r0(byte b) {
        this.f33582a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f33582a) {
            case 0:
                fhl fhlVar = (fhl) obj;
                j6m0 j6m0Var = v9r0.O1;
                fhlVar.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.u(fhlVar, s6t0.b().f33626a.getBackgroundContent(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 1:
                upk0 upk0Var = (upk0) obj;
                upk0Var.getClass();
                return Integer.valueOf(upk0Var.f36070a);
            case 2:
                qpo qpoVar = (qpo) obj;
                qpoVar.getClass();
                return Long.valueOf(qpoVar.f29130a);
            case 3:
                h1b0 h1b0Var = (h1b0) obj;
                h1b0Var.getClass();
                return Long.valueOf(h1b0Var.f12275a);
            case 4:
                ((h1b0) obj).getClass();
                return sre0.f32672a.b(h1b0.class);
            case 5:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 6:
                p6t0 p6t0Var2 = (p6t0) obj;
                p6t0Var2.getClass();
                return sre0.f32672a.b(p6t0Var2.getClass());
            case 7:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                pz40 pz40Var2 = s6t0.f31722a;
                fhl.u(fhlVar2, s6t0.b().f33626a.getBackground(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 8:
                View view = (View) obj;
                s2m0 s2m0Var = udr0.O1;
                view.getClass();
                RecyclerView recyclerView = (RecyclerView) view;
                return new c6r(recyclerView, recyclerView);
            case 9:
                qdr0 qdr0Var = (qdr0) obj;
                qdr0Var.getClass();
                return qdr0Var.getKey();
            case 10:
                qdr0 qdr0Var2 = (qdr0) obj;
                qdr0Var2.getClass();
                return sre0.f32672a.b(qdr0Var2.getClass());
            case 11:
                o8r0 o8r0Var = (o8r0) obj;
                o8r0Var.getClass();
                n8r0 n8r0Var = o8r0Var.f24845a;
                int i = o8r0Var.b;
                int iOrdinal = n8r0Var.ordinal();
                if (iOrdinal == 0) {
                    pdm pdmVar = pdm.d;
                    xuz xuzVar = pb10.c;
                    return new mdm(R.string.empty_str, pdmVar, null, 0, 0, 0, 0, 0, 0L, 0L, 1020);
                }
                if (iOrdinal == 1) {
                    xuz xuzVar2 = pb10.c;
                    pb10 pb10Var = pb10.g;
                    xuzVar2.getClass();
                    return new mdm(xuz.a(pb10Var, i), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                }
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                xuz xuzVar3 = pb10.c;
                pb10 pb10Var2 = pb10.g;
                xuzVar3.getClass();
                return new mdm(xuz.a(pb10Var2, i), null, null, 0, 0, R.string.currently_no_events, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case 12:
                m470 m470Var = (m470) obj;
                m470Var.getClass();
                return new cer0(m470Var);
            case 13:
                eer0 eer0Var = (eer0) obj;
                eer0Var.getClass();
                return eer0Var;
            case 14:
                d5l0 d5l0Var = (d5l0) obj;
                d5l0Var.getClass();
                return new der0(d5l0Var);
            case 15:
                dw60 dw60Var = (dw60) obj;
                dw60Var.getClass();
                return new ber0(dw60Var);
            case 16:
                tk0 tk0Var = (tk0) obj;
                tk0Var.getClass();
                return new zdr0(tk0Var);
            case 17:
                ((k0g0) obj).getClass();
                return Unit.f46060a;
            case 18:
                ((kfk0) obj).getClass();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                vd80 vd80Var = (vd80) obj;
                vd80Var.getClass();
                return vd80Var.d;
            case 20:
                ntr0 ntr0Var = (ntr0) obj;
                ntr0Var.getClass();
                return Boolean.valueOf(ntr0Var.b);
            case 21:
                ntr0 ntr0Var2 = (ntr0) obj;
                ntr0Var2.getClass();
                return ntr0Var2.f24114a;
            case 22:
                awr0 awr0Var = (awr0) obj;
                awr0Var.getClass();
                return Integer.valueOf(awr0Var.f1589a);
            case 23:
                fhl fhlVar3 = (fhl) obj;
                fhlVar3.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar3.w0(36.0f);
                y3d y3dVar = new y3d(y3d.f);
                long j = kkg.J;
                fhl.r(fhlVar3, yk5.n(q3d.j(y3dVar, new y3d(j)), 0.0f, fW0, 8), 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar3.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L), 0.0f, null, null, 0, 122);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar3.d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar3.d() & 4294967295L)) - fW0;
                fhl.u(fhlVar3, j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), 0.0f, null, null, 0, 120);
                StaticColors staticColors = StaticColors.INSTANCE;
                fhl.r(fhlVar3, yk5.n(q3d.j(new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(staticColors.m73getBlack400d7_KjU())), fW0, Float.intBitsToFloat((int) (4294967295L & fhlVar3.d())), 8), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 24:
                List list = (List) obj;
                list.getClass();
                ngk0 ngk0Var = new ngk0();
                for (List list2 : CollectionsKt.Q0(list, 3, 3)) {
                    if (list2.size() >= 3) {
                        Long lValueOf = Long.valueOf((long) ((Number) list2.get(0)).floatValue());
                        float fFloatValue = ((Number) list2.get(1)).floatValue();
                        float fFloatValue2 = ((Number) list2.get(2)).floatValue();
                        ngk0Var.put(lValueOf, new ne60((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue2)) & 4294967295L)));
                    }
                }
                return ngk0Var;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                imy imyVar = (imy) obj;
                imyVar.getClass();
                imyVar.f15048a = 2600;
                Float fValueOf = Float.valueOf(0.0f);
                imyVar.a(0, fValueOf);
                imyVar.a(1000, fValueOf);
                Float fValueOf2 = Float.valueOf(0.6f);
                imyVar.a(1300, fValueOf2);
                imyVar.a(2300, fValueOf2);
                imyVar.a(2600, fValueOf);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fee feeVar = (fee) obj;
                feeVar.getClass();
                return kpb.o0((bqr) feeVar.c(), false);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                f3s0 f3s0Var = (f3s0) obj;
                f3s0Var.getClass();
                return f3s0Var.getKey();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                f3s0 f3s0Var2 = (f3s0) obj;
                f3s0Var2.getClass();
                return sre0.f32672a.b(f3s0Var2.getClass());
            default:
                return epv0.O(((Integer) obj).intValue());
        }
    }
}
