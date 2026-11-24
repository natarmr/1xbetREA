.class public final La/bhg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/p7m0;

.field public final synthetic c:La/sip;


# direct methods
.method public synthetic constructor <init>(La/p7m0;La/sip;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bhg;->a:B

    iput-object p1, p0, La/bhg;->b:La/p7m0;

    iput-object p2, p0, La/bhg;->c:La/sip;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/bhg;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/bhg;->c:La/sip;

    .line 4
    .line 5
    iget-object v2, p0, La/bhg;->b:La/p7m0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/high16 v5, -0x80000000

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    instance-of v0, p2, La/pch;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, La/pch;

    .line 22
    .line 23
    iget v7, v0, La/pch;->j:I

    .line 24
    .line 25
    and-int v8, v7, v5

    .line 26
    .line 27
    if-eqz v8, :cond_0

    .line 28
    .line 29
    sub-int/2addr v7, v5

    .line 30
    iput v7, v0, La/pch;->j:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/pch;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, La/pch;-><init>(La/bhg;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/pch;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v5, v0, La/pch;->j:I

    .line 43
    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    if-ne v5, v6, :cond_1

    .line 47
    .line 48
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    new-instance p0, La/ahg;

    .line 62
    .line 63
    invoke-direct {p0, p1, v1, v6}, La/ahg;-><init>(La/kmq;La/sip;B)V

    .line 64
    .line 65
    .line 66
    iput v6, v0, La/pch;->j:I

    .line 67
    .line 68
    invoke-virtual {v2, p0, v0}, La/p7m0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-object v3, p2

    .line 72
    :goto_1
    return-object v3

    .line 73
    :pswitch_0
    instance-of v0, p2, La/ygg;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    move-object v0, p2

    .line 78
    check-cast v0, La/ygg;

    .line 79
    .line 80
    iget v7, v0, La/ygg;->j:I

    .line 81
    .line 82
    and-int v8, v7, v5

    .line 83
    .line 84
    if-eqz v8, :cond_3

    .line 85
    .line 86
    sub-int/2addr v7, v5

    .line 87
    iput v7, v0, La/ygg;->j:I

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    new-instance v0, La/ygg;

    .line 91
    .line 92
    invoke-direct {v0, p0, p2}, La/ygg;-><init>(La/bhg;La/yje;)V

    .line 93
    .line 94
    .line 95
    :goto_2
    iget-object p0, v0, La/ygg;->i:Ljava/lang/Object;

    .line 96
    .line 97
    sget-object p2, La/wne;->a:La/wne;

    .line 98
    .line 99
    iget v5, v0, La/ygg;->j:I

    .line 100
    .line 101
    if-eqz v5, :cond_5

    .line 102
    .line 103
    if-ne v5, v6, :cond_4

    .line 104
    .line 105
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_4
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_5
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    new-instance p0, La/ahg;

    .line 119
    .line 120
    const/4 v3, 0x0

    .line 121
    invoke-direct {p0, p1, v1, v3}, La/ahg;-><init>(La/kmq;La/sip;B)V

    .line 122
    .line 123
    .line 124
    iput v6, v0, La/ygg;->j:I

    .line 125
    .line 126
    invoke-virtual {v2, p0, v0}, La/p7m0;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-object v3, p2

    .line 130
    :goto_3
    return-object v3

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
