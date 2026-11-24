package a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes.dex */
public final class tvt0 extends uvt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile OkHttpClient f34619a;

    @Override // a.uvt0
    public final OkHttpClient a() throws PackageManager.NameNotFoundException {
        if (this.f34619a == null) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.a(20L);
            builder.b(30L);
            builder.c(20L);
            builder.i = true;
            builder.j = true;
            wut0 wut0Var = tut0.f34568a;
            if (wut0Var == null) {
                itt0.k("please call VK.initialize first!");
                return null;
            }
            PackageManager packageManager = wut0Var.f39807a.getPackageManager();
            wut0 wut0Var2 = tut0.f34568a;
            if (wut0Var2 == null) {
                Intrinsics.h("config");
                throw null;
            }
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(wut0Var2.f39807a.getPackageName(), 128);
            applicationInfo.getClass();
            String strValueOf = String.valueOf(applicationInfo.metaData.get("VKSdkVersion"));
            String strValueOf2 = String.valueOf(applicationInfo.metaData.get("VKSdkVersionCode"));
            wut0 wut0Var3 = tut0.f34568a;
            if (wut0Var3 == null) {
                Intrinsics.h("config");
                throw null;
            }
            Context context = wut0Var3.f39807a;
            context.getClass();
            Point point = new Point();
            Object systemService = context.getSystemService("window");
            systemService.getClass();
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            Display.Mode mode = defaultDisplay != null ? defaultDisplay.getMode() : null;
            point.x = mode != null ? mode.getPhysicalWidth() : 0;
            point.y = mode != null ? mode.getPhysicalHeight() : 0;
            builder.c.add(new kqt0(new xyj(strValueOf, strValueOf2, point)));
            this.f34619a = new OkHttpClient(builder);
        }
        OkHttpClient okHttpClient = this.f34619a;
        okHttpClient.getClass();
        return okHttpClient;
    }
}
