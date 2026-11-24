.class public final synthetic La/lo30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ip00;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(La/ip00;Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lo30;->a:B

    iput-object p1, p0, La/lo30;->b:La/ip00;

    iput-object p2, p0, La/lo30;->c:Lkotlin/jvm/functions/Function0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/lo30;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x12

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x4

    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object v6, p0, La/lo30;->c:Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    iget-object p0, p0, La/lo30;->b:La/ip00;

    .line 12
    .line 13
    check-cast p1, La/mm40;

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
    move v3, v4

    .line 40
    :cond_0
    or-int/2addr p3, v3

    .line 41
    :cond_1
    and-int/lit8 v0, p3, 0x13

    .line 42
    .line 43
    if-eq v0, v2, :cond_2

    .line 44
    .line 45
    move v1, v5

    .line 46
    :cond_2
    and-int/lit8 v0, p3, 0x1

    .line 47
    .line 48
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    iget-object p0, p0, La/ip00;->f:La/ud5;

    .line 55
    .line 56
    and-int/lit8 p3, p3, 0xe

    .line 57
    .line 58
    invoke-static {p1, p0, v6, p2, p3}, La/ju70;->e(La/mm40;La/ud5;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 63
    .line 64
    .line 65
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    and-int/lit8 v0, p3, 0x6

    .line 72
    .line 73
    if-nez v0, :cond_5

    .line 74
    .line 75
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    move v3, v4

    .line 82
    :cond_4
    or-int/2addr p3, v3

    .line 83
    :cond_5
    and-int/lit8 v0, p3, 0x13

    .line 84
    .line 85
    if-eq v0, v2, :cond_6

    .line 86
    .line 87
    move v1, v5

    .line 88
    :cond_6
    and-int/lit8 v0, p3, 0x1

    .line 89
    .line 90
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_7

    .line 95
    .line 96
    iget-object p0, p0, La/ip00;->f:La/ud5;

    .line 97
    .line 98
    and-int/lit8 p3, p3, 0xe

    .line 99
    .line 100
    invoke-static {p1, p0, v6, p2, p3}, La/ju70;->e(La/mm40;La/ud5;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 105
    .line 106
    .line 107
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    and-int/lit8 v0, p3, 0x6

    .line 114
    .line 115
    if-nez v0, :cond_9

    .line 116
    .line 117
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_8

    .line 122
    .line 123
    move v3, v4

    .line 124
    :cond_8
    or-int/2addr p3, v3

    .line 125
    :cond_9
    and-int/lit8 v0, p3, 0x13

    .line 126
    .line 127
    if-eq v0, v2, :cond_a

    .line 128
    .line 129
    move v1, v5

    .line 130
    :cond_a
    and-int/lit8 v0, p3, 0x1

    .line 131
    .line 132
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_b

    .line 137
    .line 138
    iget-object p0, p0, La/ip00;->f:La/ud5;

    .line 139
    .line 140
    and-int/lit8 p3, p3, 0xe

    .line 141
    .line 142
    invoke-static {p1, p0, v6, p2, p3}, La/ju70;->e(La/mm40;La/ud5;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_b
    invoke-virtual {p2}, La/fet;->X()V

    .line 147
    .line 148
    .line 149
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    and-int/lit8 v0, p3, 0x6

    .line 156
    .line 157
    if-nez v0, :cond_d

    .line 158
    .line 159
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_c

    .line 164
    .line 165
    move v3, v4

    .line 166
    :cond_c
    or-int/2addr p3, v3

    .line 167
    :cond_d
    and-int/lit8 v0, p3, 0x13

    .line 168
    .line 169
    if-eq v0, v2, :cond_e

    .line 170
    .line 171
    move v1, v5

    .line 172
    :cond_e
    and-int/lit8 v0, p3, 0x1

    .line 173
    .line 174
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_f

    .line 179
    .line 180
    iget-object p0, p0, La/ip00;->f:La/ud5;

    .line 181
    .line 182
    and-int/lit8 p3, p3, 0xe

    .line 183
    .line 184
    invoke-static {p1, p0, v6, p2, p3}, La/ju70;->e(La/mm40;La/ud5;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 185
    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_f
    invoke-virtual {p2}, La/fet;->X()V

    .line 189
    .line 190
    .line 191
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object p0

    .line 194
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    and-int/lit8 v0, p3, 0x6

    .line 198
    .line 199
    if-nez v0, :cond_11

    .line 200
    .line 201
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_10

    .line 206
    .line 207
    move v3, v4

    .line 208
    :cond_10
    or-int/2addr p3, v3

    .line 209
    :cond_11
    and-int/lit8 v0, p3, 0x13

    .line 210
    .line 211
    if-eq v0, v2, :cond_12

    .line 212
    .line 213
    move v1, v5

    .line 214
    :cond_12
    and-int/lit8 v0, p3, 0x1

    .line 215
    .line 216
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 217
    .line 218
    .line 219
    move-result v0

    .line 220
    if-eqz v0, :cond_13

    .line 221
    .line 222
    iget-object p0, p0, La/ip00;->f:La/ud5;

    .line 223
    .line 224
    and-int/lit8 p3, p3, 0xe

    .line 225
    .line 226
    invoke-static {p1, p0, v6, p2, p3}, La/ju70;->e(La/mm40;La/ud5;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 227
    .line 228
    .line 229
    goto :goto_4

    .line 230
    :cond_13
    invoke-virtual {p2}, La/fet;->X()V

    .line 231
    .line 232
    .line 233
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    return-object p0

    .line 236
    nop

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
