.class public final synthetic La/nrk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/nrk;->a:B

    iput-object p1, p0, La/nrk;->b:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;La/vpv;)V
    .locals 0

    .line 1
    const/4 p2, 0x2

    iput-byte p2, p0, La/nrk;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/nrk;->b:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/nrk;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/nrk;->b:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/hp4;->j:La/lxs0;

    .line 9
    .line 10
    check-cast p1, La/i73;

    .line 11
    .line 12
    iget-object v1, p1, La/i73;->e:La/pz40;

    .line 13
    .line 14
    check-cast v1, La/hgk0;

    .line 15
    .line 16
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v0, v0, La/lxs0;->b:Lkotlin/jvm/functions/Function1;

    .line 21
    .line 22
    iget-object p1, p1, La/i73;->f:La/t73;

    .line 23
    .line 24
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-interface {p0, v1, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_0
    check-cast p1, La/ocz;

    .line 35
    .line 36
    iget v0, p1, La/ocz;->a:I

    .line 37
    .line 38
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget p1, p1, La/ocz;->b:I

    .line 43
    .line 44
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-interface {p0, v0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_1
    check-cast p1, Ljava/lang/Long;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const-string v0, "HEAD_TO_HEAD_STATISTIC"

    .line 60
    .line 61
    invoke-interface {p0, v0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_2
    check-cast p1, Landroid/content/Context;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v0, Lorg/xplatform/uikit/components/chips/DsChips;

    .line 73
    .line 74
    const/4 v1, 0x0

    .line 75
    invoke-direct {v0, p1, v1}, Lorg/xplatform/uikit/components/chips/DsChips;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 76
    .line 77
    .line 78
    new-instance p1, La/qyl;

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    invoke-direct {p1, p0, v1}, La/qyl;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p1}, Lorg/xplatform/uikit/components/chips/DsChips;->setOnChipClickListener(Lkotlin/jvm/functions/Function2;)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_3
    check-cast p1, La/y8m;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object v0, p1, La/y8m;->b:Ljava/lang/String;

    .line 94
    .line 95
    iget-object p1, p1, La/y8m;->d:Ljava/lang/String;

    .line 96
    .line 97
    invoke-interface {p0, v0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 101
    .line 102
    return-object p0

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
