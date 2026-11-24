.class public final La/p18;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;


# instance fields
.field public final a:La/rz7;

.field public final b:La/boo0;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:I

.field public final k:I

.field public final l:La/x08;


# direct methods
.method public constructor <init>(La/rz7;La/boo0;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;ZIILa/x08;)V
    .locals 0

    .line 1
    invoke-static {p3, p4, p8}, La/brm0;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/p18;->a:La/rz7;

    .line 8
    .line 9
    iput-object p2, p0, La/p18;->b:La/boo0;

    .line 10
    .line 11
    iput-object p3, p0, La/p18;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, La/p18;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-boolean p5, p0, La/p18;->e:Z

    .line 16
    .line 17
    iput-boolean p6, p0, La/p18;->f:Z

    .line 18
    .line 19
    iput-boolean p7, p0, La/p18;->g:Z

    .line 20
    .line 21
    iput-object p8, p0, La/p18;->h:Ljava/lang/String;

    .line 22
    .line 23
    iput-boolean p9, p0, La/p18;->i:Z

    .line 24
    .line 25
    iput p10, p0, La/p18;->j:I

    .line 26
    .line 27
    iput p11, p0, La/p18;->k:I

    .line 28
    .line 29
    iput-object p12, p0, La/p18;->l:La/x08;

    .line 30
    .line 31
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
    instance-of v0, p1, La/p18;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/p18;

    .line 12
    .line 13
    iget-object v0, p0, La/p18;->a:La/rz7;

    .line 14
    .line 15
    iget-object v1, p1, La/p18;->a:La/rz7;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/rz7;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/p18;->b:La/boo0;

    .line 26
    .line 27
    iget-object v1, p1, La/p18;->b:La/boo0;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, La/boo0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/p18;->c:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v1, p1, La/p18;->c:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    iget-object v0, p0, La/p18;->d:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v1, p1, La/p18;->d:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    iget-boolean v0, p0, La/p18;->e:Z

    .line 59
    .line 60
    iget-boolean v1, p1, La/p18;->e:Z

    .line 61
    .line 62
    if-eq v0, v1, :cond_6

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    iget-boolean v0, p0, La/p18;->f:Z

    .line 66
    .line 67
    iget-boolean v1, p1, La/p18;->f:Z

    .line 68
    .line 69
    if-eq v0, v1, :cond_7

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_7
    iget-boolean v0, p0, La/p18;->g:Z

    .line 73
    .line 74
    iget-boolean v1, p1, La/p18;->g:Z

    .line 75
    .line 76
    if-eq v0, v1, :cond_8

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_8
    iget-object v0, p0, La/p18;->h:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v1, p1, La/p18;->h:Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_9

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_9
    iget-boolean v0, p0, La/p18;->i:Z

    .line 91
    .line 92
    iget-boolean v1, p1, La/p18;->i:Z

    .line 93
    .line 94
    if-eq v0, v1, :cond_a

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_a
    iget v0, p0, La/p18;->j:I

    .line 98
    .line 99
    iget v1, p1, La/p18;->j:I

    .line 100
    .line 101
    if-eq v0, v1, :cond_b

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_b
    iget v0, p0, La/p18;->k:I

    .line 105
    .line 106
    iget v1, p1, La/p18;->k:I

    .line 107
    .line 108
    if-eq v0, v1, :cond_c

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_c
    iget-object p0, p0, La/p18;->l:La/x08;

    .line 112
    .line 113
    iget-object p1, p1, La/p18;->l:La/x08;

    .line 114
    .line 115
    invoke-virtual {p0, p1}, La/x08;->equals(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-nez p0, :cond_d

    .line 120
    .line 121
    :goto_0
    const/4 p0, 0x0

    .line 122
    return p0

    .line 123
    :cond_d
    :goto_1
    const/4 p0, 0x1

    .line 124
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/p18;->a:La/rz7;

    .line 2
    .line 3
    invoke-virtual {v0}, La/rz7;->hashCode()I

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
    iget-object v2, p0, La/p18;->b:La/boo0;

    .line 11
    .line 12
    invoke-virtual {v2}, La/boo0;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/p18;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/p18;->d:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, La/p18;->e:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-boolean v2, p0, La/p18;->f:Z

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-boolean v2, p0, La/p18;->g:Z

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, La/p18;->h:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-boolean v2, p0, La/p18;->i:Z

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget v2, p0, La/p18;->j:I

    .line 61
    .line 62
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget v2, p0, La/p18;->k:I

    .line 67
    .line 68
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object p0, p0, La/p18;->l:La/x08;

    .line 73
    .line 74
    invoke-virtual {p0}, La/x08;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    add-int/2addr p0, v0

    .line 79
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "BigPigUiModel(images="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/p18;->a:La/rz7;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", seriesTabs="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/p18;->b:La/boo0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", firstDescription="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", secondDescription="

    .line 29
    .line 30
    const-string v2, ", isPlayerActive="

    .line 31
    .line 32
    iget-object v3, p0, La/p18;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v4, p0, La/p18;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", isWaitingNextThrow="

    .line 40
    .line 41
    const-string v2, ", isTurnChanging="

    .line 42
    .line 43
    iget-boolean v3, p0, La/p18;->e:Z

    .line 44
    .line 45
    iget-boolean v4, p0, La/p18;->f:Z

    .line 46
    .line 47
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 48
    .line 49
    .line 50
    const-string v1, ", turnChangeDescription="

    .line 51
    .line 52
    const-string v2, ", isGameFinished="

    .line 53
    .line 54
    iget-object v3, p0, La/p18;->h:Ljava/lang/String;

    .line 55
    .line 56
    iget-boolean v4, p0, La/p18;->g:Z

    .line 57
    .line 58
    invoke-static {v1, v3, v2, v0, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 59
    .line 60
    .line 61
    const-string v1, ", numberOfSeries="

    .line 62
    .line 63
    const-string v2, ", numberOfThrow="

    .line 64
    .line 65
    iget v3, p0, La/p18;->j:I

    .line 66
    .line 67
    iget-boolean v4, p0, La/p18;->i:Z

    .line 68
    .line 69
    invoke-static {v3, v1, v2, v0, v4}, La/ua80;->q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 70
    .line 71
    .line 72
    iget v1, p0, La/p18;->k:I

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ", statistic="

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object p0, p0, La/p18;->l:La/x08;

    .line 83
    .line 84
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string p0, ")"

    .line 88
    .line 89
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0
.end method
