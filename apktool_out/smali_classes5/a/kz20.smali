.class public final La/kz20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/lz20;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:La/qym0;

.field public final c:J

.field public final d:J

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:La/udl0;

.field public final j:La/nym0;

.field public final k:Z

.field public final l:Z

.field public final m:La/lm6;


# direct methods
.method public constructor <init>(Ljava/util/List;La/qym0;JJZZZZLa/udl0;La/nym0;ZZLa/lm6;)V
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
    iput-object p1, p0, La/kz20;->a:Ljava/util/List;

    .line 11
    .line 12
    iput-object p2, p0, La/kz20;->b:La/qym0;

    .line 13
    .line 14
    iput-wide p3, p0, La/kz20;->c:J

    .line 15
    .line 16
    iput-wide p5, p0, La/kz20;->d:J

    .line 17
    .line 18
    iput-boolean p7, p0, La/kz20;->e:Z

    .line 19
    .line 20
    iput-boolean p8, p0, La/kz20;->f:Z

    .line 21
    .line 22
    iput-boolean p9, p0, La/kz20;->g:Z

    .line 23
    .line 24
    iput-boolean p10, p0, La/kz20;->h:Z

    .line 25
    .line 26
    iput-object p11, p0, La/kz20;->i:La/udl0;

    .line 27
    .line 28
    iput-object p12, p0, La/kz20;->j:La/nym0;

    .line 29
    .line 30
    iput-boolean p13, p0, La/kz20;->k:Z

    .line 31
    .line 32
    iput-boolean p14, p0, La/kz20;->l:Z

    .line 33
    .line 34
    iput-object p15, p0, La/kz20;->m:La/lm6;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/kz20;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/kz20;

    .line 12
    .line 13
    iget-object v0, p0, La/kz20;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object v1, p1, La/kz20;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, La/kz20;->b:La/qym0;

    .line 26
    .line 27
    iget-object v1, p1, La/kz20;->b:La/qym0;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    iget-wide v0, p0, La/kz20;->c:J

    .line 37
    .line 38
    iget-wide v2, p1, La/kz20;->c:J

    .line 39
    .line 40
    cmp-long v0, v0, v2

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_4
    iget-wide v0, p0, La/kz20;->d:J

    .line 46
    .line 47
    iget-wide v2, p1, La/kz20;->d:J

    .line 48
    .line 49
    cmp-long v0, v0, v2

    .line 50
    .line 51
    if-eqz v0, :cond_5

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_5
    iget-boolean v0, p0, La/kz20;->e:Z

    .line 55
    .line 56
    iget-boolean v1, p1, La/kz20;->e:Z

    .line 57
    .line 58
    if-eq v0, v1, :cond_6

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_6
    iget-boolean v0, p0, La/kz20;->f:Z

    .line 62
    .line 63
    iget-boolean v1, p1, La/kz20;->f:Z

    .line 64
    .line 65
    if-eq v0, v1, :cond_7

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_7
    iget-boolean v0, p0, La/kz20;->g:Z

    .line 69
    .line 70
    iget-boolean v1, p1, La/kz20;->g:Z

    .line 71
    .line 72
    if-eq v0, v1, :cond_8

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_8
    iget-boolean v0, p0, La/kz20;->h:Z

    .line 76
    .line 77
    iget-boolean v1, p1, La/kz20;->h:Z

    .line 78
    .line 79
    if-eq v0, v1, :cond_9

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_9
    iget-object v0, p0, La/kz20;->i:La/udl0;

    .line 83
    .line 84
    iget-object v1, p1, La/kz20;->i:La/udl0;

    .line 85
    .line 86
    if-eq v0, v1, :cond_a

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_a
    iget-object v0, p0, La/kz20;->j:La/nym0;

    .line 90
    .line 91
    iget-object v1, p1, La/kz20;->j:La/nym0;

    .line 92
    .line 93
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_b

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_b
    iget-boolean v0, p0, La/kz20;->k:Z

    .line 101
    .line 102
    iget-boolean v1, p1, La/kz20;->k:Z

    .line 103
    .line 104
    if-eq v0, v1, :cond_c

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_c
    iget-boolean v0, p0, La/kz20;->l:Z

    .line 108
    .line 109
    iget-boolean v1, p1, La/kz20;->l:Z

    .line 110
    .line 111
    if-eq v0, v1, :cond_d

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_d
    iget-object p0, p0, La/kz20;->m:La/lm6;

    .line 115
    .line 116
    iget-object p1, p1, La/kz20;->m:La/lm6;

    .line 117
    .line 118
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-nez p0, :cond_e

    .line 123
    .line 124
    :goto_0
    const/4 p0, 0x0

    .line 125
    return p0

    .line 126
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 127
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, La/kz20;->a:Ljava/util/List;

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
    iget-object v2, p0, La/kz20;->b:La/qym0;

    .line 11
    .line 12
    invoke-virtual {v2}, La/qym0;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-wide v3, p0, La/kz20;->c:J

    .line 19
    .line 20
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-wide v2, p0, La/kz20;->d:J

    .line 25
    .line 26
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, La/kz20;->e:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-boolean v2, p0, La/kz20;->f:Z

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-boolean v2, p0, La/kz20;->g:Z

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-boolean v2, p0, La/kz20;->h:Z

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-object v2, p0, La/kz20;->i:La/udl0;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    add-int/2addr v2, v0

    .line 61
    mul-int/2addr v2, v1

    .line 62
    const/4 v0, 0x0

    .line 63
    iget-object v3, p0, La/kz20;->j:La/nym0;

    .line 64
    .line 65
    if-nez v3, :cond_0

    .line 66
    .line 67
    move v3, v0

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    iget-object v3, v3, La/nym0;->a:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    :goto_0
    add-int/2addr v2, v3

    .line 76
    mul-int/2addr v2, v1

    .line 77
    iget-boolean v3, p0, La/kz20;->k:Z

    .line 78
    .line 79
    invoke-static {v2, v1, v3}, La/brm0;->e(IIZ)I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    iget-boolean v3, p0, La/kz20;->l:Z

    .line 84
    .line 85
    invoke-static {v2, v1, v3}, La/brm0;->e(IIZ)I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    iget-object p0, p0, La/kz20;->m:La/lm6;

    .line 90
    .line 91
    if-nez p0, :cond_1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    invoke-virtual {p0}, La/lm6;->hashCode()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    :goto_1
    add-int/2addr v1, v0

    .line 99
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Success(categories="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/kz20;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", subGames="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/kz20;->b:La/qym0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", selectedSubGameId="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-wide v1, p0, La/kz20;->c:J

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", selectedCategoryId="

    .line 34
    .line 35
    const-string v2, ", categoriesVisible="

    .line 36
    .line 37
    iget-wide v3, p0, La/kz20;->d:J

    .line 38
    .line 39
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v1, ", categoriesLoading="

    .line 43
    .line 44
    const-string v2, ", subGamesVisible="

    .line 45
    .line 46
    iget-boolean v3, p0, La/kz20;->e:Z

    .line 47
    .line 48
    iget-boolean v4, p0, La/kz20;->f:Z

    .line 49
    .line 50
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 51
    .line 52
    .line 53
    const-string v1, ", subGamesLoading="

    .line 54
    .line 55
    const-string v2, ", sportGameType="

    .line 56
    .line 57
    iget-boolean v3, p0, La/kz20;->g:Z

    .line 58
    .line 59
    iget-boolean v4, p0, La/kz20;->h:Z

    .line 60
    .line 61
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, La/kz20;->i:La/udl0;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, ", subGamesSearch="

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    iget-object v1, p0, La/kz20;->j:La/nym0;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ", isSubGamesSearchEnabled="

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", isMarketsDisplaySettingsVisible="

    .line 85
    .line 86
    const-string v2, ", betBuilder="

    .line 87
    .line 88
    iget-boolean v3, p0, La/kz20;->k:Z

    .line 89
    .line 90
    iget-boolean v4, p0, La/kz20;->l:Z

    .line 91
    .line 92
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 93
    .line 94
    .line 95
    iget-object p0, p0, La/kz20;->m:La/lm6;

    .line 96
    .line 97
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string p0, ")"

    .line 101
    .line 102
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0
.end method
