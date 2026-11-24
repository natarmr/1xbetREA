package a;

import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ds40 {
    public gly[] A;
    public final View b;
    public final int c;
    public kpb[] j;
    public aw3 k;
    public int[] o;
    public double[] p;
    public double[] q;
    public String[] r;
    public int[] s;
    public HashMap x;
    public HashMap y;
    public HashMap z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f6594a = new Rect();
    public boolean d = false;
    public int e = -1;
    public final pt40 f = new pt40();
    public final pt40 g = new pt40();
    public final as40 h = new as40();
    public final as40 i = new as40();
    public float l = Float.NaN;
    public float m = 0.0f;
    public float n = 1.0f;
    public final float[] t = new float[4];
    public final ArrayList u = new ArrayList();
    public final float[] v = new float[1];
    public final ArrayList w = new ArrayList();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public ds40(View view) {
        this.b = view;
        this.c = view.getId();
        view.getLayoutParams();
    }

    public static void f(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final float a(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.n;
            if (f3 != 1.0d) {
                float f4 = this.m;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        fhn fhnVar = this.f.f27547a;
        float f5 = Float.NaN;
        for (pt40 pt40Var : this.u) {
            fhn fhnVar2 = pt40Var.f27547a;
            if (fhnVar2 != null) {
                float f6 = pt40Var.c;
                if (f6 < f) {
                    fhnVar = fhnVar2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = pt40Var.c;
                }
            }
        }
        if (fhnVar == null) {
            return f;
        }
        float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
        double d = (f - f2) / f7;
        float fD = (((float) fhnVar.d(d)) * f7) + f2;
        if (fArr != null) {
            fArr[0] = (float) fhnVar.e(d);
        }
        return fD;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r10v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r11v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v0 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v1 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v4 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v6 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v2 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v3 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r26v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: float
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r26v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: float[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r10v0 ??, new type: float
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final void b(double r24, float[] r26, float[] r27) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ds40.b(double, float[], float[]):void");
    }

    public final float c() {
        float[] fArr = new float[2];
        double d = 0.0d;
        double d2 = 0.0d;
        float fHypot = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f = i * 0.01010101f;
            double d3 = f;
            pt40 pt40Var = this.f;
            fhn fhnVar = pt40Var.f27547a;
            float f2 = Float.NaN;
            float f3 = 0.0f;
            for (pt40 pt40Var2 : this.u) {
                fhn fhnVar2 = pt40Var2.f27547a;
                pt40 pt40Var3 = pt40Var;
                if (fhnVar2 != null) {
                    float f4 = pt40Var2.c;
                    if (f4 < f) {
                        f3 = f4;
                        fhnVar = fhnVar2;
                    } else if (Float.isNaN(f2)) {
                        f2 = pt40Var2.c;
                    }
                }
                pt40Var = pt40Var3;
            }
            pt40 pt40Var4 = pt40Var;
            if (fhnVar != null) {
                if (Float.isNaN(f2)) {
                    f2 = 1.0f;
                }
                float f5 = f2 - f3;
                d3 = (((float) fhnVar.d((f - f3) / f5)) * f5) + f3;
            }
            this.j[0].P(d3, this.p);
            pt40Var4.c(d3, this.o, this.p, fArr, 0);
            if (i > 0) {
                fHypot += (float) Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0]));
            }
            d = fArr[0];
            d2 = fArr[1];
        }
        return fHypot;
    }

    public final boolean d(float f, long j, vjy vjyVar, View view) {
        boolean zD;
        View view2;
        boolean z;
        float f2;
        boolean z2;
        float f3;
        float f4;
        float f5;
        boolean z3;
        View view3 = view;
        plu0 plu0Var = null;
        float fA = a(f, null);
        int i = this.E;
        if (i != -1) {
            float f6 = 1.0f / i;
            float fFloor = ((float) Math.floor(fA / f6)) * f6;
            float f7 = (fA % f6) / f6;
            if (!Float.isNaN(this.F)) {
                f7 = (f7 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            fA = ((interpolator != null ? interpolator.getInterpolation(f7) : ((double) f7) > 0.5d ? 1.0f : 0.0f) * f6) + fFloor;
        }
        HashMap map = this.y;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((dlu0) it.next()).e(view3, fA);
            }
        }
        HashMap map2 = this.x;
        if (map2 != null) {
            plu0 plu0Var2 = null;
            zD = false;
            for (rlu0 rlu0Var : map2.values()) {
                if (rlu0Var instanceof plu0) {
                    plu0Var2 = (plu0) rlu0Var;
                } else {
                    zD |= rlu0Var.d(fA, j, vjyVar, view3);
                    view3 = view;
                }
            }
            plu0Var = plu0Var2;
        } else {
            zD = false;
        }
        kpb[] kpbVarArr = this.j;
        pt40 pt40Var = this.f;
        if (kpbVarArr != null) {
            double d = fA;
            kpbVarArr[0].P(d, this.p);
            this.j[0].W(d, this.q);
            aw3 aw3Var = this.k;
            if (aw3Var != null) {
                double[] dArr = this.p;
                f2 = 0.0f;
                if (dArr.length > 0) {
                    aw3Var.P(d, dArr);
                    this.k.W(d, this.q);
                }
            } else {
                f2 = 0.0f;
            }
            if (this.H) {
                view2 = view;
                z2 = zD;
                f3 = 2.0f;
            } else {
                int[] iArr = this.o;
                double[] dArr2 = this.p;
                f3 = 2.0f;
                double[] dArr3 = this.q;
                boolean z4 = this.d;
                float f8 = pt40Var.e;
                float f9 = pt40Var.f;
                float f10 = pt40Var.g;
                int i2 = 1;
                float f11 = pt40Var.h;
                if (iArr.length != 0) {
                    f4 = f10;
                    if (pt40Var.p.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        pt40Var.p = new double[i3];
                        pt40Var.q = new double[i3];
                    }
                } else {
                    f4 = f10;
                }
                Arrays.fill(pt40Var.p, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = pt40Var.p;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    pt40Var.q[i5] = dArr3[i4];
                }
                float f12 = Float.NaN;
                float f13 = f2;
                float f14 = f13;
                float f15 = f14;
                int i6 = 0;
                float f16 = f4;
                float f17 = f15;
                while (true) {
                    double[] dArr5 = pt40Var.p;
                    f5 = f11;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        z3 = zD;
                    } else {
                        float f18 = (float) (Double.isNaN(pt40Var.p[i6]) ? 0.0d : pt40Var.p[i6] + 0.0d);
                        z3 = zD;
                        float f19 = (float) pt40Var.q[i6];
                        if (i6 == i2) {
                            f8 = f18;
                            f13 = f19;
                        } else if (i6 == 2) {
                            f9 = f18;
                            f14 = f19;
                        } else if (i6 != 3) {
                            if (i6 == 4) {
                                f11 = f18;
                                f15 = f19;
                            } else if (i6 == 5) {
                                f12 = f18;
                            }
                            i6++;
                            zD = z3;
                            i2 = 1;
                        } else {
                            f16 = f18;
                            f17 = f19;
                        }
                    }
                    f11 = f5;
                    i6++;
                    zD = z3;
                    i2 = 1;
                }
                z2 = zD;
                ds40 ds40Var = pt40Var.m;
                if (ds40Var != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    ds40Var.b(d, fArr, fArr2);
                    float f20 = fArr[0];
                    float f21 = fArr[1];
                    float f22 = fArr2[0];
                    float f23 = fArr2[1];
                    double d2 = f8;
                    double d3 = f9;
                    float fSin = (float) (((Math.sin(d3) * d2) + ((double) f20)) - ((double) (f16 / 2.0f)));
                    float fCos = (float) ((((double) f21) - (Math.cos(d3) * d2)) - ((double) (f5 / 2.0f)));
                    double d4 = f13;
                    double d5 = f14;
                    float fCos2 = (float) ((Math.cos(d3) * d2 * d5) + (Math.sin(d3) * d4) + ((double) f22));
                    float fSin2 = (float) ((Math.sin(d3) * d2 * d5) + (((double) f23) - (Math.cos(d3) * d4)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (Float.isNaN(f12)) {
                        view2 = view;
                    } else {
                        double degrees = Math.toDegrees(Math.atan2(fSin2, fCos2));
                        view2 = view;
                        view2.setRotation((float) (degrees + ((double) f12)));
                    }
                    f8 = fSin;
                    f9 = fCos;
                } else {
                    view2 = view;
                    if (!Float.isNaN(f12)) {
                        view2.setRotation(f12 + ((float) Math.toDegrees(Math.atan2((f15 / 2.0f) + f14, (f17 / 2.0f) + f13))) + f2);
                    }
                }
                float f24 = f8 + 0.5f;
                int i7 = (int) f24;
                float f25 = f9 + 0.5f;
                int i8 = (int) f25;
                int i9 = (int) (f24 + f16);
                int i10 = (int) (f25 + f5);
                int i11 = i9 - i7;
                int i12 = i10 - i8;
                if (i11 != view2.getMeasuredWidth() || i12 != view2.getMeasuredHeight() || z4) {
                    view2.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                }
                view2.layout(i7, i8, i9, i10);
                this.d = false;
            }
            if (this.C != -1) {
                View viewFindViewById = this.D;
                if (viewFindViewById == null) {
                    viewFindViewById = ((View) view2.getParent()).findViewById(this.C);
                    this.D = viewFindViewById;
                }
                if (viewFindViewById != null) {
                    float bottom = (this.D.getBottom() + viewFindViewById.getTop()) / f3;
                    float right = (this.D.getRight() + this.D.getLeft()) / f3;
                    if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
                        float left = right - view2.getLeft();
                        float top = bottom - view2.getTop();
                        view2.setPivotX(left);
                        view2.setPivotY(top);
                    }
                }
            }
            HashMap map3 = this.y;
            if (map3 != null) {
                for (zzk0 zzk0Var : map3.values()) {
                    if (zzk0Var instanceof blu0) {
                        double[] dArr6 = this.q;
                        if (dArr6.length > 1) {
                            view2.setRotation(((blu0) zzk0Var).a(fA) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (plu0Var != 0) {
                double[] dArr7 = this.q;
                double d6 = dArr7[0];
                double d7 = dArr7[1];
                plu0 plu0Var3 = plu0Var;
                view2.setRotation(plu0Var3.b(fA, j, vjyVar, view2) + ((float) Math.toDegrees(Math.atan2(d7, d6))));
                z = z2 | plu0Var3.h;
            } else {
                z = z2;
            }
            int i13 = 1;
            while (true) {
                kpb[] kpbVarArr2 = this.j;
                if (i13 >= kpbVarArr2.length) {
                    break;
                }
                kpb kpbVar = kpbVarArr2[i13];
                float[] fArr3 = this.t;
                kpbVar.Q(d, fArr3);
                dyb.k0((x2e) pt40Var.n.get(this.r[i13 - 1]), view2, fArr3);
                i13++;
            }
            as40 as40Var = this.h;
            if (as40Var.b == 0) {
                if (fA <= f2) {
                    view2.setVisibility(as40Var.c);
                } else {
                    int i14 = this.i.c;
                    if (fA >= 1065353216) {
                        view2.setVisibility(i14);
                    } else if (i14 != as40Var.c) {
                        view2.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i15 = 0;
                while (true) {
                    gly[] glyVarArr = this.A;
                    if (i15 >= glyVarArr.length) {
                        break;
                    }
                    glyVarArr[i15].g(view2, fA);
                    i15++;
                }
            }
        } else {
            view2 = view;
            boolean z5 = zD;
            float f26 = pt40Var.e;
            pt40 pt40Var2 = this.g;
            float fA2 = rw2.a(pt40Var2.e, f26, fA, f26);
            float f27 = pt40Var.f;
            float fA3 = rw2.a(pt40Var2.f, f27, fA, f27);
            float f28 = pt40Var.g;
            float f29 = pt40Var2.g;
            float fA4 = rw2.a(f29, f28, fA, f28);
            float f30 = pt40Var.h;
            float f31 = pt40Var2.h;
            float f32 = fA2 + 0.5f;
            int i16 = (int) f32;
            float f33 = fA3 + 0.5f;
            int i17 = (int) f33;
            int i18 = (int) (f32 + fA4);
            int iA = (int) (f33 + rw2.a(f31, f30, fA, f30));
            int i19 = i18 - i16;
            int i20 = iA - i17;
            if (f29 != f28 || f31 != f30 || this.d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                this.d = false;
            }
            view2.layout(i16, i17, i18, iA);
            z = z5;
        }
        HashMap map4 = this.z;
        if (map4 != null) {
            for (eju0 eju0Var : map4.values()) {
                if (eju0Var instanceof cju0) {
                    double[] dArr8 = this.q;
                    view2.setRotation(((cju0) eju0Var).a(fA) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    eju0Var.f(view2, fA);
                }
            }
        }
        return z;
    }

    public final void e(pt40 pt40Var) {
        View view = this.b;
        pt40Var.d((int) view.getX(), (int) view.getY(), view.getWidth(), view.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:281:0x082c A[PHI: r1 r11 r12
  0x082c: PHI (r1v67 java.lang.String) = (r1v64 java.lang.String), (r1v65 java.lang.String), (r1v66 java.lang.String), (r1v69 java.lang.String) binds: [B:280:0x082a, B:276:0x07fd, B:271:0x07cb, B:267:0x07b8] A[DONT_GENERATE, DONT_INLINE]
  0x082c: PHI (r11v38 java.lang.String) = (r11v35 java.lang.String), (r11v36 java.lang.String), (r11v37 java.lang.String), (r11v40 java.lang.String) binds: [B:280:0x082a, B:276:0x07fd, B:271:0x07cb, B:267:0x07b8] A[DONT_GENERATE, DONT_INLINE]
  0x082c: PHI (r12v25 java.lang.String) = (r12v22 java.lang.String), (r12v23 java.lang.String), (r12v24 java.lang.String), (r12v27 java.lang.String) binds: [B:280:0x082a, B:276:0x07fd, B:271:0x07cb, B:267:0x07b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:383:0x0be3  */
    /* JADX WARN: Code duplicated, block: B:452:0x0d0e  */
    /* JADX WARN: Failed to find 'out' block for switch in B:434:0x0c91. Please report as an issue. */
    public final void g(int i, int i2, long j) {
        pt40 pt40Var;
        ArrayList arrayList;
        as40 as40Var;
        HashSet hashSet;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        HashSet hashSet2;
        HashSet<String> hashSet3;
        Object obj;
        Object obj2;
        String str6;
        pt40 pt40Var2;
        pt40 pt40Var3;
        ArrayList arrayList2;
        Object obj3;
        String str7;
        int i3;
        String str8;
        int i4;
        x2e x2eVar;
        HashSet hashSet4;
        String str9;
        HashMap map;
        Iterator it;
        String str10;
        Object obj4;
        Object obj5;
        byte b;
        byte b2;
        rlu0 nlu0Var;
        olu0 olu0Var;
        rlu0 rlu0Var;
        x2e x2eVar2;
        Integer num;
        HashSet hashSet5;
        String str11;
        String str12;
        String str13;
        String str14;
        HashSet hashSet6;
        String str15;
        ArrayList arrayList3;
        Object obj6;
        Iterator it2;
        String str16;
        HashSet hashSet7;
        Object obj7;
        pt40 pt40Var4;
        Object obj8;
        pt40 pt40Var5;
        Object obj9;
        byte b3;
        byte b4;
        byte b5;
        Object obj10;
        zzk0 zku0Var;
        x2e x2eVar3;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        float fMin;
        float fA;
        new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        HashSet hashSet10 = new HashSet();
        HashMap map2 = new HashMap();
        int i5 = this.B;
        pt40 pt40Var6 = this.f;
        if (i5 != -1) {
            pt40Var6.j = i5;
        }
        as40 as40Var2 = this.h;
        float f = as40Var2.e;
        as40 as40Var3 = this.i;
        if (as40.b(f, as40Var3.e)) {
            hashSet9.add("alpha");
        }
        String str22 = "elevation";
        if (as40.b(as40Var2.f, as40Var3.f)) {
            hashSet9.add("elevation");
        }
        int i6 = as40Var2.c;
        int i7 = as40Var3.c;
        if (i6 != i7 && as40Var2.b == 0 && (i6 == 0 || i7 == 0)) {
            hashSet9.add("alpha");
        }
        String str23 = "rotation";
        if (as40.b(as40Var2.g, as40Var3.g)) {
            hashSet9.add("rotation");
        }
        String str24 = "transitionPathRotate";
        if (!Float.isNaN(as40Var2.p) || !Float.isNaN(as40Var3.p)) {
            hashSet9.add("transitionPathRotate");
        }
        if (!Float.isNaN(as40Var2.q) || !Float.isNaN(as40Var3.q)) {
            hashSet9.add("progress");
        }
        if (as40.b(as40Var2.h, as40Var3.h)) {
            hashSet9.add("rotationX");
        }
        if (as40.b(as40Var2.f1376a, as40Var3.f1376a)) {
            hashSet9.add("rotationY");
        }
        Object obj11 = "rotationX";
        if (as40.b(as40Var2.k, as40Var3.k)) {
            hashSet9.add("transformPivotX");
        }
        if (as40.b(as40Var2.l, as40Var3.l)) {
            hashSet9.add("transformPivotY");
        }
        String str25 = "scaleX";
        if (as40.b(as40Var2.i, as40Var3.i)) {
            hashSet9.add("scaleX");
        }
        Object obj12 = "rotationY";
        String str26 = "scaleY";
        if (as40.b(as40Var2.j, as40Var3.j)) {
            hashSet9.add("scaleY");
        }
        Object obj13 = "progress";
        if (as40.b(as40Var2.m, as40Var3.m)) {
            hashSet9.add("translationX");
        }
        Object obj14 = "translationX";
        String str27 = "translationY";
        if (as40.b(as40Var2.n, as40Var3.n)) {
            hashSet9.add("translationY");
        }
        if (as40.b(as40Var2.o, as40Var3.o)) {
            hashSet9.add("translationZ");
        }
        ArrayList<rjy> arrayList4 = this.w;
        Iterator it3 = arrayList4.iterator();
        ArrayList arrayList5 = null;
        while (true) {
            boolean zHasNext = it3.hasNext();
            pt40Var = this.g;
            Iterator it4 = it3;
            arrayList = this.u;
            as40Var = as40Var3;
            if (!zHasNext) {
                break;
            }
            rjy rjyVar = (rjy) it4.next();
            String str28 = str27;
            if (rjyVar instanceof xky) {
                xky xkyVar = (xky) rjyVar;
                pt40 pt40Var7 = new pt40();
                str21 = str25;
                pt40Var7.b = 0;
                pt40Var7.i = Float.NaN;
                pt40Var7.j = -1;
                pt40Var7.k = -1;
                pt40Var7.l = Float.NaN;
                pt40Var7.m = null;
                pt40Var7.n = new LinkedHashMap();
                pt40Var7.o = 0;
                str17 = str26;
                pt40Var7.p = new double[18];
                pt40Var7.q = new double[18];
                if (pt40Var6.k != -1) {
                    float f2 = xkyVar.f30620a / 100.0f;
                    pt40Var7.c = f2;
                    pt40Var7.b = xkyVar.i;
                    pt40Var7.o = xkyVar.n;
                    float f3 = Float.isNaN(xkyVar.j) ? f2 : xkyVar.j;
                    str19 = str23;
                    float f4 = Float.isNaN(xkyVar.k) ? f2 : xkyVar.k;
                    str18 = str22;
                    float f5 = pt40Var.g;
                    float f6 = pt40Var6.g;
                    float f7 = f5 - f6;
                    float f8 = pt40Var.h;
                    float f9 = pt40Var6.h;
                    pt40Var7.d = pt40Var7.c;
                    pt40Var7.g = (int) ((f7 * f3) + f6);
                    pt40Var7.h = (int) (((f8 - f9) * f4) + f9);
                    int i8 = xkyVar.n;
                    str20 = str24;
                    float f10 = xkyVar.l;
                    if (i8 != 2) {
                        float f11 = Float.isNaN(f10) ? f2 : xkyVar.l;
                        float f12 = pt40Var.e;
                        float f13 = pt40Var6.e;
                        pt40Var7.e = rw2.a(f12, f13, f11, f13);
                        if (!Float.isNaN(xkyVar.m)) {
                            f2 = xkyVar.m;
                        }
                        float f14 = pt40Var.f;
                        float f15 = pt40Var6.f;
                        pt40Var7.f = rw2.a(f14, f15, f2, f15);
                    } else {
                        if (Float.isNaN(f10)) {
                            float f16 = pt40Var.e;
                            float f17 = pt40Var6.e;
                            fMin = rw2.a(f16, f17, f2, f17);
                        } else {
                            fMin = xkyVar.l * Math.min(f4, f3);
                        }
                        pt40Var7.e = fMin;
                        if (Float.isNaN(xkyVar.m)) {
                            float f18 = pt40Var.f;
                            float f19 = pt40Var6.f;
                            fA = rw2.a(f18, f19, f2, f19);
                        } else {
                            fA = xkyVar.m;
                        }
                        pt40Var7.f = fA;
                    }
                    pt40Var7.k = pt40Var6.k;
                    pt40Var7.f27547a = fhn.f(xkyVar.g);
                    pt40Var7.j = xkyVar.h;
                } else {
                    str18 = str22;
                    str19 = str23;
                    str20 = str24;
                    int i9 = xkyVar.n;
                    int i10 = xkyVar.f30620a;
                    if (i9 == 1) {
                        float f20 = i10 / 100.0f;
                        pt40Var7.c = f20;
                        pt40Var7.b = xkyVar.i;
                        float f21 = Float.isNaN(xkyVar.j) ? f20 : xkyVar.j;
                        float f22 = Float.isNaN(xkyVar.k) ? f20 : xkyVar.k;
                        float f23 = pt40Var.g - pt40Var6.g;
                        float f24 = f20;
                        float f25 = pt40Var.h - pt40Var6.h;
                        pt40Var7.d = pt40Var7.c;
                        if (!Float.isNaN(xkyVar.l)) {
                            f24 = xkyVar.l;
                        }
                        float f26 = pt40Var6.e;
                        float f27 = pt40Var6.g;
                        float f28 = (f27 / 2.0f) + f26;
                        float f29 = pt40Var6.f;
                        float f30 = pt40Var6.h;
                        float f31 = (f30 / 2.0f) + f29;
                        float f32 = ((pt40Var.g / 2.0f) + pt40Var.e) - f28;
                        float f33 = ((pt40Var.h / 2.0f) + pt40Var.f) - f31;
                        float f34 = f32 * f24;
                        float f35 = f23 * f21;
                        float f36 = f35 / 2.0f;
                        pt40Var7.e = (int) ((f26 + f34) - f36);
                        float f37 = f24 * f33;
                        float f38 = f25 * f22;
                        float f39 = f38 / 2.0f;
                        pt40Var7.f = (int) ((f29 + f37) - f39);
                        pt40Var7.g = (int) (f27 + f35);
                        pt40Var7.h = (int) (f30 + f38);
                        float f40 = Float.isNaN(xkyVar.m) ? 0.0f : xkyVar.m;
                        pt40Var7.o = 1;
                        float f41 = (int) ((pt40Var6.e + f34) - f36);
                        float f42 = (int) ((pt40Var6.f + f37) - f39);
                        pt40Var7.e = f41 + ((-f33) * f40);
                        pt40Var7.f = f42 + (f32 * f40);
                        pt40Var7.k = pt40Var7.k;
                        pt40Var7.f27547a = fhn.f(xkyVar.g);
                        pt40Var7.j = xkyVar.h;
                    } else if (i9 == 2) {
                        float f43 = i10 / 100.0f;
                        pt40Var7.c = f43;
                        pt40Var7.b = xkyVar.i;
                        float f44 = Float.isNaN(xkyVar.j) ? f43 : xkyVar.j;
                        float f45 = Float.isNaN(xkyVar.k) ? f43 : xkyVar.k;
                        float f46 = pt40Var.g;
                        float f47 = pt40Var6.g;
                        float f48 = f46 - f47;
                        float f49 = pt40Var.h;
                        float f50 = pt40Var6.h;
                        float f51 = f49 - f50;
                        pt40Var7.d = pt40Var7.c;
                        float f52 = pt40Var6.e;
                        float f53 = (f47 / 2.0f) + f52;
                        float f54 = pt40Var6.f;
                        float f55 = (f46 / 2.0f) + pt40Var.e;
                        float f56 = ((f49 / 2.0f) + pt40Var.f) - ((f50 / 2.0f) + f54);
                        float f57 = f48 * f44;
                        pt40Var7.e = (int) ((((f55 - f53) * f43) + f52) - (f57 / 2.0f));
                        float f58 = f51 * f45;
                        pt40Var7.f = (int) (((f56 * f43) + f54) - (f58 / 2.0f));
                        pt40Var7.g = (int) (f47 + f57);
                        pt40Var7.h = (int) (f50 + f58);
                        pt40Var7.o = 2;
                        if (!Float.isNaN(xkyVar.l)) {
                            pt40Var7.e = (int) (xkyVar.l * (i - ((int) pt40Var7.g)));
                        }
                        if (!Float.isNaN(xkyVar.m)) {
                            pt40Var7.f = (int) (xkyVar.m * (i2 - ((int) pt40Var7.h)));
                        }
                        pt40Var7.k = pt40Var7.k;
                        pt40Var7.f27547a = fhn.f(xkyVar.g);
                        pt40Var7.j = xkyVar.h;
                    } else if (i9 != 3) {
                        float f59 = i10 / 100.0f;
                        pt40Var7.c = f59;
                        pt40Var7.b = xkyVar.i;
                        float f60 = Float.isNaN(xkyVar.j) ? f59 : xkyVar.j;
                        float f61 = Float.isNaN(xkyVar.k) ? f59 : xkyVar.k;
                        float f62 = pt40Var.g;
                        float f63 = pt40Var6.g;
                        float f64 = f62 - f63;
                        float f65 = f59;
                        float f66 = pt40Var.h;
                        float f67 = pt40Var6.h;
                        float f68 = f66 - f67;
                        pt40Var7.d = pt40Var7.c;
                        float f69 = pt40Var6.e;
                        float f70 = (f63 / 2.0f) + f69;
                        float f71 = pt40Var6.f;
                        float f72 = ((f62 / 2.0f) + pt40Var.e) - f70;
                        float f73 = ((f66 / 2.0f) + pt40Var.f) - ((f67 / 2.0f) + f71);
                        float f74 = f64 * f60;
                        float f75 = f74 / 2.0f;
                        pt40Var7.e = (int) (((f72 * f65) + f69) - f75);
                        float f76 = f68 * f61;
                        float f77 = f76 / 2.0f;
                        pt40Var7.f = (int) (((f73 * f65) + f71) - f77);
                        pt40Var7.g = (int) (f63 + f74);
                        pt40Var7.h = (int) (f67 + f76);
                        float f78 = Float.isNaN(xkyVar.l) ? f65 : xkyVar.l;
                        float f79 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                        float f80 = f78;
                        if (!Float.isNaN(xkyVar.m)) {
                            f65 = xkyVar.m;
                        }
                        float f81 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                        pt40Var7.o = 0;
                        pt40Var7.e = (int) (((f81 * f73) + ((f80 * f72) + pt40Var6.e)) - f75);
                        pt40Var7.f = (int) (((f73 * f65) + ((f72 * f79) + pt40Var6.f)) - f77);
                        pt40Var7.f27547a = fhn.f(xkyVar.g);
                        pt40Var7.j = xkyVar.h;
                    } else {
                        float f82 = i10 / 100.0f;
                        pt40Var7.c = f82;
                        pt40Var7.b = xkyVar.i;
                        float f83 = Float.isNaN(xkyVar.j) ? f82 : xkyVar.j;
                        float f84 = Float.isNaN(xkyVar.k) ? f82 : xkyVar.k;
                        float f85 = pt40Var.g;
                        float f86 = pt40Var6.g;
                        float f87 = f85 - f86;
                        float f88 = pt40Var.h;
                        float f89 = pt40Var6.h;
                        float f90 = f88 - f89;
                        pt40Var7.d = pt40Var7.c;
                        float f91 = pt40Var6.e;
                        float f92 = (f86 / 2.0f) + f91;
                        float f93 = pt40Var6.f;
                        float f94 = (f89 / 2.0f) + f93;
                        float f95 = (f85 / 2.0f) + pt40Var.e;
                        float f96 = (f88 / 2.0f) + pt40Var.f;
                        if (f92 > f95) {
                            f92 = f95;
                            f95 = f92;
                        }
                        if (f94 <= f96) {
                            f94 = f96;
                            f96 = f94;
                        }
                        float f97 = f95 - f92;
                        float f98 = f94 - f96;
                        float f99 = f87 * f83;
                        float f100 = f99 / 2.0f;
                        pt40Var7.e = (int) (((f97 * f82) + f91) - f100);
                        float f101 = f90 * f84;
                        float f102 = f101 / 2.0f;
                        pt40Var7.f = (int) (((f98 * f82) + f93) - f102);
                        pt40Var7.g = (int) (f86 + f99);
                        pt40Var7.h = (int) (f89 + f101);
                        float f103 = Float.isNaN(xkyVar.l) ? f82 : xkyVar.l;
                        float f104 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                        float f105 = Float.isNaN(xkyVar.m) ? f82 : xkyVar.m;
                        float f106 = Float.isNaN(Float.NaN) ? 0.0f : Float.NaN;
                        pt40Var7.o = 0;
                        pt40Var7.e = (int) (((f106 * f98) + ((f103 * f97) + pt40Var6.e)) - f100);
                        pt40Var7.f = (int) (((f98 * f105) + ((f97 * f104) + pt40Var6.f)) - f102);
                        pt40Var7.f27547a = fhn.f(xkyVar.g);
                        pt40Var7.j = xkyVar.h;
                    }
                }
                int iBinarySearch = Collections.binarySearch(arrayList, pt40Var7);
                if (iBinarySearch == 0) {
                    Log.e("MotionController", " KeyPath position \"" + pt40Var7.d + "\" outside of range");
                }
                arrayList.add((-iBinarySearch) - 1, pt40Var7);
                int i11 = xkyVar.f;
                if (i11 != -1) {
                    this.e = i11;
                }
            } else {
                str17 = str26;
                str18 = str22;
                str19 = str23;
                str20 = str24;
                str21 = str25;
                if (rjyVar instanceof yjy) {
                    rjyVar.d(hashSet10);
                } else {
                    if (rjyVar instanceof ely) {
                        rjyVar.d(hashSet8);
                    } else if (rjyVar instanceof gly) {
                        ArrayList arrayList6 = arrayList5;
                        ArrayList arrayList7 = arrayList6 == null ? new ArrayList() : arrayList6;
                        arrayList7.add((gly) rjyVar);
                        arrayList5 = arrayList7;
                    } else {
                        rjyVar.f(map2);
                        rjyVar.d(hashSet9);
                        arrayList5 = arrayList5;
                    }
                    str27 = str28;
                    it3 = it4;
                    as40Var3 = as40Var;
                    str25 = str21;
                    str26 = str17;
                    str23 = str19;
                    str22 = str18;
                    str24 = str20;
                }
            }
            arrayList5 = arrayList5;
            str27 = str28;
            it3 = it4;
            as40Var3 = as40Var;
            str25 = str21;
            str26 = str17;
            str23 = str19;
            str22 = str18;
            str24 = str20;
        }
        String str29 = str26;
        String str30 = str22;
        String str31 = str23;
        String str32 = str24;
        String str33 = str27;
        String str34 = str25;
        ArrayList arrayList8 = arrayList5;
        if (arrayList8 != null) {
            this.A = (gly[]) arrayList8.toArray(new gly[0]);
        }
        String str35 = "CUSTOM,";
        if (hashSet9.isEmpty()) {
            hashSet = hashSet8;
            str = str33;
            str2 = str29;
            str3 = str31;
            str4 = str30;
            str5 = str32;
            hashSet2 = hashSet9;
            hashSet3 = hashSet10;
            obj = obj12;
            obj2 = obj14;
            str6 = str34;
            pt40Var2 = pt40Var;
            pt40Var3 = pt40Var6;
            arrayList2 = arrayList;
            obj3 = obj13;
        } else {
            this.y = new HashMap();
            Iterator it5 = hashSet9.iterator();
            while (it5.hasNext()) {
                String str36 = (String) it5.next();
                if (!str36.startsWith("CUSTOM,")) {
                    hashSet5 = hashSet8;
                    switch (str36.hashCode()) {
                        case -1249320806:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            pt40Var4 = pt40Var6;
                            obj8 = obj12;
                            pt40Var5 = pt40Var;
                            obj9 = obj11;
                            b3 = str36.equals(obj9) ? (byte) 0 : (byte) -1;
                            break;
                        case -1249320805:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            pt40Var4 = pt40Var6;
                            obj8 = obj12;
                            if (str36.equals(obj8)) {
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                                b3 = 1;
                            } else {
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                            }
                            break;
                        case -1225497657:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            if (str36.equals(obj7)) {
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                                b3 = 2;
                            } else {
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                            }
                            break;
                        case -1225497656:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            if (str36.equals(str16)) {
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                                b3 = 3;
                            } else {
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                            }
                            break;
                        case -1225497655:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            if (str36.equals("translationZ")) {
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                                b3 = 4;
                            } else {
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                            }
                            break;
                        case -1001078227:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            if (str36.equals(obj6)) {
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                                b3 = 5;
                            } else {
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                            }
                            break;
                        case -908189618:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            if (str36.equals(str15)) {
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                                b3 = 6;
                            } else {
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                            }
                            break;
                        case -908189617:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            if (str36.equals(str11)) {
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                                b3 = 7;
                            } else {
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                            }
                            break;
                        case -797520672:
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            if (str36.equals("waveVariesBy")) {
                                str11 = str29;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                                b3 = 8;
                            } else {
                                str11 = str29;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                            }
                            break;
                        case -760884510:
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            if (str36.equals("transformPivotX")) {
                                str11 = str29;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                                b3 = 9;
                            } else {
                                str11 = str29;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                            }
                            break;
                        case -760884509:
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            if (str36.equals("transformPivotY")) {
                                b4 = 10;
                                String str37 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                                b3 = b4;
                                str11 = str29;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str37;
                            }
                            str11 = str29;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            pt40Var4 = pt40Var6;
                            obj8 = obj12;
                            pt40Var5 = pt40Var;
                            obj9 = obj11;
                            break;
                        case -40300674:
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            if (str36.equals(str12)) {
                                b4 = 11;
                                String str38 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                                b3 = b4;
                                str11 = str29;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str38;
                            }
                            str11 = str29;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            pt40Var4 = pt40Var6;
                            obj8 = obj12;
                            pt40Var5 = pt40Var;
                            obj9 = obj11;
                            break;
                        case -4379043:
                            str13 = str30;
                            str14 = str32;
                            if (str36.equals(str13)) {
                                str11 = str29;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                                b3 = 12;
                                str12 = str31;
                            } else {
                                str11 = str29;
                                str12 = str31;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                            }
                            break;
                        case 37232917:
                            str14 = str32;
                            if (str36.equals(str14)) {
                                str11 = str29;
                                str12 = str31;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                                b3 = 13;
                                str13 = str30;
                            } else {
                                str11 = str29;
                                str12 = str31;
                                str13 = str30;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                            }
                            break;
                        case 92909918:
                            if (str36.equals("alpha")) {
                                b5 = 14;
                                str11 = str29;
                                str12 = str31;
                                str13 = str30;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                                b3 = b5;
                                str14 = str32;
                            }
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            pt40Var4 = pt40Var6;
                            obj8 = obj12;
                            pt40Var5 = pt40Var;
                            obj9 = obj11;
                            break;
                        case 156108012:
                            if (str36.equals("waveOffset")) {
                                b5 = 15;
                                str11 = str29;
                                str12 = str31;
                                str13 = str30;
                                hashSet6 = hashSet10;
                                str15 = str34;
                                arrayList3 = arrayList;
                                obj6 = obj13;
                                it2 = it5;
                                str16 = str33;
                                hashSet7 = hashSet9;
                                obj7 = obj14;
                                pt40Var4 = pt40Var6;
                                obj8 = obj12;
                                pt40Var5 = pt40Var;
                                obj9 = obj11;
                                b3 = b5;
                                str14 = str32;
                            }
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            pt40Var4 = pt40Var6;
                            obj8 = obj12;
                            pt40Var5 = pt40Var;
                            obj9 = obj11;
                            break;
                        default:
                            str11 = str29;
                            str12 = str31;
                            str13 = str30;
                            str14 = str32;
                            hashSet6 = hashSet10;
                            str15 = str34;
                            arrayList3 = arrayList;
                            obj6 = obj13;
                            it2 = it5;
                            str16 = str33;
                            hashSet7 = hashSet9;
                            obj7 = obj14;
                            pt40Var4 = pt40Var6;
                            obj8 = obj12;
                            pt40Var5 = pt40Var;
                            obj9 = obj11;
                            break;
                    }
                    switch (b3) {
                        case 0:
                            obj11 = obj9;
                            obj10 = obj8;
                            zku0Var = new zku0((byte) 5);
                            break;
                        case 1:
                            obj11 = obj9;
                            obj10 = obj8;
                            zku0Var = new zku0((byte) 6);
                            break;
                        case 2:
                            obj11 = obj9;
                            obj10 = obj8;
                            zku0Var = new zku0((byte) 9);
                            break;
                        case 3:
                            obj11 = obj9;
                            obj10 = obj8;
                            zku0Var = new zku0((byte) 10);
                            break;
                        case 4:
                            obj11 = obj9;
                            obj10 = obj8;
                            zku0Var = new zku0((byte) 11);
                            break;
                        case 5:
                            obj11 = obj9;
                            obj10 = obj8;
                            clu0 clu0Var = new clu0();
                            clu0Var.f = false;
                            zku0Var = clu0Var;
                            break;
                        case 6:
                            obj11 = obj9;
                            obj10 = obj8;
                            zku0Var = new zku0((byte) 7);
                            break;
                        case 7:
                            obj11 = obj9;
                            obj10 = obj8;
                            zku0Var = new zku0((byte) 8);
                            break;
                        case 8:
                            obj11 = obj9;
                            obj10 = obj8;
                            zku0Var = new zku0((byte) 0);
                            break;
                        case 9:
                            obj11 = obj9;
                            obj10 = obj8;
                            zku0Var = new zku0((byte) 2);
                            break;
                        case 10:
                            obj11 = obj9;
                            obj10 = obj8;
                            zku0Var = new zku0((byte) 3);
                            break;
                        case 11:
                            obj11 = obj9;
                            obj10 = obj8;
                            zku0Var = new zku0((byte) 4);
                            break;
                        case 12:
                            obj11 = obj9;
                            obj10 = obj8;
                            zku0Var = new zku0((byte) 1);
                            break;
                        case 13:
                            obj11 = obj9;
                            obj10 = obj8;
                            zku0Var = new blu0();
                            break;
                        case 14:
                            obj11 = obj9;
                            obj10 = obj8;
                            zku0Var = new zku0((byte) 0);
                            break;
                        case 15:
                            obj11 = obj9;
                            obj10 = obj8;
                            zku0Var = new zku0((byte) 0);
                            break;
                        default:
                            obj11 = obj9;
                            obj10 = obj8;
                            zku0Var = null;
                            break;
                    }
                } else {
                    SparseArray sparseArray = new SparseArray();
                    String str39 = str36.split(Separators.COMMA)[1];
                    for (rjy rjyVar2 : arrayList4) {
                        HashSet hashSet11 = hashSet8;
                        HashMap map3 = rjyVar2.e;
                        if (map3 != null && (x2eVar3 = (x2e) map3.get(str39)) != null) {
                            sparseArray.append(rjyVar2.f30620a, x2eVar3);
                        }
                        hashSet8 = hashSet11;
                    }
                    hashSet5 = hashSet8;
                    alu0 alu0Var = new alu0();
                    String str40 = str36.split(Separators.COMMA)[1];
                    alu0Var.f = sparseArray;
                    str11 = str29;
                    str12 = str31;
                    str13 = str30;
                    hashSet6 = hashSet10;
                    obj10 = obj12;
                    str15 = str34;
                    pt40Var5 = pt40Var;
                    arrayList3 = arrayList;
                    obj6 = obj13;
                    zku0Var = alu0Var;
                    it2 = it5;
                    str16 = str33;
                    str14 = str32;
                    hashSet7 = hashSet9;
                    obj7 = obj14;
                    pt40Var4 = pt40Var6;
                }
                if (zku0Var != null) {
                    zku0Var.e = str36;
                    this.y.put(str36, zku0Var);
                }
                str32 = str14;
                str30 = str13;
                pt40Var = pt40Var5;
                pt40Var6 = pt40Var4;
                obj12 = obj10;
                hashSet8 = hashSet5;
                obj14 = obj7;
                str31 = str12;
                hashSet9 = hashSet7;
                str33 = str16;
                it5 = it2;
                obj13 = obj6;
                arrayList = arrayList3;
                str34 = str15;
                hashSet10 = hashSet6;
                str29 = str11;
            }
            hashSet = hashSet8;
            str = str33;
            str2 = str29;
            str3 = str31;
            str4 = str30;
            str5 = str32;
            hashSet2 = hashSet9;
            hashSet3 = hashSet10;
            obj = obj12;
            obj2 = obj14;
            str6 = str34;
            pt40Var2 = pt40Var;
            pt40Var3 = pt40Var6;
            arrayList2 = arrayList;
            obj3 = obj13;
            for (rjy rjyVar3 : arrayList4) {
                if (rjyVar3 instanceof ujy) {
                    rjyVar3.a(this.y);
                }
            }
            as40Var2.a(this.y, 0);
            as40Var.a(this.y, 100);
            Iterator it6 = this.y.keySet().iterator();
            while (it6.hasNext()) {
                String str41 = (String) it6.next();
                int iIntValue = (!map2.containsKey(str41) || (num = (Integer) map2.get(str41)) == null) ? 0 : num.intValue();
                Iterator it7 = it6;
                zzk0 zzk0Var = (zzk0) this.y.get(str41);
                if (zzk0Var != null) {
                    zzk0Var.d(iIntValue);
                }
                it6 = it7;
            }
        }
        if (hashSet.isEmpty()) {
            str7 = "CUSTOM,";
        } else {
            if (this.x == null) {
                this.x = new HashMap();
            }
            Iterator it8 = hashSet.iterator();
            while (it8.hasNext()) {
                String str42 = (String) it8.next();
                if (!this.x.containsKey(str42)) {
                    if (str42.startsWith(str35)) {
                        SparseArray sparseArray2 = new SparseArray();
                        it = it8;
                        String str43 = str42.split(Separators.COMMA)[1];
                        for (rjy rjyVar4 : arrayList4) {
                            String str44 = str35;
                            HashMap map4 = map2;
                            HashMap map5 = rjyVar4.e;
                            if (map5 != null && (x2eVar2 = (x2e) map5.get(str43)) != null) {
                                sparseArray2.append(rjyVar4.f30620a, x2eVar2);
                            }
                            map2 = map4;
                            str35 = str44;
                        }
                        map = map2;
                        str10 = str35;
                        olu0 olu0Var2 = new olu0();
                        olu0Var2.m = new SparseArray();
                        olu0Var2.k = str42.split(Separators.COMMA)[1];
                        olu0Var2.l = sparseArray2;
                        olu0Var = olu0Var2;
                        obj4 = obj11;
                        obj5 = obj;
                    } else {
                        map = map2;
                        it = it8;
                        str10 = str35;
                        switch (str42.hashCode()) {
                            case -1249320806:
                                obj4 = obj11;
                                obj5 = obj;
                                b = str42.equals(obj4) ? (byte) 0 : (byte) -1;
                                break;
                            case -1249320805:
                                obj5 = obj;
                                if (str42.equals(obj5)) {
                                    obj4 = obj11;
                                    b = 1;
                                } else {
                                    obj4 = obj11;
                                }
                                break;
                            case -1225497657:
                                if (str42.equals(obj2)) {
                                    obj4 = obj11;
                                    obj5 = obj;
                                    b = 2;
                                } else {
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                break;
                            case -1225497656:
                                if (str42.equals(str)) {
                                    obj4 = obj11;
                                    obj5 = obj;
                                    b = 3;
                                } else {
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                break;
                            case -1225497655:
                                if (str42.equals("translationZ")) {
                                    obj4 = obj11;
                                    obj5 = obj;
                                    b = 4;
                                } else {
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                break;
                            case -1001078227:
                                if (str42.equals(obj3)) {
                                    obj4 = obj11;
                                    obj5 = obj;
                                    b = 5;
                                } else {
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                break;
                            case -908189618:
                                if (str42.equals(str6)) {
                                    obj4 = obj11;
                                    obj5 = obj;
                                    b = 6;
                                } else {
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                break;
                            case -908189617:
                                if (str42.equals(str2)) {
                                    obj4 = obj11;
                                    obj5 = obj;
                                    b = 7;
                                } else {
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                break;
                            case -40300674:
                                if (str42.equals(str3)) {
                                    obj4 = obj11;
                                    obj5 = obj;
                                    b = 8;
                                } else {
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                break;
                            case -4379043:
                                if (str42.equals(str4)) {
                                    obj4 = obj11;
                                    obj5 = obj;
                                    b = 9;
                                } else {
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                break;
                            case 37232917:
                                if (str42.equals(str5)) {
                                    b2 = 10;
                                    b = b2;
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                obj4 = obj11;
                                obj5 = obj;
                                break;
                            case 92909918:
                                if (str42.equals("alpha")) {
                                    b2 = 11;
                                    b = b2;
                                    obj4 = obj11;
                                    obj5 = obj;
                                }
                                obj4 = obj11;
                                obj5 = obj;
                                break;
                            default:
                                obj4 = obj11;
                                obj5 = obj;
                                break;
                        }
                        switch (b) {
                            case 0:
                                nlu0Var = new nlu0((byte) 3);
                                str5 = str5;
                                obj2 = obj2;
                                nlu0Var.i = j;
                                rlu0Var = nlu0Var;
                                break;
                            case 1:
                                nlu0Var = new nlu0((byte) 4);
                                str5 = str5;
                                obj2 = obj2;
                                nlu0Var.i = j;
                                rlu0Var = nlu0Var;
                                break;
                            case 2:
                                nlu0Var = new nlu0((byte) 7);
                                str5 = str5;
                                obj2 = obj2;
                                nlu0Var.i = j;
                                rlu0Var = nlu0Var;
                                break;
                            case 3:
                                nlu0Var = new nlu0((byte) 8);
                                str5 = str5;
                                obj2 = obj2;
                                nlu0Var.i = j;
                                rlu0Var = nlu0Var;
                                break;
                            case 4:
                                nlu0Var = new nlu0((byte) 9);
                                str5 = str5;
                                obj2 = obj2;
                                nlu0Var.i = j;
                                rlu0Var = nlu0Var;
                                break;
                            case 5:
                                qlu0 qlu0Var = new qlu0();
                                qlu0Var.k = false;
                                nlu0Var = qlu0Var;
                                str5 = str5;
                                obj2 = obj2;
                                nlu0Var.i = j;
                                rlu0Var = nlu0Var;
                                break;
                            case 6:
                                nlu0Var = new nlu0((byte) 5);
                                str5 = str5;
                                obj2 = obj2;
                                nlu0Var.i = j;
                                rlu0Var = nlu0Var;
                                break;
                            case 7:
                                nlu0Var = new nlu0((byte) 6);
                                str5 = str5;
                                obj2 = obj2;
                                nlu0Var.i = j;
                                rlu0Var = nlu0Var;
                                break;
                            case 8:
                                nlu0Var = new nlu0((byte) 2);
                                str5 = str5;
                                obj2 = obj2;
                                nlu0Var.i = j;
                                rlu0Var = nlu0Var;
                                break;
                            case 9:
                                nlu0Var = new nlu0((byte) 1);
                                str5 = str5;
                                obj2 = obj2;
                                nlu0Var.i = j;
                                rlu0Var = nlu0Var;
                                break;
                            case 10:
                                nlu0Var = new plu0();
                                str5 = str5;
                                obj2 = obj2;
                                nlu0Var.i = j;
                                rlu0Var = nlu0Var;
                                break;
                            case 11:
                                nlu0Var = new nlu0((byte) 0);
                                str5 = str5;
                                obj2 = obj2;
                                nlu0Var.i = j;
                                rlu0Var = nlu0Var;
                                break;
                            default:
                                olu0Var = null;
                                break;
                        }
                        if (rlu0Var != null) {
                            rlu0Var.f = str42;
                            this.x.put(str42, rlu0Var);
                        }
                        obj = obj5;
                        obj11 = obj4;
                        obj2 = obj2;
                        it8 = it;
                        map2 = map;
                        str35 = str10;
                        str5 = str5;
                    }
                    rlu0Var = olu0Var;
                    if (rlu0Var != null) {
                        rlu0Var.f = str42;
                        this.x.put(str42, rlu0Var);
                    }
                    obj = obj5;
                    obj11 = obj4;
                    obj2 = obj2;
                    it8 = it;
                    map2 = map;
                    str35 = str10;
                    str5 = str5;
                }
            }
            HashMap map6 = map2;
            str7 = str35;
            for (rjy rjyVar5 : arrayList4) {
                if (rjyVar5 instanceof ely) {
                    ((ely) rjyVar5).g(this.x);
                }
            }
            for (String str45 : this.x.keySet()) {
                HashMap map7 = map6;
                ((rlu0) this.x.get(str45)).e(map7.containsKey(str45) ? ((Integer) map7.get(str45)).intValue() : 0);
                map6 = map7;
            }
        }
        int size = arrayList2.size();
        int i12 = size + 2;
        pt40[] pt40VarArr = new pt40[i12];
        pt40VarArr[0] = pt40Var3;
        pt40VarArr[size + 1] = pt40Var2;
        if (arrayList2.size() > 0 && this.e == -1) {
            this.e = 0;
        }
        Iterator it9 = arrayList2.iterator();
        int i13 = 1;
        while (it9.hasNext()) {
            pt40VarArr[i13] = (pt40) it9.next();
            i13++;
        }
        HashSet hashSet12 = new HashSet();
        for (String str46 : pt40Var2.n.keySet()) {
            pt40 pt40Var8 = pt40Var3;
            if (pt40Var8.n.containsKey(str46)) {
                str9 = str7;
                hashSet4 = hashSet2;
                if (!hashSet4.contains(str9 + str46)) {
                    hashSet12.add(str46);
                }
            } else {
                hashSet4 = hashSet2;
                str9 = str7;
            }
            pt40Var3 = pt40Var8;
            str7 = str9;
            hashSet2 = hashSet4;
        }
        String[] strArr = (String[]) hashSet12.toArray(new String[0]);
        this.r = strArr;
        this.s = new int[strArr.length];
        int i14 = 0;
        while (true) {
            String[] strArr2 = this.r;
            if (i14 < strArr2.length) {
                String str47 = strArr2[i14];
                this.s[i14] = 0;
                for (int i15 = 0; i15 < i12; i15++) {
                    if (pt40VarArr[i15].n.containsKey(str47) && (x2eVar = (x2e) pt40VarArr[i15].n.get(str47)) != null) {
                        int[] iArr = this.s;
                        iArr[i14] = x2eVar.c() + iArr[i14];
                        break;
                    }
                }
                i14++;
            } else {
                boolean z = pt40VarArr[0].j != -1;
                int length = 18 + strArr2.length;
                boolean[] zArr = new boolean[length];
                for (int i16 = 1; i16 < i12; i16++) {
                    pt40 pt40Var9 = pt40VarArr[i16];
                    pt40 pt40Var10 = pt40VarArr[i16 - 1];
                    boolean zB = pt40.b(pt40Var9.e, pt40Var10.e);
                    boolean zB2 = pt40.b(pt40Var9.f, pt40Var10.f);
                    zArr[0] = zArr[0] | pt40.b(pt40Var9.d, pt40Var10.d);
                    boolean z2 = zB | zB2 | z;
                    zArr[1] = zArr[1] | z2;
                    zArr[2] = z2 | zArr[2];
                    zArr[3] = zArr[3] | pt40.b(pt40Var9.g, pt40Var10.g);
                    zArr[4] = pt40.b(pt40Var9.h, pt40Var10.h) | zArr[4];
                }
                int i17 = 0;
                for (int i18 = 1; i18 < length; i18++) {
                    if (zArr[i18]) {
                        i17++;
                    }
                }
                this.o = new int[i17];
                int iMax = Math.max(2, i17);
                this.p = new double[iMax];
                this.q = new double[iMax];
                int i19 = 0;
                for (int i20 = 1; i20 < length; i20++) {
                    if (zArr[i20]) {
                        this.o[i19] = i20;
                        i19++;
                    }
                }
                int[] iArr2 = {i12, this.o.length};
                Class cls = Double.TYPE;
                double[][] dArr = (double[][]) Array.newInstance((Class<?>) cls, iArr2);
                double[] dArr2 = new double[i12];
                int i21 = 0;
                while (i21 < i12) {
                    pt40 pt40Var11 = pt40VarArr[i21];
                    double[] dArr3 = dArr[i21];
                    int[] iArr3 = this.o;
                    pt40[] pt40VarArr2 = pt40VarArr;
                    int i22 = 6;
                    float[] fArr = {pt40Var11.d, pt40Var11.e, pt40Var11.f, pt40Var11.g, pt40Var11.h, pt40Var11.i};
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < iArr3.length) {
                        int i25 = iArr3[i23];
                        if (i25 < i22) {
                            dArr3[i24] = fArr[i25];
                            i24++;
                        }
                        i23++;
                        i22 = 6;
                    }
                    dArr2[i21] = pt40VarArr2[i21].c;
                    i21++;
                    pt40VarArr = pt40VarArr2;
                }
                pt40[] pt40VarArr3 = pt40VarArr;
                int i26 = 0;
                while (true) {
                    int[] iArr4 = this.o;
                    if (i26 < iArr4.length) {
                        if (iArr4[i26] < 6) {
                            String strN = axq.n(new StringBuilder(), pt40.r[this.o[i26]], " [");
                            for (int i27 = 0; i27 < i12; i27++) {
                                strN = strN + dArr[i27][i26];
                            }
                        }
                        i26++;
                    } else {
                        this.j = new kpb[this.r.length + 1];
                        int i28 = 0;
                        while (true) {
                            String[] strArr3 = this.r;
                            if (i28 >= strArr3.length) {
                                this.j[0] = kpb.y(this.e, dArr2, dArr);
                                if (pt40VarArr3[0].j != -1) {
                                    int[] iArr5 = new int[i12];
                                    double[] dArr4 = new double[i12];
                                    double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) cls, i12, 2);
                                    for (int i29 = 0; i29 < i12; i29++) {
                                        pt40 pt40Var12 = pt40VarArr3[i29];
                                        iArr5[i29] = pt40Var12.j;
                                        dArr4[i29] = pt40Var12.c;
                                        double[] dArr6 = dArr5[i29];
                                        dArr6[0] = pt40Var12.e;
                                        dArr6[1] = pt40Var12.f;
                                    }
                                    this.k = new aw3(iArr5, dArr4, dArr5);
                                }
                                this.z = new HashMap();
                                float fC = Float.NaN;
                                for (String str48 : hashSet3) {
                                    eju0 eju0VarE = eju0.e(str48);
                                    if (eju0VarE != null) {
                                        if (eju0VarE.e == 1 && Float.isNaN(fC)) {
                                            fC = c();
                                        }
                                        eju0VarE.b = str48;
                                        this.z.put(str48, eju0VarE);
                                    }
                                }
                                for (rjy rjyVar6 : arrayList4) {
                                    if (rjyVar6 instanceof yjy) {
                                        ((yjy) rjyVar6).g(this.z);
                                    }
                                }
                                Iterator it10 = this.z.values().iterator();
                                while (it10.hasNext()) {
                                    ((eju0) it10.next()).d();
                                }
                                return;
                            }
                            String str49 = strArr3[i28];
                            int i30 = 0;
                            int i31 = 0;
                            double[] dArr7 = null;
                            double[][] dArr8 = null;
                            while (i30 < i12) {
                                if (pt40VarArr3[i30].n.containsKey(str49)) {
                                    if (dArr8 == null) {
                                        dArr7 = new double[i12];
                                        x2e x2eVar4 = (x2e) pt40VarArr3[i30].n.get(str49);
                                        dArr8 = (double[][]) Array.newInstance((Class<?>) cls, i12, x2eVar4 == null ? 0 : x2eVar4.c());
                                    }
                                    pt40 pt40Var13 = pt40VarArr3[i30];
                                    dArr7[i31] = pt40Var13.c;
                                    double[] dArr9 = dArr8[i31];
                                    x2e x2eVar5 = (x2e) pt40Var13.n.get(str49);
                                    if (x2eVar5 != null) {
                                        if (x2eVar5.c() == 1) {
                                            dArr9[0] = x2eVar5.a();
                                        } else {
                                            int iC = x2eVar5.c();
                                            float[] fArr2 = new float[iC];
                                            x2eVar5.b(fArr2);
                                            int i32 = 0;
                                            int i33 = 0;
                                            while (i32 < iC) {
                                                dArr9[i33] = fArr2[i32];
                                                i32++;
                                                str49 = str49;
                                                i33++;
                                                i28 = i28;
                                                i30 = i30;
                                            }
                                        }
                                    }
                                    i3 = i28;
                                    str8 = str49;
                                    i4 = i30;
                                    i31++;
                                } else {
                                    i3 = i28;
                                    str8 = str49;
                                    i4 = i30;
                                }
                                i30 = i4 + 1;
                                str49 = str8;
                                i28 = i3;
                            }
                            int i34 = i28;
                            double[] dArrCopyOf = Arrays.copyOf(dArr7, i31);
                            double[][] dArr10 = (double[][]) Arrays.copyOf(dArr8, i31);
                            int i35 = i34 + 1;
                            this.j[i35] = kpb.y(this.e, dArrCopyOf, dArr10);
                            i28 = i35;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        pt40 pt40Var = this.f;
        sb.append(pt40Var.e);
        sb.append(" y: ");
        sb.append(pt40Var.f);
        sb.append(" end: x: ");
        pt40 pt40Var2 = this.g;
        sb.append(pt40Var2.e);
        sb.append(" y: ");
        sb.append(pt40Var2.f);
        return sb.toString();
    }
}
