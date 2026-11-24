package com.google.android.flexbox;

import a.ekq;
import a.gkq;
import a.jf4;
import a.twn;
import a.tyj;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ekq f45463a;
    public boolean[] b;
    public int[] c;
    public long[] d;
    public long[] e;

    public b(ekq ekqVar) {
        this.f45463a = ekqVar;
    }

    public static ArrayList e(int i, int i2, List list) {
        int i3 = (i - i2) / 2;
        ArrayList arrayList = new ArrayList();
        a aVar = new a();
        aVar.g = i3;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 == 0) {
                arrayList.add(aVar);
            }
            arrayList.add((a) list.get(i4));
            if (i4 == list.size() - 1) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public static int[] r(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            gkq gkqVar = (gkq) it.next();
            int i3 = gkqVar.f11456a;
            iArr[i2] = i3;
            sparseIntArray.append(i3, gkqVar.b);
            i2++;
        }
        return iArr;
    }

    public final void a(List list, a aVar, int i, int i2) {
        aVar.m = i2;
        this.f45463a.h(aVar);
        aVar.p = i;
        list.add(aVar);
    }

    /* JADX WARN: Code duplicated, block: B:83:0x01cb  */
    public final void b(tyj tyjVar, int i, int i2, int i3, int i4, int i5, List list) {
        int iE;
        FlexItem flexItem;
        int i6;
        boolean z;
        int i7 = i;
        ekq ekqVar = this.f45463a;
        boolean zK = ekqVar.k();
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        List arrayList = list == null ? new ArrayList() : list;
        tyjVar.f34759a = arrayList;
        boolean z2 = i5 == -1;
        int paddingStart = zK ? ekqVar.getPaddingStart() : ekqVar.getPaddingTop();
        int paddingEnd = zK ? ekqVar.getPaddingEnd() : ekqVar.getPaddingBottom();
        int paddingTop = zK ? ekqVar.getPaddingTop() : ekqVar.getPaddingStart();
        int paddingBottom = zK ? ekqVar.getPaddingBottom() : ekqVar.getPaddingEnd();
        a aVar = new a();
        int i8 = i4;
        int i9 = 1;
        aVar.o = i8;
        int i10 = paddingStart + paddingEnd;
        aVar.e = i10;
        int flexItemCount = ekqVar.getFlexItemCount();
        boolean z3 = z2;
        int i11 = Integer.MIN_VALUE;
        int iCombineMeasuredStates = 0;
        int i12 = 0;
        int i13 = 0;
        while (i8 < flexItemCount) {
            int i14 = flexItemCount;
            View viewI = ekqVar.i(i8);
            if (viewI != null) {
                if (viewI.getVisibility() == 8) {
                    aVar.i++;
                    aVar.h++;
                    if (i8 == i14 - 1 && aVar.a() != 0) {
                        a(arrayList, aVar, i8, i12);
                    }
                } else {
                    if (viewI instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) viewI;
                        FlexItem flexItem2 = (FlexItem) compoundButton.getLayoutParams();
                        int iL = flexItem2.L();
                        int iS0 = flexItem2.S0();
                        Drawable buttonDrawable = compoundButton.getButtonDrawable();
                        int minimumWidth = buttonDrawable == null ? 0 : buttonDrawable.getMinimumWidth();
                        int minimumHeight = buttonDrawable == null ? 0 : buttonDrawable.getMinimumHeight();
                        if (iL == -1) {
                            iL = minimumWidth;
                        }
                        flexItem2.C0(iL);
                        if (iS0 == -1) {
                            iS0 = minimumHeight;
                        }
                        flexItem2.U(iS0);
                    }
                    FlexItem flexItem3 = (FlexItem) viewI.getLayoutParams();
                    if (flexItem3.H() == 4) {
                        aVar.n.add(Integer.valueOf(i8));
                    }
                    int iJ = zK ? flexItem3.j() : flexItem3.f();
                    if (flexItem3.Z() != -1.0f && mode == 1073741824) {
                        iJ = Math.round(size * flexItem3.Z());
                    }
                    if (zK) {
                        iE = ekqVar.c(i7, i10 + flexItem3.E0() + flexItem3.R0(), iJ);
                        int iE2 = ekqVar.e(i2, paddingTop + paddingBottom + flexItem3.S() + flexItem3.D0() + i12, flexItem3.f());
                        viewI.measure(iE, iE2);
                        v(i8, iE, iE2, viewI);
                    } else {
                        int iC = ekqVar.c(i2, paddingTop + paddingBottom + flexItem3.E0() + flexItem3.R0() + i12, flexItem3.j());
                        iE = ekqVar.e(i7, i10 + flexItem3.S() + flexItem3.D0(), iJ);
                        viewI.measure(iC, iE);
                        v(i8, iC, iE, viewI);
                    }
                    ekqVar.f(viewI, i8);
                    c(viewI, i8);
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewI.getMeasuredState());
                    int i15 = aVar.e;
                    int measuredWidth = (zK ? viewI.getMeasuredWidth() : viewI.getMeasuredHeight()) + (zK ? flexItem3.E0() : flexItem3.S()) + (zK ? flexItem3.R0() : flexItem3.D0());
                    int size2 = arrayList.size();
                    if (ekqVar.getFlexWrap() != 0) {
                        if (flexItem3.e0()) {
                            flexItem = flexItem3;
                        } else {
                            if (mode == 0) {
                                flexItem = flexItem3;
                            } else {
                                flexItem = flexItem3;
                                int maxLine = ekqVar.getMaxLine();
                                if (maxLine == -1 || maxLine > size2 + 1) {
                                    int iJ2 = ekqVar.j(viewI, i8, i13);
                                    if (iJ2 > 0) {
                                        measuredWidth += iJ2;
                                    }
                                    if (size < i15 + measuredWidth) {
                                    }
                                }
                            }
                            i10 = i10;
                            arrayList = arrayList;
                            aVar.h += i9;
                            i13++;
                            i6 = i11;
                        }
                        if (aVar.a() > 0) {
                            arrayList = arrayList;
                            a(arrayList, aVar, i8 > 0 ? i8 - 1 : 0, i12);
                            i12 += aVar.g;
                        } else {
                            arrayList = arrayList;
                        }
                        if (zK) {
                            if (flexItem.f() == -1) {
                                viewI.measure(iE, ekqVar.e(i2, ekqVar.getPaddingBottom() + ekqVar.getPaddingTop() + flexItem.S() + flexItem.D0() + i12, flexItem.f()));
                                c(viewI, i8);
                            }
                        } else if (flexItem.j() == -1) {
                            viewI.measure(ekqVar.c(i2, ekqVar.getPaddingRight() + ekqVar.getPaddingLeft() + flexItem.E0() + flexItem.R0() + i12, flexItem.j()), iE);
                            c(viewI, i8);
                        }
                        aVar = new a();
                        aVar.h = i9;
                        i10 = i10;
                        aVar.e = i10;
                        aVar.o = i8;
                        i6 = Integer.MIN_VALUE;
                        i13 = 0;
                    } else {
                        flexItem = flexItem3;
                        i10 = i10;
                        arrayList = arrayList;
                        aVar.h += i9;
                        i13++;
                        i6 = i11;
                    }
                    aVar.q |= flexItem.V() != 0.0f;
                    aVar.r |= flexItem.J() != 0.0f;
                    int[] iArr = this.c;
                    if (iArr != null) {
                        iArr[i8] = arrayList.size();
                    }
                    aVar.e = (zK ? viewI.getMeasuredWidth() : viewI.getMeasuredHeight()) + (zK ? flexItem.E0() : flexItem.S()) + (zK ? flexItem.R0() : flexItem.D0()) + aVar.e;
                    aVar.j += flexItem.V();
                    aVar.k += flexItem.J();
                    ekqVar.b(viewI, i8, i13, aVar);
                    int iMax = Math.max(i6, ekqVar.g(viewI) + (zK ? viewI.getMeasuredHeight() : viewI.getMeasuredWidth()) + (zK ? flexItem.S() : flexItem.E0()) + (zK ? flexItem.D0() : flexItem.R0()));
                    aVar.g = Math.max(aVar.g, iMax);
                    if (zK) {
                        int flexWrap = ekqVar.getFlexWrap();
                        int i16 = aVar.l;
                        i11 = iMax;
                        if (flexWrap != 2) {
                            aVar.l = Math.max(i16, viewI.getBaseline() + flexItem.S());
                        } else {
                            aVar.l = Math.max(i16, (viewI.getMeasuredHeight() - viewI.getBaseline()) + flexItem.D0());
                        }
                    } else {
                        i11 = iMax;
                    }
                    if (i8 == i14 - 1 && aVar.a() != 0) {
                        a(arrayList, aVar, i8, i12);
                        i12 += aVar.g;
                    }
                    if (i5 != -1 && arrayList.size() > 0) {
                        i9 = 1;
                        if (((a) arrayList.get(arrayList.size() - 1)).p >= i5 && i8 >= i5 && !z3) {
                            i12 = -aVar.g;
                            z = true;
                        }
                        if (i12 > i3 && z) {
                            break;
                        }
                    } else {
                        i9 = 1;
                    }
                    z = z3;
                    if (i12 > i3) {
                        continue;
                    }
                }
                i8++;
                i7 = i;
                z3 = z;
                flexItemCount = i14;
            } else if (i8 == i14 - 1 && aVar.a() != 0) {
                a(arrayList, aVar, i8, i12);
            }
            z = z3;
            i8++;
            i7 = i;
            z3 = z;
            flexItemCount = i14;
        }
        tyjVar.b = iCombineMeasuredStates;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    public final void c(View view, int i) {
        boolean z;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth >= flexItem.L()) {
            if (measuredWidth > flexItem.k0()) {
                measuredWidth = flexItem.k0();
            } else {
                z = false;
            }
            if (measuredHeight < flexItem.S0()) {
                measuredHeight = flexItem.S0();
            } else if (measuredHeight > flexItem.U0()) {
                measuredHeight = flexItem.U0();
            } else {
                z2 = z;
            }
            if (z2) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                v(i, iMakeMeasureSpec, iMakeMeasureSpec2, view);
                this.f45463a.f(view, i);
            }
        }
        measuredWidth = flexItem.L();
        z = true;
        if (measuredHeight < flexItem.S0()) {
            measuredHeight = flexItem.S0();
        } else if (measuredHeight > flexItem.U0()) {
            measuredHeight = flexItem.U0();
        } else {
            z2 = z;
        }
        if (z2) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            v(i, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
            this.f45463a.f(view, i);
        }
    }

    public final void d(int i, List list) {
        int i2 = this.c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public final ArrayList f(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            FlexItem flexItem = (FlexItem) this.f45463a.d(i2).getLayoutParams();
            gkq gkqVar = new gkq();
            gkqVar.b = flexItem.getOrder();
            gkqVar.f11456a = i2;
            arrayList.add(gkqVar);
        }
        return arrayList;
    }

    public final void g(int i, int i2, int i3) {
        int mode;
        int size;
        int iRound;
        ekq ekqVar = this.f45463a;
        int flexDirection = ekqVar.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            mode = mode2;
            size = size2;
        } else if (flexDirection != 2 && flexDirection != 3) {
            jf4.o(twn.m(flexDirection, "Invalid flex direction: "));
            return;
        } else {
            mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
        }
        List<a> flexLinesInternal = ekqVar.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = ekqVar.getSumOfCrossSize() + i3;
            int i4 = 0;
            if (flexLinesInternal.size() == 1) {
                ((a) flexLinesInternal.get(0)).g = size - i3;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = ekqVar.getAlignContent();
                if (alignContent == 1) {
                    a aVar = new a();
                    aVar.g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, aVar);
                    return;
                }
                if (alignContent == 2) {
                    ekqVar.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size4 = flexLinesInternal.size();
                    float f = 0.0f;
                    while (i4 < size4) {
                        arrayList.add((a) flexLinesInternal.get(i4));
                        if (i4 != flexLinesInternal.size() - 1) {
                            a aVar2 = new a();
                            if (i4 == flexLinesInternal.size() - 2) {
                                int iRound2 = Math.round(f + size3);
                                aVar2.g = iRound2;
                                iRound = iRound2;
                                f = 0.0f;
                            } else {
                                iRound = Math.round(size3);
                                aVar2.g = iRound;
                            }
                            float f2 = (size3 - iRound) + f;
                            if (f2 > 1.0f) {
                                aVar2.g = iRound + 1;
                                f2 -= 1.0f;
                            } else if (f2 < -1.0f) {
                                aVar2.g = iRound - 1;
                                f2 += 1.0f;
                            }
                            f = f2;
                            arrayList.add(aVar2);
                        }
                        i4++;
                    }
                    ekqVar.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        ekqVar.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    a aVar3 = new a();
                    aVar3.g = size5;
                    for (a aVar4 : flexLinesInternal) {
                        arrayList2.add(aVar3);
                        arrayList2.add(aVar4);
                        arrayList2.add(aVar3);
                    }
                    ekqVar.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f3 = 0.0f;
                    while (i4 < size7) {
                        a aVar5 = (a) flexLinesInternal.get(i4);
                        float f4 = aVar5.g + size6;
                        if (i4 == flexLinesInternal.size() - 1) {
                            f4 += f3;
                            f3 = 0.0f;
                        }
                        int iRound3 = Math.round(f4);
                        float f5 = (f4 - iRound3) + f3;
                        if (f5 > 1.0f) {
                            iRound3++;
                            f5 -= 1.0f;
                        } else if (f5 < -1.0f) {
                            iRound3--;
                            f5 += 1.0f;
                        }
                        f3 = f5;
                        aVar5.g = iRound3;
                        i4++;
                    }
                }
            }
        }
    }

    public final void h(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        b bVar;
        int i4;
        int i5;
        ekq ekqVar = this.f45463a;
        int flexItemCount = ekqVar.getFlexItemCount();
        boolean[] zArr = this.b;
        if (zArr == null) {
            this.b = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.b = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= ekqVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = ekqVar.getFlexDirection();
        int flexDirection2 = ekqVar.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = ekqVar.getLargestMainSize();
            if (mode != 1073741824) {
                size = Math.min(largestMainSize, size);
            }
            paddingLeft = ekqVar.getPaddingLeft();
            paddingRight = ekqVar.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                jf4.o(twn.m(flexDirection, "Invalid flex direction: "));
                return;
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = ekqVar.getLargestMainSize();
            }
            paddingLeft = ekqVar.getPaddingTop();
            paddingRight = ekqVar.getPaddingBottom();
        }
        int i6 = paddingRight + paddingLeft;
        int i7 = size;
        int[] iArr = this.c;
        int i8 = iArr != null ? iArr[i3] : 0;
        List flexLinesInternal = ekqVar.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i8 < size2) {
            a aVar = (a) flexLinesInternal.get(i8);
            int i9 = aVar.e;
            if (i9 >= i7 || !aVar.q) {
                bVar = this;
                i4 = i;
                i5 = i2;
                if (i9 > i7 && aVar.r) {
                    bVar.q(i4, i5, aVar, i7, i6, false);
                }
            } else {
                bVar = this;
                i4 = i;
                i5 = i2;
                bVar.l(i4, i5, aVar, i7, i6, false);
            }
            i8++;
            this = bVar;
            i = i4;
            i2 = i5;
        }
    }

    public final void i(int i) {
        int[] iArr = this.c;
        if (iArr == null) {
            this.c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.c = Arrays.copyOf(this.c, Math.max(iArr.length * 2, i));
        }
    }

    public final void j(int i) {
        long[] jArr = this.d;
        if (jArr == null) {
            this.d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.d = Arrays.copyOf(this.d, Math.max(jArr.length * 2, i));
        }
    }

    public final void k(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            this.e = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.e = Arrays.copyOf(this.e, Math.max(jArr.length * 2, i));
        }
    }

    public final void l(int i, int i2, a aVar, int i3, int i4, boolean z) {
        int i5;
        float f;
        float f2;
        boolean z2;
        int i6;
        int iMax;
        double d;
        boolean z3;
        double d2;
        float f3 = aVar.j;
        float f4 = 0.0f;
        if (f3 <= 0.0f || i3 < (i5 = aVar.e)) {
            return;
        }
        float f5 = (i3 - i5) / f3;
        aVar.e = i4 + aVar.f;
        if (!z) {
            aVar.g = Integer.MIN_VALUE;
        }
        int i7 = 0;
        boolean z4 = false;
        int i8 = 0;
        float f6 = 0.0f;
        while (i7 < aVar.h) {
            int i9 = aVar.o + i7;
            ekq ekqVar = this.f45463a;
            View viewI = ekqVar.i(i9);
            if (viewI == null || viewI.getVisibility() == 8) {
                f = f4;
                i5 = i5;
                f2 = f5;
                z2 = z4;
                i6 = i7;
            } else {
                FlexItem flexItem = (FlexItem) viewI.getLayoutParams();
                int flexDirection = ekqVar.getFlexDirection();
                f = f4;
                if (flexDirection == 0 || flexDirection == 1) {
                    i5 = i5;
                    float f7 = f5;
                    z2 = z4;
                    int measuredWidth = viewI.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i9];
                    }
                    int measuredHeight = viewI.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i9] >> 32);
                    }
                    if (this.b[i9] || flexItem.V() <= f) {
                        i6 = i7;
                        f2 = f7;
                    } else {
                        float fV = (f7 * flexItem.V()) + measuredWidth;
                        if (i7 == aVar.h - 1) {
                            fV += f6;
                            f6 = f;
                        }
                        int iRound = Math.round(fV);
                        if (iRound > flexItem.k0()) {
                            iRound = flexItem.k0();
                            this.b[i9] = true;
                            aVar.j -= flexItem.V();
                            z2 = true;
                            i6 = i7;
                            f2 = f7;
                        } else {
                            float f8 = (fV - iRound) + f6;
                            i6 = i7;
                            f2 = f7;
                            double d3 = f8;
                            if (d3 > 1.0d) {
                                iRound++;
                                d = d3 - 1.0d;
                            } else if (d3 < -1.0d) {
                                iRound--;
                                d = d3 + 1.0d;
                            } else {
                                f6 = f8;
                            }
                            f6 = (float) d;
                        }
                        int iM = m(i2, flexItem, aVar.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewI.measure(iMakeMeasureSpec, iM);
                        int measuredWidth2 = viewI.getMeasuredWidth();
                        int measuredHeight2 = viewI.getMeasuredHeight();
                        v(i9, iMakeMeasureSpec, iM, viewI);
                        ekqVar.f(viewI, i9);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i8, ekqVar.g(viewI) + measuredHeight + flexItem.S() + flexItem.D0());
                    aVar.e = measuredWidth + flexItem.E0() + flexItem.R0() + aVar.e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewI.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i9] >> 32);
                    }
                    int measuredWidth3 = viewI.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i9];
                    }
                    if (this.b[i9] || flexItem.V() <= f) {
                        i5 = i5;
                        z3 = z4;
                    } else {
                        float fV2 = (flexItem.V() * f5) + measuredHeight3;
                        if (i7 == aVar.h - 1) {
                            fV2 += f6;
                            f6 = f;
                        }
                        int iRound2 = Math.round(fV2);
                        if (iRound2 > flexItem.U0()) {
                            iRound2 = flexItem.U0();
                            this.b[i9] = true;
                            aVar.j -= flexItem.V();
                            z3 = true;
                        } else {
                            float f9 = (fV2 - iRound2) + f6;
                            double d4 = f9;
                            if (d4 > 1.0d) {
                                iRound2++;
                                d2 = d4 - 1.0d;
                            } else {
                                if (d4 < -1.0d) {
                                    iRound2--;
                                    d2 = d4 + 1.0d;
                                } else {
                                    f6 = f9;
                                }
                                z3 = z4;
                            }
                            f6 = (float) d2;
                            z3 = z4;
                        }
                        int iN = n(i, flexItem, aVar.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewI.measure(iN, iMakeMeasureSpec2);
                        int measuredWidth4 = viewI.getMeasuredWidth();
                        int measuredHeight4 = viewI.getMeasuredHeight();
                        v(i9, iN, iMakeMeasureSpec2, viewI);
                        ekqVar.f(viewI, i9);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i8, ekqVar.g(viewI) + measuredWidth3 + flexItem.E0() + flexItem.R0());
                    aVar.e = measuredHeight3 + flexItem.S() + flexItem.D0() + aVar.e;
                    f2 = f5;
                    z2 = z3;
                    i6 = i7;
                }
                aVar.g = Math.max(aVar.g, iMax);
                i8 = iMax;
            }
            i7 = i6 + 1;
            f5 = f2;
            f4 = f;
            i5 = i5;
            z4 = z2;
        }
        int i10 = i5;
        if (!z4 || i10 == aVar.e) {
            return;
        }
        l(i, i2, aVar, i3, i4, true);
    }

    public final int m(int i, FlexItem flexItem, int i2) {
        ekq ekqVar = this.f45463a;
        int iE = ekqVar.e(i, ekqVar.getPaddingBottom() + ekqVar.getPaddingTop() + flexItem.S() + flexItem.D0() + i2, flexItem.f());
        int size = View.MeasureSpec.getSize(iE);
        if (size > flexItem.U0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.U0(), View.MeasureSpec.getMode(iE));
        }
        return size < flexItem.S0() ? View.MeasureSpec.makeMeasureSpec(flexItem.S0(), View.MeasureSpec.getMode(iE)) : iE;
    }

    public final int n(int i, FlexItem flexItem, int i2) {
        ekq ekqVar = this.f45463a;
        int iC = ekqVar.c(i, ekqVar.getPaddingRight() + ekqVar.getPaddingLeft() + flexItem.E0() + flexItem.R0() + i2, flexItem.j());
        int size = View.MeasureSpec.getSize(iC);
        if (size > flexItem.k0()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.k0(), View.MeasureSpec.getMode(iC));
        }
        return size < flexItem.L() ? View.MeasureSpec.makeMeasureSpec(flexItem.L(), View.MeasureSpec.getMode(iC)) : iC;
    }

    public final void o(View view, a aVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        ekq ekqVar = this.f45463a;
        int alignItems = ekqVar.getAlignItems();
        if (flexItem.H() != -1) {
            alignItems = flexItem.H();
        }
        int i5 = aVar.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (ekqVar.getFlexWrap() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.D0(), i3, i6 - flexItem.D0());
                    return;
                } else {
                    view.layout(i, view.getMeasuredHeight() + (i2 - i5) + flexItem.S(), i3, view.getMeasuredHeight() + (i4 - i5) + flexItem.S());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.S()) - flexItem.D0()) / 2;
                if (ekqVar.getFlexWrap() != 2) {
                    int i7 = i2 + measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else {
                    int i8 = i2 - measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            }
            if (alignItems == 3) {
                int flexWrap = ekqVar.getFlexWrap();
                int i9 = aVar.l;
                if (flexWrap != 2) {
                    int iMax = Math.max(i9 - view.getBaseline(), flexItem.S());
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (i9 - view.getMeasuredHeight()), flexItem.D0());
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (ekqVar.getFlexWrap() != 2) {
            view.layout(i, i2 + flexItem.S(), i3, i4 + flexItem.S());
        } else {
            view.layout(i, i2 - flexItem.D0(), i3, i4 - flexItem.D0());
        }
    }

    public final void p(View view, a aVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f45463a.getAlignItems();
        if (flexItem.H() != -1) {
            alignItems = flexItem.H();
        }
        int i5 = aVar.g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.R0(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.R0(), i4);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i - i5) + flexItem.E0(), i2, view.getMeasuredWidth() + (i3 - i5) + flexItem.E0(), i4);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i5 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z) {
                    view.layout(i - marginStart, i2, i3 - marginStart, i4);
                    return;
                } else {
                    view.layout(i + marginStart, i2, i3 + marginStart, i4);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z) {
            view.layout(i - flexItem.R0(), i2, i3 - flexItem.R0(), i4);
        } else {
            view.layout(i + flexItem.E0(), i2, i3 + flexItem.E0(), i4);
        }
    }

    public final void q(int i, int i2, a aVar, int i3, int i4, boolean z) {
        float f;
        int iMax;
        int iL;
        int iS0;
        int i5 = aVar.e;
        float f2 = aVar.k;
        float f3 = 0.0f;
        if (f2 <= 0.0f || i3 > i5) {
            return;
        }
        float f4 = (i5 - i3) / f2;
        aVar.e = i4 + aVar.f;
        if (!z) {
            aVar.g = Integer.MIN_VALUE;
        }
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        float f5 = 0.0f;
        while (i6 < aVar.h) {
            int i8 = aVar.o + i6;
            ekq ekqVar = this.f45463a;
            View viewI = ekqVar.i(i8);
            if (viewI == null || viewI.getVisibility() == 8) {
                f = f3;
                f4 = f4;
            } else {
                FlexItem flexItem = (FlexItem) viewI.getLayoutParams();
                int flexDirection = ekqVar.getFlexDirection();
                f = f3;
                if (flexDirection == 0 || flexDirection == 1) {
                    f4 = f4;
                    int measuredWidth = viewI.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i8];
                    }
                    int measuredHeight = viewI.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i8] >> 32);
                    }
                    if (!this.b[i8] && flexItem.J() > f) {
                        float fJ = measuredWidth - (f4 * flexItem.J());
                        if (i6 == aVar.h - 1) {
                            fJ += f5;
                            f5 = f;
                        }
                        int iRound = Math.round(fJ);
                        if (iRound < flexItem.L()) {
                            iL = flexItem.L();
                            this.b[i8] = true;
                            aVar.k -= flexItem.J();
                            z2 = true;
                        } else {
                            float f6 = (fJ - iRound) + f5;
                            double d = f6;
                            if (d > 1.0d) {
                                iL = iRound + 1;
                                f6 -= 1.0f;
                            } else if (d < -1.0d) {
                                iL = iRound - 1;
                                f6 += 1.0f;
                            } else {
                                iL = iRound;
                            }
                            f5 = f6;
                        }
                        int iM = m(i2, flexItem, aVar.m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iL, 1073741824);
                        viewI.measure(iMakeMeasureSpec, iM);
                        int measuredWidth2 = viewI.getMeasuredWidth();
                        int measuredHeight2 = viewI.getMeasuredHeight();
                        v(i8, iMakeMeasureSpec, iM, viewI);
                        ekqVar.f(viewI, i8);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i7, ekqVar.g(viewI) + measuredHeight + flexItem.S() + flexItem.D0());
                    aVar.e = measuredWidth + flexItem.E0() + flexItem.R0() + aVar.e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewI.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i8] >> 32);
                    }
                    int measuredWidth3 = viewI.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i8];
                    }
                    if (this.b[i8] || flexItem.J() <= f) {
                        f4 = f4;
                    } else {
                        float fJ2 = measuredHeight3 - (flexItem.J() * f4);
                        if (i6 == aVar.h - 1) {
                            fJ2 += f5;
                            f5 = f;
                        }
                        int iRound2 = Math.round(fJ2);
                        if (iRound2 < flexItem.S0()) {
                            iS0 = flexItem.S0();
                            this.b[i8] = true;
                            aVar.k -= flexItem.J();
                            z2 = true;
                        } else {
                            float f7 = (fJ2 - iRound2) + f5;
                            double d2 = f7;
                            if (d2 > 1.0d) {
                                iS0 = iRound2 + 1;
                                f7 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                iS0 = iRound2 - 1;
                                f7 += 1.0f;
                            } else {
                                iS0 = iRound2;
                            }
                            f5 = f7;
                        }
                        int iN = n(i, flexItem, aVar.m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iS0, 1073741824);
                        viewI.measure(iN, iMakeMeasureSpec2);
                        int measuredWidth4 = viewI.getMeasuredWidth();
                        int measuredHeight4 = viewI.getMeasuredHeight();
                        v(i8, iN, iMakeMeasureSpec2, viewI);
                        ekqVar.f(viewI, i8);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i7, ekqVar.g(viewI) + measuredWidth3 + flexItem.E0() + flexItem.R0());
                    aVar.e = measuredHeight3 + flexItem.S() + flexItem.D0() + aVar.e;
                }
                aVar.g = Math.max(aVar.g, iMax);
                i7 = iMax;
            }
            i6++;
            f3 = f;
            f4 = f4;
        }
        if (!z2 || i5 == aVar.e) {
            return;
        }
        q(i, i2, aVar, i3, i4, true);
    }

    public final void s(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iE0 = (i - flexItem.E0()) - flexItem.R0();
        ekq ekqVar = this.f45463a;
        int iMin = Math.min(Math.max(iE0 - ekqVar.g(view), flexItem.L()), flexItem.k0());
        long[] jArr = this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        v(i2, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        ekqVar.f(view, i2);
    }

    public final void t(View view, int i, int i2) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iS = (i - flexItem.S()) - flexItem.D0();
        ekq ekqVar = this.f45463a;
        int iMin = Math.min(Math.max(iS - ekqVar.g(view), flexItem.S0()), flexItem.U0());
        long[] jArr = this.e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        v(i2, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        ekqVar.f(view, i2);
    }

    public final void u(int i) {
        View viewI;
        ekq ekqVar = this.f45463a;
        if (i >= ekqVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = ekqVar.getFlexDirection();
        if (ekqVar.getAlignItems() != 4) {
            for (a aVar : ekqVar.getFlexLinesInternal()) {
                for (Integer num : aVar.n) {
                    View viewI2 = ekqVar.i(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        t(viewI2, aVar.g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            jf4.o(twn.m(flexDirection, "Invalid flex direction: "));
                            return;
                        }
                        s(viewI2, aVar.g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.c;
        List flexLinesInternal = ekqVar.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
            a aVar2 = (a) flexLinesInternal.get(i2);
            int i3 = aVar2.h;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = aVar2.o + i4;
                if (i4 < ekqVar.getFlexItemCount() && (viewI = ekqVar.i(i5)) != null && viewI.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewI.getLayoutParams();
                    if (flexItem.H() == -1 || flexItem.H() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            t(viewI, aVar2.g, i5);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                jf4.o(twn.m(flexDirection, "Invalid flex direction: "));
                                return;
                            }
                            s(viewI, aVar2.g, i5);
                        }
                    }
                }
            }
        }
    }

    public final void v(int i, int i2, int i3, View view) {
        long[] jArr = this.d;
        if (jArr != null) {
            jArr[i] = (((long) i2) & 4294967295L) | (((long) i3) << 32);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredHeight()) << 32) | (((long) view.getMeasuredWidth()) & 4294967295L);
        }
    }
}
