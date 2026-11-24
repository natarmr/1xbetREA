.class public final synthetic La/zkv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/alv;


# direct methods
.method public synthetic constructor <init>(La/alv;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zkv;->a:B

    iput-object p1, p0, La/zkv;->b:La/alv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/zkv;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zkv;->b:La/alv;

    .line 4
    .line 5
    check-cast p1, La/k0w0;

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
    iget-object p0, p0, La/alv;->j:La/vqc;

    .line 14
    .line 15
    new-instance v0, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 16
    .line 17
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 18
    .line 19
    sget-object v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromMain;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromMain;

    .line 20
    .line 21
    invoke-direct {v0, v1, v2}, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;-><init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$homeScreen$1;

    .line 25
    .line 26
    invoke-direct {v1, p0, v0}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$homeScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/home/CyberHomeParams;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, La/alv;->i:La/peg0;

    .line 39
    .line 40
    new-instance v0, La/hr1;

    .line 41
    .line 42
    const-wide/16 v1, 0x0

    .line 43
    .line 44
    const/4 v3, 0x3

    .line 45
    invoke-direct {v0, v1, v2, v3}, La/hr1;-><init>(JI)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
