.class public final synthetic La/m3m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:Ljava/lang/Float;

.field public final synthetic b:La/x3m;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:La/t33;

.field public final synthetic g:La/pz40;

.field public final synthetic h:La/agk0;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Float;La/x3m;FFFLa/t33;La/pz40;La/agk0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/m3m;->a:Ljava/lang/Float;

    iput-object p2, p0, La/m3m;->b:La/x3m;

    iput p3, p0, La/m3m;->c:F

    iput p4, p0, La/m3m;->d:F

    iput p5, p0, La/m3m;->e:F

    iput-object p6, p0, La/m3m;->f:La/t33;

    iput-object p7, p0, La/m3m;->g:La/pz40;

    iput-object p8, p0, La/m3m;->h:La/agk0;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, La/m3m;->b:La/x3m;

    .line 2
    .line 3
    iget-object v1, v0, La/x3m;->d:La/rv2;

    .line 4
    .line 5
    check-cast p1, La/vj30;

    .line 6
    .line 7
    check-cast p2, La/pj30;

    .line 8
    .line 9
    check-cast p3, La/p4e;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, La/m3m;->a:Ljava/lang/Float;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    iget-object v4, p0, La/m3m;->g:La/pz40;

    .line 23
    .line 24
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Ljava/lang/Boolean;

    .line 29
    .line 30
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-nez v4, :cond_0

    .line 35
    .line 36
    invoke-virtual {v0}, La/x3m;->c()La/y3m;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    iget-object v5, v1, La/rv2;->e:La/zbk;

    .line 41
    .line 42
    invoke-virtual {v5}, La/zbk;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, La/y3m;

    .line 47
    .line 48
    if-ne v4, v5, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v2, v3

    .line 52
    :goto_0
    if-eqz v2, :cond_1

    .line 53
    .line 54
    :goto_1
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    goto :goto_3

    .line 59
    :cond_1
    iget-object v1, v1, La/rv2;->f:La/agk0;

    .line 60
    .line 61
    invoke-virtual {v1}, La/agk0;->l()F

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_2

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    move-object v2, v3

    .line 77
    :goto_2
    if-eqz v2, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {v0}, La/x3m;->c()La/y3m;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    const/4 v1, 0x1

    .line 91
    if-eq v0, v1, :cond_5

    .line 92
    .line 93
    const/4 v1, 0x2

    .line 94
    if-ne v0, v1, :cond_4

    .line 95
    .line 96
    iget v0, p0, La/m3m;->e:F

    .line 97
    .line 98
    goto :goto_3

    .line 99
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 100
    .line 101
    .line 102
    return-object v3

    .line 103
    :cond_5
    iget v0, p0, La/m3m;->d:F

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    iget v0, p0, La/m3m;->c:F

    .line 107
    .line 108
    :goto_3
    iget-object v1, p0, La/m3m;->h:La/agk0;

    .line 109
    .line 110
    invoke-virtual {v1}, La/agk0;->l()F

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    sub-float/2addr v1, v0

    .line 115
    iget-object p0, p0, La/m3m;->f:La/t33;

    .line 116
    .line 117
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, Ljava/lang/Number;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    add-float/2addr p0, v1

    .line 128
    const/4 v0, 0x0

    .line 129
    cmpg-float v1, p0, v0

    .line 130
    .line 131
    if-gez v1, :cond_7

    .line 132
    .line 133
    move p0, v0

    .line 134
    :cond_7
    float-to-int v4, p0

    .line 135
    iget-wide v0, p3, La/p4e;->a:J

    .line 136
    .line 137
    const/4 v3, 0x0

    .line 138
    const/4 v6, 0x3

    .line 139
    const/4 v2, 0x0

    .line 140
    move v5, v4

    .line 141
    invoke-static/range {v0 .. v6}, La/p4e;->b(JIIIII)J

    .line 142
    .line 143
    .line 144
    move-result-wide v0

    .line 145
    invoke-interface {p2, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    iget p2, p0, La/pu90;->a:I

    .line 150
    .line 151
    iget p3, p0, La/pu90;->b:I

    .line 152
    .line 153
    new-instance v0, La/y1;

    .line 154
    .line 155
    const/16 v1, 0x1d

    .line 156
    .line 157
    invoke-direct {v0, p0, v1}, La/y1;-><init>(La/pu90;B)V

    .line 158
    .line 159
    .line 160
    invoke-static {p1, p2, p3, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0
.end method
