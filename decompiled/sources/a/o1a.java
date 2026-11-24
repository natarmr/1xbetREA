package a;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public abstract class o1a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z04 f24470a = o2e.Y(0);

    public static final m1a a(i1a i1aVar) {
        try {
            Trace.beginSection("CameraPipe");
            return new m1a(new hbi(new ok50(i1aVar), new y78(i1aVar.b)));
        } finally {
            Trace.endSection();
        }
    }
}
