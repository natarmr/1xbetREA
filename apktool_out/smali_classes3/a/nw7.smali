.class public final La/nw7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vne;

.field public final synthetic c:La/t33;

.field public final synthetic d:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/vne;La/t33;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/nw7;->a:B

    iput-object p1, p0, La/nw7;->b:La/vne;

    iput-object p2, p0, La/nw7;->c:La/t33;

    iput-object p3, p0, La/nw7;->d:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte p2, p0, La/nw7;->a:B

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    iget-object v1, p0, La/nw7;->c:La/t33;

    .line 5
    .line 6
    iget-object v2, p0, La/nw7;->b:La/vne;

    .line 7
    .line 8
    iget-object p0, p0, La/nw7;->d:La/pz40;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    packed-switch p2, :pswitch_data_0

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
    move-result p1

    .line 20
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, La/bby;

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    invoke-interface {p2, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    if-eqz p1, :cond_1

    .line 32
    .line 33
    new-instance p1, La/atj;

    .line 34
    .line 35
    const/16 p2, 0x1b

    .line 36
    .line 37
    invoke-direct {p1, v1, v3, p2}, La/atj;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3, v3, p1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, La/bby;

    .line 61
    .line 62
    if-eqz p2, :cond_2

    .line 63
    .line 64
    invoke-interface {p2, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    if-eqz p1, :cond_3

    .line 68
    .line 69
    new-instance p1, La/qw7;

    .line 70
    .line 71
    const/4 p2, 0x1

    .line 72
    invoke-direct {p1, v1, v3, p2}, La/qw7;-><init>(La/t33;La/yje;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {v2, v3, v3, p1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, La/bby;

    .line 96
    .line 97
    if-eqz p2, :cond_4

    .line 98
    .line 99
    invoke-interface {p2, v3}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 100
    .line 101
    .line 102
    :cond_4
    if-eqz p1, :cond_5

    .line 103
    .line 104
    new-instance p1, La/qw7;

    .line 105
    .line 106
    const/4 p2, 0x0

    .line 107
    invoke-direct {p1, v1, v3, p2}, La/qw7;-><init>(La/t33;La/yje;B)V

    .line 108
    .line 109
    .line 110
    invoke-static {v2, v3, v3, p1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
