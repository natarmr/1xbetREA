.class public final La/s47;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/n3w;

.field public final b:La/mb90;

.field public final c:D

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:Z

.field public final k:J

.field public final l:Z

.field public final m:Landroid/graphics/Bitmap;

.field public final n:Z


# direct methods
.method public constructor <init>(La/n3w;La/mb90;DZZZZLjava/lang/String;ZZJZLandroid/graphics/Bitmap;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/s47;->a:La/n3w;

    .line 5
    .line 6
    iput-object p2, p0, La/s47;->b:La/mb90;

    .line 7
    .line 8
    iput-wide p3, p0, La/s47;->c:D

    .line 9
    .line 10
    iput-boolean p5, p0, La/s47;->d:Z

    .line 11
    .line 12
    iput-boolean p6, p0, La/s47;->e:Z

    .line 13
    .line 14
    iput-boolean p7, p0, La/s47;->f:Z

    .line 15
    .line 16
    iput-boolean p8, p0, La/s47;->g:Z

    .line 17
    .line 18
    iput-object p9, p0, La/s47;->h:Ljava/lang/String;

    .line 19
    .line 20
    iput-boolean p10, p0, La/s47;->i:Z

    .line 21
    .line 22
    iput-boolean p11, p0, La/s47;->j:Z

    .line 23
    .line 24
    iput-wide p12, p0, La/s47;->k:J

    .line 25
    .line 26
    iput-boolean p14, p0, La/s47;->l:Z

    .line 27
    .line 28
    iput-object p15, p0, La/s47;->m:Landroid/graphics/Bitmap;

    .line 29
    .line 30
    move/from16 p1, p16

    .line 31
    .line 32
    iput-boolean p1, p0, La/s47;->n:Z

    .line 33
    .line 34
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
    instance-of v0, p1, La/s47;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/s47;

    .line 12
    .line 13
    iget-object v0, p0, La/s47;->a:La/n3w;

    .line 14
    .line 15
    iget-object v1, p1, La/s47;->a:La/n3w;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/n3w;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/s47;->b:La/mb90;

    .line 26
    .line 27
    iget-object v1, p1, La/s47;->b:La/mb90;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, La/mb90;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget-wide v0, p0, La/s47;->c:D

    .line 38
    .line 39
    iget-wide v2, p1, La/s47;->c:D

    .line 40
    .line 41
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_4

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    iget-boolean v0, p0, La/s47;->d:Z

    .line 49
    .line 50
    iget-boolean v1, p1, La/s47;->d:Z

    .line 51
    .line 52
    if-eq v0, v1, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-boolean v0, p0, La/s47;->e:Z

    .line 56
    .line 57
    iget-boolean v1, p1, La/s47;->e:Z

    .line 58
    .line 59
    if-eq v0, v1, :cond_6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    iget-boolean v0, p0, La/s47;->f:Z

    .line 63
    .line 64
    iget-boolean v1, p1, La/s47;->f:Z

    .line 65
    .line 66
    if-eq v0, v1, :cond_7

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_7
    iget-boolean v0, p0, La/s47;->g:Z

    .line 70
    .line 71
    iget-boolean v1, p1, La/s47;->g:Z

    .line 72
    .line 73
    if-eq v0, v1, :cond_8

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_8
    iget-object v0, p0, La/s47;->h:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v1, p1, La/s47;->h:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_9

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_9
    iget-boolean v0, p0, La/s47;->i:Z

    .line 88
    .line 89
    iget-boolean v1, p1, La/s47;->i:Z

    .line 90
    .line 91
    if-eq v0, v1, :cond_a

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_a
    iget-boolean v0, p0, La/s47;->j:Z

    .line 95
    .line 96
    iget-boolean v1, p1, La/s47;->j:Z

    .line 97
    .line 98
    if-eq v0, v1, :cond_b

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_b
    iget-wide v0, p0, La/s47;->k:J

    .line 102
    .line 103
    iget-wide v2, p1, La/s47;->k:J

    .line 104
    .line 105
    cmp-long v0, v0, v2

    .line 106
    .line 107
    if-eqz v0, :cond_c

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_c
    iget-boolean v0, p0, La/s47;->l:Z

    .line 111
    .line 112
    iget-boolean v1, p1, La/s47;->l:Z

    .line 113
    .line 114
    if-eq v0, v1, :cond_d

    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_d
    iget-object v0, p0, La/s47;->m:Landroid/graphics/Bitmap;

    .line 118
    .line 119
    iget-object v1, p1, La/s47;->m:Landroid/graphics/Bitmap;

    .line 120
    .line 121
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-nez v0, :cond_e

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_e
    iget-boolean p0, p0, La/s47;->n:Z

    .line 129
    .line 130
    iget-boolean p1, p1, La/s47;->n:Z

    .line 131
    .line 132
    if-eq p0, p1, :cond_f

    .line 133
    .line 134
    :goto_0
    const/4 p0, 0x0

    .line 135
    return p0

    .line 136
    :cond_f
    :goto_1
    const/4 p0, 0x1

    .line 137
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, La/s47;->a:La/n3w;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n3w;->hashCode()I

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
    iget-object v2, p0, La/s47;->b:La/mb90;

    .line 11
    .line 12
    invoke-virtual {v2}, La/mb90;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-wide v3, p0, La/s47;->c:D

    .line 19
    .line 20
    invoke-static {v3, v4, v2, v1}, La/brm0;->d(DII)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-boolean v2, p0, La/s47;->d:Z

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, La/s47;->e:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-boolean v2, p0, La/s47;->f:Z

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-boolean v2, p0, La/s47;->g:Z

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, La/s47;->h:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-boolean v2, p0, La/s47;->i:Z

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-boolean v2, p0, La/s47;->j:Z

    .line 61
    .line 62
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-wide v2, p0, La/s47;->k:J

    .line 67
    .line 68
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-boolean v2, p0, La/s47;->l:Z

    .line 73
    .line 74
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object v2, p0, La/s47;->m:Landroid/graphics/Bitmap;

    .line 79
    .line 80
    if-nez v2, :cond_0

    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    goto :goto_0

    .line 84
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    :goto_0
    add-int/2addr v0, v2

    .line 89
    mul-int/2addr v0, v1

    .line 90
    iget-boolean p0, p0, La/s47;->n:Z

    .line 91
    .line 92
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    add-int/2addr p0, v0

    .line 97
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "BetHistoryInfoItemUiModel(historyItem="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/s47;->a:La/n3w;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", payoutUiModel="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/s47;->b:La/mb90;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", profit="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", powerBetEnabled="

    .line 29
    .line 30
    iget-wide v2, p0, La/s47;->c:D

    .line 31
    .line 32
    iget-boolean v4, p0, La/s47;->d:Z

    .line 33
    .line 34
    invoke-static {v0, v2, v3, v1, v4}, La/rz4;->x(Ljava/lang/StringBuilder;DLjava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", duplicateCouponEnabled="

    .line 38
    .line 39
    const-string v2, ", betCoeffTypeVisible="

    .line 40
    .line 41
    iget-boolean v3, p0, La/s47;->e:Z

    .line 42
    .line 43
    iget-boolean v4, p0, La/s47;->f:Z

    .line 44
    .line 45
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", saleEnabled="

    .line 49
    .line 50
    const-string v2, ", tagText="

    .line 51
    .line 52
    iget-object v3, p0, La/s47;->h:Ljava/lang/String;

    .line 53
    .line 54
    iget-boolean v4, p0, La/s47;->g:Z

    .line 55
    .line 56
    invoke-static {v1, v2, v3, v0, v4}, La/hne;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 57
    .line 58
    .line 59
    const-string v1, ", isOptionBet="

    .line 60
    .line 61
    const-string v2, ", isEachWay="

    .line 62
    .line 63
    iget-boolean v3, p0, La/s47;->i:Z

    .line 64
    .line 65
    iget-boolean v4, p0, La/s47;->j:Z

    .line 66
    .line 67
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 68
    .line 69
    .line 70
    const-string v1, ", userId="

    .line 71
    .line 72
    const-string v2, ", organizerIsVisible="

    .line 73
    .line 74
    iget-wide v3, p0, La/s47;->k:J

    .line 75
    .line 76
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 77
    .line 78
    .line 79
    iget-boolean v1, p0, La/s47;->l:Z

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v1, ", qrCodeBitmap="

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, La/s47;->m:Landroid/graphics/Bitmap;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", is24HourFormat="

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v1, ")"

    .line 100
    .line 101
    iget-boolean p0, p0, La/s47;->n:Z

    .line 102
    .line 103
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0
.end method
