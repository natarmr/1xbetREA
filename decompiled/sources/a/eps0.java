package a;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class eps0 {
    public static volatile hyi e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final quc f8202a;
    public final quc b;
    public final swj c;
    public final wdu d;

    public eps0(quc qucVar, quc qucVar2, swj swjVar, wdu wduVar, fht0 fht0Var) {
        this.f8202a = qucVar;
        this.b = qucVar2;
        this.c = swjVar;
        this.d = wduVar;
        ((Executor) fht0Var.f9559a).execute(new apj0(fht0Var, (byte) 23));
    }

    public static eps0 a() {
        hyi hyiVar = e;
        if (hyiVar != null) {
            return (eps0) hyiVar.f.get();
        }
        jf4.n("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (eps0.class) {
                try {
                    if (e == null) {
                        hz2 hz2Var = new hz2();
                        context.getClass();
                        hz2Var.f13886a = context;
                        e = hz2Var.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final nos0 c(ug9 ug9Var) {
        byte[] bytes;
        Set setUnmodifiableSet = ug9Var instanceof ug9 ? Collections.unmodifiableSet(ug9.d) : Collections.singleton(new gwn("proto"));
        cu cuVarA = q55.a();
        ug9Var.getClass();
        cuVarA.b = "cct";
        String str = ug9Var.f35614a;
        String str2 = ug9Var.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = ua80.i("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        cuVarA.c = bytes;
        return new nos0(setUnmodifiableSet, cuVarA.c(), this);
    }
}
