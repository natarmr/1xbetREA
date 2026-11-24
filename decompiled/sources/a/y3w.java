package a;

import android.content.ComponentCallbacks2;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/y3w;", "La/nw5;", "La/qa7;", "<init>", "()V", "a/sqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class y3w extends nw5<qa7> {
    public final phf0 e2 = new phf0("REQUEST_KEY");
    public final yzn0 f2 = new yzn0("BUNDLE_HISTORY_ITEM");
    public final cgx0 g2 = new cgx0("BUNDLE_IS_BONUS_BALANCE");
    public final cgx0 h2 = new cgx0("BUNDLE_HIDE_EDIT");
    public final yzn0 i2 = new yzn0("TYPE_HISTORY_SCREEN");
    public fiu0 j2;
    public final kiu0 k2;
    public final nae0 l2;
    public final a8z m2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(y3w.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(y3w.class, "historyItem", "getHistoryItem()Lorg/xplatform/bethistory/domain/model/HistoryItemModel;", 0), new ez40(y3w.class, "isBonusBalance", "isBonusBalance()Z", 0), new ez40(y3w.class, "hideEdit", "getHideEdit()Z", 0), new ez40(y3w.class, "typeHistoryScreen", "getTypeHistoryScreen()Lorg/xplatform/bethistory/domain/model/TypeHistoryScreen;", 0), new j0d0(y3w.class, "binding", "getBinding()Lorg/xplatform/bethistory/impl/databinding/BetInfoDialogBinding;", 0)};
    public static final sqt n2 = new sqt();

    public y3w() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.v3w
            public final /* synthetic */ y3w b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                y3w y3wVar = this.b;
                switch (b2) {
                    case 0:
                        fiu0 fiu0Var = y3wVar.j2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        sqt sqtVar = y3w.n2;
                        t3t t3tVar = new t3t(y3wVar, (byte) 24);
                        z3w z3wVar = new z3w();
                        ((dp) z3wVar.e).b(new gbn(new x2w((byte) 1), new pkv(3, (byte) 14), new t3t(t3tVar, (byte) 25), btv.j));
                        return z3wVar;
                }
            }
        };
        t7t t7tVar = new t7t(this, (byte) 26);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new t7t(t7tVar, (byte) 27));
        this.k2 = agc.G(this, sre0.f32672a.b(b4w.class), new qwv(a8zVarA, (byte) 10), new qwv(a8zVarA, (byte) 11), function0);
        this.l2 = ltt0.p(this, w3w.f38518a);
        final byte b2 = 1;
        this.m2 = maz.a(wezVar, new Function0(this) { // from class: a.v3w
            public final /* synthetic */ y3w b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                y3w y3wVar = this.b;
                switch (b3) {
                    case 0:
                        fiu0 fiu0Var = y3wVar.j2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        sqt sqtVar = y3w.n2;
                        t3t t3tVar = new t3t(y3wVar, (byte) 24);
                        z3w z3wVar = new z3w();
                        ((dp) z3wVar.e).b(new gbn(new x2w((byte) 1), new pkv(3, (byte) 14), new t3t(t3tVar, (byte) 25), btv.j));
                        return z3wVar;
                }
            }
        });
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final void O0() throws Exception {
        L0().b.setLayoutManager(new LinearLayoutManager(B()));
        L0().b.m(new vwk(epv0.U(R.drawable.menu_divider_drawable, o0()), G().getDimensionPixelOffset(R.dimen.space_16)));
        L0().b.setAdapter((z3w) this.m2.getValue());
        kiu0 kiu0Var = this.k2;
        xae0 xae0VarN = vtb.N(((b4w) kiu0Var.getValue()).g);
        yje yjeVar = null;
        x3w x3wVar = new x3w(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r1w(xae0VarN, clzVarW, x3wVar, (yje) null), 3);
        vae0 vae0VarM = vtb.M(((b4w) kiu0Var.getValue()).h);
        x3w x3wVar2 = new x3w(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new r1w(vae0VarM, clzVarW2, x3wVar2, (yje) null), 3);
    }

    @Override // a.nw5
    public final void P0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(u3w.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            u3w u3wVar = (u3w) (ze3Var instanceof u3w ? ze3Var : null);
            if (u3wVar != null) {
                iiy[] iiyVarArr = o2;
                n3w n3wVar = (n3w) this.f2.n(this, iiyVarArr[1]);
                Boolean boolN = this.h2.n(this, iiyVarArr[3]);
                Boolean boolN2 = this.g2.n(this, iiyVarArr[2]);
                sys0 sys0Var = (sys0) this.i2.n(this, iiyVarArr[4]);
                fsd fsdVar = u3wVar.f35016a;
                iw20 iw20Var = u3wVar.b;
                fsdVar.getClass();
                this.j2 = new fiu0(Collections.singletonMap(b4w.class, (tii) new uii(iw20Var, sys0Var, n3wVar, boolN, boolN2).f));
                return;
            }
        }
        jf4.n(b1j.i(u3w.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.parent;
    }

    @Override // a.nw5
    public final String S0() {
        String string = G().getString(R.string.select_action);
        string.getClass();
        return string;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final qa7 L0() {
        Object objN = this.l2.n(o2[5], this);
        objN.getClass();
        return (qa7) objN;
    }
}
