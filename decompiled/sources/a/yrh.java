package a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class yrh extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43121a;
    public final int b;
    public int c;

    public yrh(Context context, byte b) {
        this.f43121a = b;
        context.getClass();
        switch (b) {
            case 1:
                this.b = context.getResources().getDimensionPixelSize(R.dimen.space_8);
                this.c = context.getResources().getDimensionPixelSize(R.dimen.space_4);
                break;
            default:
                this.b = context.getResources().getDimensionPixelSize(R.dimen.medium_horizontal_margin_dynamic);
                this.c = context.getResources().getDimensionPixelSize(R.dimen.space_8);
                break;
        }
    }

    @Override // a.fhe0
    public final void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        List listZ;
        byte b = this.f43121a;
        Object objW = null;
        objW = null;
        int i = this.b;
        switch (b) {
            case 0:
                rect.getClass();
                view.getClass();
                the0Var.getClass();
                xhe0 xhe0VarW = recyclerView.W(view);
                cp cpVar = xhe0VarW instanceof cp ? (cp) xhe0VarW : null;
                if (cpVar != null) {
                    yge0 adapter = recyclerView.getAdapter();
                    zz3 zz3Var = adapter instanceof zz3 ? (zz3) adapter : null;
                    if (cpVar.d() != 0) {
                        if (zz3Var != null && (listZ = zz3Var.z()) != null) {
                            objW = CollectionsKt.W(cpVar.d() - 1, listZ);
                        }
                        if (!(cpVar.u() instanceof n8s0) && !(cpVar.u() instanceof wmh0)) {
                            rect.left = i;
                            rect.right = i;
                        }
                        if (((cpVar.u() instanceof o5s0) && (objW instanceof o5s0)) || (((cpVar.u() instanceof owr0) && (objW instanceof owr0)) || (cpVar.u() instanceof wmh0))) {
                            rect.top = this.c;
                            break;
                        }
                    }
                }
                break;
            case 1:
                rect.getClass();
                view.getClass();
                the0Var.getClass();
                xhe0 xhe0VarW2 = recyclerView.W(view);
                cp cpVar2 = xhe0VarW2 instanceof cp ? (cp) xhe0VarW2 : null;
                if (cpVar2 != null && cpVar2.d() != 0) {
                    Object objU = cpVar2.u();
                    if (objU instanceof de7) {
                        i(cpVar2, ((de7) objU).f);
                    } else if (objU instanceof ah) {
                        i(cpVar2, ((ah) objU).d);
                    }
                }
                break;
            case 2:
                rect.getClass();
                view.getClass();
                the0Var.getClass();
                rect.left = i;
                rect.right = this.c;
                break;
            case 3:
                rect.getClass();
                view.getClass();
                the0Var.getClass();
                if (RecyclerView.U(view) != -1) {
                    androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
                    GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                    if (RecyclerView.U(view) >= the0Var.b() - (gridLayoutManager != null ? gridLayoutManager.h1 : 1)) {
                        rect.bottom = i + this.c;
                    }
                    break;
                }
                break;
            case 4:
                int i2 = this.c;
                rect.getClass();
                view.getClass();
                the0Var.getClass();
                xhe0 xhe0VarW3 = recyclerView.W(view);
                cp cpVar3 = xhe0VarW3 instanceof cp ? (cp) xhe0VarW3 : null;
                yge0 adapter2 = recyclerView.getAdapter();
                zz3 zz3Var2 = adapter2 instanceof zz3 ? (zz3) adapter2 : null;
                if (cpVar3 != null && zz3Var2 != null) {
                    if (!(cpVar3.u() instanceof ghj)) {
                        rect.left = i2;
                        rect.right = i2;
                        rect.top = 0;
                        rect.bottom = i2;
                    } else {
                        rect.left = i;
                        rect.right = i;
                        rect.top = i2;
                        rect.bottom = 0;
                    }
                    break;
                }
                break;
            case 5:
                rect.getClass();
                view.getClass();
                the0Var.getClass();
                int iU = RecyclerView.U(view);
                xhe0 xhe0VarW4 = recyclerView.W(view);
                if ((xhe0VarW4 instanceof cp ? ((cp) xhe0VarW4).u() : null) instanceof zvi0) {
                    if (iU != 0) {
                        i = this.c;
                    }
                    rect.top = i;
                }
                break;
            case 6:
                int i3 = this.c;
                rect.getClass();
                view.getClass();
                the0Var.getClass();
                int iU2 = RecyclerView.U(view);
                if (iU2 == -1) {
                    iU2 = RecyclerView.V(view);
                }
                if (iU2 != -1) {
                    int i4 = iU2 % i3;
                    boolean z = recyclerView.getLayoutDirection() == 0;
                    int i5 = (i4 * i) / i3;
                    if (z) {
                        rect.left = i5;
                    } else {
                        rect.right = i5;
                    }
                    int i6 = i - (((i4 + 1) * i) / i3);
                    if (z) {
                        rect.right = i6;
                    } else {
                        rect.left = i6;
                    }
                    if (iU2 >= i3) {
                        rect.top = i;
                    }
                    break;
                }
                break;
            default:
                rect.getClass();
                view.getClass();
                the0Var.getClass();
                if (RecyclerView.V(view) != 0) {
                    rect.top = this.c;
                } else {
                    rect.top = i;
                }
                break;
        }
    }

    public void i(cp cpVar, zq20 zq20Var) {
        View view = cpVar.f40887a;
        int i = this.c;
        int iOrdinal = zq20Var.ordinal();
        int i2 = this.b;
        if (iOrdinal == 0) {
            view.setPadding(i2, 0, i, i2);
            return;
        }
        if (iOrdinal == 1) {
            view.setPadding(i, 0, i, i2);
            return;
        }
        if (iOrdinal == 2) {
            view.setPadding(i, 0, i2, i2);
        } else if (iOrdinal == 3) {
            view.setPadding(i2, 0, i2, i2);
        } else {
            if (iOrdinal == 4) {
                return;
            }
            t9f.b();
        }
    }

    public yrh(int i) {
        this.f43121a = (byte) 3;
        this.b = i;
    }

    public /* synthetic */ yrh(int i, int i2, byte b) {
        this.f43121a = b;
        this.b = i;
        this.c = i2;
    }

    public yrh(Resources resources) {
        this.f43121a = (byte) 4;
        resources.getClass();
        this.b = resources.getDimensionPixelOffset(R.dimen.space_16);
        this.c = resources.getDimensionPixelOffset(R.dimen.space_8);
    }
}
