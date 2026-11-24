package a;

import kotlin.text.StringsKt;
import okhttp3.Response;

/* JADX INFO: loaded from: classes4.dex */
public final class yxs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tgk f43439a;
    public final bwl b;
    public final ivn c;
    public final us3 d;
    public final mne e;
    public final knf0 f;
    public final btt0 g;

    public yxs(tgk tgkVar, bwl bwlVar, ivn ivnVar, us3 us3Var, mne mneVar, knf0 knf0Var, btt0 btt0Var) {
        tgkVar.getClass();
        us3Var.getClass();
        knf0Var.getClass();
        btt0Var.getClass();
        this.f43439a = tgkVar;
        this.b = bwlVar;
        this.c = ivnVar;
        this.d = us3Var;
        this.e = mneVar;
        this.f = knf0Var;
        this.g = btt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, zje zjeVar) {
        wxs wxsVar;
        String str2;
        if (zjeVar instanceof wxs) {
            wxsVar = (wxs) zjeVar;
            int i = wxsVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wxsVar.k = i - Integer.MIN_VALUE;
            } else {
                wxsVar = new wxs(this, zjeVar);
            }
        } else {
            wxsVar = new wxs(this, zjeVar);
        }
        Object objD0 = wxsVar.i;
        wne wneVar = wne.f39444a;
        int i2 = wxsVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objD0);
            dvj dvjVar = this.e.b;
            cbq cbqVar = new cbq(this, str, yjeVar, (byte) 16);
            wxsVar.k = 1;
            objD0 = qjj.d0(dvjVar, cbqVar, wxsVar);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        jtf0 jtf0Var = (jtf0) objD0;
        Response response = jtf0Var.f17098a;
        if (response.q) {
            sws swsVar = (sws) jtf0Var.b;
            return (swsVar == null || (str2 = swsVar.f32938a) == null) ? "" : str2;
        }
        int i3 = response.d;
        if (i3 == 403) {
            throw new kws();
        }
        throw new zhi0(String.valueOf(i3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zje zjeVar, String str, boolean z) {
        xxs xxsVar;
        if (zjeVar instanceof xxs) {
            xxsVar = (xxs) zjeVar;
            int i = xxsVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xxsVar.k = i - Integer.MIN_VALUE;
            } else {
                xxsVar = new xxs(this, zjeVar);
            }
        } else {
            xxsVar = new xxs(this, zjeVar);
        }
        Object objD0 = xxsVar.i;
        wne wneVar = wne.f39444a;
        int i2 = xxsVar.k;
        if (i2 == 0) {
            z1x.P(objD0);
            dvj dvjVar = this.e.b;
            ys8 ys8Var = new ys8((Object) this, z, (Object) str, (yje) null, (byte) 9);
            xxsVar.k = 1;
            objD0 = qjj.d0(dvjVar, ys8Var, xxsVar);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        eys eysVar = (eys) objD0;
        Integer num = eysVar.f8642a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str2 = eysVar.b;
        if (str2 == null) {
            str2 = "";
        }
        if (iIntValue == 3) {
            throw new lws();
        }
        if (iIntValue == 5) {
            throw new kws();
        }
        if (iIntValue != 0 && StringsKt.W(str2)) {
            throw new ss3();
        }
        if (iIntValue != 0 && !StringsKt.W(str2)) {
            throw new hxs(str2);
        }
        String str3 = eysVar.c;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = eysVar.d;
        String str5 = str4 != null ? str4 : "";
        Integer num2 = eysVar.e;
        return new vxs(num2 != null ? num2.intValue() : 0, str3, str5);
    }
}
