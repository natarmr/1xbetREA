.class public final synthetic La/po30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mx80;


# direct methods
.method public synthetic constructor <init>(La/mx80;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/po30;->a:B

    iput-object p1, p0, La/po30;->b:La/mx80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/po30;->a:B

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object p0, p0, La/po30;->b:La/mx80;

    .line 10
    .line 11
    check-cast p1, La/mm40;

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
    packed-switch v0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    move v4, v5

    .line 45
    :goto_0
    and-int/lit8 v0, p3, 0x1

    .line 46
    .line 47
    invoke-virtual {p2, v0, v4}, La/fet;->U(IZ)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    and-int/lit8 p3, p3, 0xe

    .line 54
    .line 55
    invoke-static {p1, p0, p2, p3}, La/x9x;->q(La/mm40;La/mx80;La/fet;I)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    invoke-virtual {p2}, La/fet;->X()V

    .line 60
    .line 61
    .line 62
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    and-int/lit8 v0, p3, 0x6

    .line 69
    .line 70
    if-nez v0, :cond_5

    .line 71
    .line 72
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    move v2, v3

    .line 79
    :cond_4
    or-int/2addr p3, v2

    .line 80
    :cond_5
    and-int/lit8 v0, p3, 0x13

    .line 81
    .line 82
    if-eq v0, v1, :cond_6

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_6
    move v4, v5

    .line 86
    :goto_2
    and-int/lit8 v0, p3, 0x1

    .line 87
    .line 88
    invoke-virtual {p2, v0, v4}, La/fet;->U(IZ)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_7

    .line 93
    .line 94
    and-int/lit8 p3, p3, 0xe

    .line 95
    .line 96
    invoke-static {p1, p0, p2, p3}, La/x9x;->q(La/mm40;La/mx80;La/fet;I)V

    .line 97
    .line 98
    .line 99
    goto :goto_3

    .line 100
    :cond_7
    invoke-virtual {p2}, La/fet;->X()V

    .line 101
    .line 102
    .line 103
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    and-int/lit8 v0, p3, 0x6

    .line 110
    .line 111
    if-nez v0, :cond_9

    .line 112
    .line 113
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_8

    .line 118
    .line 119
    move v2, v3

    .line 120
    :cond_8
    or-int/2addr p3, v2

    .line 121
    :cond_9
    and-int/lit8 v0, p3, 0x13

    .line 122
    .line 123
    if-eq v0, v1, :cond_a

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_a
    move v4, v5

    .line 127
    :goto_4
    and-int/lit8 v0, p3, 0x1

    .line 128
    .line 129
    invoke-virtual {p2, v0, v4}, La/fet;->U(IZ)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_b

    .line 134
    .line 135
    and-int/lit8 p3, p3, 0xe

    .line 136
    .line 137
    invoke-static {p1, p0, p2, p3}, La/x9x;->q(La/mm40;La/mx80;La/fet;I)V

    .line 138
    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_b
    invoke-virtual {p2}, La/fet;->X()V

    .line 142
    .line 143
    .line 144
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    and-int/lit8 v0, p3, 0x6

    .line 151
    .line 152
    if-nez v0, :cond_d

    .line 153
    .line 154
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_c

    .line 159
    .line 160
    move v2, v3

    .line 161
    :cond_c
    or-int/2addr p3, v2

    .line 162
    :cond_d
    and-int/lit8 v0, p3, 0x13

    .line 163
    .line 164
    if-eq v0, v1, :cond_e

    .line 165
    .line 166
    goto :goto_6

    .line 167
    :cond_e
    move v4, v5

    .line 168
    :goto_6
    and-int/lit8 v0, p3, 0x1

    .line 169
    .line 170
    invoke-virtual {p2, v0, v4}, La/fet;->U(IZ)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_f

    .line 175
    .line 176
    and-int/lit8 p3, p3, 0xe

    .line 177
    .line 178
    invoke-static {p1, p0, p2, p3}, La/x9x;->q(La/mm40;La/mx80;La/fet;I)V

    .line 179
    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_f
    invoke-virtual {p2}, La/fet;->X()V

    .line 183
    .line 184
    .line 185
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object p0

    .line 188
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    and-int/lit8 v0, p3, 0x6

    .line 192
    .line 193
    if-nez v0, :cond_11

    .line 194
    .line 195
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_10

    .line 200
    .line 201
    move v2, v3

    .line 202
    :cond_10
    or-int/2addr p3, v2

    .line 203
    :cond_11
    and-int/lit8 v0, p3, 0x13

    .line 204
    .line 205
    if-eq v0, v1, :cond_12

    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_12
    move v4, v5

    .line 209
    :goto_8
    and-int/lit8 v0, p3, 0x1

    .line 210
    .line 211
    invoke-virtual {p2, v0, v4}, La/fet;->U(IZ)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_13

    .line 216
    .line 217
    and-int/lit8 p3, p3, 0xe

    .line 218
    .line 219
    invoke-static {p1, p0, p2, p3}, La/x9x;->q(La/mm40;La/mx80;La/fet;I)V

    .line 220
    .line 221
    .line 222
    goto :goto_9

    .line 223
    :cond_13
    invoke-virtual {p2}, La/fet;->X()V

    .line 224
    .line 225
    .line 226
    :goto_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 227
    .line 228
    return-object p0

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
