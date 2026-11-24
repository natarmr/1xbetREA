package a;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class nlc {
    public static final Set c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f6i f23719a;
    public final xg b;

    static {
        swq swqVarI = i4m0.c.i();
        c = cui0.b(new qlc(swqVarI.b(), swqVarI.f32934a.g()));
    }

    public nlc(f6i f6iVar) {
        this.f23719a = f6iVar;
        this.b = ((eu00) f6iVar.e).d(new w0((Object) this, (byte) 14));
    }

    public final wm40 a(qlc qlcVar, glc glcVar) {
        qlcVar.getClass();
        return (wm40) this.b.invoke(new mlc(qlcVar, glcVar));
    }
}
