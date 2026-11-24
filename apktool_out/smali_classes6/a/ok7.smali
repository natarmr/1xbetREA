.class public final synthetic La/ok7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w2d;


# direct methods
.method public synthetic constructor <init>(La/w2d;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ok7;->a:B

    iput-object p1, p0, La/ok7;->b:La/w2d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/ok7;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    const/high16 v4, 0x3f800000    # 1.0f

    .line 7
    .line 8
    iget-object p0, p0, La/ok7;->b:La/w2d;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/w2d;->a:La/x2d;

    .line 14
    .line 15
    invoke-virtual {p0}, La/x2d;->a()F

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    sub-float/2addr v4, p0

    .line 20
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :pswitch_0
    iget-object p0, p0, La/w2d;->a:La/x2d;

    .line 26
    .line 27
    invoke-virtual {p0}, La/x2d;->a()F

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    sub-float/2addr v4, p0

    .line 32
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0

    .line 37
    :pswitch_1
    iget-object p0, p0, La/w2d;->a:La/x2d;

    .line 38
    .line 39
    invoke-virtual {p0}, La/x2d;->a()F

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-static {p0, v1, v4}, La/l1e0;->c(FFF)F

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :pswitch_2
    iget-object p0, p0, La/w2d;->a:La/x2d;

    .line 53
    .line 54
    invoke-virtual {p0}, La/x2d;->a()F

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    const/high16 v0, 0x3f000000    # 0.5f

    .line 59
    .line 60
    sub-float/2addr p0, v0

    .line 61
    div-float/2addr p0, v0

    .line 62
    invoke-static {p0, v1, v4}, La/l1e0;->c(FFF)F

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0

    .line 71
    :pswitch_3
    iget-object p0, p0, La/w2d;->a:La/x2d;

    .line 72
    .line 73
    invoke-virtual {p0}, La/x2d;->a()F

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    sub-float/2addr v4, p0

    .line 78
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_4
    iget-object p0, p0, La/w2d;->a:La/x2d;

    .line 84
    .line 85
    iget-object v0, p0, La/x2d;->d:La/agk0;

    .line 86
    .line 87
    invoke-virtual {v0}, La/agk0;->l()F

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    iget-object p0, p0, La/x2d;->f:La/agk0;

    .line 92
    .line 93
    invoke-virtual {p0}, La/agk0;->l()F

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    cmpg-float p0, v0, p0

    .line 98
    .line 99
    if-nez p0, :cond_0

    .line 100
    .line 101
    move v2, v3

    .line 102
    :cond_0
    xor-int/lit8 p0, v2, 0x1

    .line 103
    .line 104
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    return-object p0

    .line 109
    :pswitch_5
    iget-object p0, p0, La/w2d;->a:La/x2d;

    .line 110
    .line 111
    iget-object v0, p0, La/x2d;->d:La/agk0;

    .line 112
    .line 113
    invoke-virtual {v0}, La/agk0;->l()F

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    iget-object p0, p0, La/x2d;->f:La/agk0;

    .line 118
    .line 119
    invoke-virtual {p0}, La/agk0;->l()F

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    cmpg-float p0, v0, p0

    .line 124
    .line 125
    if-nez p0, :cond_1

    .line 126
    .line 127
    move v2, v3

    .line 128
    :cond_1
    xor-int/lit8 p0, v2, 0x1

    .line 129
    .line 130
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0

    .line 135
    :pswitch_6
    iget-object p0, p0, La/w2d;->a:La/x2d;

    .line 136
    .line 137
    invoke-virtual {p0}, La/x2d;->a()F

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    sub-float/2addr v4, p0

    .line 142
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    return-object p0

    .line 147
    :pswitch_7
    iget-object p0, p0, La/w2d;->a:La/x2d;

    .line 148
    .line 149
    invoke-virtual {p0}, La/x2d;->a()F

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    cmpl-float p0, p0, v4

    .line 154
    .line 155
    if-ltz p0, :cond_2

    .line 156
    .line 157
    move v2, v3

    .line 158
    :cond_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    return-object p0

    .line 163
    :pswitch_8
    iget-object p0, p0, La/w2d;->a:La/x2d;

    .line 164
    .line 165
    invoke-virtual {p0}, La/x2d;->a()F

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    sub-float/2addr v4, p0

    .line 170
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
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
