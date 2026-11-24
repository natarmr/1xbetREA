.class public final Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;
.super La/ctr;
.source "SourceFile"


# static fields
.field public static final synthetic u:I


# instance fields
.field public final b:La/a8z;

.field public final c:Landroid/view/View;

.field public final d:Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

.field public final e:Landroid/widget/ImageView;

.field public final f:Landroid/widget/ProgressBar;

.field public g:Lkotlin/jvm/functions/Function0;

.field public h:Lkotlin/jvm/functions/Function0;

.field public i:Ljava/lang/String;

.field public j:La/ulo;

.field public k:Z

.field public l:Landroid/graphics/Bitmap;

.field public m:I

.field public n:I

.field public o:Z

.field public p:La/sje;

.field public final q:La/dfu0;

.field public r:La/c4m0;

.field public s:Z

.field public final t:La/gys;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    .line 125
    invoke-direct {p0, p1, v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

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
    const/4 v1, 0x2

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
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->b:La/a8z;

    .line 20
    .line 21
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iget-object p2, p2, La/fhu0;->c:Landroid/view/View;

    .line 26
    .line 27
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->c:Landroid/view/View;

    .line 28
    .line 29
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iget-object p2, p2, La/fhu0;->g:Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 34
    .line 35
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->d:Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 36
    .line 37
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    iget-object p2, p2, La/fhu0;->e:Landroid/widget/ImageView;

    .line 42
    .line 43
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->e:Landroid/widget/ImageView;

    .line 44
    .line 45
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    iget-object p2, p2, La/fhu0;->d:Landroid/widget/ProgressBar;

    .line 50
    .line 51
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->f:Landroid/widget/ProgressBar;

    .line 52
    .line 53
    new-instance p2, La/sqs;

    .line 54
    .line 55
    const/16 v0, 0x8

    .line 56
    .line 57
    invoke-direct {p2, v0}, La/sqs;-><init>(B)V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->g:Lkotlin/jvm/functions/Function0;

    .line 61
    .line 62
    new-instance p2, La/sqs;

    .line 63
    .line 64
    const/16 v0, 0x9

    .line 65
    .line 66
    invoke-direct {p2, v0}, La/sqs;-><init>(B)V

    .line 67
    .line 68
    .line 69
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->h:Lkotlin/jvm/functions/Function0;

    .line 70
    .line 71
    const-string p2, ""

    .line 72
    .line 73
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->i:Ljava/lang/String;

    .line 74
    .line 75
    const/4 p2, 0x1

    .line 76
    iput-boolean p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->k:Z

    .line 77
    .line 78
    new-instance v0, La/dfu0;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 81
    .line 82
    .line 83
    iput-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->q:La/dfu0;

    .line 84
    .line 85
    new-instance v0, La/gys;

    .line 86
    .line 87
    invoke-direct {v0, p0}, La/gys;-><init>(Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->t:La/gys;

    .line 91
    .line 92
    const v0, 0x7f06069d

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v0}, Landroid/content/Context;->getColor(I)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 100
    .line 101
    .line 102
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iget-object p1, p1, La/fhu0;->e:Landroid/widget/ImageView;

    .line 107
    .line 108
    const v0, 0x7f080a09

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 112
    .line 113
    .line 114
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    iget-object p0, p0, La/fhu0;->d:Landroid/widget/ProgressBar;

    .line 119
    .line 120
    const/4 p1, 0x0

    .line 121
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 122
    .line 123
    .line 124
    return-void
.end method

.method public static final synthetic e(Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;D)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setVolume(D)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final getBinding()La/fhu0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->b:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/fhu0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static j(Landroid/view/View;)Landroid/view/TextureView;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p0, Landroid/view/TextureView;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p0, Landroid/view/TextureView;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    check-cast p0, Landroid/view/ViewGroup;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {v1, v0}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_2
    move-object v1, v0

    .line 31
    check-cast v1, La/kkx;

    .line 32
    .line 33
    iget-boolean v1, v1, La/kkx;->c:Z

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    move-object v1, v0

    .line 38
    check-cast v1, La/bkx;

    .line 39
    .line 40
    invoke-virtual {v1}, La/bkx;->nextInt()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j(Landroid/view/View;)Landroid/view/TextureView;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    return-object v1

    .line 58
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 59
    return-object p0
.end method

.method private final setVolume(D)V
    .locals 5

    .line 1
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 2
    .line 3
    sub-double p1, v0, p1

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmpl-double v4, p1, v2

    .line 8
    .line 9
    if-lez v4, :cond_0

    .line 10
    .line 11
    invoke-static {p1, p2}, Ljava/lang/Math;->log(D)D

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    div-double/2addr v2, p1

    .line 20
    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    .line 21
    .line 22
    sub-double/2addr p1, v2

    .line 23
    double-to-float p1, p1

    .line 24
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, p1}, La/ulo;->V(F)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method


