package a;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class r900 implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30053a;
    public boolean b;
    public final /* synthetic */ sx3 c;

    public r900(sx3 sx3Var) {
        this.c = sx3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        String line = this.f30053a;
        if (line == null && !this.b) {
            line = ((BufferedReader) this.c.b).readLine();
            this.f30053a = line;
            if (line == null) {
                this.b = true;
            }
        }
        return line != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            itt0.a();
            return null;
        }
        String str = this.f30053a;
        this.f30053a = null;
        str.getClass();
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
