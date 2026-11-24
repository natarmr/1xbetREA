package a;

import android.os.Build;
import android.util.Log;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.Optional;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class x9f {
    public static final Charset e = Charset.forName("UTF-8");
    public static final byte f = 15;
    public static final v9f g = new v9f();
    public static final l13 h = new l13((byte) 5);
    public static final z7f i = new z7f((byte) 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f40507a = new AtomicInteger(0);
    public final xzp b;
    public final sd60 c;
    public final a8f d;

    public x9f(xzp xzpVar, sd60 sd60Var, a8f a8fVar) {
        this.b = xzpVar;
        this.c = sd60Var;
        this.d = a8fVar;
    }

    public static void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String f(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void g(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final n9f a(String str, final n25 n25Var) {
        String str2 = n25Var.b;
        return (Build.VERSION.SDK_INT < 37 || !(str2.equals(CrashHianalyticsData.EVENT_ID_CRASH) || str2.equals("ndk-crash"))) ? n25Var : (n9f) Optional.of(this.b.G(str, "profiling-manager-info")).filter(new c8f((byte) 1)).flatMap(new t24((byte) 2)).map(new Function() { // from class: a.w9f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                w8f w8fVar = (w8f) obj;
                n25 n25Var2 = n25Var;
                m25 m25VarA = n25Var2.a();
                h9f h9fVar = n25Var2.c;
                o25 o25VarA = h9fVar.a();
                q25 q25Var = (q25) ((p25) h9fVar).f26235a;
                List list = q25Var.f27984a;
                b9f b9fVar = q25Var.b;
                r8f r8fVar = q25Var.c;
                t25 t25Var = q25Var.e;
                List list2 = q25Var.f;
                if (list2 != null) {
                    o25VarA.f24515a = new q25(list, b9fVar, r8fVar, w8fVar, t25Var, list2);
                    m25VarA.c = o25VarA.a();
                    return m25VarA.a();
                }
                StringBuilder sb = new StringBuilder();
                if (list2 == null) {
                    sb.append(" binaries");
                }
                jf4.n(vqd.o("Missing required properties:", sb));
                return null;
            }
        }).orElse(n25Var);
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        xzp xzpVar = this.b;
        arrayList.addAll(xzp.V(((File) xzpVar.f).listFiles()));
        arrayList.addAll(xzp.V(((File) xzpVar.g).listFiles()));
        l13 l13Var = h;
        Collections.sort(arrayList, l13Var);
        List listV = xzp.V(((File) xzpVar.e).listFiles());
        Collections.sort(listV, l13Var);
        arrayList.addAll(listV);
        return arrayList;
    }

    public final NavigableSet d() {
        return new TreeSet(xzp.V(((File) this.b.d).list())).descendingSet();
    }

    public final void e(n9f n9fVar, String str, boolean z) {
        xzp xzpVar = this.b;
        int i2 = this.c.e().f20766a.f40449a;
        g.getClass();
        try {
            g(xzpVar.G(str, kng0.l("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f40507a.getAndIncrement())), z ? BundleUtil.UNDERLINE_TAG : "")), v9f.f37032a.a(n9fVar));
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        z7f z7fVar = new z7f((byte) 4);
        File file = new File((File) xzpVar.d, str);
        file.mkdirs();
        List<File> listV = xzp.V(file.listFiles(z7fVar));
        Collections.sort(listV, new l13((byte) 6));
        int size = listV.size();
        for (File file2 : listV) {
            if (size <= i2) {
                return;
            }
            xzp.T(file2);
            size--;
        }
    }
}
