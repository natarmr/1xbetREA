.class public final La/ep8;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public k:F

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BFLa/yje;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 17
    iput-byte p1, p0, La/ep8;->i:B

    iput-object p4, p0, La/ep8;->l:Ljava/lang/Object;

    iput p2, p0, La/ep8;->k:F

    iput-object p5, p0, La/ep8;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/h5m;FLa/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/ep8;->i:B

    .line 16
    iput-object p1, p0, La/ep8;->m:Ljava/lang/Object;

    iput p2, p0, La/ep8;->k:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/oms0;La/yje;)V
    .locals 1

    const/4 v0, 0x7

    iput-byte v0, p0, La/ep8;->i:B

    .line 18
    iput-object p1, p0, La/ep8;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/rv2;La/afk0;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/ep8;->i:B

    .line 15
    iput-object p1, p0, La/ep8;->l:Ljava/lang/Object;

    iput-object p2, p0, La/ep8;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/uz40;La/d39;FLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/ep8;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/ep8;->l:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/ep8;->m:Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, La/ep8;->k:F

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ep8;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/ep8;->m:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/ep8;

    .line 9
    .line 10
    check-cast v1, La/oms0;

    .line 11
    .line 12
    invoke-direct {p0, v1, p2}, La/ep8;-><init>(La/oms0;La/yje;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/ep8;->l:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    new-instance v2, La/ep8;

    .line 19
    .line 20
    iget-object p1, p0, La/ep8;->l:Ljava/lang/Object;

    .line 21
    .line 22
    move-object v6, p1

    .line 23
    check-cast v6, La/td9;

    .line 24
    .line 25
    iget v4, p0, La/ep8;->k:F

    .line 26
    .line 27
    move-object v7, v1

    .line 28
    check-cast v7, La/j73;

    .line 29
    .line 30
    const/4 v3, 0x6

    .line 31
    move-object v5, p2

    .line 32
    invoke-direct/range {v2 .. v7}, La/ep8;-><init>(BFLa/yje;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object v2

    .line 36
    :pswitch_1
    move-object v6, p2

    .line 37
    new-instance v3, La/ep8;

    .line 38
    .line 39
    iget-object p1, p0, La/ep8;->l:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v7, p1

    .line 42
    check-cast v7, La/t33;

    .line 43
    .line 44
    iget v5, p0, La/ep8;->k:F

    .line 45
    .line 46
    move-object v8, v1

    .line 47
    check-cast v8, La/cfq;

    .line 48
    .line 49
    const/4 v4, 0x5

    .line 50
    invoke-direct/range {v3 .. v8}, La/ep8;-><init>(BFLa/yje;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :pswitch_2
    move-object v6, p2

    .line 55
    new-instance v3, La/ep8;

    .line 56
    .line 57
    iget-object p1, p0, La/ep8;->l:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v7, p1

    .line 60
    check-cast v7, La/xcz;

    .line 61
    .line 62
    iget v5, p0, La/ep8;->k:F

    .line 63
    .line 64
    move-object v8, v1

    .line 65
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 66
    .line 67
    const/4 v4, 0x4

    .line 68
    invoke-direct/range {v3 .. v8}, La/ep8;-><init>(BFLa/yje;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-object v3

    .line 72
    :pswitch_3
    move-object v6, p2

    .line 73
    new-instance v3, La/ep8;

    .line 74
    .line 75
    iget-object p1, p0, La/ep8;->l:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v7, p1

    .line 78
    check-cast v7, La/pvh0;

    .line 79
    .line 80
    iget v5, p0, La/ep8;->k:F

    .line 81
    .line 82
    move-object v8, v1

    .line 83
    check-cast v8, La/y1h0;

    .line 84
    .line 85
    const/4 v4, 0x3

    .line 86
    invoke-direct/range {v3 .. v8}, La/ep8;-><init>(BFLa/yje;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-object v3

    .line 90
    :pswitch_4
    move-object v6, p2

    .line 91
    new-instance p1, La/ep8;

    .line 92
    .line 93
    iget-object p2, p0, La/ep8;->l:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p2, La/uz40;

    .line 96
    .line 97
    check-cast v1, La/d39;

    .line 98
    .line 99
    iget p0, p0, La/ep8;->k:F

    .line 100
    .line 101
    invoke-direct {p1, p2, v1, p0, v6}, La/ep8;-><init>(La/uz40;La/d39;FLa/yje;)V

    .line 102
    .line 103
    .line 104
    return-object p1

    .line 105
    :pswitch_5
    move-object v6, p2

    .line 106
    new-instance p2, La/ep8;

    .line 107
    .line 108
    check-cast v1, La/h5m;

    .line 109
    .line 110
    iget p0, p0, La/ep8;->k:F

    .line 111
    .line 112
    invoke-direct {p2, v1, p0, v6}, La/ep8;-><init>(La/h5m;FLa/yje;)V

    .line 113
    .line 114
    .line 115
    iput-object p1, p2, La/ep8;->l:Ljava/lang/Object;

    .line 116
    .line 117
    return-object p2

    .line 118
    :pswitch_6
    move-object v6, p2

    .line 119
    new-instance p2, La/ep8;

    .line 120
    .line 121
    iget-object p0, p0, La/ep8;->l:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p0, La/rv2;

    .line 124
    .line 125
    check-cast v1, La/afk0;

    .line 126
    .line 127
    invoke-direct {p2, p0, v1, v6}, La/ep8;-><init>(La/rv2;La/afk0;La/yje;)V

    .line 128
    .line 129
    .line 130
    check-cast p1, Ljava/lang/Number;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    iput p0, p2, La/ep8;->k:F

    .line 137
    .line 138
    return-object p2

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ep8;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ep8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ep8;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ep8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ep8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ep8;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ep8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/ep8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/ep8;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/ep8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/vne;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/ep8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/ep8;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/ep8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/vne;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/ep8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/ep8;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/ep8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/vne;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/ep8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/ep8;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/ep8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, La/vne;

    .line 109
    .line 110
    check-cast p2, La/yje;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, La/ep8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/ep8;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/ep8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_6
    check-cast p1, Ljava/lang/Number;

    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    check-cast p2, La/yje;

    .line 132
    .line 133
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p0, p1, p2}, La/ep8;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    check-cast p0, La/ep8;

    .line 142
    .line 143
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    invoke-virtual {p0, p1}, La/ep8;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/ep8;->i:B

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    iget-object v2, p0, La/ep8;->m:Ljava/lang/Object;

    .line 5
    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-boolean v1, p0, La/ep8;->j:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    if-ne v1, v4, :cond_0

    .line 20
    .line 21
    iget v1, p0, La/ep8;->k:F

    .line 22
    .line 23
    iget-object v3, p0, La/ep8;->l:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, La/vne;

    .line 26
    .line 27
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/ep8;->l:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, La/vne;

    .line 41
    .line 42
    invoke-interface {v1}, La/vne;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {v3}, La/hhm0;->v(Lkotlin/coroutines/CoroutineContext;)F

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    move v13, v3

    .line 51
    move-object v3, v1

    .line 52
    move v1, v13

    .line 53
    :cond_2
    :goto_0
    invoke-static {v3}, La/d5c;->R(La/vne;)Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-eqz v6, :cond_3

    .line 58
    .line 59
    move-object v6, v2

    .line 60
    check-cast v6, La/oms0;

    .line 61
    .line 62
    new-instance v7, La/cel;

    .line 63
    .line 64
    const/16 v8, 0x8

    .line 65
    .line 66
    invoke-direct {v7, v6, v1, v8}, La/cel;-><init>(Ljava/lang/Object;FB)V

    .line 67
    .line 68
    .line 69
    iput-object v3, p0, La/ep8;->l:Ljava/lang/Object;

    .line 70
    .line 71
    iput v1, p0, La/ep8;->k:F

    .line 72
    .line 73
    iput-boolean v4, p0, La/ep8;->j:Z

    .line 74
    .line 75
    invoke-interface {p0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    invoke-static {v6}, La/s0x;->P(Lkotlin/coroutines/CoroutineContext;)La/qq40;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-interface {v6, v7, p0}, La/qq40;->e(Lkotlin/jvm/functions/Function1;La/yje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    if-ne v6, v0, :cond_2

    .line 88
    .line 89
    move-object v6, v0

    .line 90
    goto :goto_1

    .line 91
    :cond_3
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    :goto_1
    return-object v6

    .line 94
    :pswitch_0
    sget-object v7, La/wne;->a:La/wne;

    .line 95
    .line 96
    iget-boolean v0, p0, La/ep8;->j:Z

    .line 97
    .line 98
    if-eqz v0, :cond_5

    .line 99
    .line 100
    if-ne v0, v4, :cond_4

    .line 101
    .line 102
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object v0, p0, La/ep8;->l:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v0, La/td9;

    .line 116
    .line 117
    iget-object v0, v0, La/td9;->c:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, La/t33;

    .line 120
    .line 121
    iget v1, p0, La/ep8;->k:F

    .line 122
    .line 123
    new-instance v3, Ljava/lang/Float;

    .line 124
    .line 125
    invoke-direct {v3, v1}, Ljava/lang/Float;-><init>(F)V

    .line 126
    .line 127
    .line 128
    check-cast v2, La/j73;

    .line 129
    .line 130
    iput-boolean v4, p0, La/ep8;->j:Z

    .line 131
    .line 132
    move-object v1, v3

    .line 133
    const/4 v3, 0x0

    .line 134
    const/4 v4, 0x0

    .line 135
    const/16 v6, 0xc

    .line 136
    .line 137
    move-object v5, p0

    .line 138
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    if-ne v0, v7, :cond_6

    .line 143
    .line 144
    move-object v6, v7

    .line 145
    goto :goto_3

    .line 146
    :cond_6
    :goto_2
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    :goto_3
    return-object v6

    .line 149
    :pswitch_1
    sget-object v7, La/wne;->a:La/wne;

    .line 150
    .line 151
    iget-boolean v0, p0, La/ep8;->j:Z

    .line 152
    .line 153
    if-eqz v0, :cond_8

    .line 154
    .line 155
    if-ne v0, v4, :cond_7

    .line 156
    .line 157
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_7
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    iget-object v0, p0, La/ep8;->l:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, La/t33;

    .line 171
    .line 172
    iget v1, p0, La/ep8;->k:F

    .line 173
    .line 174
    new-instance v3, Ljava/lang/Float;

    .line 175
    .line 176
    invoke-direct {v3, v1}, Ljava/lang/Float;-><init>(F)V

    .line 177
    .line 178
    .line 179
    check-cast v2, La/cfq;

    .line 180
    .line 181
    iput-boolean v4, p0, La/ep8;->j:Z

    .line 182
    .line 183
    move-object v1, v3

    .line 184
    const/4 v3, 0x0

    .line 185
    const/4 v4, 0x0

    .line 186
    const/16 v6, 0xc

    .line 187
    .line 188
    move-object v5, p0

    .line 189
    invoke-static/range {v0 .. v6}, La/t33;->a(La/t33;Ljava/lang/Object;La/j73;Ljava/lang/Float;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    if-ne v0, v7, :cond_9

    .line 194
    .line 195
    move-object v6, v7

    .line 196
    goto :goto_5

    .line 197
    :cond_9
    :goto_4
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    :goto_5
    return-object v6

    .line 200
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 201
    .line 202
    iget-boolean v1, p0, La/ep8;->j:Z

    .line 203
    .line 204
    if-eqz v1, :cond_b

    .line 205
    .line 206
    if-ne v1, v4, :cond_a

    .line 207
    .line 208
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    goto :goto_6

    .line 212
    :cond_a
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_b
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    iget-object v1, p0, La/ep8;->l:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v1, La/xcz;

    .line 222
    .line 223
    new-instance v3, La/a7s;

    .line 224
    .line 225
    const/16 v7, 0x14

    .line 226
    .line 227
    invoke-direct {v3, v1, v7}, La/a7s;-><init>(La/xcz;B)V

    .line 228
    .line 229
    .line 230
    invoke-static {v6, v3}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    new-instance v3, La/fa40;

    .line 235
    .line 236
    iget v6, p0, La/ep8;->k:F

    .line 237
    .line 238
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 239
    .line 240
    invoke-direct {v3, v6, v2}, La/fa40;-><init>(FLkotlin/jvm/functions/Function1;)V

    .line 241
    .line 242
    .line 243
    iput-boolean v4, p0, La/ep8;->j:Z

    .line 244
    .line 245
    invoke-virtual {v1, v3, p0}, La/vsg0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    if-ne v1, v0, :cond_c

    .line 250
    .line 251
    move-object v6, v0

    .line 252
    goto :goto_7

    .line 253
    :cond_c
    :goto_6
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    :goto_7
    return-object v6

    .line 256
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 257
    .line 258
    iget-boolean v1, p0, La/ep8;->j:Z

    .line 259
    .line 260
    if-eqz v1, :cond_e

    .line 261
    .line 262
    if-ne v1, v4, :cond_d

    .line 263
    .line 264
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    goto :goto_8

    .line 268
    :cond_d
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    goto :goto_9

    .line 272
    :cond_e
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    iget-object v1, p0, La/ep8;->l:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v1, La/pvh0;

    .line 278
    .line 279
    iget v3, p0, La/ep8;->k:F

    .line 280
    .line 281
    check-cast v2, La/y1h0;

    .line 282
    .line 283
    iput-boolean v4, p0, La/ep8;->j:Z

    .line 284
    .line 285
    invoke-virtual {v1, v3, v2, p0}, La/pvh0;->s1(FLjava/lang/Object;La/bnn0;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    if-ne v1, v0, :cond_f

    .line 290
    .line 291
    move-object v6, v0

    .line 292
    goto :goto_9

    .line 293
    :cond_f
    :goto_8
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    :goto_9
    return-object v6

    .line 296
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 297
    .line 298
    iget-boolean v7, p0, La/ep8;->j:Z

    .line 299
    .line 300
    if-eqz v7, :cond_11

    .line 301
    .line 302
    if-ne v7, v4, :cond_10

    .line 303
    .line 304
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    goto :goto_a

    .line 308
    :cond_10
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    goto :goto_b

    .line 312
    :cond_11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    iget-object v3, p0, La/ep8;->l:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v3, La/uz40;

    .line 318
    .line 319
    new-instance v7, La/ca40;

    .line 320
    .line 321
    const/4 v8, 0x2

    .line 322
    invoke-direct {v7, v3, v8}, La/ca40;-><init>(La/uz40;B)V

    .line 323
    .line 324
    .line 325
    invoke-static {v6, v7}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    new-instance v6, La/ak9;

    .line 330
    .line 331
    invoke-direct {v6, v3, v1}, La/ak9;-><init>(La/vsg0;B)V

    .line 332
    .line 333
    .line 334
    new-instance v1, La/fa40;

    .line 335
    .line 336
    check-cast v2, La/d39;

    .line 337
    .line 338
    iget v3, p0, La/ep8;->k:F

    .line 339
    .line 340
    invoke-direct {v1, v2, v3}, La/fa40;-><init>(La/d39;F)V

    .line 341
    .line 342
    .line 343
    iput-boolean v4, p0, La/ep8;->j:Z

    .line 344
    .line 345
    invoke-virtual {v6, v1, p0}, La/ak9;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    if-ne v1, v0, :cond_12

    .line 350
    .line 351
    move-object v6, v0

    .line 352
    goto :goto_b

    .line 353
    :cond_12
    :goto_a
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 354
    .line 355
    :goto_b
    return-object v6

    .line 356
    :pswitch_5
    move-object v7, v2

    .line 357
    check-cast v7, La/h5m;

    .line 358
    .line 359
    iget-object v0, p0, La/ep8;->l:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v0, La/vne;

    .line 362
    .line 363
    sget-object v8, La/wne;->a:La/wne;

    .line 364
    .line 365
    iget-boolean v2, p0, La/ep8;->j:Z

    .line 366
    .line 367
    if-eqz v2, :cond_14

    .line 368
    .line 369
    if-ne v2, v4, :cond_13

    .line 370
    .line 371
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 372
    .line 373
    .line 374
    goto :goto_c

    .line 375
    :catchall_0
    move-exception v0

    .line 376
    goto :goto_e

    .line 377
    :cond_13
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 378
    .line 379
    .line 380
    goto :goto_d

    .line 381
    :cond_14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    invoke-interface {v0}, La/vne;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    sget-object v2, La/gqw0;->o1:La/gqw0;

    .line 389
    .line 390
    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->get(Lkotlin/coroutines/f;)Lkotlin/coroutines/CoroutineContext$Element;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    check-cast v0, La/bby;

    .line 395
    .line 396
    iput-object v0, v7, La/h5m;->d:La/bby;

    .line 397
    .line 398
    :try_start_1
    iget-object v0, v7, La/h5m;->b:La/agk0;

    .line 399
    .line 400
    invoke-virtual {v0}, La/agk0;->l()F

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    iget v2, p0, La/ep8;->k:F

    .line 405
    .line 406
    move v3, v2

    .line 407
    invoke-static {}, La/lgb;->Z()La/uts0;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    move v9, v3

    .line 412
    new-instance v3, La/i3l;

    .line 413
    .line 414
    invoke-direct {v3, v7, v1}, La/i3l;-><init>(Ljava/lang/Object;B)V

    .line 415
    .line 416
    .line 417
    iput-object v6, p0, La/ep8;->l:Ljava/lang/Object;

    .line 418
    .line 419
    iput-boolean v4, p0, La/ep8;->j:Z

    .line 420
    .line 421
    const/4 v5, 0x4

    .line 422
    move-object v4, p0

    .line 423
    move v1, v9

    .line 424
    invoke-static/range {v0 .. v5}, La/hhm0;->n(FFLa/j73;Lkotlin/jvm/functions/Function2;La/bnn0;I)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 428
    if-ne v0, v8, :cond_15

    .line 429
    .line 430
    move-object v6, v8

    .line 431
    goto :goto_d

    .line 432
    :cond_15
    :goto_c
    iput-object v6, v7, La/h5m;->d:La/bby;

    .line 433
    .line 434
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    :goto_d
    return-object v6

    .line 437
    :goto_e
    iput-object v6, v7, La/h5m;->d:La/bby;

    .line 438
    .line 439
    throw v0

    .line 440
    :pswitch_6
    iget v9, p0, La/ep8;->k:F

    .line 441
    .line 442
    sget-object v0, La/wne;->a:La/wne;

    .line 443
    .line 444
    iget-boolean v1, p0, La/ep8;->j:Z

    .line 445
    .line 446
    if-eqz v1, :cond_17

    .line 447
    .line 448
    if-ne v1, v4, :cond_16

    .line 449
    .line 450
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    goto :goto_f

    .line 454
    :cond_16
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 455
    .line 456
    .line 457
    goto :goto_10

    .line 458
    :cond_17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 459
    .line 460
    .line 461
    iget-object v1, p0, La/ep8;->l:Ljava/lang/Object;

    .line 462
    .line 463
    move-object v12, v1

    .line 464
    check-cast v12, La/rv2;

    .line 465
    .line 466
    new-instance v7, La/gv2;

    .line 467
    .line 468
    move-object v11, v2

    .line 469
    check-cast v11, La/afk0;

    .line 470
    .line 471
    const/4 v10, 0x0

    .line 472
    const/4 v8, 0x1

    .line 473
    invoke-direct/range {v7 .. v12}, La/gv2;-><init>(BFLa/yje;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    iput v9, p0, La/ep8;->k:F

    .line 477
    .line 478
    iput-boolean v4, p0, La/ep8;->j:Z

    .line 479
    .line 480
    invoke-static {v12, v7, p0}, La/rv2;->b(La/rv2;La/xdr;La/zje;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    if-ne v1, v0, :cond_18

    .line 485
    .line 486
    move-object v6, v0

    .line 487
    goto :goto_10

    .line 488
    :cond_18
    :goto_f
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 489
    .line 490
    :goto_10
    return-object v6

    .line 491
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
