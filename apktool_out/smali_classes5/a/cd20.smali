.class public final synthetic La/cd20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qg20;


# direct methods
.method public synthetic constructor <init>(La/qg20;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cd20;->a:B

    iput-object p1, p0, La/cd20;->b:La/qg20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/cd20;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/cd20;->b:La/qg20;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, v1, La/qg20;->t:La/duj;

    .line 14
    .line 15
    new-instance v0, La/fd20;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, La/fd20;-><init>(B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object p0, v1, La/qg20;->t:La/duj;

    .line 31
    .line 32
    new-instance v0, La/ed20;

    .line 33
    .line 34
    const/4 v2, 0x3

    .line 35
    invoke-direct {v0, v1, v2}, La/ed20;-><init>(La/qg20;B)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object p0, v1, La/qg20;->t:La/duj;

    .line 48
    .line 49
    new-instance v0, La/ed20;

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    invoke-direct {v0, v1, v2}, La/ed20;-><init>(La/qg20;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    instance-of p0, p1, Ljava/util/concurrent/CancellationException;

    .line 65
    .line 66
    if-nez p0, :cond_0

    .line 67
    .line 68
    sget-object p0, La/hnb0;->a:La/hnb0;

    .line 69
    .line 70
    invoke-virtual {v1, p0}, La/qg20;->e0(La/jnb0;)V

    .line 71
    .line 72
    .line 73
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object v2, p0, La/cd20;->b:La/qg20;

    .line 80
    .line 81
    iget-object p0, v2, La/qg20;->t:La/duj;

    .line 82
    .line 83
    new-instance v0, La/e000;

    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    const/16 v7, 0x11

    .line 87
    .line 88
    const/4 v1, 0x2

    .line 89
    const-class v3, La/qg20;

    .line 90
    .line 91
    const-string v4, "handleAdvanceError"

    .line 92
    .line 93
    const-string v5, "handleAdvanceError(Ljava/lang/Throwable;Ljava/lang/String;)V"

    .line 94
    .line 95
    invoke-direct/range {v0 .. v7}, La/e000;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 99
    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object p0, v1, La/qg20;->t:La/duj;

    .line 108
    .line 109
    new-instance v0, La/gm10;

    .line 110
    .line 111
    const/16 v1, 0x1d

    .line 112
    .line 113
    invoke-direct {v0, v1}, La/gm10;-><init>(B)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 117
    .line 118
    .line 119
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
