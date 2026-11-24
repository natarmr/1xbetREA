.class public final La/k7h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/a4x;

.field public final b:La/a4x;

.field public final c:J

.field public final d:J

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:La/vbg;


# direct methods
.method public constructor <init>(La/a4x;La/a4x;JJZZZZLa/vbg;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/k7h;->a:La/a4x;

    .line 11
    .line 12
    iput-object p2, p0, La/k7h;->b:La/a4x;

    .line 13
    .line 14
    iput-wide p3, p0, La/k7h;->c:J

    .line 15
    .line 16
    iput-wide p5, p0, La/k7h;->d:J

    .line 17
    .line 18
    iput-boolean p7, p0, La/k7h;->e:Z

    .line 19
    .line 20
    iput-boolean p8, p0, La/k7h;->f:Z

    .line 21
    .line 22
    iput-boolean p9, p0, La/k7h;->g:Z

    .line 23
    .line 24
    iput-boolean p10, p0, La/k7h;->h:Z

    .line 25
    .line 26
    iput-object p11, p0, La/k7h;->i:La/vbg;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/k7h;

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
    check-cast p1, La/k7h;

    .line 12
    .line 13
    iget-object v1, p0, La/k7h;->a:La/a4x;

    .line 14
    .line 15
    iget-object v3, p1, La/k7h;->a:La/a4x;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, La/k7h;->b:La/a4x;

    .line 25
    .line 26
    iget-object v3, p1, La/k7h;->b:La/a4x;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-wide v3, p0, La/k7h;->c:J

    .line 36
    .line 37
    iget-wide v5, p1, La/k7h;->c:J

    .line 38
    .line 39
    cmp-long v1, v3, v5

    .line 40
    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    iget-wide v3, p0, La/k7h;->d:J

    .line 45
    .line 46
    iget-wide v5, p1, La/k7h;->d:J

    .line 47
    .line 48
    cmp-long v1, v3, v5

    .line 49
    .line 50
    if-eqz v1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-boolean v1, p0, La/k7h;->e:Z

    .line 54
    .line 55
    iget-boolean v3, p1, La/k7h;->e:Z

    .line 56
    .line 57
    if-eq v1, v3, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    iget-boolean v1, p0, La/k7h;->f:Z

    .line 61
    .line 62
    iget-boolean v3, p1, La/k7h;->f:Z

    .line 63
    .line 64
    if-eq v1, v3, :cond_7

    .line 65
    .line 66
    return v2

    .line 67
    :cond_7
    iget-boolean v1, p0, La/k7h;->g:Z

    .line 68
    .line 69
    iget-boolean v3, p1, La/k7h;->g:Z

    .line 70
    .line 71
    if-eq v1, v3, :cond_8

    .line 72
    .line 73
    return v2

    .line 74
    :cond_8
    iget-boolean v1, p0, La/k7h;->h:Z

    .line 75
    .line 76
    iget-boolean v3, p1, La/k7h;->h:Z

    .line 77
    .line 78
    if-eq v1, v3, :cond_9

    .line 79
    .line 80
    return v2

    .line 81
    :cond_9
    iget-object p0, p0, La/k7h;->i:La/vbg;

    .line 82
    .line 83
    iget-object p1, p1, La/k7h;->i:La/vbg;

    .line 84
    .line 85
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-nez p0, :cond_a

    .line 90
    .line 91
    return v2

    .line 92
    :cond_a
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/k7h;->a:La/a4x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, La/k7h;->b:La/a4x;

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/k7h;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/k7h;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/k7h;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/k7h;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/k7h;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, La/k7h;->h:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object p0, p0, La/k7h;->i:La/vbg;

    .line 53
    .line 54
    if-nez p0, :cond_0

    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    :goto_0
    add-int/2addr v0, p0

    .line 63
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", categories="

    .line 2
    .line 3
    const-string v1, ", selectedSubGameId="

    .line 4
    .line 5
    const-string v2, "CyberMarketsUiState(subGames="

    .line 6
    .line 7
    iget-object v3, p0, La/k7h;->a:La/a4x;

    .line 8
    .line 9
    iget-object v4, p0, La/k7h;->b:La/a4x;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/rw2;->q(Ljava/lang/String;La/a4x;Ljava/lang/String;La/a4x;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, La/k7h;->c:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", selectedCategoryId="

    .line 21
    .line 22
    const-string v2, ", categoriesVisible="

    .line 23
    .line 24
    iget-wide v3, p0, La/k7h;->d:J

    .line 25
    .line 26
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v1, ", subGamesVisible="

    .line 30
    .line 31
    const-string v2, ", subGamesFilterVisible="

    .line 32
    .line 33
    iget-boolean v3, p0, La/k7h;->e:Z

    .line 34
    .line 35
    iget-boolean v4, p0, La/k7h;->f:Z

    .line 36
    .line 37
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 38
    .line 39
    .line 40
    const-string v1, ", isLoading="

    .line 41
    .line 42
    const-string v2, ", categoryMarkets="

    .line 43
    .line 44
    iget-boolean v3, p0, La/k7h;->g:Z

    .line 45
    .line 46
    iget-boolean v4, p0, La/k7h;->h:Z

    .line 47
    .line 48
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, La/k7h;->i:La/vbg;

    .line 52
    .line 53
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string p0, ")"

    .line 57
    .line 58
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method
