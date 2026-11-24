package a;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class vg80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f37370a = wv00.h("PackageManagerHelper");
    public static final HashMap b = new HashMap();

    public static final void a(PackageManager packageManager, ComponentName componentName, boolean z, Function2 function2) {
        String str = f37370a;
        try {
            if (z == ((Boolean) function2.invoke(packageManager, componentName)).booleanValue()) {
                return;
            }
            packageManager.setComponentEnabledSetting(componentName, z ? 1 : 2, 1);
            wv00.f().a(str, componentName.getClassName() + Separators.SP + (z ? "enabled" : "disabled"));
        } catch (Exception e) {
            wv00.f().c(str, w6x.q(componentName.getClassName(), " could not be ", z ? "enabled" : "disabled"), e);
        }
    }
}
