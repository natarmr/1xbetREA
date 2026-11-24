.class public final La/nv80;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/rv80;


# direct methods
.method public constructor <init>(La/rv80;La/yje;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/nv80;->i:B

    .line 3
    .line 4
    sget-object v1, La/wgh0;->b:La/wgh0;

    .line 5
    .line 6
    iput-object p1, p0, La/nv80;->j:La/rv80;

    .line 7
    .line 8
    invoke-direct {p0, v0, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(La/rv80;La/yje;B)V
    .locals 0

    .line 12
    iput-byte p3, p0, La/nv80;->i:B

    iput-object p1, p0, La/nv80;->j:La/rv80;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/nv80;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/nv80;->j:La/rv80;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/nv80;

    .line 9
    .line 10
    sget-object v0, La/wgh0;->b:La/wgh0;

    .line 11
    .line 12
    invoke-direct {p1, p0, p2}, La/nv80;-><init>(La/rv80;La/yje;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    new-instance p1, La/nv80;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-direct {p1, p0, p2, v0}, La/nv80;-><init>(La/rv80;La/yje;B)V

    .line 20
    .line 21
    .line 22
    return-object p1

    .line 23
    :pswitch_1
    new-instance p1, La/nv80;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/nv80;-><init>(La/rv80;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/nv80;->i:B

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
    invoke-virtual {p0, p1, p2}, La/nv80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/nv80;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/nv80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/nv80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/nv80;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/nv80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/nv80;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/nv80;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/nv80;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/nv80;->i:B

    .line 4
    .line 5
    iget-object v0, v0, La/nv80;->j:La/rv80;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v8, La/wgh0;->i:La/wgh0;

    .line 11
    .line 12
    sget-object v1, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget v1, La/rv80;->V:I

    .line 18
    .line 19
    iget-object v1, v0, La/rv80;->F:La/s91;

    .line 20
    .line 21
    new-instance v2, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;

    .line 22
    .line 23
    const/4 v14, 0x0

    .line 24
    const/16 v15, 0x1e7

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    const-wide/16 v5, 0x0

    .line 29
    .line 30
    sget-object v7, La/vl1;->a:La/vl1;

    .line 31
    .line 32
    const-wide/16 v9, 0x0

    .line 33
    .line 34
    const-wide/16 v11, 0x0

    .line 35
    .line 36
    const/4 v13, 0x0

    .line 37
    invoke-direct/range {v2 .. v15}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;-><init>(Ljava/lang/String;Ljava/lang/String;JLa/tm1;La/wgh0;JJLjava/lang/String;ZI)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, La/s91;->c(Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;)V

    .line 41
    .line 42
    .line 43
    sget-object v1, La/wgh0;->b:La/wgh0;

    .line 44
    .line 45
    iget-object v1, v0, La/rv80;->E:La/s31;

    .line 46
    .line 47
    invoke-virtual {v1, v8}, La/s31;->g(La/wgh0;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v0, La/rv80;->H:La/cyu;

    .line 51
    .line 52
    const-string v1, "aggregator_live"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, La/cyu;->C(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 61
    .line 62
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    sget v1, La/rv80;->V:I

    .line 66
    .line 67
    sget-object v1, La/tu80;->a:La/tu80;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 76
    .line 77
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    sget v1, La/rv80;->V:I

    .line 81
    .line 82
    iget-object v0, v0, La/i3t0;->i:La/ocj;

    .line 83
    .line 84
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 85
    .line 86
    :cond_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-object v2, v1

    .line 94
    check-cast v2, La/yu80;

    .line 95
    .line 96
    const/4 v11, 0x0

    .line 97
    const v12, 0x1fffc

    .line 98
    .line 99
    .line 100
    const/4 v3, 0x0

    .line 101
    const/4 v4, 0x1

    .line 102
    const/4 v5, 0x0

    .line 103
    const/4 v6, 0x0

    .line 104
    const/4 v7, 0x0

    .line 105
    const/4 v8, 0x0

    .line 106
    const/4 v9, 0x0

    .line 107
    const/4 v10, 0x0

    .line 108
    invoke-static/range {v2 .. v12}, La/yu80;->a(La/yu80;ZZZZZLjava/util/List;Ljava/util/Set;La/gu80;La/ql5;I)La/yu80;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-eqz v1, :cond_0

    .line 117
    .line 118
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object v0

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
