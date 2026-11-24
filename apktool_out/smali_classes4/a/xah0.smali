.class public final synthetic La/xah0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a4x;

.field public final synthetic c:Z

.field public final synthetic d:La/xcz;

.field public final synthetic e:La/qdz;

.field public final synthetic f:La/m5m;

.field public final synthetic g:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/a4x;ZLa/xcz;La/qdz;La/m5m;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/xah0;->a:B

    iput-object p1, p0, La/xah0;->b:La/a4x;

    iput-boolean p2, p0, La/xah0;->c:Z

    iput-object p3, p0, La/xah0;->d:La/xcz;

    iput-object p4, p0, La/xah0;->e:La/qdz;

    iput-object p5, p0, La/xah0;->f:La/m5m;

    iput-object p6, p0, La/xah0;->g:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/xah0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object v4, p0, La/xah0;->f:La/m5m;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object v5, p1

    .line 12
    check-cast v5, La/hcz;

    .line 13
    .line 14
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    iget-object p1, v4, La/m5m;->a:La/h6m;

    .line 20
    .line 21
    iget-object v2, p1, La/h6m;->i:La/b6m;

    .line 22
    .line 23
    :cond_0
    if-eqz v2, :cond_1

    .line 24
    .line 25
    move v8, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v8, v1

    .line 28
    :goto_0
    iget-object v7, p0, La/xah0;->b:La/a4x;

    .line 29
    .line 30
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    new-instance v6, La/zah0;

    .line 35
    .line 36
    const/4 v13, 0x2

    .line 37
    iget-object v9, p0, La/xah0;->g:Lkotlin/jvm/functions/Function1;

    .line 38
    .line 39
    iget-object v10, p0, La/xah0;->e:La/qdz;

    .line 40
    .line 41
    iget-boolean v11, p0, La/xah0;->c:Z

    .line 42
    .line 43
    iget-object v12, p0, La/xah0;->d:La/xcz;

    .line 44
    .line 45
    invoke-direct/range {v6 .. v13}, La/zah0;-><init>(La/a4x;ZLkotlin/jvm/functions/Function1;La/qdz;ZLa/xcz;B)V

    .line 46
    .line 47
    .line 48
    new-instance v9, La/ugd;

    .line 49
    .line 50
    const p0, 0x164b227d

    .line 51
    .line 52
    .line 53
    invoke-direct {v9, p0, v3, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    const/4 v10, 0x6

    .line 57
    const/4 v7, 0x0

    .line 58
    const/4 v8, 0x0

    .line 59
    move v6, p1

    .line 60
    invoke-static/range {v5 .. v10}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_0
    move-object v0, p1

    .line 67
    check-cast v0, La/hcz;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    if-eqz v4, :cond_2

    .line 73
    .line 74
    iget-object p1, v4, La/m5m;->a:La/h6m;

    .line 75
    .line 76
    iget-object v2, p1, La/h6m;->i:La/b6m;

    .line 77
    .line 78
    :cond_2
    if-eqz v2, :cond_3

    .line 79
    .line 80
    move v6, v3

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    move v6, v1

    .line 83
    :goto_1
    iget-object v5, p0, La/xah0;->b:La/a4x;

    .line 84
    .line 85
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    new-instance v4, La/zah0;

    .line 90
    .line 91
    const/4 v11, 0x1

    .line 92
    iget-object v7, p0, La/xah0;->g:Lkotlin/jvm/functions/Function1;

    .line 93
    .line 94
    iget-object v8, p0, La/xah0;->e:La/qdz;

    .line 95
    .line 96
    iget-boolean v9, p0, La/xah0;->c:Z

    .line 97
    .line 98
    iget-object v10, p0, La/xah0;->d:La/xcz;

    .line 99
    .line 100
    invoke-direct/range {v4 .. v11}, La/zah0;-><init>(La/a4x;ZLkotlin/jvm/functions/Function1;La/qdz;ZLa/xcz;B)V

    .line 101
    .line 102
    .line 103
    new-instance p0, La/ugd;

    .line 104
    .line 105
    const p1, -0x645c0de5

    .line 106
    .line 107
    .line 108
    invoke-direct {p0, p1, v3, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    const/4 v5, 0x6

    .line 112
    const/4 v2, 0x0

    .line 113
    const/4 v3, 0x0

    .line 114
    move-object v4, p0

    .line 115
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 116
    .line 117
    .line 118
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object p0

    .line 121
    :pswitch_1
    move-object v0, p1

    .line 122
    check-cast v0, La/hcz;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    if-eqz v4, :cond_4

    .line 128
    .line 129
    iget-object p1, v4, La/m5m;->a:La/h6m;

    .line 130
    .line 131
    iget-object v2, p1, La/h6m;->i:La/b6m;

    .line 132
    .line 133
    :cond_4
    if-eqz v2, :cond_5

    .line 134
    .line 135
    move v6, v3

    .line 136
    goto :goto_2

    .line 137
    :cond_5
    move v6, v1

    .line 138
    :goto_2
    iget-object v5, p0, La/xah0;->b:La/a4x;

    .line 139
    .line 140
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    new-instance v4, La/zah0;

    .line 145
    .line 146
    const/4 v11, 0x0

    .line 147
    iget-object v7, p0, La/xah0;->g:Lkotlin/jvm/functions/Function1;

    .line 148
    .line 149
    iget-object v8, p0, La/xah0;->e:La/qdz;

    .line 150
    .line 151
    iget-boolean v9, p0, La/xah0;->c:Z

    .line 152
    .line 153
    iget-object v10, p0, La/xah0;->d:La/xcz;

    .line 154
    .line 155
    invoke-direct/range {v4 .. v11}, La/zah0;-><init>(La/a4x;ZLkotlin/jvm/functions/Function1;La/qdz;ZLa/xcz;B)V

    .line 156
    .line 157
    .line 158
    new-instance p0, La/ugd;

    .line 159
    .line 160
    const p1, 0x776cdb4f

    .line 161
    .line 162
    .line 163
    invoke-direct {p0, p1, v3, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    const/4 v5, 0x6

    .line 167
    const/4 v2, 0x0

    .line 168
    const/4 v3, 0x0

    .line 169
    move-object v4, p0

    .line 170
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 171
    .line 172
    .line 173
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object p0

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
