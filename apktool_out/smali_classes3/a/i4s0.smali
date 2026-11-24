.class public final La/i4s0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:J

.field public final synthetic k:La/z1s0;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:La/i3t0;


# direct methods
.method public synthetic constructor <init>(La/i3t0;JLa/z1s0;Ljava/lang/String;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/i4s0;->i:B

    iput-object p1, p0, La/i4s0;->m:La/i3t0;

    iput-wide p2, p0, La/i4s0;->j:J

    iput-object p4, p0, La/i4s0;->k:La/z1s0;

    iput-object p5, p0, La/i4s0;->l:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 11

    .line 1
    iget-byte v0, p0, La/i4s0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/i4s0;->m:La/i3t0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/i4s0;

    .line 9
    .line 10
    move-object v3, v1

    .line 11
    check-cast v3, La/l7s0;

    .line 12
    .line 13
    iget-object v7, p0, La/i4s0;->l:Ljava/lang/String;

    .line 14
    .line 15
    const/4 v9, 0x2

    .line 16
    iget-wide v4, p0, La/i4s0;->j:J

    .line 17
    .line 18
    iget-object v6, p0, La/i4s0;->k:La/z1s0;

    .line 19
    .line 20
    move-object v8, p1

    .line 21
    invoke-direct/range {v2 .. v9}, La/i4s0;-><init>(La/i3t0;JLa/z1s0;Ljava/lang/String;La/yje;B)V

    .line 22
    .line 23
    .line 24
    return-object v2

    .line 25
    :pswitch_0
    move-object v9, p1

    .line 26
    new-instance v3, La/i4s0;

    .line 27
    .line 28
    move-object v4, v1

    .line 29
    check-cast v4, La/n6s0;

    .line 30
    .line 31
    iget-object v8, p0, La/i4s0;->l:Ljava/lang/String;

    .line 32
    .line 33
    const/4 v10, 0x1

    .line 34
    iget-wide v5, p0, La/i4s0;->j:J

    .line 35
    .line 36
    iget-object v7, p0, La/i4s0;->k:La/z1s0;

    .line 37
    .line 38
    invoke-direct/range {v3 .. v10}, La/i4s0;-><init>(La/i3t0;JLa/z1s0;Ljava/lang/String;La/yje;B)V

    .line 39
    .line 40
    .line 41
    return-object v3

    .line 42
    :pswitch_1
    move-object v9, p1

    .line 43
    new-instance v3, La/i4s0;

    .line 44
    .line 45
    move-object v4, v1

    .line 46
    check-cast v4, La/k4s0;

    .line 47
    .line 48
    iget-object v8, p0, La/i4s0;->l:Ljava/lang/String;

    .line 49
    .line 50
    const/4 v10, 0x0

    .line 51
    iget-wide v5, p0, La/i4s0;->j:J

    .line 52
    .line 53
    iget-object v7, p0, La/i4s0;->k:La/z1s0;

    .line 54
    .line 55
    invoke-direct/range {v3 .. v10}, La/i4s0;-><init>(La/i3t0;JLa/z1s0;Ljava/lang/String;La/yje;B)V

    .line 56
    .line 57
    .line 58
    return-object v3

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/i4s0;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/i4s0;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/i4s0;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/i4s0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/i4s0;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/i4s0;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/i4s0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/i4s0;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/i4s0;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/i4s0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/i4s0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/i4s0;->m:La/i3t0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/wne;->a:La/wne;

    .line 9
    .line 10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, La/l7s0;

    .line 15
    .line 16
    sget p1, La/l7s0;->z:I

    .line 17
    .line 18
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v0, La/g4s0;

    .line 23
    .line 24
    const/16 v1, 0xc

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/g4s0;-><init>(B)V

    .line 27
    .line 28
    .line 29
    iget-object v1, v3, La/l7s0;->s:La/mne;

    .line 30
    .line 31
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 32
    .line 33
    new-instance v2, La/fl3;

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    const/16 v9, 0x8

    .line 37
    .line 38
    iget-wide v4, p0, La/i4s0;->j:J

    .line 39
    .line 40
    iget-object v6, p0, La/i4s0;->k:La/z1s0;

    .line 41
    .line 42
    iget-object v7, p0, La/i4s0;->l:Ljava/lang/String;

    .line 43
    .line 44
    invoke-direct/range {v2 .. v9}, La/fl3;-><init>(La/i3t0;JLa/z1s0;Ljava/lang/String;La/yje;B)V

    .line 45
    .line 46
    .line 47
    const/16 v9, 0xa

    .line 48
    .line 49
    const/4 v6, 0x0

    .line 50
    move-object v4, p1

    .line 51
    move-object v5, v0

    .line 52
    move-object v7, v1

    .line 53
    move-object v8, v2

    .line 54
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 61
    .line 62
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object v3, v1

    .line 66
    check-cast v3, La/n6s0;

    .line 67
    .line 68
    sget p1, La/n6s0;->A:I

    .line 69
    .line 70
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    new-instance v0, La/g4s0;

    .line 75
    .line 76
    const/4 v1, 0x7

    .line 77
    invoke-direct {v0, v1}, La/g4s0;-><init>(B)V

    .line 78
    .line 79
    .line 80
    iget-object v1, v3, La/n6s0;->q:La/mne;

    .line 81
    .line 82
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 83
    .line 84
    new-instance v2, La/fl3;

    .line 85
    .line 86
    const/4 v8, 0x0

    .line 87
    const/4 v9, 0x7

    .line 88
    iget-wide v4, p0, La/i4s0;->j:J

    .line 89
    .line 90
    iget-object v6, p0, La/i4s0;->k:La/z1s0;

    .line 91
    .line 92
    iget-object v7, p0, La/i4s0;->l:Ljava/lang/String;

    .line 93
    .line 94
    invoke-direct/range {v2 .. v9}, La/fl3;-><init>(La/i3t0;JLa/z1s0;Ljava/lang/String;La/yje;B)V

    .line 95
    .line 96
    .line 97
    const/16 v9, 0xa

    .line 98
    .line 99
    const/4 v6, 0x0

    .line 100
    move-object v4, p1

    .line 101
    move-object v5, v0

    .line 102
    move-object v7, v1

    .line 103
    move-object v8, v2

    .line 104
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 105
    .line 106
    .line 107
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object p0

    .line 110
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 111
    .line 112
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    move-object v3, v1

    .line 116
    check-cast v3, La/k4s0;

    .line 117
    .line 118
    sget p1, La/k4s0;->A:I

    .line 119
    .line 120
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    new-instance v0, La/g4s0;

    .line 125
    .line 126
    const/4 v1, 0x2

    .line 127
    invoke-direct {v0, v1}, La/g4s0;-><init>(B)V

    .line 128
    .line 129
    .line 130
    iget-object v1, v3, La/k4s0;->q:La/mne;

    .line 131
    .line 132
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 133
    .line 134
    new-instance v2, La/fl3;

    .line 135
    .line 136
    const/4 v8, 0x0

    .line 137
    const/4 v9, 0x6

    .line 138
    iget-wide v4, p0, La/i4s0;->j:J

    .line 139
    .line 140
    iget-object v6, p0, La/i4s0;->k:La/z1s0;

    .line 141
    .line 142
    iget-object v7, p0, La/i4s0;->l:Ljava/lang/String;

    .line 143
    .line 144
    invoke-direct/range {v2 .. v9}, La/fl3;-><init>(La/i3t0;JLa/z1s0;Ljava/lang/String;La/yje;B)V

    .line 145
    .line 146
    .line 147
    const/16 v9, 0xa

    .line 148
    .line 149
    const/4 v6, 0x0

    .line 150
    move-object v4, p1

    .line 151
    move-object v5, v0

    .line 152
    move-object v7, v1

    .line 153
    move-object v8, v2

    .line 154
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 155
    .line 156
    .line 157
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object p0

    .line 160
    nop

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
