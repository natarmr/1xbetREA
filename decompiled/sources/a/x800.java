package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.xplatform.uikit.components.views.LoadableImageView;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class x800 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40440a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f40440a) {
            case 0:
                return new zw3(n800.f23065a, (byte) 0);
            case 1:
                return new zw3(w830.f38702a, (byte) 0);
            case 2:
                return Unit.f46060a;
            case 3:
                int i = qi00.I;
                return bid.f2654a;
            case 4:
                return new zw3(ti00.f33984a, (byte) 0);
            case 5:
                return new zw3(rj00.f30568a, (byte) 0);
            case 6:
                return new zw3(gdo.f11112a, (byte) 0);
            case 7:
                return new zw3(co2.f4681a, (byte) 0);
            case 8:
                return new zw3(kwe.f18997a, (byte) 0);
            case 9:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 10:
                return new zw3(ln7.f20330a, (byte) 0);
            case 11:
                StringBuilder sb = new StringBuilder(ujn.h);
                if ("static/img/android/loadscreen/1357/block/block.webp".length() == 0) {
                    sb.setLength(0);
                } else if (StringsKt.O("static/img/android/loadscreen/1357/block/block.webp", ujn.h, false) || kotlin.text.c.x("static/img/android/loadscreen/1357/block/block.webp", "https://", false)) {
                    sb.setLength(0);
                    sb.append("static/img/android/loadscreen/1357/block/block.webp");
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0("static/img/android/loadscreen/1357/block/block.webp", '/'));
                }
                return sb.toString();
            case 12:
                int i2 = LoadableImageView.i;
                return Unit.f46060a;
            case 13:
                int i3 = LoadableShapeableImageView.B;
                return Unit.f46060a;
            case 14:
                return fz3.f10390a;
            case 15:
                return pz3.f27825a;
            case 16:
                return new n8m0(new bwk(vhk.f37434a, la80.f19694a, 0.0f, 0.0f, new z6k(1.0f, 1.0f), 1.0f, null, new t9o0(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f), new sly(0.0f, 0.0f, false), 0.0f));
            case 17:
                return (cwk) jr00.f16980a.getValue();
            case 18:
                throw new IllegalStateException("LocalFragmentHost не предоставлен");
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 20:
                throw new IllegalStateException("Unexpected access to LocalNavAnimatedContentScope. You should only access LocalNavAnimatedContentScope inside a NavEntry passed to NavDisplay. AnimatedContentScope in OverlayScenes are no-op.");
            case 21:
            case 22:
                return null;
            case 23:
                zfn zfnVar = wr00.f39616a;
                return rv00.p;
            case 24:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return lz00.Companion.serializer();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ntb.F("org.xplatform.special_event.impl.cyber_info.lol.data.model.LolChampionRoleResponse", lz00.values(), new String[]{"top", "mid", "sup", "jun", "adc"}, new Annotation[][]{null, null, null, null, null});
            default:
                return new zw3(g010.f10438a, (byte) 0);
        }
    }

    public /* synthetic */ x800(byte b) {
        this.f40440a = b;
    }
}
