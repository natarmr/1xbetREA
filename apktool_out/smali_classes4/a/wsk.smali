.class public final La/wsk;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/atk;


# direct methods
.method public synthetic constructor <init>(La/atk;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wsk;->i:B

    iput-object p1, p0, La/wsk;->k:La/atk;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/wsk;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/wsk;->k:La/atk;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/wsk;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/wsk;-><init>(La/atk;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/wsk;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/wsk;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/wsk;-><init>(La/atk;La/yje;B)V

    .line 21
    .line 22
    .line 23
    check-cast p1, La/j0g0;

    .line 24
    .line 25
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    iput-object p0, v0, La/wsk;->j:Ljava/lang/Object;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_1
    new-instance v0, La/wsk;

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-direct {v0, p0, p2, v1}, La/wsk;-><init>(La/atk;La/yje;B)V

    .line 34
    .line 35
    .line 36
    check-cast p1, La/j0g0;

    .line 37
    .line 38
    iget-object p0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object p0, v0, La/wsk;->j:Ljava/lang/Object;

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wsk;->i:B

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
    invoke-virtual {p0, p1, p2}, La/wsk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/wsk;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/wsk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/j0g0;

    .line 24
    .line 25
    iget-object v0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p2, La/yje;

    .line 28
    .line 29
    invoke-virtual {p0, p1, p2}, La/wsk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, La/wsk;

    .line 34
    .line 35
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, La/wsk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_1
    check-cast p1, La/j0g0;

    .line 43
    .line 44
    iget-object v0, p1, La/j0g0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p2, La/yje;

    .line 47
    .line 48
    invoke-virtual {p0, p1, p2}, La/wsk;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, La/wsk;

    .line 53
    .line 54
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    invoke-virtual {p0, p1}, La/wsk;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/wsk;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/wsk;->k:La/atk;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/wsk;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/vne;

    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    new-instance p1, La/ysk;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {p1, v1, v2, v0}, La/ysk;-><init>(La/atk;La/yje;B)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    invoke-static {p0, v2, v2, p1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 26
    .line 27
    .line 28
    new-instance p1, La/ysk;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-direct {p1, v1, v2, v3}, La/ysk;-><init>(La/atk;La/yje;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0, v2, v2, p1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_0
    iget-object v0, p0, La/wsk;->j:Ljava/lang/Object;

    .line 41
    .line 42
    sget-object p0, La/wne;->a:La/wne;

    .line 43
    .line 44
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget p0, La/atk;->J:I

    .line 48
    .line 49
    iget-object p0, v1, La/i3t0;->i:La/ocj;

    .line 50
    .line 51
    iget-object v3, p0, La/ocj;->a:La/p7m0;

    .line 52
    .line 53
    :cond_0
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-object p1, p0

    .line 61
    check-cast p1, La/ksk;

    .line 62
    .line 63
    new-instance v1, La/j0g0;

    .line 64
    .line 65
    invoke-direct {v1, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const/16 v4, 0x1fb

    .line 69
    .line 70
    invoke-static {p1, v1, v2, v2, v4}, La/ksk;->a(La/ksk;La/j0g0;La/j0g0;La/sip;I)La/ksk;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {v3, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_0

    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_1
    iget-object p0, p0, La/wsk;->j:Ljava/lang/Object;

    .line 84
    .line 85
    sget-object v0, La/wne;->a:La/wne;

    .line 86
    .line 87
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    sget p1, La/atk;->J:I

    .line 91
    .line 92
    iget-object p1, v1, La/i3t0;->i:La/ocj;

    .line 93
    .line 94
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 95
    .line 96
    :cond_1
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-object v1, v0

    .line 104
    check-cast v1, La/ksk;

    .line 105
    .line 106
    new-instance v3, La/j0g0;

    .line 107
    .line 108
    invoke-direct {v3, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    const/16 v4, 0x1f7

    .line 112
    .line 113
    invoke-static {v1, v2, v3, v2, v4}, La/ksk;->a(La/ksk;La/j0g0;La/j0g0;La/sip;I)La/ksk;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_1

    .line 122
    .line 123
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
