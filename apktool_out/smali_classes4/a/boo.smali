.class public final La/boo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:La/hoo;


# direct methods
.method public synthetic constructor <init>(La/kmq;La/hoo;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/boo;->a:B

    iput-object p1, p0, La/boo;->b:La/kmq;

    iput-object p2, p0, La/boo;->c:La/hoo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/boo;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/boo;->c:La/hoo;

    .line 4
    .line 5
    iget-object v2, p0, La/boo;->b:La/kmq;

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
    instance-of v0, p2, La/eoo;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, La/eoo;

    .line 22
    .line 23
    iget v7, v0, La/eoo;->j:I

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
    iput v7, v0, La/eoo;->j:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/eoo;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, La/eoo;-><init>(La/boo;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/eoo;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v5, v0, La/eoo;->j:I

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
    check-cast p1, Ljava/util/Map;

    .line 60
    .line 61
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {p0}, La/hoo;->a(Ljava/util/Collection;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    iput v6, v0, La/eoo;->j:I

    .line 77
    .line 78
    invoke-interface {v2, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    if-ne p0, p2, :cond_3

    .line 83
    .line 84
    move-object v3, p2

    .line 85
    goto :goto_2

    .line 86
    :cond_3
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    :goto_2
    return-object v3

    .line 89
    :pswitch_0
    instance-of v0, p2, La/aoo;

    .line 90
    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    move-object v0, p2

    .line 94
    check-cast v0, La/aoo;

    .line 95
    .line 96
    iget v7, v0, La/aoo;->j:I

    .line 97
    .line 98
    and-int v8, v7, v5

    .line 99
    .line 100
    if-eqz v8, :cond_4

    .line 101
    .line 102
    sub-int/2addr v7, v5

    .line 103
    iput v7, v0, La/aoo;->j:I

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    new-instance v0, La/aoo;

    .line 107
    .line 108
    invoke-direct {v0, p0, p2}, La/aoo;-><init>(La/boo;La/yje;)V

    .line 109
    .line 110
    .line 111
    :goto_3
    iget-object p0, v0, La/aoo;->i:Ljava/lang/Object;

    .line 112
    .line 113
    sget-object p2, La/wne;->a:La/wne;

    .line 114
    .line 115
    iget v5, v0, La/aoo;->j:I

    .line 116
    .line 117
    if-eqz v5, :cond_6

    .line 118
    .line 119
    if-ne v5, v6, :cond_5

    .line 120
    .line 121
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    check-cast p1, Ljava/util/HashMap;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-static {p0}, La/hoo;->a(Ljava/util/Collection;)Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    iput v6, v0, La/aoo;->j:I

    .line 153
    .line 154
    invoke-interface {v2, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    if-ne p0, p2, :cond_7

    .line 159
    .line 160
    move-object v3, p2

    .line 161
    goto :goto_5

    .line 162
    :cond_7
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    :goto_5
    return-object v3

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
