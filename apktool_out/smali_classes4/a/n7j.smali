.class public final La/n7j;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/o7j;


# direct methods
.method public synthetic constructor <init>(La/o7j;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/n7j;->i:B

    iput-object p1, p0, La/n7j;->k:La/o7j;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/n7j;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/n7j;->k:La/o7j;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/n7j;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/n7j;-><init>(La/o7j;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/n7j;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/n7j;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/n7j;-><init>(La/o7j;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/n7j;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/n7j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/n7j;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/n7j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/n7j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/n7j;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/n7j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/n7j;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, La/n7j;->k:La/o7j;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-boolean p0, p0, La/n7j;->j:Z

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    if-eqz p0, :cond_1

    .line 18
    .line 19
    iget-object p0, v3, La/o7j;->i:La/bby;

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    invoke-interface {p0}, La/bby;->isActive()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-ne p0, v2, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    iget-object p0, v3, La/o7j;->d:La/mne;

    .line 35
    .line 36
    iget-object v7, p0, La/mne;->b:La/dvj;

    .line 37
    .line 38
    new-instance v5, La/h7j;

    .line 39
    .line 40
    const/4 p0, 0x0

    .line 41
    invoke-direct {v5, v3, p0}, La/h7j;-><init>(La/o7j;B)V

    .line 42
    .line 43
    .line 44
    new-instance v8, La/n7j;

    .line 45
    .line 46
    invoke-direct {v8, v3, v1, p0}, La/n7j;-><init>(La/o7j;La/yje;B)V

    .line 47
    .line 48
    .line 49
    const/16 v9, 0xa

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    iput-object p0, v3, La/o7j;->i:La/bby;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    iget-boolean p0, v3, La/o7j;->j:Z

    .line 60
    .line 61
    if-nez p0, :cond_2

    .line 62
    .line 63
    new-instance p0, La/j7j;

    .line 64
    .line 65
    invoke-virtual {v3}, La/o7j;->w()La/jkm;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-direct {p0, p1}, La/j7j;-><init>(La/jkm;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, p0}, La/o7j;->y(La/m7j;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 79
    .line 80
    iget-boolean v4, p0, La/n7j;->j:Z

    .line 81
    .line 82
    if-eqz v4, :cond_4

    .line 83
    .line 84
    if-ne v4, v2, :cond_3

    .line 85
    .line 86
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 91
    .line 92
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    iget-object p1, v3, La/o7j;->b:La/tru;

    .line 100
    .line 101
    iput-boolean v2, p0, La/n7j;->j:Z

    .line 102
    .line 103
    invoke-virtual {p1, p0}, La/tru;->a(La/zje;)Ljava/io/Serializable;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v0, :cond_5

    .line 108
    .line 109
    move-object v1, v0

    .line 110
    goto :goto_2

    .line 111
    :cond_5
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 112
    .line 113
    iput-boolean v2, v3, La/o7j;->j:Z

    .line 114
    .line 115
    new-instance p0, La/k7j;

    .line 116
    .line 117
    invoke-direct {p0, p1}, La/k7j;-><init>(Ljava/util/List;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3, p0}, La/o7j;->y(La/m7j;)V

    .line 121
    .line 122
    .line 123
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    :goto_2
    return-object v1

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
