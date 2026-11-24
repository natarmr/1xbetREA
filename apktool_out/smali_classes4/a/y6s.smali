.class public final synthetic La/y6s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mie0;Ljava/lang/Object;La/z63;La/t73;La/l73;FLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/y6s;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/y6s;->d:Ljava/lang/Object;

    iput-object p2, p0, La/y6s;->e:Ljava/lang/Object;

    iput-object p3, p0, La/y6s;->f:Ljava/lang/Object;

    iput-object p4, p0, La/y6s;->g:Ljava/lang/Object;

    iput-object p5, p0, La/y6s;->h:Ljava/lang/Object;

    iput p6, p0, La/y6s;->b:F

    iput-object p7, p0, La/y6s;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLa/l7m0;La/l7m0;La/xak;La/nek;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/y6s;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/y6s;->c:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/y6s;->d:Ljava/lang/Object;

    iput p3, p0, La/y6s;->b:F

    iput-object p4, p0, La/y6s;->e:Ljava/lang/Object;

    iput-object p5, p0, La/y6s;->f:Ljava/lang/Object;

    iput-object p6, p0, La/y6s;->g:Ljava/lang/Object;

    iput-object p7, p0, La/y6s;->h:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/y6s;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/y6s;->h:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/y6s;->g:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/y6s;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/y6s;->d:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v5, La/mie0;

    .line 18
    .line 19
    move-object v11, v4

    .line 20
    check-cast v11, La/z63;

    .line 21
    .line 22
    move-object v15, v3

    .line 23
    check-cast v15, La/t73;

    .line 24
    .line 25
    check-cast v2, La/l73;

    .line 26
    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    check-cast v1, Ljava/lang/Long;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide v16

    .line 35
    new-instance v7, La/i73;

    .line 36
    .line 37
    invoke-interface {v11}, La/z63;->e()La/lxs0;

    .line 38
    .line 39
    .line 40
    move-result-object v14

    .line 41
    invoke-interface {v11}, La/z63;->g()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v18

    .line 45
    new-instance v1, La/xmn0;

    .line 46
    .line 47
    invoke-direct {v1, v2, v6}, La/xmn0;-><init>(La/l73;B)V

    .line 48
    .line 49
    .line 50
    iget-object v13, v0, La/y6s;->e:Ljava/lang/Object;

    .line 51
    .line 52
    move-wide/from16 v19, v16

    .line 53
    .line 54
    move-object/from16 v21, v1

    .line 55
    .line 56
    move-object v12, v7

    .line 57
    invoke-direct/range {v12 .. v21}, La/i73;-><init>(Ljava/lang/Object;La/lxs0;La/t73;JLjava/lang/Object;JLkotlin/jvm/functions/Function0;)V

    .line 58
    .line 59
    .line 60
    iget v10, v0, La/y6s;->b:F

    .line 61
    .line 62
    iget-object v13, v0, La/y6s;->c:Lkotlin/jvm/functions/Function1;

    .line 63
    .line 64
    move-object v12, v2

    .line 65
    move-wide/from16 v8, v16

    .line 66
    .line 67
    invoke-static/range {v7 .. v13}, La/hhm0;->t(La/i73;JFLa/z63;La/l73;Lkotlin/jvm/functions/Function1;)V

    .line 68
    .line 69
    .line 70
    iput-object v7, v5, La/mie0;->a:Ljava/lang/Object;

    .line 71
    .line 72
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_0
    move-object v9, v5

    .line 76
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 77
    .line 78
    iget-object v1, v0, La/y6s;->e:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, La/l7m0;

    .line 81
    .line 82
    check-cast v4, La/l7m0;

    .line 83
    .line 84
    move-object v10, v3

    .line 85
    check-cast v10, La/xak;

    .line 86
    .line 87
    move-object v11, v2

    .line 88
    check-cast v11, La/nek;

    .line 89
    .line 90
    move-object/from16 v2, p1

    .line 91
    .line 92
    check-cast v2, La/hcz;

    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    sget-object v3, La/sre0;->a:La/tre0;

    .line 98
    .line 99
    const-class v5, La/asr;

    .line 100
    .line 101
    invoke-virtual {v3, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-interface {v7}, La/sgy;->J()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    invoke-virtual {v3, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    new-instance v5, La/tp7;

    .line 114
    .line 115
    iget-object v8, v0, La/y6s;->c:Lkotlin/jvm/functions/Function1;

    .line 116
    .line 117
    iget v12, v0, La/y6s;->b:F

    .line 118
    .line 119
    invoke-direct {v5, v8, v9, v12, v1}, La/tp7;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FLa/l7m0;)V

    .line 120
    .line 121
    .line 122
    new-instance v0, La/ugd;

    .line 123
    .line 124
    const v1, -0x5e67fdf2

    .line 125
    .line 126
    .line 127
    invoke-direct {v0, v1, v6, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v7, v3, v0}, La/hcz;->d(Ljava/lang/Object;Ljava/lang/Object;La/xdr;)V

    .line 131
    .line 132
    .line 133
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    move-object v8, v0

    .line 138
    check-cast v8, La/a4x;

    .line 139
    .line 140
    new-instance v0, La/t4s;

    .line 141
    .line 142
    invoke-direct {v0, v6}, La/t4s;-><init>(B)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    new-instance v3, La/d2p;

    .line 150
    .line 151
    const/16 v4, 0xd

    .line 152
    .line 153
    invoke-direct {v3, v0, v8, v4}, La/d2p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 154
    .line 155
    .line 156
    new-instance v0, La/ubn;

    .line 157
    .line 158
    const/4 v4, 0x4

    .line 159
    invoke-direct {v0, v8, v4}, La/ubn;-><init>(La/a4x;B)V

    .line 160
    .line 161
    .line 162
    new-instance v7, La/d7s;

    .line 163
    .line 164
    invoke-direct/range {v7 .. v12}, La/d7s;-><init>(La/a4x;Lkotlin/jvm/functions/Function1;La/xak;La/nek;F)V

    .line 165
    .line 166
    .line 167
    new-instance v4, La/ugd;

    .line 168
    .line 169
    const v5, 0x799532c4

    .line 170
    .line 171
    .line 172
    invoke-direct {v4, v5, v6, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v1, v3, v0, v4}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 176
    .line 177
    .line 178
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 179
    .line 180
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
