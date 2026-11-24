.class public final synthetic La/d8b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/h8b0;


# direct methods
.method public synthetic constructor <init>(La/h8b0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/d8b0;->a:B

    iput-object p1, p0, La/d8b0;->b:La/h8b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/d8b0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/d8b0;->b:La/h8b0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/h8b0;->R1:La/rl70;

    .line 9
    .line 10
    new-instance v0, La/ceb0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/h8b0;->H0()La/g9b0;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object p0, p0, La/h8b0;->P1:La/d930;

    .line 17
    .line 18
    const-class v2, La/h8b0;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v3, La/v1x;

    .line 31
    .line 32
    const/16 v4, 0x1d

    .line 33
    .line 34
    invoke-direct {v3, v4}, La/v1x;-><init>(B)V

    .line 35
    .line 36
    .line 37
    new-instance v4, La/a5t;

    .line 38
    .line 39
    const/4 v5, 0x2

    .line 40
    invoke-direct {v4, v1, v2, p0, v5}, La/a5t;-><init>(La/g9b0;Ljava/lang/String;La/d930;B)V

    .line 41
    .line 42
    .line 43
    new-instance v6, La/tvx;

    .line 44
    .line 45
    const/4 v7, 0x3

    .line 46
    invoke-direct {v6, v7, v7}, La/tvx;-><init>(IB)V

    .line 47
    .line 48
    .line 49
    sget-object v8, La/gvy;->b:La/gvy;

    .line 50
    .line 51
    new-instance v9, La/gbn;

    .line 52
    .line 53
    invoke-direct {v9, v3, v6, v4, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 54
    .line 55
    .line 56
    iget-object v3, v0, La/zz3;->d:La/dp;

    .line 57
    .line 58
    invoke-virtual {v3, v9}, La/dp;->b(La/gbn;)V

    .line 59
    .line 60
    .line 61
    new-instance v4, La/hvy;

    .line 62
    .line 63
    const/4 v6, 0x1

    .line 64
    invoke-direct {v4, v6}, La/hvy;-><init>(B)V

    .line 65
    .line 66
    .line 67
    new-instance v8, La/ivy;

    .line 68
    .line 69
    const/4 v9, 0x0

    .line 70
    invoke-direct {v8, v1, v2, v9}, La/ivy;-><init>(La/g9b0;Ljava/lang/String;B)V

    .line 71
    .line 72
    .line 73
    new-instance v10, La/tvx;

    .line 74
    .line 75
    const/4 v11, 0x4

    .line 76
    invoke-direct {v10, v7, v11}, La/tvx;-><init>(IB)V

    .line 77
    .line 78
    .line 79
    sget-object v11, La/gvy;->c:La/gvy;

    .line 80
    .line 81
    new-instance v12, La/gbn;

    .line 82
    .line 83
    invoke-direct {v12, v4, v10, v8, v11}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v3, v12}, La/dp;->b(La/gbn;)V

    .line 87
    .line 88
    .line 89
    new-instance v4, La/s3t;

    .line 90
    .line 91
    invoke-direct {v4, v6}, La/s3t;-><init>(B)V

    .line 92
    .line 93
    .line 94
    new-instance v8, La/a5t;

    .line 95
    .line 96
    invoke-direct {v8, v1, v2, p0, v9}, La/a5t;-><init>(La/g9b0;Ljava/lang/String;La/d930;B)V

    .line 97
    .line 98
    .line 99
    new-instance v9, La/atq;

    .line 100
    .line 101
    const/16 v10, 0x19

    .line 102
    .line 103
    invoke-direct {v9, v7, v10}, La/atq;-><init>(IB)V

    .line 104
    .line 105
    .line 106
    sget-object v10, La/fvr;->s:La/fvr;

    .line 107
    .line 108
    new-instance v11, La/gbn;

    .line 109
    .line 110
    invoke-direct {v11, v4, v9, v8, v10}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v11}, La/dp;->b(La/gbn;)V

    .line 114
    .line 115
    .line 116
    new-instance v4, La/s3t;

    .line 117
    .line 118
    invoke-direct {v4, v7}, La/s3t;-><init>(B)V

    .line 119
    .line 120
    .line 121
    new-instance v8, La/a5t;

    .line 122
    .line 123
    invoke-direct {v8, v1, v2, p0, v6}, La/a5t;-><init>(La/g9b0;Ljava/lang/String;La/d930;B)V

    .line 124
    .line 125
    .line 126
    new-instance p0, La/atq;

    .line 127
    .line 128
    const/16 v9, 0x1b

    .line 129
    .line 130
    invoke-direct {p0, v7, v9}, La/atq;-><init>(IB)V

    .line 131
    .line 132
    .line 133
    sget-object v9, La/fvr;->u:La/fvr;

    .line 134
    .line 135
    new-instance v10, La/gbn;

    .line 136
    .line 137
    invoke-direct {v10, v4, p0, v8, v9}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v3, v10}, La/dp;->b(La/gbn;)V

    .line 141
    .line 142
    .line 143
    new-instance p0, La/j3b0;

    .line 144
    .line 145
    invoke-direct {p0, v7}, La/j3b0;-><init>(B)V

    .line 146
    .line 147
    .line 148
    new-instance v4, La/ivy;

    .line 149
    .line 150
    invoke-direct {v4, v1, v2, v6}, La/ivy;-><init>(La/g9b0;Ljava/lang/String;B)V

    .line 151
    .line 152
    .line 153
    new-instance v1, La/iv60;

    .line 154
    .line 155
    const/16 v2, 0x14

    .line 156
    .line 157
    invoke-direct {v1, v7, v2}, La/iv60;-><init>(IB)V

    .line 158
    .line 159
    .line 160
    sget-object v2, La/xk60;->w:La/xk60;

    .line 161
    .line 162
    new-instance v6, La/gbn;

    .line 163
    .line 164
    invoke-direct {v6, p0, v1, v4, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v6}, La/dp;->b(La/gbn;)V

    .line 168
    .line 169
    .line 170
    new-instance p0, La/s3t;

    .line 171
    .line 172
    invoke-direct {p0, v5}, La/s3t;-><init>(B)V

    .line 173
    .line 174
    .line 175
    new-instance v1, La/vls;

    .line 176
    .line 177
    const/16 v2, 0xa

    .line 178
    .line 179
    invoke-direct {v1, v2}, La/vls;-><init>(B)V

    .line 180
    .line 181
    .line 182
    new-instance v2, La/atq;

    .line 183
    .line 184
    const/16 v4, 0x1a

    .line 185
    .line 186
    invoke-direct {v2, v7, v4}, La/atq;-><init>(IB)V

    .line 187
    .line 188
    .line 189
    sget-object v4, La/fvr;->t:La/fvr;

    .line 190
    .line 191
    new-instance v5, La/gbn;

    .line 192
    .line 193
    invoke-direct {v5, p0, v2, v1, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v3, v5}, La/dp;->b(La/gbn;)V

    .line 197
    .line 198
    .line 199
    return-object v0

    .line 200
    :pswitch_0
    new-instance v0, La/t0h0;

    .line 201
    .line 202
    iget-object v1, p0, La/h8b0;->L1:La/api;

    .line 203
    .line 204
    if-eqz v1, :cond_0

    .line 205
    .line 206
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-direct {v0, v1, p0}, La/t0h0;-><init>(La/j0h0;La/i1w0;)V

    .line 211
    .line 212
    .line 213
    return-object v0

    .line 214
    :cond_0
    const-string p0, "popularOneXGamesViewModelFactory"

    .line 215
    .line 216
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    const/4 p0, 0x0

    .line 220
    throw p0

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
