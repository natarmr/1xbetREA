package a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class twk extends fhe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34653a;
    public final Object b;
    public Object c;
    public Object d;

    public twk(Drawable drawable) {
        this.f34653a = (byte) 0;
        this.b = drawable;
        this.c = new Rect();
        this.d = new Rect();
    }

    @Override // a.fhe0
    public void f(Rect rect, View view, RecyclerView recyclerView, the0 the0Var) {
        switch (this.f34653a) {
            case 0:
                rect.getClass();
                view.getClass();
                the0Var.getClass();
                rect.set(0, 0, 0, ((Drawable) this.b).getIntrinsicHeight());
                break;
            default:
                super.f(rect, view, recyclerView, the0Var);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018f  */
    /* JADX WARN: Code duplicated, block: B:103:0x019a  */
    /* JADX WARN: Code duplicated, block: B:105:0x019f  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:111:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:132:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x010c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0110  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    /* JADX WARN: Code duplicated, block: B:66:0x011c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0127  */
    /* JADX WARN: Code duplicated, block: B:70:0x012a  */
    /* JADX WARN: Code duplicated, block: B:72:0x012d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0132  */
    /* JADX WARN: Code duplicated, block: B:77:0x0138  */
    /* JADX WARN: Code duplicated, block: B:79:0x0142  */
    /* JADX WARN: Code duplicated, block: B:88:0x015b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0163  */
    /* JADX WARN: Code duplicated, block: B:91:0x0166  */
    /* JADX WARN: Code duplicated, block: B:94:0x016c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0173  */
    /* JADX WARN: Code duplicated, block: B:98:0x0178  */
    @Override // a.fhe0
    public final void h(Canvas canvas, RecyclerView recyclerView, the0 the0Var) {
        int width;
        int i;
        int iU;
        yge0 adapter;
        int iF;
        Pair pair;
        yge0 adapter2;
        xhe0 xhe0VarB;
        View view;
        yge0 adapter3;
        fsv fsvVar;
        xhe0 xhe0VarP;
        fsv fsvVar2;
        xhe0 xhe0VarP2;
        vju0 vju0Var;
        Pair pair2;
        xhe0 xhe0Var;
        int bottom;
        int childCount;
        View childAt;
        ViewParent parent;
        ViewGroup viewGroup;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        FrameLayout.LayoutParams layoutParams;
        FrameLayout frameLayout3;
        ViewGroup viewGroup2;
        int i2 = 0;
        switch (this.f34653a) {
            case 0:
                canvas.getClass();
                the0Var.getClass();
                if (recyclerView.getLayoutManager() != null) {
                    canvas.save();
                    if (recyclerView.getClipToPadding()) {
                        int paddingLeft = recyclerView.getPaddingLeft();
                        width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                        canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                        i = paddingLeft;
                    } else {
                        width = recyclerView.getWidth();
                        i = 0;
                    }
                    xc6 xc6Var = new xc6(recyclerView, this, i, width, canvas);
                    Iterator it = l1e0.o(0, recyclerView.getChildCount() - 1).iterator();
                    while (((kkx) it).c) {
                        View childAt2 = recyclerView.getChildAt(((bkx) it).nextInt());
                        childAt2.getClass();
                        the0Var.getClass();
                        xc6Var.invoke(childAt2);
                    }
                    canvas.restore();
                    break;
                }
                break;
            default:
                zfb zfbVar = (zfb) this.b;
                canvas.getClass();
                the0Var.getClass();
                View childAt3 = recyclerView.getChildAt(0);
                if (childAt3 != null && (iU = RecyclerView.U(childAt3)) != -1) {
                    while (!(zfbVar.d.get(iU) instanceof h1m0)) {
                        iU--;
                        if (iU < 0) {
                            iU = -1;
                            if (iU == -1 && (adapter = recyclerView.getAdapter()) != null) {
                                iF = adapter.f(iU);
                                pair = (Pair) this.c;
                                if (pair == null && ((Number) pair.f46059a).intValue() == iU && (pair2 = (Pair) this.c) != null && (xhe0Var = (xhe0) pair2.b) != null && xhe0Var.f == iF) {
                                    xhe0 xhe0VarP3 = recyclerView.P(iU, false);
                                    fsv fsvVar3 = xhe0VarP3 instanceof fsv ? (fsv) xhe0VarP3 : null;
                                    xhe0 xhe0VarP4 = recyclerView.P(iU + 1, false);
                                    vju0 vju0Var2 = xhe0VarP4 instanceof vju0 ? (vju0) xhe0VarP4 : null;
                                    Pair pair3 = (Pair) this.c;
                                    xhe0 xhe0Var2 = pair3 != null ? (xhe0) pair3.b : null;
                                    if (vju0Var2 != null) {
                                        vju0Var2.z(fsvVar3, xhe0Var2 instanceof fsv ? (fsv) xhe0Var2 : null);
                                    }
                                    if (xhe0Var2 != null) {
                                        view = xhe0Var2.f40887a;
                                    } else {
                                        view = null;
                                    }
                                } else {
                                    adapter2 = recyclerView.getAdapter();
                                    if (adapter2 != null) {
                                        xhe0VarB = adapter2.b(recyclerView, iF);
                                    } else {
                                        xhe0VarB = null;
                                    }
                                    if (xhe0VarB != null) {
                                        adapter3 = recyclerView.getAdapter();
                                        if (adapter3 != null) {
                                            adapter3.n(xhe0VarB, iU);
                                        }
                                        View view2 = xhe0VarB.f40887a;
                                        view2.getClass();
                                        view2.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), recyclerView.getPaddingRight() + recyclerView.getPaddingLeft(), view2.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingBottom() + recyclerView.getPaddingTop(), view2.getLayoutParams().height));
                                        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
                                        this.c = new Pair(Integer.valueOf(iU), xhe0VarB);
                                        if (xhe0VarB instanceof fsv) {
                                            fsvVar = (fsv) xhe0VarB;
                                        } else {
                                            fsvVar = null;
                                        }
                                        xhe0VarP = recyclerView.P(iU, false);
                                        if (xhe0VarP instanceof fsv) {
                                            fsvVar2 = (fsv) xhe0VarP;
                                        } else {
                                            fsvVar2 = null;
                                        }
                                        xhe0VarP2 = recyclerView.P(iU + 1, false);
                                        if (xhe0VarP2 instanceof vju0) {
                                            vju0Var = (vju0) xhe0VarP2;
                                        } else {
                                            vju0Var = null;
                                        }
                                        if (vju0Var != null) {
                                            vju0Var.z(fsvVar2, fsvVar);
                                        }
                                    }
                                    if (xhe0VarB != null) {
                                        view = xhe0VarB.f40887a;
                                    } else {
                                        view = null;
                                    }
                                }
                            } else {
                                view = null;
                            }
                            if (view == null) {
                                bottom = view.getBottom();
                                childCount = recyclerView.getChildCount();
                                while (true) {
                                    if (i2 < childCount) {
                                        childAt = recyclerView.getChildAt(i2);
                                        if (childAt.getBottom() > bottom || childAt.getTop() > bottom) {
                                            i2++;
                                        }
                                    } else {
                                        childAt = null;
                                    }
                                }
                                if (childAt == null) {
                                    parent = recyclerView.getParent();
                                    if (parent instanceof ViewGroup) {
                                        viewGroup = (ViewGroup) parent;
                                    } else {
                                        viewGroup = null;
                                    }
                                    if (viewGroup != null) {
                                        frameLayout = (FrameLayout) viewGroup.findViewById(R.id.sticky_header_container);
                                    } else {
                                        frameLayout = null;
                                    }
                                    this.d = frameLayout;
                                    if (frameLayout == null) {
                                        this.d = new FrameLayout(recyclerView.getContext());
                                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                                        frameLayout3 = (FrameLayout) this.d;
                                        if (frameLayout3 != null) {
                                            frameLayout3.setId(R.id.sticky_header_container);
                                        }
                                        ViewParent parent2 = recyclerView.getParent();
                                        viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                                        if (viewGroup2 != null) {
                                            viewGroup2.addView((FrameLayout) this.d, layoutParams);
                                        }
                                    }
                                    if (zfbVar.d.get(RecyclerView.U(childAt)) instanceof h1m0) {
                                        i(view);
                                        break;
                                    } else {
                                        frameLayout2 = (FrameLayout) this.d;
                                        if (frameLayout2 == null) {
                                            i(view);
                                            frameLayout2.setTranslationY(childAt.getTop() - view.getHeight());
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (iU == -1) {
                        view = null;
                    } else {
                        iF = adapter.f(iU);
                        pair = (Pair) this.c;
                        if (pair == null) {
                            adapter2 = recyclerView.getAdapter();
                            if (adapter2 != null) {
                                xhe0VarB = adapter2.b(recyclerView, iF);
                            } else {
                                xhe0VarB = null;
                            }
                            if (xhe0VarB != null) {
                                adapter3 = recyclerView.getAdapter();
                                if (adapter3 != null) {
                                    adapter3.n(xhe0VarB, iU);
                                }
                                View view3 = xhe0VarB.f40887a;
                                view3.getClass();
                                view3.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), recyclerView.getPaddingRight() + recyclerView.getPaddingLeft(), view3.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingBottom() + recyclerView.getPaddingTop(), view3.getLayoutParams().height));
                                view3.layout(0, 0, view3.getMeasuredWidth(), view3.getMeasuredHeight());
                                this.c = new Pair(Integer.valueOf(iU), xhe0VarB);
                                if (xhe0VarB instanceof fsv) {
                                    fsvVar = (fsv) xhe0VarB;
                                } else {
                                    fsvVar = null;
                                }
                                xhe0VarP = recyclerView.P(iU, false);
                                if (xhe0VarP instanceof fsv) {
                                    fsvVar2 = (fsv) xhe0VarP;
                                } else {
                                    fsvVar2 = null;
                                }
                                xhe0VarP2 = recyclerView.P(iU + 1, false);
                                if (xhe0VarP2 instanceof vju0) {
                                    vju0Var = (vju0) xhe0VarP2;
                                } else {
                                    vju0Var = null;
                                }
                                if (vju0Var != null) {
                                    vju0Var.z(fsvVar2, fsvVar);
                                }
                            }
                            if (xhe0VarB != null) {
                                view = xhe0VarB.f40887a;
                            } else {
                                view = null;
                            }
                        } else {
                            adapter2 = recyclerView.getAdapter();
                            if (adapter2 != null) {
                                xhe0VarB = adapter2.b(recyclerView, iF);
                            } else {
                                xhe0VarB = null;
                            }
                            if (xhe0VarB != null) {
                                adapter3 = recyclerView.getAdapter();
                                if (adapter3 != null) {
                                    adapter3.n(xhe0VarB, iU);
                                }
                                View view4 = xhe0VarB.f40887a;
                                view4.getClass();
                                view4.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), recyclerView.getPaddingRight() + recyclerView.getPaddingLeft(), view4.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingBottom() + recyclerView.getPaddingTop(), view4.getLayoutParams().height));
                                view4.layout(0, 0, view4.getMeasuredWidth(), view4.getMeasuredHeight());
                                this.c = new Pair(Integer.valueOf(iU), xhe0VarB);
                                if (xhe0VarB instanceof fsv) {
                                    fsvVar = (fsv) xhe0VarB;
                                } else {
                                    fsvVar = null;
                                }
                                xhe0VarP = recyclerView.P(iU, false);
                                if (xhe0VarP instanceof fsv) {
                                    fsvVar2 = (fsv) xhe0VarP;
                                } else {
                                    fsvVar2 = null;
                                }
                                xhe0VarP2 = recyclerView.P(iU + 1, false);
                                if (xhe0VarP2 instanceof vju0) {
                                    vju0Var = (vju0) xhe0VarP2;
                                } else {
                                    vju0Var = null;
                                }
                                if (vju0Var != null) {
                                    vju0Var.z(fsvVar2, fsvVar);
                                }
                            }
                            if (xhe0VarB != null) {
                                view = xhe0VarB.f40887a;
                            } else {
                                view = null;
                            }
                        }
                    }
                    if (view == null) {
                        bottom = view.getBottom();
                        childCount = recyclerView.getChildCount();
                        while (true) {
                            if (i2 < childCount) {
                                childAt = recyclerView.getChildAt(i2);
                                if (childAt.getBottom() > bottom) {
                                }
                                i2++;
                            } else {
                                childAt = null;
                            }
                        }
                        if (childAt == null) {
                            parent = recyclerView.getParent();
                            if (parent instanceof ViewGroup) {
                                viewGroup = (ViewGroup) parent;
                            } else {
                                viewGroup = null;
                            }
                            if (viewGroup != null) {
                                frameLayout = (FrameLayout) viewGroup.findViewById(R.id.sticky_header_container);
                            } else {
                                frameLayout = null;
                            }
                            this.d = frameLayout;
                            if (frameLayout == null) {
                                this.d = new FrameLayout(recyclerView.getContext());
                                layoutParams = new FrameLayout.LayoutParams(-1, -2);
                                frameLayout3 = (FrameLayout) this.d;
                                if (frameLayout3 != null) {
                                    frameLayout3.setId(R.id.sticky_header_container);
                                }
                                ViewParent parent3 = recyclerView.getParent();
                                if (parent3 instanceof ViewGroup) {
                                }
                                if (viewGroup2 != null) {
                                    viewGroup2.addView((FrameLayout) this.d, layoutParams);
                                }
                            }
                            if (zfbVar.d.get(RecyclerView.U(childAt)) instanceof h1m0) {
                                i(view);
                                break;
                            } else {
                                frameLayout2 = (FrameLayout) this.d;
                                if (frameLayout2 == null) {
                                    i(view);
                                    frameLayout2.setTranslationY(childAt.getTop() - view.getHeight());
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    public void i(View view) {
        FrameLayout frameLayout = (FrameLayout) this.d;
        if (frameLayout == null) {
            return;
        }
        View childAt = frameLayout.getChildCount() > 0 ? frameLayout.getChildAt(0) : null;
        if (!Intrinsics.d(childAt, view)) {
            frameLayout.removeView(childAt);
            frameLayout.addView(view, -1, -2);
        }
        frameLayout.setTranslationY(0.0f);
    }

    public twk(zfb zfbVar) {
        this.f34653a = (byte) 1;
        zfbVar.getClass();
        this.b = zfbVar;
    }
}
