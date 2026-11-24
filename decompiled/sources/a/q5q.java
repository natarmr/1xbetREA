package a;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class q5q extends i3t0 {
    public final noc o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5q(mne mneVar, ctf0 ctf0Var, nmy nmyVar, cny cnyVar, noc nocVar) {
        super(null, new gmo(nmyVar, cnyVar, (byte) 11), new bcn(ctf0Var, (byte) 14), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = nocVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        String str = "";
        g5q g5qVar = (g5q) obj;
        g5qVar.getClass();
        if (g5qVar instanceof d5q) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value2, o5q.a((o5q) value2, ((d5q) g5qVar).f5519a, null, 2)));
            return;
        }
        if (g5qVar instanceof f5q) {
            p7m0 p7m0Var2 = this.i.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var2.m(value, o5q.a((o5q) value, null, ((f5q) g5qVar).f8976a, 1)));
            return;
        }
        if (!g5qVar.equals(e5q.f7245a)) {
            t9f.b();
            return;
        }
        vff0 vff0Var = this.o.f23861a;
        vff0Var.getClass();
        try {
            String string = vff0Var.c.a().getString("TEST_SECTION_CONFIG_KEY", "");
            if (string != null) {
                str = string;
            }
            Map map = (Map) vff0Var.h.b(new inv(ysm0.f43175a, mrv.j0(ssd.Companion.serializer()), (byte) 1), str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((ssd) entry.getValue()) != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(wp20.a(linkedHashMap.size()));
            for (Object obj2 : linkedHashMap.entrySet()) {
                Object key = ((Map.Entry) obj2).getKey();
                Object value3 = ((Map.Entry) obj2).getValue();
                value3.getClass();
                ssd ssdVar = (ssd) value3;
                mcy mcyVar = ssdVar.f32720a;
                linkedHashMap2.put(key, new ssd(mcyVar, mcyVar, ssdVar.c));
            }
            vff0Var.c.g("TEST_SECTION_CONFIG_KEY", vff0Var.h.d(new inv(ysm0.f43175a, ssd.Companion.serializer(), (byte) 1), linkedHashMap2));
            vff0Var.q = linkedHashMap2;
            vff0Var.k.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
        G(n5q.f22956a);
    }
}
