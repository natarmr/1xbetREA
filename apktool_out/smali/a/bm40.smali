.class public final La/bm40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lkotlin/jvm/functions/Function0;

.field public final synthetic c:La/xpj0;

.field public final synthetic d:La/em40;

.field public final synthetic e:La/t33;

.field public final synthetic f:La/vne;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:La/mm40;

.field public final synthetic i:F

.field public final synthetic j:Z

.field public final synthetic k:La/yjj0;

.field public final synthetic l:J

.field public final synthetic m:J

.field public final synthetic n:Lkotlin/jvm/functions/Function2;

.field public final synthetic o:Lkotlin/jvm/functions/Function2;

.field public final synthetic p:La/ugd;


# direct methods
.method public constructor <init>(JLkotlin/jvm/functions/Function0;La/xpj0;La/em40;La/t33;La/vne;Lkotlin/jvm/functions/Function1;La/mm40;FZLa/yjj0;JJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/ugd;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/bm40;->a:J

    .line 5
    .line 6
    iput-object p3, p0, La/bm40;->b:Lkotlin/jvm/functions/Function0;

    .line 7
    .line 8
    iput-object p4, p0, La/bm40;->c:La/xpj0;

    .line 9
    .line 10
    iput-object p5, p0, La/bm40;->d:La/em40;

    .line 11
    .line 12
    iput-object p6, p0, La/bm40;->e:La/t33;

    .line 13
    .line 14
    iput-object p7, p0, La/bm40;->f:La/vne;

    .line 15
    .line 16
    iput-object p8, p0, La/bm40;->g:Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    iput-object p9, p0, La/bm40;->h:La/mm40;

    .line 19
    .line 20
    iput p10, p0, La/bm40;->i:F

    .line 21
    .line 22
    iput-boolean p11, p0, La/bm40;->j:Z

    .line 23
    .line 24
    iput-object p12, p0, La/bm40;->k:La/yjj0;

    .line 25
    .line 26
    iput-wide p13, p0, La/bm40;->l:J

    .line 27
    .line 28
    move-wide p1, p15

    .line 29
    iput-wide p1, p0, La/bm40;->m:J

    .line 30
    .line 31
    move-object/from16 p1, p17

    .line 32
    .line 33
    iput-object p1, p0, La/bm40;->n:Lkotlin/jvm/functions/Function2;

    .line 34
    .line 35
    move-object/from16 p1, p18

    .line 36
    .line 37
    iput-object p1, p0, La/bm40;->o:Lkotlin/jvm/functions/Function2;

    .line 38
    .line 39
    move-object/from16 p1, p19

    .line 40
    .line 41
    iput-object p1, p0, La/bm40;->p:La/ugd;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    check-cast v5, La/fet;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    and-int/lit8 v2, v1, 0x3

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v7, 0x1

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v7

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v4

    .line 25
    :goto_0
    and-int/2addr v1, v7

    .line 26
    invoke-virtual {v5, v1, v2}, La/fet;->U(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_6

    .line 31
    .line 32
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 33
    .line 34
    invoke-static {v1}, La/o050;->P(La/mm40;)La/mm40;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    sget-object v3, La/ukd;->a:La/cl5;

    .line 43
    .line 44
    if-ne v2, v3, :cond_1

    .line 45
    .line 46
    new-instance v2, La/da40;

    .line 47
    .line 48
    const/4 v3, 0x7

    .line 49
    invoke-direct {v2, v3}, La/da40;-><init>(B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 56
    .line 57
    invoke-static {v1, v4, v2}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    sget-object v2, La/gqw0;->a:La/zx7;

    .line 62
    .line 63
    invoke-static {v2, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v5}, La/e3c;->x(La/fet;)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 72
    .line 73
    .line 74
    move-result-object v6

    .line 75
    invoke-static {v5, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 80
    .line 81
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v5}, La/fet;->i0()V

    .line 85
    .line 86
    .line 87
    iget-boolean v8, v5, La/fet;->S:Z

    .line 88
    .line 89
    if-eqz v8, :cond_2

    .line 90
    .line 91
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 92
    .line 93
    invoke-virtual {v5, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    invoke-virtual {v5}, La/fet;->r0()V

    .line 98
    .line 99
    .line 100
    :goto_1
    sget-object v8, La/gqw0;->x:La/shd;

    .line 101
    .line 102
    invoke-static {v5, v2, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 103
    .line 104
    .line 105
    sget-object v2, La/gqw0;->w:La/shd;

    .line 106
    .line 107
    invoke-static {v5, v6, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 108
    .line 109
    .line 110
    sget-object v2, La/gqw0;->y:La/shd;

    .line 111
    .line 112
    iget-boolean v6, v5, La/fet;->S:Z

    .line 113
    .line 114
    if-nez v6, :cond_3

    .line 115
    .line 116
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v8

    .line 124
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    if-nez v6, :cond_4

    .line 129
    .line 130
    :cond_3
    invoke-static {v3, v5, v3, v2}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 131
    .line 132
    .line 133
    :cond_4
    sget-object v2, La/gqw0;->v:La/shd;

    .line 134
    .line 135
    invoke-static {v5, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 136
    .line 137
    .line 138
    iget-object v8, v0, La/bm40;->c:La/xpj0;

    .line 139
    .line 140
    iget-object v1, v8, La/xpj0;->e:La/qv2;

    .line 141
    .line 142
    iget-object v1, v1, La/qv2;->k:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v1, La/zbk;

    .line 145
    .line 146
    invoke-virtual {v1}, La/zbk;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    check-cast v1, La/ypj0;

    .line 151
    .line 152
    sget-object v2, La/ypj0;->a:La/ypj0;

    .line 153
    .line 154
    if-eq v1, v2, :cond_5

    .line 155
    .line 156
    move v4, v7

    .line 157
    :cond_5
    iget-object v1, v0, La/bm40;->d:La/em40;

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    const/4 v6, 0x0

    .line 163
    iget-wide v1, v0, La/bm40;->a:J

    .line 164
    .line 165
    iget-object v3, v0, La/bm40;->b:Lkotlin/jvm/functions/Function0;

    .line 166
    .line 167
    invoke-static/range {v1 .. v6}, La/dm40;->c(JLkotlin/jvm/functions/Function0;ZLa/fet;I)V

    .line 168
    .line 169
    .line 170
    move-object v2, v3

    .line 171
    move-object/from16 v17, v5

    .line 172
    .line 173
    const/16 v18, 0x46

    .line 174
    .line 175
    iget-object v1, v0, La/bm40;->e:La/t33;

    .line 176
    .line 177
    move-object v3, v1

    .line 178
    iget-object v1, v0, La/bm40;->f:La/vne;

    .line 179
    .line 180
    move-object v4, v3

    .line 181
    iget-object v3, v0, La/bm40;->g:Lkotlin/jvm/functions/Function1;

    .line 182
    .line 183
    move-object v5, v4

    .line 184
    iget-object v4, v0, La/bm40;->h:La/mm40;

    .line 185
    .line 186
    iget v6, v0, La/bm40;->i:F

    .line 187
    .line 188
    move v9, v7

    .line 189
    iget-boolean v7, v0, La/bm40;->j:Z

    .line 190
    .line 191
    move-object v10, v5

    .line 192
    move-object v5, v8

    .line 193
    iget-object v8, v0, La/bm40;->k:La/yjj0;

    .line 194
    .line 195
    move v11, v9

    .line 196
    move-object v12, v10

    .line 197
    iget-wide v9, v0, La/bm40;->l:J

    .line 198
    .line 199
    move v13, v11

    .line 200
    move-object v14, v12

    .line 201
    iget-wide v11, v0, La/bm40;->m:J

    .line 202
    .line 203
    move v15, v13

    .line 204
    const/4 v13, 0x0

    .line 205
    move-object/from16 v16, v14

    .line 206
    .line 207
    iget-object v14, v0, La/bm40;->n:Lkotlin/jvm/functions/Function2;

    .line 208
    .line 209
    move/from16 v19, v15

    .line 210
    .line 211
    iget-object v15, v0, La/bm40;->o:Lkotlin/jvm/functions/Function2;

    .line 212
    .line 213
    iget-object v0, v0, La/bm40;->p:La/ugd;

    .line 214
    .line 215
    move-object/from16 v20, v16

    .line 216
    .line 217
    move-object/from16 v16, v0

    .line 218
    .line 219
    move-object/from16 v0, v20

    .line 220
    .line 221
    invoke-static/range {v0 .. v18}, La/dm40;->b(La/t33;La/vne;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/mm40;La/xpj0;FZLa/yjj0;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/ugd;La/fet;I)V

    .line 222
    .line 223
    .line 224
    move-object/from16 v5, v17

    .line 225
    .line 226
    const/4 v13, 0x1

    .line 227
    invoke-virtual {v5, v13}, La/fet;->r(Z)V

    .line 228
    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_6
    invoke-virtual {v5}, La/fet;->X()V

    .line 232
    .line 233
    .line 234
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    return-object v0
.end method
