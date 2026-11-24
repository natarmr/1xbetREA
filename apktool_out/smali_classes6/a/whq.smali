.class public final synthetic La/whq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Lkotlin/jvm/functions/Function0;

.field public final synthetic c:La/agk0;

.field public final synthetic d:F

.field public final synthetic e:J

.field public final synthetic f:La/cgk0;


# direct methods
.method public synthetic constructor <init>(JLkotlin/jvm/functions/Function0;La/agk0;FJLa/cgk0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/whq;->a:J

    iput-object p3, p0, La/whq;->b:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, La/whq;->c:La/agk0;

    iput p5, p0, La/whq;->d:F

    iput-wide p6, p0, La/whq;->e:J

    iput-object p8, p0, La/whq;->f:La/cgk0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

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
    check-cast v1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

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
    const/4 v8, 0x1

    .line 20
    if-eq v2, v3, :cond_0

    .line 21
    .line 22
    move v2, v8

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v2, v4

    .line 25
    :goto_0
    and-int/2addr v1, v8

    .line 26
    invoke-virtual {v5, v1, v2}, La/fet;->U(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_5

    .line 31
    .line 32
    sget-object v1, La/qmk;->a:La/zcl;

    .line 33
    .line 34
    const/4 v13, 0x0

    .line 35
    const/16 v14, 0xb

    .line 36
    .line 37
    sget-object v9, La/jm40;->b:La/jm40;

    .line 38
    .line 39
    const/4 v10, 0x0

    .line 40
    const/4 v11, 0x0

    .line 41
    const/high16 v12, 0x41000000    # 8.0f

    .line 42
    .line 43
    invoke-static/range {v9 .. v14}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/high16 v2, 0x42000000    # 32.0f

    .line 48
    .line 49
    invoke-static {v1, v2}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const/high16 v2, 0x41200000    # 10.0f

    .line 54
    .line 55
    invoke-static {v2}, La/vgg0;->a(F)La/ugg0;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v1, v2}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    sget-object v2, La/jd8;->n:La/ljc;

    .line 64
    .line 65
    iget-wide v6, v0, La/whq;->a:J

    .line 66
    .line 67
    invoke-static {v1, v6, v7, v2}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    const-string v2, "UPDATE_ACCOUNT_BTN"

    .line 72
    .line 73
    invoke-static {v1, v2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 74
    .line 75
    .line 76
    move-result-object v10

    .line 77
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    sget-object v2, La/ukd;->a:La/cl5;

    .line 82
    .line 83
    if-ne v1, v2, :cond_1

    .line 84
    .line 85
    invoke-static {v5}, La/dw9;->j(La/fet;)La/gy40;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :cond_1
    move-object v11, v1

    .line 90
    check-cast v11, La/gy40;

    .line 91
    .line 92
    iget-object v1, v0, La/whq;->b:Lkotlin/jvm/functions/Function0;

    .line 93
    .line 94
    invoke-virtual {v5, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    if-nez v3, :cond_2

    .line 103
    .line 104
    if-ne v6, v2, :cond_3

    .line 105
    .line 106
    :cond_2
    new-instance v6, La/zhq;

    .line 107
    .line 108
    iget-object v2, v0, La/whq;->c:La/agk0;

    .line 109
    .line 110
    invoke-direct {v6, v1, v2, v4}, La/zhq;-><init>(Lkotlin/jvm/functions/Function0;La/agk0;B)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_3
    move-object v15, v6

    .line 117
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 118
    .line 119
    const/16 v16, 0x1c

    .line 120
    .line 121
    const/4 v12, 0x0

    .line 122
    const/4 v13, 0x0

    .line 123
    const/4 v14, 0x0

    .line 124
    invoke-static/range {v10 .. v16}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    sget-object v2, La/gqw0;->e:La/zx7;

    .line 129
    .line 130
    invoke-static {v2, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    iget-wide v3, v5, La/fet;->T:J

    .line 135
    .line 136
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    invoke-static {v5, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 149
    .line 150
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v5}, La/fet;->i0()V

    .line 154
    .line 155
    .line 156
    iget-boolean v6, v5, La/fet;->S:Z

    .line 157
    .line 158
    if-eqz v6, :cond_4

    .line 159
    .line 160
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 161
    .line 162
    invoke-virtual {v5, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_4
    invoke-virtual {v5}, La/fet;->r0()V

    .line 167
    .line 168
    .line 169
    :goto_1
    sget-object v6, La/gqw0;->x:La/shd;

    .line 170
    .line 171
    invoke-static {v5, v2, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 172
    .line 173
    .line 174
    sget-object v2, La/gqw0;->w:La/shd;

    .line 175
    .line 176
    invoke-static {v5, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 177
    .line 178
    .line 179
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    sget-object v3, La/gqw0;->y:La/shd;

    .line 184
    .line 185
    invoke-static {v5, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v5}, La/jpm0;->n(La/fet;)V

    .line 189
    .line 190
    .line 191
    sget-object v2, La/gqw0;->v:La/shd;

    .line 192
    .line 193
    invoke-static {v5, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 194
    .line 195
    .line 196
    const/high16 v1, 0x41a00000    # 20.0f

    .line 197
    .line 198
    invoke-static {v9, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    iget v2, v0, La/whq;->d:F

    .line 203
    .line 204
    invoke-static {v1, v2}, La/a8k0;->I(La/mm40;F)La/mm40;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    iget-object v1, v0, La/whq;->f:La/cgk0;

    .line 209
    .line 210
    invoke-virtual {v1}, La/cgk0;->l()I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    const/4 v3, 0x6

    .line 215
    invoke-static {v1, v3, v5}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    const/16 v6, 0x30

    .line 220
    .line 221
    const/4 v7, 0x0

    .line 222
    move-object v3, v1

    .line 223
    const/4 v1, 0x0

    .line 224
    iget-wide v9, v0, La/whq;->e:J

    .line 225
    .line 226
    move-object v0, v3

    .line 227
    move-wide v3, v9

    .line 228
    invoke-static/range {v0 .. v7}, La/dww;->b(La/r2x;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v5, v8}, La/fet;->r(Z)V

    .line 232
    .line 233
    .line 234
    goto :goto_2

    .line 235
    :cond_5
    invoke-virtual {v5}, La/fet;->X()V

    .line 236
    .line 237
    .line 238
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 239
    .line 240
    return-object v0
.end method
