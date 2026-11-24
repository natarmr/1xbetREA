package a;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class uey implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35554a;
    public int b;
    public final ReentrantLock c = new ReentrantLock();
    public final RandomAccessFile d;

    public uey(RandomAccessFile randomAccessFile) {
        this.d = randomAccessFile;
    }

    public final hzp a(long j) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.f35554a) {
                throw new IllegalStateException("closed");
            }
            this.b++;
            reentrantLock.unlock();
            return new hzp(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.f35554a) {
                reentrantLock.unlock();
                return;
            }
            this.f35554a = true;
            if (this.b != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.d.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (this.f35554a) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.d.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
