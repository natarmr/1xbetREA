.class public final synthetic La/st2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rv2;


# direct methods
.method public synthetic constructor <init>(La/rv2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/st2;->a:B

    iput-object p1, p0, La/st2;->b:La/rv2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/st2;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/st2;->b:La/rv2;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/rv2;->d:La/pz40;

    .line 10
    .line 11
    check-cast p0, La/hgk0;

    .line 12
    .line 13
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/py20;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    invoke-virtual {p0}, La/rv2;->d()La/vtj;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object p0, p0, La/rv2;->e:La/zbk;

    .line 25
    .line 26
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance v1, Lkotlin/Pair;

    .line 31
    .line 32
    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object v1

    .line 36
    :pswitch_1
    invoke-virtual {p0}, La/rv2;->d()La/vtj;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_2
    iget-object v0, p0, La/rv2;->h:La/pz40;

    .line 42
    .line 43
    check-cast v0, La/hgk0;

    .line 44
    .line 45
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    iget-object v0, p0, La/rv2;->f:La/agk0;

    .line 52
    .line 53
    invoke-virtual {v0}, La/agk0;->l()F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object v1, p0, La/rv2;->c:La/pz40;

    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0}, La/rv2;->d()La/vtj;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v1, La/hgk0;

    .line 70
    .line 71
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v2, v3}, La/vtj;->d(Ljava/lang/Object;)F

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_1

    .line 84
    .line 85
    cmpg-float v2, v0, v2

    .line 86
    .line 87
    if-nez v2, :cond_0

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {p0}, La/rv2;->d()La/vtj;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0, v0}, La/vtj;->a(F)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    if-nez v0, :cond_3

    .line 99
    .line 100
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    goto :goto_1

    .line 105
    :cond_1
    :goto_0
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    goto :goto_1

    .line 110
    :cond_2
    check-cast v1, La/hgk0;

    .line 111
    .line 112
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    :cond_3
    :goto_1
    return-object v0

    .line 117
    :pswitch_3
    iget-object p0, p0, La/rv2;->f:La/agk0;

    .line 118
    .line 119
    invoke-virtual {p0}, La/agk0;->l()F

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    invoke-static {p0}, Landroidx/compose/runtime/e;->a(F)La/agk0;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    :pswitch_4
    iget-object v0, p0, La/rv2;->f:La/agk0;

    .line 129
    .line 130
    invoke-virtual {v0}, La/agk0;->l()F

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_4

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_4
    iget-object p0, p0, La/rv2;->f:La/agk0;

    .line 142
    .line 143
    invoke-virtual {p0}, La/agk0;->l()F

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    :goto_2
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    return-object p0

    .line 152
    :pswitch_5
    iget-object v0, p0, La/rv2;->f:La/agk0;

    .line 153
    .line 154
    invoke-virtual {v0}, La/agk0;->l()F

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_5

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_5
    iget-object p0, p0, La/rv2;->f:La/agk0;

    .line 166
    .line 167
    invoke-virtual {p0}, La/agk0;->l()F

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    :goto_3
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0

    .line 176
    :pswitch_6
    iget-object v0, p0, La/rv2;->f:La/agk0;

    .line 177
    .line 178
    invoke-virtual {v0}, La/agk0;->l()F

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-eqz v0, :cond_6

    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_6
    iget-object p0, p0, La/rv2;->f:La/agk0;

    .line 190
    .line 191
    invoke-virtual {p0}, La/agk0;->l()F

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    :goto_4
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    return-object p0

    .line 200
    nop

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
