.class public final La/p5t;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final A:La/iwm0;

.field public final a:J

.field public final b:I

.field public final c:J

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:J

.field public final g:I

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:I

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;

.field public final m:Z

.field public final n:J

.field public final o:I

.field public final p:Z

.field public final q:Z

.field public final r:Z

.field public final s:La/sil0;

.field public final t:La/d3n0;

.field public final u:La/slz;

.field public final v:La/h280;

.field public final w:La/h280;

.field public final x:La/e480;

.field public final y:La/na30;

.field public final z:La/iv10;


# direct methods
.method public constructor <init>(JIJJLjava/lang/String;JILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZJIZZZLa/sil0;La/d3n0;La/slz;La/h280;La/h280;La/e480;La/na30;La/iv10;La/iwm0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/p5t;->a:J

    .line 5
    .line 6
    iput p3, p0, La/p5t;->b:I

    .line 7
    .line 8
    iput-wide p4, p0, La/p5t;->c:J

    .line 9
    .line 10
    iput-wide p6, p0, La/p5t;->d:J

    .line 11
    .line 12
    iput-object p8, p0, La/p5t;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-wide p9, p0, La/p5t;->f:J

    .line 15
    .line 16
    iput p11, p0, La/p5t;->g:I

    .line 17
    .line 18
    iput-object p12, p0, La/p5t;->h:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p13, p0, La/p5t;->i:Ljava/lang/String;

    .line 21
    .line 22
    iput p14, p0, La/p5t;->j:I

    .line 23
    .line 24
    iput-object p15, p0, La/p5t;->k:Ljava/lang/String;

    .line 25
    .line 26
    move-object/from16 p1, p16

    .line 27
    .line 28
    iput-object p1, p0, La/p5t;->l:Ljava/lang/String;

    .line 29
    .line 30
    move/from16 p1, p17

    .line 31
    .line 32
    iput-boolean p1, p0, La/p5t;->m:Z

    .line 33
    .line 34
    move-wide/from16 p1, p18

    .line 35
    .line 36
    iput-wide p1, p0, La/p5t;->n:J

    .line 37
    .line 38
    move/from16 p1, p20

    .line 39
    .line 40
    iput p1, p0, La/p5t;->o:I

    .line 41
    .line 42
    move/from16 p1, p21

    .line 43
    .line 44
    iput-boolean p1, p0, La/p5t;->p:Z

    .line 45
    .line 46
    move/from16 p1, p22

    .line 47
    .line 48
    iput-boolean p1, p0, La/p5t;->q:Z

    .line 49
    .line 50
    move/from16 p1, p23

    .line 51
    .line 52
    iput-boolean p1, p0, La/p5t;->r:Z

    .line 53
    .line 54
    move-object/from16 p1, p24

    .line 55
    .line 56
    iput-object p1, p0, La/p5t;->s:La/sil0;

    .line 57
    .line 58
    move-object/from16 p1, p25

    .line 59
    .line 60
    iput-object p1, p0, La/p5t;->t:La/d3n0;

    .line 61
    .line 62
    move-object/from16 p1, p26

    .line 63
    .line 64
    iput-object p1, p0, La/p5t;->u:La/slz;

    .line 65
    .line 66
    move-object/from16 p1, p27

    .line 67
    .line 68
    iput-object p1, p0, La/p5t;->v:La/h280;

    .line 69
    .line 70
    move-object/from16 p1, p28

    .line 71
    .line 72
    iput-object p1, p0, La/p5t;->w:La/h280;

    .line 73
    .line 74
    move-object/from16 p1, p29

    .line 75
    .line 76
    iput-object p1, p0, La/p5t;->x:La/e480;

    .line 77
    .line 78
    move-object/from16 p1, p30

    .line 79
    .line 80
    iput-object p1, p0, La/p5t;->y:La/na30;

    .line 81
    .line 82
    move-object/from16 p1, p31

    .line 83
    .line 84
    iput-object p1, p0, La/p5t;->z:La/iv10;

    .line 85
    .line 86
    move-object/from16 p1, p32

    .line 87
    .line 88
    iput-object p1, p0, La/p5t;->A:La/iwm0;

    .line 89
    .line 90
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
    instance-of v0, p1, La/p5t;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/p5t;

    .line 12
    .line 13
    iget-wide v0, p0, La/p5t;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/p5t;->a:J

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
    iget v0, p0, La/p5t;->b:I

    .line 24
    .line 25
    iget v1, p1, La/p5t;->b:I

    .line 26
    .line 27
    if-eq v0, v1, :cond_3

    .line 28
    .line 29
    goto/16 :goto_0

    .line 30
    .line 31
    :cond_3
    iget-wide v0, p0, La/p5t;->c:J

    .line 32
    .line 33
    iget-wide v2, p1, La/p5t;->c:J

    .line 34
    .line 35
    cmp-long v0, v0, v2

    .line 36
    .line 37
    if-eqz v0, :cond_4

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_4
    iget-wide v0, p0, La/p5t;->d:J

    .line 42
    .line 43
    iget-wide v2, p1, La/p5t;->d:J

    .line 44
    .line 45
    cmp-long v0, v0, v2

    .line 46
    .line 47
    if-eqz v0, :cond_5

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :cond_5
    iget-object v0, p0, La/p5t;->e:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v1, p1, La/p5t;->e:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_6

    .line 60
    .line 61
    goto/16 :goto_0

    .line 62
    .line 63
    :cond_6
    iget-wide v0, p0, La/p5t;->f:J

    .line 64
    .line 65
    iget-wide v2, p1, La/p5t;->f:J

    .line 66
    .line 67
    cmp-long v0, v0, v2

    .line 68
    .line 69
    if-eqz v0, :cond_7

    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :cond_7
    iget v0, p0, La/p5t;->g:I

    .line 74
    .line 75
    iget v1, p1, La/p5t;->g:I

    .line 76
    .line 77
    if-eq v0, v1, :cond_8

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :cond_8
    iget-object v0, p0, La/p5t;->h:Ljava/lang/String;

    .line 82
    .line 83
    iget-object v1, p1, La/p5t;->h:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_9

    .line 90
    .line 91
    goto/16 :goto_0

    .line 92
    .line 93
    :cond_9
    iget-object v0, p0, La/p5t;->i:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v1, p1, La/p5t;->i:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_a

    .line 102
    .line 103
    goto/16 :goto_0

    .line 104
    .line 105
    :cond_a
    iget v0, p0, La/p5t;->j:I

    .line 106
    .line 107
    iget v1, p1, La/p5t;->j:I

    .line 108
    .line 109
    if-eq v0, v1, :cond_b

    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :cond_b
    iget-object v0, p0, La/p5t;->k:Ljava/lang/String;

    .line 114
    .line 115
    iget-object v1, p1, La/p5t;->k:Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-nez v0, :cond_c

    .line 122
    .line 123
    goto/16 :goto_0

    .line 124
    .line 125
    :cond_c
    iget-object v0, p0, La/p5t;->l:Ljava/lang/String;

    .line 126
    .line 127
    iget-object v1, p1, La/p5t;->l:Ljava/lang/String;

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
    goto/16 :goto_0

    .line 136
    .line 137
    :cond_d
    iget-boolean v0, p0, La/p5t;->m:Z

    .line 138
    .line 139
    iget-boolean v1, p1, La/p5t;->m:Z

    .line 140
    .line 141
    if-eq v0, v1, :cond_e

    .line 142
    .line 143
    goto/16 :goto_0

    .line 144
    .line 145
    :cond_e
    iget-wide v0, p0, La/p5t;->n:J

    .line 146
    .line 147
    iget-wide v2, p1, La/p5t;->n:J

    .line 148
    .line 149
    cmp-long v0, v0, v2

    .line 150
    .line 151
    if-eqz v0, :cond_f

    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    .line 155
    :cond_f
    iget v0, p0, La/p5t;->o:I

    .line 156
    .line 157
    iget v1, p1, La/p5t;->o:I

    .line 158
    .line 159
    if-eq v0, v1, :cond_10

    .line 160
    .line 161
    goto/16 :goto_0

    .line 162
    .line 163
    :cond_10
    iget-boolean v0, p0, La/p5t;->p:Z

    .line 164
    .line 165
    iget-boolean v1, p1, La/p5t;->p:Z

    .line 166
    .line 167
    if-eq v0, v1, :cond_11

    .line 168
    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_11
    iget-boolean v0, p0, La/p5t;->q:Z

    .line 172
    .line 173
    iget-boolean v1, p1, La/p5t;->q:Z

    .line 174
    .line 175
    if-eq v0, v1, :cond_12

    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :cond_12
    iget-boolean v0, p0, La/p5t;->r:Z

    .line 180
    .line 181
    iget-boolean v1, p1, La/p5t;->r:Z

    .line 182
    .line 183
    if-eq v0, v1, :cond_13

    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_13
    iget-object v0, p0, La/p5t;->s:La/sil0;

    .line 187
    .line 188
    iget-object v1, p1, La/p5t;->s:La/sil0;

    .line 189
    .line 190
    invoke-virtual {v0, v1}, La/sil0;->equals(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-nez v0, :cond_14

    .line 195
    .line 196
    goto :goto_0

    .line 197
    :cond_14
    iget-object v0, p0, La/p5t;->t:La/d3n0;

    .line 198
    .line 199
    iget-object v1, p1, La/p5t;->t:La/d3n0;

    .line 200
    .line 201
    invoke-virtual {v0, v1}, La/d3n0;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-nez v0, :cond_15

    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_15
    iget-object v0, p0, La/p5t;->u:La/slz;

    .line 209
    .line 210
    iget-object v1, p1, La/p5t;->u:La/slz;

    .line 211
    .line 212
    invoke-virtual {v0, v1}, La/slz;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-nez v0, :cond_16

    .line 217
    .line 218
    goto :goto_0

    .line 219
    :cond_16
    iget-object v0, p0, La/p5t;->v:La/h280;

    .line 220
    .line 221
    iget-object v1, p1, La/p5t;->v:La/h280;

    .line 222
    .line 223
    invoke-virtual {v0, v1}, La/h280;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-nez v0, :cond_17

    .line 228
    .line 229
    goto :goto_0

    .line 230
    :cond_17
    iget-object v0, p0, La/p5t;->w:La/h280;

    .line 231
    .line 232
    iget-object v1, p1, La/p5t;->w:La/h280;

    .line 233
    .line 234
    invoke-virtual {v0, v1}, La/h280;->equals(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    if-nez v0, :cond_18

    .line 239
    .line 240
    goto :goto_0

    .line 241
    :cond_18
    iget-object v0, p0, La/p5t;->x:La/e480;

    .line 242
    .line 243
    iget-object v1, p1, La/p5t;->x:La/e480;

    .line 244
    .line 245
    invoke-virtual {v0, v1}, La/e480;->equals(Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-nez v0, :cond_19

    .line 250
    .line 251
    goto :goto_0

    .line 252
    :cond_19
    iget-object v0, p0, La/p5t;->y:La/na30;

    .line 253
    .line 254
    iget-object v1, p1, La/p5t;->y:La/na30;

    .line 255
    .line 256
    invoke-virtual {v0, v1}, La/na30;->equals(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-nez v0, :cond_1a

    .line 261
    .line 262
    goto :goto_0

    .line 263
    :cond_1a
    iget-object v0, p0, La/p5t;->z:La/iv10;

    .line 264
    .line 265
    iget-object v1, p1, La/p5t;->z:La/iv10;

    .line 266
    .line 267
    invoke-virtual {v0, v1}, La/iv10;->equals(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    if-nez v0, :cond_1b

    .line 272
    .line 273
    goto :goto_0

    .line 274
    :cond_1b
    iget-object p0, p0, La/p5t;->A:La/iwm0;

    .line 275
    .line 276
    iget-object p1, p1, La/p5t;->A:La/iwm0;

    .line 277
    .line 278
    invoke-virtual {p0, p1}, La/iwm0;->equals(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result p0

    .line 282
    if-nez p0, :cond_1c

    .line 283
    .line 284
    :goto_0
    const/4 p0, 0x0

    .line 285
    return p0

    .line 286
    :cond_1c
    :goto_1
    const/4 p0, 0x1

    .line 287
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/p5t;->a:J

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
    iget v2, p0, La/p5t;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/p5t;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, La/p5t;->d:J

    .line 23
    .line 24
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/p5t;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, La/p5t;->f:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/p5t;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/p5t;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/p5t;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget v2, p0, La/p5t;->j:I

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/p5t;->k:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, La/p5t;->l:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-boolean v2, p0, La/p5t;->m:Z

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-wide v2, p0, La/p5t;->n:J

    .line 83
    .line 84
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget v2, p0, La/p5t;->o:I

    .line 89
    .line 90
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-boolean v2, p0, La/p5t;->p:Z

    .line 95
    .line 96
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    iget-boolean v2, p0, La/p5t;->q:Z

    .line 101
    .line 102
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    iget-boolean v2, p0, La/p5t;->r:Z

    .line 107
    .line 108
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    iget-object v2, p0, La/p5t;->s:La/sil0;

    .line 113
    .line 114
    invoke-virtual {v2}, La/sil0;->hashCode()I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    add-int/2addr v2, v0

    .line 119
    mul-int/2addr v2, v1

    .line 120
    iget-object v0, p0, La/p5t;->t:La/d3n0;

    .line 121
    .line 122
    invoke-virtual {v0}, La/d3n0;->hashCode()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    add-int/2addr v0, v2

    .line 127
    mul-int/2addr v0, v1

    .line 128
    iget-object v2, p0, La/p5t;->u:La/slz;

    .line 129
    .line 130
    invoke-virtual {v2}, La/slz;->hashCode()I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    add-int/2addr v2, v0

    .line 135
    mul-int/2addr v2, v1

    .line 136
    iget-object v0, p0, La/p5t;->v:La/h280;

    .line 137
    .line 138
    invoke-virtual {v0}, La/h280;->hashCode()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    add-int/2addr v0, v2

    .line 143
    mul-int/2addr v0, v1

    .line 144
    iget-object v2, p0, La/p5t;->w:La/h280;

    .line 145
    .line 146
    invoke-virtual {v2}, La/h280;->hashCode()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    add-int/2addr v2, v0

    .line 151
    mul-int/2addr v2, v1

    .line 152
    iget-object v0, p0, La/p5t;->x:La/e480;

    .line 153
    .line 154
    iget-object v0, v0, La/e480;->a:Ljava/lang/String;

    .line 155
    .line 156
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    iget-object v2, p0, La/p5t;->y:La/na30;

    .line 161
    .line 162
    invoke-virtual {v2}, La/na30;->hashCode()I

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    add-int/2addr v2, v0

    .line 167
    mul-int/2addr v2, v1

    .line 168
    iget-object v0, p0, La/p5t;->z:La/iv10;

    .line 169
    .line 170
    invoke-virtual {v0}, La/iv10;->hashCode()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    add-int/2addr v0, v2

    .line 175
    mul-int/2addr v0, v1

    .line 176
    iget-object p0, p0, La/p5t;->A:La/iwm0;

    .line 177
    .line 178
    invoke-virtual {p0}, La/iwm0;->hashCode()I

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    add-int/2addr p0, v0

    .line 183
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "GamesForCouponModel(id="

    .line 2
    .line 3
    const-string v1, ", num="

    .line 4
    .line 5
    iget v2, p0, La/p5t;->b:I

    .line 6
    .line 7
    iget-wide v3, p0, La/p5t;->a:J

    .line 8
    .line 9
    invoke-static {v2, v3, v4, v0, v1}, La/brm0;->q(IJLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", mainGameId="

    .line 14
    .line 15
    const-string v2, ", constId="

    .line 16
    .line 17
    iget-wide v3, p0, La/p5t;->c:J

    .line 18
    .line 19
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v1, ", fullName="

    .line 23
    .line 24
    iget-wide v2, p0, La/p5t;->d:J

    .line 25
    .line 26
    iget-object v4, p0, La/p5t;->e:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v1, ", startTs="

    .line 32
    .line 33
    const-string v2, ", countryId="

    .line 34
    .line 35
    iget-wide v3, p0, La/p5t;->f:J

    .line 36
    .line 37
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v1, ", gameTypeName="

    .line 41
    .line 42
    const-string v2, ", dopInfo="

    .line 43
    .line 44
    iget v3, p0, La/p5t;->g:I

    .line 45
    .line 46
    iget-object v4, p0, La/p5t;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v3, v1, v4, v2, v0}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 49
    .line 50
    .line 51
    const-string v1, ", period="

    .line 52
    .line 53
    const-string v2, ", periodName="

    .line 54
    .line 55
    iget v3, p0, La/p5t;->j:I

    .line 56
    .line 57
    iget-object v4, p0, La/p5t;->i:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v3, v4, v1, v2, v0}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 60
    .line 61
    .line 62
    const-string v1, ", gameVidName="

    .line 63
    .line 64
    const-string v2, ", isFinal="

    .line 65
    .line 66
    iget-object v3, p0, La/p5t;->k:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v4, p0, La/p5t;->l:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v1, ", mainConstId="

    .line 74
    .line 75
    iget-wide v2, p0, La/p5t;->n:J

    .line 76
    .line 77
    iget-boolean v4, p0, La/p5t;->m:Z

    .line 78
    .line 79
    invoke-static {v2, v3, v1, v0, v4}, La/rw2;->v(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 80
    .line 81
    .line 82
    const-string v1, ", kind="

    .line 83
    .line 84
    const-string v2, ", hasHeadToHead="

    .line 85
    .line 86
    iget v3, p0, La/p5t;->o:I

    .line 87
    .line 88
    iget-boolean v4, p0, La/p5t;->p:Z

    .line 89
    .line 90
    invoke-static {v3, v1, v2, v0, v4}, La/dw9;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 91
    .line 92
    .line 93
    const-string v1, ", subscriptionAvailable="

    .line 94
    .line 95
    const-string v2, ", nonStarted="

    .line 96
    .line 97
    iget-boolean v3, p0, La/p5t;->q:Z

    .line 98
    .line 99
    iget-boolean v4, p0, La/p5t;->r:Z

    .line 100
    .line 101
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 102
    .line 103
    .line 104
    const-string v1, ", sportModel="

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v1, p0, La/p5t;->s:La/sil0;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, ", subSportModel="

    .line 115
    .line 116
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget-object v1, p0, La/p5t;->t:La/d3n0;

    .line 120
    .line 121
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v1, ", ligaModel="

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    iget-object v1, p0, La/p5t;->u:La/slz;

    .line 130
    .line 131
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v1, ", firstOpponentModel="

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    iget-object v1, p0, La/p5t;->v:La/h280;

    .line 140
    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v1, ", secondOpponentModel="

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    iget-object v1, p0, La/p5t;->w:La/h280;

    .line 150
    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v1, ", opponentsModel="

    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    iget-object v1, p0, La/p5t;->x:La/e480;

    .line 160
    .line 161
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string v1, ", matchInfoModel="

    .line 165
    .line 166
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    iget-object v1, p0, La/p5t;->y:La/na30;

    .line 170
    .line 171
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    const-string v1, ", mainGameScoresModel="

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    iget-object v1, p0, La/p5t;->z:La/iv10;

    .line 180
    .line 181
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string v1, ", subGameScoresModel="

    .line 185
    .line 186
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    iget-object p0, p0, La/p5t;->A:La/iwm0;

    .line 190
    .line 191
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    const-string p0, ")"

    .line 195
    .line 196
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    return-object p0
.end method
