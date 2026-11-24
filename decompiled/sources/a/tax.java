package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.StringsKt;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;

/* JADX INFO: loaded from: classes2.dex */
public final class tax extends w46 {
    public bby A;
    public boolean B;
    public boolean C;
    public final i1w0 b;
    public String c;
    public final File d;
    public final mne e;
    public final b8u f;
    public final u58 g;
    public final lme0 h;
    public final lbu i;
    public final pru j;
    public final aqt k;
    public final nv20 l;
    public final db9 m;
    public final edu n;
    public final m1e o;
    public final rqt p;
    public final gg5 q;
    public final gle0 r;
    public final bzs0 s;
    public final yox t;
    public final kys0 u;
    public final p7m0 v;
    public final qoj0 w;
    public final ol60 x;
    public c4m0 y;
    public bby z;

    public tax(vzg0 vzg0Var, i1w0 i1w0Var, String str, File file, mne mneVar, b8u b8uVar, u58 u58Var, lme0 lme0Var, lbu lbuVar, pru pruVar, aqt aqtVar, nv20 nv20Var, db9 db9Var, edu eduVar, m1e m1eVar, rqt rqtVar, r990 r990Var, gg5 gg5Var, gle0 gle0Var, bzs0 bzs0Var, yox yoxVar, kys0 kys0Var, kc60 kc60Var) {
        str.getClass();
        aqtVar.getClass();
        m1eVar.getClass();
        this.b = i1w0Var;
        this.c = str;
        this.d = file;
        this.e = mneVar;
        this.f = b8uVar;
        this.g = u58Var;
        this.h = lme0Var;
        this.i = lbuVar;
        this.j = pruVar;
        this.k = aqtVar;
        this.l = nv20Var;
        this.m = db9Var;
        this.n = eduVar;
        this.o = m1eVar;
        this.p = rqtVar;
        this.q = gg5Var;
        this.r = gle0Var;
        this.s = bzs0Var;
        this.t = yoxVar;
        this.u = kys0Var;
        this.v = q7m0.a(iun.f15405a);
        yje yjeVar = null;
        this.w = roj0.b(1, 0, null, 6);
        this.x = new ol60(3);
        this.B = true;
        sac.T(new fnq(i120.W(kc60Var.a()), new rax(this, yjeVar, (byte) 0), (byte) 4), jiu0.a(this), new rax(this, yjeVar, (byte) 1));
    }

    public final void w(y9x y9xVar, File file) {
        String str;
        dxk dxkVar;
        this.C = true;
        pru pruVar = this.j;
        o9x o9xVar = pruVar.a().m;
        int iOrdinal = y9xVar.ordinal();
        if (iOrdinal == 3) {
            str = o9xVar.t;
        } else if (iOrdinal == 9) {
            str = o9xVar.y;
        } else if (iOrdinal != 17) {
            switch (iOrdinal) {
                case 11:
                    str = o9xVar.v;
                    break;
                case 12:
                    str = o9xVar.w;
                    break;
                case 13:
                    str = o9xVar.A;
                    break;
                case 14:
                    str = o9xVar.z;
                    break;
                default:
                    switch (iOrdinal) {
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            str = o9xVar.k;
                            break;
                        case 20:
                            str = o9xVar.l;
                            break;
                        case 21:
                            str = o9xVar.D;
                            break;
                        case 22:
                            str = o9xVar.x;
                            break;
                        case 23:
                            str = o9xVar.F;
                            break;
                        case 24:
                            str = o9xVar.H;
                            break;
                        default:
                            str = "";
                            break;
                    }
                    break;
            }
        } else {
            str = o9xVar.B;
        }
        boolean z = pruVar.a().p0;
        boolean zO = StringsKt.O(str, "https://", false);
        i1w0 i1w0Var = this.b;
        if (!zO || !z) {
            if (StringsKt.O(str, "https://", false)) {
                this.x.f(new nax(str));
                return;
            }
            if (str.length() > 0) {
                i1w0Var.d(new kax(this, y9xVar, str));
                return;
            }
            int iOrdinal2 = y9xVar.ordinal();
            if (iOrdinal2 == 3) {
                dxkVar = dxk.FULL_DOC_RULES;
            } else if (iOrdinal2 == 9) {
                dxkVar = dxk.PRIVACY_POLICY_DOC_RULES;
            } else if (iOrdinal2 == 18) {
                dxkVar = dxk.MARKETS_DOC_RULES;
            } else if (iOrdinal2 == 23) {
                dxkVar = dxk.PAYMENT_CARD_SECURITY_DOC_RULES;
            } else if (iOrdinal2 != 24) {
                switch (iOrdinal2) {
                    case 11:
                        dxkVar = dxk.BETTING_PROCEDURES_DOC_RULES;
                        break;
                    case 12:
                        dxkVar = dxk.REQUEST_POLICY_DOC_RULES;
                        break;
                    case 13:
                        dxkVar = dxk.PERSONAL_DATA_POLICY_DOC_RULES;
                        break;
                    case 14:
                        dxkVar = dxk.EXCEPTION_AGGREGATOR_BONUS_DOC_RULES;
                        break;
                    default:
                        dxkVar = dxk.EMPTY;
                        break;
                }
            } else {
                dxkVar = dxk.POLITICALLY_EXPOSED_DOC_RULES;
            }
            dxk dxkVar2 = dxkVar;
            this.z = sac.V(jiu0.a(this), new adw(this, (byte) 12), new y2x(this, (byte) 2), this.e.f22085a, new wmq((Object) this, (Object) file, false, (Object) dxkVar2, (yje) null, (byte) 9), 8);
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        this.t.getClass();
        FragmentScreen paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1 = new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str);
        if (paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1 instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(paymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1)));
        }
        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
