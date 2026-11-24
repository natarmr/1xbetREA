.class public final synthetic La/ugv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/pz40;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/pz40;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ugv;->a:B

    iput-object p1, p0, La/ugv;->b:La/mm40;

    iput-object p2, p0, La/ugv;->c:La/pz40;

    iput-object p3, p0, La/ugv;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/pz40;Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/ugv;->a:B

    iput-object p1, p0, La/ugv;->b:La/mm40;

    iput-object p2, p0, La/ugv;->c:La/pz40;

    iput-object p3, p0, La/ugv;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/ugv;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, La/ugv;->d:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    iget-object v5, p0, La/ugv;->c:La/pz40;

    .line 9
    .line 10
    iget-object p0, p0, La/ugv;->b:La/mm40;

    .line 11
    .line 12
    check-cast p1, La/fet;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v3}, La/x8x;->L(I)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-static {p0, v5, v4, p1, p2}, La/ktt0;->f(La/mm40;La/pz40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-static {v3}, La/x8x;->L(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-static {p0, v5, v4, p1, p2}, La/jtm0;->i(La/mm40;La/pz40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v3}, La/x8x;->L(I)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    invoke-static {p0, v5, v4, p1, p2}, La/w9x;->h(La/mm40;La/pz40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    and-int/lit8 v0, p2, 0x3

    .line 63
    .line 64
    if-eq v0, v2, :cond_0

    .line 65
    .line 66
    move v0, v3

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    move v0, v1

    .line 69
    :goto_0
    and-int/2addr p2, v3

    .line 70
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-eqz p2, :cond_3

    .line 75
    .line 76
    sget-object p2, La/qmk;->a:La/zcl;

    .line 77
    .line 78
    new-instance p2, La/qw3;

    .line 79
    .line 80
    new-instance v0, La/jf4;

    .line 81
    .line 82
    const/16 v2, 0xe

    .line 83
    .line 84
    invoke-direct {v0, v2}, La/jf4;-><init>(B)V

    .line 85
    .line 86
    .line 87
    const/high16 v2, 0x41000000    # 8.0f

    .line 88
    .line 89
    invoke-direct {p2, v2, v3, v0}, La/qw3;-><init>(FZLa/rw3;)V

    .line 90
    .line 91
    .line 92
    invoke-static {p0}, La/hp4;->B(La/mm40;)La/mm40;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    sget-object v0, La/gqw0;->m:La/xx7;

    .line 97
    .line 98
    invoke-static {p2, v0, p1, v1}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    iget-wide v6, p1, La/fet;->T:J

    .line 103
    .line 104
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-static {p1, p0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 117
    .line 118
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, La/fet;->i0()V

    .line 122
    .line 123
    .line 124
    iget-boolean v6, p1, La/fet;->S:Z

    .line 125
    .line 126
    if-eqz v6, :cond_1

    .line 127
    .line 128
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 129
    .line 130
    invoke-virtual {p1, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_1
    invoke-virtual {p1}, La/fet;->r0()V

    .line 135
    .line 136
    .line 137
    :goto_1
    sget-object v6, La/gqw0;->x:La/shd;

    .line 138
    .line 139
    invoke-static {p1, p2, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 140
    .line 141
    .line 142
    sget-object p2, La/gqw0;->w:La/shd;

    .line 143
    .line 144
    invoke-static {p1, v2, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 145
    .line 146
    .line 147
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    sget-object v0, La/gqw0;->y:La/shd;

    .line 152
    .line 153
    invoke-static {p1, p2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 154
    .line 155
    .line 156
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 157
    .line 158
    .line 159
    sget-object p2, La/gqw0;->v:La/shd;

    .line 160
    .line 161
    invoke-static {p1, p0, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 162
    .line 163
    .line 164
    const p0, 0x12f8afe4

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, p0}, La/fet;->e0(I)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    check-cast p0, Ljava/lang/Iterable;

    .line 175
    .line 176
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 181
    .line 182
    .line 183
    move-result p2

    .line 184
    if-eqz p2, :cond_2

    .line 185
    .line 186
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p2

    .line 190
    check-cast p2, La/hzy;

    .line 191
    .line 192
    const/4 v0, 0x0

    .line 193
    invoke-static {v0, p2, v4, p1, v1}, La/gzy;->a(La/mm40;La/hzy;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_2
    invoke-virtual {p1, v1}, La/fet;->r(Z)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1, v3}, La/fet;->r(Z)V

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 205
    .line 206
    .line 207
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    return-object p0

    .line 210
    :pswitch_3
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result p2

    .line 214
    and-int/lit8 v0, p2, 0x3

    .line 215
    .line 216
    if-eq v0, v2, :cond_4

    .line 217
    .line 218
    move v1, v3

    .line 219
    :cond_4
    and-int/2addr p2, v3

    .line 220
    invoke-virtual {p1, p2, v1}, La/fet;->U(IZ)Z

    .line 221
    .line 222
    .line 223
    move-result p2

    .line 224
    if-eqz p2, :cond_5

    .line 225
    .line 226
    new-instance p2, La/ugv;

    .line 227
    .line 228
    invoke-direct {p2, p0, v5, v4, v2}, La/ugv;-><init>(La/mm40;La/pz40;Lkotlin/jvm/functions/Function1;B)V

    .line 229
    .line 230
    .line 231
    const p0, -0x4a94be31

    .line 232
    .line 233
    .line 234
    invoke-static {p0, p2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    const/4 p2, 0x6

    .line 239
    invoke-static {p0, p1, p2}, La/kr00;->a(La/ugd;La/fet;I)V

    .line 240
    .line 241
    .line 242
    goto :goto_4

    .line 243
    :cond_5
    invoke-virtual {p1}, La/fet;->X()V

    .line 244
    .line 245
    .line 246
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object p0

    .line 249
    :pswitch_4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    const/4 p2, 0x7

    .line 253
    invoke-static {p2}, La/x8x;->L(I)I

    .line 254
    .line 255
    .line 256
    move-result p2

    .line 257
    invoke-static {p0, v5, v4, p1, p2}, La/vic;->n(La/mm40;La/pz40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 258
    .line 259
    .line 260
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object p0

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
