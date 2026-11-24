.class public final La/k4e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l4e0;

.field public final synthetic c:Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;


# direct methods
.method public synthetic constructor <init>(La/l4e0;Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/k4e0;->a:B

    iput-object p1, p0, La/k4e0;->b:La/l4e0;

    iput-object p2, p0, La/k4e0;->c:Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/k4e0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/k4e0;->c:Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;

    .line 4
    .line 5
    iget-object p0, p0, La/k4e0;->b:La/l4e0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/l4e0;->n2:La/fl70;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, La/l4e0;->P0(Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    sget-object v0, La/l4e0;->n2:La/fl70;

    .line 19
    .line 20
    invoke-virtual {p0, v1}, La/l4e0;->P0(Lorg/xplatform/statistic/rating/impl/rating_statistic/domain/model/SelectorOptionModel;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
