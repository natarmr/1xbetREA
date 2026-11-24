package a;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xge0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40835a;
    public final /* synthetic */ RecyclerView b;

    public /* synthetic */ xge0(RecyclerView recyclerView, byte b) {
        this.f40835a = b;
        this.b = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0118  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        byte b = this.f40835a;
        RecyclerView recyclerView = this.b;
        switch (b) {
            case 0:
                if (recyclerView.u && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.s) {
                        recyclerView.requestLayout();
                    } else if (recyclerView.x) {
                        recyclerView.w = true;
                    } else {
                        recyclerView.u();
                    }
                    break;
                }
                break;
            default:
                ehe0 ehe0Var = recyclerView.p1;
                if (ehe0Var != null) {
                    kvj kvjVar = (kvj) ehe0Var;
                    long j = kvjVar.d;
                    ArrayList<xhe0> arrayList = kvjVar.h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = kvjVar.j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = kvjVar.k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = kvjVar.i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z = false;
                    } else {
                        for (xhe0 xhe0Var : arrayList) {
                            View view = xhe0Var.f40887a;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            kvjVar.q.add(xhe0Var);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new fvj(kvjVar, xhe0Var, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z2 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            kvjVar.m.add(arrayList5);
                            arrayList2.clear();
                            evj evjVar = new evj(kvjVar, arrayList5, (byte) 0);
                            if (z2) {
                                evjVar.run();
                            } else {
                                View view2 = ((jvj) arrayList5.get(0)).f17206a.f40887a;
                                WeakHashMap weakHashMap = rgu0.f30456a;
                                view2.postOnAnimationDelayed(evjVar, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            kvjVar.n.add(arrayList6);
                            arrayList3.clear();
                            lfr lfrVar = new lfr(kvjVar, arrayList6, false, (byte) 7);
                            if (z2) {
                                lfrVar.run();
                            } else {
                                View view3 = ((ivj) arrayList6.get(0)).f15448a.f40887a;
                                WeakHashMap weakHashMap2 = rgu0.f30456a;
                                view3.postOnAnimationDelayed(lfrVar, j);
                            }
                        }
                        if (zIsEmpty4) {
                            z = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            kvjVar.l.add(arrayList7);
                            arrayList4.clear();
                            evj evjVar2 = new evj(kvjVar, arrayList7, (byte) 1);
                            if (z2 && zIsEmpty2 && zIsEmpty3) {
                                evjVar2.run();
                                z = false;
                            } else {
                                if (z2) {
                                    j = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? kvjVar.e : 0L, zIsEmpty3 ? 0L : kvjVar.f) + j;
                                z = false;
                                View view4 = ((xhe0) arrayList7.get(0)).f40887a;
                                WeakHashMap weakHashMap3 = rgu0.f30456a;
                                view4.postOnAnimationDelayed(evjVar2, jMax);
                            }
                        }
                    }
                } else {
                    z = false;
                }
                recyclerView.N1 = z;
                break;
        }
    }
}
