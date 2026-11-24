package org.xplatform.african_roulette.presentation.views;

import a.hny;
import a.yum0;
import a.z70;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class AfricanRouletteGameField extends ConstraintLayout {
    public final ArrayList q;

    /* JADX WARN: Code duplicated, block: B:55:0x0208 A[PHI: r3
  0x0208: PHI (r3v2 int) = 
  (r3v1 int)
  (r3v4 int)
  (r3v5 int)
  (r3v6 int)
  (r3v7 int)
  (r3v8 int)
  (r3v9 int)
  (r3v10 int)
  (r3v11 int)
  (r3v12 int)
  (r3v13 int)
  (r3v14 int)
 binds: [B:7:0x002a, B:9:0x0035, B:11:0x0040, B:13:0x004b, B:15:0x0056, B:17:0x0061, B:19:0x006c, B:21:0x0077, B:23:0x0082, B:25:0x008d, B:27:0x0098, B:29:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Illegal instructions before constructor call */
    public AfricanRouletteGameField(Context context, AttributeSet attributeSet, int i) throws Throwable {
        Throwable th;
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.game_field_african_roulette, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.cell_0;
        AfricanRouletteCell africanRouletteCell = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_0);
        if (africanRouletteCell != null) {
            i2 = R.id.cell_1;
            AfricanRouletteCell africanRouletteCell2 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_1);
            if (africanRouletteCell2 != null) {
                i2 = R.id.cell_10;
                AfricanRouletteCell africanRouletteCell3 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_10);
                if (africanRouletteCell3 != null) {
                    i2 = R.id.cell_11;
                    AfricanRouletteCell africanRouletteCell4 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_11);
                    if (africanRouletteCell4 != null) {
                        i2 = R.id.cell_12;
                        AfricanRouletteCell africanRouletteCell5 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_12);
                        if (africanRouletteCell5 != null) {
                            i2 = R.id.cell_1_6;
                            AfricanRouletteCell africanRouletteCell6 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_1_6);
                            if (africanRouletteCell6 != null) {
                                i2 = R.id.cell_2;
                                AfricanRouletteCell africanRouletteCell7 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_2);
                                if (africanRouletteCell7 != null) {
                                    i2 = R.id.cell_3;
                                    AfricanRouletteCell africanRouletteCell8 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_3);
                                    if (africanRouletteCell8 != null) {
                                        i2 = R.id.cell_4;
                                        AfricanRouletteCell africanRouletteCell9 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_4);
                                        if (africanRouletteCell9 != null) {
                                            i2 = R.id.cell_5;
                                            AfricanRouletteCell africanRouletteCell10 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_5);
                                            if (africanRouletteCell10 != null) {
                                                i2 = R.id.cell_6;
                                                AfricanRouletteCell africanRouletteCell11 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_6);
                                                if (africanRouletteCell11 != null) {
                                                    i2 = R.id.cell_7;
                                                    AfricanRouletteCell africanRouletteCell12 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_7);
                                                    if (africanRouletteCell12 != null) {
                                                        i2 = R.id.cell_7_12;
                                                        th = null;
                                                        AfricanRouletteCell africanRouletteCell13 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_7_12);
                                                        if (africanRouletteCell13 != null) {
                                                            AfricanRouletteCell africanRouletteCell14 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_8);
                                                            if (africanRouletteCell14 != null) {
                                                                AfricanRouletteCell africanRouletteCell15 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_9);
                                                                if (africanRouletteCell15 != null) {
                                                                    AfricanRouletteCell africanRouletteCell16 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_black);
                                                                    if (africanRouletteCell16 != null) {
                                                                        AfricanRouletteCell africanRouletteCell17 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_hi);
                                                                        if (africanRouletteCell17 != null) {
                                                                            AfricanRouletteCell africanRouletteCell18 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_lo);
                                                                            if (africanRouletteCell18 != null) {
                                                                                AfricanRouletteCell africanRouletteCell19 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_mid);
                                                                                if (africanRouletteCell19 != null) {
                                                                                    AfricanRouletteCell africanRouletteCell20 = (AfricanRouletteCell) yum0.f(viewInflate, R.id.cell_red);
                                                                                    if (africanRouletteCell20 != null) {
                                                                                        ArrayList arrayList = new ArrayList();
                                                                                        this.q = arrayList;
                                                                                        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                                                                        africanRouletteCell.a(z70.b);
                                                                                        africanRouletteCell2.a(z70.c);
                                                                                        africanRouletteCell7.a(z70.d);
                                                                                        africanRouletteCell8.a(z70.e);
                                                                                        africanRouletteCell9.a(z70.f);
                                                                                        africanRouletteCell10.a(z70.g);
                                                                                        africanRouletteCell11.a(z70.h);
                                                                                        africanRouletteCell12.a(z70.i);
                                                                                        africanRouletteCell14.a(z70.j);
                                                                                        africanRouletteCell15.a(z70.k);
                                                                                        africanRouletteCell3.a(z70.l);
                                                                                        africanRouletteCell4.a(z70.m);
                                                                                        africanRouletteCell5.a(z70.n);
                                                                                        africanRouletteCell6.a(z70.o);
                                                                                        africanRouletteCell13.a(z70.p);
                                                                                        africanRouletteCell18.a(z70.q);
                                                                                        africanRouletteCell19.a(z70.r);
                                                                                        africanRouletteCell17.a(z70.s);
                                                                                        africanRouletteCell20.a(z70.t);
                                                                                        africanRouletteCell16.a(z70.u);
                                                                                        arrayList.add(africanRouletteCell);
                                                                                        arrayList.add(africanRouletteCell2);
                                                                                        arrayList.add(africanRouletteCell7);
                                                                                        arrayList.add(africanRouletteCell8);
                                                                                        arrayList.add(africanRouletteCell9);
                                                                                        arrayList.add(africanRouletteCell10);
                                                                                        arrayList.add(africanRouletteCell11);
                                                                                        arrayList.add(africanRouletteCell12);
                                                                                        arrayList.add(africanRouletteCell14);
                                                                                        arrayList.add(africanRouletteCell15);
                                                                                        arrayList.add(africanRouletteCell3);
                                                                                        arrayList.add(africanRouletteCell4);
                                                                                        arrayList.add(africanRouletteCell5);
                                                                                        arrayList.add(africanRouletteCell6);
                                                                                        arrayList.add(africanRouletteCell13);
                                                                                        arrayList.add(africanRouletteCell18);
                                                                                        arrayList.add(africanRouletteCell19);
                                                                                        arrayList.add(africanRouletteCell17);
                                                                                        arrayList.add(africanRouletteCell20);
                                                                                        arrayList.add(africanRouletteCell16);
                                                                                        return;
                                                                                    }
                                                                                    i2 = R.id.cell_red;
                                                                                } else {
                                                                                    i2 = R.id.cell_mid;
                                                                                }
                                                                            } else {
                                                                                i2 = R.id.cell_lo;
                                                                            }
                                                                        } else {
                                                                            i2 = R.id.cell_hi;
                                                                        }
                                                                    } else {
                                                                        i2 = R.id.cell_black;
                                                                    }
                                                                } else {
                                                                    i2 = R.id.cell_9;
                                                                }
                                                            } else {
                                                                i2 = R.id.cell_8;
                                                            }
                                                        }
                                                    } else {
                                                        th = null;
                                                    }
                                                } else {
                                                    th = null;
                                                }
                                            } else {
                                                th = null;
                                            }
                                        } else {
                                            th = null;
                                        }
                                    } else {
                                        th = null;
                                    }
                                } else {
                                    th = null;
                                }
                            } else {
                                th = null;
                            }
                        } else {
                            th = null;
                        }
                    } else {
                        th = null;
                    }
                } else {
                    th = null;
                }
            } else {
                th = null;
            }
        } else {
            th = null;
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw th;
    }

    public final void setCellClickListeners$african_roulette(Function1<? super z70, Unit> function1) {
        function1.getClass();
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((AfricanRouletteCell) it.next()).setCellClickListener$african_roulette(function1);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AfricanRouletteGameField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AfricanRouletteGameField(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
