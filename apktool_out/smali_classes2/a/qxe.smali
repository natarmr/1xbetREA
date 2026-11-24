.class public final synthetic La/qxe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cye;


# direct methods
.method public synthetic constructor <init>(La/cye;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qxe;->a:B

    iput-object p1, p0, La/qxe;->b:La/cye;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/qxe;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object p0, p0, La/qxe;->b:La/cye;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/yhg0;

    .line 11
    .line 12
    check-cast p2, La/fet;

    .line 13
    .line 14
    check-cast p3, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p3

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    and-int/lit8 v0, p3, 0x6

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    const/4 v0, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v0, 0x2

    .line 36
    :goto_0
    or-int/2addr p3, v0

    .line 37
    :cond_1
    and-int/lit8 v0, p3, 0x13

    .line 38
    .line 39
    const/16 v3, 0x12

    .line 40
    .line 41
    if-eq v0, v3, :cond_2

    .line 42
    .line 43
    move v0, v2

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move v0, v1

    .line 46
    :goto_1
    and-int/2addr p3, v2

    .line 47
    invoke-virtual {p2, p3, v0}, La/fet;->U(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result p3

    .line 51
    if-eqz p3, :cond_4

    .line 52
    .line 53
    iget-object p3, p0, La/cye;->e:La/i680;

    .line 54
    .line 55
    if-nez p3, :cond_3

    .line 56
    .line 57
    const p3, 0x610f6b9b

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p3}, La/fet;->e0(I)V

    .line 61
    .line 62
    .line 63
    sget-object p3, La/qmk;->a:La/zcl;

    .line 64
    .line 65
    const/high16 p3, 0x41c00000    # 24.0f

    .line 66
    .line 67
    sget-object v0, La/jm40;->b:La/jm40;

    .line 68
    .line 69
    invoke-static {v0, p3}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    const/high16 v0, 0x3f000000    # 0.5f

    .line 74
    .line 75
    invoke-interface {p1, v0, p3, v2}, La/yhg0;->a(FLa/mm40;Z)La/mm40;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iget-object p0, p0, La/cye;->a:La/pxe;

    .line 80
    .line 81
    invoke-static {p1, p0, p2, v1}, La/obb;->g(La/mm40;La/pxe;La/fet;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2, v1}, La/fet;->r(Z)V

    .line 85
    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    const p0, 0x6114dc4e

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, p0}, La/fet;->e0(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v1}, La/fet;->r(Z)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    invoke-virtual {p2}, La/fet;->X()V

    .line 99
    .line 100
    .line 101
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_0
    iget-object v0, p0, La/cye;->e:La/i680;

    .line 105
    .line 106
    check-cast p1, La/y5d;

    .line 107
    .line 108
    move-object v7, p2

    .line 109
    check-cast v7, La/fet;

    .line 110
    .line 111
    check-cast p3, Ljava/lang/Integer;

    .line 112
    .line 113
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    and-int/lit8 p1, p2, 0x11

    .line 121
    .line 122
    const/16 p3, 0x10

    .line 123
    .line 124
    if-eq p1, p3, :cond_5

    .line 125
    .line 126
    move p1, v2

    .line 127
    goto :goto_3

    .line 128
    :cond_5
    move p1, v1

    .line 129
    :goto_3
    and-int/2addr p2, v2

    .line 130
    invoke-virtual {v7, p2, p1}, La/fet;->U(IZ)Z

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    if-eqz p1, :cond_a

    .line 135
    .line 136
    if-nez v0, :cond_9

    .line 137
    .line 138
    const p1, -0x4e5bf355

    .line 139
    .line 140
    .line 141
    invoke-virtual {v7, p1}, La/fet;->e0(I)V

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, La/cye;->d:Ljava/lang/String;

    .line 145
    .line 146
    if-nez p1, :cond_6

    .line 147
    .line 148
    const p0, -0x7d22774a

    .line 149
    .line 150
    .line 151
    invoke-virtual {v7, p0}, La/fet;->e0(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7, v1}, La/fet;->r(Z)V

    .line 155
    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_6
    const p2, -0x7d227749

    .line 159
    .line 160
    .line 161
    invoke-virtual {v7, p2}, La/fet;->e0(I)V

    .line 162
    .line 163
    .line 164
    iget-boolean p2, p0, La/cye;->c:Z

    .line 165
    .line 166
    if-nez p2, :cond_8

    .line 167
    .line 168
    iget-object p0, p0, La/cye;->a:La/pxe;

    .line 169
    .line 170
    instance-of p0, p0, La/jxe;

    .line 171
    .line 172
    if-nez p0, :cond_7

    .line 173
    .line 174
    if-nez v0, :cond_7

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_7
    const p0, -0x575a01a9

    .line 178
    .line 179
    .line 180
    invoke-virtual {v7, p0}, La/fet;->e0(I)V

    .line 181
    .line 182
    .line 183
    :goto_4
    invoke-virtual {v7, v1}, La/fet;->r(Z)V

    .line 184
    .line 185
    .line 186
    goto :goto_6

    .line 187
    :cond_8
    :goto_5
    const p0, -0x23d9a303

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7, p0}, La/fet;->e0(I)V

    .line 191
    .line 192
    .line 193
    sget-object p0, La/qmk;->a:La/zcl;

    .line 194
    .line 195
    const/4 v8, 0x0

    .line 196
    const/4 v9, 0x5

    .line 197
    const/4 v3, 0x0

    .line 198
    const/high16 v4, 0x40800000    # 4.0f

    .line 199
    .line 200
    const-wide/16 v5, 0x0

    .line 201
    .line 202
    invoke-static/range {v3 .. v9}, La/wvb;->o(La/mm40;FJLa/fet;II)V

    .line 203
    .line 204
    .line 205
    goto :goto_4

    .line 206
    :goto_6
    const/4 p0, 0x0

    .line 207
    invoke-static {v1, v2, v7, p0, p1}, La/j47;->K(IILa/fet;La/mm40;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    sget-object p0, La/qmk;->a:La/zcl;

    .line 211
    .line 212
    const/4 v8, 0x0

    .line 213
    const/4 v9, 0x5

    .line 214
    const/4 v3, 0x0

    .line 215
    const/high16 v4, 0x40800000    # 4.0f

    .line 216
    .line 217
    const-wide/16 v5, 0x0

    .line 218
    .line 219
    invoke-static/range {v3 .. v9}, La/wvb;->o(La/mm40;FJLa/fet;II)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v7, v1}, La/fet;->r(Z)V

    .line 223
    .line 224
    .line 225
    :goto_7
    invoke-virtual {v7, v1}, La/fet;->r(Z)V

    .line 226
    .line 227
    .line 228
    goto :goto_8

    .line 229
    :cond_9
    const p0, -0x7d1ddb59

    .line 230
    .line 231
    .line 232
    invoke-virtual {v7, p0}, La/fet;->e0(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v7, v1}, La/fet;->r(Z)V

    .line 236
    .line 237
    .line 238
    goto :goto_8

    .line 239
    :cond_a
    invoke-virtual {v7}, La/fet;->X()V

    .line 240
    .line 241
    .line 242
    :goto_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    return-object p0

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
