.class public final La/qz7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/cqg;


# instance fields
.field public final a:La/kz7;

.field public final b:La/uz7;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Z

.field public final h:I

.field public final i:I

.field public final j:Ljava/util/List;

.field public final k:Ljava/util/List;


# direct methods
.method public constructor <init>(La/kz7;La/uz7;IIIIZIILjava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/qz7;->a:La/kz7;

    .line 11
    .line 12
    iput-object p2, p0, La/qz7;->b:La/uz7;

    .line 13
    .line 14
    iput p3, p0, La/qz7;->c:I

    .line 15
    .line 16
    iput p4, p0, La/qz7;->d:I

    .line 17
    .line 18
    iput p5, p0, La/qz7;->e:I

    .line 19
    .line 20
    iput p6, p0, La/qz7;->f:I

    .line 21
    .line 22
    iput-boolean p7, p0, La/qz7;->g:Z

    .line 23
    .line 24
    iput p8, p0, La/qz7;->h:I

    .line 25
    .line 26
    iput p9, p0, La/qz7;->i:I

    .line 27
    .line 28
    iput-object p10, p0, La/qz7;->j:Ljava/util/List;

    .line 29
    .line 30
    iput-object p11, p0, La/qz7;->k:Ljava/util/List;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/qz7;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/qz7;

    .line 11
    .line 12
    iget-object v0, p0, La/qz7;->a:La/kz7;

    .line 13
    .line 14
    iget-object v1, p1, La/qz7;->a:La/kz7;

    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget-object v0, p0, La/qz7;->b:La/uz7;

    .line 20
    .line 21
    iget-object v1, p1, La/qz7;->b:La/uz7;

    .line 22
    .line 23
    if-eq v0, v1, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    iget v0, p0, La/qz7;->c:I

    .line 27
    .line 28
    iget v1, p1, La/qz7;->c:I

    .line 29
    .line 30
    if-eq v0, v1, :cond_4

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_4
    iget v0, p0, La/qz7;->d:I

    .line 34
    .line 35
    iget v1, p1, La/qz7;->d:I

    .line 36
    .line 37
    if-eq v0, v1, :cond_5

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_5
    iget v0, p0, La/qz7;->e:I

    .line 41
    .line 42
    iget v1, p1, La/qz7;->e:I

    .line 43
    .line 44
    if-eq v0, v1, :cond_6

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_6
    iget v0, p0, La/qz7;->f:I

    .line 48
    .line 49
    iget v1, p1, La/qz7;->f:I

    .line 50
    .line 51
    if-eq v0, v1, :cond_7

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_7
    iget-boolean v0, p0, La/qz7;->g:Z

    .line 55
    .line 56
    iget-boolean v1, p1, La/qz7;->g:Z

    .line 57
    .line 58
    if-eq v0, v1, :cond_8

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_8
    iget v0, p0, La/qz7;->h:I

    .line 62
    .line 63
    iget v1, p1, La/qz7;->h:I

    .line 64
    .line 65
    if-eq v0, v1, :cond_9

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_9
    iget v0, p0, La/qz7;->i:I

    .line 69
    .line 70
    iget v1, p1, La/qz7;->i:I

    .line 71
    .line 72
    if-eq v0, v1, :cond_a

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_a
    iget-object v0, p0, La/qz7;->j:Ljava/util/List;

    .line 76
    .line 77
    iget-object v1, p1, La/qz7;->j:Ljava/util/List;

    .line 78
    .line 79
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_b

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_b
    iget-object p0, p0, La/qz7;->k:Ljava/util/List;

    .line 87
    .line 88
    iget-object p1, p1, La/qz7;->k:Ljava/util/List;

    .line 89
    .line 90
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p0

    .line 94
    if-nez p0, :cond_c

    .line 95
    .line 96
    :goto_0
    const/4 p0, 0x0

    .line 97
    return p0

    .line 98
    :cond_c
    :goto_1
    const/4 p0, 0x1

    .line 99
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/qz7;->a:La/kz7;

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
    iget-object v2, p0, La/qz7;->b:La/uz7;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget v0, p0, La/qz7;->c:I

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, La/qz7;->d:I

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v2, p0, La/qz7;->e:I

    .line 31
    .line 32
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget v2, p0, La/qz7;->f:I

    .line 37
    .line 38
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-boolean v2, p0, La/qz7;->g:Z

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget v2, p0, La/qz7;->h:I

    .line 49
    .line 50
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget v2, p0, La/qz7;->i:I

    .line 55
    .line 56
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v2, p0, La/qz7;->j:Ljava/util/List;

    .line 61
    .line 62
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-object p0, p0, La/qz7;->k:Ljava/util/List;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    add-int/2addr p0, v0

    .line 73
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "BigPigModel(status="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/qz7;->a:La/kz7;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", currentPlayer="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/qz7;->b:La/uz7;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", numberOfThrow="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", numberOfSeries="

    .line 29
    .line 30
    const-string v2, ", currentSeriesPoints="

    .line 31
    .line 32
    iget v3, p0, La/qz7;->c:I

    .line 33
    .line 34
    iget v4, p0, La/qz7;->d:I

    .line 35
    .line 36
    invoke-static {v3, v4, v1, v2, v0}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", currentSeriesPointsBeforeThrow="

    .line 40
    .line 41
    const-string v2, ", seriesFinished="

    .line 42
    .line 43
    iget v3, p0, La/qz7;->e:I

    .line 44
    .line 45
    iget v4, p0, La/qz7;->f:I

    .line 46
    .line 47
    invoke-static {v3, v4, v1, v2, v0}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 48
    .line 49
    .line 50
    const-string v1, ", firstDice="

    .line 51
    .line 52
    const-string v2, ", secondDice="

    .line 53
    .line 54
    iget v3, p0, La/qz7;->h:I

    .line 55
    .line 56
    iget-boolean v4, p0, La/qz7;->g:Z

    .line 57
    .line 58
    invoke-static {v3, v1, v2, v0, v4}, La/ua80;->q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 59
    .line 60
    .line 61
    const-string v1, ", firstPlayerSeries="

    .line 62
    .line 63
    const-string v2, ", secondPlayerSeries="

    .line 64
    .line 65
    iget v3, p0, La/qz7;->i:I

    .line 66
    .line 67
    iget-object v4, p0, La/qz7;->j:Ljava/util/List;

    .line 68
    .line 69
    invoke-static {v3, v1, v2, v0, v4}, La/ohs0;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 70
    .line 71
    .line 72
    const-string v1, ")"

    .line 73
    .line 74
    iget-object p0, p0, La/qz7;->k:Ljava/util/List;

    .line 75
    .line 76
    invoke-static {v0, p0, v1}, La/dw9;->r(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method
