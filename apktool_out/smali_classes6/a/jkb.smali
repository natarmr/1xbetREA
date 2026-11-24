.class public final La/jkb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:La/ypl0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/ypl0;)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/jkb;->a:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/jkb;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/jkb;->c:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, La/jkb;->d:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, La/jkb;->e:La/ypl0;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/jkb;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/jkb;

    .line 12
    .line 13
    iget-object v1, p1, La/jkb;->a:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 16
    .line 17
    iget-object v3, p0, La/jkb;->a:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    return v2

    .line 26
    :cond_2
    iget-object v1, p0, La/jkb;->b:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v3, p1, La/jkb;->b:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    return v2

    .line 37
    :cond_3
    iget-object v1, p0, La/jkb;->c:Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v3, p1, La/jkb;->c:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_4

    .line 46
    .line 47
    return v2

    .line 48
    :cond_4
    iget-object v1, p0, La/jkb;->d:Ljava/lang/Object;

    .line 49
    .line 50
    iget-object v3, p1, La/jkb;->d:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-nez v1, :cond_5

    .line 57
    .line 58
    return v2

    .line 59
    :cond_5
    iget-object p0, p0, La/jkb;->e:La/ypl0;

    .line 60
    .line 61
    iget-object p1, p1, La/jkb;->e:La/ypl0;

    .line 62
    .line 63
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-nez p0, :cond_6

    .line 68
    .line 69
    return v2

    .line 70
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/jkb;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, La/j0g0;->b(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, La/jkb;->b:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/twn;->c(IILjava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/jkb;->c:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/twn;->c(IILjava/lang/Object;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/jkb;->d:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/twn;->c(IILjava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object p0, p0, La/jkb;->e:La/ypl0;

    .line 29
    .line 30
    invoke-virtual {p0}, La/ypl0;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, La/jkb;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, La/j0g0;->d(Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, La/jkb;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v1}, La/j0g0;->d(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, La/jkb;->c:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {v2}, La/j0g0;->d(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, p0, La/jkb;->d:Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {v3}, La/j0g0;->d(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-string v4, ", liveGamesResult="

    .line 26
    .line 27
    const-string v5, ", lineGamesResult="

    .line 28
    .line 29
    const-string v6, "ChampionshipScenarioModel(tournamentResult="

    .line 30
    .line 31
    invoke-static {v6, v0, v4, v1, v5}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, ", leaderboardResult="

    .line 36
    .line 37
    const-string v4, ", sportSimpleModel="

    .line 38
    .line 39
    invoke-static {v0, v2, v1, v3, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, La/jkb;->e:La/ypl0;

    .line 43
    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p0, ")"

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method
