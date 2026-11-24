package a;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class lw40 implements mlx {
    public static final uuz j = new uuz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f20746a;
    public final File b;
    public final ltb c;
    public final String d;
    public final String e;
    public final String f;
    public final k050 g;
    public final n0o0 h;
    public final n0o0 i;

    public lw40(CoroutineContext coroutineContext, File file) {
        coroutineContext.getClass();
        this.f20746a = coroutineContext;
        this.b = file;
        Object obj = ix40.b;
        this.c = nkb.z(new mt00((Object) file, (yje) null, (byte) 21));
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = new k050();
        final byte b = 0;
        this.h = maz.b(new Function0(this) { // from class: a.gw40
            public final /* synthetic */ lw40 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                Throwable th;
                ParcelFileDescriptor parcelFileDescriptorOpen;
                byte b2 = b;
                lw40 lw40Var = this.b;
                switch (b2) {
                    case 0:
                        File file2 = new File(lw40Var.b.getAbsolutePath() + lw40Var.d);
                        lw40.f(file2);
                        return file2;
                    default:
                        koj0.f18634a.getClass();
                        File file3 = new File(lw40Var.b.getAbsolutePath() + lw40Var.e);
                        lw40.f(file3);
                        joj0 joj0Var = null;
                        try {
                            parcelFileDescriptorOpen = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                parcelFileDescriptorOpen.getClass();
                                NativeSharedCounter nativeSharedCounter = ioj0.b;
                                if (nativeSharedCounter != null) {
                                    int fd = parcelFileDescriptorOpen.getFd();
                                    if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                                        if (jNativeCreateSharedCounter >= 0) {
                                            joj0Var = new joj0(nativeSharedCounter, jNativeCreateSharedCounter);
                                        } else {
                                            ohq.l("Failed to mmap counter file");
                                        }
                                    } else {
                                        ohq.l("Failed to truncate counter file");
                                    }
                                } else {
                                    jf4.n("DataStore failed to load the native library to create SharedCounter.");
                                }
                                parcelFileDescriptorOpen.close();
                                return joj0Var;
                            } catch (Throwable th2) {
                                th = th2;
                                if (parcelFileDescriptorOpen != null) {
                                    parcelFileDescriptorOpen.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            parcelFileDescriptorOpen = null;
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        this.i = maz.b(new Function0(this) { // from class: a.gw40
            public final /* synthetic */ lw40 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws Throwable {
                Throwable th;
                ParcelFileDescriptor parcelFileDescriptorOpen;
                byte b3 = b2;
                lw40 lw40Var = this.b;
                switch (b3) {
                    case 0:
                        File file2 = new File(lw40Var.b.getAbsolutePath() + lw40Var.d);
                        lw40.f(file2);
                        return file2;
                    default:
                        koj0.f18634a.getClass();
                        File file3 = new File(lw40Var.b.getAbsolutePath() + lw40Var.e);
                        lw40.f(file3);
                        joj0 joj0Var = null;
                        try {
                            parcelFileDescriptorOpen = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                parcelFileDescriptorOpen.getClass();
                                NativeSharedCounter nativeSharedCounter = ioj0.b;
                                if (nativeSharedCounter != null) {
                                    int fd = parcelFileDescriptorOpen.getFd();
                                    if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                                        if (jNativeCreateSharedCounter >= 0) {
                                            joj0Var = new joj0(nativeSharedCounter, jNativeCreateSharedCounter);
                                        } else {
                                            ohq.l("Failed to mmap counter file");
                                        }
                                    } else {
                                        ohq.l("Failed to truncate counter file");
                                    }
                                } else {
                                    jf4.n("DataStore failed to load the native library to create SharedCounter.");
                                }
                                parcelFileDescriptorOpen.close();
                                return joj0Var;
                            } catch (Throwable th2) {
                                th = th2;
                                if (parcelFileDescriptorOpen != null) {
                                    parcelFileDescriptorOpen.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            parcelFileDescriptorOpen = null;
                        }
                        break;
                }
            }
        });
    }

    public static void f(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                itt0.j(file, "Unable to create parent directories of ");
                return;
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // a.mlx
    public final Object a(zje zjeVar) {
        n0o0 n0o0Var = this.i;
        if (n0o0Var.a()) {
            joj0 joj0Var = (joj0) ((koj0) n0o0Var.getValue());
            return new Integer(joj0Var.b.nativeGetCounterValue(joj0Var.c));
        }
        return qjj.d0(this.f20746a, new iw40(this, null, (byte) 0), zjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5 A[Catch: all -> 0x00b9, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00b9, blocks: (B:41:0x00b5, B:55:0x00d3, B:56:0x00d6), top: B:72:0x0022, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d3 A[Catch: all -> 0x00b9, TRY_ENTER, TryCatch #4 {all -> 0x00b9, blocks: (B:41:0x00b5, B:55:0x00d3, B:56:0x00d6), top: B:72:0x0022, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v21, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.Closeable, java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // a.mlx
    public final Object b(Function1 function1, zje zjeVar) throws Throwable {
        jw40 jw40Var;
        ?? r9;
        FileOutputStream fileOutputStream;
        Throwable th;
        ?? r10;
        ?? r8;
        ?? r2;
        Closeable closeable;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        ?? r0;
        ?? r11;
        if (zjeVar instanceof jw40) {
            jw40Var = (jw40) zjeVar;
            int i = jw40Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                jw40Var.n = i - Integer.MIN_VALUE;
            } else {
                jw40Var = new jw40(this, zjeVar);
            }
        } else {
            jw40Var = new jw40(this, zjeVar);
        }
        ?? r12 = jw40Var.l;
        wne wneVar = wne.f39444a;
        int i2 = jw40Var.n;
        try {
            try {
                try {
                    if (i2 == 0) {
                        z1x.P(r12);
                        jw40Var.i = function1;
                        k050 k050Var = this.g;
                        jw40Var.j = k050Var;
                        jw40Var.n = 1;
                        Object objD = k050Var.d(jw40Var);
                        r9 = function1;
                        r12 = k050Var;
                        if (objD != wneVar) {
                        }
                        return wneVar;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                jf4.n("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileLock = (FileLock) jw40Var.k;
                            closeable = (Closeable) jw40Var.j;
                            i050 i050Var = (i050) jw40Var.i;
                            try {
                                z1x.P(r12);
                                r0 = i050Var;
                                r11 = r12;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    bkb.E(closeable, null);
                                    r0.c(null);
                                    return r11;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r12 = r0;
                                    r12.c(null);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        }
                        closeable = (Closeable) jw40Var.k;
                        r8 = (i050) jw40Var.j;
                        Function1 function2 = (Function1) jw40Var.i;
                        try {
                            z1x.P(r12);
                            r2 = function2;
                            r8 = r8;
                            r10 = r12;
                            fileLock2 = (FileLock) r10;
                            try {
                                jw40Var.i = r8;
                                jw40Var.j = closeable;
                                jw40Var.k = fileLock2;
                                jw40Var.n = 3;
                                objInvoke = r2.invoke(jw40Var);
                                if (objInvoke != wneVar) {
                                    r0 = r8;
                                    fileLock = fileLock2;
                                    r11 = objInvoke;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    bkb.E(closeable, null);
                                    r0.c(null);
                                    return r11;
                                }
                                return wneVar;
                            } catch (Throwable th4) {
                                fileLock = fileLock2;
                                th = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    i050 i050Var2 = (i050) jw40Var.j;
                    Function1 function3 = (Function1) jw40Var.i;
                    z1x.P(r12);
                    r12 = i050Var2;
                    r9 = function3;
                    uuz uuzVar = j;
                    jw40Var.i = r9;
                    jw40Var.j = r12;
                    jw40Var.k = fileOutputStream;
                    jw40Var.n = 2;
                    Object objH = uuzVar.h(fileOutputStream, jw40Var);
                    if (objH != wneVar) {
                        ?? r7 = r12;
                        r10 = objH;
                        r8 = r7;
                        r2 = r9;
                        closeable = fileOutputStream;
                        fileLock2 = (FileLock) r10;
                        jw40Var.i = r8;
                        jw40Var.j = closeable;
                        jw40Var.k = fileLock2;
                        jw40Var.n = 3;
                        objInvoke = r2.invoke(jw40Var);
                        if (objInvoke != wneVar) {
                            r0 = r8;
                            fileLock = fileLock2;
                            r11 = objInvoke;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            bkb.E(closeable, null);
                            r0.c(null);
                            return r11;
                        }
                    }
                    return wneVar;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                fileOutputStream = new FileOutputStream((File) this.h.getValue());
            } catch (Throwable th7) {
                th = th7;
                r12.c(null);
                throw th;
            }
        } catch (Throwable th8) {
            r12 = jw40Var;
            try {
                throw th8;
            } catch (Throwable th9) {
                bkb.E(function1, th8);
                throw th9;
            }
        }
    }

    @Override // a.mlx
    public final gmq c() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc A[Catch: all -> 0x00e0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e0, blocks: (B:61:0x00dc, B:75:0x00f7, B:76:0x00fa), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7 A[Catch: all -> 0x00e0, TRY_ENTER, TryCatch #1 {all -> 0x00e0, blocks: (B:61:0x00dc, B:75:0x00f7, B:76:0x00fa), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v10, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r2v13, types: [a.k050] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [a.kw40, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r4v0, types: [a.wne, java.io.Closeable, java.lang.Object] */
    @Override // a.mlx
    public final Object d(Function2 function2, zje zjeVar) throws Throwable {
        ?? kw40Var;
        ?? r1;
        ?? r2;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        FileInputStream fileInputStream;
        ?? r3;
        ?? r4;
        if (zjeVar instanceof kw40) {
            kw40 kw40Var2 = (kw40) zjeVar;
            int i = kw40Var2.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                kw40Var2.o = i - Integer.MIN_VALUE;
                kw40Var = kw40Var2;
            } else {
                kw40Var = new kw40(this, zjeVar);
            }
        } else {
            kw40Var = new kw40(this, zjeVar);
        }
        Object objInvoke = kw40Var.m;
        ?? r5 = wne.f39444a;
        int i2 = kw40Var.o;
        try {
            if (i2 == 0) {
                z1x.P(objInvoke);
                k050 k050Var = this.g;
                boolean zG = k050Var.g();
                try {
                    if (zG) {
                        FileInputStream fileInputStream2 = new FileInputStream((File) this.h.getValue());
                        try {
                            try {
                                fileLockTryLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (Throwable th) {
                                th = th;
                                fileLock = null;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            String message2 = e.getMessage();
                            if ((message2 == null || !kotlin.text.c.x(message2, this.f, false)) && ((message = e.getMessage()) == null || !kotlin.text.c.x(message, "Resource deadlock would occur", false))) {
                                throw e;
                            }
                            fileLockTryLock = null;
                        }
                        try {
                            Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                            kw40Var.i = k050Var;
                            kw40Var.j = fileInputStream2;
                            kw40Var.k = fileLockTryLock;
                            kw40Var.l = zG;
                            kw40Var.o = 2;
                            objInvoke = function2.invoke(boolValueOf, kw40Var);
                            if (objInvoke != r5) {
                                fileLock = fileLockTryLock;
                                kw40Var = k050Var;
                                r1 = zG;
                                fileInputStream = fileInputStream2;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                bkb.E(fileInputStream, null);
                                if (r1 != 0) {
                                    kw40Var.c(null);
                                }
                                return objInvoke;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileLock = fileLockTryLock;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        kw40Var.i = k050Var;
                        kw40Var.l = zG;
                        kw40Var.o = 1;
                        objInvoke = function2.invoke(bool, kw40Var);
                        if (objInvoke != r5) {
                            r3 = k050Var;
                            r4 = zG;
                            if (r4 != 0) {
                                r3.c(null);
                            }
                            return objInvoke;
                        }
                    }
                    return r5;
                } catch (Throwable th3) {
                    th = th3;
                    r2 = k050Var;
                    r1 = zG;
                }
            } else if (i2 == 1) {
                r1 = kw40Var.l;
                r2 = kw40Var.i;
                try {
                    z1x.P(objInvoke);
                    r4 = r1;
                    r3 = r2;
                    if (r4 != 0) {
                        r3.c(null);
                    }
                    return objInvoke;
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z = kw40Var.l;
                fileLock = kw40Var.k;
                fileInputStream = kw40Var.j;
                k050 k050Var2 = kw40Var.i;
                try {
                    z1x.P(objInvoke);
                    r1 = z;
                    kw40Var = k050Var2;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    try {
                        bkb.E(fileInputStream, null);
                        if (r1 != 0) {
                            kw40Var.c(null);
                        }
                        return objInvoke;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                try {
                    bkb.E(r5, th7);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    r1 = this;
                }
            }
        }
        r2 = kw40Var;
        if (r1 != 0) {
            r2.c(null);
        }
        throw th;
    }

    @Override // a.mlx
    public final Object e(mcj mcjVar) {
        n0o0 n0o0Var = this.i;
        if (n0o0Var.a()) {
            joj0 joj0Var = (joj0) ((koj0) n0o0Var.getValue());
            return new Integer(joj0Var.b.nativeIncrementAndGetCounterValue(joj0Var.c));
        }
        return qjj.d0(this.f20746a, new iw40(this, null, (byte) 1), mcjVar);
    }
}
