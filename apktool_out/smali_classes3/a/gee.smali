.class public final synthetic La/gee;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/gee;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gee;->c:La/l7m0;

    iput-object p2, p0, La/gee;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/l7m0;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/gee;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gee;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/gee;->c:La/l7m0;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/gee;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/gee;->c:La/l7m0;

    .line 4
    .line 5
    iget-object p0, p0, La/gee;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/p1b0;->a:La/p1b0;

    .line 11
    .line 12
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/x2b0;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    instance-of v1, v0, La/v2b0;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    sget-object v0, La/q1b0;->a:La/q1b0;

    .line 28
    .line 29
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    instance-of v0, v0, La/w2b0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    sget-object v0, La/r1b0;->a:La/r1b0;

    .line 38
    .line 39
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    :goto_1
    return-object p0

    .line 50
    :pswitch_0
    sget-object v0, La/fee;->h:La/nwd;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    new-instance v0, La/fee;

    .line 59
    .line 60
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-direct {v0, p0, v2}, La/fee;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iput-object v1, v0, La/fee;->b:La/l7m0;

    .line 68
    .line 69
    return-object v0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
