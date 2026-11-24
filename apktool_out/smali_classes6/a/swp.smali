.class public final La/swp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/List;

.field public final h:Ljava/util/List;

.field public final i:Ljava/util/List;

.field public final j:Ljava/util/List;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/util/List;

.field public final o:J

.field public final p:Ljava/lang/String;

.field public final q:Ljava/util/Map;

.field public final r:I

.field public final s:I

.field public final t:Ljava/lang/String;

.field public final u:Z

.field public final v:I


# direct methods
.method public constructor <init>(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;JLjava/lang/String;Ljava/util/Map;IILjava/lang/String;ZI)V
    .locals 4

    .line 1
    move-object v0, p11

    .line 2
    move-object/from16 v1, p12

    .line 3
    .line 4
    move-object/from16 v2, p13

    .line 5
    .line 6
    move-object/from16 v3, p17

    .line 7
    .line 8
    invoke-static {p10, p11, v1, v2, v3}, La/rz4;->B(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-wide p1, p0, La/swp;->a:J

    .line 15
    .line 16
    iput-wide p3, p0, La/swp;->b:J

    .line 17
    .line 18
    iput-wide p5, p0, La/swp;->c:J

    .line 19
    .line 20
    iput-object p7, p0, La/swp;->d:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p8, p0, La/swp;->e:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p9, p0, La/swp;->f:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p10, p0, La/swp;->g:Ljava/util/List;

    .line 27
    .line 28
    iput-object v0, p0, La/swp;->h:Ljava/util/List;

    .line 29
    .line 30
    iput-object v1, p0, La/swp;->i:Ljava/util/List;

    .line 31
    .line 32
    iput-object v2, p0, La/swp;->j:Ljava/util/List;

    .line 33
    .line 34
    move-object/from16 p1, p14

    .line 35
    .line 36
    iput-object p1, p0, La/swp;->k:Ljava/lang/String;

    .line 37
    .line 38
    move-object/from16 p1, p15

    .line 39
    .line 40
    iput-object p1, p0, La/swp;->l:Ljava/lang/String;

    .line 41
    .line 42
    move-object/from16 p1, p16

    .line 43
    .line 44
    iput-object p1, p0, La/swp;->m:Ljava/lang/String;

    .line 45
    .line 46
    iput-object v3, p0, La/swp;->n:Ljava/util/List;

    .line 47
    .line 48
    move-wide/from16 p1, p18

    .line 49
    .line 50
    iput-wide p1, p0, La/swp;->o:J

    .line 51
    .line 52
    move-object/from16 p1, p20

    .line 53
    .line 54
    iput-object p1, p0, La/swp;->p:Ljava/lang/String;

    .line 55
    .line 56
    move-object/from16 p1, p21

    .line 57
    .line 58
    iput-object p1, p0, La/swp;->q:Ljava/util/Map;

    .line 59
    .line 60
    move/from16 p1, p22

    .line 61
    .line 62
    iput p1, p0, La/swp;->r:I

    .line 63
    .line 64
    move/from16 p1, p23

    .line 65
    .line 66
    iput p1, p0, La/swp;->s:I

    .line 67
    .line 68
    move-object/from16 p1, p24

    .line 69
    .line 70
    iput-object p1, p0, La/swp;->t:Ljava/lang/String;

    .line 71
    .line 72
    move/from16 p1, p25

    .line 73
    .line 74
    iput-boolean p1, p0, La/swp;->u:Z

    .line 75
    .line 76
    move/from16 p1, p26

    .line 77
    .line 78
    iput p1, p0, La/swp;->v:I

    .line 79
    .line 80
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
    instance-of v0, p1, La/swp;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/swp;

    .line 12
    .line 13
    iget-wide v0, p0, La/swp;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/swp;->a:J

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_2
    iget-wide v0, p0, La/swp;->b:J

    .line 24
    .line 25
    iget-wide v2, p1, La/swp;->b:J

    .line 26
    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-wide v0, p0, La/swp;->c:J

    .line 34
    .line 35
    iget-wide v2, p1, La/swp;->c:J

    .line 36
    .line 37
    cmp-long v0, v0, v2

    .line 38
    .line 39
    if-eqz v0, :cond_4

    .line 40
    .line 41
    goto/16 :goto_0

    .line 42
    .line 43
    :cond_4
    iget-object v0, p0, La/swp;->d:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v1, p1, La/swp;->d:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_5

    .line 52
    .line 53
    goto/16 :goto_0

    .line 54
    .line 55
    :cond_5
    iget-object v0, p0, La/swp;->e:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v1, p1, La/swp;->e:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    goto/16 :goto_0

    .line 66
    .line 67
    :cond_6
    iget-object v0, p0, La/swp;->f:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v1, p1, La/swp;->f:Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_7

    .line 76
    .line 77
    goto/16 :goto_0

    .line 78
    .line 79
    :cond_7
    iget-object v0, p0, La/swp;->g:Ljava/util/List;

    .line 80
    .line 81
    iget-object v1, p1, La/swp;->g:Ljava/util/List;

    .line 82
    .line 83
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_8

    .line 88
    .line 89
    goto/16 :goto_0

    .line 90
    .line 91
    :cond_8
    iget-object v0, p0, La/swp;->h:Ljava/util/List;

    .line 92
    .line 93
    iget-object v1, p1, La/swp;->h:Ljava/util/List;

    .line 94
    .line 95
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_9

    .line 100
    .line 101
    goto/16 :goto_0

    .line 102
    .line 103
    :cond_9
    iget-object v0, p0, La/swp;->i:Ljava/util/List;

    .line 104
    .line 105
    iget-object v1, p1, La/swp;->i:Ljava/util/List;

    .line 106
    .line 107
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_a

    .line 112
    .line 113
    goto/16 :goto_0

    .line 114
    .line 115
    :cond_a
    iget-object v0, p0, La/swp;->j:Ljava/util/List;

    .line 116
    .line 117
    iget-object v1, p1, La/swp;->j:Ljava/util/List;

    .line 118
    .line 119
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-nez v0, :cond_b

    .line 124
    .line 125
    goto/16 :goto_0

    .line 126
    .line 127
    :cond_b
    iget-object v0, p0, La/swp;->k:Ljava/lang/String;

    .line 128
    .line 129
    iget-object v1, p1, La/swp;->k:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-nez v0, :cond_c

    .line 136
    .line 137
    goto/16 :goto_0

    .line 138
    .line 139
    :cond_c
    iget-object v0, p0, La/swp;->l:Ljava/lang/String;

    .line 140
    .line 141
    iget-object v1, p1, La/swp;->l:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-nez v0, :cond_d

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_d
    iget-object v0, p0, La/swp;->m:Ljava/lang/String;

    .line 151
    .line 152
    iget-object v1, p1, La/swp;->m:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-nez v0, :cond_e

    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_e
    iget-object v0, p0, La/swp;->n:Ljava/util/List;

    .line 162
    .line 163
    iget-object v1, p1, La/swp;->n:Ljava/util/List;

    .line 164
    .line 165
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-nez v0, :cond_f

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_f
    iget-wide v0, p0, La/swp;->o:J

    .line 173
    .line 174
    iget-wide v2, p1, La/swp;->o:J

    .line 175
    .line 176
    cmp-long v0, v0, v2

    .line 177
    .line 178
    if-eqz v0, :cond_10

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_10
    iget-object v0, p0, La/swp;->p:Ljava/lang/String;

    .line 182
    .line 183
    iget-object v1, p1, La/swp;->p:Ljava/lang/String;

    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    if-nez v0, :cond_11

    .line 190
    .line 191
    goto :goto_0

    .line 192
    :cond_11
    iget-object v0, p0, La/swp;->q:Ljava/util/Map;

    .line 193
    .line 194
    iget-object v1, p1, La/swp;->q:Ljava/util/Map;

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    if-nez v0, :cond_12

    .line 201
    .line 202
    goto :goto_0

    .line 203
    :cond_12
    iget v0, p0, La/swp;->r:I

    .line 204
    .line 205
    iget v1, p1, La/swp;->r:I

    .line 206
    .line 207
    if-eq v0, v1, :cond_13

    .line 208
    .line 209
    goto :goto_0

    .line 210
    :cond_13
    iget v0, p0, La/swp;->s:I

    .line 211
    .line 212
    iget v1, p1, La/swp;->s:I

    .line 213
    .line 214
    if-eq v0, v1, :cond_14

    .line 215
    .line 216
    goto :goto_0

    .line 217
    :cond_14
    iget-object v0, p0, La/swp;->t:Ljava/lang/String;

    .line 218
    .line 219
    iget-object v1, p1, La/swp;->t:Ljava/lang/String;

    .line 220
    .line 221
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-nez v0, :cond_15

    .line 226
    .line 227
    goto :goto_0

    .line 228
    :cond_15
    iget-boolean v0, p0, La/swp;->u:Z

    .line 229
    .line 230
    iget-boolean v1, p1, La/swp;->u:Z

    .line 231
    .line 232
    if-eq v0, v1, :cond_16

    .line 233
    .line 234
    goto :goto_0

    .line 235
    :cond_16
    iget p0, p0, La/swp;->v:I

    .line 236
    .line 237
    iget p1, p1, La/swp;->v:I

    .line 238
    .line 239
    if-eq p0, p1, :cond_17

    .line 240
    .line 241
    :goto_0
    const/4 p0, 0x0

    .line 242
    return p0

    .line 243
    :cond_17
    :goto_1
    const/4 p0, 0x1

    .line 244
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/swp;->a:J

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
    iget-wide v2, p0, La/swp;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/swp;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/swp;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/swp;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/swp;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/swp;->g:Ljava/util/List;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/swp;->h:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/swp;->i:Ljava/util/List;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/swp;->j:Ljava/util/List;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/swp;->k:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, La/swp;->l:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-object v2, p0, La/swp;->m:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-object v2, p0, La/swp;->n:Ljava/util/List;

    .line 83
    .line 84
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget-wide v2, p0, La/swp;->o:J

    .line 89
    .line 90
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-object v2, p0, La/swp;->p:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-object v2, p0, La/swp;->q:Ljava/util/Map;

    .line 101
    .line 102
    invoke-static {v2, v0, v1}, La/ohs0;->f(Ljava/util/Map;II)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget v2, p0, La/swp;->r:I

    .line 107
    .line 108
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget v2, p0, La/swp;->s:I

    .line 113
    .line 114
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    iget-object v2, p0, La/swp;->t:Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    iget-boolean v2, p0, La/swp;->u:Z

    .line 125
    .line 126
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    iget p0, p0, La/swp;->v:I

    .line 131
    .line 132
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    add-int/2addr p0, v0

    .line 137
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "FighterResultsModel(id="

    .line 2
    .line 3
    const-string v1, ", sportId="

    .line 4
    .line 5
    iget-wide v2, p0, La/swp;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-wide v1, p0, La/swp;->b:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", subSportId="

    .line 17
    .line 18
    const-string v2, ", champName="

    .line 19
    .line 20
    iget-wide v3, p0, La/swp;->c:J

    .line 21
    .line 22
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v1, ", firstOpponentName="

    .line 26
    .line 27
    const-string v2, ", secondOpponentName="

    .line 28
    .line 29
    iget-object v3, p0, La/swp;->d:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v4, p0, La/swp;->e:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v1, ", firstOpponentImageList="

    .line 37
    .line 38
    const-string v2, ", secondOpponentImageList="

    .line 39
    .line 40
    iget-object v3, p0, La/swp;->f:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v4, p0, La/swp;->g:Ljava/util/List;

    .line 43
    .line 44
    invoke-static {v3, v1, v2, v0, v4}, La/cs0;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 45
    .line 46
    .line 47
    const-string v1, ", firstOpponentIds="

    .line 48
    .line 49
    const-string v2, ", secondOpponentIds="

    .line 50
    .line 51
    iget-object v3, p0, La/swp;->h:Ljava/util/List;

    .line 52
    .line 53
    iget-object v4, p0, La/swp;->i:Ljava/util/List;

    .line 54
    .line 55
    invoke-static {v1, v2, v0, v3, v4}, La/b1j;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    const-string v1, ", scoreBase="

    .line 59
    .line 60
    const-string v2, ", scoreAdd="

    .line 61
    .line 62
    iget-object v3, p0, La/swp;->k:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v4, p0, La/swp;->j:Ljava/util/List;

    .line 65
    .line 66
    invoke-static {v1, v3, v2, v0, v4}, La/h97;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 67
    .line 68
    .line 69
    const-string v1, ", dopInfo="

    .line 70
    .line 71
    const-string v2, ", videos="

    .line 72
    .line 73
    iget-object v3, p0, La/swp;->l:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v4, p0, La/swp;->m:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v1, p0, La/swp;->n:Ljava/util/List;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ", dateStart="

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-wide v1, p0, La/swp;->o:J

    .line 91
    .line 92
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v1, ", status="

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget-object v1, p0, La/swp;->p:Ljava/lang/String;

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string v1, ", matchInfos="

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    iget-object v1, p0, La/swp;->q:Ljava/util/Map;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v1, ", stadiumId="

    .line 116
    .line 117
    const-string v2, ", globalChampId="

    .line 118
    .line 119
    iget v3, p0, La/swp;->r:I

    .line 120
    .line 121
    iget v4, p0, La/swp;->s:I

    .line 122
    .line 123
    invoke-static {v3, v4, v1, v2, v0}, La/rw2;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 124
    .line 125
    .line 126
    const-string v1, ", statId="

    .line 127
    .line 128
    const-string v2, ", homeAwayFlag="

    .line 129
    .line 130
    iget-object v3, p0, La/swp;->t:Ljava/lang/String;

    .line 131
    .line 132
    iget-boolean v4, p0, La/swp;->u:Z

    .line 133
    .line 134
    invoke-static {v1, v3, v2, v0, v4}, La/w6x;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 135
    .line 136
    .line 137
    const-string v1, ", matchStatus="

    .line 138
    .line 139
    const-string v2, ")"

    .line 140
    .line 141
    iget p0, p0, La/swp;->v:I

    .line 142
    .line 143
    invoke-static {v0, v1, p0, v2}, La/vqd;->p(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    return-object p0
.end method
