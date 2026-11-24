package okhttp3.internal.cache;

import a.f99;
import a.nwq;
import a.s5k0;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "La/nwq;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FaultHidingSink extends nwq {
    public final Function1 b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaultHidingSink(s5k0 s5k0Var, Function1 function1) {
        super(s5k0Var);
        s5k0Var.getClass();
        this.b = function1;
    }

    @Override // a.nwq, a.s5k0
    public final void F0(f99 f99Var, long j) throws EOFException {
        if (this.c) {
            f99Var.skip(j);
            return;
        }
        try {
            this.f24246a.F0(f99Var, j);
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // a.nwq, a.s5k0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // a.nwq, a.s5k0, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }
}
