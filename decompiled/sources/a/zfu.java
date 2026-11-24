package a;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class zfu implements y7m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f44317a;

    public zfu(TaskCompletionSource taskCompletionSource) {
        this.f44317a = taskCompletionSource;
    }

    @Override // a.y7m0
    public final boolean a(q45 q45Var) {
        int i = q45Var.b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.f44317a.trySetResult(q45Var.f28082a);
        return true;
    }

    @Override // a.y7m0
    public final boolean b(Exception exc) {
        return false;
    }
}
