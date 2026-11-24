.class public final La/t1y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/e0s;

.field public final b:La/kn5;

.field public final c:La/ox6;

.field public final d:La/i8k0;

.field public final e:La/qjx;

.field public final f:Ljava/lang/String;

.field public final g:La/bz6;

.field public final h:La/wul;

.field public final i:La/wul;

.field public final j:Ljava/lang/String;

.field public final k:Z


# direct methods
.method public constructor <init>(La/e0s;La/kn5;La/ox6;La/i8k0;La/qjx;Ljava/lang/String;La/bz6;La/wul;La/wul;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/t1y;->a:La/e0s;

    .line 11
    .line 12
    iput-object p2, p0, La/t1y;->b:La/kn5;

    .line 13
    .line 14
    iput-object p3, p0, La/t1y;->c:La/ox6;

    .line 15
    .line 16
    iput-object p4, p0, La/t1y;->d:La/i8k0;

    .line 17
    .line 18
    iput-object p5, p0, La/t1y;->e:La/qjx;

    .line 19
    .line 20
    iput-object p6, p0, La/t1y;->f:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p7, p0, La/t1y;->g:La/bz6;

    .line 23
    .line 24
    iput-object p8, p0, La/t1y;->h:La/wul;

    .line 25
    .line 26
    iput-object p9, p0, La/t1y;->i:La/wul;

    .line 27
    .line 28
    iput-object p10, p0, La/t1y;->j:Ljava/lang/String;

    .line 29
    .line 30
    iput-boolean p11, p0, La/t1y;->k:Z

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
    instance-of v0, p1, La/t1y;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/t1y;

    .line 12
    .line 13
    iget-object v0, p0, La/t1y;->a:La/e0s;

    .line 14
    .line 15
    iget-object v1, p1, La/t1y;->a:La/e0s;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/e0s;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/t1y;->b:La/kn5;

    .line 26
    .line 27
    iget-object v1, p1, La/t1y;->b:La/kn5;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, La/kn5;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/t1y;->c:La/ox6;

    .line 37
    .line 38
    iget-object v1, p1, La/t1y;->c:La/ox6;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, La/ox6;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/t1y;->d:La/i8k0;

    .line 48
    .line 49
    iget-object v1, p1, La/t1y;->d:La/i8k0;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, La/i8k0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/t1y;->e:La/qjx;

    .line 59
    .line 60
    iget-object v1, p1, La/t1y;->e:La/qjx;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, La/qjx;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_6
    iget-object v0, p0, La/t1y;->f:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v1, p1, La/t1y;->f:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_7

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_7
    iget-object v0, p0, La/t1y;->g:La/bz6;

    .line 81
    .line 82
    iget-object v1, p1, La/t1y;->g:La/bz6;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, La/bz6;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_8

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_8
    iget-object v0, p0, La/t1y;->h:La/wul;

    .line 92
    .line 93
    iget-object v1, p1, La/t1y;->h:La/wul;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, La/wul;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_9

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_9
    iget-object v0, p0, La/t1y;->i:La/wul;

    .line 103
    .line 104
    iget-object v1, p1, La/t1y;->i:La/wul;

    .line 105
    .line 106
    invoke-virtual {v0, v1}, La/wul;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_a

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_a
    iget-object v0, p0, La/t1y;->j:Ljava/lang/String;

    .line 114
    .line 115
    iget-object v1, p1, La/t1y;->j:Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_b

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_b
    iget-boolean p0, p0, La/t1y;->k:Z

    .line 125
    .line 126
    iget-boolean p1, p1, La/t1y;->k:Z

    .line 127
    .line 128
    if-eq p0, p1, :cond_c

    .line 129
    .line 130
    :goto_0
    const/4 p0, 0x0

    .line 131
    return p0

    .line 132
    :cond_c
    :goto_1
    const/4 p0, 0x1

    .line 133
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/t1y;->a:La/e0s;

    .line 2
    .line 3
    invoke-virtual {v0}, La/e0s;->hashCode()I

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
    iget-object v2, p0, La/t1y;->b:La/kn5;

    .line 11
    .line 12
    invoke-virtual {v2}, La/kn5;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/t1y;->c:La/ox6;

    .line 19
    .line 20
    invoke-virtual {v0}, La/ox6;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-object v2, p0, La/t1y;->d:La/i8k0;

    .line 27
    .line 28
    invoke-virtual {v2}, La/i8k0;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    mul-int/2addr v2, v1

    .line 34
    iget-object v0, p0, La/t1y;->e:La/qjx;

    .line 35
    .line 36
    invoke-virtual {v0}, La/qjx;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    add-int/2addr v0, v2

    .line 41
    mul-int/2addr v0, v1

    .line 42
    iget-object v2, p0, La/t1y;->f:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, La/t1y;->g:La/bz6;

    .line 49
    .line 50
    invoke-virtual {v2}, La/bz6;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    add-int/2addr v2, v0

    .line 55
    mul-int/2addr v2, v1

    .line 56
    iget-object v0, p0, La/t1y;->h:La/wul;

    .line 57
    .line 58
    invoke-static {v0, v2, v1}, La/i8i;->a(La/wul;II)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object v2, p0, La/t1y;->i:La/wul;

    .line 63
    .line 64
    invoke-static {v2, v0, v1}, La/i8i;->a(La/wul;II)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-object v2, p0, La/t1y;->j:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-boolean p0, p0, La/t1y;->k:Z

    .line 75
    .line 76
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    add-int/2addr p0, v0

    .line 81
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "JackpotFullscreenSliderUiState(gameCardUiState="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/t1y;->a:La/e0s;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", balanceUiState="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/t1y;->b:La/kn5;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", betFieldUiState="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/t1y;->c:La/ox6;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", sliderUiState="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/t1y;->d:La/i8k0;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", insufficientFundsUiState="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/t1y;->e:La/qjx;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", currency="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/t1y;->f:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", betGameInfoUiState="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, La/t1y;->g:La/bz6;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", plusButtonUiModel="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, La/t1y;->h:La/wul;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", makeBetButtonUiModel="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget-object v1, p0, La/t1y;->i:La/wul;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, ", taxInfoLabel="

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object v1, p0, La/t1y;->j:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v1, ", isInsufficientFunds="

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v1, ")"

    .line 109
    .line 110
    iget-boolean p0, p0, La/t1y;->k:Z

    .line 111
    .line 112
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0
.end method
