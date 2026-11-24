package a;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.ui.PlayerControlView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class d1a0 extends xhe0 {
    public final TextView u;
    public final TextView v;
    public final ImageView w;
    public final /* synthetic */ PlayerControlView x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1a0(PlayerControlView playerControlView, View view) {
        super(view);
        this.x = playerControlView;
        if (Build.VERSION.SDK_INT < 26) {
            view.setFocusable(true);
        }
        this.u = (TextView) view.findViewById(R.id.exo_main_text);
        this.v = (TextView) view.findViewById(R.id.exo_sub_text);
        this.w = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new l910(this, (byte) 17));
    }
}
