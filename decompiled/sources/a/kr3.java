package a;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kr3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18746a;
    public final /* synthetic */ ApplicationActivity b;

    public /* synthetic */ kr3(ApplicationActivity applicationActivity, byte b) {
        this.f18746a = b;
        this.b = applicationActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18746a;
        androidx.fragment.app.e eVar = null;
        ApplicationActivity applicationActivity = this.b;
        switch (b) {
            case 0:
                int i = ApplicationActivity.F1;
                return new rs3(applicationActivity, applicationActivity.C().b.getId(), eVar, 12);
            case 1:
                applicationActivity.B1 = null;
                return Unit.f46060a;
            case 2:
                int i2 = ApplicationActivity.F1;
                ((ht2) ((bbw0) applicationActivity.F().Y.b).b).f13610a.n(iun.f15405a);
                return Unit.f46060a;
            case 3:
                int i3 = ApplicationActivity.F1;
                zu3 zu3VarF = applicationActivity.F();
                zu3VarF.h0.f(new at3(CollectionsKt.b0((List) ((ht2) ((bbw0) zu3VarF.Z.f26374a).b).f13610a.getValue(), Separators.RETURN, null, null, null, 62)));
                return Unit.f46060a;
            case 4:
                int i4 = ApplicationActivity.F1;
                applicationActivity.F().X.g(ljj.f20154a);
                return Unit.f46060a;
            case 5:
                applicationActivity.D1 = null;
                return Unit.f46060a;
            case 6:
                applicationActivity.C1 = null;
                return Unit.f46060a;
            case 7:
                int i5 = ApplicationActivity.F1;
                PackageManager packageManager = applicationActivity.getPackageManager();
                packageManager.setComponentEnabledSetting(new ComponentName(applicationActivity.getPackageName(), "org.xplatform.client1.LauncherAliasColor"), 2, 1);
                packageManager.setComponentEnabledSetting(new ComponentName(applicationActivity.getPackageName(), "org.xplatform.client1.LauncherAliasLegacy"), 1, 1);
                return Unit.f46060a;
            default:
                z7z z7zVar = applicationActivity.h1;
                if (z7zVar == null) {
                    Intrinsics.h("viewModelFactory");
                    throw null;
                }
                Object obj = z7zVar.get();
                obj.getClass();
                return (miu0) obj;
        }
    }
}
