.class public final synthetic La/e54;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pkk0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/pkk0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/e54;->a:B

    iput-object p1, p0, La/e54;->b:La/pkk0;

    iput-object p2, p0, La/e54;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/e54;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/e54;->c:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iget-object p0, p0, La/e54;->b:La/pkk0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    check-cast p0, La/r3k;

    .line 14
    .line 15
    invoke-virtual {p0}, La/r3k;->a()V

    .line 16
    .line 17
    .line 18
    :cond_0
    new-instance p0, La/jmr;

    .line 19
    .line 20
    invoke-direct {p0, v1}, La/jmr;-><init>(Z)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    if-eqz p0, :cond_1

    .line 30
    .line 31
    check-cast p0, La/r3k;

    .line 32
    .line 33
    invoke-virtual {p0}, La/r3k;->a()V

    .line 34
    .line 35
    .line 36
    :cond_1
    new-instance p0, La/his;

    .line 37
    .line 38
    invoke-direct {p0, v1}, La/his;-><init>(Z)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_1
    if-eqz p0, :cond_2

    .line 48
    .line 49
    check-cast p0, La/r3k;

    .line 50
    .line 51
    invoke-virtual {p0}, La/r3k;->a()V

    .line 52
    .line 53
    .line 54
    :cond_2
    new-instance p0, La/j6s;

    .line 55
    .line 56
    invoke-direct {p0, v1}, La/j6s;-><init>(Z)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_2
    if-eqz p0, :cond_3

    .line 66
    .line 67
    check-cast p0, La/r3k;

    .line 68
    .line 69
    invoke-virtual {p0}, La/r3k;->a()V

    .line 70
    .line 71
    .line 72
    :cond_3
    new-instance p0, La/opm0;

    .line 73
    .line 74
    const/4 v0, 0x4

    .line 75
    invoke-direct {p0, v2, v0}, La/opm0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 76
    .line 77
    .line 78
    sget-object v0, La/ivb0;->b:La/ymx;

    .line 79
    .line 80
    invoke-static {v0, p0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0}, La/bjj;->a()V

    .line 85
    .line 86
    .line 87
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_3
    if-eqz p0, :cond_4

    .line 91
    .line 92
    check-cast p0, La/r3k;

    .line 93
    .line 94
    invoke-virtual {p0}, La/r3k;->a()V

    .line 95
    .line 96
    .line 97
    :cond_4
    sget-object p0, La/z44;->a:La/z44;

    .line 98
    .line 99
    invoke-interface {v2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
