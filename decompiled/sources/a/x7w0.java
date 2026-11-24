package a;

import kotlin.jvm.functions.Function1;
import org.xplatform.fingerprint.impl.AudioTract;
import org.xplatform.fingerprint.impl.JniProfiler;
import org.xplatform.fingerprint.impl.MathTribunal;

/* JADX INFO: loaded from: classes3.dex */
public final class x7w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final us00 f40435a;
    public final ln4 b;
    public final JniProfiler c;
    public final MathTribunal d;
    public final AudioTract e;
    public y8w0 f;
    public y8w0 g;
    public final n0o0 h;

    public x7w0(us00 us00Var, kys0 kys0Var, ln4 ln4Var, JniProfiler jniProfiler, wxs0 wxs0Var, MathTribunal mathTribunal, AudioTract audioTract) {
        this.f40435a = us00Var;
        this.b = ln4Var;
        this.c = jniProfiler;
        this.d = mathTribunal;
        this.e = audioTract;
        rwj rwjVar = tvk.f34603a;
        qjj.W(d5c.a(ys10.f43147a), null, null, new wbl0(this, null, (byte) 21), 3);
        this.h = maz.b(new jmv0(this, (byte) 18));
    }

    public static h6w0 a(String str, Function1 function1) {
        n7w0 n7w0Var = new n7w0();
        function1.invoke(n7w0Var);
        return new h6w0(str, n7w0Var.f23061a);
    }
}
