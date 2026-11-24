.class public final synthetic La/v1y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a2y;


# direct methods
.method public synthetic constructor <init>(La/a2y;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/v1y;->a:B

    iput-object p1, p0, La/v1y;->b:La/a2y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/v1y;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/v1y;->b:La/a2y;

    .line 5
    .line 6
    check-cast p1, Ljava/lang/Throwable;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/String;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance p1, La/p1y;

    .line 14
    .line 15
    invoke-direct {p1, p2, v1}, La/p1y;-><init>(Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    sget p2, La/a2y;->G:I

    .line 19
    .line 20
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    instance-of v0, p1, La/zhi0;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    check-cast p1, La/zhi0;

    .line 37
    .line 38
    iget-object p1, p1, La/zhi0;->c:La/kuw;

    .line 39
    .line 40
    sget-object v0, La/i2o;->q:La/i2o;

    .line 41
    .line 42
    if-ne p1, v0, :cond_0

    .line 43
    .line 44
    new-instance p1, La/n1y;

    .line 45
    .line 46
    invoke-direct {p1, p2}, La/n1y;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance p1, La/p1y;

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    invoke-direct {p1, p2, v0}, La/p1y;-><init>(Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance p1, La/p1y;

    .line 72
    .line 73
    invoke-direct {p1, p2, v1}, La/p1y;-><init>(Ljava/lang/String;Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object p0

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
