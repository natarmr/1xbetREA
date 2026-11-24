package a;

import android.opengl.GLES20;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g4c0 implements r96 {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10659a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Object g;
    public Object h;

    public g4c0(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.g = constraintLayout2;
    }

    public static boolean d(int i2, int i3, int i4) {
        if (i2 == i3) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
        }
        return false;
    }

    public static boolean e(d4c0 d4c0Var) {
        c4c0 c4c0Var = d4c0Var.f5448a;
        c4c0 c4c0Var2 = d4c0Var.b;
        tyc[] tycVarArr = c4c0Var.f3718a;
        if (tycVarArr.length == 1 && tycVarArr[0].b == 0) {
            tyc[] tycVarArr2 = c4c0Var2.f3718a;
            if (tycVarArr2.length == 1 && tycVarArr2[0].b == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // a.r96
    public void a() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.g;
        ArrayList arrayList = constraintLayout.b;
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            constraintLayout.getChildAt(i2);
        }
        int size = arrayList.size();
        if (size > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                ((ConstraintHelper) arrayList.get(i3)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x019d  */
    /* JADX WARN: Code duplicated, block: B:111:0x019f  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:136:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d2 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:139:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:156:0x0207  */
    /* JADX WARN: Code duplicated, block: B:159:0x0221  */
    /* JADX WARN: Code duplicated, block: B:160:0x0226  */
    /* JADX WARN: Code duplicated, block: B:163:0x022b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0233  */
    /* JADX WARN: Code duplicated, block: B:168:0x023a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0240  */
    /* JADX WARN: Code duplicated, block: B:174:0x024d  */
    /* JADX WARN: Code duplicated, block: B:176:0x0251 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x025b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x0268 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:186:0x026f  */
    /* JADX WARN: Code duplicated, block: B:188:0x0273  */
    /* JADX WARN: Code duplicated, block: B:190:0x0279  */
    /* JADX WARN: Code duplicated, block: B:191:0x027e  */
    /* JADX WARN: Code duplicated, block: B:194:0x029b  */
    /* JADX WARN: Code duplicated, block: B:195:0x029d  */
    /* JADX WARN: Code duplicated, block: B:202:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:205:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00be  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:78:0x0103 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x010f  */
    /* JADX WARN: Code duplicated, block: B:84:0x011a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0124  */
    @Override // a.r96
    public void b(k4e k4eVar, q96 q96Var) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iOrdinal;
        int iMakeMeasureSpec3;
        l4e l4eVar;
        j4e j4eVar;
        boolean z;
        boolean z2;
        j4e j4eVar2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        a3e a3eVar;
        int i2;
        int measuredWidth;
        int measuredHeight;
        int i3;
        int iMin;
        int i4;
        int i5;
        int iMin2;
        int i6;
        int i7;
        int iMakeMeasureSpec4;
        boolean z7;
        int baseline;
        int i8;
        boolean z8;
        boolean z9;
        boolean z10;
        int i9;
        boolean z11;
        int i10;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.h;
        if (k4eVar == null) {
            return;
        }
        w2e w2eVar = k4eVar.L;
        w2e w2eVar2 = k4eVar.J;
        if (k4eVar.i0 == 8) {
            q96Var.e = 0;
            q96Var.f = 0;
            q96Var.g = 0;
            return;
        }
        if (k4eVar.V == null) {
            return;
        }
        ipj0 ipj0Var = ConstraintLayout.p;
        j4e j4eVar3 = q96Var.f28332a;
        j4e j4eVar4 = q96Var.b;
        int i11 = q96Var.c;
        int i12 = q96Var.d;
        int i13 = this.f10659a + this.b;
        int i14 = this.c;
        View view = (View) k4eVar.h0;
        int iOrdinal2 = j4eVar3.ordinal();
        if (iOrdinal2 == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        } else {
            if (iOrdinal2 != 1) {
                if (iOrdinal2 == 2) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.e, i14, -2);
                    boolean z12 = k4eVar.s == 1;
                    int i15 = q96Var.j;
                    if (i15 == 1 || i15 == 2) {
                        boolean z13 = view.getMeasuredHeight() == k4eVar.m();
                        if (q96Var.j == 2 || !z12 || ((z12 && z13) || k4eVar.C())) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(k4eVar.s(), 1073741824);
                        }
                    }
                } else if (iOrdinal2 != 3) {
                    iMakeMeasureSpec2 = 0;
                } else {
                    int i16 = this.e;
                    int i17 = w2eVar2 != null ? w2eVar2.g : 0;
                    if (w2eVar != null) {
                        i17 += w2eVar.g;
                    }
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i16, i14 + i17, -1);
                }
                iOrdinal = j4eVar4.ordinal();
                if (iOrdinal != 0) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                } else if (iOrdinal != 1) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f, i13, -2);
                } else if (iOrdinal != 2) {
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f, i13, -2);
                    if (k4eVar.t == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i9 = q96Var.j;
                    if (i9 != 1 || i9 == 2) {
                        if (view.getMeasuredWidth() == k4eVar.s()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (q96Var.j != 2 || !z10 || ((z10 && z11) || k4eVar.D())) {
                            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(k4eVar.m(), 1073741824);
                        }
                    }
                } else if (iOrdinal != 3) {
                    iMakeMeasureSpec3 = 0;
                } else {
                    int i18 = this.f;
                    if (w2eVar2 != null) {
                        i10 = k4eVar.K.g;
                    } else {
                        i10 = 0;
                    }
                    if (w2eVar != null) {
                        i10 += k4eVar.M.g;
                    }
                    iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(i18, i13 + i10, -1);
                }
                l4eVar = (l4e) k4eVar.V;
                if (l4eVar == null && f1t0.S(constraintLayout.i, 256) && view.getMeasuredWidth() == k4eVar.s() && view.getMeasuredWidth() < l4eVar.s() && view.getMeasuredHeight() == k4eVar.m() && view.getMeasuredHeight() < l4eVar.m() && view.getBaseline() == k4eVar.c0 && !k4eVar.B() && d(k4eVar.H, iMakeMeasureSpec2, k4eVar.s()) && d(k4eVar.I, iMakeMeasureSpec3, k4eVar.m())) {
                    q96Var.e = k4eVar.s();
                    q96Var.f = k4eVar.m();
                    q96Var.g = k4eVar.c0;
                    return;
                }
                j4eVar = j4e.c;
                if (j4eVar3 == j4eVar) {
                    z = true;
                } else {
                    z = false;
                }
                if (j4eVar4 == j4eVar) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                j4e j4eVar5 = j4e.f15879a;
                j4eVar2 = j4e.d;
                if (j4eVar4 != j4eVar2 || j4eVar4 == j4eVar5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (j4eVar3 != j4eVar2 || j4eVar3 == j4eVar5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z || k4eVar.Y <= 0.0f) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                if (z2 || k4eVar.Y <= 0.0f) {
                    z6 = false;
                } else {
                    z6 = true;
                }
                if (view == null) {
                    return;
                }
                a3eVar = (a3e) view.getLayoutParams();
                i2 = q96Var.j;
                if (i2 == 1 && i2 != 2 && z && k4eVar.s == 0 && z2 && k4eVar.t == 0) {
                    z7 = false;
                    baseline = 0;
                    i8 = -1;
                    iMin = 0;
                    iMin2 = 0;
                } else {
                    if ((view instanceof yru0) || !(k4eVar instanceof zru0)) {
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
                    } else {
                        ((yru0) view).n((zru0) k4eVar, iMakeMeasureSpec2, iMakeMeasureSpec3);
                    }
                    k4eVar.H = iMakeMeasureSpec2;
                    k4eVar.I = iMakeMeasureSpec3;
                    k4eVar.g = false;
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    int baseline2 = view.getBaseline();
                    i3 = k4eVar.v;
                    if (i3 > 0) {
                        iMin = Math.max(i3, measuredWidth);
                    } else {
                        iMin = measuredWidth;
                    }
                    i4 = k4eVar.w;
                    if (i4 > 0) {
                        iMin = Math.min(i4, iMin);
                    }
                    i5 = k4eVar.y;
                    if (i5 > 0) {
                        iMin2 = Math.max(i5, measuredHeight);
                    } else {
                        iMin2 = measuredHeight;
                    }
                    i6 = iMakeMeasureSpec3;
                    i7 = k4eVar.z;
                    if (i7 > 0) {
                        iMin2 = Math.min(i7, iMin2);
                    }
                    if (!f1t0.S(constraintLayout.i, 1)) {
                        if (!z5 && z3) {
                            iMin = (int) ((iMin2 * k4eVar.Y) + 0.5f);
                        } else if (z6 && z4) {
                            iMin2 = (int) ((iMin / k4eVar.Y) + 0.5f);
                        }
                    }
                    if (measuredWidth == iMin || measuredHeight != iMin2) {
                        if (measuredWidth != iMin) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                        }
                        if (measuredHeight != iMin2) {
                            iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                        } else {
                            iMakeMeasureSpec4 = i6;
                        }
                        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                        k4eVar.H = iMakeMeasureSpec2;
                        k4eVar.I = iMakeMeasureSpec4;
                        z7 = false;
                        k4eVar.g = false;
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        iMin = measuredWidth2;
                        iMin2 = measuredHeight2;
                    } else {
                        baseline = baseline2;
                        z7 = false;
                    }
                    i8 = -1;
                }
                if (baseline != i8) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                if (iMin == q96Var.c || iMin2 != q96Var.d) {
                    z9 = true;
                } else {
                    z9 = z7;
                }
                q96Var.i = z9;
                if (a3eVar.c0) {
                    z8 = true;
                }
                if (z8 && baseline != -1 && k4eVar.c0 != baseline) {
                    q96Var.i = true;
                }
                q96Var.e = iMin;
                q96Var.f = iMin2;
                q96Var.h = z8;
                q96Var.g = baseline;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.e, i14, -2);
        }
        iMakeMeasureSpec2 = iMakeMeasureSpec;
        iOrdinal = j4eVar4.ordinal();
        if (iOrdinal != 0) {
            iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        } else if (iOrdinal != 1) {
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f, i13, -2);
        } else if (iOrdinal != 2) {
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(this.f, i13, -2);
            if (k4eVar.t == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i9 = q96Var.j;
            if (i9 != 1) {
                if (view.getMeasuredWidth() == k4eVar.s()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (q96Var.j != 2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(k4eVar.m(), 1073741824);
                } else {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(k4eVar.m(), 1073741824);
                }
            } else {
                if (view.getMeasuredWidth() == k4eVar.s()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (q96Var.j != 2) {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(k4eVar.m(), 1073741824);
                } else {
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(k4eVar.m(), 1073741824);
                }
            }
        } else if (iOrdinal != 3) {
            iMakeMeasureSpec3 = 0;
        } else {
            int i19 = this.f;
            if (w2eVar2 != null) {
                i10 = k4eVar.K.g;
            } else {
                i10 = 0;
            }
            if (w2eVar != null) {
                i10 += k4eVar.M.g;
            }
            iMakeMeasureSpec3 = ViewGroup.getChildMeasureSpec(i19, i13 + i10, -1);
        }
        l4eVar = (l4e) k4eVar.V;
        if (l4eVar == null) {
        }
        j4eVar = j4e.c;
        if (j4eVar3 == j4eVar) {
            z = true;
        } else {
            z = false;
        }
        if (j4eVar4 == j4eVar) {
            z2 = true;
        } else {
            z2 = false;
        }
        j4e j4eVar6 = j4e.f15879a;
        j4eVar2 = j4e.d;
        if (j4eVar4 != j4eVar2) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (j4eVar3 != j4eVar2) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (z) {
            z5 = false;
        } else {
            z5 = false;
        }
        if (z2) {
            z6 = false;
        } else {
            z6 = false;
        }
        if (view == null) {
            return;
        }
        a3eVar = (a3e) view.getLayoutParams();
        i2 = q96Var.j;
        if (i2 == 1) {
            if (view instanceof yru0) {
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            } else {
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            }
            k4eVar.H = iMakeMeasureSpec2;
            k4eVar.I = iMakeMeasureSpec3;
            k4eVar.g = false;
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            int baseline3 = view.getBaseline();
            i3 = k4eVar.v;
            if (i3 > 0) {
                iMin = Math.max(i3, measuredWidth);
            } else {
                iMin = measuredWidth;
            }
            i4 = k4eVar.w;
            if (i4 > 0) {
                iMin = Math.min(i4, iMin);
            }
            i5 = k4eVar.y;
            if (i5 > 0) {
                iMin2 = Math.max(i5, measuredHeight);
            } else {
                iMin2 = measuredHeight;
            }
            i6 = iMakeMeasureSpec3;
            i7 = k4eVar.z;
            if (i7 > 0) {
                iMin2 = Math.min(i7, iMin2);
            }
            if (!f1t0.S(constraintLayout.i, 1)) {
                if (!z5) {
                    if (z6) {
                        iMin2 = (int) ((iMin / k4eVar.Y) + 0.5f);
                    }
                } else if (z6) {
                    iMin2 = (int) ((iMin / k4eVar.Y) + 0.5f);
                }
            }
            if (measuredWidth == iMin) {
                if (measuredWidth != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i6;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                k4eVar.H = iMakeMeasureSpec2;
                k4eVar.I = iMakeMeasureSpec4;
                z7 = false;
                k4eVar.g = false;
                int measuredWidth3 = view.getMeasuredWidth();
                int measuredHeight3 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin = measuredWidth3;
                iMin2 = measuredHeight3;
            } else {
                if (measuredWidth != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i6;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                k4eVar.H = iMakeMeasureSpec2;
                k4eVar.I = iMakeMeasureSpec4;
                z7 = false;
                k4eVar.g = false;
                int measuredWidth4 = view.getMeasuredWidth();
                int measuredHeight4 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin = measuredWidth4;
                iMin2 = measuredHeight4;
            }
            i8 = -1;
        } else {
            if (view instanceof yru0) {
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            } else {
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec3);
            }
            k4eVar.H = iMakeMeasureSpec2;
            k4eVar.I = iMakeMeasureSpec3;
            k4eVar.g = false;
            measuredWidth = view.getMeasuredWidth();
            measuredHeight = view.getMeasuredHeight();
            int baseline4 = view.getBaseline();
            i3 = k4eVar.v;
            if (i3 > 0) {
                iMin = Math.max(i3, measuredWidth);
            } else {
                iMin = measuredWidth;
            }
            i4 = k4eVar.w;
            if (i4 > 0) {
                iMin = Math.min(i4, iMin);
            }
            i5 = k4eVar.y;
            if (i5 > 0) {
                iMin2 = Math.max(i5, measuredHeight);
            } else {
                iMin2 = measuredHeight;
            }
            i6 = iMakeMeasureSpec3;
            i7 = k4eVar.z;
            if (i7 > 0) {
                iMin2 = Math.min(i7, iMin2);
            }
            if (!f1t0.S(constraintLayout.i, 1)) {
                if (!z5) {
                    if (z6) {
                        iMin2 = (int) ((iMin / k4eVar.Y) + 0.5f);
                    }
                } else if (z6) {
                    iMin2 = (int) ((iMin / k4eVar.Y) + 0.5f);
                }
            }
            if (measuredWidth == iMin) {
                if (measuredWidth != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i6;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                k4eVar.H = iMakeMeasureSpec2;
                k4eVar.I = iMakeMeasureSpec4;
                z7 = false;
                k4eVar.g = false;
                int measuredWidth5 = view.getMeasuredWidth();
                int measuredHeight5 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin = measuredWidth5;
                iMin2 = measuredHeight5;
            } else {
                if (measuredWidth != iMin) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                }
                if (measuredHeight != iMin2) {
                    iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin2, 1073741824);
                } else {
                    iMakeMeasureSpec4 = i6;
                }
                view.measure(iMakeMeasureSpec2, iMakeMeasureSpec4);
                k4eVar.H = iMakeMeasureSpec2;
                k4eVar.I = iMakeMeasureSpec4;
                z7 = false;
                k4eVar.g = false;
                int measuredWidth6 = view.getMeasuredWidth();
                int measuredHeight6 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMin = measuredWidth6;
                iMin2 = measuredHeight6;
            }
            i8 = -1;
        }
        if (baseline != i8) {
            z8 = true;
        } else {
            z8 = z7;
        }
        if (iMin == q96Var.c) {
            z9 = true;
        } else {
            z9 = true;
        }
        q96Var.i = z9;
        if (a3eVar.c0) {
            z8 = true;
        }
        if (z8) {
            q96Var.i = true;
        }
        q96Var.e = iMin;
        q96Var.f = iMin2;
        q96Var.h = z8;
        q96Var.g = baseline;
    }

    public void c() {
        try {
            ucs0 ucs0Var = new ucs0("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.h = ucs0Var;
            this.b = GLES20.glGetUniformLocation(ucs0Var.b, "uMvpMatrix");
            this.c = GLES20.glGetUniformLocation(((ucs0) this.h).b, "uTexMatrix");
            this.d = ((ucs0) this.h).k("aPosition");
            this.e = ((ucs0) this.h).k("aTexCoords");
            this.f = GLES20.glGetUniformLocation(((ucs0) this.h).b, "uTexture");
        } catch (p7v e) {
            f1t0.R("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }
}
