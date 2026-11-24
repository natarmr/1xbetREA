.class public final Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;
.super La/ctr;
.source "SourceFile"


# static fields
.field public static final synthetic l:I


# instance fields
.field public final b:La/a8z;

.field public final c:Landroid/view/View;

.field public final d:Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

.field public final e:Landroid/widget/ProgressBar;

.field public f:Lkotlin/jvm/functions/Function0;

.field public g:Lkotlin/jvm/functions/Function0;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:La/w3w0;

.field public k:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 129
    invoke-direct {p0, p1, v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, La/ctr;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    .line 6
    .line 7
    sget-object p2, La/wez;->b:La/wez;

    .line 8
    .line 9
    new-instance v0, La/nsr;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    invoke-direct {v0, p0, p0, v1}, La/nsr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {p2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->b:La/a8z;

    .line 20
    .line 21
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iget-object p2, p2, La/ghu0;->b:Landroid/view/View;

    .line 26
    .line 27
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->c:Landroid/view/View;

    .line 28
    .line 29
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iget-object p2, p2, La/ghu0;->e:Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 34
    .line 35
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->d:Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 36
    .line 37
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iget-object p2, p2, La/ghu0;->c:Landroid/widget/ProgressBar;

    .line 42
    .line 43
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->e:Landroid/widget/ProgressBar;

    .line 44
    .line 45
    new-instance p2, La/sqs;

    .line 46
    .line 47
    const/16 v0, 0x15

    .line 48
    .line 49
    invoke-direct {p2, v0}, La/sqs;-><init>(B)V

    .line 50
    .line 51
    .line 52
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->f:Lkotlin/jvm/functions/Function0;

    .line 53
    .line 54
    new-instance p2, La/sqs;

    .line 55
    .line 56
    const/16 v0, 0x16

    .line 57
    .line 58
    invoke-direct {p2, v0}, La/sqs;-><init>(B)V

    .line 59
    .line 60
    .line 61
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->g:Lkotlin/jvm/functions/Function0;

    .line 62
    .line 63
    const-string p2, ""

    .line 64
    .line 65
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->h:Ljava/lang/String;

    .line 66
    .line 67
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->i:Ljava/lang/String;

    .line 68
    .line 69
    sget-object p2, La/w3w0;->b:La/w3w0;

    .line 70
    .line 71
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->j:La/w3w0;

    .line 72
    .line 73
    const p2, 0x7f06069d

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p2}, Landroid/content/Context;->getColor(I)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    iget-object p1, p1, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 88
    .line 89
    invoke-virtual {p1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->b()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_0

    .line 94
    .line 95
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iget-object p1, p1, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 100
    .line 101
    new-instance p2, La/x0t;

    .line 102
    .line 103
    const/4 v0, 0x0

    .line 104
    invoke-direct {p2, p0, v0}, La/x0t;-><init>(Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;B)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p2}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;->setOnMediaFileReddy(Lkotlin/jvm/functions/Function0;)V

    .line 108
    .line 109
    .line 110
    new-instance p2, La/x0t;

    .line 111
    .line 112
    const/4 v0, 0x1

    .line 113
    invoke-direct {p2, p0, v0}, La/x0t;-><init>(Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, p2}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;->setOnError(Lkotlin/jvm/functions/Function0;)V

    .line 117
    .line 118
    .line 119
    new-instance p2, La/x0t;

    .line 120
    .line 121
    const/4 v0, 0x2

    .line 122
    invoke-direct {p2, p0, v0}, La/x0t;-><init>(Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;B)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, p2}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;->setOnInternalError(Lkotlin/jvm/functions/Function0;)V

    .line 126
    .line 127
    .line 128
    :cond_0
    return-void
.end method

.method private final getBinding()La/ghu0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->b:La/a8z;

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
    check-cast p0, La/ghu0;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final i(Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;)Lkotlin/Unit;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 10
    .line 11
    iget-object v1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->h:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->c(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->k:Z

    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getOnMediaFileReddyListener()Lkotlin/jvm/functions/Function0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0
.end method

.method public static final j(Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;)Lkotlin/Unit;
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->e()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 15
    .line 16
    const-string v1, ""

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->c(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v0, v0, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 26
    .line 27
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->f()V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v0, v0, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 35
    .line 36
    iget-object v1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->i:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->c(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v0, v0, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 46
    .line 47
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->f()V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x1

    .line 51
    iput-boolean v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->k:Z

    .line 52
    .line 53
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0
.end method


# virtual methods
.method public final e()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    const-string v0, ""

    .line 15
    .line 16
    iput-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->i:Ljava/lang/String;

    .line 17
    .line 18
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v1, v1, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 23
    .line 24
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->e()V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v1, v1, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->c(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iget-object p0, p0, La/ghu0;->e:Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-virtual {p0, v0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->setPlayDrawable(Z)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->i:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->h:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 24
    .line 25
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->b()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    :goto_0
    return-void

    .line 32
    :cond_2
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v0, v0, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 37
    .line 38
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->f()V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v0, v0, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 46
    .line 47
    iget-object v1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->h:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->c(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    iget-object p0, p0, La/ghu0;->e:Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 60
    .line 61
    const/4 v0, 0x1

    .line 62
    invoke-virtual {p0, v0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->setPlayDrawable(Z)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final g(Ljava/lang/String;La/w3w0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->j:La/w3w0;

    .line 2
    .line 3
    if-eq p2, v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v0, v0, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->b()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->j:La/w3w0;

    .line 18
    .line 19
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-object p0, p0, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->c(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public getBroadcastingContainerView()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->c:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public getBroadcastingControlPanelView()Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->d:Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOnErrorListener()Lkotlin/jvm/functions/Function0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->g:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOnMediaFileReddyListener()Lkotlin/jvm/functions/Function0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->f:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic getProgressView()Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getProgressView()Landroid/widget/ProgressBar;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public getProgressView()Landroid/widget/ProgressBar;
    .locals 0

    .line 6
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->e:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method public final h()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 6
    .line 7
    invoke-virtual {p0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->a()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/sqs;

    .line 5
    .line 6
    const/16 v1, 0x14

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/sqs;-><init>(B)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->setOnMediaFileReddyListener(Lkotlin/jvm/functions/Function0;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setBroadcastingUrl(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 9
    .line 10
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->b()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iput-object p1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->i:Ljava/lang/String;

    .line 18
    .line 19
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p1, p1, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 24
    .line 25
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->i:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p1, p0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->c(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final setJavascriptInterface(La/r0t;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/ghu0;->d:Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneWebView;->setJavascriptInterface(La/r0t;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setOnErrorListener(Lkotlin/jvm/functions/Function0;)V
    .locals 0
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
    iput-object p1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->g:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method

.method public setOnMediaFileReddyListener(Lkotlin/jvm/functions/Function0;)V
    .locals 0
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
    iput-object p1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->f:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method

.method public final setPlayZoneCommand(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->h:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iput-object p1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->h:Ljava/lang/String;

    .line 14
    .line 15
    return-void
.end method

.method public final setZoneFormatDrawable(La/w3w0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/ghu0;->e:Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->setZoneFormatDrawable(La/w3w0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setZoneFormatIsVisible(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/zone/GameZoneView;->getBinding()La/ghu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/ghu0;->e:Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->setZoneFormatIsVisible(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
