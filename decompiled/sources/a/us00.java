package a;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class us00 extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4x f36186a;
    public final n0o0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us00(Context context, l4x l4xVar) {
        super(context);
        context.getClass();
        l4xVar.getClass();
        this.f36186a = l4xVar;
        this.b = maz.b(new rcz(this, (byte) 29));
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return (Resources) this.b.getValue();
    }
}
