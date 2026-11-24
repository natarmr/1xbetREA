package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.treasure.presentation.views.NineTreasuresView;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/nps0;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nps0 extends yx5 {
    public static final /* synthetic */ iiy[] O1 = {new j0d0(nps0.class, "binding", "getBinding()Lorg/xplatform/bonus_games/impl/databinding/FragmentTreasureBinding;", 0)};
    public final i9o0 K1;
    public fiu0 L1;
    public final kiu0 M1;
    public final s0r N1;

    public nps0() {
        super(R.layout.fragment_treasure);
        this.K1 = i9o0.f14396a;
        qir0 qir0Var = new qir0(this, (byte) 20);
        a8z a8zVarA = maz.a(wez.b, new moq0(new moq0(this, (byte) 26), (byte) 27));
        this.M1 = agc.G(this, sre0.f32672a.b(cqs0.class), new p7r0(a8zVarA, (byte) 20), new p7r0(a8zVarA, (byte) 21), qir0Var);
        this.N1 = ltt0.o(this, mps0.f22192a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Drawable drawable;
        G0().c.setOnSelectedListener(new ilp0(this));
        s470 s470Var = ((cqs0) this.M1.getValue()).b;
        NineTreasuresView nineTreasuresView = G0().c;
        s470Var.getClass();
        int iOrdinal = s470Var.ordinal();
        int[] iArr = aqd0.d;
        if (iOrdinal == 2) {
            Context context = nineTreasuresView.getContext();
            context.getClass();
            ox50 ox50Var = new ox50(context, null, 0);
            ox50Var.f25995a = 24;
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, iArr, 0, 0);
            typedArrayObtainStyledAttributes.getClass();
            try {
                ox50Var.f25995a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 16);
                typedArrayObtainStyledAttributes.recycle();
                Iterator it = l1e0.o(0, 9).iterator();
                while (((kkx) it).c) {
                    int iNextInt = ((bkx) it).nextInt();
                    htg0 htg0Var = new htg0(context);
                    htg0Var.setListener(ox50Var);
                    htg0Var.setOnClickListener(new nva(ox50Var, iNextInt, (byte) 3));
                    ox50Var.addView(htg0Var);
                }
                ox50Var.setMotionEventSplittingEnabled(false);
                nineTreasuresView.addView(ox50Var);
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            if (iOrdinal != 3) {
                e9d0.o();
                return;
            }
            Context context2 = nineTreasuresView.getContext();
            context2.getClass();
            nx50 nx50Var = new nx50(context2, null, 0);
            nx50Var.b = new htz();
            nx50Var.c = 8;
            nx50Var.d = mx50.f22536a;
            TypedArray typedArrayObtainStyledAttributes2 = context2.getTheme().obtainStyledAttributes(null, iArr, 0, 0);
            typedArrayObtainStyledAttributes2.getClass();
            try {
                nx50Var.c = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 16);
                typedArrayObtainStyledAttributes2.recycle();
                for (int i = 0; i < 9; i++) {
                    Context context3 = nx50Var.getContext();
                    context3.getClass();
                    z9c z9cVar = new z9c(context3);
                    nx50Var.addView(z9cVar);
                    dyb.O(z9cVar, new z08(nx50Var, i, (byte) 12));
                    z9cVar.setListener(nx50Var);
                }
                nineTreasuresView.addView(nx50Var);
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes2.recycle();
                throw th2;
            }
        }
        KeyEvent.Callback childAt = nineTreasuresView.getChildAt(0);
        dqs0 dqs0Var = childAt instanceof dqs0 ? (dqs0) childAt : null;
        nineTreasuresView.f46443a = dqs0Var;
        rh60 rh60Var = nineTreasuresView.b;
        if (rh60Var != null && dqs0Var != null) {
            dqs0Var.setOnSelectedListener(rh60Var);
        }
        ImageView imageView = G0().b;
        int iOrdinal2 = s470Var.ordinal();
        if (iOrdinal2 == 2) {
            drawable = o0().getDrawable(R.drawable.ic_safe_money);
        } else {
            if (iOrdinal2 != 3) {
                e9d0.o();
                return;
            }
            drawable = o0().getDrawable(R.drawable.ic_chest_gold);
        }
        imageView.setBackground(drawable);
    }

    @Override // a.yx5
    public final void C0() {
        iyi iyiVar;
        Fragment fragment = this.y;
        pps0 pps0Var = fragment instanceof pps0 ? (pps0) fragment : null;
        if (pps0Var == null || (iyiVar = (iyi) pps0Var.U1.getValue()) == null) {
            return;
        }
        this.L1 = new fiu0(Collections.singletonMap(cqs0.class, iyiVar.j));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.M1;
        p7m0 p7m0Var = ((cqs0) kiu0Var.getValue()).l;
        rtq0 rtq0Var = new rtq0(this, null, (byte) 13);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new tsr0((gmq) p7m0Var, clzVarW, rtq0Var, (yje) null, (short) 0), 3);
        p7m0 p7m0Var2 = ((cqs0) kiu0Var.getValue()).m;
        k6s0 k6s0Var = new k6s0(this, null, (byte) 3);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new tsr0(p7m0Var2, clzVarW2, k6s0Var, (yje) null), 3);
    }

    public final i6r G0() {
        Object objN = this.N1.n(O1[0], this);
        objN.getClass();
        return (i6r) objN;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
