package a;

import android.view.View;
import android.widget.TextView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class us40 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36193a;
    public final /* synthetic */ View b;

    public /* synthetic */ us40(View view, byte b) {
        this.f36193a = b;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f36193a;
        View view = this.b;
        switch (b) {
            case 0:
                view.setNestedScrollingEnabled(true);
                break;
            case 1:
                int width = (int) (((double) view.getWidth()) * 0.35d);
                ((TextView) view.findViewById(R.id.possibleWin)).setMaxWidth(width);
                ((TextView) view.findViewById(R.id.coefLabel)).setMaxWidth(width);
                ((TextView) view.findViewById(R.id.marketLabel)).setMaxWidth(width);
                break;
            case 2:
                int width2 = (int) (((double) view.getWidth()) * 0.35d);
                ((TextView) view.findViewById(R.id.possibleWin)).setMaxWidth(width2);
                ((TextView) view.findViewById(R.id.coefLabel)).setMaxWidth(width2);
                ((TextView) view.findViewById(R.id.marketLabel)).setMaxWidth(width2);
                break;
            case 3:
                int width3 = (int) (((double) view.getWidth()) * 0.35d);
                ((TextView) view.findViewById(R.id.possibleWin)).setMaxWidth(width3);
                ((TextView) view.findViewById(R.id.coefLabel)).setMaxWidth(width3);
                ((TextView) view.findViewById(R.id.marketLabel)).setMaxWidth(width3);
                break;
            case 4:
                int width4 = (int) (((double) view.getWidth()) * 0.35d);
                ((TextView) view.findViewById(R.id.possibleWin)).setMaxWidth(width4);
                ((TextView) view.findViewById(R.id.coefLabel)).setMaxWidth(width4);
                ((TextView) view.findViewById(R.id.marketLabel)).setMaxWidth(width4);
                break;
            case 5:
                int width5 = (int) (((double) view.getWidth()) * 0.35d);
                ((TextView) view.findViewById(R.id.possibleWin)).setMaxWidth(width5);
                ((TextView) view.findViewById(R.id.coefLabel)).setMaxWidth(width5);
                ((TextView) view.findViewById(R.id.marketLabel)).setMaxWidth(width5);
                break;
            default:
                int width6 = (int) (((double) view.getWidth()) * 0.35d);
                ((TextView) view.findViewById(R.id.possibleWin)).setMaxWidth(width6);
                ((TextView) view.findViewById(R.id.coefLabel)).setMaxWidth(width6);
                ((TextView) view.findViewById(R.id.marketLabel)).setMaxWidth(width6);
                break;
        }
    }
}
