.class public final synthetic La/dj60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/k3t0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/k3t0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/dj60;->a:B

    iput-object p1, p0, La/dj60;->b:La/l7m0;

    iput-object p2, p0, La/dj60;->c:La/k3t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/dj60;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/dj60;->c:La/k3t0;

    .line 4
    .line 5
    iget-object p0, p0, La/dj60;->b:La/l7m0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, La/wlj0;

    .line 21
    .line 22
    iget p0, p0, La/wlj0;->a:I

    .line 23
    .line 24
    if-eq p1, p0, :cond_0

    .line 25
    .line 26
    new-instance p0, La/nlj0;

    .line 27
    .line 28
    invoke-direct {p0, p1}, La/nlj0;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, p0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    check-cast p1, La/hcz;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, La/hj60;

    .line 47
    .line 48
    iget-object p0, p0, La/hj60;->a:La/a4x;

    .line 49
    .line 50
    new-instance v0, La/mb50;

    .line 51
    .line 52
    const/16 v2, 0x1d

    .line 53
    .line 54
    invoke-direct {v0, v2}, La/mb50;-><init>(B)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    new-instance v3, La/m160;

    .line 62
    .line 63
    const/16 v4, 0xa

    .line 64
    .line 65
    invoke-direct {v3, v0, p0, v4}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    new-instance v0, La/ubn;

    .line 69
    .line 70
    const/16 v5, 0xe

    .line 71
    .line 72
    invoke-direct {v0, p0, v5}, La/ubn;-><init>(La/a4x;B)V

    .line 73
    .line 74
    .line 75
    new-instance v5, La/xe4;

    .line 76
    .line 77
    invoke-direct {v5, p0, v1, v4}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 78
    .line 79
    .line 80
    new-instance p0, La/ugd;

    .line 81
    .line 82
    const v1, 0x2fd4df92

    .line 83
    .line 84
    .line 85
    const/4 v4, 0x1

    .line 86
    invoke-direct {p0, v1, v4, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v2, v3, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
