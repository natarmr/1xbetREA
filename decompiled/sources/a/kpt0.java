package a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class kpt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final got0 f18691a;
    public final r2a b;
    public final sev c;
    public final got0 d;
    public final n0o0 e;
    public final n0o0 f;

    public kpt0(got0 got0Var, r2a r2aVar, sev sevVar, got0 got0Var2) {
        this.f18691a = got0Var;
        this.b = r2aVar;
        this.c = sevVar;
        this.d = got0Var2;
        final byte b = 0;
        this.e = maz.b(new Function0(this) { // from class: a.jpt0
            public final /* synthetic */ kpt0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                kpt0 kpt0Var = this.b;
                switch (b2) {
                    case 0:
                        return (b0a) kpt0Var.f18691a.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Object obj = kpt0Var.d.get();
                        obj.getClass();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            e3a e3aVar = (e3a) entry.getKey();
                            hzj hzjVar = (hzj) entry.getValue();
                            lrm0 lrm0Var = kpt0Var.a().c;
                            lrm0Var.getClass();
                            e3aVar.getClass();
                            f3a f3aVar = (f3a) lrm0Var.b.get(e3aVar);
                            if (f3aVar != null) {
                                linkedHashMap.put(hzjVar, new mrm0(f3aVar.f8851a));
                            }
                        }
                        return xp20.n(linkedHashMap);
                }
            }
        });
        final byte b2 = 1;
        this.f = maz.b(new Function0(this) { // from class: a.jpt0
            public final /* synthetic */ kpt0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                kpt0 kpt0Var = this.b;
                switch (b3) {
                    case 0:
                        return (b0a) kpt0Var.f18691a.get();
                    default:
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        Object obj = kpt0Var.d.get();
                        obj.getClass();
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            e3a e3aVar = (e3a) entry.getKey();
                            hzj hzjVar = (hzj) entry.getValue();
                            lrm0 lrm0Var = kpt0Var.a().c;
                            lrm0Var.getClass();
                            e3aVar.getClass();
                            f3a f3aVar = (f3a) lrm0Var.b.get(e3aVar);
                            if (f3aVar != null) {
                                linkedHashMap.put(hzjVar, new mrm0(f3aVar.f8851a));
                            }
                        }
                        return xp20.n(linkedHashMap);
                }
            }
        });
    }

    public final b0a a() {
        Object value = this.e.getValue();
        value.getClass();
        return (b0a) value;
    }

    public final LinkedHashSet b(List list) {
        list.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mrm0 mrm0Var = (mrm0) ((Map) this.f.getValue()).get((hzj) it.next());
            if (mrm0Var != null) {
                linkedHashSet.add(mrm0Var);
            }
        }
        return linkedHashSet;
    }
}
