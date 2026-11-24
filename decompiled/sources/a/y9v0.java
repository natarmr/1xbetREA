package a;

import androidx.window.extensions.layout.WindowLayoutComponent;
import com.huawei.hms.android.HwBuildEx;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y9v0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42268a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WindowLayoutComponent windowLayoutComponentA;
        Object ftoVar;
        switch (this.f42268a) {
            case 0:
                return new zw3(fav0.f9229a, (byte) 0);
            case 1:
                ls2 ls2Var = new ls2();
                iun iunVar = iun.f15405a;
                m0k0 m0k0Var = new m0k0(-1L, "", -1L, "", "", "", -1L, "", "", "", 0, "", -1, -1, "", "", 0, 0, "", "", "", "", -1L, false, -1L, -1L, false, -1L, -1L, "", false, false, false);
                m97.Companion.getClass();
                return new vbv0("", ls2Var, iunVar, iunVar, m0k0Var, k97.a());
            case 2:
                long j = y3d.g;
                return new idv0(j, j, j, j, j);
            case 3:
                return Integer.valueOf(HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
            case 4:
                return new hfv0(null, iun.f15405a);
            case 5:
                return new zw3(qmn0.f28993a, (byte) 0);
            case 6:
                try {
                    ClassLoader classLoader = uhv0.class.getClassLoader();
                    jtg0 jtg0Var = classLoader != null ? new jtg0(classLoader, new rrc(classLoader)) : null;
                    if (jtg0Var == null || (windowLayoutComponentA = jtg0Var.a()) == null) {
                        return null;
                    }
                    rrc rrcVar = new rrc(classLoader);
                    int iA = sto.a();
                    if (iA >= 9) {
                        ftoVar = new ito(windowLayoutComponentA, rrcVar);
                    } else if (iA >= 6) {
                        ftoVar = new hto(windowLayoutComponentA, rrcVar);
                    } else if (iA >= 2) {
                        ftoVar = new gto(windowLayoutComponentA, rrcVar);
                    } else {
                        ftoVar = iA == 1 ? new fto(windowLayoutComponentA, rrcVar) : new dto();
                    }
                    return ftoVar;
                } catch (Throwable unused) {
                    return null;
                }
            case 7:
                return new zw3(new zw3(okx.f25427a, (byte) 0), (byte) 0);
            case 8:
                return new zw3(qkv0.f28906a, (byte) 0);
            case 9:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 10:
                return new zw3(glv0.f11515a, (byte) 0);
            case 11:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 12:
                return new g0o("org.xplatform.core.navigation.compose_nav.bottom_sheet.host.XBottomSheetRootRoute", kwv0.INSTANCE, new Annotation[0]);
            case 13:
                return new bzv0("", f9p.f9165a, kdt.f18122a, false, null, false);
            case 14:
                int i = rzv0.D;
                return vm60.f37664a;
            case 15:
                t44 t44Var = new t44();
                t44Var.f33301a = cfx0.o;
                t44Var.b = iun.f15405a;
                return t44Var;
            case 16:
                return new zw3(r3w0.f29806a, (byte) 0);
            default:
                return new zw3(ysm0.f43175a, (byte) 0);
        }
    }

    public /* synthetic */ y9v0(byte b) {
        this.f42268a = b;
    }
}
