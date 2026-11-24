.class public final La/hxe0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:Z

.field public final synthetic l:La/cqq;

.field public final synthetic m:La/wpq;

.field public final synthetic n:La/pz40;


# direct methods
.method public synthetic constructor <init>(ZLa/cqq;La/wpq;La/pz40;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/hxe0;->i:B

    iput-boolean p1, p0, La/hxe0;->k:Z

    iput-object p2, p0, La/hxe0;->l:La/cqq;

    iput-object p3, p0, La/hxe0;->m:La/wpq;

    iput-object p4, p0, La/hxe0;->n:La/pz40;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    iget-byte p1, p0, La/hxe0;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/hxe0;

    .line 7
    .line 8
    iget-object v4, p0, La/hxe0;->n:La/pz40;

    .line 9
    .line 10
    const/4 v6, 0x1

    .line 11
    iget-boolean v1, p0, La/hxe0;->k:Z

    .line 12
    .line 13
    iget-object v2, p0, La/hxe0;->l:La/cqq;

    .line 14
    .line 15
    iget-object v3, p0, La/hxe0;->m:La/wpq;

    .line 16
    .line 17
    move-object v5, p2

    .line 18
    invoke-direct/range {v0 .. v6}, La/hxe0;-><init>(ZLa/cqq;La/wpq;La/pz40;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    move-object v5, p2

    .line 23
    new-instance v1, La/hxe0;

    .line 24
    .line 25
    move-object v6, v5

    .line 26
    iget-object v5, p0, La/hxe0;->n:La/pz40;

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    iget-boolean v2, p0, La/hxe0;->k:Z

    .line 30
    .line 31
    iget-object v3, p0, La/hxe0;->l:La/cqq;

    .line 32
    .line 33
    iget-object v4, p0, La/hxe0;->m:La/wpq;

    .line 34
    .line 35
    invoke-direct/range {v1 .. v7}, La/hxe0;-><init>(ZLa/cqq;La/wpq;La/pz40;La/yje;B)V

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
    iget-byte v0, p0, La/hxe0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/hxe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/hxe0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/hxe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/hxe0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/hxe0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/hxe0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-byte v0, p0, La/hxe0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/hxe0;->n:La/pz40;

    .line 4
    .line 5
    iget-object v2, p0, La/hxe0;->m:La/wpq;

    .line 6
    .line 7
    iget-object v3, p0, La/hxe0;->l:La/cqq;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x7

    .line 11
    iget-boolean v6, p0, La/hxe0;->k:Z

    .line 12
    .line 13
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    const/4 v8, 0x1

    .line 16
    const/4 v9, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    sget-object v0, La/wne;->a:La/wne;

    .line 21
    .line 22
    iget-boolean v10, p0, La/hxe0;->j:Z

    .line 23
    .line 24
    if-eqz v10, :cond_1

    .line 25
    .line 26
    if-ne v10, v8, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, La/kg2;

    .line 40
    .line 41
    invoke-direct {p1, v5, v6}, La/kg2;-><init>(BZ)V

    .line 42
    .line 43
    .line 44
    invoke-static {v9, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    new-instance v5, La/qaf0;

    .line 53
    .line 54
    invoke-direct {v5, p1, v4}, La/qaf0;-><init>(La/gmq;B)V

    .line 55
    .line 56
    .line 57
    new-instance p1, La/exe0;

    .line 58
    .line 59
    invoke-direct {p1, v3, v2, v1, v8}, La/exe0;-><init>(La/cqq;La/wpq;La/pz40;B)V

    .line 60
    .line 61
    .line 62
    iput-boolean v8, p0, La/hxe0;->j:Z

    .line 63
    .line 64
    invoke-virtual {v5, p1, p0}, La/qaf0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-ne p0, v0, :cond_2

    .line 69
    .line 70
    move-object v9, v0

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    :goto_0
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    :goto_1
    return-object v9

    .line 75
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 76
    .line 77
    iget-boolean v10, p0, La/hxe0;->j:Z

    .line 78
    .line 79
    if-eqz v10, :cond_4

    .line 80
    .line 81
    if-ne v10, v8, :cond_3

    .line 82
    .line 83
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    new-instance p1, La/kg2;

    .line 95
    .line 96
    invoke-direct {p1, v5, v6}, La/kg2;-><init>(BZ)V

    .line 97
    .line 98
    .line 99
    invoke-static {v9, p1}, La/ydx;->V(La/ufk0;Lkotlin/jvm/functions/Function0;)La/vsg0;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, La/i120;->W(La/gmq;)La/gmq;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    new-instance v5, La/wk30;

    .line 108
    .line 109
    const/16 v6, 0x1b

    .line 110
    .line 111
    invoke-direct {v5, p1, v6}, La/wk30;-><init>(La/gmq;B)V

    .line 112
    .line 113
    .line 114
    new-instance p1, La/exe0;

    .line 115
    .line 116
    invoke-direct {p1, v3, v2, v1, v4}, La/exe0;-><init>(La/cqq;La/wpq;La/pz40;B)V

    .line 117
    .line 118
    .line 119
    iput-boolean v8, p0, La/hxe0;->j:Z

    .line 120
    .line 121
    invoke-virtual {v5, p1, p0}, La/wk30;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    if-ne p0, v0, :cond_5

    .line 126
    .line 127
    move-object v9, v0

    .line 128
    goto :goto_3

    .line 129
    :cond_5
    :goto_2
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    :goto_3
    return-object v9

    .line 132
    nop

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
