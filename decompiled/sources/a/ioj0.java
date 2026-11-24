package a;

import androidx.datastore.core.NativeSharedCounter;

/* JADX INFO: loaded from: classes.dex */
public final class ioj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ioj0 f15119a = new ioj0();
    public static final NativeSharedCounter b;

    static {
        System.loadLibrary("datastore_shared_counter");
        b = new NativeSharedCounter();
    }
}
