.class public final synthetic La/pc30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:La/weu;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:La/qzt;

.field public final synthetic f:La/ctf0;

.field public final synthetic g:La/fhj;

.field public final synthetic h:La/wyu;

.field public final synthetic i:La/vzg0;


# direct methods
.method public synthetic constructor <init>(JLa/weu;Ljava/lang/String;La/qzt;La/ctf0;La/fhj;La/wyu;La/vzg0;B)V
    .locals 0

    .line 1
    iput-byte p10, p0, La/pc30;->a:B

    iput-wide p1, p0, La/pc30;->b:J

    iput-object p3, p0, La/pc30;->c:La/weu;

    iput-object p4, p0, La/pc30;->d:Ljava/lang/String;

    iput-object p5, p0, La/pc30;->e:La/qzt;

    iput-object p6, p0, La/pc30;->f:La/ctf0;

    iput-object p7, p0, La/pc30;->g:La/fhj;

    iput-object p8, p0, La/pc30;->h:La/wyu;

    iput-object p9, p0, La/pc30;->i:La/vzg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pc30;->a:B

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const-string v5, "CHECKED_CHIPS_ID_KEY"

    .line 9
    .line 10
    iget-object v6, v0, La/pc30;->i:La/vzg0;

    .line 11
    .line 12
    iget-object v7, v0, La/pc30;->h:La/wyu;

    .line 13
    .line 14
    iget-object v8, v0, La/pc30;->f:La/ctf0;

    .line 15
    .line 16
    iget-object v9, v0, La/pc30;->e:La/qzt;

    .line 17
    .line 18
    iget-object v10, v0, La/pc30;->c:La/weu;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    new-instance v11, La/hd30;

    .line 24
    .line 25
    iget-object v13, v0, La/pc30;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v10, v13}, La/weu;->a(Ljava/lang/String;)La/hdm0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v9}, La/qzt;->a()La/eme;

    .line 32
    .line 33
    .line 34
    move-result-object v9

    .line 35
    invoke-static {v1, v9, v8}, La/aem0;->x(La/hdm0;La/eme;La/ctf0;)La/zdm0;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v7}, La/wyu;->a()La/uaq0;

    .line 40
    .line 41
    .line 42
    move-result-object v16

    .line 43
    const-wide/16 v17, 0x0

    .line 44
    .line 45
    iget-object v12, v0, La/pc30;->g:La/fhj;

    .line 46
    .line 47
    iget-wide v14, v0, La/pc30;->b:J

    .line 48
    .line 49
    invoke-virtual/range {v12 .. v18}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move-wide v12, v14

    .line 54
    const-wide/16 v7, 0x4

    .line 55
    .line 56
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    const-wide/16 v8, 0x15

    .line 61
    .line 62
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    filled-new-array {v7, v8}, [Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-static {v7}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-interface {v7, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    xor-int/lit8 v20, v7, 0x1

    .line 83
    .line 84
    sget-object v21, La/iun;->a:La/iun;

    .line 85
    .line 86
    invoke-virtual {v6, v5}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    instance-of v6, v5, Ljava/lang/Long;

    .line 91
    .line 92
    if-eqz v6, :cond_0

    .line 93
    .line 94
    move-object v4, v5

    .line 95
    check-cast v4, Ljava/lang/Long;

    .line 96
    .line 97
    :cond_0
    if-eqz v4, :cond_1

    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    :cond_1
    move-wide/from16 v22, v2

    .line 104
    .line 105
    const/16 v16, 0x1

    .line 106
    .line 107
    const/16 v17, 0x1

    .line 108
    .line 109
    const/16 v18, 0x0

    .line 110
    .line 111
    const/16 v19, 0x0

    .line 112
    .line 113
    move-object v15, v0

    .line 114
    move-object v14, v1

    .line 115
    invoke-direct/range {v11 .. v23}, La/hd30;-><init>(JLa/zdm0;La/nc5;ZZZZZLjava/util/List;J)V

    .line 116
    .line 117
    .line 118
    return-object v11

    .line 119
    :pswitch_0
    new-instance v12, La/hc30;

    .line 120
    .line 121
    iget-object v14, v0, La/pc30;->d:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v10, v14}, La/weu;->a(Ljava/lang/String;)La/hdm0;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-virtual {v9}, La/qzt;->a()La/eme;

    .line 128
    .line 129
    .line 130
    move-result-object v9

    .line 131
    invoke-static {v1, v9, v8}, La/aem0;->x(La/hdm0;La/eme;La/ctf0;)La/zdm0;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v7}, La/wyu;->a()La/uaq0;

    .line 136
    .line 137
    .line 138
    move-result-object v17

    .line 139
    const-wide/16 v18, 0x0

    .line 140
    .line 141
    iget-object v13, v0, La/pc30;->g:La/fhj;

    .line 142
    .line 143
    iget-wide v7, v0, La/pc30;->b:J

    .line 144
    .line 145
    move-wide v15, v7

    .line 146
    invoke-virtual/range {v13 .. v19}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    sget-object v21, La/iun;->a:La/iun;

    .line 151
    .line 152
    invoke-virtual {v6, v5}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    instance-of v6, v5, Ljava/lang/Long;

    .line 157
    .line 158
    if-eqz v6, :cond_2

    .line 159
    .line 160
    move-object v4, v5

    .line 161
    check-cast v4, Ljava/lang/Long;

    .line 162
    .line 163
    :cond_2
    if-eqz v4, :cond_3

    .line 164
    .line 165
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 166
    .line 167
    .line 168
    move-result-wide v2

    .line 169
    :cond_3
    move-wide/from16 v22, v2

    .line 170
    .line 171
    const/16 v17, 0x1

    .line 172
    .line 173
    const/16 v18, 0x1

    .line 174
    .line 175
    const/16 v19, 0x0

    .line 176
    .line 177
    const/16 v20, 0x0

    .line 178
    .line 179
    move-wide v13, v15

    .line 180
    move-object/from16 v16, v0

    .line 181
    .line 182
    move-object v15, v1

    .line 183
    invoke-direct/range {v12 .. v23}, La/hc30;-><init>(JLa/zdm0;La/nc5;ZZZZLjava/util/List;J)V

    .line 184
    .line 185
    .line 186
    return-object v12

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
