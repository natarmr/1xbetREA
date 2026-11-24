.class public final La/as;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:La/lzt;

.field public final c:La/pbt;


# direct methods
.method public constructor <init>(La/lzt;La/pbt;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/as;->a:B

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch p3, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/as;->b:La/lzt;

    .line 13
    .line 14
    iput-object p2, p0, La/as;->c:La/pbt;

    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La/as;->b:La/lzt;

    .line 21
    .line 22
    iput-object p2, p0, La/as;->c:La/pbt;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(JLa/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/as;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/as;->c:La/pbt;

    .line 4
    .line 5
    iget-object v2, p0, La/as;->b:La/lzt;

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
    instance-of v0, p3, La/ohf0;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p3

    .line 21
    check-cast v0, La/ohf0;

    .line 22
    .line 23
    iget v7, v0, La/ohf0;->k:I

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
    iput v7, v0, La/ohf0;->k:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/ohf0;

    .line 34
    .line 35
    invoke-direct {v0, p0, p3}, La/ohf0;-><init>(La/as;La/zje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/ohf0;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p3, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v5, v0, La/ohf0;->k:I

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
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2}, La/lzt;->a()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-nez p0, :cond_3

    .line 64
    .line 65
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_3
    iput v6, v0, La/ohf0;->k:I

    .line 69
    .line 70
    invoke-virtual {v1, p1, p2, v0}, La/pbt;->u(JLa/zje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, p3, :cond_4

    .line 75
    .line 76
    move-object v3, p3

    .line 77
    goto :goto_2

    .line 78
    :cond_4
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    :goto_2
    return-object v3

    .line 81
    :pswitch_0
    instance-of v0, p3, La/zr;

    .line 82
    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    move-object v0, p3

    .line 86
    check-cast v0, La/zr;

    .line 87
    .line 88
    iget v7, v0, La/zr;->k:I

    .line 89
    .line 90
    and-int v8, v7, v5

    .line 91
    .line 92
    if-eqz v8, :cond_5

    .line 93
    .line 94
    sub-int/2addr v7, v5

    .line 95
    iput v7, v0, La/zr;->k:I

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    new-instance v0, La/zr;

    .line 99
    .line 100
    invoke-direct {v0, p0, p3}, La/zr;-><init>(La/as;La/zje;)V

    .line 101
    .line 102
    .line 103
    :goto_3
    iget-object p0, v0, La/zr;->i:Ljava/lang/Object;

    .line 104
    .line 105
    sget-object p3, La/wne;->a:La/wne;

    .line 106
    .line 107
    iget v5, v0, La/zr;->k:I

    .line 108
    .line 109
    if-eqz v5, :cond_7

    .line 110
    .line 111
    if-ne v5, v6, :cond_6

    .line 112
    .line 113
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_6
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    goto :goto_5

    .line 121
    :cond_7
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, La/lzt;->a()Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-nez p0, :cond_8

    .line 129
    .line 130
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    goto :goto_5

    .line 133
    :cond_8
    iput v6, v0, La/zr;->k:I

    .line 134
    .line 135
    invoke-virtual {v1, p1, p2, v0}, La/pbt;->a(JLa/zje;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    if-ne p0, p3, :cond_9

    .line 140
    .line 141
    move-object v3, p3

    .line 142
    goto :goto_5

    .line 143
    :cond_9
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    :goto_5
    return-object v3

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
