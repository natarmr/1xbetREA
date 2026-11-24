.class public final synthetic La/u5h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:I

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/jbm;ZJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput-byte v0, p0, La/u5h;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/u5h;->b:Ljava/lang/Object;

    iput-boolean p2, p0, La/u5h;->d:Z

    iput-wide p3, p0, La/u5h;->c:J

    iput-object p5, p0, La/u5h;->f:Ljava/lang/Object;

    iput-object p6, p0, La/u5h;->g:Ljava/lang/Object;

    iput p7, p0, La/u5h;->e:I

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;JLkotlin/jvm/functions/Function0;La/ugd;II)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/u5h;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/u5h;->b:Ljava/lang/Object;

    iput-wide p2, p0, La/u5h;->c:J

    iput-object p4, p0, La/u5h;->f:Ljava/lang/Object;

    iput-object p5, p0, La/u5h;->g:Ljava/lang/Object;

    iput p6, p0, La/u5h;->e:I

    iput-boolean p7, p0, La/u5h;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;JZLjava/lang/Object;La/wdr;IB)V
    .locals 0

    .line 3
    iput-byte p8, p0, La/u5h;->a:B

    iput-object p1, p0, La/u5h;->b:Ljava/lang/Object;

    iput-wide p2, p0, La/u5h;->c:J

    iput-boolean p4, p0, La/u5h;->d:Z

    iput-object p5, p0, La/u5h;->f:Ljava/lang/Object;

    iput-object p6, p0, La/u5h;->g:Ljava/lang/Object;

    iput p7, p0, La/u5h;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;La/r2m;Ljava/lang/String;ZJI)V
    .locals 1

    .line 4
    const/4 v0, 0x3

    iput-byte v0, p0, La/u5h;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/u5h;->b:Ljava/lang/Object;

    iput-object p2, p0, La/u5h;->f:Ljava/lang/Object;

    iput-object p3, p0, La/u5h;->g:Ljava/lang/Object;

    iput-boolean p4, p0, La/u5h;->d:Z

    iput-wide p5, p0, La/u5h;->c:J

    iput p7, p0, La/u5h;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/u5h;->a:B

    .line 2
    .line 3
    iget v1, p0, La/u5h;->e:I

    .line 4
    .line 5
    iget-object v2, p0, La/u5h;->g:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/u5h;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/u5h;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v5, v4

    .line 15
    check-cast v5, La/mm40;

    .line 16
    .line 17
    move-object v9, v3

    .line 18
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 19
    .line 20
    move-object v10, v2

    .line 21
    check-cast v10, La/xdr;

    .line 22
    .line 23
    move-object v11, p1

    .line 24
    check-cast v11, La/fet;

    .line 25
    .line 26
    check-cast p2, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    or-int/lit8 p1, v1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, La/x8x;->L(I)I

    .line 34
    .line 35
    .line 36
    move-result v12

    .line 37
    iget-wide v6, p0, La/u5h;->c:J

    .line 38
    .line 39
    iget-boolean v8, p0, La/u5h;->d:Z

    .line 40
    .line 41
    invoke-static/range {v5 .. v12}, La/zvw;->p(La/mm40;JZLkotlin/jvm/functions/Function0;La/xdr;La/fet;I)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object p0

    .line 47
    :pswitch_0
    move-object v0, v4

    .line 48
    check-cast v0, La/jbm;

    .line 49
    .line 50
    move-object v4, v3

    .line 51
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 52
    .line 53
    move-object v5, v2

    .line 54
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 55
    .line 56
    move-object v6, p1

    .line 57
    check-cast v6, La/fet;

    .line 58
    .line 59
    check-cast p2, Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    or-int/lit8 p1, v1, 0x1

    .line 65
    .line 66
    invoke-static {p1}, La/x8x;->L(I)I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    iget-boolean v1, p0, La/u5h;->d:Z

    .line 71
    .line 72
    iget-wide v2, p0, La/u5h;->c:J

    .line 73
    .line 74
    invoke-static/range {v0 .. v7}, La/obc;->p(La/jbm;ZJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 75
    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    :pswitch_1
    move-object v0, v4

    .line 81
    check-cast v0, La/mm40;

    .line 82
    .line 83
    check-cast v3, La/r2m;

    .line 84
    .line 85
    check-cast v2, Ljava/lang/String;

    .line 86
    .line 87
    move-object v6, p1

    .line 88
    check-cast v6, La/fet;

    .line 89
    .line 90
    check-cast p2, Ljava/lang/Integer;

    .line 91
    .line 92
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    or-int/lit8 p1, v1, 0x1

    .line 96
    .line 97
    invoke-static {p1}, La/x8x;->L(I)I

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    move-object v1, v3

    .line 102
    iget-boolean v3, p0, La/u5h;->d:Z

    .line 103
    .line 104
    iget-wide v4, p0, La/u5h;->c:J

    .line 105
    .line 106
    invoke-static/range {v0 .. v7}, La/kbc;->E(La/mm40;La/r2m;Ljava/lang/String;ZJLa/fet;I)V

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_2
    move-object v0, v4

    .line 113
    check-cast v0, La/mm40;

    .line 114
    .line 115
    move-object v4, v3

    .line 116
    check-cast v4, La/uzl;

    .line 117
    .line 118
    move-object v5, v2

    .line 119
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 120
    .line 121
    move-object v6, p1

    .line 122
    check-cast v6, La/fet;

    .line 123
    .line 124
    check-cast p2, Ljava/lang/Integer;

    .line 125
    .line 126
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    or-int/lit8 p1, v1, 0x1

    .line 130
    .line 131
    invoke-static {p1}, La/x8x;->L(I)I

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    iget-wide v1, p0, La/u5h;->c:J

    .line 136
    .line 137
    iget-boolean v3, p0, La/u5h;->d:Z

    .line 138
    .line 139
    invoke-static/range {v0 .. v7}, La/qbc;->q(La/mm40;JZLa/uzl;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 140
    .line 141
    .line 142
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object p0

    .line 145
    :pswitch_3
    move-object v0, v4

    .line 146
    check-cast v0, La/mm40;

    .line 147
    .line 148
    move-object v4, v3

    .line 149
    check-cast v4, La/zqh;

    .line 150
    .line 151
    move-object v5, v2

    .line 152
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 153
    .line 154
    move-object v6, p1

    .line 155
    check-cast v6, La/fet;

    .line 156
    .line 157
    check-cast p2, Ljava/lang/Integer;

    .line 158
    .line 159
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    or-int/lit8 p1, v1, 0x1

    .line 163
    .line 164
    invoke-static {p1}, La/x8x;->L(I)I

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    iget-wide v1, p0, La/u5h;->c:J

    .line 169
    .line 170
    iget-boolean v3, p0, La/u5h;->d:Z

    .line 171
    .line 172
    invoke-static/range {v0 .. v7}, La/bfb;->j(La/mm40;JZLa/zqh;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 173
    .line 174
    .line 175
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    return-object p0

    .line 178
    :pswitch_4
    move-object v0, v4

    .line 179
    check-cast v0, La/mm40;

    .line 180
    .line 181
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 182
    .line 183
    move-object v4, v2

    .line 184
    check-cast v4, La/ugd;

    .line 185
    .line 186
    move-object v5, p1

    .line 187
    check-cast v5, La/fet;

    .line 188
    .line 189
    check-cast p2, Ljava/lang/Integer;

    .line 190
    .line 191
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    or-int/lit8 p1, v1, 0x1

    .line 195
    .line 196
    invoke-static {p1}, La/x8x;->L(I)I

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    iget-wide v1, p0, La/u5h;->c:J

    .line 201
    .line 202
    iget-boolean v7, p0, La/u5h;->d:Z

    .line 203
    .line 204
    invoke-static/range {v0 .. v7}, La/uzb;->d(La/mm40;JLkotlin/jvm/functions/Function0;La/ugd;La/fet;II)V

    .line 205
    .line 206
    .line 207
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    return-object p0

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
