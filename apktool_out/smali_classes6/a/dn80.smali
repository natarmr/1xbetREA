.class public final synthetic La/dn80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/xcp0;

.field public final synthetic d:La/w6n;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/xcp0;La/w6n;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/dn80;->a:B

    iput-object p1, p0, La/dn80;->b:La/mm40;

    iput-object p2, p0, La/dn80;->c:La/xcp0;

    iput-object p3, p0, La/dn80;->d:La/w6n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/dn80;->a:B

    .line 2
    .line 3
    sget-object v1, La/e7z;->u1:La/pcy;

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    const/high16 v3, 0x40800000    # 4.0f

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-object v7, p0, La/dn80;->d:La/w6n;

    .line 13
    .line 14
    iget-object v8, p0, La/dn80;->c:La/xcp0;

    .line 15
    .line 16
    iget-object p0, p0, La/dn80;->b:La/mm40;

    .line 17
    .line 18
    check-cast p1, La/fet;

    .line 19
    .line 20
    check-cast p2, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    packed-switch v0, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    and-int/lit8 v0, p2, 0x3

    .line 30
    .line 31
    if-eq v0, v4, :cond_0

    .line 32
    .line 33
    move v0, v5

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v0, v6

    .line 36
    :goto_0
    and-int/2addr p2, v5

    .line 37
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    sget-object p2, La/qmk;->a:La/zcl;

    .line 44
    .line 45
    new-instance p2, La/qw3;

    .line 46
    .line 47
    new-instance v0, La/jf4;

    .line 48
    .line 49
    invoke-direct {v0, v2}, La/jf4;-><init>(B)V

    .line 50
    .line 51
    .line 52
    invoke-direct {p2, v3, v5, v0}, La/qw3;-><init>(FZLa/rw3;)V

    .line 53
    .line 54
    .line 55
    sget-object v0, La/gqw0;->j:La/yx7;

    .line 56
    .line 57
    invoke-static {p2, v0, p1, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    iget-wide v2, p1, La/fet;->T:J

    .line 62
    .line 63
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {p1, p0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    sget-object v3, La/mkd;->c0:La/gqw0;

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, La/fet;->i0()V

    .line 81
    .line 82
    .line 83
    iget-boolean v3, p1, La/fet;->S:Z

    .line 84
    .line 85
    if-eqz v3, :cond_1

    .line 86
    .line 87
    invoke-virtual {p1, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-virtual {p1}, La/fet;->r0()V

    .line 92
    .line 93
    .line 94
    :goto_1
    sget-object v1, La/gqw0;->x:La/shd;

    .line 95
    .line 96
    invoke-static {p1, p2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 97
    .line 98
    .line 99
    sget-object p2, La/gqw0;->w:La/shd;

    .line 100
    .line 101
    invoke-static {p1, v2, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    sget-object v0, La/gqw0;->y:La/shd;

    .line 109
    .line 110
    invoke-static {p1, p2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 111
    .line 112
    .line 113
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 114
    .line 115
    .line 116
    sget-object p2, La/gqw0;->v:La/shd;

    .line 117
    .line 118
    invoke-static {p1, p0, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 119
    .line 120
    .line 121
    check-cast v8, La/tcp0;

    .line 122
    .line 123
    iget-object p0, v8, La/tcp0;->a:La/d5a0;

    .line 124
    .line 125
    iget-object p2, v8, La/tcp0;->b:La/d5a0;

    .line 126
    .line 127
    invoke-static {p0, p2, v7, p1}, La/g8x;->l(La/d5a0;La/d5a0;La/w6n;La/fet;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v5}, La/fet;->r(Z)V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_2
    invoke-virtual {p1}, La/fet;->X()V

    .line 135
    .line 136
    .line 137
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_0
    and-int/lit8 v0, p2, 0x3

    .line 141
    .line 142
    if-eq v0, v4, :cond_3

    .line 143
    .line 144
    move v0, v5

    .line 145
    goto :goto_3

    .line 146
    :cond_3
    move v0, v6

    .line 147
    :goto_3
    and-int/2addr p2, v5

    .line 148
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    if-eqz p2, :cond_5

    .line 153
    .line 154
    sget-object p2, La/qmk;->a:La/zcl;

    .line 155
    .line 156
    new-instance p2, La/qw3;

    .line 157
    .line 158
    new-instance v0, La/jf4;

    .line 159
    .line 160
    invoke-direct {v0, v2}, La/jf4;-><init>(B)V

    .line 161
    .line 162
    .line 163
    invoke-direct {p2, v3, v5, v0}, La/qw3;-><init>(FZLa/rw3;)V

    .line 164
    .line 165
    .line 166
    sget-object v0, La/gqw0;->j:La/yx7;

    .line 167
    .line 168
    invoke-static {p2, v0, p1, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    iget-wide v2, p1, La/fet;->T:J

    .line 173
    .line 174
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-static {p1, p0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    sget-object v3, La/mkd;->c0:La/gqw0;

    .line 187
    .line 188
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, La/fet;->i0()V

    .line 192
    .line 193
    .line 194
    iget-boolean v3, p1, La/fet;->S:Z

    .line 195
    .line 196
    if-eqz v3, :cond_4

    .line 197
    .line 198
    invoke-virtual {p1, v1}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 199
    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_4
    invoke-virtual {p1}, La/fet;->r0()V

    .line 203
    .line 204
    .line 205
    :goto_4
    sget-object v1, La/gqw0;->x:La/shd;

    .line 206
    .line 207
    invoke-static {p1, p2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 208
    .line 209
    .line 210
    sget-object p2, La/gqw0;->w:La/shd;

    .line 211
    .line 212
    invoke-static {p1, v2, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object p2

    .line 219
    sget-object v0, La/gqw0;->y:La/shd;

    .line 220
    .line 221
    invoke-static {p1, p2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 222
    .line 223
    .line 224
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 225
    .line 226
    .line 227
    sget-object p2, La/gqw0;->v:La/shd;

    .line 228
    .line 229
    invoke-static {p1, p0, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 230
    .line 231
    .line 232
    check-cast v8, La/qcp0;

    .line 233
    .line 234
    iget-object p0, v8, La/qcp0;->b:La/d5a0;

    .line 235
    .line 236
    iget-object p2, v8, La/qcp0;->c:La/d5a0;

    .line 237
    .line 238
    invoke-static {p0, p2, v7, p1}, La/g8x;->l(La/d5a0;La/d5a0;La/w6n;La/fet;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1, v5}, La/fet;->r(Z)V

    .line 242
    .line 243
    .line 244
    goto :goto_5

    .line 245
    :cond_5
    invoke-virtual {p1}, La/fet;->X()V

    .line 246
    .line 247
    .line 248
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object p0

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
