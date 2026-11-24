.class public final La/whx;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/dix;


# direct methods
.method public synthetic constructor <init>(La/dix;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/whx;->i:B

    iput-object p1, p0, La/whx;->k:La/dix;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/whx;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/whx;->k:La/dix;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/whx;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/whx;-><init>(La/dix;La/yje;B)V

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
    iput-boolean p0, v0, La/whx;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/whx;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/whx;-><init>(La/dix;La/yje;B)V

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
    iget-byte v0, p0, La/whx;->i:B

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/whx;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/whx;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/whx;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/whx;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, La/whx;

    .line 31
    .line 32
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    invoke-virtual {p0, p1}, La/whx;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/whx;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/whx;->k:La/dix;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-boolean p0, p0, La/whx;->j:Z

    .line 10
    .line 11
    sget-object v0, La/wne;->a:La/wne;

    .line 12
    .line 13
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    sget p0, La/dix;->C:I

    .line 19
    .line 20
    iget-object p0, v1, La/dix;->A:La/bby;

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-interface {p0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object p0, v1, La/dix;->t:La/mne;

    .line 32
    .line 33
    iget-object v6, p0, La/mne;->a:La/rwj;

    .line 34
    .line 35
    new-instance v4, La/h7w;

    .line 36
    .line 37
    const/16 p0, 0x1a

    .line 38
    .line 39
    invoke-direct {v4, p0}, La/h7w;-><init>(B)V

    .line 40
    .line 41
    .line 42
    new-instance v7, La/vhx;

    .line 43
    .line 44
    invoke-direct {v7, v1, v2}, La/vhx;-><init>(La/dix;La/yje;)V

    .line 45
    .line 46
    .line 47
    const/16 v8, 0xa

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    iput-object p0, v1, La/dix;->A:La/bby;

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iget-object p0, v1, La/dix;->A:La/bby;

    .line 58
    .line 59
    if-eqz p0, :cond_2

    .line 60
    .line 61
    invoke-interface {p0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 68
    .line 69
    iget-boolean v3, p0, La/whx;->j:Z

    .line 70
    .line 71
    const/4 v4, 0x1

    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    if-ne v3, v4, :cond_3

    .line 75
    .line 76
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 81
    .line 82
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object p1, v1, La/dix;->y:La/yk50;

    .line 90
    .line 91
    iput-boolean v4, p0, La/whx;->j:Z

    .line 92
    .line 93
    iget-object p0, p1, La/yk50;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p0, La/fix;

    .line 96
    .line 97
    iget-object p0, p0, La/fix;->b:La/ugx;

    .line 98
    .line 99
    iget-object p0, p0, La/ugx;->a:La/p7m0;

    .line 100
    .line 101
    invoke-virtual {p0, v2}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    if-ne p0, v0, :cond_5

    .line 107
    .line 108
    move-object v2, v0

    .line 109
    goto :goto_2

    .line 110
    :cond_5
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    :goto_2
    return-object v2

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
