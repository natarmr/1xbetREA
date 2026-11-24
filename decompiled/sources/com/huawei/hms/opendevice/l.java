package com.huawei.hms.opendevice;

import a.afn0;
import a.cfx0;
import a.jwn;
import a.meg0;
import a.obc;
import a.rq8;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f45918a = "l";
    private static Map<String, String> b = new HashMap();
    private static final Object c = new Object();

    private static void a(String str, String str2, String str3, String str4, String str5, Context context) throws Throwable {
        String strC = e.c(context.getApplicationContext());
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        try {
            a("m", str, strC + "/files/math/m");
            a("p", str2, strC + "/files/panda/p");
            a("d", str3, strC + "/files/panda/d");
            a("t", str4, strC + "/files/math/t");
            a("s", str5, strC + "/files/s");
        } catch (IOException unused) {
            HMSLog.e(f45918a, "save key IOException.");
        }
    }

    public static String b(Context context) {
        if (!i()) {
            HMSLog.i(f45918a, "work key is empty, execute init.");
            c(context);
        }
        String strI = rq8.I(f(), b());
        return n.a(strI) ? strI : e(context);
    }

    public static void c(Context context) {
        synchronized (c) {
            try {
                d(context.getApplicationContext());
                if (i()) {
                    HMSLog.i(f45918a, "The local secret is already in separate file mode.");
                    return;
                }
                File file = new File(e.c(context.getApplicationContext()) + "/shared_prefs/LocalAvengers.xml");
                if (file.exists()) {
                    if (file.exists() && !file.delete()) {
                        Log.e("IOUtil", "deleteSecure exception");
                    }
                    HMSLog.i(f45918a, "destroy C, delete file LocalAvengers.xml.");
                }
                byte[] bArrB = jwn.b(32);
                byte[] bArrB2 = jwn.b(32);
                byte[] bArrB3 = jwn.b(32);
                byte[] bArrB4 = jwn.b(32);
                String strA = d.a(bArrB);
                String strA2 = d.a(bArrB2);
                String strA3 = d.a(bArrB3);
                String strA4 = d.a(bArrB4);
                a(strA, strA2, strA3, strA4, rq8.N(d.a(jwn.b(32)), a(strA, strA2, strA3, strA4)), context);
                HMSLog.i(f45918a, "generate D.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static void d(Context context) throws Throwable {
        if (i()) {
            HMSLog.i(f45918a, "secretKeyCache not empty.");
            return;
        }
        b.clear();
        String strC = e.c(context);
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        String strA = m.a(strC + "/files/math/m");
        String strA2 = m.a(strC + "/files/panda/p");
        String strA3 = m.a(strC + "/files/panda/d");
        String strA4 = m.a(strC + "/files/math/t");
        String strA5 = m.a(strC + "/files/s");
        if (n.a(strA, strA2, strA3, strA4, strA5)) {
            b.put("m", strA);
            b.put("p", strA2);
            b.put("d", strA3);
            b.put("t", strA4);
            b.put("s", strA5);
        }
    }

    private static synchronized String e(Context context) {
        String strI = rq8.I(f(), b());
        if (n.a(strI)) {
            HMSLog.i(f45918a, "keyS has been upgraded, no require operate again.");
            return strI;
        }
        String strI2 = rq8.I(f(), (byte[]) h().f21643a.clone());
        if (n.a(strI2)) {
            HMSLog.i(f45918a, "keyS is encrypt by RootKeyUtil, upgrade encrypt mode.");
            a(rq8.N(strI2, b()), context);
            return strI2;
        }
        String strI3 = rq8.I(f(), cfx0.F(d(), e(), c(), obc.R(g()), 32, false));
        if (!n.a(strI3)) {
            HMSLog.e(f45918a, "all mode unable to decrypt root key.");
            return "";
        }
        HMSLog.i(f45918a, "keyS is encrypt by ExportRootKey with sha1, upgrade encrypt mode to sha256.");
        a(rq8.N(strI3, b()), context);
        return strI3;
    }

    private static String f() {
        return a("s");
    }

    private static String g() {
        return a("t");
    }

    private static meg0 h() {
        String strD = d();
        String strE = e();
        String strC = c();
        String strG = g();
        meg0 meg0Var = new meg0();
        meg0Var.f21643a = null;
        byte[] bArrR = obc.R(strG);
        if (Build.VERSION.SDK_INT < 26) {
            afn0.k("RootKeyUtil", "initRootKey: sha1");
            meg0Var.f21643a = cfx0.F(strD, strE, strC, bArrR, 16, false);
            return meg0Var;
        }
        afn0.k("RootKeyUtil", "initRootKey: sha256");
        meg0Var.f21643a = cfx0.F(strD, strE, strC, bArrR, 16, true);
        return meg0Var;
    }

    private static boolean i() {
        return !TextUtils.isEmpty(f());
    }

    private static byte[] b() {
        return a(d(), e(), c(), g());
    }

    public static byte[] a(Context context) {
        byte[] bArrA = d.a(context.getString(R.string.push_cat_head));
        byte[] bArrA2 = d.a(context.getString(R.string.push_cat_body));
        return a(a(a(bArrA, bArrA2), d.a(a())));
    }

    private static String a() {
        return "2A57086C86EF54970C1E6EB37BFC72B1";
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length != 0 && bArr2.length != 0) {
            int length = bArr.length;
            if (length != bArr2.length) {
                return new byte[0];
            }
            byte[] bArr3 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
            }
            return bArr3;
        }
        return new byte[0];
    }

    private static byte[] a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] >> 2);
            }
            return bArr;
        }
        return new byte[0];
    }

    private static byte[] a(String str, String str2, String str3, String str4) {
        if (Build.VERSION.SDK_INT >= 26) {
            return cfx0.F(str, str2, str3, obc.R(str4), 32, true);
        }
        return cfx0.F(str, str2, str3, obc.R(str4), 32, false);
    }

    private static void a(String str, Context context) throws Throwable {
        String strC = e.c(context.getApplicationContext());
        if (TextUtils.isEmpty(strC)) {
            return;
        }
        try {
            a("s", str, strC + "/files/s");
        } catch (IOException unused) {
            HMSLog.e(f45918a, "save keyS IOException.");
        }
    }

    private static void a(String str, String str2, String str3) throws Throwable {
        OutputStreamWriter outputStreamWriter;
        HMSLog.i(f45918a, "save local secret key.");
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(str3);
            m.a(file);
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(outputStreamWriter);
                try {
                    bufferedWriter2.write(str2);
                    bufferedWriter2.flush();
                    b.put(str, str2);
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter2);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    IOUtils.closeQuietly((Writer) outputStreamWriter);
                    IOUtils.closeQuietly((Writer) bufferedWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStreamWriter = null;
        }
    }

    private static String c() {
        return a("d");
    }

    private static String e() {
        return a("p");
    }

    private static String a(String str) {
        String str2 = b.get(str);
        return TextUtils.isEmpty(str2) ? "" : str2;
    }

    private static String d() {
        return a("m");
    }
}
