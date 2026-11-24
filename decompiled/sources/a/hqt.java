package a;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class hqt implements y7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fut0 f13499a;
    public final TaskCompletionSource b;

    public hqt(fut0 fut0Var, TaskCompletionSource taskCompletionSource) {
        this.f13499a = fut0Var;
        this.b = taskCompletionSource;
    }

    @Override // a.y7m0
    public final boolean a(q45 q45Var) {
        if (q45Var.b == 4 && !this.f13499a.a(q45Var)) {
            String str = q45Var.c;
            if (str != null) {
                this.b.setResult(new d45(q45Var.e, q45Var.f, str));
                return true;
            }
            hny.u("Null token");
        }
        return false;
    }

    @Override // a.y7m0
    public final boolean b(Exception exc) {
        this.b.trySetException(exc);
        return true;
    }
}
