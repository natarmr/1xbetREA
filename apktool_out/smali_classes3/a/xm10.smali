.class public final La/xm10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ym10;


# instance fields
.field public final a:La/sd;

.field public final b:La/vo10;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:Z

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Z

.field public final i:J

.field public final j:Ljava/lang/String;

.field public final k:La/wul;

.field public final l:La/wul;

.field public final m:La/wul;

.field public final n:Z

.field public final o:Z

.field public final p:Z


# direct methods
.method public constructor <init>(La/sd;La/vo10;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;ZJLjava/lang/String;La/wul;La/wul;La/wul;ZZZ)V
    .locals 0

    .line 1
    invoke-static {p3, p6, p7, p11}, La/cs0;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/xm10;->a:La/sd;

    .line 8
    .line 9
    iput-object p2, p0, La/xm10;->b:La/vo10;

    .line 10
    .line 11
    iput-object p3, p0, La/xm10;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput p4, p0, La/xm10;->d:I

    .line 14
    .line 15
    iput-boolean p5, p0, La/xm10;->e:Z

    .line 16
    .line 17
    iput-object p6, p0, La/xm10;->f:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p7, p0, La/xm10;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput-boolean p8, p0, La/xm10;->h:Z

    .line 22
    .line 23
    iput-wide p9, p0, La/xm10;->i:J

    .line 24
    .line 25
    iput-object p11, p0, La/xm10;->j:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p12, p0, La/xm10;->k:La/wul;

    .line 28
    .line 29
    iput-object p13, p0, La/xm10;->l:La/wul;

    .line 30
    .line 31
    iput-object p14, p0, La/xm10;->m:La/wul;

    .line 32
    .line 33
    iput-boolean p15, p0, La/xm10;->n:Z

    .line 34
    .line 35
    move/from16 p1, p16

    .line 36
    .line 37
    iput-boolean p1, p0, La/xm10;->o:Z

    .line 38
    .line 39
    move/from16 p1, p17

    .line 40
    .line 41
    iput-boolean p1, p0, La/xm10;->p:Z

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/xm10;->p:Z

    .line 2
    .line 3
    return p0
