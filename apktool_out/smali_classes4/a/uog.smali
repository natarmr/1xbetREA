.class public final La/uog;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Z

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:B

.field public final j:Ljava/lang/String;

.field public final k:I

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/util/List;

.field public final q:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 3

    .line 1
    move-object/from16 v0, p13

    .line 2
    .line 3
    move-object/from16 v1, p14

    .line 4
    .line 5
    move-object/from16 v2, p15

    .line 6
    .line 7
    invoke-static {p2, p5, v0, v1, v2}, La/ohs0;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p16 .. p16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput p1, p0, La/uog;->a:I

    .line 17
    .line 18
    iput-object p2, p0, La/uog;->b:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p3, p0, La/uog;->c:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p4, p0, La/uog;->d:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p5, p0, La/uog;->e:Ljava/lang/String;

    .line 25
    .line 26
    iput-boolean p6, p0, La/uog;->f:Z

    .line 27
    .line 28
    iput-object p7, p0, La/uog;->g:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p8, p0, La/uog;->h:Ljava/lang/String;

    .line 31
    .line 32
    iput-byte p9, p0, La/uog;->i:B

    .line 33
    .line 34
    iput-object p10, p0, La/uog;->j:Ljava/lang/String;

    .line 35
    .line 36
    iput p11, p0, La/uog;->k:I

    .line 37
    .line 38
    iput-object p12, p0, La/uog;->l:Ljava/lang/String;

    .line 39
    .line 40
    iput-object v0, p0, La/uog;->m:Ljava/lang/String;

    .line 41
    .line 42
    iput-object v1, p0, La/uog;->n:Ljava/lang/String;

    .line 43
    .line 44
    iput-object v2, p0, La/uog;->o:Ljava/lang/String;

    .line 45
    .line 46
    move-object/from16 p1, p16

    .line 47
    .line 48
    iput-object p1, p0, La/uog;->p:Ljava/util/List;

    .line 49
    .line 50
    move-object/from16 p1, p17

    .line 51
    .line 52
    iput-object p1, p0, La/uog;->q:Ljava/lang/String;

    .line 53
    .line 54
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
    instance-of v0, p1, La/uog;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/uog;

    .line 12
    .line 13
    iget v0, p0, La/uog;->a:I

    .line 14
    .line 15
    iget v1, p1, La/uog;->a:I

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-object v0, p0, La/uog;->b:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p1, La/uog;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, La/uog;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/uog;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto/16 :goto_0

    .line 44
    .line 45
    :cond_4
    iget-object v0, p0, La/uog;->d:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, p1, La/uog;->d:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    goto/16 :goto_0

    .line 56
    .line 57
    :cond_5
    iget-object v0, p0, La/uog;->e:Ljava/lang/String;

    .line 58
    .line 59
    iget-object v1, p1, La/uog;->e:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_6

    .line 66
    .line 67
    goto/16 :goto_0

    .line 68
    .line 69
    :cond_6
    iget-boolean v0, p0, La/uog;->f:Z

    .line 70
    .line 71
    iget-boolean v1, p1, La/uog;->f:Z

    .line 72
    .line 73
    if-eq v0, v1, :cond_7

    .line 74
    .line 75
    goto/16 :goto_0

    .line 76
    .line 77
    :cond_7
    iget-object v0, p0, La/uog;->g:Ljava/lang/String;

    .line 78
    .line 79
    iget-object v1, p1, La/uog;->g:Ljava/lang/String;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-nez v0, :cond_8

    .line 86
    .line 87
    goto/16 :goto_0

    .line 88
    .line 89
    :cond_8
    iget-object v0, p0, La/uog;->h:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v1, p1, La/uog;->h:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_9

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_9
    iget-byte v0, p0, La/uog;->i:B

    .line 101
    .line 102
    iget-byte v1, p1, La/uog;->i:B

    .line 103
    .line 104
    if-eq v0, v1, :cond_a

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_a
    iget-object v0, p0, La/uog;->j:Ljava/lang/String;

    .line 108
    .line 109
    iget-object v1, p1, La/uog;->j:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-nez v0, :cond_b

    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_b
    iget v0, p0, La/uog;->k:I

    .line 119
    .line 120
    iget v1, p1, La/uog;->k:I

    .line 121
    .line 122
    if-eq v0, v1, :cond_c

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_c
    iget-object v0, p0, La/uog;->l:Ljava/lang/String;

    .line 126
    .line 127
    iget-object v1, p1, La/uog;->l:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/uog;->m:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v1, p1, La/uog;->m:Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/uog;->n:Ljava/lang/String;

    .line 148
    .line 149
    iget-object v1, p1, La/uog;->n:Ljava/lang/String;

    .line 150
    .line 151
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    if-nez v0, :cond_f

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_f
    iget-object v0, p0, La/uog;->o:Ljava/lang/String;

    .line 159
    .line 160
    iget-object v1, p1, La/uog;->o:Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-nez v0, :cond_10

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_10
    iget-object v0, p0, La/uog;->p:Ljava/util/List;

    .line 170
    .line 171
    iget-object v1, p1, La/uog;->p:Ljava/util/List;

    .line 172
    .line 173
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-nez v0, :cond_11

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_11
    iget-object p0, p0, La/uog;->q:Ljava/lang/String;

    .line 181
    .line 182
    iget-object p1, p1, La/uog;->q:Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result p0

    .line 188
    if-nez p0, :cond_12

    .line 189
    .line 190
    :goto_0
    const/4 p0, 0x0

    .line 191
    return p0

    .line 192
    :cond_12
    :goto_1
    const/4 p0, 0x1

    .line 193
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/uog;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

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
    iget-object v2, p0, La/uog;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/uog;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/uog;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/uog;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/uog;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/uog;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/uog;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-byte v2, p0, La/uog;->i:B

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/uog;->j:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v2, p0, La/uog;->k:I

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, La/uog;->l:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-object v2, p0, La/uog;->m:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, La/uog;->n:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-object v2, p0, La/uog;->o:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-object v2, p0, La/uog;->p:Ljava/util/List;

    .line 95
    .line 96
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-object p0, p0, La/uog;->q:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    add-int/2addr p0, v0

    .line 107
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", title="

    .line 2
    .line 3
    const-string v1, ", description="

    .line 4
    .line 5
    iget v2, p0, La/uog;->a:I

    .line 6
    .line 7
    const-string v3, "CyberGameBannerModel(bannerId="

    .line 8
    .line 9
    iget-object v4, p0, La/uog;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/vqd;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", ruleDescription="

    .line 16
    .line 17
    const-string v2, ", image="

    .line 18
    .line 19
    iget-object v3, p0, La/uog;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, La/uog;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", action="

    .line 27
    .line 28
    const-string v2, ", deepLink="

    .line 29
    .line 30
    iget-object v3, p0, La/uog;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-boolean v4, p0, La/uog;->f:Z

    .line 33
    .line 34
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", siteLink="

    .line 38
    .line 39
    const-string v2, ", actionType="

    .line 40
    .line 41
    iget-object v3, p0, La/uog;->g:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v4, p0, La/uog;->h:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", translationId="

    .line 49
    .line 50
    const-string v2, ", lotteryId="

    .line 51
    .line 52
    iget-byte v3, p0, La/uog;->i:B

    .line 53
    .line 54
    iget-object v4, p0, La/uog;->j:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v3, v1, v4, v2, v0}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 57
    .line 58
    .line 59
    const-string v1, ", smallImage="

    .line 60
    .line 61
    const-string v2, ", squareImage="

    .line 62
    .line 63
    iget v3, p0, La/uog;->k:I

    .line 64
    .line 65
    iget-object v4, p0, La/uog;->l:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v3, v1, v4, v2, v0}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 68
    .line 69
    .line 70
    const-string v1, ", verticalImage="

    .line 71
    .line 72
    const-string v2, ", horizontalImage="

    .line 73
    .line 74
    iget-object v3, p0, La/uog;->m:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v4, p0, La/uog;->n:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v1, ", types="

    .line 82
    .line 83
    const-string v2, ", info="

    .line 84
    .line 85
    iget-object v3, p0, La/uog;->o:Ljava/lang/String;

    .line 86
    .line 87
    iget-object v4, p0, La/uog;->p:Ljava/util/List;

    .line 88
    .line 89
    invoke-static {v3, v1, v2, v0, v4}, La/cs0;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 90
    .line 91
    .line 92
    const-string v1, ")"

    .line 93
    .line 94
    iget-object p0, p0, La/uog;->q:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v0, p0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0
.end method
