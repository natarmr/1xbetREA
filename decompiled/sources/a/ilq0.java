package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.NumberPicker;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/ilq0;", "La/stl;", "La/iq8;", "<init>", "()V", "a/s2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ilq0 extends stl<iq8> {
    public final nae0 g2 = ltt0.p(this, glq0.f11506a);
    public fiu0 h2;
    public final kiu0 i2;
    public final phf0 j2;
    public final phf0 k2;
    public static final /* synthetic */ iiy[] m2 = {new j0d0(ilq0.class, "binding", "getBinding()Lorg/xplatform/themesettings/impl/databinding/BottomSheetTimePickerBinding;", 0), new ez40(ilq0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(ilq0.class, "title", "getTitle()Ljava/lang/String;", 0)};
    public static final s2m0 l2 = new s2m0();

    public ilq0() {
        flq0 flq0Var = new flq0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new mfo0(new mfo0(this, (byte) 25), (byte) 26));
        this.i2 = agc.G(this, sre0.f32672a.b(nlq0.class), new r5p0(a8zVarA, (byte) 18), new r5p0(a8zVarA, (byte) 19), flq0Var);
        this.j2 = new phf0("TIME_PICKER_REQUEST_KEY");
        this.k2 = new phf0("TITLE_KEY");
    }

    @Override // a.stl
    public final void T0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(jlq0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            jlq0 jlq0Var = (jlq0) (ze3Var instanceof jlq0 ? ze3Var : null);
            if (jlq0Var != null) {
                boolean zD = Intrinsics.d(this.j2.n(this, m2[1]), "TIME_PICKER_ON_DIALOG_KEY");
                drm0 drm0Var = jlq0Var.f16730a;
                wyu wyuVar = jlq0Var.b;
                v6j0 v6j0Var = jlq0Var.c;
                wyuVar.getClass();
                v6j0Var.getClass();
                this.h2 = new fiu0(Collections.singletonMap(nlq0.class, (xvi) new kki(drm0Var, wyuVar, Boolean.valueOf(zD), v6j0Var).f));
                return;
            }
        }
        jf4.n(b1j.i(jlq0.class, "Cannot create dependency "));
    }

    @Override // a.stl
    public final void U0() throws Exception {
        p7m0 p7m0Var = W0().p;
        int i = 2;
        Class<rhy> cls = rhy.class;
        String str = "set";
        String str2 = "set(Ljava/lang/Object;)V";
        bdl0 bdl0Var = new bdl0(i, new zi90((NumberPicker) Q0().b.c, phu0.class, "isVisible", "isVisible(Landroid/view/View;)Z", 1, (byte) 2), cls, str, str2, 4, (byte) 17);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new lto0((gmq) p7m0Var, clzVarW, bdl0Var, (yje) null, (short) 0), 3);
        p7m0 p7m0Var2 = W0().j;
        Class<y860> cls2 = y860.class;
        bdl0 bdl0Var2 = new bdl0(2, (NumberPicker) Q0().b.f, cls2, "setup", "setup(Landroid/widget/NumberPicker;Lorg/xplatform/themesettings/impl/presentation/timepicker/model/NumberPickerUiModel;)V", 5, (byte) 18);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new hlq0(p7m0Var2, clzVarW2, bdl0Var2, (yje) null), 3);
        p7m0 p7m0Var3 = W0().k;
        int i2 = 5;
        int i3 = 2;
        bdl0 bdl0Var3 = new bdl0(i3, (NumberPicker) Q0().b.g, cls2, "setup", "setup(Landroid/widget/NumberPicker;Lorg/xplatform/themesettings/impl/presentation/timepicker/model/NumberPickerUiModel;)V", i2, (byte) 19);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new hlq0((gmq) p7m0Var3, clzVarW3, bdl0Var3, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var4 = W0().l;
        bdl0 bdl0Var4 = new bdl0(i3, (NumberPicker) Q0().b.c, cls2, "setup", "setup(Landroid/widget/NumberPicker;Lorg/xplatform/themesettings/impl/presentation/timepicker/model/NumberPickerUiModel;)V", i2, (byte) 20);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new hlq0((gmq) p7m0Var4, clzVarW4, bdl0Var4, (yje) null, (char) 0), 3);
        p7m0 p7m0Var5 = W0().m;
        int i4 = 4;
        Class<NumberPicker> cls3 = NumberPicker.class;
        bdl0 bdl0Var5 = new bdl0(i3, (NumberPicker) Q0().b.f, cls3, "setValue", "setValue(I)V", i4, (byte) 21);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new hlq0(p7m0Var5, clzVarW5, bdl0Var5, (yje) null, 0), 3);
        p7m0 p7m0Var6 = W0().n;
        int i5 = 4;
        int i6 = 2;
        bdl0 bdl0Var6 = new bdl0(i6, (NumberPicker) Q0().b.g, cls3, "setValue", "setValue(I)V", i5, (byte) 22);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new hlq0((gmq) p7m0Var6, clzVarW6, bdl0Var6, (yje) null, (short) 0), 3);
        p7m0 p7m0Var7 = W0().o;
        bdl0 bdl0Var7 = new bdl0(i6, (NumberPicker) Q0().b.c, cls3, "setValue", "setValue(I)V", i5, (byte) 23);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new hlq0((gmq) p7m0Var7, clzVarW7, bdl0Var7, (yje) null, (byte) 0, false), 3);
        ol60 ol60Var = W0().q;
        bdl0 bdl0Var8 = new bdl0(2, this, ilq0.class, "handleAction", "handleAction(Lorg/xplatform/themesettings/impl/presentation/timepicker/model/TimePickerAction;)V", i4, (byte) 24);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new hlq0(ol60Var, clzVarW8, bdl0Var8, (yje) null, (byte) 0, (byte) 0), 3);
    }

    @Override // a.stl
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final iq8 Q0() {
        Object objN = this.g2.n(m2[0], this);
        objN.getClass();
        return (iq8) objN;
    }

    public final nlq0 W0() {
        return (nlq0) this.i2.getValue();
    }

    @Override // a.stl, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        nlq0 nlq0VarW0 = W0();
        boolean zIs24HourFormat = DateFormat.is24HourFormat(Q0().f15197a.getContext());
        p7m0 p7m0Var = nlq0VarW0.p;
        if (!(zIs24HourFormat && ((Boolean) p7m0Var.getValue()).booleanValue()) && (zIs24HourFormat || ((Boolean) p7m0Var.getValue()).booleanValue())) {
            return;
        }
        nlq0VarW0.q.f(zkq0.f44546a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    @Override // a.stl, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        z860 z860Var;
        view.getClass();
        super.i0(view, bundle);
        nlq0 nlq0VarW0 = W0();
        boolean zIs24HourFormat = DateFormat.is24HourFormat(Q0().f15197a.getContext());
        final byte b = 0;
        final byte b2 = 1;
        if (nlq0VarW0.r) {
            vkq0 vkq0VarA = ((xyu) nlq0VarW0.c.f27815a).a(nlq0VarW0.i);
            int i = vkq0VarA.b;
            int i2 = vkq0VarA.f37587a;
            vkq0 vkq0Var = zIs24HourFormat ? new vkq0(i2, i, uhq0.c) : std.g(i2, i);
            p7m0 p7m0Var = nlq0VarW0.p;
            ?? r3 = !zIs24HourFormat;
            twn.A(r3, p7m0Var, null);
            List listR0 = iun.f15405a;
            char c = !zIs24HourFormat ? '\f' : (char) 23;
            if (r3 <= c) {
                while (true) {
                    listR0 = CollectionsKt.r0(listR0, Integer.valueOf((int) r3));
                    if (r3 == c) {
                        break;
                    } else {
                        r3++;
                    }
                }
            }
            z860 z860VarW = nlq0.w(listR0);
            if (z860VarW != null) {
                p7m0 p7m0Var2 = nlq0VarW0.j;
                p7m0Var2.getClass();
                p7m0Var2.o(null, z860VarW);
            }
            p7m0 p7m0Var3 = nlq0VarW0.l;
            if (zIs24HourFormat) {
                z860Var = new z860(0, 0, iun.f15405a);
            } else {
                uhq0 uhq0Var = uhq0.f35695a;
                uhq0 uhq0Var2 = uhq0.f35695a;
                z860Var = new z860(0, 1, q3d.j("AM", "PM"));
            }
            p7m0Var3.getClass();
            p7m0Var3.o(null, z860Var);
            p7m0 p7m0Var4 = nlq0VarW0.m;
            Integer numValueOf = Integer.valueOf(vkq0Var.f37587a);
            p7m0Var4.getClass();
            p7m0Var4.o(null, numValueOf);
            p7m0 p7m0Var5 = nlq0VarW0.n;
            Integer numValueOf2 = Integer.valueOf(vkq0Var.b);
            p7m0Var5.getClass();
            p7m0Var5.o(null, numValueOf2);
            p7m0 p7m0Var6 = nlq0VarW0.o;
            int iOrdinal = vkq0Var.c.ordinal();
            Integer numValueOf3 = Integer.valueOf((iOrdinal == 0 || iOrdinal != 1) ? 0 : 1);
            p7m0Var6.getClass();
            p7m0Var6.o(null, numValueOf3);
            nlq0VarW0.r = false;
        }
        I0(new kp8(this.k2.n(this, m2[2]), R.style.TextStyle_Title_Bold_M));
        ((NumberPicker) Q0().b.f).setOnValueChangedListener(new dlq0(this, b));
        ((NumberPicker) Q0().b.g).setOnValueChangedListener(new dlq0(this, b2));
        ((NumberPicker) Q0().b.c).setOnValueChangedListener(new dlq0(this, (byte) 2));
        Q0().c.setSecondButtonClickListener(new View.OnClickListener(this) { // from class: a.elq0
            public final /* synthetic */ ilq0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b;
                ilq0 ilq0Var = this.b;
                switch (b3) {
                    case 0:
                        s2m0 s2m0Var = ilq0.l2;
                        dyb.Q(new flq0(ilq0Var, (byte) 1));
                        break;
                    default:
                        s2m0 s2m0Var2 = ilq0.l2;
                        dyb.Q(new flq0(ilq0Var, (byte) 2));
                        break;
                }
            }
        });
        Q0().c.setFirstButtonClickListener(new View.OnClickListener(this) { // from class: a.elq0
            public final /* synthetic */ ilq0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                byte b3 = b2;
                ilq0 ilq0Var = this.b;
                switch (b3) {
                    case 0:
                        s2m0 s2m0Var = ilq0.l2;
                        dyb.Q(new flq0(ilq0Var, (byte) 1));
                        break;
                    default:
                        s2m0 s2m0Var2 = ilq0.l2;
                        dyb.Q(new flq0(ilq0Var, (byte) 2));
                        break;
                }
            }
        });
    }
}
