.class public final La/y2p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/p6t0;


# direct methods
.method public constructor <init>(La/p6t0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/y2p0;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/y2p0;->c:La/p6t0;

    .line 8
    .line 9
    iput-object p2, p0, La/y2p0;->b:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;La/p6t0;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/y2p0;->a:B

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/y2p0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/y2p0;->c:La/p6t0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/y2p0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/y2p0;->c:La/p6t0;

    .line 4
    .line 5
    iget-object p0, p0, La/y2p0;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/k2p0;

    .line 11
    .line 12
    check-cast v1, La/o2p0;

    .line 13
    .line 14
    iget-object v1, v1, La/o2p0;->c:La/dtp0;

    .line 15
    .line 16
    invoke-direct {v0, v1}, La/k2p0;-><init>(La/dtp0;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast v1, La/u2p0;

    .line 26
    .line 27
    iget-object v0, v1, La/u2p0;->a:Ljava/lang/String;

    .line 28
    .line 29
    const-string v1, "TEAM_BET_COMPLETED_MATCHES_HEADER"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    sget-object v0, La/i2p0;->a:La/i2p0;

    .line 38
    .line 39
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
