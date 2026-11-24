package a;

import android.gov.nist.core.Separators;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes.dex */
public final class zg90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zg90 f44333a = new zg90();

    private zg90() {
    }

    public static final void a(PersistableBundle persistableBundle, String str, Object obj) {
        persistableBundle.getClass();
        if (obj == null) {
            persistableBundle.putString(str, null);
            return;
        }
        if (obj instanceof Boolean) {
            persistableBundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Double) {
            persistableBundle.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Integer) {
            persistableBundle.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            persistableBundle.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            persistableBundle.putString(str, (String) obj);
            return;
        }
        if (obj instanceof PersistableBundle) {
            persistableBundle.putPersistableBundle(str, (PersistableBundle) obj);
            return;
        }
        if (obj instanceof boolean[]) {
            persistableBundle.putBooleanArray(str, (boolean[]) obj);
            return;
        }
        if (obj instanceof double[]) {
            persistableBundle.putDoubleArray(str, (double[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            persistableBundle.putIntArray(str, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            persistableBundle.putLongArray(str, (long[]) obj);
            return;
        }
        if (!(obj instanceof Object[])) {
            jf4.o(b1j.k("Unsupported value type ", obj.getClass().getCanonicalName(), " for key \"", str, Separators.DOUBLE_QUOTE));
            return;
        }
        Class<?> componentType = obj.getClass().getComponentType();
        componentType.getClass();
        if (String.class.isAssignableFrom(componentType)) {
            persistableBundle.putStringArray(str, (String[]) obj);
        } else {
            jf4.o(b1j.k("Unsupported value array type ", componentType.getCanonicalName(), " for key \"", str, Separators.DOUBLE_QUOTE));
        }
    }
}
