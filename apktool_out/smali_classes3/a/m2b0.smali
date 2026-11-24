.class public final La/m2b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/j2b0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/j2b0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/m2b0;->a:B

    iput-object p1, p0, La/m2b0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/m2b0;->c:La/j2b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/m2b0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/m2b0;->c:La/j2b0;

    .line 4
    .line 5
    iget-object p0, p0, La/m2b0;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/m2b0;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {v0, p0, v1, v2}, La/m2b0;-><init>(Lkotlin/jvm/functions/Function1;La/j2b0;B)V

    .line 14
    .line 15
    .line 16
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 17
    .line 18
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, La/bjj;->a()V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    new-instance v0, La/s1b0;

    .line 29
    .line 30
    check-cast v1, La/h2b0;

    .line 31
    .line 32
    iget-object v1, v1, La/h2b0;->a:La/lqv;

    .line 33
    .line 34
    invoke-direct {v0, v1}, La/s1b0;-><init>(La/lqv;)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_1
    new-instance v0, La/m2b0;

    .line 44
    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-direct {v0, p0, v1, v2}, La/m2b0;-><init>(Lkotlin/jvm/functions/Function1;La/j2b0;B)V

    .line 47
    .line 48
    .line 49
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 50
    .line 51
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, La/bjj;->a()V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_2
    new-instance v0, La/t1b0;

    .line 62
    .line 63
    check-cast v1, La/e2b0;

    .line 64
    .line 65
    iget-object v1, v1, La/e2b0;->a:La/vs5;

    .line 66
    .line 67
    invoke-direct {v0, v1}, La/t1b0;-><init>(La/vs5;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
