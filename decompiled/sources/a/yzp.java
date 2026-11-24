package a;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yzp implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ggy f43526a;
    public static final y190 b;

    static {
        ggy ggyVar;
        try {
            Class.forName("java.nio.file.Files");
            ggyVar = new px50();
        } catch (ClassNotFoundException unused) {
            ggyVar = new ggy();
        }
        f43526a = ggyVar;
        String str = y190.b;
        String property = System.getProperty("java.io.tmpdir");
        property.getClass();
        b = rl70.b(property);
        ClassLoader classLoader = zsf0.class.getClassLoader();
        classLoader.getClass();
        new zsf0(classLoader);
    }

    public s5k0 a(y190 y190Var) {
        y190Var.getClass();
        return new lf80(new FileOutputStream(y190Var.toFile(), true), new fmq0());
    }

    public void c(y190 y190Var, y190 y190Var2) throws IOException {
        y190Var.getClass();
        y190Var2.getClass();
        if (y190Var.toFile().renameTo(y190Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + y190Var + " to " + y190Var2);
    }

    public final void d(y190 y190Var) throws IOException {
        xw3 xw3Var = new xw3();
        while (y190Var != null && !n(y190Var)) {
            xw3Var.addFirst(y190Var);
            y190Var = y190Var.c();
        }
        Iterator<E> it = xw3Var.iterator();
        while (it.hasNext()) {
            e((y190) it.next());
        }
    }

    public void e(y190 y190Var) throws IOException {
        y190Var.getClass();
        throw new IOException(this + " is read-only");
    }

    public void k(y190 y190Var) throws IOException {
        y190Var.getClass();
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = y190Var.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        itt0.j(y190Var, "failed to delete ");
    }

    public final void l(y190 y190Var) {
        y190Var.getClass();
        k(y190Var);
    }

    public final boolean n(y190 y190Var) {
        y190Var.getClass();
        return v(y190Var) != null;
    }

    public List q(y190 y190Var) throws IOException {
        y190Var.getClass();
        File file = y190Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (file.exists()) {
                itt0.j(y190Var, "failed to list ");
                return null;
            }
            udk.h(y190Var, "no such file: ");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            str.getClass();
            arrayList.add(y190Var.e(str));
        }
        v3d.s(arrayList);
        return arrayList;
    }

    public final h7k r(y190 y190Var) throws FileNotFoundException {
        y190Var.getClass();
        h7k h7kVarV = v(y190Var);
        if (h7kVarV != null) {
            return h7kVarV;
        }
        udk.h(y190Var, "no such file: ");
        return null;
    }

    public h7k v(y190 y190Var) {
        y190Var.getClass();
        File file = y190Var.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || file.exists()) {
            return new h7k(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
        }
        return null;
    }

    public uey w(y190 y190Var) {
        return new uey(new RandomAccessFile(y190Var.toFile(), "r"));
    }

    public s5k0 x(y190 y190Var, boolean z) throws IOException {
        y190Var.getClass();
        if (!z || !n(y190Var)) {
            return new lf80(new FileOutputStream(y190Var.toFile(), false), new fmq0());
        }
        throw new IOException(y190Var + " already exists.");
    }

    public emk0 y(y190 y190Var) {
        y190Var.getClass();
        return new hfx(new FileInputStream(y190Var.toFile()), fmq0.d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
