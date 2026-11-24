package a;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;
import org.xplatform.promo.impl.promocodes.presentation.shop.components.HorizontalPromoStoreCollectionItem;
import org.xplatform.services.mobile_services.impl.presentation.services.HuaweiMessagingService;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bdv implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2419a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bdv(Object obj, byte b) {
        this.f2419a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int largeMemoryClass;
        byte b = this.f2419a;
        int i = 4;
        Object obj = this.b;
        switch (b) {
            case 0:
                art artVar = ddv.Q1;
                fiu0 fiu0Var = ((ddv) obj).L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                gst gstVar = jgv.h2;
                fiu0 fiu0Var2 = ((jgv) obj).e2;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                bst bstVar = igv.e2;
                fiu0 fiu0Var3 = ((igv) obj).b2;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 3:
                String str = ((whv) obj).d;
                return new zhv(str.length() != 0 ? str : null, iun.f15405a);
            case 4:
                int iOrdinal = ((giv) obj).a().ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else if (iOrdinal == 1) {
                    i = 1;
                } else if (iOrdinal == 2) {
                    i = 2;
                } else if (iOrdinal == 3) {
                    i = 3;
                } else if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                return Integer.valueOf(i);
            case 5:
                yjv yjvVar = (yjv) obj;
                v88.b(yjvVar.j, yjvVar.l, 0L, 4);
                return Unit.f46060a;
            case 6:
                return (pnv) ((gii0) ((u8u) obj).c).b(sre0.f32672a.b(pnv.class));
            case 7:
                ntv ntvVar = (ntv) obj;
                return Bitmap.createBitmap(ntvVar.getWidth(), ntvVar.getHeight(), Bitmap.Config.ARGB_8888);
            case 8:
                art artVar2 = xtv.P1;
                fiu0 fiu0Var4 = ((xtv) obj).M1;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 9:
                return (utv) ((gii0) ((abu) obj).b).b(sre0.f32672a.b(utv.class));
            case 10:
                return Integer.valueOf(((nuv) obj).e.size());
            case 11:
                fiu0 fiu0Var5 = ((rwv) obj).L1;
                if (fiu0Var5 != null) {
                    return fiu0Var5;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 12:
                dxv dxvVar = (dxv) obj;
                vlq0 vlq0Var = dxvVar.g2;
                if (vlq0Var != null) {
                    vcc.f0(i120.V(new Pair("RESULT_TYPE", vlq0Var)), dxvVar, dxvVar.f2.n(dxvVar, dxv.k2[1]));
                    dxvVar.x0();
                }
                return Unit.f46060a;
            case 13:
                sqt sqtVar = vzv.p2;
                fiu0 fiu0Var6 = ((vzv) obj).k2;
                if (fiu0Var6 != null) {
                    return fiu0Var6;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 14:
                return ((r2w) obj).v.a();
            case 15:
                bst bstVar2 = r7w.q2;
                fiu0 fiu0Var7 = ((r7w) obj).k2;
                if (fiu0Var7 != null) {
                    return fiu0Var7;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 16:
                return (hiw) ((gii0) ((zpu) obj).b).b(sre0.f32672a.b(hiw.class));
            case 17:
                return new yoe(((HorizontalPromoStoreCollectionItem) obj).c, null);
            case 18:
                tqt tqtVar = vmw.Q1;
                fiu0 fiu0Var8 = ((vmw) obj).N1;
                if (fiu0Var8 != null) {
                    return fiu0Var8;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (smw) ((gii0) ((edu) obj).c).b(sre0.f32672a.b(smw.class));
            case 20:
                art artVar3 = fow.P1;
                fiu0 fiu0Var9 = ((fow) obj).M1;
                if (fiu0Var9 != null) {
                    return fiu0Var9;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 21:
                return (ynw) ((gii0) ((ieu) obj).b).b(sre0.f32672a.b(ynw.class));
            case 22:
                return (hpw) ((gii0) ((lbu) obj).b).b(sre0.f32672a.b(hpw.class));
            case 23:
                rqt rqtVar = cqw.S1;
                fiu0 fiu0Var10 = ((cqw) obj).P1;
                if (fiu0Var10 != null) {
                    return fiu0Var10;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 24:
                sqt sqtVar2 = arw.Q1;
                fiu0 fiu0Var11 = ((arw) obj).N1;
                if (fiu0Var11 != null) {
                    return fiu0Var11;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (orw) ((gii0) ((zpu) obj).b).b(sre0.f32672a.b(orw.class));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Http2Connection http2Connection = (Http2Connection) obj;
                Settings settings = Http2Connection.A;
                http2Connection.getClass();
                try {
                    http2Connection.x.l(2, 0, false);
                    break;
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.a(errorCode, errorCode, e);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return HuaweiMessagingService.huaweiMessagingServiceComponent_delegate$lambda$0((HuaweiMessagingService) obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((c0x) obj).dismiss();
                return Unit.f46060a;
            default:
                Context context = (Context) ((f7u) obj).b;
                double d = 0.2d;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    jf4.o("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                y78 y78Var = new y78((byte) 15);
                try {
                    Object systemService2 = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService2.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused2) {
                    largeMemoryClass = 256;
                }
                long j = (long) (d * ((long) largeMemoryClass) * 1048576);
                r34 r34Var = new r34();
                r34Var.f29768a = j;
                r34Var.b = y78Var;
                dr8 dr8Var = new dr8();
                dr8Var.d = r34Var;
                dr8Var.c = new LinkedHashMap(0, 0.75f, true);
                dr8Var.f6545a = j;
                if (j > 0) {
                    r34Var.c = dr8Var;
                    return new jbe0(r34Var, y78Var);
                }
                jf4.o("maxSize <= 0");
                throw null;
        }
    }
}
