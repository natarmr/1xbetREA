.class public final synthetic La/sgg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vgg;


# direct methods
.method public synthetic constructor <init>(La/vgg;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sgg;->a:B

    iput-object p1, p0, La/sgg;->b:La/vgg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/sgg;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x1

    .line 6
    check-cast p1, La/fet;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v0, La/vgg;->Q1:La/qud;

    .line 18
    .line 19
    and-int/lit8 v0, p2, 0x3

    .line 20
    .line 21
    if-eq v0, v2, :cond_0

    .line 22
    .line 23
    move v1, v3

    .line 24
    :cond_0
    and-int/2addr p2, v3

    .line 25
    invoke-virtual {p1, p2, v1}, La/fet;->U(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-eqz p2, :cond_2

    .line 30
    .line 31
    iget-object p0, p0, La/sgg;->b:La/vgg;

    .line 32
    .line 33
    iget-object p2, p0, La/vgg;->K1:La/ib50;

    .line 34
    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    iget-object p0, p0, La/vgg;->O1:La/kiu0;

    .line 38
    .line 39
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, La/aig;

    .line 44
    .line 45
    sget v0, La/aig;->x:I

    .line 46
    .line 47
    const/16 v0, 0x48

    .line 48
    .line 49
    invoke-static {p2, p0, p1, v0}, La/qjj;->l(La/ib50;La/aig;La/fet;I)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const-string p0, "navDestinations"

    .line 54
    .line 55
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    throw p0

    .line 60
    :cond_2
    invoke-virtual {p1}, La/fet;->X()V

    .line 61
    .line 62
    .line 63
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_0
    sget-object v0, La/vgg;->Q1:La/qud;

    .line 67
    .line 68
    and-int/lit8 v0, p2, 0x3

    .line 69
    .line 70
    if-eq v0, v2, :cond_3

    .line 71
    .line 72
    move v0, v3

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    move v0, v1

    .line 75
    :goto_1
    and-int/2addr p2, v3

    .line 76
    invoke-virtual {p1, p2, v0}, La/fet;->U(IZ)Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-eqz p2, :cond_9

    .line 81
    .line 82
    sget-object p2, La/mr00;->a:La/zfn;

    .line 83
    .line 84
    iget-object v6, p0, La/sgg;->b:La/vgg;

    .line 85
    .line 86
    invoke-virtual {p2, v6}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    sget-object p2, La/jgg;->a:La/zfn;

    .line 91
    .line 92
    iget-object v0, v6, La/vgg;->M1:La/khf0;

    .line 93
    .line 94
    sget-object v2, La/vgg;->R1:[La/iiy;

    .line 95
    .line 96
    aget-object v1, v2, v1

    .line 97
    .line 98
    invoke-virtual {v0, v6, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 103
    .line 104
    invoke-virtual {p2, v0}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    sget-object v0, La/jgg;->b:La/zfn;

    .line 109
    .line 110
    iget-object v1, v6, La/vgg;->L1:La/cog;

    .line 111
    .line 112
    const/4 v8, 0x0

    .line 113
    if-eqz v1, :cond_8

    .line 114
    .line 115
    invoke-virtual {v0, v1}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    filled-new-array {p0, p2, v0}, [La/l5d0;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    new-instance p2, La/sgg;

    .line 124
    .line 125
    invoke-direct {p2, v6, v3}, La/sgg;-><init>(La/vgg;B)V

    .line 126
    .line 127
    .line 128
    const v0, 0x4f38b755

    .line 129
    .line 130
    .line 131
    invoke-static {v0, p2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    const/16 v0, 0x30

    .line 136
    .line 137
    invoke-static {p0, p2, p1, v0}, La/obc;->e([La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 138
    .line 139
    .line 140
    iget-object p0, v6, La/vgg;->O1:La/kiu0;

    .line 141
    .line 142
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    move-object v5, p0

    .line 147
    check-cast v5, La/aig;

    .line 148
    .line 149
    invoke-virtual {p1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    sget-object v0, La/ukd;->a:La/cl5;

    .line 158
    .line 159
    if-nez p0, :cond_4

    .line 160
    .line 161
    if-ne p2, v0, :cond_5

    .line 162
    .line 163
    :cond_4
    new-instance p2, La/ugg;

    .line 164
    .line 165
    invoke-direct {p2, v6, v3}, La/ugg;-><init>(La/vgg;B)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, p2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :cond_5
    check-cast p2, Lkotlin/jvm/functions/Function1;

    .line 172
    .line 173
    sget p0, La/aig;->x:I

    .line 174
    .line 175
    sget-object p0, La/lkz;->a:La/lkz;

    .line 176
    .line 177
    invoke-static {p2, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    invoke-virtual {p1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    invoke-virtual {p1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result p2

    .line 189
    or-int/2addr p0, p2

    .line 190
    const/4 p2, 0x3

    .line 191
    invoke-virtual {p1, p2}, La/fet;->e(I)Z

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    or-int/2addr p0, p2

    .line 196
    invoke-virtual {p1, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    or-int/2addr p0, p2

    .line 201
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    if-nez p0, :cond_6

    .line 206
    .line 207
    if-ne p2, v0, :cond_7

    .line 208
    .line 209
    :cond_6
    new-instance v4, La/ua7;

    .line 210
    .line 211
    const/16 v9, 0x15

    .line 212
    .line 213
    invoke-direct/range {v4 .. v9}, La/ua7;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    move-object p2, v4

    .line 220
    :cond_7
    check-cast p2, Lkotlin/jvm/functions/Function2;

    .line 221
    .line 222
    invoke-static {p1, v6, p2}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_8
    const-string p0, "cyberFeedFilterRepository"

    .line 227
    .line 228
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw v8

    .line 232
    :cond_9
    invoke-virtual {p1}, La/fet;->X()V

    .line 233
    .line 234
    .line 235
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 236
    .line 237
    return-object p0

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
