package a;

import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.feature.balance_management_old.impl.presentation.view.TransactionCell;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes4.dex */
public final class tgs0 extends v46 implements czx {
    public final nq8 u;

    public tgs0(nq8 nq8Var) {
        super((TransactionCell) nq8Var.b);
        this.u = nq8Var;
    }

    @Override // a.czx
    public final void a(boolean z, boolean z2) {
        int i;
        TransactionCell transactionCell = (TransactionCell) this.u.c;
        uk5 uk5Var = transactionCell.f46644a;
        if (z && z2) {
            i = R.drawable.single_transaction_cell_background;
        } else if (!z || z2) {
            i = (z || !z2) ? R.drawable.rv_middle_transaction_cell_item : R.drawable.last_transaction_cell_backround;
        } else {
            i = R.drawable.first_transaction_cell_background;
        }
        ((ConstraintLayout) uk5Var.b).setBackground(epv0.U(i, transactionCell.getContext()));
        ((DsSeparator) uk5Var.f).setVisibility(!z2 ? 0 : 8);
    }

    @Override // a.v46
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void t(ogs0 ogs0Var) {
        ogs0Var.getClass();
        TransactionCell transactionCell = (TransactionCell) this.u.c;
        rdj rdjVar = rdj.f30294a;
        boolean z = ogs0Var.l;
        long j = ogs0Var.b;
        transactionCell.setTransactionDate(rdj.h(new znq0(j), ykq0.UNIVERSAL, Boolean.valueOf(z), null, 248));
        transactionCell.setTransactionIcon(ogs0Var.d);
        transactionCell.setTransactionDescription(ogs0Var.f);
        transactionCell.setAmountText(ogs0Var.e);
        transactionCell.setAmountColor(ogs0Var.c);
    }
}
