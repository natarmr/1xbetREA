package a;

import android.os.Bundle;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/eta0;", "La/yx5;", "<init>", "()V", "a/xi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class eta0 extends yx5 {
    public final s0r K1;
    public final a8z L1;
    public final a8z M1;
    public final a8z N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(eta0.class, "binding", "getBinding()Lorg/xplatform/feed/impl/databinding/FeedComposeFragmentBinding;", 0)};
    public static final xi70 P1 = new xi70();

    public eta0() {
        super(R.layout.feed_compose_fragment);
        this.K1 = ltt0.o(this, dta0.f6648a);
        npa0 npa0Var = new npa0((byte) 6);
        wez wezVar = wez.b;
        this.L1 = maz.a(wezVar, npa0Var);
        this.M1 = maz.a(wezVar, new bta0(this, (byte) 1));
        this.N1 = xbc.a0(this, sre0.f32672a.b(rua0.class), null, new bta0(this, (byte) 2), 14);
        this.O1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new bta0(this, (byte) 0));
        Object objN = this.K1.n(Q1[0], this);
        objN.getClass();
        pkd.i(((yhp) objN).b, null, new ugd(1937530398, true, new lma0(this, (byte) 3)));
    }

    public final k3t0 G0() {
        return (k3t0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        final byte b = 0;
        sj3.s0(this, "REQUEST_TIME_FILTER", new Function1(this) { // from class: a.cta0
            public final /* synthetic */ eta0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                eta0 eta0Var = this.b;
                switch (b2) {
                    case 0:
                        ygq0 ygq0Var = (ygq0) obj;
                        xi70 xi70Var = eta0.P1;
                        ygq0Var.getClass();
                        eta0Var.G0().x(new uqa0(ygq0Var));
                        break;
                    case 1:
                        Date date = (Date) obj;
                        xi70 xi70Var2 = eta0.P1;
                        date.getClass();
                        eta0Var.G0().x(new tqa0(date));
                        break;
                    case 2:
                        Date date2 = (Date) obj;
                        xi70 xi70Var3 = eta0.P1;
                        date2.getClass();
                        eta0Var.G0().x(new sqa0(date2));
                        break;
                    case 3:
                        i2i0 i2i0Var = (i2i0) obj;
                        xi70 xi70Var4 = eta0.P1;
                        i2i0Var.getClass();
                        eta0Var.G0().x(new tqa0(i2i0Var.f14049a));
                        eta0Var.G0().x(new sqa0(i2i0Var.b));
                        break;
                    default:
                        xi70 xi70Var5 = eta0.P1;
                        ((Bundle) obj).getClass();
                        eta0Var.G0().x(nqa0.f23950a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        sj3.s0(this, "START_DATE_SELECT_KEY", new Function1(this) { // from class: a.cta0
            public final /* synthetic */ eta0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                eta0 eta0Var = this.b;
                switch (b3) {
                    case 0:
                        ygq0 ygq0Var = (ygq0) obj;
                        xi70 xi70Var = eta0.P1;
                        ygq0Var.getClass();
                        eta0Var.G0().x(new uqa0(ygq0Var));
                        break;
                    case 1:
                        Date date = (Date) obj;
                        xi70 xi70Var2 = eta0.P1;
                        date.getClass();
                        eta0Var.G0().x(new tqa0(date));
                        break;
                    case 2:
                        Date date2 = (Date) obj;
                        xi70 xi70Var3 = eta0.P1;
                        date2.getClass();
                        eta0Var.G0().x(new sqa0(date2));
                        break;
                    case 3:
                        i2i0 i2i0Var = (i2i0) obj;
                        xi70 xi70Var4 = eta0.P1;
                        i2i0Var.getClass();
                        eta0Var.G0().x(new tqa0(i2i0Var.f14049a));
                        eta0Var.G0().x(new sqa0(i2i0Var.b));
                        break;
                    default:
                        xi70 xi70Var5 = eta0.P1;
                        ((Bundle) obj).getClass();
                        eta0Var.G0().x(nqa0.f23950a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 2;
        sj3.s0(this, "END_DATE_SELECT_KEY", new Function1(this) { // from class: a.cta0
            public final /* synthetic */ eta0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                eta0 eta0Var = this.b;
                switch (b4) {
                    case 0:
                        ygq0 ygq0Var = (ygq0) obj;
                        xi70 xi70Var = eta0.P1;
                        ygq0Var.getClass();
                        eta0Var.G0().x(new uqa0(ygq0Var));
                        break;
                    case 1:
                        Date date = (Date) obj;
                        xi70 xi70Var2 = eta0.P1;
                        date.getClass();
                        eta0Var.G0().x(new tqa0(date));
                        break;
                    case 2:
                        Date date2 = (Date) obj;
                        xi70 xi70Var3 = eta0.P1;
                        date2.getClass();
                        eta0Var.G0().x(new sqa0(date2));
                        break;
                    case 3:
                        i2i0 i2i0Var = (i2i0) obj;
                        xi70 xi70Var4 = eta0.P1;
                        i2i0Var.getClass();
                        eta0Var.G0().x(new tqa0(i2i0Var.f14049a));
                        eta0Var.G0().x(new sqa0(i2i0Var.b));
                        break;
                    default:
                        xi70 xi70Var5 = eta0.P1;
                        ((Bundle) obj).getClass();
                        eta0Var.G0().x(nqa0.f23950a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b4 = 3;
        sj3.s0(this, "SELECT_DATE_TIME_REQUEST_KEY", new Function1(this) { // from class: a.cta0
            public final /* synthetic */ eta0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b4;
                eta0 eta0Var = this.b;
                switch (b5) {
                    case 0:
                        ygq0 ygq0Var = (ygq0) obj;
                        xi70 xi70Var = eta0.P1;
                        ygq0Var.getClass();
                        eta0Var.G0().x(new uqa0(ygq0Var));
                        break;
                    case 1:
                        Date date = (Date) obj;
                        xi70 xi70Var2 = eta0.P1;
                        date.getClass();
                        eta0Var.G0().x(new tqa0(date));
                        break;
                    case 2:
                        Date date2 = (Date) obj;
                        xi70 xi70Var3 = eta0.P1;
                        date2.getClass();
                        eta0Var.G0().x(new sqa0(date2));
                        break;
                    case 3:
                        i2i0 i2i0Var = (i2i0) obj;
                        xi70 xi70Var4 = eta0.P1;
                        i2i0Var.getClass();
                        eta0Var.G0().x(new tqa0(i2i0Var.f14049a));
                        eta0Var.G0().x(new sqa0(i2i0Var.b));
                        break;
                    default:
                        xi70 xi70Var5 = eta0.P1;
                        ((Bundle) obj).getClass();
                        eta0Var.G0().x(nqa0.f23950a);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b5 = 4;
        sj3.r0(this, "DISMISS_DIALOG_KEY", new Function1(this) { // from class: a.cta0
            public final /* synthetic */ eta0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b6 = b5;
                eta0 eta0Var = this.b;
                switch (b6) {
                    case 0:
                        ygq0 ygq0Var = (ygq0) obj;
                        xi70 xi70Var = eta0.P1;
                        ygq0Var.getClass();
                        eta0Var.G0().x(new uqa0(ygq0Var));
                        break;
                    case 1:
                        Date date = (Date) obj;
                        xi70 xi70Var2 = eta0.P1;
                        date.getClass();
                        eta0Var.G0().x(new tqa0(date));
                        break;
                    case 2:
                        Date date2 = (Date) obj;
                        xi70 xi70Var3 = eta0.P1;
                        date2.getClass();
                        eta0Var.G0().x(new sqa0(date2));
                        break;
                    case 3:
                        i2i0 i2i0Var = (i2i0) obj;
                        xi70 xi70Var4 = eta0.P1;
                        i2i0Var.getClass();
                        eta0Var.G0().x(new tqa0(i2i0Var.f14049a));
                        eta0Var.G0().x(new sqa0(i2i0Var.b));
                        break;
                    default:
                        xi70 xi70Var5 = eta0.P1;
                        ((Bundle) obj).getClass();
                        eta0Var.G0().x(nqa0.f23950a);
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.O1;
    }
}
