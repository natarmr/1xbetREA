package a;

import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.core.presentation.common.DiceImageView$ViewState;

/* JADX INFO: loaded from: classes4.dex */
public final class akk extends AppCompatImageView {
    public List d;
    public int e;
    public int f;

    public final int getDealerDice() {
        return this.f;
    }

    public final int getN() {
        return this.e;
    }

    public final DiceImageView$ViewState getViewState() {
        return new DiceImageView$ViewState(getRotation(), getTranslationX(), getTranslationY(), this.f, this.e);
    }

    public final void setDealerDice(int i) {
        this.f = i;
    }

    public final void setDrawableIds(List<Integer> list) {
        list.getClass();
        this.d = list;
    }

    public final void setN(int i) {
        this.e = i;
        int i2 = this.f;
        if (i2 == 0) {
            switch (i) {
                case 1:
                    b1j.s(this, R.drawable.dice_red_1);
                    break;
                case 2:
                    b1j.s(this, R.drawable.dice_red_2);
                    break;
                case 3:
                    b1j.s(this, R.drawable.dice_red_3);
                    break;
                case 4:
                    b1j.s(this, R.drawable.dice_red_4);
                    break;
                case 5:
                    b1j.s(this, R.drawable.dice_red_5);
                    break;
                case 6:
                    b1j.s(this, R.drawable.dice_red_6);
                    break;
            }
        }
        if (i2 == 1) {
            switch (i) {
                case 1:
                    b1j.s(this, R.drawable.dice_black_1);
                    break;
                case 2:
                    b1j.s(this, R.drawable.dice_black_2);
                    break;
                case 3:
                    b1j.s(this, R.drawable.dice_black_3);
                    break;
                case 4:
                    b1j.s(this, R.drawable.dice_black_4);
                    break;
                case 5:
                    b1j.s(this, R.drawable.dice_black_5);
                    break;
                case 6:
                    b1j.s(this, R.drawable.dice_black_6);
                    break;
            }
        }
        if (i2 == 2) {
            if (i == 0) {
                b1j.s(this, R.drawable.ic_cube_crown);
                return;
            }
            if (i == 1) {
                b1j.s(this, R.drawable.ic_cube_anchor);
                return;
            }
            if (i == 2) {
                b1j.s(this, R.drawable.ic_cube_hearts);
                return;
            }
            if (i == 3) {
                b1j.s(this, R.drawable.ic_cube_spades);
                return;
            } else if (i == 4) {
                b1j.s(this, R.drawable.ic_cube_diamonds);
                return;
            } else {
                if (i != 5) {
                    return;
                }
                b1j.s(this, R.drawable.ic_cube_clubs);
                return;
            }
        }
        if (i2 == 4) {
            switch (i) {
                case 1:
                    b1j.s(this, R.drawable.ic_hot_dice_1);
                    break;
                case 2:
                    b1j.s(this, R.drawable.ic_hot_dice_2);
                    break;
                case 3:
                    b1j.s(this, R.drawable.ic_hot_dice_3);
                    break;
                case 4:
                    b1j.s(this, R.drawable.ic_hot_dice_4);
                    break;
                case 5:
                    b1j.s(this, R.drawable.ic_hot_dice_5);
                    break;
                case 6:
                    b1j.s(this, R.drawable.ic_hot_dice_6);
                    break;
            }
        }
        if (i2 != 5) {
            return;
        }
        switch (i) {
            case 1:
                setBackground(epv0.U(((Number) this.d.get(0)).intValue(), getContext()));
                break;
            case 2:
                setBackground(epv0.U(((Number) this.d.get(1)).intValue(), getContext()));
                break;
            case 3:
                setBackground(epv0.U(((Number) this.d.get(2)).intValue(), getContext()));
                break;
            case 4:
                setBackground(epv0.U(((Number) this.d.get(3)).intValue(), getContext()));
                break;
            case 5:
                setBackground(epv0.U(((Number) this.d.get(4)).intValue(), getContext()));
                break;
            case 6:
                setBackground(epv0.U(((Number) this.d.get(5)).intValue(), getContext()));
                break;
        }
    }
}
