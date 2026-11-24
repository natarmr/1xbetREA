.class public final synthetic La/mxl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/rxl0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/rxl0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mxl0;->a:B

    iput-object p1, p0, La/mxl0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/mxl0;->c:La/rxl0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/mxl0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/mxl0;->c:La/rxl0;

    .line 4
    .line 5
    iget-object p0, p0, La/mxl0;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/frk0;

    .line 11
    .line 12
    check-cast v1, La/oxl0;

    .line 13
    .line 14
    iget-object v1, v1, La/oxl0;->b:La/mvl0;

    .line 15
    .line 16
    iget-wide v2, v1, La/mvl0;->a:J

    .line 17
    .line 18
    iget-object v1, v1, La/mvl0;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-direct {v0, v2, v3, v1}, La/frk0;-><init>(JLjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    new-instance v0, La/frk0;

    .line 30
    .line 31
    check-cast v1, La/pxl0;

    .line 32
    .line 33
    iget-object v1, v1, La/pxl0;->b:La/mvl0;

    .line 34
    .line 35
    iget-wide v2, v1, La/mvl0;->a:J

    .line 36
    .line 37
    iget-object v1, v1, La/mvl0;->b:Ljava/lang/String;

    .line 38
    .line 39
    invoke-direct {v0, v2, v3, v1}, La/frk0;-><init>(JLjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_1
    new-instance v0, La/frk0;

    .line 49
    .line 50
    check-cast v1, La/nxl0;

    .line 51
    .line 52
    iget-object v1, v1, La/nxl0;->b:La/kvl0;

    .line 53
    .line 54
    iget-wide v2, v1, La/kvl0;->a:J

    .line 55
    .line 56
    iget-object v1, v1, La/kvl0;->b:Ljava/lang/String;

    .line 57
    .line 58
    invoke-direct {v0, v2, v3, v1}, La/frk0;-><init>(JLjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
