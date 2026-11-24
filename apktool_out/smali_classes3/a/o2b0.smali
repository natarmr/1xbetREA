.class public final La/o2b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(BJLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/o2b0;->a:B

    iput-object p4, p0, La/o2b0;->b:Lkotlin/jvm/functions/Function1;

    iput-wide p2, p0, La/o2b0;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/o2b0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/v1b0;

    .line 7
    .line 8
    iget-wide v1, p0, La/o2b0;->c:J

    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, La/v1b0;-><init>(J)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/o2b0;->b:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    new-instance v0, La/y1b0;

    .line 22
    .line 23
    iget-wide v1, p0, La/o2b0;->c:J

    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, La/y1b0;-><init>(J)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, La/o2b0;->b:Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    new-instance v0, La/y1b0;

    .line 37
    .line 38
    iget-wide v1, p0, La/o2b0;->c:J

    .line 39
    .line 40
    invoke-direct {v0, v1, v2}, La/y1b0;-><init>(J)V

    .line 41
    .line 42
    .line 43
    iget-object p0, p0, La/o2b0;->b:Lkotlin/jvm/functions/Function1;

    .line 44
    .line 45
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
