.class public final La/db1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:J

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:I

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;JJZZZIZZZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p1, p0, La/db1;->a:J

    .line 11
    .line 12
    iput-object p3, p0, La/db1;->b:Ljava/lang/String;

    .line 13
    .line 14
    iput-wide p4, p0, La/db1;->c:J

    .line 15
    .line 16
    iput-wide p6, p0, La/db1;->d:J

    .line 17
    .line 18
    iput-boolean p8, p0, La/db1;->e:Z

    .line 19
    .line 20
    iput-boolean p9, p0, La/db1;->f:Z

    .line 21
    .line 22
    iput-boolean p10, p0, La/db1;->g:Z

    .line 23
    .line 24
    iput p11, p0, La/db1;->h:I

    .line 25
    .line 26
    iput-boolean p12, p0, La/db1;->i:Z

    .line 27
    .line 28
    iput-boolean p13, p0, La/db1;->j:Z

    .line 29
    .line 30
    iput-boolean p14, p0, La/db1;->k:Z

    .line 31
    .line 32
    iput-object p15, p0, La/db1;->l:Ljava/lang/String;

    .line 33
    .line 34
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
    instance-of v1, p1, La/db1;

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
    check-cast p1, La/db1;

    .line 12
    .line 13
    iget-wide v3, p0, La/db1;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, La/db1;->a:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget-object v1, p0, La/db1;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p1, La/db1;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-wide v3, p0, La/db1;->c:J

    .line 34
    .line 35
    iget-wide v5, p1, La/db1;->c:J

    .line 36
    .line 37
    cmp-long v1, v3, v5

    .line 38
    .line 39
    if-eqz v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-wide v3, p0, La/db1;->d:J

    .line 43
    .line 44
    iget-wide v5, p1, La/db1;->d:J

    .line 45
    .line 46
    cmp-long v1, v3, v5

    .line 47
    .line 48
    if-eqz v1, :cond_5

    .line 49
    .line 50
    return v2

    .line 51
    :cond_5
    iget-boolean v1, p0, La/db1;->e:Z

    .line 52
    .line 53
    iget-boolean v3, p1, La/db1;->e:Z

    .line 54
    .line 55
    if-eq v1, v3, :cond_6

    .line 56
    .line 57
    return v2

    .line 58
    :cond_6
    iget-boolean v1, p0, La/db1;->f:Z

    .line 59
    .line 60
    iget-boolean v3, p1, La/db1;->f:Z

    .line 61
    .line 62
    if-eq v1, v3, :cond_7

    .line 63
    .line 64
    return v2

    .line 65
    :cond_7
    iget-boolean v1, p0, La/db1;->g:Z

    .line 66
    .line 67
    iget-boolean v3, p1, La/db1;->g:Z

    .line 68
    .line 69
    if-eq v1, v3, :cond_8

    .line 70
    .line 71
    return v2

    .line 72
    :cond_8
    iget v1, p0, La/db1;->h:I

    .line 73
    .line 74
    iget v3, p1, La/db1;->h:I

    .line 75
    .line 76
    if-eq v1, v3, :cond_9

    .line 77
    .line 78
    return v2

    .line 79
    :cond_9
    iget-boolean v1, p0, La/db1;->i:Z

    .line 80
    .line 81
    iget-boolean v3, p1, La/db1;->i:Z

    .line 82
    .line 83
    if-eq v1, v3, :cond_a

    .line 84
    .line 85
    return v2

    .line 86
    :cond_a
    iget-boolean v1, p0, La/db1;->j:Z

    .line 87
    .line 88
    iget-boolean v3, p1, La/db1;->j:Z

    .line 89
    .line 90
    if-eq v1, v3, :cond_b

    .line 91
    .line 92
    return v2

    .line 93
    :cond_b
    iget-boolean v1, p0, La/db1;->k:Z

    .line 94
    .line 95
    iget-boolean v3, p1, La/db1;->k:Z

    .line 96
    .line 97
    if-eq v1, v3, :cond_c

    .line 98
    .line 99
    return v2

    .line 100
    :cond_c
    iget-object p0, p0, La/db1;->l:Ljava/lang/String;

    .line 101
    .line 102
    iget-object p1, p1, La/db1;->l:Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-nez p0, :cond_d

    .line 109
    .line 110
    return v2

    .line 111
    :cond_d
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/db1;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

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
    iget-object v2, p0, La/db1;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/db1;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/db1;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/db1;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/db1;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/db1;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, La/db1;->h:I

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/db1;->i:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, La/db1;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, La/db1;->k:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object p0, p0, La/db1;->l:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    add-int/2addr p0, v0

    .line 77
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "AggregatorPreloadGameModel(gameId="

    .line 2
    .line 3
    const-string v1, ", gameName="

    .line 4
    .line 5
    iget-wide v2, p0, La/db1;->a:J

    .line 6
    .line 7
    iget-object v4, p0, La/db1;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", providerId="

    .line 14
    .line 15
    const-string v2, ", productId="

    .line 16
    .line 17
    iget-wide v3, p0, La/db1;->c:J

    .line 18
    .line 19
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, ", noLoyalty="

    .line 23
    .line 24
    iget-wide v2, p0, La/db1;->d:J

    .line 25
    .line 26
    iget-boolean v4, p0, La/db1;->e:Z

    .line 27
    .line 28
    invoke-static {v2, v3, v1, v0, v4}, La/hne;->t(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 29
    .line 30
    .line 31
    const-string v1, ", needTransfer="

    .line 32
    .line 33
    const-string v2, ", fromMainScreen="

    .line 34
    .line 35
    iget-boolean v3, p0, La/db1;->f:Z

    .line 36
    .line 37
    iget-boolean v4, p0, La/db1;->g:Z

    .line 38
    .line 39
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 40
    .line 41
    .line 42
    const-string v1, ", subcategoryId="

    .line 43
    .line 44
    const-string v2, ", demoAvailable="

    .line 45
    .line 46
    iget v3, p0, La/db1;->h:I

    .line 47
    .line 48
    iget-boolean v4, p0, La/db1;->i:Z

    .line 49
    .line 50
    invoke-static {v3, v1, v2, v0, v4}, La/dw9;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 51
    .line 52
    .line 53
    const-string v1, ", bonusGame="

    .line 54
    .line 55
    const-string v2, ", checkGame="

    .line 56
    .line 57
    iget-boolean v3, p0, La/db1;->j:Z

    .line 58
    .line 59
    iget-boolean v4, p0, La/db1;->k:Z

    .line 60
    .line 61
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 62
    .line 63
    .line 64
    const-string v1, ", gameMetricsUid="

    .line 65
    .line 66
    const-string v2, ")"

    .line 67
    .line 68
    iget-object p0, p0, La/db1;->l:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v0, v1, p0, v2}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0
.end method
