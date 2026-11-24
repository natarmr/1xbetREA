package androidx.recyclerview.widget;

import a.b1j;
import a.b8k0;
import a.c99;
import a.che0;
import a.dhe0;
import a.e9d0;
import a.ehe0;
import a.eld0;
import a.ep;
import a.fhe0;
import a.fp;
import a.ga3;
import a.hhe0;
import a.hk50;
import a.hmk;
import a.hne;
import a.iac;
import a.ihe0;
import a.ihu0;
import a.ik50;
import a.itt0;
import a.iw20;
import a.jf4;
import a.jhe0;
import a.jhu0;
import a.jw20;
import a.khe0;
import a.kvj;
import a.let;
import a.lgu0;
import a.lhe0;
import a.lqd0;
import a.m0p;
import a.mhu0;
import a.msj;
import a.nhe0;
import a.nr00;
import a.nuj0;
import a.o470;
import a.ohe0;
import a.onv;
import a.q5x;
import a.qbc;
import a.rgu0;
import a.ryx;
import a.she0;
import a.tgu0;
import a.the0;
import a.trm0;
import a.twn;
import a.u710;
import a.uhe0;
import a.v4i0;
import a.vhe0;
import a.whe0;
import a.xge0;
import a.xgu0;
import a.xhe0;
import a.yge0;
import a.yjc;
import a.zhe0;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.BaseInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements hk50 {
    public static boolean d2 = false;
    public static boolean e2 = false;
    public static final int[] f2 = {R.attr.nestedScrollingEnabled};
    public static final float g2 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean h2 = true;
    public static final boolean i2 = true;
    public static final Class[] j2;
    public static final ryx k2;
    public static final uhe0 l2;
    public boolean A;
    public final int A1;
    public final AccessibilityManager B;
    public final float B1;
    public final float C1;
    public boolean D1;
    public final whe0 E1;
    public let F1;
    public final yjc G1;
    public final the0 H1;
    public lhe0 I1;
    public ArrayList J1;
    public boolean K1;
    public boolean L1;
    public final o470 M1;
    public boolean N1;
    public zhe0 O1;
    public final int[] P1;
    public ik50 Q1;
    public final int[] R1;
    public final int[] S1;
    public final int[] U1;
    public final ArrayList V1;
    public final xge0 W1;
    public boolean X1;
    public int Y1;
    public int Z1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f45398a;
    public final boolean a2;
    public final c b;
    public final nr00 b2;
    public final msj c;
    public final hmk c2;
    public SavedState d;
    public final fp e;
    public final iac f;
    public ArrayList f1;
    public final trm0 g;
    public boolean g1;
    public boolean h;
    public boolean h1;
    public final xge0 i;
    public int i1;
    public final Rect j;
    public int j1;
    public final Rect k;
    public dhe0 k1;
    public final RectF l;
    public EdgeEffect l1;
    public yge0 m;
    public EdgeEffect m1;
    public b n;
    public EdgeEffect n1;
    public final ArrayList o;
    public EdgeEffect o1;
    public final ArrayList p;
    public ehe0 p1;
    public final ArrayList q;
    public int q1;
    public khe0 r;
    public int r1;
    public boolean s;
    public VelocityTracker s1;
    public boolean t;
    public int t1;
    public boolean u;
    public int u1;
    public int v;
    public int v1;
    public boolean w;
    public int w1;
    public boolean x;
    public int x1;
    public boolean y;
    public jhe0 y1;
    public int z;
    public final int z1;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new d();
        public Parcelable c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readParcelable(classLoader == null ? b.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, 0);
        }
    }

    static {
        Class cls = Integer.TYPE;
        j2 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        k2 = new ryx((byte) 2);
        l2 = new uhe0();
    }

    /* JADX WARN: Failed to calculate best type for var: r16v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v10 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v10 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v3 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v3 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v4 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v4 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v5 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v5 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v6 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v6 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v7 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v7 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v8 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v8 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v9 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v9 ??, new type: java.lang.Throwable
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: TypeSearchVarInfo not found in map for var: r10v0 ??
    	at jadx.core.dex.visitors.typeinference.TypeSearchState.getVarInfo(TypeSearchState.java:34)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.lambda$resolveIndependentVariables$1(TypeSearch.java:173)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.test(ReferencePipeline.java:306)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1693)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:147)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:588)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:574)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:673)
    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.accept(ReferencePipeline.java:291)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1693)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:147)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:588)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:574)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:673)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.resolveIndependentVariables(TypeSearch.java:173)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:63)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v6, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        float fA;
        char c;
        int i3;
        ?? r16;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        this.b = new c(this);
        this.c = new msj(this);
        this.g = new trm0((byte) 12);
        this.i = new xge0(this, (byte) 0);
        this.j = new Rect();
        this.k = new Rect();
        this.l = new RectF();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.v = 0;
        this.g1 = false;
        this.h1 = false;
        this.i1 = 0;
        this.j1 = 0;
        this.k1 = l2;
        kvj kvjVar = new kvj();
        kvjVar.f7804a = null;
        kvjVar.b = new ArrayList();
        kvjVar.c = (byte) 120;
        kvjVar.d = (byte) 120;
        kvjVar.e = (short) 250;
        kvjVar.f = (short) 250;
        byte b = 1;
        kvjVar.g = true;
        kvjVar.h = new ArrayList();
        kvjVar.i = new ArrayList();
        kvjVar.j = new ArrayList();
        kvjVar.k = new ArrayList();
        kvjVar.l = new ArrayList();
        kvjVar.m = new ArrayList();
        kvjVar.n = new ArrayList();
        kvjVar.o = new ArrayList();
        kvjVar.p = new ArrayList();
        kvjVar.q = new ArrayList();
        kvjVar.r = new ArrayList();
        this.p1 = kvjVar;
        this.q1 = 0;
        this.r1 = -1;
        this.B1 = Float.MIN_VALUE;
        this.C1 = Float.MIN_VALUE;
        this.D1 = true;
        this.E1 = new whe0(this);
        this.G1 = i2 ? new yjc() : null;
        the0 the0Var = new the0();
        the0Var.f33958a = -1;
        the0Var.b = 0;
        the0Var.c = 0;
        the0Var.d = (byte) 1;
        the0Var.e = 0;
        the0Var.f = false;
        the0Var.g = false;
        the0Var.h = false;
        the0Var.i = false;
        the0Var.j = false;
        the0Var.k = false;
        this.H1 = the0Var;
        this.K1 = false;
        this.L1 = false;
        o470 o470Var = new o470(this);
        this.M1 = o470Var;
        this.N1 = false;
        this.P1 = new int[2];
        this.R1 = new int[2];
        this.S1 = new int[2];
        this.U1 = new int[2];
        this.V1 = new ArrayList();
        this.W1 = new xge0(this, b);
        this.Y1 = 0;
        this.Z1 = 0;
        this.b2 = new nr00(this);
        this.c2 = new hmk(getContext(), new iw20(this));
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.x1 = viewConfiguration.getScaledTouchSlop();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Method method = xgu0.f40856a;
            fA = ga3.i(viewConfiguration);
        } else {
            fA = xgu0.a(viewConfiguration, context);
        }
        this.B1 = fA;
        this.C1 = i4 >= 26 ? ga3.j(viewConfiguration) : xgu0.a(viewConfiguration, context);
        this.z1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.A1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f45398a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.p1.f7804a = o470Var;
        this.e = new fp(new onv(this));
        this.f = new iac(new jw20((Object) this, (byte) 19));
        WeakHashMap weakHashMap = rgu0.f30456a;
        if ((i4 >= 26 ? lgu0.a(this) : 0) == 0 && i4 >= 26) {
            lgu0.b(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new zhe0(this));
        int[] iArr = lqd0.f20483a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        rgu0.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.h = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                jf4.o("Trying to set fast scroller without both required drawables.".concat(H()));
                throw null;
            }
            Resources resources = getContext().getResources();
            c = 3;
            i3 = 4;
            new m0p(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(org.xbet.client1.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(org.xbet.client1.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(org.xbet.client1.R.dimen.fastscroll_margin));
        } else {
            c = 3;
            i3 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.a2 = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(Separators.DOT)) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            try {
                                classLoader = context.getClassLoader();
                            } catch (ClassNotFoundException e) {
                                e = e;
                                r16 = 0;
                                e9d0.g(attributeSet.getPositionDescription(), ": Unable to find LayoutManager ", str, e);
                                throw r16;
                            } catch (IllegalAccessException e3) {
                                e = e3;
                                r16 = 0;
                                e9d0.g(attributeSet.getPositionDescription(), ": Cannot access non-public constructor ", str, e);
                                throw r16;
                            } catch (InstantiationException e4) {
                                e = e4;
                                r16 = 0;
                                e9d0.g(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw r16;
                            } catch (InvocationTargetException e5) {
                                e = e5;
                                r16 = 0;
                                e9d0.g(attributeSet.getPositionDescription(), ": Could not instantiate the LayoutManager: ", str, e);
                                throw r16;
                            }
                        }
                        Class clsAsSubclass = Class.forName(str, false, classLoader).asSubclass(b.class);
                        try {
                            constructor = clsAsSubclass.getConstructor(j2);
                            objArr = new Object[i3];
                            objArr[0] = context;
                            objArr[b] = attributeSet;
                            objArr[2] = Integer.valueOf(i);
                            objArr[c] = 0;
                        } catch (NoSuchMethodException e6) {
                            try {
                                constructor = clsAsSubclass.getConstructor(null);
                                objArr = null;
                            } catch (NoSuchMethodException e7) {
                                e7.initCause(e6);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e7);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((b) constructor.newInstance(objArr));
                    } catch (ClassCastException e8) {
                        e9d0.g(attributeSet.getPositionDescription(), ": Class is not a LayoutManager ", str, e8);
                        throw null;
                    }
                } catch (ClassNotFoundException e9) {
                    e = e9;
                } catch (IllegalAccessException e10) {
                    e = e10;
                } catch (InstantiationException e11) {
                    e = e11;
                } catch (InvocationTargetException e12) {
                    e = e12;
                }
            }
        }
        int[] iArr2 = f2;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        rgu0.n(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(org.xbet.client1.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    public static RecyclerView N(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewN = N(viewGroup.getChildAt(i));
            if (recyclerViewN != null) {
                return recyclerViewN;
            }
        }
        return null;
    }

    public static int U(View view) {
        xhe0 xhe0VarX = X(view);
        if (xhe0VarX != null) {
            return xhe0VarX.c();
        }
        return -1;
    }

    public static int V(View view) {
        xhe0 xhe0VarX = X(view);
        if (xhe0VarX != null) {
            return xhe0VarX.e();
        }
        return -1;
    }

    public static xhe0 X(View view) {
        if (view == null) {
            return null;
        }
        return ((hhe0) view.getLayoutParams()).f13060a;
    }

    public static void Y(Rect rect, View view) {
        hhe0 hhe0Var = (hhe0) view.getLayoutParams();
        Rect rect2 = hhe0Var.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) hhe0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) hhe0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) hhe0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) hhe0Var).bottomMargin);
    }

    private ik50 getScrollingChildHelper() {
        ik50 ik50Var = this.Q1;
        if (ik50Var != null) {
            return ik50Var;
        }
        ik50 ik50Var2 = new ik50(this);
        this.Q1 = ik50Var2;
        return ik50Var2;
    }

    public static void q(xhe0 xhe0Var) {
        WeakReference weakReference = xhe0Var.b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == xhe0Var.f40887a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            xhe0Var.b = null;
        }
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        d2 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        e2 = z;
    }

    public static int t(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i3) {
        if (i > 0 && edgeEffect != null && qbc.O(edgeEffect) != 0.0f) {
            int iRound = Math.round(qbc.U(edgeEffect, ((-i) * 4.0f) / i3, 0.5f) * ((-i3) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || qbc.O(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i3;
        int iRound2 = Math.round(qbc.U(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public boolean A(int i, int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i3, i4, iArr, iArr2);
    }

    public final void A0(int i, int i3, BaseInterpolator baseInterpolator, int i4, boolean z) {
        b bVar = this.n;
        if (bVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.x) {
            return;
        }
        if (!bVar.q()) {
            i = 0;
        }
        if (!this.n.r()) {
            i3 = 0;
        }
        if (i == 0 && i3 == 0) {
            return;
        }
        if (i4 != Integer.MIN_VALUE && i4 <= 0) {
            scrollBy(i, i3);
            return;
        }
        if (z) {
            int i5 = i != 0 ? 1 : 0;
            if (i3 != 0) {
                i5 |= 2;
            }
            getScrollingChildHelper().h(i5, 1);
        }
        this.E1.c(i, i3, i4, baseInterpolator);
    }

    public final void B(int i, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().d(i, i3, i4, i5, iArr, i6, iArr2);
    }

    public final void B0(int i) {
        if (this.x) {
            return;
        }
        b bVar = this.n;
        if (bVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            bVar.R0(this, this.H1, i);
        }
    }

    public final void C(int i, int i3) {
        this.j1++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i3);
        k0(i, i3);
        lhe0 lhe0Var = this.I1;
        if (lhe0Var != null) {
            lhe0Var.d(this, i, i3);
        }
        ArrayList arrayList = this.J1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((lhe0) this.J1.get(size)).d(this, i, i3);
            }
        }
        this.j1--;
    }

    public final void C0() {
        int i = this.v + 1;
        this.v = i;
        if (i != 1 || this.x) {
            return;
        }
        this.w = false;
    }

    public final void D() {
        if (this.o1 != null) {
            return;
        }
        ((uhe0) this.k1).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.o1 = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D0(int i) {
        boolean zQ = this.n.q();
        int i3 = zQ;
        if (this.n.r()) {
            i3 = (zQ ? 1 : 0) | 2;
        }
        getScrollingChildHelper().h(i3, i);
    }

    public final void E() {
        if (this.l1 != null) {
            return;
        }
        ((uhe0) this.k1).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.l1 = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void E0(boolean z) {
        int i = this.v;
        if (i < 1) {
            if (d2) {
                jf4.n("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.".concat(H()));
                return;
            } else {
                this.v = 1;
                i = 1;
            }
        }
        if (!z && !this.x) {
            this.w = false;
        }
        if (i == 1) {
            if (z && this.w && !this.x && this.n != null && this.m != null) {
                x();
            }
            if (!this.x) {
                this.w = false;
            }
        }
        this.v--;
    }

    public final void F() {
        if (this.n1 != null) {
            return;
        }
        ((uhe0) this.k1).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.n1 = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void F0(int i) {
        getScrollingChildHelper().i(i);
    }

    public final void G() {
        if (this.m1 != null) {
            return;
        }
        ((uhe0) this.k1).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.m1 = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void G0() {
        she0 she0Var;
        setScrollState(0);
        whe0 whe0Var = this.E1;
        whe0Var.g.removeCallbacks(whe0Var);
        whe0Var.c.abortAnimation();
        b bVar = this.n;
        if (bVar == null || (she0Var = bVar.e) == null) {
            return;
        }
        she0Var.h();
    }

    public final String H() {
        return Separators.SP + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    public final void I(the0 the0Var) {
        if (getScrollState() != 2) {
            the0Var.getClass();
            return;
        }
        OverScroller overScroller = this.E1.c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        the0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View J(float f, float f3) {
        iac iacVar = this.f;
        for (int iE = iacVar.e() - 1; iE >= 0; iE--) {
            View viewD = iacVar.d(iE);
            float translationX = viewD.getTranslationX();
            float translationY = viewD.getTranslationY();
            if (f >= viewD.getLeft() + translationX && f <= viewD.getRight() + translationX && f3 >= viewD.getTop() + translationY && f3 <= viewD.getBottom() + translationY) {
                return viewD;
            }
        }
        return null;
    }

    public final View K(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean L(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            khe0 khe0Var = (khe0) arrayList.get(i);
            if (khe0Var.c(this, motionEvent) && action != 3) {
                this.r = khe0Var;
                return true;
            }
        }
        return false;
    }

    public final void M(int[] iArr) {
        iac iacVar = this.f;
        int iE = iacVar.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < iE; i4++) {
            xhe0 xhe0VarX = X(iacVar.d(i4));
            if (!xhe0VarX.r()) {
                int iE2 = xhe0VarX.e();
                if (iE2 < i) {
                    i = iE2;
                }
                if (iE2 > i3) {
                    i3 = iE2;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i3;
    }

    public final xhe0 O(int i) {
        xhe0 xhe0Var = null;
        if (this.g1) {
            return null;
        }
        iac iacVar = this.f;
        int iH = iacVar.h();
        for (int i3 = 0; i3 < iH; i3++) {
            xhe0 xhe0VarX = X(iacVar.g(i3));
            if (xhe0VarX != null && !xhe0VarX.k() && S(xhe0VarX) == i) {
                if (!iacVar.c.contains(xhe0VarX.f40887a)) {
                    return xhe0VarX;
                }
                xhe0Var = xhe0VarX;
            }
        }
        return xhe0Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034 A[SYNTHETIC] */
    public final xhe0 P(int i, boolean z) {
        iac iacVar = this.f;
        int iH = iacVar.h();
        xhe0 xhe0Var = null;
        for (int i3 = 0; i3 < iH; i3++) {
            xhe0 xhe0VarX = X(iacVar.g(i3));
            if (xhe0VarX != null && !xhe0VarX.k()) {
                if (z) {
                    if (xhe0VarX.c != i) {
                        continue;
                    } else {
                        if (iacVar.c.contains(xhe0VarX.f40887a)) {
                            return xhe0VarX;
                        }
                        xhe0Var = xhe0VarX;
                    }
                } else if (xhe0VarX.e() != i) {
                    continue;
                } else {
                    if (iacVar.c.contains(xhe0VarX.f40887a)) {
                        return xhe0VarX;
                    }
                    xhe0Var = xhe0VarX;
                }
            }
        }
        return xhe0Var;
    }

    public boolean Q(int i, int i3) {
        return R(i, i3, this.z1, this.A1);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0078  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ba  */
    public final boolean R(int i, int i3, int i4, int i5) {
        int iMax;
        int i6;
        b bVar = this.n;
        if (bVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (!this.x) {
            boolean zQ = bVar.q();
            boolean zR = this.n.r();
            if (!zQ || Math.abs(i) < i4) {
                i = 0;
            }
            if (!zR || Math.abs(i3) < i4) {
                i3 = 0;
            }
            if (i != 0 || i3 != 0) {
                if (i == 0) {
                    iMax = 0;
                } else {
                    EdgeEffect edgeEffect = this.l1;
                    if (edgeEffect == null || qbc.O(edgeEffect) == 0.0f) {
                        EdgeEffect edgeEffect2 = this.n1;
                        if (edgeEffect2 == null || qbc.O(edgeEffect2) == 0.0f) {
                            iMax = 0;
                        } else if (z0(this.n1, i, getWidth())) {
                            this.n1.onAbsorb(i);
                            i = 0;
                        }
                    } else {
                        int i7 = -i;
                        if (z0(this.l1, i7, getWidth())) {
                            this.l1.onAbsorb(i7);
                            i = 0;
                        }
                    }
                    iMax = i;
                    i = 0;
                }
                if (i3 == 0) {
                    i6 = i3;
                    i3 = 0;
                } else {
                    EdgeEffect edgeEffect3 = this.m1;
                    if (edgeEffect3 == null || qbc.O(edgeEffect3) == 0.0f) {
                        EdgeEffect edgeEffect4 = this.o1;
                        if (edgeEffect4 == null || qbc.O(edgeEffect4) == 0.0f) {
                            i6 = i3;
                            i3 = 0;
                        } else if (z0(this.o1, i3, getHeight())) {
                            this.o1.onAbsorb(i3);
                            i3 = 0;
                        }
                    } else {
                        int i8 = -i3;
                        if (z0(this.m1, i8, getHeight())) {
                            this.m1.onAbsorb(i8);
                            i3 = 0;
                        }
                    }
                    i6 = 0;
                }
                whe0 whe0Var = this.E1;
                if (iMax != 0 || i3 != 0) {
                    int i9 = -i5;
                    iMax = Math.max(i9, Math.min(iMax, i5));
                    i3 = Math.max(i9, Math.min(i3, i5));
                    D0(1);
                    whe0Var.a(iMax, i3);
                }
                if (i != 0 || i6 != 0) {
                    float f = i;
                    float f3 = i6;
                    if (!dispatchNestedPreFling(f, f3)) {
                        boolean z = zQ || zR;
                        dispatchNestedFling(f, f3, z);
                        jhe0 jhe0Var = this.y1;
                        if (jhe0Var == null || !jhe0Var.a(i, i6)) {
                            if (z) {
                                D0(1);
                                int i10 = -i5;
                                whe0Var.a(Math.max(i10, Math.min(i, i5)), Math.max(i10, Math.min(i6, i5)));
                                return true;
                            }
                        }
                        return true;
                    }
                } else if (iMax != 0 || i3 != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int S(xhe0 xhe0Var) {
        if ((xhe0Var.j & 524) == 0 && xhe0Var.h()) {
            int i = xhe0Var.c;
            ArrayList arrayList = (ArrayList) this.e.d;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ep epVar = (ep) arrayList.get(i3);
                byte b = epVar.f8161a;
                if (b != 1) {
                    if (b == 2) {
                        int i4 = epVar.b;
                        if (i4 <= i) {
                            int i5 = epVar.d;
                            if (i4 + i5 <= i) {
                                i -= i5;
                            }
                        } else {
                            continue;
                        }
                    } else if (b == 8) {
                        int i6 = epVar.b;
                        if (i6 == i) {
                            i = epVar.d;
                        } else {
                            if (i6 < i) {
                                i--;
                            }
                            if (epVar.d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (epVar.b <= i) {
                    i += epVar.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long T(xhe0 xhe0Var) {
        return this.m.b ? xhe0Var.e : xhe0Var.c;
    }

    public final xhe0 W(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return X(view);
        }
        itt0.l("View ", view, " is not a direct child of ", this);
        return null;
    }

    public final Rect Z(View view) {
        hhe0 hhe0Var = (hhe0) view.getLayoutParams();
        boolean z = hhe0Var.c;
        Rect rect = hhe0Var.b;
        if (z) {
            the0 the0Var = this.H1;
            if (!the0Var.g || (!hhe0Var.f13060a.n() && !hhe0Var.f13060a.i())) {
                rect.set(0, 0, 0, 0);
                ArrayList arrayList = this.p;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    Rect rect2 = this.j;
                    rect2.set(0, 0, 0, 0);
                    ((fhe0) arrayList.get(i)).f(rect2, view, this, the0Var);
                    rect.left += rect2.left;
                    rect.top += rect2.top;
                    rect.right += rect2.right;
                    rect.bottom += rect2.bottom;
                }
                hhe0Var.c = false;
                return rect;
            }
        }
        return rect;
    }

    public final boolean a0() {
        return !this.u || this.g1 || this.e.z();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i3) {
        b bVar = this.n;
        if (bVar != null) {
            bVar.getClass();
        }
        super.addFocusables(arrayList, i, i3);
    }

    public final void b0() {
        if (this.p.size() == 0) {
            return;
        }
        b bVar = this.n;
        if (bVar != null) {
            bVar.n("Cannot invalidate item decorations during a scroll or layout");
        }
        e0();
        requestLayout();
    }

    public final boolean c0() {
        return this.i1 > 0;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof hhe0) && this.n.s((hhe0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        b bVar = this.n;
        if (bVar != null && bVar.q()) {
            return this.n.w(this.H1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        b bVar = this.n;
        if (bVar != null && bVar.q()) {
            return this.n.x(this.H1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        b bVar = this.n;
        if (bVar != null && bVar.q()) {
            return this.n.y(this.H1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        b bVar = this.n;
        if (bVar != null && bVar.r()) {
            return this.n.z(this.H1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        b bVar = this.n;
        if (bVar != null && bVar.r()) {
            return this.n.A(this.H1);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        b bVar = this.n;
        if (bVar != null && bVar.r()) {
            return this.n.B(this.H1);
        }
        return 0;
    }

    public final void d0(int i) {
        if (this.n == null) {
            return;
        }
        setScrollState(2);
        this.n.H0(i);
        awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        b layoutManager = getLayoutManager();
        int iD = 0;
        if (layoutManager != null) {
            if (layoutManager.r()) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 92 || keyCode == 93) {
                    int measuredHeight = getMeasuredHeight();
                    if (keyCode == 93) {
                        A0(0, measuredHeight, null, Integer.MIN_VALUE, false);
                        return true;
                    }
                    A0(0, -measuredHeight, null, Integer.MIN_VALUE, false);
                    return true;
                }
                if (keyCode == 122 || keyCode == 123) {
                    boolean zY = layoutManager.Y();
                    if (keyCode == 122) {
                        if (zY) {
                            iD = getAdapter().d();
                        }
                    } else if (!zY) {
                        iD = getAdapter().d();
                    }
                    B0(iD);
                    return true;
                }
            } else if (layoutManager.q()) {
                int keyCode2 = keyEvent.getKeyCode();
                if (keyCode2 == 92 || keyCode2 == 93) {
                    int measuredWidth = getMeasuredWidth();
                    if (keyCode2 == 93) {
                        A0(measuredWidth, 0, null, Integer.MIN_VALUE, false);
                        return true;
                    }
                    A0(-measuredWidth, 0, null, Integer.MIN_VALUE, false);
                    return true;
                }
                if (keyCode2 == 122 || keyCode2 == 123) {
                    boolean zY2 = layoutManager.Y();
                    if (keyCode2 == 122) {
                        if (zY2) {
                            iD = getAdapter().d();
                        }
                    } else if (!zY2) {
                        iD = getAdapter().d();
                    }
                    B0(iD);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f3, boolean z) {
        return getScrollingChildHelper().a(f, f3, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f3) {
        return getScrollingChildHelper().b(f, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i3, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((fhe0) arrayList.get(i)).h(canvas, this, this.H1);
        }
        EdgeEffect edgeEffect = this.l1;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.l1;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.m1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.m1;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.n1;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.n1;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.o1;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.o1;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if ((z || this.p1 == null || arrayList.size() <= 0 || !this.p1.f()) ? z : true) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0() {
        iac iacVar = this.f;
        int iH = iacVar.h();
        for (int i = 0; i < iH; i++) {
            ((hhe0) iacVar.g(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = (ArrayList) this.c.e;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            hhe0 hhe0Var = (hhe0) ((xhe0) arrayList.get(i3)).f40887a.getLayoutParams();
            if (hhe0Var != null) {
                hhe0Var.c = true;
            }
        }
    }

    public final void f0(int i, int i3, boolean z) {
        int i4 = i + i3;
        iac iacVar = this.f;
        int iH = iacVar.h();
        for (int i5 = 0; i5 < iH; i5++) {
            xhe0 xhe0VarX = X(iacVar.g(i5));
            if (xhe0VarX != null && !xhe0VarX.r()) {
                int i6 = xhe0VarX.c;
                the0 the0Var = this.H1;
                if (i6 >= i4) {
                    if (e2) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i5 + " holder " + xhe0VarX + " now at position " + (xhe0VarX.c - i3));
                    }
                    xhe0VarX.o(-i3, z);
                    the0Var.f = true;
                } else if (i6 >= i) {
                    if (e2) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i5 + " holder " + xhe0VarX + " now REMOVED");
                    }
                    xhe0VarX.b(8);
                    xhe0VarX.o(-i3, z);
                    xhe0VarX.c = i - 1;
                    the0Var.f = true;
                }
            }
        }
        msj msjVar = this.c;
        ArrayList arrayList = (ArrayList) msjVar.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            xhe0 xhe0Var = (xhe0) arrayList.get(size);
            if (xhe0Var != null) {
                int i7 = xhe0Var.c;
                if (i7 >= i4) {
                    if (e2) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + xhe0Var + " now at position " + (xhe0Var.c - i3));
                    }
                    xhe0Var.o(-i3, z);
                } else if (i7 >= i) {
                    xhe0Var.b(8);
                    msjVar.j(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0157 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x015b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x015f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0166  */
    /* JADX WARN: Code duplicated, block: B:119:0x0170 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0176 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x0179  */
    /* JADX WARN: Code duplicated, block: B:126:0x017b  */
    /* JADX WARN: Code duplicated, block: B:127:0x017d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0181  */
    /* JADX WARN: Code duplicated, block: B:131:0x0183  */
    /* JADX WARN: Code duplicated, block: B:132:0x0185  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0113  */
    /* JADX WARN: Code duplicated, block: B:81:0x0115  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0163, code lost:
    
        if (r16 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0170, code lost:
    
        if (r5 > 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0173, code lost:
    
        if (r16 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0176, code lost:
    
        if (r5 < 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x017e, code lost:
    
        if ((r5 * r6) <= 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0186, code lost:
    
        if ((r5 * r6) >= 0) goto L135;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r19, int r20) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0() {
        this.i1++;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        b bVar = this.n;
        if (bVar != null) {
            return bVar.E();
        }
        jf4.n("RecyclerView has no LayoutManager".concat(H()));
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        b bVar = this.n;
        if (bVar != null) {
            return bVar.F(getContext(), attributeSet);
        }
        jf4.n("RecyclerView has no LayoutManager".concat(H()));
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public yge0 getAdapter() {
        return this.m;
    }

    @Override // android.view.View
    public int getBaseline() {
        b bVar = this.n;
        if (bVar == null) {
            return super.getBaseline();
        }
        bVar.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i3) {
        return super.getChildDrawingOrder(i, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.h;
    }

    public zhe0 getCompatAccessibilityDelegate() {
        return this.O1;
    }

    public dhe0 getEdgeEffectFactory() {
        return this.k1;
    }

    public ehe0 getItemAnimator() {
        return this.p1;
    }

    public int getItemDecorationCount() {
        return this.p.size();
    }

    public b getLayoutManager() {
        return this.n;
    }

    public int getMaxFlingVelocity() {
        return this.A1;
    }

    public int getMinFlingVelocity() {
        return this.z1;
    }

    public long getNanoTime() {
        if (i2) {
            return System.nanoTime();
        }
        return 0L;
    }

    public jhe0 getOnFlingListener() {
        return this.y1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.D1;
    }

    public nhe0 getRecycledViewPool() {
        return this.c.d();
    }

    public int getScrollState() {
        return this.q1;
    }

    public final void h0(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i3 = this.i1 - 1;
        this.i1 = i3;
        if (i3 < 1) {
            if (d2 && i3 < 0) {
                jf4.n("layout or scroll counter cannot go below zero.Some calls are not matching".concat(H()));
                return;
            }
            this.i1 = 0;
            if (z) {
                int i4 = this.z;
                this.z = 0;
                if (i4 != 0 && (accessibilityManager = this.B) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i4);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.V1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    xhe0 xhe0Var = (xhe0) arrayList.get(size);
                    if (xhe0Var.f40887a.getParent() == this && !xhe0Var.r() && (i = xhe0Var.q) != -1) {
                        xhe0Var.f40887a.setImportantForAccessibility(i);
                        xhe0Var.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.r1) {
            int i = actionIndex == 0 ? 1 : 0;
            this.r1 = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.v1 = x;
            this.t1 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.w1 = y;
            this.u1 = y;
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public void j0(int i) {
    }

    public void k0(int i, int i3) {
    }

    public final void l(xhe0 xhe0Var) {
        View view = xhe0Var.f40887a;
        boolean z = view.getParent() == this;
        this.c.p(W(view));
        boolean zM = xhe0Var.m();
        iac iacVar = this.f;
        if (zM) {
            iacVar.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            iacVar.a(view, -1, true);
            return;
        }
        int iIndexOfChild = ((RecyclerView) iacVar.f14431a.b).indexOfChild(view);
        if (iIndexOfChild < 0) {
            e9d0.i(view, "view is not a child, cannot hide ");
        } else {
            iacVar.b.z(iIndexOfChild);
            iacVar.i(view);
        }
    }

    public final void l0() {
        if (this.N1 || !this.s) {
            return;
        }
        WeakHashMap weakHashMap = rgu0.f30456a;
        postOnAnimation(this.W1);
        this.N1 = true;
    }

    public final void m(fhe0 fhe0Var) {
        b bVar = this.n;
        if (bVar != null) {
            bVar.n("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(fhe0Var);
        e0();
        requestLayout();
    }

    public final void m0() {
        boolean z;
        boolean z2 = this.g1;
        fp fpVar = this.e;
        boolean z3 = false;
        if (z2) {
            fpVar.K((ArrayList) fpVar.d);
            fpVar.K((ArrayList) fpVar.e);
            fpVar.b = 0;
            if (this.h1) {
                this.n.n0();
            }
        }
        if (this.p1 != null && this.n.T0()) {
            fpVar.I();
        } else {
            fpVar.p();
        }
        boolean z4 = this.K1 || this.L1;
        boolean z5 = this.u && this.p1 != null && ((z = this.g1) || z4 || this.n.f) && (!z || this.m.b);
        the0 the0Var = this.H1;
        the0Var.j = z5;
        if (z5 && z4 && !this.g1 && this.p1 != null && this.n.T0()) {
            z3 = true;
        }
        the0Var.k = z3;
    }

    public final void n(khe0 khe0Var) {
        this.q.add(khe0Var);
    }

    public final void n0(boolean z) {
        this.h1 = z | this.h1;
        this.g1 = true;
        iac iacVar = this.f;
        int iH = iacVar.h();
        for (int i = 0; i < iH; i++) {
            xhe0 xhe0VarX = X(iacVar.g(i));
            if (xhe0VarX != null && !xhe0VarX.r()) {
                xhe0VarX.b(6);
            }
        }
        e0();
        msj msjVar = this.c;
        ArrayList arrayList = (ArrayList) msjVar.e;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            xhe0 xhe0Var = (xhe0) arrayList.get(i3);
            if (xhe0Var != null) {
                xhe0Var.b(6);
                xhe0Var.b(1024);
            }
        }
        yge0 yge0Var = ((RecyclerView) msjVar.h).m;
        if (yge0Var == null || !yge0Var.b) {
            msjVar.i();
        }
    }

    public void o(lhe0 lhe0Var) {
        ArrayList arrayList = this.J1;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.J1 = arrayList;
        }
        arrayList.add(lhe0Var);
    }

    public final void o0(xhe0 xhe0Var, eld0 eld0Var) {
        xhe0Var.j &= -8193;
        boolean z = this.H1.h;
        trm0 trm0Var = this.g;
        if (z && xhe0Var.n() && !xhe0Var.k() && !xhe0Var.r()) {
            ((u710) trm0Var.c).f(xhe0Var, T(xhe0Var));
        }
        nuj0 nuj0Var = (nuj0) trm0Var.b;
        mhu0 mhu0VarA = (mhu0) nuj0Var.get(xhe0Var);
        if (mhu0VarA == null) {
            mhu0VarA = mhu0.a();
            nuj0Var.put(xhe0Var, mhu0VarA);
        }
        mhu0VarA.b = eld0Var;
        mhu0VarA.f21815a |= 4;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.i1 = 0;
        this.s = true;
        this.u = this.u && !isLayoutRequested();
        this.c.g();
        b bVar = this.n;
        if (bVar != null) {
            bVar.g = true;
            bVar.f0(this);
        }
        this.N1 = false;
        if (i2) {
            ThreadLocal threadLocal = let.e;
            let letVar = (let) threadLocal.get();
            this.F1 = letVar;
            if (letVar == null) {
                this.F1 = new let();
                WeakHashMap weakHashMap = rgu0.f30456a;
                Display display = getDisplay();
                if (isInEditMode() || display == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                let letVar2 = this.F1;
                letVar2.c = (long) (1.0E9f / refreshRate);
                threadLocal.set(letVar2);
            }
            ArrayList arrayList = this.F1.f19920a;
            if (d2 && arrayList.contains(this)) {
                jf4.n("RecyclerView already present in worker list!");
            } else {
                arrayList.add(this);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        let letVar;
        super.onDetachedFromWindow();
        ehe0 ehe0Var = this.p1;
        if (ehe0Var != null) {
            ehe0Var.e();
        }
        G0();
        this.s = false;
        b bVar = this.n;
        msj msjVar = this.c;
        if (bVar != null) {
            bVar.g = false;
            bVar.g0(this, msjVar);
        }
        this.V1.clear();
        removeCallbacks(this.W1);
        this.g.getClass();
        while (mhu0.d.a() != null) {
        }
        ArrayList arrayList = (ArrayList) msjVar.e;
        for (int i = 0; i < arrayList.size(); i++) {
            b8k0.y(((xhe0) arrayList.get(i)).f40887a);
        }
        msjVar.h(((RecyclerView) msjVar.h).m, false);
        Iterator it = new ihu0(this).iterator();
        while (true) {
            jhu0 jhu0Var = (jhu0) it;
            if (!jhu0Var.hasNext()) {
                break;
            }
            ArrayList arrayList2 = b8k0.J((View) jhu0Var.next()).f45046a;
            int size = arrayList2.size();
            while (true) {
                size--;
                if (-1 < size) {
                    ((tgu0) arrayList2.get(size)).f33932a.e();
                }
            }
        }
        if (!i2 || (letVar = this.F1) == null) {
            return;
        }
        boolean zRemove = letVar.f19920a.remove(this);
        if (!d2 || zRemove) {
            this.F1 = null;
        } else {
            jf4.n("RecyclerView removal failed!");
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((fhe0) arrayList.get(i)).g(canvas, this, this.H1);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue;
        int i;
        boolean z;
        if (this.n != null && !this.x && motionEvent.getAction() == 8) {
            float f = 0.0f;
            if ((motionEvent.getSource() & 2) != 0) {
                float f3 = this.n.r() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.n.q() ? motionEvent.getAxisValue(10) : 0.0f;
                i = 0;
                z = false;
                f = f3;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                axisValue = motionEvent.getAxisValue(26);
                if (this.n.r()) {
                    float f4 = -axisValue;
                    axisValue = 0.0f;
                    f = f4;
                } else if (!this.n.q()) {
                    axisValue = 0.0f;
                }
                i = 26;
                z = this.a2;
            } else {
                axisValue = 0.0f;
                i = 0;
                z = false;
            }
            int i3 = (int) (f * this.C1);
            int i4 = (int) (axisValue * this.B1);
            if (z) {
                OverScroller overScroller = this.E1.c;
                A0((overScroller.getFinalX() - overScroller.getCurrX()) + i4, (overScroller.getFinalY() - overScroller.getCurrY()) + i3, null, Integer.MIN_VALUE, true);
            } else {
                b bVar = this.n;
                if (bVar == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else if (!this.x) {
                    int[] iArr = this.U1;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zQ = bVar.q();
                    boolean zR = this.n.r();
                    int i5 = zR ? (zQ ? 1 : 0) | 2 : zQ ? 1 : 0;
                    float y = motionEvent.getY();
                    float x = motionEvent.getX();
                    int iQ0 = i4 - q0(y, i4);
                    int iR0 = i3 - r0(x, i3);
                    getScrollingChildHelper().h(i5, 1);
                    if (A(zQ ? iQ0 : 0, zR ? iR0 : 0, 1, this.U1, this.R1)) {
                        iQ0 -= iArr[0];
                        iR0 -= iArr[1];
                    }
                    w0(zQ ? iQ0 : 0, zR ? iR0 : 0, motionEvent, 1);
                    let letVar = this.F1;
                    if (letVar != null && (iQ0 != 0 || iR0 != 0)) {
                        letVar.a(this, iQ0, iR0);
                    }
                    F0(1);
                }
            }
            if (i != 0 && !z) {
                this.c2.a(motionEvent, i);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (!this.x) {
            this.r = null;
            if (L(motionEvent)) {
                VelocityTracker velocityTracker = this.s1;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                F0(0);
                p0();
                setScrollState(0);
                return true;
            }
            b bVar = this.n;
            if (bVar != null) {
                boolean zQ = bVar.q();
                boolean zR = this.n.r();
                VelocityTracker velocityTrackerObtain = this.s1;
                if (velocityTrackerObtain == null) {
                    velocityTrackerObtain = VelocityTracker.obtain();
                    this.s1 = velocityTrackerObtain;
                }
                velocityTrackerObtain.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.y) {
                        this.y = false;
                    }
                    this.r1 = motionEvent.getPointerId(0);
                    int x = (int) (motionEvent.getX() + 0.5f);
                    this.v1 = x;
                    this.t1 = x;
                    int y = (int) (motionEvent.getY() + 0.5f);
                    this.w1 = y;
                    this.u1 = y;
                    EdgeEffect edgeEffect = this.l1;
                    if (edgeEffect == null || qbc.O(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z = false;
                    } else {
                        qbc.U(this.l1, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z = true;
                    }
                    EdgeEffect edgeEffect2 = this.n1;
                    if (edgeEffect2 != null && qbc.O(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        qbc.U(this.n1, 0.0f, motionEvent.getY() / getHeight());
                        z = true;
                    }
                    EdgeEffect edgeEffect3 = this.m1;
                    if (edgeEffect3 != null && qbc.O(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        qbc.U(this.m1, 0.0f, motionEvent.getX() / getWidth());
                        z = true;
                    }
                    EdgeEffect edgeEffect4 = this.o1;
                    if (edgeEffect4 != null && qbc.O(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        qbc.U(this.o1, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z = true;
                    }
                    if (z || this.q1 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        F0(1);
                    }
                    int[] iArr = this.S1;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    D0(0);
                } else if (actionMasked == 1) {
                    this.s1.clear();
                    F0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.r1);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.r1 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.q1 != 1) {
                        int i = x2 - this.t1;
                        int i3 = y2 - this.u1;
                        if (!zQ || Math.abs(i) <= this.x1) {
                            z2 = false;
                        } else {
                            this.v1 = x2;
                            z2 = true;
                        }
                        if (zR && Math.abs(i3) > this.x1) {
                            this.w1 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    VelocityTracker velocityTracker2 = this.s1;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                    F0(0);
                    p0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.r1 = motionEvent.getPointerId(actionIndex);
                    int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.v1 = x3;
                    this.t1 = x3;
                    int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.w1 = y3;
                    this.u1 = y3;
                } else if (actionMasked == 6) {
                    i0(motionEvent);
                }
                if (this.q1 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i3, int i4, int i5) {
        Trace.beginSection("RV OnLayout");
        x();
        Trace.endSection();
        this.u = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i3) {
        b bVar = this.n;
        if (bVar == null) {
            v(i, i3);
            return;
        }
        boolean zX = bVar.X();
        boolean z = false;
        the0 the0Var = this.H1;
        if (zX) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.n.b.v(i, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.X1 = z;
            if (z || this.m == null) {
                return;
            }
            if (the0Var.d == 1) {
                y();
            }
            this.n.K0(i, i3);
            the0Var.i = true;
            z();
            this.n.M0(i, i3);
            if (this.n.P0()) {
                this.n.K0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                the0Var.i = true;
                z();
                this.n.M0(i, i3);
            }
            this.Y1 = getMeasuredWidth();
            this.Z1 = getMeasuredHeight();
            return;
        }
        if (this.t) {
            this.n.b.v(i, i3);
            return;
        }
        if (this.A) {
            C0();
            g0();
            m0();
            h0(true);
            if (the0Var.k) {
                the0Var.g = true;
            } else {
                this.e.p();
                the0Var.g = false;
            }
            this.A = false;
            E0(false);
        } else if (the0Var.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        yge0 yge0Var = this.m;
        if (yge0Var != null) {
            the0Var.e = yge0Var.d();
        } else {
            the0Var.e = 0;
        }
        C0();
        this.n.b.v(i, i3);
        E0(false);
        the0Var.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (c0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.d = savedState;
        super.onRestoreInstanceState(savedState.f45367a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.d;
        if (savedState2 != null) {
            savedState.c = savedState2.c;
            return savedState;
        }
        b bVar = this.n;
        if (bVar != null) {
            savedState.c = bVar.v0();
            return savedState;
        }
        savedState.c = null;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i3, int i4, int i5) {
        super.onSizeChanged(i, i3, i4, i5);
        if (i == i4 && i3 == i5) {
            return;
        }
        this.o1 = null;
        this.m1 = null;
        this.n1 = null;
        this.l1 = null;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x010f A[PHI: r1
  0x010f: PHI (r1v46 int) = (r1v30 int), (r1v50 int) binds: [B:56:0x00fa, B:61:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zL;
        boolean z;
        if (!this.x && !this.y) {
            khe0 khe0Var = this.r;
            if (khe0Var == null) {
                zL = motionEvent.getAction() == 0 ? false : L(motionEvent);
            } else {
                khe0Var.a(this, motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.r = null;
                }
                zL = true;
            }
            if (zL) {
                VelocityTracker velocityTracker = this.s1;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
                F0(0);
                p0();
                setScrollState(0);
                return true;
            }
            b bVar = this.n;
            if (bVar != null) {
                boolean zQ = bVar.q();
                boolean zR = this.n.r();
                if (this.s1 == null) {
                    this.s1 = VelocityTracker.obtain();
                }
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                int[] iArr = this.S1;
                if (actionMasked == 0) {
                    iArr[1] = 0;
                    iArr[0] = 0;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.offsetLocation(iArr[0], iArr[1]);
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        this.s1.addMovement(motionEventObtain);
                        this.s1.computeCurrentVelocity(1000, this.A1);
                        float f = zQ ? -this.s1.getXVelocity(this.r1) : 0.0f;
                        float f3 = zR ? -this.s1.getYVelocity(this.r1) : 0.0f;
                        if ((f == 0.0f && f3 == 0.0f) || !Q((int) f, (int) f3)) {
                            setScrollState(0);
                        }
                        VelocityTracker velocityTracker2 = this.s1;
                        if (velocityTracker2 != null) {
                            velocityTracker2.clear();
                        }
                        F0(0);
                        p0();
                    } else if (actionMasked == 2) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.r1);
                        if (iFindPointerIndex < 0) {
                            Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.r1 + " not found. Did any MotionEvents get skipped?");
                            return false;
                        }
                        int x = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                        int y = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                        int iMax = this.v1 - x;
                        int iMax2 = this.w1 - y;
                        if (this.q1 != 1) {
                            if (zQ) {
                                int i = this.x1;
                                iMax = iMax > 0 ? Math.max(0, iMax - i) : Math.min(0, iMax + i);
                                if (iMax != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            } else {
                                z = false;
                            }
                            if (zR) {
                                int i3 = this.x1;
                                iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i3) : Math.min(0, iMax2 + i3);
                                if (iMax2 != 0) {
                                    z = true;
                                }
                            }
                            if (z) {
                                setScrollState(1);
                            }
                        }
                        if (this.q1 == 1) {
                            int[] iArr2 = this.U1;
                            iArr2[0] = 0;
                            iArr2[1] = 0;
                            int iQ0 = iMax - q0(motionEvent.getY(), iMax);
                            int iR0 = iMax2 - r0(motionEvent.getX(), iMax2);
                            boolean zA = A(zQ ? iQ0 : 0, zR ? iR0 : 0, 0, this.U1, this.R1);
                            int[] iArr3 = this.R1;
                            if (zA) {
                                iQ0 -= iArr2[0];
                                iR0 -= iArr2[1];
                                iArr[0] = iArr[0] + iArr3[0];
                                iArr[1] = iArr[1] + iArr3[1];
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            int i4 = iQ0;
                            int i5 = iR0;
                            this.v1 = x - iArr3[0];
                            this.w1 = y - iArr3[1];
                            if (w0(zQ ? i4 : 0, zR ? i5 : 0, motionEvent, 0)) {
                                getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            let letVar = this.F1;
                            if (letVar != null && (i4 != 0 || i5 != 0)) {
                                letVar.a(this, i4, i5);
                            }
                        }
                    } else if (actionMasked == 3) {
                        VelocityTracker velocityTracker3 = this.s1;
                        if (velocityTracker3 != null) {
                            velocityTracker3.clear();
                        }
                        F0(0);
                        p0();
                        setScrollState(0);
                    } else if (actionMasked == 5) {
                        this.r1 = motionEvent.getPointerId(actionIndex);
                        int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                        this.v1 = x2;
                        this.t1 = x2;
                        int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                        this.w1 = y2;
                        this.u1 = y2;
                    } else if (actionMasked == 6) {
                        i0(motionEvent);
                    }
                    motionEventObtain.recycle();
                    return true;
                }
                this.r1 = motionEvent.getPointerId(0);
                int x3 = (int) (motionEvent.getX() + 0.5f);
                this.v1 = x3;
                this.t1 = x3;
                int y3 = (int) (motionEvent.getY() + 0.5f);
                this.w1 = y3;
                this.u1 = y3;
                D0(0);
                this.s1.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return true;
            }
        }
        return false;
    }

    public final void p(String str) {
        if (!c0()) {
            if (this.j1 > 0) {
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(H()));
            }
        } else if (str == null) {
            jf4.n("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(H()));
        } else {
            jf4.n(str);
        }
    }

    public final void p0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.l1;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.l1.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.m1;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.m1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.n1;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.n1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.o1;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.o1.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final int q0(float f, int i) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.l1;
        float f3 = 0.0f;
        if (edgeEffect == null || qbc.O(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.n1;
            if (edgeEffect2 != null && qbc.O(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                EdgeEffect edgeEffect3 = this.n1;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float fU = qbc.U(edgeEffect3, width, height);
                    if (qbc.O(this.n1) == 0.0f) {
                        this.n1.onRelease();
                    }
                    f3 = fU;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            EdgeEffect edgeEffect4 = this.l1;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -qbc.U(edgeEffect4, -width, 1.0f - height);
                if (qbc.O(this.l1) == 0.0f) {
                    this.l1.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getWidth());
    }

    public final void r() {
        iac iacVar = this.f;
        int iH = iacVar.h();
        for (int i = 0; i < iH; i++) {
            xhe0 xhe0VarX = X(iacVar.g(i));
            if (!xhe0VarX.r()) {
                xhe0VarX.d = -1;
                xhe0VarX.g = -1;
            }
        }
        msj msjVar = this.c;
        ArrayList arrayList = (ArrayList) msjVar.c;
        ArrayList arrayList2 = (ArrayList) msjVar.e;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            xhe0 xhe0Var = (xhe0) arrayList2.get(i3);
            xhe0Var.d = -1;
            xhe0Var.g = -1;
        }
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            xhe0 xhe0Var2 = (xhe0) arrayList.get(i4);
            xhe0Var2.d = -1;
            xhe0Var2.g = -1;
        }
        ArrayList arrayList3 = (ArrayList) msjVar.d;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                xhe0 xhe0Var3 = (xhe0) ((ArrayList) msjVar.d).get(i5);
                xhe0Var3.d = -1;
                xhe0Var3.g = -1;
            }
        }
    }

    public final int r0(float f, int i) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.m1;
        float f3 = 0.0f;
        if (edgeEffect == null || qbc.O(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.o1;
            if (edgeEffect2 != null && qbc.O(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                EdgeEffect edgeEffect3 = this.o1;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float fU = qbc.U(edgeEffect3, height, 1.0f - width);
                    if (qbc.O(this.o1) == 0.0f) {
                        this.o1.onRelease();
                    }
                    f3 = fU;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            EdgeEffect edgeEffect4 = this.m1;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f4 = -qbc.U(edgeEffect4, -height, width);
                if (qbc.O(this.m1) == 0.0f) {
                    this.m1.onRelease();
                }
                f3 = f4;
            }
            invalidate();
        }
        return Math.round(f3 * getHeight());
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        xhe0 xhe0VarX = X(view);
        if (xhe0VarX != null) {
            if (xhe0VarX.m()) {
                xhe0VarX.j &= -257;
            } else if (!xhe0VarX.r()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(xhe0VarX);
                c99.q(sb, H());
                return;
            }
        } else if (d2) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            c99.q(sb2, H());
            return;
        }
        view.clearAnimation();
        w(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        she0 she0Var = this.n.e;
        if ((she0Var == null || !she0Var.e) && !c0() && view2 != null) {
            v0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.n.E0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((khe0) arrayList.get(i)).e(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.v != 0 || this.x) {
            this.w = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s(int i, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.l1;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.l1.onRelease();
            zIsFinished = this.l1.isFinished();
        }
        EdgeEffect edgeEffect2 = this.n1;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.n1.onRelease();
            zIsFinished |= this.n1.isFinished();
        }
        EdgeEffect edgeEffect3 = this.m1;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.m1.onRelease();
            zIsFinished |= this.m1.isFinished();
        }
        EdgeEffect edgeEffect4 = this.o1;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.o1.onRelease();
            zIsFinished |= this.o1.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void s0(fhe0 fhe0Var) {
        b bVar = this.n;
        if (bVar != null) {
            bVar.n("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        arrayList.remove(fhe0Var);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        e0();
        requestLayout();
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i3) {
        b bVar = this.n;
        if (bVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.x) {
            return;
        }
        boolean zQ = bVar.q();
        boolean zR = this.n.r();
        if (zQ || zR) {
            if (!zQ) {
                i = 0;
            }
            if (!zR) {
                i3 = 0;
            }
            w0(i, i3, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!c0()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.z |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    public void setAccessibilityDelegateCompat(zhe0 zhe0Var) {
        this.O1 = zhe0Var;
        rgu0.o(this, zhe0Var);
    }

    public void setAdapter(yge0 yge0Var) {
        setLayoutFrozen(false);
        yge0 yge0Var2 = this.m;
        c cVar = this.b;
        if (yge0Var2 != null) {
            yge0Var2.y(cVar);
            this.m.q(this);
        }
        ehe0 ehe0Var = this.p1;
        if (ehe0Var != null) {
            ehe0Var.e();
        }
        b bVar = this.n;
        msj msjVar = this.c;
        if (bVar != null) {
            bVar.A0(msjVar);
            this.n.B0(msjVar);
        }
        ((ArrayList) msjVar.c).clear();
        msjVar.i();
        fp fpVar = this.e;
        fpVar.K((ArrayList) fpVar.d);
        fpVar.K((ArrayList) fpVar.e);
        fpVar.b = 0;
        yge0 yge0Var3 = this.m;
        this.m = yge0Var;
        if (yge0Var != null) {
            yge0Var.v(cVar);
            yge0Var.m(this);
        }
        b bVar2 = this.n;
        if (bVar2 != null) {
            bVar2.e0(this.m);
        }
        yge0 yge0Var4 = this.m;
        ((ArrayList) msjVar.c).clear();
        msjVar.i();
        msjVar.h(yge0Var3, true);
        nhe0 nhe0VarD = msjVar.d();
        if (yge0Var3 != null) {
            nhe0VarD.b--;
        }
        if (nhe0VarD.b == 0) {
            nhe0VarD.a();
        }
        if (yge0Var4 != null) {
            nhe0VarD.b++;
        }
        msjVar.g();
        this.H1.f = true;
        n0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(che0 che0Var) {
        if (che0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.h) {
            this.o1 = null;
            this.m1 = null;
            this.n1 = null;
            this.l1 = null;
        }
        this.h = z;
        super.setClipToPadding(z);
        if (this.u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(dhe0 dhe0Var) {
        dhe0Var.getClass();
        this.k1 = dhe0Var;
        this.o1 = null;
        this.m1 = null;
        this.n1 = null;
        this.l1 = null;
    }

    public void setHasFixedSize(boolean z) {
        this.t = z;
    }

    public void setItemAnimator(ehe0 ehe0Var) {
        ehe0 ehe0Var2 = this.p1;
        if (ehe0Var2 != null) {
            ehe0Var2.e();
            this.p1.f7804a = null;
        }
        this.p1 = ehe0Var;
        if (ehe0Var != null) {
            ehe0Var.f7804a = this.M1;
        }
    }

    public void setItemViewCacheSize(int i) {
        msj msjVar = this.c;
        msjVar.f22322a = i;
        msjVar.q();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(b bVar) {
        RecyclerView recyclerView;
        if (bVar == this.n) {
            return;
        }
        G0();
        b bVar2 = this.n;
        msj msjVar = this.c;
        if (bVar2 != null) {
            ehe0 ehe0Var = this.p1;
            if (ehe0Var != null) {
                ehe0Var.e();
            }
            this.n.A0(msjVar);
            this.n.B0(msjVar);
            ((ArrayList) msjVar.c).clear();
            msjVar.i();
            if (this.s) {
                b bVar3 = this.n;
                bVar3.g = false;
                bVar3.g0(this, msjVar);
            }
            this.n.N0(null);
            this.n = null;
        } else {
            ((ArrayList) msjVar.c).clear();
            msjVar.i();
        }
        iac iacVar = this.f;
        iacVar.b.y();
        ArrayList arrayList = iacVar.c;
        int size = arrayList.size() - 1;
        while (true) {
            recyclerView = (RecyclerView) iacVar.f14431a.b;
            if (size < 0) {
                break;
            }
            xhe0 xhe0VarX = X((View) arrayList.get(size));
            if (xhe0VarX != null) {
                int i = xhe0VarX.p;
                if (recyclerView.c0()) {
                    xhe0VarX.q = i;
                    recyclerView.V1.add(xhe0VarX);
                } else {
                    xhe0VarX.f40887a.setImportantForAccessibility(i);
                }
                xhe0VarX.p = 0;
            }
            arrayList.remove(size);
            size--;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.w(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.n = bVar;
        if (bVar != null) {
            if (bVar.b != null) {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(bVar);
                String strH = bVar.b.H();
                sb.append(" is already attached to a RecyclerView:");
                sb.append(strH);
                throw new IllegalArgumentException(sb.toString());
            }
            bVar.N0(this);
            if (this.s) {
                b bVar4 = this.n;
                bVar4.g = true;
                bVar4.f0(this);
            }
        }
        msjVar.q();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
        } else {
            jf4.o("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().g(z);
    }

    public void setOnFlingListener(jhe0 jhe0Var) {
        this.y1 = jhe0Var;
    }

    @Deprecated
    public void setOnScrollListener(lhe0 lhe0Var) {
        this.I1 = lhe0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.D1 = z;
    }

    public void setRecycledViewPool(nhe0 nhe0Var) {
        msj msjVar = this.c;
        RecyclerView recyclerView = (RecyclerView) msjVar.h;
        msjVar.h(recyclerView.m, false);
        nhe0 nhe0Var2 = (nhe0) msjVar.g;
        if (nhe0Var2 != null) {
            nhe0Var2.b--;
        }
        msjVar.g = nhe0Var;
        if (nhe0Var != null && recyclerView.getAdapter() != null) {
            ((nhe0) msjVar.g).b++;
        }
        msjVar.g();
    }

    public void setScrollState(int i) {
        she0 she0Var;
        if (i == this.q1) {
            return;
        }
        if (e2) {
            StringBuilder sbM = b1j.m(i, "setting scroll state to ", " from ");
            sbM.append(this.q1);
            Log.d("RecyclerView", sbM.toString(), new Exception());
        }
        this.q1 = i;
        if (i != 2) {
            whe0 whe0Var = this.E1;
            whe0Var.g.removeCallbacks(whe0Var);
            whe0Var.c.abortAnimation();
            b bVar = this.n;
            if (bVar != null && (she0Var = bVar.e) != null) {
                she0Var.h();
            }
        }
        b bVar2 = this.n;
        if (bVar2 != null) {
            bVar2.w0(i);
        }
        j0(i);
        lhe0 lhe0Var = this.I1;
        if (lhe0Var != null) {
            lhe0Var.b(this, i);
        }
        ArrayList arrayList = this.J1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((lhe0) this.J1.get(size)).b(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.x1 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.x1 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(vhe0 vhe0Var) {
        this.c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.x) {
            p("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.x = true;
                this.y = true;
                G0();
                return;
            }
            this.x = false;
            if (this.w && this.n != null && this.m != null) {
                requestLayout();
            }
            this.w = false;
        }
    }

    public final void t0() {
        int itemDecorationCount = getItemDecorationCount();
        if (itemDecorationCount <= 0) {
            v4i0.m(twn.m(itemDecorationCount, "0 is an invalid index for size "));
            return;
        }
        int itemDecorationCount2 = getItemDecorationCount();
        if (itemDecorationCount2 > 0) {
            s0((fhe0) this.p.get(0));
        } else {
            v4i0.m(twn.m(itemDecorationCount2, "0 is an invalid index for size "));
        }
    }

    public final void u() {
        if (!this.u || this.g1) {
            Trace.beginSection("RV FullInvalidate");
            x();
            Trace.endSection();
            return;
        }
        fp fpVar = this.e;
        if (fpVar.z()) {
            int i = fpVar.b;
            if ((i & 4) == 0 || (i & 11) != 0) {
                if (fpVar.z()) {
                    Trace.beginSection("RV FullInvalidate");
                    x();
                    Trace.endSection();
                    return;
                }
                return;
            }
            Trace.beginSection("RV PartialInvalidate");
            C0();
            g0();
            fpVar.I();
            if (!this.w) {
                iac iacVar = this.f;
                int iE = iacVar.e();
                for (int i3 = 0; i3 < iE; i3++) {
                    xhe0 xhe0VarX = X(iacVar.d(i3));
                    if (xhe0VarX != null && !xhe0VarX.r() && xhe0VarX.n()) {
                        x();
                    }
                }
                fpVar.l();
            }
            E0(true);
            h0(true);
            Trace.endSection();
        }
    }

    public void u0(lhe0 lhe0Var) {
        ArrayList arrayList = this.J1;
        if (arrayList != null) {
            arrayList.remove(lhe0Var);
        }
    }

    public final void v(int i, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = rgu0.f30456a;
        setMeasuredDimension(b.t(i, paddingRight, getMinimumWidth()), b.t(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final void v0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof hhe0) {
            hhe0 hhe0Var = (hhe0) layoutParams;
            if (!hhe0Var.c) {
                Rect rect2 = hhe0Var.b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.n.E0(this, view, this.j, !this.u, view2 == null);
    }

    public final void w(View view) {
        xhe0 xhe0VarX = X(view);
        yge0 yge0Var = this.m;
        if (yge0Var != null && xhe0VarX != null) {
            yge0Var.t(xhe0VarX);
        }
        ArrayList arrayList = this.f1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ihe0) this.f1.get(size)).b(view);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe A[DONT_INVERT, PHI: r7
  0x00fe: PHI (r7v9 boolean) = (r7v7 boolean), (r7v10 boolean) binds: [B:33:0x00e5, B:31:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0111  */
    public final boolean w0(int i, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        boolean z2;
        boolean z3;
        u();
        yge0 yge0Var = this.m;
        int[] iArr = this.U1;
        if (yge0Var != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            x0(i, i3, iArr);
            i5 = iArr[0];
            i6 = iArr[1];
            i7 = i - i5;
            i8 = i3 - i6;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.p.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        B(i5, i6, i7, i8, this.R1, i4, iArr);
        int i9 = iArr[0];
        int i10 = i7 - i9;
        int i11 = iArr[1];
        int i12 = i8 - i11;
        boolean z4 = (i9 == 0 && i11 == 0) ? false : true;
        int i13 = this.v1;
        int[] iArr2 = this.R1;
        int i14 = iArr2[0];
        this.v1 = i13 - i14;
        int i15 = this.w1;
        int i16 = iArr2[1];
        this.w1 = i15 - i16;
        int[] iArr3 = this.S1;
        iArr3[0] = iArr3[0] + i14;
        iArr3[1] = iArr3[1] + i16;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || q5x.N(motionEvent, 8194)) {
                z = true;
                z2 = false;
            } else {
                float x = motionEvent.getX();
                float f = i10;
                float y = motionEvent.getY();
                float f3 = i12;
                if (f < 0.0f) {
                    E();
                    z = true;
                    z2 = false;
                    qbc.U(this.l1, (-f) / getWidth(), 1.0f - (y / getHeight()));
                } else {
                    z = true;
                    z2 = false;
                    if (f > 0.0f) {
                        F();
                        qbc.U(this.n1, f / getWidth(), y / getHeight());
                    } else {
                        z3 = false;
                    }
                    if (f3 < 0.0f) {
                        G();
                        qbc.U(this.m1, (-f3) / getHeight(), x / getWidth());
                    } else if (f3 > 0.0f) {
                        D();
                        qbc.U(this.o1, f3 / getHeight(), 1.0f - (x / getWidth()));
                    } else {
                        if (z3 || f != 0.0f || f3 != 0.0f) {
                            postInvalidateOnAnimation();
                        }
                        if (Build.VERSION.SDK_INT >= 31 && q5x.N(motionEvent, 4194304)) {
                            p0();
                        }
                    }
                    z3 = z;
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        p0();
                    }
                }
                z3 = z;
                if (f3 < 0.0f) {
                    G();
                    qbc.U(this.m1, (-f3) / getHeight(), x / getWidth());
                } else if (f3 > 0.0f) {
                    D();
                    qbc.U(this.o1, f3 / getHeight(), 1.0f - (x / getWidth()));
                } else {
                    if (z3) {
                        postInvalidateOnAnimation();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    if (Build.VERSION.SDK_INT >= 31) {
                        p0();
                    }
                }
                z3 = z;
                if (z3) {
                    postInvalidateOnAnimation();
                } else {
                    postInvalidateOnAnimation();
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    p0();
                }
            }
            s(i, i3);
        } else {
            z = true;
            z2 = false;
        }
        if (i5 != 0 || i6 != 0) {
            C(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z4 && i5 == 0 && i6 == 0) ? z2 : z;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x027f  */
    /* JADX WARN: Code duplicated, block: B:163:0x034e  */
    /* JADX WARN: Code duplicated, block: B:182:0x038c  */
    /* JADX WARN: Code duplicated, block: B:184:0x038f  */
    /* JADX WARN: Code duplicated, block: B:190:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:192:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:195:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:198:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:201:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:204:0x03c6 A[LOOP:4: B:197:0x03b3->B:204:0x03c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:207:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:210:0x03da  */
    /* JADX WARN: Code duplicated, block: B:213:0x03e4 A[LOOP:5: B:206:0x03d1->B:213:0x03e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:243:0x03c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x03c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x03c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x03e7 A[EDGE_INSN: B:246:0x03e7->B:214:0x03e7 BREAK  A[LOOP:5: B:206:0x03d1->B:213:0x03e4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x03e2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void x() {
        boolean z;
        long j;
        xhe0 xhe0Var;
        int i;
        int iB;
        int i3;
        int iMin;
        xhe0 xhe0VarO;
        View view;
        xhe0 xhe0VarO2;
        View view2;
        int i4;
        View viewFindViewById;
        View view3;
        boolean z2;
        nuj0 nuj0Var;
        eld0 eld0Var;
        boolean zG;
        boolean z3;
        if (this.m == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.n == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        the0 the0Var = this.H1;
        boolean z4 = false;
        the0Var.i = false;
        boolean z5 = true;
        Object[] objArr = this.X1 && !(this.Y1 == getWidth() && this.Z1 == getHeight());
        this.Y1 = 0;
        this.Z1 = 0;
        this.X1 = false;
        if (the0Var.d == 1) {
            y();
            this.n.J0(this);
            z();
        } else {
            fp fpVar = this.e;
            if ((((ArrayList) fpVar.e).isEmpty() || ((ArrayList) fpVar.d).isEmpty()) && !objArr == true && this.n.n == getWidth() && this.n.o == getHeight()) {
                this.n.J0(this);
            } else {
                this.n.J0(this);
                z();
            }
        }
        the0Var.a(4);
        C0();
        g0();
        the0Var.d = (byte) 1;
        boolean z6 = the0Var.j;
        iac iacVar = this.f;
        msj msjVar = this.c;
        trm0 trm0Var = this.g;
        if (z6) {
            int iE = iacVar.e() - 1;
            while (iE >= 0) {
                xhe0 xhe0VarX = X(iacVar.d(iE));
                if (xhe0VarX.r()) {
                    z3 = z5;
                } else {
                    long jT = T(xhe0VarX);
                    this.p1.getClass();
                    eld0 eld0Var2 = new eld0((byte) 10);
                    eld0Var2.b(xhe0VarX);
                    u710 u710Var = (u710) trm0Var.c;
                    z3 = z5;
                    nuj0 nuj0Var2 = (nuj0) trm0Var.b;
                    xhe0 xhe0Var2 = (xhe0) u710Var.b(jT);
                    if (xhe0Var2 == null || xhe0Var2.r()) {
                        trm0Var.c(xhe0VarX, eld0Var2);
                    } else {
                        mhu0 mhu0Var = (mhu0) nuj0Var2.get(xhe0Var2);
                        boolean z7 = (mhu0Var == null || (mhu0Var.f21815a & 1) == 0) ? z4 : z3;
                        mhu0 mhu0Var2 = (mhu0) nuj0Var2.get(xhe0VarX);
                        boolean z8 = (mhu0Var2 == null || (mhu0Var2.f21815a & 1) == 0) ? z4 : z3;
                        if (z7 && xhe0Var2 == xhe0VarX) {
                            trm0Var.c(xhe0VarX, eld0Var2);
                        } else {
                            eld0 eld0VarN = trm0Var.n(xhe0Var2, 4);
                            trm0Var.c(xhe0VarX, eld0Var2);
                            eld0 eld0VarN2 = trm0Var.n(xhe0VarX, 8);
                            if (eld0VarN == null) {
                                int iE2 = iacVar.e();
                                for (int i5 = 0; i5 < iE2; i5++) {
                                    xhe0 xhe0VarX2 = X(iacVar.d(i5));
                                    if (xhe0VarX2 != xhe0VarX && T(xhe0VarX2) == jT) {
                                        yge0 yge0Var = this.m;
                                        if (yge0Var == null || !yge0Var.b) {
                                            StringBuilder sb = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb.append(xhe0VarX2);
                                            sb.append(" \n View Holder 2:");
                                            sb.append(xhe0VarX);
                                            itt0.n(sb, H());
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb2.append(xhe0VarX2);
                                        sb2.append(" \n View Holder 2:");
                                        sb2.append(xhe0VarX);
                                        itt0.n(sb2, H());
                                        return;
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + xhe0Var2 + " cannot be found but it is necessary for " + xhe0VarX + H());
                            } else {
                                xhe0Var2.q(false);
                                if (z7) {
                                    l(xhe0Var2);
                                }
                                if (xhe0Var2 != xhe0VarX) {
                                    if (z8) {
                                        l(xhe0VarX);
                                    }
                                    xhe0Var2.h = xhe0VarX;
                                    l(xhe0Var2);
                                    msjVar.p(xhe0Var2);
                                    xhe0VarX.q(false);
                                    xhe0VarX.i = xhe0Var2;
                                }
                                if (this.p1.a(xhe0Var2, xhe0VarX, eld0VarN, eld0VarN2)) {
                                    l0();
                                }
                            }
                        }
                    }
                }
                iE--;
                z5 = z3;
                z4 = false;
            }
            z = z5;
            nuj0 nuj0Var3 = (nuj0) trm0Var.b;
            int i6 = nuj0Var3.c - 1;
            while (i6 >= 0) {
                xhe0 xhe0Var3 = (xhe0) nuj0Var3.f(i6);
                mhu0 mhu0Var3 = (mhu0) nuj0Var3.g(i6);
                int i7 = mhu0Var3.f21815a;
                int i8 = i7 & 3;
                nr00 nr00Var = this.b2;
                if (i8 == 3) {
                    RecyclerView recyclerView = (RecyclerView) nr00Var.f23980a;
                    recyclerView.n.C0(xhe0Var3.f40887a, recyclerView.c);
                } else if ((i7 & 1) != 0) {
                    eld0 eld0Var3 = mhu0Var3.b;
                    if (eld0Var3 == null) {
                        RecyclerView recyclerView2 = (RecyclerView) nr00Var.f23980a;
                        recyclerView2.n.C0(xhe0Var3.f40887a, recyclerView2.c);
                    } else {
                        nr00Var.k(xhe0Var3, eld0Var3, mhu0Var3.c);
                    }
                } else if ((i7 & 14) == 14) {
                    nr00Var.j(xhe0Var3, mhu0Var3.b, mhu0Var3.c);
                } else {
                    if ((i7 & 12) == 12) {
                        eld0 eld0Var4 = mhu0Var3.b;
                        eld0 eld0Var5 = mhu0Var3.c;
                        nr00Var.getClass();
                        xhe0Var3.q(false);
                        RecyclerView recyclerView3 = (RecyclerView) nr00Var.f23980a;
                        boolean z9 = recyclerView3.g1;
                        ehe0 ehe0Var = recyclerView3.p1;
                        if (!z9) {
                            kvj kvjVar = (kvj) ehe0Var;
                            kvjVar.getClass();
                            int i9 = eld0Var4.b;
                            int i10 = eld0Var5.b;
                            if (i9 == i10) {
                                nuj0Var = nuj0Var3;
                                if (eld0Var4.c == eld0Var5.c) {
                                    kvjVar.c(xhe0Var3);
                                    zG = false;
                                }
                                if (zG) {
                                    recyclerView3.l0();
                                }
                            } else {
                                nuj0Var = nuj0Var3;
                            }
                            zG = kvjVar.g(xhe0Var3, i9, eld0Var4.c, i10, eld0Var5.c);
                            if (zG) {
                                recyclerView3.l0();
                            }
                        } else if (ehe0Var.a(xhe0Var3, xhe0Var3, eld0Var4, eld0Var5)) {
                            recyclerView3.l0();
                        }
                        eld0Var = null;
                    } else {
                        nuj0Var = nuj0Var3;
                        if ((i7 & 4) != 0) {
                            eld0Var = null;
                            nr00Var.k(xhe0Var3, mhu0Var3.b, null);
                        } else {
                            eld0Var = null;
                            if ((i7 & 8) != 0) {
                                nr00Var.j(xhe0Var3, mhu0Var3.b, mhu0Var3.c);
                            }
                        }
                    }
                    mhu0Var3.f21815a = 0;
                    mhu0Var3.b = eld0Var;
                    mhu0Var3.c = eld0Var;
                    mhu0.d.c(mhu0Var3);
                    i6--;
                    nuj0Var3 = nuj0Var;
                }
                nuj0Var = nuj0Var3;
                eld0Var = null;
                mhu0Var3.f21815a = 0;
                mhu0Var3.b = eld0Var;
                mhu0Var3.c = eld0Var;
                mhu0.d.c(mhu0Var3);
                i6--;
                nuj0Var3 = nuj0Var;
            }
        } else {
            z = true;
        }
        View view4 = null;
        this.n.B0(msjVar);
        the0Var.b = the0Var.e;
        this.g1 = false;
        this.h1 = false;
        the0Var.j = false;
        the0Var.k = false;
        this.n.f = false;
        ArrayList arrayList = (ArrayList) msjVar.d;
        if (arrayList != null) {
            arrayList.clear();
        }
        b bVar = this.n;
        if (bVar.k) {
            bVar.j = 0;
            bVar.k = false;
            msjVar.q();
        }
        this.n.t0(the0Var);
        boolean z10 = z;
        h0(z10);
        E0(false);
        ((nuj0) trm0Var.b).clear();
        ((u710) trm0Var.c).a();
        int[] iArr = this.P1;
        int i11 = iArr[0];
        int i12 = iArr[z10 ? 1 : 0];
        M(iArr);
        if (iArr[0] != i11 || iArr[z10 ? 1 : 0] != i12) {
            C(0, 0);
        }
        if (this.D1 && this.m != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = the0Var.m;
                if (j == -1) {
                    xhe0Var = null;
                } else {
                    xhe0Var = null;
                }
                if (xhe0Var != null) {
                    view3 = xhe0Var.f40887a;
                    if (!iacVar.c.contains(view3)) {
                        if (iacVar.e() > 0) {
                            i = the0Var.l;
                            if (i == -1) {
                                i = 0;
                            }
                            iB = the0Var.b();
                            i3 = i;
                            while (true) {
                                if (i3 < iB) {
                                    xhe0VarO2 = O(i3);
                                    if (xhe0VarO2 != null) {
                                        view2 = xhe0VarO2.f40887a;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i3++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i) - 1; iMin >= 0; iMin--) {
                                    xhe0VarO = O(iMin);
                                    if (xhe0VarO == null) {
                                        break;
                                        break;
                                    }
                                    view = xhe0VarO.f40887a;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (iacVar.e() > 0) {
                        i = the0Var.l;
                        if (i == -1) {
                            i = 0;
                        }
                        iB = the0Var.b();
                        i3 = i;
                        while (true) {
                            if (i3 < iB) {
                                xhe0VarO2 = O(i3);
                                if (xhe0VarO2 != null) {
                                    view2 = xhe0VarO2.f40887a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                xhe0VarO = O(iMin);
                                if (xhe0VarO == null) {
                                    break;
                                    break;
                                }
                                view = xhe0VarO.f40887a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (iacVar.e() > 0) {
                    i = the0Var.l;
                    if (i == -1) {
                        i = 0;
                    }
                    iB = the0Var.b();
                    i3 = i;
                    while (true) {
                        if (i3 < iB) {
                            xhe0VarO2 = O(i3);
                            if (xhe0VarO2 != null) {
                                view2 = xhe0VarO2.f40887a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            xhe0VarO = O(iMin);
                            if (xhe0VarO == null) {
                                break;
                                break;
                            }
                            view = xhe0VarO.f40887a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i4 = the0Var.n;
                    if (i4 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (iacVar.c.contains(getFocusedChild())) {
                j = the0Var.m;
                if (j == -1 && (z2 = this.m.b) && z2) {
                    int iH = iacVar.h();
                    xhe0Var = null;
                    for (int i13 = 0; i13 < iH; i13++) {
                        xhe0 xhe0VarX3 = X(iacVar.g(i13));
                        if (xhe0VarX3 != null && !xhe0VarX3.k() && xhe0VarX3.e == j) {
                            if (!iacVar.c.contains(xhe0VarX3.f40887a)) {
                                xhe0Var = xhe0VarX3;
                                break;
                            }
                            xhe0Var = xhe0VarX3;
                        }
                    }
                } else {
                    xhe0Var = null;
                }
                if (xhe0Var != null) {
                    view3 = xhe0Var.f40887a;
                    if (!iacVar.c.contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (iacVar.e() > 0) {
                        i = the0Var.l;
                        if (i == -1) {
                            i = 0;
                        }
                        iB = the0Var.b();
                        i3 = i;
                        while (true) {
                            if (i3 < iB) {
                                xhe0VarO2 = O(i3);
                                if (xhe0VarO2 != null) {
                                    view2 = xhe0VarO2.f40887a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                xhe0VarO = O(iMin);
                                if (xhe0VarO == null) {
                                    break;
                                }
                                view = xhe0VarO.f40887a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (iacVar.e() > 0) {
                    i = the0Var.l;
                    if (i == -1) {
                        i = 0;
                    }
                    iB = the0Var.b();
                    i3 = i;
                    while (true) {
                        if (i3 < iB) {
                            xhe0VarO2 = O(i3);
                            if (xhe0VarO2 != null) {
                                view2 = xhe0VarO2.f40887a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            xhe0VarO = O(iMin);
                            if (xhe0VarO == null) {
                                break;
                                break;
                            }
                            view = xhe0VarO.f40887a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i4 = the0Var.n;
                    if (i4 != -1 && (viewFindViewById = view4.findViewById(i4)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        the0Var.m = -1L;
        the0Var.l = -1;
        the0Var.n = -1;
    }

    public final void x0(int i, int i3, int[] iArr) {
        xhe0 xhe0Var;
        C0();
        g0();
        Trace.beginSection("RV Scroll");
        the0 the0Var = this.H1;
        I(the0Var);
        msj msjVar = this.c;
        int iG0 = i != 0 ? this.n.G0(i, msjVar, the0Var) : 0;
        int iI0 = i3 != 0 ? this.n.I0(i3, msjVar, the0Var) : 0;
        Trace.endSection();
        iac iacVar = this.f;
        int iE = iacVar.e();
        for (int i4 = 0; i4 < iE; i4++) {
            View viewD = iacVar.d(i4);
            xhe0 xhe0VarW = W(viewD);
            if (xhe0VarW != null && (xhe0Var = xhe0VarW.i) != null) {
                View view = xhe0Var.f40887a;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        h0(true);
        E0(false);
        if (iArr != null) {
            iArr[0] = iG0;
            iArr[1] = iI0;
        }
    }

    public final void y() {
        mhu0 mhu0Var;
        View viewK;
        the0 the0Var = this.H1;
        the0Var.a(1);
        I(the0Var);
        the0Var.i = false;
        C0();
        trm0 trm0Var = this.g;
        nuj0 nuj0Var = (nuj0) trm0Var.b;
        nuj0 nuj0Var2 = (nuj0) trm0Var.b;
        nuj0Var.clear();
        u710 u710Var = (u710) trm0Var.c;
        u710Var.a();
        g0();
        m0();
        xhe0 xhe0VarW = null;
        View focusedChild = (this.D1 && hasFocus() && this.m != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewK = K(focusedChild)) != null) {
            xhe0VarW = W(viewK);
        }
        if (xhe0VarW == null) {
            the0Var.m = -1L;
            the0Var.l = -1;
            the0Var.n = -1;
        } else {
            the0Var.m = this.m.b ? xhe0VarW.e : -1L;
            the0Var.l = this.g1 ? -1 : xhe0VarW.k() ? xhe0VarW.d : xhe0VarW.c();
            View focusedChild2 = xhe0VarW.f40887a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            the0Var.n = id;
        }
        the0Var.h = the0Var.j && this.L1;
        this.L1 = false;
        this.K1 = false;
        the0Var.g = the0Var.k;
        the0Var.e = this.m.d();
        M(this.P1);
        boolean z = the0Var.j;
        byte b = 10;
        iac iacVar = this.f;
        if (z) {
            int iE = iacVar.e();
            for (int i = 0; i < iE; i++) {
                xhe0 xhe0VarX = X(iacVar.d(i));
                if (!xhe0VarX.r() && (!xhe0VarX.i() || this.m.b)) {
                    ehe0 ehe0Var = this.p1;
                    ehe0.b(xhe0VarX);
                    xhe0VarX.f();
                    ehe0Var.getClass();
                    eld0 eld0Var = new eld0(b);
                    eld0Var.b(xhe0VarX);
                    mhu0 mhu0VarA = (mhu0) nuj0Var2.get(xhe0VarX);
                    if (mhu0VarA == null) {
                        mhu0VarA = mhu0.a();
                        nuj0Var2.put(xhe0VarX, mhu0VarA);
                    }
                    mhu0VarA.b = eld0Var;
                    mhu0VarA.f21815a |= 4;
                    if (the0Var.h && xhe0VarX.n() && !xhe0VarX.k() && !xhe0VarX.r() && !xhe0VarX.i()) {
                        u710Var.f(xhe0VarX, T(xhe0VarX));
                    }
                }
            }
        }
        if (the0Var.k) {
            int iH = iacVar.h();
            for (int i3 = 0; i3 < iH; i3++) {
                xhe0 xhe0VarX2 = X(iacVar.g(i3));
                if (d2 && xhe0VarX2.c == -1 && !xhe0VarX2.k()) {
                    jf4.n("view holder cannot have position -1 unless it is removed".concat(H()));
                    return;
                }
                if (!xhe0VarX2.r() && xhe0VarX2.d == -1) {
                    xhe0VarX2.d = xhe0VarX2.c;
                }
            }
            boolean z2 = the0Var.f;
            the0Var.f = false;
            this.n.s0(this.c, the0Var);
            the0Var.f = z2;
            for (int i4 = 0; i4 < iacVar.e(); i4++) {
                xhe0 xhe0VarX3 = X(iacVar.d(i4));
                if (!xhe0VarX3.r() && ((mhu0Var = (mhu0) nuj0Var2.get(xhe0VarX3)) == null || (mhu0Var.f21815a & 4) == 0)) {
                    ehe0.b(xhe0VarX3);
                    boolean z3 = (xhe0VarX3.j & 8192) != 0;
                    ehe0 ehe0Var2 = this.p1;
                    xhe0VarX3.f();
                    ehe0Var2.getClass();
                    eld0 eld0Var2 = new eld0(b);
                    eld0Var2.b(xhe0VarX3);
                    if (z3) {
                        o0(xhe0VarX3, eld0Var2);
                    } else {
                        mhu0 mhu0VarA2 = (mhu0) nuj0Var2.get(xhe0VarX3);
                        if (mhu0VarA2 == null) {
                            mhu0VarA2 = mhu0.a();
                            nuj0Var2.put(xhe0VarX3, mhu0VarA2);
                        }
                        mhu0VarA2.f21815a |= 2;
                        mhu0VarA2.b = eld0Var2;
                    }
                }
            }
            r();
        } else {
            r();
        }
        h0(true);
        E0(false);
        the0Var.d = (byte) 2;
    }

    public final void y0(int i) {
        if (this.x) {
            return;
        }
        G0();
        b bVar = this.n;
        if (bVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            bVar.H0(i);
            awakenScrollBars();
        }
    }

    public final void z() {
        C0();
        g0();
        the0 the0Var = this.H1;
        the0Var.a(6);
        this.e.p();
        the0Var.e = this.m.d();
        the0Var.c = 0;
        if (this.d != null) {
            yge0 yge0Var = this.m;
            int iE = hne.E(yge0Var.c);
            if (iE == 1 ? yge0Var.d() > 0 : iE != 2) {
                Parcelable parcelable = this.d.c;
                if (parcelable != null) {
                    this.n.u0(parcelable);
                }
                this.d = null;
            }
        }
        the0Var.g = false;
        this.n.s0(this.c, the0Var);
        the0Var.f = false;
        the0Var.j = the0Var.j && this.p1 != null;
        the0Var.d = (byte) 4;
        h0(true);
        E0(false);
    }

    public final boolean z0(EdgeEffect edgeEffect, int i, int i3) {
        if (i > 0) {
            return true;
        }
        float fO = qbc.O(edgeEffect) * i3;
        float fAbs = Math.abs(-i) * 0.35f;
        float f = this.f45398a * 0.015f;
        double dLog = Math.log(fAbs / f);
        double d = g2;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f))) < fO;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        b bVar = this.n;
        if (bVar != null) {
            return bVar.G(layoutParams);
        }
        jf4.n("RecyclerView has no LayoutManager".concat(H()));
        return null;
    }

    @Deprecated
    public void setRecyclerListener(ohe0 ohe0Var) {
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, org.xbet.client1.R.attr.recyclerViewStyle);
    }

    public RecyclerView(Context context) {
        this(context, null);
    }
}
