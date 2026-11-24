.class public final synthetic La/hjr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ljr;


# direct methods
.method public synthetic constructor <init>(La/ljr;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hjr;->a:B

    iput-object p1, p0, La/hjr;->b:La/ljr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/hjr;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/hjr;->b:La/ljr;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/ljr;->Q1:[La/iiy;

    .line 9
    .line 10
    invoke-virtual {p0}, La/ljr;->H0()La/vkr;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object v0, p0, La/vkr;->d:La/lef0;

    .line 15
    .line 16
    sget-object v1, La/iun;->a:La/iun;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, La/lef0;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, La/pmi;

    .line 27
    .line 28
    iget-object v0, v0, La/pmi;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, La/xio;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iput-object v1, v0, La/xio;->b:Ljava/util/List;

    .line 36
    .line 37
    iget-object v0, p0, La/vkr;->c:La/ani0;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v0, v0, La/ani0;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, La/pmi;

    .line 45
    .line 46
    iget-object v0, v0, La/pmi;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, La/xio;

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iput-object v1, v0, La/xio;->b:Ljava/util/List;

    .line 54
    .line 55
    iput-object v1, v0, La/xio;->c:Ljava/util/List;

    .line 56
    .line 57
    iget-object p0, p0, La/vkr;->b:La/i1w0;

    .line 58
    .line 59
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    new-instance v1, Lorg/xplatform/responsible_game/impl/navigation/ResponsibleGamblingScreens$LimitsScreen;

    .line 64
    .line 65
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 66
    .line 67
    .line 68
    new-instance v2, La/q0w0;

    .line 69
    .line 70
    invoke-direct {v2, v1}, La/q0w0;-><init>(La/m7h0;)V

    .line 71
    .line 72
    .line 73
    new-instance v1, La/c8d;

    .line 74
    .line 75
    sget-object v3, La/y7d;->a:La/v7d;

    .line 76
    .line 77
    invoke-direct {v1, v3, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 78
    .line 79
    .line 80
    const/4 v2, 0x0

    .line 81
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    :goto_0
    move-object v1, v0

    .line 86
    check-cast v1, La/paw;

    .line 87
    .line 88
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_0

    .line 93
    .line 94
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, La/oe50;

    .line 99
    .line 100
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    return-object p0

    .line 107
    :pswitch_0
    sget-object v0, La/ljr;->Q1:[La/iiy;

    .line 108
    .line 109
    new-instance v0, La/cjr;

    .line 110
    .line 111
    new-instance v1, La/brk;

    .line 112
    .line 113
    invoke-virtual {p0}, La/ljr;->H0()La/vkr;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    const/4 v7, 0x0

    .line 118
    const/16 v8, 0x18

    .line 119
    .line 120
    const/4 v2, 0x2

    .line 121
    const-class v4, La/vkr;

    .line 122
    .line 123
    const-string v5, "questionAnswered"

    .line 124
    .line 125
    const-string v6, "questionAnswered(Lorg/xplatform/responsible_game/impl/presentation/limits/deposit_limit/gambling_exam/models/GamblingExamQuestionUiModel;Lorg/xplatform/responsible_game/impl/presentation/limits/deposit_limit/gambling_exam/models/GamblingExamAnswerUiEnum;)V"

    .line 126
    .line 127
    invoke-direct/range {v1 .. v8}, La/brk;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 128
    .line 129
    .line 130
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 131
    .line 132
    .line 133
    new-instance p0, La/nuq;

    .line 134
    .line 135
    const/4 v2, 0x6

    .line 136
    invoke-direct {p0, v2}, La/nuq;-><init>(B)V

    .line 137
    .line 138
    .line 139
    new-instance v3, La/g7p;

    .line 140
    .line 141
    const/16 v4, 0xf

    .line 142
    .line 143
    invoke-direct {v3, v1, v4}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    new-instance v1, La/atq;

    .line 147
    .line 148
    const/4 v4, 0x3

    .line 149
    invoke-direct {v1, v4, v2}, La/atq;-><init>(IB)V

    .line 150
    .line 151
    .line 152
    sget-object v2, La/gzn;->Z:La/gzn;

    .line 153
    .line 154
    new-instance v5, La/gbn;

    .line 155
    .line 156
    invoke-direct {v5, p0, v1, v3, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 157
    .line 158
    .line 159
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 160
    .line 161
    invoke-virtual {p0, v5}, La/dp;->b(La/gbn;)V

    .line 162
    .line 163
    .line 164
    new-instance v1, La/nuq;

    .line 165
    .line 166
    const/4 v2, 0x4

    .line 167
    invoke-direct {v1, v2}, La/nuq;-><init>(B)V

    .line 168
    .line 169
    .line 170
    new-instance v2, La/dcr;

    .line 171
    .line 172
    const/4 v3, 0x2

    .line 173
    invoke-direct {v2, v3}, La/dcr;-><init>(B)V

    .line 174
    .line 175
    .line 176
    new-instance v3, La/atq;

    .line 177
    .line 178
    const/4 v5, 0x5

    .line 179
    invoke-direct {v3, v4, v5}, La/atq;-><init>(IB)V

    .line 180
    .line 181
    .line 182
    sget-object v4, La/gzn;->Y:La/gzn;

    .line 183
    .line 184
    new-instance v5, La/gbn;

    .line 185
    .line 186
    invoke-direct {v5, v1, v3, v2, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p0, v5}, La/dp;->b(La/gbn;)V

    .line 190
    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_1
    sget-object v0, La/ljr;->Q1:[La/iiy;

    .line 194
    .line 195
    new-instance v0, La/ry3;

    .line 196
    .line 197
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    iget-object p0, p0, La/ljr;->K1:La/khi;

    .line 202
    .line 203
    if-eqz p0, :cond_1

    .line 204
    .line 205
    invoke-direct {v0, v1, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 206
    .line 207
    .line 208
    return-object v0

    .line 209
    :cond_1
    const-string p0, "viewModelFactory"

    .line 210
    .line 211
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const/4 p0, 0x0

    .line 215
    throw p0

    .line 216
    nop

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
