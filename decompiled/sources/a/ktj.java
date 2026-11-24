package a;

import java.util.concurrent.Executor;
import okhttp3.Request;

/* JADX INFO: loaded from: classes7.dex */
public final class ktj implements to9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f18868a;
    public final to9 b;

    public ktj(Executor executor, to9 to9Var) {
        this.f18868a = executor;
        this.b = to9Var;
    }

    @Override // a.to9
    public final void cancel() {
        this.b.cancel();
    }

    @Override // a.to9
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final to9 m4clone() {
        return new ktj(this.f18868a, this.b.m4clone());
    }

    @Override // a.to9
    public final Request l() {
        return this.b.l();
    }

    @Override // a.to9
    public final boolean q() {
        return this.b.q();
    }

    @Override // a.to9
    public final void y(pp9 pp9Var) {
        this.b.y(new zri(this, pp9Var));
    }
}
