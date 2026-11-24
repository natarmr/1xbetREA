package a;

import android.content.Context;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tut0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static wut0 f34568a;
    public static vkr0 b;
    public static fvt0 c;
    public static final ArrayList d = new ArrayList();
    public static int e;

    static {
        maz.b(w7f.y);
    }

    public static final Object a(vvt0 vvt0Var) {
        vkr0 vkr0Var = b;
        if (vkr0Var == null) {
            Intrinsics.h("apiManager");
            throw null;
        }
        wut0 wut0Var = (wut0) vkr0Var.b;
        String str = wut0Var.e;
        vvt0Var.c.put(CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, (String) wut0Var.o.invoke());
        vvt0Var.c.put("device_id", wut0Var.d.getValue());
        String str2 = (String) wut0Var.u.getValue();
        if (str2 != null) {
            vvt0Var.c.put("external_device_id", str2);
        }
        vvt0Var.c.put("v", str);
        fd40 fd40Var = new fd40();
        fd40Var.f9341a = 1;
        fd40Var.b = "";
        fd40Var.c = "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        fd40Var.e = linkedHashMap;
        fd40Var.d = (byte) 4;
        linkedHashMap.putAll(vvt0Var.c);
        String str3 = vvt0Var.f38120a;
        str3.getClass();
        fd40Var.b = str3;
        int i = vvt0Var.b;
        if (i == 0) {
            throw null;
        }
        fd40Var.f9341a = i;
        str.getClass();
        fd40Var.c = str;
        svt0 svt0Var = new svt0(fd40Var);
        kf60 kf60VarM = vkr0Var.m();
        ywu ywuVar = new ywu((byte) 12);
        ywuVar.b = "";
        ywuVar.c = "";
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ywuVar.d = linkedHashMap2;
        new LinkedHashMap();
        String str4 = svt0Var.b;
        str4.getClass();
        ywuVar.b = str4;
        String str5 = svt0Var.c;
        str5.getClass();
        ywuVar.c = str5;
        LinkedHashMap linkedHashMap3 = svt0Var.d;
        linkedHashMap3.getClass();
        linkedHashMap2.putAll(linkedHashMap3);
        byte b2 = svt0Var.e;
        if (svt0Var.f32887a == 0) {
            throw null;
        }
        wut0 wut0Var2 = (wut0) vkr0Var.b;
        tnx tnxVar = new tnx(vkr0Var, new wa3(vkr0Var, new s1o(vkr0Var, b2, new ce40(vkr0Var, kf60VarM, ywuVar, (String) wut0Var2.d.getValue(), (String) wut0Var2.o.invoke(), vvt0Var), (ilp0) vkr0Var.d), svt0Var, wut0Var2.t));
        bwq0 bwq0Var = bwq0.f3338a;
        imx imxVar = new imx(vkr0Var, str4, (kvq0) ((n0o0) vkr0Var.c).getValue(), new imx(vkr0Var, StringsKt.q0(str4, '.'), (kvq0) ((n0o0) vkr0Var.c).getValue(), new v2e0(vkr0Var, str4, (kvq0) ((n0o0) vkr0Var.c).getValue(), new cwq0(vkr0Var, b2, tnxVar))));
        p4 s1oVar = imxVar;
        if (b2 > 0) {
            s1oVar = new s1o(vkr0Var, b2, imxVar);
        }
        td9 td9Var = new td9();
        td9Var.b = "";
        td9Var.c = "";
        Object objQ0 = s1oVar.q0(td9Var);
        objQ0.getClass();
        return objQ0;
    }

    public static final void b(Context context) {
        context.getClass();
        int integer = e;
        if (integer == 0) {
            integer = context.getResources().getInteger(R.integer.com_vk_sdk_AppId);
            if (integer == 0) {
                itt0.k("<integer name=\"com_vk_sdk_AppId\">your_app_id</integer> is not found in your resources.xml");
                return;
            }
            e = integer;
        }
        wut0 wut0Var = new wut0(context, integer, new nvt0(context));
        f34568a = wut0Var;
        b = new vkr0(wut0Var);
        nmt0 nmt0Var = wut0Var.p;
        nmt0Var.getClass();
        fvt0 fvt0Var = new fvt0();
        fvt0Var.f10231a = nmt0Var;
        c = fvt0Var;
        n0o0 n0o0VarB = maz.b(w7f.x);
        vkr0 vkr0Var = b;
        Object obj = null;
        if (vkr0Var == null) {
            Intrinsics.h("apiManager");
            throw null;
        }
        kf60 kf60VarM = vkr0Var.m();
        kf60VarM.getClass();
        if (n0o0VarB.a()) {
            kf60VarM.a(n0o0VarB.getValue().toString());
        }
        kf60VarM.c = n0o0VarB;
        if (c()) {
            kvt0 kvt0Var = new kvt0("stats.trackVisitor");
            Object value = wvt0.c.getValue();
            value.getClass();
            ((ExecutorService) value).submit(new qaq0(kvt0Var, obj, (byte) 9));
        }
    }

    public static final boolean c() {
        fvt0 fvt0Var = c;
        if (fvt0Var == null) {
            Intrinsics.h("authManager");
            throw null;
        }
        uut0 uut0VarQ = fvt0Var.q();
        if (uut0VarQ == null) {
            return false;
        }
        int i = uut0VarQ.h;
        return i <= 0 || uut0VarQ.d + ((long) (i * 1000)) > System.currentTimeMillis();
    }
}
