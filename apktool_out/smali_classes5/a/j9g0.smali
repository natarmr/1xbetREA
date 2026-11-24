.class public final synthetic La/j9g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/o9g0;


# direct methods
.method public synthetic constructor <init>(La/o9g0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/j9g0;->a:B

    iput-object p1, p0, La/j9g0;->b:La/o9g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/j9g0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/j9g0;->b:La/o9g0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/o9g0;->v:La/w4p0;

    .line 14
    .line 15
    new-instance v0, La/bqk0;

    .line 16
    .line 17
    invoke-direct {v0, p1}, La/bqk0;-><init>(Ljava/lang/Throwable;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, La/b6t;

    .line 26
    .line 27
    invoke-virtual {p0, v0}, La/b6t;->d(La/dqk0;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, La/o9g0;->E:La/zie0;

    .line 39
    .line 40
    new-instance v1, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;

    .line 41
    .line 42
    iget-object p0, p0, La/o9g0;->p:Lorg/xplatform/special_event/impl/results/presentation/model/ResultsScreenParams;

    .line 43
    .line 44
    iget v2, p0, Lorg/xplatform/special_event/impl/results/presentation/model/ResultsScreenParams;->a:I

    .line 45
    .line 46
    sget-object v3, La/y5g0;->Q1:La/gle0;

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    sget-object v3, La/y5g0;->S1:Ljava/lang/String;

    .line 52
    .line 53
    new-instance v4, La/wr2;

    .line 54
    .line 55
    iget p0, p0, Lorg/xplatform/special_event/impl/results/presentation/model/ResultsScreenParams;->a:I

    .line 56
    .line 57
    invoke-direct {v4, p0}, La/ds2;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-direct {v1, v2, v3, v4}, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;-><init>(ILjava/lang/String;La/ms2;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    new-instance p0, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenFactoryImpl$getSportGameFilterSelectionScreen$1;

    .line 67
    .line 68
    invoke-direct {p0, v1}, Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenFactoryImpl$getSportGameFilterSelectionScreen$1;-><init>(Lorg/xplatform/special_event/impl/filter/navigation/SportGameFilterSelectionScreenParams;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 72
    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_1
    check-cast p1, La/k0w0;

    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, La/o9g0;->G:La/zie0;

    .line 83
    .line 84
    iget-object p0, p0, La/o9g0;->p:Lorg/xplatform/special_event/impl/results/presentation/model/ResultsScreenParams;

    .line 85
    .line 86
    iget p0, p0, Lorg/xplatform/special_event/impl/results/presentation/model/ResultsScreenParams;->a:I

    .line 87
    .line 88
    sget-object v1, La/ifh0;->b:La/ifh0;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance v0, Lorg/xplatform/special_event/impl/search/navigation/SearchScreenFactory$getScreen$1;

    .line 94
    .line 95
    invoke-direct {v0, p0, v1}, Lorg/xplatform/special_event/impl/search/navigation/SearchScreenFactory$getScreen$1;-><init>(ILa/ifh0;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 99
    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
