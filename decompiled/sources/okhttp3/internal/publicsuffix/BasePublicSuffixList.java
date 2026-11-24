package okhttp3.internal.publicsuffix;

import a.bkb;
import a.emk0;
import a.qg9;
import a.x9x;
import a.zae0;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", "Lokhttp3/internal/publicsuffix/PublicSuffixList;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BasePublicSuffixList implements PublicSuffixList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f46217a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public qg9 c;
    public qg9 d;
    public IOException e;

    public final qg9 a() {
        qg9 qg9Var = this.c;
        if (qg9Var != null) {
            return qg9Var;
        }
        Intrinsics.h("bytes");
        throw null;
    }

    public abstract emk0 b();

    public final void c() {
        try {
            zae0 zae0VarD = x9x.D(b());
            try {
                qg9 qg9VarQ0 = zae0VarD.q0(zae0VarD.readInt());
                qg9 qg9VarQ1 = zae0VarD.q0(zae0VarD.readInt());
                zae0VarD.close();
                synchronized (this) {
                    qg9VarQ0.getClass();
                    this.c = qg9VarQ0;
                    qg9VarQ1.getClass();
                    this.d = qg9VarQ1;
                }
                this.b.countDown();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    bkb.E(zae0VarD, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            this.b.countDown();
            throw th3;
        }
    }
}
