package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class vgu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vff0 f37399a;

    public vgu(vff0 vff0Var, byte b) {
        vff0Var.getClass();
        switch (b) {
            case 1:
                this.f37399a = vff0Var;
                break;
            default:
                this.f37399a = vff0Var;
                break;
        }
    }

    public void a(mcy mcyVar, String str) {
        str.getClass();
        vff0 vff0Var = this.f37399a;
        vff0Var.getClass();
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap(vff0Var.e());
            ssd ssdVar = (ssd) linkedHashMap.get(str);
            if (ssdVar == null) {
                return;
            }
            linkedHashMap.put(str, new ssd(ssdVar.f32720a, mcyVar, ssdVar.c));
            vff0Var.c.g("TEST_SECTION_CONFIG_KEY", vff0Var.h.d(new inv(ysm0.f43175a, ssd.Companion.serializer(), (byte) 1), linkedHashMap));
            vff0Var.q = linkedHashMap;
            vff0Var.k.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
