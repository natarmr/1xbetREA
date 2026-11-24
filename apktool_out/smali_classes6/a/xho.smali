.class public final synthetic La/xho;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xho;->a:B

    iput-object p1, p0, La/xho;->b:Ljava/util/ArrayList;

    iput-object p2, p0, La/xho;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/xho;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, La/xho;->c:Lkotlin/jvm/functions/Function2;

    .line 6
    .line 7
    iget-object p0, p0, La/xho;->b:Ljava/util/ArrayList;

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
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    new-instance v4, La/j13;

    .line 22
    .line 23
    const/16 v5, 0x17

    .line 24
    .line 25
    invoke-direct {v4, p0, v5, v2}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 26
    .line 27
    .line 28
    new-instance v2, La/fda;

    .line 29
    .line 30
    const/4 v5, 0x3

    .line 31
    invoke-direct {v2, p0, v3, v5}, La/fda;-><init>(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;B)V

    .line 32
    .line 33
    .line 34
    new-instance p0, La/ugd;

    .line 35
    .line 36
    const v3, 0x2fd4df92

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, v3, v1, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-virtual {p1, v0, v1, v4, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance v0, La/x6o;

    .line 53
    .line 54
    const/16 v4, 0x9

    .line 55
    .line 56
    invoke-direct {v0, v4}, La/x6o;-><init>(B)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    new-instance v5, La/ctl;

    .line 64
    .line 65
    const/16 v6, 0x1c

    .line 66
    .line 67
    invoke-direct {v5, v0, p0, v6}, La/ctl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 68
    .line 69
    .line 70
    new-instance v0, La/j13;

    .line 71
    .line 72
    const/16 v6, 0xe

    .line 73
    .line 74
    invoke-direct {v0, p0, v6, v2}, La/j13;-><init>(Ljava/util/ArrayList;BZ)V

    .line 75
    .line 76
    .line 77
    new-instance v2, La/fda;

    .line 78
    .line 79
    const/4 v6, 0x2

    .line 80
    invoke-direct {v2, p0, v3, v6}, La/fda;-><init>(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;B)V

    .line 81
    .line 82
    .line 83
    new-instance p0, La/ugd;

    .line 84
    .line 85
    const v3, 0x799532c4

    .line 86
    .line 87
    .line 88
    invoke-direct {p0, v3, v1, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v4, v5, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 92
    .line 93
    .line 94
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 95
    .line 96
    return-object p0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
