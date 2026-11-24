package a;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class enm0 implements jbj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jbj f8102a;
    public long b;
    public Uri c;
    public Map d;

    public enm0(jbj jbjVar) {
        jbjVar.getClass();
        this.f8102a = jbjVar;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // a.jbj
    public final void c(rsj rsjVar) {
        rsjVar.getClass();
        this.f8102a.c(rsjVar);
    }

    @Override // a.jbj
    public final void close() {
        this.f8102a.close();
    }

    @Override // a.jbj
    public final long d(mbj mbjVar) {
        jbj jbjVar = this.f8102a;
        this.c = mbjVar.f21512a;
        this.d = Collections.EMPTY_MAP;
        try {
            return jbjVar.d(mbjVar);
        } finally {
            Uri uri = jbjVar.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = jbjVar.e();
        }
    }

    @Override // a.jbj
    public final Map e() {
        return this.f8102a.e();
    }

    @Override // a.jbj
    public final Uri getUri() {
        return this.f8102a.getUri();
    }

    @Override // a.bbj
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f8102a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += (long) i3;
        }
        return i3;
    }
}
