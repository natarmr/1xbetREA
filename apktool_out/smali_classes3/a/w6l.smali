.class public final La/w6l;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:La/a8z;

.field public final b:I

.field public c:La/c4m0;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/text/DecimalFormat;

.field public final f:I

.field public final g:Landroid/graphics/drawable/Drawable;

.field public final h:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wez;->b:La/wez;

    .line 9
    .line 10
    new-instance v1, La/lhf;

    .line 11
    .line 12
    const/16 v2, 0x12

    .line 13
    .line 14
    invoke-direct {v1, p0, p0, v2}, La/lhf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, La/w6l;->a:La/a8z;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const v1, 0x7f0700ac

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput v0, p0, La/w6l;->b:I

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const v1, 0x7f130d3c

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, La/w6l;->d:Ljava/lang/String;

    .line 51
    .line 52
    new-instance v0, Ljava/text/DecimalFormat;

    .line 53
    .line 54
    const-string v1, "#00"

    .line 55
    .line 56
    invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, La/w6l;->e:Ljava/text/DecimalFormat;

    .line 60
    .line 61
    const v0, 0x7f080a5d

    .line 62
    .line 63
    .line 64
    iput v0, p0, La/w6l;->f:I

    .line 65
    .line 66
    const v0, 0x7f0804b1

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, La/w6l;->g:Landroid/graphics/drawable/Drawable;

    .line 74
    .line 75
    const v0, 0x7f0804af

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, La/w6l;->h:Landroid/graphics/drawable/Drawable;

    .line 83
    .line 84
    return-void
.end method

.method public static final synthetic a(La/w6l;)La/x6l;
    .locals 0

    .line 1
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getBinding()La/x6l;
    .locals 0

    .line 1
    iget-object p0, p0, La/w6l;->a:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/x6l;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final b(ZJ)V
    .locals 2

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p1, p1, La/x6l;->c:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p1, p1, La/x6l;->e:Landroid/widget/TextView;

    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p1, p1, La/x6l;->b:Landroid/widget/ImageView;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    iget-object p0, p0, La/x6l;->d:Landroid/widget/ImageView;

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_0
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iget-object p1, p1, La/x6l;->d:Landroid/widget/ImageView;

    .line 48
    .line 49
    invoke-static {p1}, La/hxm0;->B(Landroid/widget/ImageView;)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget-object p1, p1, La/x6l;->c:Landroid/view/View;

    .line 57
    .line 58
    iget-object v1, p0, La/w6l;->g:Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object p1, p1, La/x6l;->c:Landroid/view/View;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object p1, p1, La/x6l;->b:Landroid/widget/ImageView;

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 80
    .line 81
    .line 82
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iget-object p1, p1, La/x6l;->e:Landroid/widget/TextView;

    .line 87
    .line 88
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 89
    .line 90
    .line 91
    const/4 p1, 0x1

    .line 92
    invoke-virtual {p0, p1, p2, p3}, La/w6l;->c(ZJ)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final c(ZJ)V
    .locals 5

    .line 1
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    invoke-static {p0}, La/s7n0;->l(Landroid/view/View;)La/clz;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, La/w6l;->c:La/c4m0;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1, v2}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 38
    .line 39
    invoke-virtual {v1, p2, p3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 40
    .line 41
    .line 42
    move-result-wide p2

    .line 43
    const-wide/16 v3, 0x0

    .line 44
    .line 45
    const/4 v1, 0x4

    .line 46
    invoke-static {v1, p2, p3, v3, v4}, La/sac;->L(IJJ)La/vsg0;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    new-instance p3, La/bk5;

    .line 51
    .line 52
    invoke-direct {p3, p0, p1, v2}, La/bk5;-><init>(La/w6l;ZLa/yje;)V

    .line 53
    .line 54
    .line 55
    new-instance p1, La/fnq;

    .line 56
    .line 57
    invoke-direct {p1, p2, p3, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 58
    .line 59
    .line 60
    new-instance p2, La/ko0;

    .line 61
    .line 62
    const/16 p3, 0xd

    .line 63
    .line 64
    invoke-direct {p2, p0, v2, p3}, La/ko0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 65
    .line 66
    .line 67
    new-instance p3, La/dnq;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-direct {p3, p1, p2, v1}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 71
    .line 72
    .line 73
    sget-object p1, La/tvk;->a:La/rwj;

    .line 74
    .line 75
    invoke-static {v0, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance p2, La/f1e;

    .line 80
    .line 81
    const/4 v0, 0x2

    .line 82
    const/16 v1, 0x11

    .line 83
    .line 84
    invoke-direct {p2, v0, v2, v1}, La/f1e;-><init>(ILa/yje;B)V

    .line 85
    .line 86
    .line 87
    invoke-static {p3, p1, p2}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    iput-object p1, p0, La/w6l;->c:La/c4m0;

    .line 92
    .line 93
    :cond_1
    return-void

    .line 94
    :cond_2
    new-instance v0, La/v6l;

    .line 95
    .line 96
    invoke-direct {v0, p0, p2, p3, p1}, La/v6l;-><init>(La/w6l;JZ)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final d(FI)V
    .locals 2

    .line 1
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/x6l;->b:Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iput p2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 14
    .line 15
    iput p2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object p0, p0, La/x6l;->e:Landroid/widget/TextView;

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    invoke-virtual {p0, p2, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 32
    .line 33
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final setHeroAegisState(J)V
    .locals 2

    .line 1
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/x6l;->c:Landroid/view/View;

    .line 6
    .line 7
    iget-object v1, p0, La/w6l;->h:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, La/x6l;->c:Landroid/view/View;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v0, v0, La/x6l;->b:Landroid/widget/ImageView;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v0, v0, La/x6l;->e:Landroid/widget/TextView;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v0, v0, La/x6l;->d:Landroid/widget/ImageView;

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/widget/ImageView;->clearColorFilter()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v1, p1, p2}, La/w6l;->c(ZJ)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final setHeroImage(Ljava/lang/String;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 5
    .line 6
    invoke-direct {p0}, La/w6l;->getBinding()La/x6l;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, v0, La/x6l;->d:Landroid/widget/ImageView;

    .line 11
    .line 12
    new-instance v0, La/j2x;

    .line 13
    .line 14
    iget v2, p0, La/w6l;->b:I

    .line 15
    .line 16
    invoke-direct {v0, v2}, La/j2x;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    const/4 v7, 0x0

    .line 24
    const/16 v8, 0x1ec

    .line 25
    .line 26
    iget v3, p0, La/w6l;->f:I

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v6, 0x0

    .line 30
    move-object v2, p1

    .line 31
    invoke-static/range {v1 .. v8}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
