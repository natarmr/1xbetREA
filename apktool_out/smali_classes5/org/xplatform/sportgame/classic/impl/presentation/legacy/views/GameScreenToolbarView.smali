.class public final Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic r:I


# instance fields
.field public final q:La/a8z;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    sget-object p2, La/wez;->b:La/wez;

    .line 14
    .line 15
    new-instance p3, La/nsr;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p3, p0, p0, v0}, La/nsr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p2, p3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iput-object p2, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;->q:La/a8z;

    .line 26
    .line 27
    const p2, 0x7f0606d8

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private final getBinding()La/ehu0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, La/ehu0;

    .line 11
    .line 12
    return-object p0
.end method

.method private final setToolbarActionsEnabled(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;->getBinding()La/ehu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/ehu0;->d:Landroid/widget/ImageView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;->getBinding()La/ehu0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p0, p0, La/ehu0;->c:Landroid/widget/ImageView;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final u(La/ncl0;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;->getBinding()La/ehu0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/ehu0;->b:Landroid/widget/ImageView;

    .line 9
    .line 10
    sget-object v1, La/ymx;->e:La/ymx;

    .line 11
    .line 12
    new-instance v2, La/nrs;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v2, p1, v3}, La/nrs;-><init>(La/bvs;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;->getBinding()La/ehu0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v0, v0, La/ehu0;->d:Landroid/widget/ImageView;

    .line 26
    .line 27
    sget-object v1, La/ymx;->h:La/ymx;

    .line 28
    .line 29
    new-instance v2, La/nrs;

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-direct {v2, p1, v3}, La/nrs;-><init>(La/bvs;B)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1, v2}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;->getBinding()La/ehu0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    iget-object p0, p0, La/ehu0;->c:Landroid/widget/ImageView;

    .line 43
    .line 44
    new-instance v0, La/nrs;

    .line 45
    .line 46
    const/4 v2, 0x2

    .line 47
    invoke-direct {v0, p1, v2}, La/nrs;-><init>(La/bvs;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v1, v0}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final v(La/zus;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;->getBinding()La/ehu0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/ehu0;->e:Landroid/widget/TextView;

    .line 9
    .line 10
    iget-object v1, p1, La/zus;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;->getBinding()La/ehu0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, La/ehu0;->d:Landroid/widget/ImageView;

    .line 20
    .line 21
    iget-boolean v1, p1, La/zus;->c:Z

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/16 v2, 0x8

    .line 28
    .line 29
    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;->getBinding()La/ehu0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v0, v0, La/ehu0;->d:Landroid/widget/ImageView;

    .line 39
    .line 40
    iget v1, p1, La/zus;->b:I

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 43
    .line 44
    .line 45
    :cond_1
    iget-boolean p1, p1, La/zus;->d:Z

    .line 46
    .line 47
    invoke-direct {p0, p1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/GameScreenToolbarView;->setToolbarActionsEnabled(Z)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
