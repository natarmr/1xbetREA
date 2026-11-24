.class public final synthetic La/rbd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w2d;

.field public final synthetic c:La/z77;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/w2d;La/z77;Lkotlin/jvm/functions/Function1;La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/rbd;->a:B

    iput-object p1, p0, La/rbd;->b:La/w2d;

    iput-object p2, p0, La/rbd;->c:La/z77;

    iput-object p3, p0, La/rbd;->d:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, La/rbd;->e:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/rbd;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget-object v2, p0, La/rbd;->e:La/l7m0;

    .line 5
    .line 6
    iget-object v3, p0, La/rbd;->d:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    iget-object v4, p0, La/rbd;->c:La/z77;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v6, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v10, p1

    .line 16
    check-cast v10, La/fet;

    .line 17
    .line 18
    check-cast p2, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    and-int/lit8 p2, p1, 0x3

    .line 25
    .line 26
    if-eq p2, v1, :cond_0

    .line 27
    .line 28
    move p2, v6

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move p2, v5

    .line 31
    :goto_0
    and-int/2addr p1, v6

    .line 32
    invoke-virtual {v10, p1, p2}, La/fet;->U(IZ)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    sget-object p1, La/uc9;->c:La/mw3;

    .line 39
    .line 40
    sget-object p2, La/gqw0;->m:La/xx7;

    .line 41
    .line 42
    invoke-static {p1, p2, v10, v5}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-wide v0, v10, La/fet;->T:J

    .line 47
    .line 48
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    invoke-virtual {v10}, La/fet;->m()La/bh90;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sget-object v1, La/jm40;->b:La/jm40;

    .line 57
    .line 58
    invoke-static {v10, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v10}, La/fet;->i0()V

    .line 68
    .line 69
    .line 70
    iget-boolean v5, v10, La/fet;->S:Z

    .line 71
    .line 72
    if-eqz v5, :cond_1

    .line 73
    .line 74
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 75
    .line 76
    invoke-virtual {v10, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    invoke-virtual {v10}, La/fet;->r0()V

    .line 81
    .line 82
    .line 83
    :goto_1
    sget-object v5, La/gqw0;->x:La/shd;

    .line 84
    .line 85
    invoke-static {v10, p1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 86
    .line 87
    .line 88
    sget-object p1, La/gqw0;->w:La/shd;

    .line 89
    .line 90
    invoke-static {v10, v0, p1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 91
    .line 92
    .line 93
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    sget-object p2, La/gqw0;->y:La/shd;

    .line 98
    .line 99
    invoke-static {v10, p1, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v10}, La/jpm0;->n(La/fet;)V

    .line 103
    .line 104
    .line 105
    sget-object p1, La/gqw0;->v:La/shd;

    .line 106
    .line 107
    invoke-static {v10, v1, p1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 108
    .line 109
    .line 110
    new-instance p1, La/k57;

    .line 111
    .line 112
    const/4 p2, 0x3

    .line 113
    invoke-direct {p1, v4, v3, p2}, La/k57;-><init>(La/z77;Lkotlin/jvm/functions/Function1;B)V

    .line 114
    .line 115
    .line 116
    const p2, 0x29a26d8b

    .line 117
    .line 118
    .line 119
    invoke-static {p2, p1, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    new-instance p1, La/tbd;

    .line 124
    .line 125
    invoke-direct {p1, v4, v3, v2, v6}, La/tbd;-><init>(La/z77;Lkotlin/jvm/functions/Function1;La/l7m0;B)V

    .line 126
    .line 127
    .line 128
    const p2, -0x25ce7956

    .line 129
    .line 130
    .line 131
    invoke-static {p2, p1, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    const/16 v12, 0xdc0

    .line 136
    .line 137
    const/4 v7, 0x0

    .line 138
    iget-object v8, p0, La/rbd;->b:La/w2d;

    .line 139
    .line 140
    move-object v11, v10

    .line 141
    move-object v10, p1

    .line 142
    invoke-static/range {v7 .. v12}, La/agc;->y(La/mm40;La/w2d;La/ugd;La/ugd;La/fet;I)V

    .line 143
    .line 144
    .line 145
    move-object v10, v11

    .line 146
    const/4 v11, 0x6

    .line 147
    const/4 v12, 0x6

    .line 148
    sget-object v7, La/zfi0;->a:La/zfi0;

    .line 149
    .line 150
    const/4 v8, 0x0

    .line 151
    const/4 v9, 0x0

    .line 152
    invoke-static/range {v7 .. v12}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v10, v6}, La/fet;->r(Z)V

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_2
    invoke-virtual {v10}, La/fet;->X()V

    .line 160
    .line 161
    .line 162
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    return-object p0

    .line 165
    :pswitch_0
    check-cast p1, La/fet;

    .line 166
    .line 167
    check-cast p2, Ljava/lang/Integer;

    .line 168
    .line 169
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    and-int/lit8 v0, p2, 0x3

    .line 174
    .line 175
    if-eq v0, v1, :cond_3

    .line 176
    .line 177
    move v0, v6

    .line 178
    goto :goto_3

    .line 179
    :cond_3
    move v0, v5

    .line 180
    :goto_3
    and-int/2addr p2, v6

    .line 181
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    if-eqz p2, :cond_4

    .line 186
    .line 187
    new-instance p2, La/k57;

    .line 188
    .line 189
    invoke-direct {p2, v4, v3, v6}, La/k57;-><init>(La/z77;Lkotlin/jvm/functions/Function1;B)V

    .line 190
    .line 191
    .line 192
    const v0, 0x33864826

    .line 193
    .line 194
    .line 195
    invoke-static {v0, p2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    new-instance v0, La/tbd;

    .line 200
    .line 201
    invoke-direct {v0, v4, v3, v2, v5}, La/tbd;-><init>(La/z77;Lkotlin/jvm/functions/Function1;La/l7m0;B)V

    .line 202
    .line 203
    .line 204
    const v1, -0x4f8dce3b

    .line 205
    .line 206
    .line 207
    invoke-static {v1, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    const/16 v5, 0xdc0

    .line 212
    .line 213
    const/4 v0, 0x0

    .line 214
    iget-object v1, p0, La/rbd;->b:La/w2d;

    .line 215
    .line 216
    move-object v4, p1

    .line 217
    move-object v2, p2

    .line 218
    invoke-static/range {v0 .. v5}, La/agc;->y(La/mm40;La/w2d;La/ugd;La/ugd;La/fet;I)V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_4
    move-object v4, p1

    .line 223
    invoke-virtual {v4}, La/fet;->X()V

    .line 224
    .line 225
    .line 226
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
