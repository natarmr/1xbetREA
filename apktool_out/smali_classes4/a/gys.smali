.class public final La/gys;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ky90;


# instance fields
.field public final synthetic a:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;


# direct methods
.method public constructor <init>(Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/gys;->a:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final G(La/dlo;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget p1, p1, La/dlo;->a:I

    .line 5
    .line 6
    sget v0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->u:I

    .line 7
    .line 8
    iget-object p0, p0, La/gys;->a:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 9
    .line 10
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->j:La/ulo;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, La/ulo;->r()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-ne v0, v2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v2, v1

    .line 24
    :goto_0
    iput-boolean v2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->o:Z

    .line 25
    .line 26
    iget-object v0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->i:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    sget-object v0, La/xx90;->a:Ljava/util/Set;

    .line 36
    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    :goto_1
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->h()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setProgressVisible(Z)V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->h:Lkotlin/jvm/functions/Function0;

    .line 54
    .line 55
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    const/16 v0, 0x3ea

    .line 60
    .line 61
    if-ne p1, v0, :cond_3

    .line 62
    .line 63
    sget-object p1, La/wen;->b:La/uen;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    const-wide/16 v0, 0x0

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    iget-object p1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->q:La/dfu0;

    .line 72
    .line 73
    invoke-virtual {p1}, La/dfu0;->a()J

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    :goto_2
    invoke-virtual {p0, v0, v1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->o(J)V

    .line 78
    .line 79
    .line 80
    return-void
.end method

.method public final f(I)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iget-object p0, p0, La/gys;->a:Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;

    .line 3
    .line 4
    if-eq p1, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    sget p1, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->u:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->h()V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-virtual {p0, p1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setProgressVisible(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->getOnMediaFileReddyListener()Lkotlin/jvm/functions/Function0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    iget-boolean p1, p0, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->k:Z

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    .line 31
    .line 32
    invoke-static {p0, v0, v1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->e(Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;D)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    const-wide/16 v0, 0x0

    .line 37
    .line 38
    invoke-static {p0, v0, v1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->e(Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;D)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    const/4 p1, 0x1

    .line 43
    invoke-virtual {p0, p1}, Lorg/xplatform/game_broadcasting/impl/presentation/video/GameVideoView;->setProgressVisible(Z)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
