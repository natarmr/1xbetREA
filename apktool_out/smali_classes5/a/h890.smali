.class public final La/h890;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:La/j890;


# direct methods
.method public synthetic constructor <init>(La/j890;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/h890;->i:B

    iput-object p1, p0, La/h890;->j:La/j890;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/h890;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/h890;->j:La/j890;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/h890;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/h890;-><init>(La/j890;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/h890;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/h890;-><init>(La/j890;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/h890;->i:B

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
    invoke-virtual {p0, p1, p2}, La/h890;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/h890;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/h890;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/h890;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/h890;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/h890;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 7

    .line 1
    iget-byte v0, p0, La/h890;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/h890;->j:La/j890;

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
    new-instance p1, La/y790;

    .line 14
    .line 15
    iget-object v0, p0, La/j890;->r:La/j1q0;

    .line 16
    .line 17
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 18
    .line 19
    invoke-virtual {v0}, La/m1q0;->b()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-direct {p1, v0}, La/y790;-><init>(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 33
    .line 34
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget p1, La/j890;->x:I

    .line 38
    .line 39
    iget-object p1, p0, La/j890;->o:Lorg/xplatform/rules/impl/presentation/models/PaymentInfoParams;

    .line 40
    .line 41
    iget p1, p1, Lorg/xplatform/rules/impl/presentation/models/PaymentInfoParams;->a:I

    .line 42
    .line 43
    if-ltz p1, :cond_1

    .line 44
    .line 45
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 46
    .line 47
    iget-object v0, p0, La/j890;->p:La/bdu;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, La/bdu;->b(I)Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    move-object p1, v0

    .line 56
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 57
    .line 58
    new-instance v0, La/g0g0;

    .line 59
    .line 60
    invoke-direct {v0, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    move-object p1, v0

    .line 64
    :goto_0
    sget-object v0, La/lun;->a:La/lun;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    instance-of v1, p1, La/g0g0;

    .line 70
    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    move-object p1, v0

    .line 74
    :cond_0
    check-cast p1, Ljava/util/Map;

    .line 75
    .line 76
    :goto_1
    move-object v1, p1

    .line 77
    goto :goto_2

    .line 78
    :cond_1
    sget-object p1, La/lun;->a:La/lun;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :goto_2
    iget-object p0, p0, La/i3t0;->i:La/ocj;

    .line 85
    .line 86
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 87
    .line 88
    :cond_2
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-object v0, p1

    .line 96
    check-cast v0, La/d890;

    .line 97
    .line 98
    iget-wide v2, v0, La/d890;->d:J

    .line 99
    .line 100
    const-wide/16 v4, 0x1

    .line 101
    .line 102
    add-long/2addr v2, v4

    .line 103
    sget-object v4, La/c890;->a:La/c890;

    .line 104
    .line 105
    const/4 v5, 0x0

    .line 106
    const/16 v6, 0x23

    .line 107
    .line 108
    invoke-static/range {v0 .. v6}, La/d890;->a(La/d890;Ljava/util/Map;JLa/c890;ZI)La/d890;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_2

    .line 117
    .line 118
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
