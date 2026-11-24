package a;

import android.content.Context;
import androidx.collection.MutableIntList;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xd2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40676a;

    public /* synthetic */ xd2(byte b) {
        this.f40676a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f40676a) {
            case 0:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 1:
                p6t0 p6t0Var2 = (p6t0) obj;
                p6t0Var2.getClass();
                return sre0.f32672a.b(p6t0Var2.getClass());
            case 2:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new zd2(sjdVar);
            case 3:
                sjd sjdVar2 = (sjd) obj;
                sjdVar2.getClass();
                return new ng2(sjdVar2);
            case 4:
                j2g0 j2g0Var = (j2g0) obj;
                j2g0Var.getClass();
                return new qg2(j2g0Var);
            case 5:
                p6t0 p6t0Var3 = (p6t0) obj;
                p6t0Var3.getClass();
                return p6t0Var3.getKey();
            case 6:
                p6t0 p6t0Var4 = (p6t0) obj;
                p6t0Var4.getClass();
                return sre0.f32672a.b(p6t0Var4.getClass());
            case 7:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 8:
                p6t0 p6t0Var5 = (p6t0) obj;
                p6t0Var5.getClass();
                return p6t0Var5.getKey();
            case 9:
                p6t0 p6t0Var6 = (p6t0) obj;
                p6t0Var6.getClass();
                return sre0.f32672a.b(p6t0Var6.getClass());
            case 10:
                p6t0 p6t0Var7 = (p6t0) obj;
                p6t0Var7.getClass();
                return p6t0Var7.getKey();
            case 11:
                p6t0 p6t0Var8 = (p6t0) obj;
                p6t0Var8.getClass();
                return sre0.f32672a.b(p6t0Var8.getClass());
            case 12:
                sjd sjdVar3 = (sjd) obj;
                sjdVar3.getClass();
                return new fl2(sjdVar3);
            case 13:
                p6t0 p6t0Var9 = (p6t0) obj;
                p6t0Var9.getClass();
                return p6t0Var9.getKey();
            case 14:
                p6t0 p6t0Var10 = (p6t0) obj;
                p6t0Var10.getClass();
                return sre0.f32672a.b(p6t0Var10.getClass());
            case 15:
                on2 on2Var = (on2) obj;
                on2Var.getClass();
                return sre0.f32672a.b(on2Var.getClass());
            case 16:
                sjd sjdVar4 = (sjd) obj;
                sjdVar4.getClass();
                return new fn2(sjdVar4);
            case 17:
                ((rv2) obj).getClass();
                return Unit.f46060a;
            case 18:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            case 20:
                return Float.valueOf(((Float) obj).floatValue() * 0.5f);
            case 21:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 22:
                return Boolean.TRUE;
            case 23:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 24:
                return Boolean.TRUE;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Class cls = AndroidComposeView.j2;
                return Boolean.TRUE;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                MutableIntList mutableIntList = AndroidComposeViewAccessibilityDelegateCompat.o1;
                return Boolean.valueOf(g1x.x((tai0) obj));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (qw90) obj;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                bh90 bh90Var = (bh90) obj;
                zfn zfnVar = dy2.f6873a;
                bh90Var.getClass();
                qbc.V(bh90Var, zfnVar);
                return ((Context) qbc.V(bh90Var, dy2.b)).getResources();
            default:
                return Boolean.valueOf(g1x.x((tai0) obj));
        }
    }
}
