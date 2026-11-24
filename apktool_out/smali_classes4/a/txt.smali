.class public final La/txt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gmq;

.field public final synthetic c:La/mci;

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/gmq;Ljava/lang/Object;La/mci;ZB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/txt;->a:B

    iput-object p1, p0, La/txt;->b:La/gmq;

    iput-object p2, p0, La/txt;->e:Ljava/lang/Object;

    iput-object p3, p0, La/txt;->c:La/mci;

    iput-boolean p4, p0, La/txt;->d:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/txt;->a:B

    .line 6
    .line 7
    iget-object v3, v0, La/txt;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/txt;->b:La/gmq;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    const/high16 v7, -0x80000000

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    packed-switch v2, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    instance-of v2, v1, La/uxt;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    move-object v2, v1

    .line 25
    check-cast v2, La/uxt;

    .line 26
    .line 27
    iget v9, v2, La/uxt;->j:I

    .line 28
    .line 29
    and-int v10, v9, v7

    .line 30
    .line 31
    if-eqz v10, :cond_0

    .line 32
    .line 33
    sub-int/2addr v9, v7

    .line 34
    iput v9, v2, La/uxt;->j:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v2, La/uxt;

    .line 38
    .line 39
    invoke-direct {v2, v0, v1}, La/uxt;-><init>(La/txt;La/yje;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v1, v2, La/uxt;->i:Ljava/lang/Object;

    .line 43
    .line 44
    sget-object v7, La/wne;->a:La/wne;

    .line 45
    .line 46
    iget v9, v2, La/uxt;->j:I

    .line 47
    .line 48
    if-eqz v9, :cond_2

    .line 49
    .line 50
    if-ne v9, v8, :cond_1

    .line 51
    .line 52
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    new-instance v10, La/sxt;

    .line 64
    .line 65
    move-object v12, v3

    .line 66
    check-cast v12, Ljava/util/List;

    .line 67
    .line 68
    iget-boolean v14, v0, La/txt;->d:Z

    .line 69
    .line 70
    const/4 v15, 0x1

    .line 71
    iget-object v13, v0, La/txt;->c:La/mci;

    .line 72
    .line 73
    move-object/from16 v11, p1

    .line 74
    .line 75
    invoke-direct/range {v10 .. v15}, La/sxt;-><init>(La/kmq;Ljava/lang/Object;La/mci;ZB)V

    .line 76
    .line 77
    .line 78
    iput v8, v2, La/uxt;->j:I

    .line 79
    .line 80
    invoke-interface {v4, v10, v2}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    if-ne v0, v7, :cond_3

    .line 85
    .line 86
    move-object v5, v7

    .line 87
    goto :goto_2

    .line 88
    :cond_3
    :goto_1
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    :goto_2
    return-object v5

    .line 91
    :pswitch_0
    instance-of v2, v1, La/qxt;

    .line 92
    .line 93
    if-eqz v2, :cond_4

    .line 94
    .line 95
    move-object v2, v1

    .line 96
    check-cast v2, La/qxt;

    .line 97
    .line 98
    iget v9, v2, La/qxt;->j:I

    .line 99
    .line 100
    and-int v10, v9, v7

    .line 101
    .line 102
    if-eqz v10, :cond_4

    .line 103
    .line 104
    sub-int/2addr v9, v7

    .line 105
    iput v9, v2, La/qxt;->j:I

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_4
    new-instance v2, La/qxt;

    .line 109
    .line 110
    invoke-direct {v2, v0, v1}, La/qxt;-><init>(La/txt;La/yje;)V

    .line 111
    .line 112
    .line 113
    :goto_3
    iget-object v1, v2, La/qxt;->i:Ljava/lang/Object;

    .line 114
    .line 115
    sget-object v7, La/wne;->a:La/wne;

    .line 116
    .line 117
    iget v9, v2, La/qxt;->j:I

    .line 118
    .line 119
    if-eqz v9, :cond_6

    .line 120
    .line 121
    if-ne v9, v8, :cond_5

    .line 122
    .line 123
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_5
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_6
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    new-instance v9, La/sxt;

    .line 135
    .line 136
    move-object v11, v3

    .line 137
    check-cast v11, La/knb;

    .line 138
    .line 139
    iget-boolean v13, v0, La/txt;->d:Z

    .line 140
    .line 141
    const/4 v14, 0x0

    .line 142
    iget-object v12, v0, La/txt;->c:La/mci;

    .line 143
    .line 144
    move-object/from16 v10, p1

    .line 145
    .line 146
    invoke-direct/range {v9 .. v14}, La/sxt;-><init>(La/kmq;Ljava/lang/Object;La/mci;ZB)V

    .line 147
    .line 148
    .line 149
    iput v8, v2, La/qxt;->j:I

    .line 150
    .line 151
    invoke-interface {v4, v9, v2}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    if-ne v0, v7, :cond_7

    .line 156
    .line 157
    move-object v5, v7

    .line 158
    goto :goto_5

    .line 159
    :cond_7
    :goto_4
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    :goto_5
    return-object v5

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
