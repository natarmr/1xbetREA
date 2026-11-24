.class public final La/bnn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/qln;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/qln;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bnn;->a:B

    iput-object p1, p0, La/bnn;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/bnn;->c:La/qln;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/bnn;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/bnn;->c:La/qln;

    .line 4
    .line 5
    iget-object p0, p0, La/bnn;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-wide v0, v1, La/qln;->a:J

    .line 11
    .line 12
    new-instance v2, La/yjn;

    .line 13
    .line 14
    invoke-direct {v2, v0, v1}, La/yjn;-><init>(J)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    iget-wide v0, v1, La/qln;->a:J

    .line 24
    .line 25
    new-instance v2, La/akn;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, La/akn;-><init>(J)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    iget-wide v0, v1, La/qln;->a:J

    .line 37
    .line 38
    new-instance v2, La/zjn;

    .line 39
    .line 40
    invoke-direct {v2, v0, v1}, La/zjn;-><init>(J)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_2
    iget-wide v0, v1, La/qln;->a:J

    .line 50
    .line 51
    new-instance v2, La/xjn;

    .line 52
    .line 53
    invoke-direct {v2, v0, v1}, La/xjn;-><init>(J)V

    .line 54
    .line 55
    .line 56
    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
