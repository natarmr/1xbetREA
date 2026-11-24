package a;

import android.content.Context;
import android.view.Window;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class tl40 extends x1 implements vjk {
    public final Window j;
    public final pz40 k;
    public boolean l;

    public tl40(Context context, Window window) {
        super(context, null);
        this.j = window;
        this.k = androidx.compose.runtime.e.e(khd.f18286a);
    }

    @Override // a.x1
    public final void a(int i, fet fetVar) {
        fetVar.g0(576708319);
        int i2 = (fetVar.i(this) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            ((Function2) ((hgk0) this.k).getValue()).invoke(fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pi40(this, i, (byte) 3);
        }
    }

    @Override // a.x1
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.l;
    }

    @Override // a.vjk
    public final Window getWindow() {
        return this.j;
    }
}
