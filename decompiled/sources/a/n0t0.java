package a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class n0t0 extends atm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Class f22718a = null;
    public static Constructor b = null;
    public static Method c = null;
    public static Method d = null;
    public static boolean e = false;

    public static boolean u(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        v();
        try {
            return ((Boolean) c.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            ohq.p(e2);
            return false;
        }
    }

    public static void v() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (e) {
            return;
        }
        e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        b = constructor;
        f22718a = cls;
        c = method2;
        d = method;
    }

    @Override // a.atm0
    public Typeface g(Context context, esq esqVar, Resources resources, int i) throws NoSuchMethodException {
        v();
        try {
            Object objNewInstance = b.newInstance(null);
            for (fsq fsqVar : esqVar.f8342a) {
                File fileR = btm0.r(context);
                if (fileR == null) {
                    return null;
                }
                try {
                    if (!btm0.n(fileR, resources, fsqVar.f)) {
                        return null;
                    }
                    if (!u(objNewInstance, fileR.getPath(), fsqVar.b, fsqVar.c)) {
                        return null;
                    }
                    fileR.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileR.delete();
                }
            }
            v();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f22718a, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) d.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                ohq.p(e2);
                return null;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            ohq.p(e3);
            return null;
        }
    }

    @Override // a.atm0
    public Typeface h(Context context, ssq[] ssqVarArr, int i) {
        File file;
        Typeface typefaceCreateFromFile;
        if (ssqVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(atm0.k(ssqVarArr, i).f32737a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                            file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (ErrnoException unused) {
                    }
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile2;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        File fileR = btm0.r(context);
                        if (fileR == null) {
                            typefaceCreateFromFile = null;
                        } else {
                            try {
                                if (btm0.o(fileR, fileInputStream)) {
                                    typefaceCreateFromFile = Typeface.createFromFile(fileR.getPath());
                                    fileR.delete();
                                } else {
                                    fileR.delete();
                                    typefaceCreateFromFile = null;
                                }
                            } catch (RuntimeException unused2) {
                            } catch (Throwable th3) {
                                fileR.delete();
                                throw th3;
                            }
                        }
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    } catch (Throwable th4) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}
