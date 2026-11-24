package a;

import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.security.api.presentation.models.SendEmailIntention;
import org.xplatform.security.impl.presentation.email.send_code.model.CheckEmailScreenParams;
import org.xplatform.security.impl.presentation.email.send_code.screen.CheckEmailCodeScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class rxf0 extends bnn0 implements Function2 {
    public String i;
    public SendEmailIntention.RestorePassword j;
    public byte k;
    public final /* synthetic */ sxf0 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ we50 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxf0(sxf0 sxf0Var, String str, we50 we50Var, yje yjeVar) {
        super(2, yjeVar);
        this.l = sxf0Var;
        this.m = str;
        this.n = we50Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new rxf0(this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rxf0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00e5 A[LOOP:0: B:29:0x00dc->B:31:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f9 A[EDGE_INSN: B:35:0x00f9->B:33:0x00f9 BREAK  A[LOOP:0: B:29:0x00dc->B:31:0x00e5], SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String str;
        swp0 swp0Var;
        SendEmailIntention.RestorePassword restorePassword;
        SendEmailIntention.RestorePassword restorePassword2;
        ListIterator listIteratorO;
        paw pawVar;
        sxf0 sxf0Var = this.l;
        i1w0 i1w0Var = sxf0Var.c;
        wne wneVar = wne.f39444a;
        byte b = this.k;
        String str2 = this.m;
        if (b == 0) {
            z1x.P(obj);
            sxf0Var.k.f31532a.a("login_lost_pass", wp20.b(new Pair("option", "email")));
            str = str2.length() == 0 ? sxf0Var.u : str2;
            this.i = str;
            this.k = (byte) 1;
            obj = ntb.K(new vsg0(new nv(new fnq(sxf0Var.h.a(new p6a("RepairPassword", "", "")), new tye0(sxf0Var, null, (byte) 10), (byte) 4), null, (byte) 6)), this);
            if (obj != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            str = this.i;
            z1x.P(obj);
        } else {
            if (b == 2) {
                z1x.P(obj);
                swp0Var = (swp0) obj;
                restorePassword = new SendEmailIntention.RestorePassword(str2, this.n);
                if (sxf0Var.m.f15225a.a()) {
                    xzb xzbVar = sxf0Var.e;
                    this.i = null;
                    this.j = restorePassword;
                    this.k = (byte) 3;
                    obj = xzbVar.a(swp0Var, true, this);
                    if (obj != wneVar) {
                        restorePassword2 = restorePassword;
                    }
                    return wneVar;
                }
                i1w0Var.d(new zlb0(sxf0Var, restorePassword, swp0Var, (byte) 19));
                return Unit.f46060a;
            }
            if (b != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            restorePassword2 = this.j;
            z1x.P(obj);
        }
        pfi0 pfi0Var = (pfi0) obj;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        k0w0VarI.h(new CheckEmailCodeScreen(new CheckEmailScreenParams.RestorePassword(pfi0Var.b, pfi0Var.f26908a, restorePassword2)));
        listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            pawVar = (paw) listIteratorO;
            if (pawVar.hasNext()) {
                break;
            }
            i1w0Var.a((oe50) pawVar.next());
        }
        return Unit.f46060a;
        ynb0 ynb0Var = (ynb0) obj;
        ljf0 ljf0Var = sxf0Var.g;
        String str3 = ynb0Var.b;
        String str4 = ynb0Var.f42933a;
        this.i = null;
        this.k = (byte) 2;
        obj = ((n660) ljf0Var.f20148a).D(str, str3, str4, this);
        if (obj != wneVar) {
            swp0Var = (swp0) obj;
            restorePassword = new SendEmailIntention.RestorePassword(str2, this.n);
            if (sxf0Var.m.f15225a.a()) {
                xzb xzbVar2 = sxf0Var.e;
                this.i = null;
                this.j = restorePassword;
                this.k = (byte) 3;
                obj = xzbVar2.a(swp0Var, true, this);
                if (obj != wneVar) {
                    restorePassword2 = restorePassword;
                    pfi0 pfi0Var2 = (pfi0) obj;
                    k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                    k0w0VarI2.h(new CheckEmailCodeScreen(new CheckEmailScreenParams.RestorePassword(pfi0Var2.b, pfi0Var2.f26908a, restorePassword2)));
                    listIteratorO = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                    while (true) {
                        pawVar = (paw) listIteratorO;
                        if (pawVar.hasNext()) {
                            break;
                            break;
                        }
                        i1w0Var.a((oe50) pawVar.next());
                    }
                }
            } else {
                i1w0Var.d(new zlb0(sxf0Var, restorePassword, swp0Var, (byte) 19));
            }
            return Unit.f46060a;
        }
        return wneVar;
    }
}
