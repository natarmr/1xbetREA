.class public final La/wy1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/ry1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/ry1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wy1;->a:B

    iput-object p1, p0, La/wy1;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/wy1;->c:La/ry1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/wy1;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/wy1;->c:La/ry1;

    .line 4
    .line 5
    iget-object p0, p0, La/wy1;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/sx1;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v1, La/py1;

    .line 16
    .line 17
    iget-wide v1, v1, La/py1;->b:J

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, La/sx1;-><init>(J)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0

    .line 28
    :pswitch_0
    new-instance v0, La/tx1;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast v1, La/py1;

    .line 34
    .line 35
    iget-wide v2, v1, La/py1;->b:J

    .line 36
    .line 37
    iget-object v1, v1, La/py1;->q:La/fy1;

    .line 38
    .line 39
    iget-object v1, v1, La/fy1;->a:La/oy1;

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    iget-object v1, v1, La/oy1;->b:La/cy1;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v1, 0x0

    .line 47
    :goto_0
    sget-object v4, La/cy1;->c:La/cy1;

    .line 48
    .line 49
    if-ne v1, v4, :cond_1

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v1, 0x0

    .line 54
    :goto_1
    invoke-direct {v0, v1, v2, v3}, La/tx1;-><init>(ZJ)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
