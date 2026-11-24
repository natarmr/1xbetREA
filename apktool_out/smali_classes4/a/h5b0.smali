.class public final La/h5b0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/j5b0;

.field public final synthetic l:La/vne;


# direct methods
.method public synthetic constructor <init>(La/j5b0;La/vne;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/h5b0;->i:B

    iput-object p1, p0, La/h5b0;->k:La/j5b0;

    iput-object p2, p0, La/h5b0;->l:La/vne;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 3

    .line 1
    iget-byte v0, p0, La/h5b0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/h5b0;

    .line 7
    .line 8
    iget-object v1, p0, La/h5b0;->l:La/vne;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    iget-object p0, p0, La/h5b0;->k:La/j5b0;

    .line 12
    .line 13
    invoke-direct {v0, p0, v1, p2, v2}, La/h5b0;-><init>(La/j5b0;La/vne;La/yje;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/h5b0;->j:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/h5b0;

    .line 20
    .line 21
    iget-object v1, p0, La/h5b0;->l:La/vne;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    iget-object p0, p0, La/h5b0;->k:La/j5b0;

    .line 25
    .line 26
    invoke-direct {v0, p0, v1, p2, v2}, La/h5b0;-><init>(La/j5b0;La/vne;La/yje;B)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v0, La/h5b0;->j:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/h5b0;->i:B

    .line 2
    .line 3
    check-cast p1, Ljava/lang/Throwable;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/h5b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/h5b0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/h5b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/h5b0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/h5b0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/h5b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

    .line 1
    iget-byte v0, p0, La/h5b0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/h5b0;->l:La/vne;

    .line 4
    .line 5
    iget-object v2, p0, La/h5b0;->k:La/j5b0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object p0, p0, La/h5b0;->j:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v0, p0

    .line 14
    check-cast v0, Ljava/lang/Throwable;

    .line 15
    .line 16
    sget-object p0, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 22
    .line 23
    .line 24
    iget-object v4, v2, La/j5b0;->m:La/p7m0;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    move-object p1, p0

    .line 31
    check-cast p1, La/vro;

    .line 32
    .line 33
    new-instance v2, La/qro;

    .line 34
    .line 35
    invoke-direct {v2, v0}, La/qro;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    const/4 v5, 0x2

    .line 39
    invoke-static {p1, v2, v3, v5}, La/vro;->a(La/vro;La/tro;La/tro;I)La/vro;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {v4, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-eqz p0, :cond_0

    .line 48
    .line 49
    instance-of p0, v0, La/hr30;

    .line 50
    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    invoke-static {v1, v3}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_0
    check-cast p0, Ljava/lang/Throwable;

    .line 60
    .line 61
    sget-object v0, La/wne;->a:La/wne;

    .line 62
    .line 63
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 67
    .line 68
    .line 69
    iget-object p1, v2, La/j5b0;->m:La/p7m0;

    .line 70
    .line 71
    :cond_2
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    move-object v2, v0

    .line 76
    check-cast v2, La/vro;

    .line 77
    .line 78
    new-instance v4, La/qro;

    .line 79
    .line 80
    invoke-direct {v4, p0}, La/qro;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    const/4 v5, 0x1

    .line 84
    invoke-static {v2, v3, v4, v5}, La/vro;->a(La/vro;La/tro;La/tro;I)La/vro;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {p1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    instance-of p0, p0, La/hr30;

    .line 95
    .line 96
    if-eqz p0, :cond_3

    .line 97
    .line 98
    invoke-static {v1, v3}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
