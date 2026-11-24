.class public final synthetic La/x6e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:La/j2m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;Lkotlin/jvm/functions/Function1;La/j2m0;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/x6e0;->a:B

    iput-object p1, p0, La/x6e0;->b:La/l7m0;

    iput-object p2, p0, La/x6e0;->c:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/x6e0;->d:La/j2m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/x6e0;->a:B

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/x6e0;->d:La/j2m0;

    .line 8
    .line 9
    iget-object v5, p0, La/x6e0;->c:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iget-object p0, p0, La/x6e0;->b:La/l7m0;

    .line 12
    .line 13
    check-cast p1, La/ir8;

    .line 14
    .line 15
    check-cast p2, La/fet;

    .line 16
    .line 17
    check-cast p3, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    and-int/lit8 v0, p3, 0x6

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    const/4 v0, 0x4

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v0, 0x2

    .line 42
    :goto_0
    or-int/2addr p3, v0

    .line 43
    :cond_1
    and-int/lit8 v0, p3, 0x13

    .line 44
    .line 45
    const/16 v6, 0x12

    .line 46
    .line 47
    if-eq v0, v6, :cond_2

    .line 48
    .line 49
    move v0, v3

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v0, v2

    .line 52
    :goto_1
    and-int/2addr p3, v3

    .line 53
    invoke-virtual {p2, p3, v0}, La/fet;->U(IZ)Z

    .line 54
    .line 55
    .line 56
    move-result p3

    .line 57
    if-eqz p3, :cond_6

    .line 58
    .line 59
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, La/d3m0;

    .line 64
    .line 65
    if-eqz p0, :cond_5

    .line 66
    .line 67
    instance-of p3, p0, La/b3m0;

    .line 68
    .line 69
    if-eqz p3, :cond_3

    .line 70
    .line 71
    const p0, 0xd99f1d7

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, p0}, La/fet;->e0(I)V

    .line 75
    .line 76
    .line 77
    invoke-static {v2, p2}, La/wha0;->x(ILa/fet;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2, v2}, La/fet;->r(Z)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    instance-of p3, p0, La/a3m0;

    .line 85
    .line 86
    if-eqz p3, :cond_4

    .line 87
    .line 88
    const p3, 0xd99fa2c

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, p3}, La/fet;->e0(I)V

    .line 92
    .line 93
    .line 94
    sget-object p3, La/jm40;->b:La/jm40;

    .line 95
    .line 96
    sget-object v0, La/gqw0;->e:La/zx7;

    .line 97
    .line 98
    invoke-interface {p1, p3, v0}, La/ir8;->b(La/mm40;La/u12;)La/mm40;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p0, La/a3m0;

    .line 103
    .line 104
    iget-object p0, p0, La/a3m0;->d:La/mdm;

    .line 105
    .line 106
    invoke-static {p1, p0, v5, p2, v2}, La/wha0;->q(La/mm40;La/mdm;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2, v2}, La/fet;->r(Z)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_4
    instance-of p1, p0, La/c3m0;

    .line 114
    .line 115
    if-eqz p1, :cond_5

    .line 116
    .line 117
    const p1, 0xd9a18aa

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2, p1}, La/fet;->e0(I)V

    .line 121
    .line 122
    .line 123
    check-cast p0, La/c3m0;

    .line 124
    .line 125
    invoke-static {v4, p0, v5, p2, v1}, La/wha0;->C(La/j2m0;La/c3m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2, v2}, La/fet;->r(Z)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_5
    const p0, 0xd99e99d

    .line 133
    .line 134
    .line 135
    invoke-static {p0, p2, v2}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    throw p0

    .line 140
    :cond_6
    invoke-virtual {p2}, La/fet;->X()V

    .line 141
    .line 142
    .line 143
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object p0

    .line 146
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    and-int/lit8 p1, p3, 0x11

    .line 150
    .line 151
    const/16 v0, 0x10

    .line 152
    .line 153
    if-eq p1, v0, :cond_7

    .line 154
    .line 155
    move p1, v3

    .line 156
    goto :goto_3

    .line 157
    :cond_7
    move p1, v2

    .line 158
    :goto_3
    and-int/2addr p3, v3

    .line 159
    invoke-virtual {p2, p3, p1}, La/fet;->U(IZ)Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-eqz p1, :cond_b

    .line 164
    .line 165
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    check-cast p0, La/d3m0;

    .line 170
    .line 171
    if-eqz p0, :cond_a

    .line 172
    .line 173
    instance-of p1, p0, La/b3m0;

    .line 174
    .line 175
    if-eqz p1, :cond_8

    .line 176
    .line 177
    const p0, 0x6388508d

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2, p0}, La/fet;->e0(I)V

    .line 181
    .line 182
    .line 183
    invoke-static {v2, p2}, La/b34;->A(ILa/fet;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p2, v2}, La/fet;->r(Z)V

    .line 187
    .line 188
    .line 189
    goto :goto_4

    .line 190
    :cond_8
    instance-of p1, p0, La/a3m0;

    .line 191
    .line 192
    if-eqz p1, :cond_9

    .line 193
    .line 194
    const p1, 0x638858a1

    .line 195
    .line 196
    .line 197
    invoke-virtual {p2, p1}, La/fet;->e0(I)V

    .line 198
    .line 199
    .line 200
    check-cast p0, La/a3m0;

    .line 201
    .line 202
    iget-object p0, p0, La/a3m0;->d:La/mdm;

    .line 203
    .line 204
    invoke-static {p0, v5, p2, v2}, La/b34;->s(La/mdm;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2, v2}, La/fet;->r(Z)V

    .line 208
    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_9
    instance-of p1, p0, La/c3m0;

    .line 212
    .line 213
    if-eqz p1, :cond_a

    .line 214
    .line 215
    const p1, 0x63886f41

    .line 216
    .line 217
    .line 218
    invoke-virtual {p2, p1}, La/fet;->e0(I)V

    .line 219
    .line 220
    .line 221
    check-cast p0, La/c3m0;

    .line 222
    .line 223
    invoke-static {v4, p0, v5, p2, v1}, La/b34;->G(La/j2m0;La/c3m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p2, v2}, La/fet;->r(Z)V

    .line 227
    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_a
    const p0, 0x63884813

    .line 231
    .line 232
    .line 233
    invoke-static {p0, p2, v2}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    throw p0

    .line 238
    :cond_b
    invoke-virtual {p2}, La/fet;->X()V

    .line 239
    .line 240
    .line 241
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    return-object p0

    .line 244
    nop

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
