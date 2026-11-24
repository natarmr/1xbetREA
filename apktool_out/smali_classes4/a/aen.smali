.class public final La/aen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vae0;


# direct methods
.method public synthetic constructor <init>(La/vae0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/aen;->a:B

    iput-object p1, p0, La/aen;->b:La/vae0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/aen;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/aen;->b:La/vae0;

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
    instance-of v0, p2, La/s6v;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    move-object v0, p2

    .line 19
    check-cast v0, La/s6v;

    .line 20
    .line 21
    iget v6, v0, La/s6v;->j:I

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
    iput v6, v0, La/s6v;->j:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, La/s6v;

    .line 32
    .line 33
    invoke-direct {v0, p0, p2}, La/s6v;-><init>(La/aen;La/yje;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p0, v0, La/s6v;->i:Ljava/lang/Object;

    .line 37
    .line 38
    sget-object p2, La/wne;->a:La/wne;

    .line 39
    .line 40
    iget v4, v0, La/s6v;->j:I

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
    new-instance p0, La/b4v;

    .line 58
    .line 59
    const/4 v2, 0x4

    .line 60
    invoke-direct {p0, p1, v2}, La/b4v;-><init>(La/kmq;B)V

    .line 61
    .line 62
    .line 63
    iput v5, v0, La/s6v;->j:I

    .line 64
    .line 65
    iget-object p1, v1, La/vae0;->a:La/noj0;

    .line 66
    .line 67
    invoke-interface {p1, p0, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    if-ne p0, p2, :cond_3

    .line 72
    .line 73
    move-object v2, p2

    .line 74
    goto :goto_2

    .line 75
    :cond_3
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    :goto_2
    return-object v2

    .line 78
    :pswitch_0
    instance-of v0, p2, La/ydn;

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    move-object v0, p2

    .line 83
    check-cast v0, La/ydn;

    .line 84
    .line 85
    iget v6, v0, La/ydn;->j:I

    .line 86
    .line 87
    and-int v7, v6, v4

    .line 88
    .line 89
    if-eqz v7, :cond_4

    .line 90
    .line 91
    sub-int/2addr v6, v4

    .line 92
    iput v6, v0, La/ydn;->j:I

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    new-instance v0, La/ydn;

    .line 96
    .line 97
    invoke-direct {v0, p0, p2}, La/ydn;-><init>(La/aen;La/yje;)V

    .line 98
    .line 99
    .line 100
    :goto_3
    iget-object p0, v0, La/ydn;->i:Ljava/lang/Object;

    .line 101
    .line 102
    sget-object p2, La/wne;->a:La/wne;

    .line 103
    .line 104
    iget v4, v0, La/ydn;->j:I

    .line 105
    .line 106
    if-eqz v4, :cond_6

    .line 107
    .line 108
    if-ne v4, v5, :cond_5

    .line 109
    .line 110
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_5
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    new-instance p0, La/k0f;

    .line 122
    .line 123
    const/16 v2, 0x13

    .line 124
    .line 125
    invoke-direct {p0, p1, v2}, La/k0f;-><init>(La/kmq;B)V

    .line 126
    .line 127
    .line 128
    iput v5, v0, La/ydn;->j:I

    .line 129
    .line 130
    iget-object p1, v1, La/vae0;->a:La/noj0;

    .line 131
    .line 132
    invoke-interface {p1, p0, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    if-ne p0, p2, :cond_7

    .line 137
    .line 138
    move-object v2, p2

    .line 139
    goto :goto_5

    .line 140
    :cond_7
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    :goto_5
    return-object v2

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
