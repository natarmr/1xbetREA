.class public final synthetic La/p520;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/h620;


# direct methods
.method public synthetic constructor <init>(La/h620;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p520;->a:B

    iput-object p1, p0, La/p520;->b:La/h620;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/p520;->a:B

    .line 2
    .line 3
    sget-object v1, La/hnb0;->a:La/hnb0;

    .line 4
    .line 5
    iget-object p0, p0, La/p520;->b:La/h620;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Throwable;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/h620;->e:La/duj;

    .line 16
    .line 17
    new-instance v0, La/gm10;

    .line 18
    .line 19
    const/16 v1, 0x1c

    .line 20
    .line 21
    invoke-direct {v0, v1}, La/gm10;-><init>(B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, La/h620;->e:La/duj;

    .line 34
    .line 35
    new-instance v1, La/q520;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-direct {v1, p0, v2}, La/q520;-><init>(La/h620;B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    instance-of p1, p1, Ljava/util/concurrent/CancellationException;

    .line 51
    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    iget-object p1, p0, La/h620;->e0:La/nwo0;

    .line 55
    .line 56
    iget-boolean p1, p1, La/nwo0;->a:Z

    .line 57
    .line 58
    if-eqz p1, :cond_0

    .line 59
    .line 60
    sget-object p1, La/xvo0;->a:La/xvo0;

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    sget-object p1, La/awo0;->a:La/awo0;

    .line 64
    .line 65
    :goto_0
    invoke-virtual {p0, p1}, La/h620;->E(La/hwo0;)V

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, La/h620;->l0:La/p7m0;

    .line 69
    .line 70
    invoke-virtual {p0, v1}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object p0, p0, La/h620;->e:La/duj;

    .line 80
    .line 81
    new-instance v0, La/gm10;

    .line 82
    .line 83
    const/16 v1, 0x1b

    .line 84
    .line 85
    invoke-direct {v0, v1}, La/gm10;-><init>(B)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 89
    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    instance-of p1, p1, Ljava/util/concurrent/CancellationException;

    .line 98
    .line 99
    if-nez p1, :cond_2

    .line 100
    .line 101
    iget-object p0, p0, La/h620;->l0:La/p7m0;

    .line 102
    .line 103
    invoke-virtual {p0, v1}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
