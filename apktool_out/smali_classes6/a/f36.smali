.class public final synthetic La/f36;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:La/oie;

.field public final synthetic f:Z

.field public final synthetic g:La/hh80;

.field public final synthetic h:La/pz40;

.field public final synthetic i:Z

.field public final synthetic j:La/cqq;

.field public final synthetic k:Lkotlin/jvm/functions/Function1;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/lang/Integer;

.field public final synthetic n:Z

.field public final synthetic o:Z

.field public final synthetic p:La/y9q0;

.field public final synthetic q:La/kly;

.field public final synthetic r:La/vuu0;

.field public final synthetic s:Lkotlin/jvm/functions/Function1;

.field public final synthetic t:La/pz40;


# direct methods
.method public synthetic constructor <init>(JIIILa/oie;ZLa/hh80;La/pz40;ZLa/cqq;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/Integer;ZZLa/y9q0;La/kly;La/vuu0;Lkotlin/jvm/functions/Function1;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/f36;->a:J

    iput p3, p0, La/f36;->b:I

    iput p4, p0, La/f36;->c:I

    iput p5, p0, La/f36;->d:I

    iput-object p6, p0, La/f36;->e:La/oie;

    iput-boolean p7, p0, La/f36;->f:Z

    iput-object p8, p0, La/f36;->g:La/hh80;

    iput-object p9, p0, La/f36;->h:La/pz40;

    iput-boolean p10, p0, La/f36;->i:Z

    iput-object p11, p0, La/f36;->j:La/cqq;

    iput-object p12, p0, La/f36;->k:Lkotlin/jvm/functions/Function1;

    iput-object p13, p0, La/f36;->l:Ljava/lang/String;

    iput-object p14, p0, La/f36;->m:Ljava/lang/Integer;

    iput-boolean p15, p0, La/f36;->n:Z

    move/from16 p1, p16

    iput-boolean p1, p0, La/f36;->o:Z

    move-object/from16 p1, p17

    iput-object p1, p0, La/f36;->p:La/y9q0;

    move-object/from16 p1, p18

    iput-object p1, p0, La/f36;->q:La/kly;

    move-object/from16 p1, p19

    iput-object p1, p0, La/f36;->r:La/vuu0;

    move-object/from16 p1, p20

    iput-object p1, p0, La/f36;->s:Lkotlin/jvm/functions/Function1;

    move-object/from16 p1, p21

    iput-object p1, p0, La/f36;->t:La/pz40;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/fet;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    and-int/lit8 v3, v2, 0x3

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x1

    .line 19
    const/4 v6, 0x2

    .line 20
    if-eq v3, v6, :cond_0

    .line 21
    .line 22
    move v3, v5

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v3, v4

    .line 25
    :goto_0
    and-int/2addr v2, v5

    .line 26
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_8

    .line 31
    .line 32
    iget-object v11, v0, La/f36;->t:La/pz40;

    .line 33
    .line 34
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, La/a8q0;

    .line 39
    .line 40
    new-instance v14, La/skk0;

    .line 41
    .line 42
    iget-wide v7, v0, La/f36;->a:J

    .line 43
    .line 44
    invoke-direct {v14, v7, v8}, La/skk0;-><init>(J)V

    .line 45
    .line 46
    .line 47
    const/4 v3, 0x7

    .line 48
    iget v7, v0, La/f36;->b:I

    .line 49
    .line 50
    if-ne v7, v3, :cond_1

    .line 51
    .line 52
    move v3, v5

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    move v3, v4

    .line 55
    :goto_1
    xor-int/2addr v3, v5

    .line 56
    new-instance v15, La/uly;

    .line 57
    .line 58
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 59
    .line 60
    .line 61
    move-result-object v17

    .line 62
    const/16 v20, 0x70

    .line 63
    .line 64
    iget v3, v0, La/f36;->c:I

    .line 65
    .line 66
    iget v8, v0, La/f36;->d:I

    .line 67
    .line 68
    move/from16 v16, v3

    .line 69
    .line 70
    move/from16 v18, v7

    .line 71
    .line 72
    move/from16 v19, v8

    .line 73
    .line 74
    invoke-direct/range {v15 .. v20}, La/uly;-><init>(ILjava/lang/Boolean;III)V

    .line 75
    .line 76
    .line 77
    iget-object v3, v0, La/f36;->e:La/oie;

    .line 78
    .line 79
    invoke-virtual {v1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    sget-object v9, La/ukd;->a:La/cl5;

    .line 88
    .line 89
    if-nez v7, :cond_2

    .line 90
    .line 91
    if-ne v8, v9, :cond_3

    .line 92
    .line 93
    :cond_2
    new-instance v8, La/os5;

    .line 94
    .line 95
    invoke-direct {v8, v3, v6}, La/os5;-><init>(Ljava/lang/Object;B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 102
    .line 103
    sget-object v3, La/jm40;->b:La/jm40;

    .line 104
    .line 105
    invoke-static {v3, v4, v8}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    const/high16 v6, 0x3f800000    # 1.0f

    .line 110
    .line 111
    invoke-static {v3, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    const/4 v6, 0x0

    .line 116
    iget-boolean v13, v0, La/f36;->f:Z

    .line 117
    .line 118
    invoke-static {v3, v6, v13, v5}, La/o7k0;->w(La/mm40;La/yx7;ZI)La/mm40;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    iget-object v5, v0, La/f36;->g:La/hh80;

    .line 123
    .line 124
    invoke-static {v3, v5}, La/s5x0;->I(La/mm40;La/hh80;)La/mm40;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    iget-object v5, v0, La/f36;->h:La/pz40;

    .line 129
    .line 130
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    iget-boolean v7, v0, La/f36;->i:Z

    .line 135
    .line 136
    invoke-virtual {v1, v7}, La/fet;->h(Z)Z

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    or-int/2addr v6, v8

    .line 141
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    if-nez v6, :cond_4

    .line 146
    .line 147
    if-ne v8, v9, :cond_5

    .line 148
    .line 149
    :cond_4
    new-instance v8, La/b36;

    .line 150
    .line 151
    invoke-direct {v8, v7, v5, v11, v4}, La/b36;-><init>(ZLa/pz40;La/pz40;B)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_5
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 158
    .line 159
    invoke-static {v3, v8}, La/j120;->b0(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    iget-object v4, v0, La/f36;->j:La/cqq;

    .line 164
    .line 165
    invoke-static {v3, v4}, La/y860;->b0(La/mm40;La/cqq;)La/mm40;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    const-string v4, "BASE_TEXT_FIELD_TAG"

    .line 170
    .line 171
    invoke-static {v3, v4}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    iget-object v8, v0, La/f36;->l:Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {v1, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    iget-object v5, v0, La/f36;->m:Ljava/lang/Integer;

    .line 182
    .line 183
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v6

    .line 187
    or-int/2addr v4, v6

    .line 188
    iget-object v10, v0, La/f36;->k:Lkotlin/jvm/functions/Function1;

    .line 189
    .line 190
    invoke-virtual {v1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v6

    .line 194
    or-int/2addr v4, v6

    .line 195
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    if-nez v4, :cond_6

    .line 200
    .line 201
    if-ne v6, v9, :cond_7

    .line 202
    .line 203
    :cond_6
    new-instance v7, La/dc0;

    .line 204
    .line 205
    const/16 v12, 0xc

    .line 206
    .line 207
    move-object v9, v5

    .line 208
    invoke-direct/range {v7 .. v12}, La/dc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    move-object v6, v7

    .line 215
    :cond_7
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 216
    .line 217
    const/16 v18, 0x0

    .line 218
    .line 219
    const v19, 0xa600

    .line 220
    .line 221
    .line 222
    move-object v4, v2

    .line 223
    move-object v2, v3

    .line 224
    iget-boolean v3, v0, La/f36;->n:Z

    .line 225
    .line 226
    move-object v5, v4

    .line 227
    iget-boolean v4, v0, La/f36;->o:Z

    .line 228
    .line 229
    move-object v7, v5

    .line 230
    iget-object v5, v0, La/f36;->p:La/y9q0;

    .line 231
    .line 232
    move-object v8, v7

    .line 233
    iget-object v7, v0, La/f36;->q:La/kly;

    .line 234
    .line 235
    const/4 v9, 0x0

    .line 236
    const/4 v10, 0x0

    .line 237
    iget-object v11, v0, La/f36;->r:La/vuu0;

    .line 238
    .line 239
    iget-object v12, v0, La/f36;->s:Lkotlin/jvm/functions/Function1;

    .line 240
    .line 241
    move-object v0, v8

    .line 242
    move v8, v13

    .line 243
    const/4 v13, 0x0

    .line 244
    move-object/from16 v16, v1

    .line 245
    .line 246
    move-object v1, v6

    .line 247
    move-object v6, v15

    .line 248
    const/4 v15, 0x0

    .line 249
    const/16 v17, 0x0

    .line 250
    .line 251
    invoke-static/range {v0 .. v19}, La/z96;->a(La/a8q0;Lkotlin/jvm/functions/Function1;La/mm40;ZZLa/y9q0;La/uly;La/kly;ZIILa/vuu0;Lkotlin/jvm/functions/Function1;La/gy40;La/skk0;La/xdr;La/fet;III)V

    .line 252
    .line 253
    .line 254
    goto :goto_2

    .line 255
    :cond_8
    move-object/from16 v16, v1

    .line 256
    .line 257
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 258
    .line 259
    .line 260
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object v0
.end method
