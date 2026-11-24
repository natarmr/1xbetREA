.class public final La/mdq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dnq;


# direct methods
.method public synthetic constructor <init>(La/dnq;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mdq;->a:B

    iput-object p1, p0, La/mdq;->b:La/dnq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/mdq;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/mdq;->b:La/dnq;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/high16 v4, -0x80000000

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    instance-of v0, p2, La/rwu;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move-object v0, p2

    .line 19
    check-cast v0, La/rwu;

    .line 20
    .line 21
    iget v6, v0, La/rwu;->j:I

    .line 22
    .line 23
    and-int v7, v6, v4

    .line 24
    .line 25
    if-eqz v7, :cond_0

    .line 26
    .line 27
    sub-int/2addr v6, v4

    .line 28
    iput v6, v0, La/rwu;->j:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, La/rwu;

    .line 32
    .line 33
    invoke-direct {v0, p0, p2}, La/rwu;-><init>(La/mdq;La/yje;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p0, v0, La/rwu;->i:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object p2, La/wne;->a:La/wne;

    .line 39
    .line 40
    iget v4, v0, La/rwu;->j:I

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    new-instance p0, La/y6u;

    .line 58
    .line 59
    const/16 v2, 0x18

    .line 60
    .line 61
    invoke-direct {p0, p1, v2}, La/y6u;-><init>(La/kmq;B)V

    .line 62
    .line 63
    .line 64
    iput v5, v0, La/rwu;->j:I

    .line 65
    .line 66
    invoke-virtual {v1, p0, v0}, La/dnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-ne p0, p2, :cond_3

    .line 71
    .line 72
    move-object v2, p2

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    :goto_2
    return-object v2

    .line 77
    :pswitch_0
    instance-of v0, p2, La/kdq;

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    move-object v0, p2

    .line 82
    check-cast v0, La/kdq;

    .line 83
    .line 84
    iget v6, v0, La/kdq;->j:I

    .line 85
    .line 86
    and-int v7, v6, v4

    .line 87
    .line 88
    if-eqz v7, :cond_4

    .line 89
    .line 90
    sub-int/2addr v6, v4

    .line 91
    iput v6, v0, La/kdq;->j:I

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    new-instance v0, La/kdq;

    .line 95
    .line 96
    invoke-direct {v0, p0, p2}, La/kdq;-><init>(La/mdq;La/yje;)V

    .line 97
    .line 98
    .line 99
    :goto_3
    iget-object p0, v0, La/kdq;->i:Ljava/lang/Object;

    .line 100
    .line 101
    sget-object p2, La/wne;->a:La/wne;

    .line 102
    .line 103
    iget v4, v0, La/kdq;->j:I

    .line 104
    .line 105
    if-eqz v4, :cond_6

    .line 106
    .line 107
    if-ne v4, v5, :cond_5

    .line 108
    .line 109
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    new-instance p0, La/uap;

    .line 121
    .line 122
    const/16 v2, 0x8

    .line 123
    .line 124
    invoke-direct {p0, p1, v2}, La/uap;-><init>(La/kmq;B)V

    .line 125
    .line 126
    .line 127
    iput v5, v0, La/kdq;->j:I

    .line 128
    .line 129
    invoke-virtual {v1, p0, v0}, La/dnq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    if-ne p0, p2, :cond_7

    .line 134
    .line 135
    move-object v2, p2

    .line 136
    goto :goto_5

    .line 137
    :cond_7
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    :goto_5
    return-object v2

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
