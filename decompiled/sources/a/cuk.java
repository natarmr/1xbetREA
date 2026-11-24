package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/cuk;", "La/nw5;", "La/mik;", "<init>", "()V", "a/bek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cuk extends nw5<mik> {
    public kfi e2;
    public final nae0 f2 = ltt0.p(this, buk.f3234a);
    public final kiu0 g2;
    public final n0o0 h2;
    public final n0o0 i2;
    public final zz2 j2;
    public final phf0 k2;
    public static final /* synthetic */ iiy[] m2 = {new j0d0(cuk.class, "binding", "getBinding()Lorg/xplatform/special_event/impl/databinding/DialogDisciplinePickerBinding;", 0), new ez40(cuk.class, "eventId", "getEventId()I", 0), new ez40(cuk.class, "selectedDiscipline", "getSelectedDiscipline()Ljava/lang/String;", 0)};
    public static final bek l2 = new bek();

    public cuk() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.auk
            public final /* synthetic */ cuk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                cuk cukVar = this.b;
                switch (b2) {
                    case 0:
                        kfi kfiVar = cukVar.e2;
                        if (kfiVar != null) {
                            return new q0h0(kfiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    case 1:
                        bek bekVar = cuk.l2;
                        yfg yfgVar = new yfg(cukVar, (byte) 29);
                        qnk qnkVar = new qnk();
                        qnkVar.d.b(new gbn(new svj((byte) 24), new e9k(3, (byte) 6), new e3j(yfgVar, (byte) 18), zdh.s));
                        return qnkVar;
                    default:
                        bek bekVar2 = cuk.l2;
                        return new qd7(cukVar, (byte) 2);
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new v9k(new v9k(this, (byte) 19), (byte) 20));
        this.g2 = agc.G(this, sre0.f32672a.b(guk.class), new b9k(a8zVarA, (byte) 10), new b9k(a8zVarA, (byte) 11), function0);
        final byte b2 = 1;
        this.h2 = maz.b(new Function0(this) { // from class: a.auk
            public final /* synthetic */ cuk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                cuk cukVar = this.b;
                switch (b3) {
                    case 0:
                        kfi kfiVar = cukVar.e2;
                        if (kfiVar != null) {
                            return new q0h0(kfiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    case 1:
                        bek bekVar = cuk.l2;
                        yfg yfgVar = new yfg(cukVar, (byte) 29);
                        qnk qnkVar = new qnk();
                        qnkVar.d.b(new gbn(new svj((byte) 24), new e9k(3, (byte) 6), new e3j(yfgVar, (byte) 18), zdh.s));
                        return qnkVar;
                    default:
                        bek bekVar2 = cuk.l2;
                        return new qd7(cukVar, (byte) 2);
                }
            }
        });
        final byte b3 = 2;
        this.i2 = maz.b(new Function0(this) { // from class: a.auk
            public final /* synthetic */ cuk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                cuk cukVar = this.b;
                switch (b4) {
                    case 0:
                        kfi kfiVar = cukVar.e2;
                        if (kfiVar != null) {
                            return new q0h0(kfiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    case 1:
                        bek bekVar = cuk.l2;
                        yfg yfgVar = new yfg(cukVar, (byte) 29);
                        qnk qnkVar = new qnk();
                        qnkVar.d.b(new gbn(new svj((byte) 24), new e9k(3, (byte) 6), new e3j(yfgVar, (byte) 18), zdh.s));
                        return qnkVar;
                    default:
                        bek bekVar2 = cuk.l2;
                        return new qd7(cukVar, (byte) 2);
                }
            }
        });
        this.j2 = new zz2("SPECIAL_EVENT_ID_BUNDLE_KEY");
        this.k2 = new phf0("SELECTED_DISCIPLINE_ID_BUNDLE_KEY");
    }

    @Override // a.sik
    public final int B0() {
        return R.style.ThemeOverlay_AppTheme_BottomSheetDialog;
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final void P0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ztk.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ztk ztkVar = (ztk) (ze3Var instanceof ztk ? ze3Var : null);
            if (ztkVar != null) {
                iiy[] iiyVarArr = m2;
                Integer numN = this.j2.n(this, iiyVarArr[1]);
                String strN = this.k2.n(this, iiyVarArr[2]);
                String simpleName = cuk.class.getSimpleName();
                strN.getClass();
                ygm0 ygm0Var = ztkVar.f44964a;
                knf0 knf0Var = ztkVar.b;
                gii0 gii0Var = ztkVar.c;
                g2v g2vVar = ztkVar.d;
                cad cadVar = ztkVar.e;
                d1p d1pVar = ztkVar.f;
                yo4 yo4Var = ztkVar.g;
                d1pVar.getClass();
                ygm0Var.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                this.e2 = (kfi) ((n5d0) new o3c(cadVar, d1pVar, simpleName, numN, strN, ygm0Var, knf0Var, g2vVar, gii0Var, yo4Var).k).get();
                return;
            }
        }
        jf4.n(b1j.i(ztk.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.disciplinePickerDialog;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final mik L0() {
        Object objN = this.f2.n(m2[0], this);
        objN.getClass();
        return (mik) objN;
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        BottomSheetBehavior bottomSheetBehaviorM0 = M0();
        if (bottomSheetBehaviorM0 != null) {
            bottomSheetBehaviorM0.K = true;
        }
        BottomSheetBehavior bottomSheetBehaviorM1 = M0();
        if (bottomSheetBehaviorM1 != null) {
            bottomSheetBehaviorM1.N(3);
        }
        i89 i89Var = new i89(((guk) this.g2.getValue()).h, (byte) 17);
        e9g e9gVar = new e9g(this, null, (byte) 28);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new xsj(i89Var, clzVarW, e9gVar, (yje) null, (byte) 0), 3);
        L0().c.setAdapter((qnk) this.h2.getValue());
        L0().d.getEditText().setOnFocusChangeListener((View.OnFocusChangeListener) this.i2.getValue());
        L0().d.getEditText().addTextChangedListener(new jt6(this, (byte) 6));
    }
}
