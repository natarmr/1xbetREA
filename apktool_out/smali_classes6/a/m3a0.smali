.class public final synthetic La/m3a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:La/fqj0;


# direct methods
.method public synthetic constructor <init>(BILa/fqj0;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/m3a0;->a:B

    iput p2, p0, La/m3a0;->b:I

    iput-object p3, p0, La/m3a0;->c:La/fqj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/m3a0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x3

    .line 6
    iget-object v4, p0, La/m3a0;->c:La/fqj0;

    .line 7
    .line 8
    const/4 v5, 0x1

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v6, p1

    .line 13
    check-cast v6, La/hcz;

    .line 14
    .line 15
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance p1, La/t57;

    .line 19
    .line 20
    invoke-direct {p1, v4, v1}, La/t57;-><init>(La/fqj0;B)V

    .line 21
    .line 22
    .line 23
    new-instance v0, La/ugd;

    .line 24
    .line 25
    const v1, -0x652dc6ea

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v5, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v6, v2, v2, v0, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 32
    .line 33
    .line 34
    sget-object p1, La/x4d0;->e:La/ugd;

    .line 35
    .line 36
    invoke-static {v6, v2, v2, p1, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 37
    .line 38
    .line 39
    new-instance p1, La/pkp0;

    .line 40
    .line 41
    iget v7, p0, La/m3a0;->b:I

    .line 42
    .line 43
    invoke-direct {p1, v7, v4}, La/pkp0;-><init>(ILa/fqj0;)V

    .line 44
    .line 45
    .line 46
    new-instance v10, La/ugd;

    .line 47
    .line 48
    const p0, -0x78f52fe1

    .line 49
    .line 50
    .line 51
    invoke-direct {v10, p0, v5, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const/4 v11, 0x6

    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x0

    .line 57
    invoke-static/range {v6 .. v11}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 58
    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_0
    move-object v0, p1

    .line 64
    check-cast v0, La/hcz;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance p1, La/aha0;

    .line 70
    .line 71
    const/16 v1, 0x8

    .line 72
    .line 73
    invoke-direct {p1, v4, v1}, La/aha0;-><init>(La/fqj0;B)V

    .line 74
    .line 75
    .line 76
    new-instance v4, La/ugd;

    .line 77
    .line 78
    const v1, 0x278de750

    .line 79
    .line 80
    .line 81
    invoke-direct {v4, v1, v5, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    const/4 v5, 0x6

    .line 85
    iget v1, p0, La/m3a0;->b:I

    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    const/4 v3, 0x0

    .line 89
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_1
    move-object v0, p1

    .line 96
    check-cast v0, La/hcz;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    new-instance p1, La/t57;

    .line 102
    .line 103
    invoke-direct {p1, v4, v3}, La/t57;-><init>(La/fqj0;B)V

    .line 104
    .line 105
    .line 106
    new-instance v1, La/ugd;

    .line 107
    .line 108
    const v6, -0x12e0688a

    .line 109
    .line 110
    .line 111
    invoke-direct {v1, v6, v5, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-static {v0, v2, v2, v1, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 115
    .line 116
    .line 117
    new-instance p1, La/aha0;

    .line 118
    .line 119
    const/4 v1, 0x6

    .line 120
    invoke-direct {p1, v4, v1}, La/aha0;-><init>(La/fqj0;B)V

    .line 121
    .line 122
    .line 123
    new-instance v4, La/ugd;

    .line 124
    .line 125
    const v1, 0x1e6ed4d

    .line 126
    .line 127
    .line 128
    invoke-direct {v4, v1, v5, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    const/4 v5, 0x6

    .line 132
    iget v1, p0, La/m3a0;->b:I

    .line 133
    .line 134
    const/4 v2, 0x0

    .line 135
    const/4 v3, 0x0

    .line 136
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 137
    .line 138
    .line 139
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object p0

    .line 142
    :pswitch_2
    move-object v0, p1

    .line 143
    check-cast v0, La/hcz;

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    new-instance p1, La/t57;

    .line 149
    .line 150
    const/4 v1, 0x2

    .line 151
    invoke-direct {p1, v4, v1}, La/t57;-><init>(La/fqj0;B)V

    .line 152
    .line 153
    .line 154
    new-instance v1, La/ugd;

    .line 155
    .line 156
    const v6, -0x54bfb2de

    .line 157
    .line 158
    .line 159
    invoke-direct {v1, v6, v5, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v0, v2, v2, v1, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 163
    .line 164
    .line 165
    new-instance p1, La/aha0;

    .line 166
    .line 167
    const/4 v1, 0x5

    .line 168
    invoke-direct {p1, v4, v1}, La/aha0;-><init>(La/fqj0;B)V

    .line 169
    .line 170
    .line 171
    new-instance v4, La/ugd;

    .line 172
    .line 173
    const v1, -0x57ae6847

    .line 174
    .line 175
    .line 176
    invoke-direct {v4, v1, v5, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    const/4 v5, 0x6

    .line 180
    iget v1, p0, La/m3a0;->b:I

    .line 181
    .line 182
    const/4 v2, 0x0

    .line 183
    const/4 v3, 0x0

    .line 184
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 185
    .line 186
    .line 187
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    return-object p0

    .line 190
    :pswitch_3
    move-object v0, p1

    .line 191
    check-cast v0, La/hcz;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    new-instance p1, La/t57;

    .line 197
    .line 198
    invoke-direct {p1, v4, v5}, La/t57;-><init>(La/fqj0;B)V

    .line 199
    .line 200
    .line 201
    new-instance v6, La/ugd;

    .line 202
    .line 203
    const v7, 0xe7aa210

    .line 204
    .line 205
    .line 206
    invoke-direct {v6, v7, v5, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    invoke-static {v0, v2, v2, v6, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 210
    .line 211
    .line 212
    iget p0, p0, La/m3a0;->b:I

    .line 213
    .line 214
    sub-int/2addr p0, v5

    .line 215
    new-instance p1, La/aha0;

    .line 216
    .line 217
    invoke-direct {p1, v4, v1}, La/aha0;-><init>(La/fqj0;B)V

    .line 218
    .line 219
    .line 220
    new-instance v4, La/ugd;

    .line 221
    .line 222
    const v1, 0x6f0e8c99

    .line 223
    .line 224
    .line 225
    invoke-direct {v4, v1, v5, p1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    const/4 v5, 0x6

    .line 229
    const/4 v2, 0x0

    .line 230
    const/4 v3, 0x0

    .line 231
    move v1, p0

    .line 232
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 233
    .line 234
    .line 235
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    return-object p0

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
