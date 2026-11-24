package a;

import android.util.AtomicFile;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes5.dex */
public final class asd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f1386a;
    public final vby b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ReentrantLock e = new ReentrantLock();

    public asd(vby vbyVar, us00 us00Var) {
        this.f1386a = us00Var;
        this.b = vbyVar;
    }

    public static String a(String str, rhi0 rhi0Var) {
        return w6x.q(str, "-", rhi0Var.name());
    }

    public final AtomicFile b(String str, rhi0 rhi0Var) {
        String strA = a(str, rhi0Var);
        ConcurrentHashMap concurrentHashMap = this.d;
        Object atomicFile = concurrentHashMap.get(strA);
        if (atomicFile == null) {
            atomicFile = new AtomicFile(new File(this.f1386a.getFilesDir(), str + "-saved_config_" + rhi0Var + "_v3.json"));
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(strA, atomicFile);
            if (objPutIfAbsent != null) {
                atomicFile = objPutIfAbsent;
            }
        }
        return (AtomicFile) atomicFile;
    }

    public final boolean c(String str, rhi0 rhi0Var) {
        rhi0Var.getClass();
        return this.c.containsKey(a(str, rhi0Var)) || b(str, rhi0Var).getBaseFile().exists();
    }

    public final mwn d(String str, rhi0 rhi0Var) throws roe {
        Object g0g0Var;
        Object g0g0Var2;
        vby vbyVar = this.b;
        AtomicFile atomicFileB = b(str, rhi0Var);
        try {
            e0g0 e0g0Var = j0g0.b;
            Charset charset = Charsets.UTF_8;
            charset.getClass();
            byte[] fully = atomicFileB.readFully();
            fully.getClass();
            g0g0Var = (mwn) vbyVar.b(mwn.Companion.serializer(), new String(fully, charset));
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            try {
                File baseFile = atomicFileB.getBaseFile();
                baseFile.getClass();
                g0g0Var2 = (mwn) vbyVar.b(mwn.Companion.serializer(), i0q.b(baseFile));
            } catch (Throwable th2) {
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var2 = new g0g0(th2);
            }
            if (j0g0.a(g0g0Var2) != null) {
                throw new roe("Content: " + atomicFileB.getBaseFile());
            }
            g0g0Var = (mwn) g0g0Var2;
        }
        return (mwn) g0g0Var;
    }

    public final void e(mwn mwnVar, String str, rhi0 rhi0Var) {
        str.getClass();
        rhi0Var.getClass();
        this.c.put(a(str, rhi0Var), mwnVar);
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            AtomicFile atomicFileB = b(str, rhi0Var);
            try {
                e0g0 e0g0Var = j0g0.b;
                String strD = this.b.d(mwn.Companion.serializer(), mwnVar);
                Charset charset = Charsets.UTF_8;
                charset.getClass();
                byte[] bytes = strD.getBytes(charset);
                bytes.getClass();
                FileOutputStream fileOutputStreamStartWrite = atomicFileB.startWrite();
                try {
                    fileOutputStreamStartWrite.getClass();
                    fileOutputStreamStartWrite.write(bytes);
                    atomicFileB.finishWrite(fileOutputStreamStartWrite);
                } catch (Throwable th) {
                    atomicFileB.failWrite(fileOutputStreamStartWrite);
                    throw th;
                }
            } catch (Throwable unused) {
                e0g0 e0g0Var2 = j0g0.b;
            }
            String str2 = str + "-saved_config_" + rhi0Var + "_v3.json";
            try {
                File filesDir = this.f1386a.getFilesDir();
                if (filesDir != null) {
                    File[] fileArrListFiles = filesDir.listFiles(new yrd(str2, (byte) 0));
                    if (fileArrListFiles != null) {
                        for (File file : fileArrListFiles) {
                            if (file.exists()) {
                                file.delete();
                            }
                        }
                    }
                }
            } catch (Throwable unused2) {
                e0g0 e0g0Var3 = j0g0.b;
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
