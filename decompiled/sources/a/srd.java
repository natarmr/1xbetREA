package a;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class srd {
    public static final Pattern e;
    public static final Pattern f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f32670a = new HashSet();
    public final Executor b;
    public final krd c;
    public final krd d;

    static {
        Charset.forName("UTF-8");
        e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public srd(Executor executor, krd krdVar, krd krdVar2) {
        this.b = executor;
        this.c = krdVar;
        this.d = krdVar2;
    }

    public static HashSet a(krd krdVar) {
        HashSet hashSet = new HashSet();
        mrd mrdVarC = krdVar.c();
        if (mrdVarC != null) {
            Iterator<String> itKeys = mrdVarC.b.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }
}
