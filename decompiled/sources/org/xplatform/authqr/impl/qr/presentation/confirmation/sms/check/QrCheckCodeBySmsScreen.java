package org.xplatform.authqr.impl.qr.presentation.confirmation.sms.check;

import a.iiy;
import a.jgd0;
import a.m1r;
import a.swp0;
import a.yed0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/QrCheckCodeBySmsScreen;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class QrCheckCodeBySmsScreen implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final swp0 f46364a;
    public final long b;
    public final yed0 c;
    public final List d;

    public QrCheckCodeBySmsScreen(swp0 swp0Var, long j, yed0 yed0Var, List list) {
        list.getClass();
        this.f46364a = swp0Var;
        this.b = j;
        this.c = yed0Var;
        this.d = list;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        jgd0.V1.getClass();
        List list = this.d;
        list.getClass();
        jgd0 jgd0Var = new jgd0();
        iiy[] iiyVarArr = jgd0.W1;
        jgd0Var.Q1.u(jgd0Var, iiyVarArr[1], this.f46364a);
        jgd0Var.R1.j(jgd0Var, iiyVarArr[2], this.b);
        jgd0Var.S1.u(jgd0Var, iiyVarArr[3], this.c);
        jgd0Var.U1.D(jgd0Var, iiyVarArr[4], list);
        return jgd0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return "QrCheckCodeBySmsFragment";
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
