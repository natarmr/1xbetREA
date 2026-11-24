.class public final synthetic La/hd20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rg20;


# direct methods
.method public synthetic constructor <init>(La/rg20;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/hd20;->a:B

    iput-object p1, p0, La/hd20;->b:La/rg20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/hd20;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/hd20;->b:La/rg20;

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
    iget-object v0, p0, La/rg20;->p:La/duj;

    .line 14
    .line 15
    new-instance v1, La/gd20;

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-direct {v1, p0, v2}, La/gd20;-><init>(La/rg20;B)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, La/rg20;->t:La/bn6;

    .line 25
    .line 26
    iget-object p1, p1, La/bn6;->b:La/kt2;

    .line 27
    .line 28
    const-string v0, "betkit_bet_error"

    .line 29
    .line 30
    const-string v1, "promocode"

    .line 31
    .line 32
    const-string v2, ""

    .line 33
    .line 34
    invoke-static {v1, v2, p1, v0}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, La/rg20;->L:La/ol60;

    .line 38
    .line 39
    sget-object p1, La/ie20;->a:La/ie20;

    .line 40
    .line 41
    invoke-virtual {p0, p1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, La/rg20;->U:La/bby;

    .line 51
    .line 52
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 53
    .line 54
    .line 55
    instance-of p1, p1, Ljava/util/concurrent/CancellationException;

    .line 56
    .line 57
    if-nez p1, :cond_0

    .line 58
    .line 59
    iget-object p1, p0, La/rg20;->I:La/p7m0;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    sget-object v1, La/de20;->a:La/de20;

    .line 66
    .line 67
    invoke-virtual {p1, v0, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, La/rg20;->J:La/p7m0;

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    sget-object p1, La/ae20;->a:La/ae20;

    .line 76
    .line 77
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, La/rg20;->p:La/duj;

    .line 87
    .line 88
    new-instance v1, La/gd20;

    .line 89
    .line 90
    const/4 v2, 0x1

    .line 91
    invoke-direct {v1, p0, v2}, La/gd20;-><init>(La/rg20;B)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 98
    .line 99
    return-object p0

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