# virtual methods
.method public final f()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->h()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->i:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->o:Z

    .line 10
    .line 11
    iget-object v1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1, v0}, La/ulo;->P(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, La/ulo;->W()V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    const-wide/16 v0, 0x0

    .line 30
    .line 31
    invoke-virtual {p0, v0, v1}, La/ulo;->J(J)V

    .line 32
    .line 33
    .line 34
    :cond_2
    return-void
.end method

.method public final g()V
    .locals 7

    .line 1
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    invoke-virtual {v0}, La/ulo;->y()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v0, v2, :cond_6

    .line 12
    .line 13
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, La/fhu0;->f:Landroidx/media3/ui/PlayerView;

    .line 18
    .line 19
    invoke-static {v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j(Landroid/view/View;)Landroid/view/TextureView;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/TextureView;->getBitmap()Landroid/graphics/Bitmap;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    int-to-float v4, v4

    .line 44
    const/high16 v5, 0x3f000000    # 0.5f

    .line 45
    .line 46
    mul-float/2addr v4, v5

    .line 47
    float-to-int v4, v4

    .line 48
    if-ge v4, v2, :cond_1

    .line 49
    .line 50
    move v4, v2

    .line 51
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    int-to-float v6, v6

    .line 56
    mul-float/2addr v6, v5

    .line 57
    float-to-int v6, v6

    .line 58
    if-ge v6, v2, :cond_2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move v2, v6

    .line 62
    :goto_0
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 63
    .line 64
    invoke-static {v4, v2, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v4, Landroid/graphics/Canvas;

    .line 72
    .line 73
    invoke-direct {v4, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4, v5, v5}, Landroid/graphics/Canvas;->scale(FF)V

    .line 77
    .line 78
    .line 79
    new-instance v5, Landroid/graphics/Paint;

    .line 80
    .line 81
    const/4 v6, 0x2

    .line 82
    invoke-direct {v5, v6}, Landroid/graphics/Paint;-><init>(I)V

    .line 83
    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    invoke-virtual {v4, v0, v6, v6, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 87
    .line 88
    .line 89
    :try_start_0
    invoke-static {v3, v2}, La/y0x0;->D(Landroid/content/Context;Landroid/graphics/Bitmap;)V
    :try_end_0
    .catch Landroid/renderscript/RSRuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    .line 91
    .line 92
    :catch_0
    iput-object v2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->l:Landroid/graphics/Bitmap;

    .line 93
    .line 94
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget-object v0, v0, La/fhu0;->f:Landroidx/media3/ui/PlayerView;

    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iput v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->m:I

    .line 105
    .line 106
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iget-object v0, v0, La/fhu0;->f:Landroidx/media3/ui/PlayerView;

    .line 111
    .line 112
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    iput v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->n:I

    .line 117
    .line 118
    :cond_3
    :goto_1
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 119
    .line 120
    if-eqz v0, :cond_4

    .line 121
    .line 122
    invoke-virtual {v0, v1}, La/ulo;->P(Z)V

    .line 123
    .line 124
    .line 125
    :cond_4
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 126
    .line 127
    if-eqz v0, :cond_5

    .line 128
    .line 129
    invoke-virtual {v0}, La/ulo;->W()V

    .line 130
    .line 131
    .line 132
    :cond_5
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 133
    .line 134
    if-eqz v0, :cond_6

    .line 135
    .line 136
    const-wide/16 v2, 0x0

    .line 137
    .line 138
    invoke-virtual {v0, v2, v3}, La/ulo;->J(J)V

    .line 139
    .line 140
    .line 141
    :cond_6
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->h()V

    .line 142
    .line 143
    .line 144
    const-string v0, ""

    .line 145
    .line 146
    iput-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->i:Ljava/lang/String;

    .line 147
    .line 148
    iput-boolean v1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->o:Z

    .line 149
    .line 150
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iget-object v0, v0, La/fhu0;->f:Landroidx/media3/ui/PlayerView;

    .line 155
    .line 156
    const/16 v2, 0x8

    .line 157
    .line 158
    invoke-virtual {v0, v2}, Landroidx/media3/ui/PlayerView;->setVisibility(I)V

    .line 159
    .line 160
    .line 161
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->l:Landroid/graphics/Bitmap;

    .line 162
    .line 163
    if-eqz v0, :cond_7

    .line 164
    .line 165
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    iget-object v2, v2, La/fhu0;->b:Landroid/widget/ImageView;

    .line 170
    .line 171
    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    .line 172
    .line 173
    iget v4, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->m:I

    .line 174
    .line 175
    iget v5, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->n:I

    .line 176
    .line 177
    const/16 v6, 0x11

    .line 178
    .line 179
    invoke-direct {v3, v4, v5, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 183
    .line 184
    .line 185
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    iget-object v2, v2, La/fhu0;->b:Landroid/widget/ImageView;

    .line 190
    .line 191
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 192
    .line 193
    .line 194
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    iget-object p0, p0, La/fhu0;->b:Landroid/widget/ImageView;

    .line 199
    .line 200
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 201
    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_7
    invoke-virtual {p0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 205
    .line 206
    .line 207
    :goto_2
    return-void
.end method

.method public getBroadcastingContainerView()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->c:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public getBroadcastingControlPanelView()Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->d:Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOnMediaFileNeedReloadListener()Lkotlin/jvm/functions/Function0;
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
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->h:Lkotlin/jvm/functions/Function0;

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
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->g:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic getProgressView()Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getProgressView()Landroid/widget/ProgressBar;

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
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->f:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method public getSoundEnableButton()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->e:Landroid/widget/ImageView;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->r:La/c4m0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->r:La/c4m0;

    .line 10
    .line 11
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->q:La/dfu0;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput v1, v0, La/dfu0;->a:I

    .line 15
    .line 16
    iput-boolean v1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->s:Z

    .line 17
    .line 18
    return-void
.end method

.method public final i()V
    .locals 5

    .line 1
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->i:Ljava/lang/String;

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
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_0
    new-instance v0, La/elo;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v3, La/gwj;

    .line 25
    .line 26
    new-instance v4, La/hsj;

    .line 27
    .line 28
    invoke-direct {v4, v2}, La/hsj;-><init>(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    new-instance v2, La/huj;

    .line 32
    .line 33
    invoke-direct {v2}, La/huj;-><init>()V

    .line 34
    .line 35
    .line 36
    invoke-direct {v3, v4, v2}, La/gwj;-><init>(La/hsj;La/huj;)V

    .line 37
    .line 38
    .line 39
    new-instance v2, La/xx50;

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-direct {v2, v4, v4}, La/x860;-><init>(IZ)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v2}, La/gwj;->g(La/x860;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1, v3}, La/elo;-><init>(Landroid/content/Context;La/gwj;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, La/elo;->a()La/ulo;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, La/ulo;->v()La/scs0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, La/nyj;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v2, La/myj;

    .line 65
    .line 66
    invoke-direct {v2, v1}, La/myj;-><init>(La/nyj;)V

    .line 67
    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    iput-boolean v1, v2, La/rcs0;->v:Z

    .line 71
    .line 72
    new-instance v3, La/nyj;

    .line 73
    .line 74
    invoke-direct {v3, v2}, La/nyj;-><init>(La/myj;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v3}, La/ulo;->R(La/scs0;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 81
    .line 82
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iget-object v0, v0, La/fhu0;->f:Landroidx/media3/ui/PlayerView;

    .line 87
    .line 88
    iget-object v2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 89
    .line 90
    invoke-virtual {v0, v2}, Landroidx/media3/ui/PlayerView;->setPlayer(La/my90;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 94
    .line 95
    if-eqz v0, :cond_1

    .line 96
    .line 97
    iget-object v2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->t:La/gys;

    .line 98
    .line 99
    invoke-virtual {v0, v2}, La/ulo;->a(La/ky90;)V

    .line 100
    .line 101
    .line 102
    :cond_1
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 103
    .line 104
    if-eqz v0, :cond_2

    .line 105
    .line 106
    invoke-virtual {v0, v4}, La/ulo;->Q(I)V

    .line 107
    .line 108
    .line 109
    :cond_2
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iget-object v0, v0, La/fhu0;->f:Landroidx/media3/ui/PlayerView;

    .line 114
    .line 115
    invoke-virtual {v0, v4}, Landroidx/media3/ui/PlayerView;->setUseController(Z)V

    .line 116
    .line 117
    .line 118
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 119
    .line 120
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    iget-object v2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->i:Ljava/lang/String;

    .line 125
    .line 126
    invoke-static {v2}, Landroidx/media3/common/MediaItem;->a(Ljava/lang/String;)Landroidx/media3/common/MediaItem;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v0, v2}, La/ulo;->N(Landroidx/media3/common/MediaItem;)V

    .line 131
    .line 132
    .line 133
    :cond_3
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 134
    .line 135
    if-eqz v0, :cond_4

    .line 136
    .line 137
    invoke-virtual {v0}, La/ulo;->E()V

    .line 138
    .line 139
    .line 140
    :cond_4
    iget-boolean v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->o:Z

    .line 141
    .line 142
    if-eqz v0, :cond_5

    .line 143
    .line 144
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 145
    .line 146
    if-eqz p0, :cond_5

    .line 147
    .line 148
    invoke-virtual {p0, v1}, La/ulo;->P(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    .line 151
    :cond_5
    :goto_0
    return-void

    .line 152
    :catchall_0
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 153
    .line 154
    return-void
.end method

.method public final k()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->h()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->n()V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object p0, p0, La/fhu0;->f:Landroidx/media3/ui/PlayerView;

    .line 12
    .line 13
    const/16 v0, 0x8

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroidx/media3/ui/PlayerView;->setVisibility(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final l()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->s:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->r:La/c4m0;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 12
    .line 13
    .line 14
    :cond_1
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->q:La/dfu0;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, v0, La/dfu0;->a:I

    .line 18
    .line 19
    sget-object v0, La/wen;->b:La/uen;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    invoke-virtual {p0, v0, v1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->o(J)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final m()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->l:Landroid/graphics/Bitmap;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput v1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->m:I

    .line 6
    .line 7
    iput v1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->n:I

    .line 8
    .line 9
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v2, v2, La/fhu0;->b:Landroid/widget/ImageView;

    .line 14
    .line 15
    const/16 v3, 0x8

    .line 16
    .line 17
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-object v2, v2, La/fhu0;->b:Landroid/widget/ImageView;

    .line 25
    .line 26
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget-object p0, p0, La/fhu0;->f:Landroidx/media3/ui/PlayerView;

    .line 34
    .line 35
    invoke-virtual {p0, v1}, Landroidx/media3/ui/PlayerView;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final n()V
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    iget-object v2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->t:La/gys;

    .line 10
    .line 11
    invoke-virtual {v0, v2}, La/ulo;->G(La/ky90;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iget-object p0, p0, La/fhu0;->f:Landroidx/media3/ui/PlayerView;

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroidx/media3/ui/PlayerView;->setPlayer(La/my90;)V

    .line 21
    .line 22
    .line 23
    :try_start_0
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 24
    .line 25
    invoke-virtual {v0}, La/ulo;->W()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 30
    .line 31
    :goto_0
    :try_start_1
    invoke-virtual {v0}, La/ulo;->F()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :catchall_1
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 36
    .line 37
    :goto_1
    return-void
.end method

.method public final o(J)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->s:Z

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setProgressVisible(Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->r:La/c4m0;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, v5}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->p:La/sje;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    new-instance v1, La/ey;

    .line 20
    .line 21
    const/16 v6, 0x15

    .line 22
    .line 23
    move-object v4, p0

    .line 24
    move-wide v2, p1

    .line 25
    invoke-direct/range {v1 .. v6}, La/ey;-><init>(JLjava/lang/Object;La/yje;B)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x3

    .line 29
    invoke-static {v0, v5, v5, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    move-object v4, p0

    .line 35
    :goto_0
    iput-object v5, v4, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->r:La/c4m0;

    .line 36
    .line 37
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, La/tvk;->a:La/rwj;

    .line 9
    .line 10
    sget-object v1, La/ys10;->a:La/vs10;

    .line 11
    .line 12
    invoke-virtual {v1}, La/vs10;->x()La/vs10;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v0, v1}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->p:La/sje;

    .line 25
    .line 26
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->p:La/sje;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0, v1}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iput-object v1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->p:La/sje;

    .line 13
    .line 14
    iput-object v1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->r:La/c4m0;

    .line 15
    .line 16
    const-string v0, ""

    .line 17
    .line 18
    iput-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->i:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->h()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->n()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final p()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->f()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, 0x7f06069d

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/Context;->getColor(I)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p0, v0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setProgressVisible(Z)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v0, v0, La/fhu0;->b:Landroid/widget/ImageView;

    .line 27
    .line 28
    const/16 v1, 0x8

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v0, v0, La/fhu0;->b:Landroid/widget/ImageView;

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iget-object p0, p0, La/fhu0;->f:Landroidx/media3/ui/PlayerView;

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Landroidx/media3/ui/PlayerView;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public setBroadcastingUrl(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->i:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    const-string v0, ""

    .line 14
    .line 15
    iput-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->i:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->h()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->n()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->h()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->m()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->i:Ljava/lang/String;

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    iput-boolean p1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->o:Z

    .line 33
    .line 34
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->i()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final setOnMediaFileNeedReloadListener(Lkotlin/jvm/functions/Function0;)V
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
    iput-object p1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->h:Lkotlin/jvm/functions/Function0;

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
    iput-object p1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->g:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    return-void
.end method

.method public setProgressVisible(Z)V
    .locals 2

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->s:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, La/ulo;->s()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x2

    .line 16
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    invoke-super {p0, p1}, La/ctr;->setProgressVisible(Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final setSoundEnable(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->k:Z

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    if-eqz p1, :cond_1

    .line 11
    .line 12
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 13
    .line 14
    invoke-direct {p0, v0, v1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setVolume(D)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object p1, p1, La/fhu0;->e:Landroid/widget/ImageView;

    .line 22
    .line 23
    const v0, 0x7f080a09

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    iput-boolean p1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->k:Z

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    const-wide/16 v0, 0x0

    .line 34
    .line 35
    invoke-direct {p0, v0, v1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setVolume(D)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getBinding()La/fhu0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object p1, p1, La/fhu0;->e:Landroid/widget/ImageView;

    .line 43
    .line 44
    const v0, 0x7f080a08

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 48
    .line 49
    .line 50
    const/4 p1, 0x0

    .line 51
    iput-boolean p1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->k:Z

    .line 52
    .line 53
    :cond_2
    :goto_0
    return-void
.end method
