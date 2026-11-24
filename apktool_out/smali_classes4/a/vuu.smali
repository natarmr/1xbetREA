.class public final La/vuu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:La/gmq;


# direct methods
.method public synthetic constructor <init>(La/gmq;IB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vuu;->a:B

    iput-object p1, p0, La/vuu;->c:La/gmq;

    iput p2, p0, La/vuu;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/vuu;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget v2, p0, La/vuu;->b:I

    .line 5
    .line 6
    iget-object v3, p0, La/vuu;->c:La/gmq;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast v3, La/lnq;

    .line 12
    .line 13
    new-instance p0, La/uuu;

    .line 14
    .line 15
    invoke-direct {p0, p1, v2, v1}, La/uuu;-><init>(La/kmq;IB)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, p0, p2}, La/lnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, La/wne;->a:La/wne;

    .line 23
    .line 24
    if-ne p0, p1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    :goto_0
    return-object p0

    .line 30
    :pswitch_0
    instance-of v0, p2, La/suu;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    move-object v0, p2

    .line 35
    check-cast v0, La/suu;

    .line 36
    .line 37
    iget v4, v0, La/suu;->j:I

    .line 38
    .line 39
    const/high16 v5, -0x80000000

    .line 40
    .line 41
    and-int v6, v4, v5

    .line 42
    .line 43
    if-eqz v6, :cond_1

    .line 44
    .line 45
    sub-int/2addr v4, v5

    .line 46
    iput v4, v0, La/suu;->j:I

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    new-instance v0, La/suu;

    .line 50
    .line 51
    invoke-direct {v0, p0, p2}, La/suu;-><init>(La/vuu;La/yje;)V

    .line 52
    .line 53
    .line 54
    :goto_1
    iget-object p0, v0, La/suu;->i:Ljava/lang/Object;

    .line 55
    .line 56
    sget-object p2, La/wne;->a:La/wne;

    .line 57
    .line 58
    iget v4, v0, La/suu;->j:I

    .line 59
    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    if-ne v4, v1, :cond_2

    .line 63
    .line 64
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 p2, 0x0

    .line 74
    goto :goto_3

    .line 75
    :cond_3
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    check-cast v3, La/p6d;

    .line 79
    .line 80
    new-instance p0, La/uuu;

    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    invoke-direct {p0, p1, v2, v4}, La/uuu;-><init>(La/kmq;IB)V

    .line 84
    .line 85
    .line 86
    iput v1, v0, La/suu;->j:I

    .line 87
    .line 88
    invoke-virtual {v3, p0, v0}, La/p6d;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-ne p0, p2, :cond_4

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    :goto_2
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    :goto_3
    return-object p2

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
