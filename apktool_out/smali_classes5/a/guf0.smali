.class public final synthetic La/guf0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/iuf0;


# direct methods
.method public synthetic constructor <init>(La/iuf0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/guf0;->a:B

    iput-object p1, p0, La/guf0;->b:La/iuf0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/guf0;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/guf0;->b:La/iuf0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v1, La/iuf0;->R1:[La/iiy;

    .line 11
    .line 12
    new-instance v1, La/ttf0;

    .line 13
    .line 14
    new-instance v2, La/aif0;

    .line 15
    .line 16
    invoke-virtual {v0}, La/iuf0;->H0()La/wuf0;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    const/4 v8, 0x0

    .line 21
    const/16 v9, 0xa

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    const-class v5, La/wuf0;

    .line 25
    .line 26
    const-string v6, "onLinkClicked"

    .line 27
    .line 28
    const-string v7, "onLinkClicked$impl(Ljava/lang/String;)V"

    .line 29
    .line 30
    invoke-direct/range {v2 .. v9}, La/aif0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 31
    .line 32
    .line 33
    new-instance v10, La/due0;

    .line 34
    .line 35
    invoke-virtual {v0}, La/iuf0;->H0()La/wuf0;

    .line 36
    .line 37
    .line 38
    move-result-object v12

    .line 39
    const/16 v16, 0x0

    .line 40
    .line 41
    const/16 v17, 0x8

    .line 42
    .line 43
    const/4 v11, 0x2

    .line 44
    const-string v14, "onListItemClicked"

    .line 45
    .line 46
    const-string v15, "onListItemClicked$impl(Lorg/xplatform/responsible_game/impl/presentation/responsible_game/models/ResponsibleUiEnum;Ljava/io/File;)V"

    .line 47
    .line 48
    move-object v13, v5

    .line 49
    invoke-direct/range {v10 .. v17}, La/due0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 50
    .line 51
    .line 52
    sget-object v0, La/ttf0;->f:La/pn20;

    .line 53
    .line 54
    invoke-direct {v1, v0}, La/zz3;-><init>(La/dtb;)V

    .line 55
    .line 56
    .line 57
    new-instance v0, La/vtf0;

    .line 58
    .line 59
    const/4 v3, 0x0

    .line 60
    invoke-direct {v0, v3}, La/vtf0;-><init>(B)V

    .line 61
    .line 62
    .line 63
    new-instance v4, La/wtf0;

    .line 64
    .line 65
    invoke-direct {v4, v3}, La/wtf0;-><init>(B)V

    .line 66
    .line 67
    .line 68
    new-instance v3, La/o5c0;

    .line 69
    .line 70
    const/16 v5, 0x14

    .line 71
    .line 72
    const/4 v6, 0x3

    .line 73
    invoke-direct {v3, v6, v5}, La/o5c0;-><init>(IB)V

    .line 74
    .line 75
    .line 76
    sget-object v5, La/x4c0;->w:La/x4c0;

    .line 77
    .line 78
    new-instance v7, La/gbn;

    .line 79
    .line 80
    invoke-direct {v7, v0, v3, v4, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 81
    .line 82
    .line 83
    iget-object v0, v1, La/zz3;->d:La/dp;

    .line 84
    .line 85
    invoke-virtual {v0, v7}, La/dp;->b(La/gbn;)V

    .line 86
    .line 87
    .line 88
    new-instance v3, La/k8e0;

    .line 89
    .line 90
    const/16 v4, 0x1c

    .line 91
    .line 92
    invoke-direct {v3, v4}, La/k8e0;-><init>(B)V

    .line 93
    .line 94
    .line 95
    new-instance v4, La/eme0;

    .line 96
    .line 97
    const/16 v5, 0xf

    .line 98
    .line 99
    invoke-direct {v4, v2, v5}, La/eme0;-><init>(Ljava/lang/Object;B)V

    .line 100
    .line 101
    .line 102
    new-instance v2, La/o5c0;

    .line 103
    .line 104
    const/16 v5, 0x12

    .line 105
    .line 106
    invoke-direct {v2, v6, v5}, La/o5c0;-><init>(IB)V

    .line 107
    .line 108
    .line 109
    sget-object v5, La/x4c0;->u:La/x4c0;

    .line 110
    .line 111
    new-instance v7, La/gbn;

    .line 112
    .line 113
    invoke-direct {v7, v3, v2, v4, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v7}, La/dp;->b(La/gbn;)V

    .line 117
    .line 118
    .line 119
    new-instance v2, La/k8e0;

    .line 120
    .line 121
    const/16 v3, 0x1b

    .line 122
    .line 123
    invoke-direct {v2, v3}, La/k8e0;-><init>(B)V

    .line 124
    .line 125
    .line 126
    new-instance v3, La/eme0;

    .line 127
    .line 128
    const/16 v4, 0xe

    .line 129
    .line 130
    invoke-direct {v3, v10, v4}, La/eme0;-><init>(Ljava/lang/Object;B)V

    .line 131
    .line 132
    .line 133
    new-instance v4, La/o5c0;

    .line 134
    .line 135
    const/16 v5, 0x11

    .line 136
    .line 137
    invoke-direct {v4, v6, v5}, La/o5c0;-><init>(IB)V

    .line 138
    .line 139
    .line 140
    sget-object v5, La/x4c0;->t:La/x4c0;

    .line 141
    .line 142
    new-instance v7, La/gbn;

    .line 143
    .line 144
    invoke-direct {v7, v2, v4, v3, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v7}, La/dp;->b(La/gbn;)V

    .line 148
    .line 149
    .line 150
    new-instance v2, La/k8e0;

    .line 151
    .line 152
    const/16 v3, 0x1d

    .line 153
    .line 154
    invoke-direct {v2, v3}, La/k8e0;-><init>(B)V

    .line 155
    .line 156
    .line 157
    new-instance v4, La/bue0;

    .line 158
    .line 159
    invoke-direct {v4, v3}, La/bue0;-><init>(B)V

    .line 160
    .line 161
    .line 162
    new-instance v3, La/o5c0;

    .line 163
    .line 164
    const/16 v5, 0x13

    .line 165
    .line 166
    invoke-direct {v3, v6, v5}, La/o5c0;-><init>(IB)V

    .line 167
    .line 168
    .line 169
    sget-object v5, La/x4c0;->v:La/x4c0;

    .line 170
    .line 171
    new-instance v6, La/gbn;

    .line 172
    .line 173
    invoke-direct {v6, v2, v3, v4, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v6}, La/dp;->b(La/gbn;)V

    .line 177
    .line 178
    .line 179
    return-object v1

    .line 180
    :pswitch_0
    sget-object v1, La/iuf0;->R1:[La/iiy;

    .line 181
    .line 182
    new-instance v1, La/ry3;

    .line 183
    .line 184
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    iget-object v0, v0, La/iuf0;->L1:La/yri;

    .line 189
    .line 190
    if-eqz v0, :cond_0

    .line 191
    .line 192
    invoke-direct {v1, v2, v0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 193
    .line 194
    .line 195
    return-object v1

    .line 196
    :cond_0
    const-string v0, "viewModelFactory"

    .line 197
    .line 198
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    const/4 v0, 0x0

    .line 202
    throw v0

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
