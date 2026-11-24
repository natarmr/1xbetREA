.class public final synthetic La/tl1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gr00;


# direct methods
.method public synthetic constructor <init>(La/gr00;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/tl1;->a:B

    iput-object p1, p0, La/tl1;->b:La/gr00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/tl1;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/tl1;->b:La/gr00;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, La/k0w0;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/gr00;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/fvt0;

    .line 17
    .line 18
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/h7i;

    .line 21
    .line 22
    invoke-virtual {p0}, La/h7i;->d()La/peg0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, La/peg0;->o()Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, La/c8d;

    .line 37
    .line 38
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 39
    .line 40
    new-instance v0, La/v7d;

    .line 41
    .line 42
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_0
    check-cast p1, La/i1w0;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v0, La/tl1;

    .line 56
    .line 57
    invoke-direct {v0, p0, v1}, La/tl1;-><init>(La/gr00;B)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    nop

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
