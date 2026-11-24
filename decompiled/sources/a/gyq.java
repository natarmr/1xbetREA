package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.appbar.AppBarLayout;
import org.xplatform.feature.balance_management_old.impl.presentation.view.TransactionButton;
import org.xplatform.uikit.components.account_info.DsAccountInfo;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes4.dex */
public final class gyq implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f12142a;
    public final AppBarLayout b;
    public final DsAccountInfo c;
    public final ConstraintLayout d;
    public final Group e;
    public final ewe f;
    public final DsNavigationBar g;
    public final TransactionButton h;
    public final TransactionButton i;

    public gyq(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, DsAccountInfo dsAccountInfo, ConstraintLayout constraintLayout2, Group group, ewe eweVar, DsNavigationBar dsNavigationBar, TransactionButton transactionButton, TransactionButton transactionButton2) {
        this.f12142a = constraintLayout;
        this.b = appBarLayout;
        this.c = dsAccountInfo;
        this.d = constraintLayout2;
        this.e = group;
        this.f = eweVar;
        this.g = dsNavigationBar;
        this.h = transactionButton;
        this.i = transactionButton2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f12142a;
    }
}
