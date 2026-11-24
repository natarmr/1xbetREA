package a;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qmw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zz2 f29006a = new zz2("GetTokenResultFactory", new String[0]);

    public static ezu a(String str) {
        Map map;
        try {
            map = rmw0.c(str);
        } catch (kcw0 e) {
            f29006a.i("Error parsing token claims", e, new Object[0]);
            map = new HashMap();
        }
        ezu ezuVar = new ezu();
        ezuVar.f8687a = str;
        ezuVar.b = map;
        return ezuVar;
    }
}
