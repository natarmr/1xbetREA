package a;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class c8r implements ukn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3928a = 1;
    public final Closeable b;

    public c8r(SQLiteProgram sQLiteProgram) {
        sQLiteProgram.getClass();
        this.b = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f3928a) {
            case 0:
                ((SQLiteProgram) this.b).close();
                break;
        }
    }

    @Override // a.ukn0
    public final void i(byte[] bArr, int i) {
        byte b = this.f3928a;
        Closeable closeable = this.b;
        switch (b) {
            case 0:
                bArr.getClass();
                ((SQLiteProgram) closeable).bindBlob(i, bArr);
                break;
            default:
                bArr.getClass();
                ((feg0) closeable).i(bArr, i);
                break;
        }
    }

    @Override // a.ukn0
    public final void o(int i, long j) {
        byte b = this.f3928a;
        Closeable closeable = this.b;
        switch (b) {
            case 0:
                ((SQLiteProgram) closeable).bindLong(i, j);
                break;
            default:
                ((feg0) closeable).o(i, j);
                break;
        }
    }

    @Override // a.ukn0
    public final void p(double d, int i) {
        byte b = this.f3928a;
        Closeable closeable = this.b;
        switch (b) {
            case 0:
                ((SQLiteProgram) closeable).bindDouble(i, d);
                break;
            default:
                ((feg0) closeable).p(d, i);
                break;
        }
    }

    @Override // a.ukn0
    public final void r0(int i, String str) {
        byte b = this.f3928a;
        Closeable closeable = this.b;
        switch (b) {
            case 0:
                str.getClass();
                ((SQLiteProgram) closeable).bindString(i, str);
                break;
            default:
                str.getClass();
                ((feg0) closeable).r0(i, str);
                break;
        }
    }

    @Override // a.ukn0
    public final void s(int i) {
        byte b = this.f3928a;
        Closeable closeable = this.b;
        switch (b) {
            case 0:
                ((SQLiteProgram) closeable).bindNull(i);
                break;
            default:
                ((feg0) closeable).s(i);
                break;
        }
    }

    @Override // a.ukn0
    public void t() {
        ((SQLiteProgram) this.b).clearBindings();
    }

    public c8r(feg0 feg0Var) {
        this.b = feg0Var;
    }

    private final void a() {
    }
}
