.class public final La/exn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILkotlin/jvm/functions/Function0;La/pz40;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/exn;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, La/exn;->b:I

    .line 8
    .line 9
    iput-object p2, p0, La/exn;->c:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/exn;->d:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/kie0;ILa/kmq;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/exn;->a:B

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/exn;->c:Ljava/lang/Object;

    iput p2, p0, La/exn;->b:I

    iput-object p3, p0, La/exn;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/exn;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/exn;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iget v2, p0, La/exn;->b:I

    .line 6
    .line 7
    iget-object v3, p0, La/exn;->c:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    instance-of v0, p2, La/mnq;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    move-object v0, p2

    .line 17
    check-cast v0, La/mnq;

    .line 18
    .line 19
    iget v4, v0, La/mnq;->k:I

    .line 20
    .line 21
    const/high16 v5, -0x80000000

    .line 22
    .line 23
    and-int v6, v4, v5

    .line 24
    .line 25
    if-eqz v6, :cond_0

    .line 26
    .line 27
    sub-int/2addr v4, v5

    .line 28
    iput v4, v0, La/mnq;->k:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, La/mnq;

    .line 32
    .line 33
    invoke-direct {v0, p0, p2}, La/mnq;-><init>(La/exn;La/yje;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p0, v0, La/mnq;->i:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object p2, La/wne;->a:La/wne;

    .line 39
    .line 40
    iget v4, v0, La/mnq;->k:I

    .line 41
    .line 42
    const/4 v5, 0x1

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    if-ne v4, v5, :cond_1

    .line 46
    .line 47
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p2, 0x0

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    check-cast v3, La/kie0;

    .line 62
    .line 63
    iget p0, v3, La/kie0;->a:I

    .line 64
    .line 65
    if-lt p0, v2, :cond_4

    .line 66
    .line 67
    check-cast v1, La/kmq;

    .line 68
    .line 69
    iput v5, v0, La/mnq;->k:I

    .line 70
    .line 71
    invoke-interface {v1, p1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    if-ne p0, p2, :cond_3

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    :goto_1
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    add-int/2addr p0, v5

    .line 82
    iput p0, v3, La/kie0;->a:I

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :goto_2
    return-object p2

    .line 86
    :pswitch_0
    check-cast p1, La/mcz;

    .line 87
    .line 88
    iget-object p0, p1, La/mcz;->l:Ljava/util/List;

    .line 89
    .line 90
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, La/ncz;

    .line 95
    .line 96
    if-eqz p0, :cond_5

    .line 97
    .line 98
    iget p0, p0, La/ncz;->a:I

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_5
    const/4 p0, -0x1

    .line 102
    :goto_3
    iget p1, p1, La/mcz;->o:I

    .line 103
    .line 104
    sub-int/2addr p1, v2

    .line 105
    if-lt p0, p1, :cond_6

    .line 106
    .line 107
    check-cast v1, La/pz40;

    .line 108
    .line 109
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    check-cast p0, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-eqz p0, :cond_6

    .line 120
    .line 121
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 122
    .line 123
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
