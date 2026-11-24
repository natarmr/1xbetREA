package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;
import org.xplatform.apple_fortune.presentation.views.AppleFortuneGameView;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f33 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8841a;

    public /* synthetic */ f33(byte b) {
        this.f8841a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 0;
        switch (this.f8841a) {
            case 0:
                return Unit.f46060a;
            case 1:
                return Unit.f46060a;
            case 2:
                return Unit.f46060a;
            case 3:
                return Unit.f46060a;
            case 4:
                return Unit.f46060a;
            case 5:
                return Unit.f46060a;
            case 6:
                return new s93(null, da10.DEFAULT_ERROR, 0L);
            case 7:
                zfn zfnVar = ob3.f24958a;
                return dxj.f6848a;
            case 8:
                zfn zfnVar2 = ob3.f24958a;
                return ujn.i;
            case 9:
                return Unit.f46060a;
            case 10:
                return androidx.compose.runtime.e.a(0.0f);
            case 11:
                return new rtl0[]{new rtl0(R.attr.uikitStaticWhite20, R.drawable.ic_sportsman_1, false), new rtl0(R.attr.uikitStaticWhite20, R.drawable.ic_sportsman_2, false), new rtl0(R.attr.uikitStaticWhite20, R.drawable.ic_sportsman_3, false), new rtl0(R.attr.uikitStaticWhite20, R.drawable.ic_sportsman_4, false), new rtl0(R.attr.uikitStaticWhite20, R.drawable.ic_sportsman_5, false), new rtl0(R.attr.uikitStaticWhite20, R.drawable.ic_sportsman_6, false), new rtl0(R.attr.uikitStaticWhite20, R.drawable.ic_sportsman_7, false), new rtl0(R.attr.uikitStaticWhite20, R.drawable.ic_sportsman_8, false)};
            case 12:
                do5[] do5VarArr = new do5[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    do5VarArr[i2] = new do5(false, R.drawable.ic_shadow_ball);
                }
                return do5VarArr;
            case 13:
                e1l[] e1lVarArr = new e1l[8];
                while (i < 8) {
                    e1lVarArr[i] = new e1l(R.attr.uikitStaticWhite20);
                    i++;
                }
                return e1lVarArr;
            case 14:
                xx3[] xx3VarArr = new xx3[8];
                while (i < 8) {
                    xx3VarArr[i] = new xx3(R.attr.uikitStaticWhite20);
                    i++;
                }
                return xx3VarArr;
            case 15:
                return new zw3(s710.f31729a, (byte) 0);
            case 16:
                return new zw3(s710.f31729a, (byte) 0);
            case 17:
                return new zw3(s710.f31729a, (byte) 0);
            case 18:
                int i3 = AppleFortuneGameView.t;
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int i4 = AppleFortuneGameView.t;
                return Unit.f46060a;
            case 20:
                return new zw3(s710.f31729a, (byte) 0);
            case 21:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 22:
                return new zw3(okx.f25427a, (byte) 0);
            case 23:
                return new zw3(tbl.f33669a, (byte) 0);
            case 24:
                return new zw3(tbl.f33669a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i5 = ApplicationActivity.F1;
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ApplicationLoader applicationLoader = ApplicationLoader.v1;
                return tfq.a();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ApplicationLoader applicationLoader2 = ApplicationLoader.v1;
                return new l4x();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ApplicationLoader applicationLoader3 = ApplicationLoader.v1;
                return tyb0.i;
            default:
                return new go3(260, 1, 0);
        }
    }
}
