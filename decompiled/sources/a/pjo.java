package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class pjo extends kotlin.coroutines.a implements nne {
    public static final pjo b = new pjo(lwf.h);
    public static final Object c = new Object();

    static {
        new ArrayList();
        new LinkedHashMap();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pjo) || (obj instanceof qjo);
    }

    @Override // a.nne
    public final void l(Throwable th, CoroutineContext coroutineContext) {
        synchronized (c) {
        }
    }
}
