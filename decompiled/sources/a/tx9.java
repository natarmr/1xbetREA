package a;

import android.hardware.camera2.CameraCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tx9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34685a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tx9(j8f j8fVar, long j, String str) {
        this.f34685a = (byte) 2;
        this.c = j8fVar;
        this.b = j;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f34685a;
        long j = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((o3a) obj2).f24573a.onCaptureSequenceCompleted((CameraCaptureSession) obj, -1, j);
                break;
            case 1:
                ((bmf0) obj2).a((gnf0) obj, j);
                break;
            case 2:
                String str = (String) obj;
                f8f f8fVar = ((j8f) obj2).g;
                y9f y9fVar = f8fVar.n;
                if (y9fVar == null || !y9fVar.e.get()) {
                    ((lzp) f8fVar.i.b).b(j, str);
                }
                break;
            default:
                qlo qloVar = (qlo) ((fck0) obj2).c;
                String str2 = vtt0.f38024a;
                ulo uloVar = qloVar.f28944a;
                fsj fsjVar = uloVar.s;
                ft2 ft2VarM = fsjVar.M();
                fsjVar.N(ft2VarM, 26, new nfd(ft2VarM, obj, j));
                if (uloVar.S == obj) {
                    uloVar.m.e(26, new udk((byte) 15));
                }
                break;
        }
    }

    public /* synthetic */ tx9(Object obj, Object obj2, long j, byte b) {
        this.f34685a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
