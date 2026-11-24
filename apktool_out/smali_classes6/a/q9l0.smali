.class public final synthetic La/q9l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/j3n;


# direct methods
.method public synthetic constructor <init>(La/j3n;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/q9l0;->a:B

    iput-object p1, p0, La/q9l0;->b:La/j3n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/q9l0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const v2, 0x2fd4df92

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/q9l0;->b:La/j3n;

    .line 8
    .line 9
    check-cast p1, La/hcz;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/j3n;->e:Ljava/util/ArrayList;

    .line 18
    .line 19
    sget-object v0, La/s9l0;->b:La/s9l0;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    new-instance v3, La/t9l0;

    .line 26
    .line 27
    invoke-direct {v3, p0}, La/t9l0;-><init>(Ljava/util/ArrayList;)V

    .line 28
    .line 29
    .line 30
    new-instance v4, La/t9l0;

    .line 31
    .line 32
    const/4 v5, 0x2

    .line 33
    invoke-direct {v4, p0, v5}, La/t9l0;-><init>(Ljava/util/ArrayList;B)V

    .line 34
    .line 35
    .line 36
    new-instance v5, La/wyl0;

    .line 37
    .line 38
    const/4 v6, 0x4

    .line 39
    invoke-direct {v5, p0, v6}, La/wyl0;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    new-instance p0, La/ugd;

    .line 43
    .line 44
    invoke-direct {p0, v2, v1, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0, v3, v4, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, La/j3n;->d:Ljava/util/ArrayList;

    .line 57
    .line 58
    sget-object v0, La/r9l0;->b:La/r9l0;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    new-instance v3, La/j13;

    .line 65
    .line 66
    const/16 v4, 0x1d

    .line 67
    .line 68
    invoke-direct {v3, p0, v4}, La/j13;-><init>(Ljava/util/ArrayList;B)V

    .line 69
    .line 70
    .line 71
    new-instance v4, La/t9l0;

    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    invoke-direct {v4, p0, v5}, La/t9l0;-><init>(Ljava/util/ArrayList;B)V

    .line 75
    .line 76
    .line 77
    new-instance v5, La/wyl0;

    .line 78
    .line 79
    const/4 v6, 0x3

    .line 80
    invoke-direct {v5, p0, v6}, La/wyl0;-><init>(Ljava/lang/Object;B)V

    .line 81
    .line 82
    .line 83
    new-instance p0, La/ugd;

    .line 84
    .line 85
    invoke-direct {p0, v2, v1, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v0, v3, v4, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 89
    .line 90
    .line 91
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
