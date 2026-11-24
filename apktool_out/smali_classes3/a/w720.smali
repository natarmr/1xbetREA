.class public final synthetic La/w720;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ry6;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(La/ry6;Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/w720;->a:B

    iput-object p1, p0, La/w720;->b:La/ry6;

    iput-object p2, p0, La/w720;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/w720;->a:B

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    iget-object v2, p0, La/w720;->c:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    iget-object p0, p0, La/w720;->b:La/ry6;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    check-cast p1, La/y5d;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object v0, p2

    .line 17
    check-cast v0, La/fet;

    .line 18
    .line 19
    move-object/from16 v5, p3

    .line 20
    .line 21
    check-cast v5, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    and-int/lit8 p1, v5, 0x11

    .line 31
    .line 32
    if-eq p1, v1, :cond_0

    .line 33
    .line 34
    move p1, v4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move p1, v3

    .line 37
    :goto_0
    and-int/lit8 v1, v5, 0x1

    .line 38
    .line 39
    invoke-virtual {v0, v1, p1}, La/fet;->U(IZ)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    iget-object p0, p0, La/ry6;->e:Ljava/lang/String;

    .line 46
    .line 47
    if-nez p0, :cond_1

    .line 48
    .line 49
    const p0, 0x5fc5ec26

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p0}, La/fet;->e0(I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v3}, La/fet;->r(Z)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    const p1, 0x5fc5ec27

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, p1}, La/fet;->e0(I)V

    .line 63
    .line 64
    .line 65
    sget-object p1, La/qmk;->a:La/zcl;

    .line 66
    .line 67
    const/high16 v8, 0x40000000    # 2.0f

    .line 68
    .line 69
    const/4 v9, 0x7

    .line 70
    sget-object v4, La/jm40;->b:La/jm40;

    .line 71
    .line 72
    const/4 v5, 0x0

    .line 73
    const/4 v6, 0x0

    .line 74
    const/4 v7, 0x0

    .line 75
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1, p0, v2, v0, v3}, La/ydx;->k(La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v3}, La/fet;->r(Z)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    invoke-virtual {v0}, La/fet;->X()V

    .line 87
    .line 88
    .line 89
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_0
    move-object v11, p2

    .line 93
    check-cast v11, La/fet;

    .line 94
    .line 95
    move-object/from16 v0, p3

    .line 96
    .line 97
    check-cast v0, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    and-int/lit8 p1, v0, 0x11

    .line 107
    .line 108
    if-eq p1, v1, :cond_3

    .line 109
    .line 110
    move p1, v4

    .line 111
    goto :goto_2

    .line 112
    :cond_3
    move p1, v3

    .line 113
    :goto_2
    and-int/2addr v0, v4

    .line 114
    invoke-virtual {v11, v0, p1}, La/fet;->U(IZ)Z

    .line 115
    .line 116
    .line 117
    move-result p1

    .line 118
    if-eqz p1, :cond_4

    .line 119
    .line 120
    iget-object p1, p0, La/ry6;->b:La/uf40;

    .line 121
    .line 122
    iget-object v6, p1, La/uf40;->c:La/j43;

    .line 123
    .line 124
    iget-object v7, p1, La/uf40;->d:Ljava/lang/String;

    .line 125
    .line 126
    new-instance p1, La/w720;

    .line 127
    .line 128
    const/4 v0, 0x2

    .line 129
    invoke-direct {p1, p0, v2, v0}, La/w720;-><init>(La/ry6;Lkotlin/jvm/functions/Function0;B)V

    .line 130
    .line 131
    .line 132
    const v0, 0x4d555ab1    # 2.2371816E8f

    .line 133
    .line 134
    .line 135
    invoke-static {v0, p1, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    new-instance p1, La/y720;

    .line 140
    .line 141
    invoke-direct {p1, p0, v3}, La/y720;-><init>(La/ry6;B)V

    .line 142
    .line 143
    .line 144
    const v0, 0x3a0560f2

    .line 145
    .line 146
    .line 147
    invoke-static {v0, p1, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    new-instance p1, La/y720;

    .line 152
    .line 153
    invoke-direct {p1, p0, v4}, La/y720;-><init>(La/ry6;B)V

    .line 154
    .line 155
    .line 156
    const p0, 0x26b56733

    .line 157
    .line 158
    .line 159
    invoke-static {p0, p1, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    const v12, 0x36c00

    .line 164
    .line 165
    .line 166
    const/4 v5, 0x0

    .line 167
    invoke-static/range {v5 .. v12}, La/m8x;->n(La/mm40;La/j43;Ljava/lang/String;La/xdr;La/ugd;La/ugd;La/fet;I)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_4
    invoke-virtual {v11}, La/fet;->X()V

    .line 172
    .line 173
    .line 174
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_1
    move-object v0, p2

    .line 178
    check-cast v0, La/fet;

    .line 179
    .line 180
    move-object/from16 v5, p3

    .line 181
    .line 182
    check-cast v5, Ljava/lang/Integer;

    .line 183
    .line 184
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    and-int/lit8 p1, v5, 0x11

    .line 192
    .line 193
    if-eq p1, v1, :cond_5

    .line 194
    .line 195
    move p1, v4

    .line 196
    goto :goto_4

    .line 197
    :cond_5
    move p1, v3

    .line 198
    :goto_4
    and-int/lit8 v1, v5, 0x1

    .line 199
    .line 200
    invoke-virtual {v0, v1, p1}, La/fet;->U(IZ)Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-eqz p1, :cond_6

    .line 205
    .line 206
    const/4 p1, 0x0

    .line 207
    iget-object p0, p0, La/ry6;->a:La/d8r0;

    .line 208
    .line 209
    invoke-static {p1, p0, v2, v0, v3}, La/wgm0;->m(La/mm40;La/d8r0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 210
    .line 211
    .line 212
    goto :goto_5

    .line 213
    :cond_6
    invoke-virtual {v0}, La/fet;->X()V

    .line 214
    .line 215
    .line 216
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object p0

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
