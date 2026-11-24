package a;

import android.gov.nist.core.Separators;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class x0t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f40088a;
    public final OkHttpClient b;
    public final mne c;

    public x0t0(us00 us00Var, OkHttpClient okHttpClient, mne mneVar) {
        this.f40088a = us00Var;
        this.b = okHttpClient;
        this.c = mneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, zje zjeVar) throws Exception {
        w0t0 w0t0Var;
        File file;
        if (zjeVar instanceof w0t0) {
            w0t0Var = (w0t0) zjeVar;
            int i = w0t0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                w0t0Var.m = i - Integer.MIN_VALUE;
            } else {
                w0t0Var = new w0t0(this, zjeVar);
            }
        } else {
            w0t0Var = new w0t0(this, zjeVar);
        }
        Object obj = w0t0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = w0t0Var.m;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            File file2 = new File(this.f40088a.getCacheDir(), str2);
            File parentFile = file2.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            if (file2.exists()) {
                return str2;
            }
            w0t0Var.i = str2;
            w0t0Var.j = file2;
            w0t0Var.m = 1;
            Request.Builder builder = new Request.Builder();
            StringBuilder sb = new StringBuilder(ujn.h);
            str.getClass();
            if (str.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                sb.setLength(0);
                sb.append(str);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(str, '/'));
            }
            builder.d(sb.toString());
            Object objD0 = qjj.d0(this.c.b, new rtq0(this, new Request(builder), yjeVar, (byte) 15), w0t0Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
            obj = objD0;
            file = file2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            file = w0t0Var.j;
            str2 = w0t0Var.i;
            z1x.P(obj);
        }
        Response response = (Response) obj;
        if (!response.q) {
            throw new Exception("Failed to load font");
        }
        ResponseBody responseBody = response.g;
        if (responseBody != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    InputStream inputStreamA = responseBody.a();
                    try {
                        wha0.J(inputStreamA, fileOutputStream, 8192);
                        inputStreamA.close();
                        fileOutputStream.close();
                        responseBody.close();
                        if (str2 != null) {
                            return str2;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            bkb.E(inputStreamA, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        bkb.E(fileOutputStream, th3);
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    bkb.E(responseBody, th5);
                    throw th6;
                }
            }
        }
        throw new Exception("Failed to load font");
    }
}
