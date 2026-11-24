.class public final Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# static fields
.field public static final synthetic e:I


# instance fields
.field public a:Z

.field public b:Z

.field public final c:La/a8z;

.field public final d:La/fb30;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    sget-object p1, La/wez;->b:La/wez;

    .line 14
    .line 15
    new-instance p2, La/ha30;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-direct {p2, p0, p0, v0}, La/ha30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->c:La/a8z;

    .line 26
    .line 27
    new-instance p1, La/fb30;

    .line 28
    .line 29
    invoke-direct {p1, p0}, La/fb30;-><init>(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->d:La/fb30;

    .line 33
    .line 34
    invoke-virtual {p0, p3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 35
    .line 36
    .line 37
    const/16 p2, 0x8

    .line 38
    .line 39
    invoke-virtual {p0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    sget-object p2, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    if-nez p2, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    iput p0, p1, La/fb30;->b:I

    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    new-instance p1, La/w23;

    .line 64
    .line 65
    const/16 p2, 0xa

    .line 66
    .line 67
    invoke-direct {p1, p0, p2}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method private final getBinding()La/aiu0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->c:La/a8z;

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
    check-cast p0, La/aiu0;

    .line 11
    .line 12
    return-object p0
.end method


# virtual methods
.method public final getBroadcastTabSelected()Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->getBinding()La/aiu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/aiu0;->b:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final getInfoTabSelected()Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->getBinding()La/aiu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/aiu0;->c:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Landroid/os/Bundle;

    .line 5
    .line 6
    const-string v0, "IS_VISIBLE"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput-boolean v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->a:Z

    .line 14
    .line 15
    const-string v0, "IS_TRANSLATED"

    .line 16
    .line 17
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput-boolean v0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->b:Z

    .line 22
    .line 23
    const-string v0, "SUPER_STATE"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "SUPER_STATE"

    .line 7
    .line 8
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "IS_VISIBLE"

    .line 16
    .line 17
    iget-boolean v2, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->a:Z

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v1, "IS_TRANSLATED"

    .line 23
    .line 24
    iget-boolean p0, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->b:Z

    .line 25
    .line 26
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public final setBroadcastTabSelected(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->getBinding()La/aiu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/aiu0;->b:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->getBinding()La/aiu0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p0, p0, La/aiu0;->c:Landroid/widget/TextView;

    .line 15
    .line 16
    xor-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final setBroadcastingTabClickDebounceListener(Lkotlin/jvm/functions/Function0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->getBinding()La/aiu0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/aiu0;->b:Landroid/widget/TextView;

    .line 9
    .line 10
    sget-object v0, La/ymx;->d:La/ymx;

    .line 11
    .line 12
    new-instance v1, La/r3w;

    .line 13
    .line 14
    const/4 v2, 0x7

    .line 15
    invoke-direct {v1, p1, v2}, La/r3w;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0, v1}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public setClickable(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->getBinding()La/aiu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/aiu0;->c:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->getBinding()La/aiu0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, La/aiu0;->b:Landroid/widget/TextView;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 17
    .line 18
    .line 19
    invoke-super {p0, p1}, Landroid/view/View;->setClickable(Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final setInfoTabClickDebounceListener(Lkotlin/jvm/functions/Function0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->getBinding()La/aiu0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/aiu0;->c:Landroid/widget/TextView;

    .line 9
    .line 10
    sget-object v0, La/ymx;->d:La/ymx;

    .line 11
    .line 12
    new-instance v1, La/r3w;

    .line 13
    .line 14
    const/16 v2, 0x8

    .line 15
    .line 16
    invoke-direct {v1, p1, v2}, La/r3w;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v0, v1}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final setInfoTabSelected(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->getBinding()La/aiu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/aiu0;->c:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->getBinding()La/aiu0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p0, p0, La/aiu0;->b:Landroid/widget/TextView;

    .line 15
    .line 16
    xor-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final setTabsVisibilityWithAnimation(Z)V
    .locals 9

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->a:Z

    .line 2
    .line 3
    iget-object v2, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->d:La/fb30;

    .line 4
    .line 5
    iget v0, v2, La/fb30;->b:I

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    if-eq v0, v1, :cond_2

    .line 9
    .line 10
    iget-boolean v3, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->b:Z

    .line 11
    .line 12
    if-nez v3, :cond_2

    .line 13
    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    iget-object p0, v2, La/fb30;->a:Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;

    .line 17
    .line 18
    iget-object v8, v2, La/fb30;->e:La/eb30;

    .line 19
    .line 20
    invoke-virtual {v8}, Landroid/os/CountDownTimer;->cancel()V

    .line 21
    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    new-instance v0, La/o0t;

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    const/16 v7, 0x17

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    const-class v3, La/fb30;

    .line 38
    .line 39
    const-string v4, "showViewByTranslation"

    .line 40
    .line 41
    const-string v5, "showViewByTranslation()V"

    .line 42
    .line 43
    invoke-direct/range {v0 .. v7}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 44
    .line 45
    .line 46
    iput-object v0, v8, La/eb30;->b:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v8}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 49
    .line 50
    .line 51
    :cond_0
    if-nez p1, :cond_1

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_1

    .line 58
    .line 59
    new-instance v0, La/o0t;

    .line 60
    .line 61
    const/4 v6, 0x0

    .line 62
    const/16 v7, 0x18

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    const-class v3, La/fb30;

    .line 66
    .line 67
    const-string v4, "hideViewByTranslation"

    .line 68
    .line 69
    const-string v5, "hideViewByTranslation()V"

    .line 70
    .line 71
    invoke-direct/range {v0 .. v7}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 72
    .line 73
    .line 74
    iput-object v0, v8, La/eb30;->b:Ljava/lang/Object;

    .line 75
    .line 76
    invoke-virtual {v8}, Landroid/os/CountDownTimer;->start()Landroid/os/CountDownTimer;

    .line 77
    .line 78
    .line 79
    :cond_1
    return-void

    .line 80
    :cond_2
    if-eqz p1, :cond_3

    .line 81
    .line 82
    const/4 p1, 0x0

    .line 83
    goto :goto_0

    .line 84
    :cond_3
    const/16 p1, 0x8

    .line 85
    .line 86
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final setTranslatedContainer(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/matchinfo/MatchInfoTabsContainerView;->b:Z

    .line 2
    .line 3
    return-void
.end method
