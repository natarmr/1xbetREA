package a;

import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class skc0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32340a;
    public final /* synthetic */ ukc0 b;

    public /* synthetic */ skc0(ukc0 ukc0Var, byte b) {
        this.f32340a = b;
        this.b = ukc0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f32340a;
        ukc0 ukc0Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = ukc0.Q1;
                return new ko60(ukc0Var, (byte) 10);
            case 1:
                iiy[] iiyVarArr2 = ukc0.Q1;
                clc0 clc0VarG0 = ukc0Var.G0();
                p7m0 p7m0Var = clc0VarG0.q;
                if (clc0VarG0.k.f34357a.b.b && clc0VarG0.l && ((tnc0) clc0VarG0.g.f27815a).b.f6362a.a().getBoolean("NEED_SHOW_GAME_NOT_FINISHED_DIALOG", true)) {
                    clc0VarG0.p.f(xkc0.f41024a);
                } else {
                    boolean z = clc0VarG0.n;
                    v06 v06Var = v06.f36567a;
                    if (!(z && ((zkc0) p7m0Var.getValue()).b) && ((zkc0) p7m0Var.getValue()).b) {
                        i1w0 i1w0Var = clc0VarG0.b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                        }
                    } else {
                        clc0VarG0.w(v06Var);
                    }
                }
                return Unit.f46060a;
            default:
                iiy[] iiyVarArr3 = ukc0.Q1;
                clc0 clc0VarG1 = ukc0Var.G0();
                if (((zkc0) clc0VarG1.q.getValue()).c) {
                    if (clc0VarG1.m || clc0VarG1.k.f34357a.b.b) {
                        clc0VarG1.p.f(new wkc0(R.string.games_rules_exeption));
                    } else {
                        Map map = clc0VarG1.r;
                        if (map == null || map.isEmpty()) {
                            sac.V(jiu0.a(clc0VarG1), new ppb0(clc0VarG1, (byte) 19), null, null, new vkc0(clc0VarG1, null, (byte) 1), 14);
                        } else {
                            clc0VarG1.y();
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}
