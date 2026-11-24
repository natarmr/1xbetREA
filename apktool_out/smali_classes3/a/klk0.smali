.class public final synthetic La/klk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/klk0;->a:B

    iput-object p1, p0, La/klk0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/klk0;->c:Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/klk0;->a:B

    .line 2
    .line 3
    sget-object v1, La/glk0;->a:La/glk0;

    .line 4
    .line 5
    iget-object v2, p0, La/klk0;->c:Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;

    .line 6
    .line 7
    iget-object p0, p0, La/klk0;->b:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    check-cast p1, La/mvl;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    new-instance p1, La/hlk0;

    .line 18
    .line 19
    iget-object v0, v2, Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;->a:Ljava/lang/String;

    .line 20
    .line 21
    invoke-direct {p1, v0}, La/hlk0;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    new-instance p1, La/hlk0;

    .line 34
    .line 35
    iget-object v0, v2, Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;->a:Ljava/lang/String;

    .line 36
    .line 37
    invoke-direct {p1, v0}, La/hlk0;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
