.class public final La/pit;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/sit;


# direct methods
.method public synthetic constructor <init>(La/sit;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pit;->i:B

    iput-object p1, p0, La/pit;->k:La/sit;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/pit;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/pit;->k:La/sit;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/pit;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/pit;-><init>(La/sit;La/yje;B)V

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
    iput-boolean p0, v0, La/pit;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/pit;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/pit;-><init>(La/sit;La/yje;B)V

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
    iget-byte v0, p0, La/pit;->i:B

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
    invoke-virtual {p0, p1, p2}, La/pit;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/pit;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/pit;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/pit;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/pit;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/pit;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 14

    .line 1
    iget-byte v0, p0, La/pit;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/pit;->k:La/sit;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-boolean p0, p0, La/pit;->j:Z

    .line 10
    .line 11
    sget-object v0, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, La/zht;

    .line 23
    .line 24
    iget-boolean p1, p1, La/zht;->g:Z

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, La/sit;->O()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    if-nez p0, :cond_3

    .line 33
    .line 34
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/zht;

    .line 39
    .line 40
    iget-boolean p0, p0, La/zht;->f:Z

    .line 41
    .line 42
    if-eqz p0, :cond_3

    .line 43
    .line 44
    iget-object p0, v2, La/sit;->E:La/bby;

    .line 45
    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    invoke-interface {p0, v1}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object p0, v2, La/i3t0;->i:La/ocj;

    .line 52
    .line 53
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 54
    .line 55
    :cond_2
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v0, v2, La/i3t0;->f:La/oyg0;

    .line 63
    .line 64
    move-object v3, p1

    .line 65
    check-cast v3, La/zht;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    const/4 v12, 0x0

    .line 71
    const/16 v13, 0x39f

    .line 72
    .line 73
    const/4 v4, 0x0

    .line 74
    const/4 v5, 0x0

    .line 75
    const/4 v6, 0x0

    .line 76
    const/4 v7, 0x0

    .line 77
    const/4 v8, 0x0

    .line 78
    const/4 v9, 0x0

    .line 79
    const/4 v10, 0x1

    .line 80
    const/4 v11, 0x0

    .line 81
    invoke-static/range {v3 .. v13}, La/zht;->a(La/zht;La/zo80;La/bdq;ZLa/yo80;La/yo80;ZZLjava/util/List;Ljava/util/List;I)La/zht;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_2

    .line 90
    .line 91
    :cond_3
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 95
    .line 96
    iget-boolean v3, p0, La/pit;->j:Z

    .line 97
    .line 98
    const/4 v4, 0x1

    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    if-ne v3, v4, :cond_4

    .line 102
    .line 103
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 108
    .line 109
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iput-boolean v4, p0, La/pit;->j:Z

    .line 117
    .line 118
    sget p1, La/sit;->G:I

    .line 119
    .line 120
    invoke-virtual {v2, p0}, La/sit;->N(La/zje;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    if-ne p0, v0, :cond_6

    .line 125
    .line 126
    move-object v1, v0

    .line 127
    goto :goto_2

    .line 128
    :cond_6
    :goto_1
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    :goto_2
    return-object v1

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
