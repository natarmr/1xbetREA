package a;

import android.os.Build;
import android.provider.Settings;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
public final class i7e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f14287a;
    public final q7d0 b;
    public final vby c;
    public l14 e;
    public final p7m0 g;
    public final p7m0 h;
    public final p7m0 i;
    public final p7m0 j;
    public final p7m0 k;
    public final qoj0 l;
    public final AtomicLong d = new AtomicLong(0);
    public final p7m0 f = q7m0.a(zji0.f44483a);

    public i7e(vby vbyVar, us00 us00Var, q7d0 q7d0Var) {
        Object obj;
        this.f14287a = us00Var;
        this.b = q7d0Var;
        this.c = vbyVar;
        try {
            String string = q7d0Var.a().getString("PREF_KEY_SEND_MESSAGES", "");
            if (string == null || string.length() == 0) {
                obj = lun.f20680a;
                obj.getClass();
            } else {
                obj = (Map) vbyVar.b(new inv(ysm0.f43175a, oei0.Companion.serializer(), (byte) 1), string);
            }
        } catch (Exception unused) {
            obj = lun.f20680a;
            obj.getClass();
        }
        this.g = q7m0.a(obj);
        this.h = q7m0.a(Boolean.valueOf(this.b.a().getBoolean("PREF_KEY_MUTE_STATE", false)));
        this.i = q7m0.a(gxb.k);
        this.j = q7m0.a(0);
        this.k = q7m0.a(null);
        this.l = roj0.a(0, 1, i99.b);
    }

    public final void a(ArrayList arrayList) {
        p7m0 p7m0Var = this.i;
        gxb gxbVar = (gxb) p7m0Var.getValue();
        List list = gxbVar.i;
        int iA = wp20.a(r3d.q(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : list) {
            linkedHashMap.put(((xrt0) obj).a(), obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xrt0 xrt0Var = (xrt0) it.next();
            linkedHashMap2.put(xrt0Var.a(), xrt0Var);
        }
        gxb gxbVarA = gxb.a(gxbVar, false, 0, 0, null, false, CollectionsKt.L0(linkedHashMap2.values()), null, 767);
        p7m0Var.getClass();
        p7m0Var.o(null, gxbVarA);
    }

    public final void b() {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        p7m0 p7m0Var = this.g;
        p7m0Var.getClass();
        p7m0Var.o(null, lunVar);
        this.i.n(gxb.k);
        p7m0 p7m0Var2 = this.f;
        p7m0Var2.getClass();
        p7m0Var2.o(null, zji0.f44483a);
        p7m0 p7m0Var3 = this.j;
        p7m0Var3.getClass();
        p7m0Var3.o(null, 0);
        this.k.n(null);
        this.b.d("PREF_KEY_MUTE_STATE", false);
        Boolean bool = Boolean.FALSE;
        p7m0 p7m0Var4 = this.h;
        p7m0Var4.getClass();
        p7m0Var4.o(null, bool);
    }

    public final String c() {
        String string = Settings.Secure.getString(this.f14287a.getContentResolver(), "android_id");
        if (string == null) {
            string = "";
        }
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        String str = strArr.length == 0 ? "" : strArr[0];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = (string + Build.BOARD + Build.BRAND + str + Build.DEVICE + Build.MANUFACTURER + Build.MODEL + Build.PRODUCT).getBytes(Charsets.UTF_8);
            bytes.getClass();
            byte[] bArrDigest = messageDigest.digest(bytes);
            bArrDigest.getClass();
            return tx3.L(bArrDigest, "", new vzd((byte) 1), 30);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public final boolean d(String str) {
        str.getClass();
        p7m0 p7m0Var = this.g;
        LinkedHashMap linkedHashMapP = xp20.p((Map) p7m0Var.getValue());
        boolean z = linkedHashMapP.remove(str) != null;
        if (z) {
            this.b.g("PREF_KEY_SEND_MESSAGES", this.c.d(new inv(ysm0.f43175a, oei0.Companion.serializer(), (byte) 1), linkedHashMapP));
        }
        p7m0Var.getClass();
        p7m0Var.o(null, linkedHashMapP);
        return z;
    }
}
