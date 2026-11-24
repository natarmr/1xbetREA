package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class nix0 extends qbw0 {
    public final Map b;

    public nix0(wgm0 wgm0Var, wgm0 wgm0Var2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, wgm0Var);
        d(linkedHashMap, wgm0Var2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((vgx0) entry.getKey()).c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void d(LinkedHashMap linkedHashMap, wgm0 wgm0Var) {
        for (int i = 0; i < wgm0Var.y(); i++) {
            vgx0 vgx0VarA = wgm0Var.A(i);
            Object obj = linkedHashMap.get(vgx0VarA);
            boolean z = vgx0VarA.c;
            Class cls = vgx0VarA.b;
            if (z) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(vgx0VarA, arrayList);
                }
                arrayList.add(cls.cast(wgm0Var.B(i)));
            } else {
                linkedHashMap.put(vgx0VarA, cls.cast(wgm0Var.B(i)));
            }
        }
    }

    @Override // a.qbw0
    public final void a(cmt0 cmt0Var, whx0 whx0Var) {
        for (Map.Entry entry : this.b.entrySet()) {
            vgx0 vgx0Var = (vgx0) entry.getKey();
            Object value = entry.getValue();
            if (vgx0Var.c) {
                cmt0Var.g(vgx0Var, ((List) value).iterator(), whx0Var);
            } else {
                cmt0Var.f(vgx0Var, value, whx0Var);
            }
        }
    }

    @Override // a.qbw0
    public final int b() {
        return this.b.size();
    }

    @Override // a.qbw0
    public final Set c() {
        return this.b.keySet();
    }
}
