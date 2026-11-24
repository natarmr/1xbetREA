package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/f7g;", "La/stl;", "La/b7g;", "<init>", "()V", "a/nwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f7g extends stl<b7g> {
    public xdi g2;
    public ii h2;
    public g2v i2;
    public final nae0 j2 = ltt0.p(this, d7g.f5590a);
    public final kiu0 k2;
    public final a8z l2;
    public final khf0 m2;
    public boolean n2;
    public static final /* synthetic */ iiy[] p2 = {new j0d0(f7g.class, "binding", "getBinding()Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarDisciplinesDialogBinding;", 0), new ez40(f7g.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;", 0)};
    public static final nwd o2 = new nwd();

    public f7g() {
        c7g c7gVar = new c7g(this, (byte) 1);
        aqe aqeVar = new aqe(this, (byte) 28);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new aqe(aqeVar, (byte) 29));
        this.k2 = agc.G(this, sre0.f32672a.b(j7g.class), new cce(a8zVarA, (byte) 28), new cce(a8zVarA, (byte) 29), c7gVar);
        this.l2 = maz.a(wezVar, new c7g(this, (byte) 2));
        this.m2 = new khf0("PARAMS_KEY");
    }

    @Override // a.stl
    public final void T0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(y6g.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            y6g y6gVar = (y6g) (ze3Var instanceof y6g ? ze3Var : null);
            if (y6gVar != null) {
                CyberCalendarParams cyberCalendarParams = (CyberCalendarParams) this.m2.n(this, p2[1]);
                sjl0 sjl0Var = y6gVar.f42094a;
                g2v g2vVar = y6gVar.b;
                ii iiVar = y6gVar.e;
                mne mneVar = y6gVar.c;
                ctf0 ctf0Var = y6gVar.d;
                duj dujVar = y6gVar.f;
                ul9 ul9Var = cyberCalendarParams.d ? y6gVar.h : y6gVar.g;
                iiVar.getClass();
                sjl0Var.getClass();
                ctf0Var.getClass();
                ul9Var.getClass();
                this.g2 = (xdi) ((n5d0) new qgd(iiVar, sjl0Var, g2vVar, mneVar, ctf0Var, dujVar, ul9Var).h).get();
                this.h2 = iiVar;
                this.i2 = g2vVar;
                return;
            }
        }
        jf4.n(b1j.i(y6g.class, "Cannot create dependency "));
    }

    @Override // a.stl
    public final void U0() throws Exception {
        j7g j7gVarW0 = W0();
        p5a p5aVarH = ulb.H(new dnq(new s6n0(j7gVarW0.j, new wib(j7gVarW0, null, (byte) 15)), new e00(j7gVarW0, null, (byte) 18), (byte) 0));
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new b5g(p5aVarH, clzVarW, null, (byte) 3), 3);
        ol60 ol60Var = W0().n;
        e7g e7gVar = new e7g(this, null, (byte) 0);
        lkz lkzVar2 = lkz.f20223a;
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fze(ol60Var, clzVarW2, e7gVar, (yje) null), 3);
    }

    @Override // a.stl
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final b7g Q0() {
        Object objN = this.j2.n(p2[0], this);
        objN.getClass();
        return (b7g) objN;
    }

    public final j7g W0() {
        return (j7g) this.k2.getValue();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        if (this.n2) {
            Q0().e.getEditText().requestFocus();
            Context contextO0 = o0();
            TextInputEditText editText = Q0().e.getEditText();
            editText.getClass();
            new Handler(Looper.getMainLooper()).postDelayed(new fy2(contextO0, editText, (byte) 2), 500L);
        }
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void h0() {
        this.n2 = Q0().e.getEditText().isFocused();
        super.h0();
    }

    @Override // a.stl, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        Window window = D0().getWindow();
        if (window != null) {
            window.setSoftInputMode(32);
        }
        BottomSheetBehavior bottomSheetBehavior = this.c2;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.K = true;
        }
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.N(3);
        }
        Q0().e.getEditText().setImeOptions(3);
        hxm0.y(Q0().e.getEditText(), new c7g(this, (byte) 0));
        Q0().e.getEditText().addTextChangedListener(new jt6(this, (byte) 3));
        Q0().d.setLayoutManager(new LinearLayoutManager(Q0().d.getContext(), 1, false));
        Q0().d.setAdapter((x6g) this.l2.getValue());
        Q0().d.m(new wn8(epv0.U(R.drawable.cyber_calendar_discipline_separator, o0()), (byte) 1));
        p7m0 p7m0Var = W0().k;
        e7g e7gVar = new e7g(this, null, (byte) 1);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fze(p7m0Var, clzVarW, e7gVar, (yje) null, (byte) 0), 3);
        Q0().b.setOnClickListener(new q10(this, (byte) 12));
    }
}
