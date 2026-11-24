package a;

import android.os.StatFs;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tht0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33977a;

    public /* synthetic */ tht0(byte b) {
        this.f33977a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f33977a) {
            case 0:
                return new zw3(tbl.f33669a, (byte) 0);
            case 1:
                return new zw3(git0.f11367a, (byte) 0);
            case 2:
                return new zw3(gdy.f11125a, (byte) 0);
            case 3:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 4:
                return new zw3(jq7.f16936a, (byte) 0);
            case 5:
                return new zw3(tbl.f33669a, (byte) 0);
            case 6:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 7:
                return new zw3(ln7.f20330a, (byte) 0);
            case 8:
                return new zw3(okx.f25427a, (byte) 0);
            case 9:
                return new zw3(ffc0.f9443a, (byte) 0);
            case 10:
                return Unit.f46060a;
            case 11:
                return new zw3(ysm0.f43175a, (byte) 0);
            case 12:
                return new zw3(ist0.f15322a, (byte) 0);
            case 13:
                return new zw3(mrv.j0(ysm0.f43175a), (byte) 0);
            case 14:
                return new zw3(drt0.f6580a, (byte) 0);
            case 15:
                return new zw3(s710.f31729a, (byte) 0);
            case 16:
                return new zw3(rst0.f31049a, (byte) 0);
            case 17:
                return new zw3(xst0.f41433a, (byte) 0);
            case 18:
                return new zw3(ysm0.f43175a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ggy ggyVar = yzp.f43526a;
                kotlin.coroutines.g gVar = kotlin.coroutines.g.f46065a;
                y190 y190VarE = yzp.b.e("coil3_disk_cache");
                long jF = 10485760;
                try {
                    File file = y190VarE.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jF = l1e0.f((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused) {
                }
                return new bbe0(jF, y190VarE, ggyVar, gVar);
            case 20:
                return new zw3(yvt0.f43337a, (byte) 0);
            case 21:
                return new zw3(srh.f32675a, (byte) 0);
            case 22:
                return new zw3(nrh.f24000a, (byte) 0);
            case 23:
                return new zw3(h0u0.f12251a, (byte) 0);
            case 24:
                return new zw3(q0u0.f27922a, (byte) 0);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(l0u0.f19219a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(w1u0.f38419a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(c1u0.f3593a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(yxt0.f43440a, (byte) 0);
            default:
                okx okxVar = okx.f25427a;
                return new inv(okxVar, okxVar, (byte) 1);
        }
    }
}
