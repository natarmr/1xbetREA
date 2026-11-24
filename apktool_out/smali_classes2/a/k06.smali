.class public final La/k06;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ouu;

.field public final b:La/x860;

.field public final c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(La/x860;Lkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    new-instance v0, La/ouu;

    .line 2
    .line 3
    invoke-direct {v0}, La/ouu;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/k06;->a:La/ouu;

    .line 10
    .line 11
    iput-object p1, p0, La/k06;->b:La/x860;

    .line 12
    .line 13
    iput-object p2, p0, La/k06;->c:Lkotlin/jvm/functions/Function2;

    .line 14
    .line 15
    return-void
.end method

.method public static a(La/k06;ZLa/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/j06;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/j06;

    .line 7
    .line 8
    iget v1, v0, La/j06;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/j06;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/j06;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/j06;-><init>(La/k06;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/j06;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/j06;->o:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v5, :cond_3

    .line 38
    .line 39
    if-eq v2, v4, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v6

    .line 50
    :cond_2
    :goto_1
    iget-object p0, v0, La/j06;->k:Ljava/util/List;

    .line 51
    .line 52
    iget-object p1, v0, La/j06;->j:La/xe60;

    .line 53
    .line 54
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto/16 :goto_4

    .line 58
    .line 59
    :cond_3
    iget-boolean p1, v0, La/j06;->l:Z

    .line 60
    .line 61
    iget-object p0, v0, La/j06;->j:La/xe60;

    .line 62
    .line 63
    iget-object v2, v0, La/j06;->i:La/k06;

    .line 64
    .line 65
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v7, p0

    .line 69
    move-object p0, v2

    .line 70
    goto :goto_2

    .line 71
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    iget-object p2, p0, La/k06;->a:La/ouu;

    .line 75
    .line 76
    iget-object p2, p2, La/ouu;->d:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p2, La/p7m0;

    .line 79
    .line 80
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    check-cast p2, Ljava/util/List;

    .line 85
    .line 86
    iget-object v2, p0, La/k06;->b:La/x860;

    .line 87
    .line 88
    if-eqz p1, :cond_5

    .line 89
    .line 90
    sget-object p2, La/iun;->a:La/iun;

    .line 91
    .line 92
    :cond_5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    new-instance v7, La/xe60;

    .line 96
    .line 97
    iget v2, v2, La/x860;->a:I

    .line 98
    .line 99
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    invoke-direct {v7, v2, p2}, La/xe60;-><init>(II)V

    .line 104
    .line 105
    .line 106
    iget-object p2, p0, La/k06;->c:Lkotlin/jvm/functions/Function2;

    .line 107
    .line 108
    iput-object p0, v0, La/j06;->i:La/k06;

    .line 109
    .line 110
    iput-object v7, v0, La/j06;->j:La/xe60;

    .line 111
    .line 112
    iput-boolean p1, v0, La/j06;->l:Z

    .line 113
    .line 114
    iput v5, v0, La/j06;->o:I

    .line 115
    .line 116
    invoke-interface {p2, v7, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p2

    .line 120
    if-ne p2, v1, :cond_6

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_6
    :goto_2
    check-cast p2, Ljava/util/List;

    .line 124
    .line 125
    if-eqz p1, :cond_8

    .line 126
    .line 127
    iget-object p0, p0, La/k06;->a:La/ouu;

    .line 128
    .line 129
    iput-object v6, v0, La/j06;->i:La/k06;

    .line 130
    .line 131
    iput-object v7, v0, La/j06;->j:La/xe60;

    .line 132
    .line 133
    iput-object p2, v0, La/j06;->k:Ljava/util/List;

    .line 134
    .line 135
    iput-boolean p1, v0, La/j06;->l:Z

    .line 136
    .line 137
    iput v4, v0, La/j06;->o:I

    .line 138
    .line 139
    invoke-virtual {p0, p2, v0}, La/ouu;->N(Ljava/util/List;La/zje;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    if-ne p0, v1, :cond_7

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_7
    move-object p0, p2

    .line 147
    move-object p1, v7

    .line 148
    goto :goto_4

    .line 149
    :cond_8
    iget-object p0, p0, La/k06;->a:La/ouu;

    .line 150
    .line 151
    iput-object v6, v0, La/j06;->i:La/k06;

    .line 152
    .line 153
    iput-object v7, v0, La/j06;->j:La/xe60;

    .line 154
    .line 155
    iput-object p2, v0, La/j06;->k:Ljava/util/List;

    .line 156
    .line 157
    iput-boolean p1, v0, La/j06;->l:Z

    .line 158
    .line 159
    iput v3, v0, La/j06;->o:I

    .line 160
    .line 161
    invoke-virtual {p0, p2, v0}, La/ouu;->g(Ljava/util/List;La/zje;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    if-ne p0, v1, :cond_7

    .line 166
    .line 167
    :goto_3
    return-object v1

    .line 168
    :goto_4
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    iget p1, p1, La/xe60;->a:I

    .line 173
    .line 174
    if-ge p0, p1, :cond_9

    .line 175
    .line 176
    goto :goto_5

    .line 177
    :cond_9
    const/4 v5, 0x0

    .line 178
    :goto_5
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    return-object p0
.end method
