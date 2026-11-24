.class public final synthetic La/qv40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/a4x;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qv40;->a:B

    iput-object p1, p0, La/qv40;->b:La/a4x;

    iput-object p2, p0, La/qv40;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/qv40;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/qv40;->c:Lkotlin/jvm/functions/Function2;

    .line 5
    .line 6
    iget-object p0, p0, La/qv40;->b:La/a4x;

    .line 7
    .line 8
    check-cast p1, La/hcz;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    new-instance v3, La/a580;

    .line 21
    .line 22
    const/4 v4, 0x4

    .line 23
    invoke-direct {v3, p0, v4}, La/a580;-><init>(Ljava/util/List;B)V

    .line 24
    .line 25
    .line 26
    new-instance v4, La/h8w;

    .line 27
    .line 28
    const/16 v5, 0xe

    .line 29
    .line 30
    invoke-direct {v4, p0, v2, p0, v5}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    new-instance p0, La/ugd;

    .line 34
    .line 35
    const v2, 0x799532c4

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, v2, v1, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-virtual {p1, v0, v1, v3, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance v0, La/da40;

    .line 52
    .line 53
    const/16 v3, 0xc

    .line 54
    .line 55
    invoke-direct {v0, v3}, La/da40;-><init>(B)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    new-instance v4, La/ygy;

    .line 63
    .line 64
    const/16 v5, 0x18

    .line 65
    .line 66
    invoke-direct {v4, v0, p0, v5}, La/ygy;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    new-instance v0, La/ap30;

    .line 70
    .line 71
    const/16 v5, 0xf

    .line 72
    .line 73
    invoke-direct {v0, p0, v5}, La/ap30;-><init>(Ljava/util/List;B)V

    .line 74
    .line 75
    .line 76
    new-instance v5, La/o0i;

    .line 77
    .line 78
    const/4 v6, 0x3

    .line 79
    invoke-direct {v5, p0, v2, v6}, La/o0i;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function2;B)V

    .line 80
    .line 81
    .line 82
    new-instance p0, La/ugd;

    .line 83
    .line 84
    const v2, 0x2fd4df92

    .line 85
    .line 86
    .line 87
    invoke-direct {p0, v2, v1, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v3, v4, v0, p0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

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
