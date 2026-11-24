.class public final synthetic La/d42;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/d42;->a:B

    iput-object p1, p0, La/d42;->b:Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/d42;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/d42;->b:Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/w32;

    .line 9
    .line 10
    sget-object v1, La/m32;->b:La/m32;

    .line 11
    .line 12
    sget-object v2, La/iun;->a:La/iun;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, La/w32;-><init>(La/m32;Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    sget v1, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->Q:I

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->R(La/x32;)V

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    new-instance v0, La/v32;

    .line 26
    .line 27
    sget-object v1, La/m32;->b:La/m32;

    .line 28
    .line 29
    sget-object v2, La/iun;->a:La/iun;

    .line 30
    .line 31
    invoke-direct {v0, v1, v2}, La/v32;-><init>(La/m32;Ljava/util/List;)V

    .line 32
    .line 33
    .line 34
    sget v1, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->Q:I

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->R(La/x32;)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_1
    new-instance v0, La/u32;

    .line 43
    .line 44
    sget-object v1, La/m32;->b:La/m32;

    .line 45
    .line 46
    sget-object v2, La/iun;->a:La/iun;

    .line 47
    .line 48
    sget-object v3, La/xun;->a:La/xun;

    .line 49
    .line 50
    invoke-direct {v0, v1, v2, v3}, La/u32;-><init>(La/m32;Ljava/util/List;Ljava/util/Set;)V

    .line 51
    .line 52
    .line 53
    sget v1, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->Q:I

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->R(La/x32;)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
