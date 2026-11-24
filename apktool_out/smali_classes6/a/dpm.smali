.class public final synthetic La/dpm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/jpm;

.field public final synthetic d:La/kpm;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/jpm;La/kpm;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/dpm;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dpm;->b:La/mm40;

    iput-object p2, p0, La/dpm;->c:La/jpm;

    iput-object p3, p0, La/dpm;->d:La/kpm;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/jpm;La/kpm;I)V
    .locals 0

    .line 2
    const/4 p4, 0x1

    iput-byte p4, p0, La/dpm;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dpm;->b:La/mm40;

    iput-object p2, p0, La/dpm;->c:La/jpm;

    iput-object p3, p0, La/dpm;->d:La/kpm;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/dpm;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/dpm;->b:La/mm40;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/fet;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, La/x8x;->L(I)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    iget-object v0, p0, La/dpm;->c:La/jpm;

    .line 21
    .line 22
    iget-object p0, p0, La/dpm;->d:La/kpm;

    .line 23
    .line 24
    invoke-static {v2, v0, p0, p1, p2}, La/e3c;->g(La/mm40;La/jpm;La/kpm;La/fet;I)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    move-object v7, p1

    .line 31
    check-cast v7, La/fet;

    .line 32
    .line 33
    check-cast p2, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    and-int/lit8 p2, p1, 0x3

    .line 40
    .line 41
    const/4 v0, 0x2

    .line 42
    const/4 v9, 0x0

    .line 43
    if-eq p2, v0, :cond_0

    .line 44
    .line 45
    move p2, v1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move p2, v9

    .line 48
    :goto_0
    and-int/2addr p1, v1

    .line 49
    invoke-virtual {v7, p1, p2}, La/fet;->U(IZ)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_6

    .line 54
    .line 55
    iget-object v3, p0, La/dpm;->c:La/jpm;

    .line 56
    .line 57
    iget-object p1, v3, La/jpm;->a:La/mm40;

    .line 58
    .line 59
    invoke-interface {v2, p1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    sget-object p2, La/gqw0;->e:La/zx7;

    .line 64
    .line 65
    invoke-static {p2, v9}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    iget-wide v4, v7, La/fet;->T:J

    .line 70
    .line 71
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-virtual {v7}, La/fet;->m()La/bh90;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {v7, p1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    sget-object v4, La/mkd;->c0:La/gqw0;

    .line 84
    .line 85
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v7}, La/fet;->i0()V

    .line 89
    .line 90
    .line 91
    iget-boolean v4, v7, La/fet;->S:Z

    .line 92
    .line 93
    if-eqz v4, :cond_1

    .line 94
    .line 95
    sget-object v4, La/e7z;->u1:La/pcy;

    .line 96
    .line 97
    invoke-virtual {v7, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    invoke-virtual {v7}, La/fet;->r0()V

    .line 102
    .line 103
    .line 104
    :goto_1
    sget-object v4, La/gqw0;->x:La/shd;

    .line 105
    .line 106
    invoke-static {v7, p2, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 107
    .line 108
    .line 109
    sget-object p2, La/gqw0;->w:La/shd;

    .line 110
    .line 111
    invoke-static {v7, v2, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    sget-object v0, La/gqw0;->y:La/shd;

    .line 119
    .line 120
    invoke-static {v7, p2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 121
    .line 122
    .line 123
    invoke-static {v7}, La/jpm0;->n(La/fet;)V

    .line 124
    .line 125
    .line 126
    sget-object p2, La/gqw0;->v:La/shd;

    .line 127
    .line 128
    invoke-static {v7, p1, p2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 129
    .line 130
    .line 131
    iget-object v4, p0, La/dpm;->d:La/kpm;

    .line 132
    .line 133
    iget-object p0, v4, La/kpm;->a:La/rpm;

    .line 134
    .line 135
    sget-object p1, La/npm;->a:La/npm;

    .line 136
    .line 137
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-nez p1, :cond_5

    .line 142
    .line 143
    sget-object p1, La/opm;->a:La/opm;

    .line 144
    .line 145
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p1

    .line 149
    if-eqz p1, :cond_2

    .line 150
    .line 151
    goto :goto_2

    .line 152
    :cond_2
    sget-object p1, La/ppm;->a:La/ppm;

    .line 153
    .line 154
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    if-eqz p1, :cond_3

    .line 159
    .line 160
    const p0, 0x666c17b7

    .line 161
    .line 162
    .line 163
    invoke-virtual {v7, p0}, La/fet;->e0(I)V

    .line 164
    .line 165
    .line 166
    sget-object v6, La/qmk;->f:La/zcl;

    .line 167
    .line 168
    const/4 v8, 0x0

    .line 169
    const/4 v2, 0x0

    .line 170
    const/high16 v5, 0x42200000    # 40.0f

    .line 171
    .line 172
    invoke-static/range {v2 .. v8}, La/e3c;->m(La/mm40;La/jpm;La/kpm;FLa/zcl;La/fet;I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v7, v9}, La/fet;->r(Z)V

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_3
    sget-object p1, La/qpm;->a:La/qpm;

    .line 180
    .line 181
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    if-eqz p0, :cond_4

    .line 186
    .line 187
    const p0, 0x666c3776

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7, p0}, La/fet;->e0(I)V

    .line 191
    .line 192
    .line 193
    sget-object v6, La/qmk;->e:La/zcl;

    .line 194
    .line 195
    const/4 v8, 0x0

    .line 196
    const/4 v2, 0x0

    .line 197
    const/high16 v5, 0x42000000    # 32.0f

    .line 198
    .line 199
    invoke-static/range {v2 .. v8}, La/e3c;->m(La/mm40;La/jpm;La/kpm;FLa/zcl;La/fet;I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v7, v9}, La/fet;->r(Z)V

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_4
    const p0, 0x666c0144

    .line 207
    .line 208
    .line 209
    invoke-static {p0, v7, v9}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    throw p0

    .line 214
    :cond_5
    :goto_2
    const p0, 0x666c0bf2

    .line 215
    .line 216
    .line 217
    invoke-virtual {v7, p0}, La/fet;->e0(I)V

    .line 218
    .line 219
    .line 220
    const/4 p0, 0x0

    .line 221
    invoke-static {p0, v3, v4, v7, v9}, La/e3c;->g(La/mm40;La/jpm;La/kpm;La/fet;I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v7, v9}, La/fet;->r(Z)V

    .line 225
    .line 226
    .line 227
    :goto_3
    invoke-virtual {v7, v1}, La/fet;->r(Z)V

    .line 228
    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_6
    invoke-virtual {v7}, La/fet;->X()V

    .line 232
    .line 233
    .line 234
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    return-object p0

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
