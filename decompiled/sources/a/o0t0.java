package a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o0t0 extends atm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f24446a;
    public static final Constructor b;
    public static final Method c;
    public static final Method d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        b = constructor;
        f24446a = cls;
        c = method2;
        d = method;
    }

    public static boolean u(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) c.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface v(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f24446a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // a.atm0
    public final Typeface g(Context context, esq esqVar, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (fsq fsqVar : esqVar.f8342a) {
                int i2 = fsqVar.f;
                File fileR = btm0.r(context);
                if (fileR != null) {
                    try {
                        if (btm0.n(fileR, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileR);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                    fileR.delete();
                                } catch (Throwable th) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                        } else {
                            fileR.delete();
                        }
                        if (map != null && u(objNewInstance, map, fsqVar.e, fsqVar.b, fsqVar.c)) {
                        }
                    } catch (Throwable th3) {
                        fileR.delete();
                        throw th3;
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return v(objNewInstance);
        }
        return null;
    }

    @Override // a.atm0
    public final Typeface h(Context context, ssq[] ssqVarArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            nuj0 nuj0Var = new nuj0(0);
            for (ssq ssqVar : ssqVarArr) {
                Uri uri = ssqVar.f32737a;
                ByteBuffer byteBufferS = (ByteBuffer) nuj0Var.get(uri);
                if (byteBufferS == null) {
                    byteBufferS = btm0.s(context, uri);
                    nuj0Var.put(uri, byteBufferS);
                }
                if (byteBufferS != null && u(objNewInstance, byteBufferS, ssqVar.b, ssqVar.c, ssqVar.d)) {
                }
            }
            Typeface typefaceV = v(objNewInstance);
            if (typefaceV != null) {
                return Typeface.create(typefaceV, i);
            }
        }
        return null;
    }
}
