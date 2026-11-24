package a;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class sr0 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32652a;
    public final Object b;
    public final Object c;

    public sr0(Rational rational, Rational rational2) {
        this.f32652a = (byte) 1;
        this.c = rational2 == null ? new Rational(4, 3) : rational2;
        this.b = b(rational);
    }

    public static float a(RectF rectF, RectF rectF2) {
        return (rectF.width() < rectF2.width() ? rectF.width() : rectF2.width()) * (rectF.height() < rectF2.height() ? rectF.height() : rectF2.height());
    }

    public RectF b(Rational rational) {
        float fFloatValue = rational.floatValue();
        Rational rational2 = (Rational) this.c;
        if (fFloatValue == rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
        }
        return rational.floatValue() > rational2.floatValue() ? new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator()) : new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    /* JADX WARN: Code duplicated, block: B:130:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:? A[LOOP:1: B:30:0x0091->B:132:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:? A[LOOP:3: B:72:0x016c->B:138:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x007c  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:38:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x015b  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0177  */
    /* JADX WARN: Code duplicated, block: B:79:0x0187  */
    /* JADX WARN: Code duplicated, block: B:80:0x018a  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v22 java.lang.Object, still in use, count: 2, list:
          (r0v22 java.lang.Object) from 0x0157: PHI (r0 I:??) = (r0v16 java.lang.Object), (r0v22 java.lang.Object) binds: [B:66:0x0156, B:133:0x0157] A[DONT_GENERATE, DONT_INLINE]
          (r0v22 java.lang.Object) from 0x014f: CHECK_CAST (kotlin.collections.IndexedValue) (r0v22 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.util.Comparator
    public final int compare(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sr0.compare(java.lang.Object, java.lang.Object):int");
    }

    public sr0(tub0 tub0Var, g7k0 g7k0Var) {
        this.f32652a = (byte) 5;
        this.c = tub0Var;
        this.b = g7k0Var;
    }

    public /* synthetic */ sr0(Object obj, Object obj2, byte b) {
        this.f32652a = b;
        this.b = obj;
        this.c = obj2;
    }
}
