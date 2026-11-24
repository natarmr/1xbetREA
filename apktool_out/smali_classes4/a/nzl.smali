.class public final synthetic La/nzl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(BJLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/nzl;->a:B

    iput-object p4, p0, La/nzl;->b:Lkotlin/jvm/functions/Function1;

    iput-wide p2, p0, La/nzl;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/nzl;->a:B

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    iget-wide v2, p0, La/nzl;->c:J

    .line 6
    .line 7
    iget-object p0, p0, La/nzl;->b:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/ox;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v0, La/iyt0;

    .line 18
    .line 19
    shr-long v1, v2, v1

    .line 20
    .line 21
    long-to-int v1, v1

    .line 22
    invoke-direct {v0, p1, v1}, La/iyt0;-><init>(La/ox;I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    check-cast p1, La/ox;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v0, La/zvd0;

    .line 37
    .line 38
    shr-long v1, v2, v1

    .line 39
    .line 40
    long-to-int v1, v1

    .line 41
    invoke-direct {v0, p1, v1}, La/zvd0;-><init>(La/ox;I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_1
    check-cast p1, La/ox;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v0, La/o110;

    .line 56
    .line 57
    shr-long v1, v2, v1

    .line 58
    .line 59
    long-to-int v1, v1

    .line 60
    invoke-direct {v0, p1, v1}, La/o110;-><init>(La/ox;I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_2
    check-cast p1, La/wgl0;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance p1, La/hzl;

    .line 75
    .line 76
    invoke-direct {p1, v2, v3}, La/hzl;-><init>(J)V

    .line 77
    .line 78
    .line 79
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