.end method

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
    instance-of v0, p1, La/xm10;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/xm10;

    .line 12
    .line 13
    iget-object v0, p0, La/xm10;->a:La/sd;

    .line 14
    .line 15
    iget-object v1, p1, La/xm10;->a:La/sd;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/sd;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/xm10;->b:La/vo10;

    .line 26
    .line 27
    iget-object v1, p1, La/xm10;->b:La/vo10;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, La/vo10;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/xm10;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p1, La/xm10;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    goto/16 :goto_0

    .line 48
    .line 49
    :cond_4
    iget v0, p0, La/xm10;->d:I

    .line 50
    .line 51
    iget v1, p1, La/xm10;->d:I

    .line 52
    .line 53
    if-eq v0, v1, :cond_5

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_5
    iget-boolean v0, p0, La/xm10;->e:Z

    .line 58
    .line 59
    iget-boolean v1, p1, La/xm10;->e:Z

    .line 60
    .line 61
    if-eq v0, v1, :cond_6

    .line 62
    .line 63
    goto/16 :goto_0

    .line 64
    .line 65
    :cond_6
    iget-object v0, p0, La/xm10;->f:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v1, p1, La/xm10;->f:Ljava/lang/String;

    .line 68
    .line 69
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_7

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_7
    iget-object v0, p0, La/xm10;->g:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v1, p1, La/xm10;->g:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_8

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_8
    iget-boolean v0, p0, La/xm10;->h:Z

    .line 88
    .line 89
    iget-boolean v1, p1, La/xm10;->h:Z

    .line 90
    .line 91
    if-eq v0, v1, :cond_9

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_9
    iget-wide v0, p0, La/xm10;->i:J

    .line 95
    .line 96
    iget-wide v2, p1, La/xm10;->i:J

    .line 97
    .line 98
    cmp-long v0, v0, v2

    .line 99
    .line 100
    if-eqz v0, :cond_a

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_a
    iget-object v0, p0, La/xm10;->j:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v1, p1, La/xm10;->j:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_b

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_b
    iget-object v0, p0, La/xm10;->k:La/wul;

    .line 115
    .line 116
    iget-object v1, p1, La/xm10;->k:La/wul;

    .line 117
    .line 118
    invoke-virtual {v0, v1}, La/wul;->equals(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_c

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_c
    iget-object v0, p0, La/xm10;->l:La/wul;

    .line 126
    .line 127
    iget-object v1, p1, La/xm10;->l:La/wul;

    .line 128
    .line 129
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_d

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_d
    iget-object v0, p0, La/xm10;->m:La/wul;

    .line 137
    .line 138
    iget-object v1, p1, La/xm10;->m:La/wul;

    .line 139
    .line 140
    invoke-virtual {v0, v1}, La/wul;->equals(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_e

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_e
    iget-boolean v0, p0, La/xm10;->n:Z

    .line 148
    .line 149
    iget-boolean v1, p1, La/xm10;->n:Z

    .line 150
    .line 151
    if-eq v0, v1, :cond_f

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_f
    iget-boolean v0, p0, La/xm10;->o:Z

    .line 155
    .line 156
    iget-boolean v1, p1, La/xm10;->o:Z

    .line 157
    .line 158
    if-eq v0, v1, :cond_10

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_10
    iget-boolean p0, p0, La/xm10;->p:Z

    .line 162
    .line 163
    iget-boolean p1, p1, La/xm10;->p:Z

    .line 164
    .line 165
    if-eq p0, p1, :cond_11

    .line 166
    .line 167
    :goto_0
    const/4 p0, 0x0

    .line 168
    return p0

    .line 169
    :cond_11
    :goto_1
    const/4 p0, 0x1

    .line 170
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/xm10;->a:La/sd;

    .line 2
    .line 3
    invoke-virtual {v0}, La/sd;->hashCode()I

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
    iget-object v2, p0, La/xm10;->b:La/vo10;

    .line 11
    .line 12
    invoke-virtual {v2}, La/vo10;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/xm10;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v2, p0, La/xm10;->d:I

    .line 25
    .line 26
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, La/xm10;->e:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, La/xm10;->f:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, La/xm10;->g:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-boolean v2, p0, La/xm10;->h:Z

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-wide v2, p0, La/xm10;->i:J

    .line 55
    .line 56
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v2, p0, La/xm10;->j:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iget-object v2, p0, La/xm10;->k:La/wul;

    .line 67
    .line 68
    invoke-static {v2, v0, v1}, La/i8i;->a(La/wul;II)I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object v2, p0, La/xm10;->l:La/wul;

    .line 73
    .line 74
    if-nez v2, :cond_0

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {v2}, La/wul;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    :goto_0
    add-int/2addr v0, v2

    .line 83
    mul-int/2addr v0, v1

    .line 84
    iget-object v2, p0, La/xm10;->m:La/wul;

    .line 85
    .line 86
    invoke-static {v2, v0, v1}, La/i8i;->a(La/wul;II)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-boolean v2, p0, La/xm10;->n:Z

    .line 91
    .line 92
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-boolean v2, p0, La/xm10;->o:Z

    .line 97
    .line 98
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget-boolean p0, p0, La/xm10;->p:Z

    .line 103
    .line 104
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    add-int/2addr p0, v0

    .line 109
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Result(balance="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/xm10;->a:La/sd;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", wheel="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/xm10;->b:La/vo10;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", titleCaption="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", iconResId="

    .line 29
    .line 30
    const-string v2, ", isWin="

    .line 31
    .line 32
    iget v3, p0, La/xm10;->d:I

    .line 33
    .line 34
    iget-object v4, p0, La/xm10;->c:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v3, v4, v1, v2, v0}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 37
    .line 38
    .line 39
    const-string v1, ", title="

    .line 40
    .line 41
    const-string v2, ", description="

    .line 42
    .line 43
    iget-object v3, p0, La/xm10;->f:Ljava/lang/String;

    .line 44
    .line 45
    iget-boolean v4, p0, La/xm10;->e:Z

    .line 46
    .line 47
    invoke-static {v1, v3, v2, v0, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 48
    .line 49
    .line 50
    const-string v1, ", timerVisible="

    .line 51
    .line 52
    const-string v2, ", timerTargetMillis="

    .line 53
    .line 54
    iget-object v3, p0, La/xm10;->g:Ljava/lang/String;

    .line 55
    .line 56
    iget-boolean v4, p0, La/xm10;->h:Z

    .line 57
    .line 58
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 59
    .line 60
    .line 61
    const-string v1, ", freeSpinTimerLabel="

    .line 62
    .line 63
    iget-wide v2, p0, La/xm10;->i:J

    .line 64
    .line 65
    iget-object v4, p0, La/xm10;->j:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const-string v1, ", spinButton="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v1, p0, La/xm10;->k:La/wul;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v1, ", activateButton="

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, La/xm10;->l:La/wul;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, ", continueButton="

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object v1, p0, La/xm10;->m:La/wul;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v1, ", toolbarButtonsEnabled="

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-boolean v1, p0, La/xm10;->n:Z

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v1, ", backButtonEnabled="

    .line 111
    .line 112
    const-string v2, ", networkAvailable="

    .line 113
    .line 114
    iget-boolean v3, p0, La/xm10;->o:Z

    .line 115
    .line 116
    iget-boolean p0, p0, La/xm10;->p:Z

    .line 117
    .line 118
    invoke-static {v1, v2, v0, v3, p0}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 119
    .line 120
    .line 121
    const-string p0, ")"

    .line 122
    .line 123
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    return-object p0
.end method
