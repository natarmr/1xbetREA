.class public final synthetic La/wod;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yod;


# direct methods
.method public synthetic constructor <init>(La/yod;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wod;->a:B

    iput-object p1, p0, La/wod;->b:La/yod;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/wod;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/16 v2, 0x10

    .line 5
    .line 6
    const/16 v3, 0x20

    .line 7
    .line 8
    iget-object p0, p0, La/wod;->b:La/yod;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, La/y5d;

    .line 16
    .line 17
    check-cast p2, La/mm40;

    .line 18
    .line 19
    check-cast p3, La/fet;

    .line 20
    .line 21
    check-cast p4, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-static {p4, p1, p2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 24
    .line 25
    .line 26
    move-result p4

    .line 27
    and-int/lit8 v0, p4, 0x6

    .line 28
    .line 29
    const/4 v6, 0x2

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_0

    .line 37
    .line 38
    const/4 v0, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v0, v6

    .line 41
    :goto_0
    or-int/2addr v0, p4

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v0, p4

    .line 44
    :goto_1
    and-int/lit8 p4, p4, 0x30

    .line 45
    .line 46
    if-nez p4, :cond_3

    .line 47
    .line 48
    invoke-virtual {p3, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p4

    .line 52
    if-eqz p4, :cond_2

    .line 53
    .line 54
    move v2, v3

    .line 55
    :cond_2
    or-int/2addr v0, v2

    .line 56
    :cond_3
    and-int/lit16 p4, v0, 0x93

    .line 57
    .line 58
    const/16 v2, 0x92

    .line 59
    .line 60
    if-eq p4, v2, :cond_4

    .line 61
    .line 62
    move p4, v5

    .line 63
    goto :goto_2

    .line 64
    :cond_4
    move p4, v4

    .line 65
    :goto_2
    and-int/2addr v0, v5

    .line 66
    invoke-virtual {p3, v0, p4}, La/fet;->U(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result p4

    .line 70
    if-eqz p4, :cond_5

    .line 71
    .line 72
    const/high16 p4, 0x3f800000    # 1.0f

    .line 73
    .line 74
    invoke-static {p2, p4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-static {p1, p2}, La/y5d;->c(La/y5d;La/mm40;)La/mm40;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance p2, La/xod;

    .line 83
    .line 84
    invoke-direct {p2, p0, v4}, La/xod;-><init>(La/yod;B)V

    .line 85
    .line 86
    .line 87
    const p4, -0x6bdf594f

    .line 88
    .line 89
    .line 90
    invoke-static {p4, p2, p3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    new-instance p4, La/xod;

    .line 95
    .line 96
    invoke-direct {p4, p0, v5}, La/xod;-><init>(La/yod;B)V

    .line 97
    .line 98
    .line 99
    const v0, 0x78ca6db2

    .line 100
    .line 101
    .line 102
    invoke-static {v0, p4, p3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 103
    .line 104
    .line 105
    move-result-object p4

    .line 106
    new-instance v0, La/xod;

    .line 107
    .line 108
    invoke-direct {v0, p0, v6}, La/xod;-><init>(La/yod;B)V

    .line 109
    .line 110
    .line 111
    const p0, 0x5d7434b3

    .line 112
    .line 113
    .line 114
    invoke-static {p0, v0, p3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    new-array v0, v1, [La/xdr;

    .line 119
    .line 120
    aput-object p2, v0, v4

    .line 121
    .line 122
    aput-object p4, v0, v5

    .line 123
    .line 124
    aput-object p0, v0, v6

    .line 125
    .line 126
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-static {p1, p0, p3}, La/ay3;->m(La/mm40;Ljava/util/List;La/fet;)V

    .line 131
    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_5
    invoke-virtual {p3}, La/fet;->X()V

    .line 135
    .line 136
    .line 137
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_0
    iget-object p0, p0, La/yod;->c:La/j83;

    .line 141
    .line 142
    check-cast p1, La/y5d;

    .line 143
    .line 144
    check-cast p2, La/mm40;

    .line 145
    .line 146
    check-cast p3, La/fet;

    .line 147
    .line 148
    check-cast p4, Ljava/lang/Integer;

    .line 149
    .line 150
    invoke-static {p4, p1, p2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    and-int/lit8 p4, p1, 0x30

    .line 155
    .line 156
    if-nez p4, :cond_7

    .line 157
    .line 158
    invoke-virtual {p3, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result p4

    .line 162
    if-eqz p4, :cond_6

    .line 163
    .line 164
    move v2, v3

    .line 165
    :cond_6
    or-int/2addr p1, v2

    .line 166
    :cond_7
    and-int/lit16 p4, p1, 0x91

    .line 167
    .line 168
    const/16 v0, 0x90

    .line 169
    .line 170
    if-eq p4, v0, :cond_8

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_8
    move v5, v4

    .line 174
    :goto_4
    and-int/lit8 p4, p1, 0x1

    .line 175
    .line 176
    invoke-virtual {p3, p4, v5}, La/fet;->U(IZ)Z

    .line 177
    .line 178
    .line 179
    move-result p4

    .line 180
    if-eqz p4, :cond_a

    .line 181
    .line 182
    iget-object p4, p0, La/j83;->b:Ljava/lang/String;

    .line 183
    .line 184
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 185
    .line 186
    .line 187
    move-result p4

    .line 188
    if-lez p4, :cond_9

    .line 189
    .line 190
    const p4, -0x3e08c15

    .line 191
    .line 192
    .line 193
    invoke-virtual {p3, p4}, La/fet;->e0(I)V

    .line 194
    .line 195
    .line 196
    shr-int/2addr p1, v1

    .line 197
    and-int/lit8 p1, p1, 0xe

    .line 198
    .line 199
    invoke-static {p2, p0, p3, p1}, La/vic;->a(La/mm40;La/j83;La/fet;I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p3, v4}, La/fet;->r(Z)V

    .line 203
    .line 204
    .line 205
    goto :goto_5

    .line 206
    :cond_9
    const p0, -0x3de11ac

    .line 207
    .line 208
    .line 209
    invoke-virtual {p3, p0}, La/fet;->e0(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p3, v4}, La/fet;->r(Z)V

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_a
    invoke-virtual {p3}, La/fet;->X()V

    .line 217
    .line 218
    .line 219
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object p0

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
