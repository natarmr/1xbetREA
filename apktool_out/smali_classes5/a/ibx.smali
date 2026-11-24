.class public final La/ibx;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/i1w0;

.field public final c:Ljava/lang/String;

.field public final d:La/pyu;

.field public final e:La/iqt;

.field public final f:La/a6u;

.field public final g:La/m1e;

.field public final h:La/j1q0;

.field public final i:La/duj;

.field public final j:La/mne;

.field public k:La/c4m0;

.field public final l:La/p7m0;

.field public final m:La/ol60;


# direct methods
.method public constructor <init>(La/i1w0;Ljava/lang/String;La/pyu;La/iqt;La/a6u;La/m1e;La/j1q0;La/duj;La/mne;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, La/w46;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/ibx;->b:La/i1w0;

    .line 14
    .line 15
    iput-object p2, p0, La/ibx;->c:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p3, p0, La/ibx;->d:La/pyu;

    .line 18
    .line 19
    iput-object p4, p0, La/ibx;->e:La/iqt;

    .line 20
    .line 21
    iput-object p5, p0, La/ibx;->f:La/a6u;

    .line 22
    .line 23
    iput-object p6, p0, La/ibx;->g:La/m1e;

    .line 24
    .line 25
    iput-object p7, p0, La/ibx;->h:La/j1q0;

    .line 26
    .line 27
    iput-object p8, p0, La/ibx;->i:La/duj;

    .line 28
    .line 29
    iput-object p9, p0, La/ibx;->j:La/mne;

    .line 30
    .line 31
    sget-object p1, La/bbx;->a:La/bbx;

    .line 32
    .line 33
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, La/ibx;->l:La/p7m0;

    .line 38
    .line 39
    new-instance p1, La/ol60;

    .line 40
    .line 41
    sget-object p2, La/i99;->b:La/i99;

    .line 42
    .line 43
    const/4 p3, 0x1

    .line 44
    invoke-direct {p1, p3, p2}, La/ol60;-><init>(ILa/i99;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, La/ibx;->m:La/ol60;

    .line 48
    .line 49
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 50
    .line 51
    .line 52
    move-result-object p4

    .line 53
    iget-object p7, p9, La/mne;->a:La/rwj;

    .line 54
    .line 55
    new-instance p5, La/zax;

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    invoke-direct {p5, p0, p1}, La/zax;-><init>(La/ibx;B)V

    .line 59
    .line 60
    .line 61
    new-instance p8, La/gbx;

    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    invoke-direct {p8, p0, p1, p3}, La/gbx;-><init>(La/ibx;La/yje;B)V

    .line 65
    .line 66
    .line 67
    const/16 p9, 0xa

    .line 68
    .line 69
    const/4 p6, 0x0

    .line 70
    invoke-static/range {p4 .. p9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 71
    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final w(La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, La/hbx;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/hbx;

    .line 7
    .line 8
    iget v1, v0, La/hbx;->l:I

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
    iput v1, v0, La/hbx;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/hbx;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/hbx;-><init>(La/ibx;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/hbx;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/hbx;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v5, 0x2

    .line 34
    iget-object v6, p0, La/ibx;->c:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v5, :cond_1

    .line 41
    .line 42
    iget-object v0, v0, La/hbx;->i:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_5

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :cond_2
    iget-object v2, v0, La/hbx;->i:Ljava/lang/String;

    .line 56
    .line 57
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :catch_0
    move-exception p1

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string v2, ""

    .line 75
    .line 76
    if-eqz p1, :cond_4

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_9

    .line 83
    .line 84
    :cond_4
    const-string p1, "mailto"

    .line 85
    .line 86
    invoke-static {v6, p1, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    if-nez p1, :cond_9

    .line 91
    .line 92
    const-string p1, "tel"

    .line 93
    .line 94
    invoke-static {v6, p1, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    if-eqz p1, :cond_5

    .line 99
    .line 100
    goto :goto_6

    .line 101
    :cond_5
    :try_start_1
    iget-object p1, p0, La/ibx;->e:La/iqt;

    .line 102
    .line 103
    iget-object p1, p1, La/iqt;->a:La/gst0;

    .line 104
    .line 105
    invoke-virtual {p1}, La/gst0;->a()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_7

    .line 110
    .line 111
    iget-object p1, p0, La/ibx;->d:La/pyu;

    .line 112
    .line 113
    iput-object v2, v0, La/hbx;->i:Ljava/lang/String;

    .line 114
    .line 115
    iput v4, v0, La/hbx;->l:I

    .line 116
    .line 117
    iget-object p1, p1, La/pyu;->a:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p1, La/trm0;

    .line 120
    .line 121
    invoke-virtual {p1, v0}, La/trm0;->i(La/zje;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    if-ne p1, v1, :cond_6

    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_6
    :goto_1
    check-cast p1, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 129
    .line 130
    move-object v2, p1

    .line 131
    goto :goto_3

    .line 132
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 133
    .line 134
    .line 135
    :cond_7
    :goto_3
    iput-object v2, v0, La/hbx;->i:Ljava/lang/String;

    .line 136
    .line 137
    iput v5, v0, La/hbx;->l:I

    .line 138
    .line 139
    iget-object p1, p0, La/ibx;->f:La/a6u;

    .line 140
    .line 141
    invoke-virtual {p1, v3, v0}, La/a6u;->E(ZLa/zje;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-ne p1, v1, :cond_8

    .line 146
    .line 147
    :goto_4
    return-object v1

    .line 148
    :cond_8
    move-object v0, v2

    .line 149
    :goto_5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    new-instance v1, La/dbx;

    .line 165
    .line 166
    invoke-direct {v1, p1, v0}, La/dbx;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v1}, La/ibx;->x(La/fbx;)V

    .line 170
    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_9
    :goto_6
    new-instance p1, La/dbx;

    .line 174
    .line 175
    invoke-direct {p1, v6, v2}, La/dbx;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, p1}, La/ibx;->x(La/fbx;)V

    .line 179
    .line 180
    .line 181
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object p0
.end method

.method public final x(La/fbx;)V
    .locals 6

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, La/ibx;->j:La/mne;

    .line 6
    .line 7
    iget-object v3, v1, La/mne;->c:La/vs10;

    .line 8
    .line 9
    new-instance v1, La/h7w;

    .line 10
    .line 11
    const/16 v2, 0x19

    .line 12
    .line 13
    invoke-direct {v1, v2}, La/h7w;-><init>(B)V

    .line 14
    .line 15
    .line 16
    new-instance v4, La/u5u;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/16 v5, 0x14

    .line 20
    .line 21
    invoke-direct {v4, p0, p1, v2, v5}, La/u5u;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 22
    .line 23
    .line 24
    const/16 v5, 0xa

    .line 25
    .line 26
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 27
    .line 28
    .line 29
    return-void
.end method
