.class public final synthetic La/tvm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/uum;

.field public final synthetic d:La/uum;

.field public final synthetic e:La/a2m;

.field public final synthetic f:Z


# direct methods
.method public synthetic constructor <init>(La/mm40;La/uum;La/uum;La/a2m;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/tvm;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/tvm;->b:La/mm40;

    iput-object p2, p0, La/tvm;->c:La/uum;

    iput-object p3, p0, La/tvm;->d:La/uum;

    iput-object p4, p0, La/tvm;->e:La/a2m;

    iput-boolean p5, p0, La/tvm;->f:Z

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/uum;La/uum;La/a2m;ZI)V
    .locals 0

    .line 2
    const/4 p6, 0x1

    iput-byte p6, p0, La/tvm;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/tvm;->b:La/mm40;

    iput-object p2, p0, La/tvm;->c:La/uum;

    iput-object p3, p0, La/tvm;->d:La/uum;

    iput-object p4, p0, La/tvm;->e:La/a2m;

    iput-boolean p5, p0, La/tvm;->f:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/tvm;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, La/fet;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x7

    .line 15
    invoke-static {p1}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    iget-object v1, p0, La/tvm;->b:La/mm40;

    .line 20
    .line 21
    iget-object v2, p0, La/tvm;->c:La/uum;

    .line 22
    .line 23
    iget-object v3, p0, La/tvm;->d:La/uum;

    .line 24
    .line 25
    iget-object v4, p0, La/tvm;->e:La/a2m;

    .line 26
    .line 27
    iget-boolean v5, p0, La/tvm;->f:Z

    .line 28
    .line 29
    invoke-static/range {v1 .. v7}, La/fxb;->a(La/mm40;La/uum;La/uum;La/a2m;ZLa/fet;I)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    move-object v5, p1

    .line 36
    check-cast v5, La/fet;

    .line 37
    .line 38
    check-cast p2, Ljava/lang/Integer;

    .line 39
    .line 40
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    and-int/lit8 p2, p1, 0x3

    .line 45
    .line 46
    const/4 v7, 0x1

    .line 47
    const/4 v8, 0x0

    .line 48
    const/4 v0, 0x2

    .line 49
    if-eq p2, v0, :cond_0

    .line 50
    .line 51
    move p2, v7

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move p2, v8

    .line 54
    :goto_0
    and-int/2addr p1, v7

    .line 55
    invoke-virtual {v5, p1, p2}, La/fet;->U(IZ)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_6

    .line 60
    .line 61
    iget-object p1, p0, La/tvm;->b:La/mm40;

    .line 62
    .line 63
    const/high16 p2, 0x3f800000    # 1.0f

    .line 64
    .line 65
    invoke-static {p1, p2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    sget-object v1, La/qmk;->a:La/zcl;

    .line 70
    .line 71
    const/high16 v1, 0x42a00000    # 80.0f

    .line 72
    .line 73
    invoke-static {p1, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const/high16 v1, 0x41400000    # 12.0f

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    invoke-static {p1, v1, v2, v0}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string v0, "MIDDLE_ROW_V3"

    .line 85
    .line 86
    invoke-static {p1, v0}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    sget-object v0, La/uc9;->a:La/lw3;

    .line 91
    .line 92
    sget-object v1, La/gqw0;->j:La/yx7;

    .line 93
    .line 94
    invoke-static {v0, v1, v5, v8}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget-wide v1, v5, La/fet;->T:J

    .line 99
    .line 100
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-static {v5, p1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    sget-object v3, La/mkd;->c0:La/gqw0;

    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v5}, La/fet;->i0()V

    .line 118
    .line 119
    .line 120
    iget-boolean v3, v5, La/fet;->S:Z

    .line 121
    .line 122
    if-eqz v3, :cond_1

    .line 123
    .line 124
    sget-object v3, La/e7z;->u1:La/pcy;

    .line 125
    .line 126
    invoke-virtual {v5, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_1
    invoke-virtual {v5}, La/fet;->r0()V

    .line 131
    .line 132
    .line 133
    :goto_1
    sget-object v3, La/gqw0;->x:La/shd;

    .line 134
    .line 135
    invoke-static {v5, v0, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 136
    .line 137
    .line 138
    sget-object v0, La/gqw0;->w:La/shd;

    .line 139
    .line 140
    invoke-static {v5, v2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    sget-object v1, La/gqw0;->y:La/shd;

    .line 148
    .line 149
    invoke-static {v5, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 150
    .line 151
    .line 152
    invoke-static {v5}, La/jpm0;->n(La/fet;)V

    .line 153
    .line 154
    .line 155
    sget-object v0, La/gqw0;->v:La/shd;

    .line 156
    .line 157
    invoke-static {v5, p1, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 158
    .line 159
    .line 160
    float-to-double v0, p2

    .line 161
    const-wide/16 v9, 0x0

    .line 162
    .line 163
    cmpl-double p1, v0, v9

    .line 164
    .line 165
    const-string v11, "invalid weight; must be greater than zero"

    .line 166
    .line 167
    if-lez p1, :cond_2

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_2
    invoke-static {v11}, La/vcx;->a(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    :goto_2
    new-instance p1, La/x7z;

    .line 174
    .line 175
    const v12, 0x7f7fffff    # Float.MAX_VALUE

    .line 176
    .line 177
    .line 178
    cmpl-float v0, p2, v12

    .line 179
    .line 180
    if-lez v0, :cond_3

    .line 181
    .line 182
    move v0, v12

    .line 183
    goto :goto_3

    .line 184
    :cond_3
    move v0, p2

    .line 185
    :goto_3
    invoke-direct {p1, v0, v7}, La/x7z;-><init>(FZ)V

    .line 186
    .line 187
    .line 188
    const-string v0, "FIRST_OPPONENT_CONTAINER_V3"

    .line 189
    .line 190
    invoke-static {p1, v0}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    iget-object v1, p0, La/tvm;->c:La/uum;

    .line 195
    .line 196
    invoke-static {p1, v1, v5, v8}, La/fxb;->v(La/mm40;La/uum;La/fet;I)V

    .line 197
    .line 198
    .line 199
    const-string p1, "CENTER_CONTAINER_V3"

    .line 200
    .line 201
    sget-object v0, La/jm40;->b:La/jm40;

    .line 202
    .line 203
    invoke-static {v0, p1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    const/4 v6, 0x6

    .line 208
    iget-object v2, p0, La/tvm;->d:La/uum;

    .line 209
    .line 210
    iget-object v3, p0, La/tvm;->e:La/a2m;

    .line 211
    .line 212
    iget-boolean v4, p0, La/tvm;->f:Z

    .line 213
    .line 214
    invoke-static/range {v0 .. v6}, La/fxb;->a(La/mm40;La/uum;La/uum;La/a2m;ZLa/fet;I)V

    .line 215
    .line 216
    .line 217
    float-to-double p0, p2

    .line 218
    cmpl-double p0, p0, v9

    .line 219
    .line 220
    if-lez p0, :cond_4

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_4
    invoke-static {v11}, La/vcx;->a(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    :goto_4
    new-instance p0, La/x7z;

    .line 227
    .line 228
    cmpl-float p1, p2, v12

    .line 229
    .line 230
    if-lez p1, :cond_5

    .line 231
    .line 232
    move p2, v12

    .line 233
    :cond_5
    invoke-direct {p0, p2, v7}, La/x7z;-><init>(FZ)V

    .line 234
    .line 235
    .line 236
    const-string p1, "SECOND_OPPONENT_CONTAINER_V3"

    .line 237
    .line 238
    invoke-static {p0, p1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    invoke-static {p0, v2, v5, v8}, La/fxb;->v(La/mm40;La/uum;La/fet;I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5, v7}, La/fet;->r(Z)V

    .line 246
    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_6
    invoke-virtual {v5}, La/fet;->X()V

    .line 250
    .line 251
    .line 252
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 253
    .line 254
    return-object p0

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
