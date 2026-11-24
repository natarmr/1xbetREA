.class public final La/rxt0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/k3t0;

.field public final synthetic k:La/clz;

.field public final synthetic l:La/pz40;


# direct methods
.method public constructor <init>(La/k3t0;La/clz;La/pz40;La/yje;B)V
    .locals 1

    .line 1
    iput-byte p5, p0, La/rxt0;->i:B

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
    iput-object p1, p0, La/rxt0;->j:La/k3t0;

    .line 10
    .line 11
    iput-object p2, p0, La/rxt0;->k:La/clz;

    .line 12
    .line 13
    iput-object p3, p0, La/rxt0;->l:La/pz40;

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
    iput-object p1, p0, La/rxt0;->j:La/k3t0;

    .line 22
    .line 23
    iput-object p2, p0, La/rxt0;->k:La/clz;

    .line 24
    .line 25
    iput-object p3, p0, La/rxt0;->l:La/pz40;

    .line 26
    .line 27
    invoke-direct {p0, v0, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    iget-byte p1, p0, La/rxt0;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/rxt0;

    .line 7
    .line 8
    sget-object p1, La/lkz;->a:La/lkz;

    .line 9
    .line 10
    iget-object v3, p0, La/rxt0;->l:La/pz40;

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    iget-object v1, p0, La/rxt0;->j:La/k3t0;

    .line 14
    .line 15
    iget-object v2, p0, La/rxt0;->k:La/clz;

    .line 16
    .line 17
    move-object v4, p2

    .line 18
    invoke-direct/range {v0 .. v5}, La/rxt0;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    move-object v4, p2

    .line 23
    new-instance v1, La/rxt0;

    .line 24
    .line 25
    sget-object p1, La/lkz;->a:La/lkz;

    .line 26
    .line 27
    move-object v5, v4

    .line 28
    iget-object v4, p0, La/rxt0;->l:La/pz40;

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    iget-object v2, p0, La/rxt0;->j:La/k3t0;

    .line 32
    .line 33
    iget-object v3, p0, La/rxt0;->k:La/clz;

    .line 34
    .line 35
    invoke-direct/range {v1 .. v6}, La/rxt0;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/rxt0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/rxt0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rxt0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/rxt0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/rxt0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/rxt0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/rxt0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/rxt0;->i:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iget-object v2, p0, La/rxt0;->l:La/pz40;

    .line 5
    .line 6
    iget-object v3, p0, La/rxt0;->j:La/k3t0;

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
    check-cast v3, La/i3t0;

    .line 17
    .line 18
    invoke-virtual {v3}, La/i3t0;->C()La/gmq;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object v0, La/lkz;->a:La/lkz;

    .line 23
    .line 24
    new-instance v3, La/gq50;

    .line 25
    .line 26
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    move-object v5, v0

    .line 31
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    const/4 v9, 0x0

    .line 34
    const/16 v10, 0x10

    .line 35
    .line 36
    const/4 v4, 0x2

    .line 37
    const-class v6, La/knx;

    .line 38
    .line 39
    const-string v7, "suspendConversion0"

    .line 40
    .line 41
    const-string v8, "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 42
    .line 43
    invoke-direct/range {v3 .. v10}, La/gq50;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 44
    .line 45
    .line 46
    iget-object v5, p0, La/rxt0;->k:La/clz;

    .line 47
    .line 48
    invoke-static {v5}, La/g1x;->u(La/clz;)La/tkz;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    move-object v6, v3

    .line 53
    new-instance v3, La/az60;

    .line 54
    .line 55
    move-object v4, p1

    .line 56
    check-cast v4, La/i89;

    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    const/4 v7, 0x0

    .line 60
    invoke-direct/range {v3 .. v8}, La/az60;-><init>(La/i89;La/clz;La/gq50;La/yje;C)V

    .line 61
    .line 62
    .line 63
    invoke-static {p0, v7, v7, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 70
    .line 71
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    check-cast v3, La/i3t0;

    .line 75
    .line 76
    invoke-virtual {v3}, La/i3t0;->C()La/gmq;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    sget-object v0, La/lkz;->a:La/lkz;

    .line 81
    .line 82
    new-instance v3, La/fup0;

    .line 83
    .line 84
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    move-object v5, v0

    .line 89
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 90
    .line 91
    const/4 v9, 0x0

    .line 92
    const/16 v10, 0x1c

    .line 93
    .line 94
    const/4 v4, 0x2

    .line 95
    const-class v6, La/knx;

    .line 96
    .line 97
    const-string v7, "suspendConversion0"

    .line 98
    .line 99
    const-string v8, "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 100
    .line 101
    invoke-direct/range {v3 .. v10}, La/fup0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 102
    .line 103
    .line 104
    iget-object v5, p0, La/rxt0;->k:La/clz;

    .line 105
    .line 106
    invoke-static {v5}, La/g1x;->u(La/clz;)La/tkz;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    move-object v6, v3

    .line 111
    new-instance v3, La/tsr0;

    .line 112
    .line 113
    move-object v4, p1

    .line 114
    check-cast v4, La/i89;

    .line 115
    .line 116
    const/4 v8, 0x0

    .line 117
    const/4 v7, 0x0

    .line 118
    invoke-direct/range {v3 .. v9}, La/tsr0;-><init>(La/i89;La/clz;La/fup0;La/yje;CZ)V

    .line 119
    .line 120
    .line 121
    invoke-static {p0, v7, v7, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 122
    .line 123
    .line 124
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object p0

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
