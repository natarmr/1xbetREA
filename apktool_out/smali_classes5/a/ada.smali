.class public final synthetic La/ada;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/oda;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/oda;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ada;->a:B

    iput-object p1, p0, La/ada;->b:La/oda;

    iput-object p2, p0, La/ada;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/ada;->a:B

    .line 2
    .line 3
    const v1, 0x2fd4df92

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, La/ada;->c:Lkotlin/jvm/functions/Function2;

    .line 7
    .line 8
    iget-object p0, p0, La/ada;->b:La/oda;

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    const/4 v4, 0x0

    .line 12
    check-cast p1, La/hcz;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, La/oda;->d:Ljava/util/ArrayList;

    .line 21
    .line 22
    sget-object v0, La/eda;->b:La/eda;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    new-instance v5, La/j13;

    .line 29
    .line 30
    const/4 v6, 0x7

    .line 31
    invoke-direct {v5, p0, v6}, La/j13;-><init>(Ljava/util/ArrayList;B)V

    .line 32
    .line 33
    .line 34
    new-instance v6, La/j13;

    .line 35
    .line 36
    const/16 v7, 0x8

    .line 37
    .line 38
    invoke-direct {v6, p0, v7, v4}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 39
    .line 40
    .line 41
    new-instance v4, La/fda;

    .line 42
    .line 43
    invoke-direct {v4, p0, v2, v3}, La/fda;-><init>(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;B)V

    .line 44
    .line 45
    .line 46
    new-instance p0, La/ugd;

    .line 47
    .line 48
    invoke-direct {p0, v1, v3, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0, v5, v6, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, La/oda;->c:Ljava/util/ArrayList;

    .line 61
    .line 62
    sget-object v0, La/dda;->b:La/dda;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    new-instance v5, La/j13;

    .line 69
    .line 70
    const/4 v6, 0x5

    .line 71
    invoke-direct {v5, p0, v6}, La/j13;-><init>(Ljava/util/ArrayList;B)V

    .line 72
    .line 73
    .line 74
    new-instance v6, La/j13;

    .line 75
    .line 76
    const/4 v7, 0x6

    .line 77
    invoke-direct {v6, p0, v7, v4}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 78
    .line 79
    .line 80
    new-instance v7, La/fda;

    .line 81
    .line 82
    invoke-direct {v7, p0, v2, v4}, La/fda;-><init>(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;B)V

    .line 83
    .line 84
    .line 85
    new-instance p0, La/ugd;

    .line 86
    .line 87
    invoke-direct {p0, v1, v3, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v0, v5, v6, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 91
    .line 92
    .line 93
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
