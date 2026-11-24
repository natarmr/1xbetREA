.class public final synthetic La/l3d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qwv0;


# direct methods
.method public synthetic constructor <init>(La/qwv0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/l3d;->a:B

    iput-object p1, p0, La/l3d;->b:La/qwv0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/l3d;->a:B

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object p0, p0, La/l3d;->b:La/qwv0;

    .line 10
    .line 11
    check-cast p1, La/qwv0;

    .line 12
    .line 13
    check-cast p2, La/fet;

    .line 14
    .line 15
    check-cast p3, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    packed-switch v0, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    and-int/lit8 v0, p3, 0x6

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    move v2, v3

    .line 38
    :cond_0
    or-int/2addr p3, v2

    .line 39
    :cond_1
    and-int/lit8 v0, p3, 0x13

    .line 40
    .line 41
    if-eq v0, v1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    move v5, v4

    .line 45
    :goto_0
    and-int/lit8 v0, p3, 0x1

    .line 46
    .line 47
    invoke-virtual {p2, v0, v5}, La/fet;->U(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    iget-object p0, p0, La/qwv0;->c:La/pz40;

    .line 54
    .line 55
    check-cast p0, La/hgk0;

    .line 56
    .line 57
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, La/xdr;

    .line 62
    .line 63
    if-nez p0, :cond_3

    .line 64
    .line 65
    const p0, -0x17f5231b

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2, p0}, La/fet;->e0(I)V

    .line 69
    .line 70
    .line 71
    :goto_1
    invoke-virtual {p2, v4}, La/fet;->r(Z)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    const v0, -0x198c0964

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v0}, La/fet;->e0(I)V

    .line 79
    .line 80
    .line 81
    and-int/lit8 p3, p3, 0xe

    .line 82
    .line 83
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    invoke-interface {p0, p1, p2, p3}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    invoke-virtual {p2}, La/fet;->X()V

    .line 92
    .line 93
    .line 94
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_0
    and-int/lit8 v0, p3, 0x6

    .line 98
    .line 99
    if-nez v0, :cond_6

    .line 100
    .line 101
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    move v2, v3

    .line 108
    :cond_5
    or-int/2addr p3, v2

    .line 109
    :cond_6
    and-int/lit8 v0, p3, 0x13

    .line 110
    .line 111
    if-eq v0, v1, :cond_7

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_7
    move v5, v4

    .line 115
    :goto_3
    and-int/lit8 v0, p3, 0x1

    .line 116
    .line 117
    invoke-virtual {p2, v0, v5}, La/fet;->U(IZ)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_9

    .line 122
    .line 123
    iget-object p0, p0, La/qwv0;->d:La/pz40;

    .line 124
    .line 125
    check-cast p0, La/hgk0;

    .line 126
    .line 127
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    check-cast p0, La/xdr;

    .line 132
    .line 133
    if-nez p0, :cond_8

    .line 134
    .line 135
    const p0, 0x6ce7071c

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2, p0}, La/fet;->e0(I)V

    .line 139
    .line 140
    .line 141
    :goto_4
    invoke-virtual {p2, v4}, La/fet;->r(Z)V

    .line 142
    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_8
    const v0, 0x6ede2985

    .line 146
    .line 147
    .line 148
    invoke-virtual {p2, v0}, La/fet;->e0(I)V

    .line 149
    .line 150
    .line 151
    and-int/lit8 p3, p3, 0xe

    .line 152
    .line 153
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object p3

    .line 157
    invoke-interface {p0, p1, p2, p3}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_9
    invoke-virtual {p2}, La/fet;->X()V

    .line 162
    .line 163
    .line 164
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_1
    and-int/lit8 v0, p3, 0x6

    .line 168
    .line 169
    if-nez v0, :cond_b

    .line 170
    .line 171
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_a

    .line 176
    .line 177
    move v2, v3

    .line 178
    :cond_a
    or-int/2addr p3, v2

    .line 179
    :cond_b
    and-int/lit8 v0, p3, 0x13

    .line 180
    .line 181
    if-eq v0, v1, :cond_c

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_c
    move v5, v4

    .line 185
    :goto_6
    and-int/lit8 v0, p3, 0x1

    .line 186
    .line 187
    invoke-virtual {p2, v0, v5}, La/fet;->U(IZ)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_e

    .line 192
    .line 193
    iget-object p0, p0, La/qwv0;->b:La/pz40;

    .line 194
    .line 195
    check-cast p0, La/hgk0;

    .line 196
    .line 197
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, La/xdr;

    .line 202
    .line 203
    if-nez p0, :cond_d

    .line 204
    .line 205
    const p0, -0x408904cd

    .line 206
    .line 207
    .line 208
    invoke-virtual {p2, p0}, La/fet;->e0(I)V

    .line 209
    .line 210
    .line 211
    :goto_7
    invoke-virtual {p2, v4}, La/fet;->r(Z)V

    .line 212
    .line 213
    .line 214
    goto :goto_8

    .line 215
    :cond_d
    const v0, 0x6103d68e

    .line 216
    .line 217
    .line 218
    invoke-virtual {p2, v0}, La/fet;->e0(I)V

    .line 219
    .line 220
    .line 221
    and-int/lit8 p3, p3, 0xe

    .line 222
    .line 223
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object p3

    .line 227
    invoke-interface {p0, p1, p2, p3}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    goto :goto_7

    .line 231
    :cond_e
    invoke-virtual {p2}, La/fet;->X()V

    .line 232
    .line 233
    .line 234
    :goto_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    return-object p0

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
