package a;

import android.content.ComponentName;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ug80 extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ug80 f35613a = new ug80(2, vg80.class, "isServiceEnabled", "isServiceEnabled(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;)Z", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        PackageManager packageManager = (PackageManager) obj;
        ComponentName componentName = (ComponentName) obj2;
        packageManager.getClass();
        componentName.getClass();
        String str = vg80.f37370a;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        boolean zBooleanValue = false;
        if (componentEnabledSetting == 0) {
            HashMap map = vg80.b;
            synchronized (map) {
                Boolean bool = (Boolean) map.get(componentName);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        ServiceInfo serviceInfo = packageManager.getServiceInfo(componentName, 512);
                        if (serviceInfo != null) {
                            zBooleanValue = ((ComponentInfo) serviceInfo).enabled;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        wv00.f().i(e, vg80.f37370a, componentName.getClassName() + " could not be found in manifest");
                    }
                    HashMap map2 = vg80.b;
                    synchronized (map2) {
                        map2.put(componentName, Boolean.valueOf(zBooleanValue));
                    }
                }
            }
        } else if (componentEnabledSetting == 1) {
            zBooleanValue = true;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
