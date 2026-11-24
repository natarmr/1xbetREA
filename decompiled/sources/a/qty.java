package a;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qty implements qkn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f29322a;

    public /* synthetic */ qty(Context context) {
        this.f29322a = context;
    }

    @Override // a.qkn0
    public rkn0 l(m9c m9cVar) {
        String str = (String) m9cVar.d;
        y78 y78Var = (y78) m9cVar.e;
        y78Var.getClass();
        if (str != null && str.length() != 0) {
            return new b8r(this.f29322a, str, y78Var, true, true);
        }
        jf4.o("Must set a non-null database name to a configuration that uses the no backup directory.");
        return null;
    }
}
