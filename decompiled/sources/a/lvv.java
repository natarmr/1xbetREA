package a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.presentation.team_statistic.view.TeamStatisticView;

/* JADX INFO: loaded from: classes3.dex */
public final class lvv implements hlp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TeamStatisticView f20732a;
    public final s1g b;
    public final s1g c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final TextPaint l;
    public final TextPaint m;
    public final Rect n;
    public final Rect o;
    public final ImageView p;
    public final ImageView q;
    public String r;
    public String s;
    public String t;
    public String u;
    public int v;
    public int w;
    public int x;
    public int y;

    public lvv(TeamStatisticView teamStatisticView) {
        this.f20732a = teamStatisticView;
        s1g s1gVar = new s1g(teamStatisticView, R.color.static_black_40);
        s1gVar.c(teamStatisticView.getResources().getDimension(R.dimen.corner_radius_8));
        this.b = s1gVar;
        s1g s1gVar2 = new s1g(teamStatisticView, R.color.static_black_40);
        s1gVar2.c(teamStatisticView.getResources().getDimension(R.dimen.corner_radius_8));
        this.c = s1gVar2;
        this.d = teamStatisticView.getResources().getDimensionPixelSize(R.dimen.size_32);
        this.e = teamStatisticView.getContext().getResources().getDimensionPixelSize(R.dimen.corner_radius_8);
        this.f = teamStatisticView.getContext().getResources().getDimensionPixelSize(R.dimen.space_2);
        this.g = teamStatisticView.getContext().getResources().getDimensionPixelSize(R.dimen.space_4);
        this.h = teamStatisticView.getContext().getResources().getDimensionPixelSize(R.dimen.space_6);
        this.i = teamStatisticView.getContext().getResources().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize = teamStatisticView.getContext().getResources().getDimensionPixelSize(R.dimen.text_12);
        int dimensionPixelSize2 = teamStatisticView.getContext().getResources().getDimensionPixelSize(R.dimen.text_8);
        this.j = teamStatisticView.getContext().getResources().getDimensionPixelSize(R.dimen.size_14);
        this.k = teamStatisticView.getContext().getResources().getDimensionPixelSize(R.dimen.size_10);
        TextPaint textPaint = new TextPaint();
        Context context = teamStatisticView.getContext();
        context.getClass();
        r7x.r(textPaint, context, R.style.TextStyle_Caption_Medium_L);
        textPaint.setAntiAlias(true);
        Context context2 = teamStatisticView.getContext();
        context2.getClass();
        textPaint.setColor(context2.getColor(R.color.static_white));
        textPaint.setTextSize(dimensionPixelSize);
        Paint.Style style = Paint.Style.FILL;
        textPaint.setStyle(style);
        this.l = textPaint;
        TextPaint textPaint2 = new TextPaint();
        Context context3 = teamStatisticView.getContext();
        context3.getClass();
        r7x.r(textPaint2, context3, R.style.TextStyle_Caption_Medium_S);
        textPaint2.setAntiAlias(true);
        Context context4 = teamStatisticView.getContext();
        context4.getClass();
        textPaint2.setColor(context4.getColor(R.color.static_white_60));
        textPaint2.setTextSize(dimensionPixelSize2);
        textPaint2.setStyle(style);
        this.m = textPaint2;
        this.n = new Rect();
        this.o = new Rect();
        this.p = new ImageView(teamStatisticView.getContext());
        this.q = new ImageView(teamStatisticView.getContext());
        this.r = "";
        this.s = "";
        this.t = "";
        this.u = "";
    }

    @Override // a.hlp0
    public final void a(int i, int i2, int i3, int i4) {
        String str = this.r;
        int length = str.length();
        TextPaint textPaint = this.l;
        Rect rect = this.n;
        textPaint.getTextBounds(str, 0, length, rect);
        String str2 = this.s;
        int length2 = str2.length();
        TextPaint textPaint2 = this.m;
        Rect rect2 = this.o;
        textPaint2.getTextBounds(str2, 0, length2, rect2);
        int iHeight = ((i4 - i2) - ((rect2.height() + rect.height()) + this.g)) / 2;
        TeamStatisticView teamStatisticView = this.f20732a;
        int layoutDirection = teamStatisticView.getLayoutDirection();
        int i5 = this.d;
        int i6 = layoutDirection == 0 ? i : i3 - i5;
        int layoutDirection2 = teamStatisticView.getLayoutDirection();
        int i7 = this.h;
        int i8 = layoutDirection2 == 0 ? i + i5 + i7 : (i3 - i5) - i7;
        int i9 = teamStatisticView.getLayoutDirection() == 0 ? i3 : i;
        int i10 = i6 + i5;
        int i11 = i2 + i5;
        this.c.b(i6, i2, i10, i11);
        this.p.layout(i6, i2, i10, i11);
        this.q.layout(i6, i2, i10, i11);
        this.b.b(i8, i2, i9, i4);
        int iHeight2 = (this.j - rect.height()) / 2;
        int iHeight3 = (this.k - rect2.height()) / 2;
        int layoutDirection3 = teamStatisticView.getLayoutDirection();
        int i12 = this.i;
        this.v = layoutDirection3 == 1 ? (((i3 - i5) - ((int) textPaint.measureText(this.t))) - i7) - i12 : hne.D(i, i5, i7, i12);
        this.w = (rect.height() / 2) + i2 + iHeight + iHeight2 + this.f;
        this.x = teamStatisticView.getLayoutDirection() == 1 ? (((i3 - i5) - rect2.width()) - i7) - i12 : hne.D(i, i5, i7, i12);
        this.y = (rect2.height() / 2) + ((i4 - iHeight) - rect2.height()) + iHeight3;
    }

    @Override // a.hlp0
    public final void b(int i) {
        float f = ((i - this.d) - this.h) - (this.i * 2);
        String str = this.r;
        TextPaint textPaint = this.l;
        float fMeasureText = textPaint.measureText(str);
        String string = this.r;
        if (f < fMeasureText) {
            string = TextUtils.ellipsize(string, textPaint, f, TextUtils.TruncateAt.END).toString();
        }
        this.t = string;
        String str2 = this.s;
        TextPaint textPaint2 = this.m;
        float fMeasureText2 = textPaint2.measureText(str2);
        String string2 = this.s;
        if (f < fMeasureText2) {
            string2 = TextUtils.ellipsize(string2, textPaint2, f, TextUtils.TruncateAt.END).toString();
        }
        this.u = string2;
    }

    @Override // a.hlp0
    public final void c(String str, String str2, String str3) {
        str3.getClass();
        ImageView imageView = this.p;
        ViewParent parent = imageView.getParent();
        TeamStatisticView teamStatisticView = this.f20732a;
        if (parent == null) {
            teamStatisticView.addView(imageView);
        }
        ImageView imageView2 = this.q;
        if (imageView2.getParent() == null) {
            teamStatisticView.addView(imageView2);
        }
        imageView2.setImageResource(R.drawable.valorant_agent_placeholder);
        int i = this.i;
        imageView2.setPadding(i, i, i, i);
        List list = u0d.f34849a;
        List listC = kotlin.collections.a.c(new j2x(this.e));
        final byte b = 0;
        Function1 function1 = new Function1(this) { // from class: a.kvv
            public final /* synthetic */ lvv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                lvv lvvVar = this.b;
                switch (b2) {
                    case 0:
                        lvvVar.q.setVisibility(8);
                        break;
                    default:
                        lvvVar.q.setVisibility(0);
                        break;
                }
                return Unit.f46060a;
            }
        };
        final byte b2 = 1;
        u0d.j(imageView, str, 0, 0, listC, function1, new Function1(this) { // from class: a.kvv
            public final /* synthetic */ lvv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                lvv lvvVar = this.b;
                switch (b3) {
                    case 0:
                        lvvVar.q.setVisibility(8);
                        break;
                    default:
                        lvvVar.q.setVisibility(0);
                        break;
                }
                return Unit.f46060a;
            }
        }, 110);
        this.r = str2;
        this.s = str3;
    }

    @Override // a.hlp0
    public final void k(Canvas canvas) {
        canvas.getClass();
        this.c.a(canvas);
        this.b.a(canvas);
        canvas.drawText(this.t, this.v, this.w, this.l);
        canvas.drawText(this.u, this.x, this.y, this.m);
    }
}
