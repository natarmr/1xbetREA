.class public final synthetic La/v6e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/j2m0;


# direct methods
.method public synthetic constructor <init>(La/j2m0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/v6e0;->a:B

    iput-object p1, p0, La/v6e0;->b:La/j2m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/v6e0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/v6e0;->b:La/j2m0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, La/tjj0;

    .line 10
    .line 11
    iget-object p0, p0, La/j2m0;->a:La/iab;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, La/iab;->g:Landroid/view/View;

    .line 16
    .line 17
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 18
    .line 19
    invoke-direct {v0}, La/i26;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, La/i26;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, La/dp;

    .line 25
    .line 26
    new-instance v2, La/jbp;

    .line 27
    .line 28
    const/16 v3, 0x1c

    .line 29
    .line 30
    invoke-direct {v2, v3}, La/jbp;-><init>(B)V

    .line 31
    .line 32
    .line 33
    new-instance v3, La/rnp;

    .line 34
    .line 35
    const/16 v4, 0x15

    .line 36
    .line 37
    invoke-direct {v3, v4}, La/rnp;-><init>(B)V

    .line 38
    .line 39
    .line 40
    new-instance v4, La/atq;

    .line 41
    .line 42
    const/4 v5, 0x3

    .line 43
    const/4 v6, 0x2

    .line 44
    invoke-direct {v4, v5, v6}, La/atq;-><init>(IB)V

    .line 45
    .line 46
    .line 47
    sget-object v7, La/gzn;->z:La/gzn;

    .line 48
    .line 49
    new-instance v8, La/gbn;

    .line 50
    .line 51
    invoke-direct {v8, v2, v4, v3, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v8}, La/dp;->b(La/gbn;)V

    .line 55
    .line 56
    .line 57
    new-instance v2, La/ogj0;

    .line 58
    .line 59
    invoke-direct {v2, v5}, La/ogj0;-><init>(B)V

    .line 60
    .line 61
    .line 62
    new-instance v3, La/thj0;

    .line 63
    .line 64
    const/4 v4, 0x4

    .line 65
    invoke-direct {v3, v4}, La/thj0;-><init>(B)V

    .line 66
    .line 67
    .line 68
    new-instance v7, La/gsh0;

    .line 69
    .line 70
    const/16 v8, 0x1a

    .line 71
    .line 72
    invoke-direct {v7, v5, v8}, La/gsh0;-><init>(IB)V

    .line 73
    .line 74
    .line 75
    sget-object v8, La/wjj0;->c:La/wjj0;

    .line 76
    .line 77
    new-instance v9, La/gbn;

    .line 78
    .line 79
    invoke-direct {v9, v2, v7, v3, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v9}, La/dp;->b(La/gbn;)V

    .line 83
    .line 84
    .line 85
    new-instance v2, La/ogj0;

    .line 86
    .line 87
    invoke-direct {v2, v6}, La/ogj0;-><init>(B)V

    .line 88
    .line 89
    .line 90
    new-instance v3, La/thj0;

    .line 91
    .line 92
    invoke-direct {v3, v5}, La/thj0;-><init>(B)V

    .line 93
    .line 94
    .line 95
    new-instance v6, La/gsh0;

    .line 96
    .line 97
    const/16 v7, 0x1b

    .line 98
    .line 99
    invoke-direct {v6, v5, v7}, La/gsh0;-><init>(IB)V

    .line 100
    .line 101
    .line 102
    sget-object v7, La/wjj0;->d:La/wjj0;

    .line 103
    .line 104
    new-instance v8, La/gbn;

    .line 105
    .line 106
    invoke-direct {v8, v2, v6, v3, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1, v8}, La/dp;->b(La/gbn;)V

    .line 110
    .line 111
    .line 112
    new-instance v2, La/goi0;

    .line 113
    .line 114
    invoke-direct {v2, v0, v5}, La/goi0;-><init>(Ljava/lang/Object;B)V

    .line 115
    .line 116
    .line 117
    new-instance v3, La/ogj0;

    .line 118
    .line 119
    invoke-direct {v3, v4}, La/ogj0;-><init>(B)V

    .line 120
    .line 121
    .line 122
    new-instance v4, La/huh0;

    .line 123
    .line 124
    const/16 v6, 0x10

    .line 125
    .line 126
    invoke-direct {v4, v2, p0, v6}, La/huh0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    new-instance p0, La/gsh0;

    .line 130
    .line 131
    const/16 v2, 0x19

    .line 132
    .line 133
    invoke-direct {p0, v5, v2}, La/gsh0;-><init>(IB)V

    .line 134
    .line 135
    .line 136
    sget-object v2, La/wjj0;->b:La/wjj0;

    .line 137
    .line 138
    new-instance v5, La/gbn;

    .line 139
    .line 140
    invoke-direct {v5, v3, p0, v4, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v5}, La/dp;->b(La/gbn;)V

    .line 144
    .line 145
    .line 146
    return-object v0

    .line 147
    :cond_0
    const-string p0, "binding"

    .line 148
    .line 149
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const/4 p0, 0x0

    .line 153
    throw p0

    .line 154
    :pswitch_0
    iget-object v0, p0, La/j2m0;->a:La/iab;

    .line 155
    .line 156
    if-nez v0, :cond_1

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_1
    invoke-virtual {p0}, La/j2m0;->d()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0}, La/j2m0;->f()V

    .line 163
    .line 164
    .line 165
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_1
    invoke-virtual {p0}, La/j2m0;->e()V

    .line 169
    .line 170
    .line 171
    iput-boolean v1, p0, La/j2m0;->n:Z

    .line 172
    .line 173
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_2
    iget-object v0, p0, La/j2m0;->a:La/iab;

    .line 177
    .line 178
    if-nez v0, :cond_2

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_2
    invoke-virtual {p0}, La/j2m0;->d()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, La/j2m0;->f()V

    .line 185
    .line 186
    .line 187
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    return-object p0

    .line 190
    :pswitch_3
    invoke-virtual {p0}, La/j2m0;->e()V

    .line 191
    .line 192
    .line 193
    iput-boolean v1, p0, La/j2m0;->n:Z

    .line 194
    .line 195
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object p0

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
