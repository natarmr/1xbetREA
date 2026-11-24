.class public final synthetic La/c2d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/e2d;


# direct methods
.method public synthetic constructor <init>(La/e2d;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/c2d;->a:B

    iput-object p1, p0, La/c2d;->b:La/e2d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/c2d;->a:B

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object p0, p0, La/c2d;->b:La/e2d;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/e2d;->g:La/a8z;

    .line 13
    .line 14
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, La/l7m0;

    .line 19
    .line 20
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/lang/Number;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    sub-float/2addr v1, p0

    .line 31
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_0
    iget-object p0, p0, La/e2d;->g:La/a8z;

    .line 37
    .line 38
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, La/l7m0;

    .line 43
    .line 44
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    cmpg-float p0, p0, v1

    .line 55
    .line 56
    if-gez p0, :cond_0

    .line 57
    .line 58
    move v2, v3

    .line 59
    :cond_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :pswitch_1
    iget-object p0, p0, La/e2d;->g:La/a8z;

    .line 65
    .line 66
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, La/l7m0;

    .line 71
    .line 72
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    check-cast p0, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    const/4 v0, 0x0

    .line 83
    cmpl-float p0, p0, v0

    .line 84
    .line 85
    if-lez p0, :cond_1

    .line 86
    .line 87
    move v2, v3

    .line 88
    :cond_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :pswitch_2
    iget-object p0, p0, La/e2d;->a:La/oyq0;

    .line 94
    .line 95
    iget-object v0, p0, La/oyq0;->c:La/agk0;

    .line 96
    .line 97
    invoke-virtual {v0}, La/agk0;->l()F

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, La/oyq0;->a()F

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    const v0, 0x3f7d70a4    # 0.99f

    .line 105
    .line 106
    .line 107
    cmpl-float p0, p0, v0

    .line 108
    .line 109
    if-ltz p0, :cond_2

    .line 110
    .line 111
    move v2, v3

    .line 112
    :cond_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :pswitch_3
    iget-object p0, p0, La/e2d;->a:La/oyq0;

    .line 118
    .line 119
    iget-object v0, p0, La/oyq0;->c:La/agk0;

    .line 120
    .line 121
    invoke-virtual {v0}, La/agk0;->l()F

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, La/oyq0;->a()F

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :pswitch_4
    iget-object v0, p0, La/e2d;->d:La/pz40;

    .line 134
    .line 135
    check-cast v0, La/hgk0;

    .line 136
    .line 137
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 142
    .line 143
    new-instance v1, La/yw9;

    .line 144
    .line 145
    const/16 v2, 0x10

    .line 146
    .line 147
    invoke-direct {v1, v0, p0, v2}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 148
    .line 149
    .line 150
    return-object v1

    .line 151
    :pswitch_5
    new-instance v0, La/c2d;

    .line 152
    .line 153
    const/4 v1, 0x3

    .line 154
    invoke-direct {v0, p0, v1}, La/c2d;-><init>(La/e2d;B)V

    .line 155
    .line 156
    .line 157
    invoke-static {v0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    return-object p0

    .line 162
    :pswitch_6
    new-instance v0, La/c2d;

    .line 163
    .line 164
    const/4 v1, 0x4

    .line 165
    invoke-direct {v0, p0, v1}, La/c2d;-><init>(La/e2d;B)V

    .line 166
    .line 167
    .line 168
    invoke-static {v0}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    return-object p0

    .line 173
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
