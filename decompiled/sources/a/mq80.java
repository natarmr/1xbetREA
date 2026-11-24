package a;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class mq80 implements kq00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22211a;
    public final mbj b;
    public final byte c;
    public final enm0 d;
    public final lq80 e;
    public volatile Object f;

    public mq80(z220 z220Var) {
        this.d = new enm0((jbj) z220Var.b);
        this.b = (mbj) z220Var.c;
        this.c = (byte) 4;
        this.e = (lq80) z220Var.d;
        this.f22211a = wn00.c.getAndIncrement();
    }

    @Override // a.kq00
    public final void a() {
        this.d.b = 0L;
        lbj lbjVar = new lbj(this.d, this.b);
        try {
            lbjVar.f19757a.d(lbjVar.b);
            lbjVar.d = true;
            Uri uri = this.d.f8102a.getUri();
            uri.getClass();
            this.f = this.e.a(uri, lbjVar);
        } finally {
            String str = vtt0.f38024a;
            try {
                lbjVar.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // a.kq00
    public final void b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mq80(jbj jbjVar, mbj mbjVar, int i, lq80 lq80Var) {
        this.d = new enm0(jbjVar);
        this.b = mbjVar;
        this.c = i;
        this.e = lq80Var;
        this.f22211a = wn00.c.getAndIncrement();
    }
}
