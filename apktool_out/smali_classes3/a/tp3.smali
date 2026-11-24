.class public final synthetic La/tp3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ayq;

.field public final synthetic c:La/wp3;


# direct methods
.method public synthetic constructor <init>(La/ayq;La/wp3;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/tp3;->a:B

    iput-object p1, p0, La/tp3;->b:La/ayq;

    iput-object p2, p0, La/tp3;->c:La/wp3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/tp3;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, La/tp3;->c:La/wp3;

    .line 6
    .line 7
    iget-object p0, p0, La/tp3;->b:La/ayq;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wp3;->O1:[La/iiy;

    .line 14
    .line 15
    iget-object p0, p0, La/ayq;->b:Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;

    .line 16
    .line 17
    invoke-virtual {p0, v4}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->v(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3}, La/wp3;->H0()La/kq3;

    .line 21
    .line 22
    .line 23
    move-result-object v7

    .line 24
    iget-object v0, v7, La/kq3;->d:La/lzt;

    .line 25
    .line 26
    invoke-virtual {v0}, La/lzt;->a()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v0, v7, La/kq3;->t:La/bby;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-ne v0, v2, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v3, v7, La/kq3;->f:La/mne;

    .line 49
    .line 50
    iget-object v3, v3, La/mne;->a:La/rwj;

    .line 51
    .line 52
    new-instance v5, La/bk2;

    .line 53
    .line 54
    const/4 v11, 0x0

    .line 55
    const/16 v12, 0x10

    .line 56
    .line 57
    const/4 v6, 0x1

    .line 58
    const-class v8, La/kq3;

    .line 59
    .line 60
    const-string v9, "handleGameError"

    .line 61
    .line 62
    const-string v10, "handleGameError(Ljava/lang/Throwable;)V"

    .line 63
    .line 64
    invoke-direct/range {v5 .. v12}, La/bk2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 65
    .line 66
    .line 67
    new-instance v12, La/fq3;

    .line 68
    .line 69
    invoke-direct {v12, v7, v1, v2}, La/fq3;-><init>(La/kq3;La/yje;B)V

    .line 70
    .line 71
    .line 72
    const/16 v13, 0xa

    .line 73
    .line 74
    const/4 v10, 0x0

    .line 75
    move-object v8, v0

    .line 76
    move-object v11, v3

    .line 77
    move-object v9, v5

    .line 78
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, v7, La/kq3;->t:La/bby;

    .line 83
    .line 84
    :goto_0
    iget-object p0, p0, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->s:Landroid/widget/Button;

    .line 85
    .line 86
    invoke-virtual {p0, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 87
    .line 88
    .line 89
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_0
    sget-object v0, La/wp3;->O1:[La/iiy;

    .line 93
    .line 94
    iget-object p0, p0, La/ayq;->b:Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;

    .line 95
    .line 96
    iget-object v0, p0, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->s:Landroid/widget/Button;

    .line 97
    .line 98
    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, v2}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->v(Z)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, La/wp3;->H0()La/kq3;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    iget-object v0, v7, La/kq3;->f:La/mne;

    .line 113
    .line 114
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 115
    .line 116
    new-instance v5, La/bk2;

    .line 117
    .line 118
    const/4 v11, 0x0

    .line 119
    const/16 v12, 0xf

    .line 120
    .line 121
    const/4 v6, 0x1

    .line 122
    const-class v8, La/kq3;

    .line 123
    .line 124
    const-string v9, "handleAppleFortuneError"

    .line 125
    .line 126
    const-string v10, "handleAppleFortuneError(Ljava/lang/Throwable;)V"

    .line 127
    .line 128
    invoke-direct/range {v5 .. v12}, La/bk2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 129
    .line 130
    .line 131
    new-instance v12, La/gq3;

    .line 132
    .line 133
    invoke-direct {v12, v7, v1, v4}, La/gq3;-><init>(La/kq3;La/yje;B)V

    .line 134
    .line 135
    .line 136
    const/16 v13, 0xa

    .line 137
    .line 138
    const/4 v10, 0x0

    .line 139
    move-object v8, p0

    .line 140
    move-object v11, v0

    .line 141
    move-object v9, v5

    .line 142
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 143
    .line 144
    .line 145
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    return-object p0

    .line 148
    :pswitch_1
    sget-object v0, La/wp3;->O1:[La/iiy;

    .line 149
    .line 150
    iget-object p0, p0, La/ayq;->b:Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;

    .line 151
    .line 152
    invoke-virtual {p0, v4}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->C(Z)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3}, La/wp3;->H0()La/kq3;

    .line 156
    .line 157
    .line 158
    move-result-object v7

    .line 159
    invoke-static {v7}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    iget-object v0, v7, La/kq3;->f:La/mne;

    .line 164
    .line 165
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 166
    .line 167
    new-instance v5, La/bk2;

    .line 168
    .line 169
    const/4 v11, 0x0

    .line 170
    const/16 v12, 0xe

    .line 171
    .line 172
    const/4 v6, 0x1

    .line 173
    const-class v8, La/kq3;

    .line 174
    .line 175
    const-string v9, "handleAppleFortuneError"

    .line 176
    .line 177
    const-string v10, "handleAppleFortuneError(Ljava/lang/Throwable;)V"

    .line 178
    .line 179
    invoke-direct/range {v5 .. v12}, La/bk2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 180
    .line 181
    .line 182
    new-instance v12, La/fq3;

    .line 183
    .line 184
    invoke-direct {v12, v7, v1, v4}, La/fq3;-><init>(La/kq3;La/yje;B)V

    .line 185
    .line 186
    .line 187
    const/16 v13, 0xa

    .line 188
    .line 189
    const/4 v10, 0x0

    .line 190
    move-object v8, p0

    .line 191
    move-object v11, v0

    .line 192
    move-object v9, v5

    .line 193
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 194
    .line 195
    .line 196
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    return-object p0

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
