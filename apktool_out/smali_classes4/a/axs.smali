.class public abstract La/axs;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme;)La/zws;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    instance-of v0, p0, Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme$Static;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance p0, La/zws;

    .line 11
    .line 12
    const v0, 0x7f040b2d

    .line 13
    .line 14
    .line 15
    const v1, 0x7f040b5f

    .line 16
    .line 17
    .line 18
    invoke-direct {p0, v0, v1, v1}, La/zws;-><init>(III)V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    instance-of p0, p0, Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme$Theme;

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    new-instance p0, La/zws;

    .line 27
    .line 28
    const v0, 0x7f040b72

    .line 29
    .line 30
    .line 31
    const v1, 0x7f040b0f

    .line 32
    .line 33
    .line 34
    const v2, 0x7f040b0d

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v2, v0, v1}, La/zws;-><init>(III)V

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    return-object p0
.end method
