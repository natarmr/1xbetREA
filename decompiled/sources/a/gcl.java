package a;

import android.gov.nist.core.Separators;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class gcl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f11068a;
    public final vwb0 b;
    public final vby c;
    public final p7m0 d;
    public final p7m0 e;
    public final p7m0 f;

    public gcl(us00 us00Var, vwb0 vwb0Var, vby vbyVar) {
        Object obj;
        this.f11068a = us00Var;
        this.b = vwb0Var;
        this.c = vbyVar;
        try {
            String strC = vwb0Var.c("KEY_UPLOADED_MEDIA_IDS", "");
            if (strC.length() == 0) {
                obj = lun.f20680a;
                obj.getClass();
            } else {
                obj = (Map) vbyVar.b(new inv(ysm0.f43175a, vnt0.Companion.serializer(), (byte) 1), strC);
            }
        } catch (Exception unused) {
            obj = lun.f20680a;
            obj.getClass();
        }
        this.d = q7m0.a(obj);
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.e = q7m0.a(lunVar);
        this.f = q7m0.a(lunVar);
        d();
    }

    public final void a() {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        p7m0 p7m0Var = this.d;
        p7m0Var.getClass();
        p7m0Var.o(null, lunVar);
        p7m0 p7m0Var2 = this.e;
        p7m0Var2.getClass();
        p7m0Var2.o(null, lunVar);
        p7m0 p7m0Var3 = this.f;
        p7m0Var3.getClass();
        p7m0Var3.o(null, lunVar);
    }

    public final String b(String str, String str2) {
        String str3;
        str.getClass();
        str2.getClass();
        Iterator it = ((Map) this.d.getValue()).entrySet().iterator();
        do {
            str3 = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (Intrinsics.d(((vnt0) entry.getValue()).b, str) && Intrinsics.d(((vnt0) entry.getValue()).f37735a, str2)) {
                str3 = (String) entry.getKey();
            }
        } while (str3 == null);
        return str3;
    }

    public final void c(String str) {
        str.getClass();
        p7m0 p7m0Var = this.d;
        LinkedHashMap linkedHashMapP = xp20.p((Map) p7m0Var.getValue());
        if (linkedHashMapP.remove(str) != null) {
            this.b.h("KEY_UPLOADED_MEDIA_IDS", this.c.d(new inv(ysm0.f43175a, vnt0.Companion.serializer(), (byte) 1), linkedHashMapP));
        }
        p7m0Var.getClass();
        p7m0Var.o(null, linkedHashMapP);
    }

    public final void d() {
        Iterable<File> iterableG0;
        String strSubstring;
        HashMap map = new HashMap();
        File file = new File(this.f11068a.getFilesDir(), "consultant_downloads");
        file.mkdirs();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || (iterableG0 = tx3.g0(fileArrListFiles)) == null) {
            iterableG0 = iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(iterableG0, 10));
        for (File file2 : iterableG0) {
            file2.getClass();
            String name = file2.getName();
            name.getClass();
            int length = name.length() - 1;
            if (length < 0) {
                length = -1;
                break;
            }
            while (true) {
                int i = length - 1;
                if (name.charAt(length) == '.') {
                    break;
                }
                if (i < 0) {
                    length = -1;
                    break;
                }
                length = i;
            }
            if (length != -1) {
                String name2 = file2.getName();
                name2.getClass();
                IntRange intRangeO = l1e0.o(0, length);
                intRangeO.getClass();
                strSubstring = name2.substring(intRangeO.f46068a, intRangeO.b + 1);
            } else {
                strSubstring = "";
            }
            arrayList.add(new lr00(file2, strSubstring));
        }
        Map map2 = (Map) this.d.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = map2.entrySet().iterator();
        while (true) {
            lr00 lr00Var = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            File file3 = new File(((vnt0) entry.getValue()).f37735a);
            if (file3.exists()) {
                lr00Var = new lr00(file3, str);
            } else {
                c(str);
            }
            if (lr00Var != null) {
                arrayList2.add(lr00Var);
            }
        }
        for (lr00 lr00Var2 : CollectionsKt.q0(arrayList, arrayList2)) {
            map.put(lr00Var2.f20506a, lr00Var2.b);
        }
        p7m0 p7m0Var = this.f;
        p7m0Var.getClass();
        p7m0Var.o(null, map);
    }

    public final void e(yos0 yos0Var) {
        p7m0 p7m0Var = this.e;
        LinkedHashMap linkedHashMapP = xp20.p((Map) p7m0Var.getValue());
        yos0 yos0Var2 = (yos0) linkedHashMapP.get(yos0Var.a());
        if (yos0Var2 == null || !yos0Var2.getClass().equals(yos0Var.getClass())) {
            linkedHashMapP.put(yos0Var.a(), yos0Var);
            p7m0Var.getClass();
            p7m0Var.o(null, linkedHashMapP);
        }
    }

    public final File f(String str, String str2, InputStream inputStream, long j) {
        str.getClass();
        str2.getClass();
        inputStream.getClass();
        us00 us00Var = this.f11068a;
        File file = new File(us00Var.getFilesDir(), "consultant_downloads");
        file.mkdirs();
        String strY = mbc.Y(str2);
        File file2 = new File(file, kng0.l(str, Separators.DOT, strY));
        if (file2.exists() && file2.length() == j) {
            return file2;
        }
        if (sj3.Y(us00Var) <= j) {
            throw new xto();
        }
        File file3 = new File(file, kng0.l(str, Separators.DOT, strY));
        file3.createNewFile();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            byte[] bArr = new byte[4096];
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        fileOutputStream.close();
                        return file3;
                    }
                    fileOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        bkb.E(fileOutputStream, th);
                        throw th2;
                    }
                }
                file3.deleteOnExit();
                throw e;
            }
        } catch (Exception e) {
            file3.deleteOnExit();
            throw e;
        }
    }
}
