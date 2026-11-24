package a;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class ka10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f17941a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static sb10 a(final String str, Callable callable, Runnable runnable) {
        fa10 fa10VarA = str == null ? null : ga10.b.a(str);
        sb10 sb10Var = fa10VarA != null ? new sb10(fa10VarA) : null;
        HashMap map = f17941a;
        if (str != null && map.containsKey(str)) {
            sb10Var = (sb10) map.get(str);
        }
        if (sb10Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return sb10Var;
        }
        final byte b2 = 0;
        sb10 sb10Var2 = new sb10(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            sb10Var2.b(new kb10() { // from class: a.ia10
                @Override // a.kb10
                public final void onResult(Object obj) {
                    byte b3 = b2;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (b3) {
                        case 0:
                            HashMap map2 = ka10.f17941a;
                            map2.remove(str2);
                            atomicBoolean2.set(true);
                            if (map2.size() == 0) {
                                ka10.k();
                            }
                            break;
                        default:
                            HashMap map3 = ka10.f17941a;
                            map3.remove(str2);
                            atomicBoolean2.set(true);
                            if (map3.size() == 0) {
                                ka10.k();
                            }
                            break;
                    }
                }
            });
            final byte b3 = 1;
            sb10Var2.a(new kb10() { // from class: a.ia10
                @Override // a.kb10
                public final void onResult(Object obj) {
                    byte b4 = b3;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (b4) {
                        case 0:
                            HashMap map2 = ka10.f17941a;
                            map2.remove(str2);
                            atomicBoolean2.set(true);
                            if (map2.size() == 0) {
                                ka10.k();
                            }
                            break;
                        default:
                            HashMap map3 = ka10.f17941a;
                            map3.remove(str2);
                            atomicBoolean2.set(true);
                            if (map3.size() == 0) {
                                ka10.k();
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, sb10Var2);
                if (map.size() == 1) {
                    k();
                }
            }
        }
        return sb10Var2;
    }

    public static ob10 b(Context context, String str, String str2) {
        fa10 fa10VarA = str2 == null ? null : ga10.b.a(str2);
        if (fa10VarA != null) {
            return new ob10(fa10VarA);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new ob10(e);
        }
    }

    public static ob10 c(Context context, InputStream inputStream, String str) {
        fa10 fa10VarA = str == null ? null : ga10.b.a(str);
        if (fa10VarA != null) {
            return new ob10(fa10VarA);
        }
        try {
            zae0 zae0Var = new zae0(w9x.L(inputStream));
            byte b2 = 1;
            if (j(zae0Var, c).booleanValue()) {
                return h(context, new ZipInputStream(new e99(zae0Var, b2)), str);
            }
            if (j(zae0Var, d).booleanValue()) {
                return e(w9x.L(new GZIPInputStream(new e99(zae0Var, b2))), str);
            }
            String[] strArr = ndy.e;
            return d(new udy(zae0Var), str, true);
        } catch (IOException e) {
            return new ob10(e);
        }
    }

    public static ob10 d(udy udyVar, String str, boolean z) {
        try {
            fa10 fa10VarA = str == null ? null : ga10.b.a(str);
            if (fa10VarA != null) {
                return new ob10(fa10VarA);
            }
            fa10 fa10VarA2 = la10.a(udyVar);
            if (str != null) {
                ga10.b.f10945a.d(str, fa10VarA2);
            }
            return new ob10(fa10VarA2);
        } catch (Exception e) {
            return new ob10(e);
        } finally {
            if (z) {
                cut0.b(udyVar);
            }
        }
    }

    public static ob10 e(hfx hfxVar, String str) {
        zae0 zae0Var = new zae0(hfxVar);
        String[] strArr = ndy.e;
        return d(new udy(zae0Var), str, true);
    }

    public static sb10 f(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: a.ja10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return ka10.g(context2, i, str);
            }
        }, null);
    }

    public static ob10 g(Context context, int i, String str) {
        fa10 fa10VarA = str == null ? null : ga10.b.a(str);
        if (fa10VarA != null) {
            return new ob10(fa10VarA);
        }
        try {
            zae0 zae0Var = new zae0(w9x.L(context.getResources().openRawResource(i)));
            byte b2 = 1;
            if (j(zae0Var, c).booleanValue()) {
                return h(context, new ZipInputStream(new e99(zae0Var, b2)), str);
            }
            if (!j(zae0Var, d).booleanValue()) {
                String[] strArr = ndy.e;
                return d(new udy(zae0Var), str, true);
            }
            try {
                return e(w9x.L(new GZIPInputStream(new e99(zae0Var, b2))), str);
            } catch (IOException e) {
                return new ob10(e);
            }
        } catch (Resources.NotFoundException e2) {
            return new ob10(e2);
        }
    }

    public static ob10 h(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return i(context, zipInputStream, str);
        } finally {
            cut0.b(zipInputStream);
        }
    }

    public static ob10 i(Context context, ZipInputStream zipInputStream, String str) {
        fa10 fa10VarA;
        hb10 hb10Var;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            fa10VarA = null;
        } else {
            try {
                fa10VarA = ga10.b.a(str);
            } catch (IOException e) {
                return new ob10(e);
            }
        }
        if (fa10VarA != null) {
            return new ob10(fa10VarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        fa10 fa10Var = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                zae0 zae0Var = new zae0(w9x.L(zipInputStream));
                String[] strArr = ndy.e;
                fa10Var = d(new udy(zae0Var), null, false).f24955a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split(Separators.SLASH);
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split(Separators.SLASH);
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new ob10(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    xv00.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    xv00.b("Failed to delete temp font file " + file.getAbsolutePath() + Separators.DOT);
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (fa10Var == null) {
            return new ob10(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) fa10Var.c()).values().iterator();
            do {
                if (!it.hasNext()) {
                    hb10Var = null;
                    break;
                }
                hb10Var = (hb10) it.next();
            } while (!hb10Var.d.equals(str4));
            if (hb10Var != null) {
                hb10Var.f = cut0.d((Bitmap) entry.getValue(), hb10Var.f12750a, hb10Var.b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (irq irqVar : fa10Var.f.values()) {
                if (irqVar.f15272a.equals(entry2.getKey())) {
                    irqVar.d = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                xv00.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) fa10Var.c()).entrySet().iterator();
            while (it2.hasNext()) {
                hb10 hb10Var2 = (hb10) ((Map.Entry) it2.next()).getValue();
                if (hb10Var2 == null) {
                    return null;
                }
                String str5 = hb10Var2.d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            hb10Var2.f = cut0.d(bitmapDecodeByteArray, hb10Var2.f12750a, hb10Var2.b);
                        }
                    } catch (IllegalArgumentException e2) {
                        xv00.c("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            ga10.b.f10945a.d(str, fa10Var);
        }
        return new ob10(fa10Var);
    }

    public static Boolean j(zae0 zae0Var, byte[] bArr) {
        try {
            zae0 zae0VarD = zae0Var.d();
            for (byte b2 : bArr) {
                if (zae0VarD.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            zae0VarD.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            xv00.f41534a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void k() {
        ArrayList arrayList = new ArrayList(b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        hny.b();
    }

    public static String l(int i, Context context) {
        return b1j.h(i, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }
}
