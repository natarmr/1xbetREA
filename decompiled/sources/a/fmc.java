package a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fmc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9773a = new HashMap();
    public final HashMap b;

    public fmc(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            kkz kkzVar = (kkz) entry.getValue();
            List arrayList = (List) this.f9773a.get(kkzVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f9773a.put(kkzVar, arrayList);
            }
            arrayList.add((gmc) entry.getKey());
        }
    }

    public static void a(List list, clz clzVar, kkz kkzVar, blz blzVar) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                gmc gmcVar = (gmc) list.get(size);
                Method method = gmcVar.b;
                try {
                    int i = gmcVar.f11536a;
                    if (i == 0) {
                        method.invoke(blzVar, null);
                    } else if (i == 1) {
                        method.invoke(blzVar, clzVar);
                    } else if (i == 2) {
                        method.invoke(blzVar, clzVar, kkzVar);
                    }
                } catch (IllegalAccessException e) {
                    ohq.p(e);
                    return;
                } catch (InvocationTargetException e2) {
                    e9d0.m("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
