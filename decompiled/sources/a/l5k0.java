package a;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class l5k0 extends AppCompatTextView implements due {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5k0(Context context) {
        super(context, null, 0);
        context.getClass();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_8);
        setMaxLines(2);
        setPadding(0, dimensionPixelSize, 0, dimensionPixelSize);
    }

    @Override // a.due
    public void setTeamsUiModel(cue cueVar) {
        String str;
        cueVar.getClass();
        aue aueVar = cueVar instanceof aue ? (aue) cueVar : null;
        setText((aueVar == null || (str = aueVar.f1474a) == null) ? "" : f1t0.L(str));
    }
}
