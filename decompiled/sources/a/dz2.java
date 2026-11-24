package a;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$StateCallback;

/* JADX INFO: loaded from: classes.dex */
public final class dz2 extends CameraExtensionSession$StateCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nw2 f6920a;
    public final cto b;
    public final gx9 c;
    public final chf0 d;
    public final k03 e;
    public final c14 f;
    public final c14 g;

    public dz2(nw2 nw2Var, cto ctoVar, iki0 iki0Var, gx9 gx9Var, chf0 chf0Var, k03 k03Var) {
        gx9Var.getClass();
        this.f6920a = nw2Var;
        this.b = ctoVar;
        this.c = gx9Var;
        this.d = chf0Var;
        this.e = k03Var;
        this.f = o2e.Z(iki0Var);
        this.g = o2e.Z(null);
    }

    public final qw2 a(CameraExtensionSession cameraExtensionSession, gx9 gx9Var) {
        qw2 qw2Var = (qw2) this.g.f3556a;
        if (qw2Var != null) {
            return qw2Var;
        }
        qw2 qw2Var2 = new qw2(this.f6920a, cameraExtensionSession, gx9Var, this.e);
        if (this.g.a(null, qw2Var2)) {
            return qw2Var2;
        }
        Object obj = this.g.f3556a;
        obj.getClass();
        return (qw2) obj;
    }

    public final void onClosed(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        gx9 gx9Var = this.c;
        a(cameraExtensionSession, gx9Var);
        qw2 qw2VarA = a(cameraExtensionSession, gx9Var);
        cto ctoVar = this.b;
        ctoVar.f4948a.b(qw2VarA);
        iki0 iki0Var = (iki0) c14.b.getAndSet(this.f, null);
        if (iki0Var != null) {
            iki0Var.a();
        }
        ctoVar.a();
        chf0 chf0Var = this.d;
        if (chf0Var != null) {
            chf0Var.Y(this.f6920a.c);
        }
    }

    public final void onConfigureFailed(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        qw2 qw2VarA = a(cameraExtensionSession, this.c);
        cto ctoVar = this.b;
        ctoVar.f4948a.e(qw2VarA);
        iki0 iki0Var = (iki0) c14.b.getAndSet(this.f, null);
        if (iki0Var != null) {
            iki0Var.a();
        }
        ctoVar.a();
        chf0 chf0Var = this.d;
        if (chf0Var != null) {
            chf0Var.Z(this.f6920a.c);
        }
    }

    public final void onConfigured(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        this.b.f4948a.f(a(cameraExtensionSession, this.c));
        iki0 iki0Var = (iki0) c14.b.getAndSet(this.f, null);
        if (iki0Var != null) {
            iki0Var.a();
        }
        chf0 chf0Var = this.d;
        if (chf0Var != null) {
            chf0Var.a0(this.f6920a.c);
        }
    }
}
