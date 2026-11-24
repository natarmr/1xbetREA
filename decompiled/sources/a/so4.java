package a;

import android.content.DialogInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class so4 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32526a;
    public final Object b;

    public so4(t58 t58Var, byte b) {
        this.f32526a = b;
        switch (b) {
            case 3:
                this.b = new WeakReference(t58Var);
                break;
            default:
                this.b = new WeakReference(t58Var);
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.f32526a;
        yje yjeVar = null;
        byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                uo4 uo4Var = (uo4) ((WeakReference) obj).get();
                if (uo4Var != null) {
                    qjj.W(jiu0.a(uo4Var), null, null, new to4(uo4Var, yjeVar, (byte) 0), 3);
                }
                break;
            case 1:
                uo4 uo4Var2 = (uo4) ((WeakReference) obj).get();
                if (uo4Var2 != null) {
                    qjj.W(jiu0.a(uo4Var2), null, null, new to4(uo4Var2, yjeVar, b2), 3);
                }
                break;
            case 2:
                WeakReference weakReference = (WeakReference) obj;
                if (weakReference.get() != null) {
                    t58 t58Var = (t58) weakReference.get();
                    hy40 hy40Var = t58Var.x;
                    if (hy40Var == null) {
                        hy40Var = new hy40();
                        t58Var.x = hy40Var;
                    }
                    t58.z(hy40Var, Boolean.TRUE);
                }
                break;
            case 3:
                WeakReference weakReference2 = (WeakReference) obj;
                if (weakReference2.get() != null) {
                    ((t58) weakReference2.get()).x(true);
                }
                break;
            default:
                ((zdq) obj).a2.x(true);
                break;
        }
    }

    public so4(zdq zdqVar) {
        this.f32526a = (byte) 4;
        this.b = zdqVar;
    }

    public so4(uo4 uo4Var, byte b) {
        this.f32526a = b;
        switch (b) {
            case 1:
                this.b = new WeakReference(uo4Var);
                break;
            default:
                this.b = new WeakReference(uo4Var);
                break;
        }
    }
}
