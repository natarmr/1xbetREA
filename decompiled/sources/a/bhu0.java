package a;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bhu0 extends k33 {
    public final View B;
    public final yj50 f1;
    public ezg0 g1;
    public Function1 h1;
    public Function1 i1;
    public Function1 j1;

    public bhu0(Context context, Function1 function1, androidx.compose.runtime.a aVar, fzg0 fzg0Var, int i, cg80 cg80Var) {
        View view = (View) function1.invoke(context);
        yj50 yj50Var = new yj50();
        super(context, aVar, i, yj50Var, view, cg80Var);
        this.B = view;
        this.f1 = yj50Var;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objF = fzg0Var != null ? fzg0Var.f(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objF instanceof SparseArray ? (SparseArray) objF : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (fzg0Var != null) {
            setSavableRegistryEntry(fzg0Var.a(strValueOf, new g33(this, (byte) 2)));
        }
        sy2 sy2Var = dwi0.b;
        this.h1 = sy2Var;
        this.i1 = sy2Var;
        this.j1 = sy2Var;
    }

    public static final Unit o(bhu0 bhu0Var) {
        bhu0Var.j1.invoke(bhu0Var.B);
        bhu0Var.setSavableRegistryEntry(null);
        return Unit.f46060a;
    }

    private final void setSavableRegistryEntry(ezg0 ezg0Var) {
        ezg0 ezg0Var2 = this.g1;
        if (ezg0Var2 != null) {
            ((nvu) ezg0Var2).W();
        }
        this.g1 = ezg0Var;
    }

    public final yj50 getDispatcher() {
        return this.f1;
    }

    public final Function1<View, Unit> getReleaseBlock() {
        return this.j1;
    }

    public final Function1<View, Unit> getResetBlock() {
        return this.i1;
    }

    public /* bridge */ /* synthetic */ x1 getSubCompositionView() {
        return null;
    }

    public final Function1<View, Unit> getUpdateBlock() {
        return this.h1;
    }

    public final void setReleaseBlock(Function1<View, Unit> function1) {
        this.j1 = function1;
        setRelease(new g33(this, (byte) 3));
    }

    public final void setResetBlock(Function1<View, Unit> function1) {
        this.i1 = function1;
        setReset(new g33(this, (byte) 4));
    }

    public final void setUpdateBlock(Function1<View, Unit> function1) {
        this.h1 = function1;
        setUpdate(new g33(this, (byte) 5));
    }

    public View getViewRoot() {
        return this;
    }
}
