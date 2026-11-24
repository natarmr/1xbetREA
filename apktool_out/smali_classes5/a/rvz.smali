.class public final synthetic La/rvz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/uvz;


# direct methods
.method public synthetic constructor <init>(La/uvz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rvz;->a:B

    iput-object p1, p0, La/rvz;->b:La/uvz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/rvz;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rvz;->b:La/uvz;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/uvz;->P1:[La/iiy;

    .line 9
    .line 10
    new-instance v0, La/ezz;

    .line 11
    .line 12
    new-instance v1, La/svz;

    .line 13
    .line 14
    invoke-virtual {p0}, La/uvz;->H0()La/g500;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v2, 0x1

    .line 21
    const-class v4, La/g500;

    .line 22
    .line 23
    const-string v5, "onLimitClicked"

    .line 24
    .line 25
    const-string v6, "onLimitClicked(Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;)V"

    .line 26
    .line 27
    invoke-direct/range {v1 .. v8}, La/svz;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance p0, La/hvy;

    .line 34
    .line 35
    const/16 v2, 0x18

    .line 36
    .line 37
    invoke-direct {p0, v2}, La/hvy;-><init>(B)V

    .line 38
    .line 39
    .line 40
    new-instance v2, La/z8z;

    .line 41
    .line 42
    const/16 v3, 0x12

    .line 43
    .line 44
    invoke-direct {v2, v3}, La/z8z;-><init>(B)V

    .line 45
    .line 46
    .line 47
    new-instance v4, La/tvx;

    .line 48
    .line 49
    const/4 v5, 0x7

    .line 50
    const/4 v6, 0x3

    .line 51
    invoke-direct {v4, v6, v5}, La/tvx;-><init>(IB)V

    .line 52
    .line 53
    .line 54
    sget-object v5, La/gvy;->f:La/gvy;

    .line 55
    .line 56
    new-instance v7, La/gbn;

    .line 57
    .line 58
    invoke-direct {v7, p0, v4, v2, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 59
    .line 60
    .line 61
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 62
    .line 63
    invoke-virtual {p0, v7}, La/dp;->b(La/gbn;)V

    .line 64
    .line 65
    .line 66
    new-instance v2, La/hvy;

    .line 67
    .line 68
    const/16 v4, 0x14

    .line 69
    .line 70
    invoke-direct {v2, v4}, La/hvy;-><init>(B)V

    .line 71
    .line 72
    .line 73
    new-instance v5, La/ebz;

    .line 74
    .line 75
    const/16 v7, 0x10

    .line 76
    .line 77
    invoke-direct {v5, v1, v7}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 78
    .line 79
    .line 80
    new-instance v1, La/tvx;

    .line 81
    .line 82
    const/4 v7, 0x6

    .line 83
    invoke-direct {v1, v6, v7}, La/tvx;-><init>(IB)V

    .line 84
    .line 85
    .line 86
    sget-object v7, La/gvy;->e:La/gvy;

    .line 87
    .line 88
    new-instance v8, La/gbn;

    .line 89
    .line 90
    invoke-direct {v8, v2, v1, v5, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v8}, La/dp;->b(La/gbn;)V

    .line 94
    .line 95
    .line 96
    new-instance v1, La/hvy;

    .line 97
    .line 98
    const/16 v2, 0x19

    .line 99
    .line 100
    invoke-direct {v1, v2}, La/hvy;-><init>(B)V

    .line 101
    .line 102
    .line 103
    new-instance v2, La/z8z;

    .line 104
    .line 105
    const/16 v5, 0x13

    .line 106
    .line 107
    invoke-direct {v2, v5}, La/z8z;-><init>(B)V

    .line 108
    .line 109
    .line 110
    new-instance v7, La/tvx;

    .line 111
    .line 112
    const/16 v8, 0x8

    .line 113
    .line 114
    invoke-direct {v7, v6, v8}, La/tvx;-><init>(IB)V

    .line 115
    .line 116
    .line 117
    sget-object v8, La/gvy;->g:La/gvy;

    .line 118
    .line 119
    new-instance v9, La/gbn;

    .line 120
    .line 121
    invoke-direct {v9, v1, v7, v2, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v9}, La/dp;->b(La/gbn;)V

    .line 125
    .line 126
    .line 127
    new-instance v1, La/gm10;

    .line 128
    .line 129
    const/4 v2, 0x4

    .line 130
    invoke-direct {v1, v2}, La/gm10;-><init>(B)V

    .line 131
    .line 132
    .line 133
    new-instance v2, La/p610;

    .line 134
    .line 135
    invoke-direct {v2, v5}, La/p610;-><init>(B)V

    .line 136
    .line 137
    .line 138
    new-instance v7, La/tvx;

    .line 139
    .line 140
    invoke-direct {v7, v6, v3}, La/tvx;-><init>(IB)V

    .line 141
    .line 142
    .line 143
    sget-object v3, La/gvy;->t:La/gvy;

    .line 144
    .line 145
    new-instance v8, La/gbn;

    .line 146
    .line 147
    invoke-direct {v8, v1, v7, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, v8}, La/dp;->b(La/gbn;)V

    .line 151
    .line 152
    .line 153
    new-instance v1, La/gm10;

    .line 154
    .line 155
    invoke-direct {v1, v4}, La/gm10;-><init>(B)V

    .line 156
    .line 157
    .line 158
    new-instance v2, La/p610;

    .line 159
    .line 160
    invoke-direct {v2, v4}, La/p610;-><init>(B)V

    .line 161
    .line 162
    .line 163
    new-instance v3, La/tvx;

    .line 164
    .line 165
    invoke-direct {v3, v6, v5}, La/tvx;-><init>(IB)V

    .line 166
    .line 167
    .line 168
    sget-object v4, La/gvy;->u:La/gvy;

    .line 169
    .line 170
    new-instance v5, La/gbn;

    .line 171
    .line 172
    invoke-direct {v5, v1, v3, v2, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, v5}, La/dp;->b(La/gbn;)V

    .line 176
    .line 177
    .line 178
    return-object v0

    .line 179
    :pswitch_0
    sget-object v0, La/uvz;->P1:[La/iiy;

    .line 180
    .line 181
    new-instance v0, La/ry3;

    .line 182
    .line 183
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iget-object p0, p0, La/uvz;->K1:La/oji;

    .line 188
    .line 189
    if-eqz p0, :cond_0

    .line 190
    .line 191
    invoke-direct {v0, v1, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 192
    .line 193
    .line 194
    return-object v0

    .line 195
    :cond_0
    const-string p0, "viewModelFactory"

    .line 196
    .line 197
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    const/4 p0, 0x0

    .line 201
    throw p0

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
