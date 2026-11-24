.class public abstract La/wpk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;La/v5l0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)La/kuj;
    .locals 4

    .line 1
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    sget-object p2, La/q0s;->a:La/q0s;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object p2, La/q0s;->b:La/q0s;

    .line 13
    .line 14
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    const/4 v0, 0x1

    .line 19
    if-eqz p1, :cond_5

    .line 20
    .line 21
    if-eq p1, v0, :cond_4

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    if-eq p1, v1, :cond_3

    .line 25
    .line 26
    const/4 v1, 0x3

    .line 27
    if-eq p1, v1, :cond_2

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    if-ne p1, v1, :cond_1

    .line 31
    .line 32
    sget-object p1, La/h0l0;->a:La/h0l0;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    return-object p0

    .line 40
    :cond_2
    sget-object p1, La/i0l0;->a:La/i0l0;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    sget-object p1, La/j0l0;->a:La/j0l0;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_4
    sget-object p1, La/k0l0;->a:La/k0l0;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_5
    sget-object p1, La/g0l0;->a:La/g0l0;

    .line 50
    .line 51
    :goto_1
    new-instance v1, La/vb90;

    .line 52
    .line 53
    new-instance v2, La/x56;

    .line 54
    .line 55
    invoke-direct {v2, p1}, La/x56;-><init>(La/l0l0;)V

    .line 56
    .line 57
    .line 58
    new-instance v3, La/x56;

    .line 59
    .line 60
    invoke-direct {v3, p1}, La/x56;-><init>(La/l0l0;)V

    .line 61
    .line 62
    .line 63
    filled-new-array {v2, v3}, [La/x56;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const/4 v2, 0x0

    .line 72
    invoke-direct {v1, p2, p1, v2, v0}, La/vb90;-><init>(La/q0s;La/a4x;ZZ)V

    .line 73
    .line 74
    .line 75
    new-instance p1, La/kuj;

    .line 76
    .line 77
    invoke-direct {p1, p0, v1}, La/kuj;-><init>(Ljava/lang/String;La/vb90;)V

    .line 78
    .line 79
    .line 80
    return-object p1
.end method
