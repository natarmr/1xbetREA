.class public final synthetic La/vnc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/znc0;


# direct methods
.method public synthetic constructor <init>(La/znc0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vnc0;->a:B

    iput-object p1, p0, La/vnc0;->b:La/znc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vnc0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/vnc0;->b:La/znc0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/znc0;->U1:La/rl70;

    .line 11
    .line 12
    new-instance v1, La/unc0;

    .line 13
    .line 14
    invoke-virtual {v0}, La/znc0;->H0()La/doc0;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-object v3, v2, La/doc0;->h:La/pru;

    .line 19
    .line 20
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v3, v3, La/sff0;->Z1:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    const/4 v5, 0x0

    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    iget-object v2, v2, La/doc0;->k:La/ctf0;

    .line 34
    .line 35
    new-array v3, v5, [Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v2, v2, La/ctf0;->b:La/lsm0;

    .line 38
    .line 39
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const v4, 0x7f130ea4

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    :cond_0
    new-instance v6, La/l8c0;

    .line 51
    .line 52
    invoke-virtual {v0}, La/znc0;->H0()La/doc0;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    const/4 v12, 0x0

    .line 57
    const/16 v13, 0x19

    .line 58
    .line 59
    const/4 v7, 0x1

    .line 60
    const-class v17, La/doc0;

    .line 61
    .line 62
    const-string v10, "onSimpleItemClicked"

    .line 63
    .line 64
    const-string v11, "onSimpleItemClicked(Lorg/xplatform/promo/impl/settings/presentation/adapter/uimodels/simple/PromoSimpleUiItem;)V"

    .line 65
    .line 66
    move-object/from16 v9, v17

    .line 67
    .line 68
    invoke-direct/range {v6 .. v13}, La/l8c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 69
    .line 70
    .line 71
    new-instance v14, La/b0c0;

    .line 72
    .line 73
    invoke-virtual {v0}, La/znc0;->H0()La/doc0;

    .line 74
    .line 75
    .line 76
    move-result-object v16

    .line 77
    const/16 v20, 0x0

    .line 78
    .line 79
    const/16 v21, 0xf

    .line 80
    .line 81
    const/4 v15, 0x0

    .line 82
    const-string v18, "onPromoShopClicked"

    .line 83
    .line 84
    const-string v19, "onPromoShopClicked()V"

    .line 85
    .line 86
    invoke-direct/range {v14 .. v21}, La/b0c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 87
    .line 88
    .line 89
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 90
    .line 91
    .line 92
    new-instance v0, La/ksc0;

    .line 93
    .line 94
    const/4 v2, 0x4

    .line 95
    invoke-direct {v0, v2}, La/ksc0;-><init>(B)V

    .line 96
    .line 97
    .line 98
    new-instance v4, La/ljc0;

    .line 99
    .line 100
    const/16 v7, 0xa

    .line 101
    .line 102
    invoke-direct {v4, v7}, La/ljc0;-><init>(B)V

    .line 103
    .line 104
    .line 105
    new-instance v7, La/o5c0;

    .line 106
    .line 107
    const/16 v8, 0xd

    .line 108
    .line 109
    const/4 v9, 0x3

    .line 110
    invoke-direct {v7, v9, v8}, La/o5c0;-><init>(IB)V

    .line 111
    .line 112
    .line 113
    sget-object v8, La/x4c0;->p:La/x4c0;

    .line 114
    .line 115
    new-instance v10, La/gbn;

    .line 116
    .line 117
    invoke-direct {v10, v0, v7, v4, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, v1, La/zz3;->d:La/dp;

    .line 121
    .line 122
    invoke-virtual {v0, v10}, La/dp;->b(La/gbn;)V

    .line 123
    .line 124
    .line 125
    invoke-static {}, La/x1x;->I()La/gbn;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-virtual {v0, v4}, La/dp;->b(La/gbn;)V

    .line 130
    .line 131
    .line 132
    new-instance v4, La/t4c0;

    .line 133
    .line 134
    invoke-direct {v4, v2}, La/t4c0;-><init>(B)V

    .line 135
    .line 136
    .line 137
    new-instance v2, La/wyb0;

    .line 138
    .line 139
    const/16 v7, 0xb

    .line 140
    .line 141
    invoke-direct {v2, v7}, La/wyb0;-><init>(B)V

    .line 142
    .line 143
    .line 144
    new-instance v7, La/o5c0;

    .line 145
    .line 146
    invoke-direct {v7, v9, v5}, La/o5c0;-><init>(IB)V

    .line 147
    .line 148
    .line 149
    sget-object v8, La/x4c0;->c:La/x4c0;

    .line 150
    .line 151
    new-instance v10, La/gbn;

    .line 152
    .line 153
    invoke-direct {v10, v4, v7, v2, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v10}, La/dp;->b(La/gbn;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v3, v6}, La/m2x;->A(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v0, v2}, La/dp;->b(La/gbn;)V

    .line 164
    .line 165
    .line 166
    new-instance v2, La/t4c0;

    .line 167
    .line 168
    const/4 v3, 0x6

    .line 169
    invoke-direct {v2, v3}, La/t4c0;-><init>(B)V

    .line 170
    .line 171
    .line 172
    new-instance v3, La/v5c0;

    .line 173
    .line 174
    invoke-direct {v3, v14, v5}, La/v5c0;-><init>(La/b0c0;B)V

    .line 175
    .line 176
    .line 177
    new-instance v4, La/o5c0;

    .line 178
    .line 179
    const/4 v5, 0x2

    .line 180
    invoke-direct {v4, v9, v5}, La/o5c0;-><init>(IB)V

    .line 181
    .line 182
    .line 183
    sget-object v5, La/x4c0;->e:La/x4c0;

    .line 184
    .line 185
    new-instance v6, La/gbn;

    .line 186
    .line 187
    invoke-direct {v6, v2, v4, v3, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 191
    .line 192
    .line 193
    return-object v1

    .line 194
    :pswitch_0
    new-instance v1, La/q0h0;

    .line 195
    .line 196
    iget-object v0, v0, La/znc0;->O1:La/wpi;

    .line 197
    .line 198
    if-eqz v0, :cond_1

    .line 199
    .line 200
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 201
    .line 202
    .line 203
    return-object v1

    .line 204
    :cond_1
    const-string v0, "viewModelFactory"

    .line 205
    .line 206
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    const/4 v0, 0x0

    .line 210
    throw v0

    .line 211
    :pswitch_1
    sget-object v1, La/znc0;->U1:La/rl70;

    .line 212
    .line 213
    invoke-virtual {v0}, La/znc0;->H0()La/doc0;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    iget-object v0, v0, La/doc0;->c:La/tac0;

    .line 218
    .line 219
    invoke-virtual {v0}, La/tac0;->x()V

    .line 220
    .line 221
    .line 222
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    return-object v0

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
