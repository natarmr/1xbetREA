.class public abstract Lorg/xplatform/cyber/section/api/domain/entity/d;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string p0, "1XCyber"

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 16
    .line 17
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const-string p0, "real"

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 27
    .line 28
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    const-string p0, "virtual"

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public static final b(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 5
    .line 6
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string p0, "stream"

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 16
    .line 17
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const-string p0, "real"

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 27
    .line 28
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    const-string p0, "virtual"

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 38
    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    return-object p0
.end method

.method public static final c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Lkotlin/Pair;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    new-instance p2, Lkotlin/Pair;

    .line 13
    .line 14
    const-wide/16 v0, 0x28

    .line 15
    .line 16
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {p2, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-object p2

    .line 28
    :cond_0
    new-instance p2, Lkotlin/Pair;

    .line 29
    .line 30
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-wide/16 v0, -0x1

    .line 35
    .line 36
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {p2, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object p2
.end method

.method public static final d(I)Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;
    .locals 3

    .line 1
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 2
    .line 3
    iget-byte v1, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 4
    .line 5
    if-ne p0, v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 9
    .line 10
    iget-byte v2, v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 11
    .line 12
    if-ne p0, v2, :cond_1

    .line 13
    .line 14
    return-object v1

    .line 15
    :cond_1
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 16
    .line 17
    iget-byte v2, v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 18
    .line 19
    if-ne p0, v2, :cond_2

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_2
    :goto_0
    return-object v0
.end method

.method public static final e(I)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 2
    .line 3
    iget-byte v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 9
    .line 10
    iget-byte v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 11
    .line 12
    if-ne p0, v0, :cond_1

    .line 13
    .line 14
    const-string p0, "virtual"

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 18
    .line 19
    iget-byte v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 20
    .line 21
    if-ne p0, v0, :cond_2

    .line 22
    .line 23
    const-string p0, "cyber"

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    :goto_0
    const-string p0, "real"

    .line 27
    .line 28
    return-object p0
.end method
