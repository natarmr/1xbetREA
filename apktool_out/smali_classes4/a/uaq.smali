.class public final synthetic La/uaq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ebq;


# direct methods
.method public synthetic constructor <init>(La/ebq;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uaq;->a:B

    iput-object p1, p0, La/uaq;->b:La/ebq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/uaq;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/uaq;->b:La/ebq;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Throwable;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/ebq;->Q:La/duj;

    .line 15
    .line 16
    new-instance v0, La/jbp;

    .line 17
    .line 18
    const/16 v1, 0x16

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/jbp;-><init>(B)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, La/ebq;->Q:La/duj;

    .line 35
    .line 36
    new-instance v0, La/jbp;

    .line 37
    .line 38
    const/16 v1, 0x17

    .line 39
    .line 40
    invoke-direct {v0, v1}, La/jbp;-><init>(B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1, v0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, La/ebq;->Q:La/duj;

    .line 55
    .line 56
    new-instance v2, La/vaq;

    .line 57
    .line 58
    invoke-direct {v2, p0, v1}, La/vaq;-><init>(La/ebq;B)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_2
    check-cast p1, La/k0w0;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v0, La/taq;

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-direct {v0, p0, v2}, La/taq;-><init>(La/ebq;B)V

    .line 76
    .line 77
    .line 78
    new-instance p0, La/a1w0;

    .line 79
    .line 80
    invoke-direct {p0, v0}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, La/c8d;

    .line 90
    .line 91
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 92
    .line 93
    new-instance v0, La/v7d;

    .line 94
    .line 95
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
