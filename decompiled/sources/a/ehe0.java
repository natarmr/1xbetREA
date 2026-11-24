package a;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ehe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o470 f7804a;
    public ArrayList b;
    public byte c;
    public byte d;
    public short e;
    public short f;

    public static void b(xhe0 xhe0Var) {
        int i = xhe0Var.j;
        if (!xhe0Var.i() && (i & 4) == 0) {
            xhe0Var.c();
        }
    }

    public abstract boolean a(xhe0 xhe0Var, xhe0 xhe0Var2, eld0 eld0Var, eld0 eld0Var2);

    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x007a, please report this as an issue */
    public final void c(xhe0 xhe0Var) {
        o470 o470Var = this.f7804a;
        if (o470Var != null) {
            RecyclerView recyclerView = (RecyclerView) o470Var.f24619a;
            boolean z = true;
            xhe0Var.q(true);
            View view = xhe0Var.f40887a;
            if (xhe0Var.h != null && xhe0Var.i == null) {
                xhe0Var.h = null;
            }
            xhe0Var.i = null;
            if ((xhe0Var.j & 16) != 0) {
                return;
            }
            msj msjVar = recyclerView.c;
            recyclerView.C0();
            iac iacVar = recyclerView.f;
            hac hacVar = iacVar.b;
            jw20 jw20Var = iacVar.f14431a;
            byte b = iacVar.d;
            if (b != 1) {
                if (b == 2) {
                    jf4.n("Cannot call removeViewIfHidden within removeViewIfHidden");
                    return;
                }
                try {
                    iacVar.d = (byte) 2;
                    int iIndexOfChild = ((RecyclerView) jw20Var.b).indexOfChild(view);
                    if (iIndexOfChild == -1) {
                        iacVar.l(view);
                    } else if (hacVar.t(iIndexOfChild)) {
                        hacVar.x(iIndexOfChild);
                        iacVar.l(view);
                        jw20Var.o(iIndexOfChild);
                    } else {
                        iacVar.d = (byte) 0;
                    }
                    iacVar.d = (byte) 0;
                    if (z) {
                        xhe0 xhe0VarX = RecyclerView.X(view);
                        msjVar.p(xhe0VarX);
                        msjVar.l(xhe0VarX);
                        if (RecyclerView.e2) {
                            Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                        }
                    }
                    recyclerView.E0(!z);
                    if (z && xhe0Var.m()) {
                        recyclerView.removeDetachedView(view, false);
                        return;
                    }
                } catch (Throwable th) {
                    iacVar.d = (byte) 0;
                    throw th;
                }
            }
            if (iacVar.e != view) {
                jf4.n("Cannot call removeViewIfHidden within removeView(At) for a different view");
                return;
            }
            z = false;
            if (z) {
                xhe0 xhe0VarX2 = RecyclerView.X(view);
                msjVar.p(xhe0VarX2);
                msjVar.l(xhe0VarX2);
                if (RecyclerView.e2) {
                    Log.d("RecyclerView", "after removing animated view: " + view + ", " + recyclerView);
                }
            }
            recyclerView.E0(!z);
            if (z) {
            }
        }
    }

    public abstract void d(xhe0 xhe0Var);

    public abstract void e();

    public abstract boolean f();
}
