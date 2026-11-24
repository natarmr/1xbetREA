package org.xplatform.bethistory.transaction_history.presentation;

import a.iiy;
import a.m1r;
import a.ohs0;
import a.ufx;
import a.zes0;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/bethistory/transaction_history/presentation/TransactionHistoryScreenOld;", "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class TransactionHistoryScreenOld implements FragmentScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46419a;
    public final byte b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final double h;
    public final String i;
    public final double j;
    public final double k;

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionHistoryScreenOld(double d, double d2, double d3, int i, long j, long j2, String str, String str2, String str3, String str4, String str5) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f46419a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = j2;
        this.f = str3;
        this.g = str4;
        this.h = d;
        this.i = str5;
        this.j = d2;
        this.k = d3;
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    public final Fragment a(m1r m1rVar) {
        m1rVar.getClass();
        zes0.b2.getClass();
        String str = this.c;
        str.getClass();
        String str2 = this.d;
        str2.getClass();
        String str3 = this.f;
        str3.getClass();
        String str4 = this.g;
        str4.getClass();
        String str5 = this.i;
        str5.getClass();
        zes0 zes0Var = new zes0();
        iiy[] iiyVarArr = zes0.c2;
        zes0Var.O1.j(zes0Var, iiyVarArr[1], this.f46419a);
        zes0Var.P1.I(zes0Var, iiyVarArr[2], this.b);
        zes0Var.Q1.x(zes0Var, iiyVarArr[3], str);
        zes0Var.R1.x(zes0Var, iiyVarArr[4], str2);
        zes0Var.S1.j(zes0Var, iiyVarArr[5], this.e);
        zes0Var.U1.x(zes0Var, iiyVarArr[6], str3);
        zes0Var.V1.x(zes0Var, iiyVarArr[7], str4);
        zes0Var.W1.f0(zes0Var, iiyVarArr[8], this.h);
        zes0Var.X1.x(zes0Var, iiyVarArr[9], str5);
        zes0Var.Y1.f0(zes0Var, iiyVarArr[10], this.j);
        zes0Var.Z1.f0(zes0Var, iiyVarArr[11], this.k);
        return zes0Var;
    }

    @Override // a.m7h0
    /* JADX INFO: renamed from: b */
    public final String getF45455a() {
        return ufx.C(this);
    }

    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
    /* JADX INFO: renamed from: g */
    public final /* bridge */ boolean getB() {
        return true;
    }
}
