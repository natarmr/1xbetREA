package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.xbet.client1.R;
import org.xplatform.feature.balance_management_old.impl.presentation.view.TransactionCell;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;

/* JADX INFO: loaded from: classes4.dex */
public final class fk5 extends gl80 {
    public final b33 h;
    public final gi5 i;

    public fk5(b33 b33Var, gi5 gi5Var) {
        super(ek5.b);
        this.h = b33Var;
        this.i = gi5Var;
    }

    @Override // a.yge0
    public final int f(int i) {
        vk5 vk5Var = (vk5) B(i);
        if (vk5Var == null) {
            jf4.n("Unknown view");
            return 0;
        }
        if (vk5Var instanceof tjz) {
            return R.layout.item_balance_management_legal;
        }
        if (vk5Var instanceof lfs0) {
            return R.layout.item_balance_management_header;
        }
        if (vk5Var instanceof aes0) {
            return R.layout.item_balance_management_transaction_date;
        }
        if (vk5Var instanceof ogs0) {
            return R.layout.rv_item_balance_manager_transaction;
        }
        if (vk5Var instanceof ues0) {
            return R.layout.item_balance_management_empty_view;
        }
        if (vk5Var instanceof gxn) {
            return R.layout.item_end_of_pagination_reached;
        }
        if (vk5Var instanceof tds0) {
            return -1;
        }
        t9f.b();
        return 0;
    }

    @Override // a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        vk5 vk5Var = (vk5) A(i);
        if (vk5Var == null) {
            return;
        }
        if (xhe0Var instanceof ujz) {
            ((ujz) xhe0Var).t((tjz) vk5Var);
            return;
        }
        if (xhe0Var instanceof qsq0) {
            ((qsq0) xhe0Var).t((lfs0) vk5Var);
            return;
        }
        if (xhe0Var instanceof bes0) {
            ((bes0) xhe0Var).u.c.setModel(new nrv(((aes0) vk5Var).f745a, false, null, null, null, null, null, 254));
            return;
        }
        if (xhe0Var instanceof tgs0) {
            ((tgs0) xhe0Var).t((ogs0) vk5Var);
        } else if (xhe0Var instanceof fvn) {
        } else if (xhe0Var instanceof hxn) {
            ((hxn) xhe0Var).t((gxn) vk5Var);
        }
    }

    @Override // a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        if (i == R.layout.item_balance_management_legal) {
            return new ujz(dc3.e(LayoutInflater.from(viewGroup.getContext()), viewGroup), this.h);
        }
        if (i == R.layout.item_balance_management_header) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_balance_management_header, viewGroup, false);
            if (viewInflate != null) {
                DsHeader dsHeader = (DsHeader) viewInflate;
                return new qsq0(new dsx(dsHeader, dsHeader, (byte) 0));
            }
            hny.u("rootView");
            return null;
        }
        if (i == R.layout.item_balance_management_transaction_date) {
            View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_balance_management_transaction_date, viewGroup, false);
            if (viewInflate2 != null) {
                DsHeader dsHeader2 = (DsHeader) viewInflate2;
                return new bes0(new dsx(dsHeader2, dsHeader2, (byte) 1));
            }
            hny.u("rootView");
            return null;
        }
        if (i == R.layout.rv_item_balance_manager_transaction) {
            View viewInflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_item_balance_manager_transaction, viewGroup, false);
            if (viewInflate3 != null) {
                TransactionCell transactionCell = (TransactionCell) viewInflate3;
                return new tgs0(new nq8(transactionCell, transactionCell, (byte) 13));
            }
            hny.u("rootView");
            return null;
        }
        if (i == R.layout.item_end_of_pagination_reached) {
            View viewInflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_end_of_pagination_reached, viewGroup, false);
            if (viewInflate4 != null) {
                DsButton dsButton = (DsButton) viewInflate4;
                return new hxn(new nq8(dsButton, dsButton, (byte) 7), this.i);
            }
            hny.u("rootView");
            return null;
        }
        if (i == -1) {
            return new gw3(new View(viewGroup.getContext()));
        }
        View viewInflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_balance_management_empty_view, viewGroup, false);
        if (viewInflate5 != null) {
            return new fvn((DsLottieEmpty) viewInflate5);
        }
        hny.u("rootView");
        return null;
    }
}
