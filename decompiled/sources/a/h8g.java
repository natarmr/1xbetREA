package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/h8g;", "La/stl;", "La/i8g;", "<init>", "()V", "a/kud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class h8g extends stl<i8g> {
    public aei g2;
    public g2v h2;
    public final khf0 i2 = new khf0("PARAMS_KEY");
    public final kiu0 j2;
    public final nae0 k2;
    public static final /* synthetic */ iiy[] m2 = {new ez40(h8g.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;", 0), new j0d0(h8g.class, "binding", "getBinding()Lorg/xplatform/cyber/calendar/impl/databinding/CyberCalendarMonthPickerDialogBinding;", 0)};
    public static final kud l2 = new kud();

    public h8g() {
        e8g e8gVar = new e8g(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new q7g(new q7g(this, (byte) 4), (byte) 5));
        this.j2 = agc.G(this, sre0.f32672a.b(k8g.class), new r7g(a8zVarA, (byte) 4), new r7g(a8zVarA, (byte) 5), e8gVar);
        this.k2 = ltt0.p(this, f8g.f9101a);
    }

    @Override // a.stl
    public final void T0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(c8g.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            c8g c8gVar = (c8g) (ze3Var instanceof c8g ? ze3Var : null);
            if (c8gVar != null) {
                CyberCalendarParams cyberCalendarParams = (CyberCalendarParams) this.i2.n(this, m2[0]);
                cad cadVar = c8gVar.f3912a;
                duj dujVar = c8gVar.b;
                g2v g2vVar = c8gVar.c;
                ul9 ul9Var = cyberCalendarParams.d ? c8gVar.e : c8gVar.d;
                ul9Var.getClass();
                this.g2 = (aei) ((n5d0) new nhf0(cadVar, dujVar, g2vVar, ul9Var).d).get();
                this.h2 = g2vVar;
                return;
            }
        }
        jf4.n(b1j.i(c8g.class, "Cannot create dependency "));
    }

    @Override // a.stl
    public final void U0() throws Exception {
        kiu0 kiu0Var = this.j2;
        k8g k8gVar = (k8g) kiu0Var.getValue();
        p5a p5aVarH = ulb.H(new dnq(new s6n0(k8gVar.h, new wib(k8gVar, null, (byte) 16)), new e00(k8gVar, null, (byte) 19), (byte) 0));
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new b5g(p5aVarH, clzVarW, null, (byte) 6), 3);
        p7m0 p7m0Var = ((k8g) kiu0Var.getValue()).i;
        fob fobVar = new fob(this, null, (byte) 28);
        lkz lkzVar2 = lkz.f20223a;
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new g8g(p7m0Var, clzVarW2, fobVar, (yje) null), 3);
    }

    @Override // a.stl
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final i8g Q0() {
        Object objN = this.k2.n(m2[1], this);
        objN.getClass();
        return (i8g) objN;
    }

    @Override // a.stl, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        final byte b = 0;
        dyb.O(Q0().c, new Function1(this) { // from class: a.d8g
            public final /* synthetic */ h8g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                h8g h8gVar = this.b;
                View view2 = (View) obj;
                switch (b2) {
                    case 0:
                        kud kudVar = h8g.l2;
                        view2.getClass();
                        k8g k8gVar = (k8g) h8gVar.j2.getValue();
                        sac.V(jiu0.a(k8gVar), new j8g(k8gVar, (byte) 0), null, k8gVar.f.f22085a, new u52(k8gVar, h8gVar.Q0().e.getValue(), (yje) null, (byte) 4), 10);
                        h8gVar.x0();
                        break;
                    default:
                        kud kudVar2 = h8g.l2;
                        view2.getClass();
                        h8gVar.x0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.O(Q0().b, new Function1(this) { // from class: a.d8g
            public final /* synthetic */ h8g b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                h8g h8gVar = this.b;
                View view2 = (View) obj;
                switch (b3) {
                    case 0:
                        kud kudVar = h8g.l2;
                        view2.getClass();
                        k8g k8gVar = (k8g) h8gVar.j2.getValue();
                        sac.V(jiu0.a(k8gVar), new j8g(k8gVar, (byte) 0), null, k8gVar.f.f22085a, new u52(k8gVar, h8gVar.Q0().e.getValue(), (yje) null, (byte) 4), 10);
                        h8gVar.x0();
                        break;
                    default:
                        kud kudVar2 = h8g.l2;
                        view2.getClass();
                        h8gVar.x0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        Q0().e.setOnValueChangedListener(new cnc(this, (byte) 27));
    }
}
