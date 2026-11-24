package a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class rg80 extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30421a;
    public final /* synthetic */ iw20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rg80(iw20 iw20Var, byte b) {
        super(0);
        this.f30421a = b;
        this.b = iw20Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30421a;
        iw20 iw20Var = this.b;
        switch (b) {
            case 0:
                PackageManager packageManager = (PackageManager) iw20Var.f15470a;
                packageManager.getClass();
                List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
                installedApplications.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(installedApplications, 10));
                for (ApplicationInfo applicationInfo : installedApplications) {
                    applicationInfo.getClass();
                    String str = applicationInfo.packageName;
                    str.getClass();
                    arrayList.add(new qg80(str));
                }
                return arrayList;
            default:
                PackageManager packageManager2 = (PackageManager) iw20Var.f15470a;
                packageManager2.getClass();
                List<ApplicationInfo> installedApplications2 = packageManager2.getInstalledApplications(128);
                installedApplications2.getClass();
                ArrayList<ApplicationInfo> arrayList2 = new ArrayList();
                for (Object obj : installedApplications2) {
                    ApplicationInfo applicationInfo2 = (ApplicationInfo) obj;
                    applicationInfo2.getClass();
                    String str2 = applicationInfo2.sourceDir;
                    str2.getClass();
                    if (StringsKt.O(str2, "/system/", false)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                for (ApplicationInfo applicationInfo3 : arrayList2) {
                    applicationInfo3.getClass();
                    String str3 = applicationInfo3.packageName;
                    str3.getClass();
                    arrayList3.add(new qg80(str3));
                }
                return arrayList3;
        }
    }
}
