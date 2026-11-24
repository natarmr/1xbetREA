package okhttp3.internal.connection;

import a.emk0;
import a.njk0;
import a.s5k0;
import a.t99;
import a.u99;
import a.x9x;
import a.yae0;
import a.zae0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/internal/connection/BufferedSocketKt$asBufferedSocket$1", "Lokhttp3/internal/connection/BufferedSocket;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BufferedSocketKt$asBufferedSocket$1 implements BufferedSocket {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final njk0 f46135a;
    public final zae0 b;
    public final yae0 c;

    public BufferedSocketKt$asBufferedSocket$1(njk0 njk0Var) {
        this.f46135a = njk0Var;
        this.b = x9x.D(njk0Var.b());
        this.c = x9x.C(njk0Var.a());
    }

    @Override // okhttp3.internal.connection.BufferedSocket, a.njk0
    public final t99 a() {
        return this.c;
    }

    @Override // okhttp3.internal.connection.BufferedSocket, a.njk0
    public final u99 b() {
        return this.b;
    }

    @Override // a.njk0
    public final void cancel() {
        this.f46135a.cancel();
    }

    @Override // a.njk0
    public final s5k0 a() {
        return this.c;
    }

    @Override // a.njk0
    public final emk0 b() {
        return this.b;
    }
}
