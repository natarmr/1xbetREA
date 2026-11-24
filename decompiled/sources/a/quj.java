package a;

import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class quj implements ktv, ltv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b8z f29348a;
    public final Context b;
    public final p5d0 c;
    public final Set d;
    public final Executor e;

    public quj(Context context, String str, Set set, p5d0 p5d0Var, Executor executor) {
        this.f29348a = new b8z(new pgd(context, str, (byte) 1));
        this.d = set;
        this.e = executor;
        this.c = p5d0Var;
        this.b = context;
    }

    public final void a() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!tnq0.n(this.b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.e, new puj(this, (byte) 1));
        }
    }
}
