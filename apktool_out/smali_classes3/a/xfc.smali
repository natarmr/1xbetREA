.class public final La/xfc;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/i3t0;

.field public final synthetic k:La/clz;

.field public final synthetic l:La/pz40;


# direct methods
.method public constructor <init>(La/i3t0;La/clz;La/pz40;La/yje;B)V
    .locals 1

    .line 1
    iput-byte p5, p0, La/xfc;->i:B

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    packed-switch p5, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object p5, La/lkz;->a:La/lkz;

    .line 8
    .line 9
    iput-object p1, p0, La/xfc;->j:La/i3t0;

    .line 10
    .line 11
    iput-object p2, p0, La/xfc;->k:La/clz;

    .line 12
    .line 13
    iput-object p3, p0, La/xfc;->l:La/pz40;

    .line 14
    .line 15
    invoke-direct {p0, v0, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    sget-object p5, La/lkz;->a:La/lkz;

    .line 20
    .line 21
    iput-object p1, p0, La/xfc;->j:La/i3t0;

    .line 22
    .line 23
    iput-object p2, p0, La/xfc;->k:La/clz;

    .line 24
    .line 25
    iput-object p3, p0, La/xfc;->l:La/pz40;

    .line 26
    .line 27
    invoke-direct {p0, v0, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    sget-object p5, La/lkz;->a:La/lkz;

    .line 32
    .line 33
    iput-object p1, p0, La/xfc;->j:La/i3t0;

    .line 34
    .line 35
    iput-object p2, p0, La/xfc;->k:La/clz;

    .line 36
    .line 37
    iput-object p3, p0, La/xfc;->l:La/pz40;

    .line 38
    .line 39
    invoke-direct {p0, v0, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/xfc;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/xfc;

    .line 7
    .line 8
    sget-object p1, La/lkz;->a:La/lkz;

    .line 9
    .line 10
    iget-object v3, p0, La/xfc;->l:La/pz40;

    .line 11
    .line 12
    const/4 v5, 0x2

    .line 13
    iget-object v1, p0, La/xfc;->j:La/i3t0;

    .line 14
    .line 15
    iget-object v2, p0, La/xfc;->k:La/clz;

    .line 16
    .line 17
    move-object v4, p2

    .line 18
    invoke-direct/range {v0 .. v5}, La/xfc;-><init>(La/i3t0;La/clz;La/pz40;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    move-object v5, p2

    .line 23
    new-instance v1, La/xfc;

    .line 24
    .line 25
    sget-object p1, La/lkz;->a:La/lkz;

    .line 26
    .line 27
    iget-object v4, p0, La/xfc;->l:La/pz40;

    .line 28
    .line 29
    const/4 v6, 0x1

    .line 30
    iget-object v2, p0, La/xfc;->j:La/i3t0;

    .line 31
    .line 32
    iget-object v3, p0, La/xfc;->k:La/clz;

    .line 33
    .line 34
    invoke-direct/range {v1 .. v6}, La/xfc;-><init>(La/i3t0;La/clz;La/pz40;La/yje;B)V

    .line 35
    .line 36
    .line 37
    return-object v1

    .line 38
    :pswitch_1
    move-object v5, p2

    .line 39
    new-instance v1, La/xfc;

    .line 40
    .line 41
    sget-object p1, La/lkz;->a:La/lkz;

    .line 42
    .line 43
    iget-object v4, p0, La/xfc;->l:La/pz40;

    .line 44
    .line 45
    const/4 v6, 0x0

    .line 46
    iget-object v2, p0, La/xfc;->j:La/i3t0;

    .line 47
    .line 48
    iget-object v3, p0, La/xfc;->k:La/clz;

    .line 49
    .line 50
    invoke-direct/range {v1 .. v6}, La/xfc;-><init>(La/i3t0;La/clz;La/pz40;La/yje;B)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/xfc;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/xfc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/xfc;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/xfc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/xfc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/xfc;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/xfc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/xfc;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/xfc;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/xfc;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/xfc;->i:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iget-object v2, p0, La/xfc;->l:La/pz40;

    .line 5
    .line 6
    iget-object v3, p0, La/xfc;->j:La/i3t0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3}, La/i3t0;->C()La/gmq;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object v0, La/lkz;->a:La/lkz;

    .line 21
    .line 22
    new-instance v3, La/yn90;

    .line 23
    .line 24
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v5, v0

    .line 29
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const/16 v10, 0x1a

    .line 33
    .line 34
    const/4 v4, 0x2

    .line 35
    const-class v6, La/knx;

    .line 36
    .line 37
    const-string v7, "suspendConversion0"

    .line 38
    .line 39
    const-string v8, "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 40
    .line 41
    invoke-direct/range {v3 .. v10}, La/yn90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 42
    .line 43
    .line 44
    iget-object v5, p0, La/xfc;->k:La/clz;

    .line 45
    .line 46
    invoke-static {v5}, La/g1x;->u(La/clz;)La/tkz;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    move-object v6, v3

    .line 51
    new-instance v3, La/fxc0;

    .line 52
    .line 53
    move-object v4, p1

    .line 54
    check-cast v4, La/i89;

    .line 55
    .line 56
    const/4 v8, 0x0

    .line 57
    const/4 v7, 0x0

    .line 58
    invoke-direct/range {v3 .. v8}, La/fxc0;-><init>(La/i89;La/clz;La/yn90;La/yje;C)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, v7, v7, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 68
    .line 69
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, La/i3t0;->C()La/gmq;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    sget-object v0, La/lkz;->a:La/lkz;

    .line 77
    .line 78
    new-instance v3, La/mhc;

    .line 79
    .line 80
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    move-object v5, v0

    .line 85
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 86
    .line 87
    const/4 v9, 0x0

    .line 88
    const/16 v10, 0x16

    .line 89
    .line 90
    const/4 v4, 0x2

    .line 91
    const-class v6, La/knx;

    .line 92
    .line 93
    const-string v7, "suspendConversion0"

    .line 94
    .line 95
    const-string v8, "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 96
    .line 97
    invoke-direct/range {v3 .. v10}, La/mhc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 98
    .line 99
    .line 100
    iget-object v5, p0, La/xfc;->k:La/clz;

    .line 101
    .line 102
    invoke-static {v5}, La/g1x;->u(La/clz;)La/tkz;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    move-object v6, v3

    .line 107
    new-instance v3, La/g8g;

    .line 108
    .line 109
    move-object v4, p1

    .line 110
    check-cast v4, La/i89;

    .line 111
    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v7, 0x0

    .line 114
    invoke-direct/range {v3 .. v8}, La/g8g;-><init>(La/i89;La/clz;La/mhc;La/yje;I)V

    .line 115
    .line 116
    .line 117
    invoke-static {p0, v7, v7, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 118
    .line 119
    .line 120
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 124
    .line 125
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3}, La/i3t0;->C()La/gmq;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    sget-object v0, La/lkz;->a:La/lkz;

    .line 133
    .line 134
    new-instance v3, La/o47;

    .line 135
    .line 136
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    move-object v5, v0

    .line 141
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 142
    .line 143
    const/4 v9, 0x0

    .line 144
    const/16 v10, 0x1d

    .line 145
    .line 146
    const/4 v4, 0x2

    .line 147
    const-class v6, La/knx;

    .line 148
    .line 149
    const-string v7, "suspendConversion0"

    .line 150
    .line 151
    const-string v8, "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 152
    .line 153
    invoke-direct/range {v3 .. v10}, La/o47;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 154
    .line 155
    .line 156
    iget-object v5, p0, La/xfc;->k:La/clz;

    .line 157
    .line 158
    invoke-static {v5}, La/g1x;->u(La/clz;)La/tkz;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    move-object v6, v3

    .line 163
    new-instance v3, La/vxb;

    .line 164
    .line 165
    move-object v4, p1

    .line 166
    check-cast v4, La/i89;

    .line 167
    .line 168
    const/4 v8, 0x0

    .line 169
    const/4 v7, 0x0

    .line 170
    invoke-direct/range {v3 .. v8}, La/vxb;-><init>(La/i89;La/clz;La/o47;La/yje;C)V

    .line 171
    .line 172
    .line 173
    invoke-static {p0, v7, v7, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 174
    .line 175
    .line 176
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object p0

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
