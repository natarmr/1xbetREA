.class public final synthetic La/wi90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/aj90;


# direct methods
.method public synthetic constructor <init>(La/aj90;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wi90;->a:B

    iput-object p1, p0, La/wi90;->b:La/aj90;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/wi90;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/wi90;->b:La/aj90;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/aj90;->S1:La/fl70;

    .line 10
    .line 11
    new-instance v0, La/ti90;

    .line 12
    .line 13
    new-instance v2, La/xj80;

    .line 14
    .line 15
    invoke-virtual {p0}, La/aj90;->H0()La/kk90;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v8, 0x0

    .line 20
    const/16 v9, 0x1d

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    const-class v5, La/kk90;

    .line 24
    .line 25
    const-string v6, "onItemClicked"

    .line 26
    .line 27
    const-string v7, "onItemClicked(Lorg/xplatform/personal/impl/presentation/personal/ui_model/PersonalDataItemType;)V"

    .line 28
    .line 29
    invoke-direct/range {v2 .. v9}, La/xj80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance p0, La/ch90;

    .line 36
    .line 37
    const/16 v3, 0x15

    .line 38
    .line 39
    invoke-direct {p0, v3}, La/ch90;-><init>(B)V

    .line 40
    .line 41
    .line 42
    new-instance v3, La/qi90;

    .line 43
    .line 44
    const/4 v4, 0x1

    .line 45
    invoke-direct {v3, v2, v4}, La/qi90;-><init>(La/xj80;B)V

    .line 46
    .line 47
    .line 48
    new-instance v4, La/iv60;

    .line 49
    .line 50
    const/4 v5, 0x6

    .line 51
    const/4 v6, 0x3

    .line 52
    invoke-direct {v4, v6, v5}, La/iv60;-><init>(IB)V

    .line 53
    .line 54
    .line 55
    sget-object v5, La/xk60;->i:La/xk60;

    .line 56
    .line 57
    new-instance v7, La/gbn;

    .line 58
    .line 59
    invoke-direct {v7, p0, v4, v3, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 60
    .line 61
    .line 62
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 63
    .line 64
    invoke-virtual {p0, v7}, La/dp;->b(La/gbn;)V

    .line 65
    .line 66
    .line 67
    new-instance v3, La/ch90;

    .line 68
    .line 69
    const/16 v4, 0x16

    .line 70
    .line 71
    invoke-direct {v3, v4}, La/ch90;-><init>(B)V

    .line 72
    .line 73
    .line 74
    new-instance v4, La/ev80;

    .line 75
    .line 76
    const/16 v5, 0x18

    .line 77
    .line 78
    invoke-direct {v4, v5}, La/ev80;-><init>(B)V

    .line 79
    .line 80
    .line 81
    new-instance v5, La/iv60;

    .line 82
    .line 83
    const/4 v7, 0x7

    .line 84
    invoke-direct {v5, v6, v7}, La/iv60;-><init>(IB)V

    .line 85
    .line 86
    .line 87
    sget-object v7, La/xk60;->j:La/xk60;

    .line 88
    .line 89
    new-instance v8, La/gbn;

    .line 90
    .line 91
    invoke-direct {v8, v3, v5, v4, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v8}, La/dp;->b(La/gbn;)V

    .line 95
    .line 96
    .line 97
    new-instance v3, La/ch90;

    .line 98
    .line 99
    const/16 v4, 0x14

    .line 100
    .line 101
    invoke-direct {v3, v4}, La/ch90;-><init>(B)V

    .line 102
    .line 103
    .line 104
    new-instance v4, La/qi90;

    .line 105
    .line 106
    invoke-direct {v4, v2, v1}, La/qi90;-><init>(La/xj80;B)V

    .line 107
    .line 108
    .line 109
    new-instance v1, La/iv60;

    .line 110
    .line 111
    const/4 v2, 0x5

    .line 112
    invoke-direct {v1, v6, v2}, La/iv60;-><init>(IB)V

    .line 113
    .line 114
    .line 115
    sget-object v2, La/xk60;->h:La/xk60;

    .line 116
    .line 117
    new-instance v5, La/gbn;

    .line 118
    .line 119
    invoke-direct {v5, v3, v1, v4, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0, v5}, La/dp;->b(La/gbn;)V

    .line 123
    .line 124
    .line 125
    new-instance v1, La/ch90;

    .line 126
    .line 127
    const/16 v2, 0x17

    .line 128
    .line 129
    invoke-direct {v1, v2}, La/ch90;-><init>(B)V

    .line 130
    .line 131
    .line 132
    new-instance v2, La/ev80;

    .line 133
    .line 134
    const/16 v3, 0x19

    .line 135
    .line 136
    invoke-direct {v2, v3}, La/ev80;-><init>(B)V

    .line 137
    .line 138
    .line 139
    new-instance v3, La/iv60;

    .line 140
    .line 141
    const/16 v4, 0x8

    .line 142
    .line 143
    invoke-direct {v3, v6, v4}, La/iv60;-><init>(IB)V

    .line 144
    .line 145
    .line 146
    sget-object v4, La/xk60;->k:La/xk60;

    .line 147
    .line 148
    new-instance v5, La/gbn;

    .line 149
    .line 150
    invoke-direct {v5, v1, v3, v2, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0, v5}, La/dp;->b(La/gbn;)V

    .line 154
    .line 155
    .line 156
    return-object v0

    .line 157
    :pswitch_0
    iget-object p0, p0, La/aj90;->L1:La/fiu0;

    .line 158
    .line 159
    if-eqz p0, :cond_0

    .line 160
    .line 161
    return-object p0

    .line 162
    :cond_0
    const-string p0, "viewModelFactory"

    .line 163
    .line 164
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    const/4 p0, 0x0

    .line 168
    throw p0

    .line 169
    :pswitch_1
    sget-object v0, La/aj90;->S1:La/fl70;

    .line 170
    .line 171
    invoke-virtual {p0}, La/aj90;->H0()La/kk90;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    iget-object p0, p0, La/kk90;->p:La/i1w0;

    .line 176
    .line 177
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    new-instance v2, La/c8d;

    .line 182
    .line 183
    sget-object v3, La/y7d;->a:La/v7d;

    .line 184
    .line 185
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 186
    .line 187
    invoke-direct {v2, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 188
    .line 189
    .line 190
    invoke-static {v0, v2, p0, v0, v1}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    :goto_0
    move-object v1, v0

    .line 195
    check-cast v1, La/paw;

    .line 196
    .line 197
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-eqz v2, :cond_1

    .line 202
    .line 203
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    check-cast v1, La/oe50;

    .line 208
    .line 209
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 210
    .line 211
    .line 212
    goto :goto_0

    .line 213
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object p0

    .line 216
    nop

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
