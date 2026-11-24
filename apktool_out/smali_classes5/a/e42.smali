.class public final La/e42;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/e42;->i:B

    iput-object p1, p0, La/e42;->k:Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/e42;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/e42;->k:Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/e42;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/e42;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/e42;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/e42;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/e42;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/e42;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/e42;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/e42;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/e42;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/e42;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/e42;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/e42;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/e42;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/e42;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/e42;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/e42;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/dqk0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/e42;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/e42;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/e42;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/dqk0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/e42;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/e42;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/e42;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/dqk0;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/e42;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/e42;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/e42;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/e42;->i:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, La/e42;->k:Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;

    .line 7
    .line 8
    iget-object p0, p0, La/e42;->j:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p0, Ljava/lang/Throwable;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, v4, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->r:La/duj;

    .line 21
    .line 22
    new-instance v0, La/f42;

    .line 23
    .line 24
    invoke-direct {v0, v4, v3}, La/f42;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    check-cast p0, La/dqk0;

    .line 34
    .line 35
    sget-object v0, La/wne;->a:La/wne;

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance p1, La/s32;

    .line 41
    .line 42
    const/4 v0, 0x3

    .line 43
    invoke-direct {p1, v4, v0}, La/s32;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;B)V

    .line 44
    .line 45
    .line 46
    new-instance v0, La/d42;

    .line 47
    .line 48
    invoke-direct {v0, v4, v2}, La/d42;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;B)V

    .line 49
    .line 50
    .line 51
    sget v1, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->Q:I

    .line 52
    .line 53
    invoke-virtual {v4, p0, p1, v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->P(La/dqk0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->Q()V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_1
    check-cast p0, La/dqk0;

    .line 63
    .line 64
    sget-object v0, La/wne;->a:La/wne;

    .line 65
    .line 66
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    new-instance p1, La/s32;

    .line 70
    .line 71
    invoke-direct {p1, v4, v2}, La/s32;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;B)V

    .line 72
    .line 73
    .line 74
    new-instance v0, La/d42;

    .line 75
    .line 76
    invoke-direct {v0, v4, v1}, La/d42;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;B)V

    .line 77
    .line 78
    .line 79
    sget v1, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->Q:I

    .line 80
    .line 81
    invoke-virtual {v4, p0, p1, v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->P(La/dqk0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->Q()V

    .line 85
    .line 86
    .line 87
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_2
    check-cast p0, La/dqk0;

    .line 91
    .line 92
    sget-object v0, La/wne;->a:La/wne;

    .line 93
    .line 94
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    new-instance p1, La/s32;

    .line 98
    .line 99
    invoke-direct {p1, v4, v1}, La/s32;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;B)V

    .line 100
    .line 101
    .line 102
    new-instance v0, La/d42;

    .line 103
    .line 104
    invoke-direct {v0, v4, v3}, La/d42;-><init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;B)V

    .line 105
    .line 106
    .line 107
    sget v1, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->Q:I

    .line 108
    .line 109
    invoke-virtual {v4, p0, p1, v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->P(La/dqk0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 110
    .line 111
    .line 112
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 113
    .line 114
    return-object p0

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
