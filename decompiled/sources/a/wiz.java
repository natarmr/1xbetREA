package a;

import android.content.Context;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: classes.dex */
public final class wiz extends LayoutInflater {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0o0 f39241a = maz.b(w7f.k);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wiz(Context context) {
        super(context);
        context.getClass();
    }

    @Override // android.view.LayoutInflater
    public final LayoutInflater cloneInContext(Context context) {
        context.getClass();
        return new wiz(context);
    }
}
