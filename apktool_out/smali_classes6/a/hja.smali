.class public final La/hja;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/ugd;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hja;->a:B

    iput-object p1, p0, La/hja;->b:La/ugd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/hja;->a:B

    .line 2
    .line 3
    sget-object v1, La/e7z;->u1:La/pcy;

    .line 4
    .line 5
    iget-object p0, p0, La/hja;->b:La/ugd;

    .line 6
    .line 7
    sget-object v2, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, La/fet;

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    and-int/lit8 v0, p2, 0x3

    .line 24
    .line 25
    if-eq v0, v3, :cond_0

    .line 26
    .line 27
    move v0, v4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v5

    .line 30
    :goto_0
    and-int/2addr p2, v4

    .line 31
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_4

    .line 36
    .line 37
    sget p2, La/gak0;->b:F

    .line 38
    .line 39
    add-float/2addr p2, p2

    .line 40
    sget v0, La/gak0;->c:F

    .line 41
    .line 42
    add-float/2addr v0, p2

    .line 43
    const/high16 p2, 0x42200000    # 40.0f

    .line 44
    .line 45
    invoke-static {v0, p2}, La/qbc;->i(FF)J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    invoke-static {v6, v7, v2}, La/o7k0;->o(JLa/mm40;)La/mm40;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    sget-object v0, La/gqw0;->e:La/zx7;

    .line 54
    .line 55
    invoke-static {v0, v5}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {p1}, La/e3c;->x(La/fet;)I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {p1, p2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 72
    .line 73
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, La/fet;->i0()V

    .line 77
    .line 78
    .line 79
    iget-boolean v6, p1, La/fet;->S:Z

    .line 80
    .line 81
    if-eqz v6, :cond_1

    .line 82
    .line 83
    invoke-virtual {p1, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    invoke-virtual {p1}, La/fet;->r0()V

    .line 88
    .line 89
    .line 90
    :goto_1
    sget-object v1, La/gqw0;->x:La/shd;

    .line 91
    .line 92
    invoke-static {p1, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 93
    .line 94
    .line 95
    sget-object v0, La/gqw0;->w:La/shd;

    .line 96
    .line 97
    invoke-static {p1, v3, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 98
    .line 99
    .line 100
    sget-object v0, La/gqw0;->y:La/shd;

    .line 101
    .line 102
    iget-boolean v1, p1, La/fet;->S:Z

    .line 103
    .line 104
    if-nez v1, :cond_2

    .line 105
    .line 106
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-nez v1, :cond_3

    .line 119
    .line 120
    :cond_2
    invoke-static {v2, p1, v2, v0}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 121
    .line 122
    .line 123
    :cond_3
    sget-object v0, La/gqw0;->v:La/shd;

    .line 124
    .line 125
    invoke-static {p1, p2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v5, p0, p1, v4}, La/twn;->v(ILa/ugd;La/fet;Z)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    invoke-virtual {p1}, La/fet;->X()V

    .line 133
    .line 134
    .line 135
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_0
    check-cast p1, La/fet;

    .line 139
    .line 140
    check-cast p2, Ljava/lang/Number;

    .line 141
    .line 142
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 143
    .line 144
    .line 145
    move-result p2

    .line 146
    and-int/lit8 v0, p2, 0x3

    .line 147
    .line 148
    if-eq v0, v3, :cond_5

    .line 149
    .line 150
    move v0, v4

    .line 151
    goto :goto_3

    .line 152
    :cond_5
    move v0, v5

    .line 153
    :goto_3
    and-int/2addr p2, v4

    .line 154
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    if-eqz p2, :cond_9

    .line 159
    .line 160
    sget-object p2, La/uc9;->c:La/mw3;

    .line 161
    .line 162
    sget-object v0, La/gqw0;->m:La/xx7;

    .line 163
    .line 164
    invoke-static {p2, v0, p1, v5}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    invoke-static {p1}, La/e3c;->x(La/fet;)I

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-static {p1, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 181
    .line 182
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, La/fet;->i0()V

    .line 186
    .line 187
    .line 188
    iget-boolean v5, p1, La/fet;->S:Z

    .line 189
    .line 190
    if-eqz v5, :cond_6

    .line 191
    .line 192
    invoke-virtual {p1, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_6
    invoke-virtual {p1}, La/fet;->r0()V

    .line 197
    .line 198
    .line 199
    :goto_4
    sget-object v1, La/gqw0;->x:La/shd;

    .line 200
    .line 201
    invoke-static {p1, p2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 202
    .line 203
    .line 204
    sget-object p2, La/gqw0;->w:La/shd;

    .line 205
    .line 206
    invoke-static {p1, v3, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 207
    .line 208
    .line 209
    sget-object p2, La/gqw0;->y:La/shd;

    .line 210
    .line 211
    iget-boolean v1, p1, La/fet;->S:Z

    .line 212
    .line 213
    if-nez v1, :cond_7

    .line 214
    .line 215
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-nez v1, :cond_8

    .line 228
    .line 229
    :cond_7
    invoke-static {v0, p1, v0, p2}, La/rw2;->t(ILa/fet;ILa/shd;)V

    .line 230
    .line 231
    .line 232
    :cond_8
    sget-object p2, La/gqw0;->v:La/shd;

    .line 233
    .line 234
    invoke-static {p1, v2, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 235
    .line 236
    .line 237
    sget-object p2, La/y5d;->a:La/y5d;

    .line 238
    .line 239
    const/4 v0, 0x6

    .line 240
    invoke-static {v0, p0, p2, p1, v4}, La/vqd;->t(ILa/ugd;La/y5d;La/fet;Z)V

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_9
    invoke-virtual {p1}, La/fet;->X()V

    .line 245
    .line 246
    .line 247
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 248
    .line 249
    return-object p0

    .line 250
    nop

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
