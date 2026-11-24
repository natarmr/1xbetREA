.class public final La/sou;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pru;


# direct methods
.method public constructor <init>(La/pru;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/sou;->a:La/pru;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(ZZ)La/lc00;
    .locals 7

    .line 1
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, La/sou;->a:La/pru;

    .line 6
    .line 7
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget-object v1, p0, La/sff0;->l:La/toc0;

    .line 12
    .line 13
    iget-object v2, p0, La/sff0;->V0:La/zuc0;

    .line 14
    .line 15
    sget-object v3, La/zuc0;->d:La/zuc0;

    .line 16
    .line 17
    sget-object v4, La/zuc0;->e:La/zuc0;

    .line 18
    .line 19
    filled-new-array {v3, v4}, [La/zuc0;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-interface {v4, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    sget-object v5, La/zuc0;->b:La/zuc0;

    .line 32
    .line 33
    filled-new-array {v3, v5}, [La/zuc0;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    iget-boolean v5, v1, La/toc0;->y:Z

    .line 46
    .line 47
    const/4 v6, 0x0

    .line 48
    if-eqz v5, :cond_0

    .line 49
    .line 50
    if-nez v3, :cond_0

    .line 51
    .line 52
    sget-object v3, La/soc0;->c:La/soc0;

    .line 53
    .line 54
    new-instance v5, La/etc0;

    .line 55
    .line 56
    invoke-direct {v5, v6, v2, v6, v3}, La/etc0;-><init>(ZLa/zuc0;ILa/soc0;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    :cond_0
    iget-boolean v3, v1, La/toc0;->g:Z

    .line 63
    .line 64
    if-eqz v3, :cond_1

    .line 65
    .line 66
    sget-object v3, La/soc0;->b:La/soc0;

    .line 67
    .line 68
    new-instance v5, La/etc0;

    .line 69
    .line 70
    invoke-direct {v5, v6, v2, v6, v3}, La/etc0;-><init>(ZLa/zuc0;ILa/soc0;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v5}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    :cond_1
    iget-boolean p0, p0, La/sff0;->U:Z

    .line 77
    .line 78
    if-eqz p0, :cond_2

    .line 79
    .line 80
    sget-object p0, La/soc0;->k:La/soc0;

    .line 81
    .line 82
    new-instance v3, La/etc0;

    .line 83
    .line 84
    invoke-direct {v3, v6, v2, v6, p0}, La/etc0;-><init>(ZLa/zuc0;ILa/soc0;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :cond_2
    iget-boolean p0, v1, La/toc0;->j:Z

    .line 91
    .line 92
    if-eqz p0, :cond_3

    .line 93
    .line 94
    sget-object p0, La/soc0;->d:La/soc0;

    .line 95
    .line 96
    new-instance v3, La/etc0;

    .line 97
    .line 98
    invoke-direct {v3, v6, v2, v6, p0}, La/etc0;-><init>(ZLa/zuc0;ILa/soc0;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v3}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    :cond_3
    if-eqz p1, :cond_4

    .line 105
    .line 106
    sget-object p0, La/soc0;->e:La/soc0;

    .line 107
    .line 108
    new-instance p1, La/etc0;

    .line 109
    .line 110
    invoke-direct {p1, v6, v2, v6, p0}, La/etc0;-><init>(ZLa/zuc0;ILa/soc0;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, p1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    :cond_4
    iget-boolean p0, v1, La/toc0;->l:Z

    .line 117
    .line 118
    if-eqz p0, :cond_5

    .line 119
    .line 120
    sget-object p0, La/soc0;->f:La/soc0;

    .line 121
    .line 122
    new-instance p1, La/etc0;

    .line 123
    .line 124
    invoke-direct {p1, v6, v2, v6, p0}, La/etc0;-><init>(ZLa/zuc0;ILa/soc0;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, p1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    :cond_5
    iget-boolean p0, v1, La/toc0;->b:Z

    .line 131
    .line 132
    if-eqz p0, :cond_6

    .line 133
    .line 134
    sget-object p0, La/soc0;->g:La/soc0;

    .line 135
    .line 136
    new-instance p1, La/etc0;

    .line 137
    .line 138
    invoke-direct {p1, v6, v2, v6, p0}, La/etc0;-><init>(ZLa/zuc0;ILa/soc0;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, p1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    :cond_6
    iget-boolean p0, v1, La/toc0;->m:Z

    .line 145
    .line 146
    if-eqz p0, :cond_7

    .line 147
    .line 148
    sget-object p0, La/soc0;->h:La/soc0;

    .line 149
    .line 150
    new-instance p1, La/etc0;

    .line 151
    .line 152
    invoke-direct {p1, v6, v2, v6, p0}, La/etc0;-><init>(ZLa/zuc0;ILa/soc0;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, p1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    :cond_7
    if-eqz v4, :cond_8

    .line 159
    .line 160
    if-eqz p2, :cond_8

    .line 161
    .line 162
    sget-object p0, La/soc0;->i:La/soc0;

    .line 163
    .line 164
    new-instance p1, La/etc0;

    .line 165
    .line 166
    invoke-direct {p1, v6, v2, v6, p0}, La/etc0;-><init>(ZLa/zuc0;ILa/soc0;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, p1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    :cond_8
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0
.end method
