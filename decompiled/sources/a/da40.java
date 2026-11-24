package a;

import android.gov.nist.core.Separators;
import android.graphics.Path;
import android.graphics.RectF;
import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.ui_core.viewcomponents.views.MultiLineChipsListView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class da40 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5730a;

    public /* synthetic */ da40(byte b) {
        this.f5730a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5730a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return new uz40(bool);
            case 1:
                ((Long) obj).getClass();
                return Unit.f46060a;
            case 2:
                ((c53) obj).getClass();
                return ay3.e0(kzn.f(ro4.m0(350, 0, ihn.f14788a, 2), 0.92f, 4).a(kzn.d(ro4.m0(250, 0, null, 6), 0.0f, 2)), kzn.g(ro4.m0(280, 0, ihn.b, 2), 0.98f, 4).a(kzn.e(ro4.m0(220, 0, null, 6), 2)));
            case 3:
                he40 he40Var = (he40) obj;
                he40Var.getClass();
                return sre0.f32672a.b(he40Var.getClass());
            case 4:
                fee feeVar = (fee) obj;
                feeVar.getClass();
                return kpb.o0((bqr) feeVar.c(), false);
            case 5:
                wus wusVar = (wus) obj;
                wusVar.getClass();
                return new zk40(wusVar);
            case 6:
                xa30 xa30Var = (xa30) obj;
                xa30Var.getClass();
                return new yk40(xa30Var);
            case 7:
                yai0.j((abi0) obj);
                return Unit.f46060a;
            case 8:
                iiy[] iiyVarArr = yai0.f42300a;
                zai0 zai0Var = xai0.y;
                Unit unit = Unit.f46060a;
                ((abi0) obj).b(zai0Var, unit);
                return unit;
            case 9:
                g7z g7zVar = (g7z) obj;
                g7zVar.getClass();
                float fW0 = g7zVar.w0(6.0f);
                a6a a6aVar = g7zVar.f10839a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (a6aVar.d() >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & a6aVar.d()));
                w03 w03VarA = z03.a();
                Path path = w03VarA.f38329a;
                w03VarA.f(0.0f, 0.0f);
                w03VarA.e(fIntBitsToFloat, 0.0f);
                w03VarA.e(fIntBitsToFloat, fIntBitsToFloat2 - fW0);
                float f = 2.0f * fW0;
                float f2 = fIntBitsToFloat - f;
                float f3 = fIntBitsToFloat2 - f;
                RectF rectF = w03VarA.b;
                if (rectF == null) {
                    rectF = new RectF();
                    w03VarA.b = rectF;
                }
                rectF.set(f2, f3, fIntBitsToFloat, fIntBitsToFloat2);
                RectF rectF2 = w03VarA.b;
                rectF2.getClass();
                path.arcTo(rectF2, 0.0f, 90.0f, false);
                w03VarA.e(fW0, fIntBitsToFloat2);
                RectF rectF3 = w03VarA.b;
                if (rectF3 == null) {
                    rectF3 = new RectF();
                    w03VarA.b = rectF3;
                }
                rectF3.set(0.0f, f3, f, fIntBitsToFloat2);
                RectF rectF4 = w03VarA.b;
                rectF4.getClass();
                path.arcTo(rectF4, 90.0f, 90.0f, false);
                w03VarA.e(0.0f, 0.0f);
                w03VarA.c();
                nr nrVar = a6aVar.b;
                long jP = nrVar.p();
                nrVar.i().l();
                try {
                    ((fvt0) nrVar.b).i(w03VarA);
                    g7zVar.a();
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVar, jP);
                }
            case 10:
                g7z g7zVar2 = (g7z) obj;
                g7zVar2.getClass();
                float fW1 = g7zVar2.w0(6.0f);
                w03 w03VarA2 = z03.a();
                w03VarA2.h();
                a6a a6aVar2 = g7zVar2.f10839a;
                w03VarA2.f(0.0f, Float.intBitsToFloat((int) (a6aVar2.d() & 4294967295L)));
                w03VarA2.e(0.0f, fW1);
                Path path2 = w03VarA2.f38329a;
                path2.quadTo(0.0f, 0.0f, fW1, 0.0f);
                w03VarA2.e(Float.intBitsToFloat((int) (a6aVar2.d() >> 32)) - fW1, 0.0f);
                path2.quadTo(Float.intBitsToFloat((int) (a6aVar2.d() >> 32)), 0.0f, Float.intBitsToFloat((int) (a6aVar2.d() >> 32)), fW1);
                w03VarA2.e(Float.intBitsToFloat((int) (a6aVar2.d() >> 32)), Float.intBitsToFloat((int) (a6aVar2.d() & 4294967295L)));
                w03VarA2.c();
                nr nrVar2 = a6aVar2.b;
                long jP2 = nrVar2.p();
                nrVar2.i().l();
                try {
                    ((fvt0) nrVar2.b).i(w03VarA2);
                    g7zVar2.a();
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVar2, jP2);
                }
            case 11:
                ((c53) obj).getClass();
                zsf zsfVar = ihn.f14788a;
                return ay3.e0(kzn.d(ro4.m0(Response.OK, 0, zsfVar, 2), 0.0f, 2), kzn.e(ro4.m0(Response.OK, 0, zsfVar, 2), 2));
            case 12:
                r370 r370Var = (r370) obj;
                r370Var.getClass();
                return Long.valueOf(r370Var.b);
            case 13:
                int i = MultiLineChipsListView.x;
                ((aw40) obj).getClass();
                return Unit.f46060a;
            case 14:
                yn80 yn80Var = (yn80) obj;
                return ohs0.m("[", yn80Var.b, ", ", Separators.RPAREN, yn80Var.c);
            case 15:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new b1w(cpVar, (byte) 26));
                return Unit.f46060a;
            case 16:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new b1w(cpVar2, (byte) 27));
                return Unit.f46060a;
            case 17:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                return rw2.o(new StringBuilder("  "), ((zsb0) entry.getKey()).f44898a, " = ", value instanceof byte[] ? tx3.L((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
            case 18:
                k250 k250Var = (k250) obj;
                k250Var.getClass();
                return k250Var.getKey();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                k250 k250Var2 = (k250) obj;
                k250Var2.getClass();
                return k250Var2.getClass();
            case 20:
                mi0 mi0Var = (mi0) obj;
                mi0Var.getClass();
                return Boolean.valueOf(mi0Var == mi0.MY_VIRTUAL);
            case 21:
                kg kgVar = (kg) obj;
                kgVar.getClass();
                return oja0.b0(kgVar);
            case 22:
                zf1 zf1Var = (zf1) obj;
                zf1Var.getClass();
                return wb.Q(zf1Var);
            case 23:
                ot0 ot0Var = (ot0) obj;
                ot0Var.getClass();
                return x4d0.g0(ot0Var);
            case 24:
                ob0 ob0Var = (ob0) obj;
                ob0Var.getClass();
                return new j650(ob0Var);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Fragment fragment = (Fragment) obj;
                fragment.getClass();
                return fragment.y;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Fragment fragment2 = (Fragment) obj;
                fragment2.getClass();
                return fragment2.y;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((i1w0) obj).getClass();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new h63((y1h0) obj);
            default:
                return new lie(kzn.d(ro4.m0(700, 0, null, 6), 0.0f, 2), kzn.e(ro4.m0(700, 0, null, 6), 2), (u7k0) null, 12);
        }
    }
}
