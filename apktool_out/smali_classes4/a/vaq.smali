.class public final synthetic La/vaq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ebq;


# direct methods
.method public synthetic constructor <init>(La/ebq;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vaq;->a:B

    iput-object p1, p0, La/vaq;->b:La/ebq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vaq;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/vaq;->b:La/ebq;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, Ljava/lang/Throwable;

    .line 13
    .line 14
    move-object/from16 v2, p2

    .line 15
    .line 16
    check-cast v2, Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    instance-of v3, v1, La/zhi0;

    .line 25
    .line 26
    if-eqz v3, :cond_4

    .line 27
    .line 28
    check-cast v1, La/zhi0;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object v4, v0, La/ebq;->z:La/ctf0;

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    new-array v5, v5, [Ljava/lang/Object;

    .line 38
    .line 39
    const v6, 0x7f1307d0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v6, v5}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-static {v3, v4}, La/sj3;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    iget-object v1, v1, La/zhi0;->c:La/kuw;

    .line 51
    .line 52
    sget-object v4, La/i2o;->n2:La/i2o;

    .line 53
    .line 54
    if-ne v1, v4, :cond_0

    .line 55
    .line 56
    new-instance v1, La/gaq;

    .line 57
    .line 58
    invoke-direct {v1, v3}, La/gaq;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_0
    sget-object v4, La/i2o;->q:La/i2o;

    .line 66
    .line 67
    if-ne v1, v4, :cond_1

    .line 68
    .line 69
    new-instance v1, La/iaq;

    .line 70
    .line 71
    invoke-direct {v1, v3}, La/iaq;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_1
    sget-object v4, La/i2o;->z:La/i2o;

    .line 79
    .line 80
    if-eq v1, v4, :cond_3

    .line 81
    .line 82
    sget-object v4, La/i2o;->y:La/i2o;

    .line 83
    .line 84
    if-ne v1, v4, :cond_2

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_2
    new-instance v1, La/maq;

    .line 88
    .line 89
    invoke-direct {v1, v2}, La/maq;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_3
    :goto_0
    new-instance v1, La/maq;

    .line 97
    .line 98
    invoke-direct {v1, v3}, La/maq;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    new-instance v1, La/maq;

    .line 106
    .line 107
    invoke-direct {v1, v2}, La/maq;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object v0

    .line 116
    :pswitch_0
    move-object/from16 v1, p1

    .line 117
    .line 118
    check-cast v1, Ljava/lang/Throwable;

    .line 119
    .line 120
    move-object/from16 v2, p2

    .line 121
    .line 122
    check-cast v2, Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    sget-object v1, La/caq;->a:La/caq;

    .line 131
    .line 132
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 136
    .line 137
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 138
    .line 139
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 147
    .line 148
    move-object v4, v2

    .line 149
    check-cast v4, La/oaq;

    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    const/16 v16, 0x0

    .line 155
    .line 156
    const/16 v17, 0xe7f

    .line 157
    .line 158
    const/4 v5, 0x0

    .line 159
    const/4 v6, 0x0

    .line 160
    const/4 v7, 0x0

    .line 161
    const/4 v8, 0x0

    .line 162
    const/4 v9, 0x0

    .line 163
    const/4 v10, 0x0

    .line 164
    const/4 v11, 0x0

    .line 165
    const/4 v12, 0x0

    .line 166
    const/4 v13, 0x1

    .line 167
    const/4 v14, 0x0

    .line 168
    const/4 v15, 0x0

    .line 169
    invoke-static/range {v4 .. v17}, La/oaq;->a(La/oaq;Ljava/util/List;ZLjava/lang/Integer;La/g9q;La/eb8;La/kcq;La/cev;ZZILa/wbq;ZI)La/oaq;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_5

    .line 178
    .line 179
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object v0

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
