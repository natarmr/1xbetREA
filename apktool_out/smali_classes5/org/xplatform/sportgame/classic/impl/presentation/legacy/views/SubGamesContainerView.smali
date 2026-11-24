.class public final Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/xke;


# static fields
.field public static final synthetic e:I


# instance fields
.field public final a:La/a8z;

.field public final b:La/n0o0;

.field public final c:I

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

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
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    sget-object p1, La/wez;->b:La/wez;

    .line 14
    .line 15
    new-instance p2, La/ywm0;

    .line 16
    .line 17
    invoke-direct {p2, p0, p0, p3}, La/ywm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;->a:La/a8z;

    .line 25
    .line 26
    new-instance p1, La/x9m0;

    .line 27
    .line 28
    const/16 p2, 0x15

    .line 29
    .line 30
    invoke-direct {p1, p2}, La/x9m0;-><init>(B)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;->b:La/n0o0;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const p2, 0x7f0700a5

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;->c:I

    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    iput-boolean p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;->d:Z

    .line 54
    .line 55
    return-void
.end method

.method private final getBehavior()Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/behaviors/BettingContainerBehavior;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;->b:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/behaviors/BettingContainerBehavior;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getBinding()La/klu0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;->a:La/a8z;

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
    check-cast p0, La/klu0;

    .line 11
    .line 12
    return-object p0
.end method


# virtual methods
.method public getBehavior()La/yke;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/yke;"
        }
    .end annotation

    .line 10
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;->getBehavior()Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/behaviors/BettingContainerBehavior;

    move-result-object p0

    return-object p0
.end method

.method public final getFragmentContainerId()I
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;->getBinding()La/klu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/klu0;->b:Landroidx/fragment/app/FragmentContainerView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroid/view/View;->setClipToOutline(Z)V

    .line 3
    .line 4
    .line 5
    new-instance v0, La/ic3;

    .line 6
    .line 7
    const/4 v1, 0x5

    .line 8
    invoke-direct {v0, p0, v1}, La/ic3;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 12
    .line 13
    .line 14
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;->d:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x1

    .line 11
    return p0
.end method

.method public final setTouchable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;->d:Z

    .line 2
    .line 3
    return-void
.end method
