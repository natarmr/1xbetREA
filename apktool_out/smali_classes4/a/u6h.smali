.class public final La/u6h;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/yje;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/u6h;->i:B

    iput-object p1, p0, La/u6h;->k:La/pz40;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(ZLa/pz40;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/u6h;->i:B

    iput-boolean p1, p0, La/u6h;->j:Z

    iput-object p2, p0, La/u6h;->k:La/pz40;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/u6h;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/u6h;->k:La/pz40;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/u6h;

    .line 9
    .line 10
    iget-boolean p0, p0, La/u6h;->j:Z

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    invoke-direct {p1, p0, v1, p2, v0}, La/u6h;-><init>(ZLa/pz40;La/yje;B)V

    .line 15
    .line 16
    .line 17
    return-object p1

    .line 18
    :pswitch_0
    new-instance p0, La/u6h;

    .line 19
    .line 20
    const/4 p1, 0x7

    .line 21
    invoke-direct {p0, v1, p2, p1}, La/u6h;-><init>(La/pz40;La/yje;B)V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_1
    new-instance p0, La/u6h;

    .line 26
    .line 27
    const/4 p1, 0x6

    .line 28
    invoke-direct {p0, v1, p2, p1}, La/u6h;-><init>(La/pz40;La/yje;B)V

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_2
    new-instance p0, La/u6h;

    .line 33
    .line 34
    const/4 p1, 0x5

    .line 35
    invoke-direct {p0, v1, p2, p1}, La/u6h;-><init>(La/pz40;La/yje;B)V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_3
    new-instance p0, La/u6h;

    .line 40
    .line 41
    const/4 p1, 0x4

    .line 42
    invoke-direct {p0, v1, p2, p1}, La/u6h;-><init>(La/pz40;La/yje;B)V

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_4
    new-instance p0, La/u6h;

    .line 47
    .line 48
    const/4 p1, 0x3

    .line 49
    invoke-direct {p0, v1, p2, p1}, La/u6h;-><init>(La/pz40;La/yje;B)V

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_5
    new-instance p0, La/u6h;

    .line 54
    .line 55
    const/4 v0, 0x2

    .line 56
    invoke-direct {p0, v1, p2, v0}, La/u6h;-><init>(La/pz40;La/yje;B)V

    .line 57
    .line 58
    .line 59
    check-cast p1, Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    iput-boolean p1, p0, La/u6h;->j:Z

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_6
    new-instance p0, La/u6h;

    .line 69
    .line 70
    const/4 v0, 0x1

    .line 71
    invoke-direct {p0, v1, p2, v0}, La/u6h;-><init>(La/pz40;La/yje;B)V

    .line 72
    .line 73
    .line 74
    check-cast p1, Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    iput-boolean p1, p0, La/u6h;->j:Z

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_7
    new-instance p1, La/u6h;

    .line 84
    .line 85
    iget-boolean p0, p0, La/u6h;->j:Z

    .line 86
    .line 87
    const/4 v0, 0x0

    .line 88
    invoke-direct {p1, p0, v1, p2, v0}, La/u6h;-><init>(ZLa/pz40;La/yje;B)V

    .line 89
    .line 90
    .line 91
    return-object p1

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/u6h;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/u6h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/u6h;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/u6h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/u6h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/u6h;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/u6h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/u6h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/u6h;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/u6h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/vne;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/u6h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/u6h;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/u6h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/vne;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/u6h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/u6h;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/u6h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/vne;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/u6h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/u6h;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/u6h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 111
    .line 112
    .line 113
    check-cast p2, La/yje;

    .line 114
    .line 115
    invoke-virtual {p0, p1, p2}, La/u6h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, La/u6h;

    .line 120
    .line 121
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    invoke-virtual {p0, p1}, La/u6h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 131
    .line 132
    .line 133
    check-cast p2, La/yje;

    .line 134
    .line 135
    invoke-virtual {p0, p1, p2}, La/u6h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    check-cast p0, La/u6h;

    .line 140
    .line 141
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    invoke-virtual {p0, p1}, La/u6h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    return-object p0

    .line 148
    :pswitch_7
    check-cast p1, La/vne;

    .line 149
    .line 150
    check-cast p2, La/yje;

    .line 151
    .line 152
    invoke-virtual {p0, p1, p2}, La/u6h;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    check-cast p0, La/u6h;

    .line 157
    .line 158
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    invoke-virtual {p0, p1}, La/u6h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/u6h;->i:B

    .line 2
    .line 3
    const-wide/16 v1, 0x3e8

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object v6, p0, La/u6h;->k:La/pz40;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, La/wne;->a:La/wne;

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    iget-boolean p0, p0, La/u6h;->j:Z

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    sget-object p0, La/fxa0;->c:La/fxa0;

    .line 24
    .line 25
    invoke-interface {v6, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget-boolean v1, p0, La/u6h;->j:Z

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v5, :cond_1

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, La/fxa0;

    .line 55
    .line 56
    sget-object v1, La/fxa0;->c:La/fxa0;

    .line 57
    .line 58
    if-ne p1, v1, :cond_4

    .line 59
    .line 60
    iput-boolean v5, p0, La/u6h;->j:Z

    .line 61
    .line 62
    const-wide/16 v1, 0x64

    .line 63
    .line 64
    invoke-static {v1, v2, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-ne p0, v0, :cond_3

    .line 69
    .line 70
    move-object v3, v0

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    :goto_0
    sget-object p0, La/fxa0;->b:La/fxa0;

    .line 73
    .line 74
    invoke-interface {v6, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    :goto_1
    return-object v3

    .line 80
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 81
    .line 82
    iget-boolean v7, p0, La/u6h;->j:Z

    .line 83
    .line 84
    if-eqz v7, :cond_6

    .line 85
    .line 86
    if-ne v7, v5, :cond_5

    .line 87
    .line 88
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    sget-object p1, La/wen;->b:La/uen;

    .line 100
    .line 101
    sget-object p1, La/bfn;->d:La/bfn;

    .line 102
    .line 103
    invoke-static {v1, v2, p1}, La/ibc;->w0(JLa/bfn;)J

    .line 104
    .line 105
    .line 106
    move-result-wide v1

    .line 107
    iput-boolean v5, p0, La/u6h;->j:Z

    .line 108
    .line 109
    invoke-static {v1, v2, p0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    if-ne p0, v0, :cond_7

    .line 114
    .line 115
    move-object v3, v0

    .line 116
    goto :goto_3

    .line 117
    :cond_7
    :goto_2
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-interface {v6, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    :goto_3
    return-object v3

    .line 125
    :pswitch_2
    sget-object v0, La/wne;->a:La/wne;

    .line 126
    .line 127
    iget-boolean v1, p0, La/u6h;->j:Z

    .line 128
    .line 129
    if-eqz v1, :cond_9

    .line 130
    .line 131
    if-ne v1, v5, :cond_8

    .line 132
    .line 133
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_8
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :goto_4
    sget p1, La/odq;->b:I

    .line 145
    .line 146
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, La/wen;

    .line 151
    .line 152
    iget-wide v1, p1, La/wen;->a:J

    .line 153
    .line 154
    sget-object p1, La/wen;->b:La/uen;

    .line 155
    .line 156
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    const-wide/16 v3, 0x0

    .line 160
    .line 161
    invoke-static {v1, v2, v3, v4}, La/wen;->c(JJ)I

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-lez p1, :cond_b

    .line 166
    .line 167
    sget-wide v1, La/odq;->a:J

    .line 168
    .line 169
    iput-boolean v5, p0, La/u6h;->j:Z

    .line 170
    .line 171
    invoke-static {v1, v2, p0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    if-ne p1, v0, :cond_a

    .line 176
    .line 177
    move-object v3, v0

    .line 178
    goto :goto_6

    .line 179
    :cond_a
    :goto_5
    sget p1, La/odq;->b:I

    .line 180
    .line 181
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    check-cast p1, La/wen;

    .line 186
    .line 187
    iget-wide v1, p1, La/wen;->a:J

    .line 188
    .line 189
    sget-wide v3, La/odq;->a:J

    .line 190
    .line 191
    invoke-static {v1, v2, v3, v4}, La/wen;->j(JJ)J

    .line 192
    .line 193
    .line 194
    move-result-wide v1

    .line 195
    new-instance p1, La/wen;

    .line 196
    .line 197
    invoke-direct {p1, v1, v2}, La/wen;-><init>(J)V

    .line 198
    .line 199
    .line 200
    invoke-interface {v6, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    goto :goto_4

    .line 204
    :cond_b
    new-instance p0, La/wen;

    .line 205
    .line 206
    invoke-direct {p0, v3, v4}, La/wen;-><init>(J)V

    .line 207
    .line 208
    .line 209
    invoke-interface {v6, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    :goto_6
    return-object v3

    .line 215
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 216
    .line 217
    iget-boolean v7, p0, La/u6h;->j:Z

    .line 218
    .line 219
    if-eqz v7, :cond_d

    .line 220
    .line 221
    if-ne v7, v5, :cond_c

    .line 222
    .line 223
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_c
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_d
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    sget-object p1, La/wen;->b:La/uen;

    .line 235
    .line 236
    sget-object p1, La/bfn;->d:La/bfn;

    .line 237
    .line 238
    invoke-static {v1, v2, p1}, La/ibc;->w0(JLa/bfn;)J

    .line 239
    .line 240
    .line 241
    move-result-wide v1

    .line 242
    iput-boolean v5, p0, La/u6h;->j:Z

    .line 243
    .line 244
    invoke-static {v1, v2, p0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    if-ne p0, v0, :cond_e

    .line 249
    .line 250
    move-object v3, v0

    .line 251
    goto :goto_8

    .line 252
    :cond_e
    :goto_7
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 253
    .line 254
    invoke-interface {v6, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    :goto_8
    return-object v3

    .line 260
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 261
    .line 262
    iget-boolean v7, p0, La/u6h;->j:Z

    .line 263
    .line 264
    if-eqz v7, :cond_10

    .line 265
    .line 266
    if-ne v7, v5, :cond_f

    .line 267
    .line 268
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    goto :goto_9

    .line 272
    :cond_f
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    goto :goto_a

    .line 276
    :cond_10
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    sget-object p1, La/wen;->b:La/uen;

    .line 280
    .line 281
    sget-object p1, La/bfn;->d:La/bfn;

    .line 282
    .line 283
    invoke-static {v1, v2, p1}, La/ibc;->w0(JLa/bfn;)J

    .line 284
    .line 285
    .line 286
    move-result-wide v1

    .line 287
    iput-boolean v5, p0, La/u6h;->j:Z

    .line 288
    .line 289
    invoke-static {v1, v2, p0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    if-ne p0, v0, :cond_11

    .line 294
    .line 295
    move-object v3, v0

    .line 296
    goto :goto_a

    .line 297
    :cond_11
    :goto_9
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 298
    .line 299
    invoke-interface {v6, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 300
    .line 301
    .line 302
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    :goto_a
    return-object v3

    .line 305
    :pswitch_5
    iget-boolean p0, p0, La/u6h;->j:Z

    .line 306
    .line 307
    sget-object v0, La/wne;->a:La/wne;

    .line 308
    .line 309
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 313
    .line 314
    .line 315
    move-result-object p0

    .line 316
    invoke-interface {v6, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    return-object p0

    .line 322
    :pswitch_6
    iget-boolean p0, p0, La/u6h;->j:Z

    .line 323
    .line 324
    sget-object v0, La/wne;->a:La/wne;

    .line 325
    .line 326
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    invoke-interface {v6, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 337
    .line 338
    return-object p0

    .line 339
    :pswitch_7
    sget-object v0, La/wne;->a:La/wne;

    .line 340
    .line 341
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    iget-boolean p0, p0, La/u6h;->j:Z

    .line 345
    .line 346
    if-eqz p0, :cond_12

    .line 347
    .line 348
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 349
    .line 350
    invoke-interface {v6, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    :cond_12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 354
    .line 355
    return-object p0

    .line 356
    nop

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
