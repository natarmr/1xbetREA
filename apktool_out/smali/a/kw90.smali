.class public final La/kw90;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/k050;

.field public j:La/lw90;

.field public k:J

.field public l:B

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/CharSequence;

.field public final synthetic o:J

.field public final synthetic p:La/lw90;


# direct methods
.method public constructor <init>(JLa/yje;La/lw90;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p5, p0, La/kw90;->n:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iput-wide p1, p0, La/kw90;->o:J

    .line 4
    .line 5
    iput-object p4, p0, La/kw90;->p:La/lw90;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/kw90;

    .line 2
    .line 3
    iget-wide v1, p0, La/kw90;->o:J

    .line 4
    .line 5
    iget-object v4, p0, La/kw90;->p:La/lw90;

    .line 6
    .line 7
    iget-object v5, p0, La/kw90;->n:Ljava/lang/CharSequence;

    .line 8
    .line 9
    move-object v3, p2

    .line 10
    invoke-direct/range {v0 .. v5}, La/kw90;-><init>(JLa/yje;La/lw90;Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, v0, La/kw90;->m:Ljava/lang/Object;

    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, La/jw90;->g(Ljava/lang/Object;)Landroid/view/textclassifier/TextClassifier;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, La/kw90;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, La/kw90;

    .line 12
    .line 13
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, La/kw90;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/kw90;->l:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    if-eq v1, v3, :cond_1

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    iget-wide v0, p0, La/kw90;->k:J

    .line 15
    .line 16
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v4

    .line 27
    :cond_1
    iget-wide v0, p0, La/kw90;->k:J

    .line 28
    .line 29
    iget-object v2, p0, La/kw90;->j:La/lw90;

    .line 30
    .line 31
    iget-object v3, p0, La/kw90;->i:La/k050;

    .line 32
    .line 33
    iget-object p0, p0, La/kw90;->m:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, La/l4q0;

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, La/kw90;->m:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v9, p1

    .line 47
    check-cast v9, Landroid/view/textclassifier/TextClassifier;

    .line 48
    .line 49
    new-instance p1, Landroid/view/textclassifier/TextSelection$Request$Builder;

    .line 50
    .line 51
    iget-wide v5, p0, La/kw90;->o:J

    .line 52
    .line 53
    invoke-static {v5, v6}, La/o9q0;->f(J)I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    invoke-static {v5, v6}, La/o9q0;->e(J)I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    new-instance v5, Landroid/view/textclassifier/TextSelection$Request$Builder;

    .line 62
    .line 63
    iget-object v6, p0, La/kw90;->n:Ljava/lang/CharSequence;

    .line 64
    .line 65
    invoke-direct {v5, v6, p1, v1}, Landroid/view/textclassifier/TextSelection$Request$Builder;-><init>(Ljava/lang/CharSequence;II)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, La/kw90;->p:La/lw90;

    .line 69
    .line 70
    invoke-virtual {p1}, La/lw90;->c()Landroid/os/LocaleList;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v5, v1}, Landroid/view/textclassifier/TextSelection$Request$Builder;->setDefaultLocales(Landroid/os/LocaleList;)Landroid/view/textclassifier/TextSelection$Request$Builder;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 79
    .line 80
    const/16 v7, 0x1f

    .line 81
    .line 82
    if-lt v5, v7, :cond_3

    .line 83
    .line 84
    invoke-static {v1}, La/tl50;->y(Landroid/view/textclassifier/TextSelection$Request$Builder;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    invoke-virtual {v1}, Landroid/view/textclassifier/TextSelection$Request$Builder;->build()Landroid/view/textclassifier/TextSelection$Request;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-interface {v9, v1}, Landroid/view/textclassifier/TextClassifier;->suggestSelection(Landroid/view/textclassifier/TextSelection$Request;)Landroid/view/textclassifier/TextSelection;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1}, Landroid/view/textclassifier/TextSelection;->getSelectionStartIndex()I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    invoke-virtual {v1}, Landroid/view/textclassifier/TextSelection;->getSelectionEndIndex()I

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    invoke-static {v8, v10}, La/s7n0;->e(II)J

    .line 104
    .line 105
    .line 106
    move-result-wide v10

    .line 107
    if-lt v5, v7, :cond_5

    .line 108
    .line 109
    invoke-static {v1}, La/tl50;->r(Landroid/view/textclassifier/TextSelection;)Landroid/view/textclassifier/TextClassification;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    if-eqz v5, :cond_5

    .line 114
    .line 115
    invoke-static {v1}, La/tl50;->r(Landroid/view/textclassifier/TextSelection;)Landroid/view/textclassifier/TextClassification;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v6, v10, v11, v1}, La/lw90;->b(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;)La/l4q0;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    iget-object v2, p1, La/lw90;->e:La/k050;

    .line 127
    .line 128
    iput-object v1, p0, La/kw90;->m:Ljava/lang/Object;

    .line 129
    .line 130
    iput-object v2, p0, La/kw90;->i:La/k050;

    .line 131
    .line 132
    iput-object p1, p0, La/kw90;->j:La/lw90;

    .line 133
    .line 134
    iput-wide v10, p0, La/kw90;->k:J

    .line 135
    .line 136
    iput-byte v3, p0, La/kw90;->l:B

    .line 137
    .line 138
    invoke-virtual {v2, p0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    if-ne p0, v0, :cond_4

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_4
    move-object p0, v1

    .line 146
    move-object v3, v2

    .line 147
    move-wide v0, v10

    .line 148
    move-object v2, p1

    .line 149
    :goto_0
    :try_start_0
    iget-object p1, v2, La/lw90;->g:La/pz40;

    .line 150
    .line 151
    check-cast p1, La/hgk0;

    .line 152
    .line 153
    invoke-virtual {p1, p0}, La/hgk0;->setValue(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 154
    .line 155
    .line 156
    invoke-interface {v3, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :catchall_0
    move-exception v0

    .line 161
    move-object p0, v0

    .line 162
    invoke-interface {v3, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    throw p0

    .line 166
    :cond_5
    iput-wide v10, p0, La/kw90;->k:J

    .line 167
    .line 168
    iput-byte v2, p0, La/kw90;->l:B

    .line 169
    .line 170
    iget-object v5, p0, La/kw90;->p:La/lw90;

    .line 171
    .line 172
    iget-object v6, p0, La/kw90;->n:Ljava/lang/CharSequence;

    .line 173
    .line 174
    move-wide v7, v10

    .line 175
    move-object v10, p0

    .line 176
    invoke-virtual/range {v5 .. v10}, La/lw90;->a(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;La/zje;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    if-ne p0, v0, :cond_6

    .line 181
    .line 182
    :goto_1
    return-object v0

    .line 183
    :cond_6
    move-wide v0, v7

    .line 184
    :goto_2
    new-instance p0, La/o9q0;

    .line 185
    .line 186
    invoke-direct {p0, v0, v1}, La/o9q0;-><init>(J)V

    .line 187
    .line 188
    .line 189
    return-object p0
.end method
