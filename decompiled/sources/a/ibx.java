package a;

import android.net.Uri;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class ibx extends w46 {
    public final i1w0 b;
    public final String c;
    public final pyu d;
    public final iqt e;
    public final a6u f;
    public final m1e g;
    public final j1q0 h;
    public final duj i;
    public final mne j;
    public c4m0 k;
    public final p7m0 l;
    public final ol60 m;

    public ibx(i1w0 i1w0Var, String str, pyu pyuVar, iqt iqtVar, a6u a6uVar, m1e m1eVar, j1q0 j1q0Var, duj dujVar, mne mneVar) {
        i1w0Var.getClass();
        m1eVar.getClass();
        j1q0Var.getClass();
        this.b = i1w0Var;
        this.c = str;
        this.d = pyuVar;
        this.e = iqtVar;
        this.f = a6uVar;
        this.g = m1eVar;
        this.h = j1q0Var;
        this.i = dujVar;
        this.j = mneVar;
        this.l = q7m0.a(bbx.f2329a);
        this.m = new ol60(1, i99.b);
        bvc bvcVarA = jiu0.a(this);
        rwj rwjVar = mneVar.f22085a;
        sac.V(bvcVarA, new zax(this, (byte) 0), null, rwjVar, new gbx(this, null, (byte) 1), 10);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    public final Object w(zje zjeVar) {
        hbx hbxVar;
        String str;
        String str2;
        if (zjeVar instanceof hbx) {
            hbxVar = (hbx) zjeVar;
            int i = hbxVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                hbxVar.l = i - Integer.MIN_VALUE;
            } else {
                hbxVar = new hbx(this, zjeVar);
            }
        } else {
            hbxVar = new hbx(this, zjeVar);
        }
        Object objE = hbxVar.j;
        wne wneVar = wne.f39444a;
        int i2 = hbxVar.l;
        String str3 = this.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    String str4 = hbxVar.i;
                    z1x.P(objE);
                    i2 = str4;
                } else {
                    if (i2 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str5 = hbxVar.i;
                    z1x.P(objE);
                    str2 = str5;
                }
                x(new dbx(objE + str3, str2));
                return Unit.f46060a;
            }
            z1x.P(objE);
            String host = Uri.parse(str3).getHost();
            String str6 = "";
            if ((host == null || host.length() == 0) && !kotlin.text.c.x(str3, "mailto", false) && !kotlin.text.c.x(str3, "tel", false)) {
                str = str6;
                if (this.e.f15225a.a()) {
                    pyu pyuVar = this.d;
                    hbxVar.i = "";
                    hbxVar.l = 1;
                    objE = ((trm0) pyuVar.f27815a).i(hbxVar);
                    i2 = str6;
                    if (objE == wneVar) {
                    }
                } else {
                    hbxVar.i = str;
                    hbxVar.l = 2;
                    objE = this.f.E(false, hbxVar);
                    if (objE != wneVar) {
                        str2 = str;
                        x(new dbx(objE + str3, str2));
                    }
                }
                return wneVar;
            }
            x(new dbx(str3, ""));
            return Unit.f46060a;
            str = (String) objE;
        } catch (Exception e) {
            e.printStackTrace();
            str = i2;
        }
        hbxVar.i = str;
        hbxVar.l = 2;
        objE = this.f.E(false, hbxVar);
        if (objE != wneVar) {
            str2 = str;
            x(new dbx(objE + str3, str2));
            return Unit.f46060a;
        }
        return wneVar;
    }

    public final void x(fbx fbxVar) {
        sac.V(jiu0.a(this), new h7w((byte) 25), null, this.j.c, new u5u(this, fbxVar, null, (byte) 20), 10);
    }
}
