package a;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vjy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f37553a;

    public vjy(byte b) {
        switch (b) {
            case 1:
                this.f37553a = new HashMap(3);
                break;
            default:
                this.f37553a = new HashMap();
                break;
        }
    }

    public float a(View view, String str) {
        HashMap map;
        float[] fArr;
        HashMap map2 = this.f37553a;
        if (map2.containsKey(view) && (map = (HashMap) map2.get(view)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    public void b(Class cls, j98 j98Var) {
        this.f37553a.put(cls, j98Var);
    }
}
