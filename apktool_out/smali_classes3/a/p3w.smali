.class public final La/p3w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/o8w;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:La/a4x;

.field public final g:La/a4x;

.field public final h:Z

.field public final i:I

.field public final j:Z

.field public final k:La/tvw;

.field public final l:Z

.field public final m:Ljava/lang/String;

.field public final n:Z

.field public final o:Z

.field public final p:Z

.field public final q:I

.field public final r:Ljava/lang/String;

.field public final s:Ljava/lang/String;

.field public final t:Ljava/lang/String;

.field public final u:Ljava/lang/String;

.field public final v:Ljava/lang/String;

.field public final w:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/i4;La/i4;ZIZLa/tvw;ZLjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-static/range {p1 .. p5}, La/ohs0;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p18 .. p18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p21 .. p21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/p3w;->a:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p2, p0, La/p3w;->b:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p3, p0, La/p3w;->c:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p4, p0, La/p3w;->d:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p5, p0, La/p3w;->e:Ljava/lang/String;

    .line 31
    .line 32
    iput-object p6, p0, La/p3w;->f:La/a4x;

    .line 33
    .line 34
    iput-object p7, p0, La/p3w;->g:La/a4x;

    .line 35
    .line 36
    iput-boolean p8, p0, La/p3w;->h:Z

    .line 37
    .line 38
    iput p9, p0, La/p3w;->i:I

    .line 39
    .line 40
    iput-boolean p10, p0, La/p3w;->j:Z

    .line 41
    .line 42
    iput-object p11, p0, La/p3w;->k:La/tvw;

    .line 43
    .line 44
    iput-boolean p12, p0, La/p3w;->l:Z

    .line 45
    .line 46
    iput-object p13, p0, La/p3w;->m:Ljava/lang/String;

    .line 47
    .line 48
    iput-boolean p14, p0, La/p3w;->n:Z

    .line 49
    .line 50
    iput-boolean p15, p0, La/p3w;->o:Z

    .line 51
    .line 52
    move/from16 p1, p16

    .line 53
    .line 54
    iput-boolean p1, p0, La/p3w;->p:Z

    .line 55
    .line 56
    move/from16 p1, p17

    .line 57
    .line 58
    iput p1, p0, La/p3w;->q:I

    .line 59
    .line 60
    move-object/from16 p1, p18

    .line 61
    .line 62
    iput-object p1, p0, La/p3w;->r:Ljava/lang/String;

    .line 63
    .line 64
    move-object/from16 p1, p19

    .line 65
    .line 66
    iput-object p1, p0, La/p3w;->s:Ljava/lang/String;

    .line 67
    .line 68
    move-object/from16 p1, p20

    .line 69
    .line 70
    iput-object p1, p0, La/p3w;->t:Ljava/lang/String;

    .line 71
    .line 72
    move-object/from16 p1, p21

    .line 73
    .line 74
    iput-object p1, p0, La/p3w;->u:Ljava/lang/String;

    .line 75
    .line 76
    move-object/from16 p1, p22

    .line 77
    .line 78
    iput-object p1, p0, La/p3w;->v:Ljava/lang/String;

    .line 79
    .line 80
    move/from16 p1, p23

    .line 81
    .line 82
    iput-boolean p1, p0, La/p3w;->w:Z

    .line 83
    .line 84
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
    instance-of v0, p1, La/p3w;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/p3w;

    .line 12
    .line 13
    iget-object v0, p0, La/p3w;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/p3w;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/p3w;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, La/p3w;->b:Ljava/lang/String;

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
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget-object v0, p0, La/p3w;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p1, La/p3w;->c:Ljava/lang/String;

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
    iget-object v0, p0, La/p3w;->d:Ljava/lang/String;

    .line 50
    .line 51
    iget-object v1, p1, La/p3w;->d:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    goto/16 :goto_0

    .line 60
    .line 61
    :cond_5
    iget-object v0, p0, La/p3w;->e:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v1, p1, La/p3w;->e:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_6

    .line 70
    .line 71
    goto/16 :goto_0

    .line 72
    .line 73
    :cond_6
    iget-object v0, p0, La/p3w;->f:La/a4x;

    .line 74
    .line 75
    iget-object v1, p1, La/p3w;->f:La/a4x;

    .line 76
    .line 77
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_7

    .line 82
    .line 83
    goto/16 :goto_0

    .line 84
    .line 85
    :cond_7
    iget-object v0, p0, La/p3w;->g:La/a4x;

    .line 86
    .line 87
    iget-object v1, p1, La/p3w;->g:La/a4x;

    .line 88
    .line 89
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_8

    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :cond_8
    iget-boolean v0, p0, La/p3w;->h:Z

    .line 98
    .line 99
    iget-boolean v1, p1, La/p3w;->h:Z

    .line 100
    .line 101
    if-eq v0, v1, :cond_9

    .line 102
    .line 103
    goto/16 :goto_0

    .line 104
    .line 105
    :cond_9
    iget v0, p0, La/p3w;->i:I

    .line 106
    .line 107
    iget v1, p1, La/p3w;->i:I

    .line 108
    .line 109
    if-eq v0, v1, :cond_a

    .line 110
    .line 111
    goto/16 :goto_0

    .line 112
    .line 113
    :cond_a
    iget-boolean v0, p0, La/p3w;->j:Z

    .line 114
    .line 115
    iget-boolean v1, p1, La/p3w;->j:Z

    .line 116
    .line 117
    if-eq v0, v1, :cond_b

    .line 118
    .line 119
    goto/16 :goto_0

    .line 120
    .line 121
    :cond_b
    iget-object v0, p0, La/p3w;->k:La/tvw;

    .line 122
    .line 123
    iget-object v1, p1, La/p3w;->k:La/tvw;

    .line 124
    .line 125
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-nez v0, :cond_c

    .line 130
    .line 131
    goto/16 :goto_0

    .line 132
    .line 133
    :cond_c
    iget-boolean v0, p0, La/p3w;->l:Z

    .line 134
    .line 135
    iget-boolean v1, p1, La/p3w;->l:Z

    .line 136
    .line 137
    if-eq v0, v1, :cond_d

    .line 138
    .line 139
    goto/16 :goto_0

    .line 140
    .line 141
    :cond_d
    iget-object v0, p0, La/p3w;->m:Ljava/lang/String;

    .line 142
    .line 143
    iget-object v1, p1, La/p3w;->m:Ljava/lang/String;

    .line 144
    .line 145
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_e

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_e
    iget-boolean v0, p0, La/p3w;->n:Z

    .line 153
    .line 154
    iget-boolean v1, p1, La/p3w;->n:Z

    .line 155
    .line 156
    if-eq v0, v1, :cond_f

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_f
    iget-boolean v0, p0, La/p3w;->o:Z

    .line 160
    .line 161
    iget-boolean v1, p1, La/p3w;->o:Z

    .line 162
    .line 163
    if-eq v0, v1, :cond_10

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_10
    iget-boolean v0, p0, La/p3w;->p:Z

    .line 167
    .line 168
    iget-boolean v1, p1, La/p3w;->p:Z

    .line 169
    .line 170
    if-eq v0, v1, :cond_11

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_11
    iget v0, p0, La/p3w;->q:I

    .line 174
    .line 175
    iget v1, p1, La/p3w;->q:I

    .line 176
    .line 177
    if-eq v0, v1, :cond_12

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_12
    iget-object v0, p0, La/p3w;->r:Ljava/lang/String;

    .line 181
    .line 182
    iget-object v1, p1, La/p3w;->r:Ljava/lang/String;

    .line 183
    .line 184
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-nez v0, :cond_13

    .line 189
    .line 190
    goto :goto_0

    .line 191
    :cond_13
    iget-object v0, p0, La/p3w;->s:Ljava/lang/String;

    .line 192
    .line 193
    iget-object v1, p1, La/p3w;->s:Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-nez v0, :cond_14

    .line 200
    .line 201
    goto :goto_0

    .line 202
    :cond_14
    iget-object v0, p0, La/p3w;->t:Ljava/lang/String;

    .line 203
    .line 204
    iget-object v1, p1, La/p3w;->t:Ljava/lang/String;

    .line 205
    .line 206
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    if-nez v0, :cond_15

    .line 211
    .line 212
    goto :goto_0

    .line 213
    :cond_15
    iget-object v0, p0, La/p3w;->u:Ljava/lang/String;

    .line 214
    .line 215
    iget-object v1, p1, La/p3w;->u:Ljava/lang/String;

    .line 216
    .line 217
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-nez v0, :cond_16

    .line 222
    .line 223
    goto :goto_0

    .line 224
    :cond_16
    iget-object v0, p0, La/p3w;->v:Ljava/lang/String;

    .line 225
    .line 226
    iget-object v1, p1, La/p3w;->v:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    if-nez v0, :cond_17

    .line 233
    .line 234
    goto :goto_0

    .line 235
    :cond_17
    iget-boolean p0, p0, La/p3w;->w:Z

    .line 236
    .line 237
    iget-boolean p1, p1, La/p3w;->w:Z

    .line 238
    .line 239
    if-eq p0, p1, :cond_18

    .line 240
    .line 241
    :goto_0
    const/4 p0, 0x0

    .line 242
    return p0

    .line 243
    :cond_18
    :goto_1
    const/4 p0, 0x1

    .line 244
    return p0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/p3w;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/p3w;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, La/p3w;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/p3w;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/p3w;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/p3w;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/p3w;->f:La/a4x;

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/p3w;->g:La/a4x;

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, La/p3w;->h:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v2, p0, La/p3w;->i:I

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, La/p3w;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/p3w;->k:La/tvw;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    add-int/2addr v2, v0

    .line 71
    mul-int/2addr v2, v1

    .line 72
    iget-boolean v0, p0, La/p3w;->l:Z

    .line 73
    .line 74
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object v2, p0, La/p3w;->m:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-boolean v2, p0, La/p3w;->n:Z

    .line 85
    .line 86
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-boolean v2, p0, La/p3w;->o:Z

    .line 91
    .line 92
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    iget-boolean v2, p0, La/p3w;->p:Z

    .line 97
    .line 98
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget v2, p0, La/p3w;->q:I

    .line 103
    .line 104
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iget-object v2, p0, La/p3w;->r:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iget-object v2, p0, La/p3w;->s:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    iget-object v2, p0, La/p3w;->t:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    iget-object v2, p0, La/p3w;->u:Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    iget-object v2, p0, La/p3w;->v:Ljava/lang/String;

    .line 133
    .line 134
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    iget-boolean p0, p0, La/p3w;->w:Z

    .line 139
    .line 140
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    add-int/2addr p0, v0

    .line 145
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", betId="

    .line 2
    .line 3
    const-string v1, ", date="

    .line 4
    .line 5
    const-string v2, "HistoryItemUiModel(key="

    .line 6
    .line 7
    iget-object v3, p0, La/p3w;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, La/p3w;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", type="

    .line 16
    .line 17
    const-string v2, ", betNumber="

    .line 18
    .line 19
    iget-object v3, p0, La/p3w;->c:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v4, p0, La/p3w;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", tagList="

    .line 27
    .line 28
    const-string v2, ", itemsDescriptionList="

    .line 29
    .line 30
    iget-object v3, p0, La/p3w;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, La/p3w;->f:La/a4x;

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, La/cs0;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;La/a4x;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, La/p3w;->g:La/a4x;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, ", notificationVisibility="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-boolean v1, p0, La/p3w;->h:Z

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", notificationIconResId="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v1, ", isNotificationEnable="

    .line 58
    .line 59
    const-string v2, ", iconBetUiModel="

    .line 60
    .line 61
    iget v3, p0, La/p3w;->i:I

    .line 62
    .line 63
    iget-boolean v4, p0, La/p3w;->j:Z

    .line 64
    .line 65
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, La/p3w;->k:La/tvw;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", sellVisibility="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-boolean v1, p0, La/p3w;->l:Z

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", sellTitleButton="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, ", aggregatorVisibility="

    .line 89
    .line 90
    const-string v2, ", moreVisibility="

    .line 91
    .line 92
    iget-object v3, p0, La/p3w;->m:Ljava/lang/String;

    .line 93
    .line 94
    iget-boolean v4, p0, La/p3w;->n:Z

    .line 95
    .line 96
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 97
    .line 98
    .line 99
    const-string v1, ", middleVisibility="

    .line 100
    .line 101
    const-string v2, ", couponStatusRes="

    .line 102
    .line 103
    iget-boolean v3, p0, La/p3w;->o:Z

    .line 104
    .line 105
    iget-boolean v4, p0, La/p3w;->p:Z

    .line 106
    .line 107
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 108
    .line 109
    .line 110
    const-string v1, ", betCount="

    .line 111
    .line 112
    const-string v2, ", eventInfo="

    .line 113
    .line 114
    iget v3, p0, La/p3w;->q:I

    .line 115
    .line 116
    iget-object v4, p0, La/p3w;->r:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v3, v1, v4, v2, v0}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 119
    .line 120
    .line 121
    const-string v1, ", coefficient="

    .line 122
    .line 123
    const-string v2, ", marketInfo="

    .line 124
    .line 125
    iget-object v3, p0, La/p3w;->s:Ljava/lang/String;

    .line 126
    .line 127
    iget-object v4, p0, La/p3w;->t:Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    const-string v1, ", subMarketInfo="

    .line 133
    .line 134
    const-string v2, ", copyVisibility="

    .line 135
    .line 136
    iget-object v3, p0, La/p3w;->u:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v4, p0, La/p3w;->v:Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    const-string v1, ")"

    .line 144
    .line 145
    iget-boolean p0, p0, La/p3w;->w:Z

    .line 146
    .line 147
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0
.end method
