.class public final La/lw90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hw90;


# instance fields
.field public final a:Lkotlin/coroutines/CoroutineContext;

.field public final b:Landroid/content/Context;

.field public final c:La/r4i0;

.field public final d:La/rs00;

.field public final e:La/k050;

.field public f:Landroid/view/textclassifier/TextClassifier;

.field public final g:La/pz40;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/CoroutineContext;Landroid/content/Context;La/r4i0;La/rs00;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/lw90;->a:Lkotlin/coroutines/CoroutineContext;

    .line 5
    .line 6
    iput-object p2, p0, La/lw90;->b:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, La/lw90;->c:La/r4i0;

    .line 9
    .line 10
    iput-object p4, p0, La/lw90;->d:La/rs00;

    .line 11
    .line 12
    new-instance p1, La/k050;

    .line 13
    .line 14
    invoke-direct {p1}, La/k050;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/lw90;->e:La/k050;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, La/lw90;->g:La/pz40;

    .line 25
    .line 26
    new-instance p1, Ljava/lang/Object;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, La/lw90;->h:Ljava/lang/Object;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassifier;La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p5, La/iw90;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/iw90;

    .line 7
    .line 8
    iget v1, v0, La/iw90;->o:I

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
    iput v1, v0, La/iw90;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/iw90;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/iw90;-><init>(La/lw90;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/iw90;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/iw90;->o:I

    .line 30
    .line 31
    iget-object v3, p0, La/lw90;->g:La/pz40;

    .line 32
    .line 33
    iget-object v4, p0, La/lw90;->e:La/k050;

    .line 34
    .line 35
    const/4 v5, 0x2

    .line 36
    const/4 v6, 0x1

    .line 37
    const/4 v7, 0x0

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v6, :cond_2

    .line 41
    .line 42
    if-ne v2, v5, :cond_1

    .line 43
    .line 44
    iget-object p0, v0, La/iw90;->j:Ljava/lang/Object;

    .line 45
    .line 46
    move-object v4, p0

    .line 47
    check-cast v4, La/i050;

    .line 48
    .line 49
    iget-object p0, v0, La/iw90;->i:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, La/l4q0;

    .line 52
    .line 53
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-object v7

    .line 64
    :cond_2
    iget-wide p2, v0, La/iw90;->l:J

    .line 65
    .line 66
    iget-object p1, v0, La/iw90;->k:La/k050;

    .line 67
    .line 68
    iget-object p4, v0, La/iw90;->j:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p4, Landroid/view/textclassifier/TextClassifier;

    .line 71
    .line 72
    iget-object v2, v0, La/iw90;->i:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Ljava/lang/CharSequence;

    .line 75
    .line 76
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    move-object p5, p4

    .line 80
    move-wide p3, p2

    .line 81
    move-object p2, p1

    .line 82
    move-object p1, v2

    .line 83
    goto :goto_1

    .line 84
    :cond_3
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iput-object p1, v0, La/iw90;->i:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object p4, v0, La/iw90;->j:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v4, v0, La/iw90;->k:La/k050;

    .line 92
    .line 93
    iput-wide p2, v0, La/iw90;->l:J

    .line 94
    .line 95
    iput v6, v0, La/iw90;->o:I

    .line 96
    .line 97
    invoke-virtual {v4, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p5

    .line 101
    if-ne p5, v1, :cond_4

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_4
    move-object p5, p4

    .line 105
    move-wide p3, p2

    .line 106
    move-object p2, v4

    .line 107
    :goto_1
    :try_start_0
    move-object v2, v3

    .line 108
    check-cast v2, La/hgk0;

    .line 109
    .line 110
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, La/l4q0;

    .line 115
    .line 116
    if-eqz v2, :cond_6

    .line 117
    .line 118
    iget-wide v8, v2, La/l4q0;->b:J

    .line 119
    .line 120
    invoke-static {p3, p4, v8, v9}, La/o9q0;->b(JJ)Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-eqz v8, :cond_5

    .line 125
    .line 126
    iget-object v2, v2, La/l4q0;->a:Ljava/lang/CharSequence;

    .line 127
    .line 128
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eqz v2, :cond_5

    .line 133
    .line 134
    move v2, v6

    .line 135
    goto :goto_2

    .line 136
    :cond_5
    const/4 v2, 0x0

    .line 137
    :goto_2
    if-ne v2, v6, :cond_6

    .line 138
    .line 139
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    .line 141
    invoke-interface {p2, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    return-object p0

    .line 145
    :catchall_0
    move-exception p0

    .line 146
    goto :goto_5

    .line 147
    :cond_6
    invoke-interface {p2, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    new-instance p2, Landroid/view/textclassifier/TextClassification$Request$Builder;

    .line 151
    .line 152
    invoke-static {p3, p4}, La/o9q0;->f(J)I

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    invoke-static {p3, p4}, La/o9q0;->e(J)I

    .line 157
    .line 158
    .line 159
    move-result v2

    .line 160
    new-instance v6, Landroid/view/textclassifier/TextClassification$Request$Builder;

    .line 161
    .line 162
    invoke-direct {v6, p1, p2, v2}, Landroid/view/textclassifier/TextClassification$Request$Builder;-><init>(Ljava/lang/CharSequence;II)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, La/lw90;->c()Landroid/os/LocaleList;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    invoke-virtual {v6, p2}, Landroid/view/textclassifier/TextClassification$Request$Builder;->setDefaultLocales(Landroid/os/LocaleList;)Landroid/view/textclassifier/TextClassification$Request$Builder;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-virtual {p2}, Landroid/view/textclassifier/TextClassification$Request$Builder;->build()Landroid/view/textclassifier/TextClassification$Request;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    invoke-interface {p5, p2}, Landroid/view/textclassifier/TextClassifier;->classifyText(Landroid/view/textclassifier/TextClassification$Request;)Landroid/view/textclassifier/TextClassification;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    invoke-virtual {p0, p1, p3, p4, p2}, La/lw90;->b(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;)La/l4q0;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    iput-object p0, v0, La/iw90;->i:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object v4, v0, La/iw90;->j:Ljava/lang/Object;

    .line 188
    .line 189
    iput-object v7, v0, La/iw90;->k:La/k050;

    .line 190
    .line 191
    iput v5, v0, La/iw90;->o:I

    .line 192
    .line 193
    invoke-virtual {v4, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    if-ne p1, v1, :cond_7

    .line 198
    .line 199
    :goto_3
    return-object v1

    .line 200
    :cond_7
    :goto_4
    :try_start_1
    check-cast v3, La/hgk0;

    .line 201
    .line 202
    invoke-virtual {v3, p0}, La/hgk0;->setValue(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 203
    .line 204
    .line 205
    invoke-interface {v4, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    return-object p0

    .line 211
    :catchall_1
    move-exception p0

    .line 212
    invoke-interface {v4, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    throw p0

    .line 216
    :goto_5
    invoke-interface {p2, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    throw p0
.end method

.method public final b(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;)La/l4q0;
    .locals 7

    .line 1
    invoke-static {p4}, La/o8m0;->j(Landroid/view/textclassifier/TextClassification;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    new-instance v6, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_3

    .line 16
    .line 17
    invoke-static {p4}, La/o8m0;->j(Landroid/view/textclassifier/TextClassification;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, La/jw90;->c(Ljava/lang/Object;)Landroid/app/RemoteAction;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const/4 v4, 0x0

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-static {v3}, La/uvk;->n(Landroid/app/RemoteAction;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    move-object v2, v4

    .line 40
    :cond_1
    :goto_1
    invoke-static {v2}, La/jw90;->c(Ljava/lang/Object;)Landroid/app/RemoteAction;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-static {v2}, La/um30;->g(Landroid/app/RemoteAction;)Landroid/graphics/drawable/Icon;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    iget-object v3, p0, La/lw90;->b:Landroid/content/Context;

    .line 53
    .line 54
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Icon;->loadDrawable(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    :cond_2
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    add-int/lit8 v1, v1, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    new-instance v1, La/l4q0;

    .line 65
    .line 66
    move-object v2, p1

    .line 67
    move-wide v3, p2

    .line 68
    move-object v5, p4

    .line 69
    invoke-direct/range {v1 .. v6}, La/l4q0;-><init>(Ljava/lang/CharSequence;JLandroid/view/textclassifier/TextClassification;Ljava/util/ArrayList;)V

    .line 70
    .line 71
    .line 72
    return-object v1
.end method

.method public final c()Landroid/os/LocaleList;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, La/lw90;->d:La/rs00;

    .line 3
    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    invoke-static {p0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/rs00;->a:Ljava/util/List;

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, La/qs00;

    .line 34
    .line 35
    iget-object v2, v2, La/qs00;->a:Ljava/util/Locale;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-array p0, v0, [Ljava/util/Locale;

    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, [Ljava/util/Locale;

    .line 48
    .line 49
    array-length v0, p0

    .line 50
    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, [Ljava/util/Locale;

    .line 55
    .line 56
    new-instance v0, Landroid/os/LocaleList;

    .line 57
    .line 58
    invoke-direct {v0, p0}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 59
    .line 60
    .line 61
    return-object v0

    .line 62
    :cond_1
    new-instance p0, Landroid/os/LocaleList;

    .line 63
    .line 64
    sget-object v1, La/wv90;->a:La/khf0;

    .line 65
    .line 66
    invoke-virtual {v1}, La/khf0;->u()La/rs00;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object v1, v1, La/rs00;->a:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, La/qs00;

    .line 77
    .line 78
    iget-object v0, v0, La/qs00;->a:Ljava/util/Locale;

    .line 79
    .line 80
    filled-new-array {v0}, [Ljava/util/Locale;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-direct {p0, v0}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    .line 85
    .line 86
    .line 87
    return-object p0
.end method
