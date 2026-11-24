.class public final La/l360;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:La/rz50;


# direct methods
.method public synthetic constructor <init>(La/kmq;La/rz50;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/l360;->a:B

    iput-object p1, p0, La/l360;->b:La/kmq;

    iput-object p2, p0, La/l360;->c:La/rz50;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/l360;->a:B

    .line 2
    .line 3
    const/16 v1, 0x7f

    .line 4
    .line 5
    iget-object v2, p0, La/l360;->c:La/rz50;

    .line 6
    .line 7
    iget-object v3, p0, La/l360;->b:La/kmq;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/high16 v5, -0x80000000

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    const/4 v7, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    instance-of v0, p2, La/p360;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move-object v0, p2

    .line 23
    check-cast v0, La/p360;

    .line 24
    .line 25
    iget v8, v0, La/p360;->j:I

    .line 26
    .line 27
    and-int v9, v8, v5

    .line 28
    .line 29
    if-eqz v9, :cond_0

    .line 30
    .line 31
    sub-int/2addr v8, v5

    .line 32
    iput v8, v0, La/p360;->j:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v0, La/p360;

    .line 36
    .line 37
    invoke-direct {v0, p0, p2}, La/p360;-><init>(La/l360;La/yje;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object p0, v0, La/p360;->i:Ljava/lang/Object;

    .line 41
    .line 42
    sget-object p2, La/wne;->a:La/wne;

    .line 43
    .line 44
    iget v5, v0, La/p360;->j:I

    .line 45
    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    if-ne v5, v6, :cond_1

    .line 49
    .line 50
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    check-cast p1, Ljava/util/List;

    .line 62
    .line 63
    new-instance p0, La/kz50;

    .line 64
    .line 65
    invoke-direct {p0, p1}, La/kz50;-><init>(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v2, v7, p0, v1}, La/rz50;->a(La/rz50;La/kz50;La/nz50;I)La/rz50;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    iput v6, v0, La/p360;->j:I

    .line 73
    .line 74
    invoke-interface {v3, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-ne p0, p2, :cond_3

    .line 79
    .line 80
    move-object v7, p2

    .line 81
    goto :goto_2

    .line 82
    :cond_3
    :goto_1
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    :goto_2
    return-object v7

    .line 85
    :pswitch_0
    instance-of v0, p2, La/k360;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    move-object v0, p2

    .line 90
    check-cast v0, La/k360;

    .line 91
    .line 92
    iget v8, v0, La/k360;->j:I

    .line 93
    .line 94
    and-int v9, v8, v5

    .line 95
    .line 96
    if-eqz v9, :cond_4

    .line 97
    .line 98
    sub-int/2addr v8, v5

    .line 99
    iput v8, v0, La/k360;->j:I

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    new-instance v0, La/k360;

    .line 103
    .line 104
    invoke-direct {v0, p0, p2}, La/k360;-><init>(La/l360;La/yje;)V

    .line 105
    .line 106
    .line 107
    :goto_3
    iget-object p0, v0, La/k360;->i:Ljava/lang/Object;

    .line 108
    .line 109
    sget-object p2, La/wne;->a:La/wne;

    .line 110
    .line 111
    iget v5, v0, La/k360;->j:I

    .line 112
    .line 113
    if-eqz v5, :cond_6

    .line 114
    .line 115
    if-ne v5, v6, :cond_5

    .line 116
    .line 117
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    check-cast p1, Ljava/util/List;

    .line 129
    .line 130
    new-instance p0, La/kz50;

    .line 131
    .line 132
    invoke-direct {p0, p1}, La/kz50;-><init>(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v2, v7, p0, v1}, La/rz50;->a(La/rz50;La/kz50;La/nz50;I)La/rz50;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    iput v6, v0, La/k360;->j:I

    .line 140
    .line 141
    invoke-interface {v3, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    if-ne p0, p2, :cond_7

    .line 146
    .line 147
    move-object v7, p2

    .line 148
    goto :goto_5

    .line 149
    :cond_7
    :goto_4
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    :goto_5
    return-object v7

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
