package androidx.constraintlayout.widget;

import a.a3e;
import a.fqd0;
import a.g4c0;
import a.h3e;
import a.i3e;
import a.ipj0;
import a.j4e;
import a.jvv;
import a.k4e;
import a.l4e;
import a.p900;
import a.q4e;
import a.qiv;
import a.r3e;
import a.x23;
import a.z2e;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static ipj0 p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f45351a;
    public final ArrayList b;
    public final l4e c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public r3e j;
    public x23 k;
    public int l;
    public HashMap m;
    public final SparseArray n;
    public final g4c0 o;

    public ConstraintLayout(Context context) {
        super(context);
        this.f45351a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new l4e();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new g4c0(this, this);
        o(null, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static ipj0 getSharedValues() {
        ipj0 ipj0Var = p;
        if (ipj0Var != null) {
            return ipj0Var;
        }
        ipj0 ipj0Var2 = new ipj0();
        new SparseIntArray();
        ipj0Var2.f15167a = new HashMap();
        p = ipj0Var2;
        return ipj0Var2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a3e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((ConstraintHelper) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(Separators.COMMA);
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.h = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a3e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a3e a3eVar = new a3e(context, attributeSet);
        a3eVar.f167a = -1;
        a3eVar.b = -1;
        a3eVar.c = -1.0f;
        a3eVar.d = true;
        a3eVar.e = -1;
        a3eVar.f = -1;
        a3eVar.g = -1;
        a3eVar.h = -1;
        a3eVar.i = -1;
        a3eVar.j = -1;
        a3eVar.k = -1;
        a3eVar.l = -1;
        a3eVar.m = -1;
        a3eVar.n = -1;
        a3eVar.o = -1;
        a3eVar.p = -1;
        a3eVar.q = 0;
        a3eVar.r = 0.0f;
        a3eVar.s = -1;
        a3eVar.t = -1;
        a3eVar.u = -1;
        a3eVar.v = -1;
        a3eVar.w = Integer.MIN_VALUE;
        a3eVar.x = Integer.MIN_VALUE;
        a3eVar.y = Integer.MIN_VALUE;
        a3eVar.z = Integer.MIN_VALUE;
        a3eVar.A = Integer.MIN_VALUE;
        a3eVar.B = Integer.MIN_VALUE;
        a3eVar.C = Integer.MIN_VALUE;
        a3eVar.D = 0;
        a3eVar.E = 0.5f;
        a3eVar.F = 0.5f;
        a3eVar.G = null;
        a3eVar.H = -1.0f;
        a3eVar.I = -1.0f;
        a3eVar.J = 0;
        a3eVar.K = 0;
        a3eVar.L = 0;
        a3eVar.M = 0;
        a3eVar.N = 0;
        a3eVar.O = 0;
        a3eVar.P = 0;
        a3eVar.Q = 0;
        a3eVar.R = 1.0f;
        a3eVar.S = 1.0f;
        a3eVar.T = -1;
        a3eVar.U = -1;
        a3eVar.V = -1;
        a3eVar.W = false;
        a3eVar.X = false;
        a3eVar.Y = null;
        a3eVar.Z = 0;
        a3eVar.a0 = true;
        a3eVar.b0 = true;
        a3eVar.c0 = false;
        a3eVar.d0 = false;
        a3eVar.e0 = false;
        a3eVar.f0 = -1;
        a3eVar.g0 = -1;
        a3eVar.h0 = -1;
        a3eVar.i0 = -1;
        a3eVar.j0 = Integer.MIN_VALUE;
        a3eVar.k0 = Integer.MIN_VALUE;
        a3eVar.l0 = 0.5f;
        a3eVar.p0 = new k4e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fqd0.b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = z2e.f43666a.get(index);
            switch (i2) {
                case 1:
                    a3eVar.V = typedArrayObtainStyledAttributes.getInt(index, a3eVar.V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, a3eVar.p);
                    a3eVar.p = resourceId;
                    if (resourceId == -1) {
                        a3eVar.p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    a3eVar.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a3eVar.q);
                    break;
                case 4:
                    float f = typedArrayObtainStyledAttributes.getFloat(index, a3eVar.r) % 360.0f;
                    a3eVar.r = f;
                    if (f < 0.0f) {
                        a3eVar.r = (360.0f - f) % 360.0f;
                    }
                    break;
                case 5:
                    a3eVar.f167a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, a3eVar.f167a);
                    break;
                case 6:
                    a3eVar.b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, a3eVar.b);
                    break;
                case 7:
                    a3eVar.c = typedArrayObtainStyledAttributes.getFloat(index, a3eVar.c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, a3eVar.e);
                    a3eVar.e = resourceId2;
                    if (resourceId2 == -1) {
                        a3eVar.e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, a3eVar.f);
                    a3eVar.f = resourceId3;
                    if (resourceId3 == -1) {
                        a3eVar.f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, a3eVar.g);
                    a3eVar.g = resourceId4;
                    if (resourceId4 == -1) {
                        a3eVar.g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, a3eVar.h);
                    a3eVar.h = resourceId5;
                    if (resourceId5 == -1) {
                        a3eVar.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, a3eVar.i);
                    a3eVar.i = resourceId6;
                    if (resourceId6 == -1) {
                        a3eVar.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, a3eVar.j);
                    a3eVar.j = resourceId7;
                    if (resourceId7 == -1) {
                        a3eVar.j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, a3eVar.k);
                    a3eVar.k = resourceId8;
                    if (resourceId8 == -1) {
                        a3eVar.k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, a3eVar.l);
                    a3eVar.l = resourceId9;
                    if (resourceId9 == -1) {
                        a3eVar.l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, a3eVar.m);
                    a3eVar.m = resourceId10;
                    if (resourceId10 == -1) {
                        a3eVar.m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, a3eVar.s);
                    a3eVar.s = resourceId11;
                    if (resourceId11 == -1) {
                        a3eVar.s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, a3eVar.t);
                    a3eVar.t = resourceId12;
                    if (resourceId12 == -1) {
                        a3eVar.t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, a3eVar.u);
                    a3eVar.u = resourceId13;
                    if (resourceId13 == -1) {
                        a3eVar.u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, a3eVar.v);
                    a3eVar.v = resourceId14;
                    if (resourceId14 == -1) {
                        a3eVar.v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    a3eVar.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a3eVar.w);
                    break;
                case 22:
                    a3eVar.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a3eVar.x);
                    break;
                case 23:
                    a3eVar.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a3eVar.y);
                    break;
                case 24:
                    a3eVar.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a3eVar.z);
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    a3eVar.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a3eVar.A);
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    a3eVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a3eVar.B);
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    a3eVar.W = typedArrayObtainStyledAttributes.getBoolean(index, a3eVar.W);
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    a3eVar.X = typedArrayObtainStyledAttributes.getBoolean(index, a3eVar.X);
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    a3eVar.E = typedArrayObtainStyledAttributes.getFloat(index, a3eVar.E);
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    a3eVar.F = typedArrayObtainStyledAttributes.getFloat(index, a3eVar.F);
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    a3eVar.L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    a3eVar.M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        a3eVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a3eVar.N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, a3eVar.N) == -2) {
                            a3eVar.N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        a3eVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a3eVar.P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, a3eVar.P) == -2) {
                            a3eVar.P = -2;
                        }
                    }
                    break;
                case 35:
                    a3eVar.R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, a3eVar.R));
                    a3eVar.L = 2;
                    break;
                case 36:
                    try {
                        a3eVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a3eVar.O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, a3eVar.O) == -2) {
                            a3eVar.O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        a3eVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a3eVar.Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, a3eVar.Q) == -2) {
                            a3eVar.Q = -2;
                        }
                    }
                    break;
                case 38:
                    a3eVar.S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, a3eVar.S));
                    a3eVar.M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            r3e.n(a3eVar, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            a3eVar.H = typedArrayObtainStyledAttributes.getFloat(index, a3eVar.H);
                            break;
                        case 46:
                            a3eVar.I = typedArrayObtainStyledAttributes.getFloat(index, a3eVar.I);
                            break;
                        case 47:
                            a3eVar.J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            a3eVar.K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            a3eVar.T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, a3eVar.T);
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            a3eVar.U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, a3eVar.U);
                            break;
                        case 51:
                            a3eVar.Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, a3eVar.n);
                            a3eVar.n = resourceId15;
                            if (resourceId15 == -1) {
                                a3eVar.n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, a3eVar.o);
                            a3eVar.o = resourceId16;
                            if (resourceId16 == -1) {
                                a3eVar.o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            a3eVar.D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a3eVar.D);
                            break;
                        case 55:
                            a3eVar.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, a3eVar.C);
                            break;
                        default:
                            switch (i2) {
                                case 64:
                                    r3e.m(a3eVar, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    r3e.m(a3eVar, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    a3eVar.Z = typedArrayObtainStyledAttributes.getInt(index, a3eVar.Z);
                                    break;
                                case 67:
                                    a3eVar.d = typedArrayObtainStyledAttributes.getBoolean(index, a3eVar.d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        a3eVar.a();
        return a3eVar;
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.H0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        l4e l4eVar = this.c;
        if (l4eVar.k == null) {
            int id2 = getId();
            if (id2 != -1) {
                l4eVar.k = getContext().getResources().getResourceEntryName(id2);
            } else {
                l4eVar.k = "parent";
            }
        }
        if (l4eVar.k0 == null) {
            l4eVar.k0 = l4eVar.k;
            Log.v("ConstraintLayout", " setDebugName " + l4eVar.k0);
        }
        for (k4e k4eVar : l4eVar.u0) {
            View view = (View) k4eVar.h0;
            if (view != null) {
                if (k4eVar.k == null && (id = view.getId()) != -1) {
                    k4eVar.k = getContext().getResources().getResourceEntryName(id);
                }
                if (k4eVar.k0 == null) {
                    k4eVar.k0 = k4eVar.k;
                    Log.v("ConstraintLayout", " setDebugName " + k4eVar.k0);
                }
            }
        }
        l4eVar.p(sb);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:63:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x013c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:77:0x0172  */
    /* JADX WARN: Code duplicated, block: B:79:0x0177  */
    /* JADX WARN: Code duplicated, block: B:80:0x0182  */
    /* JADX WARN: Code duplicated, block: B:82:0x0186  */
    /* JADX WARN: Code duplicated, block: B:85:0x0197  */
    /* JADX WARN: Code duplicated, block: B:88:0x019f  */
    public final void l(boolean z, View view, k4e k4eVar, a3e a3eVar, SparseArray sparseArray) {
        ConstraintLayout constraintLayout;
        int i;
        k4e k4eVar2;
        int i2;
        int i3;
        int i4;
        k4e k4eVar3;
        int i5;
        int i6;
        int i7;
        int i8;
        k4e k4eVar4;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        k4e k4eVar5;
        int i14;
        int i15;
        a3e a3eVar2;
        int i16;
        int i17;
        k4e k4eVar6;
        int i18;
        float f;
        k4e k4eVar7;
        k4e k4eVar8;
        k4e k4eVar9;
        int i19;
        k4e k4eVar10 = k4eVar;
        a3eVar.a();
        k4eVar10.i0 = view.getVisibility();
        k4eVar10.h0 = view;
        if (view instanceof ConstraintHelper) {
            constraintLayout = this;
            ((ConstraintHelper) view).k(k4eVar10, constraintLayout.c.z0);
        } else {
            constraintLayout = this;
        }
        if (a3eVar.d0) {
            qiv qivVar = (qiv) k4eVar10;
            int i20 = a3eVar.m0;
            int i21 = a3eVar.n0;
            float f2 = a3eVar.o0;
            if (f2 != -1.0f) {
                if (f2 > -1.0f) {
                    qivVar.u0 = f2;
                    qivVar.v0 = -1;
                    qivVar.w0 = -1;
                    return;
                }
                return;
            }
            if (i20 != -1) {
                if (i20 > -1) {
                    qivVar.u0 = -1.0f;
                    qivVar.v0 = i20;
                    qivVar.w0 = -1;
                    return;
                }
                return;
            }
            if (i21 == -1 || i21 <= -1) {
                return;
            }
            qivVar.u0 = -1.0f;
            qivVar.v0 = -1;
            qivVar.w0 = i21;
            return;
        }
        int i22 = a3eVar.f0;
        int i23 = a3eVar.g0;
        int i24 = a3eVar.h0;
        int i25 = a3eVar.i0;
        int i26 = a3eVar.j0;
        int i27 = a3eVar.k0;
        float f3 = a3eVar.l0;
        int i28 = a3eVar.p;
        if (i28 != -1) {
            k4e k4eVar11 = (k4e) sparseArray.get(i28);
            if (k4eVar11 != null) {
                float f4 = a3eVar.r;
                k4eVar.x(7, 7, a3eVar.q, 0, k4eVar11);
                k4eVar10 = k4eVar;
                k4eVar10.E = f4;
            }
            k4eVar6 = k4eVar10;
            a3eVar2 = a3eVar;
            i5 = 4;
            i4 = 2;
            i18 = 5;
            i12 = 3;
        } else {
            if (i22 != -1) {
                k4e k4eVar12 = (k4e) sparseArray.get(i22);
                if (k4eVar12 != null) {
                    i = 2;
                    k4eVar10.x(2, 2, ((ViewGroup.MarginLayoutParams) a3eVar).leftMargin, i26, k4eVar12);
                } else {
                    i = 2;
                }
            } else {
                i = 2;
                if (i23 != -1 && (k4eVar2 = (k4e) sparseArray.get(i23)) != null) {
                    k4eVar.x(2, 4, ((ViewGroup.MarginLayoutParams) a3eVar).leftMargin, i26, k4eVar2);
                    i2 = 2;
                    i3 = 4;
                }
                if (i24 != -1) {
                    k4eVar9 = (k4e) sparseArray.get(i24);
                    if (k4eVar9 != null) {
                        k4eVar.x(i3, i2, ((ViewGroup.MarginLayoutParams) a3eVar).rightMargin, i27, k4eVar9);
                    }
                    i4 = i2;
                } else {
                    i4 = i2;
                    if (i25 != -1 && (k4eVar3 = (k4e) sparseArray.get(i25)) != null) {
                        k4eVar.x(i3, i3, ((ViewGroup.MarginLayoutParams) a3eVar).rightMargin, i27, k4eVar3);
                    }
                }
                i5 = i3;
                i6 = a3eVar.i;
                if (i6 != -1) {
                    k4eVar8 = (k4e) sparseArray.get(i6);
                    if (k4eVar8 != null) {
                        i7 = 3;
                        k4eVar.x(3, 3, ((ViewGroup.MarginLayoutParams) a3eVar).topMargin, a3eVar.x, k4eVar8);
                    } else {
                        i7 = 3;
                    }
                } else {
                    i7 = 3;
                    i8 = a3eVar.j;
                    if (i8 == -1 && (k4eVar4 = (k4e) sparseArray.get(i8)) != null) {
                        k4eVar.x(3, 5, ((ViewGroup.MarginLayoutParams) a3eVar).topMargin, a3eVar.x, k4eVar4);
                        i9 = 3;
                        i10 = 5;
                    }
                    i11 = a3eVar.k;
                    if (i11 != -1) {
                        k4eVar7 = (k4e) sparseArray.get(i11);
                        if (k4eVar7 != null) {
                            k4eVar.x(i10, i9, ((ViewGroup.MarginLayoutParams) a3eVar).bottomMargin, a3eVar.z, k4eVar7);
                        }
                        i12 = i9;
                    } else {
                        i12 = i9;
                        i13 = a3eVar.l;
                        if (i13 != -1 && (k4eVar5 = (k4e) sparseArray.get(i13)) != null) {
                            k4eVar.x(i10, i10, ((ViewGroup.MarginLayoutParams) a3eVar).bottomMargin, a3eVar.z, k4eVar5);
                        }
                    }
                    i14 = i10;
                    i15 = a3eVar.m;
                    if (i15 != -1) {
                        a3eVar2 = a3eVar;
                        constraintLayout.t(k4eVar, a3eVar2, sparseArray, i15, 6);
                    } else {
                        a3eVar2 = a3eVar;
                        i16 = a3eVar2.n;
                        if (i16 != -1) {
                            t(k4eVar, a3eVar2, sparseArray, i16, i12);
                        } else {
                            i17 = a3eVar2.o;
                            if (i17 != -1) {
                                t(k4eVar, a3eVar2, sparseArray, i17, i14);
                                k4eVar6 = k4eVar;
                                i18 = i14;
                            }
                            if (f3 >= 0.0f) {
                                k4eVar6.f0 = f3;
                            }
                            f = a3eVar2.F;
                            if (f >= 0.0f) {
                                k4eVar6.g0 = f;
                            }
                        }
                    }
                    k4eVar6 = k4eVar;
                    i18 = i14;
                    if (f3 >= 0.0f) {
                        k4eVar6.f0 = f3;
                    }
                    f = a3eVar2.F;
                    if (f >= 0.0f) {
                        k4eVar6.g0 = f;
                    }
                }
                i9 = i7;
                i10 = 5;
                i11 = a3eVar.k;
                if (i11 != -1) {
                    k4eVar7 = (k4e) sparseArray.get(i11);
                    if (k4eVar7 != null) {
                        k4eVar.x(i10, i9, ((ViewGroup.MarginLayoutParams) a3eVar).bottomMargin, a3eVar.z, k4eVar7);
                    }
                    i12 = i9;
                } else {
                    i12 = i9;
                    i13 = a3eVar.l;
                    if (i13 != -1) {
                        k4eVar.x(i10, i10, ((ViewGroup.MarginLayoutParams) a3eVar).bottomMargin, a3eVar.z, k4eVar5);
                    }
                }
                i14 = i10;
                i15 = a3eVar.m;
                if (i15 != -1) {
                    a3eVar2 = a3eVar;
                    constraintLayout.t(k4eVar, a3eVar2, sparseArray, i15, 6);
                } else {
                    a3eVar2 = a3eVar;
                    i16 = a3eVar2.n;
                    if (i16 != -1) {
                        t(k4eVar, a3eVar2, sparseArray, i16, i12);
                    } else {
                        i17 = a3eVar2.o;
                        if (i17 != -1) {
                            t(k4eVar, a3eVar2, sparseArray, i17, i14);
                            k4eVar6 = k4eVar;
                            i18 = i14;
                        }
                        if (f3 >= 0.0f) {
                            k4eVar6.f0 = f3;
                        }
                        f = a3eVar2.F;
                        if (f >= 0.0f) {
                            k4eVar6.g0 = f;
                        }
                    }
                }
                k4eVar6 = k4eVar;
                i18 = i14;
                if (f3 >= 0.0f) {
                    k4eVar6.f0 = f3;
                }
                f = a3eVar2.F;
                if (f >= 0.0f) {
                    k4eVar6.g0 = f;
                }
            }
            i2 = i;
            i3 = 4;
            if (i24 != -1) {
                k4eVar9 = (k4e) sparseArray.get(i24);
                if (k4eVar9 != null) {
                    k4eVar.x(i3, i2, ((ViewGroup.MarginLayoutParams) a3eVar).rightMargin, i27, k4eVar9);
                }
                i4 = i2;
            } else {
                i4 = i2;
                if (i25 != -1) {
                    k4eVar.x(i3, i3, ((ViewGroup.MarginLayoutParams) a3eVar).rightMargin, i27, k4eVar3);
                }
            }
            i5 = i3;
            i6 = a3eVar.i;
            if (i6 != -1) {
                k4eVar8 = (k4e) sparseArray.get(i6);
                if (k4eVar8 != null) {
                    i7 = 3;
                    k4eVar.x(3, 3, ((ViewGroup.MarginLayoutParams) a3eVar).topMargin, a3eVar.x, k4eVar8);
                } else {
                    i7 = 3;
                }
            } else {
                i7 = 3;
                i8 = a3eVar.j;
                if (i8 == -1) {
                }
                i11 = a3eVar.k;
                if (i11 != -1) {
                    k4eVar7 = (k4e) sparseArray.get(i11);
                    if (k4eVar7 != null) {
                        k4eVar.x(i10, i9, ((ViewGroup.MarginLayoutParams) a3eVar).bottomMargin, a3eVar.z, k4eVar7);
                    }
                    i12 = i9;
                } else {
                    i12 = i9;
                    i13 = a3eVar.l;
                    if (i13 != -1) {
                        k4eVar.x(i10, i10, ((ViewGroup.MarginLayoutParams) a3eVar).bottomMargin, a3eVar.z, k4eVar5);
                    }
                }
                i14 = i10;
                i15 = a3eVar.m;
                if (i15 != -1) {
                    a3eVar2 = a3eVar;
                    constraintLayout.t(k4eVar, a3eVar2, sparseArray, i15, 6);
                } else {
                    a3eVar2 = a3eVar;
                    i16 = a3eVar2.n;
                    if (i16 != -1) {
                        t(k4eVar, a3eVar2, sparseArray, i16, i12);
                    } else {
                        i17 = a3eVar2.o;
                        if (i17 != -1) {
                            t(k4eVar, a3eVar2, sparseArray, i17, i14);
                            k4eVar6 = k4eVar;
                            i18 = i14;
                        }
                        if (f3 >= 0.0f) {
                            k4eVar6.f0 = f3;
                        }
                        f = a3eVar2.F;
                        if (f >= 0.0f) {
                            k4eVar6.g0 = f;
                        }
                    }
                }
                k4eVar6 = k4eVar;
                i18 = i14;
                if (f3 >= 0.0f) {
                    k4eVar6.f0 = f3;
                }
                f = a3eVar2.F;
                if (f >= 0.0f) {
                    k4eVar6.g0 = f;
                }
            }
            i9 = i7;
            i10 = 5;
            i11 = a3eVar.k;
            if (i11 != -1) {
                k4eVar7 = (k4e) sparseArray.get(i11);
                if (k4eVar7 != null) {
                    k4eVar.x(i10, i9, ((ViewGroup.MarginLayoutParams) a3eVar).bottomMargin, a3eVar.z, k4eVar7);
                }
                i12 = i9;
            } else {
                i12 = i9;
                i13 = a3eVar.l;
                if (i13 != -1) {
                    k4eVar.x(i10, i10, ((ViewGroup.MarginLayoutParams) a3eVar).bottomMargin, a3eVar.z, k4eVar5);
                }
            }
            i14 = i10;
            i15 = a3eVar.m;
            if (i15 != -1) {
                a3eVar2 = a3eVar;
                constraintLayout.t(k4eVar, a3eVar2, sparseArray, i15, 6);
            } else {
                a3eVar2 = a3eVar;
                i16 = a3eVar2.n;
                if (i16 != -1) {
                    t(k4eVar, a3eVar2, sparseArray, i16, i12);
                } else {
                    i17 = a3eVar2.o;
                    if (i17 != -1) {
                        t(k4eVar, a3eVar2, sparseArray, i17, i14);
                        k4eVar6 = k4eVar;
                        i18 = i14;
                    }
                    if (f3 >= 0.0f) {
                        k4eVar6.f0 = f3;
                    }
                    f = a3eVar2.F;
                    if (f >= 0.0f) {
                        k4eVar6.g0 = f;
                    }
                }
            }
            k4eVar6 = k4eVar;
            i18 = i14;
            if (f3 >= 0.0f) {
                k4eVar6.f0 = f3;
            }
            f = a3eVar2.F;
            if (f >= 0.0f) {
                k4eVar6.g0 = f;
            }
        }
        if (z && ((i19 = a3eVar2.T) != -1 || a3eVar2.U != -1)) {
            int i29 = a3eVar2.U;
            k4eVar6.a0 = i19;
            k4eVar6.b0 = i29;
        }
        boolean z2 = a3eVar2.a0;
        j4e j4eVar = j4e.b;
        j4e j4eVar2 = j4e.f15879a;
        j4e j4eVar3 = j4e.d;
        j4e j4eVar4 = j4e.c;
        if (z2) {
            k4eVar6.P(j4eVar2);
            k4eVar6.T(((ViewGroup.MarginLayoutParams) a3eVar2).width);
            if (((ViewGroup.MarginLayoutParams) a3eVar2).width == -2) {
                k4eVar6.P(j4eVar);
            }
        } else if (((ViewGroup.MarginLayoutParams) a3eVar2).width == -1) {
            if (a3eVar2.W) {
                k4eVar6.P(j4eVar4);
            } else {
                k4eVar6.P(j4eVar3);
            }
            k4eVar6.k(i4).g = ((ViewGroup.MarginLayoutParams) a3eVar2).leftMargin;
            k4eVar6.k(i5).g = ((ViewGroup.MarginLayoutParams) a3eVar2).rightMargin;
        } else {
            k4eVar6.P(j4eVar4);
            k4eVar6.T(0);
        }
        if (a3eVar2.b0) {
            k4eVar6.R(j4eVar2);
            k4eVar6.O(((ViewGroup.MarginLayoutParams) a3eVar2).height);
            if (((ViewGroup.MarginLayoutParams) a3eVar2).height == -2) {
                k4eVar6.R(j4eVar);
            }
        } else if (((ViewGroup.MarginLayoutParams) a3eVar2).height == -1) {
            if (a3eVar2.X) {
                k4eVar6.R(j4eVar4);
            } else {
                k4eVar6.R(j4eVar3);
            }
            k4eVar6.k(i12).g = ((ViewGroup.MarginLayoutParams) a3eVar2).topMargin;
            k4eVar6.k(i18).g = ((ViewGroup.MarginLayoutParams) a3eVar2).bottomMargin;
        } else {
            k4eVar6.R(j4eVar4);
            k4eVar6.O(0);
        }
        k4eVar6.L(a3eVar2.G);
        float f5 = a3eVar2.H;
        float[] fArr = k4eVar6.n0;
        fArr[0] = f5;
        fArr[1] = a3eVar2.I;
        k4eVar6.l0 = a3eVar2.J;
        k4eVar6.m0 = a3eVar2.K;
        int i30 = a3eVar2.Z;
        if (i30 >= 0 && i30 <= 3) {
            k4eVar6.r = i30;
        }
        k4eVar6.Q(a3eVar2.R, a3eVar2.L, a3eVar2.N, a3eVar2.P);
        k4eVar6.S(a3eVar2.S, a3eVar2.M, a3eVar2.O, a3eVar2.Q);
    }

    public final View m(int i) {
        return (View) this.f45351a.get(i);
    }

    public final k4e n(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof a3e) {
            return ((a3e) view.getLayoutParams()).p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof a3e) {
            return ((a3e) view.getLayoutParams()).p0;
        }
        return null;
    }

    public final void o(AttributeSet attributeSet, int i) {
        l4e l4eVar = this.c;
        l4eVar.h0 = this;
        g4c0 g4c0Var = this.o;
        l4eVar.y0 = g4c0Var;
        l4eVar.w0.h = g4c0Var;
        this.f45351a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, fqd0.b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == 17) {
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == 14) {
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == 15) {
                    this.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == 113) {
                    this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            q(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        r3e r3eVar = new r3e();
                        this.j = r3eVar;
                        r3eVar.j(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        l4eVar.H0 = this.i;
        p900.q = l4eVar.d0(512);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            a3e a3eVar = (a3e) childAt.getLayoutParams();
            k4e k4eVar = a3eVar.p0;
            if (childAt.getVisibility() != 8 || a3eVar.d0 || a3eVar.e0 || zIsInEditMode) {
                int iT = k4eVar.t();
                int iU = k4eVar.u();
                childAt.layout(iT, iU, k4eVar.s() + iT, k4eVar.m() + iU);
            }
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((ConstraintHelper) arrayList.get(i6)).l();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        String str;
        int iG;
        k4e k4eVar;
        boolean z2 = this.h;
        this.h = z2;
        if (!z2) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (getChildAt(i3).isLayoutRequested()) {
                    this.h = true;
                    break;
                }
            }
        }
        boolean zP = p();
        l4e l4eVar = this.c;
        l4eVar.z0 = zP;
        if (this.h) {
            this.h = false;
            int childCount2 = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount2) {
                    z = false;
                    break;
                } else {
                    if (getChildAt(i4).isLayoutRequested()) {
                        z = true;
                        break;
                    }
                    i4++;
                }
            }
            if (z) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i5 = 0; i5 < childCount3; i5++) {
                    k4e k4eVarN = n(getChildAt(i5));
                    if (k4eVarN != null) {
                        k4eVarN.E();
                    }
                }
                if (zIsInEditMode) {
                    for (int i6 = 0; i6 < childCount3; i6++) {
                        View childAt = getChildAt(i6);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (this.m == null) {
                                    this.m = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf(Separators.SLASH);
                                this.m.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id = childAt.getId();
                            if (id != 0) {
                                View viewFindViewById = (View) this.f45351a.get(id);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                k4eVar = viewFindViewById == this ? l4eVar : viewFindViewById == null ? null : ((a3e) viewFindViewById.getLayoutParams()).p0;
                            }
                            k4eVar.k0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.l != -1) {
                    for (int i7 = 0; i7 < childCount3; i7++) {
                        getChildAt(i7).getId();
                    }
                }
                r3e r3eVar = this.j;
                if (r3eVar != null) {
                    r3eVar.c(this);
                }
                l4eVar.u0.clear();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                if (size > 0) {
                    for (int i8 = 0; i8 < size; i8++) {
                        ConstraintHelper constraintHelper = (ConstraintHelper) arrayList.get(i8);
                        HashMap map = constraintHelper.g;
                        if (constraintHelper.isInEditMode()) {
                            constraintHelper.setIds(constraintHelper.e);
                        }
                        jvv jvvVar = constraintHelper.d;
                        if (jvvVar != null) {
                            jvvVar.v0 = 0;
                            Arrays.fill(jvvVar.u0, (Object) null);
                            for (int i9 = 0; i9 < constraintHelper.b; i9++) {
                                int i10 = constraintHelper.f45350a[i9];
                                View viewM = m(i10);
                                if (viewM == null && (iG = constraintHelper.g(this, (str = (String) map.get(Integer.valueOf(i10))))) != 0) {
                                    constraintHelper.f45350a[i9] = iG;
                                    map.put(Integer.valueOf(iG), str);
                                    viewM = m(iG);
                                }
                                if (viewM != null) {
                                    constraintHelper.d.W(n(viewM));
                                }
                            }
                            constraintHelper.d.Y();
                        }
                    }
                }
                for (int i11 = 0; i11 < childCount3; i11++) {
                    getChildAt(i11);
                }
                SparseArray sparseArray = this.n;
                sparseArray.clear();
                sparseArray.put(0, l4eVar);
                sparseArray.put(getId(), l4eVar);
                for (int i12 = 0; i12 < childCount3; i12++) {
                    View childAt2 = getChildAt(i12);
                    sparseArray.put(childAt2.getId(), n(childAt2));
                }
                for (int i13 = 0; i13 < childCount3; i13++) {
                    View childAt3 = getChildAt(i13);
                    k4e k4eVarN2 = n(childAt3);
                    if (k4eVarN2 != null) {
                        a3e a3eVar = (a3e) childAt3.getLayoutParams();
                        l4eVar.W(k4eVarN2);
                        l(zIsInEditMode, childAt3, k4eVarN2, a3eVar, sparseArray);
                    }
                }
            }
            if (z) {
                l4eVar.v0.z(l4eVar);
            }
        }
        l4eVar.A0.getClass();
        s(l4eVar, this.i, i, i2);
        r(i, i2, l4eVar.s(), l4eVar.m(), l4eVar.I0, l4eVar.J0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        k4e k4eVarN = n(view);
        if ((view instanceof Guideline) && !(k4eVarN instanceof qiv)) {
            a3e a3eVar = (a3e) view.getLayoutParams();
            qiv qivVar = new qiv();
            a3eVar.p0 = qivVar;
            a3eVar.d0 = true;
            qivVar.X(a3eVar.V);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.m();
            ((a3e) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(constraintHelper)) {
                arrayList.add(constraintHelper);
            }
        }
        this.f45351a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f45351a.remove(view.getId());
        k4e k4eVarN = n(view);
        this.c.u0.remove(k4eVarN);
        k4eVarN.E();
        this.b.remove(view);
        this.h = true;
    }

    public final boolean p() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public void q(int i) {
        String str;
        Context context = getContext();
        x23 x23Var = new x23();
        x23Var.f40148a = -1;
        x23Var.b = -1;
        x23Var.d = new SparseArray();
        x23Var.e = new SparseArray();
        x23Var.c = this;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            h3e h3eVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                x23Var.f(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                h3e h3eVar2 = new h3e(context, xml);
                                ((SparseArray) x23Var.d).put(h3eVar2.f12380a, h3eVar2);
                                h3eVar = h3eVar2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                i3e i3eVar = new i3e(context, xml);
                                if (h3eVar != null) {
                                    h3eVar.b.add(i3eVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
        this.k = x23Var;
    }

    public final void r(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        g4c0 g4c0Var = this.o;
        int i5 = g4c0Var.d;
        int iResolveSizeAndState = View.resolveSizeAndState(i3 + g4c0Var.c, i, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.g, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00be  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x010a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0112  */
    public final void s(l4e l4eVar, int i, int i2, int i3) {
        int iMax;
        j4e j4eVar;
        int iMax2;
        int i4;
        int i5;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i6 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        g4c0 g4c0Var = this.o;
        g4c0Var.f10659a = iMax3;
        g4c0Var.b = iMax4;
        g4c0Var.c = paddingWidth;
        g4c0Var.d = i6;
        g4c0Var.e = i2;
        g4c0Var.f = i3;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if (p()) {
            iMax5 = iMax6;
        }
        int i7 = size - paddingWidth;
        int i8 = size2 - i6;
        int i9 = g4c0Var.d;
        int i10 = g4c0Var.c;
        int childCount = getChildCount();
        j4e j4eVar2 = j4e.b;
        j4e j4eVar3 = j4e.f15879a;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                iMax = mode != 1073741824 ? 0 : Math.min(this.f - i10, i7);
                j4eVar = j4eVar3;
            } else {
                iMax = childCount == 0 ? Math.max(0, this.d) : 0;
            }
            if (mode2 != Integer.MIN_VALUE) {
                if (mode2 != 0) {
                    if (mode2 != 1073741824) {
                        iMax2 = 0;
                    } else {
                        iMax2 = Math.min(this.g - i9, i8);
                    }
                    j4eVar2 = j4eVar3;
                } else if (childCount == 0) {
                    iMax2 = Math.max(0, this.e);
                } else {
                    iMax2 = 0;
                }
            } else if (childCount == 0) {
                iMax2 = Math.max(0, this.e);
            } else {
                iMax2 = i8;
            }
            if (iMax == l4eVar.s() || iMax2 != l4eVar.m()) {
                l4eVar.w0.c = true;
            }
            l4eVar.a0 = 0;
            l4eVar.b0 = 0;
            int i11 = this.f - i10;
            int[] iArr = l4eVar.D;
            iArr[0] = i11;
            iArr[1] = this.g - i9;
            l4eVar.d0 = 0;
            l4eVar.e0 = 0;
            l4eVar.P(j4eVar);
            l4eVar.T(iMax);
            l4eVar.R(j4eVar2);
            l4eVar.O(iMax2);
            i4 = this.d - i10;
            if (i4 < 0) {
                l4eVar.d0 = 0;
            } else {
                l4eVar.d0 = i4;
            }
            i5 = this.e - i9;
            if (i5 < 0) {
                l4eVar.e0 = 0;
            } else {
                l4eVar.e0 = i5;
            }
            l4eVar.b0(i, mode, i7, mode2, i8, iMax5, iMax3);
        }
        iMax = childCount == 0 ? Math.max(0, this.d) : i7;
        j4eVar = j4eVar2;
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    iMax2 = 0;
                } else {
                    iMax2 = Math.min(this.g - i9, i8);
                }
                j4eVar2 = j4eVar3;
            } else if (childCount == 0) {
                iMax2 = Math.max(0, this.e);
            } else {
                iMax2 = 0;
            }
        } else if (childCount == 0) {
            iMax2 = Math.max(0, this.e);
        } else {
            iMax2 = i8;
        }
        if (iMax == l4eVar.s()) {
            l4eVar.w0.c = true;
        } else {
            l4eVar.w0.c = true;
        }
        l4eVar.a0 = 0;
        l4eVar.b0 = 0;
        int i12 = this.f - i10;
        int[] iArr2 = l4eVar.D;
        iArr2[0] = i12;
        iArr2[1] = this.g - i9;
        l4eVar.d0 = 0;
        l4eVar.e0 = 0;
        l4eVar.P(j4eVar);
        l4eVar.T(iMax);
        l4eVar.R(j4eVar2);
        l4eVar.O(iMax2);
        i4 = this.d - i10;
        if (i4 < 0) {
            l4eVar.d0 = 0;
        } else {
            l4eVar.d0 = i4;
        }
        i5 = this.e - i9;
        if (i5 < 0) {
            l4eVar.e0 = 0;
        } else {
            l4eVar.e0 = i5;
        }
        l4eVar.b0(i, mode, i7, mode2, i8, iMax5, iMax3);
    }

    public void setConstraintSet(r3e r3eVar) {
        this.j = r3eVar;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f45351a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(q4e q4eVar) {
        x23 x23Var = this.k;
        if (x23Var != null) {
            x23Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        l4e l4eVar = this.c;
        l4eVar.H0 = i;
        p900.q = l4eVar.d0(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(k4e k4eVar, a3e a3eVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f45351a.get(i);
        k4e k4eVar2 = (k4e) sparseArray.get(i);
        if (k4eVar2 == null || view == null || !(view.getLayoutParams() instanceof a3e)) {
            return;
        }
        a3eVar.c0 = true;
        if (i2 == 6) {
            a3e a3eVar2 = (a3e) view.getLayoutParams();
            a3eVar2.c0 = true;
            a3eVar2.p0.F = true;
        }
        k4eVar.k(6).b(k4eVar2.k(i2), a3eVar.D, a3eVar.C, true);
        k4eVar.F = true;
        k4eVar.k(3).j();
        k4eVar.k(5).j();
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45351a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new l4e();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new g4c0(this, this);
        o(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45351a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new l4e();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new g4c0(this, this);
        o(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        a3e a3eVar = new a3e(layoutParams);
        a3eVar.f167a = -1;
        a3eVar.b = -1;
        a3eVar.c = -1.0f;
        a3eVar.d = true;
        a3eVar.e = -1;
        a3eVar.f = -1;
        a3eVar.g = -1;
        a3eVar.h = -1;
        a3eVar.i = -1;
        a3eVar.j = -1;
        a3eVar.k = -1;
        a3eVar.l = -1;
        a3eVar.m = -1;
        a3eVar.n = -1;
        a3eVar.o = -1;
        a3eVar.p = -1;
        a3eVar.q = 0;
        a3eVar.r = 0.0f;
        a3eVar.s = -1;
        a3eVar.t = -1;
        a3eVar.u = -1;
        a3eVar.v = -1;
        a3eVar.w = Integer.MIN_VALUE;
        a3eVar.x = Integer.MIN_VALUE;
        a3eVar.y = Integer.MIN_VALUE;
        a3eVar.z = Integer.MIN_VALUE;
        a3eVar.A = Integer.MIN_VALUE;
        a3eVar.B = Integer.MIN_VALUE;
        a3eVar.C = Integer.MIN_VALUE;
        a3eVar.D = 0;
        a3eVar.E = 0.5f;
        a3eVar.F = 0.5f;
        a3eVar.G = null;
        a3eVar.H = -1.0f;
        a3eVar.I = -1.0f;
        a3eVar.J = 0;
        a3eVar.K = 0;
        a3eVar.L = 0;
        a3eVar.M = 0;
        a3eVar.N = 0;
        a3eVar.O = 0;
        a3eVar.P = 0;
        a3eVar.Q = 0;
        a3eVar.R = 1.0f;
        a3eVar.S = 1.0f;
        a3eVar.T = -1;
        a3eVar.U = -1;
        a3eVar.V = -1;
        a3eVar.W = false;
        a3eVar.X = false;
        a3eVar.Y = null;
        a3eVar.Z = 0;
        a3eVar.a0 = true;
        a3eVar.b0 = true;
        a3eVar.c0 = false;
        a3eVar.d0 = false;
        a3eVar.e0 = false;
        a3eVar.f0 = -1;
        a3eVar.g0 = -1;
        a3eVar.h0 = -1;
        a3eVar.i0 = -1;
        a3eVar.j0 = Integer.MIN_VALUE;
        a3eVar.k0 = Integer.MIN_VALUE;
        a3eVar.l0 = 0.5f;
        a3eVar.p0 = new k4e();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) a3eVar).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) a3eVar).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) a3eVar).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) a3eVar).bottomMargin = marginLayoutParams.bottomMargin;
            a3eVar.setMarginStart(marginLayoutParams.getMarginStart());
            a3eVar.setMarginEnd(marginLayoutParams.getMarginEnd());
        }
        if (!(layoutParams instanceof a3e)) {
            return a3eVar;
        }
        a3e a3eVar2 = (a3e) layoutParams;
        a3eVar.f167a = a3eVar2.f167a;
        a3eVar.b = a3eVar2.b;
        a3eVar.c = a3eVar2.c;
        a3eVar.d = a3eVar2.d;
        a3eVar.e = a3eVar2.e;
        a3eVar.f = a3eVar2.f;
        a3eVar.g = a3eVar2.g;
        a3eVar.h = a3eVar2.h;
        a3eVar.i = a3eVar2.i;
        a3eVar.j = a3eVar2.j;
        a3eVar.k = a3eVar2.k;
        a3eVar.l = a3eVar2.l;
        a3eVar.m = a3eVar2.m;
        a3eVar.n = a3eVar2.n;
        a3eVar.o = a3eVar2.o;
        a3eVar.p = a3eVar2.p;
        a3eVar.q = a3eVar2.q;
        a3eVar.r = a3eVar2.r;
        a3eVar.s = a3eVar2.s;
        a3eVar.t = a3eVar2.t;
        a3eVar.u = a3eVar2.u;
        a3eVar.v = a3eVar2.v;
        a3eVar.w = a3eVar2.w;
        a3eVar.x = a3eVar2.x;
        a3eVar.y = a3eVar2.y;
        a3eVar.z = a3eVar2.z;
        a3eVar.A = a3eVar2.A;
        a3eVar.B = a3eVar2.B;
        a3eVar.C = a3eVar2.C;
        a3eVar.D = a3eVar2.D;
        a3eVar.E = a3eVar2.E;
        a3eVar.F = a3eVar2.F;
        a3eVar.G = a3eVar2.G;
        a3eVar.H = a3eVar2.H;
        a3eVar.I = a3eVar2.I;
        a3eVar.J = a3eVar2.J;
        a3eVar.K = a3eVar2.K;
        a3eVar.W = a3eVar2.W;
        a3eVar.X = a3eVar2.X;
        a3eVar.L = a3eVar2.L;
        a3eVar.M = a3eVar2.M;
        a3eVar.N = a3eVar2.N;
        a3eVar.P = a3eVar2.P;
        a3eVar.O = a3eVar2.O;
        a3eVar.Q = a3eVar2.Q;
        a3eVar.R = a3eVar2.R;
        a3eVar.S = a3eVar2.S;
        a3eVar.T = a3eVar2.T;
        a3eVar.U = a3eVar2.U;
        a3eVar.V = a3eVar2.V;
        a3eVar.a0 = a3eVar2.a0;
        a3eVar.b0 = a3eVar2.b0;
        a3eVar.c0 = a3eVar2.c0;
        a3eVar.d0 = a3eVar2.d0;
        a3eVar.f0 = a3eVar2.f0;
        a3eVar.g0 = a3eVar2.g0;
        a3eVar.h0 = a3eVar2.h0;
        a3eVar.i0 = a3eVar2.i0;
        a3eVar.j0 = a3eVar2.j0;
        a3eVar.k0 = a3eVar2.k0;
        a3eVar.l0 = a3eVar2.l0;
        a3eVar.Y = a3eVar2.Y;
        a3eVar.Z = a3eVar2.Z;
        a3eVar.p0 = a3eVar2.p0;
        return a3eVar;
    }
}
