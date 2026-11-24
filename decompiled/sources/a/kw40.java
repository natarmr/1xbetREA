package a;

import java.io.FileInputStream;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes.dex */
public final class kw40 extends zje {
    public k050 i;
    public FileInputStream j;
    public FileLock k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ lw40 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kw40(lw40 lw40Var, zje zjeVar) {
        super(zjeVar);
        this.n = lw40Var;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.d(null, this);
    }
}
